# readiness source +0x178 dispatch-table trace

Known: both builders pass source+0x178 as the head copied into host+0x428 handle.

## Direct callers of source builders
### target 0xece084
- direct caller count=0

### target 0xee6db8
- direct caller count=0

## All writes to +0x178 in source-builder families
### FDE (15523972, 15525243)
#### READ 0xece15e: lea    r11,[r14+0x178]
      ece127:	e8 64 c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ece12c:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
      ece133:	00 
      ece134:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
      ece13b:	00 
      ece13c:	4c 89 ef             	mov    rdi,r13
      ece13f:	e8 4c c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ece144:	49 8d 4e 20          	lea    rcx,[r14+0x20]
      ece148:	4d 8d 46 30          	lea    r8,[r14+0x30]
      ece14c:	4d 8d 4e 40          	lea    r9,[r14+0x40]
      ece150:	49 8d 86 b0 00 00 00 	lea    rax,[r14+0xb0]
      ece157:	4d 8d 96 68 01 00 00 	lea    r10,[r14+0x168]
      ece15e:	4d 8d 9e 78 01 00 00 	lea    r11,[r14+0x178]
      ece165:	49 8d ae 88 01 00 00 	lea    rbp,[r14+0x188]
      ece16c:	49 81 c6 a0 01 00 00 	add    r14,0x1a0
      ece173:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
      ece177:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
      ece17b:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
      ece180:	4c 89 e2             	mov    rdx,r12
      ece183:	41 56                	push   r14
      ece185:	55                   	push   rbp
      ece186:	41 53                	push   r11
      ece188:	41 52                	push   r10
      ece18a:	41 57                	push   r15
      ece18c:	50                   	push   rax
      ece18d:	41 55                	push   r13
      ece18f:	48 8d 84 24 68 01 00 	lea    rax,[rsp+0x168]
      ece196:	00 
      ece197:	50                   	push   rax
      ece198:	e8 df 03 00 00       	call   ece57c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95992>
      ece19d:	48 83 c4 40          	add    rsp,0x40
      ece1a1:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      ece1a8:	00 
      ece1a9:	e8 bc bd ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ece1ae:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      ece1b5:	00 
      ece1b6:	e8 af bd ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### FDE (15625656, 15626175)
#### READ 0xee6e83: lea    r11,[r13+0x178]
      ee6e4a:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      ee6e4f:	e8 3c 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ee6e54:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
      ee6e5b:	00 
      ee6e5c:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      ee6e61:	4c 89 e7             	mov    rdi,r12
      ee6e64:	e8 27 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ee6e69:	49 8d 4d 20          	lea    rcx,[r13+0x20]
      ee6e6d:	4d 8d 45 30          	lea    r8,[r13+0x30]
      ee6e71:	4d 8d 4d 40          	lea    r9,[r13+0x40]
      ee6e75:	49 8d 85 b0 00 00 00 	lea    rax,[r13+0xb0]
      ee6e7c:	4d 8d 95 68 01 00 00 	lea    r10,[r13+0x168]
      ee6e83:	4d 8d 9d 78 01 00 00 	lea    r11,[r13+0x178]
      ee6e8a:	49 8d 9d 88 01 00 00 	lea    rbx,[r13+0x188]
      ee6e91:	49 81 c5 a0 01 00 00 	add    r13,0x1a0
      ee6e98:	49 83 c7 20          	add    r15,0x20
      ee6e9c:	4c 89 ff             	mov    rdi,r15
      ee6e9f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
      ee6ea4:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      ee6ea9:	41 55                	push   r13
      ee6eab:	53                   	push   rbx
      ee6eac:	41 53                	push   r11
      ee6eae:	41 52                	push   r10
      ee6eb0:	55                   	push   rbp
      ee6eb1:	50                   	push   rax
      ee6eb2:	41 54                	push   r12
      ee6eb4:	48 8d 84 24 e8 00 00 	lea    rax,[rsp+0xe8]
      ee6ebb:	00 
      ee6ebc:	50                   	push   rax
      ee6ebd:	e8 ba 76 fe ff       	call   ece57c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95992>
      ee6ec2:	48 83 c4 40          	add    rsp,0x40
      ee6ec6:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      ee6ecd:	00 
      ee6ece:	e8 97 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ee6ed3:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      ee6eda:	00 
      ee6edb:	e8 8a 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

## Global candidate writes to object+0x178 with static/high-address source
### write 0xab0d29: movdqu XMMWORD PTR [r13+0x178],xmm0; FDE=(11209472, 11210959)
- nearby high 0xab0cfa -> 0x18b1e60: mov    rdx,QWORD PTR [rip+0xe0115f]        # 18b1e60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265fcc>
      ab0cce:	41 88 85 30 01 00 00 	mov    BYTE PTR [r13+0x130],al
      ab0cd5:	4d 89 a5 38 01 00 00 	mov    QWORD PTR [r13+0x138],r12
      ab0cdc:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      ab0ce1:	48 83 26 00          	and    QWORD PTR [rsi],0x0
      ab0ce5:	4d 89 bd 40 01 00 00 	mov    QWORD PTR [r13+0x140],r15
      ab0cec:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      ab0cef:	48 8b 05 72 11 e0 00 	mov    rax,QWORD PTR [rip+0xe01172]        # 18b1e68 <_ZN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base-0x1400c0>
      ab0cf6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      ab0cfa:	48 8b 15 5f 11 e0 00 	mov    rdx,QWORD PTR [rip+0xe0115f]        # 18b1e60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x265fcc>
      ab0d01:	4c 89 f9             	mov    rcx,r15
      ab0d04:	e8 49 1f 00 00       	call   ab2c52 <_ZN4asio6detail16service_registry6createINS0_13epoll_reactorENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x188>
      ab0d09:	4d 8d 65 28          	lea    r12,[r13+0x28]
      ab0d0d:	49 89 85 48 01 00 00 	mov    QWORD PTR [r13+0x148],rax
      ab0d14:	66 0f ef c0          	pxor   xmm0,xmm0
      ab0d18:	f3 41 0f 7f 85 60 01 	movdqu XMMWORD PTR [r13+0x160],xmm0
      ab0d1f:	00 00 
      ab0d21:	49 83 8d 70 01 00 00 	or     QWORD PTR [r13+0x170],0xffffffffffffffff
      ab0d28:	ff 
      ab0d29:	f3 41 0f 7f 85 78 01 	movdqu XMMWORD PTR [r13+0x178],xmm0
      ab0d30:	00 00 
      ab0d32:	49 8d 85 88 01 00 00 	lea    rax,[r13+0x188]
      ab0d39:	48 8b 0d b0 0f e0 00 	mov    rcx,QWORD PTR [rip+0xe00fb0]        # 18b1cf0 <_ZZN4asio9execution6detail17any_executor_base16target_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS2_10target_fnsEbPNS6_9enable_ifIXntsr7is_sameIT_vEE5valueEvE4typeEE16fns_with_execute@@Base+0x1ec78>
      ab0d40:	49 89 8d b0 01 00 00 	mov    QWORD PTR [r13+0x1b0],rcx
      ab0d47:	48 8b 0d ba 0f e0 00 	mov    rcx,QWORD PTR [rip+0xe00fba]        # 18b1d08 <_ZZN4asio9execution6detail17any_executor_base16object_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS2_10object_fnsEPNS6_9enable_ifIXaantsr7is_sameIT_vEE5valuentsr7is_sameISE_NS1_22shared_target_executorEEE5valueEvE4typeEE3fns@@Base+0x1ec70>
      ab0d4e:	49 89 8d a0 01 00 00 	mov    QWORD PTR [r13+0x1a0],rcx
      ab0d55:	4d 89 bd 88 01 00 00 	mov    QWORD PTR [r13+0x188],r15
      ab0d5c:	49 89 85 a8 01 00 00 	mov    QWORD PTR [r13+0x1a8],rax
      ab0d63:	48 8b 05 a6 0f e0 00 	mov    rax,QWORD PTR [rip+0xe00fa6]        # 18b1d10 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1ec50>
      ab0d6a:	49 89 85 b8 01 00 00 	mov    QWORD PTR [r13+0x1b8],rax
      ab0d71:	49 83 a5 50 01 00 00 	and    QWORD PTR [r13+0x150],0x0
      ab0d78:	00 
      ab0d79:	31 ed                	xor    ebp,ebp
      ab0d7b:	41 88 ad 58 01 00 00 	mov    BYTE PTR [r13+0x158],bpl
      ab0d82:	49 8d bd c0 01 00 00 	lea    rdi,[r13+0x1c0]
      ab0d89:	49 8b b5 40 01 00 00 	mov    rsi,QWORD PTR [r13+0x140]
      ab0d90:	e8 07 de b9 00       	call   164eb9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d08>
      ab0d95:	41 88 ad d0 01 00 00 	mov    BYTE PTR [r13+0x1d0],bpl
      ab0d9c:	49 83 a5 f4 01 00 00 	and    QWORD PTR [r13+0x1f4],0x0
      ab0da3:	00 
      ab0da4:	66 0f ef c0          	pxor   xmm0,xmm0
      ab0da8:	f3 41 0f 7f 85 d4 01 	movdqu XMMWORD PTR [r13+0x1d4],xmm0
      ab0daf:	00 00 
      ab0db1:	f3 41 0f 7f 85 e4 01 	movdqu XMMWORD PTR [r13+0x1e4],xmm0
      ab0db8:	00 00 
      ab0dba:	4c 89 64 24 50       	mov    QWORD PTR [rsp+0x50],r12
      ab0dbf:	c6 44 24 58 01       	mov    BYTE PTR [rsp+0x58],0x1
      ab0dc4:	4c 89 e7             	mov    rdi,r12

### write 0xbec6db: mov    DWORD PTR [r14+0x178],ebx; FDE=(12502490, 12503389)
- nearby high 0xbec6ae -> 0x18b1c90: mov    rbp,QWORD PTR [rip+0xcc55db]        # 18b1c90 <_ZNSt6__ndk14cerrE@@Base-0x12d740>
      bec68c:	49 89 b6 68 01 00 00 	mov    QWORD PTR [r14+0x168],rsi
      bec693:	4c 89 f7             	mov    rdi,r14
      bec696:	e8 f7 12 00 00       	call   bed992 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13a932>
      bec69b:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      bec6a0:	41 83 7e 2c 00       	cmp    DWORD PTR [r14+0x2c],0x0
      bec6a5:	75 5f                	jne    bec706 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1396a6>
      bec6a7:	41 83 7e 30 00       	cmp    DWORD PTR [r14+0x30],0x0
      bec6ac:	7e 2d                	jle    bec6db <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13967b>
      bec6ae:	48 8b 2d db 55 cc 00 	mov    rbp,QWORD PTR [rip+0xcc55db]        # 18b1c90 <_ZNSt6__ndk14cerrE@@Base-0x12d740>
      bec6b5:	48 8d 35 0f 54 75 ff 	lea    rsi,[rip+0xffffffffff75540f]        # 341acb <_ZTSSt12bad_any_cast@@Base-0x4e6fd>
      bec6bc:	48 89 ef             	mov    rdi,rbp
      bec6bf:	e8 58 b0 f0 ff       	call   af771c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x446bc>
      bec6c4:	48 89 ef             	mov    rdi,rbp
      bec6c7:	89 de                	mov    esi,ebx
      bec6c9:	e8 92 22 c0 00       	call   17ee960 <_ZNSt6__ndk113basic_ostreamIcNS_11char_traitsIcEEElsEi@plt>
      bec6ce:	48 89 c7             	mov    rdi,rax
      bec6d1:	e8 e7 63 ff ff       	call   be2abd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12fa5d>
      bec6d6:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      bec6db:	41 89 9e 78 01 00 00 	mov    DWORD PTR [r14+0x178],ebx
      bec6e2:	eb 22                	jmp    bec706 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1396a6>
      bec6e4:	49 8b 86 70 01 00 00 	mov    rax,QWORD PTR [r14+0x170]
      bec6eb:	4c 89 f7             	mov    rdi,r14
      bec6ee:	48 89 d6             	mov    rsi,rdx
      bec6f1:	48 89 c2             	mov    rdx,rax
      bec6f4:	e8 99 12 00 00       	call   bed992 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13a932>
      bec6f9:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      bec6fe:	41 c6 86 9c 01 00 00 	mov    BYTE PTR [r14+0x19c],0x1
      bec705:	01 
      bec706:	41 8b 46 40          	mov    eax,DWORD PTR [r14+0x40]
      bec70a:	44 0f af f8          	imul   r15d,eax
      bec70e:	4c 89 e2             	mov    rdx,r12
      bec711:	0f af d0             	imul   edx,eax
      bec714:	49 63 ef             	movsxd rbp,r15d
      bec717:	45 31 e4             	xor    r12d,r12d
      bec71a:	85 d2                	test   edx,edx
      bec71c:	41 0f 4e d4          	cmovle edx,r12d
      bec720:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
      bec725:	0f 8e be 00 00 00    	jle    bec7e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x139789>
      bec72b:	89 5c 24 10          	mov    DWORD PTR [rsp+0x10],ebx
      bec72f:	49 8b 86 68 01 00 00 	mov    rax,QWORD PTR [r14+0x168]
      bec736:	48 8b 58 70          	mov    rbx,QWORD PTR [rax+0x70]
      bec73a:	48 2b 58 68          	sub    rbx,QWORD PTR [rax+0x68]
      bec73e:	48 c1 eb 02          	shr    rbx,0x2
      bec742:	45 31 ed             	xor    r13d,r13d
      bec745:	44 89 f8             	mov    eax,r15d
      bec748:	49 8b b6 68 01 00 00 	mov    rsi,QWORD PTR [r14+0x168]
      bec74f:	45 39 fc             	cmp    r12d,r15d

### write 0xd10bfe: call   QWORD PTR [rax+0x178]; FDE=(13698804, 13700822)
- nearby high 0xd10bd6 -> 0x19cd630: lea    rcx,[rip+0xcbca53]        # 19cd630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x96278>
      d10bb3:	4c 8b 60 50          	mov    r12,QWORD PTR [rax+0x50]
      d10bb7:	4d 85 e4             	test   r12,r12
      d10bba:	48 8d 0d 27 e3 cb 00 	lea    rcx,[rip+0xcbe327]        # 19ceee8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x97b30>
      d10bc1:	4c 0f 44 e1          	cmove  r12,rcx
      d10bc5:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
      d10bca:	48 85 c9             	test   rcx,rcx
      d10bcd:	74 14                	je     d10be3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25db83>
      d10bcf:	4c 8b 71 18          	mov    r14,QWORD PTR [rcx+0x18]
      d10bd3:	4d 85 f6             	test   r14,r14
      d10bd6:	48 8d 0d 53 ca cb 00 	lea    rcx,[rip+0xcbca53]        # 19cd630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x96278>
      d10bdd:	4c 0f 44 f1          	cmove  r14,rcx
      d10be1:	eb 03                	jmp    d10be6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25db86>
      d10be3:	45 31 f6             	xor    r14d,r14d
      d10be6:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
      d10bed:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
      d10bf4:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d10bf7:	4c 8b 68 20          	mov    r13,QWORD PTR [rax+0x20]
      d10bfb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d10bfe:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
      d10c04:	48 83 ec 08          	sub    rsp,0x8
      d10c08:	4c 89 ff             	mov    rdi,r15
      d10c0b:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      d10c10:	4c 89 e2             	mov    rdx,r12
      d10c13:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
      d10c18:	4d 89 f0             	mov    r8,r14
      d10c1b:	4c 8b 4c 24 10       	mov    r9,QWORD PTR [rsp+0x10]
      d10c20:	4c 8b 54 24 08       	mov    r10,QWORD PTR [rsp+0x8]
      d10c25:	41 ff b2 c0 00 00 00 	push   QWORD PTR [r10+0xc0]
      d10c2c:	6a 00                	push   0x0
      d10c2e:	41 ff b2 b0 00 00 00 	push   QWORD PTR [r10+0xb0]
      d10c35:	50                   	push   rax
      d10c36:	41 55                	push   r13
      d10c38:	e8 93 a9 63 00       	call   134b5d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190b54>
      d10c3d:	48 83 c4 30          	add    rsp,0x30
      d10c41:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
      d10c45:	4d 8b be 58 01 00 00 	mov    r15,QWORD PTR [r14+0x158]
      d10c4c:	83 4d 10 08          	or     DWORD PTR [rbp+0x10],0x8
      d10c50:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
      d10c54:	48 85 c0             	test   rax,rax
      d10c57:	75 1b                	jne    d10c74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25dc14>
      d10c59:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
      d10c5d:	40 f6 c7 01          	test   dil,0x1
      d10c61:	0f 85 28 01 00 00    	jne    d10d8f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25dd2f>
      d10c67:	e8 2e 04 00 00       	call   d1109a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e03a>
      d10c6c:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
      d10c70:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
      d10c74:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]

