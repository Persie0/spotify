# TimelineConductor +0xc8 r14 backslice

Install:
- 0x135fd57: [TimelineConductor+0xc8] = r14

## Raw disassembly 0x135fa00..0x135fd70
 135fa00:	49 8d be a8 08 00 00 	lea    rdi,[r14+0x8a8]
 135fa07:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
 135fa0e:	00 
 135fa0f:	e8 ee a3 47 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
 135fa14:	49 8d be 00 09 00 00 	lea    rdi,[r14+0x900]
 135fa1b:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
 135fa22:	00 
 135fa23:	e8 e2 1c 96 ff       	call   cc170a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e6aa>
 135fa28:	31 ed                	xor    ebp,ebp
 135fa2a:	41 88 ae 58 09 00 00 	mov    BYTE PTR [r14+0x958],bpl
 135fa31:	41 88 ae a8 09 00 00 	mov    BYTE PTR [r14+0x9a8],bpl
 135fa38:	41 83 a6 b0 09 00 00 	and    DWORD PTR [r14+0x9b0],0x0
 135fa3f:	00 
 135fa40:	66 41 83 a6 b4 09 00 	and    WORD PTR [r14+0x9b4],0x0
 135fa47:	00 00 
 135fa49:	49 8d 86 b8 09 00 00 	lea    rax,[r14+0x9b8]
 135fa50:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 135fa55:	48 8d 9c 24 40 0f 00 	lea    rbx,[rsp+0xf40]
 135fa5c:	00 
 135fa5d:	4c 89 33             	mov    QWORD PTR [rbx],r14
 135fa60:	48 8d 05 fd c9 71 ff 	lea    rax,[rip+0xffffffffff71c9fd]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 135fa67:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 135fa6b:	4c 8d 25 b0 5f 00 00 	lea    r12,[rip+0x5fb0]        # 1365a22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aafa6>
 135fa72:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
 135fa76:	4c 8d ac 24 20 0f 00 	lea    r13,[rsp+0xf20]
 135fa7d:	00 
 135fa7e:	48 8b 8c 24 98 10 00 	mov    rcx,QWORD PTR [rsp+0x1098]
 135fa85:	00 
 135fa86:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
 135fa8a:	48 8d 0d d3 c9 71 ff 	lea    rcx,[rip+0xffffffffff71c9d3]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
 135fa91:	49 89 4d 10          	mov    QWORD PTR [r13+0x10],rcx
 135fa95:	48 8d 0d 70 72 00 00 	lea    rcx,[rip+0x7270]        # 1366d0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac290>
 135fa9c:	49 89 4d 18          	mov    QWORD PTR [r13+0x18],rcx
 135faa0:	4d 8d be f0 09 00 00 	lea    r15,[r14+0x9f0]
 135faa7:	66 0f ef c0          	pxor   xmm0,xmm0
 135faab:	f3 41 0f 7f 86 b8 09 	movdqu XMMWORD PTR [r14+0x9b8],xmm0
 135fab2:	00 00 
 135fab4:	f3 41 0f 7f 86 c8 09 	movdqu XMMWORD PTR [r14+0x9c8],xmm0
 135fabb:	00 00 
 135fabd:	f3 41 0f 7f 86 d8 09 	movdqu XMMWORD PTR [r14+0x9d8],xmm0
 135fac4:	00 00 
 135fac6:	f3 41 0f 7f 86 e8 09 	movdqu XMMWORD PTR [r14+0x9e8],xmm0
 135facd:	00 00 
 135facf:	49 89 86 00 0a 00 00 	mov    QWORD PTR [r14+0xa00],rax
 135fad6:	6a 01                	push   0x1
 135fad8:	5f                   	pop    rdi
 135fad9:	4c 89 fe             	mov    rsi,r15
 135fadc:	48 89 da             	mov    rdx,rbx
 135fadf:	e8 80 c9 71 ff       	call   a7c464 <JNI_OnUnload@@Base+0x3d31>
 135fae4:	4d 89 a6 08 0a 00 00 	mov    QWORD PTR [r14+0xa08],r12
 135faeb:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 135faf0:	49 8d 9e 10 0a 00 00 	lea    rbx,[r14+0xa10]
 135faf7:	48 89 df             	mov    rdi,rbx
 135fafa:	4c 89 ee             	mov    rsi,r13
 135fafd:	e8 86 f5 ee ff       	call   124f088 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9460c>
 135fb02:	49 8d 86 38 0a 00 00 	lea    rax,[r14+0xa38]
 135fb09:	66 0f ef c0          	pxor   xmm0,xmm0
 135fb0d:	f3 41 0f 7f 86 38 0a 	movdqu XMMWORD PTR [r14+0xa38],xmm0
 135fb14:	00 00 
 135fb16:	49 89 86 30 0a 00 00 	mov    QWORD PTR [r14+0xa30],rax
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
 135fbe6:	41 88 9e e0 0a 00 00 	mov    BYTE PTR [r14+0xae0],bl
 135fbed:	49 83 a6 f0 0a 00 00 	and    QWORD PTR [r14+0xaf0],0x0
 135fbf4:	00 
 135fbf5:	41 88 9e f8 0a 00 00 	mov    BYTE PTR [r14+0xaf8],bl
 135fbfc:	41 88 9e 00 0b 00 00 	mov    BYTE PTR [r14+0xb00],bl
 135fc03:	4d 89 be 08 0b 00 00 	mov    QWORD PTR [r14+0xb08],r15
 135fc0a:	4d 89 a6 10 0b 00 00 	mov    QWORD PTR [r14+0xb10],r12
 135fc11:	48 8b 84 24 20 11 00 	mov    rax,QWORD PTR [rsp+0x1120]
 135fc18:	00 
 135fc19:	49 89 86 18 0b 00 00 	mov    QWORD PTR [r14+0xb18],rax
 135fc20:	4d 8d be 20 0b 00 00 	lea    r15,[r14+0xb20]
 135fc27:	48 8d b4 24 d0 09 00 	lea    rsi,[rsp+0x9d0]
 135fc2e:	00 
 135fc2f:	4c 89 ff             	mov    rdi,r15
 135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
 135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
 135fc3e:	4c 89 ef             	mov    rdi,r13
 135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
 135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
 135fc4d:	00 00 
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
 135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135fd2e:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
 135fd35:	00 
 135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
 135fd3b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
 135fd42:	00 
 135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 135fd48:	31 ff                	xor    edi,edi
 135fd4a:	e8 37 e7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 135fd4f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 135fd54:	48 8b 38             	mov    rdi,QWORD PTR [rax]
 135fd57:	4c 89 30             	mov    QWORD PTR [rax],r14
 135fd5a:	48 85 ff             	test   rdi,rdi
 135fd5d:	74 06                	je     135fd65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a52e9>
 135fd5f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 135fd62:	ff 50 08             	call   QWORD PTR [rax+0x8]
 135fd65:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
 135fd6c:	00 
 135fd6d:	e8 f8 a1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

