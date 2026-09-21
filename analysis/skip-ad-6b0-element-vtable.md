# Skip Ad 0x6b0 element vtable resolution

Proven dataflow:
- current/new 0x6b0-stride element -> rsp+0x1338 @ 0x122190f
- e9c8ec -> rsp+0x770
- e9ccf3 -> state+0x10
- efc630 publishes state+0x10 as Skip Ad receiver
- fd384d calls receiver vtable +0x140 and requires eax==0

## real element constructor/copy 0x12240f8 FDE=(19022072, 19022272)
     12240f8:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     12240fc:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     1224100:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     1224103:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     1224106:	0f 57 c0             	xorps  xmm0,xmm0
     1224109:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     122410c:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1224111:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     1224115:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     1224119:	0f 10 4e 18          	movups xmm1,XMMWORD PTR [rsi+0x18]
     122411d:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
     1224121:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     1224125:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     122412a:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     122412e:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     1224132:	0f 10 4e 30          	movups xmm1,XMMWORD PTR [rsi+0x30]
     1224136:	0f 11 4f 30          	movups XMMWORD PTR [rdi+0x30],xmm1
     122413a:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     122413e:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     1224143:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
     1224147:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
     122414b:	0f 10 4e 48          	movups xmm1,XMMWORD PTR [rsi+0x48]
     122414f:	0f 11 4f 48          	movups XMMWORD PTR [rdi+0x48],xmm1
     1224153:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
     1224157:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
     122415c:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]
     1224160:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
     1224164:	0f 10 4e 60          	movups xmm1,XMMWORD PTR [rsi+0x60]
     1224168:	0f 11 4f 60          	movups XMMWORD PTR [rdi+0x60],xmm1
     122416c:	0f 11 46 60          	movups XMMWORD PTR [rsi+0x60],xmm0
     1224170:	48 83 66 70 00       	and    QWORD PTR [rsi+0x70],0x0
     1224175:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
     1224179:	48 8b 4e 7d          	mov    rcx,QWORD PTR [rsi+0x7d]
     122417d:	48 89 4f 7d          	mov    QWORD PTR [rdi+0x7d],rcx
     1224181:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
     1224185:	0f 10 8e 88 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x88]
     122418c:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
     1224193:	48 8b 86 98 00 00 00 	mov    rax,QWORD PTR [rsi+0x98]
     122419a:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
     12241a1:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
     12241a8:	48 83 a6 98 00 00 00 	and    QWORD PTR [rsi+0x98],0x0
     12241af:	00 
     12241b0:	b8 a0 00 00 00       	mov    eax,0xa0
     12241b5:	48 01 c7             	add    rdi,rax
     12241b8:	48 01 c6             	add    rsi,rax
     12241bb:	e9 68 a2 e6 ff       	jmp    108e428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25583e>

## tail subobject copy 0x108dcd4 FDE=(17358036, 17358525)
     108dcd4:	41 56                	push   r14
     108dcd6:	53                   	push   rbx
     108dcd7:	50                   	push   rax
     108dcd8:	49 89 f6             	mov    r14,rsi
     108dcdb:	48 89 fb             	mov    rbx,rdi
     108dcde:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     108dce2:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     108dce6:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     108dce9:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     108dcec:	0f 57 c9             	xorps  xmm1,xmm1
     108dcef:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     108dcf4:	0f 11 0e             	movups XMMWORD PTR [rsi],xmm1
     108dcf7:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     108dcfb:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     108dcff:	0f 10 46 18          	movups xmm0,XMMWORD PTR [rsi+0x18]
     108dd03:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
     108dd07:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     108dd0c:	0f 11 4e 18          	movups XMMWORD PTR [rsi+0x18],xmm1
     108dd10:	8a 46 40             	mov    al,BYTE PTR [rsi+0x40]
     108dd13:	88 47 40             	mov    BYTE PTR [rdi+0x40],al
     108dd16:	0f 10 46 30          	movups xmm0,XMMWORD PTR [rsi+0x30]
     108dd1a:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
     108dd1e:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
     108dd22:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
     108dd26:	0f 10 46 48          	movups xmm0,XMMWORD PTR [rsi+0x48]
     108dd2a:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
     108dd2e:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
     108dd33:	0f 11 4e 48          	movups XMMWORD PTR [rsi+0x48],xmm1
     108dd37:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]
     108dd3b:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
     108dd3f:	0f 10 46 60          	movups xmm0,XMMWORD PTR [rsi+0x60]
     108dd43:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0
     108dd47:	48 83 66 70 00       	and    QWORD PTR [rsi+0x70],0x0
     108dd4c:	0f 11 4e 60          	movups XMMWORD PTR [rsi+0x60],xmm1
     108dd50:	48 8b 86 88 00 00 00 	mov    rax,QWORD PTR [rsi+0x88]
     108dd57:	48 89 87 88 00 00 00 	mov    QWORD PTR [rdi+0x88],rax
     108dd5e:	0f 10 46 78          	movups xmm0,XMMWORD PTR [rsi+0x78]
     108dd62:	0f 11 47 78          	movups XMMWORD PTR [rdi+0x78],xmm0
     108dd66:	48 83 a6 88 00 00 00 	and    QWORD PTR [rsi+0x88],0x0
     108dd6d:	00 
     108dd6e:	0f 11 4e 78          	movups XMMWORD PTR [rsi+0x78],xmm1
     108dd72:	be 90 00 00 00       	mov    esi,0x90
     108dd77:	48 01 f7             	add    rdi,rsi
     108dd7a:	4c 01 f6             	add    rsi,r14
     108dd7d:	e8 3c 01 00 00       	call   108debe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552d4>
     108dd82:	be d8 02 00 00       	mov    esi,0x2d8
     108dd87:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108dd8b:	4c 01 f6             	add    rsi,r14
     108dd8e:	ba 99 00 00 00       	mov    edx,0x99
     108dd93:	e8 38 1d 76 00       	call   17efad0 <memcpy@plt>
     108dd98:	0f 57 c9             	xorps  xmm1,xmm1
     108dd9b:	49 8b 86 88 03 00 00 	mov    rax,QWORD PTR [r14+0x388]
     108dda2:	48 89 83 88 03 00 00 	mov    QWORD PTR [rbx+0x388],rax
     108dda9:	41 0f 10 86 78 03 00 	movups xmm0,XMMWORD PTR [r14+0x378]
     108ddb0:	00 
     108ddb1:	0f 11 83 78 03 00 00 	movups XMMWORD PTR [rbx+0x378],xmm0
     108ddb8:	49 83 a6 88 03 00 00 	and    QWORD PTR [r14+0x388],0x0
     108ddbf:	00 
     108ddc0:	41 0f 11 8e 78 03 00 	movups XMMWORD PTR [r14+0x378],xmm1
     108ddc7:	00 
     108ddc8:	49 8b 86 a0 03 00 00 	mov    rax,QWORD PTR [r14+0x3a0]
     108ddcf:	48 89 83 a0 03 00 00 	mov    QWORD PTR [rbx+0x3a0],rax
     108ddd6:	41 0f 10 86 90 03 00 	movups xmm0,XMMWORD PTR [r14+0x390]
     108dddd:	00 
     108ddde:	0f 11 83 90 03 00 00 	movups XMMWORD PTR [rbx+0x390],xmm0
     108dde5:	49 83 a6 a0 03 00 00 	and    QWORD PTR [r14+0x3a0],0x0
     108ddec:	00 
     108dded:	41 0f 11 8e 90 03 00 	movups XMMWORD PTR [r14+0x390],xmm1
     108ddf4:	00 
     108ddf5:	49 8b 86 a8 03 00 00 	mov    rax,QWORD PTR [r14+0x3a8]
     108ddfc:	48 89 83 a8 03 00 00 	mov    QWORD PTR [rbx+0x3a8],rax
     108de03:	31 c0                	xor    eax,eax
     108de05:	88 83 b0 03 00 00    	mov    BYTE PTR [rbx+0x3b0],al
     108de0b:	88 83 c8 03 00 00    	mov    BYTE PTR [rbx+0x3c8],al
     108de11:	41 38 86 c8 03 00 00 	cmp    BYTE PTR [r14+0x3c8],al
     108de18:	74 34                	je     108de4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255264>
     108de1a:	48 8d 83 b0 03 00 00 	lea    rax,[rbx+0x3b0]
     108de21:	49 8b 8e c0 03 00 00 	mov    rcx,QWORD PTR [r14+0x3c0]
     108de28:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     108de2c:	41 0f 10 86 b0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3b0]
     108de33:	00 
     108de34:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     108de37:	41 0f 11 8e b0 03 00 	movups XMMWORD PTR [r14+0x3b0],xmm1
     108de3e:	00 
     108de3f:	49 83 a6 c0 03 00 00 	and    QWORD PTR [r14+0x3c0],0x0
     108de46:	00 
     108de47:	c6 83 c8 03 00 00 01 	mov    BYTE PTR [rbx+0x3c8],0x1
     108de4e:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
     108de55:	00 
     108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
     108de5d:	00 
     108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
     108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
     108de6c:	31 c0                	xor    eax,eax
     108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
     108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
     108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
     108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
     108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
     108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
     108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
     108de96:	be 30 04 00 00       	mov    esi,0x430
     108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
     108de9f:	4c 01 f6             	add    rsi,r14
     108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
     108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
     108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
     108deb5:	48 83 c4 08          	add    rsp,0x8
     108deb9:	5b                   	pop    rbx
     108deba:	41 5e                	pop    r14
     108debc:	c3                   	ret