### write 0xdade9d: mov    QWORD PTR [rbx+0x178],rax; FDE=(14343519, 14344475)
- nearby high 0xdade96 -> 0x1950858: lea    rax,[rip+0xba29bb]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
      dade32:	0f 29 8b d0 00 00 00 	movaps XMMWORD PTR [rbx+0xd0],xmm1
      dade39:	0f 29 8b c0 00 00 00 	movaps XMMWORD PTR [rbx+0xc0],xmm1
      dade40:	0f 29 8b b0 00 00 00 	movaps XMMWORD PTR [rbx+0xb0],xmm1
      dade47:	c7 83 00 01 00 00 00 	mov    DWORD PTR [rbx+0x100],0x3f800000
      dade4e:	00 80 3f 
      dade51:	0f 11 8b 48 01 00 00 	movups XMMWORD PTR [rbx+0x148],xmm1
      dade58:	0f 11 8b 38 01 00 00 	movups XMMWORD PTR [rbx+0x138],xmm1
      dade5f:	0f 11 8b 28 01 00 00 	movups XMMWORD PTR [rbx+0x128],xmm1
      dade66:	0f 11 8b 18 01 00 00 	movups XMMWORD PTR [rbx+0x118],xmm1
      dade6d:	0f 11 8b 08 01 00 00 	movups XMMWORD PTR [rbx+0x108],xmm1
      dade74:	48 83 a3 58 01 00 00 	and    QWORD PTR [rbx+0x158],0x0
      dade7b:	00 
      dade7c:	41 8b 44 24 48       	mov    eax,DWORD PTR [r12+0x48]
      dade81:	89 83 60 01 00 00    	mov    DWORD PTR [rbx+0x160],eax
      dade87:	48 83 a3 64 01 00 00 	and    QWORD PTR [rbx+0x164],0x0
      dade8e:	00 
      dade8f:	83 a3 70 01 00 00 00 	and    DWORD PTR [rbx+0x170],0x0
      dade96:	48 8d 05 bb 29 ba 00 	lea    rax,[rip+0xba29bb]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
      dade9d:	48 89 83 78 01 00 00 	mov    QWORD PTR [rbx+0x178],rax
      dadea4:	31 c0                	xor    eax,eax
      dadea6:	88 83 80 01 00 00    	mov    BYTE PTR [rbx+0x180],al
      dadeac:	88 83 88 01 00 00    	mov    BYTE PTR [rbx+0x188],al
      dadeb2:	0f 29 8b 90 01 00 00 	movaps XMMWORD PTR [rbx+0x190],xmm1
      dadeb9:	48 83 a3 a0 01 00 00 	and    QWORD PTR [rbx+0x1a0],0x0
      dadec0:	00 
      dadec1:	6a 48                	push   0x48
      dadec3:	5f                   	pop    rdi
      dadec4:	e8 37 00 a4 00       	call   17edf00 <_Znwm@plt>
      dadec9:	0f 57 c0             	xorps  xmm0,xmm0
      dadecc:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      daded0:	48 8d 0d 89 4d a5 00 	lea    rcx,[rip+0xa54d89]        # 1802c60 <_ZTIN4asio22service_already_existsE@@Base+0x4448>
      daded7:	48 89 08             	mov    QWORD PTR [rax],rcx
      dadeda:	48 89 c1             	mov    rcx,rax
      dadedd:	48 83 c1 18          	add    rcx,0x18
      dadee1:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      dadee5:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      dadee9:	0f 11 40 34          	movups XMMWORD PTR [rax+0x34],xmm0
      dadeed:	48 89 8b a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rcx
      dadef4:	48 89 83 b0 01 00 00 	mov    QWORD PTR [rbx+0x1b0],rax
      dadefb:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
      dadf02:	48 8d 74 24 77       	lea    rsi,[rsp+0x77]
      dadf07:	c6 06 00             	mov    BYTE PTR [rsi],0x0
      dadf0a:	e8 66 03 dc ff       	call   b6e275 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbb215>
      dadf0f:	4d 8d 74 24 30       	lea    r14,[r12+0x30]
      dadf14:	48 8d bb c8 01 00 00 	lea    rdi,[rbx+0x1c8]
      dadf1b:	48 8b b3 98 00 00 00 	mov    rsi,QWORD PTR [rbx+0x98]
      dadf22:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi

### write 0xdc09cb: mov    QWORD PTR [rdi+0x178],rax; FDE=(14420386, 14420457)
- nearby high 0xdc09c4 -> 0x1950858: lea    rax,[rip+0xb8fe8d]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
      dc09a2:	50                   	push   rax
      dc09a3:	48 89 f8             	mov    rax,rdi
      dc09a6:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      dc09aa:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      dc09ae:	8a 00                	mov    al,BYTE PTR [rax]
      dc09b0:	a8 01                	test   al,0x1
      dc09b2:	75 2b                	jne    dc09df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8da65>
      dc09b4:	48 39 b7 38 01 00 00 	cmp    QWORD PTR [rdi+0x138],rsi
      dc09bb:	75 22                	jne    dc09df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8da65>
      dc09bd:	83 a7 70 01 00 00 00 	and    DWORD PTR [rdi+0x170],0x0
      dc09c4:	48 8d 05 8d fe b8 00 	lea    rax,[rip+0xb8fe8d]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
      dc09cb:	48 89 87 78 01 00 00 	mov    QWORD PTR [rdi+0x178],rax
      dc09d2:	8b 02                	mov    eax,DWORD PTR [rdx]
      dc09d4:	89 87 68 01 00 00    	mov    DWORD PTR [rdi+0x168],eax
      dc09da:	e8 11 fe ff ff       	call   dc07f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d876>
      dc09df:	58                   	pop    rax
      dc09e0:	c3                   	ret
      dc09e1:	48 89 c7             	mov    rdi,rax
      dc09e4:	e8 bc 90 cb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

### write 0x1134f8a: cmp    DWORD PTR [rcx+0x178],eax; FDE=(18042756, 18042786)
- nearby high 0x1134f70 -> 0x1852d08: lea    rax,[rip+0x71dd91]        # 1852d08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf3f0>
     1134f84:	8b 06                	mov    eax,DWORD PTR [rsi]
     1134f86:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]
     1134f8a:	39 81 78 01 00 00    	cmp    DWORD PTR [rcx+0x178],eax
     1134f90:	75 01                	jne    1134f93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc3a9>
     1134f92:	c3                   	ret
     1134f93:	89 81 78 01 00 00    	mov    DWORD PTR [rcx+0x178],eax
     1134f99:	48 8b 79 60          	mov    rdi,QWORD PTR [rcx+0x60]
     1134f9d:	e9 ce 50 21 00       	jmp    134a070 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f5f4>

### write 0x1139be9: movups XMMWORD PTR [r13+0x178],xmm0; FDE=(18061674, 18063412)
- nearby high 0x1139bd3 -> 0x1898098: lea    rax,[rip+0x75e4be]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     1139b98:	41 0f 11 85 d8 00 00 	movups XMMWORD PTR [r13+0xd8],xmm0
     1139b9f:	00 
     1139ba0:	41 0f 11 85 18 01 00 	movups XMMWORD PTR [r13+0x118],xmm0
     1139ba7:	00 
     1139ba8:	41 0f 11 85 28 01 00 	movups XMMWORD PTR [r13+0x128],xmm0
     1139baf:	00 
     1139bb0:	41 0f 11 85 38 01 00 	movups XMMWORD PTR [r13+0x138],xmm0
     1139bb7:	00 
     1139bb8:	49 83 a5 48 01 00 00 	and    QWORD PTR [r13+0x148],0x0
     1139bbf:	00 
     1139bc0:	41 c7 85 50 01 00 00 	mov    DWORD PTR [r13+0x150],0x3f800000
     1139bc7:	00 00 80 3f 
     1139bcb:	49 83 a5 60 01 00 00 	and    QWORD PTR [r13+0x160],0x0
     1139bd2:	00 
     1139bd3:	48 8d 05 be e4 75 00 	lea    rax,[rip+0x75e4be]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     1139bda:	49 89 85 58 01 00 00 	mov    QWORD PTR [r13+0x158],rax
     1139be1:	41 0f 11 85 68 01 00 	movups XMMWORD PTR [r13+0x168],xmm0
     1139be8:	00 
     1139be9:	41 0f 11 85 78 01 00 	movups XMMWORD PTR [r13+0x178],xmm0
     1139bf0:	00 
     1139bf1:	48 8d 05 00 5c 30 ff 	lea    rax,[rip+0xffffffffff305c00]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1139bf8:	49 89 85 88 01 00 00 	mov    QWORD PTR [r13+0x188],rax
     1139bff:	49 89 85 90 01 00 00 	mov    QWORD PTR [r13+0x190],rax
     1139c06:	49 89 85 98 01 00 00 	mov    QWORD PTR [r13+0x198],rax
     1139c0d:	49 83 a5 a0 01 00 00 	and    QWORD PTR [r13+0x1a0],0x0
     1139c14:	00 
     1139c15:	4c 89 ef             	mov    rdi,r13
     1139c18:	48 81 c7 a8 01 00 00 	add    rdi,0x1a8
     1139c1f:	e8 f0 39 ae ff       	call   c1d614 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a5b4>
     1139c24:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1139c2b:	00 
     1139c2c:	e8 13 08 00 00       	call   113a444 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30185a>
     1139c31:	4c 8d a4 24 d8 00 00 	lea    r12,[rsp+0xd8]
     1139c38:	00 
     1139c39:	4c 89 e7             	mov    rdi,r12
     1139c3c:	e8 ed b6 58 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1139c41:	4c 89 f7             	mov    rdi,r14
     1139c44:	48 81 c7 c8 04 00 00 	add    rdi,0x4c8
     1139c4b:	48 8d 6c 24 48       	lea    rbp,[rsp+0x48]
     1139c50:	48 83 65 00 00       	and    QWORD PTR [rbp+0x0],0x0
     1139c55:	4c 89 ee             	mov    rsi,r13
     1139c58:	e8 0d 08 00 00       	call   113a46a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x301880>
     1139c5d:	48 89 ef             	mov    rdi,rbp
     1139c60:	e8 d7 04 00 00       	call   113a13c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x301552>
     1139c65:	4c 89 ff             	mov    rdi,r15
     1139c68:	e8 b9 6e 96 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1139c6d:	4d 8b be c8 04 00 00 	mov    r15,QWORD PTR [r14+0x4c8]

### write 0x11a347c: mov    DWORD PTR [r13+0x178],0x3f800000; FDE=(18493836, 18495534)
- nearby high 0x11a344e -> 0x19e9308: mov    eax,DWORD PTR [rip+0x845eb4]        # 19e9308 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f8>
- nearby high 0x11a3457 -> 0x19e9308: mov    DWORD PTR [rip+0x845eab],ecx        # 19e9308 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f8>
     11a342e:	41 0f 29 85 10 01 00 	movaps XMMWORD PTR [r13+0x110],xmm0
     11a3435:	00 
     11a3436:	41 83 a5 40 01 00 00 	and    DWORD PTR [r13+0x140],0x0
     11a343d:	00 
     11a343e:	41 0f 29 85 20 01 00 	movaps XMMWORD PTR [r13+0x120],xmm0
     11a3445:	00 
     11a3446:	41 0f 29 85 30 01 00 	movaps XMMWORD PTR [r13+0x130],xmm0
     11a344d:	00 
     11a344e:	8b 05 b4 5e 84 00    	mov    eax,DWORD PTR [rip+0x845eb4]        # 19e9308 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f8>
     11a3454:	8d 48 01             	lea    ecx,[rax+0x1]
     11a3457:	89 0d ab 5e 84 00    	mov    DWORD PTR [rip+0x845eab],ecx        # 19e9308 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x38f8>
     11a345d:	41 89 85 50 01 00 00 	mov    DWORD PTR [r13+0x150],eax
     11a3464:	41 0f 11 85 54 01 00 	movups XMMWORD PTR [r13+0x154],xmm0
     11a346b:	00 
     11a346c:	41 0f 11 85 64 01 00 	movups XMMWORD PTR [r13+0x164],xmm0
     11a3473:	00 
     11a3474:	41 83 a5 74 01 00 00 	and    DWORD PTR [r13+0x174],0x0
     11a347b:	00 
     11a347c:	41 c7 85 78 01 00 00 	mov    DWORD PTR [r13+0x178],0x3f800000
     11a3483:	00 00 80 3f 
     11a3487:	41 0f 29 85 80 01 00 	movaps XMMWORD PTR [r13+0x180],xmm0
     11a348e:	00 
     11a348f:	49 83 a5 90 01 00 00 	and    QWORD PTR [r13+0x190],0x0
     11a3496:	00 
     11a3497:	e9 46 01 00 00       	jmp    11a35e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a9f8>
     11a349c:	e8 4f b9 64 00       	call   17eedf0 <_ZNSt6__ndk116generic_categoryEv@plt>
     11a34a1:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     11a34a6:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
     11a34ac:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     11a34b0:	4c 89 f7             	mov    rdi,r14
     11a34b3:	e8 aa 09 00 00       	call   11a3e62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b278>
     11a34b8:	48 89 df             	mov    rdi,rbx
     11a34bb:	e8 e2 09 00 00       	call   11a3ea2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36b2b8>
     11a34c0:	e9 55 02 00 00       	jmp    11a371a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36ab30>
     11a34c5:	31 c0                	xor    eax,eax
     11a34c7:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
     11a34ce:	00 
     11a34cf:	41 88 45 c8          	mov    BYTE PTR [r13-0x38],al
     11a34d3:	0f 57 c0             	xorps  xmm0,xmm0
     11a34d6:	41 0f 29 45 a0       	movaps XMMWORD PTR [r13-0x60],xmm0
     11a34db:	41 0f 29 45 b0       	movaps XMMWORD PTR [r13-0x50],xmm0
     11a34e0:	41 88 45 c0          	mov    BYTE PTR [r13-0x40],al
     11a34e4:	41 0f 29 45 d0       	movaps XMMWORD PTR [r13-0x30],xmm0
     11a34e9:	41 0f 29 45 e0       	movaps XMMWORD PTR [r13-0x20],xmm0
     11a34ee:	41 0f 11 45 e9       	movups XMMWORD PTR [r13-0x17],xmm0
     11a34f3:	4c 89 ef             	mov    rdi,r13
     11a34f6:	4c 89 f6             	mov    rsi,r14

