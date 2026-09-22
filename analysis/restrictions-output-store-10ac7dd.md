# Restrictions output-store candidate trace

Focused v3 trace for the current strongest pivot: `10ac7dd [rax] = r14`, where `rax = [rsp+0x18]`. Also tracks late `[rsp+0x70]` and `[rsp+0x40]` consumers.

## Main output-store candidate `10ac7d5..10ac7e8`

```text
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
 10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac7eb:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac7f2:	00
 10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7f8:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac7ff:	00
 10ac800:	e8 8b 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac805:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10ac80c:	00
 10ac80d:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
 10ac812:	e8 d1 b6 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 10ac817:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10ac81c:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac821:	48 8b 00             	mov    rax,QWORD PTR [rax]
 10ac824:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]
 10ac82b:	00
 10ac82c:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
 10ac830:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
 10ac837:	00
 10ac838:	4c 89 f7             	mov    rdi,r14
 10ac83b:	e8 6c c9 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 10ac840:	48 8d 05 d1 53 3a ff 	lea    rax,[rip+0xffffffffff3a53d1]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 10ac847:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
 10ac84e:	00
 10ac84f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 10ac856:	00
 10ac857:	48 83 a4 24 c8 00 00 	and    QWORD PTR [rsp+0xc8],0x0
 10ac85e:	00 00
 10ac860:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ac867:	00
 10ac868:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 10ac86f:	00
 10ac870:	e8 2b d2 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 10ac875:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
 10ac87c:	00 00
 10ac87e:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 10ac885:	00 00
 10ac887:	6a 18                	push   0x18
 10ac889:	5f                   	pop    rdi
 10ac88a:	e8 71 16 74 00       	call   17edf00 <_Znwm@plt>
 10ac88f:	49 89 c7             	mov    r15,rax
 10ac892:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
 10ac899:	00
 10ac89a:	48 89 c7             	mov    rdi,rax
 10ac89d:	e8 fe d1 ac ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
 10ac8a2:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac8a9:	00
 10ac8aa:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
 10ac8ae:	48 8d 05 a3 1b b8 ff 	lea    rax,[rip+0xffffffffffb81ba3]        # c2e458 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b3f8>
 10ac8b5:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
 10ac8b9:	48 8d 05 a2 13 00 00 	lea    rax,[rip+0x13a2]        # 10adc62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275078>
 10ac8c0:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 10ac8c4:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
 10ac8cb:	00
 10ac8cc:	48 8b bc 24 c0 01 00 	mov    rdi,QWORD PTR [rsp+0x1c0]
 10ac8d3:	00
 10ac8d4:	4c 89 ea             	mov    rdx,r13
 10ac8d7:	e8 ac 4b 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 10ac8dc:	4c 89 ef             	mov    rdi,r13
 10ac8df:	e8 ba a9 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 10ac8e4:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ac8eb:	00
 10ac8ec:	e8 3f 61 ae ff       	call   b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>
 10ac8f1:	4c 89 f7             	mov    rdi,r14
```
## `[rsp+0x18]` refs in constructor

| addr | instruction |
|---:|---|
| `0x10aba97` | `10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0x10ac7d5` | `10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ac81c` | `10ac81c:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10acc0a` | `10acc0a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ad13e` | `10ad13e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10adbba` | `10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]` |

## `[rsp+0x18]` contexts

#### hit `0x10aba97`

```text
 10aba6f:	00
 10aba70:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
 10aba7b:	48 89 07             	mov    QWORD PTR [rdi],rax
 10aba7e:	48 8d 47 10          	lea    rax,[rdi+0x10]
 10aba82:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
 10aba89:	00
 10aba8a:	48 8d 47 18          	lea    rax,[rdi+0x18]
 10aba8e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 10aba93:	48 8d 47 40          	lea    rax,[rdi+0x40]
 10aba97:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10aba9c:	48 83 c7 48          	add    rdi,0x48
 10abaa0:	0f 57 c0             	xorps  xmm0,xmm0
 10abaa3:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 10abaa7:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 10abaab:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 10abaaf:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
 10abab4:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
 10abab9:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
 10abac0:	00
 10abac1:	e8 64 9c ab ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
 10abac6:	48 8d 43 58          	lea    rax,[rbx+0x58]
 10abaca:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 10abacf:	48 8d 43 60          	lea    rax,[rbx+0x60]
 10abad3:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
 10abad8:	48 8d 43 68          	lea    rax,[rbx+0x68]
 10abadc:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 10abae1:	48 8d 43 70          	lea    rax,[rbx+0x70]
```
#### hit `0x10ac7d5`

```text
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
 10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac7eb:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac7f2:	00
 10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7f8:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac7ff:	00
 10ac800:	e8 8b 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac805:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10ac80c:	00
 10ac80d:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
 10ac812:	e8 d1 b6 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 10ac817:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
```
#### hit `0x10ac81c`

```text
 10ac7f2:	00
 10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7f8:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac7ff:	00
 10ac800:	e8 8b 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac805:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10ac80c:	00
 10ac80d:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
 10ac812:	e8 d1 b6 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 10ac817:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10ac81c:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac821:	48 8b 00             	mov    rax,QWORD PTR [rax]
 10ac824:	4c 8d b4 24 d8 00 00 	lea    r14,[rsp+0xd8]
 10ac82b:	00
 10ac82c:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
 10ac830:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
 10ac837:	00
 10ac838:	4c 89 f7             	mov    rdi,r14
 10ac83b:	e8 6c c9 ac ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
 10ac840:	48 8d 05 d1 53 3a ff 	lea    rax,[rip+0xffffffffff3a53d1]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
 10ac847:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
 10ac84e:	00
 10ac84f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 10ac856:	00
 10ac857:	48 83 a4 24 c8 00 00 	and    QWORD PTR [rsp+0xc8],0x0
 10ac85e:	00 00
 10ac860:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ac867:	00
```
#### hit `0x10acc0a`

```text
 10acbe0:	e8 a3 48 71 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
 10acbe5:	4c 89 ef             	mov    rdi,r13
 10acbe8:	e8 b1 a6 9f ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
 10acbed:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10acbf4:	00
 10acbf5:	e8 36 5e ae ff       	call   b92a30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf9d0>
 10acbfa:	4c 89 f7             	mov    rdi,r14
 10acbfd:	e8 24 3f 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 10acc02:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10acc07:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10acc0a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10acc0f:	4c 8b 38             	mov    r15,QWORD PTR [rax]
 10acc12:	bf 48 01 00 00       	mov    edi,0x148
 10acc17:	e8 e4 12 74 00       	call   17edf00 <_Znwm@plt>
 10acc1c:	49 89 c6             	mov    r14,rax
 10acc1f:	48 8d 05 d2 ff 79 00 	lea    rax,[rip+0x79ffd2]        # 184cbf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92e0>
 10acc26:	49 89 06             	mov    QWORD PTR [r14],rax
 10acc29:	48 8d 05 50 00 7a 00 	lea    rax,[rip+0x7a0050]        # 184cc80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9368>
 10acc30:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acc34:	48 8d 05 6d 00 7a 00 	lea    rax,[rip+0x7a006d]        # 184cca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9390>
 10acc3b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
 10acc3f:	4c 8b a4 24 e0 01 00 	mov    r12,QWORD PTR [rsp+0x1e0]
 10acc46:	00
 10acc47:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12
 10acc4b:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acc4f:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15
 10acc53:	31 db                	xor    ebx,ebx
 10acc55:	41 88 5e 30          	mov    BYTE PTR [r14+0x30],bl
```
#### hit `0x10ad13e`

