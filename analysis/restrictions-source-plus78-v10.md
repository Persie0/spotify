# Restrictions erased source virtual `+0x78` trace v10

Focus: concrete provenance for the `e99c96 call [source.vtable+0x78]` erased-interface bridge. Static analysis only.

## e99c96 local bridge window

```text
  e99be2:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  e99be6:	48 83 c4 08          	add    rsp,0x8
  e99bea:	5b                   	pop    rbx
  e99beb:	41 5c                	pop    r12
  e99bed:	41 5d                	pop    r13
  e99bef:	41 5e                	pop    r14
  e99bf1:	41 5f                	pop    r15
  e99bf3:	5d                   	pop    rbp
  e99bf4:	c3                   	ret
  e99bf5:	e8 c6 a9 b6 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
  e99bfa:	e8 e0 1a be ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
  e99bff:	cc                   	int3
  e99c00:	48 8d 35 67 a4 53 ff 	lea    rsi,[rip+0xffffffffff53a467]        # 3d406e <_ZTSN5boost17bad_function_callE@@Base+0x13b4>
  e99c07:	48 8d 0d 72 a4 53 ff 	lea    rcx,[rip+0xffffffffff53a472]        # 3d4080 <_ZTSN5boost17bad_function_callE@@Base+0x13c6>
  e99c0e:	6a 0b                	push   0xb
  e99c10:	5a                   	pop    rdx
  e99c11:	6a 11                	push   0x11
  e99c13:	41 58                	pop    r8
  e99c15:	45 31 c9             	xor    r9d,r9d
  e99c18:	e9 6d d7 74 00       	jmp    15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e99c1d:	cc                   	int3
  e99c1e:	53                   	push   rbx
  e99c1f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  e99c22:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99c26:	48 85 db             	test   rbx,rbx
  e99c29:	74 27                	je     e99c52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61068>
  e99c2b:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  e99c32:	e8 0f 7b 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  e99c37:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
  e99c3b:	e8 2a 03 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e99c40:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  e99c44:	e8 21 03 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e99c49:	48 89 df             	mov    rdi,rbx
  e99c4c:	5b                   	pop    rbx
  e99c4d:	e9 ce 42 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e99c52:	5b                   	pop    rbx
  e99c53:	c3                   	ret
  e99c54:	41 56                	push   r14
  e99c56:	53                   	push   rbx
  e99c57:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99c5e:	48 89 fb             	mov    rbx,rdi
  e99c61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99c68:	00 00
  e99c6a:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99c71:	00
  e99c72:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e99c77:	4c 89 f7             	mov    rdi,r14
  e99c7a:	48 89 de             	mov    rsi,rbx
  e99c7d:	e8 ae 16 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e99c82:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e99c85:	48 85 f6             	test   rsi,rsi
  e99c88:	74 28                	je     e99cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x610c8>
  e99c8a:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99c8e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99c91:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99c96:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99c99:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99c9c:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
  e99ca1:	48 89 df             	mov    rdi,rbx
  e99ca4:	4c 89 f6             	mov    rsi,r14
  e99ca7:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e99caa:	4c 89 f7             	mov    rdi,r14
  e99cad:	e8 ac db 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99cb2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99cb7:	e8 ca 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99cbc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99cc3:	00 00
  e99cc5:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99ccc:	00
  e99ccd:	75 33                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>
  e99ccf:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e99cd6:	5b                   	pop    rbx
  e99cd7:	41 5e                	pop    r14
  e99cd9:	c3                   	ret
  e99cda:	48 89 c3             	mov    rbx,rax
  e99cdd:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99ce2:	e8 9f 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99ce7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99cee:	00 00
  e99cf0:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99cf7:	00
  e99cf8:	75 08                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>
  e99cfa:	48 89 df             	mov    rdi,rbx
  e99cfd:	e8 ce 5f bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99d02:	e8 a9 5d 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99d07:	55                   	push   rbp
  e99d08:	41 57                	push   r15
  e99d0a:	41 56                	push   r14
  e99d0c:	41 55                	push   r13
  e99d0e:	41 54                	push   r12
  e99d10:	53                   	push   rbx
  e99d11:	48 81 ec 08 12 00 00 	sub    rsp,0x1208
  e99d18:	4c 89 cb             	mov    rbx,r9
  e99d1b:	4d 89 c6             	mov    r14,r8
  e99d1e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99d25:	00 00
  e99d27:	48 89 84 24 00 12 00 	mov    QWORD PTR [rsp+0x1200],rax
  e99d2e:	00
  e99d2f:	48 b8 00 00 00 00 00 	movabs rax,0x1000000000000
  e99d36:	00 01 00
  e99d39:	4c 8d 84 24 f0 06 00 	lea    r8,[rsp+0x6f0]
  e99d40:	00
  e99d41:	49 89 40 e0          	mov    QWORD PTR [r8-0x20],rax
  e99d45:	66 41 83 60 e8 00    	and    WORD PTR [r8-0x18],0x0
  e99d4b:	48 89 8c 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rcx
  e99d52:	00
  e99d53:	41 83 60 ec 00       	and    DWORD PTR [r8-0x14],0x0
  e99d58:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
  e99d5d:	41 83 60 ef 00       	and    DWORD PTR [r8-0x11],0x0
  e99d62:	49 89 f4             	mov    r12,rsi
  e99d65:	41 c7 40 f4 00 01 00 	mov    DWORD PTR [r8-0xc],0x100
  e99d6c:	00
  e99d6d:	48 8d 05 4c 40 96 00 	lea    rax,[rip+0x96404c]        # 17fddc0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe60>
  e99d74:	49 89 00             	mov    QWORD PTR [r8],rax
  e99d77:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
  e99d7b:	49 83 60 30 00       	and    QWORD PTR [r8+0x30],0x0
  e99d80:	49 89 ff             	mov    r15,rdi
  e99d83:	41 83 60 37 00       	and    DWORD PTR [r8+0x37],0x0
  e99d88:	48 8b b4 24 68 13 00 	mov    rsi,QWORD PTR [rsp+0x1368]
  e99d8f:	00
  e99d90:	49 c7 40 40 96 00 00 	mov    QWORD PTR [r8+0x40],0x96
  e99d97:	00
  e99d98:	41 c6 40 48 01       	mov    BYTE PTR [r8+0x48],0x1
  e99d9d:	48 b8 00 00 00 00 0a 	movabs rax,0xa00000000
  e99da4:	00 00 00
```
## All observed virtual `+0x78` call shapes