### write 0x13d9714: xchg   QWORD PTR [rbx+0x178],r12; FDE=(20813234, 20814987)
- nearby high 0x13d96f9 -> 0x1937ac8: lea    rax,[rip+0x55e3c8]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13d96c2:	a8 01                	test   al,0x1
     13d96c4:	74 41                	je     13d9707 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ec8b>
     13d96c6:	c6 83 a9 00 00 00 00 	mov    BYTE PTR [rbx+0xa9],0x0
     13d96cd:	48 c7 83 ac 00 00 00 	mov    QWORD PTR [rbx+0xac],0x1
     13d96d4:	01 00 00 00 
     13d96d8:	0f 57 c0             	xorps  xmm0,xmm0
     13d96db:	f3 0f 11 44 24 0c    	movss  DWORD PTR [rsp+0xc],xmm0
     13d96e1:	45 31 ed             	xor    r13d,r13d
     13d96e4:	45 31 e4             	xor    r12d,r12d
     13d96e7:	48 89 df             	mov    rdi,rbx
     13d96ea:	e8 9d 05 00 00       	call   13d9c8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21f210>
     13d96ef:	c7 83 d8 17 00 00 0d 	mov    DWORD PTR [rbx+0x17d8],0xd
     13d96f6:	00 00 00 
     13d96f9:	48 8d 05 c8 e3 55 00 	lea    rax,[rip+0x55e3c8]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13d9700:	48 89 83 e0 17 00 00 	mov    QWORD PTR [rbx+0x17e0],rax
     13d9707:	45 31 ed             	xor    r13d,r13d
     13d970a:	4c 87 ab 80 01 00 00 	xchg   QWORD PTR [rbx+0x180],r13
     13d9711:	45 31 e4             	xor    r12d,r12d
     13d9714:	4c 87 a3 78 01 00 00 	xchg   QWORD PTR [rbx+0x178],r12
     13d971b:	b8 00 00 80 bf       	mov    eax,0xbf800000
     13d9720:	87 83 90 01 00 00    	xchg   DWORD PTR [rbx+0x190],eax
     13d9726:	66 0f 6e c0          	movd   xmm0,eax
     13d972a:	66 0f 7e 44 24 0c    	movd   DWORD PTR [rsp+0xc],xmm0
     13d9730:	0f 2e 05 25 50 fb fe 	ucomiss xmm0,DWORD PTR [rip+0xfffffffffefb5025]        # 38e75c <_ZTSSt12bad_any_cast@@Base-0x1a6c>
     13d9737:	75 02                	jne    13d973b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ecbf>
     13d9739:	7b 1c                	jnp    13d9757 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ecdb>
     13d973b:	f3 0f 10 05 55 53 fb 	movss  xmm0,DWORD PTR [rip+0xfffffffffefb5355]        # 38ea98 <_ZTSSt12bad_any_cast@@Base-0x1730>
     13d9742:	fe 
     13d9743:	f3 0f 59 44 24 0c    	mulss  xmm0,DWORD PTR [rsp+0xc]
     13d9749:	f3 0f 2c f0          	cvttss2si esi,xmm0
     13d974d:	48 89 df             	mov    rdi,rbx
     13d9750:	31 d2                	xor    edx,edx
     13d9752:	e8 b9 08 00 00       	call   13da010 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21f594>
     13d9757:	8a 83 49 01 00 00    	mov    al,BYTE PTR [rbx+0x149]
     13d975d:	a8 01                	test   al,0x1
     13d975f:	75 05                	jne    13d9766 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ecea>
     13d9761:	45 31 ed             	xor    r13d,r13d
     13d9764:	eb 5f                	jmp    13d97c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ed49>
     13d9766:	4d 85 ed             	test   r13,r13
     13d9769:	7e 5a                	jle    13d97c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21ed49>
     13d976b:	45 31 f6             	xor    r14d,r14d
     13d976e:	31 c0                	xor    eax,eax
     13d9770:	86 83 49 01 00 00    	xchg   BYTE PTR [rbx+0x149],al
     13d9776:	31 c0                	xor    eax,eax
     13d9778:	86 83 48 01 00 00    	xchg   BYTE PTR [rbx+0x148],al
     13d977e:	b0 01                	mov    al,0x1
     13d9780:	86 83 c4 01 00 00    	xchg   BYTE PTR [rbx+0x1c4],al

### write 0x13e2113: and    WORD PTR [rbx+0x178],0x0; FDE=(20848826, 20849257)
- nearby high 0x13e20db -> 0x186d2c8: lea    rax,[rip+0x48b1e6]        # 186d2c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x299b0>
     13e20be:	41 54                	push   r12
     13e20c0:	53                   	push   rbx
     13e20c1:	48 83 ec 18          	sub    rsp,0x18
     13e20c5:	48 89 fb             	mov    rbx,rdi
     13e20c8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13e20cf:	00 00 
     13e20d1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     13e20d6:	e8 65 1e 00 00       	call   13e3f40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2294c4>
     13e20db:	48 8d 05 e6 b1 48 00 	lea    rax,[rip+0x48b1e6]        # 186d2c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x299b0>
     13e20e2:	48 89 03             	mov    QWORD PTR [rbx],rax
     13e20e5:	c6 83 2b 01 00 00 00 	mov    BYTE PTR [rbx+0x12b],0x0
     13e20ec:	48 83 a3 70 01 00 00 	and    QWORD PTR [rbx+0x170],0x0
     13e20f3:	00 
     13e20f4:	0f 57 c0             	xorps  xmm0,xmm0
     13e20f7:	0f 11 83 30 01 00 00 	movups XMMWORD PTR [rbx+0x130],xmm0
     13e20fe:	0f 11 83 40 01 00 00 	movups XMMWORD PTR [rbx+0x140],xmm0
     13e2105:	0f 11 83 50 01 00 00 	movups XMMWORD PTR [rbx+0x150],xmm0
     13e210c:	0f 11 83 5c 01 00 00 	movups XMMWORD PTR [rbx+0x15c],xmm0
     13e2113:	66 83 a3 78 01 00 00 	and    WORD PTR [rbx+0x178],0x0
     13e211a:	00 
     13e211b:	48 83 a3 80 01 00 00 	and    QWORD PTR [rbx+0x180],0x0
     13e2122:	00 
     13e2123:	4c 8d b3 88 01 00 00 	lea    r14,[rbx+0x188]
     13e212a:	4c 89 f7             	mov    rdi,r14
     13e212d:	e8 7e d1 40 00       	call   17ef2b0 <_ZNSt6__ndk119__shared_mutex_baseC1Ev@plt>
     13e2132:	48 8d 05 d7 b2 48 00 	lea    rax,[rip+0x48b2d7]        # 186d410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x29af8>
     13e2139:	48 89 83 18 02 00 00 	mov    QWORD PTR [rbx+0x218],rax
     13e2140:	48 8d 3d 49 c4 60 00 	lea    rdi,[rip+0x60c449]        # 19ee590 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51c8>
     13e2147:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     13e214b:	c6 44 24 08 01       	mov    BYTE PTR [rsp+0x8],0x1
     13e2150:	e8 9b bf 40 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     13e2155:	48 8b 05 24 c4 60 00 	mov    rax,QWORD PTR [rip+0x60c424]        # 19ee580 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51b8>
     13e215c:	48 85 c0             	test   rax,rax
     13e215f:	74 27                	je     13e2188 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22770c>
     13e2161:	49 89 c7             	mov    r15,rax
     13e2164:	48 39 58 20          	cmp    QWORD PTR [rax+0x20],rbx
     13e2168:	76 0d                	jbe    13e2177 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2276fb>
     13e216a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     13e216d:	4d 89 fc             	mov    r12,r15
     13e2170:	48 85 c0             	test   rax,rax
     13e2173:	75 ec                	jne    13e2161 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2276e5>
     13e2175:	eb 1b                	jmp    13e2192 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x227716>
     13e2177:	73 63                	jae    13e21dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x227760>
     13e2179:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     13e217d:	48 85 c0             	test   rax,rax
     13e2180:	75 df                	jne    13e2161 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2276e5>
     13e2182:	4d 8d 67 08          	lea    r12,[r15+0x8]

### write 0x13e21de: xchg   BYTE PTR [rbx+0x178],al; FDE=(20848826, 20849257)
- nearby high 0x13e21bb -> 0x19ee578: mov    QWORD PTR [rip+0x60c3b6],rcx        # 19ee578 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51b0>
- nearby high 0x13e21c6 -> 0x19ee580: mov    rdi,QWORD PTR [rip+0x60c3b3]        # 19ee580 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51b8>
- nearby high 0x13e21d5 -> 0x19ee588: inc    QWORD PTR [rip+0x60c3ac]        # 19ee588 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51c0>
     13e2194:	5f                   	pop    rdi
     13e2195:	e8 66 bd 40 00       	call   17edf00 <_Znwm@plt>
     13e219a:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
     13e219e:	0f 57 c0             	xorps  xmm0,xmm0
     13e21a1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     13e21a4:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
     13e21a8:	49 89 04 24          	mov    QWORD PTR [r12],rax
     13e21ac:	48 8b 0d c5 c3 60 00 	mov    rcx,QWORD PTR [rip+0x60c3c5]        # 19ee578 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51b0>
     13e21b3:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
     13e21b6:	48 85 c9             	test   rcx,rcx
     13e21b9:	74 0b                	je     13e21c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22774a>
     13e21bb:	48 89 0d b6 c3 60 00 	mov    QWORD PTR [rip+0x60c3b6],rcx        # 19ee578 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51b0>
     13e21c2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     13e21c6:	48 8b 3d b3 c3 60 00 	mov    rdi,QWORD PTR [rip+0x60c3b3]        # 19ee580 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51b8>
     13e21cd:	48 89 c6             	mov    rsi,rax
     13e21d0:	e8 49 7e 6c ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
     13e21d5:	48 ff 05 ac c3 60 00 	inc    QWORD PTR [rip+0x60c3ac]        # 19ee588 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51c0>
     13e21dc:	31 c0                	xor    eax,eax
     13e21de:	86 83 78 01 00 00    	xchg   BYTE PTR [rbx+0x178],al
     13e21e4:	e8 09 22 00 00       	call   13e43f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x229976>
     13e21e9:	48 8d 05 c8 c3 60 00 	lea    rax,[rip+0x60c3c8]        # 19ee5b8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51f0>
     13e21f0:	48 89 05 79 c3 60 00 	mov    QWORD PTR [rip+0x60c379],rax        # 19ee570 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x51a8>
     13e21f7:	48 89 e7             	mov    rdi,rsp
     13e21fa:	e8 31 9c 6c ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     13e21ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13e2206:	00 00 
     13e2208:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     13e220d:	75 55                	jne    13e2264 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2277e8>
     13e220f:	48 83 c4 18          	add    rsp,0x18
     13e2213:	5b                   	pop    rbx
     13e2214:	41 5c                	pop    r12
     13e2216:	41 5e                	pop    r14
     13e2218:	41 5f                	pop    r15
     13e221a:	c3                   	ret
     13e221b:	49 89 c7             	mov    r15,rax
     13e221e:	48 89 e7             	mov    rdi,rsp
     13e2221:	e8 0a 9c 6c ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     13e2226:	eb 03                	jmp    13e222b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2277af>
     13e2228:	49 89 c7             	mov    r15,rax
     13e222b:	4c 89 f7             	mov    rdi,r14
     13e222e:	e8 37 00 00 00       	call   13e226a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2277ee>
     13e2233:	eb 03                	jmp    13e2238 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2277bc>
     13e2235:	49 89 c7             	mov    r15,rax
     13e2238:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
     13e223f:	e8 0c be 40 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
     13e2244:	48 89 df             	mov    rdi,rbx
     13e2247:	e8 50 1d 00 00       	call   13e3f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x229520>

### write 0x14404d9: and    QWORD PTR [rbx+0x178],0x0; FDE=(21234830, 21235107)
- nearby high 0x14404bc -> 0x18981b8: lea    r14,[rip+0x457cf5]        # 18981b8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x50f8>
     1440490:	53                   	push   rbx
     1440491:	50                   	push   rax
     1440492:	48 89 fb             	mov    rbx,rdi
     1440495:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
     144049a:	48 8d 05 57 7f 45 00 	lea    rax,[rip+0x457f57]        # 18983f8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5338>
     14404a1:	48 89 07             	mov    QWORD PTR [rdi],rax
     14404a4:	0f 57 c0             	xorps  xmm0,xmm0
     14404a7:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     14404ab:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0
     14404af:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
     14404b3:	0f 11 47 40          	movups XMMWORD PTR [rdi+0x40],xmm0
     14404b7:	48 83 67 58 00       	and    QWORD PTR [rdi+0x58],0x0
     14404bc:	4c 8d 35 f5 7c 45 00 	lea    r14,[rip+0x457cf5]        # 18981b8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x50f8>
     14404c3:	4c 89 77 50          	mov    QWORD PTR [rdi+0x50],r14
     14404c7:	48 83 c7 78          	add    rdi,0x78
     14404cb:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
     14404cf:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
     14404d4:	e8 e9 35 82 ff       	call   c63ac2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b0a62>
     14404d9:	48 83 a3 78 01 00 00 	and    QWORD PTR [rbx+0x178],0x0
     14404e0:	00 
     14404e1:	48 8d 05 80 7a 45 00 	lea    rax,[rip+0x457a80]        # 1897f68 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4ea8>
     14404e8:	48 89 83 70 01 00 00 	mov    QWORD PTR [rbx+0x170],rax
     14404ef:	0f 57 c0             	xorps  xmm0,xmm0
     14404f2:	0f 11 83 80 01 00 00 	movups XMMWORD PTR [rbx+0x180],xmm0
     14404f9:	0f 11 83 90 01 00 00 	movups XMMWORD PTR [rbx+0x190],xmm0
     1440500:	48 8d 05 f1 f2 ff fe 	lea    rax,[rip+0xfffffffffefff2f1]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1440507:	48 89 83 a0 01 00 00 	mov    QWORD PTR [rbx+0x1a0],rax
     144050e:	31 c0                	xor    eax,eax
     1440510:	88 83 c8 01 00 00    	mov    BYTE PTR [rbx+0x1c8],al
     1440516:	88 83 d0 01 00 00    	mov    BYTE PTR [rbx+0x1d0],al
     144051c:	88 83 00 02 00 00    	mov    BYTE PTR [rbx+0x200],al
     1440522:	88 83 08 02 00 00    	mov    BYTE PTR [rbx+0x208],al
     1440528:	88 83 20 02 00 00    	mov    BYTE PTR [rbx+0x220],al
     144052e:	88 83 28 02 00 00    	mov    BYTE PTR [rbx+0x228],al
     1440534:	88 83 40 02 00 00    	mov    BYTE PTR [rbx+0x240],al
     144053a:	88 83 48 02 00 00    	mov    BYTE PTR [rbx+0x248],al
     1440540:	88 83 60 02 00 00    	mov    BYTE PTR [rbx+0x260],al
     1440546:	48 83 a3 70 02 00 00 	and    QWORD PTR [rbx+0x270],0x0
     144054d:	00 
     144054e:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
     1440555:	88 83 b8 01 00 00    	mov    BYTE PTR [rbx+0x1b8],al
     144055b:	4c 89 b3 68 02 00 00 	mov    QWORD PTR [rbx+0x268],r14
     1440562:	88 83 b0 02 00 00    	mov    BYTE PTR [rbx+0x2b0],al
     1440568:	88 83 b8 02 00 00    	mov    BYTE PTR [rbx+0x2b8],al
     144056e:	88 83 d0 02 00 00    	mov    BYTE PTR [rbx+0x2d0],al
     1440574:	88 83 d8 02 00 00    	mov    BYTE PTR [rbx+0x2d8],al
     144057a:	88 83 f0 02 00 00    	mov    BYTE PTR [rbx+0x2f0],al