```text
 10ad116:	e8 34 e7 9c ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
 10ad11b:	89 44 24 38          	mov    DWORD PTR [rsp+0x38],eax
 10ad11f:	eb 08                	jmp    10ad129 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27453f>
 10ad121:	c7 44 24 38 00 00 00 	mov    DWORD PTR [rsp+0x38],0x0
 10ad128:	00
 10ad129:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad130:	00
 10ad131:	e8 fa 9b 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 10ad136:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 10ad13b:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10ad13e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ad143:	4c 8b 20             	mov    r12,QWORD PTR [rax]
 10ad146:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 10ad14b:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 10ad14e:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 10ad153:	4c 8b 38             	mov    r15,QWORD PTR [rax]
 10ad156:	bf 98 01 00 00       	mov    edi,0x198
 10ad15b:	e8 a0 0d 74 00       	call   17edf00 <_Znwm@plt>
 10ad160:	48 89 c5             	mov    rbp,rax
 10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]
 10ad168:	66 0f 6e c0          	movd   xmm0,eax
 10ad16c:	0f b6 44 24 07       	movzx  eax,BYTE PTR [rsp+0x7]
 10ad171:	66 0f 3a 20 c0 01    	pinsrb xmm0,eax,0x1
 10ad177:	0f b6 44 24 05       	movzx  eax,BYTE PTR [rsp+0x5]
 10ad17c:	66 0f 3a 20 c0 02    	pinsrb xmm0,eax,0x2
 10ad182:	0f b6 44 24 04       	movzx  eax,BYTE PTR [rsp+0x4]
 10ad187:	66 0f 3a 20 c0 03    	pinsrb xmm0,eax,0x3
 10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
```
#### hit `0x10adbba`

```text
 10adb8c:	00
 10adb8d:	e8 38 01 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10adb92:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10adb97:	e8 06 01 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10adb9c:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
 10adba1:	e8 82 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adba6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 10adbab:	e8 78 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbb0:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 10adbb5:	e8 c2 15 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 10adbbf:	e8 64 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbc4:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]
 10adbcb:	00
 10adbcc:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10adbd0:	e8 b1 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10adbd9:	e8 a8 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10adbe3:	e8 40 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbe8:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 10adbef:	00
 10adbf0:	e8 33 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbf5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10adbfc:	00 00
 10adbfe:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10adc05:	00
 10adc06:	75 08                	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
```
## `r14` provenance near output store

| addr | instruction |
|---:|---|
| `0x10ac6a1` | `10ac6a1:	41 5e                	pop    r14` |
| `0x10ac6ab` | `10ac6ab:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac6cb` | `10ac6cb:	4c 89 f2             	mov    rdx,r14` |
| `0x10ac6e6` | `10ac6e6:	49 89 c6             	mov    r14,rax` |
| `0x10ac74d` | `10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx` |
| `0x10ac758` | `10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx` |
| `0x10ac760` | `10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx` |
| `0x10ac768` | `10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x10ac776` | `10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx` |
| `0x10ac77a` | `10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x10ac77e` | `10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]` |
| `0x10ac78d` | `10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0` |
| `0x10ac792` | `10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0` |
| `0x10ac797` | `10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0` |
| `0x10ac79c` | `10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]` |
| `0x10ac7a3` | `10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x10ac7ac` | `10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100` |
| `0x10ac7b6` | `10ac7b6:	4c 89 f7             	mov    rdi,r14` |
| `0x10ac7dd` | `10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14` |

## `r14` local contexts near output store

#### hit `0x10ac6a1`

```text
 10ac674:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10ac678:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac67f:	00
 10ac680:	48 8d 94 24 b8 00 00 	lea    rdx,[rsp+0xb8]
 10ac687:	00
 10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10ac68d:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac691:	48 8d 35 18 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b018]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac698:	48 8d 0d 31 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b031]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac69f:	6a 11                	push   0x11
 10ac6a1:	41 5e                	pop    r14
 10ac6a3:	6a 12                	push   0x12
 10ac6a5:	41 58                	pop    r8
 10ac6a7:	6a 03                	push   0x3
 10ac6a9:	41 59                	pop    r9
 10ac6ab:	4c 89 f2             	mov    rdx,r14
 10ac6ae:	e8 77 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6b3:	89 c5                	mov    ebp,eax
 10ac6b5:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac6b9:	48 8d 35 30 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b030]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac6c0:	48 8d 0d 49 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b049]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac6c7:	6a 1f                	push   0x1f
 10ac6c9:	41 58                	pop    r8
 10ac6cb:	4c 89 f2             	mov    rdx,r14
 10ac6ce:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6d9:	41 89 c7             	mov    r15d,eax
 10ac6dc:	bf f8 00 00 00       	mov    edi,0xf8
```
#### hit `0x10ac6ab`

```text
 10ac688:	e8 2d 0a a0 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10ac68d:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac691:	48 8d 35 18 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b018]        # 3d76b0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2295>
 10ac698:	48 8d 0d 31 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b031]        # 3d76d0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22b5>
 10ac69f:	6a 11                	push   0x11
 10ac6a1:	41 5e                	pop    r14
 10ac6a3:	6a 12                	push   0x12
 10ac6a5:	41 58                	pop    r8
 10ac6a7:	6a 03                	push   0x3
 10ac6a9:	41 59                	pop    r9
 10ac6ab:	4c 89 f2             	mov    rdx,r14
 10ac6ae:	e8 77 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6b3:	89 c5                	mov    ebp,eax
 10ac6b5:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac6b9:	48 8d 35 30 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b030]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac6c0:	48 8d 0d 49 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b049]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac6c7:	6a 1f                	push   0x1f
 10ac6c9:	41 58                	pop    r8
 10ac6cb:	4c 89 f2             	mov    rdx,r14
 10ac6ce:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6d9:	41 89 c7             	mov    r15d,eax
 10ac6dc:	bf f8 00 00 00       	mov    edi,0xf8
 10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>
 10ac6e6:	49 89 c6             	mov    r14,rax
 10ac6e9:	49 63 c7             	movsxd rax,r15d
 10ac6ec:	48 63 cd             	movsxd rcx,ebp
 10ac6ef:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
```
#### hit `0x10ac6cb`

