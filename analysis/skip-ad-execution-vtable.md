# Skip Ad execution dependency vtable candidates

Proven dependency ABI used for filtering:
- +0x68 is invoked as this-only by the exact native "skip-ad" branch
- +0xb8 is observed as an sret-style call with rdi=output and rsi=dependency
- the same dependency family is also used through +0x98 and +0xc0 in player/restriction construction

- candidates implementing all four slots: 21450

## score=67 address-point=0x185ca00
- +0x68 -> 0x1217ee8; no-extra score=15; incoming-extra=[]; FDE=(18972392, 18972400)
- +0x98 -> 0x1217f1e; boolish score=1; []; FDE=(18972446, 18972454)
- +0xb8 -> 0x1217e5a; sret score=8; ['reads-rsi-this']; FDE=(18972250, 18972258)
- +0xc0 -> 0x1217e5a; boolish score=1; []; FDE=(18972250, 18972258)
- materializations:
  - 0x11f042f: lea    rcx,[rip+0x66c5ca]        # 185ca00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x190e8>; FDE=(18805556, 18832116)
### +0x68 body
     1217ee8:	48 8d 87 58 01 00 00 	lea    rax,[rdi+0x158]
     1217eef:	c3                   	ret
### +0xb8 body head
     1217e5a:	8b 06                	mov    eax,DWORD PTR [rsi]
     1217e5c:	3b 02                	cmp    eax,DWORD PTR [rdx]
     1217e5e:	0f 95 c0             	setne  al
     1217e61:	c3                   	ret

## score=66 address-point=0x185df18
- +0x68 -> 0x124dbc8; no-extra score=15; incoming-extra=[]; FDE=(19192776, 19192781)
- +0x98 -> 0x124ddaa; boolish score=0; []; FDE=(19193258, 19193276)
- +0xb8 -> 0x124e1f6; sret score=8; ['reads-rsi-this']; FDE=(19194358, 19195845)
- +0xc0 -> 0xaf51be; boolish score=1; []; FDE=(11489726, 11489834)
- materializations:
  - 0x11f098f: lea    rcx,[rip+0x66d582]        # 185df18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a600>; FDE=(18805556, 18832116)
### +0x68 body
     124dbc8:	c6 47 58 00          	mov    BYTE PTR [rdi+0x58],0x0
     124dbcc:	c3                   	ret
### +0xb8 body head
     124e1f6:	55                   	push   rbp
     124e1f7:	41 57                	push   r15
     124e1f9:	41 56                	push   r14
     124e1fb:	41 55                	push   r13
     124e1fd:	41 54                	push   r12
     124e1ff:	53                   	push   rbx
     124e200:	48 81 ec 48 01 00 00 	sub    rsp,0x148
     124e207:	48 89 fb             	mov    rbx,rdi
     124e20a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124e211:	00 00 
     124e213:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
     124e21a:	00 
     124e21b:	48 8b 77 68          	mov    rsi,QWORD PTR [rdi+0x68]
     124e21f:	8b 7f 60             	mov    edi,DWORD PTR [rdi+0x60]
     124e222:	e8 f9 d5 82 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     124e227:	84 c0                	test   al,al
     124e229:	0f 85 7a 04 00 00    	jne    124e6a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93c2d>
     124e22f:	0f 57 c0             	xorps  xmm0,xmm0
     124e232:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     124e237:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     124e23a:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     124e23f:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     124e243:	ff 53 30             	call   QWORD PTR [rbx+0x30]
     124e246:	84 c0                	test   al,al
     124e248:	0f 84 51 04 00 00    	je     124e69f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93c23>
     124e24e:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
     124e253:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
     124e258:	48 8d 05 d1 fd 60 00 	lea    rax,[rip+0x60fdd1]        # 185e030 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a718>
     124e25f:	49 89 06             	mov    QWORD PTR [r14],rax
     124e262:	0f 57 c0             	xorps  xmm0,xmm0
     124e265:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
     124e26a:	41 0f 11 46 1c       	movups XMMWORD PTR [r14+0x1c],xmm0
     124e26f:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     124e274:	e8 bd d5 82 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     124e279:	4c 89 f7             	mov    rdi,r14
     124e27c:	48 89 c6             	mov    rsi,rax
     124e27f:	e8 ce 15 53 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     124e284:	84 c0                	test   al,al
     124e286:	0f 84 09 04 00 00    	je     124e695 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93c19>
     124e28c:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
     124e291:	8b 5b 58             	mov    ebx,DWORD PTR [rbx+0x58]
     124e294:	0f 57 c0             	xorps  xmm0,xmm0
     124e297:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     124e29c:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     124e2a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     124e2a6:	8b 84 24 88 00 00 00 	mov    eax,DWORD PTR [rsp+0x88]
     124e2ad:	39 d8                	cmp    eax,ebx
     124e2af:	0f 4c d8             	cmovl  ebx,eax
     124e2b2:	85 db                	test   ebx,ebx
     124e2b4:	0f 84 ae 03 00 00    	je     124e668 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x93bec>
     124e2ba:	4c 63 eb             	movsxd r13,ebx
     124e2bd:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     124e2c2:	e8 63 c5 fe ff       	call   123a82a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7fdae>
     124e2c7:	48 89 c1             	mov    rcx,rax
     124e2ca:	4c 89 e8             	mov    rax,r13
     124e2cd:	48 29 c8             	sub    rax,rcx
     124e2d0:	0f 86 d3 00 00 00    	jbe    124e3a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9392d>
     124e2d6:	48 ff c0             	inc    rax
     124e2d9:	31 d2                	xor    edx,edx
     124e2db:	6a 1e                	push   0x1e

## score=66 address-point=0x185cfd8
- +0x68 -> 0xbea56e; no-extra score=15; incoming-extra=[]; FDE=(12494190, 12494194)
- +0x98 -> 0xa50370; boolish score=0; []; FDE=(10814320, 10814325)
- +0xb8 -> 0x122a660; sret score=8; ['reads-rsi-this']; FDE=(19048032, 19048261)
- +0xc0 -> 0x122aa22; boolish score=1; []; FDE=(19048994, 19049103)
- materializations:
  - 0x11f16cb: lea    rcx,[rip+0x66b906]        # 185cfd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x196c0>; FDE=(18805556, 18832116)
### +0x68 body
      bea56e:	6a 02                	push   0x2
      bea570:	58                   	pop    rax
      bea571:	c3                   	ret
### +0xb8 body head
     122a660:	41 57                	push   r15
     122a662:	41 56                	push   r14
     122a664:	53                   	push   rbx
     122a665:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
     122a66c:	49 89 d6             	mov    r14,rdx
     122a66f:	48 89 fb             	mov    rbx,rdi
     122a672:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     122a679:	00 00 
     122a67b:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     122a682:	00 
     122a683:	4c 8b 3e             	mov    r15,QWORD PTR [rsi]
     122a686:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     122a68a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     122a68f:	e8 bc 1f e6 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
     122a694:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     122a699:	4c 89 f6             	mov    rsi,r14
     122a69c:	e8 9f 38 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     122a6a1:	0f 57 c0             	xorps  xmm0,xmm0
     122a6a4:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     122a6a9:	41 0f 11 46 60       	movups XMMWORD PTR [r14+0x60],xmm0
     122a6ae:	49 83 66 70 00       	and    QWORD PTR [r14+0x70],0x0
     122a6b3:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
     122a6b7:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     122a6ba:	0f 10 48 09          	movups xmm1,XMMWORD PTR [rax+0x9]
     122a6be:	41 0f 11 8e 81 00 00 	movups XMMWORD PTR [r14+0x81],xmm1
     122a6c5:	00 
     122a6c6:	41 0f 11 46 78       	movups XMMWORD PTR [r14+0x78],xmm0
     122a6cb:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
     122a6cf:	8a 00                	mov    al,BYTE PTR [rax]
     122a6d1:	41 88 86 98 00 00 00 	mov    BYTE PTR [r14+0x98],al
     122a6d8:	48 89 df             	mov    rdi,rbx
     122a6db:	4c 89 f6             	mov    rsi,r14
     122a6de:	e8 63 00 00 00       	call   122a746 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fcca>
     122a6e3:	c7 83 90 02 00 00 02 	mov    DWORD PTR [rbx+0x290],0x2
     122a6ea:	00 00 00 
     122a6ed:	4c 89 f7             	mov    rdi,r14
     122a6f0:	e8 0b 9f ff ff       	call   1224600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69b84>
     122a6f5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     122a6fc:	00 00 
     122a6fe:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     122a705:	00 
     122a706:	75 38                	jne    122a740 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fcc4>
     122a708:	48 89 d8             	mov    rax,rbx
     122a70b:	48 81 c4 b0 00 00 00 	add    rsp,0xb0
     122a712:	5b                   	pop    rbx
     122a713:	41 5e                	pop    r14
     122a715:	41 5f                	pop    r15
     122a717:	c3                   	ret
     122a718:	48 89 c3             	mov    rbx,rax
     122a71b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     122a720:	e8 a7 40 87 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     122a725:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     122a72c:	00 00 
     122a72e:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     122a735:	00 
     122a736:	75 08                	jne    122a740 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fcc4>
     122a738:	48 89 df             	mov    rdi,rbx
     122a73b:	e8 90 55 84 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     122a740:	e8 6b 53 5c 00       	call   17efab0 <__stack_chk_fail@plt>

## score=66 address-point=0x185c748
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120c85a; boolish score=0; []; FDE=(18925658, 18925676)
- +0xb8 -> 0x1210814; sret score=8; ['reads-rsi-this']; FDE=(18941972, 18942039)
- +0xc0 -> 0x1210858; boolish score=1; []; FDE=(18942040, 18942105)
- materializations:
  - 0x120aa51: lea    rax,[rip+0x651cf0]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>; FDE=(18917358, 18918225)
  - 0x120b05c: lea    rax,[rip+0x6516e5]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>; FDE=(18919516, 18919535)
  - 0x120b08e: lea    rcx,[rip+0x6516b3]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>; FDE=(18919554, 18919600)
  - 0x120b0b0: lea    rax,[rip+0x651691]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>; FDE=(18919600, 18919637)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
     1210814:	83 fa 04             	cmp    edx,0x4
     1210817:	77 19                	ja     1210832 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55db6>
     1210819:	89 d0                	mov    eax,edx
     121081b:	48 8d 0d 7a 71 18 ff 	lea    rcx,[rip+0xffffffffff18717a]        # 39799c <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x457d>
     1210822:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
     1210826:	48 01 c8             	add    rax,rcx
     1210829:	ff e0                	jmp    rax
     121082b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     121082e:	48 89 06             	mov    QWORD PTR [rsi],rax
     1210831:	c3                   	ret
     1210832:	48 8d 05 cf 39 70 00 	lea    rax,[rip+0x7039cf]        # 1914208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b618>
     1210839:	48 89 06             	mov    QWORD PTR [rsi],rax
     121083c:	66 83 66 08 00       	and    WORD PTR [rsi+0x8],0x0
     1210841:	c3                   	ret
     1210842:	48 8d 05 bf 39 70 00 	lea    rax,[rip+0x7039bf]        # 1914208 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b618>
     1210849:	48 39 06             	cmp    QWORD PTR [rsi],rax
     121084c:	74 05                	je     1210853 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55dd7>
     121084e:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     1210852:	c3                   	ret
     1210853:	48 89 3e             	mov    QWORD PTR [rsi],rdi
     1210856:	c3                   	ret

## score=59 address-point=0x185ca28
- +0x68 -> 0x1217f16; no-extra score=15; incoming-extra=[]; FDE=(18972438, 18972446)
- +0x98 -> 0x1217e5a; boolish score=1; []; FDE=(18972250, 18972258)
- +0xb8 -> 0x1217e3a; sret score=0; []; FDE=(18972218, 18972234)
- +0xc0 -> 0x1217e4a; boolish score=1; []; FDE=(18972234, 18972250)
- materializations:
  - 0x1217069: lea    rax,[rip+0x6459b8]        # 185ca28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19110>; FDE=(18968662, 18968882)
### +0x68 body
     1217f16:	48 8d 87 dc 01 00 00 	lea    rax,[rdi+0x1dc]
     1217f1d:	c3                   	ret
### +0xb8 body head
     1217e3a:	50                   	push   rax
     1217e3b:	48 89 f7             	mov    rdi,rsi
     1217e3e:	48 89 d6             	mov    rsi,rdx
     1217e41:	e8 02 f5 bf ff       	call   e17348 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe43ce>
     1217e46:	34 01                	xor    al,0x1
     1217e48:	59                   	pop    rcx
     1217e49:	c3                   	ret

## score=58 address-point=0x18a1e28
- +0x68 -> 0x174ec6a; no-extra score=15; incoming-extra=[]; FDE=(24439914, 24439919)
- +0x98 -> 0x1739a20; boolish score=0; []; FDE=(24353312, 24353331)
- +0xb8 -> 0x16b64b8; sret score=0; []; FDE=(23815352, 23815377)
- +0xc0 -> 0xabf4f8; boolish score=1; []; FDE=(11269368, 11269395)
- materializations:
  - 0xe898e7: lea    rax,[rip+0xa1853a]        # 18a1e28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xed68>; FDE=(15243408, 15243731)
  - 0x120bfe3: lea    rax,[rip+0x695e3e]        # 18a1e28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xed68>; FDE=(18923454, 18923750)
  - 0x16b6431: lea    rcx,[rip+0x1eb9f0]        # 18a1e28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xed68>; FDE=(23815210, 23815243)
### +0x68 body
     174ec6a:	e9 3f 31 00 00       	jmp    1751dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105f1a>
### +0xb8 body head
     16b64b8:	0f 18 0d d9 66 2f 00 	prefetcht0 BYTE PTR [rip+0x2f66d9]        # 19acb98 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x757e0>
     16b64bf:	48 8d 05 d2 66 2f 00 	lea    rax,[rip+0x2f66d2]        # 19acb98 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x757e0>
     16b64c6:	48 8b 0d d3 66 2f 00 	mov    rcx,QWORD PTR [rip+0x2f66d3]        # 19acba0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x757e8>
     16b64cd:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     16b64d0:	c3                   	ret

## score=58 address-point=0x188fb80
- +0x68 -> 0x174ec6a; no-extra score=15; incoming-extra=[]; FDE=(24439914, 24439919)
- +0x98 -> 0xc87172; boolish score=1; []; FDE=(13136242, 13136381)
- +0xb8 -> 0x162bed0; sret score=0; []; FDE=(23248592, 23248617)
- +0xc0 -> 0x174ef82; boolish score=0; []; FDE=(24440706, 24441307)
- materializations:
  - 0x10469b0: lea    rcx,[rip+0x8491c9]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(17061754, 17068268)
  - 0x117fb30: lea    rax,[rip+0x710049]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18348504, 18350127)
  - 0x1181079: lea    rax,[rip+0x70eb00]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18354060, 18354856)
  - 0x1182709: lea    rax,[rip+0x70d470]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18359778, 18361597)
  - 0x1185427: lea    rax,[rip+0x70a752]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18371377, 18372358)
  - 0x1194d2e: lea    rax,[rip+0x6fae4b]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18435340, 18435546)
  - 0x1195a41: lea    rax,[rip+0x6fa138]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18438320, 18439749)
  - 0x119706b: lea    rax,[rip+0x6f8b0e]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18444040, 18445854)
  - 0x1199a64: lea    rax,[rip+0x6f6115]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18454891, 18455814)
  - 0x11a9ba0: lea    rax,[rip+0x6e5fd9]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18520686, 18521675)
  - 0x11f2619: lea    rax,[rip+0x69d560]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(18805556, 18832116)
  - 0x131e7c2: lea    rax,[rip+0x5713b7]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>; FDE=(20047622, 20048255)
### +0x68 body
     174ec6a:	e9 3f 31 00 00       	jmp    1751dae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x105f1a>
### +0xb8 body head
     162bed0:	0f 18 0d f1 21 33 00 	prefetcht0 BYTE PTR [rip+0x3321f1]        # 195e0c8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26d10>
     162bed7:	48 8d 05 ea 21 33 00 	lea    rax,[rip+0x3321ea]        # 195e0c8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26d10>
     162bede:	48 8b 0d eb 21 33 00 	mov    rcx,QWORD PTR [rip+0x3321eb]        # 195e0d0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26d18>
     162bee5:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     162bee8:	c3                   	ret

## score=58 address-point=0x1875aa0
- +0x68 -> 0x148b1d6; no-extra score=15; incoming-extra=[]; FDE=(21541334, 21541343)
- +0x98 -> 0xa50370; boolish score=0; []; FDE=(10814320, 10814325)
- +0xb8 -> 0xa50370; sret score=0; []; FDE=(10814320, 10814325)
- +0xc0 -> 0x1491eb0; boolish score=1; []; FDE=(21569200, 21569327)
- materializations:
  - 0x12040e1: lea    rcx,[rip+0x6719b8]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>; FDE=(18890726, 18891287)
  - 0x123b41f: lea    rax,[rip+0x63a67a]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>; FDE=(19117082, 19117139)
  - 0x123dd20: lea    rcx,[rip+0x637d79]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>; FDE=(19122204, 19140568)
  - 0x1254c51: lea    r13,[rip+0x620e48]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>; FDE=(19220886, 19222500)
  - 0x1481837: lea    rcx,[rip+0x3f4262]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>; FDE=(21502000, 21502027)
### +0x68 body
     148b1d6:	48 83 c7 08          	add    rdi,0x8
     148b1da:	e9 cf 11 64 ff       	jmp    acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
### +0xb8 body head
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185ec50
- +0x68 -> 0x125fb16; no-extra score=15; incoming-extra=[]; FDE=(19266326, 19266493)
- +0x98 -> 0x125fe26; boolish score=0; []; FDE=(19267110, 19267802)
- +0xb8 -> 0xa50370; sret score=0; []; FDE=(10814320, 10814325)
- +0xc0 -> 0x125f278; boolish score=1; []; FDE=(19264120, 19264152)
- materializations:
  - 0x11efdc5: lea    rcx,[rip+0x66ee84]        # 185ec50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b338>; FDE=(18805556, 18832116)
### +0x68 body
     125fb16:	41 56                	push   r14
     125fb18:	53                   	push   rbx
     125fb19:	48 83 ec 28          	sub    rsp,0x28
     125fb1d:	48 89 fb             	mov    rbx,rdi
     125fb20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125fb27:	00 00 
     125fb29:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     125fb2e:	48 8b 76 38          	mov    rsi,QWORD PTR [rsi+0x38]
     125fb32:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     125fb35:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     125fb3a:	4c 89 f7             	mov    rdi,r14
     125fb3d:	ff 50 70             	call   QWORD PTR [rax+0x70]
     125fb40:	49 83 7e 10 00       	cmp    QWORD PTR [r14+0x10],0x0
     125fb45:	74 19                	je     125fb60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa50e4>
     125fb47:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     125fb4c:	48 89 df             	mov    rdi,rbx
     125fb4f:	e8 30 9c 8e ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     125fb54:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     125fb59:	e8 88 42 8d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     125fb5e:	eb 18                	jmp    125fb78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa50fc>
     125fb60:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     125fb65:	e8 7c 42 8d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     125fb6a:	48 8d 43 08          	lea    rax,[rbx+0x8]
     125fb6e:	0f 57 c0             	xorps  xmm0,xmm0
     125fb71:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     125fb75:	48 89 03             	mov    QWORD PTR [rbx],rax
     125fb78:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125fb7f:	00 00 
     125fb81:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     125fb86:	75 30                	jne    125fbb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa513c>
     125fb88:	48 89 d8             	mov    rax,rbx
     125fb8b:	48 83 c4 28          	add    rsp,0x28
     125fb8f:	5b                   	pop    rbx
     125fb90:	41 5e                	pop    r14
     125fb92:	c3                   	ret
     125fb93:	48 89 c3             	mov    rbx,rax
     125fb96:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     125fb9b:	e8 46 42 8d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     125fba0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125fba7:	00 00 
     125fba9:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     125fbae:	75 08                	jne    125fbb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa513c>
     125fbb0:	48 89 df             	mov    rdi,rbx
     125fbb3:	e8 18 01 81 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     125fbb8:	e8 f3 fe 58 00       	call   17efab0 <__stack_chk_fail@plt>
### +0xb8 body head
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185e8b8
- +0x68 -> 0x125bd8e; no-extra score=15; incoming-extra=[]; FDE=(19250574, 19250584)
- +0x98 -> 0xda8880; boolish score=0; []; FDE=(14321792, 14321803)
- +0xb8 -> 0xda8880; sret score=0; []; FDE=(14321792, 14321803)
- +0xc0 -> 0x125bcf6; boolish score=1; []; FDE=(19250422, 19250479)
- materializations:
  - 0x11f1b9b: lea    rax,[rip+0x66cd16]        # 185e8b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1afa0>; FDE=(18805556, 18832116)
### +0x68 body
     125bd8e:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     125bd92:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     125bd95:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### +0xb8 body head
      da8880:	48 89 f7             	mov    rdi,rsi
      da8883:	48 89 d6             	mov    rsi,rdx
      da8886:	e9 63 6e cf ff       	jmp    a9f6ee <JNI_OnUnload@@Base+0x26fbb>

## score=58 address-point=0x185c700
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120ae04; boolish score=0; []; FDE=(18918916, 18918934)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120ae6a; boolish score=1; []; FDE=(18919018, 18919151)
- materializations:
  - 0x120a71e: lea    rax,[rip+0x651fdb]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>; FDE=(18916824, 18917358)
  - 0x120b15c: lea    rax,[rip+0x65159d]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>; FDE=(18919772, 18919791)
  - 0x120b18e: lea    rcx,[rip+0x65156b]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>; FDE=(18919810, 18919856)
  - 0x120b1b0: lea    rax,[rip+0x651549]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>; FDE=(18919856, 18919893)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c6b8
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b070; boolish score=0; []; FDE=(18919536, 18919554)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b0d6; boolish score=1; []; FDE=(18919638, 18919771)
- materializations:
  - 0x1208161: lea    rax,[rip+0x654550]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>; FDE=(18907452, 18907604)
  - 0x120c884: lea    rax,[rip+0x64fe2d]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>; FDE=(18925700, 18925719)
  - 0x120c8b6: lea    rcx,[rip+0x64fdfb]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>; FDE=(18925738, 18925784)
  - 0x120c8d8: lea    rax,[rip+0x64fdd9]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>; FDE=(18925784, 18925821)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c670
- +0x68 -> 0xaae9b2; no-extra score=15; incoming-extra=[]; FDE=(11200946, 11200955)
- +0x98 -> 0x120b170; boolish score=0; []; FDE=(18919792, 18919810)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b1d6; boolish score=1; []; FDE=(18919894, 18920027)
- materializations:
  - 0x120a425: lea    rax,[rip+0x652244]        # 185c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18d58>; FDE=(18915990, 18916595)
  - 0x120b25c: lea    rax,[rip+0x65140d]        # 185c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18d58>; FDE=(18920028, 18920047)
  - 0x120b28e: lea    rcx,[rip+0x6513db]        # 185c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18d58>; FDE=(18920066, 18920112)
  - 0x120b2b0: lea    rax,[rip+0x6513b9]        # 185c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18d58>; FDE=(18920112, 18920149)
### +0x68 body
      aae9b2:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aae9b6:	e9 cb fa fe ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c628
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120c898; boolish score=0; []; FDE=(18925720, 18925738)
- +0xb8 -> 0xaae9bc; sret score=0; []; FDE=(11200956, 11200978)
- +0xc0 -> 0x120c8fe; boolish score=1; []; FDE=(18925822, 18925918)
- materializations:
  - 0x120a1bd: lea    rax,[rip+0x652464]        # 185c628 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18d10>; FDE=(18915188, 18915989)
  - 0x120b35c: lea    rax,[rip+0x6512c5]        # 185c628 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18d10>; FDE=(18920284, 18920303)
  - 0x120b38e: lea    rcx,[rip+0x651293]        # 185c628 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18d10>; FDE=(18920322, 18920368)
  - 0x120b3b0: lea    rax,[rip+0x651271]        # 185c628 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18d10>; FDE=(18920368, 18920405)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aae9bc:	53                   	push   rbx
      aae9bd:	48 89 fb             	mov    rbx,rdi
      aae9c0:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aae9c4:	e8 bd fa fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      aae9c9:	48 89 df             	mov    rdi,rbx
      aae9cc:	5b                   	pop    rbx
      aae9cd:	e9 4e f5 d3 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c5e0
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b270; boolish score=0; []; FDE=(18920048, 18920066)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b2d6; boolish score=1; []; FDE=(18920150, 18920283)
- materializations:
  - 0x1209ea8: lea    rax,[rip+0x652731]        # 185c5e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18cc8>; FDE=(18914656, 18915188)
  - 0x120b45c: lea    rax,[rip+0x65117d]        # 185c5e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18cc8>; FDE=(18920540, 18920559)
  - 0x120b48e: lea    rcx,[rip+0x65114b]        # 185c5e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18cc8>; FDE=(18920578, 18920624)
  - 0x120b4b0: lea    rax,[rip+0x651129]        # 185c5e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18cc8>; FDE=(18920624, 18920661)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c598
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b370; boolish score=0; []; FDE=(18920304, 18920322)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b3d6; boolish score=1; []; FDE=(18920406, 18920539)
- materializations:
  - 0x1209c94: lea    rax,[rip+0x6528fd]        # 185c598 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18c80>; FDE=(18914124, 18914656)
  - 0x120b55c: lea    rax,[rip+0x651035]        # 185c598 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18c80>; FDE=(18920796, 18920815)
  - 0x120b58e: lea    rcx,[rip+0x651003]        # 185c598 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18c80>; FDE=(18920834, 18920880)
  - 0x120b5b0: lea    rax,[rip+0x650fe1]        # 185c598 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18c80>; FDE=(18920880, 18920917)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c550
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b470; boolish score=0; []; FDE=(18920560, 18920578)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b4d6; boolish score=1; []; FDE=(18920662, 18920795)
- materializations:
  - 0x1209a80: lea    rax,[rip+0x652ac9]        # 185c550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18c38>; FDE=(18913592, 18914124)
  - 0x120b65c: lea    rax,[rip+0x650eed]        # 185c550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18c38>; FDE=(18921052, 18921071)
  - 0x120b68e: lea    rcx,[rip+0x650ebb]        # 185c550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18c38>; FDE=(18921090, 18921136)
  - 0x120b6b0: lea    rax,[rip+0x650e99]        # 185c550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18c38>; FDE=(18921136, 18921173)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c508
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b570; boolish score=0; []; FDE=(18920816, 18920834)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b5d6; boolish score=1; []; FDE=(18920918, 18921051)
- materializations:
  - 0x1209866: lea    rax,[rip+0x652c9b]        # 185c508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18bf0>; FDE=(18912700, 18913592)
  - 0x120b75c: lea    rax,[rip+0x650da5]        # 185c508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18bf0>; FDE=(18921308, 18921327)
  - 0x120b78e: lea    rcx,[rip+0x650d73]        # 185c508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18bf0>; FDE=(18921346, 18921392)
  - 0x120b7b0: lea    rax,[rip+0x650d51]        # 185c508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18bf0>; FDE=(18921392, 18921429)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c4c0
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b670; boolish score=0; []; FDE=(18921072, 18921090)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b6d6; boolish score=1; []; FDE=(18921174, 18921307)
- materializations:
  - 0x12094ef: lea    rax,[rip+0x652fca]        # 185c4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18ba8>; FDE=(18912168, 18912700)
  - 0x120b85c: lea    rax,[rip+0x650c5d]        # 185c4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18ba8>; FDE=(18921564, 18921583)
  - 0x120b88e: lea    rcx,[rip+0x650c2b]        # 185c4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18ba8>; FDE=(18921602, 18921648)
  - 0x120b8b0: lea    rax,[rip+0x650c09]        # 185c4c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18ba8>; FDE=(18921648, 18921685)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c478
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b770; boolish score=0; []; FDE=(18921328, 18921346)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b7d6; boolish score=1; []; FDE=(18921430, 18921563)
- materializations:
  - 0x12092db: lea    rax,[rip+0x653196]        # 185c478 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18b60>; FDE=(18911530, 18912167)
  - 0x120b95c: lea    rax,[rip+0x650b15]        # 185c478 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18b60>; FDE=(18921820, 18921839)
  - 0x120b98e: lea    rcx,[rip+0x650ae3]        # 185c478 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18b60>; FDE=(18921858, 18921904)
  - 0x120b9b0: lea    rax,[rip+0x650ac1]        # 185c478 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18b60>; FDE=(18921904, 18921941)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c430
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b870; boolish score=0; []; FDE=(18921584, 18921602)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b8d6; boolish score=1; []; FDE=(18921686, 18921819)
- materializations:
  - 0x120905b: lea    rax,[rip+0x6533ce]        # 185c430 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18b18>; FDE=(18910922, 18911529)
  - 0x120ba5c: lea    rax,[rip+0x6509cd]        # 185c430 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18b18>; FDE=(18922076, 18922095)
  - 0x120ba8e: lea    rcx,[rip+0x65099b]        # 185c430 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18b18>; FDE=(18922114, 18922160)
  - 0x120bab0: lea    rax,[rip+0x650979]        # 185c430 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18b18>; FDE=(18922160, 18922197)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c3e8
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120b970; boolish score=0; []; FDE=(18921840, 18921858)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120b9d6; boolish score=1; []; FDE=(18921942, 18922075)
- materializations:
  - 0x1208dfb: lea    rax,[rip+0x6535e6]        # 185c3e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18ad0>; FDE=(18910324, 18910921)
  - 0x120bb5c: lea    rax,[rip+0x650885]        # 185c3e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18ad0>; FDE=(18922332, 18922351)
  - 0x120bb8e: lea    rcx,[rip+0x650853]        # 185c3e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18ad0>; FDE=(18922370, 18922416)
  - 0x120bbb0: lea    rax,[rip+0x650831]        # 185c3e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18ad0>; FDE=(18922416, 18922453)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c3a0
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120ba70; boolish score=0; []; FDE=(18922096, 18922114)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120bad6; boolish score=1; []; FDE=(18922198, 18922331)
- materializations:
  - 0x1208ba5: lea    rax,[rip+0x6537f4]        # 185c3a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18a88>; FDE=(18909732, 18910324)
  - 0x120bc5c: lea    rax,[rip+0x65073d]        # 185c3a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18a88>; FDE=(18922588, 18922607)
  - 0x120bc8e: lea    rcx,[rip+0x65070b]        # 185c3a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18a88>; FDE=(18922626, 18922672)
  - 0x120bcb0: lea    rax,[rip+0x6506e9]        # 185c3a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18a88>; FDE=(18922672, 18922709)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c358
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120bb70; boolish score=0; []; FDE=(18922352, 18922370)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120bbd6; boolish score=1; []; FDE=(18922454, 18922587)
- materializations:
  - 0x1208955: lea    rax,[rip+0x6539fc]        # 185c358 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18a40>; FDE=(18909140, 18909732)
  - 0x120bd5c: lea    rax,[rip+0x6505f5]        # 185c358 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18a40>; FDE=(18922844, 18922863)
  - 0x120bd8e: lea    rcx,[rip+0x6505c3]        # 185c358 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18a40>; FDE=(18922882, 18922928)
  - 0x120bdb0: lea    rax,[rip+0x6505a1]        # 185c358 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18a40>; FDE=(18922928, 18922965)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x185c310
