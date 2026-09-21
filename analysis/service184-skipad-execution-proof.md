# service184 +0x28 -> Skip Ad +0x68 execution dependency proof

Known source:
- b8f02e(root) returns service184
- 0x11ee8ff calls service184 virtual +0x28
- result overwrites caller local rsp+0x60 at 0x11ee902

## Source local and call-site argument build
     11ee8e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8e3:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ee8e6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ee8e9:	48 89 c7             	mov    rdi,rax
     11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
     11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11ee8f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     11ee8fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee8ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
     11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
     11ee90b:	48 8d 35 4d 8d 19 ff 	lea    rsi,[rip+0xffffffffff198d4d]        # 38765f <_ZTSSt12bad_any_cast@@Base-0x8b69>
     11ee912:	4c 8d bc 24 38 02 00 	lea    r15,[rsp+0x238]
     11ee919:	00 
     11ee91a:	4c 89 ff             	mov    rdi,r15
     11ee91d:	e8 5c b1 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ee922:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee925:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
     11ee92c:	00 
     11ee92d:	48 89 de             	mov    rsi,rbx
     11ee930:	4c 89 fa             	mov    rdx,r15
     11ee933:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11ee936:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11ee93d:	4d 8b bd 98 00 00 00 	mov    r15,QWORD PTR [r13+0x98]
     11ee944:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee948:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
     11ee94f:	00 
     11ee950:	48 89 ee             	mov    rsi,rbp
     11ee953:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee956:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     11ee95a:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
     11ee961:	00 
     11ee962:	48 89 ee             	mov    rsi,rbp
     11ee965:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11ee968:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     11ee96d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee970:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee973:	48 89 c5             	mov    rbp,rax
     11ee976:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     11ee97b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee97e:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee981:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11ee986:	49 8b 45 30          	mov    rax,QWORD PTR [r13+0x30]
     11ee98a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     11ee98f:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
     11ee993:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ee998:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     11ee99d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9a0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9a3:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     11ee9a8:	49 8b 45 20          	mov    rax,QWORD PTR [r13+0x20]
     11ee9ac:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
     11ee9b3:	00 
     11ee9b4:	49 8b 85 90 00 00 00 	mov    rax,QWORD PTR [r13+0x90]
     11ee9bb:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11ee9c0:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     11ee9c5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ee9c8:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     11ee9cf:	00 
     11ee9d0:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9d6:	4c 89 f7             	mov    rdi,r14
     11ee9d9:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9dc:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     11ee9e1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11ee9e4:	4c 89 f7             	mov    rdi,r14
     11ee9e7:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9ea:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11ee9f1:	00 
     11ee9f2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     11ee9f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ee9fa:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ee9fd:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11eea02:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
     11eea09:	00 
     11eea0a:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
     11eea11:	00 
     11eea12:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11eea17:	48 8b 88 b0 00 00 00 	mov    rcx,QWORD PTR [rax+0xb0]
     11eea1e:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
     11eea25:	00 
     11eea26:	48 8b 80 b8 00 00 00 	mov    rax,QWORD PTR [rax+0xb8]
     11eea2d:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     11eea32:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
     11eea36:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     11eea3d:	00 
     11eea3e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea42:	4c 89 e7             	mov    rdi,r12
     11eea45:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11eea48:	49 89 c6             	mov    r14,rax
     11eea4b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11eea4f:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11eea56:	00 
     11eea57:	4c 89 e6             	mov    rsi,r12
     11eea5a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eea5d:	49 8b 9d 80 00 00 00 	mov    rbx,QWORD PTR [r13+0x80]
     11eea64:	bf 10 02 00 00       	mov    edi,0x210
     11eea69:	e8 92 f4 5f 00       	call   17edf00 <_Znwm@plt>
     11eea6e:	49 89 c7             	mov    r15,rax
     11eea71:	48 89 ac 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rbp
     11eea78:	00 
     11eea79:	0f 57 c0             	xorps  xmm0,xmm0
     11eea7c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     11eea80:	48 8d 05 89 ce 66 00 	lea    rax,[rip+0x66ce89]        # 185b910 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ff8>
     11eea87:	49 89 07             	mov    QWORD PTR [r15],rax
     11eea8a:	4d 8d 67 18          	lea    r12,[r15+0x18]
     11eea8e:	48 8d bc 24 b0 02 00 	lea    rdi,[rsp+0x2b0]
     11eea95:	00 
     11eea96:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
     11eea9d:	00 
     11eea9e:	ba b0 00 00 00       	mov    edx,0xb0
     11eeaa3:	e8 28 10 60 00       	call   17efad0 <memcpy@plt>
     11eeaa8:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
     11eeaac:	4c 89 e7             	mov    rdi,r12
     11eeaaf:	e8 4e b3 5e 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
     11eeab4:	4d 89 77 70          	mov    QWORD PTR [r15+0x70],r14
     11eeab8:	49 8d 7f 78          	lea    rdi,[r15+0x78]
     11eeabc:	48 8d b4 24 b0 02 00 	lea    rsi,[rsp+0x2b0]
     11eeac3:	00 
     11eeac4:	ba b0 00 00 00       	mov    edx,0xb0
     11eeac9:	e8 02 10 60 00       	call   17efad0 <memcpy@plt>
     11eeace:	49 89 9f 28 01 00 00 	mov    QWORD PTR [r15+0x128],rbx
     11eead5:	4d 8d b7 30 01 00 00 	lea    r14,[r15+0x130]
     11eeadc:	4d 89 b7 30 01 00 00 	mov    QWORD PTR [r15+0x130],r14
     11eeae3:	4d 89 b7 38 01 00 00 	mov    QWORD PTR [r15+0x138],r14
     11eeaea:	0f 57 c0             	xorps  xmm0,xmm0
     11eeaed:	41 0f 11 87 40 01 00 	movups XMMWORD PTR [r15+0x140],xmm0
     11eeaf4:	00 
     11eeaf5:	41 0f 11 87 50 01 00 	movups XMMWORD PTR [r15+0x150],xmm0
     11eeafc:	00 
     11eeafd:	49 83 a7 60 01 00 00 	and    QWORD PTR [r15+0x160],0x0
     11eeb04:	00 
     11eeb05:	41 bc 00 00 80 3f    	mov    r12d,0x3f800000
     11eeb0b:	45 89 a7 68 01 00 00 	mov    DWORD PTR [r15+0x168],r12d
     11eeb12:	b8 00 00 10 00       	mov    eax,0x100000
     11eeb17:	49 89 87 70 01 00 00 	mov    QWORD PTR [r15+0x170],rax
     11eeb1e:	49 89 87 78 01 00 00 	mov    QWORD PTR [r15+0x178],rax
     11eeb25:	49 83 a7 80 01 00 00 	and    QWORD PTR [r15+0x180],0x0
     11eeb2c:	00 
     11eeb2d:	49 8d af 88 01 00 00 	lea    rbp,[r15+0x188]
     11eeb34:	48 89 ef             	mov    rdi,rbp
     11eeb37:	48 89 de             	mov    rsi,rbx
     11eeb3a:	e8 83 2b 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11eeb3f:	49 8d 9f 98 01 00 00 	lea    rbx,[r15+0x198]
     11eeb46:	0f 57 c0             	xorps  xmm0,xmm0
     11eeb49:	41 0f 11 87 c8 01 00 	movups XMMWORD PTR [r15+0x1c8],xmm0
     11eeb50:	00 
     11eeb51:	41 0f 11 87 b8 01 00 	movups XMMWORD PTR [r15+0x1b8],xmm0
     11eeb58:	00 
     11eeb59:	41 0f 11 87 a8 01 00 	movups XMMWORD PTR [r15+0x1a8],xmm0
     11eeb60:	00 
     11eeb61:	41 0f 11 87 98 01 00 	movups XMMWORD PTR [r15+0x198],xmm0
     11eeb68:	00 
     11eeb69:	45 89 a7 d8 01 00 00 	mov    DWORD PTR [r15+0x1d8],r12d
     11eeb70:	41 83 a7 e0 01 00 00 	and    DWORD PTR [r15+0x1e0],0x0
     11eeb77:	00 
     11eeb78:	49 c7 87 e8 01 00 00 	mov    QWORD PTR [r15+0x1e8],0xa
     11eeb7f:	0a 00 00 00 
     11eeb83:	41 c7 87 f0 01 00 00 	mov    DWORD PTR [r15+0x1f0],0x3
     11eeb8a:	03 00 00 00 
     11eeb8e:	49 c7 87 f8 01 00 00 	mov    QWORD PTR [r15+0x1f8],0x5
     11eeb95:	05 00 00 00 
     11eeb99:	49 8d bf 00 02 00 00 	lea    rdi,[r15+0x200]
     11eeba0:	e8 85 6b 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11eeba5:	31 ff                	xor    edi,edi
     11eeba7:	e8 70 f8 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11eebac:	49 8b 75 58          	mov    rsi,QWORD PTR [r13+0x58]
     11eebb0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11eebb3:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     11eebba:	00 
     11eebbb:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebbe:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11eebc3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebc6:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebc9:	49 89 c6             	mov    r14,rax
     11eebcc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eebd1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11eebd4:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11eebd7:	49 89 c4             	mov    r12,rax
     11eebda:	bf c0 5d 00 00       	mov    edi,0x5dc0
     11eebdf:	e8 1c f3 5f 00       	call   17edf00 <_Znwm@plt>
     11eebe4:	48 89 c7             	mov    rdi,rax
     11eebe7:	66 49 0f 6e c7       	movq   xmm0,r15
     11eebec:	f3 0f 7e 0c 24       	movq   xmm1,QWORD PTR [rsp]
     11eebf1:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
     11eebf5:	48 8b 8c 24 28 02 00 	mov    rcx,QWORD PTR [rsp+0x228]
     11eebfc:	00 
     11eebfd:	0f 28 84 24 20 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x220]
     11eec04:	00 
     11eec05:	0f 29 84 24 a0 02 00 	movaps XMMWORD PTR [rsp+0x2a0],xmm0
     11eec0c:	00 
     11eec0d:	0f 57 c0             	xorps  xmm0,xmm0
     11eec10:	0f 29 84 24 20 02 00 	movaps XMMWORD PTR [rsp+0x220],xmm0
     11eec17:	00 
     11eec18:	48 8b 94 24 18 02 00 	mov    rdx,QWORD PTR [rsp+0x218]
     11eec1f:	00 
     11eec20:	0f 28 94 24 10 02 00 	movaps xmm2,XMMWORD PTR [rsp+0x210]
     11eec27:	00 
     11eec28:	0f 29 94 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm2
     11eec2f:	00 
     11eec30:	0f 29 84 24 10 02 00 	movaps XMMWORD PTR [rsp+0x210],xmm0
     11eec37:	00 
     11eec38:	48 8b b4 24 08 02 00 	mov    rsi,QWORD PTR [rsp+0x208]
     11eec3f:	00 
     11eec40:	0f 28 94 24 00 02 00 	movaps xmm2,XMMWORD PTR [rsp+0x200]
     11eec47:	00 
     11eec48:	0f 29 94 24 80 02 00 	movaps XMMWORD PTR [rsp+0x280],xmm2
     11eec4f:	00 
     11eec50:	0f 29 84 24 00 02 00 	movaps XMMWORD PTR [rsp+0x200],xmm0
     11eec57:	00 
     11eec58:	66 0f 7f 8c 24 70 02 	movdqa XMMWORD PTR [rsp+0x270],xmm1
     11eec5f:	00 00 
     11eec61:	49 8b 9d e0 00 00 00 	mov    rbx,QWORD PTR [r13+0xe0]
     11eec68:	41 0f 10 8d d8 00 00 	movups xmm1,XMMWORD PTR [r13+0xd8]
     11eec6f:	00 
     11eec70:	0f 29 8c 24 60 02 00 	movaps XMMWORD PTR [rsp+0x260],xmm1
     11eec77:	00 
     11eec78:	48 85 db             	test   rbx,rbx
     11eec7b:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
     11eec80:	4c 89 e0             	mov    rax,r12
     11eec83:	74 35                	je     11eecba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3423e>
     11eec85:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     11eec8a:	48 8b 9c 24 68 02 00 	mov    rbx,QWORD PTR [rsp+0x268]
     11eec91:	00 
     11eec92:	48 8b 8c 24 88 02 00 	mov    rcx,QWORD PTR [rsp+0x288]
     11eec99:	00 
     11eec9a:	48 89 0c 24          	mov    QWORD PTR [rsp],rcx
     11eec9e:	48 8b 8c 24 98 02 00 	mov    rcx,QWORD PTR [rsp+0x298]
     11eeca5:	00 
     11eeca6:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
     11eecab:	48 8b 8c 24 a8 02 00 	mov    rcx,QWORD PTR [rsp+0x2a8]
     11eecb2:	00 
     11eecb3:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     11eecb8:	eb 0e                	jmp    11eecc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3424c>
     11eecba:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     11eecbf:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
     11eecc4:	48 89 34 24          	mov    QWORD PTR [rsp],rsi
     11eecc8:	4c 8b bc 24 c8 00 00 	mov    r15,QWORD PTR [rsp+0xc8]
     11eeccf:	00 
     11eecd0:	49 83 c7 38          	add    r15,0x38
     11eecd4:	4c 8b 5c 24 28       	mov    r11,QWORD PTR [rsp+0x28]
     11eecd9:	49 83 c3 10          	add    r11,0x10
     11eecdd:	48 8b ac 24 90 00 00 	mov    rbp,QWORD PTR [rsp+0x90]
     11eece4:	00 
     11eece5:	48 83 c5 10          	add    rbp,0x10
     11eece9:	4c 8b 94 24 d0 00 00 	mov    r10,QWORD PTR [rsp+0xd0]
     11eecf0:	00 
     11eecf1:	49 83 c2 0c          	add    r10,0xc
     11eecf5:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
     11eecfc:	00 
     11eecfd:	49 81 c6 90 00 00 00 	add    r14,0x90
     11eed04:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
     11eed09:	49 81 c4 f8 00 00 00 	add    r12,0xf8
     11eed10:	48 8b b4 24 f0 00 00 	mov    rsi,QWORD PTR [rsp+0xf0]
     11eed17:	00 
     11eed18:	48 83 c6 10          	add    rsi,0x10
     11eed1c:	48 8d 94 24 30 01 00 	lea    rdx,[rsp+0x130]
     11eed23:	00 
     11eed24:	48 8b 4a 10          	mov    rcx,QWORD PTR [rdx+0x10]
     11eed28:	48 89 8c 24 c0 02 00 	mov    QWORD PTR [rsp+0x2c0],rcx
     11eed2f:	00 
     11eed30:	0f 28 0a             	movaps xmm1,XMMWORD PTR [rdx]
     11eed33:	0f 29 8c 24 b0 02 00 	movaps XMMWORD PTR [rsp+0x2b0],xmm1
     11eed3a:	00 
     11eed3b:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
     11eed3e:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
     11eed43:	4c 8d ac 24 70 02 00 	lea    r13,[rsp+0x270]
     11eed4a:	00 
     11eed4b:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     11eed50:	48 8b 94 24 c0 00 00 	mov    rdx,QWORD PTR [rsp+0xc0]
     11eed57:	00 
     11eed58:	48 8b 8c 24 20 01 00 	mov    rcx,QWORD PTR [rsp+0x120]
     11eed5f:	00 
     11eed60:	4c 8b 84 24 b8 00 00 	mov    r8,QWORD PTR [rsp+0xb8]
     11eed67:	00 
     11eed68:	4c 8b 8c 24 10 01 00 	mov    r9,QWORD PTR [rsp+0x110]
     11eed6f:	00 
     11eed70:	41 57                	push   r15
     11eed72:	50                   	push   rax
     11eed73:	ff b4 24 80 00 00 00 	push   QWORD PTR [rsp+0x80]
     11eed7a:	4c 8d bc 24 c8 02 00 	lea    r15,[rsp+0x2c8]
     11eed81:	00 
     11eed82:	41 57                	push   r15
     11eed84:	48 8d 84 24 80 02 00 	lea    rax,[rsp+0x280]
     11eed8b:	00 
     11eed8c:	50                   	push   rax
     11eed8d:	41 55                	push   r13
     11eed8f:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     11eed96:	41 53                	push   r11
     11eed98:	55                   	push   rbp
     11eed99:	41 52                	push   r10
     11eed9b:	ff 74 24 68          	push   QWORD PTR [rsp+0x68]
     11eed9f:	41 56                	push   r14
     11eeda1:	41 54                	push   r12
     11eeda3:	48 8d 84 24 e8 02 00 	lea    rax,[rsp+0x2e8]
     11eedaa:	00 
     11eedab:	50                   	push   rax
     11eedac:	ff b4 24 20 01 00 00 	push   QWORD PTR [rsp+0x120]
     11eedb3:	ff b4 24 a8 00 00 00 	push   QWORD PTR [rsp+0xa8]
     11eedba:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
     11eedc1:	ff b4 24 c8 00 00 00 	push   QWORD PTR [rsp+0xc8]
     11eedc8:	ff b4 24 78 01 00 00 	push   QWORD PTR [rsp+0x178]
     11eedcf:	ff b4 24 e0 00 00 00 	push   QWORD PTR [rsp+0xe0]
     11eedd6:	ff b4 24 98 01 00 00 	push   QWORD PTR [rsp+0x198]
     11eeddd:	ff b4 24 f8 00 00 00 	push   QWORD PTR [rsp+0xf8]
     11eede4:	ff b4 24 b0 01 00 00 	push   QWORD PTR [rsp+0x1b0]
     11eedeb:	ff b4 24 c0 01 00 00 	push   QWORD PTR [rsp+0x1c0]
     11eedf2:	ff b4 24 40 01 00 00 	push   QWORD PTR [rsp+0x140]
     11eedf9:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
     11eee00:	48 8d 84 24 60 03 00 	lea    rax,[rsp+0x360]
     11eee07:	00 
     11eee08:	50                   	push   rax
     11eee09:	48 8d 84 24 78 03 00 	lea    rax,[rsp+0x378]
     11eee10:	00 
     11eee11:	50                   	push   rax
     11eee12:	ff b4 24 78 01 00 00 	push   QWORD PTR [rsp+0x178]
     11eee19:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
     11eee20:	ff b4 24 c8 01 00 00 	push   QWORD PTR [rsp+0x1c8]
     11eee27:	ff b4 24 98 01 00 00 	push   QWORD PTR [rsp+0x198]
     11eee2e:	48 8d 84 24 50 03 00 	lea    rax,[rsp+0x350]
     11eee35:	00 
     11eee36:	50                   	push   rax
     11eee37:	ff b4 24 68 01 00 00 	push   QWORD PTR [rsp+0x168]
     11eee3e:	ff b4 24 68 01 00 00 	push   QWORD PTR [rsp+0x168]
     11eee45:	ff b4 24 80 01 00 00 	push   QWORD PTR [rsp+0x180]
     11eee4c:	e8 e3 04 00 00       	call   11ef334 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x348b8>
     11eee51:	48 81 c4 20 01 00 00 	add    rsp,0x120

## Symbolic stack-push mapping into 0x11ef334
- push#01 @0x11eed70: push   r15; source relative to S0=register/immediate
- push#02 @0x11eed72: push   rax; source relative to S0=register/immediate
- push#03 @0x11eed73: push   QWORD PTR [rsp+0x80]; source relative to S0=0x70
- push#04 @0x11eed82: push   r15; source relative to S0=register/immediate
- push#05 @0x11eed8c: push   rax; source relative to S0=register/immediate
- push#06 @0x11eed8d: push   r13; source relative to S0=register/immediate
- push#07 @0x11eed8f: push   QWORD PTR [rsp+0xb8]; source relative to S0=0x88
- push#08 @0x11eed96: push   r11; source relative to S0=register/immediate
- push#09 @0x11eed98: push   rbp; source relative to S0=register/immediate
- push#10 @0x11eed99: push   r10; source relative to S0=register/immediate
- push#11 @0x11eed9b: push   QWORD PTR [rsp+0x68]; source relative to S0=0x18
- push#12 @0x11eed9f: push   r14; source relative to S0=register/immediate
- push#13 @0x11eeda1: push   r12; source relative to S0=register/immediate
- push#14 @0x11eedab: push   rax; source relative to S0=register/immediate
- push#15 @0x11eedac: push   QWORD PTR [rsp+0x120]; source relative to S0=0xb0
- push#16 @0x11eedb3: push   QWORD PTR [rsp+0xa8]; source relative to S0=0x30
- push#17 @0x11eedba: push   QWORD PTR [rsp+0xb8]; source relative to S0=0x38
- push#18 @0x11eedc1: push   QWORD PTR [rsp+0xc8]; source relative to S0=0x40
- push#19 @0x11eedc8: push   QWORD PTR [rsp+0x178]; source relative to S0=0xe8
- push#20 @0x11eedcf: push   QWORD PTR [rsp+0xe0]; source relative to S0=0x48
- push#21 @0x11eedd6: push   QWORD PTR [rsp+0x198]; source relative to S0=0xf8
- push#22 @0x11eeddd: push   QWORD PTR [rsp+0xf8]; source relative to S0=0x50
- push#23 @0x11eede4: push   QWORD PTR [rsp+0x1b0]; source relative to S0=0x100
- push#24 @0x11eedeb: push   QWORD PTR [rsp+0x1c0]; source relative to S0=0x108
- push#25 @0x11eedf2: push   QWORD PTR [rsp+0x140]; source relative to S0=0x80
- push#26 @0x11eedf9: push   QWORD PTR [rsp+0x1e0]; source relative to S0=0x118
- push#27 @0x11eee08: push   rax; source relative to S0=register/immediate
- push#28 @0x11eee11: push   rax; source relative to S0=register/immediate
- push#29 @0x11eee12: push   QWORD PTR [rsp+0x178]; source relative to S0=0x98
- push#30 @0x11eee19: push   QWORD PTR [rsp+0x210]; source relative to S0=0x128
- push#31 @0x11eee20: push   QWORD PTR [rsp+0x1c8]; source relative to S0=0xd8
- push#32 @0x11eee27: push   QWORD PTR [rsp+0x198]; source relative to S0=0xa0
- push#33 @0x11eee36: push   rax; source relative to S0=register/immediate
- push#34 @0x11eee37: push   QWORD PTR [rsp+0x168]; source relative to S0=0x60
- push#35 @0x11eee3e: push   QWORD PTR [rsp+0x168]; source relative to S0=0x58
- push#36 @0x11eee45: push   QWORD PTR [rsp+0x180]; source relative to S0=0x68
- total pushed bytes before call: 0x120

## Uses of the physical service184-result stack cell before constructor call
- @0x11ee902: mov    QWORD PTR [rsp+0x60],rax
- MATCH @0x11eee37: push   QWORD PTR [rsp+0x168]; current rsp delta=-264, physical S0+0x60

