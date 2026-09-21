# Smart skip interval-provider backslice

Install sites: 0x135fc03 [dep+0xb08]=r15; 0x135fc0a [dep+0xb10]=r12.

## Full final constructor window 0x135f800..0x135fc20

/tmp/intprov/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000135f800 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4d84>:
 135f800:	00 4c 89 6b          	add    BYTE PTR [rcx+rcx*4+0x6b],cl
 135f804:	a0 48 89 6b a8 4c 89 	movabs al,ds:0xb073894ca86b8948
 135f80b:	73 b0 
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
 135f8c4:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
 135f8c9:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
 135f8cd:	41 0f 29 86 c0 07 00 	movaps XMMWORD PTR [r14+0x7c0],xmm0
 135f8d4:	00 
 135f8d5:	0f 57 c0             	xorps  xmm0,xmm0
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
 135f948:	48 39 c8             	cmp    rax,rcx
 135f94b:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
 135f950:	74 23                	je     135f975 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4ef9>
 135f952:	48 8d 8c 24 c0 0a 00 	lea    rcx,[rsp+0xac0]
 135f959:	00 
 135f95a:	49 89 86 60 08 00 00 	mov    QWORD PTR [r14+0x860],rax
 135f961:	eb 0c                	jmp    135f96f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4ef3>
 135f963:	49 8d 8e 60 08 00 00 	lea    rcx,[r14+0x860]
 135f96a:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
 135f96f:	48 83 21 00          	and    QWORD PTR [rcx],0x0
 135f973:	eb 18                	jmp    135f98d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4f11>
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
 135f9a9:	48 39 c8             	cmp    rax,rcx
 135f9ac:	74 1e                	je     135f9cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4f50>
 135f9ae:	48 8d 8c 24 90 0a 00 	lea    rcx,[rsp+0xa90]
 135f9b5:	00 
 135f9b6:	49 89 86 90 08 00 00 	mov    QWORD PTR [r14+0x890],rax
 135f9bd:	eb 07                	jmp    135f9c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4f4a>
 135f9bf:	49 8d 8e 90 08 00 00 	lea    rcx,[r14+0x890]
 135f9c6:	48 83 21 00          	and    QWORD PTR [rcx],0x0
 135f9ca:	eb 18                	jmp    135f9e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4f68>
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

## Definitions of r15/r12 in entire constructor before install
 135d1ac:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
 135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]
 135d1db:	4c 8d a4 24 00 0b 00 	lea    r12,[rsp+0xb00]
 135d1f2:	4c 8d a4 24 18 0b 00 	lea    r12,[rsp+0xb18]
 135d209:	4c 8d a4 24 30 0b 00 	lea    r12,[rsp+0xb30]
 135d220:	4c 8d a4 24 48 0b 00 	lea    r12,[rsp+0xb48]
 135d237:	4c 8d a4 24 60 0b 00 	lea    r12,[rsp+0xb60]
 135d253:	4c 8d a4 24 a0 05 00 	lea    r12,[rsp+0x5a0]
 135d26e:	4c 8b bc 24 d0 10 00 	mov    r15,QWORD PTR [rsp+0x10d0]
 135d6cf:	4c 8d bc 24 f0 0a 00 	lea    r15,[rsp+0xaf0]
 135d72b:	4c 8d a4 24 40 0b 00 	lea    r12,[rsp+0xb40]
 135d7dd:	4d 8d 7d 68          	lea    r15,[r13+0x68]
 135d81c:	4c 8d bc 24 60 0f 00 	lea    r15,[rsp+0xf60]
 135d975:	4c 8b a4 24 c0 0d 00 	mov    r12,QWORD PTR [rsp+0xdc0]
 135d9f0:	4c 8d a4 24 a0 05 00 	lea    r12,[rsp+0x5a0]
 135dabf:	4c 8d a4 24 f0 05 00 	lea    r12,[rsp+0x5f0]
 135dbe3:	4c 8d bc 24 40 0e 00 	lea    r15,[rsp+0xe40]
 135dcc5:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
 135dcf8:	49 89 c4             	mov    r12,rax
 135dd52:	49 89 c7             	mov    r15,rax
 135de6c:	41 5c                	pop    r12
 135de7f:	4c 8d 3d 6a f4 07 ff 	lea    r15,[rip+0xffffffffff07f46a]        # 3dd2f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d3f>
 135df1b:	49 89 c7             	mov    r15,rax
 135df65:	4c 8b 64 24 78       	mov    r12,QWORD PTR [rsp+0x78]
 135e2b9:	4c 8d bc 24 e0 03 00 	lea    r15,[rsp+0x3e0]
 135e426:	4c 8d a4 24 60 0f 00 	lea    r12,[rsp+0xf60]
 135e499:	4c 8d bc 24 a0 04 00 	lea    r15,[rsp+0x4a0]
 135e53b:	49 89 c4             	mov    r12,rax
 135e5ce:	4d 8d bc 24 d0 00 00 	lea    r15,[r12+0xd0]
 135ec4d:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
 135ec5e:	4c 8b bc 24 b0 10 00 	mov    r15,QWORD PTR [rsp+0x10b0]
 135ec89:	49 89 c7             	mov    r15,rax
 135f7cc:	4d 8d be 40 07 00 00 	lea    r15,[r14+0x740]
 135f868:	4d 8d a6 80 07 00 00 	lea    r12,[r14+0x780]
 135f86f:	4c 8d bc 24 a0 0f 00 	lea    r15,[rsp+0xfa0]
 135f92c:	4d 8d be 40 08 00 00 	lea    r15,[r14+0x840]
 135fa6b:	4c 8d 25 b0 5f 00 00 	lea    r12,[rip+0x5fb0]        # 1365a22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aafa6>
 135faa0:	4d 8d be f0 09 00 00 	lea    r15,[r14+0x9f0]
 135fb45:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
 135fb4e:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]

