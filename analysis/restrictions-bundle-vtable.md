# Restrictions bundle vtable trace

Purpose: resolve the vptr stored into `[rsp+0x2e0]` and inspect the methods called by `166103c`.

## Proven vptr materialization
```text
14ce65f  lea rax, [rip+...]  # 0x187e3c8
14ce666  lea rcx, [rsp+0x310]
14ce66e  mov [rcx-0x30], rax   ; [rsp+0x2e0] = 0x187e3c8
```

## Vtable/address-point entries around `0x187e3c8`
| offset from AP | entry address | resolved target | label | relocation tail |
|---:|---:|---:|---|---|
| `-0x20` | `0x187e3a8` | `0x153d244` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153d244` |
| `-0x18` | `0x187e3b0` | `0xd40f3c` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `d40f3c` |
| `-0x10` | `0x187e3b8` | `?` | `` | `` |
| `-0x8` | `0x187e3c0` | `?` | `` | `` |
| `+0x0` | `0x187e3c8` | `0x153cada` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153cada` |
| `+0x8` | `0x187e3d0` | `0x153cb74` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153cb74` |
| `+0x10` | `0x187e3d8` | `0x153cb86` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153cb86` |
| `+0x18` | `0x187e3e0` | `0xa3fa60` | `_ZNKSt6__ndk17codecvtIcc9mbstate_tE16do_always_noconvEv@@Base` | `a3fa60` |
| `+0x20` | `0x187e3e8` | `0x165d0fa` | `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `165d0fa` |
| `+0x28` | `0x187e3f0` | `0x165dd40` | `_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `165dd40` |
| `+0x30` | `0x187e3f8` | `0x153cbfc` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153cbfc` |
| `+0x38` | `0x187e400` | `0x153cd4e` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153cd4e` |
| `+0x40` | `0x187e408` | `0x153cdf2` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153cdf2` |
| `+0x48` | `0x187e410` | `0x153cea8` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153cea8` |
| `+0x50` | `0x187e418` | `0x153ceb0` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` | `153ceb0` |
| `+0x58` | `0x187e420` | `?` | `` | `` |
| `+0x60` | `0x187e428` | `?` | `` | `` |

## Methods reached from `166103c`
| callsite in 166103c | vtable offset | method target | label |
|---:|---:|---:|---|
| `0x1661089` | `+0x10` | `0x153cb86` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` |
| `0x16610a2` | `+0x18` | `0xa3fa60` | `_ZNKSt6__ndk17codecvtIcc9mbstate_tE16do_always_noconvEv@@Base` |
| `0x1661095` | `+0x30` | `0x153cbfc` | `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base` |

## Method vtable `+0x10` target `0x153cb86`
- label: `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- instructions scanned: `419`
- arg-memory refs: `58`
- arg-derived writes/calls: `15`
- calls: `33`
- returns in window: `4`

### Entry body excerpt
```text
     153cb86:	41 56                	push   r14
     153cb88:	53                   	push   rbx
     153cb89:	50                   	push   rax
     153cb8a:	48 89 fb             	mov    rbx,rdi
     153cb8d:	83 67 50 00          	and    DWORD PTR [rdi+0x50],0x0
     153cb91:	83 a7 90 00 00 00 00 	and    DWORD PTR [rdi+0x90],0x0
     153cb98:	31 c0                	xor    eax,eax
     153cb9a:	39 47 20             	cmp    DWORD PTR [rdi+0x20],eax
     153cb9d:	74 20                	je     153cbbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382143>
     153cb9f:	45 31 f6             	xor    r14d,r14d
     153cba2:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
     153cba6:	4a 8b 3c f0          	mov    rdi,QWORD PTR [rax+r14*8]
     153cbaa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     153cbad:	ff 50 10             	call   QWORD PTR [rax+0x10]
     153cbb0:	49 ff c6             	inc    r14
     153cbb3:	8b 43 20             	mov    eax,DWORD PTR [rbx+0x20]
     153cbb6:	49 39 c6             	cmp    r14,rax
     153cbb9:	72 e7                	jb     153cba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382126>
     153cbbb:	83 63 20 00          	and    DWORD PTR [rbx+0x20],0x0
     153cbbf:	83 7b 60 00          	cmp    DWORD PTR [rbx+0x60],0x0
     153cbc3:	74 20                	je     153cbe5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382169>
     153cbc5:	45 31 f6             	xor    r14d,r14d
     153cbc8:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]
     153cbcc:	4a 8b 3c f0          	mov    rdi,QWORD PTR [rax+r14*8]
     153cbd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     153cbd3:	ff 50 10             	call   QWORD PTR [rax+0x10]
     153cbd6:	49 ff c6             	inc    r14
     153cbd9:	8b 43 60             	mov    eax,DWORD PTR [rbx+0x60]
     153cbdc:	49 39 c6             	cmp    r14,rax
     153cbdf:	72 e7                	jb     153cbc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38214c>
     153cbe1:	83 63 60 00          	and    DWORD PTR [rbx+0x60],0x0
     153cbe5:	83 63 08 00          	and    DWORD PTR [rbx+0x8],0x0
     153cbe9:	48 83 c3 10          	add    rbx,0x10
     153cbed:	48 89 df             	mov    rdi,rbx
     153cbf0:	48 83 c4 08          	add    rsp,0x8
     153cbf4:	5b                   	pop    rbx
     153cbf5:	41 5e                	pop    r14
     153cbf7:	e9 02 d8 7e ff       	jmp    d2a3fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27739e>
     153cbfc:	55                   	push   rbp
     153cbfd:	41 57                	push   r15
     153cbff:	41 56                	push   r14
     153cc01:	41 55                	push   r13
     153cc03:	41 54                	push   r12
     153cc05:	53                   	push   rbx
     153cc06:	48 83 ec 28          	sub    rsp,0x28
     153cc0a:	48 89 f3             	mov    rbx,rsi
     153cc0d:	49 89 fe             	mov    r14,rdi
     153cc10:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     153cc17:	00 00 
     153cc19:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     153cc1e:	48 8d 57 10          	lea    rdx,[rdi+0x10]
     153cc22:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     153cc27:	48 89 df             	mov    rdi,rbx
     153cc2a:	e8 3b 32 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>
     153cc2f:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]
     153cc36:	49 8d 46 58          	lea    rax,[r14+0x58]
     153cc3a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     153cc3f:	4d 8d 6e 50          	lea    r13,[r14+0x50]
     153cc43:	49 8d 6e 18          	lea    rbp,[r14+0x18]
     153cc47:	4c 8d 25 16 c2 e5 fe 	lea    r12,[rip+0xfffffffffee5c216]        # 398e64 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x5a45>
     153cc4e:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
     153cc51:	85 c9                	test   ecx,ecx
     153cc53:	0f 84 b0 00 00 00    	je     153cd09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38228d>
     153cc59:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
     153cc5d:	0f b6 02             	movzx  eax,BYTE PTR [rdx]
     153cc60:	84 c0                	test   al,al
     153cc62:	0f 88 a1 00 00 00    	js     153cd09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38228d>
     153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax
     153cc6b:	48 ff c2             	inc    rdx
     153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
     153cc72:	ff c9                	dec    ecx
     153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx
     153cc77:	c1 e8 03             	shr    eax,0x3
     153cc7a:	83 f8 04             	cmp    eax,0x4
     153cc7d:	77 7d                	ja     153ccfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382280>
     153cc7f:	49 63 04 84          	movsxd rax,DWORD PTR [r12+rax*4]
     153cc83:	4c 01 e0             	add    rax,r12
     153cc86:	ff e0                	jmp    rax
     153cc88:	48 89 df             	mov    rdi,rbx
     153cc8b:	e8 da 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>
     153cc90:	84 c0                	test   al,al
     153cc92:	74 ba                	je     153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cc94:	48 89 ef             	mov    rdi,rbp
     153cc97:	e8 02 ae fc ff       	call   1507a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d022>
     153cc9c:	48 89 c7             	mov    rdi,rax
     153cc9f:	48 89 de             	mov    rsi,rbx
     153cca2:	e8 fd 05 00 00       	call   153d2a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828>
     153cca7:	eb a5                	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cca9:	48 89 df             	mov    rdi,rbx
     153ccac:	e8 b9 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>
    ... truncated 329 additional instructions ...
