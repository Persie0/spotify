# TimelineConductor Skip Ad dependency

Proven owner:
- service ID 0xb8 provider = TimelineConductorSetupImpl
- factory allocates 0xf0 bytes
- constructor 0x135d056 stores vptr 0x1867c98
- vtable +0x28 = 0xc2e960 = return [this+0xc8]
- Skip Ad execution later calls returned dependency vtable +0x68 with "skip-ad"

## All direct +0xc8 references in TimelineConductor constructor
### 0x135d14d: mov    QWORD PTR [rsp+0xc8],rax
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

### 0x135d182: lea    rax,[rdi+0xc8]
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

### 0x135dcd4: mov    rcx,QWORD PTR [rsp+0xc8]
     135dc94:	00 
     135dc95:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135dc98:	48 89 28             	mov    QWORD PTR [rax],rbp
     135dc9b:	48 85 ff             	test   rdi,rdi
     135dc9e:	74 06                	je     135dca6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a322a>
     135dca0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dca3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dca6:	48 8d bc 24 e0 08 00 	lea    rdi,[rsp+0x8e0]
     135dcad:	00 
     135dcae:	e8 b3 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dcb3:	6a 08                	push   0x8
     135dcb5:	5f                   	pop    rdi
     135dcb6:	e8 45 02 49 00       	call   17edf00 <_Znwm@plt>
     135dcbb:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135dcc0:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     135dcc5:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135dcca:	48 8d 0d d7 bf 50 00 	lea    rcx,[rip+0x50bfd7]        # 1869ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26390>
     135dcd1:	48 89 08             	mov    QWORD PTR [rax],rcx
     135dcd4:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     135dcdb:	00 
     135dcdc:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135dcdf:	48 89 01             	mov    QWORD PTR [rcx],rax
     135dce2:	48 85 ff             	test   rdi,rdi
     135dce5:	74 06                	je     135dced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3271>
     135dce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcea:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dced:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135dcf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcf5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dcf8:	49 89 c4             	mov    r12,rax
     135dcfb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dcfe:	4c 89 ff             	mov    rdi,r15
     135dd01:	ff 50 40             	call   QWORD PTR [rax+0x40]
     135dd04:	49 89 c5             	mov    r13,rax
     135dd07:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dd0a:	4c 89 ff             	mov    rdi,r15
     135dd0d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135dd10:	48 8d bc 24 b0 08 00 	lea    rdi,[rsp+0x8b0]
     135dd17:	00 
     135dd18:	48 89 c6             	mov    rsi,rax
     135dd1b:	e8 70 c5 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135dd20:	48 8b b4 24 68 10 00 	mov    rsi,QWORD PTR [rsp+0x1068]
     135dd27:	00 
     135dd28:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     135dd2b:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
     135dd32:	00 
     135dd33:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135dd36:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135dd39:	48 89 df             	mov    rdi,rbx

### 0x135e4fd: mov    rax,QWORD PTR [r15+0xc8]
     135e4a4:	48 81 c7 e0 00 00 00 	add    rdi,0xe0
     135e4ab:	ba a0 00 00 00       	mov    edx,0xa0
     135e4b0:	4c 89 fe             	mov    rsi,r15
     135e4b3:	e8 18 16 49 00       	call   17efad0 <memcpy@plt>
     135e4b8:	66 41 0f 6f 87 a0 00 	movdqa xmm0,XMMWORD PTR [r15+0xa0]
     135e4bf:	00 00 
     135e4c1:	f3 0f 7f 83 80 01 00 	movdqu XMMWORD PTR [rbx+0x180],xmm0
     135e4c8:	00 
     135e4c9:	49 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [r15+0xb0]
     135e4d0:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
     135e4d7:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     135e4dc:	66 0f ef c0          	pxor   xmm0,xmm0
     135e4e0:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     135e4e5:	41 0f 10 8f b8 00 00 	movups xmm1,XMMWORD PTR [r15+0xb8]
     135e4ec:	00 
     135e4ed:	0f 11 8b 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm1
     135e4f4:	f3 41 0f 7f 87 b8 00 	movdqu XMMWORD PTR [r15+0xb8],xmm0
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
     135e53b:	49 89 c4             	mov    r12,rax
     135e53e:	48 8b 84 24 f8 10 00 	mov    rax,QWORD PTR [rsp+0x10f8]
     135e545:	00 
     135e546:	48 8d 70 30          	lea    rsi,[rax+0x30]
     135e54a:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135e551:	00 
     135e552:	e8 39 bd 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135e557:	48 8d 05 1a a7 50 00 	lea    rax,[rip+0x50a71a]        # 1868c78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25360>
     135e55e:	49 89 04 24          	mov    QWORD PTR [r12],rax
     135e562:	66 0f ef c0          	pxor   xmm0,xmm0
     135e566:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
     135e56d:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
     135e572:	e8 35 aa cf ff       	call   1058fac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2203c2>
     135e577:	66 0f ef c0          	pxor   xmm0,xmm0
     135e57b:	66 41 0f 7f 44 24 50 	movdqa XMMWORD PTR [r12+0x50],xmm0
     135e582:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
     135e589:	f3 41 0f 7f 44 24 28 	movdqu XMMWORD PTR [r12+0x28],xmm0
     135e590:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0

### 0x135f26a: mov    rax,QWORD PTR [rsp+0xc8]
     135f224:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 
     135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx

### 0x135f530: mov    QWORD PTR [r14+0xc8],rax
     135f4df:	49 89 86 98 00 00 00 	mov    QWORD PTR [r14+0x98],rax
     135f4e6:	0f 57 c0             	xorps  xmm0,xmm0
     135f4e9:	48 8d 84 24 88 03 00 	lea    rax,[rsp+0x388]
     135f4f0:	00 
     135f4f1:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     135f4f6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     135f4f9:	0f 10 4d e8          	movups xmm1,XMMWORD PTR [rbp-0x18]
     135f4fd:	41 0f 29 8e a0 00 00 	movaps XMMWORD PTR [r14+0xa0],xmm1
     135f504:	00 
     135f505:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     135f509:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
     135f510:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f515:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     135f51a:	f3 0f 6f 45 00       	movdqu xmm0,XMMWORD PTR [rbp+0x0]
     135f51f:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
     135f526:	00 00 
     135f528:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f52f:	00 
     135f530:	49 89 86 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],rax
     135f537:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135f53e:	00 
     135f53f:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
     135f546:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135f54b:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
     135f552:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     135f557:	49 89 86 e0 00 00 00 	mov    QWORD PTR [r14+0xe0],rax
     135f55e:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
     135f565:	48 8d b4 24 40 0e 00 	lea    rsi,[rsp+0xe40]
     135f56c:	00 
     135f56d:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
     135f572:	e8 27 fa 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     135f577:	4d 8d ae b0 01 00 00 	lea    r13,[r14+0x1b0]
     135f57e:	48 8b 84 24 30 0e 00 	mov    rax,QWORD PTR [rsp+0xe30]
     135f585:	00 
     135f586:	48 85 c0             	test   rax,rax
     135f589:	74 1e                	je     135f5a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b2d>
     135f58b:	48 8d 8c 24 10 0e 00 	lea    rcx,[rsp+0xe10]
     135f592:	00 
     135f593:	48 39 c8             	cmp    rax,rcx
     135f596:	74 1e                	je     135f5b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b3a>
     135f598:	48 8d 8c 24 30 0e 00 	lea    rcx,[rsp+0xe30]
     135f59f:	00 
     135f5a0:	49 89 86 d0 01 00 00 	mov    QWORD PTR [r14+0x1d0],rax
     135f5a7:	eb 07                	jmp    135f5b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b34>
     135f5a9:	49 8d 8e d0 01 00 00 	lea    rcx,[r14+0x1d0]
     135f5b0:	48 83 21 00          	and    QWORD PTR [rcx],0x0
     135f5b4:	eb 18                	jmp    135f5ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b52>
     135f5b6:	4d 89 ae d0 01 00 00 	mov    QWORD PTR [r14+0x1d0],r13
     135f5bd:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]

### 0x135f82d: mov    rax,QWORD PTR [r14+0xc8]
     135f7db:	4c 89 ff             	mov    rdi,r15
     135f7de:	e8 f7 3d 97 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
     135f7e3:	48 8b 84 24 68 11 00 	mov    rax,QWORD PTR [rsp+0x1168]
     135f7ea:	00 
     135f7eb:	49 89 86 70 07 00 00 	mov    QWORD PTR [r14+0x770],rax
     135f7f2:	4d 89 a6 78 07 00 00 	mov    QWORD PTR [r14+0x778],r12
     135f7f9:	48 8d 9c 24 c0 0f 00 	lea    rbx,[rsp+0xfc0]
     135f800:	00 
     135f801:	4c 89 6b a0          	mov    QWORD PTR [rbx-0x60],r13
     135f805:	48 89 6b a8          	mov    QWORD PTR [rbx-0x58],rbp
     135f809:	4c 89 73 b0          	mov    QWORD PTR [rbx-0x50],r14
     135f80d:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135f812:	48 89 43 b8          	mov    QWORD PTR [rbx-0x48],rax
     135f816:	49 8b 86 38 07 00 00 	mov    rax,QWORD PTR [r14+0x738]
     135f81d:	48 89 43 c0          	mov    QWORD PTR [rbx-0x40],rax
     135f821:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135f828:	00 
     135f829:	48 89 43 c8          	mov    QWORD PTR [rbx-0x38],rax
     135f82d:	49 8b 86 c8 00 00 00 	mov    rax,QWORD PTR [r14+0xc8]
     135f834:	48 89 43 d0          	mov    QWORD PTR [rbx-0x30],rax
     135f838:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     135f83d:	48 89 43 d8          	mov    QWORD PTR [rbx-0x28],rax
     135f841:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135f847:	66 0f 7f 43 e0       	movdqa XMMWORD PTR [rbx-0x20],xmm0
     135f84c:	48 8b 84 24 20 11 00 	mov    rax,QWORD PTR [rsp+0x1120]
     135f853:	00 
     135f854:	48 89 43 f0          	mov    QWORD PTR [rbx-0x10],rax
     135f858:	48 89 df             	mov    rdi,rbx
     135f85b:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
     135f860:	4c 89 fe             	mov    rsi,r15
     135f863:	e8 28 aa 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f868:	4d 8d a6 80 07 00 00 	lea    r12,[r14+0x780]
     135f86f:	4c 8d bc 24 a0 0f 00 	lea    r15,[rsp+0xfa0]
     135f876:	00 
     135f877:	49 8b 86 70 07 00 00 	mov    rax,QWORD PTR [r14+0x770]
     135f87e:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     135f882:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
     135f887:	41 0f 10 4e 68       	movups xmm1,XMMWORD PTR [r14+0x68]
     135f88c:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
     135f891:	41 0f 11 4f 68       	movups XMMWORD PTR [r15+0x68],xmm1
     135f896:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
     135f89a:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
     135f89e:	41 0f 28 47 c0       	movaps xmm0,XMMWORD PTR [r15-0x40]
     135f8a3:	41 0f 28 4f d0       	movaps xmm1,XMMWORD PTR [r15-0x30]
     135f8a8:	41 0f 28 57 e0       	movaps xmm2,XMMWORD PTR [r15-0x20]
     135f8ad:	41 0f 28 5f f0       	movaps xmm3,XMMWORD PTR [r15-0x10]
     135f8b2:	41 0f 29 5c 24 30    	movaps XMMWORD PTR [r12+0x30],xmm3
     135f8b8:	41 0f 29 54 24 20    	movaps XMMWORD PTR [r12+0x20],xmm2
     135f8be:	41 0f 29 4c 24 10    	movaps XMMWORD PTR [r12+0x10],xmm1

### 0x135fdb3: mov    rax,QWORD PTR [r12+0xc8]
     135fd65:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135fd6c:	00 
     135fd6d:	e8 f8 a1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd72:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135fd79:	00 
     135fd7a:	e8 7f 13 00 00       	call   13610fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6682>
     135fd7f:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135fd86:	00 
     135fd87:	e8 9c b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd8c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     135fd93:	00 
     135fd94:	e8 8f b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd99:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135fda0:	00 
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 
     135fdce:	48 8b 84 24 18 11 00 	mov    rax,QWORD PTR [rsp+0x1118]
     135fdd5:	00 
     135fdd6:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fdd9:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
     135fddd:	4c 39 f3             	cmp    rbx,r14
     135fde0:	74 1c                	je     135fdfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5382>
     135fde2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135fde5:	48 85 ff             	test   rdi,rdi
     135fde8:	74 0e                	je     135fdf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a537c>
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fdef:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     135fdf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fdf5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135fdf8:	48 83 c3 08          	add    rbx,0x8
     135fdfc:	eb df                	jmp    135fddd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5361>
     135fdfe:	6a 40                	push   0x40
     135fe00:	5f                   	pop    rdi
     135fe01:	e8 fa e0 48 00       	call   17edf00 <_Znwm@plt>
     135fe06:	48 8d 0d 03 8c 50 00 	lea    rcx,[rip+0x508c03]        # 1868a10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x250f8>
     135fe0d:	48 89 08             	mov    QWORD PTR [rax],rcx
     135fe10:	48 8b 8c 24 70 10 00 	mov    rcx,QWORD PTR [rsp+0x1070]
     135fe17:	00 
     135fe18:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135fe1c:	66 0f ef c0          	pxor   xmm0,xmm0

### 0x136002c: mov    r14,QWORD PTR [r12+0xc8]
     135ffe9:	6a 08                	push   0x8
     135ffeb:	41 59                	pop    r9
     135ffed:	4c 89 f7             	mov    rdi,r14
     135fff0:	31 d2                	xor    edx,edx
     135fff2:	e8 9d a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135fff7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135fffa:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     1360001:	00 
     1360002:	48 89 de             	mov    rsi,rbx
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136001f:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360026:	00 
     1360027:	e8 bc a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136002c:	4d 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [r12+0xc8]
     1360033:	00 
     1360034:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1360037:	48 8d 35 53 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d053]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     136003e:	48 8d 0d d7 10 00 00 	lea    rcx,[rip+0x10d7]        # 136111c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66a0>
     1360045:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
     136004c:	00 
     136004d:	6a 08                	push   0x8
     136004f:	41 59                	pop    r9
     1360051:	4c 89 ff             	mov    rdi,r15
     1360054:	31 d2                	xor    edx,edx
     1360056:	49 89 d8             	mov    r8,rbx
     1360059:	e8 36 a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     136005e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1360061:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360068:	00 
     1360069:	4c 89 f6             	mov    rsi,r14
     136006c:	4c 89 fa             	mov    rdx,r15
     136006f:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     1360075:	48 8b bc 24 d8 0a 00 	mov    rdi,QWORD PTR [rsp+0xad8]
     136007c:	00 
     136007d:	e8 04 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360082:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
     1360089:	00 
     136008a:	e8 59 a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136008f:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     1360096:	00 
     1360097:	e8 5e 11 00 00       	call   13611fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a677e>
     136009c:	48 8d bc 24 70 05 00 	lea    rdi,[rsp+0x570]
     13600a3:	00 
     13600a4:	e8 c1 9e 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0x1360b9f: mov    rdi,QWORD PTR [rsp+0xc8]
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1360c11:	e8 ba f0 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1360c16:	e8 95 ee 48 00       	call   17efab0 <__stack_chk_fail@plt>
     1360c1b:	cc                   	int3
     1360c1c:	53                   	push   rbx
     1360c1d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]