```text
 10ac6a7:	6a 03                	push   0x3
 10ac6a9:	41 59                	pop    r9
 10ac6ab:	4c 89 f2             	mov    rdx,r14
 10ac6ae:	e8 77 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6b3:	89 c5                	mov    ebp,eax
 10ac6b5:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 10ac6b9:	48 8d 35 30 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b030]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac6c0:	48 8d 0d 49 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b049]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac6c7:	6a 1f                	push   0x1f
 10ac6c9:	41 58                	pop    r8
 10ac6cb:	4c 89 f2             	mov    rdx,r14
 10ac6ce:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6d9:	41 89 c7             	mov    r15d,eax
 10ac6dc:	bf f8 00 00 00       	mov    edi,0xf8
 10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>
 10ac6e6:	49 89 c6             	mov    r14,rax
 10ac6e9:	49 63 c7             	movsxd rax,r15d
 10ac6ec:	48 63 cd             	movsxd rcx,ebp
 10ac6ef:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
 10ac6f6:	00
 10ac6f7:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ac6fe:	00
 10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx
 10ac703:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
 10ac70a:	00
 10ac70b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 10ac70f:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
```
#### hit `0x10ac6e6`

```text
 10ac6b9:	48 8d 35 30 b0 32 ff 	lea    rsi,[rip+0xffffffffff32b030]        # 3d76f0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22d5>
 10ac6c0:	48 8d 0d 49 b0 32 ff 	lea    rcx,[rip+0xffffffffff32b049]        # 3d7710 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f5>
 10ac6c7:	6a 1f                	push   0x1f
 10ac6c9:	41 58                	pop    r8
 10ac6cb:	4c 89 f2             	mov    rdx,r14
 10ac6ce:	41 b9 10 0e 00 00    	mov    r9d,0xe10
 10ac6d4:	e8 51 ad 53 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
 10ac6d9:	41 89 c7             	mov    r15d,eax
 10ac6dc:	bf f8 00 00 00       	mov    edi,0xf8
 10ac6e1:	e8 1a 18 74 00       	call   17edf00 <_Znwm@plt>
 10ac6e6:	49 89 c6             	mov    r14,rax
 10ac6e9:	49 63 c7             	movsxd rax,r15d
 10ac6ec:	48 63 cd             	movsxd rcx,ebp
 10ac6ef:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
 10ac6f6:	00
 10ac6f7:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
 10ac6fe:	00
 10ac6ff:	49 89 57 10          	mov    QWORD PTR [r15+0x10],rdx
 10ac703:	0f 28 84 24 d0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xd0]
 10ac70a:	00
 10ac70b:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
 10ac70f:	48 83 a4 24 e0 00 00 	and    QWORD PTR [rsp+0xe0],0x0
 10ac716:	00 00
 10ac718:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
 10ac71f:	00
 10ac720:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
 10ac725:	0f 57 c9             	xorps  xmm1,xmm1
 10ac728:	0f 29 8c 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm1
```
#### hit `0x10ac74d`

```text
 10ac71f:	00
 10ac720:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
 10ac725:	0f 57 c9             	xorps  xmm1,xmm1
 10ac728:	0f 29 8c 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm1
 10ac72f:	00
 10ac730:	48 8d 15 a9 b6 92 ff 	lea    rdx,[rip+0xffffffffff92b6a9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx
 10ac73b:	48 8d 15 ea 14 00 00 	lea    rdx,[rip+0x14ea]        # 10adc2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275042>
 10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx
 10ac746:	48 8d 15 43 06 7a 00 	lea    rdx,[rip+0x7a0643]        # 184cd90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9478>
 10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx
 10ac750:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
 10ac757:	00
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
```
#### hit `0x10ac758`

```text
 10ac728:	0f 29 8c 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm1
 10ac72f:	00
 10ac730:	48 8d 15 a9 b6 92 ff 	lea    rdx,[rip+0xffffffffff92b6a9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx
 10ac73b:	48 8d 15 ea 14 00 00 	lea    rdx,[rip+0x14ea]        # 10adc2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275042>
 10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx
 10ac746:	48 8d 15 43 06 7a 00 	lea    rdx,[rip+0x7a0643]        # 184cd90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9478>
 10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx
 10ac750:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
 10ac757:	00
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
```
#### hit `0x10ac760`

```text
 10ac730:	48 8d 15 a9 b6 92 ff 	lea    rdx,[rip+0xffffffffff92b6a9]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx
 10ac73b:	48 8d 15 ea 14 00 00 	lea    rdx,[rip+0x14ea]        # 10adc2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275042>
 10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx
 10ac746:	48 8d 15 43 06 7a 00 	lea    rdx,[rip+0x7a0643]        # 184cd90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9478>
 10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx
 10ac750:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
 10ac757:	00
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
```
#### hit `0x10ac768`

```text
 10ac73b:	48 8d 15 ea 14 00 00 	lea    rdx,[rip+0x14ea]        # 10adc2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275042>
 10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx
 10ac746:	48 8d 15 43 06 7a 00 	lea    rdx,[rip+0x7a0643]        # 184cd90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9478>
 10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx
 10ac750:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
 10ac757:	00
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
```
#### hit `0x10ac776`

```text
 10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx
 10ac750:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
 10ac757:	00
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
```
#### hit `0x10ac77a`

```text
 10ac750:	48 8b 94 24 c0 01 00 	mov    rdx,QWORD PTR [rsp+0x1c0]
 10ac757:	00
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
```
#### hit `0x10ac77e`

```text
 10ac757:	00
 10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
 10ac75c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
 10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
```
#### hit `0x10ac78d`

```text
 10ac764:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
```
#### hit `0x10ac792`

```text
 10ac768:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
```
#### hit `0x10ac797`

```text
 10ac76d:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
```
#### hit `0x10ac79c`

```text
 10ac772:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
 10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
```
#### hit `0x10ac7a3`

```text
 10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx
 10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
 10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]
```
#### hit `0x10ac7ac`

```text
 10ac77e:	49 8d 7e 38          	lea    rdi,[r14+0x38]
 10ac782:	4c 89 ee             	mov    rsi,r13
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
 10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac7eb:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac7f2:	00
```
#### hit `0x10ac7b6`

```text
 10ac785:	e8 3c 3e 00 00       	call   10b05c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2779dc>
 10ac78a:	0f 57 c0             	xorps  xmm0,xmm0
 10ac78d:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
 10ac792:	41 0f 11 46 68       	movups XMMWORD PTR [r14+0x68],xmm0
 10ac797:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
 10ac79c:	49 8d be 88 00 00 00 	lea    rdi,[r14+0x88]
 10ac7a3:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
 10ac7a7:	e8 16 4f 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ac7ac:	66 41 c7 86 98 00 00 	mov    WORD PTR [r14+0x98],0x100
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
 10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac7eb:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac7f2:	00
 10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7f8:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
```
#### hit `0x10ac7dd`

