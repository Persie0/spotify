# Ads runtime object vs Skip Ad readiness-source identity

Known:
- registry ID 4 = AdsSetupImpl
- b85f7e returns AdsSetupImpl service instance
- service +0x28 returns object whose +0x1b8 is sampled for readiness
- signal-adapter constructor input uses +0x10, +0x1b2, +0x1b5, and nearby fields

## AdsSetupImpl factory 0xb86086 FDE=(12083334, 12091202)
### 0xb861ee: call   17edf00 <_Znwm@plt>
      b861d4:	00 
      b861d5:	48 89 de             	mov    rsi,rbx
      b861d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b861db:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      b861e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b861e3:	ff 50 40             	call   QWORD PTR [rax+0x40]
      b861e6:	49 89 c7             	mov    r15,rax
      b861e9:	bf 40 03 00 00       	mov    edi,0x340
      b861ee:	e8 0d 7d c6 00       	call   17edf00 <_Znwm@plt>
      b861f3:	48 89 c3             	mov    rbx,rax
      b861f6:	66 0f ef c0          	pxor   xmm0,xmm0
      b861fa:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b861ff:	48 8d 05 62 72 c7 00 	lea    rax,[rip+0xc77262]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      b86206:	48 89 03             	mov    QWORD PTR [rbx],rax
      b86209:	48 8d 05 00 7e c8 00 	lea    rax,[rip+0xc87e00]        # 180e010 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3cd0>
      b86210:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b86214:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
      b86218:	4c 8d 7b 28          	lea    r15,[rbx+0x28]
      b8621c:	4c 89 ff             	mov    rdi,r15
      b8621f:	e8 d2 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86224:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
      b86228:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
      b8622d:	e8 c4 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86232:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
      b86236:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
      b8623b:	e8 b6 37 c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>

### 0xb86690: call   17edf00 <_Znwm@plt>
      b86674:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b86677:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b8667a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      b8667d:	48 89 c7             	mov    rdi,rax
      b86680:	ff 51 40             	call   QWORD PTR [rcx+0x40]
      b86683:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
      b8668a:	00 
      b8668b:	bf 70 03 00 00       	mov    edi,0x370
      b86690:	e8 6b 78 c6 00       	call   17edf00 <_Znwm@plt>
      b86695:	49 89 c6             	mov    r14,rax
      b86698:	0f 28 84 24 80 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x180]
      b8669f:	00 
      b866a0:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
      b866a5:	0f 57 c0             	xorps  xmm0,xmm0
      b866a8:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
      b866af:	00 
      b866b0:	f3 0f 7e 84 24 a0 00 	movq   xmm0,QWORD PTR [rsp+0xa0]
      b866b7:	00 00 
      b866b9:	f3 0f 7e 4c 24 40    	movq   xmm1,QWORD PTR [rsp+0x40]
      b866bf:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      b866c3:	66 0f 7f 8c 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm1
      b866ca:	00 00 
      b866cc:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b866d1:	48 89 84 24 d0 04 00 	mov    QWORD PTR [rsp+0x4d0],rax
      b866d8:	00 
      b866d9:	48 8d 05 84 5d ef ff 	lea    rax,[rip+0xffffffffffef5d84]        # a7c464 <JNI_OnUnload@@Base+0x3d31>

### 0xb868a5: call   17edf00 <_Znwm@plt>
      b86889:	48 8d 9c 24 d8 02 00 	lea    rbx,[rsp+0x2d8]
      b86890:	00 
      b86891:	48 89 df             	mov    rdi,rbx
      b86894:	4c 89 ee             	mov    rsi,r13
      b86897:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8689a:	44 8b 23             	mov    r12d,DWORD PTR [rbx]
      b8689d:	8b 5b 0c             	mov    ebx,DWORD PTR [rbx+0xc]
      b868a0:	bf 80 00 00 00       	mov    edi,0x80
      b868a5:	e8 56 76 c6 00       	call   17edf00 <_Znwm@plt>
      b868aa:	41 ff cc             	dec    r12d
      b868ad:	41 83 fc fe          	cmp    r12d,0xfffffffe
      b868b1:	0f 92 c2             	setb   dl
      b868b4:	20 da                	and    dl,bl
      b868b6:	66 0f ef c0          	pxor   xmm0,xmm0
      b868ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b868bf:	48 8d 0d 02 45 c8 00 	lea    rcx,[rip+0xc84502]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
      b868c6:	48 89 08             	mov    QWORD PTR [rax],rcx
      b868c9:	48 89 c7             	mov    rdi,rax
      b868cc:	48 83 c7 20          	add    rdi,0x20
      b868d0:	48 8d 0d 79 74 c8 00 	lea    rcx,[rip+0xc87479]        # 180dd50 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a10>
      b868d7:	48 89 8c 24 70 06 00 	mov    QWORD PTR [rsp+0x670],rcx
      b868de:	00 
      b868df:	4c 89 ac 24 78 06 00 	mov    QWORD PTR [rsp+0x678],r13
      b868e6:	00 
      b868e7:	4c 89 bc 24 90 06 00 	mov    QWORD PTR [rsp+0x690],r15
      b868ee:	00 

### 0xb86939: call   17edf00 <_Znwm@plt>
      b8691e:	e8 05 4e ef ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
      b86923:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
      b86928:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b8692b:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
      b86930:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b86933:	49 89 c7             	mov    r15,rax
      b86936:	6a 50                	push   0x50
      b86938:	5f                   	pop    rdi
      b86939:	e8 c2 75 c6 00       	call   17edf00 <_Znwm@plt>
      b8693e:	66 0f ef c0          	pxor   xmm0,xmm0
      b86942:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b86947:	48 8d 0d 82 25 cf 00 	lea    rcx,[rip+0xcf2582]        # 1878ed0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355b8>
      b8694e:	48 89 08             	mov    QWORD PTR [rax],rcx
      b86951:	48 8d 0d b0 25 cf 00 	lea    rcx,[rip+0xcf25b0]        # 1878f08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x355f0>
      b86958:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
      b8695c:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
      b86960:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
      b86965:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
      b8696a:	c7 40 48 00 00 80 3f 	mov    DWORD PTR [rax+0x48],0x3f800000
      b86971:	66 48 0f 6e c0       	movq   xmm0,rax
      b86976:	48 83 c0 18          	add    rax,0x18
      b8697a:	66 48 0f 6e c8       	movq   xmm1,rax
      b8697f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      b86983:	49 8b be 28 03 00 00 	mov    rdi,QWORD PTR [r14+0x328]
      b8698a:	66 41 0f 7f 8e 20 03 	movdqa XMMWORD PTR [r14+0x320],xmm1
      b86991:	00 00 

### 0xb869a4: call   17edf00 <_Znwm@plt>
      b8697f:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      b86983:	49 8b be 28 03 00 00 	mov    rdi,QWORD PTR [r14+0x328]
      b8698a:	66 41 0f 7f 8e 20 03 	movdqa XMMWORD PTR [r14+0x320],xmm1
      b86991:	00 00 
      b86993:	e8 ee 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86998:	31 ff                	xor    edi,edi
      b8699a:	e8 e7 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b8699f:	bf 38 01 00 00       	mov    edi,0x138
      b869a4:	e8 57 75 c6 00       	call   17edf00 <_Znwm@plt>
      b869a9:	49 89 c7             	mov    r15,rax
      b869ac:	66 0f ef c0          	pxor   xmm0,xmm0
      b869b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b869b5:	48 8d 05 ac 6a c7 00 	lea    rax,[rip+0xc76aac]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      b869bc:	49 89 07             	mov    QWORD PTR [r15],rax
      b869bf:	49 8d 5f 18          	lea    rbx,[r15+0x18]
      b869c3:	48 8d 05 be 38 cf 00 	lea    rax,[rip+0xcf38be]        # 187a288 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36970>
      b869ca:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      b869ce:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      b869d5:	00 
      b869d6:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      b869da:	49 8d 7f 28          	lea    rdi,[r15+0x28]
      b869de:	e8 69 e3 94 00       	call   14d4d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2d0>
      b869e3:	49 8d bf 80 00 00 00 	lea    rdi,[r15+0x80]
      b869ea:	e8 5d e3 94 00       	call   14d4d4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x31a2d0>
      b869ef:	4c 89 ff             	mov    rdi,r15
      b869f2:	48 81 c7 d8 00 00 00 	add    rdi,0xd8

### 0xb86a2a: call   17edf00 <_Znwm@plt>
      b86a06:	49 89 9e 38 03 00 00 	mov    QWORD PTR [r14+0x338],rbx
      b86a0d:	49 8b be 40 03 00 00 	mov    rdi,QWORD PTR [r14+0x340]
      b86a14:	4d 89 be 40 03 00 00 	mov    QWORD PTR [r14+0x340],r15
      b86a1b:	e8 66 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a20:	31 ff                	xor    edi,edi
      b86a22:	e8 5f 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a27:	6a 20                	push   0x20
      b86a29:	5f                   	pop    rdi
      b86a2a:	e8 d1 74 c6 00       	call   17edf00 <_Znwm@plt>
      b86a2f:	49 89 c7             	mov    r15,rax
      b86a32:	48 89 c7             	mov    rdi,rax
      b86a35:	e8 bc 2f c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86a3a:	66 0f ef c0          	pxor   xmm0,xmm0
      b86a3e:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      b86a44:	4d 8b a6 38 03 00 00 	mov    r12,QWORD PTR [r14+0x338]
      b86a4b:	4c 89 bc 24 d8 02 00 	mov    QWORD PTR [rsp+0x2d8],r15
      b86a52:	00 
      b86a53:	49 8b 86 28 03 00 00 	mov    rax,QWORD PTR [r14+0x328]
      b86a5a:	f3 41 0f 6f 86 20 03 	movdqu xmm0,XMMWORD PTR [r14+0x320]
      b86a61:	00 00 
      b86a63:	f3 0f 7f 84 24 e0 02 	movdqu XMMWORD PTR [rsp+0x2e0],xmm0
      b86a6a:	00 00 
      b86a6c:	48 85 c0             	test   rax,rax
      b86a6f:	74 05                	je     b86a76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3a16>
      b86a71:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86a76:	48 8d 35 1b d2 f6 ff 	lea    rsi,[rip+0xfffffffffff6d21b]        # af3c98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40c38>

### 0xb86b19: call   17edf00 <_Znwm@plt>
      b86afe:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      b86b05:	00 
      b86b06:	4c 89 fe             	mov    rsi,r15
      b86b09:	e8 c0 15 00 00       	call   b880ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd506e>
      b86b0e:	48 89 df             	mov    rdi,rbx
      b86b11:	e8 e0 15 00 00       	call   b880f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5096>
      b86b16:	6a 68                	push   0x68
      b86b18:	5f                   	pop    rdi
      b86b19:	e8 e2 73 c6 00       	call   17edf00 <_Znwm@plt>
      b86b1e:	49 89 c7             	mov    r15,rax
      b86b21:	66 0f ef c0          	pxor   xmm0,xmm0
      b86b25:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      b86b2a:	48 8d 05 67 72 c8 00 	lea    rax,[rip+0xc87267]        # 180dd98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a58>
      b86b31:	49 89 07             	mov    QWORD PTR [r15],rax
      b86b34:	49 8d 5f 18          	lea    rbx,[r15+0x18]
      b86b38:	4c 89 ff             	mov    rdi,r15
      b86b3b:	48 83 c7 28          	add    rdi,0x28
      b86b3f:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      b86b45:	48 8d b4 24 d0 04 00 	lea    rsi,[rsp+0x4d0]
      b86b4c:	00 
      b86b4d:	e8 ac 15 00 00       	call   b880fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd509e>
      b86b52:	49 83 67 48 00       	and    QWORD PTR [r15+0x48],0x0
      b86b57:	49 83 67 58 00       	and    QWORD PTR [r15+0x58],0x0
      b86b5c:	49 89 9e 48 03 00 00 	mov    QWORD PTR [r14+0x348],rbx
      b86b63:	49 8b be 50 03 00 00 	mov    rdi,QWORD PTR [r14+0x350]
      b86b6a:	4d 89 be 50 03 00 00 	mov    QWORD PTR [r14+0x350],r15

### 0xb87349: call   17edf00 <_Znwm@plt>
      b8732a:	00 
      b8732b:	44 88 bc 24 b0 02 00 	mov    BYTE PTR [rsp+0x2b0],r15b
      b87332:	00 
      b87333:	48 89 9c 24 b8 02 00 	mov    QWORD PTR [rsp+0x2b8],rbx
      b8733a:	00 
      b8733b:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
      b87342:	00 00 
      b87344:	bf 88 00 00 00       	mov    edi,0x88
      b87349:	e8 b2 6b c6 00       	call   17edf00 <_Znwm@plt>
      b8734e:	48 8d 0d 7b 6a c8 00 	lea    rcx,[rip+0xc86a7b]        # 180ddd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a90>
      b87355:	48 89 08             	mov    QWORD PTR [rax],rcx
      b87358:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b8735c:	48 8b 8c 24 48 02 00 	mov    rcx,QWORD PTR [rsp+0x248]
      b87363:	00 
      b87364:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      b87368:	48 85 c9             	test   rcx,rcx
      b8736b:	74 05                	je     b87372 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4312>
      b8736d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87372:	0f 10 84 24 50 02 00 	movups xmm0,XMMWORD PTR [rsp+0x250]
      b87379:	00 
      b8737a:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      b8737e:	48 8b 8c 24 60 02 00 	mov    rcx,QWORD PTR [rsp+0x260]
      b87385:	00 
      b87386:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      b8738a:	48 85 c9             	test   rcx,rcx
      b8738d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]

### 0xb874f0: call   17edf00 <_Znwm@plt>
      b874d1:	00 
      b874d2:	44 88 bc 24 30 02 00 	mov    BYTE PTR [rsp+0x230],r15b
      b874d9:	00 
      b874da:	48 89 9c 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rbx
      b874e1:	00 
      b874e2:	48 83 a4 24 30 06 00 	and    QWORD PTR [rsp+0x630],0x0
      b874e9:	00 00 
      b874eb:	bf 88 00 00 00       	mov    edi,0x88
      b874f0:	e8 0b 6a c6 00       	call   17edf00 <_Znwm@plt>
      b874f5:	48 8d 0d 64 69 c8 00 	lea    rcx,[rip+0xc86964]        # 180de60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b20>
      b874fc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b874ff:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b87503:	48 8b 8c 24 c8 01 00 	mov    rcx,QWORD PTR [rsp+0x1c8]
      b8750a:	00 
      b8750b:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      b8750f:	48 85 c9             	test   rcx,rcx
      b87512:	74 05                	je     b87519 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44b9>
      b87514:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87519:	0f 10 84 24 d0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1d0]
      b87520:	00 
      b87521:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      b87525:	48 8b 8c 24 e0 01 00 	mov    rcx,QWORD PTR [rsp+0x1e0]
      b8752c:	00 
      b8752d:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      b87531:	48 85 c9             	test   rcx,rcx
      b87534:	74 05                	je     b8753b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44db>

### 0xb876b2: call   17edf00 <_Znwm@plt>
      b8769a:	00 
      b8769b:	48 89 df             	mov    rdi,rbx
      b8769e:	4c 89 e6             	mov    rsi,r12
      b876a1:	e8 ea 2b ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b876a6:	48 83 a4 24 00 06 00 	and    QWORD PTR [rsp+0x600],0x0
      b876ad:	00 00 
      b876af:	6a 70                	push   0x70
      b876b1:	5f                   	pop    rdi
      b876b2:	e8 49 68 c6 00       	call   17edf00 <_Znwm@plt>
      b876b7:	49 89 c7             	mov    r15,rax
      b876ba:	48 8d 84 24 90 05 00 	lea    rax,[rsp+0x590]
      b876c1:	00 
      b876c2:	48 8d 0d df 67 c8 00 	lea    rcx,[rip+0xc867df]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68>
      b876c9:	49 89 0f             	mov    QWORD PTR [r15],rcx
      b876cc:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      b876d0:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
      b876d4:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
      b876d9:	48 85 c9             	test   rcx,rcx
      b876dc:	74 05                	je     b876e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4683>
      b876de:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b876e3:	0f 28 84 24 90 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x590]
      b876ea:	00 
      b876eb:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      b876f0:	0f 57 c0             	xorps  xmm0,xmm0
      b876f3:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      b876f6:	66 0f 6f 8c 24 a0 05 	movdqa xmm1,XMMWORD PTR [rsp+0x5a0]

### 0xb87798: call   17edf00 <_Znwm@plt>
      b8777d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b87782:	48 8d 9c 24 20 05 00 	lea    rbx,[rsp+0x520]
      b87789:	00 
      b8778a:	48 89 df             	mov    rdi,rbx
      b8778d:	4c 89 e6             	mov    rsi,r12
      b87790:	e8 fb 2a ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b87795:	6a 70                	push   0x70
      b87797:	5f                   	pop    rdi
      b87798:	e8 63 67 c6 00       	call   17edf00 <_Znwm@plt>
      b8779d:	49 89 c4             	mov    r12,rax
      b877a0:	48 8d 84 24 00 05 00 	lea    rax,[rsp+0x500]
      b877a7:	00 
      b877a8:	48 8d 0d 89 67 c8 00 	lea    rcx,[rip+0xc86789]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8>
      b877af:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
      b877b3:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      b877b7:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
      b877bb:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
      b877c1:	48 85 c9             	test   rcx,rcx
      b877c4:	74 05                	je     b877cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd476b>
      b877c6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b877cb:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
      b877d2:	00 
      b877d3:	66 41 0f 6f 47 10    	movdqa xmm0,XMMWORD PTR [r15+0x10]
      b877d9:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      b877e0:	66 0f ef c0          	pxor   xmm0,xmm0
      b877e4:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0

## Readiness/signal setup FDE around 0xef9217: (15700428, 15722027)
### Entry/prologue
      ef91cc:	55                   	push   rbp
      ef91cd:	41 57                	push   r15
      ef91cf:	41 56                	push   r14
      ef91d1:	41 55                	push   r13
      ef91d3:	41 54                	push   r12
      ef91d5:	53                   	push   rbx
      ef91d6:	48 81 ec f8 0a 00 00 	sub    rsp,0xaf8
      ef91dd:	49 89 fc             	mov    r12,rdi
      ef91e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef91e7:	00 00 
      ef91e9:	48 89 84 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],rax
      ef91f0:	00 
      ef91f1:	0f 57 c0             	xorps  xmm0,xmm0
      ef91f4:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ef91f7:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ef91fb:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef9203:	48 8d 47 30          	lea    rax,[rdi+0x30]
      ef9207:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
      ef920b:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      ef920f:	66 0f 6f 86 50 01 00 	movdqa xmm0,XMMWORD PTR [rsi+0x150]
      ef9216:	00 
      ef9217:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
      ef921c:	48 8b 86 58 01 00 00 	mov    rax,QWORD PTR [rsi+0x158]
      ef9223:	48 85 c0             	test   rax,rax
      ef9226:	74 05                	je     ef922d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0643>
      ef9228:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef922d:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9232:	8a 80 b7 01 00 00    	mov    al,BYTE PTR [rax+0x1b7]
      ef9238:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
      ef923f:	00 00 
      ef9241:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1
      ef9248:	4d 85 f6             	test   r14,r14
      ef924b:	74 05                	je     ef9252 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0668>
      ef924d:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      ef9252:	66 0f 7f 84 24 b0 00 	movdqa XMMWORD PTR [rsp+0xb0],xmm0
      ef9259:	00 00 
      ef925b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      ef9260:	4c 8b 79 60          	mov    r15,QWORD PTR [rcx+0x60]
      ef9264:	4c 89 bc 24 20 07 00 	mov    QWORD PTR [rsp+0x720],r15
      ef926b:	00 
      ef926c:	48 8b 59 68          	mov    rbx,QWORD PTR [rcx+0x68]
      ef9270:	48 89 9c 24 28 07 00 	mov    QWORD PTR [rsp+0x728],rbx
      ef9277:	00 
      ef9278:	48 85 db             	test   rbx,rbx
      ef927b:	74 05                	je     ef9282 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0698>
      ef927d:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef9282:	c6 84 24 30 07 00 00 	mov    BYTE PTR [rsp+0x730],0x0
      ef9289:	00 
      ef928a:	88 84 24 31 07 00 00 	mov    BYTE PTR [rsp+0x731],al
      ef9291:	48 83 a4 24 e0 0a 00 	and    QWORD PTR [rsp+0xae0],0x0
      ef9298:	00 00 
      ef929a:	6a 30                	push   0x30
      ef929c:	5f                   	pop    rdi
      ef929d:	4c 89 64 24 68       	mov    QWORD PTR [rsp+0x68],r12
      ef92a2:	e8 59 4c 8f 00       	call   17edf00 <_Znwm@plt>
      ef92a7:	48 8d 0d aa f4 99 00 	lea    rcx,[rip+0x99f4aa]        # 1898758 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x5698>
      ef92ae:	48 89 08             	mov    QWORD PTR [rax],rcx
      ef92b1:	66 0f 6f 84 24 b0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xb0]
      ef92b8:	00 00 
      ef92ba:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef92bf:	66 0f ef c0          	pxor   xmm0,xmm0
      ef92c3:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
      ef92ca:	00 00 
      ef92cc:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
      ef92d0:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      ef92d4:	48 85 db             	test   rbx,rbx
      ef92d7:	74 05                	je     ef92de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc06f4>
      ef92d9:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      ef92de:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      ef92e5:	00 
      ef92e6:	0f b7 4f 20          	movzx  ecx,WORD PTR [rdi+0x20]
      ef92ea:	66 89 48 28          	mov    WORD PTR [rax+0x28],cx
      ef92ee:	48 89 84 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],rax
      ef92f5:	00 
      ef92f6:	e8 15 98 bf ff       	call   af2b10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fab0>
      ef92fb:	48 83 bc 24 e0 0a 00 	cmp    QWORD PTR [rsp+0xae0],0x0
      ef9302:	00 00 
      ef9304:	0f 84 4a 01 00 00    	je     ef9454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc086a>
      ef930a:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9311:	00 
      ef9312:	48 8d b4 24 c0 0a 00 	lea    rsi,[rsp+0xac0]
      ef9319:	00 
      ef931a:	e8 23 f3 3c 00       	call   12c8642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dbc6>
      ef931f:	bf f0 04 00 00       	mov    edi,0x4f0
      ef9324:	e8 d7 4b 8f 00       	call   17edf00 <_Znwm@plt>
      ef9329:	49 89 c7             	mov    r15,rax
      ef932c:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9330:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef9335:	48 8d 05 44 f2 99 00 	lea    rax,[rip+0x99f244]        # 1898580 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x54c0>
      ef933c:	49 89 07             	mov    QWORD PTR [r15],rax
      ef933f:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
      ef9346:	00 
      ef9347:	48 8d b4 24 f0 05 00 	lea    rsi,[rsp+0x5f0]
      ef934e:	00 
      ef934f:	e8 ee f2 3c 00       	call   12c8642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dbc6>
      ef9354:	6a 40                	push   0x40
      ef9356:	5f                   	pop    rdi
      ef9357:	e8 a4 4b 8f 00       	call   17edf00 <_Znwm@plt>
      ef935c:	48 89 c3             	mov    rbx,rax
      ef935f:	49 8d 6f 20          	lea    rbp,[r15+0x20]
      ef9363:	48 8d 05 4e f2 99 00 	lea    rax,[rip+0x99f24e]        # 18985b8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x54f8>
      ef936a:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef936d:	48 89 df             	mov    rdi,rbx
      ef9370:	48 83 c7 10          	add    rdi,0x10
      ef9374:	4c 8d a4 24 40 02 00 	lea    r12,[rsp+0x240]
      ef937b:	00 
      ef937c:	4c 89 e6             	mov    rsi,r12
      ef937f:	e8 be f2 3c 00       	call   12c8642 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10dbc6>
      ef9384:	4c 8d ac 24 10 07 00 	lea    r13,[rsp+0x710]
      ef938b:	00 
      ef938c:	49 89 5d 20          	mov    QWORD PTR [r13+0x20],rbx
      ef9390:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9394:	66 41 0f 7f 47 20    	movdqa XMMWORD PTR [r15+0x20],xmm0
      ef939a:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      ef939e:	e8 eb ee c2 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
      ef93a3:	31 c0                	xor    eax,eax
      ef93a5:	41 88 87 88 00 00 00 	mov    BYTE PTR [r15+0x88],al
      ef93ac:	41 88 87 a0 04 00 00 	mov    BYTE PTR [r15+0x4a0],al
      ef93b3:	4c 89 ff             	mov    rdi,r15

### Direct calls/jumps to FDE entry
## AdsSetupImpl-factory calls into readiness FDE
## FDEs touching both +0x10 and +0x1b8
### FDE 0xa709f0..0xa70fa1 base=rsp
      a70ba8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a70c17:	4c 8d ac 24 b8 01 00 	lea    r13,[rsp+0x1b8]
      a70d6d:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      a70ed3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0xa8c879..0xa8fc8b base=rsp
      a8d9a2:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      a8d9c1:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      a8dc96:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      a8e397:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8e3c6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8e3e0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8e411:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8e42e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8e438:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8e490:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8e58c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      a8f071:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      a8f146:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f156:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f169:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f17c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f186:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f1a4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f1ae:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f1be:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f1d1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f1f1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f207:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f211:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f221:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f234:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f259:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f26f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f279:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f289:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f29c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f2c1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f2d7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f2e1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f2f1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f304:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f329:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f33f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f349:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f359:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f36c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f391:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f3a7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f3b1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f3c1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f3d4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f3f9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f40f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f419:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f429:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f43c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f456:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f480:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f496:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f4a0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f4b0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f4c3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f4dd:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f507:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f51d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f527:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f537:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f54a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f55f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f574:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f589:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f5a9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f5bf:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f5c9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f5d9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f5ec:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f601:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f616:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f62b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f64b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f661:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f66b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f67b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f68d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f6b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f6c9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f6d3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f6e3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f6f5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f71b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f731:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f73b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f74b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f75d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f776:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f78f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f7a8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f7d0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f7e6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f7f0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f800:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f810:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f829:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f842:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f85b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f872:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f87b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f89c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f8ac:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f8bc:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f8d5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f8ee:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f907:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f91e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f927:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f948:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f958:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f968:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f981:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f99a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f9b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f9ca:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f9d3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8f9f4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fa04:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fa14:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fa2d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fa44:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fa4d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fa6e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fa7e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fa8e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8faa7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fabe:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fac7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fae8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8faf8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fb08:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fb1a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fb23:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fb47:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fb57:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fb67:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fb79:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fb8b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fbaf:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fbbf:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fbcf:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fbe1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      a8fbf3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### FDE 0xaa1418..0xaa6ad6 base=r15
      aa3b7f:	49 89 5f 10          	mov    QWORD PTR [r15+0x10],rbx
      aa4b5d:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      aa4e6f:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      aa4e87:	49 8b 6f 10          	mov    rbp,QWORD PTR [r15+0x10]
      aa5395:	4d 8b 67 10          	mov    r12,QWORD PTR [r15+0x10]
      aa6294:	49 8b bf b8 01 00 00 	mov    rdi,QWORD PTR [r15+0x1b8]

### FDE 0xab0b00..0xab10cf base=r13
      ab0d6a:	49 89 85 b8 01 00 00 	mov    QWORD PTR [r13+0x1b8],rax
      ab0e0b:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]

### FDE 0xacc824..0xaceb41 base=rsp
      acc89c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      acc97b:	4c 8d ac 24 b8 01 00 	lea    r13,[rsp+0x1b8]
      acd041:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
      acd15c:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      acd3fb:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      acd4bf:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      acd4ea:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      acdee1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ace0b8:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      ace166:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ace28c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ace3ab:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ace572:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      ace58e:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      ace5a7:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      ace5fd:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ace733:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      ace7fe:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xad1a74..0xad5057 base=r12
      ad1b94:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      ad1bf7:	4d 8d 7c 24 10       	lea    r15,[r12+0x10]
      ad1c03:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      ad21b5:	f3 41 0f 7f 84 24 b8 	movdqu XMMWORD PTR [r12+0x1b8],xmm0
      ad2e21:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      ad4bf0:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]
      ad4dca:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]

### FDE 0xad7695..0xad7933 base=r14
      ad76d7:	49 0f 45 76 10       	cmovne rsi,QWORD PTR [r14+0x10]
      ad7885:	49 0f 45 b6 b8 01 00 	cmovne rsi,QWORD PTR [r14+0x1b8]

### FDE 0xae306e..0xae4ac2 base=rbx
      ae382a:	0f 11 4b 10          	movups XMMWORD PTR [rbx+0x10],xmm1
      ae3b21:	44 39 7b 10          	cmp    DWORD PTR [rbx+0x10],r15d
      ae3b7d:	44 89 7b 10          	mov    DWORD PTR [rbx+0x10],r15d
      ae3d7d:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax

### FDE 0xae306e..0xae4ac2 base=r12
      ae4574:	49 03 bc 24 b8 01 00 	add    rdi,QWORD PTR [r12+0x1b8]
      ae463f:	45 8b 7c 24 10       	mov    r15d,DWORD PTR [r12+0x10]

### FDE 0xaf857c..0xaf8db0 base=r15
      af88e3:	f3 41 0f 7f 87 b8 01 	movdqu XMMWORD PTR [r15+0x1b8],xmm0
      af891d:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      af8bb4:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]

### FDE 0xb07862..0xb07f39 base=rsp
      b078cf:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      b07a26:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      b07a61:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      b07ccf:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      b07da9:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]

### FDE 0xb34e5c..0xb357ee base=rsp
      b351a4:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      b3571a:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]

### FDE 0xb35c64..0xb3646e base=rsp
      b35d72:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b35dc8:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      b36021:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      b3625b:	4c 8b a4 24 b8 01 00 	mov    r12,QWORD PTR [rsp+0x1b8]
      b36267:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
      b362fd:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xb3a100..0xb3ab5c base=rsp
      b3a24c:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
      b3a695:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
      b3a6dc:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      b3aaa1:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      b3ab4a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0xb56fca..0xb57cd7 base=rsp
      b5717f:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
      b571c9:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      b574b3:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      b574fb:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      b5755e:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      b5793c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      b57b5d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      b57bde:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xb5adfe..0xb5c934 base=rsp
      b5af9a:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      b5b1bf:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      b5b3f4:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
      b5b48e:	c7 44 24 10 00 00 00 	mov    DWORD PTR [rsp+0x10],0x0
      b5b7d6:	8b 5c 24 10          	mov    ebx,DWORD PTR [rsp+0x10]
      b5b8c1:	8b 5c 24 10          	mov    ebx,DWORD PTR [rsp+0x10]
      b5b8ee:	8b 5c 24 10          	mov    ebx,DWORD PTR [rsp+0x10]
      b5bb74:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      b5bbca:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      b5bc55:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      b5bf80:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      b5bff2:	83 7c 24 10 01       	cmp    DWORD PTR [rsp+0x10],0x1
      b5c256:	48 8d 94 24 b8 01 00 	lea    rdx,[rsp+0x1b8]
      b5c34d:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xb63878..0xb63be2 base=rsp
      b63891:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
      b63a40:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      b63a63:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0xb6a3ae..0xb6a799 base=rsp
      b6a514:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      b6a683:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b6a6fc:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]