- +0x68 -> 0xaaaedc; no-extra score=15; incoming-extra=[]; FDE=(11185884, 11185893)
- +0x98 -> 0x120bc70; boolish score=0; []; FDE=(18922608, 18922626)
- +0xb8 -> 0xaaaee6; sret score=0; []; FDE=(11185894, 11185916)
- +0xc0 -> 0x120bcd6; boolish score=1; []; FDE=(18922710, 18922843)
- materializations:
  - 0x12086ed: lea    rax,[rip+0x653c1c]        # 185c310 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x189f8>; FDE=(18908716, 18909139)
  - 0x120be5c: lea    rax,[rip+0x6504ad]        # 185c310 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x189f8>; FDE=(18923100, 18923119)
  - 0x120be8e: lea    rcx,[rip+0x65047b]        # 185c310 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x189f8>; FDE=(18923138, 18923184)
  - 0x120beb0: lea    rax,[rip+0x650459]        # 185c310 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x189f8>; FDE=(18923184, 18923221)
### +0x68 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
      aaaee6:	53                   	push   rbx
      aaaee7:	48 89 fb             	mov    rbx,rdi
      aaaeea:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaeee:	e8 bf 35 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      aaaef3:	48 89 df             	mov    rdi,rbx
      aaaef6:	5b                   	pop    rbx
      aaaef7:	e9 24 30 d4 00       	jmp    17edf20 <_ZdlPv@plt>

## score=58 address-point=0x18008d0
- +0x68 -> 0xacc64a; no-extra score=15; incoming-extra=[]; FDE=(11322954, 11322962)
- +0x98 -> 0xacc74a; boolish score=1; []; FDE=(11323210, 11323218)
- +0xb8 -> 0xacc752; sret score=0; []; FDE=(11323218, 11323227)
- +0xc0 -> 0xacc75c; boolish score=0; []; FDE=(11323228, 11323237)
- materializations:
  - 0xaca35f: lea    rax,[rip+0xd3656a]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11312454, 11320510)
  - 0xacc7aa: lea    rax,[rip+0xd3411f]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11323306, 11323321)
  - 0xad3d0c: lea    rax,[rip+0xd2cbbd]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11344500, 11358295)
  - 0xade7ca: lea    rcx,[rip+0xd220ff]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11397041, 11397106)
  - 0xb08222: lea    rcx,[rip+0xcf86a7]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11567631, 11567678)
  - 0xb3f142: lea    rcx,[rip+0xcc1787]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11792687, 11792739)
  - 0xb65709: lea    rcx,[rip+0xc9b1c0]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11949814, 11949866)
  - 0xb659f5: lea    rcx,[rip+0xc9aed4]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11950556, 11950621)
  - 0xb6e28e: lea    rcx,[rip+0xc9263b]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(11985525, 11985584)
  - 0xbd9370: lea    rcx,[rip+0xc27559]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(12423824, 12424667)
  - 0xc89383: lea    rcx,[rip+0xb77546]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(13143560, 13145564)
  - 0xc8ff50: lea    rax,[rip+0xb70979]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>; FDE=(13172488, 13172987)
### +0x68 body
      acc64a:	48 8b 87 f0 02 00 00 	mov    rax,QWORD PTR [rdi+0x2f0]
      acc651:	c3                   	ret
### +0xb8 body head
      acc752:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
      acc756:	e9 e7 fc ff ff       	jmp    acc442 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193e2>

## score=57 address-point=0x18a2490
- +0x68 -> 0x174f1dc; no-extra score=15; incoming-extra=[]; FDE=(24441308, 24442309)
- +0x98 -> 0xabedce; boolish score=0; []; FDE=(11267534, 11267560)
- +0xb8 -> 0x16b7992; sret score=0; []; FDE=(23820690, 23820715)
- +0xc0 -> 0x174ef82; boolish score=0; []; FDE=(24440706, 24441307)
- materializations:
  - 0xe85647: lea    rdx,[rip+0xa1ce42]        # 18a2490 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf3d0>; FDE=(15226330, 15227034)
  - 0xe89c2d: lea    rax,[rip+0xa1885c]        # 18a2490 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf3d0>; FDE=(15244282, 15245156)
  - 0x120c990: lea    rcx,[rip+0x695af9]        # 18a2490 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf3d0>; FDE=(18925918, 18926813)
  - 0x120cc3c: lea    rax,[rip+0x69584d]        # 18a2490 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf3d0>; FDE=(18925918, 18926813)
  - 0x120cd13: lea    rax,[rip+0x695776]        # 18a2490 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf3d0>; FDE=(18926813, 18927030)
  - 0x16b7479: lea    rcx,[rip+0x1eb010]        # 18a2490 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf3d0>; FDE=(23819378, 23819424)
### +0x68 body
     174f1dc:	55                   	push   rbp
     174f1dd:	41 57                	push   r15
     174f1df:	41 56                	push   r14
     174f1e1:	41 55                	push   r13
     174f1e3:	41 54                	push   r12
     174f1e5:	53                   	push   rbx
     174f1e6:	48 83 ec 48          	sub    rsp,0x48
     174f1ea:	48 89 fb             	mov    rbx,rdi
     174f1ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     174f1f4:	00 00 
     174f1f6:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     174f1fb:	e8 da f9 ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
     174f200:	48 89 c5             	mov    rbp,rax
     174f203:	48 89 df             	mov    rdi,rbx
     174f206:	e8 cf f9 ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
     174f20b:	0f 57 c0             	xorps  xmm0,xmm0
     174f20e:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     174f214:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     174f219:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
     174f21d:	80 78 53 00          	cmp    BYTE PTR [rax+0x53],0x0
     174f221:	74 3f                	je     174f262 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033ce>
     174f223:	83 7d 08 00          	cmp    DWORD PTR [rbp+0x8],0x0
     174f227:	7e 4c                	jle    174f275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033e1>
     174f229:	45 31 f6             	xor    r14d,r14d
     174f22c:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     174f231:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
     174f236:	45 31 ed             	xor    r13d,r13d
     174f239:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
     174f23d:	4c 01 f0             	add    rax,r14
     174f240:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     174f245:	4c 89 ff             	mov    rdi,r15
     174f248:	4c 89 e6             	mov    rsi,r12
     174f24b:	e8 5a 05 35 ff       	call   a9f7aa <JNI_OnUnload@@Base+0x27077>
     174f250:	49 ff c5             	inc    r13
     174f253:	48 63 45 08          	movsxd rax,DWORD PTR [rbp+0x8]
     174f257:	49 83 c6 58          	add    r14,0x58
     174f25b:	49 39 c5             	cmp    r13,rax
     174f25e:	7c d9                	jl     174f239 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033a5>
     174f260:	eb 13                	jmp    174f275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1033e1>
     174f262:	48 8d 44 24 20       	lea    rax,[rsp+0x20]
     174f267:	48 89 d7             	mov    rdi,rdx
     174f26a:	48 89 de             	mov    rsi,rbx
     174f26d:	48 89 c2             	mov    rdx,rax
     174f270:	e8 a1 ed fe ff       	call   173e016 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2182>
     174f275:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
     174f27a:	48 8b 6c 24 20       	mov    rbp,QWORD PTR [rsp+0x20]
     174f27f:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     174f284:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     174f289:	45 31 ed             	xor    r13d,r13d
     174f28c:	48 39 c5             	cmp    rbp,rax
     174f28f:	0f 84 7f 01 00 00    	je     174f414 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103580>
     174f295:	4c 8b 7d 00          	mov    r15,QWORD PTR [rbp+0x0]
     174f299:	48 89 df             	mov    rdi,rbx
     174f29c:	e8 39 f9 ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
     174f2a1:	49 89 d4             	mov    r12,rdx
     174f2a4:	41 8a 47 01          	mov    al,BYTE PTR [r15+0x1]
     174f2a8:	a8 08                	test   al,0x8
     174f2aa:	74 73                	je     174f31f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10348b>
     174f2ac:	49 8b 4f 20          	mov    rcx,QWORD PTR [r15+0x20]
     174f2b0:	48 8b 49 28          	mov    rcx,QWORD PTR [rcx+0x28]
     174f2b4:	80 79 50 00          	cmp    BYTE PTR [rcx+0x50],0x0
     174f2b8:	74 65                	je     174f31f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10348b>
     174f2ba:	a8 20                	test   al,0x20
     174f2bc:	75 61                	jne    174f31f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10348b>
     174f2be:	41 8a 4f 02          	mov    cl,BYTE PTR [r15+0x2]
     174f2c2:	80 c1 f4             	add    cl,0xf4
     174f2c5:	80 f9 fe             	cmp    cl,0xfe
     174f2c8:	72 55                	jb     174f31f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10348b>
     174f2ca:	48 89 df             	mov    rdi,rbx
     174f2cd:	e8 08 f9 ff ff       	call   174ebda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d46>
     174f2d2:	45 8b 77 04          	mov    r14d,DWORD PTR [r15+0x4]
     174f2d6:	48 89 d7             	mov    rdi,rdx
     174f2d9:	48 89 de             	mov    rsi,rbx
     174f2dc:	4c 89 fa             	mov    rdx,r15
     174f2df:	e8 d2 33 ff ff       	call   17426b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf6822>
     174f2e4:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     174f2e7:	48 89 c7             	mov    rdi,rax
     174f2ea:	ff 51 18             	call   QWORD PTR [rcx+0x18]
     174f2ed:	41 83 ce 01          	or     r14d,0x1
     174f2f1:	41 0f bd ce          	bsr    ecx,r14d
     174f2f5:	8d 0c c9             	lea    ecx,[rcx+rcx*8]
     174f2f8:	83 c1 49             	add    ecx,0x49
     174f2fb:	c1 e9 06             	shr    ecx,0x6
     174f2fe:	89 c2                	mov    edx,eax
     174f300:	83 ca 01             	or     edx,0x1
     174f303:	0f bd d2             	bsr    edx,edx
     174f306:	8d 14 d2             	lea    edx,[rdx+rdx*8]
     174f309:	83 c2 49             	add    edx,0x49
     174f30c:	c1 ea 06             	shr    edx,0x6
     174f30f:	48 01 c1             	add    rcx,rax
     174f312:	48 8d 04 0a          	lea    rax,[rdx+rcx*1]
     174f316:	48 83 c0 04          	add    rax,0x4
     174f31a:	e9 e3 00 00 00       	jmp    174f402 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10356e>
     174f31f:	a8 20                	test   al,0x20
     174f321:	75 26                	jne    174f349 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1034b5>
     174f323:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     174f327:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     174f32b:	80 78 53 00          	cmp    BYTE PTR [rax+0x53],0x0
     174f32f:	6a 01                	push   0x1
     174f331:	41 5e                	pop    r14
     174f333:	75 64                	jne    174f399 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103505>
     174f335:	4c 89 e7             	mov    rdi,r12
     174f338:	48 89 de             	mov    rsi,rbx
     174f33b:	4c 89 fa             	mov    rdx,r15
     174f33e:	e8 e3 e9 fe ff       	call   173dd26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf1e92>
     174f343:	44 0f b6 f0          	movzx  r14d,al
     174f347:	eb 50                	jmp    174f399 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103505>
     174f349:	41 f6 47 03 10       	test   BYTE PTR [r15+0x3],0x10
     174f34e:	75 10                	jne    174f360 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1034cc>
     174f350:	4c 89 e7             	mov    rdi,r12
     174f353:	48 89 de             	mov    rsi,rbx
     174f356:	4c 89 fa             	mov    rdx,r15
     174f359:	e8 5a ea fe ff       	call   173ddb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf1f24>
     174f35e:	eb 36                	jmp    174f396 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x103502>
     174f360:	4c 89 e7             	mov    rdi,r12
     174f363:	48 89 de             	mov    rsi,rbx
     174f366:	4c 89 fa             	mov    rdx,r15
     174f369:	e8 4e 41 ff ff       	call   17434bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7628>
     174f36e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     174f371:	f6 c1 01             	test   cl,0x1
### +0xb8 body head
     16b7992:	0f 18 0d a7 79 2f 00 	prefetcht0 BYTE PTR [rip+0x2f79a7]        # 19af340 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x77f88>
     16b7999:	48 8d 05 a0 79 2f 00 	lea    rax,[rip+0x2f79a0]        # 19af340 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x77f88>
     16b79a0:	48 8b 0d a1 79 2f 00 	mov    rcx,QWORD PTR [rip+0x2f79a1]        # 19af348 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x77f90>
     16b79a7:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     16b79aa:	c3                   	ret

## score=57 address-point=0x1875a58
- +0x68 -> 0x1481816; no-extra score=15; incoming-extra=[]; FDE=(21501974, 21501999)
- +0x98 -> 0x148b10a; boolish score=0; []; FDE=(21541130, 21541148)
- +0xb8 -> 0x148b1e0; sret score=0; []; FDE=(21541344, 21541366)
- +0xc0 -> 0x148b1f6; boolish score=0; []; FDE=(21541366, 21549038)
- materializations:
  - 0x10426fd: lea    rax,[rip+0x833354]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(17048880, 17049616)
  - 0x1042f8d: lea    rax,[rip+0x832ac4]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(17051528, 17051585)
  - 0x1043015: lea    rax,[rip+0x832a3c]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(17051658, 17051788)
  - 0x10439db: lea    rbp,[rip+0x832076]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(17054076, 17054732)
  - 0x1043b26: lea    r12,[rip+0x831f2b]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(17054076, 17054732)
  - 0x10d71f0: lea    rax,[rip+0x79e861]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(17658278, 17658665)
  - 0x10d787d: lea    rax,[rip+0x79e1d4]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(17659947, 17660320)
  - 0x10d8fe5: lea    rcx,[rip+0x79ca6c]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(17665988, 17666049)
  - 0x12064cc: lea    rax,[rip+0x66f585]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(18900130, 18900319)
  - 0x123e80d: lea    rax,[rip+0x637244]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(19122204, 19140568)
  - 0x131d074: lea    rax,[rip+0x5589dd]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(20041770, 20042090)
  - 0x1481801: lea    rcx,[rip+0x3f4250]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(21501946, 21501973)
### +0x68 body
     1481816:	0f 18 0d c3 6c 4a 00 	prefetcht0 BYTE PTR [rip+0x4a6cc3]        # 19284e0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f8f0>
     148181d:	48 8d 05 bc 6c 4a 00 	lea    rax,[rip+0x4a6cbc]        # 19284e0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f8f0>
     1481824:	48 8b 0d bd 6c 4a 00 	mov    rcx,QWORD PTR [rip+0x4a6cbd]        # 19284e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f8f8>
     148182b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     148182e:	c3                   	ret
### +0xb8 body head
     148b1e0:	53                   	push   rbx
     148b1e1:	48 89 fb             	mov    rbx,rdi
     148b1e4:	48 83 c7 08          	add    rdi,0x8
     148b1e8:	e8 c1 11 64 ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     148b1ed:	48 89 df             	mov    rdi,rbx
     148b1f0:	5b                   	pop    rbx
     148b1f1:	e9 2a 2d 36 00       	jmp    17edf20 <_ZdlPv@plt>

## score=57 address-point=0x185f8a0
- +0x68 -> 0x126c488; no-extra score=15; incoming-extra=[]; FDE=(19317896, 19317929)
- +0x98 -> 0x126bcac; boolish score=0; []; FDE=(19315884, 19315902)
- +0xb8 -> 0xb92a3a; sret score=0; []; FDE=(12134970, 12134992)
- +0xc0 -> 0x126bd78; boolish score=0; []; FDE=(19316088, 19317734)
- materializations:
  - 0x11ef761: lea    rax,[rip+0x670138]        # 185f8a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1bf88>; FDE=(18805556, 18832116)
### +0x68 body
     126c488:	53                   	push   rbx
     126c489:	48 89 fb             	mov    rbx,rdi
     126c48c:	48 83 c3 20          	add    rbx,0x20
     126c490:	48 89 df             	mov    rdi,rbx
     126c493:	e8 a4 ff ff ff       	call   126c43c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb19c0>
     126c498:	48 89 df             	mov    rdi,rbx
     126c49b:	5b                   	pop    rbx
     126c49c:	e9 85 ff ff ff       	jmp    126c426 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb19aa>
     126c4a1:	48 89 c7             	mov    rdi,rax
     126c4a4:	e8 fc d5 80 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
### +0xb8 body head
      b92a3a:	53                   	push   rbx
      b92a3b:	48 89 fb             	mov    rbx,rdi
      b92a3e:	48 83 c7 08          	add    rdi,0x8
      b92a42:	e8 df e0 f0 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
      b92a47:	48 89 df             	mov    rdi,rbx
      b92a4a:	5b                   	pop    rbx
      b92a4b:	e9 d0 b4 c5 00       	jmp    17edf20 <_ZdlPv@plt>

## score=57 address-point=0x185c970
- +0x68 -> 0x12154e6; no-extra score=15; incoming-extra=[]; FDE=(18961638, 18961661)
- +0x98 -> 0xa50370; boolish score=0; []; FDE=(10814320, 10814325)
- +0xb8 -> 0x12172a8; sret score=0; []; FDE=(18969256, 18969342)
- +0xc0 -> 0x1217e62; boolish score=0; []; FDE=(18972258, 18972276)
- materializations:
  - 0x1214c04: lea    rcx,[rip+0x647d65]        # 185c970 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19058>; FDE=(18958596, 18959823)
### +0x68 body
     12154e6:	53                   	push   rbx
     12154e7:	48 89 fb             	mov    rbx,rdi
     12154ea:	48 83 c7 20          	add    rdi,0x20
     12154ee:	e8 83 ff ff ff       	call   1215476 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a9fa>
     12154f3:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     12154f7:	5b                   	pop    rbx
     12154f8:	e9 b5 8f 88 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
### +0xb8 body head
     12172a8:	53                   	push   rbx
     12172a9:	48 89 fb             	mov    rbx,rdi
     12172ac:	48 81 c7 40 02 00 00 	add    rdi,0x240
     12172b3:	e8 ae 2b 5c 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     12172b8:	48 8d bb 18 02 00 00 	lea    rdi,[rbx+0x218]
     12172bf:	e8 04 a6 ff ff       	call   12118c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56e4c>
     12172c4:	48 8d bb e8 01 00 00 	lea    rdi,[rbx+0x1e8]
     12172cb:	e8 96 b3 8c ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     12172d0:	48 8d bb 80 01 00 00 	lea    rdi,[rbx+0x180]
     12172d7:	e8 b8 a6 ff ff       	call   1211994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56f18>
     12172dc:	48 8d bb 08 01 00 00 	lea    rdi,[rbx+0x108]
     12172e3:	e8 c4 5d a3 ff       	call   c4d0ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19a04c>
     12172e8:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     12172ec:	e8 61 2a e9 ff       	call   10a9d52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271168>
     12172f1:	48 83 c3 20          	add    rbx,0x20
     12172f5:	48 89 df             	mov    rdi,rbx
     12172f8:	5b                   	pop    rbx
     12172f9:	e9 32 fa 88 ff       	jmp    aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

## score=57 address-point=0x185bc40
- +0x68 -> 0xa7a3be; no-extra score=15; incoming-extra=[]; FDE=(10986430, 10986439)
- +0x98 -> 0xa50370; boolish score=0; []; FDE=(10814320, 10814325)
- +0xb8 -> 0x11faf6e; sret score=0; []; FDE=(18853742, 18853750)
- +0xc0 -> 0x11faf76; boolish score=0; []; FDE=(18853750, 18853761)
- materializations:
  - 0x11f9a64: lea    rdx,[rip+0x6621d5]        # 185bc40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18328>; FDE=(18848320, 18848559)
  - 0x11f9b3c: lea    rcx,[rip+0x6620fd]        # 185bc40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18328>; FDE=(18848560, 18848592)
  - 0x11f9b50: lea    rax,[rip+0x6620e9]        # 185bc40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18328>; FDE=(18848592, 18848611)
### +0x68 body
      a7a3be:	48 83 c7 20          	add    rdi,0x20
      a7a3c2:	e9 a3 fb ff ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
### +0xb8 body head
     11faf6e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     11faf71:	e9 62 00 00 00       	jmp    11fafd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4055c>

## score=57 address-point=0x185b948
- +0x68 -> 0x11f9a38; no-extra score=15; incoming-extra=[]; FDE=(18848312, 18848320)
- +0x98 -> 0x11f87e0; boolish score=0; []; FDE=(18843616, 18844137)
- +0xb8 -> 0x11f89fa; sret score=0; []; FDE=(18844154, 18844172)
- +0xc0 -> 0x11f8a0c; boolish score=0; []; FDE=(18844172, 18844181)
- materializations:
  - 0x11ef37a: lea    rax,[rip+0x66c5c7]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>; FDE=(18805556, 18832116)
  - 0x11f938c: lea    rax,[rip+0x6625b5]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>; FDE=(18846596, 18847792)
### +0x68 body
     11f9a38:	48 8b 87 d0 0e 00 00 	mov    rax,QWORD PTR [rdi+0xed0]
     11f9a3f:	c3                   	ret
### +0xb8 body head
     11f89fa:	53                   	push   rbx
     11f89fb:	48 89 fb             	mov    rbx,rdi
     11f89fe:	e8 e7 ff ff ff       	call   11f89ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3df6e>
     11f8a03:	48 89 df             	mov    rdi,rbx
     11f8a06:	5b                   	pop    rbx
     11f8a07:	e9 14 55 5f 00       	jmp    17edf20 <_ZdlPv@plt>

## score=57 address-point=0x1831740
- +0x68 -> 0xaae9b2; no-extra score=15; incoming-extra=[]; FDE=(11200946, 11200955)
- +0x98 -> 0xa50370; boolish score=0; []; FDE=(10814320, 10814325)
- +0xb8 -> 0xa50370; sret score=0; []; FDE=(10814320, 10814325)
- +0xc0 -> 0xea6b2e; boolish score=0; []; FDE=(15362862, 15362871)
- materializations:
  - 0xe9d963: lea    rax,[rip+0x993dd6]        # 1831740 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x36d8>; FDE=(15310087, 15343400)
  - 0xea6c31: lea    rcx,[rip+0x98ab08]        # 1831740 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x36d8>; FDE=(15363112, 15363133)
  - 0xea6c3e: lea    rax,[rip+0x98aafb]        # 1831740 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x36d8>; FDE=(15363134, 15363145)
  - 0x1213923: lea    rdx,[rip+0x61de16]        # 1831740 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x36d8>; FDE=(18949088, 18958079)
### +0x68 body
      aae9b2:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aae9b6:	e9 cb fa fe ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
### +0xb8 body head
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>

## score=56 address-point=0x1852160
- +0x68 -> 0xacf158; no-extra score=15; incoming-extra=[]; FDE=(11333976, 11333981)
- +0x98 -> 0x112c0a0; boolish score=1; []; FDE=(18006176, 18006342)
- +0xb8 -> 0x112c5ea; sret score=22; ['reads-rsi-this', 'writes-rdi-out', 'saves-rsi']; FDE=(18007530, 18008115)
- +0xc0 -> 0x112c834; boolish score=1; []; FDE=(18008116, 18008422)
- materializations:
  - 0x11295d6: lea    rdx,[rip+0x728b83]        # 1852160 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe848>; FDE=(17995002, 18000932)
### +0x68 body
      acf158:	48 8d 47 40          	lea    rax,[rdi+0x40]
      acf15c:	c3                   	ret
### +0xb8 body head
     112c5ea:	55                   	push   rbp
     112c5eb:	41 57                	push   r15
     112c5ed:	41 56                	push   r14
     112c5ef:	41 55                	push   r13
     112c5f1:	41 54                	push   r12
     112c5f3:	53                   	push   rbx
     112c5f4:	48 81 ec e8 02 00 00 	sub    rsp,0x2e8
     112c5fb:	44 89 cd             	mov    ebp,r9d
     112c5fe:	49 89 ce             	mov    r14,rcx
     112c601:	49 89 d7             	mov    r15,rdx
     112c604:	49 89 f4             	mov    r12,rsi
     112c607:	48 89 fb             	mov    rbx,rdi
     112c60a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     112c611:	00 00 
     112c613:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
     112c61a:	00 
     112c61b:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
     112c620:	4c 89 ef             	mov    rdi,r13
     112c623:	4c 89 c6             	mov    rsi,r8
     112c626:	e8 f1 ee ff ff       	call   112b51c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f2932>
     112c62b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     112c630:	4c 89 e6             	mov    rsi,r12
     112c633:	4c 89 fa             	mov    rdx,r15
     112c636:	4c 89 f1             	mov    rcx,r14
     112c639:	4d 89 e8             	mov    r8,r13
     112c63c:	41 89 e9             	mov    r9d,ebp
     112c63f:	e8 46 fc ff ff       	call   112c28a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f36a0>
     112c644:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     112c649:	e8 c0 e4 97 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
     112c64e:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     112c653:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
     112c659:	4d 8b 64 24 20       	mov    r12,QWORD PTR [r12+0x20]
     112c65e:	49 8b 07             	mov    rax,QWORD PTR [r15]
     112c661:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     112c666:	4c 89 fe             	mov    rsi,r15
     112c669:	ff 50 10             	call   QWORD PTR [rax+0x10]
     112c66c:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     112c673:	00 
     112c674:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
     112c679:	4c 89 e6             	mov    rsi,r12
     112c67c:	e8 ca 0f 00 00       	call   112d64b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f4a61>
     112c681:	48 8b 84 24 28 03 00 	mov    rax,QWORD PTR [rsp+0x328]
     112c688:	00 
     112c689:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]
     112c68d:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     112c692:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     112c695:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     112c699:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     112c69e:	0f 57 c0             	xorps  xmm0,xmm0
     112c6a1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     112c6a4:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
     112c6ab:	00 
     112c6ac:	4c 89 77 f8          	mov    QWORD PTR [rdi-0x8],r14
     112c6b0:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     112c6b7:	00 
     112c6b8:	e8 95 0f 00 00       	call   112d652 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f4a68>
     112c6bd:	4c 8b b4 24 20 03 00 	mov    r14,QWORD PTR [rsp+0x320]
     112c6c4:	00 
     112c6c5:	48 89 e7             	mov    rdi,rsp
     112c6c8:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]

## score=51 address-point=0x1868110
- +0x68 -> 0x1364eae; no-extra score=15; incoming-extra=[]; FDE=(20336302, 20336306)
- +0x98 -> 0x13652b0; boolish score=1; []; FDE=(20337328, 20337352)
- +0xb8 -> 0x1365374; sret score=18; ['reads-rsi-this', 'writes-rdi-out']; FDE=(20337524, 20337550)
- +0xc0 -> 0x136538e; boolish score=0; []; FDE=(20337550, 20337566)
- materializations:
  - 0x135f46b: lea    rax,[rip+0x508c9e]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>; FDE=(20303958, 20319259)
  - 0x1361228: lea    rcx,[rip+0x506ee1]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>; FDE=(20320796, 20320828)
  - 0x136123c: lea    rax,[rip+0x506ecd]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>; FDE=(20320828, 20320847)
### +0x68 body
     1364eae:	8b 47 28             	mov    eax,DWORD PTR [rdi+0x28]
     1364eb1:	c3                   	ret
### +0xb8 body head
     1365374:	83 7e 08 01          	cmp    DWORD PTR [rsi+0x8],0x1
     1365378:	75 05                	jne    136537f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa903>
     136537a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     136537d:	eb 0a                	jmp    1365389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa90d>
     136537f:	48 b8 01 00 00 00 00 	movabs rax,0x8000000000000001
     1365386:	00 00 80 
     1365389:	48 89 47 50          	mov    QWORD PTR [rdi+0x50],rax
     136538d:	c3                   	ret

## score=50 address-point=0x182a1a8
- +0x68 -> 0xdcb7e6; no-extra score=15; incoming-extra=[]; FDE=(14464998, 14465045)
- +0x98 -> 0xdcba3c; boolish score=5; ['boolean-result']; FDE=(14465596, 14465656)
- +0xb8 -> 0xdcc0d2; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(14467282, 14467341)
- +0xc0 -> 0xdcc10e; boolish score=1; []; FDE=(14467342, 14467346)
- materializations:
  - 0xdc9772: lea    rax,[rip+0xa60a2f]        # 182a1a8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x67d8>; FDE=(14456678, 14456756)
  - 0xdc97ba: lea    rax,[rip+0xa609e7]        # 182a1a8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x67d8>; FDE=(14456756, 14456865)
### +0x68 body
      dcb7e6:	53                   	push   rbx
      dcb7e7:	48 89 fb             	mov    rbx,rdi
      dcb7ea:	48 81 c7 80 00 00 00 	add    rdi,0x80
      dcb7f1:	e8 9a 26 a2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dcb7f6:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
      dcb7fa:	e8 cf 11 00 00       	call   dcc9ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99a54>
      dcb7ff:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
      dcb803:	e8 d8 c7 d1 ff       	call   ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
      dcb808:	48 83 c3 18          	add    rbx,0x18
      dcb80c:	48 89 df             	mov    rdi,rbx
      dcb80f:	5b                   	pop    rbx
      dcb810:	e9 13 ff ca ff       	jmp    a7b728 <JNI_OnUnload@@Base+0x2ff5>
### +0xb8 body head
      dcc0d2:	41 57                	push   r15
      dcc0d4:	41 56                	push   r14
      dcc0d6:	53                   	push   rbx
      dcc0d7:	49 89 f6             	mov    r14,rsi
      dcc0da:	48 89 fb             	mov    rbx,rdi
      dcc0dd:	4c 8d bf 98 00 00 00 	lea    r15,[rdi+0x98]
      dcc0e4:	ba 80 00 00 00       	mov    edx,0x80
      dcc0e9:	48 89 f7             	mov    rdi,rsi
      dcc0ec:	4c 89 fe             	mov    rsi,r15
      dcc0ef:	e8 7c 1e a2 00       	call   17edf70 <memcmp@plt>
      dcc0f4:	85 c0                	test   eax,eax
      dcc0f6:	74 0f                	je     dcc107 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9918d>
      dcc0f8:	6a 20                	push   0x20
      dcc0fa:	59                   	pop    rcx
      dcc0fb:	4c 89 ff             	mov    rdi,r15
      dcc0fe:	4c 89 f6             	mov    rsi,r14
      dcc101:	f3 a5                	rep movs DWORD PTR es:[rdi],DWORD PTR ds:[rsi]
      dcc103:	c6 43 30 01          	mov    BYTE PTR [rbx+0x30],0x1
      dcc107:	5b                   	pop    rbx
      dcc108:	41 5e                	pop    r14
      dcc10a:	41 5f                	pop    r15
      dcc10c:	c3                   	ret

