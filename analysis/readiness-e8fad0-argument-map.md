# e8fad0 readiness-constructor argument map

The caller removes 0x1f0 bytes after e8fad0, exactly 62 stack arguments (args 7..68).
Chronological push #1 is arg68; push #62 is arg7.

## Full stack-argument map
- arg07: push @0xe8dba0: QWORD PTR [rsp+0x2d0]; value from S0+0xe8
- arg08: push @0xe8db9f: rax; last-def: lea    rax,[rsp+0x680] => pointer/value based on S0+0x4a0
- arg09: push @0xe8db90: QWORD PTR [rsp+0x210]; value from S0+0x38
- arg10: push @0xe8db89: QWORD PTR [rsp+0x340]; value from S0+0x170
- arg11: push @0xe8db87: r11; 
- arg12: push @0xe8db80: QWORD PTR [rsp+0x268]; value from S0+0xa8
- arg13: push @0xe8db7f: rax; last-def: lea    rax,[rsp+0x738] => pointer/value based on S0+0x580
- arg14: push @0xe8db76: rax; last-def: lea    rax,[rsp+0x5a0] => pointer/value based on S0+0x3f0
- arg15: push @0xe8db67: QWORD PTR [rsp+0x1b8]; value from S0+0x10
- arg16: push @0xe8db66: rax; last-def: lea    rax,[rsp+0x578] => pointer/value based on S0+0x3d8
- arg17: push @0xe8db57: QWORD PTR [rsp+0x218]; value from S0+0x80
- arg18: push @0xe8db50: QWORD PTR [rsp+0x200]; value from S0+0x70
- arg19: push @0xe8db49: QWORD PTR [rsp+0x308]; value from S0+0x180
- arg20: push @0xe8db42: QWORD PTR [rsp+0x318]; value from S0+0x198
- arg21: push @0xe8db3b: QWORD PTR [rsp+0x1e0]; value from S0+0x68
- arg22: push @0xe8db3a: rax; last-def: lea    rax,[rsp+0x640] => pointer/value based on S0+0x4d0
- arg23: push @0xe8db2b: QWORD PTR [rsp+0x1a8]; value from S0+0x40
- arg24: push @0xe8db2a: rax; last-def: lea    rax,[rsp+0x460] => pointer/value based on S0+0x300
- arg25: push @0xe8db1b: QWORD PTR [rsp+0x2c0]; value from S0+0x168
- arg26: push @0xe8db1a: rax; last-def: lea    rax,[rsp+0x8e0] => pointer/value based on S0+0x790
- arg27: push @0xe8db11: rax; last-def: lea    rax,[rsp+0x5e0] => pointer/value based on S0+0x498
- arg28: push @0xe8db08: rax; last-def: lea    rax,[rsp+0x5c8] => pointer/value based on S0+0x488
- arg29: push @0xe8daff: rax; last-def: lea    rax,[rsp+0x898] => pointer/value based on S0+0x760
- arg30: push @0xe8daf6: rax; last-def: lea    rax,[rsp+0x740] => pointer/value based on S0+0x610
- arg31: push @0xe8dae7: QWORD PTR [rsp+0x2b8]; value from S0+0x190
- arg32: push @0xe8dae0: QWORD PTR [rsp+0x278]; value from S0+0x158
- arg33: push @0xe8dad9: QWORD PTR [rsp+0x268]; value from S0+0x150
- arg34: push @0xe8dad2: QWORD PTR [rsp+0x130]; value from S0+0x20
- arg35: push @0xe8dad1: rax; last-def: lea    rax,[rsp+0x4c8] => pointer/value based on S0+0x3c0
- arg36: push @0xe8dac8: rax; last-def: lea    rax,[rsp+0x5e8] => pointer/value based on S0+0x4e8
- arg37: push @0xe8dab9: QWORD PTR [rsp+0x1e8]; value from S0+0xf0
- arg38: push @0xe8dab8: rax; last-def: lea    rax,[rsp+0x498] => pointer/value based on S0+0x3a8
- arg39: push @0xe8daa9: QWORD PTR [rsp+0x1b8]; value from S0+0xd0
- arg40: push @0xe8daa8: rax; last-def: lea    rax,[rsp+0x460] => pointer/value based on S0+0x380
- arg41: push @0xe8da9f: rax; last-def: lea    rax,[rsp+0x448] => pointer/value based on S0+0x370
- arg42: push @0xe8da96: rax; last-def: lea    rax,[rsp+0x530] => pointer/value based on S0+0x460
- arg43: push @0xe8da8d: rax; last-def: lea    rax,[rsp+0x518] => pointer/value based on S0+0x450
- arg44: push @0xe8da84: rbx; 
- arg45: push @0xe8da7d: QWORD PTR [rsp+0x118]; value from S0+0x60
- arg46: push @0xe8da76: QWORD PTR [rsp+0x140]; value from S0+0x90
- arg47: push @0xe8da6f: QWORD PTR [rsp+0x130]; value from S0+0x88  <-- owner+0x428 readiness wrapper
- arg48: push @0xe8da6e: rax; last-def: lea    rax,[rsp+0x430] => pointer/value based on S0+0x390
- arg49: push @0xe8da5f: QWORD PTR [rsp+0x1e0]; value from S0+0x148
- arg50: push @0xe8da58: QWORD PTR [rsp+0xc0]; value from S0+0x30
- arg51: push @0xe8da57: rax; last-def: lea    rax,[rsp+0x538] => pointer/value based on S0+0x4b0
- arg52: push @0xe8da48: QWORD PTR [rsp+0x1c0]; value from S0+0x140  <-- owner+0x3b8 provider
- arg53: push @0xe8da46: r13; 
- arg54: push @0xe8da3f: QWORD PTR [rsp+0xc0]; value from S0+0x50  <-- owner+0x470 state pair
- arg55: push @0xe8da3e: rax; last-def: lea    rax,[rsp+0x2f8] => pointer/value based on S0+0x290
- arg56: push @0xe8da35: rax; last-def: lea    rax,[rsp+0x220] => pointer/value based on S0+0x1c0
- arg57: push @0xe8da2c: rax; last-def: lea    rax,[rsp+0x3b0] => pointer/value based on S0+0x358
- arg58: push @0xe8da22: r15; 
- arg59: push @0xe8da20: r12; 
- arg60: push @0xe8da1f: rbp; 
- arg61: push @0xe8da1e: rax; last-def: lea    rax,[rsp+0x218] => pointer/value based on S0+0x1e0
- arg62: push @0xe8da0f: QWORD PTR [rsp+0x110]; value from S0+0xe0
- arg63: push @0xe8da08: QWORD PTR [rsp+0xc8]; value from S0+0xa0  <-- owner+0x570 dependency
- arg64: push @0xe8da01: QWORD PTR [rsp+0xf8]; value from S0+0xd8
- arg65: push @0xe8d9ff: r10; 
- arg66: push @0xe8d9f8: QWORD PTR [rsp+0xd8]; value from S0+0xc8
- arg67: push @0xe8d9f7: rax;   <-- owner+0x598 state/control
- arg68: push @0xe8d7bc: 0x30; 

