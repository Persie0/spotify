# Real service184 table population trace

Ground truth: b8f02e receives facade F; F+0 is serviceTable*, F+8 ID buffer, F+0x10 ID count; returns serviceTable[0xb8].

## Relocations pointing exactly to 0x11ee608
- slot 0x185b8f8
  candidate table base 0x185b878, target offset +0x80, codeSlots=20
  candidate table base 0x185b880, target offset +0x78, codeSlots=21
  candidate table base 0x185b888, target offset +0x70, codeSlots=22
  candidate table base 0x185b890, target offset +0x68, codeSlots=22
  candidate table base 0x185b898, target offset +0x60, codeSlots=22
  candidate table base 0x185b8a0, target offset +0x58, codeSlots=22
  candidate table base 0x185b8a8, target offset +0x50, codeSlots=22
  candidate table base 0x185b8b0, target offset +0x48, codeSlots=22
  candidate table base 0x185b8b8, target offset +0x40, codeSlots=22
  candidate table base 0x185b8c0, target offset +0x38, codeSlots=22
  candidate table base 0x185b8c8, target offset +0x30, codeSlots=22
  candidate table base 0x185b8d0, target offset +0x28, codeSlots=22
  candidate table base 0x185b8d8, target offset +0x20, codeSlots=22
  candidate table base 0x185b8e0, target offset +0x18, codeSlots=22
  candidate table base 0x185b8e8, target offset +0x10, codeSlots=22
  candidate table base 0x185b8f0, target offset +0x8, codeSlots=21
  candidate table base 0x185b8f8, target offset +0x0, codeSlots=20

## Materializations of candidate callback tables
### 0xb60b11 -> 0x185b828; FDE=(11925239, 11936142)
      b60ad9:	5f                   	pop    rdi
      b60ada:	e8 21 d4 c8 00       	call   17edf00 <_Znwm@plt>
      b60adf:	48 8d 0d 4a 74 ce 00 	lea    rcx,[rip+0xce744a]        # 1847f30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4618>
      b60ae6:	48 89 08             	mov    QWORD PTR [rax],rcx
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
      b60b62:	48 85 ff             	test   rdi,rdi
      b60b65:	74 06                	je     b60b6d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadb0d>
      b60b67:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60b6a:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60b6d:	6a 08                	push   0x8
      b60b6f:	5f                   	pop    rdi

### 0xb6162f -> 0x185b8d0; FDE=(11925239, 11936142)
      b615f8:	48 8d 0d 31 09 d1 00 	lea    rcx,[rip+0xd10931]        # 1871f30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e618>
      b615ff:	48 89 08             	mov    QWORD PTR [rax],rcx
      b61602:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b61607:	48 89 06             	mov    QWORD PTR [rsi],rax
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
      b61680:	48 85 ff             	test   rdi,rdi
      b61683:	74 06                	je     b6168b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xae62b>
      b61685:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b61688:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b6168b:	6a 08                	push   0x8
      b6168d:	5f                   	pop    rdi

### 0x11edfcc -> 0x185b888; FDE=(18800498, 18800841)
     11edf8a:	00 00 
     11edf8c:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11edf91:	4c 8b aa 80 00 00 00 	mov    r13,QWORD PTR [rdx+0x80]
     11edf98:	4c 8b 3a             	mov    r15,QWORD PTR [rdx]
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
     11ee024:	4c 89 ef             	mov    rdi,r13
     11ee027:	31 d2                	xor    edx,edx
     11ee029:	e8 66 c7 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11ee02e:	49 8d 6f 38          	lea    rbp,[r15+0x38]
     11ee032:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     11ee036:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### 0x11ee0fe -> 0x185b858; FDE=(18800868, 18801155)
     11ee0ca:	53                   	push   rbx
     11ee0cb:	48 89 fb             	mov    rbx,rdi
     11ee0ce:	48 83 c7 48          	add    rdi,0x48
     11ee0d2:	e8 8f bd 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
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
     11ee165:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11ee16a:	e8 0f b9 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ee16f:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     11ee172:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11ee177:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
     11ee17c:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]

### 0x11ee14d -> 0x185b868; FDE=(18800868, 18801155)
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
     11ee1ab:	75 19                	jne    11ee1c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3374a>
     11ee1ad:	48 8d 35 c9 3d 26 ff 	lea    rsi,[rip+0xffffffffff263dc9]        # 451f7d <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b89>
     11ee1b4:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11ee1b9:	e8 91 d6 88 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     11ee1be:	0f b6 c0             	movzx  eax,al
     11ee1c1:	6a 04                	push   0x4

### 0x11ee372 -> 0x185b858; FDE=(18801492, 18801685)
     11ee344:	c3                   	ret
     11ee345:	cc                   	int3
     11ee346:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     11ee349:	e9 06 00 00 00       	jmp    11ee354 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338d8>
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
     11ee3c6:	e8 c5 fa 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11ee3cb:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11ee3d0:	e8 bb fa 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11ee3d5:	40 84 ed             	test   bpl,bpl
     11ee3d8:	74 13                	je     11ee3ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33971>
     11ee3da:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]

### 0x11ee3a4 -> 0x185b868; FDE=(18801492, 18801685)
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
     11ee3f6:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     11ee3fb:	75 0b                	jne    11ee408 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3398c>
     11ee3fd:	48 83 c4 38          	add    rsp,0x38
     11ee401:	5b                   	pop    rbx
     11ee402:	41 5e                	pop    r14
     11ee404:	41 5f                	pop    r15

### 0x11eea80 -> 0x185b910; FDE=(18802184, 18804775)
     11eea42:	4c 89 e7             	mov    rdi,r12
     11eea45:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11eea48:	49 89 c6             	mov    r14,rax
     11eea4b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
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
     11eeae3:	4d 89 b7 38 01 00 00 	mov    QWORD PTR [r15+0x138],r14
     11eeaea:	0f 57 c0             	xorps  xmm0,xmm0
     11eeaed:	41 0f 11 87 40 01 00 	movups XMMWORD PTR [r15+0x140],xmm0
     11eeaf4:	00 
     11eeaf5:	41 0f 11 87 50 01 00 	movups XMMWORD PTR [r15+0x150],xmm0
     11eeafc:	00 

### 0x11ef054 -> 0x185b910; FDE=(18804820, 18804835)
     11ef01d:	e8 ae 0c 88 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11ef022:	e8 89 0a 60 00       	call   17efab0 <__stack_chk_fail@plt>
     11ef027:	cc                   	int3
     11ef028:	53                   	push   rbx
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
     11ef0a5:	48 8d bb 88 01 00 00 	lea    rdi,[rbx+0x188]
     11ef0ac:	e8 95 26 5d 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     11ef0b1:	48 81 c3 30 01 00 00 	add    rbx,0x130
     11ef0b8:	48 89 df             	mov    rdi,rbx
     11ef0bb:	e8 4c 00 00 00       	call   11ef10c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34690>
     11ef0c0:	4c 89 f7             	mov    rdi,r14

### 0x11ef37a -> 0x185b948; FDE=(18805556, 18832116)
     11ef33b:	41 54                	push   r12
     11ef33d:	53                   	push   rbx
     11ef33e:	48 81 ec 08 06 00 00 	sub    rsp,0x608
     11ef345:	4c 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r9
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
     11ef3db:	48 89 c7             	mov    rdi,rax
     11ef3de:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11ef3e1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ef3e6:	48 83 a4 24 c0 04 00 	and    QWORD PTR [rsp+0x4c0],0x0
     11ef3ed:	00 00 
     11ef3ef:	48 8d 05 ea 89 7e ff 	lea    rax,[rip+0xffffffffff7e89ea]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>

### 0x11f938c -> 0x185b948; FDE=(18846596, 18847792)
     11f9366:	c3                   	ret
     11f9367:	cc                   	int3
     11f9368:	48 8d 05 59 27 66 00 	lea    rax,[rip+0x662759]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
     11f936f:	48 89 06             	mov    QWORD PTR [rsi],rax
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
     11f9409:	e8 ec d6 ff ff       	call   11f6afa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c07e>
     11f940e:	48 8b bb 48 4c 00 00 	mov    rdi,QWORD PTR [rbx+0x4c48]
     11f9415:	48 85 ff             	test   rdi,rdi
     11f9418:	74 05                	je     11f941f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e9a3>
     11f941a:	e8 71 50 8a ff       	call   a9e490 <JNI_OnUnload@@Base+0x25d5d>
     11f941f:	48 8d bb 20 4c 00 00 	lea    rdi,[rbx+0x4c20]

## Proven-looking writes to facade serviceTable[184]
## Alias-aware table[184] stores
### 0xab3d5a FDE=(11222304, 11222444); origin facadeCandidate=r14 @0xab3d4f; aliases=['rax']
      ab3d4f:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ab3d5a:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      ab3d2c:	74 6b                	je     ab3d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd39>
      ab3d2e:	49 89 ff             	mov    r15,rdi
      ab3d31:	48 83 7f 08 00       	cmp    QWORD PTR [rdi+0x8],0x0
      ab3d36:	74 61                	je     ab3d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd39>
      ab3d38:	48 89 d3             	mov    rbx,rdx
      ab3d3b:	49 89 f6             	mov    r14,rsi
      ab3d3e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ab3d41:	48 89 f7             	mov    rdi,rsi
      ab3d44:	48 89 d6             	mov    rsi,rdx
      ab3d47:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      ab3d4d:	89 c5                	mov    ebp,eax
      ab3d4f:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ab3d52:	4c 89 f7             	mov    rdi,r14
      ab3d55:	48 89 de             	mov    rsi,rbx
      ab3d58:	31 d2                	xor    edx,edx
      ab3d5a:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      ab3d60:	48 85 c0             	test   rax,rax
      ab3d63:	74 32                	je     ab3d97 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd37>
      ab3d65:	83 fd 10             	cmp    ebp,0x10
      ab3d68:	75 0f                	jne    ab3d79 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd19>
      ab3d6a:	49 8b 4f 08          	mov    rcx,QWORD PTR [r15+0x8]
      ab3d6e:	83 61 04 00          	and    DWORD PTR [rcx+0x4],0x0
      ab3d72:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
      ab3d75:	0f 11 41 18          	movups XMMWORD PTR [rcx+0x18],xmm0
      ab3d79:	4d 8b 06             	mov    r8,QWORD PTR [r14]
      ab3d7c:	6a 02                	push   0x2
      ab3d7e:	59                   	pop    rcx
      ab3d7f:	4c 89 f7             	mov    rdi,r14
      ab3d82:	48 89 de             	mov    rsi,rbx
      ab3d85:	48 89 c2             	mov    rdx,rax
      ab3d88:	41 ff 90 00 06 00 00 	call   QWORD PTR [r8+0x600]
      ab3d8f:	83 fd 10             	cmp    ebp,0x10
      ab3d92:	0f 94 c0             	sete   al
      ab3d95:	eb 02                	jmp    ab3d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd39>
      ab3d97:	31 c0                	xor    eax,eax
      ab3d99:	48 83 c4 08          	add    rsp,0x8