```

### Arg-memory refs
| addr | arg-derived location | instruction |
|---|---|---|
| `0x153cb8d` | `arg:rdi+50` | `153cb8d:	83 67 50 00          	and    DWORD PTR [rdi+0x50],0x0` |
| `0x153cb91` | `arg:rdi+90` | `153cb91:	83 a7 90 00 00 00 00 	and    DWORD PTR [rdi+0x90],0x0` |
| `0x153cb9a` | `arg:rdi+20` | `153cb9a:	39 47 20             	cmp    DWORD PTR [rdi+0x20],eax` |
| `0x153cba2` | `arg:rdi+18` | `153cba2:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]` |
| `0x153cbb3` | `arg:rdi+20` | `153cbb3:	8b 43 20             	mov    eax,DWORD PTR [rbx+0x20]` |
| `0x153cbbb` | `arg:rdi+20` | `153cbbb:	83 63 20 00          	and    DWORD PTR [rbx+0x20],0x0` |
| `0x153cbbf` | `arg:rdi+60` | `153cbbf:	83 7b 60 00          	cmp    DWORD PTR [rbx+0x60],0x0` |
| `0x153cbc8` | `arg:rdi+58` | `153cbc8:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]` |
| `0x153cbd9` | `arg:rdi+60` | `153cbd9:	8b 43 60             	mov    eax,DWORD PTR [rbx+0x60]` |
| `0x153cbe1` | `arg:rdi+60` | `153cbe1:	83 63 60 00          	and    DWORD PTR [rbx+0x60],0x0` |
| `0x153cbe5` | `arg:rdi+8` | `153cbe5:	83 63 08 00          	and    DWORD PTR [rbx+0x8],0x0` |
| `0x153cc4e` | `arg:rsi+18` | `153cc4e:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]` |
| `0x153cc59` | `arg:rsi+10` | `153cc59:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x153cc5d` | `load(arg:rsi+10)` | `153cc5d:	0f b6 02             	movzx  eax,BYTE PTR [rdx]` |
| `0x153cc68` | `arg:rsi+38` | `153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153cc6e` | `arg:rsi+10` | `153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153cc74` | `arg:rsi+18` | `153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153cd23` | `arg:rsi` | `153cd23:	80 3b 00             	cmp    BYTE PTR [rbx],0x0` |
| `0x153cd58` | `arg:rsi+20` | `153cd58:	83 7f 20 00          	cmp    DWORD PTR [rdi+0x20],0x0` |
| `0x153cd66` | `arg:rsi+18` | `153cd66:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]` |
| `0x153cd7a` | `arg:rsi+20` | `153cd7a:	41 8b 46 20          	mov    eax,DWORD PTR [r14+0x20]` |
| `0x153cd87` | `arg:rsi+8` | `153cd87:	41 8b 6e 08          	mov    ebp,DWORD PTR [r14+0x8]` |
| `0x153cd91` | `arg:rsi+50` | `153cd91:	41 8b 76 50          	mov    esi,DWORD PTR [r14+0x50]` |
| `0x153cd9f` | `arg:rsi+60` | `153cd9f:	41 83 7e 60 00       	cmp    DWORD PTR [r14+0x60],0x0` |
| `0x153cdac` | `arg:rsi+58` | `153cdac:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]` |
| `0x153cdc0` | `arg:rsi+60` | `153cdc0:	41 8b 46 60          	mov    eax,DWORD PTR [r14+0x60]` |
| `0x153cdc9` | `arg:rsi+8` | `153cdc9:	41 8b 6e 08          	mov    ebp,DWORD PTR [r14+0x8]` |
| `0x153cdd3` | `arg:rsi+90` | `153cdd3:	41 8b b6 90 00 00 00 	mov    esi,DWORD PTR [r14+0x90]` |
| `0x153ce9a` | `load(arg:rsi+90)` | `153ce9a:	8a 03                	mov    al,BYTE PTR [rbx]` |
| `0x153cecb` | `load(arg:rsi+90)+50` | `153cecb:	41 89 46 50          	mov    DWORD PTR [r14+0x50],eax` |
| `0x153cedc` | `load(arg:rsi+90)+90` | `153cedc:	41 89 86 90 00 00 00 	mov    DWORD PTR [r14+0x90],eax` |
| `0x153cee6` | `load(arg:rsi+90)+8` | `153cee6:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153ceea` | `load(arg:rsi+90)+18` | `153ceea:	49 8d 7e 18          	lea    rdi,[r14+0x18]` |
| `0x153cef1` | `load(arg:rsi+90)+20` | `153cef1:	41 03 6e 20          	add    ebp,DWORD PTR [r14+0x20]` |
| `0x153cefc` | `load(arg:rsi+90)+20` | `153cefc:	41 39 6e 20          	cmp    DWORD PTR [r14+0x20],ebp` |
| `0x153cf02` | `load(arg:rsi+90)+28` | `153cf02:	45 8b 66 28          	mov    r12d,DWORD PTR [r14+0x28]` |
| `0x153cf34` | `load(arg:rsi+90)+18` | `153cf34:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]` |
| `0x153cf38` | `load(load(arg:rsi+90)+28)+1` | `153cf38:	41 8d 54 24 01       	lea    edx,[r12+0x1]` |
| `0x153cf3d` | `load(arg:rsi+90)+28` | `153cf3d:	41 89 56 28          	mov    DWORD PTR [r14+0x28],edx` |
| `0x153cf48` | `load(arg:rsi+90)+28` | `153cf48:	45 8b 66 28          	mov    r12d,DWORD PTR [r14+0x28]` |
| `0x153cf58` | `load(arg:rsi+90)+18` | `153cf58:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]` |
| `0x153cf6c` | `load(arg:rsi+90)+20` | `153cf6c:	45 3b 7e 20          	cmp    r15d,DWORD PTR [r14+0x20]` |
| `0x153cf72` | `load(arg:rsi+90)+20` | `153cf72:	41 89 6e 20          	mov    DWORD PTR [r14+0x20],ebp` |
| `0x153cf80` | `load(arg:rsi+90)+18` | `153cf80:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]` |
| `0x153cf84` | `load(arg:rsi+90)+20` | `153cf84:	41 8b 56 20          	mov    edx,DWORD PTR [r14+0x20]` |
| `0x153cfaa` | `load(arg:rsi+90)+58` | `153cfaa:	49 8d 7e 58          	lea    rdi,[r14+0x58]` |
| `0x153cfb1` | `load(arg:rsi+90)+60` | `153cfb1:	41 03 6e 60          	add    ebp,DWORD PTR [r14+0x60]` |
| `0x153cfbc` | `load(arg:rsi+90)+60` | `153cfbc:	41 39 6e 60          	cmp    DWORD PTR [r14+0x60],ebp` |
| `0x153cfc2` | `load(arg:rsi+90)+68` | `153cfc2:	45 8b 66 68          	mov    r12d,DWORD PTR [r14+0x68]` |
| `0x153cff9` | `load(arg:rsi+90)+58` | `153cff9:	49 8b 4e 58          	mov    rcx,QWORD PTR [r14+0x58]` |
| `0x153cffd` | `load(load(arg:rsi+90)+68)+1` | `153cffd:	41 8d 54 24 01       	lea    edx,[r12+0x1]` |
| `0x153d002` | `load(arg:rsi+90)+68` | `153d002:	41 89 56 68          	mov    DWORD PTR [r14+0x68],edx` |
| `0x153d00d` | `load(arg:rsi+90)+68` | `153d00d:	45 8b 66 68          	mov    r12d,DWORD PTR [r14+0x68]` |
| `0x153d01d` | `load(arg:rsi+90)+58` | `153d01d:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]` |
| `0x153d031` | `load(arg:rsi+90)+60` | `153d031:	45 3b 7e 60          	cmp    r15d,DWORD PTR [r14+0x60]` |
| `0x153d037` | `load(arg:rsi+90)+60` | `153d037:	41 89 6e 60          	mov    DWORD PTR [r14+0x60],ebp` |
| `0x153d045` | `load(arg:rsi+90)+58` | `153d045:	49 8b 4e 58          	mov    rcx,QWORD PTR [r14+0x58]` |
| `0x153d049` | `load(arg:rsi+90)+60` | `153d049:	41 8b 56 60          	mov    edx,DWORD PTR [r14+0x60]` |

### Arg-derived writes / indirect calls
| addr | arg-derived location | instruction |
|---|---|---|
| `0x153cb8d` | `arg:rdi+50` | `153cb8d:	83 67 50 00          	and    DWORD PTR [rdi+0x50],0x0` |
| `0x153cb91` | `arg:rdi+90` | `153cb91:	83 a7 90 00 00 00 00 	and    DWORD PTR [rdi+0x90],0x0` |
| `0x153cbbb` | `arg:rdi+20` | `153cbbb:	83 63 20 00          	and    DWORD PTR [rbx+0x20],0x0` |
| `0x153cbe1` | `arg:rdi+60` | `153cbe1:	83 63 60 00          	and    DWORD PTR [rbx+0x60],0x0` |
| `0x153cbe5` | `arg:rdi+8` | `153cbe5:	83 63 08 00          	and    DWORD PTR [rbx+0x8],0x0` |
| `0x153cc68` | `arg:rsi+38` | `153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153cc6e` | `arg:rsi+10` | `153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153cc74` | `arg:rsi+18` | `153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153cecb` | `load(arg:rsi+90)+50` | `153cecb:	41 89 46 50          	mov    DWORD PTR [r14+0x50],eax` |
| `0x153cedc` | `load(arg:rsi+90)+90` | `153cedc:	41 89 86 90 00 00 00 	mov    DWORD PTR [r14+0x90],eax` |
| `0x153cee6` | `load(arg:rsi+90)+8` | `153cee6:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153cf3d` | `load(arg:rsi+90)+28` | `153cf3d:	41 89 56 28          	mov    DWORD PTR [r14+0x28],edx` |
| `0x153cf72` | `load(arg:rsi+90)+20` | `153cf72:	41 89 6e 20          	mov    DWORD PTR [r14+0x20],ebp` |
| `0x153d002` | `load(arg:rsi+90)+68` | `153d002:	41 89 56 68          	mov    DWORD PTR [r14+0x68],edx` |
| `0x153d037` | `load(arg:rsi+90)+60` | `153d037:	41 89 6e 60          	mov    DWORD PTR [r14+0x60],ebp` |

### Calls inside method
| call | tracked args | instruction |
|---|---|---|
| `0x153cbad` | `rsi=arg:rsi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `153cbad:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x153cbd3` | `rsi=arg:rsi, rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `153cbd3:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x153cc2a` | `rdi=arg:rsi, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `153cc2a:	e8 3b 32 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153cc8b` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cc8b:	e8 da 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>` |
| `0x153cc97` | `r8=arg:r8, r9=arg:r9` | `153cc97:	e8 02 ae fc ff       	call   1507a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d022>` |
| `0x153cca2` | `rsi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cca2:	e8 fd 05 00 00       	call   153d2a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828>` |
| `0x153ccac` | `rdi=arg:rsi, rsi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153ccac:	e8 b9 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>` |
| `0x153ccba` | `rsi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153ccba:	e8 61 ae fc ff       	call   1507b20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0a4>` |
| `0x153ccc5` | `rsi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153ccc5:	e8 06 04 00 00       	call   153d0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382654>` |
| `0x153ccd2` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153ccd2:	e8 5b 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153cceb` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cceb:	e8 42 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153ccff` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153ccff:	e8 42 36 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153cd0c` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cd0c:	e8 15 32 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153cd1e` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cd1e:	e8 8d 32 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |
| `0x153cd48` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cd48:	e8 63 2d 2b 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x153cd70` | `r8=arg:r8, r9=arg:r9` | `153cd70:	e8 bf 81 b5 ff       	call   1094f34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c34a>` |
| `0x153cd98` | `rsi=load(arg:rsi+50), r8=arg:r8, r9=arg:r9` | `153cd98:	e8 57 85 b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>` |
| `0x153cdb6` | `r8=arg:r8, r9=arg:r9` | `153cdb6:	e8 79 81 b5 ff       	call   1094f34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c34a>` |
| `0x153cddd` | `rsi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153cddd:	e8 12 85 b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>` |
| `0x153ce18` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce18:	e8 87 29 12 00       	call   165f7a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13910>` |
| `0x153ce3a` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce3a:	e8 15 25 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>` |
| `0x153ce59` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce59:	e8 46 29 12 00       	call   165f7a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13910>` |
| `0x153ce7e` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce7e:	e8 d1 24 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>` |
| `0x153ce95` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce95:	e8 86 29 12 00       	call   165f820 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1398c>` |
| `0x153cef7` | `rdi=load(arg:rsi+90)+18, r8=arg:r8, r9=arg:r9` | `153cef7:	e8 9c 8e 7d ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x153cf19` | `r8=arg:r8, r9=arg:r9` | `153cf19:	e8 e2 0f 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153cf66` | `rdx=load(load(arg:rsi+90)+28), r8=arg:r8, r9=arg:r9` | `153cf66:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x153cf9c` | `rcx=load(load(arg:rsi+90)+18), r8=arg:r8, r9=arg:r9` | `153cf9c:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0x153cfb7` | `rdi=load(arg:rsi+90)+58, rcx=load(load(arg:rsi+90)+18), r8=arg:r8, r9=arg:r9` | `153cfb7:	e8 dc 8d 7d ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x153cfd9` | `rcx=load(load(arg:rsi+90)+18), r8=arg:r8, r9=arg:r9` | `153cfd9:	e8 22 0f 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153d02b` | `rdx=load(load(arg:rsi+90)+68), r8=arg:r8, r9=arg:r9` | `153d02b:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x153d061` | `rcx=load(load(arg:rsi+90)+58), r8=arg:r8, r9=arg:r9` | `153d061:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0x153d0a2` | `rcx=load(load(arg:rsi+90)+58), r8=arg:r8, r9=arg:r9` | `153d0a2:	e8 e9 0d 2b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |

## Method vtable `+0x18` target `0xa3fa60`
- label: `_ZNKSt6__ndk17codecvtIcc9mbstate_tE16do_always_noconvEv@@Base`
- instructions scanned: `386`
- arg-memory refs: `3`
- arg-derived writes/calls: `3`
- calls: `28`
- returns in window: `4`

### Entry body excerpt
```text
      a3fa60:	b0 01                	mov    al,0x1
      a3fa62:	c3                   	ret
      a3fa63:	cc                   	int3
      a3fa64:	cc                   	int3
      a3fa65:	cc                   	int3
      a3fa66:	cc                   	int3
      a3fa67:	cc                   	int3
      a3fa68:	cc                   	int3
      a3fa69:	cc                   	int3
      a3fa6a:	cc                   	int3
      a3fa6b:	cc                   	int3
      a3fa6c:	cc                   	int3
      a3fa6d:	cc                   	int3
      a3fa6e:	cc                   	int3
      a3fa6f:	cc                   	int3
      a3fa70:	48 89 c8             	mov    rax,rcx
      a3fa73:	48 29 d0             	sub    rax,rdx
      a3fa76:	4c 39 c0             	cmp    rax,r8
      a3fa79:	49 0f 43 c0          	cmovae rax,r8
      a3fa7d:	c3                   	ret
      a3fa7e:	cc                   	int3
      a3fa7f:	cc                   	int3
      a3fa80:	41 56                	push   r14
      a3fa82:	53                   	push   rbx
      a3fa83:	50                   	push   rax
      a3fa84:	48 89 fb             	mov    rbx,rdi
      a3fa87:	48 ff ce             	dec    rsi
      a3fa8a:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
      a3fa8e:	48 8b 05 ab 27 e7 00 	mov    rax,QWORD PTR [rip+0xe727ab]        # 18b2240 <_ZTVNSt6__ndk17codecvtIwc9mbstate_tEE@@Base+0xbbc58>
      a3fa95:	48 83 c0 10          	add    rax,0x10
      a3fa99:	48 89 07             	mov    QWORD PTR [rdi],rax
      a3fa9c:	0f b6 05 8d ff f9 00 	movzx  eax,BYTE PTR [rip+0xf9ff8d]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
      a3faa3:	84 c0                	test   al,al
      a3faa5:	74 13                	je     a3faba <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x3a>
      a3faa7:	48 8b 05 7a ff f9 00 	mov    rax,QWORD PTR [rip+0xf9ff7a]        # 19dfa28 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x10>
      a3faae:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a3fab2:	48 83 c4 08          	add    rsp,0x8
      a3fab6:	5b                   	pop    rbx
      a3fab7:	41 5e                	pop    r14
      a3fab9:	c3                   	ret
      a3faba:	48 8d 3d 6f ff f9 00 	lea    rdi,[rip+0xf9ff6f]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
      a3fac1:	e8 aa e6 da 00       	call   17ee170 <__cxa_guard_acquire@plt>
      a3fac6:	85 c0                	test   eax,eax
      a3fac8:	74 dd                	je     a3faa7 <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x27>
      a3faca:	48 8d 35 3b 94 92 ff 	lea    rsi,[rip+0xffffffffff92943b]        # 368f0c <_ZTSSt12bad_any_cast@@Base-0x272bc>
      a3fad1:	bf bf 1f 00 00       	mov    edi,0x1fbf
      a3fad6:	31 d2                	xor    edx,edx
      a3fad8:	e8 b3 06 db 00       	call   17f0190 <newlocale@plt>
      a3fadd:	48 89 05 44 ff f9 00 	mov    QWORD PTR [rip+0xf9ff44],rax        # 19dfa28 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x10>
      a3fae4:	48 8d 3d 45 ff f9 00 	lea    rdi,[rip+0xf9ff45]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
      a3faeb:	e8 90 e6 da 00       	call   17ee180 <__cxa_guard_release@plt>
      a3faf0:	eb b5                	jmp    a3faa7 <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1Em@@Base+0x27>
      a3faf2:	49 89 c6             	mov    r14,rax
      a3faf5:	48 8d 3d 34 ff f9 00 	lea    rdi,[rip+0xf9ff34]        # 19dfa30 <_ZNSt6__ndk18messagesIwE2idE@@Base+0x18>
      a3fafc:	e8 ff ec da 00       	call   17ee800 <__cxa_guard_abort@plt>
      a3fb01:	48 89 df             	mov    rdi,rbx
      a3fb04:	e8 97 f6 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>
      a3fb09:	4c 89 f7             	mov    rdi,r14
      a3fb0c:	e8 bf 01 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      a3fb11:	cc                   	int3
      a3fb12:	cc                   	int3
      a3fb13:	cc                   	int3
      a3fb14:	cc                   	int3
      a3fb15:	cc                   	int3
      a3fb16:	cc                   	int3
      a3fb17:	cc                   	int3
      a3fb18:	cc                   	int3
      a3fb19:	cc                   	int3
      a3fb1a:	cc                   	int3
      a3fb1b:	cc                   	int3
      a3fb1c:	cc                   	int3
      a3fb1d:	cc                   	int3
      a3fb1e:	cc                   	int3
      a3fb1f:	cc                   	int3
      a3fb20:	41 56                	push   r14
      a3fb22:	53                   	push   rbx
      a3fb23:	48 83 ec 38          	sub    rsp,0x38
      a3fb27:	49 89 f6             	mov    r14,rsi
      a3fb2a:	48 89 fb             	mov    rbx,rdi
      a3fb2d:	48 ff ca             	dec    rdx
      a3fb30:	48 89 57 08          	mov    QWORD PTR [rdi+0x8],rdx
      a3fb34:	48 8b 05 05 27 e7 00 	mov    rax,QWORD PTR [rip+0xe72705]        # 18b2240 <_ZTVNSt6__ndk17codecvtIwc9mbstate_tEE@@Base+0xbbc58>
      a3fb3b:	48 83 c0 10          	add    rax,0x10
      a3fb3f:	48 89 07             	mov    QWORD PTR [rdi],rax
      a3fb42:	bf bf 1f 00 00       	mov    edi,0x1fbf
      a3fb47:	31 d2                	xor    edx,edx
      a3fb49:	e8 42 06 db 00       	call   17f0190 <newlocale@plt>
      a3fb4e:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      a3fb52:	48 85 c0             	test   rax,rax
      a3fb55:	74 08                	je     a3fb5f <_ZNSt6__ndk17codecvtIwc9mbstate_tEC1EPKcm@@Base+0x3f>
    ... truncated 296 additional instructions ...
```

