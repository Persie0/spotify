# Readiness source at owner+0x428

## Exact construction around ecee52

/tmp/f428/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000eced00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96116>:
  eced00:	4c 89 ef             	mov    rdi,r13
  eced03:	e8 ee ac 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  eced08:	48 8d ab b8 02 00 00 	lea    rbp,[rbx+0x2b8]
  eced0f:	48 89 ef             	mov    rdi,rbp
  eced12:	e8 df ac 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  eced17:	4c 8d b3 c8 02 00 00 	lea    r14,[rbx+0x2c8]
  eced1e:	4c 89 f7             	mov    rdi,r14
  eced21:	e8 d0 ac 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  eced26:	48 8d bb d8 02 00 00 	lea    rdi,[rbx+0x2d8]
  eced2d:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
  eced32:	e8 bf ac 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  eced37:	48 8d bb f0 02 00 00 	lea    rdi,[rbx+0x2f0]
  eced3e:	48 89 bc 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rdi
  eced45:	00 
  eced46:	48 8b b4 24 a0 01 00 	mov    rsi,QWORD PTR [rsp+0x1a0]
  eced4d:	00 
  eced4e:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
  eced53:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
  eced58:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
  eced5d:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
  eced62:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
  eced67:	e8 24 b5 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  eced6c:	48 8b b4 24 a8 01 00 	mov    rsi,QWORD PTR [rsp+0x1a8]
  eced73:	00 
  eced74:	48 8d bb 20 03 00 00 	lea    rdi,[rbx+0x320]
  eced7b:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
  eced82:	00 
  eced83:	e8 08 b5 ba ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  eced88:	4c 8b b4 24 b8 01 00 	mov    r14,QWORD PTR [rsp+0x1b8]
  eced8f:	00 
  eced90:	48 8b b4 24 b0 01 00 	mov    rsi,QWORD PTR [rsp+0x1b0]
  eced97:	00 
  eced98:	48 8d bb 50 03 00 00 	lea    rdi,[rbx+0x350]
  eced9f:	ba b0 00 00 00       	mov    edx,0xb0
  eceda4:	e8 27 0d 92 00       	call   17efad0 <memcpy@plt>
  eceda9:	4c 89 b3 00 04 00 00 	mov    QWORD PTR [rbx+0x400],r14
  ecedb0:	48 8b 8c 24 c0 01 00 	mov    rcx,QWORD PTR [rsp+0x1c0]
  ecedb7:	00 
  ecedb8:	48 8b 01             	mov    rax,QWORD PTR [rcx]
  ecedbb:	48 89 83 08 04 00 00 	mov    QWORD PTR [rbx+0x408],rax
  ecedc2:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  ecedc6:	48 89 83 10 04 00 00 	mov    QWORD PTR [rbx+0x410],rax
  ecedcd:	48 85 c0             	test   rax,rax
  ecedd0:	74 05                	je     ecedd7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x961ed>
  ecedd2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ecedd7:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
  ecedde:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
  ecede3:	e8 0e ac 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  ecede8:	bf 98 00 00 00       	mov    edi,0x98
  eceded:	e8 0e f1 91 00       	call   17edf00 <_Znwm@plt>
  ecedf2:	49 89 c6             	mov    r14,rax
  ecedf5:	4c 8b bc 24 d0 01 00 	mov    r15,QWORD PTR [rsp+0x1d0]
  ecedfc:	00 
  ecedfd:	48 8b 8c 24 c8 01 00 	mov    rcx,QWORD PTR [rsp+0x1c8]
  ecee04:	00 
  ecee05:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  ecee09:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  ecee0c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
  ecee10:	48 85 c0             	test   rax,rax
  ecee13:	74 05                	je     ecee1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x96230>
  ecee15:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ecee1a:	48 8d 83 28 04 00 00 	lea    rax,[rbx+0x428]
  ecee21:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
  ecee28:	00 
  ecee29:	49 8d 46 18          	lea    rax,[r14+0x18]
  ecee2d:	0f 57 c0             	xorps  xmm0,xmm0
  ecee30:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
  ecee35:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  ecee39:	49 8d 46 30          	lea    rax,[r14+0x30]
  ecee3d:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
  ecee42:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
  ecee46:	4c 89 f7             	mov    rdi,r14
  ecee49:	48 83 c7 40          	add    rdi,0x40
  ecee4d:	e8 3c 94 c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  ecee52:	4c 89 b3 28 04 00 00 	mov    QWORD PTR [rbx+0x428],r14
  ecee59:	48 8d bb 30 04 00 00 	lea    rdi,[rbx+0x430]
  ecee60:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
  ecee65:	e8 8c ab 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  ecee6a:	45 31 f6             	xor    r14d,r14d
  ecee6d:	44 88 b3 40 04 00 00 	mov    BYTE PTR [rbx+0x440],r14b
  ecee74:	48 8d 83 48 04 00 00 	lea    rax,[rbx+0x448]
  ecee7b:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  ecee82:	00 
  ecee83:	44 88 b3 78 04 00 00 	mov    BYTE PTR [rbx+0x478],r14b
  ecee8a:	44 88 b3 80 04 00 00 	mov    BYTE PTR [rbx+0x480],r14b
  ecee91:	44 88 b3 98 04 00 00 	mov    BYTE PTR [rbx+0x498],r14b
  ecee98:	44 88 b3 d8 04 00 00 	mov    BYTE PTR [rbx+0x4d8],r14b
  ecee9f:	44 88 b3 30 05 00 00 	mov    BYTE PTR [rbx+0x530],r14b
  eceea6:	83 a3 38 05 00 00 00 	and    DWORD PTR [rbx+0x538],0x0
  eceead:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
  eceeb4:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
  eceebb:	00 
  eceebc:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
  eceec3:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
  eceeca:	00 
  eceecb:	44 88 b3 40 05 00 00 	mov    BYTE PTR [rbx+0x540],r14b
  eceed2:	44 88 b3 98 05 00 00 	mov    BYTE PTR [rbx+0x598],r14b
  eceed9:	83 a3 a0 05 00 00 00 	and    DWORD PTR [rbx+0x5a0],0x0