## High-address constants in 0x12240f8

## First-word / subobject pointer stores in 0x12240f8
- 0x12240fc: mov    QWORD PTR [rdi+0x10],rax
- 0x1224103: movups XMMWORD PTR [rdi],xmm0
- 0x1224115: mov    QWORD PTR [rdi+0x28],rax
- 0x122411d: movups XMMWORD PTR [rdi+0x18],xmm1
- 0x122412e: mov    QWORD PTR [rdi+0x40],rax
- 0x1224136: movups XMMWORD PTR [rdi+0x30],xmm1
- 0x1224147: mov    QWORD PTR [rdi+0x58],rax
- 0x122414f: movups XMMWORD PTR [rdi+0x48],xmm1
- 0x1224160: mov    QWORD PTR [rdi+0x70],rax
- 0x1224168: movups XMMWORD PTR [rdi+0x60],xmm1
- 0x122417d: mov    QWORD PTR [rdi+0x7d],rcx
- 0x1224181: mov    QWORD PTR [rdi+0x78],rax
- 0x122418c: movups XMMWORD PTR [rdi+0x88],xmm1
- 0x122419a: mov    QWORD PTR [rdi+0x98],rax

## Candidate vtables from constructor constants
## Insertion/current-element path around 0x122190f
     1221703:	00 
     1221704:	4c 89 ee             	mov    rsi,r13
     1221707:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     122170c:	e8 25 97 02 00       	call   124ae36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x903ba>
     1221711:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1221718:	00 
     1221719:	4c 89 ee             	mov    rsi,r13
     122171c:	e8 6b c1 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221721:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     1221728:	00 
     1221729:	48 8d bc 24 60 1c 00 	lea    rdi,[rsp+0x1c60]
     1221730:	00 
     1221731:	48 89 de             	mov    rsi,rbx
     1221734:	e8 93 29 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221739:	c6 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],0x1
     1221740:	01 
     1221741:	48 89 df             	mov    rdi,rbx
     1221744:	e8 ef 86 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     1221749:	eb 10                	jmp    122175b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66cdf>
     122174b:	31 c0                	xor    eax,eax
     122174d:	88 84 24 60 1c 00 00 	mov    BYTE PTR [rsp+0x1c60],al
     1221754:	88 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],al
     122175b:	48 83 a4 24 28 23 00 	and    QWORD PTR [rsp+0x2328],0x0
     1221762:	00 00 
     1221764:	66 0f ef c0          	pxor   xmm0,xmm0
     1221768:	f3 0f 7f 84 24 18 23 	movdqu XMMWORD PTR [rsp+0x2318],xmm0
     122176f:	00 00 
     1221771:	48 8b 8d 70 05 00 00 	mov    rcx,QWORD PTR [rbp+0x570]
     1221778:	48 8b b5 68 05 00 00 	mov    rsi,QWORD PTR [rbp+0x568]
     122177f:	48 89 c8             	mov    rax,rcx
     1221782:	48 29 f0             	sub    rax,rsi
     1221785:	bf 50 05 00 00       	mov    edi,0x550
     122178a:	48 99                	cqo
     122178c:	48 f7 ff             	idiv   rdi
     122178f:	48 39 f1             	cmp    rcx,rsi
     1221792:	0f 84 ec 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
     1221798:	48 b9 7f 21 56 94 c6 	movabs rcx,0x2647c69456217f
     122179f:	47 26 00 
     12217a2:	48 39 c8             	cmp    rax,rcx
     12217a5:	0f 83 30 08 00 00    	jae    1221fdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6755f>
     12217ab:	48 8d 8c 24 28 23 00 	lea    rcx,[rsp+0x2328]
     12217b2:	00 
     12217b3:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
     12217ba:	00 
     12217bb:	48 89 c7             	mov    rdi,rax
     12217be:	e8 b2 8d e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12217c3:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
     12217c8:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     12217cf:	00 
     12217d0:	48 89 03             	mov    QWORD PTR [rbx],rax
     12217d3:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     12217d7:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     12217db:	48 69 ca b0 06 00 00 	imul   rcx,rdx,0x6b0
     12217e2:	48 01 c1             	add    rcx,rax
     12217e5:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
     12217e9:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     12217f0:	00 
     12217f1:	48 89 de             	mov    rsi,rbx
     12217f4:	e8 a5 98 02 00       	call   124b09e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90622>
     12217f9:	48 89 df             	mov    rdi,rbx
     12217fc:	e8 1f 99 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>
     1221801:	4d 8b ae 68 05 00 00 	mov    r13,QWORD PTR [r14+0x568]
     1221808:	49 8b ae 70 05 00 00 	mov    rbp,QWORD PTR [r14+0x570]
     122180f:	49 39 ed             	cmp    r13,rbp
     1221812:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     1221817:	0f 84 67 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
     122181d:	4c 8d bc 24 20 01 00 	lea    r15,[rsp+0x120]
     1221824:	00 
     1221825:	41 be b0 06 00 00    	mov    r14d,0x6b0
     122182b:	4c 8d a4 24 30 13 00 	lea    r12,[rsp+0x1330]
     1221832:	00 
     1221833:	4c 89 ff             	mov    rdi,r15
     1221836:	4c 89 ee             	mov    rsi,r13
     1221839:	e8 20 20 00 00       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     122183e:	48 89 df             	mov    rdi,rbx
     1221841:	4c 89 fe             	mov    rsi,r15
     1221844:	e8 48 8c 02 00       	call   124a491 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa15>
     1221849:	48 89 c3             	mov    rbx,rax
     122184c:	4c 89 ff             	mov    rdi,r15
     122184f:	e8 3c c6 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1221854:	4c 89 ff             	mov    rdi,r15
     1221857:	4c 89 ee             	mov    rsi,r13
     122185a:	48 89 da             	mov    rdx,rbx
     122185d:	e8 d4 95 02 00       	call   124ae36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x903ba>
     1221862:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1221869:	00 
     122186a:	4c 89 ee             	mov    rsi,r13
     122186d:	e8 1a c0 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221872:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221879:	00 
     122187a:	48 8b b4 24 28 23 00 	mov    rsi,QWORD PTR [rsp+0x2328]
     1221881:	00 
     1221882:	48 39 f3             	cmp    rbx,rsi
     1221885:	73 17                	jae    122189e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e22>
     1221887:	48 89 df             	mov    rdi,rbx
     122188a:	4c 89 fe             	mov    rsi,r15
     122188d:	e8 3a 28 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221892:	48 81 c3 b0 06 00 00 	add    rbx,0x6b0
     1221899:	e9 c1 00 00 00       	jmp    122195f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ee3>
     122189e:	48 8b bc 24 18 23 00 	mov    rdi,QWORD PTR [rsp+0x2318]
     12218a5:	00 
     12218a6:	48 29 fb             	sub    rbx,rdi
     12218a9:	48 89 d8             	mov    rax,rbx
     12218ac:	48 99                	cqo
     12218ae:	49 f7 fe             	idiv   r14
     12218b1:	48 8d 50 01          	lea    rdx,[rax+0x1]
     12218b5:	e8 3c 8c e8 ff       	call   10aa4f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27190c>
     12218ba:	48 89 c7             	mov    rdi,rax
     12218bd:	48 8b 84 24 20 23 00 	mov    rax,QWORD PTR [rsp+0x2320]
     12218c4:	00 
     12218c5:	48 2b 84 24 18 23 00 	sub    rax,QWORD PTR [rsp+0x2318]
     12218cc:	00 
     12218cd:	48 99                	cqo
     12218cf:	49 f7 fe             	idiv   r14
     12218d2:	48 89 c3             	mov    rbx,rax
     12218d5:	48 8d 84 24 28 23 00 	lea    rax,[rsp+0x2328]
     12218dc:	00 
     12218dd:	48 89 84 24 50 13 00 	mov    QWORD PTR [rsp+0x1350],rax
     12218e4:	00 
     12218e5:	48 85 ff             	test   rdi,rdi
     12218e8:	74 07                	je     12218f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e75>
     12218ea:	e8 86 8c e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12218ef:	eb 04                	jmp    12218f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e79>
     12218f1:	31 c0                	xor    eax,eax
     12218f3:	31 d2                	xor    edx,edx
     12218f5:	48 89 84 24 30 13 00 	mov    QWORD PTR [rsp+0x1330],rax
     12218fc:	00 
     12218fd:	48 69 db b0 06 00 00 	imul   rbx,rbx,0x6b0
     1221904:	48 01 c3             	add    rbx,rax
     1221907:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx
     122190e:	00 
     122190f:	48 89 9c 24 38 13 00 	mov    QWORD PTR [rsp+0x1338],rbx
     1221916:	00 
     1221917:	48 69 ca b0 06 00 00 	imul   rcx,rdx,0x6b0
     122191e:	48 01 c1             	add    rcx,rax
     1221921:	48 89 8c 24 48 13 00 	mov    QWORD PTR [rsp+0x1348],rcx
     1221928:	00 
     1221929:	48 89 df             	mov    rdi,rbx
     122192c:	4c 89 fe             	mov    rsi,r15
     122192f:	e8 98 27 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221934:	4c 01 f3             	add    rbx,r14
     1221937:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx
     122193e:	00 
     122193f:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     1221946:	00 
     1221947:	4c 89 e6             	mov    rsi,r12
     122194a:	e8 4f 97 02 00       	call   124b09e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90622>
     122194f:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221956:	00 
     1221957:	4c 89 e7             	mov    rdi,r12
     122195a:	e8 c1 97 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>
     122195f:	48 89 9c 24 20 23 00 	mov    QWORD PTR [rsp+0x2320],rbx
     1221966:	00 
     1221967:	4c 89 ff             	mov    rdi,r15
     122196a:	e8 c9 84 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     122196f:	49 81 c5 50 05 00 00 	add    r13,0x550
     1221976:	49 39 ed             	cmp    r13,rbp
     1221979:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     122197e:	0f 85 af fe ff ff    	jne    1221833 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66db7>
     1221984:	48 8d bc 24 d0 10 00 	lea    rdi,[rsp+0x10d0]
     122198b:	00 
     122198c:	e8 b1 20 00 00       	call   1223a42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fc6>
     1221991:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     1221996:	49 8b 85 00 12 00 00 	mov    rax,QWORD PTR [r13+0x1200]
     122199d:	4c 8d b4 24 28 01 00 	lea    r14,[rsp+0x128]
     12219a4:	00 
     12219a5:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     12219a9:	41 8b bd e0 11 00 00 	mov    edi,DWORD PTR [r13+0x11e0]
     12219b0:	e8 13 64 00 00       	call   1227dc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d34c>
     12219b5:	4c 89 f7             	mov    rdi,r14
     12219b8:	48 89 c6             	mov    rsi,rax
     12219bb:	e8 5a b0 87 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     12219c0:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]
     12219c7:	00 
     12219c8:	49 8d b5 e8 11 00 00 	lea    rsi,[r13+0x11e8]
     12219cf:	48 89 df             	mov    rdi,rbx
     12219d2:	e8 69 c5 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12219d7:	48 8b 6c 24 28       	mov    rbp,QWORD PTR [rsp+0x28]
     12219dc:	4d 8d 7d 08          	lea    r15,[r13+0x8]
     12219e0:	4c 8d a4 24 20 01 00 	lea    r12,[rsp+0x120]
     12219e7:	00 
     12219e8:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     12219ec:	48 8d bc 24 c0 19 00 	lea    rdi,[rsp+0x19c0]
     12219f3:	00 
     12219f4:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
     12219f8:	4c 89 f6             	mov    rsi,r14
     12219fb:	e8 2e a0 85 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1221a00:	48 8d bc 24 d8 19 00 	lea    rdi,[rsp+0x19d8]
     1221a07:	00 
     1221a08:	48 89 de             	mov    rsi,rbx
     1221a0b:	e8 1e a0 85 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1221a10:	4c 89 e7             	mov    rdi,r12
     1221a13:	e8 96 a9 8a ff       	call   acc3ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1934e>
     1221a18:	4c 89 ff             	mov    rdi,r15
     1221a1b:	e8 6c 63 00 00       	call   1227d8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d310>
     1221a20:	31 c9                	xor    ecx,ecx
     1221a22:	85 c0                	test   eax,eax
     1221a24:	0f 95 c1             	setne  cl
     1221a27:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     1221a2c:	41 80 7c 4e 09 00    	cmp    BYTE PTR [r14+rcx*2+0x9],0x0
     1221a32:	4c 89 eb             	mov    rbx,r13
     1221a35:	0f 84 e6 01 00 00    	je     1221c21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a5>
     1221a3b:	41 80 7c 4e 08 00    	cmp    BYTE PTR [r14+rcx*2+0x8],0x0
     1221a41:	0f 84 da 01 00 00    	je     1221c21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a5>
     1221a47:	4c 89 ff             	mov    rdi,r15
     1221a4a:	e8 26 1c 00 00       	call   1223675 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bf9>
     1221a4f:	84 c0                	test   al,al
     1221a51:	0f 84 ca 01 00 00    	je     1221c21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a5>
     1221a57:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     1221a5e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1221a61:	ff 50 40             	call   QWORD PTR [rax+0x40]
     1221a64:	f3 0f 6f 40 01       	movdqu xmm0,XMMWORD PTR [rax+0x1]
     1221a69:	66 0f 7f 84 24 30 13 	movdqa XMMWORD PTR [rsp+0x1330],xmm0
     1221a70:	00 00 
     1221a72:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     1221a79:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1221a7c:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1221a7f:	41 80 7e 0c 00       	cmp    BYTE PTR [r14+0xc],0x0
     1221a84:	8a 8d 60 05 00 00    	mov    cl,BYTE PTR [rbp+0x560]
     1221a8a:	74 27                	je     1221ab3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67037>
     1221a8c:	84 c9                	test   cl,cl
     1221a8e:	0f 84 61 01 00 00    	je     1221bf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67179>
     1221a94:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
     1221a98:	74 21                	je     1221abb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6703f>
     1221a9a:	48 8d 7d 28          	lea    rdi,[rbp+0x28]
     1221a9e:	48 83 c0 18          	add    rax,0x18
     1221aa2:	48 89 c6             	mov    rsi,rax
     1221aa5:	e8 44 dc 87 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1221aaa:	84 c0                	test   al,al
     1221aac:	74 0d                	je     1221abb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6703f>
     1221aae:	e9 42 01 00 00       	jmp    1221bf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67179>
     1221ab3:	84 c9                	test   cl,cl
     1221ab5:	0f 84 3a 01 00 00    	je     1221bf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67179>
     1221abb:	80 7d 50 00          	cmp    BYTE PTR [rbp+0x50],0x0
     1221abf:	0f 84 30 01 00 00    	je     1221bf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67179>
     1221ac5:	48 83 c5 40          	add    rbp,0x40
     1221ac9:	48 8d bc 24 30 13 00 	lea    rdi,[rsp+0x1330]
     1221ad0:	00 
     1221ad1:	48 89 ee             	mov    rsi,rbp
     1221ad4:	e8 49 91 96 ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
     1221ad9:	84 c0                	test   al,al
     1221adb:	0f 85 06 01 00 00    	jne    1221be7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6716b>
     1221ae1:	48 8d 35 78 98 1b ff 	lea    rsi,[rip+0xffffffffff1b9878]        # 3db360 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0xdaf>
     1221ae8:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1221aef:	00 
     1221af0:	e8 4b c4 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1221af5:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
     1221afc:	00 
     1221afd:	49 83 66 e8 00       	and    QWORD PTR [r14-0x18],0x0
     1221b02:	31 c0                	xor    eax,eax
     1221b04:	41 88 46 f0          	mov    BYTE PTR [r14-0x10],al
     1221b08:	41 88 46 f4          	mov    BYTE PTR [r14-0xc],al
     1221b0c:	41 88 46 f8          	mov    BYTE PTR [r14-0x8],al
     1221b10:	41 88 46 fc          	mov    BYTE PTR [r14-0x4],al
     1221b14:	41 88 06             	mov    BYTE PTR [r14],al
     1221b17:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
     1221b1b:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]