### Arg-memory refs
| addr | arg-derived location | instruction |
|---|---|---|
| `0xa3fa8a` | `arg:rdi+8` | `a3fa8a:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi` |
| `0xa3fa99` | `arg:rdi` | `a3fa99:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xa3faae` | `arg:rdi+10` | `a3faae:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |

### Arg-derived writes / indirect calls
| addr | arg-derived location | instruction |
|---|---|---|
| `0xa3fa8a` | `arg:rdi+8` | `a3fa8a:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi` |
| `0xa3fa99` | `arg:rdi` | `a3fa99:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xa3faae` | `arg:rdi+10` | `a3faae:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |

### Calls inside method
| call | tracked args | instruction |
|---|---|---|
| `0xa3fac1` | `rdx=arg:rdx, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fac1:	e8 aa e6 da 00       	call   17ee170 <__cxa_guard_acquire@plt>` |
| `0xa3fad8` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fad8:	e8 b3 06 db 00       	call   17f0190 <newlocale@plt>` |
| `0xa3faeb` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3faeb:	e8 90 e6 da 00       	call   17ee180 <__cxa_guard_release@plt>` |
| `0xa3fafc` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fafc:	e8 ff ec da 00       	call   17ee800 <__cxa_guard_abort@plt>` |
| `0xa3fb04` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fb04:	e8 97 f6 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>` |
| `0xa3fb0c` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fb0c:	e8 bf 01 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xa3fb49` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fb49:	e8 42 06 db 00       	call   17f0190 <newlocale@plt>` |
| `0xa3fb67` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fb67:	e8 12 9f 03 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa3fb7d` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fb7d:	e8 17 62 07 00       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>` |
| `0xa3fb95` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fb95:	e8 c6 00 db 00       	call   17efc60 <_ZNSt6__ndk121__throw_runtime_errorEPKc@plt>` |
| `0xa3fbae` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fbae:	e8 ed f5 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>` |
| `0xa3fbb6` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fbb6:	e8 15 01 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xa3fbc0` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fbc0:	e8 5b e3 da 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xa3fbdd` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fbdd:	e8 3e e3 da 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xa3fbe5` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fbe5:	e8 b6 f5 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>` |
| `0xa3fbed` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fbed:	e8 de 00 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xa3fbfa` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fbfa:	e8 a1 f5 da 00       	call   17ef1a0 <_ZNSt6__ndk114__shared_countD2Ev@plt>` |
| `0xa3fc02` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fc02:	e8 c9 00 03 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xa3fc14` | `rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `a3fc14:	e8 17 0b db 00       	call   17f0730 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@plt>` |
| `0xa3fce8` | `r8=arg:r8, r9=arg:r9` | `a3fce8:	e8 b3 04 db 00       	call   17f01a0 <uselocale@plt>` |
| `0xa3fd08` | `rdi=arg:r9, r9=arg:r9` | `a3fd08:	e8 33 0a db 00       	call   17f0740 <wcsnrtombs@plt>` |
| `0xa3fd18` | `r9=arg:r9` | `a3fd18:	e8 83 04 db 00       	call   17f01a0 <uselocale@plt>` |
| `0xa3fd63` | `r9=arg:r9` | `a3fd63:	e8 38 04 db 00       	call   17f01a0 <uselocale@plt>` |
| `0xa3fd7c` | `r9=arg:r9` | `a3fd7c:	e8 cf 09 db 00       	call   17f0750 <wcrtomb@plt>` |
| `0xa3fd8c` | `r9=arg:r9` | `a3fd8c:	e8 0f 04 db 00       	call   17f01a0 <uselocale@plt>` |
| `0xa3ff1d` | `r9=arg:r9` | `a3ff1d:	e8 7e 02 db 00       	call   17f01a0 <uselocale@plt>` |
| `0xa3ff33` | `r9=arg:r9` | `a3ff33:	e8 18 08 db 00       	call   17f0750 <wcrtomb@plt>` |
| `0xa3ff43` | `r9=arg:r9` | `a3ff43:	e8 58 02 db 00       	call   17f01a0 <uselocale@plt>` |

