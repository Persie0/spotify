# Restrictions `af2eb8` receiver-copy helper v18

Focus: inspect `af2eb8`, called as `af2eb8(&rsp+0x390, [r13+0x480])`, to classify receiver-pair initialization. Static provenance only.

## Callsite

```text
  e92f25:	c3                   	ret
  e92f26:	e9 47 8f 01 00       	jmp    eabe72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73288>
  e92f2b:	cc                   	int3
  e92f2c:	55                   	push   rbp
  e92f2d:	41 57                	push   r15
  e92f2f:	41 56                	push   r14
  e92f31:	41 55                	push   r13
  e92f33:	41 54                	push   r12
  e92f35:	53                   	push   rbx
  e92f36:	48 81 ec b8 10 00 00 	sub    rsp,0x10b8
  e92f3d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
  e92f44:	00
  e92f45:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
  e92f4c:	00
  e92f4d:	49 89 f5             	mov    r13,rsi
  e92f50:	49 89 ff             	mov    r15,rdi
  e92f53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e92f5a:	00 00
  e92f5c:	48 89 84 24 b0 10 00 	mov    QWORD PTR [rsp+0x10b0],rax
  e92f63:	00
  e92f64:	48 8b b6 80 04 00 00 	mov    rsi,QWORD PTR [rsi+0x480]
  e92f6b:	48 8d bc 24 90 03 00 	lea    rdi,[rsp+0x390]
  e92f72:	00
  e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  e92f78:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92f7f:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92f82:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92f86:	48 8d 15 28 8b 4d ff 	lea    rdx,[rip+0xffffffffff4d8b28]        # 36bab5 <_ZTSSt12bad_any_cast@@Base-0x24713>
  e92f8d:	e8 27 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92f92:	b3 01                	mov    bl,0x1
  e92f94:	40 b5 01             	mov    bpl,0x1
  e92f97:	84 c0                	test   al,al
  e92f99:	75 1c                	jne    e92fb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a3cd>
  e92f9b:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fa2:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fa5:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fa9:	48 8d 15 b8 03 4a ff 	lea    rdx,[rip+0xffffffffff4a03b8]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fb0:	e8 04 64 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fb5:	89 c5                	mov    ebp,eax
  e92fb7:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fbe:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fc1:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fc5:	48 8d 15 1a 6d 4a ff 	lea    rdx,[rip+0xffffffffff4a6d1a]        # 339ce6 <_ZTSSt12bad_any_cast@@Base-0x564e2>
  e92fcc:	e8 e8 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fd1:	84 c0                	test   al,al
  e92fd3:	75 1c                	jne    e92ff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a407>
  e92fd5:	49 8b 85 78 03 00 00 	mov    rax,QWORD PTR [r13+0x378]
  e92fdc:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e92fdf:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e92fe3:	48 8d 15 7e 03 4a ff 	lea    rdx,[rip+0xffffffffff4a037e]        # 333368 <_ZTSSt12bad_any_cast@@Base-0x5ce60>
  e92fea:	e8 ca 63 00 00       	call   e993b9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x607cf>
  e92fef:	89 c3                	mov    ebx,eax
  e92ff1:	31 c0                	xor    eax,eax
  e92ff3:	88 84 24 e8 03 00 00 	mov    BYTE PTR [rsp+0x3e8],al
  e92ffa:	88 84 24 10 04 00 00 	mov    BYTE PTR [rsp+0x410],al
```
## `af2eb8` target window

