# Final Skip Ad readiness receiver vptr

Proven chain:
- 0x122190f -> rsp+0x1338 points at a 0x6b0-stride element
- e9c8ec -> rsp+0x770
- e9ccf3 -> state+0x10
- efc630 -> adapter receiver
- fd384d -> receiver vtable +0x140, EAX must be zero

## base copy 0x12240f8 FDE=(19022072, 19022272)
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

## full copy 0x12240cc FDE=(19022028, 19022072)
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

## tail copy +0x160 0x108dcd4 FDE=(17358036, 17358525)
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

## source builder from 0x550 element 0x122385e FDE=(19019870, 19019913)
     122385e:	41 56                	push   r14
     1223860:	53                   	push   rbx
     1223861:	50                   	push   rax
     1223862:	48 89 f3             	mov    rbx,rsi
     1223865:	49 89 fe             	mov    r14,rdi
     1223868:	48 83 c6 18          	add    rsi,0x18
     122386c:	e8 cf a6 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1223871:	8a 43 40             	mov    al,BYTE PTR [rbx+0x40]
     1223874:	41 88 46 28          	mov    BYTE PTR [r14+0x28],al
     1223878:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]
     122387c:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
     1223881:	48 83 c4 08          	add    rsp,0x8
     1223885:	5b                   	pop    rbx
     1223886:	41 5e                	pop    r14
     1223888:	c3                   	ret

## Source builder high-address constants / direct vptr stores
## Writes to destination head in source builder
- 0x1223874: mov    BYTE PTR [r14+0x28],al
     1223862:	48 89 f3             	mov    rbx,rsi
     1223865:	49 89 fe             	mov    r14,rdi
     1223868:	48 83 c6 18          	add    rsi,0x18
     122386c:	e8 cf a6 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1223871:	8a 43 40             	mov    al,BYTE PTR [rbx+0x40]
     1223874:	41 88 46 28          	mov    BYTE PTR [r14+0x28],al
     1223878:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]
     122387c:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
     1223881:	48 83 c4 08          	add    rsp,0x8
     1223885:	5b                   	pop    rbx
     1223886:	41 5e                	pop    r14
     1223888:	c3                   	ret

- 0x122387c: movups XMMWORD PTR [r14+0x18],xmm0
     1223868:	48 83 c6 18          	add    rsi,0x18
     122386c:	e8 cf a6 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1223871:	8a 43 40             	mov    al,BYTE PTR [rbx+0x40]
     1223874:	41 88 46 28          	mov    BYTE PTR [r14+0x28],al
     1223878:	0f 10 43 30          	movups xmm0,XMMWORD PTR [rbx+0x30]
     122387c:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
     1223881:	48 83 c4 08          	add    rsp,0x8
     1223885:	5b                   	pop    rbx
     1223886:	41 5e                	pop    r14
     1223888:	c3                   	ret

## All direct calls to source builder 0x122385e
### caller 0x1220c6c FDE=(19006804, 19014400)
     1220c18:	48 85 c9             	test   rcx,rcx
     1220c1b:	0f 84 e1 01 00 00    	je     1220e02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66386>
     1220c21:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     1220c28:	00 
     1220c29:	4c 89 ee             	mov    rsi,r13
     1220c2c:	e8 bd ea 87 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1220c31:	84 c0                	test   al,al
     1220c33:	0f 85 c9 01 00 00    	jne    1220e02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66386>
     1220c39:	48 8d 9c 24 e0 25 00 	lea    rbx,[rsp+0x25e0]
     1220c40:	00 
     1220c41:	48 89 df             	mov    rdi,rbx
     1220c44:	e8 21 92 ff ff       	call   1219e6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f3ee>
     1220c49:	ba 60 02 00 00       	mov    edx,0x260
     1220c4e:	48 89 df             	mov    rdi,rbx
     1220c51:	31 f6                	xor    esi,esi
     1220c53:	e8 38 df 5c 00       	call   17eeb90 <memset@plt>
     1220c58:	c6 83 60 02 00 00 01 	mov    BYTE PTR [rbx+0x260],0x1
     1220c5f:	48 8d bc 24 80 13 00 	lea    rdi,[rsp+0x1380]
     1220c66:	00 
     1220c67:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     1220c6c:	e8 ed 2b 00 00       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1220c71:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1220c76:	4c 8d b8 48 0a 00 00 	lea    r15,[rax+0xa48]
     1220c7d:	4c 8b b0 48 0a 00 00 	mov    r14,QWORD PTR [rax+0xa48]
     1220c84:	4d 85 f6             	test   r14,r14
     1220c87:	74 48                	je     1220cd1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66255>
     1220c89:	48 8d 9c 24 80 13 00 	lea    rbx,[rsp+0x1380]
     1220c90:	00 
     1220c91:	4d 89 fc             	mov    r12,r15
     1220c94:	49 8d 7e 20          	lea    rdi,[r14+0x20]
     1220c98:	48 89 de             	mov    rsi,rbx
     1220c9b:	e8 20 90 ff ff       	call   1219cc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f244>
     1220ca0:	49 8d 4e 08          	lea    rcx,[r14+0x8]
     1220ca4:	84 c0                	test   al,al
     1220ca6:	49 0f 49 ce          	cmovns rcx,r14
     1220caa:	4d 0f 49 e6          	cmovns r12,r14
     1220cae:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
     1220cb1:	4d 85 f6             	test   r14,r14
     1220cb4:	75 de                	jne    1220c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66218>
     1220cb6:	4d 39 fc             	cmp    r12,r15
     1220cb9:	74 16                	je     1220cd1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66255>
     1220cbb:	49 8d 74 24 20       	lea    rsi,[r12+0x20]
     1220cc0:	48 8d bc 24 80 13 00 	lea    rdi,[rsp+0x1380]
     1220cc7:	00 
     1220cc8:	e8 f3 8f ff ff       	call   1219cc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f244>
     1220ccd:	84 c0                	test   al,al
     1220ccf:	79 03                	jns    1220cd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66258>
     1220cd1:	4d 89 fc             	mov    r12,r15
     1220cd4:	4c 8d b4 24 80 13 00 	lea    r14,[rsp+0x1380]
     1220cdb:	00 
     1220cdc:	4c 89 f7             	mov    rdi,r14
     1220cdf:	e8 ac d1 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1220ce4:	4d 39 fc             	cmp    r12,r15
     1220ce7:	74 0e                	je     1220cf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6627b>
     1220ce9:	41 83 bc 24 f4 02 00 	cmp    DWORD PTR [r12+0x2f4],0x3
     1220cf0:	00 03 