## Last definitions with context
### r15: 20 definitions; last 10
#### 0x135e2b9: lea    r15,[rsp+0x3e0]
     135e268:	8b 8c 24 98 00 00 00 	mov    ecx,DWORD PTR [rsp+0x98]
     135e26f:	88 8c 24 22 08 00 00 	mov    BYTE PTR [rsp+0x822],cl
     135e276:	88 84 24 23 08 00 00 	mov    BYTE PTR [rsp+0x823],al
     135e27d:	48 63 84 24 b0 00 00 	movsxd rax,DWORD PTR [rsp+0xb0]
     135e284:	00 
     135e285:	48 89 84 24 28 08 00 	mov    QWORD PTR [rsp+0x828],rax
     135e28c:	00 
     135e28d:	48 63 84 24 ec 00 00 	movsxd rax,DWORD PTR [rsp+0xec]
     135e294:	00 
     135e295:	48 89 84 24 30 08 00 	mov    QWORD PTR [rsp+0x830],rax
     135e29c:	00 
     135e29d:	4c 89 f8             	mov    rax,r15
     135e2a0:	48 83 c0 18          	add    rax,0x18
     135e2a4:	48 89 84 24 38 08 00 	mov    QWORD PTR [rsp+0x838],rax
     135e2ab:	00 
     135e2ac:	4c 89 bc 24 40 08 00 	mov    QWORD PTR [rsp+0x840],r15
     135e2b3:	00 
     135e2b4:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
     135e2b9:	4c 8d bc 24 e0 03 00 	lea    r15,[rsp+0x3e0]
     135e2c0:	00 
     135e2c1:	4d 89 67 f0          	mov    QWORD PTR [r15-0x10],r12
     135e2c5:	4c 89 ff             	mov    rdi,r15
     135e2c8:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135e2cf:	00 
     135e2d0:	e8 11 ed 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135e2d5:	4c 8d b4 24 40 05 00 	lea    r14,[rsp+0x540]
     135e2dc:	00 
     135e2dd:	66 41 83 a6 60 ff ff 	and    WORD PTR [r14-0xa0],0x0
     135e2e4:	ff 00 
     135e2e6:	41 89 9e 64 ff ff ff 	mov    DWORD PTR [r14-0x9c],ebx
     135e2ed:	49 c7 86 68 ff ff ff 	mov    QWORD PTR [r14-0x98],0x3e8
     135e2f4:	e8 03 00 00 
     135e2f8:	49 c7 86 70 ff ff ff 	mov    QWORD PTR [r14-0x90],0xfa0
     135e2ff:	a0 0f 00 00 
     135e303:	49 83 a6 78 ff ff ff 	and    QWORD PTR [r14-0x88],0x0
     135e30a:	00 
     135e30b:	41 c6 46 80 01       	mov    BYTE PTR [r14-0x80],0x1
     135e310:	41 83 66 81 00       	and    DWORD PTR [r14-0x7f],0x0
     135e315:	66 41 83 66 85 00    	and    WORD PTR [r14-0x7b],0x0
     135e31b:	49 c7 46 88 01 00 00 	mov    QWORD PTR [r14-0x78],0x1
     135e322:	00 
     135e323:	31 c0                	xor    eax,eax
     135e325:	41 88 46 90          	mov    BYTE PTR [r14-0x70],al
     135e329:	8b 8c 24 89 02 00 00 	mov    ecx,DWORD PTR [rsp+0x289]
     135e330:	8b 94 24 8c 02 00 00 	mov    edx,DWORD PTR [rsp+0x28c]
     135e337:	41 89 4e 91          	mov    DWORD PTR [r14-0x6f],ecx
     135e33b:	41 89 56 94          	mov    DWORD PTR [r14-0x6c],edx
     135e33f:	49 83 66 98 00       	and    QWORD PTR [r14-0x68],0x0
     135e344:	41 88 46 a0          	mov    BYTE PTR [r14-0x60],al
     135e348:	8b 8c 24 82 02 00 00 	mov    ecx,DWORD PTR [rsp+0x282]

