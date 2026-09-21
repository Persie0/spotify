# TimelineConductor service object construction

Proven factory chain:
- descriptor ID 0xb8 = TimelineConductorSetupImpl, AP 0x1867c58
- factory +0x28 = 0x135c878
- factory allocates 0xf0 bytes at 0x135cc69
- new object pointer -> r14
- rdi=r14 at 0x135ce78
- call 0x135d056 at 0x135ce8b
- factory output receives r14 at 0x135cebf

## Constructor FDE (20303958, 20319259)

## Constructor prologue / first 0x280 bytes
     135d056:	55                   	push   rbp
     135d057:	41 57                	push   r15
     135d059:	41 56                	push   r14
     135d05b:	41 55                	push   r13
     135d05d:	41 54                	push   r12
     135d05f:	53                   	push   rbx
     135d060:	48 81 ec 28 10 00 00 	sub    rsp,0x1028
     135d067:	4c 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],r9
     135d06c:	4c 89 c3             	mov    rbx,r8
     135d06f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d076:	00 00 
     135d078:	48 89 84 24 20 10 00 	mov    QWORD PTR [rsp+0x1020],rax
     135d07f:	00 
     135d080:	31 c0                	xor    eax,eax
     135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi
     135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
     135d108:	00 
     135d109:	4c 8d 6f 10          	lea    r13,[rdi+0x10]
     135d10d:	48 8d 47 20          	lea    rax,[rdi+0x20]
     135d111:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     135d118:	00 
     135d119:	48 8d 87 80 00 00 00 	lea    rax,[rdi+0x80]
     135d120:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     135d127:	00 
     135d128:	48 8d 87 88 00 00 00 	lea    rax,[rdi+0x88]
     135d12f:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     135d136:	00 
     135d137:	48 8d 87 a0 00 00 00 	lea    rax,[rdi+0xa0]
     135d13e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     135d145:	00 
     135d146:	48 8d 87 a8 00 00 00 	lea    rax,[rdi+0xa8]
     135d14d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     135d154:	00 
     135d155:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135d163:	00 
     135d164:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
     135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     135d172:	00 
     135d173:	48 8d 87 c0 00 00 00 	lea    rax,[rdi+0xc0]
     135d17a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     135d181:	00 
     135d182:	48 8d 87 c8 00 00 00 	lea    rax,[rdi+0xc8]
     135d189:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     135d18e:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     135d193:	48 8d 87 d8 00 00 00 	lea    rax,[rdi+0xd8]
     135d19a:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     135d1a1:	00 
     135d1a2:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
     135d1a5:	48 8d 35 19 92 fd fe 	lea    rsi,[rip+0xfffffffffefd9219]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
     135d1ac:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
     135d1b3:	00 
     135d1b4:	4c 89 ff             	mov    rdi,r15
     135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
     135d1be:	00 
     135d1bf:	e8 ba c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]
     135d1cb:	00 
     135d1cc:	48 8d 35 7b 35 00 ff 	lea    rsi,[rip+0xffffffffff00357b]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
     135d1d3:	4c 89 e7             	mov    rdi,r12
     135d1d6:	e8 a3 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1db:	4c 8d a4 24 00 0b 00 	lea    r12,[rsp+0xb00]
     135d1e2:	00 
     135d1e3:	48 8d 35 e8 2d fe fe 	lea    rsi,[rip+0xfffffffffefe2de8]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
     135d1ea:	4c 89 e7             	mov    rdi,r12
     135d1ed:	e8 8c c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d1f2:	4c 8d a4 24 18 0b 00 	lea    r12,[rsp+0xb18]
     135d1f9:	00 
     135d1fa:	48 8d 35 f1 7f fc fe 	lea    rsi,[rip+0xfffffffffefc7ff1]        # 3251f2 <_ZTSSt12bad_any_cast@@Base-0x6afd6>
     135d201:	4c 89 e7             	mov    rdi,r12
     135d204:	e8 75 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d209:	4c 8d a4 24 30 0b 00 	lea    r12,[rsp+0xb30]
     135d210:	00 
     135d211:	48 8d 35 b1 3d 02 ff 	lea    rsi,[rip+0xffffffffff023db1]        # 380fc9 <_ZTSSt12bad_any_cast@@Base-0xf1ff>
     135d218:	4c 89 e7             	mov    rdi,r12
     135d21b:	e8 5e c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d220:	4c 8d a4 24 48 0b 00 	lea    r12,[rsp+0xb48]
     135d227:	00 
     135d228:	48 8d 35 1b 72 01 ff 	lea    rsi,[rip+0xffffffffff01721b]        # 37444a <_ZTSSt12bad_any_cast@@Base-0x1bd7e>
     135d22f:	4c 89 e7             	mov    rdi,r12
     135d232:	e8 47 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d237:	4c 8d a4 24 60 0b 00 	lea    r12,[rsp+0xb60]
     135d23e:	00 
     135d23f:	48 8d 35 7c ff 07 ff 	lea    rsi,[rip+0xffffffffff07ff7c]        # 3dd1c2 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2c11>
     135d246:	4c 89 e7             	mov    rdi,r12
     135d249:	e8 30 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d24e:	48 89 5c 24 68       	mov    QWORD PTR [rsp+0x68],rbx
     135d253:	4c 8d a4 24 a0 05 00 	lea    r12,[rsp+0x5a0]
     135d25a:	00 
     135d25b:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135d262:	00 
     135d263:	6a 07                	push   0x7
     135d265:	5a                   	pop    rdx
     135d266:	4c 89 e7             	mov    rdi,r12
     135d269:	e8 ea a1 74 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
     135d26e:	4c 8b bc 24 d0 10 00 	mov    r15,QWORD PTR [rsp+0x10d0]
     135d275:	00 
     135d276:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
     135d27b:	48 8d 48 18          	lea    rcx,[rax+0x18]
     135d27f:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     135d284:	48 05 e0 00 00 00    	add    rax,0xe0
     135d28a:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     135d291:	00 
     135d292:	bb 90 00 00 00       	mov    ebx,0x90
     135d297:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
     135d29b:	48 81 c7 d0 0a 00 00 	add    rdi,0xad0
     135d2a2:	e8 e9 0b 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135d2a7:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
     135d2ab:	48 83 fb e8          	cmp    rbx,0xffffffffffffffe8
     135d2af:	75 e6                	jne    135d297 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a281b>
     135d2b1:	48 8d 35 d8 fe 07 ff 	lea    rsi,[rip+0xffffffffff07fed8]        # 3dd190 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2bdf>
     135d2b8:	48 8d 0d f1 fe 07 ff 	lea    rcx,[rip+0xffffffffff07fef1]        # 3dd1b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2bff>
     135d2bf:	4c 8d 0d fc fe 07 ff 	lea    r9,[rip+0xffffffffff07fefc]        # 3dd1c2 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2c11>
     135d2c6:	6a 17                	push   0x17
     135d2c8:	5a                   	pop    rdx
     135d2c9:	6a 11                	push   0x11
     135d2cb:	41 58                	pop    r8
     135d2cd:	4c 89 f7             	mov    rdi,r14
     135d2d0:	41 54                	push   r12
     135d2d2:	6a 0b                	push   0xb
     135d2d4:	e8 b5 a3 28 00       	call   15e768e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cc12>