## Definitions of register stored to rsp+0x1338
### store 0x122190f: mov    QWORD PTR [rsp+0x1338],rbx
     12218a6:	48 29 fb             	sub    rbx,rdi
     12218a9:	48 89 d8             	mov    rax,rbx
     12218ac:	48 99                	cqo
     12218ae:	49 f7 fe             	idiv   r14
     12218b1:	48 8d 50 01          	lea    rdx,[rax+0x1]
     12218b5:	e8 3c 8c e8 ff       	call   10aa4f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27190c>
     12218ba:	48 89 c7             	mov    rdi,rax
     12218bd:	48 8b 84 24 20 23 00 	mov    rax,QWORD PTR [rsp+0x2320]
     12218c4:	00 
     12218c5:	48 2b 84 24 18 23 00 	sub    rax,QWORD PTR [rsp+0x2318]
     12218cc:	00 
     12218cd:	48 99                	cqo
     12218cf:	49 f7 fe             	idiv   r14
     12218d2:	48 89 c3             	mov    rbx,rax
     12218d5:	48 8d 84 24 28 23 00 	lea    rax,[rsp+0x2328]
     12218dc:	00 
     12218dd:	48 89 84 24 50 13 00 	mov    QWORD PTR [rsp+0x1350],rax
     12218e4:	00 
     12218e5:	48 85 ff             	test   rdi,rdi
     12218e8:	74 07                	je     12218f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e75>
     12218ea:	e8 86 8c e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12218ef:	eb 04                	jmp    12218f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e79>
     12218f1:	31 c0                	xor    eax,eax
     12218f3:	31 d2                	xor    edx,edx
     12218f5:	48 89 84 24 30 13 00 	mov    QWORD PTR [rsp+0x1330],rax
     12218fc:	00 
     12218fd:	48 69 db b0 06 00 00 	imul   rbx,rbx,0x6b0
     1221904:	48 01 c3             	add    rbx,rax
     1221907:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx
     122190e:	00 
     122190f:	48 89 9c 24 38 13 00 	mov    QWORD PTR [rsp+0x1338],rbx
     1221916:	00 
     1221917:	48 69 ca b0 06 00 00 	imul   rcx,rdx,0x6b0
     122191e:	48 01 c1             	add    rcx,rax
     1221921:	48 89 8c 24 48 13 00 	mov    QWORD PTR [rsp+0x1348],rcx
     1221928:	00 
     1221929:	48 89 df             	mov    rdi,rbx
     122192c:	4c 89 fe             	mov    rsi,r15
     122192f:	e8 98 27 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221934:	4c 01 f3             	add    rbx,r14
     1221937:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx
     122193e:	00 
     122193f:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     1221946:	00 
     1221947:	4c 89 e6             	mov    rsi,r12
     122194a:	e8 4f 97 02 00       	call   124b09e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90622>
     122194f:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221956:	00 
     1221957:	4c 89 e7             	mov    rdi,r12
     122195a:	e8 c1 97 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>