## All stores to candidate this aliases around constructor
### this reload rax @0x135d276
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
     135d2d9:	58                   	pop    rax
     135d2da:	59                   	pop    rcx
     135d2db:	4c 89 e7             	mov    rdi,r12
     135d2de:	e8 05 e3 71 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
     135d2e3:	48 83 a4 24 f0 01 00 	and    QWORD PTR [rsp+0x1f0],0x0
     135d2ea:	00 00 
     135d2ec:	66 0f ef c0          	pxor   xmm0,xmm0
     135d2f0:	66 0f 7f 84 24 e0 01 	movdqa XMMWORD PTR [rsp+0x1e0],xmm0
     135d2f7:	00 00 
     135d2f9:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
     135d2fd:	41 8b 3f             	mov    edi,DWORD PTR [r15]
     135d300:	e8 1b e5 71 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     135d305:	84 c0                	test   al,al
     135d307:	74 68                	je     135d371 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a28f5>
     135d309:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
     135d310:	00 
     135d311:	48 8b 30             	mov    rsi,QWORD PTR [rax]

### this reload rbx @0x135d86d
     135d854:	00 
     135d855:	e8 b2 7b 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d85a:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
     135d861:	00 
     135d862:	4c 89 f7             	mov    rdi,r14
     135d865:	e8 44 eb 76 ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     135d86a:	6a 20                	push   0x20
     135d86c:	5f                   	pop    rdi
     135d86d:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     135d872:	e8 89 06 49 00       	call   17edf00 <_Znwm@plt>
     135d877:	66 0f ef c0          	pxor   xmm0,xmm0
     135d87b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135d880:	48 8d 0d 49 30 4a 00 	lea    rcx,[rip+0x4a3049]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
     135d887:	48 89 08             	mov    QWORD PTR [rax],rcx
     135d88a:	48 89 c1             	mov    rcx,rax
     135d88d:	48 83 c1 18          	add    rcx,0x18
     135d891:	48 8d 15 58 a5 50 00 	lea    rdx,[rip+0x50a558]        # 1867df0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x244d8>
     135d898:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     135d89c:	48 89 8b 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rcx
     135d8a3:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     135d8aa:	48 89 83 98 00 00 00 	mov    QWORD PTR [rbx+0x98],rax
     135d8b1:	e8 d0 0b 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d8b6:	c7 84 24 d0 01 00 00 	mov    DWORD PTR [rsp+0x1d0],0x64
     135d8bd:	64 00 00 00 
     135d8c1:	66 c7 84 24 d4 01 00 	mov    WORD PTR [rsp+0x1d4],0x101
     135d8c8:	00 01 01 
     135d8cb:	c6 84 24 d6 01 00 00 	mov    BYTE PTR [rsp+0x1d6],0x0
     135d8d2:	00 
     135d8d3:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135d8da:	00 
     135d8db:	48 8b b4 24 f0 10 00 	mov    rsi,QWORD PTR [rsp+0x10f0]
     135d8e2:	00 
     135d8e3:	e8 68 fe 95 ff       	call   cbd750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a6f0>
     135d8e8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135d8ed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d8f0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135d8f3:	48 89 c5             	mov    rbp,rax
     135d8f6:	bf 60 01 00 00       	mov    edi,0x160
     135d8fb:	e8 00 06 49 00       	call   17edf00 <_Znwm@plt>
     135d900:	49 89 c5             	mov    r13,rax
     135d903:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d90a:	00 
     135d90b:	48 8d b4 24 a0 09 00 	lea    rsi,[rsp+0x9a0]
     135d912:	00 
     135d913:	e8 78 c9 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135d918:	48 8d 05 c1 0f 4b 00 	lea    rax,[rip+0x4b0fc1]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135d91f:	48 89 84 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],rax
     135d926:	00 
     135d927:	48 8b 05 7a 41 55 00 	mov    rax,QWORD PTR [rip+0x55417a]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>

### this reload r12 @0x135df65
     135df45:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     135df4c:	00 
     135df4d:	48 89 df             	mov    rdi,rbx
     135df50:	48 8b b4 24 e0 10 00 	mov    rsi,QWORD PTR [rsp+0x10e0]
     135df57:	00 
     135df58:	e8 9d 74 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135df5d:	48 8d ac 24 a8 05 00 	lea    rbp,[rsp+0x5a8]
     135df64:	00 
     135df65:	4c 8b 64 24 78       	mov    r12,QWORD PTR [rsp+0x78]
     135df6a:	4c 89 65 f8          	mov    QWORD PTR [rbp-0x8],r12
     135df6e:	48 89 ef             	mov    rdi,rbp
     135df71:	48 89 de             	mov    rsi,rbx
     135df74:	e8 81 74 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135df79:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135df80:	00 
     135df81:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     135df85:	48 8b 84 24 a0 10 00 	mov    rax,QWORD PTR [rsp+0x10a0]
     135df8c:	00 
     135df8d:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     135df91:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135df98:	00 
     135df99:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     135df9d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     135dfa2:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     135dfa6:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     135dfab:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
     135dfaf:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
     135dfb6:	00 
     135dfb7:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
     135dfbe:	00 00 
     135dfc0:	f3 0f 7f 45 30       	movdqu XMMWORD PTR [rbp+0x30],xmm0
     135dfc5:	48 85 c0             	test   rax,rax
     135dfc8:	4c 8b ac 24 e8 10 00 	mov    r13,QWORD PTR [rsp+0x10e8]
     135dfcf:	00 
     135dfd0:	74 05                	je     135dfd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a355b>
     135dfd2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135dfd7:	48 8d 9c 24 f0 05 00 	lea    rbx,[rsp+0x5f0]
     135dfde:	00 
     135dfdf:	48 8d b4 24 b0 08 00 	lea    rsi,[rsp+0x8b0]
     135dfe6:	00 
     135dfe7:	48 89 df             	mov    rdi,rbx
     135dfea:	4c 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r15
     135dff1:	00 
     135dff2:	e8 99 c2 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135dff7:	4c 8d b4 24 20 06 00 	lea    r14,[rsp+0x620]
     135dffe:	00 
     135dfff:	4c 89 f7             	mov    rdi,r14
     135e002:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135e009:	00 

### this reload r12 @0x135fc77
     135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
     135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]
     135fc5d:	48 89 ef             	mov    rdi,rbp
     135fc60:	48 8b b4 24 98 10 00 	mov    rsi,QWORD PTR [rsp+0x1098]
     135fc67:	00 
     135fc68:	e8 55 1a 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     135fc6d:	49 8d 9e c0 0b 00 00 	lea    rbx,[r14+0xbc0]
     135fc74:	48 89 df             	mov    rdi,rbx
     135fc77:	4c 8b 64 24 78       	mov    r12,QWORD PTR [rsp+0x78]
     135fc7c:	e8 a9 5a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     135fc81:	4c 89 f7             	mov    rdi,r14
     135fc84:	31 f6                	xor    esi,esi
     135fc86:	e8 15 71 00 00       	call   1366da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac324>
     135fc8b:	49 8b be 78 07 00 00 	mov    rdi,QWORD PTR [r14+0x778]
     135fc92:	48 8d b4 24 00 0f 00 	lea    rsi,[rsp+0xf00]
     135fc99:	00 
     135fc9a:	4c 89 36             	mov    QWORD PTR [rsi],r14
     135fc9d:	48 8d 05 c0 c7 71 ff 	lea    rax,[rip+0xffffffffff71c7c0]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135fca4:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     135fca8:	48 8d 05 49 73 00 00 	lea    rax,[rip+0x7349]        # 1366ff8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac57c>
     135fcaf:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     135fcb3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fcb6:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135fcb9:	48 8d bc 24 00 0f 00 	lea    rdi,[rsp+0xf00]
     135fcc0:	00 
     135fcc1:	e8 5a 74 00 00       	call   1367120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac6a4>
     135fcc6:	48 8d bc 24 d0 09 00 	lea    rdi,[rsp+0x9d0]
     135fccd:	00 
     135fcce:	e8 97 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fcd3:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
     135fcda:	00 
     135fcdb:	e8 8a a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fce0:	48 8d bc 24 70 0a 00 	lea    rdi,[rsp+0xa70]
     135fce7:	00 
     135fce8:	e8 7d a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fced:	48 8d bc 24 40 0a 00 	lea    rdi,[rsp+0xa40]
     135fcf4:	00 
     135fcf5:	e8 70 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fcfa:	48 8d bc 24 a0 0a 00 	lea    rdi,[rsp+0xaa0]
     135fd01:	00 
     135fd02:	e8 63 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd07:	48 8d bc 24 80 0d 00 	lea    rdi,[rsp+0xd80]
     135fd0e:	00 
     135fd0f:	e8 56 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd14:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fd1b:	00 
     135fd1c:	e8 95 13 00 00       	call   13610b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a663a>
     135fd21:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
     135fd28:	00 

### this reload rbx @0x1360b50
     1360b30:	00 
     1360b31:	e8 34 94 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360b36:	48 8d bc 24 a0 09 00 	lea    rdi,[rsp+0x9a0]
     1360b3d:	00 
     1360b3e:	e8 27 94 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360b43:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1360b4a:	00 
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 

## Getter 0xc2e960
      c2e943:	48 8b 8e b8 00 00 00 	mov    rcx,QWORD PTR [rsi+0xb8]
      c2e94a:	0f 28 86 b0 00 00 00 	movaps xmm0,XMMWORD PTR [rsi+0xb0]
      c2e951:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      c2e954:	48 85 c9             	test   rcx,rcx
      c2e957:	74 05                	je     c2e95e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b8fe>
      c2e959:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      c2e95e:	c3                   	ret
      c2e95f:	cc                   	int3
      c2e960:	48 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [rdi+0xc8]
      c2e967:	c3                   	ret
      c2e968:	8a 87 d0 00 00 00    	mov    al,BYTE PTR [rdi+0xd0]
      c2e96e:	c3                   	ret
      c2e96f:	cc                   	int3
      c2e970:	41 57                	push   r15
      c2e972:	41 56                	push   r14
      c2e974:	53                   	push   rbx
      c2e975:	48 81 ec 00 01 00 00 	sub    rsp,0x100
      c2e97c:	48 89 f3             	mov    rbx,rsi
      c2e97f:	49 89 fe             	mov    r14,rdi
      c2e982:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c2e989:	00 00 

## All direct callers of getter 0xc2e960
## Vtable 0x1867c98
- +0x0: 0x1364a94
- +0x8: 0x1364b3c
- +0x10: 0x9d7de0
- +0x18: 0x9d7de0
- +0x20: 0x1364b4e
- +0x28: 0xc2e960
- +0x30: 0xc7ddb4
- +0x38: 0x1364c6e
- +0x40: 0x0
- +0x48: 0x0
- +0x50: 0x1364742
- +0x58: 0x1364756
- +0x60: 0x1364768
- +0x68: 0x136480a
- +0x70: 0x1364824
- +0x78: 0x136482e
- +0x80: 0x1364844
- +0x88: 0x0

## Calls followed within 12 instructions by a +0xc8 store
### call 0x135dca3: call   QWORD PTR [rax+0x8]
     135dc80:	e8 2d 30 00 00       	call   1360cb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6236>
     135dc85:	4c 89 e7             	mov    rdi,r12
     135dc88:	e8 d9 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dc8d:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135dc94:	00 
     135dc95:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135dc98:	48 89 28             	mov    QWORD PTR [rax],rbp
     135dc9b:	48 85 ff             	test   rdi,rdi
     135dc9e:	74 06                	je     135dca6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a322a>
     135dca0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dca3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dca6:	48 8d bc 24 e0 08 00 	lea    rdi,[rsp+0x8e0]
     135dcad:	00 
     135dcae:	e8 b3 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dcb3:	6a 08                	push   0x8
     135dcb5:	5f                   	pop    rdi
     135dcb6:	e8 45 02 49 00       	call   17edf00 <_Znwm@plt>
     135dcbb:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135dcc0:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     135dcc5:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135dcca:	48 8d 0d d7 bf 50 00 	lea    rcx,[rip+0x50bfd7]        # 1869ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26390>
     135dcd1:	48 89 08             	mov    QWORD PTR [rax],rcx
     135dcd4:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     135dcdb:	00 
     135dcdc:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135dcdf:	48 89 01             	mov    QWORD PTR [rcx],rax
     135dce2:	48 85 ff             	test   rdi,rdi
     135dce5:	74 06                	je     135dced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3271>
     135dce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcea:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dced:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135dcf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcf5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dcf8:	49 89 c4             	mov    r12,rax
     135dcfb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dcfe:	4c 89 ff             	mov    rdi,r15
     135dd01:	ff 50 40             	call   QWORD PTR [rax+0x40]

### call 0x135dcae: call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dc8d:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135dc94:	00 
     135dc95:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135dc98:	48 89 28             	mov    QWORD PTR [rax],rbp
     135dc9b:	48 85 ff             	test   rdi,rdi
     135dc9e:	74 06                	je     135dca6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a322a>
     135dca0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dca3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dca6:	48 8d bc 24 e0 08 00 	lea    rdi,[rsp+0x8e0]
     135dcad:	00 
     135dcae:	e8 b3 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dcb3:	6a 08                	push   0x8
     135dcb5:	5f                   	pop    rdi
     135dcb6:	e8 45 02 49 00       	call   17edf00 <_Znwm@plt>
     135dcbb:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135dcc0:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     135dcc5:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135dcca:	48 8d 0d d7 bf 50 00 	lea    rcx,[rip+0x50bfd7]        # 1869ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26390>
     135dcd1:	48 89 08             	mov    QWORD PTR [rax],rcx
     135dcd4:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     135dcdb:	00 
     135dcdc:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135dcdf:	48 89 01             	mov    QWORD PTR [rcx],rax
     135dce2:	48 85 ff             	test   rdi,rdi
     135dce5:	74 06                	je     135dced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3271>
     135dce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcea:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dced:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135dcf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcf5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dcf8:	49 89 c4             	mov    r12,rax
     135dcfb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dcfe:	4c 89 ff             	mov    rdi,r15
     135dd01:	ff 50 40             	call   QWORD PTR [rax+0x40]
     135dd04:	49 89 c5             	mov    r13,rax
     135dd07:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dd0a:	4c 89 ff             	mov    rdi,r15