| addr | instruction |
|---:|---|
| `0xaa188f` | `aa188f:	48 83 62 68 00       	and    QWORD PTR [rdx+0x68],0x0` |
| `0xaa1894` | `aa1894:	31 c0                	xor    eax,eax` |
| `0xaa1896` | `aa1896:	88 82 c0 00 00 00    	mov    BYTE PTR [rdx+0xc0],al` |
| `0xaa189c` | `aa189c:	88 82 d8 00 00 00    	mov    BYTE PTR [rdx+0xd8],al` |
| `0xaa18a2` | `aa18a2:	83 a2 e8 00 00 00 00 	and    DWORD PTR [rdx+0xe8],0x0` |
| `0xaa18a9` | `aa18a9:	88 82 f0 00 00 00    	mov    BYTE PTR [rdx+0xf0],al` |
| `0xaa18af` | `aa18af:	88 82 28 01 00 00    	mov    BYTE PTR [rdx+0x128],al` |
| `0xaa18b5` | `aa18b5:	66 0f 7f 42 78       	movdqa XMMWORD PTR [rdx+0x78],xmm0` |
| `0xaa18ba` | `aa18ba:	66 0f 7f 82 a8 00 00 	movdqa XMMWORD PTR [rdx+0xa8],xmm0` |
| `0xaa18c1` | `aa18c1:	00` |
| `0xaa18c2` | `aa18c2:	48 83 a2 b5 00 00 00 	and    QWORD PTR [rdx+0xb5],0x0` |
| `0xaa18c9` | `aa18c9:	00` |
| `0xaa18ca` | `aa18ca:	66 0f 7f 82 88 00 00 	movdqa XMMWORD PTR [rdx+0x88],xmm0` |
| `0xaa18d1` | `aa18d1:	00` |
| `0xaa18d2` | `aa18d2:	66 0f 7f 82 98 00 00 	movdqa XMMWORD PTR [rdx+0x98],xmm0` |
| `0xaa18d9` | `aa18d9:	00` |
| `0xab1760` | `ab1760:	41 56                	push   r14` |
| `0xab1762` | `ab1762:	53                   	push   rbx` |
| `0xab1763` | `ab1763:	50                   	push   rax` |
| `0xab1764` | `ab1764:	89 d3                	mov    ebx,edx` |
| `0xab1766` | `ab1766:	49 89 fe             	mov    r14,rdi` |
| `0xab1769` | `ab1769:	e8 e0 fd ff ff       	call   ab154e <JNI_OnUnload@@Base+0x38e1b>` |
| `0xab176e` | `ab176e:	48 8b 08             	mov    rcx,QWORD PTR [rax]` |
| `0xab1771` | `ab1771:	48 8b 49 78          	mov    rcx,QWORD PTR [rcx+0x78]` |
| `0xab1775` | `ab1775:	48 89 c7             	mov    rdi,rax` |
| `0xab1778` | `ab1778:	4c 89 f6             	mov    rsi,r14` |
| `0xab177b` | `ab177b:	89 da                	mov    edx,ebx` |
| `0xab177d` | `ab177d:	48 83 c4 08          	add    rsp,0x8` |
| `0xab1781` | `ab1781:	5b                   	pop    rbx` |
| `0xab1782` | `ab1782:	41 5e                	pop    r14` |
| `0xab1784` | `ab1784:	ff e1                	jmp    rcx` |
| `0xab1786` | `ab1786:	53                   	push   rbx` |
| `0xab5b09` | `ab5b09:	5b                   	pop    rbx` |
| `0xab5b0a` | `ab5b0a:	c3                   	ret` |
| `0xab5b0b` | `ab5b0b:	cc                   	int3` |
| `0xab5b0c` | `ab5b0c:	53                   	push   rbx` |
| `0xab5b0d` | `ab5b0d:	48 89 fb             	mov    rbx,rdi` |
| `0xab5b10` | `ab5b10:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]` |
| `0xab5b14` | `ab5b14:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xab5b17` | `ab5b17:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xab5b1a` | `ab5b1a:	48 89 d8             	mov    rax,rbx` |
| `0xab5b1d` | `ab5b1d:	5b                   	pop    rbx` |
| `0xab5b1e` | `ab5b1e:	c3                   	ret` |
| `0xab5b1f` | `ab5b1f:	cc                   	int3` |
| `0xab5b20` | `ab5b20:	53                   	push   rbx` |
| `0xab5b21` | `ab5b21:	48 89 fb             	mov    rbx,rdi` |
| `0xab5b24` | `ab5b24:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]` |
| `0xab5b28` | `ab5b28:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xabb9fe` | `abb9fe:	4c 8d bc 24 10 01 00 	lea    r15,[rsp+0x110]` |
| `0xabba05` | `abba05:	00` |
| `0xabba06` | `abba06:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]` |
| `0xabba0b` | `abba0b:	48 89 df             	mov    rdi,rbx` |
| `0xabba0e` | `abba0e:	4c 89 f6             	mov    rsi,r14` |
| `0xabba11` | `abba11:	4c 89 fa             	mov    rdx,r15` |
| `0xabba14` | `abba14:	4c 89 e1             	mov    rcx,r12` |
| `0xabba17` | `abba17:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xabba1a` | `abba1a:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]` |
| `0xabba1f` | `abba1f:	e8 62 2a fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xabba24` | `abba24:	4c 89 ff             	mov    rdi,r15` |
| `0xabba27` | `abba27:	e8 5e 35 00 00       	call   abef8a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbf2a>` |
| `0xabba2c` | `abba2c:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]` |
| `0xabba33` | `abba33:	00` |
| `0xabba34` | `abba34:	e8 51 35 00 00       	call   abef8a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbf2a>` |
| `0xabba39` | `abba39:	e9 11 ff ff ff       	jmp    abb94f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x88ef>` |
| `0xacffe9` | `acffe9:	48 8b 9c 24 60 02 00 	mov    rbx,QWORD PTR [rsp+0x260]` |
| `0xacfff0` | `acfff0:	00` |
| `0xacfff1` | `acfff1:	4c 8b b4 24 10 01 00 	mov    r14,QWORD PTR [rsp+0x110]` |
| `0xacfff8` | `acfff8:	00` |
| `0xacfff9` | `acfff9:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xacfffc` | `acfffc:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xacffff` | `acffff:	31 f6                	xor    esi,esi` |
| `0xad0001` | `ad0001:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xad0004` | `ad0004:	4c 89 fe             	mov    rsi,r15` |
| `0xad0007` | `ad0007:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]` |
| `0xad000e` | `ad000e:	00` |
| `0xad000f` | `ad000f:	4c 89 ff             	mov    rdi,r15` |
| `0xad0012` | `ad0012:	48 89 da             	mov    rdx,rbx` |
| `0xad0015` | `ad0015:	e8 63 54 d0 00       	call   17d547d <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x129e>` |
| `0xad001a` | `ad001a:	48 8d 9c 24 a8 00 00 	lea    rbx,[rsp+0xa8]` |
| `0xad0021` | `ad0021:	00` |
| `0xad0c68` | `ad0c68:	84 db                	test   bl,bl` |
| `0xad0c6a` | `ad0c6a:	40 0f 95 c6          	setne  sil` |
| `0xad0c6e` | `ad0c6e:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]` |
| `0xad0c73` | `ad0c73:	40 88 2a             	mov    BYTE PTR [rdx],bpl` |
| `0xad0c76` | `ad0c76:	40 88 6a 18          	mov    BYTE PTR [rdx+0x18],bpl` |
| `0xad0c7a` | `ad0c7a:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xad0c7d` | `ad0c7d:	4c 89 f7             	mov    rdi,r14` |
| `0xad0c80` | `ad0c80:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xad0c83` | `ad0c83:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]` |
| `0xad0c88` | `ad0c88:	e8 a3 60 fd ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0xad0c8d` | `ad0c8d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xad0c94` | `ad0c94:	00 00` |
| `0xad0c96` | `ad0c96:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]` |
| `0xad0c9b` | `ad0c9b:	75 09                	jne    ad0ca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dc46>` |
| `0xad0c9d` | `ad0c9d:	48 83 c4 30          	add    rsp,0x30` |
| `0xad0ca1` | `ad0ca1:	5b                   	pop    rbx` |
| `0xaf3a63` | `af3a63:	0f 10 48 60          	movups xmm1,XMMWORD PTR [rax+0x60]` |
| `0xaf3a67` | `af3a67:	0f 29 4c 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm1` |
| `0xaf3a6c` | `af3a6c:	0f 11 40 60          	movups XMMWORD PTR [rax+0x60],xmm0` |
| `0xaf3a70` | `af3a70:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0` |
| `0xaf3a75` | `af3a75:	48 8b 88 88 00 00 00 	mov    rcx,QWORD PTR [rax+0x88]` |
| `0xaf3a7c` | `af3a7c:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx` |
| `0xaf3a83` | `af3a83:	00` |
| `0xaf3a84` | `af3a84:	0f 10 48 78          	movups xmm1,XMMWORD PTR [rax+0x78]` |
| `0xaf3a88` | `af3a88:	0f 11 8c 24 88 00 00 	movups XMMWORD PTR [rsp+0x88],xmm1` |
| `0xaf3a8f` | `af3a8f:	00` |
| `0xaf3a90` | `af3a90:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0` |
| `0xaf3a94` | `af3a94:	48 83 a0 88 00 00 00 	and    QWORD PTR [rax+0x88],0x0` |
| `0xaf3a9b` | `af3a9b:	00` |
| `0xaf3a9c` | `af3a9c:	49 8d 9f 84 00 00 00 	lea    rbx,[r15+0x84]` |
| `0xaf3aa3` | `af3aa3:	48 89 df             	mov    rdi,rbx` |
| `0xaf3aa6` | `af3aa6:	e8 45 a6 cf 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaf3aab` | `af3aab:	49 8d bf b0 00 00 00 	lea    rdi,[r15+0xb0]` |
| `0xaf3ab2` | `af3ab2:	e8 6f ae fb ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>` |
| `0xaf3ab7` | `af3ab7:	48 89 df             	mov    rdi,rbx` |
| `0xb45fca` | `b45fca:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx` |
| `0xb45fce` | `b45fce:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xb45fd1` | `b45fd1:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0` |
| `0xb45fd5` | `b45fd5:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0` |
| `0xb45fd9` | `b45fd9:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0` |
| `0xb45fdd` | `b45fdd:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0` |
| `0xb45fe1` | `b45fe1:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0` |
| `0xb45fe5` | `b45fe5:	48 83 60 78 00       	and    QWORD PTR [rax+0x78],0x0` |
| `0xb45fea` | `b45fea:	5b                   	pop    rbx` |
| `0xb45feb` | `b45feb:	c3                   	ret` |
| `0xb45fec` | `b45fec:	41 57                	push   r15` |
| `0xb45fee` | `b45fee:	41 56                	push   r14` |
| `0xb45ff0` | `b45ff0:	53                   	push   rbx` |
| `0xb45ff1` | `b45ff1:	48 83 ec 30          	sub    rsp,0x30` |
| `0xb45ff5` | `b45ff5:	48 89 fb             	mov    rbx,rdi` |
| `0xb45ff8` | `b45ff8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xb48d8b` | `b48d8b:	e9 a1 00 00 00       	jmp    b48e31 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95dd1>` |
| `0xb48d90` | `b48d90:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx` |
| `0xb48d94` | `b48d94:	4d 8b 3e             	mov    r15,QWORD PTR [r14]` |
| `0xb48d97` | `b48d97:	49 83 c6 08          	add    r14,0x8` |
| `0xb48d9b` | `b48d9b:	4d 39 f7             	cmp    r15,r14` |
| `0xb48d9e` | `b48d9e:	74 6e                	je     b48e0e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95dae>` |
| `0xb48da0` | `b48da0:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]` |
| `0xb48da4` | `b48da4:	4c 8d 60 78          	lea    r12,[rax+0x78]` |
| `0xb48da8` | `b48da8:	48 8d 98 80 00 00 00 	lea    rbx,[rax+0x80]` |
| `0xb48daf` | `b48daf:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]` |
| `0xb48db4` | `b48db4:	49 8d 6f 20          	lea    rbp,[r15+0x20]` |
| `0xb48db8` | `b48db8:	4c 89 e7             	mov    rdi,r12` |
| `0xb48dbb` | `b48dbb:	48 89 ee             	mov    rsi,rbp` |
| `0xb48dbe` | `b48dbe:	e8 63 21 fb ff       	call   afaf26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x47ec6>` |
| `0xb48dc3` | `b48dc3:	48 39 d8             	cmp    rax,rbx` |
| `0xb48dc6` | `b48dc6:	74 14                	je     b48ddc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95d7c>` |
| `0xb491ea` | `b491ea:	4d 8b 37             	mov    r14,QWORD PTR [r15]` |
| `0xb491ed` | `b491ed:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]` |
| `0xb491f1` | `b491f1:	49 39 de             	cmp    r14,rbx` |
| `0xb491f4` | `b491f4:	74 7d                	je     b49273 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96213>` |
| `0xb491f6` | `b491f6:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xb491fb` | `b491fb:	4c 8d b8 90 00 00 00 	lea    r15,[rax+0x90]` |
| `0xb49202` | `b49202:	4c 8d a8 98 00 00 00 	lea    r13,[rax+0x98]` |
| `0xb49209` | `b49209:	48 8d 48 78          	lea    rcx,[rax+0x78]` |
| `0xb4920d` | `b4920d:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx` |
| `0xb49212` | `b49212:	4c 8d a0 80 00 00 00 	lea    r12,[rax+0x80]` |
| `0xb49219` | `b49219:	4c 89 ff             	mov    rdi,r15` |
| `0xb4921c` | `b4921c:	4c 89 f6             	mov    rsi,r14` |
| `0xb4921f` | `b4921f:	e8 02 1d fb ff       	call   afaf26 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x47ec6>` |
| `0xb49224` | `b49224:	4c 39 e8             	cmp    rax,r13` |
| `0xb49227` | `b49227:	74 41                	je     b4926a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9620a>` |
| `0xb49229` | `b49229:	48 89 c5             	mov    rbp,rax` |
| `0xb5c0d0` | `b5c0d0:	49 3b 45 68          	cmp    rax,QWORD PTR [r13+0x68]` |
| `0xb5c0d4` | `b5c0d4:	75 59                	jne    b5c12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa90cf>` |
| `0xb5c0d6` | `b5c0d6:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xb5c0db` | `b5c0db:	48 8b 40 70          	mov    rax,QWORD PTR [rax+0x70]` |
| `0xb5c0df` | `b5c0df:	49 3b 45 70          	cmp    rax,QWORD PTR [r13+0x70]` |
| `0xb5c0e3` | `b5c0e3:	75 4a                	jne    b5c12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa90cf>` |
| `0xb5c0e5` | `b5c0e5:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xb5c0ea` | `b5c0ea:	48 8b 40 78          	mov    rax,QWORD PTR [rax+0x78]` |
| `0xb5c0ee` | `b5c0ee:	49 3b 45 78          	cmp    rax,QWORD PTR [r13+0x78]` |
| `0xb5c0f2` | `b5c0f2:	75 3b                	jne    b5c12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa90cf>` |
| `0xb5c0f4` | `b5c0f4:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xb5c0f9` | `b5c0f9:	48 8b 80 80 00 00 00 	mov    rax,QWORD PTR [rax+0x80]` |
| `0xb5c100` | `b5c100:	49 3b 85 80 00 00 00 	cmp    rax,QWORD PTR [r13+0x80]` |
| `0xb5c107` | `b5c107:	75 26                	jne    b5c12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa90cf>` |
| `0xb5c109` | `b5c109:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xb5c10e` | `b5c10e:	48 8b 80 88 00 00 00 	mov    rax,QWORD PTR [rax+0x88]` |
| `0xb85cfa` | `b85cfa:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0` |
| `0xb85cff` | `b85cff:	48 8d 05 6a c2 ce 00 	lea    rax,[rip+0xcec26a]        # 1871f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2e658>` |
| `0xb85d06` | `b85d06:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xb85d09` | `b85d09:	4c 8d 73 18          	lea    r14,[rbx+0x18]` |
| `0xb85d0d` | `b85d0d:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]` |
| `0xb85d12` | `b85d12:	66 0f 6f 40 70       	movdqa xmm0,XMMWORD PTR [rax+0x70]` |
| `0xb85d17` | `b85d17:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0` |
| `0xb85d1c` | `b85d1c:	48 8b 40 78          	mov    rax,QWORD PTR [rax+0x78]` |
| `0xb85d20` | `b85d20:	48 85 c0             	test   rax,rax` |
| `0xb85d23` | `b85d23:	74 05                	je     b85d2a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2cca>` |
| `0xb85d25` | `b85d25:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]` |
| `0xb85d2a` | `b85d2a:	48 8d 35 e2 23 7f ff 	lea    rsi,[rip+0xffffffffff7f23e2]        # 378113 <_ZTSSt12bad_any_cast@@Base-0x180b5>` |
| `0xb85d31` | `b85d31:	4c 89 f7             	mov    rdi,r14` |
| `0xb85d34` | `b85d34:	e8 97 de a5 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>` |
| `0xb85d39` | `b85d39:	4d 8d ac 24 90 00 00 	lea    r13,[r12+0x90]` |
| `0xb85d40` | `b85d40:	00` |
| `0xb873d2` | `b873d2:	0f 10 41 f0          	movups xmm0,XMMWORD PTR [rcx-0x10]` |
| `0xb873d6` | `b873d6:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0` |
| `0xb873da` | `b873da:	48 85 d2             	test   rdx,rdx` |
| `0xb873dd` | `b873dd:	74 05                	je     b873e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4384>` |
| `0xb873df` | `b873df:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]` |
| `0xb873e4` | `b873e4:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]` |
| `0xb873e7` | `b873e7:	f3 0f 6f 49 10       	movdqu xmm1,XMMWORD PTR [rcx+0x10]` |
| `0xb873ec` | `b873ec:	f3 0f 7f 48 78       	movdqu XMMWORD PTR [rax+0x78],xmm1` |
| `0xb873f1` | `b873f1:	0f 11 40 68          	movups XMMWORD PTR [rax+0x68],xmm0` |
| `0xb873f5` | `b873f5:	48 89 84 24 60 06 00 	mov    QWORD PTR [rsp+0x660],rax` |
| `0xb873fc` | `b873fc:	00` |
| `0xb873fd` | `b873fd:	4d 8b a6 20 03 00 00 	mov    r12,QWORD PTR [r14+0x320]` |
| `0xb87404` | `b87404:	4c 89 a4 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],r12` |
| `0xb8740b` | `b8740b:	00` |
| `0xb8740c` | `b8740c:	49 8b 86 28 03 00 00 	mov    rax,QWORD PTR [r14+0x328]` |
| `0xb87413` | `b87413:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax` |
| `0xb87574` | `b87574:	0f 10 41 f0          	movups xmm0,XMMWORD PTR [rcx-0x10]` |
| `0xb87578` | `b87578:	0f 11 40 58          	movups XMMWORD PTR [rax+0x58],xmm0` |
| `0xb8757c` | `b8757c:	48 85 d2             	test   rdx,rdx` |
| `0xb8757f` | `b8757f:	74 05                	je     b87586 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4526>` |
| `0xb87581` | `b87581:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]` |
| `0xb87586` | `b87586:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]` |
| `0xb8758a` | `b8758a:	f3 0f 6f 49 10       	movdqu xmm1,XMMWORD PTR [rcx+0x10]` |
| `0xb8758f` | `b8758f:	f3 0f 7f 48 78       	movdqu XMMWORD PTR [rax+0x78],xmm1` |
| `0xb87594` | `b87594:	f3 0f 7f 40 68       	movdqu XMMWORD PTR [rax+0x68],xmm0` |
| `0xb87599` | `b87599:	4c 8d bc 24 10 06 00 	lea    r15,[rsp+0x610]` |
| `0xb875a0` | `b875a0:	00` |
| `0xb875a1` | `b875a1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax` |
| `0xb875a5` | `b875a5:	4c 8d a4 24 70 06 00 	lea    r12,[rsp+0x670]` |
| `0xb875ac` | `b875ac:	00` |
| `0xb875ad` | `b875ad:	48 8d 9c 24 c0 02 00 	lea    rbx,[rsp+0x2c0]` |
| `0xb875b4` | `b875b4:	00` |
| `0xba9049` | `ba9049:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax` |
| `0xba904d` | `ba904d:	48 8d 3d ec db 7f ff 	lea    rdi,[rip+0xffffffffff7fdbec]        # 3a6c40 <_ZTSN5boost9exceptionE@@Base+0x7622>` |
| `0xba9054` | `ba9054:	6a 17                	push   0x17` |
| `0xba9056` | `ba9056:	5e                   	pop    rsi` |
| `0xba9057` | `ba9057:	e8 d6 1f 01 00       	call   bbb032 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x107fd2>` |
| `0xba905c` | `ba905c:	49 89 d8             	mov    r8,rbx` |
| `0xba905f` | `ba905f:	41 8b 40 70          	mov    eax,DWORD PTR [r8+0x70]` |
| `0xba9063` | `ba9063:	41 89 40 78          	mov    DWORD PTR [r8+0x78],eax` |
| `0xba9067` | `ba9067:	41 69 cc d7 51 bb 7c 	imul   ecx,r12d,0x7cbb51d7` |
| `0xba906e` | `ba906e:	81 f9 2c e2 c9 c3    	cmp    ecx,0xc3c9e22c` |
| `0xba9074` | `ba9074:	75 3c                	jne    ba90b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xf6052>` |
| `0xba9076` | `ba9076:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]` |
| `0xba907d` | `ba907d:	00` |
| `0xba907e` | `ba907e:	4c 89 02             	mov    QWORD PTR [rdx],r8` |
| `0xba9081` | `ba9081:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]` |
| `0xba9088` | `ba9088:	00` |
| `0xbb4bf1` | `bb4bf1:	00` |
| `0xbb4bf2` | `bb4bf2:	48 89 42 18          	mov    QWORD PTR [rdx+0x18],rax` |
| `0xbb4bf6` | `bb4bf6:	48 8d 3d 03 74 7f ff 	lea    rdi,[rip+0xffffffffff7f7403]        # 3ac000 <_ZTSN5boost9exceptionE@@Base+0xc9e2>` |
| `0xbb4bfd` | `bb4bfd:	6a 4a                	push   0x4a` |
| `0xbb4bff` | `bb4bff:	5e                   	pop    rsi` |
| `0xbb4c00` | `bb4c00:	e8 85 63 00 00       	call   bbaf8a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x107f2a>` |
| `0xbb4c05` | `bb4c05:	49 89 d8             	mov    r8,rbx` |
| `0xbb4c08` | `bb4c08:	41 8b 40 78          	mov    eax,DWORD PTR [r8+0x78]` |
| `0xbb4c0c` | `bb4c0c:	41 89 80 80 00 00 00 	mov    DWORD PTR [r8+0x80],eax` |
| `0xbb4c13` | `bb4c13:	41 69 c4 19 a9 97 f0 	imul   eax,r12d,0xf097a919` |
| `0xbb4c1a` | `bb4c1a:	3d d3 83 cf f3       	cmp    eax,0xf3cf83d3` |
| `0xbb4c1f` | `bb4c1f:	75 39                	jne    bb4c5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x101bfa>` |
| `0xbb4c21` | `bb4c21:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]` |
| `0xbb4c28` | `bb4c28:	00` |
| `0xbb4c29` | `bb4c29:	4c 89 02             	mov    QWORD PTR [rdx],r8` |
| `0xbb4c2c` | `bb4c2c:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]` |
| `0xbba772` | `bba772:	45 89 fe             	mov    r14d,r15d` |
| `0xbba775` | `bba775:	44 89 fd             	mov    ebp,r15d` |
| `0xbba778` | `bba778:	45 89 fc             	mov    r12d,r15d` |
| `0xbba77b` | `bba77b:	44 89 7c 24 24       	mov    DWORD PTR [rsp+0x24],r15d` |
| `0xbba780` | `bba780:	ff e6                	jmp    rsi` |
| `0xbba782` | `bba782:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]` |
| `0xbba787` | `bba787:	44 8b 7a 7c          	mov    r15d,DWORD PTR [rdx+0x7c]` |
| `0xbba78b` | `bba78b:	8b 42 78             	mov    eax,DWORD PTR [rdx+0x78]` |
| `0xbba78e` | `bba78e:	48 83 c2 f8          	add    rdx,0xfffffffffffffff8` |
| `0xbba792` | `bba792:	48 8d 0d eb b5 7d ff 	lea    rcx,[rip+0xffffffffff7db5eb]        # 395d84 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x2965>` |
| `0xbba799` | `bba799:	48 63 34 81          	movsxd rsi,DWORD PTR [rcx+rax*4]` |
| `0xbba79d` | `bba79d:	48 01 ce             	add    rsi,rcx` |
| `0xbba7a0` | `bba7a0:	44 89 7c 24 10       	mov    DWORD PTR [rsp+0x10],r15d` |
| `0xbba7a5` | `bba7a5:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx` |
| `0xbba7aa` | `bba7aa:	48 89 94 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rdx` |
| `0xbba7b1` | `bba7b1:	00` |
| `0xbc589c` | `bc589c:	e9 91 ff ff ff       	jmp    bc5832 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1127d2>` |
| `0xbc58a1` | `bc58a1:	cc                   	int3` |
| `0xbc58a2` | `bc58a2:	55                   	push   rbp` |
| `0xbc58a3` | `bc58a3:	53                   	push   rbx` |
| `0xbc58a4` | `bc58a4:	50                   	push   rax` |
| `0xbc58a5` | `bc58a5:	48 89 fb             	mov    rbx,rdi` |
| `0xbc58a8` | `bc58a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbc58ab` | `bc58ab:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xbc58ae` | `bc58ae:	48 89 c1             	mov    rcx,rax` |
| `0xbc58b1` | `bc58b1:	48 c1 e9 20          	shr    rcx,0x20` |
| `0xbc58b5` | `bc58b5:	48 0f ba e0 31       	bt     rax,0x31` |
| `0xbc58ba` | `bc58ba:	73 1c                	jae    bc58d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x112878>` |
| `0xbc58bc` | `bc58bc:	48 c1 e0 20          	shl    rax,0x20` |
| `0xbc58c0` | `bc58c0:	48 09 c8             	or     rax,rcx` |
| `0xbc58c3` | `bc58c3:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]` |
| `0xbc58c6` | `bc58c6:	48 89 df             	mov    rdi,rbx` |
| `0xbc8e56` | `bc8e56:	e8 f4 29 eb ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>` |
| `0xbc8e5b` | `bc8e5b:	84 c0                	test   al,al` |
| `0xbc8e5d` | `bc8e5d:	0f 85 de 00 00 00    	jne    bc8f41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x115ee1>` |
| `0xbc8e63` | `bc8e63:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]` |
| `0xbc8e67` | `bc8e67:	48 85 ff             	test   rdi,rdi` |
| `0xbc8e6a` | `bc8e6a:	0f 84 d1 00 00 00    	je     bc8f41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x115ee1>` |
| `0xbc8e70` | `bc8e70:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbc8e73` | `bc8e73:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xbc8e76` | `bc8e76:	48 85 c0             	test   rax,rax` |
| `0xbc8e79` | `bc8e79:	75 13                	jne    bc8e8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x115e2e>` |
| `0xbc8e7b` | `bc8e7b:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]` |
| `0xbc8e7f` | `bc8e7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbc8e82` | `bc8e82:	ff 50 38             	call   QWORD PTR [rax+0x38]` |
| `0xbc8e85` | `bc8e85:	48 85 c0             	test   rax,rax` |
| `0xbc8e88` | `bc8e88:	0f 84 b3 00 00 00    	je     bc8f41 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x115ee1>` |
| `0xbc8e8e` | `bc8e8e:	49 8b 6f 38          	mov    rbp,QWORD PTR [r15+0x38]` |
| `0xbd807d` | `bd807d:	48 83 c4 08          	add    rsp,0x8` |
| `0xbd8081` | `bd8081:	5b                   	pop    rbx` |
| `0xbd8082` | `bd8082:	41 5e                	pop    r14` |
| `0xbd8084` | `bd8084:	c3                   	ret` |
| `0xbd8085` | `bd8085:	cc                   	int3` |
| `0xbd8086` | `bd8086:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]` |
| `0xbd808a` | `bd808a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbd808d` | `bd808d:	ff 60 78             	jmp    QWORD PTR [rax+0x78]` |
| `0xbd8090` | `bd8090:	80 7f 30 00          	cmp    BYTE PTR [rdi+0x30],0x0` |
| `0xbd8094` | `bd8094:	74 25                	je     bd80bb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12505b>` |
| `0xbd8096` | `bd8096:	f2 0f 10 47 38       	movsd  xmm0,QWORD PTR [rdi+0x38]` |
| `0xbd809b` | `bd809b:	66 0f 57 c9          	xorpd  xmm1,xmm1` |
| `0xbd809f` | `bd809f:	66 0f 2e c1          	ucomisd xmm0,xmm1` |
| `0xbd80a3` | `bd80a3:	75 02                	jne    bd80a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x125047>` |
| `0xbd80a5` | `bd80a5:	7b 14                	jnp    bd80bb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12505b>` |
| `0xbd80a7` | `bd80a7:	f2 48 0f 2a ce       	cvtsi2sd xmm1,rsi` |
| `0xbd92ae` | `bd92ae:	48 8b 42 10          	mov    rax,QWORD PTR [rdx+0x10]` |
| `0xbd92b2` | `bd92b2:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0xbd92b5` | `bd92b5:	48 85 ff             	test   rdi,rdi` |
| `0xbd92b8` | `bd92b8:	74 11                	je     bd92cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12626b>` |
| `0xbd92ba` | `bd92ba:	48 89 d3             	mov    rbx,rdx` |
| `0xbd92bd` | `bd92bd:	49 89 f4             	mov    r12,rsi` |
| `0xbd92c0` | `bd92c0:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbd92c3` | `bd92c3:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xbd92c6` | `bd92c6:	48 85 c0             	test   rax,rax` |
| `0xbd92c9` | `bd92c9:	74 09                	je     bd92d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x126274>` |
| `0xbd92cb` | `bd92cb:	49 83 26 00          	and    QWORD PTR [r14],0x0` |
| `0xbd92cf` | `bd92cf:	e9 08 02 00 00       	jmp    bd94dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12647c>` |
| `0xbd92d4` | `bd92d4:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]` |
| `0xbd92d7` | `bd92d7:	41 bd 98 00 00 00    	mov    r13d,0x98` |
| `0xbd92dd` | `bd92dd:	4c 03 6b 10          	add    r13,QWORD PTR [rbx+0x10]` |
| `0xbd92e1` | `bd92e1:	48 8d 35 a1 5a 75 ff 	lea    rsi,[rip+0xffffffffff755aa1]        # 32ed89 <_ZTSSt12bad_any_cast@@Base-0x6143f>` |
| `0xbdd97c` | `bdd97c:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]` |
| `0xbdd981` | `bdd981:	75 08                	jne    bdd98b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12a92b>` |
| `0xbdd983` | `bdd983:	48 89 df             	mov    rdi,rbx` |
| `0xbdd986` | `bdd986:	e8 45 23 e9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xbdd98b` | `bdd98b:	e8 20 21 c1 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xbdd990` | `bdd990:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]` |
| `0xbdd994` | `bdd994:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbdd997` | `bdd997:	ff 60 78             	jmp    QWORD PTR [rax+0x78]` |
| `0xbdd99a` | `bdd99a:	48 8b 7f 48          	mov    rdi,QWORD PTR [rdi+0x48]` |
| `0xbdd99e` | `bdd99e:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbdd9a1` | `bdd9a1:	48 8b 80 80 00 00 00 	mov    rax,QWORD PTR [rax+0x80]` |
| `0xbdd9a8` | `bdd9a8:	ff e0                	jmp    rax` |
| `0xbdd9aa` | `bdd9aa:	41 56                	push   r14` |
| `0xbdd9ac` | `bdd9ac:	53                   	push   rbx` |
| `0xbdd9ad` | `bdd9ad:	48 83 ec 18          	sub    rsp,0x18` |
| `0xbdd9b1` | `bdd9b1:	48 89 f3             	mov    rbx,rsi` |
| `0xbf1490` | `bf1490:	8b 7e 1c             	mov    edi,DWORD PTR [rsi+0x1c]` |
| `0xbf1493` | `bf1493:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]` |
| `0xbf1497` | `bf1497:	e8 68 30 00 00       	call   bf4504 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1414a4>` |
| `0xbf149c` | `bf149c:	39 5c 24 5c          	cmp    DWORD PTR [rsp+0x5c],ebx` |
| `0xbf14a0` | `bf14a0:	75 6f                	jne    bf1511 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e4b1>` |
| `0xbf14a2` | `bf14a2:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |
| `0xbf14a7` | `bf14a7:	48 8b 00             	mov    rax,QWORD PTR [rax]` |
| `0xbf14aa` | `bf14aa:	80 78 78 00          	cmp    BYTE PTR [rax+0x78],0x0` |
| `0xbf14ae` | `bf14ae:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]` |
| `0xbf14b3` | `bf14b3:	74 61                	je     bf1516 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13e4b6>` |
| `0xbf14b5` | `bf14b5:	80 bd b8 03 00 00 00 	cmp    BYTE PTR [rbp+0x3b8],0x0` |
| `0xbf14bc` | `bf14bc:	0f 84 88 0c 00 00    	je     bf214a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f0ea>` |
| `0xbf14c2` | `bf14c2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]` |
| `0xbf14c6` | `bf14c6:	8b 50 04             	mov    edx,DWORD PTR [rax+0x4]` |
| `0xbf14c9` | `bf14c9:	85 d2                	test   edx,edx` |
| `0xbf14cb` | `bf14cb:	44 8b 74 24 50       	mov    r14d,DWORD PTR [rsp+0x50]` |
| `0xbf163d` | `bf163d:	48 8b 78 50          	mov    rdi,QWORD PTR [rax+0x50]` |
| `0xbf1641` | `bf1641:	48 8b 70 58          	mov    rsi,QWORD PTR [rax+0x58]` |
| `0xbf1645` | `bf1645:	48 29 fe             	sub    rsi,rdi` |
| `0xbf1648` | `bf1648:	48 c1 ee 02          	shr    rsi,0x2` |
| `0xbf164c` | `bf164c:	e8 19 30 00 00       	call   bf466a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x14160a>` |
| `0xbf1651` | `bf1651:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |
| `0xbf1656` | `bf1656:	48 8b 00             	mov    rax,QWORD PTR [rax]` |
| `0xbf1659` | `bf1659:	c6 40 78 01          	mov    BYTE PTR [rax+0x78],0x1` |
| `0xbf165d` | `bf165d:	4c 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r13` |
| `0xbf1664` | `bf1664:	00` |
| `0xbf1665` | `bf1665:	4c 89 a4 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],r12` |
| `0xbf166c` | `bf166c:	00` |
| `0xbf166d` | `bf166d:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]` |
| `0xbf1672` | `bf1672:	4c 8b 20             	mov    r12,QWORD PTR [rax]` |
| `0xbf1675` | `bf1675:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]` |
| `0xbf1679` | `bf1679:	49 83 c4 08          	add    r12,0x8` |
| `0xbf552c` | `bf552c:	75 08                	jne    bf5536 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1424d6>` |
| `0xbf552e` | `bf552e:	48 89 df             	mov    rdi,rbx` |
| `0xbf5531` | `bf5531:	e8 9a a7 e7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xbf5536` | `bf5536:	e8 75 a5 bf 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xbf553b` | `bf553b:	cc                   	int3` |
| `0xbf553c` | `bf553c:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xbf5540` | `bf5540:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbf5543` | `bf5543:	ff 60 78             	jmp    QWORD PTR [rax+0x78]` |
| `0xbf5546` | `bf5546:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xbf554a` | `bf554a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbf554d` | `bf554d:	48 8b 80 80 00 00 00 	mov    rax,QWORD PTR [rax+0x80]` |
| `0xbf5554` | `bf5554:	ff e0                	jmp    rax` |
| `0xbf5556` | `bf5556:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0xbf555a` | `bf555a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xbf555d` | `bf555d:	48 8b 80 88 00 00 00 	mov    rax,QWORD PTR [rax+0x88]` |
| `0xbf5564` | `bf5564:	ff e0                	jmp    rax` |
| `0xc0f94c` | `c0f94c:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12` |
| `0xc0f950` | `c0f950:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xc0f953` | `c0f953:	48 8d 94 24 b0 00 00 	lea    rdx,[rsp+0xb0]` |
| `0xc0f95a` | `c0f95a:	00` |
| `0xc0f95b` | `c0f95b:	48 89 df             	mov    rdi,rbx` |
| `0xc0f95e` | `c0f95e:	4c 89 f6             	mov    rsi,r14` |
| `0xc0f961` | `c0f961:	4c 89 f9             	mov    rcx,r15` |
| `0xc0f964` | `c0f964:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xc0f967` | `c0f967:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xc0f96b` | `c0f96b:	48 85 ff             	test   rdi,rdi` |
| `0xc0f96e` | `c0f96e:	74 05                	je     c0f975 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15c915>` |
| `0xc0f970` | `c0f970:	e8 1b eb e8 ff       	call   a9e490 <JNI_OnUnload@@Base+0x25d5d>` |
| `0xc0f975` | `c0f975:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]` |
| `0xc0f97c` | `c0f97c:	00` |
| `0xc0f97d` | `c0f97d:	e8 18 26 ed ff       	call   ae1f9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2ef3a>` |
| `0xc0f982` | `c0f982:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]` |
| `0xc12c52` | `c12c52:	00` |
| `0xc12c53` | `c12c53:	4c 89 e7             	mov    rdi,r12` |
| `0xc12c56` | `c12c56:	4c 89 ee             	mov    rsi,r13` |
| `0xc12c59` | `c12c59:	e8 30 6d ab 00       	call   16c998e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dafa>` |
| `0xc12c5e` | `c12c5e:	4c 89 ef             	mov    rdi,r13` |
| `0xc12c61` | `c12c61:	e8 2a b2 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xc12c66` | `c12c66:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]` |
| `0xc12c6a` | `c12c6a:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc12c6e` | `c12c6e:	31 c0                	xor    eax,eax` |
| `0xc12c70` | `c12c70:	4c 8d 44 24 58       	lea    r8,[rsp+0x58]` |
| `0xc12c75` | `c12c75:	41 88 00             	mov    BYTE PTR [r8],al` |
| `0xc12c78` | `c12c78:	41 88 40 28          	mov    BYTE PTR [r8+0x28],al` |
| `0xc12c7c` | `c12c7c:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xc12c7f` | `c12c7f:	6a 01                	push   0x1` |
| `0xc12c81` | `c12c81:	59                   	pop    rcx` |
| `0xc12c82` | `c12c82:	4c 89 e6             	mov    rsi,r12` |
| `0xc144d5` | `c144d5:	48 8d 05 d4 26 c0 00 	lea    rax,[rip+0xc026d4]        # 1816bb0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xc870>` |
| `0xc144dc` | `c144dc:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax` |
| `0xc144e1` | `c144e1:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xc144e4` | `c144e4:	0f 11 44 24 48       	movups XMMWORD PTR [rsp+0x48],xmm0` |
| `0xc144e9` | `c144e9:	c6 44 24 58 00       	mov    BYTE PTR [rsp+0x58],0x0` |
| `0xc144ee` | `c144ee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xc144f3` | `c144f3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]` |
| `0xc144f7` | `c144f7:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc144fb` | `c144fb:	e8 de ef 99 00       	call   15b34de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8a62>` |
| `0xc14500` | `c14500:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]` |
| `0xc14505` | `c14505:	88 47 20             	mov    BYTE PTR [rdi+0x20],al` |
| `0xc14508` | `c14508:	c7 47 10 02 00 00 00 	mov    DWORD PTR [rdi+0x10],0x2` |
| `0xc1450f` | `c1450f:	e8 56 e6 ff ff       	call   c12b6a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fb0a>` |
| `0xc14514` | `c14514:	c7 40 20 c8 00 00 00 	mov    DWORD PTR [rax+0x20],0xc8` |
| `0xc1451b` | `c1451b:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2` |
| `0xc1451f` | `c1451f:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0xc151fa` | `c151fa:	48 89 e7             	mov    rdi,rsp` |
| `0xc151fd` | `c151fd:	e8 fe 70 9a 00       	call   15bc300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x401884>` |
| `0xc15202` | `c15202:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]` |
| `0xc15206` | `c15206:	49 8b 7c 24 18       	mov    rdi,QWORD PTR [r12+0x18]` |
| `0xc1520b` | `c1520b:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc` |
| `0xc1520f` | `c1520f:	e8 22 66 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc15214` | `c15214:	49 8b 4d 08          	mov    rcx,QWORD PTR [r13+0x8]` |
| `0xc15218` | `c15218:	48 8b 79 78          	mov    rdi,QWORD PTR [rcx+0x78]` |
| `0xc1521c` | `c1521c:	48 89 c6             	mov    rsi,rax` |
| `0xc1521f` | `c1521f:	e8 cc df 99 00       	call   15b31f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8774>` |
| `0xc15224` | `c15224:	84 c0                	test   al,al` |
| `0xc15226` | `c15226:	0f 84 98 00 00 00    	je     c152c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162264>` |
| `0xc1522c` | `c1522c:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]` |
| `0xc15230` | `c15230:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]` |
| `0xc15234` | `c15234:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]` |
| `0xc15239` | `c15239:	6a 01                	push   0x1` |
| `0xc15639` | `c15639:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1` |
| `0xc1563c` | `c1563c:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0` |
| `0xc15641` | `c15641:	4c 89 6d 18          	mov    QWORD PTR [rbp+0x18],r13` |
| `0xc15645` | `c15645:	e8 46 88 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xc1564a` | `c1564a:	4c 89 e7             	mov    rdi,r12` |
| `0xc1564d` | `c1564d:	e8 3e 88 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xc15652` | `c15652:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0xc15657` | `c15657:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc1565b` | `c1565b:	6a 01                	push   0x1` |
| `0xc1565d` | `c1565d:	5a                   	pop    rdx` |
| `0xc1565e` | `c1565e:	48 89 ee             	mov    rsi,rbp` |
| `0xc15661` | `c15661:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]` |
| `0xc15666` | `c15666:	e8 97 e2 99 00       	call   15b3902 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8e86>` |
| `0xc1566b` | `c1566b:	89 c5                	mov    ebp,eax` |
| `0xc1566d` | `c1566d:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]` |
| `0xc15672` | `c15672:	e8 19 88 bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xc160a3` | `c160a3:	00` |
| `0xc160a4` | `c160a4:	4c 89 ff             	mov    rdi,r15` |
| `0xc160a7` | `c160a7:	48 89 f5             	mov    rbp,rsi` |
| `0xc160aa` | `c160aa:	e8 7b 44 ab 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>` |
| `0xc160af` | `c160af:	4c 89 ff             	mov    rdi,r15` |
| `0xc160b2` | `c160b2:	e8 7f 57 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc160b7` | `c160b7:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]` |
| `0xc160bb` | `c160bb:	48 8b 79 78          	mov    rdi,QWORD PTR [rcx+0x78]` |
| `0xc160bf` | `c160bf:	48 89 c6             	mov    rsi,rax` |
| `0xc160c2` | `c160c2:	e8 29 d1 99 00       	call   15b31f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8774>` |
| `0xc160c7` | `c160c7:	41 89 c6             	mov    r14d,eax` |
| `0xc160ca` | `c160ca:	4c 89 ff             	mov    rdi,r15` |
| `0xc160cd` | `c160cd:	e8 be 7d bd 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xc160d2` | `c160d2:	45 84 f6             	test   r14b,r14b` |
| `0xc160d5` | `c160d5:	4c 8d 3d 10 02 78 ff 	lea    r15,[rip+0xffffffffff780210]        # 3962ec <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x2ecd>` |
| `0xc160dc` | `c160dc:	75 4b                	jne    c16129 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1630c9>` |
| `0xc173ce` | `c173ce:	e8 ef 54 ea ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>` |
| `0xc173d3` | `c173d3:	48 85 c0             	test   rax,rax` |
| `0xc173d6` | `c173d6:	74 06                	je     c173de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16437e>` |
| `0xc173d8` | `c173d8:	48 8b 68 28          	mov    rbp,QWORD PTR [rax+0x28]` |
| `0xc173dc` | `c173dc:	eb 02                	jmp    c173e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x164380>` |
| `0xc173de` | `c173de:	31 ed                	xor    ebp,ebp` |
| `0xc173e0` | `c173e0:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]` |
| `0xc173e4` | `c173e4:	4c 8b 70 78          	mov    r14,QWORD PTR [rax+0x78]` |
| `0xc173e8` | `c173e8:	4c 89 e7             	mov    rdi,r12` |
| `0xc173eb` | `c173eb:	e8 46 44 e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc173f0` | `c173f0:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xc173f5` | `c173f5:	48 89 54 24 78       	mov    QWORD PTR [rsp+0x78],rdx` |
| `0xc173fa` | `c173fa:	48 89 df             	mov    rdi,rbx` |
| `0xc173fd` | `c173fd:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]` |
| `0xc17402` | `c17402:	e8 61 c3 99 00       	call   15b3768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8cec>` |
| `0xc17407` | `c17407:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]` |
| `0xc17432` | `c17432:	31 ff                	xor    edi,edi` |
| `0xc17434` | `c17434:	e8 b3 f2 e9 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>` |
| `0xc17439` | `c17439:	49 83 c4 18          	add    r12,0x18` |
| `0xc1743d` | `c1743d:	48 85 ed             	test   rbp,rbp` |
| `0xc17440` | `c17440:	0f 84 77 ff ff ff    	je     c173bd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16435d>` |
| `0xc17446` | `c17446:	eb 42                	jmp    c1748a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16442a>` |
| `0xc17448` | `c17448:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]` |
| `0xc1744c` | `c1744c:	48 8b 70 78          	mov    rsi,QWORD PTR [rax+0x78]` |
| `0xc17450` | `c17450:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xc17453` | `c17453:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]` |
| `0xc1745a` | `c1745a:	00` |
| `0xc1745b` | `c1745b:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]` |
| `0xc17462` | `c17462:	00` |
| `0xc17463` | `c17463:	6a 01                	push   0x1` |
| `0xc17465` | `c17465:	59                   	pop    rcx` |
| `0xc17466` | `c17466:	ff 50 70             	call   QWORD PTR [rax+0x70]` |
| `0xc1760d` | `c1760d:	00` |
| `0xc1760e` | `c1760e:	48 85 db             	test   rbx,rbx` |
| `0xc17611` | `c17611:	75 32                	jne    c17645 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1645e5>` |
| `0xc17613` | `c17613:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]` |
| `0xc1761a` | `c1761a:	00` |
| `0xc1761b` | `c1761b:	c6 02 01             	mov    BYTE PTR [rdx],0x1` |
| `0xc1761e` | `c1761e:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]` |
| `0xc17622` | `c17622:	48 8b 70 78          	mov    rsi,QWORD PTR [rax+0x78]` |
| `0xc17626` | `c17626:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]` |
| `0xc1762b` | `c1762b:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]` |
| `0xc17632` | `c17632:	00` |
| `0xc17633` | `c17633:	45 31 c0             	xor    r8d,r8d` |
| `0xc17636` | `c17636:	e8 51 ea 99 00       	call   15b608c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb610>` |
| `0xc1763b` | `c1763b:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]` |
| `0xc17640` | `c17640:	e8 a7 f0 e9 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>` |
| `0xc17645` | `c17645:	48 89 df             	mov    rdi,rbx` |
| `0xc17862` | `c17862:	e8 5b 50 ea ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>` |
| `0xc17867` | `c17867:	48 85 c0             	test   rax,rax` |
| `0xc1786a` | `c1786a:	74 06                	je     c17872 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x164812>` |
| `0xc1786c` | `c1786c:	4c 8b 60 28          	mov    r12,QWORD PTR [rax+0x28]` |
| `0xc17870` | `c17870:	eb 03                	jmp    c17875 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x164815>` |
| `0xc17872` | `c17872:	45 31 e4             	xor    r12d,r12d` |
| `0xc17875` | `c17875:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]` |
| `0xc17879` | `c17879:	48 8b 68 78          	mov    rbp,QWORD PTR [rax+0x78]` |
| `0xc1787d` | `c1787d:	4c 89 ff             	mov    rdi,r15` |
| `0xc17880` | `c17880:	e8 b1 3f e6 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc17885` | `c17885:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax` |
| `0xc1788a` | `c1788a:	48 89 54 24 48       	mov    QWORD PTR [rsp+0x48],rdx` |
| `0xc1788f` | `c1788f:	48 89 df             	mov    rdi,rbx` |
| `0xc17892` | `c17892:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]` |
| `0xc17897` | `c17897:	e8 cc be 99 00       	call   15b3768 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8cec>` |
| `0xc1789c` | `c1789c:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]` |
| `0xc17902` | `c17902:	5a                   	pop    rdx` |
| `0xc17903` | `c17903:	48 89 df             	mov    rdi,rbx` |
| `0xc17906` | `c17906:	45 31 c0             	xor    r8d,r8d` |
| `0xc17909` | `c17909:	e8 1c bd 9a 00       	call   15c362a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x408bae>` |
| `0xc1790e` | `c1790e:	4c 8b 23             	mov    r12,QWORD PTR [rbx]` |
| `0xc17911` | `c17911:	e9 ef 00 00 00       	jmp    c17a05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1649a5>` |
| `0xc17916` | `c17916:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]` |
| `0xc1791a` | `c1791a:	48 8b 70 78          	mov    rsi,QWORD PTR [rax+0x78]` |
| `0xc1791e` | `c1791e:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xc17921` | `c17921:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]` |
| `0xc17926` | `c17926:	48 8d 94 24 98 00 00 	lea    rdx,[rsp+0x98]` |
| `0xc1792d` | `c1792d:	00` |
| `0xc1792e` | `c1792e:	6a 01                	push   0x1` |
| `0xc17930` | `c17930:	59                   	pop    rcx` |
| `0xc17931` | `c17931:	ff 50 70             	call   QWORD PTR [rax+0x70]` |
| `0xc17934` | `c17934:	4c 8b 64 24 50       	mov    r12,QWORD PTR [rsp+0x50]` |
| `0xc179a4` | `c179a4:	48 8b 9c 24 98 00 00 	mov    rbx,QWORD PTR [rsp+0x98]` |
| `0xc179ab` | `c179ab:	00` |
| `0xc179ac` | `c179ac:	48 85 db             	test   rbx,rbx` |
| `0xc179af` | `c179af:	75 2c                	jne    c179dd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16497d>` |
| `0xc179b1` | `c179b1:	48 8d 54 24 78       	lea    rdx,[rsp+0x78]` |
| `0xc179b6` | `c179b6:	c6 02 01             	mov    BYTE PTR [rdx],0x1` |
| `0xc179b9` | `c179b9:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]` |
| `0xc179bd` | `c179bd:	48 8b 70 78          	mov    rsi,QWORD PTR [rax+0x78]` |
| `0xc179c1` | `c179c1:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xc179c6` | `c179c6:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]` |
| `0xc179cb` | `c179cb:	45 31 c0             	xor    r8d,r8d` |
| `0xc179ce` | `c179ce:	e8 b9 e6 99 00       	call   15b608c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fb610>` |
| `0xc179d3` | `c179d3:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]` |
| `0xc179d8` | `c179d8:	e8 0f ed e9 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>` |
| `0xc179dd` | `c179dd:	48 89 df             	mov    rdi,rbx` |
| `0xc179e0` | `c179e0:	e8 07 ed e9 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>` |
| `0xc27ec8` | `c27ec8:	00` |
| `0xc27ec9` | `c27ec9:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xc27ecc` | `c27ecc:	48 89 df             	mov    rdi,rbx` |
| `0xc27ecf` | `c27ecf:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xc27ed2` | `c27ed2:	eb 8c                	jmp    c27e60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x174e00>` |
| `0xc27ed4` | `c27ed4:	4d 89 e6             	mov    r14,r12` |
| `0xc27ed7` | `c27ed7:	49 8b 44 24 50       	mov    rax,QWORD PTR [r12+0x50]` |
| `0xc27edc` | `c27edc:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc27ee0` | `c27ee0:	4d 8d 7c 24 58       	lea    r15,[r12+0x58]` |
| `0xc27ee5` | `c27ee5:	31 c0                	xor    eax,eax` |
| `0xc27ee7` | `c27ee7:	4c 8d 84 24 68 02 00 	lea    r8,[rsp+0x268]` |
| `0xc27eee` | `c27eee:	00` |
| `0xc27eef` | `c27eef:	41 88 00             	mov    BYTE PTR [r8],al` |
| `0xc27ef2` | `c27ef2:	41 88 40 28          	mov    BYTE PTR [r8+0x28],al` |
| `0xc27ef6` | `c27ef6:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xc27ef9` | `c27ef9:	6a 01                	push   0x1` |
| `0xc287e8` | `c287e8:	00` |
| `0xc287e9` | `c287e9:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]` |
| `0xc287f0` | `c287f0:	00` |
| `0xc287f1` | `c287f1:	48 89 df             	mov    rdi,rbx` |
| `0xc287f4` | `c287f4:	4c 89 f6             	mov    rsi,r14` |
| `0xc287f7` | `c287f7:	4c 89 fa             	mov    rdx,r15` |
| `0xc287fa` | `c287fa:	4c 89 e1             	mov    rcx,r12` |
| `0xc287fd` | `c287fd:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xc28800` | `c28800:	e9 a2 05 00 00       	jmp    c28da7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x175d47>` |
| `0xc28805` | `c28805:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xc28808` | `c28808:	4c 8d ac 24 78 06 00 	lea    r13,[rsp+0x678]` |
| `0xc2880f` | `c2880f:	00` |
| `0xc28810` | `c28810:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0` |
| `0xc28815` | `c28815:	48 8d 05 f4 e3 be 00 	lea    rax,[rip+0xbee3f4]        # 1816c10 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xc8d0>` |
| `0xc2881c` | `c2881c:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax` |
| `0xc28820` | `c28820:	48 8d 05 d1 6f 81 ff 	lea    rax,[rip+0xffffffffff816fd1]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>` |
| `0xc2f63f` | `c2f63f:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]` |
| `0xc2f646` | `c2f646:	00` |
| `0xc2f647` | `c2f647:	48 8b 94 24 88 00 00 	mov    rdx,QWORD PTR [rsp+0x88]` |
| `0xc2f64e` | `c2f64e:	00` |
| `0xc2f64f` | `c2f64f:	48 29 f2             	sub    rdx,rsi` |
| `0xc2f652` | `c2f652:	48 c1 fa 05          	sar    rdx,0x5` |
| `0xc2f656` | `c2f656:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]` |
| `0xc2f65a` | `c2f65a:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc2f65e` | `c2f65e:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]` |
| `0xc2f663` | `c2f663:	e8 64 3e 98 00       	call   15b34cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8a50>` |
| `0xc2f668` | `c2f668:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]` |
| `0xc2f66d` | `c2f66d:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]` |
| `0xc2f672` | `c2f672:	89 c3                	mov    ebx,eax` |
| `0xc2f674` | `c2f674:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]` |
| `0xc2f67b` | `c2f67b:	00` |
| `0xc2f67c` | `c2f67c:	e8 91 77 01 00       	call   c46e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193db2>` |
| `0xc2ffea` | `c2ffea:	48 29 f0             	sub    rax,rsi` |
| `0xc2ffed` | `c2ffed:	6a 18                	push   0x18` |
| `0xc2ffef` | `c2ffef:	59                   	pop    rcx` |
| `0xc2fff0` | `c2fff0:	48 99                	cqo` |
| `0xc2fff2` | `c2fff2:	48 f7 f9             	idiv   rcx` |
| `0xc2fff5` | `c2fff5:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]` |
| `0xc2fffa` | `c2fffa:	48 8b 49 08          	mov    rcx,QWORD PTR [rcx+0x8]` |
| `0xc2fffe` | `c2fffe:	48 8b 79 78          	mov    rdi,QWORD PTR [rcx+0x78]` |
| `0xc30002` | `c30002:	48 8d 8c 24 10 01 00 	lea    rcx,[rsp+0x110]` |
| `0xc30009` | `c30009:	00` |
| `0xc3000a` | `c3000a:	48 89 c2             	mov    rdx,rax` |
| `0xc3000d` | `c3000d:	e8 be 74 98 00       	call   15b74d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fca54>` |
| `0xc30012` | `c30012:	89 c3                	mov    ebx,eax` |
| `0xc30014` | `c30014:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]` |
| `0xc3001b` | `c3001b:	00` |
| `0xc3001c` | `c3001c:	e8 b7 59 fe ff       	call   c159d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162978>` |
| `0xc30b8b` | `c30b8b:	48 89 ef             	mov    rdi,rbp` |
| `0xc30b8e` | `c30b8e:	4c 89 fe             	mov    rsi,r15` |
| `0xc30b91` | `c30b91:	e8 94 99 a9 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>` |
| `0xc30b96` | `c30b96:	49 8d 77 58          	lea    rsi,[r15+0x58]` |
| `0xc30b9a` | `c30b9a:	4c 89 f7             	mov    rdi,r14` |
| `0xc30b9d` | `c30b9d:	e8 88 99 a9 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>` |
| `0xc30ba2` | `c30ba2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xc30ba7` | `c30ba7:	48 8b 40 78          	mov    rax,QWORD PTR [rax+0x78]` |
| `0xc30bab` | `c30bab:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xc30bb0` | `c30bb0:	48 89 ef             	mov    rdi,rbp` |
| `0xc30bb3` | `c30bb3:	e8 7e ac e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc30bb8` | `c30bb8:	49 89 c4             	mov    r12,rax` |
| `0xc30bbb` | `c30bbb:	48 89 d3             	mov    rbx,rdx` |
| `0xc30bbe` | `c30bbe:	4c 89 f7             	mov    rdi,r14` |
| `0xc30bc1` | `c30bc1:	e8 70 ac e4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>` |
| `0xc30bc6` | `c30bc6:	4c 89 a4 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],r12` |
| `0xc30c3c` | `c30c3c:	48 8d bc 24 c8 01 00 	lea    rdi,[rsp+0x1c8]` |
| `0xc30c43` | `c30c43:	00` |
| `0xc30c44` | `c30c44:	e8 47 d2 bb 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xc30c49` | `c30c49:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]` |
| `0xc30c4d` | `c30c4d:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]` |
| `0xc30c52` | `c30c52:	eb 51                	jmp    c30ca5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17dc45>` |
| `0xc30c54` | `c30c54:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0xc30c59` | `c30c59:	48 8b 70 78          	mov    rsi,QWORD PTR [rax+0x78]` |
| `0xc30c5d` | `c30c5d:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xc30c60` | `c30c60:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]` |
| `0xc30c67` | `c30c67:	00` |
| `0xc30c68` | `c30c68:	48 8d 94 24 c8 01 00 	lea    rdx,[rsp+0x1c8]` |
| `0xc30c6f` | `c30c6f:	00` |
| `0xc30c70` | `c30c70:	6a 01                	push   0x1` |
| `0xc30c72` | `c30c72:	59                   	pop    rcx` |
| `0xc30c73` | `c30c73:	ff 50 70             	call   QWORD PTR [rax+0x70]` |
| `0xc31053` | `c31053:	4c 89 ef             	mov    rdi,r13` |
| `0xc31056` | `c31056:	e8 e5 ce bb 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xc3105b` | `c3105b:	49 8b 74 24 18       	mov    rsi,QWORD PTR [r12+0x18]` |
| `0xc31060` | `c31060:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc` |
| `0xc31064` | `c31064:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]` |
| `0xc31069` | `c31069:	e8 d2 ce bb 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xc3106e` | `c3106e:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]` |
| `0xc31072` | `c31072:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc31076` | `c31076:	4c 89 ee             	mov    rsi,r13` |
| `0xc31079` | `c31079:	e8 c8 b6 98 00       	call   15bc746 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x401cca>` |
| `0xc3107e` | `c3107e:	0f b6 f0             	movzx  esi,al` |
| `0xc31081` | `c31081:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]` |
| `0xc31086` | `c31086:	e8 b7 75 fe ff       	call   c18642 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1655e2>` |
| `0xc3108b` | `c3108b:	4c 89 ef             	mov    rdi,r13` |
| `0xc3108e` | `c3108e:	e8 39 d7 e6 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>` |
| `0xc31093` | `c31093:	49 83 c6 08          	add    r14,0x8` |
| `0xc32995` | `c32995:	0f 11 44 24 78       	movups XMMWORD PTR [rsp+0x78],xmm0` |
| `0xc3299a` | `c3299a:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0` |
| `0xc329a1` | `c329a1:	00 00` |
| `0xc329a3` | `c329a3:	8a 47 38             	mov    al,BYTE PTR [rdi+0x38]` |
| `0xc329a6` | `c329a6:	88 44 24 0f          	mov    BYTE PTR [rsp+0xf],al` |
| `0xc329aa` | `c329aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xc329ad` | `c329ad:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]` |
| `0xc329b1` | `c329b1:	48 8b 70 78          	mov    rsi,QWORD PTR [rax+0x78]` |
| `0xc329b5` | `c329b5:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]` |
| `0xc329ba` | `c329ba:	e8 e9 06 98 00       	call   15b30a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f862c>` |
| `0xc329bf` | `c329bf:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]` |
| `0xc329c4` | `c329c4:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xc329c7` | `c329c7:	4c 89 f7             	mov    rdi,r14` |
| `0xc329ca` | `c329ca:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0xc329cd` | `c329cd:	4c 8d 63 18          	lea    r12,[rbx+0x18]` |
| `0xc329d1` | `c329d1:	4c 8d 6c 24 18       	lea    r13,[rsp+0x18]` |
| `0xc32f30` | `c32f30:	4c 89 f6             	mov    rsi,r14` |
| `0xc32f33` | `c32f33:	e8 08 b0 bb 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xc32f38` | `c32f38:	49 83 c6 18          	add    r14,0x18` |
| `0xc32f3c` | `c32f3c:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xc32f41` | `c32f41:	4c 89 f6             	mov    rsi,r14` |
| `0xc32f44` | `c32f44:	e8 f7 af bb 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xc32f49` | `c32f49:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]` |
| `0xc32f4d` | `c32f4d:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc32f51` | `c32f51:	4c 89 ee             	mov    rsi,r13` |
| `0xc32f54` | `c32f54:	e8 ed 97 98 00       	call   15bc746 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x401cca>` |
| `0xc32f59` | `c32f59:	0f b6 f0             	movzx  esi,al` |
| `0xc32f5c` | `c32f5c:	4c 89 e7             	mov    rdi,r12` |
| `0xc32f5f` | `c32f5f:	e8 de 56 fe ff       	call   c18642 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1655e2>` |
| `0xc32f64` | `c32f64:	4c 89 ef             	mov    rdi,r13` |
| `0xc32f67` | `c32f67:	e8 60 b8 e6 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>` |
| `0xc32f6c` | `c32f6c:	49 83 c6 18          	add    r14,0x18` |
| `0xc330d6` | `c330d6:	00` |
| `0xc330d7` | `c330d7:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0` |
| `0xc330de` | `c330de:	00 00` |
| `0xc330e0` | `c330e0:	8a 47 38             	mov    al,BYTE PTR [rdi+0x38]` |
| `0xc330e3` | `c330e3:	88 44 24 07          	mov    BYTE PTR [rsp+0x7],al` |
| `0xc330e7` | `c330e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xc330ea` | `c330ea:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]` |
| `0xc330ee` | `c330ee:	48 8b 70 78          	mov    rsi,QWORD PTR [rax+0x78]` |
| `0xc330f2` | `c330f2:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]` |
| `0xc330f7` | `c330f7:	e8 ac ff 97 00       	call   15b30a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f862c>` |
| `0xc330fc` | `c330fc:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0` |
| `0xc33102` | `c33102:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xc33105` | `c33105:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0` |
| `0xc3310a` | `c3310a:	0f 11 84 24 a8 00 00 	movups XMMWORD PTR [rsp+0xa8],xmm0` |
| `0xc33111` | `c33111:	00` |
| `0xc33112` | `c33112:	48 8d 05 77 43 c5 00 	lea    rax,[rip+0xc54377]        # 1887490 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x168>` |
| `0xc3396d` | `c3396d:	4c 8d bc 24 f8 00 00 	lea    r15,[rsp+0xf8]` |
| `0xc33974` | `c33974:	00` |
| `0xc33975` | `c33975:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]` |
| `0xc3397a` | `c3397a:	48 89 df             	mov    rdi,rbx` |
| `0xc3397d` | `c3397d:	4c 89 f6             	mov    rsi,r14` |
| `0xc33980` | `c33980:	4c 89 fa             	mov    rdx,r15` |
| `0xc33983` | `c33983:	4c 89 e1             	mov    rcx,r12` |
| `0xc33986` | `c33986:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xc33989` | `c33989:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]` |
| `0xc3398e` | `c3398e:	e8 f3 aa e6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xc33993` | `c33993:	4c 89 ff             	mov    rdi,r15` |
| `0xc33996` | `c33996:	e8 3b 09 00 00       	call   c342d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181276>` |
| `0xc3399b` | `c3399b:	e9 19 05 00 00       	jmp    c33eb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x180e59>` |
| `0xc339a0` | `c339a0:	4c 8d ac 24 f0 03 00 	lea    r13,[rsp+0x3f0]` |
| `0xc339a7` | `c339a7:	00` |
| `0xc339a8` | `c339a8:	49 83 65 08 00       	and    QWORD PTR [r13+0x8],0x0` |
| `0xc34de6` | `c34de6:	49 89 ce             	mov    r14,rcx` |
| `0xc34de9` | `c34de9:	49 89 d4             	mov    r12,rdx` |
| `0xc34dec` | `c34dec:	49 89 f5             	mov    r13,rsi` |
| `0xc34def` | `c34def:	48 83 c7 60          	add    rdi,0x60` |
| `0xc34df3` | `c34df3:	e8 ee d4 98 00       	call   15c22e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786a>` |
| `0xc34df8` | `c34df8:	49 89 c7             	mov    r15,rax` |
| `0xc34dfb` | `c34dfb:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]` |
| `0xc34dff` | `c34dff:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc34e03` | `c34e03:	4c 89 ee             	mov    rsi,r13` |
| `0xc34e06` | `c34e06:	4c 89 e2             	mov    rdx,r12` |
| `0xc34e09` | `c34e09:	e8 e2 e3 97 00       	call   15b31f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8774>` |
| `0xc34e0e` | `c34e0e:	40 b5 01             	mov    bpl,0x1` |
| `0xc34e11` | `c34e11:	84 c0                	test   al,al` |
| `0xc34e13` | `c34e13:	75 1e                	jne    c34e33 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181dd3>` |
| `0xc34e15` | `c34e15:	48 85 db             	test   rbx,rbx` |
| `0xc34e18` | `c34e18:	74 17                	je     c34e31 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181dd1>` |
| `0xc34e1a` | `c34e1a:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]` |
| `0xc34e1e` | `c34e1e:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc34e22` | `c34e22:	4c 89 f6             	mov    rsi,r14` |
| `0xc34e25` | `c34e25:	48 89 da             	mov    rdx,rbx` |
| `0xc34e28` | `c34e28:	e8 c3 e3 97 00       	call   15b31f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f8774>` |
| `0xc34e2d` | `c34e2d:	84 c0                	test   al,al` |
| `0xc34e2f` | `c34e2f:	75 02                	jne    c34e33 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181dd3>` |
| `0xc34e31` | `c34e31:	31 ed                	xor    ebp,ebp` |
| `0xc34e33` | `c34e33:	89 e8                	mov    eax,ebp` |
| `0xc34e35` | `c34e35:	48 83 c4 08          	add    rsp,0x8` |
| `0xc364a8` | `c364a8:	48 89 df             	mov    rdi,rbx` |
| `0xc364ab` | `c364ab:	e8 20 98 e3 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xc364b0` | `c364b0:	e8 fb 95 bb 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xc364b5` | `c364b5:	cc                   	int3` |
| `0xc364b6` | `c364b6:	e9 1f 00 00 00       	jmp    c364da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18347a>` |
| `0xc364bb` | `c364bb:	cc                   	int3` |
| `0xc364bc` | `c364bc:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xc364bf` | `c364bf:	48 8b 78 78          	mov    rdi,QWORD PTR [rax+0x78]` |
| `0xc364c3` | `c364c3:	e9 00 00 00 00       	jmp    c364c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x183468>` |
| `0xc364c8` | `c364c8:	50                   	push   rax` |
| `0xc364c9` | `c364c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xc364cc` | `c364cc:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xc364cf` | `c364cf:	58                   	pop    rax` |
| `0xc364d0` | `c364d0:	c3                   	ret` |
| `0xc364d1` | `c364d1:	48 89 c7             	mov    rdi,rax` |
| `0xc364d4` | `c364d4:	e8 cc 35 e4 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xc38a03` | `c38a03:	48 89 fb             	mov    rbx,rdi` |
| `0xc38a06` | `c38a06:	48 8d 47 10          	lea    rax,[rdi+0x10]` |
| `0xc38a0a` | `c38a0a:	40 8a 2e             	mov    bpl,BYTE PTR [rsi]` |
| `0xc38a0d` | `c38a0d:	48 8b 4f 60          	mov    rcx,QWORD PTR [rdi+0x60]` |
| `0xc38a11` | `c38a11:	48 8b 79 30          	mov    rdi,QWORD PTR [rcx+0x30]` |
| `0xc38a15` | `c38a15:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]` |
| `0xc38a18` | `c38a18:	48 89 c6             	mov    rsi,rax` |
| `0xc38a1b` | `c38a1b:	ff 51 78             	call   QWORD PTR [rcx+0x78]` |
| `0xc38a1e` | `c38a1e:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]` |
| `0xc38a22` | `c38a22:	40 0f b6 f5          	movzx  esi,bpl` |
| `0xc38a26` | `c38a26:	e8 35 ff f4 ff       	call   b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>` |
| `0xc38a2b` | `c38a2b:	48 83 c4 08          	add    rsp,0x8` |
| `0xc38a2f` | `c38a2f:	5b                   	pop    rbx` |
| `0xc38a30` | `c38a30:	5d                   	pop    rbp` |
| `0xc38a31` | `c38a31:	c3                   	ret` |
| `0xc38a32` | `c38a32:	48 89 c7             	mov    rdi,rax` |
| `0xc38cd4` | `c38cd4:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0xc38cd7` | `c38cd7:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]` |
| `0xc38cdc` | `c38cdc:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]` |
| `0xc38ce1` | `c38ce1:	74 0d                	je     c38cf0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x185c90>` |
| `0xc38ce3` | `c38ce3:	49 8b 7d 30          	mov    rdi,QWORD PTR [r13+0x30]` |
| `0xc38ce7` | `c38ce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xc38cea` | `c38cea:	4c 89 f6             	mov    rsi,r14` |
| `0xc38ced` | `c38ced:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xc38cf0` | `c38cf0:	48 8d 44 24 18       	lea    rax,[rsp+0x18]` |
| `0xc38cf5` | `c38cf5:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]` |
| `0xc38cf8` | `c38cf8:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]` |
| `0xc38cfd` | `c38cfd:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0` |
| `0xc38d00` | `c38d00:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]` |
| `0xc38d04` | `c38d04:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx` |
| `0xc38d08` | `c38d08:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xc38d0b` | `c38d0b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0` |
| `0xc3e318` | `c3e318:	4c 89 ee             	mov    rsi,r13` |
| `0xc3e31b` | `c3e31b:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0xc3e31e` | `c3e31e:	49 83 c5 18          	add    r13,0x18` |
| `0xc3e322` | `c3e322:	eb e5                	jmp    c3e309 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18b2a9>` |
| `0xc3e324` | `c3e324:	49 8b 07             	mov    rax,QWORD PTR [r15]` |
| `0xc3e327` | `c3e327:	4c 89 ff             	mov    rdi,r15` |
| `0xc3e32a` | `c3e32a:	4c 89 e6             	mov    rsi,r12` |
| `0xc3e32d` | `c3e32d:	ff 50 78             	call   QWORD PTR [rax+0x78]` |
| `0xc3e330` | `c3e330:	eb 51                	jmp    c3e383 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18b323>` |
| `0xc3e332` | `c3e332:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xc3e335` | `c3e335:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]` |
| `0xc3e339` | `c3e339:	40 0f b6 cd          	movzx  ecx,bpl` |
| `0xc3e33d` | `c3e33d:	6a 01                	push   0x1` |
| `0xc3e33f` | `c3e33f:	41 58                	pop    r8` |
| `0xc3e341` | `c3e341:	4c 89 ff             	mov    rdi,r15` |
| `0xc3e344` | `c3e344:	45 31 c9             	xor    r9d,r9d` |
| `0xc57dd9` | `c57dd9:	4c 89 f2             	mov    rdx,r14` |
| `0xc57ddc` | `c57ddc:	4d 89 e0             	mov    r8,r12` |
| `0xc57ddf` | `c57ddf:	45 31 c9             	xor    r9d,r9d` |
| `0xc57de2` | `c57de2:	e8 43 f6 98 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>` |
| `0xc57de7` | `c57de7:	49 8b 0f             	mov    rcx,QWORD PTR [r15]` |
| `0xc57dea` | `c57dea:	4c 89 ff             	mov    rdi,r15` |
| `0xc57ded` | `c57ded:	89 c6                	mov    esi,eax` |
| `0xc57def` | `c57def:	ff 51 78             	call   QWORD PTR [rcx+0x78]` |
| `0xc57df2` | `c57df2:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]` |
| `0xc57df5` | `c57df5:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]` |
| `0xc57df9` | `c57df9:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0xc57dfc` | `c57dfc:	48 8d 35 cd 35 77 ff 	lea    rsi,[rip+0xffffffffff7735cd]        # 3cb3d0 <_ZTSN5boost9exceptionE@@Base+0x2bdb2>` |
| `0xc57e03` | `c57e03:	48 8d 0d e6 35 77 ff 	lea    rcx,[rip+0xffffffffff7735e6]        # 3cb3f0 <_ZTSN5boost9exceptionE@@Base+0x2bdd2>` |
| `0xc57e0a` | `c57e0a:	4c 89 f2             	mov    rdx,r14` |
| `0xc57e0d` | `c57e0d:	4d 89 e0             	mov    r8,r12` |
| `0xc57e10` | `c57e10:	41 b9 10 27 00 00    	mov    r9d,0x2710` |
| `0xc5f996` | `c5f996:	83 a4 24 60 06 00 00 	and    DWORD PTR [rsp+0x660],0x0` |
| `0xc5f99d` | `c5f99d:	00` |
| `0xc5f99e` | `c5f99e:	c6 84 24 80 06 00 00 	mov    BYTE PTR [rsp+0x680],0x0` |
| `0xc5f9a5` | `c5f9a5:	00` |
| `0xc5f9a6` | `c5f9a6:	0f 11 80 a8 00 00 00 	movups XMMWORD PTR [rax+0xa8],xmm0` |
| `0xc5f9ad` | `c5f9ad:	0f 11 80 98 00 00 00 	movups XMMWORD PTR [rax+0x98],xmm0` |
| `0xc5f9b4` | `c5f9b4:	0f 11 80 88 00 00 00 	movups XMMWORD PTR [rax+0x88],xmm0` |
| `0xc5f9bb` | `c5f9bb:	0f 11 40 78          	movups XMMWORD PTR [rax+0x78],xmm0` |
| `0xc5f9bf` | `c5f9bf:	48 83 a0 b8 00 00 00 	and    QWORD PTR [rax+0xb8],0x0` |
| `0xc5f9c6` | `c5f9c6:	00` |
| `0xc5f9c7` | `c5f9c7:	4c 89 fd             	mov    rbp,r15` |
| `0xc5f9ca` | `c5f9ca:	4c 89 ff             	mov    rdi,r15` |
| `0xc5f9cd` | `c5f9cd:	48 8d b4 24 28 03 00 	lea    rsi,[rsp+0x328]` |
| `0xc5f9d4` | `c5f9d4:	00` |
| `0xc5f9d5` | `c5f9d5:	e8 2c aa a6 00       	call   16ca406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e572>` |
| `0xc5f9da` | `c5f9da:	c6 84 24 09 06 00 00 	mov    BYTE PTR [rsp+0x609],0x1` |
| `0xc61411` | `c61411:	48 83 ec 18          	sub    rsp,0x18` |
| `0xc61415` | `c61415:	48 89 f2             	mov    rdx,rsi` |
| `0xc61418` | `c61418:	48 89 fe             	mov    rsi,rdi` |
| `0xc6141b` | `c6141b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xc61422` | `c61422:	00 00` |
| `0xc61424` | `c61424:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xc61429` | `c61429:	8b 4f 78             	mov    ecx,DWORD PTR [rdi+0x78]` |
| ... | truncated 10799 more |

