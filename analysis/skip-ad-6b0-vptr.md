# Skip Ad 0x6b0 receiver vptr

Proven chain:
- current/new element selected at 0x122190f from a 0x6b0-stride array
- element copied by 0x12240cc
- 0x12240cc calls 0x12240f8 for head [0..0x160), then 0x108dcd4 for tail
- e9ccf3 stores this element pointer into state+0x10
- efc630 publishes state+0x10 as Skip Ad readiness receiver
- fd384d invokes receiver vtable +0x140 and requires EAX==0

## Function 0x12240cc FDE=(19022028, 19022072)
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

## Function 0x12240f8 FDE=(19022072, 19022272)
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

## Function 0x108dcd4 FDE=(17358036, 17358525)
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

## First-word / head writes in 0x12240f8
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

### High-address materializations

## Source/destination first-qword movement in 0x12240f8
     12240f8:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     12240fc:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     1224100:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
     1224103:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     1224109:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
     122410c:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1224119:	0f 10 4e 18          	movups xmm1,XMMWORD PTR [rsi+0x18]
     122411d:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
     1224121:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0

## Candidate address points with callable +0x140
## All static AP-like stores in 0x12240f8 FDE

## Callers of 0x12240cc and source-register provenance
### call @0x1221734; FDE=(19006804, 19014400)
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

### call @0x122188d; FDE=(19006804, 19014400)
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

### call @0x122192f; FDE=(19006804, 19014400)
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

### call @0x1223fcd; FDE=(19021134, 19021870)
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

### call @0x124b0d2; FDE=(19181726, 19181856)
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

## Static high-address stores near 0x12218xx source-element creation
### 0x12260c5: lea    rax,[rip+0x6f94a4]        # 191f570 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66980>; FDE=(19029630, 19030372)
     12260c5:	48 8d 05 a4 94 6f 00 	lea    rax,[rip+0x6f94a4]        # 191f570 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x66980>
     12260cc:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     12260d0:	48 89 df             	mov    rdi,rbx
     12260d3:	e8 f2 77 ff ff       	call   121d8ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62e4e>
     12260d8:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     12260df:	00 
     12260e0:	e8 e7 78 89 ff       	call   abd9cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa96c>

### 0x1227ea6: lea    rcx,[rip+0x635183]        # 185d030 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19718>; FDE=(19037850, 19037888)
     1227ea6:	48 8d 0d 83 51 63 00 	lea    rcx,[rip+0x635183]        # 185d030 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19718>
     1227ead:	48 89 08             	mov    QWORD PTR [rax],rcx
     1227eb0:	48 89 03             	mov    QWORD PTR [rbx],rax
     1227eb3:	48 89 d8             	mov    rax,rbx
     1227eb6:	5b                   	pop    rbx
     1227eb7:	c3                   	ret
     1227eb8:	48 89 c7             	mov    rdi,rax

### 0x1227ecc: lea    rcx,[rip+0x635195]        # 185d068 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19750>; FDE=(19037888, 19037926)
     1227ecc:	48 8d 0d 95 51 63 00 	lea    rcx,[rip+0x635195]        # 185d068 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19750>
     1227ed3:	48 89 08             	mov    QWORD PTR [rax],rcx
     1227ed6:	48 89 03             	mov    QWORD PTR [rbx],rax
     1227ed9:	48 89 d8             	mov    rax,rbx
     1227edc:	5b                   	pop    rbx
     1227edd:	c3                   	ret
     1227ede:	48 89 c7             	mov    rdi,rax

### 0x122abcb: lea    rcx,[rip+0x70cef6]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>; FDE=(19049326, 19049543)
     122abcb:	48 8d 0d f6 ce 70 00 	lea    rcx,[rip+0x70cef6]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     122abd2:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     122abd6:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     122abdb:	49 89 07             	mov    QWORD PTR [r15],rax
     122abde:	48 8d 05 29 77 93 ff 	lea    rax,[rip+0xffffffffff937729]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
     122abe5:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     122abe9:	48 8d 05 58 00 00 00 	lea    rax,[rip+0x58]        # 122ac48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x701cc>

### 0x122ae36: lea    r8,[rip+0x6322ab]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>; FDE=(19049974, 19052388)
     122ae36:	4c 8d 05 ab 22 63 00 	lea    r8,[rip+0x6322ab]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>
     122ae3d:	4c 89 40 e8          	mov    QWORD PTR [rax-0x18],r8
     122ae41:	48 83 60 f0 00       	and    QWORD PTR [rax-0x10],0x0
     122ae46:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     122ae4b:	83 60 f7 00          	and    DWORD PTR [rax-0x9],0x0
     122ae4f:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     122ae54:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi

### 0x122af2c: lea    rcx,[rip+0x6321b5]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>; FDE=(19049974, 19052388)
     122af2c:	48 8d 0d b5 21 63 00 	lea    rcx,[rip+0x6321b5]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>
     122af33:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     122af37:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
     122af3c:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     122af40:	66 83 60 28 00       	and    WORD PTR [rax+0x28],0x0
     122af45:	48 8d 4c 24 78       	lea    rcx,[rsp+0x78]
     122af4a:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx

### 0x122b2f3: lea    rax,[rip+0x631e3e]        # 185d138 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19820>; FDE=(19049974, 19052388)
     122b2f3:	48 8d 05 3e 1e 63 00 	lea    rax,[rip+0x631e3e]        # 185d138 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19820>
     122b2fa:	49 89 07             	mov    QWORD PTR [r15],rax
     122b2fd:	4d 8d 67 18          	lea    r12,[r15+0x18]
     122b301:	48 8d bc 24 30 07 00 	lea    rdi,[rsp+0x730]
     122b308:	00 
     122b309:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     122b30e:	e8 51 04 00 00       	call   122b764 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70ce8>