## 0x11ef334 constructor FDE (18805556, 18832116)
     11ef334:	55                   	push   rbp
     11ef335:	41 57                	push   r15
     11ef337:	41 56                	push   r14
     11ef339:	41 55                	push   r13
     11ef33b:	41 54                	push   r12
     11ef33d:	53                   	push   rbx
     11ef33e:	48 81 ec 08 06 00 00 	sub    rsp,0x608
     11ef345:	4c 89 8c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r9
     11ef34c:	00 
     11ef34d:	4c 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r8
     11ef354:	00 
     11ef355:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     11ef35a:	48 89 94 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rdx
     11ef361:	00 
     11ef362:	48 89 fb             	mov    rbx,rdi
     11ef365:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11ef36c:	00 00 
     11ef36e:	48 89 84 24 00 06 00 	mov    QWORD PTR [rsp+0x600],rax
     11ef375:	00 
     11ef376:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
     11ef37a:	48 8d 05 c7 c5 66 00 	lea    rax,[rip+0x66c5c7]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>
     11ef381:	48 89 07             	mov    QWORD PTR [rdi],rax
     11ef384:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     11ef389:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11ef390:	00 
     11ef391:	48 8d 05 48 8a 7e ff 	lea    rax,[rip+0xffffffffff7e8a48]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11ef398:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
     11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
     11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     11ef3bd:	00 
     11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     11ef3c7:	48 8b 86 fc 00 00 00 	mov    rax,QWORD PTR [rsi+0xfc]
     11ef3ce:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
     11ef3d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ef3d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ef3d8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ef3db:	48 89 c7             	mov    rdi,rax
     11ef3de:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11ef3e1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11ef3e6:	48 83 a4 24 c0 04 00 	and    QWORD PTR [rsp+0x4c0],0x0
     11ef3ed:	00 00 
     11ef3ef:	48 8d 05 ea 89 7e ff 	lea    rax,[rip+0xffffffffff7e89ea]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11ef3f6:	48 89 84 24 d0 04 00 	mov    QWORD PTR [rsp+0x4d0],rax
     11ef3fd:	00 
     11ef3fe:	48 8d 05 45 1e a8 ff 	lea    rax,[rip+0xffffffffffa81e45]        # c7124a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1be1ea>
     11ef405:	48 89 84 24 d8 04 00 	mov    QWORD PTR [rsp+0x4d8],rax
     11ef40c:	00 
     11ef40d:	48 8d 35 76 e8 17 ff 	lea    rsi,[rip+0xffffffffff17e876]        # 36dc8a <_ZTSSt12bad_any_cast@@Base-0x2253e>
     11ef414:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     11ef41b:	00 
     11ef41c:	e8 5d a6 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11ef421:	48 8b b4 24 78 06 00 	mov    rsi,QWORD PTR [rsp+0x678]
     11ef428:	00 
     11ef429:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ef42c:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11ef433:	00 
     11ef434:	48 8d 94 24 a0 05 00 	lea    rdx,[rsp+0x5a0]
     11ef43b:	00 
     11ef43c:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11ef43f:	48 8b ac 24 d0 06 00 	mov    rbp,QWORD PTR [rsp+0x6d0]
     11ef446:	00 
     11ef447:	48 8d 43 68          	lea    rax,[rbx+0x68]
     11ef44b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     11ef450:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11ef457:	00 
     11ef458:	e8 d9 c3 88 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     11ef45d:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ef462:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
     11ef467:	48 8d 8c 24 a0 04 00 	lea    rcx,[rsp+0x4a0]
     11ef46e:	00 
     11ef46f:	48 83 21 00          	and    QWORD PTR [rcx],0x0
     11ef473:	48 8d 05 66 89 7e ff 	lea    rax,[rip+0xffffffffff7e8966]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11ef47a:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     11ef47e:	48 8d 05 99 a2 07 00 	lea    rax,[rip+0x7a299]        # 126971e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaeca2>
     11ef485:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     11ef489:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef48d:	6a 64                	push   0x64
     11ef48f:	41 5d                	pop    r13
     11ef491:	6a 01                	push   0x1
     11ef493:	41 5c                	pop    r12
     11ef495:	48 8d 35 64 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec864]        # 3dbd00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x174f>
     11ef49c:	48 8d 0d 7d c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec87d]        # 3dbd20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x176f>
     11ef4a3:	6a 14                	push   0x14
     11ef4a5:	41 5e                	pop    r14
     11ef4a7:	6a 1f                	push   0x1f
     11ef4a9:	41 58                	pop    r8
     11ef4ab:	6a 08                	push   0x8
     11ef4ad:	41 5f                	pop    r15
     11ef4af:	4c 89 f2             	mov    rdx,r14
     11ef4b2:	45 89 f9             	mov    r9d,r15d
     11ef4b5:	41 55                	push   r13
     11ef4b7:	41 54                	push   r12
     11ef4b9:	e8 34 81 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     11ef4be:	48 83 c4 10          	add    rsp,0x10
     11ef4c2:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef4c6:	48 8d 35 73 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec873]        # 3dbd40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x178f>
     11ef4cd:	48 8d 0d 8c c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec88c]        # 3dbd60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17af>
     11ef4d4:	6a 20                	push   0x20
     11ef4d6:	41 58                	pop    r8
     11ef4d8:	4c 89 f2             	mov    rdx,r14
     11ef4db:	45 89 f9             	mov    r9d,r15d
     11ef4de:	41 55                	push   r13
     11ef4e0:	41 54                	push   r12
     11ef4e2:	e8 0b 81 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     11ef4e7:	48 83 c4 10          	add    rsp,0x10
     11ef4eb:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef4ef:	48 8d 35 9a c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec89a]        # 3dbd90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17df>
     11ef4f6:	48 8d 0d b3 c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8b3]        # 3dbdb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17ff>
     11ef4fd:	4c 89 f2             	mov    rdx,r14
     11ef500:	6a 1f                	push   0x1f
     11ef502:	41 58                	pop    r8
     11ef504:	4d 89 c7             	mov    r15,r8
     11ef507:	45 89 e1             	mov    r9d,r12d
     11ef50a:	41 55                	push   r13
     11ef50c:	41 54                	push   r12
     11ef50e:	e8 df 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     11ef513:	48 83 c4 10          	add    rsp,0x10
     11ef517:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef51b:	48 8d 35 ae c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec8ae]        # 3dbdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x181f>
     11ef522:	48 8d 0d c7 c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8c7]        # 3dbdf0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x183f>
     11ef529:	6a 17                	push   0x17
     11ef52b:	41 58                	pop    r8
     11ef52d:	4c 89 f2             	mov    rdx,r14
     11ef530:	45 89 e9             	mov    r9d,r13d
     11ef533:	68 f4 01 00 00       	push   0x1f4
     11ef538:	41 54                	push   r12
     11ef53a:	e8 b3 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     11ef53f:	48 83 c4 10          	add    rsp,0x10
     11ef543:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef547:	48 8d 35 c2 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec8c2]        # 3dbe10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x185f>
     11ef54e:	48 8d 0d db c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8db]        # 3dbe30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x187f>
     11ef555:	6a 1a                	push   0x1a
     11ef557:	41 58                	pop    r8
     11ef559:	4c 89 f2             	mov    rdx,r14
     11ef55c:	41 b9 c8 00 00 00    	mov    r9d,0xc8
     11ef562:	68 e8 03 00 00       	push   0x3e8
     11ef567:	41 54                	push   r12
     11ef569:	e8 84 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     11ef56e:	48 83 c4 10          	add    rsp,0x10
     11ef572:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef576:	48 8d 35 d3 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec8d3]        # 3dbe50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x189f>
     11ef57d:	48 8d 0d ec c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8ec]        # 3dbe70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18bf>
     11ef584:	6a 18                	push   0x18
     11ef586:	41 58                	pop    r8
     11ef588:	4c 89 f2             	mov    rdx,r14
     11ef58b:	41 b9 b8 0b 00 00    	mov    r9d,0xbb8
     11ef591:	68 60 ea 00 00       	push   0xea60
     11ef596:	6a 00                	push   0x0
     11ef598:	e8 55 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     11ef59d:	48 83 c4 10          	add    rsp,0x10
     11ef5a1:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef5a5:	48 8d 35 e4 c8 1e ff 	lea    rsi,[rip+0xffffffffff1ec8e4]        # 3dbe90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18df>
     11ef5ac:	48 8d 0d fd c8 1e ff 	lea    rcx,[rip+0xffffffffff1ec8fd]        # 3dbeb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18ff>
     11ef5b3:	6a 1c                	push   0x1c
     11ef5b5:	41 58                	pop    r8
     11ef5b7:	4c 89 f2             	mov    rdx,r14
     11ef5ba:	41 b9 58 02 00 00    	mov    r9d,0x258
     11ef5c0:	68 80 51 01 00       	push   0x15180
     11ef5c5:	41 54                	push   r12
     11ef5c7:	e8 26 80 3f 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     11ef5cc:	48 83 c4 10          	add    rsp,0x10
     11ef5d0:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef5d4:	48 8d 35 25 c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec725]        # 3dbd00 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x174f>
     11ef5db:	4c 89 f2             	mov    rdx,r14
     11ef5de:	48 8d 0d 3b c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec73b]        # 3dbd20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x176f>
     11ef5e5:	4d 89 f8             	mov    r8,r15
     11ef5e8:	6a 08                	push   0x8
     11ef5ea:	41 5d                	pop    r13
     11ef5ec:	45 89 e9             	mov    r9d,r13d
     11ef5ef:	e8 36 7e 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     11ef5f4:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
     11ef5f8:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef5fc:	48 8d 35 3d c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec73d]        # 3dbd40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x178f>
     11ef603:	4c 89 f2             	mov    rdx,r14
     11ef606:	48 8d 0d 53 c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec753]        # 3dbd60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17af>
     11ef60d:	6a 20                	push   0x20
     11ef60f:	41 58                	pop    r8
     11ef611:	45 89 e9             	mov    r9d,r13d
     11ef614:	e8 11 7e 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     11ef619:	89 44 24 20          	mov    DWORD PTR [rsp+0x20],eax
     11ef61d:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef621:	48 8d 35 68 c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec768]        # 3dbd90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17df>
     11ef628:	4c 89 f2             	mov    rdx,r14
     11ef62b:	48 8d 0d 7e c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec77e]        # 3dbdb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x17ff>
     11ef632:	4d 89 f8             	mov    r8,r15
     11ef635:	45 89 e1             	mov    r9d,r12d
     11ef638:	e8 ed 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     11ef63d:	89 44 24 58          	mov    DWORD PTR [rsp+0x58],eax
     11ef641:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef645:	48 8d 35 84 c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec784]        # 3dbdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x181f>
     11ef64c:	4c 89 f2             	mov    rdx,r14
     11ef64f:	48 8d 0d 9a c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec79a]        # 3dbdf0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x183f>
     11ef656:	6a 17                	push   0x17
     11ef658:	41 58                	pop    r8
     11ef65a:	6a 64                	push   0x64
     11ef65c:	41 59                	pop    r9
     11ef65e:	e8 c7 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     11ef663:	89 44 24 30          	mov    DWORD PTR [rsp+0x30],eax
     11ef667:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef66b:	48 8d 35 9e c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec79e]        # 3dbe10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x185f>
     11ef672:	4c 89 f2             	mov    rdx,r14
     11ef675:	48 8d 0d b4 c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec7b4]        # 3dbe30 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x187f>
     11ef67c:	6a 1a                	push   0x1a
     11ef67e:	41 58                	pop    r8
     11ef680:	41 b9 c8 00 00 00    	mov    r9d,0xc8
     11ef686:	e8 9f 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     11ef68b:	89 84 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],eax
     11ef692:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef696:	48 8d 35 b3 c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec7b3]        # 3dbe50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x189f>
     11ef69d:	4c 89 f2             	mov    rdx,r14
     11ef6a0:	48 8d 0d c9 c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec7c9]        # 3dbe70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18bf>
     11ef6a7:	6a 18                	push   0x18
     11ef6a9:	41 58                	pop    r8
     11ef6ab:	41 b9 b8 0b 00 00    	mov    r9d,0xbb8
     11ef6b1:	e8 74 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     11ef6b6:	4c 63 e0             	movsxd r12,eax
     11ef6b9:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
     11ef6bd:	48 8d 35 cc c7 1e ff 	lea    rsi,[rip+0xffffffffff1ec7cc]        # 3dbe90 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18df>
     11ef6c4:	4c 89 f2             	mov    rdx,r14
     11ef6c7:	48 8d 0d e2 c7 1e ff 	lea    rcx,[rip+0xffffffffff1ec7e2]        # 3dbeb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x18ff>
     11ef6ce:	6a 1c                	push   0x1c
     11ef6d0:	41 58                	pop    r8
     11ef6d2:	41 b9 58 02 00 00    	mov    r9d,0x258
     11ef6d8:	e8 4d 7d 3f 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
     11ef6dd:	4c 63 f8             	movsxd r15,eax
     11ef6e0:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11ef6e7:	00 
     11ef6e8:	48 8d b4 24 c0 04 00 	lea    rsi,[rsp+0x4c0]
     11ef6ef:	00 
     11ef6f0:	4c 89 f7             	mov    rdi,r14
     11ef6f3:	e8 82 4a ab ff       	call   ca417a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f111a>
     11ef6f8:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     11ef6fd:	48 89 8c 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rcx
     11ef704:	00 
     11ef705:	48 8d 05 58 cd 88 ff 	lea    rax,[rip+0xffffffffff88cd58]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11ef70c:	48 89 84 24 f0 04 00 	mov    QWORD PTR [rsp+0x4f0],rax
     11ef713:	00 
     11ef714:	48 8d 05 87 a0 07 00 	lea    rax,[rip+0x7a087]        # 12697a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaed26>
     11ef71b:	48 89 84 24 f8 04 00 	mov    QWORD PTR [rsp+0x4f8],rax
     11ef722:	00 
     11ef723:	48 89 8c 24 50 05 00 	mov    QWORD PTR [rsp+0x550],rcx
     11ef72a:	00 
     11ef72b:	48 8d 05 32 cd 88 ff 	lea    rax,[rip+0xffffffffff88cd32]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11ef732:	48 89 84 24 60 05 00 	mov    QWORD PTR [rsp+0x560],rax
     11ef739:	00 
     11ef73a:	48 8d 05 7f a0 07 00 	lea    rax,[rip+0x7a07f]        # 12697c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaed44>
     11ef741:	48 89 84 24 68 05 00 	mov    QWORD PTR [rsp+0x568],rax
     11ef748:	00 
     11ef749:	48 8d ac 24 20 05 00 	lea    rbp,[rsp+0x520]
     11ef750:	00 
     11ef751:	48 89 ef             	mov    rdi,rbp
     11ef754:	48 8d b4 24 a0 04 00 	lea    rsi,[rsp+0x4a0]
     11ef75b:	00 
     11ef75c:	e8 c9 1e e8 ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
     11ef761:	48 8d 05 38 01 67 00 	lea    rax,[rip+0x670138]        # 185f8a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1bf88>
     11ef768:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
     11ef76c:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
     11ef770:	48 8b 84 24 58 06 00 	mov    rax,QWORD PTR [rsp+0x658]
     11ef777:	00 
     11ef778:	48 8b 30             	mov    rsi,QWORD PTR [rax]
     11ef77b:	e8 26 a1 3f 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
     11ef780:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11ef785:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
     11ef78c:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
     11ef793:	00 
     11ef794:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
     11ef79b:	4c 8b ac 24 60 06 00 	mov    r13,QWORD PTR [rsp+0x660]
     11ef7a2:	00 
     11ef7a3:	4c 89 ab 90 00 00 00 	mov    QWORD PTR [rbx+0x90],r13
     11ef7aa:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
     11ef7b1:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
     11ef7b6:	4c 89 f6             	mov    rsi,r14
     11ef7b9:	e8 bc 49 ab ff       	call   ca417a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f111a>
     11ef7be:	8b 44 24 08          	mov    eax,DWORD PTR [rsp+0x8]
     11ef7c2:	89 83 b8 00 00 00    	mov    DWORD PTR [rbx+0xb8],eax
     11ef7c8:	8b 44 24 20          	mov    eax,DWORD PTR [rsp+0x20]
     11ef7cc:	89 83 bc 00 00 00    	mov    DWORD PTR [rbx+0xbc],eax
     11ef7d2:	8b 44 24 58          	mov    eax,DWORD PTR [rsp+0x58]
     11ef7d6:	89 83 c0 00 00 00    	mov    DWORD PTR [rbx+0xc0],eax
     11ef7dc:	8b 44 24 30          	mov    eax,DWORD PTR [rsp+0x30]
     11ef7e0:	89 83 c4 00 00 00    	mov    DWORD PTR [rbx+0xc4],eax
     11ef7e6:	8b 84 24 c0 00 00 00 	mov    eax,DWORD PTR [rsp+0xc0]
     11ef7ed:	89 83 c8 00 00 00    	mov    DWORD PTR [rbx+0xc8],eax
     11ef7f3:	4c 89 a3 d0 00 00 00 	mov    QWORD PTR [rbx+0xd0],r12
     11ef7fa:	4c 89 bb d8 00 00 00 	mov    QWORD PTR [rbx+0xd8],r15
     11ef801:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
     11ef808:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     11ef80d:	48 89 ee             	mov    rsi,rbp
     11ef810:	e8 15 1e e8 ff       	call   107162a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x238a40>
     11ef815:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
     11ef81c:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
     11ef821:	4c 89 ee             	mov    rsi,r13
     11ef824:	e8 99 1e 5d 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11ef829:	4c 8d ab 10 01 00 00 	lea    r13,[rbx+0x110]
     11ef830:	4c 89 ef             	mov    rdi,r13
     11ef833:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     11ef838:	48 8b 54 24 70       	mov    rdx,QWORD PTR [rsp+0x70]
     11ef83d:	e8 d8 d1 8a ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
     11ef842:	48 8d ab 28 01 00 00 	lea    rbp,[rbx+0x128]
     11ef849:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     11ef850:	00 
     11ef851:	48 89 ef             	mov    rdi,rbp
     11ef854:	e8 c3 c8 05 00       	call   124c11c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x916a0>
     11ef859:	4c 8d b3 48 01 00 00 	lea    r14,[rbx+0x148]
     11ef860:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
     11ef867:	00 
     11ef868:	4c 89 f7             	mov    rdi,r14
     11ef86b:	e8 f4 c8 05 00       	call   124c164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x916e8>
     11ef870:	4c 8d bb 68 01 00 00 	lea    r15,[rbx+0x168]
     11ef877:	4c 89 ff             	mov    rdi,r15
     11ef87a:	e8 71 93 07 00       	call   1268bf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae174>
     11ef87f:	4c 8d a3 c0 01 00 00 	lea    r12,[rbx+0x1c0]
     11ef886:	4c 89 e7             	mov    rdi,r12
     11ef889:	e8 00 8a 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11ef88e:	48 8d 83 18 02 00 00 	lea    rax,[rbx+0x218]
     11ef895:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     11ef89a:	31 c0                	xor    eax,eax
     11ef89c:	88 83 48 02 00 00    	mov    BYTE PTR [rbx+0x248],al
     11ef8a2:	66 0f ef c0          	pxor   xmm0,xmm0
     11ef8a6:	66 0f 7f 83 50 02 00 	movdqa XMMWORD PTR [rbx+0x250],xmm0
     11ef8ad:	00 
     11ef8ae:	66 0f 7f 83 60 02 00 	movdqa XMMWORD PTR [rbx+0x260],xmm0
     11ef8b5:	00 
     11ef8b6:	f3 0f 7f 83 18 02 00 	movdqu XMMWORD PTR [rbx+0x218],xmm0
     11ef8bd:	00 
     11ef8be:	f3 0f 7f 83 21 02 00 	movdqu XMMWORD PTR [rbx+0x221],xmm0
     11ef8c5:	00 
     11ef8c6:	c7 83 70 02 00 00 00 	mov    DWORD PTR [rbx+0x270],0x3f800000
     11ef8cd:	00 80 3f 
     11ef8d0:	88 83 78 02 00 00    	mov    BYTE PTR [rbx+0x278],al
     11ef8d6:	66 0f 7f 83 80 02 00 	movdqa XMMWORD PTR [rbx+0x280],xmm0
     11ef8dd:	00 
     11ef8de:	f3 0f 7f 83 89 02 00 	movdqu XMMWORD PTR [rbx+0x289],xmm0
     11ef8e5:	00 
     11ef8e6:	83 a3 a0 02 00 00 00 	and    DWORD PTR [rbx+0x2a0],0x0
     11ef8ed:	48 8d bb c0 02 00 00 	lea    rdi,[rbx+0x2c0]
     11ef8f4:	f3 0f 7f 83 a8 02 00 	movdqu XMMWORD PTR [rbx+0x2a8],xmm0
     11ef8fb:	00 
     11ef8fc:	48 83 a3 b8 02 00 00 	and    QWORD PTR [rbx+0x2b8],0x0
     11ef903:	00 
     11ef904:	e8 21 5e 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     11ef909:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11ef910:	00 
     11ef911:	e8 3c 23 bf ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
     11ef916:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11ef91d:	00 
     11ef91e:	e8 2d 98 00 00       	call   11f9150 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
     11ef923:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11ef92a:	00 
     11ef92b:	e8 46 98 00 00       	call   11f9176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6fa>
     11ef930:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11ef937:	00 
     11ef938:	e8 77 40 8d ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
     11ef93d:	48 8d bc 24 a0 04 00 	lea    rdi,[rsp+0x4a0]
     11ef944:	00 
     11ef945:	e8 08 23 bf ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
     11ef94a:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11ef951:	00 
     11ef952:	e8 39 e5 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11ef957:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     11ef95e:	00 
     11ef95f:	e8 2c e5 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11ef964:	48 8d bc 24 c0 04 00 	lea    rdi,[rsp+0x4c0]
     11ef96b:	00 
     11ef96c:	e8 43 40 8d ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
     11ef971:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11ef976:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11ef979:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11ef980:	00 
     11ef981:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ef984:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
     11ef989:	4c 8b bc 24 50 05 00 	mov    r15,QWORD PTR [rsp+0x550]
     11ef990:	00 
     11ef991:	6a 78                	push   0x78
     11ef993:	5f                   	pop    rdi
     11ef994:	e8 67 e5 5f 00       	call   17edf00 <_Znwm@plt>
     11ef999:	49 89 c6             	mov    r14,rax
     11ef99c:	48 8d 05 1d 00 67 00 	lea    rax,[rip+0x67001d]        # 185f9c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1c0a8>
     11ef9a3:	49 89 06             	mov    QWORD PTR [r14],rax
     11ef9a6:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     11ef9aa:	4d 8d 66 10          	lea    r12,[r14+0x10]
     11ef9ae:	4c 89 e7             	mov    rdi,r12
     11ef9b1:	e8 8c be b3 ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
     11ef9b6:	4d 8b 6e 08          	mov    r13,QWORD PTR [r14+0x8]
     11ef9ba:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
     11ef9c1:	00 
     11ef9c2:	4d 89 30             	mov    QWORD PTR [r8],r14
     11ef9c5:	48 8d 35 c5 d6 8a ff 	lea    rsi,[rip+0xffffffffff8ad6c5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11ef9cc:	48 8d 0d 93 cf 07 00 	lea    rcx,[rip+0x7cf93]        # 126c966 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1eea>
     11ef9d3:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
     11ef9da:	00 
     11ef9db:	6a 08                	push   0x8
     11ef9dd:	41 59                	pop    r9
     11ef9df:	48 89 ef             	mov    rdi,rbp
     11ef9e2:	31 d2                	xor    edx,edx
     11ef9e4:	e8 ab ad 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11ef9e9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11ef9ed:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11ef9f4:	00 
     11ef9f5:	4c 89 ee             	mov    rsi,r13
     11ef9f8:	48 89 ea             	mov    rdx,rbp
     11ef9fb:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11ef9fe:	4c 89 f7             	mov    rdi,r14
     11efa01:	48 83 c7 68          	add    rdi,0x68
     11efa05:	4c 8d a4 24 e0 04 00 	lea    r12,[rsp+0x4e0]
     11efa0c:	00 
     11efa0d:	4c 89 e6             	mov    rsi,r12
     11efa10:	e8 29 a0 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11efa15:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11efa1a:	e8 67 ea 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11efa1f:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11efa26:	00 
     11efa27:	e8 bc ad 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11efa2c:	48 83 a4 24 a0 05 00 	and    QWORD PTR [rsp+0x5a0],0x0
     11efa33:	00 00 

## Construction of object with secondary address point 0x185bf88
     11f3f81:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11f3f84:	4c 8b bc 24 40 07 00 	mov    r15,QWORD PTR [rsp+0x740]
     11f3f8b:	00 
     11f3f8c:	48 8d bb a8 4a 00 00 	lea    rdi,[rbx+0x4aa8]
     11f3f93:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f3f9a:	00 
     11f3f9b:	4c 89 f6             	mov    rsi,r14
     11f3f9e:	e8 9b 5a 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f3fa3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f3fa7:	e8 da a4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f3fac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f3fb3:	00 
     11f3fb4:	e8 2f 68 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f3fb9:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     11f3fbd:	48 89 83 c8 4a 00 00 	mov    QWORD PTR [rbx+0x4ac8],rax
     11f3fc4:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     11f3fc9:	f3 0f 7f 83 b8 4a 00 	movdqu XMMWORD PTR [rbx+0x4ab8],xmm0
     11f3fd0:	00 
     11f3fd1:	66 0f ef c0          	pxor   xmm0,xmm0
     11f3fd5:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
     11f3fda:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     11f3fdf:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f3fe6:	00 
     11f3fe7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f3fea:	4c 89 e6             	mov    rsi,r12
     11f3fed:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f3ff0:	48 8b b4 24 50 06 00 	mov    rsi,QWORD PTR [rsp+0x650]
     11f3ff7:	00 
     11f3ff8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f3ffb:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f4002:	00 
     11f4003:	ff 90 b8 00 00 00    	call   QWORD PTR [rax+0xb8]
     11f4009:	4c 8b b4 24 a0 06 00 	mov    r14,QWORD PTR [rsp+0x6a0]
     11f4010:	00 
     11f4011:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f4014:	48 8d 94 24 e0 04 00 	lea    rdx,[rsp+0x4e0]
     11f401b:	00 
     11f401c:	4c 89 f7             	mov    rdi,r14
     11f401f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     11f4024:	ff 50 48             	call   QWORD PTR [rax+0x48]
     11f4027:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f402e:	00 
     11f402f:	e8 08 24 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
     11f4034:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11f4037:	4c 89 f7             	mov    rdi,r14
     11f403a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f403d:	49 89 c6             	mov    r14,rax
     11f4040:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f4045:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f4048:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
     11f404f:	00 
     11f4050:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f4053:	4c 8b ac 24 80 05 00 	mov    r13,QWORD PTR [rsp+0x580]
     11f405a:	00 
     11f405b:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f4062:	00 
     11f4063:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4066:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f4069:	49 89 c7             	mov    r15,rax
     11f406c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11f4073:	00 
     11f4074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4077:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11f407a:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     11f407f:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
     11f4084:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
     11f408b:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     11f4090:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
     11f4097:	00 00 
     11f4099:	48 8d 05 40 3d 7e ff 	lea    rax,[rip+0xffffffffff7e3d40]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f40a0:	48 89 84 24 30 05 00 	mov    QWORD PTR [rsp+0x530],rax
     11f40a7:	00 
     11f40a8:	48 8d 05 cb ed 95 ff 	lea    rax,[rip+0xffffffffff95edcb]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11f40af:	48 89 84 24 38 05 00 	mov    QWORD PTR [rsp+0x538],rax
     11f40b6:	00 
     11f40b7:	48 8b 83 28 1a 00 00 	mov    rax,QWORD PTR [rbx+0x1a28]
     11f40be:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     11f40c5:	00 
     11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     11f40cb:	41 0f b6 84 24 b1 00 	movzx  eax,BYTE PTR [r12+0xb1]
     11f40d2:	00 00 
     11f40d4:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
     11f40db:	bf 98 20 00 00       	mov    edi,0x2098
     11f40e0:	e8 1b 9e 5f 00       	call   17edf00 <_Znwm@plt>
     11f40e5:	49 89 c7             	mov    r15,rax
     11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
     11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
     11f40f3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     11f40f8:	48 8d 05 81 79 66 00 	lea    rax,[rip+0x667981]        # 185ba80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18168>
     11f40ff:	49 89 07             	mov    QWORD PTR [r15],rax
     11f4102:	41 8a 84 24 88 00 00 	mov    al,BYTE PTR [r12+0x88]
     11f4109:	00 
     11f410a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     11f410e:	41 8a 84 24 89 00 00 	mov    al,BYTE PTR [r12+0x89]
     11f4115:	00 
     11f4116:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
     11f411d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f4124:	00 
     11f4125:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
     11f412c:	00 
     11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f4139:	00 
     11f413a:	48 89 ee             	mov    rsi,rbp
     11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
     11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
     11f4154:	00 
     11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
     11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
     11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
     11f4198:	00 
     11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
     11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
     11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
     11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     11f41af:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
     11f41b3:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
     11f41ba:	00 
     11f41bb:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
     11f41bf:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     11f41c3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     11f41c8:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
     11f41cf:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
     11f41d6:	00 
     11f41d7:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
     11f41de:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
     11f41e5:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
     11f41ec:	00 
     11f41ed:	4c 89 e7             	mov    rdi,r12
     11f41f0:	e8 71 19 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f41f5:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11f41fa:	49 89 87 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],rax
     11f4201:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     11f4206:	49 89 87 b8 00 00 00 	mov    QWORD PTR [r15+0xb8],rax
     11f420d:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]

