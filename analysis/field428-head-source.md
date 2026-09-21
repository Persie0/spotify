# field428 head source argument

- constructor FDE=(15525244, 15530574)
- prologue: six pushes + sub rsp,0x168 => post rsp = entry_rsp-0x198
- [rsp+0x1c8] = entry_rsp+0x30
- [rsp+0x1d0] = entry_rsp+0x38
- [rsp+0x1d8] = entry_rsp+0x40
- caller pre-call rsp = entry_rsp+8
- therefore source head [rsp+0x1c8] = caller pre-call [rsp+0x28]

## Direct callers (2)
### call 0xece198; FDE=(15523972, 15525243)
      ece084:	55                   	push   rbp
      ece085:	41 57                	push   r15
      ece087:	41 56                	push   r14
      ece089:	41 55                	push   r13
      ece08b:	41 54                	push   r12
      ece08d:	53                   	push   rbx
      ece08e:	48 81 ec 68 01 00 00 	sub    rsp,0x168
      ece095:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
      ece09a:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      ece09f:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
      ece0a4:	49 89 f6             	mov    r14,rsi
      ece0a7:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      ece0ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ece0b3:	00 00 
      ece0b5:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
      ece0bc:	00 
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
      ece1bb:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      ece1c0:	48 8b 87 98 00 00 00 	mov    rax,QWORD PTR [rdi+0x98]
      ece1c7:	48 85 c0             	test   rax,rax
      ece1ca:	48 8d 0d 67 75 ab 00 	lea    rcx,[rip+0xab7567]        # 1985738 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4e380>
      ece1d1:	48 0f 45 c8          	cmovne rcx,rax
      ece1d5:	8a 41 20             	mov    al,BYTE PTR [rcx+0x20]
      ece1d8:	88 83 60 04 00 00    	mov    BYTE PTR [rbx+0x460],al
      ece1de:	e8 6b 18 00 00       	call   ecfa4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96e64>
      ece1e3:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
      ece1e7:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
      ece1eb:	40 f6 c6 01          	test   sil,0x1
      ece1ef:	0f 85 ce 02 00 00    	jne    ece4c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x958d9>
      ece1f5:	48 83 c0 18          	add    rax,0x18
      ece1f9:	48 89 c7             	mov    rdi,rax
      ece1fc:	e8 4f 76 89 00       	call   1765850 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1199bc>
      ece201:	48 8d bb 68 04 00 00 	lea    rdi,[rbx+0x468]
      ece208:	48 89 c6             	mov    rsi,rax
      ece20b:	e8 1e d8 ba ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      ece210:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
      ece215:	41 80 bf 30 09 00 00 	cmp    BYTE PTR [r15+0x930],0x0
      ece21c:	00 
      ece21d:	0f 84 06 02 00 00    	je     ece429 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9583f>
      ece223:	49 8d af f0 04 00 00 	lea    rbp,[r15+0x4f0]

### call 0xee6ebd; FDE=(15625656, 15626175)
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
      ee6ee0:	4c 89 ff             	mov    rdi,r15
      ee6ee3:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      ee6ee8:	e8 5b 6d ff ff       	call   eddc48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa505e>
      ee6eed:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ee6ef2:	e8 73 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ee6ef7:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      ee6efc:	e8 69 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ee6f01:	31 ff                	xor    edi,edi
      ee6f03:	e8 14 75 bb ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ee6f08:	4d 89 3e             	mov    QWORD PTR [r14],r15
      ee6f0b:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
      ee6f0f:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      ee6f13:	31 ff                	xor    edi,edi
      ee6f15:	e8 6c 75 bb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ee6f1a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ee6f21:	00 00 
      ee6f23:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
      ee6f2a:	00 
      ee6f2b:	0f 85 89 00 00 00    	jne    ee6fba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae3d0>
      ee6f31:	4c 89 f0             	mov    rax,r14
      ee6f34:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
      ee6f3b:	5b                   	pop    rbx
      ee6f3c:	41 5c                	pop    r12

## Map caller pre-call +0x28 source
- +0x0: 0xece197 push rax
- +0x8: 0xece18d push r13
- +0x10: 0xece18c push rax
- +0x18: 0xece18a push r15
- +0x20: 0xece188 push r10
- +0x28: 0xece186 push r11 <== source head
- +0x30: 0xece185 push rbp
- +0x38: 0xece183 push r14
- +0x40: 0xece08d push rbx
- +0x48: 0xece08b push r12
- +0x50: 0xece089 push r13
- +0x58: 0xece087 push r14
- +0x60: 0xece085 push r15
- +0x68: 0xece084 push rbp
### selected source @0xece186: r11
      ece0a7:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      ece0ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ece0b3:	00 00 
      ece0b5:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
      ece0bc:	00 
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
      ece1bb:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      ece1c0:	48 8b 87 98 00 00 00 	mov    rax,QWORD PTR [rdi+0x98]
      ece1c7:	48 85 c0             	test   rax,rax
      ece1ca:	48 8d 0d 67 75 ab 00 	lea    rcx,[rip+0xab7567]        # 1985738 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4e380>
      ece1d1:	48 0f 45 c8          	cmovne rcx,rax