```text
 10ac7b3:	00 00 01
 10ac7b6:	4c 89 f7             	mov    rdi,r14
 10ac7b9:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
 10ac7c0:	e8 c9 ba a7 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
 10ac7c5:	4c 89 ef             	mov    rdi,r13
 10ac7c8:	e8 6f 14 00 00       	call   10adc3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275052>
 10ac7cd:	4c 89 ff             	mov    rdi,r15
 10ac7d0:	e8 bb 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 10ac7da:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14
 10ac7e0:	48 85 ff             	test   rdi,rdi
 10ac7e3:	74 06                	je     10ac7eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273c01>
 10ac7e5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ac7eb:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ac7f2:	00
 10ac7f3:	e8 98 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac7f8:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ac7ff:	00
 10ac800:	e8 8b 16 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ac805:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10ac80c:	00
 10ac80d:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
 10ac812:	e8 d1 b6 ab ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
 10ac817:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
 10ac81c:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
```
## Late `[rsp+0x70]` consumers

```text
 10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10ad62d:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
 10ad634:	00
 10ad635:	0f 57 c9             	xorps  xmm1,xmm1
 10ad638:	0f 29 8c 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm1
 10ad63f:	00
 10ad640:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
 10ad645:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
 10ad64b:	e8 36 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad650:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
 10ad657:	00
 10ad658:	e8 29 0e 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad65d:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad664:	00
 10ad665:	e8 c0 06 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad66a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10ad66e:	48 89 ef             	mov    rdi,rbp
 10ad671:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
 10ad676:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]
 10ad67c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 10ad67f:	48 89 df             	mov    rdi,rbx
 10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10ad685:	6a 48                	push   0x48
 10ad687:	5f                   	pop    rdi
 10ad688:	e8 73 08 74 00       	call   17edf00 <_Znwm@plt>
 10ad68d:	48 8d 0d f4 03 7a 00 	lea    rcx,[rip+0x7a03f4]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>
 10ad694:	48 89 08             	mov    QWORD PTR [rax],rcx
 10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
 10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
 10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
 10ad6a8:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
 10ad6b1:	48 89 58 28          	mov    QWORD PTR [rax+0x28],rbx
 10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]
 10ad6bc:	00
 10ad6bd:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
 10ad6c1:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 10ad6c6:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
 10ad6ca:	c6 40 40 01          	mov    BYTE PTR [rax+0x40],0x1
 10ad6ce:	48 8b 8c 24 98 00 00 	mov    rcx,QWORD PTR [rsp+0x98]
 10ad6d5:	00
 10ad6d6:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
 10ad6d9:	48 89 01             	mov    QWORD PTR [rcx],rax
 10ad6dc:	48 85 ff             	test   rdi,rdi
 10ad6df:	74 06                	je     10ad6e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274afd>
 10ad6e1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10ad6e7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10ad6ee:	00 00
 10ad6f0:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10ad6f7:	00
 10ad6f8:	0f 85 12 05 00 00    	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10ad6fe:	48 81 c4 58 01 00 00 	add    rsp,0x158
 10ad705:	5b                   	pop    rbx
 10ad706:	41 5c                	pop    r12
 10ad708:	41 5d                	pop    r13
 10ad70a:	41 5e                	pop    r14
 10ad70c:	41 5f                	pop    r15
 10ad70e:	5d                   	pop    rbp
 10ad70f:	c3                   	ret
 10ad710:	48 89 c3             	mov    rbx,rax
 10ad713:	e9 16 04 00 00       	jmp    10adb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f44>
 10ad718:	e9 23 01 00 00       	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad71d:	e9 06 01 00 00       	jmp    10ad828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c3e>
 10ad722:	e9 19 01 00 00       	jmp    10ad840 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c56>
 10ad727:	48 89 c3             	mov    rbx,rax
 10ad72a:	e9 da 03 00 00       	jmp    10adb09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1f>
 10ad72f:	e9 03 02 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad734:	48 89 c3             	mov    rbx,rax
 10ad737:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ad73e:	00
 10ad73f:	e8 4c 07 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad744:	eb 21                	jmp    10ad767 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b7d>
 10ad746:	48 89 c3             	mov    rbx,rax
 10ad749:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad750:	00
 10ad751:	e8 d4 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad756:	4d 89 fe             	mov    r14,r15
 10ad759:	49 8b 7f 28          	mov    rdi,QWORD PTR [r15+0x28]
 10ad75d:	e8 24 0d 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad762:	eb 1b                	jmp    10ad77f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b95>
 10ad764:	48 89 c3             	mov    rbx,rax
 10ad767:	e9 fb 00 00 00       	jmp    10ad867 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c7d>
 10ad76c:	4d 89 fe             	mov    r14,r15
 10ad76f:	48 89 c3             	mov    rbx,rax
 10ad772:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad779:	00
 10ad77a:	e8 ab 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad77f:	4c 89 f7             	mov    rdi,r14
 10ad782:	e8 99 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad787:	e9 c3 03 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>
 10ad78c:	e9 a6 01 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad791:	48 89 c3             	mov    rbx,rax
 10ad794:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad79b:	00
 10ad79c:	e8 89 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad7a1:	4d 89 fe             	mov    r14,r15
 10ad7a4:	49 8b 7f 40          	mov    rdi,QWORD PTR [r15+0x40]
 10ad7a8:	e8 d9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad7ad:	eb 13                	jmp    10ad7c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274bd8>
 10ad7af:	4d 89 fe             	mov    r14,r15
 10ad7b2:	48 89 c3             	mov    rbx,rax
 10ad7b5:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad7bc:	00
 10ad7bd:	e8 68 05 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad7c2:	4c 89 f7             	mov    rdi,r14
 10ad7c5:	e8 56 07 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad7ca:	e9 8b 03 00 00       	jmp    10adb5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f70>
 10ad7cf:	eb 00                	jmp    10ad7d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274be7>
 10ad7d1:	48 89 c3             	mov    rbx,rax
 10ad7d4:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
 10ad7d8:	e8 a9 0c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ad7dd:	4c 89 ff             	mov    rdi,r15
 10ad7e0:	e8 17 1e 9f ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
 10ad7e5:	eb 2d                	jmp    10ad814 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c2a>
 10ad7e7:	e9 1a 03 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad7ec:	48 89 c3             	mov    rbx,rax
 10ad7ef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad7f6:	00
 10ad7f7:	e8 ec cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad7fc:	4c 89 ef             	mov    rdi,r13
 10ad7ff:	e8 42 3f 71 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
```
```text
 10adae7:	e9 8c 00 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10adaec:	48 89 c3             	mov    rbx,rax
 10adaef:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10adaf6:	00
 10adaf7:	e8 94 03 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10adafc:	eb 7a                	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10adafe:	48 89 c3             	mov    rbx,rax
 10adb01:	e9 b4 00 00 00       	jmp    10adbba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274fd0>
 10adb06:	48 89 c3             	mov    rbx,rax
 10adb09:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
 10adb10:	00
 10adb11:	e8 10 30 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
 10adb16:	eb 2c                	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
 10adb18:	48 89 c3             	mov    rbx,rax
 10adb1b:	48 83 7c 24 08 00    	cmp    QWORD PTR [rsp+0x8],0x0
 10adb21:	74 0b                	je     10adb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f44>
 10adb23:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 10adb28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb2b:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10adb2e:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10adb31:	4c 89 f7             	mov    rdi,r14
 10adb34:	ff 50 10             	call   QWORD PTR [rax+0x10]
 10adb37:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
 10adb3b:	48 89 ef             	mov    rdi,rbp
 10adb3e:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]
 10adb44:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 10adb49:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb4c:	ff 50 40             	call   QWORD PTR [rax+0x40]
 10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
 10adb54:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]
 10adb5a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 10adb5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb62:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10adb65:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
 10adb6c:	00
 10adb6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10adb70:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10adb73:	eb 03                	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10adb75:	48 89 c3             	mov    rbx,rax
 10adb78:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
 10adb7f:	00
 10adb80:	e8 6d 01 00 00       	call   10adcf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275108>
 10adb85:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
 10adb8c:	00
 10adb8d:	e8 38 01 00 00       	call   10adcca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750e0>
 10adb92:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10adb97:	e8 06 01 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10adb9c:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
 10adba1:	e8 82 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adba6:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 10adbab:	e8 78 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbb0:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 10adbb5:	e8 c2 15 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 10adbbf:	e8 64 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbc4:	4c 8b b4 24 a0 00 00 	mov    r14,QWORD PTR [rsp+0xa0]
 10adbcb:	00
 10adbcc:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 10adbd0:	e8 b1 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbd5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 10adbd9:	e8 a8 08 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10adbde:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 10adbe3:	e8 40 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbe8:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
 10adbef:	00
 10adbf0:	e8 33 c2 9c ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 10adbf5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10adbfc:	00 00
 10adbfe:	48 3b 84 24 50 01 00 	cmp    rax,QWORD PTR [rsp+0x150]
 10adc05:	00
 10adc06:	75 08                	jne    10adc10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275026>
 10adc08:	48 89 df             	mov    rdi,rbx
 10adc0b:	e8 c0 20 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10adc10:	e8 9b 1e 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10adc15:	cc                   	int3
 10adc16:	53                   	push   rbx
 10adc17:	48 89 fb             	mov    rbx,rdi
 10adc1a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 10adc1d:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
 10adc21:	e8 94 f4 9f ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
 10adc26:	48 89 d8             	mov    rax,rbx
 10adc29:	5b                   	pop    rbx
 10adc2a:	c3                   	ret
 10adc2b:	cc                   	int3
 10adc2c:	50                   	push   rax
 10adc2d:	e8 4c 60 3d 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 10adc32:	59                   	pop    rcx
 10adc33:	c3                   	ret
 10adc34:	48 89 c7             	mov    rdi,rax
 10adc37:	e8 69 be 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10adc3c:	53                   	push   rbx
 10adc3d:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
 10adc41:	48 85 c0             	test   rax,rax
 10adc44:	74 11                	je     10adc57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27506d>
 10adc46:	48 89 fb             	mov    rbx,rdi
 10adc49:	31 ff                	xor    edi,edi
 10adc4b:	48 89 de             	mov    rsi,rbx
 10adc4e:	31 d2                	xor    edx,edx
 10adc50:	ff d0                	call   rax
 10adc52:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 10adc57:	5b                   	pop    rbx
 10adc58:	c3                   	ret
```
### `[rsp+0x70]` all refs