### FDE 0xb71526..0xb717c1 base=rsp
      b715ed:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      b7167a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### FDE 0xb7add0..0xb7b28b base=rsp
      b7b0e0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      b7b11c:	48 8d 84 24 b8 01 00 	lea    rax,[rsp+0x1b8]
      b7b145:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0xb7e3ae..0xb7fb0a base=rsp
      b7e4e0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b7e5bc:	48 2b 44 24 10       	sub    rax,QWORD PTR [rsp+0x10]
      b7e731:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      b7ea72:	48 8b 9c 24 b8 01 00 	mov    rbx,QWORD PTR [rsp+0x1b8]
      b7eb19:	48 8b 9c 24 b8 01 00 	mov    rbx,QWORD PTR [rsp+0x1b8]
      b7eb29:	48 89 9c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbx
      b7eb66:	4c 8b b4 24 b8 01 00 	mov    r14,QWORD PTR [rsp+0x1b8]
      b7ec64:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      b7ecea:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      b7ed52:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
      b7edd1:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      b7f2ac:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      b7f322:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      b7f64b:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      b7f74a:	4c 03 64 24 10       	add    r12,QWORD PTR [rsp+0x10]

### FDE 0xb8b422..0xb8d4f5 base=rsp
      b8c1ad:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b8c590:	4c 89 bc 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r15

### FDE 0xb96762..0xbbaf8a base=rbx
      bac01c:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
      bb08be:	83 7b 10 00          	cmp    DWORD PTR [rbx+0x10],0x0
      bb65f0:	4c 8d 43 10          	lea    r8,[rbx+0x10]

### FDE 0xbd4008..0xbd4cc4 base=rbx
      bd407d:	4c 8d ab b8 01 00 00 	lea    r13,[rbx+0x1b8]
      bd414b:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
      bd458a:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      bd459a:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]

### FDE 0xbf0ede..0xbf42c9 base=rbx
      bf1dde:	66 0f 2e 53 10       	ucomisd xmm2,QWORD PTR [rbx+0x10]
      bf2b24:	c7 83 b8 01 00 00 04 	mov    DWORD PTR [rbx+0x1b8],0x4
      bf2b68:	c7 83 b8 01 00 00 03 	mov    DWORD PTR [rbx+0x1b8],0x3

### FDE 0xbfb28a..0xbfb607 base=rsp
      bfb2f1:	48 03 8c 24 b8 01 00 	add    rcx,QWORD PTR [rsp+0x1b8]
      bfb34a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      bfb435:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]

### FDE 0xbfb96a..0xbfc4ad base=rsp
      bfbbb4:	4c 8d bc 24 b8 01 00 	lea    r15,[rsp+0x1b8]
      bfc204:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      bfc22f:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      bfc3c3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0xc03166..0xc03d16 base=rsp
      c031ba:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      c03239:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0324e:	f6 84 24 b8 01 00 00 	test   BYTE PTR [rsp+0x1b8],0x1
      c03299:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c032e0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03303:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03310:	f6 84 24 b8 01 00 00 	test   BYTE PTR [rsp+0x1b8],0x1
      c0332c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03373:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03380:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0339d:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      c033b2:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0341d:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
      c03448:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      c0346a:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      c034cf:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c034e4:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      c034e9:	f6 84 24 b8 01 00 00 	test   BYTE PTR [rsp+0x1b8],0x1
      c03544:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      c03551:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      c0358d:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c035d4:	0f 10 84 24 b8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1b8]
      c0368e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0369b:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c036ab:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c036bf:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c036cc:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c036db:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c036ef:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c036fc:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0370c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03720:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0372d:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0373d:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c037c9:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c037d6:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c037e5:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c037f9:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03806:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03816:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0382a:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c038d2:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      c038ed:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0397e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0398b:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c0399a:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c039ae:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c039bb:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c039cb:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c039df:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c039ec:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c039fc:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03a10:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03a9c:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      c03ab7:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03acb:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03b50:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      c03b6a:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03bed:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03c3f:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      c03c69:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xc2030e..0xc20d9a base=rdi
      c20333:	83 bf b8 01 00 00 03 	cmp    DWORD PTR [rdi+0x1b8],0x3
      c20452:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0

### FDE 0xc28488..0xc29d3c base=rsp
      c2871a:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      c29826:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      c2983e:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]

### FDE 0xc4c74e..0xc4d09b base=rsp
      c4c7a0:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      c4c82a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      c4c9ee:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      c4cb29:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      c4cb6e:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
      c4ccc1:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      c4cd0c:	0f 29 4c 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm1
      c4cd7b:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0xc5391a..0xc571cb base=rbx
      c5398d:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
      c5563c:	44 89 73 10          	mov    DWORD PTR [rbx+0x10],r14d
      c55ab9:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
      c55bdc:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
      c56105:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      c56166:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      c56367:	4c 8d bb b8 01 00 00 	lea    r15,[rbx+0x1b8]
      c56444:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
      c56493:	48 8d 7b 10          	lea    rdi,[rbx+0x10]

### FDE 0xc5c7ca..0xc5cd81 base=rsp
      c5c885:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      c5c941:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c5cb62:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      c5ccaa:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xc60a8e..0xc60cae base=rsp
      c60b12:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      c60bd3:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
      c60bd7:	0f 10 84 24 b8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1b8]

### FDE 0xc63fee..0xc645db base=rsp
      c640b9:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      c641c4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c643c4:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      c64509:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xc6c08a..0xc6e081 base=rsp
      c6c3af:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      c6c415:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      c6c75b:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      c6c858:	48 8d 84 24 b8 01 00 	lea    rax,[rsp+0x1b8]
      c6c91b:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      c6caeb:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c6cb9d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      c6cdd1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      c6ced0:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c6cf09:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      c6cf59:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      c6d251:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      c6d9de:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c6dd46:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c6dd78:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c6deae:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c6df16:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      c6df92:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      c6dfb9:	48 83 7c 24 10 00    	cmp    QWORD PTR [rsp+0x10],0x0
      c6dfc1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xc73986..0xc747c1 base=r15
      c74383:	4d 8b b7 b8 01 00 00 	mov    r14,QWORD PTR [r15+0x1b8]
      c743e5:	49 8d 7f 10          	lea    rdi,[r15+0x10]
      c74535:	4d 8b b7 b8 01 00 00 	mov    r14,QWORD PTR [r15+0x1b8]

### FDE 0xc8336a..0xc83d89 base=rsp
      c833d3:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
      c834bb:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      c834ea:	4c 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r13
      c83501:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
      c83556:	4c 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r13
      c83660:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
      c83742:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
      c8385a:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      c83960:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl
      c83a6b:	88 4c 24 10          	mov    BYTE PTR [rsp+0x10],cl

### FDE 0xc85d5e..0xc86e55 base=rsp
      c85f7a:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      c86b13:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]

### FDE 0xc8a0dc..0xc8ad32 base=rsp
      c8a1b2:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      c8a225:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
      c8a252:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      c8a494:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c8a998:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      c8a9fc:	4c 8b 4c 24 10       	mov    r9,QWORD PTR [rsp+0x10]

### FDE 0xcafe86..0xcb0603 base=rsp
      caffe3:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      cb0097:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
      cb00b4:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      cb012e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      cb019e:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      cb01ac:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      cb041e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0xcb6e5a..0xcb749c base=rsp
      cb70a9:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      cb7167:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]
      cb7278:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### FDE 0xcb7a20..0xcbc937 base=rsp
      cb7b58:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      cb7ba4:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      cb81b8:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      cb8f9d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      cb9ad1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      cbabc7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      cbb456:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      cbb6de:	48 8b ac 24 b8 01 00 	mov    rbp,QWORD PTR [rsp+0x1b8]
      cbb721:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      cbb94a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      cbb99c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      cbb9da:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      cbba48:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      cbbb04:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      cbbb42:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      cbbb92:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      cbc5e2:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      cbc7bf:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      cbc802:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0xcc6f70..0xcc76ac base=rsp
      cc744a:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      cc758d:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0

### FDE 0xccb68e..0xccb927 base=r8
      ccb6d4:	41 0f 10 48 10       	movups xmm1,XMMWORD PTR [r8+0x10]
      ccb8b7:	41 ff 90 b8 01 00 00 	call   QWORD PTR [r8+0x1b8]

### FDE 0xccb958..0xccc4af base=rsp
      ccba99:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      ccbbe9:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      ccbd2e:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      ccbf0e:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      ccbf6d:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
      ccbfd8:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      ccc02f:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
      ccc091:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      ccc0ed:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0

### FDE 0xccb958..0xccc4af base=r8
      ccbb26:	41 ff 90 b8 01 00 00 	call   QWORD PTR [r8+0x1b8]
      ccbca2:	41 ff 90 b8 01 00 00 	call   QWORD PTR [r8+0x1b8]
      ccbde9:	41 ff 90 b8 01 00 00 	call   QWORD PTR [r8+0x1b8]
      ccc340:	49 39 58 10          	cmp    QWORD PTR [r8+0x10],rbx

### FDE 0xcccca6..0xccef9d base=rsp
      ccd80c:	48 89 bc 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdi
      cce18b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ccec0d:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0xccf49e..0xccff09 base=r14
      ccf6f8:	45 88 6e 10          	mov    BYTE PTR [r14+0x10],r13b
      ccfaf6:	49 8d be b8 01 00 00 	lea    rdi,[r14+0x1b8]

### FDE 0xcd0862..0xcd160b base=r14
      cd09b9:	49 8b 86 b8 01 00 00 	mov    rax,QWORD PTR [r14+0x1b8]
      cd0c71:	49 8d 7e 10          	lea    rdi,[r14+0x10]
      cd0c84:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      cd11c1:	49 89 5e 10          	mov    QWORD PTR [r14+0x10],rbx

### FDE 0xcd7752..0xcd9380 base=rsp
      cd81dc:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
      cd8cd6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd8d50:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd8dca:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd8e6d:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd8f06:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd8ffb:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd907d:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd9101:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd9185:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
      cd9226:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1

### FDE 0xce0ed4..0xce14bd base=rsp
      ce1140:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
      ce129e:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14

### FDE 0xceac4a..0xceb0fd base=rsp
      ceac8e:	44 89 4c 24 10       	mov    DWORD PTR [rsp+0x10],r9d
      ceae07:	4c 8d a4 24 b8 01 00 	lea    r12,[rsp+0x1b8]
      ceaef2:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]

### FDE 0xcec92c..0xced213 base=rsi
      cec946:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      cecdbe:	48 8b 86 b8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b8]
      cecde8:	0f 11 86 b8 01 00 00 	movups XMMWORD PTR [rsi+0x1b8],xmm0

### FDE 0xcec92c..0xced213 base=rdi
      cec94a:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      cecdb7:	0f 11 87 b8 01 00 00 	movups XMMWORD PTR [rdi+0x1b8],xmm0
      cecdc5:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax

### FDE 0xd077d6..0xd090fa base=r12
      d07be8:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      d07dc5:	49 8d 9c 24 b8 01 00 	lea    rbx,[r12+0x1b8]
      d081fe:	49 8d 44 24 10       	lea    rax,[r12+0x10]

### FDE 0xd0ce48..0xd0ea59 base=r15
      d0d051:	41 c7 87 b8 01 00 00 	mov    DWORD PTR [r15+0x1b8],0x3f800000
      d0ddad:	49 8b 5f 10          	mov    rbx,QWORD PTR [r15+0x10]

### FDE 0xd1b3f8..0xd1b4e6 base=rdi
      d1b410:	48 8d b7 b8 01 00 00 	lea    rsi,[rdi+0x1b8]
      d1b43d:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0

### FDE 0xd24c2e..0xd25b58 base=rsp
      d2518f:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
      d25363:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al

### FDE 0xd2f878..0xd2f9c5 base=rbx
      d2f924:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
      d2f9ad:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]

### FDE 0xd3b326..0xd3c6ce base=rsp
      d3b66e:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      d3b752:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      d3b9c9:	48 8b 94 24 b8 01 00 	mov    rdx,QWORD PTR [rsp+0x1b8]
      d3ba86:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      d3bcec:	4c 8b b4 24 b8 01 00 	mov    r14,QWORD PTR [rsp+0x1b8]
      d3bd77:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      d3bf46:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      d3bf4b:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
      d3c087:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      d3c0f3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d3c1b6:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      d3c1e0:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      d3c2db:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      d3c632:	4c 8b b4 24 b8 01 00 	mov    r14,QWORD PTR [rsp+0x1b8]

### FDE 0xd498ce..0xd4aa39 base=r14
      d49b85:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      d49c6d:	41 0f 11 86 b8 01 00 	movups XMMWORD PTR [r14+0x1b8],xmm0

### FDE 0xd4c6e4..0xd50266 base=rbx
      d4cd1d:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
      d4eaa5:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      d4eabc:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      d4edf2:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d4f0d9:	4c 8d ab b8 01 00 00 	lea    r13,[rbx+0x1b8]
      d4f42f:	4c 8d 63 10          	lea    r12,[rbx+0x10]
      d4f526:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      d4f5d4:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]

### FDE 0xd623a4..0xd6282d base=rsp
      d62424:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      d6247c:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
      d624f1:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xd6aa99..0xd6f087 base=r12
      d6abfe:	49 89 4c 24 10       	mov    QWORD PTR [r12+0x10],rcx
      d6ae49:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
      d6b0ca:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      d6b33e:	49 8d 84 24 b8 01 00 	lea    rax,[r12+0x1b8]
      d6b34a:	f3 41 0f 7f 84 24 b8 	movdqu XMMWORD PTR [r12+0x1b8],xmm0

### FDE 0xd6aa99..0xd6f087 base=rsp
      d6ad47:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      d6b0ae:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6b20e:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6b490:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6b8c6:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6b92c:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      d6b93a:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      d6bb33:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6bb41:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6bb91:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6bb9f:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6bbec:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6bbfa:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6bc4f:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6bc5d:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6bca6:	48 89 bc 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdi
      d6bdf2:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6be01:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6c327:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6c39f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6c40e:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6c607:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6c680:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6c6f9:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6c772:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6c826:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6c8da:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6c964:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6ca50:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6d8c4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6d915:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6da2c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6da60:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6dac0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6de27:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d6de7c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d6de86:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d6ded5:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d6df70:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d6df9d:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6e5e8:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6ea11:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6eaf1:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d6eb31:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d6eb8b:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      d6ebf4:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      d6ed0e:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      d6ef9d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xd78540..0xd7994b base=rsp
      d7863d:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      d786f5:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      d78bc7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d78c43:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      d78cc7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d78e0f:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      d78e16:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d78f75:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      d78f7d:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d79156:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      d791d7:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      d7921d:	4c 8b 84 24 b8 01 00 	mov    r8,QWORD PTR [rsp+0x1b8]
      d796d3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0xd7994c..0xd7a534 base=rsp
      d79d15:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
      d79e3c:	48 8d 84 24 b8 01 00 	lea    rax,[rsp+0x1b8]
      d7a279:	44 8b 74 24 10       	mov    r14d,DWORD PTR [rsp+0x10]

### FDE 0xd8fd56..0xd906a4 base=rsp
      d8fe73:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      d8feaa:	48 01 74 24 10       	add    QWORD PTR [rsp+0x10],rsi
      d8ff30:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      d90249:	48 c7 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],0x1c
      d90418:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      d905dc:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      d9062e:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0xd9b0cc..0xd9bcc2 base=rsp
      d9b2cd:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      d9b2fe:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      d9b3a7:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      d9b544:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      d9b56d:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      d9b5a5:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      d9b6aa:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
      d9b6f6:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      d9b75d:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      d9b947:	ff 74 24 10          	push   QWORD PTR [rsp+0x10]
      d9baac:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      d9bae2:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      d9bcad:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xda120e..0xda13cd base=rbx
      da1332:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
      da1396:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]

### FDE 0xda3994..0xda47db base=rax
      da3eba:	ff 50 10             	call   QWORD PTR [rax+0x10]
      da3f4f:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx
      da3fe9:	ff 50 10             	call   QWORD PTR [rax+0x10]
      da402f:	ff 50 10             	call   QWORD PTR [rax+0x10]
      da4110:	48 8d 78 10          	lea    rdi,[rax+0x10]
      da4456:	48 8d 98 b8 01 00 00 	lea    rbx,[rax+0x1b8]
      da4530:	88 48 10             	mov    BYTE PTR [rax+0x10],cl

### FDE 0xda6d48..0xda72b8 base=rsp
      da6e6a:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
      da6e7e:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
      da6f0b:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      da6f33:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      da6f52:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      da70f6:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
      da7237:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      da727c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xda8c38..0xda8d12 base=rbx
      da8c95:	48 83 bb b8 01 00 00 	cmp    QWORD PTR [rbx+0x1b8],0x0
      da8cbd:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      da8cdb:	48 8d 7b 10          	lea    rdi,[rbx+0x10]

### FDE 0xdabc4d..0xdac4b5 base=rsp
      dabd77:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      dabe3c:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      dabeda:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al

### FDE 0xdadd5f..0xdae11b base=rbx
      dadefb:	48 8d bb b8 01 00 00 	lea    rdi,[rbx+0x1b8]
      dae0ea:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]

### FDE 0xdb0a13..0xdb0c12 base=rsp
      db0b51:	8b 84 24 b8 01 00 00 	mov    eax,DWORD PTR [rsp+0x1b8]
      db0b58:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax

### FDE 0xdb802a..0xdb82fa base=rsp
      db8198:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      db81bc:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0

### FDE 0xdbbdbc..0xdbcc85 base=rsp
      dbbfe4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      dbc48f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      dbc6cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      dbc6d2:	48 8d 84 24 b8 01 00 	lea    rax,[rsp+0x1b8]
      dbc6ff:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      dbc716:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      dbc74f:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]

### FDE 0xdbf4b4..0xdbf978 base=rdi
      dbf4df:	48 8b 87 b8 01 00 00 	mov    rax,QWORD PTR [rdi+0x1b8]
      dbf58d:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax

### FDE 0xdd0cca..0xdd348d base=rsp
      dd1333:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      dd168b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      dd16bb:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x1
      dd17fc:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      dd185d:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      dd1a5c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      dd1c20:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      dd1ce1:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      dd2093:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      dd20ba:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      dd2187:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      dd21e7:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      dd22b9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      dd25a4:	4c 3b 74 24 10       	cmp    r14,QWORD PTR [rsp+0x10]
      dd268d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      dd2890:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0xde53c0..0xde6c75 base=rsp
      de54f2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      de5a77:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      de5b79:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      de5b8e:	48 8d 94 24 b8 01 00 	lea    rdx,[rsp+0x1b8]
      de5da2:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      de5ee8:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      de6155:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      de633a:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      de6459:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      de647a:	4c 8d bc 24 b8 01 00 	lea    r15,[rsp+0x1b8]
      de6785:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      de6adc:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      de6b9a:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xde53c0..0xde6c75 base=r14
      de5536:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      de554e:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      de5e14:	49 8d 9e b8 01 00 00 	lea    rbx,[r14+0x1b8]

### FDE 0xde75ee..0xde87f4 base=rsp
      de7c68:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      de7c80:	48 8d 94 24 b8 01 00 	lea    rdx,[rsp+0x1b8]
      de8120:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      de842f:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      de8786:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xdeb80c..0xdf1297 base=rbx
      deb871:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      deb891:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      deb968:	66 0f 7f 43 10       	movdqa XMMWORD PTR [rbx+0x10],xmm0
      dec58e:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
      dec7a2:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      dec7ad:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      dec99a:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
      decd99:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
      dedc6d:	80 7b 10 00          	cmp    BYTE PTR [rbx+0x10],0x0
      df0496:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      df049b:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      df0861:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      df0da4:	8b b3 b8 01 00 00    	mov    esi,DWORD PTR [rbx+0x1b8]

### FDE 0xdeb80c..0xdf1297 base=rsp
      deb896:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      debaea:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      debb0d:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      debce6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      debd3c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      debd7b:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      dec0ac:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      dec66d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ded303:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      deda64:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      dede6d:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      dedf20:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      dee19b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      dee45d:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      dee468:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      deee5a:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
      deef13:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      def024:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def099:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      def0be:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      def389:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def3da:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def3f5:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      def450:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      def524:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      def7bd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def815:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def879:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def8db:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def95e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      def9e1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      defa4f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      defab0:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      defd61:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
      df01e0:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
      df0644:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      df078c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      df0b60:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xdeb80c..0xdf1297 base=r15
      deba17:	41 88 af b8 01 00 00 	mov    BYTE PTR [r15+0x1b8],bpl
      debef9:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      deccd0:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      deccd4:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
      ded428:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      ded45f:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
      ded91f:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      ded923:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
      deeda8:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      deedc9:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0

### FDE 0xdeb80c..0xdf1297 base=rbp
      ded386:	48 89 85 b8 01 00 00 	mov    QWORD PTR [rbp+0x1b8],rax
      ded3b7:	0f 10 85 b8 01 00 00 	movups xmm0,XMMWORD PTR [rbp+0x1b8]
      dedda3:	48 8b 45 10          	mov    rax,QWORD PTR [rbp+0x10]
      dee20b:	f3 0f 7f 85 b8 01 00 	movdqu XMMWORD PTR [rbp+0x1b8],xmm0
      dee634:	0f b6 85 b8 01 00 00 	movzx  eax,BYTE PTR [rbp+0x1b8]
      dee90b:	4c 8d 75 10          	lea    r14,[rbp+0x10]

### FDE 0xdf264e..0xdf26b6 base=rax
      df266e:	48 8b b8 b8 01 00 00 	mov    rdi,QWORD PTR [rax+0x1b8]
      df2681:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0xdf5b19..0xdf677d base=rax
      df5de2:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]
      df5dea:	89 50 10             	mov    DWORD PTR [rax+0x10],edx
      df5dfc:	89 50 10             	mov    DWORD PTR [rax+0x10],edx
      df5e0c:	89 48 10             	mov    DWORD PTR [rax+0x10],ecx
      df612d:	48 8d b0 b8 01 00 00 	lea    rsi,[rax+0x1b8]
      df6337:	80 48 10 08          	or     BYTE PTR [rax+0x10],0x8
      df6507:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]
      df650f:	89 50 10             	mov    DWORD PTR [rax+0x10],edx
      df651b:	89 48 10             	mov    DWORD PTR [rax+0x10],ecx
      df652c:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
      df653e:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
      df660a:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1

### FDE 0xdfa092..0xdfa7d4 base=r14
      dfa170:	49 8d 7e 10          	lea    rdi,[r14+0x10]
      dfa3bf:	4d 8b be b8 01 00 00 	mov    r15,QWORD PTR [r14+0x1b8]

### FDE 0xe14c76..0xe155dc base=rbx
      e14ce0:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
      e15291:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax

### FDE 0xe1741c..0xe17790 base=rsp
      e1749d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      e174c5:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      e17578:	4c 8d bc 24 b8 01 00 	lea    r15,[rsp+0x1b8]

### FDE 0xe1a6d4..0xe1b26f base=rbx
      e1ad20:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
      e1aec8:	0f 29 43 10          	movaps XMMWORD PTR [rbx+0x10],xmm0

### FDE 0xe1db7a..0xe1e5cc base=rsp
      e1dbb0:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      e1dcad:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      e1dfd2:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      e1dff5:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      e1e03a:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      e1e076:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      e1e289:	89 6c 24 10          	mov    DWORD PTR [rsp+0x10],ebp

### FDE 0xe24d7a..0xe259dd base=rsp
      e2528c:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      e25296:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      e25483:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      e254aa:	0f 28 54 24 10       	movaps xmm2,XMMWORD PTR [rsp+0x10]
      e254af:	0f 29 4c 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm1
      e254e2:	0f 11 8c 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm1
      e25566:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      e25633:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]

### FDE 0xe3b996..0xe3d367 base=rsp
      e3bbfa:	48 8b 9c 24 b8 01 00 	mov    rbx,QWORD PTR [rsp+0x1b8]
      e3c2a7:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      e3c5ee:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      e3c919:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      e3c99c:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      e3cf2f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e3d1a8:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      e3d1c1:	48 39 44 24 10       	cmp    QWORD PTR [rsp+0x10],rax
      e3d1d4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e3d1f3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0xe3e290..0xe3ea17 base=rsp
      e3e2b7:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      e3e31f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e3e351:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e3e4de:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e3e7f4:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax

### FDE 0xe3f07c..0xe3fa6b base=rsp
      e3f0a8:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      e3f0be:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      e3f171:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
      e3f816:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0xe4722a..0xe4790d base=rsp
      e475da:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e4761c:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      e476b4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e476e7:	0f 10 84 24 b8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1b8]
      e4775c:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]

### FDE 0xe47a1e..0xe48f48 base=rax
      e4810a:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
      e48790:	48 8b 88 b8 01 00 00 	mov    rcx,QWORD PTR [rax+0x1b8]
      e487b5:	48 83 a0 b8 01 00 00 	and    QWORD PTR [rax+0x1b8],0x0
      e4889c:	0f 11 48 10          	movups XMMWORD PTR [rax+0x10],xmm1

### FDE 0xe4a3f4..0xe4aa13 base=rsp
      e4a69a:	4c 89 a4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r12
      e4a74a:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e4a76c:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0xe4bafe..0xe4d52e base=rsp
      e4c3a1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e4c3fa:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      e4c483:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e4c4d7:	0f 10 84 24 b8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1b8]
      e4c4f9:	0f 11 8c 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm1
      e4c562:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      e4c7d7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e4c830:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      e4c8a0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e4c8f4:	0f 10 84 24 b8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1b8]
      e4c916:	0f 11 8c 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm1
      e4c965:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]

### FDE 0xe635c2..0xe63f7d base=rsp
      e63679:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
      e63a1a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e63a44:	48 23 44 24 10       	and    rax,QWORD PTR [rsp+0x10]
      e63ce6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e63d12:	48 23 44 24 10       	and    rax,QWORD PTR [rsp+0x10]

### FDE 0xe67142..0xe67ba7 base=rbx
      e6759e:	48 8d 83 b8 01 00 00 	lea    rax,[rbx+0x1b8]
      e678e3:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]

### FDE 0xe6a96e..0xe6b580 base=rsp
      e6a9a0:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e6a9d7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e6aa1b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e6ab38:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      e6af4f:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      e6b44a:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]

### FDE 0xe70bba..0xe70c8f base=rdi
      e70bcc:	88 4f 10             	mov    BYTE PTR [rdi+0x10],cl
      e70c3b:	0f 11 87 b8 01 00 00 	movups XMMWORD PTR [rdi+0x1b8],xmm0

### FDE 0xe7dbb2..0xe7eb82 base=rsp
      e7e20e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      e7e228:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      e7e2b0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      e7e2ff:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]

### FDE 0xe80d7c..0xe81188 base=rsp
      e80d9e:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      e81083:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e81096:	48 3b 84 24 b8 01 00 	cmp    rax,QWORD PTR [rsp+0x1b8]
      e8115d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xe86fd0..0xe8726a base=rsp
      e8708e:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
      e8713c:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
      e87146:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x1
      e87173:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]

### FDE 0xe8747e..0xe877fa base=rsp
      e874d6:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
      e876bc:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e876fd:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]

### FDE 0xe877fa..0xe87a0e base=rsp
      e8791b:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      e87965:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      e87979:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]

### FDE 0xe87a0e..0xe87c22 base=rsp
      e87b2f:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      e87b79:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      e87b8d:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]

### FDE 0xe87c22..0xe87e36 base=rsp
      e87d43:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      e87d8d:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      e87da1:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]

### FDE 0xe8c65c..0xe8e898 base=rsp
      e8c7f2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      e8d299:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e8d44b:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      e8d631:	f3 0f 7e 44 24 10    	movq   xmm0,QWORD PTR [rsp+0x10]
      e8d68a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e8daa9:	ff b4 24 b8 01 00 00 	push   QWORD PTR [rsp+0x1b8]
      e8db67:	ff b4 24 b8 01 00 00 	push   QWORD PTR [rsp+0x1b8]
      e8e160:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      e8e76c:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0xe92f2c..0xe98f3b base=rsp
      e92f45:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
      e93dba:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e93f1e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e93f42:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      e94ba5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e94d8e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e95187:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e9598b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e95bfa:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
      e9621c:	88 44 24 10          	mov    BYTE PTR [rsp+0x10],al
      e96565:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
      e96883:	8a 44 24 10          	mov    al,BYTE PTR [rsp+0x10]
      e96a02:	8a 54 24 10          	mov    dl,BYTE PTR [rsp+0x10]
      e972b8:	8a 44 24 10          	mov    al,BYTE PTR [rsp+0x10]
      e9730d:	4c 8b 84 24 b8 01 00 	mov    r8,QWORD PTR [rsp+0x1b8]
      e97499:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      e97521:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e98468:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e98eba:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xea42b4..0xea54b7 base=r14
      ea444e:	49 8d 76 10          	lea    rsi,[r14+0x10]
      ea4506:	f3 41 0f 6f 86 b8 01 	movdqu xmm0,XMMWORD PTR [r14+0x1b8]

### FDE 0xea42b4..0xea54b7 base=rsp
      ea4574:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      ea49d6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ea4a84:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea4df9:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      ea4f94:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ea5059:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5070:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea507a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5091:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5096:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
      ea50aa:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea50b4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea50c8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea50e3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea50ed:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea50f7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5101:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea510b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5115:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea511f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5129:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5133:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea513d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5147:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea514e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea5155:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea515f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ea54a8:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xeac530..0xead0ca base=rsp
      eac79a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      eac86b:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      eac892:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
      eac8fb:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
      eac984:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      eaca2c:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      eaca52:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
      eacaa0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      eacb1b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      eacb58:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      eacbfe:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
      eacd2d:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
      eacd61:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      eacd6b:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      eacdcc:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      eacdf7:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      eace09:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
      eacf09:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      ead093:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0xeaf8e0..0xeafc91 base=rax
      eafbcb:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
      eafbee:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0xeaff44..0xeb0249 base=rax
      eb01ce:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
      eb01f1:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0xeb024a..0xeb042d base=rsp
      eb0277:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
      eb0284:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      eb02e9:	4c 8d ac 24 b8 01 00 	lea    r13,[rsp+0x1b8]
      eb03a5:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      eb0400:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xeb042e..0xeb0614 base=rsp
      eb045b:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
      eb0468:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      eb04cd:	4c 8d ac 24 b8 01 00 	lea    r13,[rsp+0x1b8]
      eb058c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      eb05e7:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xeb0614..0xeb07fa base=rsp
      eb0641:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
      eb064e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      eb06b3:	4c 8d ac 24 b8 01 00 	lea    r13,[rsp+0x1b8]
      eb0772:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      eb07cd:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xeb2146..0xeb329d base=r12
      eb21d8:	49 8d 5c 24 10       	lea    rbx,[r12+0x10]
      eb22be:	41 c7 84 24 b8 01 00 	mov    DWORD PTR [r12+0x1b8],0x2
      eb2b59:	41 f6 44 24 10 02    	test   BYTE PTR [r12+0x10],0x2