## score=46 address-point=0x187a468
- +0x68 -> 0x14f206a; no-extra score=15; incoming-extra=[]; FDE=(21962858, 21962871)
- +0x98 -> 0x14f2382; boolish score=1; []; FDE=(21963650, 21963804)
- +0xb8 -> 0x14f3234; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(21967412, 21968196)
- +0xc0 -> 0x14f3544; boolish score=1; []; FDE=(21968196, 21968388)
- materializations:
  - 0x14f0704: lea    rax,[rip+0x389d5d]        # 187a468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36b50>; FDE=(21955110, 21957358)
  - 0x14f0e96: lea    rax,[rip+0x3895cb]        # 187a468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36b50>; FDE=(21958294, 21958313)
  - 0x14f0ef7: lea    rax,[rip+0x38956a]        # 187a468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36b50>; FDE=(21958332, 21958492)
  - 0x14f0f60: lea    rcx,[rip+0x389501]        # 187a468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36b50>; FDE=(21958492, 21958518)
### +0x68 body
     14f206a:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
     14f206e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14f2071:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
     14f2075:	ff e0                	jmp    rax
### +0xb8 body head
     14f3234:	41 57                	push   r15
     14f3236:	41 56                	push   r14
     14f3238:	41 55                	push   r13
     14f323a:	41 54                	push   r12
     14f323c:	53                   	push   rbx
     14f323d:	48 81 ec f0 01 00 00 	sub    rsp,0x1f0
     14f3244:	48 89 cb             	mov    rbx,rcx
     14f3247:	49 89 d7             	mov    r15,rdx
     14f324a:	49 89 f4             	mov    r12,rsi
     14f324d:	49 89 fe             	mov    r14,rdi
     14f3250:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14f3257:	00 00 
     14f3259:	48 89 84 24 e8 01 00 	mov    QWORD PTR [rsp+0x1e8],rax
     14f3260:	00 
     14f3261:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     14f3268:	00 
     14f3269:	48 89 ce             	mov    rsi,rcx
     14f326c:	e8 1f 70 58 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     14f3271:	49 8b be b0 00 00 00 	mov    rdi,QWORD PTR [r14+0xb0]
     14f3278:	e8 e5 71 58 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
     14f327d:	84 c0                	test   al,al
     14f327f:	0f 84 7e 01 00 00    	je     14f3403 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338987>
     14f3285:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14f3289:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14f328c:	4c 89 e6             	mov    rsi,r12
     14f328f:	ff 50 78             	call   QWORD PTR [rax+0x78]
     14f3292:	84 c0                	test   al,al
     14f3294:	0f 84 7d 01 00 00    	je     14f3417 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33899b>
     14f329a:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     14f329e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14f32a1:	4c 89 e6             	mov    rsi,r12
     14f32a4:	ff 50 50             	call   QWORD PTR [rax+0x50]
     14f32a7:	48 89 c7             	mov    rdi,rax
     14f32aa:	e8 89 7b fd ff       	call   14cae38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3103bc>
     14f32af:	84 c0                	test   al,al
     14f32b1:	0f 84 74 01 00 00    	je     14f342b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3389af>
     14f32b7:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     14f32be:	00 
     14f32bf:	4c 89 e6             	mov    rsi,r12
     14f32c2:	e8 79 ac 2f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     14f32c7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     14f32cc:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     14f32d3:	00 
     14f32d4:	6a 01                	push   0x1
     14f32d6:	5a                   	pop    rdx
     14f32d7:	e8 7c 41 5b ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     14f32dc:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     14f32e3:	00 
     14f32e4:	e8 a7 ab 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14f32e9:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     14f32f0:	00 
     14f32f1:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     14f32f6:	e8 fd 41 5e ff       	call   ad74f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24498>
     14f32fb:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
     14f3302:	00 
     14f3303:	49 8b 76 48          	mov    rsi,QWORD PTR [r14+0x48]
     14f3307:	4c 89 fa             	mov    rdx,r15
     14f330a:	e8 d7 07 01 00       	call   1503ae6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34906a>
     14f330f:	49 8d be f8 00 00 00 	lea    rdi,[r14+0xf8]
     14f3316:	e8 07 04 00 00       	call   14f3722 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x338ca6>

## score=46 address-point=0x1870b48
- +0x68 -> 0x142f30e; no-extra score=15; incoming-extra=[]; FDE=(21164814, 21164821)
- +0x98 -> 0x142f44e; boolish score=1; []; FDE=(21165134, 21165288)
- +0xb8 -> 0x142f582; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(21165442, 21165696)
- +0xc0 -> 0x142f680; boolish score=1; []; FDE=(21165696, 21165886)
- materializations:
  - 0x142e542: lea    rax,[rip+0x4425ff]        # 1870b48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d230>; FDE=(21161268, 21161459)
### +0x68 body
     142f30e:	8b 87 b0 03 00 00    	mov    eax,DWORD PTR [rdi+0x3b0]
     142f314:	c3                   	ret
### +0xb8 body head
     142f582:	41 57                	push   r15
     142f584:	41 56                	push   r14
     142f586:	41 54                	push   r12
     142f588:	53                   	push   rbx
     142f589:	48 83 ec 48          	sub    rsp,0x48
     142f58d:	49 89 d7             	mov    r15,rdx
     142f590:	49 89 f6             	mov    r14,rsi
     142f593:	48 89 fb             	mov    rbx,rdi
     142f596:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     142f59d:	00 00 
     142f59f:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     142f5a4:	48 83 be a8 03 00 00 	cmp    QWORD PTR [rsi+0x3a8],0x0
     142f5ab:	00 
     142f5ac:	75 6b                	jne    142f619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b9d>
     142f5ae:	6a 10                	push   0x10
     142f5b0:	5f                   	pop    rdi
     142f5b1:	e8 4a e9 3b 00       	call   17edf00 <_Znwm@plt>
     142f5b6:	49 89 c4             	mov    r12,rax
     142f5b9:	48 8d 05 98 17 44 00 	lea    rax,[rip+0x441798]        # 1870d58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d440>
     142f5c0:	49 89 04 24          	mov    QWORD PTR [r12],rax
     142f5c4:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
     142f5c9:	49 8d be 80 00 00 00 	lea    rdi,[r14+0x80]
     142f5d0:	4d 89 a6 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],r12
     142f5d7:	49 8d 96 d0 00 00 00 	lea    rdx,[r14+0xd0]
     142f5de:	48 8d 05 23 18 44 00 	lea    rax,[rip+0x441823]        # 1870e08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d4f0>
     142f5e5:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
     142f5ec:	41 c6 86 e0 00 00 00 	mov    BYTE PTR [r14+0xe0],0x1
     142f5f3:	01 
     142f5f4:	49 8d b6 d8 00 00 00 	lea    rsi,[r14+0xd8]
     142f5fb:	e8 60 10 00 00       	call   1430660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x275be4>
     142f600:	49 8b be a8 03 00 00 	mov    rdi,QWORD PTR [r14+0x3a8]
     142f607:	4d 89 a6 a8 03 00 00 	mov    QWORD PTR [r14+0x3a8],r12
     142f60e:	48 85 ff             	test   rdi,rdi
     142f611:	74 06                	je     142f619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274b9d>
     142f613:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     142f616:	ff 50 08             	call   QWORD PTR [rax+0x8]
     142f619:	49 81 c6 50 03 00 00 	add    r14,0x350
     142f620:	49 89 e4             	mov    r12,rsp
     142f623:	4c 89 e7             	mov    rdi,r12
     142f626:	4c 89 fe             	mov    rsi,r15
     142f629:	e8 ac b0 3a 00       	call   17da6da <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64fb>
     142f62e:	48 89 df             	mov    rdi,rbx
     142f631:	4c 89 f6             	mov    rsi,r14
     142f634:	4c 89 e2             	mov    rdx,r12
     142f637:	e8 8e a9 3a 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     142f63c:	4c 89 e7             	mov    rdi,r12
     142f63f:	e8 a4 b1 3a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     142f644:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     142f64b:	00 00 
     142f64d:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     142f652:	75 0f                	jne    142f663 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x274be7>
     142f654:	48 89 d8             	mov    rax,rbx
     142f657:	48 83 c4 48          	add    rsp,0x48
     142f65b:	5b                   	pop    rbx
     142f65c:	41 5c                	pop    r12
     142f65e:	41 5e                	pop    r14
     142f660:	41 5f                	pop    r15
     142f662:	c3                   	ret
     142f663:	e8 48 04 3c 00       	call   17efab0 <__stack_chk_fail@plt>
     142f668:	48 89 c3             	mov    rbx,rax

## score=46 address-point=0x186eb10
- +0x68 -> 0x13f204c; no-extra score=15; incoming-extra=[]; FDE=(20914252, 20914260)
- +0x98 -> 0x13f239a; boolish score=1; []; FDE=(20915098, 20915233)
- +0xb8 -> 0x13f2890; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(20916368, 20917228)
- +0xc0 -> 0x13ed05c; boolish score=1; []; FDE=(20893788, 20893794)
- materializations:
  - 0x13f245c: lea    rax,[rip+0x47c6ad]        # 186eb10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b1f8>; FDE=(20915233, 20916194)
### +0x68 body
     13f204c:	b8 00 04 00 00       	mov    eax,0x400
     13f2051:	b2 01                	mov    dl,0x1
     13f2053:	c3                   	ret
### +0xb8 body head
     13f2890:	55                   	push   rbp
     13f2891:	41 57                	push   r15
     13f2893:	41 56                	push   r14
     13f2895:	41 55                	push   r13
     13f2897:	41 54                	push   r12
     13f2899:	53                   	push   rbx
     13f289a:	48 83 ec 28          	sub    rsp,0x28
     13f289e:	4c 89 c3             	mov    rbx,r8
     13f28a1:	49 89 cd             	mov    r13,rcx
     13f28a4:	49 89 d6             	mov    r14,rdx
     13f28a7:	49 89 f7             	mov    r15,rsi
     13f28aa:	49 89 fc             	mov    r12,rdi
     13f28ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13f28b4:	00 00 
     13f28b6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     13f28bb:	48 8d 6f 28          	lea    rbp,[rdi+0x28]
     13f28bf:	49 8b 30             	mov    rsi,QWORD PTR [r8]
     13f28c2:	48 89 ef             	mov    rdi,rbp
     13f28c5:	e8 6a 41 78 ff       	call   b76a34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc39d4>
     13f28ca:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     13f28cd:	48 89 ef             	mov    rdi,rbp
     13f28d0:	e8 e1 2a 79 ff       	call   b853b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2356>
     13f28d5:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
     13f28da:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
     13f28dd:	4c 89 ee             	mov    rsi,r13
     13f28e0:	e8 eb d1 3f 00       	call   17efad0 <memcpy@plt>
     13f28e5:	49 8b 74 24 28       	mov    rsi,QWORD PTR [r12+0x28]
     13f28ea:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
     13f28ef:	48 29 f0             	sub    rax,rsi
     13f28f2:	4d 8b 06             	mov    r8,QWORD PTR [r14]
     13f28f5:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     13f28fa:	4c 89 44 24 18       	mov    QWORD PTR [rsp+0x18],r8
     13f28ff:	41 80 7c 24 20 00    	cmp    BYTE PTR [r12+0x20],0x0
     13f2905:	74 61                	je     13f2968 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237eec>
     13f2907:	41 8a 4c 24 1c       	mov    cl,BYTE PTR [r12+0x1c]
     13f290c:	31 ed                	xor    ebp,ebp
     13f290e:	45 31 ed             	xor    r13d,r13d
     13f2911:	80 f9 11             	cmp    cl,0x11
     13f2914:	0f 84 e5 01 00 00    	je     13f2aff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238083>
     13f291a:	0f b6 c9             	movzx  ecx,cl
     13f291d:	83 f9 10             	cmp    ecx,0x10
     13f2920:	0f 85 98 02 00 00    	jne    13f2bbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238142>
     13f2926:	48 89 c1             	mov    rcx,rax
     13f2929:	48 d1 e9             	shr    rcx,1
     13f292c:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
     13f2930:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     13f2935:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
     13f2939:	48 01 c5             	add    rbp,rax
     13f293c:	45 0f b7 44 24 24    	movzx  r8d,WORD PTR [r12+0x24]
     13f2942:	41 83 f8 02          	cmp    r8d,0x2
     13f2946:	0f 84 f3 01 00 00    	je     13f2b3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2380c3>
     13f294c:	41 83 f8 01          	cmp    r8d,0x1
     13f2950:	0f 85 23 02 00 00    	jne    13f2b79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2380fd>
     13f2956:	48 89 e7             	mov    rdi,rsp
     13f2959:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     13f295e:	e8 7a 79 16 00       	call   155a2dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39f861>
     13f2963:	e9 2c 02 00 00       	jmp    13f2b94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238118>
     13f2968:	6a 0b                	push   0xb
     13f296a:	41 5d                	pop    r13
     13f296c:	48 83 f8 2c          	cmp    rax,0x2c

## score=46 address-point=0x185c790
- +0x68 -> 0xa50370; no-extra score=-7; incoming-extra=['rdx']; FDE=(10814320, 10814325)
- +0x98 -> 0x1210a5a; boolish score=0; []; FDE=(18942554, 18942572)
- +0xb8 -> 0xc71834; sret score=10; ['writes-rdi-out']; FDE=(13047860, 13047870)
- +0xc0 -> 0xcf25ca; boolish score=1; []; FDE=(13575626, 13575734)
- materializations:
  - 0x120ad19: lea    rax,[rip+0x651a70]        # 185c790 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e78>; FDE=(18918226, 18918896)
  - 0x120adf0: lea    rax,[rip+0x651999]        # 185c790 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e78>; FDE=(18918896, 18918915)
  - 0x120ae22: lea    rcx,[rip+0x651967]        # 185c790 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e78>; FDE=(18918934, 18918980)
  - 0x120ae44: lea    rax,[rip+0x651945]        # 185c790 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e78>; FDE=(18918980, 18919017)
### +0x68 body
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>
### +0xb8 body head
      c71834:	48 89 f8             	mov    rax,rdi
      c71837:	0f 57 c0             	xorps  xmm0,xmm0
      c7183a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      c7183d:	c3                   	ret

## score=46 address-point=0x184d5d0
- +0x68 -> 0x10baab4; no-extra score=15; incoming-extra=[]; FDE=(17541812, 17541867)
- +0x98 -> 0x10bac0a; boolish score=1; []; FDE=(17542154, 17542212)
- +0xb8 -> 0x10bad36; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(17542454, 17542523)
- +0xc0 -> 0x10bad7c; boolish score=1; []; FDE=(17542524, 17542537)
- materializations:
  - 0x10ad19e: lea    rax,[rip+0x7a042b]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>; FDE=(17480246, 17488917)
  - 0x10bd03c: lea    rax,[rip+0x79058d]        # 184d5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9cb8>; FDE=(17551416, 17551512)
### +0x68 body
     10baab4:	48 83 ec 18          	sub    rsp,0x18
     10baab8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10baabf:	00 00 
     10baac1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10baac6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10baac9:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
     10baace:	ff 50 70             	call   QWORD PTR [rax+0x70]
     10baad1:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     10baad8:	00 00 
     10baada:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     10baadf:	75 05                	jne    10baae6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x281efc>
     10baae1:	48 83 c4 18          	add    rsp,0x18
     10baae5:	c3                   	ret
     10baae6:	e8 c5 4f 73 00       	call   17efab0 <__stack_chk_fail@plt>
### +0xb8 body head
     10bad36:	41 57                	push   r15
     10bad38:	41 56                	push   r14
     10bad3a:	53                   	push   rbx
     10bad3b:	83 26 00             	and    DWORD PTR [rsi],0x0
     10bad3e:	b3 01                	mov    bl,0x1
     10bad40:	83 7f 50 02          	cmp    DWORD PTR [rdi+0x50],0x2
     10bad44:	75 2d                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
     10bad46:	49 89 f6             	mov    r14,rsi
     10bad49:	49 89 ff             	mov    r15,rdi
     10bad4c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     10bad50:	e8 55 23 00 00       	call   10bd0aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2844c0>
     10bad55:	84 c0                	test   al,al
     10bad57:	74 1a                	je     10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
     10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
     10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
     10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
     10bad66:	84 c0                	test   al,al
     10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
     10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
     10bad71:	31 db                	xor    ebx,ebx
     10bad73:	89 d8                	mov    eax,ebx
     10bad75:	5b                   	pop    rbx
     10bad76:	41 5e                	pop    r14
     10bad78:	41 5f                	pop    r15
     10bad7a:	c3                   	ret

## score=46 address-point=0x1845230
- +0x68 -> 0x101b396; no-extra score=15; incoming-extra=[]; FDE=(16888726, 16888736)
- +0x98 -> 0x101ae4a; boolish score=1; []; FDE=(16887370, 16887505)
- +0xb8 -> 0x101b06a; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(16887914, 16888049)
- +0xc0 -> 0x101b0f2; boolish score=1; []; FDE=(16888050, 16888185)
- materializations:
  - 0x1019633: lea    rax,[rip+0x82bbf6]        # 1845230 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1918>; FDE=(16881152, 16881362)
  - 0x10196e5: lea    rcx,[rip+0x82bb44]        # 1845230 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1918>; FDE=(16881362, 16881435)
  - 0x101a5ea: lea    rax,[rip+0x82ac3f]        # 1845230 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1918>; FDE=(16885226, 16885241)
### +0x68 body
     101b396:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     101b399:	48 8b 00             	mov    rax,QWORD PTR [rax]
     101b39c:	8a 40 2c             	mov    al,BYTE PTR [rax+0x2c]
     101b39f:	c3                   	ret
### +0xb8 body head
     101b06a:	41 56                	push   r14
     101b06c:	53                   	push   rbx
     101b06d:	50                   	push   rax
     101b06e:	48 83 66 08 00       	and    QWORD PTR [rsi+0x8],0x0
     101b073:	48 8d 05 c6 26 88 00 	lea    rax,[rip+0x8826c6]        # 189d740 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xa680>
     101b07a:	48 89 06             	mov    QWORD PTR [rsi],rax
     101b07d:	0f 57 c0             	xorps  xmm0,xmm0
     101b080:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     101b084:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
     101b088:	48 39 d6             	cmp    rsi,rdx
     101b08b:	74 4b                	je     101b0d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e24ee>
     101b08d:	48 89 f3             	mov    rbx,rsi
     101b090:	49 89 d6             	mov    r14,rdx
     101b093:	48 8b 42 08          	mov    rax,QWORD PTR [rdx+0x8]
     101b097:	a8 01                	test   al,0x1
     101b099:	75 45                	jne    101b0e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e24f6>
     101b09b:	48 85 c0             	test   rax,rax
     101b09e:	74 0d                	je     101b0ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e24c3>
     101b0a0:	48 89 df             	mov    rdi,rbx
     101b0a3:	4c 89 f6             	mov    rsi,r14
     101b0a6:	e8 b5 39 73 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     101b0ab:	eb 2b                	jmp    101b0d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e24ee>
     101b0ad:	0f 18 0d 2c 86 97 00 	prefetcht0 BYTE PTR [rip+0x97862c]        # 19936e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x5c328>
     101b0b4:	48 8d 3d 25 86 97 00 	lea    rdi,[rip+0x978625]        # 19936e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x5c328>
     101b0bb:	48 8b 05 26 86 97 00 	mov    rax,QWORD PTR [rip+0x978626]        # 19936e8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x5c330>
     101b0c2:	0f 18 08             	prefetcht0 BYTE PTR [rax]
     101b0c5:	e8 20 3b 73 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
     101b0ca:	48 89 d7             	mov    rdi,rdx
     101b0cd:	48 89 de             	mov    rsi,rbx
     101b0d0:	4c 89 f2             	mov    rdx,r14
     101b0d3:	e8 c2 f0 71 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
     101b0d8:	48 83 c4 08          	add    rsp,0x8
     101b0dc:	5b                   	pop    rbx
     101b0dd:	41 5e                	pop    r14
     101b0df:	c3                   	ret
     101b0e0:	48 83 e0 fe          	and    rax,0xfffffffffffffffe
     101b0e4:	48 8b 00             	mov    rax,QWORD PTR [rax]
     101b0e7:	eb b2                	jmp    101b09b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e24b1>
     101b0e9:	48 89 c7             	mov    rdi,rax
     101b0ec:	e8 b4 e9 a5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## score=46 address-point=0x182b040
- +0x68 -> 0xac3ae0; no-extra score=15; incoming-extra=[]; FDE=(11287264, 11287269)
- +0x98 -> 0xbd7a10; boolish score=1; []; FDE=(12417552, 12417566)
- +0xb8 -> 0xde0ae8; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(14551784, 14551872)
- +0xc0 -> 0xde0b40; boolish score=1; []; FDE=(14551872, 14551893)
- materializations:
  - 0xddfe6d: lea    rax,[rip+0xa4b1cc]        # 182b040 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7670>; FDE=(14548462, 14549397)
  - 0xde01a2: lea    rcx,[rip+0xa4ae97]        # 182b040 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7670>; FDE=(14549398, 14549430)
  - 0xde01b6: lea    rax,[rip+0xa4ae83]        # 182b040 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7670>; FDE=(14549430, 14549449)
### +0x68 body
      ac3ae0:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
      ac3ae4:	c3                   	ret
### +0xb8 body head
      de0ae8:	55                   	push   rbp
      de0ae9:	41 56                	push   r14
      de0aeb:	53                   	push   rbx
      de0aec:	48 89 f3             	mov    rbx,rsi
      de0aef:	49 89 fe             	mov    r14,rdi
      de0af2:	8b 6e 38             	mov    ebp,DWORD PTR [rsi+0x38]
      de0af5:	83 fd 09             	cmp    ebp,0x9
      de0af8:	74 05                	je     de0aff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadb85>
      de0afa:	83 fd 04             	cmp    ebp,0x4
      de0afd:	75 2e                	jne    de0b2d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadbb3>
      de0aff:	49 8d be b0 02 00 00 	lea    rdi,[r14+0x2b0]
      de0b06:	48 89 de             	mov    rsi,rbx
      de0b09:	e8 b4 de ea ff       	call   c8e9c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1db962>
      de0b0e:	49 8d be d8 02 00 00 	lea    rdi,[r14+0x2d8]
      de0b15:	48 89 de             	mov    rsi,rbx
      de0b18:	e8 a5 de ea ff       	call   c8e9c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1db962>
      de0b1d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      de0b21:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      de0b24:	48 89 de             	mov    rsi,rbx
      de0b27:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
      de0b2d:	83 fd 04             	cmp    ebp,0x4
      de0b30:	0f 94 c1             	sete   cl
      de0b33:	83 fd 09             	cmp    ebp,0x9
      de0b36:	0f 94 c0             	sete   al
      de0b39:	08 c8                	or     al,cl
      de0b3b:	5b                   	pop    rbx
      de0b3c:	41 5e                	pop    r14
      de0b3e:	5d                   	pop    rbp
      de0b3f:	c3                   	ret

## score=45 address-point=0x1870788
- +0x68 -> 0x1428396; no-extra score=15; incoming-extra=[]; FDE=(21136278, 21136287)
- +0x98 -> 0x14281c2; boolish score=0; []; FDE=(21135810, 21135828)
- +0xb8 -> 0x1429d22; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(21142818, 21143087)
- +0xc0 -> 0x1429e30; boolish score=1; []; FDE=(21143088, 21143252)
- materializations:
  - 0x1427e4f: lea    rbp,[rip+0x448932]        # 1870788 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ce70>; FDE=(21134870, 21135038)
### +0x68 body
     1428396:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     142839a:	e9 53 fe ff ff       	jmp    14281f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d776>
### +0xb8 body head
     1429d22:	55                   	push   rbp
     1429d23:	41 57                	push   r15
     1429d25:	41 56                	push   r14
     1429d27:	41 55                	push   r13
     1429d29:	41 54                	push   r12
     1429d2b:	53                   	push   rbx
     1429d2c:	48 83 ec 28          	sub    rsp,0x28
     1429d30:	48 89 f3             	mov    rbx,rsi
     1429d33:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1429d3a:	00 00 
     1429d3c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1429d41:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1429d44:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1429d49:	31 c9                	xor    ecx,ecx
     1429d4b:	4c 8d 25 fe 95 00 ff 	lea    r12,[rip+0xffffffffff0095fe]        # 433350 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x58d9f>
     1429d52:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
     1429d57:	4c 8d 3d f2 6a 44 00 	lea    r15,[rip+0x446af2]        # 1870850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2cf38>
     1429d5e:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     1429d63:	45 31 ed             	xor    r13d,r13d
     1429d66:	4b 8b 74 25 08       	mov    rsi,QWORD PTR [r13+r12*1+0x8]
     1429d6b:	80 7c 33 20 00       	cmp    BYTE PTR [rbx+rsi*1+0x20],0x0
     1429d70:	74 2f                	je     1429da1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f325>
     1429d72:	4b 8d 04 2c          	lea    rax,[r12+r13*1]
     1429d76:	48 01 de             	add    rsi,rbx
     1429d79:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1429d7e:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
     1429d81:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1429d86:	48 39 c8             	cmp    rax,rcx
     1429d89:	0f 84 86 00 00 00    	je     1429e15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f399>
     1429d8f:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
     1429d94:	4c 89 f7             	mov    rdi,r14
     1429d97:	41 ff 14 c7          	call   QWORD PTR [r15+rax*8]
     1429d9b:	b1 01                	mov    cl,0x1
     1429d9d:	84 c0                	test   al,al
     1429d9f:	74 12                	je     1429db3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     1429da1:	49 83 c5 30          	add    r13,0x30
     1429da5:	49 81 fd c0 03 00 00 	cmp    r13,0x3c0
     1429dac:	75 b8                	jne    1429d66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2ea>
     1429dae:	f6 c1 01             	test   cl,0x1
     1429db1:	75 04                	jne    1429db7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f33b>
     1429db3:	31 c0                	xor    eax,eax
     1429db5:	eb 3f                	jmp    1429df6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f37a>
     1429db7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1429dbc:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1429dbf:	48 8d 15 92 95 00 ff 	lea    rdx,[rip+0xffffffffff009592]        # 433358 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x58da7>
     1429dc6:	31 c0                	xor    eax,eax
     1429dc8:	6a 14                	push   0x14
     1429dca:	5e                   	pop    rsi
     1429dcb:	48 8b 3a             	mov    rdi,QWORD PTR [rdx]
     1429dce:	80 7c 3b 20 00       	cmp    BYTE PTR [rbx+rdi*1+0x20],0x0
     1429dd3:	74 0a                	je     1429ddf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f363>
     1429dd5:	80 3c 01 00          	cmp    BYTE PTR [rcx+rax*1],0x0
     1429dd9:	75 14                	jne    1429def <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f373>
     1429ddb:	c6 04 01 01          	mov    BYTE PTR [rcx+rax*1],0x1
     1429ddf:	48 ff c0             	inc    rax
     1429de2:	48 83 c2 30          	add    rdx,0x30
     1429de6:	48 83 f8 14          	cmp    rax,0x14
     1429dea:	75 df                	jne    1429dcb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f34f>
     1429dec:	48 89 f0             	mov    rax,rsi
     1429def:	48 83 f8 14          	cmp    rax,0x14

## score=45 address-point=0x185ec10
- +0x68 -> 0x125f6b6; no-extra score=-7; incoming-extra=['rsi']; FDE=(19265206, 19265278)
- +0x98 -> 0x125f978; boolish score=1; []; FDE=(19265912, 19266101)
- +0xb8 -> 0x125fc66; sret score=8; ['reads-rsi-this']; FDE=(19266662, 19266832)
- +0xc0 -> 0x125fd10; boolish score=1; []; FDE=(19266832, 19267002)
- materializations:
  - 0x11f2fc0: lea    rcx,[rip+0x66bc49]        # 185ec10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b2f8>; FDE=(18805556, 18832116)
### +0x68 body
     125f6b6:	55                   	push   rbp
     125f6b7:	41 56                	push   r14
     125f6b9:	53                   	push   rbx
     125f6ba:	89 f5                	mov    ebp,esi
     125f6bc:	48 89 fb             	mov    rbx,rdi
     125f6bf:	48 81 c7 e0 00 00 00 	add    rdi,0xe0
     125f6c6:	44 8a b3 00 01 00 00 	mov    r14b,BYTE PTR [rbx+0x100]
     125f6cd:	e8 76 41 fc ff       	call   1223848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68dcc>
     125f6d2:	39 ab b0 00 00 00    	cmp    DWORD PTR [rbx+0xb0],ebp
     125f6d8:	75 0a                	jne    125f6e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4c68>
     125f6da:	45 84 f6             	test   r14b,r14b
     125f6dd:	75 13                	jne    125f6f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4c76>
     125f6df:	5b                   	pop    rbx
     125f6e0:	41 5e                	pop    r14
     125f6e2:	5d                   	pop    rbp
     125f6e3:	c3                   	ret
     125f6e4:	89 ab b0 00 00 00    	mov    DWORD PTR [rbx+0xb0],ebp
     125f6ea:	48 89 df             	mov    rdi,rbx
     125f6ed:	e8 e2 f9 ff ff       	call   125f0d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa4658>
     125f6f2:	48 89 df             	mov    rdi,rbx
     125f6f5:	5b                   	pop    rbx
     125f6f6:	41 5e                	pop    r14
     125f6f8:	5d                   	pop    rbp
     125f6f9:	e9 2c f7 ff ff       	jmp    125ee2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa43ae>
### +0xb8 body head
     125fc66:	41 56                	push   r14
     125fc68:	53                   	push   rbx
     125fc69:	48 83 ec 28          	sub    rsp,0x28
     125fc6d:	48 89 fb             	mov    rbx,rdi
     125fc70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125fc77:	00 00 
     125fc79:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     125fc7e:	48 8b 76 38          	mov    rsi,QWORD PTR [rsi+0x38]
     125fc82:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     125fc85:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     125fc8a:	4c 89 f7             	mov    rdi,r14
     125fc8d:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     125fc93:	49 83 7e 10 00       	cmp    QWORD PTR [r14+0x10],0x0
     125fc98:	74 19                	je     125fcb3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa5237>
     125fc9a:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     125fc9f:	48 89 df             	mov    rdi,rbx
     125fca2:	e8 dd 9a 8e ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     125fca7:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     125fcac:	e8 35 41 8d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     125fcb1:	eb 18                	jmp    125fccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa524f>
     125fcb3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     125fcb8:	e8 29 41 8d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     125fcbd:	48 8d 43 08          	lea    rax,[rbx+0x8]
     125fcc1:	0f 57 c0             	xorps  xmm0,xmm0
     125fcc4:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     125fcc8:	48 89 03             	mov    QWORD PTR [rbx],rax
     125fccb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125fcd2:	00 00 
     125fcd4:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     125fcd9:	75 30                	jne    125fd0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa528f>
     125fcdb:	48 89 d8             	mov    rax,rbx
     125fcde:	48 83 c4 28          	add    rsp,0x28
     125fce2:	5b                   	pop    rbx
     125fce3:	41 5e                	pop    r14
     125fce5:	c3                   	ret
     125fce6:	48 89 c3             	mov    rbx,rax
     125fce9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     125fcee:	e8 f3 40 8d ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     125fcf3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     125fcfa:	00 00 
     125fcfc:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     125fd01:	75 08                	jne    125fd0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa528f>
     125fd03:	48 89 df             	mov    rdi,rbx
     125fd06:	e8 c5 ff 80 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     125fd0b:	e8 a0 fd 58 00       	call   17efab0 <__stack_chk_fail@plt>