### 0xabdcab FDE=(11263075, 11263269); origin facadeCandidate=r15 @0xabdca0; aliases=['rax']
      abdca0:	49 8b 07             	mov    rax,QWORD PTR [r15]
      abdcab:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      abdc7d:	48 85 d2             	test   rdx,rdx
      abdc80:	74 79                	je     abdcfb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac9b>
      abdc82:	44 89 c5             	mov    ebp,r8d
      abdc85:	49 89 ce             	mov    r14,rcx
      abdc88:	48 89 d3             	mov    rbx,rdx
      abdc8b:	49 89 ff             	mov    r15,rdi
      abdc8e:	48 89 d7             	mov    rdi,rdx
      abdc91:	e8 5a 04 d3 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
      abdc96:	48 83 bb 80 00 00 00 	cmp    QWORD PTR [rbx+0x80],0x0
      abdc9d:	00 
      abdc9e:	74 53                	je     abdcf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac93>
      abdca0:	49 8b 07             	mov    rax,QWORD PTR [r15]
      abdca3:	4c 89 ff             	mov    rdi,r15
      abdca6:	4c 89 f6             	mov    rsi,r14
      abdca9:	31 d2                	xor    edx,edx
      abdcab:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      abdcb1:	49 89 c4             	mov    r12,rax
      abdcb4:	48 85 c0             	test   rax,rax
      abdcb7:	74 3a                	je     abdcf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac93>
      abdcb9:	48 63 d5             	movsxd rdx,ebp
      abdcbc:	48 89 e7             	mov    rdi,rsp
      abdcbf:	4c 89 e6             	mov    rsi,r12
      abdcc2:	e8 d9 01 d3 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
      abdcc7:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
      abdcce:	48 89 e6             	mov    rsi,rsp
      abdcd1:	e8 ba 00 00 00       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      abdcd6:	48 89 e7             	mov    rdi,rsp
      abdcd9:	e8 b2 01 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      abdcde:	49 8b 07             	mov    rax,QWORD PTR [r15]
      abdce1:	6a 02                	push   0x2
      abdce3:	59                   	pop    rcx
      abdce4:	4c 89 ff             	mov    rdi,r15
      abdce7:	4c 89 f6             	mov    rsi,r14
      abdcea:	4c 89 e2             	mov    rdx,r12
      abdced:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
      abdcf3:	48 89 df             	mov    rdi,rbx

### 0xad1308 FDE=(11342349, 11343068); origin facadeCandidate=r14 @0xad12fd; aliases=['rax']
      ad12fd:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ad1308:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      ad12d4:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ad12d9:	4c 89 f6             	mov    rsi,r14
      ad12dc:	4c 89 ea             	mov    rdx,r13
      ad12df:	e8 99 41 d0 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>
      ad12e4:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ad12e7:	4c 89 f7             	mov    rdi,r14
      ad12ea:	4c 89 e6             	mov    rsi,r12
      ad12ed:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      ad12f3:	89 c5                	mov    ebp,eax
      ad12f5:	4c 89 f7             	mov    rdi,r14
      ad12f8:	e8 eb 38 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ad12fd:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ad1300:	4c 89 f7             	mov    rdi,r14
      ad1303:	4c 89 e6             	mov    rsi,r12
      ad1306:	31 d2                	xor    edx,edx
      ad1308:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      ad130e:	49 89 c5             	mov    r13,rax
      ad1311:	4c 89 f7             	mov    rdi,r14
      ad1314:	e8 cf 38 d0 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      ad1319:	4d 85 ed             	test   r13,r13
      ad131c:	0f 84 a4 00 00 00    	je     ad13c6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e366>
      ad1322:	48 63 d5             	movsxd rdx,ebp
      ad1325:	4c 01 ea             	add    rdx,r13
      ad1328:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ad132d:	4c 89 ee             	mov    rsi,r13
      ad1330:	e8 a7 01 00 00       	call   ad14dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e47c>
      ad1335:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ad1338:	6a 02                	push   0x2
      ad133a:	59                   	pop    rcx
      ad133b:	4c 89 f7             	mov    rdi,r14
      ad133e:	4c 89 e6             	mov    rsi,r12
      ad1341:	4c 89 ea             	mov    rdx,r13
      ad1344:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
      ad134a:	e9 a0 00 00 00       	jmp    ad13ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e38f>
      ad134f:	48 8d 35 26 0c 98 ff 	lea    rsi,[rip+0xffffffffff980c26]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      ad1356:	48 8d 0d a2 7a 87 ff 	lea    rcx,[rip+0xffffffffff877aa2]        # 348dff <_ZTSSt12bad_any_cast@@Base-0x473c9>

### 0xb1e1c0 FDE=(11657289, 11658211); origin facadeCandidate=r14 @0xb1e1b5; aliases=['rax']
      b1e1b5:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b1e1c0:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      b1e18c:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      b1e191:	4c 89 f6             	mov    rsi,r14
      b1e194:	4c 89 e2             	mov    rdx,r12
      b1e197:	e8 e1 72 cb 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>
      b1e19c:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b1e19f:	4c 89 f7             	mov    rdi,r14
      b1e1a2:	4c 89 fe             	mov    rsi,r15
      b1e1a5:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      b1e1ab:	89 c5                	mov    ebp,eax
      b1e1ad:	4c 89 f7             	mov    rdi,r14
      b1e1b0:	e8 33 6a cb 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b1e1b5:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b1e1b8:	4c 89 f7             	mov    rdi,r14
      b1e1bb:	4c 89 fe             	mov    rsi,r15
      b1e1be:	31 d2                	xor    edx,edx
      b1e1c0:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      b1e1c6:	49 89 c4             	mov    r12,rax
      b1e1c9:	4c 89 f7             	mov    rdi,r14
      b1e1cc:	e8 17 6a cb 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b1e1d1:	4d 85 e4             	test   r12,r12
      b1e1d4:	0f 84 d0 00 00 00    	je     b1e2aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6b24a>
      b1e1da:	48 63 d5             	movsxd rdx,ebp
      b1e1dd:	4c 01 e2             	add    rdx,r12
      b1e1e0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      b1e1e5:	4c 89 e6             	mov    rsi,r12
      b1e1e8:	e8 ef 32 fb ff       	call   ad14dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e47c>
      b1e1ed:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b1e1f0:	6a 02                	push   0x2
      b1e1f2:	59                   	pop    rcx
      b1e1f3:	4c 89 f7             	mov    rdi,r14
      b1e1f6:	4c 89 fe             	mov    rsi,r15
      b1e1f9:	4c 89 e2             	mov    rdx,r12
      b1e1fc:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
      b1e202:	e9 cc 00 00 00       	jmp    b1e2d3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6b273>
      b1e207:	48 8d 35 6e 3d 93 ff 	lea    rsi,[rip+0xffffffffff933d6e]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b1e20e:	48 8d 0d 61 77 82 ff 	lea    rcx,[rip+0xffffffffff827761]        # 345976 <_ZTSSt12bad_any_cast@@Base-0x4a852>

### 0xb3a15b FDE=(11772160, 11774812); origin facadeCandidate=r14 @0xb3a150; aliases=['rax']
      b3a150:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b3a15b:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      b3a129:	48 85 c0             	test   rax,rax
      b3a12c:	0f 84 f7 06 00 00    	je     b3a829 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x877c9>
      b3a132:	48 89 f3             	mov    rbx,rsi
      b3a135:	49 89 fe             	mov    r14,rdi
      b3a138:	48 89 d6             	mov    rsi,rdx
      b3a13b:	48 89 c2             	mov    rdx,rax
      b3a13e:	31 c0                	xor    eax,eax
      b3a140:	e8 cf af f8 ff       	call   ac5114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x120b4>
      b3a145:	49 89 c7             	mov    r15,rax
      b3a148:	4c 89 f7             	mov    rdi,r14
      b3a14b:	e8 98 aa c9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b3a150:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b3a153:	4c 89 f7             	mov    rdi,r14
      b3a156:	4c 89 fe             	mov    rsi,r15
      b3a159:	31 d2                	xor    edx,edx
      b3a15b:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      b3a161:	49 89 c4             	mov    r12,rax
      b3a164:	4c 89 f7             	mov    rdi,r14
      b3a167:	e8 7c aa c9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b3a16c:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b3a16f:	4c 89 f7             	mov    rdi,r14
      b3a172:	4c 89 fe             	mov    rsi,r15
      b3a175:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      b3a17b:	89 c5                	mov    ebp,eax
      b3a17d:	4c 89 f7             	mov    rdi,r14
      b3a180:	e8 63 aa c9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      b3a185:	48 63 d5             	movsxd rdx,ebp
      b3a188:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      b3a18f:	00 
      b3a190:	4c 89 e6             	mov    rsi,r12
      b3a193:	e8 08 3d cb 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
      b3a198:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b3a19b:	6a 02                	push   0x2
      b3a19d:	59                   	pop    rcx
      b3a19e:	4c 89 f7             	mov    rdi,r14
      b3a1a1:	4c 89 fe             	mov    rsi,r15

### 0xb8f047 FDE=(12120110, 12120154); origin facadeCandidate=rbx @0xb8f044; aliases=['rax']
      b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
      b8f014:	00 00 
      b8f016:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
      b8f01d:	00 
      b8f01e:	75 08                	jne    b8f028 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfc8>
      b8f020:	4c 89 ef             	mov    rdi,r13
      b8f023:	e8 a8 0c ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b8f028:	e8 83 0a c6 00       	call   17efab0 <__stack_chk_fail@plt>
      b8f02d:	cc                   	int3
      b8f02e:	53                   	push   rbx
      b8f02f:	48 89 fb             	mov    rbx,rdi
      b8f032:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b8f036:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b8f03a:	ba b8 00 00 00       	mov    edx,0xb8
      b8f03f:	e8 9a 32 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
      b8f04e:	48 85 c0             	test   rax,rax
      b8f051:	74 02                	je     b8f055 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbff5>
      b8f053:	5b                   	pop    rbx
      b8f054:	c3                   	ret
      b8f055:	e8 65 af ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b8f05a:	48 8d 05 67 f3 c7 00 	lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
      b8f061:	48 89 07             	mov    QWORD PTR [rdi],rax
      b8f064:	48 83 c7 10          	add    rdi,0x10
      b8f068:	e9 bb ad ee ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
      b8f06d:	cc                   	int3
      b8f06e:	53                   	push   rbx
      b8f06f:	48 89 fb             	mov    rbx,rdi
      b8f072:	e8 e3 ff ff ff       	call   b8f05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbffa>
      b8f077:	48 89 df             	mov    rdi,rbx
      b8f07a:	5b                   	pop    rbx
      b8f07b:	e9 a0 ee c5 00       	jmp    17edf20 <_ZdlPv@plt>
      b8f080:	55                   	push   rbp
      b8f081:	41 57                	push   r15
      b8f083:	41 56                	push   r14
      b8f085:	53                   	push   rbx

### 0xbc55a5 FDE=(12342684, 12342788); origin facadeCandidate=rdi @0xbc55a2; aliases=['rax']
      bc55a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc55a5:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      bc5581:	31 d0                	xor    eax,edx
      bc5583:	01 f8                	add    eax,edi
      bc5585:	48 83 c4 08          	add    rsp,0x8
      bc5589:	5b                   	pop    rbx
      bc558a:	5d                   	pop    rbp
      bc558b:	c3                   	ret
      bc558c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc558f:	48 03 b8 38 ff ff ff 	add    rdi,QWORD PTR [rax-0xc8]
      bc5596:	e9 3b ff ff ff       	jmp    bc54d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x112476>
      bc559b:	cc                   	int3
      bc559c:	55                   	push   rbp
      bc559d:	53                   	push   rbx
      bc559e:	50                   	push   rax
      bc559f:	48 89 fb             	mov    rbx,rdi
      bc55a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc55a5:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      bc55ab:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      bc55ae:	48 89 df             	mov    rdi,rbx
      bc55b1:	48 89 c6             	mov    rsi,rax
      bc55b4:	ff 91 e0 04 00 00    	call   QWORD PTR [rcx+0x4e0]
      bc55ba:	48 89 c1             	mov    rcx,rax
      bc55bd:	48 c1 e9 20          	shr    rcx,0x20
      bc55c1:	6a ff                	push   0xffffffffffffffff
      bc55c3:	5d                   	pop    rbp
      bc55c4:	48 c1 e0 20          	shl    rax,0x20
      bc55c8:	89 ce                	mov    esi,ecx
      bc55ca:	48 09 c6             	or     rsi,rax
      bc55cd:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc55d0:	48 89 df             	mov    rdi,rbx
      bc55d3:	ff 90 d8 05 00 00    	call   QWORD PTR [rax+0x5d8]
      bc55d9:	48 89 c1             	mov    rcx,rax
      bc55dc:	48 c1 e8 20          	shr    rax,0x20
      bc55e0:	89 ce                	mov    esi,ecx
      bc55e2:	c1 ee 1c             	shr    esi,0x1c
      bc55e5:	83 e6 07             	and    esi,0x7
      bc55e8:	ff c5                	inc    ebp

