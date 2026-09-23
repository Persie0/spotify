# Restrictions `+0x28` concrete candidate methods v17

Focus: inspect likely concrete AP/vtable candidates for `[r13+0x410].vtable+0x28`, especially methods that could populate `[rsp+0x390]/[rsp+0x398]` or return/build receiver pairs. Static provenance only.

## Candidate AP table

| AP base | +0x00 | +0x08 | +0x10 | +0x20 | +0x28 | +0x78 | +0xa0 | +0xa8 | tags |
|---:|---:|---:|---:|---:|---:|---:|---:|---:|---|
| `0x1854998` | `0x1903f98` | `-` | `-` | `0xaae5e8` | `0x1145c8a` | `-` | `0x174f1dc` | `0x1146a50` | `top-v16-candidate` |
| `0x184c338` | `0x18f6fc0` | `0x18f7078` | `0x18f7008` | `-` | `0x10a2082` | `0x10a2bc4` | `0x9d7de0` | `0xa50370` | `restrictions-ish` |
| `0x181bf48` | `0xc81db4` | `-` | `-` | `0xc82cc6` | `0xc85d5e` | `0xc842ac` | `0xc842ac` | `0xc84a92` | `` |
| `0x182d060` | `0xe0685c` | `0xe06c12` | `0xe06fda` | `0xe0774a` | `0xe07ad0` | `0xe09e14` | `0xe0a80e` | `0xe0a81e` | `` |
| `0x182d068` | `0xe06c12` | `0xe06fda` | `0xe07392` | `0xe07ad0` | `0xe07e86` | `0xe09e2e` | `0xe0a81e` | `0xe0a844` | `` |
| `0x182d070` | `0xe06fda` | `0xe07392` | `0xe0774a` | `0xe07e86` | `0xe081c0` | `0xe0a0f2` | `0xe0a844` | `0xe0a85e` | `` |
| `0x185ac20` | `0x11d2718` | `0x11d27e6` | `0x11d2902` | `0x11d2b20` | `0x11d2d28` | `0x11d3f24` | `0xada1e4` | `0x11d01be` | `` |
| `0x18b08d0` | `0xa7e38c` | `0xa7e3a2` | `0xa7e3b8` | `0xa7e64a` | `0xa7e734` | `0xa7fb31` | `0xa816cf` | `0xa816e5` | `` |
| `0x18b08d8` | `0xa7e3a2` | `0xa7e3b8` | `0xa7e560` | `0xa7e734` | `0xa7e773` | `0xa8164d` | `0xa816e5` | `0xa816fb` | `` |
| `0x18856d0` | `0x15caf42` | `0x15caf54` | `0x15caff6` | `0x15cb08c` | `0x15cb0f2` | `0x15cbd1e` | `0x15cadec` | `0x15cbd52` | `` |
| `0x18319b8` | `0xe993ae` | `-` | `0xa50370` | `-` | `0xe992a2` | `0xa50370` | `0xe9929a` | `-` | `near-e95/e99` |
| `0x18319c8` | `0xa50370` | `-` | `-` | `0xe992b6` | `0xe992c8` | `0xe99288` | `-` | `0xeaaf4c` | `near-e95/e99` |
| `0x1831a30` | `0xa50370` | `0xe9926a` | `0xe99288` | `0xa50370` | `0xe9929a` | `0x9d7de0` | `-` | `-` | `near-e95/e99` |
| `0x1831980` | `0x9d7de0` | `0xa50370` | `0xea657c` | `-` | `0xe9938c` | `0xe99368` | `-` | `0x9d7de0` | `near-e95/e99` |
| `0x1831988` | `0xa50370` | `0xea657c` | `-` | `0xe9938c` | `0xe9939c` | `0xad6470` | `0x9d7de0` | `0xa50370` | `near-e95/e99` |
| `0x1831990` | `0xea657c` | `-` | `-` | `0xe9939c` | `0xe993ae` | `0xad647a` | `0xa50370` | `0xe9926a` | `near-e95/e99` |
| `0x18319e8` | `0xe992b6` | `0xe992c8` | `0xe99368` | `0xad647a` | `0xe99382` | `-` | `-` | `0xa50370` | `near-e95/e99` |
| `0x1831a10` | `0xe99382` | `-` | `-` | `0xa50370` | `0xe9926a` | `-` | `0xa50370` | `0xeaba9e` | `near-e95/e99` |
| `0x188bdb8` | `0x160ac9a` | `0x160acac` | `0x160ad4c` | `0xad647a` | `0xe99382` | `-` | `0x160d4dc` | `0x160d4e2` | `near-e95/e99` |

## `+0x28` target method windows

### target `0xa7e734`

```text
  a7e64a:	41 57                	push   r15
  a7e64c:	41 56                	push   r14
  a7e64e:	41 54                	push   r12
  a7e650:	53                   	push   rbx
  a7e651:	48 83 ec 18          	sub    rsp,0x18
  a7e655:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7e65c:	00 00
  a7e65e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  a7e663:	48 8d 05 1b e6 94 ff 	lea    rax,[rip+0xffffffffff94e61b]        # 3ccc85 <_ZTSN5boost9exceptionE@@Base+0x2d667>
  a7e66a:	48 89 e3             	mov    rbx,rsp
  a7e66d:	48 89 03             	mov    QWORD PTR [rbx],rax
  a7e670:	c7 43 08 87 a3 e8 60 	mov    DWORD PTR [rbx+0x8],0x60e8a387
  a7e677:	4c 8d 35 c2 67 f6 00 	lea    r14,[rip+0xf667c2]        # 19e4e40 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1870>
  a7e67e:	4c 89 f7             	mov    rdi,r14
  a7e681:	48 89 de             	mov    rsi,rbx
  a7e684:	e8 21 37 d4 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a7e689:	4c 8b 3d b0 33 e3 00 	mov    r15,QWORD PTR [rip+0xe333b0]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a7e690:	4c 8d 25 69 59 d7 00 	lea    r12,[rip+0xd75969]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a7e697:	4c 89 ff             	mov    rdi,r15
  a7e69a:	4c 89 f6             	mov    rsi,r14
  a7e69d:	4c 89 e2             	mov    rdx,r12
  a7e6a0:	e8 bb f7 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a7e6a5:	48 8d 05 00 e6 94 ff 	lea    rax,[rip+0xffffffffff94e600]        # 3cccac <_ZTSN5boost9exceptionE@@Base+0x2d68e>
  a7e6ac:	48 89 03             	mov    QWORD PTR [rbx],rax
  a7e6af:	c7 43 08 f2 ee 7e 63 	mov    DWORD PTR [rbx+0x8],0x637eeef2
  a7e6b6:	48 8d 1d 9b 67 f6 00 	lea    rbx,[rip+0xf6679b]        # 19e4e58 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1888>
  a7e6bd:	49 89 e6             	mov    r14,rsp
  a7e6c0:	48 89 df             	mov    rdi,rbx
  a7e6c3:	4c 89 f6             	mov    rsi,r14
  a7e6c6:	e8 df 36 d4 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a7e6cb:	4c 89 ff             	mov    rdi,r15
  a7e6ce:	48 89 de             	mov    rsi,rbx
  a7e6d1:	4c 89 e2             	mov    rdx,r12
  a7e6d4:	e8 87 f7 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a7e6d9:	48 8d 05 e5 e5 94 ff 	lea    rax,[rip+0xffffffffff94e5e5]        # 3cccc5 <_ZTSN5boost9exceptionE@@Base+0x2d6a7>
  a7e6e0:	49 89 06             	mov    QWORD PTR [r14],rax
  a7e6e3:	41 c7 46 08 3d dc e9 	mov    DWORD PTR [r14+0x8],0x89e9dc3d
  a7e6ea:	89
  a7e6eb:	48 8d 3d 7e 67 f6 00 	lea    rdi,[rip+0xf6677e]        # 19e4e70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x18a0>
  a7e6f2:	48 89 e6             	mov    rsi,rsp
  a7e6f5:	e8 b0 36 d4 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a7e6fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7e701:	00 00
  a7e703:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  a7e708:	75 25                	jne    a7e72f <JNI_OnUnload@@Base+0x5ffc>
  a7e70a:	48 8b 3d 2f 33 e3 00 	mov    rdi,QWORD PTR [rip+0xe3332f]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a7e711:	48 8d 35 58 67 f6 00 	lea    rsi,[rip+0xf66758]        # 19e4e70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x18a0>
  a7e718:	48 8d 15 e1 58 d7 00 	lea    rdx,[rip+0xd758e1]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a7e71f:	48 83 c4 18          	add    rsp,0x18
  a7e723:	5b                   	pop    rbx
  a7e724:	41 5c                	pop    r12
  a7e726:	41 5e                	pop    r14
  a7e728:	41 5f                	pop    r15
  a7e72a:	e9 31 f7 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a7e72f:	e8 7c 13 d7 00       	call   17efab0 <__stack_chk_fail@plt>
  a7e734:	53                   	push   rbx
  a7e735:	48 8d 1d 6c 67 f6 00 	lea    rbx,[rip+0xf6676c]        # 19e4ea8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x18d8>
  a7e73c:	48 8d 35 fc e5 94 ff 	lea    rsi,[rip+0xffffffffff94e5fc]        # 3ccd3f <_ZTSN5boost9exceptionE@@Base+0x2d721>
  a7e743:	48 8d 0d fb e5 94 ff 	lea    rcx,[rip+0xffffffffff94e5fb]        # 3ccd45 <_ZTSN5boost9exceptionE@@Base+0x2d727>
  a7e74a:	6a 05                	push   0x5
  a7e74c:	5a                   	pop    rdx
  a7e74d:	6a 02                	push   0x2
  a7e74f:	41 59                	pop    r9
  a7e751:	48 89 df             	mov    rdi,rbx
  a7e754:	49 89 d0             	mov    r8,rdx
  a7e757:	e8 46 b3 0d 00       	call   b59aa2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6a42>
  a7e75c:	48 8d 3d 25 4d c0 00 	lea    rdi,[rip+0xc04d25]        # 1683488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375f4>
  a7e763:	48 8d 15 96 58 d7 00 	lea    rdx,[rip+0xd75896]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a7e76a:	48 89 de             	mov    rsi,rbx
  a7e76d:	5b                   	pop    rbx
  a7e76e:	e9 ed f6 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a7e773:	55                   	push   rbp
  a7e774:	41 57                	push   r15
  a7e776:	41 56                	push   r14
  a7e778:	41 55                	push   r13
  a7e77a:	41 54                	push   r12
  a7e77c:	53                   	push   rbx
  a7e77d:	48 81 ec 98 04 00 00 	sub    rsp,0x498
  a7e784:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7e78b:	00 00
  a7e78d:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  a7e794:	00
  a7e795:	48 8d 35 38 da 8d ff 	lea    rsi,[rip+0xffffffffff8dda38]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e79c:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  a7e7a3:	00
  a7e7a4:	e8 d5 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e7a9:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
  a7e7b0:	00
  a7e7b1:	48 8d 35 cc a3 8d ff 	lea    rsi,[rip+0xffffffffff8da3cc]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e7b8:	e8 c1 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e7bd:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  a7e7c4:	00
  a7e7c5:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
  a7e7cc:	00
  a7e7cd:	6a 02                	push   0x2
  a7e7cf:	5a                   	pop    rdx
  a7e7d0:	e8 83 8c 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e7d5:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
  a7e7dc:	00
  a7e7dd:	66 c7 47 f8 08 00    	mov    WORD PTR [rdi-0x8],0x8
  a7e7e3:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
  a7e7ea:	00
  a7e7eb:	e8 08 8d 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e7f0:	48 8d 9c 24 50 03 00 	lea    rbx,[rsp+0x350]
  a7e7f7:	00
  a7e7f8:	48 8d 35 d5 d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd9d5]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e7ff:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
  a7e806:	00
  a7e807:	e8 72 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e80c:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  a7e813:	00
  a7e814:	48 8d 35 69 a3 8d ff 	lea    rsi,[rip+0xffffffffff8da369]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e81b:	e8 5e b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e820:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  a7e827:	00
  a7e828:	48 8d b4 24 d0 02 00 	lea    rsi,[rsp+0x2d0]
  a7e82f:	00
  a7e830:	6a 02                	push   0x2
  a7e832:	5a                   	pop    rdx
  a7e833:	e8 20 8c 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e838:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
  a7e83f:	00
  a7e840:	66 c7 47 f8 09 00    	mov    WORD PTR [rdi-0x8],0x9
  a7e846:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  a7e84d:	00
  a7e84e:	e8 a5 8c 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e853:	48 8d 9c 24 70 03 00 	lea    rbx,[rsp+0x370]
  a7e85a:	00
  a7e85b:	48 8d 35 72 d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd972]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e862:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
  a7e869:	00
  a7e86a:	e8 0f b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e86f:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
  a7e876:	00
  a7e877:	48 8d 35 06 a3 8d ff 	lea    rsi,[rip+0xffffffffff8da306]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e87e:	e8 fb b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e883:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  a7e88a:	00
  a7e88b:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
  a7e892:	00
  a7e893:	6a 02                	push   0x2
  a7e895:	5a                   	pop    rdx
  a7e896:	e8 bd 8b 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e89b:	48 8d bc 24 78 03 00 	lea    rdi,[rsp+0x378]
  a7e8a2:	00
  a7e8a3:	66 c7 47 f8 0a 00    	mov    WORD PTR [rdi-0x8],0xa
  a7e8a9:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
  a7e8b0:	00
  a7e8b1:	e8 42 8c 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e8b6:	48 8d 9c 24 90 03 00 	lea    rbx,[rsp+0x390]
  a7e8bd:	00
  a7e8be:	48 8d 35 0f d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd90f]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e8c5:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
  a7e8cc:	00
  a7e8cd:	e8 ac b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e8d2:	48 8d bc 24 88 02 00 	lea    rdi,[rsp+0x288]
  a7e8d9:	00
  a7e8da:	48 8d 35 a3 a2 8d ff 	lea    rsi,[rip+0xffffffffff8da2a3]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e8e1:	e8 98 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e8e6:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  a7e8ed:	00
  a7e8ee:	48 8d b4 24 70 02 00 	lea    rsi,[rsp+0x270]
  a7e8f5:	00
  a7e8f6:	6a 02                	push   0x2
  a7e8f8:	5a                   	pop    rdx
  a7e8f9:	e8 5a 8b 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e8fe:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  a7e905:	00
  a7e906:	66 c7 47 f8 0b 00    	mov    WORD PTR [rdi-0x8],0xb
  a7e90c:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  a7e913:	00
  a7e914:	e8 df 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e919:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
  a7e920:	00
  a7e921:	48 8d 35 ac d8 8d ff 	lea    rsi,[rip+0xffffffffff8dd8ac]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e928:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  a7e92f:	00
  a7e930:	e8 49 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e935:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
  a7e93c:	00
  a7e93d:	48 8d 35 40 a2 8d ff 	lea    rsi,[rip+0xffffffffff8da240]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e944:	e8 35 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e949:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  a7e950:	00
  a7e951:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
  a7e958:	00
  a7e959:	6a 02                	push   0x2
  a7e95b:	5a                   	pop    rdx
  a7e95c:	e8 f7 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e961:	48 8d bc 24 b8 03 00 	lea    rdi,[rsp+0x3b8]
  a7e968:	00
  a7e969:	66 c7 47 f8 0c 00    	mov    WORD PTR [rdi-0x8],0xc
  a7e96f:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
  a7e976:	00
  a7e977:	e8 7c 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e97c:	48 8d 9c 24 d0 03 00 	lea    rbx,[rsp+0x3d0]
  a7e983:	00
  a7e984:	48 8d 35 49 d8 8d ff 	lea    rsi,[rip+0xffffffffff8dd849]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e98b:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
  a7e992:	00
  a7e993:	e8 e6 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e998:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
  a7e99f:	00
  a7e9a0:	48 8d 35 dd a1 8d ff 	lea    rsi,[rip+0xffffffffff8da1dd]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e9a7:	e8 d2 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e9ac:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  a7e9b1:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
  a7e9b8:	00
  a7e9b9:	6a 02                	push   0x2
  a7e9bb:	5a                   	pop    rdx
  a7e9bc:	e8 97 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e9c1:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  a7e9c8:	00
  a7e9c9:	66 c7 47 f8 11 00    	mov    WORD PTR [rdi-0x8],0x11
  a7e9cf:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
  a7e9d4:	e8 1f 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e9d9:	48 8d 9c 24 f0 03 00 	lea    rbx,[rsp+0x3f0]
  a7e9e0:	00
  a7e9e1:	48 8d 35 ec d7 8d ff 	lea    rsi,[rip+0xffffffffff8dd7ec]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e9e8:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  a7e9ef:	00
  a7e9f0:	e8 89 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e9f5:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
  a7e9fc:	00
  a7e9fd:	48 8d 35 80 a1 8d ff 	lea    rsi,[rip+0xffffffffff8da180]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7ea04:	e8 75 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7ea09:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  a7ea0e:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
  a7ea15:	00
  a7ea16:	6a 02                	push   0x2
  a7ea18:	5a                   	pop    rdx
  a7ea19:	e8 3a 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7ea1e:	48 8d bc 24 f8 03 00 	lea    rdi,[rsp+0x3f8]
  a7ea25:	00
  a7ea26:	66 c7 47 f8 12 00    	mov    WORD PTR [rdi-0x8],0x12
  a7ea2c:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
  a7ea31:	e8 c2 8a 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7ea36:	48 8d 9c 24 10 04 00 	lea    rbx,[rsp+0x410]
  a7ea3d:	00
  a7ea3e:	48 8d 35 8f d7 8d ff 	lea    rsi,[rip+0xffffffffff8dd78f]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
```
Relevant refs in this target window:

```text
  a7e8b6:	48 8d 9c 24 90 03 00 	lea    rbx,[rsp+0x390]
  a7e8e6:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  a7e8fe:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  a7e90c:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  a7ea36:	48 8d 9c 24 10 04 00 	lea    rbx,[rsp+0x410]
```
### target `0xa7e773`