### 0x122b3ae: lea    rax,[rip+0x631dbb]        # 185d170 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19858>; FDE=(19049974, 19052388)
     122b3ae:	48 8d 05 bb 1d 63 00 	lea    rax,[rip+0x631dbb]        # 185d170 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19858>
     122b3b5:	49 89 87 40 07 00 00 	mov    QWORD PTR [r15+0x740],rax
     122b3bc:	0f 57 c0             	xorps  xmm0,xmm0
     122b3bf:	41 0f 11 87 48 07 00 	movups XMMWORD PTR [r15+0x748],xmm0
     122b3c6:	00 
     122b3c7:	41 0f 11 87 58 07 00 	movups XMMWORD PTR [r15+0x758],xmm0
     122b3ce:	00 

### 0x122b764: lea    rax,[rip+0x63197d]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>; FDE=(19052388, 19052523)
     122b764:	48 8d 05 7d 19 63 00 	lea    rax,[rip+0x63197d]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>
     122b76b:	48 89 07             	mov    QWORD PTR [rdi],rax
     122b76e:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
     122b772:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     122b776:	8b 46 0f             	mov    eax,DWORD PTR [rsi+0xf]
     122b779:	89 47 0f             	mov    DWORD PTR [rdi+0xf],eax
     122b77c:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]

### 0x122b984: lea    rax,[rip+0x6317ad]        # 185d138 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19820>; FDE=(19052932, 19052947)
     122b984:	48 8d 05 ad 17 63 00 	lea    rax,[rip+0x6317ad]        # 185d138 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19820>
     122b98b:	48 89 07             	mov    QWORD PTR [rdi],rax
     122b98e:	e9 7d 26 5c 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     122b993:	cc                   	int3
     122b994:	53                   	push   rbx
     122b995:	48 89 fb             	mov    rbx,rdi
     122b998:	e8 e7 ff ff ff       	call   122b984 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70f08>

### 0x122ba7e: lea    rax,[rip+0x631bf3]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>; FDE=(19053102, 19056020)
     122ba7e:	48 8d 05 f3 1b 63 00 	lea    rax,[rip+0x631bf3]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     122ba85:	48 89 42 a8          	mov    QWORD PTR [rdx-0x58],rax
     122ba89:	48 83 62 b0 00       	and    QWORD PTR [rdx-0x50],0x0
     122ba8e:	c6 42 b8 01          	mov    BYTE PTR [rdx-0x48],0x1
     122ba92:	0f 11 42 b9          	movups XMMWORD PTR [rdx-0x47],xmm0
     122ba96:	0f 11 42 c9          	movups XMMWORD PTR [rdx-0x37],xmm0
     122ba9a:	0f 11 42 d9          	movups XMMWORD PTR [rdx-0x27],xmm0

### 0x122bc58: lea    rax,[rip+0x631549]        # 185d1a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19890>; FDE=(19053102, 19056020)
     122bc58:	48 8d 05 49 15 63 00 	lea    rax,[rip+0x631549]        # 185d1a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19890>
     122bc5f:	49 89 07             	mov    QWORD PTR [r15],rax
     122bc62:	48 8d bc 24 20 08 00 	lea    rdi,[rsp+0x820]
     122bc69:	00 
     122bc6a:	48 8d b4 24 00 01 00 	lea    rsi,[rsp+0x100]
     122bc71:	00 
     122bc72:	e8 d5 0b 00 00       	call   122c84c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x71dd0>

### 0x122bea3: lea    rax,[rip+0x631376]        # 185d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19908>; FDE=(19053102, 19056020)
     122bea3:	48 8d 05 76 13 63 00 	lea    rax,[rip+0x631376]        # 185d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19908>
     122beaa:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     122beae:	4d 8d 65 18          	lea    r12,[r13+0x18]
     122beb2:	49 8d 7d 58          	lea    rdi,[r13+0x58]
     122beb6:	31 db                	xor    ebx,ebx
     122beb8:	ba f8 0e 00 00       	mov    edx,0xef8
     122bebd:	31 f6                	xor    esi,esi

### 0x122bec4: lea    rax,[rip+0x63138d]        # 185d258 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19940>; FDE=(19053102, 19056020)
     122bec4:	48 8d 05 8d 13 63 00 	lea    rax,[rip+0x63138d]        # 185d258 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19940>
     122becb:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
     122becf:	66 0f ef c0          	pxor   xmm0,xmm0
     122bed3:	f3 41 0f 7f 45 60    	movdqu XMMWORD PTR [r13+0x60],xmm0
     122bed9:	f3 41 0f 7f 45 69    	movdqu XMMWORD PTR [r13+0x69],xmm0
     122bedf:	f3 41 0f 7f 85 80 00 	movdqu XMMWORD PTR [r13+0x80],xmm0
     122bee6:	00 00 