| addr | instruction |
|---:|---|
| `0x10ac454` | `10ac454:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15` |
| `0x10ac47f` | `10ac47f:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0x10ad69b` | `10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]` |
| `0x10adb4f` | `10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |

## Late `[rsp+0x40]` receiver calls

### around `0x10acd33`

```text
 10accca:	e8 6f cd 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10acccf:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
 10accd3:	e8 ae 17 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10accd8:	4c 89 ff             	mov    rdi,r15
 10accdb:	e8 08 db 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10acce0:	41 88 9e e8 00 00 00 	mov    BYTE PTR [r14+0xe8],bl
 10acce7:	0f 57 c0             	xorps  xmm0,xmm0
 10accea:	41 0f 11 86 f0 00 00 	movups XMMWORD PTR [r14+0xf0],xmm0
 10accf1:	00
 10accf2:	41 0f 11 86 00 01 00 	movups XMMWORD PTR [r14+0x100],xmm0
 10accf9:	00
 10accfa:	41 c7 86 10 01 00 00 	mov    DWORD PTR [r14+0x110],0x3f800000
 10acd01:	00 00 80 3f
 10acd05:	41 0f 11 86 18 01 00 	movups XMMWORD PTR [r14+0x118],xmm0
 10acd0c:	00
 10acd0d:	41 0f 11 86 28 01 00 	movups XMMWORD PTR [r14+0x128],xmm0
 10acd14:	00
 10acd15:	41 0f 11 86 38 01 00 	movups XMMWORD PTR [r14+0x138],xmm0
 10acd1c:	00
 10acd1d:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd22:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14
 10acd28:	48 85 ff             	test   rdi,rdi
 10acd2b:	74 06                	je     10acd33 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274149>
 10acd2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acd30:	ff 50 08             	call   QWORD PTR [rax+0x8]
 10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acd38:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acd3e:	49 89 c6             	mov    r14,rax
 10acd41:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10acd49:	6a 50                	push   0x50
 10acd4b:	5f                   	pop    rdi
 10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>
 10acd51:	48 8d 0d b8 01 7a 00 	lea    rcx,[rip+0x7a01b8]        # 184cf10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x95f8>
 10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx
 10acd5b:	48 8d 0d 5e 02 7a 00 	lea    rcx,[rip+0x7a025e]        # 184cfc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96a8>
 10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
 10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 10acd6e:	48 8b 9c 24 e8 01 00 	mov    rbx,QWORD PTR [rsp+0x1e8]
 10acd75:	00
 10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
 10acd7a:	0f 57 c0             	xorps  xmm0,xmm0
 10acd7d:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10acd81:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10acd85:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
 10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10acd93:	00
 10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0
 10acd98:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10acd9d:	48 89 c6             	mov    rsi,rax
 10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10acda5:	4c 89 f7             	mov    rdi,r14
 10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdb8:	49 89 c7             	mov    r15,rax
 10acdbb:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
 10acdc2:	00
 10acdc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdc9:	49 89 c5             	mov    r13,rax
 10acdcc:	bf c8 00 00 00       	mov    edi,0xc8
 10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>
 10acdd6:	49 89 c6             	mov    r14,rax
 10acdd9:	48 8d 05 30 fd 79 00 	lea    rax,[rip+0x79fd30]        # 184cb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x91f8>
 10acde0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acde3:	48 8d 05 de fd 79 00 	lea    rax,[rip+0x79fdde]        # 184cbc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92b0>
 10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
 10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]
 10acdfe:	0f 57 c0             	xorps  xmm0,xmm0
 10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
 10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000
 10ace12:	3f
 10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]
 10ace17:	48 89 ef             	mov    rdi,rbp
 10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
 10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]
 10ace26:	4c 89 ef             	mov    rdi,r13
 10ace29:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 10ace30:	00
 10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ace36:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ace3d:	00
 10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14
 10ace41:	48 8d 35 49 02 9f ff 	lea    rsi,[rip+0xffffffffff9f0249]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ace48:	48 8d 0d 5f 15 00 00 	lea    rcx,[rip+0x155f]        # 10ae3ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757c4>
 10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ace56:	00
