# Restriction-owner gate internal methods

Known owner allocation: 0x18b0 bytes; primary vptr 0x184c738.
Known skip-next ad gate: owner+0x598 && owner+0x470.

## owner subobject initializer called with owner+0x38: 0x10a5fec
Function: 0x10a5fec..0x10a60d0
Direct callees:
- 0x1088fd0 FDE 0x1088fd0..0x108903f
- 0x10a87cc FDE 0x10a87cc..0x10a8812
- 0x17eeb90
Field/address patterns:
Disassembly:
     10a5fec:	55                   	push   rbp
     10a5fed:	53                   	push   rbx
     10a5fee:	50                   	push   rax
     10a5fef:	48 89 fb             	mov    rbx,rdi
     10a5ff2:	e8 d9 2f fe ff       	call   1088fd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2503e6>
     10a5ff7:	0f 57 c0             	xorps  xmm0,xmm0
     10a5ffa:	0f 11 83 58 06 00 00 	movups XMMWORD PTR [rbx+0x658],xmm0
     10a6001:	0f 11 83 48 06 00 00 	movups XMMWORD PTR [rbx+0x648],xmm0
     10a6008:	48 83 a3 68 06 00 00 	and    QWORD PTR [rbx+0x668],0x0
     10a600f:	00 
     10a6010:	0f 11 83 38 06 00 00 	movups XMMWORD PTR [rbx+0x638],xmm0
     10a6017:	66 83 a3 80 06 00 00 	and    WORD PTR [rbx+0x680],0x0
     10a601e:	00 
     10a601f:	31 ed                	xor    ebp,ebp
     10a6021:	40 88 ab 82 06 00 00 	mov    BYTE PTR [rbx+0x682],bpl
     10a6028:	48 8d bb 88 06 00 00 	lea    rdi,[rbx+0x688]
     10a602f:	e8 98 27 00 00       	call   10a87cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fbe2>
     10a6034:	40 88 ab 90 07 00 00 	mov    BYTE PTR [rbx+0x790],bpl
     10a603b:	48 8d bb 98 07 00 00 	lea    rdi,[rbx+0x798]
     10a6042:	40 88 ab 60 08 00 00 	mov    BYTE PTR [rbx+0x860],bpl
     10a6049:	40 88 ab 78 08 00 00 	mov    BYTE PTR [rbx+0x878],bpl
     10a6050:	ba c4 00 00 00       	mov    edx,0xc4
     10a6055:	31 f6                	xor    esi,esi
     10a6057:	e8 34 8b 74 00       	call   17eeb90 <memset@plt>
     10a605c:	40 88 ab 80 08 00 00 	mov    BYTE PTR [rbx+0x880],bpl
     10a6063:	40 88 ab 88 08 00 00 	mov    BYTE PTR [rbx+0x888],bpl
     10a606a:	40 88 ab a0 08 00 00 	mov    BYTE PTR [rbx+0x8a0],bpl
     10a6071:	83 a3 a8 08 00 00 00 	and    DWORD PTR [rbx+0x8a8],0x0
     10a6078:	40 88 ab 90 0f 00 00 	mov    BYTE PTR [rbx+0xf90],bpl
     10a607f:	0f 57 c0             	xorps  xmm0,xmm0
     10a6082:	0f 11 83 98 0f 00 00 	movups XMMWORD PTR [rbx+0xf98],xmm0
     10a6089:	48 83 a3 a8 0f 00 00 	and    QWORD PTR [rbx+0xfa8],0x0
     10a6090:	00 
     10a6091:	0f 11 83 48 07 00 00 	movups XMMWORD PTR [rbx+0x748],xmm0
     10a6098:	0f 11 83 58 07 00 00 	movups XMMWORD PTR [rbx+0x758],xmm0
     10a609f:	0f 11 83 68 07 00 00 	movups XMMWORD PTR [rbx+0x768],xmm0
     10a60a6:	40 88 ab 78 07 00 00 	mov    BYTE PTR [rbx+0x778],bpl
     10a60ad:	0f 11 83 b0 08 00 00 	movups XMMWORD PTR [rbx+0x8b0],xmm0
     10a60b4:	0f 11 83 c0 08 00 00 	movups XMMWORD PTR [rbx+0x8c0],xmm0
     10a60bb:	0f 11 83 d0 08 00 00 	movups XMMWORD PTR [rbx+0x8d0],xmm0
     10a60c2:	40 88 ab e0 08 00 00 	mov    BYTE PTR [rbx+0x8e0],bpl
     10a60c9:	48 83 c4 08          	add    rsp,0x8
     10a60cd:	5b                   	pop    rbx
     10a60ce:	5d                   	pop    rbp
     10a60cf:	c3                   	ret

## primary vtable slot +0x38: 0x10a8db4
Function: 0x10a8db4..0x10a8ead
Strings:
- mft_disallow
Direct callees:
- 0xa9f6ee FDE 0xa9f6ee..0xa9f76d
- 0xa79a7e FDE 0xa79a7e..0xa79aa5
- 0xe2da90 FDE 0xe2da90..0xe2da98
- 0x17ede90
- 0xb49784 FDE 0xb49784..0xb497c0
- 0x10a973a FDE 0x10a973a..0x10a97db
- 0xb33de6 FDE 0xb33de6..0xb33e13
- 0x17efab0
- 0xa79aa5 FDE 0xa79aa5..0xa79ab0
Field/address patterns:
- 0x10a8df8: lea    rdi,[r14+0x5e8]
- 0x10a8e0b: cmp    BYTE PTR [r14+0x38],0x0
- 0x10a8e12: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a8e1c: lea    rax,[rsp+0x38]
- 0x10a8e79: mov    rdi,QWORD PTR [rsp+0x38]
Disassembly:
     10a8db4:	41 57                	push   r15
     10a8db6:	41 56                	push   r14
     10a8db8:	53                   	push   rbx
     10a8db9:	48 83 ec 50          	sub    rsp,0x50
     10a8dbd:	49 89 d7             	mov    r15,rdx
     10a8dc0:	49 89 f6             	mov    r14,rsi
     10a8dc3:	48 89 fb             	mov    rbx,rdi
     10a8dc6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a8dcd:	00 00 
     10a8dcf:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10a8dd4:	48 8b 7e 28          	mov    rdi,QWORD PTR [rsi+0x28]
     10a8dd8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a8ddb:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     10a8de1:	84 c0                	test   al,al
     10a8de3:	74 13                	je     10a8df8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27020e>
     10a8de5:	48 8d 43 08          	lea    rax,[rbx+0x8]
     10a8de9:	0f 57 c0             	xorps  xmm0,xmm0
     10a8dec:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     10a8df0:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a8df3:	e9 8b 00 00 00       	jmp    10a8e83 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270299>
     10a8df8:	49 8d be e8 05 00 00 	lea    rdi,[r14+0x5e8]
     10a8dff:	4c 89 fe             	mov    rsi,r15
     10a8e02:	e8 e7 68 9f ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     10a8e07:	84 c0                	test   al,al
     10a8e09:	74 da                	je     10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e0b:	41 80 7e 38 00       	cmp    BYTE PTR [r14+0x38],0x0
     10a8e10:	75 d3                	jne    10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e12:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a8e19:	00 
     10a8e1a:	74 c9                	je     10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e1c:	48 8d 44 24 38       	lea    rax,[rsp+0x38]
     10a8e21:	0f 57 c0             	xorps  xmm0,xmm0
     10a8e24:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a8e27:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a8e2b:	48 8d 35 74 30 28 ff 	lea    rsi,[rip+0xffffffffff283074]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a8e32:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a8e37:	e8 42 0c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a8e3c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a8e41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a8e46:	e8 45 4c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a8e4b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a8e50:	e8 3b 50 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a8e55:	48 89 e7             	mov    rdi,rsp
     10a8e58:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a8e5d:	e8 22 09 aa ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     10a8e62:	49 89 e6             	mov    r14,rsp
     10a8e65:	48 89 df             	mov    rdi,rbx
     10a8e68:	4c 89 f6             	mov    rsi,r14
     10a8e6b:	e8 ca 08 00 00       	call   10a973a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270b50>
     10a8e70:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     10a8e74:	e8 6d af a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a8e79:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     10a8e7e:	e8 63 af a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a8e83:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a8e8a:	00 00 
     10a8e8c:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     10a8e91:	75 0d                	jne    10a8ea0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2702b6>
     10a8e93:	48 89 d8             	mov    rax,rbx
     10a8e96:	48 83 c4 50          	add    rsp,0x50
     10a8e9a:	5b                   	pop    rbx
     10a8e9b:	41 5e                	pop    r14
     10a8e9d:	41 5f                	pop    r15
     10a8e9f:	c3                   	ret
     10a8ea0:	e8 0b 6c 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a8ea5:	48 89 c7             	mov    rdi,rax
     10a8ea8:	e8 f8 0b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## slot +0x38 helper from owner+0x5e8: 0xa9f6ee
Function: 0xa9f6ee..0xa9f76d
Direct callees:
- 0x17edf70
Field/address patterns:
Disassembly:
      a9f6ee:	44 0f b6 07          	movzx  r8d,BYTE PTR [rdi]
      a9f6f2:	44 89 c1             	mov    ecx,r8d
      a9f6f5:	d1 e9                	shr    ecx,1
      a9f6f7:	41 f6 c0 01          	test   r8b,0x1
      a9f6fb:	48 8b 57 08          	mov    rdx,QWORD PTR [rdi+0x8]
      a9f6ff:	49 89 d1             	mov    r9,rdx
      a9f702:	4c 0f 44 c9          	cmove  r9,rcx
      a9f706:	0f b6 06             	movzx  eax,BYTE PTR [rsi]
      a9f709:	a8 01                	test   al,0x1
      a9f70b:	74 06                	je     a9f713 <JNI_OnUnload@@Base+0x26fe0>
      a9f70d:	4c 8b 56 08          	mov    r10,QWORD PTR [rsi+0x8]
      a9f711:	eb 06                	jmp    a9f719 <JNI_OnUnload@@Base+0x26fe6>
      a9f713:	41 89 c2             	mov    r10d,eax
      a9f716:	41 d1 ea             	shr    r10d,1
      a9f719:	50                   	push   rax
      a9f71a:	4d 39 d1             	cmp    r9,r10
      a9f71d:	75 0a                	jne    a9f729 <JNI_OnUnload@@Base+0x26ff6>
      a9f71f:	a8 01                	test   al,0x1
      a9f721:	74 0a                	je     a9f72d <JNI_OnUnload@@Base+0x26ffa>
      a9f723:	48 8b 76 10          	mov    rsi,QWORD PTR [rsi+0x10]
      a9f727:	eb 07                	jmp    a9f730 <JNI_OnUnload@@Base+0x26ffd>
      a9f729:	31 c0                	xor    eax,eax
      a9f72b:	eb 3e                	jmp    a9f76b <JNI_OnUnload@@Base+0x27038>
      a9f72d:	48 ff c6             	inc    rsi
      a9f730:	41 f6 c0 01          	test   r8b,0x1
      a9f734:	75 27                	jne    a9f75d <JNI_OnUnload@@Base+0x2702a>
      a9f736:	b0 01                	mov    al,0x1
      a9f738:	41 80 f8 02          	cmp    r8b,0x2
      a9f73c:	72 2d                	jb     a9f76b <JNI_OnUnload@@Base+0x27038>
      a9f73e:	48 ff c9             	dec    rcx
      a9f741:	31 d2                	xor    edx,edx
      a9f743:	8a 44 17 01          	mov    al,BYTE PTR [rdi+rdx*1+0x1]
      a9f747:	3a 04 16             	cmp    al,BYTE PTR [rsi+rdx*1]
      a9f74a:	0f 94 c0             	sete   al
      a9f74d:	75 1c                	jne    a9f76b <JNI_OnUnload@@Base+0x27038>
      a9f74f:	4c 8d 42 01          	lea    r8,[rdx+0x1]
      a9f753:	48 39 d1             	cmp    rcx,rdx
      a9f756:	4c 89 c2             	mov    rdx,r8
      a9f759:	75 e8                	jne    a9f743 <JNI_OnUnload@@Base+0x27010>
      a9f75b:	eb 0e                	jmp    a9f76b <JNI_OnUnload@@Base+0x27038>
      a9f75d:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      a9f761:	e8 0a e8 d4 00       	call   17edf70 <memcmp@plt>
      a9f766:	85 c0                	test   eax,eax
      a9f768:	0f 94 c0             	sete   al
      a9f76b:	59                   	pop    rcx
      a9f76c:	c3                   	ret

