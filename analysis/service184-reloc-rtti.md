# Service184 relocation + RTTI resolution

## Relocations whose addend/symbol value points to 0x11ee608
- count=1
### relocation slot 0x185b8f8 section=.rela.dyn type=8 symbol=None
- neighboring qwords/relocations:
  - 0x185b878: 0x0 FDE=None
  - 0x185b880: 0x0 FDE=None
  - 0x185b888: 0x11ee0ca FDE=(18800842, 18800868)
  - 0x185b890: 0x11ee59c FDE=(18802076, 18802094)
  - 0x185b898: 0x11ee416 FDE=(18801686, 18801705)
  - 0x185b8a0: 0x11ee5ae FDE=(18802094, 18802121)
  - 0x185b8a8: 0x11ee5ca FDE=(18802122, 18802149)
  - 0x185b8b0: 0x11ee5e6 FDE=(18802150, 18802155)
  - 0x185b8b8: 0xe6e642 FDE=(15132226, 15132331)
  - 0x185b8c0: 0x0 FDE=None
  - 0x185b8c8: 0x0 FDE=None
  - 0x185b8d0: 0x9d7de0 FDE=(10321376, 10321377)
  - 0x185b8d8: 0xa50370 FDE=(10814320, 10814325)
  - 0x185b8e0: 0x11ee5ec FDE=(18802156, 18802159)
  - 0x185b8e8: 0x11ee5f0 FDE=(18802160, 18802171)
  - 0x185b8f0: 0x11ee5fc FDE=(18802172, 18802183)
  - 0x185b8f8: 0x11ee608 FDE=(18802184, 18804775) <-- target
  - 0x185b900: 0x0 FDE=None
  - 0x185b908: 0x0 FDE=None
  - 0x185b910: 0x11ef054 FDE=(18804820, 18804835)
  - 0x185b918: 0x11ef064 FDE=(18804836, 18804854)
  - 0x185b920: 0x11ef076 FDE=(18804854, 18804943)
  - 0x185b928: 0x0 FDE=None
  - 0x185b930: 0xa50370 FDE=(10814320, 10814325)
  - 0x185b938: 0x0 FDE=None
  - 0x185b940: 0x0 FDE=None
  - 0x185b948: 0x11f9384 FDE=(18846596, 18847792)
  - 0x185b950: 0x11f9830 FDE=(18847792, 18847810)
  - 0x185b958: 0x9d7de0 FDE=(10321376, 10321377)
  - 0x185b960: 0x9d7de0 FDE=(10321376, 10321377)
  - 0x185b968: 0x11f9842 FDE=(18847810, 18848234)
  - 0x185b970: 0x11f99ea FDE=(18848234, 18848242)
  - 0x185b978: 0x11f99f2 FDE=(18848242, 18848250)


## Code references/materializations of target/table neighborhoods
### 0xb60b11: lea    rcx,[rip+0xcfad10]        # 185b828 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f10> -> 0x185b828; FDE=(11925239, 11936142)
  b60ae9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b60aee:	48 89 06             	mov    QWORD PTR [rsi],rax
  b60af1:	48 89 e7             	mov    rdi,rsp
  b60af4:	e8 1d d0 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b60af9:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b60afe:	48 85 ff             	test   rdi,rdi
  b60b01:	74 06                	je     b60b09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadaa9>
  b60b03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b60b06:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b60b09:	6a 08                	push   0x8
  b60b0b:	5f                   	pop    rdi
  b60b0c:	e8 ef d3 c8 00       	call   17edf00 <_Znwm@plt>
  b60b11:	48 8d 0d 10 ad cf 00 	lea    rcx,[rip+0xcfad10]        # 185b828 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f10>
  b60b18:	48 89 08             	mov    QWORD PTR [rax],rcx
  b60b1b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b60b20:	48 89 06             	mov    QWORD PTR [rsi],rax
  b60b23:	48 89 e7             	mov    rdi,rsp
  b60b26:	e8 eb cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b60b2b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b60b30:	48 85 ff             	test   rdi,rdi
  b60b33:	74 06                	je     b60b3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadadb>
  b60b35:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b60b38:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b60b3b:	6a 08                	push   0x8
  b60b3d:	5f                   	pop    rdi
  b60b3e:	e8 bd d3 c8 00       	call   17edf00 <_Znwm@plt>
  b60b43:	48 8d 0d 06 bf ce 00 	lea    rcx,[rip+0xcebf06]        # 184ca50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9138>
  b60b4a:	48 89 08             	mov    QWORD PTR [rax],rcx
  b60b4d:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b60b52:	48 89 06             	mov    QWORD PTR [rsi],rax
  b60b55:	48 89 e7             	mov    rdi,rsp
  b60b58:	e8 b9 cf f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b60b5d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]

### 0xb6162f: lea    rcx,[rip+0xcfa29a]        # 185b8d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17fb8> -> 0x185b8d0; FDE=(11925239, 11936142)
  b6160a:	48 89 e7             	mov    rdi,rsp
  b6160d:	e8 04 c5 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b61612:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b61617:	48 85 ff             	test   rdi,rdi
  b6161a:	74 06                	je     b61622 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5c2>
  b6161c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b6161f:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b61622:	40 84 ed             	test   bpl,bpl
  b61625:	74 64                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
  b61627:	6a 08                	push   0x8
  b61629:	5f                   	pop    rdi
  b6162a:	e8 d1 c8 c8 00       	call   17edf00 <_Znwm@plt>
  b6162f:	48 8d 0d 9a a2 cf 00 	lea    rcx,[rip+0xcfa29a]        # 185b8d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17fb8>
  b61636:	48 89 08             	mov    QWORD PTR [rax],rcx
  b61639:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b6163e:	48 89 06             	mov    QWORD PTR [rsi],rax
  b61641:	48 89 e7             	mov    rdi,rsp
  b61644:	e8 cd c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b61649:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b6164e:	48 85 ff             	test   rdi,rdi
  b61651:	74 06                	je     b61659 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae5f9>
  b61653:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b61656:	ff 50 08             	call   QWORD PTR [rax+0x8]
  b61659:	6a 08                	push   0x8
  b6165b:	5f                   	pop    rdi
  b6165c:	e8 9f c8 c8 00       	call   17edf00 <_Znwm@plt>
  b61661:	48 8d 0d e0 a0 cb 00 	lea    rcx,[rip+0xcba0e0]        # 181b748 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11408>
  b61668:	48 89 08             	mov    QWORD PTR [rax],rcx
  b6166b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  b61670:	48 89 06             	mov    QWORD PTR [rsi],rax
  b61673:	48 89 e7             	mov    rdi,rsp
  b61676:	e8 9b c4 f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
  b6167b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]