```
### around `0x10acdad`

```text
 10acd41:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 10acd46:	48 8b 18             	mov    rbx,QWORD PTR [rax]
 10acd49:	6a 50                	push   0x50
 10acd4b:	5f                   	pop    rdi
 10acd4c:	e8 af 11 74 00       	call   17edf00 <_Znwm@plt>
 10acd51:	48 8d 0d b8 01 7a 00 	lea    rcx,[rip+0x7a01b8]        # 184cf10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x95f8>
 10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx
 10acd5b:	48 8d 0d 5e 02 7a 00 	lea    rcx,[rip+0x7a025e]        # 184cfc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x96a8>
 10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
 10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
 10acd6e:	48 8b 9c 24 e8 01 00 	mov    rbx,QWORD PTR [rsp+0x1e8]
 10acd75:	00
 10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
 10acd7a:	0f 57 c0             	xorps  xmm0,xmm0
 10acd7d:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
 10acd81:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 10acd85:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
 10acd8c:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
 10acd93:	00
 10acd94:	49 83 26 00          	and    QWORD PTR [r14],0x0
 10acd98:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 10acd9d:	48 89 c6             	mov    rsi,rax
 10acda0:	e8 dd 0e 00 00       	call   10adc82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275098>
 10acda5:	4c 89 f7             	mov    rdi,r14
 10acda8:	e8 f5 0e 00 00       	call   10adca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2750b8>
 10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10acdb2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdb8:	49 89 c7             	mov    r15,rax
 10acdbb:	48 8b bc 24 d8 01 00 	mov    rdi,QWORD PTR [rsp+0x1d8]
 10acdc2:	00
 10acdc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10acdc9:	49 89 c5             	mov    r13,rax
 10acdcc:	bf c8 00 00 00       	mov    edi,0xc8
 10acdd1:	e8 2a 11 74 00       	call   17edf00 <_Znwm@plt>
 10acdd6:	49 89 c6             	mov    r14,rax
 10acdd9:	48 8d 05 30 fd 79 00 	lea    rax,[rip+0x79fd30]        # 184cb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x91f8>
 10acde0:	49 89 06             	mov    QWORD PTR [r14],rax
 10acde3:	48 8d 05 de fd 79 00 	lea    rax,[rip+0x79fdde]        # 184cbc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x92b0>
 10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
 10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
 10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx
 10acdfa:	4d 8d 66 28          	lea    r12,[r14+0x28]
 10acdfe:	0f 57 c0             	xorps  xmm0,xmm0
 10ace01:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
 10ace06:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
 10ace0b:	41 c7 46 48 00 00 80 	mov    DWORD PTR [r14+0x48],0x3f800000
 10ace12:	3f
 10ace13:	49 8d 6e 50          	lea    rbp,[r14+0x50]
 10ace17:	48 89 ef             	mov    rdi,rbp
 10ace1a:	e8 e3 03 a1 ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>
 10ace1f:	4d 8d ae a8 00 00 00 	lea    r13,[r14+0xa8]
 10ace26:	4c 89 ef             	mov    rdi,r13
 10ace29:	48 8b b4 24 c0 01 00 	mov    rsi,QWORD PTR [rsp+0x1c0]
 10ace30:	00
 10ace31:	e8 8c 48 71 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
 10ace36:	4c 8d 84 24 d0 00 00 	lea    r8,[rsp+0xd0]
 10ace3d:	00
 10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14
 10ace41:	48 8d 35 49 02 9f ff 	lea    rsi,[rip+0xffffffffff9f0249]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 10ace48:	48 8d 0d 5f 15 00 00 	lea    rcx,[rip+0x155f]        # 10ae3ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757c4>
 10ace4f:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
 10ace56:	00
 10ace57:	6a 08                	push   0x8
 10ace59:	41 59                	pop    r9
 10ace5b:	48 89 df             	mov    rdi,rbx
 10ace5e:	31 d2                	xor    edx,edx
 10ace60:	e8 2f d9 72 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 10ace65:	49 8b 07             	mov    rax,QWORD PTR [r15]
 10ace68:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
 10ace6f:	00
 10ace70:	6a 01                	push   0x1
 10ace72:	5a                   	pop    rdx
 10ace73:	4c 89 fe             	mov    rsi,r15
 10ace76:	48 89 d9             	mov    rcx,rbx
 10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]
 10ace7c:	4c 89 f7             	mov    rdi,r14
 10ace7f:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 10ace86:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
 10ace8d:	00
 10ace8e:	48 89 de             	mov    rsi,rbx
 10ace91:	e8 a8 cb 72 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 10ace96:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 10ace9a:	e8 e7 15 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10ace9f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10acea6:	00
 10acea7:	e8 3c d9 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10aceac:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]
 10aceb3:	00
 10aceb4:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10aceb8:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
 10acebf:	00
 10acec0:	4c 89 ff             	mov    rdi,r15