### 0x122c105: lea    rax,[rip+0x7bdf9c]        # 19ea0a8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xce0>; FDE=(19053102, 19056020)
     122c105:	48 8d 05 9c df 7b 00 	lea    rax,[rip+0x7bdf9c]        # 19ea0a8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xce0>
     122c10c:	49 89 85 70 05 00 00 	mov    QWORD PTR [r13+0x570],rax
     122c113:	f3 41 0f 7f 85 e8 05 	movdqu XMMWORD PTR [r13+0x5e8],xmm0
     122c11a:	00 00 
     122c11c:	f3 41 0f 7f 85 d8 05 	movdqu XMMWORD PTR [r13+0x5d8],xmm0
     122c123:	00 00 
     122c125:	f3 41 0f 7f 85 c8 05 	movdqu XMMWORD PTR [r13+0x5c8],xmm0

### 0x122c67d: lea    rax,[rip+0x630ff4]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>; FDE=(19056020, 19056716)
     122c67d:	48 8d 05 f4 0f 63 00 	lea    rax,[rip+0x630ff4]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     122c684:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     122c688:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     122c68d:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     122c691:	8b 44 24 0c          	mov    eax,DWORD PTR [rsp+0xc]
     122c695:	41 88 46 28          	mov    BYTE PTR [r14+0x28],al
     122c699:	0f 57 c0             	xorps  xmm0,xmm0

### 0x122c852: lea    rax,[rip+0x630e1f]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>; FDE=(19056716, 19056859)
     122c852:	48 8d 05 1f 0e 63 00 	lea    rax,[rip+0x630e1f]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     122c859:	48 89 07             	mov    QWORD PTR [rdi],rax
     122c85c:	48 83 c7 08          	add    rdi,0x8
     122c860:	48 83 c6 08          	add    rsi,0x8
     122c864:	6a 4a                	push   0x4a
     122c866:	59                   	pop    rcx
     122c867:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]

### 0x122d6c0: lea    rax,[rip+0x62fb59]        # 185d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19908>; FDE=(19060416, 19060431)
     122d6c0:	48 8d 05 59 fb 62 00 	lea    rax,[rip+0x62fb59]        # 185d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19908>
     122d6c7:	48 89 07             	mov    QWORD PTR [rdi],rax
     122d6ca:	e9 41 09 5c 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     122d6cf:	cc                   	int3
     122d6d0:	53                   	push   rbx
     122d6d1:	48 89 fb             	mov    rbx,rdi
     122d6d4:	e8 e7 ff ff ff       	call   122d6c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72c44>

### 0x122d6ec: lea    rax,[rip+0x62fab5]        # 185d1a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19890>; FDE=(19060460, 19060475)
     122d6ec:	48 8d 05 b5 fa 62 00 	lea    rax,[rip+0x62fab5]        # 185d1a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19890>
     122d6f3:	48 89 07             	mov    QWORD PTR [rdi],rax
     122d6f6:	e9 15 09 5c 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     122d6fb:	cc                   	int3
     122d6fc:	53                   	push   rbx
     122d6fd:	48 89 fb             	mov    rbx,rdi
     122d700:	e8 e7 ff ff ff       	call   122d6ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x72c70>

### 0x122e83e: lea    rax,[rip+0x62ed33]        # 185d578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19c60>; FDE=(19063258, 19073670)
     122e83e:	48 8d 05 33 ed 62 00 	lea    rax,[rip+0x62ed33]        # 185d578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19c60>
     122e845:	49 89 06             	mov    QWORD PTR [r14],rax
     122e848:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     122e84c:	49 89 6e 10          	mov    QWORD PTR [r14+0x10],rbp
     122e850:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
     122e854:	4c 89 f6             	mov    rsi,r14
     122e857:	e8 8e 13 17 00       	call   139fbea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e516e>

### 0x122e870: lea    rax,[rip+0x62ed49]        # 185d5c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19ca8>; FDE=(19063258, 19073670)
     122e870:	48 8d 05 49 ed 62 00 	lea    rax,[rip+0x62ed49]        # 185d5c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19ca8>
     122e877:	48 89 84 24 40 04 00 	mov    QWORD PTR [rsp+0x440],rax
     122e87e:	00 
     122e87f:	4c 89 a4 24 48 04 00 	mov    QWORD PTR [rsp+0x448],r12
     122e886:	00 
     122e887:	48 89 ac 24 50 04 00 	mov    QWORD PTR [rsp+0x450],rbp
     122e88e:	00 

### 0x1230aba: lea    rax,[rip+0x62c75f]        # 185d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19908>; FDE=(19073670, 19073822)
     1230aba:	48 8d 05 5f c7 62 00 	lea    rax,[rip+0x62c75f]        # 185d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19908>
     1230ac1:	49 89 06             	mov    QWORD PTR [r14],rax
     1230ac4:	4d 89 f7             	mov    r15,r14
     1230ac7:	49 83 c7 18          	add    r15,0x18
     1230acb:	4c 89 ff             	mov    rdi,r15
     1230ace:	4c 89 e6             	mov    rsi,r12
     1230ad1:	e8 80 4a 00 00       	call   1235556 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7aada>

### 0x12311d2: lea    rax,[rip+0x653197]        # 1884370 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40a58>; FDE=(19075218, 19076490)
     12311d2:	48 8d 05 97 31 65 00 	lea    rax,[rip+0x653197]        # 1884370 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40a58>
     12311d9:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     12311de:	0f 57 c0             	xorps  xmm0,xmm0
     12311e1:	0f 11 84 24 80 00 00 	movups XMMWORD PTR [rsp+0x80],xmm0
     12311e8:	00 
     12311e9:	0f 11 84 24 90 00 00 	movups XMMWORD PTR [rsp+0x90],xmm0
     12311f0:	00 