### FDE 0xec0c62..0xec1102 base=rsp
      ec0c87:	48 8b 94 24 b8 01 00 	mov    rdx,QWORD PTR [rsp+0x1b8]
      ec0ce3:	0f 29 4c 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm1
      ec0df6:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      ec0fce:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      ec10c4:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0xece57c..0xecfa4e base=rsp
      ece593:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      ece71d:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ece855:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      ecebaa:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      ecebea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ececd1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      eced58:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      eced88:	4c 8b b4 24 b8 01 00 	mov    r14,QWORD PTR [rsp+0x1b8]
      ecf443:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ecf872:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ecf94d:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xed1c64..0xed2ba2 base=rsp
      ed1c8b:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
      ed1cd6:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      ed1d67:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed1db1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed1de6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed1df8:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed1e0d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed1eb4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed1f31:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed1f7b:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed1f93:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
      ed1fab:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed200c:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      ed2047:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed2059:	8b 84 24 b8 01 00 00 	mov    eax,DWORD PTR [rsp+0x1b8]
      ed217b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed21cc:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed21e3:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
      ed2370:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed2418:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed246d:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed24c2:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed2517:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed2524:	83 bc 24 b8 01 00 00 	cmp    DWORD PTR [rsp+0x1b8],0x0
      ed2562:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed25b4:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed25f9:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed26c0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed26cd:	8b 9c 24 b8 01 00 00 	mov    ebx,DWORD PTR [rsp+0x1b8]
      ed271f:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed272c:	8b 9c 24 b8 01 00 00 	mov    ebx,DWORD PTR [rsp+0x1b8]
      ed277e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed278b:	8b 9c 24 b8 01 00 00 	mov    ebx,DWORD PTR [rsp+0x1b8]
      ed27dd:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed27ea:	83 bc 24 b8 01 00 00 	cmp    DWORD PTR [rsp+0x1b8],0x0
      ed282e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed283b:	8b 9c 24 b8 01 00 00 	mov    ebx,DWORD PTR [rsp+0x1b8]
      ed288a:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      ed2897:	8b 9c 24 b8 01 00 00 	mov    ebx,DWORD PTR [rsp+0x1b8]
      ed28d9:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ed2a5d:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xee55c2..0xee6102 base=rdi
      ee55d0:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      ee55d8:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ee5a10:	48 83 a7 b8 01 00 00 	and    QWORD PTR [rdi+0x1b8],0x0
      ee5a3b:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax

### FDE 0xee55c2..0xee6102 base=rsi
      ee55d4:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      ee55ec:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
      ee5a34:	48 8b 86 b8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b8]
      ee5a42:	48 83 a6 b8 01 00 00 	and    QWORD PTR [rsi+0x1b8],0x0

### FDE 0xeff89c..0xf000b1 base=rsp
      effa59:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      effb34:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      effba4:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      effc70:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      effc87:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      effd72:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      effdc2:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      efff29:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      efff4f:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xf2fc24..0xf301bf base=rsp
      f2fecf:	4c 89 bc 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r15
      f2fef6:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      f2ff2b:	48 8b 8c 24 b8 01 00 	mov    rcx,QWORD PTR [rsp+0x1b8]
      f30044:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      f30069:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      f30104:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax

### FDE 0xf391f4..0xf394ff base=rsp
      f392b4:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
      f39378:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]

### FDE 0xf4cc18..0xf4d0dc base=rsp
      f4cc43:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      f4cc9a:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      f4cccc:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      f4ccd9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f4ccee:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      f4cd02:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      f4cd0f:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f4cd24:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      f4cded:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
      f4ce70:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f4ce7a:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      f4cebe:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]
      f4cf1e:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      f4d01c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      f4d0af:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xf54c52..0xf552f2 base=rsp
      f54d17:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
      f54fa3:	44 0f b6 4c 24 10    	movzx  r9d,BYTE PTR [rsp+0x10]
      f5502f:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      f550a3:	4c 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r14
      f5515f:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xf634be..0xf64830 base=rsp
      f63738:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      f6377a:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      f637b2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      f63805:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      f63c4f:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
      f63db1:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
      f63fc8:	48 ff 84 24 b8 01 00 	inc    QWORD PTR [rsp+0x1b8]
      f64425:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      f64500:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      f64574:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0xf659d6..0xf6633f base=rsp
      f65cf1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      f65d8e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
      f65ddf:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      f65e4a:	4c 39 64 24 10       	cmp    QWORD PTR [rsp+0x10],r12
      f65e5a:	4c 39 64 24 10       	cmp    QWORD PTR [rsp+0x10],r12
      f65ea0:	4c 39 64 24 10       	cmp    QWORD PTR [rsp+0x10],r12
      f65ede:	4c 33 64 24 10       	xor    r12,QWORD PTR [rsp+0x10]

### FDE 0xf6b12a..0xf6b516 base=rsp
      f6b1a2:	4c 8d ac 24 b8 01 00 	lea    r13,[rsp+0x1b8]
      f6b1fc:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      f6b230:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      f6b23d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f6b258:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      f6b29e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
      f6b2b3:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      f6b2d0:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
      f6b329:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      f6b3cc:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f6b431:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xf7e3c4..0xf7f5ce base=rsp
      f7e585:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
      f7e601:	48 8b ac 24 b8 01 00 	mov    rbp,QWORD PTR [rsp+0x1b8]
      f7e7d5:	4c 8b bc 24 b8 01 00 	mov    r15,QWORD PTR [rsp+0x1b8]
      f7e80f:	4c 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r14
      f7e9be:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      f7e9c7:	48 8b ac 24 b8 01 00 	mov    rbp,QWORD PTR [rsp+0x1b8]
      f7eab7:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      f7ecc2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      f7ecec:	4c 8b b4 24 b8 01 00 	mov    r14,QWORD PTR [rsp+0x1b8]
      f7edba:	48 3b 5c 24 10       	cmp    rbx,QWORD PTR [rsp+0x10]
      f7eee8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      f7ef0f:	48 23 44 24 10       	and    rax,QWORD PTR [rsp+0x10]

### FDE 0xf9c29a..0xf9c67a base=rsp
      f9c3d3:	48 8d 84 24 b8 01 00 	lea    rax,[rsp+0x1b8]
      f9c4ea:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      f9c576:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
      f9c5c8:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]

### FDE 0xfb2722..0xfb290e base=rax
      fb27b0:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
      fb27ea:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0

### FDE 0xfc37e8..0xfc3db8 base=rsp
      fc3873:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      fc3987:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      fc3af5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      fc3c74:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      fc3c94:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0xfc8a66..0xfc956b base=rsp
      fc90e8:	4c 89 a4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r12
      fc9113:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
      fc925f:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
      fc9271:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      fc92a6:	48 8b 8c 24 b8 01 00 	mov    rcx,QWORD PTR [rsp+0x1b8]
      fc93cc:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
      fc93f1:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0xfcdcc8..0xfce489 base=rsp
      fcdd7e:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      fce146:	4c 8d ac 24 b8 01 00 	lea    r13,[rsp+0x1b8]
      fce2f0:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]

### FDE 0xfd8a56..0xfd8fdc base=rsp
      fd8bd8:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fd8c4b:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
      fd8c68:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      fd8d01:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
      fd8d6b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0xfdf718..0xfe00dd base=rsp
      fdf731:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
      fdf7da:	4c 8d a4 24 b8 01 00 	lea    r12,[rsp+0x1b8]
      fdf826:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      fdf8d2:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      fdfad2:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      fdfb98:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      fdfc73:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
      fdfd3b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      fe004b:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0xfefefd..0xff028e base=rbx
      feff65:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ff0023:	c7 83 b8 01 00 00 02 	mov    DWORD PTR [rbx+0x1b8],0x2

### FDE 0xff296e..0xff3c15 base=r14
      ff2c49:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
      ff2c86:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
      ff2cd9:	41 f6 46 10 40       	test   BYTE PTR [r14+0x10],0x40
      ff30d7:	41 f6 46 10 01       	test   BYTE PTR [r14+0x10],0x1
      ff3112:	41 f6 46 10 02       	test   BYTE PTR [r14+0x10],0x2
      ff31ca:	41 f6 46 10 40       	test   BYTE PTR [r14+0x10],0x40
      ff334d:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
      ff34e4:	66 41 0f d6 86 b8 01 	movq   QWORD PTR [r14+0x1b8],xmm0
      ff383d:	41 80 7e 10 00       	cmp    BYTE PTR [r14+0x10],0x0
      ff385a:	41 8a 46 10          	mov    al,BYTE PTR [r14+0x10]

### FDE 0x1012abc..0x10132c0 base=rsp
     1012ae7:	48 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rsi
     1012b23:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]
     1012b90:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
     1012bb5:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
     1012be2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1012dff:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
     1012e1b:	4c 3b 64 24 10       	cmp    r12,QWORD PTR [rsp+0x10]
     1012eb2:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1013039:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1013060:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     1013147:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1013204:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     101326c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x1015876..0x101600a base=rsp
     101590c:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
     101591f:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
     1015991:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     1015ac8:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     1015b8e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1015bb4:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0x10211ed..0x10216c1 base=rsp
     1021267:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     102127c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     102129e:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]

### FDE 0x1025b26..0x102628e base=rsp
     1025c46:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1025c5e:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1025de2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1025e04:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1025e17:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     1025f15:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     1025fc1:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     102600e:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1026057:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1026214:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x103de64..0x103e0e4 base=rsp
     103de8f:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
     103defd:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     103df4b:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     103dfe4:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     103e055:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     103e0b7:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x104eb38..0x104f2bd base=rsp
     104ec1f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     104ec64:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     104ede2:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     104ef7a:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     104f0b4:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     104f0f7:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     104f107:	48 89 9c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbx
     104f172:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0x10550ac..0x105572b base=rsp
     1055145:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     105526c:	4c 89 a4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r12
     10552fd:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0x10575d6..0x1058f3c base=rsp
     105763a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     105770b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     105775d:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     10579e2:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     1057a3f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1058059:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10586c7:	4c 8b bc 24 b8 01 00 	mov    r15,QWORD PTR [rsp+0x1b8]
     1058952:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1058ebf:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x1074aca..0x10759bb base=rsp
     1074b99:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1074cf2:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1074d5e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     1074db6:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1074e08:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     10752d5:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     10753e8:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1075537:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     107559b:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     10758eb:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]

### FDE 0x1077eae..0x10790ae base=r14
     107834d:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     107851f:	41 89 86 b8 01 00 00 	mov    DWORD PTR [r14+0x1b8],eax
     1078823:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
     1078b9e:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax

### FDE 0x107a02c..0x107e484 base=rsp
     107a28b:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
     107b090:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     107b934:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     107be87:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     107e0dd:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     107e15e:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     107e259:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     107e30f:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]

### FDE 0x108480a..0x10850fb base=rsp
     10849cb:	83 a4 24 b8 01 00 00 	and    DWORD PTR [rsp+0x1b8],0x0
     1084cf9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     1084d75:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
     1085062:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0x108aa5c..0x108b283 base=rsp
     108ab1b:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     108ab4d:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     108ac3f:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     108ac88:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     108accb:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     108ad4c:	83 7c 24 10 01       	cmp    DWORD PTR [rsp+0x10],0x1
     108ad98:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     108af01:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     108af5e:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     108b0d5:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     108b165:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     108b22f:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x108ec98..0x108fa88 base=rbx
     108f04d:	44 0f b7 7b 10       	movzx  r15d,WORD PTR [rbx+0x10]
     108f667:	48 8d 83 b8 01 00 00 	lea    rax,[rbx+0x1b8]

### FDE 0x108ec98..0x108fa88 base=r14
     108f5b3:	49 8b 8e b8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1b8]
     108f6c5:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     108f6d8:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0

### FDE 0x108fcb0..0x10905a2 base=rax
     10903be:	f3 0f 6f 88 b8 01 00 	movdqu xmm1,XMMWORD PTR [rax+0x1b8]
     10904a8:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0x109b054..0x109d090 base=rsp
     109b300:	c7 44 24 10 00 00 00 	mov    DWORD PTR [rsp+0x10],0x0
     109b6e3:	3b 44 24 10          	cmp    eax,DWORD PTR [rsp+0x10]
     109b711:	ff 44 24 10          	inc    DWORD PTR [rsp+0x10]
     109b832:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     109b8a1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     109b92c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     109bb4b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     109bc4e:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     109bcb9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     109bd79:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     109c6de:	ff 74 24 10          	push   QWORD PTR [rsp+0x10]
     109cb58:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     109cc6e:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     109cd13:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     109d026:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x10aba36..0x10adc15 base=rsp
     10aba4c:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
     10ac154:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     10ac66f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10ac931:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10ad101:	89 6c 24 10          	mov    DWORD PTR [rsp+0x10],ebp
     10ad202:	8b 44 24 10          	mov    eax,DWORD PTR [rsp+0x10]
     10ad24e:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     10ad296:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     10ad8b6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x10b387a..0x10b4b11 base=rsp
     10b3892:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     10b3a01:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b3df9:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
     10b3efe:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
     10b407e:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
     10b40b0:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
     10b40c0:	4c 89 bc 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r15
     10b4211:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b4253:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10b42fb:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     10b4457:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     10b44c1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     10b4646:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     10b467c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10b478b:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     10b47df:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]

### FDE 0x10c7678..0x10c8351 base=rsp
     10c7866:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     10c7920:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x1
     10c79ad:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     10c79d0:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     10c7a4c:	0f 10 8c 24 b8 01 00 	movups xmm1,XMMWORD PTR [rsp+0x1b8]
     10c7a90:	88 94 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],dl
     10c7b5e:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x1
     10c7bbf:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     10c7e3a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10c7e8b:	f3 0f 7f 84 24 b8 01 	movdqu XMMWORD PTR [rsp+0x1b8],xmm0
     10c7ea8:	c7 84 24 b8 01 00 00 	mov    DWORD PTR [rsp+0x1b8],0x1
     10c7f6d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10c80d9:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
     10c8113:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     10c8160:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]

### FDE 0x10d0e58..0x10d4cf6 base=rsp
     10d170f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10d1c52:	f2 0f 10 44 24 10    	movsd  xmm0,QWORD PTR [rsp+0x10]
     10d1c58:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     10d1c93:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     10d1ca2:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     10d1cf4:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     10d1d01:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     10d1f2d:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     10d2074:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
     10d2122:	66 0f 6f 4c 24 10    	movdqa xmm1,XMMWORD PTR [rsp+0x10]
     10d2210:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10d231d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10d24d5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     10d27dc:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     10d29e5:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     10d2dc6:	88 44 24 10          	mov    BYTE PTR [rsp+0x10],al
     10d2f04:	8a 44 24 10          	mov    al,BYTE PTR [rsp+0x10]
     10d2f1e:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     10d2f26:	4c 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r14
     10d3268:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
     10d3295:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     10d3371:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     10d3486:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     10d3557:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
     10d3583:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     10d360d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     10d36b1:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     10d3977:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
     10d3984:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     10d3aa6:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
     10d3ae1:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     10d3dde:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     10d47ba:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     10d49be:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     10d4b9a:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     10d4bd2:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0x10e58a4..0x10e632a base=rsp
     10e5c10:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     10e5c1b:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
     10e5d9c:	48 3b 84 24 b8 01 00 	cmp    rax,QWORD PTR [rsp+0x1b8]
     10e5dfd:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     10e5e39:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     10e5eaa:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     10e6000:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     10e62ce:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x10e7119..0x10e7a10 base=rsp
     10e751a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10e76d3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10e7754:	48 0b 44 24 10       	or     rax,QWORD PTR [rsp+0x10]
     10e78a1:	4c 8b b4 24 b8 01 00 	mov    r14,QWORD PTR [rsp+0x1b8]
     10e78c6:	4c 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r14

### FDE 0x10ea82c..0x10eaa6a base=rsp
     10ea879:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     10ea8d7:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
     10ea91d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     10ea98c:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     10ea9ab:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     10eaa36:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0x10ead74..0x10eb5d7 base=rsp
     10eaec2:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     10eb076:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     10eb0b4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10eb2d6:	48 0b 6c 24 10       	or     rbp,QWORD PTR [rsp+0x10]
     10eb3ca:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10eb418:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10eb453:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0x10f3cfc..0x10f470c base=rsp
     10f4284:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     10f43dd:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     10f44d8:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     10f45ef:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx

### FDE 0x111209a..0x111362a base=rsp
     11122f1:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     111283b:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
     11128ee:	48 8b 8c 24 b8 01 00 	mov    rcx,QWORD PTR [rsp+0x1b8]
     111295b:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
     111297a:	48 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rsi
     1112af4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### FDE 0x11194e6..0x111958a base=rsp
     1119507:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     1119527:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
     111956a:	48 3b 84 24 b8 01 00 	cmp    rax,QWORD PTR [rsp+0x1b8]

### FDE 0x11237a4..0x1123d7b base=rsp
     1123810:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1123815:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     11238c0:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1123a65:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1123b31:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     1123bbb:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1123bde:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
     1123c1e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1123cbf:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1123d4e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x112c5ea..0x112c833 base=rsp
     112c68d:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     112c714:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]
     112c734:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     112c78c:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     112c794:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
     112c806:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x1144dce..0x1145447 base=rax
     1144f12:	83 a0 b8 01 00 00 00 	and    DWORD PTR [rax+0x1b8],0x0
     11453a1:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0x1161682..0x11648bf base=r15
     1161747:	49 83 bf b8 01 00 00 	cmp    QWORD PTR [r15+0x1b8],0x0
     1162110:	41 80 4f 10 01       	or     BYTE PTR [r15+0x10],0x1
     11626b1:	41 80 4f 10 01       	or     BYTE PTR [r15+0x10],0x1
     1162771:	49 89 5f 10          	mov    QWORD PTR [r15+0x10],rbx

### FDE 0x1161682..0x11648bf base=rsp
     11617d3:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     1161860:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11619a5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1161a46:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1161a7a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1161a8c:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     1161cef:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1161d0e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1161d45:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1161e0e:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     116200e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11621b3:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     1162263:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     116231a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     116257c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     116292f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1162982:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     1162d82:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     116318c:	4c 8b bc 24 b8 01 00 	mov    r15,QWORD PTR [rsp+0x1b8]
     1163304:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     1163794:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     1163be0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1163e98:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     1163fc2:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0x116541e..0x116623e base=rsp
     1165441:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1165826:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1165a42:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1165c69:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     1165ea5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1165f0f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1165f89:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0x117b168..0x117d708 base=rsp
     117b1b6:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     117b215:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     117b2b6:	f3 0f 7f 84 24 b8 01 	movdqu XMMWORD PTR [rsp+0x1b8],xmm0
     117b6c1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     117bafb:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117bb2e:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117bd28:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117be79:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117bfe8:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117c01b:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117c0a2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     117c2a9:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117c3fb:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117c567:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117c7c0:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117c7f4:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117c840:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117c887:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117c8d3:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117c917:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117c95b:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117c9bf:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117ca35:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117caab:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117cb21:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117d0fe:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117d132:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     117d196:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     117d6de:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x1185ffe..0x1186a27 base=rsp
     11860de:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     118611e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     11861a8:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     118624e:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     11864bb:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1186671:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     11866a0:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1186708:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1186732:	48 8d 94 24 b8 01 00 	lea    rdx,[rsp+0x1b8]
     1186757:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     11867c8:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     11868cb:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0x1192706..0x11930f9 base=rsp
     119285a:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     1192996:	ff b4 24 b8 01 00 00 	push   QWORD PTR [rsp+0x1b8]
     1192a07:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1192bb5:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]

### FDE 0x119544e..0x11958af base=rsp
     11954f8:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     1195507:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1195523:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     11955a4:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     11955e0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     11955f7:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     119560c:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     119562b:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     119563e:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     119569c:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     11956b1:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     11956d8:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     119571d:	48 8d 8c 24 b8 01 00 	lea    rcx,[rsp+0x1b8]
     1195806:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     1195851:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     1195869:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x11a0756..0x11a0c2f base=rbx
     11a0846:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     11a08cb:	88 83 b8 01 00 00    	mov    BYTE PTR [rbx+0x1b8],al
     11a09eb:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax

### FDE 0x11a0e52..0x11a20d2 base=rbx
     11a0ecd:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11a0f71:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11a17f1:	80 bb b8 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b8],0x0
     11a1a7f:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]
     11a1afb:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]

### FDE 0x11a68b2..0x11a732e base=rbx
     11a68e3:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11a6c5e:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11a6cd4:	4c 8b 8b b8 01 00 00 	mov    r9,QWORD PTR [rbx+0x1b8]
     11a6dd5:	48 ff 83 b8 01 00 00 	inc    QWORD PTR [rbx+0x1b8]
     11a70df:	4c 8b 8b b8 01 00 00 	mov    r9,QWORD PTR [rbx+0x1b8]

### FDE 0x11abbd4..0x11ac04d base=rsp
     11abc78:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     11abc85:	0f b6 44 24 10       	movzx  eax,BYTE PTR [rsp+0x10]
     11abcb1:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     11abdc6:	48 8b 94 24 b8 01 00 	mov    rdx,QWORD PTR [rsp+0x1b8]
     11abf4e:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     11ac019:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0x11b2d58..0x11b3089 base=rsp
     11b2d73:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     11b2e43:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11b2e62:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     11b2f8a:	48 3b 84 24 b8 01 00 	cmp    rax,QWORD PTR [rsp+0x1b8]

### FDE 0x11b72a6..0x11b9f8f base=rsp
     11b84f0:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     11b85fa:	48 c7 44 24 10 20 00 	mov    QWORD PTR [rsp+0x10],0x20
     11b8724:	48 c7 44 24 10 20 00 	mov    QWORD PTR [rsp+0x10],0x20
     11b8b99:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     11b8c38:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     11b91de:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     11b9490:	48 c7 44 24 10 20 00 	mov    QWORD PTR [rsp+0x10],0x20
     11b9860:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x11c949e..0x11c9ef4 base=r14
     11c958d:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     11c9d29:	41 0f 11 86 b8 01 00 	movups XMMWORD PTR [r14+0x1b8],xmm0

### FDE 0x11ca706..0x11cd602 base=rbp
     11ca8de:	4c 8b 6d 10          	mov    r13,QWORD PTR [rbp+0x10]
     11cace8:	48 8d 8d b8 01 00 00 	lea    rcx,[rbp+0x1b8]
     11cbce5:	4c 89 75 10          	mov    QWORD PTR [rbp+0x10],r14

### FDE 0x11ca706..0x11cd602 base=rbx
     11ca8ff:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     11ca91f:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     11ca974:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     11cac1b:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     11cac48:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     11cae13:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     11caf6c:	48 83 8b b8 01 00 00 	or     QWORD PTR [rbx+0x1b8],0xffffffffffffffff
     11cb5e6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     11cb63a:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     11cb702:	66 0f 11 43 10       	movupd XMMWORD PTR [rbx+0x10],xmm0
     11ccb58:	48 83 7b 10 00       	cmp    QWORD PTR [rbx+0x10],0x0
     11ccb84:	ff 53 10             	call   QWORD PTR [rbx+0x10]
     11ccb99:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     11ccba7:	0f 11 4b 10          	movups XMMWORD PTR [rbx+0x10],xmm1
     11ccbad:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     11ccbc1:	0f 10 43 10          	movups xmm0,XMMWORD PTR [rbx+0x10]
     11ccbca:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0

### FDE 0x11d1fc6..0x11d2717 base=rax
     11d2006:	48 8b 80 b8 01 00 00 	mov    rax,QWORD PTR [rax+0x1b8]
     11d2046:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11d238a:	8b 50 10             	mov    edx,DWORD PTR [rax+0x10]
     11d23eb:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]
     11d25e2:	44 89 78 10          	mov    DWORD PTR [rax+0x10],r15d

### FDE 0x11d4aba..0x11d4ea4 base=rbx
     11d4b64:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
     11d4bba:	48 83 bb b8 01 00 00 	cmp    QWORD PTR [rbx+0x1b8],0x0
     11d4c17:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     11d4cce:	48 8d ab b8 01 00 00 	lea    rbp,[rbx+0x1b8]

### FDE 0x11d5ccc..0x11d6045 base=rax
     11d5e16:	80 b8 b8 01 00 00 00 	cmp    BYTE PTR [rax+0x1b8],0x0
     11d5e1f:	c6 80 b8 01 00 00 00 	mov    BYTE PTR [rax+0x1b8],0x0
     11d5ea3:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0x11e5be0..0x11e612d base=rbx
     11e5c30:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     11e5d20:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     11e5db0:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     11e5dbb:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     11e5ddc:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     11e5de3:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     11e5deb:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
     11e5df4:	4c 3b b3 b8 01 00 00 	cmp    r14,QWORD PTR [rbx+0x1b8]
     11e5dfd:	4c 89 b3 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],r14

### FDE 0x11ea0a7..0x11eb6f2 base=rsp
     11ea0bc:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     11eab04:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eabf5:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eaccb:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     11eadf1:	f2 0f 11 44 24 10    	movsd  QWORD PTR [rsp+0x10],xmm0
     11eae33:	f2 0f 58 44 24 10    	addsd  xmm0,QWORD PTR [rsp+0x10]
     11eaf54:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     11eb080:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
     11eb1cb:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]

### FDE 0x11ef334..0x11f5af4 base=rsp
     11ef3c2:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     11efdbc:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f048f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f0c9d:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f150e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f16fe:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     11f23eb:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f35d4:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f3aa3:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     11f3bf7:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f40c6:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     11f45aa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f4625:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f49ac:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     11f4a5d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11f4be6:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     11f5333:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11f537e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11f58dc:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11f5921:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11f5981:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]

### FDE 0x120290a..0x1203fe5 base=rsp
     1202a98:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
     1202cb5:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
     12031cd:	48 8d ac 24 b8 01 00 	lea    rbp,[rsp+0x1b8]
     12033ab:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     120359f:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     12039a2:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1203a53:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1203da0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1203f80:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x120912a..0x12093a7 base=rsp
     12091e8:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
     1209296:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
     12092a0:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x1
     12092b0:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]

### FDE 0x12095bc..0x1209938 base=rsp
     1209614:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
     12097fa:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     120983b:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]

### FDE 0x1209938..0x1209b4c base=rsp
     1209a59:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     1209aa3:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1209ab7:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]

### FDE 0x1209b4c..0x1209d60 base=rsp
     1209c6d:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     1209cb7:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1209ccb:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]

### FDE 0x1209d60..0x1209f74 base=rsp
     1209e81:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     1209ecb:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1209edf:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]

### FDE 0x120a7ee..0x120ab51 base=rsp
     120a7ff:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     120a847:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     120aa38:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]

### FDE 0x120d01e..0x120f726 base=rsp
     120d855:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     120dcb2:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     120dfda:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     120e5e3:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     120ec10:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     120ecb2:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     120ed2b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     120ee0e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     120f12b:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
     120f20f:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     120f280:	48 01 84 24 b8 01 00 	add    QWORD PTR [rsp+0x1b8],rax
     120f341:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x1215e6c..0x1216e21 base=rsp
     1215f96:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
     12165cb:	89 6c 24 10          	mov    DWORD PTR [rsp+0x10],ebp
     121667d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     12166ab:	48 23 44 24 10       	and    rax,QWORD PTR [rsp+0x10]
     12166e8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     121682f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     121693e:	8b 6c 24 10          	mov    ebp,DWORD PTR [rsp+0x10]

### FDE 0x1222316..0x12229cd base=rsp
     12223f3:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     12227dc:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1222800:	4c 8d 4c 24 10       	lea    r9,[rsp+0x10]

### FDE 0x12292ed..0x1229863 base=rsp
     1229303:	4c 89 44 24 10       	mov    QWORD PTR [rsp+0x10],r8
     122936e:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12295df:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al

### FDE 0x122e1da..0x1230a86 base=rax
     122e57e:	ff 50 10             	call   QWORD PTR [rax+0x10]
     122e795:	ff 50 10             	call   QWORD PTR [rax+0x10]
     122e814:	ff 50 10             	call   QWORD PTR [rax+0x10]
     122e926:	ff 50 10             	call   QWORD PTR [rax+0x10]
     122e9e2:	4c 8d b8 b8 01 00 00 	lea    r15,[rax+0x1b8]
     122f8b5:	8a 40 10             	mov    al,BYTE PTR [rax+0x10]
     122ff11:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
     123002c:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
     123026b:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12306e8:	ff 50 10             	call   QWORD PTR [rax+0x10]
     123078d:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0x122e1da..0x1230a86 base=rsp
     122eeeb:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     122ef48:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     122f056:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     122f77e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     122f795:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
     122fb2f:	89 4c 24 10          	mov    DWORD PTR [rsp+0x10],ecx
     122fb3f:	c7 44 24 10 00 00 00 	mov    DWORD PTR [rsp+0x10],0x0
     122fc45:	0f b6 4c 24 10       	movzx  ecx,BYTE PTR [rsp+0x10]

### FDE 0x123c020..0x123c758 base=rsp
     123c037:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     123c089:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     123c18d:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     123c332:	83 bc 24 b8 01 00 00 	cmp    DWORD PTR [rsp+0x1b8],0x4
     123c340:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     123c3e6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123c459:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123c518:	83 bc 24 b8 01 00 00 	cmp    DWORD PTR [rsp+0x1b8],0x3f
     123c54f:	83 bc 24 b8 01 00 00 	cmp    DWORD PTR [rsp+0x1b8],0x3f
     123c570:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     123c5c4:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]

### FDE 0x123c81c..0x1240fd8 base=rsp
     123c8ef:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     123c91c:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     123c958:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     123c9ce:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     123c9fb:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123ca35:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123caaa:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123cb1e:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123ccc7:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123cd3f:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123ce7d:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123ce87:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123cefc:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123cf70:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123d1c3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123d243:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123d2bb:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123d4ab:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123d4b8:	4c 8b a4 24 b8 01 00 	mov    r12,QWORD PTR [rsp+0x1b8]
     123d4e6:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123d537:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123d5ab:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     123d6af:	4c 8b a4 24 b8 01 00 	mov    r12,QWORD PTR [rsp+0x1b8]
     123d7b4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     123d81e:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123d856:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123d9bd:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123d9d2:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
     123db3b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123e0c5:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123e28b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123e391:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123e6e3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123eb08:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123ef29:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123f3d1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123f586:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123fb48:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123fdd8:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123fdfd:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     123fe50:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12401fe:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1240237:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1240759:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12407de:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x1254996..0x1254fe4 base=rax
     1254b44:	48 63 80 b8 01 00 00 	movsxd rax,DWORD PTR [rax+0x1b8]
     1254c6e:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1254cd4:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1254d35:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1254d55:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1254e11:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0x1294f7a..0x129606d base=r15
     1295227:	49 8d 7f 10          	lea    rdi,[r15+0x10]
     1295617:	49 8d 7f 10          	lea    rdi,[r15+0x10]
     12957d7:	49 89 77 10          	mov    QWORD PTR [r15+0x10],rsi
     12958ba:	49 8b 5f 10          	mov    rbx,QWORD PTR [r15+0x10]
     1295e71:	49 8d 87 b8 01 00 00 	lea    rax,[r15+0x1b8]

### FDE 0x1298d86..0x129a87b base=rsp
     129920f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1299277:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     129933e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     129937b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1299c82:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     129a33f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     129a36e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     129a38f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     129a48f:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     129a6a8:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x12a7e6a..0x12ab264 base=rsp
     12a8152:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
     12a8254:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     12a8468:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     12a84a0:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     12a985b:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     12a98cd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12aa06a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12aa099:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     12aa0ca:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12aa126:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     12aa152:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12aa904:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     12ab06e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12ab176:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0x12b8d85..0x12b94a2 base=rsp
     12b8f11:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     12b933c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### FDE 0x12be0eb..0x12bf1c4 base=rsp
     12be10d:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     12be12c:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
     12bec17:	80 bc 24 b8 01 00 00 	cmp    BYTE PTR [rsp+0x1b8],0x0
     12bec23:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12bec93:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]