## Method vtable `+0x30` target `0x153cbfc`
- label: `_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base`
- instructions scanned: `419`
- arg-memory refs: `54`
- arg-derived writes/calls: `12`
- calls: `34`
- returns in window: `4`

### Entry body excerpt
```text
     153cbfc:	55                   	push   rbp
     153cbfd:	41 57                	push   r15
     153cbff:	41 56                	push   r14
     153cc01:	41 55                	push   r13
     153cc03:	41 54                	push   r12
     153cc05:	53                   	push   rbx
     153cc06:	48 83 ec 28          	sub    rsp,0x28
     153cc0a:	48 89 f3             	mov    rbx,rsi
     153cc0d:	49 89 fe             	mov    r14,rdi
     153cc10:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     153cc17:	00 00 
     153cc19:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     153cc1e:	48 8d 57 10          	lea    rdx,[rdi+0x10]
     153cc22:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     153cc27:	48 89 df             	mov    rdi,rbx
     153cc2a:	e8 3b 32 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>
     153cc2f:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]
     153cc36:	49 8d 46 58          	lea    rax,[r14+0x58]
     153cc3a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     153cc3f:	4d 8d 6e 50          	lea    r13,[r14+0x50]
     153cc43:	49 8d 6e 18          	lea    rbp,[r14+0x18]
     153cc47:	4c 8d 25 16 c2 e5 fe 	lea    r12,[rip+0xfffffffffee5c216]        # 398e64 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x5a45>
     153cc4e:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]
     153cc51:	85 c9                	test   ecx,ecx
     153cc53:	0f 84 b0 00 00 00    	je     153cd09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38228d>
     153cc59:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
     153cc5d:	0f b6 02             	movzx  eax,BYTE PTR [rdx]
     153cc60:	84 c0                	test   al,al
     153cc62:	0f 88 a1 00 00 00    	js     153cd09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38228d>
     153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax
     153cc6b:	48 ff c2             	inc    rdx
     153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
     153cc72:	ff c9                	dec    ecx
     153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx
     153cc77:	c1 e8 03             	shr    eax,0x3
     153cc7a:	83 f8 04             	cmp    eax,0x4
     153cc7d:	77 7d                	ja     153ccfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382280>
     153cc7f:	49 63 04 84          	movsxd rax,DWORD PTR [r12+rax*4]
     153cc83:	4c 01 e0             	add    rax,r12
     153cc86:	ff e0                	jmp    rax
     153cc88:	48 89 df             	mov    rdi,rbx
     153cc8b:	e8 da 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>
     153cc90:	84 c0                	test   al,al
     153cc92:	74 ba                	je     153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cc94:	48 89 ef             	mov    rdi,rbp
     153cc97:	e8 02 ae fc ff       	call   1507a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d022>
     153cc9c:	48 89 c7             	mov    rdi,rax
     153cc9f:	48 89 de             	mov    rsi,rbx
     153cca2:	e8 fd 05 00 00       	call   153d2a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828>
     153cca7:	eb a5                	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cca9:	48 89 df             	mov    rdi,rbx
     153ccac:	e8 b9 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>
     153ccb1:	84 c0                	test   al,al
     153ccb3:	74 99                	je     153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153ccb5:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     153ccba:	e8 61 ae fc ff       	call   1507b20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0a4>
     153ccbf:	48 89 c7             	mov    rdi,rax
     153ccc2:	48 89 de             	mov    rsi,rbx
     153ccc5:	e8 06 04 00 00       	call   153d0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382654>
     153ccca:	eb 82                	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cccc:	48 89 df             	mov    rdi,rbx
     153cccf:	4c 89 fe             	mov    rsi,r15
     153ccd2:	e8 5b 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>
     153ccd7:	0f b6 c0             	movzx  eax,al
     153ccda:	01 c0                	add    eax,eax
     153ccdc:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
     153cce0:	e9 69 ff ff ff       	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cce5:	48 89 df             	mov    rdi,rbx
     153cce8:	4c 89 ee             	mov    rsi,r13
     153cceb:	e8 42 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>
     153ccf0:	0f b6 c0             	movzx  eax,al
     153ccf3:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax
     153ccf7:	e9 52 ff ff ff       	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153ccfc:	48 89 df             	mov    rdi,rbx
     153ccff:	e8 42 36 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>
     153cd04:	e9 45 ff ff ff       	jmp    153cc4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821d2>
     153cd09:	48 89 df             	mov    rdi,rbx
     153cd0c:	e8 15 32 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>
     153cd11:	e9 61 ff ff ff       	jmp    153cc77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3821fb>
     153cd16:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     153cd1b:	48 89 df             	mov    rdi,rbx
     153cd1e:	e8 8d 32 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>
     153cd23:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
     153cd26:	0f 95 c0             	setne  al
     153cd29:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     153cd30:	00 00 
     153cd32:	48 3b 4c 24 20       	cmp    rcx,QWORD PTR [rsp+0x20]
     153cd37:	75 0f                	jne    153cd48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3822cc>
     153cd39:	48 83 c4 28          	add    rsp,0x28
     153cd3d:	5b                   	pop    rbx
    ... truncated 329 additional instructions ...
```