## Writes/definitions of r14 in range

## Calls and immediate return captures in range
###  135f863:	e8 28 aa 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
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

###  135f8f1:	e8 e4 3c 97 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
     135f8d8:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     135f8dc:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     135f8e0:	49 89 86 d0 07 00 00 	mov    QWORD PTR [r14+0x7d0],rax
     135f8e7:	49 8d be e0 07 00 00 	lea    rdi,[r14+0x7e0]
     135f8ee:	48 89 de             	mov    rsi,rbx
     135f8f1:	e8 e4 3c 97 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
     135f8f6:	66 41 0f 6f 47 50    	movdqa xmm0,XMMWORD PTR [r15+0x50]
     135f8fc:	41 0f 28 4f 60       	movaps xmm1,XMMWORD PTR [r15+0x60]
     135f901:	41 0f 28 57 70       	movaps xmm2,XMMWORD PTR [r15+0x70]
     135f906:	41 0f 29 96 30 08 00 	movaps XMMWORD PTR [r14+0x830],xmm2
     135f90d:	00 
     135f90e:	41 0f 29 8e 20 08 00 	movaps XMMWORD PTR [r14+0x820],xmm1
     135f915:	00 

###  135f927:	e8 de 60 00 00       	call   1365a0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aaf8e>
     135f915:	00 
     135f916:	66 41 0f 7f 86 10 08 	movdqa XMMWORD PTR [r14+0x810],xmm0
     135f91d:	00 00 
     135f91f:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135f926:	00 
     135f927:	e8 de 60 00 00       	call   1365a0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aaf8e>
     135f92c:	4d 8d be 40 08 00 00 	lea    r15,[r14+0x840]
     135f933:	48 8b 84 24 c0 0a 00 	mov    rax,QWORD PTR [rsp+0xac0]
     135f93a:	00 
     135f93b:	48 85 c0             	test   rax,rax
     135f93e:	74 23                	je     135f963 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4ee7>
     135f940:	48 8d 8c 24 a0 0a 00 	lea    rcx,[rsp+0xaa0]
     135f947:	00 