## Exact caller source around e95a7d

/tmp/f428/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000e95980 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cd96>:
  e95980:	f0 48 ff 00          	lock inc QWORD PTR [rax]
  e95984:	48 8b 83 78 05 00 00 	mov    rax,QWORD PTR [rbx+0x578]
  e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  e95990:	48 8d 05 49 8f 97 00 	lea    rax,[rip+0x978f49]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e95997:	48 89 84 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rax
  e9599e:	00 
  e9599f:	4c 89 b4 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r14
  e959a6:	00 
  e959a7:	4c 89 ac 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r13
  e959ae:	00 
  e959af:	4c 8b b3 98 03 00 00 	mov    r14,QWORD PTR [rbx+0x398]
  e959b6:	4c 8b ab a0 03 00 00 	mov    r13,QWORD PTR [rbx+0x3a0]
  e959bd:	48 8b 83 a8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3a8]
  e959c4:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
  e959cb:	00 
  e959cc:	48 8b 83 b0 03 00 00 	mov    rax,QWORD PTR [rbx+0x3b0]
  e959d3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  e959da:	00 
  e959db:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
  e959e2:	48 89 84 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rax
  e959e9:	00 
  e959ea:	48 8d bc 24 e0 0d 00 	lea    rdi,[rsp+0xde0]
  e959f1:	00 
  e959f2:	48 8d b4 24 f0 0e 00 	lea    rsi,[rsp+0xef0]
  e959f9:	00 
  e959fa:	e8 91 48 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e959ff:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
  e95a06:	00 
  e95a07:	48 8d b4 24 c0 0e 00 	lea    rsi,[rsp+0xec0]
  e95a0e:	00 
  e95a0f:	e8 7c 48 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e95a14:	48 8b 83 b0 02 00 00 	mov    rax,QWORD PTR [rbx+0x2b0]
  e95a1b:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
  e95a22:	00 
  e95a23:	48 8b b4 24 f0 02 00 	mov    rsi,QWORD PTR [rsp+0x2f0]
  e95a2a:	00 
  e95a2b:	48 8b 94 24 f8 02 00 	mov    rdx,QWORD PTR [rsp+0x2f8]
  e95a32:	00 
  e95a33:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
  e95a3a:	00 
  e95a3b:	e8 de 49 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
  e95a40:	48 8d 4d 20          	lea    rcx,[rbp+0x20]
  e95a44:	48 8b 83 40 02 00 00 	mov    rax,QWORD PTR [rbx+0x240]
  e95a4b:	0f 10 83 38 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x238]
  e95a52:	0f 29 84 24 e0 02 00 	movaps XMMWORD PTR [rsp+0x2e0],xmm0
  e95a59:	00 
  e95a5a:	48 85 c0             	test   rax,rax
  e95a5d:	74 05                	je     e95a64 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ce7a>
  e95a5f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e95a64:	66 48 0f 6e cd       	movq   xmm1,rbp
  e95a69:	66 48 0f 6e c1       	movq   xmm0,rcx
  e95a6e:	48 8b 83 18 04 00 00 	mov    rax,QWORD PTR [rbx+0x418]
  e95a75:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
  e95a7c:	00 
  e95a7d:	48 8b 83 28 04 00 00 	mov    rax,QWORD PTR [rbx+0x428]
  e95a84:	48 89 84 24 28 02 00 	mov    QWORD PTR [rsp+0x228],rax
  e95a8b:	00 
  e95a8c:	48 8b 43 48          	mov    rax,QWORD PTR [rbx+0x48]
  e95a90:	48 89 84 24 20 02 00 	mov    QWORD PTR [rsp+0x220],rax
  e95a97:	00 
  e95a98:	48 8b 83 40 04 00 00 	mov    rax,QWORD PTR [rbx+0x440]
  e95a9f:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax
  e95aa6:	00 
  e95aa7:	0f 57 d2             	xorps  xmm2,xmm2
  e95aaa:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
  e95ab1:	00 
  e95ab2:	74 18                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
  e95ab4:	0f 10 93 58 04 00 00 	movups xmm2,XMMWORD PTR [rbx+0x458]
  e95abb:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
  e95ac2:	48 85 c0             	test   rax,rax
  e95ac5:	74 05                	je     e95acc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cee2>
  e95ac7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e95acc:	4c 89 ac 24 48 02 00 	mov    QWORD PTR [rsp+0x248],r13
  e95ad3:	00 
  e95ad4:	4c 89 b4 24 20 01 00 	mov    QWORD PTR [rsp+0x120],r14
  e95adb:	00 
  e95adc:	0f 29 94 24 c0 01 00 	movaps XMMWORD PTR [rsp+0x1c0],xmm2
  e95ae3:	00 
  e95ae4:	4c 89 a4 24 28 01 00 	mov    QWORD PTR [rsp+0x128],r12
  e95aeb:	00 
  e95aec:	48 89 8c 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rcx
  e95af3:	00 
  e95af4:	48 83 c5 08          	add    rbp,0x8
  e95af8:	66 0f 6c c1          	punpcklqdq xmm0,xmm1
  e95afc:	48 8d b3 b0 01 00 00 	lea    rsi,[rbx+0x1b0]
  e95b03:	48 8d 43 30          	lea    rax,[rbx+0x30]
  e95b07:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
  e95b0e:	00 
  e95b0f:	48                   	rex.W

