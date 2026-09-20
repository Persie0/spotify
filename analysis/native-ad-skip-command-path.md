# ad_skip timer dispatch / command trace

Known producers: 0x139ba71 and 0x139be38 create event subtype 6 after calling ad-object vtable +0xe8 and multiplying the positive delay by 1000.

## Producer 0x139ba71; FDE=(20560346, 20561320)
Strings: ad_skip
     139b94c:	8b 86 78 01 00 00    	mov    eax,DWORD PTR [rsi+0x178]
     139b952:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     139b957:	48 39 c8             	cmp    rax,rcx
     139b95a:	74 35                	je     139b991 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f15>
     139b95c:	48 89 e1             	mov    rcx,rsp
     139b95f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     139b964:	48 89 0f             	mov    QWORD PTR [rdi],rcx
     139b967:	48 83 c6 08          	add    rsi,0x8
     139b96b:	48 8d 0d e6 db 4c 00 	lea    rcx,[rip+0x4cdbe6]        # 1869558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25c40>
     139b972:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
     139b975:	eb 05                	jmp    139b97c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f00>
     139b977:	e8 08 6f ff ff       	call   1392884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d7e08>
     139b97c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139b983:	00 00 
     139b985:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     139b98a:	75 1a                	jne    139b9a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f2a>
     139b98c:	48 83 c4 28          	add    rsp,0x28
     139b990:	c3                   	ret
     139b991:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139b998:	00 00 
     139b99a:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     139b99f:	75 05                	jne    139b9a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f2a>
     139b9a1:	e8 fd 34 71 ff       	call   aaeea3 <JNI_OnUnload@@Base+0x36770>
     139b9a6:	e8 05 41 45 00       	call   17efab0 <__stack_chk_fail@plt>
     139b9ab:	48 89 c7             	mov    rdi,rax
     139b9ae:	e8 f2 e0 6d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     139b9b3:	cc                   	int3
     139b9b4:	53                   	push   rbx
     139b9b5:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     139b9b9:	48 85 c0             	test   rax,rax
     139b9bc:	74 11                	je     139b9cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e0f53>
     139b9be:	48 89 fb             	mov    rbx,rdi
     139b9c1:	31 ff                	xor    edi,edi
     139b9c3:	48 89 de             	mov    rsi,rbx
     139b9c6:	31 d2                	xor    edx,edx
     139b9c8:	ff d0                	call   rax
     139b9ca:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     139b9cf:	5b                   	pop    rbx
     139b9d0:	c3                   	ret
     139b9d1:	48 89 c7             	mov    rdi,rax
     139b9d4:	e8 cc e0 6d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     139b9d9:	cc                   	int3
     139b9da:	55                   	push   rbp
     139b9db:	41 57                	push   r15
     139b9dd:	41 56                	push   r14
     139b9df:	41 55                	push   r13
     139b9e1:	41 54                	push   r12
     139b9e3:	53                   	push   rbx
     139b9e4:	48 81 ec c8 06 00 00 	sub    rsp,0x6c8
     139b9eb:	49 89 f7             	mov    r15,rsi
     139b9ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139b9f5:	00 00 
     139b9f7:	48 89 84 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rax
     139b9fe:	00 
     139b9ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139ba02:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     139ba05:	48 8d bb 28 0c 00 00 	lea    rdi,[rbx+0xc28]
     139ba0c:	0f 10 86 60 01 00 00 	movups xmm0,XMMWORD PTR [rsi+0x160]
     139ba13:	e8 1e 31 74 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     139ba18:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
     139ba1e:	0f 57 c0             	xorps  xmm0,xmm0
     139ba21:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     139ba26:	49 8b bf 60 01 00 00 	mov    rdi,QWORD PTR [r15+0x160]
     139ba2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139ba30:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     139ba36:	49 89 c6             	mov    r14,rax
     139ba39:	48 85 c0             	test   rax,rax
     139ba3c:	7e 4e                	jle    139ba8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1010>
     139ba3e:	48 8d 35 9a 4c fb fe 	lea    rsi,[rip+0xfffffffffefb4c9a]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
     139ba45:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba4c:	00 
     139ba4d:	e8 2c e0 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139ba52:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
     139ba59:	00 
     139ba5a:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139ba5e:	49 69 c6 e8 03 00 00 	imul   rax,r14,0x3e8
     139ba65:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139ba69:	31 c0                	xor    eax,eax
     139ba6b:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139ba6e:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139ba71:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139ba75:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     139ba7a:	e8 1b 06 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139ba7f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba86:	00 
     139ba87:	e8 04 24 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139ba8c:	31 c0                	xor    eax,eax
     139ba8e:	4c 8d b4 24 c8 00 00 	lea    r14,[rsp+0xc8]
     139ba95:	00 
     139ba96:	41 88 46 f8          	mov    BYTE PTR [r14-0x8],al
     139ba9a:	0f 57 c0             	xorps  xmm0,xmm0
     139ba9d:	41 0f 29 46 d8       	movaps XMMWORD PTR [r14-0x28],xmm0
     139baa2:	41 88 46 e8          	mov    BYTE PTR [r14-0x18],al
     139baa6:	4c 89 f7             	mov    rdi,r14
     139baa9:	4c 89 fe             	mov    rsi,r15
     139baac:	e8 8f ea 9c ff       	call   d6a540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375c6>
     139bab1:	4c 8d a4 24 c0 01 00 	lea    r12,[rsp+0x1c0]
     139bab8:	00 
     139bab9:	49 81 c7 f8 00 00 00 	add    r15,0xf8
     139bac0:	4c 89 e7             	mov    rdi,r12
     139bac3:	4c 89 fe             	mov    rsi,r15
     139bac6:	e8 59 a3 ff ff       	call   1395e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1db3a8>
     139bacb:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
     139bad2:	0f 11 84 24 28 02 00 	movups XMMWORD PTR [rsp+0x228],xmm0
     139bad9:	00 
     139bada:	48 83 a4 24 38 02 00 	and    QWORD PTR [rsp+0x238],0x0
     139bae1:	00 00 
     139bae3:	31 c0                	xor    eax,eax
     139bae5:	88 84 24 40 02 00 00 	mov    BYTE PTR [rsp+0x240],al
     139baec:	88 84 24 48 02 00 00 	mov    BYTE PTR [rsp+0x248],al
     139baf3:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     139baf7:	48 89 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rax
     139bafe:	00 
     139baff:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]
     139bb03:	48 89 84 24 58 02 00 	mov    QWORD PTR [rsp+0x258],rax
     139bb0a:	00 
     139bb0b:	48 85 c0             	test   rax,rax
     139bb0e:	74 05                	je     139bb15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1099>
     139bb10:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     139bb15:	31 c9                	xor    ecx,ecx
     139bb17:	88 8c 24 60 02 00 00 	mov    BYTE PTR [rsp+0x260],cl
     139bb1e:	88 8c 24 68 02 00 00 	mov    BYTE PTR [rsp+0x268],cl
     139bb25:	c7 84 24 70 02 00 00 	mov    DWORD PTR [rsp+0x270],0x1
     139bb2c:	01 00 00 00 
     139bb30:	b8 00 00 80 3f       	mov    eax,0x3f800000
     139bb35:	38 8b b0 0b 00 00    	cmp    BYTE PTR [rbx+0xbb0],cl
     139bb3b:	74 06                	je     139bb43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e10c7>
     139bb3d:	8b 83 d0 0b 00 00    	mov    eax,DWORD PTR [rbx+0xbd0]
     139bb43:	89 84 24 74 02 00 00 	mov    DWORD PTR [rsp+0x274],eax
     139bb4a:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     139bb4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bb51:	ff 50 30             	call   QWORD PTR [rax+0x30]
     139bb54:	4c 8d bc 24 88 02 00 	lea    r15,[rsp+0x288]
     139bb5b:	00 
     139bb5c:	41 89 47 f0          	mov    DWORD PTR [r15-0x10],eax
     139bb60:	41 c7 47 f4 02 00 00 	mov    DWORD PTR [r15-0xc],0x2
     139bb67:	00 
     139bb68:	66 41 83 67 f8 00    	and    WORD PTR [r15-0x8],0x0
     139bb6e:	31 ed                	xor    ebp,ebp
     139bb70:	41 88 af 80 00 00 00 	mov    BYTE PTR [r15+0x80],bpl
     139bb77:	4c 8d a4 24 10 03 00 	lea    r12,[rsp+0x310]
     139bb7e:	00 
     139bb7f:	41 88 2c 24          	mov    BYTE PTR [r12],bpl
     139bb83:	41 88 6c 24 68       	mov    BYTE PTR [r12+0x68],bpl
     139bb88:	4c 8d ac 24 80 03 00 	lea    r13,[rsp+0x380]
     139bb8f:	00 
     139bb90:	0f 57 c0             	xorps  xmm0,xmm0
     139bb93:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
     139bb97:	41 0f 11 44 24 88    	movups XMMWORD PTR [r12-0x78],xmm0
     139bb9d:	41 0f 11 44 24 98    	movups XMMWORD PTR [r12-0x68],xmm0
     139bba3:	41 0f 11 44 24 a8    	movups XMMWORD PTR [r12-0x58],xmm0
     139bba9:	41 0f 11 44 24 b8    	movups XMMWORD PTR [r12-0x48],xmm0
     139bbaf:	41 0f 11 44 24 c1    	movups XMMWORD PTR [r12-0x3f],xmm0
     139bbb5:	4c 89 ef             	mov    rdi,r13
     139bbb8:	e8 39 de 43 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     139bbbd:	66 41 83 65 10 00    	and    WORD PTR [r13+0x10],0x0
     139bbc3:	41 88 6d 12          	mov    BYTE PTR [r13+0x12],bpl
     139bbc7:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]
     139bbce:	00 
     139bbcf:	e8 56 9b 7c ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     139bbd4:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139bbdb:	00 
     139bbdc:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     139bbe3:	00 
     139bbe4:	e8 eb 05 00 00       	call   139c1d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1758>
     139bbe9:	48 83 64 24 78 00    	and    QWORD PTR [rsp+0x78],0x0
     139bbef:	48 c7 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],0x1
     139bbf6:	00 01 00 00 00 
     139bbfb:	31 c0                	xor    eax,eax
     139bbfd:	88 84 24 88 00 00 00 	mov    BYTE PTR [rsp+0x88],al
     139bc04:	88 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],al
     139bc0b:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     139bc0f:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     139bc13:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     139bc18:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     139bc1d:	0f 10 44 24 60       	movups xmm0,XMMWORD PTR [rsp+0x60]
     139bc22:	0f 11 44 24 28       	movups XMMWORD PTR [rsp+0x28],xmm0
     139bc27:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     139bc2e:	00 
     139bc2f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     139bc34:	0f 10 44 24 78       	movups xmm0,XMMWORD PTR [rsp+0x78]
     139bc39:	0f 10 8c 24 88 00 00 	movups xmm1,XMMWORD PTR [rsp+0x88]
     139bc40:	00 
     139bc41:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     139bc46:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     139bc4a:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
     139bc51:	00 
     139bc52:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
     139bc57:	48 89 df             	mov    rdi,rbx
     139bc5a:	31 d2                	xor    edx,edx
     139bc5c:	e8 89 81 ff ff       	call   1393dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d936e>
     139bc61:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139bc68:	00 
     139bc69:	e8 d0 2f ff ff       	call   138ec3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d41c2>
     139bc6e:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     139bc75:	00 
     139bc76:	e8 f9 30 ff ff       	call   138ed74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d42f8>
     139bc7b:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     139bc80:	e8 95 88 e8 ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     139bc85:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139bc8c:	00 00 
     139bc8e:	48 3b 84 24 c0 06 00 	cmp    rax,QWORD PTR [rsp+0x6c0]
     139bc95:	00 
     139bc96:	0f 85 07 01 00 00    	jne    139bda3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1327>
     139bc9c:	48 81 c4 c8 06 00 00 	add    rsp,0x6c8
     139bca3:	5b                   	pop    rbx
     139bca4:	41 5c                	pop    r12
     139bca6:	41 5d                	pop    r13
     139bca8:	41 5e                	pop    r14
     139bcaa:	41 5f                	pop    r15
     139bcac:	5d                   	pop    rbp
     139bcad:	c3                   	ret
     139bcae:	48 89 c3             	mov    rbx,rax
     139bcb1:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139bcb8:	00 
     139bcb9:	e8 d2 21 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139bcbe:	e9 bb 00 00 00       	jmp    139bd7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1302>
     139bcc3:	e9 b3 00 00 00       	jmp    139bd7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e12ff>
     139bcc8:	48 89 c3             	mov    rbx,rax
     139bccb:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139bcd2:	00 
     139bcd3:	e8 66 2f ff ff       	call   138ec3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d41c2>
     139bcd8:	eb 03                	jmp    139bcdd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1261>
     139bcda:	48 89 c3             	mov    rbx,rax
     139bcdd:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     139bce4:	00 
     139bce5:	e8 8a 30 ff ff       	call   138ed74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d42f8>
     139bcea:	e9 8f 00 00 00       	jmp    139bd7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1302>
     139bcef:	48 89 c3             	mov    rbx,rax
     139bcf2:	48 8d ac 24 b0 02 00 	lea    rbp,[rsp+0x2b0]
     139bcf9:	00 
     139bcfa:	4c 89 ef             	mov    rdi,r13
     139bcfd:	e8 d2 de 43 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     139bd02:	4c 89 e7             	mov    rdi,r12
     139bd05:	e8 6a ef 7c ff       	call   b6ac74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c14>
     139bd0a:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
     139bd11:	00 
     139bd12:	e8 59 87 7c ff       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
     139bd17:	48 89 ef             	mov    rdi,rbp
     139bd1a:	e8 c7 30 ff ff       	call   138ede6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d436a>
     139bd1f:	48 8b 7d f8          	mov    rdi,QWORD PTR [rbp-0x8]

## Producer 0x139be38; FDE=(20561320, 20562040)
Strings: ad_skip
     139bd05:	e8 6a ef 7c ff       	call   b6ac74 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c14>
     139bd0a:	48 8d bc 24 b8 02 00 	lea    rdi,[rsp+0x2b8]
     139bd11:	00 
     139bd12:	e8 59 87 7c ff       	call   b64470 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb1410>
     139bd17:	48 89 ef             	mov    rdi,rbp
     139bd1a:	e8 c7 30 ff ff       	call   138ede6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d436a>
     139bd1f:	48 8b 7d f8          	mov    rdi,QWORD PTR [rbp-0x8]
     139bd23:	48 83 65 f8 00       	and    QWORD PTR [rbp-0x8],0x0
     139bd28:	48 85 ff             	test   rdi,rdi
     139bd2b:	74 06                	je     139bd33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e12b7>
     139bd2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bd30:	ff 50 08             	call   QWORD PTR [rax+0x8]
     139bd33:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
     139bd3a:	00 
     139bd3b:	e8 46 27 70 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     139bd40:	4c 89 ff             	mov    rdi,r15
     139bd43:	e8 c2 13 71 ff       	call   aad10a <JNI_OnUnload@@Base+0x349d7>
     139bd48:	4c 89 f7             	mov    rdi,r14
     139bd4b:	e8 9e 30 ff ff       	call   138edee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d4372>
     139bd50:	eb 2c                	jmp    139bd7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1302>
     139bd52:	48 89 c3             	mov    rbx,rax
     139bd55:	48 8b bc 24 58 02 00 	mov    rdi,QWORD PTR [rsp+0x258]
     139bd5c:	00 
     139bd5d:	e8 24 27 70 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     139bd62:	4c 89 e7             	mov    rdi,r12
     139bd65:	e8 68 89 8a ff       	call   c446d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x191672>
     139bd6a:	eb 03                	jmp    139bd6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e12f3>
     139bd6c:	48 89 c3             	mov    rbx,rax
     139bd6f:	4c 89 f7             	mov    rdi,r14
     139bd72:	e8 fd fa 8b ff       	call   c5b874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8814>
     139bd77:	eb 05                	jmp    139bd7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1302>
     139bd79:	eb 00                	jmp    139bd7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e12ff>
     139bd7b:	48 89 c3             	mov    rbx,rax
     139bd7e:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     139bd83:	e8 92 87 e8 ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     139bd88:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139bd8f:	00 00 
     139bd91:	48 3b 84 24 c0 06 00 	cmp    rax,QWORD PTR [rsp+0x6c0]
     139bd98:	00 
     139bd99:	75 08                	jne    139bda3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1327>
     139bd9b:	48 89 df             	mov    rdi,rbx
     139bd9e:	e8 2d 3f 6d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     139bda3:	e8 08 3d 45 00       	call   17efab0 <__stack_chk_fail@plt>
     139bda8:	55                   	push   rbp
     139bda9:	41 57                	push   r15
     139bdab:	41 56                	push   r14
     139bdad:	41 54                	push   r12
     139bdaf:	53                   	push   rbx
     139bdb0:	48 81 ec 70 04 00 00 	sub    rsp,0x470
     139bdb7:	49 89 f6             	mov    r14,rsi
     139bdba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139bdc1:	00 00 
     139bdc3:	48 89 84 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rax
     139bdca:	00 
     139bdcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bdce:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
     139bdd2:	48 8d bb 28 0c 00 00 	lea    rdi,[rbx+0xc28]
     139bdd9:	0f 10 46 20          	movups xmm0,XMMWORD PTR [rsi+0x20]
     139bddd:	e8 54 2d 74 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     139bde2:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     139bde8:	0f 57 c0             	xorps  xmm0,xmm0
     139bdeb:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     139bdf0:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     139bdf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bdf7:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     139bdfd:	49 89 c7             	mov    r15,rax
     139be00:	48 85 c0             	test   rax,rax
     139be03:	7e 4e                	jle    139be53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e13d7>
     139be05:	48 8d 35 d3 48 fb fe 	lea    rsi,[rip+0xfffffffffefb48d3]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
     139be0c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be13:	00 
     139be14:	e8 65 dc 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139be19:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
     139be20:	00 
     139be21:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139be25:	49 69 c7 e8 03 00 00 	imul   rax,r15,0x3e8
     139be2c:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139be30:	31 c0                	xor    eax,eax
     139be32:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139be35:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139be38:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139be3c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     139be41:	e8 54 02 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139be46:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be4d:	00 
     139be4e:	e8 3d 20 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139be53:	40 8a ab b0 0b 00 00 	mov    bpl,BYTE PTR [rbx+0xbb0]
     139be5a:	f3 0f 10 83 d0 0b 00 	movss  xmm0,DWORD PTR [rbx+0xbd0]
     139be61:	00 
     139be62:	f3 0f 11 44 24 4c    	movss  DWORD PTR [rsp+0x4c],xmm0
     139be68:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     139be6f:	00 
     139be70:	4c 89 f6             	mov    rsi,r14
     139be73:	e8 36 9f fe ff       	call   1385dae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb332>
     139be78:	40 84 ed             	test   bpl,bpl
     139be7b:	74 08                	je     139be85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1409>
     139be7d:	f3 0f 10 4c 24 4c    	movss  xmm1,DWORD PTR [rsp+0x4c]
     139be83:	eb 08                	jmp    139be8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1411>
     139be85:	f3 0f 10 0d fb 27 ff 	movss  xmm1,DWORD PTR [rip+0xfffffffffeff27fb]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
     139be8c:	fe 
     139be8d:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     139be94:	00 
     139be95:	49 83 26 00          	and    QWORD PTR [r14],0x0
     139be99:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
     139bea0:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
     139bea5:	31 c0                	xor    eax,eax
     139bea7:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
     139beab:	f3 41 0f 11 4e 1c    	movss  DWORD PTR [r14+0x1c],xmm1
     139beb1:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
     139beb5:	66 41 83 66 28 00    	and    WORD PTR [r14+0x28],0x0
     139bebb:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
     139bec2:	00 
     139bec3:	4c 8d a4 24 20 01 00 	lea    r12,[rsp+0x120]
     139beca:	00 
     139becb:	0f 57 c0             	xorps  xmm0,xmm0
     139bece:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     139bed3:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     139bed9:	41 0f 11 44 24 e0    	movups XMMWORD PTR [r12-0x20],xmm0
     139bedf:	41 0f 11 44 24 ec    	movups XMMWORD PTR [r12-0x14],xmm0
     139bee5:	49 c7 44 24 18 02 00 	mov    QWORD PTR [r12+0x18],0x2
     139beec:	00 00 
     139beee:	66 41 c7 44 24 20 01 	mov    WORD PTR [r12+0x20],0x1
     139bef5:	00 
     139bef6:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
     139befd:	00 
     139befe:	e8 27 98 7c ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     139bf03:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139bf0a:	00 
     139bf0b:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     139bf12:	00 
     139bf13:	e8 a6 02 00 00       	call   139c1be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1742>
     139bf18:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0
     139bf1f:	00 00 
     139bf21:	48 c7 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],0x1
     139bf28:	00 01 00 00 00 
     139bf2d:	31 c0                	xor    eax,eax
     139bf2f:	88 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],al
     139bf36:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
     139bf3d:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     139bf41:	88 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],al
     139bf48:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
     139bf4f:	00 
     139bf50:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     139bf55:	0f 10 44 24 70       	movups xmm0,XMMWORD PTR [rsp+0x70]
     139bf5a:	0f 11 44 24 28       	movups XMMWORD PTR [rsp+0x28],xmm0
     139bf5f:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     139bf66:	00 
     139bf67:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     139bf6c:	0f 10 84 24 88 00 00 	movups xmm0,XMMWORD PTR [rsp+0x88]
     139bf73:	00 
     139bf74:	0f 10 8c 24 98 00 00 	movups xmm1,XMMWORD PTR [rsp+0x98]
     139bf7b:	00 
     139bf7c:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     139bf81:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
     139bf85:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
     139bf8c:	00 
     139bf8d:	48 8d 4c 24 50       	lea    rcx,[rsp+0x50]
     139bf92:	48 89 df             	mov    rdi,rbx
     139bf95:	31 d2                	xor    edx,edx
     139bf97:	e8 4e 7e ff ff       	call   1393dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d936e>
     139bf9c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139bfa3:	00 
     139bfa4:	e8 95 2c ff ff       	call   138ec3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d41c2>
     139bfa9:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     139bfb0:	00 
     139bfb1:	e8 62 2d ff ff       	call   138ed18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d429c>
     139bfb6:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     139bfbb:	e8 5a 85 e8 ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     139bfc0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139bfc7:	00 00 
     139bfc9:	48 3b 84 24 68 04 00 	cmp    rax,QWORD PTR [rsp+0x468]
     139bfd0:	00 
     139bfd1:	0f 85 9c 00 00 00    	jne    139c073 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e15f7>
     139bfd7:	48 81 c4 70 04 00 00 	add    rsp,0x470
     139bfde:	5b                   	pop    rbx
     139bfdf:	41 5c                	pop    r12
     139bfe1:	41 5e                	pop    r14
     139bfe3:	41 5f                	pop    r15
     139bfe5:	5d                   	pop    rbp
     139bfe6:	c3                   	ret
     139bfe7:	48 89 c3             	mov    rbx,rax
     139bfea:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139bff1:	00 
     139bff2:	e8 99 1e 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139bff7:	eb 55                	jmp    139c04e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e15d2>
     139bff9:	eb 50                	jmp    139c04b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e15cf>
     139bffb:	48 89 c3             	mov    rbx,rax
     139bffe:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139c005:	00 
     139c006:	e8 33 2c ff ff       	call   138ec3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d41c2>
     139c00b:	eb 03                	jmp    139c010 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1594>
     139c00d:	48 89 c3             	mov    rbx,rax
     139c010:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     139c017:	00 
     139c018:	e8 fb 2c ff ff       	call   138ed18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d429c>
     139c01d:	eb 2f                	jmp    139c04e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e15d2>
     139c01f:	48 89 c3             	mov    rbx,rax
     139c022:	4c 89 e7             	mov    rdi,r12
     139c025:	e8 66 1e 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139c02a:	4c 89 ff             	mov    rdi,r15
     139c02d:	e8 5e 1e 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139c032:	4c 89 f7             	mov    rdi,r14
     139c035:	e8 12 2d ff ff       	call   138ed4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d42d0>
     139c03a:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     139c041:	00 
     139c042:	e8 93 79 fb ff       	call   13539da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198f5e>
     139c047:	eb 05                	jmp    139c04e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e15d2>
     139c049:	eb 00                	jmp    139c04b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e15cf>
     139c04b:	48 89 c3             	mov    rbx,rax
     139c04e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     139c053:	e8 c2 84 e8 ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     139c058:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139c05f:	00 00 
     139c061:	48 3b 84 24 68 04 00 	cmp    rax,QWORD PTR [rsp+0x468]
     139c068:	00 
     139c069:	75 08                	jne    139c073 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e15f7>
     139c06b:	48 89 df             	mov    rdi,rbx
     139c06e:	e8 5d 3c 6d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     139c073:	e8 38 3a 45 00       	call   17efab0 <__stack_chk_fail@plt>
     139c078:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139c07b:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     139c07f:	0f b6 16             	movzx  edx,BYTE PTR [rsi]
     139c082:	c6 80 40 04 00 00 03 	mov    BYTE PTR [rax+0x440],0x3
     139c089:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
     139c08d:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     139c090:	48 8b 49 28          	mov    rcx,QWORD PTR [rcx+0x28]
     139c094:	48 89 c6             	mov    rsi,rax
     139c097:	ff e1                	jmp    rcx
     139c099:	cc                   	int3
     139c09a:	41 57                	push   r15
     139c09c:	41 56                	push   r14
     139c09e:	41 55                	push   r13
     139c0a0:	41 54                	push   r12
     139c0a2:	53                   	push   rbx
     139c0a3:	48 83 ec 30          	sub    rsp,0x30
     139c0a7:	49 89 f6             	mov    r14,rsi
     139c0aa:	48 89 fb             	mov    rbx,rdi
     139c0ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139c0b4:	00 00 
     139c0b6:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     139c0bb:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]

## Direct callers of 0x139c09a
### 0x139ba7a; caller=(20560346, 20561320)
Strings: ad_skip
     139b9e3:	53                   	push   rbx
     139b9e4:	48 81 ec c8 06 00 00 	sub    rsp,0x6c8
     139b9eb:	49 89 f7             	mov    r15,rsi
     139b9ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139b9f5:	00 00 
     139b9f7:	48 89 84 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rax
     139b9fe:	00 
     139b9ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139ba02:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     139ba05:	48 8d bb 28 0c 00 00 	lea    rdi,[rbx+0xc28]
     139ba0c:	0f 10 86 60 01 00 00 	movups xmm0,XMMWORD PTR [rsi+0x160]
     139ba13:	e8 1e 31 74 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     139ba18:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
     139ba1e:	0f 57 c0             	xorps  xmm0,xmm0
     139ba21:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     139ba26:	49 8b bf 60 01 00 00 	mov    rdi,QWORD PTR [r15+0x160]
     139ba2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139ba30:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     139ba36:	49 89 c6             	mov    r14,rax
     139ba39:	48 85 c0             	test   rax,rax
     139ba3c:	7e 4e                	jle    139ba8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1010>
     139ba3e:	48 8d 35 9a 4c fb fe 	lea    rsi,[rip+0xfffffffffefb4c9a]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
     139ba45:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba4c:	00 
     139ba4d:	e8 2c e0 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139ba52:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
     139ba59:	00 
     139ba5a:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139ba5e:	49 69 c6 e8 03 00 00 	imul   rax,r14,0x3e8
     139ba65:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139ba69:	31 c0                	xor    eax,eax
     139ba6b:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139ba6e:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139ba71:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139ba75:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     139ba7a:	e8 1b 06 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139ba7f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba86:	00 
     139ba87:	e8 04 24 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139ba8c:	31 c0                	xor    eax,eax
     139ba8e:	4c 8d b4 24 c8 00 00 	lea    r14,[rsp+0xc8]
     139ba95:	00 
     139ba96:	41 88 46 f8          	mov    BYTE PTR [r14-0x8],al
     139ba9a:	0f 57 c0             	xorps  xmm0,xmm0
     139ba9d:	41 0f 29 46 d8       	movaps XMMWORD PTR [r14-0x28],xmm0
     139baa2:	41 88 46 e8          	mov    BYTE PTR [r14-0x18],al
     139baa6:	4c 89 f7             	mov    rdi,r14
     139baa9:	4c 89 fe             	mov    rsi,r15
     139baac:	e8 8f ea 9c ff       	call   d6a540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375c6>
     139bab1:	4c 8d a4 24 c0 01 00 	lea    r12,[rsp+0x1c0]
     139bab8:	00 
     139bab9:	49 81 c7 f8 00 00 00 	add    r15,0xf8
     139bac0:	4c 89 e7             	mov    rdi,r12
     139bac3:	4c 89 fe             	mov    rsi,r15
     139bac6:	e8 59 a3 ff ff       	call   1395e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1db3a8>
     139bacb:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
     139bad2:	0f 11 84 24 28 02 00 	movups XMMWORD PTR [rsp+0x228],xmm0
     139bad9:	00 
     139bada:	48 83 a4 24 38 02 00 	and    QWORD PTR [rsp+0x238],0x0
     139bae1:	00 00 
     139bae3:	31 c0                	xor    eax,eax
     139bae5:	88 84 24 40 02 00 00 	mov    BYTE PTR [rsp+0x240],al
     139baec:	88 84 24 48 02 00 00 	mov    BYTE PTR [rsp+0x248],al
     139baf3:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     139baf7:	48 89 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rax
     139bafe:	00 
     139baff:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]
     139bb03:	48 89 84 24 58 02 00 	mov    QWORD PTR [rsp+0x258],rax
     139bb0a:	00 
     139bb0b:	48 85 c0             	test   rax,rax
     139bb0e:	74 05                	je     139bb15 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1099>
     139bb10:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     139bb15:	31 c9                	xor    ecx,ecx
     139bb17:	88 8c 24 60 02 00 00 	mov    BYTE PTR [rsp+0x260],cl
     139bb1e:	88 8c 24 68 02 00 00 	mov    BYTE PTR [rsp+0x268],cl
     139bb25:	c7 84 24 70 02 00 00 	mov    DWORD PTR [rsp+0x270],0x1
     139bb2c:	01 00 00 00 
     139bb30:	b8 00 00 80 3f       	mov    eax,0x3f800000
     139bb35:	38 8b b0 0b 00 00    	cmp    BYTE PTR [rbx+0xbb0],cl
     139bb3b:	74 06                	je     139bb43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e10c7>
     139bb3d:	8b 83 d0 0b 00 00    	mov    eax,DWORD PTR [rbx+0xbd0]
     139bb43:	89 84 24 74 02 00 00 	mov    DWORD PTR [rsp+0x274],eax
     139bb4a:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     139bb4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bb51:	ff 50 30             	call   QWORD PTR [rax+0x30]
     139bb54:	4c 8d bc 24 88 02 00 	lea    r15,[rsp+0x288]
     139bb5b:	00 
     139bb5c:	41 89 47 f0          	mov    DWORD PTR [r15-0x10],eax
     139bb60:	41 c7 47 f4 02 00 00 	mov    DWORD PTR [r15-0xc],0x2
     139bb67:	00 
     139bb68:	66 41 83 67 f8 00    	and    WORD PTR [r15-0x8],0x0

### 0x139be41; caller=(20561320, 20562040)
Strings: ad_skip
     139bdaf:	53                   	push   rbx
     139bdb0:	48 81 ec 70 04 00 00 	sub    rsp,0x470
     139bdb7:	49 89 f6             	mov    r14,rsi
     139bdba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139bdc1:	00 00 
     139bdc3:	48 89 84 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rax
     139bdca:	00 
     139bdcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bdce:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
     139bdd2:	48 8d bb 28 0c 00 00 	lea    rdi,[rbx+0xc28]
     139bdd9:	0f 10 46 20          	movups xmm0,XMMWORD PTR [rsi+0x20]
     139bddd:	e8 54 2d 74 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     139bde2:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     139bde8:	0f 57 c0             	xorps  xmm0,xmm0
     139bdeb:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     139bdf0:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     139bdf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bdf7:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     139bdfd:	49 89 c7             	mov    r15,rax
     139be00:	48 85 c0             	test   rax,rax
     139be03:	7e 4e                	jle    139be53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e13d7>
     139be05:	48 8d 35 d3 48 fb fe 	lea    rsi,[rip+0xfffffffffefb48d3]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
     139be0c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be13:	00 
     139be14:	e8 65 dc 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139be19:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
     139be20:	00 
     139be21:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139be25:	49 69 c7 e8 03 00 00 	imul   rax,r15,0x3e8
     139be2c:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139be30:	31 c0                	xor    eax,eax
     139be32:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139be35:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139be38:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139be3c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     139be41:	e8 54 02 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139be46:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be4d:	00 
     139be4e:	e8 3d 20 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139be53:	40 8a ab b0 0b 00 00 	mov    bpl,BYTE PTR [rbx+0xbb0]
     139be5a:	f3 0f 10 83 d0 0b 00 	movss  xmm0,DWORD PTR [rbx+0xbd0]
     139be61:	00 
     139be62:	f3 0f 11 44 24 4c    	movss  DWORD PTR [rsp+0x4c],xmm0
     139be68:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     139be6f:	00 
     139be70:	4c 89 f6             	mov    rsi,r14
     139be73:	e8 36 9f fe ff       	call   1385dae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb332>
     139be78:	40 84 ed             	test   bpl,bpl
     139be7b:	74 08                	je     139be85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1409>
     139be7d:	f3 0f 10 4c 24 4c    	movss  xmm1,DWORD PTR [rsp+0x4c]
     139be83:	eb 08                	jmp    139be8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1411>
     139be85:	f3 0f 10 0d fb 27 ff 	movss  xmm1,DWORD PTR [rip+0xfffffffffeff27fb]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
     139be8c:	fe 
     139be8d:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     139be94:	00 
     139be95:	49 83 26 00          	and    QWORD PTR [r14],0x0
     139be99:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
     139bea0:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
     139bea5:	31 c0                	xor    eax,eax
     139bea7:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
     139beab:	f3 41 0f 11 4e 1c    	movss  DWORD PTR [r14+0x1c],xmm1
     139beb1:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
     139beb5:	66 41 83 66 28 00    	and    WORD PTR [r14+0x28],0x0
     139bebb:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
     139bec2:	00 
     139bec3:	4c 8d a4 24 20 01 00 	lea    r12,[rsp+0x120]
     139beca:	00 
     139becb:	0f 57 c0             	xorps  xmm0,xmm0
     139bece:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
     139bed3:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     139bed9:	41 0f 11 44 24 e0    	movups XMMWORD PTR [r12-0x20],xmm0
     139bedf:	41 0f 11 44 24 ec    	movups XMMWORD PTR [r12-0x14],xmm0
     139bee5:	49 c7 44 24 18 02 00 	mov    QWORD PTR [r12+0x18],0x2
     139beec:	00 00 
     139beee:	66 41 c7 44 24 20 01 	mov    WORD PTR [r12+0x20],0x1
     139bef5:	00 
     139bef6:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
     139befd:	00 
     139befe:	e8 27 98 7c ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     139bf03:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139bf0a:	00 
     139bf0b:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     139bf12:	00 
     139bf13:	e8 a6 02 00 00       	call   139c1be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1742>
     139bf18:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0
     139bf1f:	00 00 
     139bf21:	48 c7 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],0x1
     139bf28:	00 01 00 00 00 
     139bf2d:	31 c0                	xor    eax,eax
     139bf2f:	88 84 24 98 00 00 00 	mov    BYTE PTR [rsp+0x98],al
     139bf36:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al

### 0x1473ec1; caller=(21446232, 21446734)
Strings: 
     1473e44:	31 d2                	xor    edx,edx
     1473e46:	ff d0                	call   rax
     1473e48:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     1473e4d:	5b                   	pop    rbx
     1473e4e:	c3                   	ret
     1473e4f:	48 89 c7             	mov    rdi,rax
     1473e52:	e8 4e 5c 60 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1473e57:	cc                   	int3
     1473e58:	41 57                	push   r15
     1473e5a:	41 56                	push   r14
     1473e5c:	41 54                	push   r12
     1473e5e:	53                   	push   rbx
     1473e5f:	48 81 ec 88 01 00 00 	sub    rsp,0x188
     1473e66:	49 89 d6             	mov    r14,rdx
     1473e69:	48 89 fb             	mov    rbx,rdi
     1473e6c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1473e73:	00 00 
     1473e75:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
     1473e7c:	00 
     1473e7d:	0f 57 c0             	xorps  xmm0,xmm0
     1473e80:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1473e84:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     1473e8a:	48 8d 35 7f 4b fc fe 	lea    rsi,[rip+0xfffffffffefc4b7f]        # 438a10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e45f>
     1473e91:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473e98:	00 
     1473e99:	e8 a2 a0 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1473e9e:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1473ea5:	00 
     1473ea6:	c7 46 18 19 00 00 00 	mov    DWORD PTR [rsi+0x18],0x19
     1473ead:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     1473eb2:	31 c0                	xor    eax,eax
     1473eb4:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     1473eb7:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     1473eba:	c6 46 38 07          	mov    BYTE PTR [rsi+0x38],0x7
     1473ebe:	48 89 e7             	mov    rdi,rsp
     1473ec1:	e8 d4 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473ec6:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473ecd:	00 
     1473ece:	e8 bd 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473ed3:	48 8d 35 4e 4b fc fe 	lea    rsi,[rip+0xfffffffffefc4b4e]        # 438a28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e477>
     1473eda:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473ee1:	00 
     1473ee2:	e8 59 a0 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1473ee7:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1473eee:	00 
     1473eef:	c7 46 18 32 00 00 00 	mov    DWORD PTR [rsi+0x18],0x32
     1473ef6:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     1473efb:	31 c0                	xor    eax,eax
     1473efd:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     1473f00:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     1473f03:	c6 46 38 07          	mov    BYTE PTR [rsi+0x38],0x7
     1473f07:	48 89 e7             	mov    rdi,rsp
     1473f0a:	e8 8b 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473f0f:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f16:	00 
     1473f17:	e8 74 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473f1c:	48 8d 35 1d 4b fc fe 	lea    rsi,[rip+0xfffffffffefc4b1d]        # 438a40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e48f>
     1473f23:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f2a:	00 
     1473f2b:	e8 10 a0 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1473f30:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1473f37:	00 
     1473f38:	c7 46 18 4b 00 00 00 	mov    DWORD PTR [rsi+0x18],0x4b
     1473f3f:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     1473f44:	31 c0                	xor    eax,eax
     1473f46:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     1473f49:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     1473f4c:	c6 46 38 07          	mov    BYTE PTR [rsi+0x38],0x7
     1473f50:	48 89 e7             	mov    rdi,rsp
     1473f53:	e8 42 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473f58:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
     1473f5f:	00 
     1473f60:	4c 89 ff             	mov    rdi,r15
     1473f63:	e8 28 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473f68:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f6f:	00 
     1473f70:	6a 01                	push   0x1
     1473f72:	5a                   	pop    rdx
     1473f73:	4c 89 f6             	mov    rsi,r14
     1473f76:	e8 4b 52 0e 00       	call   15591c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e74a>
     1473f7b:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     1473f80:	4d 89 34 24          	mov    QWORD PTR [r12],r14
     1473f84:	41 c6 44 24 08 01    	mov    BYTE PTR [r12+0x8],0x1
     1473f8a:	31 c0                	xor    eax,eax
     1473f8c:	41 88 44 24 10       	mov    BYTE PTR [r12+0x10],al
     1473f91:	41 88 44 24 58       	mov    BYTE PTR [r12+0x58],al
     1473f96:	41 88 44 24 60       	mov    BYTE PTR [r12+0x60],al
     1473f9b:	41 88 84 24 a8 00 00 	mov    BYTE PTR [r12+0xa8],al
     1473fa2:	00 
     1473fa3:	4c 89 ff             	mov    rdi,r15
     1473fa6:	4c 89 e6             	mov    rsi,r12

### 0x1473f0a; caller=(21446232, 21446734)
Strings: 
     1473e75:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
     1473e7c:	00 
     1473e7d:	0f 57 c0             	xorps  xmm0,xmm0
     1473e80:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1473e84:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     1473e8a:	48 8d 35 7f 4b fc fe 	lea    rsi,[rip+0xfffffffffefc4b7f]        # 438a10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e45f>
     1473e91:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473e98:	00 
     1473e99:	e8 a2 a0 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1473e9e:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1473ea5:	00 
     1473ea6:	c7 46 18 19 00 00 00 	mov    DWORD PTR [rsi+0x18],0x19
     1473ead:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     1473eb2:	31 c0                	xor    eax,eax
     1473eb4:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     1473eb7:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     1473eba:	c6 46 38 07          	mov    BYTE PTR [rsi+0x38],0x7
     1473ebe:	48 89 e7             	mov    rdi,rsp
     1473ec1:	e8 d4 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473ec6:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473ecd:	00 
     1473ece:	e8 bd 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473ed3:	48 8d 35 4e 4b fc fe 	lea    rsi,[rip+0xfffffffffefc4b4e]        # 438a28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e477>
     1473eda:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473ee1:	00 
     1473ee2:	e8 59 a0 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1473ee7:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1473eee:	00 
     1473eef:	c7 46 18 32 00 00 00 	mov    DWORD PTR [rsi+0x18],0x32
     1473ef6:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     1473efb:	31 c0                	xor    eax,eax
     1473efd:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     1473f00:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     1473f03:	c6 46 38 07          	mov    BYTE PTR [rsi+0x38],0x7
     1473f07:	48 89 e7             	mov    rdi,rsp
     1473f0a:	e8 8b 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473f0f:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f16:	00 
     1473f17:	e8 74 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473f1c:	48 8d 35 1d 4b fc fe 	lea    rsi,[rip+0xfffffffffefc4b1d]        # 438a40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e48f>
     1473f23:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f2a:	00 
     1473f2b:	e8 10 a0 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1473f30:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1473f37:	00 
     1473f38:	c7 46 18 4b 00 00 00 	mov    DWORD PTR [rsi+0x18],0x4b
     1473f3f:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     1473f44:	31 c0                	xor    eax,eax
     1473f46:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     1473f49:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     1473f4c:	c6 46 38 07          	mov    BYTE PTR [rsi+0x38],0x7
     1473f50:	48 89 e7             	mov    rdi,rsp
     1473f53:	e8 42 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473f58:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
     1473f5f:	00 
     1473f60:	4c 89 ff             	mov    rdi,r15
     1473f63:	e8 28 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473f68:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f6f:	00 
     1473f70:	6a 01                	push   0x1
     1473f72:	5a                   	pop    rdx
     1473f73:	4c 89 f6             	mov    rsi,r14
     1473f76:	e8 4b 52 0e 00       	call   15591c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e74a>
     1473f7b:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     1473f80:	4d 89 34 24          	mov    QWORD PTR [r12],r14
     1473f84:	41 c6 44 24 08 01    	mov    BYTE PTR [r12+0x8],0x1
     1473f8a:	31 c0                	xor    eax,eax
     1473f8c:	41 88 44 24 10       	mov    BYTE PTR [r12+0x10],al
     1473f91:	41 88 44 24 58       	mov    BYTE PTR [r12+0x58],al
     1473f96:	41 88 44 24 60       	mov    BYTE PTR [r12+0x60],al
     1473f9b:	41 88 84 24 a8 00 00 	mov    BYTE PTR [r12+0xa8],al
     1473fa2:	00 
     1473fa3:	4c 89 ff             	mov    rdi,r15
     1473fa6:	4c 89 e6             	mov    rsi,r12
     1473fa9:	e8 6d c4 c3 ff       	call   10b041b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277831>
     1473fae:	84 c0                	test   al,al
     1473fb0:	74 3e                	je     1473ff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9574>
     1473fb2:	4c 89 ff             	mov    rdi,r15
     1473fb5:	e8 e4 50 0e 00       	call   155909e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e622>
     1473fba:	83 b8 90 02 00 00 00 	cmp    DWORD PTR [rax+0x290],0x0
     1473fc1:	75 23                	jne    1473fe6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b956a>
     1473fc3:	48 89 c7             	mov    rdi,rax
     1473fc6:	e8 6c d5 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1473fcb:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
     1473fcf:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     1473fd4:	48 29 d1             	sub    rcx,rdx
     1473fd7:	48 c1 f9 06          	sar    rcx,0x6
     1473fdb:	4c 89 f7             	mov    rdi,r14
     1473fde:	48 89 c6             	mov    rsi,rax
     1473fe1:	e8 02 4a 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     1473fe6:	4c 89 ff             	mov    rdi,r15

### 0x1473f53; caller=(21446232, 21446734)
Strings: 
     1473ebe:	48 89 e7             	mov    rdi,rsp
     1473ec1:	e8 d4 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473ec6:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473ecd:	00 
     1473ece:	e8 bd 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473ed3:	48 8d 35 4e 4b fc fe 	lea    rsi,[rip+0xfffffffffefc4b4e]        # 438a28 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e477>
     1473eda:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473ee1:	00 
     1473ee2:	e8 59 a0 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1473ee7:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1473eee:	00 
     1473eef:	c7 46 18 32 00 00 00 	mov    DWORD PTR [rsi+0x18],0x32
     1473ef6:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     1473efb:	31 c0                	xor    eax,eax
     1473efd:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     1473f00:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     1473f03:	c6 46 38 07          	mov    BYTE PTR [rsi+0x38],0x7
     1473f07:	48 89 e7             	mov    rdi,rsp
     1473f0a:	e8 8b 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473f0f:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f16:	00 
     1473f17:	e8 74 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473f1c:	48 8d 35 1d 4b fc fe 	lea    rsi,[rip+0xfffffffffefc4b1d]        # 438a40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e48f>
     1473f23:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f2a:	00 
     1473f2b:	e8 10 a0 37 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1473f30:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1473f37:	00 
     1473f38:	c7 46 18 4b 00 00 00 	mov    DWORD PTR [rsi+0x18],0x4b
     1473f3f:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
     1473f44:	31 c0                	xor    eax,eax
     1473f46:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     1473f49:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     1473f4c:	c6 46 38 07          	mov    BYTE PTR [rsi+0x38],0x7
     1473f50:	48 89 e7             	mov    rdi,rsp
     1473f53:	e8 42 81 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1473f58:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
     1473f5f:	00 
     1473f60:	4c 89 ff             	mov    rdi,r15
     1473f63:	e8 28 9f 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1473f68:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1473f6f:	00 
     1473f70:	6a 01                	push   0x1
     1473f72:	5a                   	pop    rdx
     1473f73:	4c 89 f6             	mov    rsi,r14
     1473f76:	e8 4b 52 0e 00       	call   15591c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e74a>
     1473f7b:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     1473f80:	4d 89 34 24          	mov    QWORD PTR [r12],r14
     1473f84:	41 c6 44 24 08 01    	mov    BYTE PTR [r12+0x8],0x1
     1473f8a:	31 c0                	xor    eax,eax
     1473f8c:	41 88 44 24 10       	mov    BYTE PTR [r12+0x10],al
     1473f91:	41 88 44 24 58       	mov    BYTE PTR [r12+0x58],al
     1473f96:	41 88 44 24 60       	mov    BYTE PTR [r12+0x60],al
     1473f9b:	41 88 84 24 a8 00 00 	mov    BYTE PTR [r12+0xa8],al
     1473fa2:	00 
     1473fa3:	4c 89 ff             	mov    rdi,r15
     1473fa6:	4c 89 e6             	mov    rsi,r12
     1473fa9:	e8 6d c4 c3 ff       	call   10b041b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277831>
     1473fae:	84 c0                	test   al,al
     1473fb0:	74 3e                	je     1473ff0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9574>
     1473fb2:	4c 89 ff             	mov    rdi,r15
     1473fb5:	e8 e4 50 0e 00       	call   155909e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e622>
     1473fba:	83 b8 90 02 00 00 00 	cmp    DWORD PTR [rax+0x290],0x0
     1473fc1:	75 23                	jne    1473fe6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b956a>
     1473fc3:	48 89 c7             	mov    rdi,rax
     1473fc6:	e8 6c d5 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1473fcb:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
     1473fcf:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     1473fd4:	48 29 d1             	sub    rcx,rdx
     1473fd7:	48 c1 f9 06          	sar    rcx,0x6
     1473fdb:	4c 89 f7             	mov    rdi,r14
     1473fde:	48 89 c6             	mov    rsi,rax
     1473fe1:	e8 02 4a 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     1473fe6:	4c 89 ff             	mov    rdi,r15
     1473fe9:	e8 ee 50 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>
     1473fee:	eb b3                	jmp    1473fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b9527>
     1473ff0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1473ff5:	e8 70 c4 c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1473ffa:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1474001:	00 
     1474002:	e8 63 c4 c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1474007:	48 89 df             	mov    rdi,rbx
     147400a:	4c 89 f6             	mov    rsi,r14
     147400d:	e8 ee bb da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1474012:	48 89 e7             	mov    rdi,rsp
     1474015:	e8 00 05 db ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     147401a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1474021:	00 00 
     1474023:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
     147402a:	00 
     147402b:	75 12                	jne    147403f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b95c3>

### 0x147697e; caller=(21456994, 21457553)
Strings: 
     14768ea:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
     14768ef:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     14768f4:	4c 89 e7             	mov    rdi,r12
     14768f7:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     14768fe:	00 
     14768ff:	e8 17 9b c3 ff       	call   10b041b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277831>
     1476904:	84 c0                	test   al,al
     1476906:	0f 84 04 01 00 00    	je     1476a10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbf94>
     147690c:	4c 89 e7             	mov    rdi,r12
     147690f:	e8 8a 27 0e 00       	call   155909e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e622>
     1476914:	48 89 c7             	mov    rdi,rax
     1476917:	e8 1b ac 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     147691c:	49 89 c6             	mov    r14,rax
     147691f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1476924:	48 89 c6             	mov    rsi,rax
     1476927:	e8 96 5f 64 ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>
     147692c:	48 85 c0             	test   rax,rax
     147692f:	0f 84 ce 00 00 00    	je     1476a03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbf87>
     1476935:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     147693b:	0f 57 c0             	xorps  xmm0,xmm0
     147693e:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1476943:	4c 8b 78 28          	mov    r15,QWORD PTR [rax+0x28]
     1476947:	4c 8b 60 30          	mov    r12,QWORD PTR [rax+0x30]
     147694b:	4d 39 e7             	cmp    r15,r12
     147694e:	0f 84 84 00 00 00    	je     14769d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbf5c>
     1476954:	0f 57 c0             	xorps  xmm0,xmm0
     1476957:	0f 11 44 24 4c       	movups XMMWORD PTR [rsp+0x4c],xmm0
     147695c:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1476961:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1476964:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1476969:	44 88 6c 24 68       	mov    BYTE PTR [rsp+0x68],r13b
     147696e:	44 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],r13b
     1476973:	c6 44 24 78 0a       	mov    BYTE PTR [rsp+0x78],0xa
     1476978:	48 89 ef             	mov    rdi,rbp
     147697b:	48 89 de             	mov    rsi,rbx
     147697e:	e8 17 57 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1476983:	48 89 df             	mov    rdi,rbx
     1476986:	e8 05 75 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     147698b:	0f 57 c0             	xorps  xmm0,xmm0
     147698e:	0f 11 44 24 4c       	movups XMMWORD PTR [rsp+0x4c],xmm0
     1476993:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1476998:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     147699c:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     14769a1:	44 88 6c 24 68       	mov    BYTE PTR [rsp+0x68],r13b
     14769a6:	44 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],r13b
     14769ab:	c6 44 24 78 0a       	mov    BYTE PTR [rsp+0x78],0xa
     14769b0:	48 89 ef             	mov    rdi,rbp
     14769b3:	48 89 de             	mov    rsi,rbx
     14769b6:	e8 df 56 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     14769bb:	48 89 df             	mov    rdi,rbx
     14769be:	e8 cd 74 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14769c3:	49 83 c7 10          	add    r15,0x10
     14769c7:	4d 39 e7             	cmp    r15,r12
     14769ca:	75 88                	jne    1476954 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbed8>
     14769cc:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     14769d1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14769d6:	eb 04                	jmp    14769dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbf60>
     14769d8:	31 c9                	xor    ecx,ecx
     14769da:	31 d2                	xor    edx,edx
     14769dc:	48 29 d1             	sub    rcx,rdx
     14769df:	48 c1 f9 06          	sar    rcx,0x6
     14769e3:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     14769e8:	4c 89 ff             	mov    rdi,r15
     14769eb:	4c 89 f6             	mov    rsi,r14
     14769ee:	e8 f5 1f 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     14769f3:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     14769fa:	00 
     14769fb:	48 89 ef             	mov    rdi,rbp
     14769fe:	e8 17 db da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     1476a03:	4c 89 e7             	mov    rdi,r12
     1476a06:	e8 d1 26 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>
     1476a0b:	e9 e4 fe ff ff       	jmp    14768f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbe78>
     1476a10:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1476a17:	00 
     1476a18:	e8 4d 9a c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1476a1d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1476a24:	00 
     1476a25:	e8 40 9a c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1476a2a:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1476a2f:	48 89 df             	mov    rdi,rbx
     1476a32:	4c 89 fe             	mov    rsi,r15
     1476a35:	e8 c6 91 da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1476a3a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1476a41:	00 00 
     1476a43:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
     1476a4a:	00 
     1476a4b:	74 20                	je     1476a6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbff1>
     1476a4d:	eb 33                	jmp    1476a82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc006>
     1476a4f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1476a56:	00 00 
     1476a58:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]

### 0x14769b6; caller=(21456994, 21457553)
Strings: 
     147691f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1476924:	48 89 c6             	mov    rsi,rax
     1476927:	e8 96 5f 64 ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>
     147692c:	48 85 c0             	test   rax,rax
     147692f:	0f 84 ce 00 00 00    	je     1476a03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbf87>
     1476935:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     147693b:	0f 57 c0             	xorps  xmm0,xmm0
     147693e:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1476943:	4c 8b 78 28          	mov    r15,QWORD PTR [rax+0x28]
     1476947:	4c 8b 60 30          	mov    r12,QWORD PTR [rax+0x30]
     147694b:	4d 39 e7             	cmp    r15,r12
     147694e:	0f 84 84 00 00 00    	je     14769d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbf5c>
     1476954:	0f 57 c0             	xorps  xmm0,xmm0
     1476957:	0f 11 44 24 4c       	movups XMMWORD PTR [rsp+0x4c],xmm0
     147695c:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1476961:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1476964:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1476969:	44 88 6c 24 68       	mov    BYTE PTR [rsp+0x68],r13b
     147696e:	44 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],r13b
     1476973:	c6 44 24 78 0a       	mov    BYTE PTR [rsp+0x78],0xa
     1476978:	48 89 ef             	mov    rdi,rbp
     147697b:	48 89 de             	mov    rsi,rbx
     147697e:	e8 17 57 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1476983:	48 89 df             	mov    rdi,rbx
     1476986:	e8 05 75 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     147698b:	0f 57 c0             	xorps  xmm0,xmm0
     147698e:	0f 11 44 24 4c       	movups XMMWORD PTR [rsp+0x4c],xmm0
     1476993:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1476998:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     147699c:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     14769a1:	44 88 6c 24 68       	mov    BYTE PTR [rsp+0x68],r13b
     14769a6:	44 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],r13b
     14769ab:	c6 44 24 78 0a       	mov    BYTE PTR [rsp+0x78],0xa
     14769b0:	48 89 ef             	mov    rdi,rbp
     14769b3:	48 89 de             	mov    rsi,rbx
     14769b6:	e8 df 56 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     14769bb:	48 89 df             	mov    rdi,rbx
     14769be:	e8 cd 74 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14769c3:	49 83 c7 10          	add    r15,0x10
     14769c7:	4d 39 e7             	cmp    r15,r12
     14769ca:	75 88                	jne    1476954 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbed8>
     14769cc:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     14769d1:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     14769d6:	eb 04                	jmp    14769dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbf60>
     14769d8:	31 c9                	xor    ecx,ecx
     14769da:	31 d2                	xor    edx,edx
     14769dc:	48 29 d1             	sub    rcx,rdx
     14769df:	48 c1 f9 06          	sar    rcx,0x6
     14769e3:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     14769e8:	4c 89 ff             	mov    rdi,r15
     14769eb:	4c 89 f6             	mov    rsi,r14
     14769ee:	e8 f5 1f 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     14769f3:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     14769fa:	00 
     14769fb:	48 89 ef             	mov    rdi,rbp
     14769fe:	e8 17 db da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     1476a03:	4c 89 e7             	mov    rdi,r12
     1476a06:	e8 d1 26 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>
     1476a0b:	e9 e4 fe ff ff       	jmp    14768f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbe78>
     1476a10:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1476a17:	00 
     1476a18:	e8 4d 9a c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1476a1d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1476a24:	00 
     1476a25:	e8 40 9a c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1476a2a:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1476a2f:	48 89 df             	mov    rdi,rbx
     1476a32:	4c 89 fe             	mov    rsi,r15
     1476a35:	e8 c6 91 da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1476a3a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1476a41:	00 00 
     1476a43:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
     1476a4a:	00 
     1476a4b:	74 20                	je     1476a6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bbff1>
     1476a4d:	eb 33                	jmp    1476a82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc006>
     1476a4f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1476a56:	00 00 
     1476a58:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
     1476a5f:	00 
     1476a60:	75 20                	jne    1476a82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc006>
     1476a62:	48 89 df             	mov    rdi,rbx
     1476a65:	4c 89 fe             	mov    rsi,r15
     1476a68:	e8 93 91 da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1476a6d:	48 89 d8             	mov    rax,rbx
     1476a70:	48 81 c4 e8 01 00 00 	add    rsp,0x1e8
     1476a77:	5b                   	pop    rbx
     1476a78:	41 5c                	pop    r12
     1476a7a:	41 5d                	pop    r13
     1476a7c:	41 5e                	pop    r14
     1476a7e:	41 5f                	pop    r15
     1476a80:	5d                   	pop    rbp

### 0x1476bbe; caller=(21457570, 21458129)
Strings: 
     1476b2a:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
     1476b2f:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     1476b34:	4c 89 e7             	mov    rdi,r12
     1476b37:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
     1476b3e:	00 
     1476b3f:	e8 d7 98 c3 ff       	call   10b041b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277831>
     1476b44:	84 c0                	test   al,al
     1476b46:	0f 84 04 01 00 00    	je     1476c50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc1d4>
     1476b4c:	4c 89 e7             	mov    rdi,r12
     1476b4f:	e8 4a 25 0e 00       	call   155909e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e622>
     1476b54:	48 89 c7             	mov    rdi,rax
     1476b57:	e8 db a9 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     1476b5c:	49 89 c6             	mov    r14,rax
     1476b5f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1476b64:	48 89 c6             	mov    rsi,rax
     1476b67:	e8 56 5d 64 ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>
     1476b6c:	48 85 c0             	test   rax,rax
     1476b6f:	0f 84 ce 00 00 00    	je     1476c43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc1c7>
     1476b75:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     1476b7b:	0f 57 c0             	xorps  xmm0,xmm0
     1476b7e:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1476b83:	4c 8b 78 28          	mov    r15,QWORD PTR [rax+0x28]
     1476b87:	4c 8b 60 30          	mov    r12,QWORD PTR [rax+0x30]
     1476b8b:	4d 39 e7             	cmp    r15,r12
     1476b8e:	0f 84 84 00 00 00    	je     1476c18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc19c>
     1476b94:	0f 57 c0             	xorps  xmm0,xmm0
     1476b97:	0f 11 44 24 4c       	movups XMMWORD PTR [rsp+0x4c],xmm0
     1476b9c:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1476ba1:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1476ba4:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1476ba9:	44 88 6c 24 68       	mov    BYTE PTR [rsp+0x68],r13b
     1476bae:	44 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],r13b
     1476bb3:	c6 44 24 78 09       	mov    BYTE PTR [rsp+0x78],0x9
     1476bb8:	48 89 ef             	mov    rdi,rbp
     1476bbb:	48 89 de             	mov    rsi,rbx
     1476bbe:	e8 d7 54 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1476bc3:	48 89 df             	mov    rdi,rbx
     1476bc6:	e8 c5 72 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1476bcb:	0f 57 c0             	xorps  xmm0,xmm0
     1476bce:	0f 11 44 24 4c       	movups XMMWORD PTR [rsp+0x4c],xmm0
     1476bd3:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1476bd8:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     1476bdc:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1476be1:	44 88 6c 24 68       	mov    BYTE PTR [rsp+0x68],r13b
     1476be6:	44 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],r13b
     1476beb:	c6 44 24 78 09       	mov    BYTE PTR [rsp+0x78],0x9
     1476bf0:	48 89 ef             	mov    rdi,rbp
     1476bf3:	48 89 de             	mov    rsi,rbx
     1476bf6:	e8 9f 54 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1476bfb:	48 89 df             	mov    rdi,rbx
     1476bfe:	e8 8d 72 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1476c03:	49 83 c7 10          	add    r15,0x10
     1476c07:	4d 39 e7             	cmp    r15,r12
     1476c0a:	75 88                	jne    1476b94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc118>
     1476c0c:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     1476c11:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     1476c16:	eb 04                	jmp    1476c1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc1a0>
     1476c18:	31 c9                	xor    ecx,ecx
     1476c1a:	31 d2                	xor    edx,edx
     1476c1c:	48 29 d1             	sub    rcx,rdx
     1476c1f:	48 c1 f9 06          	sar    rcx,0x6
     1476c23:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1476c28:	4c 89 ff             	mov    rdi,r15
     1476c2b:	4c 89 f6             	mov    rsi,r14
     1476c2e:	e8 b5 1d 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     1476c33:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     1476c3a:	00 
     1476c3b:	48 89 ef             	mov    rdi,rbp
     1476c3e:	e8 d7 d8 da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     1476c43:	4c 89 e7             	mov    rdi,r12
     1476c46:	e8 91 24 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>
     1476c4b:	e9 e4 fe ff ff       	jmp    1476b34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc0b8>
     1476c50:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1476c57:	00 
     1476c58:	e8 0d 98 c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1476c5d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1476c64:	00 
     1476c65:	e8 00 98 c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1476c6a:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1476c6f:	48 89 df             	mov    rdi,rbx
     1476c72:	4c 89 fe             	mov    rsi,r15
     1476c75:	e8 86 8f da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1476c7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1476c81:	00 00 
     1476c83:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
     1476c8a:	00 
     1476c8b:	74 20                	je     1476cad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc231>
     1476c8d:	eb 33                	jmp    1476cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc246>
     1476c8f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1476c96:	00 00 
     1476c98:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]

### 0x1476bf6; caller=(21457570, 21458129)
Strings: 
     1476b5f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     1476b64:	48 89 c6             	mov    rsi,rax
     1476b67:	e8 56 5d 64 ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>
     1476b6c:	48 85 c0             	test   rax,rax
     1476b6f:	0f 84 ce 00 00 00    	je     1476c43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc1c7>
     1476b75:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
     1476b7b:	0f 57 c0             	xorps  xmm0,xmm0
     1476b7e:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
     1476b83:	4c 8b 78 28          	mov    r15,QWORD PTR [rax+0x28]
     1476b87:	4c 8b 60 30          	mov    r12,QWORD PTR [rax+0x30]
     1476b8b:	4d 39 e7             	cmp    r15,r12
     1476b8e:	0f 84 84 00 00 00    	je     1476c18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc19c>
     1476b94:	0f 57 c0             	xorps  xmm0,xmm0
     1476b97:	0f 11 44 24 4c       	movups XMMWORD PTR [rsp+0x4c],xmm0
     1476b9c:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1476ba1:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1476ba4:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1476ba9:	44 88 6c 24 68       	mov    BYTE PTR [rsp+0x68],r13b
     1476bae:	44 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],r13b
     1476bb3:	c6 44 24 78 09       	mov    BYTE PTR [rsp+0x78],0x9
     1476bb8:	48 89 ef             	mov    rdi,rbp
     1476bbb:	48 89 de             	mov    rsi,rbx
     1476bbe:	e8 d7 54 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1476bc3:	48 89 df             	mov    rdi,rbx
     1476bc6:	e8 c5 72 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1476bcb:	0f 57 c0             	xorps  xmm0,xmm0
     1476bce:	0f 11 44 24 4c       	movups XMMWORD PTR [rsp+0x4c],xmm0
     1476bd3:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1476bd8:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
     1476bdc:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1476be1:	44 88 6c 24 68       	mov    BYTE PTR [rsp+0x68],r13b
     1476be6:	44 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],r13b
     1476beb:	c6 44 24 78 09       	mov    BYTE PTR [rsp+0x78],0x9
     1476bf0:	48 89 ef             	mov    rdi,rbp
     1476bf3:	48 89 de             	mov    rsi,rbx
     1476bf6:	e8 9f 54 f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1476bfb:	48 89 df             	mov    rdi,rbx
     1476bfe:	e8 8d 72 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1476c03:	49 83 c7 10          	add    r15,0x10
     1476c07:	4d 39 e7             	cmp    r15,r12
     1476c0a:	75 88                	jne    1476b94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc118>
     1476c0c:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
     1476c11:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
     1476c16:	eb 04                	jmp    1476c1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc1a0>
     1476c18:	31 c9                	xor    ecx,ecx
     1476c1a:	31 d2                	xor    edx,edx
     1476c1c:	48 29 d1             	sub    rcx,rdx
     1476c1f:	48 c1 f9 06          	sar    rcx,0x6
     1476c23:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1476c28:	4c 89 ff             	mov    rdi,r15
     1476c2b:	4c 89 f6             	mov    rsi,r14
     1476c2e:	e8 b5 1d 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     1476c33:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     1476c3a:	00 
     1476c3b:	48 89 ef             	mov    rdi,rbp
     1476c3e:	e8 d7 d8 da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     1476c43:	4c 89 e7             	mov    rdi,r12
     1476c46:	e8 91 24 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>
     1476c4b:	e9 e4 fe ff ff       	jmp    1476b34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc0b8>
     1476c50:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1476c57:	00 
     1476c58:	e8 0d 98 c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1476c5d:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1476c64:	00 
     1476c65:	e8 00 98 c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1476c6a:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
     1476c6f:	48 89 df             	mov    rdi,rbx
     1476c72:	4c 89 fe             	mov    rsi,r15
     1476c75:	e8 86 8f da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1476c7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1476c81:	00 00 
     1476c83:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
     1476c8a:	00 
     1476c8b:	74 20                	je     1476cad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc231>
     1476c8d:	eb 33                	jmp    1476cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc246>
     1476c8f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1476c96:	00 00 
     1476c98:	48 3b 84 24 e0 01 00 	cmp    rax,QWORD PTR [rsp+0x1e0]
     1476c9f:	00 
     1476ca0:	75 20                	jne    1476cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bc246>
     1476ca2:	48 89 df             	mov    rdi,rbx
     1476ca5:	4c 89 fe             	mov    rsi,r15
     1476ca8:	e8 53 8f da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1476cad:	48 89 d8             	mov    rax,rbx
     1476cb0:	48 81 c4 e8 01 00 00 	add    rsp,0x1e8
     1476cb7:	5b                   	pop    rbx
     1476cb8:	41 5c                	pop    r12
     1476cba:	41 5d                	pop    r13
     1476cbc:	41 5e                	pop    r14
     1476cbe:	41 5f                	pop    r15
     1476cc0:	5d                   	pop    rbp

### 0x1478683; caller=(21464158, 21464983)
Strings: 
     1478609:	0f 57 c0             	xorps  xmm0,xmm0
     147860c:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1478611:	48 8b 6b 28          	mov    rbp,QWORD PTR [rbx+0x28]
     1478615:	48 8b 5b 30          	mov    rbx,QWORD PTR [rbx+0x30]
     1478619:	48 39 dd             	cmp    rbp,rbx
     147861c:	0f 84 b2 00 00 00    	je     14786d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdc58>
     1478622:	41 89 d5             	mov    r13d,edx
     1478625:	83 7d 18 00          	cmp    DWORD PTR [rbp+0x18],0x0
     1478629:	75 06                	jne    1478631 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdbb5>
     147862b:	80 7d 30 00          	cmp    BYTE PTR [rbp+0x30],0x0
     147862f:	74 18                	je     1478649 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdbcd>
     1478631:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1478636:	48 89 ee             	mov    rsi,rbp
     1478639:	e8 d4 42 f1 ff       	call   138c912 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1e96>
     147863e:	48 83 c5 40          	add    rbp,0x40
     1478642:	48 39 dd             	cmp    rbp,rbx
     1478645:	75 de                	jne    1478625 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdba9>
     1478647:	eb 49                	jmp    1478692 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdc16>
     1478649:	45 84 ed             	test   r13b,r13b
     147864c:	0f 94 c0             	sete   al
     147864f:	48 8b 55 20          	mov    rdx,QWORD PTR [rbp+0x20]
     1478653:	48 3b 54 24 08       	cmp    rdx,QWORD PTR [rsp+0x8]
     1478658:	0f 9c c1             	setl   cl
     147865b:	4c 39 f2             	cmp    rdx,r14
     147865e:	7c de                	jl     147863e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdbc2>
     1478660:	08 c8                	or     al,cl
     1478662:	74 da                	je     147863e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdbc2>
     1478664:	4c 89 ff             	mov    rdi,r15
     1478667:	48 89 ee             	mov    rsi,rbp
     147866a:	e8 8b 6e c3 ff       	call   10af4fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x276910>
     147866f:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
     1478673:	4c 29 f0             	sub    rax,r14
     1478676:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
     147867b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1478680:	4c 89 fe             	mov    rsi,r15
     1478683:	e8 12 3a f2 ff       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     1478688:	4c 89 ff             	mov    rdi,r15
     147868b:	e8 00 58 37 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1478690:	eb ac                	jmp    147863e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdbc2>
     1478692:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     1478697:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     147869c:	74 36                	je     14786d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdc58>
     147869e:	4c 89 e7             	mov    rdi,r12
     14786a1:	e8 91 8e 0d 00       	call   1551537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x396abb>
     14786a6:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
     14786ab:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
     14786b0:	48 29 d1             	sub    rcx,rdx
     14786b3:	48 c1 f9 06          	sar    rcx,0x6
     14786b7:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14786bc:	48 89 c6             	mov    rsi,rax
     14786bf:	e8 24 03 0e 00       	call   15589e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39df6c>
     14786c4:	eb 0e                	jmp    14786d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdc58>
     14786c6:	0f 57 c0             	xorps  xmm0,xmm0
     14786c9:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     14786ce:	48 83 64 24 40 00    	and    QWORD PTR [rsp+0x40],0x0
     14786d4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     14786d9:	e8 3c be da ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
     14786de:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]
     14786e5:	00 
     14786e6:	48 89 df             	mov    rdi,rbx
     14786e9:	e8 ee 09 0e 00       	call   15590dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39e660>
     14786ee:	e9 ef fd ff ff       	jmp    14784e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bda66>
     14786f3:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     14786fa:	00 
     14786fb:	e8 6a 7d c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     1478700:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     1478707:	00 
     1478708:	e8 5d 7d c3 ff       	call   10b046a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x277880>
     147870d:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     1478712:	48 89 df             	mov    rdi,rbx
     1478715:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     147871a:	e8 e1 74 da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     147871f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1478726:	00 00 
     1478728:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
     147872f:	00 
     1478730:	74 20                	je     1478752 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdcd6>
     1478732:	eb 33                	jmp    1478767 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdceb>
     1478734:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     147873b:	00 00 
     147873d:	48 3b 84 24 f0 01 00 	cmp    rax,QWORD PTR [rsp+0x1f0]
     1478744:	00 
     1478745:	75 20                	jne    1478767 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdceb>
     1478747:	48 89 df             	mov    rdi,rbx
     147874a:	4c 89 f6             	mov    rsi,r14
     147874d:	e8 ae 74 da ff       	call   121fc00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65184>
     1478752:	48 89 d8             	mov    rax,rbx
     1478755:	48 81 c4 f8 01 00 00 	add    rsp,0x1f8
     147875c:	5b                   	pop    rbx
     147875d:	41 5c                	pop    r12
     147875f:	41 5d                	pop    r13

## Consumer 0x10a9668; FDE=(17471080, 17471132)
     10a964d:	00 00 
     10a964f:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     10a9654:	75 0d                	jne    10a9663 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a79>
     10a9656:	48 89 d8             	mov    rax,rbx
     10a9659:	48 83 c4 50          	add    rsp,0x50
     10a965d:	5b                   	pop    rbx
     10a965e:	41 5e                	pop    r14
     10a9660:	41 5f                	pop    r15
     10a9662:	c3                   	ret
     10a9663:	e8 48 64 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
     10a96b9:	cc                   	int3
     10a96ba:	41 56                	push   r14
     10a96bc:	53                   	push   rbx
     10a96bd:	48 83 ec 28          	sub    rsp,0x28
     10a96c1:	48 89 fb             	mov    rbx,rdi
     10a96c4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a96cb:	00 00 
     10a96cd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a96d2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10a96d7:	4c 89 f7             	mov    rdi,r14
     10a96da:	e8 a5 00 aa ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     10a96df:	49 8b 06             	mov    rax,QWORD PTR [r14]
     10a96e2:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a96e5:	48 8d 43 08          	lea    rax,[rbx+0x8]
     10a96e9:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     10a96ed:	48 89 7b 08          	mov    QWORD PTR [rbx+0x8],rdi
     10a96f1:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
     10a96f5:	48 89 4b 10          	mov    QWORD PTR [rbx+0x10],rcx
     10a96f9:	48 85 c9             	test   rcx,rcx
     10a96fc:	74 17                	je     10a9715 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270b2b>
     10a96fe:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     10a9703:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     10a9707:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
     10a970b:	0f 57 c0             	xorps  xmm0,xmm0
     10a970e:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
     10a9711:	31 ff                	xor    edi,edi
     10a9713:	eb 03                	jmp    10a9718 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270b2e>
     10a9715:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a9718:	e8 c9 a6 a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a971d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a9724:	00 00 
     10a9726:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     10a972b:	75 08                	jne    10a9735 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270b4b>
     10a972d:	48 83 c4 28          	add    rsp,0x28
     10a9731:	5b                   	pop    rbx
     10a9732:	41 5e                	pop    r14
     10a9734:	c3                   	ret
     10a9735:	e8 76 63 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a973a:	48 83 ec 28          	sub    rsp,0x28

## All ad_skip string xrefs
Addresses: 0x3506df
### 0x139ba3e; FDE=(20560346, 20561320)
     139b9db:	41 57                	push   r15
     139b9dd:	41 56                	push   r14
     139b9df:	41 55                	push   r13
     139b9e1:	41 54                	push   r12
     139b9e3:	53                   	push   rbx
     139b9e4:	48 81 ec c8 06 00 00 	sub    rsp,0x6c8
     139b9eb:	49 89 f7             	mov    r15,rsi
     139b9ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139b9f5:	00 00 
     139b9f7:	48 89 84 24 c0 06 00 	mov    QWORD PTR [rsp+0x6c0],rax
     139b9fe:	00 
     139b9ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139ba02:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     139ba05:	48 8d bb 28 0c 00 00 	lea    rdi,[rbx+0xc28]
     139ba0c:	0f 10 86 60 01 00 00 	movups xmm0,XMMWORD PTR [rsi+0x160]
     139ba13:	e8 1e 31 74 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     139ba18:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
     139ba1e:	0f 57 c0             	xorps  xmm0,xmm0
     139ba21:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     139ba26:	49 8b bf 60 01 00 00 	mov    rdi,QWORD PTR [r15+0x160]
     139ba2d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139ba30:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     139ba36:	49 89 c6             	mov    r14,rax
     139ba39:	48 85 c0             	test   rax,rax
     139ba3c:	7e 4e                	jle    139ba8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1010>
     139ba3e:	48 8d 35 9a 4c fb fe 	lea    rsi,[rip+0xfffffffffefb4c9a]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
     139ba45:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba4c:	00 
     139ba4d:	e8 2c e0 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139ba52:	48 8d b4 24 b0 03 00 	lea    rsi,[rsp+0x3b0]
     139ba59:	00 
     139ba5a:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139ba5e:	49 69 c6 e8 03 00 00 	imul   rax,r14,0x3e8
     139ba65:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139ba69:	31 c0                	xor    eax,eax
     139ba6b:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139ba6e:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139ba71:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139ba75:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     139ba7a:	e8 1b 06 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139ba7f:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
     139ba86:	00 
     139ba87:	e8 04 24 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139ba8c:	31 c0                	xor    eax,eax
     139ba8e:	4c 8d b4 24 c8 00 00 	lea    r14,[rsp+0xc8]
     139ba95:	00 
     139ba96:	41 88 46 f8          	mov    BYTE PTR [r14-0x8],al
     139ba9a:	0f 57 c0             	xorps  xmm0,xmm0
     139ba9d:	41 0f 29 46 d8       	movaps XMMWORD PTR [r14-0x28],xmm0
     139baa2:	41 88 46 e8          	mov    BYTE PTR [r14-0x18],al
     139baa6:	4c 89 f7             	mov    rdi,r14
     139baa9:	4c 89 fe             	mov    rsi,r15
     139baac:	e8 8f ea 9c ff       	call   d6a540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x375c6>
     139bab1:	4c 8d a4 24 c0 01 00 	lea    r12,[rsp+0x1c0]
     139bab8:	00 
     139bab9:	49 81 c7 f8 00 00 00 	add    r15,0xf8
     139bac0:	4c 89 e7             	mov    rdi,r12
     139bac3:	4c 89 fe             	mov    rsi,r15
     139bac6:	e8 59 a3 ff ff       	call   1395e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1db3a8>
     139bacb:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
     139bad2:	0f 11 84 24 28 02 00 	movups XMMWORD PTR [rsp+0x228],xmm0
     139bad9:	00 
     139bada:	48 83 a4 24 38 02 00 	and    QWORD PTR [rsp+0x238],0x0
     139bae1:	00 00 
     139bae3:	31 c0                	xor    eax,eax
     139bae5:	88 84 24 40 02 00 00 	mov    BYTE PTR [rsp+0x240],al
     139baec:	88 84 24 48 02 00 00 	mov    BYTE PTR [rsp+0x248],al
     139baf3:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     139baf7:	48 89 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rax
     139bafe:	00 
     139baff:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]

### 0x139be05; FDE=(20561320, 20562040)
     139bda8:	55                   	push   rbp
     139bda9:	41 57                	push   r15
     139bdab:	41 56                	push   r14
     139bdad:	41 54                	push   r12
     139bdaf:	53                   	push   rbx
     139bdb0:	48 81 ec 70 04 00 00 	sub    rsp,0x470
     139bdb7:	49 89 f6             	mov    r14,rsi
     139bdba:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     139bdc1:	00 00 
     139bdc3:	48 89 84 24 68 04 00 	mov    QWORD PTR [rsp+0x468],rax
     139bdca:	00 
     139bdcb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bdce:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
     139bdd2:	48 8d bb 28 0c 00 00 	lea    rdi,[rbx+0xc28]
     139bdd9:	0f 10 46 20          	movups xmm0,XMMWORD PTR [rsi+0x20]
     139bddd:	e8 54 2d 74 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
     139bde2:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
     139bde8:	0f 57 c0             	xorps  xmm0,xmm0
     139bdeb:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     139bdf0:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     139bdf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139bdf7:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     139bdfd:	49 89 c7             	mov    r15,rax
     139be00:	48 85 c0             	test   rax,rax
     139be03:	7e 4e                	jle    139be53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e13d7>
     139be05:	48 8d 35 d3 48 fb fe 	lea    rsi,[rip+0xfffffffffefb48d3]        # 3506df <_ZTSSt12bad_any_cast@@Base-0x3fae9>
     139be0c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be13:	00 
     139be14:	e8 65 dc 6d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     139be19:	48 8d b4 24 58 01 00 	lea    rsi,[rsp+0x158]
     139be20:	00 
     139be21:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     139be25:	49 69 c7 e8 03 00 00 	imul   rax,r15,0x3e8
     139be2c:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     139be30:	31 c0                	xor    eax,eax
     139be32:	88 46 28             	mov    BYTE PTR [rsi+0x28],al
     139be35:	88 46 30             	mov    BYTE PTR [rsi+0x30],al
     139be38:	c6 46 38 06          	mov    BYTE PTR [rsi+0x38],0x6
     139be3c:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     139be41:	e8 54 02 00 00       	call   139c09a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e161e>
     139be46:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     139be4d:	00 
     139be4e:	e8 3d 20 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     139be53:	40 8a ab b0 0b 00 00 	mov    bpl,BYTE PTR [rbx+0xbb0]
     139be5a:	f3 0f 10 83 d0 0b 00 	movss  xmm0,DWORD PTR [rbx+0xbd0]
     139be61:	00 
     139be62:	f3 0f 11 44 24 4c    	movss  DWORD PTR [rsp+0x4c],xmm0
     139be68:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     139be6f:	00 
     139be70:	4c 89 f6             	mov    rsi,r14
     139be73:	e8 36 9f fe ff       	call   1385dae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb332>
     139be78:	40 84 ed             	test   bpl,bpl
     139be7b:	74 08                	je     139be85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1409>
     139be7d:	f3 0f 10 4c 24 4c    	movss  xmm1,DWORD PTR [rsp+0x4c]
     139be83:	eb 08                	jmp    139be8d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e1411>
     139be85:	f3 0f 10 0d fb 27 ff 	movss  xmm1,DWORD PTR [rip+0xfffffffffeff27fb]        # 38e688 <_ZTSSt12bad_any_cast@@Base-0x1b40>
     139be8c:	fe 
     139be8d:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     139be94:	00 
     139be95:	49 83 26 00          	and    QWORD PTR [r14],0x0
     139be99:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
     139bea0:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
     139bea5:	31 c0                	xor    eax,eax
     139bea7:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
     139beab:	f3 41 0f 11 4e 1c    	movss  DWORD PTR [r14+0x1c],xmm1
     139beb1:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
     139beb5:	66 41 83 66 28 00    	and    WORD PTR [r14+0x28],0x0
     139bebb:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
     139bec2:	00 
     139bec3:	4c 8d a4 24 20 01 00 	lea    r12,[rsp+0x120]
     139beca:	00 

## Indirect vtable +0xd0 calls with local context
### 0xacdb64; FDE=(11323428, 11332417)
Strings: com/spotify/connectivity/AuthenticatedScopeConfiguration | clientVersionLong | cachePath | clientId | deviceId | webgateLocale | webgateTimeZone | Failed to load class AuthenticatedScopeConfiguration | webgateUserAgentParameterAppVersion | webgateUserAgentParameterAppPlatform | webgateUserAgentParameterOsVersion | dealerPingTime | I | webgateUserAgentParameterExtraInformation | appNativeTokenExchangeSetupLifecycle | Z | Failed finding field 'appNativeTokenExchangeSetupLifecycle' | connectivity_authenticated_scope | cold_startup | unknown | client_features | connection_id_decorator | auth_decorator | user_agent_decorator | Spotify/%s %s/%s |  ( | ) | accept_language_decorator | time_zone_decorator | auth_response_decorator | clientsettings/api/v1/ | Content-Type | application/x-protobuf | 1 | allow-large-hermes-requests
      acdb09:	48 89 9c 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rbx
      acdb10:	00 
      acdb11:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      acdb16:	eb 19                	jmp    acdb31 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1aad1>
      acdb18:	48 89 8c 24 d0 04 00 	mov    QWORD PTR [rsp+0x4d0],rcx
      acdb1f:	00 
      acdb20:	4c 89 b4 24 d8 04 00 	mov    QWORD PTR [rsp+0x4d8],r14
      acdb27:	00 
      acdb28:	48 83 a4 24 e0 04 00 	and    QWORD PTR [rsp+0x4e0],0x0
      acdb2f:	00 00 
      acdb31:	4c 8d b4 24 b0 04 00 	lea    r14,[rsp+0x4b0]
      acdb38:	00 
      acdb39:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      acdb3d:	48 89 df             	mov    rdi,rbx
      acdb40:	e8 6d 09 fd ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      acdb45:	48 89 df             	mov    rdi,rbx
      acdb48:	e8 65 09 fd ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      acdb4d:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      acdb51:	48 89 ef             	mov    rdi,rbp
      acdb54:	4c 89 f6             	mov    rsi,r14
      acdb57:	ff 50 70             	call   QWORD PTR [rax+0x70]
      acdb5a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      acdb5e:	6a 01                	push   0x1
      acdb60:	5e                   	pop    rsi
      acdb61:	48 89 ef             	mov    rdi,rbp
      acdb64:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      acdb6a:	48 8d 05 77 01 db 00 	lea    rax,[rip+0xdb0177]        # 187dce8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a3d0>
      acdb71:	48 89 84 24 80 04 00 	mov    QWORD PTR [rsp+0x480],rax
      acdb78:	00 
      acdb79:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
      acdb7e:	48 89 84 24 88 04 00 	mov    QWORD PTR [rsp+0x488],rax
      acdb85:	00 
      acdb86:	4c 89 ac 24 a0 04 00 	mov    QWORD PTR [rsp+0x4a0],r13
      acdb8d:	00 
      acdb8e:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      acdb92:	48 89 ef             	mov    rdi,rbp
      acdb95:	4c 89 ee             	mov    rsi,r13
      acdb98:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
      acdb9e:	4c 89 ef             	mov    rdi,r13
      acdba1:	e8 c4 c3 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      acdba6:	4c 89 f7             	mov    rdi,r14
      acdba9:	e8 7c 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdbae:	48 8d bc 24 00 05 00 	lea    rdi,[rsp+0x500]
      acdbb5:	00 
      acdbb6:	e8 6f 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdbbb:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      acdbc2:	00 
      acdbc3:	e8 62 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdbc8:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
      acdbcf:	00 
      acdbd0:	e8 55 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdbd5:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      acdbdc:	00 
      acdbdd:	e8 48 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdbe2:	48 8d bc 24 40 06 00 	lea    rdi,[rsp+0x640]
      acdbe9:	00 
      acdbea:	e8 3b 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdbef:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
      acdbf6:	00 
      acdbf7:	e8 2e 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdbfc:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      acdc03:	00 
      acdc04:	e8 21 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdc09:	48 8d bc 24 30 07 00 	lea    rdi,[rsp+0x730]
      acdc10:	00 
      acdc11:	e8 14 3c 00 00       	call   ad182a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e7ca>
      acdc16:	6a 10                	push   0x10
      acdc18:	5f                   	pop    rdi
      acdc19:	e8 e2 02 d2 00       	call   17edf00 <_Znwm@plt>
      acdc1e:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
      acdc25:	00 00 

### 0xad6be5; FDE=(11364756, 11367180)
Strings: https://clienttoken.spotify.com/v1/clienttoken | Content-Type | application/x-protobuf | Accept | Cache-Control | no-cache, no-store, max-age=0
      ad6b7d:	48 8d 35 bc 31 96 ff 	lea    rsi,[rip+0xffffffffff9631bc]        # 439d40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f78f>
      ad6b84:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      ad6b89:	e8 f0 2e fa ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ad6b8e:	48 8d 35 3b bf 8a ff 	lea    rsi,[rip+0xffffffffff8abf3b]        # 382ad0 <_ZTSSt12bad_any_cast@@Base-0xd6f8>
      ad6b95:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ad6b9a:	e8 df 2e fa ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      ad6b9f:	48 8d 6c 24 20       	lea    rbp,[rsp+0x20]
      ad6ba4:	4c 8d 6c 24 48       	lea    r13,[rsp+0x48]
      ad6ba9:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
      ad6bae:	48 89 ef             	mov    rdi,rbp
      ad6bb1:	4c 89 ee             	mov    rsi,r13
      ad6bb4:	48 89 da             	mov    rdx,rbx
      ad6bb7:	e8 ac 2e b1 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      ad6bbc:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      ad6bc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ad6bc3:	31 f6                	xor    esi,esi
      ad6bc5:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      ad6bcb:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      ad6bcf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ad6bd2:	4c 89 fe             	mov    rsi,r15
      ad6bd5:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      ad6bdb:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      ad6bdf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ad6be2:	6a 01                	push   0x1
      ad6be4:	5e                   	pop    rsi
      ad6be5:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      ad6beb:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      ad6bef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ad6bf2:	be 30 75 00 00       	mov    esi,0x7530
      ad6bf7:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      ad6bfd:	0f 28 45 00          	movaps xmm0,XMMWORD PTR [rbp+0x0]
      ad6c01:	41 0f 29 44 24 60    	movaps XMMWORD PTR [r12+0x60],xmm0
      ad6c07:	0f 57 c0             	xorps  xmm0,xmm0
      ad6c0a:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0
      ad6c0e:	48 89 df             	mov    rdi,rbx
      ad6c11:	e8 7a 72 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad6c16:	4c 89 ef             	mov    rdi,r13
      ad6c19:	e8 72 72 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad6c1e:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      ad6c23:	e8 68 72 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad6c28:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      ad6c2d:	e8 5e 72 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad6c32:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      ad6c39:	00 
      ad6c3a:	e8 51 72 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad6c3f:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      ad6c46:	00 
      ad6c47:	e8 44 72 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad6c4c:	48 8d bc 24 60 05 00 	lea    rdi,[rsp+0x560]
      ad6c53:	00 
      ad6c54:	e8 37 72 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad6c59:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
      ad6c60:	00 
      ad6c61:	e8 2a 72 d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ad6c66:	49 8d 7c 24 70       	lea    rdi,[r12+0x70]
      ad6c6b:	48 8d b4 24 70 03 00 	lea    rsi,[rsp+0x370]
      ad6c72:	00 
      ad6c73:	e8 4e fa ff ff       	call   ad66c6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23666>
      ad6c78:	bf 00 01 00 00       	mov    edi,0x100
      ad6c7d:	e8 7e 72 d1 00       	call   17edf00 <_Znwm@plt>
      ad6c82:	48 89 c5             	mov    rbp,rax
      ad6c85:	49 8d 5c 24 20       	lea    rbx,[r12+0x20]
      ad6c8a:	0f 57 c0             	xorps  xmm0,xmm0
      ad6c8d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      ad6c91:	48 8d 05 58 a5 d2 00 	lea    rax,[rip+0xd2a558]        # 18011f0 <_ZTIN4asio22service_already_existsE@@Base+0x29d8>
      ad6c98:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      ad6c9c:	4c 8d 6d 20          	lea    r13,[rbp+0x20]
      ad6ca0:	48 89 ef             	mov    rdi,rbp
      ad6ca3:	48 83 c7 60          	add    rdi,0x60
      ad6ca7:	0f 29 45 20          	movaps XMMWORD PTR [rbp+0x20],xmm0
      ad6cab:	0f 29 45 30          	movaps XMMWORD PTR [rbp+0x30],xmm0

### 0xaf7b9d; FDE=(11499836, 11502971)
Strings: https://accounts.spotify.com/api/token | Content-Type | application/x-www-form-urlencoded | refresh_token | grant_type | client_secret | : | client_id | Basic %s | Authorization
      af7b37:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      af7b3c:	e8 3d 1f f8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      af7b41:	48 8d 35 b8 b1 8d ff 	lea    rsi,[rip+0xffffffffff8db1b8]        # 3d2d00 <_ZTSN5boost17bad_function_callE@@Base+0x46>
      af7b48:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      af7b4d:	e8 2c 1f f8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      af7b52:	48 89 d8             	mov    rax,rbx
      af7b55:	48 83 c0 18          	add    rax,0x18
      af7b59:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      af7b5e:	49 8d 44 24 20       	lea    rax,[r12+0x20]
      af7b63:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      af7b68:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
      af7b6f:	00 
      af7b70:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
      af7b75:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
      af7b7a:	4c 89 f7             	mov    rdi,r14
      af7b7d:	4c 89 ea             	mov    rdx,r13
      af7b80:	e8 e3 1e af 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      af7b85:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af7b88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af7b8b:	4c 89 fe             	mov    rsi,r15
      af7b8e:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      af7b94:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af7b97:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af7b9a:	6a 01                	push   0x1
      af7b9c:	5e                   	pop    rsi
      af7b9d:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      af7ba3:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af7ba6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af7ba9:	be 30 75 00 00       	mov    esi,0x7530
      af7bae:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      af7bb4:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      af7bb8:	41 0f 29 44 24 60    	movaps XMMWORD PTR [r12+0x60],xmm0
      af7bbe:	0f 57 c0             	xorps  xmm0,xmm0
      af7bc1:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      af7bc5:	4c 89 ef             	mov    rdi,r13
      af7bc8:	e8 c3 62 cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af7bcd:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      af7bd2:	e8 b9 62 cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af7bd7:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      af7bde:	00 
      af7bdf:	e8 ac 62 cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af7be4:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      af7beb:	00 
      af7bec:	e8 9f 62 cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af7bf1:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      af7bf8:	00 
      af7bf9:	49 89 84 24 80 00 00 	mov    QWORD PTR [r12+0x80],rax
      af7c00:	00 
      af7c01:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
      af7c08:	00 
      af7c09:	41 0f 11 44 24 70    	movups XMMWORD PTR [r12+0x70],xmm0
      af7c0f:	0f 57 c9             	xorps  xmm1,xmm1
      af7c12:	0f 29 8c 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm1
      af7c19:	00 
      af7c1a:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
      af7c21:	00 00 
      af7c23:	48 8b 84 24 b8 00 00 	mov    rax,QWORD PTR [rsp+0xb8]
      af7c2a:	00 
      af7c2b:	49 89 84 24 98 00 00 	mov    QWORD PTR [r12+0x98],rax
      af7c32:	00 
      af7c33:	f3 0f 6f 84 24 a8 00 	movdqu xmm0,XMMWORD PTR [rsp+0xa8]
      af7c3a:	00 00 
      af7c3c:	f3 41 0f 7f 84 24 88 	movdqu XMMWORD PTR [r12+0x88],xmm0
      af7c43:	00 00 00 
      af7c46:	0f 11 8c 24 a8 00 00 	movups XMMWORD PTR [rsp+0xa8],xmm1
      af7c4d:	00 
      af7c4e:	48 83 a4 24 b8 00 00 	and    QWORD PTR [rsp+0xb8],0x0
      af7c55:	00 00 
      af7c57:	8b 45 00             	mov    eax,DWORD PTR [rbp+0x0]
      af7c5a:	41 89 84 24 a0 00 00 	mov    DWORD PTR [r12+0xa0],eax
      af7c61:	00 

### 0xaf87e1; FDE=(11502972, 11505072)
Strings: https://accounts.spotify.com/api/token | Content-Type | application/x-www-form-urlencoded | client_id | grant_type | audience | resource | requested_token_type | scope | subject_token | subject_token_type | dpop_jkt | code_challenge | code_challenge_method
      af877e:	48 8d 35 7b 69 8a ff 	lea    rsi,[rip+0xffffffffff8a697b]        # 39f100 <_ZTSN4asio22service_already_existsE@@Base+0x6cd>
      af8785:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      af878a:	e8 ef 12 f8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      af878f:	48 89 d8             	mov    rax,rbx
      af8792:	48 83 c0 18          	add    rax,0x18
      af8796:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      af879b:	49 8d 47 20          	lea    rax,[r15+0x20]
      af879f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      af87a4:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
      af87ab:	00 
      af87ac:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      af87b1:	48 8d 5c 24 78       	lea    rbx,[rsp+0x78]
      af87b6:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
      af87bb:	4c 89 f7             	mov    rdi,r14
      af87be:	48 89 de             	mov    rsi,rbx
      af87c1:	4c 89 ea             	mov    rdx,r13
      af87c4:	e8 9f 12 af 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      af87c9:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af87cc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af87cf:	4c 89 e6             	mov    rsi,r12
      af87d2:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      af87d8:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af87db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af87de:	6a 01                	push   0x1
      af87e0:	5e                   	pop    rsi
      af87e1:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      af87e7:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af87ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af87ed:	be 30 75 00 00       	mov    esi,0x7530
      af87f2:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      af87f8:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      af87fc:	41 0f 29 47 60       	movaps XMMWORD PTR [r15+0x60],xmm0
      af8801:	0f 57 c0             	xorps  xmm0,xmm0
      af8804:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      af8808:	4c 89 ef             	mov    rdi,r13
      af880b:	e8 80 56 cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af8810:	48 89 df             	mov    rdi,rbx
      af8813:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      af8818:	e8 73 56 cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af881d:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      af8824:	00 
      af8825:	e8 66 56 cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af882a:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      af8831:	00 
      af8832:	e8 59 56 cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af8837:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
      af883e:	00 
      af883f:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
      af8846:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
      af884d:	00 
      af884e:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
      af8853:	0f 57 c9             	xorps  xmm1,xmm1
      af8856:	0f 29 8c 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm1
      af885d:	00 
      af885e:	48 83 a4 24 90 01 00 	and    QWORD PTR [rsp+0x190],0x0
      af8865:	00 00 
      af8867:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
      af886e:	00 
      af886f:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
      af8876:	f3 0f 6f 84 24 98 01 	movdqu xmm0,XMMWORD PTR [rsp+0x198]
      af887d:	00 00 
      af887f:	f3 41 0f 7f 87 88 00 	movdqu XMMWORD PTR [r15+0x88],xmm0
      af8886:	00 00 
      af8888:	0f 11 8c 24 98 01 00 	movups XMMWORD PTR [rsp+0x198],xmm1
      af888f:	00 
      af8890:	48 83 a4 24 a8 01 00 	and    QWORD PTR [rsp+0x1a8],0x0
      af8897:	00 00 
      af8899:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      af88a0:	48 89 ee             	mov    rsi,rbp
      af88a3:	e8 90 6a 00 00       	call   aff338 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4c2d8>
      af88a8:	4c 89 ff             	mov    rdi,r15

### 0xaf9015; FDE=(11505072, 11507082)
Strings: https://accounts.spotify.com/api/token | Content-Type | application/x-www-form-urlencoded | client_id | grant_type | audience | resource | scope | requested_token_type | subject_token | subject_token_type
      af8fb2:	48 8d 35 77 60 8a ff 	lea    rsi,[rip+0xffffffffff8a6077]        # 39f030 <_ZTSN4asio22service_already_existsE@@Base+0x5fd>
      af8fb9:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      af8fbe:	e8 bb 0a f8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      af8fc3:	48 89 d8             	mov    rax,rbx
      af8fc6:	48 83 c0 18          	add    rax,0x18
      af8fca:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      af8fcf:	49 8d 47 20          	lea    rax,[r15+0x20]
      af8fd3:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      af8fd8:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
      af8fdf:	00 
      af8fe0:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      af8fe5:	48 8d 5c 24 78       	lea    rbx,[rsp+0x78]
      af8fea:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
      af8fef:	4c 89 f7             	mov    rdi,r14
      af8ff2:	48 89 de             	mov    rsi,rbx
      af8ff5:	4c 89 ea             	mov    rdx,r13
      af8ff8:	e8 6b 0a af 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      af8ffd:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af9000:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af9003:	4c 89 e6             	mov    rsi,r12
      af9006:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      af900c:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af900f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af9012:	6a 01                	push   0x1
      af9014:	5e                   	pop    rsi
      af9015:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      af901b:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      af901e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af9021:	be 30 75 00 00       	mov    esi,0x7530
      af9026:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      af902c:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      af9030:	41 0f 29 47 60       	movaps XMMWORD PTR [r15+0x60],xmm0
      af9035:	0f 57 c0             	xorps  xmm0,xmm0
      af9038:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      af903c:	4c 89 ef             	mov    rdi,r13
      af903f:	e8 4c 4e cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af9044:	48 89 df             	mov    rdi,rbx
      af9047:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      af904c:	e8 3f 4e cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af9051:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      af9058:	00 
      af9059:	e8 32 4e cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af905e:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
      af9065:	00 
      af9066:	e8 25 4e cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af906b:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
      af9072:	00 
      af9073:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
      af907a:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
      af9081:	00 
      af9082:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
      af9087:	0f 57 c9             	xorps  xmm1,xmm1
      af908a:	0f 29 8c 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm1
      af9091:	00 
      af9092:	48 83 a4 24 90 01 00 	and    QWORD PTR [rsp+0x190],0x0
      af9099:	00 00 
      af909b:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
      af90a2:	00 
      af90a3:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
      af90aa:	f3 0f 6f 84 24 98 01 	movdqu xmm0,XMMWORD PTR [rsp+0x198]
      af90b1:	00 00 
      af90b3:	f3 41 0f 7f 87 88 00 	movdqu XMMWORD PTR [r15+0x88],xmm0
      af90ba:	00 00 
      af90bc:	0f 11 8c 24 98 01 00 	movups XMMWORD PTR [rsp+0x198],xmm1
      af90c3:	00 
      af90c4:	48 83 a4 24 a8 01 00 	and    QWORD PTR [rsp+0x1a8],0x0
      af90cb:	00 00 
      af90cd:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
      af90d4:	48 89 ee             	mov    rsi,rbp
      af90d7:	e8 fe 2b 00 00       	call   afbcda <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48c7a>
      af90dc:	4c 89 ff             	mov    rdi,r15

### 0xaf9f8f; FDE=(11509010, 11510637)
Strings: https://accounts.spotify.com/oauth2/device/authorize | Content-Type | application/x-www-form-urlencoded | https://accounts.spotify.com/api/token
      af9f2d:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
      af9f34:	00 
      af9f35:	e8 44 fb f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      af9f3a:	48 8d 35 bf 8d 8d ff 	lea    rsi,[rip+0xffffffffff8d8dbf]        # 3d2d00 <_ZTSN5boost17bad_function_callE@@Base+0x46>
      af9f41:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      af9f48:	00 
      af9f49:	e8 30 fb f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      af9f4e:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
      af9f55:	00 
      af9f56:	48 8d 9c 24 08 01 00 	lea    rbx,[rsp+0x108]
      af9f5d:	00 
      af9f5e:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
      af9f65:	00 
      af9f66:	4c 89 e7             	mov    rdi,r12
      af9f69:	48 89 de             	mov    rsi,rbx
      af9f6c:	4c 89 fa             	mov    rdx,r15
      af9f6f:	e8 f4 fa ae 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      af9f74:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      af9f78:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af9f7b:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      af9f7f:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      af9f85:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      af9f89:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af9f8c:	6a 01                	push   0x1
      af9f8e:	5e                   	pop    rsi
      af9f8f:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      af9f95:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      af9f99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      af9f9c:	be 30 75 00 00       	mov    esi,0x7530
      af9fa1:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      af9fa7:	41 0f 28 04 24       	movaps xmm0,XMMWORD PTR [r12]
      af9fac:	0f 29 45 60          	movaps XMMWORD PTR [rbp+0x60],xmm0
      af9fb0:	0f 57 c0             	xorps  xmm0,xmm0
      af9fb3:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      af9fb8:	4c 89 ff             	mov    rdi,r15
      af9fbb:	e8 d0 3e cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af9fc0:	48 89 df             	mov    rdi,rbx
      af9fc3:	e8 c8 3e cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af9fc8:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
      af9fcf:	00 
      af9fd0:	e8 bb 3e cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af9fd5:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]
      af9fdc:	00 
      af9fdd:	e8 ae 3e cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      af9fe2:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      af9fe7:	e8 9a 44 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      af9fec:	48 8d 35 2d 0a 94 ff 	lea    rsi,[rip+0xffffffffff940a2d]        # 43aa20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x62c>
      af9ff3:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      af9ffa:	00 
      af9ffb:	e8 40 3f cf 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      afa000:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      afa005:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
      afa00c:	00 
      afa00d:	e8 18 f9 ae 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
      afa012:	48 8d 35 47 50 8a ff 	lea    rsi,[rip+0xffffffffff8a5047]        # 39f060 <_ZTSN4asio22service_already_existsE@@Base+0x62d>
      afa019:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
      afa020:	00 
      afa021:	e8 58 fa f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      afa026:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      afa02b:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
      afa032:	00 
      afa033:	e8 5c f9 ae 00       	call   15e9994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef18>
      afa038:	48 8d 35 ef 08 94 ff 	lea    rsi,[rip+0xffffffffff9408ef]        # 43a92e <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x53a>
      afa03f:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      afa046:	00 
      afa047:	e8 32 fa f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      afa04c:	48 8d 35 ad 8c 8d ff 	lea    rsi,[rip+0xffffffffff8d8cad]        # 3d2d00 <_ZTSN5boost17bad_function_callE@@Base+0x46>
      afa053:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      afa05a:	00 
      afa05b:	e8 1e fa f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      afa060:	4c 89 f0             	mov    rax,r14

### 0xafa0b9; FDE=(11509010, 11510637)
Strings: https://accounts.spotify.com/oauth2/device/authorize | Content-Type | application/x-www-form-urlencoded | https://accounts.spotify.com/api/token
      afa05b:	e8 1e fa f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      afa060:	4c 89 f0             	mov    rax,r14
      afa063:	48 83 c0 18          	add    rax,0x18
      afa067:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      afa06c:	48 8d 45 20          	lea    rax,[rbp+0x20]
      afa070:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      afa075:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
      afa07a:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
      afa081:	00 
      afa082:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]
      afa089:	00 
      afa08a:	4c 89 ff             	mov    rdi,r15
      afa08d:	48 89 de             	mov    rsi,rbx
      afa090:	4c 89 e2             	mov    rdx,r12
      afa093:	e8 d0 f9 ae 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      afa098:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      afa09b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      afa09e:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
      afa0a3:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]
      afa0a7:	4c 89 f6             	mov    rsi,r14
      afa0aa:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      afa0b0:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      afa0b3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      afa0b6:	6a 01                	push   0x1
      afa0b8:	5e                   	pop    rsi
      afa0b9:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      afa0bf:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      afa0c2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      afa0c5:	be 30 75 00 00       	mov    esi,0x7530
      afa0ca:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      afa0d0:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
      afa0d4:	0f 29 45 70          	movaps XMMWORD PTR [rbp+0x70],xmm0
      afa0d8:	0f 57 c0             	xorps  xmm0,xmm0
      afa0db:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      afa0df:	4c 89 e7             	mov    rdi,r12
      afa0e2:	e8 a9 3d cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      afa0e7:	48 89 df             	mov    rdi,rbx
      afa0ea:	e8 a1 3d cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      afa0ef:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
      afa0f6:	00 
      afa0f7:	e8 94 3d cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      afa0fc:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      afa103:	00 
      afa104:	e8 87 3d cf 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      afa109:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      afa10e:	48 89 85 90 00 00 00 	mov    QWORD PTR [rbp+0x90],rax
      afa115:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
      afa11a:	0f 11 85 80 00 00 00 	movups XMMWORD PTR [rbp+0x80],xmm0
      afa121:	0f 57 c9             	xorps  xmm1,xmm1
      afa124:	0f 29 4c 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm1
      afa129:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
      afa12f:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      afa134:	48 89 85 a8 00 00 00 	mov    QWORD PTR [rbp+0xa8],rax
      afa13b:	0f 10 44 24 58       	movups xmm0,XMMWORD PTR [rsp+0x58]
      afa140:	0f 11 85 98 00 00 00 	movups XMMWORD PTR [rbp+0x98],xmm0
      afa147:	0f 11 4c 24 58       	movups XMMWORD PTR [rsp+0x58],xmm1
      afa14c:	48 83 64 24 68 00    	and    QWORD PTR [rsp+0x68],0x0
      afa152:	41 8b 45 00          	mov    eax,DWORD PTR [r13+0x0]
      afa156:	89 85 b0 00 00 00    	mov    DWORD PTR [rbp+0xb0],eax
      afa15c:	41 0f 10 45 08       	movups xmm0,XMMWORD PTR [r13+0x8]
      afa161:	0f 11 85 b8 00 00 00 	movups XMMWORD PTR [rbp+0xb8],xmm0
      afa168:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
      afa16c:	48 89 85 c8 00 00 00 	mov    QWORD PTR [rbp+0xc8],rax
      afa173:	49 83 65 18 00       	and    QWORD PTR [r13+0x18],0x0
      afa178:	41 0f 11 4d 08       	movups XMMWORD PTR [r13+0x8],xmm1
      afa17d:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
      afa181:	48 89 85 e0 00 00 00 	mov    QWORD PTR [rbp+0xe0],rax
      afa188:	41 0f 10 45 20       	movups xmm0,XMMWORD PTR [r13+0x20]
      afa18d:	0f 11 85 d0 00 00 00 	movups XMMWORD PTR [rbp+0xd0],xmm0
      afa194:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
      afa199:	41 0f 11 4d 20       	movups XMMWORD PTR [r13+0x20],xmm1

### 0xb04d62; FDE=(11553514, 11555122)
Strings: https://login5.spotify.com/v3/login | Content-Type | application/x-protobuf | Cache-Control | no-cache, no-store, max-age=0 | v3
      b04cf6:	48 8d 54 24 78       	lea    rdx,[rsp+0x78]
      b04cfb:	e8 68 4d ae 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      b04d00:	48 8d 35 39 50 93 ff 	lea    rsi,[rip+0xffffffffff935039]        # 439d40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f78f>
      b04d07:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      b04d0c:	e8 6d 4d f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b04d11:	48 8d 35 b8 dd 87 ff 	lea    rsi,[rip+0xffffffffff87ddb8]        # 382ad0 <_ZTSSt12bad_any_cast@@Base-0xd6f8>
      b04d18:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      b04d1d:	e8 5c 4d f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b04d22:	49 8d 47 08          	lea    rax,[r15+0x8]
      b04d26:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b04d2b:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
      b04d30:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
      b04d35:	48 8d 5c 24 48       	lea    rbx,[rsp+0x48]
      b04d3a:	4c 89 ef             	mov    rdi,r13
      b04d3d:	4c 89 f6             	mov    rsi,r14
      b04d40:	48 89 da             	mov    rdx,rbx
      b04d43:	e8 20 4d ae 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      b04d48:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b04d4c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b04d4f:	4c 89 e6             	mov    rsi,r12
      b04d52:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      b04d58:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b04d5c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b04d5f:	6a 01                	push   0x1
      b04d61:	5e                   	pop    rsi
      b04d62:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      b04d68:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b04d6c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b04d6f:	be 30 75 00 00       	mov    esi,0x7530
      b04d74:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      b04d7a:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b04d7e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b04d81:	be 30 75 00 00       	mov    esi,0x7530
      b04d86:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      b04d8c:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
      b04d91:	0f 29 45 70          	movaps XMMWORD PTR [rbp+0x70],xmm0
      b04d95:	0f 57 c0             	xorps  xmm0,xmm0
      b04d98:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
      b04d9d:	48 89 df             	mov    rdi,rbx
      b04da0:	e8 eb 90 ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b04da5:	4c 89 f7             	mov    rdi,r14
      b04da8:	e8 e3 90 ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b04dad:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      b04db2:	e8 d9 90 ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b04db7:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      b04dbe:	00 
      b04dbf:	e8 cc 90 ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b04dc4:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      b04dcb:	00 
      b04dcc:	e8 bf 90 ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b04dd1:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      b04dd8:	00 
      b04dd9:	e8 b2 90 ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b04dde:	48 8d bd 80 00 00 00 	lea    rdi,[rbp+0x80]
      b04de5:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      b04dea:	e8 51 91 ce 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b04def:	49 8d 77 20          	lea    rsi,[r15+0x20]
      b04df3:	48 8d bd 98 00 00 00 	lea    rdi,[rbp+0x98]
      b04dfa:	e8 41 91 ce 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b04dff:	49 81 c7 90 00 00 00 	add    r15,0x90
      b04e06:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      b04e0b:	4d 89 ee             	mov    r14,r13
      b04e0e:	49 83 c6 18          	add    r14,0x18
      b04e12:	48 8d 5d 20          	lea    rbx,[rbp+0x20]
      b04e16:	48 8d bd b0 00 00 00 	lea    rdi,[rbp+0xb0]
      b04e1d:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
      b04e22:	e8 2b 5b ff ff       	call   afa952 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x478f2>
      b04e27:	48 8d bd c0 00 00 00 	lea    rdi,[rbp+0xc0]
      b04e2e:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
      b04e33:	4c 89 e2             	mov    rdx,r12
      b04e36:	e8 73 9c 00 00       	call   b0eaae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5ba4e>

### 0xb053c2; FDE=(11555122, 11557580)
Strings: https://login5.spotify.com/v4/login | Content-Type | application/x-protobuf | Cache-Control | no-cache, no-store, max-age=0 | v4
      b05361:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
      b05368:	00 
      b05369:	e8 10 47 f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b0536e:	48 8d 35 5b d7 87 ff 	lea    rsi,[rip+0xffffffffff87d75b]        # 382ad0 <_ZTSSt12bad_any_cast@@Base-0xd6f8>
      b05375:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      b0537c:	00 
      b0537d:	e8 fc 46 f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      b05382:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      b05387:	4c 8d b4 24 b8 00 00 	lea    r14,[rsp+0xb8]
      b0538e:	00 
      b0538f:	48 8d 9c 24 a0 00 00 	lea    rbx,[rsp+0xa0]
      b05396:	00 
      b05397:	4c 89 ff             	mov    rdi,r15
      b0539a:	4c 89 f6             	mov    rsi,r14
      b0539d:	48 89 da             	mov    rdx,rbx
      b053a0:	e8 c3 46 ae 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      b053a5:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      b053a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b053ab:	48 8b b4 24 90 02 00 	mov    rsi,QWORD PTR [rsp+0x290]
      b053b2:	00 
      b053b3:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      b053b9:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      b053bc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b053bf:	6a 01                	push   0x1
      b053c1:	5e                   	pop    rsi
      b053c2:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      b053c8:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      b053cb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b053ce:	be 30 75 00 00       	mov    esi,0x7530
      b053d3:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      b053d9:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      b053dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b053df:	be 30 75 00 00       	mov    esi,0x7530
      b053e4:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      b053ea:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
      b053ee:	41 0f 11 44 24 70    	movups XMMWORD PTR [r12+0x70],xmm0
      b053f4:	0f 57 c0             	xorps  xmm0,xmm0
      b053f7:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      b053fb:	48 89 df             	mov    rdi,rbx
      b053fe:	e8 8d 8a ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b05403:	4c 89 f7             	mov    rdi,r14
      b05406:	e8 85 8a ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b0540b:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      b05412:	00 
      b05413:	e8 78 8a ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b05418:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
      b0541f:	00 
      b05420:	e8 6b 8a ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b05425:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      b0542c:	00 
      b0542d:	e8 5e 8a ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b05432:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
      b05439:	00 
      b0543a:	e8 51 8a ce 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      b0543f:	0f 57 c9             	xorps  xmm1,xmm1
      b05442:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
      b05449:	00 
      b0544a:	49 89 84 24 90 00 00 	mov    QWORD PTR [r12+0x90],rax
      b05451:	00 
      b05452:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
      b05457:	41 0f 11 84 24 80 00 	movups XMMWORD PTR [r12+0x80],xmm0
      b0545e:	00 00 
      b05460:	0f 29 4c 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm1
      b05465:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
      b0546c:	00 00 
      b0546e:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      b05473:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax
      b0547a:	00 
      b0547b:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
      b05480:	41 0f 11 84 24 98 00 	movups XMMWORD PTR [r12+0x98],xmm0
      b05487:	00 00 

### 0xb795da; FDE=(12030992, 12032096)
      b79571:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
      b79575:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b79578:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b7957b:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      b7957f:	e8 02 4f f2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b79584:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
      b79588:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      b7958d:	e8 14 03 a7 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      b79592:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      b79597:	4c 89 fe             	mov    rsi,r15
      b7959a:	e8 a1 49 c7 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b7959f:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      b795a4:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      b795a9:	e8 e6 03 a7 00       	call   15e9994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef18>
      b795ae:	48 8d 35 3b 14 8c ff 	lea    rsi,[rip+0xffffffffff8c143b]        # 43a9f0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5fc>
      b795b5:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      b795ba:	e8 81 49 c7 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b795bf:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
      b795c4:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      b795c9:	4c 89 ff             	mov    rdi,r15
      b795cc:	e8 59 03 a7 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
      b795d1:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      b795d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b795d7:	6a 01                	push   0x1
      b795d9:	5e                   	pop    rsi
      b795da:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      b795e0:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
      b795e4:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      b795e7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b795ea:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      b795f0:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
      b795f5:	4d 89 77 f8          	mov    QWORD PTR [r15-0x8],r14
      b795f9:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
      b79600:	00 
      b79601:	4c 89 ff             	mov    rdi,r15
      b79604:	e8 a3 fb ff ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
      b79609:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      b79610:	00 
      b79611:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      b79616:	e8 53 02 00 00       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
      b7961b:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
      b79622:	00 00 
      b79624:	6a 20                	push   0x20
      b79626:	5f                   	pop    rdi
      b79627:	e8 d4 48 c7 00       	call   17edf00 <_Znwm@plt>
      b7962c:	49 89 c4             	mov    r12,rax
      b7962f:	48 8d 05 12 43 c9 00 	lea    rax,[rip+0xc94312]        # 180d948 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3608>
      b79636:	49 89 04 24          	mov    QWORD PTR [r12],rax
      b7963a:	4c 89 e7             	mov    rdi,r12
      b7963d:	48 83 c7 08          	add    rdi,0x8
      b79641:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
      b79648:	00 
      b79649:	e8 20 02 00 00       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
      b7964e:	4c 8d ac 24 b0 00 00 	lea    r13,[rsp+0xb0]
      b79655:	00 
      b79656:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
      b7965a:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
      b79661:	00 
      b79662:	e8 bf 74 f2 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
      b79667:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      b7966c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b7966f:	4c 89 ee             	mov    rsi,r13
      b79672:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      b79678:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      b7967d:	4d 89 74 24 f8       	mov    QWORD PTR [r12-0x8],r14
      b79682:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
      b79689:	00 
      b7968a:	4c 89 e7             	mov    rdi,r12
      b7968d:	e8 1a fb ff ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
      b79692:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      b79699:	00 

### 0xb93e83; FDE=(12139494, 12141324)
      b93e1c:	00 
      b93e1d:	e8 dc 5b a5 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
      b93e22:	48 8d 35 f7 6b 8a ff 	lea    rsi,[rip+0xffffffffff8a6bf7]        # 43aa20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x62c>
      b93e29:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      b93e2e:	e8 0d a1 c5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b93e33:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      b93e3a:	00 
      b93e3b:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      b93e40:	e8 e5 5a a5 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
      b93e45:	48 8d 73 50          	lea    rsi,[rbx+0x50]
      b93e49:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      b93e4e:	e8 ed a0 c5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b93e53:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      b93e5a:	00 
      b93e5b:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
      b93e60:	4c 89 e7             	mov    rdi,r12
      b93e63:	e8 f2 5c a5 00       	call   15e9b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f0de>
      b93e68:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
      b93e6c:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b93e70:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b93e73:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      b93e79:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b93e7d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b93e80:	6a 01                	push   0x1
      b93e82:	5e                   	pop    rsi
      b93e83:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      b93e89:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
      b93e8e:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
      b93e95:	00 
      b93e96:	4c 89 ef             	mov    rdi,r13
      b93e99:	e8 aa 04 00 00       	call   b94348 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12e8>
      b93e9e:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
      b93ea3:	4c 89 e7             	mov    rdi,r12
      b93ea6:	e8 ad 5d a5 00       	call   15e9c58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f1dc>
      b93eab:	4d 85 ff             	test   r15,r15
      b93eae:	74 05                	je     b93eb5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0e55>
      b93eb0:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      b93eb5:	48 8d 05 8c d6 c7 00 	lea    rax,[rip+0xc7d68c]        # 1811548 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7208>
      b93ebc:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
      b93ec3:	00 
      b93ec4:	49 89 04 24          	mov    QWORD PTR [r12],rax
      b93ec8:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
      b93ecd:	49 89 6c 24 10       	mov    QWORD PTR [r12+0x10],rbp
      b93ed2:	4d 89 7c 24 18       	mov    QWORD PTR [r12+0x18],r15
      b93ed7:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      b93edc:	31 ff                	xor    edi,edi
      b93ede:	e8 cf a5 f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      b93ee3:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      b93eea:	00 
      b93eeb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b93eee:	4c 89 e6             	mov    rsi,r12
      b93ef1:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      b93ef7:	4d 85 ff             	test   r15,r15
      b93efa:	74 05                	je     b93f01 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe0ea1>
      b93efc:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      b93f01:	48 8d 05 88 d6 c7 00 	lea    rax,[rip+0xc7d688]        # 1811590 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7250>
      b93f08:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
      b93f0f:	00 
      b93f10:	49 89 04 24          	mov    QWORD PTR [r12],rax
      b93f14:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
      b93f19:	49 89 6c 24 10       	mov    QWORD PTR [r12+0x10],rbp
      b93f1e:	4d 89 7c 24 18       	mov    QWORD PTR [r12+0x18],r15
      b93f23:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      b93f28:	31 ff                	xor    edi,edi
      b93f2a:	e8 83 a5 f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      b93f2f:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      b93f36:	00 
      b93f37:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b93f3a:	4c 89 e6             	mov    rsi,r12
      b93f3d:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      b93f43:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]

### 0xb940e5; FDE=(12139494, 12141324)
      b9407b:	e8 26 58 a5 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      b94080:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      b94085:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
      b9408c:	00 
      b9408d:	e8 ae 9e c5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b94092:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      b94099:	00 
      b9409a:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      b9409f:	e8 5a 59 a5 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
      b940a4:	48 8d 35 45 69 8a ff 	lea    rsi,[rip+0xffffffffff8a6945]        # 43a9f0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5fc>
      b940ab:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      b940b0:	e8 8b 9e c5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b940b5:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
      b940bc:	00 
      b940bd:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      b940c2:	4c 89 e7             	mov    rdi,r12
      b940c5:	e8 60 58 a5 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
      b940ca:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
      b940ce:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b940d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b940d5:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      b940db:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      b940df:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b940e2:	6a 01                	push   0x1
      b940e4:	5e                   	pop    rsi
      b940e5:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      b940eb:	49 89 e5             	mov    r13,rsp
      b940ee:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
      b940f5:	00 
      b940f6:	4c 89 ef             	mov    rdi,r13
      b940f9:	e8 4a 02 00 00       	call   b94348 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12e8>
      b940fe:	41 0f 28 45 00       	movaps xmm0,XMMWORD PTR [r13+0x0]
      b94103:	4c 89 e7             	mov    rdi,r12
      b94106:	e8 4d 5b a5 00       	call   15e9c58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f1dc>
      b9410b:	4d 85 ff             	test   r15,r15
      b9410e:	74 05                	je     b94115 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe10b5>
      b94110:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      b94115:	48 8d 05 bc d4 c7 00 	lea    rax,[rip+0xc7d4bc]        # 18115d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7298>
      b9411c:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
      b94123:	00 
      b94124:	49 89 04 24          	mov    QWORD PTR [r12],rax
      b94128:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
      b9412d:	49 89 6c 24 10       	mov    QWORD PTR [r12+0x10],rbp
      b94132:	4d 89 7c 24 18       	mov    QWORD PTR [r12+0x18],r15
      b94137:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      b9413c:	31 ff                	xor    edi,edi
      b9413e:	e8 6f a3 f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      b94143:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      b9414a:	00 
      b9414b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b9414e:	4c 89 e6             	mov    rsi,r12
      b94151:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      b94157:	4d 85 ff             	test   r15,r15
      b9415a:	74 05                	je     b94161 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe1101>
      b9415c:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      b94161:	48 8d 05 b8 d4 c7 00 	lea    rax,[rip+0xc7d4b8]        # 1811620 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x72e0>
      b94168:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
      b9416f:	00 
      b94170:	49 89 04 24          	mov    QWORD PTR [r12],rax
      b94174:	4d 89 74 24 08       	mov    QWORD PTR [r12+0x8],r14
      b94179:	49 89 6c 24 10       	mov    QWORD PTR [r12+0x10],rbp
      b9417e:	4d 89 7c 24 18       	mov    QWORD PTR [r12+0x18],r15
      b94183:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      b94188:	31 ff                	xor    edi,edi
      b9418a:	e8 23 a3 f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      b9418f:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      b94196:	00 
      b94197:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b9419a:	4c 89 e6             	mov    rsi,r12
      b9419d:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      b941a3:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]

### 0xbc66eb; FDE=(12347106, 12347263)
      bc66a2:	48 89 c6             	mov    rsi,rax
      bc66a5:	48 c1 ee 20          	shr    rsi,0x20
      bc66a9:	48 c1 e6 20          	shl    rsi,0x20
      bc66ad:	48 09 ce             	or     rsi,rcx
      bc66b0:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc66b3:	48 89 df             	mov    rdi,rbx
      bc66b6:	ff 90 c8 05 00 00    	call   QWORD PTR [rax+0x5c8]
      bc66bc:	48 89 c1             	mov    rcx,rax
      bc66bf:	48 c1 e9 20          	shr    rcx,0x20
      bc66c3:	48 89 d6             	mov    rsi,rdx
      bc66c6:	48 c1 ee 20          	shr    rsi,0x20
      bc66ca:	31 c8                	xor    eax,ecx
      bc66cc:	31 d6                	xor    esi,edx
      bc66ce:	01 f0                	add    eax,esi
      bc66d0:	5b                   	pop    rbx
      bc66d1:	c3                   	ret
      bc66d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc66d5:	48 03 b8 d8 fe ff ff 	add    rdi,QWORD PTR [rax-0x128]
      bc66dc:	e9 7f ff ff ff       	jmp    bc6660 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x113600>
      bc66e1:	cc                   	int3
      bc66e2:	55                   	push   rbp
      bc66e3:	53                   	push   rbx
      bc66e4:	50                   	push   rax
      bc66e5:	48 89 fb             	mov    rbx,rdi
      bc66e8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc66eb:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      bc66f1:	48 89 c6             	mov    rsi,rax
      bc66f4:	48 c1 e8 20          	shr    rax,0x20
      bc66f8:	0f ba e0 18          	bt     eax,0x18
      bc66fc:	73 1a                	jae    bc6718 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1136b8>
      bc66fe:	48 c1 e6 20          	shl    rsi,0x20
      bc6702:	48 09 c6             	or     rsi,rax
      bc6705:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc6708:	48 89 df             	mov    rdi,rbx
      bc670b:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]
      bc6711:	48 89 c6             	mov    rsi,rax
      bc6714:	48 c1 ee 20          	shr    rsi,0x20
      bc6718:	0f ba e6 19          	bt     esi,0x19
      bc671c:	73 1c                	jae    bc673a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1136da>
      bc671e:	48 c1 e0 20          	shl    rax,0x20
      bc6722:	89 f6                	mov    esi,esi
      bc6724:	48 09 c6             	or     rsi,rax
      bc6727:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc672a:	48 89 df             	mov    rdi,rbx
      bc672d:	ff 90 18 04 00 00    	call   QWORD PTR [rax+0x418]
      bc6733:	48 89 c6             	mov    rsi,rax
      bc6736:	48 c1 e8 20          	shr    rax,0x20
      bc673a:	89 f7                	mov    edi,esi
      bc673c:	6a ff                	push   0xffffffffffffffff
      bc673e:	5d                   	pop    rbp
      bc673f:	48 c1 e7 20          	shl    rdi,0x20
      bc6743:	89 c6                	mov    esi,eax
      bc6745:	48 09 fe             	or     rsi,rdi
      bc6748:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      bc674b:	48 89 df             	mov    rdi,rbx
      bc674e:	ff 90 d0 04 00 00    	call   QWORD PTR [rax+0x4d0]
      bc6754:	48 89 c7             	mov    rdi,rax
      bc6757:	48 c1 ef 20          	shr    rdi,0x20
      bc675b:	89 c1                	mov    ecx,eax
      bc675d:	c1 e9 04             	shr    ecx,0x4
      bc6760:	83 e1 07             	and    ecx,0x7
      bc6763:	ff c5                	inc    ebp
      bc6765:	39 cd                	cmp    ebp,ecx
      bc6767:	72 d6                	jb     bc673f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1136df>
      bc6769:	48 89 d1             	mov    rcx,rdx
      bc676c:	48 c1 e9 20          	shr    rcx,0x20
      bc6770:	31 f8                	xor    eax,edi
      bc6772:	31 d1                	xor    ecx,edx
      bc6774:	01 c1                	add    ecx,eax
      bc6776:	89 c8                	mov    eax,ecx
      bc6778:	48 83 c4 08          	add    rsp,0x8

### 0xbde773; FDE=(12445232, 12445708)
      bde70c:	ff 
      bde70d:	66 0f 5c 05 9b e1 7a 	subpd  xmm0,XMMWORD PTR [rip+0xffffffffff7ae19b]        # 38c8b0 <_ZTSSt12bad_any_cast@@Base-0x3918>
      bde714:	ff 
      bde715:	66 0f 7c c0          	haddpd xmm0,xmm0
      bde719:	f2 43 0f 5e 04 27    	divsd  xmm0,QWORD PTR [r15+r12*1]
      bde71f:	66 0f 3a 0b c0 0a    	roundsd xmm0,xmm0,0xa
      bde725:	f2 48 0f 2c c0       	cvttsd2si rax,xmm0
      bde72a:	48 89 c1             	mov    rcx,rax
      bde72d:	f2 0f 5c 05 6b 09 7b 	subsd  xmm0,QWORD PTR [rip+0xffffffffff7b096b]        # 38f0a0 <_ZTSSt12bad_any_cast@@Base-0x1128>
      bde734:	ff 
      bde735:	f2 4c 0f 2c e8       	cvttsd2si r13,xmm0
      bde73a:	48 c1 f9 3f          	sar    rcx,0x3f
      bde73e:	49 21 cd             	and    r13,rcx
      bde741:	49 09 c5             	or     r13,rax
      bde744:	4d 29 ee             	sub    r14,r13
      bde747:	b8 00 00 00 00       	mov    eax,0x0
      bde74c:	4c 0f 42 f0          	cmovb  r14,rax
      bde750:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
      bde757:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bde75a:	48 89 ee             	mov    rsi,rbp
      bde75d:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      bde763:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
      bde76a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bde76d:	48 89 ee             	mov    rsi,rbp
      bde770:	4c 89 ea             	mov    rdx,r13
      bde773:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      bde779:	4b 83 7c 27 08 00    	cmp    QWORD PTR [r15+r12*1+0x8],0x0
      bde77f:	48 8b 83 20 01 00 00 	mov    rax,QWORD PTR [rbx+0x120]
      bde786:	75 4d                	jne    bde7d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12b775>
      bde788:	48 8b 8b 18 01 00 00 	mov    rcx,QWORD PTR [rbx+0x118]
      bde78f:	48 ff c8             	dec    rax
      bde792:	48 89 83 20 01 00 00 	mov    QWORD PTR [rbx+0x120],rax
      bde799:	48 ff c1             	inc    rcx
      bde79c:	48 89 8b 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rcx
      bde7a3:	48 81 f9 00 02 00 00 	cmp    rcx,0x200
      bde7aa:	72 29                	jb     bde7d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12b775>
      bde7ac:	48 8b 83 00 01 00 00 	mov    rax,QWORD PTR [rbx+0x100]
      bde7b3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      bde7b6:	e8 65 f7 c0 00       	call   17edf20 <_ZdlPv@plt>
      bde7bb:	48 83 83 00 01 00 00 	add    QWORD PTR [rbx+0x100],0x8
      bde7c2:	08 
      bde7c3:	48 81 83 18 01 00 00 	add    QWORD PTR [rbx+0x118],0xffffffffffffff00
      bde7ca:	00 ff ff ff 
      bde7ce:	48 8b 83 20 01 00 00 	mov    rax,QWORD PTR [rbx+0x120]
      bde7d5:	4c 39 6c 24 08       	cmp    QWORD PTR [rsp+0x8],r13
      bde7da:	76 0c                	jbe    bde7e8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12b788>
      bde7dc:	4c 89 f6             	mov    rsi,r14
      bde7df:	48 85 c0             	test   rax,rax
      bde7e2:	0f 85 81 fe ff ff    	jne    bde669 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12b609>
      bde7e8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bde7ef:	00 00 
      bde7f1:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      bde7f6:	75 0f                	jne    bde807 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12b7a7>
      bde7f8:	48 83 c4 28          	add    rsp,0x28
      bde7fc:	5b                   	pop    rbx
      bde7fd:	41 5c                	pop    r12
      bde7ff:	41 5d                	pop    r13
      bde801:	41 5e                	pop    r14
      bde803:	41 5f                	pop    r15
      bde805:	5d                   	pop    rbp
      bde806:	c3                   	ret
      bde807:	e8 a4 12 c1 00       	call   17efab0 <__stack_chk_fail@plt>
      bde80c:	41 57                	push   r15
      bde80e:	41 56                	push   r14
      bde810:	53                   	push   rbx
      bde811:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
      bde814:	4d 85 ff             	test   r15,r15
      bde817:	74 31                	je     bde84a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12b7ea>
      bde819:	48 89 fb             	mov    rbx,rdi
      bde81c:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
      bde820:	4c 89 ff             	mov    rdi,r15

### 0xbf5142; FDE=(12537548, 12538510)
      bf50e0:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
      bf50e3:	66 0f 3a 0a c0 09    	roundss xmm0,xmm0,0x9
      bf50e9:	f3 48 0f 2c c0       	cvttss2si rax,xmm0
      bf50ee:	48 89 c1             	mov    rcx,rax
      bf50f1:	f3 0f 5c 05 23 97 79 	subss  xmm0,DWORD PTR [rip+0xffffffffff799723]        # 38e81c <_ZTSSt12bad_any_cast@@Base-0x19ac>
      bf50f8:	ff 
      bf50f9:	f3 4c 0f 2c e0       	cvttss2si r12,xmm0
      bf50fe:	48 c1 f9 3f          	sar    rcx,0x3f
      bf5102:	49 21 cc             	and    r12,rcx
      bf5105:	49 09 c4             	or     r12,rax
      bf5108:	4b 8d 14 e7          	lea    rdx,[r15+r12*8]
      bf510c:	4c 89 f7             	mov    rdi,r14
      bf510f:	4c 89 fe             	mov    rsi,r15
      bf5112:	e8 61 07 00 00       	call   bf5878 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x142818>
      bf5117:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
      bf511b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf511e:	4c 89 e6             	mov    rsi,r12
      bf5121:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      bf5127:	48 8b 54 24 48       	mov    rdx,QWORD PTR [rsp+0x48]
      bf512c:	48 2b 54 24 40       	sub    rdx,QWORD PTR [rsp+0x40]
      bf5131:	48 8b 7b 60          	mov    rdi,QWORD PTR [rbx+0x60]
      bf5135:	48 c1 fa 02          	sar    rdx,0x2
      bf5139:	48 d1 ea             	shr    rdx,1
      bf513c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf513f:	4c 89 e6             	mov    rsi,r12
      bf5142:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      bf5148:	4d 85 e4             	test   r12,r12
      bf514b:	78 07                	js     bf5154 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1420f4>
      bf514d:	f3 49 0f 2a c4       	cvtsi2ss xmm0,r12
      bf5152:	eb 16                	jmp    bf516a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x14210a>
      bf5154:	4c 89 e0             	mov    rax,r12
      bf5157:	48 d1 e8             	shr    rax,1
      bf515a:	41 83 e4 01          	and    r12d,0x1
      bf515e:	49 09 c4             	or     r12,rax
      bf5161:	f3 49 0f 2a c4       	cvtsi2ss xmm0,r12
      bf5166:	f3 0f 58 c0          	addss  xmm0,xmm0
      bf516a:	f3 0f 10 8b 88 00 00 	movss  xmm1,DWORD PTR [rbx+0x88]
      bf5171:	00 
      bf5172:	f3 0f 5c c8          	subss  xmm1,xmm0
      bf5176:	f3 0f 11 8b 88 00 00 	movss  DWORD PTR [rbx+0x88],xmm1
      bf517d:	00 
      bf517e:	4c 8b 63 38          	mov    r12,QWORD PTR [rbx+0x38]
      bf5182:	6a 30                	push   0x30
      bf5184:	5f                   	pop    rdi
      bf5185:	e8 76 8d bf 00       	call   17edf00 <_Znwm@plt>
      bf518a:	49 89 c6             	mov    r14,rax
      bf518d:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
      bf5192:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
      bf5197:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      bf519b:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      bf51a0:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      bf51a4:	0f 57 c0             	xorps  xmm0,xmm0
      bf51a7:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      bf51ac:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
      bf51b2:	f3 41 0f 10 04 24    	movss  xmm0,DWORD PTR [r12]
      bf51b8:	6a 01                	push   0x1
      bf51ba:	5a                   	pop    rdx
      bf51bb:	4c 89 f7             	mov    rdi,r14
      bf51be:	4c 89 fe             	mov    rsi,r15
      bf51c1:	e8 00 58 96 00       	call   155a9c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39ff4a>
      bf51c6:	4c 89 ff             	mov    rdi,r15
      bf51c9:	e8 5a 65 e8 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      bf51ce:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
      bf51d2:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      bf51d8:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      bf51dd:	4c 89 36             	mov    QWORD PTR [rsi],r14
      bf51e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf51e3:	ff 50 28             	call   QWORD PTR [rax+0x28]
      bf51e6:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      bf51eb:	e8 ec 39 eb ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
      bf51f0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### 0xbf6d72; FDE=(12542056, 12545875)
      bf6d00:	48 c1 fa 02          	sar    rdx,0x2
      bf6d04:	4c 01 ea             	add    rdx,r13
      bf6d07:	48 83 fa ff          	cmp    rdx,0xffffffffffffffff
      bf6d0b:	48 0f 44 d1          	cmove  rdx,rcx
      bf6d0f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      bf6d13:	48 89 53 20          	mov    QWORD PTR [rbx+0x20],rdx
      bf6d17:	49 8b 86 d8 00 00 00 	mov    rax,QWORD PTR [r14+0xd8]
      bf6d1e:	49 89 86 e0 00 00 00 	mov    QWORD PTR [r14+0xe0],rax
      bf6d25:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
      bf6d2a:	49 8b 86 c8 00 00 00 	mov    rax,QWORD PTR [r14+0xc8]
      bf6d31:	49 2b 86 c0 00 00 00 	sub    rax,QWORD PTR [r14+0xc0]
      bf6d38:	48 c1 f8 02          	sar    rax,0x2
      bf6d3c:	48 8b b4 24 90 00 00 	mov    rsi,QWORD PTR [rsp+0x90]
      bf6d43:	00 
      bf6d44:	48 29 c6             	sub    rsi,rax
      bf6d47:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
      bf6d4e:	00 
      bf6d4f:	e8 46 39 96 00       	call   155a69a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39fc1e>
      bf6d54:	88 43 28             	mov    BYTE PTR [rbx+0x28],al
      bf6d57:	f3 41 0f 10 46 70    	movss  xmm0,DWORD PTR [r14+0x70]
      bf6d5d:	f3 0f 11 43 2c       	movss  DWORD PTR [rbx+0x2c],xmm0
      bf6d62:	49 8b be a8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1a8]
      bf6d69:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf6d6c:	4c 89 ee             	mov    rsi,r13
      bf6d6f:	48 89 ea             	mov    rdx,rbp
      bf6d72:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      bf6d78:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
      bf6d7f:	00 00 
      bf6d81:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
      bf6d86:	48 89 9c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbx
      bf6d8d:	00 
      bf6d8e:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      bf6d95:	00 
      bf6d96:	e8 41 1e eb ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
      bf6d9b:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      bf6da2:	00 
      bf6da3:	e8 34 1e eb ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
      bf6da8:	4c 89 ff             	mov    rdi,r15
      bf6dab:	e8 ca 0f fd ff       	call   bc7d7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x114d1a>
      bf6db0:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      bf6db7:	00 
      bf6db8:	e8 1f 1e eb ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
      bf6dbd:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
      bf6dc4:	00 
      bf6dc5:	e8 66 50 eb ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      bf6dca:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
      bf6dd1:	00 
      bf6dd2:	e8 05 1e eb ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
      bf6dd7:	48 85 db             	test   rbx,rbx
      bf6dda:	74 2b                	je     bf6e07 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x143da7>
      bf6ddc:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
      bf6de0:	48 83 a4 24 c0 00 00 	and    QWORD PTR [rsp+0xc0],0x0
      bf6de7:	00 00 
      bf6de9:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
      bf6df0:	00 
      bf6df1:	48 89 1e             	mov    QWORD PTR [rsi],rbx
      bf6df4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf6df7:	ff 50 28             	call   QWORD PTR [rax+0x28]
      bf6dfa:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      bf6e01:	00 
      bf6e02:	e8 d5 1d eb ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
      bf6e07:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      bf6e0e:	00 
      bf6e0f:	e8 c8 1d eb ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
      bf6e14:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      bf6e1b:	00 00 
      bf6e1d:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
      bf6e24:	00 
      bf6e25:	0f 85 23 01 00 00    	jne    bf6f4e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x143eee>
      bf6e2b:	48 81 c4 18 01 00 00 	add    rsp,0x118
      bf6e32:	5b                   	pop    rbx

### 0xbfe479; FDE=(12575638, 12576352)
Strings: https://accounts.spotify.com/api/token | Content-Type | application/x-www-form-urlencoded
      bfe40d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      bfe412:	e8 67 b6 e7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      bfe417:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      bfe41c:	48 89 ef             	mov    rdi,rbp
      bfe41f:	e8 70 b5 9e 00       	call   15e9994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef18>
      bfe424:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      bfe428:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bfe42b:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      bfe42f:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      bfe435:	48 8d 35 f2 c4 83 ff 	lea    rsi,[rip+0xffffffffff83c4f2]        # 43a92e <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x53a>
      bfe43c:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      bfe441:	e8 38 b6 e7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      bfe446:	48 8d 35 e3 8c 7c ff 	lea    rsi,[rip+0xffffffffff7c8ce3]        # 3c7130 <_ZTSN5boost9exceptionE@@Base+0x27b12>
      bfe44d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      bfe452:	e8 27 b6 e7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      bfe457:	48 8d 5c 24 28       	lea    rbx,[rsp+0x28]
      bfe45c:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
      bfe461:	48 89 ef             	mov    rdi,rbp
      bfe464:	48 89 de             	mov    rsi,rbx
      bfe467:	4c 89 fa             	mov    rdx,r15
      bfe46a:	e8 f9 b5 9e 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      bfe46f:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      bfe473:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bfe476:	6a 01                	push   0x1
      bfe478:	5e                   	pop    rsi
      bfe479:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      bfe47f:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
      bfe483:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bfe486:	be 30 75 00 00       	mov    esi,0x7530
      bfe48b:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      bfe491:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
      bfe495:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
      bfe49a:	0f 57 c0             	xorps  xmm0,xmm0
      bfe49d:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
      bfe4a1:	4c 89 ff             	mov    rdi,r15
      bfe4a4:	e8 e7 f9 be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      bfe4a9:	48 89 df             	mov    rdi,rbx
      bfe4ac:	e8 df f9 be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      bfe4b1:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      bfe4b6:	e8 d5 f9 be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      bfe4bb:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      bfe4c0:	e8 cb f9 be 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      bfe4c5:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
      bfe4c9:	49 89 46 50          	mov    QWORD PTR [r14+0x50],rax
      bfe4cd:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
      bfe4d2:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
      bfe4d7:	0f 57 c9             	xorps  xmm1,xmm1
      bfe4da:	41 0f 11 4d 00       	movups XMMWORD PTR [r13+0x0],xmm1
      bfe4df:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
      bfe4e4:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
      bfe4e9:	49 89 46 68          	mov    QWORD PTR [r14+0x68],rax
      bfe4ed:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
      bfe4f2:	41 0f 11 46 58       	movups XMMWORD PTR [r14+0x58],xmm0
      bfe4f7:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
      bfe4fc:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
      bfe502:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      bfe507:	49 89 86 80 00 00 00 	mov    QWORD PTR [r14+0x80],rax
      bfe50e:	41 0f 10 44 24 18    	movups xmm0,XMMWORD PTR [r12+0x18]
      bfe514:	41 0f 11 46 70       	movups XMMWORD PTR [r14+0x70],xmm0
      bfe519:	41 0f 11 4c 24 18    	movups XMMWORD PTR [r12+0x18],xmm1
      bfe51f:	49 83 64 24 28 00    	and    QWORD PTR [r12+0x28],0x0
      bfe525:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
      bfe52a:	49 89 86 98 00 00 00 	mov    QWORD PTR [r14+0x98],rax
      bfe531:	41 0f 10 44 24 30    	movups xmm0,XMMWORD PTR [r12+0x30]
      bfe537:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
      bfe53e:	00 
      bfe53f:	41 0f 11 4c 24 30    	movups XMMWORD PTR [r12+0x30],xmm1
      bfe545:	49 83 64 24 40 00    	and    QWORD PTR [r12+0x40],0x0
      bfe54b:	49 8b 44 24 58       	mov    rax,QWORD PTR [r12+0x58]
      bfe550:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
      bfe557:	41 0f 10 44 24 48    	movups xmm0,XMMWORD PTR [r12+0x48]

### 0xc097ac; FDE=(12621440, 12622158)
      c0974f:	49 39 de             	cmp    r14,rbx
      c09752:	4c 0f 43 f3          	cmovae r14,rbx
      c09756:	49 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [r12+0xe8]
      c0975d:	00 
      c0975e:	48 85 c0             	test   rax,rax
      c09761:	75 08                	jne    c0976b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15670b>
      c09763:	49 8b 84 24 18 01 00 	mov    rax,QWORD PTR [r12+0x118]
      c0976a:	00 
      c0976b:	49 8b b4 24 20 01 00 	mov    rsi,QWORD PTR [r12+0x120]
      c09772:	00 
      c09773:	49 8b 94 24 30 01 00 	mov    rdx,QWORD PTR [r12+0x130]
      c0977a:	00 
      c0977b:	49 03 54 24 78       	add    rdx,QWORD PTR [r12+0x78]
      c09780:	49 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [r12+0x100]
      c09787:	00 
      c09788:	31 c9                	xor    ecx,ecx
      c0978a:	ff d0                	call   rax
      c0978c:	48 85 c0             	test   rax,rax
      c0978f:	0f 85 9a 01 00 00    	jne    c0992f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1568cf>
      c09795:	49 8b 14 24          	mov    rdx,QWORD PTR [r12]
      c09799:	49 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [r12+0x100]
      c097a0:	00 
      c097a1:	49 8b b4 24 20 01 00 	mov    rsi,QWORD PTR [r12+0x120]
      c097a8:	00 
      c097a9:	4c 89 f1             	mov    rcx,r14
      c097ac:	41 ff 94 24 d0 00 00 	call   QWORD PTR [r12+0xd0]
      c097b3:	00 
      c097b4:	4c 39 f0             	cmp    rax,r14
      c097b7:	0f 85 72 01 00 00    	jne    c0992f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1568cf>
      c097bd:	4d 01 74 24 78       	add    QWORD PTR [r12+0x78],r14
      c097c2:	4d 29 b4 24 b8 00 00 	sub    QWORD PTR [r12+0xb8],r14
      c097c9:	00 
      c097ca:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      c097ce:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      c097d3:	45 89 74 24 10       	mov    DWORD PTR [r12+0x10],r14d
      c097d8:	eb 03                	jmp    c097dd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15677d>
      c097da:	45 31 f6             	xor    r14d,r14d
      c097dd:	49 8b 84 24 28 01 00 	mov    rax,QWORD PTR [r12+0x128]
      c097e4:	00 
      c097e5:	48 85 c0             	test   rax,rax
      c097e8:	74 0f                	je     c097f9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x156799>
      c097ea:	41 83 bc 24 38 01 00 	cmp    DWORD PTR [r12+0x138],0x0
      c097f1:	00 00 
      c097f3:	0f 84 a2 00 00 00    	je     c0989b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15683b>
      c097f9:	45 85 f6             	test   r14d,r14d
      c097fc:	75 0f                	jne    c0980d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1567ad>
      c097fe:	49 83 bc 24 b8 00 00 	cmp    QWORD PTR [r12+0xb8],0x0
      c09805:	00 00 
      c09807:	0f 84 2c 01 00 00    	je     c09939 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1568d9>
      c0980d:	41 8b 44 24 28       	mov    eax,DWORD PTR [r12+0x28]
      c09812:	44 39 f0             	cmp    eax,r14d
      c09815:	44 0f 42 f0          	cmovb  r14d,eax
      c09819:	45 85 f6             	test   r14d,r14d
      c0981c:	74 1a                	je     c09838 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1567d8>
      c0981e:	31 c0                	xor    eax,eax
      c09820:	49 8b 4c 24 08       	mov    rcx,QWORD PTR [r12+0x8]
      c09825:	49 8b 54 24 20       	mov    rdx,QWORD PTR [r12+0x20]
      c0982a:	8a 0c 01             	mov    cl,BYTE PTR [rcx+rax*1]
      c0982d:	88 0c 02             	mov    BYTE PTR [rdx+rax*1],cl
      c09830:	48 ff c0             	inc    rax
      c09833:	49 39 c6             	cmp    r14,rax
      c09836:	75 e8                	jne    c09820 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1567c0>
      c09838:	4d 01 b4 24 a0 00 00 	add    QWORD PTR [r12+0xa0],r14
      c0983f:	00 
      c09840:	4d 8b 7c 24 20       	mov    r15,QWORD PTR [r12+0x20]
      c09845:	49 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [r12+0xa8]
      c0984c:	00 
      c0984d:	4c 89 fe             	mov    rsi,r15
      c09850:	4c 89 f2             	mov    rdx,r14
      c09853:	e8 b8 61 ba 00       	call   17afa10 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163b7c>
      c09858:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax

### 0xc29aa1; FDE=(12747912, 12754236)
      c29a47:	48 89 d7             	mov    rdi,rdx
      c29a4a:	48 89 c2             	mov    rdx,rax
      c29a4d:	e8 48 07 b1 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
      c29a52:	6a 40                	push   0x40
      c29a54:	5f                   	pop    rdi
      c29a55:	e8 a6 44 bc 00       	call   17edf00 <_Znwm@plt>
      c29a5a:	49 89 c4             	mov    r12,rax
      c29a5d:	0f 57 c0             	xorps  xmm0,xmm0
      c29a60:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      c29a64:	48 8d 05 3d 3d bd 00 	lea    rax,[rip+0xbd3d3d]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>
      c29a6b:	49 89 04 24          	mov    QWORD PTR [r12],rax
      c29a6f:	4d 89 e5             	mov    r13,r12
      c29a72:	49 83 c5 18          	add    r13,0x18
      c29a76:	4c 89 ef             	mov    rdi,r13
      c29a79:	4c 89 fe             	mov    rsi,r15
      c29a7c:	e8 0b 80 9b 00       	call   15e1a8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427010>
      c29a81:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      c29a86:	4d 89 2f             	mov    QWORD PTR [r15],r13
      c29a89:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
      c29a8d:	49 8b 06             	mov    rax,QWORD PTR [r14]
      c29a90:	48 8d 94 24 d0 01 00 	lea    rdx,[rsp+0x1d0]
      c29a97:	00 
      c29a98:	48 89 df             	mov    rdi,rbx
      c29a9b:	4c 89 f6             	mov    rsi,r14
      c29a9e:	4c 89 f9             	mov    rcx,r15
      c29aa1:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      c29aa7:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      c29aab:	48 85 ff             	test   rdi,rdi
      c29aae:	74 05                	je     c29ab5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x176a55>
      c29ab0:	e8 db 49 e7 ff       	call   a9e490 <JNI_OnUnload@@Base+0x25d5d>
      c29ab5:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
      c29abc:	00 
      c29abd:	e8 4c 10 e8 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      c29ac2:	48 8d bc 24 78 06 00 	lea    rdi,[rsp+0x678]
      c29ac9:	00 
      c29aca:	e8 3f 10 e8 ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      c29acf:	e9 c3 01 00 00       	jmp    c29c97 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x176c37>
      c29ad4:	0f 18 0d c5 b1 ca 00 	prefetcht0 BYTE PTR [rip+0xcab1c5]        # 18d4ca0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1c0b0>
      c29adb:	48 8d 3d be b1 ca 00 	lea    rdi,[rip+0xcab1be]        # 18d4ca0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1c0b0>
      c29ae2:	48 8b 05 bf b1 ca 00 	mov    rax,QWORD PTR [rip+0xcab1bf]        # 18d4ca8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1c0b8>
      c29ae9:	0f 18 08             	prefetcht0 BYTE PTR [rax]
      c29aec:	e8 f9 50 b2 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
      c29af1:	48 8d b4 24 80 01 00 	lea    rsi,[rsp+0x180]
      c29af8:	00 
      c29af9:	48 8d 84 24 78 06 00 	lea    rax,[rsp+0x678]
      c29b00:	00 
      c29b01:	48 89 d7             	mov    rdi,rdx
      c29b04:	48 89 c2             	mov    rdx,rax
      c29b07:	e8 8e 06 b1 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
      c29b0c:	48 89 e7             	mov    rdi,rsp
      c29b0f:	4c 89 fe             	mov    rsi,r15
      c29b12:	e8 22 0e e8 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
      c29b17:	49 8b 06             	mov    rax,QWORD PTR [r14]
      c29b1a:	4c 8d bc 24 80 01 00 	lea    r15,[rsp+0x180]
      c29b21:	00 
      c29b22:	49 89 e4             	mov    r12,rsp
      c29b25:	48 89 df             	mov    rdi,rbx
      c29b28:	4c 89 f6             	mov    rsi,r14
      c29b2b:	4c 89 fa             	mov    rdx,r15
      c29b2e:	4c 89 e1             	mov    rcx,r12
      c29b31:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      c29b37:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      c29b3c:	e8 45 49 e7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c29b41:	4c 89 ff             	mov    rdi,r15
      c29b44:	e8 9b 4e e9 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      c29b49:	48 8d bc 24 78 06 00 	lea    rdi,[rsp+0x678]
      c29b50:	00 
      c29b51:	e8 8e 4e e9 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
      c29b56:	e9 3c 01 00 00       	jmp    c29c97 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x176c37>
      c29b5b:	0f 18 0d c6 d1 ca 00 	prefetcht0 BYTE PTR [rip+0xcad1c6]        # 18d6d28 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1e138>
      c29b62:	48 8d 3d bf d1 ca 00 	lea    rdi,[rip+0xcad1bf]        # 18d6d28 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1e138>

### 0xc49e18; FDE=(12884878, 12886442)
Strings: Failed to copy %s / %s to cache! | Cache-Control | no-cache, no-store | unknown
      c49dac:	e8 e3 fb 99 00       	call   15e9994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef18>
      c49db1:	48 8d 35 88 ff 7e ff 	lea    rsi,[rip+0xffffffffff7eff88]        # 439d40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f78f>
      c49db8:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      c49dbd:	e8 bc fc e2 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      c49dc2:	48 8d 35 fa ae 73 ff 	lea    rsi,[rip+0xffffffffff73aefa]        # 384cc3 <_ZTSSt12bad_any_cast@@Base-0xb505>
      c49dc9:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      c49dce:	e8 ab fc e2 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      c49dd3:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
      c49dda:	00 
      c49ddb:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      c49de0:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
      c49de5:	4c 89 f7             	mov    rdi,r14
      c49de8:	e8 7b fc 99 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      c49ded:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c49df0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c49df3:	be 30 75 00 00       	mov    esi,0x7530
      c49df8:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      c49dfe:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c49e01:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c49e04:	be 20 4e 00 00       	mov    esi,0x4e20
      c49e09:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      c49e0f:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c49e12:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c49e15:	6a 01                	push   0x1
      c49e17:	5e                   	pop    rsi
      c49e18:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      c49e1e:	48 8d 05 ab f0 bc 00 	lea    rax,[rip+0xbcf0ab]        # 1818ed0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xeb90>
      c49e25:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
      c49e2c:	00 
      c49e2d:	48 89 06             	mov    QWORD PTR [rsi],rax
      c49e30:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
      c49e34:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      c49e38:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c49e3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c49e3e:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      c49e44:	48 8d 05 cd f0 bc 00 	lea    rax,[rip+0xbcf0cd]        # 1818f18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xebd8>
      c49e4b:	48 8d b4 24 20 01 00 	lea    rsi,[rsp+0x120]
      c49e52:	00 
      c49e53:	48 89 06             	mov    QWORD PTR [rsi],rax
      c49e56:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
      c49e5a:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      c49e5e:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c49e61:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c49e64:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      c49e6a:	48 8d 05 ef f0 bc 00 	lea    rax,[rip+0xbcf0ef]        # 1818f60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xec20>
      c49e71:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
      c49e78:	00 
      c49e79:	48 89 06             	mov    QWORD PTR [rsi],rax
      c49e7c:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
      c49e80:	48 89 76 20          	mov    QWORD PTR [rsi+0x20],rsi
      c49e84:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c49e87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c49e8a:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      c49e90:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      c49e94:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      c49e98:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      c49e9c:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      c49ea1:	48 85 c0             	test   rax,rax
      c49ea4:	74 05                	je     c49eab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x196e4b>
      c49ea6:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      c49eab:	0f 57 c0             	xorps  xmm0,xmm0
      c49eae:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      c49eb3:	4c 8d b4 24 e0 00 00 	lea    r14,[rsp+0xe0]
      c49eba:	00 
      c49ebb:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      c49ec0:	4c 89 f7             	mov    rdi,r14
      c49ec3:	e8 68 14 e6 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      c49ec8:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      c49ecc:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      c49ed0:	0f 29 84 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm0
      c49ed7:	00 

### 0xc4b6d0; FDE=(12891634, 12892187)
      c4b675:	4c 89 fe             	mov    rsi,r15
      c4b678:	e8 13 ec e2 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      c4b67d:	48 89 ef             	mov    rdi,rbp
      c4b680:	e8 b1 01 e3 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      c4b685:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
      c4b68a:	4c 89 ff             	mov    rdi,r15
      c4b68d:	48 89 c6             	mov    rsi,rax
      c4b690:	e8 93 9d a7 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
      c4b695:	41 8b 47 38          	mov    eax,DWORD PTR [r15+0x38]
      c4b699:	4d 85 ed             	test   r13,r13
      c4b69c:	74 55                	je     c4b6f3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198693>
      c4b69e:	83 f8 22             	cmp    eax,0x22
      c4b6a1:	75 50                	jne    c4b6f3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198693>
      c4b6a3:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
      c4b6a8:	48 39 4c 24 30       	cmp    QWORD PTR [rsp+0x30],rcx
      c4b6ad:	74 44                	je     c4b6f3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198693>
      c4b6af:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      c4b6b3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      c4b6b8:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      c4b6bd:	4c 89 ee             	mov    rsi,r13
      c4b6c0:	ff 50 50             	call   QWORD PTR [rax+0x50]
      c4b6c3:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      c4b6c8:	48 85 ff             	test   rdi,rdi
      c4b6cb:	74 1a                	je     c4b6e7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198687>
      c4b6cd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c4b6d0:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      c4b6d6:	48 85 c0             	test   rax,rax
      c4b6d9:	74 0c                	je     c4b6e7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198687>
      c4b6db:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      c4b6df:	48 89 c6             	mov    rsi,rax
      c4b6e2:	e8 99 29 ba 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      c4b6e7:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c4b6ec:	e8 95 2d e5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c4b6f1:	eb 13                	jmp    c4b706 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1986a6>
      c4b6f3:	83 f8 22             	cmp    eax,0x22
      c4b6f6:	75 0e                	jne    c4b706 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1986a6>
      c4b6f8:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      c4b6fd:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      c4b701:	e8 7a 29 ba 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      c4b706:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      c4b70b:	e8 1e 9c a7 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      c4b710:	c6 83 e0 00 00 00 00 	mov    BYTE PTR [rbx+0xe0],0x0
      c4b717:	6a 20                	push   0x20
      c4b719:	5f                   	pop    rdi
      c4b71a:	e8 e1 27 ba 00       	call   17edf00 <_Znwm@plt>
      c4b71f:	49 89 c7             	mov    r15,rax
      c4b722:	66 0f ef c0          	pxor   xmm0,xmm0
      c4b726:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      c4b72b:	48 8d 05 fe 1d bb 00 	lea    rax,[rip+0xbb1dfe]        # 17fd530 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe25750>
      c4b732:	49 89 07             	mov    QWORD PTR [r15],rax
      c4b735:	49 89 5f 18          	mov    QWORD PTR [r15+0x18],rbx
      c4b739:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      c4b73d:	48 85 c0             	test   rax,rax
      c4b740:	74 0a                	je     c4b74c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1986ec>
      c4b742:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      c4b746:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
      c4b74a:	75 27                	jne    c4b773 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x198713>
      c4b74c:	66 49 0f 6e cf       	movq   xmm1,r15
      c4b751:	66 48 0f 6e c3       	movq   xmm0,rbx
      c4b756:	48 89 df             	mov    rdi,rbx
      c4b759:	48 83 c7 08          	add    rdi,0x8
      c4b75d:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
      c4b761:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      c4b766:	e8 9f e1 ed ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
      c4b76b:	4c 89 ff             	mov    rdi,r15
      c4b76e:	e8 13 2d e5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c4b773:	49 89 1e             	mov    QWORD PTR [r14],rbx
      c4b776:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
      c4b77a:	31 ff                	xor    edi,edi
      c4b77c:	e8 05 2d e5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c4b781:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0xc57f30; FDE=(12942390, 12943865)
Strings: "prefetch-strategy | core-prefetch-feature | prefetch_head_file_new_strategy_enabled | sliding_window_audio_max_window_size_metered | sliding_window_audio_min_window_size_metered | sliding_window_audio_window_size_increment_metered | prefetch_head_file_window_max | prefetch_narration_window_max | sliding_window_prefetch_associated_videos_enabled | sliding_window_prefetch_both_associated_media_enabled | sliding_window_segmented_video_prefetching_enabled | sliding_window_rate_limiter_max_size_minutes | sliding_window_rate_limiter_max_size_megabytes | *key-caching-max-count | prefetch_allow_all_keys_experiment | audio.play_bitrate_enumeration | sliding_window_audio_max_window_size_non_metered | sliding_window_audio_min_window_size_non_metered | sliding_window_audio_window_size_increment_non_metered | audio.play_bitrate_non_metered_enumeration
      c57ed5:	48 8d 35 54 36 77 ff 	lea    rsi,[rip+0xffffffffff773654]        # 3cb530 <_ZTSN5boost9exceptionE@@Base+0x2bf12>
      c57edc:	48 8d 0d 6d 36 77 ff 	lea    rcx,[rip+0xffffffffff77366d]        # 3cb550 <_ZTSN5boost9exceptionE@@Base+0x2bf32>
      c57ee3:	6a 2c                	push   0x2c
      c57ee5:	41 58                	pop    r8
      c57ee7:	4c 89 f2             	mov    rdx,r14
      c57eea:	45 31 c9             	xor    r9d,r9d
      c57eed:	e8 38 f5 98 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
      c57ef2:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
      c57ef5:	4c 89 ff             	mov    rdi,r15
      c57ef8:	89 c6                	mov    esi,eax
      c57efa:	ff 91 c8 00 00 00    	call   QWORD PTR [rcx+0xc8]
      c57f00:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
      c57f03:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]
      c57f07:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c57f0a:	48 8d 35 6f 36 77 ff 	lea    rsi,[rip+0xffffffffff77366f]        # 3cb580 <_ZTSN5boost9exceptionE@@Base+0x2bf62>
      c57f11:	48 8d 0d 88 36 77 ff 	lea    rcx,[rip+0xffffffffff773688]        # 3cb5a0 <_ZTSN5boost9exceptionE@@Base+0x2bf82>
      c57f18:	6a 2e                	push   0x2e
      c57f1a:	41 58                	pop    r8
      c57f1c:	6a 64                	push   0x64
      c57f1e:	41 59                	pop    r9
      c57f20:	4c 89 f2             	mov    rdx,r14
      c57f23:	e8 02 f5 98 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
      c57f28:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
      c57f2b:	4c 89 ff             	mov    rdi,r15
      c57f2e:	89 c6                	mov    esi,eax
      c57f30:	ff 91 d0 00 00 00    	call   QWORD PTR [rcx+0xd0]
      c57f36:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
      c57f3a:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c57f3d:	48 8d 35 5c 3a 77 ff 	lea    rsi,[rip+0xffffffffff773a5c]        # 3cb9a0 <_ZTSN5boost9exceptionE@@Base+0x2c382>
      c57f44:	48 8d 15 6d 3a 77 ff 	lea    rdx,[rip+0xffffffffff773a6d]        # 3cb9b8 <_ZTSN5boost9exceptionE@@Base+0x2c39a>
      c57f4b:	e8 0e 58 f3 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
      c57f50:	41 89 c7             	mov    r15d,eax
      c57f53:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
      c57f57:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c57f5a:	48 8d 35 2f 28 7e ff 	lea    rsi,[rip+0xffffffffff7e282f]        # 43a790 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x39c>
      c57f61:	48 8d 15 40 28 7e ff 	lea    rdx,[rip+0xffffffffff7e2840]        # 43a7a8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3b4>
      c57f68:	e8 81 89 e7 ff       	call   ad08ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d88e>
      c57f6d:	41 89 c4             	mov    r12d,eax
      c57f70:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
      c57f74:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c57f77:	48 8d 35 32 28 7e ff 	lea    rsi,[rip+0xffffffffff7e2832]        # 43a7b0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3bc>
      c57f7e:	48 8d 15 43 28 7e ff 	lea    rdx,[rip+0xffffffffff7e2843]        # 43a7c8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3d4>
      c57f85:	e8 d4 57 f3 ff       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>
      c57f8a:	41 89 c5             	mov    r13d,eax
      c57f8d:	48 8b 43 58          	mov    rax,QWORD PTR [rbx+0x58]
      c57f91:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c57f94:	48 8d 35 35 36 77 ff 	lea    rsi,[rip+0xffffffffff773635]        # 3cb5d0 <_ZTSN5boost9exceptionE@@Base+0x2bfb2>
      c57f9b:	48 8d 0d 4e 36 77 ff 	lea    rcx,[rip+0xffffffffff77364e]        # 3cb5f0 <_ZTSN5boost9exceptionE@@Base+0x2bfd2>
      c57fa2:	6a 22                	push   0x22
      c57fa4:	41 58                	pop    r8
      c57fa6:	4c 89 f2             	mov    rdx,r14
      c57fa9:	45 31 c9             	xor    r9d,r9d
      c57fac:	e8 d9 f3 98 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      c57fb1:	45 84 ff             	test   r15b,r15b
      c57fb4:	74 18                	je     c57fce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a4f6e>
      c57fb6:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      c57fb9:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
      c57fbc:	48 8b 49 68          	mov    rcx,QWORD PTR [rcx+0x68]
      c57fc0:	45 85 e4             	test   r12d,r12d
      c57fc3:	7e 16                	jle    c57fdb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a4f7b>
      c57fc5:	41 08 c5             	or     r13b,al
      c57fc8:	74 11                	je     c57fdb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a4f7b>
      c57fca:	6a 02                	push   0x2
      c57fcc:	eb 0f                	jmp    c57fdd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a4f7d>
      c57fce:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      c57fd1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c57fd4:	31 f6                	xor    esi,esi
      c57fd6:	ff 50 68             	call   QWORD PTR [rax+0x68]
      c57fd9:	eb 05                	jmp    c57fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a4f80>
      c57fdb:	6a 01                	push   0x1
      c57fdd:	5e                   	pop    rsi

### 0xc6eaa7; FDE=(13036182, 13036240)
      c6ea5a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c6ea5d:	e8 02 aa e4 ff       	call   ab9464 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6404>
      c6ea62:	48 89 df             	mov    rdi,rbx
      c6ea65:	e8 c7 2c 97 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
      c6ea6a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c6ea71:	00 00 
      c6ea73:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      c6ea78:	75 0f                	jne    c6ea89 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bba29>
      c6ea7a:	48 89 d8             	mov    rax,rbx
      c6ea7d:	48 83 c4 28          	add    rsp,0x28
      c6ea81:	5b                   	pop    rbx
      c6ea82:	41 5c                	pop    r12
      c6ea84:	41 5e                	pop    r14
      c6ea86:	41 5f                	pop    r15
      c6ea88:	c3                   	ret
      c6ea89:	e8 22 10 b8 00       	call   17efab0 <__stack_chk_fail@plt>
      c6ea8e:	48 89 c7             	mov    rdi,rax
      c6ea91:	e8 0f b0 e0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c6ea96:	41 56                	push   r14
      c6ea98:	53                   	push   rbx
      c6ea99:	50                   	push   rax
      c6ea9a:	49 89 ce             	mov    r14,rcx
      c6ea9d:	48 89 fb             	mov    rbx,rdi
      c6eaa0:	48 8b 7e 60          	mov    rdi,QWORD PTR [rsi+0x60]
      c6eaa4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6eaa7:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      c6eaad:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c6eab0:	e8 af a9 e4 ff       	call   ab9464 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6404>
      c6eab5:	48 89 df             	mov    rdi,rbx
      c6eab8:	e8 74 2c 97 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
      c6eabd:	48 89 d8             	mov    rax,rbx
      c6eac0:	48 83 c4 08          	add    rsp,0x8
      c6eac4:	5b                   	pop    rbx
      c6eac5:	41 5e                	pop    r14
      c6eac7:	c3                   	ret
      c6eac8:	48 89 c7             	mov    rdi,rax
      c6eacb:	e8 d5 af e0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c6ead0:	41 56                	push   r14
      c6ead2:	53                   	push   rbx
      c6ead3:	50                   	push   rax
      c6ead4:	49 89 ce             	mov    r14,rcx
      c6ead7:	48 89 fb             	mov    rbx,rdi
      c6eada:	48 8b 7e 60          	mov    rdi,QWORD PTR [rsi+0x60]
      c6eade:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c6eae1:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
      c6eae7:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c6eaea:	e8 75 a9 e4 ff       	call   ab9464 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6404>
      c6eaef:	48 89 df             	mov    rdi,rbx
      c6eaf2:	e8 3a 2c 97 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
      c6eaf7:	48 89 d8             	mov    rax,rbx
      c6eafa:	48 83 c4 08          	add    rsp,0x8
      c6eafe:	5b                   	pop    rbx
      c6eaff:	41 5e                	pop    r14
      c6eb01:	c3                   	ret
      c6eb02:	48 89 c7             	mov    rdi,rax
      c6eb05:	e8 9b af e0 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      c6eb0a:	55                   	push   rbp
      c6eb0b:	41 57                	push   r15
      c6eb0d:	41 56                	push   r14
      c6eb0f:	41 55                	push   r13
      c6eb11:	41 54                	push   r12
      c6eb13:	53                   	push   rbx
      c6eb14:	48 81 ec 48 01 00 00 	sub    rsp,0x148
      c6eb1b:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      c6eb20:	48 89 fb             	mov    rbx,rdi
      c6eb23:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c6eb2a:	00 00 
      c6eb2c:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
      c6eb33:	00 
      c6eb34:	48 8b 76 60          	mov    rsi,QWORD PTR [rsi+0x60]
      c6eb38:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### 0xc8c249; FDE=(13156594, 13158612)
      c8c1e9:	83 f0 3f             	xor    eax,0x3f
      c8c1ec:	01 c0                	add    eax,eax
      c8c1ee:	48 83 f0 7e          	xor    rax,0x7e
      c8c1f2:	31 d2                	xor    edx,edx
      c8c1f4:	48 39 fe             	cmp    rsi,rdi
      c8c1f7:	48 0f 45 d0          	cmovne rdx,rax
      c8c1fb:	6a 01                	push   0x1
      c8c1fd:	59                   	pop    rcx
      c8c1fe:	e8 ea 08 00 00       	call   c8caed <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9a8d>
      c8c203:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
      c8c208:	48 8d 05 31 0a b9 00 	lea    rax,[rip+0xb90a31]        # 181cc40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12900>
      c8c20f:	49 89 06             	mov    QWORD PTR [r14],rax
      c8c212:	0f 57 c0             	xorps  xmm0,xmm0
      c8c215:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
      c8c21a:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
      c8c21f:	48 8d 05 d2 35 7b ff 	lea    rax,[rip+0xffffffffff7b35d2]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      c8c226:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
      c8c22a:	4c 8b 75 70          	mov    r14,QWORD PTR [rbp+0x70]
      c8c22e:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      c8c232:	4c 89 ef             	mov    rdi,r13
      c8c235:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      c8c23b:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
      c8c23e:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      c8c243:	4c 89 f6             	mov    rsi,r14
      c8c246:	48 89 c2             	mov    rdx,rax
      c8c249:	ff 91 d0 00 00 00    	call   QWORD PTR [rcx+0xd0]
      c8c24f:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]
      c8c256:	00 
      c8c257:	80 4f e0 01          	or     BYTE PTR [rdi-0x20],0x1
      c8c25b:	48 8b 57 d8          	mov    rdx,QWORD PTR [rdi-0x28]
      c8c25f:	f6 c2 01             	test   dl,0x1
      c8c262:	0f 85 d5 05 00 00    	jne    c8c83d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d97dd>
      c8c268:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
      c8c26d:	e8 20 95 ad 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
      c8c272:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      c8c277:	e8 38 14 00 00       	call   c8d6b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1da654>
      c8c27c:	48 8b ac 24 a0 00 00 	mov    rbp,QWORD PTR [rsp+0xa0]
      c8c283:	00 
      c8c284:	48 8b 9c 24 a8 00 00 	mov    rbx,QWORD PTR [rsp+0xa8]
      c8c28b:	00 
      c8c28c:	4c 8d ac 24 30 01 00 	lea    r13,[rsp+0x130]
      c8c293:	00 
      c8c294:	48 39 dd             	cmp    rbp,rbx
      c8c297:	74 74                	je     c8c30d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d92ad>
      c8c299:	4c 8d 25 2a 14 00 00 	lea    r12,[rip+0x142a]        # c8d6ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1da66a>
      c8c2a0:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
      c8c2a5:	4c 89 ef             	mov    rdi,r13
      c8c2a8:	4c 89 fe             	mov    rsi,r15
      c8c2ab:	4c 89 e2             	mov    rdx,r12
      c8c2ae:	e8 23 cc e4 ff       	call   ad8ed6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25e76>
      c8c2b3:	49 89 c6             	mov    r14,rax
      c8c2b6:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
      c8c2ba:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
      c8c2be:	f6 c2 01             	test   dl,0x1
      c8c2c1:	75 38                	jne    c8c2fb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d929b>
      c8c2c3:	49 8d 7e 18          	lea    rdi,[r14+0x18]
      c8c2c7:	48 89 ee             	mov    rsi,rbp
      c8c2ca:	e8 17 95 ad 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      c8c2cf:	41 80 4e 10 02       	or     BYTE PTR [r14+0x10],0x2
      c8c2d4:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
      c8c2d8:	f6 c2 01             	test   dl,0x1
      c8c2db:	75 27                	jne    c8c304 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d92a4>
      c8c2dd:	49 83 c6 20          	add    r14,0x20
      c8c2e1:	48 83 c5 18          	add    rbp,0x18
      c8c2e5:	4c 89 f7             	mov    rdi,r14
      c8c2e8:	48 89 ee             	mov    rsi,rbp
      c8c2eb:	e8 f6 94 ad 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
      c8c2f0:	48 83 c5 18          	add    rbp,0x18
      c8c2f4:	48 39 dd             	cmp    rbp,rbx
      c8c2f7:	75 ac                	jne    c8c2a5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d9245>
      c8c2f9:	eb 12                	jmp    c8c30d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d92ad>

### 0xc93703; FDE=(13183092, 13191889)
Strings: core-mdata | write_video_settings_vary_header | validate_video_settings_vary_header | core-metadata-feature | metadata_max_uri_extensions_per_batch | cache_debug_mode | country_code | catalogue | explicit-content | use_new_garbage_collector | error_backoff_max_seconds | error_backoff_max_entities | errors_until_backoff | online_ttl_min_seconds | logging_user_sampling_rate | logging_average_messages_per_minute | logging_messages_burst_size | gc_initial_delay_seconds | gc_interval_seconds | gc_mark_duration_ms | gc_partial_sweep_cycle_threshold | gc_size_budget_mb | gc_aggressive_max_unmodified_age_hours | extended-metadata/v0/extended-metadata | Content-Type | application/protobuf | Accept | extended-metadata/v3/extensions/batch-get | unknown | impl | expiry | lock
      c936a6:	00 
      c936a7:	e8 d2 63 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      c936ac:	48 8d 35 3e 52 69 ff 	lea    rsi,[rip+0xffffffffff69523e]        # 3288f1 <_ZTSSt12bad_any_cast@@Base-0x678d7>
      c936b3:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c936ba:	00 
      c936bb:	e8 be 63 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      c936c0:	4d 8d 6f 58          	lea    r13,[r15+0x58]
      c936c4:	4c 8d b4 24 a0 01 00 	lea    r14,[rsp+0x1a0]
      c936cb:	00 
      c936cc:	48 8d 9c 24 d0 01 00 	lea    rbx,[rsp+0x1d0]
      c936d3:	00 
      c936d4:	4c 8d a4 24 b8 01 00 	lea    r12,[rsp+0x1b8]
      c936db:	00 
      c936dc:	4c 89 f7             	mov    rdi,r14
      c936df:	48 89 de             	mov    rsi,rbx
      c936e2:	4c 89 e2             	mov    rdx,r12
      c936e5:	e8 7e 63 95 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      c936ea:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c936ed:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c936f0:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      c936f4:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      c936fa:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c936fd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c93700:	6a 01                	push   0x1
      c93702:	5e                   	pop    rsi
      c93703:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      c93709:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      c9370e:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      c93714:	66 0f ef c0          	pxor   xmm0,xmm0
      c93718:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
      c9371d:	4c 89 e7             	mov    rdi,r12
      c93720:	e8 6b a7 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c93725:	48 89 df             	mov    rdi,rbx
      c93728:	e8 63 a7 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c9372d:	48 8d bc 24 60 1f 00 	lea    rdi,[rsp+0x1f60]
      c93734:	00 
      c93735:	e8 56 a7 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c9373a:	48 8d bc 24 b0 0b 00 	lea    rdi,[rsp+0xbb0]
      c93741:	00 
      c93742:	e8 49 a7 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c93747:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      c9374e:	00 
      c9374f:	e8 3c a7 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c93754:	48 8d bc 24 a0 15 00 	lea    rdi,[rsp+0x15a0]
      c9375b:	00 
      c9375c:	e8 2f a7 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c93761:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      c93765:	e8 1c ad e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c9376a:	48 8d 35 af 72 7a ff 	lea    rsi,[rip+0xffffffffff7a72af]        # 43aa20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x62c>
      c93771:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      c93778:	00 
      c93779:	e8 c2 a7 b5 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      c9377e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      c93785:	00 
      c93786:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
      c9378d:	00 
      c9378e:	e8 97 61 95 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
      c93793:	48 8d 35 98 96 6e ff 	lea    rsi,[rip+0xffffffffff6e9698]        # 37ce32 <_ZTSSt12bad_any_cast@@Base-0x13396>
      c9379a:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
      c937a1:	00 
      c937a2:	e8 d7 62 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      c937a7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      c937ae:	00 
      c937af:	48 8d b4 24 88 01 00 	lea    rsi,[rsp+0x188]
      c937b6:	00 
      c937b7:	e8 42 62 95 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
      c937bc:	48 8d 35 5e 5d 7a ff 	lea    rsi,[rip+0xffffffffff7a5d5e]        # 439521 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ef70>
      c937c3:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      c937ca:	00 
      c937cb:	e8 ae 62 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      c937d0:	48 8d 35 1a 51 69 ff 	lea    rsi,[rip+0xffffffffff69511a]        # 3288f1 <_ZTSSt12bad_any_cast@@Base-0x678d7>

### 0xc93870; FDE=(13183092, 13191889)
Strings: core-mdata | write_video_settings_vary_header | validate_video_settings_vary_header | core-metadata-feature | metadata_max_uri_extensions_per_batch | cache_debug_mode | country_code | catalogue | explicit-content | use_new_garbage_collector | error_backoff_max_seconds | error_backoff_max_entities | errors_until_backoff | online_ttl_min_seconds | logging_user_sampling_rate | logging_average_messages_per_minute | logging_messages_burst_size | gc_initial_delay_seconds | gc_interval_seconds | gc_mark_duration_ms | gc_partial_sweep_cycle_threshold | gc_size_budget_mb | gc_aggressive_max_unmodified_age_hours | extended-metadata/v0/extended-metadata | Content-Type | application/protobuf | Accept | extended-metadata/v3/extensions/batch-get | unknown | impl | expiry | lock
      c93810:	e8 69 62 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      c93815:	48 8d 35 d5 50 69 ff 	lea    rsi,[rip+0xffffffffff6950d5]        # 3288f1 <_ZTSSt12bad_any_cast@@Base-0x678d7>
      c9381c:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
      c93823:	00 
      c93824:	e8 55 62 de ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      c93829:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
      c93830:	00 
      c93831:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
      c93838:	00 
      c93839:	48 8d 9c 24 40 01 00 	lea    rbx,[rsp+0x140]
      c93840:	00 
      c93841:	4c 8d a4 24 28 01 00 	lea    r12,[rsp+0x128]
      c93848:	00 
      c93849:	4c 89 f7             	mov    rdi,r14
      c9384c:	48 89 de             	mov    rsi,rbx
      c9384f:	4c 89 e2             	mov    rdx,r12
      c93852:	e8 11 62 95 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      c93857:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c9385a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c9385d:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      c93861:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      c93867:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      c9386a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c9386d:	6a 01                	push   0x1
      c9386f:	5e                   	pop    rsi
      c93870:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      c93876:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      c9387b:	f3 41 0f 7f 47 68    	movdqu XMMWORD PTR [r15+0x68],xmm0
      c93881:	66 0f ef c0          	pxor   xmm0,xmm0
      c93885:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
      c9388a:	4c 89 e7             	mov    rdi,r12
      c9388d:	e8 fe a5 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c93892:	48 89 df             	mov    rdi,rbx
      c93895:	e8 f6 a5 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c9389a:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
      c938a1:	00 
      c938a2:	e8 e9 a5 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c938a7:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      c938ae:	00 
      c938af:	e8 dc a5 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c938b4:	48 8d bc 24 88 01 00 	lea    rdi,[rsp+0x188]
      c938bb:	00 
      c938bc:	e8 cf a5 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c938c1:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      c938c8:	00 
      c938c9:	e8 c2 a5 b5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      c938ce:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      c938d2:	e8 af ab e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c938d7:	49 8d 5f 78          	lea    rbx,[r15+0x78]
      c938db:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
      c938df:	48 89 df             	mov    rdi,rbx
      c938e2:	e8 6b 37 00 00       	call   c97052 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e3ff2>
      c938e7:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
      c938ec:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      c938f0:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      c938f5:	49 8b 6f 30          	mov    rbp,QWORD PTR [r15+0x30]
      c938f9:	4d 8b 67 78          	mov    r12,QWORD PTR [r15+0x78]
      c938fd:	4d 8b 6f 40          	mov    r13,QWORD PTR [r15+0x40]
      c93901:	6a 78                	push   0x78
      c93903:	5f                   	pop    rdi
      c93904:	e8 f7 a5 b5 00       	call   17edf00 <_Znwm@plt>
      c93909:	48 89 c3             	mov    rbx,rax
      c9390c:	66 0f ef c0          	pxor   xmm0,xmm0
      c93910:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      c93915:	48 8d 05 d4 a3 b8 00 	lea    rax,[rip+0xb8a3d4]        # 181dcf0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x139b0>
      c9391c:	48 89 03             	mov    QWORD PTR [rbx],rax
      c9391f:	49 89 de             	mov    r14,rbx
      c93922:	49 83 c6 18          	add    r14,0x18
      c93926:	4c 89 f7             	mov    rdi,r14
      c93929:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      c9392d:	48 89 ea             	mov    rdx,rbp

### 0xcaebc9; FDE=(13298280, 13299996)
      caeb63:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      caeb68:	4c 89 e6             	mov    rsi,r12
      caeb6b:	e8 36 07 00 00       	call   caf2a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc246>
      caeb70:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      caeb75:	48 8b 4c 24 58       	mov    rcx,QWORD PTR [rsp+0x58]
      caeb7a:	48 39 c8             	cmp    rax,rcx
      caeb7d:	74 7b                	je     caebfa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fbb9a>
      caeb7f:	c6 84 24 08 01 00 00 	mov    BYTE PTR [rsp+0x108],0x0
      caeb86:	00 
      caeb87:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
      caeb8e:	00 
      caeb8f:	48 89 8c 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rcx
      caeb96:	00 
      caeb97:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      caeb9c:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
      caeba2:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
      caeba9:	00 
      caebaa:	0f 57 c0             	xorps  xmm0,xmm0
      caebad:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      caebb2:	c6 84 24 28 01 00 00 	mov    BYTE PTR [rsp+0x128],0x1
      caebb9:	01 
      caebba:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      caebbe:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      caebc5:	00 
      caebc6:	4c 89 e6             	mov    rsi,r12
      caebc9:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      caebcf:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      caebd6:	00 
      caebd7:	48 89 ee             	mov    rsi,rbp
      caebda:	e8 c9 07 00 00       	call   caf3a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc348>
      caebdf:	48 89 c7             	mov    rdi,rax
      caebe2:	4c 8d b4 24 08 01 00 	lea    r14,[rsp+0x108]
      caebe9:	00 
      caebea:	4c 89 f6             	mov    rsi,r14
      caebed:	e8 70 0c 00 00       	call   caf862 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc802>
      caebf2:	4c 89 f7             	mov    rdi,r14
      caebf5:	e8 c2 0c 00 00       	call   caf8bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc85c>
      caebfa:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      caebff:	e8 de 0c 00 00       	call   caf8e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc882>
      caec04:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      caec09:	e8 78 f8 de ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      caec0e:	48 89 ef             	mov    rdi,rbp
      caec11:	e8 7a f2 b3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      caec16:	4d 89 ee             	mov    r14,r13
      caec19:	49 83 c6 58          	add    r14,0x58
      caec1d:	4d 39 fe             	cmp    r14,r15
      caec20:	0f 85 c5 fe ff ff    	jne    caeaeb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fba8b>
      caec26:	48 83 bc 24 b8 00 00 	cmp    QWORD PTR [rsp+0xb8],0x0
      caec2d:	00 00 
      caec2f:	0f 84 8f 00 00 00    	je     caecc4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fbc64>
      caec35:	49 89 dc             	mov    r12,rbx
      caec38:	b3 01                	mov    bl,0x1
      caec3a:	4c 8d b4 24 10 01 00 	lea    r14,[rsp+0x110]
      caec41:	00 
      caec42:	41 88 5e f8          	mov    BYTE PTR [r14-0x8],bl
      caec46:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
      caec4d:	00 
      caec4e:	4c 89 f7             	mov    rdi,r14
      caec51:	e8 e6 03 e9 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
      caec56:	41 8a 46 f8          	mov    al,BYTE PTR [r14-0x8]
      caec5a:	4c 8d bc 24 d8 00 00 	lea    r15,[rsp+0xd8]
      caec61:	00 
      caec62:	41 88 47 f8          	mov    BYTE PTR [r15-0x8],al
      caec66:	4c 89 ff             	mov    rdi,r15
      caec69:	4c 89 f6             	mov    rsi,r14
      caec6c:	e8 cb 03 e9 ff       	call   b3f03c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfdc>
      caec71:	41 88 5f 28          	mov    BYTE PTR [r15+0x28],bl
      caec75:	4c 89 e3             	mov    rbx,r12
      caec78:	4c 89 f7             	mov    rdi,r14
      caec7b:	e8 64 fd ff ff       	call   cae9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fb984>
      caec80:	eb 52                	jmp    caecd4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fbc74>

### 0xcb1685; FDE=(13308856, 13309942)
Strings: unknown
      cb1623:	e9 b8 00 00 00       	jmp    cb16e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe680>
      cb1628:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      cb162c:	4c 89 ef             	mov    rdi,r13
      cb162f:	ff 50 30             	call   QWORD PTR [rax+0x30]
      cb1632:	84 c0                	test   al,al
      cb1634:	74 05                	je     cb163b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe5db>
      cb1636:	41 b7 01             	mov    r15b,0x1
      cb1639:	eb 7c                	jmp    cb16b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe657>
      cb163b:	c6 44 24 58 00       	mov    BYTE PTR [rsp+0x58],0x0
      cb1640:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cb1645:	4c 89 ee             	mov    rsi,r13
      cb1648:	e8 59 dc ff ff       	call   caf2a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc246>
      cb164d:	48 8d 6c 24 60       	lea    rbp,[rsp+0x60]
      cb1652:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
      cb1657:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
      cb165b:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      cb1660:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
      cb1664:	0f 57 c0             	xorps  xmm0,xmm0
      cb1667:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
      cb166d:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      cb1672:	c6 45 18 01          	mov    BYTE PTR [rbp+0x18],0x1
      cb1676:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      cb167d:	00 
      cb167e:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      cb1682:	4c 89 ee             	mov    rsi,r13
      cb1685:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      cb168b:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
      cb1692:	4c 8d 74 24 58       	lea    r14,[rsp+0x58]
      cb1697:	4c 89 f6             	mov    rsi,r14
      cb169a:	e8 5f 01 00 00       	call   cb17fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe79e>
      cb169f:	4c 89 f7             	mov    rdi,r14
      cb16a2:	e8 15 e2 ff ff       	call   caf8bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc85c>
      cb16a7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      cb16ac:	e8 31 e2 ff ff       	call   caf8e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc882>
      cb16b1:	41 b6 01             	mov    r14b,0x1
      cb16b4:	45 31 ff             	xor    r15d,r15d
      cb16b7:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      cb16bc:	e8 c5 cd de ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      cb16c1:	45 84 ff             	test   r15b,r15b
      cb16c4:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      cb16c9:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      cb16ce:	74 03                	je     cb16d3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe673>
      cb16d0:	45 31 f6             	xor    r14d,r14d
      cb16d3:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      cb16da:	00 
      cb16db:	e8 4e 3c a1 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      cb16e0:	4c 89 ff             	mov    rdi,r15
      cb16e3:	e8 56 6c eb ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
      cb16e8:	84 c0                	test   al,al
      cb16ea:	75 7d                	jne    cb1769 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe709>
      cb16ec:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
      cb16f3:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
      cb16fa:	00 
      cb16fb:	4c 89 26             	mov    QWORD PTR [rsi],r12
      cb16fe:	48 89 da             	mov    rdx,rbx
      cb1701:	e8 06 01 00 00       	call   cb180c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe7ac>
      cb1706:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      cb170a:	4c 89 e7             	mov    rdi,r12
      cb170d:	ff 50 30             	call   QWORD PTR [rax+0x30]
      cb1710:	89 c5                	mov    ebp,eax
      cb1712:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
      cb1716:	49 83 c5 18          	add    r13,0x18
      cb171a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cb171d:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      cb1722:	4c 89 ea             	mov    rdx,r13
      cb1725:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      cb172b:	4c 89 ff             	mov    rdi,r15
      cb172e:	e8 0b 6c eb ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
      cb1733:	40 08 c5             	or     bpl,al
      cb1736:	75 31                	jne    cb1769 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe709>
      cb1738:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]

### 0xcb1aea; FDE=(13310306, 13310838)
      cb1a72:	41 c6 06 02          	mov    BYTE PTR [r14],0x2
      cb1a76:	e9 6b ff ff ff       	jmp    cb19e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe986>
      cb1a7b:	48 8b bb d0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xd0]
      cb1a82:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cb1a85:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      cb1a8b:	48 8b 93 d0 00 00 00 	mov    rdx,QWORD PTR [rbx+0xd0]
      cb1a92:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      cb1a97:	48 89 c6             	mov    rsi,rax
      cb1a9a:	e8 eb 0c 00 00       	call   cb278a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ff72a>
      cb1a9f:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
      cb1aa4:	48 8b b3 d0 00 00 00 	mov    rsi,QWORD PTR [rbx+0xd0]
      cb1aab:	48 89 e7             	mov    rdi,rsp
      cb1aae:	e8 f3 d7 ff ff       	call   caf2a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc246>
      cb1ab3:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      cb1ab8:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      cb1abc:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      cb1ac0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      cb1ac5:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      cb1ac9:	0f 57 c0             	xorps  xmm0,xmm0
      cb1acc:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      cb1ad0:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
      cb1ad6:	41 c6 46 18 01       	mov    BYTE PTR [r14+0x18],0x1
      cb1adb:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      cb1ae0:	48 8b b3 d0 00 00 00 	mov    rsi,QWORD PTR [rbx+0xd0]
      cb1ae7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cb1aea:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      cb1af0:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
      cb1af7:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
      cb1afc:	4c 89 f6             	mov    rsi,r14
      cb1aff:	e8 fa fc ff ff       	call   cb17fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe79e>
      cb1b04:	4c 89 f7             	mov    rdi,r14
      cb1b07:	e8 b0 dd ff ff       	call   caf8bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc85c>
      cb1b0c:	48 89 e7             	mov    rdi,rsp
      cb1b0f:	e8 ce dd ff ff       	call   caf8e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc882>
      cb1b14:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      cb1b19:	e8 58 00 00 00       	call   cb1b76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb16>
      cb1b1e:	e9 f2 fe ff ff       	jmp    cb1a15 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe9b5>
      cb1b23:	48 89 c3             	mov    rbx,rax
      cb1b26:	4c 89 f7             	mov    rdi,r14
      cb1b29:	e8 a8 dd ff ff       	call   caf8d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc876>
      cb1b2e:	48 89 e7             	mov    rdi,rsp
      cb1b31:	e8 ac dd ff ff       	call   caf8e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fc882>
      cb1b36:	eb 03                	jmp    cb1b3b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feadb>
      cb1b38:	48 89 c3             	mov    rbx,rax
      cb1b3b:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      cb1b40:	e8 31 00 00 00       	call   cb1b76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb16>
      cb1b45:	eb 05                	jmp    cb1b4c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feaec>
      cb1b47:	eb 00                	jmp    cb1b49 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feae9>
      cb1b49:	48 89 c3             	mov    rbx,rax
      cb1b4c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      cb1b51:	e8 30 c9 de ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      cb1b56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cb1b5d:	00 00 
      cb1b5f:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
      cb1b66:	00 
      cb1b67:	75 08                	jne    cb1b71 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb11>
      cb1b69:	48 89 df             	mov    rdi,rbx
      cb1b6c:	e8 5f e1 db ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cb1b71:	e8 3a df b3 00       	call   17efab0 <__stack_chk_fail@plt>
      cb1b76:	53                   	push   rbx
      cb1b77:	48 89 fb             	mov    rbx,rdi
      cb1b7a:	48 8d 05 4f cc b6 00 	lea    rax,[rip+0xb6cc4f]        # 181e7d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14490>
      cb1b81:	48 89 07             	mov    QWORD PTR [rdi],rax
      cb1b84:	80 bf 90 00 00 00 00 	cmp    BYTE PTR [rdi+0x90],0x0
      cb1b8b:	74 09                	je     cb1b96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1feb36>
      cb1b8d:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
      cb1b91:	e8 92 9b dc ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      cb1b96:	48 83 c3 08          	add    rbx,0x8
      cb1b9a:	48 89 df             	mov    rdi,rbx
      cb1b9d:	5b                   	pop    rbx
      cb1b9e:	e9 8b 37 a1 00       	jmp    16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>

### 0xcc502b; FDE=(13389788, 13390625)
Strings: Setting playback speed to %d percent (playback_id %s) from %d percent | set-playback-speed
      cc4fd1:	e8 fa ac da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc4fd6:	e8 d5 aa b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc4fdb:	cc                   	int3
      cc4fdc:	55                   	push   rbp
      cc4fdd:	41 57                	push   r15
      cc4fdf:	41 56                	push   r14
      cc4fe1:	41 54                	push   r12
      cc4fe3:	53                   	push   rbx
      cc4fe4:	48 81 ec 40 03 00 00 	sub    rsp,0x340
      cc4feb:	49 89 fe             	mov    r14,rdi
      cc4fee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc4ff5:	00 00 
      cc4ff7:	48 89 84 24 38 03 00 	mov    QWORD PTR [rsp+0x338],rax
      cc4ffe:	00 
      cc4fff:	48 8b bf e0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5e0]
      cc5006:	48 85 ff             	test   rdi,rdi
      cc5009:	0f 95 c0             	setne  al
      cc500c:	66 0f 57 c9          	xorpd  xmm1,xmm1
      cc5010:	66 0f 2e c8          	ucomisd xmm1,xmm0
      cc5014:	0f 92 c3             	setb   bl
      cc5017:	20 c3                	and    bl,al
      cc5019:	80 fb 01             	cmp    bl,0x1
      cc501c:	0f 85 46 02 00 00    	jne    cc5268 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212208>
      cc5022:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5025:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
      cc502b:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      cc5031:	66 0f 29 44 24 10    	movapd XMMWORD PTR [rsp+0x10],xmm0
      cc5037:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
      cc503d:	f2 0f 59 05 03 a1 6c 	mulsd  xmm0,QWORD PTR [rip+0xffffffffff6ca103]        # 38f148 <_ZTSSt12bad_any_cast@@Base-0x1080>
      cc5044:	ff 
      cc5045:	f2 44 0f 2c f8       	cvttsd2si r15d,xmm0
      cc504a:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc5051:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5054:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc505a:	48 8d b4 24 d8 01 00 	lea    rsi,[rsp+0x1d8]
      cc5061:	00 
      cc5062:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc5065:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc5069:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      cc506e:	4c 89 e7             	mov    rdi,r12
      cc5071:	e8 aa f2 ec ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
      cc5076:	f2 0f 10 05 ca a0 6c 	movsd  xmm0,QWORD PTR [rip+0xffffffffff6ca0ca]        # 38f148 <_ZTSSt12bad_any_cast@@Base-0x1080>
      cc507d:	ff 
      cc507e:	f2 0f 59 44 24 10    	mulsd  xmm0,QWORD PTR [rsp+0x10]
      cc5084:	f2 0f 2c c0          	cvttsd2si eax,xmm0
      cc5088:	89 04 24             	mov    DWORD PTR [rsp],eax
      cc508b:	48 8d 35 ea ce 78 ff 	lea    rsi,[rip+0xffffffffff78ceea]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc5092:	48 8d 0d 42 11 68 ff 	lea    rcx,[rip+0xffffffffff681142]        # 3461db <_ZTSSt12bad_any_cast@@Base-0x49fed>
      cc5099:	31 ed                	xor    ebp,ebp
      cc509b:	6a 04                	push   0x4
      cc509d:	5f                   	pop    rdi
      cc509e:	ba ac 05 00 00       	mov    edx,0x5ac
      cc50a3:	45 89 f8             	mov    r8d,r15d
      cc50a6:	4d 89 e1             	mov    r9,r12
      cc50a9:	31 c0                	xor    eax,eax
      cc50ab:	e8 22 18 b1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc50b0:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
      cc50b6:	66 0f 28 4c 24 10    	movapd xmm1,XMMWORD PTR [rsp+0x10]
      cc50bc:	f2 0f 5c c8          	subsd  xmm1,xmm0
      cc50c0:	66 0f 54 0d f8 77 6c 	andpd  xmm1,XMMWORD PTR [rip+0xffffffffff6c77f8]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
      cc50c7:	ff 
      cc50c8:	66 0f 28 d1          	movapd xmm2,xmm1
      cc50cc:	f2 0f 10 0d 74 9d 6c 	movsd  xmm1,QWORD PTR [rip+0xffffffffff6c9d74]        # 38ee48 <_ZTSSt12bad_any_cast@@Base-0x1380>
      cc50d3:	ff 
      cc50d4:	66 0f 2e ca          	ucomisd xmm1,xmm2
      cc50d8:	0f 87 8a 01 00 00    	ja     cc5268 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212208>
      cc50de:	4d 8b be e8 05 00 00 	mov    r15,QWORD PTR [r14+0x5e8]
      cc50e5:	4d 85 ff             	test   r15,r15
      cc50e8:	74 2d                	je     cc5117 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2120b7>
      cc50ea:	41 80 be 90 07 00 00 	cmp    BYTE PTR [r14+0x790],0x0
      cc50f1:	00 

### 0xcc50fa; FDE=(13389788, 13390625)
Strings: Setting playback speed to %d percent (playback_id %s) from %d percent | set-playback-speed
      cc509b:	6a 04                	push   0x4
      cc509d:	5f                   	pop    rdi
      cc509e:	ba ac 05 00 00       	mov    edx,0x5ac
      cc50a3:	45 89 f8             	mov    r8d,r15d
      cc50a6:	4d 89 e1             	mov    r9,r12
      cc50a9:	31 c0                	xor    eax,eax
      cc50ab:	e8 22 18 b1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc50b0:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
      cc50b6:	66 0f 28 4c 24 10    	movapd xmm1,XMMWORD PTR [rsp+0x10]
      cc50bc:	f2 0f 5c c8          	subsd  xmm1,xmm0
      cc50c0:	66 0f 54 0d f8 77 6c 	andpd  xmm1,XMMWORD PTR [rip+0xffffffffff6c77f8]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
      cc50c7:	ff 
      cc50c8:	66 0f 28 d1          	movapd xmm2,xmm1
      cc50cc:	f2 0f 10 0d 74 9d 6c 	movsd  xmm1,QWORD PTR [rip+0xffffffffff6c9d74]        # 38ee48 <_ZTSSt12bad_any_cast@@Base-0x1380>
      cc50d3:	ff 
      cc50d4:	66 0f 2e ca          	ucomisd xmm1,xmm2
      cc50d8:	0f 87 8a 01 00 00    	ja     cc5268 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212208>
      cc50de:	4d 8b be e8 05 00 00 	mov    r15,QWORD PTR [r14+0x5e8]
      cc50e5:	4d 85 ff             	test   r15,r15
      cc50e8:	74 2d                	je     cc5117 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2120b7>
      cc50ea:	41 80 be 90 07 00 00 	cmp    BYTE PTR [r14+0x790],0x0
      cc50f1:	00 
      cc50f2:	74 23                	je     cc5117 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2120b7>
      cc50f4:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cc50f7:	4c 89 ff             	mov    rdi,r15
      cc50fa:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      cc5100:	49 8b 07             	mov    rax,QWORD PTR [r15]
      cc5103:	4c 89 ff             	mov    rdi,r15
      cc5106:	31 f6                	xor    esi,esi
      cc5108:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      cc510e:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
      cc5114:	6a 01                	push   0x1
      cc5116:	5d                   	pop    rbp
      cc5117:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc511e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5121:	89 ee                	mov    esi,ebp
      cc5123:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      cc5129:	49 8b be 30 06 00 00 	mov    rdi,QWORD PTR [r14+0x630]
      cc5130:	48 85 ff             	test   rdi,rdi
      cc5133:	74 05                	je     cc513a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2120da>
      cc5135:	e8 4e 87 02 00       	call   ced888 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x23a828>
      cc513a:	49 8b b6 e0 05 00 00 	mov    rsi,QWORD PTR [r14+0x5e0]
      cc5141:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      cc5144:	4c 8d bc 24 d8 01 00 	lea    r15,[rsp+0x1d8]
      cc514b:	00 
      cc514c:	6a ff                	push   0xffffffffffffffff
      cc514e:	5a                   	pop    rdx
      cc514f:	4c 89 ff             	mov    rdi,r15
      cc5152:	ff 90 50 01 00 00    	call   QWORD PTR [rax+0x150]
      cc5158:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      cc515d:	4c 89 fe             	mov    rsi,r15
      cc5160:	e8 75 c9 ff ff       	call   cc1ada <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20ea7a>
      cc5165:	49 8d be d8 04 00 00 	lea    rdi,[r14+0x4d8]
      cc516c:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      cc5171:	e8 c0 06 00 00       	call   cc5836 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127d6>
      cc5176:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      cc517b:	e8 fa ab f0 ff       	call   bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
      cc5180:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
      cc5185:	4c 89 ff             	mov    rdi,r15
      cc5188:	e8 a1 06 00 00       	call   cc582e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2127ce>
      cc518d:	41 80 4f 10 01       	or     BYTE PTR [r15+0x10],0x1
      cc5192:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      cc5199:	00 
      cc519a:	48 8b 57 f0          	mov    rdx,QWORD PTR [rdi-0x10]
      cc519e:	f6 c2 01             	test   dl,0x1
      cc51a1:	0f 85 ea 00 00 00    	jne    cc5291 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x212231>
      cc51a7:	48 8d 35 1e 45 68 ff 	lea    rsi,[rip+0xffffffffff68451e]        # 3496cc <_ZTSSt12bad_any_cast@@Base-0x46afc>
      cc51ae:	e8 9f 0b e4 ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
      cc51b3:	49 8b be e0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5e0]
      cc51ba:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc51bd:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]

### 0xcc536f; FDE=(13390626, 13391260)
Strings: Setting prepared track playback speed to %d percent (playback_id %s) from %d percent | set-playback-speed
      cc5314:	48 89 df             	mov    rdi,rbx
      cc5317:	e8 b4 a9 da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      cc531c:	e8 8f a7 b2 00       	call   17efab0 <__stack_chk_fail@plt>
      cc5321:	cc                   	int3
      cc5322:	55                   	push   rbp
      cc5323:	41 57                	push   r15
      cc5325:	41 56                	push   r14
      cc5327:	53                   	push   rbx
      cc5328:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
      cc532f:	49 89 fe             	mov    r14,rdi
      cc5332:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cc5339:	00 00 
      cc533b:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      cc5342:	00 
      cc5343:	48 8b bf f0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5f0]
      cc534a:	48 85 ff             	test   rdi,rdi
      cc534d:	0f 95 c0             	setne  al
      cc5350:	66 0f 57 c9          	xorpd  xmm1,xmm1
      cc5354:	66 0f 2e c8          	ucomisd xmm1,xmm0
      cc5358:	0f 92 c3             	setb   bl
      cc535b:	20 c3                	and    bl,al
      cc535d:	80 fb 01             	cmp    bl,0x1
      cc5360:	0f 85 a4 01 00 00    	jne    cc550a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2124aa>
      cc5366:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5369:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
      cc536f:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      cc5375:	66 0f 29 44 24 10    	movapd XMMWORD PTR [rsp+0x10],xmm0
      cc537b:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
      cc5381:	f2 0f 59 05 bf 9d 6c 	mulsd  xmm0,QWORD PTR [rip+0xffffffffff6c9dbf]        # 38f148 <_ZTSSt12bad_any_cast@@Base-0x1080>
      cc5388:	ff 
      cc5389:	f2 0f 2c e8          	cvttsd2si ebp,xmm0
      cc538d:	49 8b be f0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5f0]
      cc5394:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5397:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      cc539d:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      cc53a2:	48 89 06             	mov    QWORD PTR [rsi],rax
      cc53a5:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
      cc53a9:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]
      cc53ae:	4c 89 ff             	mov    rdi,r15
      cc53b1:	e8 6a ef ec ff       	call   b94320 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe12c0>
      cc53b6:	f2 0f 10 05 8a 9d 6c 	movsd  xmm0,QWORD PTR [rip+0xffffffffff6c9d8a]        # 38f148 <_ZTSSt12bad_any_cast@@Base-0x1080>
      cc53bd:	ff 
      cc53be:	f2 0f 59 44 24 10    	mulsd  xmm0,QWORD PTR [rsp+0x10]
      cc53c4:	f2 0f 2c c0          	cvttsd2si eax,xmm0
      cc53c8:	89 04 24             	mov    DWORD PTR [rsp],eax
      cc53cb:	48 8d 35 aa cb 78 ff 	lea    rsi,[rip+0xffffffffff78cbaa]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      cc53d2:	48 8d 0d 5f 6e 69 ff 	lea    rcx,[rip+0xffffffffff696e5f]        # 35c238 <_ZTSSt12bad_any_cast@@Base-0x33f90>
      cc53d9:	6a 04                	push   0x4
      cc53db:	5f                   	pop    rdi
      cc53dc:	ba 8e 05 00 00       	mov    edx,0x58e
      cc53e1:	41 89 e8             	mov    r8d,ebp
      cc53e4:	4d 89 f9             	mov    r9,r15
      cc53e7:	31 c0                	xor    eax,eax
      cc53e9:	e8 e4 14 b1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      cc53ee:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
      cc53f4:	66 0f 28 4c 24 10    	movapd xmm1,XMMWORD PTR [rsp+0x10]
      cc53fa:	f2 0f 5c c8          	subsd  xmm1,xmm0
      cc53fe:	66 0f 54 0d ba 74 6c 	andpd  xmm1,XMMWORD PTR [rip+0xffffffffff6c74ba]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
      cc5405:	ff 
      cc5406:	66 0f 28 d1          	movapd xmm2,xmm1
      cc540a:	f2 0f 10 0d 36 9a 6c 	movsd  xmm1,QWORD PTR [rip+0xffffffffff6c9a36]        # 38ee48 <_ZTSSt12bad_any_cast@@Base-0x1380>
      cc5411:	ff 
      cc5412:	66 0f 2e ca          	ucomisd xmm1,xmm2
      cc5416:	0f 87 ee 00 00 00    	ja     cc550a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2124aa>
      cc541c:	49 8b be f0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5f0]
      cc5423:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc5426:	6a 02                	push   0x2
      cc5428:	5e                   	pop    rsi
      cc5429:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      cc542f:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]
      cc5434:	4c 89 ff             	mov    rdi,r15

### 0xcdf602; FDE=(13496492, 13498111)
Strings: local | none | fileid | url
      cdf598:	4c 89 ff             	mov    rdi,r15
      cdf59b:	e8 2c f2 db ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      cdf5a0:	41 8b 86 28 05 00 00 	mov    eax,DWORD PTR [r14+0x528]
      cdf5a7:	89 83 5c 01 00 00    	mov    DWORD PTR [rbx+0x15c],eax
      cdf5ad:	40 f6 c5 04          	test   bpl,0x4
      cdf5b1:	0f 84 81 00 00 00    	je     cdf638 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c5d8>
      cdf5b7:	4c 89 f7             	mov    rdi,r14
      cdf5ba:	e8 95 36 00 00       	call   ce2c54 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fbf4>
      cdf5bf:	f2 0f 11 83 30 01 00 	movsd  QWORD PTR [rbx+0x130],xmm0
      cdf5c6:	00 
      cdf5c7:	f3 41 0f 10 86 28 15 	movss  xmm0,DWORD PTR [r14+0x1528]
      cdf5ce:	00 00 
      cdf5d0:	f3 0f 11 83 38 01 00 	movss  DWORD PTR [rbx+0x138],xmm0
      cdf5d7:	00 
      cdf5d8:	41 83 be 88 04 00 00 	cmp    DWORD PTR [r14+0x488],0x3f
      cdf5df:	3f 
      cdf5e0:	75 11                	jne    cdf5f3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c593>
      cdf5e2:	f3 41 0f 58 86 2c 15 	addss  xmm0,DWORD PTR [r14+0x152c]
      cdf5e9:	00 00 
      cdf5eb:	f3 0f 11 83 38 01 00 	movss  DWORD PTR [rbx+0x138],xmm0
      cdf5f2:	00 
      cdf5f3:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
      cdf5fa:	48 85 ff             	test   rdi,rdi
      cdf5fd:	74 19                	je     cdf618 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c5b8>
      cdf5ff:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cdf602:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      cdf608:	48 89 c1             	mov    rcx,rax
      cdf60b:	48 c1 e9 08          	shr    rcx,0x8
      cdf60f:	48 89 c2             	mov    rdx,rax
      cdf612:	48 c1 ea 20          	shr    rdx,0x20
      cdf616:	eb 04                	jmp    cdf61c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c5bc>
      cdf618:	31 d2                	xor    edx,edx
      cdf61a:	31 c0                	xor    eax,eax
      cdf61c:	88 83 3c 01 00 00    	mov    BYTE PTR [rbx+0x13c],al
      cdf622:	66 89 8b 3d 01 00 00 	mov    WORD PTR [rbx+0x13d],cx
      cdf629:	c1 e9 10             	shr    ecx,0x10
      cdf62c:	88 8b 3f 01 00 00    	mov    BYTE PTR [rbx+0x13f],cl
      cdf632:	88 93 40 01 00 00    	mov    BYTE PTR [rbx+0x140],dl
      cdf638:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      cdf63f:	00 00 
      cdf641:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
      cdf646:	0f 85 ae 00 00 00    	jne    cdf6fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c69a>
      cdf64c:	48 89 d8             	mov    rax,rbx
      cdf64f:	48 83 c4 68          	add    rsp,0x68
      cdf653:	5b                   	pop    rbx
      cdf654:	41 5c                	pop    r12
      cdf656:	41 5d                	pop    r13
      cdf658:	41 5e                	pop    r14
      cdf65a:	41 5f                	pop    r15
      cdf65c:	5d                   	pop    rbp
      cdf65d:	c3                   	ret
      cdf65e:	49 8b be 28 04 00 00 	mov    rdi,QWORD PTR [r14+0x428]
      cdf665:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cdf668:	ff 50 30             	call   QWORD PTR [rax+0x30]
      cdf66b:	49 89 c7             	mov    r15,rax
      cdf66e:	83 b8 80 00 00 00 04 	cmp    DWORD PTR [rax+0x80],0x4
      cdf675:	0f 85 3b fc ff ff    	jne    cdf2b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c256>
      cdf67b:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
      cdf682:	48 8d 35 8f d8 75 ff 	lea    rsi,[rip+0xffffffffff75d88f]        # 43cf18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2b24>
      cdf689:	e8 f2 e8 b0 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
      cdf68e:	49 83 c7 18          	add    r15,0x18
      cdf692:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
      cdf699:	4c 89 fe             	mov    rsi,r15
      cdf69c:	e8 df e9 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cdf6a1:	49 8d b6 20 1e 00 00 	lea    rsi,[r14+0x1e20]
      cdf6a8:	48 8d bb f8 00 00 00 	lea    rdi,[rbx+0xf8]
      cdf6af:	e8 cc e9 b0 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
      cdf6b4:	e9 fd fb ff ff       	jmp    cdf2b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c256>
      cdf6b9:	eb 1c                	jmp    cdf6d7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c677>
      cdf6bb:	eb 1a                	jmp    cdf6d7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c677>
      cdf6bd:	eb 18                	jmp    cdf6d7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c677>

### 0xd0b3df; FDE=(13677476, 13677724)
      d0b393:	cc                   	int3
      d0b394:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      d0b397:	48 83 c7 10          	add    rdi,0x10
      d0b39b:	6a 04                	push   0x4
      d0b39d:	5e                   	pop    rsi
      d0b39e:	e9 09 01 00 00       	jmp    d0b4ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25844c>
      d0b3a3:	cc                   	int3
      d0b3a4:	55                   	push   rbp
      d0b3a5:	41 57                	push   r15
      d0b3a7:	41 56                	push   r14
      d0b3a9:	41 55                	push   r13
      d0b3ab:	41 54                	push   r12
      d0b3ad:	53                   	push   rbx
      d0b3ae:	48 81 ec 88 00 00 00 	sub    rsp,0x88
      d0b3b5:	49 89 f6             	mov    r14,rsi
      d0b3b8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d0b3bf:	00 00 
      d0b3c1:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
      d0b3c8:	00 
      d0b3c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d0b3cc:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      d0b3d0:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
      d0b3d4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d0b3d7:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      d0b3dc:	4c 89 ff             	mov    rdi,r15
      d0b3df:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d0b3e5:	4d 8b 2f             	mov    r13,QWORD PTR [r15]
      d0b3e8:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
      d0b3ec:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
      d0b3f1:	6a 03                	push   0x3
      d0b3f3:	5d                   	pop    rbp
      d0b3f4:	49 39 dd             	cmp    r13,rbx
      d0b3f7:	74 45                	je     d0b43e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2583de>
      d0b3f9:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
      d0b3fd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d0b400:	4c 89 ff             	mov    rdi,r15
      d0b403:	31 d2                	xor    edx,edx
      d0b405:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d0b408:	83 64 24 78 00       	and    DWORD PTR [rsp+0x78],0x0
      d0b40d:	4c 89 f7             	mov    rdi,r14
      d0b410:	4c 89 fe             	mov    rsi,r15
      d0b413:	89 ea                	mov    edx,ebp
      d0b415:	e8 30 35 8d 00       	call   15de94a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x423ece>
      d0b41a:	41 89 c4             	mov    r12d,eax
      d0b41d:	4c 89 ff             	mov    rdi,r15
      d0b420:	e8 09 9f 9b 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d0b425:	49 83 c5 10          	add    r13,0x10
      d0b429:	45 84 e4             	test   r12b,r12b
      d0b42c:	74 c6                	je     d0b3f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258394>
      d0b42e:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      d0b432:	48 83 c7 10          	add    rdi,0x10
      d0b436:	6a 03                	push   0x3
      d0b438:	5e                   	pop    rsi
      d0b439:	e8 6e 00 00 00       	call   d0b4ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25844c>
      d0b43e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d0b443:	e8 0e c1 da ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
      d0b448:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d0b44f:	00 00 
      d0b451:	48 3b 84 24 80 00 00 	cmp    rax,QWORD PTR [rsp+0x80]
      d0b458:	00 
      d0b459:	75 3c                	jne    d0b497 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258437>
      d0b45b:	48 81 c4 88 00 00 00 	add    rsp,0x88
      d0b462:	5b                   	pop    rbx
      d0b463:	41 5c                	pop    r12
      d0b465:	41 5d                	pop    r13
      d0b467:	41 5e                	pop    r14
      d0b469:	41 5f                	pop    r15
      d0b46b:	5d                   	pop    rbp
      d0b46c:	c3                   	ret
      d0b46d:	eb 00                	jmp    d0b46f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25840f>
      d0b46f:	48 89 c3             	mov    rbx,rax

### 0xd0b6b4; FDE=(13678214, 13678425)
      d0b666:	48 83 c3 10          	add    rbx,0x10
      d0b66a:	48 89 df             	mov    rdi,rbx
      d0b66d:	5b                   	pop    rbx
      d0b66e:	e9 f3 e7 ac 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d0b673:	cc                   	int3
      d0b674:	53                   	push   rbx
      d0b675:	48 89 fb             	mov    rbx,rdi
      d0b678:	e8 99 ff ff ff       	call   d0b616 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2585b6>
      d0b67d:	48 89 df             	mov    rdi,rbx
      d0b680:	5b                   	pop    rbx
      d0b681:	e9 9a 28 ae 00       	jmp    17edf20 <_ZdlPv@plt>
      d0b686:	41 57                	push   r15
      d0b688:	41 56                	push   r14
      d0b68a:	41 54                	push   r12
      d0b68c:	53                   	push   rbx
      d0b68d:	48 83 ec 28          	sub    rsp,0x28
      d0b691:	49 89 f6             	mov    r14,rsi
      d0b694:	48 89 fb             	mov    rbx,rdi
      d0b697:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d0b69e:	00 00 
      d0b6a0:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      d0b6a5:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
      d0b6a9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d0b6ac:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      d0b6b1:	4c 89 ff             	mov    rdi,r15
      d0b6b4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d0b6ba:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]
      d0b6be:	4d 2b 27             	sub    r12,QWORD PTR [r15]
      d0b6c1:	49 c1 ec 04          	shr    r12,0x4
      d0b6c5:	31 c9                	xor    ecx,ecx
      d0b6c7:	45 85 e4             	test   r12d,r12d
      d0b6ca:	44 0f 4e e1          	cmovle r12d,ecx
      d0b6ce:	49 c1 e4 04          	shl    r12,0x4
      d0b6d2:	49 83 c4 10          	add    r12,0x10
      d0b6d6:	4c 8d 79 10          	lea    r15,[rcx+0x10]
      d0b6da:	4d 39 fc             	cmp    r12,r15
      d0b6dd:	74 28                	je     d0b707 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2586a7>
      d0b6df:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      d0b6e4:	48 8b 34 08          	mov    rsi,QWORD PTR [rax+rcx*1]
      d0b6e8:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d0b6eb:	4c 89 f7             	mov    rdi,r14
      d0b6ee:	ff 50 28             	call   QWORD PTR [rax+0x28]
      d0b6f1:	4c 89 f9             	mov    rcx,r15
      d0b6f4:	85 c0                	test   eax,eax
      d0b6f6:	74 de                	je     d0b6d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258676>
      d0b6f8:	48 83 c3 10          	add    rbx,0x10
      d0b6fc:	6a 03                	push   0x3
      d0b6fe:	5e                   	pop    rsi
      d0b6ff:	48 89 df             	mov    rdi,rbx
      d0b702:	e8 a5 fd ff ff       	call   d0b4ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25844c>
      d0b707:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d0b70c:	e8 45 be da ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
      d0b711:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d0b718:	00 00 
      d0b71a:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      d0b71f:	75 33                	jne    d0b754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2586f4>
      d0b721:	48 83 c4 28          	add    rsp,0x28
      d0b725:	5b                   	pop    rbx
      d0b726:	41 5c                	pop    r12
      d0b728:	41 5e                	pop    r14
      d0b72a:	41 5f                	pop    r15
      d0b72c:	c3                   	ret
      d0b72d:	eb 00                	jmp    d0b72f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2586cf>
      d0b72f:	48 89 c3             	mov    rbx,rax
      d0b732:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d0b737:	e8 1a be da ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
      d0b73c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d0b743:	00 00 
      d0b745:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      d0b74a:	75 08                	jne    d0b754 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2586f4>
      d0b74c:	48 89 df             	mov    rdi,rbx

### 0xd1b693; FDE=(13743690, 13743867)
      d1b63c:	48 89 df             	mov    rdi,rbx
      d1b63f:	e8 8c 46 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d1b644:	e8 67 44 ad 00       	call   17efab0 <__stack_chk_fail@plt>
      d1b649:	cc                   	int3
      d1b64a:	53                   	push   rbx
      d1b64b:	48 83 ec 20          	sub    rsp,0x20
      d1b64f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d1b656:	00 00 
      d1b658:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d1b65d:	83 7e 38 09          	cmp    DWORD PTR [rsi+0x38],0x9
      d1b661:	75 44                	jne    d1b6a7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x268647>
      d1b663:	48 89 f2             	mov    rdx,rsi
      d1b666:	48 8b b7 b0 01 00 00 	mov    rsi,QWORD PTR [rdi+0x1b0]
      d1b66d:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
      d1b672:	48 89 df             	mov    rdi,rbx
      d1b675:	e8 38 1d 92 00       	call   163d3b2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38520>
      d1b67a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d1b67d:	48 85 ff             	test   rdi,rdi
      d1b680:	74 29                	je     d1b6ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26864b>
      d1b682:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d1b685:	ff 50 60             	call   QWORD PTR [rax+0x60]
      d1b688:	48 85 c0             	test   rax,rax
      d1b68b:	74 1e                	je     d1b6ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26864b>
      d1b68d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      d1b690:	48 89 c7             	mov    rdi,rax
      d1b693:	ff 91 d0 00 00 00    	call   QWORD PTR [rcx+0xd0]
      d1b699:	48 85 c0             	test   rax,rax
      d1b69c:	74 0d                	je     d1b6ab <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26864b>
      d1b69e:	83 78 28 02          	cmp    DWORD PTR [rax+0x28],0x2
      d1b6a2:	0f 95 c3             	setne  bl
      d1b6a5:	eb 06                	jmp    d1b6ad <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x26864d>
      d1b6a7:	31 db                	xor    ebx,ebx
      d1b6a9:	eb 0c                	jmp    d1b6b7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x268657>
      d1b6ab:	31 db                	xor    ebx,ebx
      d1b6ad:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d1b6b2:	e8 cf 2d d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d1b6b7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d1b6be:	00 00 
      d1b6c0:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      d1b6c5:	75 2f                	jne    d1b6f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x268696>
      d1b6c7:	89 d8                	mov    eax,ebx
      d1b6c9:	48 83 c4 20          	add    rsp,0x20
      d1b6cd:	5b                   	pop    rbx
      d1b6ce:	c3                   	ret
      d1b6cf:	eb 00                	jmp    d1b6d1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x268671>
      d1b6d1:	48 89 c3             	mov    rbx,rax
      d1b6d4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d1b6d9:	e8 a8 2d d8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d1b6de:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d1b6e5:	00 00 
      d1b6e7:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
      d1b6ec:	75 08                	jne    d1b6f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x268696>
      d1b6ee:	48 89 df             	mov    rdi,rbx
      d1b6f1:	e8 da 45 d5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d1b6f6:	e8 b5 43 ad 00       	call   17efab0 <__stack_chk_fail@plt>
      d1b6fb:	cc                   	int3
      d1b6fc:	53                   	push   rbx
      d1b6fd:	48 83 ec 20          	sub    rsp,0x20
      d1b701:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d1b708:	00 00 
      d1b70a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      d1b70f:	83 7e 38 09          	cmp    DWORD PTR [rsi+0x38],0x9
      d1b713:	75 45                	jne    d1b75a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2686fa>
      d1b715:	48 89 f2             	mov    rdx,rsi
      d1b718:	48 8b b7 b0 01 00 00 	mov    rsi,QWORD PTR [rdi+0x1b0]
      d1b71f:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
      d1b724:	48 89 df             	mov    rdi,rbx
      d1b727:	e8 86 1c 92 00       	call   163d3b2 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38520>
      d1b72c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      d1b72f:	48 85 ff             	test   rdi,rdi
      d1b732:	74 2a                	je     d1b75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2686fe>

### 0xd2e12c; FDE=(13819866, 13820430)
Strings: lfs-secret-provider/v1/secret | Cache-Control | no-cache, no-store
      d2e0c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d2e0ca:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      d2e0d0:	48 8d 05 61 53 af 00 	lea    rax,[rip+0xaf5361]        # 1823438 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x190f8>
      d2e0d7:	48 8d ac 24 a0 00 00 	lea    rbp,[rsp+0xa0]
      d2e0de:	00 
      d2e0df:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      d2e0e3:	48 89 5d 08          	mov    QWORD PTR [rbp+0x8],rbx
      d2e0e7:	48 89 6d 20          	mov    QWORD PTR [rbp+0x20],rbp
      d2e0eb:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      d2e0ee:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d2e0f1:	48 89 ee             	mov    rsi,rbp
      d2e0f4:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      d2e0fa:	48 8d 05 7f 53 af 00 	lea    rax,[rip+0xaf537f]        # 1823480 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x19140>
      d2e101:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      d2e106:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d2e10a:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
      d2e10f:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      d2e114:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      d2e117:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d2e11a:	4c 89 e6             	mov    rsi,r12
      d2e11d:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      d2e123:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      d2e126:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d2e129:	6a 01                	push   0x1
      d2e12b:	5e                   	pop    rsi
      d2e12c:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d2e132:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      d2e135:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d2e138:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
      d2e13d:	4c 89 ef             	mov    rdi,r13
      d2e140:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
      d2e146:	4c 89 f7             	mov    rdi,r14
      d2e149:	4c 89 ee             	mov    rsi,r13
      d2e14c:	e8 cb b6 d8 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      d2e151:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      d2e155:	e8 2c 03 d7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d2e15a:	4c 89 e7             	mov    rdi,r12
      d2e15d:	e8 08 be d4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d2e162:	48 89 ef             	mov    rdi,rbp
      d2e165:	e8 00 be d4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d2e16a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      d2e16f:	e8 1c fd ab 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d2e174:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d2e179:	e8 12 fd ab 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d2e17e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      d2e183:	e8 08 fd ab 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d2e188:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      d2e18c:	e8 f5 02 d7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d2e191:	48 8b bb e0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe0]
      d2e198:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d2e19b:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d2e19e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d2e1a5:	00 00 
      d2e1a7:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
      d2e1ae:	00 
      d2e1af:	75 58                	jne    d2e209 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27b1a9>
      d2e1b1:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
      d2e1b8:	5b                   	pop    rbx
      d2e1b9:	41 5c                	pop    r12
      d2e1bb:	41 5d                	pop    r13
      d2e1bd:	41 5e                	pop    r14
      d2e1bf:	41 5f                	pop    r15
      d2e1c1:	5d                   	pop    rbp
      d2e1c2:	c3                   	ret
      d2e1c3:	48 89 c3             	mov    rbx,rax
      d2e1c6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      d2e1cb:	e8 c0 fc ab 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d2e1d0:	eb 03                	jmp    d2e1d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27b175>
      d2e1d2:	48 89 c3             	mov    rbx,rax
      d2e1d5:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      d2e1da:	e8 b1 fc ab 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0xd55def; FDE=(13982368, 13983607)
Strings: core-offline | contexts_remote_device_sub_period
      d55d90:	00 
      d55d91:	0f 29 84 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm0
      d55d98:	00 
      d55d99:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
      d55da0:	00 
      d55da1:	e8 90 5a d2 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      d55da6:	4c 89 f7             	mov    rdi,r14
      d55da9:	48 89 c6             	mov    rsi,rax
      d55dac:	e8 8f f6 96 00       	call   16c5440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x795ac>
      d55db1:	4c 89 e7             	mov    rdi,r12
      d55db4:	4c 89 f6             	mov    rsi,r14
      d55db7:	e8 86 9e ef ff       	call   c4fc42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cbe2>
      d55dbc:	4c 89 f7             	mov    rdi,r14
      d55dbf:	e8 6a f5 96 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d55dc4:	48 83 c3 08          	add    rbx,0x8
      d55dc8:	48 39 dd             	cmp    rbp,rbx
      d55dcb:	75 ac                	jne    d55d79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22dff>
      d55dcd:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      d55dd2:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      d55dd5:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
      d55ddc:	00 
      d55ddd:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
      d55de2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      d55de5:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d55dea:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
      d55def:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d55df5:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      d55dfc:	00 
      d55dfd:	e8 68 41 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d55e02:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      d55e07:	e8 0c d0 eb ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d55e0c:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      d55e11:	4c 8b 74 24 58       	mov    r14,QWORD PTR [rsp+0x58]
      d55e16:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
      d55e1b:	74 3c                	je     d55e59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22edf>
      d55e1d:	4d 85 f6             	test   r14,r14
      d55e20:	74 37                	je     d55e59 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22edf>
      d55e22:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
      d55e27:	4c 8d 6c 24 48       	lea    r13,[rsp+0x48]
      d55e2c:	49 8d 76 10          	lea    rsi,[r14+0x10]
      d55e30:	4c 89 e7             	mov    rdi,r12
      d55e33:	e8 63 01 00 00       	call   d55f9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23021>
      d55e38:	84 c0                	test   al,al
      d55e3a:	74 05                	je     d55e41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ec7>
      d55e3c:	4d 8b 36             	mov    r14,QWORD PTR [r14]
      d55e3f:	eb 0e                	jmp    d55e4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ed5>
      d55e41:	4c 89 ef             	mov    rdi,r13
      d55e44:	4c 89 f6             	mov    rsi,r14
      d55e47:	e8 b0 8e f3 ff       	call   c8ecfc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dbc9c>
      d55e4c:	49 89 c6             	mov    r14,rax
      d55e4f:	4d 85 f6             	test   r14,r14
      d55e52:	75 d8                	jne    d55e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22eb2>
      d55e54:	4c 8b 74 24 58       	mov    r14,QWORD PTR [rsp+0x58]
      d55e59:	4c 89 ff             	mov    rdi,r15
      d55e5c:	4c 89 f6             	mov    rsi,r14
      d55e5f:	e8 56 01 00 00       	call   d55fba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23040>
      d55e64:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      d55e69:	e8 aa cf eb ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d55e6e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      d55e73:	e8 94 d5 eb ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
      d55e78:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d55e7f:	00 00 
      d55e81:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
      d55e88:	00 
      d55e89:	0f 85 e3 00 00 00    	jne    d55f72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ff8>
      d55e8f:	48 81 c4 08 01 00 00 	add    rsp,0x108
      d55e96:	5b                   	pop    rbx
      d55e97:	41 5c                	pop    r12
      d55e99:	41 5d                	pop    r13
      d55e9b:	41 5e                	pop    r14
      d55e9d:	41 5f                	pop    r15

### 0xd5aaac; FDE=(13997032, 14004414)
      d5aa54:	00 
      d5aa55:	e8 aa 4e d5 ff       	call   aaf904 <JNI_OnUnload@@Base+0x371d1>
      d5aa5a:	6a 40                	push   0x40
      d5aa5c:	5f                   	pop    rdi
      d5aa5d:	e8 9e 34 a9 00       	call   17edf00 <_Znwm@plt>
      d5aa62:	49 89 c4             	mov    r12,rax
      d5aa65:	0f 57 c0             	xorps  xmm0,xmm0
      d5aa68:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      d5aa6c:	48 8d 05 35 2d aa 00 	lea    rax,[rip+0xaa2d35]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>
      d5aa73:	49 89 04 24          	mov    QWORD PTR [r12],rax
      d5aa77:	4d 89 e5             	mov    r13,r12
      d5aa7a:	49 83 c5 18          	add    r13,0x18
      d5aa7e:	4c 89 ef             	mov    rdi,r13
      d5aa81:	4c 89 fe             	mov    rsi,r15
      d5aa84:	e8 03 70 88 00       	call   15e1a8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427010>
      d5aa89:	4c 8d bc 24 88 00 00 	lea    r15,[rsp+0x88]
      d5aa90:	00 
      d5aa91:	4d 89 2f             	mov    QWORD PTR [r15],r13
      d5aa94:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
      d5aa98:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d5aa9b:	48 8d 94 24 e8 02 00 	lea    rdx,[rsp+0x2e8]
      d5aaa2:	00 
      d5aaa3:	48 89 df             	mov    rdi,rbx
      d5aaa6:	4c 89 f6             	mov    rsi,r14
      d5aaa9:	4c 89 f9             	mov    rcx,r15
      d5aaac:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d5aab2:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      d5aab6:	48 85 ff             	test   rdi,rdi
      d5aab9:	74 05                	je     d5aac0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27b46>
      d5aabb:	e8 d0 39 d4 ff       	call   a9e490 <JNI_OnUnload@@Base+0x25d5d>
      d5aac0:	48 8d bc 24 e8 02 00 	lea    rdi,[rsp+0x2e8]
      d5aac7:	00 
      d5aac8:	e9 71 fe ff ff       	jmp    d5a93e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x279c4>
      d5aacd:	0f 57 c0             	xorps  xmm0,xmm0
      d5aad0:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      d5aad3:	48 8d bc 24 e8 05 00 	lea    rdi,[rsp+0x5e8]
      d5aada:	00 
      d5aadb:	e8 40 ef 9d 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
      d5aae0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d5aae7:	00 00 
      d5aae9:	48 3b 84 24 60 06 00 	cmp    rax,QWORD PTR [rsp+0x660]
      d5aaf0:	00 
      d5aaf1:	0f 85 ac 05 00 00    	jne    d5b0a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x28129>
      d5aaf7:	48 89 d8             	mov    rax,rbx
      d5aafa:	48 81 c4 68 06 00 00 	add    rsp,0x668
      d5ab01:	5b                   	pop    rbx
      d5ab02:	41 5c                	pop    r12
      d5ab04:	41 5d                	pop    r13
      d5ab06:	41 5e                	pop    r14
      d5ab08:	41 5f                	pop    r15
      d5ab0a:	5d                   	pop    rbp
      d5ab0b:	c3                   	ret
      d5ab0c:	0f 57 c0             	xorps  xmm0,xmm0
      d5ab0f:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      d5ab12:	48 8d bc 24 e8 05 00 	lea    rdi,[rsp+0x5e8]
      d5ab19:	00 
      d5ab1a:	e8 af 42 d6 ff       	call   abedce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd6e>
      d5ab1f:	eb bf                	jmp    d5aae0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27b66>
      d5ab21:	0f 57 c0             	xorps  xmm0,xmm0
      d5ab24:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      d5ab27:	48 8d bc 24 e8 05 00 	lea    rdi,[rsp+0x5e8]
      d5ab2e:	00 
      d5ab2f:	e8 9a 42 d6 ff       	call   abedce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd6e>
      d5ab34:	eb aa                	jmp    d5aae0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27b66>
      d5ab36:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      d5ab39:	e9 8b 03 00 00       	jmp    d5aec9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27f4f>
      d5ab3e:	0f 57 c0             	xorps  xmm0,xmm0
      d5ab41:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      d5ab44:	48 8d bc 24 e8 05 00 	lea    rdi,[rsp+0x5e8]
      d5ab4b:	00 
      d5ab4c:	e8 5d 9c 88 00       	call   15e47ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429d32>

### 0xd5fa1f; FDE=(14022698, 14023275)
Strings: online | offline | Device coordinator was set %s | unknown
      d5f9b3:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      d5f9b7:	48 8d 05 5a 22 6f ff 	lea    rax,[rip+0xffffffffff6f225a]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      d5f9be:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      d5f9c3:	48 89 06             	mov    QWORD PTR [rsi],rax
      d5f9c6:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      d5f9ca:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      d5f9cf:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      d5f9d6:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
      d5f9db:	49 89 1e             	mov    QWORD PTR [r14],rbx
      d5f9de:	48 8d 05 7f ca d1 ff 	lea    rax,[rip+0xffffffffffd1ca7f]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      d5f9e5:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      d5f9e9:	48 8d 05 84 00 00 00 	lea    rax,[rip+0x84]        # d5fa74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cafa>
      d5f9f0:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      d5f9f4:	4c 89 f2             	mov    rdx,r14
      d5f9f7:	45 31 c0             	xor    r8d,r8d
      d5f9fa:	e8 cd 1d a6 00       	call   17c17cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175938>
      d5f9ff:	4c 89 f7             	mov    rdi,r14
      d5fa02:	e8 97 78 d4 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
      d5fa07:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      d5fa0b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d5fa0e:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      d5fa14:	84 c0                	test   al,al
      d5fa16:	74 2b                	je     d5fa43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cac9>
      d5fa18:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
      d5fa1c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d5fa1f:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d5fa25:	84 c0                	test   al,al
      d5fa27:	75 1a                	jne    d5fa43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cac9>
      d5fa29:	6a 02                	push   0x2
      d5fa2b:	5e                   	pop    rsi
      d5fa2c:	48 89 df             	mov    rdi,rbx
      d5fa2f:	e8 fa fb ff ff       	call   d5f62e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6b4>
      d5fa34:	84 c0                	test   al,al
      d5fa36:	75 0b                	jne    d5fa43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cac9>
      d5fa38:	6a 02                	push   0x2
      d5fa3a:	5e                   	pop    rsi
      d5fa3b:	48 89 df             	mov    rdi,rbx
      d5fa3e:	e8 1d ed ff ff       	call   d5e760 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b7e6>
      d5fa43:	48 89 df             	mov    rdi,rbx
      d5fa46:	e8 ab ed ff ff       	call   d5e7f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b87c>
      d5fa4b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d5fa52:	00 00 
      d5fa54:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      d5fa59:	75 0b                	jne    d5fa66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2caec>
      d5fa5b:	48 83 c4 48          	add    rsp,0x48
      d5fa5f:	5b                   	pop    rbx
      d5fa60:	41 5e                	pop    r14
      d5fa62:	41 5f                	pop    r15
      d5fa64:	5d                   	pop    rbp
      d5fa65:	c3                   	ret
      d5fa66:	e8 45 00 a9 00       	call   17efab0 <__stack_chk_fail@plt>
      d5fa6b:	cc                   	int3
      d5fa6c:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      d5fa6f:	e9 26 00 00 00       	jmp    d5fa9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb20>
      d5fa74:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      d5fa77:	e9 00 00 00 00       	jmp    d5fa7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cb02>
      d5fa7c:	53                   	push   rbx
      d5fa7d:	48 89 fb             	mov    rbx,rdi
      d5fa80:	31 f6                	xor    esi,esi
      d5fa82:	e8 d9 ec ff ff       	call   d5e760 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b7e6>
      d5fa87:	48 89 df             	mov    rdi,rbx
      d5fa8a:	e8 67 ed ff ff       	call   d5e7f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b87c>
      d5fa8f:	5b                   	pop    rbx
      d5fa90:	c3                   	ret
      d5fa91:	48 89 c7             	mov    rdi,rax
      d5fa94:	e8 0c a0 d1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      d5fa99:	cc                   	int3
      d5fa9a:	53                   	push   rbx
      d5fa9b:	48 89 fb             	mov    rbx,rdi
      d5fa9e:	6a 01                	push   0x1
      d5faa0:	5e                   	pop    rsi

### 0xd71c15; FDE=(14096516, 14099437)
Strings: Pruning unused resources | unknown | Nothing to prune | keys-pruned | Offline manager prune stats: |   %3d files locked in storage |   %3d files unlocked in storage |   %3d track keys in store |   %3d episode keys in store |   %3d abp chapter keys in store |   %3d track keys removed |   %3d track keys moved to cache |   %3d episode keys removed |   %3d episode keys moved to cache |   %3d abp chapter keys removed |   %3d abp chapter keys moved to cache |   %3d keys removed from cache  |   %3d keys left in cache
      d71baf:	49 89 c5             	mov    r13,rax
      d71bb2:	48 8b bb e8 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2e8]
      d71bb9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d71bbc:	48 8d 15 a9 0e 00 00 	lea    rdx,[rip+0xea9]        # d72a6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3faf2>
      d71bc3:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
      d71bca:	00 
      d71bcb:	4c 89 f9             	mov    rcx,r15
      d71bce:	ff 50 38             	call   QWORD PTR [rax+0x38]
      d71bd1:	4d 89 e6             	mov    r14,r12
      d71bd4:	49 c1 ee 20          	shr    r14,0x20
      d71bd8:	4c 89 e9             	mov    rcx,r13
      d71bdb:	48 c1 e9 20          	shr    rcx,0x20
      d71bdf:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      d71be4:	48 89 c1             	mov    rcx,rax
      d71be7:	48 c1 e9 20          	shr    rcx,0x20
      d71beb:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      d71bf0:	c6 83 12 02 00 00 00 	mov    BYTE PTR [rbx+0x212],0x0
      d71bf7:	8b 4c 24 38          	mov    ecx,DWORD PTR [rsp+0x38]
      d71bfb:	80 bb f1 01 00 00 00 	cmp    BYTE PTR [rbx+0x1f1],0x0
      d71c02:	74 1a                	je     d71c1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3eca4>
      d71c04:	85 c9                	test   ecx,ecx
      d71c06:	7e 16                	jle    d71c1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3eca4>
      d71c08:	48 8b bb f0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xf0]
      d71c0f:	49 89 c7             	mov    r15,rax
      d71c12:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d71c15:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d71c1b:	4c 89 f8             	mov    rax,r15
      d71c1e:	40 b5 01             	mov    bpl,0x1
      d71c21:	45 85 e4             	test   r12d,r12d
      d71c24:	75 25                	jne    d71c4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ecd1>
      d71c26:	45 85 ed             	test   r13d,r13d
      d71c29:	75 20                	jne    d71c4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ecd1>
      d71c2b:	85 c0                	test   eax,eax
      d71c2d:	75 1c                	jne    d71c4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ecd1>
      d71c2f:	49 89 c7             	mov    r15,rax
      d71c32:	48 8b bb f0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2f0]
      d71c39:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d71c3c:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      d71c42:	85 c0                	test   eax,eax
      d71c44:	40 0f 95 c5          	setne  bpl
      d71c48:	4c 89 f8             	mov    rax,r15
      d71c4b:	40 84 ed             	test   bpl,bpl
      d71c4e:	75 30                	jne    d71c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ed06>
      d71c50:	83 7c 24 3c 00       	cmp    DWORD PTR [rsp+0x3c],0x0
      d71c55:	75 29                	jne    d71c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ed06>
      d71c57:	83 7c 24 38 00       	cmp    DWORD PTR [rsp+0x38],0x0
      d71c5c:	75 22                	jne    d71c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ed06>
      d71c5e:	48 8d 35 17 03 6e ff 	lea    rsi,[rip+0xffffffffff6e0317]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      d71c65:	48 8d 0d b4 80 60 ff 	lea    rcx,[rip+0xffffffffff6080b4]        # 379d20 <_ZTSSt12bad_any_cast@@Base-0x164a8>
      d71c6c:	6a 04                	push   0x4
      d71c6e:	5f                   	pop    rdi
      d71c6f:	ba 4c 0d 00 00       	mov    edx,0xd4c
      d71c74:	31 c0                	xor    eax,eax
      d71c76:	e8 57 4c a6 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      d71c7b:	e9 3e 06 00 00       	jmp    d722be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f344>
      d71c80:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      d71c85:	48 89 df             	mov    rdi,rbx
      d71c88:	e8 c3 0d 00 00       	call   d72a50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3fad6>
      d71c8d:	84 c0                	test   al,al
      d71c8f:	4c 89 64 24 28       	mov    QWORD PTR [rsp+0x28],r12
      d71c94:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
      d71c99:	0f 84 e9 02 00 00    	je     d71f88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f00e>
      d71c9f:	66 0f 57 c0          	xorpd  xmm0,xmm0
      d71ca3:	48 8d 84 24 30 01 00 	lea    rax,[rsp+0x130]
      d71caa:	00 
      d71cab:	66 0f 29 40 10       	movapd XMMWORD PTR [rax+0x10],xmm0
      d71cb0:	66 0f 29 00          	movapd XMMWORD PTR [rax],xmm0
      d71cb4:	c7 40 20 00 00 80 3f 	mov    DWORD PTR [rax+0x20],0x3f800000
      d71cbb:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      d71cc0:	66 0f 29 01          	movapd XMMWORD PTR [rcx],xmm0
      d71cc4:	48 83 61 10 00       	and    QWORD PTR [rcx+0x10],0x0

### 0xd81671; FDE=(14161420, 14161675)
      d81612:	53                   	push   rbx
      d81613:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
      d8161a:	49 89 ce             	mov    r14,rcx
      d8161d:	49 89 f7             	mov    r15,rsi
      d81620:	48 89 fb             	mov    rbx,rdi
      d81623:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d8162a:	00 00 
      d8162c:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
      d81633:	00 
      d81634:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
      d81639:	4c 89 e7             	mov    rdi,r12
      d8163c:	48 89 d6             	mov    rsi,rdx
      d8163f:	e8 22 88 94 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      d81644:	0f 57 c0             	xorps  xmm0,xmm0
      d81647:	48 89 e7             	mov    rdi,rsp
      d8164a:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
      d8164e:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      d81651:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
      d81658:	4c 89 e6             	mov    rsi,r12
      d8165b:	e8 e2 e5 ec ff       	call   c4fc42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19cbe2>
      d81660:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d81663:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      d81668:	48 89 e2             	mov    rdx,rsp
      d8166b:	4c 89 fe             	mov    rsi,r15
      d8166e:	4c 89 f1             	mov    rcx,r14
      d81671:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d81677:	48 89 e7             	mov    rdi,rsp
      d8167a:	e8 99 17 e9 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d8167f:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      d81684:	e8 a5 3c 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d81689:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
      d8168e:	48 89 df             	mov    rdi,rbx
      d81691:	e8 90 8a fe ff       	call   d6a126 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x371ac>
      d81696:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      d8169b:	e8 78 17 e9 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d816a0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d816a7:	00 00 
      d816a9:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      d816b0:	00 
      d816b1:	75 53                	jne    d81706 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e78c>
      d816b3:	48 89 d8             	mov    rax,rbx
      d816b6:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
      d816bd:	5b                   	pop    rbx
      d816be:	41 5c                	pop    r12
      d816c0:	41 5e                	pop    r14
      d816c2:	41 5f                	pop    r15
      d816c4:	c3                   	ret
      d816c5:	48 89 c3             	mov    rbx,rax
      d816c8:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      d816cd:	e8 46 17 e9 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d816d2:	eb 17                	jmp    d816eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e771>
      d816d4:	eb 00                	jmp    d816d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e75c>
      d816d6:	48 89 c3             	mov    rbx,rax
      d816d9:	48 89 e7             	mov    rdi,rsp
      d816dc:	e8 37 17 e9 ff       	call   c12e18 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15fdb8>
      d816e1:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      d816e6:	e8 43 3c 94 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d816eb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d816f2:	00 00 
      d816f4:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
      d816fb:	00 
      d816fc:	75 08                	jne    d81706 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e78c>
      d816fe:	48 89 df             	mov    rdi,rbx
      d81701:	e8 ca e5 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d81706:	e8 a5 e3 a6 00       	call   17efab0 <__stack_chk_fail@plt>
      d8170b:	cc                   	int3
      d8170c:	55                   	push   rbp
      d8170d:	41 57                	push   r15
      d8170f:	41 56                	push   r14
      d81711:	41 55                	push   r13
      d81713:	41 54                	push   r12

### 0xd89b19; FDE=(14195294, 14195620)
      d89ac3:	41 0f b6 97 13 02 00 	movzx  edx,BYTE PTR [r15+0x213]
      d89aca:	00 
      d89acb:	4c 89 ff             	mov    rdi,r15
      d89ace:	4c 89 f6             	mov    rsi,r14
      d89ad1:	e8 06 b6 fe ff       	call   d750dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42162>
      d89ad6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d89ad9:	4c 89 f7             	mov    rdi,r14
      d89adc:	ff 50 10             	call   QWORD PTR [rax+0x10]
      d89adf:	48 89 e7             	mov    rdi,rsp
      d89ae2:	48 89 c6             	mov    rsi,rax
      d89ae5:	e8 7c 03 94 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      d89aea:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d89aed:	4c 89 f7             	mov    rdi,r14
      d89af0:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d89af3:	48 89 e6             	mov    rsi,rsp
      d89af6:	89 46 58             	mov    DWORD PTR [rsi+0x58],eax
      d89af9:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d89afc:	4c 89 ff             	mov    rdi,r15
      d89aff:	ff 90 c8 02 00 00    	call   QWORD PTR [rax+0x2c8]
      d89b05:	48 89 e7             	mov    rdi,rsp
      d89b08:	e8 21 b8 93 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d89b0d:	49 8b 06             	mov    rax,QWORD PTR [r14]
      d89b10:	49 89 e7             	mov    r15,rsp
      d89b13:	4c 89 ff             	mov    rdi,r15
      d89b16:	4c 89 f6             	mov    rsi,r14
      d89b19:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d89b1f:	41 83 bf 80 00 00 00 	cmp    DWORD PTR [r15+0x80],0x0
      d89b26:	00 
      d89b27:	74 1b                	je     d89b44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56bca>
      d89b29:	48 89 e6             	mov    rsi,rsp
      d89b2c:	48 89 df             	mov    rdi,rbx
      d89b2f:	e8 b0 00 00 00       	call   d89be4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56c6a>
      d89b34:	b0 01                	mov    al,0x1
      d89b36:	eb 11                	jmp    d89b49 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56bcf>
      d89b38:	31 c0                	xor    eax,eax
      d89b3a:	88 03                	mov    BYTE PTR [rbx],al
      d89b3c:	88 83 88 00 00 00    	mov    BYTE PTR [rbx+0x88],al
      d89b42:	eb 13                	jmp    d89b57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56bdd>
      d89b44:	c6 03 00             	mov    BYTE PTR [rbx],0x0
      d89b47:	31 c0                	xor    eax,eax
      d89b49:	88 83 88 00 00 00    	mov    BYTE PTR [rbx+0x88],al
      d89b4f:	48 89 e7             	mov    rdi,rsp
      d89b52:	e8 61 5e f5 ff       	call   cdf9b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22c958>
      d89b57:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d89b5e:	00 00 
      d89b60:	48 3b 84 24 88 00 00 	cmp    rax,QWORD PTR [rsp+0x88]
      d89b67:	00 
      d89b68:	75 35                	jne    d89b9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56c25>
      d89b6a:	48 81 c4 90 00 00 00 	add    rsp,0x90
      d89b71:	5b                   	pop    rbx
      d89b72:	41 5e                	pop    r14
      d89b74:	41 5f                	pop    r15
      d89b76:	c3                   	ret
      d89b77:	eb 00                	jmp    d89b79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56bff>
      d89b79:	48 89 c3             	mov    rbx,rax
      d89b7c:	48 89 e7             	mov    rdi,rsp
      d89b7f:	e8 aa b7 93 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
      d89b84:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      d89b8b:	00 00 
      d89b8d:	48 3b 84 24 88 00 00 	cmp    rax,QWORD PTR [rsp+0x88]
      d89b94:	00 
      d89b95:	75 08                	jne    d89b9f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56c25>
      d89b97:	48 89 df             	mov    rdi,rbx
      d89b9a:	e8 31 61 ce ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      d89b9f:	e8 0c 5f a6 00       	call   17efab0 <__stack_chk_fail@plt>
      d89ba4:	41 56                	push   r14
      d89ba6:	53                   	push   rbx
      d89ba7:	50                   	push   rax
      d89ba8:	31 c0                	xor    eax,eax
      d89baa:	88 07                	mov    BYTE PTR [rdi],al
      d89bac:	88 87 88 00 00 00    	mov    BYTE PTR [rdi+0x88],al

### 0xd98202; FDE=(14254364, 14256517)
      d9818a:	e8 71 5d a5 00       	call   17edf00 <_Znwm@plt>
      d9818f:	49 89 c6             	mov    r14,rax
      d98192:	66 0f ef c0          	pxor   xmm0,xmm0
      d98196:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      d9819b:	48 8d 05 26 2c a7 00 	lea    rax,[rip+0xa72c26]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      d981a2:	49 89 06             	mov    QWORD PTR [r14],rax
      d981a5:	48 8d 05 1c fe a8 00 	lea    rax,[rip+0xa8fe1c]        # 1827fc8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x45f8>
      d981ac:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      d981b1:	48 89 01             	mov    QWORD PTR [rcx],rax
      d981b4:	4c 89 79 08          	mov    QWORD PTR [rcx+0x8],r15
      d981b8:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      d981bc:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
      d981c2:	48 8d 05 7f fe a8 00 	lea    rax,[rip+0xa8fe7f]        # 1828048 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4678>
      d981c9:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      d981cd:	4d 8d 66 38          	lea    r12,[r14+0x38]
      d981d1:	4c 89 e7             	mov    rdi,r12
      d981d4:	4c 89 ee             	mov    rsi,r13
      d981d7:	e8 5c 0c 00 00       	call   d98e38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65ebe>
      d981dc:	4d 89 be b0 00 00 00 	mov    QWORD PTR [r14+0xb0],r15
      d981e3:	4d 89 a6 b8 00 00 00 	mov    QWORD PTR [r14+0xb8],r12
      d981ea:	4d 89 be c0 00 00 00 	mov    QWORD PTR [r14+0xc0],r15
      d981f1:	41 c7 86 c8 00 00 00 	mov    DWORD PTR [r14+0xc8],0x1
      d981f8:	01 00 00 00 
      d981fc:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d981ff:	4c 89 ff             	mov    rdi,r15
      d98202:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d98208:	48 89 c3             	mov    rbx,rax
      d9820b:	bf b0 01 00 00       	mov    edi,0x1b0
      d98210:	e8 eb 5c a5 00       	call   17edf00 <_Znwm@plt>
      d98215:	49 89 c5             	mov    r13,rax
      d98218:	49 8d 6e 20          	lea    rbp,[r14+0x20]
      d9821c:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
      d98221:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      d98227:	66 0f 7f 02          	movdqa XMMWORD PTR [rdx],xmm0
      d9822b:	48 8d 05 56 ff a8 00 	lea    rax,[rip+0xa8ff56]        # 1828188 <_ZTIN4asio2ip16bad_address_castE@@Base+0x47b8>
      d98232:	4c 8d 8c 24 90 00 00 	lea    r9,[rsp+0x90]
      d98239:	00 
      d9823a:	49 89 01             	mov    QWORD PTR [r9],rax
      d9823d:	49 89 69 08          	mov    QWORD PTR [r9+0x8],rbp
      d98241:	4d 89 49 20          	mov    QWORD PTR [r9+0x20],r9
      d98245:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
      d9824c:	00 
      d9824d:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      d98251:	4c 89 ef             	mov    rdi,r13
      d98254:	4c 89 fe             	mov    rsi,r15
      d98257:	4c 89 e1             	mov    rcx,r12
      d9825a:	49 89 d8             	mov    r8,rbx
      d9825d:	e8 58 24 00 00       	call   d9a6ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67740>
      d98262:	4d 89 ae d0 00 00 00 	mov    QWORD PTR [r14+0xd0],r13
      d98269:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d98270:	00 
      d98271:	e8 f4 1c ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d98276:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      d9827b:	e8 06 62 d0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d98280:	48 8b 84 24 80 00 00 	mov    rax,QWORD PTR [rsp+0x80]
      d98287:	00 
      d98288:	48 85 c0             	test   rax,rax
      d9828b:	0f 84 b9 03 00 00    	je     d9864a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x656d0>
      d98291:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
      d98296:	48 39 c8             	cmp    rax,rcx
      d98299:	0f 84 b8 03 00 00    	je     d98657 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x656dd>
      d9829f:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
      d982a6:	00 
      d982a7:	49 89 86 00 01 00 00 	mov    QWORD PTR [r14+0x100],rax
      d982ae:	e9 9e 03 00 00       	jmp    d98651 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x656d7>
      d982b3:	44 89 cd             	mov    ebp,r9d
      d982b6:	44 89 c3             	mov    ebx,r8d
      d982b9:	bf 90 02 00 00       	mov    edi,0x290
      d982be:	e8 3d 5c a5 00       	call   17edf00 <_Znwm@plt>
      d982c3:	49 89 c6             	mov    r14,rax
      d982c6:	66 0f ef c9          	pxor   xmm1,xmm1

### 0xd983da; FDE=(14254364, 14256517)
      d9836b:	00 00 
      d9836d:	41 83 a6 d9 00 00 00 	and    DWORD PTR [r14+0xd9],0x0
      d98374:	00 
      d98375:	49 8d 86 78 01 00 00 	lea    rax,[r14+0x178]
      d9837c:	41 c6 86 dd 00 00 00 	mov    BYTE PTR [r14+0xdd],0x0
      d98383:	00 
      d98384:	49 89 86 70 01 00 00 	mov    QWORD PTR [r14+0x170],rax
      d9838b:	49 8d be 88 01 00 00 	lea    rdi,[r14+0x188]
      d98392:	ba a0 00 00 00       	mov    edx,0xa0
      d98397:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
      d9839c:	31 f6                	xor    esi,esi
      d9839e:	e8 ed 67 a5 00       	call   17eeb90 <memset@plt>
      d983a3:	41 c7 86 28 02 00 00 	mov    DWORD PTR [r14+0x228],0x3f800000
      d983aa:	00 00 80 3f 
      d983ae:	49 83 a6 50 02 00 00 	and    QWORD PTR [r14+0x250],0x0
      d983b5:	00 
      d983b6:	66 41 83 a6 60 02 00 	and    WORD PTR [r14+0x260],0x0
      d983bd:	00 00 
      d983bf:	66 0f ef c0          	pxor   xmm0,xmm0
      d983c3:	f3 41 0f 7f 86 68 02 	movdqu XMMWORD PTR [r14+0x268],xmm0
      d983ca:	00 00 
      d983cc:	49 83 a6 78 02 00 00 	and    QWORD PTR [r14+0x278],0x0
      d983d3:	00 
      d983d4:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d983d7:	4c 89 ff             	mov    rdi,r15
      d983da:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d983e0:	48 89 c3             	mov    rbx,rax
      d983e3:	bf b0 01 00 00       	mov    edi,0x1b0
      d983e8:	e8 13 5b a5 00       	call   17edf00 <_Znwm@plt>
      d983ed:	49 89 c5             	mov    r13,rax
      d983f0:	49 8d 6e 20          	lea    rbp,[r14+0x20]
      d983f4:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
      d983f9:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      d983ff:	66 0f 7f 02          	movdqa XMMWORD PTR [rdx],xmm0
      d98403:	48 8d 05 7e fd a8 00 	lea    rax,[rip+0xa8fd7e]        # 1828188 <_ZTIN4asio2ip16bad_address_castE@@Base+0x47b8>
      d9840a:	4c 8d 8c 24 90 00 00 	lea    r9,[rsp+0x90]
      d98411:	00 
      d98412:	49 89 01             	mov    QWORD PTR [r9],rax
      d98415:	49 89 69 08          	mov    QWORD PTR [r9+0x8],rbp
      d98419:	4d 89 49 20          	mov    QWORD PTR [r9+0x20],r9
      d9841d:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
      d98424:	00 
      d98425:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      d98429:	4c 89 ef             	mov    rdi,r13
      d9842c:	4c 89 fe             	mov    rsi,r15
      d9842f:	4c 89 e1             	mov    rcx,r12
      d98432:	49 89 d8             	mov    r8,rbx
      d98435:	e8 80 22 00 00       	call   d9a6ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67740>
      d9843a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d98441:	00 
      d98442:	e8 23 1b ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d98447:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      d9844c:	e8 35 60 d0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d98451:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
      d98456:	48 83 23 00          	and    QWORD PTR [rbx],0x0
      d9845a:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      d9845f:	4c 89 ee             	mov    rsi,r13
      d98462:	e8 63 21 00 00       	call   d9a5ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67650>
      d98467:	48 89 df             	mov    rdi,rbx
      d9846a:	e8 53 21 00 00       	call   d9a5c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67648>
      d9846f:	31 ff                	xor    edi,edi
      d98471:	e8 10 60 d0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d98476:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      d9847a:	48 85 c0             	test   rax,rax
      d9847d:	74 0a                	je     d98489 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6550f>
      d9847f:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      d98483:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
      d98487:	75 27                	jne    d984b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65536>
      d98489:	66 49 0f 6e ce       	movq   xmm1,r14
      d9848e:	4c 89 f7             	mov    rdi,r14
      d98491:	48 83 c7 28          	add    rdi,0x28

### 0xd98529; FDE=(14254364, 14256517)
      d984b0:	31 ff                	xor    edi,edi
      d984b2:	e8 65 5f d0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      d984b7:	e9 7d 01 00 00       	jmp    d98639 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x656bf>
      d984bc:	bf 70 01 00 00       	mov    edi,0x170
      d984c1:	e8 3a 5a a5 00       	call   17edf00 <_Znwm@plt>
      d984c6:	49 89 c6             	mov    r14,rax
      d984c9:	66 0f ef c0          	pxor   xmm0,xmm0
      d984cd:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      d984d2:	48 8d 05 ef 28 a7 00 	lea    rax,[rip+0xa728ef]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      d984d9:	49 89 06             	mov    QWORD PTR [r14],rax
      d984dc:	f3 41 0f 6f 0c 24    	movdqu xmm1,XMMWORD PTR [r12]
      d984e2:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      d984e8:	f3 41 0f 7f 04 24    	movdqu XMMWORD PTR [r12],xmm0
      d984ee:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
      d984f4:	48 8d 05 0d 00 a9 00 	lea    rax,[rip+0xa9000d]        # 1828508 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4b38>
      d984fb:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      d984ff:	4d 8d 66 38          	lea    r12,[r14+0x38]
      d98503:	4c 89 e7             	mov    rdi,r12
      d98506:	4c 89 ee             	mov    rsi,r13
      d98509:	e8 2a 09 00 00       	call   d98e38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x65ebe>
      d9850e:	4d 89 be b0 00 00 00 	mov    QWORD PTR [r14+0xb0],r15
      d98515:	4d 89 a6 b8 00 00 00 	mov    QWORD PTR [r14+0xb8],r12
      d9851c:	4d 89 be c0 00 00 00 	mov    QWORD PTR [r14+0xc0],r15
      d98523:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d98526:	4c 89 ff             	mov    rdi,r15
      d98529:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d9852f:	48 89 c3             	mov    rbx,rax
      d98532:	bf b0 01 00 00       	mov    edi,0x1b0
      d98537:	e8 c4 59 a5 00       	call   17edf00 <_Znwm@plt>
      d9853c:	49 89 c5             	mov    r13,rax
      d9853f:	49 8d 6e 20          	lea    rbp,[r14+0x20]
      d98543:	48 8d 54 24 60       	lea    rdx,[rsp+0x60]
      d98548:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      d9854e:	66 0f 7f 02          	movdqa XMMWORD PTR [rdx],xmm0
      d98552:	48 8d 05 2f fc a8 00 	lea    rax,[rip+0xa8fc2f]        # 1828188 <_ZTIN4asio2ip16bad_address_castE@@Base+0x47b8>
      d98559:	4c 8d 8c 24 90 00 00 	lea    r9,[rsp+0x90]
      d98560:	00 
      d98561:	49 89 01             	mov    QWORD PTR [r9],rax
      d98564:	49 89 69 08          	mov    QWORD PTR [r9+0x8],rbp
      d98568:	4d 89 49 20          	mov    QWORD PTR [r9+0x20],r9
      d9856c:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
      d98573:	00 
      d98574:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      d98578:	4c 89 ef             	mov    rdi,r13
      d9857b:	4c 89 fe             	mov    rsi,r15
      d9857e:	4c 89 e1             	mov    rcx,r12
      d98581:	49 89 d8             	mov    r8,rbx
      d98584:	e8 31 21 00 00       	call   d9a6ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67740>
      d98589:	4d 89 ae c8 00 00 00 	mov    QWORD PTR [r14+0xc8],r13
      d98590:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      d98597:	00 
      d98598:	e8 cd 19 ce ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d9859d:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
      d985a2:	e8 df 5e d0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      d985a7:	66 41 83 a6 d0 00 00 	and    WORD PTR [r14+0xd0],0x0
      d985ae:	00 00 
      d985b0:	49 83 a6 40 01 00 00 	and    QWORD PTR [r14+0x140],0x0
      d985b7:	00 
      d985b8:	66 0f ef c0          	pxor   xmm0,xmm0
      d985bc:	66 41 0f 7f 86 50 01 	movdqa XMMWORD PTR [r14+0x150],xmm0
      d985c3:	00 00 
      d985c5:	49 83 a6 60 01 00 00 	and    QWORD PTR [r14+0x160],0x0
      d985cc:	00 
      d985cd:	f3 41 0f 7f 86 d8 00 	movdqu XMMWORD PTR [r14+0xd8],xmm0
      d985d4:	00 00 
      d985d6:	f3 41 0f 7f 86 e8 00 	movdqu XMMWORD PTR [r14+0xe8],xmm0
      d985dd:	00 00 
      d985df:	f3 41 0f 7f 86 f8 00 	movdqu XMMWORD PTR [r14+0xf8],xmm0
      d985e6:	00 00 
      d985e8:	f3 41 0f 7f 86 08 01 	movdqu XMMWORD PTR [r14+0x108],xmm0
      d985ef:	00 00 

### 0xd9f49f; FDE=(14283452, 14284779)
Strings: c
      d9f431:	48 89 6d 20          	mov    QWORD PTR [rbp+0x20],rbp
      d9f435:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
      d9f43a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d9f43f:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      d9f444:	48 89 4e f8          	mov    QWORD PTR [rsi-0x8],rcx
      d9f448:	48 89 06             	mov    QWORD PTR [rsi],rax
      d9f44b:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      d9f450:	48 89 4e 08          	mov    QWORD PTR [rsi+0x8],rcx
      d9f454:	48 85 c9             	test   rcx,rcx
      d9f457:	74 2c                	je     d9f485 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c50b>
      d9f459:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      d9f45e:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi
      d9f462:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
      d9f466:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
      d9f469:	eb 1f                	jmp    d9f48a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c510>
      d9f46b:	c7 43 78 6c 1b 00 00 	mov    DWORD PTR [rbx+0x78],0x1b6c
      d9f472:	48 8d 05 9f 81 b4 00 	lea    rax,[rip+0xb4819f]        # 18e7618 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x2ea28>
      d9f479:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
      d9f480:	e9 4a 02 00 00       	jmp    d9f6cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c755>
      d9f485:	48 89 74 24 38       	mov    QWORD PTR [rsp+0x38],rsi
      d9f48a:	48 8d 05 af 92 a8 00 	lea    rax,[rip+0xa892af]        # 1828740 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4d70>
      d9f491:	48 89 14 24          	mov    QWORD PTR [rsp],rdx
      d9f495:	48 89 02             	mov    QWORD PTR [rdx],rax
      d9f498:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      d9f49c:	4c 89 ef             	mov    rdi,r13
      d9f49f:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      d9f4a5:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      d9f4a9:	4d 89 6e 30          	mov    QWORD PTR [r14+0x30],r13
      d9f4ad:	4d 89 7e 38          	mov    QWORD PTR [r14+0x38],r15
      d9f4b1:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
      d9f4b6:	41 0f 29 46 40       	movaps XMMWORD PTR [r14+0x40],xmm0
      d9f4bb:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      d9f4c0:	49 89 46 50          	mov    QWORD PTR [r14+0x50],rax
      d9f4c4:	48 83 64 24 60 00    	and    QWORD PTR [rsp+0x60],0x0
      d9f4ca:	0f 57 c0             	xorps  xmm0,xmm0
      d9f4cd:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      d9f4d2:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      d9f4d9:	00 
      d9f4da:	48 85 c0             	test   rax,rax
      d9f4dd:	74 16                	je     d9f4f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c57b>
      d9f4df:	48 39 e8             	cmp    rax,rbp
      d9f4e2:	74 1f                	je     d9f503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c589>
      d9f4e4:	48 8d 8c 24 90 00 00 	lea    rcx,[rsp+0x90]
      d9f4eb:	00 
      d9f4ec:	49 89 86 80 00 00 00 	mov    QWORD PTR [r14+0x80],rax
      d9f4f3:	eb 08                	jmp    d9f4fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c583>
      d9f4f5:	49 8d 8c 24 80 00 00 	lea    rcx,[r12+0x80]
      d9f4fc:	00 
      d9f4fd:	48 83 21 00          	and    QWORD PTR [rcx],0x0
      d9f501:	eb 17                	jmp    d9f51a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c5a0>
      d9f503:	49 8d 74 24 60       	lea    rsi,[r12+0x60]
      d9f508:	49 89 b6 80 00 00 00 	mov    QWORD PTR [r14+0x80],rsi
      d9f50f:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      d9f514:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d9f517:	ff 50 18             	call   QWORD PTR [rax+0x18]
      d9f51a:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      d9f51f:	49 89 86 90 00 00 00 	mov    QWORD PTR [r14+0x90],rax
      d9f526:	49 81 c4 98 00 00 00 	add    r12,0x98
      d9f52d:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      d9f532:	49 89 be 98 00 00 00 	mov    QWORD PTR [r14+0x98],rdi
      d9f539:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      d9f53e:	49 89 86 a0 00 00 00 	mov    QWORD PTR [r14+0xa0],rax
      d9f545:	48 85 c0             	test   rax,rax
      d9f548:	74 18                	je     d9f562 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c5e8>
      d9f54a:	4c 89 67 10          	mov    QWORD PTR [rdi+0x10],r12
      d9f54e:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
      d9f553:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      d9f558:	0f 57 c0             	xorps  xmm0,xmm0
      d9f55b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      d9f55e:	31 ff                	xor    edi,edi
      d9f560:	eb 07                	jmp    d9f569 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6c5ef>

### 0xda2d07; FDE=(14297982, 14298987)
      da2ca7:	80 7c 24 1f 00       	cmp    BYTE PTR [rsp+0x1f],0x0
      da2cac:	48 0f 45 f0          	cmovne rsi,rax
      da2cb0:	4c 09 fe             	or     rsi,r15
      da2cb3:	8b 84 24 d0 00 00 00 	mov    eax,DWORD PTR [rsp+0xd0]
      da2cba:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
      da2cbe:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
      da2cc5:	00 
      da2cc6:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
      da2cca:	48 89 df             	mov    rdi,rbx
      da2ccd:	ff 53 18             	call   QWORD PTR [rbx+0x18]
      da2cd0:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
      da2cd7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      da2cda:	ff 50 20             	call   QWORD PTR [rax+0x20]
      da2cdd:	8a 40 58             	mov    al,BYTE PTR [rax+0x58]
      da2ce0:	4c 8d 7c 24 4f       	lea    r15,[rsp+0x4f]
      da2ce5:	41 88 07             	mov    BYTE PTR [r15],al
      da2ce8:	49 8b 06             	mov    rax,QWORD PTR [r14]
      da2ceb:	4c 89 f7             	mov    rdi,r14
      da2cee:	ff 50 40             	call   QWORD PTR [rax+0x40]
      da2cf1:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      da2cf4:	48 89 c7             	mov    rdi,rax
      da2cf7:	ff 51 48             	call   QWORD PTR [rcx+0x48]
      da2cfa:	49 89 c4             	mov    r12,rax
      da2cfd:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
      da2d04:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      da2d07:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      da2d0d:	4c 8d ac 24 c0 00 00 	lea    r13,[rsp+0xc0]
      da2d14:	00 
      da2d15:	4c 89 ef             	mov    rdi,r13
      da2d18:	4c 89 e6             	mov    rsi,r12
      da2d1b:	48 89 c2             	mov    rdx,rax
      da2d1e:	4c 89 f9             	mov    rcx,r15
      da2d21:	e8 48 6d 40 00       	call   11a9a6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370e84>
      da2d26:	49 8b 6d 00          	mov    rbp,QWORD PTR [r13+0x0]
      da2d2a:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      da2d2e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      da2d33:	48 39 c5             	cmp    rbp,rax
      da2d36:	0f 84 ad 01 00 00    	je     da2ee9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ff6f>
      da2d3c:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
      da2d41:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      da2d46:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
      da2d4d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      da2d50:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      da2d56:	4c 8d 7d 04          	lea    r15,[rbp+0x4]
      da2d5a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      da2d5d:	4c 89 ef             	mov    rdi,r13
      da2d60:	48 89 c6             	mov    rsi,rax
      da2d63:	4c 89 fa             	mov    rdx,r15
      da2d66:	ff 51 10             	call   QWORD PTR [rcx+0x10]
      da2d69:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp
      da2d6e:	4c 8b 6c 24 30       	mov    r13,QWORD PTR [rsp+0x30]
      da2d73:	48 8b 6c 24 38       	mov    rbp,QWORD PTR [rsp+0x38]
      da2d78:	49 39 ed             	cmp    r13,rbp
      da2d7b:	0f 84 a3 00 00 00    	je     da2e24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6feaa>
      da2d81:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
      da2d88:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      da2d8b:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
      da2d91:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      da2d94:	4c 89 e7             	mov    rdi,r12
      da2d97:	48 89 c6             	mov    rsi,rax
      da2d9a:	4c 89 ea             	mov    rdx,r13
      da2d9d:	ff 51 20             	call   QWORD PTR [rcx+0x20]
      da2da0:	80 bc 24 84 00 00 00 	cmp    BYTE PTR [rsp+0x84],0x0
      da2da7:	00 
      da2da8:	74 68                	je     da2e12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6fe98>
      da2daa:	8b 84 24 80 00 00 00 	mov    eax,DWORD PTR [rsp+0x80]
      da2db1:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax
      da2db8:	0f 10 44 24 70       	movups xmm0,XMMWORD PTR [rsp+0x70]
      da2dbd:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      da2dc4:	00 
      da2dc5:	6a 01                	push   0x1

### 0xda3595; FDE=(14298988, 14301210)
      da3529:	48 89 d0             	mov    rax,rdx
      da352c:	48 c1 e0 03          	shl    rax,0x3
      da3530:	49 03 45 00          	add    rax,QWORD PTR [r13+0x0]
      da3534:	48 89 18             	mov    QWORD PTR [rax],rbx
      da3537:	48 83 a4 24 88 00 00 	and    QWORD PTR [rsp+0x88],0x0
      da353e:	00 00 
      da3540:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      da3545:	48 ff 80 00 02 00 00 	inc    QWORD PTR [rax+0x200]
      da354c:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      da3553:	00 
      da3554:	e8 57 03 00 00       	call   da38b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70936>
      da3559:	48 83 c3 68          	add    rbx,0x68
      da355d:	0f b7 6c 24 56       	movzx  ebp,WORD PTR [rsp+0x56]
      da3562:	48 89 df             	mov    rdi,rbx
      da3565:	89 ee                	mov    esi,ebp
      da3567:	e8 52 a4 ff ff       	call   d9d9be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6aa44>
      da356c:	84 c0                	test   al,al
      da356e:	0f 85 6c 01 00 00    	jne    da36e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70766>
      da3574:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      da357b:	00 
      da357c:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
      da3581:	e8 24 72 f0 ff       	call   caa7aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f774a>
      da3586:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      da358b:	48 8b b8 98 00 00 00 	mov    rdi,QWORD PTR [rax+0x98]
      da3592:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      da3595:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      da359b:	49 89 c4             	mov    r12,rax
      da359e:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      da35a3:	e8 8e 82 cd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      da35a8:	49 89 d0             	mov    r8,rdx
      da35ab:	4d 8b 0c 24          	mov    r9,QWORD PTR [r12]
      da35af:	0f b7 d5             	movzx  edx,bp
      da35b2:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      da35b9:	00 
      da35ba:	4c 89 e6             	mov    rsi,r12
      da35bd:	48 89 c1             	mov    rcx,rax
      da35c0:	41 ff 51 28          	call   QWORD PTR [r9+0x28]
      da35c4:	0f b6 ac 24 88 00 00 	movzx  ebp,BYTE PTR [rsp+0x88]
      da35cb:	00 
      da35cc:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      da35d3:	00 
      da35d4:	e8 b7 a8 a4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      da35d9:	83 fd 04             	cmp    ebp,0x4
      da35dc:	0f 87 fe 00 00 00    	ja     da36e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70766>
      da35e2:	83 fd 02             	cmp    ebp,0x2
      da35e5:	74 12                	je     da35f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7067f>
      da35e7:	48 89 df             	mov    rdi,rbx
      da35ea:	48 8d 74 24 56       	lea    rsi,[rsp+0x56]
      da35ef:	e8 bc a8 ff ff       	call   d9deb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6af36>
      da35f4:	e9 e7 00 00 00       	jmp    da36e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70766>
      da35f9:	49 8b 5f 08          	mov    rbx,QWORD PTR [r15+0x8]
      da35fd:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
      da3601:	48 39 fb             	cmp    rbx,rdi
      da3604:	73 22                	jae    da3628 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x706ae>
      da3606:	48 89 df             	mov    rdi,rbx
      da3609:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
      da3610:	00 
      da3611:	e8 50 68 92 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      da3616:	0f b7 44 24 56       	movzx  eax,WORD PTR [rsp+0x56]
      da361b:	66 89 43 58          	mov    WORD PTR [rbx+0x58],ax
      da361f:	48 83 c3 60          	add    rbx,0x60
      da3623:	e9 b4 00 00 00       	jmp    da36dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70762>
      da3628:	4d 8b 07             	mov    r8,QWORD PTR [r15]
      da362b:	4c 29 c3             	sub    rbx,r8
      da362e:	48 89 d8             	mov    rax,rbx
      da3631:	48 99                	cqo
      da3633:	6a 60                	push   0x60
      da3635:	41 5a                	pop    r10
      da3637:	49 f7 fa             	idiv   r10
      da363a:	48 8d 70 01          	lea    rsi,[rax+0x1]
      da363e:	49 b9 aa aa aa aa aa 	movabs r9,0x2aaaaaaaaaaaaaa

### 0xda3bdf; FDE=(14301588, 14305243)
Strings: array::at
      da3b77:	e8 78 66 ff ff       	call   d9a1f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6727a>
      da3b7c:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      da3b83:	00 
      da3b84:	e8 fd a8 cf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      da3b89:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
      da3b8e:	80 bd b0 00 00 00 00 	cmp    BYTE PTR [rbp+0xb0],0x0
      da3b95:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
      da3b9a:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
      da3b9f:	0f 84 6b 02 00 00    	je     da3e10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70e96>
      da3ba5:	48 8b bd 98 00 00 00 	mov    rdi,QWORD PTR [rbp+0x98]
      da3bac:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      da3baf:	ff 50 20             	call   QWORD PTR [rax+0x20]
      da3bb2:	8a 40 58             	mov    al,BYTE PTR [rax+0x58]
      da3bb5:	48 8d 9c 24 8f 00 00 	lea    rbx,[rsp+0x8f]
      da3bbc:	00 
      da3bbd:	88 03                	mov    BYTE PTR [rbx],al
      da3bbf:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      da3bc3:	48 89 ef             	mov    rdi,rbp
      da3bc6:	ff 50 38             	call   QWORD PTR [rax+0x38]
      da3bc9:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      da3bcc:	48 89 c7             	mov    rdi,rax
      da3bcf:	ff 51 48             	call   QWORD PTR [rcx+0x48]
      da3bd2:	49 89 c6             	mov    r14,rax
      da3bd5:	48 8b bd 98 00 00 00 	mov    rdi,QWORD PTR [rbp+0x98]
      da3bdc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      da3bdf:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      da3be5:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
      da3bea:	4c 89 e7             	mov    rdi,r12
      da3bed:	4c 89 f6             	mov    rsi,r14
      da3bf0:	48 89 c2             	mov    rdx,rax
      da3bf3:	48 89 d9             	mov    rcx,rbx
      da3bf6:	e8 73 5e 40 00       	call   11a9a6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x370e84>
      da3bfb:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
      da3c00:	0f 57 c0             	xorps  xmm0,xmm0
      da3c03:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      da3c06:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
      da3c0a:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
      da3c0e:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
      da3c13:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      da3c17:	49 39 c7             	cmp    r15,rax
      da3c1a:	0f 84 01 02 00 00    	je     da3e21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70ea7>
      da3c20:	48 8d 9c 24 98 00 00 	lea    rbx,[rsp+0x98]
      da3c27:	00 
      da3c28:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
      da3c2d:	4c 8d ac 24 08 01 00 	lea    r13,[rsp+0x108]
      da3c34:	00 
      da3c35:	48 8b bd 98 00 00 00 	mov    rdi,QWORD PTR [rbp+0x98]
      da3c3c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      da3c3f:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      da3c45:	4d 8d 77 04          	lea    r14,[r15+0x4]
      da3c49:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      da3c4c:	48 89 df             	mov    rdi,rbx
      da3c4f:	48 89 c6             	mov    rsi,rax
      da3c52:	4c 89 f2             	mov    rdx,r14
      da3c55:	ff 51 10             	call   QWORD PTR [rcx+0x10]
      da3c58:	48 8b 9c 24 98 00 00 	mov    rbx,QWORD PTR [rsp+0x98]
      da3c5f:	00 
      da3c60:	48 8b ac 24 a0 00 00 	mov    rbp,QWORD PTR [rsp+0xa0]
      da3c67:	00 
      da3c68:	48 39 eb             	cmp    rbx,rbp
      da3c6b:	0f 84 c3 00 00 00    	je     da3d34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70dba>
      da3c71:	4c 89 ef             	mov    rdi,r13
      da3c74:	48 89 de             	mov    rsi,rbx
      da3c77:	e8 15 42 70 00       	call   14a7e91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ed415>
      da3c7c:	80 bc 24 1c 01 00 00 	cmp    BYTE PTR [rsp+0x11c],0x0
      da3c83:	00 
      da3c84:	0f 84 98 00 00 00    	je     da3d22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70da8>
      da3c8a:	6a 40                	push   0x40
      da3c8c:	5f                   	pop    rdi
      da3c8d:	e8 6e a2 a4 00       	call   17edf00 <_Znwm@plt>
      da3c92:	49 89 c6             	mov    r14,rax

### 0xdaa3b3; FDE=(14327386, 14329097)
Strings: ,net-fortune/v2/fortune | bandwidth | latency | stutter | bitrate | request_type | content_type | did_downgrade | 1 | Cache-Control | no-cache, no-store
      daa34f:	e8 04 f9 83 00       	call   15e9c58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f1dc>
      daa354:	48 8d 05 15 e9 a7 00 	lea    rax,[rip+0xa7e915]        # 1828c70 <_ZTIN4asio2ip16bad_address_castE@@Base+0x52a0>
      daa35b:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
      daa362:	00 
      daa363:	49 89 04 24          	mov    QWORD PTR [r12],rax
      daa367:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
      daa36c:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      daa371:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      daa374:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      daa377:	4c 89 e6             	mov    rsi,r12
      daa37a:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      daa380:	48 8d 05 31 e9 a7 00 	lea    rax,[rip+0xa7e931]        # 1828cb8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x52e8>
      daa387:	4c 8d ac 24 d0 00 00 	lea    r13,[rsp+0xd0]
      daa38e:	00 
      daa38f:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      daa393:	49 89 5d 08          	mov    QWORD PTR [r13+0x8],rbx
      daa397:	4d 89 6d 20          	mov    QWORD PTR [r13+0x20],r13
      daa39b:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      daa39e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      daa3a1:	4c 89 ee             	mov    rsi,r13
      daa3a4:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      daa3aa:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      daa3ad:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      daa3b0:	6a 01                	push   0x1
      daa3b2:	5e                   	pop    rsi
      daa3b3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      daa3b9:	49 8b 36             	mov    rsi,QWORD PTR [r14]
      daa3bc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      daa3bf:	48 8d 6c 24 70       	lea    rbp,[rsp+0x70]
      daa3c4:	48 89 ef             	mov    rdi,rbp
      daa3c7:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
      daa3cd:	4c 89 ff             	mov    rdi,r15
      daa3d0:	48 89 ee             	mov    rsi,rbp
      daa3d3:	e8 44 f4 d0 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      daa3d8:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
      daa3dc:	e8 a5 40 cf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      daa3e1:	4c 89 ef             	mov    rdi,r13
      daa3e4:	e8 81 fb cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      daa3e9:	4c 89 e7             	mov    rdi,r12
      daa3ec:	e8 79 fb cc ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      daa3f1:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      daa3f6:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      daa3fd:	e8 b0 40 cf ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      daa402:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      daa407:	e8 84 3a a4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      daa40c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      daa411:	e8 7a 3a a4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      daa416:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      daa41b:	e8 70 3a a4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      daa420:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      daa424:	e8 5d 40 cf ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      daa429:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]
      daa430:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      daa433:	ff 50 10             	call   QWORD PTR [rax+0x10]
      daa436:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
      daa43d:	00 
      daa43e:	e8 4d 3a a4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      daa443:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      daa44a:	00 00 
      daa44c:	48 3b 84 24 30 01 00 	cmp    rax,QWORD PTR [rsp+0x130]
      daa453:	00 
      daa454:	0f 85 a5 00 00 00    	jne    daa4ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77585>
      daa45a:	48 81 c4 38 01 00 00 	add    rsp,0x138
      daa461:	5b                   	pop    rbx
      daa462:	41 5c                	pop    r12
      daa464:	41 5d                	pop    r13
      daa466:	41 5e                	pop    r14
      daa468:	41 5f                	pop    r15
      daa46a:	5d                   	pop    rbp
      daa46b:	c3                   	ret
      daa46c:	eb 20                	jmp    daa48e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x77514>

### 0xdbc4e3; FDE=(14400956, 14404741)
Strings: .spotify.com | .spotify.net | traffic.megaphone.fm | Accept-Encoding | Cache-Control | no-cache, no-store | https:// | x-playback-id | x-segment-timestamp-ms | Requesting whole file | 
bytes | Range | Requesting data (%d -> %d) | unknown
      dbc481:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
      dbc485:	4d 85 ed             	test   r13,r13
      dbc488:	74 05                	je     dbc48f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89515>
      dbc48a:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      dbc48f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      dbc494:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      dbc498:	48 89 68 20          	mov    QWORD PTR [rax+0x20],rbp
      dbc49c:	44 88 78 28          	mov    BYTE PTR [rax+0x28],r15b
      dbc4a0:	8b 8c 24 e1 00 00 00 	mov    ecx,DWORD PTR [rsp+0xe1]
      dbc4a7:	8b 94 24 e4 00 00 00 	mov    edx,DWORD PTR [rsp+0xe4]
      dbc4ae:	89 48 29             	mov    DWORD PTR [rax+0x29],ecx
      dbc4b1:	89 50 2c             	mov    DWORD PTR [rax+0x2c],edx
      dbc4b4:	4c 8d a4 24 10 01 00 	lea    r12,[rsp+0x110]
      dbc4bb:	00 
      dbc4bc:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      dbc4c1:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
      dbc4c8:	00 
      dbc4c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc4cc:	4c 89 e6             	mov    rsi,r12
      dbc4cf:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      dbc4d5:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
      dbc4dc:	00 
      dbc4dd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc4e0:	6a 01                	push   0x1
      dbc4e2:	5e                   	pop    rsi
      dbc4e3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dbc4e9:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
      dbc4f0:	00 00 
      dbc4f2:	66 0f 7f 84 24 90 00 	movdqa XMMWORD PTR [rsp+0x90],xmm0
      dbc4f9:	00 00 
      dbc4fb:	66 0f ef c0          	pxor   xmm0,xmm0
      dbc4ff:	66 0f 7f 84 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm0
      dbc506:	00 00 
      dbc508:	4c 89 e7             	mov    rdi,r12
      dbc50b:	e8 5a da cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbc510:	4c 89 ef             	mov    rdi,r13
      dbc513:	e8 6e 1f ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbc518:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      dbc51f:	00 
      dbc520:	e8 45 da cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbc525:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      dbc52c:	00 
      dbc52d:	e8 38 da cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbc532:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
      dbc539:	00 
      dbc53a:	e8 2b da cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbc53f:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
      dbc546:	00 
      dbc547:	e8 9e ed d3 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
      dbc54c:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
      dbc550:	48 81 c7 d0 01 00 00 	add    rdi,0x1d0
      dbc557:	e8 70 22 ce ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      dbc55c:	48 83 c3 d0          	add    rbx,0xffffffffffffffd0
      dbc560:	48 83 fb d0          	cmp    rbx,0xffffffffffffffd0
      dbc564:	75 e6                	jne    dbc54c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x895d2>
      dbc566:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
      dbc56d:	00 
      dbc56e:	e8 13 1f ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbc573:	41 80 be 78 01 00 00 	cmp    BYTE PTR [r14+0x178],0x0
      dbc57a:	00 
      dbc57b:	0f 84 83 00 00 00    	je     dbc604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8968a>
      dbc581:	48 8d 35 ac bd 5a ff 	lea    rsi,[rip+0xffffffffff5abdac]        # 368334 <_ZTSSt12bad_any_cast@@Base-0x27e94>
      dbc588:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      dbc58d:	e8 e0 61 d3 ff       	call   af2772 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f712>
      dbc592:	84 c0                	test   al,al
      dbc594:	74 6e                	je     dbc604 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8968a>
      dbc596:	48 8d 35 87 44 61 ff 	lea    rsi,[rip+0xffffffffff614487]        # 3d0a24 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1878>
      dbc59d:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      dbc5a2:	e8 d7 d4 cb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dbc5a7:	49 8d b6 d0 02 00 00 	lea    rsi,[r14+0x2d0]
      dbc5ae:	48 8d 9c 24 d0 01 00 	lea    rbx,[rsp+0x1d0]

### 0xdbe6fc; FDE=(14410902, 14412186)
Strings: sequence-proxy/spotify.sequenceproxy.v1.SequenceProxyService/ResolveAudioManifest | cache-control | no-cache | Content-Type | application/x-protobuf | Accept
      dbe690:	e8 e9 b3 cb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dbe695:	48 8d 35 94 ae 67 ff 	lea    rsi,[rip+0xffffffffff67ae94]        # 439530 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ef7f>
      dbe69c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      dbe6a1:	e8 d8 b3 cb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dbe6a6:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      dbe6ad:	00 
      dbe6ae:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
      dbe6b3:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      dbe6b8:	e8 ab b3 82 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      dbe6bd:	48 8d 35 5c c3 67 ff 	lea    rsi,[rip+0xffffffffff67c35c]        # 43aa20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x62c>
      dbe6c4:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      dbe6c9:	e8 72 f8 a2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      dbe6ce:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]
      dbe6d5:	00 
      dbe6d6:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      dbe6db:	4c 89 f7             	mov    rdi,r14
      dbe6de:	e8 47 b2 82 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
      dbe6e3:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      dbe6e7:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      dbe6ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbe6ed:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dbe6f3:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      dbe6f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbe6f9:	6a 01                	push   0x1
      dbe6fb:	5e                   	pop    rsi
      dbe6fc:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dbe702:	0f 10 83 18 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x118]
      dbe709:	48 8b 83 20 01 00 00 	mov    rax,QWORD PTR [rbx+0x120]
      dbe710:	48 85 c0             	test   rax,rax
      dbe713:	74 05                	je     dbe71a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b7a0>
      dbe715:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      dbe71a:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]
      dbe721:	00 
      dbe722:	4c 89 f7             	mov    rdi,r14
      dbe725:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      dbe729:	e8 2a b5 82 00       	call   15e9c58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f1dc>
      dbe72e:	48 8d 05 93 af a6 00 	lea    rax,[rip+0xa6af93]        # 18296c8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5cf8>
      dbe735:	4c 8d bc 24 70 01 00 	lea    r15,[rsp+0x170]
      dbe73c:	00 
      dbe73d:	49 89 07             	mov    QWORD PTR [r15],rax
      dbe740:	49 89 5f 08          	mov    QWORD PTR [r15+0x8],rbx
      dbe744:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      dbe748:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      dbe74b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbe74e:	4c 89 fe             	mov    rsi,r15
      dbe751:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      dbe757:	48 8d 05 b2 af a6 00 	lea    rax,[rip+0xa6afb2]        # 1829710 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5d40>
      dbe75e:	4c 8d a4 24 40 01 00 	lea    r12,[rsp+0x140]
      dbe765:	00 
      dbe766:	49 89 04 24          	mov    QWORD PTR [r12],rax
      dbe76a:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
      dbe76f:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      dbe774:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      dbe777:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbe77a:	4c 89 e6             	mov    rsi,r12
      dbe77d:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      dbe783:	49 8b 36             	mov    rsi,QWORD PTR [r14]
      dbe786:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      dbe789:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
      dbe790:	00 
      dbe791:	4c 89 ef             	mov    rdi,r13
      dbe794:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
      dbe79a:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
      dbe7a1:	4c 89 ee             	mov    rsi,r13
      dbe7a4:	e8 73 b0 cf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      dbe7a9:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      dbe7ad:	e8 d4 fc cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbe7b2:	4c 89 e7             	mov    rdi,r12
      dbe7b5:	e8 b0 b7 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dbe7ba:	4c 89 ff             	mov    rdi,r15
      dbe7bd:	e8 a8 b7 cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0xdc005f; FDE=(14416694, 14418753)
Strings: unknown | Reading head file from cache | Accept-Encoding | https:// | x-playback-id | Requesting head file from CDN url: %s  | head_file_latency
      dbfff5:	31 ff                	xor    edi,edi
      dbfff7:	e8 8a e4 cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbfffc:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      dc0001:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc0004:	4c 89 fe             	mov    rsi,r15
      dc0007:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      dc000d:	0f 10 83 a8 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1a8]
      dc0014:	48 8b 83 b0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1b0]
      dc001b:	48 85 c0             	test   rax,rax
      dc001e:	74 05                	je     dc0025 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d0ab>
      dc0020:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      dc0025:	48 8d 05 ac 98 a6 00 	lea    rax,[rip+0xa698ac]        # 18298d8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x5f08>
      dc002c:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
      dc0033:	00 
      dc0034:	49 89 04 24          	mov    QWORD PTR [r12],rax
      dc0038:	41 0f 11 44 24 08    	movups XMMWORD PTR [r12+0x8],xmm0
      dc003e:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      dc0043:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      dc0048:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc004b:	4c 89 e6             	mov    rsi,r12
      dc004e:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      dc0054:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      dc0059:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc005c:	6a 01                	push   0x1
      dc005e:	5e                   	pop    rsi
      dc005f:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dc0065:	4c 8b 7c 24 40       	mov    r15,QWORD PTR [rsp+0x40]
      dc006a:	0f 28 44 24 40       	movaps xmm0,XMMWORD PTR [rsp+0x40]
      dc006f:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      dc0074:	0f 57 c0             	xorps  xmm0,xmm0
      dc0077:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
      dc007c:	4c 89 e7             	mov    rdi,r12
      dc007f:	e8 e6 9e cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc0084:	31 ff                	xor    edi,edi
      dc0086:	e8 fb e3 cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dc008b:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
      dc0092:	00 
      dc0093:	e8 d2 9e cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc0098:	31 ff                	xor    edi,edi
      dc009a:	e8 e7 e3 cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dc009f:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      dc00a6:	00 
      dc00a7:	e8 be 9e cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc00ac:	31 ff                	xor    edi,edi
      dc00ae:	e8 d3 e3 cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dc00b3:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
      dc00ba:	00 
      dc00bb:	e8 aa 9e cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc00c0:	31 ff                	xor    edi,edi
      dc00c2:	e8 bf e3 cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dc00c7:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      dc00cc:	e8 bf dd a2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dc00d1:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      dc00d6:	e8 b5 dd a2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dc00db:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      dc00e0:	e8 ab dd a2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dc00e5:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      dc00ea:	e8 97 e3 cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dc00ef:	80 bb d8 01 00 00 00 	cmp    BYTE PTR [rbx+0x1d8],0x0
      dc00f6:	0f 84 87 00 00 00    	je     dc0183 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d209>
      dc00fc:	48 8d 35 31 82 5a ff 	lea    rsi,[rip+0xffffffffff5a8231]        # 368334 <_ZTSSt12bad_any_cast@@Base-0x27e94>
      dc0103:	4c 89 f7             	mov    rdi,r14
      dc0106:	e8 67 26 d3 ff       	call   af2772 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f712>
      dc010b:	84 c0                	test   al,al
      dc010d:	74 74                	je     dc0183 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d209>
      dc010f:	48 8d 35 9a 09 61 ff 	lea    rsi,[rip+0xffffffffff61099a]        # 3d0ab0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1904>
      dc0116:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
      dc011d:	00 
      dc011e:	e8 5b 99 cb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dc0123:	48 8d 73 44          	lea    rsi,[rbx+0x44]
      dc0127:	4c 8d b4 24 70 01 00 	lea    r14,[rsp+0x170]

### 0xdc701d; FDE=(14445930, 14447178)
Strings: offline | interactive_prefetch | interactive | storage-resolve/v2/files/audio/ | / | ?product=0 | &partner= | cache-control | no-cache
      dc6fb1:	00 
      dc6fb2:	4c 89 ff             	mov    rdi,r15
      dc6fb5:	e8 d6 6e a2 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dc6fba:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      dc6fbf:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
      dc6fc4:	e8 35 2a 82 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
      dc6fc9:	48 8d 35 74 63 5b ff 	lea    rsi,[rip+0xffffffffff5b6374]        # 37d344 <_ZTSSt12bad_any_cast@@Base-0x12e84>
      dc6fd0:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      dc6fd5:	e8 a4 2a cb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dc6fda:	48 8d 35 4a b6 58 ff 	lea    rsi,[rip+0xffffffffff58b64a]        # 35262b <_ZTSSt12bad_any_cast@@Base-0x3db9d>
      dc6fe1:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      dc6fe6:	e8 93 2a cb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dc6feb:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
      dc6ff0:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      dc6ff5:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
      dc6ffa:	4c 89 e7             	mov    rdi,r12
      dc6ffd:	e8 66 2a 82 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      dc7002:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
      dc7006:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      dc700a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc700d:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dc7013:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      dc7017:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc701a:	6a 01                	push   0x1
      dc701c:	5e                   	pop    rsi
      dc701d:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dc7023:	0f 10 83 08 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x108]
      dc702a:	48 8b 83 10 01 00 00 	mov    rax,QWORD PTR [rbx+0x110]
      dc7031:	48 85 c0             	test   rax,rax
      dc7034:	74 05                	je     dc703b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x940c1>
      dc7036:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      dc703b:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
      dc7040:	4c 89 e7             	mov    rdi,r12
      dc7043:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      dc7047:	e8 0c 2c 82 00       	call   15e9c58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f1dc>
      dc704c:	48 8d 05 55 2c a6 00 	lea    rax,[rip+0xa62c55]        # 1829ca8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x62d8>
      dc7053:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
      dc705a:	00 
      dc705b:	48 89 9c 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rbx
      dc7062:	00 
      dc7063:	4c 89 b4 24 90 01 00 	mov    QWORD PTR [rsp+0x190],r14
      dc706a:	00 
      dc706b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      dc706f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc7072:	4c 89 f6             	mov    rsi,r14
      dc7075:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      dc707b:	48 8d 05 6e 2c a6 00 	lea    rax,[rip+0xa62c6e]        # 1829cf0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6320>
      dc7082:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
      dc7089:	00 
      dc708a:	48 89 9c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rbx
      dc7091:	00 
      dc7092:	4c 89 bc 24 60 01 00 	mov    QWORD PTR [rsp+0x160],r15
      dc7099:	00 
      dc709a:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
      dc709e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc70a1:	4c 89 fe             	mov    rsi,r15
      dc70a4:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      dc70aa:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
      dc70ae:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      dc70b1:	4c 8d 6c 24 70       	lea    r13,[rsp+0x70]
      dc70b6:	4c 89 ef             	mov    rdi,r13
      dc70b9:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
      dc70bf:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
      dc70c6:	4c 89 ee             	mov    rsi,r13
      dc70c9:	e8 4e 27 cf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      dc70ce:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      dc70d2:	e8 af 73 cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dc70d7:	4c 89 ff             	mov    rdi,r15
      dc70da:	e8 8b 2e cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      dc70df:	4c 89 f7             	mov    rdi,r14
      dc70e2:	e8 83 2e cb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0xdc81a3; FDE=(14450918, 14451526)
Strings: cache-control | no-cache
      dc8131:	48 8d b3 d0 00 00 00 	lea    rsi,[rbx+0xd0]
      dc8138:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      dc813d:	e8 fe 5d a2 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      dc8142:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      dc8147:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
      dc814c:	e8 43 18 82 00       	call   15e9994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef18>
      dc8151:	48 8d 35 ec 51 5b ff 	lea    rsi,[rip+0xffffffffff5b51ec]        # 37d344 <_ZTSSt12bad_any_cast@@Base-0x12e84>
      dc8158:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      dc815d:	e8 1c 19 cb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dc8162:	48 8d 35 c2 a4 58 ff 	lea    rsi,[rip+0xffffffffff58a4c2]        # 35262b <_ZTSSt12bad_any_cast@@Base-0x3db9d>
      dc8169:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      dc816e:	e8 0b 19 cb ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dc8173:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
      dc8178:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      dc817d:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
      dc8182:	4c 89 f7             	mov    rdi,r14
      dc8185:	e8 de 18 82 00       	call   15e9a68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42efec>
      dc818a:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
      dc818e:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      dc8191:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc8194:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dc819a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      dc819d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dc81a0:	6a 01                	push   0x1
      dc81a2:	5e                   	pop    rsi
      dc81a3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dc81a9:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
      dc81ad:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
      dc81b1:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      dc81b5:	4d 85 ff             	test   r15,r15
      dc81b8:	74 05                	je     dc81bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95245>
      dc81ba:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      dc81bf:	0f 57 c0             	xorps  xmm0,xmm0
      dc81c2:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      dc81c7:	4c 8d b4 24 c0 00 00 	lea    r14,[rsp+0xc0]
      dc81ce:	00 
      dc81cf:	48 89 e6             	mov    rsi,rsp
      dc81d2:	4c 89 f7             	mov    rdi,r14
      dc81d5:	e8 56 31 ce ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
      dc81da:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      dc81df:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      dc81e3:	66 0f 7f 84 24 90 00 	movdqa XMMWORD PTR [rsp+0x90],xmm0
      dc81ea:	00 00 
      dc81ec:	48 85 c0             	test   rax,rax
      dc81ef:	74 05                	je     dc81f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9527c>
      dc81f1:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      dc81f6:	66 48 0f 3a 16 c5 01 	pextrq rbp,xmm0,0x1
      dc81fd:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      dc8202:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
      dc8209:	00 
      dc820a:	4c 89 e7             	mov    rdi,r12
      dc820d:	4c 89 ee             	mov    rsi,r13
      dc8210:	e8 c1 01 d1 ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>
      dc8215:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      dc8219:	e8 94 62 cd ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      dc821e:	4c 89 ff             	mov    rdi,r15
      dc8221:	e8 8c 62 cd ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      dc8226:	48 89 ef             	mov    rdi,rbp
      dc8229:	e8 58 62 cd ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dc822e:	41 0f 28 04 24       	movaps xmm0,XMMWORD PTR [r12]
      dc8233:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
      dc8238:	4c 89 ff             	mov    rdi,r15
      dc823b:	e8 18 1a 82 00       	call   15e9c58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f1dc>
      dc8240:	48 8d 05 61 1b a6 00 	lea    rax,[rip+0xa61b61]        # 1829da8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x63d8>
      dc8247:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      dc824e:	00 
      dc824f:	48 89 9c 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rbx
      dc8256:	00 
      dc8257:	4c 89 b4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r14
      dc825e:	00 
      dc825f:	49 8b 3f             	mov    rdi,QWORD PTR [r15]

### 0xdee2fc; FDE=(14596108, 14619287)
Strings: gaia.known_zeroconf | gaia.max_known_zeroconf | connect.preferred_login_types | connect.debug_level | connect.dial_devices | connect.mdns_devices | 3.2.6 |  ( | ) | audio/dj | X-Transfer-Encoding | Content-Encoding | connect | Discovery disabled | cpp-connect-discovery_api | gaia-zeroconf-fetchinfo | gaia-zeroconf-login | cpp-connect-http_connection_tracker | gaia-dial | cast | _network:  | connect_mdns | /f
      dee299:	49 8b 06             	mov    rax,QWORD PTR [r14]
      dee29c:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
      dee2a3:	00 
      dee2a4:	48 8d 94 24 c0 07 00 	lea    rdx,[rsp+0x7c0]
      dee2ab:	00 
      dee2ac:	4c 89 f6             	mov    rsi,r14
      dee2af:	ff 50 18             	call   QWORD PTR [rax+0x18]
      dee2b2:	48 8d 35 16 21 59 ff 	lea    rsi,[rip+0xffffffffff592116]        # 3803cf <_ZTSSt12bad_any_cast@@Base-0xfdf9>
      dee2b9:	48 8d bc 24 a0 07 00 	lea    rdi,[rsp+0x7a0]
      dee2c0:	00 
      dee2c1:	e8 b8 b7 c8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dee2c6:	48 8d 9c 24 d0 11 00 	lea    rbx,[rsp+0x11d0]
      dee2cd:	00 
      dee2ce:	4c 8d b4 24 a0 07 00 	lea    r14,[rsp+0x7a0]
      dee2d5:	00 
      dee2d6:	48 89 df             	mov    rdi,rbx
      dee2d9:	4c 89 f6             	mov    rsi,r14
      dee2dc:	e8 e1 b9 7f 00       	call   15e9cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f246>
      dee2e1:	48 8b b5 68 01 00 00 	mov    rsi,QWORD PTR [rbp+0x168]
      dee2e8:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee2eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee2ee:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dee2f4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee2f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee2fa:	31 f6                	xor    esi,esi
      dee2fc:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dee302:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      dee306:	f3 0f 7f 85 a0 02 00 	movdqu XMMWORD PTR [rbp+0x2a0],xmm0
      dee30d:	00 
      dee30e:	66 0f ef c0          	pxor   xmm0,xmm0
      dee312:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
      dee316:	4c 89 f7             	mov    rdi,r14
      dee319:	e8 72 fb 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dee31e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dee322:	e8 5f 01 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dee327:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
      dee32e:	00 
      dee32f:	e8 5c fb 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dee334:	4d 8b 34 24          	mov    r14,QWORD PTR [r12]
      dee338:	48 8d 35 85 84 57 ff 	lea    rsi,[rip+0xffffffffff578485]        # 3667c4 <_ZTSSt12bad_any_cast@@Base-0x29a04>
      dee33f:	48 8d bc 24 80 07 00 	lea    rdi,[rsp+0x780]
      dee346:	00 
      dee347:	e8 32 b7 c8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dee34c:	49 8b 06             	mov    rax,QWORD PTR [r14]
      dee34f:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
      dee356:	00 
      dee357:	48 8d 94 24 80 07 00 	lea    rdx,[rsp+0x780]
      dee35e:	00 
      dee35f:	4c 89 f6             	mov    rsi,r14
      dee362:	ff 50 18             	call   QWORD PTR [rax+0x18]
      dee365:	48 8d 35 c3 ae 56 ff 	lea    rsi,[rip+0xffffffffff56aec3]        # 35922f <_ZTSSt12bad_any_cast@@Base-0x36f99>
      dee36c:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
      dee373:	00 
      dee374:	e8 05 b7 c8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dee379:	48 8d 9c 24 d0 11 00 	lea    rbx,[rsp+0x11d0]
      dee380:	00 
      dee381:	4c 8d b4 24 60 07 00 	lea    r14,[rsp+0x760]
      dee388:	00 
      dee389:	48 89 df             	mov    rdi,rbx
      dee38c:	4c 89 f6             	mov    rsi,r14
      dee38f:	e8 2e b9 7f 00       	call   15e9cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f246>
      dee394:	48 8b b5 68 01 00 00 	mov    rsi,QWORD PTR [rbp+0x168]
      dee39b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee39e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee3a1:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dee3a7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee3aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee3ad:	31 f6                	xor    esi,esi
      dee3af:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dee3b5:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      dee3b9:	f3 0f 7f 85 b0 02 00 	movdqu XMMWORD PTR [rbp+0x2b0],xmm0

### 0xdee3af; FDE=(14596108, 14619287)
Strings: gaia.known_zeroconf | gaia.max_known_zeroconf | connect.preferred_login_types | connect.debug_level | connect.dial_devices | connect.mdns_devices | 3.2.6 |  ( | ) | audio/dj | X-Transfer-Encoding | Content-Encoding | connect | Discovery disabled | cpp-connect-discovery_api | gaia-zeroconf-fetchinfo | gaia-zeroconf-login | cpp-connect-http_connection_tracker | gaia-dial | cast | _network:  | connect_mdns | /f
      dee34c:	49 8b 06             	mov    rax,QWORD PTR [r14]
      dee34f:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
      dee356:	00 
      dee357:	48 8d 94 24 80 07 00 	lea    rdx,[rsp+0x780]
      dee35e:	00 
      dee35f:	4c 89 f6             	mov    rsi,r14
      dee362:	ff 50 18             	call   QWORD PTR [rax+0x18]
      dee365:	48 8d 35 c3 ae 56 ff 	lea    rsi,[rip+0xffffffffff56aec3]        # 35922f <_ZTSSt12bad_any_cast@@Base-0x36f99>
      dee36c:	48 8d bc 24 60 07 00 	lea    rdi,[rsp+0x760]
      dee373:	00 
      dee374:	e8 05 b7 c8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dee379:	48 8d 9c 24 d0 11 00 	lea    rbx,[rsp+0x11d0]
      dee380:	00 
      dee381:	4c 8d b4 24 60 07 00 	lea    r14,[rsp+0x760]
      dee388:	00 
      dee389:	48 89 df             	mov    rdi,rbx
      dee38c:	4c 89 f6             	mov    rsi,r14
      dee38f:	e8 2e b9 7f 00       	call   15e9cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f246>
      dee394:	48 8b b5 68 01 00 00 	mov    rsi,QWORD PTR [rbp+0x168]
      dee39b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee39e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee3a1:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dee3a7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee3aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee3ad:	31 f6                	xor    esi,esi
      dee3af:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dee3b5:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      dee3b9:	f3 0f 7f 85 b0 02 00 	movdqu XMMWORD PTR [rbp+0x2b0],xmm0
      dee3c0:	00 
      dee3c1:	66 0f ef c0          	pxor   xmm0,xmm0
      dee3c5:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
      dee3c9:	4c 89 f7             	mov    rdi,r14
      dee3cc:	e8 bf fa 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dee3d1:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dee3d5:	e8 ac 00 cb ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dee3da:	48 8d bc 24 80 07 00 	lea    rdi,[rsp+0x780]
      dee3e1:	00 
      dee3e2:	e8 a9 fa 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dee3e7:	4c 89 ad c0 02 00 00 	mov    QWORD PTR [rbp+0x2c0],r13
      dee3ee:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
      dee3f5:	00 
      dee3f6:	48 89 85 c8 02 00 00 	mov    QWORD PTR [rbp+0x2c8],rax
      dee3fd:	c6 85 d0 02 00 00 00 	mov    BYTE PTR [rbp+0x2d0],0x0
      dee404:	f3 41 0f 6f 0c 24    	movdqu xmm1,XMMWORD PTR [r12]
      dee40a:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
      dee40f:	48 85 c0             	test   rax,rax
      dee412:	74 05                	je     dee419 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbb49f>
      dee414:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      dee419:	4c 8b bc 24 30 14 00 	mov    r15,QWORD PTR [rsp+0x1430]
      dee420:	00 
      dee421:	4c 89 bd d8 02 00 00 	mov    QWORD PTR [rbp+0x2d8],r15
      dee428:	66 0f ef c0          	pxor   xmm0,xmm0
      dee42c:	f3 0f 7f 85 e0 02 00 	movdqu XMMWORD PTR [rbp+0x2e0],xmm0
      dee433:	00 
      dee434:	f3 0f 7f 85 f0 02 00 	movdqu XMMWORD PTR [rbp+0x2f0],xmm0
      dee43b:	00 
      dee43c:	c7 85 00 03 00 00 00 	mov    DWORD PTR [rbp+0x300],0x3f800000
      dee443:	00 80 3f 
      dee446:	f3 0f 7f 8d 08 03 00 	movdqu XMMWORD PTR [rbp+0x308],xmm1
      dee44d:	00 
      dee44e:	48 8d 35 7f 06 54 ff 	lea    rsi,[rip+0xffffffffff54067f]        # 32ead4 <_ZTSSt12bad_any_cast@@Base-0x616f4>
      dee455:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
      dee45c:	00 
      dee45d:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      dee463:	e8 16 b6 c8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dee468:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      dee46e:	66 48 0f 7e c6       	movq   rsi,xmm0
      dee473:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      dee476:	48 8d 9c 24 a0 11 00 	lea    rbx,[rsp+0x11a0]
      dee47d:	00 
      dee47e:	48 8d 94 24 d0 11 00 	lea    rdx,[rsp+0x11d0]

### 0xdee4fa; FDE=(14596108, 14619287)
Strings: gaia.known_zeroconf | gaia.max_known_zeroconf | connect.preferred_login_types | connect.debug_level | connect.dial_devices | connect.mdns_devices | 3.2.6 |  ( | ) | audio/dj | X-Transfer-Encoding | Content-Encoding | connect | Discovery disabled | cpp-connect-discovery_api | gaia-zeroconf-fetchinfo | gaia-zeroconf-login | cpp-connect-http_connection_tracker | gaia-dial | cast | _network:  | connect_mdns | /f
      dee497:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee49a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee49d:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
      dee4a3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee4a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee4a9:	be 20 4e 00 00       	mov    esi,0x4e20
      dee4ae:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      dee4b4:	48 8d 35 00 74 54 ff 	lea    rsi,[rip+0xffffffffff547400]        # 3358bb <_ZTSSt12bad_any_cast@@Base-0x5a90d>
      dee4bb:	48 8d bc 24 10 13 00 	lea    rdi,[rsp+0x1310]
      dee4c2:	00 
      dee4c3:	e8 b6 b5 c8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dee4c8:	48 8d 9c 24 a0 11 00 	lea    rbx,[rsp+0x11a0]
      dee4cf:	00 
      dee4d0:	4c 8d b4 24 10 13 00 	lea    r14,[rsp+0x1310]
      dee4d7:	00 
      dee4d8:	48 89 df             	mov    rdi,rbx
      dee4db:	4c 89 f6             	mov    rsi,r14
      dee4de:	e8 df b7 7f 00       	call   15e9cc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f246>
      dee4e3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee4e6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee4e9:	4c 89 fe             	mov    rsi,r15
      dee4ec:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dee4f2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee4f5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee4f8:	31 f6                	xor    esi,esi
      dee4fa:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      dee500:	0f 28 03             	movaps xmm0,XMMWORD PTR [rbx]
      dee503:	0f 11 85 18 03 00 00 	movups XMMWORD PTR [rbp+0x318],xmm0
      dee50a:	0f 57 c0             	xorps  xmm0,xmm0
      dee50d:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
      dee510:	4c 89 f7             	mov    rdi,r14
      dee513:	e8 78 f9 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dee518:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      dee51c:	e8 65 ff ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dee521:	48 8d bc 24 d0 11 00 	lea    rdi,[rsp+0x11d0]
      dee528:	00 
      dee529:	e8 62 f9 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dee52e:	48 8b b4 24 68 02 00 	mov    rsi,QWORD PTR [rsp+0x268]
      dee535:	00 
      dee536:	48 8d 9c 24 a0 11 00 	lea    rbx,[rsp+0x11a0]
      dee53d:	00 
      dee53e:	48 89 df             	mov    rdi,rbx
      dee541:	e8 60 b3 7f 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      dee546:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dee549:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dee54c:	4c 89 fe             	mov    rsi,r15
      dee54f:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      dee555:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      dee559:	f3 0f 7f 85 28 03 00 	movdqu XMMWORD PTR [rbp+0x328],xmm0
      dee560:	00 
      dee561:	31 ff                	xor    edi,edi
      dee563:	e8 1e ff ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dee568:	4c 8b b5 08 03 00 00 	mov    r14,QWORD PTR [rbp+0x308]
      dee56f:	48 8d 35 45 73 54 ff 	lea    rsi,[rip+0xffffffffff547345]        # 3358bb <_ZTSSt12bad_any_cast@@Base-0x5a90d>
      dee576:	48 8d bc 24 a0 11 00 	lea    rdi,[rsp+0x11a0]
      dee57d:	00 
      dee57e:	e8 fb b4 c8 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      dee583:	49 8b 06             	mov    rax,QWORD PTR [r14]
      dee586:	48 8d 9c 24 a0 11 00 	lea    rbx,[rsp+0x11a0]
      dee58d:	00 
      dee58e:	6a 28                	push   0x28
      dee590:	5a                   	pop    rdx
      dee591:	4c 89 f7             	mov    rdi,r14
      dee594:	48 89 de             	mov    rsi,rbx
      dee597:	31 c9                	xor    ecx,ecx
      dee599:	ff 50 10             	call   QWORD PTR [rax+0x10]
      dee59c:	48 89 df             	mov    rdi,rbx
      dee59f:	e8 ec f8 9f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      dee5a4:	31 ff                	xor    edi,edi
      dee5a6:	e8 db fe ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dee5ab:	48 8d bd 38 03 00 00 	lea    rdi,[rbp+0x338]

### 0xdf35f1; FDE=(14628320, 14628378)
      df35ad:	5b                   	pop    rbx
      df35ae:	41 5c                	pop    r12
      df35b0:	41 5d                	pop    r13
      df35b2:	41 5e                	pop    r14
      df35b4:	41 5f                	pop    r15
      df35b6:	5d                   	pop    rbp
      df35b7:	c3                   	ret
      df35b8:	e8 f3 c4 9f 00       	call   17efab0 <__stack_chk_fail@plt>
      df35bd:	eb 08                	jmp    df35c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc064d>
      df35bf:	48 89 c7             	mov    rdi,rax
      df35c2:	e8 de 64 c8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      df35c7:	83 fa 02             	cmp    edx,0x2
      df35ca:	75 f3                	jne    df35bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0645>
      df35cc:	48 89 c7             	mov    rdi,rax
      df35cf:	e8 9c a8 9f 00       	call   17ede70 <__cxa_begin_catch@plt>
      df35d4:	e8 b7 af 9f 00       	call   17ee590 <__cxa_end_catch@plt>
      df35d9:	e9 b7 fe ff ff       	jmp    df3495 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc051b>
      df35de:	eb df                	jmp    df35bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0645>
      df35e0:	41 56                	push   r14
      df35e2:	53                   	push   rbx
      df35e3:	50                   	push   rax
      df35e4:	49 89 ce             	mov    r14,rcx
      df35e7:	48 89 fb             	mov    rbx,rdi
      df35ea:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
      df35ee:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      df35f1:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      df35f7:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      df35fa:	e8 65 5e cc ff       	call   ab9464 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6404>
      df35ff:	48 89 df             	mov    rdi,rbx
      df3602:	e8 2a e1 7e 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
      df3607:	48 89 d8             	mov    rax,rbx
      df360a:	48 83 c4 08          	add    rsp,0x8
      df360e:	5b                   	pop    rbx
      df360f:	41 5e                	pop    r14
      df3611:	c3                   	ret
      df3612:	48 89 c7             	mov    rdi,rax
      df3615:	e8 8b 64 c8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      df361a:	41 56                	push   r14
      df361c:	53                   	push   rbx
      df361d:	50                   	push   rax
      df361e:	49 89 ce             	mov    r14,rcx
      df3621:	48 89 fb             	mov    rbx,rdi
      df3624:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
      df3628:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      df362b:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
      df3631:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      df3634:	e8 2b 5e cc ff       	call   ab9464 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6404>
      df3639:	48 89 df             	mov    rdi,rbx
      df363c:	e8 f0 e0 7e 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
      df3641:	48 89 d8             	mov    rax,rbx
      df3644:	48 83 c4 08          	add    rsp,0x8
      df3648:	5b                   	pop    rbx
      df3649:	41 5e                	pop    r14
      df364b:	c3                   	ret
      df364c:	48 89 c7             	mov    rdi,rax
      df364f:	e8 51 64 c8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      df3654:	41 56                	push   r14
      df3656:	53                   	push   rbx
      df3657:	50                   	push   rax
      df3658:	49 89 ce             	mov    r14,rcx
      df365b:	48 89 fb             	mov    rbx,rdi
      df365e:	48 8b 7e 20          	mov    rdi,QWORD PTR [rsi+0x20]
      df3662:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      df3665:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
      df366b:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      df366e:	e8 f1 5d cc ff       	call   ab9464 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6404>
      df3673:	48 89 df             	mov    rdi,rbx
      df3676:	e8 b6 e0 7e 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
      df367b:	48 89 d8             	mov    rax,rbx
      df367e:	48 83 c4 08          	add    rsp,0x8
      df3682:	5b                   	pop    rbx

### 0xdf8b5e; FDE=(14645486, 14651961)
      df8b04:	48 89 c2             	mov    rdx,rax
      df8b07:	e8 8e 16 94 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
      df8b0c:	6a 40                	push   0x40
      df8b0e:	5f                   	pop    rdi
      df8b0f:	e8 ec 53 9f 00       	call   17edf00 <_Znwm@plt>
      df8b14:	49 89 c4             	mov    r12,rax
      df8b17:	0f 57 c0             	xorps  xmm0,xmm0
      df8b1a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      df8b1e:	48 8d 05 83 4c a0 00 	lea    rax,[rip+0xa04c83]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>
      df8b25:	49 89 04 24          	mov    QWORD PTR [r12],rax
      df8b29:	4d 89 e5             	mov    r13,r12
      df8b2c:	49 83 c5 18          	add    r13,0x18
      df8b30:	4c 89 ef             	mov    rdi,r13
      df8b33:	4c 89 fe             	mov    rsi,r15
      df8b36:	e8 51 8f 7e 00       	call   15e1a8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427010>
      df8b3b:	4c 8d 7c 24 18       	lea    r15,[rsp+0x18]
      df8b40:	4d 89 2f             	mov    QWORD PTR [r15],r13
      df8b43:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
      df8b47:	49 8b 06             	mov    rax,QWORD PTR [r14]
      df8b4a:	4c 8d a4 24 a0 01 00 	lea    r12,[rsp+0x1a0]
      df8b51:	00 
      df8b52:	48 89 df             	mov    rdi,rbx
      df8b55:	4c 89 f6             	mov    rsi,r14
      df8b58:	4c 89 e2             	mov    rdx,r12
      df8b5b:	4c 89 f9             	mov    rcx,r15
      df8b5e:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      df8b64:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      df8b68:	e8 19 59 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      df8b6d:	4c 89 e7             	mov    rdi,r12
      df8b70:	e8 cb d0 6a 00       	call   14a5c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eb1c4>
      df8b75:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
      df8b7c:	00 
      df8b7d:	e8 be d0 6a 00       	call   14a5c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2eb1c4>
      df8b82:	e9 79 fd ff ff       	jmp    df8900 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5986>
      df8b87:	0f 18 0d a2 14 b3 00 	prefetcht0 BYTE PTR [rip+0xb314a2]        # 192a030 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71440>
      df8b8e:	48 8d 3d 9b 14 b3 00 	lea    rdi,[rip+0xb3149b]        # 192a030 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71440>
      df8b95:	48 8b 05 9c 14 b3 00 	mov    rax,QWORD PTR [rip+0xb3149c]        # 192a038 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71448>
      df8b9c:	0f 18 08             	prefetcht0 BYTE PTR [rax]
      df8b9f:	e8 46 60 95 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
      df8ba4:	48 8d b4 24 f0 03 00 	lea    rsi,[rsp+0x3f0]
      df8bab:	00 
      df8bac:	48 8d 84 24 80 02 00 	lea    rax,[rsp+0x280]
      df8bb3:	00 
      df8bb4:	48 89 d7             	mov    rdi,rdx
      df8bb7:	48 89 c2             	mov    rdx,rax
      df8bba:	e8 db 15 94 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
      df8bbf:	48 8d bc 24 08 01 00 	lea    rdi,[rsp+0x108]
      df8bc6:	00 
      df8bc7:	4c 89 fe             	mov    rsi,r15
      df8bca:	e8 6a 1d cb ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
      df8bcf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      df8bd2:	4c 8d bc 24 f0 03 00 	lea    r15,[rsp+0x3f0]
      df8bd9:	00 
      df8bda:	4c 8d a4 24 08 01 00 	lea    r12,[rsp+0x108]
      df8be1:	00 
      df8be2:	48 89 df             	mov    rdi,rbx
      df8be5:	4c 89 f6             	mov    rsi,r14
      df8be8:	4c 89 fa             	mov    rdx,r15
      df8beb:	4c 89 e1             	mov    rcx,r12
      df8bee:	ff 50 58             	call   QWORD PTR [rax+0x58]
      df8bf1:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      df8bf6:	e8 8b 58 ca ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      df8bfb:	4c 89 ff             	mov    rdi,r15
      df8bfe:	e8 0b 1f cb ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      df8c03:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
      df8c0a:	00 
      df8c0b:	e8 fe 1e cb ff       	call   aaab0e <JNI_OnUnload@@Base+0x323db>
      df8c10:	e9 eb fc ff ff       	jmp    df8900 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5986>
      df8c15:	0f 18 0d 64 16 b3 00 	prefetcht0 BYTE PTR [rip+0xb31664]        # 192a280 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71690>
      df8c1c:	48 8d 3d 5d 16 b3 00 	lea    rdi,[rip+0xb3165d]        # 192a280 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71690>
      df8c23:	48 8b 05 5e 16 b3 00 	mov    rax,QWORD PTR [rip+0xb3165e]        # 192a288 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x71698>

### 0xe03839; FDE=(14694342, 14694516)
      e037dc:	00 00 
      e037de:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
      e037e5:	00 
      e037e6:	48 8b 5f 10          	mov    rbx,QWORD PTR [rdi+0x10]
      e037ea:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e037ef:	e8 28 0c 00 00       	call   e0441c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd14a2>
      e037f4:	31 c0                	xor    eax,eax
      e037f6:	88 04 24             	mov    BYTE PTR [rsp],al
      e037f9:	88 44 24 18          	mov    BYTE PTR [rsp+0x18],al
      e037fd:	41 38 46 18          	cmp    BYTE PTR [r14+0x18],al
      e03801:	74 22                	je     e03825 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd08ab>
      e03803:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      e03807:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e0380c:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      e03810:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      e03814:	0f 57 c0             	xorps  xmm0,xmm0
      e03817:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      e0381b:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e03820:	c6 44 24 18 01       	mov    BYTE PTR [rsp+0x18],0x1
      e03825:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e03828:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
      e0382d:	49 89 e7             	mov    r15,rsp
      e03830:	48 89 df             	mov    rdi,rbx
      e03833:	4c 89 f6             	mov    rsi,r14
      e03836:	4c 89 fa             	mov    rdx,r15
      e03839:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      e0383f:	4c 89 ff             	mov    rdi,r15
      e03842:	e8 e9 34 ca ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e03847:	4c 89 f7             	mov    rdi,r14
      e0384a:	e8 67 15 ff ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
      e0384f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e03856:	00 00 
      e03858:	48 3b 84 24 88 01 00 	cmp    rax,QWORD PTR [rsp+0x188]
      e0385f:	00 
      e03860:	75 0d                	jne    e0386f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd08f5>
      e03862:	48 81 c4 90 01 00 00 	add    rsp,0x190
      e03869:	5b                   	pop    rbx
      e0386a:	41 5e                	pop    r14
      e0386c:	41 5f                	pop    r15
      e0386e:	c3                   	ret
      e0386f:	e8 3c c2 9e 00       	call   17efab0 <__stack_chk_fail@plt>
      e03874:	41 57                	push   r15
      e03876:	41 56                	push   r14
      e03878:	53                   	push   rbx
      e03879:	48 81 ec 90 01 00 00 	sub    rsp,0x190
      e03880:	49 89 d6             	mov    r14,rdx
      e03883:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e0388a:	00 00 
      e0388c:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
      e03893:	00 
      e03894:	48 8b 5f 10          	mov    rbx,QWORD PTR [rdi+0x10]
      e03898:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e0389d:	e8 7a 0b 00 00       	call   e0441c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd14a2>
      e038a2:	31 c0                	xor    eax,eax
      e038a4:	88 04 24             	mov    BYTE PTR [rsp],al
      e038a7:	88 44 24 18          	mov    BYTE PTR [rsp+0x18],al
      e038ab:	41 38 46 18          	cmp    BYTE PTR [r14+0x18],al
      e038af:	74 22                	je     e038d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0959>
      e038b1:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      e038b5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e038ba:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      e038be:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      e038c2:	0f 57 c0             	xorps  xmm0,xmm0
      e038c5:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      e038c9:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e038ce:	c6 44 24 18 01       	mov    BYTE PTR [rsp+0x18],0x1
      e038d3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e038d6:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
      e038db:	49 89 e7             	mov    r15,rsp
      e038de:	48 89 df             	mov    rdi,rbx
      e038e1:	4c 89 f6             	mov    rsi,r14

### 0xe0a6c7; FDE=(14721974, 14723048)
Strings: set sleep timer | 0
      e0a66f:	00 
      e0a670:	4c 8d b4 24 60 02 00 	lea    r14,[rsp+0x260]
      e0a677:	00 
      e0a678:	4c 89 e7             	mov    rdi,r12
      e0a67b:	48 89 de             	mov    rsi,rbx
      e0a67e:	4c 89 fa             	mov    rdx,r15
      e0a681:	4c 89 e9             	mov    rcx,r13
      e0a684:	4d 89 f0             	mov    r8,r14
      e0a687:	ff 50 48             	call   QWORD PTR [rax+0x48]
      e0a68a:	4c 89 f7             	mov    rdi,r14
      e0a68d:	e8 d8 f8 c6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e0a692:	48 89 df             	mov    rdi,rbx
      e0a695:	e8 1c a7 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
      e0a69a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      e0a69f:	eb 34                	jmp    e0a6d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd775b>
      e0a6a1:	48 8b 9b 40 03 00 00 	mov    rbx,QWORD PTR [rbx+0x340]
      e0a6a8:	4c 8d bc 24 90 02 00 	lea    r15,[rsp+0x290]
      e0a6af:	00 
      e0a6b0:	4c 89 ff             	mov    rdi,r15
      e0a6b3:	4c 89 e6             	mov    rsi,r12
      e0a6b6:	e8 c7 d3 85 00       	call   1667a82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbee>
      e0a6bb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e0a6be:	48 89 df             	mov    rdi,rbx
      e0a6c1:	4c 89 fe             	mov    rsi,r15
      e0a6c4:	4c 89 f2             	mov    rdx,r14
      e0a6c7:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      e0a6cd:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      e0a6d4:	00 
      e0a6d5:	e8 fe 18 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      e0a6da:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e0a6df:	e8 7c 40 9e 00       	call   17ee760 <free@plt>
      e0a6e4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e0a6eb:	00 00 
      e0a6ed:	48 3b 84 24 d8 03 00 	cmp    rax,QWORD PTR [rsp+0x3d8]
      e0a6f4:	00 
      e0a6f5:	0f 85 e8 00 00 00    	jne    e0a7e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7869>
      e0a6fb:	48 81 c4 e0 03 00 00 	add    rsp,0x3e0
      e0a702:	5b                   	pop    rbx
      e0a703:	41 5c                	pop    r12
      e0a705:	41 5d                	pop    r13
      e0a707:	41 5e                	pop    r14
      e0a709:	41 5f                	pop    r15
      e0a70b:	c3                   	ret
      e0a70c:	48 8d 35 dd 9f be 00 	lea    rsi,[rip+0xbe9fdd]        # 19f46f0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x27af>
      e0a713:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
      e0a71a:	00 
      e0a71b:	e8 fc 37 02 00       	call   e2df1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfafa2>
      e0a720:	48 8d 35 66 82 56 ff 	lea    rsi,[rip+0xffffffffff568266]        # 37298d <_ZTSSt12bad_any_cast@@Base-0x1d83b>
      e0a727:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
      e0a72e:	00 
      e0a72f:	e8 28 38 02 00       	call   e2df5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfafe2>
      e0a734:	e9 ab fd ff ff       	jmp    e0a4e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd756a>
      e0a739:	48 89 c3             	mov    rbx,rax
      e0a73c:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
      e0a743:	00 
      e0a744:	e8 47 37 9e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e0a749:	eb 5a                	jmp    e0a7a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd782b>
      e0a74b:	48 89 c3             	mov    rbx,rax
      e0a74e:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
      e0a755:	00 
      e0a756:	e8 5b a6 fe ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
      e0a75b:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      e0a760:	eb 0b                	jmp    e0a76d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd77f3>
      e0a762:	48 89 c3             	mov    rbx,rax
      e0a765:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
      e0a76c:	00 
      e0a76d:	e8 66 18 86 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      e0a772:	eb 4a                	jmp    e0a7be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7844>
      e0a774:	eb 27                	jmp    e0a79d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd7823>
      e0a776:	48 89 c3             	mov    rbx,rax
      e0a779:	48 8d bc 24 70 03 00 	lea    rdi,[rsp+0x370]

### 0xe1f6c1; FDE=(14808498, 14808820)
Strings: connect | Connection lost but someone was active so restoring last blob | core.connection_lost
      e1f661:	31 c0                	xor    eax,eax
      e1f663:	41 88 06             	mov    BYTE PTR [r14],al
      e1f666:	41 88 46 18          	mov    BYTE PTR [r14+0x18],al
      e1f66a:	0f 57 c0             	xorps  xmm0,xmm0
      e1f66d:	41 0f 29 46 e8       	movaps XMMWORD PTR [r14-0x18],xmm0
      e1f672:	41 83 66 f8 00       	and    DWORD PTR [r14-0x8],0x0
      e1f677:	41 c7 46 e8 01 00 00 	mov    DWORD PTR [r14-0x18],0x1
      e1f67e:	00 
      e1f67f:	48 8d 35 4b 70 54 ff 	lea    rsi,[rip+0xffffffffff54704b]        # 3666d1 <_ZTSSt12bad_any_cast@@Base-0x29af7>
      e1f686:	49 89 e7             	mov    r15,rsp
      e1f689:	6a 14                	push   0x14
      e1f68b:	5a                   	pop    rdx
      e1f68c:	4c 89 ff             	mov    rdi,r15
      e1f68f:	e8 d8 7c ff ff       	call   e1736c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe43f2>
      e1f694:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
      e1f69b:	00 
      e1f69c:	48 89 df             	mov    rdi,rbx
      e1f69f:	4c 89 fe             	mov    rsi,r15
      e1f6a2:	e8 75 7d ff ff       	call   e1741c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe44a2>
      e1f6a7:	4c 89 ff             	mov    rdi,r15
      e1f6aa:	e8 07 57 fd ff       	call   df4db6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1e3c>
      e1f6af:	4c 89 f7             	mov    rdi,r14
      e1f6b2:	e8 79 76 c8 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e1f6b7:	48 8b bb a8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1a8]
      e1f6be:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e1f6c1:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      e1f6c7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e1f6ce:	00 00 
      e1f6d0:	48 3b 84 24 98 01 00 	cmp    rax,QWORD PTR [rsp+0x198]
      e1f6d7:	00 
      e1f6d8:	75 0d                	jne    e1f6e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec76d>
      e1f6da:	48 81 c4 a0 01 00 00 	add    rsp,0x1a0
      e1f6e1:	5b                   	pop    rbx
      e1f6e2:	41 5e                	pop    r14
      e1f6e4:	41 5f                	pop    r15
      e1f6e6:	c3                   	ret
      e1f6e7:	e8 c4 03 9d 00       	call   17efab0 <__stack_chk_fail@plt>
      e1f6ec:	48 89 c7             	mov    rdi,rax
      e1f6ef:	e8 b1 a3 c5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e1f6f4:	41 57                	push   r15
      e1f6f6:	41 56                	push   r14
      e1f6f8:	53                   	push   rbx
      e1f6f9:	48 83 ec 70          	sub    rsp,0x70
      e1f6fd:	49 89 f6             	mov    r14,rsi
      e1f700:	48 89 fb             	mov    rbx,rdi
      e1f703:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e1f70a:	00 00 
      e1f70c:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
      e1f711:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      e1f716:	c6 07 07             	mov    BYTE PTR [rdi],0x7
      e1f719:	0f 57 c0             	xorps  xmm0,xmm0
      e1f71c:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
      e1f720:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
      e1f725:	e8 71 37 9a 00       	call   17c2e9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177007>
      e1f72a:	84 c0                	test   al,al
      e1f72c:	74 6e                	je     e1f79c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec822>
      e1f72e:	48 8d 35 e8 f1 50 ff 	lea    rsi,[rip+0xffffffffff50f1e8]        # 32e91d <_ZTSSt12bad_any_cast@@Base-0x618ab>
      e1f735:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      e1f73a:	e8 05 51 9a 00       	call   17c4844 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1789b0>
      e1f73f:	48 8d 35 36 28 63 ff 	lea    rsi,[rip+0xffffffffff632836]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e1f746:	48 89 c7             	mov    rdi,rax
      e1f749:	e8 f4 3f 9a 00       	call   17c3742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778ae>
      e1f74e:	49 89 c7             	mov    r15,rax
      e1f751:	48 89 c7             	mov    rdi,rax
      e1f754:	e8 b7 e7 9c 00       	call   17edf10 <strlen@plt>
      e1f759:	48 85 c0             	test   rax,rax
      e1f75c:	74 3e                	je     e1f79c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec822>
      e1f75e:	0f 57 c0             	xorps  xmm0,xmm0
      e1f761:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      e1f766:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      e1f769:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0

### 0xe81bd3; FDE=(15210796, 15211999)
Strings: hm://
      e81b72:	49 89 07             	mov    QWORD PTR [r15],rax
      e81b75:	4c 89 ff             	mov    rdi,r15
      e81b78:	48 83 c7 10          	add    rdi,0x10
      e81b7c:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
      e81b83:	00 
      e81b84:	e8 07 87 bf ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e81b89:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      e81b90:	00 
      e81b91:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e81b95:	4c 8d a4 24 00 01 00 	lea    r12,[rsp+0x100]
      e81b9c:	00 
      e81b9d:	4d 89 7c 24 20       	mov    QWORD PTR [r12+0x20],r15
      e81ba2:	e8 23 87 bf ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e81ba7:	4c 8d bc 24 90 01 00 	lea    r15,[rsp+0x190]
      e81bae:	00 
      e81baf:	4c 89 ff             	mov    rdi,r15
      e81bb2:	e8 b3 83 bf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e81bb7:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      e81bbc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e81bbf:	4c 89 e6             	mov    rsi,r12
      e81bc2:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
      e81bc8:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      e81bcd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e81bd0:	6a 01                	push   0x1
      e81bd2:	5e                   	pop    rsi
      e81bd3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      e81bd9:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      e81bde:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e81be1:	4c 89 f6             	mov    rsi,r14
      e81be4:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
      e81bea:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
      e81bef:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e81bf2:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
      e81bf7:	4c 89 f7             	mov    rdi,r14
      e81bfa:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
      e81c00:	4c 89 e7             	mov    rdi,r12
      e81c03:	e8 62 83 bf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e81c08:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      e81c0f:	00 
      e81c10:	e8 55 83 bf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e81c15:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
      e81c1c:	00 
      e81c1d:	e8 48 83 bf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e81c22:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      e81c29:	00 
      e81c2a:	e8 3b 83 bf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e81c2f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e81c34:	e8 57 c2 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e81c39:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      e81c40:	00 
      e81c41:	e8 a4 96 c7 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
      e81c46:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      e81c4b:	e8 40 c2 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e81c50:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      e81c55:	e8 36 c2 96 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e81c5a:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      e81c5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e81c60:	ff 50 10             	call   QWORD PTR [rax+0x10]
      e81c63:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      e81c67:	0f 57 c9             	xorps  xmm1,xmm1
      e81c6a:	41 0f 29 0e          	movaps XMMWORD PTR [r14],xmm1
      e81c6e:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      e81c72:	48 8d 05 7b cc c2 ff 	lea    rax,[rip+0xffffffffffc2cc7b]        # aae8f4 <JNI_OnUnload@@Base+0x361c1>
      e81c79:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      e81c7d:	48 8d 05 0c f5 c1 ff 	lea    rax,[rip+0xffffffffffc1f50c]        # aa1190 <JNI_OnUnload@@Base+0x28a5d>
      e81c84:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e81c88:	4c 8d bc 24 90 01 00 	lea    r15,[rsp+0x190]
      e81c8f:	00 
      e81c90:	48 89 df             	mov    rdi,rbx
      e81c93:	4c 89 fe             	mov    rsi,r15
      e81c96:	e8 25 d4 84 00       	call   16cf0c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8322c>

### 0xe8441a; FDE=(15221570, 15221857)
      e843bf:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      e843c4:	40 f6 c5 02          	test   bpl,0x2
      e843c8:	75 04                	jne    e843ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b7e4>
      e843ca:	31 c0                	xor    eax,eax
      e843cc:	eb 0a                	jmp    e843d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b7ee>
      e843ce:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
      e843d3:	e8 f6 4c 48 00       	call   13090ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e652>
      e843d8:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      e843dd:	41 8a 44 24 28       	mov    al,BYTE PTR [r12+0x28]
      e843e2:	88 44 24 38          	mov    BYTE PTR [rsp+0x38],al
      e843e6:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      e843ea:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
      e843ee:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      e843f2:	48 85 c0             	test   rax,rax
      e843f5:	74 05                	je     e843fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b812>
      e843f7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e843fc:	4d 85 ed             	test   r13,r13
      e843ff:	4d 0f 45 f5          	cmovne r14,r13
      e84403:	49 8b 06             	mov    rax,QWORD PTR [r14]
      e84406:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
      e8440b:	49 89 e4             	mov    r12,rsp
      e8440e:	48 89 df             	mov    rdi,rbx
      e84411:	4c 89 f6             	mov    rsi,r14
      e84414:	4c 89 fa             	mov    rdx,r15
      e84417:	4c 89 e1             	mov    rcx,r12
      e8441a:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      e84420:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e84425:	e8 5c a0 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e8442a:	4c 89 ff             	mov    rdi,r15
      e8442d:	e8 98 44 83 00       	call   16b88ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca36>
      e84432:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e84439:	00 00 
      e8443b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      e84440:	75 12                	jne    e84454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b86a>
      e84442:	48 89 d8             	mov    rax,rbx
      e84445:	48 83 c4 48          	add    rsp,0x48
      e84449:	5b                   	pop    rbx
      e8444a:	41 5c                	pop    r12
      e8444c:	41 5d                	pop    r13
      e8444e:	41 5e                	pop    r14
      e84450:	41 5f                	pop    r15
      e84452:	5d                   	pop    rbp
      e84453:	c3                   	ret
      e84454:	e8 57 b6 96 00       	call   17efab0 <__stack_chk_fail@plt>
      e84459:	48 89 c7             	mov    rdi,rax
      e8445c:	e8 44 56 bf ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e84461:	cc                   	int3
      e84462:	55                   	push   rbp
      e84463:	41 57                	push   r15
      e84465:	41 56                	push   r14
      e84467:	41 55                	push   r13
      e84469:	41 54                	push   r12
      e8446b:	53                   	push   rbx
      e8446c:	48 83 ec 78          	sub    rsp,0x78
      e84470:	49 89 cf             	mov    r15,rcx
      e84473:	49 89 d4             	mov    r12,rdx
      e84476:	48 89 fb             	mov    rbx,rdi
      e84479:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e84480:	00 00 
      e84482:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e84487:	4c 8b 76 28          	mov    r14,QWORD PTR [rsi+0x28]
      e8448b:	48 8b 6e 38          	mov    rbp,QWORD PTR [rsi+0x38]
      e8448f:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
      e84495:	48 8d 05 04 e4 a1 00 	lea    rax,[rip+0xa1e404]        # 18a28a0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xf7e0>
      e8449c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e844a1:	48 8b 72 08          	mov    rsi,QWORD PTR [rdx+0x8]
      e844a5:	40 f6 c6 01          	test   sil,0x1
      e844a9:	74 12                	je     e844bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b8d3>
      e844ab:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      e844b0:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
      e844b4:	48 83 c6 08          	add    rsi,0x8

### 0xe88bfd; FDE=(15239660, 15240330)
      e88b99:	4c 89 ef             	mov    rdi,r13
      e88b9c:	e8 e1 ee 7d 00       	call   1667a82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbee>
      e88ba1:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      e88ba5:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      e88ba9:	48 85 c0             	test   rax,rax
      e88bac:	74 05                	je     e88bb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ffc9>
      e88bae:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      e88bb3:	48 8d 05 b6 81 9a 00 	lea    rax,[rip+0x9a81b6]        # 1830d70 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2d08>
      e88bba:	48 8d 8c 24 b0 01 00 	lea    rcx,[rsp+0x1b0]
      e88bc1:	00 
      e88bc2:	48 89 01             	mov    QWORD PTR [rcx],rax
      e88bc5:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
      e88bc9:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      e88bcd:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e88bd2:	4c 8b 60 20          	mov    r12,QWORD PTR [rax+0x20]
      e88bd6:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
      e88bdd:	00 
      e88bde:	4c 89 ee             	mov    rsi,r13
      e88be1:	e8 c4 ee 7d 00       	call   1667aaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc16>
      e88be6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e88bea:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
      e88bf1:	00 
      e88bf2:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
      e88bf9:	00 
      e88bfa:	4c 89 e7             	mov    rdi,r12
      e88bfd:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      e88c03:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
      e88c0a:	00 
      e88c0b:	e8 c8 33 7e 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      e88c10:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      e88c17:	00 
      e88c18:	e8 4d 13 bf ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e88c1d:	31 ff                	xor    edi,edi
      e88c1f:	e8 8e 58 c1 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e88c24:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      e88c28:	0f 57 c9             	xorps  xmm1,xmm1
      e88c2b:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
      e88c2f:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      e88c32:	31 ff                	xor    edi,edi
      e88c34:	e8 4d 58 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e88c39:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      e88c3e:	e8 95 33 7e 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      e88c43:	eb 06                	jmp    e88c4b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50061>
      e88c45:	0f 57 c0             	xorps  xmm0,xmm0
      e88c48:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      e88c4b:	4c 89 ff             	mov    rdi,r15
      e88c4e:	e8 85 33 7e 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      e88c53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e88c5a:	00 00 
      e88c5c:	48 3b 84 24 b0 02 00 	cmp    rax,QWORD PTR [rsp+0x2b0]
      e88c63:	00 
      e88c64:	75 15                	jne    e88c7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50091>
      e88c66:	48 89 d8             	mov    rax,rbx
      e88c69:	48 81 c4 b8 02 00 00 	add    rsp,0x2b8
      e88c70:	5b                   	pop    rbx
      e88c71:	41 5c                	pop    r12
      e88c73:	41 5d                	pop    r13
      e88c75:	41 5e                	pop    r14
      e88c77:	41 5f                	pop    r15
      e88c79:	5d                   	pop    rbp
      e88c7a:	c3                   	ret
      e88c7b:	e8 30 6e 96 00       	call   17efab0 <__stack_chk_fail@plt>
      e88c80:	eb 00                	jmp    e88c82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50098>
      e88c82:	48 89 c7             	mov    rdi,rax
      e88c85:	e8 1b 0e bf ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e88c8a:	80 4f 10 01          	or     BYTE PTR [rdi+0x10],0x1
      e88c8e:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      e88c92:	48 85 c0             	test   rax,rax
      e88c95:	74 01                	je     e88c98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x500ae>
      e88c97:	c3                   	ret
      e88c98:	53                   	push   rbx

### 0xeca8ef; FDE=(15509666, 15509857)
      eca894:	48 89 df             	mov    rdi,rbx
      eca897:	e8 34 54 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      eca89c:	e8 0f 52 92 00       	call   17efab0 <__stack_chk_fail@plt>
      eca8a1:	cc                   	int3
      eca8a2:	41 57                	push   r15
      eca8a4:	41 56                	push   r14
      eca8a6:	53                   	push   rbx
      eca8a7:	48 81 ec 10 01 00 00 	sub    rsp,0x110
      eca8ae:	49 89 d6             	mov    r14,rdx
      eca8b1:	49 89 ff             	mov    r15,rdi
      eca8b4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      eca8bb:	00 00 
      eca8bd:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
      eca8c4:	00 
      eca8c5:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
      eca8c9:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      eca8ce:	e8 af d1 79 00       	call   1667a82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbee>
      eca8d3:	48 89 e7             	mov    rdi,rsp
      eca8d6:	4c 89 fe             	mov    rsi,r15
      eca8d9:	4c 89 f2             	mov    rdx,r14
      eca8dc:	e8 3b 01 00 00       	call   ecaa1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91e32>
      eca8e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      eca8e4:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
      eca8e9:	48 89 e2             	mov    rdx,rsp
      eca8ec:	48 89 df             	mov    rdi,rbx
      eca8ef:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      eca8f5:	48 89 e7             	mov    rdi,rsp
      eca8f8:	e8 6d f6 ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      eca8fd:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      eca902:	e8 d1 16 7a 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      eca907:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      eca90e:	00 00 
      eca910:	48 3b 84 24 08 01 00 	cmp    rax,QWORD PTR [rsp+0x108]
      eca917:	00 
      eca918:	75 42                	jne    eca95c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91d72>
      eca91a:	48 81 c4 10 01 00 00 	add    rsp,0x110
      eca921:	5b                   	pop    rbx
      eca922:	41 5e                	pop    r14
      eca924:	41 5f                	pop    r15
      eca926:	c3                   	ret
      eca927:	48 89 c3             	mov    rbx,rax
      eca92a:	48 89 e7             	mov    rdi,rsp
      eca92d:	e8 38 f6 ba ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      eca932:	eb 03                	jmp    eca937 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91d4d>
      eca934:	48 89 c3             	mov    rbx,rax
      eca937:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      eca93c:	e8 97 16 7a 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      eca941:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      eca948:	00 00 
      eca94a:	48 3b 84 24 08 01 00 	cmp    rax,QWORD PTR [rsp+0x108]
      eca951:	00 
      eca952:	75 08                	jne    eca95c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91d72>
      eca954:	48 89 df             	mov    rdi,rbx
      eca957:	e8 74 53 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      eca95c:	e8 4f 51 92 00       	call   17efab0 <__stack_chk_fail@plt>
      eca961:	cc                   	int3
      eca962:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      eca966:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      eca969:	ff a0 d8 00 00 00    	jmp    QWORD PTR [rax+0xd8]
      eca96f:	cc                   	int3
      eca970:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      eca974:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      eca977:	ff a0 e0 00 00 00    	jmp    QWORD PTR [rax+0xe0]
      eca97d:	cc                   	int3
      eca97e:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      eca982:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      eca985:	48 8b 80 f8 00 00 00 	mov    rax,QWORD PTR [rax+0xf8]
      eca98c:	ff e0                	jmp    rax
      eca98e:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      eca992:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      eca995:	48 8b 80 00 01 00 00 	mov    rax,QWORD PTR [rax+0x100]

### 0xecb5f3; FDE=(15513014, 15513168)
      ecb596:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecb59d:	00 00 
      ecb59f:	48 3b 84 24 d8 00 00 	cmp    rax,QWORD PTR [rsp+0xd8]
      ecb5a6:	00 
      ecb5a7:	75 08                	jne    ecb5b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x929c7>
      ecb5a9:	48 89 df             	mov    rdi,rbx
      ecb5ac:	e8 1f 47 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ecb5b1:	e8 fa 44 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ecb5b6:	41 57                	push   r15
      ecb5b8:	41 56                	push   r14
      ecb5ba:	53                   	push   rbx
      ecb5bb:	48 81 ec e0 00 00 00 	sub    rsp,0xe0
      ecb5c2:	48 89 d3             	mov    rbx,rdx
      ecb5c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecb5cc:	00 00 
      ecb5ce:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
      ecb5d5:	00 
      ecb5d6:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
      ecb5da:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      ecb5df:	4c 89 ff             	mov    rdi,r15
      ecb5e2:	e8 9b c4 79 00       	call   1667a82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbee>
      ecb5e7:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ecb5ea:	4c 89 f7             	mov    rdi,r14
      ecb5ed:	4c 89 fe             	mov    rsi,r15
      ecb5f0:	48 89 da             	mov    rdx,rbx
      ecb5f3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      ecb5f9:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ecb5fe:	e8 d5 09 7a 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      ecb603:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecb60a:	00 00 
      ecb60c:	48 3b 84 24 d8 00 00 	cmp    rax,QWORD PTR [rsp+0xd8]
      ecb613:	00 
      ecb614:	75 35                	jne    ecb64b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92a61>
      ecb616:	48 81 c4 e0 00 00 00 	add    rsp,0xe0
      ecb61d:	5b                   	pop    rbx
      ecb61e:	41 5e                	pop    r14
      ecb620:	41 5f                	pop    r15
      ecb622:	c3                   	ret
      ecb623:	48 89 c3             	mov    rbx,rax
      ecb626:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      ecb62b:	e8 a8 09 7a 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
      ecb630:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ecb637:	00 00 
      ecb639:	48 3b 84 24 d8 00 00 	cmp    rax,QWORD PTR [rsp+0xd8]
      ecb640:	00 
      ecb641:	75 08                	jne    ecb64b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92a61>
      ecb643:	48 89 df             	mov    rdi,rbx
      ecb646:	e8 85 46 ba ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ecb64b:	e8 60 44 92 00       	call   17efab0 <__stack_chk_fail@plt>
      ecb650:	53                   	push   rbx
      ecb651:	48 89 fb             	mov    rbx,rdi
      ecb654:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      ecb658:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ecb65b:	ff 90 10 01 00 00    	call   QWORD PTR [rax+0x110]
      ecb661:	48 89 d8             	mov    rax,rbx
      ecb664:	5b                   	pop    rbx
      ecb665:	c3                   	ret
      ecb666:	41 57                	push   r15
      ecb668:	41 56                	push   r14
      ecb66a:	53                   	push   rbx
      ecb66b:	49 89 f7             	mov    r15,rsi
      ecb66e:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
      ecb671:	49 8d 5e 30          	lea    rbx,[r14+0x30]
      ecb675:	48 89 df             	mov    rdi,rbx
      ecb678:	e8 fb fc 79 00       	call   166b378 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f4e4>
      ecb67d:	41 80 bf 30 09 00 00 	cmp    BYTE PTR [r15+0x930],0x0
      ecb684:	00 
      ecb685:	74 63                	je     ecb6ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92b00>
      ecb687:	49 8d bf f0 04 00 00 	lea    rdi,[r15+0x4f0]
      ecb68e:	48 8d 35 63 bd 56 ff 	lea    rsi,[rip+0xffffffffff56bd63]        # 4373f8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ce47>
      ecb695:	e8 ea ef fb ff       	call   e8a684 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a9a>

### 0xf16b42; FDE=(15821354, 15822114)
      f16ae2:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      f16ae7:	49 8d 7d 08          	lea    rdi,[r13+0x8]
      f16aeb:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      f16aef:	e8 42 80 bc ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      f16af4:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
      f16af9:	4d 85 f6             	test   r14,r14
      f16afc:	74 5a                	je     f16b58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xddf6e>
      f16afe:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f16b03:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
      f16b07:	4c 89 ac 24 60 01 00 	mov    QWORD PTR [rsp+0x160],r13
      f16b0e:	00 
      f16b0f:	4c 89 b4 24 68 01 00 	mov    QWORD PTR [rsp+0x168],r14
      f16b16:	00 
      f16b17:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f16b1c:	eb 4f                	jmp    f16b6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xddf83>
      f16b1e:	48 89 df             	mov    rdi,rbx
      f16b21:	4c 89 fe             	mov    rsi,r15
      f16b24:	e8 b7 fa ff ff       	call   f165e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdd9f6>
      f16b29:	e9 49 01 00 00       	jmp    f16c77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde08d>
      f16b2e:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      f16b31:	49 8d 56 18          	lea    rdx,[r14+0x18]
      f16b35:	49 83 c6 38          	add    r14,0x38
      f16b39:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f16b3c:	48 89 df             	mov    rdi,rbx
      f16b3f:	4c 89 f1             	mov    rcx,r14
      f16b42:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      f16b48:	e9 2a 01 00 00       	jmp    f16c77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde08d>
      f16b4d:	0f 57 c0             	xorps  xmm0,xmm0
      f16b50:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      f16b53:	e9 0b 01 00 00       	jmp    f16c63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde079>
      f16b58:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
      f16b5c:	4c 89 ac 24 60 01 00 	mov    QWORD PTR [rsp+0x160],r13
      f16b63:	00 
      f16b64:	48 83 a4 24 68 01 00 	and    QWORD PTR [rsp+0x168],0x0
      f16b6b:	00 00 
      f16b6d:	4c 8d ac 24 70 01 00 	lea    r13,[rsp+0x170]
      f16b74:	00 
      f16b75:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      f16b7a:	4c 89 ef             	mov    rdi,r13
      f16b7d:	e8 cc a8 ff ff       	call   f1144e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8864>
      f16b82:	48 8d ac 24 90 01 00 	lea    rbp,[rsp+0x190]
      f16b89:	00 
      f16b8a:	48 89 ef             	mov    rdi,rbp
      f16b8d:	4c 89 e6             	mov    rsi,r12
      f16b90:	e8 8b 7d ff ff       	call   f0e920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5d36>
      f16b95:	bf 60 01 00 00       	mov    edi,0x160
      f16b9a:	e8 61 73 8d 00       	call   17edf00 <_Znwm@plt>
      f16b9f:	49 89 c4             	mov    r12,rax
      f16ba2:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
      f16ba9:	00 
      f16baa:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      f16baf:	48 8b 84 24 68 01 00 	mov    rax,QWORD PTR [rsp+0x168]
      f16bb6:	00 
      f16bb7:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      f16bbc:	48 85 c0             	test   rax,rax
      f16bbf:	74 05                	je     f16bc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xddfdc>
      f16bc1:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      f16bc6:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
      f16bcb:	4c 89 ee             	mov    rsi,r13
      f16bce:	e8 7b a8 ff ff       	call   f1144e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8864>
      f16bd3:	4c 89 e7             	mov    rdi,r12
      f16bd6:	48 83 c7 40          	add    rdi,0x40
      f16bda:	48 89 ee             	mov    rsi,rbp
      f16bdd:	e8 3e 7d ff ff       	call   f0e920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5d36>
      f16be2:	48 8d 05 39 01 00 00 	lea    rax,[rip+0x139]        # f16d22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde138>
      f16be9:	49 89 04 24          	mov    QWORD PTR [r12],rax
      f16bed:	48 8d 05 42 03 00 00 	lea    rax,[rip+0x342]        # f16f36 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde34c>
      f16bf4:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      f16bf9:	4c 89 ff             	mov    rdi,r15
      f16bfc:	4c 89 e6             	mov    rsi,r12
      f16bff:	e8 c0 2b fb ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>

### 0xf16dd3; FDE=(15822114, 15822645)
      f16d6b:	74 23                	je     f16d90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde1a6>
      f16d6d:	0f 57 c0             	xorps  xmm0,xmm0
      f16d70:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      f16d75:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      f16d7a:	48 83 c7 08          	add    rdi,0x8
      f16d7e:	4c 89 e6             	mov    rsi,r12
      f16d81:	e8 96 2a ba ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f16d86:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      f16d8b:	e8 f6 76 b8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f16d90:	49 8b 37             	mov    rsi,QWORD PTR [r15]
      f16d93:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
      f16d97:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      f16d9c:	0f 57 c0             	xorps  xmm0,xmm0
      f16d9f:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      f16da3:	41 0f 10 4f 10       	movups xmm1,XMMWORD PTR [r15+0x10]
      f16da8:	0f 29 4c 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm1
      f16dad:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      f16db1:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      f16db6:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      f16dbb:	49 8d 56 20          	lea    rdx,[r14+0x20]
      f16dbf:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
      f16dc4:	49 83 c6 40          	add    r14,0x40
      f16dc8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f16dcb:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      f16dd0:	4c 89 f1             	mov    rcx,r14
      f16dd3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      f16dd9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f16dde:	e8 6b ca ff ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
      f16de3:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
      f16de6:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      f16dea:	48 8b 5b 08          	mov    rbx,QWORD PTR [rbx+0x8]
      f16dee:	48 85 db             	test   rbx,rbx
      f16df1:	74 05                	je     f16df8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde20e>
      f16df3:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      f16df8:	4c 8b 74 24 40       	mov    r14,QWORD PTR [rsp+0x40]
      f16dfd:	4d 85 f6             	test   r14,r14
      f16e00:	74 78                	je     f16e7a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde290>
      f16e02:	6a 28                	push   0x28
      f16e04:	5f                   	pop    rdi
      f16e05:	e8 f6 70 8d 00       	call   17edf00 <_Znwm@plt>
      f16e0a:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      f16e0e:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      f16e12:	48 85 db             	test   rbx,rbx
      f16e15:	74 05                	je     f16e1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde232>
      f16e17:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      f16e1c:	40 88 68 20          	mov    BYTE PTR [rax+0x20],bpl
      f16e20:	48 8d 0d ef ec ff ff 	lea    rcx,[rip+0xffffffffffffecef]        # f15b16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdcf2c>
      f16e27:	48 89 08             	mov    QWORD PTR [rax],rcx
      f16e2a:	48 8d 0d 87 8a c2 ff 	lea    rcx,[rip+0xffffffffffc28a87]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      f16e31:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      f16e35:	4c 89 f7             	mov    rdi,r14
      f16e38:	48 89 c6             	mov    rsi,rax
      f16e3b:	e8 84 29 fb ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
      f16e40:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      f16e45:	4c 8b 27             	mov    r12,QWORD PTR [rdi]
      f16e48:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
      f16e4c:	0f 57 c0             	xorps  xmm0,xmm0
      f16e4f:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      f16e52:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
      f16e57:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
      f16e5b:	4c 89 fe             	mov    rsi,r15
      f16e5e:	e8 b9 29 ba ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      f16e63:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      f16e67:	e8 1a 76 b8 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f16e6c:	49 83 3c 24 fd       	cmp    QWORD PTR [r12],0xfffffffffffffffd
      f16e71:	76 11                	jbe    f16e84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde29a>
      f16e73:	31 c0                	xor    eax,eax
      f16e75:	45 31 e4             	xor    r12d,r12d
      f16e78:	eb 1b                	jmp    f16e95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xde2ab>
      f16e7a:	0f 57 c0             	xorps  xmm0,xmm0
      f16e7d:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0

### 0xf1cf49; FDE=(15847130, 15847606)
      f1cee9:	49 89 f6             	mov    r14,rsi
      f1ceec:	48 89 fb             	mov    rbx,rdi
      f1ceef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f1cef6:	00 00 
      f1cef8:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
      f1ceff:	00 
      f1cf00:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f1cf03:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
      f1cf08:	4c 89 ff             	mov    rdi,r15
      f1cf0b:	ff 10                	call   QWORD PTR [rax]
      f1cf0d:	41 8a af f0 00 00 00 	mov    bpl,BYTE PTR [r15+0xf0]
      f1cf14:	4c 89 ff             	mov    rdi,r15
      f1cf17:	e8 64 84 fe ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      f1cf1c:	40 84 ed             	test   bpl,bpl
      f1cf1f:	74 6c                	je     f1cf8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe43a3>
      f1cf21:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
      f1cf26:	83 60 f0 00          	and    DWORD PTR [rax-0x10],0x0
      f1cf2a:	0f 57 c0             	xorps  xmm0,xmm0
      f1cf2d:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      f1cf30:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
      f1cf34:	49 8b 06             	mov    rax,QWORD PTR [r14]
      f1cf37:	48 8d 0d 9a a2 ac 00 	lea    rcx,[rip+0xaca29a]        # 19e71d8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x17c8>
      f1cf3e:	48 89 e7             	mov    rdi,rsp
      f1cf41:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      f1cf46:	4c 89 f6             	mov    rsi,r14
      f1cf49:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      f1cf4f:	48 83 3c 24 00       	cmp    QWORD PTR [rsp],0x0
      f1cf54:	74 52                	je     f1cfa8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe43be>
      f1cf56:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      f1cf5b:	e8 38 82 ff ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>
      f1cf60:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
      f1cf65:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
      f1cf6a:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      f1cf6e:	e8 c3 1b bc ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      f1cf73:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
      f1cf78:	4d 85 f6             	test   r14,r14
      f1cf7b:	74 36                	je     f1cfb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe43c9>
      f1cf7d:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f1cf82:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
      f1cf86:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f1cf8b:	eb 2a                	jmp    f1cfb7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe43cd>
      f1cf8d:	49 8b 06             	mov    rax,QWORD PTR [r14]
      f1cf90:	48 8d 15 41 a2 ac 00 	lea    rdx,[rip+0xaca241]        # 19e71d8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x17c8>
      f1cf97:	48 89 df             	mov    rdi,rbx
      f1cf9a:	4c 89 f6             	mov    rsi,r14
      f1cf9d:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      f1cfa3:	e9 b1 00 00 00       	jmp    f1d059 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe446f>
      f1cfa8:	0f 57 c0             	xorps  xmm0,xmm0
      f1cfab:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      f1cfae:	e9 92 00 00 00       	jmp    f1d045 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe445b>
      f1cfb3:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
      f1cfb7:	6a 28                	push   0x28
      f1cfb9:	5f                   	pop    rdi
      f1cfba:	e8 41 0f 8d 00       	call   17edf00 <_Znwm@plt>
      f1cfbf:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
      f1cfc3:	4c 89 70 18          	mov    QWORD PTR [rax+0x18],r14
      f1cfc7:	4d 85 f6             	test   r14,r14
      f1cfca:	74 05                	je     f1cfd1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe43e7>
      f1cfcc:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f1cfd1:	48 8d 0d a6 13 00 00 	lea    rcx,[rip+0x13a6]        # f1e37e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe5794>
      f1cfd8:	48 89 08             	mov    QWORD PTR [rax],rcx
      f1cfdb:	48 8d 0d d6 28 c2 ff 	lea    rcx,[rip+0xffffffffffc228d6]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      f1cfe2:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      f1cfe6:	4c 89 ff             	mov    rdi,r15
      f1cfe9:	48 89 c6             	mov    rsi,rax
      f1cfec:	e8 d3 c7 fa ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
      f1cff1:	4c 89 f7             	mov    rdi,r14
      f1cff4:	e8 b9 14 b8 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      f1cff9:	0f 57 c0             	xorps  xmm0,xmm0
      f1cffc:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
      f1d001:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0

### 0xf1d2e6; FDE=(15848052, 15848531)
      f1d283:	49 89 f6             	mov    r14,rsi
      f1d286:	48 89 fb             	mov    rbx,rdi
      f1d289:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f1d290:	00 00 
      f1d292:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
      f1d299:	00 
      f1d29a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f1d29d:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
      f1d2a2:	4c 89 ff             	mov    rdi,r15
      f1d2a5:	ff 10                	call   QWORD PTR [rax]
      f1d2a7:	41 8a af f0 00 00 00 	mov    bpl,BYTE PTR [r15+0xf0]
      f1d2ae:	4c 89 ff             	mov    rdi,r15
      f1d2b1:	e8 ca 80 fe ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      f1d2b6:	40 84 ed             	test   bpl,bpl
      f1d2b9:	74 6f                	je     f1d32a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4740>
      f1d2bb:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
      f1d2c0:	c7 40 f0 03 00 00 00 	mov    DWORD PTR [rax-0x10],0x3
      f1d2c7:	0f 57 c0             	xorps  xmm0,xmm0
      f1d2ca:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      f1d2cd:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
      f1d2d1:	49 8b 06             	mov    rax,QWORD PTR [r14]
      f1d2d4:	48 8d 0d fd 9e ac 00 	lea    rcx,[rip+0xac9efd]        # 19e71d8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x17c8>
      f1d2db:	48 89 e7             	mov    rdi,rsp
      f1d2de:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
      f1d2e3:	4c 89 f6             	mov    rsi,r14
      f1d2e6:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      f1d2ec:	48 83 3c 24 00       	cmp    QWORD PTR [rsp],0x0
      f1d2f1:	74 52                	je     f1d345 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe475b>
      f1d2f3:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      f1d2f8:	e8 9b 7e ff ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>
      f1d2fd:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
      f1d302:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
      f1d307:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
      f1d30b:	e8 26 18 bc ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      f1d310:	4c 8b 74 24 28       	mov    r14,QWORD PTR [rsp+0x28]
      f1d315:	4d 85 f6             	test   r14,r14
      f1d318:	74 36                	je     f1d350 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4766>
      f1d31a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f1d31f:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
      f1d323:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f1d328:	eb 2a                	jmp    f1d354 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe476a>
      f1d32a:	49 8b 06             	mov    rax,QWORD PTR [r14]
      f1d32d:	48 8d 15 a4 9e ac 00 	lea    rdx,[rip+0xac9ea4]        # 19e71d8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x17c8>
      f1d334:	48 89 df             	mov    rdi,rbx
      f1d337:	4c 89 f6             	mov    rsi,r14
      f1d33a:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
      f1d340:	e9 b1 00 00 00       	jmp    f1d3f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe480c>
      f1d345:	0f 57 c0             	xorps  xmm0,xmm0
      f1d348:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      f1d34b:	e9 92 00 00 00       	jmp    f1d3e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe47f8>
      f1d350:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
      f1d354:	6a 28                	push   0x28
      f1d356:	5f                   	pop    rdi
      f1d357:	e8 a4 0b 8d 00       	call   17edf00 <_Znwm@plt>
      f1d35c:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
      f1d360:	4c 89 70 18          	mov    QWORD PTR [rax+0x18],r14
      f1d364:	4d 85 f6             	test   r14,r14
      f1d367:	74 05                	je     f1d36e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4784>
      f1d369:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f1d36e:	48 8d 0d 8b 04 00 00 	lea    rcx,[rip+0x48b]        # f1d800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4c16>
      f1d375:	48 89 08             	mov    QWORD PTR [rax],rcx
      f1d378:	48 8d 0d 39 25 c2 ff 	lea    rcx,[rip+0xffffffffffc22539]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
      f1d37f:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      f1d383:	4c 89 ff             	mov    rdi,r15
      f1d386:	48 89 c6             	mov    rsi,rax
      f1d389:	e8 36 c4 fa ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
      f1d38e:	4c 89 f7             	mov    rdi,r14
      f1d391:	e8 1c 11 b8 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      f1d396:	0f 57 c0             	xorps  xmm0,xmm0
      f1d399:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
      f1d39e:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0

### 0xf4b08a; FDE=(16035798, 16036382)
Strings: *smart-shuffle-signals | 
minus
      f4b030:	e8 37 04 d1 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
      f4b035:	49 89 c5             	mov    r13,rax
      f4b038:	48 8d 35 d9 a0 48 ff 	lea    rsi,[rip+0xffffffffff48a0d9]        # 3d5118 <_ZTSN5boost17bad_function_callE@@Base+0x245e>
      f4b03f:	4c 89 ff             	mov    rdi,r15
      f4b042:	e8 a7 46 b5 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
      f4b047:	84 c0                	test   al,al
      f4b049:	74 57                	je     f4b0a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1124b8>
      f4b04b:	4d 85 ed             	test   r13,r13
      f4b04e:	74 52                	je     f4b0a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1124b8>
      f4b050:	4c 89 ef             	mov    rdi,r13
      f4b053:	e8 41 05 fd ff       	call   f1b599 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe29af>
      f4b058:	84 c0                	test   al,al
      f4b05a:	74 46                	je     f4b0a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1124b8>
      f4b05c:	48 8d 84 24 90 01 00 	lea    rax,[rsp+0x190]
      f4b063:	00 
      f4b064:	c7 40 f0 04 00 00 00 	mov    DWORD PTR [rax-0x10],0x4
      f4b06b:	0f 57 c0             	xorps  xmm0,xmm0
      f4b06e:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      f4b071:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
      f4b075:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      f4b079:	48 8d 94 24 80 01 00 	lea    rdx,[rsp+0x180]
      f4b080:	00 
      f4b081:	48 89 df             	mov    rdi,rbx
      f4b084:	4c 89 e6             	mov    rsi,r12
      f4b087:	4c 89 f1             	mov    rcx,r14
      f4b08a:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      f4b090:	48 8b bc 24 90 01 00 	mov    rdi,QWORD PTR [rsp+0x190]
      f4b097:	00 
      f4b098:	e8 01 37 b5 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
      f4b09d:	e9 01 01 00 00       	jmp    f4b1a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1125b9>
      f4b0a2:	49 83 c4 10          	add    r12,0x10
      f4b0a6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      f4b0ab:	4c 89 e6             	mov    rsi,r12
      f4b0ae:	e8 a7 0d d4 ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      f4b0b3:	0f 57 c0             	xorps  xmm0,xmm0
      f4b0b6:	48 89 e2             	mov    rdx,rsp
      f4b0b9:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      f4b0bc:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      f4b0c1:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
      f4b0c6:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      f4b0cb:	4c 89 e7             	mov    rdi,r12
      f4b0ce:	e8 87 9f fd ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      f4b0d3:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
      f4b0d8:	4c 8b 60 20          	mov    r12,QWORD PTR [rax+0x20]
      f4b0dc:	4d 85 e4             	test   r12,r12
      f4b0df:	74 62                	je     f4b143 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x112559>
      f4b0e1:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      f4b0e5:	4c 8b a8 28 01 00 00 	mov    r13,QWORD PTR [rax+0x128]
      f4b0ec:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      f4b0f3:	00 
      f4b0f4:	4c 89 fe             	mov    rsi,r15
      f4b0f7:	e8 8e ca 71 00       	call   1667b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcf6>
      f4b0fc:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
      f4b101:	48 8d 94 24 80 01 00 	lea    rdx,[rsp+0x180]
      f4b108:	00 
      f4b109:	4c 89 e6             	mov    rsi,r12
      f4b10c:	4c 89 f1             	mov    rcx,r14
      f4b10f:	41 ff d5             	call   r13
      f4b112:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      f4b117:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      f4b11c:	4c 8d 74 24 78       	lea    r14,[rsp+0x78]
      f4b121:	31 d2                	xor    edx,edx
      f4b123:	4c 89 f1             	mov    rcx,r14
      f4b126:	e8 af 26 00 00       	call   f4d7da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x114bf0>
      f4b12b:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      f4b12f:	e8 52 33 b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f4b134:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
      f4b13b:	00 
      f4b13c:	e8 29 ca 71 00       	call   1667b6a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bcd6>
      f4b141:	eb 0f                	jmp    f4b152 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x112568>
      f4b143:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]

### 0xf70673; FDE=(16188965, 16189551)
      f7061f:	c3                   	ret
      f70620:	e8 8b f4 87 00       	call   17efab0 <__stack_chk_fail@plt>
      f70625:	41 57                	push   r15
      f70627:	41 56                	push   r14
      f70629:	41 55                	push   r13
      f7062b:	41 54                	push   r12
      f7062d:	53                   	push   rbx
      f7062e:	48 81 ec a0 02 00 00 	sub    rsp,0x2a0
      f70635:	49 89 d6             	mov    r14,rdx
      f70638:	48 89 fb             	mov    rbx,rdi
      f7063b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f70642:	00 00 
      f70644:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
      f7064b:	00 
      f7064c:	8d 44 89 01          	lea    eax,[rcx+rcx*4+0x1]
      f70650:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      f70653:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      f70658:	89 41 f0             	mov    DWORD PTR [rcx-0x10],eax
      f7065b:	0f 57 c0             	xorps  xmm0,xmm0
      f7065e:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
      f70661:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
      f70665:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      f70668:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      f7066d:	48 89 e2             	mov    rdx,rsp
      f70670:	4c 89 f1             	mov    rcx,r14
      f70673:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      f70679:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      f7067e:	4c 89 f6             	mov    rsi,r14
      f70681:	e8 9a e2 f9 ff       	call   f0e920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5d36>
      f70686:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
      f7068c:	74 49                	je     f706d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x137aed>
      f7068e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      f70693:	e8 00 4b fa ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>
      f70698:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
      f7069d:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
      f706a2:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      f706a7:	e8 8a e4 b6 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      f706ac:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
      f706b1:	4d 85 f6             	test   r14,r14
      f706b4:	74 2c                	je     f706e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x137af8>
      f706b6:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f706bb:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      f706c0:	4c 89 a4 24 60 01 00 	mov    QWORD PTR [rsp+0x160],r12
      f706c7:	00 
      f706c8:	4c 89 b4 24 68 01 00 	mov    QWORD PTR [rsp+0x168],r14
      f706cf:	00 
      f706d0:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      f706d5:	eb 21                	jmp    f706f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x137b0e>
      f706d7:	0f 57 c0             	xorps  xmm0,xmm0
      f706da:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      f706dd:	e9 eb 00 00 00       	jmp    f707cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x137be3>
      f706e2:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
      f706e7:	4c 89 a4 24 60 01 00 	mov    QWORD PTR [rsp+0x160],r12
      f706ee:	00 
      f706ef:	48 83 a4 24 68 01 00 	and    QWORD PTR [rsp+0x168],0x0
      f706f6:	00 00 
      f706f8:	4c 8d a4 24 70 01 00 	lea    r12,[rsp+0x170]
      f706ff:	00 
      f70700:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
      f70705:	4c 89 e7             	mov    rdi,r12
      f70708:	e8 13 e2 f9 ff       	call   f0e920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd5d36>
      f7070d:	bf 40 01 00 00       	mov    edi,0x140
      f70712:	e8 e9 d7 87 00       	call   17edf00 <_Znwm@plt>
      f70717:	49 89 c5             	mov    r13,rax
      f7071a:	48 8b 84 24 60 01 00 	mov    rax,QWORD PTR [rsp+0x160]
      f70721:	00 
      f70722:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      f70726:	48 8b 84 24 68 01 00 	mov    rax,QWORD PTR [rsp+0x168]
      f7072d:	00 
      f7072e:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      f70732:	48 85 c0             	test   rax,rax

### 0xfd70f2; FDE=(16609258, 16610446)
      fd7094:	41 8a 6c 24 30       	mov    bpl,BYTE PTR [r12+0x30]
      fd7099:	eb 02                	jmp    fd709d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19e4b3>
      fd709b:	31 ed                	xor    ebp,ebp
      fd709d:	49 83 c4 10          	add    r12,0x10
      fd70a1:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      fd70a6:	4c 89 e6             	mov    rsi,r12
      fd70a9:	e8 ac 4d cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
      fd70ae:	0f 57 c0             	xorps  xmm0,xmm0
      fd70b1:	48 8d 94 24 90 00 00 	lea    rdx,[rsp+0x90]
      fd70b8:	00 
      fd70b9:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
      fd70bc:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      fd70c1:	4c 8d a4 24 90 01 00 	lea    r12,[rsp+0x190]
      fd70c8:	00 
      fd70c9:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
      fd70ce:	4c 89 e7             	mov    rdi,r12
      fd70d1:	e8 84 df f4 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
      fd70d6:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
      fd70db:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
      fd70df:	48 85 f6             	test   rsi,rsi
      fd70e2:	74 3b                	je     fd711f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19e535>
      fd70e4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fd70e7:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      fd70ec:	4c 89 f2             	mov    rdx,r14
      fd70ef:	4c 89 f9             	mov    rcx,r15
      fd70f2:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
      fd70f8:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      fd70fd:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
      fd7104:	00 
      fd7105:	4c 8d 7c 24 48       	lea    r15,[rsp+0x48]
      fd710a:	31 d2                	xor    edx,edx
      fd710c:	4c 89 f9             	mov    rcx,r15
      fd710f:	e8 58 21 00 00       	call   fd926c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0682>
      fd7114:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      fd7118:	e8 69 73 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd711d:	eb 12                	jmp    fd7131 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19e547>
      fd711f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
      fd7124:	48 8d b4 24 90 01 00 	lea    rsi,[rsp+0x190]
      fd712b:	00 
      fd712c:	e8 ff 10 00 00       	call   fd8230 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f646>
      fd7131:	48 89 e7             	mov    rdi,rsp
      fd7134:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
      fd7139:	4c 89 fe             	mov    rsi,r15
      fd713c:	e8 79 e9 f3 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
      fd7141:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      fd7145:	e8 3c 73 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd714a:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
      fd7151:	00 
      fd7152:	e8 bb e1 f4 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
      fd7157:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
      fd715e:	00 
      fd715f:	e8 18 4e e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
      fd7164:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
      fd7169:	e8 18 73 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd716e:	4c 8d 7c 24 50       	lea    r15,[rsp+0x50]
      fd7173:	41 88 6f f8          	mov    BYTE PTR [r15-0x8],bpl
      fd7177:	31 c0                	xor    eax,eax
      fd7179:	41 88 07             	mov    BYTE PTR [r15],al
      fd717c:	41 88 47 18          	mov    BYTE PTR [r15+0x18],al
      fd7180:	38 84 24 a8 02 00 00 	cmp    BYTE PTR [rsp+0x2a8],al
      fd7187:	74 31                	je     fd71ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19e5d0>
      fd7189:	48 8b 84 24 a0 02 00 	mov    rax,QWORD PTR [rsp+0x2a0]
      fd7190:	00 
      fd7191:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      fd7195:	0f 28 84 24 90 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x290]
      fd719c:	00 
      fd719d:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
      fd71a1:	0f 57 c0             	xorps  xmm0,xmm0
      fd71a4:	0f 29 84 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm0
      fd71ab:	00 
      fd71ac:	48 83 a4 24 a0 02 00 	and    QWORD PTR [rsp+0x2a0],0x0

### 0xff4041; FDE=(16728072, 16728210)
      ff3fee:	ff a1 c0 00 00 00    	jmp    QWORD PTR [rcx+0xc0]
      ff3ff4:	50                   	push   rax
      ff3ff5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ff3ff8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ff3ffb:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      ff3ffe:	48 89 c7             	mov    rdi,rax
      ff4001:	58                   	pop    rax
      ff4002:	ff a1 c8 00 00 00    	jmp    QWORD PTR [rcx+0xc8]
      ff4008:	41 57                	push   r15
      ff400a:	41 56                	push   r14
      ff400c:	53                   	push   rbx
      ff400d:	48 81 ec 90 01 00 00 	sub    rsp,0x190
      ff4014:	48 89 f3             	mov    rbx,rsi
      ff4017:	49 89 fe             	mov    r14,rdi
      ff401a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff4021:	00 00 
      ff4023:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
      ff402a:	00 
      ff402b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ff402e:	ff 10                	call   QWORD PTR [rax]
      ff4030:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      ff4033:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      ff4038:	4c 89 ff             	mov    rdi,r15
      ff403b:	48 89 c6             	mov    rsi,rax
      ff403e:	48 89 da             	mov    rdx,rbx
      ff4041:	ff 91 d0 00 00 00    	call   QWORD PTR [rcx+0xd0]
      ff4047:	48 8d 9c 24 c8 00 00 	lea    rbx,[rsp+0xc8]
      ff404e:	00 
      ff404f:	48 89 df             	mov    rdi,rbx
      ff4052:	4c 89 f6             	mov    rsi,r14
      ff4055:	4c 89 fa             	mov    rdx,r15
      ff4058:	e8 b1 09 00 00       	call   ff4a0e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbe24>
      ff405d:	48 89 df             	mov    rdi,rbx
      ff4060:	e8 39 f2 eb ff       	call   eb329e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6b4>
      ff4065:	4c 89 ff             	mov    rdi,r15
      ff4068:	e8 31 f2 eb ff       	call   eb329e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7a6b4>
      ff406d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff4074:	00 00 
      ff4076:	48 3b 84 24 88 01 00 	cmp    rax,QWORD PTR [rsp+0x188]
      ff407d:	00 
      ff407e:	75 0d                	jne    ff408d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bb4a3>
      ff4080:	48 81 c4 90 01 00 00 	add    rsp,0x190
      ff4087:	5b                   	pop    rbx
      ff4088:	41 5e                	pop    r14
      ff408a:	41 5f                	pop    r15
      ff408c:	c3                   	ret
      ff408d:	e8 1e ba 7f 00       	call   17efab0 <__stack_chk_fail@plt>
      ff4092:	41 57                	push   r15
      ff4094:	41 56                	push   r14
      ff4096:	41 55                	push   r13
      ff4098:	41 54                	push   r12
      ff409a:	53                   	push   rbx
      ff409b:	48 81 ec 90 04 00 00 	sub    rsp,0x490
      ff40a2:	49 89 f6             	mov    r14,rsi
      ff40a5:	48 89 fb             	mov    rbx,rdi
      ff40a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff40af:	00 00 
      ff40b1:	48 89 84 24 88 04 00 	mov    QWORD PTR [rsp+0x488],rax
      ff40b8:	00 
      ff40b9:	4c 8d be d0 01 00 00 	lea    r15,[rsi+0x1d0]
      ff40c0:	4c 89 ff             	mov    rdi,r15
      ff40c3:	48 89 d6             	mov    rsi,rdx
      ff40c6:	e8 2b b4 ec ff       	call   ebf4f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8690c>
      ff40cb:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ff40ce:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ff40d3:	4c 89 f6             	mov    rsi,r14
      ff40d6:	31 d2                	xor    edx,edx
      ff40d8:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      ff40de:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ff40e1:	4c 89 f7             	mov    rdi,r14
      ff40e4:	ff 10                	call   QWORD PTR [rax]

### 0xff8889; FDE=(16746482, 16746746)
      ff8827:	41 88 54 24 08       	mov    BYTE PTR [r12+0x8],dl
      ff882c:	48 89 df             	mov    rdi,rbx
      ff882f:	e8 c8 ec ff ff       	call   ff74fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be912>
      ff8834:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
      ff8839:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      ff883d:	41 88 55 08          	mov    BYTE PTR [r13+0x8],dl
      ff8841:	41 8b 07             	mov    eax,DWORD PTR [r15]
      ff8844:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
      ff8848:	48 8b ab 00 25 00 00 	mov    rbp,QWORD PTR [rbx+0x2500]
      ff884f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ff8852:	48 89 df             	mov    rdi,rbx
      ff8855:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
      ff885b:	49 89 c6             	mov    r14,rax
      ff885e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ff8861:	48 89 df             	mov    rdi,rbx
      ff8864:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
      ff886a:	4c 8b 55 00          	mov    r10,QWORD PTR [rbp+0x0]
      ff886e:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
      ff8872:	48 89 ef             	mov    rdi,rbp
      ff8875:	4c 89 f6             	mov    rsi,r14
      ff8878:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      ff887d:	48 89 c2             	mov    rdx,rax
      ff8880:	4c 89 f1             	mov    rcx,r14
      ff8883:	4d 89 e0             	mov    r8,r12
      ff8886:	4d 89 e9             	mov    r9,r13
      ff8889:	41 ff 92 d0 00 00 00 	call   QWORD PTR [r10+0xd0]
      ff8890:	48 89 c1             	mov    rcx,rax
      ff8893:	48 c1 e9 20          	shr    rcx,0x20
      ff8897:	84 c9                	test   cl,cl
      ff8899:	74 0a                	je     ff88a5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfcbb>
      ff889b:	89 44 24 18          	mov    DWORD PTR [rsp+0x18],eax
      ff889f:	88 4c 24 1c          	mov    BYTE PTR [rsp+0x1c],cl
      ff88a3:	eb 24                	jmp    ff88c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfcdf>
      ff88a5:	83 7c 24 0c 04       	cmp    DWORD PTR [rsp+0xc],0x4
      ff88aa:	48 8d 05 1f 9d 9f 00 	lea    rax,[rip+0x9f9d1f]        # 19f25d0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x68f>
      ff88b1:	48 8d 35 d0 9c 9f 00 	lea    rsi,[rip+0x9f9cd0]        # 19f2588 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x647>
      ff88b8:	48 0f 44 f0          	cmove  rsi,rax
      ff88bc:	4c 89 f7             	mov    rdi,r14
      ff88bf:	e8 53 ec ff ff       	call   ff7517 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1be92d>
      ff88c4:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      ff88c9:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      ff88ce:	48 89 df             	mov    rdi,rbx
      ff88d1:	e8 38 fe ff ff       	call   ff870e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfb24>
      ff88d6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ff88dd:	00 00 
      ff88df:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ff88e4:	75 0f                	jne    ff88f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfd0b>
      ff88e6:	48 83 c4 48          	add    rsp,0x48
      ff88ea:	5b                   	pop    rbx
      ff88eb:	41 5c                	pop    r12
      ff88ed:	41 5d                	pop    r13
      ff88ef:	41 5e                	pop    r14
      ff88f1:	41 5f                	pop    r15
      ff88f3:	5d                   	pop    rbp
      ff88f4:	c3                   	ret
      ff88f5:	e8 b6 71 7f 00       	call   17efab0 <__stack_chk_fail@plt>
      ff88fa:	48 b8 95 e9 d1 5b 93 	movabs rax,0xc6a4a7935bd1e995
      ff8901:	a7 a4 c6 
      ff8904:	48 0f af f0          	imul   rsi,rax
      ff8908:	48 89 f1             	mov    rcx,rsi
      ff890b:	48 c1 e9 2f          	shr    rcx,0x2f
      ff890f:	48 31 f1             	xor    rcx,rsi
      ff8912:	48 0f af c8          	imul   rcx,rax
      ff8916:	48 33 0f             	xor    rcx,QWORD PTR [rdi]
      ff8919:	48 0f af c8          	imul   rcx,rax
      ff891d:	b8 64 6b 54 e6       	mov    eax,0xe6546b64
      ff8922:	48 01 c8             	add    rax,rcx
      ff8925:	48 89 07             	mov    QWORD PTR [rdi],rax
      ff8928:	c3                   	ret
      ff8929:	cc                   	int3
      ff892a:	41 57                	push   r15

### 0x107fca0; FDE=(17300136, 17301012)
Strings: POST | Cache-Control | no-store
     107fc3f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107fc42:	4c 89 fe             	mov    rsi,r15
     107fc45:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     107fc4b:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     107fc50:	48 8d 05 d1 9d 7c 00 	lea    rax,[rip+0x7c9dd1]        # 1849a28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6110>
     107fc57:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
     107fc5e:	00 
     107fc5f:	49 89 06             	mov    QWORD PTR [r14],rax
     107fc62:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     107fc66:	49 89 5e 10          	mov    QWORD PTR [r14+0x10],rbx
     107fc6a:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
     107fc6e:	31 ff                	xor    edi,edi
     107fc70:	e8 11 e8 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     107fc75:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     107fc79:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107fc7c:	4c 89 f6             	mov    rsi,r14
     107fc7f:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     107fc85:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     107fc89:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107fc8c:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
     107fc90:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     107fc96:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     107fc9a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107fc9d:	6a 01                	push   0x1
     107fc9f:	5e                   	pop    rsi
     107fca0:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     107fca6:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
     107fcaa:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     107fcad:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
     107fcb4:	00 
     107fcb5:	4c 89 e7             	mov    rdi,r12
     107fcb8:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
     107fcbe:	4c 89 f7             	mov    rdi,r14
     107fcc1:	e8 a4 a2 9f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     107fcc6:	31 ff                	xor    edi,edi
     107fcc8:	e8 b9 e7 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     107fccd:	4c 89 ff             	mov    rdi,r15
     107fcd0:	e8 95 a2 9f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     107fcd5:	31 ff                	xor    edi,edi
     107fcd7:	e8 aa e7 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     107fcdc:	48 89 ef             	mov    rdi,rbp
     107fcdf:	e8 ac e1 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     107fce4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     107fce9:	e8 a2 e1 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     107fcee:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     107fcf3:	e8 98 e1 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     107fcf8:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     107fcfd:	e8 8e e1 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     107fd02:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     107fd07:	e8 84 e1 76 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     107fd0c:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     107fd10:	e8 71 e7 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     107fd15:	31 c0                	xor    eax,eax
     107fd17:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     107fd1b:	48 85 ff             	test   rdi,rdi
     107fd1e:	74 0e                	je     107fd2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247144>
     107fd20:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     107fd23:	ff 50 10             	call   QWORD PTR [rax+0x10]
     107fd26:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     107fd2d:	00 
     107fd2e:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     107fd33:	49 89 06             	mov    QWORD PTR [r14],rax
     107fd36:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     107fd3d:	00 
     107fd3e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     107fd42:	0f 57 c0             	xorps  xmm0,xmm0
     107fd45:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     107fd4c:	00 
     107fd4d:	31 ff                	xor    edi,edi
     107fd4f:	e8 32 e7 a1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     107fd54:	48 89 df             	mov    rdi,rbx

### 0x10a7591; FDE=(17458276, 17465170)
Strings: mft_disallow | mft_plus_disallow | no_prev_track | not_playing_context | already_paused | not_paused | show | autoplay | episode | ad_disallow | narration | automix | audiobook_capping | not_supported_by_content_type | local-list | spotify:search | spotify:search: | local_list | already_set | restrictions_handler | switch-to-video | unknown | disallowed_by_account_manager | disallowed_by_user_setting | :
     10a751f:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7526:	00 
     10a7527:	e8 52 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a752c:	49 8d be c0 15 00 00 	lea    rdi,[r14+0x15c0]
     10a7533:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a753a:	00 
     10a753b:	e8 50 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7540:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7547:	00 
     10a7548:	e8 43 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a754d:	48 8d 35 f1 67 2c ff 	lea    rsi,[rip+0xffffffffff2c67f1]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a7554:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a755b:	00 
     10a755c:	e8 1d 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a7561:	49 8d be d0 14 00 00 	lea    rdi,[r14+0x14d0]
     10a7568:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a756f:	00 
     10a7570:	e8 1b 65 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7575:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a757c:	00 
     10a757d:	e8 0e 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7582:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a7589:	48 85 ff             	test   rdi,rdi
     10a758c:	74 0d                	je     10a759b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9b1>
     10a758e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a7591:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     10a7597:	84 c0                	test   al,al
     10a7599:	75 35                	jne    10a75d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9e6>
     10a759b:	48 8d 35 a3 67 2c ff 	lea    rsi,[rip+0xffffffffff2c67a3]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a75a2:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75a9:	00 
     10a75aa:	e8 cf 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a75af:	49 8d be e8 14 00 00 	lea    rdi,[r14+0x14e8]
     10a75b6:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a75bd:	00 
     10a75be:	e8 cd 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a75c3:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75ca:	00 
     10a75cb:	e8 c0 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a75d0:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a75d7:	48 85 ff             	test   rdi,rdi
     10a75da:	74 0d                	je     10a75e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26e9ff>
     10a75dc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a75df:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     10a75e5:	84 c0                	test   al,al
     10a75e7:	75 35                	jne    10a761e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea34>
     10a75e9:	48 8d 35 55 67 2c ff 	lea    rsi,[rip+0xffffffffff2c6755]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a75f0:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a75f7:	00 
     10a75f8:	e8 81 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a75fd:	49 8d be 88 14 00 00 	lea    rdi,[r14+0x1488]
     10a7604:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a760b:	00 
     10a760c:	e8 7f 64 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7611:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7618:	00 
     10a7619:	e8 72 68 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a761e:	49 8b be 38 04 00 00 	mov    rdi,QWORD PTR [r14+0x438]
     10a7625:	48 85 ff             	test   rdi,rdi
     10a7628:	74 0d                	je     10a7637 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea4d>
     10a762a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a762d:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     10a7633:	84 c0                	test   al,al
     10a7635:	75 35                	jne    10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a7637:	48 8d 35 07 67 2c ff 	lea    rsi,[rip+0xffffffffff2c6707]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a763e:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a7645:	00 
     10a7646:	e8 33 24 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a764b:	49 8d be a8 15 00 00 	lea    rdi,[r14+0x15a8]
     10a7652:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a7659:	00 

### 0x10bada4; FDE=(17542538, 17542596)
     10bad59:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
     10bad5d:	49 8b 77 30          	mov    rsi,QWORD PTR [r15+0x30]
     10bad61:	e8 14 24 00 00       	call   10bd17a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x284590>
     10bad66:	84 c0                	test   al,al
     10bad68:	75 09                	jne    10bad73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282189>
     10bad6a:	41 c7 06 02 00 00 00 	mov    DWORD PTR [r14],0x2
     10bad71:	31 db                	xor    ebx,ebx
     10bad73:	89 d8                	mov    eax,ebx
     10bad75:	5b                   	pop    rbx
     10bad76:	41 5e                	pop    r14
     10bad78:	41 5f                	pop    r15
     10bad7a:	c3                   	ret
     10bad7b:	cc                   	int3
     10bad7c:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
     10bad7f:	83 e0 fe             	and    eax,0xfffffffe
     10bad82:	83 f8 02             	cmp    eax,0x2
     10bad85:	0f 95 c0             	setne  al
     10bad88:	c3                   	ret
     10bad89:	cc                   	int3
     10bad8a:	48 83 ec 18          	sub    rsp,0x18
     10bad8e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10bad95:	00 00 
     10bad97:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10bad9c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10bad9f:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
     10bada4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     10badaa:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     10badb1:	00 00 
     10badb3:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     10badb8:	75 05                	jne    10badbf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2821d5>
     10badba:	48 83 c4 18          	add    rsp,0x18
     10badbe:	c3                   	ret
     10badbf:	e8 ec 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
     10badc4:	c7 06 01 00 00 00    	mov    DWORD PTR [rsi],0x1
     10badca:	8b 47 50             	mov    eax,DWORD PTR [rdi+0x50]
     10badcd:	83 e0 fe             	and    eax,0xfffffffe
     10badd0:	31 c9                	xor    ecx,ecx
     10badd2:	83 f8 02             	cmp    eax,0x2
     10badd5:	0f 95 c0             	setne  al
     10badd8:	0f 94 c1             	sete   cl
     10baddb:	89 0e                	mov    DWORD PTR [rsi],ecx
     10baddd:	c3                   	ret
     10badde:	48 83 ec 18          	sub    rsp,0x18
     10bade2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10bade9:	00 00 
     10badeb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10badf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10badf3:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
     10badf8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     10badfe:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     10bae05:	00 00 
     10bae07:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     10bae0c:	75 05                	jne    10bae13 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282229>
     10bae0e:	48 83 c4 18          	add    rsp,0x18
     10bae12:	c3                   	ret
     10bae13:	e8 98 4c 73 00       	call   17efab0 <__stack_chk_fail@plt>
     10bae18:	83 26 00             	and    DWORD PTR [rsi],0x0
     10bae1b:	b0 01                	mov    al,0x1
     10bae1d:	c3                   	ret
     10bae1e:	48 83 ec 18          	sub    rsp,0x18
     10bae22:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10bae29:	00 00 
     10bae2b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10bae30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10bae33:	48 8d 74 24 0c       	lea    rsi,[rsp+0xc]
     10bae38:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
     10bae3e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     10bae45:	00 00 
     10bae47:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     10bae4c:	75 05                	jne    10bae53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x282269>
     10bae4e:	48 83 c4 18          	add    rsp,0x18

### 0x10ff47a; FDE=(17822832, 17822853)
     10ff424:	c3                   	ret
     10ff425:	eb 00                	jmp    10ff427 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c683d>
     10ff427:	49 89 c6             	mov    r14,rax
     10ff42a:	eb 14                	jmp    10ff440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6856>
     10ff42c:	49 89 c6             	mov    r14,rax
     10ff42f:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     10ff434:	e8 4d f0 99 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10ff439:	31 ff                	xor    edi,edi
     10ff43b:	e8 46 f0 99 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10ff440:	48 89 df             	mov    rdi,rbx
     10ff443:	e8 0e 81 9b ff       	call   ab7556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x44f6>
     10ff448:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     10ff44d:	e8 ba 3f b1 ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
     10ff452:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ff459:	00 00 
     10ff45b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
     10ff460:	75 08                	jne    10ff46a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6880>
     10ff462:	4c 89 f7             	mov    rdi,r14
     10ff465:	e8 66 08 97 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10ff46a:	e8 41 06 6f 00       	call   17efab0 <__stack_chk_fail@plt>
     10ff46f:	cc                   	int3
     10ff470:	53                   	push   rbx
     10ff471:	48 89 fb             	mov    rbx,rdi
     10ff474:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     10ff477:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10ff47a:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     10ff480:	48 89 d8             	mov    rax,rbx
     10ff483:	5b                   	pop    rbx
     10ff484:	c3                   	ret
     10ff485:	cc                   	int3
     10ff486:	53                   	push   rbx
     10ff487:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     10ff48b:	48 85 c0             	test   rax,rax
     10ff48e:	74 11                	je     10ff4a1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c68b7>
     10ff490:	48 89 fb             	mov    rbx,rdi
     10ff493:	31 ff                	xor    edi,edi
     10ff495:	48 89 de             	mov    rsi,rbx
     10ff498:	31 d2                	xor    edx,edx
     10ff49a:	ff d0                	call   rax
     10ff49c:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     10ff4a1:	5b                   	pop    rbx
     10ff4a2:	c3                   	ret
     10ff4a3:	48 89 c7             	mov    rdi,rax
     10ff4a6:	e8 fa a5 97 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10ff4ab:	cc                   	int3
     10ff4ac:	55                   	push   rbp
     10ff4ad:	41 57                	push   r15
     10ff4af:	41 56                	push   r14
     10ff4b1:	41 55                	push   r13
     10ff4b3:	41 54                	push   r12
     10ff4b5:	53                   	push   rbx
     10ff4b6:	48 81 ec 88 00 00 00 	sub    rsp,0x88
     10ff4bd:	48 89 fb             	mov    rbx,rdi
     10ff4c0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10ff4c7:	00 00 
     10ff4c9:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
     10ff4d0:	00 
     10ff4d1:	48 8b 2e             	mov    rbp,QWORD PTR [rsi]
     10ff4d4:	80 7d 10 00          	cmp    BYTE PTR [rbp+0x10],0x0
     10ff4d8:	0f 84 25 01 00 00    	je     10ff603 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6a19>
     10ff4de:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     10ff4e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10ff4e5:	48 8d 35 8a 94 2d ff 	lea    rsi,[rip+0xffffffffff2d948a]        # 3d8976 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355b>
     10ff4ec:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10ff4ef:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     10ff4f4:	0f 57 c0             	xorps  xmm0,xmm0
     10ff4f7:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     10ff4fa:	48 85 c0             	test   rax,rax
     10ff4fd:	0f 84 e8 00 00 00    	je     10ff5eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6a01>
     10ff503:	49 89 c6             	mov    r14,rax
     10ff506:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]

### 0x11fbb79; FDE=(18856764, 18856918)
     11fbb1c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fbb23:	00 00 
     11fbb25:	48 3b 84 24 d8 00 00 	cmp    rax,QWORD PTR [rsp+0xd8]
     11fbb2c:	00 
     11fbb2d:	75 08                	jne    11fbb37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x410bb>
     11fbb2f:	48 89 df             	mov    rdi,rbx
     11fbb32:	e8 99 41 87 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11fbb37:	e8 74 3f 5f 00       	call   17efab0 <__stack_chk_fail@plt>
     11fbb3c:	41 57                	push   r15
     11fbb3e:	41 56                	push   r14
     11fbb40:	53                   	push   rbx
     11fbb41:	48 81 ec e0 00 00 00 	sub    rsp,0xe0
     11fbb48:	48 89 d3             	mov    rbx,rdx
     11fbb4b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fbb52:	00 00 
     11fbb54:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     11fbb5b:	00 
     11fbb5c:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     11fbb60:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     11fbb65:	4c 89 ff             	mov    rdi,r15
     11fbb68:	e8 3d bf 46 00       	call   1667aaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc16>
     11fbb6d:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11fbb70:	4c 89 f7             	mov    rdi,r14
     11fbb73:	4c 89 fe             	mov    rsi,r15
     11fbb76:	48 89 da             	mov    rdx,rbx
     11fbb79:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     11fbb7f:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11fbb84:	e8 4f 04 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fbb89:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fbb90:	00 00 
     11fbb92:	48 3b 84 24 d8 00 00 	cmp    rax,QWORD PTR [rsp+0xd8]
     11fbb99:	00 
     11fbb9a:	75 35                	jne    11fbbd1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41155>
     11fbb9c:	48 81 c4 e0 00 00 00 	add    rsp,0xe0
     11fbba3:	5b                   	pop    rbx
     11fbba4:	41 5e                	pop    r14
     11fbba6:	41 5f                	pop    r15
     11fbba8:	c3                   	ret
     11fbba9:	48 89 c3             	mov    rbx,rax
     11fbbac:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     11fbbb1:	e8 22 04 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fbbb6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fbbbd:	00 00 
     11fbbbf:	48 3b 84 24 d8 00 00 	cmp    rax,QWORD PTR [rsp+0xd8]
     11fbbc6:	00 
     11fbbc7:	75 08                	jne    11fbbd1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41155>
     11fbbc9:	48 89 df             	mov    rdi,rbx
     11fbbcc:	e8 ff 40 87 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11fbbd1:	e8 da 3e 5f 00       	call   17efab0 <__stack_chk_fail@plt>
     11fbbd6:	41 57                	push   r15
     11fbbd8:	41 56                	push   r14
     11fbbda:	53                   	push   rbx
     11fbbdb:	48 83 ec 50          	sub    rsp,0x50
     11fbbdf:	49 89 f6             	mov    r14,rsi
     11fbbe2:	48 89 fb             	mov    rbx,rdi
     11fbbe5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fbbec:	00 00 
     11fbbee:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11fbbf3:	49 81 c6 28 0f 00 00 	add    r14,0xf28
     11fbbfa:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     11fbbff:	4c 89 ff             	mov    rdi,r15
     11fbc02:	48 89 d6             	mov    rsi,rdx
     11fbc05:	e8 30 eb 5d 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>
     11fbc0a:	48 89 df             	mov    rdi,rbx
     11fbc0d:	4c 89 f6             	mov    rsi,r14
     11fbc10:	4c 89 fa             	mov    rdx,r15
     11fbc13:	e8 b2 e3 5d 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     11fbc18:	4c 89 ff             	mov    rdi,r15
     11fbc1b:	e8 c8 eb 5d 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11fbc20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fbc27:	00 00 

### 0x11fe47a; FDE=(18867004, 18867514)
Strings: set_sleep_timer | unknown
     11fe41d:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
     11fe421:	31 c0                	xor    eax,eax
     11fe423:	48 89 e2             	mov    rdx,rsp
     11fe426:	88 02                	mov    BYTE PTR [rdx],al
     11fe428:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
     11fe42b:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
     11fe432:	00 
     11fe433:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
     11fe438:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     11fe43d:	e8 e0 69 42 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     11fe442:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     11fe449:	00 
     11fe44a:	e8 1b bb 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11fe44f:	48 89 e7             	mov    rdi,rsp
     11fe452:	e8 d9 88 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11fe457:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
     11fe45b:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
     11fe462:	00 
     11fe463:	4c 89 e7             	mov    rdi,r12
     11fe466:	4c 89 f6             	mov    rsi,r14
     11fe469:	e8 14 96 46 00       	call   1667a82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbee>
     11fe46e:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11fe471:	4c 89 ff             	mov    rdi,r15
     11fe474:	4c 89 e6             	mov    rsi,r12
     11fe477:	48 89 da             	mov    rdx,rbx
     11fe47a:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     11fe480:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     11fe487:	00 
     11fe488:	e8 4b db 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fe48d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11fe492:	e8 77 1b 45 00       	call   165000e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x417a>
     11fe497:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fe49e:	00 00 
     11fe4a0:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]
     11fe4a7:	00 
     11fe4a8:	0f 85 87 00 00 00    	jne    11fe535 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ab9>
     11fe4ae:	48 81 c4 98 01 00 00 	add    rsp,0x198
     11fe4b5:	5b                   	pop    rbx
     11fe4b6:	41 5c                	pop    r12
     11fe4b8:	41 5e                	pop    r14
     11fe4ba:	41 5f                	pop    r15
     11fe4bc:	c3                   	ret
     11fe4bd:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     11fe4c1:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     11fe4c4:	e9 33 ff ff ff       	jmp    11fe3fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43980>
     11fe4c9:	48 89 c3             	mov    rbx,rax
     11fe4cc:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     11fe4d3:	00 
     11fe4d4:	e8 ff da 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fe4d9:	eb 35                	jmp    11fe510 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43a94>
     11fe4db:	48 89 c3             	mov    rbx,rax
     11fe4de:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     11fe4e5:	00 
     11fe4e6:	e8 7f ba 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11fe4eb:	48 89 e7             	mov    rdi,rsp
     11fe4ee:	e8 3d 88 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11fe4f3:	eb 1b                	jmp    11fe510 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43a94>
     11fe4f5:	eb 16                	jmp    11fe50d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43a91>
     11fe4f7:	eb 14                	jmp    11fe50d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43a91>
     11fe4f9:	eb 12                	jmp    11fe50d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43a91>
     11fe4fb:	48 89 c3             	mov    rbx,rax
     11fe4fe:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
     11fe505:	00 
     11fe506:	e8 85 f9 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11fe50b:	eb 03                	jmp    11fe510 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43a94>
     11fe50d:	48 89 c3             	mov    rbx,rax
     11fe510:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     11fe515:	e8 f4 1a 45 00       	call   165000e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x417a>
     11fe51a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fe521:	00 00 
     11fe523:	48 3b 84 24 90 01 00 	cmp    rax,QWORD PTR [rsp+0x190]

### 0x1200f75; FDE=(18878236, 18879207)
Strings: playhead.live.current_uid | user_resume | system_resume
     1200f1d:	41 57                	push   r15
     1200f1f:	41 56                	push   r14
     1200f21:	41 55                	push   r13
     1200f23:	41 54                	push   r12
     1200f25:	53                   	push   rbx
     1200f26:	48 81 ec 38 1d 00 00 	sub    rsp,0x1d38
     1200f2d:	48 89 d3             	mov    rbx,rdx
     1200f30:	49 89 f6             	mov    r14,rsi
     1200f33:	49 89 ff             	mov    r15,rdi
     1200f36:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1200f3d:	00 00 
     1200f3f:	48 89 84 24 30 1d 00 	mov    QWORD PTR [rsp+0x1d30],rax
     1200f46:	00 
     1200f47:	48 8b bf d0 11 00 00 	mov    rdi,QWORD PTR [rdi+0x11d0]
     1200f4e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1200f51:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1200f54:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
     1200f59:	4c 89 e7             	mov    rdi,r12
     1200f5c:	4c 89 fe             	mov    rsi,r15
     1200f5f:	e8 a0 59 00 00       	call   1206904 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4be88>
     1200f64:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     1200f68:	48 85 f6             	test   rsi,rsi
     1200f6b:	74 10                	je     1200f7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46501>
     1200f6d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1200f70:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1200f75:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1200f7b:	eb 15                	jmp    1200f92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46516>
     1200f7d:	0f 57 c0             	xorps  xmm0,xmm0
     1200f80:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     1200f85:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1200f8a:	c7 44 24 60 00 00 80 	mov    DWORD PTR [rsp+0x60],0x3f800000
     1200f91:	3f 
     1200f92:	48 8d 35 a8 33 17 ff 	lea    rsi,[rip+0xffffffffff1733a8]        # 374341 <_ZTSSt12bad_any_cast@@Base-0x1be87>
     1200f99:	48 8d bc 24 d8 10 00 	lea    rdi,[rsp+0x10d8]
     1200fa0:	00 
     1200fa1:	e8 d8 8a 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1200fa6:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1200fab:	4c 8d ac 24 d8 10 00 	lea    r13,[rsp+0x10d8]
     1200fb2:	00 
     1200fb3:	4c 89 ee             	mov    rsi,r13
     1200fb6:	e8 03 81 a4 ff       	call   c490be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19605e>
     1200fbb:	49 89 c4             	mov    r12,rax
     1200fbe:	4c 89 ef             	mov    rdi,r13
     1200fc1:	e8 ca ce 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1200fc6:	4d 85 e4             	test   r12,r12
     1200fc9:	74 16                	je     1200fe1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46565>
     1200fcb:	49 8b 74 24 08       	mov    rsi,QWORD PTR [r12+0x8]
     1200fd0:	41 8b 3c 24          	mov    edi,DWORD PTR [r12]
     1200fd4:	e8 47 a8 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1200fd9:	84 c0                	test   al,al
     1200fdb:	0f 84 d1 00 00 00    	je     12010b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46636>
     1200fe1:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]
     1200fe5:	41 80 7e 02 00       	cmp    BYTE PTR [r14+0x2],0x0
     1200fea:	48 8d 05 54 a0 18 ff 	lea    rax,[rip+0xffffffffff18a054]        # 38b045 <_ZTSSt12bad_any_cast@@Base-0x5183>
     1200ff1:	48 8d 35 68 69 18 ff 	lea    rsi,[rip+0xffffffffff186968]        # 387960 <_ZTSSt12bad_any_cast@@Base-0x8868>
     1200ff8:	48 0f 44 f0          	cmove  rsi,rax
     1200ffc:	48 8d bc 24 d8 10 00 	lea    rdi,[rsp+0x10d8]
     1201003:	00 
     1201004:	e8 75 8a 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1201009:	4c 8d bc 24 f0 10 00 	lea    r15,[rsp+0x10f0]
     1201010:	00 
     1201011:	49 81 c6 b8 00 00 00 	add    r14,0xb8
     1201018:	4c 89 ff             	mov    rdi,r15
     120101b:	4c 89 f6             	mov    rsi,r14
     120101e:	e8 1d cf 5e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1201023:	31 c0                	xor    eax,eax
     1201025:	48 8d 94 24 d8 10 00 	lea    rdx,[rsp+0x10d8]
     120102c:	00 
     120102d:	88 42 30             	mov    BYTE PTR [rdx+0x30],al
     1201030:	88 42 38             	mov    BYTE PTR [rdx+0x38],al
     1201033:	88 42 40             	mov    BYTE PTR [rdx+0x40],al

### 0x120ad63; FDE=(18918226, 18918896)
     120acff:	4c 89 ef             	mov    rdi,r13
     120ad02:	e8 7b cd 45 00       	call   1667a82 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbee>
     120ad07:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     120ad0b:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     120ad0f:	48 85 c0             	test   rax,rax
     120ad12:	74 05                	je     120ad19 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5029d>
     120ad14:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     120ad19:	48 8d 05 70 1a 65 00 	lea    rax,[rip+0x651a70]        # 185c790 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e78>
     120ad20:	48 8d 8c 24 b0 01 00 	lea    rcx,[rsp+0x1b0]
     120ad27:	00 
     120ad28:	48 89 01             	mov    QWORD PTR [rcx],rax
     120ad2b:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     120ad2f:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     120ad33:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     120ad38:	4c 8b 60 20          	mov    r12,QWORD PTR [rax+0x20]
     120ad3c:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     120ad43:	00 
     120ad44:	4c 89 ee             	mov    rsi,r13
     120ad47:	e8 5e cd 45 00       	call   1667aaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc16>
     120ad4c:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     120ad50:	48 8d b4 24 e0 01 00 	lea    rsi,[rsp+0x1e0]
     120ad57:	00 
     120ad58:	48 8d 94 24 b0 01 00 	lea    rdx,[rsp+0x1b0]
     120ad5f:	00 
     120ad60:	4c 89 e7             	mov    rdi,r12
     120ad63:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     120ad69:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     120ad70:	00 
     120ad71:	e8 62 12 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     120ad76:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     120ad7d:	00 
     120ad7e:	e8 e7 f1 86 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     120ad83:	31 ff                	xor    edi,edi
     120ad85:	e8 28 37 89 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120ad8a:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     120ad8e:	0f 57 c9             	xorps  xmm1,xmm1
     120ad91:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
     120ad95:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     120ad98:	31 ff                	xor    edi,edi
     120ad9a:	e8 e7 36 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     120ad9f:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     120ada4:	e8 2f 12 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     120ada9:	eb 06                	jmp    120adb1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50335>
     120adab:	0f 57 c0             	xorps  xmm0,xmm0
     120adae:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     120adb1:	4c 89 ff             	mov    rdi,r15
     120adb4:	e8 1f 12 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     120adb9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     120adc0:	00 00 
     120adc2:	48 3b 84 24 b0 02 00 	cmp    rax,QWORD PTR [rsp+0x2b0]
     120adc9:	00 
     120adca:	75 15                	jne    120ade1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50365>
     120adcc:	48 89 d8             	mov    rax,rbx
     120adcf:	48 81 c4 b8 02 00 00 	add    rsp,0x2b8
     120add6:	5b                   	pop    rbx
     120add7:	41 5c                	pop    r12
     120add9:	41 5d                	pop    r13
     120addb:	41 5e                	pop    r14
     120addd:	41 5f                	pop    r15
     120addf:	5d                   	pop    rbp
     120ade0:	c3                   	ret
     120ade1:	e8 ca 4c 5e 00       	call   17efab0 <__stack_chk_fail@plt>
     120ade6:	eb 00                	jmp    120ade8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5036c>
     120ade8:	48 89 c7             	mov    rdi,rax
     120adeb:	e8 b5 ec 86 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     120adf0:	48 8d 05 99 19 65 00 	lea    rax,[rip+0x651999]        # 185c790 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18e78>
     120adf7:	48 89 07             	mov    QWORD PTR [rdi],rax
     120adfa:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     120adfe:	e9 af 36 89 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     120ae03:	cc                   	int3
     120ae04:	53                   	push   rbx

### 0x1218738; FDE=(18974394, 18974573)
     12186d7:	ff 80 04 11 00 00    	inc    DWORD PTR [rax+0x1104]
     12186dd:	0f ba e6 1b          	bt     esi,0x1b
     12186e1:	73 5b                	jae    121873e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dcc2>
     12186e3:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     12186e7:	49 8b be 50 09 00 00 	mov    rdi,QWORD PTR [r14+0x950]
     12186ee:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12186f1:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12186f4:	48 89 c3             	mov    rbx,rax
     12186f7:	8b 78 04             	mov    edi,DWORD PTR [rax+0x4]
     12186fa:	e8 49 63 89 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     12186ff:	48 8d 44 24 17       	lea    rax,[rsp+0x17]
     1218704:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1218709:	48 89 07             	mov    QWORD PTR [rdi],rax
     121870c:	8b 43 04             	mov    eax,DWORD PTR [rbx+0x4]
     121870f:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1218714:	48 39 c8             	cmp    rax,rcx
     1218717:	6a ff                	push   0xffffffffffffffff
     1218719:	59                   	pop    rcx
     121871a:	48 0f 45 c8          	cmovne rcx,rax
     121871e:	48 8d 05 fb 45 64 00 	lea    rax,[rip+0x6445fb]        # 185cd20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19408>
     1218725:	48 89 de             	mov    rsi,rbx
     1218728:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     121872b:	49 8b be 70 09 00 00 	mov    rdi,QWORD PTR [r14+0x970]
     1218732:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     1218735:	0f b6 f0             	movzx  esi,al
     1218738:	ff 91 d0 00 00 00    	call   QWORD PTR [rcx+0xd0]
     121873e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1218743:	e8 26 00 00 00       	call   121876e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dcf2>
     1218748:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     121874f:	00 00 
     1218751:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1218756:	75 08                	jne    1218760 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dce4>
     1218758:	48 83 c4 28          	add    rsp,0x28
     121875c:	5b                   	pop    rbx
     121875d:	41 5e                	pop    r14
     121875f:	c3                   	ret
     1218760:	e8 4b 73 5d 00       	call   17efab0 <__stack_chk_fail@plt>
     1218765:	48 89 c7             	mov    rdi,rax
     1218768:	e8 38 13 86 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     121876d:	cc                   	int3
     121876e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1218771:	ff 88 04 11 00 00    	dec    DWORD PTR [rax+0x1104]
     1218777:	75 10                	jne    1218789 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dd0d>
     1218779:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     121877c:	80 bf 01 11 00 00 00 	cmp    BYTE PTR [rdi+0x1101],0x0
     1218783:	0f 85 01 00 00 00    	jne    121878a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dd0e>
     1218789:	c3                   	ret
     121878a:	41 57                	push   r15
     121878c:	41 56                	push   r14
     121878e:	53                   	push   rbx
     121878f:	48 83 ec 50          	sub    rsp,0x50
     1218793:	48 89 fb             	mov    rbx,rdi
     1218796:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     121879d:	00 00 
     121879f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     12187a4:	e8 97 01 00 00       	call   1218940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dec4>
     12187a9:	48 8d bb 90 06 00 00 	lea    rdi,[rbx+0x690]
     12187b0:	48 8b b3 90 06 00 00 	mov    rsi,QWORD PTR [rbx+0x690]
     12187b7:	e8 c0 07 fe ff       	call   11f8f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e500>
     12187bc:	48 8d bb d8 08 00 00 	lea    rdi,[rbx+0x8d8]
     12187c3:	e8 f8 01 00 00       	call   12189c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5df44>
     12187c8:	80 bb a0 12 00 00 00 	cmp    BYTE PTR [rbx+0x12a0],0x0
     12187cf:	74 13                	je     12187e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dd68>
     12187d1:	48 8d bb 40 12 00 00 	lea    rdi,[rbx+0x1240]
     12187d8:	e8 33 a3 8d ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
     12187dd:	c6 83 a0 12 00 00 00 	mov    BYTE PTR [rbx+0x12a0],0x0
     12187e4:	48 8d bb 28 12 00 00 	lea    rdi,[rbx+0x1228]
     12187eb:	e8 40 55 8c ff       	call   addd30 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2acd0>
     12187f0:	48 8b 93 a8 12 00 00 	mov    rdx,QWORD PTR [rbx+0x12a8]
     12187f7:	31 ff                	xor    edi,edi
     12187f9:	31 f6                	xor    esi,esi

### 0x1257be3; FDE=(19233292, 19235084)
Strings: context_description | context_owner | format_list_type | image_url | playlist_number_of_tracks | playlist_number_of_episodes | enhanced_context | true | false
     1257b87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1257b8a:	4c 89 e6             	mov    rsi,r12
     1257b8d:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1257b90:	84 c0                	test   al,al
     1257b92:	75 0c                	jne    1257ba0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d124>
     1257b94:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     1257b97:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1257b9a:	4c 89 e6             	mov    rsi,r12
     1257b9d:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1257ba0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1257ba5:	e8 84 d7 46 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1257baa:	4d 89 ee             	mov    r14,r13
     1257bad:	eb 08                	jmp    1257bb7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d13b>
     1257baf:	4c 89 ff             	mov    rdi,r15
     1257bb2:	e8 6f 6d 85 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
     1257bb7:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1257bbe:	00 
     1257bbf:	e8 6a d7 46 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1257bc4:	49 8b 37             	mov    rsi,QWORD PTR [r15]
     1257bc7:	48 85 f6             	test   rsi,rsi
     1257bca:	0f 84 97 04 00 00    	je     1258067 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d5eb>
     1257bd0:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     1257bd4:	4d 8d a6 10 0e 00 00 	lea    r12,[r14+0xe10]
     1257bdb:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1257bde:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1257be3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1257be9:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
     1257bee:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     1257bf1:	4d 85 f6             	test   r14,r14
     1257bf4:	74 1a                	je     1257c10 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d194>
     1257bf6:	49 8d 76 10          	lea    rsi,[r14+0x10]
     1257bfa:	4c 89 e7             	mov    rdi,r12
     1257bfd:	e8 22 2d c3 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     1257c02:	49 8d 76 28          	lea    rsi,[r14+0x28]
     1257c06:	48 89 c7             	mov    rdi,rax
     1257c09:	e8 72 64 59 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1257c0e:	eb de                	jmp    1257bee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d172>
     1257c10:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1257c15:	e8 d0 36 8a ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     1257c1a:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     1257c1d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1257c20:	ff 50 50             	call   QWORD PTR [rax+0x50]
     1257c23:	49 89 c5             	mov    r13,rax
     1257c26:	48 8d 35 45 c3 12 ff 	lea    rsi,[rip+0xffffffffff12c345]        # 383f72 <_ZTSSt12bad_any_cast@@Base-0xc256>
     1257c2d:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1257c32:	4c 89 f7             	mov    rdi,r14
     1257c35:	e8 44 1e 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1257c3a:	4c 89 e7             	mov    rdi,r12
     1257c3d:	4c 89 f6             	mov    rsi,r14
     1257c40:	e8 df 2c c3 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     1257c45:	48 89 c7             	mov    rdi,rax
     1257c48:	4c 89 ee             	mov    rsi,r13
     1257c4b:	e8 30 64 59 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1257c50:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1257c55:	e8 36 62 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1257c5a:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     1257c5d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1257c60:	ff 50 78             	call   QWORD PTR [rax+0x78]
     1257c63:	49 89 c5             	mov    r13,rax
     1257c66:	48 8d 35 fb 7e 0e ff 	lea    rsi,[rip+0xffffffffff0e7efb]        # 33fb68 <_ZTSSt12bad_any_cast@@Base-0x50660>
     1257c6d:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1257c72:	4c 89 f7             	mov    rdi,r14
     1257c75:	e8 04 1e 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1257c7a:	4c 89 e7             	mov    rdi,r12
     1257c7d:	4c 89 f6             	mov    rsi,r14
     1257c80:	e8 9f 2c c3 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     1257c85:	48 89 c7             	mov    rdi,rax
     1257c88:	4c 89 ee             	mov    rsi,r13
     1257c8b:	e8 f0 63 59 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1257c90:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1257c95:	e8 f6 61 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

### 0x1257ed4; FDE=(19233292, 19235084)
Strings: context_description | context_owner | format_list_type | image_url | playlist_number_of_tracks | playlist_number_of_episodes | enhanced_context | true | false
     1257e6d:	e8 dd 39 82 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     1257e72:	4c 8d 2d ac 9d 1f ff 	lea    r13,[rip+0xffffffffff1f9dac]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
     1257e79:	84 c0                	test   al,al
     1257e7b:	4d 0f 45 ee          	cmovne r13,r14
     1257e7f:	eb 07                	jmp    1257e88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d40c>
     1257e81:	4c 8d 2d 9d 9d 1f ff 	lea    r13,[rip+0xffffffffff1f9d9d]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
     1257e88:	48 8d 35 be 1d 10 ff 	lea    rsi,[rip+0xffffffffff101dbe]        # 359c4d <_ZTSSt12bad_any_cast@@Base-0x3657b>
     1257e8f:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1257e94:	4c 89 f7             	mov    rdi,r14
     1257e97:	e8 e2 1b 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1257e9c:	4c 89 e7             	mov    rdi,r12
     1257e9f:	4c 89 f6             	mov    rsi,r14
     1257ea2:	e8 7d 2a c3 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     1257ea7:	48 89 c7             	mov    rdi,rax
     1257eaa:	4c 89 ee             	mov    rsi,r13
     1257ead:	e8 ce 60 59 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     1257eb2:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1257eb7:	e8 d4 5f 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1257ebc:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     1257ebf:	e8 67 ff 08 00       	call   12e7e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12d3af>
     1257ec4:	89 c5                	mov    ebp,eax
     1257ec6:	49 8b 37             	mov    rsi,QWORD PTR [r15]
     1257ec9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1257ecc:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1257ed1:	4c 89 f7             	mov    rdi,r14
     1257ed4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1257eda:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
     1257ede:	4d 85 f6             	test   r14,r14
     1257ee1:	74 47                	je     1257f2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d4ae>
     1257ee3:	4d 8d 6e 10          	lea    r13,[r14+0x10]
     1257ee7:	40 84 ed             	test   bpl,bpl
     1257eea:	74 13                	je     1257eff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d483>
     1257eec:	49 8d 56 28          	lea    rdx,[r14+0x28]
     1257ef0:	4c 89 e7             	mov    rdi,r12
     1257ef3:	4c 89 ee             	mov    rsi,r13
     1257ef6:	e8 cc ff 08 00       	call   12e7ec7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12d44b>
     1257efb:	84 c0                	test   al,al
     1257efd:	75 26                	jne    1257f25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d4a9>
     1257eff:	4c 89 e7             	mov    rdi,r12
     1257f02:	4c 89 ee             	mov    rsi,r13
     1257f05:	e8 ca a7 bb ff       	call   e126d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdf75a>
     1257f0a:	84 c0                	test   al,al
     1257f0c:	75 17                	jne    1257f25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d4a9>
     1257f0e:	4c 89 e7             	mov    rdi,r12
     1257f11:	4c 89 ee             	mov    rsi,r13
     1257f14:	e8 0b 2a c3 ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     1257f19:	49 8d 76 28          	lea    rsi,[r14+0x28]
     1257f1d:	48 89 c7             	mov    rdi,rax
     1257f20:	e8 5b 61 59 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1257f25:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     1257f28:	eb b4                	jmp    1257ede <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d462>
     1257f2a:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     1257f2f:	4c 89 f7             	mov    rdi,r14
     1257f32:	e8 b3 33 8a ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     1257f37:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1257f3a:	0f 57 c0             	xorps  xmm0,xmm0
     1257f3d:	41 0f 29 46 10       	movaps XMMWORD PTR [r14+0x10],xmm0
     1257f42:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1257f46:	41 c7 46 20 00 00 80 	mov    DWORD PTR [r14+0x20],0x3f800000
     1257f4d:	3f 
     1257f4e:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
     1257f55:	00 
     1257f56:	4d 89 37             	mov    QWORD PTR [r15],r14
     1257f59:	48 8d 0d 04 45 82 ff 	lea    rcx,[rip+0xffffffffff824504]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     1257f60:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     1257f64:	48 8d 0d 8b 02 00 00 	lea    rcx,[rip+0x28b]        # 12581f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9d77a>
     1257f6b:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     1257f6f:	48 8b 78 70          	mov    rdi,QWORD PTR [rax+0x70]
     1257f73:	4c 89 fe             	mov    rsi,r15
     1257f76:	e8 f7 b8 34 00       	call   15a3872 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8df6>
     1257f7b:	4c 89 ff             	mov    rdi,r15

### 0x12599c0; FDE=(19240950, 19242397)
Strings: next_page_threshold
     125995c:	4c 89 f6             	mov    rsi,r14
     125995f:	e8 1c 47 59 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     1259964:	48 8d b4 24 50 06 00 	lea    rsi,[rsp+0x650]
     125996b:	00 
     125996c:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     1259970:	e8 03 2e e3 ff       	call   108c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b8e>
     1259975:	48 8d bb 58 10 00 00 	lea    rdi,[rbx+0x1058]
     125997c:	e8 a5 4f 85 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
     1259981:	4c 8d b4 24 50 06 00 	lea    r14,[rsp+0x650]
     1259988:	00 
     1259989:	4c 8d 7b 60          	lea    r15,[rbx+0x60]
     125998d:	4c 89 ff             	mov    rdi,r15
     1259990:	4c 89 f6             	mov    rsi,r14
     1259993:	e8 9a 62 fa ff       	call   11ffc32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x451b6>
     1259998:	84 c0                	test   al,al
     125999a:	75 08                	jne    12599a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ef28>
     125999c:	66 83 a3 91 00 00 00 	and    WORD PTR [rbx+0x91],0x0
     12599a3:	00 
     12599a4:	4c 89 ff             	mov    rdi,r15
     12599a7:	4c 89 f6             	mov    rsi,r14
     12599aa:	e8 c9 2d e3 ff       	call   108c778 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253b8e>
     12599af:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     12599b4:	4c 63 63 10          	movsxd r12,DWORD PTR [rbx+0x10]
     12599b8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12599bb:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12599c0:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     12599c6:	48 8d 35 27 e1 11 ff 	lea    rsi,[rip+0xffffffffff11e127]        # 377af4 <_ZTSSt12bad_any_cast@@Base-0x186d4>
     12599cd:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     12599d2:	e8 a7 00 82 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12599d7:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12599dc:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     12599e1:	4c 89 fe             	mov    rsi,r15
     12599e4:	e8 d5 f6 9e ff       	call   c490be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19605e>
     12599e9:	49 89 c6             	mov    r14,rax
     12599ec:	4c 89 ff             	mov    rdi,r15
     12599ef:	e8 9c 44 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12599f4:	4d 85 f6             	test   r14,r14
     12599f7:	74 72                	je     1259a6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9efef>
     12599f9:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
     12599fe:	83 0a ff             	or     DWORD PTR [rdx],0xffffffff
     1259a01:	41 0f b6 06          	movzx  eax,BYTE PTR [r14]
     1259a05:	4c 89 f7             	mov    rdi,r14
     1259a08:	48 ff c7             	inc    rdi
     1259a0b:	89 c6                	mov    esi,eax
     1259a0d:	d1 ee                	shr    esi,1
     1259a0f:	a8 01                	test   al,0x1
     1259a11:	49 0f 45 7e 10       	cmovne rdi,QWORD PTR [r14+0x10]
     1259a16:	49 0f 45 76 08       	cmovne rsi,QWORD PTR [r14+0x8]
     1259a1b:	48 01 fe             	add    rsi,rdi
     1259a1e:	e8 60 04 a7 ff       	call   cc9e83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216e23>
     1259a23:	40 b5 01             	mov    bpl,0x1
     1259a26:	85 d2                	test   edx,edx
     1259a28:	75 44                	jne    1259a6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9eff2>
     1259a2a:	8b 44 24 28          	mov    eax,DWORD PTR [rsp+0x28]
     1259a2e:	85 c0                	test   eax,eax
     1259a30:	7e 3c                	jle    1259a6e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9eff2>
     1259a32:	41 89 c6             	mov    r14d,eax
     1259a35:	41 81 e6 00 ff ff 7f 	and    r14d,0x7fffff00
     1259a3c:	44 0f b6 f8          	movzx  r15d,al
     1259a40:	31 ed                	xor    ebp,ebp
     1259a42:	eb 30                	jmp    1259a74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9eff8>
     1259a44:	48 89 df             	mov    rdi,rbx
     1259a47:	e8 6e 03 00 00       	call   1259dba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f33e>
     1259a4c:	e9 b6 02 00 00       	jmp    1259d07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f28b>
     1259a51:	48 89 df             	mov    rdi,rbx
     1259a54:	e8 61 03 00 00       	call   1259dba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f33e>
     1259a59:	e9 9c 02 00 00       	jmp    1259cfa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f27e>
     1259a5e:	48 89 df             	mov    rdi,rbx
     1259a61:	e8 54 03 00 00       	call   1259dba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f33e>
     1259a66:	e9 78 02 00 00       	jmp    1259ce3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f267>
     1259a6b:	40 b5 01             	mov    bpl,0x1

### 0x1259e67; FDE=(19242563, 19242799)
Strings: autoplay_candidate | true | false
     1259e0b:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
     1259e12:	e8 87 ff ff ff       	call   1259d9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f322>
     1259e17:	48 81 c3 58 10 00 00 	add    rbx,0x1058
     1259e1e:	48 89 df             	mov    rdi,rbx
     1259e21:	e8 00 4b 85 ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
     1259e26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1259e2d:	00 00 
     1259e2f:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     1259e34:	75 08                	jne    1259e3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f3c2>
     1259e36:	48 83 c4 38          	add    rsp,0x38
     1259e3a:	5b                   	pop    rbx
     1259e3b:	41 5e                	pop    r14
     1259e3d:	c3                   	ret
     1259e3e:	e8 6d 5c 59 00       	call   17efab0 <__stack_chk_fail@plt>
     1259e43:	41 57                	push   r15
     1259e45:	41 56                	push   r14
     1259e47:	41 54                	push   r12
     1259e49:	53                   	push   rbx
     1259e4a:	48 83 ec 68          	sub    rsp,0x68
     1259e4e:	48 89 fe             	mov    rsi,rdi
     1259e51:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1259e58:	00 00 
     1259e5a:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     1259e5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1259e62:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1259e67:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1259e6d:	48 8d 35 65 06 0f ff 	lea    rsi,[rip+0xffffffffff0f0665]        # 34a4d9 <_ZTSSt12bad_any_cast@@Base-0x45cef>
     1259e74:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1259e79:	e8 00 fc 81 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1259e7e:	48 8d 35 9b 7d 1f ff 	lea    rsi,[rip+0xffffffffff1f7d9b]        # 451c20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x1782c>
     1259e85:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1259e8a:	e8 ef fb 81 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1259e8f:	4c 8d 74 24 38       	lea    r14,[rsp+0x38]
     1259e94:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     1259e99:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     1259e9e:	4c 89 f7             	mov    rdi,r14
     1259ea1:	4c 89 fe             	mov    rsi,r15
     1259ea4:	4c 89 e2             	mov    rdx,r12
     1259ea7:	e8 be 8a 9f ff       	call   c5296a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19f90a>
     1259eac:	48 8d 35 72 7d 1f ff 	lea    rsi,[rip+0xffffffffff1f7d72]        # 451c25 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17831>
     1259eb3:	48 89 c7             	mov    rdi,rax
     1259eb6:	e8 94 19 82 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     1259ebb:	89 c3                	mov    ebx,eax
     1259ebd:	4c 89 e7             	mov    rdi,r12
     1259ec0:	e8 cb 3f 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1259ec5:	4c 89 ff             	mov    rdi,r15
     1259ec8:	e8 c3 3f 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1259ecd:	4c 89 f7             	mov    rdi,r14
     1259ed0:	e8 15 14 8a ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     1259ed5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1259edc:	00 00 
     1259ede:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
     1259ee3:	75 45                	jne    1259f2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f4ae>
     1259ee5:	80 f3 01             	xor    bl,0x1
     1259ee8:	89 d8                	mov    eax,ebx
     1259eea:	48 83 c4 68          	add    rsp,0x68
     1259eee:	5b                   	pop    rbx
     1259eef:	41 5c                	pop    r12
     1259ef1:	41 5e                	pop    r14
     1259ef3:	41 5f                	pop    r15
     1259ef5:	c3                   	ret
     1259ef6:	48 89 c3             	mov    rbx,rax
     1259ef9:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1259efe:	e8 8d 3f 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1259f03:	eb 03                	jmp    1259f08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9f48c>
     1259f05:	48 89 c3             	mov    rbx,rax
     1259f08:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1259f0d:	e8 d8 13 8a ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     1259f12:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1259f19:	00 00 
     1259f1b:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]

### 0x127d0c5; FDE=(19378798, 19388543)
     127d05a:	e8 d3 bf 43 00       	call   16b9032 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d19e>
     127d05f:	e9 e8 02 00 00       	jmp    127d34c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc28d0>
     127d064:	0f 18 0d 0d 43 73 00 	prefetcht0 BYTE PTR [rip+0x73430d]        # 19b1378 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x79fc0>
     127d06b:	48 8d 3d 06 43 73 00 	lea    rdi,[rip+0x734306]        # 19b1378 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x79fc0>
     127d072:	48 8b 05 07 43 73 00 	mov    rax,QWORD PTR [rip+0x734307]        # 19b1380 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x79fc8>
     127d079:	0f 18 08             	prefetcht0 BYTE PTR [rax]
     127d07c:	e8 69 1b 4d 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
     127d081:	48 8d b4 24 18 03 00 	lea    rsi,[rsp+0x318]
     127d088:	00 
     127d089:	48 8d 84 24 20 04 00 	lea    rax,[rsp+0x420]
     127d090:	00 
     127d091:	48 89 d7             	mov    rdi,rdx
     127d094:	48 89 c2             	mov    rdx,rax
     127d097:	e8 fe d0 4b 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
     127d09c:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     127d0a1:	4c 89 fe             	mov    rsi,r15
     127d0a4:	e8 90 d8 82 ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
     127d0a9:	49 8b 06             	mov    rax,QWORD PTR [r14]
     127d0ac:	4c 8d bc 24 18 03 00 	lea    r15,[rsp+0x318]
     127d0b3:	00 
     127d0b4:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
     127d0b9:	48 89 df             	mov    rdi,rbx
     127d0bc:	4c 89 f6             	mov    rsi,r14
     127d0bf:	4c 89 fa             	mov    rdx,r15
     127d0c2:	4c 89 e1             	mov    rcx,r12
     127d0c5:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     127d0cb:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     127d0d0:	e8 b1 13 82 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     127d0d5:	4c 89 ff             	mov    rdi,r15
     127d0d8:	e8 ed b7 43 00       	call   16b88ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca36>
     127d0dd:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
     127d0e4:	00 
     127d0e5:	e8 e0 b7 43 00       	call   16b88ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ca36>
     127d0ea:	e9 5d 02 00 00       	jmp    127d34c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc28d0>
     127d0ef:	0f 18 0d ea f4 72 00 	prefetcht0 BYTE PTR [rip+0x72f4ea]        # 19ac5e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x75228>
     127d0f6:	48 8d 3d e3 f4 72 00 	lea    rdi,[rip+0x72f4e3]        # 19ac5e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x75228>
     127d0fd:	48 8b 05 e4 f4 72 00 	mov    rax,QWORD PTR [rip+0x72f4e4]        # 19ac5e8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x75230>
     127d104:	0f 18 08             	prefetcht0 BYTE PTR [rax]
     127d107:	e8 de 1a 4d 00       	call   174ebea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102d56>
     127d10c:	48 8d b4 24 c8 06 00 	lea    rsi,[rsp+0x6c8]
     127d113:	00 
     127d114:	48 8d 84 24 20 04 00 	lea    rax,[rsp+0x420]
     127d11b:	00 
     127d11c:	48 89 d7             	mov    rdi,rdx
     127d11f:	48 89 c2             	mov    rdx,rax
     127d122:	e8 73 d0 4b 00       	call   173a19a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xee306>
     127d127:	6a 40                	push   0x40
     127d129:	5f                   	pop    rdi
     127d12a:	e8 d1 0d 57 00       	call   17edf00 <_Znwm@plt>
     127d12f:	49 89 c4             	mov    r12,rax
     127d132:	0f 57 c0             	xorps  xmm0,xmm0
     127d135:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     127d139:	48 8d 05 68 06 58 00 	lea    rax,[rip+0x580668]        # 17fd7a8 <_ZTINSt6__ndk117bad_function_callE@@Base+0x848>
     127d140:	49 89 04 24          	mov    QWORD PTR [r12],rax
     127d144:	4d 89 e5             	mov    r13,r12
     127d147:	49 83 c5 18          	add    r13,0x18
     127d14b:	4c 89 ef             	mov    rdi,r13
     127d14e:	4c 89 fe             	mov    rsi,r15
     127d151:	e8 36 49 36 00       	call   15e1a8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x427010>
     127d156:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     127d15d:	00 
     127d15e:	4d 89 2f             	mov    QWORD PTR [r15],r13
     127d161:	4d 89 67 08          	mov    QWORD PTR [r15+0x8],r12
     127d165:	49 8b 06             	mov    rax,QWORD PTR [r14]
     127d168:	4c 8d a4 24 c8 06 00 	lea    r12,[rsp+0x6c8]
     127d16f:	00 
     127d170:	48 89 df             	mov    rdi,rbx
     127d173:	4c 89 f6             	mov    rsi,r14
     127d176:	4c 89 e2             	mov    rdx,r12
     127d179:	4c 89 f9             	mov    rcx,r15
     127d17c:	ff 50 58             	call   QWORD PTR [rax+0x58]

### 0x12894f3; FDE=(19436628, 19437511)
     1289485:	48 89 cf             	mov    rdi,rcx
     1289488:	ff 50 78             	call   QWORD PTR [rax+0x78]
     128948b:	0f 10 40 01          	movups xmm0,XMMWORD PTR [rax+0x1]
     128948f:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     1289496:	00 
     1289497:	49 8b 8e 88 06 00 00 	mov    rcx,QWORD PTR [r14+0x688]
     128949e:	49 8b 96 90 06 00 00 	mov    rdx,QWORD PTR [r14+0x690]
     12894a5:	48 39 d1             	cmp    rcx,rdx
     12894a8:	74 2b                	je     12894d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcea59>
     12894aa:	f7 81 a0 02 00 00 fd 	test   DWORD PTR [rcx+0x2a0],0xfffffffd
     12894b1:	ff ff ff 
     12894b4:	75 16                	jne    12894cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcea50>
     12894b6:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
     12894bd:	00 
     12894be:	0f 11 81 ae 02 00 00 	movups XMMWORD PTR [rcx+0x2ae],xmm0
     12894c5:	c6 81 be 02 00 00 01 	mov    BYTE PTR [rcx+0x2be],0x1
     12894cc:	48 81 c1 d0 02 00 00 	add    rcx,0x2d0
     12894d3:	eb d0                	jmp    12894a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcea29>
     12894d5:	80 38 00             	cmp    BYTE PTR [rax],0x0
     12894d8:	0f 84 a1 02 00 00    	je     128977f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xced03>
     12894de:	41 83 be f8 05 00 00 	cmp    DWORD PTR [r14+0x5f8],0x0
     12894e5:	00 
     12894e6:	0f 85 93 02 00 00    	jne    128977f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xced03>
     12894ec:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     12894f0:	4c 89 e7             	mov    rdi,r12
     12894f3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     12894f9:	48 89 c6             	mov    rsi,rax
     12894fc:	8b 00                	mov    eax,DWORD PTR [rax]
     12894fe:	8b 4e 04             	mov    ecx,DWORD PTR [rsi+0x4]
     1289501:	01 c8                	add    eax,ecx
     1289503:	ff c0                	inc    eax
     1289505:	4c 63 e8             	movsxd r13,eax
     1289508:	49 8b 86 90 06 00 00 	mov    rax,QWORD PTR [r14+0x690]
     128950f:	49 2b 86 88 06 00 00 	sub    rax,QWORD PTR [r14+0x688]
     1289516:	b9 d0 02 00 00       	mov    ecx,0x2d0
     128951b:	48 99                	cqo
     128951d:	48 f7 f9             	idiv   rcx
     1289520:	4c 39 e8             	cmp    rax,r13
     1289523:	0f 83 56 02 00 00    	jae    128977f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xced03>
     1289529:	48 89 74 24 08       	mov    QWORD PTR [rsp+0x8],rsi
     128952e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1289532:	4c 89 e7             	mov    rdi,r12
     1289535:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     128953b:	49 8b ae 88 06 00 00 	mov    rbp,QWORD PTR [r14+0x688]
     1289542:	4d 8b a6 90 06 00 00 	mov    r12,QWORD PTR [r14+0x690]
     1289549:	4c 39 e5             	cmp    rbp,r12
     128954c:	0f 84 2d 02 00 00    	je     128977f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xced03>
     1289552:	48 8b 88 88 06 00 00 	mov    rcx,QWORD PTR [rax+0x688]
     1289559:	48 8b 90 90 06 00 00 	mov    rdx,QWORD PTR [rax+0x690]
     1289560:	48 39 d1             	cmp    rcx,rdx
     1289563:	0f 84 16 02 00 00    	je     128977f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xced03>
     1289569:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
     128956e:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     1289573:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     1289577:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
     128957c:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     1289581:	49 8d 86 88 06 00 00 	lea    rax,[r14+0x688]
     1289588:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     128958d:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     1289592:	48 89 c8             	mov    rax,rcx
     1289595:	48 83 c0 08          	add    rax,0x8
     1289599:	80 79 20 00          	cmp    BYTE PTR [rcx+0x20],0x0
     128959d:	4c 8d 6d 18          	lea    r13,[rbp+0x18]
     12895a1:	4c 0f 45 e8          	cmovne r13,rax
     12895a5:	49 89 ef             	mov    r15,rbp
     12895a8:	49 8d 7f 18          	lea    rdi,[r15+0x18]
     12895ac:	4c 89 ee             	mov    rsi,r13
     12895af:	e8 3a 61 81 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12895b4:	84 c0                	test   al,al
     12895b6:	75 0f                	jne    12895c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xceb4b>
     12895b8:	49 81 c7 d0 02 00 00 	add    r15,0x2d0

### 0x12dde54; FDE=(19781534, 19789354)
Strings: (dont_play_from_cache | true | &context_description |  format_list_type | playlist_number_of_tracks | playlist_number_of_episodes | player_filter_info | &filtering.predicate |  sorting.criteria | ignore_enhance_lens | enhanced_context | false | &player.restrictions | (collection.is_banned | "added_by_username | : | highlight_id | shuffle.group_forward
     12ddde6:	e8 93 bc 79 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12dddeb:	48 8d b4 24 70 06 00 	lea    rsi,[rsp+0x670]
     12dddf2:	00 
     12dddf3:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12dddf8:	e8 27 cb ba ff       	call   e8a924 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51d3a>
     12dddfd:	48 89 c7             	mov    rdi,rax
     12dde00:	4c 89 f6             	mov    rsi,r14
     12dde03:	e8 78 01 51 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     12dde08:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
     12dde0f:	00 
     12dde10:	e8 7b 00 51 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12dde15:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12dde1a:	48 8d b0 50 01 00 00 	lea    rsi,[rax+0x150]
     12dde21:	48 8d 98 00 05 00 00 	lea    rbx,[rax+0x500]
     12dde28:	48 89 df             	mov    rdi,rbx
     12dde2b:	e8 08 44 3f 00       	call   16d2238 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x863a4>
     12dde30:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12dde35:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     12dde39:	e8 ed 9f 00 00       	call   12e7e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x12d3af>
     12dde3e:	89 c5                	mov    ebp,eax
     12dde40:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12dde45:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     12dde49:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12dde4c:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     12dde53:	00 
     12dde54:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     12dde5a:	4c 8b ac 24 30 02 00 	mov    r13,QWORD PTR [rsp+0x230]
     12dde61:	00 
     12dde62:	4d 85 ed             	test   r13,r13
     12dde65:	0f 84 6a 01 00 00    	je     12ddfd5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x123559>
     12dde6b:	4c 8d 3d ee e3 0f ff 	lea    r15,[rip+0xffffffffff0fe3ee]        # 3dc260 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1caf>
     12dde72:	4c 8d a4 24 70 06 00 	lea    r12,[rsp+0x670]
     12dde79:	00 
     12dde7a:	4d 8d 75 10          	lea    r14,[r13+0x10]
     12dde7e:	4c 89 f7             	mov    rdi,r14
     12dde81:	4c 89 fe             	mov    rsi,r15
     12dde84:	e8 65 18 7c ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12dde89:	84 c0                	test   al,al
     12dde8b:	0f 84 cc 00 00 00    	je     12ddf5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1234e1>
     12dde91:	49 8d 7d 28          	lea    rdi,[r13+0x28]
     12dde95:	e8 9c d9 79 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     12dde9a:	0f 57 c0             	xorps  xmm0,xmm0
     12dde9d:	0f 29 84 24 70 06 00 	movaps XMMWORD PTR [rsp+0x670],xmm0
     12ddea4:	00 
     12ddea5:	48 83 a4 24 80 06 00 	and    QWORD PTR [rsp+0x680],0x0
     12ddeac:	00 00 
     12ddeae:	4c 89 e7             	mov    rdi,r12
     12ddeb1:	48 89 c6             	mov    rsi,rax
     12ddeb4:	31 c9                	xor    ecx,ecx
     12ddeb6:	e8 f0 d7 4f 00       	call   17db6ab <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x74cc>
     12ddebb:	84 c0                	test   al,al
     12ddebd:	0f 84 e0 00 00 00    	je     12ddfa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x123527>
     12ddec3:	48 8b 84 24 80 06 00 	mov    rax,QWORD PTR [rsp+0x680]
     12ddeca:	00 
     12ddecb:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
     12dded2:	00 
     12dded3:	0f 28 84 24 70 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x670]
     12ddeda:	00 
     12ddedb:	0f 29 84 24 d0 01 00 	movaps XMMWORD PTR [rsp+0x1d0],xmm0
     12ddee2:	00 
     12ddee3:	0f 57 c0             	xorps  xmm0,xmm0
     12ddee6:	0f 29 84 24 70 06 00 	movaps XMMWORD PTR [rsp+0x670],xmm0
     12ddeed:	00 
     12ddeee:	48 83 a4 24 80 06 00 	and    QWORD PTR [rsp+0x680],0x0
     12ddef5:	00 00 
     12ddef7:	4c 89 e7             	mov    rdi,r12
     12ddefa:	e8 91 ff 50 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     12ddeff:	c6 84 24 e8 01 00 00 	mov    BYTE PTR [rsp+0x1e8],0x1
     12ddf06:	01 
     12ddf07:	4c 89 e7             	mov    rdi,r12
     12ddf0a:	31 f6                	xor    esi,esi

### 0x12df9ed; FDE=(19790277, 19790486)
Strings: &lexicon_context_url
     12df99f:	5b                   	pop    rbx
     12df9a0:	41 5e                	pop    r14
     12df9a2:	e9 01 91 84 ff       	jmp    b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     12df9a7:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
     12df9ae:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     12df9b1:	48 83 c4 08          	add    rsp,0x8
     12df9b5:	5b                   	pop    rbx
     12df9b6:	41 5e                	pop    r14
     12df9b8:	e9 b3 a6 06 00       	jmp    134a070 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f5f4>
     12df9bd:	cc                   	int3
     12df9be:	31 f6                	xor    esi,esi
     12df9c0:	e9 4f 32 3d 00       	jmp    16b2c14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66d80>
     12df9c5:	41 57                	push   r15
     12df9c7:	41 56                	push   r14
     12df9c9:	53                   	push   rbx
     12df9ca:	48 83 ec 30          	sub    rsp,0x30
     12df9ce:	48 89 fb             	mov    rbx,rdi
     12df9d1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12df9d8:	00 00 
     12df9da:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     12df9df:	48 85 f6             	test   rsi,rsi
     12df9e2:	74 50                	je     12dfa34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124fb8>
     12df9e4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12df9e7:	49 89 e6             	mov    r14,rsp
     12df9ea:	4c 89 f7             	mov    rdi,r14
     12df9ed:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     12df9f3:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
     12df9f7:	4d 85 f6             	test   r14,r14
     12df9fa:	74 30                	je     12dfa2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124fb0>
     12df9fc:	4c 8d 3d 2d c8 0f ff 	lea    r15,[rip+0xffffffffff0fc82d]        # 3dc230 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1c7f>
     12dfa03:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     12dfa07:	4c 89 fe             	mov    rsi,r15
     12dfa0a:	e8 df fc 7b ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12dfa0f:	84 c0                	test   al,al
     12dfa11:	74 11                	je     12dfa24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124fa8>
     12dfa13:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
     12dfa17:	41 8b 7e 28          	mov    edi,DWORD PTR [r14+0x28]
     12dfa1b:	e8 00 be 79 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12dfa20:	84 c0                	test   al,al
     12dfa22:	74 31                	je     12dfa55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124fd9>
     12dfa24:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     12dfa27:	4d 85 f6             	test   r14,r14
     12dfa2a:	75 d7                	jne    12dfa03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124f87>
     12dfa2c:	48 89 e7             	mov    rdi,rsp
     12dfa2f:	e8 b6 b8 81 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     12dfa34:	31 c0                	xor    eax,eax
     12dfa36:	88 03                	mov    BYTE PTR [rbx],al
     12dfa38:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
     12dfa3b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12dfa42:	00 00 
     12dfa44:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     12dfa49:	75 46                	jne    12dfa91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x125015>
     12dfa4b:	48 83 c4 30          	add    rsp,0x30
     12dfa4f:	5b                   	pop    rbx
     12dfa50:	41 5e                	pop    r14
     12dfa52:	41 5f                	pop    r15
     12dfa54:	c3                   	ret
     12dfa55:	49 83 c6 28          	add    r14,0x28
     12dfa59:	48 89 df             	mov    rdi,rbx
     12dfa5c:	4c 89 f6             	mov    rsi,r14
     12dfa5f:	e8 36 cd 7e ff       	call   acc79a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1973a>
     12dfa64:	48 89 e7             	mov    rdi,rsp
     12dfa67:	e8 7e b8 81 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     12dfa6c:	eb cd                	jmp    12dfa3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x124fbf>
     12dfa6e:	48 89 c3             	mov    rbx,rax
     12dfa71:	48 89 e7             	mov    rdi,rsp
     12dfa74:	e8 71 b8 81 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     12dfa79:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12dfa80:	00 00 
     12dfa82:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     12dfa87:	75 08                	jne    12dfa91 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x125015>

### 0x12e49e0; FDE=(19810304, 19811702)
Strings: socialgraph/v2/following | DELETE | POST
     12e4971:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     12e4978:	00 
     12e4979:	e8 28 4f 30 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     12e497e:	48 8d 35 35 32 09 ff 	lea    rsi,[rip+0xffffffffff093235]        # 377bba <_ZTSSt12bad_any_cast@@Base-0x1860e>
     12e4985:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     12e498a:	e8 ef 50 79 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12e498f:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     12e4996:	00 
     12e4997:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     12e499c:	e8 5d 50 30 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
     12e49a1:	41 80 7d 28 00       	cmp    BYTE PTR [r13+0x28],0x0
     12e49a6:	48 8d 05 dc 41 0a ff 	lea    rax,[rip+0xffffffffff0a41dc]        # 388b89 <_ZTSSt12bad_any_cast@@Base-0x763f>
     12e49ad:	48 8d 35 ee a3 08 ff 	lea    rsi,[rip+0xffffffffff08a3ee]        # 36eda2 <_ZTSSt12bad_any_cast@@Base-0x21426>
     12e49b4:	48 0f 44 f0          	cmove  rsi,rax
     12e49b8:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     12e49bd:	e8 bc 50 79 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12e49c2:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
     12e49c9:	00 
     12e49ca:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     12e49cf:	48 89 df             	mov    rdi,rbx
     12e49d2:	e8 53 4f 30 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
     12e49d7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     12e49da:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12e49dd:	6a 01                	push   0x1
     12e49df:	5e                   	pop    rsi
     12e49e0:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     12e49e6:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     12e49eb:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
     12e49f2:	00 
     12e49f3:	e8 cc b2 49 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
     12e49f8:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
     12e49ff:	00 
     12e4a00:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     12e4a05:	48 89 df             	mov    rdi,rbx
     12e4a08:	e8 4d 51 30 00       	call   15e9b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f0de>
     12e4a0d:	49 8b b5 a8 00 00 00 	mov    rsi,QWORD PTR [r13+0xa8]
     12e4a14:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     12e4a17:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12e4a1a:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     12e4a20:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
     12e4a25:	4d 89 6f f8          	mov    QWORD PTR [r15-0x8],r13
     12e4a29:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     12e4a30:	00 
     12e4a31:	4c 89 ff             	mov    rdi,r15
     12e4a34:	e8 73 47 89 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     12e4a39:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     12e4a40:	00 
     12e4a41:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     12e4a46:	e8 55 50 89 ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     12e4a4b:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
     12e4a52:	00 00 
     12e4a54:	6a 20                	push   0x20
     12e4a56:	5f                   	pop    rdi
     12e4a57:	e8 a4 94 50 00       	call   17edf00 <_Znwm@plt>
     12e4a5c:	48 89 c3             	mov    rbx,rax
     12e4a5f:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
     12e4a66:	00 
     12e4a67:	48 8d 84 24 c0 00 00 	lea    rax,[rsp+0xc0]
     12e4a6e:	00 
     12e4a6f:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
     12e4a76:	00 
     12e4a77:	48 c7 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],0x1
     12e4a7e:	00 01 00 00 00 
     12e4a83:	48 8d 05 96 e5 57 00 	lea    rax,[rip+0x57e596]        # 1863020 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f708>
     12e4a8a:	48 89 03             	mov    QWORD PTR [rbx],rax
     12e4a8d:	48 89 df             	mov    rdi,rbx
     12e4a90:	48 83 c7 08          	add    rdi,0x8
     12e4a94:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
     12e4a9b:	00 
     12e4a9c:	e8 ff 4f 89 ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     12e4aa1:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]

### 0x12e55e4; FDE=(19813534, 19814772)
Strings: socialgraph/v4/ | /is-following/
     12e557d:	00 
     12e557e:	48 8d b4 24 98 00 00 	lea    rsi,[rsp+0x98]
     12e5585:	00 
     12e5586:	48 8d 54 24 50       	lea    rdx,[rsp+0x50]
     12e558b:	e8 00 0c 7d ff       	call   ab6190 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3130>
     12e5590:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
     12e5597:	00 
     12e5598:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     12e559f:	00 
     12e55a0:	e8 59 44 30 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
     12e55a5:	41 80 7f 38 00       	cmp    BYTE PTR [r15+0x38],0x0
     12e55aa:	48 8d 05 87 54 15 ff 	lea    rax,[rip+0xffffffffff155487]        # 43aa38 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x644>
     12e55b1:	48 8d 35 68 54 15 ff 	lea    rsi,[rip+0xffffffffff155468]        # 43aa20 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x62c>
     12e55b8:	48 0f 44 f0          	cmove  rsi,rax
     12e55bc:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     12e55c1:	e8 7a 89 50 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     12e55c6:	4c 8d b4 24 c8 00 00 	lea    r14,[rsp+0xc8]
     12e55cd:	00 
     12e55ce:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     12e55d3:	4c 89 f7             	mov    rdi,r14
     12e55d6:	e8 4f 43 30 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
     12e55db:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     12e55de:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12e55e1:	6a 01                	push   0x1
     12e55e3:	5e                   	pop    rsi
     12e55e4:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     12e55ea:	49 8b b7 b8 00 00 00 	mov    rsi,QWORD PTR [r15+0xb8]
     12e55f1:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     12e55f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12e55f7:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     12e55fd:	4c 8d 74 24 28       	lea    r14,[rsp+0x28]
     12e5602:	4d 89 7e f8          	mov    QWORD PTR [r14-0x8],r15
     12e5606:	48 8d b4 24 e8 00 00 	lea    rsi,[rsp+0xe8]
     12e560d:	00 
     12e560e:	4c 89 f7             	mov    rdi,r14
     12e5611:	e8 96 3b 89 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     12e5616:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     12e561d:	00 
     12e561e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     12e5623:	e8 78 44 89 ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     12e5628:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
     12e562f:	00 00 
     12e5631:	6a 20                	push   0x20
     12e5633:	5f                   	pop    rdi
     12e5634:	e8 c7 88 50 00       	call   17edf00 <_Znwm@plt>
     12e5639:	49 89 c4             	mov    r12,rax
     12e563c:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
     12e5643:	00 
     12e5644:	48 8d 84 24 f8 00 00 	lea    rax,[rsp+0xf8]
     12e564b:	00 
     12e564c:	48 89 84 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rax
     12e5653:	00 
     12e5654:	48 c7 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],0x1
     12e565b:	00 01 00 00 00 
     12e5660:	48 8d 05 49 da 57 00 	lea    rax,[rip+0x57da49]        # 18630b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f798>
     12e5667:	49 89 04 24          	mov    QWORD PTR [r12],rax
     12e566b:	4c 89 e7             	mov    rdi,r12
     12e566e:	48 83 c7 08          	add    rdi,0x8
     12e5672:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
     12e5679:	00 
     12e567a:	e8 21 44 89 ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     12e567f:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     12e5686:	00 
     12e5687:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     12e568b:	4c 8d ac 24 60 01 00 	lea    r13,[rsp+0x160]
     12e5692:	00 
     12e5693:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
     12e5697:	e8 2e 4c 79 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     12e569c:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
     12e56a3:	00 
     12e56a4:	e8 7d b4 7b ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>

### 0x12e5e7e; FDE=(19815612, 19816904)
Strings: socialgraph/v4/ | /is-following?limit=1000 | GET
     12e5e1a:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
     12e5e21:	00 
     12e5e22:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     12e5e27:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
     12e5e2b:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
     12e5e32:	00 
     12e5e33:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
     12e5e36:	0f 57 c0             	xorps  xmm0,xmm0
     12e5e39:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     12e5e40:	00 
     12e5e41:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     12e5e48:	00 00 
     12e5e4a:	4c 89 ff             	mov    rdi,r15
     12e5e4d:	e8 ac 3b 30 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
     12e5e52:	48 8d 35 cd f5 09 ff 	lea    rsi,[rip+0xffffffffff09f5cd]        # 385426 <_ZTSSt12bad_any_cast@@Base-0xada2>
     12e5e59:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     12e5e5e:	e8 1b 3c 79 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     12e5e63:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
     12e5e68:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     12e5e6d:	4c 89 ff             	mov    rdi,r15
     12e5e70:	e8 b5 3a 30 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
     12e5e75:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     12e5e78:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12e5e7b:	6a 01                	push   0x1
     12e5e7d:	5e                   	pop    rsi
     12e5e7e:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     12e5e84:	48 8b b3 e8 00 00 00 	mov    rsi,QWORD PTR [rbx+0xe8]
     12e5e8b:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     12e5e8e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12e5e91:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     12e5e97:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     12e5e9c:	49 89 5f f8          	mov    QWORD PTR [r15-0x8],rbx
     12e5ea0:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
     12e5ea7:	00 
     12e5ea8:	4c 89 ff             	mov    rdi,r15
     12e5eab:	e8 fc 32 89 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     12e5eb0:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     12e5eb7:	00 
     12e5eb8:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     12e5ebd:	e8 de 3b 89 ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     12e5ec2:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
     12e5ec9:	00 00 
     12e5ecb:	6a 20                	push   0x20
     12e5ecd:	5f                   	pop    rdi
     12e5ece:	e8 2d 80 50 00       	call   17edf00 <_Znwm@plt>
     12e5ed3:	49 89 c4             	mov    r12,rax
     12e5ed6:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     12e5edd:	00 
     12e5ede:	48 8d 84 24 b8 00 00 	lea    rax,[rsp+0xb8]
     12e5ee5:	00 
     12e5ee6:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
     12e5eed:	00 
     12e5eee:	48 c7 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],0x1
     12e5ef5:	00 01 00 00 00 
     12e5efa:	48 8d 05 3f d2 57 00 	lea    rax,[rip+0x57d23f]        # 1863140 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1f828>
     12e5f01:	49 89 04 24          	mov    QWORD PTR [r12],rax
     12e5f05:	4c 89 e7             	mov    rdi,r12
     12e5f08:	48 83 c7 08          	add    rdi,0x8
     12e5f0c:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     12e5f13:	00 
     12e5f14:	e8 87 3b 89 ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     12e5f19:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     12e5f20:	00 
     12e5f21:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     12e5f25:	4c 8d ac 24 20 01 00 	lea    r13,[rsp+0x120]
     12e5f2c:	00 
     12e5f2d:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
     12e5f31:	e8 94 43 79 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     12e5f36:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     12e5f3d:	00 
     12e5f3e:	e8 e3 ab 7b ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>

### 0x12ffe0c; FDE=(19922348, 19923228)
     12ffdb1:	41 55                	push   r13
     12ffdb3:	41 54                	push   r12
     12ffdb5:	53                   	push   rbx
     12ffdb6:	48 81 ec 28 01 00 00 	sub    rsp,0x128
     12ffdbd:	48 89 fb             	mov    rbx,rdi
     12ffdc0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12ffdc7:	00 00 
     12ffdc9:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
     12ffdd0:	00 
     12ffdd1:	4c 8b 76 18          	mov    r14,QWORD PTR [rsi+0x18]
     12ffdd5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12ffdd8:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     12ffddd:	4c 89 ff             	mov    rdi,r15
     12ffde0:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12ffde3:	4c 89 ff             	mov    rdi,r15
     12ffde6:	e8 4b ba 77 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     12ffdeb:	4c 8d bc 24 c8 00 00 	lea    r15,[rsp+0xc8]
     12ffdf2:	00 
     12ffdf3:	4c 89 ff             	mov    rdi,r15
     12ffdf6:	48 89 c6             	mov    rsi,rax
     12ffdf9:	e8 2a 56 3c 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     12ffdfe:	49 8b 06             	mov    rax,QWORD PTR [r14]
     12ffe01:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12ffe06:	4c 89 f6             	mov    rsi,r14
     12ffe09:	4c 89 fa             	mov    rdx,r15
     12ffe0c:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     12ffe12:	0f 57 c0             	xorps  xmm0,xmm0
     12ffe15:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
     12ffe19:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
     12ffe1d:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     12ffe20:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     12ffe25:	48 89 df             	mov    rdi,rbx
     12ffe28:	e8 53 e2 4e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     12ffe2d:	48 8d 43 18          	lea    rax,[rbx+0x18]
     12ffe31:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     12ffe36:	8b 4c 24 60          	mov    ecx,DWORD PTR [rsp+0x60]
     12ffe3a:	4c 63 c1             	movsxd r8,ecx
     12ffe3d:	48 8d 43 28          	lea    rax,[rbx+0x28]
     12ffe41:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     12ffe46:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
     12ffe4a:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]
     12ffe4e:	48 29 f0             	sub    rax,rsi
     12ffe51:	6a 30                	push   0x30
     12ffe53:	5f                   	pop    rdi
     12ffe54:	48 99                	cqo
     12ffe56:	48 f7 ff             	idiv   rdi
     12ffe59:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
     12ffe5e:	4c 39 c0             	cmp    rax,r8
     12ffe61:	73 51                	jae    12ffeb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x145438>
     12ffe63:	85 c9                	test   ecx,ecx
     12ffe65:	0f 88 26 02 00 00    	js     1300091 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x145615>
     12ffe6b:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
     12ffe6f:	48 29 f0             	sub    rax,rsi
     12ffe72:	48 99                	cqo
     12ffe74:	48 f7 ff             	idiv   rdi
     12ffe77:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     12ffe7c:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
     12ffe81:	48 89 c2             	mov    rdx,rax
     12ffe84:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     12ffe89:	e8 9e 64 7e ff       	call   ae632c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x332cc>
     12ffe8e:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
     12ffe93:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12ffe98:	4c 89 f6             	mov    rsi,r14
     12ffe9b:	e8 4e 0c 85 ff       	call   b50aee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9da8e>
     12ffea0:	4c 89 f7             	mov    rdi,r14
     12ffea3:	e8 dc 0c 85 ff       	call   b50b84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9db24>
     12ffea8:	8b 4c 24 60          	mov    ecx,DWORD PTR [rsp+0x60]
     12ffeac:	48 63 c1             	movsxd rax,ecx
     12ffeaf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     12ffeb4:	48 8d 44 24 58       	lea    rax,[rsp+0x58]
     12ffeb9:	48 8b 10             	mov    rdx,QWORD PTR [rax]

### 0x130d63d; FDE=(19977560, 19978160)
     130d5d1:	31 c0                	xor    eax,eax
     130d5d3:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     130d5d7:	88 84 24 88 00 00 00 	mov    BYTE PTR [rsp+0x88],al
     130d5de:	0f 57 c0             	xorps  xmm0,xmm0
     130d5e1:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     130d5e6:	48 83 64 24 50 00    	and    QWORD PTR [rsp+0x50],0x0
     130d5ec:	41 0f b6 45 41       	movzx  eax,BYTE PTR [r13+0x41]
     130d5f1:	c1 e0 03             	shl    eax,0x3
     130d5f4:	48 83 c8 20          	or     rax,0x20
     130d5f8:	49 8b 74 05 00       	mov    rsi,QWORD PTR [r13+rax*1+0x0]
     130d5fd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     130d600:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     130d605:	ff 50 58             	call   QWORD PTR [rax+0x58]
     130d608:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     130d60d:	4c 8b 64 24 30       	mov    r12,QWORD PTR [rsp+0x30]
     130d612:	4c 39 e3             	cmp    rbx,r12
     130d615:	0f 84 cd 00 00 00    	je     130d6e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152c6c>
     130d61b:	44 88 74 24 0e       	mov    BYTE PTR [rsp+0xe],r14b
     130d620:	40 88 6c 24 0f       	mov    BYTE PTR [rsp+0xf],bpl
     130d625:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
     130d62a:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
     130d62f:	49 8b 75 10          	mov    rsi,QWORD PTR [r13+0x10]
     130d633:	48 8d 53 18          	lea    rdx,[rbx+0x18]
     130d637:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     130d63a:	4c 89 f7             	mov    rdi,r14
     130d63d:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     130d643:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
     130d649:	74 09                	je     130d654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152bd8>
     130d64b:	80 bb f4 00 00 00 00 	cmp    BYTE PTR [rbx+0xf4],0x0
     130d652:	74 18                	je     130d66c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152bf0>
     130d654:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     130d659:	e8 88 67 82 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     130d65e:	48 81 c3 38 01 00 00 	add    rbx,0x138
     130d665:	4c 39 e3             	cmp    rbx,r12
     130d668:	75 c5                	jne    130d62f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152bb3>
     130d66a:	eb 2b                	jmp    130d697 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152c1b>
     130d66c:	48 89 df             	mov    rdi,rbx
     130d66f:	4c 89 fe             	mov    rsi,r15
     130d672:	e8 56 3d c7 ff       	call   f813cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1487e3>
     130d677:	89 c5                	mov    ebp,eax
     130d679:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     130d67e:	e8 63 67 82 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     130d683:	40 84 ed             	test   bpl,bpl
     130d686:	74 d6                	je     130d65e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152be2>
     130d688:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     130d68d:	48 89 de             	mov    rsi,rbx
     130d690:	e8 61 b9 7c ff       	call   ad8ff6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25f96>
     130d695:	eb c7                	jmp    130d65e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152be2>
     130d697:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     130d69c:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     130d6a1:	48 39 c1             	cmp    rcx,rax
     130d6a4:	40 8a 6c 24 0f       	mov    bpl,BYTE PTR [rsp+0xf]
     130d6a9:	44 8a 74 24 0e       	mov    r14b,BYTE PTR [rsp+0xe]
     130d6ae:	74 38                	je     130d6e8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152c6c>
     130d6b0:	41 0f b6 55 41       	movzx  edx,BYTE PTR [r13+0x41]
     130d6b5:	c1 e2 03             	shl    edx,0x3
     130d6b8:	48 83 ca 20          	or     rdx,0x20
     130d6bc:	49 8b 74 15 00       	mov    rsi,QWORD PTR [r13+rdx*1+0x0]
     130d6c1:	48 29 c8             	sub    rax,rcx
     130d6c4:	6a 18                	push   0x18
     130d6c6:	5f                   	pop    rdi
     130d6c7:	48 99                	cqo
     130d6c9:	48 f7 ff             	idiv   rdi
     130d6cc:	4c 8b 06             	mov    r8,QWORD PTR [rsi]
     130d6cf:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     130d6d4:	48 89 ca             	mov    rdx,rcx
     130d6d7:	48 89 c1             	mov    rcx,rax
     130d6da:	41 ff 50 30          	call   QWORD PTR [r8+0x30]
     130d6de:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     130d6e3:	e8 fe 66 82 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     130d6e8:	44 38 f5             	cmp    bpl,r14b

### 0x130d8d3; FDE=(19978396, 19978743)
Strings: [QueueFacade::addToUserQueue/user_queue_at_limit] dropping queue mutation: item_uri='%s' user_queue_size=%zu max_user_queue_items=%zu
     130d884:	e9 37 d6 ff ff       	jmp    130aec0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x150444>
     130d889:	c3                   	ret
     130d88a:	53                   	push   rbx
     130d88b:	48 89 fb             	mov    rbx,rdi
     130d88e:	e8 a9 8e f8 ff       	call   129673c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdbcc0>
     130d893:	48 89 df             	mov    rdi,rbx
     130d896:	5b                   	pop    rbx
     130d897:	e9 84 06 4e 00       	jmp    17edf20 <_ZdlPv@plt>
     130d89c:	41 57                	push   r15
     130d89e:	41 56                	push   r14
     130d8a0:	41 55                	push   r13
     130d8a2:	41 54                	push   r12
     130d8a4:	53                   	push   rbx
     130d8a5:	48 83 ec 30          	sub    rsp,0x30
     130d8a9:	49 89 d6             	mov    r14,rdx
     130d8ac:	49 89 f7             	mov    r15,rsi
     130d8af:	48 89 fb             	mov    rbx,rdi
     130d8b2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     130d8b9:	00 00 
     130d8bb:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     130d8c0:	48 8b 76 10          	mov    rsi,QWORD PTR [rsi+0x10]
     130d8c4:	48 83 c2 18          	add    rdx,0x18
     130d8c8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     130d8cb:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     130d8d0:	4c 89 e7             	mov    rdi,r12
     130d8d3:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     130d8d9:	49 83 7c 24 10 00    	cmp    QWORD PTR [r12+0x10],0x0
     130d8df:	74 1c                	je     130d8fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152e81>
     130d8e1:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     130d8e6:	48 89 df             	mov    rdi,rbx
     130d8e9:	e8 96 be 83 ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     130d8ee:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     130d8f3:	e8 ee 64 82 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     130d8f8:	e9 af 00 00 00       	jmp    130d9ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152f30>
     130d8fd:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     130d902:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     130d906:	e8 db 64 82 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     130d90b:	41 0f b6 47 41       	movzx  eax,BYTE PTR [r15+0x41]
     130d910:	c1 e0 03             	shl    eax,0x3
     130d913:	48 83 c8 20          	or     rax,0x20
     130d917:	49 8b 34 07          	mov    rsi,QWORD PTR [r15+rax*1]
     130d91b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     130d91e:	4c 89 ef             	mov    rdi,r13
     130d921:	ff 50 58             	call   QWORD PTR [rax+0x58]
     130d924:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     130d928:	49 2b 45 00          	sub    rax,QWORD PTR [r13+0x0]
     130d92c:	b9 38 01 00 00       	mov    ecx,0x138
     130d931:	48 99                	cqo
     130d933:	48 f7 f9             	idiv   rcx
     130d936:	49 89 c4             	mov    r12,rax
     130d939:	4c 89 ef             	mov    rdi,r13
     130d93c:	e8 87 aa ee ff       	call   11f83c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d94c>
     130d941:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
     130d945:	49 39 c4             	cmp    r12,rax
     130d948:	73 1e                	jae    130d968 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152eec>
     130d94a:	41 0f b6 47 41       	movzx  eax,BYTE PTR [r15+0x41]
     130d94f:	c1 e0 03             	shl    eax,0x3
     130d952:	48 83 c8 20          	or     rax,0x20
     130d956:	49 8b 34 07          	mov    rsi,QWORD PTR [r15+rax*1]
     130d95a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     130d95d:	48 89 df             	mov    rdi,rbx
     130d960:	4c 89 f2             	mov    rdx,r14
     130d963:	ff 50 10             	call   QWORD PTR [rax+0x10]
     130d966:	eb 44                	jmp    130d9ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152f30>
     130d968:	41 f6 46 18 01       	test   BYTE PTR [r14+0x18],0x1
     130d96d:	74 06                	je     130d975 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152ef9>
     130d96f:	4d 8b 76 28          	mov    r14,QWORD PTR [r14+0x28]
     130d973:	eb 04                	jmp    130d979 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152efd>
     130d975:	49 83 c6 19          	add    r14,0x19
     130d979:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     130d97d:	48 8d 35 f8 45 14 ff 	lea    rsi,[rip+0xffffffffff1445f8]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

### 0x130da47; FDE=(19978744, 19979181)
Strings: [QueueFacade::addToFrontOfUserQueue/user_queue_truncated] dropping tail items: items_count=%zu user_queue_size=%zu max_user_queue_items=%zu remaining=%zu | [QueueFacade::addToFrontOfUserQueue/user_queue_at_limit] dropping queue mutation: items_count=%zu user_queue_size=%zu max_user_queue_items=%zu
     130d9f7:	cc                   	int3
     130d9f8:	55                   	push   rbp
     130d9f9:	41 57                	push   r15
     130d9fb:	41 56                	push   r14
     130d9fd:	41 55                	push   r13
     130d9ff:	41 54                	push   r12
     130da01:	53                   	push   rbx
     130da02:	48 83 ec 28          	sub    rsp,0x28
     130da06:	49 89 cc             	mov    r12,rcx
     130da09:	48 89 14 24          	mov    QWORD PTR [rsp],rdx
     130da0d:	49 89 f7             	mov    r15,rsi
     130da10:	48 89 fb             	mov    rbx,rdi
     130da13:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     130da1a:	00 00 
     130da1c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     130da21:	48 85 c9             	test   rcx,rcx
     130da24:	74 4d                	je     130da73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152ff7>
     130da26:	4d 69 f4 38 01 00 00 	imul   r14,r12,0x138
     130da2d:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     130da31:	4c 8d 68 18          	lea    r13,[rax+0x18]
     130da35:	48 8d 6c 24 08       	lea    rbp,[rsp+0x8]
     130da3a:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
     130da3e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     130da41:	48 89 ef             	mov    rdi,rbp
     130da44:	4c 89 ea             	mov    rdx,r13
     130da47:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     130da4d:	48 83 7c 24 18 00    	cmp    QWORD PTR [rsp+0x18],0x0
     130da53:	0f 85 cc 00 00 00    	jne    130db25 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1530a9>
     130da59:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     130da5e:	e8 83 63 82 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     130da63:	49 81 c5 38 01 00 00 	add    r13,0x138
     130da6a:	49 81 c6 c8 fe ff ff 	add    r14,0xfffffffffffffec8
     130da71:	75 c7                	jne    130da3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x152fbe>
     130da73:	41 0f b6 47 41       	movzx  eax,BYTE PTR [r15+0x41]
     130da78:	c1 e0 03             	shl    eax,0x3
     130da7b:	48 83 c8 20          	or     rax,0x20
     130da7f:	49 8b 34 07          	mov    rsi,QWORD PTR [r15+rax*1]
     130da83:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     130da86:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     130da8b:	4c 89 ef             	mov    rdi,r13
     130da8e:	ff 50 58             	call   QWORD PTR [rax+0x58]
     130da91:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     130da95:	49 2b 45 00          	sub    rax,QWORD PTR [r13+0x0]
     130da99:	b9 38 01 00 00       	mov    ecx,0x138
     130da9e:	48 99                	cqo
     130daa0:	48 f7 f9             	idiv   rcx
     130daa3:	48 89 c5             	mov    rbp,rax
     130daa6:	4c 89 ef             	mov    rdi,r13
     130daa9:	e8 1a a9 ee ff       	call   11f83c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d94c>
     130daae:	4d 8b 57 30          	mov    r10,QWORD PTR [r15+0x30]
     130dab2:	4d 89 d5             	mov    r13,r10
     130dab5:	49 29 ed             	sub    r13,rbp
     130dab8:	76 30                	jbe    130daea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15306e>
     130daba:	4d 39 e5             	cmp    r13,r12
     130dabd:	73 7f                	jae    130db3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1530c2>
     130dabf:	48 8d 35 b6 44 14 ff 	lea    rsi,[rip+0xffffffffff1444b6]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     130dac6:	48 8d 0d 83 b6 02 ff 	lea    rcx,[rip+0xffffffffff02b683]        # 339150 <_ZTSSt12bad_any_cast@@Base-0x57078>
     130dacd:	6a 03                	push   0x3
     130dacf:	5f                   	pop    rdi
     130dad0:	6a 54                	push   0x54
     130dad2:	5a                   	pop    rdx
     130dad3:	4d 89 e0             	mov    r8,r12
     130dad6:	49 89 e9             	mov    r9,rbp
     130dad9:	31 c0                	xor    eax,eax
     130dadb:	41 55                	push   r13
     130dadd:	41 52                	push   r10
     130dadf:	e8 ee 8d 4c 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     130dae4:	48 83 c4 10          	add    rsp,0x10
     130dae8:	eb 57                	jmp    130db41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1530c5>
     130daea:	48 83 ec 08          	sub    rsp,0x8
     130daee:	48 8d 35 87 44 14 ff 	lea    rsi,[rip+0xffffffffff144487]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

### 0x1320581; FDE=(20053180, 20058052)
Strings: default | small | large | xlarge | loaded | loading | notFound | forbidden | unavailable for legal reasons
     1320525:	48 85 db             	test   rbx,rbx
     1320528:	75 b2                	jne    13204dc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165a60>
     132052a:	e9 7f 01 00 00       	jmp    13206ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165c32>
     132052f:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     1320533:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     1320536:	eb bc                	jmp    13204f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165a78>
     1320538:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     132053c:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     132053f:	eb d1                	jmp    1320512 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165a96>
     1320541:	41 80 7e 32 00       	cmp    BYTE PTR [r14+0x32],0x0
     1320546:	74 2c                	je     1320574 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165af8>
     1320548:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     132054b:	48 89 df             	mov    rdi,rbx
     132054e:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     1320554:	80 4d 10 02          	or     BYTE PTR [rbp+0x10],0x2
     1320558:	48 8d bd 80 00 00 00 	lea    rdi,[rbp+0x80]
     132055f:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
     1320563:	f6 c2 01             	test   dl,0x1
     1320566:	0f 85 14 09 00 00    	jne    1320e80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166404>
     132056c:	48 89 c6             	mov    rsi,rax
     132056f:	e8 1e 52 44 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1320574:	41 80 7e 35 00       	cmp    BYTE PTR [r14+0x35],0x0
     1320579:	74 16                	je     1320591 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165b15>
     132057b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     132057e:	48 89 df             	mov    rdi,rbx
     1320581:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1320587:	88 85 cd 00 00 00    	mov    BYTE PTR [rbp+0xcd],al
     132058d:	80 4d 11 10          	or     BYTE PTR [rbp+0x11],0x10
     1320591:	41 80 7e 38 00       	cmp    BYTE PTR [r14+0x38],0x0
     1320596:	74 16                	je     13205ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165b32>
     1320598:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     132059b:	48 89 df             	mov    rdi,rbx
     132059e:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     13205a4:	89 85 c8 00 00 00    	mov    DWORD PTR [rbp+0xc8],eax
     13205aa:	80 4d 11 04          	or     BYTE PTR [rbp+0x11],0x4
     13205ae:	41 80 7e 3a 00       	cmp    BYTE PTR [r14+0x3a],0x0
     13205b3:	74 2c                	je     13205e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165b65>
     13205b5:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13205b8:	48 89 df             	mov    rdi,rbx
     13205bb:	ff 90 f0 00 00 00    	call   QWORD PTR [rax+0xf0]
     13205c1:	80 4d 10 04          	or     BYTE PTR [rbp+0x10],0x4
     13205c5:	48 8d bd 88 00 00 00 	lea    rdi,[rbp+0x88]
     13205cc:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
     13205d0:	f6 c2 01             	test   dl,0x1
     13205d3:	0f 85 b3 08 00 00    	jne    1320e8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166410>
     13205d9:	48 89 c6             	mov    rsi,rax
     13205dc:	e8 b1 51 44 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     13205e1:	41 80 7e 47 00       	cmp    BYTE PTR [r14+0x47],0x0
     13205e6:	74 31                	je     1320619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165b9d>
     13205e8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     13205eb:	48 89 df             	mov    rdi,rbx
     13205ee:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     13205f4:	48 85 c0             	test   rax,rax
     13205f7:	74 20                	je     1320619 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165b9d>
     13205f9:	80 4d 10 08          	or     BYTE PTR [rbp+0x10],0x8
     13205fd:	48 8d bd 90 00 00 00 	lea    rdi,[rbp+0x90]
     1320604:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
     1320608:	f6 c2 01             	test   dl,0x1
     132060b:	0f 85 ab 08 00 00    	jne    1320ebc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166440>
     1320611:	48 89 c6             	mov    rsi,rax
     1320614:	e8 79 51 44 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     1320619:	41 80 7e 48 00       	cmp    BYTE PTR [r14+0x48],0x0
     132061e:	0f 84 37 02 00 00    	je     132085b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165ddf>
     1320624:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     1320627:	4c 8d b4 24 90 00 00 	lea    r14,[rsp+0x90]
     132062e:	00 
     132062f:	4c 89 f7             	mov    rdi,r14
     1320632:	48 89 de             	mov    rsi,rbx
     1320635:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
     132063b:	49 8b 5e 10          	mov    rbx,QWORD PTR [r14+0x10]
     132063f:	48 85 db             	test   rbx,rbx

### 0x134d788; FDE=(20239686, 20240934)
Strings: /v1/ | /v2/playlist/ | /count | : | / | GET
     134d71c:	00 
     134d71d:	e8 1a ac 75 ff       	call   aa833c <JNI_OnUnload@@Base+0x2fc09>
     134d722:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     134d729:	00 
     134d72a:	e8 61 07 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     134d72f:	48 8d 35 38 52 fe fe 	lea    rsi,[rip+0xfffffffffefe5238]        # 33296e <_ZTSSt12bad_any_cast@@Base-0x5d85a>
     134d736:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     134d73b:	e8 80 08 4a 00       	call   17edfc0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc@plt>
     134d740:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     134d747:	00 
     134d748:	e8 43 07 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     134d74d:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     134d752:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
     134d757:	e8 a2 c2 29 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
     134d75c:	48 8d 35 c3 7c 03 ff 	lea    rsi,[rip+0xffffffffff037cc3]        # 385426 <_ZTSSt12bad_any_cast@@Base-0xada2>
     134d763:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     134d768:	e8 11 c3 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     134d76d:	4c 8d 7c 24 68       	lea    r15,[rsp+0x68]
     134d772:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     134d777:	4c 89 ff             	mov    rdi,r15
     134d77a:	e8 ab c1 29 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
     134d77f:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     134d782:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     134d785:	6a 01                	push   0x1
     134d787:	5e                   	pop    rsi
     134d788:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     134d78e:	49 8b b6 f8 00 00 00 	mov    rsi,QWORD PTR [r14+0xf8]
     134d795:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     134d798:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     134d79b:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     134d7a1:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     134d7a6:	4d 89 77 f8          	mov    QWORD PTR [r15-0x8],r14
     134d7aa:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     134d7b1:	00 
     134d7b2:	4c 89 ff             	mov    rdi,r15
     134d7b5:	e8 f2 b9 82 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     134d7ba:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     134d7c1:	00 
     134d7c2:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     134d7c7:	e8 a2 c0 82 ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     134d7cc:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
     134d7d3:	00 00 
     134d7d5:	6a 20                	push   0x20
     134d7d7:	5f                   	pop    rdi
     134d7d8:	e8 23 07 4a 00       	call   17edf00 <_Znwm@plt>
     134d7dd:	49 89 c4             	mov    r12,rax
     134d7e0:	48 8d 05 31 95 51 00 	lea    rax,[rip+0x519531]        # 1866d18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23400>
     134d7e7:	49 89 04 24          	mov    QWORD PTR [r12],rax
     134d7eb:	4c 89 e7             	mov    rdi,r12
     134d7ee:	48 83 c7 08          	add    rdi,0x8
     134d7f2:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     134d7f9:	00 
     134d7fa:	e8 6f c0 82 ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     134d7ff:	4c 8d ac 24 e0 00 00 	lea    r13,[rsp+0xe0]
     134d806:	00 
     134d807:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
     134d80b:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     134d812:	00 
     134d813:	e8 0e 33 75 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     134d818:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     134d81d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     134d820:	4c 89 ee             	mov    rsi,r13
     134d823:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     134d829:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     134d82e:	4d 89 74 24 f8       	mov    QWORD PTR [r12-0x8],r14
     134d833:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     134d83a:	00 
     134d83b:	4c 89 e7             	mov    rdi,r12
     134d83e:	e8 69 b9 82 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     134d843:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
     134d84a:	00 

### 0x136de82; FDE=(20371922, 20373584)
     136de12:	48 8d b5 30 06 00 00 	lea    rsi,[rbp+0x630]
     136de19:	4c 89 e7             	mov    rdi,r12
     136de1c:	e8 eb f1 d1 ff       	call   108d00c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x254422>
     136de21:	48 8d bc 24 e8 01 00 	lea    rdi,[rsp+0x1e8]
     136de28:	00 
     136de29:	48 8d b5 50 06 00 00 	lea    rsi,[rbp+0x650]
     136de30:	e8 0b 01 48 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     136de35:	4c 8d a4 24 f0 00 00 	lea    r12,[rsp+0xf0]
     136de3c:	00 
     136de3d:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     136de42:	4c 89 ef             	mov    rdi,r13
     136de45:	4c 89 e6             	mov    rsi,r12
     136de48:	e8 fd 03 d2 ff       	call   108e24a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255660>
     136de4d:	4c 89 e7             	mov    rdi,r12
     136de50:	e8 95 bd d1 ff       	call   1089bea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251000>
     136de55:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     136de5a:	48 89 ef             	mov    rdi,rbp
     136de5d:	e8 44 2c 02 00       	call   1390aa6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d602a>
     136de62:	89 83 48 05 00 00    	mov    DWORD PTR [rbx+0x548],eax
     136de68:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     136de6c:	48 89 ef             	mov    rdi,rbp
     136de6f:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     136de75:	88 83 4c 05 00 00    	mov    BYTE PTR [rbx+0x54c],al
     136de7b:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     136de7f:	48 89 ef             	mov    rdi,rbp
     136de82:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     136de88:	88 83 4d 05 00 00    	mov    BYTE PTR [rbx+0x54d],al
     136de8e:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     136de92:	48 89 ef             	mov    rdi,rbp
     136de95:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     136de9b:	88 83 4e 05 00 00    	mov    BYTE PTR [rbx+0x54e],al
     136dea1:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     136dea5:	48 89 ef             	mov    rdi,rbp
     136dea8:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     136deae:	88 83 4f 05 00 00    	mov    BYTE PTR [rbx+0x54f],al
     136deb4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     136deb9:	e8 72 8e 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     136debe:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     136dec3:	e8 68 8e 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     136dec8:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     136decd:	e8 5e 8e 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     136ded2:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     136ded9:	00 
     136deda:	e8 ed 08 73 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     136dedf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     136dee6:	00 00 
     136dee8:	48 3b 84 24 00 02 00 	cmp    rax,QWORD PTR [rsp+0x200]
     136deef:	00 
     136def0:	0f 85 55 01 00 00    	jne    136e04b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b35cf>
     136def6:	48 81 c4 08 02 00 00 	add    rsp,0x208
     136defd:	5b                   	pop    rbx
     136defe:	41 5c                	pop    r12
     136df00:	41 5d                	pop    r13
     136df02:	41 5e                	pop    r14
     136df04:	41 5f                	pop    r15
     136df06:	5d                   	pop    rbp
     136df07:	c3                   	ret
     136df08:	48 89 c5             	mov    rbp,rax
     136df0b:	4c 89 e7             	mov    rdi,r12
     136df0e:	e8 1b bd d1 ff       	call   1089c2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x251044>
     136df13:	eb 03                	jmp    136df18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b349c>
     136df15:	48 89 c5             	mov    rbp,rax
     136df18:	48 8b bc 24 b0 01 00 	mov    rdi,QWORD PTR [rsp+0x1b0]
     136df1f:	00 
     136df20:	e8 61 05 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     136df25:	4c 89 ef             	mov    rdi,r13
     136df28:	e8 63 ff 47 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     136df2d:	eb 05                	jmp    136df34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b34b8>
     136df2f:	eb 00                	jmp    136df31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b34b5>
     136df31:	48 89 c5             	mov    rbp,rax
     136df34:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]

### 0x1399278; FDE=(20549832, 20550663)
     139920f:	4c 89 e7             	mov    rdi,r12
     1399212:	4c 89 fe             	mov    rsi,r15
     1399215:	e8 26 9a 94 ff       	call   ce2c40 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22fbe0>
     139921a:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
     1399221:	00 
     1399222:	4c 89 e6             	mov    rsi,r12
     1399225:	e8 04 28 6e ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     139922a:	4c 89 e7             	mov    rdi,r12
     139922d:	e8 5e 4c 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1399232:	49 8b be a8 08 00 00 	mov    rdi,QWORD PTR [r14+0x8a8]
     1399239:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     139923c:	ff 50 30             	call   QWORD PTR [rax+0x30]
     139923f:	48 89 c7             	mov    rdi,rax
     1399242:	31 f6                	xor    esi,esi
     1399244:	e8 33 5a 24 00       	call   15dec7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x424200>
     1399249:	89 84 24 14 02 00 00 	mov    DWORD PTR [rsp+0x214],eax
     1399250:	49 8b be b8 08 00 00 	mov    rdi,QWORD PTR [r14+0x8b8]
     1399257:	48 85 ff             	test   rdi,rdi
     139925a:	0f 84 06 01 00 00    	je     1399366 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1de8ea>
     1399260:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1399263:	ff 50 60             	call   QWORD PTR [rax+0x60]
     1399266:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
     139926d:	00 
     139926e:	49 8b be b8 08 00 00 	mov    rdi,QWORD PTR [r14+0x8b8]
     1399275:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1399278:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     139927e:	89 84 24 34 02 00 00 	mov    DWORD PTR [rsp+0x234],eax
     1399285:	48 c1 e8 20          	shr    rax,0x20
     1399289:	88 84 24 38 02 00 00 	mov    BYTE PTR [rsp+0x238],al
     1399290:	49 8b b6 b8 08 00 00 	mov    rsi,QWORD PTR [r14+0x8b8]
     1399297:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     139929a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     13992a1:	00 
     13992a2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     13992a5:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     13992ac:	00 
     13992ad:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
     13992b4:	00 
     13992b5:	4c 89 fe             	mov    rsi,r15
     13992b8:	e8 71 27 6e ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     13992bd:	4c 89 ff             	mov    rdi,r15
     13992c0:	e8 cb 4b 45 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     13992c5:	49 8b be b8 08 00 00 	mov    rdi,QWORD PTR [r14+0x8b8]
     13992cc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13992cf:	ff 50 70             	call   QWORD PTR [rax+0x70]
     13992d2:	89 84 24 0c 02 00 00 	mov    DWORD PTR [rsp+0x20c],eax
     13992d9:	48 c1 e8 20          	shr    rax,0x20
     13992dd:	88 84 24 10 02 00 00 	mov    BYTE PTR [rsp+0x210],al
     13992e4:	49 8b be b8 08 00 00 	mov    rdi,QWORD PTR [r14+0x8b8]
     13992eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13992ee:	ff 50 78             	call   QWORD PTR [rax+0x78]
     13992f1:	f3 0f 11 44 24 04    	movss  DWORD PTR [rsp+0x4],xmm0
     13992f7:	48 c1 e8 20          	shr    rax,0x20
     13992fb:	89 84 24 30 02 00 00 	mov    DWORD PTR [rsp+0x230],eax
     1399302:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1399307:	4c 89 f6             	mov    rsi,r14
     139930a:	e8 1b a9 ff ff       	call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
     139930f:	80 7c 24 20 00       	cmp    BYTE PTR [rsp+0x20],0x0
     1399314:	74 46                	je     139935c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1de8e0>
     1399316:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     139931b:	e8 16 25 6e ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1399320:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     1399327:	00 
     1399328:	4c 89 f7             	mov    rdi,r14
     139932b:	48 89 c6             	mov    rsi,rax
     139932e:	e8 f5 c0 32 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1399333:	41 8b 6e 38          	mov    ebp,DWORD PTR [r14+0x38]
     1399337:	4c 89 f7             	mov    rdi,r14
     139933a:	e8 ef bf 32 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     139933f:	83 fd 3f             	cmp    ebp,0x3f
     1399342:	75 18                	jne    139935c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1de8e0>

### 0x13b641a; FDE=(20669222, 20669731)
     13b63b6:	0f 10 44 24 30       	movups xmm0,XMMWORD PTR [rsp+0x30]
     13b63bb:	0f 10 4c 24 40       	movups xmm1,XMMWORD PTR [rsp+0x40]
     13b63c0:	0f 29 84 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm0
     13b63c7:	00 
     13b63c8:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     13b63cd:	0f 29 8c 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm1
     13b63d4:	00 
     13b63d5:	48 85 c0             	test   rax,rax
     13b63d8:	74 05                	je     13b63df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fb963>
     13b63da:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     13b63df:	0f 10 44 24 50       	movups xmm0,XMMWORD PTR [rsp+0x50]
     13b63e4:	4c 8d b4 24 b0 00 00 	lea    r14,[rsp+0xb0]
     13b63eb:	00 
     13b63ec:	41 0f 29 46 20       	movaps XMMWORD PTR [r14+0x20],xmm0
     13b63f1:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     13b63f5:	4c 8d bc 24 e8 00 00 	lea    r15,[rsp+0xe8]
     13b63fc:	00 
     13b63fd:	4c 39 a4 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],r12
     13b6404:	00 
     13b6405:	74 56                	je     13b645d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fb9e1>
     13b6407:	48 8b b4 24 c0 00 00 	mov    rsi,QWORD PTR [rsp+0xc0]
     13b640e:	00 
     13b640f:	48 8b 94 24 d8 00 00 	mov    rdx,QWORD PTR [rsp+0xd8]
     13b6416:	00 
     13b6417:	4c 89 ff             	mov    rdi,r15
     13b641a:	ff 94 24 d0 00 00 00 	call   QWORD PTR [rsp+0xd0]
     13b6421:	80 bc 24 f8 00 00 00 	cmp    BYTE PTR [rsp+0xf8],0x0
     13b6428:	00 
     13b6429:	74 28                	je     13b6453 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fb9d7>
     13b642b:	80 7b 10 00          	cmp    BYTE PTR [rbx+0x10],0x0
     13b642f:	74 13                	je     13b6444 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fb9c8>
     13b6431:	4c 89 ff             	mov    rdi,r15
     13b6434:	48 89 de             	mov    rsi,rbx
     13b6437:	e8 28 fc 90 ff       	call   cc6064 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x213004>
     13b643c:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
     13b643f:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     13b6442:	eb 0f                	jmp    13b6453 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fb9d7>
     13b6444:	0f 10 84 24 e8 00 00 	movups xmm0,XMMWORD PTR [rsp+0xe8]
     13b644b:	00 
     13b644c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     13b644f:	c6 43 10 01          	mov    BYTE PTR [rbx+0x10],0x1
     13b6453:	4c 89 f7             	mov    rdi,r14
     13b6456:	e8 95 39 42 00       	call   17d9df0 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c11>
     13b645b:	eb a0                	jmp    13b63fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fb981>
     13b645d:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     13b6464:	00 
     13b6465:	e8 1c 80 6e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13b646a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     13b646f:	e8 12 80 6e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13b6474:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     13b6479:	e8 08 80 6e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13b647e:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     13b6483:	e8 dc 66 70 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     13b6488:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     13b648f:	00 
     13b6490:	e8 cf 66 70 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     13b6495:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13b649c:	00 00 
     13b649e:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
     13b64a5:	00 
     13b64a6:	75 76                	jne    13b651e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fbaa2>
     13b64a8:	48 81 c4 08 01 00 00 	add    rsp,0x108
     13b64af:	5b                   	pop    rbx
     13b64b0:	41 5c                	pop    r12
     13b64b2:	41 5e                	pop    r14
     13b64b4:	41 5f                	pop    r15
     13b64b6:	c3                   	ret
     13b64b7:	48 89 c3             	mov    rbx,rax
     13b64ba:	eb 26                	jmp    13b64e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fba66>
     13b64bc:	48 89 c3             	mov    rbx,rax
     13b64bf:	eb 2b                	jmp    13b64ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fba70>

### 0x13e4c45; FDE=(20859884, 20860056)
     13e4be7:	e8 e4 b0 68 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13e4bec:	55                   	push   rbp
     13e4bed:	41 56                	push   r14
     13e4bef:	53                   	push   rbx
     13e4bf0:	48 89 fb             	mov    rbx,rdi
     13e4bf3:	48 8b 87 50 01 00 00 	mov    rax,QWORD PTR [rdi+0x150]
     13e4bfa:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     13e4bfe:	48 89 70 50          	mov    QWORD PTR [rax+0x50],rsi
     13e4c02:	89 50 58             	mov    DWORD PTR [rax+0x58],edx
     13e4c05:	83 60 5c 00          	and    DWORD PTR [rax+0x5c],0x0
     13e4c09:	49 89 ce             	mov    r14,rcx
     13e4c0c:	48 8b bf 50 01 00 00 	mov    rdi,QWORD PTR [rdi+0x150]
     13e4c13:	48 8b b3 58 01 00 00 	mov    rsi,QWORD PTR [rbx+0x158]
     13e4c1a:	8b 93 1c 01 00 00    	mov    edx,DWORD PTR [rbx+0x11c]
     13e4c20:	e8 2b 07 00 00       	call   13e5350 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a8d4>
     13e4c25:	85 c0                	test   eax,eax
     13e4c27:	78 4e                	js     13e4c77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a1fb>
     13e4c29:	31 ed                	xor    ebp,ebp
     13e4c2b:	85 c0                	test   eax,eax
     13e4c2d:	74 4c                	je     13e4c7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a1ff>
     13e4c2f:	48 8b bb 40 01 00 00 	mov    rdi,QWORD PTR [rbx+0x140]
     13e4c36:	48 8b b3 58 01 00 00 	mov    rsi,QWORD PTR [rbx+0x158]
     13e4c3d:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
     13e4c40:	89 c2                	mov    edx,eax
     13e4c42:	4c 89 f1             	mov    rcx,r14
     13e4c45:	41 ff 90 d0 00 00 00 	call   QWORD PTR [r8+0xd0]
     13e4c4c:	48 89 c1             	mov    rcx,rax
     13e4c4f:	48 c1 e8 20          	shr    rax,0x20
     13e4c53:	75 32                	jne    13e4c87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a20b>
     13e4c55:	01 cd                	add    ebp,ecx
     13e4c57:	48 8b bb 50 01 00 00 	mov    rdi,QWORD PTR [rbx+0x150]
     13e4c5e:	48 8b b3 58 01 00 00 	mov    rsi,QWORD PTR [rbx+0x158]
     13e4c65:	8b 93 1c 01 00 00    	mov    edx,DWORD PTR [rbx+0x11c]
     13e4c6b:	4c 89 f1             	mov    rcx,r14
     13e4c6e:	e8 dd 06 00 00       	call   13e5350 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a8d4>
     13e4c73:	85 c0                	test   eax,eax
     13e4c75:	79 b4                	jns    13e4c2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a1af>
     13e4c77:	31 c9                	xor    ecx,ecx
     13e4c79:	eb 0c                	jmp    13e4c87 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a20b>
     13e4c7b:	31 c9                	xor    ecx,ecx
     13e4c7d:	85 ed                	test   ebp,ebp
     13e4c7f:	89 e8                	mov    eax,ebp
     13e4c81:	0f 49 c1             	cmovns eax,ecx
     13e4c84:	0f 49 cd             	cmovns ecx,ebp
     13e4c87:	48 c1 e0 20          	shl    rax,0x20
     13e4c8b:	89 c9                	mov    ecx,ecx
     13e4c8d:	48 09 c1             	or     rcx,rax
     13e4c90:	48 89 c8             	mov    rax,rcx
     13e4c93:	5b                   	pop    rbx
     13e4c94:	41 5e                	pop    r14
     13e4c96:	5d                   	pop    rbp
     13e4c97:	c3                   	ret
     13e4c98:	50                   	push   rax
     13e4c99:	48 8b bf 50 01 00 00 	mov    rdi,QWORD PTR [rdi+0x150]
     13e4ca0:	e8 ab 06 00 00       	call   13e5350 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a8d4>
     13e4ca5:	31 c9                	xor    ecx,ecx
     13e4ca7:	85 c0                	test   eax,eax
     13e4ca9:	89 c2                	mov    edx,eax
     13e4cab:	0f 49 d1             	cmovns edx,ecx
     13e4cae:	0f 48 c1             	cmovs  eax,ecx
     13e4cb1:	48 c1 e2 20          	shl    rdx,0x20
     13e4cb5:	48 09 d0             	or     rax,rdx
     13e4cb8:	59                   	pop    rcx
     13e4cb9:	c3                   	ret
     13e4cba:	55                   	push   rbp
     13e4cbb:	41 57                	push   r15
     13e4cbd:	41 56                	push   r14
     13e4cbf:	41 55                	push   r13
     13e4cc1:	41 54                	push   r12
     13e4cc3:	53                   	push   rbx
     13e4cc4:	48 83 ec 18          	sub    rsp,0x18

### 0x14243ac; FDE=(21119882, 21120011)
     1424353:	c3                   	ret
     1424354:	48 89 c3             	mov    rbx,rax
     1424357:	48 89 e7             	mov    rdi,rsp
     142435a:	e8 7d 48 68 ff       	call   aa8bdc <JNI_OnUnload@@Base+0x304a9>
     142435f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1424366:	00 00 
     1424368:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
     142436d:	75 08                	jne    1424377 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2698fb>
     142436f:	48 89 df             	mov    rdi,rbx
     1424372:	e8 59 b9 64 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1424377:	e8 34 b7 3c 00       	call   17efab0 <__stack_chk_fail@plt>
     142437c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1424380:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1424383:	48 8b 40 70          	mov    rax,QWORD PTR [rax+0x70]
     1424387:	ff e0                	jmp    rax
     1424389:	cc                   	int3
     142438a:	53                   	push   rbx
     142438b:	48 83 ec 20          	sub    rsp,0x20
     142438f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1424396:	00 00 
     1424398:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     142439d:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     14243a1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14243a4:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     14243a9:	48 89 df             	mov    rdi,rbx
     14243ac:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     14243b2:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     14243b5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14243b8:	ff 50 18             	call   QWORD PTR [rax+0x18]
     14243bb:	48 89 c3             	mov    rbx,rax
     14243be:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14243c3:	e8 be a0 67 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14243c8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14243cf:	00 00 
     14243d1:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14243d6:	75 2e                	jne    1424406 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26998a>
     14243d8:	48 89 d8             	mov    rax,rbx
     14243db:	48 83 c4 20          	add    rsp,0x20
     14243df:	5b                   	pop    rbx
     14243e0:	c3                   	ret
     14243e1:	48 89 c3             	mov    rbx,rax
     14243e4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14243e9:	e8 98 a0 67 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14243ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14243f5:	00 00 
     14243f7:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14243fc:	75 08                	jne    1424406 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26998a>
     14243fe:	48 89 df             	mov    rdi,rbx
     1424401:	e8 ca b8 64 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1424406:	e8 a5 b6 3c 00       	call   17efab0 <__stack_chk_fail@plt>
     142440b:	cc                   	int3
     142440c:	53                   	push   rbx
     142440d:	48 83 ec 20          	sub    rsp,0x20
     1424411:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1424418:	00 00 
     142441a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     142441f:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     1424423:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1424426:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     142442b:	48 89 df             	mov    rdi,rbx
     142442e:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1424434:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1424437:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     142443a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     142443d:	48 89 c3             	mov    rbx,rax
     1424440:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1424445:	e8 3c a0 67 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     142444a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1424451:	00 00 
     1424453:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1424458:	75 2e                	jne    1424488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269a0c>

### 0x142442e; FDE=(21120012, 21120141)
     14243d6:	75 2e                	jne    1424406 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26998a>
     14243d8:	48 89 d8             	mov    rax,rbx
     14243db:	48 83 c4 20          	add    rsp,0x20
     14243df:	5b                   	pop    rbx
     14243e0:	c3                   	ret
     14243e1:	48 89 c3             	mov    rbx,rax
     14243e4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14243e9:	e8 98 a0 67 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14243ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14243f5:	00 00 
     14243f7:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14243fc:	75 08                	jne    1424406 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26998a>
     14243fe:	48 89 df             	mov    rdi,rbx
     1424401:	e8 ca b8 64 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1424406:	e8 a5 b6 3c 00       	call   17efab0 <__stack_chk_fail@plt>
     142440b:	cc                   	int3
     142440c:	53                   	push   rbx
     142440d:	48 83 ec 20          	sub    rsp,0x20
     1424411:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1424418:	00 00 
     142441a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     142441f:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
     1424423:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1424426:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     142442b:	48 89 df             	mov    rdi,rbx
     142442e:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1424434:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     1424437:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     142443a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     142443d:	48 89 c3             	mov    rbx,rax
     1424440:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1424445:	e8 3c a0 67 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     142444a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1424451:	00 00 
     1424453:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1424458:	75 2e                	jne    1424488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269a0c>
     142445a:	48 89 d8             	mov    rax,rbx
     142445d:	48 83 c4 20          	add    rsp,0x20
     1424461:	5b                   	pop    rbx
     1424462:	c3                   	ret
     1424463:	48 89 c3             	mov    rbx,rax
     1424466:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     142446b:	e8 16 a0 67 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1424470:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1424477:	00 00 
     1424479:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     142447e:	75 08                	jne    1424488 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269a0c>
     1424480:	48 89 df             	mov    rdi,rbx
     1424483:	e8 48 b8 64 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1424488:	e8 23 b6 3c 00       	call   17efab0 <__stack_chk_fail@plt>
     142448d:	cc                   	int3
     142448e:	53                   	push   rbx
     142448f:	48 83 ec 20          	sub    rsp,0x20
     1424493:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     142449a:	00 00 
     142449c:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14244a1:	0f 57 c0             	xorps  xmm0,xmm0
     14244a4:	48 89 e3             	mov    rbx,rsp
     14244a7:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     14244aa:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     14244ae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14244b1:	48 89 de             	mov    rsi,rbx
     14244b4:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     14244ba:	8b 03                	mov    eax,DWORD PTR [rbx]
     14244bc:	48 85 c0             	test   rax,rax
     14244bf:	0f 95 c2             	setne  dl
     14244c2:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     14244c9:	00 00 
     14244cb:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
     14244d0:	75 0d                	jne    14244df <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269a63>
     14244d2:	48 69 c0 40 42 0f 00 	imul   rax,rax,0xf4240

### 0x142454d; FDE=(21120322, 21120344)
     14244fd:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     1424500:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     1424504:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1424507:	48 89 de             	mov    rsi,rbx
     142450a:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     1424510:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
     1424514:	48 85 c0             	test   rax,rax
     1424517:	0f 95 c2             	setne  dl
     142451a:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1424521:	00 00 
     1424523:	48 3b 4c 24 18       	cmp    rcx,QWORD PTR [rsp+0x18]
     1424528:	75 06                	jne    1424530 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269ab4>
     142452a:	48 83 c4 20          	add    rsp,0x20
     142452e:	5b                   	pop    rbx
     142452f:	c3                   	ret
     1424530:	e8 7b b5 3c 00       	call   17efab0 <__stack_chk_fail@plt>
     1424535:	cc                   	int3
     1424536:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     142453a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     142453d:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1424540:	ff e0                	jmp    rax
     1424542:	53                   	push   rbx
     1424543:	48 89 fb             	mov    rbx,rdi
     1424546:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
     142454a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     142454d:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1424553:	48 89 d8             	mov    rax,rbx
     1424556:	5b                   	pop    rbx
     1424557:	c3                   	ret
     1424558:	8a 47 78             	mov    al,BYTE PTR [rdi+0x78]
     142455b:	a8 01                	test   al,0x1
     142455d:	75 41                	jne    14245a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269b24>
     142455f:	53                   	push   rbx
     1424560:	48 89 fb             	mov    rbx,rdi
     1424563:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
     1424567:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     142456a:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     1424570:	48 89 c1             	mov    rcx,rax
     1424573:	48 87 4b 68          	xchg   QWORD PTR [rbx+0x68],rcx
     1424577:	48 87 43 70          	xchg   QWORD PTR [rbx+0x70],rax
     142457b:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     142457f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1424582:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1424585:	84 c0                	test   al,al
     1424587:	75 16                	jne    142459f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269b23>
     1424589:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     142458d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1424590:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
     1424596:	48 87 43 68          	xchg   QWORD PTR [rbx+0x68],rax
     142459a:	b0 01                	mov    al,0x1
     142459c:	86 43 78             	xchg   BYTE PTR [rbx+0x78],al
     142459f:	5b                   	pop    rbx
     14245a0:	c3                   	ret
     14245a1:	cc                   	int3
     14245a2:	41 57                	push   r15
     14245a4:	41 56                	push   r14
     14245a6:	41 54                	push   r12
     14245a8:	53                   	push   rbx
     14245a9:	48 83 ec 28          	sub    rsp,0x28
     14245ad:	49 89 f6             	mov    r14,rsi
     14245b0:	49 89 ff             	mov    r15,rdi
     14245b3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14245ba:	00 00 
     14245bc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14245c1:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
     14245c5:	49 8d 5c 24 04       	lea    rbx,[r12+0x4]
     14245ca:	48 89 df             	mov    rdi,rbx
     14245cd:	e8 1e 9b 3c 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     14245d2:	41 80 3c 24 00       	cmp    BYTE PTR [r12],0x0
     14245d7:	74 30                	je     1424609 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x269b8d>
     14245d9:	49 8b 3f             	mov    rdi,QWORD PTR [r15]

### 0x14787d0; FDE=(21464988, 21465072)
     147878f:	48 89 df             	mov    rdi,rbx
     1478792:	e8 0e 13 60 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1478797:	cc                   	int3
     1478798:	6a 22                	push   0x22
     147879a:	58                   	pop    rax
     147879b:	c3                   	ret
     147879c:	55                   	push   rbp
     147879d:	53                   	push   rbx
     147879e:	50                   	push   rax
     147879f:	48 89 f3             	mov    rbx,rsi
     14787a2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     14787a5:	6a 01                	push   0x1
     14787a7:	5d                   	pop    rbp
     14787a8:	48 89 f7             	mov    rdi,rsi
     14787ab:	89 ee                	mov    esi,ebp
     14787ad:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     14787b3:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14787b6:	48 89 df             	mov    rdi,rbx
     14787b9:	ff 90 a0 02 00 00    	call   QWORD PTR [rax+0x2a0]
     14787bf:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14787c2:	48 89 df             	mov    rdi,rbx
     14787c5:	89 ee                	mov    esi,ebp
     14787c7:	ff 50 40             	call   QWORD PTR [rax+0x40]
     14787ca:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14787cd:	48 89 df             	mov    rdi,rbx
     14787d0:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     14787d6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     14787d9:	48 89 df             	mov    rdi,rbx
     14787dc:	48 83 c4 08          	add    rsp,0x8
     14787e0:	5b                   	pop    rbx
     14787e1:	5d                   	pop    rbp
     14787e2:	ff a0 90 02 00 00    	jmp    QWORD PTR [rax+0x290]
     14787e8:	48 89 c7             	mov    rdi,rax
     14787eb:	e8 b5 12 60 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     14787f0:	55                   	push   rbp
     14787f1:	41 57                	push   r15
     14787f3:	41 56                	push   r14
     14787f5:	41 55                	push   r13
     14787f7:	41 54                	push   r12
     14787f9:	53                   	push   rbx
     14787fa:	48 81 ec 28 05 00 00 	sub    rsp,0x528
     1478801:	49 89 d6             	mov    r14,rdx
     1478804:	48 89 fb             	mov    rbx,rdi
     1478807:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     147880e:	00 00 
     1478810:	48 89 84 24 20 05 00 	mov    QWORD PTR [rsp+0x520],rax
     1478817:	00 
     1478818:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     147881b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
     1478820:	48 89 cf             	mov    rdi,rcx
     1478823:	ff 50 58             	call   QWORD PTR [rax+0x58]
     1478826:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     147882b:	83 38 0f             	cmp    DWORD PTR [rax],0xf
     147882e:	0f 85 03 02 00 00    	jne    1478a37 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdfbb>
     1478834:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1478839:	6a 0f                	push   0xf
     147883b:	5e                   	pop    rsi
     147883c:	e8 51 04 01 00       	call   1488c92 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ce216>
     1478841:	31 c0                	xor    eax,eax
     1478843:	88 44 24 58          	mov    BYTE PTR [rsp+0x58],al
     1478847:	88 84 24 78 04 00 00 	mov    BYTE PTR [rsp+0x478],al
     147884e:	41 38 46 48          	cmp    BYTE PTR [r14+0x48],al
     1478852:	0f 84 ab 01 00 00    	je     1478a03 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2bdf87>
     1478858:	48 8d bc 24 d0 04 00 	lea    rdi,[rsp+0x4d0]
     147885f:	00 
     1478860:	4c 89 f6             	mov    rsi,r14
     1478863:	e8 58 c8 d9 ff       	call   12150c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a644>
     1478868:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     147886c:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
     1478871:	80 bc 24 18 05 00 00 	cmp    BYTE PTR [rsp+0x518],0x0
     1478878:	00 

### 0x147c8cc; FDE=(21481624, 21481708)
     147c88b:	c6 86 80 02 00 00 01 	mov    BYTE PTR [rsi+0x280],0x1
     147c892:	c3                   	ret
     147c893:	cc                   	int3
     147c894:	6a 10                	push   0x10
     147c896:	58                   	pop    rax
     147c897:	c3                   	ret
     147c898:	55                   	push   rbp
     147c899:	53                   	push   rbx
     147c89a:	50                   	push   rax
     147c89b:	48 89 f3             	mov    rbx,rsi
     147c89e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     147c8a1:	6a 01                	push   0x1
     147c8a3:	5d                   	pop    rbp
     147c8a4:	48 89 f7             	mov    rdi,rsi
     147c8a7:	89 ee                	mov    esi,ebp
     147c8a9:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     147c8af:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     147c8b2:	48 89 df             	mov    rdi,rbx
     147c8b5:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
     147c8bb:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     147c8be:	48 89 df             	mov    rdi,rbx
     147c8c1:	89 ee                	mov    esi,ebp
     147c8c3:	ff 50 40             	call   QWORD PTR [rax+0x40]
     147c8c6:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     147c8c9:	48 89 df             	mov    rdi,rbx
     147c8cc:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     147c8d2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     147c8d5:	48 89 df             	mov    rdi,rbx
     147c8d8:	48 83 c4 08          	add    rsp,0x8
     147c8dc:	5b                   	pop    rbx
     147c8dd:	5d                   	pop    rbp
     147c8de:	ff a0 90 01 00 00    	jmp    QWORD PTR [rax+0x190]
     147c8e4:	48 89 c7             	mov    rdi,rax
     147c8e7:	e8 b9 d1 5f ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     147c8ec:	55                   	push   rbp
     147c8ed:	41 57                	push   r15
     147c8ef:	41 56                	push   r14
     147c8f1:	41 55                	push   r13
     147c8f3:	41 54                	push   r12
     147c8f5:	53                   	push   rbx
     147c8f6:	48 81 ec 98 03 00 00 	sub    rsp,0x398
     147c8fd:	48 89 cb             	mov    rbx,rcx
     147c900:	49 89 d7             	mov    r15,rdx
     147c903:	49 89 fe             	mov    r14,rdi
     147c906:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     147c90d:	00 00 
     147c90f:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
     147c916:	00 
     147c917:	48 8b 01             	mov    rax,QWORD PTR [rcx]
     147c91a:	48 89 cf             	mov    rdi,rcx
     147c91d:	ff 50 50             	call   QWORD PTR [rax+0x50]
     147c920:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     147c925:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     147c928:	48 89 df             	mov    rdi,rbx
     147c92b:	ff 50 48             	call   QWORD PTR [rax+0x48]
     147c92e:	49 89 c5             	mov    r13,rax
     147c931:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     147c934:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     147c939:	48 89 df             	mov    rdi,rbx
     147c93c:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     147c942:	8a 58 18             	mov    bl,BYTE PTR [rax+0x18]
     147c945:	40 8a 68 19          	mov    bpl,BYTE PTR [rax+0x19]
     147c949:	31 c0                	xor    eax,eax
     147c94b:	88 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],al
     147c952:	88 84 24 c0 00 00 00 	mov    BYTE PTR [rsp+0xc0],al
     147c959:	41 38 47 48          	cmp    BYTE PTR [r15+0x48],al
     147c95d:	0f 84 7f 03 00 00    	je     147cce2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c2266>
     147c963:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
     147c968:	48 8d bc 24 68 02 00 	lea    rdi,[rsp+0x268]
     147c96f:	00 
     147c970:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15

### 0x1486841; FDE=(21516721, 21523052)
Strings: FX curve overrides present but no fx_style set; overrides will be ignored
     14867d4:	66 0f 28 44 24 60    	movapd xmm0,XMMWORD PTR [rsp+0x60]
     14867da:	f2 0f 11 40 08       	movsd  QWORD PTR [rax+0x8],xmm0
     14867df:	48 83 c0 10          	add    rax,0x10
     14867e3:	48 89 01             	mov    QWORD PTR [rcx],rax
     14867e6:	48 8d 84 24 10 01 00 	lea    rax,[rsp+0x110]
     14867ed:	00 
     14867ee:	8b 70 10             	mov    esi,DWORD PTR [rax+0x10]
     14867f1:	85 f6                	test   esi,esi
     14867f3:	0f 84 bb 00 00 00    	je     14868b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cbe38>
     14867f9:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14867fc:	4c 89 ff             	mov    rdi,r15
     14867ff:	ff 90 18 01 00 00    	call   QWORD PTR [rax+0x118]
     1486805:	49 89 c6             	mov    r14,rax
     1486808:	45 85 f6             	test   r14d,r14d
     148680b:	0f 84 a3 00 00 00    	je     14868b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cbe38>
     1486811:	f3 48 0f 2a 43 08    	cvtsi2ss xmm0,QWORD PTR [rbx+0x8]
     1486817:	f3 0f 5e 05 2d 7e f0 	divss  xmm0,DWORD PTR [rip+0xfffffffffef07e2d]        # 38e64c <_ZTSSt12bad_any_cast@@Base-0x1b7c>
     148681e:	fe 
     148681f:	44 89 b3 00 04 00 00 	mov    DWORD PTR [rbx+0x400],r14d
     1486826:	c6 83 04 04 00 00 01 	mov    BYTE PTR [rbx+0x404],0x1
     148682d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1486830:	4c 89 ff             	mov    rdi,r15
     1486833:	44 89 f6             	mov    esi,r14d
     1486836:	f3 0f 11 44 24 40    	movss  DWORD PTR [rsp+0x40],xmm0
     148683c:	0f 28 4c 24 20       	movaps xmm1,XMMWORD PTR [rsp+0x20]
     1486841:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1486847:	48 89 83 08 04 00 00 	mov    QWORD PTR [rbx+0x408],rax
     148684e:	89 93 10 04 00 00    	mov    DWORD PTR [rbx+0x410],edx
     1486854:	48 c1 ea 20          	shr    rdx,0x20
     1486858:	88 93 14 04 00 00    	mov    BYTE PTR [rbx+0x414],dl
     148685e:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1486861:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1486868:	00 
     1486869:	4c 89 fe             	mov    rsi,r15
     148686c:	44 89 f2             	mov    edx,r14d
     148686f:	f3 0f 10 44 24 40    	movss  xmm0,DWORD PTR [rsp+0x40]
     1486875:	66 0f 28 4c 24 20    	movapd xmm1,XMMWORD PTR [rsp+0x20]
     148687b:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     1486881:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     1486888:	00 
     1486889:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
     1486890:	00 
     1486891:	74 14                	je     14868a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cbe2b>
     1486893:	48 8d bb f0 01 00 00 	lea    rdi,[rbx+0x1f0]
     148689a:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     14868a1:	00 
     14868a2:	e8 a9 9d a4 ff       	call   ed0650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97a66>
     14868a7:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     14868ae:	00 
     14868af:	e8 c2 61 78 ff       	call   c0ca76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x159a16>
     14868b4:	48 8d 84 24 10 01 00 	lea    rax,[rsp+0x110]
     14868bb:	00 
     14868bc:	8b 70 14             	mov    esi,DWORD PTR [rax+0x14]
     14868bf:	85 f6                	test   esi,esi
     14868c1:	74 4a                	je     148690d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cbe91>
     14868c3:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14868c6:	4c 89 ff             	mov    rdi,r15
     14868c9:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
     14868cf:	85 c0                	test   eax,eax
     14868d1:	74 3a                	je     148690d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2cbe91>
     14868d3:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
     14868d6:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     14868dd:	00 
     14868de:	4c 89 fe             	mov    rsi,r15
     14868e1:	89 c2                	mov    edx,eax
     14868e3:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
     14868e8:	ff 91 e8 00 00 00    	call   QWORD PTR [rcx+0xe8]
     14868ee:	48 8d bb d8 01 00 00 	lea    rdi,[rbx+0x1d8]
     14868f5:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     14868fc:	00 
     14868fd:	4c 89 f6             	mov    rsi,r14

### 0x14b4283; FDE=(21709400, 21709553)
     14b4235:	00 00 
     14b4237:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14b423c:	75 0d                	jne    14b424b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f97cf>
     14b423e:	48 89 d8             	mov    rax,rbx
     14b4241:	48 83 c4 20          	add    rsp,0x20
     14b4245:	5b                   	pop    rbx
     14b4246:	41 5e                	pop    r14
     14b4248:	41 5f                	pop    r15
     14b424a:	c3                   	ret
     14b424b:	e8 60 b8 33 00       	call   17efab0 <__stack_chk_fail@plt>
     14b4250:	48 89 c7             	mov    rdi,rax
     14b4253:	e8 4d 58 5c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     14b4258:	41 57                	push   r15
     14b425a:	41 56                	push   r14
     14b425c:	53                   	push   rbx
     14b425d:	48 83 ec 20          	sub    rsp,0x20
     14b4261:	49 89 ce             	mov    r14,rcx
     14b4264:	48 89 fb             	mov    rbx,rdi
     14b4267:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14b426e:	00 00 
     14b4270:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14b4275:	4c 8b 7e 20          	mov    r15,QWORD PTR [rsi+0x20]
     14b4279:	0f b6 72 18          	movzx  esi,BYTE PTR [rdx+0x18]
     14b427d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14b4280:	4c 89 ff             	mov    rdi,r15
     14b4283:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     14b4289:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14b428c:	4c 89 ff             	mov    rdi,r15
     14b428f:	ff 90 a0 01 00 00    	call   QWORD PTR [rax+0x1a0]
     14b4295:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     14b4298:	49 89 e6             	mov    r14,rsp
     14b429b:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
     14b42a0:	41 83 66 10 00       	and    DWORD PTR [r14+0x10],0x0
     14b42a5:	48 8d 05 8c 4a 3f 00 	lea    rax,[rip+0x3f4a8c]        # 18a8d38 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15c78>
     14b42ac:	49 89 06             	mov    QWORD PTR [r14],rax
     14b42af:	4c 89 f6             	mov    rsi,r14
     14b42b2:	e8 a5 d5 12 00       	call   15e185c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426de0>
     14b42b7:	4c 89 f7             	mov    rdi,r14
     14b42ba:	e8 61 57 28 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
     14b42bf:	48 89 df             	mov    rdi,rbx
     14b42c2:	e8 6a d4 12 00       	call   15e1731 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x426cb5>
     14b42c7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14b42ce:	00 00 
     14b42d0:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14b42d5:	75 0d                	jne    14b42e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f9868>
     14b42d7:	48 89 d8             	mov    rax,rbx
     14b42da:	48 83 c4 20          	add    rsp,0x20
     14b42de:	5b                   	pop    rbx
     14b42df:	41 5e                	pop    r14
     14b42e1:	41 5f                	pop    r15
     14b42e3:	c3                   	ret
     14b42e4:	e8 c7 b7 33 00       	call   17efab0 <__stack_chk_fail@plt>
     14b42e9:	48 89 c7             	mov    rdi,rax
     14b42ec:	e8 b4 57 5c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     14b42f1:	cc                   	int3
     14b42f2:	41 57                	push   r15
     14b42f4:	41 56                	push   r14
     14b42f6:	53                   	push   rbx
     14b42f7:	48 83 ec 20          	sub    rsp,0x20
     14b42fb:	49 89 ce             	mov    r14,rcx
     14b42fe:	48 89 fb             	mov    rbx,rdi
     14b4301:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14b4308:	00 00 
     14b430a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14b430f:	4c 8b 7e 20          	mov    r15,QWORD PTR [rsi+0x20]
     14b4313:	8b 72 18             	mov    esi,DWORD PTR [rdx+0x18]
     14b4316:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14b4319:	4c 89 ff             	mov    rdi,r15
     14b431c:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     14b4322:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14b4325:	4c 89 ff             	mov    rdi,r15

### 0x14b6a59; FDE=(21715258, 21719763)
     14b69fa:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     14b69fe:	41 83 65 18 00       	and    DWORD PTR [r13+0x18],0x0
     14b6a03:	49 83 c4 30          	add    r12,0x30
     14b6a07:	4c 89 e7             	mov    rdi,r12
     14b6a0a:	e8 27 4e 5c ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     14b6a0f:	4c 89 ef             	mov    rdi,r13
     14b6a12:	48 89 c6             	mov    rsi,rax
     14b6a15:	e8 38 8e 2c 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
     14b6a1a:	84 c0                	test   al,al
     14b6a1c:	74 59                	je     14b6a77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fbffb>
     14b6a1e:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     14b6a25:	00 
     14b6a26:	48 8d b4 24 c0 04 00 	lea    rsi,[rsp+0x4c0]
     14b6a2d:	00 
     14b6a2e:	e8 07 28 94 ff       	call   df923a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc62c0>
     14b6a33:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     14b6a38:	4c 89 fe             	mov    rsi,r15
     14b6a3b:	e8 f9 3e 5f ff       	call   aaa939 <JNI_OnUnload@@Base+0x32206>
     14b6a40:	49 8b 06             	mov    rax,QWORD PTR [r14]
     14b6a43:	48 8d 94 24 20 02 00 	lea    rdx,[rsp+0x220]
     14b6a4a:	00 
     14b6a4b:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
     14b6a50:	48 89 df             	mov    rdi,rbx
     14b6a53:	4c 89 f6             	mov    rsi,r14
     14b6a56:	4c 89 f9             	mov    rcx,r15
     14b6a59:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     14b6a5f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     14b6a63:	e8 1e 7a 5e ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14b6a68:	48 8d bc 24 28 02 00 	lea    rdi,[rsp+0x228]
     14b6a6f:	00 
     14b6a70:	e8 93 3f 5f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     14b6a75:	eb 06                	jmp    14b6a7d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc001>
     14b6a77:	0f 57 c0             	xorps  xmm0,xmm0
     14b6a7a:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     14b6a7d:	48 8d bc 24 c8 04 00 	lea    rdi,[rsp+0x4c8]
     14b6a84:	00 
     14b6a85:	e8 7e 3f 5f ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     14b6a8a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14b6a91:	00 00 
     14b6a93:	48 3b 84 24 f8 04 00 	cmp    rax,QWORD PTR [rsp+0x4f8]
     14b6a9a:	00 
     14b6a9b:	75 29                	jne    14b6ac6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc04a>
     14b6a9d:	48 89 d8             	mov    rax,rbx
     14b6aa0:	48 81 c4 00 05 00 00 	add    rsp,0x500
     14b6aa7:	5b                   	pop    rbx
     14b6aa8:	41 5c                	pop    r12
     14b6aaa:	41 5d                	pop    r13
     14b6aac:	41 5e                	pop    r14
     14b6aae:	41 5f                	pop    r15
     14b6ab0:	c3                   	ret
     14b6ab1:	0f 57 c0             	xorps  xmm0,xmm0
     14b6ab4:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     14b6ab7:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
     14b6abe:	00 
     14b6abf:	e8 5c 2f 28 00       	call   1739a20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xedb8c>
     14b6ac4:	eb c4                	jmp    14b6a8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc00e>
     14b6ac6:	e8 e5 8f 33 00       	call   17efab0 <__stack_chk_fail@plt>
     14b6acb:	48 89 c7             	mov    rdi,rax
     14b6ace:	e8 d2 2f 5c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     14b6ad3:	cc                   	int3
     14b6ad4:	41 56                	push   r14
     14b6ad6:	53                   	push   rbx
     14b6ad7:	50                   	push   rax
     14b6ad8:	0f 57 c0             	xorps  xmm0,xmm0
     14b6adb:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
     14b6adf:	48 8d 05 82 2c 3f 00 	lea    rax,[rip+0x3f2c82]        # 18a9768 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x166a8>
     14b6ae6:	48 89 07             	mov    QWORD PTR [rdi],rax
     14b6ae9:	c6 47 18 00          	mov    BYTE PTR [rdi+0x18],0x0
     14b6aed:	48 39 f7             	cmp    rdi,rsi
     14b6af0:	74 4a                	je     14b6b3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2fc0c0>
     14b6af2:	48 89 f3             	mov    rbx,rsi

### 0x14dc331; FDE=(21872584, 21874393)
Strings: terminated_ad_track_missing_position_or_duration_info | 
ended | terminated_invalid_ad_duration | terminated_position_exceeds_duration | terminated_position_is_less_than_playback_end_threshold | terminated_unknown
     14dc2d7:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     14dc2dc:	48 83 ec 08          	sub    rsp,0x8
     14dc2e0:	4c 8d 15 59 c7 f5 fe 	lea    r10,[rip+0xfffffffffef5c759]        # 438a40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e48f>
     14dc2e7:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     14dc2ee:	00 
     14dc2ef:	6a 01                	push   0x1
     14dc2f1:	59                   	pop    rcx
     14dc2f2:	48 89 df             	mov    rdi,rbx
     14dc2f5:	4c 89 f2             	mov    rdx,r14
     14dc2f8:	4d 89 e0             	mov    r8,r12
     14dc2fb:	41 89 c9             	mov    r9d,ecx
     14dc2fe:	50                   	push   rax
     14dc2ff:	55                   	push   rbp
     14dc300:	41 52                	push   r10
     14dc302:	e8 83 f7 ff ff       	call   14dba8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32100e>
     14dc307:	48 83 c4 20          	add    rsp,0x20
     14dc30b:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     14dc312:	00 
     14dc313:	e8 78 1b 31 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14dc318:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
     14dc31f:	00 
     14dc320:	e8 61 21 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14dc325:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     14dc32a:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     14dc32e:	4c 89 ef             	mov    rdi,r13
     14dc331:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     14dc337:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     14dc33c:	80 39 00             	cmp    BYTE PTR [rcx],0x0
     14dc33f:	0f 95 c1             	setne  cl
     14dc342:	20 c8                	and    al,cl
     14dc344:	3c 01                	cmp    al,0x1
     14dc346:	75 66                	jne    14dc3ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x321932>
     14dc348:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
     14dc34d:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     14dc352:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     14dc357:	48 85 c0             	test   rax,rax
     14dc35a:	74 05                	je     14dc361 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3218e5>
     14dc35c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     14dc361:	48 8d 44 24 78       	lea    rax,[rsp+0x78]
     14dc366:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     14dc36a:	0f 57 c0             	xorps  xmm0,xmm0
     14dc36d:	48 8d 84 24 c0 00 00 	lea    rax,[rsp+0xc0]
     14dc374:	00 
     14dc375:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     14dc378:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     14dc37d:	48 83 ec 08          	sub    rsp,0x8
     14dc381:	4c 8d 15 38 cd f5 fe 	lea    r10,[rip+0xfffffffffef5cd38]        # 4390c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb0f>
     14dc388:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     14dc38d:	6a 01                	push   0x1
     14dc38f:	59                   	pop    rcx
     14dc390:	48 89 df             	mov    rdi,rbx
     14dc393:	4c 89 f2             	mov    rdx,r14
     14dc396:	4d 89 e0             	mov    r8,r12
     14dc399:	41 89 c9             	mov    r9d,ecx
     14dc39c:	50                   	push   rax
     14dc39d:	55                   	push   rbp
     14dc39e:	41 52                	push   r10
     14dc3a0:	e8 e5 f6 ff ff       	call   14dba8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32100e>
     14dc3a5:	48 83 c4 20          	add    rsp,0x20
     14dc3a9:	e9 45 02 00 00       	jmp    14dc5f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x321b77>
     14dc3ae:	4d 85 e4             	test   r12,r12
     14dc3b1:	0f 8e 92 00 00 00    	jle    14dc449 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3219cd>
     14dc3b7:	f3 49 0f 2a c4       	cvtsi2ss xmm0,r12
     14dc3bc:	f3 49 0f 2a ce       	cvtsi2ss xmm1,r14
     14dc3c1:	f3 0f 59 05 1b 24 eb 	mulss  xmm0,DWORD PTR [rip+0xfffffffffeeb241b]        # 38e7e4 <_ZTSSt12bad_any_cast@@Base-0x19e4>
     14dc3c8:	fe 
     14dc3c9:	0f 2e c8             	ucomiss xmm1,xmm0
     14dc3cc:	0f 82 e1 00 00 00    	jb     14dc4b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x321a37>
     14dc3d2:	49 8d 84 24 e8 03 00 	lea    rax,[r12+0x3e8]
     14dc3d9:	00 
     14dc3da:	49 39 c6             	cmp    r14,rax

### 0x14ee567; FDE=(21947620, 21948419)
Strings: terminated_ad_track_missing_position_or_duration_info | 
ended | terminated_invalid_ad_duration | terminated_position_exceeds_duration | terminated_position_is_less_than_playback_end_threshold | terminated_unknown
     14ee501:	49 89 ff             	mov    r15,rdi
     14ee504:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee50b:	00 00 
     14ee50d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     14ee512:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14ee516:	bf 60 01 00 00       	mov    edi,0x160
     14ee51b:	48 03 38             	add    rdi,QWORD PTR [rax]
     14ee51e:	e8 85 a5 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14ee523:	41 80 7f 50 00       	cmp    BYTE PTR [r15+0x50],0x0
     14ee528:	0f 84 dd 00 00 00    	je     14ee60b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b8f>
     14ee52e:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     14ee532:	48 85 ff             	test   rdi,rdi
     14ee535:	0f 84 d0 00 00 00    	je     14ee60b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b8f>
     14ee53b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ee53e:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14ee541:	84 c0                	test   al,al
     14ee543:	0f 84 c2 00 00 00    	je     14ee60b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b8f>
     14ee549:	48 8d 43 58          	lea    rax,[rbx+0x58]
     14ee54d:	41 80 7c 24 08 00    	cmp    BYTE PTR [r12+0x8],0x0
     14ee553:	74 65                	je     14ee5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b3e>
     14ee555:	41 80 7e 08 00       	cmp    BYTE PTR [r14+0x8],0x0
     14ee55a:	74 5e                	je     14ee5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b3e>
     14ee55c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     14ee561:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14ee564:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ee567:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     14ee56d:	83 fd 04             	cmp    ebp,0x4
     14ee570:	0f 85 db 00 00 00    	jne    14ee651 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333bd5>
     14ee576:	84 c0                	test   al,al
     14ee578:	0f 84 d3 00 00 00    	je     14ee651 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333bd5>
     14ee57e:	48 8d 43 68          	lea    rax,[rbx+0x68]
     14ee582:	4c 8d 54 24 10       	lea    r10,[rsp+0x10]
     14ee587:	49 83 62 10 00       	and    QWORD PTR [r10+0x10],0x0
     14ee58c:	0f 57 c0             	xorps  xmm0,xmm0
     14ee58f:	41 0f 29 02          	movaps XMMWORD PTR [r10],xmm0
     14ee593:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     14ee597:	45 8b 44 24 08       	mov    r8d,DWORD PTR [r12+0x8]
     14ee59c:	48 8d 35 1d ab f4 fe 	lea    rsi,[rip+0xfffffffffef4ab1d]        # 4390c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb0f>
     14ee5a3:	4c 89 ff             	mov    rdi,r15
     14ee5a6:	48 8b 54 24 08       	mov    rdx,QWORD PTR [rsp+0x8]
     14ee5ab:	4d 89 f1             	mov    r9,r14
     14ee5ae:	41 52                	push   r10
     14ee5b0:	50                   	push   rax
     14ee5b1:	e8 36 08 00 00       	call   14eedec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334370>
     14ee5b6:	58                   	pop    rax
     14ee5b7:	59                   	pop    rcx
     14ee5b8:	eb 47                	jmp    14ee601 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333b85>
     14ee5ba:	48 8d 4b 68          	lea    rcx,[rbx+0x68]
     14ee5be:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     14ee5c3:	48 8d 35 ac 71 e3 fe 	lea    rsi,[rip+0xfffffffffee371ac]        # 325776 <_ZTSSt12bad_any_cast@@Base-0x6aa52>
     14ee5ca:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14ee5cf:	48 89 c5             	mov    rbp,rax
     14ee5d2:	e8 a7 b4 58 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     14ee5d7:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     14ee5db:	45 8b 44 24 08       	mov    r8d,DWORD PTR [r12+0x8]
     14ee5e0:	48 8d 35 f1 aa f4 fe 	lea    rsi,[rip+0xfffffffffef4aaf1]        # 4390d8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5eb27>
     14ee5e7:	4c 89 ff             	mov    rdi,r15
     14ee5ea:	48 89 ea             	mov    rdx,rbp
     14ee5ed:	4d 89 f1             	mov    r9,r14
     14ee5f0:	48 8d 44 24 10       	lea    rax,[rsp+0x10]
     14ee5f5:	50                   	push   rax
     14ee5f6:	ff 74 24 10          	push   QWORD PTR [rsp+0x10]
     14ee5fa:	e8 ed 07 00 00       	call   14eedec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334370>
     14ee5ff:	58                   	pop    rax
     14ee600:	59                   	pop    rcx
     14ee601:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14ee606:	e8 85 f8 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ee60b:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
     14ee60f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ee612:	48 89 de             	mov    rsi,rbx
     14ee615:	4c 89 ea             	mov    rdx,r13

### 0x154a5a8; FDE=(22323203, 22326403)
Strings: Spotify/ |  ( | ;  | ) | https://apresolve.spotify.com/ | site | time | type | accesspoint | spclient | dealer-g2 | User-Agent | thread constructor failed
     154a54e:	6a 40                	push   0x40
     154a550:	5f                   	pop    rdi
     154a551:	e8 aa 39 2a 00       	call   17edf00 <_Znwm@plt>
     154a556:	48 89 c3             	mov    rbx,rax
     154a559:	48 8d 05 b0 4d 33 00 	lea    rax,[rip+0x334db0]        # 187f310 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3b9f8>
     154a560:	48 89 03             	mov    QWORD PTR [rbx],rax
     154a563:	48 89 df             	mov    rdi,rbx
     154a566:	48 83 c7 10          	add    rdi,0x10
     154a56a:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
     154a571:	00 
     154a572:	4c 89 f6             	mov    rsi,r14
     154a575:	e8 0a 07 00 00       	call   154ac84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x390208>
     154a57a:	4c 8d bc 24 a0 01 00 	lea    r15,[rsp+0x1a0]
     154a581:	00 
     154a582:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
     154a586:	4c 89 f7             	mov    rdi,r14
     154a589:	e8 dc f9 52 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     154a58e:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     154a592:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     154a595:	4c 89 fe             	mov    rsi,r15
     154a598:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     154a59e:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     154a5a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     154a5a5:	6a 01                	push   0x1
     154a5a7:	5e                   	pop    rsi
     154a5a8:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     154a5ae:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
     154a5b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     154a5b5:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
     154a5bc:	00 
     154a5bd:	48 89 df             	mov    rdi,rbx
     154a5c0:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
     154a5c6:	4c 89 ff             	mov    rdi,r15
     154a5c9:	e8 9c f9 52 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     154a5ce:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     154a5d5:	00 
     154a5d6:	e8 8f f9 52 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     154a5db:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     154a5e2:	00 
     154a5e3:	e8 82 f9 52 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     154a5e8:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     154a5ef:	00 
     154a5f0:	e8 75 f9 52 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     154a5f5:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     154a5fa:	e8 91 38 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     154a5ff:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     154a604:	e8 87 38 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     154a609:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     154a60e:	e8 7d 38 2a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     154a613:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     154a616:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     154a619:	ff 50 10             	call   QWORD PTR [rax+0x10]
     154a61c:	6a 48                	push   0x48
     154a61e:	5f                   	pop    rdi
     154a61f:	e8 dc 38 2a 00       	call   17edf00 <_Znwm@plt>
     154a624:	49 89 c6             	mov    r14,rax
     154a627:	0f 57 c0             	xorps  xmm0,xmm0
     154a62a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     154a62e:	48 8d 05 33 2e 2b 00 	lea    rax,[rip+0x2b2e33]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
     154a635:	49 89 06             	mov    QWORD PTR [r14],rax
     154a638:	48 8d 05 29 11 34 00 	lea    rax,[rip+0x341129]        # 188b768 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4440>
     154a63f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     154a643:	4d 8d 7e 20          	lea    r15,[r14+0x20]
     154a647:	4c 89 ff             	mov    rdi,r15
     154a64a:	e8 7d 71 56 ff       	call   ab17cc <JNI_OnUnload@@Base+0x39099>
     154a64f:	4d 89 7e 30          	mov    QWORD PTR [r14+0x30],r15
     154a653:	41 c6 46 38 01       	mov    BYTE PTR [r14+0x38],0x1
     154a658:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
     154a65c:	f0 48 ff 80 d0 00 00 	lock inc QWORD PTR [rax+0xd0]
     154a663:	00 
     154a664:	6a 08                	push   0x8

### 0x156a186; FDE=(22453350, 22455127)
     156a124:	48 83 c7 08          	add    rdi,0x8
     156a128:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
     156a12f:	00 
     156a130:	e8 39 f7 60 ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     156a135:	4c 8d bc 24 10 01 00 	lea    r15,[rsp+0x110]
     156a13c:	00 
     156a13d:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
     156a141:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     156a148:	00 
     156a149:	e8 d8 69 53 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     156a14e:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     156a155:	00 
     156a156:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     156a159:	4c 89 fe             	mov    rsi,r15
     156a15c:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     156a162:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     156a169:	00 
     156a16a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     156a16d:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     156a172:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     156a178:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     156a17f:	00 
     156a180:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     156a183:	6a 01                	push   0x1
     156a185:	5e                   	pop    rsi
     156a186:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     156a18c:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
     156a193:	00 
     156a194:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     156a197:	48 8d 9c 24 b8 00 00 	lea    rbx,[rsp+0xb8]
     156a19e:	00 
     156a19f:	48 89 df             	mov    rdi,rbx
     156a1a2:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
     156a1a8:	4c 89 ef             	mov    rdi,r13
     156a1ab:	48 89 de             	mov    rsi,rbx
     156a1ae:	e8 69 f6 54 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     156a1b3:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     156a1b7:	e8 ca 42 53 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     156a1bc:	4c 89 ff             	mov    rdi,r15
     156a1bf:	e8 a6 fd 50 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     156a1c4:	4c 89 e7             	mov    rdi,r12
     156a1c7:	e8 5a 69 53 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     156a1cc:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     156a1d3:	00 
     156a1d4:	e8 91 fd 50 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     156a1d9:	4c 89 f7             	mov    rdi,r14
     156a1dc:	e8 45 69 53 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     156a1e1:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     156a1e6:	e8 a5 3c 28 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156a1eb:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     156a1f2:	00 
     156a1f3:	e8 f2 10 59 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     156a1f8:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     156a1fd:	e8 8e 3c 28 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156a202:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     156a209:	00 
     156a20a:	e8 81 3c 28 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     156a20f:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
     156a216:	00 
     156a217:	e8 6a 42 53 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     156a21c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     156a220:	48 85 ff             	test   rdi,rdi
     156a223:	74 06                	je     156a22b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af7af>
     156a225:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     156a228:	ff 50 10             	call   QWORD PTR [rax+0x10]
     156a22b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     156a232:	00 00 
     156a234:	48 3b 84 24 70 01 00 	cmp    rax,QWORD PTR [rsp+0x170]
     156a23b:	00 
     156a23c:	0f 85 10 01 00 00    	jne    156a352 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af8d6>
     156a242:	48 81 c4 78 01 00 00 	add    rsp,0x178

### 0x158d3d5; FDE=(22598546, 22598696)
     158d38a:	41 5f                	pop    r15
     158d38c:	e9 81 0a 00 00       	jmp    158de12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d3396>
     158d391:	cc                   	int3
     158d392:	41 57                	push   r15
     158d394:	41 56                	push   r14
     158d396:	41 55                	push   r13
     158d398:	41 54                	push   r12
     158d39a:	53                   	push   rbx
     158d39b:	48 83 ec 30          	sub    rsp,0x30
     158d39f:	89 d3                	mov    ebx,edx
     158d3a1:	49 89 f7             	mov    r15,rsi
     158d3a4:	49 89 fe             	mov    r14,rdi
     158d3a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     158d3ae:	00 00 
     158d3b0:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     158d3b5:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     158d3b8:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     158d3bc:	e8 29 0a 00 00       	call   158ddea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d336e>
     158d3c1:	48 85 c0             	test   rax,rax
     158d3c4:	74 3f                	je     158d405 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d2989>
     158d3c6:	49 89 c4             	mov    r12,rax
     158d3c9:	49 8b 37             	mov    rsi,QWORD PTR [r15]
     158d3cc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     158d3cf:	49 89 e5             	mov    r13,rsp
     158d3d2:	4c 89 ef             	mov    rdi,r13
     158d3d5:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     158d3db:	4c 89 e7             	mov    rdi,r12
     158d3de:	48 81 c7 c0 00 00 00 	add    rdi,0xc0
     158d3e5:	4c 89 ee             	mov    rsi,r13
     158d3e8:	e8 bf 4c 72 ff       	call   cb20ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ff04c>
     158d3ed:	4c 89 ef             	mov    rdi,r13
     158d3f0:	e8 f5 de 56 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     158d3f5:	49 8b 37             	mov    rsi,QWORD PTR [r15]
     158d3f8:	4c 89 f7             	mov    rdi,r14
     158d3fb:	4c 89 e2             	mov    rdx,r12
     158d3fe:	89 d9                	mov    ecx,ebx
     158d400:	e8 0d 0a 00 00       	call   158de12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d3396>
     158d405:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     158d40c:	00 00 
     158d40e:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     158d413:	75 0e                	jne    158d423 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d29a7>
     158d415:	48 83 c4 30          	add    rsp,0x30
     158d419:	5b                   	pop    rbx
     158d41a:	41 5c                	pop    r12
     158d41c:	41 5d                	pop    r13
     158d41e:	41 5e                	pop    r14
     158d420:	41 5f                	pop    r15
     158d422:	c3                   	ret
     158d423:	e8 88 26 26 00       	call   17efab0 <__stack_chk_fail@plt>
     158d428:	41 57                	push   r15
     158d42a:	41 56                	push   r14
     158d42c:	41 55                	push   r13
     158d42e:	41 54                	push   r12
     158d430:	53                   	push   rbx
     158d431:	48 83 ec 30          	sub    rsp,0x30
     158d435:	89 d3                	mov    ebx,edx
     158d437:	49 89 f7             	mov    r15,rsi
     158d43a:	49 89 fe             	mov    r14,rdi
     158d43d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     158d444:	00 00 
     158d446:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     158d44b:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
     158d44e:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     158d452:	e8 93 09 00 00       	call   158ddea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d336e>
     158d457:	48 85 c0             	test   rax,rax
     158d45a:	74 3f                	je     158d49b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d2a1f>
     158d45c:	49 89 c4             	mov    r12,rax
     158d45f:	49 8b 07             	mov    rax,QWORD PTR [r15]
     158d462:	48 8b 70 70          	mov    rsi,QWORD PTR [rax+0x70]
     158d466:	49 89 e5             	mov    r13,rsp
     158d469:	4c 89 ef             	mov    rdi,r13

### 0x158dce0; FDE=(22600668, 22601154)
     158dc7e:	e8 d1 06 01 00       	call   159e354 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e38d8>
     158dc83:	49 8d be e8 00 00 00 	lea    rdi,[r14+0xe8]
     158dc8a:	4c 89 e6             	mov    rsi,r12
     158dc8d:	e8 1a 44 72 ff       	call   cb20ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ff04c>
     158dc92:	4c 89 e7             	mov    rdi,r12
     158dc95:	e8 50 d6 56 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     158dc9a:	be b8 00 00 00       	mov    esi,0xb8
     158dc9f:	48 03 73 70          	add    rsi,QWORD PTR [rbx+0x70]
     158dca3:	49 8d 7e 70          	lea    rdi,[r14+0x70]
     158dca7:	e8 d4 03 26 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
     158dcac:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     158dcaf:	48 89 df             	mov    rdi,rbx
     158dcb2:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     158dcb8:	4d 01 f7             	add    r15,r14
     158dcbb:	4c 89 ff             	mov    rdi,r15
     158dcbe:	48 85 c0             	test   rax,rax
     158dcc1:	74 0a                	je     158dccd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d3251>
     158dcc3:	48 89 c6             	mov    rsi,rax
     158dcc6:	e8 6f 46 57 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     158dccb:	eb 05                	jmp    158dcd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d3256>
     158dccd:	e8 5a 16 54 ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
     158dcd2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     158dcd5:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     158dcda:	4c 89 ff             	mov    rdi,r15
     158dcdd:	48 89 de             	mov    rsi,rbx
     158dce0:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     158dce6:	49 8d be c0 00 00 00 	lea    rdi,[r14+0xc0]
     158dced:	4c 89 fe             	mov    rsi,r15
     158dcf0:	e8 b7 43 72 ff       	call   cb20ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ff04c>
     158dcf5:	4c 89 ff             	mov    rdi,r15
     158dcf8:	e8 ed d5 56 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     158dcfd:	48 8b 73 70          	mov    rsi,QWORD PTR [rbx+0x70]
     158dd01:	49 89 e7             	mov    r15,rsp
     158dd04:	4c 89 ff             	mov    rdi,r15
     158dd07:	e8 c6 72 01 00       	call   15a4fd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ea556>
     158dd0c:	49 8d be 10 01 00 00 	lea    rdi,[r14+0x110]
     158dd13:	4c 89 fe             	mov    rsi,r15
     158dd16:	e8 c1 95 55 ff       	call   ae72dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3427c>
     158dd1b:	4c 89 ff             	mov    rdi,r15
     158dd1e:	e8 bd a2 55 ff       	call   ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
     158dd23:	48 8b 43 70          	mov    rax,QWORD PTR [rbx+0x70]
     158dd27:	f6 40 10 80          	test   BYTE PTR [rax+0x10],0x80
     158dd2b:	75 0c                	jne    158dd39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d32bd>
     158dd2d:	4c 89 f7             	mov    rdi,r14
     158dd30:	48 81 c7 d8 01 00 00 	add    rdi,0x1d8
     158dd37:	eb 1e                	jmp    158dd57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d32db>
     158dd39:	48 8b b0 80 00 00 00 	mov    rsi,QWORD PTR [rax+0x80]
     158dd40:	4c 89 f7             	mov    rdi,r14
     158dd43:	48 81 c7 d8 01 00 00 	add    rdi,0x1d8
     158dd4a:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
     158dd4e:	74 07                	je     158dd57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d32db>
     158dd50:	e8 e5 45 57 ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
     158dd55:	eb 05                	jmp    158dd5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d32e0>
     158dd57:	e8 d0 15 54 ff       	call   acf32c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c2cc>
     158dd5c:	48 8b 43 70          	mov    rax,QWORD PTR [rbx+0x70]
     158dd60:	8b 80 9c 00 00 00    	mov    eax,DWORD PTR [rax+0x9c]
     158dd66:	41 89 86 f8 01 00 00 	mov    DWORD PTR [r14+0x1f8],eax
     158dd6d:	48 8b 43 70          	mov    rax,QWORD PTR [rbx+0x70]
     158dd71:	8a 80 99 00 00 00    	mov    al,BYTE PTR [rax+0x99]
     158dd77:	41 88 86 fc 01 00 00 	mov    BYTE PTR [r14+0x1fc],al
     158dd7e:	48 8b 43 70          	mov    rax,QWORD PTR [rbx+0x70]
     158dd82:	8a 80 9b 00 00 00    	mov    al,BYTE PTR [rax+0x9b]
     158dd88:	41 88 86 fd 01 00 00 	mov    BYTE PTR [r14+0x1fd],al
     158dd8f:	48 8b 43 70          	mov    rax,QWORD PTR [rbx+0x70]
     158dd93:	48 8b 80 08 02 00 00 	mov    rax,QWORD PTR [rax+0x208]
     158dd9a:	49 89 86 00 02 00 00 	mov    QWORD PTR [r14+0x200],rax
     158dda1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     158dda8:	00 00 
     158ddaa:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
     158ddaf:	75 0c                	jne    158ddbd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d3341>
     158ddb1:	48 83 c4 58          	add    rsp,0x58

### 0x1593cf6; FDE=(22625294, 22626316)
     1593c8e:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     1593c93:	e8 a8 a2 25 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1593c98:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1593c9f:	00 
     1593ca0:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
     1593ca5:	e8 54 5d 05 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
     1593caa:	41 8b 86 88 00 00 00 	mov    eax,DWORD PTR [r14+0x88]
     1593cb1:	48 83 f8 02          	cmp    rax,0x2
     1593cb5:	77 10                	ja     1593cc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d924b>
     1593cb7:	48 8d 0d d2 61 ea fe 	lea    rcx,[rip+0xfffffffffeea61d2]        # 439e90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5f8df>
     1593cbe:	48 63 34 81          	movsxd rsi,DWORD PTR [rcx+rax*4]
     1593cc2:	48 01 ce             	add    rsi,rcx
     1593cc5:	eb 07                	jmp    1593cce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d9252>
     1593cc7:	48 8d 35 ae e2 eb fe 	lea    rsi,[rip+0xfffffffffeebe2ae]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1593cce:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
     1593cd3:	e8 a6 5d 4e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     1593cd8:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
     1593cdf:	00 
     1593ce0:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     1593ce5:	4c 89 ff             	mov    rdi,r15
     1593ce8:	e8 3d 5c 05 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
     1593ced:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     1593cf0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1593cf3:	6a 01                	push   0x1
     1593cf5:	5e                   	pop    rsi
     1593cf6:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1593cfc:	49 8d b6 b8 00 00 00 	lea    rsi,[r14+0xb8]
     1593d03:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     1593d08:	e8 33 a2 25 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1593d0d:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
     1593d14:	00 
     1593d15:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
     1593d1a:	4c 89 ff             	mov    rdi,r15
     1593d1d:	e8 38 5e 05 00       	call   15e9b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f0de>
     1593d22:	49 8b 86 90 00 00 00 	mov    rax,QWORD PTR [r14+0x90]
     1593d29:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
     1593d2d:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     1593d30:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1593d33:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     1593d39:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
     1593d3e:	4d 89 77 f8          	mov    QWORD PTR [r15-0x8],r14
     1593d42:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
     1593d49:	00 
     1593d4a:	4c 89 ff             	mov    rdi,r15
     1593d4d:	e8 5a 54 5e ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     1593d52:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
     1593d59:	00 
     1593d5a:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1593d5f:	e8 0a 5b 5e ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     1593d64:	48 83 a4 24 20 01 00 	and    QWORD PTR [rsp+0x120],0x0
     1593d6b:	00 00 
     1593d6d:	6a 20                	push   0x20
     1593d6f:	5f                   	pop    rdi
     1593d70:	e8 8b a1 25 00       	call   17edf00 <_Znwm@plt>
     1593d75:	49 89 c4             	mov    r12,rax
     1593d78:	48 8d 05 f1 ec 2e 00 	lea    rax,[rip+0x2eecf1]        # 1882a70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3f158>
     1593d7f:	49 89 04 24          	mov    QWORD PTR [r12],rax
     1593d83:	4c 89 e7             	mov    rdi,r12
     1593d86:	48 83 c7 08          	add    rdi,0x8
     1593d8a:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
     1593d91:	00 
     1593d92:	e8 d7 5a 5e ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     1593d97:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
     1593d9e:	00 
     1593d9f:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
     1593da3:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1593daa:	00 
     1593dab:	e8 76 cd 50 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     1593db0:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     1593db7:	00 
     1593db8:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x159b959; FDE=(22656594, 22658010)
Strings: playlistextender/ft/v2/extend-playlist | POST
     159b8f9:	49 89 07             	mov    QWORD PTR [r15],rax
     159b8fc:	4c 89 ff             	mov    rdi,r15
     159b8ff:	48 83 c7 10          	add    rdi,0x10
     159b903:	48 8d b4 24 20 02 00 	lea    rsi,[rsp+0x220]
     159b90a:	00 
     159b90b:	e8 2e 07 00 00       	call   159c03e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e15c2>
     159b910:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     159b917:	00 
     159b918:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     159b91c:	4c 8d ac 24 60 01 00 	lea    r13,[rsp+0x160]
     159b923:	00 
     159b924:	4d 89 7d 20          	mov    QWORD PTR [r13+0x20],r15
     159b928:	e8 9d e9 4d ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     159b92d:	4c 8d bc 24 20 02 00 	lea    r15,[rsp+0x220]
     159b934:	00 
     159b935:	4c 89 ff             	mov    rdi,r15
     159b938:	e8 5f 07 00 00       	call   159c09c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e1620>
     159b93d:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     159b942:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     159b945:	4c 89 ee             	mov    rsi,r13
     159b948:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     159b94e:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     159b953:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     159b956:	6a 01                	push   0x1
     159b958:	5e                   	pop    rsi
     159b959:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     159b95f:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     159b963:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     159b968:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     159b96b:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     159b971:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
     159b976:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     159b979:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
     159b980:	00 
     159b981:	4c 89 e7             	mov    rdi,r12
     159b984:	ff 90 30 01 00 00    	call   QWORD PTR [rax+0x130]
     159b98a:	4c 89 ef             	mov    rdi,r13
     159b98d:	e8 d8 e5 4d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     159b992:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     159b999:	00 
     159b99a:	e8 fd 06 00 00       	call   159c09c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e1620>
     159b99f:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     159b9a6:	00 
     159b9a7:	e8 be e5 4d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     159b9ac:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     159b9b3:	00 
     159b9b4:	e8 65 06 00 00       	call   159c01e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e15a2>
     159b9b9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     159b9be:	e8 cd 24 25 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     159b9c3:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     159b9c8:	e8 c3 24 25 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     159b9cd:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     159b9d2:	e8 b9 24 25 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     159b9d7:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
     159b9dc:	e8 a5 2a 50 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     159b9e1:	41 0f 28 04 24       	movaps xmm0,XMMWORD PTR [r12]
     159b9e6:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
     159b9eb:	48 85 c0             	test   rax,rax
     159b9ee:	74 05                	je     159b9f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e0f79>
     159b9f0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     159b9f5:	48 8d 05 6c d9 2d 00 	lea    rax,[rip+0x2dd96c]        # 1879368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35a50>
     159b9fc:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
     159ba03:	00 
     159ba04:	0f 11 84 24 28 02 00 	movups XMMWORD PTR [rsp+0x228],xmm0
     159ba0b:	00 
     159ba0c:	4c 89 bc 24 40 02 00 	mov    QWORD PTR [rsp+0x240],r15
     159ba13:	00 
     159ba14:	4c 89 ff             	mov    rdi,r15
     159ba17:	4c 89 f6             	mov    rsi,r14
     159ba1a:	e8 cb 81 56 ff       	call   b03bea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x50b8a>
     159ba1f:	4c 89 ff             	mov    rdi,r15

### 0x15a39d6; FDE=(22690212, 22690535)
     15a3981:	e8 00 ab 4f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     15a3986:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15a398d:	00 00 
     15a398f:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
     15a3994:	75 08                	jne    15a399e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8f22>
     15a3996:	48 89 df             	mov    rdi,rbx
     15a3999:	e8 32 c3 4c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     15a399e:	e8 0d c1 24 00       	call   17efab0 <__stack_chk_fail@plt>
     15a39a3:	cc                   	int3
     15a39a4:	55                   	push   rbp
     15a39a5:	41 57                	push   r15
     15a39a7:	41 56                	push   r14
     15a39a9:	41 54                	push   r12
     15a39ab:	53                   	push   rbx
     15a39ac:	48 83 ec 40          	sub    rsp,0x40
     15a39b0:	49 89 d7             	mov    r15,rdx
     15a39b3:	48 89 fb             	mov    rbx,rdi
     15a39b6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15a39bd:	00 00 
     15a39bf:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     15a39c4:	89 74 24 0c          	mov    DWORD PTR [rsp+0xc],esi
     15a39c8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15a39cb:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
     15a39d0:	4c 89 f7             	mov    rdi,r14
     15a39d3:	48 89 de             	mov    rsi,rbx
     15a39d6:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     15a39dc:	4c 89 f7             	mov    rdi,r14
     15a39df:	4c 89 fe             	mov    rsi,r15
     15a39e2:	e8 c8 ec 87 ff       	call   e226af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef735>
     15a39e7:	89 c5                	mov    ebp,eax
     15a39e9:	4c 89 f7             	mov    rdi,r14
     15a39ec:	e8 f9 78 55 ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
     15a39f1:	40 84 ed             	test   bpl,bpl
     15a39f4:	0f 85 a6 00 00 00    	jne    15a3aa0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e9024>
     15a39fa:	4c 8b 73 70          	mov    r14,QWORD PTR [rbx+0x70]
     15a39fe:	49 83 c6 18          	add    r14,0x18
     15a3a02:	4c 89 f7             	mov    rdi,r14
     15a3a05:	e8 ae 60 70 ff       	call   ca9ab8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f6a58>
     15a3a0a:	4d 8b 67 10          	mov    r12,QWORD PTR [r15+0x10]
     15a3a0e:	4d 85 e4             	test   r12,r12
     15a3a11:	74 5d                	je     15a3a70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8ff4>
     15a3a13:	4c 89 f7             	mov    rdi,r14
     15a3a16:	e8 f7 30 fc ff       	call   1566b12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ac096>
     15a3a1b:	49 89 c7             	mov    r15,rax
     15a3a1e:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     15a3a22:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
     15a3a26:	f6 c2 01             	test   dl,0x1
     15a3a29:	75 33                	jne    15a3a5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8fe2>
     15a3a2b:	49 8d 74 24 10       	lea    rsi,[r12+0x10]
     15a3a30:	49 8d 7f 18          	lea    rdi,[r15+0x18]
     15a3a34:	e8 59 1d 1c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15a3a39:	41 80 4f 10 02       	or     BYTE PTR [r15+0x10],0x2
     15a3a3e:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
     15a3a42:	f6 c2 01             	test   dl,0x1
     15a3a45:	75 20                	jne    15a3a67 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8feb>
     15a3a47:	49 8d 74 24 28       	lea    rsi,[r12+0x28]
     15a3a4c:	49 83 c7 20          	add    r15,0x20
     15a3a50:	4c 89 ff             	mov    rdi,r15
     15a3a53:	e8 3a 1d 1c 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     15a3a58:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     15a3a5c:	eb b0                	jmp    15a3a0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8f92>
     15a3a5e:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     15a3a62:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     15a3a65:	eb c4                	jmp    15a3a2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8faf>
     15a3a67:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     15a3a6b:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     15a3a6e:	eb d7                	jmp    15a3a47 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e8fcb>
     15a3a70:	48 8d 73 08          	lea    rsi,[rbx+0x8]
     15a3a74:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
     15a3a79:	4c 89 f7             	mov    rdi,r14
     15a3a7c:	e8 d9 83 6e ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>

### 0x15a699e; FDE=(22702334, 22703126)
Strings: playlist-publish/v1/subscription/ | POST
     15a6935:	e8 ae 15 5c ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
     15a693a:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
     15a693e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15a6943:	e8 5e 2f 04 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     15a6948:	45 8b 87 c0 00 00 00 	mov    r8d,DWORD PTR [r15+0xc0]
     15a694f:	48 8d 35 9a 75 db fe 	lea    rsi,[rip+0xfffffffffedb759a]        # 35def0 <_ZTSSt12bad_any_cast@@Base-0x322d8>
     15a6956:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     15a695b:	6a 21                	push   0x21
     15a695d:	5a                   	pop    rdx
     15a695e:	4c 89 f1             	mov    rcx,r14
     15a6961:	e8 ac 34 ff ff       	call   1599e12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3df396>
     15a6966:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15a696b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     15a6970:	e8 89 30 04 00       	call   15e99fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ef82>
     15a6975:	48 8d 35 26 84 dc fe 	lea    rsi,[rip+0xfffffffffedc8426]        # 36eda2 <_ZTSSt12bad_any_cast@@Base-0x21426>
     15a697c:	48 89 e7             	mov    rdi,rsp
     15a697f:	e8 fa 30 4d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     15a6984:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
     15a6989:	48 89 e6             	mov    rsi,rsp
     15a698c:	4c 89 e7             	mov    rdi,r12
     15a698f:	e8 96 2f 04 00       	call   15e992a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42eeae>
     15a6994:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     15a6998:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15a699b:	6a 01                	push   0x1
     15a699d:	5e                   	pop    rsi
     15a699e:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     15a69a4:	49 8b 77 50          	mov    rsi,QWORD PTR [r15+0x50]
     15a69a8:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
     15a69ac:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15a69af:	ff 90 c8 00 00 00    	call   QWORD PTR [rax+0xc8]
     15a69b5:	4c 8d a4 24 f8 00 00 	lea    r12,[rsp+0xf8]
     15a69bc:	00 
     15a69bd:	4d 89 7c 24 f8       	mov    QWORD PTR [r12-0x8],r15
     15a69c2:	4c 89 e7             	mov    rdi,r12
     15a69c5:	4c 89 f6             	mov    rsi,r14
     15a69c8:	e8 99 34 12 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     15a69cd:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     15a69d4:	00 
     15a69d5:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     15a69da:	e8 cd 27 5d ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     15a69df:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     15a69e6:	00 
     15a69e7:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]
     15a69ee:	00 
     15a69ef:	e8 22 02 00 00       	call   15a6c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ec19a>
     15a69f4:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
     15a69fb:	00 00 
     15a69fd:	6a 78                	push   0x78
     15a69ff:	5f                   	pop    rdi
     15a6a00:	e8 fb 74 24 00       	call   17edf00 <_Znwm@plt>
     15a6a05:	49 89 c4             	mov    r12,rax
     15a6a08:	48 8d 05 f9 cc 2d 00 	lea    rax,[rip+0x2dccf9]        # 1883708 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3fdf0>
     15a6a0f:	49 89 04 24          	mov    QWORD PTR [r12],rax
     15a6a13:	4c 89 e7             	mov    rdi,r12
     15a6a16:	48 83 c7 08          	add    rdi,0x8
     15a6a1a:	4c 8d ac 24 90 01 00 	lea    r13,[rsp+0x190]
     15a6a21:	00 
     15a6a22:	4c 89 ee             	mov    rsi,r13
     15a6a25:	e8 ec 01 00 00       	call   15a6c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ec19a>
     15a6a2a:	48 8d ac 24 60 01 00 	lea    rbp,[rsp+0x160]
     15a6a31:	00 
     15a6a32:	4c 89 65 20          	mov    QWORD PTR [rbp+0x20],r12
     15a6a36:	4c 89 ef             	mov    rdi,r13
     15a6a39:	e8 28 69 5c ff       	call   b6d366 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xba306>
     15a6a3e:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     15a6a43:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15a6a46:	48 89 ee             	mov    rsi,rbp
     15a6a49:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     15a6a4f:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
     15a6a54:	4d 89 7c 24 f8       	mov    QWORD PTR [r12-0x8],r15
     15a6a59:	4c 89 e7             	mov    rdi,r12

### 0x1615c98; FDE=(23153006, 23160158)
Strings: NOTATION( | ( | | | NMTOKENS | IDREF | CDATA | ENTITIES | ID | version | encoding | NMTOKEN | IDREFS | ENTITY | UTF-16 | standalone | yes | no
     1615c33:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     1615c38:	74 6e                	je     1615ca8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e16>
     1615c3a:	49 83 bc 24 d0 00 00 	cmp    QWORD PTR [r12+0xd0],0x0
     1615c41:	00 00 
     1615c43:	74 63                	je     1615ca8 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10e16>
     1615c45:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     1615c4a:	48 63 46 78          	movsxd rax,DWORD PTR [rsi+0x78]
     1615c4e:	48 8b 5c 24 28       	mov    rbx,QWORD PTR [rsp+0x28]
     1615c53:	48 8d 14 03          	lea    rdx,[rbx+rax*1]
     1615c57:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
     1615c5e:	00 
     1615c5f:	48 29 c1             	sub    rcx,rax
     1615c62:	e8 f7 08 00 00       	call   161655e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x116cc>
     1615c67:	48 85 c0             	test   rax,rax
     1615c6a:	0f 84 bd 08 00 00    	je     161652d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1169b>
     1615c70:	49 89 9c 24 20 02 00 	mov    QWORD PTR [r12+0x220],rbx
     1615c77:	00 
     1615c78:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     1615c7d:	49 8b b4 24 70 02 00 	mov    rsi,QWORD PTR [r12+0x270]
     1615c84:	00 
     1615c85:	49 8b 94 24 a0 02 00 	mov    rdx,QWORD PTR [r12+0x2a0]
     1615c8c:	00 
     1615c8d:	4d 8b 84 24 78 02 00 	mov    r8,QWORD PTR [r12+0x278]
     1615c94:	00 
     1615c95:	48 89 c1             	mov    rcx,rax
     1615c98:	41 ff 94 24 d0 00 00 	call   QWORD PTR [r12+0xd0]
     1615c9f:	00 
     1615ca0:	45 31 ff             	xor    r15d,r15d
     1615ca3:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     1615ca8:	e8 e8 09 00 00       	call   1616695 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11803>
     1615cad:	e9 88 02 00 00       	jmp    1615f3a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110a8>
     1615cb2:	48 8d 05 ba 4e e2 fe 	lea    rax,[rip+0xfffffffffee24eba]        # 43ab73 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x77f>
     1615cb9:	49 89 84 24 68 02 00 	mov    QWORD PTR [r12+0x268],rax
     1615cc0:	00 
     1615cc1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1615cc6:	80 b8 00 01 00 00 00 	cmp    BYTE PTR [rax+0x100],0x0
     1615ccd:	0f 84 70 02 00 00    	je     1615f43 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110b1>
     1615cd3:	49 83 bc 24 18 01 00 	cmp    QWORD PTR [r12+0x118],0x0
     1615cda:	00 00 
     1615cdc:	0f 85 44 03 00 00    	jne    1616026 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11194>
     1615ce2:	e9 5c 02 00 00       	jmp    1615f43 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110b1>
     1615ce7:	31 c0                	xor    eax,eax
     1615ce9:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1615cee:	80 b9 18 01 00 00 00 	cmp    BYTE PTR [rcx+0x118],0x0
     1615cf5:	0f 84 48 02 00 00    	je     1615f43 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110b1>
     1615cfb:	49 8b 8c 24 10 01 00 	mov    rcx,QWORD PTR [r12+0x110]
     1615d02:	00 
     1615d03:	48 85 c9             	test   rcx,rcx
     1615d06:	41 0f 94 c7          	sete   r15b
     1615d0a:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
     1615d0f:	49 63 96 34 01 00 00 	movsxd rdx,DWORD PTR [r14+0x134]
     1615d16:	48 8d 72 ff          	lea    rsi,[rdx-0x1]
     1615d1a:	41 89 b6 34 01 00 00 	mov    DWORD PTR [r14+0x134],esi
     1615d21:	49 8b b6 20 01 00 00 	mov    rsi,QWORD PTR [r14+0x120]
     1615d28:	49 8b be 38 01 00 00 	mov    rdi,QWORD PTR [r14+0x138]
     1615d2f:	48 63 54 97 fc       	movsxd rdx,DWORD PTR [rdi+rdx*4-0x4]
     1615d34:	48 c1 e2 05          	shl    rdx,0x5
     1615d38:	89 44 16 04          	mov    DWORD PTR [rsi+rdx*1+0x4],eax
     1615d3c:	41 83 be 34 01 00 00 	cmp    DWORD PTR [r14+0x134],0x0
     1615d43:	00 
     1615d44:	0f 85 f0 01 00 00    	jne    1615f3a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110a8>
     1615d4a:	48 85 c9             	test   rcx,rcx
     1615d4d:	0f 84 32 01 00 00    	je     1615e85 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10ff3>
     1615d53:	49 8b 9c 24 98 02 00 	mov    rbx,QWORD PTR [r12+0x298]
     1615d5a:	00 
     1615d5b:	8b 83 28 01 00 00    	mov    eax,DWORD PTR [rbx+0x128]
     1615d61:	8b bb 30 01 00 00    	mov    edi,DWORD PTR [rbx+0x130]
     1615d67:	48 c1 e7 05          	shl    rdi,0x5
     1615d6b:	48 01 c7             	add    rdi,rax
     1615d6e:	41 ff 54 24 18       	call   QWORD PTR [r12+0x18]
     1615d73:	48 85 c0             	test   rax,rax

### 0x162f252; FDE=(23261494, 23262095)
     162f1f1:	4c 89 ff             	mov    rdi,r15
     162f1f4:	ff 50 20             	call   QWORD PTR [rax+0x20]
     162f1f7:	48 85 c0             	test   rax,rax
     162f1fa:	0f 84 ef 00 00 00    	je     162f2ef <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a45d>
     162f200:	49 89 c6             	mov    r14,rax
     162f203:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
     162f207:	48 85 c0             	test   rax,rax
     162f20a:	0f 84 df 00 00 00    	je     162f2ef <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a45d>
     162f210:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
     162f214:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162f217:	ff 50 30             	call   QWORD PTR [rax+0x30]
     162f21a:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     162f21f:	4c 89 36             	mov    QWORD PTR [rsi],r14
     162f222:	48 89 c7             	mov    rdi,rax
     162f225:	e8 af 0c 00 00       	call   162fed9 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b047>
     162f22a:	48 85 c0             	test   rax,rax
     162f22d:	0f 84 bc 00 00 00    	je     162f2ef <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a45d>
     162f233:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
     162f238:	4c 89 f7             	mov    rdi,r14
     162f23b:	48 89 c6             	mov    rsi,rax
     162f23e:	e8 ed c0 47 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     162f243:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     162f246:	48 85 ff             	test   rdi,rdi
     162f249:	0f 84 0a 01 00 00    	je     162f359 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4c7>
     162f24f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162f252:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     162f258:	48 85 c0             	test   rax,rax
     162f25b:	0f 84 f8 00 00 00    	je     162f359 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4c7>
     162f261:	83 78 28 01          	cmp    DWORD PTR [rax+0x28],0x1
     162f265:	0f 85 ee 00 00 00    	jne    162f359 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4c7>
     162f26b:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     162f270:	48 89 c6             	mov    rsi,rax
     162f273:	e8 c8 ec 1b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     162f278:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     162f27d:	48 89 df             	mov    rdi,rbx
     162f280:	4c 89 f6             	mov    rsi,r14
     162f283:	e8 3c da 09 00       	call   16cccc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80e30>
     162f288:	4c 89 f7             	mov    rdi,r14
     162f28b:	e8 00 ec 1b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     162f290:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     162f295:	e8 ec f1 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     162f29a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162f2a1:	00 00 
     162f2a3:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     162f2a8:	0f 85 dc 00 00 00    	jne    162f38a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4f8>
     162f2ae:	48 83 c4 38          	add    rsp,0x38
     162f2b2:	5b                   	pop    rbx
     162f2b3:	41 5e                	pop    r14
     162f2b5:	41 5f                	pop    r15
     162f2b7:	5d                   	pop    rbp
     162f2b8:	c3                   	ret
     162f2b9:	4d 8d be a4 00 00 00 	lea    r15,[r14+0xa4]
     162f2c0:	4c 89 ff             	mov    rdi,r15
     162f2c3:	e8 1e ba 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
     162f2c8:	84 c0                	test   al,al
     162f2ca:	74 50                	je     162f31c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a48a>
     162f2cc:	4d 8d be 90 00 00 00 	lea    r15,[r14+0x90]
     162f2d3:	4c 89 ff             	mov    rdi,r15
     162f2d6:	e8 0b ba 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
     162f2db:	84 c0                	test   al,al
     162f2dd:	74 3d                	je     162f31c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a48a>
     162f2df:	49 83 c6 68          	add    r14,0x68
     162f2e3:	4c 89 f7             	mov    rdi,r14
     162f2e6:	e8 fb b9 53 ff       	call   b6ace6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb7c86>
     162f2eb:	84 c0                	test   al,al
     162f2ed:	74 45                	je     162f334 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4a2>
     162f2ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162f2f6:	00 00 
     162f2f8:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     162f2fd:	0f 85 87 00 00 00    	jne    162f38a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a4f8>
     162f303:	48 8d 35 72 2c e2 fe 	lea    rsi,[rip+0xfffffffffee22c72]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

### 0x162f460; FDE=(23262246, 23262508)
     162f408:	48 8d 05 f9 0e 26 00 	lea    rax,[rip+0x260ef9]        # 1890308 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8fe0>
     162f40f:	48 89 07             	mov    QWORD PTR [rdi],rax
     162f412:	48 83 c7 20          	add    rdi,0x20
     162f416:	e8 75 ea 1b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     162f41b:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     162f41f:	5b                   	pop    rbx
     162f420:	e9 8d f0 46 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     162f425:	cc                   	int3
     162f426:	41 57                	push   r15
     162f428:	41 56                	push   r14
     162f42a:	41 54                	push   r12
     162f42c:	53                   	push   rbx
     162f42d:	48 83 ec 28          	sub    rsp,0x28
     162f431:	49 89 f6             	mov    r14,rsi
     162f434:	48 89 fb             	mov    rbx,rdi
     162f437:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162f43e:	00 00 
     162f440:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     162f445:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162f448:	ff 50 10             	call   QWORD PTR [rax+0x10]
     162f44b:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
     162f44f:	4d 85 e4             	test   r12,r12
     162f452:	0f 84 8c 00 00 00    	je     162f4e4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a652>
     162f458:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
     162f45d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162f460:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     162f466:	49 89 c7             	mov    r15,rax
     162f469:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
     162f46e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162f471:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     162f477:	4d 85 ff             	test   r15,r15
     162f47a:	74 0c                	je     162f488 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a5f6>
     162f47c:	4c 39 30             	cmp    QWORD PTR [rax],r14
     162f47f:	75 07                	jne    162f488 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a5f6>
     162f481:	41 83 7f 28 01       	cmp    DWORD PTR [r15+0x28],0x1
     162f486:	74 06                	je     162f48e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a5fc>
     162f488:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
     162f48c:	eb c1                	jmp    162f44f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a5bd>
     162f48e:	49 8b 74 24 28       	mov    rsi,QWORD PTR [r12+0x28]
     162f493:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     162f498:	e8 4c 6e f4 ff       	call   15762e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bb86d>
     162f49d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     162f4a0:	48 89 df             	mov    rdi,rbx
     162f4a3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     162f4a6:	48 89 c3             	mov    rbx,rax
     162f4a9:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
     162f4ae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162f4b1:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     162f4b7:	48 8b 00             	mov    rax,QWORD PTR [rax]
     162f4ba:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     162f4bf:	48 89 06             	mov    QWORD PTR [rsi],rax
     162f4c2:	48 89 df             	mov    rdi,rbx
     162f4c5:	e8 62 00 00 00       	call   162f52c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a69a>
     162f4ca:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     162f4cf:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     162f4d4:	48 89 c7             	mov    rdi,rax
     162f4d7:	e8 2e a4 4f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
     162f4dc:	48 89 df             	mov    rdi,rbx
     162f4df:	e8 a2 ef 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     162f4e4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162f4eb:	00 00 
     162f4ed:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     162f4f2:	75 33                	jne    162f527 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a695>
     162f4f4:	48 83 c4 28          	add    rsp,0x28
     162f4f8:	5b                   	pop    rbx
     162f4f9:	41 5c                	pop    r12
     162f4fb:	41 5e                	pop    r14
     162f4fd:	41 5f                	pop    r15
     162f4ff:	c3                   	ret
     162f500:	eb 00                	jmp    162f502 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a670>
     162f502:	48 89 c3             	mov    rbx,rax

### 0x162fdd2; FDE=(23264596, 23264985)
     162fd76:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
     162fd7b:	4c 89 ff             	mov    rdi,r15
     162fd7e:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     162fd84:	49 83 3f 00          	cmp    QWORD PTR [r15],0x0
     162fd88:	0f 84 e4 00 00 00    	je     162fe72 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2afe0>
     162fd8e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     162fd91:	48 89 df             	mov    rdi,rbx
     162fd94:	ff 50 30             	call   QWORD PTR [rax+0x30]
     162fd97:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     162fd9c:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     162fda1:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     162fda4:	48 89 c7             	mov    rdi,rax
     162fda7:	e8 2d 01 00 00       	call   162fed9 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b047>
     162fdac:	48 85 c0             	test   rax,rax
     162fdaf:	74 7c                	je     162fe2d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af9b>
     162fdb1:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     162fdb6:	4c 89 ff             	mov    rdi,r15
     162fdb9:	48 89 c6             	mov    rsi,rax
     162fdbc:	e8 6f b5 47 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     162fdc1:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     162fdc4:	41 b4 01             	mov    r12b,0x1
     162fdc7:	4d 85 ff             	test   r15,r15
     162fdca:	74 28                	je     162fdf4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af62>
     162fdcc:	49 8b 06             	mov    rax,QWORD PTR [r14]
     162fdcf:	4c 89 f7             	mov    rdi,r14
     162fdd2:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     162fdd8:	48 85 c0             	test   rax,rax
     162fddb:	74 06                	je     162fde3 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af51>
     162fddd:	83 78 28 01          	cmp    DWORD PTR [rax+0x28],0x1
     162fde1:	75 16                	jne    162fdf9 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af67>
     162fde3:	49 8b 07             	mov    rax,QWORD PTR [r15]
     162fde6:	4c 89 ff             	mov    rdi,r15
     162fde9:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     162fdef:	49 89 c7             	mov    r15,rax
     162fdf2:	eb 1e                	jmp    162fe12 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af80>
     162fdf4:	45 31 ff             	xor    r15d,r15d
     162fdf7:	eb 19                	jmp    162fe12 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af80>
     162fdf9:	4d 39 f7             	cmp    r15,r14
     162fdfc:	75 0e                	jne    162fe0c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af7a>
     162fdfe:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     162fe03:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     162fe06:	48 89 df             	mov    rdi,rbx
     162fe09:	ff 50 40             	call   QWORD PTR [rax+0x40]
     162fe0c:	45 31 ff             	xor    r15d,r15d
     162fe0f:	45 31 e4             	xor    r12d,r12d
     162fe12:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     162fe17:	e8 6a e6 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     162fe1c:	45 84 e4             	test   r12b,r12b
     162fe1f:	74 51                	je     162fe72 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2afe0>
     162fe21:	4d 85 ff             	test   r15,r15
     162fe24:	74 07                	je     162fe2d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af9b>
     162fe26:	41 83 7f 28 01       	cmp    DWORD PTR [r15+0x28],0x1
     162fe2b:	74 45                	je     162fe72 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2afe0>
     162fe2d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     162fe32:	4c 89 f6             	mov    rsi,r14
     162fe35:	e8 af 64 f4 ff       	call   15762e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bb86d>
     162fe3a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     162fe3d:	48 89 df             	mov    rdi,rbx
     162fe40:	ff 50 30             	call   QWORD PTR [rax+0x30]
     162fe43:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     162fe48:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     162fe4d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     162fe50:	48 89 c7             	mov    rdi,rax
     162fe53:	e8 d4 f6 ff ff       	call   162f52c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a69a>
     162fe58:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     162fe5d:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     162fe62:	48 89 c7             	mov    rdi,rax
     162fe65:	e8 a0 9a 4f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
     162fe6a:	48 89 df             	mov    rdi,rbx
     162fe6d:	e8 14 e6 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     162fe72:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]

### 0x162fde9; FDE=(23264596, 23264985)
     162fd94:	ff 50 30             	call   QWORD PTR [rax+0x30]
     162fd97:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     162fd9c:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     162fda1:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     162fda4:	48 89 c7             	mov    rdi,rax
     162fda7:	e8 2d 01 00 00       	call   162fed9 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b047>
     162fdac:	48 85 c0             	test   rax,rax
     162fdaf:	74 7c                	je     162fe2d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af9b>
     162fdb1:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     162fdb6:	4c 89 ff             	mov    rdi,r15
     162fdb9:	48 89 c6             	mov    rsi,rax
     162fdbc:	e8 6f b5 47 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
     162fdc1:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     162fdc4:	41 b4 01             	mov    r12b,0x1
     162fdc7:	4d 85 ff             	test   r15,r15
     162fdca:	74 28                	je     162fdf4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af62>
     162fdcc:	49 8b 06             	mov    rax,QWORD PTR [r14]
     162fdcf:	4c 89 f7             	mov    rdi,r14
     162fdd2:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     162fdd8:	48 85 c0             	test   rax,rax
     162fddb:	74 06                	je     162fde3 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af51>
     162fddd:	83 78 28 01          	cmp    DWORD PTR [rax+0x28],0x1
     162fde1:	75 16                	jne    162fdf9 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af67>
     162fde3:	49 8b 07             	mov    rax,QWORD PTR [r15]
     162fde6:	4c 89 ff             	mov    rdi,r15
     162fde9:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     162fdef:	49 89 c7             	mov    r15,rax
     162fdf2:	eb 1e                	jmp    162fe12 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af80>
     162fdf4:	45 31 ff             	xor    r15d,r15d
     162fdf7:	eb 19                	jmp    162fe12 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af80>
     162fdf9:	4d 39 f7             	cmp    r15,r14
     162fdfc:	75 0e                	jne    162fe0c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af7a>
     162fdfe:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     162fe03:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     162fe06:	48 89 df             	mov    rdi,rbx
     162fe09:	ff 50 40             	call   QWORD PTR [rax+0x40]
     162fe0c:	45 31 ff             	xor    r15d,r15d
     162fe0f:	45 31 e4             	xor    r12d,r12d
     162fe12:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     162fe17:	e8 6a e6 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     162fe1c:	45 84 e4             	test   r12b,r12b
     162fe1f:	74 51                	je     162fe72 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2afe0>
     162fe21:	4d 85 ff             	test   r15,r15
     162fe24:	74 07                	je     162fe2d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2af9b>
     162fe26:	41 83 7f 28 01       	cmp    DWORD PTR [r15+0x28],0x1
     162fe2b:	74 45                	je     162fe72 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2afe0>
     162fe2d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     162fe32:	4c 89 f6             	mov    rsi,r14
     162fe35:	e8 af 64 f4 ff       	call   15762e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bb86d>
     162fe3a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     162fe3d:	48 89 df             	mov    rdi,rbx
     162fe40:	ff 50 30             	call   QWORD PTR [rax+0x30]
     162fe43:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     162fe48:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     162fe4d:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     162fe50:	48 89 c7             	mov    rdi,rax
     162fe53:	e8 d4 f6 ff ff       	call   162f52c <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a69a>
     162fe58:	48 8b 5c 24 18       	mov    rbx,QWORD PTR [rsp+0x18]
     162fe5d:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     162fe62:	48 89 c7             	mov    rdi,rax
     162fe65:	e8 a0 9a 4f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
     162fe6a:	48 89 df             	mov    rdi,rbx
     162fe6d:	e8 14 e6 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     162fe72:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     162fe77:	e8 0a e6 46 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     162fe7c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     162fe83:	00 00 
     162fe85:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
     162fe8a:	75 48                	jne    162fed4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b042>
     162fe8c:	48 83 c4 38          	add    rsp,0x38
     162fe90:	5b                   	pop    rbx

### 0x164aeb4; FDE=(23375226, 23375735)
     164ae5e:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
     164ae63:	48 89 df             	mov    rdi,rbx
     164ae66:	4c 89 fe             	mov    rsi,r15
     164ae69:	e8 c0 0b 43 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     164ae6e:	4c 89 ff             	mov    rdi,r15
     164ae71:	e8 1a 30 1a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     164ae76:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     164ae7b:	e8 06 36 45 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     164ae80:	44 8a 23             	mov    r12b,BYTE PTR [rbx]
     164ae83:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
     164ae87:	41 0f b6 fc          	movzx  edi,r12b
     164ae8b:	4c 89 fe             	mov    rsi,r15
     164ae8e:	e8 8d 09 43 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     164ae93:	84 c0                	test   al,al
     164ae95:	74 6b                	je     164af02 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46070>
     164ae97:	49 8b 06             	mov    rax,QWORD PTR [r14]
     164ae9a:	4c 89 f7             	mov    rdi,r14
     164ae9d:	ff 50 58             	call   QWORD PTR [rax+0x58]
     164aea0:	48 85 c0             	test   rax,rax
     164aea3:	74 5d                	je     164af02 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46070>
     164aea5:	49 8b 06             	mov    rax,QWORD PTR [r14]
     164aea8:	4c 89 f7             	mov    rdi,r14
     164aeab:	ff 50 58             	call   QWORD PTR [rax+0x58]
     164aeae:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     164aeb1:	48 89 c7             	mov    rdi,rax
     164aeb4:	ff 91 d0 00 00 00    	call   QWORD PTR [rcx+0xd0]
     164aeba:	48 85 c0             	test   rax,rax
     164aebd:	74 43                	je     164af02 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46070>
     164aebf:	83 78 28 02          	cmp    DWORD PTR [rax+0x28],0x2
     164aec3:	74 3d                	je     164af02 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x46070>
     164aec5:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     164aeca:	48 89 c6             	mov    rsi,rax
     164aecd:	e8 6e 30 1a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     164aed2:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
     164aed7:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
     164aedc:	4c 89 f7             	mov    rdi,r14
     164aedf:	4c 89 fe             	mov    rsi,r15
     164aee2:	e8 dd 1d 08 00       	call   16cccc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80e30>
     164aee7:	48 89 df             	mov    rdi,rbx
     164aeea:	4c 89 f6             	mov    rsi,r14
     164aeed:	e8 3c 0b 43 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     164aef2:	4c 89 f7             	mov    rdi,r14
     164aef5:	e8 96 2f 1a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     164aefa:	4c 89 ff             	mov    rdi,r15
     164aefd:	e8 8e 2f 1a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     164af02:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     164af07:	e8 7a 35 45 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     164af0c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     164af13:	00 00 
     164af15:	48 3b 44 24 58       	cmp    rax,QWORD PTR [rsp+0x58]
     164af1a:	75 56                	jne    164af72 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460e0>
     164af1c:	48 83 c4 60          	add    rsp,0x60
     164af20:	5b                   	pop    rbx
     164af21:	41 5c                	pop    r12
     164af23:	41 5e                	pop    r14
     164af25:	41 5f                	pop    r15
     164af27:	5d                   	pop    rbp
     164af28:	c3                   	ret
     164af29:	eb 15                	jmp    164af40 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460ae>
     164af2b:	49 89 c6             	mov    r14,rax
     164af2e:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     164af33:	e8 4e 35 45 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     164af38:	eb 09                	jmp    164af43 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460b1>
     164af3a:	eb 04                	jmp    164af40 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460ae>
     164af3c:	eb 02                	jmp    164af40 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460ae>
     164af3e:	eb 00                	jmp    164af40 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460ae>
     164af40:	49 89 c6             	mov    r14,rax
     164af43:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
     164af48:	e8 39 35 45 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     164af4d:	eb 03                	jmp    164af52 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x460c0>
     164af4f:	49 89 c6             	mov    r14,rax

### 0x167519f; FDE=(23548262, 23548378)
     167514a:	e9 89 6e ff ff       	jmp    166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     167514f:	cc                   	int3
     1675150:	53                   	push   rbx
     1675151:	48 89 fb             	mov    rbx,rdi
     1675154:	48 83 c7 38          	add    rdi,0x38
     1675158:	e8 7b 6e ff ff       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     167515d:	48 89 df             	mov    rdi,rbx
     1675160:	5b                   	pop    rbx
     1675161:	e9 ba 8d 17 00       	jmp    17edf20 <_ZdlPv@plt>
     1675166:	41 56                	push   r14
     1675168:	53                   	push   rbx
     1675169:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
     1675170:	48 89 cb             	mov    rbx,rcx
     1675173:	49 89 f6             	mov    r14,rsi
     1675176:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     167517d:	00 00 
     167517f:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     1675186:	00 
     1675187:	48 8d 77 08          	lea    rsi,[rdi+0x8]
     167518b:	48 89 e7             	mov    rdi,rsp
     167518e:	e8 17 29 ff ff       	call   1667aaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bc16>
     1675193:	49 8b 06             	mov    rax,QWORD PTR [r14]
     1675196:	48 89 e6             	mov    rsi,rsp
     1675199:	4c 89 f7             	mov    rdi,r14
     167519c:	48 89 da             	mov    rdx,rbx
     167519f:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     16751a5:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     16751aa:	e8 29 6e ff ff       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     16751af:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     16751b6:	00 00 
     16751b8:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     16751bf:	00 
     16751c0:	75 0b                	jne    16751cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29339>
     16751c2:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     16751c9:	5b                   	pop    rbx
     16751ca:	41 5e                	pop    r14
     16751cc:	c3                   	ret
     16751cd:	e8 de a8 17 00       	call   17efab0 <__stack_chk_fail@plt>
     16751d2:	48 89 c7             	mov    rdi,rax
     16751d5:	e8 cb 48 40 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     16751da:	48 8d 05 d7 3c 22 00 	lea    rax,[rip+0x223cd7]        # 1898eb8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5df8>
     16751e1:	48 89 07             	mov    QWORD PTR [rdi],rax
     16751e4:	48 83 c7 08          	add    rdi,0x8
     16751e8:	e9 65 1f ff ff       	jmp    1667152 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2be>
     16751ed:	cc                   	int3
     16751ee:	53                   	push   rbx
     16751ef:	48 89 fb             	mov    rbx,rdi
     16751f2:	e8 e3 ff ff ff       	call   16751da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29346>
     16751f7:	48 89 df             	mov    rdi,rbx
     16751fa:	5b                   	pop    rbx
     16751fb:	e9 20 8d 17 00       	jmp    17edf20 <_ZdlPv@plt>
     1675200:	41 56                	push   r14
     1675202:	53                   	push   rbx
     1675203:	48 83 ec 28          	sub    rsp,0x28
     1675207:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     167520e:	00 00 
     1675210:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1675215:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     1675219:	bf d8 00 00 00       	mov    edi,0xd8
     167521e:	e8 dd 8c 17 00       	call   17edf00 <_Znwm@plt>
     1675223:	48 89 c3             	mov    rbx,rax
     1675226:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     167522a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     167522f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1675234:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     167523b:	00 00 
     167523d:	48 8d 05 74 3c 22 00 	lea    rax,[rip+0x223c74]        # 1898eb8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5df8>
     1675244:	48 89 03             	mov    QWORD PTR [rbx],rax
     1675247:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     167524b:	4c 89 f6             	mov    rsi,r14
     167524e:	e8 15 1f ff ff       	call   1667168 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b2d4>

### 0x1684a68; FDE=(23611942, 23612545)
Strings: LevelDB was opened using a memory-based Env and the application might be unstable and slow due to that. | falling back to the in-memory env after: %s
     1684a13:	48 89 c3             	mov    rbx,rax
     1684a16:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     1684a19:	e8 ce 1c 43 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
     1684a1e:	48 89 df             	mov    rdi,rbx
     1684a21:	e8 aa b2 3e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1684a26:	55                   	push   rbp
     1684a27:	41 57                	push   r15
     1684a29:	41 56                	push   r14
     1684a2b:	41 55                	push   r13
     1684a2d:	41 54                	push   r12
     1684a2f:	53                   	push   rbx
     1684a30:	48 83 ec 48          	sub    rsp,0x48
     1684a34:	4c 89 cd             	mov    rbp,r9
     1684a37:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
     1684a3c:	49 89 cd             	mov    r13,rcx
     1684a3f:	49 89 d6             	mov    r14,rdx
     1684a42:	49 89 f7             	mov    r15,rsi
     1684a45:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     1684a4a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1684a51:	00 00 
     1684a53:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     1684a58:	48 8b be c8 00 00 00 	mov    rdi,QWORD PTR [rsi+0xc8]
     1684a5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1684a62:	48 89 ce             	mov    rsi,rcx
     1684a65:	4c 89 ca             	mov    rdx,r9
     1684a68:	ff 90 d0 00 00 00    	call   QWORD PTR [rax+0xd0]
     1684a6e:	48 8d 35 07 d5 dc fe 	lea    rsi,[rip+0xfffffffffedcd507]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1684a75:	48 8d 0d 0f 14 ca fe 	lea    rcx,[rip+0xfffffffffeca140f]        # 325e8b <_ZTSSt12bad_any_cast@@Base-0x6a33d>
     1684a7c:	6a 02                	push   0x2
     1684a7e:	5f                   	pop    rdi
     1684a7f:	ba c8 00 00 00       	mov    edx,0xc8
     1684a84:	31 c0                	xor    eax,eax
     1684a86:	e8 47 1e 15 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     1684a8b:	4d 8b 66 18          	mov    r12,QWORD PTR [r14+0x18]
     1684a8f:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
     1684a94:	48 89 df             	mov    rdi,rbx
     1684a97:	48 89 ee             	mov    rsi,rbp
     1684a9a:	e8 27 62 01 00       	call   169acc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ee32>
     1684a9f:	f6 03 01             	test   BYTE PTR [rbx],0x1
     1684aa2:	74 07                	je     1684aab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38c17>
     1684aa4:	48 8b 54 24 30       	mov    rdx,QWORD PTR [rsp+0x30]
     1684aa9:	eb 05                	jmp    1684ab0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38c1c>
     1684aab:	48 8d 54 24 21       	lea    rdx,[rsp+0x21]
     1684ab0:	48 8d 35 7c 74 d0 fe 	lea    rsi,[rip+0xfffffffffed0747c]        # 38bf33 <_ZTSSt12bad_any_cast@@Base-0x4295>
     1684ab7:	4c 89 e7             	mov    rdi,r12
     1684aba:	31 c0                	xor    eax,eax
     1684abc:	e8 98 5d 01 00       	call   169a859 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4e9c5>
     1684ac1:	48 89 df             	mov    rdi,rbx
     1684ac4:	e8 c7 93 16 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1684ac9:	8a 05 19 00 37 00    	mov    al,BYTE PTR [rip+0x370019]        # 19f4ae8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2ba7>
     1684acf:	84 c0                	test   al,al
     1684ad1:	0f 84 ce 00 00 00    	je     1684ba5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38d11>
     1684ad7:	48 8b 05 02 00 37 00 	mov    rax,QWORD PTR [rip+0x370002]        # 19f4ae0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2b9f>
     1684ade:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1684ae2:	48 8d 4c 24 18       	lea    rcx,[rsp+0x18]
     1684ae7:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     1684aec:	48 89 df             	mov    rdi,rbx
     1684aef:	4c 89 f6             	mov    rsi,r14
     1684af2:	4c 89 ea             	mov    rdx,r13
     1684af5:	e8 6e 5a 00 00       	call   168a568 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
     1684afa:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
     1684afd:	4d 85 e4             	test   r12,r12
     1684b00:	74 1f                	je     1684b21 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38c8d>
     1684b02:	49 81 c7 b0 00 00 00 	add    r15,0xb0
     1684b09:	4c 89 ff             	mov    rdi,r15
     1684b0c:	4c 89 e6             	mov    rsi,r12
     1684b0f:	e8 14 fd ff ff       	call   1684828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38994>
     1684b14:	0f 57 c0             	xorps  xmm0,xmm0
     1684b17:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
     1684b1c:	0f 29 03             	movaps XMMWORD PTR [rbx],xmm0
     1684b1f:	eb 4b                	jmp    1684b6c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38cd8>

### 0x16a0ea1; FDE=(23727526, 23728028)
     16a0e3d:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     16a0e42:	4c 89 f2             	mov    rdx,r14
     16a0e45:	4c 89 f1             	mov    rcx,r14
     16a0e48:	e8 16 ff ff ff       	call   16a0d63 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54ecf>
     16a0e4d:	0f 57 c0             	xorps  xmm0,xmm0
     16a0e50:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     16a0e53:	0f 10 44 24 30       	movups xmm0,XMMWORD PTR [rsp+0x30]
     16a0e58:	0f 10 4c 24 40       	movups xmm1,XMMWORD PTR [rsp+0x40]
     16a0e5d:	0f 10 54 24 50       	movups xmm2,XMMWORD PTR [rsp+0x50]
     16a0e62:	4c 8d b4 24 b0 00 00 	lea    r14,[rsp+0xb0]
     16a0e69:	00 
     16a0e6a:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     16a0e6e:	41 0f 29 4e 10       	movaps XMMWORD PTR [r14+0x10],xmm1
     16a0e73:	41 0f 29 56 20       	movaps XMMWORD PTR [r14+0x20],xmm2
     16a0e78:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
     16a0e7c:	4c 8d bc 24 a0 00 00 	lea    r15,[rsp+0xa0]
     16a0e83:	00 
     16a0e84:	4c 39 a4 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],r12
     16a0e8b:	00 
     16a0e8c:	74 3c                	je     16a0eca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55036>
     16a0e8e:	48 8b b4 24 c0 00 00 	mov    rsi,QWORD PTR [rsp+0xc0]
     16a0e95:	00 
     16a0e96:	48 8b 94 24 d8 00 00 	mov    rdx,QWORD PTR [rsp+0xd8]
     16a0e9d:	00 
     16a0e9e:	4c 89 ff             	mov    rdi,r15
     16a0ea1:	ff 94 24 d0 00 00 00 	call   QWORD PTR [rsp+0xd0]
     16a0ea8:	48 89 df             	mov    rdi,rbx
     16a0eab:	4c 89 fe             	mov    rsi,r15
     16a0eae:	e8 69 89 41 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     16a0eb3:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     16a0eba:	00 
     16a0ebb:	e8 c6 d5 3f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     16a0ec0:	4c 89 f7             	mov    rdi,r14
     16a0ec3:	e8 28 8f 13 00       	call   17d9df0 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c11>
     16a0ec8:	eb ba                	jmp    16a0e84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x54ff0>
     16a0eca:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     16a0ed1:	00 
     16a0ed2:	e8 af d5 3f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     16a0ed7:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     16a0edc:	e8 a5 d5 3f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     16a0ee1:	31 ff                	xor    edi,edi
     16a0ee3:	e8 9e d5 3f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     16a0ee8:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
     16a0eed:	e8 72 bc 41 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     16a0ef2:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     16a0ef9:	00 
     16a0efa:	e8 65 bc 41 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
     16a0eff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     16a0f06:	00 00 
     16a0f08:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
     16a0f0f:	00 
     16a0f10:	0f 85 81 00 00 00    	jne    16a0f97 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55103>
     16a0f16:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
     16a0f1d:	5b                   	pop    rbx
     16a0f1e:	41 5c                	pop    r12
     16a0f20:	41 5e                	pop    r14
     16a0f22:	41 5f                	pop    r15
     16a0f24:	c3                   	ret
     16a0f25:	49 89 c6             	mov    r14,rax
     16a0f28:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     16a0f2d:	eb 31                	jmp    16a0f60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x550cc>
     16a0f2f:	49 89 c6             	mov    r14,rax
     16a0f32:	eb 31                	jmp    16a0f65 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x550d1>
     16a0f34:	49 89 c6             	mov    r14,rax
     16a0f37:	eb 36                	jmp    16a0f6f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x550db>
     16a0f39:	eb 00                	jmp    16a0f3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x550a7>
     16a0f3b:	49 89 c6             	mov    r14,rax
     16a0f3e:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     16a0f45:	00 
     16a0f46:	e8 3b d5 3f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     16a0f4b:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]

