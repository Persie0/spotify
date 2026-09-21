# Final reaching definition of rsp+0x770 before e9ccf3

Known contradiction: 0x6b0 element begins with std::string, so e9c8ec cannot be the final receiver value reaching e9ccf3.

## Every direct rsp+0x770/778/780 reference e9c8e0..e9cd10
### READ 0xe9c8ef: lea    rbp,[rsp+0x780]
    /tmp/r770/liborbit-jni-spotify.so:     file format elf64-x86-64
    
    
    Disassembly of section .text:
    
    0000000000e9c8e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63cf6>:
      e9c8e0:	38 1b                	cmp    BYTE PTR [rbx],bl
      e9c8e2:	c0 ff 48             	sar    bh,0x48
      e9c8e5:	8b 84 24 38 13 00 00 	mov    eax,DWORD PTR [rsp+0x1338]
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

## Any LEA aliases to rsp+0x770 and subsequent calls/stores
## Full compact window
  e9c8e0:	38 1b                	cmp    BYTE PTR [rbx],bl
  e9c8e2:	c0 ff 48             	sar    bh,0x48
  e9c8e5:	8b 84 24 38 13 00 00 	mov    eax,DWORD PTR [rsp+0x1338]
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
  e9cd0e:	41                   	rex.B
  e9cd0f:	0f                   	.byte 0xf