## score=45 address-point=0x185cc70
- +0x68 -> 0x122431c; no-extra score=-7; incoming-extra=['rsi']; FDE=(19022620, 19022628)
- +0x98 -> 0x122309e; boolish score=1; []; FDE=(19017886, 19017900)
- +0xb8 -> 0x1219ea2; sret score=8; ['reads-rsi-this']; FDE=(18980514, 18980521)
- +0xc0 -> 0x1219ea2; boolish score=1; []; FDE=(18980514, 18980521)
- materializations:
  - 0x1219a29: lea    rcx,[rip+0x643240]        # 185cc70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19358>; FDE=(18979316, 18979629)
  - 0x122a86f: lea    rcx,[rip+0x6323fa]        # 185cc70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19358>; FDE=(19048428, 19048993)
### +0x68 body
     122431c:	8b 06                	mov    eax,DWORD PTR [rsi]
     122431e:	48 0f ba e8 22       	bts    rax,0x22
     1224323:	c3                   	ret
### +0xb8 body head
     1219ea2:	83 3e 02             	cmp    DWORD PTR [rsi],0x2
     1219ea5:	0f 94 c0             	sete   al
     1219ea8:	c3                   	ret

## score=45 address-point=0x185a228
- +0x68 -> 0x11ac490; no-extra score=15; incoming-extra=[]; FDE=(18531472, 18531494)
- +0x98 -> 0x11bf244; boolish score=1; []; FDE=(18608708, 18608817)
- +0xb8 -> 0x11bf5b6; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(18609590, 18609881)
- +0xc0 -> 0x11bf6da; boolish score=0; []; FDE=(18609882, 18610245)
- materializations:
  - 0x11bcbb6: lea    rcx,[rip+0x69d66b]        # 185a228 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16910>; FDE=(18598748, 18599422)
### +0x68 body
     11ac490:	53                   	push   rbx
     11ac491:	48 89 fb             	mov    rbx,rdi
     11ac494:	48 83 c7 30          	add    rdi,0x30
     11ac498:	e8 c9 d9 62 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11ac49d:	48 89 df             	mov    rdi,rbx
     11ac4a0:	5b                   	pop    rbx
     11ac4a1:	e9 3e 77 43 00       	jmp    15e3be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429168>
### +0xb8 body head
     11bf5b6:	41 57                	push   r15
     11bf5b8:	41 56                	push   r14
     11bf5ba:	41 55                	push   r13
     11bf5bc:	41 54                	push   r12
     11bf5be:	53                   	push   rbx
     11bf5bf:	48 83 ec 70          	sub    rsp,0x70
     11bf5c3:	49 89 cc             	mov    r12,rcx
     11bf5c6:	49 89 f7             	mov    r15,rsi
     11bf5c9:	48 89 fb             	mov    rbx,rdi
     11bf5cc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11bf5d3:	00 00 
     11bf5d5:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11bf5da:	4c 8b 76 28          	mov    r14,QWORD PTR [rsi+0x28]
     11bf5de:	48 8b 72 18          	mov    rsi,QWORD PTR [rdx+0x18]
     11bf5e2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     11bf5e6:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11bf5eb:	e8 50 e9 62 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     11bf5f0:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     11bf5f5:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     11bf5f9:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
     11bf5fe:	48 85 c0             	test   rax,rax
     11bf601:	74 05                	je     11bf608 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b8c>
     11bf603:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     11bf608:	48 83 64 24 48 00    	and    QWORD PTR [rsp+0x48],0x0
     11bf60e:	48 83 64 24 58 00    	and    QWORD PTR [rsp+0x58],0x0
     11bf614:	6a 18                	push   0x18
     11bf616:	5f                   	pop    rdi
     11bf617:	e8 e4 e8 62 00       	call   17edf00 <_Znwm@plt>
     11bf61c:	4c 89 38             	mov    QWORD PTR [rax],r15
     11bf61f:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     11bf623:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     11bf627:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
     11bf62c:	49 89 07             	mov    QWORD PTR [r15],rax
     11bf62f:	48 8d 05 5e a6 9a ff 	lea    rax,[rip+0xffffffffff9aa65e]        # b69c94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb6c34>
     11bf636:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     11bf63a:	48 8d 05 37 17 00 00 	lea    rax,[rip+0x1737]        # 11c0d78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62fc>
     11bf641:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     11bf645:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11bf648:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
     11bf64d:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]
     11bf652:	4c 89 e7             	mov    rdi,r12
     11bf655:	4c 89 f6             	mov    rsi,r14
     11bf658:	4c 89 ea             	mov    rdx,r13
     11bf65b:	4c 89 f9             	mov    rcx,r15
     11bf65e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11bf661:	4c 89 ff             	mov    rdi,r15
     11bf664:	e8 cd e6 fe ff       	call   11add36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37514c>
     11bf669:	31 ff                	xor    edi,edi
     11bf66b:	e8 16 ee 8d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11bf670:	4c 89 ef             	mov    rdi,r13
     11bf673:	e8 18 e8 62 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11bf678:	41 0f 28 04 24       	movaps xmm0,XMMWORD PTR [r12]
     11bf67d:	0f 57 c9             	xorps  xmm1,xmm1
     11bf680:	41 0f 29 0c 24       	movaps XMMWORD PTR [r12],xmm1
     11bf685:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     11bf688:	31 ff                	xor    edi,edi
     11bf68a:	e8 f7 ed 8d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11bf68f:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11bf694:	e8 ed ed 8d ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11bf699:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

## score=45 address-point=0x1822800
- +0x68 -> 0xd1690a; no-extra score=15; incoming-extra=[]; FDE=(13723914, 13723935)
- +0x98 -> 0xd169be; boolish score=1; []; FDE=(13724094, 13724119)
- +0xb8 -> 0xd16b42; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(13724482, 13724680)
- +0xc0 -> 0xd16c08; boolish score=0; []; FDE=(13724680, 13725207)
- materializations:
  - 0xd13e21: lea    rax,[rip+0xb0e9d8]        # 1822800 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x184c0>; FDE=(13712873, 13713329)
### +0x68 body
      d1690a:	53                   	push   rbx
      d1690b:	48 89 fb             	mov    rbx,rdi
      d1690e:	48 8b b6 b0 01 00 00 	mov    rsi,QWORD PTR [rsi+0x1b0]
      d16915:	e8 1a 45 92 00       	call   163ae34 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35fa2>
      d1691a:	48 89 d8             	mov    rax,rbx
      d1691d:	5b                   	pop    rbx
      d1691e:	c3                   	ret
### +0xb8 body head
      d16b42:	55                   	push   rbp
      d16b43:	41 57                	push   r15
      d16b45:	41 56                	push   r14
      d16b47:	41 55                	push   r13
      d16b49:	41 54                	push   r12
      d16b4b:	53                   	push   rbx
      d16b4c:	48 83 ec 28          	sub    rsp,0x28
      d16b50:	48 89 d3             	mov    rbx,rdx
      d16b53:	49 89 f6             	mov    r14,rsi
      d16b56:	49 89 ff             	mov    r15,rdi
      d16b59:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d16b60:	00 00 
      d16b62:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      d16b67:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d16b6a:	48 39 46 08          	cmp    QWORD PTR [rsi+0x8],rax
      d16b6e:	74 41                	je     d16bb1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263b51>
      d16b70:	89 cd                	mov    ebp,ecx
      d16b72:	45 31 ed             	xor    r13d,r13d
      d16b75:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
      d16b7a:	4a 8b 34 e8          	mov    rsi,QWORD PTR [rax+r13*8]
      d16b7e:	4c 89 e7             	mov    rdi,r12
      d16b81:	e8 f8 2e d6 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      d16b86:	4c 89 ff             	mov    rdi,r15
      d16b89:	4c 89 e6             	mov    rsi,r12
      d16b8c:	89 ea                	mov    edx,ebp
      d16b8e:	e8 85 cd 00 00       	call   d23918 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2708b8>
      d16b93:	4c 89 e7             	mov    rdi,r12
      d16b96:	e8 f5 72 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d16b9b:	49 ff c5             	inc    r13
      d16b9e:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d16ba1:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
      d16ba5:	48 29 c1             	sub    rcx,rax
      d16ba8:	48 c1 f9 03          	sar    rcx,0x3
      d16bac:	4c 39 e9             	cmp    rcx,r13
      d16baf:	77 c9                	ja     d16b7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263b1a>
      d16bb1:	4c 89 ff             	mov    rdi,r15
      d16bb4:	4c 89 f6             	mov    rsi,r14
      d16bb7:	48 89 da             	mov    rdx,rbx
      d16bba:	e8 a5 38 00 00       	call   d1a464 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267404>
      d16bbf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d16bc6:	00 00 
      d16bc8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      d16bcd:	75 34                	jne    d16c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263ba3>
      d16bcf:	48 83 c4 28          	add    rsp,0x28
      d16bd3:	5b                   	pop    rbx
      d16bd4:	41 5c                	pop    r12
      d16bd6:	41 5d                	pop    r13
      d16bd8:	41 5e                	pop    r14
      d16bda:	41 5f                	pop    r15
      d16bdc:	5d                   	pop    rbp
      d16bdd:	c3                   	ret
      d16bde:	48 89 c3             	mov    rbx,rax
      d16be1:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d16be6:	e8 a5 72 ad 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d16beb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d16bf2:	00 00 
      d16bf4:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      d16bf9:	75 08                	jne    d16c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x263ba3>
      d16bfb:	48 89 df             	mov    rdi,rbx
      d16bfe:	e8 cd 90 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

## score=44 address-point=0x1882d68
- +0x68 -> 0x1596d50; no-extra score=15; incoming-extra=[]; FDE=(22637904, 22637938)
- +0x98 -> 0x1596d50; boolish score=1; []; FDE=(22637904, 22637938)
- +0xb8 -> 0xc4c5ea; sret score=10; ['writes-rdi-out']; FDE=(12895722, 12895737)
- +0xc0 -> 0xc4c5ea; boolish score=1; []; FDE=(12895722, 12895737)
- materializations:
  - 0x107d3ba: lea    rcx,[rip+0x8059a7]        # 1882d68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3f450>; FDE=(17276972, 17294468)
### +0x68 body
     1596d50:	53                   	push   rbx
     1596d51:	48 89 fb             	mov    rbx,rdi
     1596d54:	48 8d 35 68 14 dd fe 	lea    rsi,[rip+0xfffffffffedd1468]        # 3681c3 <_ZTSSt12bad_any_cast@@Base-0x28005>
     1596d5b:	48 8d 0d 1a b2 eb fe 	lea    rcx,[rip+0xfffffffffeebb21a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1596d62:	6a 0e                	push   0xe
     1596d64:	5a                   	pop    rdx
     1596d65:	45 31 c0             	xor    r8d,r8d
     1596d68:	e8 0f f4 51 ff       	call   ab617c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x311c>
     1596d6d:	48 89 d8             	mov    rax,rbx
     1596d70:	5b                   	pop    rbx
     1596d71:	c3                   	ret
### +0xb8 body head
      c4c5ea:	48 89 f8             	mov    rax,rdi
      c4c5ed:	0f 57 c0             	xorps  xmm0,xmm0
      c4c5f0:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      c4c5f3:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      c4c5f8:	c3                   	ret

## score=44 address-point=0x1863140
- +0x68 -> 0xb79962; no-extra score=15; incoming-extra=[]; FDE=(12032354, 12032363)
- +0x98 -> 0x12e6898; boolish score=0; []; FDE=(19818648, 19818666)
- +0xb8 -> 0x12e5250; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(19812944, 19813456)
- +0xc0 -> 0x12e5cbc; boolish score=0; []; FDE=(19815612, 19816904)
- materializations:
  - 0x12e5efa: lea    rax,[rip+0x57d23f]        # 1863140 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f828>; FDE=(19815612, 19816904)
  - 0x12e6566: lea    rax,[rip+0x57cbd3]        # 1863140 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f828>; FDE=(19817830, 19817849)
  - 0x12e65c7: lea    rax,[rip+0x57cb72]        # 1863140 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f828>; FDE=(19817868, 19818028)
  - 0x12e6630: lea    rcx,[rip+0x57cb09]        # 1863140 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f828>; FDE=(19818028, 19818054)
### +0x68 body
      b79962:	48 83 c7 10          	add    rdi,0x10
      b79966:	e9 bb 71 f2 ff       	jmp    aa0b26 <JNI_OnUnload@@Base+0x283f3>
### +0xb8 body head
     12e5250:	55                   	push   rbp
     12e5251:	41 57                	push   r15
     12e5253:	41 56                	push   r14
     12e5255:	41 55                	push   r13
     12e5257:	41 54                	push   r12
     12e5259:	53                   	push   rbx
     12e525a:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
     12e5261:	4c 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],r9
     12e5266:	4d 89 c5             	mov    r13,r8
     12e5269:	89 4c 24 0c          	mov    DWORD PTR [rsp+0xc],ecx
     12e526d:	49 89 d6             	mov    r14,rdx
     12e5270:	49 89 f7             	mov    r15,rsi
     12e5273:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     12e5278:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12e527f:	00 00 
     12e5281:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     12e5288:	00 
     12e5289:	48 8d 6e 08          	lea    rbp,[rsi+0x8]
     12e528d:	48 8b 86 d0 00 00 00 	mov    rax,QWORD PTR [rsi+0xd0]
     12e5294:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     12e5299:	48 8b 86 e8 00 00 00 	mov    rax,QWORD PTR [rsi+0xe8]
     12e52a0:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     12e52a5:	bf d0 00 00 00       	mov    edi,0xd0
     12e52aa:	e8 51 8c 50 00       	call   17edf00 <_Znwm@plt>
     12e52af:	48 89 c3             	mov    rbx,rax
     12e52b2:	48 89 ef             	mov    rdi,rbp
     12e52b5:	e8 7c 65 79 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     12e52ba:	48 89 c5             	mov    rbp,rax
     12e52bd:	49 89 d4             	mov    r12,rdx
     12e52c0:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     12e52c4:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     12e52c9:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     12e52cd:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     12e52d2:	0f 57 c0             	xorps  xmm0,xmm0
     12e52d5:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     12e52d9:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     12e52de:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
     12e52e5:	00 
     12e52e6:	4c 89 f7             	mov    rdi,r14
     12e52e9:	4c 89 ee             	mov    rsi,r13
     12e52ec:	e8 d9 11 81 ff       	call   af64ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4346a>
     12e52f1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     12e52f6:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     12e52fb:	e8 64 f4 ff ff       	call   12e4764 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x129ce8>
     12e5300:	48 8d 05 e1 dc 57 00 	lea    rax,[rip+0x57dce1]        # 1862fe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f6d0>
     12e5307:	48 89 03             	mov    QWORD PTR [rbx],rax
     12e530a:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     12e530e:	48 89 6b 10          	mov    QWORD PTR [rbx+0x10],rbp
     12e5312:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
     12e5316:	4c 8d 7b 20          	lea    r15,[rbx+0x20]
     12e531a:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     12e531f:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     12e5323:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
     12e5328:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
     12e532e:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     12e5332:	0f 57 c0             	xorps  xmm0,xmm0
     12e5335:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     12e533a:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
     12e533e:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
     12e5341:	4c 8d 63 40          	lea    r12,[rbx+0x40]

## score=44 address-point=0x185e858
- +0x68 -> 0x1259106; no-extra score=-7; incoming-extra=['rdx']; FDE=(19239174, 19239192)
- +0x98 -> 0x125bd30; boolish score=0; []; FDE=(19250480, 19250498)
- +0xb8 -> 0x125bd66; sret score=8; ['reads-rsi-this']; FDE=(19250534, 19250553)
- +0xc0 -> 0x125bd7a; boolish score=1; []; FDE=(19250554, 19250573)
- materializations:
  - 0x11f1c97: lea    rax,[rip+0x66cbba]        # 185e858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1af40>; FDE=(18805556, 18832116)
### +0x68 body
     1259106:	53                   	push   rbx
     1259107:	48 89 fb             	mov    rbx,rdi
     125910a:	e8 29 ff f9 ff       	call   11f9038 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e5bc>
     125910f:	48 89 df             	mov    rdi,rbx
     1259112:	5b                   	pop    rbx
     1259113:	e9 08 4e 59 00       	jmp    17edf20 <_ZdlPv@plt>
### +0xb8 body head
     125bd66:	53                   	push   rbx
     125bd67:	48 89 fb             	mov    rbx,rdi
     125bd6a:	48 8b 76 18          	mov    rsi,QWORD PTR [rsi+0x18]
     125bd6e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     125bd71:	ff 50 28             	call   QWORD PTR [rax+0x28]
     125bd74:	48 89 d8             	mov    rax,rbx
     125bd77:	5b                   	pop    rbx
     125bd78:	c3                   	ret

## score=44 address-point=0x185bd28
- +0x68 -> 0x11fb5f0; no-extra score=-7; incoming-extra=['rdx']; FDE=(18855408, 18855557)
- +0x98 -> 0xbd80cc; boolish score=0; []; FDE=(12419276, 12419292)
- +0xb8 -> 0xeca70c; sret score=8; ['reads-rsi-this']; FDE=(15509260, 15509282)
- +0xc0 -> 0x11fba0e; boolish score=1; []; FDE=(18856462, 18856610)
- materializations:
  - 0x11f4764: lea    rax,[rip+0x6675bd]        # 185bd28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18410>; FDE=(18805556, 18832116)
### +0x68 body
     11fb5f0:	41 57                	push   r15
     11fb5f2:	41 56                	push   r14
     11fb5f4:	53                   	push   rbx
     11fb5f5:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     11fb5fc:	48 89 d3             	mov    rbx,rdx
     11fb5ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb606:	00 00 
     11fb608:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11fb60f:	00 
     11fb610:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     11fb614:	49 89 e7             	mov    r15,rsp
     11fb617:	4c 89 ff             	mov    rdi,r15
     11fb61a:	e8 43 c4 46 00       	call   1667a62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbce>
     11fb61f:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11fb622:	4c 89 f7             	mov    rdi,r14
     11fb625:	4c 89 fe             	mov    rsi,r15
     11fb628:	48 89 da             	mov    rdx,rbx
     11fb62b:	ff 50 68             	call   QWORD PTR [rax+0x68]
     11fb62e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11fb633:	e8 a0 09 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fb638:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb63f:	00 00 
     11fb641:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     11fb648:	00 
     11fb649:	75 35                	jne    11fb680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40c04>
     11fb64b:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
     11fb652:	5b                   	pop    rbx
     11fb653:	41 5e                	pop    r14
     11fb655:	41 5f                	pop    r15
     11fb657:	c3                   	ret
     11fb658:	48 89 c3             	mov    rbx,rax
     11fb65b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11fb660:	e8 73 09 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fb665:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb66c:	00 00 
     11fb66e:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     11fb675:	00 
     11fb676:	75 08                	jne    11fb680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40c04>
     11fb678:	48 89 df             	mov    rdi,rbx
     11fb67b:	e8 50 46 87 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11fb680:	e8 2b 44 5f 00       	call   17efab0 <__stack_chk_fail@plt>
### +0xb8 body head
      eca70c:	53                   	push   rbx
      eca70d:	48 89 fb             	mov    rbx,rdi
      eca710:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      eca714:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      eca717:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      eca71d:	48 89 d8             	mov    rax,rbx
      eca720:	5b                   	pop    rbx
      eca721:	c3                   	ret

## score=44 address-point=0x182f270
- +0x68 -> 0xa7a3be; no-extra score=15; incoming-extra=[]; FDE=(10986430, 10986439)
- +0x98 -> 0xe70860; boolish score=0; []; FDE=(15140960, 15140978)
- +0xb8 -> 0xe709d0; sret score=12; ['reads-rsi-this', 'saves-rsi']; FDE=(15141328, 15141449)
- +0xc0 -> 0x165fa14; boolish score=0; []; FDE=(23460372, 23461482)
- materializations:
  - 0xe6e46d: lea    rax,[rip+0x9c0dfc]        # 182f270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x1208>; FDE=(15131430, 15132225)
  - 0xe6ee06: lea    rax,[rip+0x9c0463]        # 182f270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x1208>; FDE=(15134214, 15134233)
  - 0xe6ee67: lea    rax,[rip+0x9c0402]        # 182f270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x1208>; FDE=(15134252, 15134412)
  - 0xe6eed0: lea    rcx,[rip+0x9c0399]        # 182f270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x1208>; FDE=(15134412, 15134438)
### +0x68 body
      a7a3be:	48 83 c7 20          	add    rdi,0x20
      a7a3c2:	e9 a3 fb ff ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
### +0xb8 body head
      e709d0:	55                   	push   rbp
      e709d1:	41 56                	push   r14
      e709d3:	53                   	push   rbx
      e709d4:	48 89 f3             	mov    rbx,rsi
      e709d7:	49 89 fe             	mov    r14,rdi
      e709da:	8b 6e 20             	mov    ebp,DWORD PTR [rsi+0x20]
      e709dd:	c7 46 20 01 00 00 00 	mov    DWORD PTR [rsi+0x20],0x1
      e709e4:	8b 47 08             	mov    eax,DWORD PTR [rdi+0x8]
      e709e7:	a8 01                	test   al,0x1
      e709e9:	74 13                	je     e709fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e14>
      e709eb:	49 8d 56 18          	lea    rdx,[r14+0x18]
      e709ef:	6a 0a                	push   0xa
      e709f1:	5e                   	pop    rsi
      e709f2:	48 89 df             	mov    rdi,rbx
      e709f5:	e8 12 c0 7e 00       	call   165ca0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10b78>
      e709fa:	41 8b 46 08          	mov    eax,DWORD PTR [r14+0x8]
      e709fe:	a8 02                	test   al,0x2
      e70a00:	74 13                	je     e70a15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e2b>
      e70a02:	41 8b 56 30          	mov    edx,DWORD PTR [r14+0x30]
      e70a06:	6a 14                	push   0x14
      e70a08:	5e                   	pop    rsi
      e70a09:	48 89 df             	mov    rdi,rbx
      e70a0c:	e8 5d bb 7e 00       	call   165c56e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x106da>
      e70a11:	41 8b 46 08          	mov    eax,DWORD PTR [r14+0x8]
      e70a15:	a8 04                	test   al,0x4
      e70a17:	74 0f                	je     e70a28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e3e>
      e70a19:	49 8d 56 38          	lea    rdx,[r14+0x38]
      e70a1d:	6a 1e                	push   0x1e
      e70a1f:	5e                   	pop    rsi
      e70a20:	48 89 df             	mov    rdi,rbx
      e70a23:	e8 e4 bf 7e 00       	call   165ca0c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10b78>
      e70a28:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
      e70a2c:	48 85 f6             	test   rsi,rsi
      e70a2f:	74 0e                	je     e70a3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e55>
      e70a31:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      e70a35:	74 08                	je     e70a3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37e55>
      e70a37:	48 89 df             	mov    rdi,rbx
      e70a3a:	e8 47 c4 7e 00       	call   165ce86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ff2>
      e70a3f:	89 6b 20             	mov    DWORD PTR [rbx+0x20],ebp
      e70a42:	8a 03                	mov    al,BYTE PTR [rbx]
      e70a44:	5b                   	pop    rbx
      e70a45:	41 5e                	pop    r14
      e70a47:	5d                   	pop    rbp
      e70a48:	c3                   	ret

## score=43 address-point=0x18822c0
- +0x68 -> 0x158ed3e; no-extra score=15; incoming-extra=[]; FDE=(22605118, 22605198)
- +0x98 -> 0x158eec6; boolish score=1; []; FDE=(22605510, 22605588)
- +0xb8 -> 0x158f132; sret score=10; ['writes-rdi-out']; FDE=(22606130, 22606285)
- +0xc0 -> 0x158f1ce; boolish score=0; []; FDE=(22606286, 22606352)
- materializations:
  - 0x107a5fc: lea    rax,[rip+0x807cbd]        # 18822c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e9a8>; FDE=(17276972, 17294468)
  - 0x158e1cc: lea    rax,[rip+0x2f40ed]        # 18822c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e9a8>; FDE=(22602160, 22603220)
### +0x68 body
     158ed3e:	55                   	push   rbp
     158ed3f:	41 56                	push   r14
     158ed41:	53                   	push   rbx
     158ed42:	48 89 fb             	mov    rbx,rdi
     158ed45:	4c 8b b7 e8 00 00 00 	mov    r14,QWORD PTR [rdi+0xe8]
     158ed4c:	31 ed                	xor    ebp,ebp
     158ed4e:	4d 85 f6             	test   r14,r14
     158ed51:	74 14                	je     158ed67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d42eb>
     158ed53:	49 8b 76 68          	mov    rsi,QWORD PTR [r14+0x68]
     158ed57:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     158ed5a:	48 89 df             	mov    rdi,rbx
     158ed5d:	ff 50 70             	call   QWORD PTR [rax+0x70]
     158ed60:	09 c5                	or     ebp,eax
     158ed62:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     158ed65:	eb e7                	jmp    158ed4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d42d2>
     158ed67:	4c 8b b3 10 01 00 00 	mov    r14,QWORD PTR [rbx+0x110]
     158ed6e:	4d 85 f6             	test   r14,r14
     158ed71:	74 14                	je     158ed87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d430b>
     158ed73:	49 8b 76 68          	mov    rsi,QWORD PTR [r14+0x68]
     158ed77:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     158ed7a:	48 89 df             	mov    rdi,rbx
     158ed7d:	ff 50 78             	call   QWORD PTR [rax+0x78]
     158ed80:	09 c5                	or     ebp,eax
     158ed82:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     158ed85:	eb e7                	jmp    158ed6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d42f2>
     158ed87:	89 e8                	mov    eax,ebp
     158ed89:	5b                   	pop    rbx
     158ed8a:	41 5e                	pop    r14
     158ed8c:	5d                   	pop    rbp
     158ed8d:	c3                   	ret
### +0xb8 body head
     158f132:	41 56                	push   r14
     158f134:	53                   	push   rbx
     158f135:	48 83 ec 18          	sub    rsp,0x18
     158f139:	49 89 d6             	mov    r14,rdx
     158f13c:	48 89 fb             	mov    rbx,rdi
     158f13f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     158f146:	00 00 
     158f148:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     158f14d:	0f 57 c0             	xorps  xmm0,xmm0
     158f150:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     158f153:	48 89 f7             	mov    rdi,rsi
     158f156:	48 89 d6             	mov    rsi,rdx
     158f159:	e8 7e 23 00 00       	call   15914dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d6a60>
     158f15e:	48 85 c0             	test   rax,rax
     158f161:	74 26                	je     158f189 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d470d>
     158f163:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     158f166:	48 89 e7             	mov    rdi,rsp
     158f169:	48 89 c6             	mov    rsi,rax
     158f16c:	4c 89 f2             	mov    rdx,r14
     158f16f:	ff 51 70             	call   QWORD PTR [rcx+0x70]
     158f172:	49 89 e6             	mov    r14,rsp
     158f175:	48 89 df             	mov    rdi,rbx
     158f178:	4c 89 f6             	mov    rsi,r14
     158f17b:	e8 9c a6 52 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     158f180:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     158f184:	e8 fd f2 50 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     158f189:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     158f190:	00 00 
     158f192:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     158f197:	75 2f                	jne    158f1c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d474c>
     158f199:	48 89 d8             	mov    rax,rbx
     158f19c:	48 83 c4 18          	add    rsp,0x18
     158f1a0:	5b                   	pop    rbx
     158f1a1:	41 5e                	pop    r14
     158f1a3:	c3                   	ret
     158f1a4:	eb 00                	jmp    158f1a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d472a>
     158f1a6:	48 89 c3             	mov    rbx,rax
     158f1a9:	31 ff                	xor    edi,edi
     158f1ab:	e8 d6 f2 50 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     158f1b0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     158f1b7:	00 00 
     158f1b9:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     158f1be:	75 08                	jne    158f1c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d474c>
     158f1c0:	48 89 df             	mov    rdi,rbx
     158f1c3:	e8 08 0b 4e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     158f1c8:	e8 e3 08 26 00       	call   17efab0 <__stack_chk_fail@plt>

## score=43 address-point=0x1879520
- +0x68 -> 0x14d696c; no-extra score=15; incoming-extra=[]; FDE=(21850476, 21850581)
- +0x98 -> 0xcacb00; boolish score=1; []; FDE=(13290240, 13290345)
- +0xb8 -> 0x14d6c3c; sret score=10; ['writes-rdi-out']; FDE=(21851196, 21851253)
- +0xc0 -> 0x14d6c76; boolish score=0; []; FDE=(21851254, 21851272)
- materializations:
  - 0x14d5801: lea    rax,[rip+0x3a3d18]        # 1879520 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35c08>; FDE=(21845880, 21846158)
  - 0x14d6118: lea    rax,[rip+0x3a3401]        # 1879520 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35c08>; FDE=(21848344, 21848359)
  - 0x14e855b: lea    rax,[rip+0x390fbe]        # 1879520 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35c08>; FDE=(21921864, 21925191)
### +0x68 body
     14d696c:	41 56                	push   r14
     14d696e:	53                   	push   rbx
     14d696f:	48 83 ec 28          	sub    rsp,0x28
     14d6973:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14d697a:	00 00 
     14d697c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14d6981:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     14d6985:	48 8d 35 7c 82 3a 00 	lea    rsi,[rip+0x3a827c]        # 187ec08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b2f0>
     14d698c:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     14d6991:	4c 89 f7             	mov    rdi,r14
     14d6994:	e8 11 b4 2e 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
     14d6999:	48 8d 54 24 07       	lea    rdx,[rsp+0x7]
     14d699e:	c6 02 00             	mov    BYTE PTR [rdx],0x0
     14d69a1:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     14d69a4:	4c 89 f6             	mov    rsi,r14
     14d69a7:	e8 b2 6d 6b ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
     14d69ac:	89 c3                	mov    ebx,eax
     14d69ae:	4c 89 f7             	mov    rdi,r14
     14d69b1:	e8 da 74 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14d69b6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14d69bd:	00 00 
     14d69bf:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14d69c4:	75 0a                	jne    14d69d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31bf54>
     14d69c6:	89 d8                	mov    eax,ebx
     14d69c8:	48 83 c4 28          	add    rsp,0x28
     14d69cc:	5b                   	pop    rbx
     14d69cd:	41 5e                	pop    r14
     14d69cf:	c3                   	ret
     14d69d0:	e8 db 90 31 00       	call   17efab0 <__stack_chk_fail@plt>
### +0xb8 body head
     14d6c3c:	53                   	push   rbx
     14d6c3d:	48 89 fb             	mov    rbx,rdi
     14d6c40:	48 8d 05 91 29 3a 00 	lea    rax,[rip+0x3a2991]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14d6c47:	48 89 07             	mov    QWORD PTR [rdi],rax
     14d6c4a:	48 81 c7 98 00 00 00 	add    rdi,0x98
     14d6c51:	e8 7e 2f 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14d6c56:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     14d6c5a:	e8 07 32 30 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     14d6c5f:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     14d6c63:	e8 1e 78 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d6c68:	48 83 c3 08          	add    rbx,0x8
     14d6c6c:	48 89 df             	mov    rdi,rbx
     14d6c6f:	5b                   	pop    rbx
     14d6c70:	e9 f1 b9 60 ff       	jmp    ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>