## restriction builder: 0x10a6464
Function: 0x10a6464..0x10a7f52
Strings:
- mft_disallow
- mft_plus_disallow
- no_prev_track
- not_playing_context
- already_paused
- not_paused
- show
- autoplay
- episode
- ad_disallow
- narration
- automix
- audiobook_capping
- not_supported_by_content_type
- local-list
- spotify:search
- spotify:search:
- local_list
- already_set
- restrictions_handler
- switch-to-video
- unknown
- disallowed_by_account_manager
- disallowed_by_user_setting
- :
Direct callees:
- 0xcf4a34 FDE 0xcf4a34..0xcf4fa6
- 0x10a7f52 FDE 0x10a7f52..0x10a81e1
- 0xcf5004 FDE 0xcf5004..0xcf51ce
- 0xa79a7e FDE 0xa79a7e..0xa79aa5
- 0xe2da90 FDE 0xe2da90..0xe2da98
- 0x17ede90
- 0xa7b836 FDE 0xa7b836..0xa7b84f
- 0x16c5440 FDE 0x16c5440..0x16c5641
- 0x16c532e FDE 0x16c532e..0x16c5349
- 0x1488d69 FDE 0x1488d69..0x1488ef9
- 0xecfaf2 FDE 0xecfaf2..0xecfafd
- 0xa7b84f FDE 0xa7b84f..0xa7b880
- 0xaf2772 FDE 0xaf2772..0xaf2799
- 0xb499d2 FDE 0xb499d2..0xb49a17
- 0xcf56ec FDE 0xcf56ec..0xcf5988
- 0xcf53c2 FDE 0xcf53c2..0xcf565e
- 0xa7b820 FDE 0xa7b820..0xa7b836
- 0x155b1e2 FDE 0x155b1e2..0x155b265
- 0x17edf40
- 0xaa7458 FDE 0xaa7458..0xaa750e
- 0xa7b5e8 FDE 0xa7b5e8..0xa7b624
- 0xef758c FDE 0xef758c..0xef782c
- 0xf1a60a FDE 0xf1a60a..0xf1a655
- 0x10a81e2 FDE 0x10a81e2..0x10a86cc
- 0x17da40a FDE 0x17da40a..0x17da6da
- 0x10a86cc FDE 0x10a86cc..0x10a86f8
- 0xabcabc FDE 0xabcabc..0xabcb64
- 0xa9e486 FDE 0xa9e486..0xa9e490
- 0xabcb64 FDE 0xabcb64..0xabcb7d
- 0xa9b43d FDE 0xa9b43d..0xa9b46a
- 0xad550c FDE 0xad550c..0xad551f
- 0xab6190 FDE 0xab6190..0xab61bd
- 0x17efab0
- 0xa79aa5 FDE 0xa79aa5..0xa79ab0
Field/address patterns:
- 0x10a6574: lea    rax,[rsp+0x598]
- 0x10a66b4: movups XMMWORD PTR [rax+0x38],xmm0
- 0x10a67bc: cmp    BYTE PTR [r14+0x1858],0x0
- 0x10a67ca: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a67dc: and    DWORD PTR [r15+0x38],0x0
- 0x10a68ac: lea    rdi,[r14+0x14a0]
- 0x10a6ba8: mov    r15b,BYTE PTR [r14+0x598]
- 0x10a6c07: cmp    BYTE PTR [r14+0x38],0x0
- 0x10a6d07: and    DWORD PTR [r12+0x38],0x0
- 0x10a6d21: lea    r15,[r14+0x5e8]
- 0x10a6dc2: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a6dd8: and    DWORD PTR [r12+0x38],0x0
- 0x10a6f75: lea    rdi,[r14+0x14a0]
- 0x10a703a: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a7291: lea    rdi,[r14+0x14a0]
- 0x10a731c: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a73a4: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a7417: mov    rdi,QWORD PTR [r14+0x1890]
- 0x10a7492: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a74a0: cmp    BYTE PTR [r14+0x470],0x0
- 0x10a74c2: lea    rdi,[r14+0x14a0]
- 0x10a7582: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a75d0: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a761e: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a7702: lea    rdi,[r14+0x14a0]
- 0x10a7ae7: cmp    BYTE PTR [r14+0x598],0x0
Disassembly:
     10a6464:	55                   	push   rbp
     10a6465:	41 57                	push   r15
     10a6467:	41 56                	push   r14
     10a6469:	41 55                	push   r13
     10a646b:	41 54                	push   r12
     10a646d:	53                   	push   rbx
     10a646e:	48 81 ec 38 08 00 00 	sub    rsp,0x838
     10a6475:	89 f5                	mov    ebp,esi
     10a6477:	49 89 fe             	mov    r14,rdi
     10a647a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a6481:	00 00 
     10a6483:	48 89 84 24 30 08 00 	mov    QWORD PTR [rsp+0x830],rax
     10a648a:	00 
     10a648b:	48 8d 9f 58 14 00 00 	lea    rbx,[rdi+0x1458]
     10a6492:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     10a6497:	48 89 de             	mov    rsi,rbx
     10a649a:	e8 95 e5 c4 ff       	call   cf4a34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2419d4>
     10a649f:	48 8d 84 24 48 04 00 	lea    rax,[rsp+0x448]
     10a64a6:	00 
     10a64a7:	0f 57 c0             	xorps  xmm0,xmm0
     10a64aa:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64ad:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64b1:	48 8d 84 24 60 04 00 	lea    rax,[rsp+0x460]
     10a64b8:	00 
     10a64b9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64bc:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64c0:	48 8d 84 24 78 04 00 	lea    rax,[rsp+0x478]
     10a64c7:	00 
     10a64c8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64cb:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64cf:	48 8d 84 24 90 04 00 	lea    rax,[rsp+0x490]
     10a64d6:	00 
     10a64d7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64da:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64de:	48 8d 84 24 a8 04 00 	lea    rax,[rsp+0x4a8]
     10a64e5:	00 
     10a64e6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64e9:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64ed:	48 8d 84 24 c0 04 00 	lea    rax,[rsp+0x4c0]
     10a64f4:	00 
     10a64f5:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a64f8:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a64fc:	48 8d 84 24 d8 04 00 	lea    rax,[rsp+0x4d8]
     10a6503:	00 
     10a6504:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6507:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a650b:	48 8d 84 24 f0 04 00 	lea    rax,[rsp+0x4f0]
     10a6512:	00 
     10a6513:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6516:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a651a:	48 8d 84 24 08 05 00 	lea    rax,[rsp+0x508]
     10a6521:	00 
     10a6522:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6525:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6529:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
     10a6530:	00 
     10a6531:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6534:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6538:	48 8d 84 24 38 05 00 	lea    rax,[rsp+0x538]
     10a653f:	00 
     10a6540:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6543:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6547:	48 8d 84 24 50 05 00 	lea    rax,[rsp+0x550]
     10a654e:	00 
     10a654f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6552:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6556:	48 8d 84 24 68 05 00 	lea    rax,[rsp+0x568]
     10a655d:	00 
     10a655e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6561:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6565:	48 8d 84 24 80 05 00 	lea    rax,[rsp+0x580]
     10a656c:	00 
     10a656d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6570:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6574:	48 8d 84 24 98 05 00 	lea    rax,[rsp+0x598]
     10a657b:	00 
     10a657c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a657f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6583:	48 8d 84 24 b0 05 00 	lea    rax,[rsp+0x5b0]
     10a658a:	00 
     10a658b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a658e:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6592:	48 8d 84 24 c8 05 00 	lea    rax,[rsp+0x5c8]
     10a6599:	00 
     10a659a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a659d:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65a1:	48 8d 84 24 e0 05 00 	lea    rax,[rsp+0x5e0]
     10a65a8:	00 
     10a65a9:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65ac:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65b0:	48 8d 84 24 f8 05 00 	lea    rax,[rsp+0x5f8]
     10a65b7:	00 
     10a65b8:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65bb:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65bf:	48 8d 84 24 10 06 00 	lea    rax,[rsp+0x610]
     10a65c6:	00 
     10a65c7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65ca:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65ce:	48 8d 84 24 28 06 00 	lea    rax,[rsp+0x628]
     10a65d5:	00 
     10a65d6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65d9:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65dd:	48 8d 84 24 40 06 00 	lea    rax,[rsp+0x640]
     10a65e4:	00 
     10a65e5:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65e8:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65ec:	48 8d 84 24 58 06 00 	lea    rax,[rsp+0x658]
     10a65f3:	00 
     10a65f4:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a65f7:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a65fb:	48 8d 84 24 70 06 00 	lea    rax,[rsp+0x670]
     10a6602:	00 
     10a6603:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6606:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a660a:	48 8d 84 24 88 06 00 	lea    rax,[rsp+0x688]
     10a6611:	00 
     10a6612:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6615:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6619:	48 8d 84 24 a0 06 00 	lea    rax,[rsp+0x6a0]
     10a6620:	00 
     10a6621:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6624:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6628:	48 8d 84 24 b8 06 00 	lea    rax,[rsp+0x6b8]
     10a662f:	00 
     10a6630:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6633:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6637:	48 8d 84 24 d0 06 00 	lea    rax,[rsp+0x6d0]
     10a663e:	00 
     10a663f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6642:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6646:	48 8d 84 24 e8 06 00 	lea    rax,[rsp+0x6e8]
     10a664d:	00 
     10a664e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6651:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6655:	48 8d 84 24 00 07 00 	lea    rax,[rsp+0x700]
     10a665c:	00 
     10a665d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6660:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6664:	48 8d 84 24 18 07 00 	lea    rax,[rsp+0x718]
     10a666b:	00 
     10a666c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a666f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6673:	48 8d 84 24 30 07 00 	lea    rax,[rsp+0x730]
     10a667a:	00 
     10a667b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a667e:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6682:	48 8d 84 24 48 07 00 	lea    rax,[rsp+0x748]
     10a6689:	00 
     10a668a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a668d:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6691:	48 8d 84 24 60 07 00 	lea    rax,[rsp+0x760]
     10a6698:	00 
     10a6699:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a669c:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a66a0:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     10a66a4:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     10a66a8:	b9 00 00 80 3f       	mov    ecx,0x3f800000
     10a66ad:	89 48 30             	mov    DWORD PTR [rax+0x30],ecx
     10a66b0:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
     10a66b4:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
     10a66b8:	89 48 58             	mov    DWORD PTR [rax+0x58],ecx
     10a66bb:	48 8d 84 24 c8 07 00 	lea    rax,[rsp+0x7c8]
     10a66c2:	00 
     10a66c3:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a66c6:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a66ca:	48 8d 84 24 e0 07 00 	lea    rax,[rsp+0x7e0]
     10a66d1:	00 
     10a66d2:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a66d5:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a66d9:	48 8d 84 24 f8 07 00 	lea    rax,[rsp+0x7f8]
     10a66e0:	00 
     10a66e1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a66e4:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a66e8:	4c 8d bc 24 40 04 00 	lea    r15,[rsp+0x440]
     10a66ef:	00 
     10a66f0:	48 89 df             	mov    rdi,rbx
     10a66f3:	4c 89 fe             	mov    rsi,r15
     10a66f6:	e8 57 18 00 00       	call   10a7f52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f368>
     10a66fb:	4c 89 ff             	mov    rdi,r15
     10a66fe:	e8 01 e9 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
     10a6703:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     10a6707:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a670a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10a670d:	8b 00                	mov    eax,DWORD PTR [rax]
     10a670f:	48 83 f8 05          	cmp    rax,0x5
     10a6713:	77 0c                	ja     10a6721 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db37>
     10a6715:	48 8d 0d 8c 0c 33 ff 	lea    rcx,[rip+0xffffffffff330c8c]        # 3d73a8 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f8d>
     10a671c:	8b 34 81             	mov    esi,DWORD PTR [rcx+rax*4]
     10a671f:	eb 03                	jmp    10a6724 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db3a>
     10a6721:	6a 05                	push   0x5
     10a6723:	5e                   	pop    rsi
     10a6724:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6728:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a672b:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
     10a6731:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6735:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6738:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
     10a673e:	85 c0                	test   eax,eax
     10a6740:	74 35                	je     10a6777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db8d>
     10a6742:	48 8d 35 5d 57 28 ff 	lea    rsi,[rip+0xffffffffff28575d]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6749:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6750:	00 
     10a6751:	e8 28 33 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6756:	49 8d be b0 16 00 00 	lea    rdi,[r14+0x16b0]
     10a675d:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6764:	00 
     10a6765:	e8 26 73 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a676a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6771:	00 
     10a6772:	e8 19 77 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6777:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10a677a:	4c 89 f7             	mov    rdi,r14
     10a677d:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     10a6783:	84 c0                	test   al,al
     10a6785:	75 35                	jne    10a67bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dbd2>
     10a6787:	48 8d 35 9a 52 28 ff 	lea    rsi,[rip+0xffffffffff28529a]        # 32ba28 <_ZTSSt12bad_any_cast@@Base-0x647a0>
     10a678e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6795:	00 
     10a6796:	e8 e3 32 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a679b:	49 8d be 70 17 00 00 	lea    rdi,[r14+0x1770]
     10a67a2:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a67a9:	00 
     10a67aa:	e8 e1 72 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a67af:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a67b6:	00 
     10a67b7:	e8 d4 76 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a67bc:	41 80 be 58 18 00 00 	cmp    BYTE PTR [r14+0x1858],0x0
     10a67c3:	00 
     10a67c4:	0f 85 de 03 00 00    	jne    10a6ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfbe>
     10a67ca:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a67d1:	00 
     10a67d2:	74 64                	je     10a6838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc4e>
     10a67d4:	4c 8d bc 24 40 04 00 	lea    r15,[rsp+0x440]
     10a67db:	00 
     10a67dc:	41 83 67 38 00       	and    DWORD PTR [r15+0x38],0x0
     10a67e1:	0f 57 c0             	xorps  xmm0,xmm0
     10a67e4:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     10a67e8:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     10a67ed:	41 0f 29 47 20       	movaps XMMWORD PTR [r15+0x20],xmm0
     10a67f2:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]
     10a67f9:	e8 38 50 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a67fe:	4c 89 ff             	mov    rdi,r15
     10a6801:	48 89 c6             	mov    rsi,rax
     10a6804:	e8 37 ec 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6809:	84 c0                	test   al,al
     10a680b:	74 19                	je     10a6826 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3c>
     10a680d:	41 b7 01             	mov    r15b,0x1
     10a6810:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
     10a6817:	83 f8 04             	cmp    eax,0x4
     10a681a:	74 0d                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a681c:	83 f8 09             	cmp    eax,0x9
     10a681f:	74 08                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a6821:	83 f8 64             	cmp    eax,0x64
     10a6824:	74 03                	je     10a6829 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc3f>
     10a6826:	45 31 ff             	xor    r15d,r15d
     10a6829:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6830:	00 
     10a6831:	e8 f8 ea 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a6836:	eb 03                	jmp    10a683b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc51>
     10a6838:	45 31 ff             	xor    r15d,r15d
     10a683b:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a683f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6842:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
     10a6848:	45 84 ff             	test   r15b,r15b
     10a684b:	0f 94 c1             	sete   cl
     10a684e:	08 c1                	or     cl,al
     10a6850:	75 35                	jne    10a6887 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc9d>
     10a6852:	48 8d 35 4d 56 28 ff 	lea    rsi,[rip+0xffffffffff28564d]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6859:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6860:	00 
     10a6861:	e8 18 32 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6866:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a686d:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6874:	00 
     10a6875:	e8 16 72 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a687a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6881:	00 
     10a6882:	e8 09 76 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6887:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a688b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a688e:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     10a6894:	84 c0                	test   al,al
     10a6896:	75 35                	jne    10a68cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dce3>
     10a6898:	48 8d 35 07 56 28 ff 	lea    rsi,[rip+0xffffffffff285607]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a689f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a68a6:	00 
     10a68a7:	e8 d2 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a68ac:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a68b3:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a68ba:	00 
     10a68bb:	e8 d0 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a68c0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a68c7:	00 
     10a68c8:	e8 c3 75 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a68cd:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a68d1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a68d4:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     10a68da:	84 c0                	test   al,al
     10a68dc:	75 35                	jne    10a6913 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dd29>
     10a68de:	48 8d 35 c1 55 28 ff 	lea    rsi,[rip+0xffffffffff2855c1]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a68e5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a68ec:	00 
     10a68ed:	e8 8c 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a68f2:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
     10a68f9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6900:	00 
     10a6901:	e8 8a 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6906:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a690d:	00 
     10a690e:	e8 7d 75 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6913:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6917:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a691a:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     10a6920:	45 84 ff             	test   r15b,r15b
     10a6923:	0f 94 c1             	sete   cl
     10a6926:	08 c1                	or     cl,al
     10a6928:	75 35                	jne    10a695f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dd75>
     10a692a:	48 8d 35 75 55 28 ff 	lea    rsi,[rip+0xffffffffff285575]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6931:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6938:	00 
     10a6939:	e8 40 31 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a693e:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a6945:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a694c:	00 
     10a694d:	e8 3e 71 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6952:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6959:	00 
     10a695a:	e8 31 75 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a695f:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6963:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6966:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     10a696c:	84 c0                	test   al,al
     10a696e:	75 35                	jne    10a69a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ddbb>
     10a6970:	48 8d 35 2f 55 28 ff 	lea    rsi,[rip+0xffffffffff28552f]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6977:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a697e:	00 
     10a697f:	e8 fa 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6984:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a698b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6992:	00 
     10a6993:	e8 f8 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6998:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a699f:	00 
     10a69a0:	e8 eb 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a69a5:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a69a9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a69ac:	ff 90 00 01 00 00    	call   QWORD PTR [rax+0x100]
     10a69b2:	84 c0                	test   al,al
     10a69b4:	75 35                	jne    10a69eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de01>
     10a69b6:	48 8d 35 e9 54 28 ff 	lea    rsi,[rip+0xffffffffff2854e9]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a69bd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a69c4:	00 
     10a69c5:	e8 b4 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a69ca:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a69d1:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a69d8:	00 
     10a69d9:	e8 b2 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a69de:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a69e5:	00 
     10a69e6:	e8 a5 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a69eb:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a69ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a69f2:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     10a69f8:	41 80 be 59 18 00 00 	cmp    BYTE PTR [r14+0x1859],0x0
     10a69ff:	00 
     10a6a00:	0f 94 c1             	sete   cl
     10a6a03:	08 c8                	or     al,cl
     10a6a05:	75 35                	jne    10a6a3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26de52>
     10a6a07:	48 8d 35 98 54 28 ff 	lea    rsi,[rip+0xffffffffff285498]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6a0e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a15:	00 
     10a6a16:	e8 63 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6a1b:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
     10a6a22:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6a29:	00 
     10a6a2a:	e8 61 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6a2f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a36:	00 
     10a6a37:	e8 54 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6a3c:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6a40:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6a43:	ff 50 48             	call   QWORD PTR [rax+0x48]
     10a6a46:	84 c0                	test   al,al
     10a6a48:	0f 85 9f 00 00 00    	jne    10a6aed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26df03>
     10a6a4e:	48 8d 35 51 54 28 ff 	lea    rsi,[rip+0xffffffffff285451]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6a55:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a5c:	00 
     10a6a5d:	e8 1c 30 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6a62:	49 8d be f0 15 00 00 	lea    rdi,[r14+0x15f0]
     10a6a69:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6a70:	00 
     10a6a71:	e8 1a 70 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6a76:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a7d:	00 
     10a6a7e:	e8 0d 74 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6a83:	48 8d 35 1c 54 28 ff 	lea    rsi,[rip+0xffffffffff28541c]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6a8a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6a91:	00 
     10a6a92:	e8 e7 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6a97:	49 8d be 20 16 00 00 	lea    rdi,[r14+0x1620]
     10a6a9e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6aa5:	00 
     10a6aa6:	e8 e5 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6aab:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ab2:	00 
     10a6ab3:	e8 d8 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6ab8:	48 8d 35 e7 53 28 ff 	lea    rsi,[rip+0xffffffffff2853e7]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6abf:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ac6:	00 
     10a6ac7:	e8 b2 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6acc:	49 8d be 78 15 00 00 	lea    rdi,[r14+0x1578]
     10a6ad3:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6ada:	00 
     10a6adb:	e8 b0 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6ae0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ae7:	00 
     10a6ae8:	e8 a3 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6aed:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6af1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6af4:	ff 50 58             	call   QWORD PTR [rax+0x58]
     10a6af7:	84 c0                	test   al,al
     10a6af9:	75 6a                	jne    10a6b65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26df7b>
     10a6afb:	48 8d 35 a4 53 28 ff 	lea    rsi,[rip+0xffffffffff2853a4]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6b02:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b09:	00 
     10a6b0a:	e8 6f 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6b0f:	49 8d be 50 16 00 00 	lea    rdi,[r14+0x1650]
     10a6b16:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6b1d:	00 
     10a6b1e:	e8 6d 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6b23:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b2a:	00 
     10a6b2b:	e8 60 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6b30:	48 8d 35 6f 53 28 ff 	lea    rsi,[rip+0xffffffffff28536f]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6b37:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b3e:	00 
     10a6b3f:	e8 3a 2f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6b44:	49 8d be 68 16 00 00 	lea    rdi,[r14+0x1668]
     10a6b4b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6b52:	00 
     10a6b53:	e8 38 6f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6b58:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b5f:	00 
     10a6b60:	e8 2b 73 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6b65:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6b69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6b6c:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10a6b6f:	84 c0                	test   al,al
     10a6b71:	75 35                	jne    10a6ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfbe>
     10a6b73:	48 8d 35 2c 53 28 ff 	lea    rsi,[rip+0xffffffffff28532c]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6b7a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6b81:	00 
     10a6b82:	e8 f7 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6b87:	49 8d be 90 15 00 00 	lea    rdi,[r14+0x1590]
     10a6b8e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6b95:	00 
     10a6b96:	e8 f5 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6b9b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ba2:	00 
     10a6ba3:	e8 e8 72 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6ba8:	45 8a be 98 05 00 00 	mov    r15b,BYTE PTR [r14+0x598]
     10a6baf:	45 84 ff             	test   r15b,r15b
     10a6bb2:	74 19                	je     10a6bcd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfe3>
     10a6bb4:	49 8b 86 b8 05 00 00 	mov    rax,QWORD PTR [r14+0x5b8]
     10a6bbb:	49 3b 86 c0 05 00 00 	cmp    rax,QWORD PTR [r14+0x5c0]
     10a6bc2:	75 43                	jne    10a6c07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e01d>
     10a6bc4:	48 8d 35 1f a4 2d ff 	lea    rsi,[rip+0xffffffffff2da41f]        # 380fea <_ZTSSt12bad_any_cast@@Base-0xf1de>
     10a6bcb:	eb 07                	jmp    10a6bd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfea>
     10a6bcd:	48 8d 35 97 36 2a ff 	lea    rsi,[rip+0xffffffffff2a3697]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6bd4:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6bdb:	00 
     10a6bdc:	e8 9d 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6be1:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a6be8:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6bef:	00 
     10a6bf0:	e8 9b 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6bf5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6bfc:	00 
     10a6bfd:	e8 8e 72 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6c02:	45 84 ff             	test   r15b,r15b
     10a6c05:	74 5d                	je     10a6c64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e07a>
     10a6c07:	41 80 7e 38 00       	cmp    BYTE PTR [r14+0x38],0x0
     10a6c0c:	74 29                	je     10a6c37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e04d>
     10a6c0e:	48 8d 35 df b8 28 ff 	lea    rsi,[rip+0xffffffffff28b8df]        # 3324f4 <_ZTSSt12bad_any_cast@@Base-0x5dcd4>
     10a6c15:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6c1c:	00 
     10a6c1d:	e8 5c 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6c22:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6c29:	00 
     10a6c2a:	48 89 df             	mov    rdi,rbx
     10a6c2d:	e8 5e 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6c32:	e9 bb 00 00 00       	jmp    10a6cf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e108>
     10a6c37:	48 8d 35 0b 6d 2a ff 	lea    rsi,[rip+0xffffffffff2a6d0b]        # 34d949 <_ZTSSt12bad_any_cast@@Base-0x4287f>
     10a6c3e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6c45:	00 
     10a6c46:	e8 33 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6c4b:	49 8d be 70 14 00 00 	lea    rdi,[r14+0x1470]
     10a6c52:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6c59:	00 
     10a6c5a:	e8 31 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6c5f:	e9 8e 00 00 00       	jmp    10a6cf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e108>
     10a6c64:	48 8d 35 00 36 2a ff 	lea    rsi,[rip+0xffffffffff2a3600]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6c6b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6c72:	00 
     10a6c73:	e8 06 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6c78:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a6c7f:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6c86:	00 
     10a6c87:	e8 04 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6c8c:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6c93:	00 
     10a6c94:	e8 f7 71 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6c99:	48 8d 35 cb 35 2a ff 	lea    rsi,[rip+0xffffffffff2a35cb]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6ca0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ca7:	00 
     10a6ca8:	e8 d1 2d 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6cad:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6cb4:	00 
     10a6cb5:	48 89 df             	mov    rdi,rbx
     10a6cb8:	e8 d3 6d d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6cbd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6cc4:	00 
     10a6cc5:	e8 c6 71 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6cca:	48 8d 35 9a 35 2a ff 	lea    rsi,[rip+0xffffffffff2a359a]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6cd1:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6cd8:	00 
     10a6cd9:	e8 a0 2d 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6cde:	49 8d be 70 14 00 00 	lea    rdi,[r14+0x1470]
     10a6ce5:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6cec:	00 
     10a6ced:	e8 9e 6d d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6cf2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6cf9:	00 
     10a6cfa:	e8 91 71 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6cff:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a6d06:	00 
     10a6d07:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     10a6d0d:	0f 57 c0             	xorps  xmm0,xmm0
     10a6d10:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     10a6d15:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
     10a6d1b:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
     10a6d21:	4d 8d be e8 05 00 00 	lea    r15,[r14+0x5e8]
     10a6d28:	4c 89 ff             	mov    rdi,r15
     10a6d2b:	e8 06 4b 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a6d30:	4c 89 e7             	mov    rdi,r12
     10a6d33:	48 89 c6             	mov    rsi,rax
     10a6d36:	e8 05 e7 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6d3b:	84 c0                	test   al,al
     10a6d3d:	74 36                	je     10a6d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e18b>
     10a6d3f:	83 bc 24 78 04 00 00 	cmp    DWORD PTR [rsp+0x478],0x3e
     10a6d46:	3e 
     10a6d47:	75 2c                	jne    10a6d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e18b>
     10a6d49:	48 8d 35 98 80 39 ff 	lea    rsi,[rip+0xffffffffff398098]        # 43ede8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x49f4>
     10a6d50:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6d55:	e8 24 2d 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6d5a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a6d61:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6d66:	e8 25 6d d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6d6b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6d70:	e8 1b 71 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6d75:	41 80 be c8 0f 00 00 	cmp    BYTE PTR [r14+0xfc8],0x0
     10a6d7c:	00 
     10a6d7d:	74 36                	je     10a6db5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e1cb>
     10a6d7f:	41 83 be 98 09 00 00 	cmp    DWORD PTR [r14+0x998],0x2
     10a6d86:	02 
     10a6d87:	75 2c                	jne    10a6db5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e1cb>
     10a6d89:	48 8d 35 3a 96 28 ff 	lea    rsi,[rip+0xffffffffff28963a]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
     10a6d90:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6d95:	e8 e4 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6d9a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a6da1:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6da6:	e8 e5 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6dab:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6db0:	e8 db 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6db5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6dbc:	00 
     10a6dbd:	e8 6c e5 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a6dc2:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a6dc9:	00 
     10a6dca:	0f 84 f0 00 00 00    	je     10a6ec0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e2d6>
     10a6dd0:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a6dd7:	00 
     10a6dd8:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     10a6dde:	0f 57 c0             	xorps  xmm0,xmm0
     10a6de1:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     10a6de6:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
     10a6dec:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
     10a6df2:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]
     10a6df9:	e8 38 4a 9d ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     10a6dfe:	4c 89 e7             	mov    rdi,r12
     10a6e01:	48 89 c6             	mov    rsi,rax
     10a6e04:	e8 37 e6 61 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
     10a6e09:	84 c0                	test   al,al
     10a6e0b:	74 70                	je     10a6e7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e293>
     10a6e0d:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
     10a6e14:	83 f8 3f             	cmp    eax,0x3f
     10a6e17:	75 33                	jne    10a6e4c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e262>
     10a6e19:	48 8d 35 87 4c 2c ff 	lea    rsi,[rip+0xffffffffff2c4c87]        # 36baa7 <_ZTSSt12bad_any_cast@@Base-0x24721>
     10a6e20:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e25:	e8 54 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6e2a:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6e31:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6e36:	e8 55 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6e3b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e40:	e8 4b 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6e45:	8b 84 24 78 04 00 00 	mov    eax,DWORD PTR [rsp+0x478]
     10a6e4c:	83 f8 0c             	cmp    eax,0xc
     10a6e4f:	75 2c                	jne    10a6e7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e293>
     10a6e51:	48 8d 35 ed 6e 2c ff 	lea    rsi,[rip+0xffffffffff2c6eed]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a6e58:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e5d:	e8 1c 2c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6e62:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6e69:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6e6e:	e8 1d 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6e73:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e78:	e8 13 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6e7d:	41 80 be 94 05 00 00 	cmp    BYTE PTR [r14+0x594],0x0
     10a6e84:	00 
     10a6e85:	74 2c                	je     10a6eb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e2c9>
     10a6e87:	48 8d 35 47 0e 2c ff 	lea    rsi,[rip+0xffffffffff2c0e47]        # 367cd5 <_ZTSSt12bad_any_cast@@Base-0x284f3>
     10a6e8e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6e93:	e8 e6 2b 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6e98:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6e9f:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6ea4:	e8 e7 6b d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6ea9:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6eae:	e8 dd 6f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6eb3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6eba:	00 
     10a6ebb:	e8 6e e4 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a6ec0:	41 8a 86 c8 0f 00 00 	mov    al,BYTE PTR [r14+0xfc8]
     10a6ec7:	84 c0                	test   al,al
     10a6ec9:	74 46                	je     10a6f11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e327>
     10a6ecb:	41 83 be 98 09 00 00 	cmp    DWORD PTR [r14+0x998],0x2
     10a6ed2:	02 
     10a6ed3:	75 3c                	jne    10a6f11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e327>
     10a6ed5:	48 8d 35 ee 94 28 ff 	lea    rsi,[rip+0xffffffffff2894ee]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
     10a6edc:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ee3:	00 
     10a6ee4:	e8 95 2b 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6ee9:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a6ef0:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6ef7:	00 
     10a6ef8:	e8 93 6b d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6efd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f04:	00 
     10a6f05:	e8 86 6f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6f0a:	41 8a 86 c8 0f 00 00 	mov    al,BYTE PTR [r14+0xfc8]
     10a6f11:	84 c0                	test   al,al
     10a6f13:	0f 84 21 01 00 00    	je     10a703a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e450>
     10a6f19:	41 8b 86 98 09 00 00 	mov    eax,DWORD PTR [r14+0x998]
     10a6f20:	83 e0 fe             	and    eax,0xfffffffe
     10a6f23:	83 f8 04             	cmp    eax,0x4
     10a6f26:	0f 85 0e 01 00 00    	jne    10a703a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e450>
     10a6f2c:	48 8d 35 b5 08 2d ff 	lea    rsi,[rip+0xffffffffff2d08b5]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a6f33:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f3a:	00 
     10a6f3b:	e8 3e 2b 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6f40:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a6f47:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6f4e:	00 
     10a6f4f:	e8 3c 6b d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6f54:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f5b:	00 
     10a6f5c:	e8 2f 6f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6f61:	48 8d 35 80 08 2d ff 	lea    rsi,[rip+0xffffffffff2d0880]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a6f68:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f6f:	00 
     10a6f70:	e8 09 2b 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6f75:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a6f7c:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6f83:	00 
     10a6f84:	e8 07 6b d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6f89:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6f90:	00 
     10a6f91:	e8 fa 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6f96:	48 8d 35 4b 08 2d ff 	lea    rsi,[rip+0xffffffffff2d084b]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a6f9d:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6fa4:	00 
     10a6fa5:	e8 d4 2a 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6faa:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a6fb1:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6fb8:	00 
     10a6fb9:	e8 d2 6a d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6fbe:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6fc5:	00 
     10a6fc6:	e8 c5 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6fcb:	48 8d 35 16 08 2d ff 	lea    rsi,[rip+0xffffffffff2d0816]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a6fd2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6fd9:	00 
     10a6fda:	e8 9f 2a 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6fdf:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a6fe6:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6fed:	00 
     10a6fee:	e8 9d 6a d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6ff3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ffa:	00 
     10a6ffb:	e8 90 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7000:	48 8d 35 e1 07 2d ff 	lea    rsi,[rip+0xffffffffff2d07e1]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a7007:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a700e:	00 
     10a700f:	e8 6a 2a 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7014:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a701b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7022:	00 
     10a7023:	e8 68 6a d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7028:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a702f:	00 
     10a7030:	e8 5b 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7035:	e9 cf 00 00 00       	jmp    10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a703a:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7041:	00 
     10a7042:	0f 84 c1 00 00 00    	je     10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a7048:	41 80 be 88 05 00 00 	cmp    BYTE PTR [r14+0x588],0x0
     10a704f:	00 
     10a7050:	0f 84 b3 00 00 00    	je     10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a7056:	49 8d b6 78 04 00 00 	lea    rsi,[r14+0x478]
     10a705d:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a7064:	00 
     10a7065:	4c 89 e7             	mov    rdi,r12
     10a7068:	e8 fc 1c 3e 00       	call   1488d69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce2ed>
     10a706d:	41 83 3c 24 09       	cmp    DWORD PTR [r12],0x9
     10a7072:	0f 85 84 00 00 00    	jne    10a70fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e512>
     10a7078:	48 8d 35 69 07 2d ff 	lea    rsi,[rip+0xffffffffff2d0769]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a707f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7084:	e8 f5 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7089:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a7090:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7095:	e8 f6 69 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a709a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a709f:	e8 ec 6d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a70a4:	48 8d 35 3d 07 2d ff 	lea    rsi,[rip+0xffffffffff2d073d]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a70ab:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a70b0:	e8 c9 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a70b5:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a70bc:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a70c1:	e8 ca 69 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a70c6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a70cb:	e8 c0 6d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a70d0:	48 8d 35 11 07 2d ff 	lea    rsi,[rip+0xffffffffff2d0711]        # 3777e8 <_ZTSSt12bad_any_cast@@Base-0x189e0>
     10a70d7:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a70dc:	e8 9d 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a70e1:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a70e8:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a70ed:	e8 9e 69 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a70f2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a70f7:	e8 94 6d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a70fc:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     10a7103:	00 
     10a7104:	e8 e9 89 e2 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
     10a7109:	41 8a 8e c8 0f 00 00 	mov    cl,BYTE PTR [r14+0xfc8]
     10a7110:	41 8b 86 98 09 00 00 	mov    eax,DWORD PTR [r14+0x998]
     10a7117:	84 c9                	test   cl,cl
     10a7119:	74 48                	je     10a7163 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e579>
     10a711b:	83 f8 02             	cmp    eax,0x2
     10a711e:	75 43                	jne    10a7163 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e579>
     10a7120:	48 8d 35 a3 92 28 ff 	lea    rsi,[rip+0xffffffffff2892a3]        # 3303ca <_ZTSSt12bad_any_cast@@Base-0x5fdfe>
     10a7127:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a712e:	00 
     10a712f:	e8 4a 29 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7134:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
     10a713b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7142:	00 
     10a7143:	e8 48 69 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7148:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a714f:	00 
     10a7150:	e8 3b 6d 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7155:	41 8a 8e c8 0f 00 00 	mov    cl,BYTE PTR [r14+0xfc8]
     10a715c:	41 8b 86 98 09 00 00 	mov    eax,DWORD PTR [r14+0x998]
     10a7163:	84 c9                	test   cl,cl
     10a7165:	0f 84 b1 01 00 00    	je     10a731c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e732>
     10a716b:	83 f8 06             	cmp    eax,0x6
     10a716e:	0f 85 a8 01 00 00    	jne    10a731c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e732>
     10a7174:	48 8d 35 88 b3 28 ff 	lea    rsi,[rip+0xffffffffff28b388]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a717b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7182:	00 
     10a7183:	e8 f6 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7188:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
     10a718f:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7196:	00 
     10a7197:	e8 f4 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a719c:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a71a3:	00 
     10a71a4:	e8 e7 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a71a9:	48 8d 35 53 b3 28 ff 	lea    rsi,[rip+0xffffffffff28b353]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a71b0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a71b7:	00 
     10a71b8:	e8 c1 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a71bd:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a71c4:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a71cb:	00 
     10a71cc:	e8 bf 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a71d1:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a71d8:	00 
     10a71d9:	e8 b2 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a71de:	48 8d 35 1e b3 28 ff 	lea    rsi,[rip+0xffffffffff28b31e]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a71e5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a71ec:	00 
     10a71ed:	e8 8c 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a71f2:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a71f9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7200:	00 
     10a7201:	e8 8a 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7206:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a720d:	00 
     10a720e:	e8 7d 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7213:	48 8d 35 e9 b2 28 ff 	lea    rsi,[rip+0xffffffffff28b2e9]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a721a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7221:	00 
     10a7222:	e8 57 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7227:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a722e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7235:	00 
     10a7236:	e8 55 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a723b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7242:	00 
     10a7243:	e8 48 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7248:	48 8d 35 b4 b2 28 ff 	lea    rsi,[rip+0xffffffffff28b2b4]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a724f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7256:	00 
     10a7257:	e8 22 28 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a725c:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a7263:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a726a:	00 
     10a726b:	e8 20 68 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7270:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7277:	00 
     10a7278:	e8 13 6c 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a727d:	48 8d 35 7f b2 28 ff 	lea    rsi,[rip+0xffffffffff28b27f]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a7284:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a728b:	00 
     10a728c:	e8 ed 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7291:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a7298:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a729f:	00 
     10a72a0:	e8 eb 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a72a5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a72ac:	00 
     10a72ad:	e8 de 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a72b2:	48 8d 35 4a b2 28 ff 	lea    rsi,[rip+0xffffffffff28b24a]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a72b9:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a72c0:	00 
     10a72c1:	e8 b8 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a72c6:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
     10a72cd:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a72d4:	00 
     10a72d5:	e8 b6 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a72da:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a72e1:	00 
     10a72e2:	e8 a9 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a72e7:	48 8d 35 15 b2 28 ff 	lea    rsi,[rip+0xffffffffff28b215]        # 332503 <_ZTSSt12bad_any_cast@@Base-0x5dcc5>
     10a72ee:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a72f5:	00 
     10a72f6:	e8 83 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a72fb:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a7302:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7309:	00 
     10a730a:	e8 81 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a730f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7316:	00 
     10a7317:	e8 74 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a731c:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7323:	00 
     10a7324:	74 7e                	je     10a73a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7ba>
     10a7326:	41 80 be 94 05 00 00 	cmp    BYTE PTR [r14+0x594],0x0
     10a732d:	00 
     10a732e:	74 74                	je     10a73a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7ba>
     10a7330:	48 8d 35 9e 09 2c ff 	lea    rsi,[rip+0xffffffffff2c099e]        # 367cd5 <_ZTSSt12bad_any_cast@@Base-0x284f3>
     10a7337:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a733e:	00 
     10a733f:	e8 3a 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7344:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a734b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7352:	00 
     10a7353:	e8 38 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7358:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a735f:	00 
     10a7360:	e8 2b 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7365:	41 80 be 39 02 00 00 	cmp    BYTE PTR [r14+0x239],0x0
     10a736c:	00 
     10a736d:	74 35                	je     10a73a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7ba>
     10a736f:	48 8d 35 5f 09 2c ff 	lea    rsi,[rip+0xffffffffff2c095f]        # 367cd5 <_ZTSSt12bad_any_cast@@Base-0x284f3>
     10a7376:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a737d:	00 
     10a737e:	e8 fb 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7383:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a738a:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7391:	00 
     10a7392:	e8 f9 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7397:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a739e:	00 
     10a739f:	e8 ec 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a73a4:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a73ab:	00 
     10a73ac:	74 34                	je     10a73e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7f8>
     10a73ae:	41 80 be 97 05 00 00 	cmp    BYTE PTR [r14+0x597],0x0
     10a73b5:	00 
     10a73b6:	75 5f                	jne    10a7417 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e82d>
     10a73b8:	48 8d 35 8a 44 2c ff 	lea    rsi,[rip+0xffffffffff2c448a]        # 36b849 <_ZTSSt12bad_any_cast@@Base-0x2497f>
     10a73bf:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a73c6:	00 
     10a73c7:	e8 b2 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a73cc:	49 8d be 98 16 00 00 	lea    rdi,[r14+0x1698]
     10a73d3:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a73da:	00 
     10a73db:	e8 b0 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a73e0:	eb 28                	jmp    10a740a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e820>
     10a73e2:	48 8d 35 82 2e 2a ff 	lea    rsi,[rip+0xffffffffff2a2e82]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a73e9:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a73f0:	00 
     10a73f1:	e8 88 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a73f6:	49 8d be 98 16 00 00 	lea    rdi,[r14+0x1698]
     10a73fd:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7404:	00 
     10a7405:	e8 86 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a740a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7411:	00 
     10a7412:	e8 79 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7417:	49 8b be 90 18 00 00 	mov    rdi,QWORD PTR [r14+0x1890]
     10a741e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a7421:	ff 50 18             	call   QWORD PTR [rax+0x18]
     10a7424:	84 c0                	test   al,al
     10a7426:	74 6a                	je     10a7492 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e8a8>
     10a7428:	48 8d 35 16 69 2c ff 	lea    rsi,[rip+0xffffffffff2c6916]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a742f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7436:	00 
     10a7437:	e8 42 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a743c:	49 8d be 00 15 00 00 	lea    rdi,[r14+0x1500]
     10a7443:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a744a:	00 
     10a744b:	e8 40 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7450:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7457:	00 
     10a7458:	e8 33 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a745d:	48 8d 35 e1 68 2c ff 	lea    rsi,[rip+0xffffffffff2c68e1]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a7464:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a746b:	00 
     10a746c:	e8 0d 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7471:	49 8d be 18 15 00 00 	lea    rdi,[r14+0x1518]
     10a7478:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a747f:	00 
     10a7480:	e8 0b 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7485:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a748c:	00 
     10a748d:	e8 fe 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7492:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7499:	00 
     10a749a:	0f 84 cc 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74a0:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
     10a74a7:	00 
     10a74a8:	0f 84 be 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74ae:	48 8d 35 90 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6890]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a74b5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74bc:	00 
     10a74bd:	e8 bc 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a74c2:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a74c9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a74d0:	00 
     10a74d1:	e8 ba 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a74d6:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74dd:	00 
     10a74de:	e8 ad 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a74e3:	48 8d 35 5b 68 2c ff 	lea    rsi,[rip+0xffffffffff2c685b]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a74ea:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74f1:	00 
     10a74f2:	e8 87 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a74f7:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
     10a74fe:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7505:	00 
     10a7506:	e8 85 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a750b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7512:	00 
     10a7513:	e8 78 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7518:	48 8d 35 26 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6826]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a751f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7526:	00 
     10a7527:	e8 52 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a752c:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a7533:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a753a:	00 
     10a753b:	e8 50 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7540:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7547:	00 
     10a7548:	e8 43 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a754d:	48 8d 35 f1 67 2c ff 	lea    rsi,[rip+0xffffffffff2c67f1]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a7554:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a755b:	00 
     10a755c:	e8 1d 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7561:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a7568:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a756f:	00 
     10a7570:	e8 1b 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7575:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a757c:	00 
     10a757d:	e8 0e 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7582:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a7589:	48 85 ff             	test   rdi,rdi
     10a758c:	74 0d                	je     10a759b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9b1>
     10a758e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a7591:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     10a7597:	84 c0                	test   al,al
     10a7599:	75 35                	jne    10a75d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9e6>
     10a759b:	48 8d 35 a3 67 2c ff 	lea    rsi,[rip+0xffffffffff2c67a3]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a75a2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75a9:	00 
     10a75aa:	e8 cf 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a75af:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a75b6:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a75bd:	00 
     10a75be:	e8 cd 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a75c3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75ca:	00 
     10a75cb:	e8 c0 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a75d0:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a75d7:	48 85 ff             	test   rdi,rdi
     10a75da:	74 0d                	je     10a75e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9ff>
     10a75dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a75df:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     10a75e5:	84 c0                	test   al,al
     10a75e7:	75 35                	jne    10a761e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea34>
     10a75e9:	48 8d 35 55 67 2c ff 	lea    rsi,[rip+0xffffffffff2c6755]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a75f0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75f7:	00 
     10a75f8:	e8 81 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a75fd:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a7604:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a760b:	00 
     10a760c:	e8 7f 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7611:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7618:	00 
     10a7619:	e8 72 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a761e:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a7625:	48 85 ff             	test   rdi,rdi
     10a7628:	74 0d                	je     10a7637 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea4d>
     10a762a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a762d:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     10a7633:	84 c0                	test   al,al
     10a7635:	75 35                	jne    10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a7637:	48 8d 35 07 67 2c ff 	lea    rsi,[rip+0xffffffffff2c6707]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a763e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7645:	00 
     10a7646:	e8 33 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a764b:	49 8d be a8 15 00 00 	lea    rdi,[r14+0x15a8]
     10a7652:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7659:	00 
     10a765a:	e8 31 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a765f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7666:	00 
     10a7667:	e8 24 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a766c:	41 80 be 78 18 00 00 	cmp    BYTE PTR [r14+0x1878],0x0
     10a7673:	00 
     10a7674:	74 72                	je     10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
     10a7676:	49 8d be 60 18 00 00 	lea    rdi,[r14+0x1860]
     10a767d:	48 8d 35 87 2e 2b ff 	lea    rsi,[rip+0xffffffffff2b2e87]        # 35a50b <_ZTSSt12bad_any_cast@@Base-0x35cbd>
     10a7684:	e8 c6 41 9d ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     10a7689:	84 c0                	test   al,al
     10a768b:	74 5b                	je     10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
     10a768d:	48 8d 35 66 1a 29 ff 	lea    rsi,[rip+0xffffffffff291a66]        # 3390fa <_ZTSSt12bad_any_cast@@Base-0x570ce>
     10a7694:	4c 89 ff             	mov    rdi,r15
     10a7697:	e8 b3 41 9d ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     10a769c:	84 c0                	test   al,al
     10a769e:	75 48                	jne    10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
     10a76a0:	48 8d 35 e6 bc 29 ff 	lea    rsi,[rip+0xffffffffff29bce6]        # 34338d <_ZTSSt12bad_any_cast@@Base-0x4ce3b>
     10a76a7:	4c 89 ff             	mov    rdi,r15
     10a76aa:	e8 c3 b0 a4 ff       	call   af2772 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f712>
     10a76af:	84 c0                	test   al,al
     10a76b1:	75 35                	jne    10a76e8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eafe>
     10a76b3:	48 8d 35 c2 e5 28 ff 	lea    rsi,[rip+0xffffffffff28e5c2]        # 335c7c <_ZTSSt12bad_any_cast@@Base-0x5a54c>
     10a76ba:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a76c1:	00 
     10a76c2:	e8 b7 23 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a76c7:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a76ce:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a76d5:	00 
     10a76d6:	e8 b5 63 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a76db:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a76e2:	00 
     10a76e3:	e8 a8 67 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a76e8:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a76ef:	49 8b b6 c0 10 00 00 	mov    rsi,QWORD PTR [r14+0x10c0]
     10a76f6:	49 8d 96 c8 10 00 00 	lea    rdx,[r14+0x10c8]
     10a76fd:	e8 d0 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7702:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a7709:	49 8b b6 d8 10 00 00 	mov    rsi,QWORD PTR [r14+0x10d8]
     10a7710:	49 8d 96 e0 10 00 00 	lea    rdx,[r14+0x10e0]
     10a7717:	e8 b6 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a771c:	49 8d be b8 14 00 00 	lea    rdi,[r14+0x14b8]
     10a7723:	49 8b b6 f0 10 00 00 	mov    rsi,QWORD PTR [r14+0x10f0]
     10a772a:	49 8d 96 f8 10 00 00 	lea    rdx,[r14+0x10f8]
     10a7731:	e8 9c 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7736:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a773d:	49 8b b6 08 11 00 00 	mov    rsi,QWORD PTR [r14+0x1108]
     10a7744:	49 8d 96 10 11 00 00 	lea    rdx,[r14+0x1110]
     10a774b:	e8 82 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7750:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a7757:	49 8b b6 20 11 00 00 	mov    rsi,QWORD PTR [r14+0x1120]
     10a775e:	49 8d 96 28 11 00 00 	lea    rdx,[r14+0x1128]
     10a7765:	e8 68 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a776a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a7771:	49 8b b6 68 11 00 00 	mov    rsi,QWORD PTR [r14+0x1168]
     10a7778:	49 8d 96 70 11 00 00 	lea    rdx,[r14+0x1170]
     10a777f:	e8 4e 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7784:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a778b:	49 8b b6 80 11 00 00 	mov    rsi,QWORD PTR [r14+0x1180]
     10a7792:	49 8d 96 88 11 00 00 	lea    rdx,[r14+0x1188]
     10a7799:	e8 34 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a779e:	49 8d be 60 15 00 00 	lea    rdi,[r14+0x1560]
     10a77a5:	49 8b b6 98 11 00 00 	mov    rsi,QWORD PTR [r14+0x1198]
     10a77ac:	49 8d 96 a0 11 00 00 	lea    rdx,[r14+0x11a0]
     10a77b3:	e8 1a 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a77b8:	49 8d be 78 15 00 00 	lea    rdi,[r14+0x1578]
     10a77bf:	49 8b b6 b0 11 00 00 	mov    rsi,QWORD PTR [r14+0x11b0]
     10a77c6:	49 8d 96 b8 11 00 00 	lea    rdx,[r14+0x11b8]
     10a77cd:	e8 00 22 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a77d2:	49 8d be 90 15 00 00 	lea    rdi,[r14+0x1590]
     10a77d9:	49 8b b6 c8 11 00 00 	mov    rsi,QWORD PTR [r14+0x11c8]
     10a77e0:	49 8d 96 d0 11 00 00 	lea    rdx,[r14+0x11d0]
     10a77e7:	e8 e6 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a77ec:	49 8d be a8 15 00 00 	lea    rdi,[r14+0x15a8]
     10a77f3:	49 8b b6 e0 11 00 00 	mov    rsi,QWORD PTR [r14+0x11e0]
     10a77fa:	49 8d 96 e8 11 00 00 	lea    rdx,[r14+0x11e8]
     10a7801:	e8 cc 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7806:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a780d:	49 8b b6 f8 11 00 00 	mov    rsi,QWORD PTR [r14+0x11f8]
     10a7814:	49 8d 96 00 12 00 00 	lea    rdx,[r14+0x1200]
     10a781b:	e8 b2 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7820:	49 8d be d8 15 00 00 	lea    rdi,[r14+0x15d8]
     10a7827:	49 8b b6 10 12 00 00 	mov    rsi,QWORD PTR [r14+0x1210]
     10a782e:	49 8d 96 18 12 00 00 	lea    rdx,[r14+0x1218]
     10a7835:	e8 98 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a783a:	49 8d be f0 15 00 00 	lea    rdi,[r14+0x15f0]
     10a7841:	49 8b b6 28 12 00 00 	mov    rsi,QWORD PTR [r14+0x1228]
     10a7848:	49 8d 96 30 12 00 00 	lea    rdx,[r14+0x1230]
     10a784f:	e8 7e 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7854:	49 8d be 08 16 00 00 	lea    rdi,[r14+0x1608]
     10a785b:	49 8b b6 40 12 00 00 	mov    rsi,QWORD PTR [r14+0x1240]
     10a7862:	49 8d 96 48 12 00 00 	lea    rdx,[r14+0x1248]
     10a7869:	e8 64 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a786e:	49 8d be 20 16 00 00 	lea    rdi,[r14+0x1620]
     10a7875:	49 8b b6 58 12 00 00 	mov    rsi,QWORD PTR [r14+0x1258]
     10a787c:	49 8d 96 60 12 00 00 	lea    rdx,[r14+0x1260]
     10a7883:	e8 4a 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7888:	49 8d be 38 16 00 00 	lea    rdi,[r14+0x1638]
     10a788f:	49 8b b6 70 12 00 00 	mov    rsi,QWORD PTR [r14+0x1270]
     10a7896:	49 8d 96 78 12 00 00 	lea    rdx,[r14+0x1278]
     10a789d:	e8 30 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a78a2:	49 8d be 50 16 00 00 	lea    rdi,[r14+0x1650]
     10a78a9:	49 8b b6 88 12 00 00 	mov    rsi,QWORD PTR [r14+0x1288]
     10a78b0:	49 8d 96 90 12 00 00 	lea    rdx,[r14+0x1290]
     10a78b7:	e8 16 21 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a78bc:	49 8d be 68 16 00 00 	lea    rdi,[r14+0x1668]
     10a78c3:	49 8b b6 a0 12 00 00 	mov    rsi,QWORD PTR [r14+0x12a0]
     10a78ca:	49 8d 96 a8 12 00 00 	lea    rdx,[r14+0x12a8]
     10a78d1:	e8 fc 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a78d6:	49 8d be 80 16 00 00 	lea    rdi,[r14+0x1680]
     10a78dd:	49 8b b6 b8 12 00 00 	mov    rsi,QWORD PTR [r14+0x12b8]
     10a78e4:	49 8d 96 c0 12 00 00 	lea    rdx,[r14+0x12c0]
     10a78eb:	e8 e2 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a78f0:	49 8d be 98 16 00 00 	lea    rdi,[r14+0x1698]
     10a78f7:	49 8b b6 d0 12 00 00 	mov    rsi,QWORD PTR [r14+0x12d0]
     10a78fe:	49 8d 96 d8 12 00 00 	lea    rdx,[r14+0x12d8]
     10a7905:	e8 c8 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a790a:	49 8d be 58 17 00 00 	lea    rdi,[r14+0x1758]
     10a7911:	49 8b b6 90 13 00 00 	mov    rsi,QWORD PTR [r14+0x1390]
     10a7918:	49 8d 96 98 13 00 00 	lea    rdx,[r14+0x1398]
     10a791f:	e8 ae 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7924:	49 8d be c8 16 00 00 	lea    rdi,[r14+0x16c8]
     10a792b:	49 8b b6 00 13 00 00 	mov    rsi,QWORD PTR [r14+0x1300]
     10a7932:	49 8d 96 08 13 00 00 	lea    rdx,[r14+0x1308]
     10a7939:	e8 94 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a793e:	49 8d be e0 16 00 00 	lea    rdi,[r14+0x16e0]
     10a7945:	49 8b b6 18 13 00 00 	mov    rsi,QWORD PTR [r14+0x1318]
     10a794c:	49 8d 96 20 13 00 00 	lea    rdx,[r14+0x1320]
     10a7953:	e8 7a 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7958:	49 8d be f8 16 00 00 	lea    rdi,[r14+0x16f8]
     10a795f:	49 8b b6 30 13 00 00 	mov    rsi,QWORD PTR [r14+0x1330]
     10a7966:	49 8d 96 38 13 00 00 	lea    rdx,[r14+0x1338]
     10a796d:	e8 60 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7972:	49 8d be 10 17 00 00 	lea    rdi,[r14+0x1710]
     10a7979:	49 8b b6 48 13 00 00 	mov    rsi,QWORD PTR [r14+0x1348]
     10a7980:	49 8d 96 50 13 00 00 	lea    rdx,[r14+0x1350]
     10a7987:	e8 46 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a798c:	49 8d be 28 17 00 00 	lea    rdi,[r14+0x1728]
     10a7993:	49 8b b6 60 13 00 00 	mov    rsi,QWORD PTR [r14+0x1360]
     10a799a:	49 8d 96 68 13 00 00 	lea    rdx,[r14+0x1368]
     10a79a1:	e8 2c 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a79a6:	49 8d be 40 17 00 00 	lea    rdi,[r14+0x1740]
     10a79ad:	49 8b b6 78 13 00 00 	mov    rsi,QWORD PTR [r14+0x1378]
     10a79b4:	49 8d 96 80 13 00 00 	lea    rdx,[r14+0x1380]
     10a79bb:	e8 12 20 aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a79c0:	49 8d be 70 17 00 00 	lea    rdi,[r14+0x1770]
     10a79c7:	49 8b b6 a8 13 00 00 	mov    rsi,QWORD PTR [r14+0x13a8]
     10a79ce:	49 8d 96 b0 13 00 00 	lea    rdx,[r14+0x13b0]
     10a79d5:	e8 f8 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a79da:	49 8d be 00 15 00 00 	lea    rdi,[r14+0x1500]
     10a79e1:	49 8b b6 38 11 00 00 	mov    rsi,QWORD PTR [r14+0x1138]
     10a79e8:	49 8d 96 40 11 00 00 	lea    rdx,[r14+0x1140]
     10a79ef:	e8 de 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a79f4:	49 8d be 18 15 00 00 	lea    rdi,[r14+0x1518]
     10a79fb:	49 8b b6 50 11 00 00 	mov    rsi,QWORD PTR [r14+0x1150]
     10a7a02:	49 8d 96 58 11 00 00 	lea    rdx,[r14+0x1158]
     10a7a09:	e8 c4 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7a0e:	4d 8d a6 d8 17 00 00 	lea    r12,[r14+0x17d8]
     10a7a15:	49 8b b6 10 14 00 00 	mov    rsi,QWORD PTR [r14+0x1410]
     10a7a1c:	49 8d 96 18 14 00 00 	lea    rdx,[r14+0x1418]
     10a7a23:	4c 89 e7             	mov    rdi,r12
     10a7a26:	e8 a7 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7a2b:	49 8d be f0 17 00 00 	lea    rdi,[r14+0x17f0]
     10a7a32:	49 8b b6 28 14 00 00 	mov    rsi,QWORD PTR [r14+0x1428]
     10a7a39:	49 8d 96 30 14 00 00 	lea    rdx,[r14+0x1430]
     10a7a40:	e8 8d 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7a45:	49 8d be 08 18 00 00 	lea    rdi,[r14+0x1808]
     10a7a4c:	49 8b b6 40 14 00 00 	mov    rsi,QWORD PTR [r14+0x1440]
     10a7a53:	49 8d 96 48 14 00 00 	lea    rdx,[r14+0x1448]
     10a7a5a:	e8 73 1f aa ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     10a7a5f:	4d 8b ae d0 13 00 00 	mov    r13,QWORD PTR [r14+0x13d0]
     10a7a66:	4d 85 ed             	test   r13,r13
     10a7a69:	74 1c                	je     10a7a87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ee9d>
     10a7a6b:	4d 8d be 88 17 00 00 	lea    r15,[r14+0x1788]
     10a7a72:	49 8d 75 10          	lea    rsi,[r13+0x10]
     10a7a76:	4c 89 ff             	mov    rdi,r15
     10a7a79:	e8 6e dc c4 ff       	call   cf56ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24268c>
     10a7a7e:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     10a7a82:	4d 85 ed             	test   r13,r13
     10a7a85:	75 eb                	jne    10a7a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ee88>
     10a7a87:	4d 8d be b0 17 00 00 	lea    r15,[r14+0x17b0]
     10a7a8e:	4d 8b ae f8 13 00 00 	mov    r13,QWORD PTR [r14+0x13f8]
     10a7a95:	4d 85 ed             	test   r13,r13
     10a7a98:	74 12                	je     10a7aac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eec2>
     10a7a9a:	49 8d 75 10          	lea    rsi,[r13+0x10]
     10a7a9e:	4c 89 ff             	mov    rdi,r15
     10a7aa1:	e8 1c d9 c4 ff       	call   cf53c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x242362>
     10a7aa6:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     10a7aaa:	eb e9                	jmp    10a7a95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eeab>
     10a7aac:	41 80 be 30 18 00 00 	cmp    BYTE PTR [r14+0x1830],0x0
     10a7ab3:	00 
     10a7ab4:	75 31                	jne    10a7ae7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26eefd>
     10a7ab6:	48 8d 35 ad ac 28 ff 	lea    rsi,[rip+0xffffffffff28acad]        # 33276a <_ZTSSt12bad_any_cast@@Base-0x5da5e>
     10a7abd:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7ac4:	00 
     10a7ac5:	e8 b4 1f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7aca:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7ad1:	00 
     10a7ad2:	4c 89 e7             	mov    rdi,r12
     10a7ad5:	e8 b6 5f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7ada:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7ae1:	00 
     10a7ae2:	e8 a9 63 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7ae7:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7aee:	00 
     10a7aef:	0f 84 a4 01 00 00    	je     10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
     10a7af5:	49 8b b6 98 00 00 00 	mov    rsi,QWORD PTR [r14+0x98]
     10a7afc:	41 8b be 90 00 00 00 	mov    edi,DWORD PTR [r14+0x90]
     10a7b03:	e8 18 3d 9d ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     10a7b08:	84 c0                	test   al,al
     10a7b0a:	0f 85 89 01 00 00    	jne    10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
     10a7b10:	4d 8d ae 90 00 00 00 	lea    r13,[r14+0x90]
     10a7b17:	4c 89 ef             	mov    rdi,r13
     10a7b1a:	e8 c3 36 4b 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>
     10a7b1f:	84 c0                	test   al,al
     10a7b21:	0f 84 72 01 00 00    	je     10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
     10a7b27:	4d 8b 66 28          	mov    r12,QWORD PTR [r14+0x28]
     10a7b2b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7b32:	00 
     10a7b33:	4c 89 ee             	mov    rsi,r13
     10a7b36:	e8 05 64 74 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10a7b3b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7b40:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     10a7b47:	00 
     10a7b48:	6a 01                	push   0x1
     10a7b4a:	5a                   	pop    rdx
     10a7b4b:	e8 08 f9 9f ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     10a7b50:	48 8d 35 cc b1 29 ff 	lea    rsi,[rip+0xffffffffff29b1cc]        # 342d23 <_ZTSSt12bad_any_cast@@Base-0x4d4a5>
     10a7b57:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7b5c:	e8 1d 1f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7b61:	4d 8d 4e 30          	lea    r9,[r14+0x30]
     10a7b65:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     10a7b69:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7b70:	00 
     10a7b71:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
     10a7b76:	6a 20                	push   0x20
     10a7b78:	59                   	pop    rcx
     10a7b79:	4c 8d 44 24 60       	lea    r8,[rsp+0x60]
     10a7b7e:	4c 89 e6             	mov    rsi,r12
     10a7b81:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
     10a7b87:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7b8c:	e8 ff 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7b91:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7b96:	e8 4d 3a 9d ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     10a7b9b:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7ba2:	00 
     10a7ba3:	e8 e8 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7ba8:	4c 8b a4 24 40 04 00 	mov    r12,QWORD PTR [rsp+0x440]
     10a7baf:	00 
     10a7bb0:	4c 3b a4 24 48 04 00 	cmp    r12,QWORD PTR [rsp+0x448]
     10a7bb7:	00 
     10a7bb8:	0f 84 ce 00 00 00    	je     10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
     10a7bbe:	41 80 7c 24 15 00    	cmp    BYTE PTR [r12+0x15],0x0
     10a7bc4:	0f 84 c2 00 00 00    	je     10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
     10a7bca:	41 8b 44 24 18       	mov    eax,DWORD PTR [r12+0x18]
     10a7bcf:	83 f8 02             	cmp    eax,0x2
     10a7bd2:	74 50                	je     10a7c24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f03a>
     10a7bd4:	83 f8 01             	cmp    eax,0x1
     10a7bd7:	0f 85 af 00 00 00    	jne    10a7c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0a2>
     10a7bdd:	48 8d 35 5e fb 2d ff 	lea    rsi,[rip+0xffffffffff2dfb5e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
     10a7be4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7be9:	e8 90 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7bee:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7bf3:	4c 89 ff             	mov    rdi,r15
     10a7bf6:	e8 91 f9 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
     10a7bfb:	49 89 c7             	mov    r15,rax
     10a7bfe:	48 8d 35 13 a0 3a ff 	lea    rsi,[rip+0xffffffffff3aa013]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     10a7c05:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7c0c:	00 
     10a7c0d:	e8 6c 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7c12:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     10a7c19:	00 
     10a7c1a:	4c 89 ff             	mov    rdi,r15
     10a7c1d:	e8 6e 5e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7c22:	eb 51                	jmp    10a7c75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f08b>
     10a7c24:	41 80 7c 24 40 00    	cmp    BYTE PTR [r12+0x40],0x0
     10a7c2a:	0f 84 5a 01 00 00    	je     10a7d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f1a0>
     10a7c30:	48 8d 35 0b fb 2d ff 	lea    rsi,[rip+0xffffffffff2dfb0b]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
     10a7c37:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7c3c:	e8 3d 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7c41:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7c46:	4c 89 ff             	mov    rdi,r15
     10a7c49:	e8 3e f9 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
     10a7c4e:	49 89 c7             	mov    r15,rax
     10a7c51:	48 8d 35 98 2e 2b ff 	lea    rsi,[rip+0xffffffffff2b2e98]        # 35aaf0 <_ZTSSt12bad_any_cast@@Base-0x356d8>
     10a7c58:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7c5f:	00 
     10a7c60:	e8 19 1e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7c65:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     10a7c6c:	00 
     10a7c6d:	4c 89 ff             	mov    rdi,r15
     10a7c70:	e8 1b 5e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7c75:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7c7c:	00 
     10a7c7d:	e8 0e 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7c82:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7c87:	e8 04 62 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7c8c:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7c93:	00 
     10a7c94:	e8 71 29 e7 ff       	call   f1a60a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe1a20>
     10a7c99:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     10a7c9e:	48 89 df             	mov    rdi,rbx
     10a7ca1:	e8 3c 05 00 00       	call   10a81e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f5f8>
     10a7ca6:	84 c0                	test   al,al
     10a7ca8:	0f 85 a9 00 00 00    	jne    10a7d57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f16d>
     10a7cae:	49 81 c6 38 10 00 00 	add    r14,0x1038
     10a7cb5:	40 88 2c 24          	mov    BYTE PTR [rsp],bpl
     10a7cb9:	0f 57 c0             	xorps  xmm0,xmm0
     10a7cbc:	48 8d 94 24 10 08 00 	lea    rdx,[rsp+0x810]
     10a7cc3:	00 
     10a7cc4:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     10a7cc7:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     10a7ccc:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7cd1:	4c 89 f6             	mov    rsi,r14
     10a7cd4:	e8 31 27 73 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
     10a7cd9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a7cde:	48 89 1e             	mov    QWORD PTR [rsi],rbx
     10a7ce1:	48 89 e0             	mov    rax,rsp
     10a7ce4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a7ce8:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
     10a7ced:	48 8b 5c 24 68       	mov    rbx,QWORD PTR [rsp+0x68]
     10a7cf2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7cf9:	00 
     10a7cfa:	48 89 d9             	mov    rcx,rbx
     10a7cfd:	e8 ca 09 00 00       	call   10a86cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fae2>
     10a7d02:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7d07:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a7d0c:	48 89 da             	mov    rdx,rbx
     10a7d0f:	48 89 d9             	mov    rcx,rbx
     10a7d12:	e8 b5 09 00 00       	call   10a86cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fae2>
     10a7d17:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7d1e:	00 
     10a7d1f:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7d24:	e8 93 4d a1 ff       	call   abcabc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a5c>
     10a7d29:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     10a7d2e:	e8 53 67 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7d33:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
     10a7d3a:	00 
     10a7d3b:	e8 46 67 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7d40:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7d45:	e8 1a 4e a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7d4a:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7d51:	00 
     10a7d52:	e8 0d 4e a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7d57:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     10a7d5c:	e8 a3 d2 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
     10a7d61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a7d68:	00 00 
     10a7d6a:	48 3b 84 24 30 08 00 	cmp    rax,QWORD PTR [rsp+0x830]
     10a7d71:	00 
     10a7d72:	0f 85 be 00 00 00    	jne    10a7e36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f24c>
     10a7d78:	48 81 c4 38 08 00 00 	add    rsp,0x838
     10a7d7f:	5b                   	pop    rbx
     10a7d80:	41 5c                	pop    r12
     10a7d82:	41 5d                	pop    r13
     10a7d84:	41 5e                	pop    r14
     10a7d86:	41 5f                	pop    r15
     10a7d88:	5d                   	pop    rbp
     10a7d89:	c3                   	ret
     10a7d8a:	48 8d 35 b1 f9 2d ff 	lea    rsi,[rip+0xffffffffff2df9b1]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
     10a7d91:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7d96:	e8 e3 1c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7d9b:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a7da0:	4c 89 ff             	mov    rdi,r15
     10a7da3:	e8 e4 f7 e4 ff       	call   ef758c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe9a2>
     10a7da8:	49 89 c7             	mov    r15,rax
     10a7dab:	48 8d 35 cc 3c 2d ff 	lea    rsi,[rip+0xffffffffff2d3ccc]        # 37ba7e <_ZTSSt12bad_any_cast@@Base-0x1474a>
     10a7db2:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a7db7:	e8 c2 1c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7dbc:	48 8d 15 e4 33 2b ff 	lea    rdx,[rip+0xffffffffff2b33e4]        # 35b1a7 <_ZTSSt12bad_any_cast@@Base-0x35021>
     10a7dc3:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7dc8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a7dcd:	e8 6b 36 9f ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
     10a7dd2:	49 83 c4 20          	add    r12,0x20
     10a7dd6:	48 8d 15 9f a1 3a ff 	lea    rdx,[rip+0xffffffffff3aa19f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     10a7ddd:	48 89 e7             	mov    rdi,rsp
     10a7de0:	4c 89 e6             	mov    rsi,r12
     10a7de3:	e8 24 d7 a2 ff       	call   ad550c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224ac>
     10a7de8:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7def:	00 
     10a7df0:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     10a7df5:	48 89 e2             	mov    rdx,rsp
     10a7df8:	e8 93 e3 a0 ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
     10a7dfd:	48 8d b4 24 10 08 00 	lea    rsi,[rsp+0x810]
     10a7e04:	00 
     10a7e05:	4c 89 ff             	mov    rdi,r15
     10a7e08:	e8 83 5c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7e0d:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7e14:	00 
     10a7e15:	e8 76 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e1a:	48 89 e7             	mov    rdi,rsp
     10a7e1d:	e8 6e 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e22:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7e27:	e8 64 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e2c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a7e31:	e9 47 fe ff ff       	jmp    10a7c7d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f093>
     10a7e36:	e8 75 7c 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a7e3b:	e9 0a 01 00 00       	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7e40:	e9 cd 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7e45:	e9 d7 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7e4a:	e9 c3 00 00 00       	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7e4f:	e9 cd 00 00 00       	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7e54:	eb 06                	jmp    10a7e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f272>
     10a7e56:	eb 13                	jmp    10a7e6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f281>
     10a7e58:	eb 02                	jmp    10a7e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f272>
     10a7e5a:	eb 0f                	jmp    10a7e6b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f281>
     10a7e5c:	48 89 c3             	mov    rbx,rax
     10a7e5f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7e64:	e8 27 60 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7e69:	eb 03                	jmp    10a7e6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f284>
     10a7e6b:	48 89 c3             	mov    rbx,rax
     10a7e6e:	48 8d bc 24 48 04 00 	lea    rdi,[rsp+0x448]
     10a7e75:	00 
     10a7e76:	e8 77 7c e2 ff       	call   ecfaf2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96f08>
     10a7e7b:	e9 be 00 00 00       	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7e80:	eb 7a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e82:	eb 78                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e84:	eb 76                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e86:	eb 74                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e88:	eb 72                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8a:	eb 70                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8c:	eb 6e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e8e:	eb 6c                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e90:	eb 6a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e92:	eb 68                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e94:	eb 66                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e96:	eb 64                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e98:	eb 62                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9a:	eb 60                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9c:	eb 5e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7e9e:	eb 72                	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7ea0:	eb 7f                	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7ea2:	48 89 c3             	mov    rbx,rax
     10a7ea5:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     10a7eaa:	e8 d7 65 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7eaf:	eb 03                	jmp    10a7eb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2ca>
     10a7eb1:	48 89 c3             	mov    rbx,rax
     10a7eb4:	48 8b bc 24 58 04 00 	mov    rdi,QWORD PTR [rsp+0x458]
     10a7ebb:	00 
     10a7ebc:	e8 c5 65 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a7ec1:	eb 03                	jmp    10a7ec6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2dc>
     10a7ec3:	48 89 c3             	mov    rbx,rax
     10a7ec6:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     10a7ecb:	e8 94 4c a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7ed0:	eb 03                	jmp    10a7ed5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f2eb>
     10a7ed2:	48 89 c3             	mov    rbx,rax
     10a7ed5:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]
     10a7edc:	00 
     10a7edd:	e8 82 4c a1 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     10a7ee2:	eb 5a                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7ee4:	eb 16                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ee6:	eb 14                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ee8:	eb 12                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eea:	eb 10                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eec:	eb 0e                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7eee:	eb 0c                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef0:	eb 0a                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef2:	eb 08                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef4:	eb 06                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef6:	eb 04                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7ef8:	eb 02                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7efa:	eb 00                	jmp    10a7efc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f312>
     10a7efc:	48 89 c3             	mov    rbx,rax
     10a7eff:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7f06:	00 
     10a7f07:	e8 84 5f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7f0c:	eb 30                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7f0e:	eb 02                	jmp    10a7f12 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f328>
     10a7f10:	eb 0f                	jmp    10a7f21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f337>
     10a7f12:	48 89 c3             	mov    rbx,rax
     10a7f15:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a7f1a:	e8 71 5f 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7f1f:	eb 03                	jmp    10a7f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f33a>
     10a7f21:	48 89 c3             	mov    rbx,rax
     10a7f24:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7f2b:	00 
     10a7f2c:	e8 fd d3 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a7f31:	eb 0b                	jmp    10a7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f354>
     10a7f33:	eb 15                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f35:	eb 13                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f37:	eb 02                	jmp    10a7f3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f351>
     10a7f39:	eb 0f                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f3b:	48 89 c3             	mov    rbx,rax
     10a7f3e:	48 89 df             	mov    rdi,rbx
     10a7f41:	e8 5f 1b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a7f46:	eb 02                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f48:	eb 00                	jmp    10a7f4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f360>
     10a7f4a:	48 89 c7             	mov    rdi,rax
     10a7f4d:	e8 53 1b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## One-level callees of owner+0x38 initializer

### callee 0x1088fd0, FDE 0x1088fd0..0x108903f
Large-offset accesses:
- 0x1088fe3: mov    BYTE PTR [rdi+0x560],al

### callee 0x10a87cc, FDE 0x10a87cc..0x10a8812

## Address-taking / direct access to owner gates in 0x10a5000..0x10aa500

### 0x10a6574 in (17458276, 17465170)
     10a6556:	48 8d 84 24 68 05 00 	lea    rax,[rsp+0x568]
     10a655d:	00 
     10a655e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6561:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6565:	48 8d 84 24 80 05 00 	lea    rax,[rsp+0x580]
     10a656c:	00 
     10a656d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a6570:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6574:	48 8d 84 24 98 05 00 	lea    rax,[rsp+0x598]
     10a657b:	00 
     10a657c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a657f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6583:	48 8d 84 24 b0 05 00 	lea    rax,[rsp+0x5b0]
     10a658a:	00 
     10a658b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a658e:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a6592:	48 8d 84 24 c8 05 00 	lea    rax,[rsp+0x5c8]
     10a6599:	00 
     10a659a:	0f 11 00             	movups XMMWORD PTR [rax],xmm0

### 0x10a67ca in (17458276, 17465170)
     10a67a9:	00 
     10a67aa:	e8 e1 72 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a67af:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a67b6:	00 
     10a67b7:	e8 d4 76 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a67bc:	41 80 be 58 18 00 00 	cmp    BYTE PTR [r14+0x1858],0x0
     10a67c3:	00 
     10a67c4:	0f 85 de 03 00 00    	jne    10a6ba8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfbe>
     10a67ca:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a67d1:	00 
     10a67d2:	74 64                	je     10a6838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dc4e>
     10a67d4:	4c 8d bc 24 40 04 00 	lea    r15,[rsp+0x440]
     10a67db:	00 
     10a67dc:	41 83 67 38 00       	and    DWORD PTR [r15+0x38],0x0
     10a67e1:	0f 57 c0             	xorps  xmm0,xmm0
     10a67e4:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     10a67e8:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     10a67ed:	41 0f 29 47 20       	movaps XMMWORD PTR [r15+0x20],xmm0
     10a67f2:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]