```text
  a7e689:	4c 8b 3d b0 33 e3 00 	mov    r15,QWORD PTR [rip+0xe333b0]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a7e690:	4c 8d 25 69 59 d7 00 	lea    r12,[rip+0xd75969]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a7e697:	4c 89 ff             	mov    rdi,r15
  a7e69a:	4c 89 f6             	mov    rsi,r14
  a7e69d:	4c 89 e2             	mov    rdx,r12
  a7e6a0:	e8 bb f7 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a7e6a5:	48 8d 05 00 e6 94 ff 	lea    rax,[rip+0xffffffffff94e600]        # 3cccac <_ZTSN5boost9exceptionE@@Base+0x2d68e>
  a7e6ac:	48 89 03             	mov    QWORD PTR [rbx],rax
  a7e6af:	c7 43 08 f2 ee 7e 63 	mov    DWORD PTR [rbx+0x8],0x637eeef2
  a7e6b6:	48 8d 1d 9b 67 f6 00 	lea    rbx,[rip+0xf6679b]        # 19e4e58 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1888>
  a7e6bd:	49 89 e6             	mov    r14,rsp
  a7e6c0:	48 89 df             	mov    rdi,rbx
  a7e6c3:	4c 89 f6             	mov    rsi,r14
  a7e6c6:	e8 df 36 d4 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a7e6cb:	4c 89 ff             	mov    rdi,r15
  a7e6ce:	48 89 de             	mov    rsi,rbx
  a7e6d1:	4c 89 e2             	mov    rdx,r12
  a7e6d4:	e8 87 f7 d6 00       	call   17ede60 <__cxa_atexit@plt>
  a7e6d9:	48 8d 05 e5 e5 94 ff 	lea    rax,[rip+0xffffffffff94e5e5]        # 3cccc5 <_ZTSN5boost9exceptionE@@Base+0x2d6a7>
  a7e6e0:	49 89 06             	mov    QWORD PTR [r14],rax
  a7e6e3:	41 c7 46 08 3d dc e9 	mov    DWORD PTR [r14+0x8],0x89e9dc3d
  a7e6ea:	89
  a7e6eb:	48 8d 3d 7e 67 f6 00 	lea    rdi,[rip+0xf6677e]        # 19e4e70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x18a0>
  a7e6f2:	48 89 e6             	mov    rsi,rsp
  a7e6f5:	e8 b0 36 d4 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  a7e6fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7e701:	00 00
  a7e703:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  a7e708:	75 25                	jne    a7e72f <JNI_OnUnload@@Base+0x5ffc>
  a7e70a:	48 8b 3d 2f 33 e3 00 	mov    rdi,QWORD PTR [rip+0xe3332f]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>
  a7e711:	48 8d 35 58 67 f6 00 	lea    rsi,[rip+0xf66758]        # 19e4e70 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x18a0>
  a7e718:	48 8d 15 e1 58 d7 00 	lea    rdx,[rip+0xd758e1]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a7e71f:	48 83 c4 18          	add    rsp,0x18
  a7e723:	5b                   	pop    rbx
  a7e724:	41 5c                	pop    r12
  a7e726:	41 5e                	pop    r14
  a7e728:	41 5f                	pop    r15
  a7e72a:	e9 31 f7 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a7e72f:	e8 7c 13 d7 00       	call   17efab0 <__stack_chk_fail@plt>
  a7e734:	53                   	push   rbx
  a7e735:	48 8d 1d 6c 67 f6 00 	lea    rbx,[rip+0xf6676c]        # 19e4ea8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x18d8>
  a7e73c:	48 8d 35 fc e5 94 ff 	lea    rsi,[rip+0xffffffffff94e5fc]        # 3ccd3f <_ZTSN5boost9exceptionE@@Base+0x2d721>
  a7e743:	48 8d 0d fb e5 94 ff 	lea    rcx,[rip+0xffffffffff94e5fb]        # 3ccd45 <_ZTSN5boost9exceptionE@@Base+0x2d727>
  a7e74a:	6a 05                	push   0x5
  a7e74c:	5a                   	pop    rdx
  a7e74d:	6a 02                	push   0x2
  a7e74f:	41 59                	pop    r9
  a7e751:	48 89 df             	mov    rdi,rbx
  a7e754:	49 89 d0             	mov    r8,rdx
  a7e757:	e8 46 b3 0d 00       	call   b59aa2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6a42>
  a7e75c:	48 8d 3d 25 4d c0 00 	lea    rdi,[rip+0xc04d25]        # 1683488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375f4>
  a7e763:	48 8d 15 96 58 d7 00 	lea    rdx,[rip+0xd75896]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a7e76a:	48 89 de             	mov    rsi,rbx
  a7e76d:	5b                   	pop    rbx
  a7e76e:	e9 ed f6 d6 00       	jmp    17ede60 <__cxa_atexit@plt>
  a7e773:	55                   	push   rbp
  a7e774:	41 57                	push   r15
  a7e776:	41 56                	push   r14
  a7e778:	41 55                	push   r13
  a7e77a:	41 54                	push   r12
  a7e77c:	53                   	push   rbx
  a7e77d:	48 81 ec 98 04 00 00 	sub    rsp,0x498
  a7e784:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  a7e78b:	00 00
  a7e78d:	48 89 84 24 90 04 00 	mov    QWORD PTR [rsp+0x490],rax
  a7e794:	00
  a7e795:	48 8d 35 38 da 8d ff 	lea    rsi,[rip+0xffffffffff8dda38]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e79c:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  a7e7a3:	00
  a7e7a4:	e8 d5 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e7a9:	48 8d bc 24 18 03 00 	lea    rdi,[rsp+0x318]
  a7e7b0:	00
  a7e7b1:	48 8d 35 cc a3 8d ff 	lea    rsi,[rip+0xffffffffff8da3cc]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e7b8:	e8 c1 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e7bd:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  a7e7c4:	00
  a7e7c5:	48 8d b4 24 00 03 00 	lea    rsi,[rsp+0x300]
  a7e7cc:	00
  a7e7cd:	6a 02                	push   0x2
  a7e7cf:	5a                   	pop    rdx
  a7e7d0:	e8 83 8c 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e7d5:	48 8d bc 24 38 03 00 	lea    rdi,[rsp+0x338]
  a7e7dc:	00
  a7e7dd:	66 c7 47 f8 08 00    	mov    WORD PTR [rdi-0x8],0x8
  a7e7e3:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
  a7e7ea:	00
  a7e7eb:	e8 08 8d 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e7f0:	48 8d 9c 24 50 03 00 	lea    rbx,[rsp+0x350]
  a7e7f7:	00
  a7e7f8:	48 8d 35 d5 d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd9d5]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e7ff:	48 8d bc 24 d0 02 00 	lea    rdi,[rsp+0x2d0]
  a7e806:	00
  a7e807:	e8 72 b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e80c:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
  a7e813:	00
  a7e814:	48 8d 35 69 a3 8d ff 	lea    rsi,[rip+0xffffffffff8da369]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e81b:	e8 5e b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e820:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  a7e827:	00
  a7e828:	48 8d b4 24 d0 02 00 	lea    rsi,[rsp+0x2d0]
  a7e82f:	00
  a7e830:	6a 02                	push   0x2
  a7e832:	5a                   	pop    rdx
  a7e833:	e8 20 8c 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e838:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
  a7e83f:	00
  a7e840:	66 c7 47 f8 09 00    	mov    WORD PTR [rdi-0x8],0x9
  a7e846:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  a7e84d:	00
  a7e84e:	e8 a5 8c 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e853:	48 8d 9c 24 70 03 00 	lea    rbx,[rsp+0x370]
  a7e85a:	00
  a7e85b:	48 8d 35 72 d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd972]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e862:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
  a7e869:	00
  a7e86a:	e8 0f b2 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e86f:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
  a7e876:	00
  a7e877:	48 8d 35 06 a3 8d ff 	lea    rsi,[rip+0xffffffffff8da306]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e87e:	e8 fb b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e883:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  a7e88a:	00
  a7e88b:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
  a7e892:	00
  a7e893:	6a 02                	push   0x2
  a7e895:	5a                   	pop    rdx
  a7e896:	e8 bd 8b 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e89b:	48 8d bc 24 78 03 00 	lea    rdi,[rsp+0x378]
  a7e8a2:	00
  a7e8a3:	66 c7 47 f8 0a 00    	mov    WORD PTR [rdi-0x8],0xa
  a7e8a9:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
  a7e8b0:	00
  a7e8b1:	e8 42 8c 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e8b6:	48 8d 9c 24 90 03 00 	lea    rbx,[rsp+0x390]
  a7e8bd:	00
  a7e8be:	48 8d 35 0f d9 8d ff 	lea    rsi,[rip+0xffffffffff8dd90f]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e8c5:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
  a7e8cc:	00
  a7e8cd:	e8 ac b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e8d2:	48 8d bc 24 88 02 00 	lea    rdi,[rsp+0x288]
  a7e8d9:	00
  a7e8da:	48 8d 35 a3 a2 8d ff 	lea    rsi,[rip+0xffffffffff8da2a3]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e8e1:	e8 98 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e8e6:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  a7e8ed:	00
  a7e8ee:	48 8d b4 24 70 02 00 	lea    rsi,[rsp+0x270]
  a7e8f5:	00
  a7e8f6:	6a 02                	push   0x2
  a7e8f8:	5a                   	pop    rdx
  a7e8f9:	e8 5a 8b 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e8fe:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  a7e905:	00
  a7e906:	66 c7 47 f8 0b 00    	mov    WORD PTR [rdi-0x8],0xb
  a7e90c:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  a7e913:	00
  a7e914:	e8 df 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e919:	48 8d 9c 24 b0 03 00 	lea    rbx,[rsp+0x3b0]
  a7e920:	00
  a7e921:	48 8d 35 ac d8 8d ff 	lea    rsi,[rip+0xffffffffff8dd8ac]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e928:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
  a7e92f:	00
  a7e930:	e8 49 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e935:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
  a7e93c:	00
  a7e93d:	48 8d 35 40 a2 8d ff 	lea    rsi,[rip+0xffffffffff8da240]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e944:	e8 35 b1 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e949:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  a7e950:	00
  a7e951:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
  a7e958:	00
  a7e959:	6a 02                	push   0x2
  a7e95b:	5a                   	pop    rdx
  a7e95c:	e8 f7 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e961:	48 8d bc 24 b8 03 00 	lea    rdi,[rsp+0x3b8]
  a7e968:	00
  a7e969:	66 c7 47 f8 0c 00    	mov    WORD PTR [rdi-0x8],0xc
  a7e96f:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
  a7e976:	00
  a7e977:	e8 7c 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e97c:	48 8d 9c 24 d0 03 00 	lea    rbx,[rsp+0x3d0]
  a7e983:	00
  a7e984:	48 8d 35 49 d8 8d ff 	lea    rsi,[rip+0xffffffffff8dd849]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e98b:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
  a7e992:	00
  a7e993:	e8 e6 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e998:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
  a7e99f:	00
  a7e9a0:	48 8d 35 dd a1 8d ff 	lea    rsi,[rip+0xffffffffff8da1dd]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7e9a7:	e8 d2 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e9ac:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  a7e9b1:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
  a7e9b8:	00
  a7e9b9:	6a 02                	push   0x2
  a7e9bb:	5a                   	pop    rdx
  a7e9bc:	e8 97 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7e9c1:	48 8d bc 24 d8 03 00 	lea    rdi,[rsp+0x3d8]
  a7e9c8:	00
  a7e9c9:	66 c7 47 f8 11 00    	mov    WORD PTR [rdi-0x8],0x11
  a7e9cf:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
  a7e9d4:	e8 1f 8b 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7e9d9:	48 8d 9c 24 f0 03 00 	lea    rbx,[rsp+0x3f0]
  a7e9e0:	00
  a7e9e1:	48 8d 35 ec d7 8d ff 	lea    rsi,[rip+0xffffffffff8dd7ec]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7e9e8:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
  a7e9ef:	00
  a7e9f0:	e8 89 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7e9f5:	48 8d bc 24 f8 01 00 	lea    rdi,[rsp+0x1f8]
  a7e9fc:	00
  a7e9fd:	48 8d 35 80 a1 8d ff 	lea    rsi,[rip+0xffffffffff8da180]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7ea04:	e8 75 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7ea09:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  a7ea0e:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
  a7ea15:	00
  a7ea16:	6a 02                	push   0x2
  a7ea18:	5a                   	pop    rdx
  a7ea19:	e8 3a 8a 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7ea1e:	48 8d bc 24 f8 03 00 	lea    rdi,[rsp+0x3f8]
  a7ea25:	00
  a7ea26:	66 c7 47 f8 12 00    	mov    WORD PTR [rdi-0x8],0x12
  a7ea2c:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
  a7ea31:	e8 c2 8a 05 00       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
  a7ea36:	48 8d 9c 24 10 04 00 	lea    rbx,[rsp+0x410]
  a7ea3d:	00
  a7ea3e:	48 8d 35 8f d7 8d ff 	lea    rsi,[rip+0xffffffffff8dd78f]        # 35c1d4 <_ZTSSt12bad_any_cast@@Base-0x33ff4>
  a7ea45:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
  a7ea4c:	00
  a7ea4d:	e8 2c b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7ea52:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]
  a7ea59:	00
  a7ea5a:	48 8d 35 23 a1 8d ff 	lea    rsi,[rip+0xffffffffff8da123]        # 358b84 <_ZTSSt12bad_any_cast@@Base-0x37644>
  a7ea61:	e8 18 b0 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  a7ea66:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
  a7ea6b:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
  a7ea72:	00
  a7ea73:	6a 02                	push   0x2
  a7ea75:	5a                   	pop    rdx
  a7ea76:	e8 dd 89 02 00       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  a7ea7b:	48 8d bc 24 18 04 00 	lea    rdi,[rsp+0x418]
  a7ea82:	00
  a7ea83:	66 c7 47 f8 34 00    	mov    WORD PTR [rdi-0x8],0x34
```
Relevant refs in this target window:

```text
  a7e8b6:	48 8d 9c 24 90 03 00 	lea    rbx,[rsp+0x390]
  a7e8e6:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
  a7e8fe:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
  a7e90c:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
  a7ea36:	48 8d 9c 24 10 04 00 	lea    rbx,[rsp+0x410]
```
### target `0xc85d5e`

```text
  c85ca0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  c85ca4:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
  c85ca8:	e8 af bb 95 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
  c85cad:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  c85cb2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c85cb9:	00 00
  c85cbb:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
  c85cc0:	75 3a                	jne    c85cfc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2c9c>
  c85cc2:	48 83 c4 48          	add    rsp,0x48
  c85cc6:	5b                   	pop    rbx
  c85cc7:	41 5c                	pop    r12
  c85cc9:	41 5d                	pop    r13
  c85ccb:	41 5e                	pop    r14
  c85ccd:	41 5f                	pop    r15
  c85ccf:	5d                   	pop    rbp
  c85cd0:	e9 b1 87 e1 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  c85cd5:	eb 00                	jmp    c85cd7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2c77>
  c85cd7:	48 89 c3             	mov    rbx,rax
  c85cda:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  c85cdf:	e8 a2 87 e1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c85ce4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c85ceb:	00 00
  c85ced:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
  c85cf2:	75 08                	jne    c85cfc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2c9c>
  c85cf4:	48 89 df             	mov    rdi,rbx
  c85cf7:	e8 d4 9f de ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  c85cfc:	e8 af 9d b6 00       	call   17efab0 <__stack_chk_fail@plt>
  c85d01:	cc                   	int3
  c85d02:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  c85d05:	48 89 07             	mov    QWORD PTR [rdi],rax
  c85d08:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  c85d0c:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  c85d10:	48 85 c0             	test   rax,rax
  c85d13:	74 05                	je     c85d1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2cba>
  c85d15:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  c85d1a:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  c85d1e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  c85d22:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
  c85d26:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
  c85d2a:	48 85 c0             	test   rax,rax
  c85d2d:	74 05                	je     c85d34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2cd4>
  c85d2f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  c85d34:	0f 10 46 20          	movups xmm0,XMMWORD PTR [rsi+0x20]
  c85d38:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
  c85d3c:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
  c85d40:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
  c85d44:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
  c85d48:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
  c85d4c:	48 85 c0             	test   rax,rax
  c85d4f:	74 05                	je     c85d56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2cf6>
  c85d51:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
  c85d56:	8b 46 40             	mov    eax,DWORD PTR [rsi+0x40]
  c85d59:	89 47 40             	mov    DWORD PTR [rdi+0x40],eax
  c85d5c:	c3                   	ret
  c85d5d:	cc                   	int3
  c85d5e:	55                   	push   rbp
  c85d5f:	41 57                	push   r15
  c85d61:	41 56                	push   r14
  c85d63:	41 55                	push   r13
  c85d65:	41 54                	push   r12
  c85d67:	53                   	push   rbx
  c85d68:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  c85d6f:	49 89 cf             	mov    r15,rcx
  c85d72:	49 89 d4             	mov    r12,rdx
  c85d75:	49 89 f6             	mov    r14,rsi
  c85d78:	48 89 fb             	mov    rbx,rdi
  c85d7b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c85d82:	00 00
  c85d84:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  c85d8b:	00
  c85d8c:	48 83 c6 08          	add    rsi,0x8
  c85d90:	48 89 d7             	mov    rdi,rdx
  c85d93:	e8 56 99 e1 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
  c85d98:	84 c0                	test   al,al
  c85d9a:	0f 84 34 01 00 00    	je     c85ed4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2e74>
  c85da0:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  c85da5:	e8 37 b9 95 00       	call   15e16e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426c65>
  c85daa:	3d 40 44 98 90       	cmp    eax,0x90984440
  c85daf:	0f 84 cd 06 00 00    	je     c86482 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3422>
  c85db5:	3d 01 a1 61 97       	cmp    eax,0x9761a101
  c85dba:	0f 84 84 02 00 00    	je     c86044 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2fe4>
  c85dc0:	3d 4e e3 bf a7       	cmp    eax,0xa7bfe34e
  c85dc5:	0f 84 2b 01 00 00    	je     c85ef6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2e96>
  c85dcb:	3d 15 06 8c ac       	cmp    eax,0xac8c0615
  c85dd0:	0f 84 e1 07 00 00    	je     c865b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3557>
  c85dd6:	3d f5 2e 02 fd       	cmp    eax,0xfd022ef5
  c85ddb:	0f 84 ec 02 00 00    	je     c860cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d306d>
  c85de1:	3d 7d 61 74 79       	cmp    eax,0x7974617d
  c85de6:	0f 84 72 08 00 00    	je     c8665e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d35fe>
  c85dec:	3d 28 b3 dc 0c       	cmp    eax,0xcdcb328
  c85df1:	0f 84 05 05 00 00    	je     c862fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d329c>
  c85df7:	3d 97 bb 51 23       	cmp    eax,0x2351bb97
  c85dfc:	0f 84 0d 07 00 00    	je     c8650f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d34af>
  c85e02:	3d b9 e2 5f 4b       	cmp    eax,0x4b5fe2b9
  c85e07:	0f 84 b5 05 00 00    	je     c863c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3362>
  c85e0d:	3d 5c 63 4b 4e       	cmp    eax,0x4e4b635c
  c85e12:	0f 84 9e 01 00 00    	je     c85fb6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2f56>
  c85e18:	3d 0f d6 9b 68       	cmp    eax,0x689bd60f
  c85e1d:	0f 84 38 04 00 00    	je     c8625b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d31fb>
  c85e23:	3d 2e db aa 73       	cmp    eax,0x73aadb2e
  c85e28:	0f 84 5e 03 00 00    	je     c8618c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d312c>
  c85e2e:	3d 3c 8b 1c 0b       	cmp    eax,0xb1c8b3c
  c85e33:	0f 85 9b 00 00 00    	jne    c85ed4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d2e74>
  c85e39:	4c 8d ac 24 08 03 00 	lea    r13,[rsp+0x308]
  c85e40:	00
  c85e41:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
  c85e46:	48 8d 2d 13 67 b9 00 	lea    rbp,[rip+0xb96713]        # 181c560 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12220>
  c85e4d:	49 89 6d 00          	mov    QWORD PTR [r13+0x0],rbp
  c85e51:	49 83 c4 30          	add    r12,0x30
  c85e55:	0f 57 c0             	xorps  xmm0,xmm0
  c85e58:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
  c85e5d:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
  c85e62:	4c 89 e7             	mov    rdi,r12
  c85e65:	e8 cc 59 df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c85e6a:	4c 89 ef             	mov    rdi,r13
  c85e6d:	48 89 c6             	mov    rsi,rax
  c85e70:	e8 dd 99 af 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
  c85e75:	84 c0                	test   al,al
  c85e77:	0f 84 c8 08 00 00    	je     c86745 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d36e5>
  c85e7d:	48 83 a4 24 68 03 00 	and    QWORD PTR [rsp+0x368],0x0
  c85e84:	00 00
  c85e86:	48 89 ac 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rbp
  c85e8d:	00
  c85e8e:	0f 57 c0             	xorps  xmm0,xmm0
  c85e91:	0f 11 84 24 70 03 00 	movups XMMWORD PTR [rsp+0x370],xmm0
  c85e98:	00
  c85e99:	0f 11 84 24 80 03 00 	movups XMMWORD PTR [rsp+0x380],xmm0
  c85ea0:	00
  c85ea1:	48 8b 84 24 10 03 00 	mov    rax,QWORD PTR [rsp+0x310]
  c85ea8:	00
  c85ea9:	a8 01                	test   al,0x1
  c85eab:	0f 85 3b 0f 00 00    	jne    c86dec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3d8c>
  c85eb1:	48 85 c0             	test   rax,rax
  c85eb4:	0f 84 64 0b 00 00    	je     c86a1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d39be>
  c85eba:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  c85ec1:	00
  c85ec2:	48 8d b4 24 08 03 00 	lea    rsi,[rsp+0x308]
  c85ec9:	00
  c85eca:	e8 91 8b ac 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
  c85ecf:	e9 82 0b 00 00       	jmp    c86a56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d39f6>
  c85ed4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c85edb:	00 00
  c85edd:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  c85ee4:	00
  c85ee5:	0f 85 49 0f 00 00    	jne    c86e34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3dd4>
  c85eeb:	0f 57 c0             	xorps  xmm0,xmm0
  c85eee:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  c85ef1:	e9 b1 0e 00 00       	jmp    c86da7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3d47>
  c85ef6:	0f 57 c0             	xorps  xmm0,xmm0
  c85ef9:	4c 8d ac 24 08 03 00 	lea    r13,[rsp+0x308]
  c85f00:	00
  c85f01:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
  c85f06:	48 8d 05 d3 62 b9 00 	lea    rax,[rip+0xb962d3]        # 181c1e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11ea0>
  c85f0d:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c85f11:	48 8d 2d e0 98 7b ff 	lea    rbp,[rip+0xffffffffff7b98e0]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
  c85f18:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
  c85f1c:	49 89 6d 20          	mov    QWORD PTR [r13+0x20],rbp
  c85f20:	49 89 6d 28          	mov    QWORD PTR [r13+0x28],rbp
  c85f24:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
  c85f29:	49 83 c4 30          	add    r12,0x30
  c85f2d:	4c 89 e7             	mov    rdi,r12
  c85f30:	e8 01 59 df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c85f35:	4c 89 ef             	mov    rdi,r13
  c85f38:	48 89 c6             	mov    rsi,rax
  c85f3b:	e8 12 99 af 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
  c85f40:	0f 57 c0             	xorps  xmm0,xmm0
  c85f43:	84 c0                	test   al,al
  c85f45:	0f 84 bc 07 00 00    	je     c86707 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d36a7>
  c85f4b:	0f 11 84 24 90 01 00 	movups XMMWORD PTR [rsp+0x190],xmm0
  c85f52:	00
  c85f53:	48 8d 05 86 62 b9 00 	lea    rax,[rip+0xb96286]        # 181c1e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11ea0>
  c85f5a:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
  c85f61:	00
  c85f62:	48 89 ac 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rbp
  c85f69:	00
  c85f6a:	48 89 ac 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rbp
  c85f71:	00
  c85f72:	48 89 ac 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rbp
  c85f79:	00
  c85f7a:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
  c85f81:	00 00
  c85f83:	48 8b 84 24 10 03 00 	mov    rax,QWORD PTR [rsp+0x310]
  c85f8a:	00
  c85f8b:	a8 01                	test   al,0x1
  c85f8d:	0f 85 29 0e 00 00    	jne    c86dbc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3d5c>
  c85f93:	48 85 c0             	test   rax,rax
  c85f96:	0f 84 cc 07 00 00    	je     c86768 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3708>
  c85f9c:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
  c85fa3:	00
  c85fa4:	48 8d b4 24 08 03 00 	lea    rsi,[rsp+0x308]
  c85fab:	00
  c85fac:	e8 af 8a ac 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
  c85fb1:	e9 ea 07 00 00       	jmp    c867a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3740>
  c85fb6:	4c 8d ac 24 08 03 00 	lea    r13,[rsp+0x308]
  c85fbd:	00
  c85fbe:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
  c85fc3:	48 8d 05 d6 64 b9 00 	lea    rax,[rip+0xb964d6]        # 181c4a0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12160>
  c85fca:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
  c85fce:	49 83 c4 30          	add    r12,0x30
  c85fd2:	0f 57 c0             	xorps  xmm0,xmm0
  c85fd5:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
  c85fda:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
  c85fdf:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
  c85fe4:	4c 89 e7             	mov    rdi,r12
  c85fe7:	e8 4a 58 df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c85fec:	4c 89 ef             	mov    rdi,r13
  c85fef:	48 89 c6             	mov    rsi,rax
  c85ff2:	e8 5b 98 af 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
  c85ff7:	84 c0                	test   al,al
  c85ff9:	0f 84 e8 06 00 00    	je     c866e7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3687>
  c85fff:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  c86006:	00
  c86007:	48 8d b4 24 08 03 00 	lea    rsi,[rsp+0x308]
  c8600e:	00
  c8600f:	e8 b2 0f 00 00       	call   c86fc6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3f66>
  c86014:	48 89 e7             	mov    rdi,rsp
  c86017:	4c 89 fe             	mov    rsi,r15
  c8601a:	e8 1a 49 e2 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
  c8601f:	49 8b 06             	mov    rax,QWORD PTR [r14]
  c86022:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
  c86029:	00
  c8602a:	49 89 e4             	mov    r12,rsp
  c8602d:	48 89 df             	mov    rdi,rbx
  c86030:	4c 89 f6             	mov    rsi,r14
  c86033:	4c 89 fa             	mov    rdx,r15
  c86036:	4c 89 e1             	mov    rcx,r12
  c86039:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
  c8603f:	e9 a1 02 00 00       	jmp    c862e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d3285>
  c86044:	4c 8d ac 24 08 03 00 	lea    r13,[rsp+0x308]
  c8604b:	00
  c8604c:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
  c86051:	48 8d 2d 48 65 b9 00 	lea    rbp,[rip+0xb96548]        # 181c5a0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12260>
  c86058:	49 89 6d 00          	mov    QWORD PTR [r13+0x0],rbp
  c8605c:	49 83 65 18 00       	and    QWORD PTR [r13+0x18],0x0
  c86061:	49 83 c4 30          	add    r12,0x30
  c86065:	4c 89 e7             	mov    rdi,r12
  c86068:	e8 c9 57 df ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  c8606d:	4c 89 ef             	mov    rdi,r13
  c86070:	48 89 c6             	mov    rsi,rax
  c86073:	e8 da 97 af 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
```
Relevant refs in this target window:

```text
  c85d68:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  c85d84:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  c85edd:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  c85f20:	49 89 6d 28          	mov    QWORD PTR [r13+0x28],rbp
  c860f7:	49 89 6d 28          	mov    QWORD PTR [r13+0x28],rbp
```
### target `0xe07ad0`

```text
  e07a01:	4c 89 f2             	mov    rdx,r14
  e07a04:	ff 50 60             	call   QWORD PTR [rax+0x60]
  e07a07:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
  e07a0e:	00
  e07a0f:	e8 c4 45 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e07a14:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e07a1b:	00 00
  e07a1d:	48 3b 84 24 e0 03 00 	cmp    rax,QWORD PTR [rsp+0x3e0]
  e07a24:	00
  e07a25:	0f 85 9f 00 00 00    	jne    e07aca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4b50>
  e07a2b:	48 81 c4 e8 03 00 00 	add    rsp,0x3e8
  e07a32:	5b                   	pop    rbx
  e07a33:	41 5c                	pop    r12
  e07a35:	41 5d                	pop    r13
  e07a37:	41 5e                	pop    r14
  e07a39:	41 5f                	pop    r15
  e07a3b:	5d                   	pop    rbp
  e07a3c:	c3                   	ret
  e07a3d:	48 89 c3             	mov    rbx,rax
  e07a40:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
  e07a47:	00
  e07a48:	e8 8b 45 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e07a4d:	eb 60                	jmp    e07aaf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4b35>
  e07a4f:	48 89 c3             	mov    rbx,rax
  e07a52:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  e07a59:	00
  e07a5a:	e8 57 d3 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e07a5f:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  e07a64:	e8 6f 45 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e07a69:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e07a6d:	e8 ee 6c 9e 00       	call   17ee760 <free@plt>
  e07a72:	eb 3b                	jmp    e07aaf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4b35>
  e07a74:	48 89 c3             	mov    rbx,rax
  e07a77:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
  e07a7e:	00
  e07a7f:	e8 e6 24 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07a84:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  e07a89:	e8 02 64 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07a8e:	48 89 e7             	mov    rdi,rsp
  e07a91:	e8 fa 63 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07a96:	eb 17                	jmp    e07aaf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4b35>
  e07a98:	48 89 c3             	mov    rbx,rax
  e07a9b:	48 8b bc 24 c8 03 00 	mov    rdi,QWORD PTR [rsp+0x3c8]
  e07aa2:	00
  e07aa3:	8b b4 24 d8 03 00 00 	mov    esi,DWORD PTR [rsp+0x3d8]
  e07aaa:	e8 37 3a 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07aaf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e07ab6:	00 00
  e07ab8:	48 3b 84 24 e0 03 00 	cmp    rax,QWORD PTR [rsp+0x3e0]
  e07abf:	00
  e07ac0:	75 08                	jne    e07aca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4b50>
  e07ac2:	48 89 df             	mov    rdi,rbx
  e07ac5:	e8 06 82 c6 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e07aca:	e8 e1 7f 9e 00       	call   17efab0 <__stack_chk_fail@plt>
  e07acf:	cc                   	int3
  e07ad0:	55                   	push   rbp
  e07ad1:	41 57                	push   r15
  e07ad3:	41 56                	push   r14
  e07ad5:	41 55                	push   r13
  e07ad7:	41 54                	push   r12
  e07ad9:	53                   	push   rbx
  e07ada:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e07ae1:	48 89 d3             	mov    rbx,rdx
  e07ae4:	49 89 f7             	mov    r15,rsi
  e07ae7:	49 89 fe             	mov    r14,rdi
  e07aea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e07af1:	00 00
  e07af3:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e07afa:	00
  e07afb:	e8 c7 2d 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e07b00:	41 0f b6 4f 03       	movzx  ecx,BYTE PTR [r15+0x3]
  e07b05:	41 0f b6 57 02       	movzx  edx,BYTE PTR [r15+0x2]
  e07b0a:	4c 8d a4 24 60 03 00 	lea    r12,[rsp+0x360]
  e07b11:	00
  e07b12:	6a 10                	push   0x10
  e07b14:	41 58                	pop    r8
  e07b16:	4c 89 e7             	mov    rdi,r12
  e07b19:	4c 89 f6             	mov    rsi,r14
  e07b1c:	e8 fb 38 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e07b21:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e07b27:	74 2a                	je     e07b53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4bd9>
  e07b29:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  e07b2d:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e07b34:	00
  e07b35:	e8 56 62 cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e07b3a:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e07b41:	00
  e07b42:	8b b4 24 88 03 00 00 	mov    esi,DWORD PTR [rsp+0x388]
  e07b49:	e8 98 39 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07b4e:	e9 65 02 00 00       	jmp    e07db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4e3e>
  e07b53:	4c 8d ac 24 60 03 00 	lea    r13,[rsp+0x360]
  e07b5a:	00
  e07b5b:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e07b5f:	31 f6                	xor    esi,esi
  e07b61:	e8 80 39 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07b66:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e07b6a:	4c 89 e7             	mov    rdi,r12
  e07b6d:	e8 0d 59 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e07b72:	4c 89 ef             	mov    rdi,r13
  e07b75:	4c 89 fe             	mov    rsi,r15
  e07b78:	e8 73 84 86 00       	call   166fff0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2415c>
  e07b7d:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e07b81:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e07b85:	48 89 e5             	mov    rbp,rsp
  e07b88:	48 89 ef             	mov    rdi,rbp
  e07b8b:	e8 75 2e 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e07b90:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e07b94:	e8 c7 6b 9e 00       	call   17ee760 <free@plt>
  e07b99:	49 8b be f0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1f0]
  e07ba0:	48 89 ee             	mov    rsi,rbp
  e07ba3:	e8 70 2e 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e07ba8:	84 c0                	test   al,al
  e07baa:	0f 84 93 00 00 00    	je     e07c43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4cc9>
  e07bb0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e07bb5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e07bba:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e07bbe:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e07bc3:	0f 57 c0             	xorps  xmm0,xmm0
  e07bc6:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e07bca:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e07bd0:	49 8d 76 10          	lea    rsi,[r14+0x10]
  e07bd4:	4c 8d bc 24 f0 02 00 	lea    r15,[rsp+0x2f0]
  e07bdb:	00
  e07bdc:	4c 89 ff             	mov    rdi,r15
  e07bdf:	48 89 da             	mov    rdx,rbx
  e07be2:	e8 4a 2e 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e07be7:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e07bee:	00
  e07bef:	4c 89 fe             	mov    rsi,r15
  e07bf2:	e8 55 2e 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e07bf7:	49 81 c6 d0 01 00 00 	add    r14,0x1d0
  e07bfe:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
  e07c03:	4c 8d bc 24 30 03 00 	lea    r15,[rsp+0x330]
  e07c0a:	00
  e07c0b:	4c 89 f7             	mov    rdi,r14
  e07c0e:	48 89 de             	mov    rsi,rbx
  e07c11:	4c 89 fa             	mov    rdx,r15
  e07c14:	e8 ef 2e 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e07c19:	4c 89 ff             	mov    rdi,r15
  e07c1c:	e8 49 23 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07c21:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e07c28:	00
  e07c29:	e8 3c 23 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07c2e:	48 89 df             	mov    rdi,rbx
  e07c31:	e8 5a 62 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07c36:	48 89 e7             	mov    rdi,rsp
  e07c39:	e8 52 62 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07c3e:	e9 75 01 00 00       	jmp    e07db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4e3e>
  e07c43:	48 89 e7             	mov    rdi,rsp
  e07c46:	e8 45 62 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07c4b:	41 8a 86 e8 02 00 00 	mov    al,BYTE PTR [r14+0x2e8]
  e07c52:	a8 01                	test   al,0x1
  e07c54:	0f 85 df 00 00 00    	jne    e07d39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4dbf>
  e07c5a:	4d 8d ae d8 13 00 00 	lea    r13,[r14+0x13d8]
  e07c61:	e8 e0 2f 9d 00       	call   17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>
  e07c66:	4c 89 ef             	mov    rdi,r13
  e07c69:	48 89 c6             	mov    rsi,rax
  e07c6c:	e8 e1 fc 9c 00       	call   17d7952 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3773>
  e07c71:	84 c0                	test   al,al
  e07c73:	0f 84 f8 00 00 00    	je     e07d71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4df7>
  e07c79:	49 8b be 50 03 00 00 	mov    rdi,QWORD PTR [r14+0x350]
  e07c80:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e07c83:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e07c89:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e07c8d:	48 89 c6             	mov    rsi,rax
  e07c90:	e8 eb 63 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e07c95:	49 89 e5             	mov    r13,rsp
  e07c98:	4c 89 ef             	mov    rdi,r13
  e07c9b:	4c 89 fe             	mov    rsi,r15
  e07c9e:	e8 4d 83 86 00       	call   166fff0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2415c>
  e07ca3:	4d 8b be 50 03 00 00 	mov    r15,QWORD PTR [r14+0x350]
  e07caa:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  e07caf:	48 89 ef             	mov    rdi,rbp
  e07cb2:	4c 89 e6             	mov    rsi,r12
  e07cb5:	e8 c4 41 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e07cba:	48 8d 35 df 4a 55 ff 	lea    rsi,[rip+0xffffffffff554adf]        # 35c7a0 <_ZTSSt12bad_any_cast@@Base-0x33a28>
  e07cc1:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e07cc8:	00
  e07cc9:	48 89 ea             	mov    rdx,rbp
  e07ccc:	e8 89 57 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e07cd1:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e07cd5:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e07cd9:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  e07ce0:	00
  e07ce1:	4c 89 f6             	mov    rsi,r14
  e07ce4:	48 89 da             	mov    rdx,rbx
  e07ce7:	e8 c2 2e 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e07cec:	4d 29 e5             	sub    r13,r12
  e07cef:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e07cf2:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
  e07cf9:	00
  e07cfa:	4c 8d b4 24 60 03 00 	lea    r14,[rsp+0x360]
  e07d01:	00
  e07d02:	4c 89 ff             	mov    rdi,r15
  e07d05:	48 89 de             	mov    rsi,rbx
  e07d08:	4c 89 e2             	mov    rdx,r12
  e07d0b:	4c 89 e9             	mov    rcx,r13
  e07d0e:	4d 89 f0             	mov    r8,r14
  e07d11:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e07d14:	4c 89 f7             	mov    rdi,r14
  e07d17:	e8 4e 22 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07d1c:	48 89 df             	mov    rdi,rbx
  e07d1f:	e8 92 d0 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e07d24:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e07d29:	e8 aa 42 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e07d2e:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e07d32:	e8 29 6a 9e 00       	call   17ee760 <free@plt>
  e07d37:	eb 7f                	jmp    e07db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4e3e>
  e07d39:	4d 8b b6 40 03 00 00 	mov    r14,QWORD PTR [r14+0x340]
  e07d40:	4c 8d a4 24 38 02 00 	lea    r12,[rsp+0x238]
  e07d47:	00
  e07d48:	4c 89 e7             	mov    rdi,r12
  e07d4b:	4c 89 fe             	mov    rsi,r15
  e07d4e:	e8 ef fc 85 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
  e07d53:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e07d56:	4c 89 f7             	mov    rdi,r14
  e07d59:	4c 89 e6             	mov    rsi,r12
  e07d5c:	48 89 da             	mov    rdx,rbx
  e07d5f:	ff 50 68             	call   QWORD PTR [rax+0x68]
  e07d62:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e07d69:	00
  e07d6a:	e8 69 42 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e07d6f:	eb 47                	jmp    e07db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4e3e>
  e07d71:	e8 51 2b 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e07d76:	48 8d 84 24 78 03 00 	lea    rax,[rsp+0x378]
  e07d7d:	00
  e07d7e:	c7 40 e8 10 00 00 00 	mov    DWORD PTR [rax-0x18],0x10
  e07d85:	48 8d 0d c4 b0 b7 00 	lea    rcx,[rip+0xb7b0c4]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
  e07d8c:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
  e07d90:	0f 57 c0             	xorps  xmm0,xmm0
  e07d93:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
  e07d96:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
  e07d9a:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  e07d9e:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e07da5:	00
  e07da6:	e8 e5 5f cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e07dab:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e07db2:	00
  e07db3:	e8 e6 69 c9 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
  e07db8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
Relevant refs in this target window:

```text
  e07ada:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e07af3:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e07b21:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e07c83:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e07dc1:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e07dcf:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e07e6e:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