### 0x11edfcc: lea    rax,[rip+0x66d8b5]        # 185b888 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f70> -> 0x185b888; FDE=(18800498, 18800841)
 11edf9b:	4c 8b 62 60          	mov    r12,QWORD PTR [rdx+0x60]
 11edf9f:	6a 18                	push   0x18
 11edfa1:	5f                   	pop    rdi
 11edfa2:	e8 59 ff 5f 00       	call   17edf00 <_Znwm@plt>
 11edfa7:	49 89 c6             	mov    r14,rax
 11edfaa:	41 8a af 80 02 00 00 	mov    bpl,BYTE PTR [r15+0x280]
 11edfb1:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
 11edfb5:	48 8d 05 94 01 62 00 	lea    rax,[rip+0x620194]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
 11edfbc:	49 89 06             	mov    QWORD PTR [r14],rax
 11edfbf:	bf a0 00 00 00       	mov    edi,0xa0
 11edfc4:	e8 37 ff 5f 00       	call   17edf00 <_Znwm@plt>
 11edfc9:	49 89 c7             	mov    r15,rax
 11edfcc:	48 8d 05 b5 d8 66 00 	lea    rax,[rip+0x66d8b5]        # 185b888 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f70>
 11edfd3:	49 89 07             	mov    QWORD PTR [r15],rax
 11edfd6:	41 88 6f 08          	mov    BYTE PTR [r15+0x8],bpl
 11edfda:	41 83 67 0c 00       	and    DWORD PTR [r15+0xc],0x0
 11edfdf:	4c 89 e7             	mov    rdi,r12
 11edfe2:	e8 fd 00 00 00       	call   11ee0e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33668>
 11edfe7:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
 11edfeb:	31 c0                	xor    eax,eax
 11edfed:	41 88 47 14          	mov    BYTE PTR [r15+0x14],al
 11edff1:	41 88 47 18          	mov    BYTE PTR [r15+0x18],al
 11edff5:	41 88 47 1c          	mov    BYTE PTR [r15+0x1c],al
 11edff9:	41 88 47 20          	mov    BYTE PTR [r15+0x20],al
 11edffd:	4d 89 6f 28          	mov    QWORD PTR [r15+0x28],r13
 11ee001:	4d 89 67 30          	mov    QWORD PTR [r15+0x30],r12
 11ee005:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
 11ee00a:	4d 89 38             	mov    QWORD PTR [r8],r15
 11ee00d:	48 8d 35 7d f0 8a ff 	lea    rsi,[rip+0xffffffffff8af07d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11ee014:	48 8d 0d e9 01 00 00 	lea    rcx,[rip+0x1e9]        # 11ee204 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33788>
 11ee01b:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
 11ee020:	6a 08                	push   0x8
 11ee022:	41 59                	pop    r9

### 0x11ee0fe: lea    rsi,[rip+0x66d753]        # 185b858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f40> -> 0x185b858; FDE=(18800868, 18801155)
 11ee0d7:	48 83 c3 38          	add    rbx,0x38
 11ee0db:	48 89 df             	mov    rdi,rbx
 11ee0de:	5b                   	pop    rbx
 11ee0df:	e9 f0 ba 5e 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 11ee0e4:	41 57                	push   r15
 11ee0e6:	41 56                	push   r14
 11ee0e8:	53                   	push   rbx
 11ee0e9:	48 83 ec 70          	sub    rsp,0x70
 11ee0ed:	48 89 fb             	mov    rbx,rdi
 11ee0f0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11ee0f7:	00 00 
 11ee0f9:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 11ee0fe:	48 8d 35 53 d7 66 00 	lea    rsi,[rip+0x66d753]        # 185b858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f40>
 11ee105:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 11ee10a:	e8 9b 3c 5d 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 11ee10f:	48 8d 35 66 3e 26 ff 	lea    rsi,[rip+0xffffffffff263e66]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 11ee116:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 11ee11b:	e8 5e b9 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11ee120:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 11ee123:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 11ee128:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 11ee12d:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 11ee132:	4c 89 f2             	mov    rdx,r14
 11ee135:	4c 89 f9             	mov    rcx,r15
 11ee138:	e8 b3 4e 42 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
 11ee13d:	4c 89 ff             	mov    rdi,r15
 11ee140:	e8 4b fd 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee145:	4c 89 f7             	mov    rdi,r14
 11ee148:	e8 43 fd 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee14d:	48 8d 35 14 d7 66 00 	lea    rsi,[rip+0x66d714]        # 185b868 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f50>
 11ee154:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 11ee159:	e8 4c 3c 5d 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 11ee15e:	48 8d 35 17 3e 26 ff 	lea    rsi,[rip+0xffffffffff263e17]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

### 0x11ee14d: lea    rsi,[rip+0x66d714]        # 185b868 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f50> -> 0x185b868; FDE=(18800868, 18801155)
 11ee11b:	e8 5e b9 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11ee120:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 11ee123:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 11ee128:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
 11ee12d:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
 11ee132:	4c 89 f2             	mov    rdx,r14
 11ee135:	4c 89 f9             	mov    rcx,r15
 11ee138:	e8 b3 4e 42 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
 11ee13d:	4c 89 ff             	mov    rdi,r15
 11ee140:	e8 4b fd 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee145:	4c 89 f7             	mov    rdi,r14
 11ee148:	e8 43 fd 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee14d:	48 8d 35 14 d7 66 00 	lea    rsi,[rip+0x66d714]        # 185b868 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f50>
 11ee154:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 11ee159:	e8 4c 3c 5d 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 11ee15e:	48 8d 35 17 3e 26 ff 	lea    rsi,[rip+0xffffffffff263e17]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 11ee165:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 11ee16a:	e8 0f b9 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11ee16f:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 11ee172:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 11ee177:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
 11ee17c:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
 11ee181:	48 89 da             	mov    rdx,rbx
 11ee184:	4c 89 f1             	mov    rcx,r14
 11ee187:	e8 64 4e 42 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
 11ee18c:	4c 89 f7             	mov    rdi,r14
 11ee18f:	e8 fc fc 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee194:	48 89 df             	mov    rdi,rbx
 11ee197:	e8 f4 fc 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee19c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
 11ee1a1:	e8 43 5c 29 00       	call   1483de9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c936d>
 11ee1a6:	89 c3                	mov    ebx,eax
 11ee1a8:	83 f8 04             	cmp    eax,0x4

### 0x11ee372: lea    rsi,[rip+0x66d4df]        # 185b858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f40> -> 0x185b858; FDE=(18801492, 18801685)
 11ee34e:	e9 8d 5a 94 ff       	jmp    b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
 11ee353:	cc                   	int3
 11ee354:	55                   	push   rbp
 11ee355:	41 57                	push   r15
 11ee357:	41 56                	push   r14
 11ee359:	53                   	push   rbx
 11ee35a:	48 83 ec 38          	sub    rsp,0x38
 11ee35e:	49 89 fe             	mov    r14,rdi
 11ee361:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11ee368:	00 00 
 11ee36a:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11ee36f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
 11ee372:	48 8d 35 df d4 66 00 	lea    rsi,[rip+0x66d4df]        # 185b858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f40>
 11ee379:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 11ee37e:	e8 27 3a 5d 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 11ee383:	49 83 c6 08          	add    r14,0x8
 11ee387:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 11ee38c:	4c 89 f7             	mov    rdi,r14
 11ee38f:	e8 ae 5c 94 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 11ee394:	84 c0                	test   al,al
 11ee396:	74 0c                	je     11ee3a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33928>
 11ee398:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 11ee39d:	e8 ee fa 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee3a2:	eb 36                	jmp    11ee3da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3395e>
 11ee3a4:	48 8d 35 bd d4 66 00 	lea    rsi,[rip+0x66d4bd]        # 185b868 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f50>
 11ee3ab:	48 89 e7             	mov    rdi,rsp
 11ee3ae:	e8 f7 39 5d 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 11ee3b3:	49 89 e7             	mov    r15,rsp
 11ee3b6:	4c 89 f7             	mov    rdi,r14
 11ee3b9:	4c 89 fe             	mov    rsi,r15
 11ee3bc:	e8 81 5c 94 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 11ee3c1:	89 c5                	mov    ebp,eax
 11ee3c3:	4c 89 ff             	mov    rdi,r15

### 0x11ee3a4: lea    rsi,[rip+0x66d4bd]        # 185b868 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f50> -> 0x185b868; FDE=(18801492, 18801685)
 11ee372:	48 8d 35 df d4 66 00 	lea    rsi,[rip+0x66d4df]        # 185b858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f40>
 11ee379:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 11ee37e:	e8 27 3a 5d 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 11ee383:	49 83 c6 08          	add    r14,0x8
 11ee387:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
 11ee38c:	4c 89 f7             	mov    rdi,r14
 11ee38f:	e8 ae 5c 94 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 11ee394:	84 c0                	test   al,al
 11ee396:	74 0c                	je     11ee3a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33928>
 11ee398:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 11ee39d:	e8 ee fa 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee3a2:	eb 36                	jmp    11ee3da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3395e>
 11ee3a4:	48 8d 35 bd d4 66 00 	lea    rsi,[rip+0x66d4bd]        # 185b868 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17f50>
 11ee3ab:	48 89 e7             	mov    rdi,rsp
 11ee3ae:	e8 f7 39 5d 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
 11ee3b3:	49 89 e7             	mov    r15,rsp
 11ee3b6:	4c 89 f7             	mov    rdi,r14
 11ee3b9:	4c 89 fe             	mov    rsi,r15
 11ee3bc:	e8 81 5c 94 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
 11ee3c1:	89 c5                	mov    ebp,eax
 11ee3c3:	4c 89 ff             	mov    rdi,r15
 11ee3c6:	e8 c5 fa 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee3cb:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 11ee3d0:	e8 bb fa 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 11ee3d5:	40 84 ed             	test   bpl,bpl
 11ee3d8:	74 13                	je     11ee3ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33971>
 11ee3da:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
 11ee3de:	e8 01 fd ff ff       	call   11ee0e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33668>
 11ee3e3:	48 89 df             	mov    rdi,rbx
 11ee3e6:	89 c6                	mov    esi,eax
 11ee3e8:	e8 29 00 00 00       	call   11ee416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3399a>
 11ee3ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11ee3f4:	00 00 

### 0x11eea80: lea    rax,[rip+0x66ce89]        # 185b910 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ff8> -> 0x185b910; FDE=(18802184, 18804775)
 11eea4f:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
 11eea56:	00 
 11eea57:	4c 89 e6             	mov    rsi,r12
 11eea5a:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11eea5d:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
 11eea64:	bf 10 02 00 00       	mov    edi,0x210
 11eea69:	e8 92 f4 5f 00       	call   17edf00 <_Znwm@plt>
 11eea6e:	49 89 c7             	mov    r15,rax
 11eea71:	48 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbp
 11eea78:	00 
 11eea79:	0f 57 c0             	xorps  xmm0,xmm0
 11eea7c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 11eea80:	48 8d 05 89 ce 66 00 	lea    rax,[rip+0x66ce89]        # 185b910 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ff8>
 11eea87:	49 89 07             	mov    QWORD PTR [r15],rax
 11eea8a:	4d 8d 67 18          	lea    r12,[r15+0x18]
 11eea8e:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 11eea95:	00 
 11eea96:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
 11eea9d:	00 
 11eea9e:	ba b0 00 00 00       	mov    edx,0xb0
 11eeaa3:	e8 28 10 60 00       	call   17efad0 <memcpy@plt>
 11eeaa8:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
 11eeaac:	4c 89 e7             	mov    rdi,r12
 11eeaaf:	e8 4e b3 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
 11eeab4:	4d 89 77 70          	mov    QWORD PTR [r15+0x70],r14
 11eeab8:	49 8d 7f 78          	lea    rdi,[r15+0x78]
 11eeabc:	48 8d b4 24 b0 02 00 	lea    rsi,[rsp+0x2b0]
 11eeac3:	00 
 11eeac4:	ba b0 00 00 00       	mov    edx,0xb0
 11eeac9:	e8 02 10 60 00       	call   17efad0 <memcpy@plt>
 11eeace:	49 89 9f 28 01 00 00 	mov    QWORD PTR [r15+0x128],rbx
 11eead5:	4d 8d b7 30 01 00 00 	lea    r14,[r15+0x130]
 11eeadc:	4d 89 b7 30 01 00 00 	mov    QWORD PTR [r15+0x130],r14

### 0x11ef054: lea    rax,[rip+0x66c8b5]        # 185b910 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ff8> -> 0x185b910; FDE=(18804820, 18804835)
 11ef029:	48 89 fb             	mov    rbx,rdi
 11ef02c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
 11ef030:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ef034:	ba 98 00 00 00       	mov    edx,0x98
 11ef039:	e8 a0 32 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ef03e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ef041:	48 8b 80 c0 04 00 00 	mov    rax,QWORD PTR [rax+0x4c0]
 11ef048:	48 85 c0             	test   rax,rax
 11ef04b:	74 02                	je     11ef04f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345d3>
 11ef04d:	5b                   	pop    rbx
 11ef04e:	c3                   	ret
 11ef04f:	e8 6b af 88 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
 11ef054:	48 8d 05 b5 c8 66 00 	lea    rax,[rip+0x66c8b5]        # 185b910 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ff8>
 11ef05b:	48 89 07             	mov    QWORD PTR [rdi],rax
 11ef05e:	e9 ad ef 5f 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 11ef063:	cc                   	int3
 11ef064:	53                   	push   rbx
 11ef065:	48 89 fb             	mov    rbx,rdi
 11ef068:	e8 e7 ff ff ff       	call   11ef054 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345d8>
 11ef06d:	48 89 df             	mov    rdi,rbx
 11ef070:	5b                   	pop    rbx
 11ef071:	e9 aa ee 5f 00       	jmp    17edf20 <_ZdlPv@plt>
 11ef076:	41 56                	push   r14
 11ef078:	53                   	push   rbx
 11ef079:	50                   	push   rax
 11ef07a:	48 89 fb             	mov    rbx,rdi
 11ef07d:	4c 8d 77 18          	lea    r14,[rdi+0x18]
 11ef081:	48 81 c7 00 02 00 00 	add    rdi,0x200
 11ef088:	e8 ef 00 98 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 11ef08d:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
 11ef094:	e8 37 00 00 00       	call   11ef0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34654>
 11ef099:	48 8d bb 98 01 00 00 	lea    rdi,[rbx+0x198]
 11ef0a0:	e8 4d 00 00 00       	call   11ef0f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34676>

### 0x11ef37a: lea    rax,[rip+0x66c5c7]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030> -> 0x185b948; FDE=(18805556, 18832116)
 11ef34c:	00 
 11ef34d:	4c 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r8
 11ef354:	00 
 11ef355:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
 11ef35a:	48 89 94 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rdx
 11ef361:	00 
 11ef362:	48 89 fb             	mov    rbx,rdi
 11ef365:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11ef36c:	00 00 
 11ef36e:	48 89 84 24 00 06 00 	mov    QWORD PTR [rsp+0x600],rax
 11ef375:	00 
 11ef376:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
 11ef37a:	48 8d 05 c7 c5 66 00 	lea    rax,[rip+0x66c5c7]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>
 11ef381:	48 89 07             	mov    QWORD PTR [rdi],rax
 11ef384:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 11ef389:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
 11ef390:	00 
 11ef391:	48 8d 05 48 8a 7e ff 	lea    rax,[rip+0xffffffffff7e8a48]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
 11ef398:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
 11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
 11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
 11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
 11ef3bd:	00 
 11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
 11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
 11ef3c7:	48 8b 86 fc 00 00 00 	mov    rax,QWORD PTR [rsi+0xfc]
 11ef3ce:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
 11ef3d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11ef3d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11ef3d8:	48 8b 08             	mov    rcx,QWORD PTR [rax]

### 0x11f3b7f: lea    rcx,[rip+0x667e4a]        # 185b9d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x180b8> -> 0x185b9d0; FDE=(18805556, 18832116)
 11f3b4b:	e8 8a 71 03 00       	call   122acda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7025e>
 11f3b50:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
 11f3b57:	00 
 11f3b58:	e8 0d 64 88 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 11f3b5d:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f3b62:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3b65:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
 11f3b6c:	00 
 11f3b6d:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3b70:	48 8d 93 f0 22 00 00 	lea    rdx,[rbx+0x22f0]
 11f3b77:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
 11f3b7e:	00 
 11f3b7f:	48 8d 0d 4a 7e 66 00 	lea    rcx,[rip+0x667e4a]        # 185b9d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x180b8>
 11f3b86:	48 89 8b f0 29 00 00 	mov    QWORD PTR [rbx+0x29f0],rcx
 11f3b8d:	48 89 54 24 38       	mov    QWORD PTR [rsp+0x38],rdx
 11f3b92:	48 89 93 f8 29 00 00 	mov    QWORD PTR [rbx+0x29f8],rdx
 11f3b99:	48 89 83 00 2a 00 00 	mov    QWORD PTR [rbx+0x2a00],rax
 11f3ba0:	48 8b bc 24 c8 05 00 	mov    rdi,QWORD PTR [rsp+0x5c8]
 11f3ba7:	00 
 11f3ba8:	e8 d9 a8 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f3bad:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
 11f3bb2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3bb5:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f3bbc:	00 
 11f3bbd:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11f3bc0:	4c 8b b4 24 50 05 00 	mov    r14,QWORD PTR [rsp+0x550]
 11f3bc7:	00 
 11f3bc8:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
 11f3bcf:	00 
 11f3bd0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 11f3bd3:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
 11f3bda:	00 
 11f3bdb:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]