### 0x10a6ba8 in (17458276, 17465170)
     10a6b82:	e8 f7 2e 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6b87:	49 8d be 90 15 00 00 	lea    rdi,[r14+0x1590]
     10a6b8e:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6b95:	00 
     10a6b96:	e8 f5 6e d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6b9b:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6ba2:	00 
     10a6ba3:	e8 e8 72 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6ba8:	45 8a be 98 05 00 00 	mov    r15b,BYTE PTR [r14+0x598]
     10a6baf:	45 84 ff             	test   r15b,r15b
     10a6bb2:	74 19                	je     10a6bcd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfe3>
     10a6bb4:	49 8b 86 b8 05 00 00 	mov    rax,QWORD PTR [r14+0x5b8]
     10a6bbb:	49 3b 86 c0 05 00 00 	cmp    rax,QWORD PTR [r14+0x5c0]
     10a6bc2:	75 43                	jne    10a6c07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e01d>
     10a6bc4:	48 8d 35 1f a4 2d ff 	lea    rsi,[rip+0xffffffffff2da41f]        # 380fea <_ZTSSt12bad_any_cast@@Base-0xf1de>
     10a6bcb:	eb 07                	jmp    10a6bd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dfea>
     10a6bcd:	48 8d 35 97 36 2a ff 	lea    rsi,[rip+0xffffffffff2a3697]        # 34a26b <_ZTSSt12bad_any_cast@@Base-0x45f5d>
     10a6bd4:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6bdb:	00 