## Candidate dependency field stores in 0x11ef334
### 0x11ef398: mov    QWORD PTR [rbx+0x20],rax
     11ef376:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
     11ef37a:	48 8d 05 c7 c5 66 00 	lea    rax,[rip+0x66c5c7]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>
     11ef381:	48 89 07             	mov    QWORD PTR [rdi],rax
     11ef384:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     11ef389:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11ef390:	00 
     11ef391:	48 8d 05 48 8a 7e ff 	lea    rax,[rip+0xffffffffff7e8a48]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11ef398:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
     11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
     11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     11ef3bd:	00 
     11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi

### 0x11ef3a3: mov    QWORD PTR [rbx+0x28],rax
     11ef381:	48 89 07             	mov    QWORD PTR [rdi],rax
     11ef384:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     11ef389:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]
     11ef390:	00 
     11ef391:	48 8d 05 48 8a 7e ff 	lea    rax,[rip+0xffffffffff7e8a48]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11ef398:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
     11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
     11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     11ef3bd:	00 
     11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     11ef3c7:	48 8b 86 fc 00 00 00 	mov    rax,QWORD PTR [rsi+0xfc]
     11ef3ce:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax

### 0x11ef3b2: mov    QWORD PTR [rbx+0x30],rax
     11ef390:	00 
     11ef391:	48 8d 05 48 8a 7e ff 	lea    rax,[rip+0xffffffffff7e8a48]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11ef398:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
     11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
     11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     11ef3bd:	00 
     11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     11ef3c7:	48 8b 86 fc 00 00 00 	mov    rax,QWORD PTR [rsi+0xfc]
     11ef3ce:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
     11ef3d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ef3d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ef3d8:	48 8b 08             	mov    rcx,QWORD PTR [rax]

### 0x11ef3be: mov    QWORD PTR [rbx+0x50],rcx
     11ef39c:	48 8d 05 d7 3a 96 ff 	lea    rax,[rip+0xffffffffff963ad7]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11ef3a3:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
     11ef3a7:	48 8d 4b 30          	lea    rcx,[rbx+0x30]
     11ef3ab:	48 8d 05 16 c7 66 00 	lea    rax,[rip+0x66c716]        # 185bac8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x181b0>
     11ef3b2:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
     11ef3b6:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
     11ef3bd:	00 
     11ef3be:	48 89 4b 50          	mov    QWORD PTR [rbx+0x50],rcx
     11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     11ef3c7:	48 8b 86 fc 00 00 00 	mov    rax,QWORD PTR [rsi+0xfc]
     11ef3ce:	48 89 43 60          	mov    QWORD PTR [rbx+0x60],rax
     11ef3d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11ef3d5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11ef3d8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     11ef3db:	48 89 c7             	mov    rdi,rax
     11ef3de:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     11ef3e1:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax

### 0x11ef9a6: mov    QWORD PTR [r14+0x8],r12
     11ef990:	00 
     11ef991:	6a 78                	push   0x78
     11ef993:	5f                   	pop    rdi
     11ef994:	e8 67 e5 5f 00       	call   17edf00 <_Znwm@plt>
     11ef999:	49 89 c6             	mov    r14,rax
     11ef99c:	48 8d 05 1d 00 67 00 	lea    rax,[rip+0x67001d]        # 185f9c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1c0a8>
     11ef9a3:	49 89 06             	mov    QWORD PTR [r14],rax
     11ef9a6:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     11ef9aa:	4d 8d 66 10          	lea    r12,[r14+0x10]
     11ef9ae:	4c 89 e7             	mov    rdi,r12
     11ef9b1:	e8 8c be b3 ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
     11ef9b6:	4d 8b 6e 08          	mov    r13,QWORD PTR [r14+0x8]
     11ef9ba:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
     11ef9c1:	00 
     11ef9c2:	4d 89 30             	mov    QWORD PTR [r8],r14
     11ef9c5:	48 8d 35 c5 d6 8a ff 	lea    rsi,[rip+0xffffffffff8ad6c5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11ef9cc:	48 8d 0d 93 cf 07 00 	lea    rcx,[rip+0x7cf93]        # 126c966 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1eea>

### 0x11ef9b6: mov    r13,QWORD PTR [r14+0x8]
     11ef999:	49 89 c6             	mov    r14,rax
     11ef99c:	48 8d 05 1d 00 67 00 	lea    rax,[rip+0x67001d]        # 185f9c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1c0a8>
     11ef9a3:	49 89 06             	mov    QWORD PTR [r14],rax
     11ef9a6:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     11ef9aa:	4d 8d 66 10          	lea    r12,[r14+0x10]
     11ef9ae:	4c 89 e7             	mov    rdi,r12
     11ef9b1:	e8 8c be b3 ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
     11ef9b6:	4d 8b 6e 08          	mov    r13,QWORD PTR [r14+0x8]
     11ef9ba:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
     11ef9c1:	00 
     11ef9c2:	4d 89 30             	mov    QWORD PTR [r8],r14
     11ef9c5:	48 8d 35 c5 d6 8a ff 	lea    rsi,[rip+0xffffffffff8ad6c5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11ef9cc:	48 8d 0d 93 cf 07 00 	lea    rcx,[rip+0x7cf93]        # 126c966 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1eea>
     11ef9d3:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
     11ef9da:	00 
     11ef9db:	6a 08                	push   0x8
     11ef9dd:	41 59                	pop    r9

### 0x11efac8: mov    QWORD PTR [r14+0x20],rax
     11efaad:	0f 57 c9             	xorps  xmm1,xmm1
     11efab0:	0f 29 8c 24 20 05 00 	movaps XMMWORD PTR [rsp+0x520],xmm1
     11efab7:	00 
     11efab8:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     11efabb:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     11efac0:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     11efac7:	00 
     11efac8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     11efacc:	4d 89 6e 28          	mov    QWORD PTR [r14+0x28],r13
     11efad0:	41 0f 11 4e 30       	movups XMMWORD PTR [r14+0x30],xmm1
     11efad5:	4d 8d 7e 40          	lea    r15,[r14+0x40]
     11efad9:	4c 89 ff             	mov    rdi,r15
     11efadc:	e8 15 9f 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efae1:	4d 8d 66 50          	lea    r12,[r14+0x50]
     11efae5:	4c 89 e7             	mov    rdi,r12
     11efae8:	e8 a1 87 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11efaed:	4c 89 f7             	mov    rdi,r14

### 0x11efacc: mov    QWORD PTR [r14+0x28],r13
     11efab0:	0f 29 8c 24 20 05 00 	movaps XMMWORD PTR [rsp+0x520],xmm1
     11efab7:	00 
     11efab8:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     11efabb:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     11efac0:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     11efac7:	00 
     11efac8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     11efacc:	4d 89 6e 28          	mov    QWORD PTR [r14+0x28],r13
     11efad0:	41 0f 11 4e 30       	movups XMMWORD PTR [r14+0x30],xmm1
     11efad5:	4d 8d 7e 40          	lea    r15,[r14+0x40]
     11efad9:	4c 89 ff             	mov    rdi,r15
     11efadc:	e8 15 9f 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efae1:	4d 8d 66 50          	lea    r12,[r14+0x50]
     11efae5:	4c 89 e7             	mov    rdi,r12
     11efae8:	e8 a1 87 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11efaed:	4c 89 f7             	mov    rdi,r14
     11efaf0:	48 81 c7 a8 00 00 00 	add    rdi,0xa8

### 0x11efad0: movups XMMWORD PTR [r14+0x30],xmm1
     11efab7:	00 
     11efab8:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
     11efabb:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     11efac0:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
     11efac7:	00 
     11efac8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
     11efacc:	4d 89 6e 28          	mov    QWORD PTR [r14+0x28],r13
     11efad0:	41 0f 11 4e 30       	movups XMMWORD PTR [r14+0x30],xmm1
     11efad5:	4d 8d 7e 40          	lea    r15,[r14+0x40]
     11efad9:	4c 89 ff             	mov    rdi,r15
     11efadc:	e8 15 9f 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11efae1:	4d 8d 66 50          	lea    r12,[r14+0x50]
     11efae5:	4c 89 e7             	mov    rdi,r12
     11efae8:	e8 a1 87 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11efaed:	4c 89 f7             	mov    rdi,r14
     11efaf0:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
     11efaf7:	e8 2e 5c 97 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>

### 0x11efc1f: mov    rdi,QWORD PTR [r14+0x8]
     11efc04:	e8 c1 a3 5e 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>
     11efc09:	48 89 ef             	mov    rdi,rbp
     11efc0c:	e8 d7 ab 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11efc11:	4d 89 e5             	mov    r13,r12
     11efc14:	4c 89 e7             	mov    rdi,r12
     11efc17:	4c 89 f6             	mov    rsi,r14
     11efc1a:	e8 d3 9f 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11efc1f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11efc23:	e8 5e e8 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11efc28:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11efc2f:	00 
     11efc30:	e8 b3 ab 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11efc35:	4c 8b a3 d8 02 00 00 	mov    r12,QWORD PTR [rbx+0x2d8]
     11efc3c:	4d 89 3e             	mov    QWORD PTR [r14],r15
     11efc3f:	48 8d 0d c2 8f 07 00 	lea    rcx,[rip+0x78fc2]        # 1268c08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae18c>
     11efc46:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11efc4d:	00 

### 0x11efc98: mov    rdi,QWORD PTR [r14+0x8]
     11efc7d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11efc80:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11efc87:	00 
     11efc88:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]
     11efc8d:	4c 89 e7             	mov    rdi,r12
     11efc90:	4c 89 f6             	mov    rsi,r14
     11efc93:	e8 5a 9f 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11efc98:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11efc9c:	e8 e5 e7 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11efca1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11efca8:	00 
     11efca9:	e8 3a ab 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11efcae:	4c 8b b3 d8 02 00 00 	mov    r14,QWORD PTR [rbx+0x2d8]
     11efcb5:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11efcbc:	00 
     11efcbd:	4c 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],r15
     11efcc2:	4d 89 38             	mov    QWORD PTR [r8],r15

### 0x11efd12: mov    rdi,QWORD PTR [r14+0x8]
     11efcf7:	4c 89 fa             	mov    rdx,r15
     11efcfa:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11efcfd:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11efd04:	00 
     11efd05:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     11efd0a:	4c 89 f6             	mov    rsi,r14
     11efd0d:	e8 e0 9e 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11efd12:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11efd16:	e8 6b e7 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11efd1b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11efd22:	00 
     11efd23:	e8 c0 aa 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11efd28:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     11efd2f:	00 
     11efd30:	e8 df 5d 00 00       	call   11f5b14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b098>
     11efd35:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
     11efd3c:	00 

### 0x11eff8d: mov    rdi,QWORD PTR [r14+0x8]
     11eff72:	48 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],rbp
     11eff77:	ff 50 58             	call   QWORD PTR [rax+0x58]
     11eff7a:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
     11eff81:	00 
     11eff82:	4c 89 e7             	mov    rdi,r12
     11eff85:	4c 89 f6             	mov    rsi,r14
     11eff88:	e8 65 9c 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11eff8d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11eff91:	e8 f0 e4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11eff96:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11eff9d:	00 
     11eff9e:	e8 c7 9f 88 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11effa3:	4c 8b b3 28 04 00 00 	mov    r14,QWORD PTR [rbx+0x428]
     11effaa:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
     11effb1:	00 
     11effb2:	4d 89 28             	mov    QWORD PTR [r8],r13
     11effb5:	48 8d 35 d5 d0 8a ff 	lea    rsi,[rip+0xffffffffff8ad0d5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>

### 0x11f000c: mov    rdi,QWORD PTR [r14+0x8]
     11effed:	48 8d 83 88 04 00 00 	lea    rax,[rbx+0x488]
     11efff4:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     11efff9:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
     11f0000:	00 
     11f0001:	48 89 ef             	mov    rdi,rbp
     11f0004:	4c 89 f6             	mov    rsi,r14
     11f0007:	e8 e6 9b 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f000c:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f0010:	e8 71 e4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0015:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f001c:	00 
     11f001d:	e8 c6 a7 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0022:	48 8b ab 30 04 00 00 	mov    rbp,QWORD PTR [rbx+0x430]
     11f0029:	4c 8d a4 24 20 05 00 	lea    r12,[rsp+0x520]
     11f0030:	00 
     11f0031:	4d 89 ef             	mov    r15,r13
     11f0034:	4d 89 2c 24          	mov    QWORD PTR [r12],r13

### 0x11f00f6: mov    rdi,QWORD PTR [r14+0x8]
     11f00da:	4c 89 f7             	mov    rdi,r14
     11f00dd:	4c 89 ee             	mov    rsi,r13
     11f00e0:	4c 89 e2             	mov    rdx,r12
     11f00e3:	ff 90 00 01 00 00    	call   QWORD PTR [rax+0x100]
     11f00e9:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
     11f00ee:	4c 89 f6             	mov    rsi,r14
     11f00f1:	e8 fc 9a 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f00f6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f00fa:	e8 87 e3 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f00ff:	4c 89 e7             	mov    rdi,r12
     11f0102:	e8 e1 a6 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0107:	48 8d 05 3a ec 66 00 	lea    rax,[rip+0x66ec3a]        # 185ed48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b430>
     11f010e:	49 89 04 24          	mov    QWORD PTR [r12],rax
     11f0112:	4d 89 7c 24 08       	mov    QWORD PTR [r12+0x8],r15
     11f0117:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
     11f011c:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     11f0121:	48 8b b4 24 e0 06 00 	mov    rsi,QWORD PTR [rsp+0x6e0]

### 0x11f01cb: mov    rdi,QWORD PTR [r14+0x8]
     11f01b0:	4c 89 fa             	mov    rdx,r15
     11f01b3:	ff 50 40             	call   QWORD PTR [rax+0x40]
     11f01b6:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
     11f01bd:	00 
     11f01be:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11f01c3:	4c 89 f6             	mov    rsi,r14
     11f01c6:	e8 27 9a 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f01cb:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f01cf:	e8 b2 e2 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f01d4:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f01db:	00 
     11f01dc:	e8 07 a6 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f01e1:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     11f01e8:	00 
     11f01e9:	e8 a2 dc 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f01ee:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f01f5:	00 

### 0x11f0214: mov    QWORD PTR [r14+0x18],rax
     11f01f5:	00 
     11f01f6:	4c 89 f7             	mov    rdi,r14
     11f01f9:	e8 92 dc 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f01fe:	49 83 26 00          	and    QWORD PTR [r14],0x0
     11f0202:	48 8d 05 d7 7b 7e ff 	lea    rax,[rip+0xffffffffff7e7bd7]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     11f0209:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     11f020d:	48 8d 05 66 2c 96 ff 	lea    rax,[rip+0xffffffffff962c66]        # b52e7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9fe1a>
     11f0214:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11f0218:	bf a0 00 00 00       	mov    edi,0xa0
     11f021d:	e8 de dc 5f 00       	call   17edf00 <_Znwm@plt>
     11f0222:	49 89 c6             	mov    r14,rax
     11f0225:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f022c:	00 
     11f022d:	4c 8d a4 24 e0 04 00 	lea    r12,[rsp+0x4e0]
     11f0234:	00 
     11f0235:	4c 89 ff             	mov    rdi,r15
     11f0238:	4c 89 e6             	mov    rsi,r12

### 0x11f0256: mov    DWORD PTR [r14+0x28],0x3c
     11f0238:	4c 89 e6             	mov    rsi,r12
     11f023b:	e8 26 59 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f0240:	48 8d 05 91 3c 67 00 	lea    rax,[rip+0x673c91]        # 1863ed8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x205c0>
     11f0247:	49 89 06             	mov    QWORD PTR [r14],rax
     11f024a:	49 8d 7e 08          	lea    rdi,[r14+0x8]
     11f024e:	4c 89 fe             	mov    rsi,r15
     11f0251:	e8 10 59 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f0256:	41 c7 46 28 3c 00 00 	mov    DWORD PTR [r14+0x28],0x3c
     11f025d:	00 
     11f025e:	31 c0                	xor    eax,eax
     11f0260:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al
     11f0264:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
     11f0268:	4c 89 f7             	mov    rdi,r14
     11f026b:	48 83 c7 48          	add    rdi,0x48
     11f026f:	e8 1a 80 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0274:	4c 89 b4 24 50 05 00 	mov    QWORD PTR [rsp+0x550],r14
     11f027b:	00 

### 0x11f0260: mov    BYTE PTR [r14+0x30],al
     11f0247:	49 89 06             	mov    QWORD PTR [r14],rax
     11f024a:	49 8d 7e 08          	lea    rdi,[r14+0x8]
     11f024e:	4c 89 fe             	mov    rsi,r15
     11f0251:	e8 10 59 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f0256:	41 c7 46 28 3c 00 00 	mov    DWORD PTR [r14+0x28],0x3c
     11f025d:	00 
     11f025e:	31 c0                	xor    eax,eax
     11f0260:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al
     11f0264:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
     11f0268:	4c 89 f7             	mov    rdi,r14
     11f026b:	48 83 c7 48          	add    rdi,0x48
     11f026f:	e8 1a 80 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0274:	4c 89 b4 24 50 05 00 	mov    QWORD PTR [rsp+0x550],r14
     11f027b:	00 
     11f027c:	4c 89 ff             	mov    rdi,r15
     11f027f:	e8 2a 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f0284:	4c 89 e7             	mov    rdi,r12

### 0x11f0264: mov    BYTE PTR [r14+0x40],al
     11f024a:	49 8d 7e 08          	lea    rdi,[r14+0x8]
     11f024e:	4c 89 fe             	mov    rsi,r15
     11f0251:	e8 10 59 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f0256:	41 c7 46 28 3c 00 00 	mov    DWORD PTR [r14+0x28],0x3c
     11f025d:	00 
     11f025e:	31 c0                	xor    eax,eax
     11f0260:	41 88 46 30          	mov    BYTE PTR [r14+0x30],al
     11f0264:	41 88 46 40          	mov    BYTE PTR [r14+0x40],al
     11f0268:	4c 89 f7             	mov    rdi,r14
     11f026b:	48 83 c7 48          	add    rdi,0x48
     11f026f:	e8 1a 80 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0274:	4c 89 b4 24 50 05 00 	mov    QWORD PTR [rsp+0x550],r14
     11f027b:	00 
     11f027c:	4c 89 ff             	mov    rdi,r15
     11f027f:	e8 2a 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f0284:	4c 89 e7             	mov    rdi,r12
     11f0287:	e8 22 59 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>

### 0x11f03fc: mov    rdi,QWORD PTR [r14+0x8]
     11f03dc:	4c 89 f2             	mov    rdx,r14
     11f03df:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     11f03e5:	48 8d bb c0 06 00 00 	lea    rdi,[rbx+0x6c0]
     11f03ec:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11f03f3:	00 
     11f03f4:	4c 89 f6             	mov    rsi,r14
     11f03f7:	e8 42 96 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f03fc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f0400:	e8 81 e0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0405:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     11f040c:	00 
     11f040d:	e8 d6 a3 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0412:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f0419:	00 
     11f041a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f041d:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f0420:	4c 8b b4 24 90 06 00 	mov    r14,QWORD PTR [rsp+0x690]

### 0x11f08b3: movups XMMWORD PTR [r14+0x8],xmm0
     11f0897:	48 8b 84 24 a8 05 00 	mov    rax,QWORD PTR [rsp+0x5a8]
     11f089e:	00 
     11f089f:	48 85 c0             	test   rax,rax
     11f08a2:	74 05                	je     11f08a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35e2d>
     11f08a4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     11f08a9:	48 8d 05 b0 d6 66 00 	lea    rax,[rip+0x66d6b0]        # 185df60 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a648>
     11f08b0:	49 89 06             	mov    QWORD PTR [r14],rax
     11f08b3:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
     11f08b8:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f08bf:	00 
     11f08c0:	4d 89 30             	mov    QWORD PTR [r8],r14
     11f08c3:	48 8d 35 c7 c7 8a ff 	lea    rsi,[rip+0xffffffffff8ac7c7]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f08ca:	48 8d 0d bd 93 e1 ff 	lea    rcx,[rip+0xffffffffffe193bd]        # 1009c8e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d10a4>
     11f08d1:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f08d8:	00 
     11f08d9:	6a 08                	push   0x8
     11f08db:	41 59                	pop    r9

### 0x11f091c: mov    rdi,QWORD PTR [r15+0x8]
     11f0902:	4c 89 fa             	mov    rdx,r15
     11f0905:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11f0908:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     11f090c:	4c 8d bc 24 e0 04 00 	lea    r15,[rsp+0x4e0]
     11f0913:	00 
     11f0914:	4c 89 fe             	mov    rsi,r15
     11f0917:	e8 22 91 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f091c:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     11f0920:	e8 61 db 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0925:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f092c:	00 
     11f092d:	e8 b6 9e 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0932:	4c 89 f7             	mov    rdi,r14
     11f0935:	48 83 c7 60          	add    rdi,0x60
     11f0939:	66 0f ef c0          	pxor   xmm0,xmm0
     11f093d:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     11f0943:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0

### 0x11f093d: movdqu XMMWORD PTR [r14+0x48],xmm0
     11f0920:	e8 61 db 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0925:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f092c:	00 
     11f092d:	e8 b6 9e 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0932:	4c 89 f7             	mov    rdi,r14
     11f0935:	48 83 c7 60          	add    rdi,0x60
     11f0939:	66 0f ef c0          	pxor   xmm0,xmm0
     11f093d:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     11f0943:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
     11f0949:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     11f094f:	41 c6 46 58 00       	mov    BYTE PTR [r14+0x58],0x0
     11f0954:	e8 35 79 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0959:	4c 89 b4 24 98 01 00 	mov    QWORD PTR [rsp+0x198],r14
     11f0960:	00 
     11f0961:	31 ff                	xor    edi,edi
     11f0963:	e8 1e db 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0968:	bf b8 00 00 00       	mov    edi,0xb8

### 0x11f0943: movdqu XMMWORD PTR [r14+0x38],xmm0
     11f0925:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f092c:	00 
     11f092d:	e8 b6 9e 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0932:	4c 89 f7             	mov    rdi,r14
     11f0935:	48 83 c7 60          	add    rdi,0x60
     11f0939:	66 0f ef c0          	pxor   xmm0,xmm0
     11f093d:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     11f0943:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
     11f0949:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     11f094f:	41 c6 46 58 00       	mov    BYTE PTR [r14+0x58],0x0
     11f0954:	e8 35 79 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0959:	4c 89 b4 24 98 01 00 	mov    QWORD PTR [rsp+0x198],r14
     11f0960:	00 
     11f0961:	31 ff                	xor    edi,edi
     11f0963:	e8 1e db 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0968:	bf b8 00 00 00       	mov    edi,0xb8
     11f096d:	e8 8e d5 5f 00       	call   17edf00 <_Znwm@plt>

### 0x11f0949: movdqu XMMWORD PTR [r14+0x28],xmm0
     11f092c:	00 
     11f092d:	e8 b6 9e 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0932:	4c 89 f7             	mov    rdi,r14
     11f0935:	48 83 c7 60          	add    rdi,0x60
     11f0939:	66 0f ef c0          	pxor   xmm0,xmm0
     11f093d:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
     11f0943:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
     11f0949:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
     11f094f:	41 c6 46 58 00       	mov    BYTE PTR [r14+0x58],0x0
     11f0954:	e8 35 79 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0959:	4c 89 b4 24 98 01 00 	mov    QWORD PTR [rsp+0x198],r14
     11f0960:	00 
     11f0961:	31 ff                	xor    edi,edi
     11f0963:	e8 1e db 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0968:	bf b8 00 00 00       	mov    edi,0xb8
     11f096d:	e8 8e d5 5f 00       	call   17edf00 <_Znwm@plt>
     11f0972:	49 89 c7             	mov    r15,rax

### 0x11f09a6: mov    QWORD PTR [r15+0x8],rax
     11f0986:	48 83 a4 24 98 01 00 	and    QWORD PTR [rsp+0x198],0x0
     11f098d:	00 00 
     11f098f:	48 8d 0d 82 d5 66 00 	lea    rcx,[rip+0x66d582]        # 185df18 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a600>
     11f0996:	49 89 0f             	mov    QWORD PTR [r15],rcx
     11f0999:	4d 8d 67 08          	lea    r12,[r15+0x8]
     11f099d:	48 83 a4 24 20 05 00 	and    QWORD PTR [rsp+0x520],0x0
     11f09a4:	00 00 
     11f09a6:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     11f09aa:	4d 8d 6f 10          	lea    r13,[r15+0x10]
     11f09ae:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     11f09b5:	00 00 
     11f09b7:	4d 89 77 10          	mov    QWORD PTR [r15+0x10],r14
     11f09bb:	4c 8b b4 24 a0 05 00 	mov    r14,QWORD PTR [rsp+0x5a0]
     11f09c2:	00 
     11f09c3:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f09ca:	00 
     11f09cb:	4d 89 38             	mov    QWORD PTR [r8],r15

### 0x11f0a1a: mov    rdi,QWORD PTR [r14+0x8]
     11f0a00:	48 89 ea             	mov    rdx,rbp
     11f0a03:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11f0a06:	49 8d 7f 18          	lea    rdi,[r15+0x18]
     11f0a0a:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f0a11:	00 
     11f0a12:	4c 89 f6             	mov    rsi,r14
     11f0a15:	e8 24 90 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f0a1a:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f0a1e:	e8 63 da 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0a23:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f0a2a:	00 
     11f0a2b:	e8 b8 9d 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0a30:	4c 89 ff             	mov    rdi,r15
     11f0a33:	48 83 c7 60          	add    rdi,0x60
     11f0a37:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0a3b:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
     11f0a41:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0

### 0x11f0a3b: movdqu XMMWORD PTR [r15+0x48],xmm0
     11f0a1e:	e8 63 da 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0a23:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f0a2a:	00 
     11f0a2b:	e8 b8 9d 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0a30:	4c 89 ff             	mov    rdi,r15
     11f0a33:	48 83 c7 60          	add    rdi,0x60
     11f0a37:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0a3b:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
     11f0a41:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
     11f0a47:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
     11f0a4d:	41 c6 47 58 00       	mov    BYTE PTR [r15+0x58],0x0
     11f0a52:	e8 37 78 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0a57:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f0a5e:	00 
     11f0a5f:	e8 3c 59 00 00       	call   11f63a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b924>
     11f0a64:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f0a6b:	00 

### 0x11f0a41: movdqu XMMWORD PTR [r15+0x38],xmm0
     11f0a23:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f0a2a:	00 
     11f0a2b:	e8 b8 9d 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0a30:	4c 89 ff             	mov    rdi,r15
     11f0a33:	48 83 c7 60          	add    rdi,0x60
     11f0a37:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0a3b:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
     11f0a41:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
     11f0a47:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
     11f0a4d:	41 c6 47 58 00       	mov    BYTE PTR [r15+0x58],0x0
     11f0a52:	e8 37 78 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0a57:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f0a5e:	00 
     11f0a5f:	e8 3c 59 00 00       	call   11f63a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b924>
     11f0a64:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f0a6b:	00 
     11f0a6c:	e8 4f 59 00 00       	call   11f63c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b944>

### 0x11f0a47: movdqu XMMWORD PTR [r15+0x28],xmm0
     11f0a2a:	00 
     11f0a2b:	e8 b8 9d 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0a30:	4c 89 ff             	mov    rdi,r15
     11f0a33:	48 83 c7 60          	add    rdi,0x60
     11f0a37:	66 0f ef c0          	pxor   xmm0,xmm0
     11f0a3b:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
     11f0a41:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
     11f0a47:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
     11f0a4d:	41 c6 47 58 00       	mov    BYTE PTR [r15+0x58],0x0
     11f0a52:	e8 37 78 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f0a57:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f0a5e:	00 
     11f0a5f:	e8 3c 59 00 00       	call   11f63a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b924>
     11f0a64:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f0a6b:	00 
     11f0a6c:	e8 4f 59 00 00       	call   11f63c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b944>
     11f0a71:	4c 89 bb d0 0e 00 00 	mov    QWORD PTR [rbx+0xed0],r15

### 0x11f10f1: mov    rdi,QWORD PTR [r14+0x8]
     11f10d5:	4c 89 e9             	mov    rcx,r13
     11f10d8:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     11f10de:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f10e5:	00 
     11f10e6:	4c 89 e7             	mov    rdi,r12
     11f10e9:	4c 89 f6             	mov    rsi,r14
     11f10ec:	e8 01 8b 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f10f1:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f10f5:	e8 8c d3 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f10fa:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f1101:	00 
     11f1102:	e8 e1 96 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f1107:	48 8d 05 82 cb 66 00 	lea    rax,[rip+0x66cb82]        # 185dc90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a378>
     11f110e:	48 89 83 e0 14 00 00 	mov    QWORD PTR [rbx+0x14e0],rax
     11f1115:	83 a3 e8 14 00 00 00 	and    DWORD PTR [rbx+0x14e8],0x0
     11f111c:	4c 8d bb e0 14 00 00 	lea    r15,[rbx+0x14e0]
     11f1123:	48 8d bb f0 14 00 00 	lea    rdi,[rbx+0x14f0]

### 0x11f1283: mov    rdi,QWORD PTR [r14+0x8]
     11f1267:	4c 89 f1             	mov    rcx,r14
     11f126a:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     11f1270:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1277:	00 
     11f1278:	4c 89 ef             	mov    rdi,r13
     11f127b:	4c 89 f6             	mov    rsi,r14
     11f127e:	e8 6f 89 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f1283:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f1287:	e8 fa d1 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f128c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f1293:	00 
     11f1294:	e8 4f 95 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f1299:	4c 8d bb f0 16 00 00 	lea    r15,[rbx+0x16f0]
     11f12a0:	48 8d 05 31 db 66 00 	lea    rax,[rip+0x66db31]        # 185edd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b4c0>
     11f12a7:	48 89 83 f0 16 00 00 	mov    QWORD PTR [rbx+0x16f0],rax
     11f12ae:	83 a3 f8 16 00 00 00 	and    DWORD PTR [rbx+0x16f8],0x0
     11f12b5:	48 8d 83 00 17 00 00 	lea    rax,[rbx+0x1700]

### 0x11f1421: mov    rdi,QWORD PTR [r14+0x8]
     11f1405:	4c 89 f1             	mov    rcx,r14
     11f1408:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     11f140e:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1415:	00 
     11f1416:	4c 89 ef             	mov    rdi,r13
     11f1419:	4c 89 f6             	mov    rsi,r14
     11f141c:	e8 d1 87 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f1421:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f1425:	e8 5c d0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f142a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f1431:	00 
     11f1432:	e8 b1 93 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f1437:	48 8d 05 82 d5 66 00 	lea    rax,[rip+0x66d582]        # 185e9c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b0a8>
     11f143e:	48 89 83 78 18 00 00 	mov    QWORD PTR [rbx+0x1878],rax
     11f1445:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
     11f144c:	00 
     11f144d:	48 89 83 80 18 00 00 	mov    QWORD PTR [rbx+0x1880],rax

### 0x11f17a4: mov    QWORD PTR [r14+0x8],rbp
     11f1785:	49 89 c5             	mov    r13,rax
     11f1788:	bf f0 00 00 00       	mov    edi,0xf0
     11f178d:	e8 6e c7 5f 00       	call   17edf00 <_Znwm@plt>
     11f1792:	49 89 c6             	mov    r14,rax
     11f1795:	48 8d 05 84 d2 66 00 	lea    rax,[rip+0x66d284]        # 185ea20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b108>
     11f179c:	49 89 06             	mov    QWORD PTR [r14],rax
     11f179f:	48 8b 6c 24 18       	mov    rbp,QWORD PTR [rsp+0x18]
     11f17a4:	49 89 6e 08          	mov    QWORD PTR [r14+0x8],rbp
     11f17a8:	4d 89 6e 10          	mov    QWORD PTR [r14+0x10],r13
     11f17ac:	4d 8d 66 18          	lea    r12,[r14+0x18]
     11f17b0:	4c 89 e7             	mov    rdi,r12
     11f17b3:	e8 3e 82 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11f17b8:	4d 8d 7e 28          	lea    r15,[r14+0x28]
     11f17bc:	4c 89 ff             	mov    rdi,r15
     11f17bf:	e8 32 82 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11f17c4:	49 8d 7e 38          	lea    rdi,[r14+0x38]
     11f17c8:	e8 35 ba 8c ff       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>

### 0x11f1aa4: mov    QWORD PTR [r14+0x8],r12
     11f1a85:	48 89 84 24 18 04 00 	mov    QWORD PTR [rsp+0x418],rax
     11f1a8c:	00 
     11f1a8d:	bf b0 00 00 00       	mov    edi,0xb0
     11f1a92:	e8 69 c4 5f 00       	call   17edf00 <_Znwm@plt>
     11f1a97:	49 89 c6             	mov    r14,rax
     11f1a9a:	48 8d 05 e7 cd 66 00 	lea    rax,[rip+0x66cde7]        # 185e888 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1af70>
     11f1aa1:	49 89 06             	mov    QWORD PTR [r14],rax
     11f1aa4:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
     11f1aa8:	49 89 6e 10          	mov    QWORD PTR [r14+0x10],rbp
     11f1aac:	49 8d 6e 18          	lea    rbp,[r14+0x18]
     11f1ab0:	4d 85 ed             	test   r13,r13
     11f1ab3:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
     11f1ab8:	74 39                	je     11f1af3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37077>
     11f1aba:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     11f1abe:	4c 89 ef             	mov    rdi,r13
     11f1ac1:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11f1ac4:	48 89 ef             	mov    rdi,rbp

### 0x11f1aed: mov    r12,QWORD PTR [r14+0x8]
     11f1ad9:	49 8d 7e 30          	lea    rdi,[r14+0x30]
     11f1add:	6a 3c                	push   0x3c
     11f1adf:	59                   	pop    rcx
     11f1ae0:	48 99                	cqo
     11f1ae2:	48 f7 f9             	idiv   rcx
     11f1ae5:	48 89 c6             	mov    rsi,rax
     11f1ae8:	e8 33 d0 5f 00       	call   17eeb20 <_ZNSt6__ndk19to_stringEl@plt>
     11f1aed:	4d 8b 66 08          	mov    r12,QWORD PTR [r14+0x8]
     11f1af1:	eb 13                	jmp    11f1b06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3708a>
     11f1af3:	66 0f ef c0          	pxor   xmm0,xmm0
     11f1af7:	f3 0f 7f 45 20       	movdqu XMMWORD PTR [rbp+0x20],xmm0
     11f1afc:	f3 0f 7f 45 10       	movdqu XMMWORD PTR [rbp+0x10],xmm0
     11f1b01:	f3 0f 7f 45 00       	movdqu XMMWORD PTR [rbp+0x0],xmm0
     11f1b06:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f1b0d:	00 
     11f1b0e:	4d 89 30             	mov    QWORD PTR [r8],r14
     11f1b11:	48 8d 35 79 b5 8a ff 	lea    rsi,[rip+0xffffffffff8ab579]        # a9d091 <JNI_OnUnload@@Base+0x2495e>

### 0x11f1c09: mov    rdi,QWORD PTR [r14+0x8]
     11f1bec:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f1bef:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
     11f1bf4:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     11f1bf9:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1c00:	00 
     11f1c01:	4c 89 f6             	mov    rsi,r14
     11f1c04:	e8 35 7e 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f1c09:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f1c0d:	e8 74 c8 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f1c12:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f1c19:	00 
     11f1c1a:	e8 c9 8b 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f1c1f:	4c 89 e7             	mov    rdi,r12
     11f1c22:	48 83 c7 20          	add    rdi,0x20
     11f1c26:	e8 63 66 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f1c2b:	4c 89 a4 24 80 05 00 	mov    QWORD PTR [rsp+0x580],r12
     11f1c32:	00 

### 0x11f1ea9: mov    r14,QWORD PTR [r14+0x8]
     11f1e8c:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f1e90:	49 83 44 24 10 08    	add    QWORD PTR [r12+0x10],0x8
     11f1e96:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1e9d:	00 
     11f1e9e:	4c 89 f7             	mov    rdi,r14
     11f1ea1:	4c 89 e6             	mov    rsi,r12
     11f1ea4:	e8 55 f8 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f1ea9:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f1ead:	4c 89 e7             	mov    rdi,r12
     11f1eb0:	e8 ad f8 a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f1eb5:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f1ebc:	00 
     11f1ebd:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f1ec4:	00 
     11f1ec5:	49 39 f6             	cmp    r14,rsi
     11f1ec8:	73 1d                	jae    11f1ee7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3746b>
     11f1eca:	48 8b 84 24 80 05 00 	mov    rax,QWORD PTR [rsp+0x580]

### 0x11f1f42: mov    QWORD PTR [r15+0x8],rcx
     11f1f2a:	31 d2                	xor    edx,edx
     11f1f2c:	4d 29 fe             	sub    r14,r15
     11f1f2f:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f1f36:	00 
     11f1f37:	49 89 07             	mov    QWORD PTR [r15],rax
     11f1f3a:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f1f3e:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f1f42:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f1f46:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f1f4a:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f1f4e:	48 8b 8c 24 80 05 00 	mov    rcx,QWORD PTR [rsp+0x580]
     11f1f55:	00 
     11f1f56:	48 83 a4 24 80 05 00 	and    QWORD PTR [rsp+0x580],0x0
     11f1f5d:	00 00 
     11f1f5f:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f1f63:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f1f68:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f1f4a: mov    QWORD PTR [r15+0x18],rcx
     11f1f2f:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f1f36:	00 
     11f1f37:	49 89 07             	mov    QWORD PTR [r15],rax
     11f1f3a:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f1f3e:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f1f42:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f1f46:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f1f4a:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f1f4e:	48 8b 8c 24 80 05 00 	mov    rcx,QWORD PTR [rsp+0x580]
     11f1f55:	00 
     11f1f56:	48 83 a4 24 80 05 00 	and    QWORD PTR [rsp+0x580],0x0
     11f1f5d:	00 00 
     11f1f5f:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f1f63:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f1f68:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1f6f:	00 
     11f1f70:	4c 89 f7             	mov    rdi,r14

### 0x11f1f7b: mov    r14,QWORD PTR [r14+0x8]
     11f1f5f:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f1f63:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f1f68:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1f6f:	00 
     11f1f70:	4c 89 f7             	mov    rdi,r14
     11f1f73:	4c 89 fe             	mov    rsi,r15
     11f1f76:	e8 83 f7 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f1f7b:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f1f7f:	4c 89 ff             	mov    rdi,r15
     11f1f82:	e8 db f7 a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f1f87:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f1f8e:	00 
     11f1f8f:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f1f96:	00 
     11f1f97:	49 39 f6             	cmp    r14,rsi
     11f1f9a:	73 1d                	jae    11f1fb9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3753d>
     11f1f9c:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]