- +0x0: 0xee6ebc push rax
- +0x8: 0xee6eb2 push r12
- +0x10: 0xee6eb1 push rax
- +0x18: 0xee6eb0 push rbp
- +0x20: 0xee6eae push r10
- +0x28: 0xee6eac push r11 <== source head
- +0x30: 0xee6eab push rbx
- +0x38: 0xee6ea9 push r13
- +0x40: 0xee6dc1 push rbx
- +0x48: 0xee6dbf push r12
- +0x50: 0xee6dbd push r13
- +0x58: 0xee6dbb push r14
- +0x60: 0xee6db9 push r15
- +0x68: 0xee6db8 push rbp
### selected source @0xee6eac: r11
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
      ee6ee0:	4c 89 ff             	mov    rdi,r15
      ee6ee3:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      ee6ee8:	e8 5b 6d ff ff       	call   eddc48 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa505e>
      ee6eed:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ee6ef2:	e8 73 30 b9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

## Constructor incoming source usage
### 0x1c8
- 0xecedfd: mov    rcx,QWORD PTR [rsp+0x1c8]
      ecedd7:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
      ecedde:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      ecede3:	e8 0e ac 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ecede8:	bf 98 00 00 00       	mov    edi,0x98
      eceded:	e8 0e f1 91 00       	call   17edf00 <_Znwm@plt>
      ecedf2:	49 89 c6             	mov    r14,rax
      ecedf5:	4c 8b bc 24 d0 01 00 	mov    r15,QWORD PTR [rsp+0x1d0]
      ecedfc:	00 
      ecedfd:	48 8b 8c 24 c8 01 00 	mov    rcx,QWORD PTR [rsp+0x1c8]
      ecee04:	00 
      ecee05:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ecee09:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ecee0c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      ecee10:	48 85 c0             	test   rax,rax
      ecee13:	74 05                	je     ecee1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96230>
      ecee15:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ecee1a:	48 8d 83 28 04 00 00 	lea    rax,[rbx+0x428]
      ecee21:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      ecee28:	00 
      ecee29:	49 8d 46 18          	lea    rax,[r14+0x18]
      ecee2d:	0f 57 c0             	xorps  xmm0,xmm0
      ecee30:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
      ecee35:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax

### 0x1d0
- 0xecedf5: mov    r15,QWORD PTR [rsp+0x1d0]
      ecedd0:	74 05                	je     ecedd7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x961ed>
      ecedd2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ecedd7:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
      ecedde:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      ecede3:	e8 0e ac 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ecede8:	bf 98 00 00 00       	mov    edi,0x98
      eceded:	e8 0e f1 91 00       	call   17edf00 <_Znwm@plt>
      ecedf2:	49 89 c6             	mov    r14,rax
      ecedf5:	4c 8b bc 24 d0 01 00 	mov    r15,QWORD PTR [rsp+0x1d0]
      ecedfc:	00 
      ecedfd:	48 8b 8c 24 c8 01 00 	mov    rcx,QWORD PTR [rsp+0x1c8]
      ecee04:	00 
      ecee05:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ecee09:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ecee0c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      ecee10:	48 85 c0             	test   rax,rax
      ecee13:	74 05                	je     ecee1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96230>
      ecee15:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ecee1a:	48 8d 83 28 04 00 00 	lea    rax,[rbx+0x428]
      ecee21:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      ecee28:	00 
      ecee29:	49 8d 46 18          	lea    rax,[r14+0x18]
      ecee2d:	0f 57 c0             	xorps  xmm0,xmm0