### 0x10a6dc2 in (17458276, 17465170)
     10a6d9a:	49 8d be 30 15 00 00 	lea    rdi,[r14+0x1530]
     10a6da1:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a6da6:	e8 e5 6c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a6dab:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a6db0:	e8 db 70 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6db5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6dbc:	00 
     10a6dbd:	e8 6c e5 61 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a6dc2:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a6dc9:	00 
     10a6dca:	0f 84 f0 00 00 00    	je     10a6ec0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e2d6>
     10a6dd0:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a6dd7:	00 
     10a6dd8:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     10a6dde:	0f 57 c0             	xorps  xmm0,xmm0
     10a6de1:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     10a6de6:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
     10a6dec:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
     10a6df2:	49 8d be 90 00 00 00 	lea    rdi,[r14+0x90]

### 0x10a703a in (17458276, 17465170)
     10a7014:	49 8d be 48 15 00 00 	lea    rdi,[r14+0x1548]
     10a701b:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7022:	00 
     10a7023:	e8 68 6a d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7028:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a702f:	00 
     10a7030:	e8 5b 6e 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7035:	e9 cf 00 00 00       	jmp    10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a703a:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7041:	00 
     10a7042:	0f 84 c1 00 00 00    	je     10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a7048:	41 80 be 88 05 00 00 	cmp    BYTE PTR [r14+0x588],0x0
     10a704f:	00 
     10a7050:	0f 84 b3 00 00 00    	je     10a7109 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e51f>
     10a7056:	49 8d b6 78 04 00 00 	lea    rsi,[r14+0x478]
     10a705d:	4c 8d a4 24 40 04 00 	lea    r12,[rsp+0x440]
     10a7064:	00 
     10a7065:	4c 89 e7             	mov    rdi,r12
     10a7068:	e8 fc 1c 3e 00       	call   1488d69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce2ed>