## score=43 address-point=0x186f9e0
- +0x68 -> 0x14188e4; no-extra score=15; incoming-extra=[]; FDE=(21072100, 21072208)
- +0x98 -> 0xafaa24; boolish score=1; []; FDE=(11512356, 11512367)
- +0xb8 -> 0x14182d2; sret score=10; ['writes-rdi-out']; FDE=(21070546, 21070621)
- +0xc0 -> 0x141831e; boolish score=0; []; FDE=(21070622, 21070640)
- materializations:
  - 0x140b007: lea    rax,[rip+0x4649d2]        # 186f9e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c0c8>; FDE=(21015368, 21024758)
  - 0x1418ec3: lea    rax,[rip+0x456b16]        # 186f9e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c0c8>; FDE=(21073596, 21073671)
### +0x68 body
     14188e4:	53                   	push   rbx
     14188e5:	48 89 fb             	mov    rbx,rdi
     14188e8:	48 8d 05 59 71 45 00 	lea    rax,[rip+0x457159]        # 186fa48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c130>
     14188ef:	48 89 07             	mov    QWORD PTR [rdi],rax
     14188f2:	48 81 c7 08 01 00 00 	add    rdi,0x108
     14188f9:	e8 2a 2e 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     14188fe:	48 8d bb f0 00 00 00 	lea    rdi,[rbx+0xf0]
     1418905:	e8 1e 2e 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     141890a:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
     1418911:	e8 12 2e 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1418916:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
     141891d:	e8 06 2e 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     1418922:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
     1418929:	e8 fa 2d 66 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     141892e:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
     1418935:	e8 d6 bd ff ff       	call   1414710 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259c94>
     141893a:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
     141893e:	e8 45 8b ff ff       	call   1411488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x256a0c>
     1418943:	48 83 c3 28          	add    rbx,0x28
     1418947:	48 89 df             	mov    rdi,rbx
     141894a:	5b                   	pop    rbx
     141894b:	e9 d8 2d 66 ff       	jmp    a7b728 <JNI_OnUnload@@Base+0x2ff5>
### +0xb8 body head
     14182d2:	41 56                	push   r14
     14182d4:	53                   	push   rbx
     14182d5:	50                   	push   rax
     14182d6:	48 89 fb             	mov    rbx,rdi
     14182d9:	48 8d 05 b8 77 45 00 	lea    rax,[rip+0x4577b8]        # 186fa98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c180>
     14182e0:	48 89 07             	mov    QWORD PTR [rdi],rax
     14182e3:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     14182e7:	48 81 c7 98 01 00 00 	add    rdi,0x198
     14182ee:	e8 35 1b 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     14182f3:	48 8d bb 78 01 00 00 	lea    rdi,[rbx+0x178]
     14182fa:	e8 39 5c ff ff       	call   140df38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2534bc>
     14182ff:	48 81 c3 70 01 00 00 	add    rbx,0x170
     1418306:	48 89 df             	mov    rdi,rbx
     1418309:	e8 1a 1b 66 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     141830e:	4c 89 f7             	mov    rdi,r14
     1418311:	48 83 c4 08          	add    rsp,0x8
     1418315:	5b                   	pop    rbx
     1418316:	41 5e                	pop    r14
     1418318:	e9 31 fe ff ff       	jmp    141814e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d6d2>

## score=43 address-point=0x1869738
- +0x68 -> 0x138f6ac; no-extra score=15; incoming-extra=[]; FDE=(20510380, 20510483)
- +0x98 -> 0x138fbbe; boolish score=0; []; FDE=(20511678, 20511702)
- +0xb8 -> 0x138fd1c; sret score=10; ['writes-rdi-out']; FDE=(20512028, 20512178)
- +0xc0 -> 0x138fdb2; boolish score=1; []; FDE=(20512178, 20512324)
- materializations:
  - 0x139c9d6: lea    rax,[rip+0x4ccd5b]        # 1869738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25e20>; FDE=(20564373, 20564478)
### +0x68 body
     138f6ac:	53                   	push   rbx
     138f6ad:	48 89 fb             	mov    rbx,rdi
     138f6b0:	f6 87 38 01 00 00 01 	test   BYTE PTR [rdi+0x138],0x1
     138f6b7:	74 09                	je     138f6c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4c46>
     138f6b9:	4c 8b 83 48 01 00 00 	mov    r8,QWORD PTR [rbx+0x148]
     138f6c0:	eb 07                	jmp    138f6c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4c4d>
     138f6c2:	4c 8d 83 39 01 00 00 	lea    r8,[rbx+0x139]
     138f6c9:	f6 83 20 01 00 00 01 	test   BYTE PTR [rbx+0x120],0x1
     138f6d0:	74 09                	je     138f6db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4c5f>
     138f6d2:	4c 8b 8b 30 01 00 00 	mov    r9,QWORD PTR [rbx+0x130]
     138f6d9:	eb 07                	jmp    138f6e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4c66>
     138f6db:	4c 8d 8b 21 01 00 00 	lea    r9,[rbx+0x121]
     138f6e2:	48 8d 35 93 28 0c ff 	lea    rsi,[rip+0xffffffffff0c2893]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     138f6e9:	48 8d 0d 17 3f fc fe 	lea    rcx,[rip+0xfffffffffefc3f17]        # 353607 <_ZTSSt12bad_any_cast@@Base-0x3cbc1>
     138f6f0:	6a 04                	push   0x4
     138f6f2:	5f                   	pop    rdi
     138f6f3:	ba 57 03 00 00       	mov    edx,0x357
     138f6f8:	31 c0                	xor    eax,eax
     138f6fa:	e8 d3 71 44 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     138f6ff:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     138f703:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     138f706:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     138f70b:	48 89 de             	mov    rsi,rbx
     138f70e:	ff 50 60             	call   QWORD PTR [rax+0x60]
     138f711:	5b                   	pop    rbx
     138f712:	c3                   	ret
### +0xb8 body head
     138fd1c:	41 57                	push   r15
     138fd1e:	41 56                	push   r14
     138fd20:	53                   	push   rbx
     138fd21:	48 83 ec 40          	sub    rsp,0x40
     138fd25:	48 89 fb             	mov    rbx,rdi
     138fd28:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138fd2f:	00 00 
     138fd31:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     138fd36:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
     138fd3b:	48 89 30             	mov    QWORD PTR [rax],rsi
     138fd3e:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
     138fd42:	4c 8d b7 c0 06 00 00 	lea    r14,[rdi+0x6c0]
     138fd49:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
     138fd4e:	49 89 07             	mov    QWORD PTR [r15],rax
     138fd51:	49 89 7f 08          	mov    QWORD PTR [r15+0x8],rdi
     138fd55:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     138fd5a:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     138fd5e:	8b bf c8 09 00 00    	mov    edi,DWORD PTR [rdi+0x9c8]
     138fd64:	e8 df ec 71 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     138fd69:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     138fd6e:	4c 89 3f             	mov    QWORD PTR [rdi],r15
     138fd71:	8b 83 c8 09 00 00    	mov    eax,DWORD PTR [rbx+0x9c8]
     138fd77:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     138fd7c:	48 39 c8             	cmp    rax,rcx
     138fd7f:	6a ff                	push   0xffffffffffffffff
     138fd81:	59                   	pop    rcx
     138fd82:	48 0f 45 c8          	cmovne rcx,rax
     138fd86:	48 8d 05 eb 91 4d 00 	lea    rax,[rip+0x4d91eb]        # 1868f78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25660>
     138fd8d:	4c 89 f6             	mov    rsi,r14
     138fd90:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     138fd93:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138fd9a:	00 00 
     138fd9c:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     138fda1:	75 0a                	jne    138fdad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5331>
     138fda3:	48 83 c4 40          	add    rsp,0x40
     138fda7:	5b                   	pop    rbx
     138fda8:	41 5e                	pop    r14
     138fdaa:	41 5f                	pop    r15
     138fdac:	c3                   	ret
     138fdad:	e8 fe fc 45 00       	call   17efab0 <__stack_chk_fail@plt>

## score=43 address-point=0x1868cd0
- +0x68 -> 0x138f6ac; no-extra score=15; incoming-extra=[]; FDE=(20510380, 20510483)
- +0x98 -> 0x138fbbe; boolish score=0; []; FDE=(20511678, 20511702)
- +0xb8 -> 0x138fd1c; sret score=10; ['writes-rdi-out']; FDE=(20512028, 20512178)
- +0xc0 -> 0x138fdb2; boolish score=1; []; FDE=(20512178, 20512324)
- materializations:
  - 0x1388da8: lea    rax,[rip+0x4dff21]        # 1868cd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x253b8>; FDE=(20482656, 20486668)
### +0x68 body
     138f6ac:	53                   	push   rbx
     138f6ad:	48 89 fb             	mov    rbx,rdi
     138f6b0:	f6 87 38 01 00 00 01 	test   BYTE PTR [rdi+0x138],0x1
     138f6b7:	74 09                	je     138f6c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4c46>
     138f6b9:	4c 8b 83 48 01 00 00 	mov    r8,QWORD PTR [rbx+0x148]
     138f6c0:	eb 07                	jmp    138f6c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4c4d>
     138f6c2:	4c 8d 83 39 01 00 00 	lea    r8,[rbx+0x139]
     138f6c9:	f6 83 20 01 00 00 01 	test   BYTE PTR [rbx+0x120],0x1
     138f6d0:	74 09                	je     138f6db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4c5f>
     138f6d2:	4c 8b 8b 30 01 00 00 	mov    r9,QWORD PTR [rbx+0x130]
     138f6d9:	eb 07                	jmp    138f6e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4c66>
     138f6db:	4c 8d 8b 21 01 00 00 	lea    r9,[rbx+0x121]
     138f6e2:	48 8d 35 93 28 0c ff 	lea    rsi,[rip+0xffffffffff0c2893]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     138f6e9:	48 8d 0d 17 3f fc fe 	lea    rcx,[rip+0xfffffffffefc3f17]        # 353607 <_ZTSSt12bad_any_cast@@Base-0x3cbc1>
     138f6f0:	6a 04                	push   0x4
     138f6f2:	5f                   	pop    rdi
     138f6f3:	ba 57 03 00 00       	mov    edx,0x357
     138f6f8:	31 c0                	xor    eax,eax
     138f6fa:	e8 d3 71 44 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     138f6ff:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     138f703:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     138f706:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     138f70b:	48 89 de             	mov    rsi,rbx
     138f70e:	ff 50 60             	call   QWORD PTR [rax+0x60]
     138f711:	5b                   	pop    rbx
     138f712:	c3                   	ret
### +0xb8 body head
     138fd1c:	41 57                	push   r15
     138fd1e:	41 56                	push   r14
     138fd20:	53                   	push   rbx
     138fd21:	48 83 ec 40          	sub    rsp,0x40
     138fd25:	48 89 fb             	mov    rbx,rdi
     138fd28:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138fd2f:	00 00 
     138fd31:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     138fd36:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
     138fd3b:	48 89 30             	mov    QWORD PTR [rax],rsi
     138fd3e:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
     138fd42:	4c 8d b7 c0 06 00 00 	lea    r14,[rdi+0x6c0]
     138fd49:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
     138fd4e:	49 89 07             	mov    QWORD PTR [r15],rax
     138fd51:	49 89 7f 08          	mov    QWORD PTR [r15+0x8],rdi
     138fd55:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     138fd5a:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     138fd5e:	8b bf c8 09 00 00    	mov    edi,DWORD PTR [rdi+0x9c8]
     138fd64:	e8 df ec 71 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     138fd69:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     138fd6e:	4c 89 3f             	mov    QWORD PTR [rdi],r15
     138fd71:	8b 83 c8 09 00 00    	mov    eax,DWORD PTR [rbx+0x9c8]
     138fd77:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     138fd7c:	48 39 c8             	cmp    rax,rcx
     138fd7f:	6a ff                	push   0xffffffffffffffff
     138fd81:	59                   	pop    rcx
     138fd82:	48 0f 45 c8          	cmovne rcx,rax
     138fd86:	48 8d 05 eb 91 4d 00 	lea    rax,[rip+0x4d91eb]        # 1868f78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25660>
     138fd8d:	4c 89 f6             	mov    rsi,r14
     138fd90:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     138fd93:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     138fd9a:	00 00 
     138fd9c:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     138fda1:	75 0a                	jne    138fdad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d5331>
     138fda3:	48 83 c4 40          	add    rsp,0x40
     138fda7:	5b                   	pop    rbx
     138fda8:	41 5e                	pop    r14
     138fdaa:	41 5f                	pop    r15
     138fdac:	c3                   	ret
     138fdad:	e8 fe fc 45 00       	call   17efab0 <__stack_chk_fail@plt>

## score=43 address-point=0x1861498
- +0x68 -> 0x1066dbe; no-extra score=15; incoming-extra=[]; FDE=(17198526, 17198537)
- +0x98 -> 0x129ede4; boolish score=1; []; FDE=(19525092, 19525264)
- +0xb8 -> 0x129e954; sret score=10; ['writes-rdi-out']; FDE=(19523924, 19523943)
- +0xc0 -> 0x129e968; boolish score=0; []; FDE=(19523944, 19523962)
- materializations:
  - 0x12973de: lea    rax,[rip+0x5ca0b3]        # 1861498 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1db80>; FDE=(19493062, 19496546)
  - 0x129b52e: lea    rax,[rip+0x5c5f63]        # 1861498 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1db80>; FDE=(19510574, 19510593)
  - 0x129b58f: lea    rax,[rip+0x5c5f02]        # 1861498 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1db80>; FDE=(19510612, 19510772)
  - 0x129b5f8: lea    rcx,[rip+0x5c5e99]        # 1861498 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1db80>; FDE=(19510772, 19510798)
### +0x68 body
     1066dbe:	48 89 f8             	mov    rax,rdi
     1066dc1:	31 c9                	xor    ecx,ecx
     1066dc3:	88 0f                	mov    BYTE PTR [rdi],cl
     1066dc5:	88 4f 18             	mov    BYTE PTR [rdi+0x18],cl
     1066dc8:	c3                   	ret
### +0xb8 body head
     129e954:	48 8d 05 f5 2b 5c 00 	lea    rax,[rip+0x5c2bf5]        # 1861550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1dc38>
     129e95b:	48 89 07             	mov    QWORD PTR [rdi],rax
     129e95e:	48 83 c7 08          	add    rdi,0x8
     129e962:	e9 15 ff ff ff       	jmp    129e87c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3e00>

## score=43 address-point=0x185e888
- +0x68 -> 0x125bd30; no-extra score=-7; incoming-extra=['rdx']; FDE=(19250480, 19250498)
- +0x98 -> 0x125bd8e; boolish score=0; []; FDE=(19250574, 19250584)
- +0xb8 -> 0xcd99c8; sret score=8; ['reads-rsi-this']; FDE=(13474248, 13474256)
- +0xc0 -> 0x125bcea; boolish score=0; []; FDE=(19250410, 19250421)
- materializations:
  - 0x11f1a9a: lea    rax,[rip+0x66cde7]        # 185e888 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1af70>; FDE=(18805556, 18832116)
### +0x68 body
     125bd30:	53                   	push   rbx
     125bd31:	48 89 fb             	mov    rbx,rdi
     125bd34:	e8 dd cc f9 ff       	call   11f8a16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3df9a>
     125bd39:	48 89 df             	mov    rdi,rbx
     125bd3c:	5b                   	pop    rbx
     125bd3d:	e9 de 21 59 00       	jmp    17edf20 <_ZdlPv@plt>
### +0xb8 body head
      cd99c8:	8b 06                	mov    eax,DWORD PTR [rsi]
      cd99ca:	3b 02                	cmp    eax,DWORD PTR [rdx]
      cd99cc:	0f 94 c0             	sete   al
      cd99cf:	c3                   	ret

## Semantic/string xrefs inside top +0x68 implementations
### AP 0x185ca00 +0x68=0x1217ee8 score=67 FDE=(18972392, 18972400)

### AP 0x185df18 +0x68=0x124dbc8 score=66 FDE=(19192776, 19192781)

### AP 0x185cfd8 +0x68=0xbea56e score=66 FDE=(12494190, 12494194)

### AP 0x185c748 +0x68=0xaaaedc score=66 FDE=(11185884, 11185893)

### AP 0x185ca28 +0x68=0x1217f16 score=59 FDE=(18972438, 18972446)

### AP 0x18a1e28 +0x68=0x174ec6a score=58 FDE=(24439914, 24439919)

### AP 0x188fb80 +0x68=0x174ec6a score=58 FDE=(24439914, 24439919)

### AP 0x1875aa0 +0x68=0x148b1d6 score=58 FDE=(21541334, 21541343)

### AP 0x185ec50 +0x68=0x125fb16 score=58 FDE=(19266326, 19266493)

### AP 0x185e8b8 +0x68=0x125bd8e score=58 FDE=(19250574, 19250584)

### AP 0x185c700 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

### AP 0x185c6b8 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

### AP 0x185c670 +0x68=0xaae9b2 score=58 FDE=(11200946, 11200955)

### AP 0x185c628 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

### AP 0x185c5e0 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

### AP 0x185c598 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

### AP 0x185c550 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

### AP 0x185c508 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

### AP 0x185c4c0 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

### AP 0x185c478 +0x68=0xaaaedc score=58 FDE=(11185884, 11185893)

## Materialization contexts for top 12
### AP 0x185ca00 materialized @0x11f042f; FDE=(18805556, 18832116)
     11f03f4:	4c 89 f6             	mov    rsi,r14
     11f03f7:	e8 42 96 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f03fc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f0400:	e8 81 e0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0405:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     11f040c:	00 
     11f040d:	e8 d6 a3 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0412:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f0419:	00 
     11f041a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f041d:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f0420:	4c 8b b4 24 90 06 00 	mov    r14,QWORD PTR [rsp+0x690]
     11f0427:	00 
     11f0428:	48 8d 93 60 06 00 00 	lea    rdx,[rbx+0x660]
     11f042f:	48 8d 0d ca c5 66 00 	lea    rcx,[rip+0x66c5ca]        # 185ca00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x190e8>
     11f0436:	48 89 8b d0 06 00 00 	mov    QWORD PTR [rbx+0x6d0],rcx
     11f043d:	48 89 83 d8 06 00 00 	mov    QWORD PTR [rbx+0x6d8],rax
     11f0444:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
     11f044b:	00 
     11f044c:	48 89 93 e0 06 00 00 	mov    QWORD PTR [rbx+0x6e0],rdx
     11f0453:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f0456:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f045d:	00 
     11f045e:	4c 89 f6             	mov    rsi,r14
     11f0461:	ff 50 58             	call   QWORD PTR [rax+0x58]
     11f0464:	4c 8b a4 24 20 05 00 	mov    r12,QWORD PTR [rsp+0x520]
     11f046b:	00 
     11f046c:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     11f0473:	00 
     11f0474:	48 8b b4 24 60 06 00 	mov    rsi,QWORD PTR [rsp+0x660]
     11f047b:	00 
     11f047c:	e8 41 12 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11f0481:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f0484:	4c 89 f7             	mov    rdi,r14
     11f0487:	ff 50 60             	call   QWORD PTR [rax+0x60]
     11f048a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11f048f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f0494:	8a 80 aa 00 00 00    	mov    al,BYTE PTR [rax+0xaa]
     11f049a:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     11f049e:	48 8d 93 f0 06 00 00 	lea    rdx,[rbx+0x6f0]
     11f04a5:	48 8d 05 3c e6 66 00 	lea    rax,[rip+0x66e63c]        # 185eae8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b1d0>
     11f04ac:	48 89 83 e8 06 00 00 	mov    QWORD PTR [rbx+0x6e8],rax
     11f04b3:	48 8d 05 86 e6 66 00 	lea    rax,[rip+0x66e686]        # 185eb40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b228>
     11f04ba:	48 89 83 f0 06 00 00 	mov    QWORD PTR [rbx+0x6f0],rax
     11f04c1:	4c 89 a3 f8 06 00 00 	mov    QWORD PTR [rbx+0x6f8],r12
     11f04c8:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]

### AP 0x188fb80 materialized @0x10469b0; FDE=(17061754, 17068268)
     1046979:	5f                   	pop    rdi
     104697a:	e8 81 75 7a 00       	call   17edf00 <_Znwm@plt>
     104697f:	49 89 c6             	mov    r14,rax
     1046982:	c7 40 08 b3 00 01 00 	mov    DWORD PTR [rax+0x8],0x100b3
     1046989:	66 0f ef c0          	pxor   xmm0,xmm0
     104698d:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     1046992:	48 8d 05 0f 0b 80 00 	lea    rax,[rip+0x800b0f]        # 18474a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b90>
     1046999:	49 89 06             	mov    QWORD PTR [r14],rax
     104699c:	4d 89 f5             	mov    r13,r14
     104699f:	49 83 c5 18          	add    r13,0x18
     10469a3:	6a 40                	push   0x40
     10469a5:	5f                   	pop    rdi
     10469a6:	e8 55 75 7a 00       	call   17edf00 <_Znwm@plt>
     10469ab:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     10469b0:	48 8d 0d c9 91 84 00 	lea    rcx,[rip+0x8491c9]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     10469b7:	48 89 08             	mov    QWORD PTR [rax],rcx
     10469ba:	66 0f ef c0          	pxor   xmm0,xmm0
     10469be:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     10469c3:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     10469c8:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
     10469cf:	00 00 
     10469d1:	f3 0f 7f 40 30       	movdqu XMMWORD PTR [rax+0x30],xmm0
     10469d6:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     10469da:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     10469e1:	00 
     10469e2:	4c 89 36             	mov    QWORD PTR [rsi],r14
     10469e5:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     10469ea:	e8 91 09 00 00       	call   1047380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20e796>
     10469ef:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     10469f6:	00 
     10469f7:	48 85 ff             	test   rdi,rdi
     10469fa:	74 06                	je     1046a02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20de18>
     10469fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10469ff:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1046a02:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     1046a09:	00 
     1046a0a:	e8 47 07 00 00       	call   1047156 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20e56c>
     1046a0f:	6a 20                	push   0x20
     1046a11:	5f                   	pop    rdi
     1046a12:	e8 e9 74 7a 00       	call   17edf00 <_Znwm@plt>
     1046a17:	49 89 c6             	mov    r14,rax
     1046a1a:	c7 40 08 b6 00 01 00 	mov    DWORD PTR [rax+0x8],0x100b6
     1046a21:	66 0f ef c0          	pxor   xmm0,xmm0
     1046a25:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     1046a2a:	48 8d 05 b7 0a 80 00 	lea    rax,[rip+0x800ab7]        # 18474e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3bd0>
     1046a31:	49 89 06             	mov    QWORD PTR [r14],rax

### AP 0x188fb80 materialized @0x117fb30; FDE=(18348504, 18350127)
     117faf6:	31 d2                	xor    edx,edx
     117faf8:	83 f8 04             	cmp    eax,0x4
     117fafb:	0f 42 d1             	cmovb  edx,ecx
     117fafe:	89 53 3c             	mov    DWORD PTR [rbx+0x3c],edx
     117fb01:	80 4b 10 20          	or     BYTE PTR [rbx+0x10],0x20
     117fb05:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     117fb0b:	0f 57 c0             	xorps  xmm0,xmm0
     117fb0e:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     117fb13:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     117fb18:	48 8b bd c0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xc0]
     117fb1f:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
     117fb23:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
     117fb2a:	00 
     117fb2b:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     117fb30:	48 8d 05 49 00 71 00 	lea    rax,[rip+0x710049]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     117fb37:	48 89 02             	mov    QWORD PTR [rdx],rax
     117fb3a:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     117fb3e:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     117fb42:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     117fb46:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     117fb4a:	e8 e1 04 00 00       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>
     117fb4f:	84 c0                	test   al,al
     117fb51:	74 44                	je     117fb97 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x346fad>
     117fb53:	f6 84 24 98 00 00 00 	test   BYTE PTR [rsp+0x98],0x1
     117fb5a:	01 
     117fb5b:	74 3a                	je     117fb97 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x346fad>
     117fb5d:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     117fb64:	00 
     117fb65:	48 85 c0             	test   rax,rax
     117fb68:	48 8d 35 c1 ea 7d 00 	lea    rsi,[rip+0x7deac1]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     117fb6f:	48 0f 45 f0          	cmovne rsi,rax
     117fb73:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     117fb78:	e8 e6 ff 01 00       	call   119fb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f79>
     117fb7d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     117fb82:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
     117fb87:	4c 89 fe             	mov    rsi,r15
     117fb8a:	e8 9f be 8f ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     117fb8f:	4c 89 ff             	mov    rdi,r15
     117fb92:	e8 f9 e2 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     117fb97:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     117fb9e:	00 
     117fb9f:	e8 0e c2 4a 00       	call   162bdb2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f20>
     117fba4:	0f b6 44 24 20       	movzx  eax,BYTE PTR [rsp+0x20]
     117fba9:	a8 01                	test   al,0x1
     117fbab:	74 07                	je     117fbb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x346fca>
     117fbad:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]

### AP 0x188fb80 materialized @0x1181079; FDE=(18354060, 18354856)
     1181039:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
     118103d:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
     1181041:	c7 43 3c 01 00 00 00 	mov    DWORD PTR [rbx+0x3c],0x1
     1181048:	0d e0 00 00 00       	or     eax,0xe0
     118104d:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
     1181050:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
     1181055:	4d 8b ad a0 00 00 00 	mov    r13,QWORD PTR [r13+0xa0]
     118105c:	49 8b 6e 18          	mov    rbp,QWORD PTR [r14+0x18]
     1181060:	48 83 e5 fc          	and    rbp,0xfffffffffffffffc
     1181064:	48 89 df             	mov    rdi,rbx
     1181067:	e8 3c 02 00 00       	call   11812a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3486be>
     118106c:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     1181071:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1181076:	49 89 c4             	mov    r12,rax
     1181079:	48 8d 05 00 eb 70 00 	lea    rax,[rip+0x70eb00]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     1181080:	48 89 02             	mov    QWORD PTR [rdx],rax
     1181083:	0f 57 c0             	xorps  xmm0,xmm0
     1181086:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     118108a:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     118108e:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     1181092:	4c 89 ef             	mov    rdi,r13
     1181095:	48 89 ee             	mov    rsi,rbp
     1181098:	e8 93 ef ff ff       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>
     118109d:	84 c0                	test   al,al
     118109f:	74 4d                	je     11810ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348504>
     11810a1:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11810a6:	48 85 c0             	test   rax,rax
     11810a9:	48 8d 0d 80 d5 7d 00 	lea    rcx,[rip+0x7dd580]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     11810b0:	48 0f 45 c8          	cmovne rcx,rax
     11810b4:	48 8b 41 18          	mov    rax,QWORD PTR [rcx+0x18]
     11810b8:	48 83 c1 18          	add    rcx,0x18
     11810bc:	48 89 c2             	mov    rdx,rax
     11810bf:	48 83 c2 07          	add    rdx,0x7
     11810c3:	a8 01                	test   al,0x1
     11810c5:	48 0f 44 d1          	cmove  rdx,rcx
     11810c9:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     11810cc:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
     11810d0:	48 85 c0             	test   rax,rax
     11810d3:	48 8d 0d fe 1b 80 00 	lea    rcx,[rip+0x801bfe]        # 1982cd8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4b920>
     11810da:	48 0f 45 c8          	cmovne rcx,rax
     11810de:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
     11810e2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     11810e6:	4c 89 e7             	mov    rdi,r12
     11810e9:	e8 92 cf 66 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     11810ee:	4c 8b a4 24 90 00 00 	mov    r12,QWORD PTR [rsp+0x90]
     11810f5:	00 

### AP 0x188fb80 materialized @0x1182709; FDE=(18359778, 18361597)
     11826cd:	89 4f 10             	mov    DWORD PTR [rdi+0x10],ecx
     11826d0:	48 8b 4b 38          	mov    rcx,QWORD PTR [rbx+0x38]
     11826d4:	48 89 4f 48          	mov    QWORD PTR [rdi+0x48],rcx
     11826d8:	0d e0 00 00 00       	or     eax,0xe0
     11826dd:	89 47 10             	mov    DWORD PTR [rdi+0x10],eax
     11826e0:	48 89 d8             	mov    rax,rbx
     11826e3:	49 8b 9e b0 00 00 00 	mov    rbx,QWORD PTR [r14+0xb0]
     11826ea:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11826ef:	48 8b 68 18          	mov    rbp,QWORD PTR [rax+0x18]
     11826f3:	48 83 e5 fc          	and    rbp,0xfffffffffffffffc
     11826f7:	e8 ac eb ff ff       	call   11812a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3486be>
     11826fc:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     1182701:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1182706:	49 89 c4             	mov    r12,rax
     1182709:	48 8d 05 70 d4 70 00 	lea    rax,[rip+0x70d470]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     1182710:	48 89 02             	mov    QWORD PTR [rdx],rax
     1182713:	0f 57 c0             	xorps  xmm0,xmm0
     1182716:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     118271a:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     118271e:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     1182722:	48 89 df             	mov    rdi,rbx
     1182725:	48 89 ee             	mov    rsi,rbp
     1182728:	e8 03 d9 ff ff       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>
     118272d:	84 c0                	test   al,al
     118272f:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     1182734:	74 41                	je     1182777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349b8d>
     1182736:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
     118273b:	74 3a                	je     1182777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349b8d>
     118273d:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1182742:	48 85 c0             	test   rax,rax
     1182745:	48 8d 35 e4 be 7d 00 	lea    rsi,[rip+0x7dbee4]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     118274c:	48 0f 45 f0          	cmovne rsi,rax
     1182750:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1182755:	e8 09 d4 01 00       	call   119fb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f79>
     118275a:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
     118275f:	4c 89 e7             	mov    rdi,r12
     1182762:	48 89 de             	mov    rsi,rbx
     1182765:	e8 c4 92 8f ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     118276a:	48 89 df             	mov    rdi,rbx
     118276d:	e8 1e b7 66 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1182772:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     1182777:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     118277c:	e8 31 96 4a 00       	call   162bdb2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f20>
     1182781:	41 83 7d 28 0c       	cmp    DWORD PTR [r13+0x28],0xc
     1182786:	75 06                	jne    118278e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x349ba4>
     1182788:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]