### 0x1d8
- 0xece5d5: mov    rcx,QWORD PTR [rsp+0x1d8]
      ece5b1:	00 
      ece5b2:	48 8d 35 af 61 50 ff 	lea    rsi,[rip+0xffffffffff5061af]        # 3d4768 <_ZTSN5boost17bad_function_callE@@Base+0x1aae>
      ece5b9:	e8 34 84 ff ff       	call   ec69f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de08>
      ece5be:	48 8d 05 d3 5e 96 00 	lea    rax,[rip+0x965ed3]        # 1834498 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6430>
      ece5c5:	48 89 03             	mov    QWORD PTR [rbx],rax
      ece5c8:	bf 30 01 00 00       	mov    edi,0x130
      ece5cd:	e8 2e f9 91 00       	call   17edf00 <_Znwm@plt>
      ece5d2:	49 89 c7             	mov    r15,rax
      ece5d5:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
      ece5dc:	00 
      ece5dd:	48 89 c7             	mov    rdi,rax
      ece5e0:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
      ece5e5:	4c 89 f6             	mov    rsi,r14
      ece5e8:	48 89 ea             	mov    rdx,rbp
      ece5eb:	e8 50 8b 01 00       	call   ee7140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae556>
      ece5f0:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
      ece5f5:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12
      ece5fa:	4c 89 bb c8 01 00 00 	mov    QWORD PTR [rbx+0x1c8],r15
      ece601:	48 8d bb d0 01 00 00 	lea    rdi,[rbx+0x1d0]
      ece608:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
      ece60d:	e8 e4 b3 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      ece612:	bf 30 01 00 00       	mov    edi,0x130
      ece617:	e8 e4 f8 91 00       	call   17edf00 <_Znwm@plt>
- 0xece6de: mov    rcx,QWORD PTR [rsp+0x1d8]
      ece6b7:	48 8d 05 ec b7 01 00 	lea    rax,[rip+0x1b7ec]        # ee9eaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb12c0>
      ece6be:	49 89 87 f8 00 00 00 	mov    QWORD PTR [r15+0xf8],rax
      ece6c5:	4c 89 ff             	mov    rdi,r15
      ece6c8:	48 81 c7 00 01 00 00 	add    rdi,0x100
      ece6cf:	48 8d 35 fb 7a 48 ff 	lea    rsi,[rip+0xffffffffff487afb]        # 3561d1 <_ZTSSt12bad_any_cast@@Base-0x39ff7>
      ece6d6:	6a 15                	push   0x15
      ece6d8:	5a                   	pop    rdx
      ece6d9:	e8 3c e3 bc ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      ece6de:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
      ece6e5:	00 
      ece6e6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ece6ea:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ece6ed:	41 0f 11 87 18 01 00 	movups XMMWORD PTR [r15+0x118],xmm0
      ece6f4:	00 
      ece6f5:	48 85 c0             	test   rax,rax
      ece6f8:	74 05                	je     ece6ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95b15>
      ece6fa:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ece6ff:	49 83 a7 28 01 00 00 	and    QWORD PTR [r15+0x128],0x0
      ece706:	00 
      ece707:	4c 89 bb e0 01 00 00 	mov    QWORD PTR [rbx+0x1e0],r15
      ece70e:	4c 8d bb e8 01 00 00 	lea    r15,[rbx+0x1e8]
      ece715:	4c 89 ff             	mov    rdi,r15
      ece718:	e8 d9 b2 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
- 0xece835: mov    rcx,QWORD PTR [rsp+0x1d8]
      ece80a:	4c 8d ad 88 00 00 00 	lea    r13,[rbp+0x88]
      ece811:	48 8d 05 f5 a9 5b 00 	lea    rax,[rip+0x5ba9f5]        # 148920d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce791>
      ece818:	48 89 85 10 01 00 00 	mov    QWORD PTR [rbp+0x110],rax
      ece81f:	48 8d bd 18 01 00 00 	lea    rdi,[rbp+0x118]
      ece826:	48 8d 35 d8 86 4b ff 	lea    rsi,[rip+0xffffffffff4b86d8]        # 386f05 <_ZTSSt12bad_any_cast@@Base-0x92c3>
      ece82d:	6a 08                	push   0x8
      ece82f:	5a                   	pop    rdx
      ece830:	e8 e5 e1 bc ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      ece835:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
      ece83c:	00 
      ece83d:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ece841:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ece844:	0f 11 85 30 01 00 00 	movups XMMWORD PTR [rbp+0x130],xmm0
      ece84b:	48 85 c0             	test   rax,rax
      ece84e:	74 05                	je     ece855 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95c6b>
      ece850:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ece855:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      ece85a:	48 83 a5 40 01 00 00 	and    QWORD PTR [rbp+0x140],0x0
      ece861:	00 
      ece862:	31 ff                	xor    edi,edi
      ece864:	e8 b3 fb bc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ece869:	bf 48 01 00 00       	mov    edi,0x148
      ece86e:	e8 8d f6 91 00       	call   17edf00 <_Znwm@plt>