### call 0x135dcb6: call   17edf00 <_Znwm@plt>
     135dc98:	48 89 28             	mov    QWORD PTR [rax],rbp
     135dc9b:	48 85 ff             	test   rdi,rdi
     135dc9e:	74 06                	je     135dca6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a322a>
     135dca0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dca3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dca6:	48 8d bc 24 e0 08 00 	lea    rdi,[rsp+0x8e0]
     135dcad:	00 
     135dcae:	e8 b3 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dcb3:	6a 08                	push   0x8
     135dcb5:	5f                   	pop    rdi
     135dcb6:	e8 45 02 49 00       	call   17edf00 <_Znwm@plt>
     135dcbb:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135dcc0:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     135dcc5:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135dcca:	48 8d 0d d7 bf 50 00 	lea    rcx,[rip+0x50bfd7]        # 1869ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26390>
     135dcd1:	48 89 08             	mov    QWORD PTR [rax],rcx
     135dcd4:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     135dcdb:	00 
     135dcdc:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135dcdf:	48 89 01             	mov    QWORD PTR [rcx],rax
     135dce2:	48 85 ff             	test   rdi,rdi
     135dce5:	74 06                	je     135dced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3271>
     135dce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcea:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dced:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135dcf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcf5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dcf8:	49 89 c4             	mov    r12,rax
     135dcfb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dcfe:	4c 89 ff             	mov    rdi,r15
     135dd01:	ff 50 40             	call   QWORD PTR [rax+0x40]
     135dd04:	49 89 c5             	mov    r13,rax
     135dd07:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dd0a:	4c 89 ff             	mov    rdi,r15
     135dd0d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135dd10:	48 8d bc 24 b0 08 00 	lea    rdi,[rsp+0x8b0]
     135dd17:	00 

### call 0x135f24d: call   QWORD PTR [rax+0x38]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 
     135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0

### call 0x135f25b: call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 
     135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 

### call 0x135fd87: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fd62:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135fd65:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135fd6c:	00 
     135fd6d:	e8 f8 a1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd72:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135fd79:	00 
     135fd7a:	e8 7f 13 00 00       	call   13610fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6682>
     135fd7f:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135fd86:	00 
     135fd87:	e8 9c b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd8c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     135fd93:	00 
     135fd94:	e8 8f b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd99:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135fda0:	00 
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 
     135fdce:	48 8b 84 24 18 11 00 	mov    rax,QWORD PTR [rsp+0x1118]
     135fdd5:	00 
     135fdd6:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fdd9:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
     135fddd:	4c 39 f3             	cmp    rbx,r14
     135fde0:	74 1c                	je     135fdfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5382>
     135fde2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135fde5:	48 85 ff             	test   rdi,rdi
     135fde8:	74 0e                	je     135fdf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a537c>
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]

### call 0x135fd94: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd6c:	00 
     135fd6d:	e8 f8 a1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd72:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135fd79:	00 
     135fd7a:	e8 7f 13 00 00       	call   13610fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6682>
     135fd7f:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135fd86:	00 
     135fd87:	e8 9c b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd8c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     135fd93:	00 
     135fd94:	e8 8f b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd99:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135fda0:	00 
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 
     135fdce:	48 8b 84 24 18 11 00 	mov    rax,QWORD PTR [rsp+0x1118]
     135fdd5:	00 
     135fdd6:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fdd9:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
     135fddd:	4c 39 f3             	cmp    rbx,r14
     135fde0:	74 1c                	je     135fdfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5382>
     135fde2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135fde5:	48 85 ff             	test   rdi,rdi
     135fde8:	74 0e                	je     135fdf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a537c>
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fdef:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     135fdf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fdf5:	ff 50 10             	call   QWORD PTR [rax+0x10]

### call 0x135fda1: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd79:	00 
     135fd7a:	e8 7f 13 00 00       	call   13610fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6682>
     135fd7f:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     135fd86:	00 
     135fd87:	e8 9c b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd8c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     135fd93:	00 
     135fd94:	e8 8f b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd99:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135fda0:	00 
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 
     135fdce:	48 8b 84 24 18 11 00 	mov    rax,QWORD PTR [rsp+0x1118]
     135fdd5:	00 
     135fdd6:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fdd9:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
     135fddd:	4c 39 f3             	cmp    rbx,r14
     135fde0:	74 1c                	je     135fdfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5382>
     135fde2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135fde5:	48 85 ff             	test   rdi,rdi
     135fde8:	74 0e                	je     135fdf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a537c>
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fdef:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     135fdf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fdf5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135fdf8:	48 83 c3 08          	add    rbx,0x8
     135fdfc:	eb df                	jmp    135fddd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5361>
     135fdfe:	6a 40                	push   0x40

### call 0x135fdae: call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd86:	00 
     135fd87:	e8 9c b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd8c:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     135fd93:	00 
     135fd94:	e8 8f b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fd99:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     135fda0:	00 
     135fda1:	e8 82 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fda6:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     135fdad:	00 
     135fdae:	e8 75 b9 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     135fdb3:	49 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [r12+0xc8]
     135fdba:	00 
     135fdbb:	48 8d 48 08          	lea    rcx,[rax+0x8]
     135fdbf:	48 85 c0             	test   rax,rax
     135fdc2:	48 0f 44 c8          	cmove  rcx,rax
     135fdc6:	49 89 8c 24 d0 00 00 	mov    QWORD PTR [r12+0xd0],rcx
     135fdcd:	00 
     135fdce:	48 8b 84 24 18 11 00 	mov    rax,QWORD PTR [rsp+0x1118]
     135fdd5:	00 
     135fdd6:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135fdd9:	4c 8b 70 08          	mov    r14,QWORD PTR [rax+0x8]
     135fddd:	4c 39 f3             	cmp    rbx,r14
     135fde0:	74 1c                	je     135fdfe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5382>
     135fde2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135fde5:	48 85 ff             	test   rdi,rdi
     135fde8:	74 0e                	je     135fdf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a537c>
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fdef:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     135fdf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fdf5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135fdf8:	48 83 c3 08          	add    rbx,0x8
     135fdfc:	eb df                	jmp    135fddd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5361>
     135fdfe:	6a 40                	push   0x40
     135fe00:	5f                   	pop    rdi
     135fe01:	e8 fa e0 48 00       	call   17edf00 <_Znwm@plt>
     135fe06:	48 8d 0d 03 8c 50 00 	lea    rcx,[rip+0x508c03]        # 1868a10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x250f8>

### call 0x1360008: call   QWORD PTR [rax+0xa8]
     135ffe9:	6a 08                	push   0x8
     135ffeb:	41 59                	pop    r9
     135ffed:	4c 89 f7             	mov    rdi,r14
     135fff0:	31 d2                	xor    edx,edx
     135fff2:	e8 9d a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135fff7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135fffa:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     1360001:	00 
     1360002:	48 89 de             	mov    rsi,rbx
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136001f:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360026:	00 
     1360027:	e8 bc a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136002c:	4d 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [r12+0xc8]
     1360033:	00 
     1360034:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1360037:	48 8d 35 53 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d053]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     136003e:	48 8d 0d d7 10 00 00 	lea    rcx,[rip+0x10d7]        # 136111c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66a0>
     1360045:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
     136004c:	00 
     136004d:	6a 08                	push   0x8
     136004f:	41 59                	pop    r9
     1360051:	4c 89 ff             	mov    rdi,r15
     1360054:	31 d2                	xor    edx,edx
     1360056:	49 89 d8             	mov    r8,rbx
     1360059:	e8 36 a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     136005e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1360061:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360068:	00 
     1360069:	4c 89 f6             	mov    rsi,r14
     136006c:	4c 89 fa             	mov    rdx,r15
     136006f:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]

### call 0x136001a: call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fff2:	e8 9d a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     135fff7:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135fffa:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     1360001:	00 
     1360002:	48 89 de             	mov    rsi,rbx
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136001f:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360026:	00 
     1360027:	e8 bc a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136002c:	4d 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [r12+0xc8]
     1360033:	00 
     1360034:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1360037:	48 8d 35 53 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d053]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     136003e:	48 8d 0d d7 10 00 00 	lea    rcx,[rip+0x10d7]        # 136111c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66a0>
     1360045:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
     136004c:	00 
     136004d:	6a 08                	push   0x8
     136004f:	41 59                	pop    r9
     1360051:	4c 89 ff             	mov    rdi,r15
     1360054:	31 d2                	xor    edx,edx
     1360056:	49 89 d8             	mov    r8,rbx
     1360059:	e8 36 a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     136005e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1360061:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360068:	00 
     1360069:	4c 89 f6             	mov    rsi,r14
     136006c:	4c 89 fa             	mov    rdx,r15
     136006f:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     1360075:	48 8b bc 24 d8 0a 00 	mov    rdi,QWORD PTR [rsp+0xad8]
     136007c:	00 
     136007d:	e8 04 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360082:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]

### call 0x1360027: call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1360001:	00 
     1360002:	48 89 de             	mov    rsi,rbx
     1360005:	4c 89 f2             	mov    rdx,r14
     1360008:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     136000e:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     1360015:	00 
     1360016:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     136001a:	e8 67 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136001f:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360026:	00 
     1360027:	e8 bc a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136002c:	4d 8b b4 24 c8 00 00 	mov    r14,QWORD PTR [r12+0xc8]
     1360033:	00 
     1360034:	4c 89 23             	mov    QWORD PTR [rbx],r12
     1360037:	48 8d 35 53 d0 73 ff 	lea    rsi,[rip+0xffffffffff73d053]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     136003e:	48 8d 0d d7 10 00 00 	lea    rcx,[rip+0x10d7]        # 136111c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66a0>
     1360045:	4c 8d bc 24 18 01 00 	lea    r15,[rsp+0x118]
     136004c:	00 
     136004d:	6a 08                	push   0x8
     136004f:	41 59                	pop    r9
     1360051:	4c 89 ff             	mov    rdi,r15
     1360054:	31 d2                	xor    edx,edx
     1360056:	49 89 d8             	mov    r8,rbx
     1360059:	e8 36 a7 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     136005e:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1360061:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360068:	00 
     1360069:	4c 89 f6             	mov    rsi,r14
     136006c:	4c 89 fa             	mov    rdx,r15
     136006f:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     1360075:	48 8b bc 24 d8 0a 00 	mov    rdi,QWORD PTR [rsp+0xad8]
     136007c:	00 
     136007d:	e8 04 e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360082:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
     1360089:	00 
     136008a:	e8 59 a7 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     136008f:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]

### call 0x1360b69: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b3d:	00 
     1360b3e:	e8 27 94 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360b43:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1360b4a:	00 
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]

### call 0x1360b73: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b43:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     1360b4a:	00 
     1360b4b:	e8 40 d3 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>

### call 0x1360b80: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b50:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     1360b55:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
     1360b5c:	e8 25 d9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>

### call 0x1360b8d: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b61:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
     1360b68:	00 
     1360b69:	e8 ba 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]

### call 0x1360b9a: call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b6e:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1360b73:	e8 b0 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b78:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
     1360b7f:	00 
     1360b80:	e8 a3 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b85:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
     1360b8c:	00 
     1360b8d:	e8 96 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b92:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1360b99:	00 
     1360b9a:	e8 89 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360b9f:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1360ba6:	00 
     1360ba7:	e8 7c 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bac:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1360bb3:	00 
     1360bb4:	e8 6f 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bb9:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     1360bc0:	e8 c1 d8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1360bc5:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
     1360bcc:	00 
     1360bcd:	e8 56 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bd2:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
     1360bd9:	00 
     1360bda:	e8 49 92 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1360bdf:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
     1360be6:	00 
     1360be7:	e8 88 62 74 ff       	call   aa6e74 <JNI_OnUnload@@Base+0x2e741>
     1360bec:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
     1360bf3:	00 
     1360bf4:	e8 4d 00 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     1360bf9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360c00:	00 00 
     1360c02:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360c09:	00 
     1360c0a:	75 0a                	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360c0c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]

## High-address constants near +0xc8 stores
- store 0x135dcd4; nearby high 0x1869ca8: lea    rcx,[rip+0x50bfd7]        # 1869ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26390>

## Candidate dependency vtable neighborhoods
### AP 0x1869c88; codeSlots=12; +0x68=0x9d7de0
- +0x0: 0x139f094
- +0x8: 0xb7d2a8
- +0x10: 0x0
- +0x18: 0x0
- +0x20: 0x9d7de0
- +0x28: 0xa50370
- +0x30: 0x1360ec6
- +0x38: 0x0
- +0x40: 0x0
- +0x48: 0x13671e0
- +0x50: 0x139f92c
- +0x58: 0xc71834
- +0x60: 0x9d7de0
- +0x68: 0x9d7de0
- +0x70: 0x9d7de0
- +0x78: 0x9d7de0
#### +0x68 body
      9d7dd7:	ff e0                	jmp    rax
      9d7dd9:	cc                   	int3
      9d7dda:	cc                   	int3
      9d7ddb:	cc                   	int3
      9d7ddc:	cc                   	int3
      9d7ddd:	cc                   	int3
      9d7dde:	cc                   	int3
      9d7ddf:	cc                   	int3
      9d7de0:	c3                   	ret
      9d7de1:	cc                   	int3
      9d7de2:	cc                   	int3
      9d7de3:	cc                   	int3
      9d7de4:	cc                   	int3
      9d7de5:	cc                   	int3
      9d7de6:	cc                   	int3
      9d7de7:	cc                   	int3
      9d7de8:	cc                   	int3
      9d7de9:	cc                   	int3
      9d7dea:	cc                   	int3
      9d7deb:	cc                   	int3
      9d7dec:	cc                   	int3
      9d7ded:	cc                   	int3
      9d7dee:	cc                   	int3
      9d7def:	cc                   	int3
      9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
      9d7df4:	0f 94 c0             	sete   al
      9d7df7:	c3                   	ret
      9d7df8:	cc                   	int3
      9d7df9:	cc                   	int3
      9d7dfa:	cc                   	int3
      9d7dfb:	cc                   	int3
      9d7dfc:	cc                   	int3
      9d7dfd:	cc                   	int3
      9d7dfe:	cc                   	int3
      9d7dff:	cc                   	int3
      9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
      9d7e03:	c3                   	ret
      9d7e04:	cc                   	int3
      9d7e05:	cc                   	int3
      9d7e06:	cc                   	int3
      9d7e07:	cc                   	int3
      9d7e08:	cc                   	int3
      9d7e09:	cc                   	int3
      9d7e0a:	cc                   	int3