### 0x11f8830: lea    rax,[rip+0x6631c1]        # 185b9f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x180e0> -> 0x185b9f8; FDE=(18843616, 18844137)
 11f87ff:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
 11f8803:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11f880a:	00 00 
 11f880c:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
 11f8813:	00 
 11f8814:	4c 8b 7e 08          	mov    r15,QWORD PTR [rsi+0x8]
 11f8818:	48 8b 5e 10          	mov    rbx,QWORD PTR [rsi+0x10]
 11f881c:	bf c8 07 00 00       	mov    edi,0x7c8
 11f8821:	e8 da 56 5f 00       	call   17edf00 <_Znwm@plt>
 11f8826:	49 89 c6             	mov    r14,rax
 11f8829:	0f 57 c0             	xorps  xmm0,xmm0
 11f882c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 11f8830:	48 8d 05 c1 31 66 00 	lea    rax,[rip+0x6631c1]        # 185b9f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x180e0>
 11f8837:	49 89 06             	mov    QWORD PTR [r14],rax
 11f883a:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
 11f883e:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
 11f8842:	48 85 c0             	test   rax,rax
 11f8845:	74 05                	je     11f884c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ddd0>
 11f8847:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 11f884c:	41 0f 10 4d 00       	movups xmm1,XMMWORD PTR [r13+0x0]
 11f8851:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
 11f8855:	48 85 c0             	test   rax,rax
 11f8858:	74 05                	je     11f885f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dde3>
 11f885a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 11f885f:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
 11f8866:	00 
 11f8867:	8a 84 24 c0 00 00 00 	mov    al,BYTE PTR [rsp+0xc0]
 11f886e:	41 0f 10 14 24       	movups xmm2,XMMWORD PTR [r12]
 11f8873:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
 11f8878:	48 85 d2             	test   rdx,rdx
 11f887b:	74 05                	je     11f8882 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3de06>
 11f887d:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
 11f8882:	0f 10 19             	movups xmm3,XMMWORD PTR [rcx]