## Entry-rdi aliases from prologue
- rdi

## Writes to entry-object aliases at offsets < 0xf0
### 0x135d082 rdi+0x8: mov    BYTE PTR [rdi+0x8],al
     135d06f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d076:	00 00 
     135d078:	48 89 84 24 20 10 00 	mov    QWORD PTR [rsp+0x1020],rax
     135d07f:	00 
     135d080:	31 c0                	xor    eax,eax
     135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0

### 0x135d08c rdi+0x0: mov    QWORD PTR [rdi],r8
     135d078:	48 89 84 24 20 10 00 	mov    QWORD PTR [rsp+0x1020],rax
     135d07f:	00 
     135d080:	31 c0                	xor    eax,eax
     135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0

### 0x135d08f rdi+0x10: and    QWORD PTR [rdi+0x10],0x0
     135d07f:	00 
     135d080:	31 c0                	xor    eax,eax
     135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0

### 0x135d094 rdi+0x18: mov    BYTE PTR [rdi+0x18],al
     135d080:	31 c0                	xor    eax,eax
     135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0

### 0x135d097 rdi+0x50: mov    BYTE PTR [rdi+0x50],al
     135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 

### 0x135d09a rdi+0x68: mov    BYTE PTR [rdi+0x68],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0

### 0x135d09d rdi+0x78: and    DWORD PTR [rdi+0x78],0x0
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 

