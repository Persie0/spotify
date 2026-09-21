# Service184 +0x28 nullable dependency validation

Ground truth:
- b8f02e returns exact registry table[184]
- its virtual +0x28 return is stored as a long-lived pointer
- Skip Ad later invokes that returned pointer polymorphically at virtual +0x68

## Exact b8f02e -> +0x28 callsites: 3
### 1. accessor@0xb8ec45 -> +0x28@0xb8ec50; FDE=(12119050, 12120109)
      b8ec21:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
      b8ec26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ec2d:	00 00 
      b8ec2f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      b8ec36:	00 
      b8ec37:	48 89 cf             	mov    rdi,rcx
      b8ec3a:	e8 03 93 ff ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
      b8ec3f:	48 89 c3             	mov    rbx,rax
      b8ec42:	4c 89 f7             	mov    rdi,r14
      b8ec45:	e8 e4 03 00 00       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      b8ec4a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8ec4d:	48 89 c7             	mov    rdi,rax
      b8ec50:	ff 51 28             	call   QWORD PTR [rcx+0x28]
      b8ec53:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b8ec58:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      b8ec5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b8ec60:	49 8b 6f 60          	mov    rbp,QWORD PTR [r15+0x60]
      b8ec64:	4d 8b af 80 00 00 00 	mov    r13,QWORD PTR [r15+0x80]
      b8ec6b:	4d 8b 77 68          	mov    r14,QWORD PTR [r15+0x68]
      b8ec6f:	48 8d 35 8a 91 7a ff 	lea    rsi,[rip+0xffffffffff7a918a]        # 337e00 <_ZTSSt12bad_any_cast@@Base-0x583c8>
      b8ec76:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      b8ec7b:	4c 89 ff             	mov    rdi,r15
      b8ec7e:	e8 fb ad ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b8ec83:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b8ec86:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      b8ec8b:	4c 89 f6             	mov    rsi,r14
      b8ec8e:	4c 89 fa             	mov    rdx,r15
      b8ec91:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8ec94:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8ec97:	48 89 df             	mov    rdi,rbx
      b8ec9a:	ff 50 40             	call   QWORD PTR [rax+0x40]
      b8ec9d:	49 89 c7             	mov    r15,rax
      b8eca0:	6a 18                	push   0x18

- vptr-deref @0xb8ef02: mov    rdi,QWORD PTR [rax]
- tracked stack slots: ['0x10', '0x18', '0x28', '0x38']

### 2. accessor@0xe8c9d1 -> +0x28@0xe8c9fb; FDE=(15255132, 15263896)
      e8c9ce:	4c 89 ef             	mov    rdi,r13
      e8c9d1:	e8 58 26 d0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
      e8c9d6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      e8c9d9:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
      e8c9e0:	00 
      e8c9e1:	48 89 c6             	mov    rsi,rax
      e8c9e4:	ff 51 38             	call   QWORD PTR [rcx+0x38]
      e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      e8c9ec:	48 8b 75 58          	mov    rsi,QWORD PTR [rbp+0x58]
      e8c9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e8c9f3:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
      e8c9fa:	00 
      e8c9fb:	ff 50 28             	call   QWORD PTR [rax+0x28]
      e8c9fe:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
      e8ca02:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
      e8ca09:	00 
      e8ca0a:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
      e8ca0e:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e8ca13:	48 8b 45 68          	mov    rax,QWORD PTR [rbp+0x68]
      e8ca17:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
      e8ca1c:	48 8b 45 60          	mov    rax,QWORD PTR [rbp+0x60]
      e8ca20:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
      e8ca27:	00 
      e8ca28:	f3 0f 6f 85 d8 00 00 	movdqu xmm0,XMMWORD PTR [rbp+0xd8]
      e8ca2f:	00 
      e8ca30:	48 8b bd e0 00 00 00 	mov    rdi,QWORD PTR [rbp+0xe0]
      e8ca37:	48 85 ff             	test   rdi,rdi
      e8ca3a:	74 0a                	je     e8ca46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53e5c>
      e8ca3c:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      e8ca41:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      e8ca46:	48 8d 05 23 48 9a 00 	lea    rax,[rip+0x9a4823]        # 1831270 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3208>
      e8ca4d:	48 8d 8c 24 80 05 00 	lea    rcx,[rsp+0x580]
      e8ca54:	00 