## Calls to constructor/copy 0x12240cc / 0x12240f8
### call target=0x12240cc @0x1221734; FDE=(19006804, 19014400)
     12216eb:	80 bd 60 05 00 00 00 	cmp    BYTE PTR [rbp+0x560],0x0
     12216f2:	74 57                	je     122174b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ccf>
     12216f4:	4c 89 ef             	mov    rdi,r13
     12216f7:	e8 f2 8d e6 ff       	call   108a4ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251904>
     12216fc:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1221703:	00 
     1221704:	4c 89 ee             	mov    rsi,r13
     1221707:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     122170c:	e8 25 97 02 00       	call   124ae36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x903ba>
     1221711:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1221718:	00 
     1221719:	4c 89 ee             	mov    rsi,r13
     122171c:	e8 6b c1 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221721:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     1221728:	00 
     1221729:	48 8d bc 24 60 1c 00 	lea    rdi,[rsp+0x1c60]
     1221730:	00 
     1221731:	48 89 de             	mov    rsi,rbx
     1221734:	e8 93 29 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221739:	c6 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],0x1
     1221740:	01 
     1221741:	48 89 df             	mov    rdi,rbx
     1221744:	e8 ef 86 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     1221749:	eb 10                	jmp    122175b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66cdf>
     122174b:	31 c0                	xor    eax,eax
     122174d:	88 84 24 60 1c 00 00 	mov    BYTE PTR [rsp+0x1c60],al
     1221754:	88 84 24 10 23 00 00 	mov    BYTE PTR [rsp+0x2310],al
     122175b:	48 83 a4 24 28 23 00 	and    QWORD PTR [rsp+0x2328],0x0
     1221762:	00 00 
     1221764:	66 0f ef c0          	pxor   xmm0,xmm0
     1221768:	f3 0f 7f 84 24 18 23 	movdqu XMMWORD PTR [rsp+0x2318],xmm0
     122176f:	00 00 
     1221771:	48 8b 8d 70 05 00 00 	mov    rcx,QWORD PTR [rbp+0x570]
     1221778:	48 8b b5 68 05 00 00 	mov    rsi,QWORD PTR [rbp+0x568]
     122177f:	48 89 c8             	mov    rax,rcx
     1221782:	48 29 f0             	sub    rax,rsi
     1221785:	bf 50 05 00 00       	mov    edi,0x550
     122178a:	48 99                	cqo
     122178c:	48 f7 ff             	idiv   rdi
     122178f:	48 39 f1             	cmp    rcx,rsi
     1221792:	0f 84 ec 01 00 00    	je     1221984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66f08>
     1221798:	48 b9 7f 21 56 94 c6 	movabs rcx,0x2647c69456217f
     122179f:	47 26 00 
     12217a2:	48 39 c8             	cmp    rax,rcx
     12217a5:	0f 83 30 08 00 00    	jae    1221fdb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6755f>
     12217ab:	48 8d 8c 24 28 23 00 	lea    rcx,[rsp+0x2328]
     12217b2:	00 
     12217b3:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
     12217ba:	00 

### call target=0x12240cc @0x122188d; FDE=(19006804, 19014400)
     122184c:	4c 89 ff             	mov    rdi,r15
     122184f:	e8 3c c6 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1221854:	4c 89 ff             	mov    rdi,r15
     1221857:	4c 89 ee             	mov    rsi,r13
     122185a:	48 89 da             	mov    rdx,rbx
     122185d:	e8 d4 95 02 00       	call   124ae36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x903ba>
     1221862:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
     1221869:	00 
     122186a:	4c 89 ee             	mov    rsi,r13
     122186d:	e8 1a c0 e6 ff       	call   108d88c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254ca2>
     1221872:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221879:	00 
     122187a:	48 8b b4 24 28 23 00 	mov    rsi,QWORD PTR [rsp+0x2328]
     1221881:	00 
     1221882:	48 39 f3             	cmp    rbx,rsi
     1221885:	73 17                	jae    122189e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e22>
     1221887:	48 89 df             	mov    rdi,rbx
     122188a:	4c 89 fe             	mov    rsi,r15
     122188d:	e8 3a 28 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221892:	48 81 c3 b0 06 00 00 	add    rbx,0x6b0
     1221899:	e9 c1 00 00 00       	jmp    122195f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66ee3>
     122189e:	48 8b bc 24 18 23 00 	mov    rdi,QWORD PTR [rsp+0x2318]
     12218a5:	00 
     12218a6:	48 29 fb             	sub    rbx,rdi
     12218a9:	48 89 d8             	mov    rax,rbx
     12218ac:	48 99                	cqo
     12218ae:	49 f7 fe             	idiv   r14
     12218b1:	48 8d 50 01          	lea    rdx,[rax+0x1]
     12218b5:	e8 3c 8c e8 ff       	call   10aa4f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27190c>
     12218ba:	48 89 c7             	mov    rdi,rax
     12218bd:	48 8b 84 24 20 23 00 	mov    rax,QWORD PTR [rsp+0x2320]
     12218c4:	00 
     12218c5:	48 2b 84 24 18 23 00 	sub    rax,QWORD PTR [rsp+0x2318]
     12218cc:	00 
     12218cd:	48 99                	cqo
     12218cf:	49 f7 fe             	idiv   r14
     12218d2:	48 89 c3             	mov    rbx,rax
     12218d5:	48 8d 84 24 28 23 00 	lea    rax,[rsp+0x2328]
     12218dc:	00 
     12218dd:	48 89 84 24 50 13 00 	mov    QWORD PTR [rsp+0x1350],rax
     12218e4:	00 
     12218e5:	48 85 ff             	test   rdi,rdi
     12218e8:	74 07                	je     12218f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e75>
     12218ea:	e8 86 8c e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12218ef:	eb 04                	jmp    12218f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e79>
     12218f1:	31 c0                	xor    eax,eax
     12218f3:	31 d2                	xor    edx,edx
     12218f5:	48 89 84 24 30 13 00 	mov    QWORD PTR [rsp+0x1330],rax
     12218fc:	00 

