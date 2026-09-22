# Corrected e8fad0 readiness-constructor ABI map

At 0xe8d9ad the caller executes sub rsp,0x8 for alignment. From there to the call at 0xe8dba7 there are 61 push instructions.
The callee cleanup is 0x1f0 = 0x8 alignment + 61 *8 bytes.
Therefore the first post-padding push is the highest stack argument and the last push is arg7.

Highest argument number: 67

## Callee field -> corrected argument mapping
- owner+0x428 readiness input: callee [rsp+0xb40] -> arg47
- owner+0x3b8 provider: callee [rsp+0xb68] -> arg52
- owner+0x470 source pair pointer: callee [rsp+0xb78] -> arg54
- owner+0x570 dependency: callee [rsp+0xbc0] -> arg63
- owner+0x598 state/control: callee [rsp+0xbe0] -> arg67

## Full post-padding stack argument map
- arg07: 0xe8dba0: QWORD PTR [rsp+0x2d0]; value from aligned-S0+0xf0
- arg08: 0xe8db9f: rax; last-def: lea    rax,[rsp+0x680] => based on aligned-S0+0x4a8
- arg09: 0xe8db90: QWORD PTR [rsp+0x210]; value from aligned-S0+0x40
- arg10: 0xe8db89: QWORD PTR [rsp+0x340]; value from aligned-S0+0x178
- arg11: 0xe8db87: r11; 
- arg12: 0xe8db80: QWORD PTR [rsp+0x268]; value from aligned-S0+0xb0
- arg13: 0xe8db7f: rax; last-def: lea    rax,[rsp+0x738] => based on aligned-S0+0x588
- arg14: 0xe8db76: rax; last-def: lea    rax,[rsp+0x5a0] => based on aligned-S0+0x3f8
- arg15: 0xe8db67: QWORD PTR [rsp+0x1b8]; value from aligned-S0+0x18
- arg16: 0xe8db66: rax; last-def: lea    rax,[rsp+0x578] => based on aligned-S0+0x3e0
- arg17: 0xe8db57: QWORD PTR [rsp+0x218]; value from aligned-S0+0x88
- arg18: 0xe8db50: QWORD PTR [rsp+0x200]; value from aligned-S0+0x78
- arg19: 0xe8db49: QWORD PTR [rsp+0x308]; value from aligned-S0+0x188
- arg20: 0xe8db42: QWORD PTR [rsp+0x318]; value from aligned-S0+0x1a0
- arg21: 0xe8db3b: QWORD PTR [rsp+0x1e0]; value from aligned-S0+0x70
- arg22: 0xe8db3a: rax; last-def: lea    rax,[rsp+0x640] => based on aligned-S0+0x4d8
- arg23: 0xe8db2b: QWORD PTR [rsp+0x1a8]; value from aligned-S0+0x48
- arg24: 0xe8db2a: rax; last-def: lea    rax,[rsp+0x460] => based on aligned-S0+0x308
- arg25: 0xe8db1b: QWORD PTR [rsp+0x2c0]; value from aligned-S0+0x170
- arg26: 0xe8db1a: rax; last-def: lea    rax,[rsp+0x8e0] => based on aligned-S0+0x798
- arg27: 0xe8db11: rax; last-def: lea    rax,[rsp+0x5e0] => based on aligned-S0+0x4a0
- arg28: 0xe8db08: rax; last-def: lea    rax,[rsp+0x5c8] => based on aligned-S0+0x490
- arg29: 0xe8daff: rax; last-def: lea    rax,[rsp+0x898] => based on aligned-S0+0x768
- arg30: 0xe8daf6: rax; last-def: lea    rax,[rsp+0x740] => based on aligned-S0+0x618
- arg31: 0xe8dae7: QWORD PTR [rsp+0x2b8]; value from aligned-S0+0x198
- arg32: 0xe8dae0: QWORD PTR [rsp+0x278]; value from aligned-S0+0x160
- arg33: 0xe8dad9: QWORD PTR [rsp+0x268]; value from aligned-S0+0x158
- arg34: 0xe8dad2: QWORD PTR [rsp+0x130]; value from aligned-S0+0x28
- arg35: 0xe8dad1: rax; last-def: lea    rax,[rsp+0x4c8] => based on aligned-S0+0x3c8
- arg36: 0xe8dac8: rax; last-def: lea    rax,[rsp+0x5e8] => based on aligned-S0+0x4f0
- arg37: 0xe8dab9: QWORD PTR [rsp+0x1e8]; value from aligned-S0+0xf8
- arg38: 0xe8dab8: rax; last-def: lea    rax,[rsp+0x498] => based on aligned-S0+0x3b0
- arg39: 0xe8daa9: QWORD PTR [rsp+0x1b8]; value from aligned-S0+0xd8
- arg40: 0xe8daa8: rax; last-def: lea    rax,[rsp+0x460] => based on aligned-S0+0x388
- arg41: 0xe8da9f: rax; last-def: lea    rax,[rsp+0x448] => based on aligned-S0+0x378
- arg42: 0xe8da96: rax; last-def: lea    rax,[rsp+0x530] => based on aligned-S0+0x468
- arg43: 0xe8da8d: rax; last-def: lea    rax,[rsp+0x518] => based on aligned-S0+0x458
- arg44: 0xe8da84: rbx; 
- arg45: 0xe8da7d: QWORD PTR [rsp+0x118]; value from aligned-S0+0x68
- arg46: 0xe8da76: QWORD PTR [rsp+0x140]; value from aligned-S0+0x98
- arg47: 0xe8da6f: QWORD PTR [rsp+0x130]; value from aligned-S0+0x90  <-- owner+0x428 readiness input
- arg48: 0xe8da6e: rax; last-def: lea    rax,[rsp+0x430] => based on aligned-S0+0x398
- arg49: 0xe8da5f: QWORD PTR [rsp+0x1e0]; value from aligned-S0+0x150
- arg50: 0xe8da58: QWORD PTR [rsp+0xc0]; value from aligned-S0+0x38
- arg51: 0xe8da57: rax; last-def: lea    rax,[rsp+0x538] => based on aligned-S0+0x4b8
- arg52: 0xe8da48: QWORD PTR [rsp+0x1c0]; value from aligned-S0+0x148  <-- owner+0x3b8 provider
- arg53: 0xe8da46: r13; last-def: lea    r13,[rsp+0x448] => based on aligned-S0+0x448
- arg54: 0xe8da3f: QWORD PTR [rsp+0xc0]; value from aligned-S0+0x58  <-- owner+0x470 source pair pointer
- arg55: 0xe8da3e: rax; last-def: lea    rax,[rsp+0x2f8] => based on aligned-S0+0x298
- arg56: 0xe8da35: rax; last-def: lea    rax,[rsp+0x220] => based on aligned-S0+0x1c8
- arg57: 0xe8da2c: rax; last-def: lea    rax,[rsp+0x3b0] => based on aligned-S0+0x360
- arg58: 0xe8da22: r15; 
- arg59: 0xe8da20: r12; 
- arg60: 0xe8da1f: rbp; 
- arg61: 0xe8da1e: rax; last-def: lea    rax,[rsp+0x218] => based on aligned-S0+0x1e8
- arg62: 0xe8da0f: QWORD PTR [rsp+0x110]; value from aligned-S0+0xe8
- arg63: 0xe8da08: QWORD PTR [rsp+0xc8]; value from aligned-S0+0xa8  <-- owner+0x570 dependency
- arg64: 0xe8da01: QWORD PTR [rsp+0xf8]; value from aligned-S0+0xe0
- arg65: 0xe8d9ff: r10; last-def: lea    r10,[rsp+0x418] => based on aligned-S0+0x418
- arg66: 0xe8d9f8: QWORD PTR [rsp+0xd8]; value from aligned-S0+0xd0
- arg67: 0xe8d9f7: rax;   <-- owner+0x598 state/control