### FDE 0x12cd240..0x12cf4c0 base=rax
     12cd26f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12ce4b5:	48 8d b0 b8 01 00 00 	lea    rsi,[rax+0x1b8]
     12ce766:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     12ce8a3:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
     12ceae0:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     12ced01:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14

### FDE 0x12d0bc4..0x12d38ce base=rsp
     12d0bdf:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     12d0f4f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0f71:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0f92:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0fb3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0fd4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0ff5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1016:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d103a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d105b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d107f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1193:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d11b7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1234:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d12e7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d13e4:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d1447:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1554:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1658:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     12d165d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d166f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d168a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d172b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d173d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1758:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d17f5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1807:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1822:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d18a1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d18b3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d18ce:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1948:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1981:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d19d0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d19df:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1e24:	f3 0f 11 44 24 10    	movss  DWORD PTR [rsp+0x10],xmm0
     12d1edc:	0f 2e 44 24 10       	ucomiss xmm0,DWORD PTR [rsp+0x10]
     12d237d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     12d2392:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     12d2469:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     12d248f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d2512:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d2564:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12d25fd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2612:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d262d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2672:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     12d269b:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     12d27e6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d27fe:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2819:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2872:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2888:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d28c7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2a7c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2a96:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2ab3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2d60:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2d78:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2d93:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2f4a:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d2fbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2ffa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d3018:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d303a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d30ac:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d30e3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d30f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12d311e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d3217:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d3229:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d3241:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d32af:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]

### FDE 0x12f0f66..0x12f14ed base=rsp
     12f10e2:	48 8b ac 24 b8 01 00 	mov    rbp,QWORD PTR [rsp+0x1b8]
     12f12bf:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     12f12cc:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     12f12d7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0

### FDE 0x12feb98..0x12ff8c1 base=rsp
     12fecc2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     12ff0a2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12ff2df:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12ff439:	4c 8d 84 24 b8 01 00 	lea    r8,[rsp+0x1b8]
     12ff5a2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12ff65c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12ff6e8:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x1308272..0x130868f base=rsp
     13082b5:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     1308307:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     1308552:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x130c10c..0x130c5d8 base=rsp
     130c205:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
     130c224:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     130c391:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]

### FDE 0x1314efc..0x131578b base=rsp
     1314f0d:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     13150ee:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     131560d:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     1315666:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1315686:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1315699:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]

### FDE 0x131fcbc..0x1320fc4 base=r15
     1320671:	41 80 4f 10 02       	or     BYTE PTR [r15+0x10],0x2
     13206d6:	45 8a b7 b8 01 00 00 	mov    r14b,BYTE PTR [r15+0x1b8]
     13207a8:	41 80 4f 10 20       	or     BYTE PTR [r15+0x10],0x20
     132082c:	4d 8d 77 10          	lea    r14,[r15+0x10]

### FDE 0x1332e00..0x1334bda base=rsp
     133301e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1333036:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     1333159:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     1333181:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     133323d:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     1333245:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
     133329a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1333887:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1333950:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     1333fb8:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1334081:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     133414c:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     13343ce:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1334570:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     133457d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     1334947:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1334b57:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x13390b8..0x1339999 base=rsp
     1339265:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     13395a6:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     1339604:	48 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rsi
     13396a5:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
     133984c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x134ed8e..0x134f023 base=rsp
     134edf9:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
     134ee16:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     134ef58:	44 8b 8c 24 b8 01 00 	mov    r9d,DWORD PTR [rsp+0x1b8]
     134eff9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]

### FDE 0x13524a4..0x1353454 base=rax
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     1352788:	48 89 50 10          	mov    QWORD PTR [rax+0x10],rdx
     135298b:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     1352a5c:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     1352c2a:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     1352cf7:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14

### FDE 0x135a74c..0x135c1fa base=rsp
     135ab00:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     135abcb:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135ac2f:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     135acf8:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135ad92:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135ade0:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135adea:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135b1c3:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135b91c:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
     135b92d:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135bacd:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     135bb27:	4c 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r13
     135bbd3:	0f 10 84 24 b8 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1b8]
     135bc48:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135bcf1:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     135be4e:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     135bf35:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135bf88:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     135c164:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]

### FDE 0x135c878..0x135d055 base=rsp
     135c8cb:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     135ce42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135ce83:	48 8b 8c 24 b8 01 00 	mov    rcx,QWORD PTR [rsp+0x1b8]

### FDE 0x135d056..0x1360c1b base=rsp
     135d27f:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     135d74b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135da11:	ff 74 24 10          	push   QWORD PTR [rsp+0x10]
     135dd3f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135df3c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135df45:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     135e1c1:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f841:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     135fa50:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135fb6d:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     13600b6:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1360237:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     136028e:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     136031c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     13603d3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1360440:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     13604b2:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     136055b:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     1360581:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     13605a7:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     13605dd:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     1360603:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     1360611:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     1360637:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     136065d:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     13606d9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     136073f:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     1360af5:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x13635f7..0x1364201 base=rbx
     13636dc:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     1363824:	c6 83 b8 01 00 00 00 	mov    BYTE PTR [rbx+0x1b8],0x0
     1363e6c:	4c 8d 73 10          	lea    r14,[rbx+0x10]

### FDE 0x13683ac..0x1369590 base=rsp
     1368946:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     136901b:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     13690ec:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0

### FDE 0x136d9d2..0x136e050 base=rsp
     136dcc0:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     136ddea:	0f 95 84 24 b8 01 00 	setne  BYTE PTR [rsp+0x1b8]
     136de3d:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]

### FDE 0x136f65c..0x136fdf6 base=rax
     136f792:	48 8d 70 10          	lea    rsi,[rax+0x10]
     136f85b:	48 8d 70 10          	lea    rsi,[rax+0x10]
     136f9b3:	48 8d 70 10          	lea    rsi,[rax+0x10]
     136f9fe:	4c 8d b8 b8 01 00 00 	lea    r15,[rax+0x1b8]
     136fa35:	48 8d 70 10          	lea    rsi,[rax+0x10]

### FDE 0x1388a60..0x1389a0c base=rsp
     1388bde:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
     1388d3c:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     13893b0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1389559:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
     13895d4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     138960e:	4c 8b 5c 24 10       	mov    r11,QWORD PTR [rsp+0x10]
     13896e8:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     1389726:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]

### FDE 0x1391aee..0x1392698 base=rsp
     1391c6f:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
     1391e68:	0f 10 8c 24 b8 01 00 	movups xmm1,XMMWORD PTR [rsp+0x1b8]
     1391e8f:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0

### FDE 0x13946aa..0x1395322 base=rbx
     1394749:	f3 0f 6f 43 10       	movdqu xmm0,XMMWORD PTR [rbx+0x10]
     1394caf:	48 8b 8b b8 01 00 00 	mov    rcx,QWORD PTR [rbx+0x1b8]

### FDE 0x1397876..0x13980d9 base=rsp
     13979a8:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     1397be9:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1397dcd:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     1397ef8:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x13ab8aa..0x13ac1ed base=rbx
     13abb34:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
     13abc98:	88 83 b8 01 00 00    	mov    BYTE PTR [rbx+0x1b8],al

### FDE 0x13c006a..0x13d1a85 base=r13
     13c1f99:	41 83 7d 10 00       	cmp    DWORD PTR [r13+0x10],0x0
     13c2166:	4d 8d 6d 10          	lea    r13,[r13+0x10]
     13ccb82:	41 8b 8d b8 01 00 00 	mov    ecx,DWORD PTR [r13+0x1b8]
     13ccc04:	41 8b 8d b8 01 00 00 	mov    ecx,DWORD PTR [r13+0x1b8]
     13ccc86:	41 8b 8d b8 01 00 00 	mov    ecx,DWORD PTR [r13+0x1b8]
     13d19a1:	45 8b 65 10          	mov    r12d,DWORD PTR [r13+0x10]

### FDE 0x13d5824..0x13d8245 base=r15
     13d5bb6:	41 c7 87 b8 01 00 00 	mov    DWORD PTR [r15+0x1b8],0xffff
     13d66e5:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     13d6819:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     13d6929:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     13d6c8d:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     13d6ce2:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     13d7023:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     13d7157:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
     13d72a0:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0

### FDE 0x13eb418..0x13eb992 base=rax
     13eb715:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     13eb779:	83 a0 b8 01 00 00 00 	and    DWORD PTR [rax+0x1b8],0x0
     13eb846:	83 a0 b8 01 00 00 00 	and    DWORD PTR [rax+0x1b8],0x0
     13eb8f6:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]

### FDE 0x13f4cc4..0x13f57a9 base=rsp
     13f5139:	c7 44 24 10 00 00 00 	mov    DWORD PTR [rsp+0x10],0x0
     13f52ce:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
     13f53e1:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
     13f53f1:	4c 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r13
     13f5459:	48 63 54 24 10       	movsxd rdx,DWORD PTR [rsp+0x10]
     13f5489:	8b 54 24 10          	mov    edx,DWORD PTR [rsp+0x10]
     13f548f:	89 54 24 10          	mov    DWORD PTR [rsp+0x10],edx

### FDE 0x13fbb95..0x13ff745 base=rax
     13fee2f:	8b 90 b8 01 00 00    	mov    edx,DWORD PTR [rax+0x1b8]
     13ff641:	89 88 b8 01 00 00    	mov    DWORD PTR [rax+0x1b8],ecx
     13ff673:	89 48 10             	mov    DWORD PTR [rax+0x10],ecx

### FDE 0x1411be4..0x14128bf base=rsp
     1411cfe:	48 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbp
     1411d37:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     1411d87:	48 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbp
     1411dc6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1

### FDE 0x141329e..0x1413a8b base=rsp
     1413755:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     1413942:	89 4c 24 10          	mov    DWORD PTR [rsp+0x10],ecx

### FDE 0x1421d56..0x1422627 base=rdi
     1421d59:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     1421d73:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     14221e7:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax

### FDE 0x1421d56..0x1422627 base=rsi
     1421d6f:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
     1421d7a:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     14221e0:	48 8b 86 b8 01 00 00 	mov    rax,QWORD PTR [rsi+0x1b8]

### FDE 0x1435020..0x1436dd5 base=rbx
     143509b:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
     143515f:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
     14351b2:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
     14351df:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
     1435720:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
     1435754:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     1435773:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     143595e:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     1435bf1:	0f 10 83 b8 01 00 00 	movups xmm0,XMMWORD PTR [rbx+0x1b8]
     1435c0f:	0f 11 8b b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm1
     1436a0d:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]

### FDE 0x1435020..0x1436dd5 base=rsp
     14350bb:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     1435163:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     14351b6:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     1435739:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     1435831:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1
     1435bad:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     1435f81:	0f 11 4c 24 10       	movups XMMWORD PTR [rsp+0x10],xmm1

### FDE 0x143a734..0x143ad68 base=rsp
     143a83f:	48 89 94 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdx
     143ab07:	48 8d 44 24 10       	lea    rax,[rsp+0x10]

### FDE 0x144e012..0x144e23a base=rax
     144e098:	44 8a a8 b8 01 00 00 	mov    r13b,BYTE PTR [rax+0x1b8]
     144e15c:	48 89 70 10          	mov    QWORD PTR [rax+0x10],rsi

### FDE 0x144f226..0x144f557 base=rsp
     144f2a8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     144f2d5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     144f35a:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     144f371:	48 8b b4 24 b8 01 00 	mov    rsi,QWORD PTR [rsp+0x1b8]
     144f381:	48 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [rsp+0x1b8]
     144f433:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### FDE 0x145622c..0x14567ca base=rsp
     14562ea:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     1456670:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]

### FDE 0x1457d06..0x14587de base=rsp
     1457f46:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     14582b3:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     14582cb:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]

### FDE 0x14740f4..0x147584c base=rax
     1474157:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
     1474195:	44 88 78 10          	mov    BYTE PTR [rax+0x10],r15b
     1474895:	48 8d 88 b8 01 00 00 	lea    rcx,[rax+0x1b8]
     1475256:	80 78 10 00          	cmp    BYTE PTR [rax+0x10],0x0
     147548d:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     147552b:	80 78 10 00          	cmp    BYTE PTR [rax+0x10],0x0

### FDE 0x1480242..0x148086f base=rsp
     148047f:	89 4c 24 10          	mov    DWORD PTR [rsp+0x10],ecx
     14804c9:	3b 44 24 10          	cmp    eax,DWORD PTR [rsp+0x10]
     148060a:	88 8c 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],cl
     148071a:	88 8c 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],cl

### FDE 0x1483002..0x1483c35 base=r12
     1483336:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     1483458:	49 8b 84 24 b8 01 00 	mov    rax,QWORD PTR [r12+0x1b8]
     14838c0:	49 ff 84 24 b8 01 00 	inc    QWORD PTR [r12+0x1b8]

### FDE 0x14a0ad4..0x14a1134 base=rsp
     14a0ae5:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
     14a0cbb:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14a0f0c:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0x14b91f2..0x14ba12f base=r15
     14b9a6b:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
     14b9c34:	49 89 87 b8 01 00 00 	mov    QWORD PTR [r15+0x1b8],rax

### FDE 0x14bb042..0x14bb90c base=r15
     14bb0a3:	49 8b 87 b8 01 00 00 	mov    rax,QWORD PTR [r15+0x1b8]
     14bb610:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0

### FDE 0x14bc4aa..0x14bda9d base=rax
     14bc6c4:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14bd2bf:	ff 50 10             	call   QWORD PTR [rax+0x10]
     14bd60c:	ff 90 b8 01 00 00    	call   QWORD PTR [rax+0x1b8]
     14bd6bb:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0x14cdc2a..0x14d4d4c base=r13
     14ce19e:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14ce1e3:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14cf20f:	41 88 85 b8 01 00 00 	mov    BYTE PTR [r13+0x1b8],al
     14cf2c6:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14cf5d6:	41 c6 85 b8 01 00 00 	mov    BYTE PTR [r13+0x1b8],0x1
     14cf624:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
     14cfbb8:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
     14cfe14:	49 8d 7d 10          	lea    rdi,[r13+0x10]
     14d3971:	49 8b 7d 10          	mov    rdi,QWORD PTR [r13+0x10]
     14d3b6c:	49 8b 7d 10          	mov    rdi,QWORD PTR [r13+0x10]

### FDE 0x14cdc2a..0x14d4d4c base=r14
     14ce21f:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14ce287:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14cef1a:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
     14cf56f:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     14cf6a0:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     14d3211:	41 88 86 b8 01 00 00 	mov    BYTE PTR [r14+0x1b8],al

### FDE 0x14cdc2a..0x14d4d4c base=r12
     14d0b40:	f3 41 0f 7f 44 24 10 	movdqu XMMWORD PTR [r12+0x10],xmm0
     14d0b9c:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0c5f:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0d25:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0d97:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0e5a:	49 8b 5c 24 10       	mov    rbx,QWORD PTR [r12+0x10]
     14d0f20:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d0f96:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]
     14d20e9:	f3 41 0f 7f 84 24 b8 	movdqu XMMWORD PTR [r12+0x1b8],xmm0
     14d2217:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     14d32bf:	f3 41 0f 6f 44 24 10 	movdqu xmm0,XMMWORD PTR [r12+0x10]
     14d3d5c:	4d 8d b4 24 b8 01 00 	lea    r14,[r12+0x1b8]

### FDE 0x14ef972..0x14efc1d base=rsp
     14ef9ca:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     14efa02:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     14efb36:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     14efb74:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     14efbf0:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x14f69f0..0x14f78a8 base=rsp
     14f6bd4:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     14f6dda:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     14f6e2e:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     14f710a:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]
     14f7253:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     14f759b:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     14f7631:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]

### FDE 0x14f806c..0x14f819e base=rbx
     14f80b6:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]
     14f8194:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]

### FDE 0x14faad2..0x14fb0ea base=rsp
     14fad7e:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
     14fada9:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     14faebf:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     14fafb5:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x1505b4a..0x15062bb base=r12
     1505fa9:	41 c6 84 24 b8 01 00 	mov    BYTE PTR [r12+0x1b8],0x0
     15060f1:	4d 8b 74 24 10       	mov    r14,QWORD PTR [r12+0x10]

### FDE 0x15098f8..0x150b628 base=rsp
     1509968:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     1509ba8:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1509bd5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a513:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a53d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a925:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150a94f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150ab5d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150ac38:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150ac78:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     150ac92:	83 7c 24 10 00       	cmp    DWORD PTR [rsp+0x10],0x0
     150ad32:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     150add7:	83 7c 24 10 00       	cmp    DWORD PTR [rsp+0x10],0x0
     150ae29:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0x1511570..0x15117dd base=rdi
     1511581:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     151165b:	48 89 b7 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rsi

### FDE 0x15146d4..0x151483a base=rbx
     1514784:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
     15147c7:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]

### FDE 0x15182d6..0x1519a71 base=r13
     1518b75:	41 0f 11 85 b8 01 00 	movups XMMWORD PTR [r13+0x1b8],xmm0
     15196a3:	41 0f 11 45 10       	movups XMMWORD PTR [r13+0x10],xmm0

### FDE 0x151ae16..0x151c944 base=rsp
     151b1fa:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     151b36e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     151b429:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     151b48a:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     151b4ec:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     151b6fa:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     151b760:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     151b7b7:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     151b7df:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
     151b9aa:	4c 8b 44 24 10       	mov    r8,QWORD PTR [rsp+0x10]
     151b9c8:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     151bb8c:	40 88 6c 24 10       	mov    BYTE PTR [rsp+0x10],bpl
     151bc5e:	40 8a 6c 24 10       	mov    bpl,BYTE PTR [rsp+0x10]
     151bdef:	40 8a 6c 24 10       	mov    bpl,BYTE PTR [rsp+0x10]
     151bff2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     151c1e1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     151c258:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     151c675:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     151c908:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x151f0d6..0x15219ce base=r15
     15203e8:	49 89 87 b8 01 00 00 	mov    QWORD PTR [r15+0x1b8],rax
     1521016:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
     15210bf:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0

### FDE 0x15229bc..0x1523550 base=rbx
     15229eb:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     1522cbc:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax

### FDE 0x1529234..0x152a3cb base=rbx
     152926a:	80 4b 10 04          	or     BYTE PTR [rbx+0x10],0x4
     1529330:	48 8b bb b8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1b8]

### FDE 0x155cffd..0x155d293 base=rbx
     155d09c:	80 7b 10 00          	cmp    BYTE PTR [rbx+0x10],0x0
     155d1f1:	80 bb b8 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b8],0x0

### FDE 0x156bc42..0x156c858 base=r12
     156bde3:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     156be4f:	49 8d 7c 24 10       	lea    rdi,[r12+0x10]
     156c17c:	49 8d bc 24 b8 01 00 	lea    rdi,[r12+0x1b8]

### FDE 0x1576f08..0x157762f base=rax
     1577158:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
     1577430:	48 2b b0 b8 01 00 00 	sub    rsi,QWORD PTR [rax+0x1b8]

### FDE 0x1576f08..0x157762f base=r13
     15772bb:	41 80 4d 10 06       	or     BYTE PTR [r13+0x10],0x6
     1577447:	4d 8b b5 b8 01 00 00 	mov    r14,QWORD PTR [r13+0x1b8]

### FDE 0x1589ca8..0x1589d64 base=rdi
     1589cc9:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     1589d2b:	88 87 b8 01 00 00    	mov    BYTE PTR [rdi+0x1b8],al

### FDE 0x15945b8..0x1594891 base=rsp
     15946ed:	48 8b 9c 24 b8 01 00 	mov    rbx,QWORD PTR [rsp+0x1b8]
     1594750:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx

### FDE 0x15b4718..0x15b50c8 base=rsp
     15b49a6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     15b4a26:	4c 89 a4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r12
     15b4a64:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     15b4a81:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     15b4bee:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     15b4bf5:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     15b4e15:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     15b4e74:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
     15b4e81:	48 89 bc 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rdi
     15b4ec7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     15b4ece:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### FDE 0x15b9360..0x15bbee9 base=r12
     15b980a:	41 c6 44 24 10 01    	mov    BYTE PTR [r12+0x10],0x1
     15ba035:	41 c6 44 24 10 01    	mov    BYTE PTR [r12+0x10],0x1
     15ba302:	41 c6 44 24 10 01    	mov    BYTE PTR [r12+0x10],0x1
     15ba424:	49 8d bc 24 b8 01 00 	lea    rdi,[r12+0x1b8]
     15bad2a:	41 c6 44 24 10 01    	mov    BYTE PTR [r12+0x10],0x1

### FDE 0x15c3150..0x15c362a base=rsp
     15c320c:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x0
     15c3286:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     15c3491:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     15c3498:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
     15c34e7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     15c3501:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     15c3582:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0x15c93f0..0x15c9e20 base=rsp
     15c948e:	c7 84 24 b8 01 00 00 	mov    DWORD PTR [rsp+0x1b8],0x3f800000
     15c94da:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
     15c9539:	8b 84 24 b8 01 00 00 	mov    eax,DWORD PTR [rsp+0x1b8]
     15c9993:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     15c9ae9:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     15c9b5a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0x15d40b4..0x15d46d2 base=rsp
     15d4102:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
     15d4148:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
     15d4555:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     15d4573:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]

### FDE 0x15ea526..0x15ea7cd base=rsp
     15ea6b2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     15ea6cf:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
     15ea6fe:	4c 8d a4 24 b8 01 00 	lea    r12,[rsp+0x1b8]
     15ea7ae:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]

### FDE 0x15f1cb0..0x15f2493 base=r14
     15f1fae:	41 0f 11 86 b8 01 00 	movups XMMWORD PTR [r14+0x1b8],xmm0
     15f22e3:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]

### FDE 0x15fd848..0x15fdcdf base=rsp
     15fd884:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     15fd8d9:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     15fd8f6:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]
     15fd9c6:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     15fdaac:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     15fdc7e:	48 8b bc 24 b8 01 00 	mov    rdi,QWORD PTR [rsp+0x1b8]

### FDE 0x1610a36..0x16114a2 base=rbx
     1610a82:	48 8b 83 b8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1b8]
     1610b6b:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     1610c49:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax

### FDE 0x1630070..0x1632440 base=rbx
     1630371:	c7 43 10 02 00 00 00 	mov    DWORD PTR [rbx+0x10],0x2
     1630e52:	89 83 b8 01 00 00    	mov    DWORD PTR [rbx+0x1b8],eax
     1631890:	c7 43 10 02 00 00 00 	mov    DWORD PTR [rbx+0x10],0x2
     1631e3c:	83 63 10 00          	and    DWORD PTR [rbx+0x10],0x0
     1631fc9:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0

### FDE 0x1632440..0x1633995 base=r14
     1632cd6:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
     1633218:	41 8b 8e b8 01 00 00 	mov    ecx,DWORD PTR [r14+0x1b8]

### FDE 0x164879c..0x1648d46 base=r14
     1648a41:	41 89 8e b8 01 00 00 	mov    DWORD PTR [r14+0x1b8],ecx
     1648c52:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0

### FDE 0x1652302..0x165248c base=rdi
     1652310:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     1652483:	48 83 a7 b8 01 00 00 	and    QWORD PTR [rdi+0x1b8],0x0

### FDE 0x1653d8c..0x1653f8d base=rdi
     1653d9d:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     1653ec1:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax

### FDE 0x1654356..0x165451d base=rdi
     1654367:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     165445e:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax

### FDE 0x1654a42..0x1654c43 base=rdi
     1654a53:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     1654b77:	48 89 87 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rax

### FDE 0x165655c..0x16566bb base=rdi
     165656a:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     1656639:	48 89 97 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rdx

### FDE 0x16566bc..0x1656827 base=rdi
     16566ca:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     1656736:	0f 11 87 b8 01 00 00 	movups XMMWORD PTR [rdi+0x1b8],xmm0

### FDE 0x16574a8..0x16578c2 base=r14
     1657792:	49 8d 96 b8 01 00 00 	lea    rdx,[r14+0x1b8]
     165789b:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]

### FDE 0x1658b4a..0x1658f42 base=r14
     1658e99:	49 8b 86 b8 01 00 00 	mov    rax,QWORD PTR [r14+0x1b8]
     1658f16:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]

### FDE 0x1687eb8..0x168981c base=rcx
     1688e2a:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
     1689612:	48 8d a9 b8 01 00 00 	lea    rbp,[rcx+0x1b8]

### FDE 0x168a568..0x168c6b7 base=r14
     168a5bf:	49 8d 56 10          	lea    rdx,[r14+0x10]
     168a5cd:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     168a773:	49 89 86 b8 01 00 00 	mov    QWORD PTR [r14+0x1b8],rax

### FDE 0x168a568..0x168c6b7 base=rsp
     168abe7:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     168acd2:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168aec6:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     168af8a:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168b15e:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     168b3ca:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
     168b4dc:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     168b552:	48 8d 9c 24 b8 01 00 	lea    rbx,[rsp+0x1b8]
     168b928:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168b996:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168bb05:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     168bc83:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168c3ae:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168c3c6:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168c3e8:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168c52f:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168c595:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     168c696:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]

### FDE 0x16b21f0..0x16b245d base=rdi
     16b2201:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     16b22db:	48 89 b7 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rsi

### FDE 0x16b7702..0x16b796f base=rdi
     16b7713:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     16b77ed:	48 89 b7 b8 01 00 00 	mov    QWORD PTR [rdi+0x1b8],rsi

### FDE 0x16d9d08..0x16db73b base=rsp
     16d9e0c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     16d9eb2:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     16da01a:	3b 84 24 b8 01 00 00 	cmp    eax,DWORD PTR [rsp+0x1b8]
     16da309:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     16da353:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     16da380:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     16da390:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     16da4a9:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
     16da749:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     16daef0:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     16daf24:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     16daf6a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     16daf88:	48 39 5c 24 10       	cmp    QWORD PTR [rsp+0x10],rbx
     16dafbd:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
     16db08b:	48 8b 94 24 b8 01 00 	mov    rdx,QWORD PTR [rsp+0x1b8]
     16db0c1:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     16db128:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     16db28c:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
     16db2fe:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0x16fe1fc..0x1703c8a base=rsp
     16fec01:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
     16ffedc:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1700339:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     170079a:	48 8b 9c 24 b8 01 00 	mov    rbx,QWORD PTR [rsp+0x1b8]
     1700847:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax

### FDE 0x178ba1e..0x178bfa7 base=r14
     178bb3d:	49 8d 9e b8 01 00 00 	lea    rbx,[r14+0x1b8]
     178bb8a:	4d 8b 66 10          	mov    r12,QWORD PTR [r14+0x10]

### FDE 0x17c81da..0x17c971f base=rsp
     17c831f:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x0
     17c87eb:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x0
     17c88a3:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
     17c8952:	f6 44 24 10 02       	test   BYTE PTR [rsp+0x10],0x2
     17c8a51:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x0
     17c8d33:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     17c8f9a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     17c90f2:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x1
     17c9126:	c6 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],0x0
     17c925d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     17c9290:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     17c92fb:	3a 5c 24 10          	cmp    bl,BYTE PTR [rsp+0x10]
     17c9353:	48 83 7c 24 10 00    	cmp    QWORD PTR [rsp+0x10],0x0
     17c935f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     17c946f:	3a 5c 24 10          	cmp    bl,BYTE PTR [rsp+0x10]
     17c9488:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]

### FDE 0x17e7b19..0x17ea67c base=rsp
     17e7bb3:	f3 0f 11 54 24 10    	movss  DWORD PTR [rsp+0x10],xmm2
     17e7c58:	f3 0f 10 44 24 10    	movss  xmm0,DWORD PTR [rsp+0x10]
     17e8278:	f2 44 0f 11 bc 24 b8 	movsd  QWORD PTR [rsp+0x1b8],xmm15
     17e865a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     17e86fe:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     17e8b67:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     17e8ce3:	4c 3b 74 24 10       	cmp    r14,QWORD PTR [rsp+0x10]
     17e8d9e:	4c 3b 74 24 10       	cmp    r14,QWORD PTR [rsp+0x10]
     17e8f6a:	f2 44 0f 10 bc 24 b8 	movsd  xmm15,QWORD PTR [rsp+0x1b8]
     17e9103:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
     17e9272:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     17e93bf:	89 44 24 10          	mov    DWORD PTR [rsp+0x10],eax
     17e94f3:	89 74 24 10          	mov    DWORD PTR [rsp+0x10],esi
     17e9570:	8b 54 24 10          	mov    edx,DWORD PTR [rsp+0x10]
     17e95c5:	f3 0f 11 44 24 10    	movss  DWORD PTR [rsp+0x10],xmm0
     17e9660:	f3 0f 10 54 24 10    	movss  xmm2,DWORD PTR [rsp+0x10]
     17e967b:	f3 0f 11 54 24 10    	movss  DWORD PTR [rsp+0x10],xmm2
     17e96d7:	f3 44 0f 10 64 24 10 	movss  xmm12,DWORD PTR [rsp+0x10]
     17e978f:	f3 44 0f 11 64 24 10 	movss  DWORD PTR [rsp+0x10],xmm12
     17e979b:	f3 44 0f 10 64 24 10 	movss  xmm12,DWORD PTR [rsp+0x10]
     17e984f:	f3 44 0f 10 64 24 10 	movss  xmm12,DWORD PTR [rsp+0x10]
     17e99c3:	f3 44 0f 11 64 24 10 	movss  DWORD PTR [rsp+0x10],xmm12
     17e9abb:	f3 0f 5e 54 24 10    	divss  xmm2,DWORD PTR [rsp+0x10]
     17e9bdf:	f3 44 0f 10 64 24 10 	movss  xmm12,DWORD PTR [rsp+0x10]
     17e9e68:	f3 44 0f 11 64 24 10 	movss  DWORD PTR [rsp+0x10],xmm12
     17e9f99:	f3 0f 5e 54 24 10    	divss  xmm2,DWORD PTR [rsp+0x10]
     17ea1aa:	f3 44 0f 10 64 24 10 	movss  xmm12,DWORD PTR [rsp+0x10]
     17ea21a:	f3 44 0f 10 64 24 10 	movss  xmm12,DWORD PTR [rsp+0x10]
     17ea314:	f3 44 0f 10 64 24 10 	movss  xmm12,DWORD PTR [rsp+0x10]

## +0x1b8-gated factory owner rbx; FDE=(20260004, 20264020)
### Backward rbx definitions before slot-address fanout
- 0x1352575: mov    rbx,rax
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
     1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1352560:	4c 89 ff             	mov    rdi,r15
     1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
     1352575:	48 89 c3             	mov    rbx,rax
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     1352594:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     1352599:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     135259e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     13525a3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525a7:	48 8d 35 19 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     13525ae:	48 8d 0d 1b a8 08 ff 	lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     13525b5:	6a 08                	push   0x8
     13525b7:	41 5e                	pop    r14
     13525b9:	6a 24                	push   0x24
     13525bb:	41 58                	pop    r8
     13525bd:	4c 89 f2             	mov    rdx,r14
     13525c0:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     13525c6:	68 10 27 00 00       	push   0x2710
     13525cb:	6a 64                	push   0x64
     13525cd:	e8 20 50 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     13525d2:	48 83 c4 10          	add    rsp,0x10
     13525d6:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]