### AP 0x1869c90; codeSlots=12; +0x68=0x9d7de0
- +0x0: 0xb7d2a8
- +0x8: 0x0
- +0x10: 0x0
- +0x18: 0x9d7de0
- +0x20: 0xa50370
- +0x28: 0x1360ec6
- +0x30: 0x0
- +0x38: 0x0
- +0x40: 0x13671e0
- +0x48: 0x139f92c
- +0x50: 0xc71834
- +0x58: 0x9d7de0
- +0x60: 0x9d7de0
- +0x68: 0x9d7de0
- +0x70: 0x9d7de0
- +0x78: 0x9d81d0
#### +0x68 body
      9d7dd7:	ff e0                	jmp    rax
      9d7dd9:	cc                   	int3
      9d7dda:	cc                   	int3
      9d7ddb:	cc                   	int3
      9d7ddc:	cc                   	int3
      9d7ddd:	cc                   	int3
      9d7dde:	cc                   	int3
      9d7ddf:	cc                   	int3
      9d7de0:	c3                   	ret
      9d7de1:	cc                   	int3
      9d7de2:	cc                   	int3
      9d7de3:	cc                   	int3
      9d7de4:	cc                   	int3
      9d7de5:	cc                   	int3
      9d7de6:	cc                   	int3
      9d7de7:	cc                   	int3
      9d7de8:	cc                   	int3
      9d7de9:	cc                   	int3
      9d7dea:	cc                   	int3
      9d7deb:	cc                   	int3
      9d7dec:	cc                   	int3
      9d7ded:	cc                   	int3
      9d7dee:	cc                   	int3
      9d7def:	cc                   	int3
      9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
      9d7df4:	0f 94 c0             	sete   al
      9d7df7:	c3                   	ret
      9d7df8:	cc                   	int3
      9d7df9:	cc                   	int3
      9d7dfa:	cc                   	int3
      9d7dfb:	cc                   	int3
      9d7dfc:	cc                   	int3
      9d7dfd:	cc                   	int3
      9d7dfe:	cc                   	int3
      9d7dff:	cc                   	int3
      9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
      9d7e03:	c3                   	ret
      9d7e04:	cc                   	int3
      9d7e05:	cc                   	int3
      9d7e06:	cc                   	int3
      9d7e07:	cc                   	int3
      9d7e08:	cc                   	int3
      9d7e09:	cc                   	int3
      9d7e0a:	cc                   	int3

### AP 0x1869c98; codeSlots=12; +0x68=0x9d7de0
- +0x0: 0x0
- +0x8: 0x0
- +0x10: 0x9d7de0
- +0x18: 0xa50370
- +0x20: 0x1360ec6
- +0x28: 0x0
- +0x30: 0x0
- +0x38: 0x13671e0
- +0x40: 0x139f92c
- +0x48: 0xc71834
- +0x50: 0x9d7de0
- +0x58: 0x9d7de0
- +0x60: 0x9d7de0
- +0x68: 0x9d7de0
- +0x70: 0x9d81d0
- +0x78: 0x9d7de0
#### +0x68 body
      9d7dd7:	ff e0                	jmp    rax
      9d7dd9:	cc                   	int3
      9d7dda:	cc                   	int3
      9d7ddb:	cc                   	int3
      9d7ddc:	cc                   	int3
      9d7ddd:	cc                   	int3
      9d7dde:	cc                   	int3
      9d7ddf:	cc                   	int3
      9d7de0:	c3                   	ret
      9d7de1:	cc                   	int3
      9d7de2:	cc                   	int3
      9d7de3:	cc                   	int3
      9d7de4:	cc                   	int3
      9d7de5:	cc                   	int3
      9d7de6:	cc                   	int3
      9d7de7:	cc                   	int3
      9d7de8:	cc                   	int3
      9d7de9:	cc                   	int3
      9d7dea:	cc                   	int3
      9d7deb:	cc                   	int3
      9d7dec:	cc                   	int3
      9d7ded:	cc                   	int3
      9d7dee:	cc                   	int3
      9d7def:	cc                   	int3
      9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
      9d7df4:	0f 94 c0             	sete   al
      9d7df7:	c3                   	ret
      9d7df8:	cc                   	int3
      9d7df9:	cc                   	int3
      9d7dfa:	cc                   	int3
      9d7dfb:	cc                   	int3
      9d7dfc:	cc                   	int3
      9d7dfd:	cc                   	int3
      9d7dfe:	cc                   	int3
      9d7dff:	cc                   	int3
      9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
      9d7e03:	c3                   	ret
      9d7e04:	cc                   	int3
      9d7e05:	cc                   	int3
      9d7e06:	cc                   	int3
      9d7e07:	cc                   	int3
      9d7e08:	cc                   	int3
      9d7e09:	cc                   	int3
      9d7e0a:	cc                   	int3

### AP 0x1869ca0; codeSlots=13; +0x68=0x9d81d0
- +0x0: 0x0
- +0x8: 0x9d7de0
- +0x10: 0xa50370
- +0x18: 0x1360ec6
- +0x20: 0x0
- +0x28: 0x0
- +0x30: 0x13671e0
- +0x38: 0x139f92c
- +0x40: 0xc71834
- +0x48: 0x9d7de0
- +0x50: 0x9d7de0
- +0x58: 0x9d7de0
- +0x60: 0x9d7de0
- +0x68: 0x9d81d0
- +0x70: 0x9d7de0
- +0x78: 0x9d7de0
#### +0x68 body
      9d81c8:	cc                   	int3
      9d81c9:	cc                   	int3
      9d81ca:	cc                   	int3
      9d81cb:	cc                   	int3
      9d81cc:	cc                   	int3
      9d81cd:	cc                   	int3
      9d81ce:	cc                   	int3
      9d81cf:	cc                   	int3
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
      9d81d3:	cc                   	int3
      9d81d4:	cc                   	int3
      9d81d5:	cc                   	int3
      9d81d6:	cc                   	int3
      9d81d7:	cc                   	int3
      9d81d8:	cc                   	int3
      9d81d9:	cc                   	int3
      9d81da:	cc                   	int3
      9d81db:	cc                   	int3
      9d81dc:	cc                   	int3
      9d81dd:	cc                   	int3
      9d81de:	cc                   	int3
      9d81df:	cc                   	int3
      9d81e0:	41 56                	push   r14
      9d81e2:	53                   	push   rbx
      9d81e3:	50                   	push   rax
      9d81e4:	48 89 f3             	mov    rbx,rsi
      9d81e7:	49 89 fe             	mov    r14,rdi
      9d81ea:	ba b8 06 00 00       	mov    edx,0x6b8
      9d81ef:	31 f6                	xor    esi,esi
      9d81f1:	e8 9a 69 e1 00       	call   17eeb90 <memset@plt>
      9d81f6:	48 8d 05 2b be e1 00 	lea    rax,[rip+0xe1be2b]        # 17f4028 <pthread_rwlock_wrlock@plt+0x3268>
      9d81fd:	49 89 06             	mov    QWORD PTR [r14],rax
      9d8200:	48 85 db             	test   rbx,rbx
      9d8203:	75 08                	jne    9d820d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3d>
      9d8205:	e8 96 08 00 00       	call   9d8aa0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8d0>
      9d820a:	48 89 c3             	mov    rbx,rax
      9d820d:	49 89 5e 28          	mov    QWORD PTR [r14+0x28],rbx
      9d8211:	49 c7 46 20 00 08 00 	mov    QWORD PTR [r14+0x20],0x800
      9d8218:	00 
      9d8219:	48 8d 05 60 21 00 01 	lea    rax,[rip+0x1002160]        # 19da380 <__stop_pb_defaults@@Base+0x120>
      9d8220:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      9d8224:	0f 28 05 15 5a 9b ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff9b5a15]        # 38dc40 <_ZTSSt12bad_any_cast@@Base-0x2588>
      9d822b:	0f 29 05 4e 21 00 01 	movaps XMMWORD PTR [rip+0x100214e],xmm0        # 19da380 <__stop_pb_defaults@@Base+0x120>

### AP 0x1869ca8; codeSlots=14; +0x68=0x9d7de0
- +0x0: 0x9d7de0
- +0x8: 0xa50370
- +0x10: 0x1360ec6
- +0x18: 0x0
- +0x20: 0x0
- +0x28: 0x13671e0
- +0x30: 0x139f92c
- +0x38: 0xc71834
- +0x40: 0x9d7de0
- +0x48: 0x9d7de0
- +0x50: 0x9d7de0
- +0x58: 0x9d7de0
- +0x60: 0x9d81d0
- +0x68: 0x9d7de0
- +0x70: 0x9d7de0
- +0x78: 0x9d7de0
#### +0x68 body
      9d7dd7:	ff e0                	jmp    rax
      9d7dd9:	cc                   	int3
      9d7dda:	cc                   	int3
      9d7ddb:	cc                   	int3
      9d7ddc:	cc                   	int3
      9d7ddd:	cc                   	int3
      9d7dde:	cc                   	int3
      9d7ddf:	cc                   	int3
      9d7de0:	c3                   	ret
      9d7de1:	cc                   	int3
      9d7de2:	cc                   	int3
      9d7de3:	cc                   	int3
      9d7de4:	cc                   	int3
      9d7de5:	cc                   	int3
      9d7de6:	cc                   	int3
      9d7de7:	cc                   	int3
      9d7de8:	cc                   	int3
      9d7de9:	cc                   	int3
      9d7dea:	cc                   	int3
      9d7deb:	cc                   	int3
      9d7dec:	cc                   	int3
      9d7ded:	cc                   	int3
      9d7dee:	cc                   	int3
      9d7def:	cc                   	int3
      9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
      9d7df4:	0f 94 c0             	sete   al
      9d7df7:	c3                   	ret
      9d7df8:	cc                   	int3
      9d7df9:	cc                   	int3
      9d7dfa:	cc                   	int3
      9d7dfb:	cc                   	int3
      9d7dfc:	cc                   	int3
      9d7dfd:	cc                   	int3
      9d7dfe:	cc                   	int3
      9d7dff:	cc                   	int3
      9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
      9d7e03:	c3                   	ret
      9d7e04:	cc                   	int3
      9d7e05:	cc                   	int3
      9d7e06:	cc                   	int3
      9d7e07:	cc                   	int3
      9d7e08:	cc                   	int3
      9d7e09:	cc                   	int3
      9d7e0a:	cc                   	int3

### AP 0x1869cb0; codeSlots=14; +0x68=0x9d7de0
- +0x0: 0xa50370
- +0x8: 0x1360ec6
- +0x10: 0x0
- +0x18: 0x0
- +0x20: 0x13671e0
- +0x28: 0x139f92c
- +0x30: 0xc71834
- +0x38: 0x9d7de0
- +0x40: 0x9d7de0
- +0x48: 0x9d7de0
- +0x50: 0x9d7de0
- +0x58: 0x9d81d0
- +0x60: 0x9d7de0
- +0x68: 0x9d7de0
- +0x70: 0x9d7de0
- +0x78: 0x139f3ec
#### +0x68 body
      9d7dd7:	ff e0                	jmp    rax
      9d7dd9:	cc                   	int3
      9d7dda:	cc                   	int3
      9d7ddb:	cc                   	int3
      9d7ddc:	cc                   	int3
      9d7ddd:	cc                   	int3
      9d7dde:	cc                   	int3
      9d7ddf:	cc                   	int3
      9d7de0:	c3                   	ret
      9d7de1:	cc                   	int3
      9d7de2:	cc                   	int3
      9d7de3:	cc                   	int3
      9d7de4:	cc                   	int3
      9d7de5:	cc                   	int3
      9d7de6:	cc                   	int3
      9d7de7:	cc                   	int3
      9d7de8:	cc                   	int3
      9d7de9:	cc                   	int3
      9d7dea:	cc                   	int3
      9d7deb:	cc                   	int3
      9d7dec:	cc                   	int3
      9d7ded:	cc                   	int3
      9d7dee:	cc                   	int3
      9d7def:	cc                   	int3
      9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
      9d7df4:	0f 94 c0             	sete   al
      9d7df7:	c3                   	ret
      9d7df8:	cc                   	int3
      9d7df9:	cc                   	int3
      9d7dfa:	cc                   	int3
      9d7dfb:	cc                   	int3
      9d7dfc:	cc                   	int3
      9d7dfd:	cc                   	int3
      9d7dfe:	cc                   	int3
      9d7dff:	cc                   	int3
      9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
      9d7e03:	c3                   	ret
      9d7e04:	cc                   	int3
      9d7e05:	cc                   	int3
      9d7e06:	cc                   	int3
      9d7e07:	cc                   	int3
      9d7e08:	cc                   	int3
      9d7e09:	cc                   	int3
      9d7e0a:	cc                   	int3