```text
  af2dfc:	72 ce                	jb     af2dcc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fd6c>
  af2dfe:	eb 03                	jmp    af2e03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fda3>
  af2e00:	44 89 f0             	mov    eax,r14d
  af2e03:	48 83 c4 08          	add    rsp,0x8
  af2e07:	5b                   	pop    rbx
  af2e08:	41 5c                	pop    r12
  af2e0a:	41 5d                	pop    r13
  af2e0c:	41 5e                	pop    r14
  af2e0e:	41 5f                	pop    r15
  af2e10:	5d                   	pop    rbp
  af2e11:	c3                   	ret
  af2e12:	48 8b b7 80 13 00 00 	mov    rsi,QWORD PTR [rdi+0x1380]
  af2e19:	48 8d 46 01          	lea    rax,[rsi+0x1]
  af2e1d:	41 b8 70 02 00 00    	mov    r8d,0x270
  af2e23:	31 d2                	xor    edx,edx
  af2e25:	49 f7 f0             	div    r8
  af2e28:	48 89 d1             	mov    rcx,rdx
  af2e2b:	48 c7 c0 00 00 00 80 	mov    rax,0xffffffff80000000
  af2e32:	48 23 04 f7          	and    rax,QWORD PTR [rdi+rsi*8]
  af2e36:	89 ca                	mov    edx,ecx
  af2e38:	4c 8b 0c d7          	mov    r9,QWORD PTR [rdi+rdx*8]
  af2e3c:	45 89 ca             	mov    r10d,r9d
  af2e3f:	41 81 e2 fe ff ff 7f 	and    r10d,0x7ffffffe
  af2e46:	49 09 c2             	or     r10,rax
  af2e49:	48 8d 86 8d 01 00 00 	lea    rax,[rsi+0x18d]
  af2e50:	31 d2                	xor    edx,edx
  af2e52:	49 f7 f0             	div    r8
  af2e55:	89 d0                	mov    eax,edx
  af2e57:	49 d1 ea             	shr    r10,1
  af2e5a:	4c 33 14 c7          	xor    r10,QWORD PTR [rdi+rax*8]
  af2e5e:	41 83 e1 01          	and    r9d,0x1
  af2e62:	41 f7 d9             	neg    r9d
  af2e65:	41 81 e1 df b0 08 99 	and    r9d,0x9908b0df
  af2e6c:	4d 31 d1             	xor    r9,r10
  af2e6f:	4c 89 0c f7          	mov    QWORD PTR [rdi+rsi*8],r9
  af2e73:	48 8b 87 80 13 00 00 	mov    rax,QWORD PTR [rdi+0x1380]
  af2e7a:	48 8b 04 c7          	mov    rax,QWORD PTR [rdi+rax*8]
  af2e7e:	48 89 c2             	mov    rdx,rax
  af2e81:	48 c1 ea 0b          	shr    rdx,0xb
  af2e85:	89 d2                	mov    edx,edx
  af2e87:	48 31 c2             	xor    rdx,rax
  af2e8a:	48 89 8f 80 13 00 00 	mov    QWORD PTR [rdi+0x1380],rcx
  af2e91:	89 d0                	mov    eax,edx
  af2e93:	c1 e0 07             	shl    eax,0x7
  af2e96:	25 80 56 2c 9d       	and    eax,0x9d2c5680
  af2e9b:	48 31 d0             	xor    rax,rdx
  af2e9e:	89 c1                	mov    ecx,eax
  af2ea0:	c1 e1 0f             	shl    ecx,0xf
  af2ea3:	81 e1 00 00 c6 ef    	and    ecx,0xefc60000
  af2ea9:	48 31 c1             	xor    rcx,rax
  af2eac:	48 89 c8             	mov    rax,rcx
  af2eaf:	48 c1 e8 12          	shr    rax,0x12
  af2eb3:	48 31 c8             	xor    rax,rcx
  af2eb6:	c3                   	ret
  af2eb7:	cc                   	int3
  af2eb8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  af2ebb:	48 89 07             	mov    QWORD PTR [rdi],rax
  af2ebe:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  af2ec2:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  af2ec6:	48 85 c0             	test   rax,rax
  af2ec9:	74 05                	je     af2ed0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe70>
  af2ecb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  af2ed0:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
  af2ed4:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
  af2ed8:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
  af2edc:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
  af2ee0:	48 85 c0             	test   rax,rax
  af2ee3:	74 05                	je     af2eea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe8a>
  af2ee5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  af2eea:	c3                   	ret
  af2eeb:	cc                   	int3
  af2eec:	48 8d 05 6d fd d0 00 	lea    rax,[rip+0xd0fd6d]        # 1802c60 <_ZTIN4asio22service_already_existsE@@Base+0x4448>
  af2ef3:	48 89 07             	mov    QWORD PTR [rdi],rax
  af2ef6:	e9 15 b1 cf 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  af2efb:	cc                   	int3
  af2efc:	53                   	push   rbx
  af2efd:	48 89 fb             	mov    rbx,rdi
  af2f00:	e8 e7 ff ff ff       	call   af2eec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe8c>
  af2f05:	48 89 df             	mov    rdi,rbx
  af2f08:	5b                   	pop    rbx
  af2f09:	e9 12 b0 cf 00       	jmp    17edf20 <_ZdlPv@plt>
  af2f0e:	48 83 c7 18          	add    rdi,0x18
  af2f12:	e9 39 b1 cf 00       	jmp    17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  af2f17:	cc                   	int3
  af2f18:	41 57                	push   r15
  af2f1a:	41 56                	push   r14
  af2f1c:	53                   	push   rbx
  af2f1d:	48 83 ec 20          	sub    rsp,0x20
  af2f21:	48 89 fb             	mov    rbx,rdi
  af2f24:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  af2f2b:	00 00
  af2f2d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  af2f32:	48 8d 05 ff fc d0 00 	lea    rax,[rip+0xd0fcff]        # 1802c38 <_ZTIN4asio22service_already_existsE@@Base+0x4420>
  af2f39:	48 89 07             	mov    QWORD PTR [rdi],rax
  af2f3c:	0f 57 c0             	xorps  xmm0,xmm0
  af2f3f:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  af2f43:	4c 8d b7 84 00 00 00 	lea    r14,[rdi+0x84]
  af2f4a:	4c 89 f7             	mov    rdi,r14
  af2f4d:	e8 9e b1 cf 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
  af2f52:	48 8d b3 b0 00 00 00 	lea    rsi,[rbx+0xb0]
  af2f59:	49 89 e7             	mov    r15,rsp
  af2f5c:	4c 89 ff             	mov    rdi,r15
  af2f5f:	e8 b8 68 fc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  af2f64:	4c 89 f7             	mov    rdi,r14
  af2f67:	e8 94 b1 cf 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
  af2f6c:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  af2f6f:	48 85 ff             	test   rdi,rdi
  af2f72:	74 06                	je     af2f7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3ff1a>
  af2f74:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  af2f77:	ff 50 18             	call   QWORD PTR [rax+0x18]
  af2f7a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  af2f7f:	e8 02 b5 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  af2f84:	48 8b bb b8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb8]
  af2f8b:	e8 f6 b4 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  af2f90:	4c 89 f7             	mov    rdi,r14
  af2f93:	e8 b8 b0 cf 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  af2f98:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
  af2f9c:	e8 e5 b4 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  af2fa1:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  af2fa5:	e8 c0 6f f8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  af2faa:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  af2fae:	e8 d3 b4 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  af2fb3:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  af2fb7:	e8 ca b4 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  af2fbc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  af2fc3:	00 00
  af2fc5:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  af2fca:	75 0a                	jne    af2fd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3ff76>
  af2fcc:	48 83 c4 20          	add    rsp,0x20
  af2fd0:	5b                   	pop    rbx
  af2fd1:	41 5e                	pop    r14
  af2fd3:	41 5f                	pop    r15
  af2fd5:	c3                   	ret
  af2fd6:	e8 d5 ca cf 00       	call   17efab0 <__stack_chk_fail@plt>
  af2fdb:	48 89 c7             	mov    rdi,rax
  af2fde:	e8 c2 6a f8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  af2fe3:	cc                   	int3
  af2fe4:	53                   	push   rbx
  af2fe5:	48 89 fb             	mov    rbx,rdi
  af2fe8:	e8 2b ff ff ff       	call   af2f18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3feb8>
  af2fed:	48 89 df             	mov    rdi,rbx
  af2ff0:	5b                   	pop    rbx
  af2ff1:	e9 2a af cf 00       	jmp    17edf20 <_ZdlPv@plt>
  af2ff6:	41 57                	push   r15
  af2ff8:	41 56                	push   r14
  af2ffa:	41 54                	push   r12
  af2ffc:	53                   	push   rbx
  af2ffd:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
  af3004:	48 89 f3             	mov    rbx,rsi
  af3007:	49 89 fe             	mov    r14,rdi
  af300a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  af3011:	00 00
  af3013:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  af301a:	00
  af301b:	8b 0e                	mov    ecx,DWORD PTR [rsi]
  af301d:	8b 46 04             	mov    eax,DWORD PTR [rsi+0x4]
  af3020:	83 f9 03             	cmp    ecx,0x3
  af3023:	75 05                	jne    af302a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3ffca>
  af3025:	83 f8 02             	cmp    eax,0x2
  af3028:	74 12                	je     af303c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3ffdc>
  af302a:	83 f9 02             	cmp    ecx,0x2
  af302d:	0f 85 48 02 00 00    	jne    af327b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4021b>
  af3033:	83 f8 03             	cmp    eax,0x3
  af3036:	0f 85 3f 02 00 00    	jne    af327b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4021b>
  af303c:	41 8b 76 30          	mov    esi,DWORD PTR [r14+0x30]
  af3040:	85 f6                	test   esi,esi
  af3042:	0f 8e ef 01 00 00    	jle    af3237 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x401d7>
  af3048:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  af304f:	00
  af3050:	e8 3b b7 cf 00       	call   17ee790 <_ZNSt6__ndk19to_stringEi@plt>
  af3055:	48 8d 35 40 ed 86 ff 	lea    rsi,[rip+0xffffffffff86ed40]        # 361d9c <_ZTSSt12bad_any_cast@@Base-0x2e42c>
  af305c:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  af3061:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
  af3068:	00
  af3069:	e8 2b 2d fc ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>
  af306e:	48 8d 15 12 ca 87 ff 	lea    rdx,[rip+0xffffffffff87ca12]        # 36fa87 <_ZTSSt12bad_any_cast@@Base-0x20741>
  af3075:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  af307c:	00
  af307d:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  af3082:	e8 b6 83 fa ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>
  af3087:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  af308e:	00
  af308f:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  af3093:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  af3098:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
  af309b:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
  af30a0:	0f 57 c0             	xorps  xmm0,xmm0
  af30a3:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  af30a6:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  af30ab:	c6 44 24 78 01       	mov    BYTE PTR [rsp+0x78],0x1
  af30b0:	e8 db ad cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  af30b5:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  af30ba:	e8 d1 ad cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  af30bf:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  af30c6:	00
  af30c7:	e8 c4 ad cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  af30cc:	41 8b 46 34          	mov    eax,DWORD PTR [r14+0x34]
  af30d0:	85 c0                	test   eax,eax
  af30d2:	0f 8e 99 01 00 00    	jle    af3271 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40211>
  af30d8:	83 f8 63             	cmp    eax,0x63
  af30db:	77 13                	ja     af30f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40090>
  af30dd:	49 8b 7e 60          	mov    rdi,QWORD PTR [r14+0x60]
  af30e1:	e8 7c 73 f8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
  af30e6:	41 3b 46 34          	cmp    eax,DWORD PTR [r14+0x34]
  af30ea:	0f 8d 81 01 00 00    	jge    af3271 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40211>
  af30f0:	48 8d 74 24 1f       	lea    rsi,[rsp+0x1f]
  af30f5:	c6 06 00             	mov    BYTE PTR [rsi],0x0
  af30f8:	49 8d be 80 00 00 00 	lea    rdi,[r14+0x80]
  af30ff:	6a 01                	push   0x1
  af3101:	5a                   	pop    rdx
  af3102:	6a 05                	push   0x5
  af3104:	59                   	pop    rcx
  af3105:	e8 ba 01 00 00       	call   af32c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40264>
  af310a:	84 c0                	test   al,al
  af310c:	0f 84 44 01 00 00    	je     af3256 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x401f6>
  af3112:	4d 8b 66 28          	mov    r12,QWORD PTR [r14+0x28]
  af3116:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
  af311b:	4d 89 77 f8          	mov    QWORD PTR [r15-0x8],r14
  af311f:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
  af3124:	4c 89 ff             	mov    rdi,r15
  af3127:	e8 14 ae cf 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  af312c:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
  af312f:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
  af3133:	0f 11 4c 24 50       	movups XMMWORD PTR [rsp+0x50],xmm1
  af3138:	0f 11 44 24 40       	movups XMMWORD PTR [rsp+0x40],xmm0
  af313d:	48 8d 05 d4 ea 95 ff 	lea    rax,[rip+0xffffffffff95ead4]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  af3144:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  af3148:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  af314d:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
  af3153:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
  af3158:	4c 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r14
  af315f:	00
  af3160:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
  af3164:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
  af316b:	00
```
## Relevant refs/calls in `af2eb8` window

