# Fast field428 builder-interface resolution

## Thunk/body around ece06e -> ece084

/tmp/f428fast/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000ece050 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95466>:
  ece050:	0d d3 66 96 00       	or     eax,0x9666d3
  ece055:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  ece058:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  ece05c:	48 89 c6             	mov    rsi,rax
  ece05f:	e9 f2 8a 01 00       	jmp    ee6b56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadf6c>
  ece064:	48 83 c7 10          	add    rdi,0x10
  ece068:	e9 b3 fe ff ff       	jmp    ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
  ece06d:	cc                   	int3
  ece06e:	53                   	push   rbx
  ece06f:	48 89 fb             	mov    rbx,rdi
  ece072:	48 83 c7 10          	add    rdi,0x10
  ece076:	e8 a5 fe ff ff       	call   ecdf20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95336>
  ece07b:	48 89 df             	mov    rdi,rbx
  ece07e:	5b                   	pop    rbx
  ece07f:	e9 9c fe 91 00       	jmp    17edf20 <_ZdlPv@plt>
  ece084:	55                   	push   rbp
  ece085:	41 57                	push   r15
  ece087:	41 56                	push   r14
  ece089:	41 55                	push   r13
  ece08b:	41 54                	push   r12
  ece08d:	53                   	push   rbx
  ece08e:	48 81 ec 68 01 00 00 	sub    rsp,0x168
  ece095:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
  ece09a:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
  ece09f:	48                   	rex.W

## Builder variant around ee6d90

/tmp/f428fast/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000ee6d80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae196>:
  ee6d80:	ff 64 48 8b          	jmp    QWORD PTR [rax+rcx*2-0x75]
  ee6d84:	04 25                	add    al,0x25
  ee6d86:	28 00                	sub    BYTE PTR [rax],al
  ee6d88:	00 00                	add    BYTE PTR [rax],al
  ee6d8a:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  ee6d8f:	75 08                	jne    ee6d99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae1af>
  ee6d91:	48 89 df             	mov    rdi,rbx
  ee6d94:	e8 37 8f b8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  ee6d99:	e8 12 8d 90 00       	call   17efab0 <__stack_chk_fail@plt>
  ee6d9e:	48 8d 47 10          	lea    rax,[rdi+0x10]
  ee6da2:	48 8d 0d 6f d6 94 00 	lea    rcx,[rip+0x94d66f]        # 1834418 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63b0>
  ee6da9:	48 89 0e             	mov    QWORD PTR [rsi],rcx
  ee6dac:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
  ee6db0:	48 89 c6             	mov    rsi,rax
  ee6db3:	e9 08 02 00 00       	jmp    ee6fc0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae3d6>
  ee6db8:	55                   	push   rbp
  ee6db9:	41 57                	push   r15
  ee6dbb:	41 56                	push   r14
  ee6dbd:	41 55                	push   r13
  ee6dbf:	41 54                	push   r12
  ee6dc1:	53                   	push   rbx
  ee6dc2:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
  ee6dc9:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
  ee6dce:	49 89 f5             	mov    r13,rsi
  ee6dd1:	49 89 fe             	mov    r14,rdi
  ee6dd4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ee6ddb:	00 00 
  ee6ddd:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  ee6de4:	00 
  ee6de5:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  ee6de9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  ee6dee:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
  ee6df2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  ee6df7:	4c 8d 66 50          	lea    r12,[rsi+0x50]
  ee6dfb:	48 8b ae 60 01 00 00 	mov    rbp,QWORD PTR [rsi+0x160]
  ee6e02:	bf 50 0e 00 00       	mov    edi,0xe50
  ee6e07:	e8 f4 70 90 00       	call   17edf00 <_Znwm@plt>
  ee6e0c:	49 89 c7             	mov    r15,rax
  ee6e0f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  ee6e13:	0f 57 c0             	xorps  xmm0,xmm0
  ee6e16:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  ee6e1a:	48 8d 05 3f d6 94 00 	lea    rax,[rip+0x94d63f]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
  ee6e21:	49 89 07             	mov    QWORD PTR [r15],rax
  ee6e24:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ee6e29:	4c 89 e6             	mov    rsi,r12
  ee6e2c:	e8                   	.byte 0xe8
  ee6e2d:	5f                   	pop    rdi
  ee6e2e:	34 b9                	xor    al,0xb9