### 0x123355b: lea    r12,[rip+0x629f66]        # 185d4c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19bb0>; FDE=(19084208, 19086529)
     123355b:	4c 8d 25 66 9f 62 00 	lea    r12,[rip+0x629f66]        # 185d4c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19bb0>
     1233562:	4c 8d ac 24 10 01 00 	lea    r13,[rsp+0x110]
     1233569:	00 
     123356a:	48 8d 84 24 80 00 00 	lea    rax,[rsp+0x80]
     1233571:	00 
     1233572:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1233579:	00 

### 0x1233677: lea    rdx,[rip+0x6e0ba2]        # 1914220 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b630>; FDE=(19084208, 19086529)
     1233677:	48 8d 15 a2 0b 6e 00 	lea    rdx,[rip+0x6e0ba2]        # 1914220 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b630>
     123367e:	48 89 74 24 28       	mov    QWORD PTR [rsp+0x28],rsi
     1233683:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1233686:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123368b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     123368e:	ff 90 88 00 00 00    	call   QWORD PTR [rax+0x88]
     1233694:	8a 08                	mov    cl,BYTE PTR [rax]

### 0x123393a: lea    r15,[rip+0x629b9f]        # 185d4e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19bc8>; FDE=(19084208, 19086529)
     123393a:	4c 8d 3d 9f 9b 62 00 	lea    r15,[rip+0x629b9f]        # 185d4e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19bc8>
     1233941:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
     1233946:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     123394a:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     1233951:	00 
     1233952:	48 8d 84 24 10 01 00 	lea    rax,[rsp+0x110]
     1233959:	00 

### 0x1233b3c: lea    rcx,[rip+0x6e06dd]        # 1914220 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b630>; FDE=(19084208, 19086529)
     1233b3c:	48 8d 0d dd 06 6e 00 	lea    rcx,[rip+0x6e06dd]        # 1914220 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b630>
     1233b43:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     1233b47:	c6 40 20 01          	mov    BYTE PTR [rax+0x20],0x1
     1233b4b:	4c 8d 84 24 80 01 00 	lea    r8,[rsp+0x180]
     1233b52:	00 
     1233b53:	49 89 00             	mov    QWORD PTR [r8],rax
     1233b56:	48 8d 05 4b 37 f0 ff 	lea    rax,[rip+0xfffffffffff0374b]        # 11372a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fe6be>

### 0x12342d7: lea    rax,[rip+0x628f42]        # 185d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19908>; FDE=(19086754, 19091700)
     12342d7:	48 8d 05 42 8f 62 00 	lea    rax,[rip+0x628f42]        # 185d220 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19908>
     12342de:	49 89 06             	mov    QWORD PTR [r14],rax
     12342e1:	4d 8d 66 18          	lea    r12,[r14+0x18]
     12342e5:	4c 89 e7             	mov    rdi,r12
     12342e8:	48 89 de             	mov    rsi,rbx
     12342eb:	e8 66 12 00 00       	call   1235556 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7aada>
     12342f0:	31 ff                	xor    edi,edi

### 0x123453f: lea    rax,[rip+0x6290c2]        # 185d608 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19cf0>; FDE=(19086754, 19091700)
     123453f:	48 8d 05 c2 90 62 00 	lea    rax,[rip+0x6290c2]        # 185d608 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19cf0>
     1234546:	49 89 07             	mov    QWORD PTR [r15],rax
     1234549:	48 8d 9c 24 a0 09 00 	lea    rbx,[rsp+0x9a0]
     1234550:	00 
     1234551:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
     1234558:	00 
     1234559:	48 89 df             	mov    rdi,rbx

### 0x123457d: lea    rax,[rip+0x6290bc]        # 185d640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d28>; FDE=(19086754, 19091700)
     123457d:	48 8d 05 bc 90 62 00 	lea    rax,[rip+0x6290bc]        # 185d640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d28>
     1234584:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1234588:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
     123458d:	48 89 de             	mov    rsi,rbx
     1234590:	e8 0b 03 fe ff       	call   12148a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x59e24>
     1234595:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     123459a:	41 0f 11 87 c0 06 00 	movups XMMWORD PTR [r15+0x6c0],xmm0

### 0x12345b0: lea    rax,[rip+0x6290c1]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>; FDE=(19086754, 19091700)
     12345b0:	48 8d 05 c1 90 62 00 	lea    rax,[rip+0x6290c1]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     12345b7:	49 89 87 e0 06 00 00 	mov    QWORD PTR [r15+0x6e0],rax
     12345be:	49 8d bf e8 06 00 00 	lea    rdi,[r15+0x6e8]
     12345c5:	49 8d 74 24 18       	lea    rsi,[r12+0x18]
     12345ca:	6a 4a                	push   0x4a
     12345cc:	59                   	pop    rcx
     12345cd:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]

### 0x12346ea: lea    rax,[rip+0x628f87]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>; FDE=(19086754, 19091700)
     12346ea:	48 8d 05 87 8f 62 00 	lea    rax,[rip+0x628f87]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     12346f1:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     12346f5:	4c 89 f7             	mov    rdi,r14
     12346f8:	48 83 c7 20          	add    rdi,0x20
     12346fc:	49 8d 75 20          	lea    rsi,[r13+0x20]
     1234700:	6a 4a                	push   0x4a
     1234702:	59                   	pop    rcx