## Relocation entries that could serve as AP+0x78

| possible_ap | +0x78 target | relocation |
|---:|---:|---|
| `0x1800000` | `0x18bc7c8` | `0000000001800078  0000000000000008 R_X86_64_RELATIVE                         18bc7c8` |
| `0x1800008` | `0x18bc788` | `0000000001800080  0000000000000008 R_X86_64_RELATIVE                         18bc788` |
| `0x1800010` | `0x18bc748` | `0000000001800088  0000000000000008 R_X86_64_RELATIVE                         18bc748` |
| `0x1800018` | `0x18bc7e8` | `0000000001800090  0000000000000008 R_X86_64_RELATIVE                         18bc7e8` |
| `0x1800020` | `0x18bc858` | `0000000001800098  0000000000000008 R_X86_64_RELATIVE                         18bc858` |
| `0x1800028` | `0x18bc9e0` | `00000000018000a0  0000000000000008 R_X86_64_RELATIVE                         18bc9e0` |
| `0x1800030` | `0x18bc8e8` | `00000000018000a8  0000000000000008 R_X86_64_RELATIVE                         18bc8e8` |
| `0x1800048` | `0xaaab0e` | `00000000018000c0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1800050` | `0xaaab26` | `00000000018000c8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1800058` | `0x174ec6a` | `00000000018000d0  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1800060` | `0x174f1dc` | `00000000018000d8  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1800068` | `0xac0f86` | `00000000018000e0  0000000000000008 R_X86_64_RELATIVE                         ac0f86` |
| `0x1800070` | `0x174ef82` | `00000000018000e8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1800088` | `0xaaab0e` | `0000000001800100  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1800090` | `0xaaab26` | `0000000001800108  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1800098` | `0x174ec6a` | `0000000001800110  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18000a0` | `0x174f1dc` | `0000000001800118  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18000a8` | `0xac1034` | `0000000001800120  0000000000000008 R_X86_64_RELATIVE                         ac1034` |
| `0x18000b0` | `0x174ef82` | `0000000001800128  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x18000c8` | `0xaaa9b2` | `0000000001800140  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x18000d0` | `0xaaa9bc` | `0000000001800148  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x18000d8` | `0x174ec6a` | `0000000001800150  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18000e0` | `0x174f1dc` | `0000000001800158  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18000e8` | `0xac0fc2` | `0000000001800160  0000000000000008 R_X86_64_RELATIVE                         ac0fc2` |
| `0x18000f0` | `0x174ef82` | `0000000001800168  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1800108` | `0xabe9e4` | `0000000001800180  0000000000000008 R_X86_64_RELATIVE                         abe9e4` |
| `0x1800110` | `0xabea04` | `0000000001800188  0000000000000008 R_X86_64_RELATIVE                         abea04` |
| `0x1800118` | `0x174ec6a` | `0000000001800190  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1800120` | `0x174f1dc` | `0000000001800198  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1800128` | `0xac1070` | `00000000018001a0  0000000000000008 R_X86_64_RELATIVE                         ac1070` |
| `0x1800130` | `0x174ef82` | `00000000018001a8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1800148` | `0xaaab0e` | `00000000018001c0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1800150` | `0xaaab26` | `00000000018001c8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1800158` | `0x174ec6a` | `00000000018001d0  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1800160` | `0x174f1dc` | `00000000018001d8  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1800168` | `0xac0ff8` | `00000000018001e0  0000000000000008 R_X86_64_RELATIVE                         ac0ff8` |
| `0x1800170` | `0x174ef82` | `00000000018001e8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1800188` | `0xac10b0` | `0000000001800200  0000000000000008 R_X86_64_RELATIVE                         ac10b0` |
| `0x1800190` | `0xac1112` | `0000000001800208  0000000000000008 R_X86_64_RELATIVE                         ac1112` |
| `0x1800198` | `0x174ec6a` | `0000000001800210  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18001a0` | `0x174f1dc` | `0000000001800218  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18001a8` | `0xac1124` | `0000000001800220  0000000000000008 R_X86_64_RELATIVE                         ac1124` |
| `0x18001b0` | `0x174ef82` | `0000000001800228  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x18001b8` | `0x18bdf30` | `0000000001800230  0000000000000008 R_X86_64_RELATIVE                         18bdf30` |
| `0x18001c0` | `0x18bdee8` | `0000000001800238  0000000000000008 R_X86_64_RELATIVE                         18bdee8` |
| `0x18001c8` | `0x18bdea8` | `0000000001800240  0000000000000008 R_X86_64_RELATIVE                         18bdea8` |
| `0x18001d0` | `0x18bdf10` | `0000000001800248  0000000000000008 R_X86_64_RELATIVE                         18bdf10` |
| `0x18001d8` | `0x18bdec8` | `0000000001800250  0000000000000008 R_X86_64_RELATIVE                         18bdec8` |
| `0x18001e0` | `0x18bde88` | `0000000001800258  0000000000000008 R_X86_64_RELATIVE                         18bde88` |
| `0x18001e8` | `0x372999` | `0000000001800260  0000000000000008 R_X86_64_RELATIVE                         372999` |
| `0x18001f0` | `0x451f74` | `0000000001800268  0000000000000008 R_X86_64_RELATIVE                         451f74` |
| `0x18001f8` | `0xac116c` | `0000000001800270  0000000000000008 R_X86_64_RELATIVE                         ac116c` |
| `0x1800200` | `0x32a2b1` | `0000000001800278  0000000000000008 R_X86_64_RELATIVE                         32a2b1` |
| `0x1800208` | `0x35b706` | `0000000001800280  0000000000000008 R_X86_64_RELATIVE                         35b706` |
| `0x1800210` | `0xac11b6` | `0000000001800288  0000000000000008 R_X86_64_RELATIVE                         ac11b6` |
| `0x1800218` | `0x32a2b1` | `0000000001800290  0000000000000008 R_X86_64_RELATIVE                         32a2b1` |
| `0x1800220` | `0x36f53b` | `0000000001800298  0000000000000008 R_X86_64_RELATIVE                         36f53b` |
| `0x1800228` | `0xac11f8` | `00000000018002a0  0000000000000008 R_X86_64_RELATIVE                         ac11f8` |
| `0x1800230` | `0x33aaa4` | `00000000018002a8  0000000000000008 R_X86_64_RELATIVE                         33aaa4` |
| `0x1800238` | `0x38806d` | `00000000018002b0  0000000000000008 R_X86_64_RELATIVE                         38806d` |
| `0x1800240` | `0xac123a` | `00000000018002b8  0000000000000008 R_X86_64_RELATIVE                         ac123a` |
| `0x1800248` | `0x389583` | `00000000018002c0  0000000000000008 R_X86_64_RELATIVE                         389583` |
| `0x1800250` | `0x38806d` | `00000000018002c8  0000000000000008 R_X86_64_RELATIVE                         38806d` |
| `0x1800258` | `0xac1254` | `00000000018002d0  0000000000000008 R_X86_64_RELATIVE                         ac1254` |
| `0x1800260` | `0x36f9b8` | `00000000018002d8  0000000000000008 R_X86_64_RELATIVE                         36f9b8` |
| `0x1800268` | `0x38806d` | `00000000018002e0  0000000000000008 R_X86_64_RELATIVE                         38806d` |
| `0x1800270` | `0xac126e` | `00000000018002e8  0000000000000008 R_X86_64_RELATIVE                         ac126e` |
| `0x1800278` | `0x354fec` | `00000000018002f0  0000000000000008 R_X86_64_RELATIVE                         354fec` |
| `0x1800280` | `0x382758` | `00000000018002f8  0000000000000008 R_X86_64_RELATIVE                         382758` |
| `0x1800288` | `0xac1288` | `0000000001800300  0000000000000008 R_X86_64_RELATIVE                         ac1288` |
| `0x1800290` | `0x347868` | `0000000001800308  0000000000000008 R_X86_64_RELATIVE                         347868` |
| `0x1800298` | `0x451f74` | `0000000001800310  0000000000000008 R_X86_64_RELATIVE                         451f74` |
| `0x18002a0` | `0xac12a2` | `0000000001800318  0000000000000008 R_X86_64_RELATIVE                         ac12a2` |
| `0x18002a8` | `0x37f488` | `0000000001800320  0000000000000008 R_X86_64_RELATIVE                         37f488` |
| `0x18002b0` | `0x451f74` | `0000000001800328  0000000000000008 R_X86_64_RELATIVE                         451f74` |
| `0x18002b8` | `0xac12bc` | `0000000001800330  0000000000000008 R_X86_64_RELATIVE                         ac12bc` |
| `0x18002c0` | `0x33aabf` | `0000000001800338  0000000000000008 R_X86_64_RELATIVE                         33aabf` |
| `0x18002c8` | `0x358493` | `0000000001800340  0000000000000008 R_X86_64_RELATIVE                         358493` |
| `0x18002d0` | `0xac12d6` | `0000000001800348  0000000000000008 R_X86_64_RELATIVE                         ac12d6` |
| `0x18002e8` | `0x9d7de0` | `0000000001800360  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18002f0` | `0xa50370` | `0000000001800368  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18002f8` | `0xac132e` | `0000000001800370  0000000000000008 R_X86_64_RELATIVE                         ac132e` |
| `0x1800300` | `0xac1506` | `0000000001800378  0000000000000008 R_X86_64_RELATIVE                         ac1506` |
| `0x1800318` | `0xac3ba0` | `0000000001800390  0000000000000008 R_X86_64_RELATIVE                         ac3ba0` |
| `0x1800320` | `0xac3c0c` | `0000000001800398  0000000000000008 R_X86_64_RELATIVE                         ac3c0c` |
| `0x1800328` | `0x9d7de0` | `00000000018003a0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800330` | `0xac3c1e` | `00000000018003a8  0000000000000008 R_X86_64_RELATIVE                         ac3c1e` |
| `0x1800338` | `0xac3c26` | `00000000018003b0  0000000000000008 R_X86_64_RELATIVE                         ac3c26` |
| `0x1800340` | `0xac3d1a` | `00000000018003b8  0000000000000008 R_X86_64_RELATIVE                         ac3d1a` |
| `0x1800348` | `0xac3e08` | `00000000018003c0  0000000000000008 R_X86_64_RELATIVE                         ac3e08` |
| `0x1800360` | `0x9d7de0` | `00000000018003d8  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800368` | `0xa50370` | `00000000018003e0  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800370` | `0xac3b56` | `00000000018003e8  0000000000000008 R_X86_64_RELATIVE                         ac3b56` |
| `0x1800378` | `0xac3b76` | `00000000018003f0  0000000000000008 R_X86_64_RELATIVE                         ac3b76` |
| `0x1800380` | `0x9d7de0` | `00000000018003f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800388` | `0xa50370` | `0000000001800400  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800390` | `0xac3b8a` | `0000000001800408  0000000000000008 R_X86_64_RELATIVE                         ac3b8a` |
| `0x18003a8` | `0xac3ae6` | `0000000001800420  0000000000000008 R_X86_64_RELATIVE                         ac3ae6` |
| `0x18003b0` | `0xac3af6` | `0000000001800428  0000000000000008 R_X86_64_RELATIVE                         ac3af6` |
| `0x18003b8` | `0xac3b08` | `0000000001800430  0000000000000008 R_X86_64_RELATIVE                         ac3b08` |
| `0x18003c8` | `0xa50370` | `0000000001800440  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18003e0` | `0x9d7de0` | `0000000001800458  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18003e8` | `0xa50370` | `0000000001800460  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18003f0` | `0xac4414` | `0000000001800468  0000000000000008 R_X86_64_RELATIVE                         ac4414` |
| `0x18003f8` | `0xac442a` | `0000000001800470  0000000000000008 R_X86_64_RELATIVE                         ac442a` |
| `0x1800400` | `0x9d7de0` | `0000000001800478  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800408` | `0xa50370` | `0000000001800480  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800410` | `0xac4436` | `0000000001800488  0000000000000008 R_X86_64_RELATIVE                         ac4436` |
| `0x1800428` | `0x9d7de0` | `00000000018004a0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800430` | `0xa50370` | `00000000018004a8  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800438` | `0xac43e6` | `00000000018004b0  0000000000000008 R_X86_64_RELATIVE                         ac43e6` |
| `0x1800440` | `0xac43fc` | `00000000018004b8  0000000000000008 R_X86_64_RELATIVE                         ac43fc` |
| `0x1800448` | `0x9d7de0` | `00000000018004c0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800450` | `0xa50370` | `00000000018004c8  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800458` | `0xac4408` | `00000000018004d0  0000000000000008 R_X86_64_RELATIVE                         ac4408` |
| `0x1800470` | `0xaa0bd8` | `00000000018004e8  0000000000000008 R_X86_64_RELATIVE                         aa0bd8` |
| `0x1800478` | `0xaa0bde` | `00000000018004f0  0000000000000008 R_X86_64_RELATIVE                         aa0bde` |
| `0x1800480` | `0xac48a8` | `00000000018004f8  0000000000000008 R_X86_64_RELATIVE                         ac48a8` |
| `0x1800488` | `0xac48c6` | `0000000001800500  0000000000000008 R_X86_64_RELATIVE                         ac48c6` |
| `0x1800490` | `0x9d7de0` | `0000000001800508  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800498` | `0x9d7de0` | `0000000001800510  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18004a0` | `0x9d7de0` | `0000000001800518  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18004b8` | `0xaa0ca6` | `0000000001800530  0000000000000008 R_X86_64_RELATIVE                         aa0ca6` |
| `0x18004c0` | `0xaa0cb0` | `0000000001800538  0000000000000008 R_X86_64_RELATIVE                         aa0cb0` |
| `0x18004c8` | `0xac4b06` | `0000000001800540  0000000000000008 R_X86_64_RELATIVE                         ac4b06` |
| `0x18004d0` | `0x9d7de0` | `0000000001800548  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18004d8` | `0x9d7de0` | `0000000001800550  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18004e0` | `0x9d7de0` | `0000000001800558  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18004f8` | `0xac487c` | `0000000001800570  0000000000000008 R_X86_64_RELATIVE                         ac487c` |
| `0x1800500` | `0xac488c` | `0000000001800578  0000000000000008 R_X86_64_RELATIVE                         ac488c` |
| `0x1800508` | `0xac489e` | `0000000001800580  0000000000000008 R_X86_64_RELATIVE                         ac489e` |
| `0x1800518` | `0xa50370` | `0000000001800590  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800530` | `0xac4e58` | `00000000018005a8  0000000000000008 R_X86_64_RELATIVE                         ac4e58` |
| `0x1800538` | `0xac4f30` | `00000000018005b0  0000000000000008 R_X86_64_RELATIVE                         ac4f30` |
| `0x1800540` | `0xac4f42` | `00000000018005b8  0000000000000008 R_X86_64_RELATIVE                         ac4f42` |
| `0x1800548` | `0xac4fb4` | `00000000018005c0  0000000000000008 R_X86_64_RELATIVE                         ac4fb4` |
| `0x1800550` | `0xac507a` | `00000000018005c8  0000000000000008 R_X86_64_RELATIVE                         ac507a` |
| `0x1800568` | `0xac50e4` | `00000000018005e0  0000000000000008 R_X86_64_RELATIVE                         ac50e4` |
| `0x1800570` | `0xac50ee` | `00000000018005e8  0000000000000008 R_X86_64_RELATIVE                         ac50ee` |
| `0x1800578` | `0xac50f8` | `00000000018005f0  0000000000000008 R_X86_64_RELATIVE                         ac50f8` |
| `0x1800580` | `0xac5102` | `00000000018005f8  0000000000000008 R_X86_64_RELATIVE                         ac5102` |
| `0x1800598` | `0xac4c26` | `0000000001800610  0000000000000008 R_X86_64_RELATIVE                         ac4c26` |
| `0x18005a0` | `0xac4c3a` | `0000000001800618  0000000000000008 R_X86_64_RELATIVE                         ac4c3a` |
| `0x18005a8` | `0x9d7de0` | `0000000001800620  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18005b0` | `0xac4c4c` | `0000000001800628  0000000000000008 R_X86_64_RELATIVE                         ac4c4c` |
| `0x18005c8` | `0xac51ec` | `0000000001800640  0000000000000008 R_X86_64_RELATIVE                         ac51ec` |
| `0x18005d0` | `0xac5248` | `0000000001800648  0000000000000008 R_X86_64_RELATIVE                         ac5248` |
| `0x18005d8` | `0x9d7de0` | `0000000001800650  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18005e0` | `0xac525a` | `0000000001800658  0000000000000008 R_X86_64_RELATIVE                         ac525a` |
| `0x18005e8` | `0xac52c0` | `0000000001800660  0000000000000008 R_X86_64_RELATIVE                         ac52c0` |
| `0x18005f0` | `0xac53c0` | `0000000001800668  0000000000000008 R_X86_64_RELATIVE                         ac53c0` |
| `0x1800608` | `0xac5e98` | `0000000001800680  0000000000000008 R_X86_64_RELATIVE                         ac5e98` |
| `0x1800610` | `0xac5f70` | `0000000001800688  0000000000000008 R_X86_64_RELATIVE                         ac5f70` |
| `0x1800618` | `0xac5f82` | `0000000001800690  0000000000000008 R_X86_64_RELATIVE                         ac5f82` |
| `0x1800620` | `0xac5ff4` | `0000000001800698  0000000000000008 R_X86_64_RELATIVE                         ac5ff4` |
| `0x1800628` | `0xac507a` | `00000000018006a0  0000000000000008 R_X86_64_RELATIVE                         ac507a` |
| `0x1800640` | `0xac60ba` | `00000000018006b8  0000000000000008 R_X86_64_RELATIVE                         ac60ba` |
| `0x1800648` | `0xac60c4` | `00000000018006c0  0000000000000008 R_X86_64_RELATIVE                         ac60c4` |
| `0x1800650` | `0xac60ce` | `00000000018006c8  0000000000000008 R_X86_64_RELATIVE                         ac60ce` |
| `0x1800658` | `0xac5102` | `00000000018006d0  0000000000000008 R_X86_64_RELATIVE                         ac5102` |
| `0x1800670` | `0xac5ca8` | `00000000018006e8  0000000000000008 R_X86_64_RELATIVE                         ac5ca8` |
| `0x1800678` | `0xac5cbc` | `00000000018006f0  0000000000000008 R_X86_64_RELATIVE                         ac5cbc` |
| `0x1800680` | `0x9d7de0` | `00000000018006f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800688` | `0xac5cce` | `0000000001800700  0000000000000008 R_X86_64_RELATIVE                         ac5cce` |
| `0x18006a0` | `0xac60ec` | `0000000001800718  0000000000000008 R_X86_64_RELATIVE                         ac60ec` |
| `0x18006a8` | `0xac6156` | `0000000001800720  0000000000000008 R_X86_64_RELATIVE                         ac6156` |
| `0x18006b0` | `0x9d7de0` | `0000000001800728  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18006b8` | `0xac6168` | `0000000001800730  0000000000000008 R_X86_64_RELATIVE                         ac6168` |
| `0x18006c0` | `0xac61ce` | `0000000001800738  0000000000000008 R_X86_64_RELATIVE                         ac61ce` |
| `0x18006c8` | `0xac62ce` | `0000000001800740  0000000000000008 R_X86_64_RELATIVE                         ac62ce` |
| `0x18006d8` | `0x348c74` | `0000000001800750  0000000000000008 R_X86_64_RELATIVE                         348c74` |
| `0x18006e0` | `0x326aa6` | `0000000001800758  0000000000000008 R_X86_64_RELATIVE                         326aa6` |
| `0x18006e8` | `0xac6a72` | `0000000001800760  0000000000000008 R_X86_64_RELATIVE                         ac6a72` |
| `0x1800700` | `0xac97d6` | `0000000001800778  0000000000000008 R_X86_64_RELATIVE                         ac97d6` |
| `0x1800708` | `0xac97ea` | `0000000001800780  0000000000000008 R_X86_64_RELATIVE                         ac97ea` |
| `0x1800710` | `0x9d7de0` | `0000000001800788  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800718` | `0xac97fc` | `0000000001800790  0000000000000008 R_X86_64_RELATIVE                         ac97fc` |
| `0x1800720` | `0xac9990` | `0000000001800798  0000000000000008 R_X86_64_RELATIVE                         ac9990` |
| `0x1800728` | `0xac99a6` | `00000000018007a0  0000000000000008 R_X86_64_RELATIVE                         ac99a6` |
| `0x1800730` | `0xac9a54` | `00000000018007a8  0000000000000008 R_X86_64_RELATIVE                         ac9a54` |
| `0x1800738` | `0xac9af0` | `00000000018007b0  0000000000000008 R_X86_64_RELATIVE                         ac9af0` |
| `0x1800740` | `0xac9b5a` | `00000000018007b8  0000000000000008 R_X86_64_RELATIVE                         ac9b5a` |
| `0x1800748` | `0xac9b70` | `00000000018007c0  0000000000000008 R_X86_64_RELATIVE                         ac9b70` |
| `0x1800750` | `0xac9bd2` | `00000000018007c8  0000000000000008 R_X86_64_RELATIVE                         ac9bd2` |
| `0x1800768` | `0xaa0bd8` | `00000000018007e0  0000000000000008 R_X86_64_RELATIVE                         aa0bd8` |
| `0x1800770` | `0xaa0bde` | `00000000018007e8  0000000000000008 R_X86_64_RELATIVE                         aa0bde` |
| `0x1800778` | `0xac8a1e` | `00000000018007f0  0000000000000008 R_X86_64_RELATIVE                         ac8a1e` |
| `0x1800780` | `0xac8b20` | `00000000018007f8  0000000000000008 R_X86_64_RELATIVE                         ac8b20` |
| `0x1800788` | `0xac8d90` | `0000000001800800  0000000000000008 R_X86_64_RELATIVE                         ac8d90` |
| `0x1800790` | `0xac8e28` | `0000000001800808  0000000000000008 R_X86_64_RELATIVE                         ac8e28` |
| `0x1800798` | `0xac8f9e` | `0000000001800810  0000000000000008 R_X86_64_RELATIVE                         ac8f9e` |
| `0x18007a0` | `0xac90b8` | `0000000001800818  0000000000000008 R_X86_64_RELATIVE                         ac90b8` |
| `0x18007a8` | `0xac9194` | `0000000001800820  0000000000000008 R_X86_64_RELATIVE                         ac9194` |
| `0x18007b0` | `0xac923c` | `0000000001800828  0000000000000008 R_X86_64_RELATIVE                         ac923c` |
| `0x18007b8` | `0xac9314` | `0000000001800830  0000000000000008 R_X86_64_RELATIVE                         ac9314` |
| `0x18007d0` | `0xaa0ca6` | `0000000001800848  0000000000000008 R_X86_64_RELATIVE                         aa0ca6` |
| `0x18007d8` | `0xaa0cb0` | `0000000001800850  0000000000000008 R_X86_64_RELATIVE                         aa0cb0` |
| `0x18007e0` | `0xac95b2` | `0000000001800858  0000000000000008 R_X86_64_RELATIVE                         ac95b2` |
| `0x18007e8` | `0xac95bc` | `0000000001800860  0000000000000008 R_X86_64_RELATIVE                         ac95bc` |
| `0x18007f0` | `0xac95c6` | `0000000001800868  0000000000000008 R_X86_64_RELATIVE                         ac95c6` |
| `0x18007f8` | `0xac95d8` | `0000000001800870  0000000000000008 R_X86_64_RELATIVE                         ac95d8` |
| `0x1800800` | `0xac95e2` | `0000000001800878  0000000000000008 R_X86_64_RELATIVE                         ac95e2` |
| `0x1800808` | `0xac95ec` | `0000000001800880  0000000000000008 R_X86_64_RELATIVE                         ac95ec` |
| `0x1800810` | `0xac95f6` | `0000000001800888  0000000000000008 R_X86_64_RELATIVE                         ac95f6` |
| `0x1800818` | `0xac9600` | `0000000001800890  0000000000000008 R_X86_64_RELATIVE                         ac9600` |
| `0x1800830` | `0x9d7de0` | `00000000018008a8  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800838` | `0xa50370` | `00000000018008b0  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800840` | `0xac9d46` | `00000000018008b8  0000000000000008 R_X86_64_RELATIVE                         ac9d46` |
| `0x1800858` | `0xacc7aa` | `00000000018008d0  0000000000000008 R_X86_64_RELATIVE                         acc7aa` |
| `0x1800860` | `0xacc7ba` | `00000000018008d8  0000000000000008 R_X86_64_RELATIVE                         acc7ba` |
| `0x1800868` | `0x9d7de0` | `00000000018008e0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800878` | `0xa50370` | `00000000018008f0  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800890` | `0xacc442` | `0000000001800908  0000000000000008 R_X86_64_RELATIVE                         acc442` |
| `0x1800898` | `0xacc504` | `0000000001800910  0000000000000008 R_X86_64_RELATIVE                         acc504` |
| `0x18008a0` | `0xacc516` | `0000000001800918  0000000000000008 R_X86_64_RELATIVE                         acc516` |
| `0x18008a8` | `0xacc51e` | `0000000001800920  0000000000000008 R_X86_64_RELATIVE                         acc51e` |
| `0x18008b0` | `0xacc526` | `0000000001800928  0000000000000008 R_X86_64_RELATIVE                         acc526` |
| `0x18008b8` | `0xacc5b8` | `0000000001800930  0000000000000008 R_X86_64_RELATIVE                         acc5b8` |
| `0x18008c0` | `0xacc64a` | `0000000001800938  0000000000000008 R_X86_64_RELATIVE                         acc64a` |
| `0x18008c8` | `0xacc652` | `0000000001800940  0000000000000008 R_X86_64_RELATIVE                         acc652` |
| `0x18008d0` | `0xacc6d0` | `0000000001800948  0000000000000008 R_X86_64_RELATIVE                         acc6d0` |
| `0x18008d8` | `0xacc712` | `0000000001800950  0000000000000008 R_X86_64_RELATIVE                         acc712` |
| `0x18008e0` | `0xacc730` | `0000000001800958  0000000000000008 R_X86_64_RELATIVE                         acc730` |
| `0x18008e8` | `0xacc742` | `0000000001800960  0000000000000008 R_X86_64_RELATIVE                         acc742` |
| `0x18008f0` | `0xacc74a` | `0000000001800968  0000000000000008 R_X86_64_RELATIVE                         acc74a` |
| `0x18008f8` | `0xacc730` | `0000000001800970  0000000000000008 R_X86_64_RELATIVE                         acc730` |
| `0x1800910` | `0xacc752` | `0000000001800988  0000000000000008 R_X86_64_RELATIVE                         acc752` |
| `0x1800918` | `0xacc75c` | `0000000001800990  0000000000000008 R_X86_64_RELATIVE                         acc75c` |
| `0x1800930` | `0x9d7de0` | `00000000018009a8  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800938` | `0xa50370` | `00000000018009b0  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800940` | `0xacc824` | `00000000018009b8  0000000000000008 R_X86_64_RELATIVE                         acc824` |
| `0x1800958` | `0xacf0e4` | `00000000018009d0  0000000000000008 R_X86_64_RELATIVE                         acf0e4` |
| `0x1800960` | `0xacf140` | `00000000018009d8  0000000000000008 R_X86_64_RELATIVE                         acf140` |
| `0x1800968` | `0xa4b870` | `00000000018009e0  0000000000000008 R_X86_64_RELATIVE                         a4b870` |
| `0x1800970` | `0xacf152` | `00000000018009e8  0000000000000008 R_X86_64_RELATIVE                         acf152` |
| `0x1800978` | `0xacf158` | `00000000018009f0  0000000000000008 R_X86_64_RELATIVE                         acf158` |
| `0x1800980` | `0xacf15e` | `00000000018009f8  0000000000000008 R_X86_64_RELATIVE                         acf15e` |
| `0x1800988` | `0xacf1cc` | `0000000001800a00  0000000000000008 R_X86_64_RELATIVE                         acf1cc` |
| `0x18009a0` | `0xacf22c` | `0000000001800a18  0000000000000008 R_X86_64_RELATIVE                         acf22c` |
| `0x18009a8` | `0xacf236` | `0000000001800a20  0000000000000008 R_X86_64_RELATIVE                         acf236` |
| `0x18009c0` | `0xacef58` | `0000000001800a38  0000000000000008 R_X86_64_RELATIVE                         acef58` |
| `0x18009c8` | `0xacef6c` | `0000000001800a40  0000000000000008 R_X86_64_RELATIVE                         acef6c` |
| `0x18009d0` | `0xacef7e` | `0000000001800a48  0000000000000008 R_X86_64_RELATIVE                         acef7e` |
| `0x18009d8` | `0xacf01e` | `0000000001800a50  0000000000000008 R_X86_64_RELATIVE                         acf01e` |
| `0x18009e0` | `0xacef26` | `0000000001800a58  0000000000000008 R_X86_64_RELATIVE                         acef26` |
| `0x18009e8` | `0xacef30` | `0000000001800a60  0000000000000008 R_X86_64_RELATIVE                         acef30` |
| `0x18009f0` | `0xacef46` | `0000000001800a68  0000000000000008 R_X86_64_RELATIVE                         acef46` |
| `0x1800a08` | `0xacee46` | `0000000001800a80  0000000000000008 R_X86_64_RELATIVE                         acee46` |
| `0x1800a10` | `0xacee5a` | `0000000001800a88  0000000000000008 R_X86_64_RELATIVE                         acee5a` |
| `0x1800a18` | `0xacee6c` | `0000000001800a90  0000000000000008 R_X86_64_RELATIVE                         acee6c` |
| `0x1800a20` | `0xacef0c` | `0000000001800a98  0000000000000008 R_X86_64_RELATIVE                         acef0c` |
| `0x1800a28` | `0xacef26` | `0000000001800aa0  0000000000000008 R_X86_64_RELATIVE                         acef26` |
| `0x1800a30` | `0xacef30` | `0000000001800aa8  0000000000000008 R_X86_64_RELATIVE                         acef30` |
| `0x1800a38` | `0xacef46` | `0000000001800ab0  0000000000000008 R_X86_64_RELATIVE                         acef46` |
| `0x1800a50` | `0xad09a6` | `0000000001800ac8  0000000000000008 R_X86_64_RELATIVE                         ad09a6` |
| `0x1800a58` | `0xad0a08` | `0000000001800ad0  0000000000000008 R_X86_64_RELATIVE                         ad0a08` |
| `0x1800a60` | `0xad0a1a` | `0000000001800ad8  0000000000000008 R_X86_64_RELATIVE                         ad0a1a` |
| `0x1800a68` | `0x9d7de0` | `0000000001800ae0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800a70` | `0xad0a32` | `0000000001800ae8  0000000000000008 R_X86_64_RELATIVE                         ad0a32` |
| `0x1800a78` | `0xad0b78` | `0000000001800af0  0000000000000008 R_X86_64_RELATIVE                         ad0b78` |
| `0x1800a80` | `0xad0ba4` | `0000000001800af8  0000000000000008 R_X86_64_RELATIVE                         ad0ba4` |
| `0x1800a88` | `0xaa712a` | `0000000001800b00  0000000000000008 R_X86_64_RELATIVE                         aa712a` |
| `0x1800a90` | `0xad0c38` | `0000000001800b08  0000000000000008 R_X86_64_RELATIVE                         ad0c38` |
| `0x1800aa8` | `0xad0cb4` | `0000000001800b20  0000000000000008 R_X86_64_RELATIVE                         ad0cb4` |
| `0x1800ab0` | `0xad0cbe` | `0000000001800b28  0000000000000008 R_X86_64_RELATIVE                         ad0cbe` |
| `0x1800ac8` | `0xad0f6a` | `0000000001800b40  0000000000000008 R_X86_64_RELATIVE                         ad0f6a` |
| `0x1800ad0` | `0xad0f7a` | `0000000001800b48  0000000000000008 R_X86_64_RELATIVE                         ad0f7a` |
| `0x1800ad8` | `0xad0f8c` | `0000000001800b50  0000000000000008 R_X86_64_RELATIVE                         ad0f8c` |
| `0x1800ae8` | `0xa50370` | `0000000001800b60  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800b00` | `0xad0ee6` | `0000000001800b78  0000000000000008 R_X86_64_RELATIVE                         ad0ee6` |
| `0x1800b08` | `0xad0efa` | `0000000001800b80  0000000000000008 R_X86_64_RELATIVE                         ad0efa` |
| `0x1800b10` | `0xad0f0c` | `0000000001800b88  0000000000000008 R_X86_64_RELATIVE                         ad0f0c` |
| `0x1800b18` | `0xad0f3a` | `0000000001800b90  0000000000000008 R_X86_64_RELATIVE                         ad0f3a` |
| `0x1800b20` | `0xaae9b2` | `0000000001800b98  0000000000000008 R_X86_64_RELATIVE                         aae9b2` |
| `0x1800b28` | `0xaae9bc` | `0000000001800ba0  0000000000000008 R_X86_64_RELATIVE                         aae9bc` |
| `0x1800b30` | `0xad0f60` | `0000000001800ba8  0000000000000008 R_X86_64_RELATIVE                         ad0f60` |
| `0x1800b48` | `0x9d7de0` | `0000000001800bc0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800b50` | `0xa50370` | `0000000001800bc8  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800b58` | `0xacf56e` | `0000000001800bd0  0000000000000008 R_X86_64_RELATIVE                         acf56e` |
| `0x1800b70` | `0xaa0bd8` | `0000000001800be8  0000000000000008 R_X86_64_RELATIVE                         aa0bd8` |
| `0x1800b78` | `0xaa0bde` | `0000000001800bf0  0000000000000008 R_X86_64_RELATIVE                         aa0bde` |
| `0x1800b80` | `0xad1048` | `0000000001800bf8  0000000000000008 R_X86_64_RELATIVE                         ad1048` |
| `0x1800b88` | `0xad1066` | `0000000001800c00  0000000000000008 R_X86_64_RELATIVE                         ad1066` |
| `0x1800b90` | `0xad1198` | `0000000001800c08  0000000000000008 R_X86_64_RELATIVE                         ad1198` |
| `0x1800ba8` | `0xaa0ca6` | `0000000001800c20  0000000000000008 R_X86_64_RELATIVE                         aa0ca6` |
| `0x1800bb0` | `0xaa0cb0` | `0000000001800c28  0000000000000008 R_X86_64_RELATIVE                         aa0cb0` |
| `0x1800bb8` | `0xad11b6` | `0000000001800c30  0000000000000008 R_X86_64_RELATIVE                         ad11b6` |
| `0x1800bc0` | `0xad11c0` | `0000000001800c38  0000000000000008 R_X86_64_RELATIVE                         ad11c0` |
| `0x1800bc8` | `0x17c14f8` | `0000000001800c40  0000000000000008 R_X86_64_RELATIVE                         17c14f8` |
| `0x1800be0` | `0xad11de` | `0000000001800c58  0000000000000008 R_X86_64_RELATIVE                         ad11de` |
| `0x1800be8` | `0xad11f2` | `0000000001800c60  0000000000000008 R_X86_64_RELATIVE                         ad11f2` |
| `0x1800bf0` | `0x9d7de0` | `0000000001800c68  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800bf8` | `0xad1204` | `0000000001800c70  0000000000000008 R_X86_64_RELATIVE                         ad1204` |
| `0x1800c08` | `0x3827d4` | `0000000001800c80  0000000000000008 R_X86_64_RELATIVE                         3827d4` |
| `0x1800c10` | `0x32d53e` | `0000000001800c88  0000000000000008 R_X86_64_RELATIVE                         32d53e` |
| `0x1800c18` | `0xad178a` | `0000000001800c90  0000000000000008 R_X86_64_RELATIVE                         ad178a` |
| `0x1800c20` | `0x35ede7` | `0000000001800c98  0000000000000008 R_X86_64_RELATIVE                         35ede7` |
| `0x1800c28` | `0x32d53e` | `0000000001800ca0  0000000000000008 R_X86_64_RELATIVE                         32d53e` |
| `0x1800c30` | `0xad179e` | `0000000001800ca8  0000000000000008 R_X86_64_RELATIVE                         ad179e` |
| `0x1800c38` | `0x389663` | `0000000001800cb0  0000000000000008 R_X86_64_RELATIVE                         389663` |
| `0x1800c40` | `0x32d53e` | `0000000001800cb8  0000000000000008 R_X86_64_RELATIVE                         32d53e` |
| `0x1800c48` | `0xad17b2` | `0000000001800cc0  0000000000000008 R_X86_64_RELATIVE                         ad17b2` |
| `0x1800c50` | `0x36fa5e` | `0000000001800cc8  0000000000000008 R_X86_64_RELATIVE                         36fa5e` |
| `0x1800c58` | `0x32d53e` | `0000000001800cd0  0000000000000008 R_X86_64_RELATIVE                         32d53e` |
| `0x1800c60` | `0xad17c6` | `0000000001800cd8  0000000000000008 R_X86_64_RELATIVE                         ad17c6` |
| `0x1800c68` | `0x35508a` | `0000000001800ce0  0000000000000008 R_X86_64_RELATIVE                         35508a` |
| `0x1800c70` | `0x32d53e` | `0000000001800ce8  0000000000000008 R_X86_64_RELATIVE                         32d53e` |
| `0x1800c78` | `0xad17da` | `0000000001800cf0  0000000000000008 R_X86_64_RELATIVE                         ad17da` |
| `0x1800c80` | `0x33ab54` | `0000000001800cf8  0000000000000008 R_X86_64_RELATIVE                         33ab54` |
| `0x1800c88` | `0x32d53e` | `0000000001800d00  0000000000000008 R_X86_64_RELATIVE                         32d53e` |
| `0x1800c90` | `0xad17ee` | `0000000001800d08  0000000000000008 R_X86_64_RELATIVE                         ad17ee` |
| `0x1800c98` | `0x348d29` | `0000000001800d10  0000000000000008 R_X86_64_RELATIVE                         348d29` |
| `0x1800ca0` | `0x32d53e` | `0000000001800d18  0000000000000008 R_X86_64_RELATIVE                         32d53e` |
| `0x1800ca8` | `0xad1802` | `0000000001800d20  0000000000000008 R_X86_64_RELATIVE                         ad1802` |
| `0x1800cb0` | `0x36fa65` | `0000000001800d28  0000000000000008 R_X86_64_RELATIVE                         36fa65` |
| `0x1800cb8` | `0x32d53e` | `0000000001800d30  0000000000000008 R_X86_64_RELATIVE                         32d53e` |
| `0x1800cc0` | `0xad1816` | `0000000001800d38  0000000000000008 R_X86_64_RELATIVE                         ad1816` |
| `0x1800cd8` | `0xad5bee` | `0000000001800d50  0000000000000008 R_X86_64_RELATIVE                         ad5bee` |
| `0x1800ce0` | `0xad5bf8` | `0000000001800d58  0000000000000008 R_X86_64_RELATIVE                         ad5bf8` |
| `0x1800ce8` | `0xad5c0e` | `0000000001800d60  0000000000000008 R_X86_64_RELATIVE                         ad5c0e` |
| `0x1800cf0` | `0xad5c1a` | `0000000001800d68  0000000000000008 R_X86_64_RELATIVE                         ad5c1a` |
| `0x1800cf8` | `0xad5c24` | `0000000001800d70  0000000000000008 R_X86_64_RELATIVE                         ad5c24` |
| `0x1800d00` | `0xad5c48` | `0000000001800d78  0000000000000008 R_X86_64_RELATIVE                         ad5c48` |
| `0x1800d08` | `0xad5cca` | `0000000001800d80  0000000000000008 R_X86_64_RELATIVE                         ad5cca` |
| `0x1800d10` | `0xad5d4c` | `0000000001800d88  0000000000000008 R_X86_64_RELATIVE                         ad5d4c` |
| `0x1800d18` | `0xad5d66` | `0000000001800d90  0000000000000008 R_X86_64_RELATIVE                         ad5d66` |
| `0x1800d20` | `0xad5d8a` | `0000000001800d98  0000000000000008 R_X86_64_RELATIVE                         ad5d8a` |
| `0x1800d28` | `0xad5da8` | `0000000001800da0  0000000000000008 R_X86_64_RELATIVE                         ad5da8` |
| `0x1800d30` | `0xad5db4` | `0000000001800da8  0000000000000008 R_X86_64_RELATIVE                         ad5db4` |
| `0x1800d38` | `0xad5dc0` | `0000000001800db0  0000000000000008 R_X86_64_RELATIVE                         ad5dc0` |
| `0x1800d40` | `0xad5dcc` | `0000000001800db8  0000000000000008 R_X86_64_RELATIVE                         ad5dcc` |
| `0x1800d48` | `0xad5dea` | `0000000001800dc0  0000000000000008 R_X86_64_RELATIVE                         ad5dea` |
| `0x1800d60` | `0xad55fe` | `0000000001800dd8  0000000000000008 R_X86_64_RELATIVE                         ad55fe` |
| `0x1800d68` | `0xad5612` | `0000000001800de0  0000000000000008 R_X86_64_RELATIVE                         ad5612` |
| `0x1800d70` | `0xad5624` | `0000000001800de8  0000000000000008 R_X86_64_RELATIVE                         ad5624` |
| `0x1800d78` | `0xad5652` | `0000000001800df0  0000000000000008 R_X86_64_RELATIVE                         ad5652` |
| `0x1800d80` | `0xaae9b2` | `0000000001800df8  0000000000000008 R_X86_64_RELATIVE                         aae9b2` |
| `0x1800d88` | `0xaae9bc` | `0000000001800e00  0000000000000008 R_X86_64_RELATIVE                         aae9bc` |
| `0x1800d90` | `0xad5678` | `0000000001800e08  0000000000000008 R_X86_64_RELATIVE                         ad5678` |
| `0x1800da8` | `0x9d7de0` | `0000000001800e20  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800db0` | `0xa50370` | `0000000001800e28  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800db8` | `0xad5bb4` | `0000000001800e30  0000000000000008 R_X86_64_RELATIVE                         ad5bb4` |
| `0x1800dc0` | `0xad5bca` | `0000000001800e38  0000000000000008 R_X86_64_RELATIVE                         ad5bca` |
| `0x1800dc8` | `0x9d7de0` | `0000000001800e40  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800dd0` | `0xa50370` | `0000000001800e48  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800dd8` | `0xad5bd6` | `0000000001800e50  0000000000000008 R_X86_64_RELATIVE                         ad5bd6` |
| `0x1800df0` | `0xad5b66` | `0000000001800e68  0000000000000008 R_X86_64_RELATIVE                         ad5b66` |
| `0x1800df8` | `0xad5b76` | `0000000001800e70  0000000000000008 R_X86_64_RELATIVE                         ad5b76` |
| `0x1800e00` | `0xad5b88` | `0000000001800e78  0000000000000008 R_X86_64_RELATIVE                         ad5b88` |
| `0x1800e10` | `0xa50370` | `0000000001800e88  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800e18` | `0xad5ab2` | `0000000001800e90  0000000000000008 R_X86_64_RELATIVE                         ad5ab2` |
| `0x1800e20` | `0x9d7de0` | `0000000001800e98  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800e28` | `0xad5aba` | `0000000001800ea0  0000000000000008 R_X86_64_RELATIVE                         ad5aba` |
| `0x1800e30` | `0xad5af0` | `0000000001800ea8  0000000000000008 R_X86_64_RELATIVE                         ad5af0` |
| `0x1800e38` | `0xad5b18` | `0000000001800eb0  0000000000000008 R_X86_64_RELATIVE                         ad5b18` |
| `0x1800e40` | `0xad5b38` | `0000000001800eb8  0000000000000008 R_X86_64_RELATIVE                         ad5b38` |
| `0x1800e48` | `0xad5b38` | `0000000001800ec0  0000000000000008 R_X86_64_RELATIVE                         ad5b38` |
| `0x1800e50` | `0xad5b5c` | `0000000001800ec8  0000000000000008 R_X86_64_RELATIVE                         ad5b5c` |
| `0x1800e68` | `0x9d7de0` | `0000000001800ee0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800e70` | `0xa50370` | `0000000001800ee8  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800e78` | `0xad55bc` | `0000000001800ef0  0000000000000008 R_X86_64_RELATIVE                         ad55bc` |
| `0x1800e80` | `0xad55dc` | `0000000001800ef8  0000000000000008 R_X86_64_RELATIVE                         ad55dc` |
| `0x1800e88` | `0x9d7de0` | `0000000001800f00  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800e90` | `0xa50370` | `0000000001800f08  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800e98` | `0xad55f0` | `0000000001800f10  0000000000000008 R_X86_64_RELATIVE                         ad55f0` |
| `0x1800eb0` | `0x9d7de0` | `0000000001800f28  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800eb8` | `0xa50370` | `0000000001800f30  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800ec0` | `0xad555e` | `0000000001800f38  0000000000000008 R_X86_64_RELATIVE                         ad555e` |
| `0x1800ec8` | `0xad557e` | `0000000001800f40  0000000000000008 R_X86_64_RELATIVE                         ad557e` |
| `0x1800ed0` | `0x9d7de0` | `0000000001800f48  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800ed8` | `0xa50370` | `0000000001800f50  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1800ee0` | `0xad5592` | `0000000001800f58  0000000000000008 R_X86_64_RELATIVE                         ad5592` |
| `0x1800ef8` | `0xad6390` | `0000000001800f70  0000000000000008 R_X86_64_RELATIVE                         ad6390` |
| `0x1800f00` | `0xad63a4` | `0000000001800f78  0000000000000008 R_X86_64_RELATIVE                         ad63a4` |
| `0x1800f08` | `0xad63b6` | `0000000001800f80  0000000000000008 R_X86_64_RELATIVE                         ad63b6` |
| `0x1800f10` | `0xad6456` | `0000000001800f88  0000000000000008 R_X86_64_RELATIVE                         ad6456` |
| `0x1800f18` | `0xad6470` | `0000000001800f90  0000000000000008 R_X86_64_RELATIVE                         ad6470` |
| `0x1800f20` | `0xad647a` | `0000000001800f98  0000000000000008 R_X86_64_RELATIVE                         ad647a` |
| `0x1800f28` | `0xad6490` | `0000000001800fa0  0000000000000008 R_X86_64_RELATIVE                         ad6490` |
| `0x1800f30` | `0xad73c2` | `0000000001800fa8  0000000000000008 R_X86_64_RELATIVE                         ad73c2` |
| `0x1800f38` | `0x9d7de0` | `0000000001800fb0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800f40` | `0xad73ce` | `0000000001800fb8  0000000000000008 R_X86_64_RELATIVE                         ad73ce` |
| `0x1800f48` | `0xad73da` | `0000000001800fc0  0000000000000008 R_X86_64_RELATIVE                         ad73da` |
| `0x1800f50` | `0xad7440` | `0000000001800fc8  0000000000000008 R_X86_64_RELATIVE                         ad7440` |
| `0x1800f58` | `0xad744c` | `0000000001800fd0  0000000000000008 R_X86_64_RELATIVE                         ad744c` |
| `0x1800f60` | `0xad7458` | `0000000001800fd8  0000000000000008 R_X86_64_RELATIVE                         ad7458` |
| `0x1800f68` | `0xad7464` | `0000000001800fe0  0000000000000008 R_X86_64_RELATIVE                         ad7464` |
| `0x1800f80` | `0xad6894` | `0000000001800ff8  0000000000000008 R_X86_64_RELATIVE                         ad6894` |
| `0x1800f90` | `0xad68ba` | `0000000001801008  0000000000000008 R_X86_64_RELATIVE                         ad68ba` |
| `0x1800f98` | `0xad695a` | `0000000001801010  0000000000000008 R_X86_64_RELATIVE                         ad695a` |
| `0x1800fa0` | `0xad6974` | `0000000001801018  0000000000000008 R_X86_64_RELATIVE                         ad6974` |
| `0x1800fa8` | `0xad697e` | `0000000001801020  0000000000000008 R_X86_64_RELATIVE                         ad697e` |
| `0x1800fb0` | `0xad6994` | `0000000001801028  0000000000000008 R_X86_64_RELATIVE                         ad6994` |
| `0x1800fb8` | `0xad7934` | `0000000001801030  0000000000000008 R_X86_64_RELATIVE                         ad7934` |
| `0x1800fc0` | `0x9d7de0` | `0000000001801038  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1800fc8` | `0xad7a8e` | `0000000001801040  0000000000000008 R_X86_64_RELATIVE                         ad7a8e` |
| `0x1800fd0` | `0xad7b40` | `0000000001801048  0000000000000008 R_X86_64_RELATIVE                         ad7b40` |
| `0x1800fd8` | `0xad7bd0` | `0000000001801050  0000000000000008 R_X86_64_RELATIVE                         ad7bd0` |
| `0x1800fe0` | `0xad7c92` | `0000000001801058  0000000000000008 R_X86_64_RELATIVE                         ad7c92` |
| `0x1800fe8` | `0xad7d2c` | `0000000001801060  0000000000000008 R_X86_64_RELATIVE                         ad7d2c` |
| `0x1800ff0` | `0xad7db6` | `0000000001801068  0000000000000008 R_X86_64_RELATIVE                         ad7db6` |
| `0x1801008` | `0xad7ec4` | `0000000001801080  0000000000000008 R_X86_64_RELATIVE                         ad7ec4` |
| `0x1801010` | `0xad7ed4` | `0000000001801088  0000000000000008 R_X86_64_RELATIVE                         ad7ed4` |
| `0x1801018` | `0xad7ee6` | `0000000001801090  0000000000000008 R_X86_64_RELATIVE                         ad7ee6` |
| `0x1801028` | `0xa50370` | `00000000018010a0  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1801030` | `0xad9186` | `00000000018010a8  0000000000000008 R_X86_64_RELATIVE                         ad9186` |
| `0x1801038` | `0x9d7de0` | `00000000018010b0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1801040` | `0xad93ae` | `00000000018010b8  0000000000000008 R_X86_64_RELATIVE                         ad93ae` |
| `0x1801048` | `0xad94bc` | `00000000018010c0  0000000000000008 R_X86_64_RELATIVE                         ad94bc` |
| `0x1801050` | `0xad95a8` | `00000000018010c8  0000000000000008 R_X86_64_RELATIVE                         ad95a8` |
| `0x1801058` | `0xad96c6` | `00000000018010d0  0000000000000008 R_X86_64_RELATIVE                         ad96c6` |
| `0x1801060` | `0xad97b6` | `00000000018010d8  0000000000000008 R_X86_64_RELATIVE                         ad97b6` |
| `0x1801068` | `0xad9890` | `00000000018010e0  0000000000000008 R_X86_64_RELATIVE                         ad9890` |
| `0x1801080` | `0x9d7de0` | `00000000018010f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1801088` | `0xa50370` | `0000000001801100  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1801090` | `0xad85ac` | `0000000001801108  0000000000000008 R_X86_64_RELATIVE                         ad85ac` |
| `0x1801098` | `0xad85cc` | `0000000001801110  0000000000000008 R_X86_64_RELATIVE                         ad85cc` |
| `0x18010a0` | `0x9d7de0` | `0000000001801118  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18010a8` | `0xa50370` | `0000000001801120  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18010b0` | `0xad85e0` | `0000000001801128  0000000000000008 R_X86_64_RELATIVE                         ad85e0` |
| `0x18010c8` | `0x9d7de0` | `0000000001801140  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18010d0` | `0xa50370` | `0000000001801148  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18010d8` | `0xad83f4` | `0000000001801150  0000000000000008 R_X86_64_RELATIVE                         ad83f4` |
| `0x18010e0` | `0xad8414` | `0000000001801158  0000000000000008 R_X86_64_RELATIVE                         ad8414` |
| `0x18010e8` | `0x9d7de0` | `0000000001801160  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x18010f0` | `0xa50370` | `0000000001801168  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18010f8` | `0xad8428` | `0000000001801170  0000000000000008 R_X86_64_RELATIVE                         ad8428` |
| `0x1801110` | `0xad7f34` | `0000000001801188  0000000000000008 R_X86_64_RELATIVE                         ad7f34` |
| `0x1801118` | `0xad7f44` | `0000000001801190  0000000000000008 R_X86_64_RELATIVE                         ad7f44` |
| `0x1801120` | `0xad7f56` | `0000000001801198  0000000000000008 R_X86_64_RELATIVE                         ad7f56` |
| `0x1801130` | `0xa50370` | `00000000018011a8  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x1801138` | `0xad9d18` | `00000000018011b0  0000000000000008 R_X86_64_RELATIVE                         ad9d18` |
| `0x1801140` | `0x9d7de0` | `00000000018011b8  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1801148` | `0xada1ec` | `00000000018011c0  0000000000000008 R_X86_64_RELATIVE                         ada1ec` |
| `0x1801150` | `0xada258` | `00000000018011c8  0000000000000008 R_X86_64_RELATIVE                         ada258` |
| `0x1801158` | `0xada1d8` | `00000000018011d0  0000000000000008 R_X86_64_RELATIVE                         ada1d8` |
| `0x1801160` | `0xada1e4` | `00000000018011d8  0000000000000008 R_X86_64_RELATIVE                         ada1e4` |
| `0x1801178` | `0xad9c62` | `00000000018011f0  0000000000000008 R_X86_64_RELATIVE                         ad9c62` |
| `0x1801180` | `0xad9c72` | `00000000018011f8  0000000000000008 R_X86_64_RELATIVE                         ad9c72` |
| `0x1801188` | `0xad9c84` | `0000000001801200  0000000000000008 R_X86_64_RELATIVE                         ad9c84` |
| `0x1801198` | `0xa50370` | `0000000001801210  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18011b0` | `0xadc178` | `0000000001801228  0000000000000008 R_X86_64_RELATIVE                         adc178` |
| `0x18011b8` | `0xadc188` | `0000000001801230  0000000000000008 R_X86_64_RELATIVE                         adc188` |
| `0x18011c0` | `0xadc19a` | `0000000001801238  0000000000000008 R_X86_64_RELATIVE                         adc19a` |
| `0x18011d0` | `0xa50370` | `0000000001801248  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18011e8` | `0xada842` | `0000000001801260  0000000000000008 R_X86_64_RELATIVE                         ada842` |
| `0x18011f0` | `0xada8a0` | `0000000001801268  0000000000000008 R_X86_64_RELATIVE                         ada8a0` |
| `0x18011f8` | `0xadadda` | `0000000001801270  0000000000000008 R_X86_64_RELATIVE                         adadda` |
| `0x1801200` | `0xadae54` | `0000000001801278  0000000000000008 R_X86_64_RELATIVE                         adae54` |
| `0x1801208` | `0xadae7e` | `0000000001801280  0000000000000008 R_X86_64_RELATIVE                         adae7e` |
| `0x1801210` | `0xadae88` | `0000000001801288  0000000000000008 R_X86_64_RELATIVE                         adae88` |
| `0x1801218` | `0xadae92` | `0000000001801290  0000000000000008 R_X86_64_RELATIVE                         adae92` |
| `0x1801220` | `0xadae9c` | `0000000001801298  0000000000000008 R_X86_64_RELATIVE                         adae9c` |
| `0x1801228` | `0xadaf08` | `00000000018012a0  0000000000000008 R_X86_64_RELATIVE                         adaf08` |
| `0x1801230` | `0xadaf74` | `00000000018012a8  0000000000000008 R_X86_64_RELATIVE                         adaf74` |
| `0x1801238` | `0xadafca` | `00000000018012b0  0000000000000008 R_X86_64_RELATIVE                         adafca` |
| `0x1801240` | `0xadb010` | `00000000018012b8  0000000000000008 R_X86_64_RELATIVE                         adb010` |
| `0x1801248` | `0xadb098` | `00000000018012c0  0000000000000008 R_X86_64_RELATIVE                         adb098` |
| `0x1801250` | `0xada440` | `00000000018012c8  0000000000000008 R_X86_64_RELATIVE                         ada440` |
| `0x1801258` | `0x9d7de0` | `00000000018012d0  0000000000000008 R_X86_64_RELATIVE                         9d7de0` |
| `0x1801260` | `0xada44c` | `00000000018012d8  0000000000000008 R_X86_64_RELATIVE                         ada44c` |
| `0x1801268` | `0xada504` | `00000000018012e0  0000000000000008 R_X86_64_RELATIVE                         ada504` |
| `0x1801270` | `0xada586` | `00000000018012e8  0000000000000008 R_X86_64_RELATIVE                         ada586` |
| `0x1801278` | `0xada5fc` | `00000000018012f0  0000000000000008 R_X86_64_RELATIVE                         ada5fc` |
| `0x1801280` | `0xada674` | `00000000018012f8  0000000000000008 R_X86_64_RELATIVE                         ada674` |
| `0x1801288` | `0xada6e6` | `0000000001801300  0000000000000008 R_X86_64_RELATIVE                         ada6e6` |
| `0x1801290` | `0xadc00e` | `0000000001801308  0000000000000008 R_X86_64_RELATIVE                         adc00e` |
| `0x1801298` | `0xada1e4` | `0000000001801310  0000000000000008 R_X86_64_RELATIVE                         ada1e4` |
| `0x18012b0` | `0xadc04e` | `0000000001801328  0000000000000008 R_X86_64_RELATIVE                         adc04e` |
| `0x18012b8` | `0xadc05e` | `0000000001801330  0000000000000008 R_X86_64_RELATIVE                         adc05e` |
| `0x18012c0` | `0xa7a3be` | `0000000001801338  0000000000000008 R_X86_64_RELATIVE                         a7a3be` |
| `0x18012d0` | `0xa50370` | `0000000001801348  0000000000000008 R_X86_64_RELATIVE                         a50370` |
| `0x18012e8` | `0xadbac4` | `0000000001801360  0000000000000008 R_X86_64_RELATIVE                         adbac4` |
| `0x18012f0` | `0xadbad8` | `0000000001801368  0000000000000008 R_X86_64_RELATIVE                         adbad8` |
| `0x18012f8` | `0xadbaea` | `0000000001801370  0000000000000008 R_X86_64_RELATIVE                         adbaea` |
| `0x1801300` | `0xadbb18` | `0000000001801378  0000000000000008 R_X86_64_RELATIVE                         adbb18` |
| `0x1801308` | `0xaaaedc` | `0000000001801380  0000000000000008 R_X86_64_RELATIVE                         aaaedc` |
| `0x1801310` | `0xaaaee6` | `0000000001801388  0000000000000008 R_X86_64_RELATIVE                         aaaee6` |
| `0x1801318` | `0xadbb3e` | `0000000001801390  0000000000000008 R_X86_64_RELATIVE                         adbb3e` |
| `0x1801330` | `0xaaab0e` | `00000000018013a8  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1801338` | `0xaaab26` | `00000000018013b0  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801340` | `0x174ec6a` | `00000000018013b8  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801348` | `0x174f1dc` | `00000000018013c0  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801350` | `0xadc4cc` | `00000000018013c8  0000000000000008 R_X86_64_RELATIVE                         adc4cc` |
| `0x1801358` | `0x174ef82` | `00000000018013d0  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801370` | `0xadc418` | `00000000018013e8  0000000000000008 R_X86_64_RELATIVE                         adc418` |
| `0x1801378` | `0xadc44c` | `00000000018013f0  0000000000000008 R_X86_64_RELATIVE                         adc44c` |
| `0x1801380` | `0x174ec6a` | `00000000018013f8  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801388` | `0x174f1dc` | `0000000001801400  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801390` | `0xadc45e` | `0000000001801408  0000000000000008 R_X86_64_RELATIVE                         adc45e` |
| `0x1801398` | `0x174ef82` | `0000000001801410  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x18013a8` | `0x18be5a8` | `0000000001801420  0000000000000008 R_X86_64_RELATIVE                         18be5a8` |
| `0x18013b0` | `0x18be5c8` | `0000000001801428  0000000000000008 R_X86_64_RELATIVE                         18be5c8` |
| `0x18013c8` | `0xabf1aa` | `0000000001801440  0000000000000008 R_X86_64_RELATIVE                         abf1aa` |
| `0x18013d0` | `0xabf1d4` | `0000000001801448  0000000000000008 R_X86_64_RELATIVE                         abf1d4` |
| `0x18013d8` | `0x174ec6a` | `0000000001801450  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18013e0` | `0x174f1dc` | `0000000001801458  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18013e8` | `0xadc59e` | `0000000001801460  0000000000000008 R_X86_64_RELATIVE                         adc59e` |
| `0x18013f0` | `0x174ef82` | `0000000001801468  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801408` | `0xabf1aa` | `0000000001801480  0000000000000008 R_X86_64_RELATIVE                         abf1aa` |
| `0x1801410` | `0xabf1d4` | `0000000001801488  0000000000000008 R_X86_64_RELATIVE                         abf1d4` |
| `0x1801418` | `0x174ec6a` | `0000000001801490  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801420` | `0x174f1dc` | `0000000001801498  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801428` | `0xadc5e6` | `00000000018014a0  0000000000000008 R_X86_64_RELATIVE                         adc5e6` |
| `0x1801430` | `0x174ef82` | `00000000018014a8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801448` | `0xac0a20` | `00000000018014c0  0000000000000008 R_X86_64_RELATIVE                         ac0a20` |
| `0x1801450` | `0xac0a52` | `00000000018014c8  0000000000000008 R_X86_64_RELATIVE                         ac0a52` |
| `0x1801458` | `0x174ec6a` | `00000000018014d0  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801460` | `0x174f1dc` | `00000000018014d8  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801468` | `0xadc71a` | `00000000018014e0  0000000000000008 R_X86_64_RELATIVE                         adc71a` |
| `0x1801470` | `0x174ef82` | `00000000018014e8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801488` | `0xaaab0e` | `0000000001801500  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1801490` | `0xaaab26` | `0000000001801508  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801498` | `0x174ec6a` | `0000000001801510  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18014a0` | `0x174f1dc` | `0000000001801518  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18014a8` | `0xadc67a` | `0000000001801520  0000000000000008 R_X86_64_RELATIVE                         adc67a` |
| `0x18014b0` | `0x174ef82` | `0000000001801528  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x18014c8` | `0xabf1aa` | `0000000001801540  0000000000000008 R_X86_64_RELATIVE                         abf1aa` |
| `0x18014d0` | `0xabf1d4` | `0000000001801548  0000000000000008 R_X86_64_RELATIVE                         abf1d4` |
| `0x18014d8` | `0x174ec6a` | `0000000001801550  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18014e0` | `0x174f1dc` | `0000000001801558  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18014e8` | `0xadc6ca` | `0000000001801560  0000000000000008 R_X86_64_RELATIVE                         adc6ca` |
| `0x18014f0` | `0x174ef82` | `0000000001801568  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801508` | `0xac0a20` | `0000000001801580  0000000000000008 R_X86_64_RELATIVE                         ac0a20` |
| `0x1801510` | `0xac0a52` | `0000000001801588  0000000000000008 R_X86_64_RELATIVE                         ac0a52` |
| `0x1801518` | `0x174ec6a` | `0000000001801590  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801520` | `0x174f1dc` | `0000000001801598  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801528` | `0xadc632` | `00000000018015a0  0000000000000008 R_X86_64_RELATIVE                         adc632` |
| `0x1801530` | `0x174ef82` | `00000000018015a8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801548` | `0xadc4e6` | `00000000018015c0  0000000000000008 R_X86_64_RELATIVE                         adc4e6` |
| `0x1801550` | `0xadc52a` | `00000000018015c8  0000000000000008 R_X86_64_RELATIVE                         adc52a` |
| `0x1801558` | `0x174ec6a` | `00000000018015d0  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801560` | `0x174f1dc` | `00000000018015d8  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801568` | `0xadc53c` | `00000000018015e0  0000000000000008 R_X86_64_RELATIVE                         adc53c` |
| `0x1801570` | `0x174ef82` | `00000000018015e8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801588` | `0xaaa9b2` | `0000000001801600  0000000000000008 R_X86_64_RELATIVE                         aaa9b2` |
| `0x1801590` | `0xaaa9bc` | `0000000001801608  0000000000000008 R_X86_64_RELATIVE                         aaa9bc` |
| `0x1801598` | `0x174ec6a` | `0000000001801610  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18015a0` | `0x174f1dc` | `0000000001801618  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18015a8` | `0xadc77c` | `0000000001801620  0000000000000008 R_X86_64_RELATIVE                         adc77c` |
| `0x18015b0` | `0x174ef82` | `0000000001801628  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x18015c8` | `0xadc7b4` | `0000000001801640  0000000000000008 R_X86_64_RELATIVE                         adc7b4` |
| `0x18015d0` | `0xadc81c` | `0000000001801648  0000000000000008 R_X86_64_RELATIVE                         adc81c` |
| `0x18015d8` | `0x174ec6a` | `0000000001801650  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18015e0` | `0x174f1dc` | `0000000001801658  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18015e8` | `0xadc82e` | `0000000001801660  0000000000000008 R_X86_64_RELATIVE                         adc82e` |
| `0x18015f0` | `0x174ef82` | `0000000001801668  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801608` | `0xadc89a` | `0000000001801680  0000000000000008 R_X86_64_RELATIVE                         adc89a` |
| `0x1801610` | `0xadc8b8` | `0000000001801688  0000000000000008 R_X86_64_RELATIVE                         adc8b8` |
| `0x1801618` | `0x174ec6a` | `0000000001801690  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801620` | `0x174f1dc` | `0000000001801698  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801628` | `0xadc8ca` | `00000000018016a0  0000000000000008 R_X86_64_RELATIVE                         adc8ca` |
| `0x1801630` | `0x174ef82` | `00000000018016a8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801648` | `0xadc944` | `00000000018016c0  0000000000000008 R_X86_64_RELATIVE                         adc944` |
| `0x1801650` | `0xadc96a` | `00000000018016c8  0000000000000008 R_X86_64_RELATIVE                         adc96a` |
| `0x1801658` | `0x174ec6a` | `00000000018016d0  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801660` | `0x174f1dc` | `00000000018016d8  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801668` | `0xadc97c` | `00000000018016e0  0000000000000008 R_X86_64_RELATIVE                         adc97c` |
| `0x1801670` | `0x174ef82` | `00000000018016e8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801688` | `0xadc9f8` | `0000000001801700  0000000000000008 R_X86_64_RELATIVE                         adc9f8` |
| `0x1801690` | `0xadca54` | `0000000001801708  0000000000000008 R_X86_64_RELATIVE                         adca54` |
| `0x1801698` | `0x174ec6a` | `0000000001801710  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18016a0` | `0x174f1dc` | `0000000001801718  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18016a8` | `0xadca66` | `0000000001801720  0000000000000008 R_X86_64_RELATIVE                         adca66` |
| `0x18016b0` | `0x174ef82` | `0000000001801728  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x18016b8` | `0x18beb70` | `0000000001801730  0000000000000008 R_X86_64_RELATIVE                         18beb70` |
| `0x18016c0` | `0x18beb50` | `0000000001801738  0000000000000008 R_X86_64_RELATIVE                         18beb50` |
| `0x18016c8` | `0x18beb30` | `0000000001801740  0000000000000008 R_X86_64_RELATIVE                         18beb30` |
| `0x18016d0` | `0x18bead0` | `0000000001801748  0000000000000008 R_X86_64_RELATIVE                         18bead0` |
| `0x18016d8` | `0x18beaa0` | `0000000001801750  0000000000000008 R_X86_64_RELATIVE                         18beaa0` |
| `0x18016e0` | `0x18be938` | `0000000001801758  0000000000000008 R_X86_64_RELATIVE                         18be938` |
| `0x18016e8` | `0x18be9d0` | `0000000001801760  0000000000000008 R_X86_64_RELATIVE                         18be9d0` |
| `0x18016f0` | `0x18be978` | `0000000001801768  0000000000000008 R_X86_64_RELATIVE                         18be978` |
| `0x18016f8` | `0x18bea20` | `0000000001801770  0000000000000008 R_X86_64_RELATIVE                         18bea20` |
| `0x1801700` | `0x18be900` | `0000000001801778  0000000000000008 R_X86_64_RELATIVE                         18be900` |
| `0x1801708` | `0x18be8c8` | `0000000001801780  0000000000000008 R_X86_64_RELATIVE                         18be8c8` |
| `0x1801710` | `0x18bea58` | `0000000001801788  0000000000000008 R_X86_64_RELATIVE                         18bea58` |
| `0x1801728` | `0xaaab0e` | `00000000018017a0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1801730` | `0xaaab26` | `00000000018017a8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801738` | `0x174ec6a` | `00000000018017b0  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801740` | `0x174f1dc` | `00000000018017b8  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801748` | `0xadcf00` | `00000000018017c0  0000000000000008 R_X86_64_RELATIVE                         adcf00` |
| `0x1801750` | `0x174ef82` | `00000000018017c8  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x1801768` | `0xaaab0e` | `00000000018017e0  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x1801770` | `0xaaab26` | `00000000018017e8  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x1801778` | `0x174ec6a` | `00000000018017f0  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801780` | `0x174f1dc` | `00000000018017f8  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801788` | `0xadcd20` | `0000000001801800  0000000000000008 R_X86_64_RELATIVE                         adcd20` |
| `0x1801790` | `0x174ef82` | `0000000001801808  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x18017a8` | `0xaaab0e` | `0000000001801820  0000000000000008 R_X86_64_RELATIVE                         aaab0e` |
| `0x18017b0` | `0xaaab26` | `0000000001801828  0000000000000008 R_X86_64_RELATIVE                         aaab26` |
| `0x18017b8` | `0x174ec6a` | `0000000001801830  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x18017c0` | `0x174f1dc` | `0000000001801838  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x18017c8` | `0xadcb7e` | `0000000001801840  0000000000000008 R_X86_64_RELATIVE                         adcb7e` |
| `0x18017d0` | `0x174ef82` | `0000000001801848  0000000000000008 R_X86_64_RELATIVE                         174ef82` |
| `0x18017e8` | `0xabee54` | `0000000001801860  0000000000000008 R_X86_64_RELATIVE                         abee54` |
| `0x18017f0` | `0xabee78` | `0000000001801868  0000000000000008 R_X86_64_RELATIVE                         abee78` |
| `0x18017f8` | `0x174ec6a` | `0000000001801870  0000000000000008 R_X86_64_RELATIVE                         174ec6a` |
| `0x1801800` | `0x174f1dc` | `0000000001801878  0000000000000008 R_X86_64_RELATIVE                         174f1dc` |
| `0x1801808` | `0xadcd68` | `0000000001801880  0000000000000008 R_X86_64_RELATIVE                         adcd68` |
| ... | ... | truncated 58271 more |

