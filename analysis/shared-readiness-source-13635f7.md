# Shared readiness-source candidate 0x13635f7

This constructor was selected because one rbx base has both +0x10 and +0x1b8 accesses.

## Exact constructor

/tmp/sharedready/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000013635f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8b7b>:
 13635f7:	55                   	push   rbp
 13635f8:	41 57                	push   r15
 13635fa:	41 56                	push   r14
 13635fc:	41 55                	push   r13
 13635fe:	41 54                	push   r12
 1363600:	53                   	push   rbx
 1363601:	48 81 ec d8 02 00 00 	sub    rsp,0x2d8
 1363608:	4d 89 cc             	mov    r12,r9
 136360b:	4c 89 44 24 08       	mov    QWORD PTR [rsp+0x8],r8
 1363610:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
 1363615:	49 89 d7             	mov    r15,rdx
 1363618:	49 89 f5             	mov    r13,rsi
 136361b:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
 1363620:	48 8b ac 24 30 03 00 	mov    rbp,QWORD PTR [rsp+0x330]
 1363627:	00 
 1363628:	4c 8b b4 24 18 03 00 	mov    r14,QWORD PTR [rsp+0x318]
 136362f:	00 
 1363630:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1363637:	00 00 
 1363639:	48 89 84 24 d0 02 00 	mov    QWORD PTR [rsp+0x2d0],rax
 1363640:	00 
 1363641:	bf e0 02 00 00       	mov    edi,0x2e0
 1363646:	e8 b5 a8 48 00       	call   17edf00 <_Znwm@plt>
 136364b:	48 89 c3             	mov    rbx,rax
 136364e:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 1363655:	00 
 1363656:	4c 89 e6             	mov    rsi,r12
 1363659:	e8 40 b9 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
 136365e:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
 1363662:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 1363669:	00 
 136366a:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
 136366e:	41 0f 10 4e 10       	movups xmm1,XMMWORD PTR [r14+0x10]
 1363673:	0f 29 8c 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm1
 136367a:	00 
 136367b:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
 1363682:	00 
 1363683:	48 8b 84 24 20 03 00 	mov    rax,QWORD PTR [rsp+0x320]
 136368a:	00 
 136368b:	4c 8b 30             	mov    r14,QWORD PTR [rax]
 136368e:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
 1363695:	00 
 1363696:	48 8b b4 24 28 03 00 	mov    rsi,QWORD PTR [rsp+0x328]
 136369d:	00 
 136369e:	e8 bd 0b 00 00       	call   1364260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97e4>
 13636a3:	4c 8b 65 00          	mov    r12,QWORD PTR [rbp+0x0]
 13636a7:	48 83 65 00 00       	and    QWORD PTR [rbp+0x0],0x0
 13636ac:	48 8b 8c 24 38 03 00 	mov    rcx,QWORD PTR [rsp+0x338]
 13636b3:	00 
 13636b4:	48 8b 01             	mov    rax,QWORD PTR [rcx]
 13636b7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 13636bc:	48 83 21 00          	and    QWORD PTR [rcx],0x0
 13636c0:	48 8d 05 f1 be 50 00 	lea    rax,[rip+0x50bef1]        # 186f5b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bca0>
 13636c7:	48 89 03             	mov    QWORD PTR [rbx],rax
 13636ca:	48 8d 05 ff bf 50 00 	lea    rax,[rip+0x50bfff]        # 186f6d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bdb8>
 13636d1:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
 13636d5:	48 8d 05 3c c0 50 00 	lea    rax,[rip+0x50c03c]        # 186f718 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2be00>
 13636dc:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 13636e0:	66 83 63 18 00       	and    WORD PTR [rbx+0x18],0x0
 13636e5:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
 13636ea:	0f 11 43 1c          	movups XMMWORD PTR [rbx+0x1c],xmm0
 13636ee:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
 13636f3:	4c 89 7b 30          	mov    QWORD PTR [rbx+0x30],r15
 13636f7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 13636fc:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
 1363700:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
 1363704:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
 1363709:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
 1363710:	00 
 1363711:	e8 88 b8 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
 1363716:	48 8d 83 00 01 00 00 	lea    rax,[rbx+0x100]
 136371d:	66 0f 6f 84 24 a0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xa0]
 1363724:	00 00 
 1363726:	66 0f 6f 8c 24 b0 00 	movdqa xmm1,XMMWORD PTR [rsp+0xb0]
 136372d:	00 00 
 136372f:	f3 0f 7f 8b 10 01 00 	movdqu XMMWORD PTR [rbx+0x110],xmm1
 1363736:	00 
 1363737:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
 136373e:	00 
 136373f:	48 89 8b 20 01 00 00 	mov    QWORD PTR [rbx+0x120],rcx
 1363746:	f3 0f 7f 83 00 01 00 	movdqu XMMWORD PTR [rbx+0x100],xmm0
 136374d:	00 
 136374e:	45 31 ff             	xor    r15d,r15d
 1363751:	80 bb 18 01 00 00 00 	cmp    BYTE PTR [rbx+0x118],0x0
 1363758:	49 0f 44 c7          	cmove  rax,r15
 136375c:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
 1363762:	48 89 83 28 01 00 00 	mov    QWORD PTR [rbx+0x128],rax
 1363769:	4c 89 b3 30 01 00 00 	mov    QWORD PTR [rbx+0x130],r14
 1363770:	4c 89 a3 38 01 00 00 	mov    QWORD PTR [rbx+0x138],r12
 1363777:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
 136377e:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
 1363783:	48 8d b4 24 68 01 00 	lea    rsi,[rsp+0x168]
 136378a:	00 
 136378b:	e8 d0 0a 00 00       	call   1364260 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97e4>
 1363790:	48 8b 84 24 10 03 00 	mov    rax,QWORD PTR [rsp+0x310]
 1363797:	00 
 1363798:	48 89 83 88 01 00 00 	mov    QWORD PTR [rbx+0x188],rax
 136379f:	80 bb 18 01 00 00 00 	cmp    BYTE PTR [rbx+0x118],0x0
 13637a6:	74 29                	je     13637d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8d55>
 13637a8:	48 63 83 30 01 00 00 	movsxd rax,DWORD PTR [rbx+0x130]
 13637af:	4c 8b bb 08 01 00 00 	mov    r15,QWORD PTR [rbx+0x108]
 13637b6:	48 8b 8b 10 01 00 00 	mov    rcx,QWORD PTR [rbx+0x110]
 13637bd:	48 39 c1             	cmp    rcx,rax
 13637c0:	74 0f                	je     13637d1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8d55>
 13637c2:	4c 0f af f8          	imul   r15,rax
 13637c6:	4c 89 f8             	mov    rax,r15
 13637c9:	48 99                	cqo
 13637cb:	48 f7 f9             	idiv   rcx
 13637ce:	49 89 c7             	mov    r15,rax
 13637d1:	4c 89 bb 90 01 00 00 	mov    QWORD PTR [rbx+0x190],r15
 13637d8:	48 8b 83 90 01 00 00 	mov    rax,QWORD PTR [rbx+0x190]
 13637df:	48 89 83 98 01 00 00 	mov    QWORD PTR [rbx+0x198],rax
 13637e6:	48 8b 83 90 01 00 00 	mov    rax,QWORD PTR [rbx+0x190]
 13637ed:	48 89 83 a0 01 00 00 	mov    QWORD PTR [rbx+0x1a0],rax
 13637f4:	83 a3 a8 01 00 00 00 	and    DWORD PTR [rbx+0x1a8],0x0
 13637fb:	66 c7 83 ac 01 00 00 	mov    WORD PTR [rbx+0x1ac],0x100
 1363802:	00 01 
 1363804:	48 63 4b 24          	movsxd rcx,DWORD PTR [rbx+0x24]
 1363808:	48 63 83 30 01 00 00 	movsxd rax,DWORD PTR [rbx+0x130]
 136380f:	48 0f af c1          	imul   rax,rcx
 1363813:	b9 e8 03 00 00       	mov    ecx,0x3e8
 1363818:	48 99                	cqo
 136381a:	48 f7 f9             	idiv   rcx
 136381d:	48 89 83 b0 01 00 00 	mov    QWORD PTR [rbx+0x1b0],rax
 1363824:	c6 83 b8 01 00 00 00 	mov    BYTE PTR [rbx+0x1b8],0x0
 136382b:	66 0f ef c0          	pxor   xmm0,xmm0
 136382f:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
 1363836:	00 00 
 1363838:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
 136383f:	00 00 
 1363841:	b8 00 00 80 3f       	mov    eax,0x3f800000
 1363846:	89 84 24 f0 00 00 00 	mov    DWORD PTR [rsp+0xf0],eax
 136384d:	f3 0f 7f 84 24 f8 00 	movdqu XMMWORD PTR [rsp+0xf8],xmm0
 1363854:	00 00 
 1363856:	f3 0f 7f 84 24 08 01 	movdqu XMMWORD PTR [rsp+0x108],xmm0
 136385d:	00 00 
 136385f:	89 84 24 18 01 00 00 	mov    DWORD PTR [rsp+0x118],eax
 1363866:	66 0f 7f 84 24 20 01 	movdqa XMMWORD PTR [rsp+0x120],xmm0
 136386d:	00 00 
 136386f:	48 83 a4 24 30 01 00 	and    QWORD PTR [rsp+0x130],0x0
 1363876:	00 00 
 1363878:	66 0f 7f 83 c0 01 00 	movdqa XMMWORD PTR [rbx+0x1c0],xmm0
 136387f:	00 
 1363880:	48 83 a3 d0 01 00 00 	and    QWORD PTR [rbx+0x1d0],0x0
 1363887:	00 
 1363888:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 136388f:	00 
 1363890:	e8 8f 08 97 ff       	call   cd4124 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2210c4>
 1363895:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 136389c:	00 
 136389d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13638a0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 13638a4:	48 8d 8b c0 01 00 00 	lea    rcx,[rbx+0x1c0]
 13638ab:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
 13638b0:	48 87 83 d0 01 00 00 	xchg   QWORD PTR [rbx+0x1d0],rax
 13638b7:	e8 0e 6a 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
 13638bc:	48 8b 83 d0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1d0]
 13638c3:	48 87 83 c8 01 00 00 	xchg   QWORD PTR [rbx+0x1c8],rax
 13638ca:	48 8b 83 d0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1d0]
 13638d1:	48 87 83 c0 01 00 00 	xchg   QWORD PTR [rbx+0x1c0],rax
 13638d8:	4c 8d ab d8 01 00 00 	lea    r13,[rbx+0x1d8]
 13638df:	4c 8d bb e0 01 00 00 	lea    r15,[rbx+0x1e0]
 13638e6:	66 0f ef c0          	pxor   xmm0,xmm0
 13638ea:	f3 0f 7f 83 d8 01 00 	movdqu XMMWORD PTR [rbx+0x1d8],xmm0
 13638f1:	00 
 13638f2:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 13638f9:	00 
 13638fa:	48 8d b4 24 d0 00 00 	lea    rsi,[rsp+0xd0]
 1363901:	00 
 1363902:	e8 f0 5c 0a 00       	call   14095f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb7b>
 1363907:	48 8b ac 24 b0 02 00 	mov    rbp,QWORD PTR [rsp+0x2b0]
 136390e:	00 
 136390f:	6a 01                	push   0x1
 1363911:	58                   	pop    rax
 1363912:	87 45 00             	xchg   DWORD PTR [rbp+0x0],eax
 1363915:	6a 30                	push   0x30
 1363917:	5f                   	pop    rdi
 1363918:	e8 e3 a5 48 00       	call   17edf00 <_Znwm@plt>
 136391d:	49 89 c4             	mov    r12,rax
 1363920:	48 83 a4 24 b0 02 00 	and    QWORD PTR [rsp+0x2b0],0x0
 1363927:	00 00 
 1363929:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
 1363930:	00 
 1363931:	48 89 2e             	mov    QWORD PTR [rsi],rbp
 1363934:	48 8d 05 8d c6 50 00 	lea    rax,[rip+0x50c68d]        # 186ffc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c6b0>
 136393b:	49 89 04 24          	mov    QWORD PTR [r12],rax
 136393f:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
 1363944:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
 1363949:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
 136394e:	4c 89 e0             	mov    rax,r12
 1363951:	48 83 c0 18          	add    rax,0x18
 1363955:	66 0f ef c0          	pxor   xmm0,xmm0
 1363959:	f3 41 0f 7f 44 24 18 	movdqu XMMWORD PTR [r12+0x18],xmm0
 1363960:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
 1363965:	49 89 6c 24 28       	mov    QWORD PTR [r12+0x28],rbp
 136396a:	e8 03 08 97 ff       	call   cd4172 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x221112>
 136396f:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1363976:	00 
 1363977:	e8 f8 5c 0a 00       	call   1409674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ebf8>
 136397c:	4c 8d b4 24 90 02 00 	lea    r14,[rsp+0x290]
 1363983:	00 
 1363984:	49 83 26 00          	and    QWORD PTR [r14],0x0
 1363988:	4c 89 ef             	mov    rdi,r13
 136398b:	4c 89 e6             	mov    rsi,r12
 136398e:	e8 03 5d 0a 00       	call   1409696 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec1a>
 1363993:	4c 89 f7             	mov    rdi,r14
 1363996:	e8 1b 5d 0a 00       	call   14096b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec3a>
 136399b:	6a 18                	push   0x18
 136399d:	5f                   	pop    rdi
 136399e:	e8 5d a5 48 00       	call   17edf00 <_Znwm@plt>
 13639a3:	48 8d 0d 4e c5 4b 00 	lea    rcx,[rip+0x4bc54e]        # 181fef8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15bb8>
 13639aa:	48 89 08             	mov    QWORD PTR [rax],rcx
 13639ad:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
 13639b2:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 13639b6:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp
 13639ba:	4c 8d b4 24 40 01 00 	lea    r14,[rsp+0x140]
 13639c1:	00 
 13639c2:	49 83 26 00          	and    QWORD PTR [r14],0x0
 13639c6:	4c 89 ff             	mov    rdi,r15
 13639c9:	48 89 c6             	mov    rsi,rax
 13639cc:	e8 c5 bd 73 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
 13639d1:	4c 89 f7             	mov    rdi,r14
 13639d4:	e8 8d 93 74 ff       	call   aacd66 <JNI_OnUnload@@Base+0x34633>
 13639d9:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 13639e0:	00 
 13639e1:	e8 8e 5c 0a 00       	call   1409674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ebf8>
 13639e6:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 13639ed:	00 
 13639ee:	e8 cb 5c 0a 00       	call   14096be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec42>
 13639f3:	66 0f ef c0          	pxor   xmm0,xmm0
 13639f7:	f3 0f 7f 83 f8 01 00 	movdqu XMMWORD PTR [rbx+0x1f8],xmm0
 13639fe:	00 
 13639ff:	f3 0f 7f 83 e8 01 00 	movdqu XMMWORD PTR [rbx+0x1e8],xmm0
 1363a06:	00 
 1363a07:	b8 00 00 80 3f       	mov    eax,0x3f800000
 1363a0c:	89 83 08 02 00 00    	mov    DWORD PTR [rbx+0x208],eax
 1363a12:	66 0f 7f 83 10 02 00 	movdqa XMMWORD PTR [rbx+0x210],xmm0
 1363a19:	00 
 1363a1a:	66 0f 7f 83 20 02 00 	movdqa XMMWORD PTR [rbx+0x220],xmm0
 1363a21:	00 
 1363a22:	89 83 30 02 00 00    	mov    DWORD PTR [rbx+0x230],eax
 1363a28:	f3 0f 7f 83 38 02 00 	movdqu XMMWORD PTR [rbx+0x238],xmm0
 1363a2f:	00 
 1363a30:	f3 0f 7f 83 48 02 00 	movdqu XMMWORD PTR [rbx+0x248],xmm0
 1363a37:	00 
 1363a38:	6a 38                	push   0x38
 1363a3a:	5f                   	pop    rdi
 1363a3b:	e8 c0 a4 48 00       	call   17edf00 <_Znwm@plt>
 1363a40:	48 8d 0d 69 bd 50 00 	lea    rcx,[rip+0x50bd69]        # 186f7b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2be98>
 1363a47:	48 89 08             	mov    QWORD PTR [rax],rcx
 1363a4a:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1363a4f:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 1363a53:	4c 8b 7c 24 68       	mov    r15,QWORD PTR [rsp+0x68]
 1363a58:	49 8b 4f 20          	mov    rcx,QWORD PTR [r15+0x20]
 1363a5c:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
 1363a60:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
 1363a65:	f3 41 0f 6f 4f 10    	movdqu xmm1,XMMWORD PTR [r15+0x10]
 1363a6b:	f3 0f 7f 48 20       	movdqu XMMWORD PTR [rax+0x20],xmm1
 1363a70:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
 1363a75:	48 89 83 58 02 00 00 	mov    QWORD PTR [rbx+0x258],rax
 1363a7c:	48 8d 83 60 02 00 00 	lea    rax,[rbx+0x260]
 1363a83:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 1363a88:	48 83 a3 70 02 00 00 	and    QWORD PTR [rbx+0x270],0x0
 1363a8f:	00 
 1363a90:	66 0f ef c0          	pxor   xmm0,xmm0
 1363a94:	66 0f 7f 83 60 02 00 	movdqa XMMWORD PTR [rbx+0x260],xmm0
 1363a9b:	00 
 1363a9c:	4c 8d b3 78 02 00 00 	lea    r14,[rbx+0x278]
 1363aa3:	48 8b b3 b0 01 00 00 	mov    rsi,QWORD PTR [rbx+0x1b0]
 1363aaa:	48 01 f6             	add    rsi,rsi
 1363aad:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
 1363ab4:	00 
 1363ab5:	83 22 00             	and    DWORD PTR [rdx],0x0
 1363ab8:	4c 89 f7             	mov    rdi,r14
 1363abb:	e8 36 7e 86 ff       	call   bcb8f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x118896>
 1363ac0:	4c 89 74 24 48       	mov    QWORD PTR [rsp+0x48],r14
 1363ac5:	48 8d 43 19          	lea    rax,[rbx+0x19]
 1363ac9:	66 0f ef c0          	pxor   xmm0,xmm0
 1363acd:	f3 0f 7f 83 9a 02 00 	movdqu XMMWORD PTR [rbx+0x29a],xmm0
 1363ad4:	00 
 1363ad5:	66 0f 7f 83 90 02 00 	movdqa XMMWORD PTR [rbx+0x290],xmm0
 1363adc:	00 
 1363add:	48 89 83 b0 02 00 00 	mov    QWORD PTR [rbx+0x2b0],rax
 1363ae4:	4c 8b b3 90 01 00 00 	mov    r14,QWORD PTR [rbx+0x190]
 1363aeb:	6a 30                	push   0x30
 1363aed:	5f                   	pop    rdi
 1363aee:	e8 0d a4 48 00       	call   17edf00 <_Znwm@plt>
 1363af3:	49 89 c5             	mov    r13,rax
 1363af6:	66 0f ef c0          	pxor   xmm0,xmm0
 1363afa:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 1363aff:	48 8d 05 ca cd 49 00 	lea    rax,[rip+0x49cdca]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
 1363b06:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
 1363b0a:	4d 8d 65 18          	lea    r12,[r13+0x18]
 1363b0e:	48 8b 83 30 01 00 00 	mov    rax,QWORD PTR [rbx+0x130]
 1363b15:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 1363b19:	4d 89 75 20          	mov    QWORD PTR [r13+0x20],r14
 1363b1d:	4d 89 75 28          	mov    QWORD PTR [r13+0x28],r14
 1363b21:	4c 89 a3 b8 02 00 00 	mov    QWORD PTR [rbx+0x2b8],r12
 1363b28:	4c 89 ab c0 02 00 00 	mov    QWORD PTR [rbx+0x2c0],r13
 1363b2f:	4c 8b 73 38          	mov    r14,QWORD PTR [rbx+0x38]
 1363b33:	66 49 0f 6e c5       	movq   xmm0,r13
 1363b38:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
 1363b3d:	66 49 0f 6e cc       	movq   xmm1,r12
 1363b42:	48 83 a4 24 70 02 00 	and    QWORD PTR [rsp+0x270],0x0
 1363b49:	00 00 
 1363b4b:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
 1363b4f:	66 0f 7f 4c 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm1
 1363b55:	48 83 a4 24 80 02 00 	and    QWORD PTR [rsp+0x280],0x0
 1363b5c:	00 00 
 1363b5e:	6a 30                	push   0x30
 1363b60:	5f                   	pop    rdi
 1363b61:	e8 9a a3 48 00       	call   17edf00 <_Znwm@plt>
 1363b66:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1363b6b:	48 89 08             	mov    QWORD PTR [rax],rcx
 1363b6e:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
 1363b73:	f3 41 0f 6f 4f 10    	movdqu xmm1,XMMWORD PTR [r15+0x10]
 1363b79:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 1363b7e:	f3 0f 7f 48 18       	movdqu XMMWORD PTR [rax+0x18],xmm1
 1363b83:	49 8b 4f 20          	mov    rcx,QWORD PTR [r15+0x20]
 1363b87:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
 1363b8b:	48 89 84 24 70 02 00 	mov    QWORD PTR [rsp+0x270],rax
 1363b92:	00 
 1363b93:	48 8d 05 74 e7 7f ff 	lea    rax,[rip+0xffffffffff7fe774]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
 1363b9a:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
 1363ba1:	00 
 1363ba2:	48 8d 05 65 5b 0a 00 	lea    rax,[rip+0xa5b65]        # 140970e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec92>
 1363ba9:	48 89 84 24 88 02 00 	mov    QWORD PTR [rsp+0x288],rax
 1363bb0:	00 
 1363bb1:	6a 38                	push   0x38
 1363bb3:	5f                   	pop    rdi
 1363bb4:	e8 47 a3 48 00       	call   17edf00 <_Znwm@plt>
 1363bb9:	48 89 c5             	mov    rbp,rax
 1363bbc:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
 1363bc3:	00 
 1363bc4:	48 8d b4 24 70 02 00 	lea    rsi,[rsp+0x270]
 1363bcb:	00 
 1363bcc:	e8 99 45 0c 00       	call   142816a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d6ee>
 1363bd1:	4c 89 75 00          	mov    QWORD PTR [rbp+0x0],r14
 1363bd5:	4c 89 65 08          	mov    QWORD PTR [rbp+0x8],r12
 1363bd9:	4c 89 6d 10          	mov    QWORD PTR [rbp+0x10],r13
 1363bdd:	c6 45 18 00          	mov    BYTE PTR [rbp+0x18],0x0
 1363be1:	48 89 e8             	mov    rax,rbp
 1363be4:	48 83 c0 20          	add    rax,0x20
 1363be8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 1363bed:	66 0f ef c0          	pxor   xmm0,xmm0
 1363bf1:	f3 0f 7f 45 20       	movdqu XMMWORD PTR [rbp+0x20],xmm0
 1363bf6:	48 83 65 30 00       	and    QWORD PTR [rbp+0x30],0x0
 1363bfb:	6a 78                	push   0x78
 1363bfd:	5f                   	pop    rdi
 1363bfe:	e8 fd a2 48 00       	call   17edf00 <_Znwm@plt>
 1363c03:	4d 89 f5             	mov    r13,r14
 1363c06:	49 89 c6             	mov    r14,rax
 1363c09:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
 1363c0d:	4c 8d a4 24 b0 02 00 	lea    r12,[rsp+0x2b0]
 1363c14:	00 
 1363c15:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
 1363c1c:	00 
 1363c1d:	4c 89 e7             	mov    rdi,r12
 1363c20:	e8 45 45 0c 00       	call   142816a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d6ee>
 1363c25:	4d 89 2e             	mov    QWORD PTR [r14],r13
 1363c28:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
 1363c2c:	4c 89 f7             	mov    rdi,r14
 1363c2f:	48 83 c7 10          	add    rdi,0x10
 1363c33:	4c 89 e6             	mov    rsi,r12
 1363c36:	e8 2f 45 0c 00       	call   142816a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d6ee>
 1363c3b:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 1363c3f:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
 1363c43:	66 0f ef c0          	pxor   xmm0,xmm0
 1363c47:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
 1363c4d:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
 1363c53:	f3 41 0f 7f 46 58    	movdqu XMMWORD PTR [r14+0x58],xmm0
 1363c59:	f3 41 0f 7f 46 68    	movdqu XMMWORD PTR [r14+0x68],xmm0
 1363c5f:	49 83 7e 20 00       	cmp    QWORD PTR [r14+0x20],0x0
 1363c64:	0f 84 6d 02 00 00    	je     1363ed7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a945b>
 1363c6a:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 1363c71:	00 
 1363c72:	e8 7d 6d 0a 00       	call   140a9f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ff78>
 1363c77:	4c 8d 64 24 78       	lea    r12,[rsp+0x78]
 1363c7c:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
 1363c81:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 1363c86:	4c 89 f6             	mov    rsi,r14
 1363c89:	e8 9a 45 0c 00       	call   1428228 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d7ac>
 1363c8e:	4c 89 e7             	mov    rdi,r12
 1363c91:	e8 8a 45 0c 00       	call   1428220 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d7a4>
 1363c96:	48 89 ab c8 02 00 00 	mov    QWORD PTR [rbx+0x2c8],rbp
 1363c9d:	48 89 ac 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rbp
 1363ca4:	00 
 1363ca5:	6a 20                	push   0x20
 1363ca7:	5f                   	pop    rdi
 1363ca8:	e8 53 a2 48 00       	call   17edf00 <_Znwm@plt>
 1363cad:	66 0f ef c0          	pxor   xmm0,xmm0
 1363cb1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 1363cb6:	48 8d 0d 23 cb 50 00 	lea    rcx,[rip+0x50cb23]        # 18707e0 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe98a00>
 1363cbd:	48 89 08             	mov    QWORD PTR [rax],rcx
 1363cc0:	48 89 68 18          	mov    QWORD PTR [rax+0x18],rbp
 1363cc4:	48 89 83 d0 02 00 00 	mov    QWORD PTR [rbx+0x2d0],rax
 1363ccb:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1363cd2:	00 
 1363cd3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1363cd7:	e8 02 45 0c 00       	call   14281de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d762>
 1363cdc:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
 1363ce3:	00 
 1363ce4:	e8 0b 6d 0a 00       	call   140a9f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ff78>
 1363ce9:	31 ff                	xor    edi,edi
 1363ceb:	e8 96 a7 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1363cf0:	6a 40                	push   0x40
 1363cf2:	5f                   	pop    rdi
 1363cf3:	e8 08 a2 48 00       	call   17edf00 <_Znwm@plt>
 1363cf8:	49 89 c5             	mov    r13,rax
 1363cfb:	66 0f ef c0          	pxor   xmm0,xmm0
 1363cff:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 1363d04:	48 8d 05 0d cb 50 00 	lea    rax,[rip+0x50cb0d]        # 1870818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2cf00>
 1363d0b:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
 1363d0f:	0f 10 83 c8 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x2c8]
 1363d16:	48 8b 83 d0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2d0]
 1363d1d:	48 85 c0             	test   rax,rax
 1363d20:	74 05                	je     1363d27 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a92ab>
 1363d22:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
 1363d27:	48 8d 05 3a ca 50 00 	lea    rax,[rip+0x50ca3a]        # 1870768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ce50>
 1363d2e:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
 1363d32:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
 1363d37:	6a 30                	push   0x30
 1363d39:	5f                   	pop    rdi
 1363d3a:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 1363d3f:	e8 bc a1 48 00       	call   17edf00 <_Znwm@plt>
 1363d44:	49 89 c6             	mov    r14,rax
 1363d47:	4d 8d 7d 18          	lea    r15,[r13+0x18]
 1363d4b:	0f 57 c0             	xorps  xmm0,xmm0
 1363d4e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 1363d52:	48 8d 05 b7 06 4e 00 	lea    rax,[rip+0x4e06b7]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
 1363d59:	49 89 06             	mov    QWORD PTR [r14],rax
 1363d5c:	41 0f 10 45 20       	movups xmm0,XMMWORD PTR [r13+0x20]
 1363d61:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
 1363d65:	48 85 c0             	test   rax,rax
 1363d68:	74 05                	je     1363d6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a92f3>
 1363d6a:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
 1363d6f:	4d 89 f4             	mov    r12,r14
 1363d72:	49 83 c4 18          	add    r12,0x18
 1363d76:	48 8d 05 2b ca 50 00 	lea    rax,[rip+0x50ca2b]        # 18707a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ce90>
 1363d7d:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 1363d81:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
 1363d86:	31 ff                	xor    edi,edi
 1363d88:	e8 25 a7 73 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 1363d8d:	4d 89 65 30          	mov    QWORD PTR [r13+0x30],r12
 1363d91:	4d 89 75 38          	mov    QWORD PTR [r13+0x38],r14
 1363d95:	31 ff                	xor    edi,edi
 1363d97:	e8 16 a7 73 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 1363d9c:	66 49 0f 6e c5       	movq   xmm0,r13
 1363da1:	66 49 0f 6e cf       	movq   xmm1,r15
 1363da6:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
 1363daa:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
 1363db0:	31 ff                	xor    edi,edi
 1363db2:	e8 65 a6 73 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 1363db7:	48 8b 83 c8 02 00 00 	mov    rax,QWORD PTR [rbx+0x2c8]
 1363dbe:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]
 1363dc2:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 1363dc8:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
 1363dcd:	e8 b4 a6 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1363dd2:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
 1363dd9:	00 
 1363dda:	e8 15 6c 0a 00       	call   140a9f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ff78>
 1363ddf:	31 ff                	xor    edi,edi
 1363de1:	e8 a0 a6 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1363de6:	4c 8d ab d8 02 00 00 	lea    r13,[rbx+0x2d8]
 1363ded:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 1363df2:	48 89 bb d8 02 00 00 	mov    QWORD PTR [rbx+0x2d8],rdi
 1363df9:	4c 8b b3 60 02 00 00 	mov    r14,QWORD PTR [rbx+0x260]
 1363e00:	48 8b 83 70 02 00 00 	mov    rax,QWORD PTR [rbx+0x270]
 1363e07:	4c 29 f0             	sub    rax,r14
 1363e0a:	48 3d 80 00 00 00    	cmp    rax,0x80
 1363e10:	73 5a                	jae    1363e6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a93f0>
 1363e12:	48 8d 83 70 02 00 00 	lea    rax,[rbx+0x270]
 1363e19:	4c 8b bb 68 02 00 00 	mov    r15,QWORD PTR [rbx+0x268]
 1363e20:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
 1363e27:	00 
 1363e28:	bf 80 00 00 00       	mov    edi,0x80
 1363e2d:	e8 ce a0 48 00       	call   17edf00 <_Znwm@plt>
 1363e32:	4d 29 f7             	sub    r15,r14
 1363e35:	4c 8d b4 24 40 01 00 	lea    r14,[rsp+0x140]
 1363e3c:	00 
 1363e3d:	49 89 06             	mov    QWORD PTR [r14],rax
 1363e40:	49 01 c7             	add    r15,rax
 1363e43:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 1363e47:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
 1363e4b:	48 83 e8 80          	sub    rax,0xffffffffffffff80
 1363e4f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
 1363e53:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 1363e58:	4c 89 f6             	mov    rsi,r14
 1363e5b:	e8 ba 6b 0a 00       	call   140aa1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ff9e>
 1363e60:	4c 89 f7             	mov    rdi,r14
 1363e63:	e8 2e 6c 0a 00       	call   140aa96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25001a>
 1363e68:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 1363e6c:	4c 8d 73 10          	lea    r14,[rbx+0x10]
 1363e70:	48 85 ff             	test   rdi,rdi
 1363e73:	0f 84 c2 00 00 00    	je     1363f3b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a94bf>
 1363e79:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1363e7c:	4c 89 f6             	mov    rsi,r14
 1363e7f:	ff 50 10             	call   QWORD PTR [rax+0x10]
 1363e82:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
 1363e87:	48 89 18             	mov    QWORD PTR [rax],rbx
 1363e8a:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 1363e8f:	e8 48 62 8f ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 1363e94:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
 1363e9b:	00 
 1363e9c:	e8 81 03 00 00       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
 1363ea1:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 1363ea8:	00 
 1363ea9:	e8 b8 91 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 1363eae:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1363eb5:	00 00 
 1363eb7:	48 3b 84 24 d0 02 00 	cmp    rax,QWORD PTR [rsp+0x2d0]
 1363ebe:	00 
 1363ebf:	0f 85 14 03 00 00    	jne    13641d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a975d>
 1363ec5:	48 81 c4 d8 02 00 00 	add    rsp,0x2d8
 1363ecc:	5b                   	pop    rbx
 1363ecd:	41 5c                	pop    r12
 1363ecf:	41 5d                	pop    r13
 1363ed1:	41 5e                	pop    r14
 1363ed3:	41 5f                	pop    r15
 1363ed5:	5d                   	pop    rbp
 1363ed6:	c3                   	ret
 1363ed7:	4c 8d a4 24 80 00 00 	lea    r12,[rsp+0x80]
 1363ede:	00 
 1363edf:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
 1363ee5:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
 1363eeb:	48 8d 35 ca fc fd fe 	lea    rsi,[rip+0xfffffffffefdfcca]        # 343bbc <_ZTSSt12bad_any_cast@@Base-0x4c60c>
 1363ef2:	4c 89 e7             	mov    rdi,r12
 1363ef5:	e8 f8 20 47 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
 1363efa:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1363f01:	00 
 1363f02:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
 1363f09:	48 8d 05 6c e0 0e ff 	lea    rax,[rip+0xffffffffff0ee06c]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 1363f10:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 1363f14:	48 8d 05 38 eb 00 ff 	lea    rax,[rip+0xffffffffff00eb38]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
 1363f1b:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1363f1f:	c7 47 18 14 00 00 00 	mov    DWORD PTR [rdi+0x18],0x14
 1363f26:	4c 89 e6             	mov    rsi,r12
 1363f29:	e8 7a 5d 74 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
 1363f2e:	4c 89 e7             	mov    rdi,r12
 1363f31:	e8 5a 9f 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1363f36:	e9 2f fd ff ff       	jmp    1363c6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a91ee>
 1363f3b:	66 0f ef c0          	pxor   xmm0,xmm0
 1363f3f:	4c 8d a4 24 b0 02 00 	lea    r12,[rsp+0x2b0]
 1363f46:	00 
 1363f47:	66 41 0f 7f 04 24    	movdqa XMMWORD PTR [r12],xmm0
 1363f4d:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
 1363f53:	48 8d 35 53 d3 01 ff 	lea    rsi,[rip+0xffffffffff01d353]        # 3812ad <_ZTSSt12bad_any_cast@@Base-0xef1b>
 1363f5a:	4c 89 e7             	mov    rdi,r12
 1363f5d:	e8 90 20 47 00       	call   17d5ff2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1e13>
 1363f62:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1363f69:	00 
 1363f6a:	48 c7 07 01 00 00 00 	mov    QWORD PTR [rdi],0x1
 1363f71:	48 8d 05 04 e0 0e ff 	lea    rax,[rip+0xffffffffff0ee004]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 1363f78:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 1363f7c:	48 8d 05 d0 ea 00 ff 	lea    rax,[rip+0xffffffffff00ead0]        # 372a53 <_ZTSSt12bad_any_cast@@Base-0x1d775>
 1363f83:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1363f87:	c7 47 18 a6 02 00 00 	mov    DWORD PTR [rdi+0x18],0x2a6
 1363f8e:	4c 89 e6             	mov    rsi,r12
 1363f91:	e8 12 5d 74 ff       	call   aa9ca8 <JNI_OnUnload@@Base+0x31575>
 1363f96:	4c 89 e7             	mov    rdi,r12
 1363f99:	e8 f2 9e 48 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1363f9e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
 1363fa2:	e9 d2 fe ff ff       	jmp    1363e79 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a93fd>
 1363fa7:	49 89 c6             	mov    r14,rax
 1363faa:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
 1363fb0:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
 1363fb7:	e8 f6 a4 73 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 1363fbc:	31 ff                	xor    edi,edi
 1363fbe:	e8 ef a4 73 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 1363fc3:	4c 89 ef             	mov    rdi,r13
 1363fc6:	e8 45 a0 48 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
 1363fcb:	4c 89 ef             	mov    rdi,r13
 1363fce:	e8 49 a4 73 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
 1363fd3:	eb 03                	jmp    1363fd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a955c>
 1363fd5:	49 89 c6             	mov    r14,rax
 1363fd8:	48 8b bb d0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2d0]
 1363fdf:	e8 a2 a4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1363fe4:	66 0f ef c0          	pxor   xmm0,xmm0
 1363fe8:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
 1363fee:	eb 67                	jmp    1364057 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a95db>
 1363ff0:	49 89 c6             	mov    r14,rax
 1363ff3:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1363ffa:	00 
 1363ffb:	e8 de 41 0c 00       	call   14281de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d762>
 1364000:	45 31 ff             	xor    r15d,r15d
 1364003:	eb 20                	jmp    1364025 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a95a9>
 1364005:	49 89 c6             	mov    r14,rax
 1364008:	31 ff                	xor    edi,edi
 136400a:	e8 77 a4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 136400f:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 1364014:	e8 07 42 0c 00       	call   1428220 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d7a4>
 1364019:	48 8b 7d 10          	mov    rdi,QWORD PTR [rbp+0x10]
 136401d:	e8 64 a4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1364022:	41 b7 01             	mov    r15b,0x1
 1364025:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
 136402c:	00 
 136402d:	e8 c2 69 0a 00       	call   140a9f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ff78>
 1364032:	31 ff                	xor    edi,edi
 1364034:	e8 4d a4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1364039:	66 0f ef c0          	pxor   xmm0,xmm0
 136403d:	66 0f 7f 44 24 30    	movdqa XMMWORD PTR [rsp+0x30],xmm0
 1364043:	45 84 ff             	test   r15b,r15b
 1364046:	74 0f                	je     1364057 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a95db>
 1364048:	48 89 ef             	mov    rdi,rbp
 136404b:	e8 d0 9e 48 00       	call   17edf20 <_ZdlPv@plt>
 1364050:	eb 05                	jmp    1364057 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a95db>
 1364052:	eb 00                	jmp    1364054 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a95d8>
 1364054:	49 89 c6             	mov    r14,rax
 1364057:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
 136405e:	00 
 136405f:	e8 90 69 0a 00       	call   140a9f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ff78>
 1364064:	66 0f 6f 44 24 30    	movdqa xmm0,XMMWORD PTR [rsp+0x30]
 136406a:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
 1364071:	e8 10 a4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1364076:	48 8b bb c0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2c0]
 136407d:	e8 04 a4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1364082:	48 8d bb 90 02 00 00 	lea    rdi,[rbx+0x290]
 1364089:	48 8b 83 b0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2b0]
 1364090:	b1 01                	mov    cl,0x1
 1364092:	86 08                	xchg   BYTE PTR [rax],cl
 1364094:	e8 63 b5 73 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
 1364099:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 136409e:	e8 85 76 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 13640a3:	4c 8d bb 58 02 00 00 	lea    r15,[rbx+0x258]
 13640aa:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 13640af:	e8 22 6a 0a 00       	call   140aad6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25005a>
 13640b4:	4c 89 ff             	mov    rdi,r15
 13640b7:	e8 6c 5d 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 13640bc:	4c 8d bb e8 01 00 00 	lea    r15,[rbx+0x1e8]
 13640c3:	48 8d bb 50 02 00 00 	lea    rdi,[rbx+0x250]
 13640ca:	e8 27 40 04 00       	call   13a80f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ed67a>
 13640cf:	4c 89 ff             	mov    rdi,r15
 13640d2:	e8 e7 55 0a 00       	call   14096be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec42>
 13640d7:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 13640dc:	e8 0f 6a 0a 00       	call   140aaf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250074>
 13640e1:	eb 76                	jmp    1364159 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a96dd>
 13640e3:	49 89 c6             	mov    r14,rax
 13640e6:	eb 9a                	jmp    1364082 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9606>
 13640e8:	49 89 c6             	mov    r14,rax
 13640eb:	eb b6                	jmp    13640a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9627>
 13640ed:	49 89 c6             	mov    r14,rax
 13640f0:	eb ca                	jmp    13640bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9640>
 13640f2:	eb 24                	jmp    1364118 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a969c>
 13640f4:	49 89 c6             	mov    r14,rax
 13640f7:	49 8b 7c 24 18       	mov    rdi,QWORD PTR [r12+0x18]
 13640fc:	e8 6d 55 0a 00       	call   140966e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ebf2>
 1364101:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
 1364108:	00 
 1364109:	e8 66 55 0a 00       	call   1409674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ebf8>
 136410e:	4c 89 e7             	mov    rdi,r12
 1364111:	e8 0a 9e 48 00       	call   17edf20 <_ZdlPv@plt>
 1364116:	eb 03                	jmp    136411b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a969f>
 1364118:	49 89 c6             	mov    r14,rax
 136411b:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
 1364122:	00 
 1364123:	e8 4c 55 0a 00       	call   1409674 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ebf8>
 1364128:	eb 03                	jmp    136412d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a96b1>
 136412a:	49 89 c6             	mov    r14,rax
 136412d:	4c 89 ff             	mov    rdi,r15
 1364130:	e8 31 8c 74 ff       	call   aacd66 <JNI_OnUnload@@Base+0x34633>
 1364135:	4c 89 ef             	mov    rdi,r13
 1364138:	e8 79 55 0a 00       	call   14096b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec3a>
 136413d:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 1364142:	e8 f3 00 97 ff       	call   cd423a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2211da>
 1364147:	eb 03                	jmp    136414c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a96d0>
 1364149:	49 89 c6             	mov    r14,rax
 136414c:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
 1364153:	00 
 1364154:	e8 65 55 0a 00       	call   14096be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24ec42>
 1364159:	49 89 df             	mov    r15,rbx
 136415c:	49 81 c7 38 01 00 00 	add    r15,0x138
 1364163:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 1364168:	e8 b5 00 00 00       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
 136416d:	4c 89 ff             	mov    rdi,r15
 1364170:	e8 67 5f 8f ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 1364175:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 136417a:	e8 e7 8e 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 136417f:	48 83 7c 24 20 00    	cmp    QWORD PTR [rsp+0x20],0x0
 1364185:	74 0b                	je     1364192 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9716>
 1364187:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
 136418c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 136418f:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1364192:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 1364197:	e8 40 5f 8f ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 136419c:	48 8d bc 24 68 01 00 	lea    rdi,[rsp+0x168]
 13641a3:	00 
 13641a4:	e8 79 00 00 00       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
 13641a9:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 13641b0:	00 
 13641b1:	e8 b0 8e 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 13641b6:	48 89 df             	mov    rdi,rbx
 13641b9:	e8 62 9d 48 00       	call   17edf20 <_ZdlPv@plt>
 13641be:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 13641c5:	00 00 
 13641c7:	48 3b 84 24 d0 02 00 	cmp    rax,QWORD PTR [rsp+0x2d0]
 13641ce:	00 
 13641cf:	75 08                	jne    13641d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a975d>
 13641d1:	4c 89 f7             	mov    rdi,r14
 13641d4:	e8 f7 ba 70 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 13641d9:	e8 d2 b8 48 00       	call   17efab0 <__stack_chk_fail@plt>
 13641de:	49 89 c6             	mov    r14,rax
 13641e1:	4c 89 ef             	mov    rdi,r13
 13641e4:	e8 3f 5c 71 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
 13641e9:	48 8b bb d0 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2d0]
 13641f0:	e8 91 a2 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 13641f5:	31 c0                	xor    eax,eax
 13641f7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 13641fc:	e9 75 fe ff ff       	jmp    1364076 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a95fa>
 1364201:	cc                   	int3