### 0x10a731c in (17458276, 17465170)
     10a72f6:	e8 83 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a72fb:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a7302:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7309:	00 
     10a730a:	e8 81 67 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a730f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7316:	00 
     10a7317:	e8 74 6b 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a731c:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7323:	00 
     10a7324:	74 7e                	je     10a73a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7ba>
     10a7326:	41 80 be 94 05 00 00 	cmp    BYTE PTR [r14+0x594],0x0
     10a732d:	00 
     10a732e:	74 74                	je     10a73a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7ba>
     10a7330:	48 8d 35 9e 09 2c ff 	lea    rsi,[rip+0xffffffffff2c099e]        # 367cd5 <_ZTSSt12bad_any_cast@@Base-0x284f3>
     10a7337:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a733e:	00 
     10a733f:	e8 3a 27 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7344:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]

### 0x10a73a4 in (17458276, 17465170)
     10a737e:	e8 fb 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7383:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a738a:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7391:	00 
     10a7392:	e8 f9 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7397:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a739e:	00 
     10a739f:	e8 ec 6a 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a73a4:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a73ab:	00 
     10a73ac:	74 34                	je     10a73e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e7f8>
     10a73ae:	41 80 be 97 05 00 00 	cmp    BYTE PTR [r14+0x597],0x0
     10a73b5:	00 
     10a73b6:	75 5f                	jne    10a7417 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e82d>
     10a73b8:	48 8d 35 8a 44 2c ff 	lea    rsi,[rip+0xffffffffff2c448a]        # 36b849 <_ZTSSt12bad_any_cast@@Base-0x2497f>
     10a73bf:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a73c6:	00 
     10a73c7:	e8 b2 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a73cc:	49 8d be 98 16 00 00 	lea    rdi,[r14+0x1698]