### 0x11f89ea: lea    rax,[rip+0x663007]        # 185b9f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x180e0> -> 0x185b9f8; FDE=(18844138, 18844153)
 11f89cf:	5b                   	pop    rbx
 11f89d0:	41 5c                	pop    r12
 11f89d2:	41 5d                	pop    r13
 11f89d4:	41 5e                	pop    r14
 11f89d6:	41 5f                	pop    r15
 11f89d8:	5d                   	pop    rbp
 11f89d9:	c3                   	ret
 11f89da:	e8 d1 70 5f 00       	call   17efab0 <__stack_chk_fail@plt>
 11f89df:	eb 00                	jmp    11f89e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3df65>
 11f89e1:	48 89 c7             	mov    rdi,rax
 11f89e4:	e8 bc 10 88 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 11f89e9:	cc                   	int3
 11f89ea:	48 8d 05 07 30 66 00 	lea    rax,[rip+0x663007]        # 185b9f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x180e0>
 11f89f1:	48 89 07             	mov    QWORD PTR [rdi],rax
 11f89f4:	e9 17 56 5f 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 11f89f9:	cc                   	int3
 11f89fa:	53                   	push   rbx
 11f89fb:	48 89 fb             	mov    rbx,rdi
 11f89fe:	e8 e7 ff ff ff       	call   11f89ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3df6e>
 11f8a03:	48 89 df             	mov    rdi,rbx
 11f8a06:	5b                   	pop    rbx
 11f8a07:	e9 14 55 5f 00       	jmp    17edf20 <_ZdlPv@plt>
 11f8a0c:	48 83 c7 18          	add    rdi,0x18
 11f8a10:	e9 01 00 00 00       	jmp    11f8a16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3df9a>
 11f8a15:	cc                   	int3
 11f8a16:	53                   	push   rbx
 11f8a17:	48 89 fb             	mov    rbx,rdi
 11f8a1a:	48 81 c7 a0 07 00 00 	add    rdi,0x7a0
 11f8a21:	e8 56 67 97 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
 11f8a26:	48 8b bb 98 07 00 00 	mov    rdi,QWORD PTR [rbx+0x798]
 11f8a2d:	e8 54 5a 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f8a32:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
 11f8a39:	e8 46 00 00 00       	call   11f8a84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e008>