### AP 0x1869cb8; codeSlots=14; +0x68=0x9d7de0
- +0x0: 0x1360ec6
- +0x8: 0x0
- +0x10: 0x0
- +0x18: 0x13671e0
- +0x20: 0x139f92c
- +0x28: 0xc71834
- +0x30: 0x9d7de0
- +0x38: 0x9d7de0
- +0x40: 0x9d7de0
- +0x48: 0x9d7de0
- +0x50: 0x9d81d0
- +0x58: 0x9d7de0
- +0x60: 0x9d7de0
- +0x68: 0x9d7de0
- +0x70: 0x139f3ec
- +0x78: 0x139f65a
#### +0x68 body
      9d7dd7:	ff e0                	jmp    rax
      9d7dd9:	cc                   	int3
      9d7dda:	cc                   	int3
      9d7ddb:	cc                   	int3
      9d7ddc:	cc                   	int3
      9d7ddd:	cc                   	int3
      9d7dde:	cc                   	int3
      9d7ddf:	cc                   	int3
      9d7de0:	c3                   	ret
      9d7de1:	cc                   	int3
      9d7de2:	cc                   	int3
      9d7de3:	cc                   	int3
      9d7de4:	cc                   	int3
      9d7de5:	cc                   	int3
      9d7de6:	cc                   	int3
      9d7de7:	cc                   	int3
      9d7de8:	cc                   	int3
      9d7de9:	cc                   	int3
      9d7dea:	cc                   	int3
      9d7deb:	cc                   	int3
      9d7dec:	cc                   	int3
      9d7ded:	cc                   	int3
      9d7dee:	cc                   	int3
      9d7def:	cc                   	int3
      9d7df0:	83 7f 08 00          	cmp    DWORD PTR [rdi+0x8],0x0
      9d7df4:	0f 94 c0             	sete   al
      9d7df7:	c3                   	ret
      9d7df8:	cc                   	int3
      9d7df9:	cc                   	int3
      9d7dfa:	cc                   	int3
      9d7dfb:	cc                   	int3
      9d7dfc:	cc                   	int3
      9d7dfd:	cc                   	int3
      9d7dfe:	cc                   	int3
      9d7dff:	cc                   	int3
      9d7e00:	8a 47 0c             	mov    al,BYTE PTR [rdi+0xc]
      9d7e03:	c3                   	ret
      9d7e04:	cc                   	int3
      9d7e05:	cc                   	int3
      9d7e06:	cc                   	int3
      9d7e07:	cc                   	int3
      9d7e08:	cc                   	int3
      9d7e09:	cc                   	int3
      9d7e0a:	cc                   	int3

### AP 0x1869cc0; codeSlots=14; +0x68=0x139f3ec
- +0x0: 0x0
- +0x8: 0x0
- +0x10: 0x13671e0
- +0x18: 0x139f92c
- +0x20: 0xc71834
- +0x28: 0x9d7de0
- +0x30: 0x9d7de0
- +0x38: 0x9d7de0
- +0x40: 0x9d7de0
- +0x48: 0x9d81d0
- +0x50: 0x9d7de0
- +0x58: 0x9d7de0
- +0x60: 0x9d7de0
- +0x68: 0x139f3ec
- +0x70: 0x139f65a
- +0x78: 0x9d7de0
#### +0x68 body
     139f3c7:	f2 0f 5e ca          	divsd  xmm1,xmm2
     139f3cb:	f2 0f 5e c8          	divsd  xmm1,xmm0
     139f3cf:	f2 0f 59 0d b1 fa fe 	mulsd  xmm1,QWORD PTR [rip+0xfffffffffefefab1]        # 38ee88 <_ZTSSt12bad_any_cast@@Base-0x1340>
     139f3d6:	fe 
     139f3d7:	66 0f 3a 0b c1 09    	roundsd xmm0,xmm1,0x9
     139f3dd:	f2 48 0f 2c f8       	cvttsd2si rdi,xmm0
     139f3e2:	be a8 ba 06 00       	mov    esi,0x6baa8
     139f3e7:	e9 12 6d 92 ff       	jmp    cc60fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21309e>
     139f3ec:	55                   	push   rbp
     139f3ed:	41 57                	push   r15
     139f3ef:	41 56                	push   r14
     139f3f1:	41 55                	push   r13
     139f3f3:	41 54                	push   r12
     139f3f5:	53                   	push   rbx
     139f3f6:	48 83 ec 68          	sub    rsp,0x68
     139f3fa:	49 89 d4             	mov    r12,rdx
     139f3fd:	49 89 f5             	mov    r13,rsi
     139f400:	48 89 fb             	mov    rbx,rdi
     139f403:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139f40a:	00 00 
     139f40c:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     139f411:	48 83 c7 08          	add    rdi,0x8
     139f415:	4c 8d be 20 01 00 00 	lea    r15,[rsi+0x120]
     139f41c:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
     139f420:	4c 89 fe             	mov    rsi,r15
     139f423:	e8 20 af fb ff       	call   135a348 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f8cc>
     139f428:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
     139f42d:	48 83 c3 10          	add    rbx,0x10
     139f431:	48 39 d8             	cmp    rax,rbx
     139f434:	0f 85 98 01 00 00    	jne    139f5d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4b56>
     139f43a:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     139f43e:	4c 89 ef             	mov    rdi,r13
     139f441:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     139f447:	41 89 c5             	mov    r13d,eax
     139f44a:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
     139f44f:	48 89 44 24 57       	mov    QWORD PTR [rsp+0x57],rax
     139f454:	41 0f 10 44 24 08    	movups xmm0,XMMWORD PTR [r12+0x8]
     139f45a:	41 0f 10 4c 24 18    	movups xmm1,XMMWORD PTR [r12+0x18]
     139f460:	0f 11 4c 24 47       	movups XMMWORD PTR [rsp+0x47],xmm1
     139f465:	0f 11 44 24 37       	movups XMMWORD PTR [rsp+0x37],xmm0
     139f46a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     139f46d:	48 89 dd             	mov    rbp,rbx
     139f470:	49 89 de             	mov    r14,rbx
     139f473:	48 85 c0             	test   rax,rax

### AP 0x1869cc8; codeSlots=15; +0x68=0x139f65a
- +0x0: 0x0
- +0x8: 0x13671e0
- +0x10: 0x139f92c
- +0x18: 0xc71834
- +0x20: 0x9d7de0
- +0x28: 0x9d7de0
- +0x30: 0x9d7de0
- +0x38: 0x9d7de0
- +0x40: 0x9d81d0
- +0x48: 0x9d7de0
- +0x50: 0x9d7de0
- +0x58: 0x9d7de0
- +0x60: 0x139f3ec
- +0x68: 0x139f65a
- +0x70: 0x9d7de0
- +0x78: 0x139f7c6
#### +0x68 body
     139f638:	e8 55 c5 75 ff       	call   afbb92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48b32>
     139f63d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139f644:	00 00 
     139f646:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     139f64b:	75 08                	jne    139f655 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4bd9>
     139f64d:	48 89 df             	mov    rdi,rbx
     139f650:	e8 7b 06 6d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     139f655:	e8 56 04 45 00       	call   17efab0 <__stack_chk_fail@plt>
     139f65a:	41 57                	push   r15
     139f65c:	41 56                	push   r14
     139f65e:	53                   	push   rbx
     139f65f:	48 83 ec 40          	sub    rsp,0x40
     139f663:	49 89 d6             	mov    r14,rdx
     139f666:	48 89 f3             	mov    rbx,rsi
     139f669:	49 89 ff             	mov    r15,rdi
     139f66c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139f673:	00 00 
     139f675:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     139f67a:	48 81 c6 20 01 00 00 	add    rsi,0x120
     139f681:	48 83 c7 08          	add    rdi,0x8
     139f685:	e8 1d 01 00 00       	call   139f7a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4d2b>
     139f68a:	48 85 c0             	test   rax,rax
     139f68d:	74 3f                	je     139f6ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4c52>
     139f68f:	48 89 c1             	mov    rcx,rax
     139f692:	48 83 c1 30          	add    rcx,0x30
     139f696:	49 83 c6 08          	add    r14,0x8
     139f69a:	80 78 58 00          	cmp    BYTE PTR [rax+0x58],0x0
     139f69e:	74 47                	je     139f6e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4c6b>
     139f6a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139f6a7:	00 00 
     139f6a9:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     139f6ae:	0f 85 ee 00 00 00    	jne    139f7a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4d26>
     139f6b4:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     139f6b8:	41 0f 10 4e 10       	movups xmm1,XMMWORD PTR [r14+0x10]
     139f6bd:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
     139f6c1:	48 89 41 20          	mov    QWORD PTR [rcx+0x20],rax
     139f6c5:	0f 11 49 10          	movups XMMWORD PTR [rcx+0x10],xmm1
     139f6c9:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     139f6cc:	eb 6e                	jmp    139f73c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4cc0>
     139f6ce:	49 83 7f 18 00       	cmp    QWORD PTR [r15+0x18],0x0
     139f6d3:	75 71                	jne    139f746 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4cca>
     139f6d5:	f6 83 20 01 00 00 01 	test   BYTE PTR [rbx+0x120],0x1
     139f6dc:	74 27                	je     139f705 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e4c89>
     139f6de:	48 8b 9b 30 01 00 00 	mov    rbx,QWORD PTR [rbx+0x130]

## Allocation/vptr pairs in constructor
### allocation @0x135d4ee
     135d4d3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4d6:	e8 fb f7 95 ff       	call   cbccd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209c76>
     135d4db:	89 44 24 58          	mov    DWORD PTR [rsp+0x58],eax
     135d4df:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4e2:	e8 b3 fa 95 ff       	call   cbcf9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209f3a>
     135d4e7:	89 44 24 50          	mov    DWORD PTR [rsp+0x50],eax
     135d4eb:	6a 10                	push   0x10
     135d4ed:	5f                   	pop    rdi
     135d4ee:	e8 0d 0a 49 00       	call   17edf00 <_Znwm@plt>
     135d4f3:	49 89 c6             	mov    r14,rax
     135d4f6:	48 8d 35 75 a1 00 ff 	lea    rsi,[rip+0xffffffffff00a175]        # 367672 <_ZTSSt12bad_any_cast@@Base-0x28b56>
     135d4fd:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     135d504:	00 
     135d505:	e8 74 c5 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135d50a:	48 8d 94 24 d0 0a 00 	lea    rdx,[rsp+0xad0]
     135d511:	00 
     135d512:	48 83 62 20 00       	and    QWORD PTR [rdx+0x20],0x0
     135d517:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135d51e:	00 
     135d51f:	4c 89 f7             	mov    rdi,r14
     135d522:	e8 fd 53 2b 00       	call   1612924 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xda92>
     135d527:	48 8d 9c 24 60 0f 00 	lea    rbx,[rsp+0xf60]
     135d52e:	00 
     135d52f:	48 83 23 00          	and    QWORD PTR [rbx],0x0
     135d533:	4c 89 ef             	mov    rdi,r13
     135d536:	4c 89 f6             	mov    rsi,r14
     135d539:	e8 de 36 00 00       	call   1360c1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61a0>
     135d53e:	48 89 df             	mov    rdi,rbx
     135d541:	e8 00 37 00 00       	call   1360c46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a61ca>
     135d546:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d54d:	00 
     135d54e:	e8 17 ca 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135d553:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     135d55a:	00 
     135d55b:	e8 30 09 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     135d560:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135d564:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d567:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135d56a:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135d571:	00 
     135d572:	49 89 c6             	mov    r14,rax
     135d575:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     135d579:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d57c:	ff 50 10             	call   QWORD PTR [rax+0x10]

### allocation @0x135d76f
     135d74b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135d750:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
     135d754:	48 8d b4 24 40 0e 00 	lea    rsi,[rsp+0xe40]
     135d75b:	00 
     135d75c:	e8 99 7c 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135d761:	48 83 a4 24 c0 09 00 	and    QWORD PTR [rsp+0x9c0],0x0
     135d768:	00 00 
     135d76a:	bf 40 01 00 00       	mov    edi,0x140
     135d76f:	e8 8c 07 49 00       	call   17edf00 <_Znwm@plt>
     135d774:	49 89 c5             	mov    r13,rax
     135d777:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135d77e:	00 
     135d77f:	48 8d 84 24 20 03 00 	lea    rax,[rsp+0x320]
     135d786:	00 
     135d787:	48 89 84 24 68 0f 00 	mov    QWORD PTR [rsp+0xf68],rax
     135d78e:	00 
     135d78f:	48 c7 84 24 70 0f 00 	mov    QWORD PTR [rsp+0xf70],0x1
     135d796:	00 01 00 00 00 
     135d79b:	48 8d 05 46 a5 50 00 	lea    rax,[rip+0x50a546]        # 1867ce8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x243d0>
     135d7a2:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     135d7a6:	66 0f 6f 84 24 d0 0a 	movdqa xmm0,XMMWORD PTR [rsp+0xad0]
     135d7ad:	00 00 
     135d7af:	0f 28 8c 24 e0 0a 00 	movaps xmm1,XMMWORD PTR [rsp+0xae0]
     135d7b6:	00 
     135d7b7:	66 41 0f 7f 45 10    	movdqa XMMWORD PTR [r13+0x10],xmm0
     135d7bd:	41 0f 29 4d 20       	movaps XMMWORD PTR [r13+0x20],xmm1
     135d7c2:	49 8d 5d 30          	lea    rbx,[r13+0x30]
     135d7c6:	48 89 df             	mov    rdi,rbx
     135d7c9:	4c 89 fe             	mov    rsi,r15
     135d7cc:	e8 bf ca 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135d7d1:	48 8b 84 24 20 0b 00 	mov    rax,QWORD PTR [rsp+0xb20]
     135d7d8:	00 
     135d7d9:	49 89 45 60          	mov    QWORD PTR [r13+0x60],rax
     135d7dd:	4d 8d 7d 68          	lea    r15,[r13+0x68]
     135d7e1:	4c 89 ff             	mov    rdi,r15
     135d7e4:	4c 89 f6             	mov    rsi,r14
     135d7e7:	e8 54 07 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     135d7ec:	4c 89 ef             	mov    rdi,r13
     135d7ef:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
     135d7f3:	4c 89 e6             	mov    rsi,r12
     135d7f6:	e8 a3 fe 95 ff       	call   cbd69e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a63e>
     135d7fb:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135d802:	00 
     135d803:	66 0f 6f 83 20 01 00 	movdqa xmm0,XMMWORD PTR [rbx+0x120]

### allocation @0x135d872
     135d855:	e8 b2 7b 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     135d85a:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
     135d861:	00 
     135d862:	4c 89 f7             	mov    rdi,r14
     135d865:	e8 44 eb 76 ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     135d86a:	6a 20                	push   0x20
     135d86c:	5f                   	pop    rdi
     135d86d:	48 8b 5c 24 78       	mov    rbx,QWORD PTR [rsp+0x78]
     135d872:	e8 89 06 49 00       	call   17edf00 <_Znwm@plt>
     135d877:	66 0f ef c0          	pxor   xmm0,xmm0
     135d87b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135d880:	48 8d 0d 49 30 4a 00 	lea    rcx,[rip+0x4a3049]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
     135d887:	48 89 08             	mov    QWORD PTR [rax],rcx
     135d88a:	48 89 c1             	mov    rcx,rax
     135d88d:	48 83 c1 18          	add    rcx,0x18
     135d891:	48 8d 15 58 a5 50 00 	lea    rdx,[rip+0x50a558]        # 1867df0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x244d8>
     135d898:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     135d89c:	48 89 8b 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rcx
     135d8a3:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
     135d8aa:	48 89 83 98 00 00 00 	mov    QWORD PTR [rbx+0x98],rax
     135d8b1:	e8 d0 0b 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135d8b6:	c7 84 24 d0 01 00 00 	mov    DWORD PTR [rsp+0x1d0],0x64
     135d8bd:	64 00 00 00 
     135d8c1:	66 c7 84 24 d4 01 00 	mov    WORD PTR [rsp+0x1d4],0x101
     135d8c8:	00 01 01 
     135d8cb:	c6 84 24 d6 01 00 00 	mov    BYTE PTR [rsp+0x1d6],0x0
     135d8d2:	00 
     135d8d3:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135d8da:	00 
     135d8db:	48 8b b4 24 f0 10 00 	mov    rsi,QWORD PTR [rsp+0x10f0]
     135d8e2:	00 
     135d8e3:	e8 68 fe 95 ff       	call   cbd750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a6f0>
     135d8e8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135d8ed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d8f0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135d8f3:	48 89 c5             	mov    rbp,rax
     135d8f6:	bf 60 01 00 00       	mov    edi,0x160
     135d8fb:	e8 00 06 49 00       	call   17edf00 <_Znwm@plt>
     135d900:	49 89 c5             	mov    r13,rax
     135d903:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d90a:	00 
     135d90b:	48 8d b4 24 a0 09 00 	lea    rsi,[rsp+0x9a0]
     135d912:	00 
     135d913:	e8 78 c9 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>