### 0x1234a84: lea    rcx,[rip+0x628f2d]        # 185d9b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a0a0>; FDE=(19086754, 19091700)
     1234a84:	48 8d 0d 2d 8f 62 00 	lea    rcx,[rip+0x628f2d]        # 185d9b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a0a0>
     1234a8b:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     1234a8f:	48 8b 4c 24 58       	mov    rcx,QWORD PTR [rsp+0x58]
     1234a94:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     1234a98:	4c 89 78 28          	mov    QWORD PTR [rax+0x28],r15
     1234a9c:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
     1234aa1:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx

### 0x1235578: lea    rax,[rip+0x627cd9]        # 185d258 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19940>; FDE=(19092822, 19111208)
     1235578:	48 8d 05 d9 7c 62 00 	lea    rax,[rip+0x627cd9]        # 185d258 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19940>
     123557f:	48 89 07             	mov    QWORD PTR [rdi],rax
     1235582:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
     1235586:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
     123558b:	4c 8d 76 08          	lea    r14,[rsi+0x8]
     123558f:	0f 57 c0             	xorps  xmm0,xmm0
     1235592:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0

### 0x1237dbc: lea    rax,[rip+0x63dc15]        # 18759d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320c0>; FDE=(19092822, 19111208)
     1237dbc:	48 8d 05 15 dc 63 00 	lea    rax,[rip+0x63dc15]        # 18759d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320c0>
     1237dc3:	49 89 45 28          	mov    QWORD PTR [r13+0x28],rax
     1237dc7:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     1237dcb:	40 f6 c6 01          	test   sil,0x1
     1237dcf:	74 14                	je     1237de5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7d369>
     1237dd1:	4c 89 ef             	mov    rdi,r13
     1237dd4:	48 83 c7 30          	add    rdi,0x30

### 0x123a57a: lea    rax,[rip+0x623087]        # 185d608 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19cf0>; FDE=(19113338, 19113353)
     123a57a:	48 8d 05 87 30 62 00 	lea    rax,[rip+0x623087]        # 185d608 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19cf0>
     123a581:	48 89 07             	mov    QWORD PTR [rdi],rax
     123a584:	e9 87 3a 5b 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     123a589:	cc                   	int3
     123a58a:	53                   	push   rbx
     123a58b:	48 89 fb             	mov    rbx,rdi
     123a58e:	e8 e7 ff ff ff       	call   123a57a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7fafe>

### 0x123b41f: lea    rax,[rip+0x63a67a]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>; FDE=(19117082, 19117139)
     123b41f:	48 8d 05 7a a6 63 00 	lea    rax,[rip+0x63a67a]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>
     123b426:	48 89 07             	mov    QWORD PTR [rdi],rax
     123b429:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
     123b42c:	89 47 18             	mov    DWORD PTR [rdi+0x18],eax
     123b42f:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     123b433:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     123b437:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]

### 0x123d795: lea    rax,[rip+0x6462bc]        # 1883a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40140>; FDE=(19122204, 19140568)
     123d795:	48 8d 05 bc 62 64 00 	lea    rax,[rip+0x6462bc]        # 1883a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40140>
     123d79c:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
     123d7a3:	00 
     123d7a4:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
     123d7ab:	00 00 
     123d7ad:	48 8d 83 98 08 00 00 	lea    rax,[rbx+0x898]
     123d7b4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### 0x123dd20: lea    rcx,[rip+0x637d79]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>; FDE=(19122204, 19140568)
     123dd20:	48 8d 0d 79 7d 63 00 	lea    rcx,[rip+0x637d79]        # 1875aa0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32188>
     123dd27:	48 89 4a f8          	mov    QWORD PTR [rdx-0x8],rcx
     123dd2b:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0
     123dd2f:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     123dd32:	83 62 10 00          	and    DWORD PTR [rdx+0x10],0x0
     123dd36:	89 43 20             	mov    DWORD PTR [rbx+0x20],eax
     123dd39:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]

### 0x123e3e2: lea    rax,[rip+0x65a00f]        # 18983f8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5338>; FDE=(19122204, 19140568)
     123e3e2:	48 8d 05 0f a0 65 00 	lea    rax,[rip+0x65a00f]        # 18983f8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5338>
     123e3e9:	49 89 06             	mov    QWORD PTR [r14],rax
     123e3ec:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
     123e3f1:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
     123e3f6:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
     123e3fb:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     123e400:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]

### 0x123e80d: lea    rax,[rip+0x637244]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>; FDE=(19122204, 19140568)
     123e80d:	48 8d 05 44 72 63 00 	lea    rax,[rip+0x637244]        # 1875a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x32140>
     123e814:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
     123e818:	83 61 10 00          	and    DWORD PTR [rcx+0x10],0x0
     123e81c:	c7 43 20 00 00 80 3f 	mov    DWORD PTR [rbx+0x20],0x3f800000
     123e823:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     123e828:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
     123e82c:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]

### 0x123f072: lea    rax,[rip+0x63695f]        # 18759d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320c0>; FDE=(19122204, 19140568)
     123f072:	48 8d 05 5f 69 63 00 	lea    rax,[rip+0x63695f]        # 18759d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320c0>
     123f079:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
     123f080:	00 
     123f081:	48 8d 84 24 90 02 00 	lea    rax,[rsp+0x290]
     123f088:	00 
     123f089:	0f 57 c0             	xorps  xmm0,xmm0
     123f08c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0