### AP 0x188fb80 materialized @0x1185427; FDE=(18371377, 18372358)
     11853f1:	89 c5                	mov    ebp,eax
     11853f3:	84 c0                	test   al,al
     11853f5:	74 26                	je     118541d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c833>
     11853f7:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
     11853fe:	00 
     11853ff:	83 4b 10 02          	or     DWORD PTR [rbx+0x10],0x2
     1185403:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1185407:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     118540b:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     118540f:	f6 c2 01             	test   dl,0x1
     1185412:	0f 85 89 02 00 00    	jne    11856a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34cab7>
     1185418:	e8 75 03 5e 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     118541d:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
     1185422:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1185427:	48 8d 05 52 a7 70 00 	lea    rax,[rip+0x70a752]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     118542e:	48 89 02             	mov    QWORD PTR [rdx],rax
     1185431:	0f 57 c0             	xorps  xmm0,xmm0
     1185434:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     1185438:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     118543c:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     1185440:	4c 89 ff             	mov    rdi,r15
     1185443:	4c 89 f6             	mov    rsi,r14
     1185446:	e8 e5 ab ff ff       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>
     118544b:	84 c0                	test   al,al
     118544d:	74 6d                	je     11854bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c8d2>
     118544f:	f6 44 24 38 01       	test   BYTE PTR [rsp+0x38],0x1
     1185454:	74 66                	je     11854bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c8d2>
     1185456:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     118545b:	48 85 c9             	test   rcx,rcx
     118545e:	48 8d 05 cb 91 7d 00 	lea    rax,[rip+0x7d91cb]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     1185465:	48 0f 45 c1          	cmovne rax,rcx
     1185469:	83 78 20 00          	cmp    DWORD PTR [rax+0x20],0x0
     118546d:	7e 4d                	jle    11854bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34c8d2>
     118546f:	48 8b 48 18          	mov    rcx,QWORD PTR [rax+0x18]
     1185473:	48 83 c0 18          	add    rax,0x18
     1185477:	48 89 ca             	mov    rdx,rcx
     118547a:	48 83 c2 07          	add    rdx,0x7
     118547e:	f6 c1 01             	test   cl,0x1
     1185481:	48 0f 44 d0          	cmove  rdx,rax
     1185485:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     1185488:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
     118548c:	48 85 c0             	test   rax,rax
     118548f:	48 8d 0d 42 d8 7f 00 	lea    rcx,[rip+0x7fd842]        # 1982cd8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4b920>
     1185496:	48 0f 45 c8          	cmovne rcx,rax
     118549a:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
     118549e:	83 4b 10 04          	or     DWORD PTR [rbx+0x10],0x4

### AP 0x188fb80 materialized @0x1194d2e; FDE=(18435340, 18435546)
     1194d02:	41 5d                	pop    r13
     1194d04:	41 5e                	pop    r14
     1194d06:	41 5f                	pop    r15
     1194d08:	5d                   	pop    rbp
     1194d09:	41 ff e1             	jmp    r9
     1194d0c:	41 56                	push   r14
     1194d0e:	53                   	push   rbx
     1194d0f:	48 83 ec 68          	sub    rsp,0x68
     1194d13:	48 89 d3             	mov    rbx,rdx
     1194d16:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1194d1d:	00 00 
     1194d1f:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1194d24:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
     1194d29:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1194d2e:	48 8d 05 4b ae 6f 00 	lea    rax,[rip+0x6fae4b]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     1194d35:	48 89 02             	mov    QWORD PTR [rdx],rax
     1194d38:	0f 57 c0             	xorps  xmm0,xmm0
     1194d3b:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     1194d3f:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     1194d43:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     1194d47:	e8 e4 b2 fe ff       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>
     1194d4c:	84 c0                	test   al,al
     1194d4e:	74 3c                	je     1194d8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c1a2>
     1194d50:	f6 44 24 30 01       	test   BYTE PTR [rsp+0x30],0x1
     1194d55:	74 35                	je     1194d8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c1a2>
     1194d57:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     1194d5c:	48 85 c0             	test   rax,rax
     1194d5f:	48 8d 35 ca 98 7c 00 	lea    rsi,[rip+0x7c98ca]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     1194d66:	48 0f 45 f0          	cmovne rsi,rax
     1194d6a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1194d6f:	e8 ef ad 00 00       	call   119fb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f79>
     1194d74:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     1194d79:	48 89 df             	mov    rdi,rbx
     1194d7c:	4c 89 f6             	mov    rsi,r14
     1194d7f:	e8 aa 6c 8e ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1194d84:	4c 89 f7             	mov    rdi,r14
     1194d87:	e8 04 91 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1194d8c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1194d91:	e8 1c 70 49 00       	call   162bdb2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f20>
     1194d96:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1194d9d:	00 00 
     1194d9f:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     1194da4:	75 2f                	jne    1194dd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35c1eb>
     1194da6:	48 83 c4 68          	add    rsp,0x68
     1194daa:	5b                   	pop    rbx
     1194dab:	41 5e                	pop    r14

### AP 0x188fb80 materialized @0x1195a41; FDE=(18438320, 18439749)
     1195a07:	eb 04                	jmp    1195a0d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ce23>
     1195a09:	41 8b 47 10          	mov    eax,DWORD PTR [r15+0x10]
     1195a0d:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
     1195a11:	83 c8 20             	or     eax,0x20
     1195a14:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax
     1195a18:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1195a1d:	4c 8b a8 a0 00 00 00 	mov    r13,QWORD PTR [rax+0xa0]
     1195a24:	49 8b 6e 18          	mov    rbp,QWORD PTR [r14+0x18]
     1195a28:	48 83 e5 fc          	and    rbp,0xfffffffffffffffc
     1195a2c:	48 89 df             	mov    rdi,rbx
     1195a2f:	e8 74 b8 fe ff       	call   11812a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3486be>
     1195a34:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
     1195a39:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1195a3e:	49 89 c4             	mov    r12,rax
     1195a41:	48 8d 05 38 a1 6f 00 	lea    rax,[rip+0x6fa138]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     1195a48:	48 89 02             	mov    QWORD PTR [rdx],rax
     1195a4b:	0f 57 c0             	xorps  xmm0,xmm0
     1195a4e:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     1195a52:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     1195a56:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     1195a5a:	4c 89 ef             	mov    rdi,r13
     1195a5d:	48 89 ee             	mov    rsi,rbp
     1195a60:	e8 cb a5 fe ff       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>
     1195a65:	84 c0                	test   al,al
     1195a67:	74 3c                	je     1195aa5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35cebb>
     1195a69:	f6 44 24 70 01       	test   BYTE PTR [rsp+0x70],0x1
     1195a6e:	74 35                	je     1195aa5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35cebb>
     1195a70:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     1195a75:	48 85 c0             	test   rax,rax
     1195a78:	48 8d 35 b1 8b 7c 00 	lea    rsi,[rip+0x7c8bb1]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     1195a7f:	48 0f 45 f0          	cmovne rsi,rax
     1195a83:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1195a88:	e8 d6 a0 00 00       	call   119fb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f79>
     1195a8d:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     1195a92:	4c 89 e7             	mov    rdi,r12
     1195a95:	4c 89 ee             	mov    rsi,r13
     1195a98:	e8 91 5f 8e ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1195a9d:	4c 89 ef             	mov    rdi,r13
     1195aa0:	e8 eb 83 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1195aa5:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1195aaa:	e8 03 63 49 00       	call   162bdb2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f20>
     1195aaf:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1195ab4:	4c 8b a0 a0 00 00 00 	mov    r12,QWORD PTR [rax+0xa0]
     1195abb:	49 8b 6e 18          	mov    rbp,QWORD PTR [r14+0x18]
     1195abf:	48 83 e5 fc          	and    rbp,0xfffffffffffffffc
     1195ac3:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]

### AP 0x188fb80 materialized @0x119706b; FDE=(18444040, 18445854)
     1197029:	0f 85 35 05 00 00    	jne    1197564 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e97a>
     119702f:	e8 ea 05 00 00       	call   119761e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35ea34>
     1197034:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1197039:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     119703d:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
     1197042:	49 8b af a0 00 00 00 	mov    rbp,QWORD PTR [r15+0xa0]
     1197049:	48 89 5c 24 28       	mov    QWORD PTR [rsp+0x28],rbx
     119704e:	4c 8b 6b 18          	mov    r13,QWORD PTR [rbx+0x18]
     1197052:	49 83 e5 fc          	and    r13,0xfffffffffffffffc
     1197056:	4c 89 f7             	mov    rdi,r14
     1197059:	e8 4a a2 fe ff       	call   11812a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3486be>
     119705e:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     1197063:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1197068:	48 89 c3             	mov    rbx,rax
     119706b:	48 8d 05 0e 8b 6f 00 	lea    rax,[rip+0x6f8b0e]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     1197072:	48 89 02             	mov    QWORD PTR [rdx],rax
     1197075:	0f 57 c0             	xorps  xmm0,xmm0
     1197078:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     119707c:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     1197080:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     1197084:	48 89 ef             	mov    rdi,rbp
     1197087:	4c 89 ee             	mov    rsi,r13
     119708a:	e8 a1 8f fe ff       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>
     119708f:	84 c0                	test   al,al
     1197091:	74 3c                	je     11970cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4e5>
     1197093:	f6 44 24 60 01       	test   BYTE PTR [rsp+0x60],0x1
     1197098:	74 35                	je     11970cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e4e5>
     119709a:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     119709f:	48 85 c0             	test   rax,rax
     11970a2:	48 8d 35 87 75 7c 00 	lea    rsi,[rip+0x7c7587]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     11970a9:	48 0f 45 f0          	cmovne rsi,rax
     11970ad:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11970b2:	e8 ac 8a 00 00       	call   119fb63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x366f79>
     11970b7:	4c 8d 6c 24 38       	lea    r13,[rsp+0x38]
     11970bc:	48 89 df             	mov    rdi,rbx
     11970bf:	4c 89 ee             	mov    rsi,r13
     11970c2:	e8 67 49 8e ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     11970c7:	4c 89 ef             	mov    rdi,r13
     11970ca:	e8 c1 6d 65 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11970cf:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     11970d4:	e8 d9 4c 49 00       	call   162bdb2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f20>
     11970d9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11970de:	48 8b 70 28          	mov    rsi,QWORD PTR [rax+0x28]
     11970e2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     11970e7:	83 48 10 01          	or     DWORD PTR [rax+0x10],0x1
     11970eb:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc

### AP 0x188fb80 materialized @0x1199a64; FDE=(18454891, 18455814)
     1199a2e:	89 c5                	mov    ebp,eax
     1199a30:	84 c0                	test   al,al
     1199a32:	74 26                	je     1199a5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x360e70>
     1199a34:	48 8b b4 24 88 00 00 	mov    rsi,QWORD PTR [rsp+0x88]
     1199a3b:	00 
     1199a3c:	83 4b 10 02          	or     DWORD PTR [rbx+0x10],0x2
     1199a40:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1199a44:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     1199a48:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     1199a4c:	f6 c2 01             	test   dl,0x1
     1199a4f:	0f 85 31 02 00 00    	jne    1199c86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36109c>
     1199a55:	e8 38 bd 5c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1199a5a:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     1199a5f:	48 83 62 08 00       	and    QWORD PTR [rdx+0x8],0x0
     1199a64:	48 8d 05 15 61 6f 00 	lea    rax,[rip+0x6f6115]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     1199a6b:	48 89 02             	mov    QWORD PTR [rdx],rax
     1199a6e:	0f 57 c0             	xorps  xmm0,xmm0
     1199a71:	0f 11 42 10          	movups XMMWORD PTR [rdx+0x10],xmm0
     1199a75:	0f 11 42 20          	movups XMMWORD PTR [rdx+0x20],xmm0
     1199a79:	0f 11 42 30          	movups XMMWORD PTR [rdx+0x30],xmm0
     1199a7d:	4c 89 ff             	mov    rdi,r15
     1199a80:	4c 89 f6             	mov    rsi,r14
     1199a83:	e8 a8 65 fe ff       	call   1180030 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x347446>
     1199a88:	84 c0                	test   al,al
     1199a8a:	74 6d                	je     1199af9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x360f0f>
     1199a8c:	f6 44 24 20 01       	test   BYTE PTR [rsp+0x20],0x1
     1199a91:	74 66                	je     1199af9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x360f0f>
     1199a93:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     1199a98:	48 85 c9             	test   rcx,rcx
     1199a9b:	48 8d 05 8e 4b 7c 00 	lea    rax,[rip+0x7c4b8e]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     1199aa2:	48 0f 45 c1          	cmovne rax,rcx
     1199aa6:	83 78 20 00          	cmp    DWORD PTR [rax+0x20],0x0
     1199aaa:	7e 4d                	jle    1199af9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x360f0f>
     1199aac:	48 8b 48 18          	mov    rcx,QWORD PTR [rax+0x18]
     1199ab0:	48 83 c0 18          	add    rax,0x18
     1199ab4:	48 89 ca             	mov    rdx,rcx
     1199ab7:	48 83 c2 07          	add    rdx,0x7
     1199abb:	f6 c1 01             	test   cl,0x1
     1199abe:	48 0f 44 d0          	cmove  rdx,rax
     1199ac2:	48 8b 02             	mov    rax,QWORD PTR [rdx]
     1199ac5:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
     1199ac9:	48 85 c0             	test   rax,rax
     1199acc:	48 8d 0d 05 92 7e 00 	lea    rcx,[rip+0x7e9205]        # 1982cd8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4b920>
     1199ad3:	48 0f 45 c8          	cmovne rcx,rax
     1199ad7:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
     1199adb:	83 4b 10 04          	or     DWORD PTR [rbx+0x10],0x4

### AP 0x188fb80 materialized @0x11a9ba0; FDE=(18520686, 18521675)
     11a9b69:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     11a9b6e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11a9b71:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     11a9b78:	00 
     11a9b79:	31 d2                	xor    edx,edx
     11a9b7b:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11a9b7e:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
     11a9b83:	48 8d b4 24 c0 00 00 	lea    rsi,[rsp+0xc0]
     11a9b8a:	00 
     11a9b8b:	4c 89 e7             	mov    rdi,r12
     11a9b8e:	e8 97 09 52 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
     11a9b93:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
     11a9b9a:	00 
     11a9b9b:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0
     11a9ba0:	48 8d 05 d9 5f 6e 00 	lea    rax,[rip+0x6e5fd9]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     11a9ba7:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     11a9bab:	0f 57 c0             	xorps  xmm0,xmm0
     11a9bae:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0
     11a9bb3:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
     11a9bb8:	41 0f 11 45 30       	movups XMMWORD PTR [r13+0x30],xmm0
     11a9bbd:	4c 89 e7             	mov    rdi,r12
     11a9bc0:	e8 71 1c 8d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     11a9bc5:	49 89 d0             	mov    r8,rdx
     11a9bc8:	4d 8b 17             	mov    r10,QWORD PTR [r15]
     11a9bcb:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     11a9bd0:	4c 89 fe             	mov    rsi,r15
     11a9bd3:	ba b3 00 00 00       	mov    edx,0xb3
     11a9bd8:	48 89 c1             	mov    rcx,rax
     11a9bdb:	4d 89 e9             	mov    r9,r13
     11a9bde:	41 ff 52 38          	call   QWORD PTR [r10+0x38]
     11a9be2:	80 7c 24 30 00       	cmp    BYTE PTR [rsp+0x30],0x0
     11a9be7:	74 7a                	je     11a9c63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371079>
     11a9be9:	80 7c 24 38 01       	cmp    BYTE PTR [rsp+0x38],0x1
     11a9bee:	75 73                	jne    11a9c63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371079>
     11a9bf0:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     11a9bf7:	00 
     11a9bf8:	48 85 ff             	test   rdi,rdi
     11a9bfb:	4c 8d 3d 2e 4a 7b 00 	lea    r15,[rip+0x7b4a2e]        # 195e630 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x27278>
     11a9c02:	49 0f 44 ff          	cmove  rdi,r15
     11a9c06:	48 89 de             	mov    rsi,rbx
     11a9c09:	31 d2                	xor    edx,edx
     11a9c0b:	e8 3b 02 00 00       	call   11a9e4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371261>
     11a9c10:	41 80 3e 00          	cmp    BYTE PTR [r14],0x0
     11a9c14:	74 4d                	je     11a9c63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371079>
     11a9c16:	8b 84 24 90 00 00 00 	mov    eax,DWORD PTR [rsp+0x90]
     11a9c1d:	a8 02                	test   al,0x2

### AP 0x188fb80 materialized @0x11f2619; FDE=(18805556, 18832116)
     11f25cf:	48 8d 05 c2 5a 6a 00 	lea    rax,[rip+0x6a5ac2]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     11f25d6:	48 89 85 78 03 00 00 	mov    QWORD PTR [rbp+0x378],rax
     11f25dd:	f3 0f 7f 85 88 03 00 	movdqu XMMWORD PTR [rbp+0x388],xmm0
     11f25e4:	00 
     11f25e5:	f3 0f 7f 85 98 03 00 	movdqu XMMWORD PTR [rbp+0x398],xmm0
     11f25ec:	00 
     11f25ed:	48 8d 05 04 d2 24 ff 	lea    rax,[rip+0xffffffffff24d204]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     11f25f4:	48 89 85 a8 03 00 00 	mov    QWORD PTR [rbp+0x3a8],rax
     11f25fb:	48 89 85 b0 03 00 00 	mov    QWORD PTR [rbp+0x3b0],rax
     11f2602:	48 89 85 b8 03 00 00 	mov    QWORD PTR [rbp+0x3b8],rax
     11f2609:	48 83 a5 c0 03 00 00 	and    QWORD PTR [rbp+0x3c0],0x0
     11f2610:	00 
     11f2611:	48 83 a5 d0 03 00 00 	and    QWORD PTR [rbp+0x3d0],0x0
     11f2618:	00 
     11f2619:	48 8d 05 60 d5 69 00 	lea    rax,[rip+0x69d560]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     11f2620:	48 89 85 c8 03 00 00 	mov    QWORD PTR [rbp+0x3c8],rax
     11f2627:	48 89 ef             	mov    rdi,rbp
     11f262a:	48 81 c7 08 04 00 00 	add    rdi,0x408
     11f2631:	f3 0f 7f 85 d8 03 00 	movdqu XMMWORD PTR [rbp+0x3d8],xmm0
     11f2638:	00 
     11f2639:	f3 0f 7f 85 e8 03 00 	movdqu XMMWORD PTR [rbp+0x3e8],xmm0
     11f2640:	00 
     11f2641:	f3 0f 7f 85 f8 03 00 	movdqu XMMWORD PTR [rbp+0x3f8],xmm0
     11f2648:	00 
     11f2649:	e8 2a b3 ba ff       	call   d9d978 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a9fe>
     11f264e:	49 89 6f 10          	mov    QWORD PTR [r15+0x10],rbp
     11f2652:	80 7c 24 40 00       	cmp    BYTE PTR [rsp+0x40],0x0
     11f2657:	74 3d                	je     11f2696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37c1a>
     11f2659:	6a 50                	push   0x50
     11f265b:	5f                   	pop    rdi
     11f265c:	e8 9f b8 5f 00       	call   17edf00 <_Znwm@plt>
     11f2661:	49 89 c6             	mov    r14,rax
     11f2664:	66 0f ef c0          	pxor   xmm0,xmm0
     11f2668:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     11f266d:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     11f2671:	c7 40 20 00 00 80 3f 	mov    DWORD PTR [rax+0x20],0x3f800000
     11f2678:	0f 28 8c 24 e0 00 00 	movaps xmm1,XMMWORD PTR [rsp+0xe0]
     11f267f:	00 
     11f2680:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     11f2684:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     11f268b:	00 
     11f268c:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     11f2690:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     11f2696:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
     11f269d:	00 
     11f269e:	49 8d 6f 18          	lea    rbp,[r15+0x18]

### AP 0x188fb80 materialized @0x131e7c2; FDE=(20047622, 20048255)
     131e78a:	48 01 c1             	add    rcx,rax
     131e78d:	48 39 cd             	cmp    rbp,rcx
     131e790:	0f 8d 3a 01 00 00    	jge    131e8d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163e54>
     131e796:	6a 60                	push   0x60
     131e798:	5f                   	pop    rdi
     131e799:	e8 62 f7 4c 00       	call   17edf00 <_Znwm@plt>
     131e79e:	48 89 c3             	mov    rbx,rax
     131e7a1:	0f 57 c0             	xorps  xmm0,xmm0
     131e7a4:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     131e7a8:	48 8d 05 99 66 54 00 	lea    rax,[rip+0x546699]        # 1864e48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21530>
     131e7af:	48 89 03             	mov    QWORD PTR [rbx],rax
     131e7b2:	48 8d 05 c7 66 54 00 	lea    rax,[rip+0x5466c7]        # 1864e80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21568>
     131e7b9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     131e7bd:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
     131e7c2:	48 8d 05 b7 13 57 00 	lea    rax,[rip+0x5713b7]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     131e7c9:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     131e7cd:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
     131e7d1:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
     131e7d5:	0f 11 43 50          	movups XMMWORD PTR [rbx+0x50],xmm0
     131e7d9:	4c 8d ac 24 88 00 00 	lea    r13,[rsp+0x88]
     131e7e0:	00 
     131e7e1:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
     131e7e6:	48 8d 05 eb ac 58 00 	lea    rax,[rip+0x58aceb]        # 18a94d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x16418>
     131e7ed:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     131e7f1:	48 8d 05 00 10 12 ff 	lea    rax,[rip+0xffffffffff121000]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     131e7f8:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     131e7fc:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
     131e800:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     131e804:	4c 89 ff             	mov    rdi,r15
     131e807:	e8 2a d0 75 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     131e80c:	49 89 d0             	mov    r8,rdx
     131e80f:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
     131e813:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     131e818:	4c 89 e6             	mov    rsi,r12
     131e81b:	ba b3 00 00 00       	mov    edx,0xb3
     131e820:	48 89 c1             	mov    rcx,rax
     131e823:	4d 89 e9             	mov    r9,r13
     131e826:	41 ff 52 30          	call   QWORD PTR [r10+0x30]
     131e82a:	80 7c 24 40 01       	cmp    BYTE PTR [rsp+0x40],0x1
     131e82f:	75 7b                	jne    131e8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163e30>
     131e831:	4c 8d 63 20          	lea    r12,[rbx+0x20]
     131e835:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     131e83c:	00 
     131e83d:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
     131e844:	00 
     131e845:	4c 89 e2             	mov    rdx,r12

### AP 0x188fb80 materialized @0x15994dd; FDE=(22647814, 22648857)
     15994a1:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     15994a8:	00 
     15994a9:	e8 92 cd 9e ff       	call   f86240 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d656>
     15994ae:	84 c0                	test   al,al
     15994b0:	75 25                	jne    15994d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dea5b>
     15994b2:	49 8b 7d 18          	mov    rdi,QWORD PTR [r13+0x18]
     15994b6:	48 83 7f 10 00       	cmp    QWORD PTR [rdi+0x10],0x0
     15994bb:	0f 84 40 02 00 00    	je     1599701 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dec85>
     15994c1:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     15994c8:	00 
     15994c9:	e8 72 cd 9e ff       	call   f86240 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d656>
     15994ce:	40 08 c5             	or     bpl,al
     15994d1:	0f 84 33 02 00 00    	je     159970a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dec8e>
     15994d7:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
     15994dd:	48 8d 05 9c 66 2f 00 	lea    rax,[rip+0x2f669c]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     15994e4:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     15994e9:	0f 57 c0             	xorps  xmm0,xmm0
     15994ec:	0f 11 44 24 78       	movups XMMWORD PTR [rsp+0x78],xmm0
     15994f1:	0f 11 84 24 88 00 00 	movups XMMWORD PTR [rsp+0x88],xmm0
     15994f8:	00 
     15994f9:	0f 11 84 24 98 00 00 	movups XMMWORD PTR [rsp+0x98],xmm0
     1599500:	00 
     1599501:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]
     1599505:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1599508:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     159950f:	00 
     1599510:	4c 89 f6             	mov    rsi,r14
     1599513:	31 d2                	xor    edx,edx
     1599515:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1599518:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     159951f:	00 
     1599520:	e8 11 23 4e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1599525:	49 89 d0             	mov    r8,rdx
     1599528:	4d 8b 17             	mov    r10,QWORD PTR [r15]
     159952b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1599530:	4c 8d 74 24 68       	lea    r14,[rsp+0x68]
     1599535:	4c 89 fe             	mov    rsi,r15
     1599538:	ba b3 00 00 00       	mov    edx,0xb3
     159953d:	48 89 c1             	mov    rcx,rax
     1599540:	4d 89 f1             	mov    r9,r14
     1599543:	41 ff 52 38          	call   QWORD PTR [r10+0x38]
     1599547:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     159954e:	00 
     159954f:	e8 3c 49 25 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1599554:	80 7c 24 18 00       	cmp    BYTE PTR [rsp+0x18],0x0
     1599559:	0f 84 2c 01 00 00    	je     159968b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3dec0f>

### AP 0x188fb80 materialized @0x162be79; FDE=(23248498, 23248531)
     162be46:	53                   	push   rbx
     162be47:	48 89 fb             	mov    rbx,rdi
     162be4a:	e8 63 ff ff ff       	call   162bdb2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f20>
     162be4f:	48 89 df             	mov    rdi,rbx
     162be52:	5b                   	pop    rbx
     162be53:	e9 c8 20 1c 00       	jmp    17edf20 <_ZdlPv@plt>
     162be58:	0f 18 0d c9 1e 33 00 	prefetcht0 BYTE PTR [rip+0x331ec9]        # 195dd28 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26970>
     162be5f:	48 8d 05 c2 1e 33 00 	lea    rax,[rip+0x331ec2]        # 195dd28 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26970>
     162be66:	48 8b 0d c3 1e 33 00 	mov    rcx,QWORD PTR [rip+0x331ec3]        # 195dd30 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26978>
     162be6d:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     162be70:	c3                   	ret
     162be71:	cc                   	int3
     162be72:	48 89 f0             	mov    rax,rsi
     162be75:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     162be79:	48 8d 0d 00 3d 26 00 	lea    rcx,[rip+0x263d00]        # 188fb80 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8858>
     162be80:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     162be83:	0f 57 c0             	xorps  xmm0,xmm0
     162be86:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     162be8a:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
     162be8e:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     162be92:	c3                   	ret
     162be93:	cc                   	int3
     162be94:	0f 18 0d 15 23 33 00 	prefetcht0 BYTE PTR [rip+0x332315]        # 195e1b0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26df8>
     162be9b:	48 8d 05 0e 23 33 00 	lea    rax,[rip+0x33230e]        # 195e1b0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26df8>
     162bea2:	48 8b 0d 0f 23 33 00 	mov    rcx,QWORD PTR [rip+0x33230f]        # 195e1b8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26e00>
     162bea9:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     162beac:	c3                   	ret
     162bead:	cc                   	int3
     162beae:	48 89 f0             	mov    rax,rsi
     162beb1:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     162beb5:	48 8d 0d 1c 3d 26 00 	lea    rcx,[rip+0x263d1c]        # 188fbd8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x88b0>
     162bebc:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     162bebf:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     162bec4:	48 8d 0d 2d 39 e1 fe 	lea    rcx,[rip+0xfffffffffee1392d]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     162becb:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
     162becf:	c3                   	ret
     162bed0:	0f 18 0d f1 21 33 00 	prefetcht0 BYTE PTR [rip+0x3321f1]        # 195e0c8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26d10>
     162bed7:	48 8d 05 ea 21 33 00 	lea    rax,[rip+0x3321ea]        # 195e0c8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26d10>
     162bede:	48 8b 0d eb 21 33 00 	mov    rcx,QWORD PTR [rip+0x3321eb]        # 195e0d0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x26d18>
     162bee5:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     162bee8:	c3                   	ret
     162bee9:	cc                   	int3
     162beea:	48 89 f0             	mov    rax,rsi
     162beed:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     162bef1:	48 8d 0d 20 3d 26 00 	lea    rcx,[rip+0x263d20]        # 188fc18 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x88f0>
     162bef8:	48 89 0e             	mov    QWORD PTR [rsi],rcx

### AP 0x1875aa0 materialized @0x12040e1; FDE=(18890726, 18891287)
     12040a3:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12040a8:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     12040ac:	0f 28 4c 24 10       	movaps xmm1,XMMWORD PTR [rsp+0x10]
     12040b1:	41 0f 11 0f          	movups XMMWORD PTR [r15],xmm1
     12040b5:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     12040ba:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
     12040c0:	c6 84 24 d0 00 00 00 	mov    BYTE PTR [rsp+0xd0],0x1
     12040c7:	01 
     12040c8:	bf c0 00 00 00       	mov    edi,0xc0
     12040cd:	e8 2e 9e 5e 00       	call   17edf00 <_Znwm@plt>
     12040d2:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     12040d7:	0f 57 c0             	xorps  xmm0,xmm0
     12040da:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     12040dd:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
     12040e1:	48 8d 0d b8 19 67 00 	lea    rcx,[rip+0x6719b8]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>
     12040e8:	48 89 08             	mov    QWORD PTR [rax],rcx
     12040eb:	83 60 14 00          	and    DWORD PTR [rax+0x14],0x0
     12040ef:	48 83 60 28 00       	and    QWORD PTR [rax+0x28],0x0
     12040f4:	48 8d 0d 9d 3f 69 00 	lea    rcx,[rip+0x693f9d]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     12040fb:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     12040ff:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     1204103:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
     1204107:	48 8d 0d ea b6 23 ff 	lea    rcx,[rip+0xffffffffff23b6ea]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     120410e:	48 89 48 50          	mov    QWORD PTR [rax+0x50],rcx
     1204112:	48 89 48 58          	mov    QWORD PTR [rax+0x58],rcx
     1204116:	48 89 48 60          	mov    QWORD PTR [rax+0x60],rcx
     120411a:	48 83 60 68 00       	and    QWORD PTR [rax+0x68],0x0
     120411f:	48 83 60 78 00       	and    QWORD PTR [rax+0x78],0x0
     1204124:	48 8d 0d cd 42 69 00 	lea    rcx,[rip+0x6942cd]        # 18983f8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5338>
     120412b:	48 89 48 70          	mov    QWORD PTR [rax+0x70],rcx
     120412f:	0f 11 80 80 00 00 00 	movups XMMWORD PTR [rax+0x80],xmm0
     1204136:	0f 11 80 90 00 00 00 	movups XMMWORD PTR [rax+0x90],xmm0
     120413d:	0f 11 80 a0 00 00 00 	movups XMMWORD PTR [rax+0xa0],xmm0
     1204144:	0f 11 80 b0 00 00 00 	movups XMMWORD PTR [rax+0xb0],xmm0
     120414b:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
     1204150:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
     1204157:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     120415c:	e8 cf 2b 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1204161:	48 89 df             	mov    rdi,rbx
     1204164:	4c 89 fe             	mov    rsi,r15
     1204167:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
     120416b:	e8 ae 8e 00 00       	call   120d01e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x525a2>
     1204170:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1204175:	e8 4a 8e 00 00       	call   120cfc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x52548>
     120417a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1204181:	00 00 