```
### around `0x10ad8ac`

```text
 10ad843:	e8 5d c2 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10ad848:	e9 b9 02 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad84d:	e9 e5 00 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad852:	48 89 c3             	mov    rbx,rax
 10ad855:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 10ad85c:	00
 10ad85d:	e8 2e 06 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad862:	eb 03                	jmp    10ad867 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c7d>
 10ad864:	48 89 c3             	mov    rbx,rax
 10ad867:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
 10ad86e:	00
 10ad86f:	e8 1c 06 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad874:	e9 cb 02 00 00       	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
 10ad879:	e9 b9 00 00 00       	jmp    10ad937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d4d>
 10ad87e:	eb 02                	jmp    10ad882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c98>
 10ad880:	eb 00                	jmp    10ad882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274c98>
 10ad882:	48 89 c3             	mov    rbx,rax
 10ad885:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad88c:	00
 10ad88d:	e8 56 cf 72 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 10ad892:	49 89 ef             	mov    r15,rbp
 10ad895:	49 81 c7 a0 00 00 00 	add    r15,0xa0
 10ad89c:	4c 89 ef             	mov    rdi,r13
 10ad89f:	e8 30 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10ad8a4:	4c 89 f7             	mov    rdi,r14
 10ad8a7:	e8 28 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10ad8ac:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 10ad8b1:	e8 b0 c5 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10ad8b6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 10ad8bb:	e8 a6 c5 72 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10ad8c0:	4c 89 ff             	mov    rdi,r15
 10ad8c3:	e8 8e ce 00 00       	call   10ba756 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281b6c>
 10ad8c8:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 10ad8cd:	e8 02 c3 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10ad8d2:	4c 89 e7             	mov    rdi,r12
 10ad8d5:	e8 fa c2 72 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 10ad8da:	48 89 ef             	mov    rdi,rbp
 10ad8dd:	e8 3e 06 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad8e2:	e9 5d 02 00 00       	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
 10ad8e7:	eb 00                	jmp    10ad8e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274cff>
 10ad8e9:	48 89 c3             	mov    rbx,rax
 10ad8ec:	e9 5e 02 00 00       	jmp    10adb4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f65>
 10ad8f1:	eb 00                	jmp    10ad8f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d09>
 10ad8f3:	48 89 c3             	mov    rbx,rax
 10ad8f6:	e9 5f 02 00 00       	jmp    10adb5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f70>
 10ad8fb:	e9 18 02 00 00       	jmp    10adb18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f2e>
 10ad900:	48 89 c3             	mov    rbx,rax
 10ad903:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad90a:	00
 10ad90b:	e8 1a 04 00 00       	call   10add2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275140>
 10ad910:	e9 06 02 00 00       	jmp    10adb1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f31>
 10ad915:	48 89 c3             	mov    rbx,rax
 10ad918:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad91f:	00
 10ad920:	e8 d5 03 00 00       	call   10adcfa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275110>
 10ad925:	e9 f1 01 00 00       	jmp    10adb1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f31>
 10ad92a:	48 89 c3             	mov    rbx,rax
 10ad92d:	e9 05 02 00 00       	jmp    10adb37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f4d>
 10ad932:	e9 cf 01 00 00       	jmp    10adb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f1c>
 10ad937:	48 89 c3             	mov    rbx,rax
 10ad93a:	e9 05 02 00 00       	jmp    10adb44 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f5a>
 10ad93f:	48 89 c3             	mov    rbx,rax
 10ad942:	e9 1e 02 00 00       	jmp    10adb65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f7b>
 10ad947:	e9 29 02 00 00       	jmp    10adb75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8b>
 10ad94c:	48 89 c3             	mov    rbx,rax
 10ad94f:	4c 89 e7             	mov    rdi,r12
 10ad952:	e8 c9 05 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad957:	eb 03                	jmp    10ad95c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d72>
 10ad959:	48 89 c3             	mov    rbx,rax
 10ad95c:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 10ad963:	00
 10ad964:	e8 e9 42 d3 ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
 10ad969:	4c 89 f7             	mov    rdi,r14
 10ad96c:	e8 af 05 74 00       	call   17edf20 <_ZdlPv@plt>
 10ad971:	e9 02 02 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ad976:	e9 fa 01 00 00       	jmp    10adb75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8b>
 10ad97b:	48 89 c3             	mov    rbx,rax
 10ad97e:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ad982:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ad989:	e8 02 05 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad98e:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ad992:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ad996:	75 e6                	jne    10ad97e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274d94>
 10ad998:	e9 db 01 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ad99d:	e9 4a 01 00 00       	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
 10ad9a2:	48 89 c3             	mov    rbx,rax
 10ad9a5:	6a 18                	push   0x18
 10ad9a7:	41 5e                	pop    r14
 10ad9a9:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]
 10ad9ad:	48 81 c7 10 01 00 00 	add    rdi,0x110
 10ad9b4:	e8 d7 04 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10ad9b9:	49 83 c6 e8          	add    r14,0xffffffffffffffe8
 10ad9bd:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8
 10ad9c1:	75 e6                	jne    10ad9a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274dbf>
 10ad9c3:	e9 b0 01 00 00       	jmp    10adb78 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f8e>
 10ad9c8:	e9 1f 01 00 00       	jmp    10adaec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274f02>
```
### `[rsp+0x40]` all refs

| addr | instruction |
|---:|---|
| `0x10aba54` | `10aba54:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx` |
| `0x10ac372` | `10ac372:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10ac4e4` | `10ac4e4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acd33` | `10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acdad` | `10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acf8d` | `10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0x10ad163` | `10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0x10ad18d` | `10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0x10ad1ed` | `10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0x10ad2a7` | `10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0x10ad8ac` | `10ad8ac:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |

## Output-ish stack slots and pointer stores after `10ac700`