### Arg-memory refs
| addr | arg-derived location | instruction |
|---|---|---|
| `0x153cc1e` | `arg:rdi+10` | `153cc1e:	48 8d 57 10          	lea    rdx,[rdi+0x10]` |
| `0x153cc2f` | `arg:rdi+90` | `153cc2f:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]` |
| `0x153cc36` | `arg:rdi+58` | `153cc36:	49 8d 46 58          	lea    rax,[r14+0x58]` |
| `0x153cc3f` | `arg:rdi+50` | `153cc3f:	4d 8d 6e 50          	lea    r13,[r14+0x50]` |
| `0x153cc43` | `arg:rdi+18` | `153cc43:	49 8d 6e 18          	lea    rbp,[r14+0x18]` |
| `0x153cc4e` | `arg:rsi+18` | `153cc4e:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]` |
| `0x153cc59` | `arg:rsi+10` | `153cc59:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x153cc5d` | `load(arg:rsi+10)` | `153cc5d:	0f b6 02             	movzx  eax,BYTE PTR [rdx]` |
| `0x153cc68` | `arg:rsi+38` | `153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153cc6e` | `arg:rsi+10` | `153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153cc74` | `arg:rsi+18` | `153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153ccdc` | `arg:rdi+8` | `153ccdc:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153ccf3` | `arg:rdi+8` | `153ccf3:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153cd23` | `arg:rsi` | `153cd23:	80 3b 00             	cmp    BYTE PTR [rbx],0x0` |
| `0x153cd58` | `arg:rsi+20` | `153cd58:	83 7f 20 00          	cmp    DWORD PTR [rdi+0x20],0x0` |
| `0x153cd66` | `arg:rsi+18` | `153cd66:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]` |
| `0x153cd7a` | `arg:rsi+20` | `153cd7a:	41 8b 46 20          	mov    eax,DWORD PTR [r14+0x20]` |
| `0x153cd87` | `arg:rsi+8` | `153cd87:	41 8b 6e 08          	mov    ebp,DWORD PTR [r14+0x8]` |
| `0x153cd91` | `arg:rsi+50` | `153cd91:	41 8b 76 50          	mov    esi,DWORD PTR [r14+0x50]` |
| `0x153cd9f` | `arg:rsi+60` | `153cd9f:	41 83 7e 60 00       	cmp    DWORD PTR [r14+0x60],0x0` |
| `0x153cdac` | `arg:rsi+58` | `153cdac:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]` |
| `0x153cdc0` | `arg:rsi+60` | `153cdc0:	41 8b 46 60          	mov    eax,DWORD PTR [r14+0x60]` |
| `0x153cdc9` | `arg:rsi+8` | `153cdc9:	41 8b 6e 08          	mov    ebp,DWORD PTR [r14+0x8]` |
| `0x153cdd3` | `arg:rsi+90` | `153cdd3:	41 8b b6 90 00 00 00 	mov    esi,DWORD PTR [r14+0x90]` |
| `0x153ce9a` | `load(arg:rsi+90)` | `153ce9a:	8a 03                	mov    al,BYTE PTR [rbx]` |
| `0x153cecb` | `load(arg:rsi+90)+50` | `153cecb:	41 89 46 50          	mov    DWORD PTR [r14+0x50],eax` |
| `0x153cedc` | `load(arg:rsi+90)+90` | `153cedc:	41 89 86 90 00 00 00 	mov    DWORD PTR [r14+0x90],eax` |
| `0x153cee6` | `load(arg:rsi+90)+8` | `153cee6:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153ceea` | `load(arg:rsi+90)+18` | `153ceea:	49 8d 7e 18          	lea    rdi,[r14+0x18]` |
| `0x153cef1` | `load(arg:rsi+90)+20` | `153cef1:	41 03 6e 20          	add    ebp,DWORD PTR [r14+0x20]` |
| `0x153cefc` | `load(arg:rsi+90)+20` | `153cefc:	41 39 6e 20          	cmp    DWORD PTR [r14+0x20],ebp` |
| `0x153cf02` | `load(arg:rsi+90)+28` | `153cf02:	45 8b 66 28          	mov    r12d,DWORD PTR [r14+0x28]` |
| `0x153cf34` | `load(arg:rsi+90)+18` | `153cf34:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]` |
| `0x153cf38` | `load(load(arg:rsi+90)+28)+1` | `153cf38:	41 8d 54 24 01       	lea    edx,[r12+0x1]` |
| `0x153cf3d` | `load(arg:rsi+90)+28` | `153cf3d:	41 89 56 28          	mov    DWORD PTR [r14+0x28],edx` |
| `0x153cf48` | `load(arg:rsi+90)+28` | `153cf48:	45 8b 66 28          	mov    r12d,DWORD PTR [r14+0x28]` |
| `0x153cf58` | `load(arg:rsi+90)+18` | `153cf58:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]` |
| `0x153cf6c` | `load(arg:rsi+90)+20` | `153cf6c:	45 3b 7e 20          	cmp    r15d,DWORD PTR [r14+0x20]` |
| `0x153cf72` | `load(arg:rsi+90)+20` | `153cf72:	41 89 6e 20          	mov    DWORD PTR [r14+0x20],ebp` |
| `0x153cf80` | `load(arg:rsi+90)+18` | `153cf80:	49 8b 4e 18          	mov    rcx,QWORD PTR [r14+0x18]` |
| `0x153cf84` | `load(arg:rsi+90)+20` | `153cf84:	41 8b 56 20          	mov    edx,DWORD PTR [r14+0x20]` |
| `0x153cfaa` | `load(arg:rsi+90)+58` | `153cfaa:	49 8d 7e 58          	lea    rdi,[r14+0x58]` |
| `0x153cfb1` | `load(arg:rsi+90)+60` | `153cfb1:	41 03 6e 60          	add    ebp,DWORD PTR [r14+0x60]` |
| `0x153cfbc` | `load(arg:rsi+90)+60` | `153cfbc:	41 39 6e 60          	cmp    DWORD PTR [r14+0x60],ebp` |
| `0x153cfc2` | `load(arg:rsi+90)+68` | `153cfc2:	45 8b 66 68          	mov    r12d,DWORD PTR [r14+0x68]` |
| `0x153cff9` | `load(arg:rsi+90)+58` | `153cff9:	49 8b 4e 58          	mov    rcx,QWORD PTR [r14+0x58]` |
| `0x153cffd` | `load(load(arg:rsi+90)+68)+1` | `153cffd:	41 8d 54 24 01       	lea    edx,[r12+0x1]` |
| `0x153d002` | `load(arg:rsi+90)+68` | `153d002:	41 89 56 68          	mov    DWORD PTR [r14+0x68],edx` |
| `0x153d00d` | `load(arg:rsi+90)+68` | `153d00d:	45 8b 66 68          	mov    r12d,DWORD PTR [r14+0x68]` |
| `0x153d01d` | `load(arg:rsi+90)+58` | `153d01d:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]` |
| `0x153d031` | `load(arg:rsi+90)+60` | `153d031:	45 3b 7e 60          	cmp    r15d,DWORD PTR [r14+0x60]` |
| `0x153d037` | `load(arg:rsi+90)+60` | `153d037:	41 89 6e 60          	mov    DWORD PTR [r14+0x60],ebp` |
| `0x153d045` | `load(arg:rsi+90)+58` | `153d045:	49 8b 4e 58          	mov    rcx,QWORD PTR [r14+0x58]` |
| `0x153d049` | `load(arg:rsi+90)+60` | `153d049:	41 8b 56 60          	mov    edx,DWORD PTR [r14+0x60]` |