## arg47: owner+0x428 readiness wrapper
push @0xe8da6f: QWORD PTR [rsp+0x130]
value from S0+0x88
Context:
  e8da2c:	50                   	push   rax
  e8da2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
  e8da34:	00 
  e8da35:	50                   	push   rax
  e8da36:	48 8d 84 24 f8 02 00 	lea    rax,[rsp+0x2f8]
  e8da3d:	00 
  e8da3e:	50                   	push   rax
  e8da3f:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da46:	41 55                	push   r13
  e8da48:	ff b4 24 c0 01 00 00 	push   QWORD PTR [rsp+0x1c0]
  e8da4f:	48 8d 84 24 38 05 00 	lea    rax,[rsp+0x538]
  e8da56:	00 
  e8da57:	50                   	push   rax
  e8da58:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da5f:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
  e8da66:	48 8d 84 24 30 04 00 	lea    rax,[rsp+0x430]
  e8da6d:	00 
  e8da6e:	50                   	push   rax
  e8da6f:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]
  e8da76:	ff b4 24 40 01 00 00 	push   QWORD PTR [rsp+0x140]
  e8da7d:	ff b4 24 18 01 00 00 	push   QWORD PTR [rsp+0x118]
  e8da84:	53                   	push   rbx
  e8da85:	48 8d 84 24 18 05 00 	lea    rax,[rsp+0x518]
  e8da8c:	00 
  e8da8d:	50                   	push   rax
  e8da8e:	48 8d 84 24 30 05 00 	lea    rax,[rsp+0x530]
  e8da95:	00 
  e8da96:	50                   	push   rax
  e8da97:	48 8d 84 24 48 04 00 	lea    rax,[rsp+0x448]
  e8da9e:	00 