## Capability/readiness fields
 136366e:	41 0f 10 4e 10       	movups xmm1,XMMWORD PTR [r14+0x10]
 13636dc:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 136381d:	48 89 83 b0 01 00 00 	mov    QWORD PTR [rbx+0x1b0],rax
 1363824:	c6 83 b8 01 00 00 00 	mov    BYTE PTR [rbx+0x1b8],0x0
 1363a65:	f3 41 0f 6f 4f 10    	movdqu xmm1,XMMWORD PTR [r15+0x10]
 1363aa3:	48 8b b3 b0 01 00 00 	mov    rsi,QWORD PTR [rbx+0x1b0]
 1363b73:	f3 41 0f 6f 4f 10    	movdqu xmm1,XMMWORD PTR [r15+0x10]
 1363e43:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
 1363e6c:	4c 8d 73 10          	lea    r14,[rbx+0x10]
 1363f1b:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1363f83:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax

## High address constants/vptr candidates
 13636c0:	48 8d 05 f1 be 50 00 	lea    rax,[rip+0x50bef1]        # 186f5b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bca0>
 13636ca:	48 8d 05 ff bf 50 00 	lea    rax,[rip+0x50bfff]        # 186f6d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bdb8>
 13636d5:	48 8d 05 3c c0 50 00 	lea    rax,[rip+0x50c03c]        # 186f718 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2be00>
 1363934:	48 8d 05 8d c6 50 00 	lea    rax,[rip+0x50c68d]        # 186ffc8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2c6b0>
 13639a3:	48 8d 0d 4e c5 4b 00 	lea    rcx,[rip+0x4bc54e]        # 181fef8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x15bb8>
 1363a40:	48 8d 0d 69 bd 50 00 	lea    rcx,[rip+0x50bd69]        # 186f7b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2be98>
 1363aff:	48 8d 05 ca cd 49 00 	lea    rax,[rip+0x49cdca]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
 1363cb6:	48 8d 0d 23 cb 50 00 	lea    rcx,[rip+0x50cb23]        # 18707e0 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe98a00>
 1363d04:	48 8d 05 0d cb 50 00 	lea    rax,[rip+0x50cb0d]        # 1870818 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2cf00>
 1363d27:	48 8d 05 3a ca 50 00 	lea    rax,[rip+0x50ca3a]        # 1870768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ce50>
 1363d52:	48 8d 05 b7 06 4e 00 	lea    rax,[rip+0x4e06b7]        # 1844410 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xaf8>
 1363d76:	48 8d 05 2b ca 50 00 	lea    rax,[rip+0x50ca2b]        # 18707a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2ce90>