### 0x11f938c: lea    rax,[rip+0x6625b5]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030> -> 0x185b948; FDE=(18846596, 18847792)
 11f9372:	c3                   	ret
 11f9373:	cc                   	int3
 11f9374:	50                   	push   rax
 11f9375:	e8 04 a9 28 00       	call   1483c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9202>
 11f937a:	59                   	pop    rcx
 11f937b:	c3                   	ret
 11f937c:	48 89 c7             	mov    rdi,rax
 11f937f:	e8 21 07 88 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 11f9384:	41 57                	push   r15
 11f9386:	41 56                	push   r14
 11f9388:	53                   	push   rbx
 11f9389:	48 89 fb             	mov    rbx,rdi
 11f938c:	48 8d 05 b5 25 66 00 	lea    rax,[rip+0x6625b5]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>
 11f9393:	48 89 07             	mov    QWORD PTR [rdi],rax
 11f9396:	48 8b bf b8 5d 00 00 	mov    rdi,QWORD PTR [rdi+0x5db8]
 11f939d:	e8 e4 50 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f93a2:	48 8d bb a0 5d 00 00 	lea    rdi,[rbx+0x5da0]
 11f93a9:	e8 26 08 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 11f93ae:	48 8d bb 90 5d 00 00 	lea    rdi,[rbx+0x5d90]
 11f93b5:	e8 1a 08 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 11f93ba:	48 8b bb 80 5d 00 00 	mov    rdi,QWORD PTR [rbx+0x5d80]
 11f93c1:	e8 c0 50 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f93c6:	48 8d bb 10 5d 00 00 	lea    rdi,[rbx+0x5d10]
 11f93cd:	e8 02 08 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 11f93d2:	48 8d bb e0 5c 00 00 	lea    rdi,[rbx+0x5ce0]
 11f93d9:	e8 8c 0b 88 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 11f93de:	48 8d bb 28 4d 00 00 	lea    rdi,[rbx+0x4d28]
 11f93e5:	e8 76 09 00 00       	call   11f9d60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2e4>
 11f93ea:	48 8d bb 98 4c 00 00 	lea    rdi,[rbx+0x4c98]
 11f93f1:	e8 78 09 00 00       	call   11f9d6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f2f2>
 11f93f6:	48 8d bb 80 4c 00 00 	lea    rdi,[rbx+0x4c80]
 11f93fd:	e8 44 83 5c 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
 11f9402:	48 8d bb 60 4c 00 00 	lea    rdi,[rbx+0x4c60]