### 0x10a7492 in (17458276, 17465170)
     10a746c:	e8 0d 26 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7471:	49 8d be 18 15 00 00 	lea    rdi,[r14+0x1518]
     10a7478:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a747f:	00 
     10a7480:	e8 0b 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7485:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a748c:	00 
     10a748d:	e8 fe 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7492:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7499:	00 
     10a749a:	0f 84 cc 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74a0:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
     10a74a7:	00 
     10a74a8:	0f 84 be 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74ae:	48 8d 35 90 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6890]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a74b5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74bc:	00 
     10a74bd:	e8 bc 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a74c2:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]

### 0x10a74a0 in (17458276, 17465170)
     10a747f:	00 
     10a7480:	e8 0b 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7485:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a748c:	00 
     10a748d:	e8 fe 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7492:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7499:	00 
     10a749a:	0f 84 cc 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74a0:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
     10a74a7:	00 
     10a74a8:	0f 84 be 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74ae:	48 8d 35 90 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6890]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a74b5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74bc:	00 
     10a74bd:	e8 bc 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a74c2:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a74c9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a74d0:	00 
     10a74d1:	e8 ba 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>

### 0x10a7ae7 in (17458276, 17465170)
     10a7ac5:	e8 b4 1f 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7aca:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7ad1:	00 
     10a7ad2:	4c 89 e7             	mov    rdi,r12
     10a7ad5:	e8 b6 5f d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7ada:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7ae1:	00 
     10a7ae2:	e8 a9 63 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7ae7:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7aee:	00 
     10a7aef:	0f 84 a4 01 00 00    	je     10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
     10a7af5:	49 8b b6 98 00 00 00 	mov    rsi,QWORD PTR [r14+0x98]
     10a7afc:	41 8b be 90 00 00 00 	mov    edi,DWORD PTR [r14+0x90]
     10a7b03:	e8 18 3d 9d ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     10a7b08:	84 c0                	test   al,al
     10a7b0a:	0f 85 89 01 00 00    	jne    10a7c99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26f0af>
     10a7b10:	4d 8d ae 90 00 00 00 	lea    r13,[r14+0x90]
     10a7b17:	4c 89 ef             	mov    rdi,r13
     10a7b1a:	e8 c3 36 4b 00       	call   155b1e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0766>