### 0x135d0a5 rdi+0x20: movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 

### 0x135d0aa rdi+0x30: movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0

### 0x135d0af rdi+0x3d: movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 

### 0x135d0b4 rdi+0x80: movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0

### 0x135d0bc rdi+0x90: movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0

### 0x135d0c4 rdi+0xa0: movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0

### 0x135d0cc rdi+0xb0: movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al

### 0x135d0d4 rdi+0xc0: movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi

### 0x135d0dc rdi+0xd0: movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi
     135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx

### 0x135d0e4 rdi+0xe0: movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi
     135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
     135d108:	00 

### 0x135d6c3 rdi+0x0: and    QWORD PTR [rdi],0x0
     135d6ae:	48 8b b4 24 e0 10 00 	mov    rsi,QWORD PTR [rsp+0x10e0]
     135d6b5:	00 
     135d6b6:	e8 3f 7d 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135d6bb:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135d6c2:	00 
     135d6c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135d6c7:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     135d6ca:	e8 53 7c 47 00       	call   17d5322 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1143>
     135d6cf:	4c 8d bc 24 f0 0a 00 	lea    r15,[rsp+0xaf0]
     135d6d6:	00 
     135d6d7:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135d6de:	00 
     135d6df:	49 89 47 e0          	mov    QWORD PTR [r15-0x20],rax
     135d6e3:	4d 89 77 e8          	mov    QWORD PTR [r15-0x18],r14

### 0x135dc7c rdi+0x0: and    QWORD PTR [rdi],0x0
     135dc67:	e8 fa f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dc6c:	48 89 df             	mov    rdi,rbx
     135dc6f:	e8 f6 c2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135dc74:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135dc7b:	00 
     135dc7c:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135dc80:	e8 2d 30 00 00       	call   1360cb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6236>
     135dc85:	4c 89 e7             	mov    rdi,r12
     135dc88:	e8 d9 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dc8d:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135dc94:	00 
     135dc95:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135dc98:	48 89 28             	mov    QWORD PTR [rax],rbp
     135dc9b:	48 85 ff             	test   rdi,rdi

### 0x135e513 rdi+0x0: and    QWORD PTR [rdi],0x0
     135e4fb:	00 00 
     135e4fd:	49 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [r15+0xc8]
     135e504:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
     135e50b:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135e512:	00 
     135e513:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135e517:	48 89 9c 24 90 05 00 	mov    QWORD PTR [rsp+0x590],rbx
     135e51e:	00 
     135e51f:	e8 a6 bd 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135e524:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
     135e52b:	00 
     135e52c:	e8 a1 27 00 00       	call   1360cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6256>
     135e531:	bf 10 02 00 00       	mov    edi,0x210
     135e536:	e8 c5 f9 48 00       	call   17edf00 <_Znwm@plt>

### 0x135f01e rdi+0x0: movaps XMMWORD PTR [rdi],xmm1
     135f00c:	00 00 
     135f00e:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
     135f015:	00 
     135f016:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f01d:	00 
     135f01e:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     135f021:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135f026:	0f 11 8c 24 48 02 00 	movups XMMWORD PTR [rsp+0x248],xmm1
     135f02d:	00 
     135f02e:	e8 f5 c6 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135f033:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     135f038:	66 0f ef c0          	pxor   xmm0,xmm0
     135f03c:	f3 0f 7f 03          	movdqu XMMWORD PTR [rbx],xmm0
     135f040:	80 bc 24 50 02 00 00 	cmp    BYTE PTR [rsp+0x250],0x0

### 0x135f021 rdi+0x10: and    QWORD PTR [rdi+0x10],0x0
     135f00e:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
     135f015:	00 
     135f016:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f01d:	00 
     135f01e:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     135f021:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135f026:	0f 11 8c 24 48 02 00 	movups XMMWORD PTR [rsp+0x248],xmm1
     135f02d:	00 
     135f02e:	e8 f5 c6 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135f033:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     135f038:	66 0f ef c0          	pxor   xmm0,xmm0
     135f03c:	f3 0f 7f 03          	movdqu XMMWORD PTR [rbx],xmm0
     135f040:	80 bc 24 50 02 00 00 	cmp    BYTE PTR [rsp+0x250],0x0
     135f047:	00 