#### 0x135e499: lea    r15,[rsp+0x4a0]
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

#### 0x135e5ce: lea    r15,[r12+0xd0]
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
     135e5dd:	00 00 00 
     135e5e0:	f3 41 0f 7f 84 24 b9 	movdqu XMMWORD PTR [r12+0xb9],xmm0
     135e5e7:	00 00 00 
     135e5ea:	4c 89 ff             	mov    rdi,r15
     135e5ed:	e8 04 b4 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e5f2:	49 8d ac 24 e0 00 00 	lea    rbp,[r12+0xe0]
     135e5f9:	00 
     135e5fa:	48 89 ef             	mov    rdi,rbp
     135e5fd:	e8 f4 b3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     135e602:	4d 8d ac 24 f0 00 00 	lea    r13,[r12+0xf0]
     135e609:	00 
     135e60a:	48 8d b4 24 60 0f 00 	lea    rsi,[rsp+0xf60]
     135e611:	00 
     135e612:	4c 89 ef             	mov    rdi,r13
     135e615:	e8 d6 98 77 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
     135e61a:	49 83 a4 24 20 01 00 	and    QWORD PTR [r12+0x120],0x0
     135e621:	00 00 
     135e623:	49 83 a4 24 30 01 00 	and    QWORD PTR [r12+0x130],0x0
     135e62a:	00 00 
     135e62c:	41 88 9c 24 40 01 00 	mov    BYTE PTR [r12+0x140],bl
     135e633:	00 
     135e634:	41 88 9c 24 d0 01 00 	mov    BYTE PTR [r12+0x1d0],bl
     135e63b:	00 
     135e63c:	41 88 9c 24 d8 01 00 	mov    BYTE PTR [r12+0x1d8],bl
     135e643:	00 
     135e644:	41 88 9c 24 f8 01 00 	mov    BYTE PTR [r12+0x1f8],bl
     135e64b:	00 
     135e64c:	41 88 9c 24 00 02 00 	mov    BYTE PTR [r12+0x200],bl
     135e653:	00 