| addr | instruction |
|---:|---|
| `0x10ac737` | `10ac737:	49 89 55 10          	mov    QWORD PTR [r13+0x10],rdx` |
| `0x10ac742` | `10ac742:	49 89 55 18          	mov    QWORD PTR [r13+0x18],rdx` |
| `0x10ac74d` | `10ac74d:	49 89 16             	mov    QWORD PTR [r14],rdx` |
| `0x10ac758` | `10ac758:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx` |
| `0x10ac760` | `10ac760:	49 89 56 20          	mov    QWORD PTR [r14+0x20],rdx` |
| `0x10ac776` | `10ac776:	49 89 4e 28          	mov    QWORD PTR [r14+0x28],rcx` |
| `0x10ac77a` | `10ac77a:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x10ac7d5` | `10ac7d5:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ac7dd` | `10ac7dd:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10ac7e8` | `10ac7e8:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ac81c` | `10ac81c:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ac82c` | `10ac82c:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax` |
| `0x10ac847` | `10ac847:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax` |
| `0x10ac84f` | `10ac84f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax` |
| `0x10ac8aa` | `10ac8aa:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ac8b5` | `10ac8b5:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ac8c0` | `10ac8c0:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ac981` | `10ac981:	48 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rcx` |
| `0x10ac9c4` | `10ac9c4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax` |
| `0x10ac9cf` | `10ac9cf:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax` |
| `0x10ac9da` | `10ac9da:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ac9e5` | `10ac9e5:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10ac9f1` | `10ac9f1:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x10aca1e` | `10aca1e:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax` |
| `0x10aca32` | `10aca32:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0x10acaeb` | `10acaeb:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acaf6` | `10acaf6:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10acb35` | `10acb35:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax` |
| `0x10acb50` | `10acb50:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax` |
| `0x10acb58` | `10acb58:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax` |
| `0x10acbb3` | `10acbb3:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10acbbe` | `10acbbe:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10acbc9` | `10acbc9:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10acc0a` | `10acc0a:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10acc26` | `10acc26:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acc30` | `10acc30:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acc3b` | `10acc3b:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax` |
| `0x10acc47` | `10acc47:	4d 89 66 18          	mov    QWORD PTR [r14+0x18],r12` |
| `0x10acc4b` | `10acc4b:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10acc4f` | `10acc4f:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15` |
| `0x10acc7b` | `10acc7b:	4d 89 30             	mov    QWORD PTR [r8],r14` |
| `0x10accc1` | `10accc1:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x10acd25` | `10acd25:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x10acd30` | `10acd30:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10acd33` | `10acd33:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acd3b` | `10acd3b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acd58` | `10acd58:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10acd62` | `10acd62:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx` |
| `0x10acd66` | `10acd66:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14` |
| `0x10acd6a` | `10acd6a:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx` |
| `0x10acd76` | `10acd76:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx` |
| `0x10acdad` | `10acdad:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10acdb5` | `10acdb5:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acdc6` | `10acdc6:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10acde0` | `10acde0:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acdea` | `10acdea:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acdee` | `10acdee:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15` |
| `0x10acdf2` | `10acdf2:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13` |
| `0x10acdf6` | `10acdf6:	49 89 5e 20          	mov    QWORD PTR [r14+0x20],rbx` |
| `0x10ace3e` | `10ace3e:	4d 89 30             	mov    QWORD PTR [r8],r14` |
| `0x10ace79` | `10ace79:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x10acef0` | `10acef0:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10acefa` | `10acefa:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax` |
| `0x10acf8d` | `10acf8d:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al` |
| `0x10ad13e` | `10ad13e:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0x10ad163` | `10ad163:	0f b6 44 24 40       	movzx  eax,BYTE PTR [rsp+0x40]` |
| `0x10ad18d` | `10ad18d:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0` |
| `0x10ad1a5` | `10ad1a5:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax` |
| `0x10ad1ae` | `10ad1ae:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax` |
| `0x10ad1b2` | `10ad1b2:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]` |
| `0x10ad1b7` | `10ad1b7:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax` |
| `0x10ad1bb` | `10ad1bb:	4c 89 65 18          	mov    QWORD PTR [rbp+0x18],r12` |
| `0x10ad1cb` | `10ad1cb:	4c 89 6d 30          	mov    QWORD PTR [rbp+0x30],r13` |
| `0x10ad1cf` | `10ad1cf:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15` |
| `0x10ad1d7` | `10ad1d7:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi` |
| `0x10ad1ed` | `10ad1ed:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]` |
| `0x10ad217` | `10ad217:	48 89 5d 60          	mov    QWORD PTR [rbp+0x60],rbx` |
| `0x10ad223` | `10ad223:	48 89 45 68          	mov    QWORD PTR [rbp+0x68],rax` |
| `0x10ad22f` | `10ad22f:	48 89 45 70          	mov    QWORD PTR [rbp+0x70],rax` |
| `0x10ad23b` | `10ad23b:	48 89 45 78          	mov    QWORD PTR [rbp+0x78],rax` |
| `0x10ad247` | `10ad247:	48 89 85 80 00 00 00 	mov    QWORD PTR [rbp+0x80],rax` |
| `0x10ad256` | `10ad256:	48 89 85 88 00 00 00 	mov    QWORD PTR [rbp+0x88],rax` |
| `0x10ad265` | `10ad265:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax` |
| `0x10ad296` | `10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi` |
| `0x10ad2a7` | `10ad2a7:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi` |
| `0x10ad2e4` | `10ad2e4:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0x10ad31f` | `10ad31f:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10ad352` | `10ad352:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0x10ad38a` | `10ad38a:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0x10ad3c7` | `10ad3c7:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0x10ad3ff` | `10ad3ff:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad43c` | `10ad43c:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0x10ad474` | `10ad474:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad4b4` | `10ad4b4:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0x10ad4b7` | `10ad4b7:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp` |
| `0x10ad4d9` | `10ad4d9:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax` |
| `0x10ad553` | `10ad553:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ad556` | `10ad556:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad55d` | `10ad55d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax` |
| `0x10ad562` | `10ad562:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp` |
| `0x10ad577` | `10ad577:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax` |
| `0x10ad584` | `10ad584:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]` |
| `0x10ad589` | `10ad589:	48 89 02             	mov    QWORD PTR [rdx],rax` |
| `0x10ad593` | `10ad593:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax` |
| `0x10ad59e` | `10ad59e:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax` |
| `0x10ad5a2` | `10ad5a2:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]` |
| `0x10ad5b8` | `10ad5b8:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0x10ad5fd` | `10ad5fd:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15` |
| `0x10ad608` | `10ad608:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax` |
| `0x10ad613` | `10ad613:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax` |
| `0x10ad62a` | `10ad62a:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10ad676` | `10ad676:	ff 90 58 01 00 00    	call   QWORD PTR [rax+0x158]` |
| `0x10ad682` | `10ad682:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10ad68d` | `10ad68d:	48 8d 0d f4 03 7a 00 	lea    rcx,[rip+0x7a03f4]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>` |
| `0x10ad694` | `10ad694:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0x10ad697` | `10ad697:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14` |
| `0x10ad69b` | `10ad69b:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]` |
| `0x10ad6a0` | `10ad6a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx` |
| `0x10ad6a4` | `10ad6a4:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp` |
| `0x10ad6a8` | `10ad6a8:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]` |
| `0x10ad6ad` | `10ad6ad:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx` |
| `0x10ad6b1` | `10ad6b1:	48 89 58 28          	mov    QWORD PTR [rax+0x28],rbx` |
| `0x10ad6b5` | `10ad6b5:	48 8b 8c 24 80 00 00 	mov    rcx,QWORD PTR [rsp+0x80]` |
| `0x10ad6bd` | `10ad6bd:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx` |
| `0x10ad6c6` | `10ad6c6:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx` |
| `0x10ad6d9` | `10ad6d9:	48 89 01             	mov    QWORD PTR [rcx],rax` |
| `0x10ad6e4` | `10ad6e4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10ad8ac` | `10ad8ac:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0x10adb2b` | `10adb2b:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adb34` | `10adb34:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x10adb3e` | `10adb3e:	ff 90 d8 01 00 00    	call   QWORD PTR [rax+0x1d8]` |
| `0x10adb44` | `10adb44:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]` |
| `0x10adb4c` | `10adb4c:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0x10adb4f` | `10adb4f:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |
| `0x10adb57` | `10adb57:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x10adb62` | `10adb62:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x10adb65` | `10adb65:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]` |
| `0x10adb70` | `10adb70:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0x10adbba` | `10adbba:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]` |

## Summary generated by script

- `[rsp+0x18]` is the pointer dereferenced immediately before the strong store at `10ac7dd`.
- `10ac7dd` stores `r14` through that pointer, then cleanup calls the old pointee via vtable `+0x8`.
- This makes `[rsp+0x18]` a stronger output-slot candidate than the earlier wrapper-local fields.
- The next semantic question is whether `[rsp+0x18]` aliases the storage later exposed as `child+0x18`, or another constructor output wrapper.