### 0x135f145 rdi+0x0: movaps XMMWORD PTR [rdi],xmm1
     135f133:	00 00 
     135f135:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     135f13c:	00 
     135f13d:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f144:	00 
     135f145:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     135f148:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135f14d:	0f 11 8c 24 18 02 00 	movups XMMWORD PTR [rsp+0x218],xmm1
     135f154:	00 
     135f155:	e8 ce c5 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135f15a:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f15f:	66 0f ef c0          	pxor   xmm0,xmm0
     135f163:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
     135f169:	80 bc 24 20 02 00 00 	cmp    BYTE PTR [rsp+0x220],0x0

### 0x135f148 rdi+0x10: and    QWORD PTR [rdi+0x10],0x0
     135f135:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     135f13c:	00 
     135f13d:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f144:	00 
     135f145:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
     135f148:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135f14d:	0f 11 8c 24 18 02 00 	movups XMMWORD PTR [rsp+0x218],xmm1
     135f154:	00 
     135f155:	e8 ce c5 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135f15a:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f15f:	66 0f ef c0          	pxor   xmm0,xmm0
     135f163:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
     135f169:	80 bc 24 20 02 00 00 	cmp    BYTE PTR [rsp+0x220],0x0
     135f170:	00 

### 0x135f3c3 rdi+0x0: and    QWORD PTR [rdi],0x0
     135f3b0:	00 
     135f3b1:	e8 b0 1b 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f3b6:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
     135f3bb:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135f3c2:	00 
     135f3c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135f3c7:	48 89 9c 24 a0 0d 00 	mov    QWORD PTR [rsp+0xda0],rbx
     135f3ce:	00 
     135f3cf:	e8 f6 ae 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135f3d4:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     135f3db:	00 00 
     135f3dd:	48 8d 05 9c 8c 50 00 	lea    rax,[rip+0x508c9c]        # 1868080 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24768>
     135f3e4:	48 8d 8c 24 a0 0a 00 	lea    rcx,[rsp+0xaa0]
     135f3eb:	00 

## High-address materializations near object writes
- object write 0x135d082 +0x8, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d08c +0x0, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d08f +0x10, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d094 +0x18, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d097 +0x50, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d09a +0x68, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d09d +0x78, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d0a5 +0x20, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d0aa +0x30, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135d0af +0x3d, nearby high VA 0x1867c98
  135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
- object write 0x135f3c3 +0x0, nearby high VA 0x1868038
  135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>

## Direct first-word writes in full constructor
### 0x135d08c: mov    QWORD PTR [rdi],r8
     135d05d:	41 54                	push   r12
     135d05f:	53                   	push   rbx
     135d060:	48 81 ec 28 10 00 00 	sub    rsp,0x1028
     135d067:	4c 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],r9
     135d06c:	4c 89 c3             	mov    rbx,r8
     135d06f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135d076:	00 00 
     135d078:	48 89 84 24 20 10 00 	mov    QWORD PTR [rsp+0x1020],rax
     135d07f:	00 
     135d080:	31 c0                	xor    eax,eax
     135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
     135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
     135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
     135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
     135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
     135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
     135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
     135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
     135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
     135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
     135d0bb:	00 
     135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0

## Calls receiving entry-object alias as rdi
## Candidate vtable APs from stores
### AP 0x1867c98
- +0x0: 0x1364a94 FDE=(20335252, 20335420)
- +0x8: 0x1364b3c FDE=(20335420, 20335438)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x1364b4e FDE=(20335438, 20335725)
- +0x28: 0xc2e960 FDE=(12773728, 12773736)
- +0x30: 0xc7ddb4 FDE=(13098420, 13098428)
- +0x38: 0x1364c6e FDE=(20335726, 20335770)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x1364742 FDE=(20334402, 20334421)
- +0x58: 0x1364756 FDE=(20334422, 20334440)
- +0x60: 0x1364768 FDE=(20334440, 20334602)
- +0x68: 0x136480a FDE=(20334602, 20334628)
- +0x70: 0x1364824 FDE=(20334628, 20334637)
- +0x78: 0x136482e FDE=(20334638, 20334660)
- +0x80: 0x1364844 FDE=(20334660, 20335091)
- +0x88: 0x0 FDE=None

## Candidate +0x28 method bodies
### AP 0x1867c98 +0x28 -> 0xc2e960
      c2e960:	48 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [rdi+0xc8]
      c2e967:	c3                   	ret