### 0x10a8e12 in (17468852, 17469101)
     10a8df3:	e9 8b 00 00 00       	jmp    10a8e83 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270299>
     10a8df8:	49 8d be e8 05 00 00 	lea    rdi,[r14+0x5e8]
     10a8dff:	4c 89 fe             	mov    rsi,r15
     10a8e02:	e8 e7 68 9f ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     10a8e07:	84 c0                	test   al,al
     10a8e09:	74 da                	je     10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e0b:	41 80 7e 38 00       	cmp    BYTE PTR [r14+0x38],0x0
     10a8e10:	75 d3                	jne    10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e12:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a8e19:	00 
     10a8e1a:	74 c9                	je     10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e1c:	48 8d 44 24 38       	lea    rax,[rsp+0x38]
     10a8e21:	0f 57 c0             	xorps  xmm0,xmm0
     10a8e24:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a8e27:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a8e2b:	48 8d 35 74 30 28 ff 	lea    rsi,[rip+0xffffffffff283074]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a8e32:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a8e37:	e8 42 0c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a8e3c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### 0x10a966e in (17471080, 17471132)
     10a9659:	48 83 c4 50          	add    rsp,0x50
     10a965d:	5b                   	pop    rbx
     10a965e:	41 5e                	pop    r14
     10a9660:	41 5f                	pop    r15
     10a9662:	c3                   	ret
     10a9663:	e8 48 64 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>

### 0x10a9677 in (17471080, 17471132)
     10a965e:	41 5e                	pop    r14
     10a9660:	41 5f                	pop    r15
     10a9662:	c3                   	ret
     10a9663:	e8 48 64 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8

## Resolved string at 0x32bea6

'mft_disallow'