### write 0x14419fc: cmp    BYTE PTR [rbx+0x178],0x0; FDE=(21240194, 21240441)
- nearby high 0x14419e9 -> 0x1981b68: lea    rsi,[rip+0x540178]        # 1981b68 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4a7b0>
     14419b1:	e8 80 9e 63 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14419b6:	48 83 fa 10          	cmp    rdx,0x10
     14419ba:	75 1f                	jne    14419db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286f5f>
     14419bc:	48 85 c0             	test   rax,rax
     14419bf:	74 1a                	je     14419db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286f5f>
     14419c1:	80 bb 78 01 00 00 00 	cmp    BYTE PTR [rbx+0x178],0x0
     14419c8:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     14419cb:	0f 11 83 68 01 00 00 	movups XMMWORD PTR [rbx+0x168],xmm0
     14419d2:	75 07                	jne    14419db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286f5f>
     14419d4:	c6 83 78 01 00 00 01 	mov    BYTE PTR [rbx+0x178],0x1
     14419db:	41 f6 46 10 08       	test   BYTE PTR [r14+0x10],0x8
     14419e0:	74 1a                	je     14419fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286f80>
     14419e2:	49 8b 46 48          	mov    rax,QWORD PTR [r14+0x48]
     14419e6:	48 85 c0             	test   rax,rax
     14419e9:	48 8d 35 78 01 54 00 	lea    rsi,[rip+0x540178]        # 1981b68 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4a7b0>
     14419f0:	48 0f 45 f0          	cmovne rsi,rax
     14419f4:	48 89 df             	mov    rdi,rbx
     14419f7:	e8 64 d0 30 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     14419fc:	80 bb 78 01 00 00 00 	cmp    BYTE PTR [rbx+0x178],0x0
     1441a03:	74 10                	je     1441a15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286f99>
     1441a05:	48 8b 83 70 01 00 00 	mov    rax,QWORD PTR [rbx+0x170]
     1441a0c:	48 8b 8b 68 01 00 00 	mov    rcx,QWORD PTR [rbx+0x168]
     1441a13:	eb 04                	jmp    1441a19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286f9d>
     1441a15:	31 c0                	xor    eax,eax
     1441a17:	31 c9                	xor    ecx,ecx
     1441a19:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     1441a1e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     1441a21:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     1441a25:	4c 8d 74 24 1f       	lea    r14,[rsp+0x1f]
     1441a2a:	4c 89 f7             	mov    rdi,r14
     1441a2d:	e8 ee 28 75 ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
     1441a32:	8b 83 40 01 00 00    	mov    eax,DWORD PTR [rbx+0x140]
     1441a38:	89 04 24             	mov    DWORD PTR [rsp],eax
     1441a3b:	48 8d 0d eb fd f2 fe 	lea    rcx,[rip+0xfffffffffef2fdeb]        # 37182d <_ZTSSt12bad_any_cast@@Base-0x1e99b>
     1441a42:	48 8d 35 33 05 01 ff 	lea    rsi,[rip+0xffffffffff010533]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1441a49:	6a 04                	push   0x4
     1441a4b:	5f                   	pop    rdi
     1441a4c:	6a 68                	push   0x68
     1441a4e:	5a                   	pop    rdx
     1441a4f:	49 89 f0             	mov    r8,rsi
     1441a52:	4d 89 f1             	mov    r9,r14
     1441a55:	31 c0                	xor    eax,eax
     1441a57:	e8 76 4e 39 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     1441a5c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1441a63:	00 00 
     1441a65:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     1441a6a:	75 08                	jne    1441a74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x286ff8>

### write 0x15636c1: call   QWORD PTR [rax+0x178]; FDE=(22427160, 22427505)
- nearby high 0x15636a4 -> 0x1880ee0: lea    rax,[rip+0x31d835]        # 1880ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3d5c8>
     1563671:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
     1563677:	48 8d bb 48 01 00 00 	lea    rdi,[rbx+0x148]
     156367e:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1563683:	4c 89 fe             	mov    rsi,r15
     1563686:	e8 67 65 27 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     156368b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     156368f:	e8 f2 ad 53 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1563694:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1563699:	4c 89 ff             	mov    rdi,r15
     156369c:	e8 47 71 27 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     15636a1:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     15636a4:	48 8d 05 35 d8 31 00 	lea    rax,[rip+0x31d835]        # 1880ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3d5c8>
     15636ab:	49 89 07             	mov    QWORD PTR [r15],rax
     15636ae:	49 89 5f 08          	mov    QWORD PTR [r15+0x8],rbx
     15636b2:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
     15636b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15636b9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     15636be:	4c 89 fa             	mov    rdx,r15
     15636c1:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
     15636c7:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
     15636ce:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     15636d3:	4c 89 fe             	mov    rsi,r15
     15636d6:	e8 17 65 27 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     15636db:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     15636df:	e8 a2 ad 53 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15636e4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     15636e9:	e8 7c 68 51 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     15636ee:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     15636f2:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     15636f6:	48 85 c0             	test   rax,rax
     15636f9:	74 05                	je     1563700 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8c84>
     15636fb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1563700:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1563704:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     1563708:	e8 79 ad 53 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     156370d:	48 81 c3 d0 00 00 00 	add    rbx,0xd0
     1563714:	48 89 df             	mov    rdi,rbx
     1563717:	e8 88 39 96 ff       	call   ec70a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e4ba>
     156371c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1563723:	00 00 
     1563725:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     156372a:	75 40                	jne    156376c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8cf0>
     156372c:	48 83 c4 68          	add    rsp,0x68
     1563730:	5b                   	pop    rbx
     1563731:	41 5c                	pop    r12
     1563733:	41 5e                	pop    r14
     1563735:	41 5f                	pop    r15

### write 0x161028c: mov    BYTE PTR [rbx+0x178],al; FDE=(23134352, 23135438)
- nearby high 0x161026a -> 0x1800e20: lea    rax,[rip+0x1f0baf]        # 1800e20 <_ZTIN4asio22service_already_existsE@@Base+0x2608>
     1610233:	e8 58 a0 46 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1610238:	c6 83 30 01 00 00 00 	mov    BYTE PTR [rbx+0x130],0x0
     161023f:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
     1610246:	48 83 bc 24 d0 00 00 	cmp    QWORD PTR [rsp+0xd0],0x0
     161024d:	00 00 
     161024f:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
     1610254:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     1610259:	74 0f                	je     161026a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d8>
     161025b:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     1610262:	00 
     1610263:	e8 28 a0 46 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1610268:	eb 15                	jmp    161027f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3ed>
     161026a:	48 8d 05 af 0b 1f 00 	lea    rax,[rip+0x1f0baf]        # 1800e20 <_ZTIN4asio22service_already_existsE@@Base+0x2608>
     1610271:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
     1610278:	48 89 bb 60 01 00 00 	mov    QWORD PTR [rbx+0x160],rdi
     161027f:	48 c7 83 70 01 00 00 	mov    QWORD PTR [rbx+0x170],0x2faf080
     1610286:	80 f0 fa 02 
     161028a:	31 c0                	xor    eax,eax
     161028c:	88 83 78 01 00 00    	mov    BYTE PTR [rbx+0x178],al
     1610292:	48 8d ab 80 01 00 00 	lea    rbp,[rbx+0x180]
     1610299:	88 83 80 01 00 00    	mov    BYTE PTR [rbx+0x180],al
     161029f:	88 83 a0 01 00 00    	mov    BYTE PTR [rbx+0x1a0],al
     16102a5:	38 84 24 a8 00 00 00 	cmp    BYTE PTR [rsp+0xa8],al
     16102ac:	74 17                	je     16102c5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb433>
     16102ae:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     16102b5:	00 
     16102b6:	48 89 ef             	mov    rdi,rbp
     16102b9:	e8 ca ed c3 ff       	call   124f088 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9460c>
     16102be:	c6 83 a0 01 00 00 01 	mov    BYTE PTR [rbx+0x1a0],0x1
     16102c5:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
     16102ca:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     16102cf:	4c 89 f6             	mov    rsi,r14
     16102d2:	e8 69 dc 1d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     16102d7:	4c 8d 6c 24 58       	lea    r13,[rsp+0x58]
     16102dc:	48 8d 15 06 07 d3 fe 	lea    rdx,[rip+0xfffffffffed30706]        # 3409e9 <_ZTSSt12bad_any_cast@@Base-0x4f7df>
     16102e3:	4c 89 ef             	mov    rdi,r13
     16102e6:	4c 89 f6             	mov    rsi,r14
     16102e9:	e8 d7 54 4e ff       	call   af57c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x42765>
     16102ee:	6a 48                	push   0x48
     16102f0:	5f                   	pop    rdi
     16102f1:	e8 0a dc 1d 00       	call   17edf00 <_Znwm@plt>
     16102f6:	0f 57 c9             	xorps  xmm1,xmm1
     16102f9:	0f 11 48 08          	movups XMMWORD PTR [rax+0x8],xmm1
     16102fd:	48 8d 0d 6c bd 27 00 	lea    rcx,[rip+0x27bd6c]        # 188c070 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4d48>
     1610304:	48 89 08             	mov    QWORD PTR [rax],rcx
     1610307:	48 89 c1             	mov    rcx,rax
     161030a:	48 83 c1 18          	add    rcx,0x18

### write 0x1652444: movups XMMWORD PTR [rdi+0x178],xmm0; FDE=(23405314, 23405708)
- nearby high 0x165240c -> 0x19707c0: lea    rcx,[rip+0x31e3ad]        # 19707c0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x39408>
- nearby high 0x1652436 -> 0x1970860: lea    rcx,[rip+0x31e423]        # 1970860 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x394a8>
     16523c6:	0f 11 8f e8 00 00 00 	movups XMMWORD PTR [rdi+0xe8],xmm1
     16523cd:	48 89 87 f8 00 00 00 	mov    QWORD PTR [rdi+0xf8],rax
     16523d4:	48 89 b7 00 01 00 00 	mov    QWORD PTR [rdi+0x100],rsi
     16523db:	48 89 b7 08 01 00 00 	mov    QWORD PTR [rdi+0x108],rsi
     16523e2:	48 8d 0d ff e3 31 00 	lea    rcx,[rip+0x31e3ff]        # 19707e8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x39430>
     16523e9:	48 89 8f 10 01 00 00 	mov    QWORD PTR [rdi+0x110],rcx
     16523f0:	0f 11 8f 18 01 00 00 	movups XMMWORD PTR [rdi+0x118],xmm1
     16523f7:	48 89 87 28 01 00 00 	mov    QWORD PTR [rdi+0x128],rax
     16523fe:	48 89 b7 30 01 00 00 	mov    QWORD PTR [rdi+0x130],rsi
     1652405:	48 89 b7 38 01 00 00 	mov    QWORD PTR [rdi+0x138],rsi
     165240c:	48 8d 0d ad e3 31 00 	lea    rcx,[rip+0x31e3ad]        # 19707c0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x39408>
     1652413:	48 89 8f 40 01 00 00 	mov    QWORD PTR [rdi+0x140],rcx
     165241a:	0f 11 87 48 01 00 00 	movups XMMWORD PTR [rdi+0x148],xmm0
     1652421:	48 89 87 58 01 00 00 	mov    QWORD PTR [rdi+0x158],rax
     1652428:	48 89 b7 60 01 00 00 	mov    QWORD PTR [rdi+0x160],rsi
     165242f:	48 89 b7 68 01 00 00 	mov    QWORD PTR [rdi+0x168],rsi
     1652436:	48 8d 0d 23 e4 31 00 	lea    rcx,[rip+0x31e423]        # 1970860 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x394a8>
     165243d:	48 89 8f 70 01 00 00 	mov    QWORD PTR [rdi+0x170],rcx
     1652444:	0f 11 87 78 01 00 00 	movups XMMWORD PTR [rdi+0x178],xmm0
     165244b:	48 89 87 88 01 00 00 	mov    QWORD PTR [rdi+0x188],rax
     1652452:	48 89 b7 90 01 00 00 	mov    QWORD PTR [rdi+0x190],rsi
     1652459:	48 8d 05 98 d3 de fe 	lea    rax,[rip+0xfffffffffeded398]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1652460:	48 89 87 98 01 00 00 	mov    QWORD PTR [rdi+0x198],rax
     1652467:	48 89 87 a0 01 00 00 	mov    QWORD PTR [rdi+0x1a0],rax
     165246e:	48 89 87 a8 01 00 00 	mov    QWORD PTR [rdi+0x1a8],rax
     1652475:	48 89 87 b0 01 00 00 	mov    QWORD PTR [rdi+0x1b0],rax
     165247c:	83 a7 c0 01 00 00 00 	and    DWORD PTR [rdi+0x1c0],0x0
     1652483:	48 83 a7 b8 01 00 00 	and    QWORD PTR [rdi+0x1b8],0x0
     165248a:	00 
     165248b:	c3                   	ret

### write 0x1707227: mov    DWORD PTR [rdi+0x178],ecx; FDE=(24140998, 24149212)
- nearby high 0x17071fd -> 0x19d9990: lea    rax,[rip+0x2d278c]        # 19d9990 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa25d8>
     17071d7:	49 63 c5             	movsxd rax,r13d
     17071da:	48 83 c3 10          	add    rbx,0x10
     17071de:	49 39 c6             	cmp    r14,rax
     17071e1:	0f 8c 6f ff ff ff    	jl     1707156 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb2c2>
     17071e7:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
     17071ec:	4c 8b b4 24 80 00 00 	mov    r14,QWORD PTR [rsp+0x80]
     17071f3:	00 
     17071f4:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]
     17071f9:	4d 89 66 28          	mov    QWORD PTR [r14+0x28],r12
     17071fd:	48 8d 05 8c 27 2d 00 	lea    rax,[rip+0x2d278c]        # 19d9990 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0xa25d8>
     1707204:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     1707208:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     170720c:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1707213:	00 
     1707214:	e8 0f 45 37 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1707219:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     170721e:	8b 87 78 01 00 00    	mov    eax,DWORD PTR [rdi+0x178]
     1707224:	8d 48 ff             	lea    ecx,[rax-0x1]
     1707227:	89 8f 78 01 00 00    	mov    DWORD PTR [rdi+0x178],ecx
     170722d:	83 f8 02             	cmp    eax,0x2
     1707230:	7d 47                	jge    1707279 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb3e5>
     1707232:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1707239:	00 
     170723a:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     170723e:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
     1707242:	48 89 d6             	mov    rsi,rdx
     1707245:	48 f7 d6             	not    rsi
     1707248:	48 01 c6             	add    rsi,rax
     170724b:	4c 8d 0d 00 16 c6 fe 	lea    r9,[rip+0xfffffffffec61600]        # 368852 <_ZTSSt12bad_any_cast@@Base-0x27976>
     1707252:	6a 0b                	push   0xb
     1707254:	41 58                	pop    r8
     1707256:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     170725b:	e8 a4 62 ff ff       	call   16fd504 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1670>
     1707260:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1707267:	00 
     1707268:	48 83 60 50 00       	and    QWORD PTR [rax+0x50],0x0
     170726d:	83 a0 88 00 00 00 00 	and    DWORD PTR [rax+0x88],0x0
     1707274:	e9 ac 07 00 00       	jmp    1707a25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbbb91>
     1707279:	4c 8b 74 24 30       	mov    r14,QWORD PTR [rsp+0x30]
     170727e:	41 8b 76 38          	mov    esi,DWORD PTR [r14+0x38]
     1707282:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
     1707289:	00 
     170728a:	89 b0 88 00 00 00    	mov    DWORD PTR [rax+0x88],esi
     1707290:	4c 89 ef             	mov    rdi,r13
     1707293:	e8 68 e9 ff ff       	call   1705c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb9d6c>
     1707298:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
     170729f:	00 

