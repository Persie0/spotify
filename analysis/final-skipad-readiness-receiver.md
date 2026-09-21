# Final Skip Ad readiness receiver resolver

Known final test: fd384d invokes receiver virtual +0x140; fd3853 tests eax and exports "skip-ad" only when eax == 0.
Known fd4c04 fallback: final receiver = [[sourceWrapper+0x10]+0x40].
Known field428 provenance: source+0x178 -> ece57c wrapper -> owner+0x428 -> e99d07 aggregate/state pipeline.

## Inline readiness-variant vtables
### AP 0x183d258
- +0x0: 0xf7796c FDE=(16218476, 16218495)
- +0x8: 0xf77980 FDE=(16218496, 16218514)
- +0x10: 0xf77992 FDE=(16218514, 16218560)
- +0x18: 0xf779c0 FDE=(16218560, 16218597)
- +0x20: 0xaae9b2 FDE=(11200946, 11200955)
- +0x28: 0xaae9bc FDE=(11200956, 11200978)
- +0x30: 0xf779e6 FDE=(16218598, 16218783)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xf780f0 FDE=(16220400, 16220415)
- +0x50: 0xf78100 FDE=(16220416, 16220434)
- +0x58: 0xf78112 FDE=(16220434, 16220443)
- +0x60: 0x0 FDE=None
- +0x68: 0xa50370 FDE=(10814320, 10814325)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
- +0x80: 0xf77ca2 FDE=(16219298, 16219317)
- +0x88: 0xf77cb6 FDE=(16219318, 16219336)
- +0x90: 0xf77cc8 FDE=(16219336, 16219388)
- +0x98: 0xf77cfc FDE=(16219388, 16219414)
- +0xa0: 0xaf2b9c FDE=(11479964, 11479973)
- +0xa8: 0xaf2ba6 FDE=(11479974, 11479996)
- +0xb0: 0xf77d16 FDE=(16219414, 16220021)
- +0xb8: 0x0 FDE=None
- +0xc0: 0x0 FDE=None
- +0xc8: 0xf7811c FDE=(16220444, 16220463)
- +0xd0: 0xf78130 FDE=(16220464, 16220482)
- +0xd8: 0xf78142 FDE=(16220482, 16220528)
- +0xe0: 0xf78170 FDE=(16220528, 16220565)
- +0xe8: 0xaae9b2 FDE=(11200946, 11200955)
- +0xf0: 0xaae9bc FDE=(11200956, 11200978)
- +0xf8: 0xf78196 FDE=(16220566, 16220899)
- +0x100: 0x0 FDE=None
- +0x108: 0x0 FDE=None
- +0x110: 0xf782e4 FDE=(16220900, 16220919)
- +0x118: 0xf782f8 FDE=(16220920, 16220938)
- +0x120: 0xf7830a FDE=(16220938, 16220984)
- +0x128: 0xf78338 FDE=(16220984, 16221021)
- +0x130: 0xaae9b2 FDE=(11200946, 11200955)
- +0x138: 0xaae9bc FDE=(11200956, 11200978)
- +0x140: 0xf7835e FDE=(16221022, 16222084)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xf78c8c FDE=(16223372, 16223391)
- +0x160: 0xf78ca0 FDE=(16223392, 16223410)
- +0x168: 0xf78cb2 FDE=(16223410, 16223462)
- +0x170: 0xf78ce6 FDE=(16223462, 16223488)
- +0x178: 0xaae9b2 FDE=(11200946, 11200955)
- +0x180: 0xaae9bc FDE=(11200956, 11200978)
#### +0x140 target: 0xf7835e
      f78346:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      f7834a:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      f7834e:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      f78352:	48 85 c0             	test   rax,rax
      f78355:	74 05                	je     f7835c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13f772>
      f78357:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f7835c:	c3                   	ret
      f7835d:	cc                   	int3
      f7835e:	55                   	push   rbp
      f7835f:	41 57                	push   r15
      f78361:	41 56                	push   r14
      f78363:	41 55                	push   r13
      f78365:	41 54                	push   r12
      f78367:	53                   	push   rbx
      f78368:	48 81 ec 98 02 00 00 	sub    rsp,0x298
      f7836f:	49 89 cf             	mov    r15,rcx
      f78372:	49 89 d4             	mov    r12,rdx
      f78375:	49 89 f6             	mov    r14,rsi
      f78378:	48 89 fb             	mov    rbx,rdi
      f7837b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f78382:	00 00 
      f78384:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
      f7838b:	00 
      f7838c:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
      f7838f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f78392:	4c 8d ac 24 70 01 00 	lea    r13,[rsp+0x170]
      f78399:	00 
      f7839a:	4c 89 ef             	mov    rdi,r13
      f7839d:	ff 10                	call   QWORD PTR [rax]
      f7839f:	41 8a ad f0 00 00 00 	mov    bpl,BYTE PTR [r13+0xf0]
      f783a6:	4c 89 ef             	mov    rdi,r13
      f783a9:	e8 d2 cf f8 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      f783ae:	40 84 ed             	test   bpl,bpl
      f783b1:	0f 84 05 02 00 00    	je     f785bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13f9d2>
      f783b7:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      f783bc:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
      f783c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f783c3:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      f783c8:	ff 10                	call   QWORD PTR [rax]
      f783ca:	0f 57 c0             	xorps  xmm0,xmm0
      f783cd:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      f783d2:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      f783d8:	48 8d 35 89 f4 a6 00 	lea    rsi,[rip+0xa6f489]        # 19e7868 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1e58>
      f783df:	4c 89 ff             	mov    rdi,r15

### AP 0x183d3b0
- +0x0: 0xf78c8c FDE=(16223372, 16223391)
- +0x8: 0xf78ca0 FDE=(16223392, 16223410)
- +0x10: 0xf78cb2 FDE=(16223410, 16223462)
- +0x18: 0xf78ce6 FDE=(16223462, 16223488)
- +0x20: 0xaae9b2 FDE=(11200946, 11200955)
- +0x28: 0xaae9bc FDE=(11200956, 11200978)
- +0x30: 0xf78d00 FDE=(16223488, 16223707)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0x9d7de0 FDE=(10321376, 10321377)
- +0x50: 0xa50370 FDE=(10814320, 10814325)
- +0x58: 0xf78ddc FDE=(16223708, 16223729)
- +0x60: 0xf78df2 FDE=(16223730, 16223741)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0xf78dfe FDE=(16223742, 16224312)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0xf79038 FDE=(16224312, 16225304)
- +0x98: 0xf772f2 FDE=(16216818, 16216832)
- +0xa0: 0xf79418 FDE=(16225304, 16225323)
- +0xa8: 0xf7942c FDE=(16225324, 16225342)
- +0xb0: 0x0 FDE=None
- +0xb8: 0x0 FDE=None
- +0xc0: 0xf7953a FDE=(16225594, 16225613)
- +0xc8: 0xf7954e FDE=(16225614, 16225632)
- +0xd0: 0xf79560 FDE=(16225632, 16225678)
- +0xd8: 0xf7958e FDE=(16225678, 16225715)
- +0xe0: 0xaae9b2 FDE=(11200946, 11200955)
- +0xe8: 0xaae9bc FDE=(11200956, 11200978)
- +0xf0: 0xf795b4 FDE=(16225716, 16226207)
- +0xf8: 0x0 FDE=None
- +0x100: 0x0 FDE=None
- +0x108: 0xf79894 FDE=(16226452, 16228289)
- +0x110: 0xf79fc2 FDE=(16228290, 16230466)
- +0x118: 0xf7a842 FDE=(16230466, 16230502)
- +0x120: 0xf7a866 FDE=(16230502, 16230520)
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xf7430e FDE=(16204558, 16204573)
- +0x140: 0xf7431e FDE=(16204574, 16204592)
- +0x148: 0xf74330 FDE=(16204592, 16204659)
- +0x150: 0x0 FDE=None
- +0x158: 0xa50370 FDE=(10814320, 10814325)
- +0x160: 0x0 FDE=None
- +0x168: 0x0 FDE=None
- +0x170: 0xf7b346 FDE=(16233286, 16233301)
- +0x178: 0xf7b356 FDE=(16233302, 16233320)
- +0x180: 0xf7b368 FDE=(16233320, 16233443)
#### +0x140 target: 0xf7431e
      f74307:	c6 43 18 01          	mov    BYTE PTR [rbx+0x18],0x1
      f7430b:	5b                   	pop    rbx
      f7430c:	c3                   	ret
      f7430d:	cc                   	int3
      f7430e:	48 8d 05 d3 91 8c 00 	lea    rax,[rip+0x8c91d3]        # 183d4e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf480>
      f74315:	48 89 07             	mov    QWORD PTR [rdi],rax
      f74318:	e9 f3 9c 87 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      f7431d:	cc                   	int3
      f7431e:	53                   	push   rbx
      f7431f:	48 89 fb             	mov    rbx,rdi
      f74322:	e8 e7 ff ff ff       	call   f7430e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13b724>
      f74327:	48 89 df             	mov    rdi,rbx
      f7432a:	5b                   	pop    rbx
      f7432b:	e9 f0 9b 87 00       	jmp    17edf20 <_ZdlPv@plt>
      f74330:	41 57                	push   r15
      f74332:	41 56                	push   r14
      f74334:	53                   	push   rbx
      f74335:	49 89 fe             	mov    r14,rdi
      f74338:	48 8d 5f 18          	lea    rbx,[rdi+0x18]
      f7433c:	4c 8b 7f 18          	mov    r15,QWORD PTR [rdi+0x18]
      f74340:	49 8d 47 ff          	lea    rax,[r15-0x1]
      f74344:	48 83 f8 fb          	cmp    rax,0xfffffffffffffffb
      f74348:	77 0f                	ja     f74359 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13b76f>
      f7434a:	4c 89 ff             	mov    rdi,r15
      f7434d:	41 ff 57 08          	call   QWORD PTR [r15+0x8]
      f74351:	4c 89 ff             	mov    rdi,r15
      f74354:	e8 c7 9b 87 00       	call   17edf20 <_ZdlPv@plt>
      f74359:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
      f7435d:	41 8b 76 58          	mov    esi,DWORD PTR [r14+0x58]
      f74361:	e8 0e 00 00 00       	call   f74374 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13b78a>
      f74366:	48 89 df             	mov    rdi,rbx
      f74369:	5b                   	pop    rbx
      f7436a:	41 5e                	pop    r14
      f7436c:	41 5f                	pop    r15
      f7436e:	e9 bf e6 b7 ff       	jmp    af2a32 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f9d2>
      f74373:	cc                   	int3
      f74374:	40 84 f6             	test   sil,sil
      f74377:	0f 85 63 fa bb ff    	jne    b33de0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d80>
      f7437d:	c3                   	ret
      f7437e:	48 8d 05 6b 8c 8c 00 	lea    rax,[rip+0x8c8c6b]        # 183cff0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xef88>
      f74385:	48 89 07             	mov    QWORD PTR [rdi],rax
      f74388:	48 83 c7 08          	add    rdi,0x8
      f7438c:	e9 fb de ff ff       	jmp    f7228c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1396a2>
      f74391:	cc                   	int3

### AP 0x183d470
- +0x0: 0xf7953a FDE=(16225594, 16225613)
- +0x8: 0xf7954e FDE=(16225614, 16225632)
- +0x10: 0xf79560 FDE=(16225632, 16225678)
- +0x18: 0xf7958e FDE=(16225678, 16225715)
- +0x20: 0xaae9b2 FDE=(11200946, 11200955)
- +0x28: 0xaae9bc FDE=(11200956, 11200978)
- +0x30: 0xf795b4 FDE=(16225716, 16226207)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xf79894 FDE=(16226452, 16228289)
- +0x50: 0xf79fc2 FDE=(16228290, 16230466)
- +0x58: 0xf7a842 FDE=(16230466, 16230502)
- +0x60: 0xf7a866 FDE=(16230502, 16230520)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xf7430e FDE=(16204558, 16204573)
- +0x80: 0xf7431e FDE=(16204574, 16204592)
- +0x88: 0xf74330 FDE=(16204592, 16204659)
- +0x90: 0x0 FDE=None
- +0x98: 0xa50370 FDE=(10814320, 10814325)
- +0xa0: 0x0 FDE=None
- +0xa8: 0x0 FDE=None
- +0xb0: 0xf7b346 FDE=(16233286, 16233301)
- +0xb8: 0xf7b356 FDE=(16233302, 16233320)
- +0xc0: 0xf7b368 FDE=(16233320, 16233443)
- +0xc8: 0x0 FDE=None
- +0xd0: 0xa50370 FDE=(10814320, 10814325)
- +0xd8: 0x0 FDE=None
- +0xe0: 0x0 FDE=None
- +0xe8: 0xf7af24 FDE=(16232228, 16232243)
- +0xf0: 0xf7af34 FDE=(16232244, 16232262)
- +0xf8: 0xf7af46 FDE=(16232262, 16232335)
- +0x100: 0x0 FDE=None
- +0x108: 0xa50370 FDE=(10814320, 10814325)
- +0x110: 0x0 FDE=None
- +0x118: 0x0 FDE=None
- +0x120: 0xf7aec2 FDE=(16232130, 16232145)
- +0x128: 0xf7aed2 FDE=(16232146, 16232164)
- +0x130: 0xf7aee4 FDE=(16232164, 16232228)
- +0x138: 0x0 FDE=None
- +0x140: 0xa50370 FDE=(10814320, 10814325)
- +0x148: 0x0 FDE=None
- +0x150: 0x0 FDE=None
- +0x158: 0xf7ae96 FDE=(16232086, 16232101)
- +0x160: 0xf7aea6 FDE=(16232102, 16232120)
- +0x168: 0xf7aeb8 FDE=(16232120, 16232129)
- +0x170: 0x0 FDE=None
- +0x178: 0xa50370 FDE=(10814320, 10814325)
- +0x180: 0x0 FDE=None
#### +0x140 target: 0xa50370
      a50355:	74 e9                	je     a50340 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa20>
      a50357:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      a5035b:	e8 c0 db d9 00       	call   17edf20 <_ZdlPv@plt>
      a50360:	f6 43 18 01          	test   BYTE PTR [rbx+0x18],0x1
      a50364:	74 e0                	je     a50346 <_ZNSt6__ndk14__fs10filesystem28recursive_directory_iterator15__try_recursionEPNS_10error_codeE@@Base+0xa26>
      a50366:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
      a5036a:	5b                   	pop    rbx
      a5036b:	e9 b0 db d9 00       	jmp    17edf20 <_ZdlPv@plt>
      a50370:	e9 ab db d9 00       	jmp    17edf20 <_ZdlPv@plt>
      a50375:	cc                   	int3
      a50376:	cc                   	int3
      a50377:	cc                   	int3
      a50378:	cc                   	int3
      a50379:	cc                   	int3
      a5037a:	cc                   	int3
      a5037b:	cc                   	int3
      a5037c:	cc                   	int3
      a5037d:	cc                   	int3
      a5037e:	cc                   	int3
      a5037f:	cc                   	int3
      a50380:	41 57                	push   r15
      a50382:	41 56                	push   r14
      a50384:	53                   	push   rbx
      a50385:	48 83 ec 30          	sub    rsp,0x30
      a50389:	49 89 d7             	mov    r15,rdx
      a5038c:	48 89 f0             	mov    rax,rsi
      a5038f:	48 89 fb             	mov    rbx,rdi
      a50392:	89 ce                	mov    esi,ecx
      a50394:	4c 89 c2             	mov    rdx,r8
      a50397:	48 89 c1             	mov    rcx,rax
      a5039a:	e8 41 fa d9 00       	call   17efde0 <_ZNSt6__ndk112system_errorC2ENS_10error_codeERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@plt>
      a5039f:	48 8b 05 62 1b e6 00 	mov    rax,QWORD PTR [rip+0xe61b62]        # 18b1f08 <_ZTVNSt6__ndk14__fs10filesystem16filesystem_errorE@@Base+0xbcde8>
      a503a6:	48 83 c0 10          	add    rax,0x10
      a503aa:	48 89 03             	mov    QWORD PTR [rbx],rax
      a503ad:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      a503b1:	0f 57 c0             	xorps  xmm0,xmm0
      a503b4:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      a503b9:	48 c7 44 24 20 00 00 	mov    QWORD PTR [rsp+0x20],0x0
      a503c0:	00 00 
      a503c2:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
      a503c7:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      a503cc:	4c 89 f7             	mov    rdi,r14
      a503cf:	4c 89 fa             	mov    rdx,r15
      a503d2:	e8 69 00 00 00       	call   a50440 <_ZdaPv@@Base+0xd0>

## Compare variant virtual slots
- +0x0: 0xf7796c, 0xf78c8c, 0xf7953a
- +0x8: 0xf77980, 0xf78ca0, 0xf7954e
- +0x10: 0xf77992, 0xf78cb2, 0xf79560
- +0x18: 0xf779c0, 0xf78ce6, 0xf7958e
- +0x30: 0xf779e6, 0xf78d00, 0xf795b4
- +0x48: 0xf780f0, 0x9d7de0, 0xf79894
- +0x50: 0xf78100, 0xa50370, 0xf79fc2
- +0x58: 0xf78112, 0xf78ddc, 0xf7a842
- +0x60: 0x0, 0xf78df2, 0xf7a866
- +0x68: 0xa50370, 0x9d7de0, 0x0
- +0x70: 0x0, 0xa50370, 0x0
- +0x78: 0x0, 0xf78dfe, 0xf7430e
- +0x80: 0xf77ca2, 0x0, 0xf7431e
- +0x88: 0xf77cb6, 0x0, 0xf74330
- +0x90: 0xf77cc8, 0xf79038, 0x0
- +0x98: 0xf77cfc, 0xf772f2, 0xa50370
- +0xa0: 0xaf2b9c, 0xf79418, 0x0
- +0xa8: 0xaf2ba6, 0xf7942c, 0x0
- +0xb0: 0xf77d16, 0x0, 0xf7b346
- +0xb8: 0x0, 0x0, 0xf7b356
- +0xc0: 0x0, 0xf7953a, 0xf7b368
- +0xc8: 0xf7811c, 0xf7954e, 0x0
- +0xd0: 0xf78130, 0xf79560, 0xa50370
- +0xd8: 0xf78142, 0xf7958e, 0x0
- +0xe0: 0xf78170, 0xaae9b2, 0x0
- +0xe8: 0xaae9b2, 0xaae9bc, 0xf7af24
- +0xf0: 0xaae9bc, 0xf795b4, 0xf7af34
- +0xf8: 0xf78196, 0x0, 0xf7af46
- +0x108: 0x0, 0xf79894, 0xa50370
- +0x110: 0xf782e4, 0xf79fc2, 0x0
- +0x118: 0xf782f8, 0xf7a842, 0x0
- +0x120: 0xf7830a, 0xf7a866, 0xf7aec2
- +0x128: 0xf78338, 0x0, 0xf7aed2
- +0x130: 0xaae9b2, 0x0, 0xf7aee4
- +0x138: 0xaae9bc, 0xf7430e, 0x0
- +0x140: 0xf7835e, 0xf7431e, 0xa50370
- +0x148: 0x0, 0xf74330, 0x0
- +0x158: 0xf78c8c, 0xa50370, 0xf7ae96
- +0x160: 0xf78ca0, 0x0, 0xf7aea6
- +0x168: 0xf78cb2, 0x0, 0xf7aeb8
- +0x170: 0xf78ce6, 0xf7b346, 0x0
- +0x178: 0xaae9b2, 0xf7b356, 0xa50370
- +0x180: 0xaae9bc, 0xf7b368, 0x0

## Materialization refs for variants
### AP 0x183d258
#### ref 0xe9bde5 FDE=(15310087, 15343400)
      e9bdb3:	44 88 64 24 26       	mov    BYTE PTR [rsp+0x26],r12b
      e9bdb8:	74 15                	je     e9bdcf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631e5>
      e9bdba:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bdbf:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9bdc6:	00 00 
      e9bdc8:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bdcd:	eb 12                	jmp    e9bde1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631f7>
      e9bdcf:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bdd6:	00 00 
      e9bdd8:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9bddf:	00 00 
      e9bde1:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9bde5:	48 8d 05 6c 14 9a 00 	lea    rax,[rip+0x9a146c]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      e9bdec:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9bdf3:	00 
      e9bdf4:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9bdfb:	00 
      e9bdfc:	4c 89 e7             	mov    rdi,r12
      e9bdff:	48 89 de             	mov    rsi,rbx
      e9be02:	e8 81 b4 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9be07:	48 89 df             	mov    rdi,rbx
      e9be0a:	e8 5b e1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9be0f:	4c 89 f7             	mov    rdi,r14
      e9be12:	e8 6f 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be17:	66 49 0f 6e c7       	movq   xmm0,r15
      e9be1c:	66 49 0f 6e cc       	movq   xmm1,r12
      e9be21:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9be25:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9be2b:	31 ff                	xor    edi,edi
      e9be2d:	e8 ea 25 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9be32:	4c 89 f7             	mov    rdi,r14
      e9be35:	e8 4c 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9be3a:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9be41:	00 
      e9be42:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9be48:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9be4c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9be53:	00 
      e9be54:	e8 55 dc ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9be59:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9be60:	00 
#### ref 0xf7796c FDE=(16218476, 16218495)
      f77945:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f7794c:	00 00 
      f7794e:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      f77953:	75 0a                	jne    f7795f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ed75>
      f77955:	48 83 c4 50          	add    rsp,0x50
      f77959:	5b                   	pop    rbx
      f7795a:	41 5e                	pop    r14
      f7795c:	41 5f                	pop    r15
      f7795e:	c3                   	ret
      f7795f:	e8 4c 81 87 00       	call   17efab0 <__stack_chk_fail@plt>
      f77964:	48 89 c7             	mov    rdi,rax
      f77967:	e8 39 21 b0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      f7796c:	48 8d 05 e5 58 8c 00 	lea    rax,[rip+0x8c58e5]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      f77973:	48 89 07             	mov    QWORD PTR [rdi],rax
      f77976:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      f7797a:	e9 07 6b b2 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      f7797f:	cc                   	int3
      f77980:	53                   	push   rbx
      f77981:	48 89 fb             	mov    rbx,rdi
      f77984:	e8 e3 ff ff ff       	call   f7796c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ed82>
      f77989:	48 89 df             	mov    rdi,rbx
      f7798c:	5b                   	pop    rbx
      f7798d:	e9 8e 65 87 00       	jmp    17edf20 <_ZdlPv@plt>
      f77992:	53                   	push   rbx
      f77993:	48 89 fb             	mov    rbx,rdi
      f77996:	6a 18                	push   0x18
      f77998:	5f                   	pop    rdi
      f77999:	e8 62 65 87 00       	call   17edf00 <_Znwm@plt>
      f7799e:	48 8d 0d b3 58 8c 00 	lea    rcx,[rip+0x8c58b3]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      f779a5:	48 89 08             	mov    QWORD PTR [rax],rcx
      f779a8:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      f779ac:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      f779b0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f779b4:	48 85 c9             	test   rcx,rcx
      f779b7:	74 05                	je     f779be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13edd4>
      f779b9:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f779be:	5b                   	pop    rbx
      f779bf:	c3                   	ret
      f779c0:	48 8d 05 91 58 8c 00 	lea    rax,[rip+0x8c5891]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      f779c7:	48 89 06             	mov    QWORD PTR [rsi],rax
      f779ca:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
#### ref 0xf7799e FDE=(16218514, 16218560)
      f7797f:	cc                   	int3
      f77980:	53                   	push   rbx
      f77981:	48 89 fb             	mov    rbx,rdi
      f77984:	e8 e3 ff ff ff       	call   f7796c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ed82>
      f77989:	48 89 df             	mov    rdi,rbx
      f7798c:	5b                   	pop    rbx
      f7798d:	e9 8e 65 87 00       	jmp    17edf20 <_ZdlPv@plt>
      f77992:	53                   	push   rbx
      f77993:	48 89 fb             	mov    rbx,rdi
      f77996:	6a 18                	push   0x18
      f77998:	5f                   	pop    rdi
      f77999:	e8 62 65 87 00       	call   17edf00 <_Znwm@plt>
      f7799e:	48 8d 0d b3 58 8c 00 	lea    rcx,[rip+0x8c58b3]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      f779a5:	48 89 08             	mov    QWORD PTR [rax],rcx
      f779a8:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      f779ac:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      f779b0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f779b4:	48 85 c9             	test   rcx,rcx
      f779b7:	74 05                	je     f779be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13edd4>
      f779b9:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f779be:	5b                   	pop    rbx
      f779bf:	c3                   	ret
      f779c0:	48 8d 05 91 58 8c 00 	lea    rax,[rip+0x8c5891]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      f779c7:	48 89 06             	mov    QWORD PTR [rsi],rax
      f779ca:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      f779ce:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      f779d2:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      f779d6:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      f779da:	48 85 c0             	test   rax,rax
      f779dd:	74 05                	je     f779e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13edfa>
      f779df:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f779e4:	c3                   	ret
      f779e5:	cc                   	int3
      f779e6:	41 57                	push   r15
      f779e8:	41 56                	push   r14
      f779ea:	41 54                	push   r12
      f779ec:	53                   	push   rbx
      f779ed:	48 81 ec 08 01 00 00 	sub    rsp,0x108
      f779f4:	49 89 ce             	mov    r14,rcx
      f779f7:	49 89 d4             	mov    r12,rdx
      f779fa:	49 89 f7             	mov    r15,rsi
#### ref 0xf779c0 FDE=(16218560, 16218597)
      f77998:	5f                   	pop    rdi
      f77999:	e8 62 65 87 00       	call   17edf00 <_Znwm@plt>
      f7799e:	48 8d 0d b3 58 8c 00 	lea    rcx,[rip+0x8c58b3]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      f779a5:	48 89 08             	mov    QWORD PTR [rax],rcx
      f779a8:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      f779ac:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      f779b0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f779b4:	48 85 c9             	test   rcx,rcx
      f779b7:	74 05                	je     f779be <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13edd4>
      f779b9:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f779be:	5b                   	pop    rbx
      f779bf:	c3                   	ret
      f779c0:	48 8d 05 91 58 8c 00 	lea    rax,[rip+0x8c5891]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
      f779c7:	48 89 06             	mov    QWORD PTR [rsi],rax
      f779ca:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      f779ce:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      f779d2:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      f779d6:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      f779da:	48 85 c0             	test   rax,rax
      f779dd:	74 05                	je     f779e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13edfa>
      f779df:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f779e4:	c3                   	ret
      f779e5:	cc                   	int3
      f779e6:	41 57                	push   r15
      f779e8:	41 56                	push   r14
      f779ea:	41 54                	push   r12
      f779ec:	53                   	push   rbx
      f779ed:	48 81 ec 08 01 00 00 	sub    rsp,0x108
      f779f4:	49 89 ce             	mov    r14,rcx
      f779f7:	49 89 d4             	mov    r12,rdx
      f779fa:	49 89 f7             	mov    r15,rsi
      f779fd:	48 89 fb             	mov    rbx,rdi
      f77a00:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f77a07:	00 00 
      f77a09:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
      f77a10:	00 
      f77a11:	48 89 cf             	mov    rdi,rcx
      f77a14:	e8 d3 fd ff ff       	call   f777ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ec02>
      f77a19:	84 c0                	test   al,al
      f77a1b:	74 30                	je     f77a4d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13ee63>
      f77a1d:	49 83 c7 08          	add    r15,0x8

### AP 0x183d3b0
#### ref 0xe9beb5 FDE=(15310087, 15343400)
      e9be8c:	74 0a                	je     e9be98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632ae>
      e9be8e:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9be93:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9be98:	6a 60                	push   0x60
      e9be9a:	5f                   	pop    rdi
      e9be9b:	e8 60 20 95 00       	call   17edf00 <_Znwm@plt>
      e9bea0:	49 89 c7             	mov    r15,rax
      e9bea3:	48 8b 8c 24 48 13 00 	mov    rcx,QWORD PTR [rsp+0x1348]
      e9beaa:	00 
      e9beab:	0f 57 c0             	xorps  xmm0,xmm0
      e9beae:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      e9beb2:	48 89 28             	mov    QWORD PTR [rax],rbp
      e9beb5:	48 8d 05 f4 14 9a 00 	lea    rax,[rip+0x9a14f4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      e9bebc:	4d 85 f6             	test   r14,r14
      e9bebf:	74 21                	je     e9bee2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632f8>
      e9bec1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bec6:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9becd:	00 
      e9bece:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9bed3:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
      e9beda:	00 
      e9bedb:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bee0:	eb 15                	jmp    e9bef7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6330d>
      e9bee2:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9bee9:	00 
      e9beea:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      e9beef:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
      e9bef6:	00 
      e9bef7:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9befb:	48 89 8c 24 88 07 00 	mov    QWORD PTR [rsp+0x788],rcx
      e9bf02:	00 
      e9bf03:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9bf0a:	00 
      e9bf0b:	4c 89 e7             	mov    rdi,r12
      e9bf0e:	48 89 de             	mov    rsi,rbx
      e9bf11:	e8 72 b3 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9bf16:	48 89 df             	mov    rdi,rbx
      e9bf19:	e8 4c e0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9bf1e:	4c 89 f7             	mov    rdi,r14
      e9bf21:	e8 60 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9bf26:	66 49 0f 6e c7       	movq   xmm0,r15
#### ref 0xf78c8c FDE=(16223372, 16223391)
      f78c65:	e8 3b 0e b0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      f78c6a:	48 83 c7 10          	add    rdi,0x10
      f78c6e:	e9 01 00 00 00       	jmp    f78c74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14008a>
      f78c73:	cc                   	int3
      f78c74:	53                   	push   rbx
      f78c75:	48 89 fb             	mov    rbx,rdi
      f78c78:	48 83 c7 18          	add    rdi,0x18
      f78c7c:	e8 0f 52 87 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      f78c81:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      f78c85:	5b                   	pop    rbx
      f78c86:	e9 27 58 b2 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      f78c8b:	cc                   	int3
      f78c8c:	48 8d 05 1d 47 8c 00 	lea    rax,[rip+0x8c471d]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      f78c93:	48 89 07             	mov    QWORD PTR [rdi],rax
      f78c96:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      f78c9a:	e9 e7 57 b2 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      f78c9f:	cc                   	int3
      f78ca0:	53                   	push   rbx
      f78ca1:	48 89 fb             	mov    rbx,rdi
      f78ca4:	e8 e3 ff ff ff       	call   f78c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1400a2>
      f78ca9:	48 89 df             	mov    rdi,rbx
      f78cac:	5b                   	pop    rbx
      f78cad:	e9 6e 52 87 00       	jmp    17edf20 <_ZdlPv@plt>
      f78cb2:	41 56                	push   r14
      f78cb4:	53                   	push   rbx
      f78cb5:	50                   	push   rax
      f78cb6:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      f78cba:	6a 20                	push   0x20
      f78cbc:	5f                   	pop    rdi
      f78cbd:	e8 3e 52 87 00       	call   17edf00 <_Znwm@plt>
      f78cc2:	49 89 c6             	mov    r14,rax
      f78cc5:	48 8d 05 e4 46 8c 00 	lea    rax,[rip+0x8c46e4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      f78ccc:	49 89 06             	mov    QWORD PTR [r14],rax
      f78ccf:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      f78cd3:	48 89 de             	mov    rsi,rbx
      f78cd6:	e8 7d 00 bc ff       	call   b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
      f78cdb:	4c 89 f0             	mov    rax,r14
      f78cde:	48 83 c4 08          	add    rsp,0x8
      f78ce2:	5b                   	pop    rbx
      f78ce3:	41 5e                	pop    r14
      f78ce5:	c3                   	ret
#### ref 0xf78cc5 FDE=(16223410, 16223462)
      f78ca4:	e8 e3 ff ff ff       	call   f78c8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1400a2>
      f78ca9:	48 89 df             	mov    rdi,rbx
      f78cac:	5b                   	pop    rbx
      f78cad:	e9 6e 52 87 00       	jmp    17edf20 <_ZdlPv@plt>
      f78cb2:	41 56                	push   r14
      f78cb4:	53                   	push   rbx
      f78cb5:	50                   	push   rax
      f78cb6:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      f78cba:	6a 20                	push   0x20
      f78cbc:	5f                   	pop    rdi
      f78cbd:	e8 3e 52 87 00       	call   17edf00 <_Znwm@plt>
      f78cc2:	49 89 c6             	mov    r14,rax
      f78cc5:	48 8d 05 e4 46 8c 00 	lea    rax,[rip+0x8c46e4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      f78ccc:	49 89 06             	mov    QWORD PTR [r14],rax
      f78ccf:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      f78cd3:	48 89 de             	mov    rsi,rbx
      f78cd6:	e8 7d 00 bc ff       	call   b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
      f78cdb:	4c 89 f0             	mov    rax,r14
      f78cde:	48 83 c4 08          	add    rsp,0x8
      f78ce2:	5b                   	pop    rbx
      f78ce3:	41 5e                	pop    r14
      f78ce5:	c3                   	ret
      f78ce6:	48 8d 47 08          	lea    rax,[rdi+0x8]
      f78cea:	48 8d 0d bf 46 8c 00 	lea    rcx,[rip+0x8c46bf]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      f78cf1:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      f78cf4:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      f78cf8:	48 89 c6             	mov    rsi,rax
      f78cfb:	e9 58 00 bc ff       	jmp    b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
      f78d00:	55                   	push   rbp
      f78d01:	41 57                	push   r15
      f78d03:	41 56                	push   r14
      f78d05:	41 55                	push   r13
      f78d07:	41 54                	push   r12
      f78d09:	53                   	push   rbx
      f78d0a:	48 81 ec 08 01 00 00 	sub    rsp,0x108
      f78d11:	49 89 ce             	mov    r14,rcx
      f78d14:	49 89 d4             	mov    r12,rdx
      f78d17:	49 89 f7             	mov    r15,rsi
      f78d1a:	48 89 fb             	mov    rbx,rdi
      f78d1d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f78d24:	00 00 
#### ref 0xf78cea FDE=(16223462, 16223488)
      f78cc2:	49 89 c6             	mov    r14,rax
      f78cc5:	48 8d 05 e4 46 8c 00 	lea    rax,[rip+0x8c46e4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      f78ccc:	49 89 06             	mov    QWORD PTR [r14],rax
      f78ccf:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      f78cd3:	48 89 de             	mov    rsi,rbx
      f78cd6:	e8 7d 00 bc ff       	call   b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
      f78cdb:	4c 89 f0             	mov    rax,r14
      f78cde:	48 83 c4 08          	add    rsp,0x8
      f78ce2:	5b                   	pop    rbx
      f78ce3:	41 5e                	pop    r14
      f78ce5:	c3                   	ret
      f78ce6:	48 8d 47 08          	lea    rax,[rdi+0x8]
      f78cea:	48 8d 0d bf 46 8c 00 	lea    rcx,[rip+0x8c46bf]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
      f78cf1:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      f78cf4:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
      f78cf8:	48 89 c6             	mov    rsi,rax
      f78cfb:	e9 58 00 bc ff       	jmp    b38d58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x85cf8>
      f78d00:	55                   	push   rbp
      f78d01:	41 57                	push   r15
      f78d03:	41 56                	push   r14
      f78d05:	41 55                	push   r13
      f78d07:	41 54                	push   r12
      f78d09:	53                   	push   rbx
      f78d0a:	48 81 ec 08 01 00 00 	sub    rsp,0x108
      f78d11:	49 89 ce             	mov    r14,rcx
      f78d14:	49 89 d4             	mov    r12,rdx
      f78d17:	49 89 f7             	mov    r15,rsi
      f78d1a:	48 89 fb             	mov    rbx,rdi
      f78d1d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f78d24:	00 00 
      f78d26:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
      f78d2d:	00 
      f78d2e:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
      f78d31:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f78d34:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      f78d39:	4c 89 ef             	mov    rdi,r13
      f78d3c:	ff 10                	call   QWORD PTR [rax]
      f78d3e:	41 8a ad f0 00 00 00 	mov    bpl,BYTE PTR [r13+0xf0]
      f78d45:	4c 89 ef             	mov    rdi,r13
      f78d48:	e8 33 c6 f8 ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      f78d4d:	40 84 ed             	test   bpl,bpl

### AP 0x183d470
#### ref 0xe9c007 FDE=(15310087, 15343400)
      e9bfd7:	4d 85 f6             	test   r14,r14
      e9bfda:	74 15                	je     e9bff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63407>
      e9bfdc:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfe1:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
      e9bfe8:	00 00 
      e9bfea:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e9bfef:	eb 12                	jmp    e9c003 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63419>
      e9bff1:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
      e9bff8:	00 00 
      e9bffa:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
      e9c001:	00 00 
      e9c003:	4d 8d 67 20          	lea    r12,[r15+0x20]
      e9c007:	48 8d 05 62 14 9a 00 	lea    rax,[rip+0x9a1462]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      e9c00e:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
      e9c015:	00 
      e9c016:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
      e9c01d:	00 
      e9c01e:	4c 89 e7             	mov    rdi,r12
      e9c021:	48 89 de             	mov    rsi,rbx
      e9c024:	e8 5f b2 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
      e9c029:	48 89 df             	mov    rdi,rbx
      e9c02c:	e8 39 df bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9c031:	4c 89 f7             	mov    rdi,r14
      e9c034:	e8 4d 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c039:	66 49 0f 6e c7       	movq   xmm0,r15
      e9c03e:	66 49 0f 6e cc       	movq   xmm1,r12
      e9c043:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      e9c047:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      e9c04d:	31 ff                	xor    edi,edi
      e9c04f:	e8 c8 23 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9c054:	4c 89 f7             	mov    rdi,r14
      e9c057:	e8 2a 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9c05c:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
      e9c063:	00 
      e9c064:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e9c06a:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
      e9c06e:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      e9c075:	00 
      e9c076:	e8 33 da ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
      e9c07b:	48 8b bc 24 68 10 00 	mov    rdi,QWORD PTR [rsp+0x1068]
      e9c082:	00 
#### ref 0xf7953a FDE=(16225594, 16225613)
      f7950e:	41 5f                	pop    r15
      f79510:	c3                   	ret
      f79511:	e8 9a 65 87 00       	call   17efab0 <__stack_chk_fail@plt>
      f79516:	48 89 c3             	mov    rbx,rax
      f79519:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      f7951e:	e8 6d 49 87 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      f79523:	eb 03                	jmp    f79528 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14093e>
      f79525:	48 89 c3             	mov    rbx,rax
      f79528:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      f7952d:	e8 54 4f b2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f79532:	48 89 df             	mov    rdi,rbx
      f79535:	e8 6b 05 b0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      f7953a:	48 8d 05 2f 3f 8c 00 	lea    rax,[rip+0x8c3f2f]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      f79541:	48 89 07             	mov    QWORD PTR [rdi],rax
      f79544:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      f79548:	e9 39 4f b2 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      f7954d:	cc                   	int3
      f7954e:	53                   	push   rbx
      f7954f:	48 89 fb             	mov    rbx,rdi
      f79552:	e8 e3 ff ff ff       	call   f7953a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140950>
      f79557:	48 89 df             	mov    rdi,rbx
      f7955a:	5b                   	pop    rbx
      f7955b:	e9 c0 49 87 00       	jmp    17edf20 <_ZdlPv@plt>
      f79560:	53                   	push   rbx
      f79561:	48 89 fb             	mov    rbx,rdi
      f79564:	6a 18                	push   0x18
      f79566:	5f                   	pop    rdi
      f79567:	e8 94 49 87 00       	call   17edf00 <_Znwm@plt>
      f7956c:	48 8d 0d fd 3e 8c 00 	lea    rcx,[rip+0x8c3efd]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      f79573:	48 89 08             	mov    QWORD PTR [rax],rcx
      f79576:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      f7957a:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      f7957e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f79582:	48 85 c9             	test   rcx,rcx
      f79585:	74 05                	je     f7958c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1409a2>
      f79587:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f7958c:	5b                   	pop    rbx
      f7958d:	c3                   	ret
      f7958e:	48 8d 05 db 3e 8c 00 	lea    rax,[rip+0x8c3edb]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      f79595:	48 89 06             	mov    QWORD PTR [rsi],rax
      f79598:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
#### ref 0xf7956c FDE=(16225632, 16225678)
      f7954d:	cc                   	int3
      f7954e:	53                   	push   rbx
      f7954f:	48 89 fb             	mov    rbx,rdi
      f79552:	e8 e3 ff ff ff       	call   f7953a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140950>
      f79557:	48 89 df             	mov    rdi,rbx
      f7955a:	5b                   	pop    rbx
      f7955b:	e9 c0 49 87 00       	jmp    17edf20 <_ZdlPv@plt>
      f79560:	53                   	push   rbx
      f79561:	48 89 fb             	mov    rbx,rdi
      f79564:	6a 18                	push   0x18
      f79566:	5f                   	pop    rdi
      f79567:	e8 94 49 87 00       	call   17edf00 <_Znwm@plt>
      f7956c:	48 8d 0d fd 3e 8c 00 	lea    rcx,[rip+0x8c3efd]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      f79573:	48 89 08             	mov    QWORD PTR [rax],rcx
      f79576:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      f7957a:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      f7957e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f79582:	48 85 c9             	test   rcx,rcx
      f79585:	74 05                	je     f7958c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1409a2>
      f79587:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f7958c:	5b                   	pop    rbx
      f7958d:	c3                   	ret
      f7958e:	48 8d 05 db 3e 8c 00 	lea    rax,[rip+0x8c3edb]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      f79595:	48 89 06             	mov    QWORD PTR [rsi],rax
      f79598:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      f7959c:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      f795a0:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      f795a4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      f795a8:	48 85 c0             	test   rax,rax
      f795ab:	74 05                	je     f795b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1409c8>
      f795ad:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f795b2:	c3                   	ret
      f795b3:	cc                   	int3
      f795b4:	55                   	push   rbp
      f795b5:	41 57                	push   r15
      f795b7:	41 56                	push   r14
      f795b9:	41 54                	push   r12
      f795bb:	53                   	push   rbx
      f795bc:	48 81 ec 30 01 00 00 	sub    rsp,0x130
      f795c3:	49 89 d6             	mov    r14,rdx
      f795c6:	49 89 f7             	mov    r15,rsi
#### ref 0xf7958e FDE=(16225678, 16225715)
      f79566:	5f                   	pop    rdi
      f79567:	e8 94 49 87 00       	call   17edf00 <_Znwm@plt>
      f7956c:	48 8d 0d fd 3e 8c 00 	lea    rcx,[rip+0x8c3efd]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      f79573:	48 89 08             	mov    QWORD PTR [rax],rcx
      f79576:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      f7957a:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      f7957e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f79582:	48 85 c9             	test   rcx,rcx
      f79585:	74 05                	je     f7958c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1409a2>
      f79587:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f7958c:	5b                   	pop    rbx
      f7958d:	c3                   	ret
      f7958e:	48 8d 05 db 3e 8c 00 	lea    rax,[rip+0x8c3edb]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
      f79595:	48 89 06             	mov    QWORD PTR [rsi],rax
      f79598:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      f7959c:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      f795a0:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      f795a4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      f795a8:	48 85 c0             	test   rax,rax
      f795ab:	74 05                	je     f795b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1409c8>
      f795ad:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f795b2:	c3                   	ret
      f795b3:	cc                   	int3
      f795b4:	55                   	push   rbp
      f795b5:	41 57                	push   r15
      f795b7:	41 56                	push   r14
      f795b9:	41 54                	push   r12
      f795bb:	53                   	push   rbx
      f795bc:	48 81 ec 30 01 00 00 	sub    rsp,0x130
      f795c3:	49 89 d6             	mov    r14,rdx
      f795c6:	49 89 f7             	mov    r15,rsi
      f795c9:	48 89 fb             	mov    rbx,rdi
      f795cc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f795d3:	00 00 
      f795d5:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
      f795dc:	00 
      f795dd:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
      f795e0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f795e3:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
      f795e8:	4c 89 e7             	mov    rdi,r12
      f795eb:	ff 10                	call   QWORD PTR [rax]

## ef8ea4 aggregate copier
      ef8ea4:	50                   	push   rax
      ef8ea5:	48 89 f8             	mov    rax,rdi
      ef8ea8:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]
      ef8eac:	48 85 d2             	test   rdx,rdx
      ef8eaf:	74 0f                	je     ef8ec0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02d6>
      ef8eb1:	48 8d 4e 20          	lea    rcx,[rsi+0x20]
      ef8eb5:	48 39 f2             	cmp    rdx,rsi
      ef8eb8:	74 13                	je     ef8ecd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02e3>
      ef8eba:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
      ef8ebe:	eb 07                	jmp    ef8ec7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02dd>
      ef8ec0:	48 83 c0 20          	add    rax,0x20
      ef8ec4:	48 89 c1             	mov    rcx,rax
      ef8ec7:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      ef8ecb:	eb 10                	jmp    ef8edd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02f3>
      ef8ecd:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      ef8ed1:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
      ef8ed4:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
      ef8ed7:	48 89 c6             	mov    rsi,rax
      ef8eda:	ff 51 18             	call   QWORD PTR [rcx+0x18]
      ef8edd:	58                   	pop    rax
      ef8ede:	c3                   	ret
      ef8edf:	48 89 c7             	mov    rdi,rax
      ef8ee2:	e8 be 0b b8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## AP 0x18365e0 owner vtable
- +0x0: 0xef90ca FDE=(15700170, 15700189)
- +0x8: 0xef90de FDE=(15700190, 15700208)
- +0x10: 0xef90f0 FDE=(15700208, 15700370)
- +0x18: 0xef9192 FDE=(15700370, 15700396)
- +0x20: 0xef91ac FDE=(15700396, 15700405)
- +0x28: 0xef91b6 FDE=(15700406, 15700428)
- +0x30: 0xef91cc FDE=(15700428, 15722027)
- +0x38: 0x0 FDE=None
- +0x40: 0x0 FDE=None
- +0x48: 0xeff822 FDE=(15726626, 15726645)
- +0x50: 0xeff836 FDE=(15726646, 15726664)
- +0x58: 0xeff848 FDE=(15726664, 15726710)
- +0x60: 0xeff876 FDE=(15726710, 15726747)
- +0x68: 0xaae9b2 FDE=(11200946, 11200955)
- +0x70: 0xaae9bc FDE=(11200956, 11200978)
- +0x78: 0xeff89c FDE=(15726748, 15728817)
- +0x80: 0x0 FDE=None
- +0x88: 0x0 FDE=None
- +0x90: 0xf019cc FDE=(15735244, 15735263)
- +0x98: 0xf019e0 FDE=(15735264, 15735282)
- +0xa0: 0xf019f2 FDE=(15735282, 15735444)
- +0xa8: 0xf01a94 FDE=(15735444, 15735470)
- +0xb0: 0xf01aae FDE=(15735470, 15735479)
- +0xb8: 0xf01ab8 FDE=(15735480, 15735502)
- +0xc0: 0xf01ace FDE=(15735502, 15735592)
- +0xc8: 0x0 FDE=None
- +0xd0: 0x0 FDE=None
- +0xd8: 0xf00fa4 FDE=(15732644, 15734712)
- +0xe0: 0xf017b8 FDE=(15734712, 15734754)
- +0xe8: 0xf017e2 FDE=(15734754, 15734772)
- +0xf0: 0x0 FDE=None
- +0xf8: 0x0 FDE=None
- +0x100: 0xeff08a FDE=(15724682, 15724701)
- +0x108: 0xeff09e FDE=(15724702, 15724720)
- +0x110: 0xeff0b0 FDE=(15724720, 15724772)
- +0x118: 0xeff0e4 FDE=(15724772, 15724798)
- +0x120: 0xaf2b9c FDE=(11479964, 11479973)
- +0x128: 0xaf2ba6 FDE=(11479974, 11479996)
- +0x130: 0xeff0fe FDE=(15724798, 15726625)
- +0x138: 0x0 FDE=None
- +0x140: 0x0 FDE=None
- +0x148: 0xefeb5e FDE=(15723358, 15723377)
- +0x150: 0xefeb72 FDE=(15723378, 15723396)
- +0x158: 0xefeb84 FDE=(15723396, 15723556)
- +0x160: 0xefec24 FDE=(15723556, 15723582)
- +0x168: 0xad6470 FDE=(11363440, 11363449)
- +0x170: 0xad647a FDE=(11363450, 11363472)
- +0x178: 0xefec3e FDE=(15723582, 15723826)
- +0x180: 0x0 FDE=None

## AP 0x18365e0 methods touching readiness aggregate region +0x70..+0xc0
### slot +0x30 -> 0xef91cc
- 0xef93a5: mov    BYTE PTR [r15+0x88],al
- 0xef9485: cmp    QWORD PTR [r15+0x78],0x0
- 0xef948c: mov    rdi,QWORD PTR [r15+0x70]
- 0xef9495: and    QWORD PTR [r15+0x70],0x0
- 0xef94b6: and    QWORD PTR [r15+0x78],0x0
- 0xef9eda: and    QWORD PTR [r12+0x80],0x0
- 0xef9f07: mov    QWORD PTR [r14+0x78],rax
- 0xef9f0b: mov    QWORD PTR [r14+0x70],rax
- 0xefa2ad: movdqu XMMWORD PTR [r14+0x70],xmm0
- 0xefa2b3: movdqu XMMWORD PTR [r14+0x80],xmm0
- 0xefa48b: mov    QWORD PTR [rbx+0xb0],rcx
- 0xefa492: mov    rdi,QWORD PTR [rbx+0xb8]
- 0xefa499: mov    QWORD PTR [rbx+0xb8],rax
- 0xefa9da: movups XMMWORD PTR [r15+0x70],xmm0
- 0xefa9e7: movups XMMWORD PTR [r15+0x80],xmm0
- 0xefa9f7: movups XMMWORD PTR [r15+0x90],xmm0
- 0xefaa08: movdqu XMMWORD PTR [r15+0xa0],xmm0
- 0xefad3e: mov    QWORD PTR [r15+0x70],rax
- 0xefad5b: movdqu XMMWORD PTR [r15+0x78],xmm0
- 0xefad86: movdqu XMMWORD PTR [r15+0x88],xmm0
- 0xefad8f: movdqu XMMWORD PTR [r15+0x98],xmm0
- 0xefb332: movups XMMWORD PTR [r15+0x70],xmm0
- 0xefb33f: mov    QWORD PTR [r15+0x80],rax
- 0xefbafb: lea    rdi,[r14+0x70]
- 0xefbb0d: movdqa XMMWORD PTR [r13+0xa0],xmm0
- 0xefbb30: movdqa XMMWORD PTR [r13+0xb0],xmm0
- 0xefbb4a: mov    QWORD PTR [r13+0xc0],r12
- 0xefbc6c: mov    BYTE PTR [r13+0x70],al
- 0xefbc70: mov    BYTE PTR [r13+0x78],al
- 0xefbc88: movdqu XMMWORD PTR [r13+0x80],xmm0
      ef91be:	e8 ab fd ff ff       	call   ef8f6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0384>
      ef91c3:	48 89 df             	mov    rdi,rbx
      ef91c6:	5b                   	pop    rbx
      ef91c7:	e9 54 4d 8f 00       	jmp    17edf20 <_ZdlPv@plt>
      ef91cc:	55                   	push   rbp
      ef91cd:	41 57                	push   r15
      ef91cf:	41 56                	push   r14
      ef91d1:	41 55                	push   r13
      ef91d3:	41 54                	push   r12
      ef91d5:	53                   	push   rbx
      ef91d6:	48 81 ec f8 0a 00 00 	sub    rsp,0xaf8
      ef91dd:	49 89 fc             	mov    r12,rdi
      ef91e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef91e7:	00 00 
      ef91e9:	48 89 84 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],rax
      ef91f0:	00 
      ef91f1:	0f 57 c0             	xorps  xmm0,xmm0
      ef91f4:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ef91f7:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ef91fb:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef9203:	48 8d 47 30          	lea    rax,[rdi+0x30]
      ef9207:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
      ef920b:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      ef920f:	66 0f 6f 86 50 01 00 	movdqa xmm0,XMMWORD PTR [rsi+0x150]
      ef9216:	00 
      ef9217:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
      ef921c:	48 8b 86 58 01 00 00 	mov    rax,QWORD PTR [rsi+0x158]
      ef9223:	48 85 c0             	test   rax,rax
      ef9226:	74 05                	je     ef922d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0643>
      ef9228:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef922d:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9232:	8a 80 b7 01 00 00    	mov    al,BYTE PTR [rax+0x1b7]
      ef9238:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
      ef923f:	00 00 
      ef9241:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      ef9248:	4d 85 f6             	test   r14,r14
      ef924b:	74 05                	je     ef9252 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0668>
      ef924d:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ef9252:	66 0f 7f 84 24 b0 00 	movdqa XMMWORD PTR [rsp+0xb0],xmm0
      ef9259:	00 00 
      ef925b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef9260:	4c 8b 79 60          	mov    r15,QWORD PTR [rcx+0x60]
      ef9264:	4c 89 bc 24 20 07 00 	mov    QWORD PTR [rsp+0x720],r15
      ef926b:	00 
      ef926c:	48 8b 59 68          	mov    rbx,QWORD PTR [rcx+0x68]
      ef9270:	48 89 9c 24 28 07 00 	mov    QWORD PTR [rsp+0x728],rbx
      ef9277:	00 
      ef9278:	48 85 db             	test   rbx,rbx
      ef927b:	74 05                	je     ef9282 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0698>
      ef927d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef9282:	c6 84 24 30 07 00 00 	mov    BYTE PTR [rsp+0x730],0x0
      ef9289:	00 
      ef928a:	88 84 24 31 07 00 00 	mov    BYTE PTR [rsp+0x731],al
      ef9291:	48 83 a4 24 e0 0a 00 	and    QWORD PTR [rsp+0xae0],0x0
      ef9298:	00 00 
      ef929a:	6a 30                	push   0x30
      ef929c:	5f                   	pop    rdi
      ef929d:	4c 89 64 24 68       	mov    QWORD PTR [rsp+0x68],r12
      ef92a2:	e8 59 4c 8f 00       	call   17edf00 <_Znwm@plt>
      ef92a7:	48 8d 0d aa f4 99 00 	lea    rcx,[rip+0x99f4aa]        # 1898758 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5698>
      ef92ae:	48 89 08             	mov    QWORD PTR [rax],rcx
      ef92b1:	66 0f 6f 84 24 b0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xb0]
      ef92b8:	00 00 
      ef92ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef92bf:	66 0f ef c0          	pxor   xmm0,xmm0
      ef92c3:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
      ef92ca:	00 00 
      ef92cc:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
      ef92d0:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      ef92d4:	48 85 db             	test   rbx,rbx
      ef92d7:	74 05                	je     ef92de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc06f4>
      ef92d9:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef92de:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef92e5:	00 
      ef92e6:	0f b7 4f 20          	movzx  ecx,WORD PTR [rdi+0x20]
      ef92ea:	66 89 48 28          	mov    WORD PTR [rax+0x28],cx
      ef92ee:	48 89 84 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],rax
      ef92f5:	00 
      ef92f6:	e8 15 98 bf ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ef92fb:	48 83 bc 24 e0 0a 00 	cmp    QWORD PTR [rsp+0xae0],0x0
      ef9302:	00 00 
      ef9304:	0f 84 4a 01 00 00    	je     ef9454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc086a>
      ef930a:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9311:	00 

### slot +0x78 -> 0xeff89c
- 0xeffa42: lea    r15,[r13+0xb0]
      eff893:	74 05                	je     eff89a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6cb0>
      eff895:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      eff89a:	c3                   	ret
      eff89b:	cc                   	int3
      eff89c:	55                   	push   rbp
      eff89d:	41 57                	push   r15
      eff89f:	41 56                	push   r14
      eff8a1:	41 55                	push   r13
      eff8a3:	41 54                	push   r12
      eff8a5:	53                   	push   rbx
      eff8a6:	48 81 ec 28 02 00 00 	sub    rsp,0x228
      eff8ad:	49 89 f6             	mov    r14,rsi
      eff8b0:	48 89 fb             	mov    rbx,rdi
      eff8b3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      eff8ba:	00 00 
      eff8bc:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
      eff8c3:	00 
      eff8c4:	4c 8d bc 24 c8 00 00 	lea    r15,[rsp+0xc8]
      eff8cb:	00 
      eff8cc:	4c 89 ff             	mov    rdi,r15
      eff8cf:	48 89 d6             	mov    rsi,rdx
      eff8d2:	e8 0d 0f 7d 00       	call   16d07e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84950>
      eff8d7:	4d 8b 6e 08          	mov    r13,QWORD PTR [r14+0x8]
      eff8db:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      eff8e0:	4c 89 fe             	mov    rsi,r15
      eff8e3:	e8 58 e6 8e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      eff8e8:	4d 8d 75 60          	lea    r14,[r13+0x60]
      eff8ec:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      eff8f1:	4c 89 f7             	mov    rdi,r14
      eff8f4:	e8 9d 0e c4 ff       	call   b40796 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8d736>
      eff8f9:	84 c0                	test   al,al
      eff8fb:	0f 84 41 01 00 00    	je     effa42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6e58>
      eff901:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      eff908:	00 
      eff909:	4c 89 6f f8          	mov    QWORD PTR [rdi-0x8],r13
      eff90d:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      eff912:	e8 29 e6 8e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      eff917:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      eff91c:	e8 90 07 00 00       	call   f000b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc74c7>
      eff921:	49 89 de             	mov    r14,rbx
      eff924:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
      eff929:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
      eff92e:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      eff933:	4d 85 ff             	test   r15,r15
      eff936:	74 05                	je     eff93d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6d53>
      eff938:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      eff93d:	48 8b 9c 24 90 00 00 	mov    rbx,QWORD PTR [rsp+0x90]
      eff944:	00 
      eff945:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
      eff94c:	00 
      eff94d:	41 0f 29 44 24 f0    	movaps XMMWORD PTR [r12-0x10],xmm0
      eff953:	48 8d 73 60          	lea    rsi,[rbx+0x60]
      eff957:	4c 89 e7             	mov    rdi,r12
      eff95a:	48 8d 94 24 98 00 00 	lea    rdx,[rsp+0x98]
      eff961:	00 
      eff962:	e8 97 07 00 00       	call   f000fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7514>
      eff967:	48 83 a4 24 d0 01 00 	and    QWORD PTR [rsp+0x1d0],0x0
      eff96e:	00 00 
      eff970:	bf 80 00 00 00       	mov    edi,0x80
      eff975:	e8 86 e5 8e 00       	call   17edf00 <_Znwm@plt>
      eff97a:	49 89 c5             	mov    r13,rax
      eff97d:	48 8d 05 ec 6c 93 00 	lea    rax,[rip+0x936cec]        # 1836670 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8608>
      eff984:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      eff988:	0f 28 84 24 30 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x130]
      eff98f:	00 
      eff990:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
      eff995:	0f 57 c0             	xorps  xmm0,xmm0
      eff998:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
      eff99f:	00 
      eff9a0:	4c 89 ef             	mov    rdi,r13
      eff9a3:	48 83 c7 18          	add    rdi,0x18
      eff9a7:	4c 89 e6             	mov    rsi,r12
      eff9aa:	e8 35 0e 7d 00       	call   16d07e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84950>
      eff9af:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
      eff9b6:	00 
      eff9b7:	4c 89 6e 20          	mov    QWORD PTR [rsi+0x20],r13
      eff9bb:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
      eff9bf:	e8 cc e3 bb ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
      eff9c4:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      eff9cb:	00 
      eff9cc:	e8 99 a5 b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      eff9d1:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      eff9d8:	00 
      eff9d9:	e8 50 07 00 00       	call   f0012e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7544>
      eff9de:	31 ff                	xor    edi,edi

### slot +0xd8 -> 0xf00fa4
- 0xf00fff: cmp    BYTE PTR [rbx+0xa0],0x0
- 0xf010f4: lea    rax,[rbp+0x70]
- 0xf01135: mov    BYTE PTR [r14+0x70],al
- 0xf0114f: and    QWORD PTR [r14+0x88],0x0
- 0xf01157: movups XMMWORD PTR [r14+0x78],xmm0
- 0xf01164: mov    rax,QWORD PTR [rbp+0x78]
- 0xf014c8: inc    QWORD PTR [r13+0x78]
- 0xf014ed: lea    rdi,[r13+0xb0]
- 0xf014fc: lea    rdi,[r13+0x88]
      f00f9b:	74 05                	je     f00fa2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc83b8>
      f00f9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f00fa2:	c3                   	ret
      f00fa3:	cc                   	int3
      f00fa4:	55                   	push   rbp
      f00fa5:	41 57                	push   r15
      f00fa7:	41 56                	push   r14
      f00fa9:	41 55                	push   r13
      f00fab:	41 54                	push   r12
      f00fad:	53                   	push   rbx
      f00fae:	48 81 ec 68 01 00 00 	sub    rsp,0x168
      f00fb5:	48 89 fb             	mov    rbx,rdi
      f00fb8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f00fbf:	00 00 
      f00fc1:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
      f00fc8:	00 
      f00fc9:	4c 8d 77 08          	lea    r14,[rdi+0x8]
      f00fcd:	4c 8d a4 24 f8 00 00 	lea    r12,[rsp+0xf8]
      f00fd4:	00 
      f00fd5:	4c 89 e7             	mov    rdi,r12
      f00fd8:	4c 89 f6             	mov    rsi,r14
      f00fdb:	e8 50 a3 ba ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      f00fe0:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
      f00fe4:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      f00fe9:	e8 98 d4 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f00fee:	4d 85 ff             	test   r15,r15
      f00ff1:	0f 84 49 07 00 00    	je     f01740 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8b56>
      f00ff7:	4c 89 f7             	mov    rdi,r14
      f00ffa:	e8 d1 39 e2 ff       	call   d249d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271970>
      f00fff:	80 bb a0 00 00 00 00 	cmp    BYTE PTR [rbx+0xa0],0x0
      f01006:	0f 84 34 07 00 00    	je     f01740 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8b56>
      f0100c:	4c 8d 7b 38          	lea    r15,[rbx+0x38]
      f01010:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]
      f01014:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      f01019:	4c 89 fe             	mov    rsi,r15
      f0101c:	e8 b1 f8 7c 00       	call   16d08d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a3e>
      f01021:	4d 8d 66 60          	lea    r12,[r14+0x60]
      f01025:	48 83 c3 20          	add    rbx,0x20
      f01029:	48 89 df             	mov    rdi,rbx
      f0102c:	e8 8f e6 b9 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
      f01031:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      f01036:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
      f0103a:	4d 8b 6e 68          	mov    r13,QWORD PTR [r14+0x68]
      f0103e:	4d 85 ed             	test   r13,r13
      f01041:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
      f01046:	74 16                	je     f0105e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8474>
      f01048:	f3 49 0f b8 ed       	popcnt rbp,r13
      f0104d:	48 83 fd 01          	cmp    rbp,0x1
      f01051:	77 10                	ja     f01063 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8479>
      f01053:	49 8d 55 ff          	lea    rdx,[r13-0x1]
      f01057:	48 23 54 24 10       	and    rdx,QWORD PTR [rsp+0x10]
      f0105c:	eb 1c                	jmp    f0107a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8490>
      f0105e:	e9 80 00 00 00       	jmp    f010e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc84f9>
      f01063:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      f01068:	48 89 c2             	mov    rdx,rax
      f0106b:	4c 39 e8             	cmp    rax,r13
      f0106e:	72 0a                	jb     f0107a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8490>
      f01070:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      f01075:	31 d2                	xor    edx,edx
      f01077:	49 f7 f5             	div    r13
      f0107a:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      f0107e:	48 89 d3             	mov    rbx,rdx
      f01081:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
      f01085:	48 85 c0             	test   rax,rax
      f01088:	74 59                	je     f010e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc84f9>
      f0108a:	4c 8b 30             	mov    r14,QWORD PTR [rax]
      f0108d:	4d 85 f6             	test   r14,r14
      f01090:	74 51                	je     f010e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc84f9>
      f01092:	49 8d 45 ff          	lea    rax,[r13-0x1]
      f01096:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      f0109b:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      f0109f:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      f010a4:	75 17                	jne    f010bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc84d3>
      f010a6:	49 8d 7e 10          	lea    rdi,[r14+0x10]
      f010aa:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
      f010af:	e8 3a e6 b9 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      f010b4:	84 c0                	test   al,al
      f010b6:	74 23                	je     f010db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc84f1>
      f010b8:	e9 b8 02 00 00       	jmp    f01375 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc878b>
      f010bd:	83 fd 01             	cmp    ebp,0x1
      f010c0:	77 07                	ja     f010c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc84df>
      f010c2:	48 23 44 24 08       	and    rax,QWORD PTR [rsp+0x8]
      f010c7:	eb 0d                	jmp    f010d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc84ec>
      f010c9:	4c 39 e8             	cmp    rax,r13
      f010cc:	72 08                	jb     f010d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc84ec>

## ef91cc exact source/readiness-relevant accesses
- 0xef91f7: lea    rax,[rdi+0x18]
- 0xef91fb: movups XMMWORD PTR [rdi+0x18],xmm0
- 0xef91ff: mov    QWORD PTR [rdi+0x10],rax
- 0xef9203: lea    rax,[rdi+0x30]
- 0xef9207: movups XMMWORD PTR [rdi+0x30],xmm0
- 0xef920b: mov    QWORD PTR [rdi+0x28],rax
- 0xef92e6: movzx  ecx,WORD PTR [rdi+0x20]
- 0xef935f: lea    rbp,[r15+0x20]
- 0xef938c: mov    QWORD PTR [r13+0x20],rbx
- 0xef9394: movdqa XMMWORD PTR [r15+0x20],xmm0
- 0xef939a: lea    rdi,[r15+0x30]
- 0xef93a5: mov    BYTE PTR [r15+0x88],al
- 0xef93e2: mov    rdi,QWORD PTR [r15+0x28]
- 0xef93fa: lock inc QWORD PTR [r15+0x10]
- 0xef93ff: mov    QWORD PTR [r15+0x20],rbp
- 0xef9403: mov    QWORD PTR [r15+0x28],r15
- 0xef9485: cmp    QWORD PTR [r15+0x78],0x0
- 0xef948c: mov    rdi,QWORD PTR [r15+0x70]
- 0xef9495: and    QWORD PTR [r15+0x70],0x0
- 0xef949a: mov    rax,QWORD PTR [r15+0x68]
- 0xef94a5: mov    rdx,QWORD PTR [r15+0x60]
- 0xef94b6: and    QWORD PTR [r15+0x78],0x0
- 0xef94df: lea    rcx,[r12+0x10]
- 0xef94ec: lea    r14,[r12+0x28]
- 0xef9bea: mov    QWORD PTR [r14+0x18],rax
- 0xef9bf2: movdqu XMMWORD PTR [r14+0x28],xmm1
- 0xef9bff: mov    QWORD PTR [r14+0x20],rax
- 0xef9c03: movdqu XMMWORD PTR [r14+0x38],xmm0
- 0xef9c21: mov    QWORD PTR [r14+0x18],rax
- 0xef9c35: mov    QWORD PTR [r14+0x20],rax
- 0xef9c48: mov    QWORD PTR [r14+0x18],rax
- 0xef9c56: mov    QWORD PTR [r14+0x20],rax
- 0xef9c5e: movdqu XMMWORD PTR [r14+0x48],xmm0
- 0xef9c64: and    QWORD PTR [r14+0x58],0x0
- 0xef9db0: mov    QWORD PTR [r14+0x18],rax
- 0xef9db8: movdqu XMMWORD PTR [r14+0x28],xmm1
- 0xef9dc5: mov    QWORD PTR [r14+0x20],rax
- 0xef9dc9: movdqu XMMWORD PTR [r14+0x38],xmm0
- 0xef9de7: mov    QWORD PTR [r14+0x18],rax
- 0xef9df2: mov    QWORD PTR [r14+0x20],rax
- 0xef9e05: mov    QWORD PTR [r14+0x18],rax
- 0xef9e10: mov    QWORD PTR [r14+0x20],rax
- 0xef9e16: mov    BYTE PTR [r14+0x48],al
- 0xef9e1a: mov    BYTE PTR [r14+0x50],al
- 0xef9ec0: mov    QWORD PTR [r12+0x20],rax
- 0xef9ec5: lea    rbx,[r12+0x30]
- 0xef9eda: and    QWORD PTR [r12+0x80],0x0
- 0xef9ef5: mov    QWORD PTR [r14+0x60],rax
- 0xef9f03: mov    QWORD PTR [r14+0x68],rcx
- 0xef9f07: mov    QWORD PTR [r14+0x78],rax
- 0xef9f0b: mov    QWORD PTR [r14+0x70],rax

## sourceWrapper inner +0x40 writer candidates near fd4a92/fd4c04 family
### FDE 0xc8b110..0xc8bd62
#### store 0xc8b28a: mov    QWORD PTR [rsp+0x40],r14
      c8b249:	48 89 df             	mov    rdi,rbx
      c8b24c:	4c 89 f6             	mov    rsi,r14
      c8b24f:	e8 0e 0b 00 00       	call   c8bd62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8d02>
      c8b254:	80 bb 98 00 00 00 00 	cmp    BYTE PTR [rbx+0x98],0x0
      c8b25b:	0f 84 fe 07 00 00    	je     c8ba5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d89ff>
      c8b261:	40 84 ed             	test   bpl,bpl
      c8b264:	0f 84 f5 07 00 00    	je     c8ba5f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d89ff>
      c8b26a:	49 8d 76 08          	lea    rsi,[r14+0x8]
      c8b26e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      c8b273:	e8 e2 0b 00 00       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      c8b278:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
      c8b27d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      c8b281:	4c 89 ef             	mov    rdi,r13
      c8b284:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      c8b28a:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
      c8b28f:	4c 8d bc 24 78 01 00 	lea    r15,[rsp+0x178]
      c8b296:	00 
      c8b297:	4c 89 ff             	mov    rdi,r15
      c8b29a:	48 89 c6             	mov    rsi,rax
      c8b29d:	e8 c4 eb a3 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      c8b2a2:	48 8d 83 00 01 00 00 	lea    rax,[rbx+0x100]
      c8b2a9:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c8b2ae:	4c 89 ff             	mov    rdi,r15
      c8b2b1:	e8 76 1d a4 00       	call   16cd02c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x81198>
      c8b2b6:	4c 8b bb 08 01 00 00 	mov    r15,QWORD PTR [rbx+0x108]
      c8b2bd:	4d 85 ff             	test   r15,r15
      c8b2c0:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      c8b2c5:	0f 84 ca 00 00 00    	je     c8b395 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8335>
      c8b2cb:	49 89 c4             	mov    r12,rax
      c8b2ce:	f3 4d 0f b8 f7       	popcnt r14,r15
      c8b2d3:	49 83 fe 01          	cmp    r14,0x1
      c8b2d7:	77 3d                	ja     c8b316 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d82b6>
      c8b2d9:	49 8d 6f ff          	lea    rbp,[r15-0x1]
      c8b2dd:	4c 21 e5             	and    rbp,r12
      c8b2e0:	eb 49                	jmp    c8b32b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d82cb>
      c8b2e2:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]

### FDE 0xc8bd62..0xc8be59

### FDE 0xcaea68..0xcaf11c

### FDE 0xcafab6..0xcafb82
#### store 0xcafacd: mov    QWORD PTR [rsp+0x40],rax
      cafab6:	41 57                	push   r15
      cafab8:	41 56                	push   r14
      cafaba:	41 54                	push   r12
      cafabc:	53                   	push   rbx
      cafabd:	48 83 ec 48          	sub    rsp,0x48
      cafac1:	49 89 f7             	mov    r15,rsi
      cafac4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cafacb:	00 00 
      cafacd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      cafad2:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
      cafad5:	49 8b 1c 24          	mov    rbx,QWORD PTR [r12]
      cafad9:	48 89 e7             	mov    rdi,rsp
      cafadc:	48 89 de             	mov    rsi,rbx
      cafadf:	e8 76 c3 fd ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      cafae4:	4c 8d b3 a8 00 00 00 	lea    r14,[rbx+0xa8]
      cafaeb:	49 83 c4 08          	add    r12,0x8
      cafaef:	4c 89 f7             	mov    rdi,r14
      cafaf2:	4c 89 e6             	mov    rsi,r12
      cafaf5:	e8 ae f8 ff ff       	call   caf3a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc348>
      cafafa:	48 89 c7             	mov    rdi,rax
      cafafd:	4c 89 fe             	mov    rsi,r15
      cafb00:	e8 5d fd ff ff       	call   caf862 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc802>
      cafb05:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
      cafb09:	48 8b 8b c0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xc0]
      cafb10:	48 2b 43 10          	sub    rax,QWORD PTR [rbx+0x10]
      cafb14:	6a 58                	push   0x58
      cafb16:	5e                   	pop    rsi
      cafb17:	48 99                	cqo
      cafb19:	48 f7 fe             	idiv   rsi
      cafb1c:	48 39 c1             	cmp    rcx,rax

### FDE 0xcb1962..0xcb1b76

### FDE 0xcb1e2c..0xcb1edd

### FDE 0xd37212..0xd37736

### FDE 0xd37baa..0xd37c94

### FDE 0xd3b0b2..0xd3b326
#### store 0xd3b16a: mov    QWORD PTR [r15+0x40],rbx
      d3b131:	41 0f 29 87 a0 00 00 	movaps XMMWORD PTR [r15+0xa0],xmm0
      d3b138:	00 
      d3b139:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      d3b13e:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      d3b143:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
      d3b147:	4d 8d 6f 20          	lea    r13,[r15+0x20]
      d3b14b:	4d 89 6f 20          	mov    QWORD PTR [r15+0x20],r13
      d3b14f:	4d 89 7f 28          	mov    QWORD PTR [r15+0x28],r15
      d3b153:	31 ff                	xor    edi,edi
      d3b155:	e8 58 33 d6 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      d3b15a:	4c 89 ff             	mov    rdi,r15
      d3b15d:	e8 24 33 d6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d3b162:	4d 89 67 58          	mov    QWORD PTR [r15+0x58],r12
      d3b166:	4d 89 77 30          	mov    QWORD PTR [r15+0x30],r14
      d3b16a:	49 89 5f 40          	mov    QWORD PTR [r15+0x40],rbx
      d3b16e:	49 89 6f 48          	mov    QWORD PTR [r15+0x48],rbp
      d3b172:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      d3b177:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
      d3b17b:	49 8d 7f 60          	lea    rdi,[r15+0x60]
      d3b17f:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      d3b184:	e8 0b 88 dc ff       	call   b03994 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x50934>
      d3b189:	49 8d 76 08          	lea    rsi,[r14+0x8]
      d3b18d:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      d3b192:	e8 c3 0c f5 ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      d3b197:	49 8b be 90 00 00 00 	mov    rdi,QWORD PTR [r14+0x90]
      d3b19e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d3b1a1:	ff 50 28             	call   QWORD PTR [rax+0x28]
      d3b1a4:	49 89 c4             	mov    r12,rax
      d3b1a7:	49 83 c7 08          	add    r15,0x8
      d3b1ab:	48 8b 5c 24 50       	mov    rbx,QWORD PTR [rsp+0x50]
      d3b1b0:	4c 8b 74 24 58       	mov    r14,QWORD PTR [rsp+0x58]
      d3b1b5:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
      d3b1ba:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
      d3b1bf:	4d 85 f6             	test   r14,r14
      d3b1c2:	74 05                	je     d3b1c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x824f>
      d3b1c4:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]

### FDE 0xd3f3ee..0xd3f5d2
#### store 0xd3f433: mov    QWORD PTR [rsp+0x40],rax
      d3f3f6:	53                   	push   rbx
      d3f3f7:	48 81 ec e0 00 00 00 	sub    rsp,0xe0
      d3f3fe:	49 89 ff             	mov    r15,rdi
      d3f401:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d3f408:	00 00 
      d3f40a:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
      d3f411:	00 
      d3f412:	e8 bb 01 00 00       	call   d3f5d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc658>
      d3f417:	49 8b bf 90 00 00 00 	mov    rdi,QWORD PTR [r15+0x90]
      d3f41e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d3f421:	ff 50 28             	call   QWORD PTR [rax+0x28]
      d3f424:	49 89 c6             	mov    r14,rax
      d3f427:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      d3f42c:	48 8d 05 31 d0 d3 ff 	lea    rax,[rip+0xffffffffffd3d031]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      d3f433:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      d3f438:	48 8d 05 c5 01 00 00 	lea    rax,[rip+0x1c5]        # d3f604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc68a>
      d3f43f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      d3f444:	49 8d 9f d8 00 00 00 	lea    rbx,[r15+0xd8]
      d3f44b:	48 89 df             	mov    rdi,rbx
      d3f44e:	e8 59 d7 ff ff       	call   d3cbac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9c32>
      d3f453:	41 80 bf c4 01 00 00 	cmp    BYTE PTR [r15+0x1c4],0x0
      d3f45a:	00 
      d3f45b:	0f 85 e8 00 00 00    	jne    d3f549 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5cf>
      d3f461:	49 83 c7 08          	add    r15,0x8
      d3f465:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d3f46a:	4c 89 fe             	mov    rsi,r15
      d3f46d:	e8 e8 c9 f4 ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      d3f472:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      d3f477:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      d3f47c:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      d3f481:	48 85 c0             	test   rax,rax
      d3f484:	74 05                	je     d3f48b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc511>
      d3f486:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      d3f48b:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      d3f490:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      d3f495:	e8 38 7d d6 ff       	call   aa71d2 <JNI_OnUnload@@Base+0x2ea9f>

### FDE 0xd95396..0xd954a6

### FDE 0xec1cc2..0xec29bb

### FDE 0xef91cc..0xefe62b
#### store 0xefa297: mov    QWORD PTR [r14+0x40],rax
      efa257:	4c 89 e8             	mov    rax,r13
      efa25a:	48 83 c0 18          	add    rax,0x18
      efa25e:	48 89 e9             	mov    rcx,rbp
      efa261:	48 83 c1 18          	add    rcx,0x18
      efa265:	66 0f ef c0          	pxor   xmm0,xmm0
      efa269:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
      efa26f:	48 8d 15 f2 31 90 00 	lea    rdx,[rip+0x9031f2]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa276:	49 89 16             	mov    QWORD PTR [r14],rdx
      efa279:	4d 89 f4             	mov    r12,r14
      efa27c:	49 83 c4 18          	add    r12,0x18
      efa280:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
      efa286:	48 8d 15 03 ad 94 00 	lea    rdx,[rip+0x94ad03]        # 1844f90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1678>
      efa28d:	49 89 56 18          	mov    QWORD PTR [r14+0x18],rdx
      efa291:	f3 41 0f 7f 46 30    	movdqu XMMWORD PTR [r14+0x30],xmm0
      efa297:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      efa29b:	4d 89 6e 48          	mov    QWORD PTR [r14+0x48],r13
      efa29f:	f3 41 0f 7f 46 50    	movdqu XMMWORD PTR [r14+0x50],xmm0
      efa2a5:	49 89 4e 60          	mov    QWORD PTR [r14+0x60],rcx
      efa2a9:	49 89 6e 68          	mov    QWORD PTR [r14+0x68],rbp
      efa2ad:	f3 41 0f 7f 46 70    	movdqu XMMWORD PTR [r14+0x70],xmm0
      efa2b3:	f3 41 0f 7f 86 80 00 	movdqu XMMWORD PTR [r14+0x80],xmm0
      efa2ba:	00 00 
      efa2bc:	31 ff                	xor    edi,edi
      efa2be:	e8 c3 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2c3:	31 ff                	xor    edi,edi
      efa2c5:	e8 bc 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2ca:	31 ff                	xor    edi,edi
      efa2cc:	e8 b5 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2d1:	31 ff                	xor    edi,edi
      efa2d3:	e8 ae 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2d8:	31 ff                	xor    edi,edi
      efa2da:	e8 a7 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2df:	31 ff                	xor    edi,edi
      efa2e1:	e8 a0 41 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa2e6:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      efa2ea:	48 85 ff             	test   rdi,rdi
#### store 0xefa3c2: mov    QWORD PTR [rbx+0x40],rcx
      efa386:	48 89 e9             	mov    rcx,rbp
      efa389:	48 83 c1 18          	add    rcx,0x18
      efa38d:	66 0f ef c0          	pxor   xmm0,xmm0
      efa391:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      efa396:	48 8d 15 a3 10 93 00 	lea    rdx,[rip+0x9310a3]        # 182b440 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7a70>
      efa39d:	48 89 13             	mov    QWORD PTR [rbx],rdx
      efa3a0:	49 89 df             	mov    r15,rbx
      efa3a3:	49 83 c7 18          	add    r15,0x18
      efa3a7:	48 8d 15 3a ac 94 00 	lea    rdx,[rip+0x94ac3a]        # 1844fe8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16d0>
      efa3ae:	48 89 53 18          	mov    QWORD PTR [rbx+0x18],rdx
      efa3b2:	4c 89 63 20          	mov    QWORD PTR [rbx+0x20],r12
      efa3b6:	4c 89 73 28          	mov    QWORD PTR [rbx+0x28],r14
      efa3ba:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
      efa3be:	4c 89 6b 38          	mov    QWORD PTR [rbx+0x38],r13
      efa3c2:	48 89 4b 40          	mov    QWORD PTR [rbx+0x40],rcx
      efa3c6:	48 89 6b 48          	mov    QWORD PTR [rbx+0x48],rbp
      efa3ca:	31 ff                	xor    edi,edi
      efa3cc:	e8 b5 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa3d1:	31 ff                	xor    edi,edi
      efa3d3:	e8 ae 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa3d8:	31 ff                	xor    edi,edi
      efa3da:	e8 a7 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa3df:	4c 89 bc 24 10 06 00 	mov    QWORD PTR [rsp+0x610],r15
      efa3e6:	00 
      efa3e7:	48 8b bc 24 18 06 00 	mov    rdi,QWORD PTR [rsp+0x618]
      efa3ee:	00 
      efa3ef:	48 89 9c 24 18 06 00 	mov    QWORD PTR [rsp+0x618],rbx
      efa3f6:	00 
      efa3f7:	e8 8a 40 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efa3fc:	6a 20                	push   0x20
      efa3fe:	5f                   	pop    rdi
      efa3ff:	e8 fc 3a 8f 00       	call   17edf00 <_Znwm@plt>
      efa404:	66 0f ef c0          	pxor   xmm0,xmm0
      efa408:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efa40d:	48 8d 0d 54 30 90 00 	lea    rcx,[rip+0x903054]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      efa414:	48 89 08             	mov    QWORD PTR [rax],rcx

### FDE 0xefe62b..0xefe803

### FDE 0xefe8eb..0xefea32

### FDE 0xf23eb6..0xf242ba

### FDE 0xf242ba..0xf2468f

### FDE 0xf24690..0xf2494c

### FDE 0xf249a6..0xf24bfe

### FDE 0xf24bfe..0xf24c53

### FDE 0xf24c54..0xf25034

### FDE 0xf250b0..0xf251e7
#### store 0xf2511d: mov    QWORD PTR [r14+0x40],rax
      f250e5:	41 5f                	pop    r15
      f250e7:	c3                   	ret
      f250e8:	4c 8b 66 10          	mov    r12,QWORD PTR [rsi+0x10]
      f250ec:	bf 68 01 00 00       	mov    edi,0x168
      f250f1:	e8 0a 8e 8c 00       	call   17edf00 <_Znwm@plt>
      f250f6:	49 89 c6             	mov    r14,rax
      f250f9:	0f 57 c0             	xorps  xmm0,xmm0
      f250fc:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f25100:	48 8d 05 b9 56 91 00 	lea    rax,[rip+0x9156b9]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f25107:	49 89 06             	mov    QWORD PTR [r14],rax
      f2510a:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
      f2510f:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
      f25114:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
      f25118:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      f2511d:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      f25121:	48 85 c0             	test   rax,rax
      f25124:	74 05                	je     f2512b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec541>
      f25126:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f2512b:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      f2512f:	48 8d 05 5a 51 91 00 	lea    rax,[rip+0x91515a]        # 183a290 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc228>
      f25136:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      f2513a:	48 8d 05 3f 53 91 00 	lea    rax,[rip+0x91533f]        # 183a480 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc418>
      f25141:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      f25145:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      f25149:	49 8d 74 24 30       	lea    rsi,[r12+0x30]
      f2514e:	e8 71 2a ff ff       	call   f17bc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdefda>
      f25153:	4c 89 f6             	mov    rsi,r14
      f25156:	48 83 c6 18          	add    rsi,0x18
      f2515a:	49 8b 84 24 28 01 00 	mov    rax,QWORD PTR [r12+0x128]
      f25161:	00 
      f25162:	49 89 86 40 01 00 00 	mov    QWORD PTR [r14+0x140],rax
      f25169:	49 8b 84 24 30 01 00 	mov    rax,QWORD PTR [r12+0x130]
      f25170:	00 
      f25171:	49 89 86 48 01 00 00 	mov    QWORD PTR [r14+0x148],rax
      f25178:	48 85 c0             	test   rax,rax
      f2517b:	74 05                	je     f25182 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec598>

### FDE 0xf25a44..0xf25b1a

### FDE 0xf25fc6..0xf26894

### FDE 0xf27620..0xf27a31

### FDE 0xf29268..0xf298c7

### FDE 0xf298ec..0xf29a02

### FDE 0xf2a258..0xf2a5ea

### FDE 0xf2a9d8..0xf2adac

### FDE 0xf2adac..0xf2b1e9

### FDE 0xf2b258..0xf2b440

### FDE 0xf2b440..0xf2b54f

### FDE 0xf2b550..0xf2b90a
#### store 0xf2b725: mov    QWORD PTR [rsp+0x40],r13
      f2b6f1:	74 05                	je     f2b6f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2b0e>
      f2b6f3:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      f2b6f8:	4c 89 f7             	mov    rdi,r14
      f2b6fb:	e8 b2 2d b7 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      f2b700:	4c 89 f7             	mov    rdi,r14
      f2b703:	e8 7e 2d b7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f2b708:	eb 10                	jmp    f2b71a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2b30>
      f2b70a:	66 0f ef c0          	pxor   xmm0,xmm0
      f2b70e:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
      f2b714:	45 31 f6             	xor    r14d,r14d
      f2b717:	45 31 ff             	xor    r15d,r15d
      f2b71a:	48 89 df             	mov    rdi,rbx
      f2b71d:	e8 06 9c ff ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>
      f2b722:	4c 8b 2b             	mov    r13,QWORD PTR [rbx]
      f2b725:	4c 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],r13
      f2b72a:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
      f2b72e:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
      f2b733:	4d 85 e4             	test   r12,r12
      f2b736:	74 12                	je     f2b74a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2b60>
      f2b738:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      f2b73e:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      f2b744:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      f2b74a:	4d 85 ff             	test   r15,r15
      f2b74d:	74 66                	je     f2b7b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2bcb>
      f2b74f:	6a 20                	push   0x20
      f2b751:	5f                   	pop    rdi
      f2b752:	e8 a9 27 8c 00       	call   17edf00 <_Znwm@plt>
      f2b757:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
      f2b75b:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
      f2b75f:	48 8d 0d 62 0c 00 00 	lea    rcx,[rip+0xc62]        # f2c3c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf37de>
      f2b766:	48 89 08             	mov    QWORD PTR [rax],rcx
      f2b769:	48 8d 0d 48 41 c1 ff 	lea    rcx,[rip+0xffffffffffc14148]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      f2b770:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      f2b774:	4c 89 ff             	mov    rdi,r15
      f2b777:	48 89 c6             	mov    rsi,rax
      f2b77a:	e8 45 e0 f9 ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>

### FDE 0xf2b930..0xf2bdd0

### FDE 0xf2bdd0..0xf2c37d

### FDE 0xf2c50a..0xf2c5e0

### FDE 0xf2c5e0..0xf2c6b2
#### store 0xf2c640: mov    QWORD PTR [rax+0x40],rcx
      f2c60f:	c3                   	ret
      f2c610:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
      f2c614:	6a 68                	push   0x68
      f2c616:	5f                   	pop    rdi
      f2c617:	e8 e4 18 8c 00       	call   17edf00 <_Znwm@plt>
      f2c61c:	48 89 c2             	mov    rdx,rax
      f2c61f:	0f 57 c0             	xorps  xmm0,xmm0
      f2c622:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f2c626:	48 8d 0d 93 e1 90 00 	lea    rcx,[rip+0x90e193]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f2c62d:	48 89 08             	mov    QWORD PTR [rax],rcx
      f2c630:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      f2c634:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
      f2c638:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      f2c63c:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
      f2c640:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      f2c644:	48 85 c9             	test   rcx,rcx
      f2c647:	74 05                	je     f2c64e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3a64>
      f2c649:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f2c64e:	48 83 c0 18          	add    rax,0x18
      f2c652:	48 8d 0d d7 e1 90 00 	lea    rcx,[rip+0x90e1d7]        # 183a830 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc7c8>
      f2c659:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      f2c65d:	48 8d 0d bc e3 90 00 	lea    rcx,[rip+0x90e3bc]        # 183aa20 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc9b8>
      f2c664:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      f2c668:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
      f2c66c:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      f2c670:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
      f2c674:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      f2c678:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
      f2c67c:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
      f2c680:	48 85 c9             	test   rcx,rcx
      f2c683:	74 05                	je     f2c68a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf3aa0>
      f2c685:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f2c68a:	41 8a 4e 48          	mov    cl,BYTE PTR [r14+0x48]
      f2c68e:	88 4a 60             	mov    BYTE PTR [rdx+0x60],cl
      f2c691:	48 89 df             	mov    rdi,rbx
      f2c694:	48 89 c6             	mov    rsi,rax

### FDE 0xf2e0e0..0xf2e608

### FDE 0xf2ebf4..0xf2ee4c

### FDE 0xf2ee4c..0xf2f71f

### FDE 0xf2fc24..0xf301bf

### FDE 0xf301c0..0xf30296

### FDE 0xf30c98..0xf31432
#### store 0xf30dd6: mov    QWORD PTR [rax+0x40],rcx
      f30d97:	e8 64 d1 8b 00       	call   17edf00 <_Znwm@plt>
      f30d9c:	48 89 c2             	mov    rdx,rax
      f30d9f:	0f 57 c0             	xorps  xmm0,xmm0
      f30da2:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f30da6:	48 8d 0d 13 9a 90 00 	lea    rcx,[rip+0x909a13]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f30dad:	48 89 08             	mov    QWORD PTR [rax],rcx
      f30db0:	48 8d 0d 11 28 91 00 	lea    rcx,[rip+0x912811]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      f30db7:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      f30dbb:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      f30dbf:	48 8d 0d d2 a0 90 00 	lea    rcx,[rip+0x90a0d2]        # 183ae98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xce30>
      f30dc6:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      f30dca:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      f30dce:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      f30dd2:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      f30dd6:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      f30dda:	48 85 c9             	test   rcx,rcx
      f30ddd:	74 05                	je     f30de4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf81fa>
      f30ddf:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f30de4:	48 83 c0 18          	add    rax,0x18
      f30de8:	48 8d 0d 91 9e 90 00 	lea    rcx,[rip+0x909e91]        # 183ac80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xcc18>
      f30def:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      f30df3:	48 8d 0d 76 a0 90 00 	lea    rcx,[rip+0x90a076]        # 183ae70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xce08>
      f30dfa:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      f30dfe:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
      f30e02:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      f30e06:	48 8b 4b 38          	mov    rcx,QWORD PTR [rbx+0x38]
      f30e0a:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      f30e0e:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      f30e12:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
      f30e16:	48 85 c9             	test   rcx,rcx
      f30e19:	74 05                	je     f30e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8236>
      f30e1b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f30e20:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
      f30e27:	00 
      f30e28:	4c 89 ff             	mov    rdi,r15
      f30e2b:	48 89 c6             	mov    rsi,rax
#### store 0xf30ecd: mov    QWORD PTR [rsp+0x40],rax
      f30e98:	00 00 
      f30e9a:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      f30ea1:	00 
      f30ea2:	4c 8b a4 24 c8 00 00 	mov    r12,QWORD PTR [rsp+0xc8]
      f30ea9:	00 
      f30eaa:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      f30eb1:	00 
      f30eb2:	4d 85 e4             	test   r12,r12
      f30eb5:	74 06                	je     f30ebd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf82d3>
      f30eb7:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      f30ebd:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      f30ec4:	00 
      f30ec5:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
      f30ecc:	00 
      f30ecd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      f30ed2:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      f30ed9:	00 
      f30eda:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      f30edf:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      f30ee6:	00 00 
      f30ee8:	bf 80 00 00 00       	mov    edi,0x80
      f30eed:	e8 0e d0 8b 00       	call   17edf00 <_Znwm@plt>
      f30ef2:	49 89 c5             	mov    r13,rax
      f30ef5:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
      f30efa:	0f 57 c0             	xorps  xmm0,xmm0
      f30efd:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f30f01:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      f30f08:	00 00 
      f30f0a:	48 8d 05 97 95 90 00 	lea    rax,[rip+0x909597]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
      f30f11:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      f30f15:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      f30f1c:	00 
      f30f1d:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      f30f24:	00 
      f30f25:	0f 29 84 24 20 01 00 	movaps XMMWORD PTR [rsp+0x120],xmm0
      f30f2c:	00 

### FDE 0xf316ee..0xf31ad7

### FDE 0xf31ad8..0xf32353
#### store 0xf32130: mov    QWORD PTR [rsp+0x40],r13
      f320fc:	74 05                	je     f32103 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf9519>
      f320fe:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      f32103:	4c 89 f7             	mov    rdi,r14
      f32106:	e8 a7 c3 b6 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      f3210b:	4c 89 f7             	mov    rdi,r14
      f3210e:	e8 73 c3 b6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f32113:	eb 10                	jmp    f32125 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf953b>
      f32115:	66 0f ef c0          	pxor   xmm0,xmm0
      f32119:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
      f3211f:	45 31 f6             	xor    r14d,r14d
      f32122:	45 31 e4             	xor    r12d,r12d
      f32125:	48 89 df             	mov    rdi,rbx
      f32128:	e8 fb 31 ff ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>
      f3212d:	4c 8b 2b             	mov    r13,QWORD PTR [rbx]
      f32130:	4c 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],r13
      f32135:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
      f32139:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
      f3213e:	4d 85 ff             	test   r15,r15
      f32141:	74 0f                	je     f32152 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf9568>
      f32143:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      f32148:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      f3214d:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      f32152:	4d 85 e4             	test   r12,r12
      f32155:	74 6a                	je     f321c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf95d7>
      f32157:	6a 20                	push   0x20
      f32159:	5f                   	pop    rdi
      f3215a:	e8 a1 bd 8b 00       	call   17edf00 <_Znwm@plt>
      f3215f:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
      f32163:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
      f32167:	48 8d 0d 24 51 ff ff 	lea    rcx,[rip+0xffffffffffff5124]        # f27292 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee6a8>
      f3216e:	48 89 08             	mov    QWORD PTR [rax],rcx
      f32171:	48 8d 0d 40 d7 c0 ff 	lea    rcx,[rip+0xffffffffffc0d740]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      f32178:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      f3217c:	4c 89 e7             	mov    rdi,r12
      f3217f:	48 89 c6             	mov    rsi,rax
      f32182:	e8 3d 76 f9 ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>

### FDE 0xf32c9c..0xf32d72

### FDE 0xf332dc..0xf33b12
#### store 0xf33411: mov    QWORD PTR [rax+0x40],rcx
      f333d2:	e8 29 ab 8b 00       	call   17edf00 <_Znwm@plt>
      f333d7:	48 89 c2             	mov    rdx,rax
      f333da:	0f 57 c0             	xorps  xmm0,xmm0
      f333dd:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f333e1:	48 8d 0d d8 73 90 00 	lea    rcx,[rip+0x9073d8]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f333e8:	48 89 08             	mov    QWORD PTR [rax],rcx
      f333eb:	48 8d 0d d6 01 91 00 	lea    rcx,[rip+0x9101d6]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      f333f2:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      f333f6:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      f333fa:	48 8d 0d e7 7e 90 00 	lea    rcx,[rip+0x907ee7]        # 183b2e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd280>
      f33401:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      f33405:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      f33409:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      f3340d:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      f33411:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      f33415:	48 85 c9             	test   rcx,rcx
      f33418:	74 05                	je     f3341f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa835>
      f3341a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f3341f:	48 8d 0d aa 7c 90 00 	lea    rcx,[rip+0x907caa]        # 183b0d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd068>
      f33426:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      f3342a:	48 8d 0d 8f 7e 90 00 	lea    rcx,[rip+0x907e8f]        # 183b2c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd258>
      f33431:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      f33435:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
      f33439:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      f3343d:	48 8b 4b 38          	mov    rcx,QWORD PTR [rbx+0x38]
      f33441:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      f33445:	48 85 c9             	test   rcx,rcx
      f33448:	74 05                	je     f3344f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa865>
      f3344a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f3344f:	48 83 c0 18          	add    rax,0x18
      f33453:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      f33457:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
      f3345b:	48 8b 4b 48          	mov    rcx,QWORD PTR [rbx+0x48]
      f3345f:	48 89 4a 60          	mov    QWORD PTR [rdx+0x60],rcx
      f33463:	48 85 c9             	test   rcx,rcx
      f33466:	74 05                	je     f3346d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfa883>
#### store 0xf335f5: mov    QWORD PTR [rsp+0x40],r12
      f335bd:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      f335c2:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
      f335c6:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
      f335cd:	00 
      f335ce:	0f 57 c0             	xorps  xmm0,xmm0
      f335d1:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
      f335d5:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      f335da:	4c 89 e7             	mov    rdi,r12
      f335dd:	4c 89 fe             	mov    rsi,r15
      f335e0:	e8 35 25 ff ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
      f335e5:	4c 89 ff             	mov    rdi,r15
      f335e8:	e8 25 1d ff ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      f335ed:	48 89 df             	mov    rdi,rbx
      f335f0:	e8 59 02 fe ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
      f335f5:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      f335fa:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13
      f335ff:	31 ff                	xor    edi,edi
      f33601:	e8 16 ae b6 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      f33606:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      f3360d:	00 
      f3360e:	e8 3b 02 fe ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
      f33613:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      f33618:	e8 5f 89 ed ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      f3361d:	44 8b 34 24          	mov    r14d,DWORD PTR [rsp]
      f33621:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      f33626:	e9 38 03 00 00       	jmp    f33963 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfad79>
      f3362b:	44 89 34 24          	mov    DWORD PTR [rsp],r14d
      f3362f:	49 83 c5 20          	add    r13,0x20
      f33633:	4c 8b b4 24 30 01 00 	mov    r14,QWORD PTR [rsp+0x130]
      f3363a:	00 
      f3363b:	4c 8b bc 24 38 01 00 	mov    r15,QWORD PTR [rsp+0x138]
      f33642:	00 
      f33643:	48 8b ac 24 40 01 00 	mov    rbp,QWORD PTR [rsp+0x140]
      f3364a:	00 
      f3364b:	0f 57 c0             	xorps  xmm0,xmm0
      f3364e:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
#### store 0xf33708: mov    QWORD PTR [rsp+0x40],r12
      f336cf:	41 0f 29 4d 00       	movaps XMMWORD PTR [r13+0x0],xmm1
      f336d4:	0f 29 40 e0          	movaps XMMWORD PTR [rax-0x20],xmm0
      f336d8:	41 0f 29 55 10       	movaps XMMWORD PTR [r13+0x10],xmm2
      f336dd:	0f 29 40 f0          	movaps XMMWORD PTR [rax-0x10],xmm0
      f336e1:	4d 89 75 20          	mov    QWORD PTR [r13+0x20],r14
      f336e5:	4d 89 7d 28          	mov    QWORD PTR [r13+0x28],r15
      f336e9:	49 89 6d 30          	mov    QWORD PTR [r13+0x30],rbp
      f336ed:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      f336f0:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
      f336f5:	4c 89 e7             	mov    rdi,r12
      f336f8:	4c 89 ee             	mov    rsi,r13
      f336fb:	e8 1a 24 ff ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
      f33700:	4c 89 ef             	mov    rdi,r13
      f33703:	e8 0a 1c ff ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      f33708:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      f3370d:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
      f33712:	31 ff                	xor    edi,edi
      f33714:	e8 03 ad b6 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      f33719:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      f33720:	00 
      f33721:	e8 ec 1b ff ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      f33726:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      f3372d:	00 
      f3372e:	e8 49 88 ed ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      f33733:	44 8b 34 24          	mov    r14d,DWORD PTR [rsp]
      f33737:	e9 37 02 00 00       	jmp    f33973 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfad89>
      f3373c:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      f33740:	48 83 c3 08          	add    rbx,0x8
      f33744:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      f33749:	48 89 de             	mov    rsi,rbx
      f3374c:	4c 89 e2             	mov    rdx,r12
      f3374f:	ff 50 10             	call   QWORD PTR [rax+0x10]
      f33752:	0f 28 84 24 30 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x130]
      f33759:	00 
      f3375a:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
      f33761:	00 
#### store 0xf3391b: mov    QWORD PTR [rsp+0x40],r12
      f338e2:	e8 13 21 ff ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>
      f338e7:	48 8d 9c 24 50 01 00 	lea    rbx,[rsp+0x150]
      f338ee:	00 
      f338ef:	48 89 df             	mov    rdi,rbx
      f338f2:	e8 c1 56 ff ff       	call   f28fb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf03ce>
      f338f7:	0f 57 c0             	xorps  xmm0,xmm0
      f338fa:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
      f338fd:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      f33902:	48 8d 9c 24 50 01 00 	lea    rbx,[rsp+0x150]
      f33909:	00 
      f3390a:	48 89 de             	mov    rsi,rbx
      f3390d:	e8 0a 5f b8 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f33912:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      f33916:	e8 6b ab b6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f3391b:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      f33920:	48 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],rbp
      f33925:	48 85 ed             	test   rbp,rbp
      f33928:	74 05                	je     f3392f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfad45>
      f3392a:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      f3392f:	48 89 ef             	mov    rdi,rbp
      f33932:	e8 7b ab b6 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      f33937:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      f3393e:	00 
      f3393f:	e8 42 ab b6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f33944:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      f3394b:	00 
      f3394c:	e8 7f 56 ff ff       	call   f28fd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf03e6>
      f33951:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      f33956:	e8 2b ab b6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f3395b:	48 8b ac 24 b8 00 00 	mov    rbp,QWORD PTR [rsp+0xb8]
      f33962:	00 
      f33963:	4c 89 ff             	mov    rdi,r15
      f33966:	e8 1b ab b6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f3396b:	48 89 ef             	mov    rdi,rbp
      f3396e:	e8 13 ab b6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f33973:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]

### FDE 0xf344f8..0xf34ae2

### FDE 0xf34ae2..0xf351f2

### FDE 0xf35624..0xf35baf

### FDE 0xf36404..0xf36a81

### FDE 0xf36a82..0xf36c27

### FDE 0xf370ac..0xf374e5

### FDE 0xf374e6..0xf375f5

### FDE 0xf379a2..0xf37b2f

### FDE 0xf37b30..0xf37c78

### FDE 0xf37e3a..0xf37f82

### FDE 0xf37f82..0xf38058

### FDE 0xf38058..0xf381f4
#### store 0xf380c6: mov    QWORD PTR [r15+0x40],rax
      f3808e:	c3                   	ret
      f3808f:	4c 8b 6e 10          	mov    r13,QWORD PTR [rsi+0x10]
      f38093:	bf 38 01 00 00       	mov    edi,0x138
      f38098:	e8 63 5e 8b 00       	call   17edf00 <_Znwm@plt>
      f3809d:	49 89 c7             	mov    r15,rax
      f380a0:	49 89 c6             	mov    r14,rax
      f380a3:	0f 57 c0             	xorps  xmm0,xmm0
      f380a6:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
      f380ab:	48 8d 05 0e 27 90 00 	lea    rax,[rip+0x90270e]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f380b2:	49 89 07             	mov    QWORD PTR [r15],rax
      f380b5:	41 0f 11 47 28       	movups XMMWORD PTR [r15+0x28],xmm0
      f380ba:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
      f380be:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
      f380c2:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
      f380c6:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      f380ca:	48 85 c0             	test   rax,rax
      f380cd:	74 05                	je     f380d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xff4ea>
      f380cf:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f380d4:	48 8d 05 7d 34 90 00 	lea    rax,[rip+0x90347d]        # 183b558 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd4f0>
      f380db:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      f380df:	48 8d 05 62 36 90 00 	lea    rax,[rip+0x903662]        # 183b748 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd6e0>
      f380e6:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      f380ea:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
      f380ee:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      f380f2:	49 8b 45 38          	mov    rax,QWORD PTR [r13+0x38]
      f380f6:	49 89 46 50          	mov    QWORD PTR [r14+0x50],rax
      f380fa:	48 85 c0             	test   rax,rax
      f380fd:	74 05                	je     f38104 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xff51a>
      f380ff:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f38104:	4d 8d 67 20          	lea    r12,[r15+0x20]
      f38108:	41 0f b7 45 40       	movzx  eax,WORD PTR [r13+0x40]
      f3810d:	66 41 89 46 58       	mov    WORD PTR [r14+0x58],ax
      f38112:	49 8d 7f 60          	lea    rdi,[r15+0x60]
      f38116:	49 8d 75 48          	lea    rsi,[r13+0x48]
      f3811a:	e8 f1 3e 73 00       	call   166c010 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2017c>
      f3811f:	49 8b 85 e8 00 00 00 	mov    rax,QWORD PTR [r13+0xe8]

### FDE 0xf38ccc..0xf38f9d

### FDE 0xf3a96e..0xf3adb6

### FDE 0xf3b4be..0xf3b833

### FDE 0xf3c714..0xf3cac1

### FDE 0xf3d672..0xf3d7b1

### FDE 0xf400c8..0xf401d9

### FDE 0xf401da..0xf40316

### FDE 0xf40316..0xf404c5

### FDE 0xf41ab4..0xf41b8a

### FDE 0xf41b8a..0xf42176

### FDE 0xf42176..0xf4266e

### FDE 0xf4266e..0xf43425

### FDE 0xf43426..0xf4358a

### FDE 0xf435c8..0xf43a9b
#### store 0xf43824: mov    QWORD PTR [rsp+0x40],r13
      f437e6:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      f437eb:	48 89 c6             	mov    rsi,rax
      f437ee:	e8 3d 16 00 00       	call   f44e30 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c246>
      f437f3:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      f437f8:	4c 89 e7             	mov    rdi,r12
      f437fb:	e8 c4 70 eb ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
      f43800:	0f 57 c0             	xorps  xmm0,xmm0
      f43803:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      f43808:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      f4380d:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      f43812:	4c 89 e6             	mov    rsi,r12
      f43815:	e8 02 60 b7 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f4381a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      f4381f:	e8 62 ac b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f43824:	4c 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],r13
      f43829:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
      f4382e:	4d 85 ff             	test   r15,r15
      f43831:	74 05                	je     f43838 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ac4e>
      f43833:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      f43838:	4c 89 ff             	mov    rdi,r15
      f4383b:	e8 72 ac b5 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      f43840:	4c 89 ff             	mov    rdi,r15
      f43843:	e8 3e ac b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f43848:	4d 85 ed             	test   r13,r13
      f4384b:	40 0f 94 c5          	sete   bpl
      f4384f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f43854:	4c 89 f6             	mov    rsi,r14
      f43857:	e8 fe 85 d4 ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      f4385c:	40 84 ed             	test   bpl,bpl
      f4385f:	74 12                	je     f43873 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ac89>
      f43861:	0f 57 c0             	xorps  xmm0,xmm0
      f43864:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      f43869:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
      f4386e:	e9 12 01 00 00       	jmp    f43985 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ad9b>
      f43873:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      f4387a:	00 

### FDE 0xf43a9c..0xf43bab

### FDE 0xf448e2..0xf449d9
#### store 0xf44945: mov    QWORD PTR [r14+0x40],rax
      f44913:	41 5c                	pop    r12
      f44915:	41 5e                	pop    r14
      f44917:	41 5f                	pop    r15
      f44919:	c3                   	ret
      f4491a:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      f4491e:	bf 90 00 00 00       	mov    edi,0x90
      f44923:	e8 d8 95 8a 00       	call   17edf00 <_Znwm@plt>
      f44928:	49 89 c6             	mov    r14,rax
      f4492b:	0f 57 c0             	xorps  xmm0,xmm0
      f4492e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f44932:	48 8d 05 5f 75 8f 00 	lea    rax,[rip+0x8f755f]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f44939:	49 89 06             	mov    QWORD PTR [r14],rax
      f4493c:	41 0f 29 46 30       	movaps XMMWORD PTR [r14+0x30],xmm0
      f44941:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      f44945:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      f44949:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      f4494d:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      f44951:	48 85 c0             	test   rax,rax
      f44954:	74 05                	je     f4495b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bd71>
      f44956:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f4495b:	4d 8d 66 28          	lea    r12,[r14+0x28]
      f4495f:	48 8d 05 ea 70 8f 00 	lea    rax,[rip+0x8f70ea]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f44966:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      f4496a:	48 8d 05 c7 72 8f 00 	lea    rax,[rip+0x8f72c7]        # 183bc38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbd0>
      f44971:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      f44975:	41 8a 47 30          	mov    al,BYTE PTR [r15+0x30]
      f44979:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
      f4497d:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      f44981:	49 83 c7 40          	add    r15,0x40
      f44985:	4c 89 fe             	mov    rsi,r15
      f44988:	e8 03 59 b3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      f4498d:	4c 89 f6             	mov    rsi,r14
      f44990:	48 83 c6 20          	add    rsi,0x20
      f44994:	48 89 df             	mov    rdi,rbx
      f44997:	4c 89 f2             	mov    rdx,r14
      f4499a:	e8 65 9e fb ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>

### FDE 0xf450bc..0xf451d6

### FDE 0xf451fa..0xf452f6

### FDE 0xf45be8..0xf45f23

### FDE 0xf465f6..0xf469b2

### FDE 0xf47fde..0xf4857f

### FDE 0xf48580..0xf48759

### FDE 0xf4875a..0xf48bd0

### FDE 0xf48e60..0xf49034

### FDE 0xf490a6..0xf49663

### FDE 0xf49664..0xf499e9

### FDE 0xf49a8e..0xf4a14f

### FDE 0xf4a368..0xf4a62d

### FDE 0xf4a62e..0xf4abcb

### FDE 0xf4abcc..0xf4afd5

### FDE 0xf4afd6..0xf4b21e

### FDE 0xf4b21e..0xf4ba18
#### store 0xf4b6b9: mov    QWORD PTR [rsp+0x40],rbx
      f4b67f:	e8 76 a3 fd ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>
      f4b684:	4c 8d b4 24 d0 05 00 	lea    r14,[rsp+0x5d0]
      f4b68b:	00 
      f4b68c:	4c 89 f7             	mov    rdi,r14
      f4b68f:	e8 30 f2 ea ff       	call   dfa8c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc794a>
      f4b694:	0f 57 c0             	xorps  xmm0,xmm0
      f4b697:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      f4b69b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      f4b6a0:	4c 8d b4 24 d0 05 00 	lea    r14,[rsp+0x5d0]
      f4b6a7:	00 
      f4b6a8:	4c 89 f6             	mov    rsi,r14
      f4b6ab:	e8 6c e1 b6 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f4b6b0:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      f4b6b4:	e8 cd 2d b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f4b6b9:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
      f4b6be:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13
      f4b6c3:	4d 85 ed             	test   r13,r13
      f4b6c6:	74 05                	je     f4b6cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x112ae3>
      f4b6c8:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      f4b6cd:	4c 89 ef             	mov    rdi,r13
      f4b6d0:	e8 dd 2d b5 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      f4b6d5:	4c 89 ef             	mov    rdi,r13
      f4b6d8:	e8 a9 2d b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f4b6dd:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
      f4b6e1:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      f4b6e6:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]
      f4b6eb:	4c 89 f6             	mov    rsi,r14
      f4b6ee:	e8 c7 a3 fc ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
      f4b6f3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      f4b6f7:	e8 8a 2d b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f4b6fc:	4c 89 e7             	mov    rdi,r12
      f4b6ff:	e8 82 2d b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f4b704:	0f 57 c0             	xorps  xmm0,xmm0
      f4b707:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      f4b70b:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      f4b710:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]

### FDE 0xf4cc18..0xf4d0dc

### FDE 0xf4d5d2..0xf4d6e1

### FDE 0xf4d704..0xf4d7da

### FDE 0xf4e752..0xf4eabb
#### store 0xf4e7d4: mov    QWORD PTR [rbx+0x40],rax
      f4e794:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      f4e798:	bf 20 0c 00 00       	mov    edi,0xc20
      f4e79d:	e8 5e f7 89 00       	call   17edf00 <_Znwm@plt>
      f4e7a2:	48 89 c3             	mov    rbx,rax
      f4e7a5:	0f 57 c0             	xorps  xmm0,xmm0
      f4e7a8:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f4e7ac:	48 8d 05 e5 d6 8e 00 	lea    rax,[rip+0x8ed6e5]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f4e7b3:	48 89 03             	mov    QWORD PTR [rbx],rax
      f4e7b6:	48 8d 05 0b 4e 8f 00 	lea    rax,[rip+0x8f4e0b]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      f4e7bd:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f4e7c1:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
      f4e7c5:	48 8d 05 84 d9 8e 00 	lea    rax,[rip+0x8ed984]        # 183c150 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe0e8>
      f4e7cc:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      f4e7d0:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      f4e7d4:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f4e7d8:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      f4e7dc:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f4e7e0:	48 85 c0             	test   rax,rax
      f4e7e3:	74 05                	je     f4e7ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x115c00>
      f4e7e5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f4e7ea:	48 8d 05 4f d7 8e 00 	lea    rax,[rip+0x8ed74f]        # 183bf40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xded8>
      f4e7f1:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f4e7f5:	48 8d 05 2c d9 8e 00 	lea    rax,[rip+0x8ed92c]        # 183c128 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe0c0>
      f4e7fc:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      f4e800:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
      f4e804:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
      f4e808:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
      f4e80c:	49 8d 77 38          	lea    rsi,[r15+0x38]
      f4e810:	e8 59 04 00 00       	call   f4ec6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x116084>
      f4e815:	41 8a 47 68          	mov    al,BYTE PTR [r15+0x68]
      f4e819:	88 83 88 00 00 00    	mov    BYTE PTR [rbx+0x88],al
      f4e81f:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
      f4e823:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
      f4e82a:	4c 8d b3 90 00 00 00 	lea    r14,[rbx+0x90]
      f4e831:	49 8d 77 70          	lea    rsi,[r15+0x70]
      f4e835:	4c 89 f7             	mov    rdi,r14

### FDE 0xf4fb78..0xf508dc
#### store 0xf4fc97: mov    QWORD PTR [rsp+0x40],rbp
      f4fc5f:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      f4fc66:	00 
      f4fc67:	48 89 c6             	mov    rsi,rax
      f4fc6a:	e8 46 bd 60 00       	call   155b9b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a0f39>
      f4fc6f:	48 8d b4 24 70 02 00 	lea    rsi,[rsp+0x270]
      f4fc76:	00 
      f4fc77:	48 89 df             	mov    rdi,rbx
      f4fc7a:	e8 51 c5 00 00       	call   f5c1d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1235e6>
      f4fc7f:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
      f4fc86:	00 
      f4fc87:	e8 04 07 78 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
      f4fc8c:	8b 45 10             	mov    eax,DWORD PTR [rbp+0x10]
      f4fc8f:	a8 04                	test   al,0x4
      f4fc91:	0f 84 c5 04 00 00    	je     f5015c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x117572>
      f4fc97:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
      f4fc9c:	48 89 ef             	mov    rdi,rbp
      f4fc9f:	e8 9a 14 01 00       	call   f6113e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x128554>
      f4fca4:	48 89 c5             	mov    rbp,rax
      f4fca7:	4c 8b a4 24 b0 00 00 	mov    r12,QWORD PTR [rsp+0xb0]
      f4fcae:	00 
      f4fcaf:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      f4fcb6:	00 
      f4fcb7:	e8 5e b1 00 00       	call   f5ae1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x122230>
      f4fcbc:	48 8d 7d 18          	lea    rdi,[rbp+0x18]
      f4fcc0:	e8 45 4d be ff       	call   b34a0a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x819aa>
      f4fcc5:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      f4fcca:	8b 48 08             	mov    ecx,DWORD PTR [rax+0x8]
      f4fccd:	3b 48 04             	cmp    ecx,DWORD PTR [rax+0x4]
      f4fcd0:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      f4fcd5:	75 07                	jne    f4fcde <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1170f4>
      f4fcd7:	31 c9                	xor    ecx,ecx
      f4fcd9:	45 31 ed             	xor    r13d,r13d
      f4fcdc:	eb 08                	jmp    f4fce6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1170fc>
      f4fcde:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
      f4fce2:	4c 8b 2c ca          	mov    r13,QWORD PTR [rdx+rcx*8]
      f4fce6:	4c 89 ac 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r13

### FDE 0xf50aa4..0xf50efa

### FDE 0xf52404..0xf52591

### FDE 0xf52a08..0xf52ba3

### FDE 0xf54c52..0xf552f2

### FDE 0xf55582..0xf55d67

### FDE 0xf56480..0xf56ec3

### FDE 0xf5711e..0xf5736b

### FDE 0xf5797e..0xf57b79

### FDE 0xf58744..0xf58d68

### FDE 0xf58e38..0xf591c5

### FDE 0xf59364..0xf597ec

### FDE 0xf597ec..0xf59e20

### FDE 0xf6b12a..0xf6b516

### FDE 0xf6bec4..0xf6c2b4

### FDE 0xf6c460..0xf6c536

### FDE 0xf6c536..0xf6cacc

### FDE 0xf6cd42..0xf6d4ba
#### store 0xf6ce84: mov    QWORD PTR [rax+0x40],rcx
      f6ce46:	0f 57 c0             	xorps  xmm0,xmm0
      f6ce49:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f6ce4d:	48 8d 0d 6c d9 8c 00 	lea    rcx,[rip+0x8cd96c]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f6ce54:	48 89 08             	mov    QWORD PTR [rax],rcx
      f6ce57:	48 89 c6             	mov    rsi,rax
      f6ce5a:	48 83 c6 18          	add    rsi,0x18
      f6ce5e:	48 8d 0d 63 67 8d 00 	lea    rcx,[rip+0x8d6763]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      f6ce65:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      f6ce69:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      f6ce6d:	48 8d 0d 84 fa 8c 00 	lea    rcx,[rip+0x8cfa84]        # 183c8f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe890>
      f6ce74:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      f6ce78:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      f6ce7c:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      f6ce80:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      f6ce84:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      f6ce88:	48 85 c9             	test   rcx,rcx
      f6ce8b:	74 05                	je     f6ce92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1342a8>
      f6ce8d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      f6ce92:	48 8d 0d 47 f8 8c 00 	lea    rcx,[rip+0x8cf847]        # 183c6e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe678>
      f6ce99:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      f6ce9d:	48 8d 0d 2c fa 8c 00 	lea    rcx,[rip+0x8cfa2c]        # 183c8d0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe868>
      f6cea4:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      f6cea8:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
      f6ceaf:	00 
      f6ceb0:	4c 89 ff             	mov    rdi,r15
      f6ceb3:	48 89 c2             	mov    rdx,rax
      f6ceb6:	e8 49 19 f9 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      f6cebb:	31 ff                	xor    edi,edi
      f6cebd:	e8 5a 15 b3 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      f6cec2:	49 8b 2f             	mov    rbp,QWORD PTR [r15]
      f6cec5:	48 8d 7d 20          	lea    rdi,[rbp+0x20]
      f6cec9:	4c 8b 7d 20          	mov    r15,QWORD PTR [rbp+0x20]
      f6cecd:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
      f6ced1:	48 85 c0             	test   rax,rax
      f6ced4:	74 05                	je     f6cedb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1342f1>
      f6ced6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
#### store 0xf6cf55: mov    QWORD PTR [rsp+0x40],rax
      f6cf20:	00 00 
      f6cf22:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      f6cf29:	00 
      f6cf2a:	4c 8b a4 24 c8 00 00 	mov    r12,QWORD PTR [rsp+0xc8]
      f6cf31:	00 
      f6cf32:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      f6cf39:	00 
      f6cf3a:	4d 85 e4             	test   r12,r12
      f6cf3d:	74 06                	je     f6cf45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13435b>
      f6cf3f:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      f6cf45:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      f6cf4c:	00 
      f6cf4d:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
      f6cf54:	00 
      f6cf55:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      f6cf5a:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      f6cf61:	00 
      f6cf62:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      f6cf67:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      f6cf6e:	00 00 
      f6cf70:	bf 80 00 00 00       	mov    edi,0x80
      f6cf75:	e8 86 0f 88 00       	call   17edf00 <_Znwm@plt>
      f6cf7a:	49 89 c5             	mov    r13,rax
      f6cf7d:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
      f6cf82:	0f 57 c0             	xorps  xmm0,xmm0
      f6cf85:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f6cf89:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      f6cf90:	00 00 
      f6cf92:	48 8d 05 0f d5 8c 00 	lea    rax,[rip+0x8cd50f]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
      f6cf99:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      f6cf9d:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      f6cfa4:	00 
      f6cfa5:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      f6cfac:	00 
      f6cfad:	0f 29 84 24 20 01 00 	movaps XMMWORD PTR [rsp+0x120],xmm0
      f6cfb4:	00 

### FDE 0xf6de10..0xf6df26

### FDE 0xf6eec8..0xf6f1c6

### FDE 0xf6f1c6..0xf6f58a

### FDE 0xf6f58a..0xf6f7a4

### FDE 0xf6f7a4..0xf70041

### FDE 0xf700aa..0xf7024a

### FDE 0xf7024a..0xf70359

### FDE 0xf70870..0xf714a0

### FDE 0xf715fa..0xf716d0

### FDE 0xf716d0..0xf71820
#### store 0xf7173a: mov    QWORD PTR [rbx+0x40],rax
      f71705:	41 5f                	pop    r15
      f71707:	c3                   	ret
      f71708:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      f7170c:	bf a0 00 00 00       	mov    edi,0xa0
      f71711:	e8 ea c7 87 00       	call   17edf00 <_Znwm@plt>
      f71716:	48 89 c3             	mov    rbx,rax
      f71719:	0f 57 c0             	xorps  xmm0,xmm0
      f7171c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f71720:	48 8d 05 99 90 8c 00 	lea    rax,[rip+0x8c9099]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f71727:	48 89 03             	mov    QWORD PTR [rbx],rax
      f7172a:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      f7172e:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      f71732:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      f71736:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      f7173a:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f7173e:	48 85 c0             	test   rax,rax
      f71741:	74 05                	je     f71748 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x138b5e>
      f71743:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f71748:	48 8d 05 51 b4 8c 00 	lea    rax,[rip+0x8cb451]        # 183cba0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xeb38>
      f7174f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      f71753:	48 8d 05 36 b6 8c 00 	lea    rax,[rip+0x8cb636]        # 183cd90 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xed28>
      f7175a:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f7175e:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
      f71762:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f71766:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
      f7176a:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
      f7176e:	48 85 c0             	test   rax,rax
      f71771:	74 05                	je     f71778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x138b8e>
      f71773:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f71778:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
      f7177c:	49 8d 77 40          	lea    rsi,[r15+0x40]
      f71780:	e8 d3 00 00 00       	call   f71858 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x138c6e>
      f71785:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
      f71789:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
      f7178d:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
      f71791:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax

### FDE 0xf71bae..0xf720c4

### FDE 0xf7bfc8..0xf7c0a1

### FDE 0xf7c0dc..0xf7c2af

### FDE 0xf7c2b0..0xf7c472

### FDE 0xf7c472..0xf7c5fe

### FDE 0xf7c5fe..0xf7c78a

### FDE 0xf7c984..0xf7cbfb

### FDE 0xf7cbfc..0xf7cf5f

### FDE 0xf7cf60..0xf7d4c5

### FDE 0xf7dd18..0xf7de9f
#### store 0xf7dd80: mov    QWORD PTR [rbx+0x40],rax
      f7dd50:	41 5e                	pop    r14
      f7dd52:	41 5f                	pop    r15
      f7dd54:	5d                   	pop    rbp
      f7dd55:	c3                   	ret
      f7dd56:	48 8b 6e 10          	mov    rbp,QWORD PTR [rsi+0x10]
      f7dd5a:	bf 10 01 00 00       	mov    edi,0x110
      f7dd5f:	e8 9c 01 87 00       	call   17edf00 <_Znwm@plt>
      f7dd64:	48 89 c3             	mov    rbx,rax
      f7dd67:	0f 57 c0             	xorps  xmm0,xmm0
      f7dd6a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f7dd6e:	48 8d 05 23 e1 8b 00 	lea    rax,[rip+0x8be123]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f7dd75:	48 89 03             	mov    QWORD PTR [rbx],rax
      f7dd78:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
      f7dd7c:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
      f7dd80:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f7dd84:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
      f7dd88:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f7dd8c:	48 85 c0             	test   rax,rax
      f7dd8f:	74 05                	je     f7dd96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1451ac>
      f7dd91:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f7dd96:	48 8d 05 43 f9 8b 00 	lea    rax,[rip+0x8bf943]        # 183d6e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf678>
      f7dd9d:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f7dda1:	48 8d 05 20 fb 8b 00 	lea    rax,[rip+0x8bfb20]        # 183d8c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf860>
      f7dda8:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      f7ddac:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      f7ddb0:	48 8d 75 30          	lea    rsi,[rbp+0x30]
      f7ddb4:	e8 c7 cb 6e 00       	call   166a980 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eaec>
      f7ddb9:	4c 8d bb 88 00 00 00 	lea    r15,[rbx+0x88]
      f7ddc0:	48 8d 75 68          	lea    rsi,[rbp+0x68]
      f7ddc4:	4c 89 ff             	mov    rdi,r15
      f7ddc7:	e8 4c 61 f2 ff       	call   ea3f18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b32e>
      f7ddcc:	4c 8d a3 a0 00 00 00 	lea    r12,[rbx+0xa0]
      f7ddd3:	48 8d b5 80 00 00 00 	lea    rsi,[rbp+0x80]
      f7ddda:	4c 89 e7             	mov    rdi,r12
      f7dddd:	e8 ae c4 af ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      f7dde2:	4c 8d ab d0 00 00 00 	lea    r13,[rbx+0xd0]

### FDE 0xf7e3c4..0xf7f5ce
#### store 0xf7ee5b: mov    QWORD PTR [rsp+0x40],rax
      f7ee23:	0f 29 84 24 20 01 00 	movaps XMMWORD PTR [rsp+0x120],xmm0
      f7ee2a:	00 
      f7ee2b:	0f 11 84 24 29 01 00 	movups XMMWORD PTR [rsp+0x129],xmm0
      f7ee32:	00 
      f7ee33:	4c 8b bc 24 90 00 00 	mov    r15,QWORD PTR [rsp+0x90]
      f7ee3a:	00 
      f7ee3b:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      f7ee42:	00 
      f7ee43:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      f7ee48:	49 39 c7             	cmp    r15,rax
      f7ee4b:	0f 84 ea 01 00 00    	je     f7f03b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146451>
      f7ee51:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
      f7ee58:	00 
      f7ee59:	31 c0                	xor    eax,eax
      f7ee5b:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      f7ee60:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
      f7ee65:	49 8d 6f 18          	lea    rbp,[r15+0x18]
      f7ee69:	48 89 ef             	mov    rdi,rbp
      f7ee6c:	4c 89 f6             	mov    rsi,r14
      f7ee6f:	e8 38 71 e9 ff       	call   e15fac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3032>
      f7ee74:	88 44 24 18          	mov    BYTE PTR [rsp+0x18],al
      f7ee78:	48 89 ef             	mov    rdi,rbp
      f7ee7b:	e8 40 08 b2 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
      f7ee80:	4c 8b a4 24 48 01 00 	mov    r12,QWORD PTR [rsp+0x148]
      f7ee87:	00 
      f7ee88:	4d 85 e4             	test   r12,r12
      f7ee8b:	74 20                	je     f7eead <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1462c3>
      f7ee8d:	48 89 c3             	mov    rbx,rax
      f7ee90:	f3 49 0f b8 cc       	popcnt rcx,r12
      f7ee95:	48 89 c8             	mov    rax,rcx
      f7ee98:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      f7ee9d:	48 83 f9 01          	cmp    rcx,0x1
      f7eea1:	77 12                	ja     f7eeb5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1462cb>
      f7eea3:	4d 8d 6c 24 ff       	lea    r13,[r12-0x1]
      f7eea8:	49 21 dd             	and    r13,rbx
      f7eeab:	eb 1d                	jmp    f7eeca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1462e0>
#### store 0xf7ef92: mov    QWORD PTR [rsp+0x40],rax
      f7ef60:	4c 89 ef             	mov    rdi,r13
      f7ef63:	e8 22 86 f8 ff       	call   f0758a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xce9a0>
      f7ef68:	48 85 c0             	test   rax,rax
      f7ef6b:	75 08                	jne    f7ef75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14638b>
      f7ef6d:	4c 89 ef             	mov    rdi,r13
      f7ef70:	e8 c1 de f8 ff       	call   f0ce36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd424c>
      f7ef75:	4c 89 ef             	mov    rdi,r13
      f7ef78:	e8 0b 83 f8 ff       	call   f07288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xce69e>
      f7ef7d:	48 89 d7             	mov    rdi,rdx
      f7ef80:	48 89 de             	mov    rsi,rbx
      f7ef83:	e8 d4 1a 75 00       	call   16d0a5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84bc8>
      f7ef88:	48 ff 84 24 28 01 00 	inc    QWORD PTR [rsp+0x128]
      f7ef8f:	00 
      f7ef90:	b0 01                	mov    al,0x1
      f7ef92:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      f7ef97:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      f7ef9c:	e9 8b 00 00 00       	jmp    f7f02c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146442>
      f7efa1:	49 8d 76 28          	lea    rsi,[r14+0x28]
      f7efa5:	4d 85 f6             	test   r14,r14
      f7efa8:	49 0f 44 f7          	cmove  rsi,r15
      f7efac:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
      f7efb3:	00 
      f7efb4:	e8 a3 1a 75 00       	call   16d0a5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84bc8>
      f7efb9:	4d 85 f6             	test   r14,r14
      f7efbc:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      f7efc1:	75 3b                	jne    f7effe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x146414>
      f7efc3:	48 89 ef             	mov    rdi,rbp
      f7efc6:	48 89 de             	mov    rsi,rbx
      f7efc9:	e8 b0 aa af ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      f7efce:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]
      f7efd5:	00 
      f7efd6:	48 8d 35 63 d4 4b ff 	lea    rsi,[rip+0xffffffffff4bd463]        # 43c440 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x204c>
      f7efdd:	48 89 ea             	mov    rdx,rbp
      f7efe0:	e8 f7 a5 c5 ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>
      f7efe5:	48 89 c7             	mov    rdi,rax
      f7efe8:	48 89 de             	mov    rsi,rbx

### FDE 0xf7f60c..0xf7f9fc

### FDE 0xf7fa10..0xf7fae9

### FDE 0xf804b0..0xf8059d
#### store 0xf80519: mov    QWORD PTR [r14+0x40],rax
      f804e7:	c3                   	ret
      f804e8:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      f804ec:	6a 60                	push   0x60
      f804ee:	5f                   	pop    rdi
      f804ef:	e8 0c da 86 00       	call   17edf00 <_Znwm@plt>
      f804f4:	49 89 c6             	mov    r14,rax
      f804f7:	0f 57 c0             	xorps  xmm0,xmm0
      f804fa:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f804fe:	48 8d 05 bb a2 8b 00 	lea    rax,[rip+0x8ba2bb]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f80505:	49 89 06             	mov    QWORD PTR [r14],rax
      f80508:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
      f8050d:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      f80511:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
      f80515:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      f80519:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      f8051d:	48 85 c0             	test   rax,rax
      f80520:	74 05                	je     f80527 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14793d>
      f80522:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f80527:	4d 8d 66 20          	lea    r12,[r14+0x20]
      f8052b:	48 8d 05 f6 d5 8b 00 	lea    rax,[rip+0x8bd5f6]        # 183db28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xfac0>
      f80532:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      f80536:	48 8d 05 d3 d7 8b 00 	lea    rax,[rip+0x8bd7d3]        # 183dd10 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xfca8>
      f8053d:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      f80541:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      f80545:	49 83 c7 30          	add    r15,0x30
      f80549:	4c 89 fe             	mov    rsi,r15
      f8054c:	e8 ff 01 00 00       	call   f80750 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147b66>
      f80551:	4c 89 f6             	mov    rsi,r14
      f80554:	48 83 c6 18          	add    rsi,0x18
      f80558:	48 89 df             	mov    rdi,rbx
      f8055b:	4c 89 f2             	mov    rdx,r14
      f8055e:	e8 a1 e2 f7 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      f80563:	31 ff                	xor    edi,edi
      f80565:	48 83 c4 08          	add    rsp,0x8
      f80569:	5b                   	pop    rbx
      f8056a:	41 5c                	pop    r12

### FDE 0xf81818..0xf81d84

### FDE 0xf81d84..0xf82a6c
#### store 0xf81da5: mov    QWORD PTR [rsp+0x40],rdi
      f81d84:	55                   	push   rbp
      f81d85:	41 57                	push   r15
      f81d87:	41 56                	push   r14
      f81d89:	41 55                	push   r13
      f81d8b:	41 54                	push   r12
      f81d8d:	53                   	push   rbx
      f81d8e:	48 81 ec 48 08 00 00 	sub    rsp,0x848
      f81d95:	4c 89 44 24 38       	mov    QWORD PTR [rsp+0x38],r8
      f81d9a:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
      f81d9f:	49 89 d4             	mov    r12,rdx
      f81da2:	49 89 f5             	mov    r13,rsi
      f81da5:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
      f81daa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f81db1:	00 00 
      f81db3:	48 89 84 24 40 08 00 	mov    QWORD PTR [rsp+0x840],rax
      f81dba:	00 
      f81dbb:	4c 8d b2 88 05 00 00 	lea    r14,[rdx+0x588]
      f81dc2:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
      f81dc6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f81dc9:	48 8d 9c 24 38 01 00 	lea    rbx,[rsp+0x138]
      f81dd0:	00 
      f81dd1:	48 89 df             	mov    rdi,rbx
      f81dd4:	ff 50 40             	call   QWORD PTR [rax+0x40]
      f81dd7:	41 80 bc 24 89 05 00 	cmp    BYTE PTR [r12+0x589],0x0
      f81dde:	00 00 
      f81de0:	4c 0f 44 f3          	cmove  r14,rbx
      f81de4:	41 8a 2e             	mov    bpl,BYTE PTR [r14]
      f81de7:	40 84 ed             	test   bpl,bpl
      f81dea:	41 0f 95 c7          	setne  r15b
      f81dee:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
      f81df5:	00 
      f81df6:	e8 ef 94 b7 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
      f81dfb:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]

### FDE 0xf82d90..0xf82f40

### FDE 0xf82f40..0xf8344a

### FDE 0xf8344a..0xf83604

### FDE 0xf83604..0xf837b6

### FDE 0xf8382e..0xf83c1e

### FDE 0xf83c1e..0xf8403d

### FDE 0xf84078..0xf8414e

### FDE 0xf84180..0xf8431b
#### store 0xf841f0: mov    QWORD PTR [rbx+0x40],rax
      f841bc:	5d                   	pop    rbp
      f841bd:	c3                   	ret
      f841be:	48 8b 6e 10          	mov    rbp,QWORD PTR [rsi+0x10]
      f841c2:	bf 10 01 00 00       	mov    edi,0x110
      f841c7:	e8 34 9d 86 00       	call   17edf00 <_Znwm@plt>
      f841cc:	48 89 c3             	mov    rbx,rax
      f841cf:	0f 57 c0             	xorps  xmm0,xmm0
      f841d2:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f841d6:	48 8d 05 e3 65 8b 00 	lea    rax,[rip+0x8b65e3]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f841dd:	48 89 03             	mov    QWORD PTR [rbx],rax
      f841e0:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      f841e4:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
      f841e8:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      f841ec:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
      f841f0:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f841f4:	48 85 c0             	test   rax,rax
      f841f7:	74 05                	je     f841fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b614>
      f841f9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f841fe:	48 8d 05 6b 9d 8b 00 	lea    rax,[rip+0x8b9d6b]        # 183df70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xff08>
      f84205:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      f84209:	48 8d 05 50 9f 8b 00 	lea    rax,[rip+0x8b9f50]        # 183e160 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x100f8>
      f84210:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f84214:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
      f84218:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f8421c:	48 8b 45 38          	mov    rax,QWORD PTR [rbp+0x38]
      f84220:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
      f84224:	48 85 c0             	test   rax,rax
      f84227:	74 05                	je     f8422e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b644>
      f84229:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f8422e:	4c 8d 7b 58          	lea    r15,[rbx+0x58]
      f84232:	48 8d 75 40          	lea    rsi,[rbp+0x40]
      f84236:	4c 89 ff             	mov    rdi,r15
      f84239:	e8 3c c4 da ff       	call   d3067a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27d61a>
      f8423e:	4c 8d a3 b8 00 00 00 	lea    r12,[rbx+0xb8]
      f84245:	48 8d b5 a0 00 00 00 	lea    rsi,[rbp+0xa0]
      f8424c:	4c 89 e7             	mov    rdi,r12

### FDE 0xf8536a..0xf8543c

### FDE 0xf859ac..0xf85acb

### FDE 0xf88e38..0xf89392

### FDE 0xf89392..0xf89671

### FDE 0xf89e72..0xf8a0ca

### FDE 0xf8a3de..0xf8a4b4

### FDE 0xf8a4b4..0xf8a6bf

### FDE 0xf8ae74..0xf8b4ba

### FDE 0xf8b9e4..0xf8bd18

### FDE 0xf8bd18..0xf8bf9c

### FDE 0xf8c22c..0xf8c5b1
#### store 0xf8c2ad: mov    QWORD PTR [rbx+0x40],rax
      f8c26d:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
      f8c271:	bf 50 05 00 00       	mov    edi,0x550
      f8c276:	e8 85 1c 86 00       	call   17edf00 <_Znwm@plt>
      f8c27b:	48 89 c3             	mov    rbx,rax
      f8c27e:	0f 57 c0             	xorps  xmm0,xmm0
      f8c281:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f8c285:	48 8d 05 0c fc 8a 00 	lea    rax,[rip+0x8afc0c]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f8c28c:	48 89 03             	mov    QWORD PTR [rbx],rax
      f8c28f:	48 8d 05 32 73 8b 00 	lea    rax,[rip+0x8b7332]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      f8c296:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f8c29a:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
      f8c29e:	48 8d 05 63 23 8b 00 	lea    rax,[rip+0x8b2363]        # 183e608 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x105a0>
      f8c2a5:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      f8c2a9:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
      f8c2ad:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f8c2b1:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
      f8c2b5:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f8c2b9:	48 85 c0             	test   rax,rax
      f8c2bc:	74 05                	je     f8c2c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1536d9>
      f8c2be:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f8c2c3:	48 8d 05 26 21 8b 00 	lea    rax,[rip+0x8b2126]        # 183e3f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10388>
      f8c2ca:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f8c2ce:	48 8d 05 0b 23 8b 00 	lea    rax,[rip+0x8b230b]        # 183e5e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10578>
      f8c2d5:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      f8c2d9:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      f8c2de:	41 0f 28 4e 40       	movaps xmm1,XMMWORD PTR [r14+0x40]
      f8c2e3:	0f 29 43 50          	movaps XMMWORD PTR [rbx+0x50],xmm0
      f8c2e7:	0f 29 4b 60          	movaps XMMWORD PTR [rbx+0x60],xmm1
      f8c2eb:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
      f8c2ef:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
      f8c2f3:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      f8c2f7:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
      f8c2fb:	48 85 c0             	test   rax,rax
      f8c2fe:	74 05                	je     f8c305 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15371b>
      f8c300:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f8c305:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]

### FDE 0xf8d5f0..0xf8d79b

### FDE 0xf8eed4..0xf8f9a4

### FDE 0xf8fd6e..0xf90271
#### store 0xf8ff1a: mov    QWORD PTR [rsp+0x40],r15
      f8fee8:	74 0a                	je     f8fef4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15730a>
      f8feea:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      f8feef:	48 89 e8             	mov    rax,rbp
      f8fef2:	eb 02                	jmp    f8fef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15730c>
      f8fef4:	31 c0                	xor    eax,eax
      f8fef6:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      f8fefb:	4c 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r13
      f8ff02:	00 
      f8ff03:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      f8ff0a:	00 
      f8ff0b:	31 ff                	xor    edi,edi
      f8ff0d:	e8 74 e5 b0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f8ff12:	48 89 ef             	mov    rdi,rbp
      f8ff15:	e8 6c e5 b0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f8ff1a:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
      f8ff1f:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
      f8ff24:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      f8ff2a:	48 89 5c 24 50       	mov    QWORD PTR [rsp+0x50],rbx
      f8ff2f:	4c 89 74 24 58       	mov    QWORD PTR [rsp+0x58],r14
      f8ff34:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f8ff39:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
      f8ff40:	00 
      f8ff41:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
      f8ff46:	4d 85 ed             	test   r13,r13
      f8ff49:	0f 84 85 00 00 00    	je     f8ffd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1573ea>
      f8ff4f:	6a 30                	push   0x30
      f8ff51:	5f                   	pop    rdi
      f8ff52:	e8 a9 df 85 00       	call   17edf00 <_Znwm@plt>
      f8ff57:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      f8ff5c:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
      f8ff60:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
      f8ff64:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      f8ff6a:	49 89 df             	mov    r15,rbx
      f8ff6d:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      f8ff71:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      f8ff75:	0f 57 c0             	xorps  xmm0,xmm0

### FDE 0xf903b4..0xf90834
#### store 0xf90438: mov    QWORD PTR [rsp+0x40],rax
      f903fe:	40 84 ed             	test   bpl,bpl
      f90401:	74 25                	je     f90428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15783e>
      f90403:	0f 57 c0             	xorps  xmm0,xmm0
      f90406:	4c 8d ac 24 c0 00 00 	lea    r13,[rsp+0xc0]
      f9040d:	00 
      f9040e:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      f90413:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
      f90417:	4c 89 ee             	mov    rsi,r13
      f9041a:	e8 fd 93 b2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f9041f:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      f90423:	e8 5e e0 b0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f90428:	41 0f 10 44 24 20    	movups xmm0,XMMWORD PTR [r12+0x20]
      f9042e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      f90433:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
      f90438:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      f9043d:	0f 57 c0             	xorps  xmm0,xmm0
      f90440:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      f90446:	49 83 64 24 30 00    	and    QWORD PTR [r12+0x30],0x0
      f9044c:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
      f90451:	8a 86 d8 00 00 00    	mov    al,BYTE PTR [rsi+0xd8]
      f90457:	48 83 c6 10          	add    rsi,0x10
      f9045b:	41 0a 47 30          	or     al,BYTE PTR [r15+0x30]
      f9045f:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      f90464:	89 6c 24 04          	mov    DWORD PTR [rsp+0x4],ebp
      f90468:	0f 84 f7 00 00 00    	je     f90565 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15797b>
      f9046e:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      f90473:	e8 e2 b9 cf ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      f90478:	0f 57 c0             	xorps  xmm0,xmm0
      f9047b:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      f90480:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      f90484:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
      f90489:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
      f90490:	00 
      f90491:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      f90496:	4c 89 ef             	mov    rdi,r13
      f90499:	4c 89 fa             	mov    rdx,r15

### FDE 0xf90d92..0xf91639
#### store 0xf90e14: mov    QWORD PTR [rsp+0x40],rax
      f90ddd:	84 db                	test   bl,bl
      f90ddf:	74 25                	je     f90e06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15821c>
      f90de1:	0f 57 c0             	xorps  xmm0,xmm0
      f90de4:	4c 8d ac 24 30 01 00 	lea    r13,[rsp+0x130]
      f90deb:	00 
      f90dec:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      f90df1:	48 83 c7 08          	add    rdi,0x8
      f90df5:	4c 89 ee             	mov    rsi,r13
      f90df8:	e8 1f 8a b2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f90dfd:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      f90e01:	e8 80 d6 b0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f90e06:	41 0f 10 47 20       	movups xmm0,XMMWORD PTR [r15+0x20]
      f90e0b:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      f90e10:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
      f90e14:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      f90e19:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
      f90e1e:	0f 57 c0             	xorps  xmm0,xmm0
      f90e21:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      f90e26:	41 80 7c 24 5a 00    	cmp    BYTE PTR [r12+0x5a],0x0
      f90e2c:	0f 84 60 02 00 00    	je     f91092 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1584a8>
      f90e32:	41 80 7c 24 48 00    	cmp    BYTE PTR [r12+0x48],0x0
      f90e38:	4d 8b 7f 10          	mov    r15,QWORD PTR [r15+0x10]
      f90e3c:	0f 84 dd 00 00 00    	je     f90f1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x158335>
      f90e42:	41 80 bf b0 00 00 00 	cmp    BYTE PTR [r15+0xb0],0x0
      f90e49:	00 
      f90e4a:	0f 84 cf 00 00 00    	je     f90f1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x158335>
      f90e50:	41 0f 10 44 24 38    	movups xmm0,XMMWORD PTR [r12+0x38]
      f90e56:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      f90e5a:	4d 8b 67 48          	mov    r12,QWORD PTR [r15+0x48]
      f90e5e:	49 8d b7 98 00 00 00 	lea    rsi,[r15+0x98]
      f90e65:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      f90e6c:	00 
      f90e6d:	e8 ce d0 85 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f90e72:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
      f90e79:	00 
      f90e7a:	66 c7 46 18 0a 00    	mov    WORD PTR [rsi+0x18],0xa
#### store 0xf90f65: mov    QWORD PTR [r12+0x40],rbp
      f90f1f:	41 80 7c 24 59 00    	cmp    BYTE PTR [r12+0x59],0x0
      f90f25:	0f 84 6b 01 00 00    	je     f91096 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1584ac>
      f90f2b:	41 80 bf d8 00 00 00 	cmp    BYTE PTR [r15+0xd8],0x0
      f90f32:	00 
      f90f33:	0f 84 5d 01 00 00    	je     f91096 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1584ac>
      f90f39:	49 8b 6c 24 49       	mov    rbp,QWORD PTR [r12+0x49]
      f90f3e:	49 8b 44 24 51       	mov    rax,QWORD PTR [r12+0x51]
      f90f43:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
      f90f4a:	00 
      f90f4b:	41 0f 29 44 24 20    	movaps XMMWORD PTR [r12+0x20],xmm0
      f90f51:	41 0f 29 44 24 10    	movaps XMMWORD PTR [r12+0x10],xmm0
      f90f57:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      f90f5c:	41 c7 44 24 38 50 00 	mov    DWORD PTR [r12+0x38],0x50
      f90f63:	00 00 
      f90f65:	49 89 6c 24 40       	mov    QWORD PTR [r12+0x40],rbp
      f90f6a:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      f90f6e:	49 89 44 24 48       	mov    QWORD PTR [r12+0x48],rax
      f90f73:	4c 8d ac 24 88 00 00 	lea    r13,[rsp+0x88]
      f90f7a:	00 
      f90f7b:	4c 89 ef             	mov    rdi,r13
      f90f7e:	4c 89 e6             	mov    rsi,r12
      f90f81:	e8 a4 95 73 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      f90f86:	4c 89 e7             	mov    rdi,r12
      f90f89:	e8 a0 43 73 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      f90f8e:	4d 8b 67 48          	mov    r12,QWORD PTR [r15+0x48]
      f90f92:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      f90f99:	00 
      f90f9a:	4c 89 ee             	mov    rsi,r13
      f90f9d:	e8 9e cf 85 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f90fa2:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      f90fa9:	00 
      f90faa:	66 c7 47 f8 88 00    	mov    WORD PTR [rdi-0x8],0x88
      f90fb0:	49 8d b7 c0 00 00 00 	lea    rsi,[r15+0xc0]
      f90fb7:	e8 84 cf 85 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f90fbc:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
      f90fc3:	00 
#### store 0xf912e0: mov    QWORD PTR [rax+0x40],rdx
      f912ab:	48 8b 51 f0          	mov    rdx,QWORD PTR [rcx-0x10]
      f912af:	48 89 50 10          	mov    QWORD PTR [rax+0x10],rdx
      f912b3:	48 8b 51 f8          	mov    rdx,QWORD PTR [rcx-0x8]
      f912b7:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      f912bb:	48 85 d2             	test   rdx,rdx
      f912be:	74 05                	je     f912c5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1586db>
      f912c0:	f0 48 ff 42 10       	lock inc QWORD PTR [rdx+0x10]
      f912c5:	4c 8d ac 24 30 01 00 	lea    r13,[rsp+0x130]
      f912cc:	00 
      f912cd:	41 0f 10 45 10       	movups xmm0,XMMWORD PTR [r13+0x10]
      f912d2:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      f912d6:	0f 57 c9             	xorps  xmm1,xmm1
      f912d9:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
      f912dc:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]
      f912e0:	48 89 50 40          	mov    QWORD PTR [rax+0x40],rdx
      f912e4:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
      f912e8:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
      f912ed:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
      f912f1:	0f 11 4d 00          	movups XMMWORD PTR [rbp+0x0],xmm1
      f912f5:	0f 10 41 28          	movups xmm0,XMMWORD PTR [rcx+0x28]
      f912f9:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
      f912fd:	48 8d 0d 4c 0a 00 00 	lea    rcx,[rip+0xa4c]        # f91d50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159166>
      f91304:	48 89 08             	mov    QWORD PTR [rax],rcx
      f91307:	48 8d 0d 96 e6 ff ff 	lea    rcx,[rip+0xffffffffffffe696]        # f8f9a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x156dba>
      f9130e:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      f91312:	4c 89 e7             	mov    rdi,r12
      f91315:	48 89 c6             	mov    rsi,rax
      f91318:	e8 a7 84 f3 ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
      f9131d:	4c 89 ef             	mov    rdi,r13
      f91320:	e8 89 e6 ff ff       	call   f8f9ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x156dc4>
      f91325:	0f 57 c0             	xorps  xmm0,xmm0
      f91328:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      f9132d:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      f91332:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
      f91339:	00 
      f9133a:	4c 89 e6             	mov    rsi,r12

### FDE 0xf91d50..0xf92199

### FDE 0xf92e22..0xf93240

### FDE 0xf93240..0xf935c7

### FDE 0xf93d96..0xf940e8

### FDE 0xf954a8..0xf96041

### FDE 0xf97834..0xf97e09

### FDE 0xf9869a..0xf98a45
#### store 0xf9871d: mov    QWORD PTR [rsp+0x40],rax
      f986e4:	40 84 ed             	test   bpl,bpl
      f986e7:	74 26                	je     f9870f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fb25>
      f986e9:	0f 57 c0             	xorps  xmm0,xmm0
      f986ec:	4c 8d a4 24 c0 00 00 	lea    r12,[rsp+0xc0]
      f986f3:	00 
      f986f4:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      f986f9:	49 8d 7d 08          	lea    rdi,[r13+0x8]
      f986fd:	4c 89 e6             	mov    rsi,r12
      f98700:	e8 17 11 b2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f98705:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      f9870a:	e8 77 5d b0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f9870f:	41 0f 10 47 20       	movups xmm0,XMMWORD PTR [r15+0x20]
      f98714:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      f98719:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
      f9871d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      f98722:	0f 57 c0             	xorps  xmm0,xmm0
      f98725:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
      f9872a:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      f9872f:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
      f98733:	80 be 4a 04 00 00 00 	cmp    BYTE PTR [rsi+0x44a],0x0
      f9873a:	0f 84 72 01 00 00    	je     f988b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fcc8>
      f98740:	8a 86 49 04 00 00    	mov    al,BYTE PTR [rsi+0x449]
      f98746:	88 44 24 4f          	mov    BYTE PTR [rsp+0x4f],al
      f9874a:	48 83 c6 10          	add    rsi,0x10
      f9874e:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      f98753:	e8 02 37 cf ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      f98758:	0f 57 c0             	xorps  xmm0,xmm0
      f9875b:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
      f98760:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      f98763:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      f98768:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
      f9876f:	00 
      f98770:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      f98775:	4c 89 ff             	mov    rdi,r15
      f98778:	e8 dd c8 f8 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      f9877d:	4c 8d a4 24 20 01 00 	lea    r12,[rsp+0x120]

### FDE 0xf98a46..0xf98bd5

### FDE 0xf99db8..0xf99e8e

### FDE 0xf9a064..0xf9a3d8

### FDE 0xf9a3d8..0xf9a766

### FDE 0xf9a872..0xf9a9c6

### FDE 0xf9a9c6..0xf9aca4

### FDE 0xf9ad40..0xf9b631

### FDE 0xf9b632..0xf9b9e0

### FDE 0xf9b9e0..0xf9bddc

### FDE 0xf9c03a..0xf9c29a

### FDE 0xf9c29a..0xf9c67a

### FDE 0xf9c67a..0xf9ca6a

### FDE 0xf9ca6a..0xf9d327

### FDE 0xf9d4a4..0xf9d61b
#### store 0xf9d510: mov    QWORD PTR [rbx+0x40],rax
      f9d4d9:	41 5f                	pop    r15
      f9d4db:	c3                   	ret
      f9d4dc:	4c 8b 66 10          	mov    r12,QWORD PTR [rsi+0x10]
      f9d4e0:	bf b8 01 00 00       	mov    edi,0x1b8
      f9d4e5:	e8 16 0a 85 00       	call   17edf00 <_Znwm@plt>
      f9d4ea:	48 89 c3             	mov    rbx,rax
      f9d4ed:	0f 57 c0             	xorps  xmm0,xmm0
      f9d4f0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f9d4f4:	48 8d 05 c5 d2 89 00 	lea    rax,[rip+0x89d2c5]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      f9d4fb:	48 89 03             	mov    QWORD PTR [rbx],rax
      f9d4fe:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      f9d502:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
      f9d507:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      f9d50b:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      f9d510:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f9d514:	48 85 c0             	test   rax,rax
      f9d517:	74 05                	je     f9d51e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164934>
      f9d519:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f9d51e:	48 8d 05 c3 13 8a 00 	lea    rax,[rip+0x8a13c3]        # 183e8e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10880>
      f9d525:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      f9d529:	48 8d 05 a8 15 8a 00 	lea    rax,[rip+0x8a15a8]        # 183ead8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10a70>
      f9d530:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f9d534:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
      f9d539:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f9d53d:	49 8b 44 24 38       	mov    rax,QWORD PTR [r12+0x38]
      f9d542:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
      f9d546:	48 85 c0             	test   rax,rax
      f9d549:	74 05                	je     f9d550 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164966>
      f9d54b:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f9d550:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
      f9d554:	49 8d 74 24 40       	lea    rsi,[r12+0x40]
      f9d559:	e8 10 17 fb ff       	call   f4ec6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x116084>
      f9d55e:	4c 8d bb 80 00 00 00 	lea    r15,[rbx+0x80]
      f9d565:	49 8d 74 24 68       	lea    rsi,[r12+0x68]
      f9d56a:	4c 89 ff             	mov    rdi,r15
      f9d56d:	e8 7a 9c f6 ff       	call   f071ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xce602>

### FDE 0xf9e2b8..0xf9e413

### FDE 0xfa060a..0xfa0729

### FDE 0xfa2c0e..0xfa3791

### FDE 0xfa3792..0xfa415b

### FDE 0xfa415c..0xfa4bac

### FDE 0xfa4bac..0xfa5949

### FDE 0xfa59b0..0xfa5db0

### FDE 0xfa5db0..0xfa6008

### FDE 0xfa6008..0xfa63df

### FDE 0xfa6406..0xfa6465

### FDE 0xfa6490..0xfa65c0
#### store 0xfa64f2: mov    QWORD PTR [rax+0x40],rcx
      fa64bd:	41 5e                	pop    r14
      fa64bf:	c3                   	ret
      fa64c0:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
      fa64c4:	bf a0 00 00 00       	mov    edi,0xa0
      fa64c9:	e8 32 7a 84 00       	call   17edf00 <_Znwm@plt>
      fa64ce:	48 89 c2             	mov    rdx,rax
      fa64d1:	0f 57 c0             	xorps  xmm0,xmm0
      fa64d4:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fa64d8:	48 8d 0d e1 42 89 00 	lea    rcx,[rip+0x8942e1]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fa64df:	48 89 08             	mov    QWORD PTR [rax],rcx
      fa64e2:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      fa64e6:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
      fa64ea:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      fa64ee:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
      fa64f2:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      fa64f6:	48 85 c9             	test   rcx,rcx
      fa64f9:	74 05                	je     fa6500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16d916>
      fa64fb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fa6500:	48 8d 0d d9 88 89 00 	lea    rcx,[rip+0x8988d9]        # 183ede0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10d78>
      fa6507:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      fa650b:	48 8d 0d be 8a 89 00 	lea    rcx,[rip+0x898abe]        # 183efd0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10f68>
      fa6512:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      fa6516:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
      fa651a:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      fa651e:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
      fa6522:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      fa6526:	48 85 c9             	test   rcx,rcx
      fa6529:	74 05                	je     fa6530 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16d946>
      fa652b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fa6530:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
      fa6534:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
      fa6538:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
      fa653c:	48 89 4a 60          	mov    QWORD PTR [rdx+0x60],rcx
      fa6540:	48 85 c9             	test   rcx,rcx
      fa6543:	74 05                	je     fa654a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16d960>
      fa6545:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]

### FDE 0xfa66c2..0xfa677e

### FDE 0xfa98f4..0xfa9fe8

### FDE 0xfaccba..0xfad03a

### FDE 0xfada58..0xfadd64
#### store 0xfadb03: mov    QWORD PTR [r14+0x40],rax
      fadace:	e8 87 75 f7 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fadad3:	4c 8d a4 24 e0 00 00 	lea    r12,[rsp+0xe0]
      fadada:	00 
      fadadb:	6a 01                	push   0x1
      fadadd:	5a                   	pop    rdx
      fadade:	4c 89 e7             	mov    rdi,r12
      fadae1:	4c 89 f6             	mov    rsi,r14
      fadae4:	e8 0d 0d 00 00       	call   fae7f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175c0c>
      fadae9:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
      fadaed:	41 80 7e 48 00       	cmp    BYTE PTR [r14+0x48],0x0
      fadaf2:	75 13                	jne    fadb07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x174f1d>
      fadaf4:	41 c6 46 48 01       	mov    BYTE PTR [r14+0x48],0x1
      fadaf9:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      fadb00:	00 f0 3f 
      fadb03:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      fadb07:	f3 41 0f 10 47 20    	movss  xmm0,DWORD PTR [r15+0x20]
      fadb0d:	f3 0f 5a c8          	cvtss2sd xmm1,xmm0
      fadb11:	f2 41 0f 11 4e 40    	movsd  QWORD PTR [r14+0x40],xmm1
      fadb17:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
      fadb1b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      fadb1e:	48 8d 35 bb b9 48 ff 	lea    rsi,[rip+0xffffffffff48b9bb]        # 4394e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ef2f>
      fadb25:	ff 50 18             	call   QWORD PTR [rax+0x18]
      fadb28:	48 8d 6c 24 50       	lea    rbp,[rsp+0x50]
      fadb2d:	0f 10 45 20          	movups xmm0,XMMWORD PTR [rbp+0x20]
      fadb31:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
      fadb38:	00 
      fadb39:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
      fadb3c:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
      fadb40:	48 83 65 30 00       	and    QWORD PTR [rbp+0x30],0x0
      fadb45:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      fadb49:	0f 57 c0             	xorps  xmm0,xmm0
      fadb4c:	0f 11 45 20          	movups XMMWORD PTR [rbp+0x20],xmm0
      fadb50:	4c 8d ac 24 e0 00 00 	lea    r13,[rsp+0xe0]
      fadb57:	00 
      fadb58:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]
      fadb5c:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]

### FDE 0xfadd64..0xfae1b7
#### store 0xfaddfd: mov    QWORD PTR [rbx+0x40],rax
      faddca:	48 89 df             	mov    rdi,rbx
      faddcd:	e8 88 72 f7 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      faddd2:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
      faddd7:	6a 01                	push   0x1
      faddd9:	5a                   	pop    rdx
      faddda:	4c 89 e7             	mov    rdi,r12
      fadddd:	48 89 de             	mov    rsi,rbx
      fadde0:	e8 11 0a 00 00       	call   fae7f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175c0c>
      fadde5:	49 8b 1c 24          	mov    rbx,QWORD PTR [r12]
      fadde9:	80 7b 48 00          	cmp    BYTE PTR [rbx+0x48],0x0
      fadded:	75 12                	jne    fade01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175217>
      faddef:	c6 43 48 01          	mov    BYTE PTR [rbx+0x48],0x1
      faddf3:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      faddfa:	00 f0 3f 
      faddfd:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      fade01:	f3 41 0f 10 47 08    	movss  xmm0,DWORD PTR [r15+0x8]
      fade07:	f3 0f 5a c8          	cvtss2sd xmm1,xmm0
      fade0b:	f2 0f 11 4b 40       	movsd  QWORD PTR [rbx+0x40],xmm1
      fade10:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
      fade14:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      fade17:	48 8d 35 c2 b6 48 ff 	lea    rsi,[rip+0xffffffffff48b6c2]        # 4394e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ef2f>
      fade1e:	ff 50 18             	call   QWORD PTR [rax+0x18]
      fade21:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      fade26:	41 0f 10 44 24 20    	movups xmm0,XMMWORD PTR [r12+0x20]
      fade2c:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]
      fade31:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0
      fade35:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
      fade3a:	49 83 64 24 30 00    	and    QWORD PTR [r12+0x30],0x0
      fade40:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
      fade44:	0f 57 c0             	xorps  xmm0,xmm0
      fade47:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
      fade4d:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
      fade52:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
      fade56:	4c 8d ac 24 e0 01 00 	lea    r13,[rsp+0x1e0]
      fade5d:	00 
      fade5e:	4c 89 ef             	mov    rdi,r13

### FDE 0xfae1f6..0xfae5e6

### FDE 0xfae5e6..0xfae7a7
#### store 0xfae6a2: mov    QWORD PTR [r15+0x40],rax
      fae66d:	4c 89 ff             	mov    rdi,r15
      fae670:	e8 e5 69 f7 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fae675:	4c 8d 64 24 78       	lea    r12,[rsp+0x78]
      fae67a:	6a 01                	push   0x1
      fae67c:	5a                   	pop    rdx
      fae67d:	4c 89 e7             	mov    rdi,r12
      fae680:	4c 89 fe             	mov    rsi,r15
      fae683:	e8 6e 01 00 00       	call   fae7f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175c0c>
      fae688:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
      fae68c:	41 80 7f 48 00       	cmp    BYTE PTR [r15+0x48],0x0
      fae691:	75 13                	jne    fae6a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175abc>
      fae693:	41 c6 47 48 01       	mov    BYTE PTR [r15+0x48],0x1
      fae698:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      fae69f:	00 f0 3f 
      fae6a2:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      fae6a6:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
      fae6aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      fae6ad:	48 8d 35 2c ae 48 ff 	lea    rsi,[rip+0xffffffffff48ae2c]        # 4394e0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ef2f>
      fae6b4:	ff 50 10             	call   QWORD PTR [rax+0x10]
      fae6b7:	f3 0f 5a c0          	cvtss2sd xmm0,xmm0
      fae6bb:	f2 41 0f 11 47 40    	movsd  QWORD PTR [r15+0x40],xmm0
      fae6c1:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
      fae6c6:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
      fae6cb:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
      fae6d0:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      fae6d5:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      fae6d9:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      fae6dd:	0f 57 c0             	xorps  xmm0,xmm0
      fae6e0:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      fae6e5:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
      fae6ea:	48 8b ac 24 80 00 00 	mov    rbp,QWORD PTR [rsp+0x80]
      fae6f1:	00 
      fae6f2:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]
      fae6f9:	00 
      fae6fa:	4c 89 e7             	mov    rdi,r12
      fae6fd:	4c 89 fe             	mov    rsi,r15

### FDE 0xfae7f6..0xfae8c2
#### store 0xfae856: mov    QWORD PTR [rax+0x40],rcx
      fae825:	c3                   	ret
      fae826:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
      fae82a:	6a 68                	push   0x68
      fae82c:	5f                   	pop    rdi
      fae82d:	e8 ce f6 83 00       	call   17edf00 <_Znwm@plt>
      fae832:	48 89 c2             	mov    rdx,rax
      fae835:	0f 57 c0             	xorps  xmm0,xmm0
      fae838:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fae83c:	48 8d 0d 7d bf 88 00 	lea    rcx,[rip+0x88bf7d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fae843:	48 89 08             	mov    QWORD PTR [rax],rcx
      fae846:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      fae84a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
      fae84e:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      fae852:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
      fae856:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      fae85a:	48 85 c9             	test   rcx,rcx
      fae85d:	74 05                	je     fae864 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175c7a>
      fae85f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fae864:	48 83 c0 18          	add    rax,0x18
      fae868:	48 8d 0d 41 0a 89 00 	lea    rcx,[rip+0x890a41]        # 183f2b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11248>
      fae86f:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      fae873:	48 8d 0d 26 0c 89 00 	lea    rcx,[rip+0x890c26]        # 183f4a0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11438>
      fae87a:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      fae87e:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
      fae882:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      fae886:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
      fae88a:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      fae88e:	48 85 c9             	test   rcx,rcx
      fae891:	74 05                	je     fae898 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175cae>
      fae893:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fae898:	41 0f 10 46 40       	movups xmm0,XMMWORD PTR [r14+0x40]
      fae89d:	0f 11 42 58          	movups XMMWORD PTR [rdx+0x58],xmm0
      fae8a1:	48 89 df             	mov    rdi,rbx
      fae8a4:	48 89 c6             	mov    rsi,rax
      fae8a7:	e8 58 ff f4 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      fae8ac:	31 ff                	xor    edi,edi

### FDE 0xfae962..0xfaea38

### FDE 0xfb3650..0xfb3a62

### FDE 0xfb3d0e..0xfb40fe

### FDE 0xfb410e..0xfb41e7

### FDE 0xfb43f2..0xfb4b6a
#### store 0xfb4534: mov    QWORD PTR [rax+0x40],rcx
      fb44f6:	0f 57 c0             	xorps  xmm0,xmm0
      fb44f9:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fb44fd:	48 8d 0d bc 62 88 00 	lea    rcx,[rip+0x8862bc]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fb4504:	48 89 08             	mov    QWORD PTR [rax],rcx
      fb4507:	48 89 c6             	mov    rsi,rax
      fb450a:	48 83 c6 18          	add    rsi,0x18
      fb450e:	48 8d 0d b3 f0 88 00 	lea    rcx,[rip+0x88f0b3]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      fb4515:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      fb4519:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      fb451d:	48 8d 0d 24 b4 88 00 	lea    rcx,[rip+0x88b424]        # 183f948 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x118e0>
      fb4524:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      fb4528:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      fb452c:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      fb4530:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      fb4534:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      fb4538:	48 85 c9             	test   rcx,rcx
      fb453b:	74 05                	je     fb4542 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b958>
      fb453d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fb4542:	48 8d 0d ef b1 88 00 	lea    rcx,[rip+0x88b1ef]        # 183f738 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x116d0>
      fb4549:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      fb454d:	48 8d 0d cc b3 88 00 	lea    rcx,[rip+0x88b3cc]        # 183f920 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x118b8>
      fb4554:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      fb4558:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
      fb455f:	00 
      fb4560:	4c 89 ff             	mov    rdi,r15
      fb4563:	48 89 c2             	mov    rdx,rax
      fb4566:	e8 99 a2 f4 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      fb456b:	31 ff                	xor    edi,edi
      fb456d:	e8 aa 9e ae ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      fb4572:	49 8b 2f             	mov    rbp,QWORD PTR [r15]
      fb4575:	48 8d 7d 20          	lea    rdi,[rbp+0x20]
      fb4579:	4c 8b 7d 20          	mov    r15,QWORD PTR [rbp+0x20]
      fb457d:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
      fb4581:	48 85 c0             	test   rax,rax
      fb4584:	74 05                	je     fb458b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b9a1>
      fb4586:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
#### store 0xfb4605: mov    QWORD PTR [rsp+0x40],rax
      fb45d0:	00 00 
      fb45d2:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      fb45d9:	00 
      fb45da:	4c 8b a4 24 c8 00 00 	mov    r12,QWORD PTR [rsp+0xc8]
      fb45e1:	00 
      fb45e2:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      fb45e9:	00 
      fb45ea:	4d 85 e4             	test   r12,r12
      fb45ed:	74 06                	je     fb45f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ba0b>
      fb45ef:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fb45f5:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      fb45fc:	00 
      fb45fd:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
      fb4604:	00 
      fb4605:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fb460a:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      fb4611:	00 
      fb4612:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      fb4617:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      fb461e:	00 00 
      fb4620:	bf 80 00 00 00       	mov    edi,0x80
      fb4625:	e8 d6 98 83 00       	call   17edf00 <_Znwm@plt>
      fb462a:	49 89 c5             	mov    r13,rax
      fb462d:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
      fb4632:	0f 57 c0             	xorps  xmm0,xmm0
      fb4635:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fb4639:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      fb4640:	00 00 
      fb4642:	48 8d 05 5f 5e 88 00 	lea    rax,[rip+0x885e5f]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
      fb4649:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      fb464d:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      fb4654:	00 
      fb4655:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      fb465c:	00 
      fb465d:	0f 29 84 24 20 01 00 	movaps XMMWORD PTR [rsp+0x120],xmm0
      fb4664:	00 

### FDE 0xfb4dfc..0xfb4f0d

### FDE 0xfb5302..0xfb53e9

### FDE 0xfb5a20..0xfb6042

### FDE 0xfb6080..0xfb618f

### FDE 0xfb61a4..0xfb627d

### FDE 0xfb6796..0xfb6f3c
#### store 0xfb68d4: mov    QWORD PTR [rax+0x40],rcx
      fb6895:	e8 66 76 83 00       	call   17edf00 <_Znwm@plt>
      fb689a:	48 89 c2             	mov    rdx,rax
      fb689d:	0f 57 c0             	xorps  xmm0,xmm0
      fb68a0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fb68a4:	48 8d 0d 15 3f 88 00 	lea    rcx,[rip+0x883f15]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fb68ab:	48 89 08             	mov    QWORD PTR [rax],rcx
      fb68ae:	48 8d 0d 13 cd 88 00 	lea    rcx,[rip+0x88cd13]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      fb68b5:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      fb68b9:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      fb68bd:	48 8d 0d f4 94 88 00 	lea    rcx,[rip+0x8894f4]        # 183fdb8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d50>
      fb68c4:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      fb68c8:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      fb68cc:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      fb68d0:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      fb68d4:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      fb68d8:	48 85 c9             	test   rcx,rcx
      fb68db:	74 05                	je     fb68e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17dcf8>
      fb68dd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fb68e2:	48 83 c0 18          	add    rax,0x18
      fb68e6:	48 8d 0d 93 92 88 00 	lea    rcx,[rip+0x889293]        # 183fb80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11b18>
      fb68ed:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      fb68f1:	48 8d 0d 70 94 88 00 	lea    rcx,[rip+0x889470]        # 183fd68 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11d00>
      fb68f8:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      fb68fc:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
      fb6900:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      fb6904:	48 8b 4b 38          	mov    rcx,QWORD PTR [rbx+0x38]
      fb6908:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      fb690c:	48 85 c9             	test   rcx,rcx
      fb690f:	74 05                	je     fb6916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17dd2c>
      fb6911:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fb6916:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
      fb691d:	00 
      fb691e:	4c 89 ff             	mov    rdi,r15
      fb6921:	48 89 c6             	mov    rsi,rax
      fb6924:	e8 db 7e f4 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      fb6929:	31 ff                	xor    edi,edi
#### store 0xfb69c3: mov    QWORD PTR [rsp+0x40],rax
      fb698e:	00 00 
      fb6990:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      fb6997:	00 
      fb6998:	4c 8b a4 24 c8 00 00 	mov    r12,QWORD PTR [rsp+0xc8]
      fb699f:	00 
      fb69a0:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      fb69a7:	00 
      fb69a8:	4d 85 e4             	test   r12,r12
      fb69ab:	74 06                	je     fb69b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ddc9>
      fb69ad:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fb69b3:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      fb69ba:	00 
      fb69bb:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
      fb69c2:	00 
      fb69c3:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fb69c8:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      fb69cf:	00 
      fb69d0:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      fb69d5:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      fb69dc:	00 00 
      fb69de:	bf 80 00 00 00       	mov    edi,0x80
      fb69e3:	e8 18 75 83 00       	call   17edf00 <_Znwm@plt>
      fb69e8:	49 89 c5             	mov    r13,rax
      fb69eb:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
      fb69f0:	0f 57 c0             	xorps  xmm0,xmm0
      fb69f3:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fb69f7:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      fb69fe:	00 00 
      fb6a00:	48 8d 05 a1 3a 88 00 	lea    rax,[rip+0x883aa1]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
      fb6a07:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      fb6a0b:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      fb6a12:	00 
      fb6a13:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      fb6a1a:	00 
      fb6a1b:	0f 29 84 24 20 01 00 	movaps XMMWORD PTR [rsp+0x120],xmm0
      fb6a22:	00 

### FDE 0xfb74da..0xfb761f

### FDE 0xfb844e..0xfb8959

### FDE 0xfb895a..0xfb8cfd

### FDE 0xfb8cfe..0xfb8f1a

### FDE 0xfb8faa..0xfb9228

### FDE 0xfb9228..0xfb9618

### FDE 0xfb963a..0xfb9710

### FDE 0xfba0d6..0xfba1e3
#### store 0xfba143: mov    QWORD PTR [r14+0x40],rax
      fba10b:	41 5f                	pop    r15
      fba10d:	c3                   	ret
      fba10e:	4c 8b 66 10          	mov    r12,QWORD PTR [rsi+0x10]
      fba112:	bf 10 01 00 00       	mov    edi,0x110
      fba117:	e8 e4 3d 83 00       	call   17edf00 <_Znwm@plt>
      fba11c:	49 89 c6             	mov    r14,rax
      fba11f:	0f 57 c0             	xorps  xmm0,xmm0
      fba122:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fba126:	48 8d 05 93 06 88 00 	lea    rax,[rip+0x880693]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fba12d:	49 89 06             	mov    QWORD PTR [r14],rax
      fba130:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
      fba135:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
      fba13a:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
      fba13e:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      fba143:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      fba147:	48 85 c0             	test   rax,rax
      fba14a:	74 05                	je     fba151 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181567>
      fba14c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fba151:	4d 8d 7e 20          	lea    r15,[r14+0x20]
      fba155:	48 8d 05 94 5e 88 00 	lea    rax,[rip+0x885e94]        # 183fff0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x11f88>
      fba15c:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      fba160:	48 8d 05 71 60 88 00 	lea    rax,[rip+0x886071]        # 18401d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12170>
      fba167:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      fba16b:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      fba16f:	49 8d 74 24 30       	lea    rsi,[r12+0x30]
      fba174:	e8 e1 e0 6b 00       	call   167825a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c3c6>
      fba179:	4c 89 f6             	mov    rsi,r14
      fba17c:	48 83 c6 18          	add    rsi,0x18
      fba180:	41 8a 84 24 f4 00 00 	mov    al,BYTE PTR [r12+0xf4]
      fba187:	00 
      fba188:	41 88 86 0c 01 00 00 	mov    BYTE PTR [r14+0x10c],al
      fba18f:	41 8b 84 24 f0 00 00 	mov    eax,DWORD PTR [r12+0xf0]
      fba196:	00 
      fba197:	41 89 86 08 01 00 00 	mov    DWORD PTR [r14+0x108],eax
      fba19e:	48 89 df             	mov    rdi,rbx
      fba1a1:	4c 89 f2             	mov    rdx,r14

### FDE 0xfba7da..0xfbaa74

### FDE 0xfbb564..0xfbbad9

### FDE 0xfbbaee..0xfbbbc7

### FDE 0xfbbc02..0xfbc448
#### store 0xfbbd3c: mov    QWORD PTR [rbx+0x40],rax
      fbbcfb:	e8 00 22 83 00       	call   17edf00 <_Znwm@plt>
      fbbd00:	48 89 c3             	mov    rbx,rax
      fbbd03:	0f 57 c0             	xorps  xmm0,xmm0
      fbbd06:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fbbd0a:	48 8d 05 af ea 87 00 	lea    rax,[rip+0x87eaaf]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fbbd11:	48 89 03             	mov    QWORD PTR [rbx],rax
      fbbd14:	48 8d 05 ad 78 88 00 	lea    rax,[rip+0x8878ad]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      fbbd1b:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      fbbd1f:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      fbbd23:	48 8d 05 1e 49 88 00 	lea    rax,[rip+0x88491e]        # 1840648 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x125e0>
      fbbd2a:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      fbbd2e:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
      fbbd33:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      fbbd37:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      fbbd3c:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      fbbd40:	48 85 c0             	test   rax,rax
      fbbd43:	74 05                	je     fbbd4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183160>
      fbbd45:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fbbd4a:	4c 8d 7b 20          	lea    r15,[rbx+0x20]
      fbbd4e:	48 8d 05 e3 46 88 00 	lea    rax,[rip+0x8846e3]        # 1840438 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x123d0>
      fbbd55:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      fbbd59:	48 8d 05 c0 48 88 00 	lea    rax,[rip+0x8848c0]        # 1840620 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x125b8>
      fbbd60:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      fbbd64:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
      fbbd68:	49 83 c4 30          	add    r12,0x30
      fbbd6c:	4c 89 e6             	mov    rsi,r12
      fbbd6f:	e8 76 5f 71 00       	call   16d1cea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85e56>
      fbbd74:	48 89 de             	mov    rsi,rbx
      fbbd77:	48 83 c6 18          	add    rsi,0x18
      fbbd7b:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]
      fbbd82:	00 
      fbbd83:	4c 89 ff             	mov    rdi,r15
      fbbd86:	48 89 da             	mov    rdx,rbx
      fbbd89:	e8 76 2a f4 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      fbbd8e:	31 ff                	xor    edi,edi
      fbbd90:	e8 87 26 ae ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
#### store 0xfbbf03: mov    QWORD PTR [rsp+0x40],r12
      fbbecb:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      fbbed0:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
      fbbed4:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
      fbbedb:	00 
      fbbedc:	0f 57 c0             	xorps  xmm0,xmm0
      fbbedf:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
      fbbee3:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      fbbee8:	4c 89 e7             	mov    rdi,r12
      fbbeeb:	4c 89 fe             	mov    rsi,r15
      fbbeee:	e8 27 9c f6 ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
      fbbef3:	4c 89 ff             	mov    rdi,r15
      fbbef6:	e8 17 94 f6 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fbbefb:	48 89 df             	mov    rdi,rbx
      fbbefe:	e8 4b 79 f5 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
      fbbf03:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      fbbf08:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13
      fbbf0d:	31 ff                	xor    edi,edi
      fbbf0f:	e8 08 25 ae ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      fbbf14:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      fbbf1b:	00 
      fbbf1c:	e8 2d 79 f5 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
      fbbf21:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      fbbf26:	e8 51 00 e5 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fbbf2b:	44 8b 34 24          	mov    r14d,DWORD PTR [rsp]
      fbbf2f:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      fbbf34:	e9 3a 03 00 00       	jmp    fbc273 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183689>
      fbbf39:	44 89 34 24          	mov    DWORD PTR [rsp],r14d
      fbbf3d:	49 83 c5 20          	add    r13,0x20
      fbbf41:	4c 8b b4 24 30 01 00 	mov    r14,QWORD PTR [rsp+0x130]
      fbbf48:	00 
      fbbf49:	48 8b ac 24 38 01 00 	mov    rbp,QWORD PTR [rsp+0x138]
      fbbf50:	00 
      fbbf51:	48 8b 84 24 40 01 00 	mov    rax,QWORD PTR [rsp+0x140]
      fbbf58:	00 
      fbbf59:	0f 57 c0             	xorps  xmm0,xmm0
      fbbf5c:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
#### store 0xfbc018: mov    QWORD PTR [rsp+0x40],r12
      fbbfe0:	41 0f 29 0f          	movaps XMMWORD PTR [r15],xmm1
      fbbfe4:	0f 29 40 e0          	movaps XMMWORD PTR [rax-0x20],xmm0
      fbbfe8:	41 0f 29 57 10       	movaps XMMWORD PTR [r15+0x10],xmm2
      fbbfed:	0f 29 40 f0          	movaps XMMWORD PTR [rax-0x10],xmm0
      fbbff1:	4d 89 77 20          	mov    QWORD PTR [r15+0x20],r14
      fbbff5:	49 89 6f 28          	mov    QWORD PTR [r15+0x28],rbp
      fbbff9:	4d 89 6f 30          	mov    QWORD PTR [r15+0x30],r13
      fbbffd:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      fbc000:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
      fbc005:	4c 89 e7             	mov    rdi,r12
      fbc008:	4c 89 fe             	mov    rsi,r15
      fbc00b:	e8 0a 9b f6 ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
      fbc010:	4c 89 ff             	mov    rdi,r15
      fbc013:	e8 fa 92 f6 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fbc018:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      fbc01d:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
      fbc022:	31 ff                	xor    edi,edi
      fbc024:	e8 f3 23 ae ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      fbc029:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      fbc030:	00 
      fbc031:	e8 dc 92 f6 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fbc036:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      fbc03d:	00 
      fbc03e:	e8 39 ff e4 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fbc043:	44 8b 34 24          	mov    r14d,DWORD PTR [rsp]
      fbc047:	e9 37 02 00 00       	jmp    fbc283 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183699>
      fbc04c:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      fbc050:	48 83 c3 08          	add    rbx,0x8
      fbc054:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      fbc059:	48 89 de             	mov    rsi,rbx
      fbc05c:	4c 89 e2             	mov    rdx,r12
      fbc05f:	ff 50 10             	call   QWORD PTR [rax+0x10]
      fbc062:	0f 28 84 24 30 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x130]
      fbc069:	00 
      fbc06a:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
      fbc071:	00 
#### store 0xfbc22b: mov    QWORD PTR [rsp+0x40],r12
      fbc1f2:	e8 03 98 f6 ff       	call   f259fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xece10>
      fbc1f7:	48 8d 9c 24 50 01 00 	lea    rbx,[rsp+0x150]
      fbc1fe:	00 
      fbc1ff:	48 89 df             	mov    rdi,rbx
      fbc202:	e8 b1 cd f6 ff       	call   f28fb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf03ce>
      fbc207:	0f 57 c0             	xorps  xmm0,xmm0
      fbc20a:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
      fbc20d:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      fbc212:	48 8d 9c 24 50 01 00 	lea    rbx,[rsp+0x150]
      fbc219:	00 
      fbc21a:	48 89 de             	mov    rsi,rbx
      fbc21d:	e8 fa d5 af ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fbc222:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      fbc226:	e8 5b 22 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fbc22b:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      fbc230:	48 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],rbp
      fbc235:	48 85 ed             	test   rbp,rbp
      fbc238:	74 05                	je     fbc23f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183655>
      fbc23a:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
      fbc23f:	48 89 ef             	mov    rdi,rbp
      fbc242:	e8 6b 22 ae ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fbc247:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      fbc24e:	00 
      fbc24f:	e8 32 22 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fbc254:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      fbc25b:	00 
      fbc25c:	e8 6f cd f6 ff       	call   f28fd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf03e6>
      fbc261:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      fbc266:	e8 1b 22 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fbc26b:	48 8b ac 24 b8 00 00 	mov    rbp,QWORD PTR [rsp+0xb8]
      fbc272:	00 
      fbc273:	4c 89 ff             	mov    rdi,r15
      fbc276:	e8 0b 22 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fbc27b:	48 89 ef             	mov    rdi,rbp
      fbc27e:	e8 03 22 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fbc283:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]

### FDE 0xfbd084..0xfbdb70
#### store 0xfbd09f: mov    QWORD PTR [rsp+0x40],rdx
      fbd084:	55                   	push   rbp
      fbd085:	41 57                	push   r15
      fbd087:	41 56                	push   r14
      fbd089:	41 55                	push   r13
      fbd08b:	41 54                	push   r12
      fbd08d:	53                   	push   rbx
      fbd08e:	48 81 ec 88 1c 00 00 	sub    rsp,0x1c88
      fbd095:	4c 89 44 24 30       	mov    QWORD PTR [rsp+0x30],r8
      fbd09a:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
      fbd09f:	48 89 54 24 40       	mov    QWORD PTR [rsp+0x40],rdx
      fbd0a4:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      fbd0a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fbd0b0:	00 00 
      fbd0b2:	48 89 84 24 80 1c 00 	mov    QWORD PTR [rsp+0x1c80],rax
      fbd0b9:	00 
      fbd0ba:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
      fbd0c0:	0f 57 c0             	xorps  xmm0,xmm0
      fbd0c3:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
      fbd0c8:	48 8b 4e 60          	mov    rcx,QWORD PTR [rsi+0x60]
      fbd0cc:	48 89 74 24 28       	mov    QWORD PTR [rsp+0x28],rsi
      fbd0d1:	48 8b 76 58          	mov    rsi,QWORD PTR [rsi+0x58]
      fbd0d5:	48 89 c8             	mov    rax,rcx
      fbd0d8:	48 29 f0             	sub    rax,rsi
      fbd0db:	6a 30                	push   0x30
      fbd0dd:	5f                   	pop    rdi
      fbd0de:	48 99                	cqo
      fbd0e0:	48 f7 ff             	idiv   rdi
      fbd0e3:	48 39 f1             	cmp    rcx,rsi
      fbd0e6:	0f 84 8f 01 00 00    	je     fbd27b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184691>
      fbd0ec:	48 89 c1             	mov    rcx,rax
      fbd0ef:	48 c1 e9 3c          	shr    rcx,0x3c

### FDE 0xfbde9e..0xfbdfad

### FDE 0xfbdfd0..0xfbe0a6

### FDE 0xfbedae..0xfbf03c
#### store 0xfbedc8: mov    QWORD PTR [rsp+0x40],rax
      fbedae:	55                   	push   rbp
      fbedaf:	41 57                	push   r15
      fbedb1:	41 56                	push   r14
      fbedb3:	41 55                	push   r13
      fbedb5:	41 54                	push   r12
      fbedb7:	53                   	push   rbx
      fbedb8:	48 83 ec 48          	sub    rsp,0x48
      fbedbc:	49 89 fe             	mov    r14,rdi
      fbedbf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fbedc6:	00 00 
      fbedc8:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fbedcd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fbedd0:	48 85 c0             	test   rax,rax
      fbedd3:	74 22                	je     fbedf7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18620d>
      fbedd5:	84 d2                	test   dl,dl
      fbedd7:	74 1e                	je     fbedf7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18620d>
      fbedd9:	49 89 06             	mov    QWORD PTR [r14],rax
      fbeddc:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
      fbede0:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      fbede4:	48 85 c0             	test   rax,rax
      fbede7:	0f 84 b8 01 00 00    	je     fbefa5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1863bb>
      fbeded:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fbedf2:	e9 ae 01 00 00       	jmp    fbefa5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1863bb>
      fbedf7:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      fbedfb:	bf 88 00 00 00       	mov    edi,0x88
      fbee00:	e8 fb f0 82 00       	call   17edf00 <_Znwm@plt>
      fbee05:	48 89 c3             	mov    rbx,rax
      fbee08:	0f 57 c0             	xorps  xmm0,xmm0
      fbee0b:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fbee0f:	48 8d 05 aa b9 87 00 	lea    rax,[rip+0x87b9aa]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fbee16:	48 89 03             	mov    QWORD PTR [rbx],rax
      fbee19:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
#### store 0xfbee29: mov    QWORD PTR [rbx+0x40],rax
      fbeded:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fbedf2:	e9 ae 01 00 00       	jmp    fbefa5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1863bb>
      fbedf7:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      fbedfb:	bf 88 00 00 00       	mov    edi,0x88
      fbee00:	e8 fb f0 82 00       	call   17edf00 <_Znwm@plt>
      fbee05:	48 89 c3             	mov    rbx,rax
      fbee08:	0f 57 c0             	xorps  xmm0,xmm0
      fbee0b:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fbee0f:	48 8d 05 aa b9 87 00 	lea    rax,[rip+0x87b9aa]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fbee16:	48 89 03             	mov    QWORD PTR [rbx],rax
      fbee19:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      fbee1d:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      fbee21:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      fbee25:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      fbee29:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      fbee2d:	48 85 c0             	test   rax,rax
      fbee30:	74 05                	je     fbee37 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18624d>
      fbee32:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fbee37:	48 8d 05 7a 1a 88 00 	lea    rax,[rip+0x881a7a]        # 18408b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12850>
      fbee3e:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      fbee42:	48 8d 05 57 1c 88 00 	lea    rax,[rip+0x881c57]        # 1840aa0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12a38>
      fbee49:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      fbee4d:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
      fbee51:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      fbee55:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
      fbee59:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
      fbee5d:	48 85 c0             	test   rax,rax
      fbee60:	74 05                	je     fbee67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18627d>
      fbee62:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fbee67:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
      fbee6b:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
      fbee6f:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
      fbee73:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
      fbee77:	48 85 c0             	test   rax,rax
      fbee7a:	74 05                	je     fbee81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186297>
      fbee7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### FDE 0xfbf222..0xfbf4ab

### FDE 0xfbf87a..0xfbfd9c

### FDE 0xfc0384..0xfc0892

### FDE 0xfc0c1e..0xfc0cf4

### FDE 0xfc0dec..0xfc124b

### FDE 0xfc124c..0xfc14bb

### FDE 0xfc14bc..0xfc1c8e

### FDE 0xfc1d5e..0xfc1fd5

### FDE 0xfc1fd6..0xfc23c6

### FDE 0xfc23c6..0xfc259f

### FDE 0xfc25c6..0xfc26d9
#### store 0xfc2627: mov    QWORD PTR [rbx+0x40],rax
      fc25f2:	41 5f                	pop    r15
      fc25f4:	c3                   	ret
      fc25f5:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      fc25f9:	bf 80 01 00 00       	mov    edi,0x180
      fc25fe:	e8 fd b8 82 00       	call   17edf00 <_Znwm@plt>
      fc2603:	48 89 c3             	mov    rbx,rax
      fc2606:	0f 57 c0             	xorps  xmm0,xmm0
      fc2609:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fc260d:	48 8d 05 ac 81 87 00 	lea    rax,[rip+0x8781ac]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fc2614:	48 89 03             	mov    QWORD PTR [rbx],rax
      fc2617:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      fc261b:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      fc261f:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
      fc2623:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      fc2627:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      fc262b:	48 85 c0             	test   rax,rax
      fc262e:	74 05                	je     fc2635 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x189a4b>
      fc2630:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fc2635:	48 8d 05 c4 e6 87 00 	lea    rax,[rip+0x87e6c4]        # 1840d00 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12c98>
      fc263c:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      fc2640:	48 8d 05 a9 e8 87 00 	lea    rax,[rip+0x87e8a9]        # 1840ef0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12e88>
      fc2647:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      fc264b:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
      fc264f:	49 8d 77 30          	lea    rsi,[r15+0x30]
      fc2653:	e8 16 c6 f8 ff       	call   f4ec6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x116084>
      fc2658:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
      fc265c:	49 8d 77 58          	lea    rsi,[r15+0x58]
      fc2660:	e8 5f 55 f5 ff       	call   f17bc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdefda>
      fc2665:	48 89 de             	mov    rsi,rbx
      fc2668:	48 83 c6 18          	add    rsi,0x18
      fc266c:	41 8a 87 60 01 00 00 	mov    al,BYTE PTR [r15+0x160]
      fc2673:	88 83 78 01 00 00    	mov    BYTE PTR [rbx+0x178],al
      fc2679:	41 0f 10 87 50 01 00 	movups xmm0,XMMWORD PTR [r15+0x150]
      fc2680:	00 
      fc2681:	0f 11 83 68 01 00 00 	movups XMMWORD PTR [rbx+0x168],xmm0
      fc2688:	4c 89 f7             	mov    rdi,r14

### FDE 0xfc3544..0xfc3616

### FDE 0xfc37e8..0xfc3db8
#### store 0xfc3861: mov    QWORD PTR [rsp+0x40],r12
      fc3829:	4d 85 ed             	test   r13,r13
      fc382c:	0f 84 42 05 00 00    	je     fc3d74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18b18a>
      fc3832:	40 84 ed             	test   bpl,bpl
      fc3835:	74 26                	je     fc385d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18ac73>
      fc3837:	0f 57 c0             	xorps  xmm0,xmm0
      fc383a:	4c 8d a4 24 20 01 00 	lea    r12,[rsp+0x120]
      fc3841:	00 
      fc3842:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      fc3847:	49 8d 7d 08          	lea    rdi,[r13+0x8]
      fc384b:	4c 89 e6             	mov    rsi,r12
      fc384e:	e8 c9 5f af ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      fc3853:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fc3858:	e8 29 ac ad ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fc385d:	4d 8b 67 20          	mov    r12,QWORD PTR [r15+0x20]
      fc3861:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      fc3866:	49 8b 5f 28          	mov    rbx,QWORD PTR [r15+0x28]
      fc386a:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
      fc386f:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
      fc3873:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      fc3878:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      fc387d:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
      fc3882:	0f 57 c0             	xorps  xmm0,xmm0
      fc3885:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      fc388a:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
      fc388e:	31 c9                	xor    ecx,ecx
      fc3890:	88 8c 24 e8 00 00 00 	mov    BYTE PTR [rsp+0xe8],cl
      fc3897:	88 8c 24 ec 00 00 00 	mov    BYTE PTR [rsp+0xec],cl
      fc389e:	0f 11 84 24 f0 00 00 	movups XMMWORD PTR [rsp+0xf0],xmm0
      fc38a5:	00 
      fc38a6:	0f 11 84 24 00 01 00 	movups XMMWORD PTR [rsp+0x100],xmm0
      fc38ad:	00 
      fc38ae:	83 a4 24 e0 00 00 00 	and    DWORD PTR [rsp+0xe0],0x0
      fc38b5:	00 
      fc38b6:	c7 84 24 10 01 00 00 	mov    DWORD PTR [rsp+0x110],0x3f800000
      fc38bd:	00 00 80 3f 
      fc38c1:	b0 01                	mov    al,0x1

### FDE 0xfc4ce6..0xfc5033

### FDE 0xfc5034..0xfc543f

### FDE 0xfc5440..0xfc55b4

### FDE 0xfc646a..0xfc6a80

### FDE 0xfc6a80..0xfc6d50
#### store 0xfc6bd3: mov    QWORD PTR [rsp+0x40],rbp
      fc6b9a:	4c 89 ff             	mov    rdi,r15
      fc6b9d:	4c 89 e6             	mov    rsi,r12
      fc6ba0:	e8 dd 02 00 00       	call   fc6e82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18e298>
      fc6ba5:	4c 89 f7             	mov    rdi,r14
      fc6ba8:	4c 89 fe             	mov    rsi,r15
      fc6bab:	e8 ac 1c 00 00       	call   fc885c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18fc72>
      fc6bb0:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      fc6bb4:	e8 cd 78 ad ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fc6bb9:	e9 1c 01 00 00       	jmp    fc6cda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18e0f0>
      fc6bbe:	0f 57 c0             	xorps  xmm0,xmm0
      fc6bc1:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      fc6bc5:	e9 fc 00 00 00       	jmp    fc6cc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18e0dc>
      fc6bca:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      fc6bcf:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      fc6bd3:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
      fc6bd8:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
      fc6bdd:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      fc6be2:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
      fc6be7:	4c 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],r13
      fc6bec:	4c 89 74 24 58       	mov    QWORD PTR [rsp+0x58],r14
      fc6bf1:	4d 85 f6             	test   r14,r14
      fc6bf4:	74 05                	je     fc6bfb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18e011>
      fc6bf6:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      fc6bfb:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
      fc6c00:	48 89 5c 24 68       	mov    QWORD PTR [rsp+0x68],rbx
      fc6c05:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      fc6c0a:	6a 40                	push   0x40
      fc6c0c:	5f                   	pop    rdi
      fc6c0d:	e8 ee 72 82 00       	call   17edf00 <_Znwm@plt>
      fc6c12:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
      fc6c17:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp
      fc6c1b:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
      fc6c1f:	4d 85 e4             	test   r12,r12
      fc6c22:	74 06                	je     fc6c2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18e040>
      fc6c24:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      fc6c2a:	4c 89 68 20          	mov    QWORD PTR [rax+0x20],r13

### FDE 0xfc6d50..0xfc6e5f

### FDE 0xfc6e82..0xfc6f58

### FDE 0xfc7c60..0xfc814d
#### store 0xfc7cea: mov    QWORD PTR [rbx+0x40],rax
      fc7ca9:	4c 8b 66 10          	mov    r12,QWORD PTR [rsi+0x10]
      fc7cad:	bf 90 0c 00 00       	mov    edi,0xc90
      fc7cb2:	e8 49 62 82 00       	call   17edf00 <_Znwm@plt>
      fc7cb7:	48 89 c3             	mov    rbx,rax
      fc7cba:	0f 57 c0             	xorps  xmm0,xmm0
      fc7cbd:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fc7cc1:	48 8d 05 d0 41 87 00 	lea    rax,[rip+0x8741d0]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      fc7cc8:	48 89 03             	mov    QWORD PTR [rbx],rax
      fc7ccb:	48 8d 05 f6 b8 87 00 	lea    rax,[rip+0x87b8f6]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      fc7cd2:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      fc7cd6:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
      fc7cda:	48 8d 05 5f 97 87 00 	lea    rax,[rip+0x87975f]        # 1841440 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x133d8>
      fc7ce1:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      fc7ce5:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
      fc7cea:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      fc7cee:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      fc7cf3:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      fc7cf7:	48 85 c0             	test   rax,rax
      fc7cfa:	74 05                	je     fc7d01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f117>
      fc7cfc:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fc7d01:	48 8d 05 48 94 87 00 	lea    rax,[rip+0x879448]        # 1841150 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x130e8>
      fc7d08:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      fc7d0c:	48 8d 05 25 96 87 00 	lea    rax,[rip+0x879625]        # 1841338 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x132d0>
      fc7d13:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      fc7d17:	41 8a 44 24 30       	mov    al,BYTE PTR [r12+0x30]
      fc7d1c:	88 43 50             	mov    BYTE PTR [rbx+0x50],al
      fc7d1f:	49 8b 44 24 38       	mov    rax,QWORD PTR [r12+0x38]
      fc7d24:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
      fc7d28:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
      fc7d2d:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
      fc7d31:	48 85 c0             	test   rax,rax
      fc7d34:	74 05                	je     fc7d3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f151>
      fc7d36:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fc7d3b:	49 8b 44 24 48       	mov    rax,QWORD PTR [r12+0x48]
      fc7d40:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
      fc7d44:	49 8b 44 24 50       	mov    rax,QWORD PTR [r12+0x50]
#### store 0xfc7da0: mov    QWORD PTR [rsp+0x40],rax
      fc7d5c:	49 8b 44 24 58       	mov    rax,QWORD PTR [r12+0x58]
      fc7d61:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
      fc7d65:	49 8b 44 24 60       	mov    rax,QWORD PTR [r12+0x60]
      fc7d6a:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
      fc7d71:	48 85 c0             	test   rax,rax
      fc7d74:	74 05                	je     fc7d7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f191>
      fc7d76:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fc7d7b:	48 8d 83 88 00 00 00 	lea    rax,[rbx+0x88]
      fc7d82:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
      fc7d89:	00 
      fc7d8a:	0f 11 83 88 00 00 00 	movups XMMWORD PTR [rbx+0x88],xmm0
      fc7d91:	4d 8b 74 24 68       	mov    r14,QWORD PTR [r12+0x68]
      fc7d96:	49 8b 6c 24 70       	mov    rbp,QWORD PTR [r12+0x70]
      fc7d9b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      fc7da0:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fc7da5:	c6 44 24 48 00       	mov    BYTE PTR [rsp+0x48],0x0
      fc7daa:	48 89 e8             	mov    rax,rbp
      fc7dad:	4c 29 f0             	sub    rax,r14
      fc7db0:	0f 84 84 00 00 00    	je     fc7e3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f250>
      fc7db6:	41 bf 88 00 00 00    	mov    r15d,0x88
      fc7dbc:	48 99                	cqo
      fc7dbe:	49 f7 ff             	idiv   r15
      fc7dc1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      fc7dc6:	48 89 c6             	mov    rsi,rax
      fc7dc9:	e8 fe f7 dd ff       	call   da75cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x74652>
      fc7dce:	4c 8b ab 90 00 00 00 	mov    r13,QWORD PTR [rbx+0x90]
      fc7dd5:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
      fc7ddc:	48 8d 4c 24 38       	lea    rcx,[rsp+0x38]
      fc7de1:	4c 89 29             	mov    QWORD PTR [rcx],r13
      fc7de4:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      fc7de9:	4c 89 2a             	mov    QWORD PTR [rdx],r13
      fc7dec:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      fc7df1:	48 89 54 24 58       	mov    QWORD PTR [rsp+0x58],rdx
      fc7df6:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
      fc7dfb:	c6 44 24 68 00       	mov    BYTE PTR [rsp+0x68],0x0
      fc7e00:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13

### FDE 0xfc8a66..0xfc956b

### FDE 0xfca370..0xfca599

### FDE 0xfca824..0xfcae9c

### FDE 0xfccb60..0xfccfa5

### FDE 0xfcd742..0xfcda33

### FDE 0xfcda34..0xfcdcc7
#### store 0xfcdac3: mov    QWORD PTR [rsp+0x40],r14
      fcda8b:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
      fcda90:	e8 a1 10 b1 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      fcda95:	4c 8b 7c 24 78       	mov    r15,QWORD PTR [rsp+0x78]
      fcda9a:	4d 85 ff             	test   r15,r15
      fcda9d:	74 20                	je     fcdabf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194ed5>
      fcda9f:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      fcdaa4:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]
      fcdaa8:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      fcdaad:	eb 14                	jmp    fcdac3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194ed9>
      fcdaaf:	0f 57 c0             	xorps  xmm0,xmm0
      fcdab2:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      fcdab7:	45 31 ff             	xor    r15d,r15d
      fcdaba:	e9 b6 01 00 00       	jmp    fcdc75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19508b>
      fcdabf:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]
      fcdac3:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
      fcdac8:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
      fcdacd:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
      fcdad2:	48 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],rbp
      fcdad7:	0f 10 44 24 20       	movups xmm0,XMMWORD PTR [rsp+0x20]
      fcdadc:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      fcdae0:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
      fcdae5:	48 85 c0             	test   rax,rax
      fcdae8:	74 05                	je     fcdaef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194f05>
      fcdaea:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fcdaef:	6a 38                	push   0x38
      fcdaf1:	5f                   	pop    rdi
      fcdaf2:	e8 09 04 82 00       	call   17edf00 <_Znwm@plt>
      fcdaf7:	48 8d 4c 24 58       	lea    rcx,[rsp+0x58]
      fcdafc:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      fcdb00:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
      fcdb04:	4d 85 ff             	test   r15,r15
      fcdb07:	74 05                	je     fcdb0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194f24>
      fcdb09:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      fcdb0e:	48 89 68 20          	mov    QWORD PTR [rax+0x20],rbp
      fcdb12:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      fcdb16:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0

### FDE 0xfcdcc8..0xfce489

### FDE 0xfce732..0xfcea99

### FDE 0xfcf446..0xfcfd3d

### FDE 0xfd0320..0xfd0623

### FDE 0xfd0624..0xfd093a

### FDE 0xfd1c5c..0xfd225f

### FDE 0xfd229e..0xfd23ad

### FDE 0xfd23c2..0xfd249b

### FDE 0xfd29b4..0xfd315a
#### store 0xfd2af2: mov    QWORD PTR [rax+0x40],rcx
      fd2ab3:	e8 48 b4 81 00       	call   17edf00 <_Znwm@plt>
      fd2ab8:	48 89 c2             	mov    rdx,rax
      fd2abb:	0f 57 c0             	xorps  xmm0,xmm0
      fd2abe:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd2ac2:	48 8d 0d f7 7c 86 00 	lea    rcx,[rip+0x867cf7]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fd2ac9:	48 89 08             	mov    QWORD PTR [rax],rcx
      fd2acc:	48 8d 0d f5 0a 87 00 	lea    rcx,[rip+0x870af5]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      fd2ad3:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      fd2ad7:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      fd2adb:	48 8d 0d a6 f2 86 00 	lea    rcx,[rip+0x86f2a6]        # 1841d88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13d20>
      fd2ae2:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
      fd2ae6:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      fd2aea:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      fd2aee:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      fd2af2:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      fd2af6:	48 85 c9             	test   rcx,rcx
      fd2af9:	74 05                	je     fd2b00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199f16>
      fd2afb:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fd2b00:	48 83 c0 18          	add    rax,0x18
      fd2b04:	48 8d 0d 6d f0 86 00 	lea    rcx,[rip+0x86f06d]        # 1841b78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13b10>
      fd2b0b:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      fd2b0f:	48 8d 0d 4a f2 86 00 	lea    rcx,[rip+0x86f24a]        # 1841d60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13cf8>
      fd2b16:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      fd2b1a:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]
      fd2b1e:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      fd2b22:	48 8b 4b 38          	mov    rcx,QWORD PTR [rbx+0x38]
      fd2b26:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      fd2b2a:	48 85 c9             	test   rcx,rcx
      fd2b2d:	74 05                	je     fd2b34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199f4a>
      fd2b2f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fd2b34:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
      fd2b3b:	00 
      fd2b3c:	4c 89 ff             	mov    rdi,r15
      fd2b3f:	48 89 c6             	mov    rsi,rax
      fd2b42:	e8 bd bc f2 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      fd2b47:	31 ff                	xor    edi,edi
#### store 0xfd2be1: mov    QWORD PTR [rsp+0x40],rax
      fd2bac:	00 00 
      fd2bae:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      fd2bb5:	00 
      fd2bb6:	4c 8b a4 24 c8 00 00 	mov    r12,QWORD PTR [rsp+0xc8]
      fd2bbd:	00 
      fd2bbe:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      fd2bc5:	00 
      fd2bc6:	4d 85 e4             	test   r12,r12
      fd2bc9:	74 06                	je     fd2bd1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199fe7>
      fd2bcb:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fd2bd1:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      fd2bd8:	00 
      fd2bd9:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
      fd2be0:	00 
      fd2be1:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fd2be6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      fd2bed:	00 
      fd2bee:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      fd2bf3:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      fd2bfa:	00 00 
      fd2bfc:	bf 80 00 00 00       	mov    edi,0x80
      fd2c01:	e8 fa b2 81 00       	call   17edf00 <_Znwm@plt>
      fd2c06:	49 89 c5             	mov    r13,rax
      fd2c09:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
      fd2c0e:	0f 57 c0             	xorps  xmm0,xmm0
      fd2c11:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd2c15:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      fd2c1c:	00 00 
      fd2c1e:	48 8d 05 83 78 86 00 	lea    rax,[rip+0x867883]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
      fd2c25:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      fd2c29:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      fd2c30:	00 
      fd2c31:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      fd2c38:	00 
      fd2c39:	0f 29 84 24 20 01 00 	movaps XMMWORD PTR [rsp+0x120],xmm0
      fd2c40:	00 

### FDE 0xfd3420..0xfd3565

### FDE 0xfd39bc..0xfd47e6
#### store 0xfd432c: mov    QWORD PTR [rsp+0x40],r15
      fd42e9:	66 0f ef c0          	pxor   xmm0,xmm0
      fd42ed:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      fd42f2:	48 8d 05 cf 8d 86 00 	lea    rax,[rip+0x868dcf]        # 183d0c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf060>
      fd42f9:	48 89 03             	mov    QWORD PTR [rbx],rax
      fd42fc:	f3 0f 7f 43 18       	movdqu XMMWORD PTR [rbx+0x18],xmm0
      fd4301:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
      fd4306:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
      fd430b:	f3 0f 7f 43 48       	movdqu XMMWORD PTR [rbx+0x48],xmm0
      fd4310:	f3 0f 7f 43 58       	movdqu XMMWORD PTR [rbx+0x58],xmm0
      fd4315:	f3 0f 7f 43 68       	movdqu XMMWORD PTR [rbx+0x68],xmm0
      fd431a:	48 83 63 78 00       	and    QWORD PTR [rbx+0x78],0x0
      fd431f:	bf 90 00 00 00       	mov    edi,0x90
      fd4324:	e8 d7 9b 81 00       	call   17edf00 <_Znwm@plt>
      fd4329:	48 89 c5             	mov    rbp,rax
      fd432c:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
      fd4331:	49 89 dc             	mov    r12,rbx
      fd4334:	66 0f ef c0          	pxor   xmm0,xmm0
      fd4338:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      fd433d:	48 8d 05 cc e0 86 00 	lea    rax,[rip+0x86e0cc]        # 1842410 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x143a8>
      fd4344:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      fd4348:	f3 0f 7f 45 18       	movdqu XMMWORD PTR [rbp+0x18],xmm0
      fd434d:	f3 0f 7f 45 28       	movdqu XMMWORD PTR [rbp+0x28],xmm0
      fd4352:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
      fd4357:	f3 0f 7f 45 48       	movdqu XMMWORD PTR [rbp+0x48],xmm0
      fd435c:	f3 0f 7f 45 58       	movdqu XMMWORD PTR [rbp+0x58],xmm0
      fd4361:	f3 0f 7f 45 68       	movdqu XMMWORD PTR [rbp+0x68],xmm0
      fd4366:	48 83 a5 88 00 00 00 	and    QWORD PTR [rbp+0x88],0x0
      fd436d:	00 
      fd436e:	f3 0f 7f 45 78       	movdqu XMMWORD PTR [rbp+0x78],xmm0
      fd4373:	f0 48 ff 45 10       	lock inc QWORD PTR [rbp+0x10]
      fd4378:	49 83 c4 18          	add    r12,0x18
      fd437c:	4c 8d 7d 18          	lea    r15,[rbp+0x18]
      fd4380:	4c 89 a4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r12
      fd4387:	00 
      fd4388:	48 89 9c 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rbx
      fd438f:	00 

### FDE 0xfd483a..0xfd4a92

### FDE 0xfd4a92..0xfd4bdd

### FDE 0xfd4bf2..0xfd4c04

### FDE 0xfd4c04..0xfd4cff
#### store 0xfd4c66: mov    QWORD PTR [rax+0x40],rcx
      fd4c31:	41 5e                	pop    r14
      fd4c33:	c3                   	ret
      fd4c34:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
      fd4c38:	bf 88 00 00 00       	mov    edi,0x88
      fd4c3d:	e8 be 92 81 00       	call   17edf00 <_Znwm@plt>
      fd4c42:	48 89 c2             	mov    rdx,rax
      fd4c45:	0f 57 c0             	xorps  xmm0,xmm0
      fd4c48:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd4c4c:	48 8d 0d 6d 5b 86 00 	lea    rcx,[rip+0x865b6d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fd4c53:	48 89 08             	mov    QWORD PTR [rax],rcx
      fd4c56:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      fd4c5a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
      fd4c5e:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      fd4c62:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
      fd4c66:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      fd4c6a:	48 85 c9             	test   rcx,rcx
      fd4c6d:	74 05                	je     fd4c74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c08a>
      fd4c6f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fd4c74:	48 8d 0d 45 d3 86 00 	lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
      fd4c7b:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      fd4c7f:	48 8d 0d 2a d5 86 00 	lea    rcx,[rip+0x86d52a]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
      fd4c86:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      fd4c8a:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
      fd4c8e:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      fd4c92:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
      fd4c96:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
      fd4c9a:	48 85 c9             	test   rcx,rcx
      fd4c9d:	74 05                	je     fd4ca4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0ba>
      fd4c9f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fd4ca4:	48 83 c0 18          	add    rax,0x18
      fd4ca8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
      fd4cac:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
      fd4cb0:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
      fd4cb4:	48 89 4a 60          	mov    QWORD PTR [rdx+0x60],rcx
      fd4cb8:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
      fd4cbc:	48 89 4a 68          	mov    QWORD PTR [rdx+0x68],rcx

### FDE 0xfd4de2..0xfd4eb8

### FDE 0xfd5238..0xfd595c
#### store 0xfd53e1: mov    QWORD PTR [rsp+0x40],rax
      fd53ac:	00 00 
      fd53ae:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      fd53b5:	00 
      fd53b6:	4c 8b a4 24 c8 00 00 	mov    r12,QWORD PTR [rsp+0xc8]
      fd53bd:	00 
      fd53be:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      fd53c5:	00 
      fd53c6:	4d 85 e4             	test   r12,r12
      fd53c9:	74 06                	je     fd53d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c7e7>
      fd53cb:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fd53d1:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      fd53d8:	00 
      fd53d9:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
      fd53e0:	00 
      fd53e1:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fd53e6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      fd53ed:	00 
      fd53ee:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      fd53f3:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      fd53fa:	00 00 
      fd53fc:	bf 80 00 00 00       	mov    edi,0x80
      fd5401:	e8 fa 8a 81 00       	call   17edf00 <_Znwm@plt>
      fd5406:	49 89 c5             	mov    r13,rax
      fd5409:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
      fd540e:	0f 57 c0             	xorps  xmm0,xmm0
      fd5411:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd5415:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      fd541c:	00 00 
      fd541e:	48 8d 05 83 50 86 00 	lea    rax,[rip+0x865083]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
      fd5425:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      fd5429:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      fd5430:	00 
      fd5431:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      fd5438:	00 
      fd5439:	0f 29 84 24 20 01 00 	movaps XMMWORD PTR [rsp+0x120],xmm0
      fd5440:	00 

### FDE 0xfd6072..0xfd652f

### FDE 0xfd69d4..0xfd6b13

### FDE 0xfd6b44..0xfd6fea

### FDE 0xfd6fea..0xfd748e

### FDE 0xfd748e..0xfd779e

### FDE 0xfd77dc..0xfd7bb4

### FDE 0xfd7bb4..0xfd8088

### FDE 0xfd80ae..0xfd810d

### FDE 0xfd810e..0xfd8205
#### store 0xfd8179: mov    QWORD PTR [r14+0x40],rax
      fd8143:	41 5f                	pop    r15
      fd8145:	c3                   	ret
      fd8146:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      fd814a:	bf 30 01 00 00       	mov    edi,0x130
      fd814f:	e8 ac 5d 81 00       	call   17edf00 <_Znwm@plt>
      fd8154:	49 89 c6             	mov    r14,rax
      fd8157:	0f 57 c0             	xorps  xmm0,xmm0
      fd815a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd815e:	48 8d 05 5b 26 86 00 	lea    rax,[rip+0x86265b]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fd8165:	49 89 06             	mov    QWORD PTR [r14],rax
      fd8168:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
      fd816d:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      fd8171:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
      fd8175:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      fd8179:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      fd817d:	48 85 c0             	test   rax,rax
      fd8180:	74 05                	je     fd8187 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f59d>
      fd8182:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fd8187:	4d 8d 66 20          	lea    r12,[r14+0x20]
      fd818b:	48 8d 05 b6 a2 86 00 	lea    rax,[rip+0x86a2b6]        # 1842448 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x143e0>
      fd8192:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      fd8196:	48 8d 05 9b a4 86 00 	lea    rax,[rip+0x86a49b]        # 1842638 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x145d0>
      fd819d:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      fd81a1:	41 8a 47 30          	mov    al,BYTE PTR [r15+0x30]
      fd81a5:	41 88 46 48          	mov    BYTE PTR [r14+0x48],al
      fd81a9:	49 8d 7e 50          	lea    rdi,[r14+0x50]
      fd81ad:	49 83 c7 38          	add    r15,0x38
      fd81b1:	4c 89 fe             	mov    rsi,r15
      fd81b4:	e8 17 01 00 00       	call   fd82d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f6e6>
      fd81b9:	4c 89 f6             	mov    rsi,r14
      fd81bc:	48 83 c6 18          	add    rsi,0x18
      fd81c0:	48 89 df             	mov    rdi,rbx
      fd81c3:	4c 89 f2             	mov    rdx,r14
      fd81c6:	e8 39 66 f2 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      fd81cb:	31 ff                	xor    edi,edi
      fd81cd:	48 83 c4 08          	add    rsp,0x8

### FDE 0xfd837e..0xfd8a34

### FDE 0xfd8a56..0xfd8fdc
#### store 0xfd8db9: mov    QWORD PTR [rsp+0x40],r12
      fd8d80:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      fd8d85:	e8 fc 56 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd8d8a:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
      fd8d8f:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
      fd8d94:	4d 85 f6             	test   r14,r14
      fd8d97:	74 05                	je     fd8d9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a01b4>
      fd8d99:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      fd8d9e:	4c 89 f7             	mov    rdi,r14
      fd8da1:	e8 0c 57 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      fd8da6:	4c 89 f7             	mov    rdi,r14
      fd8da9:	e8 d8 56 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd8dae:	48 89 df             	mov    rdi,rbx
      fd8db1:	e8 72 c5 f4 ff       	call   f25328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec73e>
      fd8db6:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
      fd8db9:	4c 89 64 24 40       	mov    QWORD PTR [rsp+0x40],r12
      fd8dbe:	48 8b 5b 08          	mov    rbx,QWORD PTR [rbx+0x8]
      fd8dc2:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
      fd8dc7:	48 85 db             	test   rbx,rbx
      fd8dca:	74 0f                	je     fd8ddb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a01f1>
      fd8dcc:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      fd8dd1:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      fd8dd6:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      fd8ddb:	4d 85 ff             	test   r15,r15
      fd8dde:	74 6a                	je     fd8e4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0260>
      fd8de0:	6a 20                	push   0x20
      fd8de2:	5f                   	pop    rdi
      fd8de3:	e8 18 51 81 00       	call   17edf00 <_Znwm@plt>
      fd8de8:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
      fd8dec:	48 89 58 18          	mov    QWORD PTR [rax+0x18],rbx
      fd8df0:	48 8d 0d d1 35 f5 ff 	lea    rcx,[rip+0xfffffffffff535d1]        # f2c3c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf37de>
      fd8df7:	48 89 08             	mov    QWORD PTR [rax],rcx
      fd8dfa:	48 8d 0d b7 6a b6 ff 	lea    rcx,[rip+0xffffffffffb66ab7]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      fd8e01:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      fd8e05:	4c 89 ff             	mov    rdi,r15
      fd8e08:	48 89 c6             	mov    rsi,rax
      fd8e0b:	e8 b4 09 ef ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>

### FDE 0xfda042..0xfda0fe

### FDE 0xfdaa8a..0xfdaaed

### FDE 0xfdaaee..0xfdabaa

### FDE 0xfdabc8..0xfdaeac

### FDE 0xfdaeac..0xfdb1d9

### FDE 0xfdb2d6..0xfdb600

### FDE 0xfdb600..0xfdb92a

### FDE 0xfdb92a..0xfdbc54

### FDE 0xfdbcc8..0xfdc0b8

### FDE 0xfdc2a2..0xfdca6a
#### store 0xfdc3e1: mov    QWORD PTR [r15+0x40],rax
      fdc3a1:	e8 5a 1b 81 00       	call   17edf00 <_Znwm@plt>
      fdc3a6:	49 89 c7             	mov    r15,rax
      fdc3a9:	0f 57 c0             	xorps  xmm0,xmm0
      fdc3ac:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fdc3b0:	48 8d 05 09 e4 85 00 	lea    rax,[rip+0x85e409]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fdc3b7:	49 89 07             	mov    QWORD PTR [r15],rax
      fdc3ba:	48 8d 05 07 72 86 00 	lea    rax,[rip+0x867207]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      fdc3c1:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      fdc3c5:	41 0f 11 47 28       	movups XMMWORD PTR [r15+0x28],xmm0
      fdc3ca:	48 8d 05 d7 66 86 00 	lea    rax,[rip+0x8666d7]        # 1842aa8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14a40>
      fdc3d1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      fdc3d5:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
      fdc3d9:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
      fdc3dd:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
      fdc3e1:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      fdc3e5:	48 85 c0             	test   rax,rax
      fdc3e8:	74 05                	je     fdc3ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3805>
      fdc3ea:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fdc3ef:	49 8d 6f 20          	lea    rbp,[r15+0x20]
      fdc3f3:	48 8d 05 9e 64 86 00 	lea    rax,[rip+0x86649e]        # 1842898 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14830>
      fdc3fa:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      fdc3fe:	48 8d 05 7b 66 86 00 	lea    rax,[rip+0x86667b]        # 1842a80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14a18>
      fdc405:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      fdc409:	49 8d 7f 48          	lea    rdi,[r15+0x48]
      fdc40d:	48 8d 73 30          	lea    rsi,[rbx+0x30]
      fdc411:	e8 2a 1b 81 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      fdc416:	4c 89 fe             	mov    rsi,r15
      fdc419:	48 83 c6 18          	add    rsi,0x18
      fdc41d:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
      fdc421:	49 89 47 60          	mov    QWORD PTR [r15+0x60],rax
      fdc425:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
      fdc429:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
      fdc42d:	48 85 c0             	test   rax,rax
      fdc430:	74 05                	je     fdc437 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a384d>
      fdc432:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fdc437:	48 8d ac 24 c0 00 00 	lea    rbp,[rsp+0xc0]
#### store 0xfdc4e5: mov    QWORD PTR [rsp+0x40],rax
      fdc4b0:	00 00 
      fdc4b2:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
      fdc4b9:	00 
      fdc4ba:	4c 8b a4 24 c8 00 00 	mov    r12,QWORD PTR [rsp+0xc8]
      fdc4c1:	00 
      fdc4c2:	4c 89 a4 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r12
      fdc4c9:	00 
      fdc4ca:	4d 85 e4             	test   r12,r12
      fdc4cd:	74 06                	je     fdc4d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a38eb>
      fdc4cf:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      fdc4d5:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
      fdc4dc:	00 
      fdc4dd:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
      fdc4e4:	00 
      fdc4e5:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      fdc4ea:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      fdc4f1:	00 
      fdc4f2:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
      fdc4f7:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      fdc4fe:	00 00 
      fdc500:	bf 80 00 00 00       	mov    edi,0x80
      fdc505:	e8 f6 19 81 00       	call   17edf00 <_Znwm@plt>
      fdc50a:	49 89 c5             	mov    r13,rax
      fdc50d:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
      fdc512:	0f 57 c0             	xorps  xmm0,xmm0
      fdc515:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fdc519:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
      fdc520:	00 00 
      fdc522:	48 8d 05 7f df 85 00 	lea    rax,[rip+0x85df7f]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
      fdc529:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      fdc52d:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      fdc534:	00 
      fdc535:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      fdc53c:	00 
      fdc53d:	0f 29 84 24 20 01 00 	movaps XMMWORD PTR [rsp+0x120],xmm0
      fdc544:	00 

### FDE 0xfdccfc..0xfdcfdc

### FDE 0xfddcde..0xfddfce

### FDE 0xfde1dc..0xfde4c4

### FDE 0xfde6d2..0xfde9c2

### FDE 0xfe45d2..0xfe48fd

### FDE 0xfe48fe..0xfe4b7a

### FDE 0xfe4c22..0xfe4e48

### FDE 0xfe4e48..0xfe5238

### FDE 0xfe526c..0xfe5342

### FDE 0xfe5d08..0xfe5de6
#### store 0xfe5d68: mov    QWORD PTR [rax+0x40],rcx
      fe5d37:	c3                   	ret
      fe5d38:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
      fe5d3c:	6a 78                	push   0x78
      fe5d3e:	5f                   	pop    rdi
      fe5d3f:	e8 bc 81 80 00       	call   17edf00 <_Znwm@plt>
      fe5d44:	48 89 c2             	mov    rdx,rax
      fe5d47:	0f 57 c0             	xorps  xmm0,xmm0
      fe5d4a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fe5d4e:	48 8d 0d 6b 4a 85 00 	lea    rcx,[rip+0x854a6b]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      fe5d55:	48 89 08             	mov    QWORD PTR [rax],rcx
      fe5d58:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
      fe5d5c:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
      fe5d60:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
      fe5d64:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
      fe5d68:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
      fe5d6c:	48 85 c9             	test   rcx,rcx
      fe5d6f:	74 05                	je     fe5d76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad18c>
      fe5d71:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      fe5d76:	48 83 c0 18          	add    rax,0x18
      fe5d7a:	48 8d 0d 87 d3 85 00 	lea    rcx,[rip+0x85d387]        # 1843108 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x150a0>
      fe5d81:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      fe5d85:	48 8d 0d 6c d5 85 00 	lea    rcx,[rip+0x85d56c]        # 18432f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15290>
      fe5d8c:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      fe5d90:	48 8d 0d c1 d7 85 00 	lea    rcx,[rip+0x85d7c1]        # 1843558 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x154f0>
      fe5d97:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
      fe5d9b:	41 0f 10 46 38       	movups xmm0,XMMWORD PTR [r14+0x38]
      fe5da0:	0f 11 42 50          	movups XMMWORD PTR [rdx+0x50],xmm0
      fe5da4:	41 8a 4e 48          	mov    cl,BYTE PTR [r14+0x48]
      fe5da8:	88 4a 60             	mov    BYTE PTR [rdx+0x60],cl
      fe5dab:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
      fe5daf:	48 89 4a 68          	mov    QWORD PTR [rdx+0x68],rcx
      fe5db3:	49 8b 4e 58          	mov    rcx,QWORD PTR [r14+0x58]
      fe5db7:	48 89 4a 70          	mov    QWORD PTR [rdx+0x70],rcx
      fe5dbb:	48 85 c9             	test   rcx,rcx
      fe5dbe:	74 05                	je     fe5dc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ad1db>
      fe5dc0:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]

### FDE 0xfe63ca..0xfe6509

### FDE 0x102b43c..0x102be9e
#### store 0x102b6d2: mov    QWORD PTR [rsp+0x40],r15
     102b699:	48 8d 54 24 78       	lea    rdx,[rsp+0x78]
     102b69e:	4c 89 f6             	mov    rsi,r14
     102b6a1:	45 31 c0             	xor    r8d,r8d
     102b6a4:	e8 dd 09 00 00       	call   102c086 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f349c>
     102b6a9:	eb 27                	jmp    102b6d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f2ae8>
     102b6ab:	48 8d b4 24 f0 01 00 	lea    rsi,[rsp+0x1f0]
     102b6b2:	00 
     102b6b3:	66 0f 7f 46 20       	movdqa XMMWORD PTR [rsi+0x20],xmm0
     102b6b8:	66 0f 7f 46 10       	movdqa XMMWORD PTR [rsi+0x10],xmm0
     102b6bd:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
     102b6c1:	c6 46 28 01          	mov    BYTE PTR [rsi+0x28],0x1
     102b6c5:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     102b6cc:	00 
     102b6cd:	e8 68 14 00 00       	call   102cb3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f3f50>
     102b6d2:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
     102b6d7:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
     102b6dc:	bf 98 00 00 00       	mov    edi,0x98
     102b6e1:	e8 1a 28 7c 00       	call   17edf00 <_Znwm@plt>
     102b6e6:	48 89 c5             	mov    rbp,rax
     102b6e9:	66 0f ef c0          	pxor   xmm0,xmm0
     102b6ed:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     102b6f2:	48 8d 05 1f a7 81 00 	lea    rax,[rip+0x81a71f]        # 1845e18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2500>
     102b6f9:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     102b6fd:	f3 0f 7f 45 18       	movdqu XMMWORD PTR [rbp+0x18],xmm0
     102b702:	f3 0f 7f 45 28       	movdqu XMMWORD PTR [rbp+0x28],xmm0
     102b707:	f3 0f 7f 45 38       	movdqu XMMWORD PTR [rbp+0x38],xmm0
     102b70c:	f3 0f 7f 45 48       	movdqu XMMWORD PTR [rbp+0x48],xmm0
     102b711:	f3 0f 7f 45 58       	movdqu XMMWORD PTR [rbp+0x58],xmm0
     102b716:	f3 0f 7f 45 68       	movdqu XMMWORD PTR [rbp+0x68],xmm0
     102b71b:	f3 0f 7f 45 78       	movdqu XMMWORD PTR [rbp+0x78],xmm0
     102b720:	f3 0f 7f 85 88 00 00 	movdqu XMMWORD PTR [rbp+0x88],xmm0
     102b727:	00 
     102b728:	bf a8 00 00 00       	mov    edi,0xa8
     102b72d:	e8 ce 27 7c 00       	call   17edf00 <_Znwm@plt>
     102b732:	49 89 c7             	mov    r15,rax
     102b735:	49 89 ed             	mov    r13,rbp

### FDE 0x102c086..0x102cb3a

### FDE 0x102e90a..0x102f6da
#### store 0x102ef2c: mov    QWORD PTR [rax+0x40],rdx
     102eef4:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     102eef8:	48 85 d2             	test   rdx,rdx
     102eefb:	74 05                	je     102ef02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f6318>
     102eefd:	f0 48 ff 42 10       	lock inc QWORD PTR [rdx+0x10]
     102ef02:	4c 8d ac 24 80 01 00 	lea    r13,[rsp+0x180]
     102ef09:	00 
     102ef0a:	41 0f 10 45 10       	movups xmm0,XMMWORD PTR [r13+0x10]
     102ef0f:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     102ef13:	0f 57 c9             	xorps  xmm1,xmm1
     102ef16:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
     102ef19:	41 0f 10 45 20       	movups xmm0,XMMWORD PTR [r13+0x20]
     102ef1e:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     102ef22:	49 8b 55 30          	mov    rdx,QWORD PTR [r13+0x30]
     102ef26:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     102ef2c:	48 89 50 40          	mov    QWORD PTR [rax+0x40],rdx
     102ef30:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
     102ef35:	41 0f 10 45 38       	movups xmm0,XMMWORD PTR [r13+0x38]
     102ef3a:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
     102ef3e:	0f 11 49 28          	movups XMMWORD PTR [rcx+0x28],xmm1
     102ef42:	41 0f 10 45 48       	movups xmm0,XMMWORD PTR [r13+0x48]
     102ef47:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0
     102ef4b:	0f 11 49 38          	movups XMMWORD PTR [rcx+0x38],xmm1
     102ef4f:	48 8d 0d e4 a8 fe ff 	lea    rcx,[rip+0xfffffffffffea8e4]        # 101983a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0c50>
     102ef56:	48 89 08             	mov    QWORD PTR [rax],rcx
     102ef59:	48 8d 0d e6 ae fe ff 	lea    rcx,[rip+0xfffffffffffeaee6]        # 1019e46 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e125c>
     102ef60:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     102ef64:	4c 89 f7             	mov    rdi,r14
     102ef67:	48 89 c6             	mov    rsi,rax
     102ef6a:	e8 b7 8d f8 ff       	call   fb7d26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f13c>
     102ef6f:	4c 89 ef             	mov    rdi,r13
     102ef72:	e8 d9 ae fe ff       	call   1019e50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1266>
     102ef77:	0f 57 c0             	xorps  xmm0,xmm0
     102ef7a:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
     102ef7f:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     102ef86:	00 
     102ef87:	4c 8d b4 24 80 01 00 	lea    r14,[rsp+0x180]

### FDE 0x10a229e..0x10a2bc4
#### store 0x10a258c: mov    QWORD PTR [r15+0x40],rbp
     10a2552:	48 83 c0 b8          	add    rax,0xffffffffffffffb8
     10a2556:	4d 8b 6f 30          	mov    r13,QWORD PTR [r15+0x30]
     10a255a:	49 8b 5f 38          	mov    rbx,QWORD PTR [r15+0x38]
     10a255e:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     10a2563:	eb 1f                	jmp    10a2584 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26999a>
     10a2565:	49 8b be 88 03 00 00 	mov    rdi,QWORD PTR [r14+0x388]
     10a256c:	e8 e3 f0 ff ff       	call   10a1654 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268a6a>
     10a2571:	41 c6 86 80 03 00 00 	mov    BYTE PTR [r14+0x380],0x0
     10a2578:	00 
     10a2579:	e9 e0 04 00 00       	jmp    10a2a5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269e74>
     10a257e:	49 89 dd             	mov    r13,rbx
     10a2581:	4c 89 e0             	mov    rax,r12
     10a2584:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     10a2588:	49 89 6f 38          	mov    QWORD PTR [r15+0x38],rbp
     10a258c:	49 89 6f 40          	mov    QWORD PTR [r15+0x40],rbp
     10a2590:	4c 39 eb             	cmp    rbx,r13
     10a2593:	74 0e                	je     10a25a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2699b9>
     10a2595:	48 83 c3 b8          	add    rbx,0xffffffffffffffb8
     10a2599:	48 89 df             	mov    rdi,rbx
     10a259c:	e8 f5 0e 00 00       	call   10a3496 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a8ac>
     10a25a1:	eb ed                	jmp    10a2590 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2699a6>
     10a25a3:	4d 85 ed             	test   r13,r13
     10a25a6:	74 08                	je     10a25b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2699c6>
     10a25a8:	4c 89 ef             	mov    rdi,r13
     10a25ab:	e8 70 b9 74 00       	call   17edf20 <_ZdlPv@plt>
     10a25b0:	49 89 6f 38          	mov    QWORD PTR [r15+0x38],rbp
     10a25b4:	41 c7 47 08 01 00 00 	mov    DWORD PTR [r15+0x8],0x1
     10a25bb:	00 
     10a25bc:	48 8d 9c 24 00 01 00 	lea    rbx,[rsp+0x100]
     10a25c3:	00 
     10a25c4:	4c 89 3b             	mov    QWORD PTR [rbx],r15
     10a25c7:	4c 89 f7             	mov    rdi,r14
     10a25ca:	48 89 de             	mov    rsi,rbx
     10a25cd:	e8 f0 0e 00 00       	call   10a34c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a8d8>
     10a25d2:	49 83 c6 30          	add    r14,0x30
     10a25d6:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### FDE 0x10a3908..0x10a39c4

### FDE 0x10a3a6c..0x10a3b28

### FDE 0x12aeba0..0x12af0f7

### FDE 0x12b236e..0x12b28ba

### FDE 0x12b2a3e..0x12b3590
#### store 0x12b310c: mov    QWORD PTR [rsi+0x40],rdx
     12b30d1:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     12b30d6:	48 39 44 24 70       	cmp    QWORD PTR [rsp+0x70],rax
     12b30db:	0f 84 9e 00 00 00    	je     12b317f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf8703>
     12b30e1:	0f 57 c0             	xorps  xmm0,xmm0
     12b30e4:	48 8d b4 24 c0 04 00 	lea    rsi,[rsp+0x4c0]
     12b30eb:	00 
     12b30ec:	0f 29 46 20          	movaps XMMWORD PTR [rsi+0x20],xmm0
     12b30f0:	0f 29 46 10          	movaps XMMWORD PTR [rsi+0x10],xmm0
     12b30f4:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     12b30f7:	48 8b 4c 24 70       	mov    rcx,QWORD PTR [rsp+0x70]
     12b30fc:	48 8b 94 24 80 00 00 	mov    rdx,QWORD PTR [rsp+0x80]
     12b3103:	00 
     12b3104:	48 89 4e 30          	mov    QWORD PTR [rsi+0x30],rcx
     12b3108:	48 89 46 38          	mov    QWORD PTR [rsi+0x38],rax
     12b310c:	48 89 56 40          	mov    QWORD PTR [rsi+0x40],rdx
     12b3110:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     12b3115:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     12b311c:	00 00 
     12b311e:	c6 46 48 01          	mov    BYTE PTR [rsi+0x48],0x1
     12b3122:	0f 29 46 50          	movaps XMMWORD PTR [rsi+0x50],xmm0
     12b3126:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
     12b312b:	48 8d 9c 24 30 05 00 	lea    rbx,[rsp+0x530]
     12b3132:	00 
     12b3133:	48 89 df             	mov    rdi,rbx
     12b3136:	e8 a9 d6 41 00       	call   16d07e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84950>
     12b313b:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     12b3140:	48 89 de             	mov    rsi,rbx
     12b3143:	e8 00 19 c1 ff       	call   ec4a48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8be5e>
     12b3148:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     12b314f:	00 
     12b3150:	48 8d 5c 24 58       	lea    rbx,[rsp+0x58]
     12b3155:	48 89 de             	mov    rsi,rbx
     12b3158:	e8 e5 19 c1 ff       	call   ec4b42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8bf58>
     12b315d:	48 89 df             	mov    rdi,rbx
     12b3160:	e8 23 82 b5 ff       	call   e0b388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd840e>
     12b3165:	48 8d bc 24 30 05 00 	lea    rdi,[rsp+0x530]

### FDE 0x12cd240..0x12cf4c0
#### store 0x12ce9d2: mov    QWORD PTR [r14+0x40],rbp
     12ce997:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     12ce99e:	00 
     12ce99f:	e8 fc 2d 05 00       	call   13217a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166d24>
     12ce9a4:	4c 89 f7             	mov    rdi,r14
     12ce9a7:	e8 06 fb 7c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     12ce9ac:	4c 8b 6c 24 28       	mov    r13,QWORD PTR [rsp+0x28]
     12ce9b1:	49 8d bd c0 00 00 00 	lea    rdi,[r13+0xc0]
     12ce9b8:	31 f6                	xor    esi,esi
     12ce9ba:	e8 f9 ea 7e ff       	call   abd4b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa458>
     12ce9bf:	e9 99 05 00 00       	jmp    12cef5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1144e1>
     12ce9c4:	4d 89 e5             	mov    r13,r12
     12ce9c7:	4c 89 f8             	mov    rax,r15
     12ce9ca:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     12ce9ce:	49 89 6e 38          	mov    QWORD PTR [r14+0x38],rbp
     12ce9d2:	49 89 6e 40          	mov    QWORD PTR [r14+0x40],rbp
     12ce9d6:	4d 39 ec             	cmp    r12,r13
     12ce9d9:	48 8b 5c 24 38       	mov    rbx,QWORD PTR [rsp+0x38]
     12ce9de:	74 11                	je     12ce9f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x113f75>
     12ce9e0:	49 83 c4 b8          	add    r12,0xffffffffffffffb8
     12ce9e4:	4c 89 e7             	mov    rdi,r12
     12ce9e7:	e8 cc 2c 05 00       	call   13216b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166c3c>
     12ce9ec:	4d 39 ec             	cmp    r12,r13
     12ce9ef:	75 ef                	jne    12ce9e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x113f64>
     12ce9f1:	4d 85 ed             	test   r13,r13
     12ce9f4:	74 08                	je     12ce9fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x113f82>
     12ce9f6:	4c 89 ef             	mov    rdi,r13
     12ce9f9:	e8 22 f5 51 00       	call   17edf20 <_ZdlPv@plt>
     12ce9fe:	49 89 6e 38          	mov    QWORD PTR [r14+0x38],rbp
     12cea02:	41 c7 46 08 01 00 00 	mov    DWORD PTR [r14+0x8],0x1
     12cea09:	00 
     12cea0a:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]
     12cea11:	00 
     12cea12:	4d 89 34 24          	mov    QWORD PTR [r12],r14
     12cea16:	4c 8b 6c 24 30       	mov    r13,QWORD PTR [rsp+0x30]
     12cea1b:	4c 89 ef             	mov    rdi,r13
     12cea1e:	4c 89 e6             	mov    rsi,r12

### FDE 0x12db180..0x12db538

### FDE 0x13216e4..0x13217a0

### FDE 0x1321848..0x1321904

### FDE 0x1549a7c..0x1549bda
#### store 0x1549b2e: mov    QWORD PTR [rsp+0x40],r15
     1549af0:	4d 85 f6             	test   r14,r14
     1549af3:	74 22                	je     1549b17 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38f09b>
     1549af5:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     1549afa:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1549aff:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
     1549b04:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
     1549b09:	eb 17                	jmp    1549b22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38f0a6>
     1549b0b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1549b10:	e8 1b 23 56 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     1549b15:	eb 6f                	jmp    1549b86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38f10a>
     1549b17:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1549b1c:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     1549b22:	48 8d 05 ff 56 33 00 	lea    rax,[rip+0x3356ff]        # 187f228 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b910>
     1549b29:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1549b2e:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
     1549b33:	48 8d 53 58          	lea    rdx,[rbx+0x58]
     1549b37:	4c 8b 83 b0 00 00 00 	mov    r8,QWORD PTR [rbx+0xb0]
     1549b3e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1549b41:	44 8b 8b b8 00 00 00 	mov    r9d,DWORD PTR [rbx+0xb8]
     1549b48:	48 89 e7             	mov    rdi,rsp
     1549b4b:	4c 89 f9             	mov    rcx,r15
     1549b4e:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1549b51:	48 83 c3 68          	add    rbx,0x68
     1549b55:	49 89 e7             	mov    r15,rsp
     1549b58:	48 89 df             	mov    rdi,rbx
     1549b5b:	4c 89 fe             	mov    rsi,r15
     1549b5e:	e8 b9 fc 56 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     1549b63:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1549b67:	e8 1a 49 55 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1549b6c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1549b71:	e8 f4 03 53 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1549b76:	4c 89 f7             	mov    rdi,r14
     1549b79:	e8 08 49 55 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1549b7e:	4c 89 f7             	mov    rdi,r14
     1549b81:	e8 00 49 55 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1549b86:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### FDE 0x1549db8..0x1549f01

### FDE 0x15762e9..0x157635d

### FDE 0x1577d0c..0x15787b5

### FDE 0x157c6d8..0x157d029

### FDE 0x159e9ba..0x159eb32

### FDE 0x159eb32..0x159ebc9

### FDE 0x159ed72..0x159eeea

### FDE 0x159eeea..0x159f117

### FDE 0x159f45e..0x159f709

### FDE 0x159fcec..0x159fea8

### FDE 0x15a0000..0x15a0208
#### store 0x15a009c: mov    QWORD PTR [rsp+0x40],rcx
     15a0064:	e8 ba 2b 68 ff       	call   c22c23 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16fbc3>
     15a0069:	49 89 c4             	mov    r12,rax
     15a006c:	48 8d 43 10          	lea    rax,[rbx+0x10]
     15a0070:	4c 89 23             	mov    QWORD PTR [rbx],r12
     15a0073:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
     15a0077:	48 6b ca 60          	imul   rcx,rdx,0x60
     15a007b:	4c 01 e1             	add    rcx,r12
     15a007e:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
     15a0082:	48 8d 4c 24 18       	lea    rcx,[rsp+0x18]
     15a0087:	4c 89 21             	mov    QWORD PTR [rcx],r12
     15a008a:	48 8d 54 24 10       	lea    rdx,[rsp+0x10]
     15a008f:	4c 89 22             	mov    QWORD PTR [rdx],r12
     15a0092:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     15a0097:	48 89 54 24 38       	mov    QWORD PTR [rsp+0x38],rdx
     15a009c:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
     15a00a1:	c6 44 24 48 00       	mov    BYTE PTR [rsp+0x48],0x0
     15a00a6:	49 6b ed 60          	imul   rbp,r13,0x60
     15a00aa:	4d 89 e5             	mov    r13,r12
     15a00ad:	4c 89 ef             	mov    rdi,r13
     15a00b0:	4c 89 fe             	mov    rsi,r15
     15a00b3:	e8 c6 fb ff ff       	call   159fc7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e5202>
     15a00b8:	49 83 c7 60          	add    r15,0x60
     15a00bc:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     15a00c1:	49 83 c5 60          	add    r13,0x60
     15a00c5:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
     15a00ca:	48 83 c5 a0          	add    rbp,0xffffffffffffffa0
     15a00ce:	75 dd                	jne    15a00ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e5631>
     15a00d0:	40 b5 01             	mov    bpl,0x1
     15a00d3:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15a00d8:	40 88 6f 18          	mov    BYTE PTR [rdi+0x18],bpl
     15a00dc:	e8 d7 fb ff ff       	call   159fcb8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e523c>
     15a00e1:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     15a00e5:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     15a00ea:	40 88 6f 08          	mov    BYTE PTR [rdi+0x8],bpl
     15a00ee:	e8 15 01 00 00       	call   15a0208 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e578c>
     15a00f3:	49 8d be 68 01 00 00 	lea    rdi,[r14+0x168]

### FDE 0x15a026a..0x15a0a2b

### FDE 0x15a0b06..0x15a0d7e
#### store 0x15a0c89: mov    QWORD PTR [rsp+0x40],r13
     15a0c4c:	83 7c 24 04 01       	cmp    DWORD PTR [rsp+0x4],0x1
     15a0c51:	75 17                	jne    15a0c6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e61ee>
     15a0c53:	48 8b bb 40 01 00 00 	mov    rdi,QWORD PTR [rbx+0x140]
     15a0c5a:	e8 03 98 4d ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
     15a0c5f:	48 89 df             	mov    rdi,rbx
     15a0c62:	48 89 c6             	mov    rsi,rax
     15a0c65:	e8 c8 de ff ff       	call   159eb32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e40b6>
     15a0c6a:	48 8d 73 08          	lea    rsi,[rbx+0x8]
     15a0c6e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     15a0c73:	e8 e2 b1 6e ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
     15a0c78:	41 89 ee             	mov    r14d,ebp
     15a0c7b:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     15a0c80:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     15a0c85:	4c 8d 6b 20          	lea    r13,[rbx+0x20]
     15a0c89:	4c 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],r13
     15a0c8e:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     15a0c92:	0f 10 43 48          	movups xmm0,XMMWORD PTR [rbx+0x48]
     15a0c96:	0f 11 44 24 48       	movups XMMWORD PTR [rsp+0x48],xmm0
     15a0c9b:	48 85 c0             	test   rax,rax
     15a0c9e:	74 05                	je     15a0ca5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6229>
     15a0ca0:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     15a0ca5:	ff 43 40             	inc    DWORD PTR [rbx+0x40]
     15a0ca8:	48 8b 6b 38          	mov    rbp,QWORD PTR [rbx+0x38]
     15a0cac:	48 85 ed             	test   rbp,rbp
     15a0caf:	74 36                	je     15a0ce7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e626b>
     15a0cb1:	4d 29 fc             	sub    r12,r15
     15a0cb4:	49 c1 fc 02          	sar    r12,0x2
     15a0cb8:	31 db                	xor    ebx,ebx
     15a0cba:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     15a0cbe:	48 8b 3c d8          	mov    rdi,QWORD PTR [rax+rbx*8]
     15a0cc2:	48 85 ff             	test   rdi,rdi
     15a0cc5:	74 18                	je     15a0cdf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6263>
     15a0cc7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15a0cca:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     15a0ccf:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]
     15a0cd3:	4c 89 f9             	mov    rcx,r15

### FDE 0x15a1308..0x15a185f

### FDE 0x15a1ac2..0x15a2266

### FDE 0x15a2286..0x15a23c8
#### store 0x15a22a4: mov    QWORD PTR [rsp+0x40],rax
     15a2286:	55                   	push   rbp
     15a2287:	41 57                	push   r15
     15a2289:	41 56                	push   r14
     15a228b:	41 55                	push   r13
     15a228d:	41 54                	push   r12
     15a228f:	53                   	push   rbx
     15a2290:	48 83 ec 48          	sub    rsp,0x48
     15a2294:	89 d3                	mov    ebx,edx
     15a2296:	89 f5                	mov    ebp,esi
     15a2298:	49 89 fe             	mov    r14,rdi
     15a229b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15a22a2:	00 00 
     15a22a4:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     15a22a9:	4c 8d 64 24 1f       	lea    r12,[rsp+0x1f]
     15a22ae:	41 c6 04 24 00       	mov    BYTE PTR [r12],0x0
     15a22b3:	48 8b 47 70          	mov    rax,QWORD PTR [rdi+0x70]
     15a22b7:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     15a22bc:	49 89 0f             	mov    QWORD PTR [r15],rcx
     15a22bf:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
     15a22c3:	48 8d 0d 7a b9 53 ff 	lea    rcx,[rip+0xffffffffff53b97a]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     15a22ca:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     15a22ce:	48 8d 0d 03 02 00 00 	lea    rcx,[rip+0x203]        # 15a24d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e7a5c>
     15a22d5:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     15a22d9:	48 8b b8 e8 00 00 00 	mov    rdi,QWORD PTR [rax+0xe8]
     15a22e0:	89 d6                	mov    esi,edx
     15a22e2:	4c 89 fa             	mov    rdx,r15
     15a22e5:	e8 f8 dc ff ff       	call   159ffe2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e5566>
     15a22ea:	4c 89 ff             	mov    rdi,r15
     15a22ed:	e8 b6 63 cb ff       	call   12586a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dc2c>
     15a22f2:	41 80 3c 24 00       	cmp    BYTE PTR [r12],0x0
     15a22f7:	74 7c                	je     15a2375 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e78f9>
     15a22f9:	49 8d 76 08          	lea    rsi,[r14+0x8]
     15a22fd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     15a2302:	e8 53 9b 6e ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>

### FDE 0x15a25a4..0x15a2638

### FDE 0x15a2638..0x15a26c1

### FDE 0x15a26c2..0x15a279d

### FDE 0x15a2872..0x15a294f

### FDE 0x15a2aee..0x15a3382
#### store 0x15a2d0f: mov    QWORD PTR [rsp+0x40],rax
     15a2ce5:	4c 39 e8             	cmp    rax,r13
     15a2ce8:	72 0c                	jb     15a2cf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e827a>
     15a2cea:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     15a2cee:	31 d2                	xor    edx,edx
     15a2cf0:	49 f7 f5             	div    r13
     15a2cf3:	48 89 d5             	mov    rbp,rdx
     15a2cf6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     15a2cfa:	48 8b 04 e8          	mov    rax,QWORD PTR [rax+rbp*8]
     15a2cfe:	48 85 c0             	test   rax,rax
     15a2d01:	74 56                	je     15a2d59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e82dd>
     15a2d03:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     15a2d06:	4d 85 f6             	test   r14,r14
     15a2d09:	74 4e                	je     15a2d59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e82dd>
     15a2d0b:	49 8d 45 ff          	lea    rax,[r13-0x1]
     15a2d0f:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     15a2d14:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     15a2d18:	48 3b 04 24          	cmp    rax,QWORD PTR [rsp]
     15a2d1c:	75 15                	jne    15a2d33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e82b7>
     15a2d1e:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     15a2d22:	4c 89 fe             	mov    rsi,r15
     15a2d25:	e8 c4 c9 4f ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     15a2d2a:	84 c0                	test   al,al
     15a2d2c:	74 23                	je     15a2d51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e82d5>
     15a2d2e:	e9 86 02 00 00       	jmp    15a2fb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e853d>
     15a2d33:	83 fb 01             	cmp    ebx,0x1
     15a2d36:	77 07                	ja     15a2d3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e82c3>
     15a2d38:	48 23 44 24 40       	and    rax,QWORD PTR [rsp+0x40]
     15a2d3d:	eb 0d                	jmp    15a2d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e82d0>
     15a2d3f:	4c 39 e8             	cmp    rax,r13
     15a2d42:	72 08                	jb     15a2d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e82d0>
     15a2d44:	31 d2                	xor    edx,edx
     15a2d46:	49 f7 f5             	div    r13
     15a2d49:	48 89 d0             	mov    rax,rdx
     15a2d4c:	48 39 e8             	cmp    rax,rbp
     15a2d4f:	75 08                	jne    15a2d59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e82dd>
     15a2d51:	4d 8b 36             	mov    r14,QWORD PTR [r14]

### FDE 0x15a36a2..0x15a3770

### FDE 0x15a3770..0x15a384e

### FDE 0x15a3878..0x15a39a3

### FDE 0x15a39a4..0x15a3ae7

### FDE 0x15a3ae8..0x15a4011
#### store 0x15a3b07: mov    QWORD PTR [rsp+0x40],rax
     15a3ae8:	55                   	push   rbp
     15a3ae9:	41 57                	push   r15
     15a3aeb:	41 56                	push   r14
     15a3aed:	41 55                	push   r13
     15a3aef:	41 54                	push   r12
     15a3af1:	53                   	push   rbx
     15a3af2:	48 83 ec 48          	sub    rsp,0x48
     15a3af6:	49 89 d5             	mov    r13,rdx
     15a3af9:	89 f5                	mov    ebp,esi
     15a3afb:	49 89 fe             	mov    r14,rdi
     15a3afe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15a3b05:	00 00 
     15a3b07:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     15a3b0c:	89 74 24 0c          	mov    DWORD PTR [rsp+0xc],esi
     15a3b10:	8b 42 10             	mov    eax,DWORD PTR [rdx+0x10]
     15a3b13:	a8 01                	test   al,0x1
     15a3b15:	74 25                	je     15a3b3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e90c0>
     15a3b17:	49 8b 55 48          	mov    rdx,QWORD PTR [r13+0x48]
     15a3b1b:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
     15a3b1f:	f6 02 01             	test   BYTE PTR [rdx],0x1
     15a3b22:	74 06                	je     15a3b2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e90ae>
     15a3b24:	48 8b 52 10          	mov    rdx,QWORD PTR [rdx+0x10]
     15a3b28:	eb 04                	jmp    15a3b2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e90b2>
     15a3b2a:	48 83 ca 01          	or     rdx,0x1
     15a3b2e:	4c 89 f7             	mov    rdi,r14
     15a3b31:	89 ee                	mov    esi,ebp
     15a3b33:	e8 82 ae ff ff       	call   159e9ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e3f3e>
     15a3b38:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
     15a3b3c:	a8 02                	test   al,0x2
     15a3b3e:	74 25                	je     15a3b65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e90e9>
     15a3b40:	49 8b 55 50          	mov    rdx,QWORD PTR [r13+0x50]
     15a3b44:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
     15a3b48:	f6 02 01             	test   BYTE PTR [rdx],0x1
     15a3b4b:	74 06                	je     15a3b53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e90d7>

### FDE 0x15a4012..0x15a40b2

### FDE 0x15a40b2..0x15a417b

### FDE 0x15a417c..0x15a42be

### FDE 0x15a42be..0x15a43ec

### FDE 0x15a43ec..0x15a4490

### FDE 0x15a453a..0x15a4690

### FDE 0x15a4690..0x15a478a

### FDE 0x15a48a0..0x15a4bc8

### FDE 0x15a4bde..0x15a4ccf

### FDE 0x15a4df6..0x15a4eb0

### FDE 0x15f8cf0..0x15f9b1f

### FDE 0x15fa9d0..0x15faaba

### FDE 0x15faaba..0x15fae30

### FDE 0x15fb962..0x15fbe10

### FDE 0x15fc198..0x15fc766

### FDE 0x163a03e..0x163a0e0

### FDE 0x163b988..0x163ba2a

### FDE 0x163ba2a..0x163bacc

### FDE 0x163c71a..0x163c7a6

### FDE 0x16407b6..0x1640895

### FDE 0x1640896..0x164095a

### FDE 0x1642a08..0x1642ac9

### FDE 0x1644974..0x16455d5
#### store 0x1644d0f: mov    QWORD PTR [rbx+0x40],r15
     1644cde:	49 c1 e7 04          	shl    r15,0x4
     1644ce2:	4c 89 e7             	mov    rdi,r12
     1644ce5:	31 f6                	xor    esi,esi
     1644ce7:	4c 89 fa             	mov    rdx,r15
     1644cea:	e8 a1 9e 1a 00       	call   17eeb90 <memset@plt>
     1644cef:	4d 01 e7             	add    r15,r12
     1644cf2:	4c 89 7b 28          	mov    QWORD PTR [rbx+0x28],r15
     1644cf6:	e9 d9 00 00 00       	jmp    1644dd4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ff42>
     1644cfb:	49 c1 e7 04          	shl    r15,0x4
     1644cff:	4c 89 e7             	mov    rdi,r12
     1644d02:	31 f6                	xor    esi,esi
     1644d04:	4c 89 fa             	mov    rdx,r15
     1644d07:	e8 84 9e 1a 00       	call   17eeb90 <memset@plt>
     1644d0c:	4d 01 e7             	add    r15,r12
     1644d0f:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15
     1644d13:	e9 bc 00 00 00       	jmp    1644dd4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ff42>
     1644d18:	49 c1 e7 04          	shl    r15,0x4
     1644d1c:	4c 89 e7             	mov    rdi,r12
     1644d1f:	31 f6                	xor    esi,esi
     1644d21:	4c 89 fa             	mov    rdx,r15
     1644d24:	e8 67 9e 1a 00       	call   17eeb90 <memset@plt>
     1644d29:	4d 01 e7             	add    r15,r12
     1644d2c:	4c 89 7b 10          	mov    QWORD PTR [rbx+0x10],r15
     1644d30:	e9 9f 00 00 00       	jmp    1644dd4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ff42>
     1644d35:	31 c0                	xor    eax,eax
     1644d37:	49 c1 e5 04          	shl    r13,0x4
     1644d3b:	49 01 c5             	add    r13,rax
     1644d3e:	48 c1 e5 04          	shl    rbp,0x4
     1644d42:	48 01 c5             	add    rbp,rax
     1644d45:	49 c1 e7 04          	shl    r15,0x4
     1644d49:	4c 89 ef             	mov    rdi,r13
     1644d4c:	31 f6                	xor    esi,esi
     1644d4e:	4c 89 fa             	mov    rdx,r15
     1644d51:	e8 3a 9e 1a 00       	call   17eeb90 <memset@plt>
     1644d56:	4d 01 ef             	add    r15,r13
     1644d59:	4d 39 f4             	cmp    r12,r14
#### store 0x1644da1: mov    QWORD PTR [rbx+0x40],r15
     1644d67:	49 89 45 f0          	mov    QWORD PTR [r13-0x10],rax
     1644d6b:	49 8b 44 24 f8       	mov    rax,QWORD PTR [r12-0x8]
     1644d70:	49 89 45 f8          	mov    QWORD PTR [r13-0x8],rax
     1644d74:	49 83 c5 f0          	add    r13,0xfffffffffffffff0
     1644d78:	f3 41 0f 7f 44 24 f0 	movdqu XMMWORD PTR [r12-0x10],xmm0
     1644d7f:	49 8d 44 24 f0       	lea    rax,[r12-0x10]
     1644d84:	49 89 c4             	mov    r12,rax
     1644d87:	4c 39 f0             	cmp    rax,r14
     1644d8a:	75 d6                	jne    1644d62 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fed0>
     1644d8c:	4c 8b 73 38          	mov    r14,QWORD PTR [rbx+0x38]
     1644d90:	f3 0f 6f 43 40       	movdqu xmm0,XMMWORD PTR [rbx+0x40]
     1644d95:	eb 06                	jmp    1644d9d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ff0b>
     1644d97:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
     1644d9d:	4c 89 6b 38          	mov    QWORD PTR [rbx+0x38],r13
     1644da1:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15
     1644da5:	48 89 6b 48          	mov    QWORD PTR [rbx+0x48],rbp
     1644da9:	66 48 0f 7e c3       	movq   rbx,xmm0
     1644dae:	4c 39 f3             	cmp    rbx,r14
     1644db1:	74 0f                	je     1644dc2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ff30>
     1644db3:	48 8b 7b f8          	mov    rdi,QWORD PTR [rbx-0x8]
     1644db7:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
     1644dbb:	e8 c6 96 45 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1644dc0:	eb ec                	jmp    1644dae <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ff1c>
     1644dc2:	4d 85 f6             	test   r14,r14
     1644dc5:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     1644dca:	74 08                	je     1644dd4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ff42>
     1644dcc:	4c 89 f7             	mov    rdi,r14
     1644dcf:	e8 4c 91 1a 00       	call   17edf20 <_ZdlPv@plt>
     1644dd4:	66 0f ef c0          	pxor   xmm0,xmm0
     1644dd8:	66 0f 7f 44 24 70    	movdqa XMMWORD PTR [rsp+0x70],xmm0
     1644dde:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     1644de5:	00 00 
     1644de7:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     1644dec:	e8 55 31 52 ff       	call   b67f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4ee6>
     1644df1:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     1644df7:	66 0f ef c0          	pxor   xmm0,xmm0

### FDE 0x164a57c..0x164a717

### FDE 0x164af78..0x164afa6

## Exact nested +0x10 then +0x40 loads in Orbit
### 0xab8cad -> 0xab8cc2; FDE=(11241156, 11243730)
      ab8c8d:	00 
      ab8c8e:	e8 fd 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8c93:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      ab8c9a:	00 
      ab8c9b:	e8 f0 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8ca0:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ab8ca7:	00 
      ab8ca8:	e8 e3 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8cad:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ab8cb2:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
      ab8cb5:	a8 04                	test   al,0x4
      ab8cb7:	0f 84 96 00 00 00    	je     ab8d53 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf3>
      ab8cbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ab8cc2:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
      ab8cc6:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      ab8cca:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ab8cd1:	00 
      ab8cd2:	e8 fb 03 00 00       	call   ab90d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6072>
      ab8cd7:	48 8d 35 c8 c2 89 ff 	lea    rsi,[rip+0xffffffffff89c2c8]        # 354fa6 <_ZTSSt12bad_any_cast@@Base-0x3b222>
      ab8cde:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      ab8ce5:	00 
      ab8ce6:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      ab8ced:	00 
      ab8cee:	e8 a6 d0 ff ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      ab8cf3:	48 8d 15 05 9a 8c ff 	lea    rdx,[rip+0xffffffffff8c9a05]        # 3826ff <_ZTSSt12bad_any_cast@@Base-0xdac9>
      ab8cfa:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ab8d01:	00 

### 0xab8cbd -> 0xab8cc2; FDE=(11241156, 11243730)
      ab8c9b:	e8 f0 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8ca0:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ab8ca7:	00 
      ab8ca8:	e8 e3 51 d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ab8cad:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ab8cb2:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
      ab8cb5:	a8 04                	test   al,0x4
      ab8cb7:	0f 84 96 00 00 00    	je     ab8d53 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf3>
      ab8cbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ab8cc2:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
      ab8cc6:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
      ab8cca:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      ab8cd1:	00 
      ab8cd2:	e8 fb 03 00 00       	call   ab90d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6072>
      ab8cd7:	48 8d 35 c8 c2 89 ff 	lea    rsi,[rip+0xffffffffff89c2c8]        # 354fa6 <_ZTSSt12bad_any_cast@@Base-0x3b222>
      ab8cde:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      ab8ce5:	00 
      ab8ce6:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      ab8ced:	00 
      ab8cee:	e8 a6 d0 ff ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
      ab8cf3:	48 8d 15 05 9a 8c ff 	lea    rdx,[rip+0xffffffffff8c9a05]        # 3826ff <_ZTSSt12bad_any_cast@@Base-0xdac9>
      ab8cfa:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      ab8d01:	00 
      ab8d02:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
      ab8d09:	00 
      ab8d0a:	e8 2e 27 fe ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
      ab8d0f:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]

### 0xbd4bbf -> 0xbd4be2; FDE=(12402696, 12405956)
      bd4b99:	41 88 47 10          	mov    BYTE PTR [r15+0x10],al
      bd4b9d:	e9 da 00 00 00       	jmp    bd4c7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x121c1c>
      bd4ba2:	89 c7                	mov    edi,eax
      bd4ba4:	e8 aa 1c 00 00       	call   bd6853 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1237f3>
      bd4ba9:	89 84 24 a0 00 00 00 	mov    DWORD PTR [rsp+0xa0],eax
      bd4bb0:	48 8d 05 a9 ac cf 00 	lea    rax,[rip+0xcfaca9]        # 18cf860 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x16c70>
      bd4bb7:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
      bd4bbe:	00 
      bd4bbf:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      bd4bc4:	f3 41 0f 6f 46 48    	movdqu xmm0,XMMWORD PTR [r14+0x48]
      bd4bca:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
      bd4bcf:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
      bd4bd3:	48 85 c0             	test   rax,rax
      bd4bd6:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
      bd4bdb:	74 05                	je     bd4be2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x121b82>
      bd4bdd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      bd4be2:	49 8b 5e 40          	mov    rbx,QWORD PTR [r14+0x40]
      bd4be6:	48 8d 35 93 a4 78 ff 	lea    rsi,[rip+0xffffffffff78a493]        # 35f080 <_ZTSSt12bad_any_cast@@Base-0x31148>
      bd4bed:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      bd4bf4:	00 
      bd4bf5:	e8 84 4e ea ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      bd4bfa:	49 8d 96 90 01 00 00 	lea    rdx,[r14+0x190]
      bd4c01:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      bd4c06:	66 48 0f 7e c6       	movq   rsi,xmm0
      bd4c0b:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      bd4c12:	00 
      bd4c13:	6a 01                	push   0x1

### 0xbede44 -> 0xbede56; FDE=(12507538, 12508922)
      bede2a:	eb 18                	jmp    bede44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13ade4>
      bede2c:	4c 89 e7             	mov    rdi,r12
      bede2f:	48 89 ee             	mov    rsi,rbp
      bede32:	4c 89 c2             	mov    rdx,r8
      bede35:	4d 89 c6             	mov    r14,r8
      bede38:	e8 a3 1c c0 00       	call   17efae0 <memmove@plt>
      bede3d:	4d 01 f4             	add    r12,r14
      bede40:	4c 89 63 70          	mov    QWORD PTR [rbx+0x70],r12
      bede44:	4c 8b 4c 24 10       	mov    r9,QWORD PTR [rsp+0x10]
      bede49:	41 8b 81 88 00 00 00 	mov    eax,DWORD PTR [r9+0x88]
      bede50:	89 83 88 00 00 00    	mov    DWORD PTR [rbx+0x88],eax
      bede56:	49 8b 41 40          	mov    rax,QWORD PTR [r9+0x40]
      bede5a:	49 2b 41 38          	sub    rax,QWORD PTR [r9+0x38]
      bede5e:	f2 41 0f 2a 41 2c    	cvtsi2sd xmm0,DWORD PTR [r9+0x2c]
      bede64:	48 c1 e8 04          	shr    rax,0x4
      bede68:	f2 0f 2a c8          	cvtsi2sd xmm1,eax
      bede6c:	f2 0f 5e c1          	divsd  xmm0,xmm1
      bede70:	f2 41 0f 2a cf       	cvtsi2sd xmm1,r15d
      bede75:	f2 0f 59 c8          	mulsd  xmm1,xmm0
      bede79:	66 0f 28 05 9f 00 7a 	movapd xmm0,XMMWORD PTR [rip+0xffffffffff7a009f]        # 38df20 <_ZTSSt12bad_any_cast@@Base-0x22a8>
      bede80:	ff 
      bede81:	66 0f 54 c1          	andpd  xmm0,xmm1
      bede85:	66 0f 56 05 13 ed 79 	orpd   xmm0,XMMWORD PTR [rip+0xffffffffff79ed13]        # 38cba0 <_ZTSSt12bad_any_cast@@Base-0x3628>
      bede8c:	ff 
      bede8d:	f2 0f 58 c1          	addsd  xmm0,xmm1
      bede91:	66 0f 3a 0b c0 0b    	roundsd xmm0,xmm0,0xb
      bede97:	f2 0f 2c c0          	cvttsd2si eax,xmm0

### 0xc1b75e -> 0xc1b77e; FDE=(12695290, 12696241)
      c1b73c:	75 1c                	jne    c1b75a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1686fa>
      c1b73e:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      c1b743:	40 f6 c7 01          	test   dil,0x1
      c1b747:	0f 85 fd 02 00 00    	jne    c1ba4a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1689ea>
      c1b74d:	e8 b2 eb ff ff       	call   c1a304 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1672a4>
      c1b752:	48 89 c3             	mov    rbx,rax
      c1b755:	49 89 44 24 60       	mov    QWORD PTR [r12+0x60],rax
      c1b75a:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      c1b75e:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]
      c1b762:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
      c1b766:	48 85 c0             	test   rax,rax
      c1b769:	48 8d 0d a8 aa cb 00 	lea    rcx,[rip+0xcbaaa8]        # 18d6218 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1d628>
      c1b770:	48 0f 45 c8          	cmovne rcx,rax
      c1b774:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      c1b779:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
      c1b77e:	48 8b 72 40          	mov    rsi,QWORD PTR [rdx+0x40]
      c1b782:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      c1b787:	e8 1c 0b 9a 00       	call   15bc2a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40182c>
      c1b78c:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx
      c1b790:	48 89 df             	mov    rdi,rbx
      c1b793:	e8 76 f8 ff ff       	call   c1b00e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x167fae>
      c1b798:	49 89 c7             	mov    r15,rax
      c1b79b:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      c1b7a0:	4c 8b 6a 38          	mov    r13,QWORD PTR [rdx+0x38]
      c1b7a4:	48 8b 42 18          	mov    rax,QWORD PTR [rdx+0x18]
      c1b7a8:	48 85 c0             	test   rax,rax
      c1b7ab:	48 8d 0d e6 a9 cb 00 	lea    rcx,[rip+0xcba9e6]        # 18d6198 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1d5a8>

### 0xc3b10d -> 0xc3b130; FDE=(12824704, 12825353)
      c3b0f4:	49 3b 46 08          	cmp    rax,QWORD PTR [r14+0x8]
      c3b0f8:	7d 03                	jge    c3b0fd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18809d>
      c3b0fa:	49 89 ee             	mov    r14,rbp
      c3b0fd:	48 83 c5 30          	add    rbp,0x30
      c3b101:	48 39 dd             	cmp    rbp,rbx
      c3b104:	75 c5                	jne    c3b0cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18806b>
      c3b106:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
      c3b10a:	49 39 de             	cmp    r14,rbx
      c3b10d:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      c3b112:	0f 84 a4 01 00 00    	je     c3b2bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18825c>
      c3b118:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0
      c3b11d:	0f 84 99 01 00 00    	je     c3b2bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18825c>
      c3b123:	49 8d 7e 08          	lea    rdi,[r14+0x8]
      c3b127:	e8 46 aa f0 ff       	call   b45b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x92b12>
      c3b12c:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
      c3b130:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
      c3b135:	e8 28 f3 e3 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      c3b13a:	49 29 c7             	sub    r15,rax
      c3b13d:	7d 05                	jge    c3b144 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1880e4>
      c3b13f:	6a 05                	push   0x5
      c3b141:	58                   	pop    rax
      c3b142:	eb 2f                	jmp    c3b173 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x188113>
      c3b144:	b9 00 87 93 03       	mov    ecx,0x3938700
      c3b149:	4c 89 f8             	mov    rax,r15
      c3b14c:	48 99                	cqo
      c3b14e:	48 f7 f9             	idiv   rcx
      c3b151:	48 b9 ff d8 43 1a 14 	movabs rcx,0x141a43d8ff

### 0xcd161a -> 0xcd1629; FDE=(13440524, 13440600)
      cd1601:	e8 ca e6 d9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cd1606:	e8 a5 e4 b1 00       	call   17efab0 <__stack_chk_fail@plt>
      cd160b:	cc                   	int3
      cd160c:	50                   	push   rax
      cd160d:	48 89 f0             	mov    rax,rsi
      cd1610:	31 f6                	xor    esi,esi
      cd1612:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
      cd1616:	48 0f 45 c6          	cmovne rax,rsi
      cd161a:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd161e:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1622:	48 83 78 48 00       	cmp    QWORD PTR [rax+0x48],0x0
      cd1627:	74 08                	je     cd1631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5d1>
      cd1629:	48 8b 48 40          	mov    rcx,QWORD PTR [rax+0x40]
      cd162d:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
      cd1631:	48 85 f6             	test   rsi,rsi
      cd1634:	74 1e                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd1636:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd163a:	48 85 ff             	test   rdi,rdi
      cd163d:	74 15                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd163f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd1642:	ff 50 70             	call   QWORD PTR [rax+0x70]
      cd1645:	48 85 c0             	test   rax,rax
      cd1648:	74 0a                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd164a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      cd164d:	48 89 c7             	mov    rdi,rax
      cd1650:	58                   	pop    rax
      cd1651:	ff 61 10             	jmp    QWORD PTR [rcx+0x10]

### 0xcd161e -> 0xcd1629; FDE=(13440524, 13440600)
      cd1606:	e8 a5 e4 b1 00       	call   17efab0 <__stack_chk_fail@plt>
      cd160b:	cc                   	int3
      cd160c:	50                   	push   rax
      cd160d:	48 89 f0             	mov    rax,rsi
      cd1610:	31 f6                	xor    esi,esi
      cd1612:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
      cd1616:	48 0f 45 c6          	cmovne rax,rsi
      cd161a:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd161e:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
      cd1622:	48 83 78 48 00       	cmp    QWORD PTR [rax+0x48],0x0
      cd1627:	74 08                	je     cd1631 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5d1>
      cd1629:	48 8b 48 40          	mov    rcx,QWORD PTR [rax+0x40]
      cd162d:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
      cd1631:	48 85 f6             	test   rsi,rsi
      cd1634:	74 1e                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd1636:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd163a:	48 85 ff             	test   rdi,rdi
      cd163d:	74 15                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd163f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd1642:	ff 50 70             	call   QWORD PTR [rax+0x70]
      cd1645:	48 85 c0             	test   rax,rax
      cd1648:	74 0a                	je     cd1654 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e5f4>
      cd164a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      cd164d:	48 89 c7             	mov    rdi,rax
      cd1650:	58                   	pop    rax
      cd1651:	ff 61 10             	jmp    QWORD PTR [rcx+0x10]
      cd1654:	b0 01                	mov    al,0x1

### 0xcd169f -> 0xcd16ae; FDE=(13440630, 13440982)
      cd1680:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cd1687:	00 00 
      cd1689:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
      cd1690:	00 
      cd1691:	31 c0                	xor    eax,eax
      cd1693:	83 7e 08 00          	cmp    DWORD PTR [rsi+0x8],0x0
      cd1697:	48 0f 44 c6          	cmove  rax,rsi
      cd169b:	4c 8b 70 10          	mov    r14,QWORD PTR [rax+0x10]
      cd169f:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      cd16a3:	48 83 78 48 00       	cmp    QWORD PTR [rax+0x48],0x0
      cd16a8:	0f 84 c3 00 00 00    	je     cd1771 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e711>
      cd16ae:	48 8b 48 40          	mov    rcx,QWORD PTR [rax+0x40]
      cd16b2:	48 8b 59 18          	mov    rbx,QWORD PTR [rcx+0x18]
      cd16b6:	48 85 db             	test   rbx,rbx
      cd16b9:	0f 84 b2 00 00 00    	je     cd1771 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e711>
      cd16bf:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      cd16c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cd16c6:	48 89 de             	mov    rsi,rbx
      cd16c9:	ff 50 50             	call   QWORD PTR [rax+0x50]
      cd16cc:	48 85 c0             	test   rax,rax
      cd16cf:	0f 84 9c 00 00 00    	je     cd1771 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21e711>
      cd16d5:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
      cd16d9:	4c 8b 71 10          	mov    r14,QWORD PTR [rcx+0x10]
      cd16dd:	48 89 9c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rbx
      cd16e4:	00 
      cd16e5:	83 a4 24 a0 00 00 00 	and    DWORD PTR [rsp+0xa0],0x0
      cd16ec:	00 

### 0xd11486 -> 0xd11495; FDE=(13702098, 13702840)
      d11466:	ff 50 58             	call   QWORD PTR [rax+0x58]
      d11469:	49 89 c6             	mov    r14,rax
      d1146c:	48 85 c0             	test   rax,rax
      d1146f:	0f 84 42 01 00 00    	je     d115b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e557>
      d11475:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d11478:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      d1147d:	4c 89 f6             	mov    rsi,r14
      d11480:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
      d11486:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d1148b:	f6 40 30 01          	test   BYTE PTR [rax+0x30],0x1
      d1148f:	0f 84 be 00 00 00    	je     d11553 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e4f3>
      d11495:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]
      d11499:	e9 b9 00 00 00       	jmp    d11557 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e4f7>
      d1149e:	48 83 c0 29          	add    rax,0x29
      d114a2:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      d114a7:	48 89 06             	mov    QWORD PTR [rsi],rax
      d114aa:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      d114af:	e8 f8 c9 e6 ff       	call   b7deac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcae4c>
      d114b4:	4c 89 ff             	mov    rdi,r15
      d114b7:	e8 ca cf d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d114bc:	49 8b be f8 00 00 00 	mov    rdi,QWORD PTR [r14+0xf8]
      d114c3:	49 8b 9e 08 01 00 00 	mov    rbx,QWORD PTR [r14+0x108]
      d114ca:	48 89 de             	mov    rsi,rbx
      d114cd:	e8 e6 8c 93 00       	call   164a1b8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45326>
      d114d2:	85 c0                	test   eax,eax
      d114d4:	0f 84 dd 00 00 00    	je     d115b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e557>
      d114da:	45 31 ff             	xor    r15d,r15d

### 0xdef815 -> 0xdef81a; FDE=(14596108, 14619287)
      def7f3:	4c 89 e6             	mov    rsi,r12
      def7f6:	e8 5f c4 cc ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
      def7fb:	48 8b bc 24 18 13 00 	mov    rdi,QWORD PTR [rsp+0x1318]
      def802:	00 
      def803:	e8 7e ec ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      def808:	48 8d bc 24 90 13 00 	lea    rdi,[rsp+0x1390]
      def80f:	00 
      def810:	e8 d3 af 9e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      def815:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def81a:	48 8b 58 40          	mov    rbx,QWORD PTR [rax+0x40]
      def81e:	48 85 db             	test   rbx,rbx
      def821:	74 56                	je     def879 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbc8ff>
      def823:	4c 8d b4 24 90 13 00 	lea    r14,[rsp+0x1390]
      def82a:	00 
      def82b:	48 8d b4 24 60 07 00 	lea    rsi,[rsp+0x760]
      def832:	00 
      def833:	4c 89 f7             	mov    rdi,r14
      def836:	e8 09 db 01 00       	call   e0d344 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda3ca>
      def83b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      def83e:	48 8d bc 24 10 13 00 	lea    rdi,[rsp+0x1310]
      def845:	00 
      def846:	48 89 de             	mov    rsi,rbx
      def849:	4c 89 f2             	mov    rdx,r14
      def84c:	ff 50 70             	call   QWORD PTR [rax+0x70]
      def84f:	48 8d b4 24 10 13 00 	lea    rsi,[rsp+0x1310]
      def856:	00 
      def857:	4c 89 ff             	mov    rdi,r15

### 0xe02282 -> 0xe02290; FDE=(14688898, 14688911)
      e0226f:	48 89 fb             	mov    rbx,rdi
      e02272:	48 8b 76 30          	mov    rsi,QWORD PTR [rsi+0x30]
      e02276:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e02279:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e0227c:	48 89 d8             	mov    rax,rbx
      e0227f:	5b                   	pop    rbx
      e02280:	c3                   	ret
      e02281:	cc                   	int3
      e02282:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      e02286:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e02289:	ff a0 88 00 00 00    	jmp    QWORD PTR [rax+0x88]
      e0228f:	cc                   	int3
      e02290:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
      e02294:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e02297:	ff a0 08 01 00 00    	jmp    QWORD PTR [rax+0x108]
      e0229d:	cc                   	int3
      e0229e:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      e022a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e022a5:	ff a0 90 00 00 00    	jmp    QWORD PTR [rax+0x90]
      e022ab:	cc                   	int3
      e022ac:	55                   	push   rbp
      e022ad:	41 57                	push   r15
      e022af:	41 56                	push   r14
      e022b1:	53                   	push   rbx
      e022b2:	48 81 ec f8 05 00 00 	sub    rsp,0x5f8
      e022b9:	49 89 f6             	mov    r14,rsi
      e022bc:	48 89 fb             	mov    rbx,rdi

### 0xe3a299 -> 0xe3a2ab; FDE=(14918290, 14918361)
      e3a288:	58                   	pop    rax
      e3a289:	c3                   	ret
      e3a28a:	48 89 c7             	mov    rdi,rax
      e3a28d:	e8 13 f8 c3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e3a292:	41 56                	push   r14
      e3a294:	53                   	push   rbx
      e3a295:	50                   	push   rax
      e3a296:	48 89 fb             	mov    rbx,rdi
      e3a299:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
      e3a29d:	4d 85 f6             	test   r14,r14
      e3a2a0:	74 17                	je     e3a2b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16cf>
      e3a2a2:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      e3a2a6:	e8 51 76 ef ff       	call   d318fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27e89c>
      e3a2ab:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      e3a2af:	e8 d2 41 c6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e3a2b4:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      e3a2b9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e3a2bd:	48 85 ff             	test   rdi,rdi
      e3a2c0:	74 0f                	je     e3a2d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16e7>
      e3a2c2:	be 80 00 00 00       	mov    esi,0x80
      e3a2c7:	e8 43 9c ef ff       	call   d33f0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf95>
      e3a2cc:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
      e3a2d1:	48 83 c4 08          	add    rsp,0x8
      e3a2d5:	5b                   	pop    rbx
      e3a2d6:	41 5e                	pop    r14
      e3a2d8:	c3                   	ret
      e3a2d9:	cc                   	int3

### 0xeeabe1 -> 0xeeabe6; FDE=(15639632, 15643122)
      eeabbc:	e8 cf 32 90 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      eeabc1:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      eeabc8:	00 
      eeabc9:	e8 60 a7 7d 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      eeabce:	83 fb 02             	cmp    ebx,0x2
      eeabd1:	0f 85 30 03 00 00    	jne    eeaf07 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb231d>
      eeabd7:	40 f6 c5 10          	test   bpl,0x10
      eeabdb:	0f 84 98 01 00 00    	je     eead79 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb218f>
      eeabe1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      eeabe6:	4c 8b 70 40          	mov    r14,QWORD PTR [rax+0x40]
      eeabea:	4c 89 ff             	mov    rdi,r15
      eeabed:	e8 44 0c b9 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      eeabf2:	48 8d 9c 24 f0 00 00 	lea    rbx,[rsp+0xf0]
      eeabf9:	00 
      eeabfa:	48 89 df             	mov    rdi,rbx
      eeabfd:	48 89 c6             	mov    rsi,rax
      eeac00:	e8 23 a8 7d 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
      eeac05:	4c 8d 64 24 18       	lea    r12,[rsp+0x18]
      eeac0a:	4c 89 e7             	mov    rdi,r12
      eeac0d:	48 89 de             	mov    rsi,rbx
      eeac10:	e8 a7 1e 7e 00       	call   16ccabc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80c28>
      eeac15:	49 8d 7e 70          	lea    rdi,[r14+0x70]
      eeac19:	4c 89 e6             	mov    rsi,r12
      eeac1c:	e8 f5 dc fb ff       	call   ea8916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fd2c>
      eeac21:	84 c0                	test   al,al
      eeac23:	0f 84 39 01 00 00    	je     eead62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2178>
      eeac29:	0f 57 c0             	xorps  xmm0,xmm0

### 0xf64f93 -> 0xf64f9c; FDE=(16140472, 16143484)
      f64f71:	49 89 f4             	mov    r12,rsi
      f64f74:	bf f0 0f 00 00       	mov    edi,0xff0
      f64f79:	e8 82 8f 88 00       	call   17edf00 <_Znwm@plt>
      f64f7e:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
      f64f85:	00 
      f64f86:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      f64f8b:	4c 89 fe             	mov    rsi,r15
      f64f8e:	e8 27 92 be ff       	call   b4e1ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b15a>
      f64f93:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      f64f98:	48 8b 57 50          	mov    rdx,QWORD PTR [rdi+0x50]
      f64f9c:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
      f64fa0:	48 8b 4f 48          	mov    rcx,QWORD PTR [rdi+0x48]
      f64fa4:	48 29 ca             	sub    rdx,rcx
      f64fa7:	31 f6                	xor    esi,esi
      f64fa9:	48 83 fa 08          	cmp    rdx,0x8
      f64fad:	40 0f 94 c6          	sete   sil
      f64fb1:	48 8b 57 60          	mov    rdx,QWORD PTR [rdi+0x60]
      f64fb5:	48 f7 de             	neg    rsi
      f64fb8:	48 01 f2             	add    rdx,rsi
      f64fbb:	48 83 c2 66          	add    rdx,0x66
      f64fbf:	48 89 57 60          	mov    QWORD PTR [rdi+0x60],rdx
      f64fc3:	49 8d 74 24 01       	lea    rsi,[r12+0x1]
      f64fc8:	4c 39 e5             	cmp    rbp,r12
      f64fcb:	74 05                	je     f64fd2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12c3e8>
      f64fcd:	48 39 c1             	cmp    rcx,rax
      f64fd0:	75 9f                	jne    f64f71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12c387>
      f64fd2:	4d 89 f7             	mov    r15,r14

### 0x10b64b7 -> 0x10b64d5; FDE=(17523594, 17525139)
     10b6494:	48 89 c7             	mov    rdi,rax
     10b6497:	e8 c6 f4 ff ff       	call   10b5962 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27cd78>
     10b649c:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]
     10b64a0:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
     10b64a5:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
     10b64a9:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10b64ae:	48 39 c3             	cmp    rbx,rax
     10b64b1:	0f 84 f3 01 00 00    	je     10b66aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dac0>
     10b64b7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b64bc:	48 83 c0 48          	add    rax,0x48
     10b64c0:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     10b64c5:	48 89 df             	mov    rdi,rbx
     10b64c8:	e8 4d 09 be ff       	call   c96e1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3dba>
     10b64cd:	49 89 c7             	mov    r15,rax
     10b64d0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b64d5:	4c 8b 68 40          	mov    r13,QWORD PTR [rax+0x40]
     10b64d9:	4d 85 ed             	test   r13,r13
     10b64dc:	0f 84 b9 01 00 00    	je     10b669b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dab1>
     10b64e2:	f3 4d 0f b8 f5       	popcnt r14,r13
     10b64e7:	49 83 fe 01          	cmp    r14,0x1
     10b64eb:	77 09                	ja     10b64f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d90c>
     10b64ed:	4d 8d 65 ff          	lea    r12,[r13-0x1]
     10b64f1:	4d 21 fc             	and    r12,r15
     10b64f4:	eb 13                	jmp    10b6509 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d91f>
     10b64f6:	4d 89 fc             	mov    r12,r15
     10b64f9:	4d 39 ef             	cmp    r15,r13
     10b64fc:	72 0b                	jb     10b6509 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d91f>

### 0x10b64d0 -> 0x10b64d5; FDE=(17523594, 17525139)
     10b64ae:	48 39 c3             	cmp    rbx,rax
     10b64b1:	0f 84 f3 01 00 00    	je     10b66aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dac0>
     10b64b7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b64bc:	48 83 c0 48          	add    rax,0x48
     10b64c0:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     10b64c5:	48 89 df             	mov    rdi,rbx
     10b64c8:	e8 4d 09 be ff       	call   c96e1a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3dba>
     10b64cd:	49 89 c7             	mov    r15,rax
     10b64d0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b64d5:	4c 8b 68 40          	mov    r13,QWORD PTR [rax+0x40]
     10b64d9:	4d 85 ed             	test   r13,r13
     10b64dc:	0f 84 b9 01 00 00    	je     10b669b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27dab1>
     10b64e2:	f3 4d 0f b8 f5       	popcnt r14,r13
     10b64e7:	49 83 fe 01          	cmp    r14,0x1
     10b64eb:	77 09                	ja     10b64f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d90c>
     10b64ed:	4d 8d 65 ff          	lea    r12,[r13-0x1]
     10b64f1:	4d 21 fc             	and    r12,r15
     10b64f4:	eb 13                	jmp    10b6509 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d91f>
     10b64f6:	4d 89 fc             	mov    r12,r15
     10b64f9:	4d 39 ef             	cmp    r15,r13
     10b64fc:	72 0b                	jb     10b6509 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27d91f>
     10b64fe:	4c 89 f8             	mov    rax,r15
     10b6501:	31 d2                	xor    edx,edx
     10b6503:	49 f7 f5             	div    r13
     10b6506:	49 89 d4             	mov    r12,rdx
     10b6509:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b650e:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]

### 0x10d500c -> 0x10d5024; FDE=(17649578, 17649759)
     10d4ff1:	e8 90 94 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d4ff6:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     10d4ffa:	48 85 ff             	test   rdi,rdi
     10d4ffd:	74 30                	je     10d502f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c445>
     10d4fff:	e8 3c 91 71 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
     10d5004:	48 85 c0             	test   rax,rax
     10d5007:	74 26                	je     10d502f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c445>
     10d5009:	49 89 c7             	mov    r15,rax
     10d500c:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     10d5010:	48 85 c0             	test   rax,rax
     10d5013:	74 1d                	je     10d5032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c448>
     10d5015:	f6 43 0c 01          	test   BYTE PTR [rbx+0xc],0x1
     10d5019:	74 17                	je     10d5032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c448>
     10d501b:	8b 0b                	mov    ecx,DWORD PTR [rbx]
     10d501d:	ff c9                	dec    ecx
     10d501f:	83 f9 fd             	cmp    ecx,0xfffffffd
     10d5022:	77 0e                	ja     10d5032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c448>
     10d5024:	48 8b 78 40          	mov    rdi,QWORD PTR [rax+0x40]
     10d5028:	e8 ab b7 00 00       	call   10e07d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a7bee>
     10d502d:	eb 03                	jmp    10d5032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c448>
     10d502f:	45 31 ff             	xor    r15d,r15d
     10d5032:	4c 89 ff             	mov    rdi,r15
     10d5035:	5b                   	pop    rbx
     10d5036:	41 5e                	pop    r14
     10d5038:	41 5f                	pop    r15
     10d503a:	e9 47 94 9c ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     10d503f:	48 89 c3             	mov    rbx,rax

### 0x110028c -> 0x1100291; FDE=(17824772, 17827357)
     110026b:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     1100270:	4c 8b 60 08          	mov    r12,QWORD PTR [rax+0x8]
     1100274:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     1100278:	41 f6 44 24 10 01    	test   BYTE PTR [r12+0x10],0x1
     110027e:	74 07                	je     1100287 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c769d>
     1100280:	49 8b 54 24 20       	mov    rdx,QWORD PTR [r12+0x20]
     1100285:	eb 05                	jmp    110028c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c76a2>
     1100287:	49 8d 54 24 11       	lea    rdx,[r12+0x11]
     110028c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1100291:	48 8b 40 40          	mov    rax,QWORD PTR [rax+0x40]
     1100295:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     110029a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     110029d:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     11002a2:	ff 50 40             	call   QWORD PTR [rax+0x40]
     11002a5:	4c 8b 74 24 70       	mov    r14,QWORD PTR [rsp+0x70]
     11002aa:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     11002af:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     11002b3:	49 39 c6             	cmp    r14,rax
     11002b6:	0f 84 b1 01 00 00    	je     110046d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7883>
     11002bc:	49 8d 44 24 48       	lea    rax,[r12+0x48]
     11002c1:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11002c6:	45 31 ff             	xor    r15d,r15d
     11002c9:	41 8b 44 24 28       	mov    eax,DWORD PTR [r12+0x28]
     11002ce:	85 c0                	test   eax,eax
     11002d0:	7e 09                	jle    11002db <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c76f1>
     11002d2:	41 39 c7             	cmp    r15d,eax
     11002d5:	0f 8d 5b 01 00 00    	jge    1100436 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c784c>

### 0x1136416 -> 0x113641f; FDE=(18046836, 18051122)
     11363f4:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     11363fb:	00 
     11363fc:	e8 8f 7a 6b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1136401:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     1136408:	00 
     1136409:	e8 82 7a 6b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     113640e:	85 ed                	test   ebp,ebp
     1136410:	0f 88 95 01 00 00    	js     11365ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd9c1>
     1136416:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     113641b:	48 8b 68 38          	mov    rbp,QWORD PTR [rax+0x38]
     113641f:	4c 8b 70 40          	mov    r14,QWORD PTR [rax+0x40]
     1136423:	4c 39 f5             	cmp    rbp,r14
     1136426:	0f 84 31 01 00 00    	je     113655d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fd973>
     113642c:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
     1136431:	0f 57 c0             	xorps  xmm0,xmm0
     1136434:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1136439:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
     113643f:	0f b6 55 00          	movzx  edx,BYTE PTR [rbp+0x0]
     1136443:	89 d1                	mov    ecx,edx
     1136445:	d1 e9                	shr    ecx,1
     1136447:	0f b6 44 24 70       	movzx  eax,BYTE PTR [rsp+0x70]
     113644c:	4c 8d 6d 01          	lea    r13,[rbp+0x1]
     1136450:	f6 c2 01             	test   dl,0x1
     1136453:	48 0f 45 4d 08       	cmovne rcx,QWORD PTR [rbp+0x8]
     1136458:	48 8b 55 10          	mov    rdx,QWORD PTR [rbp+0x10]
     113645c:	49 0f 44 d5          	cmove  rdx,r13
     1136460:	a8 01                	test   al,0x1

### 0x1175ea2 -> 0x1175eab; FDE=(18308473, 18308959)
     1175e86:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1175e8a:	4c 89 e7             	mov    rdi,r12
     1175e8d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1175e90:	eb c7                	jmp    1175e59 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d26f>
     1175e92:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1175e97:	48 89 ee             	mov    rsi,rbp
     1175e9a:	4c 89 f2             	mov    rdx,r14
     1175e9d:	e8 7c 08 00 00       	call   117671e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33db34>
     1175ea2:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1175ea7:	4c 8b 46 38          	mov    r8,QWORD PTR [rsi+0x38]
     1175eab:	4c 8b 4e 40          	mov    r9,QWORD PTR [rsi+0x40]
     1175eaf:	4d 29 c1             	sub    r9,r8
     1175eb2:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
     1175eb6:	48 89 df             	mov    rdi,rbx
     1175eb9:	31 d2                	xor    edx,edx
     1175ebb:	31 c9                	xor    ecx,ecx
     1175ebd:	e8 7e e1 50 00       	call   1684040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x381ac>
     1175ec2:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     1175ec7:	e8 20 08 94 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1175ecc:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1175ed0:	4c 89 e7             	mov    rdi,r12
     1175ed3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1175ed6:	4c 89 ef             	mov    rdi,r13
     1175ed9:	e8 16 ab 50 00       	call   16809f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34b60>
     1175ede:	41 80 7d 30 00       	cmp    BYTE PTR [r13+0x30],0x0
     1175ee3:	0f 85 02 ff ff ff    	jne    1175deb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33d201>
     1175ee9:	80 7c 24 0f 00       	cmp    BYTE PTR [rsp+0xf],0x0

### 0x1187389 -> 0x118738e; FDE=(18379360, 18379859)
     118736c:	0f 85 7a ff ff ff    	jne    11872ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34e702>
     1187372:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     1187377:	6a 01                	push   0x1
     1187379:	5d                   	pop    rbp
     118737a:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     118737f:	48 89 df             	mov    rdi,rbx
     1187382:	89 ea                	mov    edx,ebp
     1187384:	e8 57 cf 4d 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     1187389:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     118738e:	49 8b 76 40          	mov    rsi,QWORD PTR [r14+0x40]
     1187392:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     1187396:	48 89 df             	mov    rdi,rbx
     1187399:	89 ea                	mov    edx,ebp
     118739b:	e8 40 cf 4d 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     11873a0:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]
     11873a4:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     11873a8:	48 89 df             	mov    rdi,rbx
     11873ab:	89 ea                	mov    edx,ebp
     11873ad:	e8 2e cf 4d 00       	call   16642e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1844c>
     11873b2:	48 8d 05 f8 2e 25 ff 	lea    rax,[rip+0xffffffffff252ef8]        # 3da2b1 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4e96>
     11873b9:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
     11873c0:	c7 83 b4 00 00 00 01 	mov    DWORD PTR [rbx+0xb4],0x1
     11873c7:	00 00 00 
     11873ca:	48 89 df             	mov    rdi,rbx
     11873cd:	e8 88 cf 4d 00       	call   166435a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184c6>
     11873d2:	85 c0                	test   eax,eax
     11873d4:	0f 9f c3             	setg   bl

### 0x1198163 -> 0x1198174; FDE=(18448726, 18448777)
     1198147:	75 08                	jne    1198151 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f567>
     1198149:	48 89 df             	mov    rdi,rbx
     119814c:	e8 7f 7b 8d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1198151:	e8 5a 79 65 00       	call   17efab0 <__stack_chk_fail@plt>
     1198156:	48 89 f8             	mov    rax,rdi
     1198159:	48 83 c0 58          	add    rax,0x58
     119815d:	83 7e 1c 0a          	cmp    DWORD PTR [rsi+0x1c],0xa
     1198161:	75 06                	jne    1198169 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f57f>
     1198163:	48 8b 76 10          	mov    rsi,QWORD PTR [rsi+0x10]
     1198167:	eb 07                	jmp    1198170 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35f586>
     1198169:	48 8d 35 f0 6c 77 00 	lea    rsi,[rip+0x776cf0]        # 190ee60 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x56270>
     1198170:	4c 8b 4e 20          	mov    r9,QWORD PTR [rsi+0x20]
     1198174:	4c 8b 46 40          	mov    r8,QWORD PTR [rsi+0x40]
     1198178:	48 89 d7             	mov    rdi,rdx
     119817b:	48 89 ce             	mov    rsi,rcx
     119817e:	48 89 c2             	mov    rdx,rax
     1198181:	4c 89 c9             	mov    rcx,r9
     1198184:	e9 8b 0c 00 00       	jmp    1198e14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36022a>
     1198189:	cc                   	int3
     119818a:	55                   	push   rbp
     119818b:	41 57                	push   r15
     119818d:	41 56                	push   r14
     119818f:	41 55                	push   r13
     1198191:	41 54                	push   r12
     1198193:	53                   	push   rbx
     1198194:	48 81 ec 28 02 00 00 	sub    rsp,0x228
     119819b:	49 89 cf             	mov    r15,rcx

### 0x11d2511 -> 0x11d2516; FDE=(18685894, 18687767)
     11d24ed:	48 01 c8             	add    rax,rcx
     11d24f0:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
     11d24f5:	0f 57 c0             	xorps  xmm0,xmm0
     11d24f8:	49 83 64 24 38 00    	and    QWORD PTR [r12+0x38],0x0
     11d24fe:	41 0f 11 44 24 28    	movups XMMWORD PTR [r12+0x28],xmm0
     11d2504:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     11d2509:	4d 89 74 24 10       	mov    QWORD PTR [r12+0x10],r14
     11d250e:	4c 89 23             	mov    QWORD PTR [rbx],r12
     11d2511:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     11d2516:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
     11d251a:	48 8b 00             	mov    rax,QWORD PTR [rax]
     11d251d:	4c 89 e6             	mov    rsi,r12
     11d2520:	48 85 c0             	test   rax,rax
     11d2523:	74 07                	je     11d252c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ab0>
     11d2525:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
     11d2529:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     11d252c:	49 8b 7e 48          	mov    rdi,QWORD PTR [r14+0x48]
     11d2530:	e8 e9 7a 8d ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
     11d2535:	49 ff 46 50          	inc    QWORD PTR [r14+0x50]
     11d2539:	4c 8b ac 24 f0 00 00 	mov    r13,QWORD PTR [rsp+0xf0]
     11d2540:	00 
     11d2541:	48 8d 9c 24 f8 00 00 	lea    rbx,[rsp+0xf8]
     11d2548:	00 
     11d2549:	49 8d 7c 24 28       	lea    rdi,[r12+0x28]
     11d254e:	48 83 63 f8 00       	and    QWORD PTR [rbx-0x8],0x0
     11d2553:	4c 89 ee             	mov    rsi,r13
     11d2556:	e8 35 dc 00 00       	call   11e0190 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25714>

### 0x12b6441 -> 0x12b645e; FDE=(19620160, 19621941)
     12b6421:	48 0f 44 c8          	cmove  rcx,rax
     12b6425:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     12b6428:	e8 ad 9c ff ff       	call   12b00da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf565e>
     12b642d:	8b 6c 24 0c          	mov    ebp,DWORD PTR [rsp+0xc]
     12b6431:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
     12b6438:	00 
     12b6439:	48 89 c7             	mov    rdi,rax
     12b643c:	e8 11 d4 e5 ff       	call   1113852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2dac68>
     12b6441:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12b6446:	80 78 50 00          	cmp    BYTE PTR [rax+0x50],0x0
     12b644a:	0f 84 ad 00 00 00    	je     12b64fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfba81>
     12b6450:	83 bc 24 c8 00 00 00 	cmp    DWORD PTR [rsp+0xc8],0x0
     12b6457:	00 
     12b6458:	0f 84 9f 00 00 00    	je     12b64fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfba81>
     12b645e:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     12b6462:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12b6465:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
     12b646a:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     12b6471:	00 
     12b6472:	4c 89 ff             	mov    rdi,r15
     12b6475:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12b6478:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     12b647d:	48 8d b4 24 28 01 00 	lea    rsi,[rsp+0x128]
     12b6484:	00 
     12b6485:	e8 e0 9b d9 ff       	call   105006a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x217480>
     12b648a:	49 83 3f 00          	cmp    QWORD PTR [r15],0x0
     12b648e:	0f 84 d0 00 00 00    	je     12b6564 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfbae8>

### 0x12fdd9d -> 0x12fddb8; FDE=(19914096, 19914658)
     12fdd7d:	49 89 f6             	mov    r14,rsi
     12fdd80:	48 89 fb             	mov    rbx,rdi
     12fdd83:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12fdd8a:	00 00 
     12fdd8c:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     12fdd91:	ba e8 00 00 00       	mov    edx,0xe8
     12fdd96:	31 f6                	xor    esi,esi
     12fdd98:	e8 f3 0d 4f 00       	call   17eeb90 <memset@plt>
     12fdd9d:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     12fdda1:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     12fdda5:	4c 8b 60 38          	mov    r12,QWORD PTR [rax+0x38]
     12fdda9:	48 3b 70 28          	cmp    rsi,QWORD PTR [rax+0x28]
     12fddad:	4c 8d 3d 3c e7 0d ff 	lea    r15,[rip+0xffffffffff0de73c]        # 3dc4f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f3f>
     12fddb4:	49 0f 44 f7          	cmove  rsi,r15
     12fddb8:	4c 8b 68 40          	mov    r13,QWORD PTR [rax+0x40]
     12fddbc:	48 89 df             	mov    rdi,rbx
     12fddbf:	e8 bc 02 4f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     12fddc4:	4d 39 ec             	cmp    r12,r13
     12fddc7:	4d 0f 45 fc          	cmovne r15,r12
     12fddcb:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     12fddcf:	4c 89 fe             	mov    rsi,r15
     12fddd2:	e8 a9 02 4f 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     12fddd7:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     12fdddb:	48 83 c7 30          	add    rdi,0x30
     12fdddf:	48 8d 35 aa e7 13 ff 	lea    rsi,[rip+0xffffffffff13e7aa]        # 43c590 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x219c>
     12fdde6:	48 8d 15 03 e7 0d ff 	lea    rdx,[rip+0xffffffffff0de703]        # 3dc4f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f3f>
     12fdded:	e8 ea b7 8d ff       	call   bd95dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12657c>

### 0x1303814 -> 0x1303833; FDE=(19937174, 19938842)
     13037f1:	48 85 c9             	test   rcx,rcx
     13037f4:	48 8d 05 55 5e 6a 00 	lea    rax,[rip+0x6a5e55]        # 19a9650 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x72298>
     13037fb:	48 0f 45 c1          	cmovne rax,rcx
     13037ff:	8b 48 1c             	mov    ecx,DWORD PTR [rax+0x1c]
     1303802:	83 f9 02             	cmp    ecx,0x2
     1303805:	0f 84 60 01 00 00    	je     130396b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148eef>
     130380b:	83 f9 01             	cmp    ecx,0x1
     130380e:	0f 85 91 01 00 00    	jne    13039a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148f29>
     1303814:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
     1303818:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     130381d:	ba 98 00 00 00       	mov    edx,0x98
     1303822:	31 f6                	xor    esi,esi
     1303824:	e8 67 b3 4e 00       	call   17eeb90 <memset@plt>
     1303829:	41 8b 44 24 48       	mov    eax,DWORD PTR [r12+0x48]
     130382e:	83 f8 02             	cmp    eax,0x2
     1303831:	75 35                	jne    1303868 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148dec>
     1303833:	49 8b 74 24 40       	mov    rsi,QWORD PTR [r12+0x40]
     1303838:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     130383c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1303841:	e8 fa a6 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1303846:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     130384b:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     1303850:	48 89 fe             	mov    rsi,rdi
     1303853:	48 89 da             	mov    rdx,rbx
     1303856:	e8 d3 0c 00 00       	call   130452e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x149ab2>
     130385b:	48 89 df             	mov    rdi,rbx
     130385e:	e8 2d a6 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x13ed4f7 -> 0x13ed4fb; FDE=(20894056, 20896284)
     13ed4db:	4c 0f 43 e0          	cmovae r12,rax
     13ed4df:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     13ed4e3:	31 c9                	xor    ecx,ecx
     13ed4e5:	41 83 bd 64 07 00 00 	cmp    DWORD PTR [r13+0x764],0x1
     13ed4ec:	01 
     13ed4ed:	0f 95 c1             	setne  cl
     13ed4f0:	41 8b 4c 8d 78       	mov    ecx,DWORD PTR [r13+rcx*4+0x78]
     13ed4f5:	87 08                	xchg   DWORD PTR [rax],ecx
     13ed4f7:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     13ed4fb:	48 8b 78 40          	mov    rdi,QWORD PTR [rax+0x40]
     13ed4ff:	83 e6 fc             	and    esi,0xfffffffc
     13ed502:	48 03 74 24 68       	add    rsi,QWORD PTR [rsp+0x68]
     13ed507:	4b 8d 14 24          	lea    rdx,[r12+r12*1]
     13ed50b:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
     13ed512:	00 
     13ed513:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13ed516:	45 31 c9             	xor    r9d,r9d
     13ed519:	41 83 f8 01          	cmp    r8d,0x1
     13ed51d:	41 0f 95 c1          	setne  r9b
     13ed521:	4a 8b 04 c8          	mov    rax,QWORD PTR [rax+r9*8]
     13ed525:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     13ed52a:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12
     13ed531:	00 
     13ed532:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13ed535:	f3 0f 6f 44 24 78    	movdqu xmm0,XMMWORD PTR [rsp+0x78]
     13ed53b:	f3 0f 7f 04 24       	movdqu XMMWORD PTR [rsp],xmm0
     13ed540:	4d 89 e0             	mov    r8,r12

### 0x1426910 -> 0x1426915; FDE=(21128434, 21131255)
     14268ea:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     14268ef:	48 89 ea             	mov    rdx,rbp
     14268f2:	e8 39 07 00 00       	call   1427030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c5b4>
     14268f7:	49 81 c7 f8 00 00 00 	add    r15,0xf8
     14268fe:	4c 89 ff             	mov    rdi,r15
     1426901:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     1426906:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
     142690b:	e8 20 07 00 00       	call   1427030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c5b4>
     1426910:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     1426915:	4c 8b 6d 40          	mov    r13,QWORD PTR [rbp+0x40]
     1426919:	4d 85 ed             	test   r13,r13
     142691c:	74 3c                	je     142695a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bede>
     142691e:	4c 8b b3 20 01 00 00 	mov    r14,QWORD PTR [rbx+0x120]
     1426925:	4c 8b bb 28 01 00 00 	mov    r15,QWORD PTR [rbx+0x128]
     142692c:	49 83 bd 80 00 00 00 	cmp    QWORD PTR [r13+0x80],0x0
     1426933:	00 
     1426934:	0f 84 2f 05 00 00    	je     1426e69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c3ed>
     142693a:	4d 8d 65 08          	lea    r12,[r13+0x8]
     142693e:	49 83 bd a8 00 00 00 	cmp    QWORD PTR [r13+0xa8],0x0
     1426945:	00 
     1426946:	0f 84 80 05 00 00    	je     1426ecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c450>
     142694c:	4c 89 e7             	mov    rdi,r12
     142694f:	4c 89 f6             	mov    rsi,r14
     1426952:	4c 89 fa             	mov    rdx,r15
     1426955:	e8 d6 06 00 00       	call   1427030 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26c5b4>
     142695a:	4c 8b 65 48          	mov    r12,QWORD PTR [rbp+0x48]
     142695e:	4d 85 e4             	test   r12,r12

### 0x146851a -> 0x1468535; FDE=(21398520, 21399582)
     14684f3:	49 89 c4             	mov    r12,rax
     14684f6:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14684fb:	0f 85 56 ff ff ff    	jne    1468457 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ad9db>
     1468501:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     1468506:	49 8d 7c 24 30       	lea    rdi,[r12+0x30]
     146850b:	0f 57 c0             	xorps  xmm0,xmm0
     146850e:	41 0f 11 44 24 40    	movups XMMWORD PTR [r12+0x40],xmm0
     1468514:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
     146851a:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     146851f:	8b 43 50             	mov    eax,DWORD PTR [rbx+0x50]
     1468522:	41 89 44 24 50       	mov    DWORD PTR [r12+0x50],eax
     1468527:	48 8b 73 38          	mov    rsi,QWORD PTR [rbx+0x38]
     146852b:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
     1468530:	e8 6b eb 67 ff       	call   ae70a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34040>
     1468535:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
     1468539:	48 85 c0             	test   rax,rax
     146853c:	0f 84 63 02 00 00    	je     14687a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2add29>
     1468542:	49 8d 4c 24 40       	lea    rcx,[r12+0x40]
     1468547:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     146854c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1468551:	4c 8d 78 10          	lea    r15,[rax+0x10]
     1468555:	4c 89 ff             	mov    rdi,r15
     1468558:	e8 63 71 63 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
     146855d:	49 89 c5             	mov    r13,rax
     1468560:	4d 8b 74 24 38       	mov    r14,QWORD PTR [r12+0x38]
     1468565:	4d 85 f6             	test   r14,r14
     1468568:	0f 84 95 00 00 00    	je     1468603 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2adb87>

### 0x15b42de -> 0x15b42e2; FDE=(22758014, 22758425)
     15b42c1:	ff 50 78             	call   QWORD PTR [rax+0x78]
     15b42c4:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     15b42c9:	89 c6                	mov    esi,eax
     15b42cb:	e8 8b 44 02 00       	call   15d875b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41dcdf>
     15b42d0:	f6 44 24 28 01       	test   BYTE PTR [rsp+0x28],0x1
     15b42d5:	74 1c                	je     15b42f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9877>
     15b42d7:	4c 8b 44 24 38       	mov    r8,QWORD PTR [rsp+0x38]
     15b42dc:	eb 1a                	jmp    15b42f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f987c>
     15b42de:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b42e2:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b42e6:	48 89 df             	mov    rdi,rbx
     15b42e9:	e8 7a 7d 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b42ee:	e9 c3 00 00 00       	jmp    15b43b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f993a>
     15b42f3:	4c 8d 44 24 29       	lea    r8,[rsp+0x29]
     15b42f8:	48 8d 35 7d dc e9 fe 	lea    rsi,[rip+0xfffffffffee9dc7d]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     15b42ff:	48 8d 0d a8 93 d8 fe 	lea    rcx,[rip+0xfffffffffed893a8]        # 33d6ae <_ZTSSt12bad_any_cast@@Base-0x52b1a>
     15b4306:	6a 04                	push   0x4
     15b4308:	5f                   	pop    rdi
     15b4309:	ba af 02 00 00       	mov    edx,0x2af
     15b430e:	31 c0                	xor    eax,eax
     15b4310:	e8 bd 25 22 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     15b4315:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     15b431a:	e8 71 9b 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15b431f:	48 89 e7             	mov    rdi,rsp
     15b4322:	e8 49 1a 0e 00       	call   1695d70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49edc>
     15b4327:	e8 66 94 1f 00       	call   17ad792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1618fe>
     15b432c:	89 c5                	mov    ebp,eax

### 0x15b44c3 -> 0x15b44c7; FDE=(22758426, 22759192)
     15b449c:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     15b44a1:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
     15b44a6:	4c 89 ef             	mov    rdi,r13
     15b44a9:	e8 18 68 0e 00       	call   169acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ee32>
     15b44ae:	41 f6 45 00 01       	test   BYTE PTR [r13+0x0],0x1
     15b44b3:	0f 84 c5 00 00 00    	je     15b457e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9b02>
     15b44b9:	4c 8b 44 24 60       	mov    r8,QWORD PTR [rsp+0x60]
     15b44be:	e9 c0 00 00 00       	jmp    15b4583 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9b07>
     15b44c3:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     15b44c7:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b44cb:	4c 89 f7             	mov    rdi,r14
     15b44ce:	e8 95 7b 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b44d3:	e9 ae 01 00 00       	jmp    15b4686 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9c0a>
     15b44d8:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     15b44dd:	4c 89 ef             	mov    rdi,r13
     15b44e0:	e8 09 b2 4e ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     15b44e5:	84 c0                	test   al,al
     15b44e7:	0f 84 c3 00 00 00    	je     15b45b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9b34>
     15b44ed:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     15b44f2:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     15b44f7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     15b44fc:	83 78 20 00          	cmp    DWORD PTR [rax+0x20],0x0
     15b4500:	7e 53                	jle    15b4555 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f9ad9>
     15b4502:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     15b4507:	4c 8d 70 18          	lea    r14,[rax+0x18]
     15b450b:	6a 08                	push   0x8
     15b450d:	41 5f                	pop    r15

### 0x15b51e4 -> 0x15b51e8; FDE=(22761682, 22762105)
     15b51c8:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     15b51cd:	48 89 df             	mov    rdi,rbx
     15b51d0:	4c 89 f6             	mov    rsi,r14
     15b51d3:	31 c9                	xor    ecx,ecx
     15b51d5:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15b51d8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     15b51dd:	e8 ae 8c 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15b51e2:	eb 10                	jmp    15b51f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fa778>
     15b51e4:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b51e8:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b51ec:	48 89 df             	mov    rdi,rbx
     15b51ef:	e8 74 6e 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b51f4:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     15b51f9:	e8 88 92 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b51fe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15b5205:	00 00 
     15b5207:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     15b520e:	00 
     15b520f:	75 63                	jne    15b5274 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fa7f8>
     15b5211:	48 89 d8             	mov    rax,rbx
     15b5214:	48 81 c4 28 01 00 00 	add    rsp,0x128
     15b521b:	5b                   	pop    rbx
     15b521c:	41 5c                	pop    r12
     15b521e:	41 5d                	pop    r13
     15b5220:	41 5e                	pop    r14
     15b5222:	41 5f                	pop    r15
     15b5224:	5d                   	pop    rbp

### 0x15b5358 -> 0x15b535c; FDE=(22762106, 22762462)
     15b5340:	00 
     15b5341:	e8 ae df 0c 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
     15b5346:	8a 44 24 0f          	mov    al,BYTE PTR [rsp+0xf]
     15b534a:	34 01                	xor    al,0x1
     15b534c:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
     15b5350:	88 01                	mov    BYTE PTR [rcx],al
     15b5352:	eb 14                	jmp    15b5368 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fa8ec>
     15b5354:	41 c6 06 00          	mov    BYTE PTR [r14],0x0
     15b5358:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     15b535c:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b5360:	48 89 df             	mov    rdi,rbx
     15b5363:	e8 00 6d 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b5368:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     15b536d:	e8 14 91 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b5372:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15b5379:	00 00 
     15b537b:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
     15b5382:	00 
     15b5383:	75 54                	jne    15b53d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fa95d>
     15b5385:	48 89 d8             	mov    rax,rbx
     15b5388:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
     15b538f:	5b                   	pop    rbx
     15b5390:	41 5c                	pop    r12
     15b5392:	41 5d                	pop    r13
     15b5394:	41 5e                	pop    r14
     15b5396:	41 5f                	pop    r15
     15b5398:	5d                   	pop    rbp

### 0x15b576b -> 0x15b576f; FDE=(22762770, 22763522)
     15b5750:	4c 89 f6             	mov    rsi,r14
     15b5753:	31 c9                	xor    ecx,ecx
     15b5755:	ff 50 70             	call   QWORD PTR [rax+0x70]
     15b5758:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15b575d:	e8 2e 87 23 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15b5762:	eb 17                	jmp    15b577b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3facff>
     15b5764:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     15b5769:	eb 1a                	jmp    15b5785 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fad09>
     15b576b:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b576f:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b5773:	4c 89 e7             	mov    rdi,r12
     15b5776:	e8 ed 68 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b577b:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     15b5780:	e8 01 8d 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b5785:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15b578c:	00 00 
     15b578e:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     15b5795:	00 
     15b5796:	75 65                	jne    15b57fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fad81>
     15b5798:	4c 89 e0             	mov    rax,r12
     15b579b:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     15b57a2:	5b                   	pop    rbx
     15b57a3:	41 5c                	pop    r12
     15b57a5:	41 5d                	pop    r13
     15b57a7:	41 5e                	pop    r14
     15b57a9:	41 5f                	pop    r15
     15b57ab:	5d                   	pop    rbp

### 0x15b60eb -> 0x15b60ef; FDE=(22765708, 22766183)
     15b60d5:	74 14                	je     15b60eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb66f>
     15b60d7:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     15b60da:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15b60dd:	48 89 df             	mov    rdi,rbx
     15b60e0:	4c 89 e2             	mov    rdx,r12
     15b60e3:	4c 89 f1             	mov    rcx,r14
     15b60e6:	ff 50 20             	call   QWORD PTR [rax+0x20]
     15b60e9:	eb 10                	jmp    15b60fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb67f>
     15b60eb:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     15b60ef:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b60f3:	48 89 df             	mov    rdi,rbx
     15b60f6:	e8 6d 5f 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b60fb:	40 84 ed             	test   bpl,bpl
     15b60fe:	0f 84 d6 00 00 00    	je     15b61da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb75e>
     15b6104:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     15b6108:	0f 85 cc 00 00 00    	jne    15b61da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb75e>
     15b610e:	49 8d b7 b8 02 00 00 	lea    rsi,[r15+0x2b8]
     15b6115:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15b611a:	e8 c9 1d 5b ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
     15b611f:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]
     15b6123:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
     15b6128:	4d 89 7e f8          	mov    QWORD PTR [r14-0x8],r15
     15b612c:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     15b6131:	4c 89 f7             	mov    rdi,r14
     15b6134:	e8 73 30 5c ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     15b6139:	48 8d 05 d8 ba e9 fe 	lea    rax,[rip+0xfffffffffee9bad8]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     15b6140:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax

### 0x15b634c -> 0x15b6350; FDE=(22766236, 22766698)
     15b632a:	4c 89 e6             	mov    rsi,r12
     15b632d:	e8 ea 34 50 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     15b6332:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     15b6337:	e8 4a 81 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b633c:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     15b6340:	75 0a                	jne    15b634c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb8d0>
     15b6342:	66 41 c7 86 60 02 00 	mov    WORD PTR [r14+0x260],0x100
     15b6349:	00 00 01 
     15b634c:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b6350:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b6354:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15b635b:	00 00 
     15b635d:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     15b6362:	0f 85 fd 00 00 00    	jne    15b6465 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb9e9>
     15b6368:	4c 89 ff             	mov    rdi,r15
     15b636b:	48 83 c4 20          	add    rsp,0x20
     15b636f:	5b                   	pop    rbx
     15b6370:	41 5c                	pop    r12
     15b6372:	41 5d                	pop    r13
     15b6374:	41 5e                	pop    r14
     15b6376:	41 5f                	pop    r15
     15b6378:	e9 eb 5c 6d ff       	jmp    c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b637d:	49 89 c4             	mov    r12,rax
     15b6380:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
     15b6384:	49 89 e5             	mov    r13,rsp
     15b6387:	4c 89 ef             	mov    rdi,r13
     15b638a:	e8 5d a1 0c 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>

### 0x15b63b2 -> 0x15b63b6; FDE=(22766236, 22766698)
     15b6395:	e8 82 34 50 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     15b639a:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     15b639e:	e8 e3 80 4e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15b63a3:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     15b63a7:	74 09                	je     15b63b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb936>
     15b63a9:	49 83 27 00          	and    QWORD PTR [r15],0x0
     15b63ad:	45 31 ed             	xor    r13d,r13d
     15b63b0:	eb 13                	jmp    15b63c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb949>
     15b63b2:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b63b6:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b63ba:	4c 89 ff             	mov    rdi,r15
     15b63bd:	e8 a6 5c 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b63c2:	4d 8b 2f             	mov    r13,QWORD PTR [r15]
     15b63c5:	4d 85 e4             	test   r12,r12
     15b63c8:	74 28                	je     15b63f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb976>
     15b63ca:	4d 85 ed             	test   r13,r13
     15b63cd:	75 23                	jne    15b63f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb976>
     15b63cf:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
     15b63d2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     15b63d6:	48 89 e7             	mov    rdi,rsp
     15b63d9:	4c 89 e6             	mov    rsi,r12
     15b63dc:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15b63df:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
     15b63e3:	4d 89 2f             	mov    QWORD PTR [r15],r13
     15b63e6:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
     15b63eb:	31 ff                	xor    edi,edi
     15b63ed:	e8 fa 02 50 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>

### 0x15b6a59 -> 0x15b6a5d; FDE=(22767994, 22768417)
     15b6a3e:	49 81 c6 c8 00 00 00 	add    r14,0xc8
     15b6a45:	49 8b 37             	mov    rsi,QWORD PTR [r15]
     15b6a48:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     15b6a4b:	48 89 df             	mov    rdi,rbx
     15b6a4e:	4c 89 ea             	mov    rdx,r13
     15b6a51:	4d 89 f0             	mov    r8,r14
     15b6a54:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15b6a57:	eb 46                	jmp    15b6a9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc023>
     15b6a59:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15b6a5d:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     15b6a61:	48 89 df             	mov    rdi,rbx
     15b6a64:	e8 ff 55 6d ff       	call   c8c068 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9008>
     15b6a69:	eb 47                	jmp    15b6ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc036>
     15b6a6b:	80 7c 24 70 00       	cmp    BYTE PTR [rsp+0x70],0x0
     15b6a70:	74 29                	je     15b6a9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc01f>
     15b6a72:	48 8d 3d 03 b5 e9 fe 	lea    rdi,[rip+0xfffffffffee9b503]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     15b6a79:	6a 01                	push   0x1
     15b6a7b:	5e                   	pop    rsi
     15b6a7c:	e8 8f 7a 23 00       	call   17ee510 <__strlen_chk@plt>
     15b6a81:	48 8d 0d f4 b4 e9 fe 	lea    rcx,[rip+0xfffffffffee9b4f4]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     15b6a88:	48 89 df             	mov    rdi,rbx
     15b6a8b:	48 89 ce             	mov    rsi,rcx
     15b6a8e:	48 89 c2             	mov    rdx,rax
     15b6a91:	45 31 c0             	xor    r8d,r8d
     15b6a94:	e8 e3 f6 4f ff       	call   ab617c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x311c>
     15b6a99:	eb 04                	jmp    15b6a9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fc023>
     15b6a9b:	48 83 23 00          	and    QWORD PTR [rbx],0x0

### 0x164d115 -> 0x164d127; FDE=(23384334, 23384405)
     164d100:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     164d104:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     164d108:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     164d10d:	c3                   	ret
     164d10e:	41 56                	push   r14
     164d110:	53                   	push   rbx
     164d111:	50                   	push   rax
     164d112:	48 89 fb             	mov    rbx,rdi
     164d115:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
     164d119:	4d 85 f6             	test   r14,r14
     164d11c:	74 17                	je     164d135 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12a1>
     164d11e:	49 8d 7e 48          	lea    rdi,[r14+0x48]
     164d122:	e8 d5 47 6e ff       	call   d318fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27e89c>
     164d127:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
     164d12b:	e8 82 13 45 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     164d130:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     164d135:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     164d139:	48 85 ff             	test   rdi,rdi
     164d13c:	74 0f                	je     164d14d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12b9>
     164d13e:	be 80 00 00 00       	mov    esi,0x80
     164d143:	e8 c7 6d 6e ff       	call   d33f0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf95>
     164d148:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     164d14d:	48 83 c4 08          	add    rsp,0x8
     164d151:	5b                   	pop    rbx
     164d152:	41 5e                	pop    r14
     164d154:	c3                   	ret
     164d155:	cc                   	int3

### 0x170cbf0 -> 0x170cbf4; FDE=(24167410, 24176494)
     170cbcd:	66 0f 11 00          	movupd XMMWORD PTR [rax],xmm0
     170cbd1:	48 8d 05 e0 ce 19 00 	lea    rax,[rip+0x19cee0]        # 18a9ab8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x169f8>
     170cbd8:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
     170cbdf:	00 
     170cbe0:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     170cbe5:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     170cbe8:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
     170cbef:	00 
     170cbf0:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     170cbf4:	48 8b 78 40          	mov    rdi,QWORD PTR [rax+0x40]
     170cbf8:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
     170cbfc:	e8 35 ec 36 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     170cc01:	49 89 d7             	mov    r15,rdx
     170cc04:	48 f7 c2 00 00 00 80 	test   rdx,0xffffffff80000000
     170cc0b:	4c 8d b4 24 28 02 00 	lea    r14,[rsp+0x228]
     170cc12:	00 
     170cc13:	0f 85 d1 11 00 00    	jne    170ddea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1f56>
     170cc19:	48 8d 0d e8 f1 19 00 	lea    rcx,[rip+0x19f1e8]        # 18abe08 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x18d48>
     170cc20:	48 89 8c 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rcx
     170cc27:	00 
     170cc28:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
     170cc2f:	00 
     170cc30:	44 89 bc 24 a0 01 00 	mov    DWORD PTR [rsp+0x1a0],r15d
     170cc37:	00 
     170cc38:	44 89 bc 24 a4 01 00 	mov    DWORD PTR [rsp+0x1a4],r15d
     170cc3f:	00 
     170cc40:	48 83 a4 24 a8 01 00 	and    QWORD PTR [rsp+0x1a8],0x0

### 0x173789c -> 0x17378a5; FDE=(24344450, 24344852)
     173787c:	80 7d 0b 00          	cmp    BYTE PTR [rbp+0xb],0x0
     1737880:	74 f0                	je     1737872 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeb9de>
     1737882:	45 31 ff             	xor    r15d,r15d
     1737885:	49 ff c5             	inc    r13
     1737888:	4c 39 e5             	cmp    rbp,r12
     173788b:	0f 85 67 ff ff ff    	jne    17377f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeb964>
     1737891:	44 3b 7c 24 0c       	cmp    r15d,DWORD PTR [rsp+0xc]
     1737896:	0f 85 5c ff ff ff    	jne    17377f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeb964>
     173789c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     17378a1:	4c 8b 78 38          	mov    r15,QWORD PTR [rax+0x38]
     17378a5:	4c 8b 60 40          	mov    r12,QWORD PTR [rax+0x40]
     17378a9:	4d 39 e7             	cmp    r15,r12
     17378ac:	74 40                	je     17378ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeba5a>
     17378ae:	4d 6b ed 18          	imul   r13,r13,0x18
     17378b2:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
     17378b7:	49 8d 7f 08          	lea    rdi,[r15+0x8]
     17378bb:	e8 76 3f 34 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     17378c0:	4c 89 f7             	mov    rdi,r14
     17378c3:	48 89 c6             	mov    rsi,rax
     17378c6:	e8 4f 51 36 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     17378cb:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     17378ce:	4c 01 ef             	add    rdi,r13
     17378d1:	4c 89 f6             	mov    rsi,r14
     17378d4:	e8 55 41 34 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     17378d9:	4c 89 f7             	mov    rdi,r14
     17378dc:	e8 af 65 0b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     17378e1:	49 83 c7 20          	add    r15,0x20

### 0x173b14e -> 0x173b16b; FDE=(24355226, 24360599)
     173b12a:	48 89 e8             	mov    rax,rbp
     173b12d:	49 01 ef             	add    r15,rbp
     173b130:	4c 39 7c 24 30       	cmp    QWORD PTR [rsp+0x30],r15
     173b135:	0f 85 a3 f8 ff ff    	jne    173a9de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeeb4a>
     173b13b:	45 8b 7d 20          	mov    r15d,DWORD PTR [r13+0x20]
     173b13f:	41 b8 ff ff ff ff    	mov    r8d,0xffffffff
     173b145:	4d 39 c7             	cmp    r15,r8
     173b148:	0f 84 87 00 00 00    	je     173b1d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef341>
     173b14e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     173b153:	48 8b 00             	mov    rax,QWORD PTR [rax]
     173b156:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
     173b15a:	7e 57                	jle    173b1b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef31f>
     173b15c:	45 31 ed             	xor    r13d,r13d
     173b15f:	31 c9                	xor    ecx,ecx
     173b161:	31 ed                	xor    ebp,ebp
     173b163:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     173b168:	41 89 cc             	mov    r12d,ecx
     173b16b:	48 8b 50 40          	mov    rdx,QWORD PTR [rax+0x40]
     173b16f:	4c 01 ea             	add    rdx,r13
     173b172:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     173b176:	8b 73 20             	mov    esi,DWORD PTR [rbx+0x20]
     173b179:	e8 06 0f 00 00       	call   173c084 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf01f0>
     173b17e:	41 39 c4             	cmp    r12d,eax
     173b181:	89 c1                	mov    ecx,eax
     173b183:	41 0f 47 cc          	cmova  ecx,r12d
     173b187:	83 f8 ff             	cmp    eax,0xffffffff
     173b18a:	41 0f 44 cc          	cmove  ecx,r12d

### 0x173b1eb -> 0x173b200; FDE=(24355226, 24360599)
     173b1cd:	48 ff c2             	inc    rdx
     173b1d0:	48 39 d1             	cmp    rcx,rdx
     173b1d3:	75 ea                	jne    173b1bf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef32b>
     173b1d5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     173b1da:	44 8b 78 40          	mov    r15d,DWORD PTR [rax+0x40]
     173b1de:	4d 39 c7             	cmp    r15,r8
     173b1e1:	0f 84 cc 00 00 00    	je     173b2b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef41f>
     173b1e7:	4f 8d 24 3e          	lea    r12,[r14+r15*1]
     173b1eb:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     173b1f0:	48 8b 00             	mov    rax,QWORD PTR [rax]
     173b1f3:	83 78 08 00          	cmp    DWORD PTR [rax+0x8],0x0
     173b1f7:	7e 7c                	jle    173b275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3e1>
     173b1f9:	45 31 ed             	xor    r13d,r13d
     173b1fc:	31 d2                	xor    edx,edx
     173b1fe:	31 ed                	xor    ebp,ebp
     173b200:	48 8b 70 40          	mov    rsi,QWORD PTR [rax+0x40]
     173b204:	42 0f b6 4c 2e 02    	movzx  ecx,BYTE PTR [rsi+r13*1+0x2]
     173b20a:	83 f9 0c             	cmp    ecx,0xc
     173b20d:	74 05                	je     173b214 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef380>
     173b20f:	83 f9 09             	cmp    ecx,0x9
     173b212:	75 40                	jne    173b254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3c0>
     173b214:	42 f6 44 2e 01 28    	test   BYTE PTR [rsi+r13*1+0x1],0x28
     173b21a:	75 38                	jne    173b254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3c0>
     173b21c:	42 8a 4c 2e 03       	mov    cl,BYTE PTR [rsi+r13*1+0x3]
     173b221:	f6 c1 08             	test   cl,0x8
     173b224:	75 2e                	jne    173b254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef3c0>
     173b226:	80 e1 07             	and    cl,0x7

### 0x17703f5 -> 0x1770411; FDE=(24576692, 24577592)
     17703d9:	e9 9e 01 00 00       	jmp    177057c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1246e8>
     17703de:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     17703e3:	6a 0a                	push   0xa
     17703e5:	5e                   	pop    rsi
     17703e6:	e8 65 ab f7 ff       	call   16eaf50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f0bc>
     17703eb:	0f b6 7b 08          	movzx  edi,BYTE PTR [rbx+0x8]
     17703ef:	40 f6 c7 01          	test   dil,0x1
     17703f3:	74 56                	je     177044b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1245b7>
     17703f5:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     17703f9:	eb 52                	jmp    177044d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1245b9>
     17703fb:	44 8b 7b 08          	mov    r15d,DWORD PTR [rbx+0x8]
     17703ff:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1770404:	6a 0d                	push   0xd
     1770406:	5e                   	pop    rsi
     1770407:	e8 44 ab f7 ff       	call   16eaf50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f0bc>
     177040c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1770411:	48 8b 77 40          	mov    rsi,QWORD PTR [rdi+0x40]
     1770415:	e8 9a fb 39 ff       	call   b0ffb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cf54>
     177041a:	44 89 38             	mov    DWORD PTR [rax],r15d
     177041d:	48 83 c0 04          	add    rax,0x4
     1770421:	eb 79                	jmp    177049c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124608>
     1770423:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
     1770427:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     177042c:	6a 09                	push   0x9
     177042e:	5e                   	pop    rsi
     177042f:	e8 1c ab f7 ff       	call   16eaf50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f0bc>
     1770434:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]