- 0x13524b8: mov    rbx,rdx
     13524a4:	55                   	push   rbp
     13524a5:	41 57                	push   r15
     13524a7:	41 56                	push   r14
     13524a9:	41 55                	push   r13
     13524ab:	41 54                	push   r12
     13524ad:	53                   	push   rbx
     13524ae:	48 81 ec 98 01 00 00 	sub    rsp,0x198
     13524b5:	49 89 ce             	mov    r14,rcx
     13524b8:	48 89 d3             	mov    rbx,rdx
     13524bb:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
     13524c2:	00 
     13524c3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13524ca:	00 00 
     13524cc:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
     13524d3:	00 
     13524d4:	48 89 cf             	mov    rdi,rcx
     13524d7:	e8 a2 3a 83 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
     13524dc:	49 89 c4             	mov    r12,rax
     13524df:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     13524e3:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
     13524e7:	ba 89 00 00 00       	mov    edx,0x89
     13524ec:	e8 ed fd 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     13524f1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13524f4:	4c 8b a8 48 04 00 00 	mov    r13,QWORD PTR [rax+0x448]
     13524fb:	4d 85 ed             	test   r13,r13
     13524fe:	0f 84 ee 0c 00 00    	je     13531f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198776>
     1352504:	4c 89 f7             	mov    rdi,r14
     1352507:	e8 94 0d 81 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     135250c:	49 89 c7             	mov    r15,rax
     135250f:	4c 89 f7             	mov    rdi,r14
     1352512:	e8 77 47 96 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     1352517:	8a 88 88 00 00 00    	mov    cl,BYTE PTR [rax+0x88]

## Direct +0x10 pointer writes in ad/readiness neighborhoods
### 0xb85045: mov    QWORD PTR [rbx+0x10],r13; FDE=(12079080, 12079239)
      b85023:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]
      b85027:	4c 8b 6b 10          	mov    r13,QWORD PTR [rbx+0x10]
      b8502b:	49 29 d4             	sub    r12,rdx
      b8502e:	74 12                	je     b85042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd1fe2>
      b85030:	4c 89 ef             	mov    rdi,r13
      b85033:	48 89 d6             	mov    rsi,rdx
      b85036:	4c 89 e2             	mov    rdx,r12
      b85039:	e8 a2 aa c6 00       	call   17efae0 <memmove@plt>
      b8503e:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      b85042:	4d 01 e5             	add    r13,r12
      b85045:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
      b85049:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
      b8504c:	49 89 07             	mov    QWORD PTR [r15],rax
      b8504f:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
      b85053:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      b85057:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      b8505b:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
      b8505f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b85063:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      b85067:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      b8506b:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
      b8506f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b85073:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      b85077:	48 89 03             	mov    QWORD PTR [rbx],rax
      b8507a:	4c 89 f0             	mov    rax,r14
      b8507d:	5b                   	pop    rbx

### 0xb8505f: mov    QWORD PTR [rbx+0x10],rax; FDE=(12079080, 12079239)
      b85039:	e8 a2 aa c6 00       	call   17efae0 <memmove@plt>
      b8503e:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      b85042:	4d 01 e5             	add    r13,r12
      b85045:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
      b85049:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
      b8504c:	49 89 07             	mov    QWORD PTR [r15],rax
      b8504f:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
      b85053:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      b85057:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      b8505b:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
      b8505f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b85063:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      b85067:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      b8506b:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
      b8506f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b85073:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      b85077:	48 89 03             	mov    QWORD PTR [rbx],rax
      b8507a:	4c 89 f0             	mov    rax,r14
      b8507d:	5b                   	pop    rbx
      b8507e:	41 5c                	pop    r12
      b85080:	41 5d                	pop    r13
      b85082:	41 5e                	pop    r14
      b85084:	41 5f                	pop    r15
      b85086:	c3                   	ret
      b85087:	cc                   	int3
      b85088:	41 56                	push   r14

### 0xb8506b: mov    QWORD PTR [r15+0x10],rcx; FDE=(12079080, 12079239)
      b85045:	4c 89 6b 10          	mov    QWORD PTR [rbx+0x10],r13
      b85049:	49 8b 0f             	mov    rcx,QWORD PTR [r15]
      b8504c:	49 89 07             	mov    QWORD PTR [r15],rax
      b8504f:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
      b85053:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
      b85057:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      b8505b:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
      b8505f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b85063:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
      b85067:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      b8506b:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
      b8506f:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b85073:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      b85077:	48 89 03             	mov    QWORD PTR [rbx],rax
      b8507a:	4c 89 f0             	mov    rax,r14
      b8507d:	5b                   	pop    rbx
      b8507e:	41 5c                	pop    r12
      b85080:	41 5d                	pop    r13
      b85082:	41 5e                	pop    r14
      b85084:	41 5f                	pop    r15
      b85086:	c3                   	ret
      b85087:	cc                   	int3
      b85088:	41 56                	push   r14
      b8508a:	53                   	push   rbx
      b8508b:	48 83 ec 28          	sub    rsp,0x28
      b8508f:	80 bf 19 01 00 00 00 	cmp    BYTE PTR [rdi+0x119],0x0

### 0xb850e9: mov    QWORD PTR [rsp+0x10],rax; FDE=(12079240, 12079381)
      b850b3:	49 8d be 00 01 00 00 	lea    rdi,[r14+0x100]
      b850ba:	e8 d1 64 ff ff       	call   b7b590 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc8530>
      b850bf:	41 c6 86 cc 00 00 00 	mov    BYTE PTR [r14+0xcc],0x1
      b850c6:	01 
      b850c7:	45 8b 86 c8 00 00 00 	mov    r8d,DWORD PTR [r14+0xc8]
      b850ce:	4d 8b 8e c0 00 00 00 	mov    r9,QWORD PTR [r14+0xc0]
      b850d5:	41 0f 10 86 28 01 00 	movups xmm0,XMMWORD PTR [r14+0x128]
      b850dc:	00 
      b850dd:	49 8b 86 38 01 00 00 	mov    rax,QWORD PTR [r14+0x138]
      b850e4:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
      b850e9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b850ee:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
      b850f2:	48 8d 35 83 ce 8c ff 	lea    rsi,[rip+0xffffffffff8cce83]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b850f9:	48 8d 0d 11 04 7d ff 	lea    rcx,[rip+0xffffffffff7d0411]        # 355511 <_ZTSSt12bad_any_cast@@Base-0x3acb7>
      b85100:	6a 04                	push   0x4
      b85102:	5f                   	pop    rdi
      b85103:	6a 74                	push   0x74
      b85105:	5a                   	pop    rdx
      b85106:	31 c0                	xor    eax,eax
      b85108:	e8 c5 17 c5 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      b8510d:	48 83 c4 28          	add    rsp,0x28
      b85111:	5b                   	pop    rbx
      b85112:	41 5e                	pop    r14
      b85114:	c3                   	ret
      b85115:	cc                   	int3
      b85116:	41 56                	push   r14

### 0xb85472: mov    QWORD PTR [r12+0x10],r13; FDE=(12080054, 12080301)
      b8544d:	49 89 04 24          	mov    QWORD PTR [r12],rax
      b85451:	49 01 c7             	add    r15,rax
      b85454:	4d 89 7c 24 08       	mov    QWORD PTR [r12+0x8],r15
      b85459:	48 01 c2             	add    rdx,rax
      b8545c:	49 89 54 24 18       	mov    QWORD PTR [r12+0x18],rdx
      b85461:	4f 8d 2c 37          	lea    r13,[r15+r14*1]
      b85465:	4c 89 ff             	mov    rdi,r15
      b85468:	31 f6                	xor    esi,esi
      b8546a:	4c 89 f2             	mov    rdx,r14
      b8546d:	e8 1e 97 c6 00       	call   17eeb90 <memset@plt>
      b85472:	4d 89 6c 24 10       	mov    QWORD PTR [r12+0x10],r13
      b85477:	48 89 df             	mov    rdi,rbx
      b8547a:	4c 89 e6             	mov    rsi,r12
      b8547d:	e8 94 f4 f2 ff       	call   ab4916 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18b6>
      b85482:	4c 89 e7             	mov    rdi,r12
      b85485:	e8 e2 f4 f2 ff       	call   ab496c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x190c>
      b8548a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b85491:	00 00 
      b85493:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
      b85498:	75 0e                	jne    b854a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2448>
      b8549a:	48 83 c4 30          	add    rsp,0x30
      b8549e:	5b                   	pop    rbx
      b8549f:	41 5c                	pop    r12
      b854a1:	41 5d                	pop    r13
      b854a3:	41 5e                	pop    r14
      b854a5:	41 5f                	pop    r15

### 0xb85512: mov    BYTE PTR [rsp+0x10],0x0; FDE=(12080301, 12080584)
      b854e4:	48 8d 3d 2d eb e5 00 	lea    rdi,[rip+0xe5eb2d]        # 19e4018 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xa48>
      b854eb:	e8 80 8c c6 00       	call   17ee170 <__cxa_guard_acquire@plt>
      b854f0:	85 c0                	test   eax,eax
      b854f2:	74 d6                	je     b854ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd246a>
      b854f4:	0f 57 c0             	xorps  xmm0,xmm0
      b854f7:	48 83 25 e1 a5 e6 00 	and    QWORD PTR [rip+0xe6a5e1],0x0        # 19efae0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1210>
      b854fe:	00 
      b854ff:	0f 11 05 ca a5 e6 00 	movups XMMWORD PTR [rip+0xe6a5ca],xmm0        # 19efad0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1200>
      b85506:	48 8d 3d c3 a5 e6 00 	lea    rdi,[rip+0xe6a5c3]        # 19efad0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1200>
      b8550d:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
      b85512:	c6 44 24 10 00       	mov    BYTE PTR [rsp+0x10],0x0
      b85517:	6a 07                	push   0x7
      b85519:	5e                   	pop    rsi
      b8551a:	e8 91 37 f2 ff       	call   aa8cb0 <JNI_OnUnload@@Base+0x3057d>
      b8551f:	48 8d 1d aa a5 e6 00 	lea    rbx,[rip+0xe6a5aa]        # 19efad0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1200>
      b85526:	48 8b 05 ab a5 e6 00 	mov    rax,QWORD PTR [rip+0xe6a5ab]        # 19efad8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1208>
      b8552d:	0f 10 05 3c a8 81 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff81a83c]        # 39fd70 <_ZTSN5boost9exceptionE@@Base+0x752>
      b85534:	0f 11 40 0c          	movups XMMWORD PTR [rax+0xc],xmm0
      b85538:	0f 10 05 25 a8 81 ff 	movups xmm0,XMMWORD PTR [rip+0xffffffffff81a825]        # 39fd64 <_ZTSN5boost9exceptionE@@Base+0x746>
      b8553f:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
      b85542:	48 83 c0 1c          	add    rax,0x1c
      b85546:	48 89 05 8b a5 e6 00 	mov    QWORD PTR [rip+0xe6a58b],rax        # 19efad8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1208>
      b8554d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      b85552:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
      b85556:	e8 c7 64 ef ff       	call   a7ba22 <JNI_OnUnload@@Base+0x32ef>
      b8555b:	48 8d 3d c6 61 ef ff 	lea    rdi,[rip+0xffffffffffef61c6]        # a7b728 <JNI_OnUnload@@Base+0x2ff5>

### 0xb85667: mov    QWORD PTR [rsp+0x10],rax; FDE=(12080612, 12083069)
      b85644:	4c 89 e7             	mov    rdi,r12
      b85647:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b8564a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b8564f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b85653:	4c 89 e7             	mov    rdi,r12
      b85656:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b85659:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b8565d:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b85661:	4c 89 e7             	mov    rdi,r12
      b85664:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b85667:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b8566c:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b85670:	4c 89 e7             	mov    rdi,r12
      b85673:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b85676:	49 89 c5             	mov    r13,rax
      b85679:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b8567d:	4c 89 e7             	mov    rdi,r12
      b85680:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b85683:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
      b85688:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b8568c:	4c 89 e7             	mov    rdi,r12
      b8568f:	ff 50 28             	call   QWORD PTR [rax+0x28]
      b85692:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      b85697:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      b8569b:	4c 89 e7             	mov    rdi,r12
      b8569e:	ff 50 28             	call   QWORD PTR [rax+0x28]

### 0xb85c42: movdqa XMMWORD PTR [rsp+0x10],xmm0; FDE=(12080612, 12083069)
      b85c1b:	0f 28 40 60          	movaps xmm0,XMMWORD PTR [rax+0x60]
      b85c1f:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      b85c23:	48 8b 40 68          	mov    rax,QWORD PTR [rax+0x68]
      b85c27:	48 85 c0             	test   rax,rax
      b85c2a:	74 05                	je     b85c31 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2bd1>
      b85c2c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b85c31:	4c 8d 73 18          	lea    r14,[rbx+0x18]
      b85c35:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
      b85c3a:	f3 0f 6f 80 c8 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xc8]
      b85c41:	00 
      b85c42:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      b85c48:	48 8b 80 d0 00 00 00 	mov    rax,QWORD PTR [rax+0xd0]
      b85c4f:	48 85 c0             	test   rax,rax
      b85c52:	74 05                	je     b85c59 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2bf9>
      b85c54:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b85c59:	48 8d 35 93 54 7f ff 	lea    rsi,[rip+0xffffffffff7f5493]        # 37b0f3 <_ZTSSt12bad_any_cast@@Base-0x150d5>
      b85c60:	4c 89 f7             	mov    rdi,r14
      b85c63:	e8 68 df a5 00       	call   15e3bd0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x429154>
      b85c68:	4d 8d ac 24 80 00 00 	lea    r13,[r12+0x80]
      b85c6f:	00 
      b85c70:	48 8d 05 81 c7 ce 00 	lea    rax,[rip+0xcec781]        # 18723f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2eae0>
      b85c77:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b85c7b:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
      b85c80:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
      b85c84:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      b85c89:	0f 11 43 48          	movups XMMWORD PTR [rbx+0x48],xmm0

### 0xb85eca: mov    QWORD PTR [rbx+0x10],r12; FDE=(12080612, 12083069)
      b85ea2:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      b85ea6:	e8 db 85 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b85eab:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      b85eb2:	00 
      b85eb3:	31 c0                	xor    eax,eax
      b85eb5:	41 88 84 24 c0 00 00 	mov    BYTE PTR [r12+0xc0],al
      b85ebc:	00 
      b85ebd:	41 88 84 24 d0 00 00 	mov    BYTE PTR [r12+0xd0],al
      b85ec4:	00 
      b85ec5:	48 8b 5c 24 48       	mov    rbx,QWORD PTR [rsp+0x48]
      b85eca:	4c 89 63 10          	mov    QWORD PTR [rbx+0x10],r12
      b85ece:	e8 b3 85 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b85ed3:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      b85ed8:	48 89 18             	mov    QWORD PTR [rax],rbx
      b85edb:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
      b85ee2:	00 00 
      b85ee4:	48 3b 8c 24 a0 00 00 	cmp    rcx,QWORD PTR [rsp+0xa0]
      b85eeb:	00 
      b85eec:	0f 85 86 00 00 00    	jne    b85f78 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f18>
      b85ef2:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
      b85ef9:	5b                   	pop    rbx
      b85efa:	41 5c                	pop    r12
      b85efc:	41 5d                	pop    r13
      b85efe:	41 5e                	pop    r14
      b85f00:	41 5f                	pop    r15
      b85f02:	5d                   	pop    rbp

### 0xb86568: movdqa XMMWORD PTR [rdi+0x10],xmm0; FDE=(12083334, 12091202)
      b8653b:	e8 87 49 9b 00       	call   153aec7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38044b>
      b86540:	49 89 c4             	mov    r12,rax
      b86543:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b8654a:	00 
      b8654b:	66 0f ef c0          	pxor   xmm0,xmm0
      b8654f:	66 0f 7f 47 60       	movdqa XMMWORD PTR [rdi+0x60],xmm0
      b86554:	66 0f 7f 47 50       	movdqa XMMWORD PTR [rdi+0x50],xmm0
      b86559:	66 0f 7f 47 40       	movdqa XMMWORD PTR [rdi+0x40],xmm0
      b8655e:	66 0f 7f 47 30       	movdqa XMMWORD PTR [rdi+0x30],xmm0
      b86563:	66 0f 7f 47 20       	movdqa XMMWORD PTR [rdi+0x20],xmm0
      b86568:	66 0f 7f 47 10       	movdqa XMMWORD PTR [rdi+0x10],xmm0
      b8656d:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0
      b86571:	48 83 67 70 00       	and    QWORD PTR [rdi+0x70],0x0
      b86576:	e8 c2 48 9b 00       	call   153ae3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3803c1>
      b8657b:	4c 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r15
      b86582:	00 
      b86583:	49 c1 ec 20          	shr    r12,0x20
      b86587:	f6 84 24 88 06 00 00 	test   BYTE PTR [rsp+0x688],0x1
      b8658e:	01 
      b8658f:	74 0a                	je     b8659b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd353b>
      b86591:	4c 8b bc 24 98 06 00 	mov    r15,QWORD PTR [rsp+0x698]
      b86598:	00 
      b86599:	eb 08                	jmp    b865a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3543>
      b8659b:	4c 8d bc 24 89 06 00 	lea    r15,[rsp+0x689]
      b865a2:	00 
      b865a3:	f6 84 24 a0 06 00 00 	test   BYTE PTR [rsp+0x6a0],0x1

### 0xb86a3e: movdqu XMMWORD PTR [r15+0x10],xmm0; FDE=(12083334, 12091202)
      b86a1b:	e8 66 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a20:	31 ff                	xor    edi,edi
      b86a22:	e8 5f 7a f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86a27:	6a 20                	push   0x20
      b86a29:	5f                   	pop    rdi
      b86a2a:	e8 d1 74 c6 00       	call   17edf00 <_Znwm@plt>
      b86a2f:	49 89 c7             	mov    r15,rax
      b86a32:	48 89 c7             	mov    rdi,rax
      b86a35:	e8 bc 2f c5 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      b86a3a:	66 0f ef c0          	pxor   xmm0,xmm0
      b86a3e:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      b86a44:	4d 8b a6 38 03 00 00 	mov    r12,QWORD PTR [r14+0x338]
      b86a4b:	4c 89 bc 24 d8 02 00 	mov    QWORD PTR [rsp+0x2d8],r15
      b86a52:	00 
      b86a53:	49 8b 86 28 03 00 00 	mov    rax,QWORD PTR [r14+0x328]
      b86a5a:	f3 41 0f 6f 86 20 03 	movdqu xmm0,XMMWORD PTR [r14+0x320]
      b86a61:	00 00 
      b86a63:	f3 0f 7f 84 24 e0 02 	movdqu XMMWORD PTR [rsp+0x2e0],xmm0
      b86a6a:	00 00 
      b86a6c:	48 85 c0             	test   rax,rax
      b86a6f:	74 05                	je     b86a76 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3a16>
      b86a71:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86a76:	48 8d 35 1b d2 f6 ff 	lea    rsi,[rip+0xfffffffffff6d21b]        # af3c98 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40c38>
      b86a7d:	48 8d 15 2e 7f f2 ff 	lea    rdx,[rip+0xfffffffffff27f2e]        # aae9b2 <JNI_OnUnload@@Base+0x3627f>
      b86a84:	48 8d 0d 2f 29 94 00 	lea    rcx,[rip+0x94292f]        # 14c93ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30e93e>
      b86a8b:	48 8d 9c 24 70 06 00 	lea    rbx,[rsp+0x670]

### 0xb86c9d: mov    QWORD PTR [rbx+0x10],rax; FDE=(12083334, 12091202)
      b86c72:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86c77:	48 8d 9c 24 48 03 00 	lea    rbx,[rsp+0x348]
      b86c7e:	00 
      b86c7f:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
      b86c84:	0f 11 43 f0          	movups XMMWORD PTR [rbx-0x10],xmm0
      b86c88:	48 8b b4 24 58 01 00 	mov    rsi,QWORD PTR [rsp+0x158]
      b86c8f:	00 
      b86c90:	48 89 df             	mov    rdi,rbx
      b86c93:	e8 0e 2c a6 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>
      b86c98:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      b86c9d:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b86ca1:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
      b86ca8:	00 
      b86ca9:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b86cad:	49 8b 86 50 03 00 00 	mov    rax,QWORD PTR [r14+0x350]
      b86cb4:	f3 41 0f 6f 86 48 03 	movdqu xmm0,XMMWORD PTR [r14+0x348]
      b86cbb:	00 00 
      b86cbd:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
      b86cc2:	48 85 c0             	test   rax,rax
      b86cc5:	74 05                	je     b86ccc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd3c6c>
      b86cc7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b86ccc:	48 8d 9c 24 88 03 00 	lea    rbx,[rsp+0x388]
      b86cd3:	00 
      b86cd4:	4c 89 63 f0          	mov    QWORD PTR [rbx-0x10],r12
      b86cd8:	4c 89 6b f8          	mov    QWORD PTR [rbx-0x8],r13
      b86cdc:	48 89 df             	mov    rdi,rbx

### 0xb86e0c: movdqa XMMWORD PTR [rbx+0x10],xmm1; FDE=(12083334, 12091202)
      b86de3:	48 8d b4 24 b0 06 00 	lea    rsi,[rsp+0x6b0]
      b86dea:	00 
      b86deb:	e8 2c 2a f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86df0:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      b86df4:	48 8d 9c 24 c0 06 00 	lea    rbx,[rsp+0x6c0]
      b86dfb:	00 
      b86dfc:	48 89 de             	mov    rsi,rbx
      b86dff:	e8 18 2a f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86e04:	0f 28 43 10          	movaps xmm0,XMMWORD PTR [rbx+0x10]
      b86e08:	66 0f ef c9          	pxor   xmm1,xmm1
      b86e0c:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
      b86e11:	49 8b 7e 78          	mov    rdi,QWORD PTR [r14+0x78]
      b86e15:	41 0f 11 46 70       	movups XMMWORD PTR [r14+0x70],xmm0
      b86e1a:	e8 67 76 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86e1f:	49 8d be 80 00 00 00 	lea    rdi,[r14+0x80]
      b86e26:	48 8d 9c 24 e0 06 00 	lea    rbx,[rsp+0x6e0]
      b86e2d:	00 
      b86e2e:	48 89 de             	mov    rsi,rbx
      b86e31:	e8 e6 29 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86e36:	0f 28 43 10          	movaps xmm0,XMMWORD PTR [rbx+0x10]
      b86e3a:	66 0f ef c9          	pxor   xmm1,xmm1
      b86e3e:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
      b86e43:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
      b86e4a:	41 0f 11 86 90 00 00 	movups XMMWORD PTR [r14+0x90],xmm0
      b86e51:	00 
      b86e52:	e8 2f 76 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xb86e3e: movdqa XMMWORD PTR [rbx+0x10],xmm1; FDE=(12083334, 12091202)
      b86e11:	49 8b 7e 78          	mov    rdi,QWORD PTR [r14+0x78]
      b86e15:	41 0f 11 46 70       	movups XMMWORD PTR [r14+0x70],xmm0
      b86e1a:	e8 67 76 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86e1f:	49 8d be 80 00 00 00 	lea    rdi,[r14+0x80]
      b86e26:	48 8d 9c 24 e0 06 00 	lea    rbx,[rsp+0x6e0]
      b86e2d:	00 
      b86e2e:	48 89 de             	mov    rsi,rbx
      b86e31:	e8 e6 29 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b86e36:	0f 28 43 10          	movaps xmm0,XMMWORD PTR [rbx+0x10]
      b86e3a:	66 0f ef c9          	pxor   xmm1,xmm1
      b86e3e:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
      b86e43:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
      b86e4a:	41 0f 11 86 90 00 00 	movups XMMWORD PTR [r14+0x90],xmm0
      b86e51:	00 
      b86e52:	e8 2f 76 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86e57:	0f 28 43 20          	movaps xmm0,XMMWORD PTR [rbx+0x20]
      b86e5b:	66 0f ef c9          	pxor   xmm1,xmm1
      b86e5f:	66 0f 7f 4b 20       	movdqa XMMWORD PTR [rbx+0x20],xmm1
      b86e64:	49 8b be a8 00 00 00 	mov    rdi,QWORD PTR [r14+0xa8]
      b86e6b:	41 0f 11 86 a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm0
      b86e72:	00 
      b86e73:	e8 0e 76 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b86e78:	49 8d be b0 00 00 00 	lea    rdi,[r14+0xb0]
      b86e7f:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      b86e86:	00 
      b86e87:	48 89 de             	mov    rsi,rbx

### 0xb870be: movdqa XMMWORD PTR [rbx+0x10],xmm1; FDE=(12083334, 12091202)
      b87092:	8a 43 18             	mov    al,BYTE PTR [rbx+0x18]
      b87095:	41 88 86 c8 01 00 00 	mov    BYTE PTR [r14+0x1c8],al
      b8709c:	4c 89 f7             	mov    rdi,r14
      b8709f:	48 81 c7 d0 01 00 00 	add    rdi,0x1d0
      b870a6:	48 8d 9c 24 30 08 00 	lea    rbx,[rsp+0x830]
      b870ad:	00 
      b870ae:	48 89 de             	mov    rsi,rbx
      b870b1:	e8 66 27 f3 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      b870b6:	0f 28 43 10          	movaps xmm0,XMMWORD PTR [rbx+0x10]
      b870ba:	66 0f ef c9          	pxor   xmm1,xmm1
      b870be:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
      b870c3:	49 8b be e8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1e8]
      b870ca:	41 0f 11 86 e0 01 00 	movups XMMWORD PTR [r14+0x1e0],xmm0
      b870d1:	00 
      b870d2:	e8 af 73 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      b870d7:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
      b870de:	00 
      b870df:	e8 bc 68 94 00       	call   14cd9a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x312f24>
      b870e4:	41 0f 28 46 70       	movaps xmm0,XMMWORD PTR [r14+0x70]
      b870e9:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      b870f0:	00 
      b870f1:	49 8b 46 78          	mov    rax,QWORD PTR [r14+0x78]
      b870f5:	48 85 c0             	test   rax,rax
      b870f8:	74 05                	je     b870ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd409f>
      b870fa:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b870ff:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13

### 0xb87364: mov    QWORD PTR [rax+0x10],rcx; FDE=(12083334, 12091202)
      b8733a:	00 
      b8733b:	48 83 a4 24 60 06 00 	and    QWORD PTR [rsp+0x660],0x0
      b87342:	00 00 
      b87344:	bf 88 00 00 00       	mov    edi,0x88
      b87349:	e8 b2 6b c6 00       	call   17edf00 <_Znwm@plt>
      b8734e:	48 8d 0d 7b 6a c8 00 	lea    rcx,[rip+0xc86a7b]        # 180ddd0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3a90>
      b87355:	48 89 08             	mov    QWORD PTR [rax],rcx
      b87358:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b8735c:	48 8b 8c 24 48 02 00 	mov    rcx,QWORD PTR [rsp+0x248]
      b87363:	00 
      b87364:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      b87368:	48 85 c9             	test   rcx,rcx
      b8736b:	74 05                	je     b87372 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4312>
      b8736d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87372:	0f 10 84 24 50 02 00 	movups xmm0,XMMWORD PTR [rsp+0x250]
      b87379:	00 
      b8737a:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      b8737e:	48 8b 8c 24 60 02 00 	mov    rcx,QWORD PTR [rsp+0x260]
      b87385:	00 
      b87386:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      b8738a:	48 85 c9             	test   rcx,rcx
      b8738d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b87392:	74 05                	je     b87399 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4339>
      b87394:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87399:	48 8d 94 24 78 02 00 	lea    rdx,[rsp+0x278]
      b873a0:	00 

### 0xb8750b: mov    QWORD PTR [rax+0x10],rcx; FDE=(12083334, 12091202)
      b874e1:	00 
      b874e2:	48 83 a4 24 30 06 00 	and    QWORD PTR [rsp+0x630],0x0
      b874e9:	00 00 
      b874eb:	bf 88 00 00 00       	mov    edi,0x88
      b874f0:	e8 0b 6a c6 00       	call   17edf00 <_Znwm@plt>
      b874f5:	48 8d 0d 64 69 c8 00 	lea    rcx,[rip+0xc86964]        # 180de60 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b20>
      b874fc:	48 89 08             	mov    QWORD PTR [rax],rcx
      b874ff:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b87503:	48 8b 8c 24 c8 01 00 	mov    rcx,QWORD PTR [rsp+0x1c8]
      b8750a:	00 
      b8750b:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      b8750f:	48 85 c9             	test   rcx,rcx
      b87512:	74 05                	je     b87519 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44b9>
      b87514:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b87519:	0f 10 84 24 d0 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1d0]
      b87520:	00 
      b87521:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
      b87525:	48 8b 8c 24 e0 01 00 	mov    rcx,QWORD PTR [rsp+0x1e0]
      b8752c:	00 
      b8752d:	48 89 48 28          	mov    QWORD PTR [rax+0x28],rcx
      b87531:	48 85 c9             	test   rcx,rcx
      b87534:	74 05                	je     b8753b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd44db>
      b87536:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b8753b:	48 8d 94 24 f8 01 00 	lea    rdx,[rsp+0x1f8]
      b87542:	00 
      b87543:	48 8b 4a f8          	mov    rcx,QWORD PTR [rdx-0x8]

### 0xb876d4: movups XMMWORD PTR [r15+0x10],xmm0; FDE=(12083334, 12091202)
      b876af:	6a 70                	push   0x70
      b876b1:	5f                   	pop    rdi
      b876b2:	e8 49 68 c6 00       	call   17edf00 <_Znwm@plt>
      b876b7:	49 89 c7             	mov    r15,rax
      b876ba:	48 8d 84 24 90 05 00 	lea    rax,[rsp+0x590]
      b876c1:	00 
      b876c2:	48 8d 0d df 67 c8 00 	lea    rcx,[rip+0xc867df]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68>
      b876c9:	49 89 0f             	mov    QWORD PTR [r15],rcx
      b876cc:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      b876d0:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
      b876d4:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
      b876d9:	48 85 c9             	test   rcx,rcx
      b876dc:	74 05                	je     b876e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4683>
      b876de:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b876e3:	0f 28 84 24 90 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x590]
      b876ea:	00 
      b876eb:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      b876f0:	0f 57 c0             	xorps  xmm0,xmm0
      b876f3:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      b876f6:	66 0f 6f 8c 24 a0 05 	movdqa xmm1,XMMWORD PTR [rsp+0x5a0]
      b876fd:	00 00 
      b876ff:	f3 41 0f 7f 4f 30    	movdqu XMMWORD PTR [r15+0x30],xmm1
      b87705:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
      b87709:	4c 89 ff             	mov    rdi,r15
      b8770c:	48 83 c7 40          	add    rdi,0x40
      b87710:	48 89 de             	mov    rsi,rbx