## arg52: owner+0x3b8 provider
push @0xe8da48: QWORD PTR [rsp+0x1c0]
value from S0+0x140
Context:
  e8da0f:	ff b4 24 10 01 00 00 	push   QWORD PTR [rsp+0x110]
  e8da16:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
  e8da1d:	00 
  e8da1e:	50                   	push   rax
  e8da1f:	55                   	push   rbp
  e8da20:	41 54                	push   r12
  e8da22:	41 57                	push   r15
  e8da24:	48 8d 84 24 b0 03 00 	lea    rax,[rsp+0x3b0]
  e8da2b:	00 
  e8da2c:	50                   	push   rax
  e8da2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
  e8da34:	00 
  e8da35:	50                   	push   rax
  e8da36:	48 8d 84 24 f8 02 00 	lea    rax,[rsp+0x2f8]
  e8da3d:	00 
  e8da3e:	50                   	push   rax
  e8da3f:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da46:	41 55                	push   r13
  e8da48:	ff b4 24 c0 01 00 00 	push   QWORD PTR [rsp+0x1c0]
  e8da4f:	48 8d 84 24 38 05 00 	lea    rax,[rsp+0x538]
  e8da56:	00 
  e8da57:	50                   	push   rax
  e8da58:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da5f:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
  e8da66:	48 8d 84 24 30 04 00 	lea    rax,[rsp+0x430]
  e8da6d:	00 
  e8da6e:	50                   	push   rax
  e8da6f:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]
  e8da76:	ff b4 24 40 01 00 00 	push   QWORD PTR [rsp+0x140]
  e8da7d:	ff b4 24 18 01 00 00 	push   QWORD PTR [rsp+0x118]

## arg54: owner+0x470 state pair
push @0xe8da3f: QWORD PTR [rsp+0xc0]
value from S0+0x50
Context:
  e8da01:	ff b4 24 f8 00 00 00 	push   QWORD PTR [rsp+0xf8]
  e8da08:	ff b4 24 c8 00 00 00 	push   QWORD PTR [rsp+0xc8]
  e8da0f:	ff b4 24 10 01 00 00 	push   QWORD PTR [rsp+0x110]
  e8da16:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
  e8da1d:	00 
  e8da1e:	50                   	push   rax
  e8da1f:	55                   	push   rbp
  e8da20:	41 54                	push   r12
  e8da22:	41 57                	push   r15
  e8da24:	48 8d 84 24 b0 03 00 	lea    rax,[rsp+0x3b0]
  e8da2b:	00 
  e8da2c:	50                   	push   rax
  e8da2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
  e8da34:	00 
  e8da35:	50                   	push   rax
  e8da36:	48 8d 84 24 f8 02 00 	lea    rax,[rsp+0x2f8]
  e8da3d:	00 
  e8da3e:	50                   	push   rax
  e8da3f:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da46:	41 55                	push   r13
  e8da48:	ff b4 24 c0 01 00 00 	push   QWORD PTR [rsp+0x1c0]
  e8da4f:	48 8d 84 24 38 05 00 	lea    rax,[rsp+0x538]
  e8da56:	00 
  e8da57:	50                   	push   rax
  e8da58:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da5f:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
  e8da66:	48 8d 84 24 30 04 00 	lea    rax,[rsp+0x430]
  e8da6d:	00 
  e8da6e:	50                   	push   rax
  e8da6f:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]