### call target=0x12240cc @0x122192f; FDE=(19006804, 19014400)
     12218ea:	e8 86 8c e8 ff       	call   10aa575 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27198b>
     12218ef:	eb 04                	jmp    12218f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66e79>
     12218f1:	31 c0                	xor    eax,eax
     12218f3:	31 d2                	xor    edx,edx
     12218f5:	48 89 84 24 30 13 00 	mov    QWORD PTR [rsp+0x1330],rax
     12218fc:	00 
     12218fd:	48 69 db b0 06 00 00 	imul   rbx,rbx,0x6b0
     1221904:	48 01 c3             	add    rbx,rax
     1221907:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx
     122190e:	00 
     122190f:	48 89 9c 24 38 13 00 	mov    QWORD PTR [rsp+0x1338],rbx
     1221916:	00 
     1221917:	48 69 ca b0 06 00 00 	imul   rcx,rdx,0x6b0
     122191e:	48 01 c1             	add    rcx,rax
     1221921:	48 89 8c 24 48 13 00 	mov    QWORD PTR [rsp+0x1348],rcx
     1221928:	00 
     1221929:	48 89 df             	mov    rdi,rbx
     122192c:	4c 89 fe             	mov    rsi,r15
     122192f:	e8 98 27 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1221934:	4c 01 f3             	add    rbx,r14
     1221937:	48 89 9c 24 40 13 00 	mov    QWORD PTR [rsp+0x1340],rbx
     122193e:	00 
     122193f:	48 8d bc 24 18 23 00 	lea    rdi,[rsp+0x2318]
     1221946:	00 
     1221947:	4c 89 e6             	mov    rsi,r12
     122194a:	e8 4f 97 02 00       	call   124b09e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90622>
     122194f:	48 8b 9c 24 20 23 00 	mov    rbx,QWORD PTR [rsp+0x2320]
     1221956:	00 
     1221957:	4c 89 e7             	mov    rdi,r12
     122195a:	e8 c1 97 02 00       	call   124b120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906a4>
     122195f:	48 89 9c 24 20 23 00 	mov    QWORD PTR [rsp+0x2320],rbx
     1221966:	00 
     1221967:	4c 89 ff             	mov    rdi,r15
     122196a:	e8 c9 84 e8 ff       	call   10a9e38 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27124e>
     122196f:	49 81 c5 50 05 00 00 	add    r13,0x550
     1221976:	49 39 ed             	cmp    r13,rbp
     1221979:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     122197e:	0f 85 af fe ff ff    	jne    1221833 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66db7>
     1221984:	48 8d bc 24 d0 10 00 	lea    rdi,[rsp+0x10d0]
     122198b:	00 
     122198c:	e8 b1 20 00 00       	call   1223a42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68fc6>
     1221991:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
     1221996:	49 8b 85 00 12 00 00 	mov    rax,QWORD PTR [r13+0x1200]
     122199d:	4c 8d b4 24 28 01 00 	lea    r14,[rsp+0x128]
     12219a4:	00 
     12219a5:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     12219a9:	41 8b bd e0 11 00 00 	mov    edi,DWORD PTR [r13+0x11e0]
     12219b0:	e8 13 64 00 00       	call   1227dc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d34c>
     12219b5:	4c 89 f7             	mov    rdi,r14

### call target=0x12240cc @0x1223fcd; FDE=(19021134, 19021870)
     1223f66:	41 0f 11 86 c8 08 00 	movups XMMWORD PTR [r14+0x8c8],xmm0
     1223f6d:	00 
     1223f6e:	48 8b 83 c8 08 00 00 	mov    rax,QWORD PTR [rbx+0x8c8]
     1223f75:	49 89 86 c8 08 00 00 	mov    QWORD PTR [r14+0x8c8],rax
     1223f7c:	48 8b 83 d0 08 00 00 	mov    rax,QWORD PTR [rbx+0x8d0]
     1223f83:	49 89 86 d0 08 00 00 	mov    QWORD PTR [r14+0x8d0],rax
     1223f8a:	48 8b 83 d8 08 00 00 	mov    rax,QWORD PTR [rbx+0x8d8]
     1223f91:	49 89 86 d8 08 00 00 	mov    QWORD PTR [r14+0x8d8],rax
     1223f98:	0f 11 83 c8 08 00 00 	movups XMMWORD PTR [rbx+0x8c8],xmm0
     1223f9f:	48 83 a3 d8 08 00 00 	and    QWORD PTR [rbx+0x8d8],0x0
     1223fa6:	00 
     1223fa7:	31 c0                	xor    eax,eax
     1223fa9:	41 88 86 e0 08 00 00 	mov    BYTE PTR [r14+0x8e0],al
     1223fb0:	41 88 86 90 0f 00 00 	mov    BYTE PTR [r14+0xf90],al
     1223fb7:	38 83 90 0f 00 00    	cmp    BYTE PTR [rbx+0xf90],al
     1223fbd:	74 1e                	je     1223fdd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69561>
     1223fbf:	49 8d be e0 08 00 00 	lea    rdi,[r14+0x8e0]
     1223fc6:	48 8d b3 e0 08 00 00 	lea    rsi,[rbx+0x8e0]
     1223fcd:	e8 fa 00 00 00       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     1223fd2:	0f 57 c0             	xorps  xmm0,xmm0
     1223fd5:	41 c6 86 90 0f 00 00 	mov    BYTE PTR [r14+0xf90],0x1
     1223fdc:	01 
     1223fdd:	49 83 a6 a8 0f 00 00 	and    QWORD PTR [r14+0xfa8],0x0
     1223fe4:	00 
     1223fe5:	41 0f 11 86 98 0f 00 	movups XMMWORD PTR [r14+0xf98],xmm0
     1223fec:	00 
     1223fed:	48 8b 83 98 0f 00 00 	mov    rax,QWORD PTR [rbx+0xf98]
     1223ff4:	49 89 86 98 0f 00 00 	mov    QWORD PTR [r14+0xf98],rax
     1223ffb:	48 8b 83 a0 0f 00 00 	mov    rax,QWORD PTR [rbx+0xfa0]
     1224002:	49 89 86 a0 0f 00 00 	mov    QWORD PTR [r14+0xfa0],rax
     1224009:	48 8b 83 a8 0f 00 00 	mov    rax,QWORD PTR [rbx+0xfa8]
     1224010:	49 89 86 a8 0f 00 00 	mov    QWORD PTR [r14+0xfa8],rax
     1224017:	0f 11 83 98 0f 00 00 	movups XMMWORD PTR [rbx+0xf98],xmm0
     122401e:	48 83 a3 a8 0f 00 00 	and    QWORD PTR [rbx+0xfa8],0x0
     1224025:	00 
     1224026:	48 83 c4 08          	add    rsp,0x8
     122402a:	5b                   	pop    rbx
     122402b:	41 5e                	pop    r14
     122402d:	c3                   	ret
     122402e:	41 57                	push   r15
     1224030:	41 56                	push   r14
     1224032:	53                   	push   rbx
     1224033:	48 81 ec 70 02 00 00 	sub    rsp,0x270
     122403a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1224041:	00 00 
     1224043:	48 89 84 24 68 02 00 	mov    QWORD PTR [rsp+0x268],rax
     122404a:	00 
     122404b:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
     122404e:	41 80 bf f8 10 00 00 	cmp    BYTE PTR [r15+0x10f8],0x0

### call target=0x12240cc @0x124b0d2; FDE=(19181726, 19181856)
     124b09f:	41 57                	push   r15
     124b0a1:	41 56                	push   r14
     124b0a3:	41 55                	push   r13
     124b0a5:	41 54                	push   r12
     124b0a7:	53                   	push   rbx
     124b0a8:	50                   	push   rax
     124b0a9:	48 89 f3             	mov    rbx,rsi
     124b0ac:	49 89 fe             	mov    r14,rdi
     124b0af:	4c 8b 2f             	mov    r13,QWORD PTR [rdi]
     124b0b2:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
     124b0b6:	4c 8b 7e 08          	mov    r15,QWORD PTR [rsi+0x8]
     124b0ba:	4d 39 ec             	cmp    r12,r13
     124b0bd:	74 1d                	je     124b0dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90660>
     124b0bf:	48 c7 c5 50 f9 ff ff 	mov    rbp,0xfffffffffffff950
     124b0c6:	49 01 ef             	add    r15,rbp
     124b0c9:	49 01 ec             	add    r12,rbp
     124b0cc:	4c 89 ff             	mov    rdi,r15
     124b0cf:	4c 89 e6             	mov    rsi,r12
     124b0d2:	e8 f5 8f fd ff       	call   12240cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69650>
     124b0d7:	4d 39 ec             	cmp    r12,r13
     124b0da:	75 ea                	jne    124b0c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9064a>
     124b0dc:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
     124b0e0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     124b0e3:	4d 89 3e             	mov    QWORD PTR [r14],r15
     124b0e6:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
     124b0ea:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     124b0ee:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     124b0f2:	49 89 4e 08          	mov    QWORD PTR [r14+0x8],rcx
     124b0f6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     124b0fa:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     124b0fe:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
     124b102:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     124b106:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     124b10a:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     124b10e:	48 89 03             	mov    QWORD PTR [rbx],rax
     124b111:	48 83 c4 08          	add    rsp,0x8
     124b115:	5b                   	pop    rbx
     124b116:	41 5c                	pop    r12
     124b118:	41 5d                	pop    r13
     124b11a:	41 5e                	pop    r14
     124b11c:	41 5f                	pop    r15
     124b11e:	5d                   	pop    rbp
     124b11f:	c3                   	ret
     124b120:	41 56                	push   r14
     124b122:	53                   	push   rbx
     124b123:	50                   	push   rax
     124b124:	48 89 fb             	mov    rbx,rdi
     124b127:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     124b12b:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]