### 0xd43afc FDE=(13908600, 13908929); origin facadeCandidate=r12 @0xd43af0; aliases=['rax']
      d43af0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d43afc:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      d43acd:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
      d43ad2:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d43ad7:	4c 89 e7             	mov    rdi,r12
      d43ada:	e8 09 11 a9 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      d43adf:	4d 85 ed             	test   r13,r13
      d43ae2:	74 56                	je     d43b3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bc0>
      d43ae4:	6a 02                	push   0x2
      d43ae6:	58                   	pop    rax
      d43ae7:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
      d43aeb:	4d 85 ff             	test   r15,r15
      d43aee:	74 51                	je     d43b41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bc7>
      d43af0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d43af4:	4c 89 e7             	mov    rdi,r12
      d43af7:	4c 89 ee             	mov    rsi,r13
      d43afa:	31 d2                	xor    edx,edx
      d43afc:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
      d43b02:	48 89 c5             	mov    rbp,rax
      d43b05:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d43b09:	4c 89 e7             	mov    rdi,r12
      d43b0c:	4c 89 ee             	mov    rsi,r13
      d43b0f:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
      d43b15:	48 63 d0             	movsxd rdx,eax
      d43b18:	4c 89 ff             	mov    rdi,r15
      d43b1b:	48 89 ee             	mov    rsi,rbp
      d43b1e:	e8 2d ac aa 00       	call   17ee750 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKcm@plt>
      d43b23:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d43b27:	4c 89 e7             	mov    rdi,r12
      d43b2a:	4c 89 ee             	mov    rsi,r13
      d43b2d:	48 89 ea             	mov    rdx,rbp
      d43b30:	31 c9                	xor    ecx,ecx
      d43b32:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
      d43b38:	eb 07                	jmp    d43b41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bc7>
      d43b3a:	6a ff                	push   0xffffffffffffffff
      d43b3c:	58                   	pop    rax
      d43b3d:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
      d43b41:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### 0xd80340 FDE=(14156070, 14157072); origin facadeCandidate=r12 @0xd80203; aliases=['rax', 'rbp']
      d80203:	49 8b 2c 24          	mov    rbp,QWORD PTR [r12]
      d80340:	80 bd c0 05 00 00 00 	cmp    BYTE PTR [rbp+0x5c0],0x0
      d80305:	e8 22 b9 00 00       	call   d8bc2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58cb2>
      d8030a:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
      d8030f:	4c 89 ef             	mov    rdi,r13
      d80312:	48 89 c2             	mov    rdx,rax
      d80315:	48 89 d9             	mov    rcx,rbx
      d80318:	e8 4f f8 d5 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
      d8031d:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
      d80323:	4c 89 f7             	mov    rdi,r14
      d80326:	e8 0d 12 fd ff       	call   d51538 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e5be>
      d8032b:	48 89 ef             	mov    rdi,rbp
      d8032e:	e8 af e4 d1 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
      d80333:	48 89 c5             	mov    rbp,rax
      d80336:	4c 39 e0             	cmp    rax,r12
      d80339:	75 ab                	jne    d802e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d36c>
      d8033b:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]
      d80340:	80 bd c0 05 00 00 00 	cmp    BYTE PTR [rbp+0x5c0],0x0
      d80347:	74 67                	je     d803b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d436>
      d80349:	48 8d 9d 58 05 00 00 	lea    rbx,[rbp+0x558]
      d80350:	4d 8b 77 70          	mov    r14,QWORD PTR [r15+0x70]
      d80354:	4d 8b 67 78          	mov    r12,QWORD PTR [r15+0x78]
      d80358:	4d 39 e6             	cmp    r14,r12
      d8035b:	74 53                	je     d803b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d436>
      d8035d:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      d80361:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d80364:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d80367:	48 89 c7             	mov    rdi,rax
      d8036a:	48 89 de             	mov    rsi,rbx
      d8036d:	e8 12 c0 94 00       	call   16cc384 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x804f0>
      d80372:	49 83 c6 20          	add    r14,0x20
      d80376:	84 c0                	test   al,al
      d80378:	74 de                	je     d80358 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d3de>
      d8037a:	31 c0                	xor    eax,eax
      d8037c:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      d80381:	88 06                	mov    BYTE PTR [rsi],al
      d80383:	88 46 68             	mov    BYTE PTR [rsi+0x68],al
      d80386:	48 8d 05 8b 18 6d ff 	lea    rax,[rip+0xffffffffff6d188b]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>

### 0xd8b4d9 FDE=(14201884, 14202239); origin facadeCandidate=rsi @0xd8b43e; aliases=['r13']
      d8b43e:	4c 8b 2e             	mov    r13,QWORD PTR [rsi]
      d8b4d9:	41 80 bd c0 05 00 00 	cmp    BYTE PTR [r13+0x5c0],0x0
      d8b4ae:	41 8b ad a8 02 00 00 	mov    ebp,DWORD PTR [r13+0x2a8]
      d8b4b5:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d8b4b8:	4c 89 ff             	mov    rdi,r15
      d8b4bb:	ff 50 40             	call   QWORD PTR [rax+0x40]
      d8b4be:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d8b4c1:	48 89 c7             	mov    rdi,rax
      d8b4c4:	ff 51 50             	call   QWORD PTR [rcx+0x50]
      d8b4c7:	48 89 c1             	mov    rcx,rax
      d8b4ca:	6a 08                	push   0x8
      d8b4cc:	5e                   	pop    rsi
      d8b4cd:	89 e8                	mov    eax,ebp
      d8b4cf:	99                   	cdq
      d8b4d0:	f7 fe                	idiv   esi
      d8b4d2:	4c 63 f0             	movsxd r14,eax
      d8b4d5:	4c 0f af f1          	imul   r14,rcx
      d8b4d9:	41 80 bd c0 05 00 00 	cmp    BYTE PTR [r13+0x5c0],0x0
      d8b4e0:	00 
      d8b4e1:	74 4e                	je     d8b531 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x585b7>
      d8b4e3:	4d 8d a5 58 05 00 00 	lea    r12,[r13+0x558]
      d8b4ea:	48 8d 6c 24 08       	lea    rbp,[rsp+0x8]
      d8b4ef:	48 89 ef             	mov    rdi,rbp
      d8b4f2:	4c 89 fe             	mov    rsi,r15
      d8b4f5:	e8 58 df fd ff       	call   d69452 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x364d8>
      d8b4fa:	48 89 ef             	mov    rdi,rbp
      d8b4fd:	4c 89 e6             	mov    rsi,r12
      d8b500:	e8 a3 df fd ff       	call   d694a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3652e>
      d8b505:	89 c5                	mov    ebp,eax
      d8b507:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d8b50c:	e8 1d 9e 93 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d8b511:	40 84 ed             	test   bpl,bpl
      d8b514:	74 1b                	je     d8b531 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x585b7>
      d8b516:	49 8b 95 e8 05 00 00 	mov    rdx,QWORD PTR [r13+0x5e8]
      d8b51d:	49 03 95 e0 05 00 00 	add    rdx,QWORD PTR [r13+0x5e0]
      d8b524:	49 29 d6             	sub    r14,rdx
      d8b527:	b1 01                	mov    cl,0x1
      d8b529:	4c 89 f0             	mov    rax,r14

### 0x11ee6cf FDE=(18802184, 18804775); origin facadeCandidate=rbx @0x11ee6cc; aliases=['rax']
     11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
     11ee692:	00 
     11ee693:	48 89 df             	mov    rdi,rbx
     11ee696:	e8 05 4c 97 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee6a0:	48 89 df             	mov    rdi,rbx
     11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
     11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee6ad:	48 89 df             	mov    rdi,rbx
     11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
     11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
     11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
     11ee6e0:	48 89 df             	mov    rdi,rbx
     11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
     11ee6e8:	49 89 c4             	mov    r12,rax
     11ee6eb:	48 89 df             	mov    rdi,rbx
     11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
     11ee6f3:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
     11ee6fa:	00 
     11ee6fb:	48 89 df             	mov    rdi,rbx
     11ee6fe:	e8 c7 6a bf ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
     11ee703:	48 89 c5             	mov    rbp,rax
     11ee706:	48 89 df             	mov    rdi,rbx
     11ee709:	e8 c0 30 a2 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
     11ee70e:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
     11ee715:	00 
     11ee716:	48 89 df             	mov    rdi,rbx
     11ee719:	e8 10 76 eb ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
     11ee71e:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee723:	48 89 df             	mov    rdi,rbx

### 0x1228eb4 FDE=(19039932, 19042774); origin facadeCandidate=rax @0x1228e60; aliases=['rcx']
     1228e60:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1228eb4:	48 8b b1 c0 05 00 00 	mov    rsi,QWORD PTR [rcx+0x5c0]
     1228e78:	e8 2e 0e 00 00       	call   1229cab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f22f>
     1228e7d:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     1228e80:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1228e85:	c6 44 24 50 01       	mov    BYTE PTR [rsp+0x50],0x1
     1228e8a:	ba c0 00 00 00       	mov    edx,0xc0
     1228e8f:	48 8d 9c 24 30 03 00 	lea    rbx,[rsp+0x330]
     1228e96:	00 
     1228e97:	48 89 df             	mov    rdi,rbx
     1228e9a:	31 f6                	xor    esi,esi
     1228e9c:	e8 ef 5c 5c 00       	call   17eeb90 <memset@plt>
     1228ea1:	31 c0                	xor    eax,eax
     1228ea3:	43 80 bc 3e c3 02 00 	cmp    BYTE PTR [r14+r15*1+0x2c3],0x1
     1228eaa:	00 01 
     1228eac:	0f 94 c0             	sete   al
     1228eaf:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     1228eb4:	48 8b b1 c0 05 00 00 	mov    rsi,QWORD PTR [rcx+0x5c0]
     1228ebb:	48 8b 91 c8 05 00 00 	mov    rdx,QWORD PTR [rcx+0x5c8]
     1228ec2:	89 04 24             	mov    DWORD PTR [rsp],eax
     1228ec5:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1228eca:	48 8d 0d 5f 29 1b ff 	lea    rcx,[rip+0xffffffffff1b295f]        # 3db830 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x127f>
     1228ed1:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]
     1228ed6:	49 89 d9             	mov    r9,rbx
     1228ed9:	e8 0f 04 00 00       	call   12292ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e871>
     1228ede:	48 8d bc 24 30 03 00 	lea    rdi,[rsp+0x330]
     1228ee5:	00 
     1228ee6:	e8 ad 0c e6 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
     1228eeb:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1228ef0:	48 8b 74 24 30       	mov    rsi,QWORD PTR [rsp+0x30]
     1228ef5:	e8 a6 f6 32 00       	call   15585a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39db24>
     1228efa:	48 89 c3             	mov    rbx,rax
     1228efd:	48 89 c7             	mov    rdi,rax
     1228f00:	48 8b 74 24 38       	mov    rsi,QWORD PTR [rsp+0x38]
     1228f05:	e8 38 47 e6 ff       	call   108d642 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254a58>
     1228f0a:	43 8a 84 3e c7 02 00 	mov    al,BYTE PTR [r14+r15*1+0x2c7]
     1228f11:	00 
     1228f12:	88 83 d0 00 00 00    	mov    BYTE PTR [rbx+0xd0],al