### 0xb87705: movaps XMMWORD PTR [rax+0x10],xmm0; FDE=(12083334, 12091202)
      b876dc:	74 05                	je     b876e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4683>
      b876de:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b876e3:	0f 28 84 24 90 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x590]
      b876ea:	00 
      b876eb:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      b876f0:	0f 57 c0             	xorps  xmm0,xmm0
      b876f3:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
      b876f6:	66 0f 6f 8c 24 a0 05 	movdqa xmm1,XMMWORD PTR [rsp+0x5a0]
      b876fd:	00 00 
      b876ff:	f3 41 0f 7f 4f 30    	movdqu XMMWORD PTR [r15+0x30],xmm1
      b87705:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
      b87709:	4c 89 ff             	mov    rdi,r15
      b8770c:	48 83 c7 40          	add    rdi,0x40
      b87710:	48 89 de             	mov    rsi,rbx
      b87713:	e8 a0 0b 00 00       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b87718:	4c 89 bc 24 00 06 00 	mov    QWORD PTR [rsp+0x600],r15
      b8771f:	00 
      b87720:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      b87725:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      b87729:	0f 28 01             	movaps xmm0,XMMWORD PTR [rcx]
      b8772c:	0f 29 84 24 f0 04 00 	movaps XMMWORD PTR [rsp+0x4f0],xmm0
      b87733:	00 
      b87734:	48 85 c0             	test   rax,rax
      b87737:	74 05                	je     b8773e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd46de>
      b87739:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b8773e:	49 8b 86 60 03 00 00 	mov    rax,QWORD PTR [r14+0x360]

### 0xb877bb: movups XMMWORD PTR [r12+0x10],xmm0; FDE=(12083334, 12091202)
      b87795:	6a 70                	push   0x70
      b87797:	5f                   	pop    rdi
      b87798:	e8 63 67 c6 00       	call   17edf00 <_Znwm@plt>
      b8779d:	49 89 c4             	mov    r12,rax
      b877a0:	48 8d 84 24 00 05 00 	lea    rax,[rsp+0x500]
      b877a7:	00 
      b877a8:	48 8d 0d 89 67 c8 00 	lea    rcx,[rip+0xc86789]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8>
      b877af:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
      b877b3:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      b877b7:	0f 28 40 f0          	movaps xmm0,XMMWORD PTR [rax-0x10]
      b877bb:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
      b877c1:	48 85 c9             	test   rcx,rcx
      b877c4:	74 05                	je     b877cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd476b>
      b877c6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b877cb:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
      b877d2:	00 
      b877d3:	66 41 0f 6f 47 10    	movdqa xmm0,XMMWORD PTR [r15+0x10]
      b877d9:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      b877e0:	66 0f ef c0          	pxor   xmm0,xmm0
      b877e4:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      b877e8:	66 41 0f 6f 4f 20    	movdqa xmm1,XMMWORD PTR [r15+0x20]
      b877ee:	f3 41 0f 7f 4c 24 30 	movdqu XMMWORD PTR [r12+0x30],xmm1
      b877f5:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
      b877fa:	4c 89 e7             	mov    rdi,r12
      b877fd:	48 83 c7 40          	add    rdi,0x40
      b87801:	48 89 de             	mov    rsi,rbx

### 0xb877f5: movdqa XMMWORD PTR [rax+0x10],xmm0; FDE=(12083334, 12091202)
      b877c4:	74 05                	je     b877cb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd476b>
      b877c6:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b877cb:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
      b877d2:	00 
      b877d3:	66 41 0f 6f 47 10    	movdqa xmm0,XMMWORD PTR [r15+0x10]
      b877d9:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
      b877e0:	66 0f ef c0          	pxor   xmm0,xmm0
      b877e4:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      b877e8:	66 41 0f 6f 4f 20    	movdqa xmm1,XMMWORD PTR [r15+0x20]
      b877ee:	f3 41 0f 7f 4c 24 30 	movdqu XMMWORD PTR [r12+0x30],xmm1
      b877f5:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
      b877fa:	4c 89 e7             	mov    rdi,r12
      b877fd:	48 83 c7 40          	add    rdi,0x40
      b87801:	48 89 de             	mov    rsi,rbx
      b87804:	e8 af 0a 00 00       	call   b882b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5258>
      b87809:	4c 8d ac 24 50 05 00 	lea    r13,[rsp+0x550]
      b87810:	00 
      b87811:	4d 89 65 20          	mov    QWORD PTR [r13+0x20],r12
      b87815:	48 8d 9c 24 70 06 00 	lea    rbx,[rsp+0x670]
      b8781c:	00 
      b8781d:	4c 8d a4 24 a8 01 00 	lea    r12,[rsp+0x1a8]
      b87824:	00 
      b87825:	48 8d ac 24 e0 05 00 	lea    rbp,[rsp+0x5e0]
      b8782c:	00 
      b8782d:	48 89 df             	mov    rdi,rbx
      b87830:	4c 89 e6             	mov    rsi,r12

### 0xb8811a: mov    QWORD PTR [rdi+0x10],rax; FDE=(12091646, 12091718)
      b880fe:	41 56                	push   r14
      b88100:	53                   	push   rbx
      b88101:	50                   	push   rax
      b88102:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      b88106:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      b8810b:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      b8810f:	48 85 c0             	test   rax,rax
      b88112:	74 22                	je     b88136 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50d6>
      b88114:	48 89 fb             	mov    rbx,rdi
      b88117:	49 89 f6             	mov    r14,rsi
      b8811a:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      b8811e:	6a 01                	push   0x1
      b88120:	5f                   	pop    rdi
      b88121:	48 89 de             	mov    rsi,rbx
      b88124:	4c 89 f2             	mov    rdx,r14
      b88127:	ff d0                	call   rax
      b88129:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
      b8812d:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b88131:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      b88136:	48 83 c4 08          	add    rsp,0x8
      b8813a:	5b                   	pop    rbx
      b8813b:	41 5e                	pop    r14
      b8813d:	c3                   	ret
      b8813e:	48 89 c7             	mov    rdi,rax
      b88141:	e8 5f 19 ef ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      b88146:	41 56                	push   r14

### 0xb88154: mov    QWORD PTR [rdi+0x10],rax; FDE=(12091718, 12091787)
      b8813b:	41 5e                	pop    r14
      b8813d:	c3                   	ret
      b8813e:	48 89 c7             	mov    rdi,rax
      b88141:	e8 5f 19 ef ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      b88146:	41 56                	push   r14
      b88148:	53                   	push   rbx
      b88149:	50                   	push   rax
      b8814a:	48 89 cb             	mov    rbx,rcx
      b8814d:	49 89 fe             	mov    r14,rdi
      b88150:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      b88154:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      b88158:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
      b8815b:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      b8815e:	0f 57 c0             	xorps  xmm0,xmm0
      b88161:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
      b88164:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      b88169:	48 83 c7 20          	add    rdi,0x20
      b8816d:	48 89 d6             	mov    rsi,rdx
      b88170:	e8 9d 0c 00 00       	call   b88e12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5db2>
      b88175:	49 83 c6 50          	add    r14,0x50
      b88179:	4c 89 f7             	mov    rdi,r14
      b8817c:	48 89 de             	mov    rsi,rbx
      b8817f:	48 83 c4 08          	add    rsp,0x8
      b88183:	5b                   	pop    rbx
      b88184:	41 5e                	pop    r14
      b88186:	e9 cb 0c 00 00       	jmp    b88e56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5df6>

### 0xb8853e: mov    QWORD PTR [rsi+0x10],rax; FDE=(12092712, 12092749)
      b8851c:	48 85 c9             	test   rcx,rcx
      b8851f:	74 05                	je     b88526 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd54c6>
      b88521:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      b88526:	5b                   	pop    rbx
      b88527:	c3                   	ret
      b88528:	48 8d 05 99 5a c8 00 	lea    rax,[rip+0xc85a99]        # 180dfc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c88>
      b8852f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b88532:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      b88536:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b8853a:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      b8853e:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      b88542:	48 85 c0             	test   rax,rax
      b88545:	74 05                	je     b8854c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd54ec>
      b88547:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b8854c:	c3                   	ret
      b8854d:	cc                   	int3
      b8854e:	53                   	push   rbx
      b8854f:	48 89 fb             	mov    rbx,rdi
      b88552:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      b88556:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b88559:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b8855c:	48 89 d8             	mov    rax,rbx
      b8855f:	5b                   	pop    rbx
      b88560:	c3                   	ret
      b88561:	cc                   	int3
      b88562:	48 8d 05 cf 59 c8 00 	lea    rax,[rip+0xc859cf]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8>

### 0xb885ba: mov    QWORD PTR [rsp+0x10],0x1; FDE=(12092808, 12092968)
      b88596:	00 00 
      b88598:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b8859d:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      b885a1:	6a 70                	push   0x70
      b885a3:	5f                   	pop    rdi
      b885a4:	e8 57 59 c6 00       	call   17edf00 <_Znwm@plt>
      b885a9:	48 89 c3             	mov    rbx,rax
      b885ac:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b885b0:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      b885b5:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b885ba:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      b885c1:	00 00 
      b885c3:	48 8d 05 6e 59 c8 00 	lea    rax,[rip+0xc8596e]        # 180df38 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bf8>
      b885ca:	48 89 03             	mov    QWORD PTR [rbx],rax
      b885cd:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      b885d1:	4c 89 f6             	mov    rsi,r14
      b885d4:	e8 dd 03 00 00       	call   b889b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5956>
      b885d9:	48 89 e7             	mov    rdi,rsp
      b885dc:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      b885e0:	e8 e5 1c ef ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      b885e5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b885ec:	00 00 
      b885ee:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b885f3:	75 2e                	jne    b88623 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd55c3>
      b885f5:	48 89 d8             	mov    rax,rbx
      b885f8:	48 83 c4 28          	add    rsp,0x28

### 0xb888cc: mov    QWORD PTR [rsp+0x10],0x1; FDE=(12093594, 12093754)
      b888a8:	00 00 
      b888aa:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b888af:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      b888b3:	6a 40                	push   0x40
      b888b5:	5f                   	pop    rdi
      b888b6:	e8 45 56 c6 00       	call   17edf00 <_Znwm@plt>
      b888bb:	48 89 c3             	mov    rbx,rax
      b888be:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b888c2:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      b888c7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b888cc:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      b888d3:	00 00 
      b888d5:	48 8d 05 a4 56 c8 00 	lea    rax,[rip+0xc856a4]        # 180df80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3c40>
      b888dc:	48 89 03             	mov    QWORD PTR [rbx],rax
      b888df:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      b888e3:	4c 89 f6             	mov    rsi,r14
      b888e6:	e8 a5 19 ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b888eb:	48 89 e7             	mov    rdi,rsp
      b888ee:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      b888f2:	e8 d3 19 ef ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      b888f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b888fe:	00 00 
      b88900:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b88905:	75 2e                	jne    b88935 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd58d5>
      b88907:	48 89 d8             	mov    rax,rbx
      b8890a:	48 83 c4 28          	add    rsp,0x28

### 0xb8896d: mov    QWORD PTR [rsp+0x10],rax; FDE=(12093792, 12093878)
      b88945:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      b88948:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      b8894c:	48 89 c6             	mov    rsi,rax
      b8894f:	e9 3c 19 ef ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b88954:	0f b6 36             	movzx  esi,BYTE PTR [rsi]
      b88957:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      b8895b:	e9 00 00 00 00       	jmp    b88960 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5900>
      b88960:	48 83 ec 18          	sub    rsp,0x18
      b88964:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8896b:	00 00 
      b8896d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b88972:	40 88 74 24 0f       	mov    BYTE PTR [rsp+0xf],sil
      b88977:	48 85 ff             	test   rdi,rdi
      b8897a:	74 20                	je     b8899c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd593c>
      b8897c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b8897f:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
      b88984:	ff 50 30             	call   QWORD PTR [rax+0x30]
      b88987:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8898e:	00 00 
      b88990:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      b88995:	75 1a                	jne    b889b1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5951>
      b88997:	48 83 c4 18          	add    rsp,0x18
      b8899b:	c3                   	ret
      b8899c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b889a3:	00 00 
      b889a5:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]

### 0xb889d9: mov    QWORD PTR [rbx+0x10],rax; FDE=(12093878, 12094020)
      b889b9:	50                   	push   rax
      b889ba:	48 89 fb             	mov    rbx,rdi
      b889bd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b889c0:	48 89 07             	mov    QWORD PTR [rdi],rax
      b889c3:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
      b889c7:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      b889cb:	48 85 c0             	test   rax,rax
      b889ce:	74 05                	je     b889d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5975>
      b889d0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b889d5:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      b889d9:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b889dd:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      b889e1:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b889e5:	48 85 c0             	test   rax,rax
      b889e8:	74 05                	je     b889ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd598f>
      b889ea:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b889ef:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
      b889f3:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      b889f7:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
      b889fb:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      b889ff:	48 85 c0             	test   rax,rax
      b88a02:	74 05                	je     b88a09 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd59a9>
      b88a04:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b88a09:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      b88a0d:	48 83 c6 30          	add    rsi,0x30
      b88a11:	e8 7a 18 ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>

### 0xb88a9c: mov    QWORD PTR [rsp+0x10],0x1; FDE=(12094058, 12094218)
      b88a78:	00 00 
      b88a7a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b88a7f:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      b88a83:	6a 70                	push   0x70
      b88a85:	5f                   	pop    rdi
      b88a86:	e8 75 54 c6 00       	call   17edf00 <_Znwm@plt>
      b88a8b:	48 89 c3             	mov    rbx,rax
      b88a8e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b88a92:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      b88a97:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b88a9c:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      b88aa3:	00 00 
      b88aa5:	48 8d 05 fc 53 c8 00 	lea    rax,[rip+0xc853fc]        # 180dea8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3b68>
      b88aac:	48 89 03             	mov    QWORD PTR [rbx],rax
      b88aaf:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      b88ab3:	4c 89 f6             	mov    rsi,r14
      b88ab6:	e8 c9 02 00 00       	call   b88d84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5d24>
      b88abb:	48 89 e7             	mov    rdi,rsp
      b88abe:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      b88ac2:	e8 03 18 ef ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      b88ac7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88ace:	00 00 
      b88ad0:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b88ad5:	75 2e                	jne    b88b05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5aa5>
      b88ad7:	48 89 d8             	mov    rax,rbx
      b88ada:	48 83 c4 28          	add    rsp,0x28

### 0xb88cfc: mov    QWORD PTR [rsp+0x10],0x1; FDE=(12094666, 12094826)
      b88cd8:	00 00 
      b88cda:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      b88cdf:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      b88ce3:	6a 40                	push   0x40
      b88ce5:	5f                   	pop    rdi
      b88ce6:	e8 15 52 c6 00       	call   17edf00 <_Znwm@plt>
      b88ceb:	48 89 c3             	mov    rbx,rax
      b88cee:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      b88cf2:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      b88cf7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b88cfc:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      b88d03:	00 00 
      b88d05:	48 8d 05 e4 51 c8 00 	lea    rax,[rip+0xc851e4]        # 180def0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3bb0>
      b88d0c:	48 89 03             	mov    QWORD PTR [rbx],rax
      b88d0f:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      b88d13:	4c 89 f6             	mov    rsi,r14
      b88d16:	e8 75 15 ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      b88d1b:	48 89 e7             	mov    rdi,rsp
      b88d1e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      b88d22:	e8 a3 15 ef ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      b88d27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88d2e:	00 00 
      b88d30:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      b88d35:	75 2e                	jne    b88d65 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5d05>
      b88d37:	48 89 d8             	mov    rax,rbx
      b88d3a:	48 83 c4 28          	add    rsp,0x28

### 0xb88da7: mov    QWORD PTR [rbx+0x10],rax; FDE=(12094852, 12094994)
      b88d87:	50                   	push   rax
      b88d88:	48 89 fb             	mov    rbx,rdi
      b88d8b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b88d8e:	48 89 07             	mov    QWORD PTR [rdi],rax
      b88d91:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
      b88d95:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      b88d99:	48 85 c0             	test   rax,rax
      b88d9c:	74 05                	je     b88da3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5d43>
      b88d9e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b88da3:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      b88da7:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      b88dab:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      b88daf:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      b88db3:	48 85 c0             	test   rax,rax
      b88db6:	74 05                	je     b88dbd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5d5d>
      b88db8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b88dbd:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
      b88dc1:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      b88dc5:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
      b88dc9:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      b88dcd:	48 85 c0             	test   rax,rax
      b88dd0:	74 05                	je     b88dd7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5d77>
      b88dd2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      b88dd7:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      b88ddb:	48 83 c6 30          	add    rsi,0x30
      b88ddf:	e8 ac 14 ef ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>

### 0xb88f60: mov    QWORD PTR [rsp+0x10],rax; FDE=(12095280, 12095992)
      b88f39:	53                   	push   rbx
      b88f3a:	48 81 ec d8 01 00 00 	sub    rsp,0x1d8
      b88f41:	49 89 d4             	mov    r12,rdx
      b88f44:	49 89 f5             	mov    r13,rsi
      b88f47:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
      b88f4b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b88f52:	00 00 
      b88f54:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
      b88f5b:	00 
      b88f5c:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
      b88f60:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      b88f65:	8a 46 40             	mov    al,BYTE PTR [rsi+0x40]
      b88f68:	88 44 24 30          	mov    BYTE PTR [rsp+0x30],al
      b88f6c:	8a 46 41             	mov    al,BYTE PTR [rsi+0x41]
      b88f6f:	88 44 24 31          	mov    BYTE PTR [rsp+0x31],al
      b88f73:	48 8b 46 48          	mov    rax,QWORD PTR [rsi+0x48]
      b88f77:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
      b88f7c:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]
      b88f80:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      b88f85:	8a 46 78             	mov    al,BYTE PTR [rsi+0x78]
      b88f88:	88 44 24 48          	mov    BYTE PTR [rsp+0x48],al
      b88f8c:	4c 8b 76 50          	mov    r14,QWORD PTR [rsi+0x50]
      b88f90:	48 8b 46 68          	mov    rax,QWORD PTR [rsi+0x68]
      b88f94:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      b88f99:	48 8b 86 80 00 00 00 	mov    rax,QWORD PTR [rsi+0x80]
      b88fa0:	48 8d 0d 71 4e c8 00 	lea    rcx,[rip+0xc84e71]        # 180de18 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3ad8>

### 0xef803c: mov    QWORD PTR [rbx+0x10],rax; FDE=(15695854, 15696004)
      ef8011:	e8 54 55 8c 00       	call   17bd56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1716d6>
      ef8016:	4c 89 ff             	mov    rdi,r15
      ef8019:	4c 89 f6             	mov    rsi,r14
      ef801c:	e8 a5 fb ff ff       	call   ef7bc6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbefdc>
      ef8021:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ef8026:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ef802b:	48 29 c1             	sub    rcx,rax
      ef802e:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      ef8031:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      ef8035:	48 8b 05 c4 9b 9b 00 	mov    rax,QWORD PTR [rip+0x9b9bc4]        # 18b1c00 <free@LIBC>
      ef803c:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      ef8040:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef8047:	00 00 
      ef8049:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
      ef804e:	75 2f                	jne    ef807f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf495>
      ef8050:	48 83 c4 30          	add    rsp,0x30
      ef8054:	5b                   	pop    rbx
      ef8055:	41 5e                	pop    r14
      ef8057:	41 5f                	pop    r15
      ef8059:	c3                   	ret
      ef805a:	48 89 c3             	mov    rbx,rax
      ef805d:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      ef8062:	e8 f9 66 8f 00       	call   17ee760 <free@plt>
      ef8067:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef806e:	00 00 
      ef8070:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]

### 0xef80d0: mov    QWORD PTR [rsi+0x10],rax; FDE=(15696036, 15696115)
      ef809f:	e9 c4 f3 ff ff       	jmp    ef7468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbe87e>
      ef80a4:	48 83 ec 28          	sub    rsp,0x28
      ef80a8:	48 89 f2             	mov    rdx,rsi
      ef80ab:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef80b2:	00 00 
      ef80b4:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ef80b9:	48 8d 05 88 01 00 00 	lea    rax,[rip+0x188]        # ef8248 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf65e>
      ef80c0:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
      ef80c5:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      ef80c9:	48 8d 05 78 01 00 00 	lea    rax,[rip+0x178]        # ef8248 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf65e>
      ef80d0:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      ef80d4:	e8 7d 01 00 00       	call   ef8256 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf66c>
      ef80d9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef80e0:	00 00 
      ef80e2:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef80e7:	75 05                	jne    ef80ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf504>
      ef80e9:	48 83 c4 28          	add    rsp,0x28
      ef80ed:	c3                   	ret
      ef80ee:	e8 bd 79 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      ef80f3:	e9 b8 00 00 00       	jmp    ef81b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf5c6>
      ef80f8:	e9 00 00 00 00       	jmp    ef80fd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf513>
      ef80fd:	41 56                	push   r14
      ef80ff:	53                   	push   rbx
      ef8100:	48 83 ec 48          	sub    rsp,0x48
      ef8104:	49 89 f6             	mov    r14,rsi
      ef8107:	48 89 fb             	mov    rbx,rdi

### 0xef815d: mov    QWORD PTR [rbx+0x10],rax; FDE=(15696125, 15696304)
      ef8132:	48 89 e6             	mov    rsi,rsp
      ef8135:	e8 6c f7 8b 00       	call   17b78a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16ba12>
      ef813a:	48 89 e7             	mov    rdi,rsp
      ef813d:	e8 4e 5d 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef8142:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      ef8147:	48 8b 4c 24 28       	mov    rcx,QWORD PTR [rsp+0x28]
      ef814c:	48 29 c1             	sub    rcx,rax
      ef814f:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      ef8152:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      ef8156:	48 8b 05 a3 9a 9b 00 	mov    rax,QWORD PTR [rip+0x9b9aa3]        # 18b1c00 <free@LIBC>
      ef815d:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      ef8161:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef8168:	00 00 
      ef816a:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ef816f:	75 3a                	jne    ef81ab <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf5c1>
      ef8171:	48 83 c4 48          	add    rsp,0x48
      ef8175:	5b                   	pop    rbx
      ef8176:	41 5e                	pop    r14
      ef8178:	c3                   	ret
      ef8179:	48 89 c3             	mov    rbx,rax
      ef817c:	48 89 e7             	mov    rdi,rsp
      ef817f:	e8 0c 5d 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef8184:	eb 03                	jmp    ef8189 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf59f>
      ef8186:	48 89 c3             	mov    rbx,rax
      ef8189:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      ef818e:	e8 cd 65 8f 00       	call   17ee760 <free@plt>

### 0xef81ff: mov    QWORD PTR [rbx+0x10],rax; FDE=(15696304, 15696455)
      ef81d3:	e8 92 53 8c 00       	call   17bd56a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1716d6>
      ef81d8:	41 0f b6 36          	movzx  esi,BYTE PTR [r14]
      ef81dc:	4c 89 ff             	mov    rdi,r15
      ef81df:	e8 98 e6 8b 00       	call   17b687c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a9e8>
      ef81e4:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      ef81e9:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ef81ee:	48 29 c1             	sub    rcx,rax
      ef81f1:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      ef81f4:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      ef81f8:	48 8b 05 01 9a 9b 00 	mov    rax,QWORD PTR [rip+0x9b9a01]        # 18b1c00 <free@LIBC>
      ef81ff:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      ef8203:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef820a:	00 00 
      ef820c:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
      ef8211:	75 2f                	jne    ef8242 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf658>
      ef8213:	48 83 c4 30          	add    rsp,0x30
      ef8217:	5b                   	pop    rbx
      ef8218:	41 5e                	pop    r14
      ef821a:	41 5f                	pop    r15
      ef821c:	c3                   	ret
      ef821d:	48 89 c3             	mov    rbx,rax
      ef8220:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      ef8225:	e8 36 65 8f 00       	call   17ee760 <free@plt>
      ef822a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef8231:	00 00 
      ef8233:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]

### 0xef82c0: mov    QWORD PTR [rbx+0x10],rax; FDE=(15696470, 15696663)
      ef8291:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      ef8296:	e8 0b f6 8b 00       	call   17b78a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16ba12>
      ef829b:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ef82a0:	e8 eb 5b 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef82a5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ef82aa:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      ef82af:	48 29 c1             	sub    rcx,rax
      ef82b2:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      ef82b5:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      ef82b9:	48 8b 05 40 99 9b 00 	mov    rax,QWORD PTR [rip+0x9b9940]        # 18b1c00 <free@LIBC>
      ef82c0:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      ef82c4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef82cb:	00 00 
      ef82cd:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
      ef82d2:	75 3e                	jne    ef8312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf728>
      ef82d4:	48 83 c4 50          	add    rsp,0x50
      ef82d8:	5b                   	pop    rbx
      ef82d9:	41 5e                	pop    r14
      ef82db:	41 5f                	pop    r15
      ef82dd:	c3                   	ret
      ef82de:	48 89 c3             	mov    rbx,rax
      ef82e1:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
      ef82e6:	e8 a5 5b 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ef82eb:	eb 03                	jmp    ef82f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf706>
      ef82ed:	48 89 c3             	mov    rbx,rax
      ef82f0:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]

### 0xef83db: mov    QWORD PTR [rbx+0x10],rax; FDE=(15696673, 15697016)
      ef83b4:	78 09                	js     ef83bf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf7d5>
      ef83b6:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]
      ef83bb:	c6 04 0a 00          	mov    BYTE PTR [rdx+rcx*1],0x0
      ef83bf:	48 63 c9             	movsxd rcx,ecx
      ef83c2:	48 01 c8             	add    rax,rcx
      ef83c5:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ef83ca:	48 29 c8             	sub    rax,rcx
      ef83cd:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef83d0:	48 89 4b 08          	mov    QWORD PTR [rbx+0x8],rcx
      ef83d4:	48 8b 05 25 98 9b 00 	mov    rax,QWORD PTR [rip+0x9b9825]        # 18b1c00 <free@LIBC>
      ef83db:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      ef83df:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef83e6:	00 00 
      ef83e8:	48 3b 44 24 78       	cmp    rax,QWORD PTR [rsp+0x78]
      ef83ed:	0f 85 80 00 00 00    	jne    ef8473 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf889>
      ef83f3:	48 81 c4 80 00 00 00 	add    rsp,0x80
      ef83fa:	5b                   	pop    rbx
      ef83fb:	41 5e                	pop    r14
      ef83fd:	41 5f                	pop    r15
      ef83ff:	c3                   	ret
      ef8400:	f2 0f 11 04 24       	movsd  QWORD PTR [rsp],xmm0
      ef8405:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ef840a:	6a 1a                	push   0x1a
      ef840c:	5e                   	pop    rsi
      ef840d:	e8 c6 51 8c 00       	call   17bd5d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171744>
      ef8412:	f2 0f 10 04 24       	movsd  xmm0,QWORD PTR [rsp]

### 0xef84d5: mov    QWORD PTR [rbx+0x10],rax; FDE=(15697016, 15697179)
      ef84a9:	e8 5e 30 8c 00       	call   17bb50c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16f678>
      ef84ae:	eb 0a                	jmp    ef84ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf8d0>
      ef84b0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ef84b5:	e8 36 25 8c 00       	call   17ba9f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16eb5c>
      ef84ba:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ef84bf:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      ef84c4:	48 29 c1             	sub    rcx,rax
      ef84c7:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      ef84ca:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
      ef84ce:	48 8b 05 2b 97 9b 00 	mov    rax,QWORD PTR [rip+0x9b972b]        # 18b1c00 <free@LIBC>
      ef84d5:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      ef84d9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef84e0:	00 00 
      ef84e2:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      ef84e7:	75 2d                	jne    ef8516 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf92c>
      ef84e9:	48 83 c4 38          	add    rsp,0x38
      ef84ed:	5b                   	pop    rbx
      ef84ee:	41 5e                	pop    r14
      ef84f0:	c3                   	ret
      ef84f1:	48 89 c3             	mov    rbx,rax
      ef84f4:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ef84f9:	e8 62 62 8f 00       	call   17ee760 <free@plt>
      ef84fe:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef8505:	00 00 
      ef8507:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
      ef850c:	75 08                	jne    ef8516 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf92c>

### 0xef8c70: mov    QWORD PTR [rsp+0x10],rdi; FDE=(15699008, 15699295)
      ef8c4a:	48 83 ec 48          	sub    rsp,0x48
      ef8c4e:	49 89 d7             	mov    r15,rdx
      ef8c51:	49 89 f6             	mov    r14,rsi
      ef8c54:	48 89 fb             	mov    rbx,rdi
      ef8c57:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef8c5e:	00 00 
      ef8c60:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      ef8c65:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      ef8c6a:	0f 57 c0             	xorps  xmm0,xmm0
      ef8c6d:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ef8c70:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      ef8c75:	c6 44 24 18 00       	mov    BYTE PTR [rsp+0x18],0x0
      ef8c7a:	48 89 d6             	mov    rsi,rdx
      ef8c7d:	e8 36 e0 db ff       	call   cb6cb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c58>
      ef8c82:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
      ef8c86:	48 8d 43 10          	lea    rax,[rbx+0x10]
      ef8c8a:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
      ef8c8f:	4c 89 21             	mov    QWORD PTR [rcx],r12
      ef8c92:	48 89 e2             	mov    rdx,rsp
      ef8c95:	4c 89 22             	mov    QWORD PTR [rdx],r12
      ef8c98:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ef8c9d:	48 89 54 24 28       	mov    QWORD PTR [rsp+0x28],rdx
      ef8ca2:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
      ef8ca7:	c6 44 24 38 00       	mov    BYTE PTR [rsp+0x38],0x0
      ef8cac:	4d 85 ff             	test   r15,r15
      ef8caf:	74 2c                	je     ef8cdd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc00f3>

### 0xef8d6d: mov    QWORD PTR [rsp+0x10],rax; FDE=(15699296, 15699356)
      ef8d49:	00 00 
      ef8d4b:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ef8d50:	75 08                	jne    ef8d5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0170>
      ef8d52:	4c 89 f7             	mov    rdi,r14
      ef8d55:	e8 76 6f b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ef8d5a:	e8 51 6d 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      ef8d5f:	cc                   	int3
      ef8d60:	48 83 ec 18          	sub    rsp,0x18
      ef8d64:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef8d6b:	00 00 
      ef8d6d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      ef8d72:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
      ef8d77:	48 89 38             	mov    QWORD PTR [rax],rdi
      ef8d7a:	48 89 c7             	mov    rdi,rax
      ef8d7d:	e8 1a 00 00 00       	call   ef8d9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc01b2>
      ef8d82:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef8d89:	00 00 
      ef8d8b:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      ef8d90:	75 05                	jne    ef8d97 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc01ad>
      ef8d92:	48 83 c4 18          	add    rsp,0x18
      ef8d96:	c3                   	ret
      ef8d97:	e8 14 6d 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      ef8d9c:	41 57                	push   r15
      ef8d9e:	41 56                	push   r14
      ef8da0:	41 54                	push   r12
      ef8da2:	53                   	push   rbx

### 0xef8f3a: mov    QWORD PTR [rdi+0x10],rax; FDE=(15699756, 15699821)
      ef8f22:	c3                   	ret
      ef8f23:	48 89 c7             	mov    rdi,rax
      ef8f26:	e8 7a 0b b8 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      ef8f2b:	cc                   	int3
      ef8f2c:	41 56                	push   r14
      ef8f2e:	53                   	push   rbx
      ef8f2f:	50                   	push   rax
      ef8f30:	48 89 f3             	mov    rbx,rsi
      ef8f33:	49 89 fe             	mov    r14,rdi
      ef8f36:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
      ef8f3a:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef8f3e:	0f 28 06             	movaps xmm0,XMMWORD PTR [rsi]
      ef8f41:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      ef8f44:	48 83 c7 20          	add    rdi,0x20
      ef8f48:	48 83 c6 20          	add    rsi,0x20
      ef8f4c:	e8 3f 13 b8 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ef8f51:	49 83 c6 50          	add    r14,0x50
      ef8f55:	48 83 c3 50          	add    rbx,0x50
      ef8f59:	6a 09                	push   0x9
      ef8f5b:	59                   	pop    rcx
      ef8f5c:	4c 89 f7             	mov    rdi,r14
      ef8f5f:	48 89 de             	mov    rsi,rbx
      ef8f62:	f3 48 a5             	rep movs QWORD PTR es:[rdi],QWORD PTR ds:[rsi]
      ef8f65:	48 83 c4 08          	add    rsp,0x8
      ef8f69:	5b                   	pop    rbx
      ef8f6a:	41 5e                	pop    r14