## ecee FDE prologue neighborhood

/tmp/f428/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000ece57c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95992>:
  ece57c:	55                   	push   rbp
  ece57d:	41 57                	push   r15
  ece57f:	41 56                	push   r14
  ece581:	41 55                	push   r13
  ece583:	41 54                	push   r12
  ece585:	53                   	push   rbx
  ece586:	48 81 ec 68 01 00 00 	sub    rsp,0x168
  ece58d:	4d 89 cc             	mov    r12,r9
  ece590:	4d 89 c5             	mov    r13,r8
  ece593:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
  ece598:	48 89 d5             	mov    rbp,rdx
  ece59b:	49 89 f6             	mov    r14,rsi
  ece59e:	48 89 fb             	mov    rbx,rdi
  ece5a1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ece5a8:	00 00 
  ece5aa:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
  ece5b1:	00 
  ece5b2:	48 8d 35 af 61 50 ff 	lea    rsi,[rip+0xffffffffff5061af]        # 3d4768 <_ZTSN5boost17bad_function_callE@@Base+0x1aae>
  ece5b9:	e8 34 84 ff ff       	call   ec69f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8de08>
  ece5be:	48 8d 05 d3 5e 96 00 	lea    rax,[rip+0x965ed3]        # 1834498 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6430>
  ece5c5:	48 89 03             	mov    QWORD PTR [rbx],rax
  ece5c8:	bf 30 01 00 00       	mov    edi,0x130
  ece5cd:	e8 2e f9 91 00       	call   17edf00 <_Znwm@plt>
  ece5d2:	49 89 c7             	mov    r15,rax
  ece5d5:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
  ece5dc:	00 
  ece5dd:	48 89 c7             	mov    rdi,rax
  ece5e0:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
  ece5e5:	4c 89 f6             	mov    rsi,r14
  ece5e8:	48 89 ea             	mov    rdx,rbp
  ece5eb:	e8 50 8b 01 00       	call   ee7140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xae556>
  ece5f0:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
  ece5f5:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12
  ece5fa:	4c 89 bb c8 01 00 00 	mov    QWORD PTR [rbx+0x1c8],r15
  ece601:	48 8d bb d0 01 00 00 	lea    rdi,[rbx+0x1d0]
  ece608:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
  ece60d:	e8 e4 b3 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  ece612:	bf 30 01 00 00       	mov    edi,0x130
  ece617:	e8 e4 f8 91 00       	call   17edf00 <_Znwm@plt>
  ece61c:	49 89 c7             	mov    r15,rax
  ece61f:	66 c7 00 7e 00       	mov    WORD PTR [rax],0x7e
  ece624:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  ece629:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
  ece62d:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
  ece632:	49 89 6f 10          	mov    QWORD PTR [r15+0x10],rbp
  ece636:	4d 8d 6f 18          	lea    r13,[r15+0x18]
  ece63a:	4c 89 ef             	mov    rdi,r13
  ece63d:	e8 4c 9c c5 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  ece642:	49 8d 6f 70          	lea    rbp,[r15+0x70]
  ece646:	0f 57 c0             	xorps  xmm0,xmm0
  ece649:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
  ece650:	00 
  ece651:	41 0f 11 47 70       	movups XMMWORD PTR [r15+0x70],xmm0
  ece656:	b8 00 00 80 3f       	mov    eax,0x3f800000
  ece65b:	41 89 87 90 00 00 00 	mov    DWORD PTR [r15+0x90],eax
  ece662:	41 c6 87 98 00 00 00 	mov    BYTE PTR [r15+0x98],0x1
  ece669:	01 
  ece66a:	4d 8d a7 a0 00 00 00 	lea    r12,[r15+0xa0]
  ece671:	4d 89 a7 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],r12
  ece678:	4d 89 a7 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],r12
  ece67f:	41 0f 11 87 b0 00 00 	movups XMMWORD PTR [r15+0xb0],xmm0
  ece686:	00 
  ece687:	49 83 a7 d0 00 00 00 	and    QWORD PTR [r15+0xd0],0x0
  ece68e:	00 
  ece68f:	41 0f 11 87 c0 00 00 	movups XMMWORD PTR [r15+0xc0],xmm0
  ece696:	00 
  ece697:	41 89 87 d8 00 00 00 	mov    DWORD PTR [r15+0xd8],eax
  ece69e:	6a 64                	push   0x64
  ece6a0:	58                   	pop    rax
  ece6a1:	49 89 87 e0 00 00 00 	mov    QWORD PTR [r15+0xe0],rax
  ece6a8:	49 89 87 e8 00 00 00 	mov    QWORD PTR [r15+0xe8],rax
  ece6af:	49 83 a7 f0 00 00 00 	and    QWORD PTR [r15+0xf0],0x0
  ece6b6:	00 
  ece6b7:	48 8d 05 ec b7 01 00 	lea    rax,[rip+0x1b7ec]        # ee9eaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb12c0>
  ece6be:	49 89 87 f8 00 00 00 	mov    QWORD PTR [r15+0xf8],rax
  ece6c5:	4c 89 ff             	mov    rdi,r15
  ece6c8:	48 81 c7 00 01 00 00 	add    rdi,0x100
  ece6cf:	48 8d 35 fb 7a 48 ff 	lea    rsi,[rip+0xffffffffff487afb]        # 3561d1 <_ZTSSt12bad_any_cast@@Base-0x39ff7>
  ece6d6:	6a 15                	push   0x15
  ece6d8:	5a                   	pop    rdx
  ece6d9:	e8 3c e3 bc ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  ece6de:	48 8b 8c 24 d8 01 00 	mov    rcx,QWORD PTR [rsp+0x1d8]
  ece6e5:	00 
  ece6e6:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
  ece6ea:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
  ece6ed:	41 0f 11 87 18 01 00 	movups XMMWORD PTR [r15+0x118],xmm0
  ece6f4:	00 
  ece6f5:	48 85 c0             	test   rax,rax
  ece6f8:	74 05                	je     ece6ff <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95b15>
  ece6fa:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  ece6ff:	49 83 a7 28 01 00 00 	and    QWORD PTR [r15+0x128],0x0
  ece706:	00 
  ece707:	4c 89 bb e0 01 00 00 	mov    QWORD PTR [rbx+0x1e0],r15
  ece70e:	4c 8d bb e8 01 00 00 	lea    r15,[rbx+0x1e8]
  ece715:	4c 89 ff             	mov    rdi,r15
  ece718:	e8 d9 b2 90 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  ece71d:	48                   	rex.W
  ece71e:	8b                   	.byte 0x8b
  ece71f:	4c                   	rex.WR
