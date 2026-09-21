# e95 caller rsp+0x228 source trace

- caller FDE=(15281964, 15306555)
- e99d07 rsp+0x1338 maps to caller stable-frame rsp+0x228 before outgoing args

## Caller prologue
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
      e93001:	40 84 dd             	test   bpl,bl
      e93004:	0f 85 87 00 00 00    	jne    e93091 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a4a7>
      e9300a:	66 0f ef c0          	pxor   xmm0,xmm0
      e9300e:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e93015:	00 
      e93016:	66 41 0f 7f 46 10    	movdqa XMMWORD PTR [r14+0x10],xmm0
      e9301c:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
      e93021:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
      e93028:	3f 
      e93029:	48 8d bc 24 e8 03 00 	lea    rdi,[rsp+0x3e8]
      e93030:	00 
      e93031:	4c 89 f6             	mov    rsi,r14
      e93034:	e8 c3 63 00 00       	call   e993fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60812>
      e93039:	4c 89 f7             	mov    rdi,r14
      e9303c:	e8 25 f6 c4 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
      e93041:	40 84 ed             	test   bpl,bpl
      e93044:	74 14                	je     e9305a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a470>
      e93046:	48 8d 35 13 8c 5a ff 	lea    rsi,[rip+0xffffffffff5a8c13]        # 43bc60 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x186c>

## Exact rsp+0x228 references before outgoing-arg setup e95bce
### WRITE 0xe95a84: mov    QWORD PTR [rsp+0x228],rax
      e95a32:	00 
      e95a33:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e95a3a:	00 
      e95a3b:	e8 de 49 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
      e95a40:	48 8d 4d 20          	lea    rcx,[rbp+0x20]
      e95a44:	48 8b 83 40 02 00 00 	mov    rax,QWORD PTR [rbx+0x240]
      e95a4b:	0f 10 83 38 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x238]
      e95a52:	0f 29 84 24 e0 02 00 	movaps XMMWORD PTR [rsp+0x2e0],xmm0
      e95a59:	00 
      e95a5a:	48 85 c0             	test   rax,rax
      e95a5d:	74 05                	je     e95a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ce7a>
      e95a5f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95a64:	66 48 0f 6e cd       	movq   xmm1,rbp
      e95a69:	66 48 0f 6e c1       	movq   xmm0,rcx
      e95a6e:	48 8b 83 18 04 00 00 	mov    rax,QWORD PTR [rbx+0x418]
      e95a75:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
      e95a7c:	00 
      e95a7d:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
      e95a84:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
      e95a8b:	00 
      e95a8c:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
      e95a90:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
      e95a97:	00 
      e95a98:	48 8b 83 40 04 00 00 	mov    rax,QWORD PTR [rbx+0x440]
      e95a9f:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
      e95aa6:	00 
      e95aa7:	0f 57 d2             	xorps  xmm2,xmm2
      e95aaa:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e95ab1:	00 
      e95ab2:	74 18                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
      e95ab4:	0f 10 93 58 04 00 00 	movups xmm2,XMMWORD PTR [rbx+0x458]
      e95abb:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
      e95ac2:	48 85 c0             	test   rax,rax
      e95ac5:	74 05                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
      e95ac7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95acc:	4c 89 ac 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r13
      e95ad3:	00 
      e95ad4:	4c 89 b4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r14
      e95adb:	00 
      e95adc:	0f 29 94 24 c0 01 00 	movaps XMMWORD PTR [rsp+0x1c0],xmm2
      e95ae3:	00 
      e95ae4:	4c 89 a4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r12
      e95aeb:	00 
      e95aec:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
      e95af3:	00 
      e95af4:	48 83 c5 08          	add    rbp,0x8
      e95af8:	66 0f 6c c1          	punpcklqdq xmm0,xmm1


## LEA aliases of rsp+0x228 and writes through aliases
## Nearest reaching definition before e95bce
### direct candidate 0xe95a84: mov    QWORD PTR [rsp+0x228],rax
      e95a06:	00 
      e95a07:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
      e95a0e:	00 
      e95a0f:	e8 7c 48 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e95a14:	48 8b 83 b0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2b0]
      e95a1b:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
      e95a22:	00 
      e95a23:	48 8b b4 24 f0 02 00 	mov    rsi,QWORD PTR [rsp+0x2f0]
      e95a2a:	00 
      e95a2b:	48 8b 94 24 f8 02 00 	mov    rdx,QWORD PTR [rsp+0x2f8]
      e95a32:	00 
      e95a33:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e95a3a:	00 
      e95a3b:	e8 de 49 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
      e95a40:	48 8d 4d 20          	lea    rcx,[rbp+0x20]
      e95a44:	48 8b 83 40 02 00 00 	mov    rax,QWORD PTR [rbx+0x240]
      e95a4b:	0f 10 83 38 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x238]
      e95a52:	0f 29 84 24 e0 02 00 	movaps XMMWORD PTR [rsp+0x2e0],xmm0
      e95a59:	00 
      e95a5a:	48 85 c0             	test   rax,rax
      e95a5d:	74 05                	je     e95a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ce7a>
      e95a5f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95a64:	66 48 0f 6e cd       	movq   xmm1,rbp
      e95a69:	66 48 0f 6e c1       	movq   xmm0,rcx
      e95a6e:	48 8b 83 18 04 00 00 	mov    rax,QWORD PTR [rbx+0x418]
      e95a75:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
      e95a7c:	00 
      e95a7d:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
      e95a84:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
      e95a8b:	00 
      e95a8c:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
      e95a90:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
      e95a97:	00 
      e95a98:	48 8b 83 40 04 00 00 	mov    rax,QWORD PTR [rbx+0x440]
      e95a9f:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
      e95aa6:	00 
      e95aa7:	0f 57 d2             	xorps  xmm2,xmm2
      e95aaa:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e95ab1:	00 
      e95ab2:	74 18                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
      e95ab4:	0f 10 93 58 04 00 00 	movups xmm2,XMMWORD PTR [rbx+0x458]
      e95abb:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
      e95ac2:	48 85 c0             	test   rax,rax
      e95ac5:	74 05                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
      e95ac7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95acc:	4c 89 ac 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r13
      e95ad3:	00 
      e95ad4:	4c 89 b4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r14
      e95adb:	00 
      e95adc:	0f 29 94 24 c0 01 00 	movaps XMMWORD PTR [rsp+0x1c0],xmm2
      e95ae3:	00 
      e95ae4:	4c 89 a4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r12
      e95aeb:	00 
      e95aec:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
      e95af3:	00 
      e95af4:	48 83 c5 08          	add    rbp,0x8
      e95af8:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
      e95afc:	48 8d b3 b0 01 00 00 	lea    rsi,[rbx+0x1b0]
      e95b03:	48 8d 43 30          	lea    rax,[rbx+0x30]
      e95b07:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
      e95b0e:	00 
      e95b0f:	48 8d 83 80 00 00 00 	lea    rax,[rbx+0x80]
      e95b16:	48 89 84 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rax
      e95b1d:	00 
      e95b1e:	48 8d 83 50 02 00 00 	lea    rax,[rbx+0x250]
      e95b25:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      e95b2a:	48 8d 83 50 03 00 00 	lea    rax,[rbx+0x350]
      e95b31:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
      e95b38:	00 
      e95b39:	48 8d 83 d0 03 00 00 	lea    rax,[rbx+0x3d0]
      e95b40:	48 89 84 24 08 02 00 	mov    QWORD PTR [rsp+0x208],rax

## Reads of rsp+0x228 after call / cleanup
## All high-address/vptr-looking constants near final reaching definition