- 0xece954: mov    rcx,QWORD PTR [rsp+0x1d8]
      ece92b:	48 8d 05 d8 f4 5b 00 	lea    rax,[rip+0x5bf4d8]        # 148de0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d338e>
      ece932:	49 89 86 10 01 00 00 	mov    QWORD PTR [r14+0x110],rax
      ece939:	4c 89 74 24 28       	mov    QWORD PTR [rsp+0x28],r14
      ece93e:	49 8d be 18 01 00 00 	lea    rdi,[r14+0x118]
      ece945:	48 8d 35 4e 41 47 ff 	lea    rsi,[rip+0xffffffffff47414e]        # 342a9a <_ZTSSt12bad_any_cast@@Base-0x4d72e>
      ece94c:	6a 0d                	push   0xd
      ece94e:	5a                   	pop    rdx
      ece94f:	e8 c6 e0 bc ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      ece954:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
      ece95b:	00 
      ece95c:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ece960:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ece963:	0f 11 85 30 01 00 00 	movups XMMWORD PTR [rbp+0x130],xmm0
      ece96a:	48 85 c0             	test   rax,rax
      ece96d:	74 05                	je     ece974 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95d8a>
      ece96f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ece974:	48 83 a5 40 01 00 00 	and    QWORD PTR [rbp+0x140],0x0
      ece97b:	00 
      ece97c:	31 ff                	xor    edi,edi
      ece97e:	e8 99 fa bc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ece983:	bf 48 01 00 00       	mov    edi,0x148
      ece988:	e8 73 f5 91 00       	call   17edf00 <_Znwm@plt>
      ece98d:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
- 0xecea6e: mov    rcx,QWORD PTR [rsp+0x1d8]
      ecea45:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ecea4a:	48 8d 05 2e 56 5b 00 	lea    rax,[rip+0x5b562e]        # 148407f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c9603>
      ecea51:	49 89 86 10 01 00 00 	mov    QWORD PTR [r14+0x110],rax
      ecea58:	49 8d be 18 01 00 00 	lea    rdi,[r14+0x118]
      ecea5f:	48 8d 35 ac b9 49 ff 	lea    rsi,[rip+0xffffffffff49b9ac]        # 36a412 <_ZTSSt12bad_any_cast@@Base-0x25db6>
      ecea66:	6a 13                	push   0x13
      ecea68:	5a                   	pop    rdx
      ecea69:	e8 ac df bc ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      ecea6e:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
      ecea75:	00 
      ecea76:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ecea7a:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ecea7d:	41 0f 11 85 30 01 00 	movups XMMWORD PTR [r13+0x130],xmm0
      ecea84:	00 
      ecea85:	48 85 c0             	test   rax,rax
      ecea88:	74 05                	je     ecea8f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95ea5>
      ecea8a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ecea8f:	49 83 a5 40 01 00 00 	and    QWORD PTR [r13+0x140],0x0
      ecea96:	00 
      ecea97:	31 ff                	xor    edi,edi
      ecea99:	e8 7e f9 bc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ecea9e:	bf 48 01 00 00       	mov    edi,0x148
      eceaa3:	e8 58 f4 91 00       	call   17edf00 <_Znwm@plt>
- 0xecebb3: mov    rcx,QWORD PTR [rsp+0x1d8]
      eceb93:	49 8d bc 24 18 01 00 	lea    rdi,[r12+0x118]
      eceb9a:	00 
      eceb9b:	48 8d 35 94 13 49 ff 	lea    rsi,[rip+0xffffffffff491394]        # 35ff36 <_ZTSSt12bad_any_cast@@Base-0x30292>
      eceba2:	6a 13                	push   0x13
      eceba4:	5a                   	pop    rdx
      eceba5:	e8 70 de bc ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      ecebaa:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      ecebaf:	49 83 c6 18          	add    r14,0x18
      ecebb3:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
      ecebba:	00 
      ecebbb:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ecebbf:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
      ecebc2:	41 0f 11 87 30 01 00 	movups XMMWORD PTR [r15+0x130],xmm0
      ecebc9:	00 
      ecebca:	48 85 c0             	test   rax,rax
      ecebcd:	74 05                	je     ecebd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95fea>
      ecebcf:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ecebd4:	49 83 a7 40 01 00 00 	and    QWORD PTR [r15+0x140],0x0
      ecebdb:	00 
      ecebdc:	31 ff                	xor    edi,edi
      ecebde:	e8 39 f8 bc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ecebe3:	4c 89 b3 18 02 00 00 	mov    QWORD PTR [rbx+0x218],r14
      ecebea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