## Reads of +0x178 used as pointer/table
### read 0xad6f50: mov    eax,DWORD PTR [r15+0x178]; FDE=(11364756, 11367180)
      ad6f50:	41 8b 87 78 01 00 00 	mov    eax,DWORD PTR [r15+0x178]
      ad6f57:	b9 ff ff ff ff       	mov    ecx,0xffffffff
      ad6f5c:	48 39 c8             	cmp    rax,rcx
      ad6f5f:	6a ff                	push   0xffffffffffffffff
      ad6f61:	59                   	pop    rcx
      ad6f62:	48 0f 45 c8          	cmovne rcx,rax
      ad6f66:	48 8d 05 3b a1 d2 00 	lea    rax,[rip+0xd2a13b]        # 18010a8 <_ZTIN4asio22service_already_existsE@@Base+0x2890>
      ad6f6d:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
      ad6f70:	41 80 bf 18 02 00 00 	cmp    BYTE PTR [r15+0x218],0x0
      ad6f77:	00 
      ad6f78:	0f 84 3c 01 00 00    	je     ad70ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2405a>
      ad6f7e:	41 80 4c 24 10 08    	or     BYTE PTR [r12+0x10],0x8
      ad6f84:	49 8b 6c 24 30       	mov    rbp,QWORD PTR [r12+0x30]
      ad6f89:	48 85 ed             	test   rbp,rbp
      ad6f8c:	75 1c                	jne    ad6faa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23f4a>

### read 0xb632e1: mov    rax,QWORD PTR [rax+0x178]; FDE=(11940554, 11940596)
      b632e1:	48 8b 80 78 01 00 00 	mov    rax,QWORD PTR [rax+0x178]
      b632e8:	48 85 c0             	test   rax,rax
      b632eb:	74 02                	je     b632ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb028f>
      b632ed:	5b                   	pop    rbx
      b632ee:	c3                   	ret
      b632ef:	e8 cb 6c f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b632f4:	53                   	push   rbx
      b632f5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      b632f8:	48 89 37             	mov    QWORD PTR [rdi],rsi
      b632fb:	48 85 db             	test   rbx,rbx
      b632fe:	74 13                	je     b63313 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02b3>
      b63300:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b63303:	48 89 df             	mov    rdi,rbx
      b63306:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b63309:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### read 0xb91e8d: mov    rbp,QWORD PTR [r15+0x178]; FDE=(12131922, 12132217)
      b91e8d:	49 8b af 78 01 00 00 	mov    rbp,QWORD PTR [r15+0x178]
      b91e94:	6a 40                	push   0x40
      b91e96:	5f                   	pop    rdi
      b91e97:	e8 64 c0 c5 00       	call   17edf00 <_Znwm@plt>
      b91e9c:	49 89 c7             	mov    r15,rax
      b91e9f:	48 89 c3             	mov    rbx,rax
      b91ea2:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      b91ea6:	48 8d 05 fb c6 c7 00 	lea    rax,[rip+0xc7c6fb]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
      b91ead:	49 89 07             	mov    QWORD PTR [r15],rax
      b91eb0:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      b91eb4:	4c 89 ef             	mov    rdi,r13
      b91eb7:	ff 50 38             	call   QWORD PTR [rax+0x38]
      b91eba:	49 89 c5             	mov    r13,rax
      b91ebd:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b91ec1:	4c 89 e7             	mov    rdi,r12

### read 0xbc7ed9: mov    rbp,QWORD PTR [r15+0x178]; FDE=(12353182, 12353477)
      bc7ed9:	49 8b af 78 01 00 00 	mov    rbp,QWORD PTR [r15+0x178]
      bc7ee0:	6a 40                	push   0x40
      bc7ee2:	5f                   	pop    rdi
      bc7ee3:	e8 18 60 c2 00       	call   17edf00 <_Znwm@plt>
      bc7ee8:	49 89 c7             	mov    r15,rax
      bc7eeb:	48 89 c3             	mov    rbx,rax
      bc7eee:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      bc7ef2:	48 8d 05 af 66 c4 00 	lea    rax,[rip+0xc466af]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
      bc7ef9:	49 89 07             	mov    QWORD PTR [r15],rax
      bc7efc:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      bc7f00:	4c 89 ef             	mov    rdi,r13
      bc7f03:	ff 50 38             	call   QWORD PTR [rax+0x38]
      bc7f06:	49 89 c5             	mov    r13,rax
      bc7f09:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      bc7f0d:	4c 89 e7             	mov    rdi,r12

### read 0xbc888d: mov    r14,QWORD PTR [r14+0x178]; FDE=(12355656, 12356998)
      bc888d:	4d 8b b6 78 01 00 00 	mov    r14,QWORD PTR [r14+0x178]
      bc8894:	6a 40                	push   0x40
      bc8896:	5f                   	pop    rdi
      bc8897:	e8 64 56 c2 00       	call   17edf00 <_Znwm@plt>
      bc889c:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      bc88a0:	48 8d 0d 01 5d c4 00 	lea    rcx,[rip+0xc45d01]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
      bc88a7:	48 89 08             	mov    QWORD PTR [rax],rcx
      bc88aa:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
      bc88af:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      bc88b4:	48 83 c0 10          	add    rax,0x10
      bc88b8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      bc88bd:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      bc88c1:	4c 89 e7             	mov    rdi,r12
      bc88c4:	ff 50 28             	call   QWORD PTR [rax+0x28]
      bc88c7:	48 83 78 28 00       	cmp    QWORD PTR [rax+0x28],0x0

### read 0xbd8d54: mov    rbx,QWORD PTR [rbx+0x178]; FDE=(12422424, 12423755)
      bd8d54:	48 8b 9b 78 01 00 00 	mov    rbx,QWORD PTR [rbx+0x178]
      bd8d5b:	6a 40                	push   0x40
      bd8d5d:	5f                   	pop    rdi
      bd8d5e:	e8 9d 51 c1 00       	call   17edf00 <_Znwm@plt>
      bd8d63:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      bd8d67:	48 8d 0d 3a 58 c3 00 	lea    rcx,[rip+0xc3583a]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
      bd8d6e:	48 89 08             	mov    QWORD PTR [rax],rcx
      bd8d71:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
      bd8d76:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      bd8d7b:	48 83 c0 10          	add    rax,0x10
      bd8d7f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      bd8d84:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      bd8d88:	4c 89 e7             	mov    rdi,r12
      bd8d8b:	ff 50 28             	call   QWORD PTR [rax+0x28]
      bd8d8e:	48 83 78 40 00       	cmp    QWORD PTR [rax+0x40],0x0

### read 0xbf5a5d: mov    rbp,QWORD PTR [rbx+0x178]; FDE=(12540464, 12540886)
      bf5a5d:	48 8b ab 78 01 00 00 	mov    rbp,QWORD PTR [rbx+0x178]
      bf5a64:	6a 40                	push   0x40
      bf5a66:	5f                   	pop    rdi
      bf5a67:	e8 94 84 bf 00       	call   17edf00 <_Znwm@plt>
      bf5a6c:	48 89 c3             	mov    rbx,rax
      bf5a6f:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      bf5a73:	48 8d 05 2e 8b c1 00 	lea    rax,[rip+0xc18b2e]        # 180e5a8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4268>
      bf5a7a:	48 89 03             	mov    QWORD PTR [rbx],rax
      bf5a7d:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
      bf5a82:	49 89 de             	mov    r14,rbx
      bf5a85:	49 83 c6 10          	add    r14,0x10
      bf5a89:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      bf5a8d:	4c 89 e7             	mov    rdi,r12
      bf5a90:	ff 50 28             	call   QWORD PTR [rax+0x28]
      bf5a93:	48 83 78 08 00       	cmp    QWORD PTR [rax+0x8],0x0

### read 0xc164a2: mov    rax,QWORD PTR [r14+0x178]; FDE=(12671822, 12676442)
      c164a2:	49 8b 86 78 01 00 00 	mov    rax,QWORD PTR [r14+0x178]
      c164a9:	49 89 be 78 01 00 00 	mov    QWORD PTR [r14+0x178],rdi
      c164b0:	48 85 c0             	test   rax,rax
      c164b3:	74 10                	je     c164c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x163465>
      c164b5:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      c164b8:	48 89 c7             	mov    rdi,rax
      c164bb:	ff 51 08             	call   QWORD PTR [rcx+0x8]
      c164be:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
      c164c5:	48 8d 8c 24 c0 01 00 	lea    rcx,[rsp+0x1c0]
      c164cc:	00 
      c164cd:	4c 89 31             	mov    QWORD PTR [rcx],r14
      c164d0:	48 8d 05 8d 5f e6 ff 	lea    rax,[rip+0xffffffffffe65f8d]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      c164d7:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
      c164db:	48 8d 05 46 12 00 00 	lea    rax,[rip+0x1246]        # c17728 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1646c8>
      c164e2:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax

### read 0xc164be: mov    rdi,QWORD PTR [r14+0x178]; FDE=(12671822, 12676442)
      c164be:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
      c164c5:	48 8d 8c 24 c0 01 00 	lea    rcx,[rsp+0x1c0]
      c164cc:	00 
      c164cd:	4c 89 31             	mov    QWORD PTR [rcx],r14
      c164d0:	48 8d 05 8d 5f e6 ff 	lea    rax,[rip+0xffffffffffe65f8d]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      c164d7:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
      c164db:	48 8d 05 46 12 00 00 	lea    rax,[rip+0x1246]        # c17728 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1646c8>
      c164e2:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
      c164e6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c164e9:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
      c164f0:	00 
      c164f1:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      c164f6:	ff 50 18             	call   QWORD PTR [rax+0x18]
      c164f9:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      c16500:	00 

### read 0xc1c4ce: lea    rdi,[rbx+0x178]; FDE=(12698494, 12699574)
      c1c4ce:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
      c1c4d5:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
      c1c4da:	e8 17 d5 bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c1c4df:	48 8d bb 88 01 00 00 	lea    rdi,[rbx+0x188]
      c1c4e6:	49 8b 76 40          	mov    rsi,QWORD PTR [r14+0x40]
      c1c4ea:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      c1c4ed:	31 d2                	xor    edx,edx
      c1c4ef:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
      c1c4f4:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      c1c4f9:	4c 89 64 24 28       	mov    QWORD PTR [rsp+0x28],r12
      c1c4fe:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13
      c1c503:	ff 50 18             	call   QWORD PTR [rax+0x18]
      c1c506:	4c 8d b3 98 01 00 00 	lea    r14,[rbx+0x198]
      c1c50d:	4c 89 f7             	mov    rdi,r14
      c1c510:	e8 e1 d4 bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>

### read 0xc7c94d: mov    r12,QWORD PTR [r12+0x178]; FDE=(13093094, 13093692)
      c7c94d:	4d 8b a4 24 78 01 00 	mov    r12,QWORD PTR [r12+0x178]
      c7c954:	00 
      c7c955:	6a 50                	push   0x50
      c7c957:	5f                   	pop    rdi
      c7c958:	e8 a3 15 b7 00       	call   17edf00 <_Znwm@plt>
      c7c95d:	48 89 c3             	mov    rbx,rax
      c7c960:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      c7c965:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      c7c96a:	e8 09 02 00 00       	call   c7cb78 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9b18>
      c7c96f:	c6 43 08 00          	mov    BYTE PTR [rbx+0x8],0x0
      c7c973:	48 8d 05 8e f1 b9 00 	lea    rax,[rip+0xb9f18e]        # 181bb08 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x117c8>
      c7c97a:	48 89 03             	mov    QWORD PTR [rbx],rax
      c7c97d:	49 8b 07             	mov    rax,QWORD PTR [r15]
      c7c980:	4c 89 ff             	mov    rdi,r15
      c7c983:	ff 50 28             	call   QWORD PTR [rax+0x28]

### read 0xccfb70: mov    r15,QWORD PTR [r14+0x178]; FDE=(13431966, 13434633)
      ccfb70:	4d 8b be 78 01 00 00 	mov    r15,QWORD PTR [r14+0x178]
      ccfb77:	4c 89 ef             	mov    rdi,r13
      ccfb7a:	e8 6f d1 83 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>
      ccfb7f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      ccfb82:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      ccfb89:	00 
      ccfb8a:	48 89 c6             	mov    rsi,rax
      ccfb8d:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
      ccfb92:	ff 91 a8 00 00 00    	call   QWORD PTR [rcx+0xa8]
      ccfb98:	0f 28 84 24 30 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x130]
      ccfb9f:	00 
      ccfba0:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
      ccfba7:	00 
      ccfba8:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
      ccfbab:	0f 57 c0             	xorps  xmm0,xmm0

### read 0xcfc47d: mov    rdi,QWORD PTR [r14+0x178]; FDE=(13613140, 13616673)
      cfc47d:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
      cfc484:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
      cfc489:	e8 fa e8 ff ff       	call   cfad88 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x247d28>
      cfc48e:	49 8b be 70 01 00 00 	mov    rdi,QWORD PTR [r14+0x170]
      cfc495:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cfc498:	6a 01                	push   0x1
      cfc49a:	5e                   	pop    rsi
      cfc49b:	ff 50 48             	call   QWORD PTR [rax+0x48]
      cfc49e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cfc4a5:	00 00 
      cfc4a7:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
      cfc4ae:	00 
      cfc4af:	0f 85 67 01 00 00    	jne    cfc61c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2495bc>
      cfc4b5:	48 81 c4 08 01 00 00 	add    rsp,0x108
      cfc4bc:	5b                   	pop    rbx

### read 0xdd5145: mov    eax,DWORD PTR [r14+0x178]; FDE=(14504202, 14504479)
      dd5145:	41 8b 86 78 01 00 00 	mov    eax,DWORD PTR [r14+0x178]
      dd514c:	b9 ff ff ff ff       	mov    ecx,0xffffffff
      dd5151:	48 39 c8             	cmp    rax,rcx
      dd5154:	0f 84 ab 00 00 00    	je     dd5205 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa228b>
      dd515a:	49 8d 9e 60 01 00 00 	lea    rbx,[r14+0x160]
      dd5161:	48 89 e1             	mov    rcx,rsp
      dd5164:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      dd5169:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      dd516c:	48 8d 0d cd 55 a5 00 	lea    rcx,[rip+0xa555cd]        # 182a740 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6d70>
      dd5173:	48 89 de             	mov    rsi,rbx
      dd5176:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
      dd5179:	89 c5                	mov    ebp,eax
      dd517b:	49 8b be a0 00 00 00 	mov    rdi,QWORD PTR [r14+0xa0]
      dd5182:	e8 db 52 ca ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      dd5187:	4c 29 f8             	sub    rax,r15

### read 0xe3fc16: mov    rdi,QWORD PTR [r14+0x178]; FDE=(14941196, 14941266)
      e3fc16:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
      e3fc1d:	48 85 ff             	test   rdi,rdi
      e3fc20:	74 09                	je     e3fc2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7041>
      e3fc22:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e3fc25:	48 89 de             	mov    rsi,rbx
      e3fc28:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e3fc2b:	49 8b be 80 01 00 00 	mov    rdi,QWORD PTR [r14+0x180]
      e3fc32:	48 85 ff             	test   rdi,rdi
      e3fc35:	74 13                	je     e3fc4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7060>
      e3fc37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e3fc3a:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
      e3fc3e:	48 89 de             	mov    rsi,rbx
      e3fc41:	48 83 c4 08          	add    rsp,0x8
      e3fc45:	5b                   	pop    rbx
      e3fc46:	41 5e                	pop    r14

### read 0xe3fdd4: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(14941266, 14941758)
      e3fdd4:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
      e3fddb:	48 83 a3 78 01 00 00 	and    QWORD PTR [rbx+0x178],0x0
      e3fde2:	00 
      e3fde3:	48 85 ff             	test   rdi,rdi
      e3fde6:	74 06                	je     e3fdee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7204>
      e3fde8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e3fdeb:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e3fdee:	48 8b bb 70 01 00 00 	mov    rdi,QWORD PTR [rbx+0x170]
      e3fdf5:	48 83 a3 70 01 00 00 	and    QWORD PTR [rbx+0x170],0x0
      e3fdfc:	00 
      e3fdfd:	48 85 ff             	test   rdi,rdi
      e3fe00:	74 06                	je     e3fe08 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x721e>
      e3fe02:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e3fe05:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e3fe08:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]