### caller 0x1221563 FDE=(19006804, 19014400)
     122150a:	e8 57 b2 8a ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     122150f:	48 8d bc 24 20 11 00 	lea    rdi,[rsp+0x1120]
     1221516:	00 
     1221517:	48 8d b3 78 04 00 00 	lea    rsi,[rbx+0x478]
     122151e:	e8 dd 23 00 00       	call   1223900 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68e84>
     1221523:	48 8d 83 40 0a 00 00 	lea    rax,[rbx+0xa40]
     122152a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     122152f:	48 8b bb 38 0a 00 00 	mov    rdi,QWORD PTR [rbx+0xa38]
     1221536:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1221539:	ff 50 40             	call   QWORD PTR [rax+0x40]
     122153c:	49 89 c6             	mov    r14,rax
     122153f:	48 8b bb 38 0a 00 00 	mov    rdi,QWORD PTR [rbx+0xa38]
     1221546:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1221549:	ff 50 28             	call   QWORD PTR [rax+0x28]
     122154c:	49 89 c7             	mov    r15,rax
     122154f:	80 bd 60 05 00 00 00 	cmp    BYTE PTR [rbp+0x560],0x0
     1221556:	74 39                	je     1221591 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b15>
     1221558:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
     122155f:	00 
     1221560:	4c 89 ee             	mov    rsi,r13
     1221563:	e8 f6 22 00 00       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1221568:	48 8d 9c 24 20 01 00 	lea    rbx,[rsp+0x120]
     122156f:	00 
     1221570:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1221575:	48 89 de             	mov    rsi,rbx
     1221578:	e8 14 8f 02 00       	call   124a491 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa15>
     122157d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1221582:	48 89 df             	mov    rdi,rbx
     1221585:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     122158a:	e8 01 c9 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     122158f:	eb 07                	jmp    1221598 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b1c>
     1221591:	31 c0                	xor    eax,eax
     1221593:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1221598:	48 8b bb 38 0a 00 00 	mov    rdi,QWORD PTR [rbx+0xa38]
     122159f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12215a2:	ff 50 38             	call   QWORD PTR [rax+0x38]
     12215a5:	45 31 e4             	xor    r12d,r12d
     12215a8:	80 78 48 00          	cmp    BYTE PTR [rax+0x48],0x0
     12215ac:	74 1c                	je     12215ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b4e>
     12215ae:	80 bd 60 05 00 00 00 	cmp    BYTE PTR [rbp+0x560],0x0
     12215b5:	74 13                	je     12215ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66b4e>
     12215b7:	48 83 c0 18          	add    rax,0x18
     12215bb:	48 8d 75 28          	lea    rsi,[rbp+0x28]
     12215bf:	48 89 c7             	mov    rdi,rax
     12215c2:	e8 27 e1 87 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12215c7:	41 89 c4             	mov    r12d,eax
     12215ca:	48 8d bc 24 80 13 00 	lea    rdi,[rsp+0x1380]
     12215d1:	00 
     12215d2:	48 89 ee             	mov    rsi,rbp
     12215d5:	e8 2a 8f 02 00       	call   124a504 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa88>
     12215da:	48 8d 83 28 0a 00 00 	lea    rax,[rbx+0xa28]
     12215e1:	66 0f ef c0          	pxor   xmm0,xmm0
     12215e5:	48 8d bc 24 08 1a 00 	lea    rdi,[rsp+0x1a08]
     12215ec:	00 
     12215ed:	f3 0f 7f 47 d0       	movdqu XMMWORD PTR [rdi-0x30],xmm0
     12215f2:	48 83 67 e0 00       	and    QWORD PTR [rdi-0x20],0x0

### caller 0x1221839 FDE=(19006804, 19014400)
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