## All direct +0x1b5 / +0x1b8 accesses in neighboring family
 13620e1:	49 8b 87 70 01 00 00 	mov    rax,QWORD PTR [r15+0x170]
 13620e8:	48 89 86 10 02 00 00 	mov    QWORD PTR [rsi+0x210],rax
 13620ef:	48 c7 86 18 02 00 00 	mov    QWORD PTR [rsi+0x218],0x3e8
 13620f6:	e8 03 00 00 
 13620fa:	c6 86 20 02 00 00 01 	mov    BYTE PTR [rsi+0x220],0x1
 1362101:	31 c0                	xor    eax,eax
 1362103:	41 80 bf b8 01 00 00 	cmp    BYTE PTR [r15+0x1b8],0x1
 136210a:	01 
 136210b:	0f 94 c0             	sete   al
 136210e:	89 86 28 02 00 00    	mov    DWORD PTR [rsi+0x228],eax
 1362114:	48 83 a6 50 02 00 00 	and    QWORD PTR [rsi+0x250],0x0
 136211b:	00 
 136211c:	49 8b 86 50 01 00 00 	mov    rax,QWORD PTR [r14+0x150]
 1362123:	48 89 86 60 02 00 00 	mov    QWORD PTR [rsi+0x260],rax
 136212a:	41 8b 87 b4 01 00 00 	mov    eax,DWORD PTR [r15+0x1b4]
 1362131:	89 86 68 02 00 00    	mov    DWORD PTR [rsi+0x268],eax
 1362137:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