### call target=0x12240f8 @0x12240d6; FDE=(19022028, 19022072)
     122409f:	4c 89 f7             	mov    rdi,r14
     12240a2:	e8 9d d8 fe ff       	call   1211944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ec8>
     12240a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12240ae:	00 00 
     12240b0:	48 3b 84 24 68 02 00 	cmp    rax,QWORD PTR [rsp+0x268]
     12240b7:	00 
     12240b8:	75 0d                	jne    12240c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6964b>
     12240ba:	48 81 c4 70 02 00 00 	add    rsp,0x270
     12240c1:	5b                   	pop    rbx
     12240c2:	41 5e                	pop    r14
     12240c4:	41 5f                	pop    r15
     12240c6:	c3                   	ret
     12240c7:	e8 e4 b9 5c 00       	call   17efab0 <__stack_chk_fail@plt>
     12240cc:	41 56                	push   r14
     12240ce:	53                   	push   rbx
     12240cf:	50                   	push   rax
     12240d0:	48 89 f3             	mov    rbx,rsi
     12240d3:	49 89 fe             	mov    r14,rdi
     12240d6:	e8 1d 00 00 00       	call   12240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>
     12240db:	b8 60 01 00 00       	mov    eax,0x160
     12240e0:	49 01 c6             	add    r14,rax
     12240e3:	48 01 c3             	add    rbx,rax
     12240e6:	4c 89 f7             	mov    rdi,r14
     12240e9:	48 89 de             	mov    rsi,rbx
     12240ec:	48 83 c4 08          	add    rsp,0x8
     12240f0:	5b                   	pop    rbx
     12240f1:	41 5e                	pop    r14
     12240f3:	e9 dc 9b e6 ff       	jmp    108dcd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550ea>
     12240f8:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     12240fc:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     1224100:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     1224103:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     1224106:	0f 57 c0             	xorps  xmm0,xmm0
     1224109:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     122410c:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1224111:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
     1224115:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
     1224119:	0f 10 4e 18          	movups xmm1,XMMWORD PTR [rsi+0x18]
     122411d:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
     1224121:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
     1224125:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
     122412a:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
     122412e:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
     1224132:	0f 10 4e 30          	movups xmm1,XMMWORD PTR [rsi+0x30]
     1224136:	0f 11 4f 30          	movups XMMWORD PTR [rdi+0x30],xmm1
     122413a:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     122413e:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     1224143:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
     1224147:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax

### call target=0x12240f8 @0x124abc3; FDE=(19179710, 19181109)
     124ab7d:	00 
     124ab7e:	e8 bd 33 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124ab83:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
     124ab88:	49 83 c4 30          	add    r12,0x30
     124ab8c:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     124ab93:	00 
     124ab94:	4c 89 e6             	mov    rsi,r12
     124ab97:	e8 02 25 e4 ff       	call   108d09e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2544b4>
     124ab9c:	48 89 df             	mov    rdi,rbx
     124ab9f:	e8 ec 32 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124aba4:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     124aba9:	4d 8b 6c 24 08       	mov    r13,QWORD PTR [r12+0x8]
     124abae:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
     124abb3:	49 39 f5             	cmp    r13,rsi
     124abb6:	73 1c                	jae    124abd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90158>
     124abb8:	4c 89 ef             	mov    rdi,r13
     124abbb:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
     124abc0:	48 89 de             	mov    rsi,rbx
     124abc3:	e8 30 95 fd ff       	call   12240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>
     124abc8:	49 81 c5 60 01 00 00 	add    r13,0x160
     124abcf:	e9 fb 00 00 00       	jmp    124accf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90253>
     124abd4:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     124abd8:	49 29 fd             	sub    r13,rdi
     124abdb:	4c 89 e8             	mov    rax,r13
     124abde:	48 99                	cqo
     124abe0:	b9 60 01 00 00       	mov    ecx,0x160
     124abe5:	48 f7 f9             	idiv   rcx
     124abe8:	48 89 c3             	mov    rbx,rax
     124abeb:	48 8d 50 01          	lea    rdx,[rax+0x1]
     124abef:	e8 fc fc e5 ff       	call   10aa8f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271d06>
     124abf4:	48 85 c0             	test   rax,rax
     124abf7:	74 0f                	je     124ac08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9018c>
     124abf9:	48 89 c7             	mov    rdi,rax
     124abfc:	e8 6e fd e5 ff       	call   10aa96f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271d85>
     124ac01:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     124ac06:	eb 09                	jmp    124ac11 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90195>
     124ac08:	31 c0                	xor    eax,eax
     124ac0a:	31 c9                	xor    ecx,ecx
     124ac0c:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     124ac11:	4c 69 eb 60 01 00 00 	imul   r13,rbx,0x160
     124ac18:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     124ac1d:	49 01 c5             	add    r13,rax
     124ac20:	4c 89 ef             	mov    rdi,r13
     124ac23:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     124ac28:	e8 cb 94 fd ff       	call   12240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>
     124ac2d:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     124ac31:	49 8b 5c 24 08       	mov    rbx,QWORD PTR [r12+0x8]
     124ac36:	4c 39 f3             	cmp    rbx,r14
     124ac39:	74 38                	je     124ac73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x901f7>

### call target=0x12240f8 @0x124ac28; FDE=(19179710, 19181109)
     124abe5:	48 f7 f9             	idiv   rcx
     124abe8:	48 89 c3             	mov    rbx,rax
     124abeb:	48 8d 50 01          	lea    rdx,[rax+0x1]
     124abef:	e8 fc fc e5 ff       	call   10aa8f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271d06>
     124abf4:	48 85 c0             	test   rax,rax
     124abf7:	74 0f                	je     124ac08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9018c>
     124abf9:	48 89 c7             	mov    rdi,rax
     124abfc:	e8 6e fd e5 ff       	call   10aa96f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271d85>
     124ac01:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     124ac06:	eb 09                	jmp    124ac11 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90195>
     124ac08:	31 c0                	xor    eax,eax
     124ac0a:	31 c9                	xor    ecx,ecx
     124ac0c:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     124ac11:	4c 69 eb 60 01 00 00 	imul   r13,rbx,0x160
     124ac18:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     124ac1d:	49 01 c5             	add    r13,rax
     124ac20:	4c 89 ef             	mov    rdi,r13
     124ac23:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     124ac28:	e8 cb 94 fd ff       	call   12240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>
     124ac2d:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     124ac31:	49 8b 5c 24 08       	mov    rbx,QWORD PTR [r12+0x8]
     124ac36:	4c 39 f3             	cmp    rbx,r14
     124ac39:	74 38                	je     124ac73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x901f7>
     124ac3b:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
     124ac40:	4d 89 ec             	mov    r12,r13
     124ac43:	49 c7 c5 a0 fe ff ff 	mov    r13,0xfffffffffffffea0
     124ac4a:	4d 01 ec             	add    r12,r13
     124ac4d:	4c 01 eb             	add    rbx,r13
     124ac50:	4c 89 e7             	mov    rdi,r12
     124ac53:	48 89 de             	mov    rsi,rbx
     124ac56:	e8 9d 94 fd ff       	call   12240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>
     124ac5b:	4c 39 f3             	cmp    rbx,r14
     124ac5e:	75 ea                	jne    124ac4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x901ce>
     124ac60:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     124ac65:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
     124ac68:	48 8b 59 08          	mov    rbx,QWORD PTR [rcx+0x8]
     124ac6c:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     124ac71:	eb 0b                	jmp    124ac7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90202>
     124ac73:	49 89 de             	mov    r14,rbx
     124ac76:	4d 89 ec             	mov    r12,r13
     124ac79:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     124ac7e:	49 81 c5 60 01 00 00 	add    r13,0x160
     124ac85:	48 69 44 24 10 60 01 	imul   rax,QWORD PTR [rsp+0x10],0x160
     124ac8c:	00 00 
     124ac8e:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     124ac93:	48 01 c2             	add    rdx,rax
     124ac96:	4c 89 21             	mov    QWORD PTR [rcx],r12
     124ac99:	4c 89 69 08          	mov    QWORD PTR [rcx+0x8],r13
     124ac9d:	48 89 51 10          	mov    QWORD PTR [rcx+0x10],rdx