### 0x11f2014: mov    QWORD PTR [r15+0x8],rcx
     11f1ffc:	31 d2                	xor    edx,edx
     11f1ffe:	4d 29 fe             	sub    r14,r15
     11f2001:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2008:	00 
     11f2009:	49 89 07             	mov    QWORD PTR [r15],rax
     11f200c:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2010:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2014:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2018:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f201c:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2020:	48 8b 8c 24 98 01 00 	mov    rcx,QWORD PTR [rsp+0x198]
     11f2027:	00 
     11f2028:	48 83 a4 24 98 01 00 	and    QWORD PTR [rsp+0x198],0x0
     11f202f:	00 00 
     11f2031:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2035:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f203a:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f201c: mov    QWORD PTR [r15+0x18],rcx
     11f2001:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2008:	00 
     11f2009:	49 89 07             	mov    QWORD PTR [r15],rax
     11f200c:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2010:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2014:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2018:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f201c:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2020:	48 8b 8c 24 98 01 00 	mov    rcx,QWORD PTR [rsp+0x198]
     11f2027:	00 
     11f2028:	48 83 a4 24 98 01 00 	and    QWORD PTR [rsp+0x198],0x0
     11f202f:	00 00 
     11f2031:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2035:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f203a:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2041:	00 
     11f2042:	4c 89 f7             	mov    rdi,r14

### 0x11f204d: mov    r14,QWORD PTR [r14+0x8]
     11f2031:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2035:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f203a:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2041:	00 
     11f2042:	4c 89 f7             	mov    rdi,r14
     11f2045:	4c 89 fe             	mov    rsi,r15
     11f2048:	e8 b1 f6 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f204d:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f2051:	4c 89 ff             	mov    rdi,r15
     11f2054:	e8 09 f7 a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f2059:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f2060:	00 
     11f2061:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f2068:	00 
     11f2069:	49 39 f6             	cmp    r14,rsi
     11f206c:	73 1d                	jae    11f208b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3760f>
     11f206e:	48 8b 84 24 60 02 00 	mov    rax,QWORD PTR [rsp+0x260]

### 0x11f20e6: mov    QWORD PTR [r15+0x8],rcx
     11f20ce:	31 d2                	xor    edx,edx
     11f20d0:	4d 29 fe             	sub    r14,r15
     11f20d3:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f20da:	00 
     11f20db:	49 89 07             	mov    QWORD PTR [r15],rax
     11f20de:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f20e2:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f20e6:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f20ea:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f20ee:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f20f2:	48 8b 8c 24 60 02 00 	mov    rcx,QWORD PTR [rsp+0x260]
     11f20f9:	00 
     11f20fa:	48 83 a4 24 60 02 00 	and    QWORD PTR [rsp+0x260],0x0
     11f2101:	00 00 
     11f2103:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2107:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f210c:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f20ee: mov    QWORD PTR [r15+0x18],rcx
     11f20d3:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f20da:	00 
     11f20db:	49 89 07             	mov    QWORD PTR [r15],rax
     11f20de:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f20e2:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f20e6:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f20ea:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f20ee:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f20f2:	48 8b 8c 24 60 02 00 	mov    rcx,QWORD PTR [rsp+0x260]
     11f20f9:	00 
     11f20fa:	48 83 a4 24 60 02 00 	and    QWORD PTR [rsp+0x260],0x0
     11f2101:	00 00 
     11f2103:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2107:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f210c:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2113:	00 
     11f2114:	4c 89 f7             	mov    rdi,r14

### 0x11f211f: mov    r14,QWORD PTR [r14+0x8]
     11f2103:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2107:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f210c:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2113:	00 
     11f2114:	4c 89 f7             	mov    rdi,r14
     11f2117:	4c 89 fe             	mov    rsi,r15
     11f211a:	e8 df f5 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f211f:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f2123:	4c 89 ff             	mov    rdi,r15
     11f2126:	e8 37 f6 a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f212b:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f2132:	00 
     11f2133:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f213a:	00 
     11f213b:	49 39 f6             	cmp    r14,rsi
     11f213e:	73 1d                	jae    11f215d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x376e1>
     11f2140:	48 8b 84 24 b0 01 00 	mov    rax,QWORD PTR [rsp+0x1b0]

### 0x11f21b8: mov    QWORD PTR [r15+0x8],rcx
     11f21a0:	31 d2                	xor    edx,edx
     11f21a2:	4d 29 fe             	sub    r14,r15
     11f21a5:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f21ac:	00 
     11f21ad:	49 89 07             	mov    QWORD PTR [r15],rax
     11f21b0:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f21b4:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f21b8:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f21bc:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f21c0:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f21c4:	48 8b 8c 24 b0 01 00 	mov    rcx,QWORD PTR [rsp+0x1b0]
     11f21cb:	00 
     11f21cc:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     11f21d3:	00 00 
     11f21d5:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f21d9:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f21de:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f21c0: mov    QWORD PTR [r15+0x18],rcx
     11f21a5:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f21ac:	00 
     11f21ad:	49 89 07             	mov    QWORD PTR [r15],rax
     11f21b0:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f21b4:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f21b8:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f21bc:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f21c0:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f21c4:	48 8b 8c 24 b0 01 00 	mov    rcx,QWORD PTR [rsp+0x1b0]
     11f21cb:	00 
     11f21cc:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     11f21d3:	00 00 
     11f21d5:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f21d9:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f21de:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f21e5:	00 
     11f21e6:	4c 89 f7             	mov    rdi,r14

### 0x11f21f1: mov    r14,QWORD PTR [r14+0x8]
     11f21d5:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f21d9:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f21de:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f21e5:	00 
     11f21e6:	4c 89 f7             	mov    rdi,r14
     11f21e9:	4c 89 fe             	mov    rsi,r15
     11f21ec:	e8 0d f5 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f21f1:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f21f5:	4c 89 ff             	mov    rdi,r15
     11f21f8:	e8 65 f5 a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f21fd:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f2204:	00 
     11f2205:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f220c:	00 
     11f220d:	49 39 f6             	cmp    r14,rsi
     11f2210:	73 1d                	jae    11f222f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x377b3>
     11f2212:	48 8b 84 24 58 02 00 	mov    rax,QWORD PTR [rsp+0x258]

### 0x11f228a: mov    QWORD PTR [r15+0x8],rcx
     11f2272:	31 d2                	xor    edx,edx
     11f2274:	4d 29 fe             	sub    r14,r15
     11f2277:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f227e:	00 
     11f227f:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2282:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2286:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f228a:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f228e:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2292:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2296:	48 8b 8c 24 58 02 00 	mov    rcx,QWORD PTR [rsp+0x258]
     11f229d:	00 
     11f229e:	48 83 a4 24 58 02 00 	and    QWORD PTR [rsp+0x258],0x0
     11f22a5:	00 00 
     11f22a7:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f22ab:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f22b0:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f2292: mov    QWORD PTR [r15+0x18],rcx
     11f2277:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f227e:	00 
     11f227f:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2282:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2286:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f228a:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f228e:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2292:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2296:	48 8b 8c 24 58 02 00 	mov    rcx,QWORD PTR [rsp+0x258]
     11f229d:	00 
     11f229e:	48 83 a4 24 58 02 00 	and    QWORD PTR [rsp+0x258],0x0
     11f22a5:	00 00 
     11f22a7:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f22ab:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f22b0:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f22b7:	00 
     11f22b8:	4c 89 f7             	mov    rdi,r14

### 0x11f22c3: mov    r14,QWORD PTR [r14+0x8]
     11f22a7:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f22ab:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f22b0:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f22b7:	00 
     11f22b8:	4c 89 f7             	mov    rdi,r14
     11f22bb:	4c 89 fe             	mov    rsi,r15
     11f22be:	e8 3b f4 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f22c3:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f22c7:	4c 89 ff             	mov    rdi,r15
     11f22ca:	e8 93 f4 a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f22cf:	4c 8d a3 38 1b 00 00 	lea    r12,[rbx+0x1b38]
     11f22d6:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f22dd:	00 
     11f22de:	4c 89 77 08          	mov    QWORD PTR [rdi+0x8],r14
     11f22e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f22e5:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     11f22e9:	4c 8d bc 24 50 05 00 	lea    r15,[rsp+0x550]

### 0x11f22f4: mov    QWORD PTR [r15+0x8],r14
     11f22dd:	00 
     11f22de:	4c 89 77 08          	mov    QWORD PTR [rdi+0x8],r14
     11f22e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f22e5:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     11f22e9:	4c 8d bc 24 50 05 00 	lea    r15,[rsp+0x550]
     11f22f0:	00 
     11f22f1:	49 89 07             	mov    QWORD PTR [r15],rax
     11f22f4:	4d 89 77 08          	mov    QWORD PTR [r15+0x8],r14
     11f22f8:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f22fc:	66 0f ef c0          	pxor   xmm0,xmm0
     11f2300:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0
     11f2304:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     11f2309:	e8 a8 22 8c ff       	call   ab45b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1556>
     11f230e:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
     11f2315:	00 
     11f2316:	4c 89 e7             	mov    rdi,r12
     11f2319:	31 f6                	xor    esi,esi

### 0x11f2556: mov    QWORD PTR [r15+0x8],rax
     11f2536:	e8 c5 b9 5f 00       	call   17edf00 <_Znwm@plt>
     11f253b:	49 89 c7             	mov    r15,rax
     11f253e:	48 83 a4 24 80 05 00 	and    QWORD PTR [rsp+0x580],0x0
     11f2545:	00 00 
     11f2547:	48 8d 05 7a be 66 00 	lea    rax,[rip+0x66be7a]        # 185e3c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1aab0>
     11f254e:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2551:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     11f2556:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     11f255a:	bf 60 04 00 00       	mov    edi,0x460
     11f255f:	e8 9c b9 5f 00       	call   17edf00 <_Znwm@plt>
     11f2564:	48 89 c5             	mov    rbp,rax
     11f2567:	45 31 f6             	xor    r14d,r14d
     11f256a:	ba 60 04 00 00       	mov    edx,0x460
     11f256f:	48 89 c7             	mov    rdi,rax
     11f2572:	31 f6                	xor    esi,esi
     11f2574:	e8 17 c6 5f 00       	call   17eeb90 <memset@plt>
     11f2579:	48 89 ef             	mov    rdi,rbp

### 0x11f268c: mov    QWORD PTR [r14+0x38],rax
     11f266d:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
     11f2671:	c7 40 20 00 00 80 3f 	mov    DWORD PTR [rax+0x20],0x3f800000
     11f2678:	0f 28 8c 24 e0 00 00 	movaps xmm1,XMMWORD PTR [rsp+0xe0]
     11f267f:	00 
     11f2680:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     11f2684:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     11f268b:	00 
     11f268c:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     11f2690:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     11f2696:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
     11f269d:	00 
     11f269e:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     11f26a2:	4d 89 77 18          	mov    QWORD PTR [r15+0x18],r14
     11f26a6:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
     11f26ab:	66 0f ef c0          	pxor   xmm0,xmm0
     11f26af:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax

### 0x11f2690: movdqu XMMWORD PTR [r14+0x40],xmm0
     11f2671:	c7 40 20 00 00 80 3f 	mov    DWORD PTR [rax+0x20],0x3f800000
     11f2678:	0f 28 8c 24 e0 00 00 	movaps xmm1,XMMWORD PTR [rsp+0xe0]
     11f267f:	00 
     11f2680:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     11f2684:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     11f268b:	00 
     11f268c:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     11f2690:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     11f2696:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
     11f269d:	00 
     11f269e:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     11f26a2:	4d 89 77 18          	mov    QWORD PTR [r15+0x18],r14
     11f26a6:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
     11f26ab:	66 0f ef c0          	pxor   xmm0,xmm0
     11f26af:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f26b9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]

### 0x11f26a2: mov    QWORD PTR [r15+0x18],r14
     11f2684:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     11f268b:	00 
     11f268c:	49 89 46 38          	mov    QWORD PTR [r14+0x38],rax
     11f2690:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     11f2696:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
     11f269d:	00 
     11f269e:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     11f26a2:	4d 89 77 18          	mov    QWORD PTR [r15+0x18],r14
     11f26a6:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
     11f26ab:	66 0f ef c0          	pxor   xmm0,xmm0
     11f26af:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f26b9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11f26be:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f26c2:	48 8b 84 24 c0 06 00 	mov    rax,QWORD PTR [rsp+0x6c0]
     11f26c9:	00 
     11f26ca:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax

### 0x11f26af: movdqu XMMWORD PTR [r15+0x20],xmm0
     11f2690:	f3 41 0f 7f 46 40    	movdqu XMMWORD PTR [r14+0x40],xmm0
     11f2696:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
     11f269d:	00 
     11f269e:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     11f26a2:	4d 89 77 18          	mov    QWORD PTR [r15+0x18],r14
     11f26a6:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
     11f26ab:	66 0f ef c0          	pxor   xmm0,xmm0
     11f26af:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f26b9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11f26be:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f26c2:	48 8b 84 24 c0 06 00 	mov    rax,QWORD PTR [rsp+0x6c0]
     11f26c9:	00 
     11f26ca:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
     11f26ce:	4d 8d 77 50          	lea    r14,[r15+0x50]
     11f26d2:	4d 89 67 50          	mov    QWORD PTR [r15+0x50],r12
     11f26d6:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]

### 0x11f26b5: mov    QWORD PTR [r15+0x38],rax
     11f2696:	48 8b 84 24 48 06 00 	mov    rax,QWORD PTR [rsp+0x648]
     11f269d:	00 
     11f269e:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     11f26a2:	4d 89 77 18          	mov    QWORD PTR [r15+0x18],r14
     11f26a6:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
     11f26ab:	66 0f ef c0          	pxor   xmm0,xmm0
     11f26af:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f26b9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11f26be:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f26c2:	48 8b 84 24 c0 06 00 	mov    rax,QWORD PTR [rsp+0x6c0]
     11f26c9:	00 
     11f26ca:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
     11f26ce:	4d 8d 77 50          	lea    r14,[r15+0x50]
     11f26d2:	4d 89 67 50          	mov    QWORD PTR [r15+0x50],r12
     11f26d6:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f26dd:	00 

