# Restriction-owner constructor and owned gate writers

Concrete owner identity anchors:
- primary vptr address point: 0x184c738
- secondary interface vptr: 0x184c858 (this adjustment -8)
- destructor/teardown method: 0x10a8812
- restriction builder: 0x10a6464
- event subtype-6 method: 0x10a9668
- candidate constructor/initializer: 0x10a578a..0x10a5d2d

## Constructor vptr stores and gate-field accesses

     10a58e3:	48 8d 05 4e 6e 7a 00 	lea    rax,[rip+0x7a6e4e]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>
     10a58ee:	48 8d 05 63 6f 7a 00 	lea    rax,[rip+0x7a6f63]        # 184c858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f40>
     10a5b36:	66 83 a5 58 18 00 00 	and    WORD PTR [rbp+0x1858],0x0
     10a5b58:	48 89 9d 90 18 00 00 	mov    QWORD PTR [rbp+0x1890],rbx
     10a5b63:	48 89 85 98 18 00 00 	mov    QWORD PTR [rbp+0x1898],rax
     10a5b74:	48 8b 9d 90 18 00 00 	mov    rbx,QWORD PTR [rbp+0x1890]

## Context around constructor vptr stores

### 184c738 referenced @ 0x10a58e3
     10a58a6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10a58a9:	49 89 c6             	mov    r14,rax
     10a58ac:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     10a58b0:	4c 89 e7             	mov    rdi,r12
     10a58b3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10a58b6:	49 89 c4             	mov    r12,rax
     10a58b9:	bf b0 18 00 00       	mov    edi,0x18b0
     10a58be:	e8 3d 86 74 00       	call   17edf00 <_Znwm@plt>
     10a58c3:	48 89 c5             	mov    rbp,rax
     10a58c6:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
     10a58cb:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     10a58d0:	49 8b 46 68          	mov    rax,QWORD PTR [r14+0x68]
     10a58d4:	48 85 c0             	test   rax,rax
     10a58d7:	74 05                	je     10a58de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ccf4>
     10a58d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10a58de:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     10a58e3:	48 8d 05 4e 6e 7a 00 	lea    rax,[rip+0x7a6e4e]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>
     10a58ea:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     10a58ee:	48 8d 05 63 6f 7a 00 	lea    rax,[rip+0x7a6f63]        # 184c858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f40>
     10a58f5:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     10a58f9:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     10a58fe:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     10a5902:	48 89 5d 18          	mov    QWORD PTR [rbp+0x18],rbx
     10a5906:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     10a590b:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     10a590f:	4c 89 7d 28          	mov    QWORD PTR [rbp+0x28],r15
     10a5913:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     10a5918:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
     10a591c:	48 8d 7d 38          	lea    rdi,[rbp+0x38]
     10a5920:	e8 c7 06 00 00       	call   10a5fec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d402>
     10a5925:	48 8b 5d 18          	mov    rbx,QWORD PTR [rbp+0x18]
     10a5929:	4c 8d 44 24 68       	lea    r8,[rsp+0x68]
     10a592e:	49 89 28             	mov    QWORD PTR [r8],rbp
     10a5931:	48 8d 35 59 77 9f ff 	lea    rsi,[rip+0xffffffffff9f7759]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     10a5938:	48 8d 0d 91 07 00 00 	lea    rcx,[rip+0x791]        # 10a60d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d4e6>
     10a593f:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
     10a5944:	6a 08                	push   0x8
     10a5946:	41 59                	pop    r9
     10a5948:	4c 89 f7             	mov    rdi,r14
     10a594b:	31 d2                	xor    edx,edx
     10a594d:	e8 42 4e 73 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     10a5952:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10a5955:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     10a595c:	00 