### caller 0x124aa56 FDE=(19179710, 19181109)
     124aa0c:	84 c0                	test   al,al
     124aa0e:	0f 85 ec 02 00 00    	jne    124ad00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90284>
     124aa14:	45 84 f6             	test   r14b,r14b
     124aa17:	74 18                	je     124aa31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ffb5>
     124aa19:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     124aa20:	00 
     124aa21:	4c 89 fe             	mov    rsi,r15
     124aa24:	e8 8c 08 00 00       	call   124b2b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90839>
     124aa29:	84 c0                	test   al,al
     124aa2b:	0f 85 cf 02 00 00    	jne    124ad00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90284>
     124aa31:	49 8b 77 50          	mov    rsi,QWORD PTR [r15+0x50]
     124aa35:	41 8b 7f 48          	mov    edi,DWORD PTR [r15+0x48]
     124aa39:	e8 e2 0d 83 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     124aa3e:	40 84 ed             	test   bpl,bpl
     124aa41:	75 08                	jne    124aa4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8ffcf>
     124aa43:	84 c0                	test   al,al
     124aa45:	0f 85 b5 02 00 00    	jne    124ad00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90284>
     124aa4b:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
     124aa50:	4c 89 e7             	mov    rdi,r12
     124aa53:	4c 89 fe             	mov    rsi,r15
     124aa56:	e8 03 8e fd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     124aa5b:	48 89 df             	mov    rdi,rbx
     124aa5e:	4c 89 e6             	mov    rsi,r12
     124aa61:	e8 2b fa ff ff       	call   124a491 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8fa15>
     124aa66:	4c 89 e7             	mov    rdi,r12
     124aa69:	49 89 c4             	mov    r12,rax
     124aa6c:	e8 1f 34 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124aa71:	4d 85 e4             	test   r12,r12
     124aa74:	0f 84 71 02 00 00    	je     124aceb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9026f>
     124aa7a:	41 80 bc 24 c6 02 00 	cmp    BYTE PTR [r12+0x2c6],0x0
     124aa81:	00 00 
     124aa83:	0f 85 77 02 00 00    	jne    124ad00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90284>
     124aa89:	49 8d 77 48          	lea    rsi,[r15+0x48]
     124aa8d:	49 8d 57 78          	lea    rdx,[r15+0x78]
     124aa91:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
     124aa96:	48 89 df             	mov    rdi,rbx
     124aa99:	4c 89 e1             	mov    rcx,r12
     124aa9c:	e8 c1 06 00 00       	call   124b162 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x906e6>
     124aaa1:	45 8a af d8 01 00 00 	mov    r13b,BYTE PTR [r15+0x1d8]
     124aaa8:	45 84 ed             	test   r13b,r13b
     124aaab:	49 0f 44 dc          	cmove  rbx,r12
     124aaaf:	4d 8d 77 18          	lea    r14,[r15+0x18]
     124aab3:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     124aab8:	4c 89 f6             	mov    rsi,r14
     124aabb:	e8 80 34 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aac0:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     124aac5:	4c 89 f6             	mov    rsi,r14
     124aac8:	e8 73 34 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aacd:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     124aad4:	00 
     124aad5:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     124aada:	e8 61 34 5a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     124aadf:	4d 8d 77 60          	lea    r14,[r15+0x60]
     124aae3:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
     124aaea:	00 
     124aaeb:	4c 89 f6             	mov    rsi,r14

### caller 0x1551ebb FDE=(22355538, 22356784)
     1551e6f:	00 00 
     1551e71:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     1551e78:	00 
     1551e79:	48 85 d2             	test   rdx,rdx
     1551e7c:	0f 84 45 01 00 00    	je     1551fc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39754b>
     1551e82:	4d 89 c6             	mov    r14,r8
     1551e85:	48 89 cb             	mov    rbx,rcx
     1551e88:	49 89 d7             	mov    r15,rdx
     1551e8b:	49 89 f4             	mov    r12,rsi
     1551e8e:	0f 57 c0             	xorps  xmm0,xmm0
     1551e91:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     1551e97:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     1551e9c:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
     1551ea1:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1551ea4:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     1551ea8:	48 89 f7             	mov    rdi,rsi
     1551eab:	e8 87 f6 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1551eb0:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1551eb7:	00 
     1551eb8:	48 89 c6             	mov    rsi,rax
     1551ebb:	e8 9e 19 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1551ec0:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     1551ec4:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     1551ec9:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1551ece:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1551ed5:	00 
     1551ed6:	e8 61 0f 00 00       	call   1552e3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3983c0>
     1551edb:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1551ee0:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1551ee7:	00 
     1551ee8:	e8 3f 11 00 00       	call   155302c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3985b0>
     1551eed:	4c 8d ac 24 88 00 00 	lea    r13,[rsp+0x88]
     1551ef4:	00 
     1551ef5:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     1551efa:	4d 69 ff 98 02 00 00 	imul   r15,r15,0x298
     1551f01:	48 8d 6c 24 70       	lea    rbp,[rsp+0x70]
     1551f06:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
     1551f0d:	00 
     1551f0e:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
     1551f13:	4c 89 e7             	mov    rdi,r12
     1551f16:	e8 1c f6 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1551f1b:	48 89 ef             	mov    rdi,rbp
     1551f1e:	48 89 c6             	mov    rsi,rax
     1551f21:	e8 38 19 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1551f26:	48 89 ef             	mov    rdi,rbp
     1551f29:	48 89 de             	mov    rsi,rbx
     1551f2c:	e8 cd bf e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1551f31:	84 c0                	test   al,al
     1551f33:	75 4d                	jne    1551f82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397506>
     1551f35:	4c 89 f7             	mov    rdi,r14
     1551f38:	48 89 ee             	mov    rsi,rbp
     1551f3b:	e8 74 11 00 00       	call   15530b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x398638>
     1551f40:	84 c0                	test   al,al
     1551f42:	0f 85 87 00 00 00    	jne    1551fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397553>
     1551f48:	48 89 df             	mov    rdi,rbx
     1551f4b:	48 89 ee             	mov    rsi,rbp