--
 136233f:	49 89 85 a8 00 00 00 	mov    QWORD PTR [r13+0xa8],rax
 1362346:	b8 e8 03 00 00       	mov    eax,0x3e8
 136234b:	49 89 85 b0 00 00 00 	mov    QWORD PTR [r13+0xb0],rax
 1362352:	41 c6 85 b8 00 00 00 	mov    BYTE PTR [r13+0xb8],0x1
 1362359:	01 
 136235a:	31 c9                	xor    ecx,ecx
 136235c:	41 80 bf b8 01 00 00 	cmp    BYTE PTR [r15+0x1b8],0x1
 1362363:	01 
 1362364:	0f 94 c1             	sete   cl
 1362367:	41 89 8d c0 00 00 00 	mov    DWORD PTR [r13+0xc0],ecx
 136236e:	8a 4c 24 48          	mov    cl,BYTE PTR [rsp+0x48]
 1362372:	41 88 8d c8 00 00 00 	mov    BYTE PTR [r13+0xc8],cl
 1362379:	4c 89 e1             	mov    rcx,r12
 136237c:	48 c1 e9 30          	shr    rcx,0x30
 1362380:	41 88 8d cf 00 00 00 	mov    BYTE PTR [r13+0xcf],cl
 1362387:	4c 89 e1             	mov    rcx,r12
 136238a:	48 c1 e9 20          	shr    rcx,0x20
