# State readiness receiver producer

Target: e9ccf3 stores [rsp+0x770] into state+0x10.

## Exact window e9c780..e9cd20

/tmp/stateprod/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000e9c780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63b96>:
  e9c780:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c784:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9c789:	48 8d 15 38 4c 99 00 	lea    rdx,[rip+0x994c38]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c790:	48 89 10             	mov    QWORD PTR [rax],rdx
  e9c793:	48 8d 15 16 0f 9a 00 	lea    rdx,[rip+0x9a0f16]        # 183d6b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf648>
  e9c79a:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e9c79e:	48 8b 94 24 38 13 00 	mov    rdx,QWORD PTR [rsp+0x1338]
  e9c7a5:	00 
  e9c7a6:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
  e9c7aa:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
  e9c7b1:	00 
  e9c7b2:	48 89 50 28          	mov    QWORD PTR [rax+0x28],rdx
  e9c7b6:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e9c7bb:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
  e9c7bf:	48 85 db             	test   rbx,rbx
  e9c7c2:	74 05                	je     e9c7c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63bdf>
  e9c7c4:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c7c9:	66 48 0f 6e c0       	movq   xmm0,rax
  e9c7ce:	66 48 0f 6e c9       	movq   xmm1,rcx
  e9c7d3:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c7d7:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9c7de:	00 
  e9c7df:	66 0f 7f 0e          	movdqa XMMWORD PTR [rsi],xmm1
  e9c7e3:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c7ea:	00 
  e9c7eb:	e8 be d2 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c7f0:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e9c7f7:	00 
  e9c7f8:	e8 89 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c7fd:	31 ff                	xor    edi,edi
  e9c7ff:	e8 82 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c804:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c80a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e9c811:	e8 70 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c816:	48 8d 35 13 0b 5a ff 	lea    rsi,[rip+0xffffffffff5a0b13]        # 43d330 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2f3c>
  e9c81d:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9c824:	00 
  e9c825:	e8 16 17 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e9c82a:	6a 50                	push   0x50
  e9c82c:	5f                   	pop    rdi
  e9c82d:	e8 ce 16 95 00       	call   17edf00 <_Znwm@plt>
  e9c832:	49 89 c4             	mov    r12,rax
  e9c835:	49 89 c5             	mov    r13,rax
  e9c838:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c83c:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
  e9c843:	48 8d 05 7e 4b 99 00 	lea    rax,[rip+0x994b7e]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c84a:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e9c84e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9c855:	00 
  e9c856:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
  e9c85d:	00 
  e9c85e:	6a 01                	push   0x1
  e9c860:	5a                   	pop    rdx
  e9c861:	e8 f2 ab c0 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  e9c866:	4c 8b bc 24 30 13 00 	mov    r15,QWORD PTR [rsp+0x1330]
  e9c86d:	00 
  e9c86e:	48 8b 9c 24 10 13 00 	mov    rbx,QWORD PTR [rsp+0x1310]
  e9c875:	00 
  e9c876:	48 8d 05 3b 0c 9a 00 	lea    rax,[rip+0x9a0c3b]        # 183d4b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf450>
  e9c87d:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  e9c881:	0f 28 84 24 50 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x550]
  e9c888:	00 
  e9c889:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
  e9c88e:	48 8b 84 24 60 05 00 	mov    rax,QWORD PTR [rsp+0x560]
  e9c895:	00 
  e9c896:	49 89 45 30          	mov    QWORD PTR [r13+0x30],rax
  e9c89a:	66 0f ef c9          	pxor   xmm1,xmm1
  e9c89e:	66 0f 7f 8c 24 50 05 	movdqa XMMWORD PTR [rsp+0x550],xmm1
  e9c8a5:	00 00 
  e9c8a7:	48 83 a4 24 60 05 00 	and    QWORD PTR [rsp+0x560],0x0
  e9c8ae:	00 00 
  e9c8b0:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
  e9c8b7:	00 
  e9c8b8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
  e9c8bd:	f3 41 0f 7f 45 38    	movdqu XMMWORD PTR [r13+0x38],xmm0
  e9c8c3:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
  e9c8c7:	49 89 45 48          	mov    QWORD PTR [r13+0x48],rax
  e9c8cb:	66 41 0f 7f 0e       	movdqa XMMWORD PTR [r14],xmm1
  e9c8d0:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  e9c8d5:	4c 89 f7             	mov    rdi,r14
  e9c8d8:	e8 0b ed bd ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  e9c8dd:	31 ff                	xor    edi,edi
  e9c8df:	e8 38 1b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c8e4:	48 8b 84 24 38 13 00 	mov    rax,QWORD PTR [rsp+0x1338]
  e9c8eb:	00 
  e9c8ec:	49 89 06             	mov    QWORD PTR [r14],rax
  e9c8ef:	48 8d ac 24 80 07 00 	lea    rbp,[rsp+0x780]
  e9c8f6:	00 
  e9c8f7:	48 8d b4 24 10 06 00 	lea    rsi,[rsp+0x610]
  e9c8fe:	00 
  e9c8ff:	48 89 ef             	mov    rdi,rbp
  e9c902:	e8 f1 c8 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9c907:	48 8b 84 24 00 13 00 	mov    rax,QWORD PTR [rsp+0x1300]
  e9c90e:	00 
  e9c90f:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
  e9c913:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
  e9c917:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
  e9c91e:	00 
  e9c91f:	48 89 de             	mov    rsi,rbx
  e9c922:	e8 97 f3 c2 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e9c927:	4c 8b b4 24 50 13 00 	mov    r14,QWORD PTR [rsp+0x1350]
  e9c92e:	00 
  e9c92f:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
  e9c936:	00 
  e9c937:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
  e9c93e:	00 
  e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
  e9c944:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
  e9c94b:	00 
  e9c94c:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]
  e9c953:	00 
  e9c954:	e8 13 9a 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e9c959:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
  e9c960:	00 
  e9c961:	48 8d b4 24 b0 05 00 	lea    rsi,[rsp+0x5b0]
  e9c968:	00 
  e9c969:	e8 42 9a 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
  e9c96e:	48 8d 9c 24 60 08 00 	lea    rbx,[rsp+0x860]
  e9c975:	00 
  e9c976:	48 8d b4 24 80 05 00 	lea    rsi,[rsp+0x580]
  e9c97d:	00 
  e9c97e:	48 89 df             	mov    rdi,rbx
  e9c981:	e8 62 c5 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
  e9c986:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
  e9c98d:	00 
  e9c98e:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
  e9c992:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
  e9c999:	00 
  e9c99a:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
  e9c99e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  e9c9a3:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
  e9c9a7:	4c 89 73 48          	mov    QWORD PTR [rbx+0x48],r14
  e9c9ab:	48 8b 8c 24 70 12 00 	mov    rcx,QWORD PTR [rsp+0x1270]
  e9c9b2:	00 
  e9c9b3:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9c9b7:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
  e9c9bb:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
  e9c9c0:	48 85 c0             	test   rax,rax
  e9c9c3:	4c 8b b4 24 80 00 00 	mov    r14,QWORD PTR [rsp+0x80]
  e9c9ca:	00 
  e9c9cb:	4c 8b bc 24 b8 00 00 	mov    r15,QWORD PTR [rsp+0xb8]
  e9c9d2:	00 
  e9c9d3:	74 05                	je     e9c9da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63df0>
  e9c9d5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c9da:	48 8d bc 24 c0 08 00 	lea    rdi,[rsp+0x8c0]
  e9c9e1:	00 
  e9c9e2:	48 8d b4 24 d0 06 00 	lea    rsi,[rsp+0x6d0]
  e9c9e9:	00 
  e9c9ea:	e8 3d c5 05 00       	call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>
  e9c9ef:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
  e9c9f4:	66 48 0f 6e c0       	movq   xmm0,rax
  e9c9f9:	f3 0f 7e 4c 24 70    	movq   xmm1,QWORD PTR [rsp+0x70]
  e9c9ff:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9ca03:	48 83 c0 08          	add    rax,0x8
  e9ca07:	48 8d bc 24 80 09 00 	lea    rdi,[rsp+0x980]
  e9ca0e:	00 
  e9ca0f:	66 0f 7f 4f e0       	movdqa XMMWORD PTR [rdi-0x20],xmm1
  e9ca14:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e9ca18:	8a 44 24 27          	mov    al,BYTE PTR [rsp+0x27]
  e9ca1c:	88 47 f0             	mov    BYTE PTR [rdi-0x10],al
  e9ca1f:	48 8d b4 24 a0 0e 00 	lea    rsi,[rsp+0xea0]
  e9ca26:	00 
  e9ca27:	e8 64 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ca2c:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
  e9ca31:	66 48 0f 6e c0       	movq   xmm0,rax
  e9ca36:	f3 0f 7e 8c 24 30 01 	movq   xmm1,QWORD PTR [rsp+0x130]
  e9ca3d:	00 00 
  e9ca3f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9ca43:	48 8d bc 24 c0 09 00 	lea    rdi,[rsp+0x9c0]
  e9ca4a:	00 
  e9ca4b:	66 0f 7f 4f f0       	movdqa XMMWORD PTR [rdi-0x10],xmm1
  e9ca50:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9ca55:	48 8d b4 24 00 0d 00 	lea    rsi,[rsp+0xd00]
  e9ca5c:	00 
  e9ca5d:	e8 2e d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ca62:	48 8d bc 24 f0 09 00 	lea    rdi,[rsp+0x9f0]
  e9ca69:	00 
  e9ca6a:	48 8d b4 24 e0 03 00 	lea    rsi,[rsp+0x3e0]
  e9ca71:	00 
  e9ca72:	e8 19 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ca77:	66 49 0f 6e cf       	movq   xmm1,r15
  e9ca7c:	f3 0f 7e 84 24 40 01 	movq   xmm0,QWORD PTR [rsp+0x140]
  e9ca83:	00 00 
  e9ca85:	48 8b 8c 24 40 13 00 	mov    rcx,QWORD PTR [rsp+0x1340]
  e9ca8c:	00 
  e9ca8d:	0f 28 54 24 40       	movaps xmm2,XMMWORD PTR [rsp+0x40]
  e9ca92:	0f 29 94 24 20 0a 00 	movaps XMMWORD PTR [rsp+0xa20],xmm2
  e9ca99:	00 
  e9ca9a:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
  e9caa1:	00 
  e9caa2:	48 85 c0             	test   rax,rax
  e9caa5:	74 05                	je     e9caac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63ec2>
  e9caa7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9caac:	49 83 c7 08          	add    r15,0x8
  e9cab0:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  e9cab4:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9cab8:	0f 10 09             	movups xmm1,XMMWORD PTR [rcx]
  e9cabb:	0f 29 8c 24 30 0a 00 	movaps XMMWORD PTR [rsp+0xa30],xmm1
  e9cac2:	00 
  e9cac3:	48 85 c0             	test   rax,rax
  e9cac6:	74 05                	je     e9cacd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63ee3>
  e9cac8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cacd:	66 0f 7f 84 24 40 0a 	movdqa XMMWORD PTR [rsp+0xa40],xmm0
  e9cad4:	00 00 
  e9cad6:	f0 49 ff 07          	lock inc QWORD PTR [r15]
  e9cada:	48 8b 8c 24 98 12 00 	mov    rcx,QWORD PTR [rsp+0x1298]
  e9cae1:	00 
  e9cae2:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9cae6:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  e9cae9:	0f 29 84 24 50 0a 00 	movaps XMMWORD PTR [rsp+0xa50],xmm0
  e9caf0:	00 
  e9caf1:	48 85 c0             	test   rax,rax
  e9caf4:	74 05                	je     e9cafb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63f11>
  e9caf6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cafb:	48 8b 84 24 a0 12 00 	mov    rax,QWORD PTR [rsp+0x12a0]
  e9cb02:	00 
  e9cb03:	0f 28 44 24 60       	movaps xmm0,XMMWORD PTR [rsp+0x60]
  e9cb08:	0f 29 84 24 60 0a 00 	movaps XMMWORD PTR [rsp+0xa60],xmm0
  e9cb0f:	00 
  e9cb10:	48 8b 8c 24 28 01 00 	mov    rcx,QWORD PTR [rsp+0x128]
  e9cb17:	00 
  e9cb18:	48 85 c9             	test   rcx,rcx
  e9cb1b:	74 05                	je     e9cb22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63f38>
  e9cb1d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e9cb22:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
  e9cb26:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e9cb29:	0f 29 84 24 70 0a 00 	movaps XMMWORD PTR [rsp+0xa70],xmm0
  e9cb30:	00 
  e9cb31:	48 85 c9             	test   rcx,rcx
  e9cb34:	74 05                	je     e9cb3b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63f51>
  e9cb36:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e9cb3b:	48 8b 8c 24 70 13 00 	mov    rcx,QWORD PTR [rsp+0x1370]
  e9cb42:	00 
  e9cb43:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9cb47:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  e9cb4a:	0f 29 84 24 80 0a 00 	movaps XMMWORD PTR [rsp+0xa80],xmm0
  e9cb51:	00 
  e9cb52:	48 85 c0             	test   rax,rax
  e9cb55:	74 05                	je     e9cb5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63f72>
  e9cb57:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cb5c:	48 8b 84 24 a8 12 00 	mov    rax,QWORD PTR [rsp+0x12a8]
  e9cb63:	00 
  e9cb64:	48 8b 94 24 58 12 00 	mov    rdx,QWORD PTR [rsp+0x1258]
  e9cb6b:	00 
  e9cb6c:	48 8b 4a 08          	mov    rcx,QWORD PTR [rdx+0x8]
  e9cb70:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
  e9cb73:	0f 29 84 24 90 0a 00 	movaps XMMWORD PTR [rsp+0xa90],xmm0
  e9cb7a:	00 
  e9cb7b:	48 85 c9             	test   rcx,rcx
  e9cb7e:	74 05                	je     e9cb85 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63f9b>
  e9cb80:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  e9cb85:	66 49 0f 6e ce       	movq   xmm1,r14
  e9cb8a:	f3 0f 7e 84 24 48 01 	movq   xmm0,QWORD PTR [rsp+0x148]
  e9cb91:	00 00 
  e9cb93:	48 8b 94 24 78 13 00 	mov    rdx,QWORD PTR [rsp+0x1378]
  e9cb9a:	00 
  e9cb9b:	48 8b 8c 24 28 13 00 	mov    rcx,QWORD PTR [rsp+0x1328]
  e9cba2:	00 
  e9cba3:	40 8a 74 24 26       	mov    sil,BYTE PTR [rsp+0x26]
  e9cba8:	40 88 b4 24 a0 0a 00 	mov    BYTE PTR [rsp+0xaa0],sil
  e9cbaf:	00 
  e9cbb0:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
  e9cbb4:	f3 0f 6f 10          	movdqu xmm2,XMMWORD PTR [rax]
  e9cbb8:	f3 0f 7f 94 24 a8 0a 	movdqu XMMWORD PTR [rsp+0xaa8],xmm2
  e9cbbf:	00 00 
  e9cbc1:	48 85 f6             	test   rsi,rsi
  e9cbc4:	74 05                	je     e9cbcb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63fe1>
  e9cbc6:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
  e9cbcb:	48 8b 84 24 c8 12 00 	mov    rax,QWORD PTR [rsp+0x12c8]
  e9cbd2:	00 
  e9cbd3:	49 83 c6 08          	add    r14,0x8
  e9cbd7:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  e9cbdb:	49 83 c4 18          	add    r12,0x18
  e9cbdf:	48 89 94 24 b8 0a 00 	mov    QWORD PTR [rsp+0xab8],rdx
  e9cbe6:	00 
  e9cbe7:	48 8b 51 08          	mov    rdx,QWORD PTR [rcx+0x8]
  e9cbeb:	f3 0f 6f 09          	movdqu xmm1,XMMWORD PTR [rcx]
  e9cbef:	66 0f 7f 8c 24 c0 0a 	movdqa XMMWORD PTR [rsp+0xac0],xmm1
  e9cbf6:	00 00 
  e9cbf8:	48 85 d2             	test   rdx,rdx
  e9cbfb:	74 05                	je     e9cc02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x64018>
  e9cbfd:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9cc02:	48 8b 8c 24 d0 12 00 	mov    rcx,QWORD PTR [rsp+0x12d0]
  e9cc09:	00 
  e9cc0a:	4c 89 a4 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],r12
  e9cc11:	00 
  e9cc12:	4c 89 ac 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],r13
  e9cc19:	00 
  e9cc1a:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  e9cc1f:	66 0f 7f 84 24 e0 0a 	movdqa XMMWORD PTR [rsp+0xae0],xmm0
  e9cc26:	00 00 
  e9cc28:	f0 49 ff 06          	lock inc QWORD PTR [r14]
  e9cc2c:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
  e9cc30:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e9cc33:	0f 29 84 24 f0 0a 00 	movaps XMMWORD PTR [rsp+0xaf0],xmm0
  e9cc3a:	00 
  e9cc3b:	48 85 d2             	test   rdx,rdx
  e9cc3e:	74 05                	je     e9cc45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6405b>
  e9cc40:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9cc45:	48 8b 84 24 d8 12 00 	mov    rax,QWORD PTR [rsp+0x12d8]
  e9cc4c:	00 
  e9cc4d:	48 8b 51 08          	mov    rdx,QWORD PTR [rcx+0x8]
  e9cc51:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  e9cc54:	0f 29 84 24 00 0b 00 	movaps XMMWORD PTR [rsp+0xb00],xmm0
  e9cc5b:	00 
  e9cc5c:	48 85 d2             	test   rdx,rdx
  e9cc5f:	74 05                	je     e9cc66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6407c>
  e9cc61:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9cc66:	48 8b 8c 24 e0 12 00 	mov    rcx,QWORD PTR [rsp+0x12e0]
  e9cc6d:	00 
  e9cc6e:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
  e9cc72:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
  e9cc75:	0f 29 84 24 10 0b 00 	movaps XMMWORD PTR [rsp+0xb10],xmm0
  e9cc7c:	00 
  e9cc7d:	48 85 d2             	test   rdx,rdx
  e9cc80:	74 05                	je     e9cc87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6409d>
  e9cc82:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9cc87:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  e9cc8b:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
  e9cc8f:	66 0f 7f 84 24 20 0b 	movdqa XMMWORD PTR [rsp+0xb20],xmm0
  e9cc96:	00 00 
  e9cc98:	48 85 c0             	test   rax,rax
  e9cc9b:	74 05                	je     e9cca2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x640b8>
  e9cc9d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9cca2:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
  e9cca9:	00 00 
  e9ccab:	bf d0 03 00 00       	mov    edi,0x3d0
  e9ccb0:	e8 4b 12 95 00       	call   17edf00 <_Znwm@plt>
  e9ccb5:	49 89 c4             	mov    r12,rax
  e9ccb8:	4c 8d bc 24 b0 07 00 	lea    r15,[rsp+0x7b0]
  e9ccbf:	00 
  e9ccc0:	48 89 84 24 30 0b 00 	mov    QWORD PTR [rsp+0xb30],rax
  e9ccc7:	00 
  e9ccc8:	48 8d 84 24 20 05 00 	lea    rax,[rsp+0x520]
  e9cccf:	00 
  e9ccd0:	48 89 84 24 38 0b 00 	mov    QWORD PTR [rsp+0xb38],rax
  e9ccd7:	00 
  e9ccd8:	48 c7 84 24 40 0b 00 	mov    QWORD PTR [rsp+0xb40],0x1
  e9ccdf:	00 01 00 00 00 
  e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
  e9cceb:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e9ccef:	49 8b 47 c0          	mov    rax,QWORD PTR [r15-0x40]
  e9ccf3:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
  e9ccf8:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
  e9ccfd:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
  e9cd02:	48 89 ee             	mov    rsi,rbp
  e9cd05:	e8 ee c4 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9cd0a:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
  e9cd0e:	41 0f 29 44 24 50    	movaps XMMWORD PTR [r12+0x50],xmm0
  e9cd14:	41 0f 28 47 10       	movaps xmm0,XMMWORD PTR [r15+0x10]
  e9cd19:	41 0f 11 44 24 60    	movups XMMWORD PTR [r12+0x60],xmm0
  e9cd1f:	0f                   	.byte 0xf