### read 0xe40f30: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(14945258, 14947217)
      e40f30:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
      e40f37:	4c 89 bb 78 01 00 00 	mov    QWORD PTR [rbx+0x178],r15
      e40f3e:	48 85 ff             	test   rdi,rdi
      e40f41:	74 06                	je     e40f49 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x835f>
      e40f43:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e40f46:	ff 50 08             	call   QWORD PTR [rax+0x8]
      e40f49:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
      e40f50:	00 
      e40f51:	e8 14 90 c3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e40f56:	48 8d bc 24 10 05 00 	lea    rdi,[rsp+0x510]
      e40f5d:	00 
      e40f5e:	e8 07 90 c3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e40f63:	48 8d bc 24 40 05 00 	lea    rdi,[rsp+0x540]
      e40f6a:	00 
      e40f6b:	e8 b2 14 00 00       	call   e42422 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9838>

### read 0xe40f78: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(14945258, 14947217)
      e40f78:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
      e40f7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e40f82:	ff 50 48             	call   QWORD PTR [rax+0x48]
      e40f85:	84 c0                	test   al,al
      e40f87:	75 39                	jne    e40fc2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83d8>
      e40f89:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
      e40f90:	4c 8d b4 24 c0 04 00 	lea    r14,[rsp+0x4c0]
      e40f97:	00 
      e40f98:	49 89 1e             	mov    QWORD PTR [r14],rbx
      e40f9b:	48 8d 05 c2 b4 c3 ff 	lea    rax,[rip+0xffffffffffc3b4c2]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e40fa2:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      e40fa6:	48 8d 05 9b 14 00 00 	lea    rax,[rip+0x149b]        # e42448 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x985e>
      e40fad:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e40fb1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e40fb4:	4c 89 f6             	mov    rsi,r14

### read 0xe40f89: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(14945258, 14947217)
      e40f89:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
      e40f90:	4c 8d b4 24 c0 04 00 	lea    r14,[rsp+0x4c0]
      e40f97:	00 
      e40f98:	49 89 1e             	mov    QWORD PTR [r14],rbx
      e40f9b:	48 8d 05 c2 b4 c3 ff 	lea    rax,[rip+0xffffffffffc3b4c2]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      e40fa2:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      e40fa6:	48 8d 05 9b 14 00 00 	lea    rax,[rip+0x149b]        # e42448 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x985e>
      e40fad:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e40fb1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e40fb4:	4c 89 f6             	mov    rsi,r14
      e40fb7:	ff 50 50             	call   QWORD PTR [rax+0x50]
      e40fba:	4c 89 f7             	mov    rdi,r14
      e40fbd:	e8 60 14 00 00       	call   e42422 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9838>
      e40fc2:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
      e40fc9:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### read 0xe40fc2: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(14945258, 14947217)
      e40fc2:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
      e40fc9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e40fcc:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e40fcf:	48 8b bb 80 01 00 00 	mov    rdi,QWORD PTR [rbx+0x180]
      e40fd6:	48 85 ff             	test   rdi,rdi
      e40fd9:	0f 85 cc 02 00 00    	jne    e412ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86c1>
      e40fdf:	48 8d 73 20          	lea    rsi,[rbx+0x20]
      e40fe3:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
      e40fea:	00 
      e40feb:	4c 89 f7             	mov    rdi,r14
      e40fee:	e8 af 7c fa ff       	call   de8ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb5d28>
      e40ff3:	66 0f 6f 83 60 01 00 	movdqa xmm0,XMMWORD PTR [rbx+0x160]
      e40ffa:	00 
      e40ffb:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      e41001:	4c 8b bb 70 01 00 00 	mov    r15,QWORD PTR [rbx+0x170]

### read 0xe413f8: mov    rdi,QWORD PTR [rdi+0x178]; FDE=(14947316, 14947372)
      e413f8:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e413ff:	48 85 ff             	test   rdi,rdi
      e41402:	74 06                	je     e4140a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8820>
      e41404:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41407:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e4140a:	48 8b bb 80 01 00 00 	mov    rdi,QWORD PTR [rbx+0x180]
      e41411:	48 85 ff             	test   rdi,rdi
      e41414:	74 06                	je     e4141c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8832>
      e41416:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41419:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e4141c:	48 81 c3 e0 01 00 00 	add    rbx,0x1e0
      e41423:	48 89 df             	mov    rdi,rbx
      e41426:	5b                   	pop    rbx
      e41427:	e9 7c 76 ce ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e4142c:	53                   	push   rbx

### read 0xe41430: mov    rdi,QWORD PTR [rdi+0x178]; FDE=(14947372, 14947412)
      e41430:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e41437:	48 85 ff             	test   rdi,rdi
      e4143a:	74 16                	je     e41452 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8868>
      e4143c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e4143f:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e41442:	48 81 c3 e0 01 00 00 	add    rbx,0x1e0
      e41449:	48 89 df             	mov    rdi,rbx
      e4144c:	5b                   	pop    rbx
      e4144d:	e9 56 76 ce ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
      e41452:	5b                   	pop    rbx
      e41453:	c3                   	ret
      e41454:	53                   	push   rbx
      e41455:	48 89 fb             	mov    rbx,rdi
      e41458:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e4145f:	48 85 ff             	test   rdi,rdi

### read 0xe41458: mov    rdi,QWORD PTR [rdi+0x178]; FDE=(14947412, 14947455)
      e41458:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e4145f:	48 85 ff             	test   rdi,rdi
      e41462:	74 06                	je     e4146a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8880>
      e41464:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41467:	ff 50 38             	call   QWORD PTR [rax+0x38]
      e4146a:	48 8b bb 80 01 00 00 	mov    rdi,QWORD PTR [rbx+0x180]
      e41471:	48 85 ff             	test   rdi,rdi
      e41474:	74 07                	je     e4147d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8893>
      e41476:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41479:	5b                   	pop    rbx
      e4147a:	ff 60 48             	jmp    QWORD PTR [rax+0x48]
      e4147d:	5b                   	pop    rbx
      e4147e:	c3                   	ret
      e4147f:	cc                   	int3
      e41480:	48 8b bf 80 01 00 00 	mov    rdi,QWORD PTR [rdi+0x180]

### read 0xe41c8b: mov    rdi,QWORD PTR [rdi+0x178]; FDE=(14949480, 14949935)
      e41c8b:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
      e41c92:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e41c95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e41c98:	48 8b 28             	mov    rbp,QWORD PTR [rax]
      e41c9b:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      e41c9f:	4c 39 f5             	cmp    rbp,r14
      e41ca2:	0f 84 46 01 00 00    	je     e41dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9204>
      e41ca8:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      e41cad:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      e41cb2:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      e41cb7:	48 8b bb 60 02 00 00 	mov    rdi,QWORD PTR [rbx+0x260]
      e41cbe:	e8 9f 87 c3 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e41cc3:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
      e41cc7:	41 80 bc 24 b8 03 00 	cmp    BYTE PTR [r12+0x3b8],0x0
      e41cce:	00 00 

### read 0xe42454: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(14951496, 14951599)
      e42454:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
      e4245b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e4245e:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e42461:	4c 8b 30             	mov    r14,QWORD PTR [rax]
      e42464:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
      e42468:	4d 39 fe             	cmp    r14,r15
      e4246b:	74 14                	je     e42481 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9897>
      e4246d:	48 89 df             	mov    rdi,rbx
      e42470:	4c 89 f6             	mov    rsi,r14
      e42473:	e8 f8 fa ff ff       	call   e41f70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9386>
      e42478:	40 08 c5             	or     bpl,al
      e4247b:	49 83 c6 10          	add    r14,0x10
      e4247f:	eb e7                	jmp    e42468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x987e>
      e42481:	40 f6 c5 01          	test   bpl,0x1
      e42485:	74 0c                	je     e42493 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x98a9>

### read 0xe68adb: mov    r12,QWORD PTR [rax+0x178]; FDE=(15108454, 15111474)
      e68adb:	4c 8b a0 78 01 00 00 	mov    r12,QWORD PTR [rax+0x178]
      e68ae2:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
      e68ae5:	49 8d 54 24 20       	lea    rdx,[r12+0x20]
      e68aea:	49 8d 8c 24 88 01 00 	lea    rcx,[r12+0x188]
      e68af1:	00 
      e68af2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e68af5:	48 8d 6c 24 30       	lea    rbp,[rsp+0x30]
      e68afa:	48 89 ef             	mov    rdi,rbp
      e68afd:	ff 50 68             	call   QWORD PTR [rax+0x68]
      e68b00:	80 bd 00 03 00 00 00 	cmp    BYTE PTR [rbp+0x300],0x0
      e68b07:	0f 94 c0             	sete   al
      e68b0a:	80 bd c0 01 00 00 00 	cmp    BYTE PTR [rbp+0x1c0],0x0
      e68b11:	40 0f 95 c5          	setne  bpl
      e68b15:	40 08 c5             	or     bpl,al
      e68b18:	41 8a 95 e0 02 00 00 	mov    dl,BYTE PTR [r13+0x2e0]

### read 0xe69828: mov    rdx,QWORD PTR [rax+0x178]; FDE=(15112160, 15113527)
      e69828:	48 8b 90 78 01 00 00 	mov    rdx,QWORD PTR [rax+0x178]
      e6982f:	48 83 c2 08          	add    rdx,0x8
      e69833:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e69836:	4c 8d bc 24 d8 00 00 	lea    r15,[rsp+0xd8]
      e6983d:	00 
      e6983e:	4c 89 ff             	mov    rdi,r15
      e69841:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e69844:	41 80 bf e0 02 00 00 	cmp    BYTE PTR [r15+0x2e0],0x0
      e6984b:	00 
      e6984c:	40 0f 94 c5          	sete   bpl
      e69850:	41 80 bf 50 02 00 00 	cmp    BYTE PTR [r15+0x250],0x0
      e69857:	00 
      e69858:	41 0f 94 c5          	sete   r13b
      e6985c:	48 8b 43 38          	mov    rax,QWORD PTR [rbx+0x38]
      e69860:	48 8b 90 78 01 00 00 	mov    rdx,QWORD PTR [rax+0x178]

### read 0xe6a9a9: mov    rdx,QWORD PTR [rax+0x178]; FDE=(15116654, 15119744)
      e6a9a9:	48 8b 90 78 01 00 00 	mov    rdx,QWORD PTR [rax+0x178]
      e6a9b0:	48 83 c2 08          	add    rdx,0x8
      e6a9b4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e6a9b7:	48 8d 9c 24 18 04 00 	lea    rbx,[rsp+0x418]
      e6a9be:	00 
      e6a9bf:	48 89 df             	mov    rdi,rbx
      e6a9c2:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e6a9c5:	31 ed                	xor    ebp,ebp
      e6a9c7:	80 bb e0 02 00 00 00 	cmp    BYTE PTR [rbx+0x2e0],0x0
      e6a9ce:	74 07                	je     e6a9d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31ded>
      e6a9d0:	8b ac 24 68 06 00 00 	mov    ebp,DWORD PTR [rsp+0x668]
      e6a9d7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e6a9dc:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
      e6a9e0:	48 8b 90 78 01 00 00 	mov    rdx,QWORD PTR [rax+0x178]
      e6a9e7:	48 83 c2 20          	add    rdx,0x20

### read 0xe6b668: mov    rsi,QWORD PTR [rbx+0x178]; FDE=(15119940, 15120159)
      e6b668:	48 8b b3 78 01 00 00 	mov    rsi,QWORD PTR [rbx+0x178]
      e6b66f:	4c 89 f7             	mov    rdi,r14
      e6b672:	ff 93 78 03 00 00    	call   QWORD PTR [rbx+0x378]
      e6b678:	48 8b bb b0 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3b0]
      e6b67f:	e8 02 2e c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e6b684:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
      e6b68b:	e8 b6 60 95 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e6b690:	48 8d bb 88 03 00 00 	lea    rdi,[rbx+0x388]
      e6b697:	e8 aa 60 95 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e6b69c:	4c 89 f7             	mov    rdi,r14
      e6b69f:	e8 62 b0 ff ff       	call   e66706 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2db1c>
      e6b6a4:	48 8d bb b0 02 00 00 	lea    rdi,[rbx+0x2b0]
      e6b6ab:	e8 ba e8 c0 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e6b6b0:	48 8d bb 88 02 00 00 	lea    rdi,[rbx+0x288]
      e6b6b7:	e8 d4 27 98 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### read 0xe6b863: mov    r14,QWORD PTR [rax+0x178]; FDE=(15120420, 15121698)
      e6b863:	4c 8b b0 78 01 00 00 	mov    r14,QWORD PTR [rax+0x178]
      e6b86a:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
      e6b86d:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      e6b871:	49 81 c6 88 01 00 00 	add    r14,0x188
      e6b878:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e6b87b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      e6b880:	4c 89 fa             	mov    rdx,r15
      e6b883:	4c 89 f1             	mov    rcx,r14
      e6b886:	ff 50 68             	call   QWORD PTR [rax+0x68]
      e6b889:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
      e6b88c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e6b88f:	4c 8d a4 24 28 03 00 	lea    r12,[rsp+0x328]
      e6b896:	00 
      e6b897:	4c 89 e7             	mov    rdi,r12
      e6b89a:	ff 50 78             	call   QWORD PTR [rax+0x78]

### read 0x12129cd: add    rdi,QWORD PTR [rbx+0x178]; FDE=(18949088, 18958079)
     12129cd:	48 03 bb 78 01 00 00 	add    rdi,QWORD PTR [rbx+0x178]
     12129d4:	4c 89 f6             	mov    rsi,r14
     12129d7:	e8 5e f9 8e ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     12129dc:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     12129e3:	00 
     12129e4:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     12129e9:	e8 52 b5 5d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12129ee:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     12129f3:	49 8b bf 68 01 00 00 	mov    rdi,QWORD PTR [r15+0x168]
     12129fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12129fd:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1212a00:	84 c0                	test   al,al
     1212a02:	74 11                	je     1212a15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x57f99>
     1212a04:	49 8b 87 70 01 00 00 	mov    rax,QWORD PTR [r15+0x170]
     1212a0b:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax

### read 0x1392d3f: lea    rsi,[r14+0x178]; FDE=(20524236, 20524570)
     1392d3f:	49 8d b6 78 01 00 00 	lea    rsi,[r14+0x178]
     1392d46:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
     1392d4d:	e8 e8 f5 76 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     1392d52:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1392d55:	4c 89 f7             	mov    rdi,r14
     1392d58:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     1392d5e:	4c 8d a3 a0 00 00 00 	lea    r12,[rbx+0xa0]
     1392d65:	0f b6 f8             	movzx  edi,al
     1392d68:	e8 ad 00 00 00       	call   1392e1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d839e>
     1392d6d:	49 89 c5             	mov    r13,rax
     1392d70:	48 89 d5             	mov    rbp,rdx
     1392d73:	4c 89 e7             	mov    rdi,r12
     1392d76:	e8 b1 c5 73 ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
     1392d7b:	4c 89 e7             	mov    rdi,r12
     1392d7e:	4c 89 ee             	mov    rsi,r13

### read 0x139b94c: mov    eax,DWORD PTR [rsi+0x178]; FDE=(20560160, 20560307)
     139b94c:	8b 86 78 01 00 00    	mov    eax,DWORD PTR [rsi+0x178]
     139b952:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     139b957:	48 39 c8             	cmp    rax,rcx
     139b95a:	74 35                	je     139b991 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f15>
     139b95c:	48 89 e1             	mov    rcx,rsp
     139b95f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     139b964:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     139b967:	48 83 c6 08          	add    rsi,0x8
     139b96b:	48 8d 0d e6 db 4c 00 	lea    rcx,[rip+0x4cdbe6]        # 1869558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25c40>
     139b972:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
     139b975:	eb 05                	jmp    139b97c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f00>
     139b977:	e8 08 6f ff ff       	call   1392884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d7e08>
     139b97c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139b983:	00 00 
     139b985:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]