--
 1363808:	48 63 83 30 01 00 00 	movsxd rax,DWORD PTR [rbx+0x130]
 136380f:	48 0f af c1          	imul   rax,rcx
 1363813:	b9 e8 03 00 00       	mov    ecx,0x3e8
 1363818:	48 99                	cqo
 136381a:	48 f7 f9             	idiv   rcx
 136381d:	48 89 83 b0 01 00 00 	mov    QWORD PTR [rbx+0x1b0],rax
 1363824:	c6 83 b8 01 00 00 00 	mov    BYTE PTR [rbx+0x1b8],0x0
 136382b:	66 0f ef c0          	pxor   xmm0,xmm0
 136382f:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
 1363836:	00 00 
 1363838:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
 136383f:	00 00 
 1363841:	b8 00 00 80 3f       	mov    eax,0x3f800000
 1363846:	89 84 24 f0 00 00 00 	mov    DWORD PTR [rsp+0xf0],eax
 136384d:	f3 0f 7f 84 24 f8 00 	movdqu XMMWORD PTR [rsp+0xf8],xmm0
 1363854:	00 00 
 1363856:	f3 0f 7f 84 24 08 01 	movdqu XMMWORD PTR [rsp+0x108],xmm0

## Callers of 0x13635f7
 1363491:	48 8b 48 20          	mov    rcx,QWORD PTR [rax+0x20]
 1363495:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
 136349a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 136349d:	0f 10 48 10          	movups xmm1,XMMWORD PTR [rax+0x10]
 13634a1:	0f 29 4c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm1
 13634a6:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
 13634ab:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
 13634b0:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
 13634b7:	00 
 13634b8:	48 89 df             	mov    rdi,rbx
 13634bb:	89 ee                	mov    esi,ebp
 13634bd:	e8 b7 fb 0b 00       	call   1423079 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2685fd>
 13634c2:	49 8d 76 08          	lea    rsi,[r14+0x8]
 13634c6:	49 83 c6 20          	add    r14,0x20
 13634ca:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
 13634cf:	4c 8d 54 24 50       	lea    r10,[rsp+0x50]
 13634d4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 13634d9:	4c 8d 8c 24 c0 00 00 	lea    r9,[rsp+0xc0]
 13634e0:	00 
 13634e1:	4c 89 e2             	mov    rdx,r12
 13634e4:	4c 89 f1             	mov    rcx,r14
 13634e7:	4d 89 f8             	mov    r8,r15
 13634ea:	41 55                	push   r13
 13634ec:	53                   	push   rbx
 13634ed:	4c 8d 9c 24 88 00 00 	lea    r11,[rsp+0x88]
 13634f4:	00 
 13634f5:	41 53                	push   r11
 13634f7:	50                   	push   rax
 13634f8:	41 52                	push   r10
 13634fa:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 13634fe:	e8 f4 00 00 00       	call   13635f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8b7b>
 1363503:	48 83 c4 30          	add    rsp,0x30
 1363507:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 136350c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1363511:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1363514:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1363518:	48 89 03             	mov    QWORD PTR [rbx],rax
 136351b:	e8 e2 0c 00 00       	call   1364202 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9786>
 1363520:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 1363525:	e8 b2 6b 8f ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 136352a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 136352f:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 1363535:	48 85 ff             	test   rdi,rdi
 1363538:	74 06                	je     1363540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8ac4>
 136353a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 136353d:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1363540:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 1363545:	e8 d8 0c 00 00       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
 136354a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 136354f:	e8 32 af 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1363554:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 136355b:	00 
 136355c:	e8 05 9b 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 1363561:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1363568:	00 00 
 136356a:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
 1363571:	00 
 1363572:	75 7e                	jne    13635f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8b76>
 1363574:	48 89 d8             	mov    rax,rbx
 1363577:	48 81 c4 88 01 00 00 	add    rsp,0x188
 136357e:	5b                   	pop    rbx
 136357f:	41 5c                	pop    r12
 1363581:	41 5d                	pop    r13
 1363583:	41 5e                	pop    r14
 1363585:	41 5f                	pop    r15
 1363587:	5d                   	pop    rbp
 1363588:	c3                   	ret
 1363589:	48 89 c3             	mov    rbx,rax
 136358c:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 1363591:	e8 46 6b 8f ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 1363596:	eb 03                	jmp    136359b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8b1f>
 1363598:	48 89 c3             	mov    rbx,rax
 136359b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 13635a0:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 13635a6:	48 85 ff             	test   rdi,rdi
 13635a9:	74 0b                	je     13635b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8b3a>