```
### target `0xe07e86`

```text
  e07db8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e07dbf:	00 00
  e07dc1:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e07dc8:	00
  e07dc9:	0f 85 b1 00 00 00    	jne    e07e80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4f06>
  e07dcf:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e07dd6:	5b                   	pop    rbx
  e07dd7:	41 5c                	pop    r12
  e07dd9:	41 5d                	pop    r13
  e07ddb:	41 5e                	pop    r14
  e07ddd:	41 5f                	pop    r15
  e07ddf:	5d                   	pop    rbp
  e07de0:	c3                   	ret
  e07de1:	48 89 c3             	mov    rbx,rax
  e07de4:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e07deb:	00
  e07dec:	e8 ad 69 c9 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
  e07df1:	eb 72                	jmp    e07e65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4eeb>
  e07df3:	48 89 c3             	mov    rbx,rax
  e07df6:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e07dfd:	00
  e07dfe:	e8 b3 cf fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e07e03:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e07e08:	e8 cb 41 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e07e0d:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e07e11:	e8 4a 69 9e 00       	call   17ee760 <free@plt>
  e07e16:	eb 4d                	jmp    e07e65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4eeb>
  e07e18:	48 89 c3             	mov    rbx,rax
  e07e1b:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e07e22:	00
  e07e23:	e8 b0 41 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e07e28:	eb 3b                	jmp    e07e65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4eeb>
  e07e2a:	48 89 c3             	mov    rbx,rax
  e07e2d:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e07e34:	00
  e07e35:	e8 30 21 c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07e3a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  e07e3f:	e8 4c 60 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07e44:	48 89 e7             	mov    rdi,rsp
  e07e47:	e8 44 60 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07e4c:	eb 17                	jmp    e07e65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4eeb>
  e07e4e:	48 89 c3             	mov    rbx,rax
  e07e51:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e07e58:	00
  e07e59:	8b b4 24 88 03 00 00 	mov    esi,DWORD PTR [rsp+0x388]
  e07e60:	e8 81 36 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07e65:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e07e6c:	00 00
  e07e6e:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e07e75:	00
  e07e76:	75 08                	jne    e07e80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4f06>
  e07e78:	48 89 df             	mov    rdi,rbx
  e07e7b:	e8 50 7e c6 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e07e80:	e8 2b 7c 9e 00       	call   17efab0 <__stack_chk_fail@plt>
  e07e85:	cc                   	int3
  e07e86:	55                   	push   rbp
  e07e87:	41 57                	push   r15
  e07e89:	41 56                	push   r14
  e07e8b:	41 55                	push   r13
  e07e8d:	41 54                	push   r12
  e07e8f:	53                   	push   rbx
  e07e90:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e07e97:	49 89 d6             	mov    r14,rdx
  e07e9a:	49 89 f7             	mov    r15,rsi
  e07e9d:	48 89 fb             	mov    rbx,rdi
  e07ea0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e07ea7:	00 00
  e07ea9:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e07eb0:	00
  e07eb1:	e8 11 2a 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e07eb6:	41 0f b6 4f 03       	movzx  ecx,BYTE PTR [r15+0x3]
  e07ebb:	41 0f b6 57 02       	movzx  edx,BYTE PTR [r15+0x2]
  e07ec0:	4c 8d a4 24 60 03 00 	lea    r12,[rsp+0x360]
  e07ec7:	00
  e07ec8:	6a 0d                	push   0xd
  e07eca:	41 58                	pop    r8
  e07ecc:	4c 89 e7             	mov    rdi,r12
  e07ecf:	48 89 de             	mov    rsi,rbx
  e07ed2:	e8 45 35 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e07ed7:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e07edd:	74 2a                	je     e07f09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd4f8f>
  e07edf:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  e07ee3:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e07eea:	00
  e07eeb:	e8 a0 5e cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e07ef0:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e07ef7:	00
  e07ef8:	8b b4 24 88 03 00 00 	mov    esi,DWORD PTR [rsp+0x388]
  e07eff:	e8 e2 35 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07f04:	e9 fc 01 00 00       	jmp    e08105 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd518b>
  e07f09:	4c 8d ac 24 60 03 00 	lea    r13,[rsp+0x360]
  e07f10:	00
  e07f11:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e07f15:	31 f6                	xor    esi,esi
  e07f17:	e8 ca 35 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e07f1c:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e07f20:	4c 89 e7             	mov    rdi,r12
  e07f23:	e8 57 55 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e07f28:	4c 89 ef             	mov    rdi,r13
  e07f2b:	4c 89 fe             	mov    rsi,r15
  e07f2e:	e8 c3 81 86 00       	call   16700f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24262>
  e07f33:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e07f37:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e07f3b:	48 89 e5             	mov    rbp,rsp
  e07f3e:	48 89 ef             	mov    rdi,rbp
  e07f41:	e8 bf 2a 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e07f46:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e07f4a:	e8 11 68 9e 00       	call   17ee760 <free@plt>
  e07f4f:	48 8b bb f0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f0]
  e07f56:	48 89 ee             	mov    rsi,rbp
  e07f59:	e8 ba 2a 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e07f5e:	84 c0                	test   al,al
  e07f60:	0f 84 93 00 00 00    	je     e07ff9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd507f>
  e07f66:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e07f6b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e07f70:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e07f74:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e07f79:	0f 57 c0             	xorps  xmm0,xmm0
  e07f7c:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e07f80:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e07f86:	48 8d 73 10          	lea    rsi,[rbx+0x10]
  e07f8a:	4c 8d bc 24 f0 02 00 	lea    r15,[rsp+0x2f0]
  e07f91:	00
  e07f92:	4c 89 ff             	mov    rdi,r15
  e07f95:	4c 89 f2             	mov    rdx,r14
  e07f98:	e8 94 2a 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e07f9d:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e07fa4:	00
  e07fa5:	4c 89 fe             	mov    rsi,r15
  e07fa8:	e8 9f 2a 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e07fad:	48 81 c3 d0 01 00 00 	add    rbx,0x1d0
  e07fb4:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  e07fb9:	4c 8d bc 24 30 03 00 	lea    r15,[rsp+0x330]
  e07fc0:	00
  e07fc1:	48 89 df             	mov    rdi,rbx
  e07fc4:	4c 89 f6             	mov    rsi,r14
  e07fc7:	4c 89 fa             	mov    rdx,r15
  e07fca:	e8 39 2b 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e07fcf:	4c 89 ff             	mov    rdi,r15
  e07fd2:	e8 93 1f c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07fd7:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e07fde:	00
  e07fdf:	e8 86 1f c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e07fe4:	4c 89 f7             	mov    rdi,r14
  e07fe7:	e8 a4 5e 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07fec:	48 89 e7             	mov    rdi,rsp
  e07fef:	e8 9c 5e 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e07ff4:	e9 0c 01 00 00       	jmp    e08105 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd518b>
  e07ff9:	48 89 e7             	mov    rdi,rsp
  e07ffc:	e8 8f 5e 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e08001:	8a 83 e8 02 00 00    	mov    al,BYTE PTR [rbx+0x2e8]
  e08007:	a8 01                	test   al,0x1
  e08009:	0f 85 c0 00 00 00    	jne    e080cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5155>
  e0800f:	48 8b bb 50 03 00 00 	mov    rdi,QWORD PTR [rbx+0x350]
  e08016:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e08019:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e0801f:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e08023:	48 89 c6             	mov    rsi,rax
  e08026:	e8 55 60 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e0802b:	49 89 e5             	mov    r13,rsp
  e0802e:	4c 89 ef             	mov    rdi,r13
  e08031:	4c 89 fe             	mov    rsi,r15
  e08034:	e8 bd 80 86 00       	call   16700f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24262>
  e08039:	4c 8b bb 50 03 00 00 	mov    r15,QWORD PTR [rbx+0x350]
  e08040:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  e08045:	48 89 ef             	mov    rdi,rbp
  e08048:	4c 89 e6             	mov    rsi,r12
  e0804b:	e8 2e 3e 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e08050:	48 8d 35 1c 4c 54 ff 	lea    rsi,[rip+0xffffffffff544c1c]        # 34cc73 <_ZTSSt12bad_any_cast@@Base-0x43555>
  e08057:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e0805e:	00
  e0805f:	48 89 ea             	mov    rdx,rbp
  e08062:	e8 f3 53 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e08067:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e0806b:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e0806f:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  e08076:	00
  e08077:	48 89 de             	mov    rsi,rbx
  e0807a:	4c 89 f2             	mov    rdx,r14
  e0807d:	e8 2c 2b 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e08082:	4d 29 e5             	sub    r13,r12
  e08085:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e08088:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
  e0808f:	00
  e08090:	4c 8d b4 24 60 03 00 	lea    r14,[rsp+0x360]
  e08097:	00
  e08098:	4c 89 ff             	mov    rdi,r15
  e0809b:	48 89 de             	mov    rsi,rbx
  e0809e:	4c 89 e2             	mov    rdx,r12
  e080a1:	4c 89 e9             	mov    rcx,r13
  e080a4:	4d 89 f0             	mov    r8,r14
  e080a7:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e080aa:	4c 89 f7             	mov    rdi,r14
  e080ad:	e8 b8 1e c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e080b2:	48 89 df             	mov    rdi,rbx
  e080b5:	e8 fc cc fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e080ba:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e080bf:	e8 14 3f 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e080c4:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e080c8:	e8 93 66 9e 00       	call   17ee760 <free@plt>
  e080cd:	eb 36                	jmp    e08105 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd518b>
  e080cf:	48 8b 9b 40 03 00 00 	mov    rbx,QWORD PTR [rbx+0x340]
  e080d6:	4c 8d a4 24 38 02 00 	lea    r12,[rsp+0x238]
  e080dd:	00
  e080de:	4c 89 e7             	mov    rdi,r12
  e080e1:	4c 89 fe             	mov    rsi,r15
  e080e4:	e8 59 f9 85 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
  e080e9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e080ec:	48 89 df             	mov    rdi,rbx
  e080ef:	4c 89 e6             	mov    rsi,r12
  e080f2:	4c 89 f2             	mov    rdx,r14
  e080f5:	ff 50 70             	call   QWORD PTR [rax+0x70]
  e080f8:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e080ff:	00
  e08100:	e8 d3 3e 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e08105:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e0810c:	00 00
  e0810e:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e08115:	00
  e08116:	0f 85 9f 00 00 00    	jne    e081bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5241>
  e0811c:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e08123:	5b                   	pop    rbx
  e08124:	41 5c                	pop    r12
  e08126:	41 5d                	pop    r13
  e08128:	41 5e                	pop    r14
  e0812a:	41 5f                	pop    r15
  e0812c:	5d                   	pop    rbp
  e0812d:	c3                   	ret
  e0812e:	48 89 c3             	mov    rbx,rax
  e08131:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e08138:	00
  e08139:	e8 9a 3e 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e0813e:	eb 60                	jmp    e081a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5226>
  e08140:	48 89 c3             	mov    rbx,rax
  e08143:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e0814a:	00
  e0814b:	e8 66 cc fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e08150:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e08155:	e8 7e 3e 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e0815a:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
```
Relevant refs in this target window:

```text
  e07e90:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e07ea9:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e07ed7:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e08019:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e0810e:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e0811c:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e081a9:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e081ca:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e081e3:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e08211:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
```
### target `0xe081c0`

```text
  e080ef:	4c 89 e6             	mov    rsi,r12
  e080f2:	4c 89 f2             	mov    rdx,r14
  e080f5:	ff 50 70             	call   QWORD PTR [rax+0x70]
  e080f8:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e080ff:	00
  e08100:	e8 d3 3e 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e08105:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e0810c:	00 00
  e0810e:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e08115:	00
  e08116:	0f 85 9f 00 00 00    	jne    e081bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5241>
  e0811c:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e08123:	5b                   	pop    rbx
  e08124:	41 5c                	pop    r12
  e08126:	41 5d                	pop    r13
  e08128:	41 5e                	pop    r14
  e0812a:	41 5f                	pop    r15
  e0812c:	5d                   	pop    rbp
  e0812d:	c3                   	ret
  e0812e:	48 89 c3             	mov    rbx,rax
  e08131:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e08138:	00
  e08139:	e8 9a 3e 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e0813e:	eb 60                	jmp    e081a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5226>
  e08140:	48 89 c3             	mov    rbx,rax
  e08143:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e0814a:	00
  e0814b:	e8 66 cc fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e08150:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e08155:	e8 7e 3e 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e0815a:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e0815e:	e8 fd 65 9e 00       	call   17ee760 <free@plt>
  e08163:	eb 3b                	jmp    e081a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5226>
  e08165:	48 89 c3             	mov    rbx,rax
  e08168:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e0816f:	00
  e08170:	e8 f5 1d c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e08175:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  e0817a:	e8 11 5d 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e0817f:	48 89 e7             	mov    rdi,rsp
  e08182:	e8 09 5d 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e08187:	eb 17                	jmp    e081a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5226>
  e08189:	48 89 c3             	mov    rbx,rax
  e0818c:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e08193:	00
  e08194:	8b b4 24 88 03 00 00 	mov    esi,DWORD PTR [rsp+0x388]
  e0819b:	e8 46 33 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e081a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e081a7:	00 00
  e081a9:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e081b0:	00
  e081b1:	75 08                	jne    e081bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5241>
  e081b3:	48 89 df             	mov    rdi,rbx
  e081b6:	e8 15 7b c6 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e081bb:	e8 f0 78 9e 00       	call   17efab0 <__stack_chk_fail@plt>
  e081c0:	55                   	push   rbp
  e081c1:	41 57                	push   r15
  e081c3:	41 56                	push   r14
  e081c5:	41 55                	push   r13
  e081c7:	41 54                	push   r12
  e081c9:	53                   	push   rbx
  e081ca:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e081d1:	49 89 d6             	mov    r14,rdx
  e081d4:	49 89 f7             	mov    r15,rsi
  e081d7:	48 89 fb             	mov    rbx,rdi
  e081da:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e081e1:	00 00
  e081e3:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e081ea:	00
  e081eb:	e8 d7 26 86 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
  e081f0:	41 0f b6 4f 03       	movzx  ecx,BYTE PTR [r15+0x3]
  e081f5:	41 0f b6 57 02       	movzx  edx,BYTE PTR [r15+0x2]
  e081fa:	4c 8d a4 24 60 03 00 	lea    r12,[rsp+0x360]
  e08201:	00
  e08202:	6a 0e                	push   0xe
  e08204:	41 58                	pop    r8
  e08206:	4c 89 e7             	mov    rdi,r12
  e08209:	48 89 de             	mov    rsi,rbx
  e0820c:	e8 0b 32 00 00       	call   e0b41c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd84a2>
  e08211:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e08217:	74 2a                	je     e08243 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd52c9>
  e08219:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  e0821d:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
  e08224:	00
  e08225:	e8 66 5b cb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e0822a:	48 8b bc 24 78 03 00 	mov    rdi,QWORD PTR [rsp+0x378]
  e08231:	00
  e08232:	8b b4 24 88 03 00 00 	mov    esi,DWORD PTR [rsp+0x388]
  e08239:	e8 a8 32 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e0823e:	e9 fc 01 00 00       	jmp    e0843f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd54c5>
  e08243:	4c 8d ac 24 60 03 00 	lea    r13,[rsp+0x360]
  e0824a:	00
  e0824b:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
  e0824f:	31 f6                	xor    esi,esi
  e08251:	e8 90 32 00 00       	call   e0b4e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd856c>
  e08256:	4d 8d 67 18          	lea    r12,[r15+0x18]
  e0825a:	4c 89 e7             	mov    rdi,r12
  e0825d:	e8 1d 52 05 00       	call   e5d47f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24895>
  e08262:	4c 89 ef             	mov    rdi,r13
  e08265:	4c 89 fe             	mov    rsi,r15
  e08268:	e8 8f 7f 86 00       	call   16701fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24368>
  e0826d:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e08271:	49 8b 55 08          	mov    rdx,QWORD PTR [r13+0x8]
  e08275:	48 89 e5             	mov    rbp,rsp
  e08278:	48 89 ef             	mov    rdi,rbp
  e0827b:	e8 85 27 00 00       	call   e0aa05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a8b>
  e08280:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e08284:	e8 d7 64 9e 00       	call   17ee760 <free@plt>
  e08289:	48 8b bb f0 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1f0]
  e08290:	48 89 ee             	mov    rsi,rbp
  e08293:	e8 80 27 00 00       	call   e0aa18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7a9e>
  e08298:	84 c0                	test   al,al
  e0829a:	0f 84 93 00 00 00    	je     e08333 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd53b9>
  e082a0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  e082a5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  e082aa:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  e082ae:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  e082b3:	0f 57 c0             	xorps  xmm0,xmm0
  e082b6:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  e082ba:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  e082c0:	48 8d 73 10          	lea    rsi,[rbx+0x10]
  e082c4:	4c 8d bc 24 f0 02 00 	lea    r15,[rsp+0x2f0]
  e082cb:	00
  e082cc:	4c 89 ff             	mov    rdi,r15
  e082cf:	4c 89 f2             	mov    rdx,r14
  e082d2:	e8 5a 27 00 00       	call   e0aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ab7>
  e082d7:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
  e082de:	00
  e082df:	4c 89 fe             	mov    rsi,r15
  e082e2:	e8 65 27 00 00       	call   e0aa4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7ad2>
  e082e7:	48 81 c3 d0 01 00 00 	add    rbx,0x1d0
  e082ee:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  e082f3:	4c 8d bc 24 30 03 00 	lea    r15,[rsp+0x330]
  e082fa:	00
  e082fb:	48 89 df             	mov    rdi,rbx
  e082fe:	4c 89 f6             	mov    rsi,r14
  e08301:	4c 89 fa             	mov    rdx,r15
  e08304:	e8 ff 27 00 00       	call   e0ab08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7b8e>
  e08309:	4c 89 ff             	mov    rdi,r15
  e0830c:	e8 59 1c c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e08311:	48 8d bc 24 00 03 00 	lea    rdi,[rsp+0x300]
  e08318:	00
  e08319:	e8 4c 1c c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e0831e:	4c 89 f7             	mov    rdi,r14
  e08321:	e8 6a 5b 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e08326:	48 89 e7             	mov    rdi,rsp
  e08329:	e8 62 5b 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e0832e:	e9 0c 01 00 00       	jmp    e0843f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd54c5>
  e08333:	48 89 e7             	mov    rdi,rsp
  e08336:	e8 55 5b 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e0833b:	8a 83 e8 02 00 00    	mov    al,BYTE PTR [rbx+0x2e8]
  e08341:	a8 01                	test   al,0x1
  e08343:	0f 85 c0 00 00 00    	jne    e08409 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd548f>
  e08349:	48 8b bb 50 03 00 00 	mov    rdi,QWORD PTR [rbx+0x350]
  e08350:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e08353:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e08359:	49 8d 7f 68          	lea    rdi,[r15+0x68]
  e0835d:	48 89 c6             	mov    rsi,rax
  e08360:	e8 1b 5d 9e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
  e08365:	49 89 e5             	mov    r13,rsp
  e08368:	4c 89 ef             	mov    rdi,r13
  e0836b:	4c 89 fe             	mov    rsi,r15
  e0836e:	e8 89 7e 86 00       	call   16701fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24368>
  e08373:	4c 8b bb 50 03 00 00 	mov    r15,QWORD PTR [rbx+0x350]
  e0837a:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]
  e0837f:	48 89 ef             	mov    rdi,rbp
  e08382:	4c 89 e6             	mov    rsi,r12
  e08385:	e8 f4 3a 86 00       	call   166be7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ffea>
  e0838a:	48 8d 35 af 1c 56 ff 	lea    rsi,[rip+0xffffffffff561caf]        # 36a040 <_ZTSSt12bad_any_cast@@Base-0x26188>
  e08391:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e08398:	00
  e08399:	48 89 ea             	mov    rdx,rbp
  e0839c:	e8 b9 50 05 00       	call   e5d45a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24870>
  e083a1:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
  e083a5:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
  e083a9:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
  e083b0:	00
  e083b1:	48 89 de             	mov    rsi,rbx
  e083b4:	4c 89 f2             	mov    rdx,r14
  e083b7:	e8 f2 27 00 00       	call   e0abae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7c34>
  e083bc:	4d 29 e5             	sub    r13,r12
  e083bf:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e083c2:	48 8d 9c 24 d8 00 00 	lea    rbx,[rsp+0xd8]
  e083c9:	00
  e083ca:	4c 8d b4 24 60 03 00 	lea    r14,[rsp+0x360]
  e083d1:	00
  e083d2:	4c 89 ff             	mov    rdi,r15
  e083d5:	48 89 de             	mov    rsi,rbx
  e083d8:	4c 89 e2             	mov    rdx,r12
  e083db:	4c 89 e9             	mov    rcx,r13
  e083de:	4d 89 f0             	mov    r8,r14
  e083e1:	ff 50 48             	call   QWORD PTR [rax+0x48]
  e083e4:	4c 89 f7             	mov    rdi,r14
  e083e7:	e8 7e 1b c7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e083ec:	48 89 df             	mov    rdi,rbx
  e083ef:	e8 c2 c9 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e083f4:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e083f9:	e8 da 3b 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e083fe:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  e08402:	e8 59 63 9e 00       	call   17ee760 <free@plt>
  e08407:	eb 36                	jmp    e0843f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd54c5>
  e08409:	48 8b 9b 40 03 00 00 	mov    rbx,QWORD PTR [rbx+0x340]
  e08410:	4c 8d a4 24 38 02 00 	lea    r12,[rsp+0x238]
  e08417:	00
  e08418:	4c 89 e7             	mov    rdi,r12
  e0841b:	4c 89 fe             	mov    rsi,r15
  e0841e:	e8 1f f6 85 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
  e08423:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e08426:	48 89 df             	mov    rdi,rbx
  e08429:	4c 89 e6             	mov    rsi,r12
  e0842c:	4c 89 f2             	mov    rdx,r14
  e0842f:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e08432:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e08439:	00
  e0843a:	e8 99 3b 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e0843f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e08446:	00 00
  e08448:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e0844f:	00
  e08450:	0f 85 9f 00 00 00    	jne    e084f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd557b>
  e08456:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e0845d:	5b                   	pop    rbx
  e0845e:	41 5c                	pop    r12
  e08460:	41 5d                	pop    r13
  e08462:	41 5e                	pop    r14
  e08464:	41 5f                	pop    r15
  e08466:	5d                   	pop    rbp
  e08467:	c3                   	ret
  e08468:	48 89 c3             	mov    rbx,rax
  e0846b:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
  e08472:	00
  e08473:	e8 60 3b 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e08478:	eb 60                	jmp    e084da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5560>
  e0847a:	48 89 c3             	mov    rbx,rax
  e0847d:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
  e08484:	00
  e08485:	e8 2c c9 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
  e0848a:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
  e0848f:	e8 44 3b 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
  e08494:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