### 184c858 referenced @ 0x10a58ee
     10a58ac:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     10a58b0:	4c 89 e7             	mov    rdi,r12
     10a58b3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10a58b6:	49 89 c4             	mov    r12,rax
     10a58b9:	bf b0 18 00 00       	mov    edi,0x18b0
     10a58be:	e8 3d 86 74 00       	call   17edf00 <_Znwm@plt>
     10a58c3:	48 89 c5             	mov    rbp,rax
     10a58c6:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
     10a58cb:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     10a58d0:	49 8b 46 68          	mov    rax,QWORD PTR [r14+0x68]
     10a58d4:	48 85 c0             	test   rax,rax
     10a58d7:	74 05                	je     10a58de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ccf4>
     10a58d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10a58de:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     10a58e3:	48 8d 05 4e 6e 7a 00 	lea    rax,[rip+0x7a6e4e]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>
     10a58ea:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     10a58ee:	48 8d 05 63 6f 7a 00 	lea    rax,[rip+0x7a6f63]        # 184c858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f40>
     10a58f5:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     10a58f9:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     10a58fe:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     10a5902:	48 89 5d 18          	mov    QWORD PTR [rbp+0x18],rbx
     10a5906:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     10a590b:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     10a590f:	4c 89 7d 28          	mov    QWORD PTR [rbp+0x28],r15
     10a5913:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     10a5918:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
     10a591c:	48 8d 7d 38          	lea    rdi,[rbp+0x38]
     10a5920:	e8 c7 06 00 00       	call   10a5fec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d402>
     10a5925:	48 8b 5d 18          	mov    rbx,QWORD PTR [rbp+0x18]
     10a5929:	4c 8d 44 24 68       	lea    r8,[rsp+0x68]
     10a592e:	49 89 28             	mov    QWORD PTR [r8],rbp
     10a5931:	48 8d 35 59 77 9f ff 	lea    rsi,[rip+0xffffffffff9f7759]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     10a5938:	48 8d 0d 91 07 00 00 	lea    rcx,[rip+0x791]        # 10a60d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d4e6>
     10a593f:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
     10a5944:	6a 08                	push   0x8
     10a5946:	41 59                	pop    r9
     10a5948:	4c 89 f7             	mov    rdi,r14
     10a594b:	31 d2                	xor    edx,edx
     10a594d:	e8 42 4e 73 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     10a5952:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10a5955:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     10a595c:	00 
     10a595d:	6a 01                	push   0x1
     10a595f:	5a                   	pop    rdx

## Constructor writes to +0x438 / +0x470 / +0x598

- no direct constructor stores to the three fields

## Direct callers of constructor entry

- none
## Primary owner vtable