## `aab330` wrapper/source creation callsites

| addr | instruction |
|---:|---|
| `0xa7c4ad` | `a7c4ad:	40 0f 94 c7          	sete   dil` |
| `0xa7c4b1` | `a7c4b1:	e9 9a ac d5 00       	jmp    17d7150 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x2f71>` |
| `0xa7c4b6` | `a7c4b6:	41 56                	push   r14` |
| `0xa7c4b8` | `a7c4b8:	53                   	push   rbx` |
| `0xa7c4b9` | `a7c4b9:	48 83 ec 28          	sub    rsp,0x28` |
| `0xa7c4bd` | `a7c4bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa7c4c4` | `a7c4c4:	00 00` |
| `0xa7c4c6` | `a7c4c6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xa7c4cb` | `a7c4cb:	48 89 e3             	mov    rbx,rsp` |
| `0xa7c4ce` | `a7c4ce:	48 89 df             	mov    rdi,rbx` |
| `0xa7c4d1` | `a7c4d1:	e8 4e 9d d5 00       	call   17d6224 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x2045>` |
| `0xa7c4d6` | `a7c4d6:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]` |
| `0xa7c4db` | `a7c4db:	4c 89 f7             	mov    rdi,r14` |
| `0xa7c4de` | `a7c4de:	48 89 de             	mov    rsi,rbx` |
| `0xa7c4e1` | `a7c4e1:	e8 4a ee 02 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xa7c4e6` | `a7c4e6:	49 8b 1e             	mov    rbx,QWORD PTR [r14]` |
| `0xa7c4e9` | `a7c4e9:	48 85 db             	test   rbx,rbx` |
| `0xa7c4ec` | `a7c4ec:	74 49                	je     a7c537 <JNI_OnUnload@@Base+0x3e04>` |
| `0xa7c4ee` | `a7c4ee:	48 89 df             	mov    rdi,rbx` |
| `0xa7c4f1` | `a7c4f1:	e8 b4 a0 d5 00       	call   17d65aa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x23cb>` |
| `0xa7c4f6` | `a7c4f6:	48 83 7b 40 00       	cmp    QWORD PTR [rbx+0x40],0x0` |
| `0xa7c4fb` | `a7c4fb:	74 2f                	je     a7c52c <JNI_OnUnload@@Base+0x3df9>` |
| `0xa7c4fd` | `a7c4fd:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]` |
| `0xa7c501` | `a7c501:	e8 d8 b1 03 00       	call   ab76de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x467e>` |
| `0xa7c506` | `a7c506:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0` |
| `0xa7c50b` | `a7c50b:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]` |
| `0xa7c50f` | `a7c50f:	48 85 c0             	test   rax,rax` |
| `0xa7c512` | `a7c512:	74 13                	je     a7c527 <JNI_OnUnload@@Base+0x3df4>` |
| `0xa7c514` | `a7c514:	31 c9                	xor    ecx,ecx` |
| `0xa7c516` | `a7c516:	48 8b 53 28          	mov    rdx,QWORD PTR [rbx+0x28]` |
| `0xaaaf06` | `aaaf06:	48 83 ec 68          	sub    rsp,0x68` |
| `0xaaaf0a` | `aaaf0a:	f3 0f 11 4c 24 04    	movss  DWORD PTR [rsp+0x4],xmm1` |
| `0xaaaf10` | `aaaf10:	f3 0f 11 04 24       	movss  DWORD PTR [rsp],xmm0` |
| `0xaaaf15` | `aaaf15:	45 89 cd             	mov    r13d,r9d` |
| `0xaaaf18` | `aaaf18:	44 89 c5             	mov    ebp,r8d` |
| `0xaaaf1b` | `aaaf1b:	41 89 cc             	mov    r12d,ecx` |
| `0xaaaf1e` | `aaaf1e:	89 d3                	mov    ebx,edx` |
| `0xaaaf20` | `aaaf20:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi` |
| `0xaaaf25` | `aaaf25:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaaaf2c` | `aaaf2c:	00 00` |
| `0xaaaf2e` | `aaaf2e:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xaaaf33` | `aaaf33:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaaaf37` | `aaaf37:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]` |
| `0xaaaf3c` | `aaaf3c:	4c 89 f7             	mov    rdi,r14` |
| `0xaaaf3f` | `aaaf3f:	e8 ec 03 00 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaaaf44` | `aaaf44:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaaaf47` | `aaaf47:	45 31 ff             	xor    r15d,r15d` |
| `0xaaaf4a` | `aaaf4a:	4d 85 f6             	test   r14,r14` |
| `0xaaaf4d` | `aaaf4d:	0f 84 95 02 00 00    	je     aab1e8 <JNI_OnUnload@@Base+0x32ab5>` |
| `0xaaaf53` | `aaaf53:	84 db                	test   bl,bl` |
| `0xaaaf55` | `aaaf55:	0f 95 44 24 30       	setne  BYTE PTR [rsp+0x30]` |
| `0xaaaf5a` | `aaaf5a:	45 84 ed             	test   r13b,r13b` |
| `0xaaaf5d` | `aaaf5d:	66 0f 6e 44 24 04    	movd   xmm0,DWORD PTR [rsp+0x4]` |
| `0xaaaf63` | `aaaf63:	66 0f 7e c0          	movd   eax,xmm0` |
| `0xaaaf67` | `aaaf67:	44 0f 45 f8          	cmovne r15d,eax` |
| `0xaaaf6b` | `aaaf6b:	44 89 64 24 34       	mov    DWORD PTR [rsp+0x34],r12d` |
| `0xaaaf70` | `aaaf70:	89 6c 24 38          	mov    DWORD PTR [rsp+0x38],ebp` |
| `0xaaaf74` | `aaaf74:	44 89 7c 24 3c       	mov    DWORD PTR [rsp+0x3c],r15d` |
| `0xaaaf79` | `aaaf79:	f3 0f 10 04 24       	movss  xmm0,DWORD PTR [rsp]` |
| `0xaaaf7e` | `aaaf7e:	f3 0f 11 44 24 40    	movss  DWORD PTR [rsp+0x40],xmm0` |
| `0xaaafd2` | `aaafd2:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]` |
| `0xaaafd7` | `aaafd7:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]` |
| `0xaaafdc` | `aaafdc:	48 85 c0             	test   rax,rax` |
| `0xaaafdf` | `aaafdf:	74 05                	je     aaafe6 <JNI_OnUnload@@Base+0x328b3>` |
| `0xaaafe1` | `aaafe1:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xaaafe6` | `aaafe6:	48 8d 05 13 2c d5 00 	lea    rax,[rip+0xd52c13]        # 17fdc00 <_ZTINSt6__ndk117bad_function_callE@@Base+0xca0>` |
| `0xaaafed` | `aaafed:	49 89 06             	mov    QWORD PTR [r14],rax` |
| `0xaaaff0` | `aaaff0:	4c 89 f6             	mov    rsi,r14` |
| `0xaaaff3` | `aaaff3:	48 83 c6 08          	add    rsi,0x8` |
| `0xaaaff7` | `aaaff7:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0` |
| `0xaaaffc` | `aaaffc:	49 83 66 18 00       	and    QWORD PTR [r14+0x18],0x0` |
| `0xaab001` | `aab001:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15` |
| `0xaab005` | `aab005:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]` |
| `0xaab00a` | `aab00a:	48 89 df             	mov    rdi,rbx` |
| `0xaab00d` | `aab00d:	e8 1e 03 00 00       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab012` | `aab012:	4c 8b 23             	mov    r12,QWORD PTR [rbx]` |
| `0xaab015` | `aab015:	4d 85 e4             	test   r12,r12` |
| `0xaab018` | `aab018:	0f 84 49 01 00 00    	je     aab167 <JNI_OnUnload@@Base+0x32a34>` |
| `0xaab01e` | `aab01e:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12` |
| `0xaab023` | `aab023:	c6 44 24 38 01       	mov    BYTE PTR [rsp+0x38],0x1` |
| `0xaab028` | `aab028:	4c 89 e7             	mov    rdi,r12` |
| `0xaab02b` | `aab02b:	e8 c0 30 d4 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaab030` | `aab030:	49 8d 7c 24 38       	lea    rdi,[r12+0x38]` |
| `0xaab035` | `aab035:	4c 89 fe             	mov    rsi,r15` |
| `0xaab038` | `aab038:	e8 33 ec ff ff       	call   aa9c70 <JNI_OnUnload@@Base+0x3153d>` |
| `0xaab03d` | `aab03d:	49 83 c4 40          	add    r12,0x40` |
| `0xaab041` | `aab041:	4c 39 e0             	cmp    rax,r12` |
| `0xaab044` | `aab044:	0f 84 0d 01 00 00    	je     aab157 <JNI_OnUnload@@Base+0x32a24>` |
| `0xaab04a` | `aab04a:	48 8b 58 28          	mov    rbx,QWORD PTR [rax+0x28]` |
| `0xaab04e` | `aab04e:	e9 06 01 00 00       	jmp    aab159 <JNI_OnUnload@@Base+0x32a26>` |
| `0xaab2fe` | `aab2fe:	e8 83 31 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaab303` | `aab303:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0xaab307` | `aab307:	e8 a6 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xaab30c` | `aab30c:	31 ff                	xor    edi,edi` |
| `0xaab30e` | `aab30e:	e8 9f 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xaab313` | `aab313:	31 ff                	xor    edi,edi` |
| `0xaab315` | `aab315:	e8 98 31 ff ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xaab31a` | `aab31a:	4c 89 f7             	mov    rdi,r14` |
| `0xaab31d` | `aab31d:	e8 fe 2b d4 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xaab322` | `aab322:	eb 03                	jmp    aab327 <JNI_OnUnload@@Base+0x32bf4>` |
| `0xaab324` | `aab324:	48 89 c3             	mov    rbx,rax` |
| `0xaab327` | `aab327:	48 89 df             	mov    rdi,rbx` |
| `0xaab32a` | `aab32a:	e8 76 e7 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaab32f` | `aab32f:	cc                   	int3` |
| `0xaab330` | `aab330:	41 56                	push   r14` |
| `0xaab332` | `aab332:	53                   	push   rbx` |
| `0xaab333` | `aab333:	50                   	push   rax` |
| `0xaab334` | `aab334:	48 89 fb             	mov    rbx,rdi` |
| `0xaab337` | `aab337:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xaab33a` | `aab33a:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0xaab33d` | `aab33d:	48 8b 7e 08          	mov    rdi,QWORD PTR [rsi+0x8]` |
| `0xaab341` | `aab341:	48 85 ff             	test   rdi,rdi` |
| `0xaab344` | `aab344:	74 17                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>` |
| `0xaab346` | `aab346:	49 89 f6             	mov    r14,rsi` |
| `0xaab349` | `aab349:	e8 f2 2d d4 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>` |
| `0xaab34e` | `aab34e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0xaab352` | `aab352:	48 85 c0             	test   rax,rax` |
| `0xaab355` | `aab355:	74 06                	je     aab35d <JNI_OnUnload@@Base+0x32c2a>` |
| `0xaab357` | `aab357:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xaab35a` | `aab35a:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xaab3ad` | `aab3ad:	41 54                	push   r12` |
| `0xaab3af` | `aab3af:	53                   	push   rbx` |
| `0xaab3b0` | `aab3b0:	48 83 ec 68          	sub    rsp,0x68` |
| `0xaab3b4` | `aab3b4:	45 89 c6             	mov    r14d,r8d` |
| `0xaab3b7` | `aab3b7:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx` |
| `0xaab3bb` | `aab3bb:	49 89 ff             	mov    r15,rdi` |
| `0xaab3be` | `aab3be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab3c5` | `aab3c5:	00 00` |
| `0xaab3c7` | `aab3c7:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax` |
| `0xaab3cc` | `aab3cc:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab3d0` | `aab3d0:	48 8b 6f 28          	mov    rbp,QWORD PTR [rdi+0x28]` |
| `0xaab3d4` | `aab3d4:	48 8b 5f 30          	mov    rbx,QWORD PTR [rdi+0x30]` |
| `0xaab3d8` | `aab3d8:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]` |
| `0xaab3dd` | `aab3dd:	4c 89 e7             	mov    rdi,r12` |
| `0xaab3e0` | `aab3e0:	e8 4b ff ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab3e5` | `aab3e5:	4d 8b 2c 24          	mov    r13,QWORD PTR [r12]` |
| `0xaab3e9` | `aab3e9:	4d 85 ed             	test   r13,r13` |
| `0xaab3ec` | `aab3ec:	74 53                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab3ee` | `aab3ee:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]` |
| `0xaab3f2` | `aab3f2:	4d 85 e4             	test   r12,r12` |
| `0xaab3f5` | `aab3f5:	74 46                	je     aab43d <JNI_OnUnload@@Base+0x32d0a>` |
| `0xaab3f7` | `aab3f7:	48 89 e8             	mov    rax,rbp` |
| `0xaab3fa` | `aab3fa:	31 ed                	xor    ebp,ebp` |
| `0xaab3fc` | `aab3fc:	48 85 c0             	test   rax,rax` |
| `0xaab3ff` | `aab3ff:	74 40                	je     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab401` | `aab401:	48 85 db             	test   rbx,rbx` |
| `0xaab404` | `aab404:	78 3b                	js     aab441 <JNI_OnUnload@@Base+0x32d0e>` |
| `0xaab406` | `aab406:	49 89 c7             	mov    r15,rax` |
| `0xaab409` | `aab409:	44 89 f0             	mov    eax,r14d` |
| `0xaab40c` | `aab40c:	8b 54 24 04          	mov    edx,DWORD PTR [rsp+0x4]` |
| `0xaab5da` | `aab5da:	48 89 df             	mov    rdi,rbx` |
| `0xaab5dd` | `aab5dd:	e8 c3 e4 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaab5e2` | `aab5e2:	55                   	push   rbp` |
| `0xaab5e3` | `aab5e3:	41 57                	push   r15` |
| `0xaab5e5` | `aab5e5:	41 56                	push   r14` |
| `0xaab5e7` | `aab5e7:	53                   	push   rbx` |
| `0xaab5e8` | `aab5e8:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab5ec` | `aab5ec:	48 89 fb             	mov    rbx,rdi` |
| `0xaab5ef` | `aab5ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab5f6` | `aab5f6:	00 00` |
| `0xaab5f8` | `aab5f8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab5fd` | `aab5fd:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab601` | `aab601:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xaab606` | `aab606:	4c 89 f7             	mov    rdi,r14` |
| `0xaab609` | `aab609:	e8 22 fd ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab60e` | `aab60e:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaab611` | `aab611:	4d 85 f6             	test   r14,r14` |
| `0xaab614` | `aab614:	74 42                	je     aab658 <JNI_OnUnload@@Base+0x32f25>` |
| `0xaab616` | `aab616:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]` |
| `0xaab61a` | `aab61a:	4d 85 ff             	test   r15,r15` |
| `0xaab61d` | `aab61d:	74 3b                	je     aab65a <JNI_OnUnload@@Base+0x32f27>` |
| `0xaab61f` | `aab61f:	40 b5 01             	mov    bpl,0x1` |
| `0xaab622` | `aab622:	41 80 bf e4 13 00 00 	cmp    BYTE PTR [r15+0x13e4],0x0` |
| `0xaab629` | `aab629:	00` |
| `0xaab62a` | `aab62a:	75 30                	jne    aab65c <JNI_OnUnload@@Base+0x32f29>` |
| `0xaab62c` | `aab62c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xaab62f` | `aab62f:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]` |
| `0xaab634` | `aab634:	48 83 26 00          	and    QWORD PTR [rsi],0x0` |
| `0xaab638` | `aab638:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab63b` | `aab63b:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xaab6bf` | `aab6bf:	41 56                	push   r14` |
| `0xaab6c1` | `aab6c1:	41 55                	push   r13` |
| `0xaab6c3` | `aab6c3:	41 54                	push   r12` |
| `0xaab6c5` | `aab6c5:	53                   	push   rbx` |
| `0xaab6c6` | `aab6c6:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab6ca` | `aab6ca:	48 89 fb             	mov    rbx,rdi` |
| `0xaab6cd` | `aab6cd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab6d4` | `aab6d4:	00 00` |
| `0xaab6d6` | `aab6d6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab6db` | `aab6db:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab6df` | `aab6df:	4c 8b 7f 38          	mov    r15,QWORD PTR [rdi+0x38]` |
| `0xaab6e3` | `aab6e3:	48 8b 6f 40          	mov    rbp,QWORD PTR [rdi+0x40]` |
| `0xaab6e7` | `aab6e7:	49 89 e6             	mov    r14,rsp` |
| `0xaab6ea` | `aab6ea:	4c 89 f7             	mov    rdi,r14` |
| `0xaab6ed` | `aab6ed:	e8 3e fc ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab6f2` | `aab6f2:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xaab6f6` | `aab6f6:	74 49                	je     aab741 <JNI_OnUnload@@Base+0x3300e>` |
| `0xaab6f8` | `aab6f8:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]` |
| `0xaab6fc` | `aab6fc:	31 db                	xor    ebx,ebx` |
| `0xaab6fe` | `aab6fe:	4d 85 f6             	test   r14,r14` |
| `0xaab701` | `aab701:	0f 84 da 00 00 00    	je     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab707` | `aab707:	48 85 ed             	test   rbp,rbp` |
| `0xaab70a` | `aab70a:	0f 88 d1 00 00 00    	js     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab710` | `aab710:	74 15                	je     aab727 <JNI_OnUnload@@Base+0x32ff4>` |
| `0xaab712` | `aab712:	4d 85 ff             	test   r15,r15` |
| `0xaab715` | `aab715:	0f 84 c6 00 00 00    	je     aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab71b` | `aab71b:	44 89 f8             	mov    eax,r15d` |
| `0xaab71e` | `aab71e:	83 e0 01             	and    eax,0x1` |
| `0xaab721` | `aab721:	0f 85 ba 00 00 00    	jne    aab7e1 <JNI_OnUnload@@Base+0x330ae>` |
| `0xaab727` | `aab727:	4d 8d ae f0 13 00 00 	lea    r13,[r14+0x13f0]` |
| `0xaab83b` | `aab83b:	48 89 df             	mov    rdi,rbx` |
| `0xaab83e` | `aab83e:	e8 62 e2 fc ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaab843` | `aab843:	cc                   	int3` |
| `0xaab844` | `aab844:	55                   	push   rbp` |
| `0xaab845` | `aab845:	41 56                	push   r14` |
| `0xaab847` | `aab847:	53                   	push   rbx` |
| `0xaab848` | `aab848:	48 83 ec 20          	sub    rsp,0x20` |
| `0xaab84c` | `aab84c:	48 89 fb             	mov    rbx,rdi` |
| `0xaab84f` | `aab84f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab856` | `aab856:	00 00` |
| `0xaab858` | `aab858:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xaab85d` | `aab85d:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab861` | `aab861:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]` |
| `0xaab866` | `aab866:	4c 89 f7             	mov    rdi,r14` |
| `0xaab869` | `aab869:	e8 c2 fa ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab86e` | `aab86e:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaab871` | `aab871:	4d 85 f6             	test   r14,r14` |
| `0xaab874` | `aab874:	74 16                	je     aab88c <JNI_OnUnload@@Base+0x33159>` |
| `0xaab876` | `aab876:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]` |
| `0xaab87a` | `aab87a:	48 85 c0             	test   rax,rax` |
| `0xaab87d` | `aab87d:	74 0f                	je     aab88e <JNI_OnUnload@@Base+0x3315b>` |
| `0xaab87f` | `aab87f:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0xaab882` | `aab882:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaab885` | `aab885:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xaab888` | `aab888:	89 c3                	mov    ebx,eax` |
| `0xaab88a` | `aab88a:	eb 04                	jmp    aab890 <JNI_OnUnload@@Base+0x3315d>` |
| `0xaab88c` | `aab88c:	eb 02                	jmp    aab890 <JNI_OnUnload@@Base+0x3315d>` |
| `0xaab88e` | `aab88e:	31 db                	xor    ebx,ebx` |
| `0xaab890` | `aab890:	4d 85 f6             	test   r14,r14` |
| `0xaab893` | `aab893:	40 0f 95 c5          	setne  bpl` |
| `0xaab8d9` | `aab8d9:	cc                   	int3` |
| `0xaab8da` | `aab8da:	55                   	push   rbp` |
| `0xaab8db` | `aab8db:	41 57                	push   r15` |
| `0xaab8dd` | `aab8dd:	41 56                	push   r14` |
| `0xaab8df` | `aab8df:	53                   	push   rbx` |
| `0xaab8e0` | `aab8e0:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaab8e4` | `aab8e4:	48 89 d3             	mov    rbx,rdx` |
| `0xaab8e7` | `aab8e7:	49 89 fe             	mov    r14,rdi` |
| `0xaab8ea` | `aab8ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaab8f1` | `aab8f1:	00 00` |
| `0xaab8f3` | `aab8f3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaab8f8` | `aab8f8:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xaab8fc` | `aab8fc:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]` |
| `0xaab901` | `aab901:	4c 89 ff             	mov    rdi,r15` |
| `0xaab904` | `aab904:	e8 27 fa ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaab909` | `aab909:	4d 8b 3f             	mov    r15,QWORD PTR [r15]` |
| `0xaab90c` | `aab90c:	4d 85 ff             	test   r15,r15` |
| `0xaab90f` | `aab90f:	74 4b                	je     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab911` | `aab911:	4d 8b 76 18          	mov    r14,QWORD PTR [r14+0x18]` |
| `0xaab915` | `aab915:	31 ed                	xor    ebp,ebp` |
| `0xaab917` | `aab917:	4d 85 f6             	test   r14,r14` |
| `0xaab91a` | `aab91a:	74 40                	je     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab91c` | `aab91c:	48 85 db             	test   rbx,rbx` |
| `0xaab91f` | `aab91f:	78 3b                	js     aab95c <JNI_OnUnload@@Base+0x33229>` |
| `0xaab921` | `aab921:	49 83 be f0 13 00 00 	cmp    QWORD PTR [r14+0x13f0],0x0` |
| `0xaab928` | `aab928:	00` |
| `0xaab929` | `aab929:	74 13                	je     aab93e <JNI_OnUnload@@Base+0x3320b>` |
| `0xaab92b` | `aab92b:	49 8d b6 f0 13 00 00 	lea    rsi,[r14+0x13f0]` |
| `0xaab932` | `aab932:	49 8d be e8 13 00 00 	lea    rdi,[r14+0x13e8]` |
| `0xaab939` | `aab939:	e8 02 05 00 00       	call   aabe40 <JNI_OnUnload@@Base+0x3370d>` |
| `0xaabe56` | `aabe56:	5b                   	pop    rbx` |
| `0xaabe57` | `aabe57:	c3                   	ret` |
| `0xaabe58` | `aabe58:	41 57                	push   r15` |
| `0xaabe5a` | `aabe5a:	41 56                	push   r14` |
| `0xaabe5c` | `aabe5c:	41 54                	push   r12` |
| `0xaabe5e` | `aabe5e:	53                   	push   rbx` |
| `0xaabe5f` | `aabe5f:	48 83 ec 28          	sub    rsp,0x28` |
| `0xaabe63` | `aabe63:	48 89 fb             	mov    rbx,rdi` |
| `0xaabe66` | `aabe66:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xaabe6d` | `aabe6d:	00 00` |
| `0xaabe6f` | `aabe6f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xaabe74` | `aabe74:	49 89 e6             	mov    r14,rsp` |
| `0xaabe77` | `aabe77:	4c 89 f7             	mov    rdi,r14` |
| `0xaabe7a` | `aabe7a:	48 89 de             	mov    rsi,rbx` |
| `0xaabe7d` | `aabe7d:	e8 ae f4 ff ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xaabe82` | `aabe82:	4d 8b 36             	mov    r14,QWORD PTR [r14]` |
| `0xaabe85` | `aabe85:	4d 85 f6             	test   r14,r14` |
| `0xaabe88` | `aabe88:	74 71                	je     aabefb <JNI_OnUnload@@Base+0x337c8>` |
| `0xaabe8a` | `aabe8a:	4c 8b 7b 18          	mov    r15,QWORD PTR [rbx+0x18]` |
| `0xaabe8e` | `aabe8e:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14` |
| `0xaabe93` | `aabe93:	c6 44 24 18 01       	mov    BYTE PTR [rsp+0x18],0x1` |
| `0xaabe98` | `aabe98:	4c 89 f7             	mov    rdi,r14` |
| `0xaabe9b` | `aabe9b:	e8 50 22 d4 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaabea0` | `aabea0:	4d 8d 66 38          	lea    r12,[r14+0x38]` |
| `0xaabea4` | `aabea4:	4c 89 e7             	mov    rdi,r12` |
| `0xaabea7` | `aabea7:	4c 89 fe             	mov    rsi,r15` |
| `0xaabeaa` | `aabeaa:	e8 c1 dd ff ff       	call   aa9c70 <JNI_OnUnload@@Base+0x3153d>` |
| `0xaabeaf` | `aabeaf:	49 89 c7             	mov    r15,rax` |
| `0xaabeb2` | `aabeb2:	49 8d 46 40          	lea    rax,[r14+0x40]` |
| `0xaabeb6` | `aabeb6:	49 39 c7             	cmp    r15,rax` |
| `0xad5fca` | `ad5fca:	4c 89 f3             	mov    rbx,r14` |
| `0xad5fcd` | `ad5fcd:	e9 70 ff ff ff       	jmp    ad5f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22ee2>` |
| `0xad5fd2` | `ad5fd2:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]` |
| `0xad5fd7` | `ad5fd7:	e8 54 5e fd ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>` |
| `0xad5fdc` | `ad5fdc:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]` |
| `0xad5fe1` | `ad5fe1:	49 39 ee             	cmp    r14,rbp` |
| `0xad5fe4` | `ad5fe4:	74 74                	je     ad605a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22ffa>` |
| `0xad5fe6` | `ad5fe6:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]` |
| `0xad5feb` | `ad5feb:	4c 8d 25 8a bf 97 ff 	lea    r12,[rip+0xffffffffff97bf8a]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>` |
| `0xad5ff2` | `ad5ff2:	4c 8d 2d 9a f0 87 ff 	lea    r13,[rip+0xffffffffff87f09a]        # 355093 <_ZTSSt12bad_any_cast@@Base-0x3b135>` |
| `0xad5ff9` | `ad5ff9:	6a 03                	push   0x3` |
| `0xad5ffb` | `ad5ffb:	5b                   	pop    rbx` |
| `0xad5ffc` | `ad5ffc:	49 8d 76 20          	lea    rsi,[r14+0x20]` |
| `0xad6000` | `ad6000:	4c 89 ff             	mov    rdi,r15` |
| `0xad6003` | `ad6003:	e8 28 53 fd ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xad6008` | `ad6008:	48 83 7c 24 38 00    	cmp    QWORD PTR [rsp+0x38],0x0` |
| `0xad600e` | `ad600e:	74 30                	je     ad6040 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fe0>` |
| `0xad6010` | `ad6010:	41 f6 46 30 01       	test   BYTE PTR [r14+0x30],0x1` |
| `0xad6015` | `ad6015:	74 06                	je     ad601d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fbd>` |
| `0xad6017` | `ad6017:	4d 8b 46 40          	mov    r8,QWORD PTR [r14+0x40]` |
| `0xad601b` | `ad601b:	eb 04                	jmp    ad6021 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fc1>` |
| `0xad601d` | `ad601d:	4d 8d 46 31          	lea    r8,[r14+0x31]` |
| `0xad6021` | `ad6021:	89 df                	mov    edi,ebx` |
| `0xad6023` | `ad6023:	4c 89 e6             	mov    rsi,r12` |
| `0xad6026` | `ad6026:	ba 4f 01 00 00       	mov    edx,0x14f` |
| `0xad602b` | `ad602b:	4c 89 e9             	mov    rcx,r13` |
| `0xad602e` | `ad602e:	31 c0                	xor    eax,eax` |
| `0xad6030` | `ad6030:	e8 9d 08 d0 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xad6035` | `ad6035:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]` |
| `0xad603a` | `ad603a:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xadb9d0` | `adb9d0:	e8 9f ae ff ff       	call   ad6874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23814>` |
| `0xadb9d5` | `adb9d5:	48 89 df             	mov    rdi,rbx` |
| `0xadb9d8` | `adb9d8:	5b                   	pop    rbx` |
| `0xadb9d9` | `adb9d9:	e9 8c e5 f9 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xadb9de` | `adb9de:	41 56                	push   r14` |
| `0xadb9e0` | `adb9e0:	53                   	push   rbx` |
| `0xadb9e1` | `adb9e1:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadb9e5` | `adb9e5:	48 89 fb             	mov    rbx,rdi` |
| `0xadb9e8` | `adb9e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadb9ef` | `adb9ef:	00 00` |
| `0xadb9f1` | `adb9f1:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadb9f6` | `adb9f6:	48 8d b7 88 00 00 00 	lea    rsi,[rdi+0x88]` |
| `0xadb9fd` | `adb9fd:	49 89 e6             	mov    r14,rsp` |
| `0xadba00` | `adba00:	4c 89 f7             	mov    rdi,r14` |
| `0xadba03` | `adba03:	e8 28 f9 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadba08` | `adba08:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xadba0c` | `adba0c:	74 2a                	je     adba38 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x289d8>` |
| `0xadba0e` | `adba0e:	48 8d 73 30          	lea    rsi,[rbx+0x30]` |
| `0xadba12` | `adba12:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadba17` | `adba17:	e8 7c ba ff ff       	call   ad7498 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24438>` |
| `0xadba1c` | `adba1c:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xadba21` | `adba21:	83 66 58 00          	and    DWORD PTR [rsi+0x58],0x0` |
| `0xadba25` | `adba25:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]` |
| `0xadba29` | `adba29:	e8 62 23 fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>` |
| `0xadba2e` | `adba2e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadba33` | `adba33:	e8 30 00 00 00       	call   adba68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x28a08>` |
| `0xadba38` | `adba38:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xadba3d` | `adba3d:	e8 44 2a fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xadba42` | `adba42:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadba49` | `adba49:	00 00` |
| `0xadc0e8` | `adc0e8:	e8 c5 23 fc ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xadc0ed` | `adc0ed:	48 89 df             	mov    rdi,rbx` |
| `0xadc0f0` | `adc0f0:	5b                   	pop    rbx` |
| `0xadc0f1` | `adc0f1:	e9 74 de f9 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xadc0f6` | `adc0f6:	41 56                	push   r14` |
| `0xadc0f8` | `adc0f8:	53                   	push   rbx` |
| `0xadc0f9` | `adc0f9:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadc0fd` | `adc0fd:	48 89 fb             	mov    rbx,rdi` |
| `0xadc100` | `adc100:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadc107` | `adc107:	00 00` |
| `0xadc109` | `adc109:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadc10e` | `adc10e:	48 8d 77 40          	lea    rsi,[rdi+0x40]` |
| `0xadc112` | `adc112:	49 89 e6             	mov    r14,rsp` |
| `0xadc115` | `adc115:	4c 89 f7             	mov    rdi,r14` |
| `0xadc118` | `adc118:	e8 13 f2 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadc11d` | `adc11d:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0` |
| `0xadc121` | `adc121:	74 26                	je     adc149 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x290e9>` |
| `0xadc123` | `adc123:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]` |
| `0xadc127` | `adc127:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xadc12c` | `adc12c:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0` |
| `0xadc12f` | `adc12f:	c7 46 58 01 00 00 00 	mov    DWORD PTR [rsi+0x58],0x1` |
| `0xadc136` | `adc136:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]` |
| `0xadc13a` | `adc13a:	e8 51 1c fe ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>` |
| `0xadc13f` | `adc13f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]` |
| `0xadc144` | `adc144:	e8 1f f9 ff ff       	call   adba68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x28a08>` |
| `0xadc149` | `adc149:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0xadc14e` | `adc14e:	e8 33 23 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xadc153` | `adc153:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadc15a` | `adc15a:	00 00` |
| `0xadc15c` | `adc15c:	48 3b 44 24 70       	cmp    rax,QWORD PTR [rsp+0x70]` |
| `0xadf49f` | `adf49f:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xadf4a4` | `adf4a4:	c3                   	ret` |
| `0xadf4a5` | `adf4a5:	cc                   	int3` |
| `0xadf4a6` | `adf4a6:	55                   	push   rbp` |
| `0xadf4a7` | `adf4a7:	41 56                	push   r14` |
| `0xadf4a9` | `adf4a9:	53                   	push   rbx` |
| `0xadf4aa` | `adf4aa:	48 83 ec 60          	sub    rsp,0x60` |
| `0xadf4ae` | `adf4ae:	49 89 f6             	mov    r14,rsi` |
| `0xadf4b1` | `adf4b1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadf4b8` | `adf4b8:	00 00` |
| `0xadf4ba` | `adf4ba:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax` |
| `0xadf4bf` | `adf4bf:	48 8d 77 08          	lea    rsi,[rdi+0x8]` |
| `0xadf4c3` | `adf4c3:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]` |
| `0xadf4c8` | `adf4c8:	48 89 df             	mov    rdi,rbx` |
| `0xadf4cb` | `adf4cb:	e8 60 be fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadf4d0` | `adf4d0:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xadf4d3` | `adf4d3:	48 85 c0             	test   rax,rax` |
| `0xadf4d6` | `adf4d6:	0f 84 96 00 00 00    	je     adf572 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c512>` |
| `0xadf4dc` | `adf4dc:	48 8b 58 10          	mov    rbx,QWORD PTR [rax+0x10]` |
| `0xadf4e0` | `adf4e0:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]` |
| `0xadf4e3` | `adf4e3:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0` |
| `0xadf4e7` | `adf4e7:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]` |
| `0xadf4eb` | `adf4eb:	48 85 c0             	test   rax,rax` |
| `0xadf4ee` | `adf4ee:	74 05                	je     adf4f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c495>` |
| `0xadf4f0` | `adf4f0:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0xadf4f5` | `adf4f5:	41 8a 2e             	mov    bpl,BYTE PTR [r14]` |
| `0xadf4f8` | `adf4f8:	48 8d 05 19 27 97 ff 	lea    rax,[rip+0xffffffffff972719]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>` |
| `0xadf4ff` | `adf4ff:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax` |
| `0xadf504` | `adf504:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0xadf509` | `adf509:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0` |
| `0xadf5dc` | `adf5dc:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0xadf5df` | `adf5df:	e9 06 00 00 00       	jmp    adf5ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c58a>` |
| `0xadf5e4` | `adf5e4:	e9 c9 ee fb ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0xadf5e9` | `adf5e9:	cc                   	int3` |
| `0xadf5ea` | `adf5ea:	41 56                	push   r14` |
| `0xadf5ec` | `adf5ec:	53                   	push   rbx` |
| `0xadf5ed` | `adf5ed:	48 83 ec 78          	sub    rsp,0x78` |
| `0xadf5f1` | `adf5f1:	49 89 fe             	mov    r14,rdi` |
| `0xadf5f4` | `adf5f4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xadf5fb` | `adf5fb:	00 00` |
| `0xadf5fd` | `adf5fd:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax` |
| `0xadf602` | `adf602:	48 89 e3             	mov    rbx,rsp` |
| `0xadf605` | `adf605:	48 89 df             	mov    rdi,rbx` |
| `0xadf608` | `adf608:	4c 89 f6             	mov    rsi,r14` |
| `0xadf60b` | `adf60b:	e8 20 bd fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xadf610` | `adf610:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xadf613` | `adf613:	48 85 db             	test   rbx,rbx` |
| `0xadf616` | `adf616:	0f 84 4b 01 00 00    	je     adf767 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c707>` |
| `0xadf61c` | `adf61c:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0` |
| `0xadf621` | `adf621:	48 8d 05 3c 3f 96 ff 	lea    rax,[rip+0xffffffffff963f3c]        # 443564 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9170>` |
| `0xadf628` | `adf628:	4c 8d 05 31 3f 96 ff 	lea    r8,[rip+0xffffffffff963f31]        # 443560 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x916c>` |
| `0xadf62f` | `adf62f:	4c 0f 44 c0          	cmove  r8,rax` |
| `0xadf633` | `adf633:	48 8d 35 42 29 97 ff 	lea    rsi,[rip+0xffffffffff972942]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>` |
| `0xadf63a` | `adf63a:	48 8d 0d 5b 6b 89 ff 	lea    rcx,[rip+0xffffffffff896b5b]        # 37619c <_ZTSSt12bad_any_cast@@Base-0x1a02c>` |
| `0xadf641` | `adf641:	6a 04                	push   0x4` |
| `0xadf643` | `adf643:	5f                   	pop    rdi` |
| `0xadf644` | `adf644:	ba 86 00 00 00       	mov    edx,0x86` |
| `0xadf649` | `adf649:	31 c0                	xor    eax,eax` |
| `0xadf64b` | `adf64b:	e8 82 72 cf 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xadf650` | `adf650:	80 bb 08 01 00 00 00 	cmp    BYTE PTR [rbx+0x108],0x0` |
| `0xae0617` | `ae0617:	cc                   	int3` |
| `0xae0618` | `ae0618:	41 57                	push   r15` |
| `0xae061a` | `ae061a:	41 56                	push   r14` |
| `0xae061c` | `ae061c:	41 54                	push   r12` |
| `0xae061e` | `ae061e:	53                   	push   rbx` |
| `0xae061f` | `ae061f:	48 81 ec 88 00 00 00 	sub    rsp,0x88` |
| `0xae0626` | `ae0626:	49 89 fe             	mov    r14,rdi` |
| `0xae0629` | `ae0629:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0630` | `ae0630:	00 00` |
| `0xae0632` | `ae0632:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax` |
| `0xae0639` | `ae0639:	00` |
| `0xae063a` | `ae063a:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]` |
| `0xae063f` | `ae063f:	48 89 df             	mov    rdi,rbx` |
| `0xae0642` | `ae0642:	4c 89 f6             	mov    rsi,r14` |
| `0xae0645` | `ae0645:	e8 e6 ac fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xae064a` | `ae064a:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xae064d` | `ae064d:	48 85 db             	test   rbx,rbx` |
| `0xae0650` | `ae0650:	0f 84 5c 01 00 00    	je     ae07b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d752>` |
| `0xae0656` | `ae0656:	4d 8d 7e 10          	lea    r15,[r14+0x10]` |
| `0xae065a` | `ae065a:	80 bb c0 00 00 00 00 	cmp    BYTE PTR [rbx+0xc0],0x0` |
| `0xae0661` | `ae0661:	74 40                	je     ae06a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d643>` |
| `0xae0663` | `ae0663:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]` |
| `0xae0667` | `ae0667:	88 83 80 00 00 00    	mov    BYTE PTR [rbx+0x80],al` |
| `0xae066d` | `ae066d:	83 bb b0 00 00 00 ff 	cmp    DWORD PTR [rbx+0xb0],0xffffffff` |
| `0xae0674` | `ae0674:	41 8b 46 40          	mov    eax,DWORD PTR [r14+0x40]` |
| `0xae0678` | `ae0678:	75 05                	jne    ae067f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d61f>` |
| `0xae067a` | `ae067a:	83 f8 ff             	cmp    eax,0xffffffff` |
| `0xae067d` | `ae067d:	74 44                	je     ae06c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d663>` |
| `0xae067f` | `ae067f:	48 8d b3 88 00 00 00 	lea    rsi,[rbx+0x88]` |
| `0xae0686` | `ae0686:	83 f8 ff             	cmp    eax,0xffffffff` |
| `0xae0c3d` | `ae0c3d:	cc                   	int3` |
| `0xae0c3e` | `ae0c3e:	41 57                	push   r15` |
| `0xae0c40` | `ae0c40:	41 56                	push   r14` |
| `0xae0c42` | `ae0c42:	41 55                	push   r13` |
| `0xae0c44` | `ae0c44:	41 54                	push   r12` |
| `0xae0c46` | `ae0c46:	53                   	push   rbx` |
| `0xae0c47` | `ae0c47:	48 83 ec 20          	sub    rsp,0x20` |
| `0xae0c4b` | `ae0c4b:	49 89 fe             	mov    r14,rdi` |
| `0xae0c4e` | `ae0c4e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0c55` | `ae0c55:	00 00` |
| `0xae0c57` | `ae0c57:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xae0c5c` | `ae0c5c:	48 89 e3             	mov    rbx,rsp` |
| `0xae0c5f` | `ae0c5f:	48 89 df             	mov    rdi,rbx` |
| `0xae0c62` | `ae0c62:	4c 89 f6             	mov    rsi,r14` |
| `0xae0c65` | `ae0c65:	e8 c6 a6 fc ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>` |
| `0xae0c6a` | `ae0c6a:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]` |
| `0xae0c6d` | `ae0c6d:	48 85 db             	test   rbx,rbx` |
| `0xae0c70` | `ae0c70:	0f 84 b6 00 00 00    	je     ae0d2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dccc>` |
| `0xae0c76` | `ae0c76:	4c 8d bb 18 01 00 00 	lea    r15,[rbx+0x118]` |
| `0xae0c7d` | `ae0c7d:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]` |
| `0xae0c81` | `ae0c81:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]` |
| `0xae0c86` | `ae0c86:	4c 89 ff             	mov    rdi,r15` |
| `0xae0c89` | `ae0c89:	e8 ee 00 00 00       	call   ae0d7c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dd1c>` |
| `0xae0c8e` | `ae0c8e:	48 83 38 00          	cmp    QWORD PTR [rax],0x0` |
| `0xae0c92` | `ae0c92:	75 63                	jne    ae0cf7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2dc97>` |
| `0xae0c94` | `ae0c94:	49 89 c4             	mov    r12,rax` |
| `0xae0c97` | `ae0c97:	6a 60                	push   0x60` |
| `0xae0c99` | `ae0c99:	5f                   	pop    rdi` |
| `0xae0c9a` | `ae0c9a:	e8 61 d2 d0 00       	call   17edf00 <_Znwm@plt>` |
| `0xae0c9f` | `ae0c9f:	49 89 c5             	mov    r13,rax` |
| `0xae0e93` | `ae0e93:	cc                   	int3` |
| `0xae0e94` | `ae0e94:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]` |
| `0xae0e97` | `ae0e97:	e9 00 00 00 00       	jmp    ae0e9c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2de3c>` |
| `0xae0e9c` | `ae0e9c:	41 57                	push   r15` |
| `0xae0e9e` | `ae0e9e:	41 56                	push   r14` |
| `0xae0ea0` | `ae0ea0:	53                   	push   rbx` |
| `0xae0ea1` | `ae0ea1:	48 83 ec 20          	sub    rsp,0x20` |
| `0xae0ea5` | `ae0ea5:	48 89 fb             	mov    rbx,rdi` |
| `0xae0ea8` | `ae0ea8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xae0eaf` | `ae0eaf:	00 00` |
| ... | truncated 31066 more |