## rsp+0x770 / rsp+0x1338 / alias-related instructions
  e9b159:	e8 e2 2d 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e9b15e:	48 8d ac 24 30 0b 00 	lea    rbp,[rsp+0xb30]
  e9b165:	00 
  e9b166:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9b16d:	00 
  e9b16e:	48 89 ef             	mov    rdi,rbp
  e9b171:	e8 9c dc ce ff       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
  e9b176:	4c 8d ac 24 d0 0e 00 	lea    r13,[rsp+0xed0]
  e9b17d:	00 
  e9b17e:	4c 8d b4 24 00 0d 00 	lea    r14,[rsp+0xd00]
  e9b185:	00 
  e9b186:	4c 89 ef             	mov    rdi,r13
  e9b189:	4c 89 f6             	mov    rsi,r14
  e9b18c:	e8 c5 dc ce ff       	call   b88e56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5df6>
  e9b191:	4c 8d a4 24 70 07 00 	lea    r12,[rsp+0x770]
  e9b198:	00 
  e9b199:	4c 8d bc 24 d0 0c 00 	lea    r15,[rsp+0xcd0]
  e9b1a0:	00 
  e9b1a1:	4c 89 e7             	mov    rdi,r12
  e9b1a4:	4c 89 fe             	mov    rsi,r15
  e9b1a7:	48 89 ea             	mov    rdx,rbp
  e9b1aa:	4c 89 e9             	mov    rcx,r13
  e9b1ad:	e8 94 cf ce ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
  e9b1b2:	4c 89 ef             	mov    rdi,r13
  e9b1b5:	e8 b0 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b1ba:	48 89 ef             	mov    rdi,rbp
  e9b1bd:	e8 a8 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b1c2:	4c 89 ff             	mov    rdi,r15
  e9b1c5:	e8 c6 2c 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9b1ca:	4c 89 f7             	mov    rdi,r14
  e9b1cd:	e8 98 ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b1d2:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9b1d9:	00 
  e9b1da:	e8 8b ed bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b1df:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
  e9b1e6:	00 
  e9b1e7:	4c 89 e6             	mov    rsi,r12
  e9b1ea:	e8 09 3f ff ff       	call   e8f0f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5650e>
  e9b1ef:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b1f6:	00 
  e9b1f7:	e8 72 d0 ce ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
  e9b1fc:	48 89 df             	mov    rdi,rbx
  e9b1ff:	e8 82 32 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9b204:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9b209:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e9b210:	00 
  e9b211:	48 8b 84 24 60 13 00 	mov    rax,QWORD PTR [rsp+0x1360]
  e9b218:	00 
  e9b219:	48 8b 8c 24 18 13 00 	mov    rcx,QWORD PTR [rsp+0x1318]
  e9b220:	00 
  e9b221:	4c 8b 84 24 00 13 00 	mov    r8,QWORD PTR [rsp+0x1300]
  e9b228:	00 
  e9b229:	48 8b 9c 24 f8 12 00 	mov    rbx,QWORD PTR [rsp+0x12f8]
  e9b230:	00 
  e9b231:	48 8b b4 24 f0 12 00 	mov    rsi,QWORD PTR [rsp+0x12f0]
  e9b238:	00 
  e9b239:	48 8d 15 e0 63 99 00 	lea    rdx,[rip+0x9963e0]        # 1831620 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x35b8>
  e9b240:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
  e9b247:	00 
  e9b248:	48 89 17             	mov    QWORD PTR [rdi],rdx
  e9b24b:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