## arg47: owner+0x428 readiness input
- push @0xe8da6f: QWORD PTR [rsp+0x130]
- normalized: value from aligned-S0+0x90
Context:
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

## arg52: owner+0x3b8 provider
- push @0xe8da48: QWORD PTR [rsp+0x1c0]
- normalized: value from aligned-S0+0x148
Context:
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

## arg54: owner+0x470 source pair pointer
- push @0xe8da3f: QWORD PTR [rsp+0xc0]
- normalized: value from aligned-S0+0x58
Context:
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

## arg63: owner+0x570 dependency
- push @0xe8da08: QWORD PTR [rsp+0xc8]
- normalized: value from aligned-S0+0xa8
Context:
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

## arg67: owner+0x598 state/control
- push @0xe8d9f7: rax
- normalized: 
Context:
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

## Pre-push producer window
  e8d881:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d884:	48 89 c7             	mov    rdi,rax
  e8d887:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  e8d88a:	49 89 c4             	mov    r12,rax
  e8d88d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d891:	4c 89 ef             	mov    rdi,r13
  e8d894:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d897:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d89a:	48 89 c7             	mov    rdi,rax
  e8d89d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
  e8d8a0:	48 89 c3             	mov    rbx,rax
  e8d8a3:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8a7:	4c 89 ef             	mov    rdi,r13
  e8d8aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8ad:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8b0:	48 89 c7             	mov    rdi,rax
  e8d8b3:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  e8d8b6:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  e8d8bd:	00 
  e8d8be:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  e8d8c2:	4c 89 ef             	mov    rdi,r13
  e8d8c5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8d8c8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8d8cb:	48 89 c7             	mov    rdi,rax
  e8d8ce:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8d8d1:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  e8d8d8:	00 
  e8d8d9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
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
