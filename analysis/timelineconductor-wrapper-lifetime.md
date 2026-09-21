# TimelineConductor 0x1871660 wrapper lifetime

Creation: 0x135ec84, saved at rsp+0x1b0 at 0x135ecc6.

## 0x135ecc6: mov    QWORD PTR [rsp+0x1b0],r15
    Disassembly of section .text:
    
    000000000135ec70 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a41f4>:
     135ec70:	50                   	push   rax
     135ec71:	30 49 89             	xor    BYTE PTR [rcx-0x77],cl
     135ec74:	c6                   	(bad)
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
     135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
     135ed88:	00 
     135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
     135ed90:	00 
     135ed91:	4c 89 ef             	mov    rdi,r13
     135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
     135eda0:	00 
     135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
     135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
     135edac:	00 

## 0x135f3d4: and    QWORD PTR [rsp+0x1b0],0x0
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
     135f4b8:	49 8d 5e 20          	lea    rbx,[r14+0x20]
     135f4bc:	6a 61                	push   0x61
     135f4be:	59                   	pop    rcx

## 0x136008f: lea    rdi,[rsp+0x1b0]
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
     13600a9:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     13600b0:	00 
     13600b1:	e8 00 10 00 00       	call   13610b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a663a>
     13600b6:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     13600bd:	00 
     13600be:	e8 49 53 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     13600c3:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     13600ca:	00 
     13600cb:	e8 b6 e3 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13600d0:	48 8d bc 24 50 08 00 	lea    rdi,[rsp+0x850]
     13600d7:	00 
     13600d8:	e8 f7 3f 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     13600dd:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
     13600e4:	00 
     13600e5:	e8 9c e3 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13600ea:	48 8d bc 24 b0 08 00 	lea    rdi,[rsp+0x8b0]
     13600f1:	00 
     13600f2:	e8 73 9e 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13600f7:	48 8d bc 24 a0 09 00 	lea    rdi,[rsp+0x9a0]
     13600fe:	00 
     13600ff:	e8 66 9e 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360104:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     136010b:	00 
     136010c:	e8 7f dd 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360111:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360118:	00 00 
     136011a:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360121:	00 
     1360122:	0f 85 ee 0a 00 00    	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360128:	48 81 c4 28 10 00 00 	add    rsp,0x1028
     136012f:	5b                   	pop    rbx
     1360130:	41 5c                	pop    r12
     1360132:	41 5d                	pop    r13
     1360134:	41 5e                	pop    r14
     1360136:	41 5f                	pop    r15
     1360138:	5d                   	pop    rbp
     1360139:	c3                   	ret
     136013a:	4c 8d 35 09 43 01 ff 	lea    r14,[rip+0xffffffffff014309]        # 37444a <_ZTSSt12bad_any_cast@@Base-0x1bd7e>
     1360141:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360148:	00 
     1360149:	4c 89 f6             	mov    rsi,r14
     136014c:	e8 fe b6 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     1360151:	84 c0                	test   al,al
     1360153:	0f 84 fe d1 ff ff    	je     135d357 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a28db>
     1360159:	e9 4b d2 ff ff       	jmp    135d3a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a292d>
     136015e:	e9 da 08 00 00       	jmp    1360a3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5fc1>
     1360163:	e9 5b 04 00 00       	jmp    13605c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5b47>
     1360168:	e9 56 04 00 00       	jmp    13605c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5b47>
     136016d:	e9 51 04 00 00       	jmp    13605c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5b47>

## Address-taking of rsp+0x1b0
### 0x136008f: lea    rdi,[rsp+0x1b0]
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
     13600a9:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     13600b0:	00 
     13600b1:	e8 00 10 00 00       	call   13610b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a663a>
     13600b6:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     13600bd:	00 
     13600be:	e8 49 53 47 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
     13600c3:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
     13600ca:	00 
     13600cb:	e8 b6 e3 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13600d0:	48 8d bc 24 50 08 00 	lea    rdi,[rsp+0x850]
     13600d7:	00 
     13600d8:	e8 f7 3f 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     13600dd:	48 8b bc 24 c8 01 00 	mov    rdi,QWORD PTR [rsp+0x1c8]
     13600e4:	00 
     13600e5:	e8 9c e3 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     13600ea:	48 8d bc 24 b0 08 00 	lea    rdi,[rsp+0x8b0]
     13600f1:	00 
     13600f2:	e8 73 9e 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     13600f7:	48 8d bc 24 a0 09 00 	lea    rdi,[rsp+0x9a0]
     13600fe:	00 
     13600ff:	e8 66 9e 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1360104:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     136010b:	00 
     136010c:	e8 7f dd 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1360111:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1360118:	00 00 
     136011a:	48 3b 84 24 20 10 00 	cmp    rax,QWORD PTR [rsp+0x1020]
     1360121:	00 
     1360122:	0f 85 ee 0a 00 00    	jne    1360c16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a619a>
     1360128:	48 81 c4 28 10 00 00 	add    rsp,0x1028
     136012f:	5b                   	pop    rbx
     1360130:	41 5c                	pop    r12
     1360132:	41 5d                	pop    r13
     1360134:	41 5e                	pop    r14
     1360136:	41 5f                	pop    r15
     1360138:	5d                   	pop    rbp
     1360139:	c3                   	ret
     136013a:	4c 8d 35 09 43 01 ff 	lea    r14,[rip+0xffffffffff014309]        # 37444a <_ZTSSt12bad_any_cast@@Base-0x1bd7e>
     1360141:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     1360148:	00 
     1360149:	4c 89 f6             	mov    rsi,r14
     136014c:	e8 fe b6 71 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     1360151:	84 c0                	test   al,al
     1360153:	0f 84 fe d1 ff ff    	je     135d357 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a28db>
     1360159:	e9 4b d2 ff ff       	jmp    135d3a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a292d>
     136015e:	e9 da 08 00 00       	jmp    1360a3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5fc1>
     1360163:	e9 5b 04 00 00       	jmp    13605c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5b47>
     1360168:	e9 56 04 00 00       	jmp    13605c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5b47>
     136016d:	e9 51 04 00 00       	jmp    13605c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5b47>
     1360172:	e9 4c 04 00 00       	jmp    13605c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5b47>
     1360177:	e9 47 04 00 00       	jmp    13605c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5b47>
     136017c:	e9 bc 08 00 00       	jmp    1360a3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5fc1>
     1360181:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1360186:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]
     136018d:	00 
     136018e:	eb 0d                	jmp    136019d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5721>
     1360190:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     1360195:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     136019c:	00 
     136019d:	e8 46 a6 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     13601a2:	e9 27 09 00 00       	jmp    1360ace <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6052>
     13601a7:	e9 c0 08 00 00       	jmp    1360a6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5ff0>
     13601ac:	eb 00                	jmp    13601ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5732>
     13601ae:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

## Direct stores from register values loaded from rsp+0x1b0