### Arg-derived writes / indirect calls
| addr | arg-derived location | instruction |
|---|---|---|
| `0x153cc68` | `arg:rsi+38` | `153cc68:	89 43 38             	mov    DWORD PTR [rbx+0x38],eax` |
| `0x153cc6e` | `arg:rsi+10` | `153cc6e:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx` |
| `0x153cc74` | `arg:rsi+18` | `153cc74:	89 4b 18             	mov    DWORD PTR [rbx+0x18],ecx` |
| `0x153ccdc` | `arg:rdi+8` | `153ccdc:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153ccf3` | `arg:rdi+8` | `153ccf3:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153cecb` | `load(arg:rsi+90)+50` | `153cecb:	41 89 46 50          	mov    DWORD PTR [r14+0x50],eax` |
| `0x153cedc` | `load(arg:rsi+90)+90` | `153cedc:	41 89 86 90 00 00 00 	mov    DWORD PTR [r14+0x90],eax` |
| `0x153cee6` | `load(arg:rsi+90)+8` | `153cee6:	41 09 46 08          	or     DWORD PTR [r14+0x8],eax` |
| `0x153cf3d` | `load(arg:rsi+90)+28` | `153cf3d:	41 89 56 28          	mov    DWORD PTR [r14+0x28],edx` |
| `0x153cf72` | `load(arg:rsi+90)+20` | `153cf72:	41 89 6e 20          	mov    DWORD PTR [r14+0x20],ebp` |
| `0x153d002` | `load(arg:rsi+90)+68` | `153d002:	41 89 56 68          	mov    DWORD PTR [r14+0x68],edx` |
| `0x153d037` | `load(arg:rsi+90)+60` | `153d037:	41 89 6e 60          	mov    DWORD PTR [r14+0x60],ebp` |