### 0x1337bfd FDE=(20151286, 20151420); origin facadeCandidate=rdi @0x1337bfa; aliases=['rbx']
     1337bfa:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1337bfd:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     1337bd8:	74 0a                	je     1337be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d168>
     1337bda:	48 89 df             	mov    rdi,rbx
     1337bdd:	e8 98 ff ff ff       	call   1337b7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d0fe>
     1337be2:	eb 0c                	jmp    1337bf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d174>
     1337be4:	48 89 df             	mov    rdi,rbx
     1337be7:	e8 ba 21 00 00       	call   1339da6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f32a>
     1337bec:	c6 43 20 01          	mov    BYTE PTR [rbx+0x20],0x1
     1337bf0:	48 89 d8             	mov    rax,rbx
     1337bf3:	5b                   	pop    rbx
     1337bf4:	c3                   	ret
     1337bf5:	cc                   	int3
     1337bf6:	41 56                	push   r14
     1337bf8:	53                   	push   rbx
     1337bf9:	50                   	push   rax
     1337bfa:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1337bfd:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
     1337c04:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1337c07:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1337c0a:	89 c1                	mov    ecx,eax
     1337c0c:	80 f1 01             	xor    cl,0x1
     1337c0f:	88 8b e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],cl
     1337c15:	84 c0                	test   al,al
     1337c17:	74 4c                	je     1337c65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d1e9>
     1337c19:	48 8b bb 30 01 00 00 	mov    rdi,QWORD PTR [rbx+0x130]
     1337c20:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1337c23:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1337c26:	84 c0                	test   al,al
     1337c28:	74 4a                	je     1337c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d1f8>
     1337c2a:	4c 8d b3 30 01 00 00 	lea    r14,[rbx+0x130]
     1337c31:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     1337c34:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1337c37:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1337c3a:	a8 02                	test   al,0x2
     1337c3c:	75 36                	jne    1337c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d1f8>
     1337c3e:	48 8b bb c8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c8]
     1337c45:	48 81 c3 d8 03 00 00 	add    rbx,0x3d8

### 0x135c7b3 FDE=(20301694, 20301915); origin facadeCandidate=r14 @0x135c7b0; aliases=['rax']
     135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
     135c77e:	41 57                	push   r15
     135c780:	41 56                	push   r14
     135c782:	53                   	push   rbx
     135c783:	48 83 ec 20          	sub    rsp,0x20
     135c787:	49 89 ce             	mov    r14,rcx
     135c78a:	49 89 d7             	mov    r15,rdx
     135c78d:	48 89 fb             	mov    rbx,rdi
     135c790:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c797:	00 00 
     135c799:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135c79e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
     135c7a2:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
     135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
     135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
     135c7ba:	4c 89 f7             	mov    rdi,r14
     135c7bd:	e8 d8 a4 a8 ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
     135c7c2:	49 8b 8f 90 00 00 00 	mov    rcx,QWORD PTR [r15+0x90]
     135c7c9:	49 8b b7 38 01 00 00 	mov    rsi,QWORD PTR [r15+0x138]
     135c7d0:	49 83 c6 20          	add    r14,0x20
     135c7d4:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     135c7d9:	49 83 20 00          	and    QWORD PTR [r8],0x0
     135c7dd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     135c7e2:	4c 89 f2             	mov    rdx,r14
     135c7e5:	e8 21 3e 96 ff       	call   cc060b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d5ab>
     135c7ea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135c7ef:	48 89 03             	mov    QWORD PTR [rbx],rax
     135c7f2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135c7f7:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
     135c7fd:	48 85 ff             	test   rdi,rdi
     135c800:	74 06                	je     135c808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1d8c>
     135c802:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135c805:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135c808:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c80f:	00 00 

### 0x14a7845 FDE=(21657426, 21658147); origin facadeCandidate=r15 @0x14a783a; aliases=['rax']
     14a783a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7845:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     14a7810:	0f 57 c0             	xorps  xmm0,xmm0
     14a7813:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
     14a7817:	0f 11 43 1c          	movups XMMWORD PTR [rbx+0x1c],xmm0
     14a781b:	e9 11 01 00 00       	jmp    14a7931 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eceb5>
     14a7820:	4d 85 e4             	test   r12,r12
     14a7823:	0f 84 bd 00 00 00    	je     14a78e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ece6a>
     14a7829:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a782c:	4c 89 ff             	mov    rdi,r15
     14a782f:	4c 89 e6             	mov    rsi,r12
     14a7832:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
     14a7838:	89 c5                	mov    ebp,eax
     14a783a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a783d:	4c 89 ff             	mov    rdi,r15
     14a7840:	4c 89 e6             	mov    rsi,r12
     14a7843:	31 d2                	xor    edx,edx
     14a7845:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     14a784b:	49 89 c5             	mov    r13,rax
     14a784e:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     14a7853:	48 89 c6             	mov    rsi,rax
     14a7856:	89 ea                	mov    edx,ebp
     14a7858:	e8 cb 80 2d 00       	call   177f928 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133a94>
     14a785d:	89 c5                	mov    ebp,eax
     14a785f:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7862:	6a 02                	push   0x2
     14a7864:	59                   	pop    rcx
     14a7865:	4c 89 ff             	mov    rdi,r15
     14a7868:	4c 89 e6             	mov    rsi,r12
     14a786b:	4c 89 ea             	mov    rdx,r13
     14a786e:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
     14a7874:	40 84 ed             	test   bpl,bpl
     14a7877:	0f 84 da 00 00 00    	je     14a7957 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ecedb>
     14a787d:	83 7c 24 38 00       	cmp    DWORD PTR [rsp+0x38],0x0
     14a7882:	75 12                	jne    14a7896 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ece1a>
     14a7884:	41 c7 06 1e 00 00 00 	mov    DWORD PTR [r14],0x1e
     14a788b:	48 8d 05 be 56 48 00 	lea    rax,[rip+0x4856be]        # 192cf50 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x74360>
     14a7892:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax

### 0x14a7d33 FDE=(21658734, 21659242); origin facadeCandidate=r15 @0x14a7d28; aliases=['rax']
     14a7d28:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7d33:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     14a7d00:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14a7d05:	4c 89 ff             	mov    rdi,r15
     14a7d08:	e8 db ce 32 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
     14a7d0d:	4d 85 e4             	test   r12,r12
     14a7d10:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     14a7d15:	74 6d                	je     14a7d84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ed308>
     14a7d17:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7d1a:	4c 89 ff             	mov    rdi,r15
     14a7d1d:	4c 89 e6             	mov    rsi,r12
     14a7d20:	ff 90 58 05 00 00    	call   QWORD PTR [rax+0x558]
     14a7d26:	89 c5                	mov    ebp,eax
     14a7d28:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7d2b:	4c 89 ff             	mov    rdi,r15
     14a7d2e:	4c 89 e6             	mov    rsi,r12
     14a7d31:	31 d2                	xor    edx,edx
     14a7d33:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     14a7d39:	49 89 c6             	mov    r14,rax
     14a7d3c:	48 63 d5             	movsxd rdx,ebp
     14a7d3f:	48 89 df             	mov    rdi,rbx
     14a7d42:	48 89 c6             	mov    rsi,rax
     14a7d45:	e8 56 61 34 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
     14a7d4a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7d4d:	6a 02                	push   0x2
     14a7d4f:	59                   	pop    rcx
     14a7d50:	4c 89 ff             	mov    rdi,r15
     14a7d53:	4c 89 e6             	mov    rsi,r12
     14a7d56:	4c 89 f2             	mov    rdx,r14
     14a7d59:	ff 90 00 06 00 00    	call   QWORD PTR [rax+0x600]
     14a7d5f:	eb 2e                	jmp    14a7d8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ed313>
     14a7d61:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     14a7d66:	4c 89 ee             	mov    rsi,r13
     14a7d69:	4c 89 e2             	mov    rdx,r12
     14a7d6c:	e8 a9 4c 5f ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     14a7d71:	f6 44 24 18 01       	test   BYTE PTR [rsp+0x18],0x1
     14a7d76:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     14a7d7b:	74 1e                	je     14a7d9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ed31f>

### 0x17d4220 FDE=(24986079, 24986739); origin facadeCandidate=rdi @0x17d4218; aliases=['rax']
     17d4218:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     17d4220:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     17d41e9:	48 81 ec 98 01 00 00 	sub    rsp,0x198
     17d41f0:	44 89 cb             	mov    ebx,r9d
     17d41f3:	44 89 c5             	mov    ebp,r8d
     17d41f6:	41 89 cf             	mov    r15d,ecx
     17d41f9:	49 89 d5             	mov    r13,rdx
     17d41fc:	49 89 fe             	mov    r14,rdi
     17d41ff:	4c 63 a4 24 d0 01 00 	movsxd r12,DWORD PTR [rsp+0x1d0]
     17d4206:	00 
     17d4207:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     17d420e:	00 00 
     17d4210:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
     17d4217:	00 
     17d4218:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     17d421b:	48 89 d6             	mov    rsi,rdx
     17d421e:	31 d2                	xor    edx,edx
     17d4220:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]
     17d4226:	48 8d 74 24 5c       	lea    rsi,[rsp+0x5c]
     17d422b:	83 26 00             	and    DWORD PTR [rsi],0x0
     17d422e:	0f 57 c0             	xorps  xmm0,xmm0
     17d4231:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
     17d4236:	0f 11 42 1e          	movups XMMWORD PTR [rdx+0x1e],xmm0
     17d423a:	0f 29 42 10          	movaps XMMWORD PTR [rdx+0x10],xmm0
     17d423e:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     17d4241:	4d 63 ff             	movsxd r15,r15d
     17d4244:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     17d4249:	49 01 c7             	add    r15,rax
     17d424c:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     17d4253:	00 
     17d4254:	89 1f                	mov    DWORD PTR [rdi],ebx
     17d4256:	89 6f 04             	mov    DWORD PTR [rdi+0x4],ebp
     17d4259:	4c 89 67 08          	mov    QWORD PTR [rdi+0x8],r12
     17d425d:	4c 89 7f 10          	mov    QWORD PTR [rdi+0x10],r15
     17d4261:	c6 47 18 00          	mov    BYTE PTR [rdi+0x18],0x0
     17d4265:	e8 96 ba 00 00       	call   17dfd00 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xbb21>
     17d426a:	4c 89 ff             	mov    rdi,r15
     17d426d:	31 f6                	xor    esi,esi

## Constant/index-derived service 184 stores
### 0xc1838d FDE=(12681568, 12682769): lea    r12,[r15+rax*8]
      c18354:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      c18365:	0f 57 c0             	xorps  xmm0,xmm0
      c18368:	0f 11 84 24 c8 00 00 	movups XMMWORD PTR [rsp+0xc8],xmm0
      c1836f:	00 
      c18370:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
      c18375:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      c1837a:	89 c5                	mov    ebp,eax
      c1837c:	83 e5 3f             	and    ebp,0x3f
      c1837f:	48 83 f8 3f          	cmp    rax,0x3f
      c18383:	77 04                	ja     c18389 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165329>
      c18385:	85 ed                	test   ebp,ebp
      c18387:	74 4a                	je     c183d3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165373>
      c18389:	48 c1 e8 06          	shr    rax,0x6
      c1838d:	4d 8d 24 c7          	lea    r12,[r15+rax*8]
      c18391:	45 31 ed             	xor    r13d,r13d
      c18394:	45 31 f6             	xor    r14d,r14d
      c18397:	49 8b 07             	mov    rax,QWORD PTR [r15]
      c1839a:	31 f6                	xor    esi,esi
      c1839c:	4c 0f a3 f0          	bt     rax,r14
      c183a0:	40 0f 92 c6          	setb   sil
      c183a4:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      c183ab:	00 
      c183ac:	e8 91 02 00 00       	call   c18642 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1655e2>
      c183b1:	31 c0                	xor    eax,eax
      c183b3:	41 83 fe 3f          	cmp    r14d,0x3f
      c183b7:	41 8d 4e 01          	lea    ecx,[r14+0x1]
      c183bb:	0f 94 c0             	sete   al
      c183be:	4d 8d 3c c7          	lea    r15,[r15+rax*8]
      c183c2:	41 89 ce             	mov    r14d,ecx
      c183c5:	45 0f 44 f5          	cmove  r14d,r13d
      c183c9:	41 39 ee             	cmp    r14d,ebp
      c183cc:	75 c9                	jne    c18397 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x165337>