- refs_shown=14

## Candidate vtable RTTI
### address point 0x18228d8
- [ap-0x10] offset-to-top raw=0xd16e18
- [ap-0x8] typeinfo=0xd16f88
- typeinfo[0] vptr=0x5741cc0000c98be9
- typeinfo[+8] nameptr=0x4950ec8348535641
- raw type name: None
- typeinfo[+0x10]=0x8b4864fb8948f689
- first slots:
  - +0x0: 0xd16f8e FDE=(13725582, 13725690)
  - +0x8: 0xd16ffa FDE=(13725690, 13725798)
  - +0x10: 0xd17066 FDE=(13725798, 13725906)
  - +0x18: 0xd170d2 FDE=(13725906, 13725963)
  - +0x20: 0xd1710c FDE=(13725964, 13726226)
  - +0x28: 0xd17212 FDE=(13726226, 13726234)
  - +0x30: 0xd1721a FDE=(13726234, 13726305)
  - +0x38: 0xd17262 FDE=(13726306, 13726538)
  - +0x40: 0xd1734a FDE=(13726538, 13726914)
  - +0x48: 0xd174c2 FDE=(13726914, 13728354)
  - +0x50: 0xd17a62 FDE=(13728354, 13728679)
  - +0x58: 0xd17ba8 FDE=(13728680, 13728929)
  - +0x60: 0xd17ca2 FDE=(13728930, 13729091)
  - +0x68: 0xcc23d0 FDE=(13378512, 13378620)
  - +0x70: 0xd17d44 FDE=(13729092, 13729200)
  - +0x78: 0xd17db0 FDE=(13729200, 13729308)
  - +0x80: 0xd17e1c FDE=(13729308, 13729766)
  - +0x88: 0xd17fe6 FDE=(13729766, 13730106)
  - +0x90: 0xd1813a FDE=(13730106, 13730882)
  - +0x98: 0xd18442 FDE=(13730882, 13730995)
  - +0xa0: 0xd184b4 FDE=(13730996, 13731858)
  - +0xa8: 0xd15094 FDE=(13717652, 13720368)
  - +0xb0: 0xd18812 FDE=(13731858, 13738390)
  - +0xb8: 0xd1a196 FDE=(13738390, 13738411)
  - +0xc0: 0xd1a1ac FDE=(13738412, 13738433)
  - +0xc8: 0xd1a1c2 FDE=(13738434, 13738677)

### address point 0x1821448
- [ap-0x10] offset-to-top raw=0x0
- [ap-0x8] typeinfo=0xcf9320
- typeinfo[0] vptr=0x387f8b48fb894853
- typeinfo[+8] nameptr=0xff078b4840738d48
- raw type name: None
- typeinfo[+0x10]=0x110bb8b485850
- first slots:
  - +0x0: 0xcf938a FDE=(13603722, 13603740)
  - +0x8: 0xcf939c FDE=(13603740, 13604278)
  - +0x10: 0xcf95b6 FDE=(13604278, 13604286)
  - +0x18: 0xbd7a10 FDE=(12417552, 12417566)
  - +0x20: 0xcf95be FDE=(13604286, 13608751)
  - +0x28: 0xb7d2ca FDE=(12047050, 12047060)
  - +0x30: 0xbd7f6a FDE=(12418922, 12418932)
  - +0x38: 0xcfa730 FDE=(13608752, 13608949)
  - +0x40: 0xbd7fd2 FDE=(12419026, 12419036)
  - +0x48: 0xbd7fdc FDE=(12419036, 12419049)
  - +0x50: 0xbd7fea FDE=(12419050, 12419063)
  - +0x58: 0xbd7ff8 FDE=(12419064, 12419083)
  - +0x60: 0xbd800c FDE=(12419084, 12419094)
  - +0x68: 0x123a2d8 FDE=(19112664, 19112674)
  - +0x70: 0xbd8086 FDE=(12419206, 12419216)
  - +0x78: 0x13a6e50 FDE=(20606544, 20606560)
  - +0x80: 0xab5b36 FDE=(11230006, 11230022)
  - +0x88: 0xab5b46 FDE=(11230022, 11230038)
  - +0x90: 0xbd80cc FDE=(12419276, 12419292)
  - +0x98: 0xbd80dc FDE=(12419292, 12419305)
  - +0xa0: 0xcfa7f6 FDE=(13608950, 13608981)
  - +0xa8: 0xbd8104 FDE=(12419332, 12419345)
  - +0xb0: 0xbd8112 FDE=(12419346, 12419359)
  - +0xb8: 0xbd8120 FDE=(12419360, 12419382)
  - +0xc0: 0x9d81d0 FDE=(10322384, 10322387)
  - +0xc8: 0x9d81d0 FDE=(10322384, 10322387)