### AP 0x1875aa0 materialized @0x123b41f; FDE=(19117082, 19117139)
     123b3f6:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     123b3fa:	48 85 db             	test   rbx,rbx
     123b3fd:	74 18                	je     123b417 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8099b>
     123b3ff:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0
     123b403:	74 09                	je     123b40e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80992>
     123b405:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     123b409:	e8 c0 1e ff ff       	call   122d2ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72852>
     123b40e:	48 89 df             	mov    rdi,rbx
     123b411:	5b                   	pop    rbx
     123b412:	e9 09 2b 5b 00       	jmp    17edf20 <_ZdlPv@plt>
     123b417:	5b                   	pop    rbx
     123b418:	c3                   	ret
     123b419:	cc                   	int3
     123b41a:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
     123b41f:	48 8d 05 7a a6 63 00 	lea    rax,[rip+0x63a67a]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>
     123b426:	48 89 07             	mov    QWORD PTR [rdi],rax
     123b429:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
     123b42c:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax
     123b42f:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     123b433:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     123b437:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
     123b43b:	40 f6 c6 01          	test   sil,0x1
     123b43f:	75 01                	jne    123b442 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x809c6>
     123b441:	c3                   	ret
     123b442:	48 83 c7 08          	add    rdi,0x8
     123b446:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
     123b44a:	48 83 c6 08          	add    rsi,0x8
     123b44e:	e9 ad 30 51 00       	jmp    174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
     123b453:	cc                   	int3
     123b454:	41 56                	push   r14
     123b456:	53                   	push   rbx
     123b457:	50                   	push   rax
     123b458:	31 c0                	xor    eax,eax
     123b45a:	88 07                	mov    BYTE PTR [rdi],al
     123b45c:	88 47 38             	mov    BYTE PTR [rdi+0x38],al
     123b45f:	38 46 38             	cmp    BYTE PTR [rsi+0x38],al
     123b462:	74 08                	je     123b46c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x809f0>
     123b464:	48 89 fb             	mov    rbx,rdi
     123b467:	e8 0a 06 00 00       	call   123ba76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80ffa>
     123b46c:	48 83 c4 08          	add    rsp,0x8
     123b470:	5b                   	pop    rbx
     123b471:	41 5e                	pop    r14
     123b473:	c3                   	ret
     123b474:	49 89 c6             	mov    r14,rax
     123b477:	48 89 df             	mov    rdi,rbx
     123b47a:	e8 ab 18 ff ff       	call   122cd2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x722ae>

### AP 0x1875aa0 materialized @0x123dd20; FDE=(19122204, 19140568)
     123dce8:	48 89 df             	mov    rdi,rbx
     123dceb:	e8 ce f1 fe ff       	call   122cebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72442>
     123dcf0:	4c 8d b4 24 e0 01 00 	lea    r14,[rsp+0x1e0]
     123dcf7:	00 
     123dcf8:	4c 89 f7             	mov    rdi,r14
     123dcfb:	e8 66 49 8a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     123dd00:	0f 57 c0             	xorps  xmm0,xmm0
     123dd03:	41 0f 29 46 10       	movaps XMMWORD PTR [r14+0x10],xmm0
     123dd08:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     123dd0c:	b8 00 00 80 3f       	mov    eax,0x3f800000
     123dd11:	41 89 46 20          	mov    DWORD PTR [r14+0x20],eax
     123dd15:	48 8d 94 24 88 01 00 	lea    rdx,[rsp+0x188]
     123dd1c:	00 
     123dd1d:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     123dd20:	48 8d 0d 79 7d 63 00 	lea    rcx,[rip+0x637d79]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>
     123dd27:	48 89 4a f8          	mov    QWORD PTR [rdx-0x8],rcx
     123dd2b:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
     123dd2f:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     123dd32:	83 62 10 00          	and    DWORD PTR [rdx+0x10],0x0
     123dd36:	89 43 20             	mov    DWORD PTR [rbx+0x20],eax
     123dd39:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     123dd3e:	4c 8b 60 08          	mov    r12,QWORD PTR [rax+0x8]
     123dd42:	48 8b 58 10          	mov    rbx,QWORD PTR [rax+0x10]
     123dd46:	49 39 dc             	cmp    r12,rbx
     123dd49:	0f 84 76 03 00 00    	je     123e0c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83649>
     123dd4f:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
     123dd54:	66 41 81 3c 24 dc 00 	cmp    WORD PTR [r12],0xdc
     123dd5b:	0f 85 57 03 00 00    	jne    123e0b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8363c>
     123dd61:	41 80 7c 24 48 00    	cmp    BYTE PTR [r12+0x48],0x0
     123dd67:	0f 84 4b 03 00 00    	je     123e0b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8363c>
     123dd6d:	49 8b 7c 24 38       	mov    rdi,QWORD PTR [r12+0x38]
     123dd72:	49 8b 74 24 40       	mov    rsi,QWORD PTR [r12+0x40]
     123dd77:	48 8d 94 24 80 01 00 	lea    rdx,[rsp+0x180]
     123dd7e:	00 
     123dd7f:	e8 d2 a7 92 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
     123dd84:	84 c0                	test   al,al
     123dd86:	0f 84 2c 03 00 00    	je     123e0b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8363c>
     123dd8c:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
     123dd91:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     123dd96:	e8 25 19 86 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
     123dd9b:	49 89 c7             	mov    r15,rax
     123dd9e:	4c 8b ac 24 e8 01 00 	mov    r13,QWORD PTR [rsp+0x1e8]
     123dda5:	00 
     123dda6:	4d 85 ed             	test   r13,r13
     123dda9:	0f 84 8d 00 00 00    	je     123de3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x833c0>
     123ddaf:	f3 49 0f b8 dd       	popcnt rbx,r13

### AP 0x1875aa0 materialized @0x1254c51; FDE=(19220886, 19222500)
     1254c15:	48 99                	cqo
     1254c17:	48 f7 f9             	idiv   rcx
     1254c1a:	80 bb a0 09 00 00 00 	cmp    BYTE PTR [rbx+0x9a0],0x0
     1254c21:	75 07                	jne    1254c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a1ae>
     1254c23:	c6 83 a0 09 00 00 01 	mov    BYTE PTR [rbx+0x9a0],0x1
     1254c2a:	48 89 83 98 09 00 00 	mov    QWORD PTR [rbx+0x998],rax
     1254c31:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     1254c38:	00 
     1254c39:	e8 1a 70 3d 00       	call   162bc58 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc6>
     1254c3e:	4d 8b 66 08          	mov    r12,QWORD PTR [r14+0x8]
     1254c42:	0f 57 c0             	xorps  xmm0,xmm0
     1254c45:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     1254c4c:	00 
     1254c4d:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     1254c51:	4c 8d 2d 48 0e 62 00 	lea    r13,[rip+0x620e48]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>
     1254c58:	4c 89 29             	mov    QWORD PTR [rcx],r13
     1254c5b:	83 61 18 00          	and    DWORD PTR [rcx+0x18],0x0
     1254c5f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1254c63:	4c 89 e7             	mov    rdi,r12
     1254c66:	be dc 00 00 00       	mov    esi,0xdc
     1254c6b:	4c 89 fa             	mov    rdx,r15
     1254c6e:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1254c71:	84 c0                	test   al,al
     1254c73:	0f 84 7d 01 00 00    	je     1254df6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a37a>
     1254c79:	8b 84 24 18 02 00 00 	mov    eax,DWORD PTR [rsp+0x218]
     1254c80:	83 f8 0e             	cmp    eax,0xe
     1254c83:	74 09                	je     1254c8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a212>
     1254c85:	83 f8 09             	cmp    eax,0x9
     1254c88:	0f 85 68 01 00 00    	jne    1254df6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9a37a>
     1254c8e:	48 8d 4c 24 30       	lea    rcx,[rsp+0x30]
     1254c93:	48 83 61 08 00       	and    QWORD PTR [rcx+0x8],0x0
     1254c98:	48 8d 05 f9 33 64 00 	lea    rax,[rip+0x6433f9]        # 1898098 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4fd8>
     1254c9f:	48 89 01             	mov    QWORD PTR [rcx],rax
     1254ca2:	0f 57 c0             	xorps  xmm0,xmm0
     1254ca5:	0f 11 41 10          	movups XMMWORD PTR [rcx+0x10],xmm0
     1254ca9:	0f 11 41 20          	movups XMMWORD PTR [rcx+0x20],xmm0
     1254cad:	48 8d 05 44 ab 1e ff 	lea    rax,[rip+0xffffffffff1eab44]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1254cb4:	48 89 41 30          	mov    QWORD PTR [rcx+0x30],rax
     1254cb8:	48 89 41 38          	mov    QWORD PTR [rcx+0x38],rax
     1254cbc:	48 89 41 40          	mov    QWORD PTR [rcx+0x40],rax
     1254cc0:	48 83 61 48 00       	and    QWORD PTR [rcx+0x48],0x0
     1254cc5:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1254cc9:	4c 89 e7             	mov    rdi,r12
     1254ccc:	be b2 00 00 00       	mov    esi,0xb2
     1254cd1:	4c 89 fa             	mov    rdx,r15
     1254cd4:	ff 50 10             	call   QWORD PTR [rax+0x10]

### AP 0x1875aa0 materialized @0x1481837; FDE=(21502000, 21502027)
     1481801:	48 8d 0d 50 42 3f 00 	lea    rcx,[rip+0x3f4250]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>
     1481808:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     148180b:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1481810:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     1481814:	c3                   	ret
     1481815:	cc                   	int3
     1481816:	0f 18 0d c3 6c 4a 00 	prefetcht0 BYTE PTR [rip+0x4a6cc3]        # 19284e0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f8f0>
     148181d:	48 8d 05 bc 6c 4a 00 	lea    rax,[rip+0x4a6cbc]        # 19284e0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f8f0>
     1481824:	48 8b 0d bd 6c 4a 00 	mov    rcx,QWORD PTR [rip+0x4a6cbd]        # 19284e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x6f8f8>
     148182b:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     148182e:	c3                   	ret
     148182f:	cc                   	int3
     1481830:	48 89 f0             	mov    rax,rsi
     1481833:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     1481837:	48 8d 0d 62 42 3f 00 	lea    rcx,[rip+0x3f4262]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>
     148183e:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     1481841:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1481846:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     148184a:	c3                   	ret
     148184b:	cc                   	int3
     148184c:	55                   	push   rbp
     148184d:	41 57                	push   r15
     148184f:	41 56                	push   r14
     1481851:	41 55                	push   r13
     1481853:	41 54                	push   r12
     1481855:	53                   	push   rbx
     1481856:	48 83 ec 28          	sub    rsp,0x28
     148185a:	48 89 fd             	mov    rbp,rdi
     148185d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1481864:	00 00 
     1481866:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     148186b:	41 bc b9 79 37 9e    	mov    r12d,0x9e3779b9
     1481871:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
     1481875:	0f 84 c1 00 00 00    	je     148193c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6ec0>
     148187b:	8b 45 00             	mov    eax,DWORD PTR [rbp+0x0]
     148187e:	4c 01 e0             	add    rax,r12
     1481881:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
     1481886:	49 89 06             	mov    QWORD PTR [r14],rax
     1481889:	48 8d 75 20          	lea    rsi,[rbp+0x20]
     148188d:	4c 89 f7             	mov    rdi,r14
     1481890:	e8 4f ae 7d ff       	call   c5c6e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a9684>
     1481895:	48 8b 5d 08          	mov    rbx,QWORD PTR [rbp+0x8]
     1481899:	4c 8b 7d 10          	mov    r15,QWORD PTR [rbp+0x10]
     148189d:	4d 8b 2e             	mov    r13,QWORD PTR [r14]
     14818a0:	4c 39 fb             	cmp    rbx,r15
     14818a3:	0f 84 8e 00 00 00    	je     1481937 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6ebb>

### AP 0x185c700 materialized @0x120a71e; FDE=(18916824, 18917358)
     120a6e6:	e8 ed 18 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     120a6eb:	4c 89 e7             	mov    rdi,r12
     120a6ee:	e8 f7 e5 c7 ff       	call   e88cea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50100>
     120a6f3:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
     120a6f7:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     120a6fc:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
     120a703:	00 
     120a704:	4c 89 ff             	mov    rdi,r15
     120a707:	e8 10 d4 45 00       	call   1667b1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc88>
     120a70c:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     120a710:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     120a714:	48 85 c0             	test   rax,rax
     120a717:	74 05                	je     120a71e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4fca2>
     120a719:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     120a71e:	48 8d 05 db 1f 65 00 	lea    rax,[rip+0x651fdb]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>
     120a725:	48 8d 8c 24 e0 01 00 	lea    rcx,[rsp+0x1e0]
     120a72c:	00 
     120a72d:	48 89 01             	mov    QWORD PTR [rcx],rax
     120a730:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     120a734:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     120a738:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     120a73c:	4c 8b 60 20          	mov    r12,QWORD PTR [rax+0x20]
     120a740:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     120a747:	00 
     120a748:	4c 89 fe             	mov    rsi,r15
     120a74b:	e8 3a d4 45 00       	call   1667b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcf6>
     120a750:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     120a754:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
     120a75b:	00 
     120a75c:	48 8d 94 24 e0 01 00 	lea    rdx,[rsp+0x1e0]
     120a763:	00 
     120a764:	4c 89 e7             	mov    rdi,r12
     120a767:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     120a76d:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     120a774:	00 
     120a775:	e8 f0 d3 45 00       	call   1667b6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcd6>
     120a77a:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     120a781:	00 
     120a782:	e8 e3 f7 86 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     120a787:	31 ff                	xor    edi,edi
     120a789:	e8 24 3d 89 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120a78e:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     120a792:	0f 57 c9             	xorps  xmm1,xmm1
     120a795:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
     120a799:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     120a79c:	31 ff                	xor    edi,edi

### AP 0x185c700 materialized @0x120b15c; FDE=(18919772, 18919791)
     120b12c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     120b131:	e8 50 33 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     120b136:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120b13d:	00 00 
     120b13f:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     120b144:	75 08                	jne    120b14e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x506d2>
     120b146:	48 83 c4 48          	add    rsp,0x48
     120b14a:	5b                   	pop    rbx
     120b14b:	41 5e                	pop    r14
     120b14d:	c3                   	ret
     120b14e:	e8 5d 49 5e 00       	call   17efab0 <__stack_chk_fail@plt>
     120b153:	48 89 c7             	mov    rdi,rax
     120b156:	e8 4a e9 86 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     120b15b:	cc                   	int3
     120b15c:	48 8d 05 9d 15 65 00 	lea    rax,[rip+0x65159d]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>
     120b163:	48 89 07             	mov    QWORD PTR [rdi],rax
     120b166:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     120b16a:	e9 43 33 89 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120b16f:	cc                   	int3
     120b170:	53                   	push   rbx
     120b171:	48 89 fb             	mov    rbx,rdi
     120b174:	e8 e3 ff ff ff       	call   120b15c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x506e0>
     120b179:	48 89 df             	mov    rdi,rbx
     120b17c:	5b                   	pop    rbx
     120b17d:	e9 9e 2d 5e 00       	jmp    17edf20 <_ZdlPv@plt>
     120b182:	53                   	push   rbx
     120b183:	48 89 fb             	mov    rbx,rdi
     120b186:	6a 18                	push   0x18
     120b188:	5f                   	pop    rdi
     120b189:	e8 72 2d 5e 00       	call   17edf00 <_Znwm@plt>
     120b18e:	48 8d 0d 6b 15 65 00 	lea    rcx,[rip+0x65156b]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>
     120b195:	48 89 08             	mov    QWORD PTR [rax],rcx
     120b198:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120b19c:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120b1a0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120b1a4:	48 85 c9             	test   rcx,rcx
     120b1a7:	74 05                	je     120b1ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50732>
     120b1a9:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     120b1ae:	5b                   	pop    rbx
     120b1af:	c3                   	ret
     120b1b0:	48 8d 05 49 15 65 00 	lea    rax,[rip+0x651549]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>
     120b1b7:	48 89 06             	mov    QWORD PTR [rsi],rax
     120b1ba:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120b1be:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120b1c2:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120b1c6:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax

### AP 0x185c700 materialized @0x120b18e; FDE=(18919810, 18919856)
     120b166:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     120b16a:	e9 43 33 89 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120b16f:	cc                   	int3
     120b170:	53                   	push   rbx
     120b171:	48 89 fb             	mov    rbx,rdi
     120b174:	e8 e3 ff ff ff       	call   120b15c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x506e0>
     120b179:	48 89 df             	mov    rdi,rbx
     120b17c:	5b                   	pop    rbx
     120b17d:	e9 9e 2d 5e 00       	jmp    17edf20 <_ZdlPv@plt>
     120b182:	53                   	push   rbx
     120b183:	48 89 fb             	mov    rbx,rdi
     120b186:	6a 18                	push   0x18
     120b188:	5f                   	pop    rdi
     120b189:	e8 72 2d 5e 00       	call   17edf00 <_Znwm@plt>
     120b18e:	48 8d 0d 6b 15 65 00 	lea    rcx,[rip+0x65156b]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>
     120b195:	48 89 08             	mov    QWORD PTR [rax],rcx
     120b198:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120b19c:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120b1a0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120b1a4:	48 85 c9             	test   rcx,rcx
     120b1a7:	74 05                	je     120b1ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50732>
     120b1a9:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     120b1ae:	5b                   	pop    rbx
     120b1af:	c3                   	ret
     120b1b0:	48 8d 05 49 15 65 00 	lea    rax,[rip+0x651549]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>
     120b1b7:	48 89 06             	mov    QWORD PTR [rsi],rax
     120b1ba:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120b1be:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120b1c2:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120b1c6:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     120b1ca:	48 85 c0             	test   rax,rax
     120b1cd:	74 05                	je     120b1d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50758>
     120b1cf:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     120b1d4:	c3                   	ret
     120b1d5:	cc                   	int3
     120b1d6:	41 56                	push   r14
     120b1d8:	53                   	push   rbx
     120b1d9:	48 83 ec 48          	sub    rsp,0x48
     120b1dd:	48 89 f3             	mov    rbx,rsi
     120b1e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120b1e7:	00 00 
     120b1e9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     120b1ee:	48 8d 77 08          	lea    rsi,[rdi+0x8]
     120b1f2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     120b1f7:	4c 89 f7             	mov    rdi,r14
     120b1fa:	e8 31 01 8a ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>

### AP 0x185c700 materialized @0x120b1b0; FDE=(18919856, 18919893)
     120b183:	48 89 fb             	mov    rbx,rdi
     120b186:	6a 18                	push   0x18
     120b188:	5f                   	pop    rdi
     120b189:	e8 72 2d 5e 00       	call   17edf00 <_Znwm@plt>
     120b18e:	48 8d 0d 6b 15 65 00 	lea    rcx,[rip+0x65156b]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>
     120b195:	48 89 08             	mov    QWORD PTR [rax],rcx
     120b198:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120b19c:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120b1a0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120b1a4:	48 85 c9             	test   rcx,rcx
     120b1a7:	74 05                	je     120b1ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50732>
     120b1a9:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     120b1ae:	5b                   	pop    rbx
     120b1af:	c3                   	ret
     120b1b0:	48 8d 05 49 15 65 00 	lea    rax,[rip+0x651549]        # 185c700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18de8>
     120b1b7:	48 89 06             	mov    QWORD PTR [rsi],rax
     120b1ba:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120b1be:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120b1c2:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120b1c6:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     120b1ca:	48 85 c0             	test   rax,rax
     120b1cd:	74 05                	je     120b1d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50758>
     120b1cf:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     120b1d4:	c3                   	ret
     120b1d5:	cc                   	int3
     120b1d6:	41 56                	push   r14
     120b1d8:	53                   	push   rbx
     120b1d9:	48 83 ec 48          	sub    rsp,0x48
     120b1dd:	48 89 f3             	mov    rbx,rsi
     120b1e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120b1e7:	00 00 
     120b1e9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     120b1ee:	48 8d 77 08          	lea    rsi,[rdi+0x8]
     120b1f2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     120b1f7:	4c 89 f7             	mov    rdi,r14
     120b1fa:	e8 31 01 8a ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     120b1ff:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     120b202:	4d 85 f6             	test   r14,r14
     120b205:	74 25                	je     120b22c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x507b0>
     120b207:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     120b20c:	48 89 de             	mov    rsi,rbx
     120b20f:	e8 db fc ff ff       	call   120aeef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50473>
     120b214:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     120b219:	4c 89 f7             	mov    rdi,r14
     120b21c:	48 89 de             	mov    rsi,rbx
     120b21f:	e8 38 66 3d 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>

### AP 0x185ca28 materialized @0x1217069; FDE=(18968662, 18968882)
     121704c:	48 89 df             	mov    rdi,rbx
     121704f:	f3 0f 10 07          	movss  xmm0,DWORD PTR [rdi]
     1217053:	5b                   	pop    rbx
     1217054:	c3                   	ret
     1217055:	cc                   	int3
     1217056:	55                   	push   rbp
     1217057:	41 57                	push   r15
     1217059:	41 56                	push   r14
     121705b:	41 54                	push   r12
     121705d:	53                   	push   rbx
     121705e:	4c 89 c3             	mov    rbx,r8
     1217061:	49 89 cf             	mov    r15,rcx
     1217064:	89 d5                	mov    ebp,edx
     1217066:	49 89 fe             	mov    r14,rdi
     1217069:	48 8d 05 b8 59 64 00 	lea    rax,[rip+0x6459b8]        # 185ca28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19110>
     1217070:	48 89 07             	mov    QWORD PTR [rdi],rax
     1217073:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     1217076:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     121707a:	45 31 e4             	xor    r12d,r12d
     121707d:	44 88 67 38          	mov    BYTE PTR [rdi+0x38],r12b
     1217081:	44 88 67 20          	mov    BYTE PTR [rdi+0x20],r12b
     1217085:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
     121708a:	48 83 c7 40          	add    rdi,0x40
     121708e:	e8 39 17 e9 ff       	call   10a87cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fbe2>
     1217093:	b8 00 00 80 3f       	mov    eax,0x3f800000
     1217098:	41 89 86 00 01 00 00 	mov    DWORD PTR [r14+0x100],eax
     121709f:	45 88 a6 08 01 00 00 	mov    BYTE PTR [r14+0x108],r12b
     12170a6:	45 88 a6 50 01 00 00 	mov    BYTE PTR [r14+0x150],r12b
     12170ad:	0f 57 c0             	xorps  xmm0,xmm0
     12170b0:	41 0f 11 86 58 01 00 	movups XMMWORD PTR [r14+0x158],xmm0
     12170b7:	00 
     12170b8:	45 88 a6 68 01 00 00 	mov    BYTE PTR [r14+0x168],r12b
     12170bf:	45 88 a6 70 01 00 00 	mov    BYTE PTR [r14+0x170],r12b
     12170c6:	45 88 a6 78 01 00 00 	mov    BYTE PTR [r14+0x178],r12b
     12170cd:	45 88 a6 80 01 00 00 	mov    BYTE PTR [r14+0x180],r12b
     12170d4:	45 88 a6 d0 01 00 00 	mov    BYTE PTR [r14+0x1d0],r12b
     12170db:	41 88 ae d8 01 00 00 	mov    BYTE PTR [r14+0x1d8],bpl
     12170e2:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
     12170e5:	49 89 8e dc 01 00 00 	mov    QWORD PTR [r14+0x1dc],rcx
     12170ec:	41 0f 11 86 e8 01 00 	movups XMMWORD PTR [r14+0x1e8],xmm0
     12170f3:	00 
     12170f4:	41 0f 11 86 f8 01 00 	movups XMMWORD PTR [r14+0x1f8],xmm0
     12170fb:	00 
     12170fc:	41 89 86 08 02 00 00 	mov    DWORD PTR [r14+0x208],eax
     1217103:	41 83 a6 38 02 00 00 	and    DWORD PTR [r14+0x238],0x0
     121710a:	00 

### AP 0x185c748 materialized @0x120aa51; FDE=(18917358, 18918225)
     120aa16:	e8 cf e2 c7 ff       	call   e88cea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50100>
     120aa1b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     120aa20:	49 89 06             	mov    QWORD PTR [r14],rax
     120aa23:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     120aa28:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
     120aa2f:	00 
     120aa30:	4c 89 ff             	mov    rdi,r15
     120aa33:	e8 d6 c6 45 00       	call   166710e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b27a>
     120aa38:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     120aa3d:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     120aa42:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
     120aa47:	48 85 c0             	test   rax,rax
     120aa4a:	74 05                	je     120aa51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ffd5>
     120aa4c:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     120aa51:	48 8d 05 f0 1c 65 00 	lea    rax,[rip+0x651cf0]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>
     120aa58:	48 8d 8c 24 d0 01 00 	lea    rcx,[rsp+0x1d0]
     120aa5f:	00 
     120aa60:	48 89 01             	mov    QWORD PTR [rcx],rax
     120aa63:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     120aa67:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     120aa6b:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     120aa70:	48 8b 58 20          	mov    rbx,QWORD PTR [rax+0x20]
     120aa74:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     120aa7b:	00 
     120aa7c:	4c 89 fe             	mov    rsi,r15
     120aa7f:	e8 e4 c6 45 00       	call   1667168 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2d4>
     120aa84:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     120aa89:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     120aa8c:	48 8d b4 24 00 02 00 	lea    rsi,[rsp+0x200]
     120aa93:	00 
     120aa94:	48 8d 94 24 d0 01 00 	lea    rdx,[rsp+0x1d0]
     120aa9b:	00 
     120aa9c:	48 89 df             	mov    rdi,rbx
     120aa9f:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     120aaa5:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     120aaac:	00 
     120aaad:	e8 a0 c6 45 00       	call   1667152 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2be>
     120aab2:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     120aab9:	00 
     120aaba:	e8 ab f4 86 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     120aabf:	31 ff                	xor    edi,edi
     120aac1:	e8 ec 39 89 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120aac6:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
     120aacb:	0f 57 c9             	xorps  xmm1,xmm1
     120aace:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
     120aad3:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0

### AP 0x185c748 materialized @0x120b05c; FDE=(18919516, 18919535)
     120b02a:	48 83 c4 48          	add    rsp,0x48
     120b02e:	5b                   	pop    rbx
     120b02f:	41 5e                	pop    r14
     120b031:	c3                   	ret
     120b032:	48 89 c3             	mov    rbx,rax
     120b035:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     120b03a:	e8 51 2e 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     120b03f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120b046:	00 00 
     120b048:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     120b04d:	75 08                	jne    120b057 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x505db>
     120b04f:	48 89 df             	mov    rdi,rbx
     120b052:	e8 79 4c 86 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     120b057:	e8 54 4a 5e 00       	call   17efab0 <__stack_chk_fail@plt>
     120b05c:	48 8d 05 e5 16 65 00 	lea    rax,[rip+0x6516e5]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>
     120b063:	48 89 07             	mov    QWORD PTR [rdi],rax
     120b066:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     120b06a:	e9 43 34 89 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120b06f:	cc                   	int3
     120b070:	53                   	push   rbx
     120b071:	48 89 fb             	mov    rbx,rdi
     120b074:	e8 e3 ff ff ff       	call   120b05c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x505e0>
     120b079:	48 89 df             	mov    rdi,rbx
     120b07c:	5b                   	pop    rbx
     120b07d:	e9 9e 2e 5e 00       	jmp    17edf20 <_ZdlPv@plt>
     120b082:	53                   	push   rbx
     120b083:	48 89 fb             	mov    rbx,rdi
     120b086:	6a 18                	push   0x18
     120b088:	5f                   	pop    rdi
     120b089:	e8 72 2e 5e 00       	call   17edf00 <_Znwm@plt>
     120b08e:	48 8d 0d b3 16 65 00 	lea    rcx,[rip+0x6516b3]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>
     120b095:	48 89 08             	mov    QWORD PTR [rax],rcx
     120b098:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120b09c:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120b0a0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120b0a4:	48 85 c9             	test   rcx,rcx
     120b0a7:	74 05                	je     120b0ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50632>
     120b0a9:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     120b0ae:	5b                   	pop    rbx
     120b0af:	c3                   	ret
     120b0b0:	48 8d 05 91 16 65 00 	lea    rax,[rip+0x651691]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>
     120b0b7:	48 89 06             	mov    QWORD PTR [rsi],rax
     120b0ba:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120b0be:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120b0c2:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120b0c6:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax

### AP 0x185c748 materialized @0x120b08e; FDE=(18919554, 18919600)
     120b066:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     120b06a:	e9 43 34 89 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120b06f:	cc                   	int3
     120b070:	53                   	push   rbx
     120b071:	48 89 fb             	mov    rbx,rdi
     120b074:	e8 e3 ff ff ff       	call   120b05c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x505e0>
     120b079:	48 89 df             	mov    rdi,rbx
     120b07c:	5b                   	pop    rbx
     120b07d:	e9 9e 2e 5e 00       	jmp    17edf20 <_ZdlPv@plt>
     120b082:	53                   	push   rbx
     120b083:	48 89 fb             	mov    rbx,rdi
     120b086:	6a 18                	push   0x18
     120b088:	5f                   	pop    rdi
     120b089:	e8 72 2e 5e 00       	call   17edf00 <_Znwm@plt>
     120b08e:	48 8d 0d b3 16 65 00 	lea    rcx,[rip+0x6516b3]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>
     120b095:	48 89 08             	mov    QWORD PTR [rax],rcx
     120b098:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120b09c:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120b0a0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120b0a4:	48 85 c9             	test   rcx,rcx
     120b0a7:	74 05                	je     120b0ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50632>
     120b0a9:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     120b0ae:	5b                   	pop    rbx
     120b0af:	c3                   	ret
     120b0b0:	48 8d 05 91 16 65 00 	lea    rax,[rip+0x651691]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>
     120b0b7:	48 89 06             	mov    QWORD PTR [rsi],rax
     120b0ba:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120b0be:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120b0c2:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120b0c6:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     120b0ca:	48 85 c0             	test   rax,rax
     120b0cd:	74 05                	je     120b0d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50658>
     120b0cf:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     120b0d4:	c3                   	ret
     120b0d5:	cc                   	int3
     120b0d6:	41 56                	push   r14
     120b0d8:	53                   	push   rbx
     120b0d9:	48 83 ec 48          	sub    rsp,0x48
     120b0dd:	48 89 f3             	mov    rbx,rsi
     120b0e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120b0e7:	00 00 
     120b0e9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     120b0ee:	48 8d 77 08          	lea    rsi,[rdi+0x8]
     120b0f2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     120b0f7:	4c 89 f7             	mov    rdi,r14
     120b0fa:	e8 31 02 8a ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>

### AP 0x185c748 materialized @0x120b0b0; FDE=(18919600, 18919637)
     120b083:	48 89 fb             	mov    rbx,rdi
     120b086:	6a 18                	push   0x18
     120b088:	5f                   	pop    rdi
     120b089:	e8 72 2e 5e 00       	call   17edf00 <_Znwm@plt>
     120b08e:	48 8d 0d b3 16 65 00 	lea    rcx,[rip+0x6516b3]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>
     120b095:	48 89 08             	mov    QWORD PTR [rax],rcx
     120b098:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120b09c:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120b0a0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120b0a4:	48 85 c9             	test   rcx,rcx
     120b0a7:	74 05                	je     120b0ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50632>
     120b0a9:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
     120b0ae:	5b                   	pop    rbx
     120b0af:	c3                   	ret
     120b0b0:	48 8d 05 91 16 65 00 	lea    rax,[rip+0x651691]        # 185c748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e30>
     120b0b7:	48 89 06             	mov    QWORD PTR [rsi],rax
     120b0ba:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120b0be:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120b0c2:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120b0c6:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     120b0ca:	48 85 c0             	test   rax,rax
     120b0cd:	74 05                	je     120b0d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50658>
     120b0cf:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     120b0d4:	c3                   	ret
     120b0d5:	cc                   	int3
     120b0d6:	41 56                	push   r14
     120b0d8:	53                   	push   rbx
     120b0d9:	48 83 ec 48          	sub    rsp,0x48
     120b0dd:	48 89 f3             	mov    rbx,rsi
     120b0e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120b0e7:	00 00 
     120b0e9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     120b0ee:	48 8d 77 08          	lea    rsi,[rdi+0x8]
     120b0f2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     120b0f7:	4c 89 f7             	mov    rdi,r14
     120b0fa:	e8 31 02 8a ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     120b0ff:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     120b102:	4d 85 f6             	test   r14,r14
     120b105:	74 25                	je     120b12c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x506b0>
     120b107:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     120b10c:	48 89 de             	mov    rsi,rbx
     120b10f:	e8 db fd ff ff       	call   120aeef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50473>
     120b114:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
     120b119:	4c 89 f7             	mov    rdi,r14
     120b11c:	48 89 de             	mov    rsi,rbx
     120b11f:	e8 38 67 3d 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>