### 0xcfa3f7 FDE=(13604286, 13608751): lea    rsi,[rcx+rax*8]
      cfa3b2:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
      cfa3cc:	48 8b 9c 24 80 01 00 	mov    rbx,QWORD PTR [rsp+0x180]
      cfa3d3:	00 
      cfa3d4:	48 29 cb             	sub    rbx,rcx
      cfa3d7:	48 c1 fb 02          	sar    rbx,0x2
      cfa3db:	48 39 d3             	cmp    rbx,rdx
      cfa3de:	48 0f 43 da          	cmovae rbx,rdx
      cfa3e2:	48 85 db             	test   rbx,rbx
      cfa3e5:	74 33                	je     cfa41a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2473ba>
      cfa3e7:	48 8d 14 9d 00 00 00 	lea    rdx,[rbx*4+0x0]
      cfa3ee:	00 
      cfa3ef:	48 8b 84 24 68 01 00 	mov    rax,QWORD PTR [rsp+0x168]
      cfa3f6:	00 
      cfa3f7:	48 8d 34 c1          	lea    rsi,[rcx+rax*8]
      cfa3fb:	e8 e0 56 af 00       	call   17efae0 <memmove@plt>
      cfa400:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      cfa407:	00 
      cfa408:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
      cfa40f:	00 
      cfa410:	48 89 c2             	mov    rdx,rax
      cfa413:	48 29 fa             	sub    rdx,rdi
      cfa416:	48 c1 fa 02          	sar    rdx,0x2
      cfa41a:	48 29 da             	sub    rdx,rbx
      cfa41d:	76 1f                	jbe    cfa43e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2473de>
      cfa41f:	48 8d 3c 9f          	lea    rdi,[rdi+rbx*4]
      cfa423:	48 c1 e2 02          	shl    rdx,0x2
      cfa427:	31 f6                	xor    esi,esi
      cfa429:	e8 62 47 af 00       	call   17eeb90 <memset@plt>
      cfa42e:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
      cfa435:	00 
      cfa436:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
      cfa43d:	00 

### 0xe325d5 FDE=(14885978, 14888190): lea    rdx,[rsi+rax*8]
      e325b2:	49 8d 86 b8 00 00 00 	lea    rax,[r14+0xb8]
      e32597:	48 0f 44 f0          	cmove  rsi,rax
      e3259b:	49 63 86 a8 00 00 00 	movsxd rax,DWORD PTR [r14+0xa8]
      e325a2:	48 8d 14 c6          	lea    rdx,[rsi+rax*8]
      e325a6:	e8 2b de ff ff       	call   e303d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd45c>
      e325ab:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
      e325b2:	49 8d 86 b8 00 00 00 	lea    rax,[r14+0xb8]
      e325b9:	49 8b 8e b8 00 00 00 	mov    rcx,QWORD PTR [r14+0xb8]
      e325c0:	48 89 ce             	mov    rsi,rcx
      e325c3:	48 83 c6 07          	add    rsi,0x7
      e325c7:	f6 c1 01             	test   cl,0x1
      e325ca:	48 0f 44 f0          	cmove  rsi,rax
      e325ce:	49 63 86 c0 00 00 00 	movsxd rax,DWORD PTR [r14+0xc0]
      e325d5:	48 8d 14 c6          	lea    rdx,[rsi+rax*8]
      e325d9:	e8 f8 dd ff ff       	call   e303d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd45c>
      e325de:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
      e325e5:	49 8d 86 d0 00 00 00 	lea    rax,[r14+0xd0]
      e325ec:	49 8b 8e d0 00 00 00 	mov    rcx,QWORD PTR [r14+0xd0]
      e325f3:	48 89 ce             	mov    rsi,rcx
      e325f6:	48 83 c6 07          	add    rsi,0x7
      e325fa:	f6 c1 01             	test   cl,0x1
      e325fd:	48 0f 44 f0          	cmove  rsi,rax
      e32601:	49 63 86 d8 00 00 00 	movsxd rax,DWORD PTR [r14+0xd8]
      e32608:	48 8d 14 c6          	lea    rdx,[rsi+rax*8]
      e3260c:	e8 c5 dd ff ff       	call   e303d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd45c>
      e32611:	48 8d bb 08 01 00 00 	lea    rdi,[rbx+0x108]
      e32618:	49 8d 86 e8 00 00 00 	lea    rax,[r14+0xe8]
      e3261f:	49 8b 8e e8 00 00 00 	mov    rcx,QWORD PTR [r14+0xe8]
      e32626:	48 89 ce             	mov    rsi,rcx
      e32629:	48 83 c6 07          	add    rsi,0x7
      e3262d:	f6 c1 01             	test   cl,0x1
      e32630:	48 0f 44 f0          	cmove  rsi,rax

### 0xe32608 FDE=(14885978, 14888190): lea    rdx,[rsi+rax*8]
      e325b2:	49 8d 86 b8 00 00 00 	lea    rax,[r14+0xb8]
      e325ca:	48 0f 44 f0          	cmove  rsi,rax
      e325ce:	49 63 86 c0 00 00 00 	movsxd rax,DWORD PTR [r14+0xc0]
      e325d5:	48 8d 14 c6          	lea    rdx,[rsi+rax*8]
      e325d9:	e8 f8 dd ff ff       	call   e303d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd45c>
      e325de:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
      e325e5:	49 8d 86 d0 00 00 00 	lea    rax,[r14+0xd0]
      e325ec:	49 8b 8e d0 00 00 00 	mov    rcx,QWORD PTR [r14+0xd0]
      e325f3:	48 89 ce             	mov    rsi,rcx
      e325f6:	48 83 c6 07          	add    rsi,0x7
      e325fa:	f6 c1 01             	test   cl,0x1
      e325fd:	48 0f 44 f0          	cmove  rsi,rax
      e32601:	49 63 86 d8 00 00 00 	movsxd rax,DWORD PTR [r14+0xd8]
      e32608:	48 8d 14 c6          	lea    rdx,[rsi+rax*8]
      e3260c:	e8 c5 dd ff ff       	call   e303d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd45c>
      e32611:	48 8d bb 08 01 00 00 	lea    rdi,[rbx+0x108]
      e32618:	49 8d 86 e8 00 00 00 	lea    rax,[r14+0xe8]
      e3261f:	49 8b 8e e8 00 00 00 	mov    rcx,QWORD PTR [r14+0xe8]
      e32626:	48 89 ce             	mov    rsi,rcx
      e32629:	48 83 c6 07          	add    rsi,0x7
      e3262d:	f6 c1 01             	test   cl,0x1
      e32630:	48 0f 44 f0          	cmove  rsi,rax
      e32634:	49 63 86 f0 00 00 00 	movsxd rax,DWORD PTR [r14+0xf0]
      e3263b:	48 8d 14 c6          	lea    rdx,[rsi+rax*8]
      e3263f:	e8 92 dd ff ff       	call   e303d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfd45c>
      e32644:	48 8d bb 20 01 00 00 	lea    rdi,[rbx+0x120]
      e3264b:	49 8d 86 00 01 00 00 	lea    rax,[r14+0x100]
      e32652:	49 8b 8e 00 01 00 00 	mov    rcx,QWORD PTR [r14+0x100]
      e32659:	48 89 ce             	mov    rsi,rcx
      e3265c:	48 83 c6 07          	add    rsi,0x7
      e32660:	f6 c1 01             	test   cl,0x1
      e32663:	48 0f 44 f0          	cmove  rsi,rax

### 0xfffba9 FDE=(16776068, 16776225): mov    rax,QWORD PTR [rcx+rax*8]
      fffb6d:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      fffb83:	cc                   	int3
      fffb84:	48 83 7f 68 00       	cmp    QWORD PTR [rdi+0x68],0x0
      fffb89:	0f 84 91 00 00 00    	je     fffc20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7036>
      fffb8f:	41 56                	push   r14
      fffb91:	53                   	push   rbx
      fffb92:	50                   	push   rax
      fffb93:	48 89 fb             	mov    rbx,rdi
      fffb96:	48 8b 4f 48          	mov    rcx,QWORD PTR [rdi+0x48]
      fffb9a:	48 8b 47 60          	mov    rax,QWORD PTR [rdi+0x60]
      fffb9e:	41 be aa 00 00 00    	mov    r14d,0xaa
      fffba4:	31 d2                	xor    edx,edx
      fffba6:	49 f7 f6             	div    r14
      fffba9:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
      fffbad:	48 6b ca 18          	imul   rcx,rdx,0x18
      fffbb1:	48 8d 34 08          	lea    rsi,[rax+rcx*1]
      fffbb5:	48 83 c6 08          	add    rsi,0x8
      fffbb9:	48 83 c7 30          	add    rdi,0x30
      fffbbd:	e8 5a 9c ab ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fffbc2:	48 8b 4b 48          	mov    rcx,QWORD PTR [rbx+0x48]
      fffbc6:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
      fffbca:	31 d2                	xor    edx,edx
      fffbcc:	49 f7 f6             	div    r14
      fffbcf:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
      fffbd3:	48 6b ca 18          	imul   rcx,rdx,0x18
      fffbd7:	48 8b 7c 08 10       	mov    rdi,QWORD PTR [rax+rcx*1+0x10]
      fffbdc:	e8 a5 e8 a9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fffbe1:	f3 0f 6f 43 60       	movdqu xmm0,XMMWORD PTR [rbx+0x60]
      fffbe6:	66 0f d4 05 62 e2 38 	paddq  xmm0,XMMWORD PTR [rip+0xffffffffff38e262]        # 38de50 <_ZTSSt12bad_any_cast@@Base-0x2378>
      fffbed:	ff 
      fffbee:	f3 0f 7f 43 60       	movdqu XMMWORD PTR [rbx+0x60],xmm0
      fffbf3:	66 48 0f 7e c0       	movq   rax,xmm0

### 0x1233999 FDE=(19084208, 19086529): call   QWORD PTR [r15+rax*8]
     1233967:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     123396f:	41 8b bc 24 50 01 00 	mov    edi,DWORD PTR [r12+0x150]
     1233976:	00 
     1233977:	e8 cc b0 87 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     123397c:	48 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],rbp
     1233981:	41 8b 84 24 50 01 00 	mov    eax,DWORD PTR [r12+0x150]
     1233988:	00 
     1233989:	48 39 d8             	cmp    rax,rbx
     123398c:	6a ff                	push   0xffffffffffffffff
     123398e:	59                   	pop    rcx
     123398f:	48 0f 44 c1          	cmove  rax,rcx
     1233993:	4c 89 f7             	mov    rdi,r14
     1233996:	4c 89 e6             	mov    rsi,r12
     1233999:	41 ff 14 c7          	call   QWORD PTR [r15+rax*8]
     123399d:	49 81 c4 58 01 00 00 	add    r12,0x158
     12339a4:	4d 39 ec             	cmp    r12,r13
     12339a7:	75 9d                	jne    1233946 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78eca>
     12339a9:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     12339ae:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     12339b1:	48 8b 2c 24          	mov    rbp,QWORD PTR [rsp]
     12339b5:	41 80 bf 90 08 00 00 	cmp    BYTE PTR [r15+0x890],0x0
     12339bc:	00 
     12339bd:	74 41                	je     1233a00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f84>
     12339bf:	49 8b b7 60 08 00 00 	mov    rsi,QWORD PTR [r15+0x860]
     12339c6:	41 8b bf 58 08 00 00 	mov    edi,DWORD PTR [r15+0x858]
     12339cd:	e8 4e 7e 84 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12339d2:	84 c0                	test   al,al
     12339d4:	75 2a                	jne    1233a00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x78f84>
     12339d6:	49 81 c7 58 08 00 00 	add    r15,0x858
     12339dd:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
     12339e4:	00 
     12339e5:	48 89 ef             	mov    rdi,rbp