| addr | instruction |
|---:|---|
| `0xaf2eb8` | `af2eb8:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xaf2ebb` | `af2ebb:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xaf2ebe` | `af2ebe:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]` |
| `0xaf2ec2` | `af2ec2:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax` |
| `0xaf2ecb` | `af2ecb:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]` |
| `0xaf2ed0` | `af2ed0:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]` |
| `0xaf2ed4` | `af2ed4:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0xaf2ee5` | `af2ee5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]` |
| `0xaf2ef3` | `af2ef3:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xaf2f00` | `af2f00:	e8 e7 ff ff ff       	call   af2eec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe8c>` |
| `0xaf2f39` | `af2f39:	48 89 07             	mov    QWORD PTR [rdi],rax` |
| `0xaf2f4d` | `af2f4d:	e8 9e b1 cf 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xaf2f5f` | `af2f5f:	e8 b8 68 fc ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xaf2f67` | `af2f67:	e8 94 b1 cf 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>` |
| `0xaf2f74` | `af2f74:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xaf2f77` | `af2f77:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0xaf2f7f` | `af2f7f:	e8 02 b5 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaf2f8b` | `af2f8b:	e8 f6 b4 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaf2f93` | `af2f93:	e8 b8 b0 cf 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>` |
| `0xaf2f9c` | `af2f9c:	e8 e5 b4 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaf2fa5` | `af2fa5:	e8 c0 6f f8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>` |
| `0xaf2fae` | `af2fae:	e8 d3 b4 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaf2fb3` | `af2fb3:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0xaf2fb7` | `af2fb7:	e8 ca b4 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaf2fd6` | `af2fd6:	e8 d5 ca cf 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xaf2fde` | `af2fde:	e8 c2 6a f8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0xaf2fe8` | `af2fe8:	e8 2b ff ff ff       	call   af2f18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3feb8>` |
| `0xaf301b` | `af301b:	8b 0e                	mov    ecx,DWORD PTR [rsi]` |
| `0xaf3050` | `af3050:	e8 3b b7 cf 00       	call   17ee790 <_ZNSt6__ndk19to_stringEi@plt>` |
| `0xaf3069` | `af3069:	e8 2b 2d fc ff       	call   ab5d99 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2d39>` |
| `0xaf3082` | `af3082:	e8 b6 83 fa ff       	call   a9b43d <JNI_OnUnload@@Base+0x22d0a>` |
| `0xaf308f` | `af308f:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0xaf3098` | `af3098:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]` |
| `0xaf30a3` | `af30a3:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0xaf30a6` | `af30a6:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0` |
| `0xaf30b0` | `af30b0:	e8 db ad cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xaf30ba` | `af30ba:	e8 d1 ad cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xaf30c7` | `af30c7:	e8 c4 ad cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xaf30e1` | `af30e1:	e8 7c 73 f8 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>` |
| `0xaf30f5` | `af30f5:	c6 06 00             	mov    BYTE PTR [rsi],0x0` |
| `0xaf3105` | `af3105:	e8 ba 01 00 00       	call   af32c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40264>` |
| `0xaf3127` | `af3127:	e8 14 ae cf 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xaf312f` | `af312f:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]` |
| `0xaf314d` | `af314d:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0` |
| `0xaf3160` | `af3160:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]` |
| `0xaf3178` | `af3178:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0` |
| `0xaf3187` | `af3187:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]` |
| `0xaf31b0` | `af31b0:	e8 4b ad cf 00       	call   17edf00 <_Znwm@plt>` |
| `0xaf31c0` | `af31c0:	48 8b 51 10          	mov    rdx,QWORD PTR [rcx+0x10]` |
| `0xaf31cb` | `af31cb:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0` |
| `0xaf31dd` | `af31dd:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]` |
| `0xaf31fb` | `af31fb:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |

## All text references/calls to `af2eb8`

| addr | instruction |
|---:|---|
| `0xaf2b72` | `af2b72:	e8 41 03 00 00       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xaf2b97` | `af2b97:	e9 1c 03 00 00       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xaf2eb8` | `af2eb8:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xc90146` | `c90146:	e8 6d 2d e6 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xc9016b` | `c9016b:	e9 48 2d e6 ff       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xe85aae` | `e85aae:	48 8d 35 03 d4 c6 ff 	lea    rsi,[rip+0xffffffffffc6d403]        # af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xe92f73` | `e92f73:	e8 40 ff c5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xee7298` | `ee7298:	e8 1b bc c0 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xee72bd` | `ee72bd:	e9 f6 bb c0 ff       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xeff0d4` | `eff0d4:	e8 df 3d bf ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xeff0f9` | `eff0f9:	e9 ba 3d bf ff       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf2865a` | `f2865a:	e8 59 a8 bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf28982` | `f28982:	e8 31 a5 bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf28ee2` | `f28ee2:	e8 d1 9f bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf2cd42` | `f2cd42:	e8 71 61 bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf2d06a` | `f2d06a:	e8 49 5e bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf2d5a8` | `f2d5a8:	e8 0b 59 bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf30c68` | `f30c68:	e8 4b 22 bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf31018` | `f31018:	e8 9b 1e bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf31558` | `f31558:	e8 5b 19 bc ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf332ac` | `f332ac:	e8 07 fc bb ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf3366d` | `f3366d:	e8 46 f8 bb ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf33c38` | `f33c38:	e8 7b f2 bb ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf39bc0` | `f39bc0:	e8 f3 92 bb ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf39ee8` | `f39ee8:	e8 cb 8f bb ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf3a426` | `f3a426:	e8 8d 8a bb ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf440ae` | `f440ae:	e8 05 ee ba ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf443d6` | `f443d6:	e8 dd ea ba ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf44ac0` | `f44ac0:	e8 f3 e3 ba ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf4df32` | `f4df32:	e8 81 4f ba ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf4e25a` | `f4e25a:	e8 59 4c ba ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf4eba2` | `f4eba2:	e8 11 43 ba ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf6cd12` | `f6cd12:	e8 a1 61 b8 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf6d0a0` | `f6d0a0:	e8 13 5e b8 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf6d5e0` | `f6d5e0:	e8 d3 58 b8 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf74be0` | `f74be0:	e8 d3 e2 b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf74f08` | `f74f08:	e8 ab df b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf75446` | `f75446:	e8 6d da b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf77cec` | `f77cec:	e8 c7 b1 b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf77d11` | `f77d11:	e9 a2 b1 b7 ff       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf7d4e4` | `f7d4e4:	e8 cf 59 b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf7d80c` | `f7d80c:	e8 a7 56 b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf7df86` | `f7df86:	e8 2d 4f b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf7fc90` | `f7fc90:	e8 23 32 b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf7ffb8` | `f7ffb8:	e8 fb 2e b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf80684` | `f80684:	e8 2f 28 b7 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf845b4` | `f845b4:	e8 ff e8 b6 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf848dc` | `f848dc:	e8 d7 e5 b6 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf84e1a` | `f84e1a:	e8 99 e0 b6 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf8dba8` | `f8dba8:	e8 0b 53 b6 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf8ded0` | `f8ded0:	e8 e3 4f b6 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf8e40e` | `f8e40e:	e8 a5 4a b6 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf9e5ba` | `f9e5ba:	e8 f9 48 b5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf9e8e2` | `f9e8e2:	e8 d1 45 b5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xf9ee20` | `f9ee20:	e8 93 40 b5 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfa6d0c` | `fa6d0c:	e8 a7 c1 b4 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfa7034` | `fa7034:	e8 7f be b4 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfa7572` | `fa7572:	e8 41 b9 b4 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfaecb8` | `faecb8:	e8 fb 41 b4 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfaefe0` | `faefe0:	e8 d3 3e b4 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfaf51e` | `faf51e:	e8 95 39 b4 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfb43c2` | `fb43c2:	e8 f1 ea b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfb4750` | `fb4750:	e8 63 e7 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfb4d30` | `fb4d30:	e8 83 e1 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfb6766` | `fb6766:	e8 4d c7 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfb6b0e` | `fb6b0e:	e8 a5 c3 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfb7102` | `fb7102:	e8 b1 bd b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfb98b6` | `fb98b6:	e8 fd 95 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfb9bde` | `fb9bde:	e8 d5 92 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfba2ca` | `fba2ca:	e8 e9 8b b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfbbbd2` | `fbbbd2:	e8 e1 72 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfbbf7e` | `fbbf7e:	e8 35 6f b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfbc590` | `fbc590:	e8 23 69 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfbe58e` | `fbe58e:	e8 25 49 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfbe8b6` | `fbe8b6:	e8 fd 45 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfbf122` | `fbf122:	e8 91 3d b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfc2920` | `fc2920:	e8 93 05 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfc2c48` | `fc2c48:	e8 6b 02 b3 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfc3186` | `fc3186:	e8 2d fd b2 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfc7440` | `fc7440:	e8 73 ba b2 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfc7768` | `fc7768:	e8 4b b7 b2 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfc8234` | `fc8234:	e8 7f ac b2 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd2984` | `fd2984:	e8 2f 05 b2 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd2d2c` | `fd2d2c:	e8 87 01 b2 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd3320` | `fd3320:	e8 93 fb b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd5208` | `fd5208:	e8 ab dc b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd5530` | `fd5530:	e8 83 d9 b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd5a82` | `fd5a82:	e8 31 d4 b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd96b4` | `fd96b4:	e8 ff 97 b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd99dc` | `fd99dc:	e8 d7 94 b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfd9f1a` | `fd9f1a:	e8 99 8f b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfdc272` | `fdc272:	e8 41 6c b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfdc630` | `fdc630:	e8 83 68 b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfdcc30` | `fdcc30:	e8 83 62 b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfe54e8` | `fe54e8:	e8 cb d9 b0 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfe5810` | `fe5810:	e8 a3 d6 b0 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0xfe5ecc` | `fe5ecc:	e8 e7 cf b0 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x1058f6a` | `1058f6a:	e8 49 9f a9 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x144f1fc` | `144f1fc:	e8 b7 3c 6a ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x144f221` | `144f221:	e9 92 3c 6a ff       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x14b115e` | `14b115e:	e8 55 1d 64 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x14b1183` | `14b1183:	e9 30 1d 64 ff       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x14b1ab0` | `14b1ab0:	e8 03 14 64 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x14b1ad5` | `14b1ad5:	e9 de 13 64 ff       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x14d5036` | `14d5036:	e8 7d de 61 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |
| `0x14d505b` | `14d505b:	e9 58 de 61 ff       	jmp    af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>` |

## Interpretation

A shared-pointer-like copy helper should read source pointer/control fields from `rsi`, write destination pointer/control fields at `rdi`, and increment a refcount when the control block is non-null. If confirmed, the receiver pair at `[rsp+0x390]/[rsp+0x398]` comes directly from `[r13+0x480]`.