### caller 0x1551f21 FDE=(22355538, 22356784)
     1551ec9:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1551ece:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1551ed5:	00 
     1551ed6:	e8 61 0f 00 00       	call   1552e3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3983c0>
     1551edb:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1551ee0:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     1551ee7:	00 
     1551ee8:	e8 3f 11 00 00       	call   155302c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3985b0>
     1551eed:	4c 8d ac 24 88 00 00 	lea    r13,[rsp+0x88]
     1551ef4:	00 
     1551ef5:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     1551efa:	4d 69 ff 98 02 00 00 	imul   r15,r15,0x298
     1551f01:	48 8d 6c 24 70       	lea    rbp,[rsp+0x70]
     1551f06:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
     1551f0d:	00 
     1551f0e:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
     1551f13:	4c 89 e7             	mov    rdi,r12
     1551f16:	e8 1c f6 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1551f1b:	48 89 ef             	mov    rdi,rbp
     1551f1e:	48 89 c6             	mov    rsi,rax
     1551f21:	e8 38 19 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1551f26:	48 89 ef             	mov    rdi,rbp
     1551f29:	48 89 de             	mov    rsi,rbx
     1551f2c:	e8 cd bf e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1551f31:	84 c0                	test   al,al
     1551f33:	75 4d                	jne    1551f82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397506>
     1551f35:	4c 89 f7             	mov    rdi,r14
     1551f38:	48 89 ee             	mov    rsi,rbp
     1551f3b:	e8 74 11 00 00       	call   15530b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x398638>
     1551f40:	84 c0                	test   al,al
     1551f42:	0f 85 87 00 00 00    	jne    1551fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397553>
     1551f48:	48 89 df             	mov    rdi,rbx
     1551f4b:	48 89 ee             	mov    rsi,rbp
     1551f4e:	e8 2d c1 29 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1551f53:	41 8a 45 10          	mov    al,BYTE PTR [r13+0x10]
     1551f57:	48 8d 8c 24 b8 00 00 	lea    rcx,[rsp+0xb8]
     1551f5e:	00 
     1551f5f:	88 41 10             	mov    BYTE PTR [rcx+0x10],al
     1551f62:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     1551f67:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     1551f6a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1551f6f:	48 89 de             	mov    rsi,rbx
     1551f72:	e8 c5 0e 00 00       	call   1552e3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3983c0>
     1551f77:	4c 89 f7             	mov    rdi,r14
     1551f7a:	48 89 de             	mov    rsi,rbx
     1551f7d:	e8 aa 10 00 00       	call   155302c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3985b0>
     1551f82:	48 89 ef             	mov    rdi,rbp
     1551f85:	e8 06 bf 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1551f8a:	49 81 c4 98 02 00 00 	add    r12,0x298
     1551f91:	49 81 c7 68 fd ff ff 	add    r15,0xfffffffffffffd68
     1551f98:	0f 85 75 ff ff ff    	jne    1551f13 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397497>
     1551f9e:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
     1551fa3:	4c 8b 64 24 58       	mov    r12,QWORD PTR [rsp+0x58]
     1551fa8:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
     1551fad:	0f 10 44 24 58       	movups xmm0,XMMWORD PTR [rsp+0x58]
     1551fb2:	0f 11 44 24 28       	movups XMMWORD PTR [rsp+0x28],xmm0

### caller 0x15520de FDE=(22355538, 22356784)
     155209b:	41 5e                	pop    r14
     155209d:	41 5f                	pop    r15
     155209f:	5d                   	pop    rbp
     15520a0:	c3                   	ret
     15520a1:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     15520a6:	48 89 ee             	mov    rsi,rbp
     15520a9:	e8 06 10 00 00       	call   15530b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x398638>
     15520ae:	48 83 7c 24 18 01    	cmp    QWORD PTR [rsp+0x18],0x1
     15520b4:	75 59                	jne    155210f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397693>
     15520b6:	41 b7 01             	mov    r15b,0x1
     15520b9:	84 c0                	test   al,al
     15520bb:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     15520c0:	74 a9                	je     155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15520c2:	4d 85 f6             	test   r14,r14
     15520c5:	0f 84 95 00 00 00    	je     1552160 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3976e4>
     15520cb:	4c 89 f7             	mov    rdi,r14
     15520ce:	e8 64 f4 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     15520d3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15520da:	00 
     15520db:	48 89 c6             	mov    rsi,rax
     15520de:	e8 7b 17 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     15520e3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15520ea:	00 
     15520eb:	48 89 ee             	mov    rsi,rbp
     15520ee:	e8 0b be e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     15520f3:	41 b7 01             	mov    r15b,0x1
     15520f6:	84 c0                	test   al,al
     15520f8:	0f 85 a5 00 00 00    	jne    15521a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397727>
     15520fe:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1552102:	48 85 ff             	test   rdi,rdi
     1552105:	75 66                	jne    155216d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3976f1>
     1552107:	45 31 ff             	xor    r15d,r15d
     155210a:	e9 94 00 00 00       	jmp    15521a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397727>
     155210f:	84 c0                	test   al,al
     1552111:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     1552116:	0f 84 eb 00 00 00    	je     1552207 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39778b>
     155211c:	4d 85 f6             	test   r14,r14
     155211f:	0f 84 90 00 00 00    	je     15521b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397739>
     1552125:	4c 89 f7             	mov    rdi,r14
     1552128:	e8 0a f4 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     155212d:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     1552131:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1552138:	00 
     1552139:	48 89 c6             	mov    rsi,rax
     155213c:	e8 1d 17 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1552141:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     1552148:	00 
     1552149:	4c 89 f7             	mov    rdi,r14
     155214c:	48 89 ee             	mov    rsi,rbp
     155214f:	e8 aa bd e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1552154:	89 c3                	mov    ebx,eax
     1552156:	4c 89 f7             	mov    rdi,r14
     1552159:	e8 32 bd 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155215e:	eb 5b                	jmp    15521bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39773f>
     1552160:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1552164:	48 85 ff             	test   rdi,rdi