### 0x1240a74 FDE=(19122204, 19140568): mov    QWORD PTR [rcx+rax*8],rbx
     1240a37:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1240a52:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     1240a56:	48 8d 51 ff          	lea    rdx,[rcx-0x1]
     1240a5a:	48 85 d1             	test   rcx,rdx
     1240a5d:	75 05                	jne    1240a64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85fe8>
     1240a5f:	48 21 d0             	and    rax,rdx
     1240a62:	eb 0d                	jmp    1240a71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85ff5>
     1240a64:	48 39 c8             	cmp    rax,rcx
     1240a67:	72 08                	jb     1240a71 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85ff5>
     1240a69:	31 d2                	xor    edx,edx
     1240a6b:	48 f7 f1             	div    rcx
     1240a6e:	48 89 d0             	mov    rax,rdx
     1240a71:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
     1240a74:	48 89 1c c1          	mov    QWORD PTR [rcx+rax*8],rbx
     1240a78:	0f 57 c0             	xorps  xmm0,xmm0
     1240a7b:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     1240a80:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1240a87:	00 
     1240a88:	e8 cf c1 fe ff       	call   122cc5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x721e0>
     1240a8d:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1240a94:	00 
     1240a95:	e8 c2 c1 fe ff       	call   122cc5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x721e0>
     1240a9a:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     1240a9f:	e9 fb f9 ff ff       	jmp    124049f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85a23>
     1240aa4:	eb 00                	jmp    1240aa6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8602a>
     1240aa6:	48 89 c3             	mov    rbx,rax
     1240aa9:	4c 89 ff             	mov    rdi,r15
     1240aac:	e8 41 f0 c8 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
     1240ab1:	eb 03                	jmp    1240ab6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8603a>
     1240ab3:	48 89 c3             	mov    rbx,rax
     1240ab6:	4c 89 f7             	mov    rdi,r14
     1240ab9:	e8 4a 9f 86 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>

### 0x12d8f3c FDE=(19762468, 19763369): mov    QWORD PTR [rdx+rax*8],rsi
     12d8ef7:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     12d8f1a:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     12d8f1e:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
     12d8f22:	48 85 d7             	test   rdi,rdx
     12d8f25:	75 05                	jne    12d8f2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e4b0>
     12d8f27:	48 21 d0             	and    rax,rdx
     12d8f2a:	eb 0d                	jmp    12d8f39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e4bd>
     12d8f2c:	48 39 f8             	cmp    rax,rdi
     12d8f2f:	72 08                	jb     12d8f39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e4bd>
     12d8f31:	31 d2                	xor    edx,edx
     12d8f33:	48 f7 f7             	div    rdi
     12d8f36:	48 89 d0             	mov    rax,rdx
     12d8f39:	49 8b 16             	mov    rdx,QWORD PTR [r14]
     12d8f3c:	48 89 34 c2          	mov    QWORD PTR [rdx+rax*8],rsi
     12d8f40:	0f 57 c0             	xorps  xmm0,xmm0
     12d8f43:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     12d8f46:	4c 8d b3 c0 05 00 00 	lea    r14,[rbx+0x5c0]
     12d8f4d:	48 83 bb d8 05 00 00 	cmp    QWORD PTR [rbx+0x5d8],0x0
     12d8f54:	00 
     12d8f55:	74 3a                	je     12d8f91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e515>
     12d8f57:	48 8b bb d0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5d0]
     12d8f5e:	e8 8b 95 80 ff       	call   ae24ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f48e>
     12d8f63:	48 83 a3 d0 05 00 00 	and    QWORD PTR [rbx+0x5d0],0x0
     12d8f6a:	00 
     12d8f6b:	48 8b 83 c8 05 00 00 	mov    rax,QWORD PTR [rbx+0x5c8]
     12d8f72:	48 85 c0             	test   rax,rax
     12d8f75:	74 12                	je     12d8f89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e50d>
     12d8f77:	31 c9                	xor    ecx,ecx
     12d8f79:	49 8b 16             	mov    rdx,QWORD PTR [r14]
     12d8f7c:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
     12d8f81:	48 ff c1             	inc    rcx
     12d8f84:	48 39 c8             	cmp    rax,rcx

### 0x1388db2 FDE=(20482656, 20486668): call   QWORD PTR [rax+rcx*8]
     1388d68:	48 89 8c 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rcx
     1388d84:	e8 bf 5c 72 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     1388d89:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
     1388d90:	00 
     1388d91:	48 89 2f             	mov    QWORD PTR [rdi],rbp
     1388d94:	41 8b 44 24 18       	mov    eax,DWORD PTR [r12+0x18]
     1388d99:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1388d9e:	48 39 c8             	cmp    rax,rcx
     1388da1:	6a ff                	push   0xffffffffffffffff
     1388da3:	59                   	pop    rcx
     1388da4:	48 0f 45 c8          	cmovne rcx,rax
     1388da8:	48 8d 05 21 ff 4d 00 	lea    rax,[rip+0x4dff21]        # 1868cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x253b8>
     1388daf:	4c 89 e6             	mov    rsi,r12
     1388db2:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     1388db5:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1388db8:	4c 89 ff             	mov    rdi,r15
     1388dbb:	ff 50 48             	call   QWORD PTR [rax+0x48]
     1388dbe:	66 3d 00 01          	cmp    ax,0x100
     1388dc2:	0f 82 a3 00 00 00    	jb     1388e6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ce3ef>
     1388dc8:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1388dcb:	4c 89 ff             	mov    rdi,r15
     1388dce:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1388dd1:	66 3d 00 01          	cmp    ax,0x100
     1388dd5:	0f 82 90 00 00 00    	jb     1388e6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ce3ef>
     1388ddb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1388dde:	4c 89 ff             	mov    rdi,r15
     1388de1:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1388de4:	89 c5                	mov    ebp,eax
     1388de6:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1388de9:	4c 89 ff             	mov    rdi,r15
     1388dec:	ff 50 48             	call   QWORD PTR [rax+0x48]
     1388def:	41 89 c4             	mov    r12d,eax

### 0x13ebf4c FDE=(20889333, 20889454): mov    r9,QWORD PTR [rcx+rax*8]
     13ebf39:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
     13ebf1c:	31 c0                	xor    eax,eax
     13ebf1e:	e8 af a9 3e 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     13ebf23:	c6 83 b1 00 00 00 01 	mov    BYTE PTR [rbx+0xb1],0x1
     13ebf2a:	5b                   	pop    rbx
     13ebf2b:	c3                   	ret
     13ebf2c:	89 f0                	mov    eax,esi
     13ebf2e:	48 8d 0d bb 33 48 00 	lea    rcx,[rip+0x4833bb]        # 186f2f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b9d8>
     13ebf35:	4c 8b 04 c1          	mov    r8,QWORD PTR [rcx+rax*8]
     13ebf39:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
     13ebf40:	48 8b 00             	mov    rax,QWORD PTR [rax]
     13ebf43:	8b 00                	mov    eax,DWORD PTR [rax]
     13ebf45:	48 8d 0d 54 33 48 00 	lea    rcx,[rip+0x483354]        # 186f2a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b988>
     13ebf4c:	4c 8b 0c c1          	mov    r9,QWORD PTR [rcx+rax*8]
     13ebf50:	48 8d 35 25 60 06 ff 	lea    rsi,[rip+0xffffffffff066025]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     13ebf57:	48 8d 0d 30 3a f4 fe 	lea    rcx,[rip+0xfffffffffef43a30]        # 32f98e <_ZTSSt12bad_any_cast@@Base-0x6083a>
     13ebf5e:	6a 04                	push   0x4
     13ebf60:	5f                   	pop    rdi
     13ebf61:	ba 03 01 00 00       	mov    edx,0x103
     13ebf66:	31 c0                	xor    eax,eax
     13ebf68:	5b                   	pop    rbx
     13ebf69:	e9 64 a9 3e 00       	jmp    17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     13ebf6e:	80 7f 28 00          	cmp    BYTE PTR [rdi+0x28],0x0
     13ebf72:	74 08                	je     13ebf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x231500>
     13ebf74:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     13ebf78:	48 2b 07             	sub    rax,QWORD PTR [rdi]
     13ebf7b:	c3                   	ret
     13ebf7c:	48 8b 57 18          	mov    rdx,QWORD PTR [rdi+0x18]
     13ebf80:	48 8b 4f 20          	mov    rcx,QWORD PTR [rdi+0x20]
     13ebf84:	48 89 c8             	mov    rax,rcx
     13ebf87:	48 29 d0             	sub    rax,rdx
     13ebf8a:	73 0d                	jae    13ebf99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23151d>