### Calls inside method
| call | tracked args | instruction |
|---|---|---|
| `0x153cc2a` | `rdi=arg:rsi, rdx=arg:rdi+10, rcx=arg:rcx, r8=arg:r8, r9=arg:r9` | `153cc2a:	e8 3b 32 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |
| `0x153cc8b` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cc8b:	e8 da 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>` |
| `0x153cc97` | `rdi=arg:rdi+18, r8=arg:r8, r9=arg:r9` | `153cc97:	e8 02 ae fc ff       	call   1507a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d022>` |
| `0x153cca2` | `rsi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cca2:	e8 fd 05 00 00       	call   153d2a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382828>` |
| `0x153ccac` | `rdi=arg:rsi, rsi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153ccac:	e8 b9 07 00 00       	call   153d46a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3829ee>` |
| `0x153ccba` | `rsi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153ccba:	e8 61 ae fc ff       	call   1507b20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34d0a4>` |
| `0x153ccc5` | `rsi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153ccc5:	e8 06 04 00 00       	call   153d0d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382654>` |
| `0x153ccd2` | `rdi=arg:rsi, rsi=arg:rdi+90, r8=arg:r8, r9=arg:r9` | `153ccd2:	e8 5b 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153cceb` | `rdi=arg:rsi, rsi=arg:rdi+50, r8=arg:r8, r9=arg:r9` | `153cceb:	e8 42 33 12 00       	call   1660032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419e>` |
| `0x153ccff` | `rdi=arg:rsi, rsi=arg:rdi+50, r8=arg:r8, r9=arg:r9` | `153ccff:	e8 42 36 12 00       	call   1660346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x144b2>` |
| `0x153cd0c` | `rdi=arg:rsi, rsi=arg:rdi+50, r8=arg:r8, r9=arg:r9` | `153cd0c:	e8 15 32 12 00       	call   165ff26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14092>` |
| `0x153cd1e` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cd1e:	e8 8d 32 12 00       	call   165ffb0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1411c>` |
| `0x153cd48` | `rdi=arg:rsi, r8=arg:r8, r9=arg:r9` | `153cd48:	e8 63 2d 2b 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x153cd70` | `r8=arg:r8, r9=arg:r9` | `153cd70:	e8 bf 81 b5 ff       	call   1094f34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c34a>` |
| `0x153cd98` | `rsi=load(arg:rsi+50), r8=arg:r8, r9=arg:r9` | `153cd98:	e8 57 85 b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>` |
| `0x153cdb6` | `r8=arg:r8, r9=arg:r9` | `153cdb6:	e8 79 81 b5 ff       	call   1094f34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c34a>` |
| `0x153cddd` | `rsi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153cddd:	e8 12 85 b5 ff       	call   10952f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25c70a>` |
| `0x153ce18` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce18:	e8 87 29 12 00       	call   165f7a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13910>` |
| `0x153ce3a` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce3a:	e8 15 25 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>` |
| `0x153ce59` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce59:	e8 46 29 12 00       	call   165f7a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13910>` |
| `0x153ce7e` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce7e:	e8 d1 24 12 00       	call   165f354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x134c0>` |
| `0x153ce95` | `rdi=load(arg:rsi+90), r8=arg:r8, r9=arg:r9` | `153ce95:	e8 86 29 12 00       	call   165f820 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1398c>` |
| `0x153cef7` | `rdi=load(arg:rsi+90)+18, r8=arg:r8, r9=arg:r9` | `153cef7:	e8 9c 8e 7d ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x153cf19` | `r8=arg:r8, r9=arg:r9` | `153cf19:	e8 e2 0f 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153cf66` | `rdx=load(load(arg:rsi+90)+28), r8=arg:r8, r9=arg:r9` | `153cf66:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x153cf9c` | `rcx=load(load(arg:rsi+90)+18), r8=arg:r8, r9=arg:r9` | `153cf9c:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0x153cfb7` | `rdi=load(arg:rsi+90)+58, rcx=load(load(arg:rsi+90)+18), r8=arg:r8, r9=arg:r9` | `153cfb7:	e8 dc 8d 7d ff       	call   d15d98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x262d38>` |
| `0x153cfd9` | `rcx=load(load(arg:rsi+90)+18), r8=arg:r8, r9=arg:r9` | `153cfd9:	e8 22 0f 2b 00       	call   17edf00 <_Znwm@plt>` |
| `0x153d02b` | `rdx=load(load(arg:rsi+90)+68), r8=arg:r8, r9=arg:r9` | `153d02b:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0x153d061` | `rcx=load(load(arg:rsi+90)+58), r8=arg:r8, r9=arg:r9` | `153d061:	ff 50 50             	call   QWORD PTR [rax+0x50]` |
| `0x153d0a2` | `rcx=load(load(arg:rsi+90)+58), r8=arg:r8, r9=arg:r9` | `153d0a2:	e8 e9 0d 2b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x153d0ab` | `rcx=load(load(arg:rsi+90)+58), r8=arg:r8, r9=arg:r9` | `153d0ab:	e8 e0 0d 2b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0x153d0c2` | `rcx=load(load(arg:rsi+90)+58), r8=arg:r8, r9=arg:r9` | `153d0c2:	e8 c9 ff ff ff       	call   153d090 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382614>` |
| `0x153d0f9` | `rcx=load(load(arg:rsi+90)+58), r8=arg:r8, r9=arg:r9` | `153d0f9:	e8 6c 2d 12 00       	call   165fe6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13fd6>` |

## Interpretation
- `+0x30` is the dispatch used at `1661095` after building a local descriptor whose `+0x8` points to the post-`17add2a` object.
- If the resolved `+0x30` method writes through `arg:rdi+0x30`, that closes the source of the Restrictions factory `rdx+0x30` read.
- If it only delegates to another virtual/helper call, the next trace should follow that method-specific call rather than the generic string helpers.