### caller 0x155213c FDE=(22355538, 22356784)
     15520ee:	e8 0b be e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     15520f3:	41 b7 01             	mov    r15b,0x1
     15520f6:	84 c0                	test   al,al
     15520f8:	0f 85 a5 00 00 00    	jne    15521a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397727>
     15520fe:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1552102:	48 85 ff             	test   rdi,rdi
     1552105:	75 66                	jne    155216d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3976f1>
     1552107:	45 31 ff             	xor    r15d,r15d
     155210a:	e9 94 00 00 00       	jmp    15521a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397727>
     155210f:	84 c0                	test   al,al
     1552111:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     1552116:	0f 84 eb 00 00 00    	je     1552207 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39778b>
     155211c:	4d 85 f6             	test   r14,r14
     155211f:	0f 84 90 00 00 00    	je     15521b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397739>
     1552125:	4c 89 f7             	mov    rdi,r14
     1552128:	e8 0a f4 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     155212d:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     1552131:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1552138:	00 
     1552139:	48 89 c6             	mov    rsi,rax
     155213c:	e8 1d 17 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1552141:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     1552148:	00 
     1552149:	4c 89 f7             	mov    rdi,r14
     155214c:	48 89 ee             	mov    rsi,rbp
     155214f:	e8 aa bd e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1552154:	89 c3                	mov    ebx,eax
     1552156:	4c 89 f7             	mov    rdi,r14
     1552159:	e8 32 bd 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155215e:	eb 5b                	jmp    15521bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39773f>
     1552160:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1552164:	48 85 ff             	test   rdi,rdi
     1552167:	0f 84 fb fe ff ff    	je     1552068 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ec>
     155216d:	e8 c5 f3 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1552172:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1552177:	48 89 c6             	mov    rsi,rax
     155217a:	e8 df 16 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     155217f:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
     1552184:	48 89 df             	mov    rdi,rbx
     1552187:	48 89 ee             	mov    rsi,rbp
     155218a:	e8 6f bd e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     155218f:	41 89 c7             	mov    r15d,eax
     1552192:	48 89 df             	mov    rdi,rbx
     1552195:	e8 f6 bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155219a:	4d 85 f6             	test   r14,r14
     155219d:	0f 84 c8 fe ff ff    	je     155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15521a3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15521aa:	00 
     15521ab:	e8 e0 bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15521b0:	e9 b6 fe ff ff       	jmp    155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15521b5:	31 db                	xor    ebx,ebx
     15521b7:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     15521bb:	4d 85 ff             	test   r15,r15
     15521be:	74 37                	je     15521f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39777b>
     15521c0:	4c 89 ff             	mov    rdi,r15
     15521c3:	e8 6f f3 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>

### caller 0x155217a FDE=(22355538, 22356784)
     155212d:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     1552131:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1552138:	00 
     1552139:	48 89 c6             	mov    rsi,rax
     155213c:	e8 1d 17 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1552141:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     1552148:	00 
     1552149:	4c 89 f7             	mov    rdi,r14
     155214c:	48 89 ee             	mov    rsi,rbp
     155214f:	e8 aa bd e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1552154:	89 c3                	mov    ebx,eax
     1552156:	4c 89 f7             	mov    rdi,r14
     1552159:	e8 32 bd 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155215e:	eb 5b                	jmp    15521bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39773f>
     1552160:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1552164:	48 85 ff             	test   rdi,rdi
     1552167:	0f 84 fb fe ff ff    	je     1552068 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ec>
     155216d:	e8 c5 f3 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1552172:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     1552177:	48 89 c6             	mov    rsi,rax
     155217a:	e8 df 16 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     155217f:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
     1552184:	48 89 df             	mov    rdi,rbx
     1552187:	48 89 ee             	mov    rsi,rbp
     155218a:	e8 6f bd e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     155218f:	41 89 c7             	mov    r15d,eax
     1552192:	48 89 df             	mov    rdi,rbx
     1552195:	e8 f6 bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155219a:	4d 85 f6             	test   r14,r14
     155219d:	0f 84 c8 fe ff ff    	je     155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15521a3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15521aa:	00 
     15521ab:	e8 e0 bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15521b0:	e9 b6 fe ff ff       	jmp    155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15521b5:	31 db                	xor    ebx,ebx
     15521b7:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     15521bb:	4d 85 ff             	test   r15,r15
     15521be:	74 37                	je     15521f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39777b>
     15521c0:	4c 89 ff             	mov    rdi,r15
     15521c3:	e8 6f f3 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     15521c8:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15521cf:	00 
     15521d0:	48 89 c6             	mov    rsi,rax
     15521d3:	e8 86 16 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     15521d8:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     15521df:	00 
     15521e0:	4c 89 f7             	mov    rdi,r14
     15521e3:	48 89 ee             	mov    rsi,rbp
     15521e6:	e8 13 bd e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     15521eb:	89 c5                	mov    ebp,eax
     15521ed:	4c 89 f7             	mov    rdi,r14
     15521f0:	e8 9b bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15521f5:	eb 02                	jmp    15521f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39777d>
     15521f7:	31 ed                	xor    ebp,ebp
     15521f9:	40 08 eb             	or     bl,bpl
     15521fc:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]