### 0x13ec117 FDE=(20889616, 20890798): mov    r8,QWORD PTR [rcx+rax*8]
     13ec104:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
     13ec0ec:	ff e0                	jmp    rax
     13ec0ee:	4c 89 e7             	mov    rdi,r12
     13ec0f1:	e8 e6 e8 00 00       	call   13fa9dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23ff60>
     13ec0f6:	eb 08                	jmp    13ec100 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x231684>
     13ec0f8:	4c 89 e7             	mov    rdi,r12
     13ec0fb:	e8 f1 ea 00 00       	call   13fabf1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x240175>
     13ec100:	85 c0                	test   eax,eax
     13ec102:	75 d5                	jne    13ec0d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23165d>
     13ec104:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
     13ec10b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     13ec10e:	8b 00                	mov    eax,DWORD PTR [rax]
     13ec110:	48 8d 0d 89 31 48 00 	lea    rcx,[rip+0x483189]        # 186f2a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b988>
     13ec117:	4c 8b 04 c1          	mov    r8,QWORD PTR [rcx+rax*8]
     13ec11b:	48 8d 35 5a 5e 06 ff 	lea    rsi,[rip+0xffffffffff065e5a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     13ec122:	48 8d 0d 26 51 f9 fe 	lea    rcx,[rip+0xfffffffffef95126]        # 38124f <_ZTSSt12bad_any_cast@@Base-0xef79>
     13ec129:	6a 03                	push   0x3
     13ec12b:	5f                   	pop    rdi
     13ec12c:	ba 40 01 00 00       	mov    edx,0x140
     13ec131:	31 c0                	xor    eax,eax
     13ec133:	e8 9a a7 3e 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     13ec138:	6a 01                	push   0x1
     13ec13a:	e9 f8 fe ff ff       	jmp    13ec037 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2315bb>
     13ec13f:	66 c7 43 78 01 00    	mov    WORD PTR [rbx+0x78],0x1
     13ec145:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     13ec149:	e8 20 fe ff ff       	call   13ebf6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2314f2>
     13ec14e:	48 3d 00 20 01 00    	cmp    rax,0x12000
     13ec154:	77 0d                	ja     13ec163 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2316e7>
     13ec156:	80 bb b2 00 00 00 00 	cmp    BYTE PTR [rbx+0xb2],0x0
     13ec15d:	0f 84 7b 02 00 00    	je     13ec3de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x231962>
     13ec163:	4c 8b ab b8 00 00 00 	mov    r13,QWORD PTR [rbx+0xb8]
     13ec16a:	4c 8d 3d cf c1 fa fe 	lea    r15,[rip+0xfffffffffefac1cf]        # 398340 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x4f21>

### 0x13ec322 FDE=(20889616, 20890798): mov    r8,QWORD PTR [rcx+rax*8]
     13ec30f:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
     13ec2f2:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     13ec2f6:	48 83 a0 c8 22 00 00 	and    QWORD PTR [rax+0x22c8],0x0
     13ec2fd:	00 
     13ec2fe:	e9 76 fe ff ff       	jmp    13ec179 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2316fd>
     13ec303:	4c 89 ef             	mov    rdi,r13
     13ec306:	e8 e6 e8 00 00       	call   13fabf1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x240175>
     13ec30b:	85 c0                	test   eax,eax
     13ec30d:	75 34                	jne    13ec343 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2318c7>
     13ec30f:	48 8b 83 b8 00 00 00 	mov    rax,QWORD PTR [rbx+0xb8]
     13ec316:	48 8b 00             	mov    rax,QWORD PTR [rax]
     13ec319:	8b 00                	mov    eax,DWORD PTR [rax]
     13ec31b:	48 8d 0d 7e 2f 48 00 	lea    rcx,[rip+0x482f7e]        # 186f2a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b988>
     13ec322:	4c 8b 04 c1          	mov    r8,QWORD PTR [rcx+rax*8]
     13ec326:	48 8d 35 4f 5c 06 ff 	lea    rsi,[rip+0xffffffffff065c4f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     13ec32d:	48 8d 0d 7a aa f6 fe 	lea    rcx,[rip+0xfffffffffef6aa7a]        # 356dae <_ZTSSt12bad_any_cast@@Base-0x3941a>
     13ec334:	6a 03                	push   0x3
     13ec336:	5f                   	pop    rdi
     13ec337:	ba 4a 01 00 00       	mov    edx,0x14a
     13ec33c:	31 c0                	xor    eax,eax
     13ec33e:	e8 8f a5 3e 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     13ec343:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
     13ec34a:	48 85 c0             	test   rax,rax
     13ec34d:	74 44                	je     13ec393 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x231917>
     13ec34f:	48 0f be 8b 81 00 00 	movsx  rcx,BYTE PTR [rbx+0x81]
     13ec356:	00 
     13ec357:	48 0f af c1          	imul   rax,rcx
     13ec35b:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     13ec35f:	48 8b 73 40          	mov    rsi,QWORD PTR [rbx+0x40]
     13ec363:	4c 8b 63 48          	mov    r12,QWORD PTR [rbx+0x48]
     13ec367:	49 29 f4             	sub    r12,rsi
     13ec36a:	49 39 c4             	cmp    r12,rax

### 0x143cf04 FDE=(21217114, 21222244): call   QWORD PTR [rcx+rax*8]
     143cec8:	49 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [r14+0xb8]
     143ceeb:	00 
     143ceec:	4c 39 f7             	cmp    rdi,r14
     143ceef:	74 0a                	je     143cefb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28247f>
     143cef1:	48 85 ff             	test   rdi,rdi
     143cef4:	74 11                	je     143cf07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28248b>
     143cef6:	6a 05                	push   0x5
     143cef8:	58                   	pop    rax
     143cef9:	eb 06                	jmp    143cf01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282485>
     143cefb:	6a 04                	push   0x4
     143cefd:	58                   	pop    rax
     143cefe:	4c 89 f7             	mov    rdi,r14
     143cf01:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     143cf04:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
     143cf07:	48 8d 83 10 01 00 00 	lea    rax,[rbx+0x110]
     143cf0e:	48 8b 8c 24 00 02 00 	mov    rcx,QWORD PTR [rsp+0x200]
     143cf15:	00 
     143cf16:	48 85 c9             	test   rcx,rcx
     143cf19:	74 18                	je     143cf33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2824b7>
     143cf1b:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     143cf22:	00 
     143cf23:	48 39 f9             	cmp    rcx,rdi
     143cf26:	74 11                	je     143cf39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2824bd>
     143cf28:	48 89 08             	mov    QWORD PTR [rax],rcx
     143cf2b:	48 8d 84 24 00 02 00 	lea    rax,[rsp+0x200]
     143cf32:	00 
     143cf33:	48 83 20 00          	and    QWORD PTR [rax],0x0
     143cf37:	eb 11                	jmp    143cf4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2824ce>
     143cf39:	4c 89 30             	mov    QWORD PTR [rax],r14
     143cf3c:	48 8b 84 24 e0 01 00 	mov    rax,QWORD PTR [rsp+0x1e0]
     143cf43:	00 
     143cf44:	4c 89 f6             	mov    rsi,r14

### 0x148c0e1 FDE=(21541366, 21549038): lea    r14,[rsi+rax*8]
     148c0c7:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     148c0b2:	00 
     148c0b3:	48 8b 9c 24 e8 00 00 	mov    rbx,QWORD PTR [rsp+0xe8]
     148c0ba:	00 
     148c0bb:	8b 84 24 c0 00 00 00 	mov    eax,DWORD PTR [rsp+0xc0]
     148c0c2:	41 89 44 24 40       	mov    DWORD PTR [r12+0x40],eax
     148c0c7:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     148c0ce:	00 
     148c0cf:	49 89 44 24 38       	mov    QWORD PTR [r12+0x38],rax
     148c0d4:	b9 cc 00 00 00       	mov    ecx,0xcc
     148c0d9:	48 89 d8             	mov    rax,rbx
     148c0dc:	31 d2                	xor    edx,edx
     148c0de:	48 f7 f1             	div    rcx
     148c0e1:	4c 8d 34 c6          	lea    r14,[rsi+rax*8]
     148c0e5:	48 39 f7             	cmp    rdi,rsi
     148c0e8:	74 24                	je     148c10e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1692>
     148c0ea:	48 6b ea 14          	imul   rbp,rdx,0x14
     148c0ee:	49 03 2e             	add    rbp,QWORD PTR [r14]
     148c0f1:	48 03 9c 24 f0 00 00 	add    rbx,QWORD PTR [rsp+0xf0]
     148c0f8:	00 
     148c0f9:	48 89 d8             	mov    rax,rbx
     148c0fc:	31 d2                	xor    edx,edx
     148c0fe:	48 f7 f1             	div    rcx
     148c101:	48 8d 3c c6          	lea    rdi,[rsi+rax*8]
     148c105:	48 6b f2 14          	imul   rsi,rdx,0x14
     148c109:	48 03 37             	add    rsi,QWORD PTR [rdi]
     148c10c:	eb 18                	jmp    148c126 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d16aa>
     148c10e:	48 03 9c 24 f0 00 00 	add    rbx,QWORD PTR [rsp+0xf0]
     148c115:	00 
     148c116:	31 ed                	xor    ebp,ebp
     148c118:	48 89 d8             	mov    rax,rbx
     148c11b:	31 d2                	xor    edx,edx

### 0x148c101 FDE=(21541366, 21549038): lea    rdi,[rsi+rax*8]
     148c0c7:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     148c0dc:	31 d2                	xor    edx,edx
     148c0de:	48 f7 f1             	div    rcx
     148c0e1:	4c 8d 34 c6          	lea    r14,[rsi+rax*8]
     148c0e5:	48 39 f7             	cmp    rdi,rsi
     148c0e8:	74 24                	je     148c10e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1692>
     148c0ea:	48 6b ea 14          	imul   rbp,rdx,0x14
     148c0ee:	49 03 2e             	add    rbp,QWORD PTR [r14]
     148c0f1:	48 03 9c 24 f0 00 00 	add    rbx,QWORD PTR [rsp+0xf0]
     148c0f8:	00 
     148c0f9:	48 89 d8             	mov    rax,rbx
     148c0fc:	31 d2                	xor    edx,edx
     148c0fe:	48 f7 f1             	div    rcx
     148c101:	48 8d 3c c6          	lea    rdi,[rsi+rax*8]
     148c105:	48 6b f2 14          	imul   rsi,rdx,0x14
     148c109:	48 03 37             	add    rsi,QWORD PTR [rdi]
     148c10c:	eb 18                	jmp    148c126 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d16aa>
     148c10e:	48 03 9c 24 f0 00 00 	add    rbx,QWORD PTR [rsp+0xf0]
     148c115:	00 
     148c116:	31 ed                	xor    ebp,ebp
     148c118:	48 89 d8             	mov    rax,rbx
     148c11b:	31 d2                	xor    edx,edx
     148c11d:	48 f7 f1             	div    rcx
     148c120:	48 8d 3c c7          	lea    rdi,[rdi+rax*8]
     148c124:	31 f6                	xor    esi,esi
     148c126:	4d 8d 7c 24 48       	lea    r15,[r12+0x48]
     148c12b:	4c 89 f2             	mov    rdx,r14
     148c12e:	48 89 e9             	mov    rcx,rbp
     148c131:	e8 67 12 00 00       	call   148d39d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d2921>
     148c136:	49 89 c5             	mov    r13,rax
     148c139:	49 8b 54 24 70       	mov    rdx,QWORD PTR [r12+0x70]
     148c13e:	48 39 c2             	cmp    rdx,rax

### 0x17066eb FDE=(24140998, 24149212): lea    rax,[rax+rcx*8+0x7]
     1706699:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     17066b9:	48 8d 88 00 01 00 00 	lea    rcx,[rax+0x100]
     17066c0:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
     17066c7:	00 
     17066c8:	48 8d 48 78          	lea    rcx,[rax+0x78]
     17066cc:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     17066d1:	48 05 20 01 00 00    	add    rax,0x120
     17066d7:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     17066dc:	31 c9                	xor    ecx,ecx
     17066de:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
     17066e5:	00 
     17066e6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     17066e9:	a8 01                	test   al,0x1
     17066eb:	48 8d 44 c8 07       	lea    rax,[rax+rcx*8+0x7]
     17066f0:	48 0f 44 c3          	cmove  rax,rbx
     17066f4:	4c 8b 38             	mov    r15,QWORD PTR [rax]
     17066f7:	48 8b 94 24 b8 00 00 	mov    rdx,QWORD PTR [rsp+0xb8]
     17066fe:	00 
     17066ff:	4c 8b 72 60          	mov    r14,QWORD PTR [rdx+0x60]
     1706703:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     170670a:	00 
     170670b:	48 6b f1 28          	imul   rsi,rcx,0x28
     170670f:	49 8d 1c 36          	lea    rbx,[r14+rsi*1]
     1706713:	48 89 94 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rdx
     170671a:	00 
     170671b:	41 8b 47 20          	mov    eax,DWORD PTR [r15+0x20]
     170671f:	41 89 04 36          	mov    DWORD PTR [r14+rsi*1],eax
     1706723:	41 8b 4f 24          	mov    ecx,DWORD PTR [r15+0x24]
     1706727:	41 89 4c 36 04       	mov    DWORD PTR [r14+rsi*1+0x4],ecx
     170672c:	48 89 74 24 28       	mov    QWORD PTR [rsp+0x28],rsi
     1706731:	49 89 54 36 10       	mov    QWORD PTR [r14+rsi*1+0x10],rdx
     1706736:	85 c0                	test   eax,eax

### 0x17ed106 FDE=(25085757, 25089445): movsd  xmm3,QWORD PTR [rax+r12*8]
     17ed0f4:	4c 8b a5 48 ff ff ff 	mov    r12,QWORD PTR [rbp-0xb8]
     17ed0c8:	49 83 c6 08          	add    r14,0x8
     17ed0cc:	48 3b 95 48 ff ff ff 	cmp    rdx,QWORD PTR [rbp-0xb8]
     17ed0d3:	66 0f 28 8d d0 fe ff 	movapd xmm1,XMMWORD PTR [rbp-0x130]
     17ed0da:	ff 
     17ed0db:	66 0f 28 15 dd f7 b9 	movapd xmm2,XMMWORD PTR [rip+0xfffffffffeb9f7dd]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
     17ed0e2:	fe 
     17ed0e3:	0f 8c 04 ff ff ff    	jl     17ecfed <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x18e0e>
     17ed0e9:	48 8b 55 b8          	mov    rdx,QWORD PTR [rbp-0x48]
     17ed0ed:	48 8b b5 28 ff ff ff 	mov    rsi,QWORD PTR [rbp-0xd8]
     17ed0f4:	4c 8b a5 48 ff ff ff 	mov    r12,QWORD PTR [rbp-0xb8]
     17ed0fb:	48 8b 8d 70 ff ff ff 	mov    rcx,QWORD PTR [rbp-0x90]
     17ed102:	48 8b 45 c0          	mov    rax,QWORD PTR [rbp-0x40]
     17ed106:	f2 42 0f 10 1c e0    	movsd  xmm3,QWORD PTR [rax+r12*8]
     17ed10c:	44 39 e1             	cmp    ecx,r12d
     17ed10f:	0f 84 03 04 00 00    	je     17ed518 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19339>
     17ed115:	8b 85 58 ff ff ff    	mov    eax,DWORD PTR [rbp-0xa8]
     17ed11b:	ff c0                	inc    eax
     17ed11d:	83 f8 20             	cmp    eax,0x20
     17ed120:	0f 84 5a 04 00 00    	je     17ed580 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x193a1>
     17ed126:	89 85 58 ff ff ff    	mov    DWORD PTR [rbp-0xa8],eax
     17ed12c:	4c 63 f1             	movsxd r14,ecx
     17ed12f:	48 8b 45 c0          	mov    rax,QWORD PTR [rbp-0x40]
     17ed133:	f2 42 0f 10 04 f0    	movsd  xmm0,QWORD PTR [rax+r14*8]
     17ed139:	0f 29 85 70 ff ff ff 	movaps XMMWORD PTR [rbp-0x90],xmm0
     17ed140:	48 8b 8d 60 ff ff ff 	mov    rcx,QWORD PTR [rbp-0xa0]
     17ed147:	f2 0f 10 34 c8       	movsd  xmm6,QWORD PTR [rax+rcx*8]
     17ed14c:	f2 0f 10 04 ca       	movsd  xmm0,QWORD PTR [rdx+rcx*8]
     17ed151:	f2 42 0f 10 14 e2    	movsd  xmm2,QWORD PTR [rdx+r12*8]
     17ed157:	f2 0f 11 55 a0       	movsd  QWORD PTR [rbp-0x60],xmm2
     17ed15c:	66 0f 28 e6          	movapd xmm4,xmm6
     17ed160:	f2 0f 5c e3          	subsd  xmm4,xmm3

### 0x17ed151 FDE=(25085757, 25089445): movsd  xmm2,QWORD PTR [rdx+r12*8]
     17ed0f4:	4c 8b a5 48 ff ff ff 	mov    r12,QWORD PTR [rbp-0xb8]
     17ed115:	8b 85 58 ff ff ff    	mov    eax,DWORD PTR [rbp-0xa8]
     17ed11b:	ff c0                	inc    eax
     17ed11d:	83 f8 20             	cmp    eax,0x20
     17ed120:	0f 84 5a 04 00 00    	je     17ed580 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x193a1>
     17ed126:	89 85 58 ff ff ff    	mov    DWORD PTR [rbp-0xa8],eax
     17ed12c:	4c 63 f1             	movsxd r14,ecx
     17ed12f:	48 8b 45 c0          	mov    rax,QWORD PTR [rbp-0x40]
     17ed133:	f2 42 0f 10 04 f0    	movsd  xmm0,QWORD PTR [rax+r14*8]
     17ed139:	0f 29 85 70 ff ff ff 	movaps XMMWORD PTR [rbp-0x90],xmm0
     17ed140:	48 8b 8d 60 ff ff ff 	mov    rcx,QWORD PTR [rbp-0xa0]
     17ed147:	f2 0f 10 34 c8       	movsd  xmm6,QWORD PTR [rax+rcx*8]
     17ed14c:	f2 0f 10 04 ca       	movsd  xmm0,QWORD PTR [rdx+rcx*8]
     17ed151:	f2 42 0f 10 14 e2    	movsd  xmm2,QWORD PTR [rdx+r12*8]
     17ed157:	f2 0f 11 55 a0       	movsd  QWORD PTR [rbp-0x60],xmm2
     17ed15c:	66 0f 28 e6          	movapd xmm4,xmm6
     17ed160:	f2 0f 5c e3          	subsd  xmm4,xmm3
     17ed164:	66 0f 28 cb          	movapd xmm1,xmm3
     17ed168:	f2 0f 58 ce          	addsd  xmm1,xmm6
     17ed16c:	f2 0f 11 75 c8       	movsd  QWORD PTR [rbp-0x38],xmm6
     17ed171:	f2 0f 59 cc          	mulsd  xmm1,xmm4
     17ed175:	66 0f 28 e0          	movapd xmm4,xmm0
     17ed179:	f2 0f 5c e2          	subsd  xmm4,xmm2
     17ed17d:	f2 0f 58 c2          	addsd  xmm0,xmm2
     17ed181:	f2 0f 59 c4          	mulsd  xmm0,xmm4
     17ed185:	f2 0f 58 c1          	addsd  xmm0,xmm1
     17ed189:	66 0f 28 ca          	movapd xmm1,xmm2
     17ed18d:	f2 0f 58 ca          	addsd  xmm1,xmm2
     17ed191:	f2 0f 59 ce          	mulsd  xmm1,xmm6
     17ed195:	f2 0f 5e c1          	divsd  xmm0,xmm1
     17ed199:	f2 0f 11 45 80       	movsd  QWORD PTR [rbp-0x80],xmm0
     17ed19e:	66 0f 28 cd          	movapd xmm1,xmm5

### 0x17ed4e4 FDE=(25085757, 25089445): movsd  QWORD PTR [rdx+r12*8],xmm2
     17ed4b3:	4c 8b a5 48 ff ff ff 	mov    r12,QWORD PTR [rbp-0xb8]
     17ed4ab:	49 83 c6 08          	add    r14,0x8
     17ed4af:	48 83 c2 08          	add    rdx,0x8
     17ed4b3:	4c 8b a5 48 ff ff ff 	mov    r12,QWORD PTR [rbp-0xb8]
     17ed4ba:	48 8b 8d 20 ff ff ff 	mov    rcx,QWORD PTR [rbp-0xe0]
     17ed4c1:	4c 39 e1             	cmp    rcx,r12
     17ed4c4:	0f 8c 8f fd ff ff    	jl     17ed259 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1907a>
     17ed4ca:	eb 08                	jmp    17ed4d4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x192f5>
     17ed4cc:	f2 0f 10 2d 74 1b ba 	movsd  xmm5,QWORD PTR [rip+0xfffffffffeba1b74]        # 38f048 <_ZTSSt12bad_any_cast@@Base-0x1180>
     17ed4d3:	fe 
     17ed4d4:	48 8b 55 b8          	mov    rdx,QWORD PTR [rbp-0x48]
     17ed4d8:	48 8b 85 c0 fe ff ff 	mov    rax,QWORD PTR [rbp-0x140]
     17ed4df:	48 83 24 c2 00       	and    QWORD PTR [rdx+rax*8],0x0
     17ed4e4:	f2 42 0f 11 14 e2    	movsd  QWORD PTR [rdx+r12*8],xmm2
     17ed4ea:	48 8b 45 c0          	mov    rax,QWORD PTR [rbp-0x40]
     17ed4ee:	66 0f 28 85 70 ff ff 	movapd xmm0,XMMWORD PTR [rbp-0x90]
     17ed4f5:	ff 
     17ed4f6:	f2 42 0f 11 04 e0    	movsd  QWORD PTR [rax+r12*8],xmm0
     17ed4fc:	66 0f 28 8d d0 fe ff 	movapd xmm1,XMMWORD PTR [rbp-0x130]
     17ed503:	ff 
     17ed504:	48 8b b5 28 ff ff ff 	mov    rsi,QWORD PTR [rbp-0xd8]
     17ed50b:	66 0f 28 15 ad f3 b9 	movapd xmm2,XMMWORD PTR [rip+0xfffffffffeb9f3ad]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
     17ed512:	fe 
     17ed513:	e9 31 fa ff ff       	jmp    17ecf49 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x18d6a>
     17ed518:	66 0f 57 c0          	xorpd  xmm0,xmm0
     17ed51c:	66 0f 2e c3          	ucomisd xmm0,xmm3
     17ed520:	76 35                	jbe    17ed557 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19378>
     17ed522:	66 0f 57 de          	xorpd  xmm3,xmm6
     17ed526:	48 8b 45 c0          	mov    rax,QWORD PTR [rbp-0x40]
     17ed52a:	66 42 0f 13 1c e0    	movlpd QWORD PTR [rax+r12*8],xmm3
     17ed530:	45 85 ed             	test   r13d,r13d
     17ed533:	7e 22                	jle    17ed557 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19378>

### 0x17ed4f6 FDE=(25085757, 25089445): movsd  QWORD PTR [rax+r12*8],xmm0
     17ed4b3:	4c 8b a5 48 ff ff ff 	mov    r12,QWORD PTR [rbp-0xb8]
     17ed4c1:	4c 39 e1             	cmp    rcx,r12
     17ed4c4:	0f 8c 8f fd ff ff    	jl     17ed259 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1907a>
     17ed4ca:	eb 08                	jmp    17ed4d4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x192f5>
     17ed4cc:	f2 0f 10 2d 74 1b ba 	movsd  xmm5,QWORD PTR [rip+0xfffffffffeba1b74]        # 38f048 <_ZTSSt12bad_any_cast@@Base-0x1180>
     17ed4d3:	fe 
     17ed4d4:	48 8b 55 b8          	mov    rdx,QWORD PTR [rbp-0x48]
     17ed4d8:	48 8b 85 c0 fe ff ff 	mov    rax,QWORD PTR [rbp-0x140]
     17ed4df:	48 83 24 c2 00       	and    QWORD PTR [rdx+rax*8],0x0
     17ed4e4:	f2 42 0f 11 14 e2    	movsd  QWORD PTR [rdx+r12*8],xmm2
     17ed4ea:	48 8b 45 c0          	mov    rax,QWORD PTR [rbp-0x40]
     17ed4ee:	66 0f 28 85 70 ff ff 	movapd xmm0,XMMWORD PTR [rbp-0x90]
     17ed4f5:	ff 
     17ed4f6:	f2 42 0f 11 04 e0    	movsd  QWORD PTR [rax+r12*8],xmm0
     17ed4fc:	66 0f 28 8d d0 fe ff 	movapd xmm1,XMMWORD PTR [rbp-0x130]
     17ed503:	ff 
     17ed504:	48 8b b5 28 ff ff ff 	mov    rsi,QWORD PTR [rbp-0xd8]
     17ed50b:	66 0f 28 15 ad f3 b9 	movapd xmm2,XMMWORD PTR [rip+0xfffffffffeb9f3ad]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
     17ed512:	fe 
     17ed513:	e9 31 fa ff ff       	jmp    17ecf49 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x18d6a>
     17ed518:	66 0f 57 c0          	xorpd  xmm0,xmm0
     17ed51c:	66 0f 2e c3          	ucomisd xmm0,xmm3
     17ed520:	76 35                	jbe    17ed557 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19378>
     17ed522:	66 0f 57 de          	xorpd  xmm3,xmm6
     17ed526:	48 8b 45 c0          	mov    rax,QWORD PTR [rbp-0x40]
     17ed52a:	66 42 0f 13 1c e0    	movlpd QWORD PTR [rax+r12*8],xmm3
     17ed530:	45 85 ed             	test   r13d,r13d
     17ed533:	7e 22                	jle    17ed557 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x19378>
     17ed535:	48 8b 85 08 ff ff ff 	mov    rax,QWORD PTR [rbp-0xf8]
     17ed53c:	48 8b 8d 50 ff ff ff 	mov    rcx,QWORD PTR [rbp-0xb0]
     17ed543:	f2 0f 10 00          	movsd  xmm0,QWORD PTR [rax]
     17ed547:	66 0f 57 c6          	xorpd  xmm0,xmm6

## FDEs containing both b8 validation and +5c0 write
### FDE 0xb8f02e..0xb8f05a
      b8f03a:	ba b8 00 00 00       	mov    edx,0xb8
      b8f03f:	e8 9a 32 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]

### FDE 0xde75ee..0xde87f4
      de765f:	e8 7a ac d7 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      de7682:	e8 57 ac d7 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      de778d:	48 8d bc 24 80 0b 00 	lea    rdi,[rsp+0xb80]
      de7b14:	f6 84 24 80 0b 00 00 	test   BYTE PTR [rsp+0xb80],0x1
      de7b28:	4c 8d 8c 24 81 0b 00 	lea    r9,[rsp+0xb81]
      de7fe0:	0f 10 84 24 c0 05 00 	movups xmm0,XMMWORD PTR [rsp+0x5c0]
      de800c:	0f 11 84 24 c0 05 00 	movups XMMWORD PTR [rsp+0x5c0],xmm0
      de8014:	be b8 00 00 00       	mov    esi,0xb8
      de80c2:	48 8d 3d 53 36 00 00 	lea    rdi,[rip+0x3653]        # deb71c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb87a2>
      de80ea:	48 8d 3d e1 36 00 00 	lea    rdi,[rip+0x36e1]        # deb7d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb8858>
      de8143:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
      de8257:	e8 b0 35 00 00       	call   deb80c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb8892>
      de85ed:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### FDE 0x11ee608..0x11ef027
     11ee649:	e8 90 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
     11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
     11ee73e:	e8 9b 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee76b:	e8 6e 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee793:	e8 46 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee7c8:	e8 11 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee818:	e8 c1 3a 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee850:	e8 89 3a 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     11ee8c3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11eea26:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
     11eed60:	4c 8b 84 24 b8 00 00 	mov    r8,QWORD PTR [rsp+0xb8]
     11eed8f:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     11eedba:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]

### FDE 0x135c77e..0x135c85b
     135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
     135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]