### 0x11f26be: mov    QWORD PTR [r15+0x40],rax
     11f269e:	49 8d 6f 18          	lea    rbp,[r15+0x18]
     11f26a2:	4d 89 77 18          	mov    QWORD PTR [r15+0x18],r14
     11f26a6:	49 83 67 30 00       	and    QWORD PTR [r15+0x30],0x0
     11f26ab:	66 0f ef c0          	pxor   xmm0,xmm0
     11f26af:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f26b9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11f26be:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f26c2:	48 8b 84 24 c0 06 00 	mov    rax,QWORD PTR [rsp+0x6c0]
     11f26c9:	00 
     11f26ca:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
     11f26ce:	4d 8d 77 50          	lea    r14,[r15+0x50]
     11f26d2:	4d 89 67 50          	mov    QWORD PTR [r15+0x50],r12
     11f26d6:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f26dd:	00 
     11f26de:	4d 89 38             	mov    QWORD PTR [r8],r15
     11f26e1:	48 8d 35 a9 a9 8a ff 	lea    rsi,[rip+0xffffffffff8aa9a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>

### 0x11f26ca: mov    QWORD PTR [r15+0x48],rax
     11f26ab:	66 0f ef c0          	pxor   xmm0,xmm0
     11f26af:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f26b9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11f26be:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f26c2:	48 8b 84 24 c0 06 00 	mov    rax,QWORD PTR [rsp+0x6c0]
     11f26c9:	00 
     11f26ca:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
     11f26ce:	4d 8d 77 50          	lea    r14,[r15+0x50]
     11f26d2:	4d 89 67 50          	mov    QWORD PTR [r15+0x50],r12
     11f26d6:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f26dd:	00 
     11f26de:	4d 89 38             	mov    QWORD PTR [r8],r15
     11f26e1:	48 8d 35 a9 a9 8a ff 	lea    rsi,[rip+0xffffffffff8aa9a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f26e8:	48 8d 0d 0d 21 06 00 	lea    rcx,[rip+0x6210d]        # 12547fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99d80>
     11f26ef:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
     11f26f6:	00 

### 0x11f26d2: mov    QWORD PTR [r15+0x50],r12
     11f26b5:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f26b9:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
     11f26be:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f26c2:	48 8b 84 24 c0 06 00 	mov    rax,QWORD PTR [rsp+0x6c0]
     11f26c9:	00 
     11f26ca:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
     11f26ce:	4d 8d 77 50          	lea    r14,[r15+0x50]
     11f26d2:	4d 89 67 50          	mov    QWORD PTR [r15+0x50],r12
     11f26d6:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f26dd:	00 
     11f26de:	4d 89 38             	mov    QWORD PTR [r8],r15
     11f26e1:	48 8d 35 a9 a9 8a ff 	lea    rsi,[rip+0xffffffffff8aa9a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f26e8:	48 8d 0d 0d 21 06 00 	lea    rcx,[rip+0x6210d]        # 12547fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99d80>
     11f26ef:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
     11f26f6:	00 
     11f26f7:	6a 08                	push   0x8
     11f26f9:	41 59                	pop    r9

### 0x11f272e: mov    rdi,QWORD PTR [r14+0x8]
     11f2714:	4c 89 ea             	mov    rdx,r13
     11f2717:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11f271a:	49 8d 7f 58          	lea    rdi,[r15+0x58]
     11f271e:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2725:	00 
     11f2726:	4c 89 f6             	mov    rsi,r14
     11f2729:	e8 10 73 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f272e:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f2732:	e8 4f bd 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f2737:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f273e:	00 
     11f273f:	e8 a4 80 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f2744:	4d 8b 77 08          	mov    r14,QWORD PTR [r15+0x8]
     11f2748:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f274f:	00 
     11f2750:	4d 89 38             	mov    QWORD PTR [r8],r15
     11f2753:	48 8d 35 37 a9 8a ff 	lea    rsi,[rip+0xffffffffff8aa937]        # a9d091 <JNI_OnUnload@@Base+0x2495e>

### 0x11f2744: mov    r14,QWORD PTR [r15+0x8]
     11f2726:	4c 89 f6             	mov    rsi,r14
     11f2729:	e8 10 73 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f272e:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f2732:	e8 4f bd 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f2737:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f273e:	00 
     11f273f:	e8 a4 80 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f2744:	4d 8b 77 08          	mov    r14,QWORD PTR [r15+0x8]
     11f2748:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f274f:	00 
     11f2750:	4d 89 38             	mov    QWORD PTR [r8],r15
     11f2753:	48 8d 35 37 a9 8a ff 	lea    rsi,[rip+0xffffffffff8aa937]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f275a:	48 8d 0d a7 20 06 00 	lea    rcx,[rip+0x620a7]        # 1254808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99d8c>
     11f2761:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]
     11f2768:	00 
     11f2769:	6a 08                	push   0x8
     11f276b:	41 59                	pop    r9

### 0x11f27dc: mov    QWORD PTR [r14+0x8],rax
     11f27bd:	00 
     11f27be:	bf 88 00 00 00       	mov    edi,0x88
     11f27c3:	e8 38 b7 5f 00       	call   17edf00 <_Znwm@plt>
     11f27c8:	49 89 c6             	mov    r14,rax
     11f27cb:	48 8d 05 de bd 66 00 	lea    rax,[rip+0x66bdde]        # 185e5b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ac98>
     11f27d2:	49 89 06             	mov    QWORD PTR [r14],rax
     11f27d5:	48 8d 05 34 be 66 00 	lea    rax,[rip+0x66be34]        # 185e610 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1acf8>
     11f27dc:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     11f27e0:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     11f27e7:	00 
     11f27e8:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     11f27ec:	66 0f ef c0          	pxor   xmm0,xmm0
     11f27f0:	f3 41 0f 7f 46 18    	movdqu XMMWORD PTR [r14+0x18],xmm0
     11f27f6:	4c 89 f7             	mov    rdi,r14
     11f27f9:	48 83 c7 28          	add    rdi,0x28
     11f27fd:	e8 8c 5a 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f2802:	41 c6 86 80 00 00 00 	mov    BYTE PTR [r14+0x80],0x0

### 0x11f27f0: movdqu XMMWORD PTR [r14+0x18],xmm0
     11f27d2:	49 89 06             	mov    QWORD PTR [r14],rax
     11f27d5:	48 8d 05 34 be 66 00 	lea    rax,[rip+0x66be34]        # 185e610 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1acf8>
     11f27dc:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     11f27e0:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     11f27e7:	00 
     11f27e8:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     11f27ec:	66 0f ef c0          	pxor   xmm0,xmm0
     11f27f0:	f3 41 0f 7f 46 18    	movdqu XMMWORD PTR [r14+0x18],xmm0
     11f27f6:	4c 89 f7             	mov    rdi,r14
     11f27f9:	48 83 c7 28          	add    rdi,0x28
     11f27fd:	e8 8c 5a 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f2802:	41 c6 86 80 00 00 00 	mov    BYTE PTR [r14+0x80],0x0
     11f2809:	00 
     11f280a:	4c 89 b4 24 98 01 00 	mov    QWORD PTR [rsp+0x198],r14
     11f2811:	00 
     11f2812:	6a 38                	push   0x38
     11f2814:	5f                   	pop    rdi

### 0x11f2878: mov    QWORD PTR [r14+0x8],rax
     11f285e:	6a 70                	push   0x70
     11f2860:	5f                   	pop    rdi
     11f2861:	e8 9a b6 5f 00       	call   17edf00 <_Znwm@plt>
     11f2866:	49 89 c6             	mov    r14,rax
     11f2869:	48 8d 05 10 bd 66 00 	lea    rax,[rip+0x66bd10]        # 185e580 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1ac68>
     11f2870:	49 89 06             	mov    QWORD PTR [r14],rax
     11f2873:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
     11f2878:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     11f287c:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
     11f2883:	00 
     11f2884:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     11f2888:	4c 89 f7             	mov    rdi,r14
     11f288b:	48 83 c7 18          	add    rdi,0x18
     11f288f:	e8 fa 59 93 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
     11f2894:	4c 89 b4 24 50 02 00 	mov    QWORD PTR [rsp+0x250],r14
     11f289b:	00 
     11f289c:	bf 98 00 00 00       	mov    edi,0x98

### 0x11f28b8: mov    QWORD PTR [r14+0x8],rax
     11f289b:	00 
     11f289c:	bf 98 00 00 00       	mov    edi,0x98
     11f28a1:	e8 5a b6 5f 00       	call   17edf00 <_Znwm@plt>
     11f28a6:	49 89 c6             	mov    r14,rax
     11f28a9:	48 8d 05 a0 b9 66 00 	lea    rax,[rip+0x66b9a0]        # 185e250 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a938>
     11f28b0:	49 89 06             	mov    QWORD PTR [r14],rax
     11f28b3:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     11f28b8:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     11f28bc:	bf d0 01 00 00       	mov    edi,0x1d0
     11f28c1:	e8 3a b6 5f 00       	call   17edf00 <_Znwm@plt>
     11f28c6:	49 89 c4             	mov    r12,rax
     11f28c9:	ba d0 01 00 00       	mov    edx,0x1d0
     11f28ce:	48 89 c7             	mov    rdi,rax
     11f28d1:	31 f6                	xor    esi,esi
     11f28d3:	e8 b8 c2 5f 00       	call   17eeb90 <memset@plt>
     11f28d8:	4c 89 e7             	mov    rdi,r12
     11f28db:	e8 d4 b5 a1 ff       	call   c0deb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ae54>

### 0x11f28e4: mov    QWORD PTR [r14+0x18],r13
     11f28c9:	ba d0 01 00 00       	mov    edx,0x1d0
     11f28ce:	48 89 c7             	mov    rdi,rax
     11f28d1:	31 f6                	xor    esi,esi
     11f28d3:	e8 b8 c2 5f 00       	call   17eeb90 <memset@plt>
     11f28d8:	4c 89 e7             	mov    rdi,r12
     11f28db:	e8 d4 b5 a1 ff       	call   c0deb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ae54>
     11f28e0:	4d 89 66 10          	mov    QWORD PTR [r14+0x10],r12
     11f28e4:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
     11f28e8:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f28ef:	00 
     11f28f0:	4d 89 30             	mov    QWORD PTR [r8],r14
     11f28f3:	48 8d 35 97 a7 8a ff 	lea    rsi,[rip+0xffffffffff8aa797]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f28fa:	48 8d 0d 87 d9 05 00 	lea    rcx,[rip+0x5d987]        # 1250288 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9580c>
     11f2901:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]
     11f2908:	00 
     11f2909:	6a 08                	push   0x8
     11f290b:	41 59                	pop    r9

### 0x11f2959: mov    r13,QWORD PTR [r14+0x18]
     11f293b:	4c 89 ee             	mov    rsi,r13
     11f293e:	e8 fb 70 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f2943:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     11f2947:	e8 3a bb 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f294c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f2953:	00 
     11f2954:	e8 8f 7e 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f2959:	4d 8b 6e 18          	mov    r13,QWORD PTR [r14+0x18]
     11f295d:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f2964:	00 
     11f2965:	4d 89 30             	mov    QWORD PTR [r8],r14
     11f2968:	48 8d 35 22 a7 8a ff 	lea    rsi,[rip+0xffffffffff8aa722]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f296f:	48 8d 0d 12 d9 05 00 	lea    rcx,[rip+0x5d912]        # 1250288 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9580c>
     11f2976:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
     11f297d:	00 
     11f297e:	6a 08                	push   0x8
     11f2980:	41 59                	pop    r9

### 0x11f2ac0: mov    r14,QWORD PTR [r14+0x8]
     11f2aa3:	4e 89 3c 30          	mov    QWORD PTR [rax+r14*1],r15
     11f2aa7:	49 83 44 24 10 08    	add    QWORD PTR [r12+0x10],0x8
     11f2aad:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2ab4:	00 
     11f2ab5:	4c 89 f7             	mov    rdi,r14
     11f2ab8:	4c 89 e6             	mov    rsi,r12
     11f2abb:	e8 3e ec a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f2ac0:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f2ac4:	4c 89 e7             	mov    rdi,r12
     11f2ac7:	e8 96 ec a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f2acc:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f2ad3:	00 
     11f2ad4:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f2adb:	00 
     11f2adc:	49 39 f6             	cmp    r14,rsi
     11f2adf:	73 1d                	jae    11f2afe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38082>
     11f2ae1:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]

### 0x11f2b59: mov    QWORD PTR [r15+0x8],rcx
     11f2b41:	31 d2                	xor    edx,edx
     11f2b43:	4d 29 fe             	sub    r14,r15
     11f2b46:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2b4d:	00 
     11f2b4e:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2b51:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2b55:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2b59:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2b5d:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2b61:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2b65:	48 8b 8c 24 98 01 00 	mov    rcx,QWORD PTR [rsp+0x198]
     11f2b6c:	00 
     11f2b6d:	48 83 a4 24 98 01 00 	and    QWORD PTR [rsp+0x198],0x0
     11f2b74:	00 00 
     11f2b76:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2b7a:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2b7f:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f2b61: mov    QWORD PTR [r15+0x18],rcx
     11f2b46:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2b4d:	00 
     11f2b4e:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2b51:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2b55:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2b59:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2b5d:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2b61:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2b65:	48 8b 8c 24 98 01 00 	mov    rcx,QWORD PTR [rsp+0x198]
     11f2b6c:	00 
     11f2b6d:	48 83 a4 24 98 01 00 	and    QWORD PTR [rsp+0x198],0x0
     11f2b74:	00 00 
     11f2b76:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2b7a:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2b7f:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2b86:	00 
     11f2b87:	4c 89 f7             	mov    rdi,r14

### 0x11f2b92: mov    r14,QWORD PTR [r14+0x8]
     11f2b76:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2b7a:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2b7f:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2b86:	00 
     11f2b87:	4c 89 f7             	mov    rdi,r14
     11f2b8a:	4c 89 fe             	mov    rsi,r15
     11f2b8d:	e8 6c eb a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f2b92:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f2b96:	4c 89 ff             	mov    rdi,r15
     11f2b99:	e8 c4 eb a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f2b9e:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f2ba5:	00 
     11f2ba6:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f2bad:	00 
     11f2bae:	49 39 f6             	cmp    r14,rsi
     11f2bb1:	73 1d                	jae    11f2bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38154>
     11f2bb3:	48 8b 84 24 60 02 00 	mov    rax,QWORD PTR [rsp+0x260]

### 0x11f2c2b: mov    QWORD PTR [r15+0x8],rcx
     11f2c13:	31 d2                	xor    edx,edx
     11f2c15:	4d 29 fe             	sub    r14,r15
     11f2c18:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2c1f:	00 
     11f2c20:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2c23:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2c27:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2c2b:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2c2f:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2c33:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2c37:	48 8b 8c 24 60 02 00 	mov    rcx,QWORD PTR [rsp+0x260]
     11f2c3e:	00 
     11f2c3f:	48 83 a4 24 60 02 00 	and    QWORD PTR [rsp+0x260],0x0
     11f2c46:	00 00 
     11f2c48:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2c4c:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2c51:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f2c33: mov    QWORD PTR [r15+0x18],rcx
     11f2c18:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2c1f:	00 
     11f2c20:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2c23:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2c27:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2c2b:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2c2f:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2c33:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2c37:	48 8b 8c 24 60 02 00 	mov    rcx,QWORD PTR [rsp+0x260]
     11f2c3e:	00 
     11f2c3f:	48 83 a4 24 60 02 00 	and    QWORD PTR [rsp+0x260],0x0
     11f2c46:	00 00 
     11f2c48:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2c4c:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2c51:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2c58:	00 
     11f2c59:	4c 89 f7             	mov    rdi,r14

### 0x11f2c64: mov    r14,QWORD PTR [r14+0x8]
     11f2c48:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2c4c:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2c51:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2c58:	00 
     11f2c59:	4c 89 f7             	mov    rdi,r14
     11f2c5c:	4c 89 fe             	mov    rsi,r15
     11f2c5f:	e8 9a ea a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f2c64:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f2c68:	4c 89 ff             	mov    rdi,r15
     11f2c6b:	e8 f2 ea a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f2c70:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f2c77:	00 
     11f2c78:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f2c7f:	00 
     11f2c80:	49 39 f6             	cmp    r14,rsi
     11f2c83:	73 1d                	jae    11f2ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38226>
     11f2c85:	48 8b 84 24 58 02 00 	mov    rax,QWORD PTR [rsp+0x258]

### 0x11f2cfd: mov    QWORD PTR [r15+0x8],rcx
     11f2ce5:	31 d2                	xor    edx,edx
     11f2ce7:	4d 29 fe             	sub    r14,r15
     11f2cea:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2cf1:	00 
     11f2cf2:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2cf5:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2cf9:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2cfd:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2d01:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2d05:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2d09:	48 8b 8c 24 58 02 00 	mov    rcx,QWORD PTR [rsp+0x258]
     11f2d10:	00 
     11f2d11:	48 83 a4 24 58 02 00 	and    QWORD PTR [rsp+0x258],0x0
     11f2d18:	00 00 
     11f2d1a:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2d1e:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2d23:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f2d05: mov    QWORD PTR [r15+0x18],rcx
     11f2cea:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2cf1:	00 
     11f2cf2:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2cf5:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2cf9:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2cfd:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2d01:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2d05:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2d09:	48 8b 8c 24 58 02 00 	mov    rcx,QWORD PTR [rsp+0x258]
     11f2d10:	00 
     11f2d11:	48 83 a4 24 58 02 00 	and    QWORD PTR [rsp+0x258],0x0
     11f2d18:	00 00 
     11f2d1a:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2d1e:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2d23:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2d2a:	00 
     11f2d2b:	4c 89 f7             	mov    rdi,r14

### 0x11f2d36: mov    r14,QWORD PTR [r14+0x8]
     11f2d1a:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2d1e:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2d23:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2d2a:	00 
     11f2d2b:	4c 89 f7             	mov    rdi,r14
     11f2d2e:	4c 89 fe             	mov    rsi,r15
     11f2d31:	e8 c8 e9 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f2d36:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f2d3a:	4c 89 ff             	mov    rdi,r15
     11f2d3d:	e8 20 ea a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f2d42:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f2d49:	00 
     11f2d4a:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f2d51:	00 
     11f2d52:	49 39 f6             	cmp    r14,rsi
     11f2d55:	73 1d                	jae    11f2d74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x382f8>
     11f2d57:	48 8b 84 24 50 02 00 	mov    rax,QWORD PTR [rsp+0x250]

### 0x11f2dcf: mov    QWORD PTR [r15+0x8],rcx
     11f2db7:	31 d2                	xor    edx,edx
     11f2db9:	4d 29 fe             	sub    r14,r15
     11f2dbc:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2dc3:	00 
     11f2dc4:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2dc7:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2dcb:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2dcf:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2dd3:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2dd7:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2ddb:	48 8b 8c 24 50 02 00 	mov    rcx,QWORD PTR [rsp+0x250]
     11f2de2:	00 
     11f2de3:	48 83 a4 24 50 02 00 	and    QWORD PTR [rsp+0x250],0x0
     11f2dea:	00 00 
     11f2dec:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2df0:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2df5:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f2dd7: mov    QWORD PTR [r15+0x18],rcx
     11f2dbc:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2dc3:	00 
     11f2dc4:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2dc7:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2dcb:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2dcf:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2dd3:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2dd7:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2ddb:	48 8b 8c 24 50 02 00 	mov    rcx,QWORD PTR [rsp+0x250]
     11f2de2:	00 
     11f2de3:	48 83 a4 24 50 02 00 	and    QWORD PTR [rsp+0x250],0x0
     11f2dea:	00 00 
     11f2dec:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2df0:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2df5:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2dfc:	00 
     11f2dfd:	4c 89 f7             	mov    rdi,r14

### 0x11f2e08: mov    r14,QWORD PTR [r14+0x8]
     11f2dec:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2df0:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2df5:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2dfc:	00 
     11f2dfd:	4c 89 f7             	mov    rdi,r14
     11f2e00:	4c 89 fe             	mov    rsi,r15
     11f2e03:	e8 f6 e8 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f2e08:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f2e0c:	4c 89 ff             	mov    rdi,r15
     11f2e0f:	e8 4e e9 a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f2e14:	4c 89 b4 24 e8 04 00 	mov    QWORD PTR [rsp+0x4e8],r14
     11f2e1b:	00 
     11f2e1c:	48 8b b4 24 f0 04 00 	mov    rsi,QWORD PTR [rsp+0x4f0]
     11f2e23:	00 
     11f2e24:	49 39 f6             	cmp    r14,rsi
     11f2e27:	73 1d                	jae    11f2e46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x383ca>
     11f2e29:	48 8b 84 24 48 02 00 	mov    rax,QWORD PTR [rsp+0x248]

### 0x11f2ea1: mov    QWORD PTR [r15+0x8],rcx
     11f2e89:	31 d2                	xor    edx,edx
     11f2e8b:	4d 29 fe             	sub    r14,r15
     11f2e8e:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2e95:	00 
     11f2e96:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2e99:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2e9d:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2ea1:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2ea5:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2ea9:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2ead:	48 8b 8c 24 48 02 00 	mov    rcx,QWORD PTR [rsp+0x248]
     11f2eb4:	00 
     11f2eb5:	48 83 a4 24 48 02 00 	and    QWORD PTR [rsp+0x248],0x0
     11f2ebc:	00 00 
     11f2ebe:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2ec2:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2ec7:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]

### 0x11f2ea9: mov    QWORD PTR [r15+0x18],rcx
     11f2e8e:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f2e95:	00 
     11f2e96:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2e99:	4a 8d 0c 30          	lea    rcx,[rax+r14*1]
     11f2e9d:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2ea1:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     11f2ea5:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
     11f2ea9:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
     11f2ead:	48 8b 8c 24 48 02 00 	mov    rcx,QWORD PTR [rsp+0x248]
     11f2eb4:	00 
     11f2eb5:	48 83 a4 24 48 02 00 	and    QWORD PTR [rsp+0x248],0x0
     11f2ebc:	00 00 
     11f2ebe:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2ec2:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2ec7:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2ece:	00 
     11f2ecf:	4c 89 f7             	mov    rdi,r14

### 0x11f2eda: mov    r14,QWORD PTR [r14+0x8]
     11f2ebe:	4a 89 0c 30          	mov    QWORD PTR [rax+r14*1],rcx
     11f2ec2:	49 83 47 10 08       	add    QWORD PTR [r15+0x10],0x8
     11f2ec7:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f2ece:	00 
     11f2ecf:	4c 89 f7             	mov    rdi,r14
     11f2ed2:	4c 89 fe             	mov    rsi,r15
     11f2ed5:	e8 24 e8 a2 ff       	call   c216fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e69e>
     11f2eda:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]
     11f2ede:	4c 89 ff             	mov    rdi,r15
     11f2ee1:	e8 7c e8 a2 ff       	call   c21762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e702>
     11f2ee6:	4c 8d a3 d0 1b 00 00 	lea    r12,[rbx+0x1bd0]
     11f2eed:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f2ef4:	00 
     11f2ef5:	4c 89 77 08          	mov    QWORD PTR [rdi+0x8],r14
     11f2ef9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f2efc:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     11f2f00:	4c 8d bc 24 50 05 00 	lea    r15,[rsp+0x550]

### 0x11f2f0b: mov    QWORD PTR [r15+0x8],r14
     11f2ef4:	00 
     11f2ef5:	4c 89 77 08          	mov    QWORD PTR [rdi+0x8],r14
     11f2ef9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f2efc:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
     11f2f00:	4c 8d bc 24 50 05 00 	lea    r15,[rsp+0x550]
     11f2f07:	00 
     11f2f08:	49 89 07             	mov    QWORD PTR [r15],rax
     11f2f0b:	4d 89 77 08          	mov    QWORD PTR [r15+0x8],r14
     11f2f0f:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
     11f2f13:	66 0f ef c0          	pxor   xmm0,xmm0
     11f2f17:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0
     11f2f1b:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     11f2f20:	e8 91 16 8c ff       	call   ab45b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1556>
     11f2f25:	4c 89 a4 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r12
     11f2f2c:	00 
     11f2f2d:	4c 89 e7             	mov    rdi,r12
     11f2f30:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]

### 0x11f3082: mov    rdi,QWORD PTR [r14+0x8]
     11f3062:	4c 89 fa             	mov    rdx,r15
     11f3065:	ff 90 90 00 00 00    	call   QWORD PTR [rax+0x90]
     11f306b:	48 8d bb 00 1d 00 00 	lea    rdi,[rbx+0x1d00]
     11f3072:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f3079:	00 
     11f307a:	4c 89 f6             	mov    rsi,r14
     11f307d:	e8 bc 69 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f3082:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f3086:	e8 fb b3 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f308b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f3092:	00 
     11f3093:	e8 50 77 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f3098:	4c 8b b3 78 1c 00 00 	mov    r14,QWORD PTR [rbx+0x1c78]
     11f309f:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f30a6:	00 
     11f30a7:	4c 89 64 24 28       	mov    QWORD PTR [rsp+0x28],r12
     11f30ac:	4d 89 20             	mov    QWORD PTR [r8],r12

### 0x11f318d: mov    QWORD PTR [r14+0x18],0x2bf20
     11f3172:	00 
     11f3173:	48 8d 94 24 98 01 00 	lea    rdx,[rsp+0x198]
     11f317a:	00 
     11f317b:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11f317e:	4c 8d bb 20 1d 00 00 	lea    r15,[rbx+0x1d20]
     11f3185:	4c 8d b4 24 b0 01 00 	lea    r14,[rsp+0x1b0]
     11f318c:	00 
     11f318d:	49 c7 46 18 20 bf 02 	mov    QWORD PTR [r14+0x18],0x2bf20
     11f3194:	00 
     11f3195:	49 c7 46 20 b8 0b 00 	mov    QWORD PTR [r14+0x20],0xbb8
     11f319c:	00 
     11f319d:	4c 89 bc 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],r15
     11f31a4:	00 
     11f31a5:	48 8d 05 b8 92 88 ff 	lea    rax,[rip+0xffffffffff8892b8]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f31ac:	48 89 84 24 b0 05 00 	mov    QWORD PTR [rsp+0x5b0],rax
     11f31b3:	00 
     11f31b4:	48 8d 05 27 8f 05 00 	lea    rax,[rip+0x58f27]        # 124c0e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91666>