### 0x123f1b5: lea    rax,[rip+0x63681c]        # 18759d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320c0>; FDE=(19122204, 19140568)
     123f1b5:	48 8d 05 1c 68 63 00 	lea    rax,[rip+0x63681c]        # 18759d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x320c0>
     123f1bc:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     123f1c0:	0f 57 c0             	xorps  xmm0,xmm0
     123f1c3:	41 0f 11 47 38       	movups XMMWORD PTR [r15+0x38],xmm0
     123f1c8:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
     123f1cd:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
     123f1d2:	48 8b 84 24 88 02 00 	mov    rax,QWORD PTR [rsp+0x288]

### 0x123f4f5: lea    rax,[rip+0x61e884]        # 185dd80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a468>; FDE=(19122204, 19140568)
     123f4f5:	48 8d 05 84 e8 61 00 	lea    rax,[rip+0x61e884]        # 185dd80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a468>
     123f4fc:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     123f500:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
     123f505:	c7 84 24 a0 02 00 00 	mov    DWORD PTR [rsp+0x2a0],0x3f800000
     123f50c:	00 00 80 3f 
     123f510:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     123f515:	4c 8b 68 08          	mov    r13,QWORD PTR [rax+0x8]

### 0x123f8f7: lea    rax,[rip+0x61e432]        # 185dd30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a418>; FDE=(19122204, 19140568)
     123f8f7:	48 8d 05 32 e4 61 00 	lea    rax,[rip+0x61e432]        # 185dd30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a418>
     123f8fe:	48 89 84 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rax
     123f905:	00 
     123f906:	0f 11 84 24 20 02 00 	movups XMMWORD PTR [rsp+0x220],xmm0
     123f90d:	00 
     123f90e:	0f 11 84 24 30 02 00 	movups XMMWORD PTR [rsp+0x230],xmm0
     123f915:	00 

### 0x123fd6e: lea    rax,[rip+0x643c5b]        # 18839d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x400b8>; FDE=(19122204, 19140568)
     123fd6e:	48 8d 05 5b 3c 64 00 	lea    rax,[rip+0x643c5b]        # 18839d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x400b8>
     123fd75:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax
     123fd79:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
     123fd7e:	41 80 7f 48 00       	cmp    BYTE PTR [r15+0x48],0x0
     123fd83:	0f 84 bf 00 00 00    	je     123fe48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x853cc>
     123fd89:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]
     123fd8d:	49 8b 77 40          	mov    rsi,QWORD PTR [r15+0x40]

### 0x124280e: lea    rcx,[rip+0x641403]        # 1883c18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40300>; FDE=(19146690, 19147925)
     124280e:	48 8d 0d 03 14 64 00 	lea    rcx,[rip+0x641403]        # 1883c18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40300>
     1242815:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     124281a:	66 0f 57 c0          	xorpd  xmm0,xmm0
     124281e:	66 0f 11 44 24 18    	movupd XMMWORD PTR [rsp+0x18],xmm0
     1242824:	66 0f 11 44 24 28    	movupd XMMWORD PTR [rsp+0x28],xmm0
     124282a:	48 8d 0d c7 cf 1f ff 	lea    rcx,[rip+0xffffffffff1fcfc7]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     1242831:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx

### 0x12428bb: lea    rcx,[rip+0x6411ee]        # 1883ab0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40198>; FDE=(19146690, 19147925)
     12428bb:	48 8d 0d ee 11 64 00 	lea    rcx,[rip+0x6411ee]        # 1883ab0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40198>
     12428c2:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     12428c7:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     12428cd:	66 0f 57 c0          	xorpd  xmm0,xmm0
     12428d1:	66 0f 11 44 24 18    	movupd XMMWORD PTR [rsp+0x18],xmm0
     12428d7:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
     12428db:	74 4f                	je     124292c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87eb0>

### 0x1242955: lea    rcx,[rip+0x64135c]        # 1883cb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x403a0>; FDE=(19146690, 19147925)
     1242955:	48 8d 0d 5c 13 64 00 	lea    rcx,[rip+0x64135c]        # 1883cb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x403a0>
     124295c:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     1242961:	66 0f 57 c0          	xorpd  xmm0,xmm0
     1242965:	66 0f 11 44 24 30    	movupd XMMWORD PTR [rsp+0x30],xmm0
     124296b:	66 0f 11 44 24 18    	movupd XMMWORD PTR [rsp+0x18],xmm0
     1242971:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
     1242975:	74 52                	je     12429c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87f4d>

### 0x12429f6: lea    rcx,[rip+0x641303]        # 1883d00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x403e8>; FDE=(19146690, 19147925)
     12429f6:	48 8d 0d 03 13 64 00 	lea    rcx,[rip+0x641303]        # 1883d00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x403e8>
     12429fd:	49 89 4c 24 f8       	mov    QWORD PTR [r12-0x8],rcx
     1242a02:	66 0f 57 c0          	xorpd  xmm0,xmm0
     1242a06:	66 41 0f 11 44 24 08 	movupd XMMWORD PTR [r12+0x8],xmm0
     1242a0d:	41 c6 44 24 18 00    	mov    BYTE PTR [r12+0x18],0x0
     1242a13:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
     1242a17:	74 5b                	je     1242a74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87ff8>

### 0x1242a9b: lea    rcx,[rip+0x6410d6]        # 1883b78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40260>; FDE=(19146690, 19147925)
     1242a9b:	48 8d 0d d6 10 64 00 	lea    rcx,[rip+0x6410d6]        # 1883b78 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40260>
     1242aa2:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
     1242aa7:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     1242aae:	00 00 
     1242ab0:	66 0f 57 c0          	xorpd  xmm0,xmm0
     1242ab4:	66 0f 11 44 24 70    	movupd XMMWORD PTR [rsp+0x70],xmm0
     1242aba:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0