--
  e9b3f3:	e8 92 bf 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b3f8:	4c 89 e9             	mov    rcx,r13
  e9b3fb:	41 89 c5             	mov    r13d,eax
  e9b3fe:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  e9b401:	e8 48 b0 00 00       	call   ea644e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d864>
  e9b406:	48 63 db             	movsxd rbx,ebx
  e9b409:	4c 63 fd             	movsxd r15,ebp
  e9b40c:	4d 63 e6             	movsxd r12,r14d
  e9b40f:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9b415:	66 48 0f 7e c5       	movq   rbp,xmm0
  e9b41a:	45 0f b6 f5          	movzx  r14d,r13b
  e9b41e:	84 c0                	test   al,al
  e9b420:	74 4a                	je     e9b46c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62882>
  e9b422:	44 89 34 24          	mov    DWORD PTR [rsp],r14d
  e9b426:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b42d:	00 
  e9b42e:	48 89 ee             	mov    rsi,rbp
  e9b431:	48 8b 94 24 90 00 00 	mov    rdx,QWORD PTR [rsp+0x90]
  e9b438:	00 
  e9b439:	48 89 d9             	mov    rcx,rbx
  e9b43c:	4d 89 f8             	mov    r8,r15
  e9b43f:	4d 89 e1             	mov    r9,r12
  e9b442:	e8 8a 1d 3f 00       	call   128d1d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd2755>
  e9b447:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b44e:	00 
  e9b44f:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9b456:	00 
  e9b457:	6a 60                	push   0x60
  e9b459:	5a                   	pop    rdx
  e9b45a:	e8 df fa 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b45f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b466:	00 
  e9b467:	e8 fe ea bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b46c:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e9b473:	00 
  e9b474:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b478:	48 8d 35 f4 7d 53 ff 	lea    rsi,[rip+0xffffffffff537df4]        # 3d3273 <_ZTSN5boost17bad_function_callE@@Base+0x5b9>
  e9b47f:	48 8d 0d fa 7d 53 ff 	lea    rcx,[rip+0xffffffffff537dfa]        # 3d3280 <_ZTSN5boost17bad_function_callE@@Base+0x5c6>
  e9b486:	6a 0b                	push   0xb
  e9b488:	5a                   	pop    rdx
  e9b489:	6a 2a                	push   0x2a
  e9b48b:	41 58                	pop    r8
  e9b48d:	45 31 c9             	xor    r9d,r9d
  e9b490:	e8 f5 be 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b495:	84 c0                	test   al,al
  e9b497:	74 4a                	je     e9b4e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x628f9>
  e9b499:	44 89 34 24          	mov    DWORD PTR [rsp],r14d
  e9b49d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b4a4:	00 
  e9b4a5:	48 89 ee             	mov    rsi,rbp
  e9b4a8:	48 8b 94 24 90 00 00 	mov    rdx,QWORD PTR [rsp+0x90]
  e9b4af:	00 
  e9b4b0:	48 89 d9             	mov    rcx,rbx
  e9b4b3:	4d 89 f8             	mov    r8,r15
  e9b4b6:	4d 89 e1             	mov    r9,r12
  e9b4b9:	e8 13 1d 3f 00       	call   128d1d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd2755>
  e9b4be:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b4c5:	00 
  e9b4c6:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9b4cd:	00 
  e9b4ce:	6a 1f                	push   0x1f
  e9b4d0:	5a                   	pop    rdx
  e9b4d1:	e8 68 fa 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b4d6:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b4dd:	00 
  e9b4de:	e8 87 ea bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b4e3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b4e7:	e8 80 af 00 00       	call   ea646c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d882>
  e9b4ec:	84 c0                	test   al,al
  e9b4ee:	74 41                	je     e9b531 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62947>
  e9b4f0:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
  e9b4f7:	00 
  e9b4f8:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e9b4fb:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
  e9b4ff:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b506:	00 
  e9b507:	e8 b5 b3 14 00       	call   fe68c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1adcd7>
  e9b50c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b513:	00 
  e9b514:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9b51b:	00 
  e9b51c:	6a 60                	push   0x60
  e9b51e:	5a                   	pop    rdx
  e9b51f:	e8 1a fa 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b524:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b52b:	00 
  e9b52c:	e8 39 ea bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b531:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b535:	48 8d 35 7c 7e 53 ff 	lea    rsi,[rip+0xffffffffff537e7c]        # 3d33b8 <_ZTSN5boost17bad_function_callE@@Base+0x6fe>
  e9b53c:	48 8d 0d 8d 7e 53 ff 	lea    rcx,[rip+0xffffffffff537e8d]        # 3d33d0 <_ZTSN5boost17bad_function_callE@@Base+0x716>
  e9b543:	6a 0b                	push   0xb
  e9b545:	5a                   	pop    rdx
  e9b546:	6a 2f                	push   0x2f
  e9b548:	41 58                	pop    r8
  e9b54a:	45 31 c9             	xor    r9d,r9d
  e9b54d:	e8 38 be 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b552:	84 c0                	test   al,al
  e9b554:	74 41                	je     e9b597 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x629ad>
  e9b556:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
  e9b55d:	00 
  e9b55e:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e9b561:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
  e9b565:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b56c:	00 
  e9b56d:	e8 4f b3 14 00       	call   fe68c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1adcd7>
  e9b572:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b579:	00 
  e9b57a:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9b581:	00 
  e9b582:	6a 1d                	push   0x1d
  e9b584:	5a                   	pop    rdx
  e9b585:	e8 b4 f9 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b58a:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b591:	00 
  e9b592:	e8 d3 e9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b597:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b59b:	e8 ea ae 00 00       	call   ea648a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d8a0>
  e9b5a0:	84 c0                	test   al,al
  e9b5a2:	0f 84 94 00 00 00    	je     e9b63c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62a52>
  e9b5a8:	48 8b 84 24 90 12 00 	mov    rax,QWORD PTR [rsp+0x1290]
  e9b5af:	00 
  e9b5b0:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e9b5b4:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
  e9b5ba:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  e9b5be:	48 85 db             	test   rbx,rbx
  e9b5c1:	74 05                	je     e9b5c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x629de>
  e9b5c3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9b5c8:	48 83 a4 24 90 07 00 	and    QWORD PTR [rsp+0x790],0x0
  e9b5cf:	00 00 
  e9b5d1:	6a 28                	push   0x28
  e9b5d3:	5f                   	pop    rdi
  e9b5d4:	e8 27 29 95 00       	call   17edf00 <_Znwm@plt>
  e9b5d9:	48 8d 0d 40 93 9a 00 	lea    rcx,[rip+0x9a9340]        # 1844920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1008>
  e9b5e0:	48 89 08             	mov    QWORD PTR [rax],rcx
  e9b5e3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9b5e9:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9b5ee:	48 85 db             	test   rbx,rbx
  e9b5f1:	74 05                	je     e9b5f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62a0e>
  e9b5f3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9b5f8:	48 c7 40 18 05 00 00 	mov    QWORD PTR [rax+0x18],0x5
  e9b5ff:	00 
  e9b600:	48 c7 40 20 f4 01 00 	mov    QWORD PTR [rax+0x20],0x1f4
  e9b607:	00 
  e9b608:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
  e9b60f:	00 
  e9b610:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  e9b614:	48 89 df             	mov    rdi,rbx
  e9b617:	e8 6a 2e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9b61c:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b623:	00 
  e9b624:	6a 02                	push   0x2
  e9b626:	5a                   	pop    rdx
  e9b627:	4c 89 f6             	mov    rsi,r14
  e9b62a:	e8 0f f9 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b62f:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b636:	00 
  e9b637:	e8 2e e9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b63c:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b640:	48 8d 35 f0 7d 53 ff 	lea    rsi,[rip+0xffffffffff537df0]        # 3d3437 <_ZTSN5boost17bad_function_callE@@Base+0x77d>
  e9b647:	48 8d 0d 02 7e 53 ff 	lea    rcx,[rip+0xffffffffff537e02]        # 3d3450 <_ZTSN5boost17bad_function_callE@@Base+0x796>
  e9b64e:	6a 0b                	push   0xb
  e9b650:	5a                   	pop    rdx
  e9b651:	6a 1d                	push   0x1d
  e9b653:	41 58                	pop    r8
  e9b655:	45 31 c9             	xor    r9d,r9d
  e9b658:	e8 2d bd 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b65d:	84 c0                	test   al,al
  e9b65f:	0f 84 4f 01 00 00    	je     e9b7b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62bca>
  e9b665:	bf 48 01 00 00       	mov    edi,0x148
  e9b66a:	e8 91 28 95 00       	call   17edf00 <_Znwm@plt>
  e9b66f:	48 89 c3             	mov    rbx,rax
  e9b672:	66 0f ef c0          	pxor   xmm0,xmm0
  e9b676:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9b67b:	48 8d 05 ee 90 99 00 	lea    rax,[rip+0x9990ee]        # 1834770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6708>
  e9b682:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9b685:	49 89 dc             	mov    r12,rbx
  e9b688:	49 83 c4 18          	add    r12,0x18