## arg63: owner+0x570 dependency
push @0xe8da08: QWORD PTR [rsp+0xc8]
value from S0+0xa0
Context:
  e8d9c0:	00 
  e8d9c1:	44 0f b6 9c 24 c8 00 	movzx  r11d,BYTE PTR [rsp+0xc8]
  e8d9c8:	00 00 
  e8d9ca:	48 8d bc 24 48 06 00 	lea    rdi,[rsp+0x648]
  e8d9d1:	00 
  e8d9d2:	4c 8b 84 24 80 00 00 	mov    r8,QWORD PTR [rsp+0x80]
  e8d9d9:	00 
  e8d9da:	4c 8b 8c 24 80 01 00 	mov    r9,QWORD PTR [rsp+0x180]
  e8d9e1:	00 
  e8d9e2:	48 8b b4 24 90 01 00 	mov    rsi,QWORD PTR [rsp+0x190]
  e8d9e9:	00 
  e8d9ea:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
  e8d9f1:	00 
  e8d9f2:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
  e8d9f7:	50                   	push   rax
  e8d9f8:	ff b4 24 d8 00 00 00 	push   QWORD PTR [rsp+0xd8]
  e8d9ff:	41 52                	push   r10
  e8da01:	ff b4 24 f8 00 00 00 	push   QWORD PTR [rsp+0xf8]
  e8da08:	ff b4 24 c8 00 00 00 	push   QWORD PTR [rsp+0xc8]
  e8da0f:	ff b4 24 10 01 00 00 	push   QWORD PTR [rsp+0x110]
  e8da16:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
  e8da1d:	00 
  e8da1e:	50                   	push   rax
  e8da1f:	55                   	push   rbp
  e8da20:	41 54                	push   r12
  e8da22:	41 57                	push   r15
  e8da24:	48 8d 84 24 b0 03 00 	lea    rax,[rsp+0x3b0]
  e8da2b:	00 
  e8da2c:	50                   	push   rax
  e8da2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]

## arg67: owner+0x598 state/control
push @0xe8d9f7: rax

Context:
  e8d9ad:	48 83 ec 08          	sub    rsp,0x8
  e8d9b1:	4c 8d 94 24 18 04 00 	lea    r10,[rsp+0x418]
  e8d9b8:	00 
  e8d9b9:	4c 8d ac 24 48 04 00 	lea    r13,[rsp+0x448]
  e8d9c0:	00 
  e8d9c1:	44 0f b6 9c 24 c8 00 	movzx  r11d,BYTE PTR [rsp+0xc8]
  e8d9c8:	00 00 
  e8d9ca:	48 8d bc 24 48 06 00 	lea    rdi,[rsp+0x648]
  e8d9d1:	00 
  e8d9d2:	4c 8b 84 24 80 00 00 	mov    r8,QWORD PTR [rsp+0x80]
  e8d9d9:	00 
  e8d9da:	4c 8b 8c 24 80 01 00 	mov    r9,QWORD PTR [rsp+0x180]
  e8d9e1:	00 
  e8d9e2:	48 8b b4 24 90 01 00 	mov    rsi,QWORD PTR [rsp+0x190]
  e8d9e9:	00 
  e8d9ea:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
  e8d9f1:	00 
  e8d9f2:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
  e8d9f7:	50                   	push   rax
  e8d9f8:	ff b4 24 d8 00 00 00 	push   QWORD PTR [rsp+0xd8]
  e8d9ff:	41 52                	push   r10
  e8da01:	ff b4 24 f8 00 00 00 	push   QWORD PTR [rsp+0xf8]
  e8da08:	ff b4 24 c8 00 00 00 	push   QWORD PTR [rsp+0xc8]
  e8da0f:	ff b4 24 10 01 00 00 	push   QWORD PTR [rsp+0x110]
  e8da16:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
  e8da1d:	00 
  e8da1e:	50                   	push   rax
  e8da1f:	55                   	push   rbp
  e8da20:	41 54                	push   r12
  e8da22:	41 57                	push   r15