## Relocations 0x18343f0..0x18344d0
00000000018343f0  0000000000000008 R_X86_64_RELATIVE                         19f4990
00000000018343f8  0000000000000008 R_X86_64_RELATIVE                         43d360
0000000001834400  0000000000000008 R_X86_64_RELATIVE                         19f4960
0000000001834418  0000000000000008 R_X86_64_RELATIVE                         ee6cd6
0000000001834420  0000000000000008 R_X86_64_RELATIVE                         ee6cea
0000000001834428  0000000000000008 R_X86_64_RELATIVE                         ee6cfc
0000000001834430  0000000000000008 R_X86_64_RELATIVE                         ee6d9e
0000000001834438  0000000000000008 R_X86_64_RELATIVE                         ece064
0000000001834440  0000000000000008 R_X86_64_RELATIVE                         ece06e
0000000001834448  0000000000000008 R_X86_64_RELATIVE                         ee6db8
0000000001834460  0000000000000008 R_X86_64_RELATIVE                         ee6b2a
0000000001834468  0000000000000008 R_X86_64_RELATIVE                         ee6b3a
0000000001834470  0000000000000008 R_X86_64_RELATIVE                         ee6b4c
0000000001834480  0000000000000008 R_X86_64_RELATIVE                         a50370
0000000001834498  0000000000000008 R_X86_64_RELATIVE                         ecfc7e
00000000018344a0  0000000000000008 R_X86_64_RELATIVE                         ed0a5e
00000000018344a8  0000000000000008 R_X86_64_RELATIVE                         af6576
00000000018344b0  0000000000000008 R_X86_64_RELATIVE                         ec70f2
00000000018344b8  0000000000000008 R_X86_64_RELATIVE                         9d81d0
00000000018344c0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
00000000018344c8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001834478  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0

## Code refs to AP 0x1834440

## Code refs to AP 0x1834460
  ece0bd:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  ece0c1:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  ece0c6:	4c 8b 66 18          	mov    r12,QWORD PTR [rsi+0x18]
  ece0ca:	4c 8d 6e 50          	lea    r13,[rsi+0x50]
  ece0ce:	4c 8b be 60 01 00 00 	mov    r15,QWORD PTR [rsi+0x160]
  ece0d5:	bf 50 0e 00 00       	mov    edi,0xe50
  ece0da:	e8 21 fe 91 00       	call   17edf00 <_Znwm@plt>
  ece0df:	48 89 c3             	mov    rbx,rax
  ece0e2:	0f 57 c0             	xorps  xmm0,xmm0
  ece0e5:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  ece0e9:	48 8d 05 70 63 96 00 	lea    rax,[rip+0x966370]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
  ece0f0:	48 89 03             	mov    QWORD PTR [rbx],rax
  ece0f3:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  ece0fa:	00 
  ece0fb:	4c 89 ee             	mov    rsi,r13
  ece0fe:	e8 8d c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ece103:	49 8d b6 80 00 00 00 	lea    rsi,[r14+0x80]
  ece10a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  ece111:	00 
  ece112:	e8 79 c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ece117:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
  ece11e:	00 
  ece11f:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
  ece126:	00 
  ece127:	e8 64 c1 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ece12c:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
  ece133:	00 
  ece134:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
  ece13b:	00 