--
  e9b734:	6a 28                	push   0x28
  e9b736:	5f                   	pop    rdi
  e9b737:	e8 c4 27 95 00       	call   17edf00 <_Znwm@plt>
  e9b73c:	48 8d 8c 24 70 10 00 	lea    rcx,[rsp+0x1070]
  e9b743:	00 
  e9b744:	48 8d 15 5d 90 99 00 	lea    rdx,[rip+0x99905d]        # 18347a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6740>
  e9b74b:	48 89 10             	mov    QWORD PTR [rax],rdx
  e9b74e:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
  e9b752:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
  e9b756:	66 0f ef c0          	pxor   xmm0,xmm0
  e9b75a:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
  e9b75f:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
  e9b763:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
  e9b767:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
  e9b76b:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
  e9b772:	00 
  e9b773:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  e9b777:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9b77e:	00 
  e9b77f:	e8 8c 73 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e9b784:	4c 89 ff             	mov    rdi,r15
  e9b787:	e8 fa 2c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9b78c:	48 89 df             	mov    rdi,rbx
  e9b78f:	e8 f2 2c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9b794:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9b79b:	00 
  e9b79c:	6a 3c                	push   0x3c
  e9b79e:	5a                   	pop    rdx
  e9b79f:	4c 89 f6             	mov    rsi,r14
  e9b7a2:	e8 97 f7 3e 00       	call   128af3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd04c2>
  e9b7a7:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b7ae:	00 
  e9b7af:	e8 b6 e7 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b7b4:	48 8b 84 24 50 05 00 	mov    rax,QWORD PTR [rsp+0x550]
  e9b7bb:	00 
  e9b7bc:	48 3b 84 24 58 05 00 	cmp    rax,QWORD PTR [rsp+0x558]
  e9b7c3:	00 
  e9b7c4:	74 50                	je     e9b816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62c2c>
  e9b7c6:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9b7cd:	00 
  e9b7ce:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
  e9b7d5:	00 
  e9b7d6:	e8 09 f9 3e 00       	call   128b0e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd0668>
  e9b7db:	eb 42                	jmp    e9b81f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62c35>
  e9b7dd:	48 8d 35 13 ac 59 ff 	lea    rsi,[rip+0xffffffffff59ac13]        # 4363f7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5be46>
  e9b7e4:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b7eb:	00 
  e9b7ec:	e8 5e 00 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e9b7f1:	84 c0                	test   al,al
  e9b7f3:	0f 84 14 01 00 00    	je     e9b90d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d23>
  e9b7f9:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b800:	00 
  e9b801:	e8 2a b5 c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e9b806:	6a 02                	push   0x2
  e9b808:	58                   	pop    rax
  e9b809:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e9b80e:	45 31 ed             	xor    r13d,r13d
  e9b811:	e9 f0 ea ff ff       	jmp    e9a306 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6171c>
  e9b816:	48 83 a4 24 50 0b 00 	and    QWORD PTR [rsp+0xb50],0x0
  e9b81d:	00 00 
  e9b81f:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e9b823:	e8 80 aa 00 00       	call   ea62a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d6be>
  e9b828:	84 c0                	test   al,al
  e9b82a:	0f 84 85 00 00 00    	je     e9b8b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62ccb>
  e9b830:	48 8d 35 45 67 5b ff 	lea    rsi,[rip+0xffffffffff5b6745]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  e9b837:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9b83e:	00 
  e9b83f:	e8 3a e2 bd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e9b844:	48 8b 84 24 78 12 00 	mov    rax,QWORD PTR [rsp+0x1278]
  e9b84b:	00 
  e9b84c:	48 8b 30             	mov    rsi,QWORD PTR [rax]
  e9b84f:	48 8d 15 aa 3e b5 00 	lea    rdx,[rip+0xb53eaa]        # 19ef700 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xe30>
  e9b856:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9b85d:	00 
  e9b85e:	48 8d 8c 24 60 10 00 	lea    rcx,[rsp+0x1060]
  e9b865:	00 
  e9b866:	48 89 df             	mov    rdi,rbx
  e9b869:	e8 82 77 77 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
  e9b86e:	48 89 df             	mov    rdi,rbx
  e9b871:	e8 ae 32 83 00       	call   16ceb24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x82c90>
  e9b876:	89 c3                	mov    ebx,eax
  e9b878:	6a 40                	push   0x40
  e9b87a:	5f                   	pop    rdi
  e9b87b:	e8 80 26 95 00       	call   17edf00 <_Znwm@plt>
  e9b880:	49 89 c5             	mov    r13,rax
  e9b883:	0f b6 f3             	movzx  esi,bl
  e9b886:	48 8d 94 24 30 0b 00 	lea    rdx,[rsp+0xb30]
  e9b88d:	00 
  e9b88e:	48 89 c7             	mov    rdi,rax
  e9b891:	e8 34 2e 3f 00       	call   128e6ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd3c4e>
  e9b896:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b89d:	00 
  e9b89e:	e8 ed 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9b8a3:	48 8d bc 24 60 10 00 	lea    rdi,[rsp+0x1060]
  e9b8aa:	00 
  e9b8ab:	e8 e0 25 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e9b8b0:	e9 0b 01 00 00       	jmp    e9b9c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62dd6>
  e9b8b5:	6a 40                	push   0x40
  e9b8b7:	5f                   	pop    rdi
  e9b8b8:	e8 43 26 95 00       	call   17edf00 <_Znwm@plt>
  e9b8bd:	48 89 c3             	mov    rbx,rax
  e9b8c0:	49 89 c5             	mov    r13,rax
  e9b8c3:	48 8d 05 c6 58 9c 00 	lea    rax,[rip+0x9c58c6]        # 1861190 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d878>
  e9b8ca:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9b8cd:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
  e9b8d2:	48 83 bc 24 50 0b 00 	cmp    QWORD PTR [rsp+0xb50],0x0
  e9b8d9:	00 00 
  e9b8db:	74 60                	je     e9b93d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d53>
  e9b8dd:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b8e4:	00 
  e9b8e5:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9b8ec:	00 
  e9b8ed:	e8 08 f6 3e 00       	call   128aefa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd047e>
  e9b8f2:	49 8b 7d 30          	mov    rdi,QWORD PTR [r13+0x30]
  e9b8f6:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
  e9b8fa:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
  e9b8ff:	4c 39 ff             	cmp    rdi,r15
  e9b902:	74 63                	je     e9b967 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d7d>
  e9b904:	48 85 ff             	test   rdi,rdi
  e9b907:	74 67                	je     e9b970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d86>
  e9b909:	6a 05                	push   0x5
  e9b90b:	eb 5c                	jmp    e9b969 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d7f>
  e9b90d:	48 8d 35 e2 74 49 ff 	lea    rsi,[rip+0xffffffffff4974e2]        # 332df6 <_ZTSSt12bad_any_cast@@Base-0x5d3d2>
  e9b914:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b91b:	00 
  e9b91c:	e8 2e ff bd ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e9b921:	84 c0                	test   al,al
  e9b923:	0f 84 4d 38 00 00    	je     e9f176 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6658c>
  e9b929:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b930:	00 
  e9b931:	e8 fa b3 c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e9b936:	6a 03                	push   0x3
  e9b938:	e9 95 e9 ff ff       	jmp    e9a2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x616e8>
  e9b93d:	48 8d 05 84 c9 a0 00 	lea    rax,[rip+0xa0c984]        # 18a82c8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x15208>
  e9b944:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9b94b:	00 
  e9b94c:	48 8d 84 24 70 07 00 	lea    rax,[rsp+0x770]
  e9b953:	00 
  e9b954:	48 89 84 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rax
  e9b95b:	00 
  e9b95c:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
  e9b960:	49 83 65 30 00       	and    QWORD PTR [r13+0x30],0x0
  e9b965:	eb 09                	jmp    e9b970 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62d86>
  e9b967:	6a 04                	push   0x4
  e9b969:	58                   	pop    rax
  e9b96a:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  e9b96d:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
  e9b970:	48 83 c3 30          	add    rbx,0x30
  e9b974:	48 8b 84 24 90 07 00 	mov    rax,QWORD PTR [rsp+0x790]
  e9b97b:	00 
  e9b97c:	48 85 c0             	test   rax,rax
  e9b97f:	74 18                	je     e9b999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62daf>
  e9b981:	48 8d 8c 24 70 07 00 	lea    rcx,[rsp+0x770]
  e9b988:	00 
  e9b989:	48 39 c8             	cmp    rax,rcx
  e9b98c:	74 11                	je     e9b99f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62db5>
  e9b98e:	48 89 03             	mov    QWORD PTR [rbx],rax
  e9b991:	48 8d 9c 24 90 07 00 	lea    rbx,[rsp+0x790]
  e9b998:	00 
  e9b999:	48 83 23 00          	and    QWORD PTR [rbx],0x0
  e9b99d:	eb 14                	jmp    e9b9b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x62dc9>
  e9b99f:	4c 89 3b             	mov    QWORD PTR [rbx],r15
  e9b9a2:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b9a9:	00 
  e9b9aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  e9b9ad:	4c 89 fe             	mov    rsi,r15
  e9b9b0:	ff 50 18             	call   QWORD PTR [rax+0x18]
  e9b9b3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9b9ba:	00 
  e9b9bb:	e8 aa e5 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9b9c0:	48 8b 84 24 48 12 00 	mov    rax,QWORD PTR [rsp+0x1248]
  e9b9c7:	00 
  e9b9c8:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  e9b9cb:	48 8d 35 76 8a 53 ff 	lea    rsi,[rip+0xffffffffff538a76]        # 3d4448 <_ZTSN5boost17bad_function_callE@@Base+0x178e>
  e9b9d2:	48 8d 0d 87 8a 53 ff 	lea    rcx,[rip+0xffffffffff538a87]        # 3d4460 <_ZTSN5boost17bad_function_callE@@Base+0x17a6>
  e9b9d9:	6a 0b                	push   0xb
  e9b9db:	5a                   	pop    rdx
  e9b9dc:	6a 20                	push   0x20
  e9b9de:	41 58                	pop    r8
  e9b9e0:	45 31 c9             	xor    r9d,r9d
  e9b9e3:	e8 a2 b9 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e9b9e8:	89 c3                	mov    ebx,eax
  e9b9ea:	e8 41 37 95 00       	call   17ef130 <_ZNSt6__ndk16thread20hardware_concurrencyEv@plt>
  e9b9ef:	89 c5                	mov    ebp,eax
  e9b9f1:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
  e9b9f8:	00 
  e9b9f9:	e8 2e 66 06 00       	call   f0202c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9442>
  e9b9fe:	66 0f 6f 84 24 20 05 	movdqa xmm0,XMMWORD PTR [rsp+0x520]
  e9ba05:	00 00 
  e9ba07:	66 0f 7f 84 24 70 07 	movdqa XMMWORD PTR [rsp+0x770],xmm0
  e9ba0e:	00 00 
  e9ba10:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]
  e9ba17:	00 
  e9ba18:	e8 44 66 06 00       	call   f02061 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc9477>
  e9ba1d:	0f 28 84 24 b0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3b0]
  e9ba24:	00 
  e9ba25:	4c 8d b4 24 90 07 00 	lea    r14,[rsp+0x790]
  e9ba2c:	00 
  e9ba2d:	41 0f 29 46 f0       	movaps XMMWORD PTR [r14-0x10],xmm0
  e9ba32:	0f 57 c0             	xorps  xmm0,xmm0
  e9ba35:	0f 29 84 24 b0 03 00 	movaps XMMWORD PTR [rsp+0x3b0],xmm0
  e9ba3c:	00 
  e9ba3d:	48 8b 84 24 70 12 00 	mov    rax,QWORD PTR [rsp+0x1270]
  e9ba44:	00 
  e9ba45:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
  e9ba49:	48 8d bc 24 00 0d 00 	lea    rdi,[rsp+0xd00]
  e9ba50:	00 
  e9ba51:	e8 40 66 06 00       	call   f02096 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc94ac>
  e9ba56:	6a 60                	push   0x60
  e9ba58:	5f                   	pop    rdi
  e9ba59:	e8 a2 24 95 00       	call   17edf00 <_Znwm@plt>
  e9ba5e:	49 89 c7             	mov    r15,rax