###  135f98a:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f975:	4d 89 be 60 08 00 00 	mov    QWORD PTR [r14+0x860],r15
     135f97c:	48 8d bc 24 a0 0a 00 	lea    rdi,[rsp+0xaa0]
     135f983:	00 
     135f984:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f987:	4c 89 fe             	mov    rsi,r15
     135f98a:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f98d:	4d 8d ae 70 08 00 00 	lea    r13,[r14+0x870]
     135f994:	48 8b 84 24 90 0a 00 	mov    rax,QWORD PTR [rsp+0xa90]
     135f99b:	00 
     135f99c:	48 85 c0             	test   rax,rax
     135f99f:	74 1e                	je     135f9bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4f43>
     135f9a1:	48 8d 8c 24 70 0a 00 	lea    rcx,[rsp+0xa70]
     135f9a8:	00 

###  135f9e1:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f9cc:	4d 89 ae 90 08 00 00 	mov    QWORD PTR [r14+0x890],r13
     135f9d3:	48 8d bc 24 70 0a 00 	lea    rdi,[rsp+0xa70]
     135f9da:	00 
     135f9db:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f9de:	4c 89 ee             	mov    rsi,r13
     135f9e1:	ff 50 18             	call   QWORD PTR [rax+0x18]
     135f9e4:	4c 89 ac 24 88 00 00 	mov    QWORD PTR [rsp+0x88],r13
     135f9eb:	00 
     135f9ec:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     135f9f3:	00 
     135f9f4:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     135f9f9:	49 89 9e a0 08 00 00 	mov    QWORD PTR [r14+0x8a0],rbx
     135fa00:	49 8d be a8 08 00 00 	lea    rdi,[r14+0x8a8]

###  135fa0f:	e8 ee a3 47 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     135f9f4:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     135f9f9:	49 89 9e a0 08 00 00 	mov    QWORD PTR [r14+0x8a0],rbx
     135fa00:	49 8d be a8 08 00 00 	lea    rdi,[r14+0x8a8]
     135fa07:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
     135fa0e:	00 
     135fa0f:	e8 ee a3 47 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     135fa14:	49 8d be 00 09 00 00 	lea    rdi,[r14+0x900]
     135fa1b:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
     135fa22:	00 
     135fa23:	e8 e2 1c 96 ff       	call   cc170a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e6aa>
     135fa28:	31 ed                	xor    ebp,ebp
     135fa2a:	41 88 ae 58 09 00 00 	mov    BYTE PTR [r14+0x958],bpl
     135fa31:	41 88 ae a8 09 00 00 	mov    BYTE PTR [r14+0x9a8],bpl