### caller 0x15521d3 FDE=(22355538, 22356784)
     1552187:	48 89 ee             	mov    rsi,rbp
     155218a:	e8 6f bd e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     155218f:	41 89 c7             	mov    r15d,eax
     1552192:	48 89 df             	mov    rdi,rbx
     1552195:	e8 f6 bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155219a:	4d 85 f6             	test   r14,r14
     155219d:	0f 84 c8 fe ff ff    	je     155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15521a3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15521aa:	00 
     15521ab:	e8 e0 bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15521b0:	e9 b6 fe ff ff       	jmp    155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15521b5:	31 db                	xor    ebx,ebx
     15521b7:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
     15521bb:	4d 85 ff             	test   r15,r15
     15521be:	74 37                	je     15521f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39777b>
     15521c0:	4c 89 ff             	mov    rdi,r15
     15521c3:	e8 6f f3 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     15521c8:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15521cf:	00 
     15521d0:	48 89 c6             	mov    rsi,rax
     15521d3:	e8 86 16 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     15521d8:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     15521df:	00 
     15521e0:	4c 89 f7             	mov    rdi,r14
     15521e3:	48 89 ee             	mov    rsi,rbp
     15521e6:	e8 13 bd e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     15521eb:	89 c5                	mov    ebp,eax
     15521ed:	4c 89 f7             	mov    rdi,r14
     15521f0:	e8 9b bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15521f5:	eb 02                	jmp    15521f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39777d>
     15521f7:	31 ed                	xor    ebp,ebp
     15521f9:	40 08 eb             	or     bl,bpl
     15521fc:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     1552201:	0f 84 61 fe ff ff    	je     1552068 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ec>
     1552207:	49 83 c4 d0          	add    r12,0xffffffffffffffd0
     155220b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1552210:	4c 89 e6             	mov    rsi,r12
     1552213:	e8 9c 0e 00 00       	call   15530b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x398638>
     1552218:	41 b7 01             	mov    r15b,0x1
     155221b:	84 c0                	test   al,al
     155221d:	0f 84 48 fe ff ff    	je     155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     1552223:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1552227:	48 85 ff             	test   rdi,rdi
     155222a:	74 35                	je     1552261 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3977e5>
     155222c:	e8 06 f3 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1552231:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1552238:	00 
     1552239:	48 89 c6             	mov    rsi,rax
     155223c:	e8 1d 16 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1552241:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
     1552248:	00 
     1552249:	48 89 df             	mov    rdi,rbx
     155224c:	4c 89 e6             	mov    rsi,r12
     155224f:	e8 aa bc e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1552254:	41 89 c7             	mov    r15d,eax
     1552257:	48 89 df             	mov    rdi,rbx

### caller 0x155223c FDE=(22355538, 22356784)
     15521f0:	e8 9b bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15521f5:	eb 02                	jmp    15521f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39777d>
     15521f7:	31 ed                	xor    ebp,ebp
     15521f9:	40 08 eb             	or     bl,bpl
     15521fc:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     1552201:	0f 84 61 fe ff ff    	je     1552068 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ec>
     1552207:	49 83 c4 d0          	add    r12,0xffffffffffffffd0
     155220b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     1552210:	4c 89 e6             	mov    rsi,r12
     1552213:	e8 9c 0e 00 00       	call   15530b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x398638>
     1552218:	41 b7 01             	mov    r15b,0x1
     155221b:	84 c0                	test   al,al
     155221d:	0f 84 48 fe ff ff    	je     155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     1552223:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     1552227:	48 85 ff             	test   rdi,rdi
     155222a:	74 35                	je     1552261 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3977e5>
     155222c:	e8 06 f3 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1552231:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1552238:	00 
     1552239:	48 89 c6             	mov    rsi,rax
     155223c:	e8 1d 16 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1552241:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
     1552248:	00 
     1552249:	48 89 df             	mov    rdi,rbx
     155224c:	4c 89 e6             	mov    rsi,r12
     155224f:	e8 aa bc e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1552254:	41 89 c7             	mov    r15d,eax
     1552257:	48 89 df             	mov    rdi,rbx
     155225a:	e8 31 bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155225f:	eb 03                	jmp    1552264 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3977e8>
     1552261:	45 31 ff             	xor    r15d,r15d
     1552264:	4d 85 f6             	test   r14,r14
     1552267:	74 37                	je     15522a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397824>
     1552269:	4c 89 f7             	mov    rdi,r14
     155226c:	e8 c6 f2 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1552271:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1552278:	00 
     1552279:	48 89 c6             	mov    rsi,rax
     155227c:	e8 dd 15 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1552281:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     1552288:	00 
     1552289:	4c 89 f7             	mov    rdi,r14
     155228c:	4c 89 e6             	mov    rsi,r12
     155228f:	e8 6a bc e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1552294:	89 c3                	mov    ebx,eax
     1552296:	4c 89 f7             	mov    rdi,r14
     1552299:	e8 f2 bb 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155229e:	eb 02                	jmp    15522a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397826>
     15522a0:	31 db                	xor    ebx,ebx
     15522a2:	41 08 df             	or     r15b,bl
     15522a5:	e9 c1 fd ff ff       	jmp    155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15522aa:	4c 89 f1             	mov    rcx,r14
     15522ad:	49 89 c6             	mov    r14,rax
     15522b0:	48 85 c9             	test   rcx,rcx
     15522b3:	74 1a                	je     15522cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397853>
     15522b5:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### caller 0x155227c FDE=(22355538, 22356784)
     1552238:	00 
     1552239:	48 89 c6             	mov    rsi,rax
     155223c:	e8 1d 16 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1552241:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
     1552248:	00 
     1552249:	48 89 df             	mov    rdi,rbx
     155224c:	4c 89 e6             	mov    rsi,r12
     155224f:	e8 aa bc e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1552254:	41 89 c7             	mov    r15d,eax
     1552257:	48 89 df             	mov    rdi,rbx
     155225a:	e8 31 bc 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155225f:	eb 03                	jmp    1552264 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3977e8>
     1552261:	45 31 ff             	xor    r15d,r15d
     1552264:	4d 85 f6             	test   r14,r14
     1552267:	74 37                	je     15522a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397824>
     1552269:	4c 89 f7             	mov    rdi,r14
     155226c:	e8 c6 f2 ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1552271:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1552278:	00 
     1552279:	48 89 c6             	mov    rsi,rax
     155227c:	e8 dd 15 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     1552281:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     1552288:	00 
     1552289:	4c 89 f7             	mov    rdi,r14
     155228c:	4c 89 e6             	mov    rsi,r12
     155228f:	e8 6a bc e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1552294:	89 c3                	mov    ebx,eax
     1552296:	4c 89 f7             	mov    rdi,r14
     1552299:	e8 f2 bb 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     155229e:	eb 02                	jmp    15522a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397826>
     15522a0:	31 db                	xor    ebx,ebx
     15522a2:	41 08 df             	or     r15b,bl
     15522a5:	e9 c1 fd ff ff       	jmp    155206b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3975ef>
     15522aa:	4c 89 f1             	mov    rcx,r14
     15522ad:	49 89 c6             	mov    r14,rax
     15522b0:	48 85 c9             	test   rcx,rcx
     15522b3:	74 1a                	je     15522cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397853>
     15522b5:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     15522bc:	00 
     15522bd:	e8 ce bb 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15522c2:	eb 0b                	jmp    15522cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397853>
     15522c4:	eb 06                	jmp    15522cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397850>
     15522c6:	eb 04                	jmp    15522cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397850>
     15522c8:	eb 02                	jmp    15522cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397850>
     15522ca:	eb 00                	jmp    15522cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397850>
     15522cc:	49 89 c6             	mov    r14,rax
     15522cf:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     15522d4:	eb 35                	jmp    155230b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39788f>
     15522d6:	eb 14                	jmp    15522ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397870>
     15522d8:	49 89 c6             	mov    r14,rax
     15522db:	eb 1f                	jmp    15522fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397880>
     15522dd:	49 89 c6             	mov    r14,rax
     15522e0:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     15522e5:	e8 a6 bb 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     15522ea:	eb 03                	jmp    15522ef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397873>
     15522ec:	49 89 c6             	mov    r14,rax