### read 0x13aeb55: mov    rdi,QWORD PTR [r14+0x178]; FDE=(20638508, 20638633)
     13aeb55:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     13aeb5c:	4d 8b a6 88 01 00 00 	mov    r12,QWORD PTR [r14+0x188]
     13aeb63:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13aeb66:	ff 50 28             	call   QWORD PTR [rax+0x28]
     13aeb69:	49 89 c7             	mov    r15,rax
     13aeb6c:	4d 01 e7             	add    r15,r12
     13aeb6f:	4d 63 b6 70 01 00 00 	movsxd r14,DWORD PTR [r14+0x170]
     13aeb76:	6a 01                	push   0x1
     13aeb78:	5e                   	pop    rsi
     13aeb79:	48 89 df             	mov    rdi,rbx
     13aeb7c:	e8 b9 09 7b ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13aeb81:	4c 89 f8             	mov    rax,r15
     13aeb84:	4c 89 f2             	mov    rdx,r14
     13aeb87:	48 83 c4 08          	add    rsp,0x8
     13aeb8b:	5b                   	pop    rbx

### read 0x13aebef: mov    rdi,QWORD PTR [r14+0x178]; FDE=(20638658, 20638795)
     13aebef:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     13aebf6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13aebf9:	ff 50 40             	call   QWORD PTR [rax+0x40]
     13aebfc:	48 85 c0             	test   rax,rax
     13aebff:	74 04                	je     13aec05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f4189>
     13aec01:	31 ed                	xor    ebp,ebp
     13aec03:	eb 1e                	jmp    13aec23 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f41a7>
     13aec05:	49 81 c6 00 01 00 00 	add    r14,0x100
     13aec0c:	4c 89 f7             	mov    rdi,r14
     13aec0f:	e8 da e0 15 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>
     13aec14:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13aec17:	48 89 c7             	mov    rdi,rax
     13aec1a:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     13aec1d:	89 c5                	mov    ebp,eax
     13aec1f:	40 80 f5 01          	xor    bpl,0x1

### read 0x13af0e0: mov    rdi,QWORD PTR [r15+0x178]; FDE=(20639650, 20640557)
     13af0e0:	49 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [r15+0x178]
     13af0e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13af0ea:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     13af0f0:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     13af0f4:	49 2b 45 00          	sub    rax,QWORD PTR [r13+0x0]
     13af0f8:	48 c1 f8 02          	sar    rax,0x2
     13af0fc:	49 01 87 50 02 00 00 	add    QWORD PTR [r15+0x250],rax
     13af103:	49 8b bf 28 02 00 00 	mov    rdi,QWORD PTR [r15+0x228]
     13af10a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13af10d:	ff 50 10             	call   QWORD PTR [rax+0x10]
     13af110:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     13af115:	4d 8d a7 00 01 00 00 	lea    r12,[r15+0x100]
     13af11c:	4c 89 e7             	mov    rdi,r12
     13af11f:	e8 ca db 15 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>
     13af124:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0

### read 0x13b1bc1: lea    r12,[rbx+0x178]; FDE=(20650336, 20652323)
     13b1bc1:	4c 8d a3 78 01 00 00 	lea    r12,[rbx+0x178]
     13b1bc8:	48 85 c0             	test   rax,rax
     13b1bcb:	74 12                	je     13b1bdf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f7163>
     13b1bcd:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]
     13b1bd0:	41 89 4c 24 10       	mov    DWORD PTR [r12+0x10],ecx
     13b1bd5:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     13b1bd8:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     13b1bdd:	eb 0a                	jmp    13b1be9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f716d>
     13b1bdf:	4c 89 e7             	mov    rdi,r12
     13b1be2:	31 f6                	xor    esi,esi
     13b1be4:	e8 b5 6b 7b ff       	call   b6879e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb573e>
     13b1be9:	48 8b bb 68 01 00 00 	mov    rdi,QWORD PTR [rbx+0x168]
     13b1bf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13b1bf3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     13b1bf6:	48 89 c7             	mov    rdi,rax

### read 0x13b246a: movups xmm0,XMMWORD PTR [rbx+0x178]; FDE=(20652752, 20656221)
     13b246a:	0f 10 83 78 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x178]
     13b2471:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     13b2475:	c7 83 d8 01 00 00 04 	mov    DWORD PTR [rbx+0x1d8],0x4
     13b247c:	00 00 00 
     13b247f:	48 8d b3 70 08 00 00 	lea    rsi,[rbx+0x870]
     13b2486:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     13b248b:	e8 58 5a 7b ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
     13b2490:	48 8b bb 68 01 00 00 	mov    rdi,QWORD PTR [rbx+0x168]
     13b2497:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13b249a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     13b249d:	4c 8d ab 78 01 00 00 	lea    r13,[rbx+0x178]
     13b24a4:	4c 8b bb 98 00 00 00 	mov    r15,QWORD PTR [rbx+0x98]
     13b24ab:	41 8b 4e 10          	mov    ecx,DWORD PTR [r14+0x10]
     13b24af:	89 8c 24 e0 00 00 00 	mov    DWORD PTR [rsp+0xe0],ecx
     13b24b6:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]

### read 0x13b26d4: movups xmm0,XMMWORD PTR [rbx+0x178]; FDE=(20652752, 20656221)
     13b26d4:	0f 10 83 78 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x178]
     13b26db:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     13b26df:	c7 83 d8 01 00 00 05 	mov    DWORD PTR [rbx+0x1d8],0x5
     13b26e6:	00 00 00 
     13b26e9:	48 8d b3 70 08 00 00 	lea    rsi,[rbx+0x870]
     13b26f0:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     13b26f5:	e8 ee 57 7b ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
     13b26fa:	48 8b bb 68 01 00 00 	mov    rdi,QWORD PTR [rbx+0x168]
     13b2701:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13b2704:	ff 50 28             	call   QWORD PTR [rax+0x28]
     13b2707:	48 8d 8b 78 01 00 00 	lea    rcx,[rbx+0x178]
     13b270e:	4c 8b bb 98 00 00 00 	mov    r15,QWORD PTR [rbx+0x98]
     13b2715:	41 8b 56 10          	mov    edx,DWORD PTR [r14+0x10]
     13b2719:	89 94 24 10 01 00 00 	mov    DWORD PTR [rsp+0x110],edx
     13b2720:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]

### read 0x13b7dd9: lea    rdx,[rbx+0x178]; FDE=(20675150, 20676975)
     13b7dd9:	48 8d 93 78 01 00 00 	lea    rdx,[rbx+0x178]
     13b7de0:	4d 8b 07             	mov    r8,QWORD PTR [r15]
     13b7de3:	48 8d 0d 97 67 02 ff 	lea    rcx,[rip+0xffffffffff026797]        # 3de581 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3fd0>
     13b7dea:	4c 89 ff             	mov    rdi,r15
     13b7ded:	48 89 c6             	mov    rsi,rax
     13b7df0:	41 ff 50 50          	call   QWORD PTR [r8+0x50]
     13b7df4:	40 84 ed             	test   bpl,bpl
     13b7df7:	0f 84 9a 00 00 00    	je     13b7e97 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fd41b>
     13b7dfd:	6a 01                	push   0x1
     13b7dff:	5e                   	pop    rsi
     13b7e00:	48 89 df             	mov    rdi,rbx
     13b7e03:	e8 9a a3 ff ff       	call   13b21a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f7726>
     13b7e08:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     13b7e0d:	48 89 54 24 48       	mov    QWORD PTR [rsp+0x48],rdx
     13b7e12:	8a 83 d9 05 00 00    	mov    al,BYTE PTR [rbx+0x5d9]

### read 0x13b7e6a: lea    rdx,[rbx+0x178]; FDE=(20675150, 20676975)
     13b7e6a:	48 8d 93 78 01 00 00 	lea    rdx,[rbx+0x178]
     13b7e71:	4d 8b 07             	mov    r8,QWORD PTR [r15]
     13b7e74:	48 8d 0d e9 66 02 ff 	lea    rcx,[rip+0xffffffffff0266e9]        # 3de564 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3fb3>
     13b7e7b:	4c 89 ff             	mov    rdi,r15
     13b7e7e:	48 89 c6             	mov    rsi,rax
     13b7e81:	41 ff 50 50          	call   QWORD PTR [r8+0x50]
     13b7e85:	48 8b bb 68 01 00 00 	mov    rdi,QWORD PTR [rbx+0x168]
     13b7e8c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13b7e8f:	ff 50 68             	call   QWORD PTR [rax+0x68]
     13b7e92:	e9 86 00 00 00       	jmp    13b7f1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fd4a1>
     13b7e97:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     13b7e9e:	31 c0                	xor    eax,eax
     13b7ea0:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
     13b7ea7:	88 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],al
     13b7eae:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### read 0x13b7ee7: lea    rdi,[rbx+0x178]; FDE=(20675150, 20676975)
     13b7ee7:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
     13b7eee:	31 f6                	xor    esi,esi
     13b7ef0:	e8 a9 08 7b ff       	call   b6879e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb573e>
     13b7ef5:	b0 01                	mov    al,0x1
     13b7ef7:	88 83 d9 05 00 00    	mov    BYTE PTR [rbx+0x5d9],al
     13b7efd:	88 83 dd 05 00 00    	mov    BYTE PTR [rbx+0x5dd],al
     13b7f03:	e8 cc ee 24 00       	call   1606dd4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f42>
     13b7f08:	80 bb c8 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c8],0x0
     13b7f0f:	74 07                	je     13b7f18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fd49c>
     13b7f11:	c6 83 c8 05 00 00 00 	mov    BYTE PTR [rbx+0x5c8],0x0
     13b7f18:	e8 cd ee 24 00       	call   1606dea <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f58>
     13b7f1d:	48 8b bb 68 01 00 00 	mov    rdi,QWORD PTR [rbx+0x168]
     13b7f24:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13b7f27:	ff 50 40             	call   QWORD PTR [rax+0x40]
     13b7f2a:	84 c0                	test   al,al

### read 0x13d2856: mov    rdi,QWORD PTR [r14+0x178]; FDE=(20785204, 20785357)
     13d2856:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     13d285d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13d2860:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     13d2866:	41 ff 86 88 01 00 00 	inc    DWORD PTR [r14+0x188]
     13d286d:	41 83 8e f0 00 00 00 	or     DWORD PTR [r14+0xf0],0xffffffff
     13d2874:	ff 
     13d2875:	41 c6 86 f4 00 00 00 	mov    BYTE PTR [r14+0xf4],0x0
     13d287c:	00 
     13d287d:	49 8b be f8 00 00 00 	mov    rdi,QWORD PTR [r14+0xf8]
     13d2884:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13d2887:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     13d288d:	31 c0                	xor    eax,eax
     13d288f:	41 88 86 f0 01 00 00 	mov    BYTE PTR [r14+0x1f0],al
     13d2896:	41 88 86 f8 01 00 00 	mov    BYTE PTR [r14+0x1f8],al
     13d289d:	41 83 a6 90 01 00 00 	and    DWORD PTR [r14+0x190],0x0

### read 0x13d4561: mov    rdi,QWORD PTR [r14+0x178]; FDE=(20792566, 20793738)
     13d4561:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     13d4568:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13d456b:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
     13d4571:	4d 8d ae 48 01 00 00 	lea    r13,[r14+0x148]
     13d4578:	4c 89 ef             	mov    rdi,r13
     13d457b:	e8 0a 04 00 00       	call   13d498a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x219f0e>
     13d4580:	48 85 c0             	test   rax,rax
     13d4583:	0f 85 2f 03 00 00    	jne    13d48b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x219e3c>
     13d4589:	49 8b 86 68 01 00 00 	mov    rax,QWORD PTR [r14+0x168]
     13d4590:	48 3d aa 00 00 00    	cmp    rax,0xaa
     13d4596:	72 37                	jb     13d45cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x219b53>
     13d4598:	48 05 56 ff ff ff    	add    rax,0xffffffffffffff56
     13d459e:	49 89 86 68 01 00 00 	mov    QWORD PTR [r14+0x168],rax
     13d45a5:	49 8b 86 50 01 00 00 	mov    rax,QWORD PTR [r14+0x150]
     13d45ac:	48 8b 08             	mov    rcx,QWORD PTR [rax]

### read 0x13d5383: mov    rdi,QWORD PTR [r12+0x178]; FDE=(20794022, 20796720)
     13d5383:	49 8b bc 24 78 01 00 	mov    rdi,QWORD PTR [r12+0x178]
     13d538a:	00 
     13d538b:	4c 63 f8             	movsxd r15,eax
     13d538e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13d5391:	4c 89 fe             	mov    rsi,r15
     13d5394:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     13d539a:	8b 6c 24 24          	mov    ebp,DWORD PTR [rsp+0x24]
     13d539e:	49 8b be f8 00 00 00 	mov    rdi,QWORD PTR [r14+0xf8]
     13d53a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13d53a8:	4c 89 fe             	mov    rsi,r15
     13d53ab:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
     13d53b1:	eb 07                	jmp    13d53ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x21a93e>
     13d53b3:	4d 89 e6             	mov    r14,r12
     13d53b6:	8b 6c 24 24          	mov    ebp,DWORD PTR [rsp+0x24]
     13d53ba:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### read 0x13e9583: mov    rsi,QWORD PTR [rdi+rdx*8+0x178]; FDE=(20878706, 20878769)
     13e9583:	48 8b b4 d7 78 01 00 	mov    rsi,QWORD PTR [rdi+rdx*8+0x178]
     13e958a:	00 
     13e958b:	8b 97 5c 01 00 00    	mov    edx,DWORD PTR [rdi+0x15c]
     13e9591:	48 89 c7             	mov    rdi,rax
     13e9594:	ff 11                	call   QWORD PTR [rcx]
     13e9596:	89 c1                	mov    ecx,eax
     13e9598:	8b 83 b8 01 00 00    	mov    eax,DWORD PTR [rbx+0x1b8]
     13e959e:	ff c0                	inc    eax
     13e95a0:	99                   	cdq
     13e95a1:	f7 bb 58 01 00 00    	idiv   DWORD PTR [rbx+0x158]
     13e95a7:	89 93 b8 01 00 00    	mov    DWORD PTR [rbx+0x1b8],edx
     13e95ad:	89 c8                	mov    eax,ecx
     13e95af:	5b                   	pop    rbx
     13e95b0:	c3                   	ret
     13e95b1:	cc                   	int3

### read 0x15b9e56: mov    rsi,QWORD PTR [r15+0x178]; FDE=(22778720, 22789865)
     15b9e56:	49 8b b7 78 01 00 00 	mov    rsi,QWORD PTR [r15+0x178]
     15b9e5d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15b9e60:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     15b9e67:	00 
     15b9e68:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15b9e6b:	bf e0 00 00 00       	mov    edi,0xe0
     15b9e70:	e8 8b 40 23 00       	call   17edf00 <_Znwm@plt>
     15b9e75:	49 89 c4             	mov    r12,rax
     15b9e78:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
     15b9e7f:	00 
     15b9e80:	4c 8d 84 24 10 01 00 	lea    r8,[rsp+0x110]
     15b9e87:	00 
     15b9e88:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
     15b9e8c:	0f 57 c0             	xorps  xmm0,xmm0
     15b9e8f:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0

### read 0x15c888a: mov    rsi,QWORD PTR [rdi+0x178]; FDE=(22841458, 22841592)
     15c888a:	48 8b b7 78 01 00 00 	mov    rsi,QWORD PTR [rdi+0x178]
     15c8891:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c8894:	49 89 e6             	mov    r14,rsp
     15c8897:	4c 89 f7             	mov    rdi,r14
     15c889a:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15c889d:	48 83 c3 38          	add    rbx,0x38
     15c88a1:	48 89 df             	mov    rdi,rbx
     15c88a4:	4c 89 f6             	mov    rsi,r14
     15c88a7:	e8 fe ff 01 00       	call   15e88aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42de2e>
     15c88ac:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     15c88b1:	e8 d0 5b 4d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15c88b6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c88bd:	00 00 
     15c88bf:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     15c88c4:	75 2d                	jne    15c88f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40de77>

