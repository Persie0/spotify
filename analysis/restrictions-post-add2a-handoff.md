# Restrictions post-add2a handoff trace

Purpose: inspect the path immediately after `17add2a` where the caller reloads the provider setup bundle base.

## Caller context around `14ce72c..14ce78x`
```text
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
     14ce76d:	e8 ca 28 19 00       	call   166103c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x151a8>
     14ce772:	84 c0                	test   al,al
     14ce774:	0f 84 af 00 00 00    	je     14ce829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313dad>
     14ce77a:	48 63 84 24 30 03 00 	movsxd rax,DWORD PTR [rsp+0x330]
     14ce781:	00 
     14ce782:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
     14ce787:	49 89 85 88 00 00 00 	mov    QWORD PTR [r13+0x88],rax
     14ce78e:	44 8b b4 24 00 03 00 	mov    r14d,DWORD PTR [rsp+0x300]
     14ce795:	00 
     14ce796:	4d 85 f6             	test   r14,r14
     14ce799:	74 3b                	je     14ce7d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313d5a>
     14ce79b:	4c 8b bc 24 f8 02 00 	mov    r15,QWORD PTR [rsp+0x2f8]
     14ce7a2:	00 
     14ce7a3:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     14ce7a8:	48 8d 98 90 00 00 00 	lea    rbx,[rax+0x90]
     14ce7af:	49 c1 e6 03          	shl    r14,0x3
     14ce7b3:	45 31 e4             	xor    r12d,r12d
     14ce7b6:	4b 8b 34 27          	mov    rsi,QWORD PTR [r15+r12*1]
     14ce7ba:	4c 63 6e 30          	movsxd r13,DWORD PTR [rsi+0x30]
     14ce7be:	48 83 c6 18          	add    rsi,0x18
     14ce7c2:	48 89 df             	mov    rdi,rbx
     14ce7c5:	e8 5a 8c 03 00       	call   1507424 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c9a8>
     14ce7ca:	4c 89 28             	mov    QWORD PTR [rax],r13
     14ce7cd:	49 83 c4 08          	add    r12,0x8
     14ce7d1:	4d 39 e6             	cmp    r14,r12
     14ce7d4:	75 e0                	jne    14ce7b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313d3a>
     14ce7d6:	83 bc 24 70 03 00 00 	cmp    DWORD PTR [rsp+0x370],0x3
     14ce7dd:	03 
     14ce7de:	4c 8b 6c 24 78       	mov    r13,QWORD PTR [rsp+0x78]
     14ce7e3:	75 44                	jne    14ce829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313dad>
     14ce7e5:	44 8b b4 24 40 03 00 	mov    r14d,DWORD PTR [rsp+0x340]
     14ce7ec:	00 
     14ce7ed:	4d 85 f6             	test   r14,r14
     14ce7f0:	74 37                	je     14ce829 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x313dad>
     14ce7f2:	4c 8b a4 24 38 03 00 	mov    r12,QWORD PTR [rsp+0x338]
     14ce7f9:	00 
     14ce7fa:	49 c1 e6 03          	shl    r14,0x3
     14ce7fe:	45 31 ff             	xor    r15d,r15d
     14ce801:	4b 8b 1c 3c          	mov    rbx,QWORD PTR [r12+r15*1]
```

## Tracked calls in caller handoff window
| call | tracked args | instruction |
|---|---|---|
| `0x14ce746` | `` | `14ce746:	e8 45 f7 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x14ce76d` | `rdi=bundle_base(rsp+0x2e0), rsi=post_add2a_obj(rsp+0x230)` | `14ce76d:	e8 ca 28 19 00       	call   166103c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x151a8>` |

## Stack refs in caller handoff window
| addr | rsp offset | instruction |
|---|---:|---|
| `0x14ce74b` | `0x238` | `14ce74b:	48 8b 84 24 38 02 00 	mov    rax,QWORD PTR [rsp+0x238]` |
| `0x14ce75d` | `0x2e0` | `14ce75d:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]` |
| `0x14ce765` | `0x230` | `14ce765:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]` |
| `0x14ce77a` | `0x330` | `14ce77a:	48 63 84 24 30 03 00 	movsxd rax,DWORD PTR [rsp+0x330]` |
| `0x14ce782` | `0x78` | `14ce782:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13` |
| `0x14ce78e` | `0x300` | `14ce78e:	44 8b b4 24 00 03 00 	mov    r14d,DWORD PTR [rsp+0x300]` |
| `0x14ce79b` | `0x2f8` | `14ce79b:	4c 8b bc 24 f8 02 00 	mov    r15,QWORD PTR [rsp+0x2f8]` |
| `0x14ce7a3` | `0x78` | `14ce7a3:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]` |