```
Relevant refs in this target window:

```text
  e081ca:	48 81 ec 98 03 00 00 	sub    rsp,0x398
  e081e3:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
  e08211:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
  e08353:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
  e08448:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e08456:	48 81 c4 98 03 00 00 	add    rsp,0x398
  e084e3:	48 3b 84 24 90 03 00 	cmp    rax,QWORD PTR [rsp+0x390]
  e0854b:	41 80 7c 24 28 00    	cmp    BYTE PTR [r12+0x28],0x0
```
### target `0xe9926a`

```text
  e9918f:	e8 f2 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99194:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
  e9919b:	e8 e6 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991a0:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
  e991a7:	e8 da 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991ac:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  e991b0:	e8 25 00 00 00       	call   e991da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x605f0>
  e991b5:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
  e991b9:	e8 c8 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991be:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  e991c2:	e8 bf 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991c7:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  e991cb:	e8 b6 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991d0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e991d4:	5b                   	pop    rbx
  e991d5:	e9 ac 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991da:	53                   	push   rbx
  e991db:	48 89 fb             	mov    rbx,rdi
  e991de:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
  e991e2:	e8 9f 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991e7:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
  e991eb:	e8 96 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991f0:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  e991f4:	e8 8d 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991f9:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  e991fd:	e8 84 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99202:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e99206:	5b                   	pop    rbx
  e99207:	e9 7a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9920c:	53                   	push   rbx
  e9920d:	48 83 ec 20          	sub    rsp,0x20
  e99211:	48 89 fe             	mov    rsi,rdi
  e99214:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9921b:	00 00
  e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  e99227:	48 89 df             	mov    rdi,rbx
  e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99232:	48 85 ff             	test   rdi,rdi
  e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>
  e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
```
Relevant refs in this target window:

```text
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e9940c:	41 56                	push   r14
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
```
### target `0xe9929a`

```text
  e991db:	48 89 fb             	mov    rbx,rdi
  e991de:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]
  e991e2:	e8 9f 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991e7:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
  e991eb:	e8 96 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991f0:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  e991f4:	e8 8d 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991f9:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  e991fd:	e8 84 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99202:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e99206:	5b                   	pop    rbx
  e99207:	e9 7a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9920c:	53                   	push   rbx
  e9920d:	48 83 ec 20          	sub    rsp,0x20
  e99211:	48 89 fe             	mov    rsi,rdi
  e99214:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9921b:	00 00
  e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  e99227:	48 89 df             	mov    rdi,rbx
  e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99232:	48 85 ff             	test   rdi,rdi
  e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>
  e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
```
Relevant refs in this target window:

```text
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e9940c:	41 56                	push   r14
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e9959c:	41 56                	push   r14
```
### target `0xe992a2`

```text
  e991e7:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
  e991eb:	e8 96 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991f0:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
  e991f4:	e8 8d 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e991f9:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  e991fd:	e8 84 52 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99202:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  e99206:	5b                   	pop    rbx
  e99207:	e9 7a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9920c:	53                   	push   rbx
  e9920d:	48 83 ec 20          	sub    rsp,0x20
  e99211:	48 89 fe             	mov    rsi,rdi
  e99214:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9921b:	00 00
  e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  e99227:	48 89 df             	mov    rdi,rbx
  e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99232:	48 85 ff             	test   rdi,rdi
  e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>
  e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
```
Relevant refs in this target window:

```text
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e9940c:	41 56                	push   r14
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e9959c:	41 56                	push   r14
```
### target `0xe992c8`

```text
  e99211:	48 89 fe             	mov    rsi,rdi
  e99214:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9921b:	00 00
  e9921d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e99222:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
  e99227:	48 89 df             	mov    rdi,rbx
  e9922a:	e8 01 21 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9922f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99232:	48 85 ff             	test   rdi,rdi
  e99235:	74 06                	je     e9923d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60653>
  e99237:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9923a:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e9923d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99249:	00 00
  e9924b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  e99250:	75 0a                	jne    e9925c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60672>
  e99252:	48 83 c4 20          	add    rsp,0x20
  e99256:	5b                   	pop    rbx
  e99257:	e9 2a 52 c0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9925c:	e8 4f 68 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99261:	48 89 c7             	mov    rdi,rax
  e99264:	e8 3c 08 be ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  e99269:	cc                   	int3
  e9926a:	53                   	push   rbx
  e9926b:	48 89 fb             	mov    rbx,rdi
  e9926e:	6a 10                	push   0x10
  e99270:	5f                   	pop    rdi
  e99271:	e8 8a 4c 95 00       	call   17edf00 <_Znwm@plt>
  e99276:	48 8d 0d ab 87 99 00 	lea    rcx,[rip+0x9987ab]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9927d:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99280:	8a 4b 08             	mov    cl,BYTE PTR [rbx+0x8]
  e99283:	88 48 08             	mov    BYTE PTR [rax+0x8],cl
  e99286:	5b                   	pop    rbx
  e99287:	c3                   	ret
  e99288:	48 8d 05 99 87 99 00 	lea    rax,[rip+0x998799]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e9928f:	48 89 06             	mov    QWORD PTR [rsi],rax
  e99292:	8a 47 08             	mov    al,BYTE PTR [rdi+0x8]
  e99295:	88 46 08             	mov    BYTE PTR [rsi+0x8],al
  e99298:	c3                   	ret
  e99299:	cc                   	int3
  e9929a:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
  e9929e:	0f 94 c0             	sete   al
  e992a1:	c3                   	ret
  e992a2:	48 8d 05 37 87 99 00 	lea    rax,[rip+0x998737]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e992a9:	48 89 07             	mov    QWORD PTR [rdi],rax
  e992ac:	48 83 c7 10          	add    rdi,0x10
  e992b0:	e9 b5 0c be ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
  e992b5:	cc                   	int3
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
  e9953b:	48 89 c6             	mov    rsi,rax
```
Relevant refs in this target window:

```text
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e9940c:	41 56                	push   r14
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e9959c:	41 56                	push   r14
```
### target `0xe99382`

```text
  e992b6:	53                   	push   rbx
  e992b7:	48 89 fb             	mov    rbx,rdi
  e992ba:	e8 e3 ff ff ff       	call   e992a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x606b8>
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
  e9953b:	48 89 c6             	mov    rsi,rax
  e9953e:	4c 89 e1             	mov    rcx,r12
  e99541:	e8 94 00 c2 ff       	call   ab95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x657a>
  e99546:	4d 8b 7d 10          	mov    r15,QWORD PTR [r13+0x10]
  e9954a:	4c 89 ff             	mov    rdi,r15
  e9954d:	4c 89 f6             	mov    rsi,r14
  e99550:	e8 e9 04 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99555:	49 83 c7 10          	add    r15,0x10
  e99559:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e9955d:	48 89 df             	mov    rdi,rbx
  e99560:	4c 89 ee             	mov    rsi,r13
  e99563:	e8 e6 3b c2 ff       	call   abd14e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa0ee>
  e99568:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
  e9956c:	4c 89 ef             	mov    rdi,r13
  e9956f:	e8 3c 01 c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e99574:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e99578:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9957f:	00 00
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e99586:	75 0e                	jne    e99596 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609ac>
  e99588:	48 83 c4 30          	add    rsp,0x30
  e9958c:	5b                   	pop    rbx
  e9958d:	41 5c                	pop    r12
  e9958f:	41 5d                	pop    r13
  e99591:	41 5e                	pop    r14
  e99593:	41 5f                	pop    r15
  e99595:	c3                   	ret
  e99596:	e8 15 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9959b:	cc                   	int3
  e9959c:	41 56                	push   r14
  e9959e:	53                   	push   rbx
  e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e995a6:	48 89 fb             	mov    rbx,rdi
  e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e995b0:	00 00
  e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e995b9:	00
  e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e995bf:	4c 89 f7             	mov    rdi,r14
  e995c2:	48 89 de             	mov    rsi,rbx
  e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e995cd:	48 85 f6             	test   rsi,rsi
  e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>
  e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
```
Relevant refs in this target window:

```text
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e9940c:	41 56                	push   r14
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e9959c:	41 56                	push   r14
```
### target `0xe9938c`

```text
  e992bf:	48 89 df             	mov    rdi,rbx
  e992c2:	5b                   	pop    rbx
  e992c3:	e9 58 4c 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e992c8:	41 56                	push   r14
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
  e9953b:	48 89 c6             	mov    rsi,rax
  e9953e:	4c 89 e1             	mov    rcx,r12
  e99541:	e8 94 00 c2 ff       	call   ab95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x657a>
  e99546:	4d 8b 7d 10          	mov    r15,QWORD PTR [r13+0x10]
  e9954a:	4c 89 ff             	mov    rdi,r15
  e9954d:	4c 89 f6             	mov    rsi,r14
  e99550:	e8 e9 04 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99555:	49 83 c7 10          	add    r15,0x10
  e99559:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e9955d:	48 89 df             	mov    rdi,rbx
  e99560:	4c 89 ee             	mov    rsi,r13
  e99563:	e8 e6 3b c2 ff       	call   abd14e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa0ee>
  e99568:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
  e9956c:	4c 89 ef             	mov    rdi,r13
  e9956f:	e8 3c 01 c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e99574:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e99578:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9957f:	00 00
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e99586:	75 0e                	jne    e99596 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609ac>
  e99588:	48 83 c4 30          	add    rsp,0x30
  e9958c:	5b                   	pop    rbx
  e9958d:	41 5c                	pop    r12
  e9958f:	41 5d                	pop    r13
  e99591:	41 5e                	pop    r14
  e99593:	41 5f                	pop    r15
  e99595:	c3                   	ret
  e99596:	e8 15 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9959b:	cc                   	int3
  e9959c:	41 56                	push   r14
  e9959e:	53                   	push   rbx
  e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e995a6:	48 89 fb             	mov    rbx,rdi
  e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e995b0:	00 00
  e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e995b9:	00
  e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e995bf:	4c 89 f7             	mov    rdi,r14
  e995c2:	48 89 de             	mov    rsi,rbx
  e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e995cd:	48 85 f6             	test   rsi,rsi
  e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>
  e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e995e9:	48 89 df             	mov    rdi,rbx
  e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
```
Relevant refs in this target window:

```text
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e9940c:	41 56                	push   r14
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e9959c:	41 56                	push   r14
```
### target `0xe9939c`

```text
  e992ca:	53                   	push   rbx
  e992cb:	48 83 ec 28          	sub    rsp,0x28
  e992cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e992d6:	00 00
  e992d8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  e992dd:	4c 8d 77 10          	lea    r14,[rdi+0x10]
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
  e9953b:	48 89 c6             	mov    rsi,rax
  e9953e:	4c 89 e1             	mov    rcx,r12
  e99541:	e8 94 00 c2 ff       	call   ab95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x657a>
  e99546:	4d 8b 7d 10          	mov    r15,QWORD PTR [r13+0x10]
  e9954a:	4c 89 ff             	mov    rdi,r15
  e9954d:	4c 89 f6             	mov    rsi,r14
  e99550:	e8 e9 04 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99555:	49 83 c7 10          	add    r15,0x10
  e99559:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e9955d:	48 89 df             	mov    rdi,rbx
  e99560:	4c 89 ee             	mov    rsi,r13
  e99563:	e8 e6 3b c2 ff       	call   abd14e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa0ee>
  e99568:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
  e9956c:	4c 89 ef             	mov    rdi,r13
  e9956f:	e8 3c 01 c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e99574:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e99578:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9957f:	00 00
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e99586:	75 0e                	jne    e99596 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609ac>
  e99588:	48 83 c4 30          	add    rsp,0x30
  e9958c:	5b                   	pop    rbx
  e9958d:	41 5c                	pop    r12
  e9958f:	41 5d                	pop    r13
  e99591:	41 5e                	pop    r14
  e99593:	41 5f                	pop    r15
  e99595:	c3                   	ret
  e99596:	e8 15 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9959b:	cc                   	int3
  e9959c:	41 56                	push   r14
  e9959e:	53                   	push   rbx
  e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e995a6:	48 89 fb             	mov    rbx,rdi
  e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e995b0:	00 00
  e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e995b9:	00
  e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e995bf:	4c 89 f7             	mov    rdi,r14
  e995c2:	48 89 de             	mov    rsi,rbx
  e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e995cd:	48 85 f6             	test   rsi,rsi
  e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>
  e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e995e9:	48 89 df             	mov    rdi,rbx
  e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995f4:	e8 65 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e995fe:	e8 83 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99603:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
```
Relevant refs in this target window:

```text
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e9940c:	41 56                	push   r14
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e9959c:	41 56                	push   r14
```
### target `0xe993ae`

```text
  e992e1:	6a 40                	push   0x40
  e992e3:	5f                   	pop    rdi
  e992e4:	e8 17 4c 95 00       	call   17edf00 <_Znwm@plt>
  e992e9:	48 89 c3             	mov    rbx,rax
  e992ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  e992f0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
  e992f5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  e992fa:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
  e99301:	00 00
  e99303:	48 8d 05 d6 86 99 00 	lea    rax,[rip+0x9986d6]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e9930a:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9930d:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  e99311:	4c 89 f6             	mov    rsi,r14
  e99314:	e8 77 0f be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99319:	48 89 e7             	mov    rdi,rsp
  e9931c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99320:	e8 a5 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e99325:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9932c:	00 00
  e9932e:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99333:	75 2e                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e99335:	48 89 d8             	mov    rax,rbx
  e99338:	48 83 c4 28          	add    rsp,0x28
  e9933c:	5b                   	pop    rbx
  e9933d:	41 5e                	pop    r14
  e9933f:	c3                   	ret
  e99340:	48 89 c3             	mov    rbx,rax
  e99343:	48 89 e7             	mov    rdi,rsp
  e99346:	e8 7f 0f be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
  e9934b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99352:	00 00
  e99354:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  e99359:	75 08                	jne    e99363 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60779>
  e9935b:	48 89 df             	mov    rdi,rbx
  e9935e:	e8 6d 69 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99363:	e8 48 67 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99368:	48 8d 47 10          	lea    rax,[rdi+0x10]
  e9936c:	48 8d 0d 6d 86 99 00 	lea    rcx,[rip+0x99866d]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e99373:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  e99376:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  e9937a:	48 89 c6             	mov    rsi,rax
  e9937d:	e9 0e 0f be ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e99382:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
  e99386:	e9 d7 10 be ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
  e9938b:	cc                   	int3
  e9938c:	48 8d 05 15 86 99 00 	lea    rax,[rip+0x998615]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e99393:	48 89 07             	mov    QWORD PTR [rdi],rax
  e99396:	e9 75 4c 95 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  e9939b:	cc                   	int3
  e9939c:	53                   	push   rbx
  e9939d:	48 89 fb             	mov    rbx,rdi
  e993a0:	e8 e7 ff ff ff       	call   e9938c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607a2>
  e993a5:	48 89 df             	mov    rdi,rbx
  e993a8:	5b                   	pop    rbx
  e993a9:	e9 72 4b 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e993ae:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  e993b2:	48 83 c7 20          	add    rdi,0x20
  e993b6:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
  e993b9:	41 57                	push   r15
  e993bb:	41 56                	push   r14
  e993bd:	41 54                	push   r12
  e993bf:	53                   	push   rbx
  e993c0:	50                   	push   rax
  e993c1:	49 89 d6             	mov    r14,rdx
  e993c4:	48 89 f3             	mov    rbx,rsi
  e993c7:	6a 05                	push   0x5
  e993c9:	41 5f                	pop    r15
  e993cb:	49 89 fc             	mov    r12,rdi
  e993ce:	48 39 df             	cmp    rdi,rbx
  e993d1:	74 17                	je     e993ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60800>
  e993d3:	4c 89 e7             	mov    rdi,r12
  e993d6:	4c 89 f6             	mov    rsi,r14
  e993d9:	4c 89 fa             	mov    rdx,r15
  e993dc:	e8 ff 95 c5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
  e993e1:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
  e993e6:	84 c0                	test   al,al
  e993e8:	74 e1                	je     e993cb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607e1>
  e993ea:	49 39 dc             	cmp    r12,rbx
  e993ed:	0f 95 c0             	setne  al
  e993f0:	48 83 c4 08          	add    rsp,0x8
  e993f4:	5b                   	pop    rbx
  e993f5:	41 5c                	pop    r12
  e993f7:	41 5e                	pop    r14
  e993f9:	41 5f                	pop    r15
  e993fb:	c3                   	ret
  e993fc:	53                   	push   rbx
  e993fd:	48 89 fb             	mov    rbx,rdi
  e99400:	e8 37 5c ca ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
  e9953b:	48 89 c6             	mov    rsi,rax
  e9953e:	4c 89 e1             	mov    rcx,r12
  e99541:	e8 94 00 c2 ff       	call   ab95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x657a>
  e99546:	4d 8b 7d 10          	mov    r15,QWORD PTR [r13+0x10]
  e9954a:	4c 89 ff             	mov    rdi,r15
  e9954d:	4c 89 f6             	mov    rsi,r14
  e99550:	e8 e9 04 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99555:	49 83 c7 10          	add    r15,0x10
  e99559:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e9955d:	48 89 df             	mov    rdi,rbx
  e99560:	4c 89 ee             	mov    rsi,r13
  e99563:	e8 e6 3b c2 ff       	call   abd14e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa0ee>
  e99568:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
  e9956c:	4c 89 ef             	mov    rdi,r13
  e9956f:	e8 3c 01 c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e99574:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e99578:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9957f:	00 00
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e99586:	75 0e                	jne    e99596 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609ac>
  e99588:	48 83 c4 30          	add    rsp,0x30
  e9958c:	5b                   	pop    rbx
  e9958d:	41 5c                	pop    r12
  e9958f:	41 5d                	pop    r13
  e99591:	41 5e                	pop    r14
  e99593:	41 5f                	pop    r15
  e99595:	c3                   	ret
  e99596:	e8 15 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9959b:	cc                   	int3
  e9959c:	41 56                	push   r14
  e9959e:	53                   	push   rbx
  e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e995a6:	48 89 fb             	mov    rbx,rdi
  e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e995b0:	00 00
  e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e995b9:	00
  e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e995bf:	4c 89 f7             	mov    rdi,r14
  e995c2:	48 89 de             	mov    rsi,rbx
  e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e995cd:	48 85 f6             	test   rsi,rsi
  e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>
  e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e995e9:	48 89 df             	mov    rdi,rbx
  e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995f4:	e8 65 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e995fe:	e8 83 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99603:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9960a:	00 00
  e9960c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99613:	00
  e99614:	75 42                	jne    e99658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a6e>
  e99616:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9961d:	5b                   	pop    rbx
```
Relevant refs in this target window:

```text
  e99405:	c6 43 28 01          	mov    BYTE PTR [rbx+0x28],0x1
  e9940c:	41 56                	push   r14
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e9959c:	41 56                	push   r14
  e996c1:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