#### 0x135ec5e: mov    r15,QWORD PTR [rsp+0x10b0]
     135ec1f:	4c 89 f7             	mov    rdi,r14
     135ec22:	e8 21 5c 75 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
     135ec27:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135ec2e:	00 
     135ec2f:	e8 36 b3 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ec34:	48 8b 9c 24 00 01 00 	mov    rbx,QWORD PTR [rsp+0x100]
     135ec3b:	00 
     135ec3c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135ec3f:	4c 89 23             	mov    QWORD PTR [rbx],r12
     135ec42:	48 85 ff             	test   rdi,rdi
     135ec45:	74 09                	je     135ec50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a41d4>
     135ec47:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec4a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135ec4d:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
     135ec50:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ec57:	00 
     135ec58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec5b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ec5e:	4c 8b bc 24 b0 10 00 	mov    r15,QWORD PTR [rsp+0x10b0]
     135ec65:	00 
     135ec66:	48 89 c3             	mov    rbx,rax
     135ec69:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec6c:	4c 89 ff             	mov    rdi,r15
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

#### 0x135ec89: mov    r15,rax
     135ec50:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ec57:	00 
     135ec58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec5b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ec5e:	4c 8b bc 24 b0 10 00 	mov    r15,QWORD PTR [rsp+0x10b0]
     135ec65:	00 
     135ec66:	48 89 c3             	mov    rbx,rax
     135ec69:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec6c:	4c 89 ff             	mov    rdi,r15
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

#### 0x135f7cc: lea    r15,[r14+0x740]
     135f768:	49 89 86 70 06 00 00 	mov    QWORD PTR [r14+0x670],rax
     135f76f:	49 83 a6 98 06 00 00 	and    QWORD PTR [r14+0x698],0x0
     135f776:	00 
     135f777:	49 8d 86 a8 06 00 00 	lea    rax,[r14+0x6a8]
     135f77e:	f3 41 0f 7f 86 a8 06 	movdqu XMMWORD PTR [r14+0x6a8],xmm0
     135f785:	00 00 
     135f787:	f3 41 0f 7f 86 78 06 	movdqu XMMWORD PTR [r14+0x678],xmm0
     135f78e:	00 00 
     135f790:	f3 41 0f 7f 86 84 06 	movdqu XMMWORD PTR [r14+0x684],xmm0
     135f797:	00 00 
     135f799:	49 89 86 a0 06 00 00 	mov    QWORD PTR [r14+0x6a0],rax
     135f7a0:	41 88 9e b8 06 00 00 	mov    BYTE PTR [r14+0x6b8],bl
     135f7a7:	41 88 9e 18 07 00 00 	mov    BYTE PTR [r14+0x718],bl
     135f7ae:	49 8d 86 28 07 00 00 	lea    rax,[r14+0x728]
     135f7b5:	f3 41 0f 7f 86 28 07 	movdqu XMMWORD PTR [r14+0x728],xmm0
     135f7bc:	00 00 
     135f7be:	49 89 86 20 07 00 00 	mov    QWORD PTR [r14+0x720],rax
     135f7c5:	4d 89 be 38 07 00 00 	mov    QWORD PTR [r14+0x738],r15
     135f7cc:	4d 8d be 40 07 00 00 	lea    r15,[r14+0x740]
     135f7d3:	48 8d b4 24 00 0a 00 	lea    rsi,[rsp+0xa00]
     135f7da:	00 
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

#### 0x135f86f: lea    r15,[rsp+0xfa0]
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
     135f8c4:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     135f8c9:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
     135f8cd:	41 0f 29 86 c0 07 00 	movaps XMMWORD PTR [r14+0x7c0],xmm0
     135f8d4:	00 
     135f8d5:	0f 57 c0             	xorps  xmm0,xmm0
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

#### 0x135f92c: lea    r15,[r14+0x840]
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
     135f948:	48 39 c8             	cmp    rax,rcx
     135f94b:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135f950:	74 23                	je     135f975 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4ef9>
     135f952:	48 8d 8c 24 c0 0a 00 	lea    rcx,[rsp+0xac0]
     135f959:	00 
     135f95a:	49 89 86 60 08 00 00 	mov    QWORD PTR [r14+0x860],rax
     135f961:	eb 0c                	jmp    135f96f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4ef3>
     135f963:	49 8d 8e 60 08 00 00 	lea    rcx,[r14+0x860]
     135f96a:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135f96f:	48 83 21 00          	and    QWORD PTR [rcx],0x0
     135f973:	eb 18                	jmp    135f98d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4f11>
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
     135f9a9:	48 39 c8             	cmp    rax,rcx