## Exact call tail
  e8d8dd:	4c 89 ef             	mov    rdi,r13
  e8d8e0:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8e6:	48 89 c7             	mov    rdi,rax
  e8d8e9:	ff 51 40             	call   QWORD PTR [rcx+0x40]
  e8d8ec:	48 89 84 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rax
  e8d8f3:	00 
  e8d8f4:	49 8b 86 48 01 00 00 	mov    rax,QWORD PTR [r14+0x148]
  e8d8fb:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
  e8d902:	00 
  e8d903:	66 0f 6f 84 24 10 01 	movdqa xmm0,XMMWORD PTR [rsp+0x110]
  e8d90a:	00 00 
  e8d90c:	66 0f 7f 84 24 40 04 	movdqa XMMWORD PTR [rsp+0x440],xmm0
  e8d913:	00 00 
  e8d915:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
  e8d91c:	48 85 c0             	test   rax,rax
  e8d91f:	74 05                	je     e8d926 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54d3c>
  e8d921:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8d926:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
  e8d92b:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
  e8d932:	00 
  e8d933:	48 8b bc 24 a8 01 00 	mov    rdi,QWORD PTR [rsp+0x1a8]
  e8d93a:	00 
  e8d93b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e8d93e:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e8d941:	49 89 c7             	mov    r15,rax
  e8d944:	4c 89 e3             	mov    rbx,r12
  e8d947:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
  e8d94c:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d950:	48 8d bc 24 30 04 00 	lea    rdi,[rsp+0x430]
  e8d957:	00 
  e8d958:	48 89 ee             	mov    rsi,rbp
  e8d95b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d95e:	4c 8b a4 24 30 04 00 	mov    r12,QWORD PTR [rsp+0x430]
  e8d965:	00 
  e8d966:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
  e8d96a:	48 89 ee             	mov    rsi,rbp
  e8d96d:	48 8d ac 24 20 04 00 	lea    rbp,[rsp+0x420]
  e8d974:	00 
  e8d975:	48 89 ef             	mov    rdi,rbp
  e8d978:	ff 50 50             	call   QWORD PTR [rax+0x50]
  e8d97b:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
  e8d982:	00 00 
  e8d984:	66 0f 7f 84 24 10 04 	movdqa XMMWORD PTR [rsp+0x410],xmm0
  e8d98b:	00 00 
  e8d98d:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
  e8d994:	48 85 c0             	test   rax,rax
  e8d997:	74 05                	je     e8d99e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54db4>
  e8d999:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e8d99e:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  e8d9a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d9a7:	4c 89 ef             	mov    rdi,r13
  e8d9aa:	ff 50 68             	call   QWORD PTR [rax+0x68]
  e8d9ad:	48 83 ec 08          	sub    rsp,0x8
  e8d9b1:	4c 8d 94 24 18 04 00 	lea    r10,[rsp+0x418]
  e8d9b8:	00 
  e8d9b9:	4c 8d ac 24 48 04 00 	lea    r13,[rsp+0x448]
  e8d9c0:	00 
  e8d9c1:	44 0f b6 9c 24 c8 00 	movzx  r11d,BYTE PTR [rsp+0xc8]
  e8d9c8:	00 00 
  e8d9ca:	48 8d bc 24 48 06 00 	lea    rdi,[rsp+0x648]
  e8d9d1:	00 
  e8d9d2:	4c 8b 84 24 80 00 00 	mov    r8,QWORD PTR [rsp+0x80]
  e8d9d9:	00 
  e8d9da:	4c 8b 8c 24 80 01 00 	mov    r9,QWORD PTR [rsp+0x180]
  e8d9e1:	00 
  e8d9e2:	48 8b b4 24 90 01 00 	mov    rsi,QWORD PTR [rsp+0x190]
  e8d9e9:	00 
  e8d9ea:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
  e8d9f1:	00 
  e8d9f2:	48 8b 4c 24 50       	mov    rcx,QWORD PTR [rsp+0x50]
  e8d9f7:	50                   	push   rax
  e8d9f8:	ff b4 24 d8 00 00 00 	push   QWORD PTR [rsp+0xd8]
  e8d9ff:	41 52                	push   r10
  e8da01:	ff b4 24 f8 00 00 00 	push   QWORD PTR [rsp+0xf8]
  e8da08:	ff b4 24 c8 00 00 00 	push   QWORD PTR [rsp+0xc8]
  e8da0f:	ff b4 24 10 01 00 00 	push   QWORD PTR [rsp+0x110]
  e8da16:	48 8d 84 24 18 02 00 	lea    rax,[rsp+0x218]
  e8da1d:	00 
  e8da1e:	50                   	push   rax
  e8da1f:	55                   	push   rbp
  e8da20:	41 54                	push   r12
  e8da22:	41 57                	push   r15
  e8da24:	48 8d 84 24 b0 03 00 	lea    rax,[rsp+0x3b0]
  e8da2b:	00 
  e8da2c:	50                   	push   rax
  e8da2d:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
  e8da34:	00 
  e8da35:	50                   	push   rax
  e8da36:	48 8d 84 24 f8 02 00 	lea    rax,[rsp+0x2f8]
  e8da3d:	00 
  e8da3e:	50                   	push   rax
  e8da3f:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da46:	41 55                	push   r13
  e8da48:	ff b4 24 c0 01 00 00 	push   QWORD PTR [rsp+0x1c0]
  e8da4f:	48 8d 84 24 38 05 00 	lea    rax,[rsp+0x538]
  e8da56:	00 
  e8da57:	50                   	push   rax
  e8da58:	ff b4 24 c0 00 00 00 	push   QWORD PTR [rsp+0xc0]
  e8da5f:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
  e8da66:	48 8d 84 24 30 04 00 	lea    rax,[rsp+0x430]
  e8da6d:	00 
  e8da6e:	50                   	push   rax
  e8da6f:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]
  e8da76:	ff b4 24 40 01 00 00 	push   QWORD PTR [rsp+0x140]
  e8da7d:	ff b4 24 18 01 00 00 	push   QWORD PTR [rsp+0x118]
  e8da84:	53                   	push   rbx
  e8da85:	48 8d 84 24 18 05 00 	lea    rax,[rsp+0x518]
  e8da8c:	00 
  e8da8d:	50                   	push   rax
  e8da8e:	48 8d 84 24 30 05 00 	lea    rax,[rsp+0x530]
  e8da95:	00 
  e8da96:	50                   	push   rax
  e8da97:	48 8d 84 24 48 04 00 	lea    rax,[rsp+0x448]
  e8da9e:	00 
  e8da9f:	50                   	push   rax
  e8daa0:	48 8d 84 24 60 04 00 	lea    rax,[rsp+0x460]
  e8daa7:	00 
  e8daa8:	50                   	push   rax
  e8daa9:	ff b4 24 b8 01 00 00 	push   QWORD PTR [rsp+0x1b8]
  e8dab0:	48 8d 84 24 98 04 00 	lea    rax,[rsp+0x498]
  e8dab7:	00 
  e8dab8:	50                   	push   rax
  e8dab9:	ff b4 24 e8 01 00 00 	push   QWORD PTR [rsp+0x1e8]
  e8dac0:	48 8d 84 24 e8 05 00 	lea    rax,[rsp+0x5e8]
  e8dac7:	00 
  e8dac8:	50                   	push   rax
  e8dac9:	48 8d 84 24 c8 04 00 	lea    rax,[rsp+0x4c8]
  e8dad0:	00 
  e8dad1:	50                   	push   rax
  e8dad2:	ff b4 24 30 01 00 00 	push   QWORD PTR [rsp+0x130]
  e8dad9:	ff b4 24 68 02 00 00 	push   QWORD PTR [rsp+0x268]
  e8dae0:	ff b4 24 78 02 00 00 	push   QWORD PTR [rsp+0x278]
  e8dae7:	ff b4 24 b8 02 00 00 	push   QWORD PTR [rsp+0x2b8]
  e8daee:	48 8d 84 24 40 07 00 	lea    rax,[rsp+0x740]
  e8daf5:	00 
  e8daf6:	50                   	push   rax
  e8daf7:	48 8d 84 24 98 08 00 	lea    rax,[rsp+0x898]
  e8dafe:	00 
  e8daff:	50                   	push   rax
  e8db00:	48 8d 84 24 c8 05 00 	lea    rax,[rsp+0x5c8]
  e8db07:	00 
  e8db08:	50                   	push   rax
  e8db09:	48 8d 84 24 e0 05 00 	lea    rax,[rsp+0x5e0]
  e8db10:	00 
  e8db11:	50                   	push   rax
  e8db12:	48 8d 84 24 e0 08 00 	lea    rax,[rsp+0x8e0]
  e8db19:	00 
  e8db1a:	50                   	push   rax
  e8db1b:	ff b4 24 c0 02 00 00 	push   QWORD PTR [rsp+0x2c0]
  e8db22:	48 8d 84 24 60 04 00 	lea    rax,[rsp+0x460]
  e8db29:	00 
  e8db2a:	50                   	push   rax
  e8db2b:	ff b4 24 a8 01 00 00 	push   QWORD PTR [rsp+0x1a8]
  e8db32:	48 8d 84 24 40 06 00 	lea    rax,[rsp+0x640]
  e8db39:	00 
  e8db3a:	50                   	push   rax
  e8db3b:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
  e8db42:	ff b4 24 18 03 00 00 	push   QWORD PTR [rsp+0x318]
  e8db49:	ff b4 24 08 03 00 00 	push   QWORD PTR [rsp+0x308]
  e8db50:	ff b4 24 00 02 00 00 	push   QWORD PTR [rsp+0x200]
  e8db57:	ff b4 24 18 02 00 00 	push   QWORD PTR [rsp+0x218]
  e8db5e:	48 8d 84 24 78 05 00 	lea    rax,[rsp+0x578]
  e8db65:	00 
  e8db66:	50                   	push   rax
  e8db67:	ff b4 24 b8 01 00 00 	push   QWORD PTR [rsp+0x1b8]
  e8db6e:	48 8d 84 24 a0 05 00 	lea    rax,[rsp+0x5a0]
  e8db75:	00 
  e8db76:	50                   	push   rax
  e8db77:	48 8d 84 24 38 07 00 	lea    rax,[rsp+0x738]
  e8db7e:	00 
  e8db7f:	50                   	push   rax
  e8db80:	ff b4 24 68 02 00 00 	push   QWORD PTR [rsp+0x268]
  e8db87:	41 53                	push   r11
  e8db89:	ff b4 24 40 03 00 00 	push   QWORD PTR [rsp+0x340]
  e8db90:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
  e8db97:	48 8d 84 24 80 06 00 	lea    rax,[rsp+0x680]
  e8db9e:	00 
  e8db9f:	50                   	push   rax
  e8dba0:	ff b4 24 d0 02 00 00 	push   QWORD PTR [rsp+0x2d0]
  e8dba7:	e8 24 1f 00 00       	call   e8fad0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ee6>
  e8dbac:	48 81 c4 f0 01 00 00 	add    rsp,0x1f0
  e8dbb3:	48 8d 9c 24 40 06 00 	lea    rbx,[rsp+0x640]