### call target=0x12240f8 @0x124ac56; FDE=(19179710, 19181109)
     124ac0c:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     124ac11:	4c 69 eb 60 01 00 00 	imul   r13,rbx,0x160
     124ac18:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     124ac1d:	49 01 c5             	add    r13,rax
     124ac20:	4c 89 ef             	mov    rdi,r13
     124ac23:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     124ac28:	e8 cb 94 fd ff       	call   12240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>
     124ac2d:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
     124ac31:	49 8b 5c 24 08       	mov    rbx,QWORD PTR [r12+0x8]
     124ac36:	4c 39 f3             	cmp    rbx,r14
     124ac39:	74 38                	je     124ac73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x901f7>
     124ac3b:	4c 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],r13
     124ac40:	4d 89 ec             	mov    r12,r13
     124ac43:	49 c7 c5 a0 fe ff ff 	mov    r13,0xfffffffffffffea0
     124ac4a:	4d 01 ec             	add    r12,r13
     124ac4d:	4c 01 eb             	add    rbx,r13
     124ac50:	4c 89 e7             	mov    rdi,r12
     124ac53:	48 89 de             	mov    rsi,rbx
     124ac56:	e8 9d 94 fd ff       	call   12240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>
     124ac5b:	4c 39 f3             	cmp    rbx,r14
     124ac5e:	75 ea                	jne    124ac4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x901ce>
     124ac60:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     124ac65:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
     124ac68:	48 8b 59 08          	mov    rbx,QWORD PTR [rcx+0x8]
     124ac6c:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     124ac71:	eb 0b                	jmp    124ac7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90202>
     124ac73:	49 89 de             	mov    r14,rbx
     124ac76:	4d 89 ec             	mov    r12,r13
     124ac79:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     124ac7e:	49 81 c5 60 01 00 00 	add    r13,0x160
     124ac85:	48 69 44 24 10 60 01 	imul   rax,QWORD PTR [rsp+0x10],0x160
     124ac8c:	00 00 
     124ac8e:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     124ac93:	48 01 c2             	add    rdx,rax
     124ac96:	4c 89 21             	mov    QWORD PTR [rcx],r12
     124ac99:	4c 89 69 08          	mov    QWORD PTR [rcx+0x8],r13
     124ac9d:	48 89 51 10          	mov    QWORD PTR [rcx+0x10],rdx
     124aca1:	4c 39 f3             	cmp    rbx,r14
     124aca4:	49 89 cc             	mov    r12,rcx
     124aca7:	74 14                	je     124acbd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90241>
     124aca9:	48 81 c3 a0 fe ff ff 	add    rbx,0xfffffffffffffea0
     124acb0:	48 89 df             	mov    rdi,rbx
     124acb3:	e8 36 f1 e5 ff       	call   10a9dee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271204>
     124acb8:	4c 39 f3             	cmp    rbx,r14
     124acbb:	75 ec                	jne    124aca9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9022d>
     124acbd:	4d 85 f6             	test   r14,r14
     124acc0:	74 08                	je     124acca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9024e>
     124acc2:	4c 89 f7             	mov    rdi,r14
     124acc5:	e8 56 32 5a 00       	call   17edf20 <_ZdlPv@plt>

## Direct +0x140 calls near element consumers
### 0xeb2f12; FDE=(15409478, 15413917)
      eb2eec:	48 89 84 24 f8 03 00 	mov    QWORD PTR [rsp+0x3f8],rax
      eb2ef3:	00 
      eb2ef4:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      eb2efb:	00 
      eb2efc:	48 89 84 24 00 04 00 	mov    QWORD PTR [rsp+0x400],rax
      eb2f03:	00 
      eb2f04:	4c 89 bc 24 10 04 00 	mov    QWORD PTR [rsp+0x410],r15
      eb2f0b:	00 
      eb2f0c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      eb2f0f:	4c 89 fe             	mov    rsi,r15
      eb2f12:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
      eb2f18:	48 8d bc 24 f0 03 00 	lea    rdi,[rsp+0x3f0]
      eb2f1f:	00 
      eb2f20:	e8 45 70 bc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      eb2f25:	49 8b 9e 50 02 00 00 	mov    rbx,QWORD PTR [r14+0x250]
      eb2f2c:	4c 8d 84 24 c0 03 00 	lea    r8,[rsp+0x3c0]
      eb2f33:	00 
      eb2f34:	4d 89 30             	mov    QWORD PTR [r8],r14
      eb2f37:	48 8d 35 53 a1 be ff 	lea    rsi,[rip+0xffffffffffbea153]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      eb2f3e:	48 8d 0d 8f 03 00 00 	lea    rcx,[rip+0x38f]        # eb32d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6ea>
      eb2f45:	4c 8d bc 24 f0 03 00 	lea    r15,[rsp+0x3f0]
      eb2f4c:	00 
      eb2f4d:	6a 08                	push   0x8
      eb2f4f:	41 59                	pop    r9
      eb2f51:	4c 89 ff             	mov    rdi,r15
      eb2f54:	31 d2                	xor    edx,edx
      eb2f56:	e8 39 78 92 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      eb2f5b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      eb2f5e:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]

### 0xfd384d; FDE=(16594970, 16595158)
      fd3827:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd382e:	00 00 
      fd3830:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      fd3835:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
      fd3839:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fd383c:	ff 50 70             	call   QWORD PTR [rax+0x70]
      fd383f:	41 80 7e 68 00       	cmp    BYTE PTR [r14+0x68],0x0
      fd3844:	74 3c                	je     fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
      fd3846:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      fd384a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      fd384d:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
      fd3853:	85 c0                	test   eax,eax
      fd3855:	75 2b                	jne    fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
      fd3857:	48 8d 35 2c 38 37 ff 	lea    rsi,[rip+0xffffffffff37382c]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
      fd385e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fd3863:	6a 07                	push   0x7
      fd3865:	5a                   	pop    rdx
      fd3866:	e8 af 91 ac ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      fd386b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      fd3870:	48 89 df             	mov    rdi,rbx
      fd3873:	e8 b4 01 d5 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
      fd3878:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      fd387d:	e8 0e a6 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      fd3882:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd3889:	00 00 
      fd388b:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fd3890:	75 3f                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
      fd3892:	48 89 d8             	mov    rax,rbx
      fd3895:	48 83 c4 28          	add    rsp,0x28

### 0xfd3926; FDE=(16595158, 16595387)
      fd3905:	48 89 d1             	mov    rcx,rdx
      fd3908:	48 8d 3d 7b 37 37 ff 	lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
      fd390f:	6a 07                	push   0x7
      fd3911:	5e                   	pop    rsi
      fd3912:	48 89 c2             	mov    rdx,rax
      fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
      fd391a:	84 c0                	test   al,al
      fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
      fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
      fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
      fd392c:	85 c0                	test   eax,eax
      fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
      fd3930:	49 83 c4 08          	add    r12,0x8
      fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
      fd3939:	4c 89 ef             	mov    rdi,r13
      fd393c:	4c 89 e6             	mov    rsi,r12
      fd393f:	4c 89 fa             	mov    rdx,r15
      fd3942:	4c 89 f1             	mov    rcx,r14
      fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
      fd394a:	48 89 df             	mov    rdi,rbx
      fd394d:	4c 89 ee             	mov    rsi,r13
      fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
      fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fd3965:	00 00 
      fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>