- null-test @0xe8cb35: test   rax,rax
- vptr-deref @0xe8cb76: mov    rcx,QWORD PTR [rax]
- null-test @0xe8cd11: test   rax,rax
- tracked stack slots: ['0x60', '0x70', '0xa0', '0xc8', '0xd0', '0xd8', '0xe0', '0xe8', '0xf0', '0x170', '0x178', '0x188', '0x190', '0x198', '0x2e0']

### 3. accessor@0x10885e3 -> +0x28@0x10885ee; FDE=(17335610, 17338257)
     10885c6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10885c9:	48 89 c7             	mov    rdi,rax
     10885cc:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885cf:	48 89 c5             	mov    rbp,rax
     10885d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10885d5:	4c 89 f7             	mov    rdi,r14
     10885d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10885db:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10885e0:	48 89 df             	mov    rdi,rbx
     10885e3:	e8 46 6a b0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
     10885e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     10885eb:	48 89 c7             	mov    rdi,rax
     10885ee:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     10885f1:	49 89 c6             	mov    r14,rax
     10885f4:	6a 28                	push   0x28
     10885f6:	5f                   	pop    rdi
     10885f7:	e8 04 59 76 00       	call   17edf00 <_Znwm@plt>
     10885fc:	48 89 c3             	mov    rbx,rax
     10885ff:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
     1088603:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1088608:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
     108860c:	48 85 c0             	test   rax,rax
     108860f:	74 05                	je     1088616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fa2c>
     1088611:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1088616:	41 0f 28 87 40 01 00 	movaps xmm0,XMMWORD PTR [r15+0x140]
     108861d:	00 
     108861e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1088623:	49 8b 87 48 01 00 00 	mov    rax,QWORD PTR [r15+0x148]
     108862a:	48 85 c0             	test   rax,rax
     108862d:	74 05                	je     1088634 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fa4a>
     108862f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1088634:	41 8a 84 24 b8 00 00 	mov    al,BYTE PTR [r12+0xb8]
     108863b:	00 

- null-test @0x108860c: test   rax,rax
- null-test @0x108862a: test   rax,rax
- null-test @0x1088683: test   r14,r14
- tracked stack slots: ['0x58', '0x60']

## Candidate +0x28 return semantics
### AP 0x1817068: kind=field, returned-offset=0x10, method=0xa7a004
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
- nullability: stored pointer can naturally be null

### AP 0x1867b28: kind=embedded, returned-offset=0x50, method=0xb00302
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret
- nullability: for a valid service object, this+offset is intrinsically non-null

### AP 0x18228d8: kind=embedded, returned-offset=0x218, method=0xd17212
      d17212:	48 8d 87 18 02 00 00 	lea    rax,[rdi+0x218]
      d17219:	c3                   	ret
- nullability: for a valid service object, this+offset is intrinsically non-null

### AP 0x181f788: kind=field, returned-offset=0x5e0, method=0xcc4eea
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret
- nullability: stored pointer can naturally be null

### AP 0x1821448: kind=delegated, returned-offset=None, method=0xb7d2ca
      b7d2ca:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b7d2ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b7d2d1:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
- nullability: depends on delegated/conditional target

### AP 0x1822988: kind=conditional, returned-offset=None, method=0xd1a440
      d1a440:	48 8b 87 08 04 00 00 	mov    rax,QWORD PTR [rdi+0x408]
      d1a447:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
      d1a44b:	48 85 ff             	test   rdi,rdi
      d1a44e:	74 13                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
      d1a450:	80 bf 98 00 00 00 00 	cmp    BYTE PTR [rdi+0x98],0x0
      d1a457:	74 0a                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
      d1a459:	80 7f 15 00          	cmp    BYTE PTR [rdi+0x15],0x0
      d1a45d:	0f 85 91 a5 00 00    	jne    d249f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271994>
      d1a463:	c3                   	ret
- nullability: depends on delegated/conditional target

## Interpretation rule
- Repeated runtime null checks on the exact +0x28 result are evidence against an always-nonnull this-relative implementation.
- This is not by itself proof of a field-return implementation because callers may retain defensive null checks.
- The gold-standard identity remains a direct table[184] population -> concrete vptr dataflow.