--
  e9bae0:	49 89 0e             	mov    QWORD PTR [r14],rcx
  e9bae3:	4d 89 f7             	mov    r15,r14
  e9bae6:	49 83 c7 18          	add    r15,0x18
  e9baea:	48 8d 0d a7 55 9c 00 	lea    rcx,[rip+0x9c55a7]        # 1861098 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d780>
  e9baf1:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
  e9baf5:	4d 89 6e 20          	mov    QWORD PTR [r14+0x20],r13
  e9baf9:	49 c7 46 28 14 00 00 	mov    QWORD PTR [r14+0x28],0x14
  e9bb00:	00 
  e9bb01:	49 c7 46 30 f4 01 00 	mov    QWORD PTR [r14+0x30],0x1f4
  e9bb08:	00 
  e9bb09:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
  e9bb0d:	41 88 5e 40          	mov    BYTE PTR [r14+0x40],bl
  e9bb11:	31 ff                	xor    edi,edi
  e9bb13:	e8 04 29 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9bb18:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9bb1f:	00 
  e9bb20:	4c 89 7e 30          	mov    QWORD PTR [rsi+0x30],r15
  e9bb24:	4c 89 76 38          	mov    QWORD PTR [rsi+0x38],r14
  e9bb28:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9bb2f:	00 
  e9bb30:	6a 04                	push   0x4
  e9bb32:	5a                   	pop    rdx
  e9bb33:	e8 de 65 06 00       	call   f02116 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc952c>
  e9bb38:	6a 20                	push   0x20
  e9bb3a:	5f                   	pop    rdi
  e9bb3b:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  e9bb40:	e8 bb 23 95 00       	call   17edf00 <_Znwm@plt>
  e9bb45:	4c 8b b4 24 98 13 00 	mov    r14,QWORD PTR [rsp+0x1398]
  e9bb4c:	00 
  e9bb4d:	48 8d 9c 24 d0 0c 00 	lea    rbx,[rsp+0xcd0]
  e9bb54:	00 
  e9bb55:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
  e9bb59:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
  e9bb5d:	66 0f ef c9          	pxor   xmm1,xmm1
  e9bb61:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
  e9bb65:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  e9bb6a:	48 8d 0d 37 52 9c 00 	lea    rcx,[rip+0x9c5237]        # 1860da8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1d490>