#### 0x135faa0: lea    r15,[r14+0x9f0]
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

#### 0x135fb45: mov    r15,QWORD PTR [rsp+0x70]
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

### FINAL r15 definition before install: 0x135fb45: mov    r15,QWORD PTR [rsp+0x70]
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

### r12: 20 definitions; last 10
#### 0x135dabf: lea    r12,[rsp+0x5f0]
     135da7b:	00 
     135da7c:	e8 ed fd 95 ff       	call   cbd86e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a80e>
     135da81:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135da88:	00 
     135da89:	e8 d2 92 95 ff       	call   cb6d60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203d00>
     135da8e:	48 8b bc 24 a8 10 00 	mov    rdi,QWORD PTR [rsp+0x10a8]
     135da95:	00 
     135da96:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135da99:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135da9c:	48 89 c3             	mov    rbx,rax
     135da9f:	48 8d bc 24 e0 08 00 	lea    rdi,[rsp+0x8e0]
     135daa6:	00 
     135daa7:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135daae:	00 
     135daaf:	e8 32 f5 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135dab4:	48 8b 84 24 d8 00 00 	mov    rax,QWORD PTR [rsp+0xd8]
     135dabb:	00 
     135dabc:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135dabf:	4c 8d a4 24 f0 05 00 	lea    r12,[rsp+0x5f0]
     135dac6:	00 
     135dac7:	41 c7 44 24 b0 01 00 	mov    DWORD PTR [r12-0x50],0x10001
     135dace:	01 00 
     135dad0:	45 31 ed             	xor    r13d,r13d
     135dad3:	45 88 6c 24 b4       	mov    BYTE PTR [r12-0x4c],r13b
     135dad8:	49 c7 44 24 b8 64 00 	mov    QWORD PTR [r12-0x48],0x64
     135dadf:	00 00 
     135dae1:	49 89 5c 24 c0       	mov    QWORD PTR [r12-0x40],rbx
     135dae6:	48 b8 fa 00 00 00 fa 	movabs rax,0xfa000000fa
     135daed:	00 00 00 
     135daf0:	49 89 44 24 c8       	mov    QWORD PTR [r12-0x38],rax
     135daf5:	41 c7 44 24 d0 fa 00 	mov    DWORD PTR [r12-0x30],0xfa
     135dafc:	00 00 
     135dafe:	8b 44 24 40          	mov    eax,DWORD PTR [rsp+0x40]
     135db02:	41 88 44 24 d4       	mov    BYTE PTR [r12-0x2c],al
     135db07:	8b 44 24 58          	mov    eax,DWORD PTR [rsp+0x58]
     135db0b:	41 88 44 24 d5       	mov    BYTE PTR [r12-0x2b],al
     135db10:	8b 44 24 50          	mov    eax,DWORD PTR [rsp+0x50]
     135db14:	41 88 44 24 d6       	mov    BYTE PTR [r12-0x2a],al
     135db19:	66 bb 01 01          	mov    bx,0x101
     135db1d:	66 41 89 5c 24 d7    	mov    WORD PTR [r12-0x29],bx
     135db23:	41 c6 44 24 d9 01    	mov    BYTE PTR [r12-0x27],0x1
     135db29:	f3 0f 7e 05 8f f5 02 	movq   xmm0,QWORD PTR [rip+0xffffffffff02f58f]        # 38d0c0 <_ZTSSt12bad_any_cast@@Base-0x3108>
     135db30:	ff 
     135db31:	66 41 0f d6 44 24 dc 	movq   QWORD PTR [r12-0x24],xmm0
     135db38:	49 c7 44 24 e8 d0 07 	mov    QWORD PTR [r12-0x18],0x7d0
     135db3f:	00 00 
     135db41:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135db48:	00 
     135db49:	49 89 44 24 f0       	mov    QWORD PTR [r12-0x10],rax
     135db4e:	48 8d b4 24 e0 08 00 	lea    rsi,[rsp+0x8e0]