### caller 0x1552659 FDE=(22357528, 22357811)
     155260b:	48 89 df             	mov    rdi,rbx
     155260e:	e8 bd d6 51 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1552613:	e8 98 d4 29 00       	call   17efab0 <__stack_chk_fail@plt>
     1552618:	41 57                	push   r15
     155261a:	41 56                	push   r14
     155261c:	41 54                	push   r12
     155261e:	53                   	push   rbx
     155261f:	48 83 ec 58          	sub    rsp,0x58
     1552623:	49 89 f7             	mov    r15,rsi
     1552626:	49 89 fe             	mov    r14,rdi
     1552629:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1552630:	00 00 
     1552632:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     1552637:	48 81 c7 e0 01 00 00 	add    rdi,0x1e0
     155263e:	48 83 c6 18          	add    rsi,0x18
     1552642:	e8 29 b2 6c ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
     1552647:	49 8d 9e 08 02 00 00 	lea    rbx,[r14+0x208]
     155264e:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     1552653:	4c 89 e7             	mov    rdi,r12
     1552656:	4c 89 fe             	mov    rsi,r15
     1552659:	e8 00 12 cd ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     155265e:	48 89 e6             	mov    rsi,rsp
     1552661:	48 89 df             	mov    rdi,rbx
     1552664:	4c 89 e2             	mov    rdx,r12
     1552667:	e8 fe 06 00 00       	call   1552d6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3982ee>
     155266c:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     1552670:	75 71                	jne    15526e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x397c67>
     1552672:	49 89 c7             	mov    r15,rax
     1552675:	6a 50                	push   0x50
     1552677:	5f                   	pop    rdi
     1552678:	e8 83 b8 29 00       	call   17edf00 <_Znwm@plt>
     155267d:	49 81 c6 10 02 00 00 	add    r14,0x210
     1552684:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     1552689:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
     155268e:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     1552693:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
     1552697:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     155269c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     15526a0:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     15526a6:	0f 57 c0             	xorps  xmm0,xmm0
     15526a9:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     15526ae:	8a 4c 24 48          	mov    cl,BYTE PTR [rsp+0x48]
     15526b2:	88 48 48             	mov    BYTE PTR [rax+0x48],cl
     15526b5:	0f 10 44 24 38       	movups xmm0,XMMWORD PTR [rsp+0x38]
     15526ba:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
     15526be:	41 c6 44 24 10 01    	mov    BYTE PTR [r12+0x10],0x1
     15526c4:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     15526c8:	48 89 df             	mov    rdi,rbx
     15526cb:	4c 89 fa             	mov    rdx,r15
     15526ce:	48 89 c1             	mov    rcx,rax
     15526d1:	e8 96 d4 58 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     15526d6:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
     15526db:	4c 89 e7             	mov    rdi,r12
     15526de:	e8 1f 4f 70 ff       	call   c57602 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a45a2>
     15526e3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     15526e8:	e8 a3 b7 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### caller 0x15576cd FDE=(22378144, 22378669)
     1557694:	5b                   	pop    rbx
     1557695:	41 5e                	pop    r14
     1557697:	41 5f                	pop    r15
     1557699:	c3                   	ret
     155769a:	e8 11 84 29 00       	call   17efab0 <__stack_chk_fail@plt>
     155769f:	cc                   	int3
     15576a0:	55                   	push   rbp
     15576a1:	41 57                	push   r15
     15576a3:	41 56                	push   r14
     15576a5:	41 55                	push   r13
     15576a7:	41 54                	push   r12
     15576a9:	53                   	push   rbx
     15576aa:	48 81 ec 88 00 00 00 	sub    rsp,0x88
     15576b1:	48 89 f3             	mov    rbx,rsi
     15576b4:	49 89 fe             	mov    r14,rdi
     15576b7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15576be:	00 00 
     15576c0:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     15576c7:	00 
     15576c8:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     15576cd:	e8 8c c1 cc ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     15576d2:	48 8d 43 18          	lea    rax,[rbx+0x18]
     15576d6:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     15576db:	4d 8b ae b0 00 00 00 	mov    r13,QWORD PTR [r14+0xb0]
     15576e2:	4d 85 ed             	test   r13,r13
     15576e5:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     15576ea:	0f 84 a6 00 00 00    	je     1557796 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39cd1a>
     15576f0:	c7 44 24 0c 00 00 00 	mov    DWORD PTR [rsp+0xc],0x0
     15576f7:	00 
     15576f8:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     15576fd:	45 31 e4             	xor    r12d,r12d
     1557700:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     1557704:	48 89 de             	mov    rsi,rbx
     1557707:	e8 aa 2d b3 ff       	call   108a4b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2518cc>
     155770c:	84 c0                	test   al,al
     155770e:	75 65                	jne    1557775 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ccf9>
     1557710:	49 89 de             	mov    r14,rbx
     1557713:	49 8d 7d 58          	lea    rdi,[r13+0x58]
     1557717:	e8 1b 9e ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     155771c:	48 89 c3             	mov    rbx,rax
     155771f:	48 89 c7             	mov    rdi,rax
     1557722:	48 83 c7 18          	add    rdi,0x18
     1557726:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     155772b:	e8 be 7f 54 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1557730:	89 c5                	mov    ebp,eax
     1557732:	4c 89 ff             	mov    rdi,r15
     1557735:	48 89 de             	mov    rsi,rbx
     1557738:	e8 21 c1 cc ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     155773d:	8b 5c 24 0c          	mov    ebx,DWORD PTR [rsp+0xc]
     1557741:	80 e3 01             	and    bl,0x1
     1557744:	4c 89 ff             	mov    rdi,r15
     1557747:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     155774c:	e8 ad 67 e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1557751:	41 80 e4 01          	and    r12b,0x1
     1557755:	41 08 c4             	or     r12b,al
     1557758:	4c 89 ff             	mov    rdi,r15