### allocation @0x135d8fb
     135d8db:	48 8b b4 24 f0 10 00 	mov    rsi,QWORD PTR [rsp+0x10f0]
     135d8e2:	00 
     135d8e3:	e8 68 fe 95 ff       	call   cbd750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a6f0>
     135d8e8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135d8ed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135d8f0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135d8f3:	48 89 c5             	mov    rbp,rax
     135d8f6:	bf 60 01 00 00       	mov    edi,0x160
     135d8fb:	e8 00 06 49 00       	call   17edf00 <_Znwm@plt>
     135d900:	49 89 c5             	mov    r13,rax
     135d903:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d90a:	00 
     135d90b:	48 8d b4 24 a0 09 00 	lea    rsi,[rsp+0x9a0]
     135d912:	00 
     135d913:	e8 78 c9 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135d918:	48 8d 05 c1 0f 4b 00 	lea    rax,[rip+0x4b0fc1]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135d91f:	48 89 84 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],rax
     135d926:	00 
     135d927:	48 8b 05 7a 41 55 00 	mov    rax,QWORD PTR [rip+0x55417a]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
     135d92e:	48 89 84 24 a8 05 00 	mov    QWORD PTR [rsp+0x5a8],rax
     135d935:	00 
     135d936:	4c 89 b4 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r14
     135d93d:	00 
     135d93e:	48 8d 05 6b a5 50 00 	lea    rax,[rip+0x50a56b]        # 1867eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24598>
     135d945:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135d94c:	00 
     135d94d:	4c 89 bc 24 80 0f 00 	mov    QWORD PTR [rsp+0xf80],r15
     135d954:	00 
     135d955:	48 8b 9c 24 b0 0d 00 	mov    rbx,QWORD PTR [rsp+0xdb0]
     135d95c:	00 
     135d95d:	4c 8b b4 24 b8 0d 00 	mov    r14,QWORD PTR [rsp+0xdb8]
     135d964:	00 
     135d965:	48 89 9c 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rbx
     135d96c:	00 
     135d96d:	4c 89 b4 24 28 03 00 	mov    QWORD PTR [rsp+0x328],r14
     135d974:	00 
     135d975:	4c 8b a4 24 c0 0d 00 	mov    r12,QWORD PTR [rsp+0xdc0]
     135d97c:	00 
     135d97d:	4c 89 a4 24 30 03 00 	mov    QWORD PTR [rsp+0x330],r12
     135d984:	00 
     135d985:	66 0f ef c0          	pxor   xmm0,xmm0
     135d989:	48 83 a4 24 c0 0d 00 	and    QWORD PTR [rsp+0xdc0],0x0
     135d990:	00 00 
     135d992:	66 0f 7f 84 24 b0 0d 	movdqa XMMWORD PTR [rsp+0xdb0],xmm0

### allocation @0x135d9a7
     135d989:	48 83 a4 24 c0 0d 00 	and    QWORD PTR [rsp+0xdc0],0x0
     135d990:	00 00 
     135d992:	66 0f 7f 84 24 b0 0d 	movdqa XMMWORD PTR [rsp+0xdb0],xmm0
     135d999:	00 00 
     135d99b:	48 83 a4 24 60 0e 00 	and    QWORD PTR [rsp+0xe60],0x0
     135d9a2:	00 00 
     135d9a4:	6a 20                	push   0x20
     135d9a6:	5f                   	pop    rdi
     135d9a7:	e8 54 05 49 00       	call   17edf00 <_Znwm@plt>
     135d9ac:	48 8d 0d 45 a5 50 00 	lea    rcx,[rip+0x50a545]        # 1867ef8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x245e0>
     135d9b3:	48 89 08             	mov    QWORD PTR [rax],rcx
     135d9b6:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     135d9ba:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     135d9be:	4c 89 60 18          	mov    QWORD PTR [rax+0x18],r12
     135d9c2:	4c 8d b4 24 20 03 00 	lea    r14,[rsp+0x320]
     135d9c9:	00 
     135d9ca:	66 0f ef c0          	pxor   xmm0,xmm0
     135d9ce:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     135d9d3:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     135d9d8:	48 89 84 24 60 0e 00 	mov    QWORD PTR [rsp+0xe60],rax
     135d9df:	00 
     135d9e0:	48 8d b4 24 d0 01 00 	lea    rsi,[rsp+0x1d0]
     135d9e7:	00 
     135d9e8:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
     135d9ef:	00 
     135d9f0:	4c 8d a4 24 a0 05 00 	lea    r12,[rsp+0x5a0]
     135d9f7:	00 
     135d9f8:	4c 89 ef             	mov    rdi,r13
     135d9fb:	48 89 da             	mov    rdx,rbx
     135d9fe:	48 8b 8c 24 98 10 00 	mov    rcx,QWORD PTR [rsp+0x1098]
     135da05:	00 
     135da06:	4d 89 e0             	mov    r8,r12
     135da09:	4c 8b 8c 24 70 10 00 	mov    r9,QWORD PTR [rsp+0x1070]
     135da10:	00 
     135da11:	ff 74 24 10          	push   QWORD PTR [rsp+0x10]
     135da15:	55                   	push   rbp
     135da16:	48 8d ac 24 50 0e 00 	lea    rbp,[rsp+0xe50]
     135da1d:	00 
     135da1e:	55                   	push   rbp
     135da1f:	41 57                	push   r15
     135da21:	e8 be 56 0c 00       	call   14230e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268668>
     135da26:	48 83 c4 20          	add    rsp,0x20
     135da2a:	48 89 ef             	mov    rdi,rbp
     135da2d:	e8 38 c5 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### allocation @0x135db7b
     135db59:	e8 40 14 97 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     135db5e:	49 89 ac 24 c0 00 00 	mov    QWORD PTR [r12+0xc0],rbp
     135db65:	00 
     135db66:	66 89 9c 24 50 08 00 	mov    WORD PTR [rsp+0x850],bx
     135db6d:	00 
     135db6e:	44 88 ac 24 52 08 00 	mov    BYTE PTR [rsp+0x852],r13b
     135db75:	00 
     135db76:	bf c0 00 00 00       	mov    edi,0xc0
     135db7b:	e8 80 03 49 00       	call   17edf00 <_Znwm@plt>
     135db80:	48 89 c5             	mov    rbp,rax
     135db83:	48 8d 05 a6 a1 50 00 	lea    rax,[rip+0x50a1a6]        # 1867d30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24418>
     135db8a:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135db91:	00 
     135db92:	4c 89 bc 24 80 0f 00 	mov    QWORD PTR [rsp+0xf80],r15
     135db99:	00 
     135db9a:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135dba1:	00 
     135dba2:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135dba9:	00 
     135dbaa:	e8 cf 30 00 00       	call   1360c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6202>
     135dbaf:	48 83 a4 24 60 0e 00 	and    QWORD PTR [rsp+0xe60],0x0
     135dbb6:	00 00 
     135dbb8:	bf 30 01 00 00       	mov    edi,0x130
     135dbbd:	e8 3e 03 49 00       	call   17edf00 <_Znwm@plt>
     135dbc2:	48 89 c3             	mov    rbx,rax
     135dbc5:	48 8d 05 ac a1 50 00 	lea    rax,[rip+0x50a1ac]        # 1867d78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24460>
     135dbcc:	48 89 03             	mov    QWORD PTR [rbx],rax
     135dbcf:	48 89 df             	mov    rdi,rbx
     135dbd2:	48 83 c7 10          	add    rdi,0x10
     135dbd6:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135dbdd:	00 
     135dbde:	e8 9b 30 00 00       	call   1360c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6202>
     135dbe3:	4c 8d bc 24 40 0e 00 	lea    r15,[rsp+0xe40]
     135dbea:	00 
     135dbeb:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
     135dbef:	48 8d 05 ea 0c 4b 00 	lea    rax,[rip+0x4b0cea]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135dbf6:	48 89 84 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rax
     135dbfd:	00 
     135dbfe:	48 8b 05 a3 3e 55 00 	mov    rax,QWORD PTR [rip+0x553ea3]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
     135dc05:	48 89 84 24 28 03 00 	mov    QWORD PTR [rsp+0x328],rax
     135dc0c:	00 
     135dc0d:	4c 89 b4 24 40 03 00 	mov    QWORD PTR [rsp+0x340],r14
     135dc14:	00 
     135dc15:	48 83 ec 08          	sub    rsp,0x8

### allocation @0x135dbbd
     135db9a:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135dba1:	00 
     135dba2:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135dba9:	00 
     135dbaa:	e8 cf 30 00 00       	call   1360c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6202>
     135dbaf:	48 83 a4 24 60 0e 00 	and    QWORD PTR [rsp+0xe60],0x0
     135dbb6:	00 00 
     135dbb8:	bf 30 01 00 00       	mov    edi,0x130
     135dbbd:	e8 3e 03 49 00       	call   17edf00 <_Znwm@plt>
     135dbc2:	48 89 c3             	mov    rbx,rax
     135dbc5:	48 8d 05 ac a1 50 00 	lea    rax,[rip+0x50a1ac]        # 1867d78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24460>
     135dbcc:	48 89 03             	mov    QWORD PTR [rbx],rax
     135dbcf:	48 89 df             	mov    rdi,rbx
     135dbd2:	48 83 c7 10          	add    rdi,0x10
     135dbd6:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135dbdd:	00 
     135dbde:	e8 9b 30 00 00       	call   1360c7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6202>
     135dbe3:	4c 8d bc 24 40 0e 00 	lea    r15,[rsp+0xe40]
     135dbea:	00 
     135dbeb:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
     135dbef:	48 8d 05 ea 0c 4b 00 	lea    rax,[rip+0x4b0cea]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135dbf6:	48 89 84 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rax
     135dbfd:	00 
     135dbfe:	48 8b 05 a3 3e 55 00 	mov    rax,QWORD PTR [rip+0x553ea3]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
     135dc05:	48 89 84 24 28 03 00 	mov    QWORD PTR [rsp+0x328],rax
     135dc0c:	00 
     135dc0d:	4c 89 b4 24 40 03 00 	mov    QWORD PTR [rsp+0x340],r14
     135dc14:	00 
     135dc15:	48 83 ec 08          	sub    rsp,0x8
     135dc19:	48 8d 9c 24 68 0f 00 	lea    rbx,[rsp+0xf68]
     135dc20:	00 
     135dc21:	48 89 ef             	mov    rdi,rbp
     135dc24:	48 8b b4 24 a0 10 00 	mov    rsi,QWORD PTR [rsp+0x10a0]
     135dc2b:	00 
     135dc2c:	48 8b 94 24 78 10 00 	mov    rdx,QWORD PTR [rsp+0x1078]
     135dc33:	00 
     135dc34:	48 89 d9             	mov    rcx,rbx
     135dc37:	4d 89 f8             	mov    r8,r15
     135dc3a:	4d 89 f1             	mov    r9,r14
     135dc3d:	48 8d 84 24 58 08 00 	lea    rax,[rsp+0x858]
     135dc44:	00 
     135dc45:	50                   	push   rax
     135dc46:	e8 e9 08 0d 00       	call   142e534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x273ab8>
     135dc4b:	48 83 c4 10          	add    rsp,0x10

### allocation @0x135dcb6
     135dc9e:	74 06                	je     135dca6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a322a>
     135dca0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dca3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dca6:	48 8d bc 24 e0 08 00 	lea    rdi,[rsp+0x8e0]
     135dcad:	00 
     135dcae:	e8 b3 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dcb3:	6a 08                	push   0x8
     135dcb5:	5f                   	pop    rdi
     135dcb6:	e8 45 02 49 00       	call   17edf00 <_Znwm@plt>
     135dcbb:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135dcc0:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     135dcc5:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135dcca:	48 8d 0d d7 bf 50 00 	lea    rcx,[rip+0x50bfd7]        # 1869ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26390>
     135dcd1:	48 89 08             	mov    QWORD PTR [rax],rcx
     135dcd4:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     135dcdb:	00 
     135dcdc:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135dcdf:	48 89 01             	mov    QWORD PTR [rcx],rax
     135dce2:	48 85 ff             	test   rdi,rdi
     135dce5:	74 06                	je     135dced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3271>
     135dce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcea:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dced:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135dcf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcf5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dcf8:	49 89 c4             	mov    r12,rax
     135dcfb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dcfe:	4c 89 ff             	mov    rdi,r15
     135dd01:	ff 50 40             	call   QWORD PTR [rax+0x40]
     135dd04:	49 89 c5             	mov    r13,rax
     135dd07:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dd0a:	4c 89 ff             	mov    rdi,r15
     135dd0d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135dd10:	48 8d bc 24 b0 08 00 	lea    rdi,[rsp+0x8b0]
     135dd17:	00 
     135dd18:	48 89 c6             	mov    rsi,rax
     135dd1b:	e8 70 c5 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135dd20:	48 8b b4 24 68 10 00 	mov    rsi,QWORD PTR [rsp+0x1068]
     135dd27:	00 
     135dd28:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     135dd2b:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
     135dd32:	00 
     135dd33:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135dd36:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### allocation @0x135dd9e
     135dd87:	48 89 c6             	mov    rsi,rax
     135dd8a:	e8 01 c5 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135dd8f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135dd92:	48 89 df             	mov    rdi,rbx
     135dd95:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dd98:	48 89 c3             	mov    rbx,rax
     135dd9b:	6a 10                	push   0x10
     135dd9d:	5f                   	pop    rdi
     135dd9e:	e8 5d 01 49 00       	call   17edf00 <_Znwm@plt>
     135dda3:	48 8d 0d 96 a1 50 00 	lea    rcx,[rip+0x50a196]        # 1867f40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24628>
     135ddaa:	48 89 08             	mov    QWORD PTR [rax],rcx
     135ddad:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     135ddb1:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
     135ddb8:	00 
     135ddb9:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135ddbc:	48 89 01             	mov    QWORD PTR [rcx],rax
     135ddbf:	48 85 ff             	test   rdi,rdi
     135ddc2:	74 06                	je     135ddca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a334e>
     135ddc4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ddc7:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135ddca:	41 80 7e 04 00       	cmp    BYTE PTR [r14+0x4],0x0
     135ddcf:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135ddd6:	00 
     135ddd7:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
     135dddc:	4c 89 6c 24 68       	mov    QWORD PTR [rsp+0x68],r13
     135dde1:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
     135dde6:	74 30                	je     135de18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a339c>
     135dde8:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     135ddec:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     135ddf3:	00 
     135ddf4:	b8 d0 07 00 00       	mov    eax,0x7d0
     135ddf9:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     135de00:	00 
     135de01:	6a 01                	push   0x1
     135de03:	58                   	pop    rax
     135de04:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
     135de0b:	c7 84 24 98 00 00 00 	mov    DWORD PTR [rsp+0x98],0x0
     135de12:	00 00 00 00 
     135de16:	eb 2e                	jmp    135de46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a33ca>
     135de18:	b0 01                	mov    al,0x1
     135de1a:	89 84 24 98 00 00 00 	mov    DWORD PTR [rsp+0x98],eax
     135de21:	b8 a0 0f 00 00       	mov    eax,0xfa0
     135de26:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     135de2d:	00 