### 0x11f3195: mov    QWORD PTR [r14+0x20],0xbb8
     11f317a:	00 
     11f317b:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11f317e:	4c 8d bb 20 1d 00 00 	lea    r15,[rbx+0x1d20]
     11f3185:	4c 8d b4 24 b0 01 00 	lea    r14,[rsp+0x1b0]
     11f318c:	00 
     11f318d:	49 c7 46 18 20 bf 02 	mov    QWORD PTR [r14+0x18],0x2bf20
     11f3194:	00 
     11f3195:	49 c7 46 20 b8 0b 00 	mov    QWORD PTR [r14+0x20],0xbb8
     11f319c:	00 
     11f319d:	4c 89 bc 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],r15
     11f31a4:	00 
     11f31a5:	48 8d 05 b8 92 88 ff 	lea    rax,[rip+0xffffffffff8892b8]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f31ac:	48 89 84 24 b0 05 00 	mov    QWORD PTR [rsp+0x5b0],rax
     11f31b3:	00 
     11f31b4:	48 8d 05 27 8f 05 00 	lea    rax,[rip+0x58f27]        # 124c0e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x91666>
     11f31bb:	48 89 84 24 b8 05 00 	mov    QWORD PTR [rsp+0x5b8],rax
     11f31c2:	00 

### 0x11f33c3: mov    rdi,QWORD PTR [r14+0x8]
     11f33a6:	4c 89 f1             	mov    rcx,r14
     11f33a9:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11f33ac:	48 8d bb a0 1e 00 00 	lea    rdi,[rbx+0x1ea0]
     11f33b3:	4c 8d b4 24 60 02 00 	lea    r14,[rsp+0x260]
     11f33ba:	00 
     11f33bb:	4c 89 f6             	mov    rsi,r14
     11f33be:	e8 7b 66 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f33c3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f33c7:	e8 ba b0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f33cc:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f33d3:	00 
     11f33d4:	e8 0f 74 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f33d9:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f33e0:	00 
     11f33e1:	e8 aa aa 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f33e6:	4c 8d b4 24 50 05 00 	lea    r14,[rsp+0x550]
     11f33ed:	00 

### 0x11f361b: mov    QWORD PTR [r14+0x20],r14
     11f35fc:	49 c7 46 e8 88 13 00 	mov    QWORD PTR [r14-0x18],0x1388
     11f3603:	00 
     11f3604:	48 8b 41 70          	mov    rax,QWORD PTR [rcx+0x70]
     11f3608:	49 89 46 f0          	mov    QWORD PTR [r14-0x10],rax
     11f360c:	41 c6 46 f8 00       	mov    BYTE PTR [r14-0x8],0x0
     11f3611:	48 8d 05 48 d2 68 00 	lea    rax,[rip+0x68d248]        # 1880860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3cf48>
     11f3618:	49 89 06             	mov    QWORD PTR [r14],rax
     11f361b:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
     11f361f:	0f 10 41 50          	movups xmm0,XMMWORD PTR [rcx+0x50]
     11f3623:	41 0f 29 46 30       	movaps XMMWORD PTR [r14+0x30],xmm0
     11f3628:	0f 10 41 60          	movups xmm0,XMMWORD PTR [rcx+0x60]
     11f362c:	41 0f 29 46 40       	movaps XMMWORD PTR [r14+0x40],xmm0
     11f3631:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     11f3636:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
     11f363d:	00 
     11f363e:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     11f3642:	48 85 c0             	test   rax,rax

### 0x11f3623: movaps XMMWORD PTR [r14+0x30],xmm0
     11f3604:	48 8b 41 70          	mov    rax,QWORD PTR [rcx+0x70]
     11f3608:	49 89 46 f0          	mov    QWORD PTR [r14-0x10],rax
     11f360c:	41 c6 46 f8 00       	mov    BYTE PTR [r14-0x8],0x0
     11f3611:	48 8d 05 48 d2 68 00 	lea    rax,[rip+0x68d248]        # 1880860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3cf48>
     11f3618:	49 89 06             	mov    QWORD PTR [r14],rax
     11f361b:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
     11f361f:	0f 10 41 50          	movups xmm0,XMMWORD PTR [rcx+0x50]
     11f3623:	41 0f 29 46 30       	movaps XMMWORD PTR [r14+0x30],xmm0
     11f3628:	0f 10 41 60          	movups xmm0,XMMWORD PTR [rcx+0x60]
     11f362c:	41 0f 29 46 40       	movaps XMMWORD PTR [r14+0x40],xmm0
     11f3631:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     11f3636:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
     11f363d:	00 
     11f363e:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     11f3642:	48 85 c0             	test   rax,rax
     11f3645:	74 05                	je     11f364c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38bd0>
     11f3647:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

### 0x11f362c: movaps XMMWORD PTR [r14+0x40],xmm0
     11f360c:	41 c6 46 f8 00       	mov    BYTE PTR [r14-0x8],0x0
     11f3611:	48 8d 05 48 d2 68 00 	lea    rax,[rip+0x68d248]        # 1880860 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3cf48>
     11f3618:	49 89 06             	mov    QWORD PTR [r14],rax
     11f361b:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
     11f361f:	0f 10 41 50          	movups xmm0,XMMWORD PTR [rcx+0x50]
     11f3623:	41 0f 29 46 30       	movaps XMMWORD PTR [r14+0x30],xmm0
     11f3628:	0f 10 41 60          	movups xmm0,XMMWORD PTR [rcx+0x60]
     11f362c:	41 0f 29 46 40       	movaps XMMWORD PTR [r14+0x40],xmm0
     11f3631:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
     11f3636:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
     11f363d:	00 
     11f363e:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
     11f3642:	48 85 c0             	test   rax,rax
     11f3645:	74 05                	je     11f364c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38bd0>
     11f3647:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     11f364c:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
     11f3653:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax

### 0x11f3de6: mov    rdi,QWORD PTR [r14+0x8]
     11f3dcb:	4c 89 fa             	mov    rdx,r15
     11f3dce:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f3dd1:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f3dd8:	00 
     11f3dd9:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     11f3dde:	4c 89 f6             	mov    rsi,r14
     11f3de1:	e8 0c 5e 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f3de6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f3dea:	e8 97 a6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f3def:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f3df6:	00 
     11f3df7:	e8 ec 69 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f3dfc:	4c 8d 84 24 20 05 00 	lea    r8,[rsp+0x520]
     11f3e03:	00 
     11f3e04:	4d 89 20             	mov    QWORD PTR [r8],r12
     11f3e07:	48 8d 35 83 92 8a ff 	lea    rsi,[rip+0xffffffffff8a9283]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f3e0e:	48 8d 0d 63 56 06 00 	lea    rcx,[rip+0x65663]        # 1259478 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9e9fc>

### 0x11f3e58: mov    rdi,QWORD PTR [r14+0x8]
     11f3e3d:	4c 89 f1             	mov    rcx,r14
     11f3e40:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11f3e43:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f3e4a:	00 
     11f3e4b:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     11f3e50:	4c 89 f6             	mov    rsi,r14
     11f3e53:	e8 9a 5d 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f3e58:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f3e5c:	e8 25 a6 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f3e61:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f3e68:	00 
     11f3e69:	e8 7a 69 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f3e6e:	48 8d bc 24 c0 02 00 	lea    rdi,[rsp+0x2c0]
     11f3e75:	00 
     11f3e76:	e8 c1 25 00 00       	call   11f643c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9c0>
     11f3e7b:	48 8b bc 24 58 05 00 	mov    rdi,QWORD PTR [rsp+0x558]
     11f3e82:	00 

### 0x11f3fa3: mov    rdi,QWORD PTR [r14+0x8]
     11f3f84:	4c 8b bc 24 40 07 00 	mov    r15,QWORD PTR [rsp+0x740]
     11f3f8b:	00 
     11f3f8c:	48 8d bb a8 4a 00 00 	lea    rdi,[rbx+0x4aa8]
     11f3f93:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f3f9a:	00 
     11f3f9b:	4c 89 f6             	mov    rsi,r14
     11f3f9e:	e8 9b 5a 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f3fa3:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f3fa7:	e8 da a4 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f3fac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f3fb3:	00 
     11f3fb4:	e8 2f 68 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f3fb9:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     11f3fbd:	48 89 83 c8 4a 00 00 	mov    QWORD PTR [rbx+0x4ac8],rax
     11f3fc4:	f3 41 0f 6f 07       	movdqu xmm0,XMMWORD PTR [r15]
     11f3fc9:	f3 0f 7f 83 b8 4a 00 	movdqu XMMWORD PTR [rbx+0x4ab8],xmm0
     11f3fd0:	00 

### 0x11f4149: mov    QWORD PTR [r15+0x18],rax
     11f412c:	00 
     11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     11f4139:	00 
     11f413a:	48 89 ee             	mov    rsi,rbp
     11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
     11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
     11f4154:	00 
     11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax

### 0x11f4155: mov    QWORD PTR [r15+0x20],rax
     11f4139:	00 
     11f413a:	48 89 ee             	mov    rsi,rbp
     11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
     11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
     11f4154:	00 
     11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax

### 0x11f415e: mov    QWORD PTR [r15+0x28],rax
     11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
     11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
     11f4154:	00 
     11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
     11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]

### 0x11f4169: mov    QWORD PTR [r15+0x30],rax
     11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
     11f4154:	00 
     11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
     11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
     11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]

### 0x11f4172: mov    QWORD PTR [r15+0x38],rax
     11f4154:	00 
     11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
     11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
     11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
     11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
     11f4198:	00 
     11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax

### 0x11f417e: mov    QWORD PTR [r15+0x40],rax
     11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
     11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
     11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
     11f4198:	00 
     11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
     11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
     11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax

### 0x11f4182: mov    QWORD PTR [r15+0x48],r14
     11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
     11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
     11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
     11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
     11f4198:	00 
     11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
     11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
     11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
     11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]

### 0x11f418d: mov    QWORD PTR [r15+0x50],rax
     11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
     11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
     11f417d:	00 
     11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
     11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
     11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
     11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
     11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
     11f4198:	00 
     11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
     11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
     11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
     11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
     11f41af:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
     11f41b3:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]

### 0x11f4301: mov    rdi,QWORD PTR [r14+0x8]
     11f42e2:	ff 50 20             	call   QWORD PTR [rax+0x20]
     11f42e5:	49 8d bf c8 10 00 00 	lea    rdi,[r15+0x10c8]
     11f42ec:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
     11f42f3:	00 
     11f42f4:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
     11f42f9:	4c 89 f6             	mov    rsi,r14
     11f42fc:	e8 3d 57 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f4301:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f4305:	e8 7c a1 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f430a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f4311:	00 
     11f4312:	e8 d1 64 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f4317:	4c 8d 84 24 98 01 00 	lea    r8,[rsp+0x198]
     11f431e:	00 
     11f431f:	49 89 28             	mov    QWORD PTR [r8],rbp
     11f4322:	48 8d 35 68 8d 8a ff 	lea    rsi,[rip+0xffffffffff8a8d68]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f4329:	48 8d 0d 20 a9 00 00 	lea    rcx,[rip+0xa920]        # 11fec50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x441d4>

### 0x11f437e: mov    rdi,QWORD PTR [r14+0x8]
     11f435f:	49 8d bf d8 10 00 00 	lea    rdi,[r15+0x10d8]
     11f4366:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
     11f436d:	00 
     11f436e:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
     11f4375:	00 
     11f4376:	4c 89 f6             	mov    rsi,r14
     11f4379:	e8 c0 56 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f437e:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f4382:	e8 ff a0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f4387:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f438e:	00 
     11f438f:	e8 54 64 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f4394:	49 8d bf e8 10 00 00 	lea    rdi,[r15+0x10e8]
     11f439b:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
     11f43a0:	e8 99 0d c1 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
     11f43a5:	49 8d bf 40 11 00 00 	lea    rdi,[r15+0x1140]
     11f43ac:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi

### 0x11f4420: mov    rdi,QWORD PTR [r14+0x8]
     11f43fd:	4c 8d a3 78 18 00 00 	lea    r12,[rbx+0x1878]
     11f4404:	49 8d bf 98 11 00 00 	lea    rdi,[r15+0x1198]
     11f440b:	4c 8d b4 24 a0 05 00 	lea    r14,[rsp+0x5a0]
     11f4412:	00 
     11f4413:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
     11f4418:	4c 89 f6             	mov    rsi,r14
     11f441b:	e8 1e 56 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f4420:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f4424:	e8 5d a0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f4429:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f4430:	00 
     11f4431:	e8 b2 63 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f4436:	49 8d bf a8 11 00 00 	lea    rdi,[r15+0x11a8]
     11f443d:	48 89 bc 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rdi
     11f4444:	00 
     11f4445:	e8 ac 55 5e 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     11f444a:	31 c0                	xor    eax,eax

### 0x11f4650: mov    QWORD PTR [r14+0x18],rax
     11f4631:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]
     11f4638:	00 
     11f4639:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     11f4640:	00 
     11f4641:	4c 89 e7             	mov    rdi,r12
     11f4644:	e8 1d 15 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f4649:	48 8d 05 00 78 66 00 	lea    rax,[rip+0x667800]        # 185be50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18538>
     11f4650:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11f4654:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     11f465b:	00 00 
     11f465d:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     11f4663:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
     11f466a:	00 
     11f466b:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11f466f:	45 88 7e 38          	mov    BYTE PTR [r14+0x38],r15b
     11f4673:	4c 89 f7             	mov    rdi,r14
     11f4676:	48 83 c7 40          	add    rdi,0x40

### 0x11f465d: movdqu XMMWORD PTR [r14+0x20],xmm0
     11f4640:	00 
     11f4641:	4c 89 e7             	mov    rdi,r12
     11f4644:	e8 1d 15 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f4649:	48 8d 05 00 78 66 00 	lea    rax,[rip+0x667800]        # 185be50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18538>
     11f4650:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11f4654:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     11f465b:	00 00 
     11f465d:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     11f4663:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
     11f466a:	00 
     11f466b:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11f466f:	45 88 7e 38          	mov    BYTE PTR [r14+0x38],r15b
     11f4673:	4c 89 f7             	mov    rdi,r14
     11f4676:	48 83 c7 40          	add    rdi,0x40
     11f467a:	4c 89 e6             	mov    rsi,r12
     11f467d:	e8 e4 14 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f4682:	4c 89 e7             	mov    rdi,r12

### 0x11f466b: mov    QWORD PTR [r14+0x30],rax
     11f4649:	48 8d 05 00 78 66 00 	lea    rax,[rip+0x667800]        # 185be50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18538>
     11f4650:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11f4654:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     11f465b:	00 00 
     11f465d:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     11f4663:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
     11f466a:	00 
     11f466b:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11f466f:	45 88 7e 38          	mov    BYTE PTR [r14+0x38],r15b
     11f4673:	4c 89 f7             	mov    rdi,r14
     11f4676:	48 83 c7 40          	add    rdi,0x40
     11f467a:	4c 89 e6             	mov    rsi,r12
     11f467d:	e8 e4 14 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f4682:	4c 89 e7             	mov    rdi,r12
     11f4685:	e8 24 15 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f468a:	31 ff                	xor    edi,edi
     11f468c:	e8 f5 9d 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0x11f466f: mov    BYTE PTR [r14+0x38],r15b
     11f4650:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11f4654:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     11f465b:	00 00 
     11f465d:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
     11f4663:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
     11f466a:	00 
     11f466b:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
     11f466f:	45 88 7e 38          	mov    BYTE PTR [r14+0x38],r15b
     11f4673:	4c 89 f7             	mov    rdi,r14
     11f4676:	48 83 c7 40          	add    rdi,0x40
     11f467a:	4c 89 e6             	mov    rsi,r12
     11f467d:	e8 e4 14 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
     11f4682:	4c 89 e7             	mov    rdi,r12
     11f4685:	e8 24 15 00 00       	call   11f5bae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b132>
     11f468a:	31 ff                	xor    edi,edi
     11f468c:	e8 f5 9d 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f4691:	48 89 ab e0 4a 00 00 	mov    QWORD PTR [rbx+0x4ae0],rbp

### 0x11f476b: mov    QWORD PTR [r14+0x18],rax
     11f474a:	49 89 c6             	mov    r14,rax
     11f474d:	66 0f ef c0          	pxor   xmm0,xmm0
     11f4751:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     11f4756:	48 8d 05 2b 74 66 00 	lea    rax,[rip+0x66742b]        # 185bb88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18270>
     11f475d:	49 89 06             	mov    QWORD PTR [r14],rax
     11f4760:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     11f4764:	48 8d 05 bd 75 66 00 	lea    rax,[rip+0x6675bd]        # 185bd28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18410>
     11f476b:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11f476f:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15
     11f4773:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
     11f477a:	00 
     11f477b:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
     11f477f:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f4786:	00 
     11f4787:	4d 89 28             	mov    QWORD PTR [r8],r13
     11f478a:	48 8d 35 00 89 8a ff 	lea    rsi,[rip+0xffffffffff8a8900]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f4791:	48 8d 0d 70 68 00 00 	lea    rcx,[rip+0x6870]        # 11fb008 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4058c>

### 0x11f476f: mov    QWORD PTR [r14+0x20],r15
     11f474d:	66 0f ef c0          	pxor   xmm0,xmm0
     11f4751:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     11f4756:	48 8d 05 2b 74 66 00 	lea    rax,[rip+0x66742b]        # 185bb88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18270>
     11f475d:	49 89 06             	mov    QWORD PTR [r14],rax
     11f4760:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     11f4764:	48 8d 05 bd 75 66 00 	lea    rax,[rip+0x6675bd]        # 185bd28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18410>
     11f476b:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11f476f:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15
     11f4773:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
     11f477a:	00 
     11f477b:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
     11f477f:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f4786:	00 
     11f4787:	4d 89 28             	mov    QWORD PTR [r8],r13
     11f478a:	48 8d 35 00 89 8a ff 	lea    rsi,[rip+0xffffffffff8a8900]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f4791:	48 8d 0d 70 68 00 00 	lea    rcx,[rip+0x6870]        # 11fb008 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4058c>
     11f4798:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f477b: mov    QWORD PTR [r14+0x28],rax
     11f475d:	49 89 06             	mov    QWORD PTR [r14],rax
     11f4760:	4d 8d 6e 18          	lea    r13,[r14+0x18]
     11f4764:	48 8d 05 bd 75 66 00 	lea    rax,[rip+0x6675bd]        # 185bd28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18410>
     11f476b:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     11f476f:	4d 89 7e 20          	mov    QWORD PTR [r14+0x20],r15
     11f4773:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
     11f477a:	00 
     11f477b:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
     11f477f:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f4786:	00 
     11f4787:	4d 89 28             	mov    QWORD PTR [r8],r13
     11f478a:	48 8d 35 00 89 8a ff 	lea    rsi,[rip+0xffffffffff8a8900]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f4791:	48 8d 0d 70 68 00 00 	lea    rcx,[rip+0x6870]        # 11fb008 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4058c>
     11f4798:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]
     11f479f:	00 
     11f47a0:	6a 08                	push   0x8
     11f47a2:	41 59                	pop    r9

### 0x11f47f8: mov    r12,QWORD PTR [r14+0x28]
     11f47d9:	4c 89 e6             	mov    rsi,r12
     11f47dc:	e8 5d 52 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f47e1:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
     11f47e6:	e8 9b 9c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f47eb:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f47f2:	00 
     11f47f3:	e8 f0 5f 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f47f8:	4d 8b 66 28          	mov    r12,QWORD PTR [r14+0x28]
     11f47fc:	4c 8d 84 24 50 05 00 	lea    r8,[rsp+0x550]
     11f4803:	00 
     11f4804:	4d 89 ef             	mov    r15,r13
     11f4807:	4d 89 28             	mov    QWORD PTR [r8],r13
     11f480a:	48 8d 35 80 88 8a ff 	lea    rsi,[rip+0xffffffffff8a8880]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f4811:	48 8d 0d 2a 68 00 00 	lea    rcx,[rip+0x682a]        # 11fb042 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x405c6>
     11f4818:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
     11f481f:	00 
     11f4820:	6a 08                	push   0x8

### 0x11f488e: mov    rdi,QWORD PTR [r14+0x20]
     11f4870:	4d 8d 6e 50          	lea    r13,[r14+0x50]
     11f4874:	4c 89 ef             	mov    rdi,r13
     11f4877:	e8 ae 62 47 00       	call   166ab2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ec96>
     11f487c:	4c 89 f5             	mov    rbp,r14
     11f487f:	48 81 c5 40 0f 00 00 	add    rbp,0xf40
     11f4886:	48 89 ef             	mov    rdi,rbp
     11f4889:	e8 b0 08 c1 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
     11f488e:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     11f4892:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4895:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     11f489b:	4c 89 ef             	mov    rdi,r13
     11f489e:	48 89 c6             	mov    rsi,rax
     11f48a1:	e8 d2 6a 47 00       	call   166b378 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f4e4>
     11f48a6:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     11f48aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f48ad:	4c 89 ee             	mov    rsi,r13
     11f48b0:	ff 50 10             	call   QWORD PTR [rax+0x10]

### 0x11f48a6: mov    rdi,QWORD PTR [r14+0x28]
     11f4889:	e8 b0 08 c1 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
     11f488e:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
     11f4892:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4895:	ff 90 d8 00 00 00    	call   QWORD PTR [rax+0xd8]
     11f489b:	4c 89 ef             	mov    rdi,r13
     11f489e:	48 89 c6             	mov    rsi,rax
     11f48a1:	e8 d2 6a 47 00       	call   166b378 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f4e4>
     11f48a6:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
     11f48aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f48ad:	4c 89 ee             	mov    rsi,r13
     11f48b0:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11f48b3:	31 ff                	xor    edi,edi
     11f48b5:	e8 62 9b 8a ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
     11f48ba:	4c 89 bb 00 4b 00 00 	mov    QWORD PTR [rbx+0x4b00],r15
     11f48c1:	4c 89 b3 08 4b 00 00 	mov    QWORD PTR [rbx+0x4b08],r14
     11f48c8:	48 8d 05 51 7f 66 00 	lea    rax,[rip+0x667f51]        # 185c820 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18f08>
     11f48cf:	48 89 83 10 4b 00 00 	mov    QWORD PTR [rbx+0x4b10],rax

### 0x11f4a84: mov    QWORD PTR [r14+0x18],r13
     11f4a69:	00 
     11f4a6a:	4c 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r14
     11f4a71:	00 
     11f4a72:	4c 8d b4 24 a0 02 00 	lea    r14,[rsp+0x2a0]
     11f4a79:	00 
     11f4a7a:	4d 89 3e             	mov    QWORD PTR [r14],r15
     11f4a7d:	4c 8d 2d 10 1f 00 00 	lea    r13,[rip+0x1f10]        # 11f6994 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bf18>
     11f4a84:	4d 89 6e 18          	mov    QWORD PTR [r14+0x18],r13
     11f4a88:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11f4a8f:	00 
     11f4a90:	48 8b b4 24 60 06 00 	mov    rsi,QWORD PTR [rsp+0x660]
     11f4a97:	00 
     11f4a98:	e8 25 cc 5c 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     11f4a9d:	48 8b 84 24 38 07 00 	mov    rax,QWORD PTR [rsp+0x738]
     11f4aa4:	00 
     11f4aa5:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     11f4aa9:	4c 8d a4 24 70 02 00 	lea    r12,[rsp+0x270]

### 0x11f4e57: mov    QWORD PTR [r15+0x8],rax
     11f4e37:	e8 b6 4d 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f4e3c:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     11f4e40:	e8 41 96 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f4e45:	4c 89 ff             	mov    rdi,r15
     11f4e48:	e8 9b 59 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f4e4d:	48 8d 05 c4 cd 25 ff 	lea    rax,[rip+0xffffffffff25cdc4]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
     11f4e54:	49 89 07             	mov    QWORD PTR [r15],rax
     11f4e57:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
     11f4e5b:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     11f4e60:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
     11f4e64:	48 8d 05 f9 75 88 ff 	lea    rax,[rip+0xffffffffff8875f9]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     11f4e6b:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     11f4e70:	48 8d 05 8d 1d 00 00 	lea    rax,[rip+0x1d8d]        # 11f6c04 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3c188>
     11f4e77:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
     11f4e7c:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     11f4e83:	00 
     11f4e84:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0x11f583e: mov    rdi,QWORD PTR [r14+0x38]
     11f5824:	e8 eb 02 00 00       	call   11f5b14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b098>
     11f5829:	eb 42                	jmp    11f586d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3adf1>
     11f582b:	48 89 c5             	mov    rbp,rax
     11f582e:	4c 89 e7             	mov    rdi,r12
     11f5831:	e8 30 46 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11f5836:	4c 89 ff             	mov    rdi,r15
     11f5839:	e8 96 43 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f583e:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     11f5842:	e8 3f 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5847:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     11f584b:	e8 36 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5850:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f5854:	e8 2d 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5859:	31 ff                	xor    edi,edi
     11f585b:	e8 26 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5860:	4c 89 f7             	mov    rdi,r14
     11f5863:	e8 b8 86 5f 00       	call   17edf20 <_ZdlPv@plt>

### 0x11f5847: mov    rdi,QWORD PTR [r14+0x18]
     11f582b:	48 89 c5             	mov    rbp,rax
     11f582e:	4c 89 e7             	mov    rdi,r12
     11f5831:	e8 30 46 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11f5836:	4c 89 ff             	mov    rdi,r15
     11f5839:	e8 96 43 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f583e:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     11f5842:	e8 3f 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5847:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     11f584b:	e8 36 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5850:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f5854:	e8 2d 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5859:	31 ff                	xor    edi,edi
     11f585b:	e8 26 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5860:	4c 89 f7             	mov    rdi,r14
     11f5863:	e8 b8 86 5f 00       	call   17edf20 <_ZdlPv@plt>
     11f5868:	eb 03                	jmp    11f586d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3adf1>
     11f586a:	48 89 c5             	mov    rbp,rax

### 0x11f5850: mov    rdi,QWORD PTR [r14+0x8]
     11f5831:	e8 30 46 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11f5836:	4c 89 ff             	mov    rdi,r15
     11f5839:	e8 96 43 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f583e:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
     11f5842:	e8 3f 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5847:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
     11f584b:	e8 36 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5850:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f5854:	e8 2d 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5859:	31 ff                	xor    edi,edi
     11f585b:	e8 26 8c 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f5860:	4c 89 f7             	mov    rdi,r14
     11f5863:	e8 b8 86 5f 00       	call   17edf20 <_ZdlPv@plt>
     11f5868:	eb 03                	jmp    11f586d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3adf1>
     11f586a:	48 89 c5             	mov    rbp,rax
     11f586d:	48 8b bc 24 28 05 00 	mov    rdi,QWORD PTR [rsp+0x528]
     11f5874:	00 