### caller 0x1557738 FDE=(22378144, 22378669)
     15576f0:	c7 44 24 0c 00 00 00 	mov    DWORD PTR [rsp+0xc],0x0
     15576f7:	00 
     15576f8:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     15576fd:	45 31 e4             	xor    r12d,r12d
     1557700:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     1557704:	48 89 de             	mov    rsi,rbx
     1557707:	e8 aa 2d b3 ff       	call   108a4b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2518cc>
     155770c:	84 c0                	test   al,al
     155770e:	75 65                	jne    1557775 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ccf9>
     1557710:	49 89 de             	mov    r14,rbx
     1557713:	49 8d 7d 58          	lea    rdi,[r13+0x58]
     1557717:	e8 1b 9e ff ff       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     155771c:	48 89 c3             	mov    rbx,rax
     155771f:	48 89 c7             	mov    rdi,rax
     1557722:	48 83 c7 18          	add    rdi,0x18
     1557726:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     155772b:	e8 be 7f 54 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1557730:	89 c5                	mov    ebp,eax
     1557732:	4c 89 ff             	mov    rdi,r15
     1557735:	48 89 de             	mov    rsi,rbx
     1557738:	e8 21 c1 cc ff       	call   122385e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68de2>
     155773d:	8b 5c 24 0c          	mov    ebx,DWORD PTR [rsp+0xc]
     1557741:	80 e3 01             	and    bl,0x1
     1557744:	4c 89 ff             	mov    rdi,r15
     1557747:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     155774c:	e8 ad 67 e2 ff       	call   137defe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c3482>
     1557751:	41 80 e4 01          	and    r12b,0x1
     1557755:	41 08 c4             	or     r12b,al
     1557758:	4c 89 ff             	mov    rdi,r15
     155775b:	e8 30 67 29 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1557760:	40 08 eb             	or     bl,bpl
     1557763:	89 5c 24 0c          	mov    DWORD PTR [rsp+0xc],ebx
     1557767:	4c 89 f3             	mov    rbx,r14
     155776a:	74 09                	je     1557775 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ccf9>
     155776c:	45 84 e4             	test   r12b,r12b
     155776f:	0f 85 da 00 00 00    	jne    155784f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39cdd3>
     1557775:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
     1557779:	4d 85 ed             	test   r13,r13
     155777c:	75 82                	jne    1557700 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39cc84>
     155777e:	f6 44 24 0c 01       	test   BYTE PTR [rsp+0xc],0x1
     1557783:	0f 94 c3             	sete   bl
     1557786:	41 f6 c4 01          	test   r12b,0x1
     155778a:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     155778f:	74 07                	je     1557798 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39cd1c>
     1557791:	e9 9f 00 00 00       	jmp    1557835 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39cdb9>
     1557796:	b3 01                	mov    bl,0x1
     1557798:	4d 8b a6 10 02 00 00 	mov    r12,QWORD PTR [r14+0x210]
     155779f:	4d 85 e4             	test   r12,r12
     15577a2:	0f 84 8d 00 00 00    	je     1557835 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39cdb9>
     15577a8:	49 81 c6 10 02 00 00 	add    r14,0x210
     15577af:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
     15577b4:	4d 89 f7             	mov    r15,r14
     15577b7:	4c 89 e5             	mov    rbp,r12
     15577ba:	48 8d 7d 20          	lea    rdi,[rbp+0x20]
     15577be:	4c 89 ee             	mov    rsi,r13
     15577c1:	e8 14 b6 ff ff       	call   1552dda <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39835e>

## All direct calls to full copy 0x12240cc
### caller 0x1221734 FDE=(19006804, 19014400)
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

### caller 0x122188d FDE=(19006804, 19014400)
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

### caller 0x122192f FDE=(19006804, 19014400)
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

### caller 0x1223fcd FDE=(19021134, 19021870)
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

### caller 0x124b0d2 FDE=(19181726, 19181856)
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

## Candidate APs and +0x140 from source-builder constants
## First-word copy provenance
### function 0x122385e
### function 0x12240f8
     1224103:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