### allocation @0x135df16
     135def8:	48 89 ea             	mov    rdx,rbp
     135defb:	4c 89 f1             	mov    rcx,r14
     135defe:	4d 89 e8             	mov    r8,r13
     135df01:	41 b9 10 27 00 00    	mov    r9d,0x2710
     135df07:	e8 1e 95 28 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     135df0c:	89 84 24 e8 00 00 00 	mov    DWORD PTR [rsp+0xe8],eax
     135df13:	6a 28                	push   0x28
     135df15:	5f                   	pop    rdi
     135df16:	e8 e5 ff 48 00       	call   17edf00 <_Znwm@plt>
     135df1b:	49 89 c7             	mov    r15,rax
     135df1e:	66 0f ef c0          	pxor   xmm0,xmm0
     135df22:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135df27:	48 8d 05 a2 29 4a 00 	lea    rax,[rip+0x4a29a2]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
     135df2e:	49 89 07             	mov    QWORD PTR [r15],rax
     135df31:	48 8d 05 30 a0 50 00 	lea    rax,[rip+0x50a030]        # 1867f68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24650>
     135df38:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     135df3c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135df41:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     135df45:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     135df4c:	00 
     135df4d:	48 89 df             	mov    rdi,rbx
     135df50:	48 8b b4 24 e0 10 00 	mov    rsi,QWORD PTR [rsp+0x10e0]
     135df57:	00 
     135df58:	e8 9d 74 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135df5d:	48 8d ac 24 a8 05 00 	lea    rbp,[rsp+0x5a8]
     135df64:	00 
     135df65:	4c 8b 64 24 78       	mov    r12,QWORD PTR [rsp+0x78]
     135df6a:	4c 89 65 f8          	mov    QWORD PTR [rbp-0x8],r12
     135df6e:	48 89 ef             	mov    rdi,rbp
     135df71:	48 89 de             	mov    rsi,rbx
     135df74:	e8 81 74 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135df79:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135df80:	00 
     135df81:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     135df85:	48 8b 84 24 a0 10 00 	mov    rax,QWORD PTR [rsp+0x10a0]
     135df8c:	00 
     135df8d:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     135df91:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135df98:	00 
     135df99:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     135df9d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     135dfa2:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     135dfa6:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     135dfab:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax

### allocation @0x135e453
     135e430:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135e435:	48 8b 84 24 10 11 00 	mov    rax,QWORD PTR [rsp+0x1110]
     135e43c:	00 
     135e43d:	48 89 84 24 68 05 00 	mov    QWORD PTR [rsp+0x568],rax
     135e444:	00 
     135e445:	48 83 a4 24 90 05 00 	and    QWORD PTR [rsp+0x590],0x0
     135e44c:	00 00 
     135e44e:	bf b0 01 00 00       	mov    edi,0x1b0
     135e453:	e8 a8 fa 48 00       	call   17edf00 <_Znwm@plt>
     135e458:	48 89 c3             	mov    rbx,rax
     135e45b:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135e462:	00 
     135e463:	4c 89 a4 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],r12
     135e46a:	00 
     135e46b:	48 c7 84 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],0x1
     135e472:	00 01 00 00 00 
     135e477:	48 8d 05 2a 9b 50 00 	lea    rax,[rip+0x509b2a]        # 1867fa8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24690>
     135e47e:	48 89 03             	mov    QWORD PTR [rbx],rax
     135e481:	48 8b 84 24 d0 03 00 	mov    rax,QWORD PTR [rsp+0x3d0]
     135e488:	00 
     135e489:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     135e48d:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
     135e491:	4c 89 fe             	mov    rsi,r15
     135e494:	e8 4d eb 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135e499:	4c 8d bc 24 a0 04 00 	lea    r15,[rsp+0x4a0]
     135e4a0:	00 
     135e4a1:	48 89 df             	mov    rdi,rbx
     135e4a4:	48 81 c7 e0 00 00 00 	add    rdi,0xe0
     135e4ab:	ba a0 00 00 00       	mov    edx,0xa0
     135e4b0:	4c 89 fe             	mov    rsi,r15
     135e4b3:	e8 18 16 49 00       	call   17efad0 <memcpy@plt>
     135e4b8:	66 41 0f 6f 87 a0 00 	movdqa xmm0,XMMWORD PTR [r15+0xa0]
     135e4bf:	00 00 
     135e4c1:	f3 0f 7f 83 80 01 00 	movdqu XMMWORD PTR [rbx+0x180],xmm0
     135e4c8:	00 
     135e4c9:	49 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [r15+0xb0]
     135e4d0:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
     135e4d7:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     135e4dc:	66 0f ef c0          	pxor   xmm0,xmm0
     135e4e0:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
     135e4e5:	41 0f 10 8f b8 00 00 	movups xmm1,XMMWORD PTR [r15+0xb8]
     135e4ec:	00 
     135e4ed:	0f 11 8b 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm1
     135e4f4:	f3 41 0f 7f 87 b8 00 	movdqu XMMWORD PTR [r15+0xb8],xmm0

### allocation @0x135e536
     135e513:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135e517:	48 89 9c 24 90 05 00 	mov    QWORD PTR [rsp+0x590],rbx
     135e51e:	00 
     135e51f:	e8 a6 bd 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135e524:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
     135e52b:	00 
     135e52c:	e8 a1 27 00 00       	call   1360cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6256>
     135e531:	bf 10 02 00 00       	mov    edi,0x210
     135e536:	e8 c5 f9 48 00       	call   17edf00 <_Znwm@plt>
     135e53b:	49 89 c4             	mov    r12,rax
     135e53e:	48 8b 84 24 f8 10 00 	mov    rax,QWORD PTR [rsp+0x10f8]
     135e545:	00 
     135e546:	48 8d 70 30          	lea    rsi,[rax+0x30]
     135e54a:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135e551:	00 
     135e552:	e8 39 bd 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135e557:	48 8d 05 1a a7 50 00 	lea    rax,[rip+0x50a71a]        # 1868c78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25360>
     135e55e:	49 89 04 24          	mov    QWORD PTR [r12],rax
     135e562:	66 0f ef c0          	pxor   xmm0,xmm0
     135e566:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
     135e56d:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
     135e572:	e8 35 aa cf ff       	call   1058fac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2203c2>
     135e577:	66 0f ef c0          	pxor   xmm0,xmm0
     135e57b:	66 41 0f 7f 44 24 50 	movdqa XMMWORD PTR [r12+0x50],xmm0
     135e582:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
     135e589:	f3 41 0f 7f 44 24 28 	movdqu XMMWORD PTR [r12+0x28],xmm0
     135e590:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
     135e596:	41 c7 44 24 60 00 00 	mov    DWORD PTR [r12+0x60],0x3f800000
     135e59d:	80 3f 
     135e59f:	31 db                	xor    ebx,ebx
     135e5a1:	41 88 5c 24 68       	mov    BYTE PTR [r12+0x68],bl
     135e5a6:	41 88 9c 24 98 00 00 	mov    BYTE PTR [r12+0x98],bl
     135e5ad:	00 
     135e5ae:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135e5b5:	00 
     135e5b6:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
     135e5bd:	00 
     135e5be:	48 8b 84 24 90 10 00 	mov    rax,QWORD PTR [rsp+0x1090]
     135e5c5:	00 
     135e5c6:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax
     135e5cd:	00 
     135e5ce:	4d 8d bc 24 d0 00 00 	lea    r15,[r12+0xd0]
     135e5d5:	00 
     135e5d6:	66 41 0f 7f 84 24 b0 	movdqa XMMWORD PTR [r12+0xb0],xmm0

### allocation @0x135eb16
     135eaf9:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
     135eb00:	00 
     135eb01:	e8 80 f9 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135eb06:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135eb0d:	00 
     135eb0e:	e8 f9 84 7e ff       	call   b4700c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93fac>
     135eb13:	6a 10                	push   0x10
     135eb15:	5f                   	pop    rdi
     135eb16:	e8 e5 f3 48 00       	call   17edf00 <_Znwm@plt>
     135eb1b:	48 8d 0d ce a1 50 00 	lea    rcx,[rip+0x50a1ce]        # 1868cf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x253d8>
     135eb22:	48 89 08             	mov    QWORD PTR [rax],rcx
     135eb25:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
     135eb29:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
     135eb30:	00 
     135eb31:	48 89 c6             	mov    rsi,rax
     135eb34:	e8 dd 0d 37 00       	call   16cf916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83a82>
     135eb39:	48 8d 35 43 67 fc fe 	lea    rsi,[rip+0xfffffffffefc6743]        # 325283 <_ZTSSt12bad_any_cast@@Base-0x6af45>
     135eb40:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135eb47:	00 
     135eb48:	e8 31 af 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     135eb4d:	48 8d 9c 24 40 0e 00 	lea    rbx,[rsp+0xe40]
     135eb54:	00 
     135eb55:	48 8d b4 24 b0 0d 00 	lea    rsi,[rsp+0xdb0]
     135eb5c:	00 
     135eb5d:	48 89 df             	mov    rdi,rbx
     135eb60:	e8 7f 06 37 00       	call   16cf1e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83350>
     135eb65:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135eb6c:	00 
     135eb6d:	48 89 de             	mov    rsi,rbx
     135eb70:	e8 9b 83 7e ff       	call   b46f10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x93eb0>
     135eb75:	48 8d 9c 24 30 0a 00 	lea    rbx,[rsp+0xa30]
     135eb7c:	00 
     135eb7d:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     135eb84:	00 
     135eb85:	6a 06                	push   0x6
     135eb87:	5a                   	pop    rdx
     135eb88:	48 8d 8c 24 d0 0a 00 	lea    rcx,[rsp+0xad0]
     135eb8f:	00 
     135eb90:	48 89 df             	mov    rdi,rbx
     135eb93:	e8 0b 01 37 00       	call   16ceca3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82e0f>
     135eb98:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]
     135eb9f:	00 
     135eba0:	48 89 de             	mov    rsi,rbx
     135eba3:	e8 52 5a 75 ff       	call   ab45fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a>

### allocation @0x135ec84
     135ec6f:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135ec72:	49 89 c6             	mov    r14,rax
     135ec75:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec78:	4c 89 ff             	mov    rdi,r15
     135ec7b:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135ec7e:	48 89 c5             	mov    rbp,rax
     135ec81:	6a 40                	push   0x40
     135ec83:	5f                   	pop    rdi
     135ec84:	e8 77 f2 48 00       	call   17edf00 <_Znwm@plt>
     135ec89:	49 89 c7             	mov    r15,rax
     135ec8c:	48 8d 05 cd 29 51 00 	lea    rax,[rip+0x5129cd]        # 1871660 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dd48>
     135ec93:	49 89 07             	mov    QWORD PTR [r15],rax
     135ec96:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135ec9d:	00 
     135ec9e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     135eca2:	49 89 5f 10          	mov    QWORD PTR [r15+0x10],rbx
     135eca6:	48 8b 84 24 c0 10 00 	mov    rax,QWORD PTR [rsp+0x10c0]
     135ecad:	00 
     135ecae:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     135ecb2:	4d 89 77 20          	mov    QWORD PTR [r15+0x20],r14
     135ecb6:	49 89 6f 28          	mov    QWORD PTR [r15+0x28],rbp
     135ecba:	4c 89 ff             	mov    rdi,r15
     135ecbd:	48 83 c7 30          	add    rdi,0x30
     135ecc1:	e8 64 6a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     135ecc6:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
     135eccd:	00 
     135ecce:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ecd5:	00 
     135ecd6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ecd9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ecdc:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     135ece1:	bf 10 01 00 00       	mov    edi,0x110
     135ece6:	e8 15 f2 48 00       	call   17edf00 <_Znwm@plt>
     135eceb:	48 89 c3             	mov    rbx,rax
     135ecee:	48 8d 05 b3 b1 50 00 	lea    rax,[rip+0x50b1b3]        # 1869ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26590>
     135ecf5:	48 89 03             	mov    QWORD PTR [rbx],rax
     135ecf8:	48 8d 05 49 b2 50 00 	lea    rax,[rip+0x50b249]        # 1869f48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26630>
     135ecff:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135ed06:	00 
     135ed07:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135ed0e:	00 
     135ed0f:	48 89 84 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],rax
     135ed16:	00 
     135ed17:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13