--
 1409491:	48 8b 48 20          	mov    rcx,QWORD PTR [rax+0x20]
 1409495:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
 140949a:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
 140949d:	0f 10 48 10          	movups xmm1,XMMWORD PTR [rax+0x10]
 14094a1:	0f 29 4c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm1
 14094a6:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
 14094ab:	48 8d 5c 24 38       	lea    rbx,[rsp+0x38]
 14094b0:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
 14094b7:	00 
 14094b8:	48 89 df             	mov    rdi,rbx
 14094bb:	89 ee                	mov    esi,ebp
 14094bd:	e8 b7 9b 01 00       	call   1423079 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2685fd>
 14094c2:	49 8d 76 08          	lea    rsi,[r14+0x8]
 14094c6:	49 83 c6 20          	add    r14,0x20
 14094ca:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
 14094cf:	4c 8d 54 24 50       	lea    r10,[rsp+0x50]
 14094d4:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 14094d9:	4c 8d 8c 24 c0 00 00 	lea    r9,[rsp+0xc0]
 14094e0:	00 
 14094e1:	4c 89 e2             	mov    rdx,r12
 14094e4:	4c 89 f1             	mov    rcx,r14
 14094e7:	4d 89 f8             	mov    r8,r15
 14094ea:	41 55                	push   r13
 14094ec:	53                   	push   rbx
 14094ed:	4c 8d 9c 24 88 00 00 	lea    r11,[rsp+0x88]
 14094f4:	00 
 14094f5:	41 53                	push   r11
 14094f7:	50                   	push   rax
 14094f8:	41 52                	push   r10
 14094fa:	ff 74 24 30          	push   QWORD PTR [rsp+0x30]
 14094fe:	e8 f4 a0 f5 ff       	call   13635f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a8b7b>
 1409503:	48 83 c4 30          	add    rsp,0x30
 1409507:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
 140950c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 1409511:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 1409514:	48 83 27 00          	and    QWORD PTR [rdi],0x0
 1409518:	48 89 03             	mov    QWORD PTR [rbx],rax
 140951b:	e8 e2 ac f5 ff       	call   1364202 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a9786>
 1409520:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 1409525:	e8 b2 0b 85 ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 140952a:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 140952f:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 1409535:	48 85 ff             	test   rdi,rdi
 1409538:	74 06                	je     1409540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eac4>
 140953a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 140953d:	ff 50 08             	call   QWORD PTR [rax+0x8]
 1409540:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
 1409545:	e8 d8 ac f5 ff       	call   1364222 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a97a6>
 140954a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
 140954f:	e8 32 4f 69 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 1409554:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
 140955b:	00 
 140955c:	e8 05 3b 6a ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
 1409561:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1409568:	00 00 
 140956a:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
 1409571:	00 
 1409572:	75 7e                	jne    14095f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb76>
 1409574:	48 89 d8             	mov    rax,rbx
 1409577:	48 81 c4 88 01 00 00 	add    rsp,0x188
 140957e:	5b                   	pop    rbx
 140957f:	41 5c                	pop    r12
 1409581:	41 5d                	pop    r13
 1409583:	41 5e                	pop    r14
 1409585:	41 5f                	pop    r15
 1409587:	5d                   	pop    rbp
 1409588:	c3                   	ret
 1409589:	48 89 c3             	mov    rbx,rax
 140958c:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 1409591:	e8 46 0b 85 ff       	call   c5a0dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a707c>
 1409596:	eb 03                	jmp    140959b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb1f>
 1409598:	48 89 c3             	mov    rbx,rax
 140959b:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
 14095a0:	48 83 64 24 18 00    	and    QWORD PTR [rsp+0x18],0x0
 14095a6:	48 85 ff             	test   rdi,rdi
 14095a9:	74 0b                	je     14095b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24eb3a>