#### 0x135dcf8: mov    r12,rax
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
     135dd3c:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dd3f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135dd44:	48 8b bc 24 a8 10 00 	mov    rdi,QWORD PTR [rsp+0x10a8]
     135dd4b:	00 
     135dd4c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dd4f:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dd52:	49 89 c7             	mov    r15,rax
     135dd55:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     135dd58:	48 89 df             	mov    rdi,rbx
     135dd5b:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135dd5e:	48 8d bc 24 50 08 00 	lea    rdi,[rsp+0x850]
     135dd65:	00 

#### 0x135de6c: pop    r12
     135de21:	b8 a0 0f 00 00       	mov    eax,0xfa0
     135de26:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     135de2d:	00 
     135de2e:	b8 d0 07 00 00       	mov    eax,0x7d0
     135de33:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     135de3a:	00 
     135de3b:	c7 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],0x0
     135de42:	00 00 00 00 
     135de46:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135de49:	e8 ce 02 96 ff       	call   cbe11c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b0bc>
     135de4e:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135de51:	e8 12 03 96 ff       	call   cbe168 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b108>
     135de56:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135de59:	48 8d 35 50 f4 07 ff 	lea    rsi,[rip+0xffffffffff07f450]        # 3dd2b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2cff>
     135de60:	48 8d 0d 69 f4 07 ff 	lea    rcx,[rip+0xffffffffff07f469]        # 3dd2d0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d1f>
     135de67:	6a 17                	push   0x17
     135de69:	5d                   	pop    rbp
     135de6a:	6a 19                	push   0x19
     135de6c:	41 5c                	pop    r12
     135de6e:	48 89 ea             	mov    rdx,rbp
     135de71:	4d 89 e0             	mov    r8,r12
     135de74:	45 31 c9             	xor    r9d,r9d
     135de77:	e8 e2 96 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
     135de7c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135de7f:	4c 8d 3d 6a f4 07 ff 	lea    r15,[rip+0xffffffffff07f46a]        # 3dd2f0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d3f>
     135de86:	4c 8d 35 83 f4 07 ff 	lea    r14,[rip+0xffffffffff07f483]        # 3dd310 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d5f>
     135de8d:	6a 1c                	push   0x1c
     135de8f:	41 5d                	pop    r13
     135de91:	4c 89 fe             	mov    rsi,r15
     135de94:	48 89 ea             	mov    rdx,rbp
     135de97:	4c 89 f1             	mov    rcx,r14
     135de9a:	4d 89 e8             	mov    r8,r13
     135de9d:	41 b9 10 27 00 00    	mov    r9d,0x2710
     135dea3:	68 60 ea 00 00       	push   0xea60
     135dea8:	6a 00                	push   0x0
     135deaa:	e8 43 97 28 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     135deaf:	58                   	pop    rax
     135deb0:	59                   	pop    rcx
     135deb1:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135deb4:	e8 43 02 96 ff       	call   cbe0fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b09c>
     135deb9:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax
     135dec0:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135dec3:	e8 80 02 96 ff       	call   cbe148 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b0e8>
     135dec8:	89 84 24 ec 00 00 00 	mov    DWORD PTR [rsp+0xec],eax
     135decf:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135ded2:	48 8d 35 d7 f3 07 ff 	lea    rsi,[rip+0xffffffffff07f3d7]        # 3dd2b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2cff>
     135ded9:	48 89 ea             	mov    rdx,rbp
     135dedc:	48 8d 0d ed f3 07 ff 	lea    rcx,[rip+0xffffffffff07f3ed]        # 3dd2d0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2d1f>
     135dee3:	4d 89 e0             	mov    r8,r12
     135dee6:	45 31 c9             	xor    r9d,r9d

#### 0x135df65: mov    r12,QWORD PTR [rsp+0x78]
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