```
### target `0x10a2082`

```text
 10a1fea:	75 2a                	jne    10a2016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26942c>
 10a1fec:	49 83 c5 10          	add    r13,0x10
 10a1ff0:	eb d2                	jmp    10a1fc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2693da>
 10a1ff2:	4c 89 ff             	mov    rdi,r15
 10a1ff5:	4c 89 f6             	mov    rsi,r14
 10a1ff8:	ba b2 00 00 00       	mov    edx,0xb2
 10a1ffd:	48 89 d9             	mov    rcx,rbx
 10a2000:	45 31 c0             	xor    r8d,r8d
 10a2003:	48 83 c4 08          	add    rsp,0x8
 10a2007:	5b                   	pop    rbx
 10a2008:	41 5c                	pop    r12
 10a200a:	41 5d                	pop    r13
 10a200c:	41 5e                	pop    r14
 10a200e:	41 5f                	pop    r15
 10a2010:	5d                   	pop    rbp
 10a2011:	e9 ea 6b 54 00       	jmp    15e8c00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42e184>
 10a2016:	4d 8b 7d 00          	mov    r15,QWORD PTR [r13+0x0]
 10a201a:	4c 89 f7             	mov    rdi,r14
 10a201d:	e8 14 98 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 10a2022:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
 10a2025:	4c 8b 49 18          	mov    r9,QWORD PTR [rcx+0x18]
 10a2029:	4c 89 ff             	mov    rdi,r15
 10a202c:	48 89 c6             	mov    rsi,rax
 10a202f:	b9 b2 00 00 00       	mov    ecx,0xb2
 10a2034:	49 89 d8             	mov    r8,rbx
 10a2037:	48 83 c4 08          	add    rsp,0x8
 10a203b:	5b                   	pop    rbx
 10a203c:	41 5c                	pop    r12
 10a203e:	41 5d                	pop    r13
 10a2040:	41 5e                	pop    r14
 10a2042:	41 5f                	pop    r15
 10a2044:	5d                   	pop    rbp
 10a2045:	41 ff e1             	jmp    r9
 10a2048:	55                   	push   rbp
 10a2049:	41 56                	push   r14
 10a204b:	53                   	push   rbx
 10a204c:	89 f5                	mov    ebp,esi
 10a204e:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 10a2051:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
 10a2054:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
 10a2058:	e8 e1 62 ac ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
 10a205d:	85 ed                	test   ebp,ebp
 10a205f:	0f 95 c1             	setne  cl
 10a2062:	08 c1                	or     cl,al
 10a2064:	75 0f                	jne    10a2075 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26948b>
 10a2066:	48 83 c3 08          	add    rbx,0x8
 10a206a:	4c 89 f7             	mov    rdi,r14
 10a206d:	48 89 de             	mov    rsi,rbx
 10a2070:	e8 ed fa ff ff       	call   10a1b62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268f78>
 10a2075:	5b                   	pop    rbx
 10a2076:	41 5e                	pop    r14
 10a2078:	5d                   	pop    rbp
 10a2079:	c3                   	ret
 10a207a:	48 89 c7             	mov    rdi,rax
 10a207d:	e8 23 7a 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 10a2082:	53                   	push   rbx
 10a2083:	48 89 fb             	mov    rbx,rdi
 10a2086:	48 8d 05 d3 a2 7a 00 	lea    rax,[rip+0x7aa2d3]        # 184c360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8a48>
 10a208d:	48 89 07             	mov    QWORD PTR [rdi],rax
 10a2090:	48 81 c7 c8 04 00 00 	add    rdi,0x4c8
 10a2097:	e8 e0 d0 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 10a209c:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
 10a20a3:	e8 be 7d 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10a20a8:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
 10a20af:	e8 b2 7d 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 10a20b4:	48 8b bb 10 04 00 00 	mov    rdi,QWORD PTR [rbx+0x410]
 10a20bb:	e8 c6 c3 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a20c0:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
 10a20c7:	e8 9e 67 54 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
 10a20cc:	48 8d bb 88 03 00 00 	lea    rdi,[rbx+0x388]
 10a20d3:	e8 ae f4 ff ff       	call   10a1586 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26899c>
 10a20d8:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
 10a20df:	e8 c0 f4 ff ff       	call   10a15a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ba>
 10a20e4:	48 8d bb 70 03 00 00 	lea    rdi,[rbx+0x370]
 10a20eb:	e8 e8 f4 ff ff       	call   10a15d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ee>
 10a20f0:	48 8d bb f8 01 00 00 	lea    rdi,[rbx+0x1f8]
 10a20f7:	e8 0a 58 54 00       	call   15e7906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ce8a>
 10a20fc:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
 10a2103:	e8 fe 57 54 00       	call   15e7906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ce8a>
 10a2108:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
 10a210c:	e8 75 c3 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a2111:	48 8b 7b 68          	mov    rdi,QWORD PTR [rbx+0x68]
 10a2115:	e8 6c c3 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a211a:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
 10a211e:	e8 47 7e 9d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 10a2123:	48 83 c3 08          	add    rbx,0x8
 10a2127:	48 89 df             	mov    rdi,rbx
 10a212a:	5b                   	pop    rbx
 10a212b:	e9 60 bd 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 10a2130:	53                   	push   rbx
 10a2131:	48 89 fb             	mov    rbx,rdi
 10a2134:	e8 49 ff ff ff       	call   10a2082 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269498>
 10a2139:	48 89 df             	mov    rdi,rbx
 10a213c:	5b                   	pop    rbx
 10a213d:	e9 de bd 74 00       	jmp    17edf20 <_ZdlPv@plt>
 10a2142:	41 57                	push   r15
 10a2144:	41 56                	push   r14
 10a2146:	53                   	push   rbx
 10a2147:	48 83 ec 20          	sub    rsp,0x20
 10a214b:	49 89 f6             	mov    r14,rsi
 10a214e:	48 89 fb             	mov    rbx,rdi
 10a2151:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a2158:	00 00
 10a215a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10a215f:	48 8b 76 70          	mov    rsi,QWORD PTR [rsi+0x70]
 10a2163:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 10a2168:	4c 89 ff             	mov    rdi,r15
 10a216b:	e8 7c e3 5d 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
 10a2170:	49 8b 17             	mov    rdx,QWORD PTR [r15]
 10a2173:	48 85 d2             	test   rdx,rdx
 10a2176:	74 11                	je     10a2189 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26959f>
 10a2178:	49 83 ee 80          	sub    r14,0xffffffffffffff80
 10a217c:	48 89 df             	mov    rdi,rbx
 10a217f:	4c 89 f6             	mov    rsi,r14
 10a2182:	e8 f7 63 54 00       	call   15e857e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42db02>
 10a2187:	eb 04                	jmp    10a218d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2695a3>
 10a2189:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10a218d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 10a2192:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a2199:	00 00
 10a219b:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 10a21a0:	75 37                	jne    10a21d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2695ef>
 10a21a2:	e8 df c2 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a21a7:	48 89 d8             	mov    rax,rbx
 10a21aa:	48 83 c4 20          	add    rsp,0x20
 10a21ae:	5b                   	pop    rbx
 10a21af:	41 5e                	pop    r14
 10a21b1:	41 5f                	pop    r15
 10a21b3:	c3                   	ret
 10a21b4:	48 89 c3             	mov    rbx,rax
 10a21b7:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 10a21bc:	e8 c5 c2 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a21c1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a21c8:	00 00
 10a21ca:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 10a21cf:	75 08                	jne    10a21d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2695ef>
 10a21d1:	48 89 df             	mov    rdi,rbx
 10a21d4:	e8 f7 da 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10a21d9:	e8 d2 d8 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10a21de:	41 57                	push   r15
 10a21e0:	41 56                	push   r14
 10a21e2:	53                   	push   rbx
 10a21e3:	48 83 ec 20          	sub    rsp,0x20
 10a21e7:	49 89 f6             	mov    r14,rsi
 10a21ea:	48 89 fb             	mov    rbx,rdi
 10a21ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a21f4:	00 00
 10a21f6:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10a21fb:	48 8b 76 70          	mov    rsi,QWORD PTR [rsi+0x70]
 10a21ff:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
 10a2204:	4c 89 ff             	mov    rdi,r15
 10a2207:	e8 e0 e2 5d 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
 10a220c:	49 8b 17             	mov    rdx,QWORD PTR [r15]
 10a220f:	48 85 d2             	test   rdx,rdx
 10a2212:	74 14                	je     10a2228 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26963e>
 10a2214:	49 81 c6 f8 01 00 00 	add    r14,0x1f8
 10a221b:	48 89 df             	mov    rdi,rbx
 10a221e:	4c 89 f6             	mov    rsi,r14
 10a2221:	e8 58 63 54 00       	call   15e857e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42db02>
 10a2226:	eb 04                	jmp    10a222c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269642>
 10a2228:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 10a222c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 10a2231:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a2238:	00 00
 10a223a:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 10a223f:	75 37                	jne    10a2278 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26968e>
 10a2241:	e8 40 c2 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a2246:	48 89 d8             	mov    rax,rbx
 10a2249:	48 83 c4 20          	add    rsp,0x20
 10a224d:	5b                   	pop    rbx
 10a224e:	41 5e                	pop    r14
 10a2250:	41 5f                	pop    r15
 10a2252:	c3                   	ret
 10a2253:	48 89 c3             	mov    rbx,rax
 10a2256:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 10a225b:	e8 26 c2 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 10a2260:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a2267:	00 00
 10a2269:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 10a226e:	75 08                	jne    10a2278 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26968e>
 10a2270:	48 89 df             	mov    rdi,rbx
 10a2273:	e8 58 da 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 10a2278:	e8 33 d8 74 00       	call   17efab0 <__stack_chk_fail@plt>
 10a227d:	cc                   	int3
 10a227e:	48 8b 87 78 03 00 00 	mov    rax,QWORD PTR [rdi+0x378]
 10a2285:	8a 40 70             	mov    al,BYTE PTR [rax+0x70]
 10a2288:	c3                   	ret
 10a2289:	cc                   	int3
 10a228a:	48 8b 87 78 03 00 00 	mov    rax,QWORD PTR [rdi+0x378]
 10a2291:	8a 40 71             	mov    al,BYTE PTR [rax+0x71]
 10a2294:	c3                   	ret
 10a2295:	cc                   	int3
 10a2296:	8a 87 80 03 00 00    	mov    al,BYTE PTR [rdi+0x380]
 10a229c:	c3                   	ret
 10a229d:	cc                   	int3
 10a229e:	55                   	push   rbp
 10a229f:	41 57                	push   r15
 10a22a1:	41 56                	push   r14
 10a22a3:	41 55                	push   r13
 10a22a5:	41 54                	push   r12
 10a22a7:	53                   	push   rbx
 10a22a8:	48 81 ec 98 01 00 00 	sub    rsp,0x198
 10a22af:	49 89 fe             	mov    r14,rdi
 10a22b2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 10a22b9:	00 00
 10a22bb:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
 10a22c2:	00
 10a22c3:	85 f6                	test   esi,esi
 10a22c5:	0f 84 9a 02 00 00    	je     10a2565 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26997b>
 10a22cb:	49 8b be 78 03 00 00 	mov    rdi,QWORD PTR [r14+0x378]
 10a22d2:	e8 f9 31 00 00       	call   10a54d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c8e6>
 10a22d7:	49 8b 9e 70 03 00 00 	mov    rbx,QWORD PTR [r14+0x370]
 10a22de:	48 85 db             	test   rbx,rbx
 10a22e1:	74 17                	je     10a22fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269710>
 10a22e3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 10a22e6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 10a22e9:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
 10a22ef:	48 89 df             	mov    rdi,rbx
 10a22f2:	48 89 c6             	mov    rsi,rax
 10a22f5:	e8 2c 1c 00 00       	call   10a3f26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b33c>
 10a22fa:	6a 60                	push   0x60
 10a22fc:	5f                   	pop    rdi
 10a22fd:	e8 fe bb 74 00       	call   17edf00 <_Znwm@plt>
 10a2302:	48 89 c3             	mov    rbx,rax
 10a2305:	4d 8b 66 50          	mov    r12,QWORD PTR [r14+0x50]
 10a2309:	66 83 60 08 00       	and    WORD PTR [rax+0x8],0x0
 10a230e:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
 10a2313:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
 10a2318:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
 10a231d:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
 10a2322:	48 8d 05 ff a1 7a 00 	lea    rax,[rip+0x7aa1ff]        # 184c528 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c10>
 10a2329:	48 89 03             	mov    QWORD PTR [rbx],rax
 10a232c:	bf a8 00 00 00       	mov    edi,0xa8
 10a2331:	e8 ca bb 74 00       	call   17edf00 <_Znwm@plt>
 10a2336:	49 89 c7             	mov    r15,rax
 10a2339:	0f 57 c0             	xorps  xmm0,xmm0
 10a233c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 10a2340:	48 8d 05 d1 a2 7a 00 	lea    rax,[rip+0x7aa2d1]        # 184c618 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d00>
 10a2347:	49 89 07             	mov    QWORD PTR [r15],rax
 10a234a:	49 8d 7f 18          	lea    rdi,[r15+0x18]
```
Relevant refs in this target window:

```text
 10a20b4:	48 8b bb 10 04 00 00 	mov    rdi,QWORD PTR [rbx+0x410]
 10a20c0:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