### AP 0x18a1e28 materialized @0xe898e7; FDE=(15243408, 15243731)
      e898ab:	00 00 
      e898ad:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      e898b4:	00 
      e898b5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      e898b9:	48 85 ff             	test   rdi,rdi
      e898bc:	0f 84 d3 00 00 00    	je     e89995 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50dab>
      e898c2:	e8 79 48 96 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
      e898c7:	48 85 c0             	test   rax,rax
      e898ca:	0f 84 c5 00 00 00    	je     e89995 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50dab>
      e898d0:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]
      e898d4:	48 85 ff             	test   rdi,rdi
      e898d7:	0f 84 ba 00 00 00    	je     e89997 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50dad>
      e898dd:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      e898e1:	48 83 64 24 68 00    	and    QWORD PTR [rsp+0x68],0x0
      e898e7:	48 8d 05 3a 85 a1 00 	lea    rax,[rip+0xa1853a]        # 18a1e28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xed68>
      e898ee:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e898f3:	0f 57 c0             	xorps  xmm0,xmm0
      e898f6:	0f 11 44 24 70       	movups XMMWORD PTR [rsp+0x70],xmm0
      e898fb:	0f 11 44 24 7c       	movups XMMWORD PTR [rsp+0x7c],xmm0
      e89900:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e89903:	ff 10                	call   QWORD PTR [rax]
      e89905:	48 89 c3             	mov    rbx,rax
      e89908:	48 89 c7             	mov    rdi,rax
      e8990b:	e8 ea 00 00 00       	call   e899fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e10>
      e89910:	49 89 c7             	mov    r15,rax
      e89913:	49 89 d4             	mov    r12,rdx
      e89916:	48 89 df             	mov    rdi,rbx
      e89919:	e8 04 01 00 00       	call   e89a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e38>
      e8991e:	49 39 d4             	cmp    r12,rdx
      e89921:	74 54                	je     e89977 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50d8d>
      e89923:	49 89 d5             	mov    r13,rdx
      e89926:	48 8d 6c 24 70       	lea    rbp,[rsp+0x70]
      e8992b:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
      e89930:	49 8d 74 24 08       	lea    rsi,[r12+0x8]
      e89935:	48 89 df             	mov    rdi,rbx
      e89938:	e8 65 fb 42 00       	call   12b94a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfea26>
      e8993d:	48 89 ef             	mov    rdi,rbp
      e89940:	e8 09 01 00 00       	call   e89a4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e64>
      e89945:	48 89 c7             	mov    rdi,rax
      e89948:	48 89 de             	mov    rsi,rbx
      e8994b:	e8 3c 01 00 00       	call   e89a8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50ea2>
      e89950:	48 89 df             	mov    rdi,rbx
      e89953:	e8 f0 cd cb ff       	call   b46748 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x936e8>
      e89958:	49 83 c4 50          	add    r12,0x50
      e8995c:	4c 89 e0             	mov    rax,r12
      e8995f:	49 2b 07             	sub    rax,QWORD PTR [r15]

### AP 0x18a1e28 materialized @0x120bfe3; FDE=(18923454, 18923750)
     120bfb8:	e8 f3 3a 5e 00       	call   17efab0 <__stack_chk_fail@plt>
     120bfbd:	cc                   	int3
     120bfbe:	55                   	push   rbp
     120bfbf:	41 57                	push   r15
     120bfc1:	41 56                	push   r14
     120bfc3:	41 55                	push   r13
     120bfc5:	41 54                	push   r12
     120bfc7:	53                   	push   rbx
     120bfc8:	48 83 ec 38          	sub    rsp,0x38
     120bfcc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120bfd3:	00 00 
     120bfd5:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     120bfda:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
     120bfe0:	48 89 fb             	mov    rbx,rdi
     120bfe3:	48 8d 05 3e 5e 69 00 	lea    rax,[rip+0x695e3e]        # 18a1e28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xed68>
     120bfea:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     120bfee:	0f 57 c0             	xorps  xmm0,xmm0
     120bff1:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
     120bff6:	0f 11 44 24 1c       	movups XMMWORD PTR [rsp+0x1c],xmm0
     120bffb:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     120bfff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     120c002:	ff 50 10             	call   QWORD PTR [rax+0x10]
     120c005:	49 89 c4             	mov    r12,rax
     120c008:	48 89 c7             	mov    rdi,rax
     120c00b:	e8 3e d2 fe ff       	call   11f924e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e7d2>
     120c010:	49 89 c6             	mov    r14,rax
     120c013:	49 89 d7             	mov    r15,rdx
     120c016:	4c 89 e7             	mov    rdi,r12
     120c019:	e8 f6 00 00 00       	call   120c114 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51698>
     120c01e:	49 39 c7             	cmp    r15,rax
     120c021:	74 7f                	je     120c0a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51626>
     120c023:	49 89 c4             	mov    r12,rax
     120c026:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     120c02b:	4c 89 ef             	mov    rdi,r13
     120c02e:	e8 1b da c7 ff       	call   e89a4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e64>
     120c033:	48 89 c5             	mov    rbp,rax
     120c036:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     120c03a:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     120c03e:	f6 c2 01             	test   dl,0x1
     120c041:	75 4d                	jne    120c090 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51614>
     120c043:	49 8d 77 18          	lea    rsi,[r15+0x18]
     120c047:	48 8d 7d 48          	lea    rdi,[rbp+0x48]
     120c04b:	e8 42 97 55 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     120c050:	80 4d 10 02          	or     BYTE PTR [rbp+0x10],0x2
     120c054:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
     120c058:	f6 c2 01             	test   dl,0x1

### AP 0x18a1e28 materialized @0x16b6431; FDE=(23815210, 23815243)
     16b63fe:	53                   	push   rbx
     16b63ff:	48 89 fb             	mov    rbx,rdi
     16b6402:	e8 dd ff ff ff       	call   16b63e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a550>
     16b6407:	48 89 df             	mov    rdi,rbx
     16b640a:	5b                   	pop    rbx
     16b640b:	e9 10 7b 13 00       	jmp    17edf20 <_ZdlPv@plt>
     16b6410:	0f 18 0d 09 66 2f 00 	prefetcht0 BYTE PTR [rip+0x2f6609]        # 19aca20 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x75668>
     16b6417:	48 8d 05 02 66 2f 00 	lea    rax,[rip+0x2f6602]        # 19aca20 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x75668>
     16b641e:	48 8b 0d 03 66 2f 00 	mov    rcx,QWORD PTR [rip+0x2f6603]        # 19aca28 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x75670>
     16b6425:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     16b6428:	c3                   	ret
     16b6429:	cc                   	int3
     16b642a:	48 89 f0             	mov    rax,rsi
     16b642d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     16b6431:	48 8d 0d f0 b9 1e 00 	lea    rcx,[rip+0x1eb9f0]        # 18a1e28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xed68>
     16b6438:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     16b643b:	0f 57 c0             	xorps  xmm0,xmm0
     16b643e:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     16b6442:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
     16b6446:	83 66 28 00          	and    DWORD PTR [rsi+0x28],0x0
     16b644a:	c3                   	ret
     16b644b:	cc                   	int3
     16b644c:	0f 18 0d 15 65 2f 00 	prefetcht0 BYTE PTR [rip+0x2f6515]        # 19ac968 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x755b0>
     16b6453:	48 8d 05 0e 65 2f 00 	lea    rax,[rip+0x2f650e]        # 19ac968 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x755b0>
     16b645a:	48 8b 0d 0f 65 2f 00 	mov    rcx,QWORD PTR [rip+0x2f650f]        # 19ac970 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x755b8>
     16b6461:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     16b6464:	c3                   	ret
     16b6465:	cc                   	int3
     16b6466:	48 89 f0             	mov    rax,rsi
     16b6469:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     16b646d:	83 66 10 00          	and    DWORD PTR [rsi+0x10],0x0
     16b6471:	48 8d 0d 70 b9 1e 00 	lea    rcx,[rip+0x1eb970]        # 18a1de8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xed28>
     16b6478:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     16b647b:	c3                   	ret
     16b647c:	0f 18 0d cd 67 2f 00 	prefetcht0 BYTE PTR [rip+0x2f67cd]        # 19acc50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x75898>
     16b6483:	48 8d 05 c6 67 2f 00 	lea    rax,[rip+0x2f67c6]        # 19acc50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x75898>
     16b648a:	48 8b 0d c7 67 2f 00 	mov    rcx,QWORD PTR [rip+0x2f67c7]        # 19acc58 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x758a0>
     16b6491:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     16b6494:	c3                   	ret
     16b6495:	cc                   	int3
     16b6496:	48 89 f0             	mov    rax,rsi
     16b6499:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     16b649d:	48 8d 0d dc b9 1e 00 	lea    rcx,[rip+0x1eb9dc]        # 18a1e80 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xedc0>
     16b64a4:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     16b64a7:	0f 57 c0             	xorps  xmm0,xmm0
     16b64aa:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0

### AP 0x185c6b8 materialized @0x1208161; FDE=(18907452, 18907604)
     1208131:	48 89 c3             	mov    rbx,rax
     1208134:	48 89 df             	mov    rdi,rbx
     1208137:	e8 69 19 87 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     120813c:	41 56                	push   r14
     120813e:	53                   	push   rbx
     120813f:	48 83 ec 48          	sub    rsp,0x48
     1208143:	48 89 fb             	mov    rbx,rdi
     1208146:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120814d:	00 00 
     120814f:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1208154:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
     1208158:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
     120815b:	0f 57 c9             	xorps  xmm1,xmm1
     120815e:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
     1208161:	48 8d 05 50 45 65 00 	lea    rax,[rip+0x654550]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>
     1208168:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     120816d:	48 89 02             	mov    QWORD PTR [rdx],rax
     1208170:	0f 11 42 08          	movups XMMWORD PTR [rdx+0x8],xmm0
     1208174:	48 89 52 20          	mov    QWORD PTR [rdx+0x20],rdx
     1208178:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     120817b:	48 89 e7             	mov    rdi,rsp
     120817e:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
     1208184:	49 89 e6             	mov    r14,rsp
     1208187:	48 89 df             	mov    rdi,rbx
     120818a:	4c 89 f6             	mov    rsi,r14
     120818d:	e8 13 ea 2a 00       	call   14b6ba5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc129>
     1208192:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1208196:	e8 eb 62 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     120819b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     12081a0:	e8 c5 1d 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     12081a5:	31 ff                	xor    edi,edi
     12081a7:	e8 da 62 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12081ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12081b3:	00 00 
     12081b5:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     12081ba:	75 0b                	jne    12081c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d74b>
     12081bc:	48 89 d8             	mov    rax,rbx
     12081bf:	48 83 c4 48          	add    rsp,0x48
     12081c3:	5b                   	pop    rbx
     12081c4:	41 5e                	pop    r14
     12081c6:	c3                   	ret
     12081c7:	e8 e4 78 5e 00       	call   17efab0 <__stack_chk_fail@plt>
     12081cc:	48 89 c7             	mov    rdi,rax
     12081cf:	e8 d1 18 87 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12081d4:	41 57                	push   r15
     12081d6:	41 56                	push   r14

### AP 0x185c6b8 materialized @0x120c884; FDE=(18925700, 18925719)
     120c85a:	53                   	push   rbx
     120c85b:	48 89 fb             	mov    rbx,rdi
     120c85e:	e8 d7 ff ff ff       	call   120c83a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51dbe>
     120c863:	48 89 df             	mov    rdi,rbx
     120c866:	5b                   	pop    rbx
     120c867:	e9 b4 16 5e 00       	jmp    17edf20 <_ZdlPv@plt>
     120c86c:	53                   	push   rbx
     120c86d:	48 89 fb             	mov    rbx,rdi
     120c870:	48 83 c7 20          	add    rdi,0x20
     120c874:	e8 6d ff ff ff       	call   120c7e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d6a>
     120c879:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     120c87d:	5b                   	pop    rbx
     120c87e:	e9 2f 1c 89 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120c883:	cc                   	int3
     120c884:	48 8d 05 2d fe 64 00 	lea    rax,[rip+0x64fe2d]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>
     120c88b:	48 89 07             	mov    QWORD PTR [rdi],rax
     120c88e:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     120c892:	e9 ef 1b 89 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     120c897:	cc                   	int3
     120c898:	53                   	push   rbx
     120c899:	48 89 fb             	mov    rbx,rdi
     120c89c:	e8 e3 ff ff ff       	call   120c884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51e08>
     120c8a1:	48 89 df             	mov    rdi,rbx
     120c8a4:	5b                   	pop    rbx
     120c8a5:	e9 76 16 5e 00       	jmp    17edf20 <_ZdlPv@plt>
     120c8aa:	53                   	push   rbx
     120c8ab:	48 89 fb             	mov    rbx,rdi
     120c8ae:	6a 18                	push   0x18
     120c8b0:	5f                   	pop    rdi
     120c8b1:	e8 4a 16 5e 00       	call   17edf00 <_Znwm@plt>
     120c8b6:	48 8d 0d fb fd 64 00 	lea    rcx,[rip+0x64fdfb]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>
     120c8bd:	48 89 08             	mov    QWORD PTR [rax],rcx
     120c8c0:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120c8c4:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120c8c8:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120c8cc:	48 85 c9             	test   rcx,rcx
     120c8cf:	74 05                	je     120c8d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51e5a>
     120c8d1:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     120c8d6:	5b                   	pop    rbx
     120c8d7:	c3                   	ret
     120c8d8:	48 8d 05 d9 fd 64 00 	lea    rax,[rip+0x64fdd9]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>
     120c8df:	48 89 06             	mov    QWORD PTR [rsi],rax
     120c8e2:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120c8e6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120c8ea:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120c8ee:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax

### AP 0x185c6b8 materialized @0x120c8b6; FDE=(18925738, 18925784)
     120c88e:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     120c892:	e9 ef 1b 89 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     120c897:	cc                   	int3
     120c898:	53                   	push   rbx
     120c899:	48 89 fb             	mov    rbx,rdi
     120c89c:	e8 e3 ff ff ff       	call   120c884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51e08>
     120c8a1:	48 89 df             	mov    rdi,rbx
     120c8a4:	5b                   	pop    rbx
     120c8a5:	e9 76 16 5e 00       	jmp    17edf20 <_ZdlPv@plt>
     120c8aa:	53                   	push   rbx
     120c8ab:	48 89 fb             	mov    rbx,rdi
     120c8ae:	6a 18                	push   0x18
     120c8b0:	5f                   	pop    rdi
     120c8b1:	e8 4a 16 5e 00       	call   17edf00 <_Znwm@plt>
     120c8b6:	48 8d 0d fb fd 64 00 	lea    rcx,[rip+0x64fdfb]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>
     120c8bd:	48 89 08             	mov    QWORD PTR [rax],rcx
     120c8c0:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120c8c4:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120c8c8:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120c8cc:	48 85 c9             	test   rcx,rcx
     120c8cf:	74 05                	je     120c8d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51e5a>
     120c8d1:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     120c8d6:	5b                   	pop    rbx
     120c8d7:	c3                   	ret
     120c8d8:	48 8d 05 d9 fd 64 00 	lea    rax,[rip+0x64fdd9]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>
     120c8df:	48 89 06             	mov    QWORD PTR [rsi],rax
     120c8e2:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120c8e6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120c8ea:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120c8ee:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     120c8f2:	48 85 c0             	test   rax,rax
     120c8f5:	74 05                	je     120c8fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51e80>
     120c8f7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     120c8fc:	c3                   	ret
     120c8fd:	cc                   	int3
     120c8fe:	41 56                	push   r14
     120c900:	53                   	push   rbx
     120c901:	48 83 ec 68          	sub    rsp,0x68
     120c905:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120c90c:	00 00 
     120c90e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     120c913:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     120c917:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     120c91c:	e8 cd a8 0a 00       	call   12b71ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc772>
     120c921:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     120c926:	48 89 df             	mov    rdi,rbx

### AP 0x185c6b8 materialized @0x120c8d8; FDE=(18925784, 18925821)
     120c8ab:	48 89 fb             	mov    rbx,rdi
     120c8ae:	6a 18                	push   0x18
     120c8b0:	5f                   	pop    rdi
     120c8b1:	e8 4a 16 5e 00       	call   17edf00 <_Znwm@plt>
     120c8b6:	48 8d 0d fb fd 64 00 	lea    rcx,[rip+0x64fdfb]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>
     120c8bd:	48 89 08             	mov    QWORD PTR [rax],rcx
     120c8c0:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     120c8c4:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     120c8c8:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     120c8cc:	48 85 c9             	test   rcx,rcx
     120c8cf:	74 05                	je     120c8d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51e5a>
     120c8d1:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     120c8d6:	5b                   	pop    rbx
     120c8d7:	c3                   	ret
     120c8d8:	48 8d 05 d9 fd 64 00 	lea    rax,[rip+0x64fdd9]        # 185c6b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18da0>
     120c8df:	48 89 06             	mov    QWORD PTR [rsi],rax
     120c8e2:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     120c8e6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120c8ea:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     120c8ee:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     120c8f2:	48 85 c0             	test   rax,rax
     120c8f5:	74 05                	je     120c8fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51e80>
     120c8f7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     120c8fc:	c3                   	ret
     120c8fd:	cc                   	int3
     120c8fe:	41 56                	push   r14
     120c900:	53                   	push   rbx
     120c901:	48 83 ec 68          	sub    rsp,0x68
     120c905:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120c90c:	00 00 
     120c90e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     120c913:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     120c917:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     120c91c:	e8 cd a8 0a 00       	call   12b71ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc772>
     120c921:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     120c926:	48 89 df             	mov    rdi,rbx
     120c929:	4c 89 f6             	mov    rsi,r14
     120c92c:	e8 2b 4f 3d 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
     120c931:	4c 89 f7             	mov    rdi,r14
     120c934:	e8 a7 31 8b ff       	call   abfae0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xca80>
     120c939:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120c940:	00 00 
     120c942:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     120c947:	75 08                	jne    120c951 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51ed5>
     120c949:	48 83 c4 68          	add    rsp,0x68
     120c94d:	5b                   	pop    rbx

### AP 0x185ec50 materialized @0x11efdc5; FDE=(18805556, 18832116)
     11efd90:	48 8b 8c 24 80 06 00 	mov    rcx,QWORD PTR [rsp+0x680]
     11efd97:	00 
     11efd98:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11efd9f:	00 
     11efda0:	4c 8b 21             	mov    r12,QWORD PTR [rcx]
     11efda3:	4c 8b 28             	mov    r13,QWORD PTR [rax]
     11efda6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11efda9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11efdac:	48 8b 94 24 c0 06 00 	mov    rdx,QWORD PTR [rsp+0x6c0]
     11efdb3:	00 
     11efdb4:	44 0f b7 b3 fc 03 00 	movzx  r14d,WORD PTR [rbx+0x3fc]
     11efdbb:	00 
     11efdbc:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11efdc1:	44 8a 79 02          	mov    r15b,BYTE PTR [rcx+0x2]
     11efdc5:	48 8d 0d 84 ee 66 00 	lea    rcx,[rip+0x66ee84]        # 185ec50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b338>
     11efdcc:	48 89 8b 00 04 00 00 	mov    QWORD PTR [rbx+0x400],rcx
     11efdd3:	48 8b 8c 24 40 02 00 	mov    rcx,QWORD PTR [rsp+0x240]
     11efdda:	00 
     11efddb:	48 89 8b 18 04 00 00 	mov    QWORD PTR [rbx+0x418],rcx
     11efde2:	66 0f 6f 84 24 30 02 	movdqa xmm0,XMMWORD PTR [rsp+0x230]
     11efde9:	00 00 
     11efdeb:	f3 0f 7f 83 08 04 00 	movdqu XMMWORD PTR [rbx+0x408],xmm0
     11efdf2:	00 
     11efdf3:	66 0f ef c0          	pxor   xmm0,xmm0
     11efdf7:	66 0f 7f 84 24 30 02 	movdqa XMMWORD PTR [rsp+0x230],xmm0
     11efdfe:	00 00 
     11efe00:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0
     11efe07:	00 00 
     11efe09:	4c 89 a3 20 04 00 00 	mov    QWORD PTR [rbx+0x420],r12
     11efe10:	4c 89 ab 28 04 00 00 	mov    QWORD PTR [rbx+0x428],r13
     11efe17:	48 89 93 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rdx
     11efe1e:	48 89 83 38 04 00 00 	mov    QWORD PTR [rbx+0x438],rax
     11efe25:	4c 8d a3 40 04 00 00 	lea    r12,[rbx+0x440]
     11efe2c:	4c 89 e7             	mov    rdi,r12
     11efe2f:	e8 c2 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe34:	48 8d ab 50 04 00 00 	lea    rbp,[rbx+0x450]
     11efe3b:	48 89 ef             	mov    rdi,rbp
     11efe3e:	e8 b3 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe43:	48 8d bb 60 04 00 00 	lea    rdi,[rbx+0x460]
     11efe4a:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     11efe4f:	e8 a2 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe54:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     11efe5b:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     11efe60:	e8 91 9b 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efe65:	48 8b 84 24 e0 06 00 	mov    rax,QWORD PTR [rsp+0x6e0]
     11efe6c:	00 

### AP 0x185cfd8 materialized @0x11f16cb; FDE=(18805556, 18832116)
     11f168a:	00 
     11f168b:	48 89 83 b0 19 00 00 	mov    QWORD PTR [rbx+0x19b0],rax
     11f1692:	4c 89 ab b8 19 00 00 	mov    QWORD PTR [rbx+0x19b8],r13
     11f1699:	48 89 ab c0 19 00 00 	mov    QWORD PTR [rbx+0x19c0],rbp
     11f16a0:	44 88 bb c8 19 00 00 	mov    BYTE PTR [rbx+0x19c8],r15b
     11f16a7:	44 88 a3 c9 19 00 00 	mov    BYTE PTR [rbx+0x19c9],r12b
     11f16ae:	31 ff                	xor    edi,edi
     11f16b0:	e8 d1 cd 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f16b5:	4c 89 f7             	mov    rdi,r14
     11f16b8:	e8 ad 88 88 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11f16bd:	48 8b bc 24 a8 06 00 	mov    rdi,QWORD PTR [rsp+0x6a8]
     11f16c4:	00 
     11f16c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f16c8:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f16cb:	48 8d 0d 06 b9 66 00 	lea    rcx,[rip+0x66b906]        # 185cfd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x196c0>
     11f16d2:	48 89 8b d0 19 00 00 	mov    QWORD PTR [rbx+0x19d0],rcx
     11f16d9:	48 89 83 d8 19 00 00 	mov    QWORD PTR [rbx+0x19d8],rax
     11f16e0:	48 8b 84 24 b0 06 00 	mov    rax,QWORD PTR [rsp+0x6b0]
     11f16e7:	00 
     11f16e8:	48 89 83 e0 19 00 00 	mov    QWORD PTR [rbx+0x19e0],rax
     11f16ef:	48 8b 84 24 d8 06 00 	mov    rax,QWORD PTR [rsp+0x6d8]
     11f16f6:	00 
     11f16f7:	48 89 83 e8 19 00 00 	mov    QWORD PTR [rbx+0x19e8],rax
     11f16fe:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     11f1703:	8a 82 98 00 00 00    	mov    al,BYTE PTR [rdx+0x98]
     11f1709:	48 8d 0d 60 cc 66 00 	lea    rcx,[rip+0x66cc60]        # 185e370 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1aa58>
     11f1710:	48 89 8b f0 19 00 00 	mov    QWORD PTR [rbx+0x19f0],rcx
     11f1717:	48 8b b4 24 00 07 00 	mov    rsi,QWORD PTR [rsp+0x700]
     11f171e:	00 
     11f171f:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
     11f1722:	48 89 8b f8 19 00 00 	mov    QWORD PTR [rbx+0x19f8],rcx
     11f1729:	48 8b 4e 08          	mov    rcx,QWORD PTR [rsi+0x8]
     11f172d:	48 89 8b 00 1a 00 00 	mov    QWORD PTR [rbx+0x1a00],rcx
     11f1734:	48 85 c9             	test   rcx,rcx
     11f1737:	74 05                	je     11f173e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36cc2>
     11f1739:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     11f173e:	48 8b 8c 24 c0 06 00 	mov    rcx,QWORD PTR [rsp+0x6c0]
     11f1745:	00 
     11f1746:	48 89 8b 08 1a 00 00 	mov    QWORD PTR [rbx+0x1a08],rcx
     11f174d:	48 8b 8c 24 48 07 00 	mov    rcx,QWORD PTR [rsp+0x748]
     11f1754:	00 
     11f1755:	48 89 8b 10 1a 00 00 	mov    QWORD PTR [rbx+0x1a10],rcx
     11f175c:	48 83 a3 18 1a 00 00 	and    QWORD PTR [rbx+0x1a18],0x0
     11f1763:	00 
     11f1764:	88 83 20 1a 00 00    	mov    BYTE PTR [rbx+0x1a20],al
     11f176a:	80 ba a9 00 00 00 00 	cmp    BYTE PTR [rdx+0xa9],0x0

### AP 0x185df18 materialized @0x11f098f; FDE=(18805556, 18832116)
     11f0954:	e8 35 79 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0959:	4c 89 b4 24 98 01 00 	mov    QWORD PTR [rsp+0x198],r14
     11f0960:	00 
     11f0961:	31 ff                	xor    edi,edi
     11f0963:	e8 1e db 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0968:	bf b8 00 00 00       	mov    edi,0xb8
     11f096d:	e8 8e d5 5f 00       	call   17edf00 <_Znwm@plt>
     11f0972:	49 89 c7             	mov    r15,rax
     11f0975:	48 8b 84 24 80 05 00 	mov    rax,QWORD PTR [rsp+0x580]
     11f097c:	00 
     11f097d:	48 83 a4 24 80 05 00 	and    QWORD PTR [rsp+0x580],0x0
     11f0984:	00 00 
     11f0986:	48 83 a4 24 98 01 00 	and    QWORD PTR [rsp+0x198],0x0
     11f098d:	00 00 
     11f098f:	48 8d 0d 82 d5 66 00 	lea    rcx,[rip+0x66d582]        # 185df18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a600>
     11f0996:	49 89 0f             	mov    QWORD PTR [r15],rcx
     11f0999:	4d 8d 67 08          	lea    r12,[r15+0x8]
     11f099d:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
     11f09a4:	00 00 
     11f09a6:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     11f09aa:	4d 8d 6f 10          	lea    r13,[r15+0x10]
     11f09ae:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     11f09b5:	00 00 
     11f09b7:	4d 89 77 10          	mov    QWORD PTR [r15+0x10],r14
     11f09bb:	4c 8b b4 24 a0 05 00 	mov    r14,QWORD PTR [rsp+0x5a0]
     11f09c2:	00 
     11f09c3:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f09ca:	00 
     11f09cb:	4d 89 38             	mov    QWORD PTR [r8],r15
     11f09ce:	48 8d 35 bc c6 8a ff 	lea    rsi,[rip+0xffffffffff8ac6bc]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f09d5:	48 8d 0d b2 92 e1 ff 	lea    rcx,[rip+0xffffffffffe192b2]        # 1009c8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d10a4>
     11f09dc:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
     11f09e3:	00 
     11f09e4:	6a 08                	push   0x8
     11f09e6:	41 59                	pop    r9
     11f09e8:	48 89 ef             	mov    rdi,rbp
     11f09eb:	31 d2                	xor    edx,edx
     11f09ed:	e8 a2 9d 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11f09f2:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f09f5:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f09fc:	00 
     11f09fd:	4c 89 f6             	mov    rsi,r14
     11f0a00:	48 89 ea             	mov    rdx,rbp
     11f0a03:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11f0a06:	49 8d 7f 18          	lea    rdi,[r15+0x18]
     11f0a0a:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### AP 0x185e8b8 materialized @0x11f1b9b; FDE=(18805556, 18832116)
     11f1b63:	e8 1e c9 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f1b68:	4c 89 ff             	mov    rdi,r15
     11f1b6b:	e8 78 8c 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f1b70:	4c 89 f7             	mov    rdi,r14
     11f1b73:	48 83 c7 58          	add    rdi,0x58
     11f1b77:	e8 12 67 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f1b7c:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
     11f1b81:	4c 89 b4 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],r14
     11f1b88:	00 
     11f1b89:	6a 78                	push   0x78
     11f1b8b:	5f                   	pop    rdi
     11f1b8c:	e8 6f c3 5f 00       	call   17edf00 <_Znwm@plt>
     11f1b91:	49 89 c4             	mov    r12,rax
     11f1b94:	4c 8d ab 90 05 00 00 	lea    r13,[rbx+0x590]
     11f1b9b:	48 8d 05 16 cd 66 00 	lea    rax,[rip+0x66cd16]        # 185e8b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1afa0>
     11f1ba2:	49 89 04 24          	mov    QWORD PTR [r12],rax
     11f1ba6:	4d 89 6c 24 08       	mov    QWORD PTR [r12+0x8],r13
     11f1bab:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f1bb2:	00 
     11f1bb3:	4d 89 20             	mov    QWORD PTR [r8],r12
     11f1bb6:	48 8d 35 d4 b4 8a ff 	lea    rsi,[rip+0xffffffffff8ab4d4]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f1bbd:	48 8d 0d 2a 75 06 00 	lea    rcx,[rip+0x6752a]        # 12590ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e672>
     11f1bc4:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11f1bcb:	00 
     11f1bcc:	6a 08                	push   0x8
     11f1bce:	41 59                	pop    r9
     11f1bd0:	4c 89 f7             	mov    rdi,r14
     11f1bd3:	31 d2                	xor    edx,edx
     11f1bd5:	e8 ba 8b 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11f1bda:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11f1bde:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f1be5:	00 
     11f1be6:	4c 89 ee             	mov    rsi,r13
     11f1be9:	4c 89 f2             	mov    rdx,r14
     11f1bec:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f1bef:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     11f1bf4:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     11f1bf9:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1c00:	00 
     11f1c01:	4c 89 f6             	mov    rsi,r14
     11f1c04:	e8 35 7e 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f1c09:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f1c0d:	e8 74 c8 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f1c12:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f1c19:	00 
     11f1c1a:	e8 c9 8b 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