###  135fa23:	e8 e2 1c 96 ff       	call   cc170a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e6aa>
     135fa0e:	00 
     135fa0f:	e8 ee a3 47 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     135fa14:	49 8d be 00 09 00 00 	lea    rdi,[r14+0x900]
     135fa1b:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
     135fa22:	00 
     135fa23:	e8 e2 1c 96 ff       	call   cc170a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20e6aa>
     135fa28:	31 ed                	xor    ebp,ebp
     135fa2a:	41 88 ae 58 09 00 00 	mov    BYTE PTR [r14+0x958],bpl
     135fa31:	41 88 ae a8 09 00 00 	mov    BYTE PTR [r14+0x9a8],bpl
     135fa38:	41 83 a6 b0 09 00 00 	and    DWORD PTR [r14+0x9b0],0x0
     135fa3f:	00 
     135fa40:	66 41 83 a6 b4 09 00 	and    WORD PTR [r14+0x9b4],0x0
     135fa47:	00 00 

###  135fadf:	e8 80 c9 71 ff       	call   a7c464 <JNI_OnUnload@@Base+0x3d31>
     135facf:	49 89 86 00 0a 00 00 	mov    QWORD PTR [r14+0xa00],rax
     135fad6:	6a 01                	push   0x1
     135fad8:	5f                   	pop    rdi
     135fad9:	4c 89 fe             	mov    rsi,r15
     135fadc:	48 89 da             	mov    rdx,rbx
     135fadf:	e8 80 c9 71 ff       	call   a7c464 <JNI_OnUnload@@Base+0x3d31>
     135fae4:	4d 89 a6 08 0a 00 00 	mov    QWORD PTR [r14+0xa08],r12
     135faeb:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     135faf0:	49 8d 9e 10 0a 00 00 	lea    rbx,[r14+0xa10]
     135faf7:	48 89 df             	mov    rdi,rbx
     135fafa:	4c 89 ee             	mov    rsi,r13
     135fafd:	e8 86 f5 ee ff       	call   124f088 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9460c>
     135fb02:	49 8d 86 38 0a 00 00 	lea    rax,[r14+0xa38]

###  135fafd:	e8 86 f5 ee ff       	call   124f088 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9460c>
     135fae4:	4d 89 a6 08 0a 00 00 	mov    QWORD PTR [r14+0xa08],r12
     135faeb:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     135faf0:	49 8d 9e 10 0a 00 00 	lea    rbx,[r14+0xa10]
     135faf7:	48 89 df             	mov    rdi,rbx
     135fafa:	4c 89 ee             	mov    rsi,r13
     135fafd:	e8 86 f5 ee ff       	call   124f088 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9460c>
     135fb02:	49 8d 86 38 0a 00 00 	lea    rax,[r14+0xa38]
     135fb09:	66 0f ef c0          	pxor   xmm0,xmm0
     135fb0d:	f3 41 0f 7f 86 38 0a 	movdqu XMMWORD PTR [r14+0xa38],xmm0
     135fb14:	00 00 
     135fb16:	49 89 86 30 0a 00 00 	mov    QWORD PTR [r14+0xa30],rax
     135fb1d:	41 88 ae 80 0a 00 00 	mov    BYTE PTR [r14+0xa80],bpl
     135fb24:	f3 41 0f 7f 86 48 0a 	movdqu XMMWORD PTR [r14+0xa48],xmm0

###  135fb40:	e8 bb e3 48 00       	call   17edf00 <_Znwm@plt>
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

###  135fbac:	e8 d5 94 e9 ff       	call   11f9086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e60a>
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

###  135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
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

###  135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     135fc19:	49 89 86 18 0b 00 00 	mov    QWORD PTR [r14+0xb18],rax
     135fc20:	4d 8d be 20 0b 00 00 	lea    r15,[r14+0xb20]
     135fc27:	48 8d b4 24 d0 09 00 	lea    rsi,[rsp+0x9d0]
     135fc2e:	00 
     135fc2f:	4c 89 ff             	mov    rdi,r15
     135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
     135fc3e:	4c 89 ef             	mov    rdi,r13
     135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
     135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
     135fc4d:	00 00 
     135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
     135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]