## Helper `0x166103c` / `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`

### Entry body window
```text
     166103c:	55                   	push   rbp
     166103d:	41 56                	push   r14
     166103f:	53                   	push   rbx
     1661040:	48 83 ec 70          	sub    rsp,0x70
     1661044:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     166104b:	00 00 
     166104d:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     1661052:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1661057:	66 41 c7 06 01 00    	mov    WORD PTR [r14],0x1
     166105d:	49 89 76 08          	mov    QWORD PTR [r14+0x8],rsi
     1661061:	0f 57 c0             	xorps  xmm0,xmm0
     1661064:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
     1661069:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
     166106e:	41 c7 46 28 40 00 00 	mov    DWORD PTR [r14+0x28],0x40
     1661075:	00 
     1661076:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
     166107b:	48 89 fb             	mov    rbx,rdi
     166107e:	41 c7 46 3c ff ff ff 	mov    DWORD PTR [r14+0x3c],0x7fffffff
     1661085:	7f 
     1661086:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1661089:	ff 50 10             	call   QWORD PTR [rax+0x10]
     166108c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     166108f:	48 89 df             	mov    rdi,rbx
     1661092:	4c 89 f6             	mov    rsi,r14
     1661095:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1661098:	84 c0                	test   al,al
     166109a:	74 2d                	je     16610c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15235>
     166109c:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     166109f:	48 89 df             	mov    rdi,rbx
     16610a2:	ff 50 18             	call   QWORD PTR [rax+0x18]
     16610a5:	40 b5 01             	mov    bpl,0x1
     16610a8:	84 c0                	test   al,al
     16610aa:	75 4d                	jne    16610f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15265>
     16610ac:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     16610b1:	4c 89 f7             	mov    rdi,r14
     16610b4:	48 89 de             	mov    rsi,rbx
     16610b7:	e8 12 f9 ff ff       	call   16609ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b3a>
     16610bc:	41 f6 06 01          	test   BYTE PTR [r14],0x1
     16610c0:	74 0b                	je     16610cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15239>
     16610c2:	4c 8b 44 24 18       	mov    r8,QWORD PTR [rsp+0x18]
     16610c7:	eb 09                	jmp    16610d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1523e>
     16610c9:	31 ed                	xor    ebp,ebp
     16610cb:	eb 2c                	jmp    16610f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15265>
     16610cd:	4c 8d 44 24 09       	lea    r8,[rsp+0x9]
     16610d2:	48 8d 35 a3 0e df fe 	lea    rsi,[rip+0xfffffffffedf0ea3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     16610d9:	48 8d 0d 2f dc ce fe 	lea    rcx,[rip+0xfffffffffecedc2f]        # 34ed0f <_ZTSSt12bad_any_cast@@Base-0x414b9>
     16610e0:	31 ed                	xor    ebp,ebp
     16610e2:	6a 02                	push   0x2
     16610e4:	5f                   	pop    rdi
     16610e5:	ba 9e 0c 00 00       	mov    edx,0xc9e
     16610ea:	31 c0                	xor    eax,eax
     16610ec:	e8 e1 57 17 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     16610f1:	4c 89 f7             	mov    rdi,r14
     16610f4:	e8 97 cd 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     16610f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1661100:	00 00 
     1661102:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
     1661107:	75 0b                	jne    1661114 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15280>
     1661109:	89 e8                	mov    eax,ebp
     166110b:	48 83 c4 70          	add    rsp,0x70
     166110f:	5b                   	pop    rbx
     1661110:	41 5e                	pop    r14
     1661112:	5d                   	pop    rbp
     1661113:	c3                   	ret
     1661114:	e8 97 e9 18 00       	call   17efab0 <__stack_chk_fail@plt>
     1661119:	cc                   	int3
     166111a:	53                   	push   rbx
     166111b:	48 83 ec 40          	sub    rsp,0x40
     166111f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1661126:	00 00 
     1661128:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     166112d:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
     1661132:	c6 00 01             	mov    BYTE PTR [rax],0x1
     1661135:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     166113a:	83 60 10 00          	and    DWORD PTR [rax+0x10],0x0
     166113e:	48 89 70 18          	mov    QWORD PTR [rax+0x18],rsi
     1661142:	c7 40 20 01 00 00 00 	mov    DWORD PTR [rax+0x20],0x1
     1661149:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     166114c:	48 89 c6             	mov    rsi,rax
     166114f:	ff 51 40             	call   QWORD PTR [rcx+0x40]
     1661152:	89 c3                	mov    ebx,eax
     1661154:	8b 7c 24 18          	mov    edi,DWORD PTR [rsp+0x18]
     1661158:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     166115d:	e8 46 00 00 00       	call   16611a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15314>
     1661162:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1661169:	00 00 
     166116b:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     1661170:	75 31                	jne    16611a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1530f>
     1661172:	89 d8                	mov    eax,ebx
     1661174:	48 83 c4 40          	add    rsp,0x40
     1661178:	5b                   	pop    rbx
     1661179:	c3                   	ret
     166117a:	48 89 c3             	mov    rbx,rax
     166117d:	8b 7c 24 18          	mov    edi,DWORD PTR [rsp+0x18]
     1661181:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     1661186:	e8 1d 00 00 00       	call   16611a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15314>
     166118b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1661192:	00 00 
     1661194:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     1661199:	75 08                	jne    16611a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1530f>
     166119b:	48 89 df             	mov    rdi,rbx
     166119e:	e8 2d eb 40 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     16611a3:	e8 08 e9 18 00       	call   17efab0 <__stack_chk_fail@plt>
     16611a8:	50                   	push   rax
     16611a9:	85 ff                	test   edi,edi
     16611ab:	74 0d                	je     16611ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15326>
     16611ad:	89 f8                	mov    eax,edi
     16611af:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
     16611b2:	48 89 f7             	mov    rdi,rsi
     16611b5:	89 c6                	mov    esi,eax
     16611b7:	ff 51 18             	call   QWORD PTR [rcx+0x18]
     16611ba:	58                   	pop    rax
     16611bb:	c3                   	ret
     16611bc:	48 89 c7             	mov    rdi,rax
     16611bf:	e8 e1 88 41 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     16611c4:	53                   	push   rbx
     16611c5:	48 89 fb             	mov    rbx,rdi
     16611c8:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
     16611cc:	48 85 ff             	test   rdi,rdi
     16611cf:	74 06                	je     16611d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15343>
     16611d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     16611d4:	ff 50 08             	call   QWORD PTR [rax+0x8]
     16611d7:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
     16611dc:	5b                   	pop    rbx
     16611dd:	c3                   	ret
     16611de:	85 f6                	test   esi,esi
     16611e0:	74 0f                	je     16611f1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1535d>
     16611e2:	48 89 f8             	mov    rax,rdi
     16611e5:	39 10                	cmp    DWORD PTR [rax],edx
     16611e7:	74 0a                	je     16611f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1535f>
     16611e9:	48 83 c0 28          	add    rax,0x28
     16611ed:	ff ce                	dec    esi
     16611ef:	75 f4                	jne    16611e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15351>
     16611f1:	31 c0                	xor    eax,eax
     16611f3:	c3                   	ret
     16611f4:	41 57                	push   r15
     16611f6:	41 56                	push   r14
     16611f8:	53                   	push   rbx
     16611f9:	48 83 ec 20          	sub    rsp,0x20
     16611fd:	48 89 f3             	mov    rbx,rsi
    ... truncated 172 additional instructions ...
```