--
  e9bcf9:	48 8d 48 18          	lea    rcx,[rax+0x18]
  e9bcfd:	48 8d 15 fc 18 9a 00 	lea    rdx,[rip+0x9a18fc]        # 183d600 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf598>
  e9bd04:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e9bd08:	48 8b b4 24 58 12 00 	mov    rsi,QWORD PTR [rsp+0x1258]
  e9bd0f:	00 
  e9bd10:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]
  e9bd14:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
  e9bd17:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  e9bd1b:	48 85 d2             	test   rdx,rdx
  e9bd1e:	74 05                	je     e9bd25 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6313b>
  e9bd20:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
  e9bd25:	66 48 0f 6e c0       	movq   xmm0,rax
  e9bd2a:	66 48 0f 6e c9       	movq   xmm1,rcx
  e9bd2f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9bd33:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e9bd3a:	00 
  e9bd3b:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
  e9bd3f:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9bd46:	00 
  e9bd47:	48 89 de             	mov    rsi,rbx
  e9bd4a:	e8 5f dd ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9bd4f:	4c 8b b4 24 98 12 00 	mov    r14,QWORD PTR [rsp+0x1298]
  e9bd56:	00 
  e9bd57:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e9bd5e:	00 
  e9bd5f:	e8 22 27 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bd64:	31 ff                	xor    edi,edi
  e9bd66:	e8 1b 27 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bd6b:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
  e9bd6f:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  e9bd74:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
  e9bd78:	48 85 c0             	test   rax,rax
  e9bd7b:	74 0a                	je     e9bd87 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6319d>
  e9bd7d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bd82:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bd87:	6a 60                	push   0x60
  e9bd89:	5f                   	pop    rdi
  e9bd8a:	e8 71 21 95 00       	call   17edf00 <_Znwm@plt>
  e9bd8f:	49 89 c7             	mov    r15,rax
  e9bd92:	0f 57 c0             	xorps  xmm0,xmm0
  e9bd95:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9bd99:	48 8d 2d 90 18 9a 00 	lea    rbp,[rip+0x9a1890]        # 183d630 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf5c8>
  e9bda0:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9bda3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9bda9:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
  e9bdb0:	4d 85 f6             	test   r14,r14
  e9bdb3:	44 88 64 24 26       	mov    BYTE PTR [rsp+0x26],r12b
  e9bdb8:	74 15                	je     e9bdcf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631e5>
  e9bdba:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9bdbf:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
  e9bdc6:	00 00 
  e9bdc8:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9bdcd:	eb 12                	jmp    e9bde1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x631f7>
  e9bdcf:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
  e9bdd6:	00 00 
  e9bdd8:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
  e9bddf:	00 00 
  e9bde1:	4d 8d 67 20          	lea    r12,[r15+0x20]
  e9bde5:	48 8d 05 6c 14 9a 00 	lea    rax,[rip+0x9a146c]        # 183d258 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf1f0>
  e9bdec:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9bdf3:	00 
  e9bdf4:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
  e9bdfb:	00 
  e9bdfc:	4c 89 e7             	mov    rdi,r12
  e9bdff:	48 89 de             	mov    rsi,rbx
  e9be02:	e8 81 b4 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9be07:	48 89 df             	mov    rdi,rbx
  e9be0a:	e8 5b e1 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9be0f:	4c 89 f7             	mov    rdi,r14
  e9be12:	e8 6f 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9be17:	66 49 0f 6e c7       	movq   xmm0,r15
  e9be1c:	66 49 0f 6e cc       	movq   xmm1,r12
  e9be21:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9be25:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9be2b:	31 ff                	xor    edi,edi
  e9be2d:	e8 ea 25 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9be32:	4c 89 f7             	mov    rdi,r14
  e9be35:	e8 4c 26 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9be3a:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9be41:	00 
  e9be42:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9be48:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
--
  e9be93:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9be98:	6a 60                	push   0x60
  e9be9a:	5f                   	pop    rdi
  e9be9b:	e8 60 20 95 00       	call   17edf00 <_Znwm@plt>
  e9bea0:	49 89 c7             	mov    r15,rax
  e9bea3:	48 8b 8c 24 48 13 00 	mov    rcx,QWORD PTR [rsp+0x1348]
  e9beaa:	00 
  e9beab:	0f 57 c0             	xorps  xmm0,xmm0
  e9beae:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9beb2:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9beb5:	48 8d 05 f4 14 9a 00 	lea    rax,[rip+0x9a14f4]        # 183d3b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf348>
  e9bebc:	4d 85 f6             	test   r14,r14
  e9bebf:	74 21                	je     e9bee2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x632f8>
  e9bec1:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9bec6:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9becd:	00 
  e9bece:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e9bed3:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
  e9beda:	00 
  e9bedb:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9bee0:	eb 15                	jmp    e9bef7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6330d>
  e9bee2:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9bee9:	00 
  e9beea:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e9beef:	0f 11 84 24 78 07 00 	movups XMMWORD PTR [rsp+0x778],xmm0
  e9bef6:	00 
  e9bef7:	4d 8d 67 20          	lea    r12,[r15+0x20]
  e9befb:	48 89 8c 24 88 07 00 	mov    QWORD PTR [rsp+0x788],rcx
  e9bf02:	00 
  e9bf03:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
  e9bf0a:	00 
  e9bf0b:	4c 89 e7             	mov    rdi,r12
  e9bf0e:	48 89 de             	mov    rsi,rbx
  e9bf11:	e8 72 b3 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9bf16:	48 89 df             	mov    rdi,rbx
  e9bf19:	e8 4c e0 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9bf1e:	4c 89 f7             	mov    rdi,r14
  e9bf21:	e8 60 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bf26:	66 49 0f 6e c7       	movq   xmm0,r15
  e9bf2b:	66 49 0f 6e cc       	movq   xmm1,r12
  e9bf30:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9bf34:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9bf3a:	31 ff                	xor    edi,edi
  e9bf3c:	e8 db 24 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9bf41:	4c 89 f7             	mov    rdi,r14
  e9bf44:	e8 3d 25 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9bf49:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
--
  e9bfab:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bfb0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9bfb5:	6a 60                	push   0x60
  e9bfb7:	5f                   	pop    rdi
  e9bfb8:	e8 43 1f 95 00       	call   17edf00 <_Znwm@plt>
  e9bfbd:	49 89 c7             	mov    r15,rax
  e9bfc0:	0f 57 c0             	xorps  xmm0,xmm0
  e9bfc3:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9bfc7:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9bfca:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9bfd0:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
  e9bfd7:	4d 85 f6             	test   r14,r14
  e9bfda:	74 15                	je     e9bff1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63407>
  e9bfdc:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9bfe1:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
  e9bfe8:	00 00 
  e9bfea:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  e9bfef:	eb 12                	jmp    e9c003 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63419>
  e9bff1:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
  e9bff8:	00 00 
  e9bffa:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
  e9c001:	00 00 
  e9c003:	4d 8d 67 20          	lea    r12,[r15+0x20]
  e9c007:	48 8d 05 62 14 9a 00 	lea    rax,[rip+0x9a1462]        # 183d470 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf408>
  e9c00e:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9c015:	00 
  e9c016:	48 89 9c 24 90 07 00 	mov    QWORD PTR [rsp+0x790],rbx
  e9c01d:	00 
  e9c01e:	4c 89 e7             	mov    rdi,r12
  e9c021:	48 89 de             	mov    rsi,rbx
  e9c024:	e8 5f b2 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9c029:	48 89 df             	mov    rdi,rbx
  e9c02c:	e8 39 df bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9c031:	4c 89 f7             	mov    rdi,r14
  e9c034:	e8 4d 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c039:	66 49 0f 6e c7       	movq   xmm0,r15
  e9c03e:	66 49 0f 6e cc       	movq   xmm1,r12
  e9c043:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c047:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9c04d:	31 ff                	xor    edi,edi
  e9c04f:	e8 c8 23 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c054:	4c 89 f7             	mov    rdi,r14
  e9c057:	e8 2a 24 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c05c:	48 8d b4 24 60 10 00 	lea    rsi,[rsp+0x1060]
  e9c063:	00 
  e9c064:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c06a:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
--
  e9c190:	48 8d 8c 24 40 0b 00 	lea    rcx,[rsp+0xb40]
  e9c197:	00 
  e9c198:	48 8d 15 39 11 9a 00 	lea    rdx,[rip+0x9a1139]        # 183d2d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf270>
  e9c19f:	48 89 10             	mov    QWORD PTR [rax],rdx
  e9c1a2:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
  e9c1a6:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
  e9c1aa:	4d 85 ed             	test   r13,r13
  e9c1ad:	74 05                	je     e9c1b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x635ca>
  e9c1af:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
  e9c1b4:	4c 8d 63 20          	lea    r12,[rbx+0x20]
  e9c1b8:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
  e9c1bc:	4c 89 70 20          	mov    QWORD PTR [rax+0x20],r14
  e9c1c0:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c1c4:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
  e9c1c8:	4c 8d ac 24 70 07 00 	lea    r13,[rsp+0x770]
  e9c1cf:	00 
  e9c1d0:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
  e9c1d4:	4c 89 e7             	mov    rdi,r12
  e9c1d7:	4c 89 ee             	mov    rsi,r13
  e9c1da:	e8 a9 b0 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9c1df:	4c 89 ef             	mov    rdi,r13
  e9c1e2:	e8 83 dd bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9c1e7:	48 8d bc 24 30 0b 00 	lea    rdi,[rsp+0xb30]
  e9c1ee:	00 
  e9c1ef:	e8 1c 69 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e9c1f4:	66 48 0f 6e c3       	movq   xmm0,rbx
  e9c1f9:	66 49 0f 6e cc       	movq   xmm1,r12
  e9c1fe:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c202:	66 0f 7f 8c 24 f0 00 	movdqa XMMWORD PTR [rsp+0xf0],xmm1
  e9c209:	00 00 
  e9c20b:	31 ff                	xor    edi,edi
  e9c20d:	e8 0a 22 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c212:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9c219:	00 
  e9c21a:	e8 f1 68 c5 ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
  e9c21f:	31 ff                	xor    edi,edi
  e9c221:	e8 60 22 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