### 0xef9124: mov    QWORD PTR [rsp+0x10],0x1; FDE=(15700208, 15700370)
      ef90f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef90fe:	00 00 
      ef9100:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      ef9105:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      ef9109:	bf d0 03 00 00       	mov    edi,0x3d0
      ef910e:	e8 ed 4d 8f 00       	call   17edf00 <_Znwm@plt>
      ef9113:	48 89 c3             	mov    rbx,rax
      ef9116:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef911a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      ef911f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef9124:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      ef912b:	00 00 
      ef912d:	48 8d 05 ac d4 93 00 	lea    rax,[rip+0x93d4ac]        # 18365e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8578>
      ef9134:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef9137:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      ef913b:	4c 89 f6             	mov    rsi,r14
      ef913e:	e8 2d 8a 00 00       	call   f01b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc8f86>
      ef9143:	48 89 e7             	mov    rdi,rsp
      ef9146:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      ef914a:	e8 7b 11 b8 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      ef914f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef9156:	00 00 
      ef9158:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      ef915d:	75 2e                	jne    ef918d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc05a3>
      ef915f:	48 89 d8             	mov    rax,rbx
      ef9162:	48 83 c4 28          	add    rsp,0x28

### 0xef91ff: mov    QWORD PTR [rdi+0x10],rax; FDE=(15700428, 15722027)
      ef91d6:	48 81 ec f8 0a 00 00 	sub    rsp,0xaf8
      ef91dd:	49 89 fc             	mov    r12,rdi
      ef91e0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ef91e7:	00 00 
      ef91e9:	48 89 84 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],rax
      ef91f0:	00 
      ef91f1:	0f 57 c0             	xorps  xmm0,xmm0
      ef91f4:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      ef91f7:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ef91fb:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef9203:	48 8d 47 30          	lea    rax,[rdi+0x30]
      ef9207:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
      ef920b:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
      ef920f:	66 0f 6f 86 50 01 00 	movdqa xmm0,XMMWORD PTR [rsi+0x150]
      ef9216:	00 
      ef9217:	48 89 74 24 60       	mov    QWORD PTR [rsp+0x60],rsi
      ef921c:	48 8b 86 58 01 00 00 	mov    rax,QWORD PTR [rsi+0x158]
      ef9223:	48 85 c0             	test   rax,rax
      ef9226:	74 05                	je     ef922d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0643>
      ef9228:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef922d:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      ef9232:	8a 80 b7 01 00 00    	mov    al,BYTE PTR [rax+0x1b7]
      ef9238:	66 0f 7f 84 24 10 07 	movdqa XMMWORD PTR [rsp+0x710],xmm0
      ef923f:	00 00 
      ef9241:	66 49 0f 3a 16 c6 01 	pextrq r14,xmm0,0x1

### 0xef9431: mov    QWORD PTR [rcx+0x10],r15; FDE=(15700428, 15722027)
      ef9407:	e8 a6 50 ba ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      ef940c:	4c 89 ff             	mov    rdi,r15
      ef940f:	e8 72 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9414:	31 ff                	xor    edi,edi
      ef9416:	e8 01 50 ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      ef941b:	48 8d 05 5e f2 99 00 	lea    rax,[rip+0x99f25e]        # 1898680 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x55c0>
      ef9422:	48 8d 8c 24 b0 06 00 	lea    rcx,[rsp+0x6b0]
      ef9429:	00 
      ef942a:	48 89 01             	mov    QWORD PTR [rcx],rax
      ef942d:	48 89 69 08          	mov    QWORD PTR [rcx+0x8],rbp
      ef9431:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
      ef9435:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      ef9439:	31 ff                	xor    edi,edi
      ef943b:	e8 46 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9440:	48 8d bc 24 f0 05 00 	lea    rdi,[rsp+0x5f0]
      ef9447:	00 
      ef9448:	e8 1d 0b b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef944d:	4c 8b 64 24 68       	mov    r12,QWORD PTR [rsp+0x68]
      ef9452:	eb 09                	jmp    ef945d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0873>
      ef9454:	48 83 a4 24 d0 06 00 	and    QWORD PTR [rsp+0x6d0],0x0
      ef945b:	00 00 
      ef945d:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      ef9464:	00 
      ef9465:	e8 00 0b b8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      ef946a:	4c 89 f7             	mov    rdi,r14
      ef946d:	e8 14 50 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

### 0xef97d2: mov    QWORD PTR [rsp+0x10],rbx; FDE=(15700428, 15722027)
      ef97a5:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]
      ef97a9:	48 8b 55 08          	mov    rdx,QWORD PTR [rbp+0x8]
      ef97ad:	48 8b 8c 24 10 02 00 	mov    rcx,QWORD PTR [rsp+0x210]
      ef97b4:	00 
      ef97b5:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
      ef97ba:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      ef97c1:	00 00 
      ef97c3:	f3 0f 7f 44 24 38    	movdqu XMMWORD PTR [rsp+0x38],xmm0
      ef97c9:	89 44 24 28          	mov    DWORD PTR [rsp+0x28],eax
      ef97cd:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
      ef97d2:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      ef97d7:	48 8d 84 24 f0 05 00 	lea    rax,[rsp+0x5f0]
      ef97de:	00 
      ef97df:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ef97e4:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
      ef97eb:	00 
      ef97ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef97f0:	83 64 24 50 00       	and    DWORD PTR [rsp+0x50],0x0
      ef97f5:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      ef97fb:	48 c7 44 24 18 0a 00 	mov    QWORD PTR [rsp+0x18],0xa
      ef9802:	00 00 
      ef9804:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
      ef980b:	00 
      ef980c:	4c 8d 8c 24 20 02 00 	lea    r9,[rsp+0x220]
      ef9813:	00 
      ef9814:	4c 89 ef             	mov    rdi,r13

### 0xef9ab8: mov    QWORD PTR [rsp+0x10],r14; FDE=(15700428, 15722027)
      ef9a8a:	4c 8b 84 24 10 02 00 	mov    r8,QWORD PTR [rsp+0x210]
      ef9a91:	00 
      ef9a92:	4c 89 44 24 48       	mov    QWORD PTR [rsp+0x48],r8
      ef9a97:	f3 0f 6f 84 24 00 02 	movdqu xmm0,XMMWORD PTR [rsp+0x200]
      ef9a9e:	00 00 
      ef9aa0:	f3 0f 7f 44 24 38    	movdqu XMMWORD PTR [rsp+0x38],xmm0
      ef9aa6:	89 7c 24 50          	mov    DWORD PTR [rsp+0x50],edi
      ef9aaa:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
      ef9aaf:	89 44 24 28          	mov    DWORD PTR [rsp+0x28],eax
      ef9ab3:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
      ef9ab8:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      ef9abd:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
      ef9ac2:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
      ef9ac9:	00 
      ef9aca:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ef9ace:	48 c7 44 24 18 0a 00 	mov    QWORD PTR [rsp+0x18],0xa
      ef9ad5:	00 00 
      ef9ad7:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
      ef9ade:	00 
      ef9adf:	4c 8d 8c 24 20 02 00 	lea    r9,[rsp+0x220]
      ef9ae6:	00 
      ef9ae7:	4c 89 ef             	mov    rdi,r13
      ef9aea:	49 89 e8             	mov    r8,rbp
      ef9aed:	e8 42 cf 04 00       	call   f46a34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10de4a>
      ef9af2:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      ef9af9:	00 

### 0xefb03d: mov    QWORD PTR [rax+0x10],r14; FDE=(15700428, 15722027)
      efb016:	48 83 a4 24 30 07 00 	and    QWORD PTR [rsp+0x730],0x0
      efb01d:	00 00 
      efb01f:	6a 28                	push   0x28
      efb021:	5f                   	pop    rdi
      efb022:	e8 d9 2e 8f 00       	call   17edf00 <_Znwm@plt>
      efb027:	48 8d 8c 24 10 02 00 	lea    rcx,[rsp+0x210]
      efb02e:	00 
      efb02f:	48 8d 15 aa b6 93 00 	lea    rdx,[rip+0x93b6aa]        # 18366e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8678>
      efb036:	48 89 10             	mov    QWORD PTR [rax],rdx
      efb039:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
      efb03d:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      efb041:	66 0f ef c0          	pxor   xmm0,xmm0
      efb045:	66 0f 7f 41 f0       	movdqa XMMWORD PTR [rcx-0x10],xmm0
      efb04a:	66 0f 6f 09          	movdqa xmm1,XMMWORD PTR [rcx]
      efb04e:	f3 0f 7f 48 18       	movdqu XMMWORD PTR [rax+0x18],xmm1
      efb053:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
      efb057:	48 89 84 24 30 07 00 	mov    QWORD PTR [rsp+0x730],rax
      efb05e:	00 
      efb05f:	4c 8b bc 24 a8 01 00 	mov    r15,QWORD PTR [rsp+0x1a8]
      efb066:	00 
      efb067:	48 8b 8c 24 b0 01 00 	mov    rcx,QWORD PTR [rsp+0x1b0]
      efb06e:	00 
      efb06f:	49 39 cf             	cmp    r15,rcx
      efb072:	73 19                	jae    efb08d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc24a3>
      efb074:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb07b:	00 

### 0xefb64a: mov    QWORD PTR [rsp+0x10],rbx; FDE=(15700428, 15722027)
      efb61e:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
      efb623:	0f 10 84 24 20 02 00 	movups xmm0,XMMWORD PTR [rsp+0x220]
      efb62a:	00 
      efb62b:	0f 11 44 24 38       	movups XMMWORD PTR [rsp+0x38],xmm0
      efb630:	89 54 24 50          	mov    DWORD PTR [rsp+0x50],edx
      efb634:	89 4c 24 28          	mov    DWORD PTR [rsp+0x28],ecx
      efb638:	48 8d 8c 24 e0 01 00 	lea    rcx,[rsp+0x1e0]
      efb63f:	00 
      efb640:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      efb645:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      efb64a:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      efb64f:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
      efb654:	48 8d 84 24 40 02 00 	lea    rax,[rsp+0x240]
      efb65b:	00 
      efb65c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      efb660:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      efb666:	48 8d 8c 24 10 07 00 	lea    rcx,[rsp+0x710]
      efb66d:	00 
      efb66e:	4c 8d 8c 24 d0 01 00 	lea    r9,[rsp+0x1d0]
      efb675:	00 
      efb676:	4c 89 ef             	mov    rdi,r13
      efb679:	48 89 ea             	mov    rdx,rbp
      efb67c:	4d 89 e0             	mov    r8,r12
      efb67f:	e8 b0 b3 04 00       	call   f46a34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10de4a>
      efb684:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efb68b:	00 

### 0xefe902: mov    QWORD PTR [rsp+0x10],rdi; FDE=(15722731, 15723058)
      efe8eb:	55                   	push   rbp
      efe8ec:	41 57                	push   r15
      efe8ee:	41 56                	push   r14
      efe8f0:	41 55                	push   r13
      efe8f2:	41 54                	push   r12
      efe8f4:	53                   	push   rbx
      efe8f5:	48 83 ec 18          	sub    rsp,0x18
      efe8f9:	49 89 cc             	mov    r12,rcx
      efe8fc:	49 89 d5             	mov    r13,rdx
      efe8ff:	49 89 f6             	mov    r14,rsi
      efe902:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
      efe907:	6a 70                	push   0x70
      efe909:	5f                   	pop    rdi
      efe90a:	e8 f1 f5 8e 00       	call   17edf00 <_Znwm@plt>
      efe90f:	49 89 c7             	mov    r15,rax
      efe912:	48 89 c3             	mov    rbx,rax
      efe915:	0f 57 c0             	xorps  xmm0,xmm0
      efe918:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      efe91c:	48 8d 05 9d be 93 00 	lea    rax,[rip+0x93be9d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efe923:	49 89 07             	mov    QWORD PTR [r15],rax
      efe926:	4c 89 ef             	mov    rdi,r13
      efe929:	e8 e2 f5 8e 00       	call   17edf10 <strlen@plt>
      efe92e:	48 89 c5             	mov    rbp,rax
      efe931:	f3 41 0f 6f 06       	movdqu xmm0,XMMWORD PTR [r14]
      efe936:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
      efe93a:	48 85 c0             	test   rax,rax

### 0xefebb6: mov    QWORD PTR [rsp+0x10],0x1; FDE=(15723396, 15723556)
      efeb92:	00 00 
      efeb94:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      efeb99:	4c 8d 77 10          	lea    r14,[rdi+0x10]
      efeb9d:	6a 40                	push   0x40
      efeb9f:	5f                   	pop    rdi
      efeba0:	e8 5b f3 8e 00       	call   17edf00 <_Znwm@plt>
      efeba5:	48 89 c3             	mov    rbx,rax
      efeba8:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      efebac:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      efebb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      efebb6:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      efebbd:	00 00 
      efebbf:	48 8d 05 62 7b 93 00 	lea    rax,[rip+0x937b62]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efebc6:	48 89 03             	mov    QWORD PTR [rbx],rax
      efebc9:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      efebcd:	4c 89 f6             	mov    rsi,r14
      efebd0:	e8 bb b6 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efebd5:	48 89 e7             	mov    rdi,rsp
      efebd8:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      efebdc:	e8 e9 b6 b7 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      efebe1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efebe8:	00 00 
      efebea:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      efebef:	75 2e                	jne    efec1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6035>
      efebf1:	48 89 d8             	mov    rax,rbx
      efebf4:	48 83 c4 28          	add    rsp,0x28

### 0xefedef: mov    QWORD PTR [rsp+0x10],rax; FDE=(15724002, 15724097)
      efedcf:	41 5e                	pop    r14
      efedd1:	41 5f                	pop    r15
      efedd3:	c3                   	ret
      efedd4:	e8 d7 0c 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      efedd9:	48 89 c7             	mov    rdi,rax
      efeddc:	e8 c4 ac b7 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      efede1:	cc                   	int3
      efede2:	48 83 ec 18          	sub    rsp,0x18
      efede6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efeded:	00 00 
      efedef:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      efedf4:	89 4c 24 0c          	mov    DWORD PTR [rsp+0xc],ecx
      efedf8:	44 88 44 24 0b       	mov    BYTE PTR [rsp+0xb],r8b
      efedfd:	48 85 f6             	test   rsi,rsi
      efee00:	74 25                	je     efee27 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc623d>
      efee02:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      efee05:	48 8d 4c 24 0c       	lea    rcx,[rsp+0xc]
      efee0a:	4c 8d 44 24 0b       	lea    r8,[rsp+0xb]
      efee0f:	ff 50 30             	call   QWORD PTR [rax+0x30]
      efee12:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efee19:	00 00 
      efee1b:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      efee20:	75 1a                	jne    efee3c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6252>
      efee22:	48 83 c4 18          	add    rsp,0x18
      efee26:	c3                   	ret
      efee27:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0xefee71: movups XMMWORD PTR [rdi+0x10],xmm0; FDE=(15724098, 15724222)
      efee47:	48 81 ec 20 04 00 00 	sub    rsp,0x420
      efee4e:	89 d3                	mov    ebx,edx
      efee50:	49 89 fe             	mov    r14,rdi
      efee53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efee5a:	00 00 
      efee5c:	48 89 84 24 18 04 00 	mov    QWORD PTR [rsp+0x418],rax
      efee63:	00 
      efee64:	c6 87 40 04 00 00 00 	mov    BYTE PTR [rdi+0x440],0x0
      efee6b:	0f 57 c0             	xorps  xmm0,xmm0
      efee6e:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      efee71:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
      efee75:	0f 11 47 19          	movups XMMWORD PTR [rdi+0x19],xmm0
      efee79:	49 89 e7             	mov    r15,rsp
      efee7c:	4c 89 ff             	mov    rdi,r15
      efee7f:	e8 28 14 7d 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
      efee84:	4c 89 f7             	mov    rdi,r14
      efee87:	4c 89 fe             	mov    rsi,r15
      efee8a:	89 da                	mov    edx,ebx
      efee8c:	e8 2d 00 00 00       	call   efeebe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc62d4>
      efee91:	4c 89 ff             	mov    rdi,r15
      efee94:	e8 f7 14 7d 00       	call   16d0390 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x844fc>
      efee99:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efeea0:	00 00 
      efeea2:	48 3b 84 24 18 04 00 	cmp    rax,QWORD PTR [rsp+0x418]
      efeea9:	00 
      efeeaa:	75 0d                	jne    efeeb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc62cf>

### 0xefeed9: mov    QWORD PTR [rsp+0x10],rax; FDE=(15724222, 15724522)
      efeebe:	55                   	push   rbp
      efeebf:	41 57                	push   r15
      efeec1:	41 56                	push   r14
      efeec3:	53                   	push   rbx
      efeec4:	48 83 ec 18          	sub    rsp,0x18
      efeec8:	89 d5                	mov    ebp,edx
      efeeca:	49 89 f6             	mov    r14,rsi
      efeecd:	48 89 fb             	mov    rbx,rdi
      efeed0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efeed7:	00 00 
      efeed9:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      efeede:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      efeee1:	48 85 ff             	test   rdi,rdi
      efeee4:	74 7a                	je     efef60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6376>
      efeee6:	48 83 ff fc          	cmp    rdi,0xfffffffffffffffc
      efeeea:	0f 87 94 00 00 00    	ja     efef84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc639a>
      efeef0:	40 0f b6 d5          	movzx  edx,bpl
      efeef4:	4c 89 f6             	mov    rsi,r14
      efeef7:	ff 17                	call   QWORD PTR [rdi]
      efeef9:	40 84 ed             	test   bpl,bpl
      efeefc:	0f 84 c8 00 00 00    	je     efefca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc63e0>
      efef02:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
      efef05:	49 8d 46 ff          	lea    rax,[r14-0x1]
      efef09:	48 83 f8 fb          	cmp    rax,0xfffffffffffffffb
      efef0d:	77 0f                	ja     efef1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6334>
      efef0f:	4c 89 f7             	mov    rdi,r14

### 0xeff300: movups XMMWORD PTR [rax+0x10],xmm0; FDE=(15724798, 15726625)
      eff2db:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
      eff2e0:	4c 89 e7             	mov    rdi,r12
      eff2e3:	e8 58 ec 8e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      eff2e8:	6a 38                	push   0x38
      eff2ea:	5f                   	pop    rdi
      eff2eb:	e8 10 ec 8e 00       	call   17edf00 <_Znwm@plt>
      eff2f0:	48 8b 8c 24 28 05 00 	mov    rcx,QWORD PTR [rsp+0x528]
      eff2f7:	00 
      eff2f8:	0f 28 84 24 20 05 00 	movaps xmm0,XMMWORD PTR [rsp+0x520]
      eff2ff:	00 
      eff300:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
      eff304:	48 85 c9             	test   rcx,rcx
      eff307:	74 05                	je     eff30e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6724>
      eff309:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
      eff30e:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
      eff313:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
      eff317:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
      eff31c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
      eff320:	0f 57 c0             	xorps  xmm0,xmm0
      eff323:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
      eff328:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
      eff32e:	48 8d 0d 25 d6 0b 00 	lea    rcx,[rip+0xbd625]        # fbc95a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183d70>
      eff335:	48 89 08             	mov    QWORD PTR [rax],rcx
      eff338:	48 8d 0d 99 16 03 00 	lea    rcx,[rip+0x31699]        # f309d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf7dee>
      eff33f:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      eff343:	4c 89 ff             	mov    rdi,r15

### 0xeff391: movdqa XMMWORD PTR [rsp+0x10],xmm1; FDE=(15724798, 15726625)
      eff365:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
      eff36a:	4c 8d bc 24 20 05 00 	lea    r15,[rsp+0x520]
      eff371:	00 
      eff372:	4c 89 fe             	mov    rsi,r15
      eff375:	e8 a2 a4 bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      eff37a:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      eff37e:	e8 03 f1 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      eff383:	66 49 0f 6e c6       	movq   xmm0,r14
      eff388:	66 49 0f 6e cd       	movq   xmm1,r13
      eff38d:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
      eff391:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      eff397:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      eff39c:	4c 89 f7             	mov    rdi,r14
      eff39f:	e8 0e f1 b9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      eff3a4:	4c 89 f7             	mov    rdi,r14
      eff3a7:	e8 da f0 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      eff3ac:	eb 28                	jmp    eff3d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc67ec>
      eff3ae:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
      eff3b5:	00 
      eff3b6:	c6 06 00             	mov    BYTE PTR [rsi],0x0
      eff3b9:	48 89 df             	mov    rdi,rbx
      eff3bc:	e8 b5 cf f8 ff       	call   e8c376 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5378c>
      eff3c1:	e9 68 03 00 00       	jmp    eff72e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6b44>
      eff3c6:	66 0f ef c0          	pxor   xmm0,xmm0
      eff3ca:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      eff3d0:	45 31 f6             	xor    r14d,r14d

### 0xeff3ca: movdqa XMMWORD PTR [rsp+0x10],xmm0; FDE=(15724798, 15726625)
      eff3a4:	4c 89 f7             	mov    rdi,r14
      eff3a7:	e8 da f0 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      eff3ac:	eb 28                	jmp    eff3d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc67ec>
      eff3ae:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
      eff3b5:	00 
      eff3b6:	c6 06 00             	mov    BYTE PTR [rsi],0x0
      eff3b9:	48 89 df             	mov    rdi,rbx
      eff3bc:	e8 b5 cf f8 ff       	call   e8c376 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5378c>
      eff3c1:	e9 68 03 00 00       	jmp    eff72e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6b44>
      eff3c6:	66 0f ef c0          	pxor   xmm0,xmm0
      eff3ca:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      eff3d0:	45 31 f6             	xor    r14d,r14d
      eff3d3:	45 31 ed             	xor    r13d,r13d
      eff3d6:	4c 8d bc 24 88 00 00 	lea    r15,[rsp+0x88]
      eff3dd:	00 
      eff3de:	48 8d b4 24 28 16 00 	lea    rsi,[rsp+0x1628]
      eff3e5:	00 
      eff3e6:	4c 89 ff             	mov    rdi,r15
      eff3e9:	e8 3c b1 7c 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      eff3ee:	49 89 6f 18          	mov    QWORD PTR [r15+0x18],rbp
      eff3f2:	48 85 db             	test   rbx,rbx
      eff3f5:	74 69                	je     eff460 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6876>
      eff3f7:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      eff3fc:	e8 b5 e2 02 00       	call   f2d6b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4acc>
      eff401:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      eff406:	4d 85 f6             	test   r14,r14

### 0xeff418: mov    QWORD PTR [rax+0x10],r14; FDE=(15724798, 15726625)
      eff3f2:	48 85 db             	test   rbx,rbx
      eff3f5:	74 69                	je     eff460 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6876>
      eff3f7:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      eff3fc:	e8 b5 e2 02 00       	call   f2d6b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf4acc>
      eff401:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      eff406:	4d 85 f6             	test   r14,r14
      eff409:	74 05                	je     eff410 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6826>
      eff40b:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      eff410:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      eff414:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]
      eff418:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      eff41c:	e8 65 f0 b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      eff421:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      eff426:	4c 8b 74 24 78       	mov    r14,QWORD PTR [rsp+0x78]
      eff42b:	4d 85 f6             	test   r14,r14
      eff42e:	0f 84 75 01 00 00    	je     eff5a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc69bf>
      eff434:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      eff439:	48 89 84 24 20 05 00 	mov    QWORD PTR [rsp+0x520],rax
      eff440:	00 
      eff441:	4c 89 b4 24 28 05 00 	mov    QWORD PTR [rsp+0x528],r14
      eff448:	00 
      eff449:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      eff44e:	e9 67 01 00 00       	jmp    eff5ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc69d0>
      eff453:	66 0f ef c0          	pxor   xmm0,xmm0
      eff457:	f3 0f 7f 03          	movdqu XMMWORD PTR [rbx],xmm0
      eff45b:	e9 2d 01 00 00       	jmp    eff58d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc69a3>

### 0xeff4cb: mov    QWORD PTR [r12+0x10],rax; FDE=(15724798, 15726625)
      eff4a3:	48 8d ac 24 48 09 00 	lea    rbp,[rsp+0x948]
      eff4aa:	00 
      eff4ab:	48 89 ef             	mov    rdi,rbp
      eff4ae:	4c 89 e6             	mov    rsi,r12
      eff4b1:	e8 fa 32 7d 00       	call   16d27b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8691c>
      eff4b6:	bf b8 04 00 00       	mov    edi,0x4b8
      eff4bb:	e8 40 ea 8e 00       	call   17edf00 <_Znwm@plt>
      eff4c0:	49 89 c4             	mov    r12,rax
      eff4c3:	48 8b 84 24 20 05 00 	mov    rax,QWORD PTR [rsp+0x520]
      eff4ca:	00 
      eff4cb:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      eff4d0:	48 8b 84 24 28 05 00 	mov    rax,QWORD PTR [rsp+0x528]
      eff4d7:	00 
      eff4d8:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
      eff4dd:	48 85 c0             	test   rax,rax
      eff4e0:	74 05                	je     eff4e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc68fd>
      eff4e2:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      eff4e7:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
      eff4ec:	4c 89 ee             	mov    rsi,r13
      eff4ef:	e8 b8 0d 7d 00       	call   16d02ac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84418>
      eff4f4:	4c 89 e7             	mov    rdi,r12
      eff4f7:	48 81 c7 38 04 00 00 	add    rdi,0x438
      eff4fe:	48 89 ee             	mov    rsi,rbp
      eff501:	e8 9e 31 7d 00       	call   16d26a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x86810>
      eff506:	48 8d 05 e5 d1 0b 00 	lea    rax,[rip+0xbd1e5]        # fbc6f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183b08>
      eff50d:	49 89 04 24          	mov    QWORD PTR [r12],rax

### 0xeff5f5: mov    QWORD PTR [r15+0x10],rax; FDE=(15724798, 15726625)
      eff5d2:	48 8b 9c 24 a0 00 00 	mov    rbx,QWORD PTR [rsp+0xa0]
      eff5d9:	00 
      eff5da:	48 89 9c 24 48 05 00 	mov    QWORD PTR [rsp+0x548],rbx
      eff5e1:	00 
      eff5e2:	6a 40                	push   0x40
      eff5e4:	5f                   	pop    rdi
      eff5e5:	e8 16 e9 8e 00       	call   17edf00 <_Znwm@plt>
      eff5ea:	49 89 c7             	mov    r15,rax
      eff5ed:	48 8b 84 24 20 05 00 	mov    rax,QWORD PTR [rsp+0x520]
      eff5f4:	00 
      eff5f5:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      eff5f9:	48 8b 84 24 28 05 00 	mov    rax,QWORD PTR [rsp+0x528]
      eff600:	00 
      eff601:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      eff605:	48 85 c0             	test   rax,rax
      eff608:	74 0d                	je     eff617 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6a2d>
      eff60a:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      eff60f:	48 8b 9c 24 48 05 00 	mov    rbx,QWORD PTR [rsp+0x548]
      eff616:	00 
      eff617:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
      eff61c:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
      eff620:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
      eff625:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      eff62a:	0f 57 c0             	xorps  xmm0,xmm0
      eff62d:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
      eff633:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0

### 0xeff6eb: movdqa XMMWORD PTR [rsp+0x10],xmm0; FDE=(15724798, 15726625)
      eff6c4:	f3 0f 7f 03          	movdqu XMMWORD PTR [rbx],xmm0
      eff6c8:	4d 85 ff             	test   r15,r15
      eff6cb:	74 0a                	je     eff6d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6aed>
      eff6cd:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      eff6d2:	4c 8b 7c 24 78       	mov    r15,QWORD PTR [rsp+0x78]
      eff6d7:	4c 89 f7             	mov    rdi,r14
      eff6da:	e8 d3 ed b9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      eff6df:	4c 89 ff             	mov    rdi,r15
      eff6e2:	e8 9f ed b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      eff6e7:	66 0f ef c0          	pxor   xmm0,xmm0
      eff6eb:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
      eff6f1:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
      eff6f8:	00 
      eff6f9:	e8 92 e7 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      eff6fe:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      eff704:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      eff70b:	e8 76 ed b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      eff710:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      eff715:	e8 76 e7 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      eff71a:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      eff71f:	e8 62 ed b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      eff724:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      eff729:	e8 62 e7 8e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      eff72e:	48 8d bc 24 28 16 00 	lea    rdi,[rsp+0x1628]
      eff735:	00 
      eff736:	e8 f3 5b 7c 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>

### 0xeff88c: mov    QWORD PTR [rsi+0x10],rax; FDE=(15726710, 15726747)
      eff86a:	48 85 c9             	test   rcx,rcx
      eff86d:	74 05                	je     eff874 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6c8a>
      eff86f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      eff874:	5b                   	pop    rbx
      eff875:	c3                   	ret
      eff876:	48 8d 05 ab 6d 93 00 	lea    rax,[rip+0x936dab]        # 1836628 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x85c0>
      eff87d:	48 89 06             	mov    QWORD PTR [rsi],rax
      eff880:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      eff884:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      eff888:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      eff88c:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
      eff890:	48 85 c0             	test   rax,rax
      eff893:	74 05                	je     eff89a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6cb0>
      eff895:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      eff89a:	c3                   	ret
      eff89b:	cc                   	int3
      eff89c:	55                   	push   rbp
      eff89d:	41 57                	push   r15
      eff89f:	41 56                	push   r14
      eff8a1:	41 55                	push   r13
      eff8a3:	41 54                	push   r12
      eff8a5:	53                   	push   rbx
      eff8a6:	48 81 ec 28 02 00 00 	sub    rsp,0x228
      eff8ad:	49 89 f6             	mov    r14,rsi
      eff8b0:	48 89 fb             	mov    rbx,rdi
      eff8b3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0xeffa59: mov    QWORD PTR [rsp+0x10],rbx; FDE=(15726748, 15728817)
      effa2d:	4c 89 ff             	mov    rdi,r15
      effa30:	e8 51 ea b9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      effa35:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
      effa3c:	00 
      effa3d:	e9 15 05 00 00       	jmp    efff57 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc736d>
      effa42:	4d 8d bd b0 00 00 00 	lea    r15,[r13+0xb0]
      effa49:	48 8d 74 24 78       	lea    rsi,[rsp+0x78]
      effa4e:	4c 89 ff             	mov    rdi,r15
      effa51:	e8 12 5e be ff       	call   ae5868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x32808>
      effa56:	48 85 c0             	test   rax,rax
      effa59:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      effa5e:	0f 85 0e 03 00 00    	jne    effd72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc7188>
      effa64:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      effa6b:	00 
      effa6c:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
      effa73:	00 
      effa74:	e8 59 0e 7d 00       	call   16d08d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a3e>
      effa79:	49 8b 75 20          	mov    rsi,QWORD PTR [r13+0x20]
      effa7d:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      effa82:	48 8d 94 24 30 01 00 	lea    rdx,[rsp+0x130]
      effa89:	00 
      effa8a:	e8 2b d6 ba ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
      effa8f:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
      effa96:	00 
      effa97:	e8 0e 0e 7d 00       	call   16d08aa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84a16>
      effa9c:	48 8d 6c 24 38       	lea    rbp,[rsp+0x38]