--
  ee6b02:	48 89 c3             	mov    rbx,rax
  ee6b05:	48 89 e7             	mov    rdi,rsp
  ee6b08:	e8 15 4f b9 ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
  ee6b0d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ee6b14:	00 00 
  ee6b16:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  ee6b1b:	75 08                	jne    ee6b25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadf3b>
  ee6b1d:	48 89 df             	mov    rdi,rbx
  ee6b20:	e8 ab 91 b8 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  ee6b25:	e8 86 8f 90 00       	call   17efab0 <__stack_chk_fail@plt>
  ee6b2a:	48 8d 05 2f d9 94 00 	lea    rax,[rip+0x94d92f]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
  ee6b31:	48 89 07             	mov    QWORD PTR [rdi],rax
  ee6b34:	e9 d7 74 90 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  ee6b39:	cc                   	int3
  ee6b3a:	53                   	push   rbx
  ee6b3b:	48 89 fb             	mov    rbx,rdi
  ee6b3e:	e8 e7 ff ff ff       	call   ee6b2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xadf40>
  ee6b43:	48 89 df             	mov    rdi,rbx
  ee6b46:	5b                   	pop    rbx
  ee6b47:	e9 d4 73 90 00       	jmp    17edf20 <_ZdlPv@plt>
  ee6b4c:	48 83 c7 20          	add    rdi,0x20
  ee6b50:	e9 29 91 fe ff       	jmp    ecfc7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97094>
  ee6b55:	cc                   	int3
  ee6b56:	41 57                	push   r15
  ee6b58:	41 56                	push   r14
  ee6b5a:	41 54                	push   r12
  ee6b5c:	53                   	push   rbx
  ee6b5d:	50                   	push   rax
  ee6b5e:	49 89 f6             	mov    r14,rsi
--
  ee6dee:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
  ee6df2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  ee6df7:	4c 8d 66 50          	lea    r12,[rsi+0x50]
  ee6dfb:	48 8b ae 60 01 00 00 	mov    rbp,QWORD PTR [rsi+0x160]
  ee6e02:	bf 50 0e 00 00       	mov    edi,0xe50
  ee6e07:	e8 f4 70 90 00       	call   17edf00 <_Znwm@plt>
  ee6e0c:	49 89 c7             	mov    r15,rax
  ee6e0f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  ee6e13:	0f 57 c0             	xorps  xmm0,xmm0
  ee6e16:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  ee6e1a:	48 8d 05 3f d6 94 00 	lea    rax,[rip+0x94d63f]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
  ee6e21:	49 89 07             	mov    QWORD PTR [r15],rax
  ee6e24:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  ee6e29:	4c 89 e6             	mov    rsi,r12
  ee6e2c:	e8 5f 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ee6e31:	49 8d b5 80 00 00 00 	lea    rsi,[r13+0x80]
  ee6e38:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  ee6e3d:	e8 4e 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ee6e42:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  ee6e49:	00 
  ee6e4a:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
  ee6e4f:	e8 3c 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ee6e54:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
  ee6e5b:	00 
  ee6e5c:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  ee6e61:	4c 89 e7             	mov    rdi,r12
  ee6e64:	e8 27 34 b9 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  ee6e69:	49 8d 4d 20          	lea    rcx,[r13+0x20]
  ee6e6d:	4d 8d 45 30          	lea    r8,[r13+0x30]

## Code refs to adjacent AP candidates
### 0x1834430
### 0x1834438
### 0x1834440
### 0x1834448
### 0x1834450
### 0x1834458
### 0x1834460
  ece0e9:	48 8d 05 70 63 96 00 	lea    rax,[rip+0x966370]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
  ee6b2a:	48 8d 05 2f d9 94 00 	lea    rax,[rip+0x94d92f]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
  ee6e1a:	48 8d 05 3f d6 94 00 	lea    rax,[rip+0x94d63f]        # 1834460 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x63f8>
### 0x1834468

## Known TimelineAds owner+0x50 AP refs
### 0x18674c8
 1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
 1355044:	48 8d 05 7d 24 51 00 	lea    rax,[rip+0x51247d]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
### 0x1867550
 1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
 135504e:	48 8d 05 fb 24 51 00 	lea    rax,[rip+0x5124fb]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
### 0x1867980
 1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