```
### target `0x1145c8a`

```text
 1145bbb:	00
 1145bbc:	e8 6f 11 96 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 1145bc1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1145bc8:	00 00
 1145bca:	48 3b 84 24 08 01 00 	cmp    rax,QWORD PTR [rsp+0x108]
 1145bd1:	00
 1145bd2:	75 08                	jne    1145bdc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30cff2>
 1145bd4:	48 89 df             	mov    rdi,rbx
 1145bd7:	e8 f4 a0 92 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 1145bdc:	e8 cf 9e 6a 00       	call   17efab0 <__stack_chk_fail@plt>
 1145be1:	89 37                	mov    DWORD PTR [rdi],esi
 1145be3:	e9 5c 0a 3d 00       	jmp    1516644 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35bbc8>
 1145be8:	41 56                	push   r14
 1145bea:	53                   	push   rbx
 1145beb:	48 83 ec 48          	sub    rsp,0x48
 1145bef:	89 fb                	mov    ebx,edi
 1145bf1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1145bf8:	00 00
 1145bfa:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 1145bff:	8d 43 ff             	lea    eax,[rbx-0x1]
 1145c02:	83 f8 05             	cmp    eax,0x5
 1145c05:	72 63                	jb     1145c6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d080>
 1145c07:	0f 57 c0             	xorps  xmm0,xmm0
 1145c0a:	49 89 e6             	mov    r14,rsp
 1145c0d:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
 1145c11:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 1145c16:	48 8d 35 9b 18 24 ff 	lea    rsi,[rip+0xffffffffff24189b]        # 3874b8 <_ZTSSt12bad_any_cast@@Base-0x8d10>
 1145c1d:	4c 89 f7             	mov    rdi,r14
 1145c20:	e8 cd 03 69 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
 1145c25:	4c 89 f7             	mov    rdi,r14
 1145c28:	89 de                	mov    esi,ebx
 1145c2a:	e8 d9 03 69 00       	call   17d6008 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e29>
 1145c2f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 1145c34:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
 1145c3b:	48 8d 05 3a c3 30 ff 	lea    rax,[rip+0xffffffffff30c33a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 1145c42:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 1145c46:	48 8d 05 06 ce 22 ff 	lea    rax,[rip+0xffffffffff22ce06]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
 1145c4d:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1145c51:	c7 47 18 19 00 00 00 	mov    DWORD PTR [rdi+0x18],0x19
 1145c58:	4c 89 f6             	mov    rsi,r14
 1145c5b:	e8 48 40 96 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
 1145c60:	4c 89 f7             	mov    rdi,r14
 1145c63:	e8 28 82 6a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1145c68:	31 db                	xor    ebx,ebx
 1145c6a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1145c71:	00 00
 1145c73:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
 1145c78:	75 0a                	jne    1145c84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d09a>
 1145c7a:	89 d8                	mov    eax,ebx
 1145c7c:	48 83 c4 48          	add    rsp,0x48
 1145c80:	5b                   	pop    rbx
 1145c81:	41 5e                	pop    r14
 1145c83:	c3                   	ret
 1145c84:	e8 27 9e 6a 00       	call   17efab0 <__stack_chk_fail@plt>
 1145c89:	cc                   	int3
 1145c8a:	55                   	push   rbp
 1145c8b:	41 57                	push   r15
 1145c8d:	41 56                	push   r14
 1145c8f:	41 55                	push   r13
 1145c91:	41 54                	push   r12
 1145c93:	53                   	push   rbx
 1145c94:	48 81 ec d8 05 00 00 	sub    rsp,0x5d8
 1145c9b:	49 89 cf             	mov    r15,rcx
 1145c9e:	49 89 d4             	mov    r12,rdx
 1145ca1:	49 89 f6             	mov    r14,rsi
 1145ca4:	48 89 fb             	mov    rbx,rdi
 1145ca7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1145cae:	00 00
 1145cb0:	48 89 84 24 d0 05 00 	mov    QWORD PTR [rsp+0x5d0],rax
 1145cb7:	00
 1145cb8:	48 83 c6 08          	add    rsi,0x8
 1145cbc:	48 89 d7             	mov    rdi,rdx
 1145cbf:	e8 2a 9a 95 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
 1145cc4:	84 c0                	test   al,al
 1145cc6:	0f 84 9c 02 00 00    	je     1145f68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d37e>
 1145ccc:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
 1145cd1:	e8 0b ba 49 00       	call   15e16e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426c65>
 1145cd6:	3d aa 20 a0 83       	cmp    eax,0x83a020aa
 1145cdb:	0f 84 02 06 00 00    	je     11462e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d6f9>
 1145ce1:	3d f4 42 2a 9d       	cmp    eax,0x9d2a42f4
 1145ce6:	0f 84 5f 07 00 00    	je     114644b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d861>
 1145cec:	3d fd d3 59 dc       	cmp    eax,0xdc59d3fd
 1145cf1:	0f 84 a6 06 00 00    	je     114639d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d7b3>
 1145cf7:	3d fc 74 ec 0c       	cmp    eax,0xcec74fc
 1145cfc:	0f 84 88 02 00 00    	je     1145f8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d3a0>
 1145d02:	3d 67 6b 25 3d       	cmp    eax,0x3d256b67
 1145d07:	0f 84 0d 04 00 00    	je     114611a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d530>
 1145d0d:	3d 46 e2 32 34       	cmp    eax,0x3432e246
 1145d12:	0f 84 28 03 00 00    	je     1146040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d456>
 1145d18:	3d e4 bc 16 32       	cmp    eax,0x3216bce4
 1145d1d:	0f 85 45 02 00 00    	jne    1145f68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d37e>
 1145d23:	0f 57 c0             	xorps  xmm0,xmm0
 1145d26:	4c 8d ac 24 98 04 00 	lea    r13,[rsp+0x498]
 1145d2d:	00
 1145d2e:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
 1145d33:	48 8d 05 2e ef 70 00 	lea    rax,[rip+0x70ef2e]        # 1854c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11350>
 1145d3a:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
 1145d3e:	41 83 65 18 00       	and    DWORD PTR [r13+0x18],0x0
 1145d43:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
 1145d48:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
 1145d4d:	48 8d 2d a4 9a 2f ff 	lea    rbp,[rip+0xffffffffff2f9aa4]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 1145d54:	49 89 6d 38          	mov    QWORD PTR [r13+0x38],rbp
 1145d58:	49 89 6d 40          	mov    QWORD PTR [r13+0x40],rbp
 1145d5c:	49 89 6d 48          	mov    QWORD PTR [r13+0x48],rbp
 1145d60:	49 89 6d 50          	mov    QWORD PTR [r13+0x50],rbp
 1145d64:	49 89 6d 58          	mov    QWORD PTR [r13+0x58],rbp
 1145d68:	49 89 6d 60          	mov    QWORD PTR [r13+0x60],rbp
 1145d6c:	49 89 6d 68          	mov    QWORD PTR [r13+0x68],rbp
 1145d70:	49 89 6d 70          	mov    QWORD PTR [r13+0x70],rbp
 1145d74:	49 89 6d 78          	mov    QWORD PTR [r13+0x78],rbp
 1145d78:	49 89 ad 80 00 00 00 	mov    QWORD PTR [r13+0x80],rbp
 1145d7f:	49 89 ad 88 00 00 00 	mov    QWORD PTR [r13+0x88],rbp
 1145d86:	49 89 ad 90 00 00 00 	mov    QWORD PTR [r13+0x90],rbp
 1145d8d:	49 89 ad 98 00 00 00 	mov    QWORD PTR [r13+0x98],rbp
 1145d94:	49 89 ad a0 00 00 00 	mov    QWORD PTR [r13+0xa0],rbp
 1145d9b:	49 89 ad a8 00 00 00 	mov    QWORD PTR [r13+0xa8],rbp
 1145da2:	49 89 ad e0 00 00 00 	mov    QWORD PTR [r13+0xe0],rbp
 1145da9:	49 89 ad e8 00 00 00 	mov    QWORD PTR [r13+0xe8],rbp
 1145db0:	49 89 ad f0 00 00 00 	mov    QWORD PTR [r13+0xf0],rbp
 1145db7:	49 89 ad f8 00 00 00 	mov    QWORD PTR [r13+0xf8],rbp
 1145dbe:	49 89 ad 00 01 00 00 	mov    QWORD PTR [r13+0x100],rbp
 1145dc5:	49 89 ad 08 01 00 00 	mov    QWORD PTR [r13+0x108],rbp
 1145dcc:	49 89 ad 10 01 00 00 	mov    QWORD PTR [r13+0x110],rbp
 1145dd3:	49 89 ad 18 01 00 00 	mov    QWORD PTR [r13+0x118],rbp
 1145dda:	41 0f 11 85 cc 00 00 	movups XMMWORD PTR [r13+0xcc],xmm0
 1145de1:	00
 1145de2:	41 0f 11 85 c0 00 00 	movups XMMWORD PTR [r13+0xc0],xmm0
 1145de9:	00
 1145dea:	41 0f 11 85 b0 00 00 	movups XMMWORD PTR [r13+0xb0],xmm0
 1145df1:	00
 1145df2:	41 0f 11 85 20 01 00 	movups XMMWORD PTR [r13+0x120],xmm0
 1145df9:	00
 1145dfa:	49 83 a5 30 01 00 00 	and    QWORD PTR [r13+0x130],0x0
 1145e01:	00
 1145e02:	49 83 c4 30          	add    r12,0x30
 1145e06:	4c 89 e7             	mov    rdi,r12
 1145e09:	e8 28 5a 93 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
 1145e0e:	4c 89 ef             	mov    rdi,r13
 1145e11:	48 89 c6             	mov    rsi,rax
 1145e14:	e8 39 9a 63 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
 1145e19:	0f 57 c0             	xorps  xmm0,xmm0
 1145e1c:	84 c0                	test   al,al
 1145e1e:	0f 84 5d 08 00 00    	je     1146681 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30da97>
 1145e24:	0f 11 84 24 68 03 00 	movups XMMWORD PTR [rsp+0x368],xmm0
 1145e2b:	00
 1145e2c:	48 8d 05 35 ee 70 00 	lea    rax,[rip+0x70ee35]        # 1854c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11350>
 1145e33:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
 1145e3a:	00
 1145e3b:	83 a4 24 78 03 00 00 	and    DWORD PTR [rsp+0x378],0x0
 1145e42:	00
 1145e43:	0f 11 84 24 80 03 00 	movups XMMWORD PTR [rsp+0x380],xmm0
 1145e4a:	00
 1145e4b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
 1145e52:	00 00
 1145e54:	48 89 ac 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rbp
 1145e5b:	00
 1145e5c:	48 89 ac 24 a0 03 00 	mov    QWORD PTR [rsp+0x3a0],rbp
 1145e63:	00
 1145e64:	48 89 ac 24 a8 03 00 	mov    QWORD PTR [rsp+0x3a8],rbp
 1145e6b:	00
 1145e6c:	48 89 ac 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rbp
 1145e73:	00
 1145e74:	48 89 ac 24 b8 03 00 	mov    QWORD PTR [rsp+0x3b8],rbp
 1145e7b:	00
 1145e7c:	48 89 ac 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rbp
 1145e83:	00
 1145e84:	48 89 ac 24 c8 03 00 	mov    QWORD PTR [rsp+0x3c8],rbp
 1145e8b:	00
 1145e8c:	48 89 ac 24 d0 03 00 	mov    QWORD PTR [rsp+0x3d0],rbp
 1145e93:	00
 1145e94:	48 89 ac 24 d8 03 00 	mov    QWORD PTR [rsp+0x3d8],rbp
 1145e9b:	00
 1145e9c:	48 89 ac 24 e0 03 00 	mov    QWORD PTR [rsp+0x3e0],rbp
 1145ea3:	00
 1145ea4:	48 89 ac 24 e8 03 00 	mov    QWORD PTR [rsp+0x3e8],rbp
 1145eab:	00
 1145eac:	48 89 ac 24 f0 03 00 	mov    QWORD PTR [rsp+0x3f0],rbp
 1145eb3:	00
 1145eb4:	48 89 ac 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rbp
 1145ebb:	00
 1145ebc:	48 89 ac 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rbp
 1145ec3:	00
 1145ec4:	48 89 ac 24 08 04 00 	mov    QWORD PTR [rsp+0x408],rbp
 1145ecb:	00
 1145ecc:	48 89 ac 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rbp
 1145ed3:	00
 1145ed4:	48 89 ac 24 48 04 00 	mov    QWORD PTR [rsp+0x448],rbp
 1145edb:	00
 1145edc:	48 89 ac 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rbp
 1145ee3:	00
 1145ee4:	48 89 ac 24 58 04 00 	mov    QWORD PTR [rsp+0x458],rbp
 1145eeb:	00
 1145eec:	48 89 ac 24 60 04 00 	mov    QWORD PTR [rsp+0x460],rbp
 1145ef3:	00
 1145ef4:	48 89 ac 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rbp
 1145efb:	00
 1145efc:	48 89 ac 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rbp
 1145f03:	00
 1145f04:	48 89 ac 24 78 04 00 	mov    QWORD PTR [rsp+0x478],rbp
 1145f0b:	00
 1145f0c:	0f 11 84 24 2c 04 00 	movups XMMWORD PTR [rsp+0x42c],xmm0
 1145f13:	00
 1145f14:	0f 11 84 24 20 04 00 	movups XMMWORD PTR [rsp+0x420],xmm0
 1145f1b:	00
 1145f1c:	0f 11 84 24 10 04 00 	movups XMMWORD PTR [rsp+0x410],xmm0
 1145f23:	00
 1145f24:	48 83 a4 24 90 04 00 	and    QWORD PTR [rsp+0x490],0x0
 1145f2b:	00 00
 1145f2d:	0f 11 84 24 80 04 00 	movups XMMWORD PTR [rsp+0x480],xmm0
 1145f34:	00
 1145f35:	48 8b 84 24 a0 04 00 	mov    rax,QWORD PTR [rsp+0x4a0]
 1145f3c:	00
 1145f3d:	a8 01                	test   al,0x1
 1145f3f:	0f 85 ce 0a 00 00    	jne    1146a13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30de29>
 1145f45:	48 85 c0             	test   rax,rax
 1145f48:	0f 84 e6 08 00 00    	je     1146834 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dc4a>
 1145f4e:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
 1145f55:	00
 1145f56:	48 8d b4 24 98 04 00 	lea    rsi,[rsp+0x498]
 1145f5d:	00
 1145f5e:	e8 fd 8a 60 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
 1145f63:	e9 04 09 00 00       	jmp    114686c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30dc82>
 1145f68:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1145f6f:	00 00
 1145f71:	48 3b 84 24 d0 05 00 	cmp    rax,QWORD PTR [rsp+0x5d0]
 1145f78:	00
 1145f79:	0f 85 b8 0a 00 00    	jne    1146a37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30de4d>
 1145f7f:	0f 57 c0             	xorps  xmm0,xmm0
 1145f82:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 1145f85:	e9 50 0a 00 00       	jmp    11469da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ddf0>
 1145f8a:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
 1145f8e:	0f 57 c0             	xorps  xmm0,xmm0
 1145f91:	4c 8d ac 24 98 04 00 	lea    r13,[rsp+0x498]
 1145f98:	00
 1145f99:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
 1145f9e:	48 8d 2d cb ea 70 00 	lea    rbp,[rip+0x70eacb]        # 1854a70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x11158>
 1145fa5:	49 89 6d 00          	mov    QWORD PTR [r13+0x0],rbp
 1145fa9:	4c 8d 3d 48 98 2f ff 	lea    r15,[rip+0xffffffffff2f9848]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
 1145fb0:	4d 89 7d 18          	mov    QWORD PTR [r13+0x18],r15
 1145fb4:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
```
Relevant refs in this target window:

```text
 1145d94:	49 89 ad a0 00 00 00 	mov    QWORD PTR [r13+0xa0],rbp
 1145d9b:	49 89 ad a8 00 00 00 	mov    QWORD PTR [r13+0xa8],rbp
 1145e4b:	48 83 a4 24 90 03 00 	and    QWORD PTR [rsp+0x390],0x0
 1145e54:	48 89 ac 24 98 03 00 	mov    QWORD PTR [rsp+0x398],rbp
 1145f1c:	0f 11 84 24 10 04 00 	movups XMMWORD PTR [rsp+0x410],xmm0
 114606a:	41 0f 11 45 28       	movups XMMWORD PTR [r13+0x28],xmm0
```
### target `0x11d2d28`

```text
 11d2c59:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11d2c5c:	44 8a 60 08          	mov    r12b,BYTE PTR [rax+0x8]
 11d2c60:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 11d2c63:	4d 8b bf e8 02 00 00 	mov    r15,QWORD PTR [r15+0x2e8]
 11d2c6a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 11d2c6d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11d2c70:	ff 50 10             	call   QWORD PTR [rax+0x10]
 11d2c73:	41 89 c6             	mov    r14d,eax
 11d2c76:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 11d2c79:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11d2c7c:	ff 50 58             	call   QWORD PTR [rax+0x58]
 11d2c7f:	31 c9                	xor    ecx,ecx
 11d2c81:	45 84 e4             	test   r12b,r12b
 11d2c84:	49 8b 17             	mov    rdx,QWORD PTR [r15]
 11d2c87:	48 8b 3a             	mov    rdi,QWORD PTR [rdx]
 11d2c8a:	4c 0f 44 e9          	cmove  r13,rcx
 11d2c8e:	44 89 74 24 40       	mov    DWORD PTR [rsp+0x40],r14d
 11d2c93:	89 44 24 44          	mov    DWORD PTR [rsp+0x44],eax
 11d2c97:	89 6c 24 48          	mov    DWORD PTR [rsp+0x48],ebp
 11d2c9b:	4c 89 6c 24 4c       	mov    QWORD PTR [rsp+0x4c],r13
 11d2ca0:	44 88 64 24 54       	mov    BYTE PTR [rsp+0x54],r12b
 11d2ca5:	83 64 24 78 00       	and    DWORD PTR [rsp+0x78],0x0
 11d2caa:	48 8b 72 08          	mov    rsi,QWORD PTR [rdx+0x8]
 11d2cae:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
 11d2cb2:	0f 10 44 24 40       	movups xmm0,XMMWORD PTR [rsp+0x40]
 11d2cb7:	0f 10 4c 24 50       	movups xmm1,XMMWORD PTR [rsp+0x50]
 11d2cbc:	0f 10 54 24 60       	movups xmm2,XMMWORD PTR [rsp+0x60]
 11d2cc1:	0f 10 5c 24 70       	movups xmm3,XMMWORD PTR [rsp+0x70]
 11d2cc6:	0f 11 5c 24 30       	movups XMMWORD PTR [rsp+0x30],xmm3
 11d2ccb:	0f 11 54 24 20       	movups XMMWORD PTR [rsp+0x20],xmm2
 11d2cd0:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
 11d2cd5:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 11d2cd9:	e8 71 cf 00 00       	call   11dfc4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251d3>
 11d2cde:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11d2ce5:	00 00
 11d2ce7:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
 11d2cee:	00
 11d2cef:	75 29                	jne    11d2d1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1829e>
 11d2cf1:	48 81 c4 88 00 00 00 	add    rsp,0x88
 11d2cf8:	5b                   	pop    rbx
 11d2cf9:	41 5c                	pop    r12
 11d2cfb:	41 5d                	pop    r13
 11d2cfd:	41 5e                	pop    r14
 11d2cff:	41 5f                	pop    r15
 11d2d01:	5d                   	pop    rbp
 11d2d02:	c3                   	ret
 11d2d03:	49 8b 87 38 03 00 00 	mov    rax,QWORD PTR [r15+0x338]
 11d2d0a:	48 85 c0             	test   rax,rax
 11d2d0d:	0f 8f 15 ff ff ff    	jg     11d2c28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181ac>
 11d2d13:	31 ed                	xor    ebp,ebp
 11d2d15:	e9 39 ff ff ff       	jmp    11d2c53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181d7>
 11d2d1a:	e8 91 cd 61 00       	call   17efab0 <__stack_chk_fail@plt>
 11d2d1f:	48 89 c7             	mov    rdi,rax
 11d2d22:	e8 7e 6d 8a ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 11d2d27:	cc                   	int3
 11d2d28:	55                   	push   rbp
 11d2d29:	41 57                	push   r15
 11d2d2b:	41 56                	push   r14
 11d2d2d:	41 55                	push   r13
 11d2d2f:	41 54                	push   r12
 11d2d31:	53                   	push   rbx
 11d2d32:	48 81 ec b8 01 00 00 	sub    rsp,0x1b8
 11d2d39:	49 89 f7             	mov    r15,rsi
 11d2d3c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11d2d43:	00 00
 11d2d45:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
 11d2d4c:	00
 11d2d4d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11d2d50:	48 8b 30             	mov    rsi,QWORD PTR [rax]
 11d2d53:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 11d2d57:	48 83 c6 10          	add    rsi,0x10
 11d2d5b:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
 11d2d5f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 11d2d64:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
 11d2d6b:	00
 11d2d6c:	e8 1f 75 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2d71:	41 8b 47 18          	mov    eax,DWORD PTR [r15+0x18]
 11d2d75:	b9 ff ff ff ff       	mov    ecx,0xffffffff
 11d2d7a:	48 39 c8             	cmp    rax,rcx
 11d2d7d:	0f 84 7d 06 00 00    	je     11d3400 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18984>
 11d2d83:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
 11d2d88:	48 8b 99 80 03 00 00 	mov    rbx,QWORD PTR [rcx+0x380]
 11d2d8f:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
 11d2d94:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 11d2d9b:	00
 11d2d9c:	48 89 0e             	mov    QWORD PTR [rsi],rcx
 11d2d9f:	48 8d 0d ea 7f 68 00 	lea    rcx,[rip+0x687fea]        # 185ad90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17478>
 11d2da6:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 11d2dad:	00
 11d2dae:	4c 89 fa             	mov    rdx,r15
 11d2db1:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
 11d2db4:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11d2db9:	0f 10 80 08 03 00 00 	movups xmm0,XMMWORD PTR [rax+0x308]
 11d2dc0:	0f 29 84 24 40 01 00 	movaps XMMWORD PTR [rsp+0x140],xmm0
 11d2dc7:	00
 11d2dc8:	c6 84 24 50 01 00 00 	mov    BYTE PTR [rsp+0x150],0x1
 11d2dcf:	01
 11d2dd0:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 11d2dd7:	00
 11d2dd8:	48 8d b4 24 80 01 00 	lea    rsi,[rsp+0x180]
 11d2ddf:	00
 11d2de0:	e8 ab 74 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2de5:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
 11d2dec:	00
 11d2ded:	4c 89 f7             	mov    rdi,r14
 11d2df0:	4c 89 fe             	mov    rsi,r15
 11d2df3:	e8 d4 16 00 00       	call   11d44cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a50>
 11d2df8:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
 11d2dff:	00 00
 11d2e01:	48 83 a4 24 30 01 00 	and    QWORD PTR [rsp+0x130],0x0
 11d2e08:	00 00
 11d2e0a:	6a 50                	push   0x50
 11d2e0c:	5f                   	pop    rdi
 11d2e0d:	e8 ee b0 61 00       	call   17edf00 <_Znwm@plt>
 11d2e12:	49 89 c4             	mov    r12,rax
 11d2e15:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 11d2e1c:	00
 11d2e1d:	48 89 c7             	mov    rdi,rax
 11d2e20:	e8 6b 74 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2e25:	4c 89 e7             	mov    rdi,r12
 11d2e28:	48 83 c7 30          	add    rdi,0x30
 11d2e2c:	4c 89 f6             	mov    rsi,r14
 11d2e2f:	e8 02 d4 ff ff       	call   11d0236 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157ba>
 11d2e34:	4c 89 a4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r12
 11d2e3b:	00
 11d2e3c:	48 8d 05 1b 17 00 00 	lea    rax,[rip+0x171b]        # 11d455e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ae2>
 11d2e43:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
 11d2e4a:	00
 11d2e4b:	48 8d 05 36 17 00 00 	lea    rax,[rip+0x1736]        # 11d4588 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b0c>
 11d2e52:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
 11d2e59:	00
 11d2e5a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 11d2e5f:	48 8d b4 24 80 01 00 	lea    rsi,[rsp+0x180]
 11d2e66:	00
 11d2e67:	e8 24 74 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2e6c:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
 11d2e73:	00
 11d2e74:	4c 89 f7             	mov    rdi,r14
 11d2e77:	4c 89 fe             	mov    rsi,r15
 11d2e7a:	e8 4d 16 00 00       	call   11d44cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a50>
 11d2e7f:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
 11d2e86:	00 00
 11d2e88:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
 11d2e8f:	00 00
 11d2e91:	6a 50                	push   0x50
 11d2e93:	5f                   	pop    rdi
 11d2e94:	e8 67 b0 61 00       	call   17edf00 <_Znwm@plt>
 11d2e99:	49 89 c4             	mov    r12,rax
 11d2e9c:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
 11d2ea1:	48 89 c7             	mov    rdi,rax
 11d2ea4:	e8 e7 73 8a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
 11d2ea9:	4c 89 e7             	mov    rdi,r12
 11d2eac:	48 83 c7 30          	add    rdi,0x30
 11d2eb0:	4c 89 f6             	mov    rsi,r14
 11d2eb3:	e8 7e d3 ff ff       	call   11d0236 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x157ba>
 11d2eb8:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
 11d2ebf:	00
 11d2ec0:	4d 89 21             	mov    QWORD PTR [r9],r12
 11d2ec3:	48 8d 05 94 16 00 00 	lea    rax,[rip+0x1694]        # 11d455e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ae2>
 11d2eca:	49 89 41 10          	mov    QWORD PTR [r9+0x10],rax
 11d2ece:	48 8d 05 5f 17 00 00 	lea    rax,[rip+0x175f]        # 11d4634 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bb8>
 11d2ed5:	49 89 41 18          	mov    QWORD PTR [r9+0x18],rax
 11d2ed9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11d2edc:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
 11d2ee0:	8a 8c 24 50 01 00 00 	mov    cl,BYTE PTR [rsp+0x150]
 11d2ee7:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
 11d2eeb:	0f 28 84 24 40 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x140]
 11d2ef2:	00
 11d2ef3:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 11d2ef7:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 11d2efc:	48 8d 94 24 58 01 00 	lea    rdx,[rsp+0x158]
 11d2f03:	00
 11d2f04:	4c 8d 84 24 20 01 00 	lea    r8,[rsp+0x120]
 11d2f0b:	00
 11d2f0c:	48 89 de             	mov    rsi,rbx
 11d2f0f:	31 c9                	xor    ecx,ecx
 11d2f11:	ff d0                	call   rax
 11d2f13:	4c 89 ff             	mov    rdi,r15
 11d2f16:	e8 b9 17 00 00       	call   11d46d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c58>
 11d2f1b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 11d2f20:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11d2f25:	48 8d 98 90 03 00 00 	lea    rbx,[rax+0x390]
 11d2f2c:	48 8b a8 98 03 00 00 	mov    rbp,QWORD PTR [rax+0x398]
 11d2f33:	48 85 ed             	test   rbp,rbp
 11d2f36:	74 16                	je     11d2f4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184d2>
 11d2f38:	f3 4c 0f b8 f5       	popcnt r14,rbp
 11d2f3d:	49 83 fe 01          	cmp    r14,0x1
 11d2f41:	77 0d                	ja     11d2f50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184d4>
 11d2f43:	4c 8d 65 ff          	lea    r12,[rbp-0x1]
 11d2f47:	4c 23 64 24 28       	and    r12,QWORD PTR [rsp+0x28]
 11d2f4c:	eb 1c                	jmp    11d2f6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184ee>
 11d2f4e:	eb 7f                	jmp    11d2fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18553>
 11d2f50:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11d2f55:	49 89 c4             	mov    r12,rax
 11d2f58:	48 39 e8             	cmp    rax,rbp
 11d2f5b:	72 0d                	jb     11d2f6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184ee>
 11d2f5d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11d2f62:	31 d2                	xor    edx,edx
 11d2f64:	48 f7 f5             	div    rbp
 11d2f67:	49 89 d4             	mov    r12,rdx
 11d2f6a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11d2f6d:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
 11d2f71:	48 85 c0             	test   rax,rax
 11d2f74:	74 59                	je     11d2fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18553>
 11d2f76:	4c 8b 28             	mov    r13,QWORD PTR [rax]
 11d2f79:	4d 85 ed             	test   r13,r13
 11d2f7c:	74 51                	je     11d2fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18553>
 11d2f7e:	48 8d 45 ff          	lea    rax,[rbp-0x1]
 11d2f82:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11d2f87:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 11d2f8b:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 11d2f90:	75 15                	jne    11d2fa7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1852b>
 11d2f92:	49 8d 7d 10          	lea    rdi,[r13+0x10]
 11d2f96:	4c 89 fe             	mov    rsi,r15
 11d2f99:	e8 a7 17 00 00       	call   11d4745 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cc9>
 11d2f9e:	84 c0                	test   al,al
 11d2fa0:	74 24                	je     11d2fc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1854a>
 11d2fa2:	e9 cc 03 00 00       	jmp    11d3373 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x188f7>
 11d2fa7:	41 83 fe 01          	cmp    r14d,0x1
 11d2fab:	77 07                	ja     11d2fb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18538>
 11d2fad:	48 23 44 24 30       	and    rax,QWORD PTR [rsp+0x30]
 11d2fb2:	eb 0d                	jmp    11d2fc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18545>
 11d2fb4:	48 39 e8             	cmp    rax,rbp
 11d2fb7:	72 08                	jb     11d2fc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18545>
 11d2fb9:	31 d2                	xor    edx,edx
 11d2fbb:	48 f7 f5             	div    rbp
 11d2fbe:	48 89 d0             	mov    rax,rdx
 11d2fc1:	4c 39 e0             	cmp    rax,r12
 11d2fc4:	75 09                	jne    11d2fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18553>
 11d2fc6:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
 11d2fca:	4d 85 ed             	test   r13,r13
 11d2fcd:	75 b8                	jne    11d2f87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1850b>
 11d2fcf:	6a 40                	push   0x40
 11d2fd1:	5f                   	pop    rdi
 11d2fd2:	e8 29 af 61 00       	call   17edf00 <_Znwm@plt>
 11d2fd7:	49 89 c5             	mov    r13,rax
 11d2fda:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
 11d2fdf:	49 8d 86 a0 03 00 00 	lea    rax,[r14+0x3a0]
 11d2fe6:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13
 11d2feb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