- slot +0x0 (0x184c738) -> 0x10a8812, FDE 0x10a8812..0x10a88e0
- slot +0x8 (0x184c740) -> 0x10a88e0, FDE 0x10a88e0..0x10a88f2
- slot +0x10 (0x184c748) -> 0x10a88f2, FDE 0x10a88f2..0x10a89b6
- slot +0x18 (0x184c750) -> 0x10a89b6, FDE 0x10a89b6..0x10a8aad
- slot +0x20 (0x184c758) -> 0x10a8aae, FDE 0x10a8aae..0x10a8da4
- slot +0x28 (0x184c760) -> 0x10a8da4, FDE 0x10a8da4..0x10a8dac
- slot +0x30 (0x184c768) -> 0x10a8dac, FDE 0x10a8dac..0x10a8db4
- slot +0x38 (0x184c770) -> 0x10a8db4, FDE 0x10a8db4..0x10a8ead
- slot +0x40 (0x184c778) -> 0x10a8eae, FDE 0x10a8eae..0x10a8ecb
- slot +0x48 (0x184c780) -> 0x10a8ecc, FDE 0x10a8ecc..0x10a8f65
- slot +0x50 (0x184c788) -> 0x10a8f66, FDE 0x10a8f66..0x10a8f83
- slot +0x58 (0x184c790) -> 0x10a8f84, FDE 0x10a8f84..0x10a9139
- slot +0x60 (0x184c798) -> 0x10a913a, FDE 0x10a913a..0x10a9297
- slot +0x68 (0x184c7a0) -> 0x10a9298, FDE 0x10a9298..0x10a92b5
- slot +0x70 (0x184c7a8) -> 0x10a92b6, FDE 0x10a92b6..0x10a92d3
- slot +0x78 (0x184c7b0) -> 0x10a92d4, FDE 0x10a92d4..0x10a92f1
- slot +0x80 (0x184c7b8) -> 0x10a92f2, FDE 0x10a92f2..0x10a930f
- slot +0x88 (0x184c7c0) -> 0x10a9310, FDE 0x10a9310..0x10a932d
- slot +0x90 (0x184c7c8) -> 0x10a932e, FDE 0x10a932e..0x10a934b
- slot +0x98 (0x184c7d0) -> 0x10a934c, FDE 0x10a934c..0x10a9369
- slot +0xa0 (0x184c7d8) -> 0x10a936a, FDE 0x10a936a..0x10a9387
- slot +0xa8 (0x184c7e0) -> 0x10a9388, FDE 0x10a9388..0x10a93a5
- slot +0xb0 (0x184c7e8) -> 0x10a93a6, FDE 0x10a93a6..0x10a93c3
- slot +0xb8 (0x184c7f0) -> 0x10a93c4, FDE 0x10a93c4..0x10a93dc
- slot +0xc0 (0x184c7f8) -> 0x10a93dc, FDE 0x10a93dc..0x10a941c
- slot +0xc8 (0x184c800) -> 0x10a941c, FDE 0x10a941c..0x10a9436
- slot +0xd0 (0x184c808) -> 0x10a9436, FDE 0x10a9436..0x10a9566
- slot +0xd8 (0x184c810) -> 0x10a9566, FDE 0x10a9566..0x10a9583
- slot +0xe0 (0x184c818) -> 0x10a9584, FDE 0x10a9584..0x10a95a1
- slot +0xe8 (0x184c820) -> 0x10a95a2, FDE 0x10a95a2..0x10a95bf
- slot +0xf0 (0x184c828) -> 0x10a95c0, FDE 0x10a95c0..0x10a95dd
- slot +0xf8 (0x184c830) -> 0x10a95de, FDE 0x10a95de..0x10a95fb
- slot +0x100 (0x184c838) -> 0x10a95fc, FDE 0x10a95fc..0x10a9668
- slot +0x108 (0x184c840) -> 0x10a9668, FDE 0x10a9668..0x10a969c

## Gate field accesses in primary-vtable-owned methods

### FDE 0x10a9668..0x10a969c; slots +0x108
this aliases: rdi
- 0x10a966e: +0x598 :: cmp    BYTE PTR [rdi+0x598],0x0
- 0x10a9677: +0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0x10a9680: +0x438 :: mov    rax,QWORD PTR [rdi+0x438]

Direct gate writes found in primary-vtable methods: 0

## Secondary-interface table

- slot +0x0 (0x184c858) -> 0x10a969c
- slot +0x8 (0x184c860) -> 0x10a96a6
- slot +0x10 (0x184c868) -> 0x9d7de0
- slot +0x18 (0x184c870) -> 0x9d7de0
- slot +0x20 (0x184c878) -> 0x9d7de0
- slot +0x28 (0x184c880) -> 0x9d7de0
- slot +0x30 (0x184c888) -> 0x9d7de0
- slot +0x38 (0x184c890) -> 0x9d7de0
- slot +0x40 (0x184c898) -> 0x9d7de0
- slot +0x48 (0x184c8a0) -> 0x9d7de0
- slot +0x50 (0x184c8a8) -> 0x10a96b0
- slot +0x58 (0x184c8b0) -> 0x9d7de0
- slot +0x60 (0x184c8b8) -> 0x9d7de0
- slot +0x68 (0x184c8c0) -> 0x9d7de0
- slot +0x70 (0x184c8c8) -> 0x9d7de0
- slot +0x78 (0x184c8d0) -> 0x9d7de0
- slot +0x80 (0x184c8d8) -> 0x9d7de0
- slot +0x88 (0x184c8e0) -> 0x9d7de0
- slot +0xa0 (0x184c8f8) -> 0x9d7de0

## Known skip-next enforcement

0x10a7492 tests owner+0x598; 0x10a74a0 tests owner+0x470; when both are nonzero,
0x10a74ae creates ad_disallow and inserts it into owner+0x14a0 = disallowSkippingNextReasons.