--
  e9c2a7:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c2ab:	48 83 c0 08          	add    rax,0x8
  e9c2af:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c2b3:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
  e9c2b8:	48 8d 0d 09 51 99 00 	lea    rcx,[rip+0x995109]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c2bf:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  e9c2c2:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e9c2c6:	49 89 de             	mov    r14,rbx
  e9c2c9:	49 83 c6 18          	add    r14,0x18
  e9c2cd:	48 8d 05 6c 11 9a 00 	lea    rax,[rip+0x9a116c]        # 183d440 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf3d8>
  e9c2d4:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e9c2d8:	f3 0f 7f 4b 20       	movdqu XMMWORD PTR [rbx+0x20],xmm1
  e9c2dd:	31 ff                	xor    edi,edi
  e9c2df:	e8 a2 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c2e4:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9c2eb:	00 
  e9c2ec:	4c 89 36             	mov    QWORD PTR [rsi],r14
  e9c2ef:	48 89 5e 08          	mov    QWORD PTR [rsi+0x8],rbx
  e9c2f3:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c2fa:	00 
  e9c2fb:	e8 ae d7 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c300:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e9c307:	00 
  e9c308:	e8 79 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c30d:	31 ff                	xor    edi,edi
  e9c30f:	e8 72 21 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c314:	6a 60                	push   0x60
  e9c316:	5f                   	pop    rdi
  e9c317:	e8 e4 1b 95 00       	call   17edf00 <_Znwm@plt>
  e9c31c:	48 89 c3             	mov    rbx,rax
  e9c31f:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c323:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9c328:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9c32b:	4c 8d 70 20          	lea    r14,[rax+0x20]
  e9c32f:	48 8d 05 c2 10 9a 00 	lea    rax,[rip+0x9a10c2]        # 183d3f8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf390>
  e9c336:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9c33d:	00 
  e9c33e:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
  e9c345:	00 
  e9c346:	4c 89 f7             	mov    rdi,r14
  e9c349:	4c 89 ee             	mov    rsi,r13
  e9c34c:	e8 37 af 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9c351:	4c 89 ef             	mov    rdi,r13
  e9c354:	e8 11 dc bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9c359:	66 48 0f 6e c3       	movq   xmm0,rbx
  e9c35e:	66 49 0f 6e ce       	movq   xmm1,r14
  e9c363:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c367:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9c36d:	31 ff                	xor    edi,edi
  e9c36f:	e8 a8 20 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c374:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c37b:	00 
  e9c37c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c382:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c386:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c38d:	00 
  e9c38e:	e8 1b d7 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c393:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
--
  e9c3a0:	31 ff                	xor    edi,edi
  e9c3a2:	e8 df 20 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c3a7:	80 bc 24 67 07 00 00 	cmp    BYTE PTR [rsp+0x767],0x0
  e9c3ae:	00 
  e9c3af:	0f 84 a3 00 00 00    	je     e9c458 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6386e>
  e9c3b5:	6a 60                	push   0x60
  e9c3b7:	5f                   	pop    rdi
  e9c3b8:	e8 43 1b 95 00       	call   17edf00 <_Znwm@plt>
  e9c3bd:	48 89 c3             	mov    rbx,rax
  e9c3c0:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c3c4:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9c3c9:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9c3cc:	4c 8d 70 20          	lea    r14,[rax+0x20]
  e9c3d0:	48 8d 05 91 12 9a 00 	lea    rax,[rip+0x9a1291]        # 183d668 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf600>
  e9c3d7:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9c3de:	00 
  e9c3df:	48 8b 84 24 80 13 00 	mov    rax,QWORD PTR [rsp+0x1380]
  e9c3e6:	00 
  e9c3e7:	48 89 84 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rax
  e9c3ee:	00 
  e9c3ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
  e9c3f6:	00 
  e9c3f7:	4c 89 f7             	mov    rdi,r14
  e9c3fa:	4c 89 ee             	mov    rsi,r13
  e9c3fd:	e8 86 ae 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9c402:	4c 89 ef             	mov    rdi,r13
  e9c405:	e8 60 db bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9c40a:	66 48 0f 6e c3       	movq   xmm0,rbx
  e9c40f:	66 49 0f 6e ce       	movq   xmm1,r14
  e9c414:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c418:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9c41e:	31 ff                	xor    edi,edi
  e9c420:	e8 f7 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c425:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c42c:	00 
  e9c42d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c433:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c437:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c43e:	00 
  e9c43f:	e8 6a d6 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c444:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
--
  e9c471:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c476:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c47b:	6a 60                	push   0x60
  e9c47d:	5f                   	pop    rdi
  e9c47e:	e8 7d 1a 95 00       	call   17edf00 <_Znwm@plt>
  e9c483:	49 89 c6             	mov    r14,rax
  e9c486:	0f 57 c0             	xorps  xmm0,xmm0
  e9c489:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9c48d:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9c490:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c496:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
  e9c49d:	48 85 db             	test   rbx,rbx
  e9c4a0:	74 15                	je     e9c4b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638cd>
  e9c4a2:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c4a7:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
  e9c4ae:	00 00 
  e9c4b0:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c4b5:	eb 12                	jmp    e9c4c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x638df>
  e9c4b7:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
  e9c4be:	00 00 
  e9c4c0:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
  e9c4c7:	00 00 
  e9c4c9:	4d 8d 7e 20          	lea    r15,[r14+0x20]
  e9c4cd:	48 8d 05 4c 0e 9a 00 	lea    rax,[rip+0x9a0e4c]        # 183d320 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf2b8>
  e9c4d4:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9c4db:	00 
  e9c4dc:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
  e9c4e3:	00 
  e9c4e4:	4c 89 ff             	mov    rdi,r15
  e9c4e7:	4c 89 ee             	mov    rsi,r13
  e9c4ea:	e8 99 ad 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9c4ef:	4c 89 ef             	mov    rdi,r13
  e9c4f2:	e8 73 da bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9c4f7:	48 89 df             	mov    rdi,rbx
  e9c4fa:	e8 87 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c4ff:	66 49 0f 6e c6       	movq   xmm0,r14
  e9c504:	66 49 0f 6e cf       	movq   xmm1,r15
  e9c509:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c50d:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9c513:	31 ff                	xor    edi,edi
  e9c515:	e8 02 1f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c51a:	48 89 df             	mov    rdi,rbx
  e9c51d:	e8 64 1f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c522:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c529:	00 
  e9c52a:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c530:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
--
  e9c584:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c589:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e9c58e:	6a 60                	push   0x60
  e9c590:	5f                   	pop    rdi
  e9c591:	e8 6a 19 95 00       	call   17edf00 <_Znwm@plt>
  e9c596:	49 89 c6             	mov    r14,rax
  e9c599:	0f 57 c0             	xorps  xmm0,xmm0
  e9c59c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e9c5a0:	48 89 28             	mov    QWORD PTR [rax],rbp
  e9c5a3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c5a9:	66 48 0f 3a 16 c3 01 	pextrq rbx,xmm0,0x1
  e9c5b0:	48 85 db             	test   rbx,rbx
  e9c5b3:	74 15                	je     e9c5ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639e0>
  e9c5b5:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c5ba:	f3 0f 7f 84 24 78 07 	movdqu XMMWORD PTR [rsp+0x778],xmm0
  e9c5c1:	00 00 
  e9c5c3:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c5c8:	eb 12                	jmp    e9c5dc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x639f2>
  e9c5ca:	66 0f d6 84 24 78 07 	movq   QWORD PTR [rsp+0x778],xmm0
  e9c5d1:	00 00 
  e9c5d3:	48 83 a4 24 80 07 00 	and    QWORD PTR [rsp+0x780],0x0
  e9c5da:	00 00 
  e9c5dc:	4d 8d 7e 20          	lea    r15,[r14+0x20]
  e9c5e0:	48 8d 05 81 0d 9a 00 	lea    rax,[rip+0x9a0d81]        # 183d368 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf300>
  e9c5e7:	48 89 84 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rax
  e9c5ee:	00 
  e9c5ef:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
  e9c5f6:	00 
  e9c5f7:	4c 89 ff             	mov    rdi,r15
  e9c5fa:	4c 89 ee             	mov    rsi,r13
  e9c5fd:	e8 86 ac 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9c602:	4c 89 ef             	mov    rdi,r13
  e9c605:	e8 60 d9 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9c60a:	48 89 df             	mov    rdi,rbx
  e9c60d:	e8 74 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c612:	66 49 0f 6e c6       	movq   xmm0,r14
  e9c617:	66 49 0f 6e cf       	movq   xmm1,r15
  e9c61c:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c620:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9c626:	31 ff                	xor    edi,edi
  e9c628:	e8 ef 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c62d:	48 89 df             	mov    rdi,rbx
  e9c630:	e8 51 1e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c635:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c63c:	00 
  e9c63d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c643:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
--
  e9c68d:	6a 60                	push   0x60
  e9c68f:	5f                   	pop    rdi
  e9c690:	e8 6b 18 95 00       	call   17edf00 <_Znwm@plt>
  e9c695:	48 89 c3             	mov    rbx,rax
  e9c698:	31 c0                	xor    eax,eax
  e9c69a:	45 84 ff             	test   r15b,r15b
  e9c69d:	0f 95 c0             	setne  al
  e9c6a0:	c1 e0 08             	shl    eax,0x8
  e9c6a3:	4c 09 f0             	or     rax,r14
  e9c6a6:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c6aa:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
  e9c6af:	48 89 2b             	mov    QWORD PTR [rbx],rbp
  e9c6b2:	4c 8d 73 20          	lea    r14,[rbx+0x20]
  e9c6b6:	48 8d 0d 23 0b 9a 00 	lea    rcx,[rip+0x9a0b23]        # 183d1e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf178>
  e9c6bd:	48 89 8c 24 70 07 00 	mov    QWORD PTR [rsp+0x770],rcx
  e9c6c4:	00 
  e9c6c5:	48 8b 8c 24 38 13 00 	mov    rcx,QWORD PTR [rsp+0x1338]
  e9c6cc:	00 
  e9c6cd:	48 89 8c 24 78 07 00 	mov    QWORD PTR [rsp+0x778],rcx
  e9c6d4:	00 
  e9c6d5:	48 89 84 24 80 07 00 	mov    QWORD PTR [rsp+0x780],rax
  e9c6dc:	00 
  e9c6dd:	4c 89 ac 24 90 07 00 	mov    QWORD PTR [rsp+0x790],r13
  e9c6e4:	00 
  e9c6e5:	4c 89 f7             	mov    rdi,r14
  e9c6e8:	4c 89 ee             	mov    rsi,r13
  e9c6eb:	e8 98 ab 0d 00       	call   f77288 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e69e>
  e9c6f0:	4c 89 ef             	mov    rdi,r13
  e9c6f3:	e8 72 d8 bd ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e9c6f8:	66 48 0f 6e c3       	movq   xmm0,rbx
  e9c6fd:	66 49 0f 6e ce       	movq   xmm1,r14
  e9c702:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c706:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
  e9c70c:	31 ff                	xor    edi,edi
  e9c70e:	e8 09 1d c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c713:	48 8d b4 24 30 0b 00 	lea    rsi,[rsp+0xb30]
  e9c71a:	00 
  e9c71b:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c721:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9c725:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c72c:	00 
  e9c72d:	e8 7c d3 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c732:	48 8b bc 24 38 0b 00 	mov    rdi,QWORD PTR [rsp+0xb38]