## Secondary object methods that load dependency from this+8 / this+0x20
### 0x11fb610: mov    r14,QWORD PTR [rdi+0x8]; FDE=(18855408, 18855557)
     11fb5e5:	e8 e6 46 87 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11fb5ea:	e8 c1 44 5f 00       	call   17efab0 <__stack_chk_fail@plt>
     11fb5ef:	cc                   	int3
     11fb5f0:	41 57                	push   r15
     11fb5f2:	41 56                	push   r14
     11fb5f4:	53                   	push   rbx
     11fb5f5:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     11fb5fc:	48 89 d3             	mov    rbx,rdx
     11fb5ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb606:	00 00 
     11fb608:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11fb60f:	00 
     11fb610:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     11fb614:	49 89 e7             	mov    r15,rsp
     11fb617:	4c 89 ff             	mov    rdi,r15
     11fb61a:	e8 43 c4 46 00       	call   1667a62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbce>
     11fb61f:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11fb622:	4c 89 f7             	mov    rdi,r14
     11fb625:	4c 89 fe             	mov    rsi,r15
     11fb628:	48 89 da             	mov    rdx,rbx
     11fb62b:	ff 50 68             	call   QWORD PTR [rax+0x68]
     11fb62e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11fb633:	e8 a0 09 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fb638:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb63f:	00 00 
     11fb641:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     11fb648:	00 
     11fb649:	75 35                	jne    11fb680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40c04>
     11fb64b:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
     11fb652:	5b                   	pop    rbx
     11fb653:	41 5e                	pop    r14
     11fb655:	41 5f                	pop    r15
     11fb657:	c3                   	ret
     11fb658:	48 89 c3             	mov    rbx,rax
     11fb65b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11fb660:	e8 73 09 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>

### 0x11fcfc7: mov    rsi,QWORD PTR [r15+0x8]; FDE=(18861914, 18862325)
     11fcf93:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11fcf9a:	00 
     11fcf9b:	e8 de ca 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     11fcfa0:	49 8d 56 18          	lea    rdx,[r14+0x18]
     11fcfa4:	49 8d 4e 01          	lea    rcx,[r14+0x1]
     11fcfa8:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11fcfad:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
     11fcfb4:	00 
     11fcfb5:	e8 87 15 00 00       	call   11fe541 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ac5>
     11fcfba:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11fcfc1:	00 
     11fcfc2:	e8 c9 0e 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11fcfc7:	49 8b 77 08          	mov    rsi,QWORD PTR [r15+0x8]
     11fcfcb:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11fcfd0:	e8 0e 17 00 00       	call   11fe6e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43c67>
     11fcfd5:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11fcfda:	e8 1b 19 00 00       	call   11fe8fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e7e>
     11fcfdf:	41 8a 0e             	mov    cl,BYTE PTR [r14]
     11fcfe2:	88 48 7b             	mov    BYTE PTR [rax+0x7b],cl
     11fcfe5:	80 48 11 80          	or     BYTE PTR [rax+0x11],0x80
     11fcfe9:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
     11fcfed:	31 c0                	xor    eax,eax
     11fcfef:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     11fcff4:	88 02                	mov    BYTE PTR [rdx],al
     11fcff6:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
     11fcff9:	48 8d 8c 24 50 01 00 	lea    rcx,[rsp+0x150]
     11fd000:	00 
     11fd001:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
     11fd006:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     11fd00b:	e8 12 7e 42 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     11fd010:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11fd017:	00 
     11fd018:	e8 4d cf 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11fd01d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11fd022:	e8 09 9d 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11fd027:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]

### 0x11fd027: mov    r15,QWORD PTR [r15+0x8]; FDE=(18861914, 18862325)
     11fcff4:	88 02                	mov    BYTE PTR [rdx],al
     11fcff6:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
     11fcff9:	48 8d 8c 24 50 01 00 	lea    rcx,[rsp+0x150]
     11fd000:	00 
     11fd001:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
     11fd006:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     11fd00b:	e8 12 7e 42 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     11fd010:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11fd017:	00 
     11fd018:	e8 4d cf 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11fd01d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11fd022:	e8 09 9d 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11fd027:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
     11fd02b:	4c 8d a4 24 98 00 00 	lea    r12,[rsp+0x98]
     11fd032:	00 
     11fd033:	4c 89 e7             	mov    rdi,r12
     11fd036:	4c 89 f6             	mov    rsi,r14
     11fd039:	e8 04 aa 46 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
     11fd03e:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11fd041:	4c 89 ff             	mov    rdi,r15
     11fd044:	4c 89 e6             	mov    rsi,r12
     11fd047:	48 89 da             	mov    rdx,rbx
     11fd04a:	ff 50 68             	call   QWORD PTR [rax+0x68]
     11fd04d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     11fd054:	00 
     11fd055:	e8 7e ef 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fd05a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11fd05f:	e8 aa 2f 45 00       	call   165000e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x417a>
     11fd064:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fd06b:	00 00 
     11fd06d:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
     11fd074:	00 
     11fd075:	75 79                	jne    11fd0f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42674>
     11fd077:	48 81 c4 88 01 00 00 	add    rsp,0x188
     11fd07e:	5b                   	pop    rbx
     11fd07f:	41 5c                	pop    r12

### 0x1201fb5: mov    rsi,QWORD PTR [r15+0x20]; FDE=(18881894, 18883288)
     1201f86:	41 c6 86 c4 00 00 00 	mov    BYTE PTR [r14+0xc4],0x0
     1201f8d:	00 
     1201f8e:	48 8d 84 24 90 00 00 	lea    rax,[rsp+0x90]
     1201f95:	00 
     1201f96:	0f 57 c0             	xorps  xmm0,xmm0
     1201f99:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1201f9c:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     1201fa0:	49 8d bf c0 04 00 00 	lea    rdi,[r15+0x4c0]
     1201fa7:	e8 e7 4e 00 00       	call   1206e93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c417>
     1201fac:	89 44 24 04          	mov    DWORD PTR [rsp+0x4],eax
     1201fb0:	40 84 ed             	test   bpl,bpl
     1201fb3:	74 52                	je     1202007 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4758b>
     1201fb5:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1201fb9:	31 d2                	xor    edx,edx
     1201fbb:	84 db                	test   bl,bl
     1201fbd:	0f 95 c2             	setne  dl
     1201fc0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1201fc3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1201fca:	00 
     1201fcb:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
     1201fcf:	ff 50 70             	call   QWORD PTR [rax+0x70]
     1201fd2:	48 83 bc 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],0x0
     1201fd9:	00 00 
     1201fdb:	74 19                	je     1201ff6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4757a>
     1201fdd:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     1201fe4:	00 
     1201fe5:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1201fe9:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1201ff0:	00 
     1201ff1:	e8 dc 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     1201ff6:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1201ffd:	00 
     1201ffe:	e8 e3 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1202003:	45 8a 66 01          	mov    r12b,BYTE PTR [r14+0x1]
     1202007:	45 84 e4             	test   r12b,r12b
     120200a:	8b 5c 24 08          	mov    ebx,DWORD PTR [rsp+0x8]

### 0x1202015: mov    rsi,QWORD PTR [r15+0x20]; FDE=(18881894, 18883288)
     1201fe5:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1201fe9:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1201ff0:	00 
     1201ff1:	e8 dc 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     1201ff6:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1201ffd:	00 
     1201ffe:	e8 e3 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1202003:	45 8a 66 01          	mov    r12b,BYTE PTR [r14+0x1]
     1202007:	45 84 e4             	test   r12b,r12b
     120200a:	8b 5c 24 08          	mov    ebx,DWORD PTR [rsp+0x8]
     120200e:	44 8b 64 24 0c       	mov    r12d,DWORD PTR [rsp+0xc]
     1202013:	74 47                	je     120205c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x475e0>
     1202015:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202019:	41 0f b6 16          	movzx  edx,BYTE PTR [r14]
     120201d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1202020:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1202027:	00 
     1202028:	ff 50 78             	call   QWORD PTR [rax+0x78]
     120202b:	48 83 bc 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],0x0
     1202032:	00 00 
     1202034:	74 19                	je     120204f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x475d3>
     1202036:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     120203d:	00 
     120203e:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1202042:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1202049:	00 
     120204a:	e8 83 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     120204f:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1202056:	00 
     1202057:	e8 8a 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120205c:	45 84 e4             	test   r12b,r12b
     120205f:	74 4c                	je     12020ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47631>
     1202061:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202065:	49 8d 8f e0 00 00 00 	lea    rcx,[r15+0xe0]
     120206c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     120206f:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]

### 0x1202061: mov    rsi,QWORD PTR [r15+0x20]; FDE=(18881894, 18883288)
     1202034:	74 19                	je     120204f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x475d3>
     1202036:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     120203d:	00 
     120203e:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1202042:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1202049:	00 
     120204a:	e8 83 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     120204f:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1202056:	00 
     1202057:	e8 8a 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120205c:	45 84 e4             	test   r12b,r12b
     120205f:	74 4c                	je     12020ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47631>
     1202061:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202065:	49 8d 8f e0 00 00 00 	lea    rcx,[r15+0xe0]
     120206c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     120206f:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1202076:	00 
     1202077:	89 da                	mov    edx,ebx
     1202079:	ff 50 68             	call   QWORD PTR [rax+0x68]
     120207c:	48 83 bc 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],0x0
     1202083:	00 00 
     1202085:	74 19                	je     12020a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47624>
     1202087:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     120208e:	00 
     120208f:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1202093:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     120209a:	00 
     120209b:	e8 32 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     12020a0:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     12020a7:	00 
     12020a8:	e8 39 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12020ad:	41 80 be c4 00 00 00 	cmp    BYTE PTR [r14+0xc4],0x0
     12020b4:	00 
     12020b5:	74 4f                	je     1202106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4768a>
     12020b7:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12020bb:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]

### 0x12020b7: mov    rsi,QWORD PTR [r15+0x20]; FDE=(18881894, 18883288)
     1202087:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     120208e:	00 
     120208f:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1202093:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     120209a:	00 
     120209b:	e8 32 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     12020a0:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     12020a7:	00 
     12020a8:	e8 39 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12020ad:	41 80 be c4 00 00 00 	cmp    BYTE PTR [r14+0xc4],0x0
     12020b4:	00 
     12020b5:	74 4f                	je     1202106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4768a>
     12020b7:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12020bb:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]
     12020c2:	00 00 
     12020c4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12020c7:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     12020ce:	00 
     12020cf:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     12020d5:	48 83 bc 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],0x0
     12020dc:	00 00 
     12020de:	74 19                	je     12020f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4767d>
     12020e0:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     12020e7:	00 
     12020e8:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     12020ec:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     12020f3:	00 
     12020f4:	e8 d9 78 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     12020f9:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1202100:	00 
     1202101:	e8 e0 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1202106:	48 83 bc 24 98 00 00 	cmp    QWORD PTR [rsp+0x98],0x0
     120210d:	00 00 
     120210f:	74 46                	je     1202157 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x476db>
     1202111:	e8 b1 87 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     1202116:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]

### 0x1202141: mov    rdi,QWORD PTR [r13+0x20]; FDE=(18881894, 18883288)
     120210d:	00 00 
     120210f:	74 46                	je     1202157 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x476db>
     1202111:	e8 b1 87 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     1202116:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
     120211b:	c7 06 0f 00 00 00    	mov    DWORD PTR [rsi],0xf
     1202121:	48 8d 05 28 0d 78 00 	lea    rax,[rip+0x780d28]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     1202128:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     120212c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1202133:	00 
     1202134:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
     120213b:	00 
     120213c:	e8 17 84 46 00       	call   166a558 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6c4>
     1202141:	49 8b 7d 20          	mov    rdi,QWORD PTR [r13+0x20]
     1202145:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     120214c:	00 
     120214d:	e8 3e bc 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202152:	e9 bc 00 00 00       	jmp    1202213 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47797>
     1202157:	45 84 e4             	test   r12b,r12b
     120215a:	74 22                	je     120217e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47702>
     120215c:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202160:	49 8d 8f e0 00 00 00 	lea    rcx,[r15+0xe0]
     1202167:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     120216a:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     120216f:	89 da                	mov    edx,ebx
     1202171:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1202174:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1202179:	e8 68 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120217e:	41 80 7e 03 00       	cmp    BYTE PTR [r14+0x3],0x0
     1202183:	74 22                	je     12021a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4772b>
     1202185:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202189:	41 0f b6 56 02       	movzx  edx,BYTE PTR [r14+0x2]
     120218e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1202191:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1202196:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
     120219a:	ff 50 48             	call   QWORD PTR [rax+0x48]
     120219d:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]

### 0x120215c: mov    rsi,QWORD PTR [r15+0x20]; FDE=(18881894, 18883288)
     120212c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1202133:	00 
     1202134:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
     120213b:	00 
     120213c:	e8 17 84 46 00       	call   166a558 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6c4>
     1202141:	49 8b 7d 20          	mov    rdi,QWORD PTR [r13+0x20]
     1202145:	48 8d b4 24 a0 00 00 	lea    rsi,[rsp+0xa0]
     120214c:	00 
     120214d:	e8 3e bc 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202152:	e9 bc 00 00 00       	jmp    1202213 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47797>
     1202157:	45 84 e4             	test   r12b,r12b
     120215a:	74 22                	je     120217e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47702>
     120215c:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202160:	49 8d 8f e0 00 00 00 	lea    rcx,[r15+0xe0]
     1202167:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     120216a:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     120216f:	89 da                	mov    edx,ebx
     1202171:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1202174:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1202179:	e8 68 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120217e:	41 80 7e 03 00       	cmp    BYTE PTR [r14+0x3],0x0
     1202183:	74 22                	je     12021a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4772b>
     1202185:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202189:	41 0f b6 56 02       	movzx  edx,BYTE PTR [r14+0x2]
     120218e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1202191:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1202196:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
     120219a:	ff 50 48             	call   QWORD PTR [rax+0x48]
     120219d:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     12021a2:	e8 3f 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021a7:	41 80 7e 01 00       	cmp    BYTE PTR [r14+0x1],0x0
     12021ac:	74 1d                	je     12021cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4774f>
     12021ae:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12021b2:	41 0f b6 16          	movzx  edx,BYTE PTR [r14]
     12021b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12021b9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]

### 0x1202185: mov    rsi,QWORD PTR [r15+0x20]; FDE=(18881894, 18883288)
     1202157:	45 84 e4             	test   r12b,r12b
     120215a:	74 22                	je     120217e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47702>
     120215c:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202160:	49 8d 8f e0 00 00 00 	lea    rcx,[r15+0xe0]
     1202167:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     120216a:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     120216f:	89 da                	mov    edx,ebx
     1202171:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1202174:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
     1202179:	e8 68 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120217e:	41 80 7e 03 00       	cmp    BYTE PTR [r14+0x3],0x0
     1202183:	74 22                	je     12021a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4772b>
     1202185:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202189:	41 0f b6 56 02       	movzx  edx,BYTE PTR [r14+0x2]
     120218e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1202191:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1202196:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
     120219a:	ff 50 48             	call   QWORD PTR [rax+0x48]
     120219d:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     12021a2:	e8 3f 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021a7:	41 80 7e 01 00       	cmp    BYTE PTR [r14+0x1],0x0
     12021ac:	74 1d                	je     12021cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4774f>
     12021ae:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12021b2:	41 0f b6 16          	movzx  edx,BYTE PTR [r14]
     12021b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12021b9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     12021be:	ff 50 50             	call   QWORD PTR [rax+0x50]
     12021c1:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     12021c6:	e8 1b 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021cb:	41 80 be c4 00 00 00 	cmp    BYTE PTR [r14+0xc4],0x0
     12021d2:	00 
     12021d3:	74 22                	je     12021f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4777b>
     12021d5:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12021d9:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]
     12021e0:	00 00 
     12021e2:	48 8b 06             	mov    rax,QWORD PTR [rsi]

### 0x12021ae: mov    rsi,QWORD PTR [r15+0x20]; FDE=(18881894, 18883288)
     120217e:	41 80 7e 03 00       	cmp    BYTE PTR [r14+0x3],0x0
     1202183:	74 22                	je     12021a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4772b>
     1202185:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202189:	41 0f b6 56 02       	movzx  edx,BYTE PTR [r14+0x2]
     120218e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1202191:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     1202196:	8b 4c 24 04          	mov    ecx,DWORD PTR [rsp+0x4]
     120219a:	ff 50 48             	call   QWORD PTR [rax+0x48]
     120219d:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
     12021a2:	e8 3f 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021a7:	41 80 7e 01 00       	cmp    BYTE PTR [r14+0x1],0x0
     12021ac:	74 1d                	je     12021cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4774f>
     12021ae:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12021b2:	41 0f b6 16          	movzx  edx,BYTE PTR [r14]
     12021b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12021b9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     12021be:	ff 50 50             	call   QWORD PTR [rax+0x50]
     12021c1:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     12021c6:	e8 1b 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021cb:	41 80 be c4 00 00 00 	cmp    BYTE PTR [r14+0xc4],0x0
     12021d2:	00 
     12021d3:	74 22                	je     12021f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4777b>
     12021d5:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12021d9:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]
     12021e0:	00 00 
     12021e2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12021e5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     12021ea:	ff 50 58             	call   QWORD PTR [rax+0x58]
     12021ed:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     12021f2:	e8 ef 1b 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021f7:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     12021fe:	00 
     12021ff:	4c 89 f7             	mov    rdi,r14
     1202202:	e8 c3 85 46 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
     1202207:	49 8b 7d 20          	mov    rdi,QWORD PTR [r13+0x20]
     120220b:	4c 89 f6             	mov    rsi,r14

### 0x12021d5: mov    rsi,QWORD PTR [r15+0x20]; FDE=(18881894, 18883288)
     12021a7:	41 80 7e 01 00       	cmp    BYTE PTR [r14+0x1],0x0
     12021ac:	74 1d                	je     12021cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4774f>
     12021ae:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12021b2:	41 0f b6 16          	movzx  edx,BYTE PTR [r14]
     12021b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12021b9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     12021be:	ff 50 50             	call   QWORD PTR [rax+0x50]
     12021c1:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     12021c6:	e8 1b 1c 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021cb:	41 80 be c4 00 00 00 	cmp    BYTE PTR [r14+0xc4],0x0
     12021d2:	00 
     12021d3:	74 22                	je     12021f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4777b>
     12021d5:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12021d9:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]
     12021e0:	00 00 
     12021e2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12021e5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     12021ea:	ff 50 58             	call   QWORD PTR [rax+0x58]
     12021ed:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     12021f2:	e8 ef 1b 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021f7:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     12021fe:	00 
     12021ff:	4c 89 f7             	mov    rdi,r14
     1202202:	e8 c3 85 46 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
     1202207:	49 8b 7d 20          	mov    rdi,QWORD PTR [r13+0x20]
     120220b:	4c 89 f6             	mov    rsi,r14
     120220e:	e8 7d bb 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202213:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     120221a:	00 
     120221b:	e8 7e c5 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1202220:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     1202227:	00 
     1202228:	e8 b9 1b 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120222d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1202234:	00 00 
     1202236:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]

### 0x1202207: mov    rdi,QWORD PTR [r13+0x20]; FDE=(18881894, 18883288)
     12021d5:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12021d9:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]
     12021e0:	00 00 
     12021e2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12021e5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     12021ea:	ff 50 58             	call   QWORD PTR [rax+0x58]
     12021ed:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     12021f2:	e8 ef 1b 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12021f7:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     12021fe:	00 
     12021ff:	4c 89 f7             	mov    rdi,r14
     1202202:	e8 c3 85 46 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
     1202207:	49 8b 7d 20          	mov    rdi,QWORD PTR [r13+0x20]
     120220b:	4c 89 f6             	mov    rsi,r14
     120220e:	e8 7d bb 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202213:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     120221a:	00 
     120221b:	e8 7e c5 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1202220:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
     1202227:	00 
     1202228:	e8 b9 1b 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120222d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1202234:	00 00 
     1202236:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
     120223d:	00 
     120223e:	0f 85 8f 00 00 00    	jne    12022d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47857>
     1202244:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
     120224b:	5b                   	pop    rbx
     120224c:	41 5c                	pop    r12
     120224e:	41 5d                	pop    r13
     1202250:	41 5e                	pop    r14
     1202252:	41 5f                	pop    r15
     1202254:	5d                   	pop    rbp
     1202255:	c3                   	ret
     1202256:	eb 20                	jmp    1202278 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x477fc>
     1202258:	eb 04                	jmp    120225e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x477e2>

### 0x1202a43: mov    rdi,QWORD PTR [r12+0x20]; FDE=(18884874, 18890725)
     1202a0f:	00 
     1202a10:	e8 4b c0 54 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>
     1202a15:	e9 f5 00 00 00       	jmp    1202b0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48093>
     1202a1a:	e8 a8 7e 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     1202a1f:	48 8d 84 24 18 04 00 	lea    rax,[rsp+0x418]
     1202a26:	00 
     1202a27:	c7 40 e8 02 00 00 00 	mov    DWORD PTR [rax-0x18],0x2
     1202a2e:	48 8d 0d 1b 04 78 00 	lea    rcx,[rip+0x78041b]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     1202a35:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1202a39:	0f 57 c0             	xorps  xmm0,xmm0
     1202a3c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1202a3f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     1202a43:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
     1202a48:	48 8d b4 24 00 04 00 	lea    rsi,[rsp+0x400]
     1202a4f:	00 
     1202a50:	e8 3b b3 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202a55:	48 8b bc 24 18 04 00 	mov    rdi,QWORD PTR [rsp+0x418]
     1202a5c:	00 
     1202a5d:	e8 3c bd 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1202a62:	e9 13 10 00 00       	jmp    1203a7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48ffe>
     1202a67:	e8 5b 7e 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     1202a6c:	48 8d 84 24 d0 01 00 	lea    rax,[rsp+0x1d0]
     1202a73:	00 
     1202a74:	c7 40 e8 24 00 00 00 	mov    DWORD PTR [rax-0x18],0x24
     1202a7b:	48 8d 0d ce 03 78 00 	lea    rcx,[rip+0x7803ce]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     1202a82:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1202a86:	0f 57 c0             	xorps  xmm0,xmm0
     1202a89:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1202a8c:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     1202a90:	48 8d 9c 24 90 02 00 	lea    rbx,[rsp+0x290]
     1202a97:	00 
     1202a98:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
     1202a9f:	00 
     1202aa0:	48 89 df             	mov    rdi,rbx
     1202aa3:	4c 89 f6             	mov    rsi,r14
     1202aa6:	e8 53 71 e4 ff       	call   1049bfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211014>

### 0x1202bb2: mov    rdi,QWORD PTR [r12+0x20]; FDE=(18884874, 18890725)
     1202b7a:	f6 84 24 60 03 00 00 	test   BYTE PTR [rsp+0x360],0x4
     1202b81:	04 
     1202b82:	0f 85 87 00 00 00    	jne    1202c0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48193>
     1202b88:	31 c0                	xor    eax,eax
     1202b8a:	88 84 24 40 02 00 00 	mov    BYTE PTR [rsp+0x240],al
     1202b91:	88 84 24 88 02 00 00 	mov    BYTE PTR [rsp+0x288],al
     1202b98:	e9 01 08 00 00       	jmp    120339e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48922>
     1202b9d:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     1202ba4:	00 
     1202ba5:	48 8d b4 24 50 03 00 	lea    rsi,[rsp+0x350]
     1202bac:	00 
     1202bad:	e8 4e 7c 46 00       	call   166a800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e96c>
     1202bb2:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
     1202bb7:	48 8d b4 24 00 04 00 	lea    rsi,[rsp+0x400]
     1202bbe:	00 
     1202bbf:	e8 cc b1 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202bc4:	48 8b bc 24 18 04 00 	mov    rdi,QWORD PTR [rsp+0x418]
     1202bcb:	00 
     1202bcc:	e8 cd bb 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1202bd1:	e9 97 0e 00 00       	jmp    1203a6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48ff1>
     1202bd6:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     1202bdd:	00 
     1202bde:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     1202be5:	00 
     1202be6:	e8 15 7c 46 00       	call   166a800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e96c>
     1202beb:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
     1202bf0:	48 8d b4 24 00 04 00 	lea    rsi,[rsp+0x400]
     1202bf7:	00 
     1202bf8:	e8 93 b1 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202bfd:	48 8b bc 24 18 04 00 	mov    rdi,QWORD PTR [rsp+0x418]
     1202c04:	00 
     1202c05:	e8 94 bb 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1202c0a:	e9 51 0e 00 00       	jmp    1203a60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48fe4>
     1202c0f:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     1202c14:	48 8b 84 24 90 03 00 	mov    rax,QWORD PTR [rsp+0x390]
     1202c1b:	00 

### 0x1202beb: mov    rdi,QWORD PTR [r12+0x20]; FDE=(18884874, 18890725)
     1202bb7:	48 8d b4 24 00 04 00 	lea    rsi,[rsp+0x400]
     1202bbe:	00 
     1202bbf:	e8 cc b1 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202bc4:	48 8b bc 24 18 04 00 	mov    rdi,QWORD PTR [rsp+0x418]
     1202bcb:	00 
     1202bcc:	e8 cd bb 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1202bd1:	e9 97 0e 00 00       	jmp    1203a6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48ff1>
     1202bd6:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     1202bdd:	00 
     1202bde:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     1202be5:	00 
     1202be6:	e8 15 7c 46 00       	call   166a800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e96c>
     1202beb:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
     1202bf0:	48 8d b4 24 00 04 00 	lea    rsi,[rsp+0x400]
     1202bf7:	00 
     1202bf8:	e8 93 b1 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1202bfd:	48 8b bc 24 18 04 00 	mov    rdi,QWORD PTR [rsp+0x418]
     1202c04:	00 
     1202c05:	e8 94 bb 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1202c0a:	e9 51 0e 00 00       	jmp    1203a60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48fe4>
     1202c0f:	4c 89 64 24 30       	mov    QWORD PTR [rsp+0x30],r12
     1202c14:	48 8b 84 24 90 03 00 	mov    rax,QWORD PTR [rsp+0x390]
     1202c1b:	00 
     1202c1c:	0f 57 c0             	xorps  xmm0,xmm0
     1202c1f:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     1202c26:	00 
     1202c27:	0f 29 47 30          	movaps XMMWORD PTR [rdi+0x30],xmm0
     1202c2b:	0f 29 47 20          	movaps XMMWORD PTR [rdi+0x20],xmm0
     1202c2f:	48 83 67 40 00       	and    QWORD PTR [rdi+0x40],0x0
     1202c34:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
     1202c38:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     1202c3b:	48 85 c0             	test   rax,rax
     1202c3e:	48 8d 1d 33 26 7a 00 	lea    rbx,[rip+0x7a2633]        # 19a5278 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x6dec0>
     1202c45:	48 0f 44 c3          	cmove  rax,rbx
     1202c49:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
     1202c4d:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc

### 0x12035f2: mov    rsi,QWORD PTR [rbx+0x8]; FDE=(18884874, 18890725)
     12035c1:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
     12035c6:	41 83 7d 44 01       	cmp    DWORD PTR [r13+0x44],0x1
     12035cb:	4c 8d 35 0e 44 7a 00 	lea    r14,[rip+0x7a440e]        # 19a79e0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x70628>
     12035d2:	75 5a                	jne    120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     12035d4:	4c 8b bc 24 f8 01 00 	mov    r15,QWORD PTR [rsp+0x1f8]
     12035db:	00 
     12035dc:	4d 85 ff             	test   r15,r15
     12035df:	4d 0f 44 fe          	cmove  r15,r14
     12035e3:	41 f6 47 10 04       	test   BYTE PTR [r15+0x10],0x4
     12035e8:	74 44                	je     120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     12035ea:	49 8b 5f 40          	mov    rbx,QWORD PTR [r15+0x40]
     12035ee:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     12035f2:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     12035f6:	8b 3b                	mov    edi,DWORD PTR [rbx]
     12035f8:	e8 23 82 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12035fd:	84 c0                	test   al,al
     12035ff:	75 2d                	jne    120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     1203601:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1203606:	80 b8 a0 10 00 00 00 	cmp    BYTE PTR [rax+0x10a0],0x0
     120360d:	74 1f                	je     120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     120360f:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1203614:	48 8b b0 90 10 00 00 	mov    rsi,QWORD PTR [rax+0x1090]
     120361b:	8b b8 88 10 00 00    	mov    edi,DWORD PTR [rax+0x1088]
     1203621:	e8 fa 81 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     1203626:	84 c0                	test   al,al
     1203628:	0f 84 08 01 00 00    	je     1203736 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48cba>
     120362e:	41 83 7d 48 01       	cmp    DWORD PTR [r13+0x48],0x1
     1203633:	0f 85 55 03 00 00    	jne    120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     1203639:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     120363e:	80 b8 80 0a 00 00 00 	cmp    BYTE PTR [rax+0xa80],0x0
     1203645:	0f 84 43 03 00 00    	je     120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     120364b:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1203650:	80 b8 20 0a 00 00 00 	cmp    BYTE PTR [rax+0xa20],0x0
     1203657:	0f 84 31 03 00 00    	je     120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     120365d:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1203662:	80 b8 08 0a 00 00 00 	cmp    BYTE PTR [rax+0xa08],0x0

### 0x12036c8: mov    rsi,QWORD PTR [rbx+0x8]; FDE=(18884874, 18890725)
     1203694:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
     120369b:	00 
     120369c:	48 85 c0             	test   rax,rax
     120369f:	4c 0f 45 f0          	cmovne r14,rax
     12036a3:	49 8b 46 50          	mov    rax,QWORD PTR [r14+0x50]
     12036a7:	48 85 c0             	test   rax,rax
     12036aa:	4c 8d 3d d7 42 7a 00 	lea    r15,[rip+0x7a42d7]        # 19a7988 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x705d0>
     12036b1:	4c 0f 45 f8          	cmovne r15,rax
     12036b5:	41 f6 47 10 01       	test   BYTE PTR [r15+0x10],0x1
     12036ba:	0f 84 ce 02 00 00    	je     120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12036c0:	49 8b 5f 18          	mov    rbx,QWORD PTR [r15+0x18]
     12036c4:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     12036c8:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     12036cc:	8b 3b                	mov    edi,DWORD PTR [rbx]
     12036ce:	e8 4d 81 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12036d3:	84 c0                	test   al,al
     12036d5:	0f 85 b3 02 00 00    	jne    120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12036db:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12036e0:	48 8d b0 b0 05 00 00 	lea    rsi,[rax+0x5b0]
     12036e7:	48 89 df             	mov    rdi,rbx
     12036ea:	e8 ff bf 89 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12036ef:	84 c0                	test   al,al
     12036f1:	0f 84 97 02 00 00    	je     120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12036f7:	49 8b 5f 20          	mov    rbx,QWORD PTR [r15+0x20]
     12036fb:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     12036ff:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     1203703:	8b 3b                	mov    edi,DWORD PTR [rbx]
     1203705:	e8 16 81 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     120370a:	84 c0                	test   al,al
     120370c:	0f 84 c6 00 00 00    	je     12037d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48d5c>
     1203712:	4d 89 f7             	mov    r15,r14
     1203715:	e9 dd 00 00 00       	jmp    12037f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48d7b>
     120371a:	48 8d 35 5b e8 24 ff 	lea    rsi,[rip+0xffffffffff24e85b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1203721:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     1203728:	00 
     1203729:	e8 50 63 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>

### 0x12036f7: mov    rbx,QWORD PTR [r15+0x20]; FDE=(18884874, 18890725)
     12036c4:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     12036c8:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     12036cc:	8b 3b                	mov    edi,DWORD PTR [rbx]
     12036ce:	e8 4d 81 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12036d3:	84 c0                	test   al,al
     12036d5:	0f 85 b3 02 00 00    	jne    120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12036db:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12036e0:	48 8d b0 b0 05 00 00 	lea    rsi,[rax+0x5b0]
     12036e7:	48 89 df             	mov    rdi,rbx
     12036ea:	e8 ff bf 89 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12036ef:	84 c0                	test   al,al
     12036f1:	0f 84 97 02 00 00    	je     120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12036f7:	49 8b 5f 20          	mov    rbx,QWORD PTR [r15+0x20]
     12036fb:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     12036ff:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     1203703:	8b 3b                	mov    edi,DWORD PTR [rbx]
     1203705:	e8 16 81 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     120370a:	84 c0                	test   al,al
     120370c:	0f 84 c6 00 00 00    	je     12037d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48d5c>
     1203712:	4d 89 f7             	mov    r15,r14
     1203715:	e9 dd 00 00 00       	jmp    12037f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48d7b>
     120371a:	48 8d 35 5b e8 24 ff 	lea    rsi,[rip+0xffffffffff24e85b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1203721:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     1203728:	00 
     1203729:	e8 50 63 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     120372e:	4d 89 ec             	mov    r12,r13
     1203731:	e9 06 fe ff ff       	jmp    120353c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48ac0>
     1203736:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     120373b:	48 8d b8 88 10 00 00 	lea    rdi,[rax+0x1088]
     1203742:	48 89 de             	mov    rsi,rbx
     1203745:	e8 a4 bf 89 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     120374a:	84 c0                	test   al,al
     120374c:	0f 84 dc fe ff ff    	je     120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     1203752:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1203757:	80 b8 08 0a 00 00 00 	cmp    BYTE PTR [rax+0xa08],0x0
     120375e:	0f 84 ca fe ff ff    	je     120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>

### 0x12036ff: mov    rsi,QWORD PTR [rbx+0x8]; FDE=(18884874, 18890725)
     12036cc:	8b 3b                	mov    edi,DWORD PTR [rbx]
     12036ce:	e8 4d 81 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12036d3:	84 c0                	test   al,al
     12036d5:	0f 85 b3 02 00 00    	jne    120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12036db:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12036e0:	48 8d b0 b0 05 00 00 	lea    rsi,[rax+0x5b0]
     12036e7:	48 89 df             	mov    rdi,rbx
     12036ea:	e8 ff bf 89 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12036ef:	84 c0                	test   al,al
     12036f1:	0f 84 97 02 00 00    	je     120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12036f7:	49 8b 5f 20          	mov    rbx,QWORD PTR [r15+0x20]
     12036fb:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     12036ff:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     1203703:	8b 3b                	mov    edi,DWORD PTR [rbx]
     1203705:	e8 16 81 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     120370a:	84 c0                	test   al,al
     120370c:	0f 84 c6 00 00 00    	je     12037d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48d5c>
     1203712:	4d 89 f7             	mov    r15,r14
     1203715:	e9 dd 00 00 00       	jmp    12037f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48d7b>
     120371a:	48 8d 35 5b e8 24 ff 	lea    rsi,[rip+0xffffffffff24e85b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     1203721:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     1203728:	00 
     1203729:	e8 50 63 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     120372e:	4d 89 ec             	mov    r12,r13
     1203731:	e9 06 fe ff ff       	jmp    120353c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48ac0>
     1203736:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     120373b:	48 8d b8 88 10 00 00 	lea    rdi,[rax+0x1088]
     1203742:	48 89 de             	mov    rsi,rbx
     1203745:	e8 a4 bf 89 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     120374a:	84 c0                	test   al,al
     120374c:	0f 84 dc fe ff ff    	je     120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     1203752:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1203757:	80 b8 08 0a 00 00 00 	cmp    BYTE PTR [rax+0xa08],0x0
     120375e:	0f 84 ca fe ff ff    	je     120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     1203764:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1203769:	48 8b b0 b8 05 00 00 	mov    rsi,QWORD PTR [rax+0x5b8]

### 0x12037a7: mov    rsi,QWORD PTR [rbx+0x8]; FDE=(18884874, 18890725)
     1203770:	8b b8 b0 05 00 00    	mov    edi,DWORD PTR [rax+0x5b0]
     1203776:	e8 a5 80 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     120377b:	84 c0                	test   al,al
     120377d:	0f 85 ab fe ff ff    	jne    120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     1203783:	49 8b 4f 50          	mov    rcx,QWORD PTR [r15+0x50]
     1203787:	48 85 c9             	test   rcx,rcx
     120378a:	48 8d 05 f7 41 7a 00 	lea    rax,[rip+0x7a41f7]        # 19a7988 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x705d0>
     1203791:	48 0f 45 c1          	cmovne rax,rcx
     1203795:	f6 40 10 01          	test   BYTE PTR [rax+0x10],0x1
     1203799:	0f 84 8f fe ff ff    	je     120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     120379f:	48 8b 58 18          	mov    rbx,QWORD PTR [rax+0x18]
     12037a3:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     12037a7:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     12037ab:	8b 3b                	mov    edi,DWORD PTR [rbx]
     12037ad:	e8 6e 80 87 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12037b2:	84 c0                	test   al,al
     12037b4:	0f 85 74 fe ff ff    	jne    120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     12037ba:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12037bf:	48 8d b8 b0 05 00 00 	lea    rdi,[rax+0x5b0]
     12037c6:	48 89 de             	mov    rsi,rbx
     12037c9:	e8 20 bf 89 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12037ce:	84 c0                	test   al,al
     12037d0:	0f 84 58 fe ff ff    	je     120362e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48bb2>
     12037d6:	eb 1f                	jmp    12037f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48d7b>
     12037d8:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     12037dd:	48 8d b0 98 05 00 00 	lea    rsi,[rax+0x598]
     12037e4:	48 89 df             	mov    rdi,rbx
     12037e7:	e8 02 bf 89 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12037ec:	4d 89 f7             	mov    r15,r14
     12037ef:	84 c0                	test   al,al
     12037f1:	0f 84 97 01 00 00    	je     120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12037f7:	41 8b 47 10          	mov    eax,DWORD PTR [r15+0x10]
     12037fb:	0f ba e0 08          	bt     eax,0x8
     12037ff:	73 3c                	jae    120383d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48dc1>
     1203801:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     1203806:	48 8d bb c0 04 00 00 	lea    rdi,[rbx+0x4c0]

### 0x1203812: mov    rsi,QWORD PTR [rbx+0x20]; FDE=(18884874, 18890725)
     12037dd:	48 8d b0 98 05 00 00 	lea    rsi,[rax+0x598]
     12037e4:	48 89 df             	mov    rdi,rbx
     12037e7:	e8 02 bf 89 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     12037ec:	4d 89 f7             	mov    r15,r14
     12037ef:	84 c0                	test   al,al
     12037f1:	0f 84 97 01 00 00    	je     120398e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48f12>
     12037f7:	41 8b 47 10          	mov    eax,DWORD PTR [r15+0x10]
     12037fb:	0f ba e0 08          	bt     eax,0x8
     12037ff:	73 3c                	jae    120383d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48dc1>
     1203801:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     1203806:	48 8d bb c0 04 00 00 	lea    rdi,[rbx+0x4c0]
     120380d:	e8 81 36 00 00       	call   1206e93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c417>
     1203812:	48 8b 73 20          	mov    rsi,QWORD PTR [rbx+0x20]
     1203816:	41 0f b6 57 62       	movzx  edx,BYTE PTR [r15+0x62]
     120381b:	4c 8b 06             	mov    r8,QWORD PTR [rsi]
     120381e:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
     1203825:	00 
     1203826:	89 c1                	mov    ecx,eax
     1203828:	41 ff 50 48          	call   QWORD PTR [r8+0x48]
     120382c:	48 8b bc 24 18 01 00 	mov    rdi,QWORD PTR [rsp+0x118]
     1203833:	00 
     1203834:	e8 ad 05 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1203839:	41 8b 47 10          	mov    eax,DWORD PTR [r15+0x10]
     120383d:	0f ba e0 09          	bt     eax,0x9
     1203841:	73 2d                	jae    1203870 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48df4>
     1203843:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
     1203848:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
     120384c:	41 0f b6 57 63       	movzx  edx,BYTE PTR [r15+0x63]
     1203851:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1203854:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
     120385b:	00 
     120385c:	ff 50 50             	call   QWORD PTR [rax+0x50]
     120385f:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1203866:	00 
     1203867:	e8 7a 05 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120386c:	41 8b 47 10          	mov    eax,DWORD PTR [r15+0x10]

### 0x1203a06: mov    rdi,QWORD PTR [rbx+0x8]; FDE=(18884874, 18890725)
     12039d4:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     12039db:	00 
     12039dc:	48 8d 94 24 30 01 00 	lea    rdx,[rsp+0x130]
     12039e3:	00 
     12039e4:	48 89 de             	mov    rsi,rbx
     12039e7:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12039ea:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     12039ef:	48 81 c7 c8 00 00 00 	add    rdi,0xc8
     12039f6:	48 8d 9c 24 00 04 00 	lea    rbx,[rsp+0x400]
     12039fd:	00 
     12039fe:	48 89 de             	mov    rsi,rbx
     1203a01:	e8 16 5e 8b ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     1203a06:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1203a0a:	e8 77 aa 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1203a0f:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
     1203a16:	00 
     1203a17:	e8 e2 ce ff ff       	call   12008fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45e82>
     1203a1c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1203a23:	00 
     1203a24:	e8 0d f6 4a 00       	call   16b3036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a2>
     1203a29:	48 8d 9c 24 00 04 00 	lea    rbx,[rsp+0x400]
     1203a30:	00 
     1203a31:	48 89 df             	mov    rdi,rbx
     1203a34:	e8 91 6d 46 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
     1203a39:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
     1203a3e:	48 89 de             	mov    rsi,rbx
     1203a41:	e8 4a a3 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1203a46:	48 8b bc 24 18 04 00 	mov    rdi,QWORD PTR [rsp+0x418]
     1203a4d:	00 
     1203a4e:	e8 4b ad 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1203a53:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1203a5a:	00 
     1203a5b:	e8 d6 f5 4a 00       	call   16b3036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a2>
     1203a60:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
     1203a67:	00 
     1203a68:	e8 a7 af ff ff       	call   11fea14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43f98>

### 0x1203a39: mov    rdi,QWORD PTR [r12+0x20]; FDE=(18884874, 18890725)
     1203a06:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     1203a0a:	e8 77 aa 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1203a0f:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]
     1203a16:	00 
     1203a17:	e8 e2 ce ff ff       	call   12008fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45e82>
     1203a1c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
     1203a23:	00 
     1203a24:	e8 0d f6 4a 00       	call   16b3036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a2>
     1203a29:	48 8d 9c 24 00 04 00 	lea    rbx,[rsp+0x400]
     1203a30:	00 
     1203a31:	48 89 df             	mov    rdi,rbx
     1203a34:	e8 91 6d 46 00       	call   166a7ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e936>
     1203a39:	49 8b 7c 24 20       	mov    rdi,QWORD PTR [r12+0x20]
     1203a3e:	48 89 de             	mov    rsi,rbx
     1203a41:	e8 4a a3 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1203a46:	48 8b bc 24 18 04 00 	mov    rdi,QWORD PTR [rsp+0x418]
     1203a4d:	00 
     1203a4e:	e8 4b ad 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     1203a53:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1203a5a:	00 
     1203a5b:	e8 d6 f5 4a 00       	call   16b3036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a2>
     1203a60:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
     1203a67:	00 
     1203a68:	e8 a7 af ff ff       	call   11fea14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43f98>
     1203a6d:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]
     1203a74:	00 
     1203a75:	e8 da 34 00 00       	call   1206f54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c4d8>
     1203a7a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1203a81:	00 00 
     1203a83:	48 3b 84 24 30 06 00 	cmp    rax,QWORD PTR [rsp+0x630]
     1203a8a:	00 
     1203a8b:	0f 85 3e 05 00 00    	jne    1203fcf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49553>
     1203a91:	48 81 c4 38 06 00 00 	add    rsp,0x638
     1203a98:	5b                   	pop    rbx
     1203a99:	41 5c                	pop    r12
     1203a9b:	41 5d                	pop    r13

### 0x12042b5: mov    rdi,QWORD PTR [rbp+0x20]; FDE=(18891288, 18894558)
     1204289:	31 c0                	xor    eax,eax
     120428b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1204290:	45 31 ed             	xor    r13d,r13d
     1204293:	48 8d 35 87 34 18 ff 	lea    rsi,[rip+0xffffffffff183487]        # 387721 <_ZTSSt12bad_any_cast@@Base-0x8aa7>
     120429a:	4c 89 f7             	mov    rdi,r14
     120429d:	e8 ad 75 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12042a2:	84 c0                	test   al,al
     12042a4:	74 67                	je     120430d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49891>
     12042a6:	48 8b 55 60          	mov    rdx,QWORD PTR [rbp+0x60]
     12042aa:	48 89 df             	mov    rdi,rbx
     12042ad:	4c 89 e6             	mov    rsi,r12
     12042b0:	e8 ed 21 00 00       	call   12064a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ba26>
     12042b5:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     12042b9:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
     12042bc:	0f b6 c0             	movzx  eax,al
     12042bf:	6a 01                	push   0x1
     12042c1:	5e                   	pop    rsi
     12042c2:	4c 89 ea             	mov    rdx,r13
     12042c5:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     12042ca:	41 ff 54 c0 38       	call   QWORD PTR [r8+rax*8+0x38]
     12042cf:	e8 f3 65 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12042d4:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     12042db:	00 
     12042dc:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     12042e0:	48 8d 0d 69 eb 77 00 	lea    rcx,[rip+0x77eb69]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     12042e7:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     12042eb:	0f 57 c0             	xorps  xmm0,xmm0
     12042ee:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     12042f1:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     12042f5:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     12042fa:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     12042fe:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     1204305:	00 
     1204306:	e8 85 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     120430b:	eb 7c                	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
     120430d:	48 8d 35 2e 34 18 ff 	lea    rsi,[rip+0xffffffffff18342e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>

### 0x1204333: mov    rdi,QWORD PTR [rbp+0x20]; FDE=(18891288, 18894558)
     1204305:	00 
     1204306:	e8 85 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     120430b:	eb 7c                	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
     120430d:	48 8d 35 2e 34 18 ff 	lea    rsi,[rip+0xffffffffff18342e]        # 387742 <_ZTSSt12bad_any_cast@@Base-0x8a86>
     1204314:	4c 89 f7             	mov    rdi,r14
     1204317:	e8 33 75 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     120431c:	84 c0                	test   al,al
     120431e:	0f 84 9b 00 00 00    	je     12043bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49943>
     1204324:	48 8b 55 60          	mov    rdx,QWORD PTR [rbp+0x60]
     1204328:	48 89 df             	mov    rdi,rbx
     120432b:	4c 89 e6             	mov    rsi,r12
     120432e:	e8 6f 21 00 00       	call   12064a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ba26>
     1204333:	48 8b 7d 20          	mov    rdi,QWORD PTR [rbp+0x20]
     1204337:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
     120433a:	0f b6 c0             	movzx  eax,al
     120433d:	6a 02                	push   0x2
     120433f:	5e                   	pop    rsi
     1204340:	4c 89 ea             	mov    rdx,r13
     1204343:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
     1204348:	41 ff 54 c0 38       	call   QWORD PTR [r8+rax*8+0x38]
     120434d:	e8 75 65 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     1204352:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     1204359:	00 
     120435a:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     120435e:	48 8d 0d eb ea 77 00 	lea    rcx,[rip+0x77eaeb]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     1204365:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1204369:	0f 57 c0             	xorps  xmm0,xmm0
     120436c:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     120436f:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     1204373:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1204378:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     120437c:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     1204383:	00 
     1204384:	e8 07 9a 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1204389:	48 8b bc 24 f8 04 00 	mov    rdi,QWORD PTR [rsp+0x4f8]
     1204390:	00 

### 0x12044b0: mov    rdi,QWORD PTR [rbx+0x8]; FDE=(18891288, 18894558)
     120447a:	48 8d 05 09 21 00 00 	lea    rax,[rip+0x2109]        # 120658a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bb0e>
     1204481:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     1204485:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     1204489:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     120448e:	4c 89 ee             	mov    rsi,r13
     1204491:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1204496:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1204499:	49 81 c6 f0 11 00 00 	add    r14,0x11f0
     12044a0:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
     12044a5:	4c 89 f7             	mov    rdi,r14
     12044a8:	48 89 de             	mov    rsi,rbx
     12044ab:	e8 6c 53 8b ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     12044b0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     12044b4:	e8 cd 9f 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12044b9:	48 8d bc 24 50 09 00 	lea    rdi,[rsp+0x950]
     12044c0:	00 
     12044c1:	e8 3a 5e ff ff       	call   11fa300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f884>
     12044c6:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     12044cd:	00 
     12044ce:	e8 75 23 00 00       	call   1206848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bdcc>
     12044d3:	e9 be fe ff ff       	jmp    1204396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4991a>
     12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
     12044df:	48 89 df             	mov    rdi,rbx
     12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12044e7:	84 c0                	test   al,al
     12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
     12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     1204501:	00 
     1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1204511:	0f 57 c0             	xorps  xmm0,xmm0

### 0x12044eb: mov    rdi,QWORD PTR [rbp+0x8]; FDE=(18891288, 18894558)
     12044b9:	48 8d bc 24 50 09 00 	lea    rdi,[rsp+0x950]
     12044c0:	00 
     12044c1:	e8 3a 5e ff ff       	call   11fa300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f884>
     12044c6:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     12044cd:	00 
     12044ce:	e8 75 23 00 00       	call   1206848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bdcc>
     12044d3:	e9 be fe ff ff       	jmp    1204396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4991a>
     12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
     12044df:	48 89 df             	mov    rdi,rbx
     12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12044e7:	84 c0                	test   al,al
     12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
     12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     1204501:	00 
     1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1204511:	0f 57 c0             	xorps  xmm0,xmm0
     1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     120452b:	00 
     120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
     1204536:	48 8d 35 01 84 13 ff 	lea    rsi,[rip+0xffffffffff138401]        # 33c93e <_ZTSSt12bad_any_cast@@Base-0x5388a>
     120453d:	48 89 df             	mov    rdi,rbx
     1204540:	e8 0a 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     1204545:	84 c0                	test   al,al
     1204547:	74 7e                	je     12045c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49b4b>
     1204549:	49 89 de             	mov    r14,rbx

### 0x12049aa: mov    rbx,QWORD PTR [rbp+0x8]; FDE=(18891288, 18894558)
     1204981:	00 
     1204982:	48 89 df             	mov    rdi,rbx
     1204985:	4c 89 f6             	mov    rsi,r14
     1204988:	e8 2a 20 00 00       	call   12069b7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bf3b>
     120498d:	89 c3                	mov    ebx,eax
     120498f:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     1204996:	00 
     1204997:	e8 cc 4a 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
     120499c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     12049a1:	e8 c2 4a 47 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
     12049a6:	84 db                	test   bl,bl
     12049a8:	74 39                	je     12049e3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49f67>
     12049aa:	48 8b 5d 08          	mov    rbx,QWORD PTR [rbp+0x8]
     12049ae:	49 83 c6 48          	add    r14,0x48
     12049b2:	4c 89 f7             	mov    rdi,r14
     12049b5:	e8 f6 6d 0f 00       	call   12fb7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d34>
     12049ba:	48 8d 8c 24 e0 04 00 	lea    rcx,[rsp+0x4e0]
     12049c1:	00 
     12049c2:	48 89 01             	mov    QWORD PTR [rcx],rax
     12049c5:	88 51 08             	mov    BYTE PTR [rcx+0x8],dl
     12049c8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     12049cb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     12049d0:	48 89 de             	mov    rsi,rbx
     12049d3:	48 89 ca             	mov    rdx,rcx
     12049d6:	ff 50 48             	call   QWORD PTR [rax+0x48]
     12049d9:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     12049de:	e8 03 f4 92 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12049e3:	48 8b bc 24 c8 04 00 	mov    rdi,QWORD PTR [rsp+0x4c8]
     12049ea:	00 
     12049eb:	e8 96 9a 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12049f0:	e8 d2 5e 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12049f5:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     12049fc:	00 
     12049fd:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     1204a01:	48 8d 0d 48 e4 77 00 	lea    rcx,[rip+0x77e448]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     1204a08:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx

## Exact Skip Ad branch
     12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
     12044df:	48 89 df             	mov    rdi,rbx
     12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12044e7:	84 c0                	test   al,al
     12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
     12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     1204501:	00 
     1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1204511:	0f 57 c0             	xorps  xmm0,xmm0
     1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     120452b:	00 
     120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