### Arg-memory refs
| addr | arg-derived location | instruction |
|---|---|---|
| `0x1661086` | `arg:rdi` | `1661086:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x1661089` | `load(arg:rdi+0)+10` | `1661089:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x166108c` | `arg:rdi` | `166108c:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x1661095` | `load(arg:rdi+0)+30` | `1661095:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x166109c` | `arg:rdi` | `166109c:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x16610a2` | `load(arg:rdi+0)+18` | `16610a2:	ff 50 18             	call   QWORD PTR [rax+0x18]` |

### Arg-derived writes
| addr | arg-derived location | instruction |
|---|---|---|
| `0x1661089` | `load(arg:rdi+0)+10` | `1661089:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x1661095` | `load(arg:rdi+0)+30` | `1661095:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x16610a2` | `load(arg:rdi+0)+18` | `16610a2:	ff 50 18             	call   QWORD PTR [rax+0x18]` |

### Calls inside helper
| call | tracked args | instruction |
|---|---|---|
| `0x1661089` | `rdi=arg:rdi, rsi=arg:rsi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `1661089:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x1661095` | `rdi=arg:rdi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `1661095:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0x16610a2` | `rdi=arg:rdi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `16610a2:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0x16610b7` | `rsi=arg:rdi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `16610b7:	e8 12 f9 ff ff       	call   16609ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b3a>` |
| `0x16610ec` | `rdx=arg:rdx, r9=arg:r9` | `16610ec:	e8 e1 57 17 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0x16610f4` | `rdx=arg:rdx, r9=arg:r9` | `16610f4:	e8 97 cd 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1661114` | `rdx=arg:rdx, r9=arg:r9` | `1661114:	e8 97 e9 18 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x166114f` | `rdx=arg:rdx, r9=arg:r9` | `166114f:	ff 51 40             	call   QWORD PTR [rcx+0x40]` |
| `0x166115d` | `rdx=arg:rdx, r9=arg:r9` | `166115d:	e8 46 00 00 00       	call   16611a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15314>` |
| `0x1661186` | `rdx=arg:rdx, r9=arg:r9` | `1661186:	e8 1d 00 00 00       	call   16611a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15314>` |
| `0x166119e` | `rdx=arg:rdx, r9=arg:r9` | `166119e:	e8 2d eb 40 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x16611a3` | `rdx=arg:rdx, r9=arg:r9` | `16611a3:	e8 08 e9 18 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x16611b7` | `rdx=arg:rdx, r9=arg:r9` | `16611b7:	ff 51 18             	call   QWORD PTR [rcx+0x18]` |
| `0x16611bf` | `rdx=arg:rdx, r9=arg:r9` | `16611bf:	e8 e1 88 41 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x16611d4` | `rdx=arg:rdx, r9=arg:r9` | `16611d4:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0x166121e` | `rdx=arg:rdx, r9=arg:r9` | `166121e:	e8 5b 88 41 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0x166122c` | `rdx=arg:rdx, r9=arg:r9` | `166122c:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x1661232` | `rdx=arg:rdx, r9=arg:r9` | `1661232:	e8 59 cc 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x166123b` | `rdx=arg:rdx, r9=arg:r9` | `166123b:	e8 22 92 41 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>` |
| `0x1661260` | `rdx=arg:rdx, r9=arg:r9` | `1661260:	e8 2b cc 18 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x1661278` | `rdx=arg:rdx, r9=arg:r9` | `1661278:	e8 53 ea 40 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x166127d` | `rdx=arg:rdx, r9=arg:r9` | `166127d:	e8 2e e8 18 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x1661286` | `rdx=arg:rdx, r9=arg:r9` | `1661286:	e8 73 91 6c ff       	call   d2a3fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27739e>` |
| `0x166129f` | `rdx=arg:rdx, r9=arg:r9` | `166129f:	e8 bc d4 18 00       	call   17ee760 <free@plt>` |
| `0x16612b6` | `rdx=arg:rdx, r9=arg:r9` | `16612b6:	e8 19 09 00 00       	call   1661bd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d40>` |
| `0x16613f1` | `r9=arg:r9` | `16613f1:	e8 9c 02 00 00       	call   1661692 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157fe>` |
| `0x166140d` | `r9=arg:r9` | `166140d:	e8 35 04 00 00       	call   1661847 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159b3>` |
| `0x1661433` | `r9=arg:r9` | `1661433:	e8 78 e6 18 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x1661453` | `r9=arg:r9` | `1661453:	e8 62 ff ff ff       	call   16613ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15526>` |

## Interpretation
- If `0x14ce76d` passes `rdi=bundle_base` and `rsi=post_add2a_obj`, then `166103c` is the first concrete candidate for copying the object into the shared setup bundle.
- Arg-derived writes inside `166103c` tell whether it writes through `arg:rdi` (the bundle) or only reads from it.