#### 0x135e426: lea    r12,[rsp+0xf60]
     135e3d6:	8b 84 24 5f 02 00 00 	mov    eax,DWORD PTR [rsp+0x25f]
     135e3dd:	8b 8c 24 62 02 00 00 	mov    ecx,DWORD PTR [rsp+0x262]
     135e3e4:	41 89 4e e4          	mov    DWORD PTR [r14-0x1c],ecx
     135e3e8:	41 89 46 e1          	mov    DWORD PTR [r14-0x1f],eax
     135e3ec:	49 c7 46 e8 f4 01 00 	mov    QWORD PTR [r14-0x18],0x1f4
     135e3f3:	00 
     135e3f4:	49 83 66 f8 00       	and    QWORD PTR [r14-0x8],0x0
     135e3f9:	41 83 66 f0 00       	and    DWORD PTR [r14-0x10],0x0
     135e3fe:	4c 89 f7             	mov    rdi,r14
     135e401:	4c 89 ee             	mov    rsi,r13
     135e404:	e8 8b e6 96 ff       	call   ccca94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219a34>
     135e409:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
     135e410:	00 
     135e411:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
     135e418:	00 00 
     135e41a:	f3 0f 7f 84 24 58 05 	movdqu XMMWORD PTR [rsp+0x558],xmm0
     135e421:	00 00 
     135e423:	48 85 c0             	test   rax,rax
     135e426:	4c 8d a4 24 60 0f 00 	lea    r12,[rsp+0xf60]
     135e42d:	00 
     135e42e:	74 05                	je     135e435 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a39b9>
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

#### 0x135e53b: mov    r12,rax
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

#### 0x135ec4d: mov    r12,QWORD PTR [rbx]
     135ec0b:	48 89 df             	mov    rdi,rbx
     135ec0e:	4c 89 ee             	mov    rsi,r13
     135ec11:	e8 06 ac 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     135ec16:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     135ec1a:	e8 67 f8 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     135ec1f:	4c 89 f7             	mov    rdi,r14
     135ec22:	e8 21 5c 75 ff       	call   ab4848 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e8>
     135ec27:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135ec2e:	00 
     135ec2f:	e8 36 b3 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     135ec34:	48 8b 9c 24 00 01 00 	mov    rbx,QWORD PTR [rsp+0x100]
     135ec3b:	00 
     135ec3c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135ec3f:	4c 89 23             	mov    QWORD PTR [rbx],r12
     135ec42:	48 85 ff             	test   rdi,rdi
     135ec45:	74 09                	je     135ec50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a41d4>
     135ec47:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec4a:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135ec4d:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
     135ec50:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
     135ec57:	00 
     135ec58:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ec5b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135ec5e:	4c 8b bc 24 b0 10 00 	mov    r15,QWORD PTR [rsp+0x10b0]
     135ec65:	00 
     135ec66:	48 89 c3             	mov    rbx,rax
     135ec69:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135ec6c:	4c 89 ff             	mov    rdi,r15
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

#### 0x135f868: lea    r12,[r14+0x780]
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
     135f8c4:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
     135f8c9:	41 0f 28 07          	movaps xmm0,XMMWORD PTR [r15]
     135f8cd:	41 0f 29 86 c0 07 00 	movaps XMMWORD PTR [r14+0x7c0],xmm0
     135f8d4:	00 
     135f8d5:	0f 57 c0             	xorps  xmm0,xmm0
     135f8d8:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
     135f8dc:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     135f8e0:	49 89 86 d0 07 00 00 	mov    QWORD PTR [r14+0x7d0],rax
     135f8e7:	49 8d be e0 07 00 00 	lea    rdi,[r14+0x7e0]
     135f8ee:	48 89 de             	mov    rsi,rbx
     135f8f1:	e8 e4 3c 97 ff       	call   cd35da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22057a>
     135f8f6:	66 41 0f 6f 47 50    	movdqa xmm0,XMMWORD PTR [r15+0x50]
     135f8fc:	41 0f 28 4f 60       	movaps xmm1,XMMWORD PTR [r15+0x60]
     135f901:	41 0f 28 57 70       	movaps xmm2,XMMWORD PTR [r15+0x70]

#### 0x135fa6b: lea    r12,[rip+0x5fb0]        # 1365a22 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aafa6>
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

#### 0x135fb4e: mov    r12,QWORD PTR [rsp+0x48]
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

### FINAL r12 definition before install: 0x135fb4e: mov    r12,QWORD PTR [rsp+0x48]
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