```
Relevant refs in this target window:

```text
 11d2f1b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 11d2f25:	48 8d 98 90 03 00 00 	lea    rbx,[rax+0x390]
 11d2f2c:	48 8b a8 98 03 00 00 	mov    rbp,QWORD PTR [rax+0x398]
 11d2f47:	4c 23 64 24 28       	and    r12,QWORD PTR [rsp+0x28]
 11d2f50:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11d2f5d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11d2f8b:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
 11d2fff:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
```
### target `0x15cb0f2`

```text
 15cb041:	4d 8b 4e 48          	mov    r9,QWORD PTR [r14+0x48]
 15cb045:	49 8b 14 24          	mov    rdx,QWORD PTR [r12]
 15cb049:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15cb050:	00 00
 15cb052:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 15cb057:	75 2e                	jne    15cb087 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41060b>
 15cb059:	49 8d 76 08          	lea    rsi,[r14+0x8]
 15cb05d:	49 81 c6 d8 00 00 00 	add    r14,0xd8
 15cb064:	4d 29 c1             	sub    r9,r8
 15cb067:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
 15cb06b:	48 89 df             	mov    rdi,rbx
 15cb06e:	4c 89 f1             	mov    rcx,r14
 15cb071:	e8 8c 1c 00 00       	call   15ccd02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x412286>
 15cb076:	48 89 d8             	mov    rax,rbx
 15cb079:	48 83 c4 20          	add    rsp,0x20
 15cb07d:	5b                   	pop    rbx
 15cb07e:	41 5c                	pop    r12
 15cb080:	41 5d                	pop    r13
 15cb082:	41 5e                	pop    r14
 15cb084:	41 5f                	pop    r15
 15cb086:	c3                   	ret
 15cb087:	e8 24 4a 22 00       	call   17efab0 <__stack_chk_fail@plt>
 15cb08c:	41 57                	push   r15
 15cb08e:	41 56                	push   r14
 15cb090:	41 55                	push   r13
 15cb092:	41 54                	push   r12
 15cb094:	53                   	push   rbx
 15cb095:	49 89 d7             	mov    r15,rdx
 15cb098:	48 89 fb             	mov    rbx,rdi
 15cb09b:	4c 8d a6 d8 00 00 00 	lea    r12,[rsi+0xd8]
 15cb0a2:	4c 8d 6e 30          	lea    r13,[rsi+0x30]
 15cb0a6:	bf f0 00 00 00       	mov    edi,0xf0
 15cb0ab:	e8 50 2e 22 00       	call   17edf00 <_Znwm@plt>
 15cb0b0:	49 89 c6             	mov    r14,rax
 15cb0b3:	48 89 c7             	mov    rdi,rax
 15cb0b6:	4c 89 fe             	mov    rsi,r15
 15cb0b9:	4c 89 e2             	mov    rdx,r12
 15cb0bc:	4c 89 e9             	mov    rcx,r13
 15cb0bf:	e8 e6 a4 ff ff       	call   15c55aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40ab2e>
 15cb0c4:	48 8d 05 8d a7 2b 00 	lea    rax,[rip+0x2ba78d]        # 1885858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41f40>
 15cb0cb:	49 89 06             	mov    QWORD PTR [r14],rax
 15cb0ce:	4c 89 33             	mov    QWORD PTR [rbx],r14
 15cb0d1:	48 89 d8             	mov    rax,rbx
 15cb0d4:	5b                   	pop    rbx
 15cb0d5:	41 5c                	pop    r12
 15cb0d7:	41 5d                	pop    r13
 15cb0d9:	41 5e                	pop    r14
 15cb0db:	41 5f                	pop    r15
 15cb0dd:	c3                   	ret
 15cb0de:	48 89 c3             	mov    rbx,rax
 15cb0e1:	4c 89 f7             	mov    rdi,r14
 15cb0e4:	e8 37 2e 22 00       	call   17edf20 <_ZdlPv@plt>
 15cb0e9:	48 89 df             	mov    rdi,rbx
 15cb0ec:	e8 df 4b 4a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 15cb0f1:	cc                   	int3
 15cb0f2:	55                   	push   rbp
 15cb0f3:	41 57                	push   r15
 15cb0f5:	41 56                	push   r14
 15cb0f7:	41 55                	push   r13
 15cb0f9:	41 54                	push   r12
 15cb0fb:	53                   	push   rbx
 15cb0fc:	48 83 ec 38          	sub    rsp,0x38
 15cb100:	49 89 d7             	mov    r15,rdx
 15cb103:	49 89 f6             	mov    r14,rsi
 15cb106:	48 89 fb             	mov    rbx,rdi
 15cb109:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15cb110:	00 00
 15cb112:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 15cb117:	0f 10 86 d8 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xd8]
 15cb11e:	0f 11 44 24 08       	movups XMMWORD PTR [rsp+0x8],xmm0
 15cb123:	83 f9 0b             	cmp    ecx,0xb
 15cb126:	77 5d                	ja     15cb185 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410709>
 15cb128:	89 cd                	mov    ebp,ecx
 15cb12a:	41 89 cd             	mov    r13d,ecx
 15cb12d:	48 8d 05 84 e2 dc fe 	lea    rax,[rip+0xfffffffffedce284]        # 3993b8 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x5f99>
 15cb134:	4a 63 0c a8          	movsxd rcx,DWORD PTR [rax+r13*4]
 15cb138:	48 01 c1             	add    rcx,rax
 15cb13b:	ff e1                	jmp    rcx
 15cb13d:	49 81 c6 70 01 00 00 	add    r14,0x170
 15cb144:	e9 fb 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb149:	49 81 c6 80 02 00 00 	add    r14,0x280
 15cb150:	e9 ef 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb155:	49 81 c6 08 03 00 00 	add    r14,0x308
 15cb15c:	e9 d7 00 00 00       	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb161:	49 81 c6 f8 01 00 00 	add    r14,0x1f8
 15cb168:	e9 d7 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb16d:	49 81 c6 90 03 00 00 	add    r14,0x390
 15cb174:	e9 cb 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb179:	49 81 c6 90 03 00 00 	add    r14,0x390
 15cb180:	e9 b3 00 00 00       	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb185:	48 8d 35 92 57 d7 fe 	lea    rsi,[rip+0xfffffffffed75792]        # 34091e <_ZTSSt12bad_any_cast@@Base-0x4f8aa>
 15cb18c:	48 8d 0d e9 6d e8 fe 	lea    rcx,[rip+0xfffffffffee86de9]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 15cb193:	49 89 e4             	mov    r12,rsp
 15cb196:	6a 31                	push   0x31
 15cb198:	5a                   	pop    rdx
 15cb199:	4c 89 e7             	mov    rdi,r12
 15cb19c:	45 31 c0             	xor    r8d,r8d
 15cb19f:	e8 42 61 b6 ff       	call   11312e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f86fc>
 15cb1a4:	49 81 c6 f8 01 00 00 	add    r14,0x1f8
 15cb1ab:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb1b0:	4c 89 fe             	mov    rsi,r15
 15cb1b3:	4c 89 e2             	mov    rdx,r12
 15cb1b6:	4c 89 f1             	mov    rcx,r14
 15cb1b9:	e8 f1 9d ff ff       	call   15c4faf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a533>
 15cb1be:	bf f0 01 00 00       	mov    edi,0x1f0
 15cb1c3:	e8 38 2d 22 00       	call   17edf00 <_Znwm@plt>
 15cb1c8:	49 89 c7             	mov    r15,rax
 15cb1cb:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 15cb1d0:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 15cb1d6:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb1db:	48 89 06             	mov    QWORD PTR [rsi],rax
 15cb1de:	6a 01                	push   0x1
 15cb1e0:	59                   	pop    rcx
 15cb1e1:	4c 89 ff             	mov    rdi,r15
 15cb1e4:	4c 89 f2             	mov    rdx,r14
 15cb1e7:	e8 a4 18 00 00       	call   15cca90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x412014>
 15cb1ec:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb1f1:	e8 70 9f ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb1f6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 15cb1fb:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 15cb1ff:	4c 89 3b             	mov    QWORD PTR [rbx],r15
 15cb202:	e8 0f 19 00 00       	call   15ccb16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41209a>
 15cb207:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb20c:	e8 55 9f ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb211:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 15cb215:	e8 d2 b4 4e ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 15cb21a:	e9 ef 00 00 00       	jmp    15cb30e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410892>
 15cb21f:	49 81 c6 80 02 00 00 	add    r14,0x280
 15cb226:	eb 10                	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb228:	49 81 c6 08 03 00 00 	add    r14,0x308
 15cb22f:	eb 13                	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb231:	49 81 c6 18 04 00 00 	add    r14,0x418
 15cb238:	41 b4 01             	mov    r12b,0x1
 15cb23b:	eb 0a                	jmp    15cb247 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107cb>
 15cb23d:	49 81 c6 18 04 00 00 	add    r14,0x418
 15cb244:	45 31 e4             	xor    r12d,r12d
 15cb247:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb24c:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
 15cb251:	4c 89 fe             	mov    rsi,r15
 15cb254:	4c 89 f1             	mov    rcx,r14
 15cb257:	e8 4a 9f ff ff       	call   15c51a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a72a>
 15cb25c:	bf f0 01 00 00       	mov    edi,0x1f0
 15cb261:	e8 9a 2c 22 00       	call   17edf00 <_Znwm@plt>
 15cb266:	49 89 c7             	mov    r15,rax
 15cb269:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
 15cb26e:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 15cb274:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb279:	48 89 06             	mov    QWORD PTR [rsi],rax
 15cb27c:	4c 89 ff             	mov    rdi,r15
 15cb27f:	4c 89 f2             	mov    rdx,r14
 15cb282:	89 e9                	mov    ecx,ebp
 15cb284:	e8 07 18 00 00       	call   15cca90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x412014>
 15cb289:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
 15cb28e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb293:	e8 ce 9e ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb298:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb29d:	e8 c4 9e ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb2a2:	45 84 e4             	test   r12b,r12b
 15cb2a5:	74 54                	je     15cb2fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41087f>
 15cb2a7:	bf d8 00 00 00       	mov    edi,0xd8
 15cb2ac:	e8 4f 2c 22 00       	call   17edf00 <_Znwm@plt>
 15cb2b1:	49 89 c4             	mov    r12,rax
 15cb2b4:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 15cb2ba:	48 8d 05 57 ee e6 fe 	lea    rax,[rip+0xfffffffffee6ee57]        # 43a118 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5fb67>
 15cb2c1:	42 8b 0c a8          	mov    ecx,DWORD PTR [rax+r13*4]
 15cb2c5:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb2ca:	4c 89 3e             	mov    QWORD PTR [rsi],r15
 15cb2cd:	4c 89 e7             	mov    rdi,r12
 15cb2d0:	4c 89 f2             	mov    rdx,r14
 15cb2d3:	e8 5e 18 00 00       	call   15ccb36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4120ba>
 15cb2d8:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 15cb2dd:	48 85 ff             	test   rdi,rdi
 15cb2e0:	74 06                	je     15cb2e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41086c>
 15cb2e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 15cb2e5:	ff 50 08             	call   QWORD PTR [rax+0x8]
 15cb2e8:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb2ed:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 15cb2f1:	4c 89 23             	mov    QWORD PTR [rbx],r12
 15cb2f4:	e8 c3 18 00 00       	call   15ccbbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x412140>
 15cb2f9:	eb 09                	jmp    15cb304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410888>
 15cb2fb:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
 15cb301:	4c 89 3b             	mov    QWORD PTR [rbx],r15
 15cb304:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 15cb309:	e8 08 18 00 00       	call   15ccb16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41209a>
 15cb30e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15cb315:	00 00
 15cb317:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 15cb31c:	0f 85 ae 00 00 00    	jne    15cb3d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410954>
 15cb322:	48 89 d8             	mov    rax,rbx
 15cb325:	48 83 c4 38          	add    rsp,0x38
 15cb329:	5b                   	pop    rbx
 15cb32a:	41 5c                	pop    r12
 15cb32c:	41 5d                	pop    r13
 15cb32e:	41 5e                	pop    r14
 15cb330:	41 5f                	pop    r15
 15cb332:	5d                   	pop    rbp
 15cb333:	c3                   	ret
 15cb334:	48 89 c3             	mov    rbx,rax
 15cb337:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb33c:	e8 25 9e ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb341:	4c 89 ff             	mov    rdi,r15
 15cb344:	e8 d7 2b 22 00       	call   17edf20 <_ZdlPv@plt>
 15cb349:	eb 03                	jmp    15cb34e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4108d2>
 15cb34b:	48 89 c3             	mov    rbx,rax
 15cb34e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb353:	e8 0e 9e ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb358:	eb 03                	jmp    15cb35d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4108e1>
 15cb35a:	48 89 c3             	mov    rbx,rax
 15cb35d:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
 15cb361:	e8 86 b3 4e ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
 15cb366:	eb 50                	jmp    15cb3b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41093c>
 15cb368:	48 89 c3             	mov    rbx,rax
 15cb36b:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 15cb370:	48 85 ff             	test   rdi,rdi
 15cb373:	74 06                	je     15cb37b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4108ff>
 15cb375:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 15cb378:	ff 50 08             	call   QWORD PTR [rax+0x8]
 15cb37b:	4c 89 e7             	mov    rdi,r12
 15cb37e:	e8 9d 2b 22 00       	call   17edf20 <_ZdlPv@plt>
 15cb383:	eb 03                	jmp    15cb388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41090c>
 15cb385:	48 89 c3             	mov    rbx,rax
 15cb388:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 15cb38d:	e8 84 17 00 00       	call   15ccb16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41209a>
 15cb392:	eb 24                	jmp    15cb3b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41093c>
 15cb394:	48 89 c3             	mov    rbx,rax
 15cb397:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb39c:	e8 c5 9d ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb3a1:	4c 89 ff             	mov    rdi,r15
 15cb3a4:	e8 77 2b 22 00       	call   17edf20 <_ZdlPv@plt>
 15cb3a9:	eb 03                	jmp    15cb3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410932>
 15cb3ab:	48 89 c3             	mov    rbx,rax
 15cb3ae:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 15cb3b3:	e8 ae 9d ff ff       	call   15c5166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40a6ea>
 15cb3b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 15cb3bf:	00 00
 15cb3c1:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 15cb3c6:	75 08                	jne    15cb3d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410954>
 15cb3c8:	48 89 df             	mov    rdi,rbx
 15cb3cb:	e8 00 49 4a ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 15cb3d0:	e8 db 46 22 00       	call   17efab0 <__stack_chk_fail@plt>
```
Relevant refs in this target window:

```text
 15cb126:	77 5d                	ja     15cb185 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410709>
 15cb144:	e9 fb 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb150:	e9 ef 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb15c:	e9 d7 00 00 00       	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb168:	e9 d7 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb16d:	49 81 c6 90 03 00 00 	add    r14,0x390
 15cb174:	e9 cb 00 00 00       	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb179:	49 81 c6 90 03 00 00 	add    r14,0x390
 15cb180:	e9 b3 00 00 00       	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb1d6:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb1ec:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb21a:	e9 ef 00 00 00       	jmp    15cb30e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410892>
 15cb226:	eb 10                	jmp    15cb238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107bc>
 15cb22f:	eb 13                	jmp    15cb244 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107c8>
 15cb23b:	eb 0a                	jmp    15cb247 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4107cb>
 15cb274:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb28e:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb2a5:	74 54                	je     15cb2fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41087f>
 15cb2c5:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
 15cb2d8:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 15cb2e0:	74 06                	je     15cb2e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41086c>
 15cb2f9:	eb 09                	jmp    15cb304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410888>
 15cb31c:	0f 85 ae 00 00 00    	jne    15cb3d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410954>
 15cb337:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb349:	eb 03                	jmp    15cb34e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4108d2>
 15cb358:	eb 03                	jmp    15cb35d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4108e1>
 15cb366:	eb 50                	jmp    15cb3b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41093c>
 15cb36b:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 15cb373:	74 06                	je     15cb37b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4108ff>
 15cb383:	eb 03                	jmp    15cb388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41090c>
 15cb392:	eb 24                	jmp    15cb3b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41093c>
 15cb397:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
 15cb3a9:	eb 03                	jmp    15cb3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410932>
 15cb3c6:	75 08                	jne    15cb3d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410954>
 15cb40c:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
```
## Text materializations of candidate AP bases

| addr | instruction |
|---:|---|

## Interpretation

A concrete match should either be materialized into the object stored at offset `+0x410`, or its `+0x28` target should directly/indirectly populate the receiver pair later seen at `[rsp+0x390]/[rsp+0x398]`. Without that assignment edge, the AP remains only a candidate.