### address point 0x1822988
- [ap-0x10] offset-to-top raw=0xd184b4
- [ap-0x8] typeinfo=0xd15094
- typeinfo[0] vptr=0x4155415641574155
- typeinfo[+8] nameptr=0x288ec81485354
- raw type name: None
- typeinfo[+0x10]=0x48b4864fb894800
- first slots:
  - +0x0: 0xd18812 FDE=(13731858, 13738390)
  - +0x8: 0xd1a196 FDE=(13738390, 13738411)
  - +0x10: 0xd1a1ac FDE=(13738412, 13738433)
  - +0x18: 0xd1a1c2 FDE=(13738434, 13738677)
  - +0x20: 0xd1a2b6 FDE=(13738678, 13739072)
  - +0x28: 0xd1a440 FDE=(13739072, 13739108)
  - +0x30: 0xaf6576 FDE=(11494774, 11494779)
  - +0x38: 0xd1a464 FDE=(13739108, 13741320)
  - +0x40: 0xd1ad08 FDE=(13741320, 13741342)
  - +0x48: 0xd1ad1e FDE=(13741342, 13743096)
  - +0x50: 0xd1b3f8 FDE=(13743096, 13743334)
  - +0x58: 0xd1b4e6 FDE=(13743334, 13743493)
  - +0x60: 0xd1b586 FDE=(13743494, 13743689)
  - +0x68: 0xd1b64a FDE=(13743690, 13743867)
  - +0x70: 0xd1b6fc FDE=(13743868, 13744048)
  - +0x78: 0xb00674 FDE=(11535988, 11535993)
  - +0x80: 0xd1b7b0 FDE=(13744048, 13744056)
  - +0x88: 0xd1b7b8 FDE=(13744056, 13744064)
  - +0x90: 0xc44ec4 FDE=(12865220, 12865228)
  - +0x98: 0xd1b7c0 FDE=(13744064, 13744072)
  - +0xa0: 0xd1b7c8 FDE=(13744072, 13744202)
  - +0xa8: 0xfffffffffffffff8 FDE=None
  - +0xb0: 0x0 FDE=None
  - +0xb8: 0xd1b84a FDE=(13744202, 13744211)
  - +0xc0: 0xd1b854 FDE=(13744212, 13744221)
  - +0xc8: 0xd1b85e FDE=(13744222, 13744231)

### address point 0x181f788
- [ap-0x10] offset-to-top raw=0xcc4ad6
- [ap-0x8] typeinfo=0xcc4afc
- typeinfo[0] vptr=0x168ec8148535641
- typeinfo[+8] nameptr=0x8b4864fb89480000
- raw type name: None
- typeinfo[+0x10]=0x8948000000282504
- first slots:
  - +0x0: 0xcc4b7a FDE=(13388666, 13388809)
  - +0x8: 0xcc4c0a FDE=(13388810, 13388818)
  - +0x10: 0xcc4c12 FDE=(13388818, 13389388)
  - +0x18: 0xcc4e4c FDE=(13389388, 13389497)
  - +0x20: 0xcc4eba FDE=(13389498, 13389546)
  - +0x28: 0xcc4eea FDE=(13389546, 13389554)
  - +0x30: 0xcc4eea FDE=(13389546, 13389554)
  - +0x38: 0xcc4ef2 FDE=(13389554, 13389787)
  - +0x40: 0xcc4fdc FDE=(13389788, 13390625)
  - +0x48: 0xcc5322 FDE=(13390626, 13391260)
  - +0x50: 0xcc559c FDE=(13391260, 13391392)
  - +0x58: 0xcc5620 FDE=(13391392, 13391512)
  - +0x60: 0xcc5698 FDE=(13391512, 13391537)
  - +0x68: 0xcc56b2 FDE=(13391538, 13391567)
  - +0x70: 0xcc56d0 FDE=(13391568, 13391597)
  - +0x78: 0xcc56ee FDE=(13391598, 13391906)
  - +0x80: 0xcc5822 FDE=(13391906, 13391918)
  - +0x88: 0x0 FDE=None
  - +0x90: 0x0 FDE=None
  - +0x98: 0x9d7de0 FDE=(10321376, 10321377)
  - +0xa0: 0xa50370 FDE=(10814320, 10814325)
  - +0xa8: 0xcc9472 FDE=(13407346, 13407378)
  - +0xb0: 0xcc9492 FDE=(13407378, 13407397)
  - +0xb8: 0x9d7de0 FDE=(10321376, 10321377)
  - +0xc0: 0xa50370 FDE=(10814320, 10814325)
  - +0xc8: 0xcc94a6 FDE=(13407398, 13407417)

### address point 0x1870480
- [ap-0x10] offset-to-top raw=0x1425c30
- [ap-0x8] typeinfo=0x11666f2
- typeinfo[0] vptr=0xff078b48407f8b48
- typeinfo[+8] nameptr=0x8b48fb8948534860
- raw type name: None
- typeinfo[+0x10]=0x5050ff068b484076
- first slots:
  - +0x0: 0x1425c7a FDE=(21126266, 21126276)
  - +0x8: 0x116671e FDE=(18245406, 18245419)
  - +0x10: 0x1425c84 FDE=(21126276, 21126286)
  - +0x18: 0x1425c8e FDE=(21126286, 21126299)
  - +0x20: 0x1425c9c FDE=(21126300, 21126313)
  - +0x28: 0x1425caa FDE=(21126314, 21126324)
  - +0x30: 0x1425cb4 FDE=(21126324, 21126337)
  - +0x38: 0xadd7ba FDE=(11392954, 11392979)
  - +0x40: 0x1425cc2 FDE=(21126338, 21126351)
  - +0x48: 0x1425cd0 FDE=(21126352, 21126365)
  - +0x50: 0x1425cde FDE=(21126366, 21126379)
  - +0x58: 0x1425cec FDE=(21126380, 21126402)
  - +0x60: 0x1425d02 FDE=(21126402, 21126415)
  - +0x68: 0x1425d10 FDE=(21126416, 21126429)
  - +0x70: 0xabd11a FDE=(11260186, 11260199)
  - +0x78: 0xabd128 FDE=(11260200, 11260213)
  - +0x80: 0x1425d1e FDE=(21126430, 21127215)
  - +0x88: 0x1426030 FDE=(21127216, 21127402)
  - +0x90: 0x14260ea FDE=(21127402, 21127584)
  - +0x98: 0x14261a0 FDE=(21127584, 21127755)
  - +0xa0: 0x142624c FDE=(21127756, 21127966)
  - +0xa8: 0x142631e FDE=(21127966, 21128146)
  - +0xb0: 0x14263d2 FDE=(21128146, 21128307)
  - +0xb8: 0xfffffffffffffff8 FDE=None
  - +0xc0: 0x0 FDE=None
  - +0xc8: 0x1426474 FDE=(21128308, 21128317)