### allocation @0x135ece6
     135ecc6:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
     135eccd:	00 
     135ecce:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ecd5:	00 
     135ecd6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ecd9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ecdc:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
     135ece1:	bf 10 01 00 00       	mov    edi,0x110
     135ece6:	e8 15 f2 48 00       	call   17edf00 <_Znwm@plt>
     135eceb:	48 89 c3             	mov    rbx,rax
     135ecee:	48 8d 05 b3 b1 50 00 	lea    rax,[rip+0x50b1b3]        # 1869ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26590>
     135ecf5:	48 89 03             	mov    QWORD PTR [rbx],rax
     135ecf8:	48 8d 05 49 b2 50 00 	lea    rax,[rip+0x50b249]        # 1869f48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26630>
     135ecff:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135ed06:	00 
     135ed07:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135ed0e:	00 
     135ed0f:	48 89 84 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],rax
     135ed16:	00 
     135ed17:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ed1e:	00 
     135ed1f:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ed23:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ed27:	4c 89 ef             	mov    rdi,r13
     135ed2a:	e8 01 2e 04 00       	call   13a1b30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e70b4>
     135ed2f:	66 0f ef c0          	pxor   xmm0,xmm0
     135ed33:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ed38:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ed3d:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ed42:	48 89 d8             	mov    rax,rbx
     135ed45:	48 83 c0 68          	add    rax,0x68
     135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ed58:	00 
     135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ed65:	00 
     135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ed6d:	00 80 3f 
     135ed70:	6a 64                	push   0x64
     135ed72:	58                   	pop    rax
     135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
     135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax

### allocation @0x135eddc
     135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edc3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135edc6:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135edcd:	00 
     135edce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135edd1:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135edd4:	49 89 c6             	mov    r14,rax
     135edd7:	bf 10 01 00 00       	mov    edi,0x110
     135eddc:	e8 1f f1 48 00       	call   17edf00 <_Znwm@plt>
     135ede1:	48 89 c3             	mov    rbx,rax
     135ede4:	48 8d 05 cd b2 50 00 	lea    rax,[rip+0x50b2cd]        # 186a0b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x267a0>
     135edeb:	48 89 03             	mov    QWORD PTR [rbx],rax
     135edee:	48 8d 05 63 b3 50 00 	lea    rax,[rip+0x50b363]        # 186a158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26840>
     135edf5:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
     135edfc:	00 
     135edfd:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
     135ee04:	00 
     135ee05:	48 89 84 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],rax
     135ee0c:	00 
     135ee0d:	4c 89 b4 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],r14
     135ee14:	00 
     135ee15:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
     135ee1c:	00 
     135ee1d:	48 8d 73 10          	lea    rsi,[rbx+0x10]
     135ee21:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
     135ee25:	4c 89 ef             	mov    rdi,r13
     135ee28:	e8 39 4d 04 00       	call   13a3b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e90ea>
     135ee2d:	66 0f ef c0          	pxor   xmm0,xmm0
     135ee31:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
     135ee36:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
     135ee3b:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
     135ee40:	48 89 d8             	mov    rax,rbx
     135ee43:	48 83 c0 68          	add    rax,0x68
     135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
     135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
     135ee56:	00 
     135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
     135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
     135ee63:	00 
     135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
     135ee6b:	00 80 3f 
     135ee6e:	6a 64                	push   0x64
     135ee70:	58                   	pop    rax

### allocation @0x135f2b8
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
     135f309:	00 
     135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
     135f316:	00 00 
     135f318:	6a 70                	push   0x70
     135f31a:	5f                   	pop    rdi
     135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>
     135f320:	48 89 c3             	mov    rbx,rax
     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>
     135f32a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f32d:	48 89 df             	mov    rdi,rbx
     135f330:	48 83 c7 10          	add    rdi,0x10
     135f334:	48 8d b4 24 b0 0d 00 	lea    rsi,[rsp+0xdb0]
     135f33b:	00 
     135f33c:	e8 cb 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f341:	48 89 9c 24 30 0e 00 	mov    QWORD PTR [rsp+0xe30],rbx
     135f348:	00 

### allocation @0x135f31b
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
     135f309:	00 
     135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
     135f316:	00 00 
     135f318:	6a 70                	push   0x70
     135f31a:	5f                   	pop    rdi
     135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>
     135f320:	48 89 c3             	mov    rbx,rax
     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>
     135f32a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f32d:	48 89 df             	mov    rdi,rbx
     135f330:	48 83 c7 10          	add    rdi,0x10
     135f334:	48 8d b4 24 b0 0d 00 	lea    rsi,[rsp+0xdb0]
     135f33b:	00 
     135f33c:	e8 cb 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f341:	48 89 9c 24 30 0e 00 	mov    QWORD PTR [rsp+0xe30],rbx
     135f348:	00 
     135f349:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f350:	00 
     135f351:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135f358:	00 
     135f359:	e8 08 1c 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f35e:	48 83 a4 24 a0 0d 00 	and    QWORD PTR [rsp+0xda0],0x0
     135f365:	00 00 
     135f367:	bf c0 02 00 00       	mov    edi,0x2c0
     135f36c:	e8 8f eb 48 00       	call   17edf00 <_Znwm@plt>
     135f371:	48 89 c3             	mov    rbx,rax
     135f374:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135f37b:	00 
     135f37c:	48 8d 84 24 30 0a 00 	lea    rax,[rsp+0xa30]
     135f383:	00 
     135f384:	48 89 84 24 68 0f 00 	mov    QWORD PTR [rsp+0xf68],rax
     135f38b:	00 
     135f38c:	48 c7 84 24 70 0f 00 	mov    QWORD PTR [rsp+0xf70],0x1
     135f393:	00 01 00 00 00 
     135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>
     135f39f:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f3a2:	48 89 df             	mov    rdi,rbx
     135f3a5:	48 83 c7 10          	add    rdi,0x10
     135f3a9:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135f3b0:	00 
     135f3b1:	e8 b0 1b 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>

### allocation @0x135f36c
     135f349:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f350:	00 
     135f351:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135f358:	00 
     135f359:	e8 08 1c 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f35e:	48 83 a4 24 a0 0d 00 	and    QWORD PTR [rsp+0xda0],0x0
     135f365:	00 00 
     135f367:	bf c0 02 00 00       	mov    edi,0x2c0
     135f36c:	e8 8f eb 48 00       	call   17edf00 <_Znwm@plt>
     135f371:	48 89 c3             	mov    rbx,rax
     135f374:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135f37b:	00 
     135f37c:	48 8d 84 24 30 0a 00 	lea    rax,[rsp+0xa30]
     135f383:	00 
     135f384:	48 89 84 24 68 0f 00 	mov    QWORD PTR [rsp+0xf68],rax
     135f38b:	00 
     135f38c:	48 c7 84 24 70 0f 00 	mov    QWORD PTR [rsp+0xf70],0x1
     135f393:	00 01 00 00 00 
     135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>
     135f39f:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f3a2:	48 89 df             	mov    rdi,rbx
     135f3a5:	48 83 c7 10          	add    rdi,0x10
     135f3a9:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
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
     135f3ec:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f3ef:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f3f3:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135f3fa:	00 
     135f3fb:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     135f402:	00 
     135f403:	e8 9a 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>

### allocation @0x135f414
     135f3fa:	00 
     135f3fb:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     135f402:	00 
     135f403:	e8 9a 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f408:	48 83 a4 24 90 0a 00 	and    QWORD PTR [rsp+0xa90],0x0
     135f40f:	00 00 
     135f411:	6a 50                	push   0x50
     135f413:	5f                   	pop    rdi
     135f414:	e8 e7 ea 48 00       	call   17edf00 <_Znwm@plt>
     135f419:	48 89 c3             	mov    rbx,rax
     135f41c:	48 8d ac 24 b8 03 00 	lea    rbp,[rsp+0x3b8]
     135f423:	00 
     135f424:	48 8d 05 9d 8c 50 00 	lea    rax,[rip+0x508c9d]        # 18680c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247b0>
     135f42b:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f42e:	48 89 df             	mov    rdi,rbx
     135f431:	48 83 c7 10          	add    rdi,0x10
     135f435:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
     135f43c:	00 
     135f43d:	e8 60 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f442:	48 89 9c 24 90 0a 00 	mov    QWORD PTR [rsp+0xa90],rbx
     135f449:	00 
     135f44a:	48 8d 05 8f f4 4a 00 	lea    rax,[rip+0x4af48f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135f451:	48 8d 8c 24 00 0a 00 	lea    rcx,[rsp+0xa00]
     135f458:	00 
     135f459:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f45c:	48 8d 05 63 1a 00 00 	lea    rax,[rip+0x1a63]        # 1360ec6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a644a>
     135f463:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f467:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f46b:	48 8d 05 9e 8c 50 00 	lea    rax,[rip+0x508c9e]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>
     135f472:	48 8d 8c 24 d0 09 00 	lea    rcx,[rsp+0x9d0]
     135f479:	00 
     135f47a:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f47d:	48 8b 84 24 80 10 00 	mov    rax,QWORD PTR [rsp+0x1080]
     135f484:	00 
     135f485:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f489:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f48d:	48 8d 05 6c 8d 50 00 	lea    rax,[rip+0x508d6c]        # 1868200 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x248e8>
     135f494:	49 89 06             	mov    QWORD PTR [r14],rax
     135f497:	48 8d 05 2a 8f 50 00 	lea    rax,[rip+0x508f2a]        # 18683c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ab0>
     135f49e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135f4a2:	48 8d 05 4f 8f 50 00 	lea    rax,[rip+0x508f4f]        # 18683f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ae0>
     135f4a9:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135f4ad:	48 8d 05 0c 90 50 00 	lea    rax,[rip+0x50900c]        # 18684c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ba8>
     135f4b4:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax

### allocation @0x135fb40
     135fb1d:	41 88 ae 80 0a 00 00 	mov    BYTE PTR [r14+0xa80],bpl
     135fb24:	f3 41 0f 7f 86 48 0a 	movdqu XMMWORD PTR [r14+0xa48],xmm0
     135fb2b:	00 00 
     135fb2d:	f3 41 0f 7f 86 58 0a 	movdqu XMMWORD PTR [r14+0xa58],xmm0
     135fb34:	00 00 
     135fb36:	41 88 ae 68 0a 00 00 	mov    BYTE PTR [r14+0xa68],bpl
     135fb3d:	6a 38                	push   0x38
     135fb3f:	5f                   	pop    rdi
     135fb40:	e8 bb e3 48 00       	call   17edf00 <_Znwm@plt>
     135fb45:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135fb4a:	49 83 c7 10          	add    r15,0x10
     135fb4e:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]
     135fb53:	49 83 c4 10          	add    r12,0x10
     135fb57:	66 0f ef c0          	pxor   xmm0,xmm0
     135fb5b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135fb60:	48 8d 0d 39 8e 50 00 	lea    rcx,[rip+0x508e39]        # 18689a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25088>
     135fb67:	48 89 08             	mov    QWORD PTR [rax],rcx
     135fb6a:	48 89 c1             	mov    rcx,rax
     135fb6d:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     135fb72:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     135fb76:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
     135fb7b:	48 83 c1 18          	add    rcx,0x18
     135fb7f:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     135fb84:	49 89 8e 88 0a 00 00 	mov    QWORD PTR [r14+0xa88],rcx
     135fb8b:	49 89 86 90 0a 00 00 	mov    QWORD PTR [r14+0xa90],rax
     135fb92:	f3 41 0f 7f 86 98 0a 	movdqu XMMWORD PTR [r14+0xa98],xmm0
     135fb99:	00 00 
     135fb9b:	66 41 83 a6 a8 0a 00 	and    WORD PTR [r14+0xaa8],0x0
     135fba2:	00 00 
     135fba4:	48 8d bc 24 20 0f 00 	lea    rdi,[rsp+0xf20]
     135fbab:	00 
     135fbac:	e8 d5 94 e9 ff       	call   11f9086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e60a>
     135fbb1:	48 8d bc 24 40 0f 00 	lea    rdi,[rsp+0xf40]
     135fbb8:	00 
     135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
     135fbbe:	31 db                	xor    ebx,ebx
     135fbc0:	41 88 9e e8 0a 00 00 	mov    BYTE PTR [r14+0xae8],bl
     135fbc7:	66 0f ef c0          	pxor   xmm0,xmm0
     135fbcb:	66 41 0f 7f 86 b0 0a 	movdqa XMMWORD PTR [r14+0xab0],xmm0
     135fbd2:	00 00 
     135fbd4:	66 41 0f 7f 86 c0 0a 	movdqa XMMWORD PTR [r14+0xac0],xmm0
     135fbdb:	00 00 
     135fbdd:	66 41 0f 7f 86 d0 0a 	movdqa XMMWORD PTR [r14+0xad0],xmm0
     135fbe4:	00 00 

### allocation @0x135fe01
     135fdea:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fdef:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     135fdf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fdf5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     135fdf8:	48 83 c3 08          	add    rbx,0x8
     135fdfc:	eb df                	jmp    135fddd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5361>
     135fdfe:	6a 40                	push   0x40
     135fe00:	5f                   	pop    rdi
     135fe01:	e8 fa e0 48 00       	call   17edf00 <_Znwm@plt>
     135fe06:	48 8d 0d 03 8c 50 00 	lea    rcx,[rip+0x508c03]        # 1868a10 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x250f8>
     135fe0d:	48 89 08             	mov    QWORD PTR [rax],rcx
     135fe10:	48 8b 8c 24 70 10 00 	mov    rcx,QWORD PTR [rsp+0x1070]
     135fe17:	00 
     135fe18:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135fe1c:	66 0f ef c0          	pxor   xmm0,xmm0
     135fe20:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     135fe25:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     135fe2a:	f3 0f 7f 40 30       	movdqu XMMWORD PTR [rax+0x30],xmm0
     135fe2f:	48 8b 9c 24 f8 00 00 	mov    rbx,QWORD PTR [rsp+0xf8]
     135fe36:	00 
     135fe37:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135fe3a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135fe3d:	48 85 ff             	test   rdi,rdi
     135fe40:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
     135fe45:	74 0d                	je     135fe54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a53d8>
     135fe47:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135fe4a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135fe4d:	66 0f ef c0          	pxor   xmm0,xmm0
     135fe51:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135fe54:	49 8b 36             	mov    rsi,QWORD PTR [r14]
     135fe57:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
     135fe5e:	00 
     135fe5f:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
     135fe63:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
     135fe67:	4c 8b 0e             	mov    r9,QWORD PTR [rsi]
     135fe6a:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fe71:	00 
     135fe72:	6a 0c                	push   0xc
     135fe74:	59                   	pop    rcx
     135fe75:	4c 8d 84 24 58 01 00 	lea    r8,[rsp+0x158]
     135fe7c:	00 
     135fe7d:	48 89 c2             	mov    rdx,rax
     135fe80:	41 ff 91 c0 00 00 00 	call   QWORD PTR [r9+0xc0]
     135fe87:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]