###  135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
     135fc2e:	00 
     135fc2f:	4c 89 ff             	mov    rdi,r15
     135fc32:	e8 c1 95 82 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
     135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
     135fc3e:	4c 89 ef             	mov    rdi,r13
     135fc41:	e8 38 86 7c ff       	call   b2827e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521e>
     135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
     135fc4d:	00 00 
     135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
     135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]
     135fc5d:	48 89 ef             	mov    rdi,rbp
     135fc60:	48 8b b4 24 98 10 00 	mov    rsi,QWORD PTR [rsp+0x1098]
     135fc67:	00 

###  135fc68:	e8 55 1a 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
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

###  135fc7c:	e8 a9 5a 80 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
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

###  135fc86:	e8 15 71 00 00       	call   1366da0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac324>
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

###  135fcb6:	ff 50 38             	call   QWORD PTR [rax+0x38]
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

###  135fcc1:	e8 5a 74 00 00       	call   1367120 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac6a4>
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

###  135fcce:	e8 97 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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

###  135fcdb:	e8 8a a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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

###  135fce8:	e8 7d a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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

###  135fcf5:	e8 70 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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

###  135fd02:	e8 63 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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

###  135fd0f:	e8 56 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
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
     135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd2e:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]

###  135fd1c:	e8 95 13 00 00       	call   13610b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a663a>
     135fd07:	48 8d bc 24 80 0d 00 	lea    rdi,[rsp+0xd80]
     135fd0e:	00 
     135fd0f:	e8 56 a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd14:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fd1b:	00 
     135fd1c:	e8 95 13 00 00       	call   13610b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a663a>
     135fd21:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
     135fd28:	00 
     135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd2e:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135fd35:	00 
     135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     135fd3b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]

###  135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd14:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135fd1b:	00 
     135fd1c:	e8 95 13 00 00       	call   13610b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a663a>
     135fd21:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
     135fd28:	00 
     135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd2e:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135fd35:	00 
     135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     135fd3b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135fd42:	00 
     135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135fd48:	31 ff                	xor    edi,edi

###  135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     135fd21:	48 8d bc 24 10 0e 00 	lea    rdi,[rsp+0xe10]
     135fd28:	00 
     135fd29:	e8 3c a2 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135fd2e:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135fd35:	00 
     135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     135fd3b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135fd42:	00 
     135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135fd48:	31 ff                	xor    edi,edi
     135fd4a:	e8 37 e7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fd4f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fd54:	48 8b 38             	mov    rdi,QWORD PTR [rax]

###  135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135fd2e:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135fd35:	00 
     135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     135fd3b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135fd42:	00 
     135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135fd48:	31 ff                	xor    edi,edi
     135fd4a:	e8 37 e7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fd4f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fd54:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135fd57:	4c 89 30             	mov    QWORD PTR [rax],r14

###  135fd4a:	e8 37 e7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fd36:	e8 99 43 8a ff       	call   c040d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x151074>
     135fd3b:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135fd42:	00 
     135fd43:	e8 1e d3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135fd48:	31 ff                	xor    edi,edi
     135fd4a:	e8 37 e7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135fd4f:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     135fd54:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135fd57:	4c 89 30             	mov    QWORD PTR [rax],r14

## Candidate object constructions in range
### allocation  135fb40:	e8 bb e3 48 00       	call   17edf00 <_Znwm@plt>
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

## r14 uses in final 0x120 bytes
 135fc37:	4d 8d ae 50 0b 00 00 	lea    r13,[r14+0xb50]
 135fc46:	66 41 83 a6 a8 0b 00 	and    WORD PTR [r14+0xba8],0x0
 135fc4f:	41 88 9e aa 0b 00 00 	mov    BYTE PTR [r14+0xbaa],bl
 135fc56:	49 8d ae b0 0b 00 00 	lea    rbp,[r14+0xbb0]
 135fc6d:	49 8d 9e c0 0b 00 00 	lea    rbx,[r14+0xbc0]
 135fc81:	4c 89 f7             	mov    rdi,r14
 135fc8b:	49 8b be 78 07 00 00 	mov    rdi,QWORD PTR [r14+0x778]
 135fc9a:	4c 89 36             	mov    QWORD PTR [rsi],r14
 135fd57:	4c 89 30             	mov    QWORD PTR [rax],r14