### address point 0x187b208
- [ap-0x10] offset-to-top raw=0xbd7ff8
- [ap-0x8] typeinfo=0x150dbf0
- typeinfo[0] vptr=0x707f8b48fb894853
- typeinfo[+8] nameptr=0xc0852850ff078b48
- raw type name: None
- typeinfo[+0x10]=0x8b48087b8b480a75
- first slots:
  - +0x0: 0x150dc0e FDE=(22076430, 22076471)
  - +0x8: 0xbd8086 FDE=(12419206, 12419216)
  - +0x10: 0x13a6e50 FDE=(20606544, 20606560)
  - +0x18: 0xab5b36 FDE=(11230006, 11230022)
  - +0x20: 0xab5b46 FDE=(11230022, 11230038)
  - +0x28: 0xbd80cc FDE=(12419276, 12419292)
  - +0x30: 0xbd80dc FDE=(12419292, 12419305)
  - +0x38: 0xaf657c FDE=(11494780, 11494805)
  - +0x40: 0xbd8104 FDE=(12419332, 12419345)
  - +0x48: 0xbd8112 FDE=(12419346, 12419359)
  - +0x50: 0xbd8120 FDE=(12419360, 12419382)
  - +0x58: 0x9d81d0 FDE=(10322384, 10322387)
  - +0x60: 0x9d81d0 FDE=(10322384, 10322387)
  - +0x68: 0xa5bbf0 FDE=(10861552, 10861557)
  - +0x70: 0xbd8136 FDE=(12419382, 12419404)
  - +0x78: 0x0 FDE=None
  - +0x80: 0x0 FDE=None
  - +0x88: 0xaad9d2 FDE=(11196882, 11196908)
  - +0x90: 0x150e1c2 FDE=(22077890, 22077908)
  - +0x98: 0x150e1d4 FDE=(22077908, 22078051)
  - +0xa0: 0xb7d29e FDE=(12047006, 12047016)
  - +0xa8: 0xbd7a10 FDE=(12417552, 12417566)
  - +0xb0: 0x150e264 FDE=(22078052, 22078401)
  - +0xb8: 0xb7d2ca FDE=(12047050, 12047060)
  - +0xc0: 0xbd7f6a FDE=(12418922, 12418932)
  - +0xc8: 0x150e3c2 FDE=(22078402, 22078542)

### address point 0x188a7f0
- [ap-0x10] offset-to-top raw=0x15ec59a
- [ap-0x8] typeinfo=0x15ec8ac
- typeinfo[0] vptr=0x4155415641574155
- typeinfo[+8] nameptr=0x486448ec83485354
- raw type name: None
- typeinfo[+0x10]=0x480000002825048b
- first slots:
  - +0x0: 0x15ecb96 FDE=(22989718, 22989730)
  - +0x8: 0x15ecba2 FDE=(22989730, 22989750)
  - +0x10: 0x15ecbb6 FDE=(22989750, 22990352)
  - +0x18: 0x15ece10 FDE=(22990352, 22991095)
  - +0x20: 0x15ed0f8 FDE=(22991096, 22991698)
  - +0x28: 0x15ed352 FDE=(22991698, 22992441)
  - +0x30: 0x15ed63a FDE=(22992442, 22992454)
  - +0x38: 0x15ed646 FDE=(22992454, 22992702)
  - +0x40: 0x15ed73e FDE=(22992702, 22992830)
  - +0x48: 0x15ed7be FDE=(22992830, 22992842)
  - +0x50: 0x15ed7ca FDE=(22992842, 22992854)
  - +0x58: 0x15ed7d6 FDE=(22992854, 22993102)
  - +0x60: 0x15ed8ce FDE=(22993102, 22993114)
  - +0x68: 0x15ed8da FDE=(22993114, 22993362)
  - +0x70: 0x15ed9d2 FDE=(22993362, 22993382)
  - +0x78: 0x14248f0 FDE=(21121264, 21121269)
  - +0x80: 0x15ed9e6 FDE=(22993382, 22993386)
  - +0x88: 0x15ed9ea FDE=(22993386, 22993393)
  - +0x90: 0x15ed9f2 FDE=(22993394, 22993402)
  - +0x98: 0x15ed9fa FDE=(22993402, 22993410)
  - +0xa0: 0x15eda02 FDE=(22993410, 22993418)
  - +0xa8: 0x15eda0a FDE=(22993418, 22993427)
  - +0xb0: 0x15eda14 FDE=(22993428, 22993459)
  - +0xb8: 0x15eda34 FDE=(22993460, 22993468)
  - +0xc0: 0x15eda3c FDE=(22993468, 22993476)
  - +0xc8: 0x15eda44 FDE=(22993476, 22993484)

## Code materializations of candidate address points
### 0x18228d8: refs=0
### 0x1821448: refs=0
### 0x1822988: refs=0
### 0x181f788: refs=0
### 0x1870480: refs=0
### 0x187b208: refs=0
### 0x188a7f0: refs=0