### 0xeffec3: mov    QWORD PTR [r15+0x10],r14; FDE=(15726748, 15728817)
      effea4:	49 8d 45 f0          	lea    rax,[r13-0x10]
      effea8:	49 89 c5             	mov    r13,rax
      effeab:	48 39 d8             	cmp    rax,rbx
      effeae:	75 db                	jne    effe8b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc72a1>
      effeb0:	4d 8b 27             	mov    r12,QWORD PTR [r15]
      effeb3:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
      effeb7:	eb 03                	jmp    effebc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc72d2>
      effeb9:	4d 89 ec             	mov    r12,r13
      effebc:	49 89 0f             	mov    QWORD PTR [r15],rcx
      effebf:	49 89 6f 08          	mov    QWORD PTR [r15+0x8],rbp
      effec3:	4d 89 77 10          	mov    QWORD PTR [r15+0x10],r14
      effec7:	4d 39 e5             	cmp    r13,r12
      effeca:	74 0f                	je     effedb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc72f1>
      effecc:	49 8b 7d f8          	mov    rdi,QWORD PTR [r13-0x8]
      effed0:	49 83 c5 f0          	add    r13,0xfffffffffffffff0
      effed4:	e8 d9 e5 b9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      effed9:	eb ec                	jmp    effec7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc72dd>
      effedb:	4d 85 e4             	test   r12,r12
      effede:	74 08                	je     effee8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc72fe>
      effee0:	4c 89 e7             	mov    rdi,r12
      effee3:	e8 38 e0 8e 00       	call   17edf20 <_ZdlPv@plt>
      effee8:	49 89 6f 08          	mov    QWORD PTR [r15+0x8],rbp
      effeec:	31 ff                	xor    edi,edi
      effeee:	e8 bf e5 b9 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      effef3:	48 8b 9c 24 90 00 00 	mov    rbx,QWORD PTR [rsp+0x90]
      effefa:	00 

### 0x135204c: movups XMMWORD PTR [rsi+0x10],xmm0; FDE=(20258872, 20258905)
     1352025:	48 8d 05 5c 9e 5c 00 	lea    rax,[rip+0x5c9e5c]        # 191be88 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x63298>
     135202c:	48 8b 0d 5d 9e 5c 00 	mov    rcx,QWORD PTR [rip+0x5c9e5d]        # 191be90 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x632a0>
     1352033:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     1352036:	c3                   	ret
     1352037:	cc                   	int3
     1352038:	48 89 f0             	mov    rax,rsi
     135203b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     135203f:	48 8d 0d 12 52 51 00 	lea    rcx,[rip+0x515212]        # 1867258 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23940>
     1352046:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     1352049:	0f 57 c0             	xorps  xmm0,xmm0
     135204c:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
     1352050:	48 89 56 20          	mov    QWORD PTR [rsi+0x20],rdx
     1352054:	83 66 28 00          	and    DWORD PTR [rsi+0x28],0x0
     1352058:	c3                   	ret
     1352059:	cc                   	int3
     135205a:	48 89 f0             	mov    rax,rsi
     135205d:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     1352061:	48 8d 0d 70 51 51 00 	lea    rcx,[rip+0x515170]        # 18671d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x238c0>
     1352068:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     135206b:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     1352070:	83 66 18 00          	and    DWORD PTR [rsi+0x18],0x0
     1352074:	c3                   	ret
     1352075:	cc                   	int3
     1352076:	0f 18 0d 73 9b 5c 00 	prefetcht0 BYTE PTR [rip+0x5c9b73]        # 191bbf0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x63000>
     135207d:	48 8d 05 6c 9b 5c 00 	lea    rax,[rip+0x5c9b6c]        # 191bbf0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x63000>
     1352084:	48 8b 0d 6d 9b 5c 00 	mov    rcx,QWORD PTR [rip+0x5c9b6d]        # 191bbf8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x63008>

### 0x1352558: mov    QWORD PTR [rsp+0x10],rax; FDE=(20260004, 20264020)
     135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
     1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
     1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1352560:	4c 89 ff             	mov    rdi,r15
     1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
     1352575:	48 89 c3             	mov    rbx,rax
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0

### 0x135258a: movdqu XMMWORD PTR [rbx+0x10],xmm0; FDE=(20260004, 20264020)
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
     1352575:	48 89 c3             	mov    rbx,rax
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     1352594:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     1352599:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     135259e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     13525a3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525a7:	48 8d 35 19 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     13525ae:	48 8d 0d 1b a8 08 ff 	lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     13525b5:	6a 08                	push   0x8
     13525b7:	41 5e                	pop    r14
     13525b9:	6a 24                	push   0x24
     13525bb:	41 58                	pop    r8
     13525bd:	4c 89 f2             	mov    rdx,r14
     13525c0:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     13525c6:	68 10 27 00 00       	push   0x2710
     13525cb:	6a 64                	push   0x64

### 0x13526ad: mov    QWORD PTR [r14+0x10],rax; FDE=(20260004, 20264020)
     1352686:	5f                   	pop    rdi
     1352687:	e8 74 b8 49 00       	call   17edf00 <_Znwm@plt>
     135268c:	49 89 c6             	mov    r14,rax
     135268f:	48 8d 05 22 4d 51 00 	lea    rax,[rip+0x514d22]        # 18673b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23aa0>
     1352696:	49 89 06             	mov    QWORD PTR [r14],rax
     1352699:	48 8b bc 24 50 01 00 	mov    rdi,QWORD PTR [rsp+0x150]
     13526a0:	00 
     13526a1:	49 89 7e 08          	mov    QWORD PTR [r14+0x8],rdi
     13526a5:	48 8b 84 24 58 01 00 	mov    rax,QWORD PTR [rsp+0x158]
     13526ac:	00 
     13526ad:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     13526b1:	48 85 c0             	test   rax,rax
     13526b4:	74 05                	je     13526bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197c3f>
     13526b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     13526bb:	4c 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r15
     13526c2:	00 
     13526c3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13526c6:	6a 01                	push   0x1
     13526c8:	5e                   	pop    rsi
     13526c9:	ff 50 50             	call   QWORD PTR [rax+0x50]
     13526cc:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]
     13526d3:	00 
     13526d4:	49 83 27 00          	and    QWORD PTR [r15],0x0
     13526d8:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     13526dd:	4c 89 f6             	mov    rsi,r14
     13526e0:	e8 cd 29 dd ff       	call   11250b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec4c8>

### 0x1352788: mov    QWORD PTR [rax+0x10],rdx; FDE=(20260004, 20264020)
     1352764:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1352768:	4c 89 e7             	mov    rdi,r12
     135276b:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135276e:	49 89 c7             	mov    r15,rax
     1352771:	bf 90 00 00 00       	mov    edi,0x90
     1352776:	e8 85 b7 49 00       	call   17edf00 <_Znwm@plt>
     135277b:	48 63 cd             	movsxd rcx,ebp
     135277e:	49 63 d5             	movsxd rdx,r13d
     1352781:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352784:	c6 40 08 01          	mov    BYTE PTR [rax+0x8],0x1
     1352788:	48 89 50 10          	mov    QWORD PTR [rax+0x10],rdx
     135278c:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352791:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     1352795:	49 8b 8e d8 01 00 00 	mov    rcx,QWORD PTR [r14+0x1d8]
     135279c:	41 0f 28 86 d0 01 00 	movaps xmm0,XMMWORD PTR [r14+0x1d0]
     13527a3:	00 
     13527a4:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     13527a8:	48 85 c9             	test   rcx,rcx
     13527ab:	74 05                	je     13527b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197d36>
     13527ad:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     13527b2:	49 8b 8f c8 01 00 00 	mov    rcx,QWORD PTR [r15+0x1c8]
     13527b9:	66 41 0f 6f 87 c0 01 	movdqa xmm0,XMMWORD PTR [r15+0x1c0]
     13527c0:	00 00 
     13527c2:	f3 0f 7f 40 30       	movdqu XMMWORD PTR [rax+0x30],xmm0
     13527c7:	48 85 c9             	test   rcx,rcx
     13527ca:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]

### 0x135298b: mov    QWORD PTR [rax+0x10],r14; FDE=(20260004, 20264020)
     1352966:	eb 4b                	jmp    13529b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197f37>
     1352968:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135296d:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352970:	6a 18                	push   0x18
     1352972:	5f                   	pop    rdi
     1352973:	e8 88 b5 49 00       	call   17edf00 <_Znwm@plt>
     1352978:	48 8d 0d d9 eb 51 00 	lea    rcx,[rip+0x51ebd9]        # 1871558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc40>
     135297f:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352982:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352987:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     135298b:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     135298f:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1352994:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352997:	48 89 01             	mov    QWORD PTR [rcx],rax
     135299a:	48 85 ff             	test   rdi,rdi
     135299d:	0f 84 e6 00 00 00    	je     1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     13529a3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13529a6:	ff 50 08             	call   QWORD PTR [rax+0x8]
     13529a9:	e9 db 00 00 00       	jmp    1352a89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19800d>
     13529ae:	66 48 0f 7e c7       	movq   rdi,xmm0
     13529b3:	49 83 c7 18          	add    r15,0x18
     13529b7:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
     13529bc:	66 0f ef c0          	pxor   xmm0,xmm0
     13529c0:	f3 41 0f 7f 46 18    	movdqu XMMWORD PTR [r14+0x18],xmm0
     13529c6:	41 c6 46 30 01       	mov    BYTE PTR [r14+0x30],0x1
     13529cb:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x1352a5c: movdqu XMMWORD PTR [rax+0x10],xmm0; FDE=(20260004, 20264020)
     1352a36:	eb 49                	jmp    1352a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198005>
     1352a38:	6a 20                	push   0x20
     1352a3a:	5f                   	pop    rdi
     1352a3b:	e8 c0 b4 49 00       	call   17edf00 <_Znwm@plt>
     1352a40:	48 8d 0d c1 ea 51 00 	lea    rcx,[rip+0x51eac1]        # 1871508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dbf0>
     1352a47:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352a4a:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352a4f:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1352a53:	66 0f 6f 84 24 80 00 	movdqa xmm0,XMMWORD PTR [rsp+0x80]
     1352a5a:	00 00 
     1352a5c:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
     1352a61:	4d 85 ed             	test   r13,r13
     1352a64:	74 05                	je     1352a6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x197fef>
     1352a66:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
     1352a6b:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     1352a70:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352a73:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352a76:	48 85 ff             	test   rdi,rdi
     1352a79:	74 06                	je     1352a81 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198005>
     1352a7b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352a7e:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1352a81:	4c 89 e7             	mov    rdi,r12
     1352a84:	e8 fd b9 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1352a89:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     1352a8d:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
     1352a94:	00 

### 0x1352aee: movdqu XMMWORD PTR [r14+0x10],xmm0; FDE=(20260004, 20264020)
     1352ac4:	e8 37 b4 49 00       	call   17edf00 <_Znwm@plt>
     1352ac9:	49 89 c6             	mov    r14,rax
     1352acc:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
     1352ad1:	49 89 06             	mov    QWORD PTR [r14],rax
     1352ad4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1352ad9:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     1352add:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     1352ae4:	00 
     1352ae5:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
     1352aec:	00 00 
     1352aee:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
     1352af4:	48 85 c0             	test   rax,rax
     1352af7:	74 05                	je     1352afe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198082>
     1352af9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     1352afe:	4d 8d 7e 20          	lea    r15,[r14+0x20]
     1352b02:	4c 89 ff             	mov    rdi,r15
     1352b05:	e8 ec 6e 48 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1352b0a:	4d 8d 66 30          	lea    r12,[r14+0x30]
     1352b0e:	4c 89 e7             	mov    rdi,r12
     1352b11:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     1352b16:	e8 a7 eb 46 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
     1352b1b:	31 c0                	xor    eax,eax
     1352b1d:	41 88 46 68          	mov    BYTE PTR [r14+0x68],al
     1352b21:	49 8d 4e 70          	lea    rcx,[r14+0x70]
     1352b25:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
     1352b2a:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al

### 0x1352c2a: movups XMMWORD PTR [rax+0x10],xmm0; FDE=(20260004, 20264020)
     1352c04:	6a 38                	push   0x38
     1352c06:	5f                   	pop    rdi
     1352c07:	e8 f4 b2 49 00       	call   17edf00 <_Znwm@plt>
     1352c0c:	48 8d 0d 55 4b 51 00 	lea    rcx,[rip+0x514b55]        # 1867768 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23e50>
     1352c13:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352c16:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
     1352c1a:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352c21:	00 
     1352c22:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
     1352c29:	00 
     1352c2a:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
     1352c2e:	48 85 c9             	test   rcx,rcx
     1352c31:	48 8b 94 24 90 00 00 	mov    rdx,QWORD PTR [rsp+0x90]
     1352c38:	00 
     1352c39:	74 05                	je     1352c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1981c4>
     1352c3b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352c40:	48 8b 8c 24 e8 00 00 	mov    rcx,QWORD PTR [rsp+0xe8]
     1352c47:	00 
     1352c48:	66 0f 6f 84 24 e0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xe0]
     1352c4f:	00 00 
     1352c51:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     1352c56:	48 85 c9             	test   rcx,rcx
     1352c59:	74 05                	je     1352c60 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1981e4>
     1352c5b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352c60:	48 89 50 30          	mov    QWORD PTR [rax+0x30],rdx
     1352c64:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]

### 0x1352cf7: mov    QWORD PTR [rax+0x10],r14; FDE=(20260004, 20264020)
     1352cd2:	eb 5d                	jmp    1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352cd4:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     1352cd9:	4c 8b 30             	mov    r14,QWORD PTR [rax]
     1352cdc:	6a 28                	push   0x28
     1352cde:	5f                   	pop    rdi
     1352cdf:	e8 1c b2 49 00       	call   17edf00 <_Znwm@plt>
     1352ce4:	48 8d 0d 45 e8 51 00 	lea    rcx,[rip+0x51e845]        # 1871530 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2dc18>
     1352ceb:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352cee:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1352cf3:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     1352cf7:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
     1352cfb:	48 8b 8c 24 f8 00 00 	mov    rcx,QWORD PTR [rsp+0xf8]
     1352d02:	00 
     1352d03:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
     1352d0a:	00 00 
     1352d0c:	f3 0f 7f 40 18       	movdqu XMMWORD PTR [rax+0x18],xmm0
     1352d11:	48 85 c9             	test   rcx,rcx
     1352d14:	74 05                	je     1352d1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19829f>
     1352d16:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1352d1b:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
     1352d20:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     1352d23:	48 89 01             	mov    QWORD PTR [rcx],rax
     1352d26:	48 85 ff             	test   rdi,rdi
     1352d29:	74 06                	je     1352d31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1982b5>
     1352d2b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1352d2e:	ff 50 08             	call   QWORD PTR [rax+0x8]

### 0x1352d90: mov    BYTE PTR [r15+0x10],0x1; FDE=(20260004, 20264020)
     1352d6d:	49 89 c6             	mov    r14,rax
     1352d70:	6a 20                	push   0x20
     1352d72:	5f                   	pop    rdi
     1352d73:	e8 88 b1 49 00       	call   17edf00 <_Znwm@plt>
     1352d78:	48 8d 8c 24 c8 00 00 	lea    rcx,[rsp+0xc8]
     1352d7f:	00 
     1352d80:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1352d87:	00 
     1352d88:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
     1352d8c:	c6 40 19 04          	mov    BYTE PTR [rax+0x19],0x4
     1352d90:	41 c6 47 10 01       	mov    BYTE PTR [r15+0x10],0x1
     1352d95:	48 8b b4 24 30 01 00 	mov    rsi,QWORD PTR [rsp+0x130]
     1352d9c:	00 
     1352d9d:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
     1352da4:	00 
     1352da5:	4c 89 f2             	mov    rdx,r14
     1352da8:	48 89 c1             	mov    rcx,rax
     1352dab:	e8 bc cd 78 ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
     1352db0:	49 83 27 00          	and    QWORD PTR [r15],0x0
     1352db4:	4c 89 ff             	mov    rdi,r15
     1352db7:	e8 0e 75 72 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     1352dbc:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     1352dc1:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1352dc4:	4c 8d b4 24 58 01 00 	lea    r14,[rsp+0x158]
     1352dcb:	00 
     1352dcc:	49 89 46 f8          	mov    QWORD PTR [r14-0x8],rax

### 0x1352e26: mov    QWORD PTR [rcx+0x10],rax; FDE=(20260004, 20264020)
     1352e05:	00 
     1352e06:	48 89 50 f8          	mov    QWORD PTR [rax-0x8],rdx
     1352e0a:	48 89 08             	mov    QWORD PTR [rax],rcx
     1352e0d:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
     1352e14:	00 
     1352e15:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
     1352e19:	48 85 d2             	test   rdx,rdx
     1352e1c:	74 1a                	je     1352e38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1983bc>
     1352e1e:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
     1352e25:	00 
     1352e26:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     1352e2a:	48 89 52 f8          	mov    QWORD PTR [rdx-0x8],rdx
     1352e2e:	66 0f ef c0          	pxor   xmm0,xmm0
     1352e32:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
     1352e36:	eb 08                	jmp    1352e40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1983c4>
     1352e38:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
     1352e3f:	00 
     1352e40:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1352e47:	00 00 
     1352e49:	66 0f ef c0          	pxor   xmm0,xmm0
     1352e4d:	66 0f 7f 84 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm0
     1352e54:	00 00 
     1352e56:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
     1352e5d:	00 
     1352e5e:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
     1352e65:	00 

### 0x1352ff0: movaps XMMWORD PTR [rsp+0x10],xmm0; FDE=(20260004, 20264020)
     1352fc8:	00 
     1352fc9:	e8 54 06 00 00       	call   1353622 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ba6>
     1352fce:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
     1352fd5:	00 
     1352fd6:	e8 e5 b5 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1352fdb:	bf e8 08 00 00       	mov    edi,0x8e8
     1352fe0:	e8 1b af 49 00       	call   17edf00 <_Znwm@plt>
     1352fe5:	49 89 c6             	mov    r14,rax
     1352fe8:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
     1352fef:	00 
     1352ff0:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     1352ff5:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
     1352ffc:	00 
     1352ffd:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
     1353004:	00 
     1353005:	0f 57 c0             	xorps  xmm0,xmm0
     1353008:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     135300f:	00 
     1353010:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1353017:	00 00 
     1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
     1353020:	49 89 06             	mov    QWORD PTR [r14],rax
     1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
     135302a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135302e:	49 8d 46 10          	lea    rax,[r14+0x10]
     1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>

### 0x1353039: mov    QWORD PTR [r14+0x10],rcx; FDE=(20260004, 20264020)
     1353008:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
     135300f:	00 
     1353010:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
     1353017:	00 00 
     1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
     1353020:	49 89 06             	mov    QWORD PTR [r14],rax
     1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
     135302a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135302e:	49 8d 46 10          	lea    rax,[r14+0x10]
     1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
     1353039:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     135303d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1353044:	00 
     1353045:	49 89 7e 18          	mov    QWORD PTR [r14+0x18],rdi
     1353049:	48 8b 8c 24 08 01 00 	mov    rcx,QWORD PTR [rsp+0x108]
     1353050:	00 
     1353051:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
     1353055:	48 85 c9             	test   rcx,rcx
     1353058:	74 05                	je     135305f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1985e3>
     135305a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135305f:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
     1353064:	4c 89 f1             	mov    rcx,r14
     1353067:	48 83 c1 40          	add    rcx,0x40
     135306b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     1353070:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
     1353074:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0

### 0x135308b: mov    QWORD PTR [r15+0x10],rax; FDE=(20260004, 20264020)
     135305f:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
     1353064:	4c 89 f1             	mov    rcx,r14
     1353067:	48 83 c1 40          	add    rcx,0x40
     135306b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
     1353070:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
     1353074:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
     1353079:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
     1353080:	00 
     1353081:	49 89 07             	mov    QWORD PTR [r15],rax
     1353084:	48 8d 05 d9 93 72 ff 	lea    rax,[rip+0xffffffffff7293d9]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     135308b:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     135308f:	48 8d 05 96 6d 00 00 	lea    rax,[rip+0x6d96]        # 1359e2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3b0>
     1353096:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
     135309a:	48 83 c7 30          	add    rdi,0x30
     135309e:	4c 89 fe             	mov    rsi,r15
     13530a1:	e8 8e 6d 00 00       	call   1359e34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f3b8>
     13530a6:	4c 89 ff             	mov    rdi,r15
     13530a9:	e8 aa 4f 83 ff       	call   b88058 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ff8>
     13530ae:	4c 8d a4 24 30 01 00 	lea    r12,[rsp+0x130]
     13530b5:	00 
     13530b6:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
     13530bc:	0f 57 c9             	xorps  xmm1,xmm1
     13530bf:	41 0f 29 0c 24       	movaps XMMWORD PTR [r12],xmm1
     13530c4:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
     13530ca:	f3 41 0f 7f 46 58    	movdqu XMMWORD PTR [r14+0x58],xmm0
     13530d0:	4d 89 6e 68          	mov    QWORD PTR [r14+0x68],r13

### 0x1353157: mov    QWORD PTR [r14+0x10],rcx; FDE=(20260004, 20264020)
     1353131:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1353134:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1353137:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     135313b:	48 89 ef             	mov    rdi,rbp
     135313e:	ff 50 48             	call   QWORD PTR [rax+0x48]
     1353141:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
     1353145:	4c 8d b4 24 50 01 00 	lea    r14,[rsp+0x150]
     135314c:	00 
     135314d:	49 89 1e             	mov    QWORD PTR [r14],rbx
     1353150:	48 8d 0d 0d 93 72 ff 	lea    rcx,[rip+0xffffffffff72930d]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     1353157:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
     135315b:	48 8d 0d 2e 06 00 00 	lea    rcx,[rip+0x62e]        # 1353790 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d14>
     1353162:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx
     1353166:	48 83 c0 68          	add    rax,0x68
     135316a:	48 89 c7             	mov    rdi,rax
     135316d:	4c 89 f6             	mov    rsi,r14
     1353170:	e8 e7 91 10 00       	call   145c35c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a18e0>
     1353175:	4c 89 f7             	mov    rdi,r14
     1353178:	e8 33 06 00 00       	call   13537b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d34>
     135317d:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1353184:	00 
     1353185:	e8 ca 05 00 00       	call   1353754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cd8>
     135318a:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
     1353191:	00 
     1353192:	e8 29 b4 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     1353197:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]

### 0x1353715: mov    QWORD PTR [rbx+0x10],r15; FDE=(20264482, 20264787)
     13536f3:	4c 8b 63 08          	mov    r12,QWORD PTR [rbx+0x8]
     13536f7:	eb 06                	jmp    13536ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198c83>
     13536f9:	4c 89 e5             	mov    rbp,r12
     13536fc:	4d 89 ee             	mov    r14,r13
     13536ff:	49 83 c5 20          	add    r13,0x20
     1353703:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     1353707:	48 c1 e0 05          	shl    rax,0x5
     135370b:	49 01 c7             	add    r15,rax
     135370e:	4c 89 33             	mov    QWORD PTR [rbx],r14
     1353711:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     1353715:	4c 89 7b 10          	mov    QWORD PTR [rbx+0x10],r15
     1353719:	49 39 ec             	cmp    r12,rbp
     135371c:	74 10                	je     135372e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cb2>
     135371e:	49 8b 7c 24 f0       	mov    rdi,QWORD PTR [r12-0x10]
     1353723:	49 83 c4 e0          	add    r12,0xffffffffffffffe0
     1353727:	e8 8e ae 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
     135372c:	eb eb                	jmp    1353719 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198c9d>
     135372e:	48 85 ed             	test   rbp,rbp
     1353731:	74 08                	je     135373b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198cbf>
     1353733:	48 89 ef             	mov    rdi,rbp
     1353736:	e8 e5 a7 49 00       	call   17edf20 <_ZdlPv@plt>
     135373b:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     135373f:	48 83 c4 08          	add    rsp,0x8
     1353743:	5b                   	pop    rbx
     1353744:	41 5c                	pop    r12
     1353746:	41 5d                	pop    r13

### 0x1353761: mov    QWORD PTR [rsp+0x10],rax; FDE=(20264788, 20264848)
     1353746:	41 5d                	pop    r13
     1353748:	41 5e                	pop    r14
     135374a:	41 5f                	pop    r15
     135374c:	5d                   	pop    rbp
     135374d:	c3                   	ret
     135374e:	e8 6d 0e 6b ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
     1353753:	cc                   	int3
     1353754:	48 83 ec 18          	sub    rsp,0x18
     1353758:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135375f:	00 00 
     1353761:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1353766:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
     135376b:	48 89 38             	mov    QWORD PTR [rax],rdi
     135376e:	48 89 c7             	mov    rdi,rax
     1353771:	e8 60 00 00 00       	call   13537d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d5a>
     1353776:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135377d:	00 00 
     135377f:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1353784:	75 05                	jne    135378b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d0f>
     1353786:	48 83 c4 18          	add    rsp,0x18
     135378a:	c3                   	ret
     135378b:	e8 20 c3 49 00       	call   17efab0 <__stack_chk_fail@plt>
     1353790:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1353793:	48 8b 40 50          	mov    rax,QWORD PTR [rax+0x50]
     1353797:	80 b8 d8 08 00 00 00 	cmp    BYTE PTR [rax+0x8d8],0x0
     135379e:	74 0a                	je     13537aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d2e>

### 0x1353842: mov    QWORD PTR [rdi+0x10],rcx; FDE=(20265004, 20265067)
     1353826:	41 5e                	pop    r14
     1353828:	41 5f                	pop    r15
     135382a:	c3                   	ret
     135382b:	cc                   	int3
     135382c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     135382f:	48 89 07             	mov    QWORD PTR [rdi],rax
     1353832:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
     1353836:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     135383a:	48 8d 47 10          	lea    rax,[rdi+0x10]
     135383e:	48 8b 4e 10          	mov    rcx,QWORD PTR [rsi+0x10]
     1353842:	48 89 4f 10          	mov    QWORD PTR [rdi+0x10],rcx
     1353846:	48 8b 56 18          	mov    rdx,QWORD PTR [rsi+0x18]
     135384a:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
     135384e:	48 85 d2             	test   rdx,rdx
     1353851:	74 13                	je     1353866 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198dea>
     1353853:	48 8d 56 10          	lea    rdx,[rsi+0x10]
     1353857:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     135385b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     135385f:	0f 57 c0             	xorps  xmm0,xmm0
     1353862:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     1353865:	c3                   	ret
     1353866:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     135386a:	c3                   	ret
     135386b:	cc                   	int3
     135386c:	48 39 d6             	cmp    rsi,rdx
     135386f:	74 3f                	je     13538b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e34>

### 0x1353857: mov    QWORD PTR [rcx+0x10],rax; FDE=(20265004, 20265067)
     1353832:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
     1353836:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     135383a:	48 8d 47 10          	lea    rax,[rdi+0x10]
     135383e:	48 8b 4e 10          	mov    rcx,QWORD PTR [rsi+0x10]
     1353842:	48 89 4f 10          	mov    QWORD PTR [rdi+0x10],rcx
     1353846:	48 8b 56 18          	mov    rdx,QWORD PTR [rsi+0x18]
     135384a:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
     135384e:	48 85 d2             	test   rdx,rdx
     1353851:	74 13                	je     1353866 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198dea>
     1353853:	48 8d 56 10          	lea    rdx,[rsi+0x10]
     1353857:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
     135385b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     135385f:	0f 57 c0             	xorps  xmm0,xmm0
     1353862:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
     1353865:	c3                   	ret
     1353866:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     135386a:	c3                   	ret
     135386b:	cc                   	int3
     135386c:	48 39 d6             	cmp    rsi,rdx
     135386f:	74 3f                	je     13538b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198e34>
     1353871:	41 57                	push   r15
     1353873:	41 56                	push   r14
     1353875:	41 54                	push   r12
     1353877:	53                   	push   rbx
     1353878:	50                   	push   rax
     1353879:	48 89 d3             	mov    rbx,rdx

### 0x1353a4b: mov    QWORD PTR [rsp+0x10],rax; FDE=(20265534, 20265594)
     1353a27:	5b                   	pop    rbx
     1353a28:	c3                   	ret
     1353a29:	e8 82 c0 49 00       	call   17efab0 <__stack_chk_fail@plt>
     1353a2e:	48 89 c7             	mov    rdi,rax
     1353a31:	e8 6f 60 72 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1353a36:	48 89 f7             	mov    rdi,rsi
     1353a39:	e9 00 00 00 00       	jmp    1353a3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198fc2>
     1353a3e:	48 83 ec 18          	sub    rsp,0x18
     1353a42:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353a49:	00 00 
     1353a4b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     1353a50:	48 8d 44 24 08       	lea    rax,[rsp+0x8]
     1353a55:	48 89 38             	mov    QWORD PTR [rax],rdi
     1353a58:	48 89 c7             	mov    rdi,rax
     1353a5b:	e8 1a 00 00 00       	call   1353a7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ffe>
     1353a60:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353a67:	00 00 
     1353a69:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     1353a6e:	75 05                	jne    1353a75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ff9>
     1353a70:	48 83 c4 18          	add    rsp,0x18
     1353a74:	c3                   	ret
     1353a75:	e8 36 c0 49 00       	call   17efab0 <__stack_chk_fail@plt>
     1353a7a:	53                   	push   rbx
     1353a7b:	48 89 fb             	mov    rbx,rdi
     1353a7e:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     1353a81:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0

### 0x1353b97: movaps XMMWORD PTR [r14+0x10],xmm0; FDE=(20265830, 20266021)
     1353b70:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1353b77:	00 00 
     1353b79:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1353b7e:	48 8d 05 bb 37 51 00 	lea    rax,[rip+0x5137bb]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1353b85:	48 89 07             	mov    QWORD PTR [rdi],rax
     1353b88:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
     1353b8c:	48 85 ff             	test   rdi,rdi
     1353b8f:	74 23                	je     1353bb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199138>
     1353b91:	0f 57 c0             	xorps  xmm0,xmm0
     1353b94:	49 89 e6             	mov    r14,rsp
     1353b97:	41 0f 29 46 10       	movaps XMMWORD PTR [r14+0x10],xmm0
     1353b9c:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
     1353ba0:	48 83 c7 68          	add    rdi,0x68
     1353ba4:	4c 89 f6             	mov    rsi,r14
     1353ba7:	e8 b0 87 10 00       	call   145c35c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a18e0>
     1353bac:	4c 89 f7             	mov    rdi,r14
     1353baf:	e8 fc fb ff ff       	call   13537b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198d34>
     1353bb4:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
     1353bb8:	e8 6b 62 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1353bbd:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     1353bc1:	e8 7c 14 dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
     1353bc6:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     1353bca:	e8 59 62 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     1353bcf:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     1353bd3:	e8 c4 f9 ff ff       	call   135359c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b20>
     1353bd8:	48 8d 7b 30          	lea    rdi,[rbx+0x30]