--
  e9c766:	48 8b 58 08          	mov    rbx,QWORD PTR [rax+0x8]
  e9c76a:	48 85 db             	test   rbx,rbx
  e9c76d:	74 05                	je     e9c774 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63b8a>
  e9c76f:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c774:	6a 40                	push   0x40
  e9c776:	5f                   	pop    rdi
  e9c777:	e8 84 17 95 00       	call   17edf00 <_Znwm@plt>
  e9c77c:	48 8d 48 18          	lea    rcx,[rax+0x18]
  e9c780:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c784:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9c789:	48 8d 15 38 4c 99 00 	lea    rdx,[rip+0x994c38]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c790:	48 89 10             	mov    QWORD PTR [rax],rdx
  e9c793:	48 8d 15 16 0f 9a 00 	lea    rdx,[rip+0x9a0f16]        # 183d6b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf648>
  e9c79a:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
  e9c79e:	48 8b 94 24 38 13 00 	mov    rdx,QWORD PTR [rsp+0x1338]
  e9c7a5:	00 
  e9c7a6:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
  e9c7aa:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
  e9c7b1:	00 
  e9c7b2:	48 89 50 28          	mov    QWORD PTR [rax+0x28],rdx
  e9c7b6:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  e9c7bb:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
  e9c7bf:	48 85 db             	test   rbx,rbx
  e9c7c2:	74 05                	je     e9c7c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63bdf>
  e9c7c4:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  e9c7c9:	66 48 0f 6e c0       	movq   xmm0,rax
  e9c7ce:	66 48 0f 6e c9       	movq   xmm1,rcx
  e9c7d3:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e9c7d7:	48 8d b4 24 70 07 00 	lea    rsi,[rsp+0x770]
  e9c7de:	00 
  e9c7df:	66 0f 7f 0e          	movdqa XMMWORD PTR [rsi],xmm1
  e9c7e3:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
  e9c7ea:	00 
  e9c7eb:	e8 be d2 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c7f0:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e9c7f7:	00 
  e9c7f8:	e8 89 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c7fd:	31 ff                	xor    edi,edi
  e9c7ff:	e8 82 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c804:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
  e9c80a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  e9c811:	e8 70 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c816:	48 8d 35 13 0b 5a ff 	lea    rsi,[rip+0xffffffffff5a0b13]        # 43d330 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2f3c>
  e9c81d:	48 8d bc 24 d0 0c 00 	lea    rdi,[rsp+0xcd0]
  e9c824:	00 
  e9c825:	e8 16 17 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e9c82a:	6a 50                	push   0x50
  e9c82c:	5f                   	pop    rdi
  e9c82d:	e8 ce 16 95 00       	call   17edf00 <_Znwm@plt>
  e9c832:	49 89 c4             	mov    r12,rax
  e9c835:	49 89 c5             	mov    r13,rax
  e9c838:	66 0f ef c0          	pxor   xmm0,xmm0
  e9c83c:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
  e9c843:	48 8d 05 7e 4b 99 00 	lea    rax,[rip+0x994b7e]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c84a:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e9c84e:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e9c855:	00 
  e9c856:	48 8d b4 24 d0 0c 00 	lea    rsi,[rsp+0xcd0]
  e9c85d:	00 
  e9c85e:	6a 01                	push   0x1
  e9c860:	5a                   	pop    rdx
  e9c861:	e8 f2 ab c0 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  e9c866:	4c 8b bc 24 30 13 00 	mov    r15,QWORD PTR [rsp+0x1330]
  e9c86d:	00 
  e9c86e:	48 8b 9c 24 10 13 00 	mov    rbx,QWORD PTR [rsp+0x1310]
  e9c875:	00 
  e9c876:	48 8d 05 3b 0c 9a 00 	lea    rax,[rip+0x9a0c3b]        # 183d4b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf450>
  e9c87d:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
  e9c881:	0f 28 84 24 50 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x550]
  e9c888:	00 
  e9c889:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
  e9c88e:	48 8b 84 24 60 05 00 	mov    rax,QWORD PTR [rsp+0x560]
  e9c895:	00 
  e9c896:	49 89 45 30          	mov    QWORD PTR [r13+0x30],rax
  e9c89a:	66 0f ef c9          	pxor   xmm1,xmm1
  e9c89e:	66 0f 7f 8c 24 50 05 	movdqa XMMWORD PTR [rsp+0x550],xmm1
  e9c8a5:	00 00 
  e9c8a7:	48 83 a4 24 60 05 00 	and    QWORD PTR [rsp+0x560],0x0
  e9c8ae:	00 00 
  e9c8b0:	4c 8d b4 24 70 07 00 	lea    r14,[rsp+0x770]
  e9c8b7:	00 
  e9c8b8:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
  e9c8bd:	f3 41 0f 7f 45 38    	movdqu XMMWORD PTR [r13+0x38],xmm0
  e9c8c3:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
  e9c8c7:	49 89 45 48          	mov    QWORD PTR [r13+0x48],rax
  e9c8cb:	66 41 0f 7f 0e       	movdqa XMMWORD PTR [r14],xmm1
  e9c8d0:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  e9c8d5:	4c 89 f7             	mov    rdi,r14
  e9c8d8:	e8 0b ed bd ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  e9c8dd:	31 ff                	xor    edi,edi
  e9c8df:	e8 38 1b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c8e4:	48 8b 84 24 38 13 00 	mov    rax,QWORD PTR [rsp+0x1338]
  e9c8eb:	00 
  e9c8ec:	49 89 06             	mov    QWORD PTR [r14],rax
  e9c8ef:	48 8d ac 24 80 07 00 	lea    rbp,[rsp+0x780]
  e9c8f6:	00 
  e9c8f7:	48 8d b4 24 10 06 00 	lea    rsi,[rsp+0x610]
  e9c8fe:	00 
  e9c8ff:	48 89 ef             	mov    rdi,rbp
  e9c902:	e8 f1 c8 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9c907:	48 8b 84 24 00 13 00 	mov    rax,QWORD PTR [rsp+0x1300]
  e9c90e:	00 
  e9c90f:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
  e9c913:	4c 89 7d 38          	mov    QWORD PTR [rbp+0x38],r15
  e9c917:	48 8d bc 24 c0 07 00 	lea    rdi,[rsp+0x7c0]
  e9c91e:	00 
  e9c91f:	48 89 de             	mov    rsi,rbx
  e9c922:	e8 97 f3 c2 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e9c927:	4c 8b b4 24 50 13 00 	mov    r14,QWORD PTR [rsp+0x1350]
  e9c92e:	00 
  e9c92f:	48 8d bc 24 d0 07 00 	lea    rdi,[rsp+0x7d0]
  e9c936:	00 
  e9c937:	48 8d b4 24 d0 0e 00 	lea    rsi,[rsp+0xed0]
  e9c93e:	00 
  e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
  e9c944:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
  e9c94b:	00 

## Calls in final producer window
  e9c789:	48 8d 15 38 4c 99 00 	lea    rdx,[rip+0x994c38]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c793:	48 8d 15 16 0f 9a 00 	lea    rdx,[rip+0x9a0f16]        # 183d6b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf648>
  e9c7eb:	e8 be d2 ff ff       	call   e99aae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ec4>
  e9c7f8:	e8 89 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c7ff:	e8 82 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c811:	e8 70 1c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9c825:	e8 16 17 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e9c82d:	e8 ce 16 95 00       	call   17edf00 <_Znwm@plt>
  e9c843:	48 8d 05 7e 4b 99 00 	lea    rax,[rip+0x994b7e]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c861:	e8 f2 ab c0 ff       	call   aa7458 <JNI_OnUnload@@Base+0x2ed25>
  e9c876:	48 8d 05 3b 0c 9a 00 	lea    rax,[rip+0x9a0c3b]        # 183d4b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf450>
  e9c8d8:	e8 0b ed bd ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  e9c8df:	e8 38 1b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e9c902:	e8 f1 c8 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9c922:	e8 97 f3 c2 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
  e9c93f:	e8 60 c5 05 00       	call   ef8ea4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02ba>
  e9c954:	e8 13 9a 00 00       	call   ea636c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d782>
  e9c969:	e8 42 9a 00 00       	call   ea63b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d7c6>
  e9c981:	e8 62 c5 05 00       	call   ef8ee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc02fe>
  e9c9ea:	e8 3d c5 05 00       	call   ef8f2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0342>
  e9ca27:	e8 64 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ca5d:	e8 2e d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ca72:	e8 19 d8 bd ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9ccb0:	e8 4b 12 95 00       	call   17edf00 <_Znwm@plt>
  e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
  e9cd05:	e8 ee c4 ce ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>

## High-address constants / candidate vptrs
  e9c789:	48 8d 15 38 4c 99 00 	lea    rdx,[rip+0x994c38]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c793:	48 8d 15 16 0f 9a 00 	lea    rdx,[rip+0x9a0f16]        # 183d6b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf648>
  e9c843:	48 8d 05 7e 4b 99 00 	lea    rax,[rip+0x994b7e]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e9c876:	48 8d 05 3b 0c 9a 00 	lea    rax,[rip+0x9a0c3b]        # 183d4b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf450>
  e9cce4:	48 8d 05 f5 98 99 00 	lea    rax,[rip+0x9998f5]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