### read 0x15c94df: mov    rsi,QWORD PTR [r12+0x178]; FDE=(22844400, 22847008)
     15c94df:	49 8b b4 24 78 01 00 	mov    rsi,QWORD PTR [r12+0x178]
     15c94e6:	00 
     15c94e7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15c94ea:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     15c94f1:	00 
     15c94f2:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15c94f5:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
     15c94fc:	00 
     15c94fd:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     15c9504:	00 
     15c9505:	e8 a0 f3 01 00       	call   15e88aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42de2e>
     15c950a:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     15c950f:	48 8d bc 24 10 04 00 	lea    rdi,[rsp+0x410]
     15c9516:	00 
     15c9517:	48 89 5f f0          	mov    QWORD PTR [rdi-0x10],rbx

### read 0x160f58a: mov    edi,DWORD PTR [r15+0x178]; FDE=(23130100, 23133202)
     160f58a:	41 8b bf 78 01 00 00 	mov    edi,DWORD PTR [r15+0x178]
     160f591:	e8 7c 06 00 00       	call   160fc12 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xad80>
     160f596:	41 89 c4             	mov    r12d,eax
     160f599:	48 8b b4 24 90 01 00 	mov    rsi,QWORD PTR [rsp+0x190]
     160f5a0:	00 
     160f5a1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     160f5a4:	4c 89 ef             	mov    rdi,r13
     160f5a7:	ff 50 38             	call   QWORD PTR [rax+0x38]
     160f5aa:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     160f5b1:	00 
     160f5b2:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
     160f5b9:	00 
     160f5ba:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     160f5bf:	48 8b 9c 24 e8 00 00 	mov    rbx,QWORD PTR [rsp+0xe8]
     160f5c6:	00 

### read 0x162c508: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(23250140, 23250293)
     162c508:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
     162c50f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c512:	ff 50 18             	call   QWORD PTR [rax+0x18]
     162c515:	48 8b bb 70 01 00 00 	mov    rdi,QWORD PTR [rbx+0x170]
     162c51c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c51f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     162c522:	84 c0                	test   al,al
     162c524:	75 28                	jne    162c54e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276bc>
     162c526:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     162c529:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162c52c:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     162c531:	4c 89 f7             	mov    rdi,r14
     162c534:	ff 50 58             	call   QWORD PTR [rax+0x58]
     162c537:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     162c53a:	4c 89 f7             	mov    rdi,r14

### read 0x162c58e: mov    rdi,QWORD PTR [rdi+0x178]; FDE=(23250294, 23250450)
     162c58e:	48 8b bf 78 01 00 00 	mov    rdi,QWORD PTR [rdi+0x178]
     162c595:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c598:	ff 50 20             	call   QWORD PTR [rax+0x20]
     162c59b:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
     162c5a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c5a5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     162c5a8:	84 c0                	test   al,al
     162c5aa:	74 10                	je     162c5bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2772a>
     162c5ac:	48 8b 83 78 01 00 00 	mov    rax,QWORD PTR [rbx+0x178]
     162c5b3:	48 89 83 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rax
     162c5ba:	eb 39                	jmp    162c5f5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27763>
     162c5bc:	48 8b b3 78 01 00 00 	mov    rsi,QWORD PTR [rbx+0x178]
     162c5c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162c5c6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     162c5cb:	4c 89 f7             	mov    rdi,r14

### read 0x162c59b: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(23250294, 23250450)
     162c59b:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
     162c5a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c5a5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     162c5a8:	84 c0                	test   al,al
     162c5aa:	74 10                	je     162c5bc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2772a>
     162c5ac:	48 8b 83 78 01 00 00 	mov    rax,QWORD PTR [rbx+0x178]
     162c5b3:	48 89 83 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rax
     162c5ba:	eb 39                	jmp    162c5f5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27763>
     162c5bc:	48 8b b3 78 01 00 00 	mov    rsi,QWORD PTR [rbx+0x178]
     162c5c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162c5c6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     162c5cb:	4c 89 f7             	mov    rdi,r14
     162c5ce:	ff 50 58             	call   QWORD PTR [rax+0x58]
     162c5d1:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     162c5d4:	4c 89 f7             	mov    rdi,r14

### read 0x162c5ac: mov    rax,QWORD PTR [rbx+0x178]; FDE=(23250294, 23250450)
     162c5ac:	48 8b 83 78 01 00 00 	mov    rax,QWORD PTR [rbx+0x178]
     162c5b3:	48 89 83 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rax
     162c5ba:	eb 39                	jmp    162c5f5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27763>
     162c5bc:	48 8b b3 78 01 00 00 	mov    rsi,QWORD PTR [rbx+0x178]
     162c5c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162c5c6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     162c5cb:	4c 89 f7             	mov    rdi,r14
     162c5ce:	ff 50 58             	call   QWORD PTR [rax+0x58]
     162c5d1:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     162c5d4:	4c 89 f7             	mov    rdi,r14
     162c5d7:	e8 10 a1 48 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     162c5dc:	4d 85 f6             	test   r14,r14
     162c5df:	75 14                	jne    162c5f5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27763>
     162c5e1:	48 8b bb 70 01 00 00 	mov    rdi,QWORD PTR [rbx+0x170]
     162c5e8:	48 89 bb 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rdi

### read 0x162c5bc: mov    rsi,QWORD PTR [rbx+0x178]; FDE=(23250294, 23250450)
     162c5bc:	48 8b b3 78 01 00 00 	mov    rsi,QWORD PTR [rbx+0x178]
     162c5c3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162c5c6:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     162c5cb:	4c 89 f7             	mov    rdi,r14
     162c5ce:	ff 50 58             	call   QWORD PTR [rax+0x58]
     162c5d1:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     162c5d4:	4c 89 f7             	mov    rdi,r14
     162c5d7:	e8 10 a1 48 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     162c5dc:	4d 85 f6             	test   r14,r14
     162c5df:	75 14                	jne    162c5f5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27763>
     162c5e1:	48 8b bb 70 01 00 00 	mov    rdi,QWORD PTR [rbx+0x170]
     162c5e8:	48 89 bb 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rdi
     162c5ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c5f2:	ff 50 20             	call   QWORD PTR [rax+0x20]
     162c5f5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### read 0x162c6c8: lea    r15,[rbx+0x178]; FDE=(23250450, 23250842)
     162c6c8:	4c 8d bb 78 01 00 00 	lea    r15,[rbx+0x178]
     162c6cf:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     162c6d2:	48 89 bb 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rdi
     162c6d9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c6dc:	48 89 e6             	mov    rsi,rsp
     162c6df:	ff 50 40             	call   QWORD PTR [rax+0x40]
     162c6e2:	48 8b bb 80 01 00 00 	mov    rdi,QWORD PTR [rbx+0x180]
     162c6e9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c6ec:	ff 50 10             	call   QWORD PTR [rax+0x10]
     162c6ef:	84 c0                	test   al,al
     162c6f1:	75 4c                	jne    162c73f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x278ad>
     162c6f3:	48 8b b3 80 01 00 00 	mov    rsi,QWORD PTR [rbx+0x180]
     162c6fa:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162c6fd:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
     162c702:	4c 89 f7             	mov    rdi,r14

### read 0x162c72b: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(23250450, 23250842)
     162c72b:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
     162c732:	48 89 bb 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rdi
     162c739:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c73c:	ff 50 18             	call   QWORD PTR [rax+0x18]
     162c73f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162c746:	00 00 
     162c748:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     162c74d:	75 46                	jne    162c795 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27903>
     162c74f:	48 83 c4 40          	add    rsp,0x40
     162c753:	5b                   	pop    rbx
     162c754:	41 5c                	pop    r12
     162c756:	41 5e                	pop    r14
     162c758:	41 5f                	pop    r15
     162c75a:	5d                   	pop    rbp
     162c75b:	c3                   	ret

### read 0x162c80c: mov    rdi,QWORD PTR [rbx+0x178]; FDE=(23250842, 23251009)
     162c80c:	48 8b bb 78 01 00 00 	mov    rdi,QWORD PTR [rbx+0x178]
     162c813:	48 89 bb 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rdi
     162c81a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c81d:	ff 50 18             	call   QWORD PTR [rax+0x18]
     162c820:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162c827:	00 00 
     162c829:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     162c82e:	75 0c                	jne    162c83c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279aa>
     162c830:	48 83 c4 18          	add    rsp,0x18
     162c834:	5b                   	pop    rbx
     162c835:	41 5c                	pop    r12
     162c837:	41 5e                	pop    r14
     162c839:	41 5f                	pop    r15
     162c83b:	c3                   	ret
     162c83c:	e8 6f 32 1c 00       	call   17efab0 <__stack_chk_fail@plt>

### read 0x162c894: mov    r15,QWORD PTR [rbx+0x178]; FDE=(23251010, 23251177)
     162c894:	4c 8b bb 78 01 00 00 	mov    r15,QWORD PTR [rbx+0x178]
     162c89b:	4c 8b a3 80 01 00 00 	mov    r12,QWORD PTR [rbx+0x180]
     162c8a2:	4c 89 f7             	mov    rdi,r14
     162c8a5:	e8 42 9e 48 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     162c8aa:	4d 85 f6             	test   r14,r14
     162c8ad:	75 19                	jne    162c8c8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a36>
     162c8af:	4d 39 fc             	cmp    r12,r15
     162c8b2:	75 14                	jne    162c8c8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27a36>
     162c8b4:	48 8b bb 70 01 00 00 	mov    rdi,QWORD PTR [rbx+0x170]
     162c8bb:	48 89 bb 80 01 00 00 	mov    QWORD PTR [rbx+0x180],rdi
     162c8c2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162c8c5:	ff 50 20             	call   QWORD PTR [rax+0x20]
     162c8c8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162c8cf:	00 00 
     162c8d1:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]

### read 0x162caa3: mov    rdi,QWORD PTR [r14+0x178]; FDE=(23251512, 23251709)
     162caa3:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     162caaa:	49 89 be 80 01 00 00 	mov    QWORD PTR [r14+0x180],rdi
     162cab1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cab4:	ff 50 18             	call   QWORD PTR [rax+0x18]
     162cab7:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     162cabe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cac1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     162cac4:	84 c0                	test   al,al
     162cac6:	74 13                	je     162cadb <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27c49>
     162cac8:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     162cacf:	29 dd                	sub    ebp,ebx
     162cad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cad4:	89 ee                	mov    esi,ebp
     162cad6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     162cad9:	01 c3                	add    ebx,eax

### read 0x162cab7: mov    rdi,QWORD PTR [r14+0x178]; FDE=(23251512, 23251709)
     162cab7:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     162cabe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cac1:	ff 50 10             	call   QWORD PTR [rax+0x10]
     162cac4:	84 c0                	test   al,al
     162cac6:	74 13                	je     162cadb <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27c49>
     162cac8:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     162cacf:	29 dd                	sub    ebp,ebx
     162cad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cad4:	89 ee                	mov    esi,ebp
     162cad6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     162cad9:	01 c3                	add    ebx,eax
     162cadb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162cae2:	00 00 
     162cae4:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     162cae9:	75 0d                	jne    162caf8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27c66>

### read 0x162cac8: mov    rdi,QWORD PTR [r14+0x178]; FDE=(23251512, 23251709)
     162cac8:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     162cacf:	29 dd                	sub    ebp,ebx
     162cad1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cad4:	89 ee                	mov    esi,ebp
     162cad6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     162cad9:	01 c3                	add    ebx,eax
     162cadb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162cae2:	00 00 
     162cae4:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     162cae9:	75 0d                	jne    162caf8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27c66>
     162caeb:	89 d8                	mov    eax,ebx
     162caed:	48 83 c4 18          	add    rsp,0x18
     162caf1:	5b                   	pop    rbx
     162caf2:	41 5e                	pop    r14
     162caf4:	41 5f                	pop    r15

### read 0x162cb31: cmp    rdi,QWORD PTR [r14+0x178]; FDE=(23251710, 23251907)
     162cb31:	49 3b be 78 01 00 00 	cmp    rdi,QWORD PTR [r14+0x178]
     162cb38:	75 67                	jne    162cba1 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d0f>
     162cb3a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cb3d:	ff 50 10             	call   QWORD PTR [rax+0x10]
     162cb40:	84 c0                	test   al,al
     162cb42:	75 5d                	jne    162cba1 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d0f>
     162cb44:	49 8b b6 80 01 00 00 	mov    rsi,QWORD PTR [r14+0x180]
     162cb4b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     162cb4e:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     162cb53:	4c 89 ff             	mov    rdi,r15
     162cb56:	ff 50 58             	call   QWORD PTR [rax+0x58]
     162cb59:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     162cb5c:	4c 89 ff             	mov    rdi,r15
     162cb5f:	e8 88 9b 48 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     162cb64:	4d 85 ff             	test   r15,r15

### read 0x162cc1b: mov    rdi,QWORD PTR [r14+0x178]; FDE=(23251908, 23252072)
     162cc1b:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     162cc22:	49 89 be 80 01 00 00 	mov    QWORD PTR [r14+0x180],rdi
     162cc29:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cc2c:	ff 50 18             	call   QWORD PTR [rax+0x18]
     162cc2f:	49 8b be 80 01 00 00 	mov    rdi,QWORD PTR [r14+0x180]
     162cc36:	49 3b be 78 01 00 00 	cmp    rdi,QWORD PTR [r14+0x178]
     162cc3d:	75 08                	jne    162cc47 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27db5>
     162cc3f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cc42:	ff 50 38             	call   QWORD PTR [rax+0x38]
     162cc45:	01 c3                	add    ebx,eax
     162cc47:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162cc4e:	00 00 
     162cc50:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
     162cc55:	75 0c                	jne    162cc63 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dd1>
     162cc57:	89 d8                	mov    eax,ebx

### read 0x162cc36: cmp    rdi,QWORD PTR [r14+0x178]; FDE=(23251908, 23252072)
     162cc36:	49 3b be 78 01 00 00 	cmp    rdi,QWORD PTR [r14+0x178]
     162cc3d:	75 08                	jne    162cc47 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27db5>
     162cc3f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162cc42:	ff 50 38             	call   QWORD PTR [rax+0x38]
     162cc45:	01 c3                	add    ebx,eax
     162cc47:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162cc4e:	00 00 
     162cc50:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
     162cc55:	75 0c                	jne    162cc63 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dd1>
     162cc57:	89 d8                	mov    eax,ebx
     162cc59:	48 83 c4 10          	add    rsp,0x10
     162cc5d:	5b                   	pop    rbx
     162cc5e:	41 5e                	pop    r14
     162cc60:	41 5f                	pop    r15
     162cc62:	c3                   	ret

### read 0x1680daa: lea    rdi,[rbx+0x178]; FDE=(23596350, 23596643)
     1680daa:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
     1680db1:	48 89 ee             	mov    rsi,rbp
     1680db4:	e8 d7 95 4d ff       	call   b5a390 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa7330>
     1680db9:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
     1680dbd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     1680dc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1680dc3:	4c 89 e6             	mov    rsi,r12
     1680dc6:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1680dc9:	48 89 83 00 02 00 00 	mov    QWORD PTR [rbx+0x200],rax
     1680dd0:	66 83 a3 08 02 00 00 	and    WORD PTR [rbx+0x208],0x0
     1680dd7:	00 
     1680dd8:	4c 8d ab 00 02 00 00 	lea    r13,[rbx+0x200]
     1680ddf:	48 8d bb 10 02 00 00 	lea    rdi,[rbx+0x210]
     1680de6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1680de9:	48 89 c6             	mov    rsi,rax