### 0x1242b3c: lea    rcx,[rip+0x647afd]        # 188a640 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3318>; FDE=(19146690, 19147925)
     1242b3c:	48 8d 0d fd 7a 64 00 	lea    rcx,[rip+0x647afd]        # 188a640 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3318>
     1242b43:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     1242b48:	66 0f 57 c0          	xorpd  xmm0,xmm0
     1242b4c:	66 0f 11 44 24 18    	movupd XMMWORD PTR [rsp+0x18],xmm0
     1242b52:	66 0f 11 44 24 24    	movupd XMMWORD PTR [rsp+0x24],xmm0
     1242b58:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
     1242b5c:	74 7f                	je     1242bdd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x88161>

### 0x1243551: lea    rax,[rip+0x640500]        # 1883a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40140>; FDE=(19149992, 19150927)
     1243551:	48 8d 05 00 05 64 00 	lea    rax,[rip+0x640500]        # 1883a58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40140>
     1243558:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
     124355f:	00 
     1243560:	0f 57 c0             	xorps  xmm0,xmm0
     1243563:	0f 11 84 24 90 01 00 	movups XMMWORD PTR [rsp+0x190],xmm0
     124356a:	00 
     124356b:	0f 11 84 24 a0 01 00 	movups XMMWORD PTR [rsp+0x1a0],xmm0

### 0x12479c2: lea    rcx,[rip+0x615bf7]        # 185d5c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19ca8>; FDE=(19167670, 19167702)
     12479c2:	48 8d 0d f7 5b 61 00 	lea    rcx,[rip+0x615bf7]        # 185d5c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19ca8>
     12479c9:	48 89 08             	mov    QWORD PTR [rax],rcx
     12479cc:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     12479d0:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     12479d4:	5b                   	pop    rbx
     12479d5:	c3                   	ret
     12479d6:	48 8d 05 e3 5b 61 00 	lea    rax,[rip+0x615be3]        # 185d5c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19ca8>

### 0x12479d6: lea    rax,[rip+0x615be3]        # 185d5c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19ca8>; FDE=(19167702, 19167721)
     12479d6:	48 8d 05 e3 5b 61 00 	lea    rax,[rip+0x615be3]        # 185d5c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19ca8>
     12479dd:	48 89 06             	mov    QWORD PTR [rsi],rax
     12479e0:	0f 10 47 08          	movups xmm0,XMMWORD PTR [rdi+0x8]
     12479e4:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
     12479e8:	c3                   	ret
     12479e9:	cc                   	int3
     12479ea:	55                   	push   rbp

### 0x1247ba0: lea    rcx,[rip+0x6159d1]        # 185d578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19c60>; FDE=(19168148, 19168180)
     1247ba0:	48 8d 0d d1 59 61 00 	lea    rcx,[rip+0x6159d1]        # 185d578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19c60>
     1247ba7:	48 89 08             	mov    QWORD PTR [rax],rcx
     1247baa:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
     1247bae:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     1247bb2:	5b                   	pop    rbx
     1247bb3:	c3                   	ret
     1247bb4:	48 8d 05 bd 59 61 00 	lea    rax,[rip+0x6159bd]        # 185d578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19c60>

### 0x1247bb4: lea    rax,[rip+0x6159bd]        # 185d578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19c60>; FDE=(19168180, 19168199)
     1247bb4:	48 8d 05 bd 59 61 00 	lea    rax,[rip+0x6159bd]        # 185d578 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19c60>
     1247bbb:	48 89 06             	mov    QWORD PTR [rsi],rax
     1247bbe:	0f 10 47 08          	movups xmm0,XMMWORD PTR [rdi+0x8]
     1247bc2:	0f 11 46 08          	movups XMMWORD PTR [rsi+0x8],xmm0
     1247bc6:	c3                   	ret
     1247bc7:	cc                   	int3
     1247bc8:	55                   	push   rbp

### 0x1248381: lea    rax,[rip+0x615870]        # 185dbf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a2e0>; FDE=(19170116, 19171791)
     1248381:	48 8d 05 70 58 61 00 	lea    rax,[rip+0x615870]        # 185dbf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a2e0>
     1248388:	49 89 07             	mov    QWORD PTR [r15],rax
     124838b:	48 8d 05 9e 58 61 00 	lea    rax,[rip+0x61589e]        # 185dc30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a318>
     1248392:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1248396:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
     124839a:	4d 89 77 28          	mov    QWORD PTR [r15+0x28],r14
     124839e:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0

### 0x124838b: lea    rax,[rip+0x61589e]        # 185dc30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a318>; FDE=(19170116, 19171791)
     124838b:	48 8d 05 9e 58 61 00 	lea    rax,[rip+0x61589e]        # 185dc30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a318>
     1248392:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     1248396:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
     124839a:	4d 89 77 28          	mov    QWORD PTR [r15+0x28],r14
     124839e:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     12483a3:	41 0f 11 47 40       	movups XMMWORD PTR [r15+0x40],xmm0
     12483a8:	b8 00 00 80 3f       	mov    eax,0x3f800000

### 0x1248561: lea    rcx,[rip+0x6156f0]        # 185dc58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a340>; FDE=(19170116, 19171791)
     1248561:	48 8d 0d f0 56 61 00 	lea    rcx,[rip+0x6156f0]        # 185dc58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a340>
     1248568:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     124856c:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1248571:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
     1248575:	48 89 68 28          	mov    QWORD PTR [rax+0x28],rbp
     1248579:	c6 44 24 68 01       	mov    BYTE PTR [rsp+0x68],0x1
     124857e:	48 8b 6c 24 08       	mov    rbp,QWORD PTR [rsp+0x8]