### 0xff6cb0; FDE=(16739022, 16741222)
      ff6c8b:	49 89 c7             	mov    r15,rax
      ff6c8e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ff6c91:	48 89 df             	mov    rdi,rbx
      ff6c94:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      ff6c9a:	4c 8d a3 d0 21 00 00 	lea    r12,[rbx+0x21d0]
      ff6ca1:	4d 8b 06             	mov    r8,QWORD PTR [r14]
      ff6ca4:	4c 89 f7             	mov    rdi,r14
      ff6ca7:	4c 89 fe             	mov    rsi,r15
      ff6caa:	48 89 c2             	mov    rdx,rax
      ff6cad:	4c 89 e1             	mov    rcx,r12
      ff6cb0:	41 ff 90 40 01 00 00 	call   QWORD PTR [r8+0x140]
      ff6cb7:	84 c0                	test   al,al
      ff6cb9:	0f 84 f0 01 00 00    	je     ff6eaf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be2c5>
      ff6cbf:	4c 89 e7             	mov    rdi,r12
      ff6cc2:	e8 95 69 f4 ff       	call   f3d65c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x104a72>
      ff6cc7:	c6 83 e4 24 00 00 00 	mov    BYTE PTR [rbx+0x24e4],0x0
      ff6cce:	48 89 df             	mov    rdi,rbx
      ff6cd1:	e8 54 f8 ff ff       	call   ff652a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bd940>
      ff6cd6:	48 8d 35 33 d5 84 00 	lea    rsi,[rip+0x84d533]        # 1844210 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f8>
      ff6cdd:	48 89 df             	mov    rdi,rbx
      ff6ce0:	e8 9d 0b 00 00       	call   ff7882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bec98>
      ff6ce5:	e9 9f 02 00 00       	jmp    ff6f89 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be39f>
      ff6cea:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      ff6cef:	80 7c 24 78 00       	cmp    BYTE PTR [rsp+0x78],0x0
      ff6cf4:	0f 84 77 01 00 00    	je     ff6e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be287>
      ff6cfa:	4c 8d ab f8 0d 00 00 	lea    r13,[rbx+0xdf8]
      ff6d01:	45 84 f6             	test   r14b,r14b
      ff6d04:	48 8d 05 09 11 00 00 	lea    rax,[rip+0x1109]        # ff7e14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf22a>
      ff6d0b:	48 8d 0d 2c 12 00 00 	lea    rcx,[rip+0x122c]        # ff7f3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bf354>

### 0x1066553; FDE=(17196330, 17196435)
     106652d:	50                   	push   rax
     106652e:	48 89 fb             	mov    rbx,rdi
     1066531:	80 bf d0 07 00 00 00 	cmp    BYTE PTR [rdi+0x7d0],0x0
     1066538:	74 1f                	je     1066559 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d96f>
     106653a:	48 8d b3 68 01 00 00 	lea    rsi,[rbx+0x168]
     1066541:	4c 8b 73 10          	mov    r14,QWORD PTR [rbx+0x10]
     1066545:	48 89 df             	mov    rdi,rbx
     1066548:	e8 8f be ff ff       	call   10623dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2297f2>
     106654d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1066550:	4c 89 f7             	mov    rdi,r14
     1066553:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
     1066559:	80 bb 40 0e 00 00 00 	cmp    BYTE PTR [rbx+0xe40],0x0
     1066560:	74 29                	je     106658b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22d9a1>
     1066562:	48 8d b3 d8 07 00 00 	lea    rsi,[rbx+0x7d8]
     1066569:	4c 8b 73 10          	mov    r14,QWORD PTR [rbx+0x10]
     106656d:	48 89 df             	mov    rdi,rbx
     1066570:	e8 67 be ff ff       	call   10623dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2297f2>
     1066575:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1066578:	48 8b 80 48 01 00 00 	mov    rax,QWORD PTR [rax+0x148]
     106657f:	4c 89 f7             	mov    rdi,r14
     1066582:	48 83 c4 08          	add    rsp,0x8
     1066586:	5b                   	pop    rbx
     1066587:	41 5e                	pop    r14
     1066589:	ff e0                	jmp    rax
     106658b:	48 83 c4 08          	add    rsp,0x8
     106658f:	5b                   	pop    rbx
     1066590:	41 5e                	pop    r14
     1066592:	c3                   	ret
     1066593:	cc                   	int3

### 0x10a6738; FDE=(17458276, 17465170)
     10a6715:	48 8d 0d 8c 0c 33 ff 	lea    rcx,[rip+0xffffffffff330c8c]        # 3d73a8 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f8d>
     10a671c:	8b 34 81             	mov    esi,DWORD PTR [rcx+rax*4]
     10a671f:	eb 03                	jmp    10a6724 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db3a>
     10a6721:	6a 05                	push   0x5
     10a6723:	5e                   	pop    rsi
     10a6724:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6728:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a672b:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
     10a6731:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     10a6735:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a6738:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
     10a673e:	85 c0                	test   eax,eax
     10a6740:	74 35                	je     10a6777 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26db8d>
     10a6742:	48 8d 35 5d 57 28 ff 	lea    rsi,[rip+0xffffffffff28575d]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a6749:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6750:	00 
     10a6751:	e8 28 33 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a6756:	49 8d be b0 16 00 00 	lea    rdi,[r14+0x16b0]
     10a675d:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a6764:	00 
     10a6765:	e8 26 73 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a676a:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a6771:	00 
     10a6772:	e8 19 77 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a6777:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10a677a:	4c 89 f7             	mov    rdi,r14
     10a677d:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     10a6783:	84 c0                	test   al,al
     10a6785:	75 35                	jne    10a67bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26dbd2>

### 0x10b847e; FDE=(17531994, 17532148)
     10b845c:	41 56                	push   r14
     10b845e:	53                   	push   rbx
     10b845f:	48 83 ec 30          	sub    rsp,0x30
     10b8463:	49 89 ce             	mov    r14,rcx
     10b8466:	48 89 fb             	mov    rbx,rdi
     10b8469:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10b8470:	00 00 
     10b8472:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     10b8477:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
     10b847b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10b847e:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
     10b8484:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     10b8489:	49 83 27 00          	and    QWORD PTR [r15],0x0
     10b848d:	83 f8 03             	cmp    eax,0x3
     10b8490:	6a 01                	push   0x1
     10b8492:	59                   	pop    rcx
     10b8493:	0f 42 c8             	cmovb  ecx,eax
     10b8496:	48 8d 05 23 4f 79 00 	lea    rax,[rip+0x794f23]        # 184d3c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9aa8>
     10b849d:	49 89 47 f8          	mov    QWORD PTR [r15-0x8],rax
     10b84a1:	41 89 4f 10          	mov    DWORD PTR [r15+0x10],ecx
     10b84a5:	49 c7 47 08 01 00 00 	mov    QWORD PTR [r15+0x8],0x1
     10b84ac:	00 
     10b84ad:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     10b84b0:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     10b84b5:	e8 a2 93 52 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
     10b84ba:	48 89 df             	mov    rdi,rbx
     10b84bd:	e8 6f 92 52 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
     10b84c2:	4c 89 ff             	mov    rdi,r15
     10b84c5:	e8 3e 25 9f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>

### 0x12836bd; FDE=(19412590, 19412762)
     128369f:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
     12836a5:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12836a8:	6a 01                	push   0x1
     12836aa:	5e                   	pop    rsi
     12836ab:	48 89 df             	mov    rdi,rbx
     12836ae:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
     12836b4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12836b7:	6a 01                	push   0x1
     12836b9:	5e                   	pop    rsi
     12836ba:	48 89 df             	mov    rdi,rbx
     12836bd:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
     12836c3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12836c6:	6a 01                	push   0x1
     12836c8:	5e                   	pop    rsi
     12836c9:	48 89 df             	mov    rdi,rbx
     12836cc:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
     12836d2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12836d5:	48 89 df             	mov    rdi,rbx
     12836d8:	ff 90 50 02 00 00    	call   QWORD PTR [rax+0x250]
     12836de:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12836e1:	6a 01                	push   0x1
     12836e3:	5e                   	pop    rsi
     12836e4:	48 89 df             	mov    rdi,rbx
     12836e7:	ff 90 60 02 00 00    	call   QWORD PTR [rax+0x260]
     12836ed:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12836f0:	48 89 df             	mov    rdi,rbx
     12836f3:	ff 90 f0 02 00 00    	call   QWORD PTR [rax+0x2f0]
     12836f9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12836fc:	48 89 df             	mov    rdi,rbx

### 0x128380b; FDE=(19412762, 19415636)
     12837e3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12837e6:	48 89 df             	mov    rdi,rbx
     12837e9:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
     12837ef:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     12837f4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12837f7:	48 89 df             	mov    rdi,rbx
     12837fa:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     1283800:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     1283805:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1283808:	48 89 df             	mov    rdi,rbx
     128380b:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
     1283811:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1283816:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1283819:	48 89 df             	mov    rdi,rbx
     128381c:	ff 90 90 01 00 00    	call   QWORD PTR [rax+0x190]
     1283822:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1283827:	4d 8b be 88 06 00 00 	mov    r15,QWORD PTR [r14+0x688]
     128382e:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
     1283833:	49 8b 86 90 06 00 00 	mov    rax,QWORD PTR [r14+0x690]
     128383a:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     1283841:	00 
     1283842:	49 39 c7             	cmp    r15,rax
     1283845:	0f 84 07 09 00 00    	je     1284152 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc96d6>
     128384b:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1283850:	48 83 c0 08          	add    rax,0x8
     1283854:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     128385b:	00 
     128385c:	4c 89 ff             	mov    rdi,r15
     128385f:	e8 5c be 81 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>