### 0x1248a90: lea    rax,[rip+0x615161]        # 185dbf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a2e0>; FDE=(19171984, 19171999)
     1248a90:	48 8d 05 61 51 61 00 	lea    rax,[rip+0x615161]        # 185dbf8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a2e0>
     1248a97:	48 89 07             	mov    QWORD PTR [rdi],rax
     1248a9a:	e9 71 55 5a 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     1248a9f:	cc                   	int3
     1248aa0:	53                   	push   rbx
     1248aa1:	48 89 fb             	mov    rbx,rdi
     1248aa4:	e8 e7 ff ff ff       	call   1248a90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e014>

### 0x124a3df: lea    rax,[rip+0x6ca05a]        # 1914440 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b850>; FDE=(19178456, 19178481)
     124a3df:	48 8d 05 5a a0 6c 00 	lea    rax,[rip+0x6ca05a]        # 1914440 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b850>
     124a3e6:	48 8b 0d 5b a0 6c 00 	mov    rcx,QWORD PTR [rip+0x6ca05b]        # 1914448 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b858>
     124a3ed:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     124a3f0:	c3                   	ret
     124a3f1:	cc                   	int3
     124a3f2:	48 89 f0             	mov    rax,rsi
     124a3f5:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx

### 0x124a3e6: mov    rcx,QWORD PTR [rip+0x6ca05b]        # 1914448 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b858>; FDE=(19178456, 19178481)
     124a3e6:	48 8b 0d 5b a0 6c 00 	mov    rcx,QWORD PTR [rip+0x6ca05b]        # 1914448 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5b858>
     124a3ed:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     124a3f0:	c3                   	ret
     124a3f1:	cc                   	int3
     124a3f2:	48 89 f0             	mov    rax,rsi
     124a3f5:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     124a3f9:	48 8d 0d 30 39 61 00 	lea    rcx,[rip+0x613930]        # 185dd30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a418>

### 0x124a3f9: lea    rcx,[rip+0x613930]        # 185dd30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a418>; FDE=(19178482, 19178531)
     124a3f9:	48 8d 0d 30 39 61 00 	lea    rcx,[rip+0x613930]        # 185dd30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a418>
     124a400:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     124a403:	0f 57 c0             	xorps  xmm0,xmm0
     124a406:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     124a40b:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     124a40f:	48 89 56 28          	mov    QWORD PTR [rsi+0x28],rdx
     124a413:	48 8d 0d de 53 1f ff 	lea    rcx,[rip+0xffffffffff1f53de]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>

### 0x124a42b: lea    rcx,[rip+0x6138be]        # 185dcf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a3d8>; FDE=(19178532, 19178561)
     124a42b:	48 8d 0d be 38 61 00 	lea    rcx,[rip+0x6138be]        # 185dcf0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a3d8>
     124a432:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     124a435:	0f 57 c0             	xorps  xmm0,xmm0
     124a438:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     124a43c:	83 66 20 00          	and    DWORD PTR [rsi+0x20],0x0
     124a440:	c3                   	ret
     124a441:	cc                   	int3

### 0x124a463: lea    rax,[rip+0x6ca196]        # 1914600 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ba10>; FDE=(19178588, 19178613)
     124a463:	48 8d 05 96 a1 6c 00 	lea    rax,[rip+0x6ca196]        # 1914600 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ba10>
     124a46a:	48 8b 0d 97 a1 6c 00 	mov    rcx,QWORD PTR [rip+0x6ca197]        # 1914608 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ba18>
     124a471:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     124a474:	c3                   	ret
     124a475:	cc                   	int3
     124a476:	48 89 f0             	mov    rax,rsi
     124a479:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx

### 0x124a46a: mov    rcx,QWORD PTR [rip+0x6ca197]        # 1914608 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ba18>; FDE=(19178588, 19178613)
     124a46a:	48 8b 0d 97 a1 6c 00 	mov    rcx,QWORD PTR [rip+0x6ca197]        # 1914608 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5ba18>
     124a471:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     124a474:	c3                   	ret
     124a475:	cc                   	int3
     124a476:	48 89 f0             	mov    rax,rsi
     124a479:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     124a47d:	48 8d 0d fc 38 61 00 	lea    rcx,[rip+0x6138fc]        # 185dd80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a468>

### 0x124a47d: lea    rcx,[rip+0x6138fc]        # 185dd80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a468>; FDE=(19178614, 19178641)
     124a47d:	48 8d 0d fc 38 61 00 	lea    rcx,[rip+0x6138fc]        # 185dd80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a468>
     124a484:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     124a487:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     124a48c:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     124a490:	c3                   	ret
     124a491:	41 57                	push   r15
     124a493:	41 56                	push   r14

### 0x124b51a: lea    rax,[rip+0x6128df]        # 185de00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a4e8>; FDE=(19182592, 19183826)
     124b51a:	48 8d 05 df 28 61 00 	lea    rax,[rip+0x6128df]        # 185de00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a4e8>
     124b521:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     124b525:	49 8d 7d 18          	lea    rdi,[r13+0x18]
     124b529:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     124b52e:	45 31 e4             	xor    r12d,r12d
     124b531:	ba 38 09 00 00       	mov    edx,0x938
     124b536:	31 f6                	xor    esi,esi

