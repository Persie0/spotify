# Registry facade helper cluster

## b63180..b634c0

/tmp/regfac/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b63180 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0120>:
  b63180:	00 48 8b             	add    BYTE PTR [rax-0x75],cl
  b63183:	bc 24 a8 00 00       	mov    esp,0xa824
  b63188:	00 e8                	add    al,ch
  b6318a:	f8                   	clc
  b6318b:	b2 f3                	mov    dl,0xf3
  b6318d:	ff                   	jmp    (bad)
  b6318e:	eb 2e                	jmp    b631be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb015e>
  b63190:	49 89 c4             	mov    r12,rax
  b63193:	eb 29                	jmp    b631be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb015e>
  b63195:	49 89 c4             	mov    r12,rax
  b63198:	6a 60                	push   0x60
  b6319a:	5b                   	pop    rbx
  b6319b:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
  b6319f:	48 81 c7 00 01 00 00 	add    rdi,0x100
  b631a6:	e8 e5 ac c8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b631ab:	48 83 c3 e8          	add    rbx,0xffffffffffffffe8
  b631af:	48 83 fb e8          	cmp    rbx,0xffffffffffffffe8
  b631b3:	75 e6                	jne    b6319b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb013b>
  b631b5:	eb 63                	jmp    b6321a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb01ba>
  b631b7:	eb 46                	jmp    b631ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb019f>
  b631b9:	eb 44                	jmp    b631ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb019f>
  b631bb:	49 89 c4             	mov    r12,rax
  b631be:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  b631c5:	00 
  b631c6:	e8 9f 01 00 00       	call   b6336a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb030a>
  b631cb:	eb 4d                	jmp    b6321a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb01ba>
  b631cd:	eb 30                	jmp    b631ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb019f>
  b631cf:	eb 2e                	jmp    b631ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb019f>
  b631d1:	eb 2c                	jmp    b631ff <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb019f>
  b631d3:	49 89 c4             	mov    r12,rax
  b631d6:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b631dd:	00 
  b631de:	e8 87 6d f1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b631e3:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  b631ea:	00 
  b631eb:	e8 a0 ac c8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b631f0:	eb 03                	jmp    b631f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0195>
  b631f2:	49 89 c4             	mov    r12,rax
  b631f5:	4c 89 f7             	mov    rdi,r14
  b631f8:	e8 23 ad c8 00       	call   17edf20 <_ZdlPv@plt>
  b631fd:	eb 1b                	jmp    b6321a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb01ba>
  b631ff:	49 89 c4             	mov    r12,rax
  b63202:	eb 16                	jmp    b6321a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb01ba>
  b63204:	eb 69                	jmp    b6326f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb020f>
  b63206:	49 89 c4             	mov    r12,rax
  b63209:	49 83 c5 e8          	add    r13,0xffffffffffffffe8
  b6320d:	4c 89 ef             	mov    rdi,r13
  b63210:	e8 7b ac c8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b63215:	4d 39 fd             	cmp    r13,r15
  b63218:	75 ef                	jne    b63209 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb01a9>
  b6321a:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
  b6321f:	e8 04 6c f1 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  b63224:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  b63229:	e8 f0 00 00 00       	call   b6331e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02be>
  b6322e:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  b63233:	e8 e8 ac c8 00       	call   17edf20 <_ZdlPv@plt>
  b63238:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
  b6323f:	00 
  b63240:	e8 41 b2 f3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b63245:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  b6324a:	e8 41 ac c8 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b6324f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b63256:	00 00 
  b63258:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
  b6325f:	00 
  b63260:	75 08                	jne    b6326a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb020a>
  b63262:	4c 89 e7             	mov    rdi,r12
  b63265:	e8 66 ca f0 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b6326a:	e8 41 c8 c8 00       	call   17efab0 <__stack_chk_fail@plt>
  b6326f:	49 89 c4             	mov    r12,rax
  b63272:	eb c4                	jmp    b63238 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb01d8>
  b63274:	53                   	push   rbx
  b63275:	48 89 fb             	mov    rbx,rdi
  b63278:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b6327c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b63280:	ba b2 00 00 00       	mov    edx,0xb2
  b63285:	e8 54 f0 ff ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b6328a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b6328d:	48 8b 80 90 05 00 00 	mov    rax,QWORD PTR [rax+0x590]
  b63294:	48 85 c0             	test   rax,rax
  b63297:	74 02                	je     b6329b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb023b>
  b63299:	5b                   	pop    rbx
  b6329a:	c3                   	ret
  b6329b:	e8 1f 6d f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b632a0:	53                   	push   rbx
  b632a1:	48 89 fb             	mov    rbx,rdi
  b632a4:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b632a8:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b632ac:	6a 51                	push   0x51
  b632ae:	5a                   	pop    rdx
  b632af:	e8 2a f0 ff ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b632b4:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b632b7:	48 8b 80 88 02 00 00 	mov    rax,QWORD PTR [rax+0x288]
  b632be:	48 85 c0             	test   rax,rax
  b632c1:	74 02                	je     b632c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0265>
  b632c3:	5b                   	pop    rbx
  b632c4:	c3                   	ret
  b632c5:	e8 f5 6c f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b632ca:	53                   	push   rbx
  b632cb:	48 89 fb             	mov    rbx,rdi
  b632ce:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b632d2:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b632d6:	6a 2f                	push   0x2f
  b632d8:	5a                   	pop    rdx
  b632d9:	e8 00 f0 ff ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b632de:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b632e1:	48 8b 80 78 01 00 00 	mov    rax,QWORD PTR [rax+0x178]
  b632e8:	48 85 c0             	test   rax,rax
  b632eb:	74 02                	je     b632ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb028f>
  b632ed:	5b                   	pop    rbx
  b632ee:	c3                   	ret
  b632ef:	e8 cb 6c f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b632f4:	53                   	push   rbx
  b632f5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  b632f8:	48 89 37             	mov    QWORD PTR [rdi],rsi
  b632fb:	48 85 db             	test   rbx,rbx
  b632fe:	74 13                	je     b63313 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02b3>
  b63300:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b63303:	48 89 df             	mov    rdi,rbx
  b63306:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b63309:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b6330c:	48 89 df             	mov    rdi,rbx
  b6330f:	5b                   	pop    rbx
  b63310:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
  b63313:	5b                   	pop    rbx
  b63314:	c3                   	ret
  b63315:	48 89 c7             	mov    rdi,rax
  b63318:	e8 88 67 f1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b6331d:	cc                   	int3
  b6331e:	31 f6                	xor    esi,esi
  b63320:	e9 cf ff ff ff       	jmp    b632f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0294>
  b63325:	cc                   	int3
  b63326:	48 8d 35 23 c6 83 ff 	lea    rsi,[rip+0xffffffffff83c623]        # 39f950 <_ZTSN5boost9exceptionE@@Base+0x332>
  b6332d:	48 8d 0d 3c c6 83 ff 	lea    rcx,[rip+0xffffffffff83c63c]        # 39f970 <_ZTSN5boost9exceptionE@@Base+0x352>
  b63334:	6a 11                	push   0x11
  b63336:	5a                   	pop    rdx
  b63337:	6a 1b                	push   0x1b
  b63339:	41 58                	pop    r8
  b6333b:	6a 01                	push   0x1
  b6333d:	41 59                	pop    r9
  b6333f:	e9 46 40 a8 00       	jmp    15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  b63344:	53                   	push   rbx
  b63345:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  b63349:	48 85 c0             	test   rax,rax
  b6334c:	74 11                	je     b6335f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02ff>
  b6334e:	48 89 fb             	mov    rbx,rdi
  b63351:	31 ff                	xor    edi,edi
  b63353:	48 89 de             	mov    rsi,rbx
  b63356:	31 d2                	xor    edx,edx
  b63358:	ff d0                	call   rax
  b6335a:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  b6335f:	5b                   	pop    rbx
  b63360:	c3                   	ret
  b63361:	48 89 c7             	mov    rdi,rax
  b63364:	e8 3c 67 f1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b63369:	cc                   	int3
  b6336a:	53                   	push   rbx
  b6336b:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  b6336f:	48 85 c0             	test   rax,rax
  b63372:	74 11                	je     b63385 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0325>
  b63374:	48 89 fb             	mov    rbx,rdi
  b63377:	31 ff                	xor    edi,edi
  b63379:	48 89 de             	mov    rsi,rbx
  b6337c:	31 d2                	xor    edx,edx
  b6337e:	ff d0                	call   rax
  b63380:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  b63385:	5b                   	pop    rbx
  b63386:	c3                   	ret
  b63387:	48 89 c7             	mov    rdi,rax
  b6338a:	e8 16 67 f1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b6338f:	cc                   	int3
  b63390:	50                   	push   rax
  b63391:	6a 10                	push   0x10
  b63393:	5f                   	pop    rdi
  b63394:	e8 67 ab c8 00       	call   17edf00 <_Znwm@plt>
  b63399:	48 8d 0d 58 9b ca 00 	lea    rcx,[rip+0xca9b58]        # 180cef8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2bb8>
  b633a0:	48 89 08             	mov    QWORD PTR [rax],rcx
  b633a3:	59                   	pop    rcx
  b633a4:	c3                   	ret
  b633a5:	cc                   	int3
  b633a6:	48 8d 05 4b 9b ca 00 	lea    rax,[rip+0xca9b4b]        # 180cef8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2bb8>
  b633ad:	48 89 06             	mov    QWORD PTR [rsi],rax
  b633b0:	c3                   	ret
  b633b1:	cc                   	int3
  b633b2:	41 57                	push   r15
  b633b4:	41 56                	push   r14
  b633b6:	53                   	push   rbx
  b633b7:	48 89 fb             	mov    rbx,rdi
  b633ba:	83 3a 04             	cmp    DWORD PTR [rdx],0x4
  b633bd:	0f 85 80 00 00 00    	jne    b63443 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb03e3>
  b633c3:	48 8d 35 b2 eb 8e ff 	lea    rsi,[rip+0xffffffffff8eebb2]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  b633ca:	48 8d 0d b8 28 80 ff 	lea    rcx,[rip+0xffffffffff8028b8]        # 365c89 <_ZTSSt12bad_any_cast@@Base-0x2a53f>
  b633d1:	6a 04                	push   0x4
  b633d3:	5f                   	pop    rdi
  b633d4:	6a 7f                	push   0x7f
  b633d6:	5a                   	pop    rdx
  b633d7:	31 c0                	xor    eax,eax
  b633d9:	e8 f4 34 c7 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
  b633de:	bf 58 01 00 00       	mov    edi,0x158
  b633e3:	e8 18 ab c8 00       	call   17edf00 <_Znwm@plt>
  b633e8:	49 89 c6             	mov    r14,rax
  b633eb:	0f 57 c0             	xorps  xmm0,xmm0
  b633ee:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  b633f2:	48 8d 05 47 9b ca 00 	lea    rax,[rip+0xca9b47]        # 180cf40 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2c00>
  b633f9:	49 89 06             	mov    QWORD PTR [r14],rax
  b633fc:	4d 8d 7e 18          	lea    r15,[r14+0x18]
  b63400:	ba 40 01 00 00       	mov    edx,0x140
  b63405:	4c 89 ff             	mov    rdi,r15
  b63408:	31 f6                	xor    esi,esi
  b6340a:	e8 81 b7 c8 00       	call   17eeb90 <memset@plt>
  b6340f:	4c 89 ff             	mov    rdi,r15
  b63412:	e8 3b 00 00 00       	call   b63452 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb03f2>
  b63417:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  b6341c:	48 8d 05 55 9b ca 00 	lea    rax,[rip+0xca9b55]        # 180cf78 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2c38>
  b63423:	48 89 03             	mov    QWORD PTR [rbx],rax
  b63426:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  b6342a:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  b6342e:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
  b63432:	31 ff                	xor    edi,edi
  b63434:	e8 4d b0 f3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b63439:	4c 89 f7             	mov    rdi,r14
  b6343c:	e8 45 b0 f3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b63441:	eb 05                	jmp    b63448 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb03e8>
  b63443:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
  b63448:	48 89 d8             	mov    rax,rbx
  b6344b:	5b                   	pop    rbx
  b6344c:	41 5e                	pop    r14
  b6344e:	41 5f                	pop    r15
  b63450:	c3                   	ret
  b63451:	cc                   	int3
  b63452:	53                   	push   rbx
  b63453:	48 89 fb             	mov    rbx,rdi
  b63456:	e8 ed 62 89 00       	call   13f9748 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23eccc>
  b6345b:	48 83 a3 c0 00 00 00 	and    QWORD PTR [rbx+0xc0],0x0
  b63462:	00 
  b63463:	83 a3 c8 00 00 00 00 	and    DWORD PTR [rbx+0xc8],0x0
  b6346a:	c6 83 cc 00 00 00 00 	mov    BYTE PTR [rbx+0xcc],0x0
  b63471:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
  b63478:	00 
  b63479:	0f 57 c0             	xorps  xmm0,xmm0
  b6347c:	0f 11 83 d0 00 00 00 	movups XMMWORD PTR [rbx+0xd0],xmm0
  b63483:	48 8d 83 f0 00 00 00 	lea    rax,[rbx+0xf0]
  b6348a:	0f 11 83 f0 00 00 00 	movups XMMWORD PTR [rbx+0xf0],xmm0
  b63491:	48 89 83 e8 00 00 00 	mov    QWORD PTR [rbx+0xe8],rax
  b63498:	48 8d 83 08 01 00 00 	lea    rax,[rbx+0x108]
  b6349f:	0f 11 83 08 01 00 00 	movups XMMWORD PTR [rbx+0x108],xmm0
  b634a6:	48 89 83 00 01 00 00 	mov    QWORD PTR [rbx+0x100],rax
  b634ad:	66 83 a3 18 01 00 00 	and    WORD PTR [rbx+0x118],0x0
  b634b4:	00 
  b634b5:	0f 11 83 1c 01 00 00 	movups XMMWORD PTR [rbx+0x11c],xmm0
  b634bc:	0f                   	.byte 0xf
  b634bd:	11                   	.byte 0x11
  b634be:	83                   	.byte 0x83
  b634bf:	2c                   	.byte 0x2c

## Direct callers of b63274
452784-  b623a9:	5a                   	pop    rdx
452785-  b623aa:	c3                   	ret
452786-  b623ab:	cc                   	int3
452787-  b623ac:	55                   	push   rbp
452788-  b623ad:	41 57                	push   r15
452789-  b623af:	41 56                	push   r14
452790-  b623b1:	41 55                	push   r13
452791-  b623b3:	41 54                	push   r12
452792-  b623b5:	53                   	push   rbx
452793-  b623b6:	48 81 ec 88 01 00 00 	sub    rsp,0x188
452794-  b623bd:	49 89 ce             	mov    r14,rcx
452795-  b623c0:	48 89 d3             	mov    rbx,rdx
452796-  b623c3:	48 89 fd             	mov    rbp,rdi
452797-  b623c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
452798-  b623cd:	00 00 
452799-  b623cf:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
452800-  b623d6:	00 
452801-  b623d7:	48 89 cf             	mov    rdi,rcx
452802:  b623da:	e8 95 0e 00 00       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
452803-  b623df:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
452804-  b623e4:	4c 89 f7             	mov    rdi,r14
452805-  b623e7:	e8 b4 0e 00 00       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
452806-  b623ec:	49 89 c7             	mov    r15,rax
452807-  b623ef:	4c 89 f7             	mov    rdi,r14
452808-  b623f2:	e8 d3 0e 00 00       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
452809-  b623f7:	49 89 c6             	mov    r14,rax
452810-  b623fa:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
452811-  b62401:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
452812-  b62406:	4c 8b 63 68          	mov    r12,QWORD PTR [rbx+0x68]
452813-  b6240a:	48 8d 35 9c cb 7f ff 	lea    rsi,[rip+0xffffffffff7fcb9c]        # 35efad <_ZTSSt12bad_any_cast@@Base-0x3121b>
452814-  b62411:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
452815-  b62416:	4c 89 ef             	mov    rdi,r13
452816-  b62419:	e8 60 76 f1 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
452817-  b6241e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
452818-  b62422:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
452819-  b62429:	00 
452820-  b6242a:	4c 89 e6             	mov    rsi,r12
452821-  b6242d:	4c 89 ea             	mov    rdx,r13
452822-  b62430:	ff 50 18             	call   QWORD PTR [rax+0x18]
452823-  b62433:	49 8b 07             	mov    rax,QWORD PTR [r15]
452824-  b62436:	4c 89 ff             	mov    rdi,r15
452825-  b62439:	ff 50 28             	call   QWORD PTR [rax+0x28]
452826-  b6243c:	49 89 c7             	mov    r15,rax
452827-  b6243f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
452828-  b62443:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
452829-  b62448:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
452830-  b6244c:	49 8b 06             	mov    rax,QWORD PTR [r14]
452831-  b6244f:	4c 89 f7             	mov    rdi,r14
452832-  b62452:	ff 50 40             	call   QWORD PTR [rax+0x40]
--
697393-  c42eec:	55                   	push   rbp
697394-  c42eed:	41 57                	push   r15
697395-  c42eef:	41 56                	push   r14
697396-  c42ef1:	41 55                	push   r13
697397-  c42ef3:	41 54                	push   r12
697398-  c42ef5:	53                   	push   rbx
697399-  c42ef6:	48 81 ec 78 01 00 00 	sub    rsp,0x178
697400-  c42efd:	49 89 ce             	mov    r14,rcx
697401-  c42f00:	48 89 d3             	mov    rbx,rdx
697402-  c42f03:	49 89 fd             	mov    r13,rdi
697403-  c42f06:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
697404-  c42f0d:	00 00 
697405-  c42f0f:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
697406-  c42f16:	00 
697407-  c42f17:	48 89 cf             	mov    rdi,rcx
697408-  c42f1a:	e8 ab 03 f2 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
697409-  c42f1f:	48 89 c5             	mov    rbp,rax
697410-  c42f22:	4c 89 f7             	mov    rdi,r14
697411:  c42f25:	e8 4a 03 f2 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
697412-  c42f2a:	49 89 c6             	mov    r14,rax
697413-  c42f2d:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
697414-  c42f34:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
697415-  c42f3b:	00 
697416-  c42f3c:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
697417-  c42f40:	48 8d 35 4a ee 6f ff 	lea    rsi,[rip+0xffffffffff6fee4a]        # 341d91 <_ZTSSt12bad_any_cast@@Base-0x4e437>
697418-  c42f47:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
697419-  c42f4e:	00 
697420-  c42f4f:	4c 89 e7             	mov    rdi,r12
697421-  c42f52:	e8 27 6b e3 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
697422-  c42f57:	49 8b 07             	mov    rax,QWORD PTR [r15]
697423-  c42f5a:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
697424-  c42f61:	00 
697425-  c42f62:	4c 89 fe             	mov    rsi,r15
697426-  c42f65:	4c 89 e2             	mov    rdx,r12
697427-  c42f68:	ff 50 18             	call   QWORD PTR [rax+0x18]
697428-  c42f6b:	49 8b 06             	mov    rax,QWORD PTR [r14]
697429-  c42f6e:	4c 89 f7             	mov    rdi,r14
697430-  c42f71:	ff 50 28             	call   QWORD PTR [rax+0x28]
697431-  c42f74:	49 89 c4             	mov    r12,rax
697432-  c42f77:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
697433-  c42f7b:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
697434-  c42f82:	00 
697435-  c42f83:	4c 8b bb 90 00 00 00 	mov    r15,QWORD PTR [rbx+0x90]
697436-  c42f8a:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
697437-  c42f8e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
697438-  c42f92:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
697439-  c42f96:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
697440-  c42f9b:	bf 20 01 00 00       	mov    edi,0x120
697441-  c42fa0:	e8 5b af ba 00       	call   17edf00 <_Znwm@plt>
--
700663-  c45d37:	5a                   	pop    rdx
700664-  c45d38:	c3                   	ret
700665-  c45d39:	cc                   	int3
700666-  c45d3a:	55                   	push   rbp
700667-  c45d3b:	41 57                	push   r15
700668-  c45d3d:	41 56                	push   r14
700669-  c45d3f:	41 55                	push   r13
700670-  c45d41:	41 54                	push   r12
700671-  c45d43:	53                   	push   rbx
700672-  c45d44:	48 81 ec 48 01 00 00 	sub    rsp,0x148
700673-  c45d4b:	48 89 cb             	mov    rbx,rcx
700674-  c45d4e:	49 89 d7             	mov    r15,rdx
700675-  c45d51:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
700676-  c45d56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
700677-  c45d5d:	00 00 
700678-  c45d5f:	48 89 84 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rax
700679-  c45d66:	00 
700680-  c45d67:	48 89 cf             	mov    rdi,rcx
700681:  c45d6a:	e8 05 d5 f1 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
700682-  c45d6f:	49 89 c5             	mov    r13,rax
700683-  c45d72:	48 89 df             	mov    rdi,rbx
700684-  c45d75:	e8 00 ba fc ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
700685-  c45d7a:	49 89 c4             	mov    r12,rax
700686-  c45d7d:	48 89 df             	mov    rdi,rbx
700687-  c45d80:	e8 73 09 00 00       	call   c466f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193698>
700688-  c45d85:	49 89 c6             	mov    r14,rax
700689-  c45d88:	49 8b 87 80 00 00 00 	mov    rax,QWORD PTR [r15+0x80]
700690-  c45d8f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
700691-  c45d94:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
700692-  c45d98:	4c 89 ef             	mov    rdi,r13
700693-  c45d9b:	ff 50 28             	call   QWORD PTR [rax+0x28]
700694-  c45d9e:	48 89 c3             	mov    rbx,rax
700695-  c45da1:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
700696-  c45da5:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
700697-  c45daa:	4d 8b 6f 68          	mov    r13,QWORD PTR [r15+0x68]
700698-  c45dae:	48 8d 35 0a 6e 72 ff 	lea    rsi,[rip+0xffffffffff726e0a]        # 36cbbf <_ZTSSt12bad_any_cast@@Base-0x23609>
700699-  c45db5:	48 8d 6c 24 60       	lea    rbp,[rsp+0x60]
700700-  c45dba:	48 89 ef             	mov    rdi,rbp
700701-  c45dbd:	e8 bc 3c e3 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
700702-  c45dc2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
700703-  c45dc6:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
700704-  c45dcb:	4c 89 ee             	mov    rsi,r13
700705-  c45dce:	48 89 ea             	mov    rdx,rbp
700706-  c45dd1:	ff 50 18             	call   QWORD PTR [rax+0x18]
700707-  c45dd4:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
700708-  c45dd8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
700709-  c45ddd:	49 8b 6f 30          	mov    rbp,QWORD PTR [r15+0x30]
700710-  c45de1:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
700711-  c45de5:	4c 89 e7             	mov    rdi,r12
--
716003-  c53699:	41 55                	push   r13
716004-  c5369b:	41 54                	push   r12
716005-  c5369d:	53                   	push   rbx
716006-  c5369e:	48 81 ec 88 00 00 00 	sub    rsp,0x88
716007-  c536a5:	49 89 cf             	mov    r15,rcx
716008-  c536a8:	48 89 d5             	mov    rbp,rdx
716009-  c536ab:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
716010-  c536af:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
716011-  c536b6:	00 00 
716012-  c536b8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
716013-  c536bf:	00 
716014-  c536c0:	48 89 cf             	mov    rdi,rcx
716015-  c536c3:	e8 82 01 00 00       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
716016-  c536c8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
716017-  c536cd:	4c 89 ff             	mov    rdi,r15
716018-  c536d0:	e8 f5 fb f0 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
716019-  c536d5:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
716020-  c536da:	4c 89 ff             	mov    rdi,r15
716021:  c536dd:	e8 92 fb f0 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
716022-  c536e2:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
716023-  c536e7:	4c 89 ff             	mov    rdi,r15
716024-  c536ea:	e8 61 e0 fb ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
716025-  c536ef:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
716026-  c536f4:	4c 89 ff             	mov    rdi,r15
716027-  c536f7:	e8 78 01 00 00       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
716028-  c536fc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
716029-  c53701:	4c 89 ff             	mov    rdi,r15
716030-  c53704:	e8 95 01 00 00       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
716031-  c53709:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
716032-  c5370e:	4c 89 ff             	mov    rdi,r15
716033-  c53711:	e8 8a fb f0 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
716034-  c53716:	49 89 c4             	mov    r12,rax
716035-  c53719:	48 8b 45 60          	mov    rax,QWORD PTR [rbp+0x60]
716036-  c5371d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
716037-  c53722:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
716038-  c53729:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
716039-  c5372e:	4c 8b 6d 40          	mov    r13,QWORD PTR [rbp+0x40]
716040-  c53732:	4c 8b b5 80 00 00 00 	mov    r14,QWORD PTR [rbp+0x80]
716041-  c53739:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
716042-  c5373d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
716043-  c53742:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
716044-  c53746:	48 8b 07             	mov    rax,QWORD PTR [rdi]
716045-  c53749:	ff 50 10             	call   QWORD PTR [rax+0x10]
716046-  c5374c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
716047-  c5374f:	48 89 c7             	mov    rdi,rax
716048-  c53752:	ff 51 28             	call   QWORD PTR [rcx+0x28]
716049-  c53755:	49 89 c7             	mov    r15,rax
716050-  c53758:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
716051-  c5375c:	4c 89 e7             	mov    rdi,r12
--
743024-  c6bd89:	cc                   	int3
743025-  c6bd8a:	48 8d 05 bd fe 75 ff 	lea    rax,[rip+0xffffffffff75febd]        # 3cbc4e <_ZTSN5boost9exceptionE@@Base+0x2c630>
743026-  c6bd91:	6a 01                	push   0x1
743027-  c6bd93:	5a                   	pop    rdx
743028-  c6bd94:	c3                   	ret
743029-  c6bd95:	cc                   	int3
743030-  c6bd96:	41 57                	push   r15
743031-  c6bd98:	41 56                	push   r14
743032-  c6bd9a:	41 55                	push   r13
743033-  c6bd9c:	41 54                	push   r12
743034-  c6bd9e:	53                   	push   rbx
743035-  c6bd9f:	48 83 ec 20          	sub    rsp,0x20
743036-  c6bda3:	49 89 d6             	mov    r14,rdx
743037-  c6bda6:	48 89 fb             	mov    rbx,rdi
743038-  c6bda9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
743039-  c6bdb0:	00 00 
743040-  c6bdb2:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
743041-  c6bdb7:	48 89 cf             	mov    rdi,rcx
743042:  c6bdba:	e8 b5 74 ef ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
743043-  c6bdbf:	49 89 c4             	mov    r12,rax
743044-  c6bdc2:	4d 8b be 38 01 00 00 	mov    r15,QWORD PTR [r14+0x138]
743045-  c6bdc9:	48 8b 00             	mov    rax,QWORD PTR [rax]
743046-  c6bdcc:	4c 89 e7             	mov    rdi,r12
743047-  c6bdcf:	ff 50 30             	call   QWORD PTR [rax+0x30]
743048-  c6bdd2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
743049-  c6bdd7:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
743050-  c6bddb:	4c 89 e7             	mov    rdi,r12
743051-  c6bdde:	ff 50 30             	call   QWORD PTR [rax+0x30]
743052-  c6bde1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
743053-  c6bde6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
743054-  c6bdea:	4c 89 e7             	mov    rdi,r12
743055-  c6bded:	ff 50 28             	call   QWORD PTR [rax+0x28]
743056-  c6bdf0:	49 89 c4             	mov    r12,rax
743057-  c6bdf3:	6a 40                	push   0x40
743058-  c6bdf5:	5f                   	pop    rdi
743059-  c6bdf6:	e8 05 21 b8 00       	call   17edf00 <_Znwm@plt>
743060-  c6bdfb:	49 89 c6             	mov    r14,rax
743061-  c6bdfe:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
743062-  c6be02:	48 8d 05 df 53 c0 00 	lea    rax,[rip+0xc053df]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
743063-  c6be09:	49 89 06             	mov    QWORD PTR [r14],rax
743064-  c6be0c:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
743065-  c6be11:	4d 8d 6e 10          	lea    r13,[r14+0x10]
743066-  c6be15:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
743067-  c6be1a:	6a 18                	push   0x18
743068-  c6be1c:	5f                   	pop    rdi
743069-  c6be1d:	e8 de 20 b8 00       	call   17edf00 <_Znwm@plt>
743070-  c6be22:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
743071-  c6be27:	48 89 08             	mov    QWORD PTR [rax],rcx
743072-  c6be2a:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]
--
766314-  c80534:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
766315-  c8053b:	00 
766316-  c8053c:	4c 89 fe             	mov    rsi,r15
766317-  c8053f:	4c 89 ea             	mov    rdx,r13
766318-  c80542:	ff 50 28             	call   QWORD PTR [rax+0x28]
766319-  c80545:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
766320-  c80549:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
766321-  c80550:	00 
766322-  c80551:	4c 89 e6             	mov    rsi,r12
766323-  c80554:	e8 25 95 df ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
766324-  c80559:	49 8b 07             	mov    rax,QWORD PTR [r15]
766325-  c8055c:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
766326-  c80563:	00 
766327-  c80564:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
766328-  c8056b:	00 
766329-  c8056c:	4c 89 fe             	mov    rsi,r15
766330-  c8056f:	ff 50 18             	call   QWORD PTR [rax+0x18]
766331-  c80572:	4c 89 f7             	mov    rdi,r14
766332:  c80575:	e8 fa 2c ee ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
766333-  c8057a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
766334-  c8057d:	48 89 c7             	mov    rdi,rax
766335-  c80580:	ff 51 28             	call   QWORD PTR [rcx+0x28]
766336-  c80583:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
766337-  c80588:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
766338-  c8058c:	48 8b 6b 30          	mov    rbp,QWORD PTR [rbx+0x30]
766339-  c80590:	4c 8b 6b 60          	mov    r13,QWORD PTR [rbx+0x60]
766340-  c80594:	bf d0 00 00 00       	mov    edi,0xd0
766341-  c80599:	e8 62 d9 b6 00       	call   17edf00 <_Znwm@plt>
766342-  c8059e:	48 89 c3             	mov    rbx,rax
766343-  c805a1:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
766344-  c805a5:	48 8d 05 2c b7 b9 00 	lea    rax,[rip+0xb9b72c]        # 181bcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11998>
766345-  c805ac:	48 89 03             	mov    QWORD PTR [rbx],rax
766346-  c805af:	48 8d 43 10          	lea    rax,[rbx+0x10]
766347-  c805b3:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
766348-  c805b8:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
766349-  c805bd:	48 8d 43 20          	lea    rax,[rbx+0x20]
766350-  c805c1:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
766351-  c805c6:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
766352-  c805cb:	48 8d 43 50          	lea    rax,[rbx+0x50]
766353-  c805cf:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
766354-  c805d4:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
766355-  c805d9:	48 8d 83 80 00 00 00 	lea    rax,[rbx+0x80]
766356-  c805e0:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
766357-  c805e5:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
766358-  c805ec:	00 
766359-  c805ed:	48 8d 83 b0 00 00 00 	lea    rax,[rbx+0xb0]
766360-  c805f4:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
766361-  c805f9:	48 89 d8             	mov    rax,rbx
766362-  c805fc:	48 05 b8 00 00 00    	add    rax,0xb8
--
896813-  cf7ac9:	5a                   	pop    rdx
896814-  cf7aca:	c3                   	ret
896815-  cf7acb:	cc                   	int3
896816-  cf7acc:	55                   	push   rbp
896817-  cf7acd:	41 57                	push   r15
896818-  cf7acf:	41 56                	push   r14
896819-  cf7ad1:	41 55                	push   r13
896820-  cf7ad3:	41 54                	push   r12
896821-  cf7ad5:	53                   	push   rbx
896822-  cf7ad6:	48 81 ec 98 00 00 00 	sub    rsp,0x98
896823-  cf7add:	49 89 cc             	mov    r12,rcx
896824-  cf7ae0:	48 89 d3             	mov    rbx,rdx
896825-  cf7ae3:	48 89 fd             	mov    rbp,rdi
896826-  cf7ae6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
896827-  cf7aed:	00 00 
896828-  cf7aef:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
896829-  cf7af6:	00 
896830-  cf7af7:	48 89 cf             	mov    rdi,rcx
896831:  cf7afa:	e8 75 b7 e6 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
896832-  cf7aff:	49 89 c7             	mov    r15,rax
896833-  cf7b02:	4c 89 e7             	mov    rdi,r12
896834-  cf7b05:	e8 02 9a e9 ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
896835-  cf7b0a:	49 89 c4             	mov    r12,rax
896836-  cf7b0d:	48 8b 73 38          	mov    rsi,QWORD PTR [rbx+0x38]
896837-  cf7b11:	48 8b 06             	mov    rax,QWORD PTR [rsi]
896838-  cf7b14:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
896839-  cf7b19:	ff 50 20             	call   QWORD PTR [rax+0x20]
896840-  cf7b1c:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
896841-  cf7b23:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
896842-  cf7b28:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
896843-  cf7b2c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
896844-  cf7b31:	4c 8b 73 30          	mov    r14,QWORD PTR [rbx+0x30]
896845-  cf7b35:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
896846-  cf7b39:	4c 89 e7             	mov    rdi,r12
896847-  cf7b3c:	ff 50 28             	call   QWORD PTR [rax+0x28]
896848-  cf7b3f:	49 89 c5             	mov    r13,rax
896849-  cf7b42:	48 8b 83 78 01 00 00 	mov    rax,QWORD PTR [rbx+0x178]
896850-  cf7b49:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
896851-  cf7b4e:	6a 50                	push   0x50
896852-  cf7b50:	5f                   	pop    rdi
896853-  cf7b51:	e8 aa 63 af 00       	call   17edf00 <_Znwm@plt>
896854-  cf7b56:	48 89 c3             	mov    rbx,rax
896855-  cf7b59:	66 0f 6f 44 24 40    	movdqa xmm0,XMMWORD PTR [rsp+0x40]
896856-  cf7b5f:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
896857-  cf7b64:	66 0f ef c0          	pxor   xmm0,xmm0
896858-  cf7b68:	66 0f 7f 44 24 40    	movdqa XMMWORD PTR [rsp+0x40],xmm0
896859-  cf7b6e:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
896860-  cf7b72:	48 8d 05 df 97 b2 00 	lea    rax,[rip+0xb297df]        # 1821358 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x17018>
896861-  cf7b79:	48 89 03             	mov    QWORD PTR [rbx],rax
--
914227-  d077dd:	41 54                	push   r12
914228-  d077df:	53                   	push   rbx
914229-  d077e0:	48 81 ec e8 04 00 00 	sub    rsp,0x4e8
914230-  d077e7:	49 89 cf             	mov    r15,rcx
914231-  d077ea:	49 89 d6             	mov    r14,rdx
914232-  d077ed:	48 89 bc 24 58 01 00 	mov    QWORD PTR [rsp+0x158],rdi
914233-  d077f4:	00 
914234-  d077f5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
914235-  d077fc:	00 00 
914236-  d077fe:	48 89 84 24 e0 04 00 	mov    QWORD PTR [rsp+0x4e0],rax
914237-  d07805:	00 
914238-  d07806:	48 89 cf             	mov    rdi,rcx
914239-  d07809:	e8 ea ee f3 ff       	call   c466f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193698>
914240-  d0780e:	48 89 c3             	mov    rbx,rax
914241-  d07811:	4c 89 ff             	mov    rdi,r15
914242-  d07814:	e8 7b 07 e8 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
914243-  d07819:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
914244-  d0781e:	4c 89 ff             	mov    rdi,r15
914245:  d07821:	e8 4e ba e5 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
914246-  d07826:	49 89 c7             	mov    r15,rax
914247-  d07829:	49 8b 6e 30          	mov    rbp,QWORD PTR [r14+0x30]
914248-  d0782d:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
914249-  d07831:	48 8b 06             	mov    rax,QWORD PTR [rsi]
914250-  d07834:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
914251-  d0783b:	00 
914252-  d0783c:	ff 50 28             	call   QWORD PTR [rax+0x28]
914253-  d0783f:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
914254-  d07846:	48 89 04 24          	mov    QWORD PTR [rsp],rax
914255-  d0784a:	49 8b 06             	mov    rax,QWORD PTR [r14]
914256-  d0784d:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
914257-  d07852:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
914258-  d07856:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
914259-  d0785b:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
914260-  d07862:	48 8b 07             	mov    rax,QWORD PTR [rdi]
914261-  d07865:	ff 50 10             	call   QWORD PTR [rax+0x10]
914262-  d07868:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
914263-  d0786d:	49 8b be 98 00 00 00 	mov    rdi,QWORD PTR [r14+0x98]
914264-  d07874:	48 8b 07             	mov    rax,QWORD PTR [rdi]
914265-  d07877:	ff 50 18             	call   QWORD PTR [rax+0x18]
914266-  d0787a:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
914267-  d0787f:	4d 8b 26             	mov    r12,QWORD PTR [r14]
914268-  d07882:	6a 30                	push   0x30
914269-  d07884:	5f                   	pop    rdi
914270-  d07885:	e8 76 66 ae 00       	call   17edf00 <_Znwm@plt>
914271-  d0788a:	49 89 c5             	mov    r13,rax
914272-  d0788d:	41 8a 84 24 30 03 00 	mov    al,BYTE PTR [r12+0x330]
914273-  d07894:	00 
914274-  d07895:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
914275-  d07899:	49 8b 86 88 00 00 00 	mov    rax,QWORD PTR [r14+0x88]
--
955794-  d2c68e:	55                   	push   rbp
955795-  d2c68f:	41 57                	push   r15
955796-  d2c691:	41 56                	push   r14
955797-  d2c693:	41 55                	push   r13
955798-  d2c695:	41 54                	push   r12
955799-  d2c697:	53                   	push   rbx
955800-  d2c698:	48 81 ec d8 01 00 00 	sub    rsp,0x1d8
955801-  d2c69f:	49 89 cf             	mov    r15,rcx
955802-  d2c6a2:	48 89 d3             	mov    rbx,rdx
955803-  d2c6a5:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
955804-  d2c6a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
955805-  d2c6b0:	00 00 
955806-  d2c6b2:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
955807-  d2c6b9:	00 
955808-  d2c6ba:	48 89 cf             	mov    rdi,rcx
955809-  d2c6bd:	e8 b8 50 ee ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
955810-  d2c6c2:	49 89 c6             	mov    r14,rax
955811-  d2c6c5:	4c 89 ff             	mov    rdi,r15
955812:  d2c6c8:	e8 a7 6b e3 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
955813-  d2c6cd:	49 89 c4             	mov    r12,rax
955814-  d2c6d0:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
955815-  d2c6d4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
955816-  d2c6d7:	ff 50 10             	call   QWORD PTR [rax+0x10]
955817-  d2c6da:	48 89 c5             	mov    rbp,rax
955818-  d2c6dd:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
955819-  d2c6e1:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
955820-  d2c6e8:	00 
955821-  d2c6e9:	48 8b 73 58          	mov    rsi,QWORD PTR [rbx+0x58]
955822-  d2c6ed:	48 8b 06             	mov    rax,QWORD PTR [rsi]
955823-  d2c6f0:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
955824-  d2c6f7:	00 
955825-  d2c6f8:	ff 50 28             	call   QWORD PTR [rax+0x28]
955826-  d2c6fb:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
955827-  d2c702:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
955828-  d2c707:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
955829-  d2c70b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
955830-  d2c710:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
955831-  d2c714:	48 8b 83 90 00 00 00 	mov    rax,QWORD PTR [rbx+0x90]
955832-  d2c71b:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
955833-  d2c722:	00 
955834-  d2c723:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
955835-  d2c727:	48 8d 35 08 54 60 ff 	lea    rsi,[rip+0xffffffffff605408]        # 331b36 <_ZTSSt12bad_any_cast@@Base-0x5e692>
955836-  d2c72e:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
955837-  d2c735:	00 
955838-  d2c736:	e8 43 d3 d4 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
955839-  d2c73b:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
955840-  d2c740:	49 8b 07             	mov    rax,QWORD PTR [r15]
955841-  d2c743:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
955842-  d2c74a:	00 
--
991742-  d4bff3:	e8 9c bf e3 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
991743-  d4bff8:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
991744-  d4bffd:	48 89 df             	mov    rdi,rbx
991745-  d4c000:	e8 45 78 f0 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
991746-  d4c005:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
991747-  d4c00a:	48 89 df             	mov    rdi,rbx
991748-  d4c00d:	e8 b8 72 e1 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
991749-  d4c012:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
991750-  d4c019:	00 
991751-  d4c01a:	48 89 df             	mov    rdi,rbx
991752-  d4c01d:	e8 40 9c ef ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
991753-  d4c022:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
991754-  d4c029:	00 
991755-  d4c02a:	48 89 df             	mov    rdi,rbx
991756-  d4c02d:	e8 5a 9c ef ff       	call   c45c8c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c2c>
991757-  d4c032:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
991758-  d4c039:	00 
991759-  d4c03a:	48 89 df             	mov    rdi,rbx
991760:  d4c03d:	e8 32 72 e1 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
991761-  d4c042:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
991762-  d4c049:	00 
991763-  d4c04a:	48 89 df             	mov    rdi,rbx
991764-  d4c04d:	e8 22 78 f0 ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
991765-  d4c052:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
991766-  d4c057:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
991767-  d4c05b:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
991768-  d4c05f:	6a 4c                	push   0x4c
991769-  d4c061:	5a                   	pop    rdx
991770-  d4c062:	e8 77 62 e1 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
991771-  d4c067:	48 8b 03             	mov    rax,QWORD PTR [rbx]
991772-  d4c06a:	4c 8b b0 60 02 00 00 	mov    r14,QWORD PTR [rax+0x260]
991773-  d4c071:	4d 85 f6             	test   r14,r14
991774-  d4c074:	0f 84 dd 03 00 00    	je     d4c457 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194dd>
991775-  d4c07a:	48 89 df             	mov    rdi,rbx
991776-  d4c07d:	e8 f8 56 ec ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
991777-  d4c082:	48 89 c3             	mov    rbx,rax
991778-  d4c085:	49 8b bd 98 00 00 00 	mov    rdi,QWORD PTR [r13+0x98]
991779-  d4c08c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
991780-  d4c08f:	ff 50 18             	call   QWORD PTR [rax+0x18]
991781-  d4c092:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
991782-  d4c099:	00 
991783-  d4c09a:	48 89 c6             	mov    rsi,rax
991784-  d4c09d:	e8 9e 1e aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
991785-  d4c0a2:	4d 8b 65 00          	mov    r12,QWORD PTR [r13+0x0]
991786-  d4c0a6:	49 8b 75 68          	mov    rsi,QWORD PTR [r13+0x68]
991787-  d4c0aa:	48 8b 06             	mov    rax,QWORD PTR [rsi]
991788-  d4c0ad:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
991789-  d4c0b4:	00 
991790-  d4c0b5:	ff 50 10             	call   QWORD PTR [rax+0x10]
--
1149507-  dda501:	41 54                	push   r12
1149508-  dda503:	53                   	push   rbx
1149509-  dda504:	48 81 ec 98 02 00 00 	sub    rsp,0x298
1149510-  dda50b:	49 89 cc             	mov    r12,rcx
1149511-  dda50e:	49 89 d6             	mov    r14,rdx
1149512-  dda511:	48 89 fd             	mov    rbp,rdi
1149513-  dda514:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1149514-  dda51b:	00 00 
1149515-  dda51d:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
1149516-  dda524:	00 
1149517-  dda525:	48 89 cf             	mov    rdi,rcx
1149518-  dda528:	e8 1d 93 e7 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
1149519-  dda52d:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
1149520-  dda532:	4c 89 e7             	mov    rdi,r12
1149521-  dda535:	e8 28 b7 e6 ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
1149522-  dda53a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
1149523-  dda541:	00 
1149524-  dda542:	4c 89 e7             	mov    rdi,r12
1149525:  dda545:	e8 2a 8d d8 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
1149526-  dda54a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1149527-  dda54f:	4c 89 e7             	mov    rdi,r12
1149528-  dda552:	e8 cf 71 e3 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1149529-  dda557:	48 89 c3             	mov    rbx,rax
1149530-  dda55a:	4c 89 e7             	mov    rdi,r12
1149531-  dda55d:	e8 3e 8d d8 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1149532-  dda562:	49 89 c7             	mov    r15,rax
1149533-  dda565:	4c 89 e7             	mov    rdi,r12
1149534-  dda568:	e8 e3 72 e3 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
1149535-  dda56d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1149536-  dda572:	4c 89 e7             	mov    rdi,r12
1149537-  dda575:	e8 1a da da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1149538-  dda57a:	49 89 c5             	mov    r13,rax
1149539-  dda57d:	4c 89 e7             	mov    rdi,r12
1149540-  dda580:	e8 cb 71 e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1149541-  dda585:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1149542-  dda58a:	4c 89 e7             	mov    rdi,r12
1149543-  dda58d:	e8 68 72 e3 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
1149544-  dda592:	49 89 c4             	mov    r12,rax
1149545-  dda595:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
1149546-  dda599:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
1149547-  dda59e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
1149548-  dda5a5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
1149549-  dda5aa:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
1149550-  dda5ae:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
1149551-  dda5b5:	00 
1149552-  dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
1149553-  dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1149554-  dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
1149555-  dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
--
1888207- 1080a1d:	41 55                	push   r13
1888208- 1080a1f:	41 54                	push   r12
1888209- 1080a21:	53                   	push   rbx
1888210- 1080a22:	48 81 ec 78 01 00 00 	sub    rsp,0x178
1888211- 1080a29:	49 89 cc             	mov    r12,rcx
1888212- 1080a2c:	48 89 d5             	mov    rbp,rdx
1888213- 1080a2f:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
1888214- 1080a34:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1888215- 1080a3b:	00 00 
1888216- 1080a3d:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
1888217- 1080a44:	00 
1888218- 1080a45:	48 8b 82 80 00 00 00 	mov    rax,QWORD PTR [rdx+0x80]
1888219- 1080a4c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1888220- 1080a51:	48 8b 42 40          	mov    rax,QWORD PTR [rdx+0x40]
1888221- 1080a55:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
1888222- 1080a5a:	48 8b 42 68          	mov    rax,QWORD PTR [rdx+0x68]
1888223- 1080a5e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1888224- 1080a63:	48 89 cf             	mov    rdi,rcx
1888225: 1080a66:	e8 09 28 ae ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
1888226- 1080a6b:	48 89 c3             	mov    rbx,rax
1888227- 1080a6e:	4c 89 e7             	mov    rdi,r12
1888228- 1080a71:	e8 da 0d b9 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
1888229- 1080a76:	49 89 c6             	mov    r14,rax
1888230- 1080a79:	4c 89 e7             	mov    rdi,r12
1888231- 1080a7c:	e8 a5 0c b9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1888232- 1080a81:	49 89 c7             	mov    r15,rax
1888233- 1080a84:	4c 89 e7             	mov    rdi,r12
1888234- 1080a87:	e8 14 28 ae ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1888235- 1080a8c:	49 89 c4             	mov    r12,rax
1888236- 1080a8f:	41 bd 10 01 00 00    	mov    r13d,0x110
1888237- 1080a95:	4c 03 6d 00          	add    r13,QWORD PTR [rbp+0x0]
1888238- 1080a99:	6a 28                	push   0x28
1888239- 1080a9b:	5f                   	pop    rdi
1888240- 1080a9c:	e8 5f d4 76 00       	call   17edf00 <_Znwm@plt>
1888241- 1080aa1:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
1888242- 1080aa5:	48 8d 0d 5c 91 7c 00 	lea    rcx,[rip+0x7c915c]        # 1849c08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x62f0>
1888243- 1080aac:	48 89 08             	mov    QWORD PTR [rax],rcx
1888244- 1080aaf:	48 8d 48 20          	lea    rcx,[rax+0x20]
1888245- 1080ab3:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
1888246- 1080ab8:	0f 57 c0             	xorps  xmm0,xmm0
1888247- 1080abb:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
1888248- 1080abf:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1888249- 1080ac4:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
1888250- 1080ac9:	49 8b 06             	mov    rax,QWORD PTR [r14]
1888251- 1080acc:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
1888252- 1080ad3:	00 
1888253- 1080ad4:	4c 89 f6             	mov    rsi,r14
1888254- 1080ad7:	ff 50 28             	call   QWORD PTR [rax+0x28]
1888255- 1080ada:	48 8b 03             	mov    rax,QWORD PTR [rbx]

## Direct callers of b632a0
452787-  b623ac:	55                   	push   rbp
452788-  b623ad:	41 57                	push   r15
452789-  b623af:	41 56                	push   r14
452790-  b623b1:	41 55                	push   r13
452791-  b623b3:	41 54                	push   r12
452792-  b623b5:	53                   	push   rbx
452793-  b623b6:	48 81 ec 88 01 00 00 	sub    rsp,0x188
452794-  b623bd:	49 89 ce             	mov    r14,rcx
452795-  b623c0:	48 89 d3             	mov    rbx,rdx
452796-  b623c3:	48 89 fd             	mov    rbp,rdi
452797-  b623c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
452798-  b623cd:	00 00 
452799-  b623cf:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
452800-  b623d6:	00 
452801-  b623d7:	48 89 cf             	mov    rdi,rcx
452802-  b623da:	e8 95 0e 00 00       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
452803-  b623df:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
452804-  b623e4:	4c 89 f7             	mov    rdi,r14
452805:  b623e7:	e8 b4 0e 00 00       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
452806-  b623ec:	49 89 c7             	mov    r15,rax
452807-  b623ef:	4c 89 f7             	mov    rdi,r14
452808-  b623f2:	e8 d3 0e 00 00       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
452809-  b623f7:	49 89 c6             	mov    r14,rax
452810-  b623fa:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
452811-  b62401:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
452812-  b62406:	4c 8b 63 68          	mov    r12,QWORD PTR [rbx+0x68]
452813-  b6240a:	48 8d 35 9c cb 7f ff 	lea    rsi,[rip+0xffffffffff7fcb9c]        # 35efad <_ZTSSt12bad_any_cast@@Base-0x3121b>
452814-  b62411:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
452815-  b62416:	4c 89 ef             	mov    rdi,r13
452816-  b62419:	e8 60 76 f1 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
452817-  b6241e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
452818-  b62422:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
452819-  b62429:	00 
452820-  b6242a:	4c 89 e6             	mov    rsi,r12
452821-  b6242d:	4c 89 ea             	mov    rdx,r13
452822-  b62430:	ff 50 18             	call   QWORD PTR [rax+0x18]
452823-  b62433:	49 8b 07             	mov    rax,QWORD PTR [r15]
452824-  b62436:	4c 89 ff             	mov    rdi,r15
452825-  b62439:	ff 50 28             	call   QWORD PTR [rax+0x28]
452826-  b6243c:	49 89 c7             	mov    r15,rax
452827-  b6243f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
452828-  b62443:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
452829-  b62448:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
452830-  b6244c:	49 8b 06             	mov    rax,QWORD PTR [r14]
452831-  b6244f:	4c 89 f7             	mov    rdi,r14
452832-  b62452:	ff 50 40             	call   QWORD PTR [rax+0x40]
452833-  b62455:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
452834-  b6245a:	6a 28                	push   0x28
452835-  b6245c:	5f                   	pop    rdi
--
629604-  c05b1f:	5a                   	pop    rdx
629605-  c05b20:	c3                   	ret
629606-  c05b21:	cc                   	int3
629607-  c05b22:	55                   	push   rbp
629608-  c05b23:	41 57                	push   r15
629609-  c05b25:	41 56                	push   r14
629610-  c05b27:	41 55                	push   r13
629611-  c05b29:	41 54                	push   r12
629612-  c05b2b:	53                   	push   rbx
629613-  c05b2c:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
629614-  c05b33:	49 89 ce             	mov    r14,rcx
629615-  c05b36:	49 89 d7             	mov    r15,rdx
629616-  c05b39:	48 89 fb             	mov    rbx,rdi
629617-  c05b3c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
629618-  c05b43:	00 00 
629619-  c05b45:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
629620-  c05b4c:	00 
629621-  c05b4d:	48 89 cf             	mov    rdi,rcx
629622:  c05b50:	e8 4b d7 f5 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
629623-  c05b55:	49 89 c4             	mov    r12,rax
629624-  c05b58:	4c 89 f7             	mov    rdi,r14
629625-  c05b5b:	e8 0e 01 00 00       	call   c05c6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152c0e>
629626-  c05b60:	49 89 c6             	mov    r14,rax
629627-  c05b63:	49 8b 87 38 01 00 00 	mov    rax,QWORD PTR [r15+0x138]
629628-  c05b6a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
629629-  c05b6f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
629630-  c05b73:	4c 89 e7             	mov    rdi,r12
629631-  c05b76:	ff 50 28             	call   QWORD PTR [rax+0x28]
629632-  c05b79:	49 89 c4             	mov    r12,rax
629633-  c05b7c:	49 8b 06             	mov    rax,QWORD PTR [r14]
629634-  c05b7f:	4c 89 f7             	mov    rdi,r14
629635-  c05b82:	ff 50 30             	call   QWORD PTR [rax+0x30]
629636-  c05b85:	49 89 c5             	mov    r13,rax
629637-  c05b88:	49 8b 06             	mov    rax,QWORD PTR [r14]
629638-  c05b8b:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
629639-  c05b90:	48 89 ef             	mov    rdi,rbp
629640-  c05b93:	4c 89 f6             	mov    rsi,r14
629641-  c05b96:	ff 50 28             	call   QWORD PTR [rax+0x28]
629642-  c05b99:	6a 40                	push   0x40
629643-  c05b9b:	5f                   	pop    rdi
629644-  c05b9c:	e8 5f 83 be 00       	call   17edf00 <_Znwm@plt>
629645-  c05ba1:	49 89 c6             	mov    r14,rax
629646-  c05ba4:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
629647-  c05ba8:	48 8d 05 39 b6 c6 00 	lea    rax,[rip+0xc6b639]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
629648-  c05baf:	49 89 06             	mov    QWORD PTR [r14],rax
629649-  c05bb2:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
629650-  c05bb7:	4d 8d 7e 10          	lea    r15,[r14+0x10]
629651-  c05bbb:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
629652-  c05bc0:	6a 18                	push   0x18
--
641870-  c10d72:	4c 89 f7             	mov    rdi,r14
641871-  c10d75:	e8 ac 09 00 00       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
641872-  c10d7a:	48 89 c5             	mov    rbp,rax
641873-  c10d7d:	49 8b 5c 24 40       	mov    rbx,QWORD PTR [r12+0x40]
641874-  c10d82:	49 8b 74 24 58       	mov    rsi,QWORD PTR [r12+0x58]
641875-  c10d87:	48 8b 06             	mov    rax,QWORD PTR [rsi]
641876-  c10d8a:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
641877-  c10d91:	00 
641878-  c10d92:	ff 50 28             	call   QWORD PTR [rax+0x28]
641879-  c10d95:	49 8b 44 24 60       	mov    rax,QWORD PTR [r12+0x60]
641880-  c10d9a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
641881-  c10d9f:	4c 89 f7             	mov    rdi,r14
641882-  c10da2:	e8 a9 09 00 00       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
641883-  c10da7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
641884-  c10dac:	4c 89 f7             	mov    rdi,r14
641885-  c10daf:	e8 c6 09 00 00       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
641886-  c10db4:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
641887-  c10db9:	4c 89 f7             	mov    rdi,r14
641888:  c10dbc:	e8 df 24 f5 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
641889-  c10dc1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
641890-  c10dc6:	4c 89 f7             	mov    rdi,r14
641891-  c10dc9:	e8 d6 09 00 00       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
641892-  c10dce:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
641893-  c10dd3:	4c 89 f7             	mov    rdi,r14
641894-  c10dd6:	e8 f3 09 00 00       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
641895-  c10ddb:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
641896-  c10de0:	4c 89 f7             	mov    rdi,r14
641897-  c10de3:	e8 12 0a 00 00       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
641898-  c10de8:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
641899-  c10def:	00 
641900-  c10df0:	4c 89 f7             	mov    rdi,r14
641901-  c10df3:	e8 2c 0a 00 00       	call   c11824 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7c4>
641902-  c10df8:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
641903-  c10dfd:	4c 89 f7             	mov    rdi,r14
641904-  c10e00:	e8 4b 0a 00 00       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
641905-  c10e05:	49 89 c5             	mov    r13,rax
641906-  c10e08:	4c 89 f7             	mov    rdi,r14
641907-  c10e0b:	e8 6a 0a 00 00       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
641908-  c10e10:	49 89 c7             	mov    r15,rax
641909-  c10e13:	4c 89 f7             	mov    rdi,r14
641910-  c10e16:	e8 89 0a 00 00       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
641911-  c10e1b:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
641912-  c10e22:	00 
641913-  c10e23:	6a 60                	push   0x60
641914-  c10e25:	5f                   	pop    rdi
641915-  c10e26:	e8 d5 d0 bd 00       	call   17edf00 <_Znwm@plt>
641916-  c10e2b:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
641917-  c10e2f:	48 8d 0d 22 4d c0 00 	lea    rcx,[rip+0xc04d22]        # 1815b58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xb818>
641918-  c10e36:	48 89 08             	mov    QWORD PTR [rax],rcx
--
672344-  c2c562:	ff 50 28             	call   QWORD PTR [rax+0x28]
672345-  c2c565:	66 41 c7 46 18 01 01 	mov    WORD PTR [r14+0x18],0x101
672346-  c2c56c:	31 c0                	xor    eax,eax
672347-  c2c56e:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
672348-  c2c572:	41 88 46 38          	mov    BYTE PTR [r14+0x38],al
672349-  c2c576:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
672350-  c2c57b:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
672351-  c2c580:	4d 8b 6c 24 60       	mov    r13,QWORD PTR [r12+0x60]
672352-  c2c585:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
672353-  c2c58c:	00 
672354-  c2c58d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
672355-  c2c592:	49 8b 44 24 68       	mov    rax,QWORD PTR [r12+0x68]
672356-  c2c597:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
672357-  c2c59c:	48 89 df             	mov    rdi,rbx
672358-  c2c59f:	e8 f0 b9 f5 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
672359-  c2c5a4:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
672360-  c2c5ab:	00 
672361-  c2c5ac:	48 89 df             	mov    rdi,rbx
672362:  c2c5af:	e8 ec 6c f3 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
672363-  c2c5b4:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
672364-  c2c5b9:	48 89 df             	mov    rdi,rbx
672365-  c2c5bc:	e8 b9 52 fe ff       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
672366-  c2c5c1:	49 89 c7             	mov    r15,rax
672367-  c2c5c4:	48 89 df             	mov    rdi,rbx
672368-  c2c5c7:	e8 84 51 fe ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
672369-  c2c5cc:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
672370-  c2c5d1:	48 89 df             	mov    rdi,rbx
672371-  c2c5d4:	e8 77 52 fe ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
672372-  c2c5d9:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
672373-  c2c5e0:	00 
672374-  c2c5e1:	48 89 df             	mov    rdi,rbx
672375-  c2c5e4:	e8 bb 52 fe ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
672376-  c2c5e9:	48 89 c5             	mov    rbp,rax
672377-  c2c5ec:	4d 8b 74 24 30       	mov    r14,QWORD PTR [r12+0x30]
672378-  c2c5f1:	bf f0 00 00 00       	mov    edi,0xf0
672379-  c2c5f6:	e8 05 19 bc 00       	call   17edf00 <_Znwm@plt>
672380-  c2c5fb:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
672381-  c2c5ff:	48 8d 0d 62 aa be 00 	lea    rcx,[rip+0xbeaa62]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>
672382-  c2c606:	48 89 08             	mov    QWORD PTR [rax],rcx
672383-  c2c609:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
672384-  c2c60e:	48 83 60 60 00       	and    QWORD PTR [rax+0x60],0x0
672385-  c2c613:	48 8d 48 10          	lea    rcx,[rax+0x10]
672386-  c2c617:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
672387-  c2c61c:	48 83 60 70 00       	and    QWORD PTR [rax+0x70],0x0
672388-  c2c621:	48 8d 48 18          	lea    rcx,[rax+0x18]
672389-  c2c625:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
672390-  c2c62a:	48 83 a0 a0 00 00 00 	and    QWORD PTR [rax+0xa0],0x0
672391-  c2c631:	00 
672392-  c2c632:	48 8d 48 30          	lea    rcx,[rax+0x30]
--
700325-  c458cd:	6a 05                	push   0x5
700326-  c458cf:	5a                   	pop    rdx
700327-  c458d0:	c3                   	ret
700328-  c458d1:	cc                   	int3
700329-  c458d2:	55                   	push   rbp
700330-  c458d3:	41 57                	push   r15
700331-  c458d5:	41 56                	push   r14
700332-  c458d7:	41 55                	push   r13
700333-  c458d9:	41 54                	push   r12
700334-  c458db:	53                   	push   rbx
700335-  c458dc:	48 83 ec 28          	sub    rsp,0x28
700336-  c458e0:	49 89 cf             	mov    r15,rcx
700337-  c458e3:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
700338-  c458e8:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
700339-  c458ed:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
700340-  c458f4:	00 00 
700341-  c458f6:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
700342-  c458fb:	48 89 cf             	mov    rdi,rcx
700343:  c458fe:	e8 9d d9 f1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
700344-  c45903:	49 89 c5             	mov    r13,rax
700345-  c45906:	4c 89 ff             	mov    rdi,r15
700346-  c45909:	e8 86 26 f4 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
700347-  c4590e:	49 89 c6             	mov    r14,rax
700348-  c45911:	4c 89 ff             	mov    rdi,r15
700349-  c45914:	e8 8b be fc ff       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
700350-  c45919:	48 89 c3             	mov    rbx,rax
700351-  c4591c:	4c 89 ff             	mov    rdi,r15
700352-  c4591f:	e8 56 be fc ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
700353-  c45924:	48 89 c5             	mov    rbp,rax
700354-  c45927:	4c 89 ff             	mov    rdi,r15
700355-  c4592a:	e8 21 be fc ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
700356-  c4592f:	49 89 c4             	mov    r12,rax
700357-  c45932:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
700358-  c45937:	48 8b 80 38 01 00 00 	mov    rax,QWORD PTR [rax+0x138]
700359-  c4593e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
700360-  c45943:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
700361-  c45947:	4c 89 ef             	mov    rdi,r13
700362-  c4594a:	ff 50 28             	call   QWORD PTR [rax+0x28]
700363-  c4594d:	49 89 c7             	mov    r15,rax
700364-  c45950:	49 8b 06             	mov    rax,QWORD PTR [r14]
700365-  c45953:	4c 89 f7             	mov    rdi,r14
700366-  c45956:	ff 50 30             	call   QWORD PTR [rax+0x30]
700367-  c45959:	49 89 c5             	mov    r13,rax
700368-  c4595c:	49 8b 06             	mov    rax,QWORD PTR [r14]
700369-  c4595f:	4c 89 f7             	mov    rdi,r14
700370-  c45962:	ff 50 28             	call   QWORD PTR [rax+0x28]
700371-  c45965:	49 89 c6             	mov    r14,rax
700372-  c45968:	48 8b 03             	mov    rax,QWORD PTR [rbx]
700373-  c4596b:	48 89 df             	mov    rdi,rbx
--
716015-  c536c3:	e8 82 01 00 00       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
716016-  c536c8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
716017-  c536cd:	4c 89 ff             	mov    rdi,r15
716018-  c536d0:	e8 f5 fb f0 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
716019-  c536d5:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
716020-  c536da:	4c 89 ff             	mov    rdi,r15
716021-  c536dd:	e8 92 fb f0 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
716022-  c536e2:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
716023-  c536e7:	4c 89 ff             	mov    rdi,r15
716024-  c536ea:	e8 61 e0 fb ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
716025-  c536ef:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
716026-  c536f4:	4c 89 ff             	mov    rdi,r15
716027-  c536f7:	e8 78 01 00 00       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
716028-  c536fc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
716029-  c53701:	4c 89 ff             	mov    rdi,r15
716030-  c53704:	e8 95 01 00 00       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
716031-  c53709:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
716032-  c5370e:	4c 89 ff             	mov    rdi,r15
716033:  c53711:	e8 8a fb f0 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
716034-  c53716:	49 89 c4             	mov    r12,rax
716035-  c53719:	48 8b 45 60          	mov    rax,QWORD PTR [rbp+0x60]
716036-  c5371d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
716037-  c53722:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
716038-  c53729:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
716039-  c5372e:	4c 8b 6d 40          	mov    r13,QWORD PTR [rbp+0x40]
716040-  c53732:	4c 8b b5 80 00 00 00 	mov    r14,QWORD PTR [rbp+0x80]
716041-  c53739:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
716042-  c5373d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
716043-  c53742:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
716044-  c53746:	48 8b 07             	mov    rax,QWORD PTR [rdi]
716045-  c53749:	ff 50 10             	call   QWORD PTR [rax+0x10]
716046-  c5374c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
716047-  c5374f:	48 89 c7             	mov    rdi,rax
716048-  c53752:	ff 51 28             	call   QWORD PTR [rcx+0x28]
716049-  c53755:	49 89 c7             	mov    r15,rax
716050-  c53758:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
716051-  c5375c:	4c 89 e7             	mov    rdi,r12
716052-  c5375f:	ff 50 28             	call   QWORD PTR [rax+0x28]
716053-  c53762:	48 8b 08             	mov    rcx,QWORD PTR [rax]
716054-  c53765:	48 89 c7             	mov    rdi,rax
716055-  c53768:	ff 51 50             	call   QWORD PTR [rcx+0x50]
716056-  c5376b:	49 89 c4             	mov    r12,rax
716057-  c5376e:	48 8b 5d 30          	mov    rbx,QWORD PTR [rbp+0x30]
716058-  c53772:	6a 48                	push   0x48
716059-  c53774:	5f                   	pop    rdi
716060-  c53775:	e8 86 a7 b9 00       	call   17edf00 <_Znwm@plt>
716061-  c5377a:	48 89 c5             	mov    rbp,rax
716062-  c5377d:	48 8d 05 cc 1b bd 00 	lea    rax,[rip+0xbd1bcc]        # 1825350 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1980>
716063-  c53784:	4c 8d 54 24 50       	lea    r10,[rsp+0x50]
--
775674-  c88e2b:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
775675-  c88e32:	00 
775676-  c88e33:	48 8b 72 58          	mov    rsi,QWORD PTR [rdx+0x58]
775677-  c88e37:	48 8b 06             	mov    rax,QWORD PTR [rsi]
775678-  c88e3a:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
775679-  c88e3f:	ff 50 28             	call   QWORD PTR [rax+0x28]
775680-  c88e42:	49 8b 87 80 00 00 00 	mov    rax,QWORD PTR [r15+0x80]
775681-  c88e49:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
775682-  c88e4e:	4c 89 ef             	mov    rdi,r13
775683-  c88e51:	e8 d0 88 f8 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
775684-  c88e56:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
775685-  c88e5b:	4c 89 ef             	mov    rdi,r13
775686-  c88e5e:	e8 41 8a f8 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
775687-  c88e63:	48 89 c3             	mov    rbx,rax
775688-  c88e66:	4c 89 ef             	mov    rdi,r13
775689-  c88e69:	e8 e2 89 f8 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
775690-  c88e6e:	48 89 c5             	mov    rbp,rax
775691-  c88e71:	4c 89 ef             	mov    rdi,r13
775692:  c88e74:	e8 27 a4 ed ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
775693-  c88e79:	49 89 c5             	mov    r13,rax
775694-  c88e7c:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
775695-  c88e80:	6a 28                	push   0x28
775696-  c88e82:	5f                   	pop    rdi
775697-  c88e83:	e8 78 50 b6 00       	call   17edf00 <_Znwm@plt>
775698-  c88e88:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
775699-  c88e8d:	4c 89 6c 24 50       	mov    QWORD PTR [rsp+0x50],r13
775700-  c88e92:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
775701-  c88e97:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
775702-  c88e9b:	48 8d 0d 4e 3a b9 00 	lea    rcx,[rip+0xb93a4e]        # 181c8f0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x125b0>
775703-  c88ea2:	48 89 08             	mov    QWORD PTR [rax],rcx
775704-  c88ea5:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
775705-  c88eaa:	48 8d 48 10          	lea    rcx,[rax+0x10]
775706-  c88eae:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
775707-  c88eb3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
775708-  c88eb8:	48 89 c7             	mov    rdi,rax
775709-  c88ebb:	48 83 c7 18          	add    rdi,0x18
775710-  c88ebf:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
775711-  c88ec4:	e8 61 c8 ed ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
775712-  c88ec9:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
775713-  c88ecc:	48 8d 35 1d 39 74 ff 	lea    rsi,[rip+0xffffffffff74391d]        # 3cc7f0 <_ZTSN5boost9exceptionE@@Base+0x2d1d2>
775714-  c88ed3:	48 8d 0d 36 39 74 ff 	lea    rcx,[rip+0xffffffffff743936]        # 3cc810 <_ZTSN5boost9exceptionE@@Base+0x2d1f2>
775715-  c88eda:	6a 1b                	push   0x1b
775716-  c88edc:	41 5f                	pop    r15
775717-  c88ede:	6a 1c                	push   0x1c
775718-  c88ee0:	41 58                	pop    r8
775719-  c88ee2:	4c 89 fa             	mov    rdx,r15
775720-  c88ee5:	45 31 c9             	xor    r9d,r9d
775721-  c88ee8:	e8 71 e6 95 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
775722-  c88eed:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
--
783907-  c90469:	5a                   	pop    rdx
783908-  c9046a:	c3                   	ret
783909-  c9046b:	cc                   	int3
783910-  c9046c:	48 8d 05 06 c4 73 ff 	lea    rax,[rip+0xffffffffff73c406]        # 3cc879 <_ZTSN5boost9exceptionE@@Base+0x2d25b>
783911-  c90473:	6a 01                	push   0x1
783912-  c90475:	5a                   	pop    rdx
783913-  c90476:	c3                   	ret
783914-  c90477:	cc                   	int3
783915-  c90478:	55                   	push   rbp
783916-  c90479:	41 57                	push   r15
783917-  c9047b:	41 56                	push   r14
783918-  c9047d:	41 55                	push   r13
783919-  c9047f:	41 54                	push   r12
783920-  c90481:	53                   	push   rbx
783921-  c90482:	50                   	push   rax
783922-  c90483:	49 89 d6             	mov    r14,rdx
783923-  c90486:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
783924-  c9048a:	48 89 cf             	mov    rdi,rcx
783925:  c9048d:	e8 0e 2e ed ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
783926-  c90492:	49 89 c7             	mov    r15,rax
783927-  c90495:	4d 8b 6e 30          	mov    r13,QWORD PTR [r14+0x30]
783928-  c90499:	49 8b 9e 38 01 00 00 	mov    rbx,QWORD PTR [r14+0x138]
783929-  c904a0:	6a 28                	push   0x28
783930-  c904a2:	5f                   	pop    rdi
783931-  c904a3:	e8 58 da b5 00       	call   17edf00 <_Znwm@plt>
783932-  c904a8:	49 89 c6             	mov    r14,rax
783933-  c904ab:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
783934-  c904af:	48 8d 05 f2 ca b8 00 	lea    rax,[rip+0xb8caf2]        # 181cfa8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12c68>
783935-  c904b6:	49 89 06             	mov    QWORD PTR [r14],rax
783936-  c904b9:	49 89 5e 10          	mov    QWORD PTR [r14+0x10],rbx
783937-  c904bd:	0f 57 c0             	xorps  xmm0,xmm0
783938-  c904c0:	41 0f 11 46 18       	movups XMMWORD PTR [r14+0x18],xmm0
783939-  c904c5:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
783940-  c904c9:	4c 8d 25 b0 c3 73 ff 	lea    r12,[rip+0xffffffffff73c3b0]        # 3cc880 <_ZTSN5boost9exceptionE@@Base+0x2d262>
783941-  c904d0:	48 8d 0d c9 c3 73 ff 	lea    rcx,[rip+0xffffffffff73c3c9]        # 3cc8a0 <_ZTSN5boost9exceptionE@@Base+0x2d282>
783942-  c904d7:	6a 1f                	push   0x1f
783943-  c904d9:	5d                   	pop    rbp
783944-  c904da:	6a 2c                	push   0x2c
783945-  c904dc:	5b                   	pop    rbx
783946-  c904dd:	4c 89 e6             	mov    rsi,r12
783947-  c904e0:	48 89 ea             	mov    rdx,rbp
783948-  c904e3:	49 89 d8             	mov    r8,rbx
783949-  c904e6:	45 31 c9             	xor    r9d,r9d
783950-  c904e9:	e8 70 70 95 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
783951-  c904ee:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
783952-  c904f2:	4c 89 e6             	mov    rsi,r12
783953-  c904f5:	48 89 ea             	mov    rdx,rbp
783954-  c904f8:	48 8d 0d a1 c3 73 ff 	lea    rcx,[rip+0xffffffffff73c3a1]        # 3cc8a0 <_ZTSN5boost9exceptionE@@Base+0x2d282>
783955-  c904ff:	49 89 d8             	mov    r8,rbx
--
786368-  c92758:	48 8d 05 34 38 6d ff 	lea    rax,[rip+0xffffffffff6d3834]        # 365f93 <_ZTSSt12bad_any_cast@@Base-0x2a235>
786369-  c9275f:	6a 18                	push   0x18
786370-  c92761:	5a                   	pop    rdx
786371-  c92762:	c3                   	ret
786372-  c92763:	cc                   	int3
786373-  c92764:	48 8d 05 6d a1 73 ff 	lea    rax,[rip+0xffffffffff73a16d]        # 3cc8d8 <_ZTSN5boost9exceptionE@@Base+0x2d2ba>
786374-  c9276b:	6a 01                	push   0x1
786375-  c9276d:	5a                   	pop    rdx
786376-  c9276e:	c3                   	ret
786377-  c9276f:	cc                   	int3
786378-  c92770:	41 57                	push   r15
786379-  c92772:	41 56                	push   r14
786380-  c92774:	41 55                	push   r13
786381-  c92776:	41 54                	push   r12
786382-  c92778:	53                   	push   rbx
786383-  c92779:	49 89 d6             	mov    r14,rdx
786384-  c9277c:	48 89 fb             	mov    rbx,rdi
786385-  c9277f:	48 89 cf             	mov    rdi,rcx
786386:  c92782:	e8 19 0b ed ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
786387-  c92787:	49 89 c7             	mov    r15,rax
786388-  c9278a:	4d 8b b6 38 01 00 00 	mov    r14,QWORD PTR [r14+0x138]
786389-  c92791:	48 8b 00             	mov    rax,QWORD PTR [rax]
786390-  c92794:	4c 89 ff             	mov    rdi,r15
786391-  c92797:	ff 50 50             	call   QWORD PTR [rax+0x50]
786392-  c9279a:	49 89 c4             	mov    r12,rax
786393-  c9279d:	49 8b 07             	mov    rax,QWORD PTR [r15]
786394-  c927a0:	4c 89 ff             	mov    rdi,r15
786395-  c927a3:	ff 50 28             	call   QWORD PTR [rax+0x28]
786396-  c927a6:	49 89 c5             	mov    r13,rax
786397-  c927a9:	6a 40                	push   0x40
786398-  c927ab:	5f                   	pop    rdi
786399-  c927ac:	e8 4f b7 b5 00       	call   17edf00 <_Znwm@plt>
786400-  c927b1:	49 89 c7             	mov    r15,rax
786401-  c927b4:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
786402-  c927b8:	48 8d 05 29 ea bd 00 	lea    rax,[rip+0xbdea29]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
786403-  c927bf:	49 89 07             	mov    QWORD PTR [r15],rax
786404-  c927c2:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
786405-  c927c6:	4d 89 6f 18          	mov    QWORD PTR [r15+0x18],r13
786406-  c927ca:	48 8d 05 73 b4 e4 ff 	lea    rax,[rip+0xffffffffffe4b473]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
786407-  c927d1:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
786408-  c927d5:	48 8d 05 42 00 00 00 	lea    rax,[rip+0x42]        # c9281e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1df7be>
786409-  c927dc:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
786410-  c927e0:	0f 57 c0             	xorps  xmm0,xmm0
786411-  c927e3:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
786412-  c927e8:	4c 89 ff             	mov    rdi,r15
786413-  c927eb:	4c 89 f6             	mov    rsi,r14
786414-  c927ee:	e8 51 c4 e3 ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
786415-  c927f3:	4c 89 3b             	mov    QWORD PTR [rbx],r15
786416-  c927f6:	48 89 d8             	mov    rax,rbx
--
789483-  c956ae:	48 8d 05 44 09 6b ff 	lea    rax,[rip+0xffffffffff6b0944]        # 345ff9 <_ZTSSt12bad_any_cast@@Base-0x4a1cf>
789484-  c956b5:	6a 16                	push   0x16
789485-  c956b7:	5a                   	pop    rdx
789486-  c956b8:	c3                   	ret
789487-  c956b9:	cc                   	int3
789488-  c956ba:	48 8d 05 70 75 73 ff 	lea    rax,[rip+0xffffffffff737570]        # 3ccc31 <_ZTSN5boost9exceptionE@@Base+0x2d613>
789489-  c956c1:	6a 01                	push   0x1
789490-  c956c3:	5a                   	pop    rdx
789491-  c956c4:	c3                   	ret
789492-  c956c5:	cc                   	int3
789493-  c956c6:	41 57                	push   r15
789494-  c956c8:	41 56                	push   r14
789495-  c956ca:	41 54                	push   r12
789496-  c956cc:	53                   	push   rbx
789497-  c956cd:	50                   	push   rax
789498-  c956ce:	49 89 d6             	mov    r14,rdx
789499-  c956d1:	48 89 fb             	mov    rbx,rdi
789500-  c956d4:	48 89 cf             	mov    rdi,rcx
789501:  c956d7:	e8 c4 db ec ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
789502-  c956dc:	4d 8b be 38 01 00 00 	mov    r15,QWORD PTR [r14+0x138]
789503-  c956e3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
789504-  c956e6:	48 89 c7             	mov    rdi,rax
789505-  c956e9:	ff 51 28             	call   QWORD PTR [rcx+0x28]
789506-  c956ec:	49 89 c4             	mov    r12,rax
789507-  c956ef:	6a 40                	push   0x40
789508-  c956f1:	5f                   	pop    rdi
789509-  c956f2:	e8 09 88 b5 00       	call   17edf00 <_Znwm@plt>
789510-  c956f7:	49 89 c6             	mov    r14,rax
789511-  c956fa:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
789512-  c956fe:	48 8d 05 e3 ba bd 00 	lea    rax,[rip+0xbdbae3]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
789513-  c95705:	49 89 06             	mov    QWORD PTR [r14],rax
789514-  c95708:	4d 89 66 10          	mov    QWORD PTR [r14+0x10],r12
789515-  c9570c:	48 8d 05 51 6d de ff 	lea    rax,[rip+0xffffffffffde6d51]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
789516-  c95713:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
789517-  c95717:	48 8d 05 44 00 00 00 	lea    rax,[rip+0x44]        # c95762 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e2702>
789518-  c9571e:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
789519-  c95722:	0f 57 c0             	xorps  xmm0,xmm0
789520-  c95725:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
789521-  c9572a:	4c 89 f7             	mov    rdi,r14
789522-  c9572d:	4c 89 fe             	mov    rsi,r15
789523-  c95730:	e8 0f 95 e3 ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
789524-  c95735:	4c 89 33             	mov    QWORD PTR [rbx],r14
789525-  c95738:	48 89 d8             	mov    rax,rbx
789526-  c9573b:	48 83 c4 08          	add    rsp,0x8
789527-  c9573f:	5b                   	pop    rbx
789528-  c95740:	41 5c                	pop    r12
789529-  c95742:	41 5e                	pop    r14
789530-  c95744:	41 5f                	pop    r15
789531-  c95746:	c3                   	ret
--
814901-  cab823:	cc                   	int3
814902-  cab824:	55                   	push   rbp
814903-  cab825:	41 57                	push   r15
814904-  cab827:	41 56                	push   r14
814905-  cab829:	41 55                	push   r13
814906-  cab82b:	41 54                	push   r12
814907-  cab82d:	53                   	push   rbx
814908-  cab82e:	48 81 ec 38 01 00 00 	sub    rsp,0x138
814909-  cab835:	48 89 cb             	mov    rbx,rcx
814910-  cab838:	49 89 d7             	mov    r15,rdx
814911-  cab83b:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
814912-  cab840:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
814913-  cab847:	00 00 
814914-  cab849:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
814915-  cab850:	00 
814916-  cab851:	48 89 cf             	mov    rdi,rcx
814917-  cab854:	e8 f7 5f f6 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
814918-  cab859:	48 89 df             	mov    rdi,rbx
814919:  cab85c:	e8 3f 7a eb ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
814920-  cab861:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
814921-  cab866:	48 89 df             	mov    rdi,rbx
814922-  cab869:	e8 36 60 f6 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
814923-  cab86e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
814924-  cab873:	49 8b 77 68          	mov    rsi,QWORD PTR [r15+0x68]
814925-  cab877:	48 8b 06             	mov    rax,QWORD PTR [rsi]
814926-  cab87a:	48 8d 5c 24 60       	lea    rbx,[rsp+0x60]
814927-  cab87f:	48 89 df             	mov    rdi,rbx
814928-  cab882:	ff 50 10             	call   QWORD PTR [rax+0x10]
814929-  cab885:	48 8b 03             	mov    rax,QWORD PTR [rbx]
814930-  cab888:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
814931-  cab88d:	4d 8b 77 30          	mov    r14,QWORD PTR [r15+0x30]
814932-  cab891:	49 8b 87 80 00 00 00 	mov    rax,QWORD PTR [r15+0x80]
814933-  cab898:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
814934-  cab89d:	6a 38                	push   0x38
814935-  cab89f:	5f                   	pop    rdi
814936-  cab8a0:	e8 5b 26 b4 00       	call   17edf00 <_Znwm@plt>
814937-  cab8a5:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
814938-  cab8a9:	48 8d 0d 28 2b b7 00 	lea    rcx,[rip+0xb72b28]        # 181e3d8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14098>
814939-  cab8b0:	48 89 08             	mov    QWORD PTR [rax],rcx
814940-  cab8b3:	48 8d 48 10          	lea    rcx,[rax+0x10]
814941-  cab8b7:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
814942-  cab8bc:	48 8d 48 28          	lea    rcx,[rax+0x28]
814943-  cab8c0:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
814944-  cab8c5:	48 89 c1             	mov    rcx,rax
814945-  cab8c8:	48 83 c1 30          	add    rcx,0x30
814946-  cab8cc:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
814947-  cab8d1:	66 0f 57 c0          	xorpd  xmm0,xmm0
814948-  cab8d5:	66 0f 11 40 10       	movupd XMMWORD PTR [rax+0x10],xmm0
814949-  cab8da:	66 0f 11 40 20       	movupd XMMWORD PTR [rax+0x20],xmm0
--
815570-  cac23e:	48 8d 05 d1 0d 72 ff 	lea    rax,[rip+0xffffffffff720dd1]        # 3cd016 <_ZTSN5boost9exceptionE@@Base+0x2d9f8>
815571-  cac245:	6a 02                	push   0x2
815572-  cac247:	5a                   	pop    rdx
815573-  cac248:	c3                   	ret
815574-  cac249:	cc                   	int3
815575-  cac24a:	41 57                	push   r15
815576-  cac24c:	41 56                	push   r14
815577-  cac24e:	41 55                	push   r13
815578-  cac250:	41 54                	push   r12
815579-  cac252:	53                   	push   rbx
815580-  cac253:	48 83 ec 10          	sub    rsp,0x10
815581-  cac257:	49 89 ce             	mov    r14,rcx
815582-  cac25a:	49 89 d7             	mov    r15,rdx
815583-  cac25d:	48 89 fb             	mov    rbx,rdi
815584-  cac260:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
815585-  cac267:	00 00 
815586-  cac269:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
815587-  cac26e:	48 89 cf             	mov    rdi,rcx
815588:  cac271:	e8 2a 70 eb ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
815589-  cac276:	49 89 c4             	mov    r12,rax
815590-  cac279:	4c 89 f7             	mov    rdi,r14
815591-  cac27c:	e8 f9 55 f6 ff       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
815592-  cac281:	49 89 c5             	mov    r13,rax
815593-  cac284:	4d 8b b7 38 01 00 00 	mov    r14,QWORD PTR [r15+0x138]
815594-  cac28b:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
815595-  cac28f:	4c 89 e7             	mov    rdi,r12
815596-  cac292:	ff 50 28             	call   QWORD PTR [rax+0x28]
815597-  cac295:	49 89 c7             	mov    r15,rax
815598-  cac298:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
815599-  cac29c:	4c 89 ef             	mov    rdi,r13
815600-  cac29f:	ff 50 30             	call   QWORD PTR [rax+0x30]
815601-  cac2a2:	49 89 c4             	mov    r12,rax
815602-  cac2a5:	6a 10                	push   0x10
815603-  cac2a7:	5f                   	pop    rdi
815604-  cac2a8:	e8 53 1c b4 00       	call   17edf00 <_Znwm@plt>
815605-  cac2ad:	4c 89 38             	mov    QWORD PTR [rax],r15
815606-  cac2b0:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
815607-  cac2b4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
815608-  cac2b8:	6a 40                	push   0x40
815609-  cac2ba:	5f                   	pop    rdi
815610-  cac2bb:	e8 40 1c b4 00       	call   17edf00 <_Znwm@plt>
815611-  cac2c0:	49 89 c7             	mov    r15,rax
815612-  cac2c3:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
815613-  cac2c7:	48 8d 05 1a 4f bc 00 	lea    rax,[rip+0xbc4f1a]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
815614-  cac2ce:	49 89 07             	mov    QWORD PTR [r15],rax
815615-  cac2d1:	48 89 e0             	mov    rax,rsp
815616-  cac2d4:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
815617-  cac2d8:	48 8d 05 85 01 dd ff 	lea    rax,[rip+0xffffffffffdd0185]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
815618-  cac2df:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
--
827684-  cb6e80:	00 00 
827685-  cb6e82:	48 89 84 24 f0 02 00 	mov    QWORD PTR [rsp+0x2f0],rax
827686-  cb6e89:	00 
827687-  cb6e8a:	48 89 cf             	mov    rdi,rcx
827688-  cb6e8d:	e8 b8 c9 f9 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
827689-  cb6e92:	49 89 c6             	mov    r14,rax
827690-  cb6e95:	48 89 df             	mov    rdi,rbx
827691-  cb6e98:	e8 2d c4 ea ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
827692-  cb6e9d:	49 89 c4             	mov    r12,rax
827693-  cb6ea0:	48 89 df             	mov    rdi,rbx
827694-  cb6ea3:	e8 f4 05 00 00       	call   cb749c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20443c>
827695-  cb6ea8:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
827696-  cb6eaf:	00 
827697-  cb6eb0:	48 89 df             	mov    rdi,rbx
827698-  cb6eb3:	e8 98 a8 f5 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
827699-  cb6eb8:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
827700-  cb6ebf:	00 
827701-  cb6ec0:	48 89 df             	mov    rdi,rbx
827702:  cb6ec3:	e8 d8 c3 ea ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
827703-  cb6ec8:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
827704-  cb6ecf:	00 
827705-  cb6ed0:	48 89 df             	mov    rdi,rbx
827706-  cb6ed3:	e8 bc 10 ed ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
827707-  cb6ed8:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
827708-  cb6edf:	00 
827709-  cb6ee0:	48 89 df             	mov    rdi,rbx
827710-  cb6ee3:	e8 d6 10 ed ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
827711-  cb6ee8:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
827712-  cb6eef:	00 
827713-  cb6ef0:	48 89 df             	mov    rdi,rbx
827714-  cb6ef3:	e8 7c c9 f9 ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
827715-  cb6ef8:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
827716-  cb6eff:	00 
827717-  cb6f00:	48 89 df             	mov    rdi,rbx
827718-  cb6f03:	e8 f0 f7 f8 ff       	call   c466f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193698>
827719-  cb6f08:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
827720-  cb6f0f:	00 
827721-  cb6f10:	48 89 df             	mov    rdi,rbx
827722-  cb6f13:	e8 04 54 fc ff       	call   c7c31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c92bc>
827723-  cb6f18:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
827724-  cb6f1f:	00 
827725-  cb6f20:	48 89 df             	mov    rdi,rbx
827726-  cb6f23:	e8 a0 05 00 00       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
827727-  cb6f28:	49 89 c7             	mov    r15,rax
827728-  cb6f2b:	48 89 df             	mov    rdi,rbx
827729-  cb6f2e:	e8 d9 a5 ed ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
827730-  cb6f33:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
827731-  cb6f3a:	00 
827732-  cb6f3b:	48 89 df             	mov    rdi,rbx
--
838235-  cc09c4:	48 81 ec 88 00 00 00 	sub    rsp,0x88
838236-  cc09cb:	48 89 cb             	mov    rbx,rcx
838237-  cc09ce:	49 89 d7             	mov    r15,rdx
838238-  cc09d1:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
838239-  cc09d5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
838240-  cc09dc:	00 00 
838241-  cc09de:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
838242-  cc09e5:	00 
838243-  cc09e6:	48 89 cf             	mov    rdi,rcx
838244-  cc09e9:	e8 b2 29 f9 ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
838245-  cc09ee:	48 89 c5             	mov    rbp,rax
838246-  cc09f1:	48 89 df             	mov    rdi,rbx
838247-  cc09f4:	e8 c5 75 ec ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
838248-  cc09f9:	49 89 c6             	mov    r14,rax
838249-  cc09fc:	48 89 df             	mov    rdi,rbx
838250-  cc09ff:	e8 3e 75 ec ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
838251-  cc0a04:	49 89 c4             	mov    r12,rax
838252-  cc0a07:	48 89 df             	mov    rdi,rbx
838253:  cc0a0a:	e8 91 28 ea ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
838254-  cc0a0f:	49 89 c5             	mov    r13,rax
838255-  cc0a12:	49 8b 87 38 01 00 00 	mov    rax,QWORD PTR [r15+0x138]
838256-  cc0a19:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
838257-  cc0a1e:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
838258-  cc0a22:	48 8d 5c 24 10       	lea    rbx,[rsp+0x10]
838259-  cc0a27:	48 89 df             	mov    rdi,rbx
838260-  cc0a2a:	48 89 ee             	mov    rsi,rbp
838261-  cc0a2d:	ff 50 50             	call   QWORD PTR [rax+0x50]
838262-  cc0a30:	48 8b 2b             	mov    rbp,QWORD PTR [rbx]
838263-  cc0a33:	49 8b 06             	mov    rax,QWORD PTR [r14]
838264-  cc0a36:	4c 89 f7             	mov    rdi,r14
838265-  cc0a39:	ff 50 30             	call   QWORD PTR [rax+0x30]
838266-  cc0a3c:	49 89 c7             	mov    r15,rax
838267-  cc0a3f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
838268-  cc0a43:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
838269-  cc0a48:	4c 89 e6             	mov    rsi,r12
838270-  cc0a4b:	ff 50 48             	call   QWORD PTR [rax+0x48]
838271-  cc0a4e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
838272-  cc0a52:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
838273-  cc0a57:	4c 89 e6             	mov    rsi,r12
838274-  cc0a5a:	ff 50 50             	call   QWORD PTR [rax+0x50]
838275-  cc0a5d:	49 8b 06             	mov    rax,QWORD PTR [r14]
838276-  cc0a60:	4c 89 f7             	mov    rdi,r14
838277-  cc0a63:	ff 50 28             	call   QWORD PTR [rax+0x28]
838278-  cc0a66:	49 89 c6             	mov    r14,rax
838279-  cc0a69:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
838280-  cc0a6d:	4c 89 ef             	mov    rdi,r13
838281-  cc0a70:	ff 50 28             	call   QWORD PTR [rax+0x28]
838282-  cc0a73:	49 89 c4             	mov    r12,rax
838283-  cc0a76:	6a 40                	push   0x40
--
913624-  d06ebf:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
913625-  d06ec4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
913626-  d06ecb:	00 00 
913627-  d06ecd:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
913628-  d06ed4:	00 
913629-  d06ed5:	48 89 cf             	mov    rdi,rcx
913630-  d06ed8:	e8 9d a8 f0 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
913631-  d06edd:	49 89 c6             	mov    r14,rax
913632-  d06ee0:	4c 89 ff             	mov    rdi,r15
913633-  d06ee3:	e8 ac 10 e8 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
913634-  d06ee8:	49 89 c5             	mov    r13,rax
913635-  d06eeb:	4c 89 ff             	mov    rdi,r15
913636-  d06eee:	e8 5d a8 f0 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
913637-  d06ef3:	49 89 c4             	mov    r12,rax
913638-  d06ef6:	4c 89 ff             	mov    rdi,r15
913639-  d06ef9:	e8 28 a8 f0 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
913640-  d06efe:	48 89 c3             	mov    rbx,rax
913641-  d06f01:	4c 89 ff             	mov    rdi,r15
913642:  d06f04:	e8 97 c3 e5 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
913643-  d06f09:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
913644-  d06f0e:	4c 89 ff             	mov    rdi,r15
913645-  d06f11:	e8 8e a8 f0 ff       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
913646-  d06f16:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
913647-  d06f1b:	4c 89 ff             	mov    rdi,r15
913648-  d06f1e:	e8 81 a9 f0 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
913649-  d06f23:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
913650-  d06f28:	48 8b 85 80 00 00 00 	mov    rax,QWORD PTR [rbp+0x80]
913651-  d06f2f:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
913652-  d06f34:	48 8b 85 38 01 00 00 	mov    rax,QWORD PTR [rbp+0x138]
913653-  d06f3b:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
913654-  d06f40:	49 8b 06             	mov    rax,QWORD PTR [r14]
913655-  d06f43:	4c 89 74 24 30       	mov    QWORD PTR [rsp+0x30],r14
913656-  d06f48:	4c 89 f7             	mov    rdi,r14
913657-  d06f4b:	ff 50 30             	call   QWORD PTR [rax+0x30]
913658-  d06f4e:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
913659-  d06f53:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
913660-  d06f57:	4d 89 ee             	mov    r14,r13
913661-  d06f5a:	4c 89 ef             	mov    rdi,r13
913662-  d06f5d:	ff 50 28             	call   QWORD PTR [rax+0x28]
913663-  d06f60:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
913664-  d06f65:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
913665-  d06f69:	4c 89 e7             	mov    rdi,r12
913666-  d06f6c:	ff 50 28             	call   QWORD PTR [rax+0x28]
913667-  d06f6f:	49 89 c5             	mov    r13,rax
913668-  d06f72:	48 8b 03             	mov    rax,QWORD PTR [rbx]
913669-  d06f75:	48 89 df             	mov    rdi,rbx
913670-  d06f78:	ff 50 30             	call   QWORD PTR [rax+0x30]
913671-  d06f7b:	48 89 c5             	mov    rbp,rax
913672-  d06f7e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
--
989094-  d498cb:	5a                   	pop    rdx
989095-  d498cc:	c3                   	ret
989096-  d498cd:	cc                   	int3
989097-  d498ce:	55                   	push   rbp
989098-  d498cf:	41 57                	push   r15
989099-  d498d1:	41 56                	push   r14
989100-  d498d3:	41 55                	push   r13
989101-  d498d5:	41 54                	push   r12
989102-  d498d7:	53                   	push   rbx
989103-  d498d8:	48 81 ec a8 01 00 00 	sub    rsp,0x1a8
989104-  d498df:	48 89 d3             	mov    rbx,rdx
989105-  d498e2:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
989106-  d498e9:	00 
989107-  d498ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
989108-  d498f1:	00 00 
989109-  d498f3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
989110-  d498fa:	00 
989111-  d498fb:	48 89 cf             	mov    rdi,rcx
989112:  d498fe:	e8 9d 99 e1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
989113-  d49903:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
989114-  d49908:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
989115-  d4990c:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
989116-  d49911:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
989117-  d49915:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
989118-  d4991a:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
989119-  d49921:	48 89 04 24          	mov    QWORD PTR [rsp],rax
989120-  d49925:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
989121-  d4992c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
989122-  d4992f:	ff 50 10             	call   QWORD PTR [rax+0x10]
989123-  d49932:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
989124-  d49939:	00 
989125-  d4993a:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
989126-  d4993d:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
989127-  d49941:	6a 40                	push   0x40
989128-  d49943:	5f                   	pop    rdi
989129-  d49944:	e8 b7 45 aa 00       	call   17edf00 <_Znwm@plt>
989130-  d49949:	41 8b 4e 48          	mov    ecx,DWORD PTR [r14+0x48]
989131-  d4994d:	89 4c 24 44          	mov    DWORD PTR [rsp+0x44],ecx
989132-  d49951:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
989133-  d49955:	48 8d 0d 44 b7 ad 00 	lea    rcx,[rip+0xadb744]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>
989134-  d4995c:	48 89 08             	mov    QWORD PTR [rax],rcx
989135-  d4995f:	48 8d 48 10          	lea    rcx,[rax+0x10]
989136-  d49963:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
989137-  d49968:	48 8d 48 18          	lea    rcx,[rax+0x18]
989138-  d4996c:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
989139-  d49971:	48 8d 48 20          	lea    rcx,[rax+0x20]
989140-  d49975:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
989141-  d4997a:	48 8d 48 28          	lea    rcx,[rax+0x28]
989142-  d4997e:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
--
991721-  d4bfb5:	5a                   	pop    rdx
991722-  d4bfb6:	c3                   	ret
991723-  d4bfb7:	cc                   	int3
991724-  d4bfb8:	55                   	push   rbp
991725-  d4bfb9:	41 57                	push   r15
991726-  d4bfbb:	41 56                	push   r14
991727-  d4bfbd:	41 55                	push   r13
991728-  d4bfbf:	41 54                	push   r12
991729-  d4bfc1:	53                   	push   rbx
991730-  d4bfc2:	48 81 ec b8 01 00 00 	sub    rsp,0x1b8
991731-  d4bfc9:	48 89 cb             	mov    rbx,rcx
991732-  d4bfcc:	49 89 d5             	mov    r13,rdx
991733-  d4bfcf:	48 89 fd             	mov    rbp,rdi
991734-  d4bfd2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
991735-  d4bfd9:	00 00 
991736-  d4bfdb:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
991737-  d4bfe2:	00 
991738-  d4bfe3:	48 89 cf             	mov    rdi,rcx
991739:  d4bfe6:	e8 b5 72 e1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
991740-  d4bfeb:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
991741-  d4bff0:	48 89 df             	mov    rdi,rbx
991742-  d4bff3:	e8 9c bf e3 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
991743-  d4bff8:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
991744-  d4bffd:	48 89 df             	mov    rdi,rbx
991745-  d4c000:	e8 45 78 f0 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
991746-  d4c005:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
991747-  d4c00a:	48 89 df             	mov    rdi,rbx
991748-  d4c00d:	e8 b8 72 e1 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
991749-  d4c012:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
991750-  d4c019:	00 
991751-  d4c01a:	48 89 df             	mov    rdi,rbx
991752-  d4c01d:	e8 40 9c ef ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
991753-  d4c022:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
991754-  d4c029:	00 
991755-  d4c02a:	48 89 df             	mov    rdi,rbx
991756-  d4c02d:	e8 5a 9c ef ff       	call   c45c8c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c2c>
991757-  d4c032:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
991758-  d4c039:	00 
991759-  d4c03a:	48 89 df             	mov    rdi,rbx
991760-  d4c03d:	e8 32 72 e1 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
991761-  d4c042:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
991762-  d4c049:	00 
991763-  d4c04a:	48 89 df             	mov    rdi,rbx
991764-  d4c04d:	e8 22 78 f0 ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
991765-  d4c052:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
991766-  d4c057:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
991767-  d4c05b:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
991768-  d4c05f:	6a 4c                	push   0x4c
991769-  d4c061:	5a                   	pop    rdx
--
1135374-  dcdc58:	48 81 ec 18 03 00 00 	sub    rsp,0x318
1135375-  dcdc5f:	49 89 ce             	mov    r14,rcx
1135376-  dcdc62:	48 89 d3             	mov    rbx,rdx
1135377-  dcdc65:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
1135378-  dcdc69:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1135379-  dcdc70:	00 00 
1135380-  dcdc72:	48 89 84 24 10 03 00 	mov    QWORD PTR [rsp+0x310],rax
1135381-  dcdc79:	00 
1135382-  dcdc7a:	48 89 cf             	mov    rdi,rcx
1135383-  dcdc7d:	e8 22 3c e4 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
1135384-  dcdc82:	49 89 c7             	mov    r15,rax
1135385-  dcdc85:	4c 89 f7             	mov    rdi,r14
1135386-  dcdc88:	e8 35 10 00 00       	call   dcecc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9bd48>
1135387-  dcdc8d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1135388-  dcdc92:	4c 89 f7             	mov    rdi,r14
1135389-  dcdc95:	e8 b6 3a e4 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1135390-  dcdc9a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1135391-  dcdc9f:	4c 89 f7             	mov    rdi,r14
1135392:  dcdca2:	e8 f9 55 d9 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1135393-  dcdca7:	49 89 c6             	mov    r14,rax
1135394-  dcdcaa:	49 8b 07             	mov    rax,QWORD PTR [r15]
1135395-  dcdcad:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]
1135396-  dcdcb4:	00 
1135397-  dcdcb5:	4c 89 e7             	mov    rdi,r12
1135398-  dcdcb8:	4c 89 fe             	mov    rsi,r15
1135399-  dcdcbb:	ff 50 30             	call   QWORD PTR [rax+0x30]
1135400-  dcdcbe:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
1135401-  dcdcc2:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
1135402-  dcdcc9:	00 
1135403-  dcdcca:	49 8b 07             	mov    rax,QWORD PTR [r15]
1135404-  dcdccd:	4c 89 ff             	mov    rdi,r15
1135405-  dcdcd0:	ff 50 60             	call   QWORD PTR [rax+0x60]
1135406-  dcdcd3:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1135407-  dcdcd8:	49 8b 06             	mov    rax,QWORD PTR [r14]
1135408-  dcdcdb:	4c 89 f7             	mov    rdi,r14
1135409-  dcdcde:	ff 50 28             	call   QWORD PTR [rax+0x28]
1135410-  dcdce1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1135411-  dcdce6:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
1135412-  dcdced:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
1135413-  dcdcf2:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
1135414-  dcdcf6:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
1135415-  dcdcfa:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
1135416-  dcdcff:	6a 10                	push   0x10
1135417-  dcdd01:	5f                   	pop    rdi
1135418-  dcdd02:	e8 f9 01 a2 00       	call   17edf00 <_Znwm@plt>
1135419-  dcdd07:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
1135420-  dcdd0b:	48 8d 0d be 04 a4 00 	lea    rcx,[rip+0xa404be]        # 180e1d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e90>
1135421-  dcdd12:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
1135422-  dcdd17:	48 89 08             	mov    QWORD PTR [rax],rcx
--
1148625-  dd9753:	53                   	push   rbx
1148626-  dd9754:	48 83 ec 58          	sub    rsp,0x58
1148627-  dd9758:	48 89 cb             	mov    rbx,rcx
1148628-  dd975b:	48 89 54 24 50       	mov    QWORD PTR [rsp+0x50],rdx
1148629-  dd9760:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
1148630-  dd9765:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
1148631-  dd9769:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
1148632-  dd976d:	6a 5d                	push   0x5d
1148633-  dd976f:	5a                   	pop    rdx
1148634-  dd9770:	e8 69 8b d8 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
1148635-  dd9775:	48 8b 03             	mov    rax,QWORD PTR [rbx]
1148636-  dd9778:	4c 8b a8 e8 02 00 00 	mov    r13,QWORD PTR [rax+0x2e8]
1148637-  dd977f:	4d 85 ed             	test   r13,r13
1148638-  dd9782:	0f 84 9a 01 00 00    	je     dd9922 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa69a8>
1148639-  dd9788:	48 89 df             	mov    rdi,rbx
1148640-  dd978b:	e8 04 e8 da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1148641-  dd9790:	49 89 c6             	mov    r14,rax
1148642-  dd9793:	48 89 df             	mov    rdi,rbx
1148643:  dd9796:	e8 05 9b d8 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1148644-  dd979b:	49 89 c7             	mov    r15,rax
1148645-  dd979e:	48 89 df             	mov    rdi,rbx
1148646-  dd97a1:	e8 d4 7f e3 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
1148647-  dd97a6:	49 89 c4             	mov    r12,rax
1148648-  dd97a9:	48 89 df             	mov    rdi,rbx
1148649-  dd97ac:	e8 9f 7f e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1148650-  dd97b1:	48 89 c5             	mov    rbp,rax
1148651-  dd97b4:	48 89 df             	mov    rdi,rbx
1148652-  dd97b7:	e8 e8 7f e3 ff       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
1148653-  dd97bc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1148654-  dd97c1:	48 8b 5c 24 50       	mov    rbx,QWORD PTR [rsp+0x50]
1148655-  dd97c6:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
1148656-  dd97cd:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
1148657-  dd97d2:	48 8b 83 38 01 00 00 	mov    rax,QWORD PTR [rbx+0x138]
1148658-  dd97d9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1148659-  dd97de:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
1148660-  dd97e2:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1148661-  dd97e7:	49 8b 06             	mov    rax,QWORD PTR [r14]
1148662-  dd97ea:	4c 89 f7             	mov    rdi,r14
1148663-  dd97ed:	ff 50 28             	call   QWORD PTR [rax+0x28]
1148664-  dd97f0:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
1148665-  dd97f5:	49 8b 07             	mov    rax,QWORD PTR [r15]
1148666-  dd97f8:	4c 89 ff             	mov    rdi,r15
1148667-  dd97fb:	ff 50 28             	call   QWORD PTR [rax+0x28]
1148668-  dd97fe:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1148669-  dd9803:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
1148670-  dd9807:	4c 89 e7             	mov    rdi,r12
1148671-  dd980a:	ff 50 30             	call   QWORD PTR [rax+0x30]
1148672-  dd980d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1148673-  dd9810:	48 89 c7             	mov    rdi,rax
--
1149513-  dda514:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1149514-  dda51b:	00 00 
1149515-  dda51d:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
1149516-  dda524:	00 
1149517-  dda525:	48 89 cf             	mov    rdi,rcx
1149518-  dda528:	e8 1d 93 e7 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
1149519-  dda52d:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
1149520-  dda532:	4c 89 e7             	mov    rdi,r12
1149521-  dda535:	e8 28 b7 e6 ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
1149522-  dda53a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
1149523-  dda541:	00 
1149524-  dda542:	4c 89 e7             	mov    rdi,r12
1149525-  dda545:	e8 2a 8d d8 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
1149526-  dda54a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1149527-  dda54f:	4c 89 e7             	mov    rdi,r12
1149528-  dda552:	e8 cf 71 e3 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1149529-  dda557:	48 89 c3             	mov    rbx,rax
1149530-  dda55a:	4c 89 e7             	mov    rdi,r12
1149531:  dda55d:	e8 3e 8d d8 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1149532-  dda562:	49 89 c7             	mov    r15,rax
1149533-  dda565:	4c 89 e7             	mov    rdi,r12
1149534-  dda568:	e8 e3 72 e3 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
1149535-  dda56d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1149536-  dda572:	4c 89 e7             	mov    rdi,r12
1149537-  dda575:	e8 1a da da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1149538-  dda57a:	49 89 c5             	mov    r13,rax
1149539-  dda57d:	4c 89 e7             	mov    rdi,r12
1149540-  dda580:	e8 cb 71 e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1149541-  dda585:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1149542-  dda58a:	4c 89 e7             	mov    rdi,r12
1149543-  dda58d:	e8 68 72 e3 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
1149544-  dda592:	49 89 c4             	mov    r12,rax
1149545-  dda595:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
1149546-  dda599:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
1149547-  dda59e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
1149548-  dda5a5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
1149549-  dda5aa:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
1149550-  dda5ae:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
1149551-  dda5b5:	00 
1149552-  dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
1149553-  dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1149554-  dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
1149555-  dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
1149556-  dda5c8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
1149557-  dda5cc:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
1149558-  dda5d1:	4c 89 ef             	mov    rdi,r13
1149559-  dda5d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
1149560-  dda5d7:	49 89 c5             	mov    r13,rax
1149561-  dda5da:	49 8b 07             	mov    rax,QWORD PTR [r15]
--
1155659-  ddfdee:	55                   	push   rbp
1155660-  ddfdef:	41 57                	push   r15
1155661-  ddfdf1:	41 56                	push   r14
1155662-  ddfdf3:	41 55                	push   r13
1155663-  ddfdf5:	41 54                	push   r12
1155664-  ddfdf7:	53                   	push   rbx
1155665-  ddfdf8:	48 81 ec e8 01 00 00 	sub    rsp,0x1e8
1155666-  ddfdff:	49 89 ce             	mov    r14,rcx
1155667-  ddfe02:	49 89 d7             	mov    r15,rdx
1155668-  ddfe05:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
1155669-  ddfe0a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1155670-  ddfe11:	00 00 
1155671-  ddfe13:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
1155672-  ddfe1a:	00 
1155673-  ddfe1b:	48 89 cf             	mov    rdi,rcx
1155674-  ddfe1e:	e8 2d 19 e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1155675-  ddfe23:	48 89 c3             	mov    rbx,rax
1155676-  ddfe26:	4c 89 f7             	mov    rdi,r14
1155677:  ddfe29:	e8 72 34 d8 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1155678-  ddfe2e:	49 89 c5             	mov    r13,rax
1155679-  ddfe31:	4c 89 f7             	mov    rdi,r14
1155680-  ddfe34:	e8 5b 81 da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1155681-  ddfe39:	49 89 c4             	mov    r12,rax
1155682-  ddfe3c:	4c 89 f7             	mov    rdi,r14
1155683-  ddfe3f:	e8 60 1a e3 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
1155684-  ddfe44:	49 89 c6             	mov    r14,rax
1155685-  ddfe47:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
1155686-  ddfe4b:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1155687-  ddfe50:	41 0f 10 87 d8 00 00 	movups xmm0,XMMWORD PTR [r15+0xd8]
1155688-  ddfe57:	00 
1155689-  ddfe58:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
1155690-  ddfe5d:	e8 ad 1a e3 ff       	call   c1190f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e8af>
1155691-  ddfe62:	6a 50                	push   0x50
1155692-  ddfe64:	5f                   	pop    rdi
1155693-  ddfe65:	e8 96 e0 a0 00       	call   17edf00 <_Znwm@plt>
1155694-  ddfe6a:	49 89 c7             	mov    r15,rax
1155695-  ddfe6d:	48 8d 05 cc b1 a4 00 	lea    rax,[rip+0xa4b1cc]        # 182b040 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7670>
1155696-  ddfe74:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
1155697-  ddfe7b:	00 
1155698-  ddfe7c:	48 89 01             	mov    QWORD PTR [rcx],rax
1155699-  ddfe7f:	4c 89 71 08          	mov    QWORD PTR [rcx+0x8],r14
1155700-  ddfe83:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
1155701-  ddfe87:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
1155702-  ddfe8c:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
1155703-  ddfe91:	e8 5a 80 cf ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
1155704-  ddfe96:	41 c6 47 08 00       	mov    BYTE PTR [r15+0x8],0x0
1155705-  ddfe9b:	48 8d 05 e6 b1 a4 00 	lea    rax,[rip+0xa4b1e6]        # 182b088 <_ZTIN4asio2ip16bad_address_castE@@Base+0x76b8>
1155706-  ddfea2:	4c 89 3c 24          	mov    QWORD PTR [rsp],r15
1155707-  ddfea6:	49 89 07             	mov    QWORD PTR [r15],rax
--
1341890-  e8c663:	41 54                	push   r12
1341891-  e8c665:	53                   	push   rbx
1341892-  e8c666:	48 81 ec c8 07 00 00 	sub    rsp,0x7c8
1341893-  e8c66d:	49 89 cd             	mov    r13,rcx
1341894-  e8c670:	49 89 d6             	mov    r14,rdx
1341895-  e8c673:	48 89 fb             	mov    rbx,rdi
1341896-  e8c676:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1341897-  e8c67d:	00 00 
1341898-  e8c67f:	48 89 84 24 c0 07 00 	mov    QWORD PTR [rsp+0x7c0],rax
1341899-  e8c686:	00 
1341900-  e8c687:	48 89 cf             	mov    rdi,rcx
1341901-  e8c68a:	e8 93 14 ff ff       	call   e7db22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44f38>
1341902-  e8c68f:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
1341903-  e8c694:	4c 89 ef             	mov    rdi,r13
1341904-  e8c697:	e8 f8 b8 cf ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1341905-  e8c69c:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
1341906-  e8c6a3:	00 
1341907-  e8c6a4:	4c 89 ef             	mov    rdi,r13
1341908:  e8c6a7:	e8 f4 6b cd ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1341909-  e8c6ac:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
1341910-  e8c6b1:	4c 89 ef             	mov    rdi,r13
1341911-  e8c6b4:	e8 89 b8 cf ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
1341912-  e8c6b9:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
1341913-  e8c6c0:	00 
1341914-  e8c6c1:	4c 89 ef             	mov    rdi,r13
1341915-  e8c6c4:	e8 b5 98 cf ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
1341916-  e8c6c9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1341917-  e8c6ce:	4c 89 ef             	mov    rdi,r13
1341918-  e8c6d1:	e8 10 ed cf ff       	call   b8b3e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd8386>
1341919-  e8c6d6:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
1341920-  e8c6dd:	00 
1341921-  e8c6de:	4c 89 ef             	mov    rdi,r13
1341922-  e8c6e1:	e8 6a 50 d8 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1341923-  e8c6e6:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
1341924-  e8c6ed:	00 
1341925-  e8c6ee:	4c 89 ef             	mov    rdi,r13
1341926-  e8c6f1:	e8 a2 21 00 00       	call   e8e898 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55cae>
1341927-  e8c6f6:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
1341928-  e8c6fb:	4c 89 ef             	mov    rdi,r13
1341929-  e8c6fe:	e8 11 b9 cf ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
1341930-  e8c703:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
1341931-  e8c70a:	00 
1341932-  e8c70b:	4c 89 ef             	mov    rdi,r13
1341933-  e8c70e:	e8 bb 50 d8 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
1341934-  e8c713:	49 89 c7             	mov    r15,rax
1341935-  e8c716:	4c 89 ef             	mov    rdi,r13
1341936-  e8c719:	e8 82 6c dc ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
1341937-  e8c71e:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1341938-  e8c723:	4c 89 ef             	mov    rdi,r13
--
1823821- 1045777:	5a                   	pop    rdx
1823822- 1045778:	c3                   	ret
1823823- 1045779:	cc                   	int3
1823824- 104577a:	55                   	push   rbp
1823825- 104577b:	41 57                	push   r15
1823826- 104577d:	41 56                	push   r14
1823827- 104577f:	41 55                	push   r13
1823828- 1045781:	41 54                	push   r12
1823829- 1045783:	53                   	push   rbx
1823830- 1045784:	48 81 ec f8 01 00 00 	sub    rsp,0x1f8
1823831- 104578b:	49 89 cf             	mov    r15,rcx
1823832- 104578e:	48 89 d5             	mov    rbp,rdx
1823833- 1045791:	49 89 fd             	mov    r13,rdi
1823834- 1045794:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1823835- 104579b:	00 00 
1823836- 104579d:	48 89 84 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rax
1823837- 10457a4:	00 
1823838- 10457a5:	48 89 cf             	mov    rdi,rcx
1823839: 10457a8:	e8 f3 da b1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1823840- 10457ad:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1823841- 10457b2:	4c 89 ff             	mov    rdi,r15
1823842- 10457b5:	e8 da 27 b4 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1823843- 10457ba:	49 89 c6             	mov    r14,rax
1823844- 10457bd:	4c 89 ff             	mov    rdi,r15
1823845- 10457c0:	e8 21 5c b4 ff       	call   b8b3e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd8386>
1823846- 10457c5:	66 0f ef c0          	pxor   xmm0,xmm0
1823847- 10457c9:	66 0f 7f 44 24 60    	movdqa XMMWORD PTR [rsp+0x60],xmm0
1823848- 10457cf:	48 83 64 24 70 00    	and    QWORD PTR [rsp+0x70],0x0
1823849- 10457d5:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1823850- 10457d8:	48 89 c7             	mov    rdi,rax
1823851- 10457db:	ff 51 30             	call   QWORD PTR [rcx+0x30]
1823852- 10457de:	49 89 c7             	mov    r15,rax
1823853- 10457e1:	6a 01                	push   0x1
1823854- 10457e3:	5a                   	pop    rdx
1823855- 10457e4:	31 ff                	xor    edi,edi
1823856- 10457e6:	31 f6                	xor    esi,esi
1823857- 10457e8:	e8 f9 a0 a5 ff       	call   a9f8e6 <JNI_OnUnload@@Base+0x271b3>
1823858- 10457ed:	48 8d 4c 24 70       	lea    rcx,[rsp+0x70]
1823859- 10457f2:	48 8b 59 f8          	mov    rbx,QWORD PTR [rcx-0x8]
1823860- 10457f6:	48 2b 59 f0          	sub    rbx,QWORD PTR [rcx-0x10]
1823861- 10457fa:	48 89 8c 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rcx
1823862- 1045801:	00 
1823863- 1045802:	48 85 c0             	test   rax,rax
1823864- 1045805:	74 0a                	je     1045811 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20cc27>
1823865- 1045807:	48 89 c7             	mov    rdi,rax
1823866- 104580a:	e8 13 a1 a5 ff       	call   a9f922 <JNI_OnUnload@@Base+0x271ef>
1823867- 104580f:	eb 04                	jmp    1045815 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20cc2b>
1823868- 1045811:	31 c0                	xor    eax,eax
1823869- 1045813:	31 d2                	xor    edx,edx
--
1833130- 104de60:	48 8d 05 74 7c 38 ff 	lea    rax,[rip+0xffffffffff387c74]        # 3d5adb <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x6c0>
1833131- 104de67:	6a 01                	push   0x1
1833132- 104de69:	5a                   	pop    rdx
1833133- 104de6a:	c3                   	ret
1833134- 104de6b:	cc                   	int3
1833135- 104de6c:	55                   	push   rbp
1833136- 104de6d:	41 57                	push   r15
1833137- 104de6f:	41 56                	push   r14
1833138- 104de71:	41 55                	push   r13
1833139- 104de73:	41 54                	push   r12
1833140- 104de75:	53                   	push   rbx
1833141- 104de76:	48 83 ec 38          	sub    rsp,0x38
1833142- 104de7a:	48 89 d3             	mov    rbx,rdx
1833143- 104de7d:	49 89 fe             	mov    r14,rdi
1833144- 104de80:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1833145- 104de87:	00 00 
1833146- 104de89:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1833147- 104de8e:	48 89 cf             	mov    rdi,rcx
1833148: 104de91:	e8 0a 54 b1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1833149- 104de96:	48 89 c5             	mov    rbp,rax
1833150- 104de99:	48 8b 73 40          	mov    rsi,QWORD PTR [rbx+0x40]
1833151- 104de9d:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
1833152- 104dea2:	e8 c8 96 c6 ff       	call   cb756f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20450f>
1833153- 104dea7:	6a 20                	push   0x20
1833154- 104dea9:	5f                   	pop    rdi
1833155- 104deaa:	e8 51 00 7a 00       	call   17edf00 <_Znwm@plt>
1833156- 104deaf:	48 89 c3             	mov    rbx,rax
1833157- 104deb2:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
1833158- 104deb7:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
1833159- 104debb:	48 8d 05 3e 98 7f 00 	lea    rax,[rip+0x7f983e]        # 1847700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3de8>
1833160- 104dec2:	48 89 03             	mov    QWORD PTR [rbx],rax
1833161- 104dec5:	48 8d 43 10          	lea    rax,[rbx+0x10]
1833162- 104dec9:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1833163- 104dece:	49 89 df             	mov    r15,rbx
1833164- 104ded1:	49 83 c7 18          	add    r15,0x18
1833165- 104ded5:	0f 57 c0             	xorps  xmm0,xmm0
1833166- 104ded8:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
1833167- 104dedc:	6a 08                	push   0x8
1833168- 104dede:	5f                   	pop    rdi
1833169- 104dedf:	e8 1c 00 7a 00       	call   17edf00 <_Znwm@plt>
1833170- 104dee4:	48 8d 0d e5 90 81 00 	lea    rcx,[rip+0x8190e5]        # 1866fd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x236b8>
1833171- 104deeb:	48 83 64 24 20 00    	and    QWORD PTR [rsp+0x20],0x0
1833172- 104def1:	48 89 08             	mov    QWORD PTR [rax],rcx
1833173- 104def4:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
1833174- 104def9:	48 89 02             	mov    QWORD PTR [rdx],rax
1833175- 104defc:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
1833176- 104df00:	6a 04                	push   0x4
1833177- 104df02:	5e                   	pop    rsi
1833178- 104df03:	48 89 ef             	mov    rdi,rbp
--
1843501- 105750e:	b0 75                	mov    al,0x75
1843502- 1057510:	c3                   	ret
1843503- 1057511:	cc                   	int3
1843504- 1057512:	48 8d 05 b7 64 32 ff 	lea    rax,[rip+0xffffffffff3264b7]        # 37d9d0 <_ZTSSt12bad_any_cast@@Base-0x127f8>
1843505- 1057519:	6a 14                	push   0x14
1843506- 105751b:	5a                   	pop    rdx
1843507- 105751c:	c3                   	ret
1843508- 105751d:	cc                   	int3
1843509- 105751e:	48 8d 05 54 e7 37 ff 	lea    rax,[rip+0xffffffffff37e754]        # 3d5c79 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x85e>
1843510- 1057525:	6a 01                	push   0x1
1843511- 1057527:	5a                   	pop    rdx
1843512- 1057528:	c3                   	ret
1843513- 1057529:	cc                   	int3
1843514- 105752a:	41 57                	push   r15
1843515- 105752c:	41 56                	push   r14
1843516- 105752e:	53                   	push   rbx
1843517- 105752f:	48 89 fb             	mov    rbx,rdi
1843518- 1057532:	48 89 cf             	mov    rdi,rcx
1843519: 1057535:	e8 66 bd b0 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1843520- 105753a:	49 89 c7             	mov    r15,rax
1843521- 105753d:	6a 18                	push   0x18
1843522- 105753f:	5f                   	pop    rdi
1843523- 1057540:	e8 bb 69 79 00       	call   17edf00 <_Znwm@plt>
1843524- 1057545:	49 89 c6             	mov    r14,rax
1843525- 1057548:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
1843526- 105754c:	48 8d 05 fd 6b 7b 00 	lea    rax,[rip+0x7b6bfd]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
1843527- 1057553:	49 89 06             	mov    QWORD PTR [r14],rax
1843528- 1057556:	49 8b 07             	mov    rax,QWORD PTR [r15]
1843529- 1057559:	4c 89 ff             	mov    rdi,r15
1843530- 105755c:	ff 50 28             	call   QWORD PTR [rax+0x28]
1843531- 105755f:	49 89 c7             	mov    r15,rax
1843532- 1057562:	6a 60                	push   0x60
1843533- 1057564:	5f                   	pop    rdi
1843534- 1057565:	e8 96 69 79 00       	call   17edf00 <_Znwm@plt>
1843535- 105756a:	48 8d 0d a7 5b 7f 00 	lea    rcx,[rip+0x7f5ba7]        # 184d118 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9800>
1843536- 1057571:	48 89 08             	mov    QWORD PTR [rax],rcx
1843537- 1057574:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
1843538- 1057578:	0f 57 c0             	xorps  xmm0,xmm0
1843539- 105757b:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
1843540- 105757f:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
1843541- 1057583:	b9 00 00 80 3f       	mov    ecx,0x3f800000
1843542- 1057588:	89 48 30             	mov    DWORD PTR [rax+0x30],ecx
1843543- 105758b:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
1843544- 105758f:	0f 11 40 48          	movups XMMWORD PTR [rax+0x48],xmm0
1843545- 1057593:	89 48 58             	mov    DWORD PTR [rax+0x58],ecx
1843546- 1057596:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
1843547- 105759a:	4c 89 33             	mov    QWORD PTR [rbx],r14
1843548- 105759d:	48 89 d8             	mov    rax,rbx
1843549- 10575a0:	5b                   	pop    rbx
--
1867982- 106e2e7:	41 54                	push   r12
1867983- 106e2e9:	53                   	push   rbx
1867984- 106e2ea:	48 81 ec 78 01 00 00 	sub    rsp,0x178
1867985- 106e2f1:	48 89 cb             	mov    rbx,rcx
1867986- 106e2f4:	49 89 d6             	mov    r14,rdx
1867987- 106e2f7:	48 89 fd             	mov    rbp,rdi
1867988- 106e2fa:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1867989- 106e301:	00 00 
1867990- 106e303:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
1867991- 106e30a:	00 
1867992- 106e30b:	48 89 cf             	mov    rdi,rcx
1867993- 106e30e:	e8 91 35 ba ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
1867994- 106e313:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1867995- 106e318:	48 89 df             	mov    rdi,rbx
1867996- 106e31b:	e8 74 9c b1 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1867997- 106e320:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
1867998- 106e327:	00 
1867999- 106e328:	48 89 df             	mov    rdi,rbx
1868000: 106e32b:	e8 70 4f af ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1868001- 106e330:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
1868002- 106e337:	00 
1868003- 106e338:	48 89 df             	mov    rdi,rbx
1868004- 106e33b:	e8 e6 33 ba ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1868005- 106e340:	48 89 df             	mov    rdi,rbx
1868006- 106e343:	e8 08 34 ba ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1868007- 106e348:	48 89 df             	mov    rdi,rbx
1868008- 106e34b:	e8 7e 34 ba ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
1868009- 106e350:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
1868010- 106e355:	48 89 df             	mov    rdi,rbx
1868011- 106e358:	e8 f3 07 00 00       	call   106eb50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235f66>
1868012- 106e35d:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
1868013- 106e362:	48 89 df             	mov    rdi,rbx
1868014- 106e365:	e8 92 33 ba ff       	call   c116fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e69c>
1868015- 106e36a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1868016- 106e36f:	48 89 df             	mov    rdi,rbx
1868017- 106e372:	e8 05 08 00 00       	call   106eb7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235f92>
1868018- 106e377:	49 89 c4             	mov    r12,rax
1868019- 106e37a:	48 89 df             	mov    rdi,rbx
1868020- 106e37d:	e8 24 08 00 00       	call   106eba6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fbc>
1868021- 106e382:	49 89 c7             	mov    r15,rax
1868022- 106e385:	48 89 df             	mov    rdi,rbx
1868023- 106e388:	e8 43 08 00 00       	call   106ebd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fe6>
1868024- 106e38d:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
1868025- 106e392:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
1868026- 106e396:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
1868027- 106e39d:	00 
1868028- 106e39e:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
1868029- 106e3a2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1868030- 106e3a5:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
--
1873752- 10731f9:	41 55                	push   r13
1873753- 10731fb:	41 54                	push   r12
1873754- 10731fd:	53                   	push   rbx
1873755- 10731fe:	48 81 ec 98 02 00 00 	sub    rsp,0x298
1873756- 1073205:	49 89 cf             	mov    r15,rcx
1873757- 1073208:	48 89 d3             	mov    rbx,rdx
1873758- 107320b:	48 89 fd             	mov    rbp,rdi
1873759- 107320e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1873760- 1073215:	00 00 
1873761- 1073217:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
1873762- 107321e:	00 
1873763- 107321f:	48 89 cf             	mov    rdi,rcx
1873764- 1073222:	e8 7d e6 b9 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
1873765- 1073227:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1873766- 107322c:	4c 89 ff             	mov    rdi,r15
1873767- 107322f:	e8 60 4d b1 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1873768- 1073234:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1873769- 1073239:	4c 89 ff             	mov    rdi,r15
1873770: 107323c:	e8 5f 00 af ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1873771- 1073241:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1873772- 1073246:	4c 89 ff             	mov    rdi,r15
1873773- 1073249:	e8 d8 e4 b9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1873774- 107324e:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
1873775- 1073253:	4c 89 ff             	mov    rdi,r15
1873776- 1073256:	e8 f5 e4 b9 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1873777- 107325b:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
1873778- 1073260:	4c 89 ff             	mov    rdi,r15
1873779- 1073263:	e8 66 e5 b9 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
1873780- 1073268:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
1873781- 107326d:	4c 89 ff             	mov    rdi,r15
1873782- 1073270:	e8 85 e5 b9 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
1873783- 1073275:	49 89 c5             	mov    r13,rax
1873784- 1073278:	4c 89 ff             	mov    rdi,r15
1873785- 107327b:	e8 d0 e5 b9 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
1873786- 1073280:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
1873787- 1073287:	00 
1873788- 1073288:	4c 89 ff             	mov    rdi,r15
1873789- 107328b:	e8 fe 39 c4 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
1873790- 1073290:	49 89 c6             	mov    r14,rax
1873791- 1073293:	4c 89 ff             	mov    rdi,r15
1873792- 1073296:	e8 79 4d b1 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
1873793- 107329b:	49 89 c7             	mov    r15,rax
1873794- 107329e:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
1873795- 10732a2:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1873796- 10732a7:	48 8b 73 58          	mov    rsi,QWORD PTR [rbx+0x58]
1873797- 10732ab:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1873798- 10732ae:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
1873799- 10732b5:	00 
1873800- 10732b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
--
1875440- 1074acf:	41 55                	push   r13
1875441- 1074ad1:	41 54                	push   r12
1875442- 1074ad3:	53                   	push   rbx
1875443- 1074ad4:	48 81 ec 98 02 00 00 	sub    rsp,0x298
1875444- 1074adb:	49 89 cc             	mov    r12,rcx
1875445- 1074ade:	49 89 d5             	mov    r13,rdx
1875446- 1074ae1:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
1875447- 1074ae8:	00 
1875448- 1074ae9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1875449- 1074af0:	00 00 
1875450- 1074af2:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
1875451- 1074af9:	00 
1875452- 1074afa:	48 89 cf             	mov    rdi,rcx
1875453- 1074afd:	e8 a2 cd b9 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
1875454- 1074b02:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1875455- 1074b07:	4c 89 e7             	mov    rdi,r12
1875456- 1074b0a:	e8 85 34 b1 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1875457- 1074b0f:	4c 89 e7             	mov    rdi,r12
1875458: 1074b12:	e8 89 e7 ae ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1875459- 1074b17:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
1875460- 1074b1c:	4c 89 e7             	mov    rdi,r12
1875461- 1074b1f:	e8 02 cc b9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1875462- 1074b24:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1875463- 1074b29:	4c 89 e7             	mov    rdi,r12
1875464- 1074b2c:	e8 1f cc b9 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1875465- 1074b31:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
1875466- 1074b36:	4c 89 e7             	mov    rdi,r12
1875467- 1074b39:	e8 90 cc b9 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
1875468- 1074b3e:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
1875469- 1074b43:	4c 89 e7             	mov    rdi,r12
1875470- 1074b46:	e8 05 a0 ff ff       	call   106eb50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235f66>
1875471- 1074b4b:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1875472- 1074b50:	4c 89 e7             	mov    rdi,r12
1875473- 1074b53:	e8 a2 cc b9 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
1875474- 1074b58:	49 89 c7             	mov    r15,rax
1875475- 1074b5b:	4c 89 e7             	mov    rdi,r12
1875476- 1074b5e:	e8 19 a0 ff ff       	call   106eb7c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235f92>
1875477- 1074b63:	48 89 c3             	mov    rbx,rax
1875478- 1074b66:	4c 89 e7             	mov    rdi,r12
1875479- 1074b69:	e8 38 a0 ff ff       	call   106eba6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fbc>
1875480- 1074b6e:	49 89 c6             	mov    r14,rax
1875481- 1074b71:	4c 89 e7             	mov    rdi,r12
1875482- 1074b74:	e8 57 a0 ff ff       	call   106ebd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fe6>
1875483- 1074b79:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
1875484- 1074b80:	00 
1875485- 1074b81:	4c 89 e7             	mov    rdi,r12
1875486- 1074b84:	e8 33 0e 00 00       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
1875487- 1074b89:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
1875488- 1074b90:	00 
--
1877285- 107660f:	53                   	push   rbx
1877286- 1076610:	48 81 ec 98 03 00 00 	sub    rsp,0x398
1877287- 1076617:	49 89 ce             	mov    r14,rcx
1877288- 107661a:	48 89 d3             	mov    rbx,rdx
1877289- 107661d:	49 89 fc             	mov    r12,rdi
1877290- 1076620:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1877291- 1076627:	00 00 
1877292- 1076629:	48 89 84 24 90 03 00 	mov    QWORD PTR [rsp+0x390],rax
1877293- 1076630:	00 
1877294- 1076631:	48 89 cf             	mov    rdi,rcx
1877295- 1076634:	e8 6b b2 b9 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
1877296- 1076639:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
1877297- 1076640:	00 
1877298- 1076641:	4c 89 f7             	mov    rdi,r14
1877299- 1076644:	e8 4b 19 b1 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1877300- 1076649:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
1877301- 1076650:	00 
1877302- 1076651:	4c 89 f7             	mov    rdi,r14
1877303: 1076654:	e8 47 cc ae ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1877304- 1076659:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1877305- 107665e:	4c 89 f7             	mov    rdi,r14
1877306- 1076661:	e8 3e b1 b9 ff       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
1877307- 1076666:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
1877308- 107666b:	4c 89 f7             	mov    rdi,r14
1877309- 107666e:	e8 b3 b0 b9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1877310- 1076673:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
1877311- 107667a:	00 
1877312- 107667b:	4c 89 f7             	mov    rdi,r14
1877313- 107667e:	e8 a1 b1 b9 ff       	call   c11824 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7c4>
1877314- 1076683:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
1877315- 107668a:	00 
1877316- 107668b:	4c 89 f7             	mov    rdi,r14
1877317- 107668e:	e8 09 b3 d6 ff       	call   de199c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaea22>
1877318- 1076693:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
1877319- 1076698:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
1877320- 107669c:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
1877321- 10766a0:	ba 8c 00 00 00       	mov    edx,0x8c
1877322- 10766a5:	e8 34 bc ae ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
1877323- 10766aa:	49 8b 06             	mov    rax,QWORD PTR [r14]
1877324- 10766ad:	48 8b 80 60 04 00 00 	mov    rax,QWORD PTR [rax+0x460]
1877325- 10766b4:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
1877326- 10766b9:	48 85 c0             	test   rax,rax
1877327- 10766bc:	0f 84 92 0d 00 00    	je     1077454 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e86a>
1877328- 10766c2:	4c 89 f7             	mov    rdi,r14
1877329- 10766c5:	e8 4a 19 b1 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
1877330- 10766ca:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
1877331- 10766cf:	4c 89 f7             	mov    rdi,r14
1877332- 10766d2:	e8 b7 05 c4 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
1877333- 10766d7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
--
1878915- 1077ecc:	00 
1878916- 1077ecd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1878917- 1077ed4:	00 00 
1878918- 1077ed6:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
1878919- 1077edd:	00 
1878920- 1077ede:	48 89 cf             	mov    rdi,rcx
1878921- 1077ee1:	e8 be 99 b9 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
1878922- 1077ee6:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1878923- 1077eeb:	48 89 df             	mov    rdi,rbx
1878924- 1077eee:	e8 5d 98 b9 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1878925- 1077ef3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
1878926- 1077ef7:	48 89 df             	mov    rdi,rbx
1878927- 1077efa:	e8 27 98 b9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1878928- 1077eff:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1878929- 1077f04:	48 89 df             	mov    rdi,rbx
1878930- 1077f07:	e8 88 00 b1 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1878931- 1077f0c:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
1878932- 1077f11:	48 89 df             	mov    rdi,rbx
1878933: 1077f14:	e8 87 b3 ae ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1878934- 1077f19:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1878935- 1077f1e:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
1878936- 1077f23:	49 8b 5c 24 60       	mov    rbx,QWORD PTR [r12+0x60]
1878937- 1077f28:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
1878938- 1077f2f:	00 
1878939- 1077f30:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1878940- 1077f35:	49 8b 74 24 58       	mov    rsi,QWORD PTR [r12+0x58]
1878941- 1077f3a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1878942- 1077f3d:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
1878943- 1077f44:	00 
1878944- 1077f45:	ff 50 28             	call   QWORD PTR [rax+0x28]
1878945- 1077f48:	bf b0 00 00 00       	mov    edi,0xb0
1878946- 1077f4d:	e8 ae 5f 77 00       	call   17edf00 <_Znwm@plt>
1878947- 1077f52:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
1878948- 1077f57:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
1878949- 1077f5b:	48 8d 0d 46 17 7d 00 	lea    rcx,[rip+0x7d1746]        # 18496a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5d90>
1878950- 1077f62:	48 89 08             	mov    QWORD PTR [rax],rcx
1878951- 1077f65:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
1878952- 1077f6a:	48 8d 48 10          	lea    rcx,[rax+0x10]
1878953- 1077f6e:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
1878954- 1077f73:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
1878955- 1077f78:	48 8d 48 50          	lea    rcx,[rax+0x50]
1878956- 1077f7c:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
1878957- 1077f81:	48 83 60 50 00       	and    QWORD PTR [rax+0x50],0x0
1878958- 1077f86:	48 83 a0 80 00 00 00 	and    QWORD PTR [rax+0x80],0x0
1878959- 1077f8d:	00 
1878960- 1077f8e:	4c 8d b0 90 00 00 00 	lea    r14,[rax+0x90]
1878961- 1077f95:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
1878962- 1077f9c:	00 
1878963- 1077f9d:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
--
1881021- 1079e99:	53                   	push   rbx
1881022- 1079e9a:	48 83 ec 68          	sub    rsp,0x68
1881023- 1079e9e:	49 89 cf             	mov    r15,rcx
1881024- 1079ea1:	49 89 d6             	mov    r14,rdx
1881025- 1079ea4:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
1881026- 1079ea8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1881027- 1079eaf:	00 00 
1881028- 1079eb1:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
1881029- 1079eb6:	48 89 cf             	mov    rdi,rcx
1881030- 1079eb9:	e8 d6 e0 b0 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1881031- 1079ebe:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1881032- 1079ec3:	4c 89 ff             	mov    rdi,r15
1881033- 1079ec6:	e8 85 78 b9 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1881034- 1079ecb:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1881035- 1079ed0:	4c 89 ff             	mov    rdi,r15
1881036- 1079ed3:	e8 78 79 b9 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
1881037- 1079ed8:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
1881038- 1079edd:	4c 89 ff             	mov    rdi,r15
1881039: 1079ee0:	e8 bb 93 ae ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1881040- 1079ee5:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1881041- 1079eea:	4c 89 ff             	mov    rdi,r15
1881042- 1079eed:	e8 9c cd c3 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
1881043- 1079ef2:	49 89 c4             	mov    r12,rax
1881044- 1079ef5:	4d 8b 7e 68          	mov    r15,QWORD PTR [r14+0x68]
1881045- 1079ef9:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
1881046- 1079efd:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1881047- 1079f00:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
1881048- 1079f05:	ff 50 28             	call   QWORD PTR [rax+0x28]
1881049- 1079f08:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
1881050- 1079f0f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1881051- 1079f14:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
1881052- 1079f18:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1881053- 1079f1d:	49 8b 6e 30          	mov    rbp,QWORD PTR [r14+0x30]
1881054- 1079f21:	49 8b 5e 40          	mov    rbx,QWORD PTR [r14+0x40]
1881055- 1079f25:	49 8b 06             	mov    rax,QWORD PTR [r14]
1881056- 1079f28:	4d 8b 6e 20          	mov    r13,QWORD PTR [r14+0x20]
1881057- 1079f2c:	41 8a 8c 24 b8 00 00 	mov    cl,BYTE PTR [r12+0xb8]
1881058- 1079f33:	00 
1881059- 1079f34:	88 4c 24 3e          	mov    BYTE PTR [rsp+0x3e],cl
1881060- 1079f38:	8a 88 e0 03 00 00    	mov    cl,BYTE PTR [rax+0x3e0]
1881061- 1079f3e:	88 4c 24 3f          	mov    BYTE PTR [rsp+0x3f],cl
1881062- 1079f42:	41 8a 4c 24 11       	mov    cl,BYTE PTR [r12+0x11]
1881063- 1079f47:	88 4c 24 40          	mov    BYTE PTR [rsp+0x40],cl
1881064- 1079f4b:	c6 44 24 41 00       	mov    BYTE PTR [rsp+0x41],0x0
1881065- 1079f50:	8a 88 e1 03 00 00    	mov    cl,BYTE PTR [rax+0x3e1]
1881066- 1079f56:	88 4c 24 42          	mov    BYTE PTR [rsp+0x42],cl
1881067- 1079f5a:	66 c7 44 24 43 00 01 	mov    WORD PTR [rsp+0x43],0x100
1881068- 1079f61:	8a 80 e2 03 00 00    	mov    al,BYTE PTR [rax+0x3e2]
1881069- 1079f67:	88 44 24 45          	mov    BYTE PTR [rsp+0x45],al
--
1887962- 1080695:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
1887963- 108069a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1887964- 10806a1:	00 00 
1887965- 10806a3:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
1887966- 10806aa:	00 
1887967- 10806ab:	48 89 cf             	mov    rdi,rcx
1887968- 10806ae:	e8 9d 11 b9 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
1887969- 10806b3:	48 89 c3             	mov    rbx,rax
1887970- 10806b6:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
1887971- 10806ba:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
1887972- 10806be:	6a 0e                	push   0xe
1887973- 10806c0:	5a                   	pop    rdx
1887974- 10806c1:	e8 18 1c ae ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
1887975- 10806c6:	49 8b 06             	mov    rax,QWORD PTR [r14]
1887976- 10806c9:	4c 8b 78 70          	mov    r15,QWORD PTR [rax+0x70]
1887977- 10806cd:	4d 85 ff             	test   r15,r15
1887978- 10806d0:	0f 84 75 01 00 00    	je     108084b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x247c61>
1887979- 10806d6:	4c 89 f7             	mov    rdi,r14
1887980: 10806d9:	e8 c2 2b ae ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1887981- 10806de:	48 89 c5             	mov    rbp,rax
1887982- 10806e1:	4c 89 f7             	mov    rdi,r14
1887983- 10806e4:	e8 3d 10 b9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1887984- 10806e9:	49 89 c5             	mov    r13,rax
1887985- 10806ec:	49 8b 84 24 38 01 00 	mov    rax,QWORD PTR [r12+0x138]
1887986- 10806f3:	00 
1887987- 10806f4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1887988- 10806f9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
1887989- 10806fc:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
1887990- 1080701:	48 89 de             	mov    rsi,rbx
1887991- 1080704:	ff 50 28             	call   QWORD PTR [rax+0x28]
1887992- 1080707:	4d 8b b4 24 80 00 00 	mov    r14,QWORD PTR [r12+0x80]
1887993- 108070e:	00 
1887994- 108070f:	41 0f 10 84 24 d8 00 	movups xmm0,XMMWORD PTR [r12+0xd8]
1887995- 1080716:	00 00 
1887996- 1080718:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
1887997- 108071d:	e8 ed 11 b9 ff       	call   c1190f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e8af>
1887998- 1080722:	49 8b 07             	mov    rax,QWORD PTR [r15]
1887999- 1080725:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
1888000- 108072a:	4c 89 fe             	mov    rsi,r15
1888001- 108072d:	ff 50 28             	call   QWORD PTR [rax+0x28]
1888002- 1080730:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
1888003- 1080734:	48 89 ef             	mov    rdi,rbp
1888004- 1080737:	ff 50 28             	call   QWORD PTR [rax+0x28]
1888005- 108073a:	49 89 c7             	mov    r15,rax
1888006- 108073d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
1888007- 1080741:	4c 89 ef             	mov    rdi,r13
1888008- 1080744:	ff 50 30             	call   QWORD PTR [rax+0x30]
1888009- 1080747:	49 89 c5             	mov    r13,rax
1888010- 108074a:	49 8b 74 24 58       	mov    rsi,QWORD PTR [r12+0x58]
--
1888216- 1080a3d:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
1888217- 1080a44:	00 
1888218- 1080a45:	48 8b 82 80 00 00 00 	mov    rax,QWORD PTR [rdx+0x80]
1888219- 1080a4c:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1888220- 1080a51:	48 8b 42 40          	mov    rax,QWORD PTR [rdx+0x40]
1888221- 1080a55:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
1888222- 1080a5a:	48 8b 42 68          	mov    rax,QWORD PTR [rdx+0x68]
1888223- 1080a5e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1888224- 1080a63:	48 89 cf             	mov    rdi,rcx
1888225- 1080a66:	e8 09 28 ae ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
1888226- 1080a6b:	48 89 c3             	mov    rbx,rax
1888227- 1080a6e:	4c 89 e7             	mov    rdi,r12
1888228- 1080a71:	e8 da 0d b9 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
1888229- 1080a76:	49 89 c6             	mov    r14,rax
1888230- 1080a79:	4c 89 e7             	mov    rdi,r12
1888231- 1080a7c:	e8 a5 0c b9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1888232- 1080a81:	49 89 c7             	mov    r15,rax
1888233- 1080a84:	4c 89 e7             	mov    rdi,r12
1888234: 1080a87:	e8 14 28 ae ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1888235- 1080a8c:	49 89 c4             	mov    r12,rax
1888236- 1080a8f:	41 bd 10 01 00 00    	mov    r13d,0x110
1888237- 1080a95:	4c 03 6d 00          	add    r13,QWORD PTR [rbp+0x0]
1888238- 1080a99:	6a 28                	push   0x28
1888239- 1080a9b:	5f                   	pop    rdi
1888240- 1080a9c:	e8 5f d4 76 00       	call   17edf00 <_Znwm@plt>
1888241- 1080aa1:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
1888242- 1080aa5:	48 8d 0d 5c 91 7c 00 	lea    rcx,[rip+0x7c915c]        # 1849c08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x62f0>
1888243- 1080aac:	48 89 08             	mov    QWORD PTR [rax],rcx
1888244- 1080aaf:	48 8d 48 20          	lea    rcx,[rax+0x20]
1888245- 1080ab3:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
1888246- 1080ab8:	0f 57 c0             	xorps  xmm0,xmm0
1888247- 1080abb:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
1888248- 1080abf:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1888249- 1080ac4:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
1888250- 1080ac9:	49 8b 06             	mov    rax,QWORD PTR [r14]
1888251- 1080acc:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
1888252- 1080ad3:	00 
1888253- 1080ad4:	4c 89 f6             	mov    rsi,r14
1888254- 1080ad7:	ff 50 28             	call   QWORD PTR [rax+0x28]
1888255- 1080ada:	48 8b 03             	mov    rax,QWORD PTR [rbx]
1888256- 1080add:	48 89 df             	mov    rdi,rbx
1888257- 1080ae0:	ff 50 28             	call   QWORD PTR [rax+0x28]
1888258- 1080ae3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1888259- 1080ae6:	48 89 c7             	mov    rdi,rax
1888260- 1080ae9:	ff 51 78             	call   QWORD PTR [rcx+0x78]
1888261- 1080aec:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
1888262- 1080af3:	00 
1888263- 1080af4:	48 89 94 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rdx
1888264- 1080afb:	00 
--
1896521- 108853a:	55                   	push   rbp
1896522- 108853b:	41 57                	push   r15
1896523- 108853d:	41 56                	push   r14
1896524- 108853f:	41 55                	push   r13
1896525- 1088541:	41 54                	push   r12
1896526- 1088543:	53                   	push   rbx
1896527- 1088544:	48 81 ec 18 01 00 00 	sub    rsp,0x118
1896528- 108854b:	48 89 cb             	mov    rbx,rcx
1896529- 108854e:	49 89 d7             	mov    r15,rdx
1896530- 1088551:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
1896531- 1088556:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1896532- 108855d:	00 00 
1896533- 108855f:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
1896534- 1088566:	00 
1896535- 1088567:	48 89 cf             	mov    rdi,rcx
1896536- 108856a:	e8 79 fa af ff       	call   b87fe8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f88>
1896537- 108856f:	49 89 c5             	mov    r13,rax
1896538- 1088572:	48 89 df             	mov    rdi,rbx
1896539: 1088575:	e8 26 ad ad ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1896540- 108857a:	48 89 c5             	mov    rbp,rax
1896541- 108857d:	48 89 df             	mov    rdi,rbx
1896542- 1088580:	e8 6f 02 d6 ff       	call   de87f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb587a>
1896543- 1088585:	49 89 c6             	mov    r14,rax
1896544- 1088588:	48 89 df             	mov    rdi,rbx
1896545- 108858b:	e8 fe e6 c2 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
1896546- 1088590:	49 89 c4             	mov    r12,rax
1896547- 1088593:	49 8b 87 80 00 00 00 	mov    rax,QWORD PTR [r15+0x80]
1896548- 108859a:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
1896549- 10885a1:	00 
1896550- 10885a2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
1896551- 10885a6:	4c 89 ef             	mov    rdi,r13
1896552- 10885a9:	ff 50 28             	call   QWORD PTR [rax+0x28]
1896553- 10885ac:	49 89 c5             	mov    r13,rax
1896554- 10885af:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
1896555- 10885b3:	48 89 ef             	mov    rdi,rbp
1896556- 10885b6:	ff 50 28             	call   QWORD PTR [rax+0x28]
1896557- 10885b9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1896558- 10885be:	48 89 df             	mov    rdi,rbx
1896559- 10885c1:	e8 34 92 b8 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
1896560- 10885c6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1896561- 10885c9:	48 89 c7             	mov    rdi,rax
1896562- 10885cc:	ff 51 28             	call   QWORD PTR [rcx+0x28]
1896563- 10885cf:	48 89 c5             	mov    rbp,rax
1896564- 10885d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
1896565- 10885d5:	4c 89 f7             	mov    rdi,r14
1896566- 10885d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
1896567- 10885db:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1896568- 10885e0:	48 89 df             	mov    rdi,rbx
1896569- 10885e3:	e8 46 6a b0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
--
1911094- 109548f:	6a 01                	push   0x1
1911095- 1095491:	5a                   	pop    rdx
1911096- 1095492:	c3                   	ret
1911097- 1095493:	cc                   	int3
1911098- 1095494:	55                   	push   rbp
1911099- 1095495:	41 57                	push   r15
1911100- 1095497:	41 56                	push   r14
1911101- 1095499:	41 55                	push   r13
1911102- 109549b:	41 54                	push   r12
1911103- 109549d:	53                   	push   rbx
1911104- 109549e:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
1911105- 10954a5:	48 89 d3             	mov    rbx,rdx
1911106- 10954a8:	49 89 fe             	mov    r14,rdi
1911107- 10954ab:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1911108- 10954b2:	00 00 
1911109- 10954b4:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1911110- 10954bb:	00 
1911111- 10954bc:	48 89 cf             	mov    rdi,rcx
1911112: 10954bf:	e8 dc dd ac ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1911113- 10954c4:	49 89 c4             	mov    r12,rax
1911114- 10954c7:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
1911115- 10954cb:	48 8b ab 80 00 00 00 	mov    rbp,QWORD PTR [rbx+0x80]
1911116- 10954d2:	6a 18                	push   0x18
1911117- 10954d4:	5f                   	pop    rdi
1911118- 10954d5:	e8 26 8a 75 00       	call   17edf00 <_Znwm@plt>
1911119- 10954da:	48 89 c3             	mov    rbx,rax
1911120- 10954dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
1911121- 10954e1:	48 8d 05 68 8c 77 00 	lea    rax,[rip+0x778c68]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
1911122- 10954e8:	48 89 03             	mov    QWORD PTR [rbx],rax
1911123- 10954eb:	48 8d 35 90 bb 2d ff 	lea    rsi,[rip+0xffffffffff2dbb90]        # 371082 <_ZTSSt12bad_any_cast@@Base-0x1f146>
1911124- 10954f2:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
1911125- 10954f7:	e8 82 45 9e ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
1911126- 10954fc:	49 8b 07             	mov    rax,QWORD PTR [r15]
1911127- 10954ff:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
1911128- 1095504:	48 8d 54 24 18       	lea    rdx,[rsp+0x18]
1911129- 1095509:	4c 89 fe             	mov    rsi,r15
1911130- 109550c:	ff 50 18             	call   QWORD PTR [rax+0x18]
1911131- 109550f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
1911132- 1095513:	4c 89 e7             	mov    rdi,r12
1911133- 1095516:	ff 50 28             	call   QWORD PTR [rax+0x28]
1911134- 1095519:	49 89 c5             	mov    r13,rax
1911135- 109551c:	49 8b 07             	mov    rax,QWORD PTR [r15]
1911136- 109551f:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
1911137- 1095524:	4c 89 e7             	mov    rdi,r12
1911138- 1095527:	4c 89 fe             	mov    rsi,r15
1911139- 109552a:	ff 50 10             	call   QWORD PTR [rax+0x10]
1911140- 109552d:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
1911141- 1095531:	bf b0 00 00 00       	mov    edi,0xb0
1911142- 1095536:	e8 c5 89 75 00       	call   17edf00 <_Znwm@plt>
--
1915010- 1098ce4:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
1915011- 1098ce8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1915012- 1098ceb:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
1915013- 1098cf2:	00 
1915014- 1098cf3:	ff 50 28             	call   QWORD PTR [rax+0x28]
1915015- 1098cf6:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
1915016- 1098cfd:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
1915017- 1098d02:	49 8b 07             	mov    rax,QWORD PTR [r15]
1915018- 1098d05:	4c 89 ff             	mov    rdi,r15
1915019- 1098d08:	ff 50 28             	call   QWORD PTR [rax+0x28]
1915020- 1098d0b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
1915021- 1098d10:	4c 89 ef             	mov    rdi,r13
1915022- 1098d13:	e8 e2 8a b7 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
1915023- 1098d18:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1915024- 1098d1b:	48 89 c7             	mov    rdi,rax
1915025- 1098d1e:	ff 51 30             	call   QWORD PTR [rcx+0x30]
1915026- 1098d21:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1915027- 1098d26:	4c 89 ef             	mov    rdi,r13
1915028: 1098d29:	e8 72 a5 ac ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1915029- 1098d2e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1915030- 1098d31:	48 89 c7             	mov    rdi,rax
1915031- 1098d34:	ff 51 28             	call   QWORD PTR [rcx+0x28]
1915032- 1098d37:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
1915033- 1098d3c:	4c 89 ef             	mov    rdi,r13
1915034- 1098d3f:	e8 60 8a b7 ff       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
1915035- 1098d44:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1915036- 1098d47:	48 89 c7             	mov    rdi,rax
1915037- 1098d4a:	ff 51 28             	call   QWORD PTR [rcx+0x28]
1915038- 1098d4d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1915039- 1098d52:	4d 8b 7f 18          	mov    r15,QWORD PTR [r15+0x18]
1915040- 1098d56:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
1915041- 1098d5a:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
1915042- 1098d61:	00 
1915043- 1098d62:	48 89 ee             	mov    rsi,rbp
1915044- 1098d65:	ff 50 30             	call   QWORD PTR [rax+0x30]
1915045- 1098d68:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
1915046- 1098d6d:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
1915047- 1098d74:	00 
1915048- 1098d75:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1915049- 1098d7a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
1915050- 1098d7d:	48 89 df             	mov    rdi,rbx
1915051- 1098d80:	ff 50 30             	call   QWORD PTR [rax+0x30]
1915052- 1098d83:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
1915053- 1098d88:	48 8b 03             	mov    rax,QWORD PTR [rbx]
1915054- 1098d8b:	48 89 df             	mov    rdi,rbx
1915055- 1098d8e:	ff 50 40             	call   QWORD PTR [rax+0x40]
1915056- 1098d91:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1915057- 1098d96:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
1915058- 1098d9a:	4c 89 e7             	mov    rdi,r12
--
1915328- 109918b:	49 89 cc             	mov    r12,rcx
1915329- 109918e:	49 89 d6             	mov    r14,rdx
1915330- 1099191:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
1915331- 1099198:	00 
1915332- 1099199:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1915333- 10991a0:	00 00 
1915334- 10991a2:	48 89 84 24 60 02 00 	mov    QWORD PTR [rsp+0x260],rax
1915335- 10991a9:	00 
1915336- 10991aa:	48 89 cf             	mov    rdi,rcx
1915337- 10991ad:	e8 3a 57 df ff       	call   e8e8ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d02>
1915338- 10991b2:	48 89 c5             	mov    rbp,rax
1915339- 10991b5:	4c 89 e7             	mov    rdi,r12
1915340- 10991b8:	e8 df e2 c1 ff       	call   cb749c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20443c>
1915341- 10991bd:	49 89 c5             	mov    r13,rax
1915342- 10991c0:	49 8b 5e 68          	mov    rbx,QWORD PTR [r14+0x68]
1915343- 10991c4:	4c 89 e7             	mov    rdi,r12
1915344- 10991c7:	e8 c8 ed ae ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1915345- 10991cc:	4c 89 e7             	mov    rdi,r12
1915346: 10991cf:	e8 cc a0 ac ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1915347- 10991d4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1915348- 10991d9:	4c 89 e7             	mov    rdi,r12
1915349- 10991dc:	e8 19 86 b7 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
1915350- 10991e1:	49 89 c7             	mov    r15,rax
1915351- 10991e4:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
1915352- 10991e8:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1915353- 10991ef:	00 
1915354- 10991f0:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
1915355- 10991f4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1915356- 10991f7:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
1915357- 10991fe:	00 
1915358- 10991ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
1915359- 1099202:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
1915360- 1099206:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
1915361- 109920d:	00 
1915362- 109920e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
1915363- 1099215:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1915364- 109921a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
1915365- 109921e:	48 89 ef             	mov    rdi,rbp
1915366- 1099221:	ff 50 28             	call   QWORD PTR [rax+0x28]
1915367- 1099224:	48 89 c5             	mov    rbp,rax
1915368- 1099227:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
1915369- 109922b:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
1915370- 1099232:	00 
1915371- 1099233:	4c 89 ee             	mov    rsi,r13
1915372- 1099236:	ff 50 30             	call   QWORD PTR [rax+0x30]
1915373- 1099239:	0f 28 84 24 b0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xb0]
1915374- 1099240:	00 
1915375- 1099241:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
1915376- 1099246:	4c 8b ac 24 b8 00 00 	mov    r13,QWORD PTR [rsp+0xb8]
--
1935117- 10ab7b3:	41 55                	push   r13
1935118- 10ab7b5:	41 54                	push   r12
1935119- 10ab7b7:	53                   	push   rbx
1935120- 10ab7b8:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
1935121- 10ab7bf:	49 89 ce             	mov    r14,rcx
1935122- 10ab7c2:	48 89 d3             	mov    rbx,rdx
1935123- 10ab7c5:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
1935124- 10ab7ca:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1935125- 10ab7d1:	00 00 
1935126- 10ab7d3:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
1935127- 10ab7da:	00 
1935128- 10ab7db:	48 89 cf             	mov    rdi,rcx
1935129- 10ab7de:	e8 b5 30 de ff       	call   e8e898 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55cae>
1935130- 10ab7e3:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
1935131- 10ab7e8:	4c 89 f7             	mov    rdi,r14
1935132- 10ab7eb:	e8 da 97 b8 ff       	call   c34fca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181f6a>
1935133- 10ab7f0:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
1935134- 10ab7f5:	4c 89 f7             	mov    rdi,r14
1935135: 10ab7f8:	e8 a3 7a ab ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1935136- 10ab7fd:	49 89 c5             	mov    r13,rax
1935137- 10ab800:	4c 89 f7             	mov    rdi,r14
1935138- 10ab803:	e8 48 5f b6 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
1935139- 10ab808:	49 89 c7             	mov    r15,rax
1935140- 10ab80b:	4c 89 f7             	mov    rdi,r14
1935141- 10ab80e:	e8 67 5f b6 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
1935142- 10ab813:	48 89 04 24          	mov    QWORD PTR [rsp],rax
1935143- 10ab817:	4c 89 f7             	mov    rdi,r14
1935144- 10ab81a:	e8 07 5f b6 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
1935145- 10ab81f:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
1935146- 10ab824:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
1935147- 10ab828:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
1935148- 10ab82d:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
1935149- 10ab831:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
1935150- 10ab836:	48 8b 83 98 00 00 00 	mov    rax,QWORD PTR [rbx+0x98]
1935151- 10ab83d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1935152- 10ab842:	48 8b 6b 68          	mov    rbp,QWORD PTR [rbx+0x68]
1935153- 10ab846:	48 8d 35 0a 4a 2b ff 	lea    rsi,[rip+0xffffffffff2b4a0a]        # 360257 <_ZTSSt12bad_any_cast@@Base-0x2ff71>
1935154- 10ab84d:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
1935155- 10ab852:	4c 89 e7             	mov    rdi,r12
1935156- 10ab855:	e8 24 e2 9c ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
1935157- 10ab85a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
1935158- 10ab85e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
1935159- 10ab865:	00 
1935160- 10ab866:	48 89 ee             	mov    rsi,rbp
1935161- 10ab869:	4c 89 e2             	mov    rdx,r12
1935162- 10ab86c:	ff 50 18             	call   QWORD PTR [rax+0x18]
1935163- 10ab86f:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
1935164- 10ab873:	4c 89 ef             	mov    rdi,r13
1935165- 10ab876:	ff 50 28             	call   QWORD PTR [rax+0x28]
--
1935174- 10ab899:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
1935175- 10ab89e:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
1935176- 10ab8a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
1935177- 10ab8a5:	ff 50 30             	call   QWORD PTR [rax+0x30]
1935178- 10ab8a8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1935179- 10ab8ab:	48 89 c7             	mov    rdi,rax
1935180- 10ab8ae:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
1935181- 10ab8b4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
1935182- 10ab8b8:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
1935183- 10ab8bf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
1935184- 10ab8c4:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
1935185- 10ab8c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
1935186- 10ab8cc:	ff 50 40             	call   QWORD PTR [rax+0x40]
1935187- 10ab8cf:	48 89 c5             	mov    rbp,rax
1935188- 10ab8d2:	4c 89 f7             	mov    rdi,r14
1935189- 10ab8d5:	e8 b4 b3 c0 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
1935190- 10ab8da:	49 89 c7             	mov    r15,rax
1935191- 10ab8dd:	4c 89 f7             	mov    rdi,r14
1935192: 10ab8e0:	e8 bb 79 ab ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1935193- 10ab8e5:	49 89 c4             	mov    r12,rax
1935194- 10ab8e8:	4c 89 f7             	mov    rdi,r14
1935195- 10ab8eb:	e8 3e a4 ff ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
1935196- 10ab8f0:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1935197- 10ab8f3:	48 89 c7             	mov    rdi,rax
1935198- 10ab8f6:	ff 51 28             	call   QWORD PTR [rcx+0x28]
1935199- 10ab8f9:	49 89 c5             	mov    r13,rax
1935200- 10ab8fc:	4c 89 f7             	mov    rdi,r14
1935201- 10ab8ff:	e8 b8 a0 fc ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
1935202- 10ab904:	49 89 c6             	mov    r14,rax
1935203- 10ab907:	bf 80 00 00 00       	mov    edi,0x80
1935204- 10ab90c:	e8 ef 25 74 00       	call   17edf00 <_Znwm@plt>
1935205- 10ab911:	48 89 c3             	mov    rbx,rax
1935206- 10ab914:	49 83 c6 10          	add    r14,0x10
1935207- 10ab918:	48 8d 05 99 59 78 00 	lea    rax,[rip+0x785999]        # 18312b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3250>
1935208- 10ab91f:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]
1935209- 10ab926:	00 
1935210- 10ab927:	49 89 00             	mov    QWORD PTR [r8],rax
1935211- 10ab92a:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
1935212- 10ab92f:	49 89 40 08          	mov    QWORD PTR [r8+0x8],rax
1935213- 10ab933:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
1935214- 10ab937:	41 0f b6 47 11       	movzx  eax,BYTE PTR [r15+0x11]
1935215- 10ab93c:	48 89 df             	mov    rdi,rbx
1935216- 10ab93f:	48 8b 74 24 58       	mov    rsi,QWORD PTR [rsp+0x58]
1935217- 10ab944:	48 8b 54 24 50       	mov    rdx,QWORD PTR [rsp+0x50]
1935218- 10ab949:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
1935219- 10ab94e:	4c 8b 4c 24 48       	mov    r9,QWORD PTR [rsp+0x48]
1935220- 10ab953:	41 56                	push   r14
1935221- 10ab955:	41 55                	push   r13
1935222- 10ab957:	41 54                	push   r12
--
1959955- 10c157b:	5a                   	pop    rdx
1959956- 10c157c:	c3                   	ret
1959957- 10c157d:	cc                   	int3
1959958- 10c157e:	55                   	push   rbp
1959959- 10c157f:	41 57                	push   r15
1959960- 10c1581:	41 56                	push   r14
1959961- 10c1583:	41 55                	push   r13
1959962- 10c1585:	41 54                	push   r12
1959963- 10c1587:	53                   	push   rbx
1959964- 10c1588:	48 81 ec e8 02 00 00 	sub    rsp,0x2e8
1959965- 10c158f:	48 89 cb             	mov    rbx,rcx
1959966- 10c1592:	49 89 d6             	mov    r14,rdx
1959967- 10c1595:	48 89 fd             	mov    rbp,rdi
1959968- 10c1598:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1959969- 10c159f:	00 00 
1959970- 10c15a1:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
1959971- 10c15a8:	00 
1959972- 10c15a9:	48 89 cf             	mov    rdi,rcx
1959973: 10c15ac:	e8 ef 1c aa ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1959974- 10c15b1:	49 89 c7             	mov    r15,rax
1959975- 10c15b4:	48 89 df             	mov    rdi,rbx
1959976- 10c15b7:	e8 be 02 b5 ff       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
1959977- 10c15bc:	49 89 c4             	mov    r12,rax
1959978- 10c15bf:	48 89 df             	mov    rdi,rbx
1959979- 10c15c2:	e8 dd 02 b5 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
1959980- 10c15c7:	49 89 c5             	mov    r13,rax
1959981- 10c15ca:	48 89 df             	mov    rdi,rbx
1959982- 10c15cd:	e8 fc 01 b5 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
1959983- 10c15d2:	48 89 c3             	mov    rbx,rax
1959984- 10c15d5:	49 8b 07             	mov    rax,QWORD PTR [r15]
1959985- 10c15d8:	4c 89 ff             	mov    rdi,r15
1959986- 10c15db:	ff 50 28             	call   QWORD PTR [rax+0x28]
1959987- 10c15de:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
1959988- 10c15e3:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
1959989- 10c15e7:	4c 89 e7             	mov    rdi,r12
1959990- 10c15ea:	ff 50 30             	call   QWORD PTR [rax+0x30]
1959991- 10c15ed:	48 89 04 24          	mov    QWORD PTR [rsp],rax
1959992- 10c15f1:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
1959993- 10c15f5:	4c 8d 7c 24 70       	lea    r15,[rsp+0x70]
1959994- 10c15fa:	4c 89 ff             	mov    rdi,r15
1959995- 10c15fd:	4c 89 ee             	mov    rsi,r13
1959996- 10c1600:	ff 50 30             	call   QWORD PTR [rax+0x30]
1959997- 10c1603:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
1959998- 10c1606:	4d 8b 6e 30          	mov    r13,QWORD PTR [r14+0x30]
1959999- 10c160a:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
1960000- 10c160e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1960001- 10c1611:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
1960002- 10c1616:	ff 50 28             	call   QWORD PTR [rax+0x28]
1960003- 10c1619:	4c 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],r15
--
1976412- 10d0b1f:	41 55                	push   r13
1976413- 10d0b21:	41 54                	push   r12
1976414- 10d0b23:	53                   	push   rbx
1976415- 10d0b24:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
1976416- 10d0b2b:	48 89 cb             	mov    rbx,rcx
1976417- 10d0b2e:	49 89 d6             	mov    r14,rdx
1976418- 10d0b31:	48 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],rdi
1976419- 10d0b36:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1976420- 10d0b3d:	00 00 
1976421- 10d0b3f:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
1976422- 10d0b46:	00 
1976423- 10d0b47:	48 89 cf             	mov    rdi,rcx
1976424- 10d0b4a:	e8 01 0d b4 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
1976425- 10d0b4f:	48 89 c5             	mov    rbp,rax
1976426- 10d0b52:	48 89 df             	mov    rdi,rbx
1976427- 10d0b55:	e8 3a 74 ab ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
1976428- 10d0b5a:	49 89 c5             	mov    r13,rax
1976429- 10d0b5d:	48 89 df             	mov    rdi,rbx
1976430: 10d0b60:	e8 3b 27 a9 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
1976431- 10d0b65:	49 89 c4             	mov    r12,rax
1976432- 10d0b68:	48 89 df             	mov    rdi,rbx
1976433- 10d0b6b:	e8 ac 69 be ff       	call   cb751c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044bc>
1976434- 10d0b70:	49 89 c7             	mov    r15,rax
1976435- 10d0b73:	48 89 df             	mov    rdi,rbx
1976436- 10d0b76:	e8 ff 0c b4 ff       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
1976437- 10d0b7b:	48 89 c3             	mov    rbx,rax
1976438- 10d0b7e:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
1976439- 10d0b82:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
1976440- 10d0b89:	00 
1976441- 10d0b8a:	48 89 ee             	mov    rsi,rbp
1976442- 10d0b8d:	ff 50 28             	call   QWORD PTR [rax+0x28]
1976443- 10d0b90:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
1976444- 10d0b94:	4c 89 ef             	mov    rdi,r13
1976445- 10d0b97:	ff 50 28             	call   QWORD PTR [rax+0x28]
1976446- 10d0b9a:	48 89 c5             	mov    rbp,rax
1976447- 10d0b9d:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
1976448- 10d0ba1:	4c 89 ef             	mov    rdi,r13
1976449- 10d0ba4:	ff 50 30             	call   QWORD PTR [rax+0x30]
1976450- 10d0ba7:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
1976451- 10d0bac:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
1976452- 10d0bb0:	4c 89 e7             	mov    rdi,r12
1976453- 10d0bb3:	ff 50 28             	call   QWORD PTR [rax+0x28]
1976454- 10d0bb6:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
1976455- 10d0bbb:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
1976456- 10d0bbf:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
1976457- 10d0bc4:	4d 8b ae 80 00 00 00 	mov    r13,QWORD PTR [r14+0x80]
1976458- 10d0bcb:	4d 8b 66 68          	mov    r12,QWORD PTR [r14+0x68]
1976459- 10d0bcf:	48 8d 35 cd ce 2a ff 	lea    rsi,[rip+0xffffffffff2acecd]        # 37daa3 <_ZTSSt12bad_any_cast@@Base-0x12725>
1976460- 10d0bd6:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
--
2027516- 10fed33:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
2027517- 10fed37:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
2027518- 10fed3b:	ba a7 00 00 00       	mov    edx,0xa7
2027519- 10fed40:	e8 99 35 a6 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2027520- 10fed45:	49 8b 06             	mov    rax,QWORD PTR [r14]
2027521- 10fed48:	48 8b a8 38 05 00 00 	mov    rbp,QWORD PTR [rax+0x538]
2027522- 10fed4f:	48 85 ed             	test   rbp,rbp
2027523- 10fed52:	0f 84 95 01 00 00    	je     10feeed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6303>
2027524- 10fed58:	4c 89 f7             	mov    rdi,r14
2027525- 10fed5b:	e8 44 2b b1 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
2027526- 10fed60:	49 89 c5             	mov    r13,rax
2027527- 10fed63:	4c 89 f7             	mov    rdi,r14
2027528- 10fed66:	e8 e5 01 00 00       	call   10fef50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c6366>
2027529- 10fed6b:	49 89 c4             	mov    r12,rax
2027530- 10fed6e:	4c 89 f7             	mov    rdi,r14
2027531- 10fed71:	e8 da 29 b1 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
2027532- 10fed76:	48 89 c3             	mov    rbx,rax
2027533- 10fed79:	4c 89 f7             	mov    rdi,r14
2027534: 10fed7c:	e8 1f 45 a6 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2027535- 10fed81:	49 89 c6             	mov    r14,rax
2027536- 10fed84:	4c 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],r15
2027537- 10fed89:	49 8b 87 38 01 00 00 	mov    rax,QWORD PTR [r15+0x138]
2027538- 10fed90:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2027539- 10fed95:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
2027540- 10fed99:	48 89 ef             	mov    rdi,rbp
2027541- 10fed9c:	ff 50 28             	call   QWORD PTR [rax+0x28]
2027542- 10fed9f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2027543- 10feda4:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
2027544- 10feda8:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
2027545- 10fedad:	4c 89 ee             	mov    rsi,r13
2027546- 10fedb0:	ff 50 30             	call   QWORD PTR [rax+0x30]
2027547- 10fedb3:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2027548- 10fedb7:	4c 89 e7             	mov    rdi,r12
2027549- 10fedba:	ff 50 28             	call   QWORD PTR [rax+0x28]
2027550- 10fedbd:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2027551- 10fedc2:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2027552- 10fedc5:	48 89 df             	mov    rdi,rbx
2027553- 10fedc8:	ff 50 38             	call   QWORD PTR [rax+0x38]
2027554- 10fedcb:	49 89 c7             	mov    r15,rax
2027555- 10fedce:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2027556- 10fedd1:	48 89 df             	mov    rdi,rbx
2027557- 10fedd4:	ff 50 28             	call   QWORD PTR [rax+0x28]
2027558- 10fedd7:	48 89 c5             	mov    rbp,rax
2027559- 10fedda:	4c 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],r15
2027560- 10feddf:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
2027561- 10fede4:	48 8b 70 58          	mov    rsi,QWORD PTR [rax+0x58]
2027562- 10fede8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2027563- 10fedeb:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
2027564- 10fedf0:	ff 50 28             	call   QWORD PTR [rax+0x28]
--
2045773- 110f09f:	6a 03                	push   0x3
2045774- 110f0a1:	5a                   	pop    rdx
2045775- 110f0a2:	c3                   	ret
2045776- 110f0a3:	cc                   	int3
2045777- 110f0a4:	55                   	push   rbp
2045778- 110f0a5:	41 57                	push   r15
2045779- 110f0a7:	41 56                	push   r14
2045780- 110f0a9:	41 55                	push   r13
2045781- 110f0ab:	41 54                	push   r12
2045782- 110f0ad:	53                   	push   rbx
2045783- 110f0ae:	48 83 ec 58          	sub    rsp,0x58
2045784- 110f0b2:	48 89 cb             	mov    rbx,rcx
2045785- 110f0b5:	49 89 d6             	mov    r14,rdx
2045786- 110f0b8:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
2045787- 110f0bd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2045788- 110f0c4:	00 00 
2045789- 110f0c6:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2045790- 110f0cb:	48 89 cf             	mov    rdi,rcx
2045791: 110f0ce:	e8 cd 41 a5 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2045792- 110f0d3:	49 89 c5             	mov    r13,rax
2045793- 110f0d6:	48 89 df             	mov    rdi,rbx
2045794- 110f0d9:	e8 9c 27 b0 ff       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
2045795- 110f0de:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
2045796- 110f0e3:	48 89 df             	mov    rdi,rbx
2045797- 110f0e6:	e8 29 8f a7 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
2045798- 110f0eb:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2045799- 110f0f0:	49 8b 6e 30          	mov    rbp,QWORD PTR [r14+0x30]
2045800- 110f0f4:	6a 20                	push   0x20
2045801- 110f0f6:	5f                   	pop    rdi
2045802- 110f0f7:	e8 04 ee 6d 00       	call   17edf00 <_Znwm@plt>
2045803- 110f0fc:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
2045804- 110f100:	48 8d 0d b1 12 72 00 	lea    rcx,[rip+0x7212b1]        # 18303b8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x2350>
2045805- 110f107:	48 89 08             	mov    QWORD PTR [rax],rcx
2045806- 110f10a:	0f 57 c0             	xorps  xmm0,xmm0
2045807- 110f10d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
2045808- 110f112:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
2045809- 110f116:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
2045810- 110f11a:	48 8d 35 0f 99 2c ff 	lea    rsi,[rip+0xffffffffff2c990f]        # 3d8a30 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3615>
2045811- 110f121:	48 8d 0d 38 99 2c ff 	lea    rcx,[rip+0xffffffffff2c9938]        # 3d8a60 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3645>
2045812- 110f128:	6a 28                	push   0x28
2045813- 110f12a:	5b                   	pop    rbx
2045814- 110f12b:	6a 21                	push   0x21
2045815- 110f12d:	41 5e                	pop    r14
2045816- 110f12f:	48 89 da             	mov    rdx,rbx
2045817- 110f132:	4d 89 f0             	mov    r8,r14
2045818- 110f135:	45 31 c9             	xor    r9d,r9d
2045819- 110f138:	e8 21 84 4d 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
2045820- 110f13d:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
2045821- 110f141:	4c 8d 3d 48 99 2c ff 	lea    r15,[rip+0xffffffffff2c9948]        # 3d8a90 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3675>
--
2058046- 111a264:	55                   	push   rbp
2058047- 111a265:	41 57                	push   r15
2058048- 111a267:	41 56                	push   r14
2058049- 111a269:	41 55                	push   r13
2058050- 111a26b:	41 54                	push   r12
2058051- 111a26d:	53                   	push   rbx
2058052- 111a26e:	48 81 ec 68 09 00 00 	sub    rsp,0x968
2058053- 111a275:	48 89 cb             	mov    rbx,rcx
2058054- 111a278:	49 89 d5             	mov    r13,rdx
2058055- 111a27b:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
2058056- 111a280:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2058057- 111a287:	00 00 
2058058- 111a289:	48 89 84 24 60 09 00 	mov    QWORD PTR [rsp+0x960],rax
2058059- 111a290:	00 
2058060- 111a291:	48 89 cf             	mov    rdi,rcx
2058061- 111a294:	e8 fb dc a6 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
2058062- 111a299:	48 89 c5             	mov    rbp,rax
2058063- 111a29c:	48 89 df             	mov    rdi,rbx
2058064: 111a29f:	e8 fc 8f a4 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2058065- 111a2a4:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2058066- 111a2a9:	48 89 df             	mov    rdi,rbx
2058067- 111a2ac:	e8 f3 74 af ff       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
2058068- 111a2b1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2058069- 111a2b6:	48 89 df             	mov    rdi,rbx
2058070- 111a2b9:	e8 bc 74 af ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
2058071- 111a2be:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
2058072- 111a2c3:	48 89 df             	mov    rdi,rbx
2058073- 111a2c6:	e8 85 74 af ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
2058074- 111a2cb:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
2058075- 111a2d0:	48 89 df             	mov    rdi,rbx
2058076- 111a2d3:	e8 22 75 af ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
2058077- 111a2d8:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
2058078- 111a2df:	00 
2058079- 111a2e0:	48 89 df             	mov    rdi,rbx
2058080- 111a2e3:	e8 3e 74 af ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
2058081- 111a2e8:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
2058082- 111a2ed:	48 89 df             	mov    rdi,rbx
2058083- 111a2f0:	e8 d9 74 af ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
2058084- 111a2f5:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
2058085- 111a2fa:	48 89 df             	mov    rdi,rbx
2058086- 111a2fd:	e8 4e 48 f5 ff       	call   106eb50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235f66>
2058087- 111a302:	48 89 04 24          	mov    QWORD PTR [rsp],rax
2058088- 111a306:	48 89 df             	mov    rdi,rbx
2058089- 111a309:	e8 6c 75 af ff       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
2058090- 111a30e:	49 89 c4             	mov    r12,rax
2058091- 111a311:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
2058092- 111a315:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
2058093- 111a31a:	49 8b 85 80 00 00 00 	mov    rax,QWORD PTR [r13+0x80]
2058094- 111a321:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
--
2092839- 1139693:	41 55                	push   r13
2092840- 1139695:	41 54                	push   r12
2092841- 1139697:	53                   	push   rbx
2092842- 1139698:	48 83 ec 58          	sub    rsp,0x58
2092843- 113969c:	48 89 cb             	mov    rbx,rcx
2092844- 113969f:	49 89 d6             	mov    r14,rdx
2092845- 11396a2:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
2092846- 11396a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2092847- 11396ae:	00 00 
2092848- 11396b0:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2092849- 11396b5:	48 89 cf             	mov    rdi,rcx
2092850- 11396b8:	e8 3f 80 ad ff       	call   c116fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e69c>
2092851- 11396bd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
2092852- 11396c2:	4d 8b 7e 30          	mov    r15,QWORD PTR [r14+0x30]
2092853- 11396c6:	48 89 df             	mov    rdi,rbx
2092854- 11396c9:	e8 c6 e8 a4 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
2092855- 11396ce:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2092856- 11396d3:	48 89 df             	mov    rdi,rbx
2092857: 11396d6:	e8 c5 9b a2 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2092858- 11396db:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2092859- 11396e0:	48 89 df             	mov    rdi,rbx
2092860- 11396e3:	e8 92 81 ad ff       	call   c1187a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e81a>
2092861- 11396e8:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
2092862- 11396ed:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
2092863- 11396f1:	48 89 04 24          	mov    QWORD PTR [rsp],rax
2092864- 11396f5:	6a 18                	push   0x18
2092865- 11396f7:	5f                   	pop    rdi
2092866- 11396f8:	e8 03 48 6b 00       	call   17edf00 <_Znwm@plt>
2092867- 11396fd:	49 89 c4             	mov    r12,rax
2092868- 1139700:	49 89 c6             	mov    r14,rax
2092869- 1139703:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
2092870- 1139707:	4c 8d 2d ba 4c 6d 00 	lea    r13,[rip+0x6d4cba]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
2092871- 113970e:	4c 89 28             	mov    QWORD PTR [rax],r13
2092872- 1139711:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
2092873- 1139716:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
2092874- 1139719:	48 8d 35 20 f7 29 ff 	lea    rsi,[rip+0xffffffffff29f720]        # 3d8e40 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a25>
2092875- 1139720:	48 8d 0d 49 f7 29 ff 	lea    rcx,[rip+0xffffffffff29f749]        # 3d8e70 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a55>
2092876- 1139727:	6a 20                	push   0x20
2092877- 1139729:	5b                   	pop    rbx
2092878- 113972a:	6a 13                	push   0x13
2092879- 113972c:	5d                   	pop    rbp
2092880- 113972d:	48 89 da             	mov    rdx,rbx
2092881- 1139730:	49 89 e8             	mov    r8,rbp
2092882- 1139733:	45 31 c9             	xor    r9d,r9d
2092883- 1139736:	e8 23 de 4a 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
2092884- 113973b:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
2092885- 113973e:	48 8d 35 fb f6 29 ff 	lea    rsi,[rip+0xffffffffff29f6fb]        # 3d8e40 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a25>
2092886- 1139745:	48 89 da             	mov    rdx,rbx
2092887- 1139748:	48 8d 0d 21 f7 29 ff 	lea    rcx,[rip+0xffffffffff29f721]        # 3d8e70 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a55>
--
2107733- 1147560:	00 
2107734- 1147561:	ff 50 28             	call   QWORD PTR [rax+0x28]
2107735- 1147564:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2107736- 1147568:	4c 89 e7             	mov    rdi,r12
2107737- 114756b:	ff 50 38             	call   QWORD PTR [rax+0x38]
2107738- 114756e:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
2107739- 1147573:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2107740- 1147577:	4c 89 e7             	mov    rdi,r12
2107741- 114757a:	ff 50 28             	call   QWORD PTR [rax+0x28]
2107742- 114757d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
2107743- 1147582:	4c 89 f7             	mov    rdi,r14
2107744- 1147585:	e8 9a a2 ac ff       	call   c11824 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7c4>
2107745- 114758a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2107746- 114758d:	48 89 c7             	mov    rdi,rax
2107747- 1147590:	ff 51 28             	call   QWORD PTR [rcx+0x28]
2107748- 1147593:	49 89 c4             	mov    r12,rax
2107749- 1147596:	4c 8b 6d 20          	mov    r13,QWORD PTR [rbp+0x20]
2107750- 114759a:	4c 89 f7             	mov    rdi,r14
2107751: 114759d:	e8 fe bc a1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2107752- 11475a2:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2107753- 11475a5:	48 89 c7             	mov    rdi,rax
2107754- 11475a8:	ff 51 28             	call   QWORD PTR [rcx+0x28]
2107755- 11475ab:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
2107756- 11475b0:	4c 89 f7             	mov    rdi,r14
2107757- 11475b3:	e8 ec a1 ac ff       	call   c117a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e744>
2107758- 11475b8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2107759- 11475bb:	48 89 c7             	mov    rdi,rax
2107760- 11475be:	ff 51 28             	call   QWORD PTR [rcx+0x28]
2107761- 11475c1:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2107762- 11475c6:	4c 89 f7             	mov    rdi,r14
2107763- 11475c9:	e8 24 05 00 00       	call   1147af2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ef08>
2107764- 11475ce:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
2107765- 11475d2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2107766- 11475d7:	49 8b 07             	mov    rax,QWORD PTR [r15]
2107767- 11475da:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
2107768- 11475e1:	00 
2107769- 11475e2:	4c 89 fe             	mov    rsi,r15
2107770- 11475e5:	ff 50 30             	call   QWORD PTR [rax+0x30]
2107771- 11475e8:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
2107772- 11475ef:	00 
2107773- 11475f0:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
2107774- 11475f5:	4c 89 f7             	mov    rdi,r14
2107775- 11475f8:	e8 c5 76 c8 ff       	call   dcecc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9bd48>
2107776- 11475fd:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2107777- 1147600:	48 89 c7             	mov    rdi,rax
2107778- 1147603:	ff 51 28             	call   QWORD PTR [rcx+0x28]
2107779- 1147606:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
2107780- 114760b:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
2107781- 114760f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
--
2108207- 1147c6c:	e8 b5 9a ac ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
2108208- 1147c71:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
2108209- 1147c76:	49 8b 76 58          	mov    rsi,QWORD PTR [r14+0x58]
2108210- 1147c7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2108211- 1147c7d:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
2108212- 1147c84:	00 
2108213- 1147c85:	ff 50 28             	call   QWORD PTR [rax+0x28]
2108214- 1147c88:	4d 8b 66 60          	mov    r12,QWORD PTR [r14+0x60]
2108215- 1147c8c:	48 89 df             	mov    rdi,rbx
2108216- 1147c8f:	e8 90 9b ac ff       	call   c11824 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7c4>
2108217- 1147c94:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2108218- 1147c99:	48 89 df             	mov    rdi,rbx
2108219- 1147c9c:	e8 03 9c ac ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
2108220- 1147ca1:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
2108221- 1147ca6:	48 89 df             	mov    rdi,rbx
2108222- 1147ca9:	e8 38 fa f2 ff       	call   10776e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23eafc>
2108223- 1147cae:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
2108224- 1147cb3:	48 89 df             	mov    rdi,rbx
2108225: 1147cb6:	e8 e5 b5 a1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2108226- 1147cbb:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
2108227- 1147cc0:	48 89 df             	mov    rdi,rbx
2108228- 1147cc3:	e8 b2 9a ac ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
2108229- 1147cc8:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
2108230- 1147ccd:	48 89 df             	mov    rdi,rbx
2108231- 1147cd0:	e8 f9 9a ac ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
2108232- 1147cd5:	48 89 df             	mov    rdi,rbx
2108233- 1147cd8:	e8 73 6e f2 ff       	call   106eb50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235f66>
2108234- 1147cdd:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
2108235- 1147ce4:	00 
2108236- 1147ce5:	49 8b 5e 30          	mov    rbx,QWORD PTR [r14+0x30]
2108237- 1147ce9:	49 8b 6e 40          	mov    rbp,QWORD PTR [r14+0x40]
2108238- 1147ced:	bf f8 00 00 00       	mov    edi,0xf8
2108239- 1147cf2:	e8 09 62 6a 00       	call   17edf00 <_Znwm@plt>
2108240- 1147cf7:	49 89 c5             	mov    r13,rax
2108241- 1147cfa:	31 c0                	xor    eax,eax
2108242- 1147cfc:	41 88 45 08          	mov    BYTE PTR [r13+0x8],al
2108243- 1147d00:	48 8d 0d e9 d1 70 00 	lea    rcx,[rip+0x70d1e9]        # 1854ef0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x115d8>
2108244- 1147d07:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
2108245- 1147d0b:	49 8d 4d 10          	lea    rcx,[r13+0x10]
2108246- 1147d0f:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
2108247- 1147d14:	49 8d 4d 18          	lea    rcx,[r13+0x18]
2108248- 1147d18:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
2108249- 1147d1f:	00 
2108250- 1147d20:	49 8d 4d 20          	lea    rcx,[r13+0x20]
2108251- 1147d24:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
2108252- 1147d2b:	00 
2108253- 1147d2c:	49 8d 4d 28          	lea    rcx,[r13+0x28]
2108254- 1147d30:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
2108255- 1147d35:	49 8d 4d 30          	lea    rcx,[r13+0x30]
--
2155595- 11732b0:	48 8d 05 16 6d 26 ff 	lea    rax,[rip+0xffffffffff266d16]        # 3d9fcd <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4bb2>
2155596- 11732b7:	6a 02                	push   0x2
2155597- 11732b9:	5a                   	pop    rdx
2155598- 11732ba:	c3                   	ret
2155599- 11732bb:	cc                   	int3
2155600- 11732bc:	55                   	push   rbp
2155601- 11732bd:	41 57                	push   r15
2155602- 11732bf:	41 56                	push   r14
2155603- 11732c1:	41 55                	push   r13
2155604- 11732c3:	41 54                	push   r12
2155605- 11732c5:	53                   	push   rbx
2155606- 11732c6:	50                   	push   rax
2155607- 11732c7:	49 89 ce             	mov    r14,rcx
2155608- 11732ca:	48 89 fb             	mov    rbx,rdi
2155609- 11732cd:	48 8b aa 80 00 00 00 	mov    rbp,QWORD PTR [rdx+0x80]
2155610- 11732d4:	48 8b 82 38 01 00 00 	mov    rax,QWORD PTR [rdx+0x138]
2155611- 11732db:	48 89 04 24          	mov    QWORD PTR [rsp],rax
2155612- 11732df:	48 89 cf             	mov    rdi,rcx
2155613: 11732e2:	e8 b9 ff 9e ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2155614- 11732e7:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2155615- 11732ea:	48 89 c7             	mov    rdi,rax
2155616- 11732ed:	ff 51 28             	call   QWORD PTR [rcx+0x28]
2155617- 11732f0:	49 89 c4             	mov    r12,rax
2155618- 11732f3:	4c 89 f7             	mov    rdi,r14
2155619- 11732f6:	e8 f7 47 fd ff       	call   1147af2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30ef08>
2155620- 11732fb:	4c 8b 78 20          	mov    r15,QWORD PTR [rax+0x20]
2155621- 11732ff:	6a 40                	push   0x40
2155622- 1173301:	5f                   	pop    rdi
2155623- 1173302:	e8 f9 ab 67 00       	call   17edf00 <_Znwm@plt>
2155624- 1173307:	49 89 c6             	mov    r14,rax
2155625- 117330a:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
2155626- 117330e:	48 8d 05 d3 de 6f 00 	lea    rax,[rip+0x6fded3]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
2155627- 1173315:	49 89 06             	mov    QWORD PTR [r14],rax
2155628- 1173318:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
2155629- 117331d:	4d 8d 6e 10          	lea    r13,[r14+0x10]
2155630- 1173321:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
2155631- 1173326:	6a 18                	push   0x18
2155632- 1173328:	5f                   	pop    rdi
2155633- 1173329:	e8 d2 ab 67 00       	call   17edf00 <_Znwm@plt>
2155634- 117332e:	48 89 28             	mov    QWORD PTR [rax],rbp
2155635- 1173331:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
2155636- 1173335:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
2155637- 1173339:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
2155638- 117333d:	48 8d 05 ca ef 9e ff 	lea    rax,[rip+0xffffffffff9eefca]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
2155639- 1173344:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
2155640- 1173348:	48 8d 05 55 00 00 00 	lea    rax,[rip+0x55]        # 11733a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33a7ba>
2155641- 117334f:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
2155642- 1173353:	0f 57 c0             	xorps  xmm0,xmm0
2155643- 1173356:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
--
2155729- 117345a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
2155730- 1173461:	00 
2155731- 1173462:	ff 50 28             	call   QWORD PTR [rax+0x28]
2155732- 1173465:	49 8b 45 40          	mov    rax,QWORD PTR [r13+0x40]
2155733- 1173469:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
2155734- 117346e:	49 8b 45 60          	mov    rax,QWORD PTR [r13+0x60]
2155735- 1173472:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
2155736- 1173477:	49 8b 85 80 00 00 00 	mov    rax,QWORD PTR [r13+0x80]
2155737- 117347e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2155738- 1173483:	49 8b 45 68          	mov    rax,QWORD PTR [r13+0x68]
2155739- 1173487:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
2155740- 117348c:	48 89 df             	mov    rdi,rbx
2155741- 117348f:	e8 92 e2 a9 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
2155742- 1173494:	48 89 c5             	mov    rbp,rax
2155743- 1173497:	48 89 df             	mov    rdi,rbx
2155744- 117349a:	e8 47 42 f0 ff       	call   10776e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23eafc>
2155745- 117349f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2155746- 11734a4:	48 89 df             	mov    rdi,rbx
2155747: 11734a7:	e8 f4 fd 9e ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2155748- 11734ac:	49 89 c6             	mov    r14,rax
2155749- 11734af:	48 89 df             	mov    rdi,rbx
2155750- 11734b2:	e8 99 e3 a9 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
2155751- 11734b7:	49 89 c7             	mov    r15,rax
2155752- 11734ba:	4d 8b 65 30          	mov    r12,QWORD PTR [r13+0x30]
2155753- 11734be:	6a 48                	push   0x48
2155754- 11734c0:	5f                   	pop    rdi
2155755- 11734c1:	e8 3a aa 67 00       	call   17edf00 <_Znwm@plt>
2155756- 11734c6:	48 89 c3             	mov    rbx,rax
2155757- 11734c9:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
2155758- 11734ce:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
2155759- 11734d3:	4c 89 74 24 68       	mov    QWORD PTR [rsp+0x68],r14
2155760- 11734d8:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
2155761- 11734dc:	48 8d 05 85 37 6e 00 	lea    rax,[rip+0x6e3785]        # 1856c68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x13350>
2155762- 11734e3:	48 89 03             	mov    QWORD PTR [rbx],rax
2155763- 11734e6:	48 8d 43 10          	lea    rax,[rbx+0x10]
2155764- 11734ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
2155765- 11734ef:	48 8d 43 18          	lea    rax,[rbx+0x18]
2155766- 11734f3:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
2155767- 11734f8:	48 8d 43 20          	lea    rax,[rbx+0x20]
2155768- 11734fc:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2155769- 1173501:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
2155770- 1173505:	66 0f ef c0          	pxor   xmm0,xmm0
2155771- 1173509:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
2155772- 117350e:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
2155773- 1173513:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
2155774- 1173518:	e8 d9 64 66 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2155775- 117351d:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
2155776- 1173522:	48 83 c3 38          	add    rbx,0x38
2155777- 1173526:	48 89 5c 24 40       	mov    QWORD PTR [rsp+0x40],rbx
--
2292248- 11ee649:	e8 90 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2292249- 11ee64e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2292250- 11ee651:	48 8b 80 98 03 00 00 	mov    rax,QWORD PTR [rax+0x398]
2292251- 11ee658:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
2292252- 11ee65d:	48 85 c0             	test   rax,rax
2292253- 11ee660:	0f 84 b9 08 00 00    	je     11eef1f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344a3>
2292254- 11ee666:	48 89 df             	mov    rdi,rbx
2292255- 11ee669:	e8 36 32 a2 ff       	call   c118a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e844>
2292256- 11ee66e:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
2292257- 11ee675:	00 
2292258- 11ee676:	48 89 df             	mov    rdi,rbx
2292259- 11ee679:	e8 28 05 e8 ff       	call   106eba6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x235fbc>
2292260- 11ee67e:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
2292261- 11ee683:	48 89 df             	mov    rdi,rbx
2292262- 11ee686:	e8 15 4d a6 ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
2292263- 11ee68b:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
2292264- 11ee692:	00 
2292265- 11ee693:	48 89 df             	mov    rdi,rbx
2292266: 11ee696:	e8 05 4c 97 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2292267- 11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2292268- 11ee6a0:	48 89 df             	mov    rdi,rbx
2292269- 11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
2292270- 11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2292271- 11ee6ad:	48 89 df             	mov    rdi,rbx
2292272- 11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
2292273- 11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
2292274- 11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
2292275- 11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
2292276- 11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
2292277- 11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2292278- 11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2292279- 11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
2292280- 11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
2292281- 11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
2292282- 11ee6e0:	48 89 df             	mov    rdi,rbx
2292283- 11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
2292284- 11ee6e8:	49 89 c4             	mov    r12,rax
2292285- 11ee6eb:	48 89 df             	mov    rdi,rbx
2292286- 11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
2292287- 11ee6f3:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
2292288- 11ee6fa:	00 
2292289- 11ee6fb:	48 89 df             	mov    rdi,rbx
2292290- 11ee6fe:	e8 c7 6a bf ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
2292291- 11ee703:	48 89 c5             	mov    rbp,rax
2292292- 11ee706:	48 89 df             	mov    rdi,rbx
2292293- 11ee709:	e8 c0 30 a2 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
2292294- 11ee70e:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
2292295- 11ee715:	00 
2292296- 11ee716:	48 89 df             	mov    rdi,rbx
--
2681064- 13524bb:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
2681065- 13524c2:	00 
2681066- 13524c3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2681067- 13524ca:	00 00 
2681068- 13524cc:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
2681069- 13524d3:	00 
2681070- 13524d4:	48 89 cf             	mov    rdi,rcx
2681071- 13524d7:	e8 a2 3a 83 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
2681072- 13524dc:	49 89 c4             	mov    r12,rax
2681073- 13524df:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
2681074- 13524e3:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]
2681075- 13524e7:	ba 89 00 00 00       	mov    edx,0x89
2681076- 13524ec:	e8 ed fd 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2681077- 13524f1:	49 8b 06             	mov    rax,QWORD PTR [r14]
2681078- 13524f4:	4c 8b a8 48 04 00 00 	mov    r13,QWORD PTR [rax+0x448]
2681079- 13524fb:	4d 85 ed             	test   r13,r13
2681080- 13524fe:	0f 84 ee 0c 00 00    	je     13531f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198776>
2681081- 1352504:	4c 89 f7             	mov    rdi,r14
2681082: 1352507:	e8 94 0d 81 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2681083- 135250c:	49 89 c7             	mov    r15,rax
2681084- 135250f:	4c 89 f7             	mov    rdi,r14
2681085- 1352512:	e8 77 47 96 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
2681086- 1352517:	8a 88 88 00 00 00    	mov    cl,BYTE PTR [rax+0x88]
2681087- 135251d:	88 4c 24 28          	mov    BYTE PTR [rsp+0x28],cl
2681088- 1352521:	8a 88 89 00 00 00    	mov    cl,BYTE PTR [rax+0x89]
2681089- 1352527:	88 4c 24 0f          	mov    BYTE PTR [rsp+0xf],cl
2681090- 135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
2681091- 1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
2681092- 1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
2681093- 1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
2681094- 135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
2681095- 1352541:	4c 89 e7             	mov    rdi,r12
2681096- 1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
2681097- 1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
2681098- 135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
2681099- 1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
2681100- 1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2681101- 135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
2681102- 1352560:	4c 89 ff             	mov    rdi,r15
2681103- 1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
2681104- 1352566:	49 89 c7             	mov    r15,rax
2681105- 1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
2681106- 135256d:	6a 60                	push   0x60
2681107- 135256f:	5f                   	pop    rdi
2681108- 1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
2681109- 1352575:	48 89 c3             	mov    rbx,rax
2681110- 1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
2681111- 135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
2681112- 1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
--
2690249- 135a74d:	41 57                	push   r15
2690250- 135a74f:	41 56                	push   r14
2690251- 135a751:	41 55                	push   r13
2690252- 135a753:	41 54                	push   r12
2690253- 135a755:	53                   	push   rbx
2690254- 135a756:	48 81 ec 18 0d 00 00 	sub    rsp,0xd18
2690255- 135a75d:	48 89 cb             	mov    rbx,rcx
2690256- 135a760:	49 89 d4             	mov    r12,rdx
2690257- 135a763:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
2690258- 135a76a:	00 
2690259- 135a76b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2690260- 135a772:	00 00 
2690261- 135a774:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
2690262- 135a77b:	00 
2690263- 135a77c:	48 89 cf             	mov    rdi,rcx
2690264- 135a77f:	e8 fa b7 82 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
2690265- 135a784:	49 89 c6             	mov    r14,rax
2690266- 135a787:	48 89 df             	mov    rdi,rbx
2690267: 135a78a:	e8 11 8b 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2690268- 135a78f:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
2690269- 135a794:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
2690270- 135a799:	4d 8b 7c 24 68       	mov    r15,QWORD PTR [r12+0x68]
2690271- 135a79e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2690272- 135a7a1:	48 89 c7             	mov    rdi,rax
2690273- 135a7a4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
2690274- 135a7a7:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
2690275- 135a7ac:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
2690276- 135a7b1:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
2690277- 135a7b6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
2690278- 135a7bd:	00 
2690279- 135a7be:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
2690280- 135a7c5:	00 
2690281- 135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
2690282- 135a7cd:	00 
2690283- 135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
2690284- 135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
2690285- 135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
2690286- 135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
2690287- 135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
2690288- 135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
2690289- 135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
2690290- 135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
2690291- 135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
2690292- 135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
2690293- 135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
2690294- 135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
2690295- 135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
2690296- 135a80e:	00 
2690297- 135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
--
2692453- 135c913:	4c 89 ff             	mov    rdi,r15
2692454- 135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
2692455- 135c91b:	49 89 c5             	mov    r13,rax
2692456- 135c91e:	4c 89 ff             	mov    rdi,r15
2692457- 135c921:	e8 e6 4b 83 ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
2692458- 135c926:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
2692459- 135c92d:	00 
2692460- 135c92e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
2692461- 135c932:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
2692462- 135c936:	ba b7 00 00 00       	mov    edx,0xb7
2692463- 135c93b:	e8 9e 59 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2692464- 135c940:	49 8b 07             	mov    rax,QWORD PTR [r15]
2692465- 135c943:	48 8b 80 b8 05 00 00 	mov    rax,QWORD PTR [rax+0x5b8]
2692466- 135c94a:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
2692467- 135c951:	00 
2692468- 135c952:	48 85 c0             	test   rax,rax
2692469- 135c955:	0f 84 f4 05 00 00    	je     135cf4f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a24d3>
2692470- 135c95b:	4c 89 ff             	mov    rdi,r15
2692471: 135c95e:	e8 3d 69 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2692472- 135c963:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
2692473- 135c96a:	00 
2692474- 135c96b:	4c 89 ff             	mov    rdi,r15
2692475- 135c96e:	e8 07 4e 8b ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
2692476- 135c973:	48 89 c3             	mov    rbx,rax
2692477- 135c976:	4c 89 ff             	mov    rdi,r15
2692478- 135c979:	e8 74 ab 95 ff       	call   cb74f2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204492>
2692479- 135c97e:	49 89 c6             	mov    r14,rax
2692480- 135c981:	4c 89 ff             	mov    rdi,r15
2692481- 135c984:	e8 bf ab 95 ff       	call   cb7548 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044e8>
2692482- 135c989:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
2692483- 135c990:	00 
2692484- 135c991:	4c 89 ff             	mov    rdi,r15
2692485- 135c994:	e8 9d a3 95 ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
2692486- 135c999:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
2692487- 135c9a0:	00 
2692488- 135c9a1:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
2692489- 135c9a5:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
2692490- 135c9a9:	31 d2                	xor    edx,edx
2692491- 135c9ab:	e8 2e 59 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2692492- 135c9b0:	49 8b 07             	mov    rax,QWORD PTR [r15]
2692493- 135c9b3:	48 8b 00             	mov    rax,QWORD PTR [rax]
2692494- 135c9b6:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
2692495- 135c9bd:	00 
2692496- 135c9be:	48 85 c0             	test   rax,rax
2692497- 135c9c1:	0f 84 8d 05 00 00    	je     135cf54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a24d8>
2692498- 135c9c7:	4c 89 ff             	mov    rdi,r15
2692499- 135c9ca:	e8 45 b6 82 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
2692500- 135c9cf:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
2692501- 135c9d6:	00 

## Direct callers of b632ca
452790-  b623b1:	41 55                	push   r13
452791-  b623b3:	41 54                	push   r12
452792-  b623b5:	53                   	push   rbx
452793-  b623b6:	48 81 ec 88 01 00 00 	sub    rsp,0x188
452794-  b623bd:	49 89 ce             	mov    r14,rcx
452795-  b623c0:	48 89 d3             	mov    rbx,rdx
452796-  b623c3:	48 89 fd             	mov    rbp,rdi
452797-  b623c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
452798-  b623cd:	00 00 
452799-  b623cf:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
452800-  b623d6:	00 
452801-  b623d7:	48 89 cf             	mov    rdi,rcx
452802-  b623da:	e8 95 0e 00 00       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
452803-  b623df:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
452804-  b623e4:	4c 89 f7             	mov    rdi,r14
452805-  b623e7:	e8 b4 0e 00 00       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
452806-  b623ec:	49 89 c7             	mov    r15,rax
452807-  b623ef:	4c 89 f7             	mov    rdi,r14
452808:  b623f2:	e8 d3 0e 00 00       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
452809-  b623f7:	49 89 c6             	mov    r14,rax
452810-  b623fa:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
452811-  b62401:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
452812-  b62406:	4c 8b 63 68          	mov    r12,QWORD PTR [rbx+0x68]
452813-  b6240a:	48 8d 35 9c cb 7f ff 	lea    rsi,[rip+0xffffffffff7fcb9c]        # 35efad <_ZTSSt12bad_any_cast@@Base-0x3121b>
452814-  b62411:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]
452815-  b62416:	4c 89 ef             	mov    rdi,r13
452816-  b62419:	e8 60 76 f1 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
452817-  b6241e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
452818-  b62422:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
452819-  b62429:	00 
452820-  b6242a:	4c 89 e6             	mov    rsi,r12
452821-  b6242d:	4c 89 ea             	mov    rdx,r13
452822-  b62430:	ff 50 18             	call   QWORD PTR [rax+0x18]
452823-  b62433:	49 8b 07             	mov    rax,QWORD PTR [r15]
452824-  b62436:	4c 89 ff             	mov    rdi,r15
452825-  b62439:	ff 50 28             	call   QWORD PTR [rax+0x28]
452826-  b6243c:	49 89 c7             	mov    r15,rax
452827-  b6243f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
452828-  b62443:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
452829-  b62448:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
452830-  b6244c:	49 8b 06             	mov    rax,QWORD PTR [r14]
452831-  b6244f:	4c 89 f7             	mov    rdi,r14
452832-  b62452:	ff 50 40             	call   QWORD PTR [rax+0x40]
452833-  b62455:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
452834-  b6245a:	6a 28                	push   0x28
452835-  b6245c:	5f                   	pop    rdi
452836-  b6245d:	e8 9e ba c8 00       	call   17edf00 <_Znwm@plt>
452837-  b62462:	31 d2                	xor    edx,edx
452838-  b62464:	88 50 08             	mov    BYTE PTR [rax+0x8],dl
--
505601-  b9218f:	6a 01                	push   0x1
505602-  b92191:	5a                   	pop    rdx
505603-  b92192:	c3                   	ret
505604-  b92193:	cc                   	int3
505605-  b92194:	55                   	push   rbp
505606-  b92195:	41 57                	push   r15
505607-  b92197:	41 56                	push   r14
505608-  b92199:	41 55                	push   r13
505609-  b9219b:	41 54                	push   r12
505610-  b9219d:	53                   	push   rbx
505611-  b9219e:	48 81 ec 48 02 00 00 	sub    rsp,0x248
505612-  b921a5:	48 89 d3             	mov    rbx,rdx
505613-  b921a8:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
505614-  b921ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
505615-  b921b4:	00 00 
505616-  b921b6:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax
505617-  b921bd:	00 
505618-  b921be:	48 89 cf             	mov    rdi,rcx
505619:  b921c1:	e8 04 11 fd ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
505620-  b921c6:	49 89 c6             	mov    r14,rax
505621-  b921c9:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
505622-  b921cd:	48 8d 35 22 3d 7f ff 	lea    rsi,[rip+0xffffffffff7f3d22]        # 385ef6 <_ZTSSt12bad_any_cast@@Base-0xa2d2>
505623-  b921d4:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
505624-  b921d9:	4c 89 e7             	mov    rdi,r12
505625-  b921dc:	e8 9d 78 ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
505626-  b921e1:	49 8b 07             	mov    rax,QWORD PTR [r15]
505627-  b921e4:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
505628-  b921eb:	00 
505629-  b921ec:	4c 89 fe             	mov    rsi,r15
505630-  b921ef:	4c 89 e2             	mov    rdx,r12
505631-  b921f2:	ff 50 18             	call   QWORD PTR [rax+0x18]
505632-  b921f5:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
505633-  b921f9:	4c 8b bb 80 00 00 00 	mov    r15,QWORD PTR [rbx+0x80]
505634-  b92200:	48 8b 07             	mov    rax,QWORD PTR [rdi]
505635-  b92203:	ff 50 10             	call   QWORD PTR [rax+0x10]
505636-  b92206:	48 8b 08             	mov    rcx,QWORD PTR [rax]
505637-  b92209:	48 89 c7             	mov    rdi,rax
505638-  b9220c:	ff 51 28             	call   QWORD PTR [rcx+0x28]
505639-  b9220f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
505640-  b92214:	49 8b 06             	mov    rax,QWORD PTR [r14]
505641-  b92217:	4c 89 f7             	mov    rdi,r14
505642-  b9221a:	ff 50 48             	call   QWORD PTR [rax+0x48]
505643-  b9221d:	49 89 c6             	mov    r14,rax
505644-  b92220:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
505645-  b92224:	4c 8b 6b 40          	mov    r13,QWORD PTR [rbx+0x40]
505646-  b92228:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
505647-  b9222f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
505648-  b92232:	ff 50 18             	call   QWORD PTR [rax+0x18]
505649-  b92235:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
--
697390-  c42ee9:	5a                   	pop    rdx
697391-  c42eea:	c3                   	ret
697392-  c42eeb:	cc                   	int3
697393-  c42eec:	55                   	push   rbp
697394-  c42eed:	41 57                	push   r15
697395-  c42eef:	41 56                	push   r14
697396-  c42ef1:	41 55                	push   r13
697397-  c42ef3:	41 54                	push   r12
697398-  c42ef5:	53                   	push   rbx
697399-  c42ef6:	48 81 ec 78 01 00 00 	sub    rsp,0x178
697400-  c42efd:	49 89 ce             	mov    r14,rcx
697401-  c42f00:	48 89 d3             	mov    rbx,rdx
697402-  c42f03:	49 89 fd             	mov    r13,rdi
697403-  c42f06:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
697404-  c42f0d:	00 00 
697405-  c42f0f:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
697406-  c42f16:	00 
697407-  c42f17:	48 89 cf             	mov    rdi,rcx
697408:  c42f1a:	e8 ab 03 f2 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
697409-  c42f1f:	48 89 c5             	mov    rbp,rax
697410-  c42f22:	4c 89 f7             	mov    rdi,r14
697411-  c42f25:	e8 4a 03 f2 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
697412-  c42f2a:	49 89 c6             	mov    r14,rax
697413-  c42f2d:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
697414-  c42f34:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
697415-  c42f3b:	00 
697416-  c42f3c:	4c 8b 7b 68          	mov    r15,QWORD PTR [rbx+0x68]
697417-  c42f40:	48 8d 35 4a ee 6f ff 	lea    rsi,[rip+0xffffffffff6fee4a]        # 341d91 <_ZTSSt12bad_any_cast@@Base-0x4e437>
697418-  c42f47:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
697419-  c42f4e:	00 
697420-  c42f4f:	4c 89 e7             	mov    rdi,r12
697421-  c42f52:	e8 27 6b e3 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
697422-  c42f57:	49 8b 07             	mov    rax,QWORD PTR [r15]
697423-  c42f5a:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
697424-  c42f61:	00 
697425-  c42f62:	4c 89 fe             	mov    rsi,r15
697426-  c42f65:	4c 89 e2             	mov    rdx,r12
697427-  c42f68:	ff 50 18             	call   QWORD PTR [rax+0x18]
697428-  c42f6b:	49 8b 06             	mov    rax,QWORD PTR [r14]
697429-  c42f6e:	4c 89 f7             	mov    rdi,r14
697430-  c42f71:	ff 50 28             	call   QWORD PTR [rax+0x28]
697431-  c42f74:	49 89 c4             	mov    r12,rax
697432-  c42f77:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
697433-  c42f7b:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
697434-  c42f82:	00 
697435-  c42f83:	4c 8b bb 90 00 00 00 	mov    r15,QWORD PTR [rbx+0x90]
697436-  c42f8a:	48 8b 43 30          	mov    rax,QWORD PTR [rbx+0x30]
697437-  c42f8e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
697438-  c42f92:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
--
716000-  c53694:	55                   	push   rbp
716001-  c53695:	41 57                	push   r15
716002-  c53697:	41 56                	push   r14
716003-  c53699:	41 55                	push   r13
716004-  c5369b:	41 54                	push   r12
716005-  c5369d:	53                   	push   rbx
716006-  c5369e:	48 81 ec 88 00 00 00 	sub    rsp,0x88
716007-  c536a5:	49 89 cf             	mov    r15,rcx
716008-  c536a8:	48 89 d5             	mov    rbp,rdx
716009-  c536ab:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
716010-  c536af:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
716011-  c536b6:	00 00 
716012-  c536b8:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
716013-  c536bf:	00 
716014-  c536c0:	48 89 cf             	mov    rdi,rcx
716015-  c536c3:	e8 82 01 00 00       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
716016-  c536c8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
716017-  c536cd:	4c 89 ff             	mov    rdi,r15
716018:  c536d0:	e8 f5 fb f0 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
716019-  c536d5:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
716020-  c536da:	4c 89 ff             	mov    rdi,r15
716021-  c536dd:	e8 92 fb f0 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
716022-  c536e2:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
716023-  c536e7:	4c 89 ff             	mov    rdi,r15
716024-  c536ea:	e8 61 e0 fb ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
716025-  c536ef:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
716026-  c536f4:	4c 89 ff             	mov    rdi,r15
716027-  c536f7:	e8 78 01 00 00       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
716028-  c536fc:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
716029-  c53701:	4c 89 ff             	mov    rdi,r15
716030-  c53704:	e8 95 01 00 00       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
716031-  c53709:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
716032-  c5370e:	4c 89 ff             	mov    rdi,r15
716033-  c53711:	e8 8a fb f0 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
716034-  c53716:	49 89 c4             	mov    r12,rax
716035-  c53719:	48 8b 45 60          	mov    rax,QWORD PTR [rbp+0x60]
716036-  c5371d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
716037-  c53722:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
716038-  c53729:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
716039-  c5372e:	4c 8b 6d 40          	mov    r13,QWORD PTR [rbp+0x40]
716040-  c53732:	4c 8b b5 80 00 00 00 	mov    r14,QWORD PTR [rbp+0x80]
716041-  c53739:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
716042-  c5373d:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
716043-  c53742:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
716044-  c53746:	48 8b 07             	mov    rax,QWORD PTR [rdi]
716045-  c53749:	ff 50 10             	call   QWORD PTR [rax+0x10]
716046-  c5374c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
716047-  c5374f:	48 89 c7             	mov    rdi,rax
716048-  c53752:	ff 51 28             	call   QWORD PTR [rcx+0x28]
--
762030-  c7cc0b:	53                   	push   rbx
762031-  c7cc0c:	48 83 ec 58          	sub    rsp,0x58
762032-  c7cc10:	48 89 cb             	mov    rbx,rcx
762033-  c7cc13:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
762034-  c7cc18:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
762035-  c7cc1d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
762036-  c7cc24:	00 00 
762037-  c7cc26:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
762038-  c7cc2b:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
762039-  c7cc2f:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
762040-  c7cc33:	6a 2e                	push   0x2e
762041-  c7cc35:	5a                   	pop    rdx
762042-  c7cc36:	e8 a3 56 ee ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
762043-  c7cc3b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
762044-  c7cc3e:	4c 8b a0 70 01 00 00 	mov    r12,QWORD PTR [rax+0x170]
762045-  c7cc45:	4d 85 e4             	test   r12,r12
762046-  c7cc48:	0f 84 f7 00 00 00    	je     c7cd45 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9ce5>
762047-  c7cc4e:	48 89 df             	mov    rdi,rbx
762048:  c7cc51:	e8 74 66 ee ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
762049-  c7cc56:	48 89 c5             	mov    rbp,rax
762050-  c7cc59:	48 89 df             	mov    rdi,rbx
762051-  c7cc5c:	e8 13 6c fd ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
762052-  c7cc61:	49 89 c7             	mov    r15,rax
762053-  c7cc64:	48 89 df             	mov    rdi,rbx
762054-  c7cc67:	e8 32 6c fd ff       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
762055-  c7cc6c:	49 89 c6             	mov    r14,rax
762056-  c7cc6f:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
762057-  c7cc74:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
762058-  c7cc79:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
762059-  c7cc7d:	48 89 ef             	mov    rdi,rbp
762060-  c7cc80:	ff 50 48             	call   QWORD PTR [rax+0x48]
762061-  c7cc83:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
762062-  c7cc88:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
762063-  c7cc8c:	48 89 ef             	mov    rdi,rbp
762064-  c7cc8f:	ff 50 40             	call   QWORD PTR [rax+0x40]
762065-  c7cc92:	49 89 c5             	mov    r13,rax
762066-  c7cc95:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
762067-  c7cc99:	48 89 ef             	mov    rdi,rbp
762068-  c7cc9c:	ff 50 38             	call   QWORD PTR [rax+0x38]
762069-  c7cc9f:	48 89 c5             	mov    rbp,rax
762070-  c7cca2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
762071-  c7cca7:	48 8b 58 20          	mov    rbx,QWORD PTR [rax+0x20]
762072-  c7ccab:	49 8b 07             	mov    rax,QWORD PTR [r15]
762073-  c7ccae:	4c 8d 64 24 30       	lea    r12,[rsp+0x30]
762074-  c7ccb3:	4c 89 e7             	mov    rdi,r12
762075-  c7ccb6:	4c 89 fe             	mov    rsi,r15
762076-  c7ccb9:	ff 50 38             	call   QWORD PTR [rax+0x38]
762077-  c7ccbc:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
762078-  c7ccc0:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
--
762323-  c7d028:	c3                   	ret
762324-  c7d029:	cc                   	int3
762325-  c7d02a:	48 8d 05 65 f0 74 ff 	lea    rax,[rip+0xffffffffff74f065]        # 3cc096 <_ZTSN5boost9exceptionE@@Base+0x2ca78>
762326-  c7d031:	6a 01                	push   0x1
762327-  c7d033:	5a                   	pop    rdx
762328-  c7d034:	c3                   	ret
762329-  c7d035:	cc                   	int3
762330-  c7d036:	41 57                	push   r15
762331-  c7d038:	41 56                	push   r14
762332-  c7d03a:	41 55                	push   r13
762333-  c7d03c:	41 54                	push   r12
762334-  c7d03e:	53                   	push   rbx
762335-  c7d03f:	48 83 ec 50          	sub    rsp,0x50
762336-  c7d043:	49 89 fe             	mov    r14,rdi
762337-  c7d046:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
762338-  c7d04d:	00 00 
762339-  c7d04f:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
762340-  c7d054:	48 89 cf             	mov    rdi,rcx
762341:  c7d057:	e8 6e 62 ee ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
762342-  c7d05c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
762343-  c7d05f:	48 89 c7             	mov    rdi,rax
762344-  c7d062:	ff 51 48             	call   QWORD PTR [rcx+0x48]
762345-  c7d065:	49 89 c4             	mov    r12,rax
762346-  c7d068:	6a 20                	push   0x20
762347-  c7d06a:	5f                   	pop    rdi
762348-  c7d06b:	e8 90 0e b7 00       	call   17edf00 <_Znwm@plt>
762349-  c7d070:	48 89 c3             	mov    rbx,rax
762350-  c7d073:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
762351-  c7d077:	48 8d 05 82 e9 b9 00 	lea    rax,[rip+0xb9e982]        # 181ba00 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x116c0>
762352-  c7d07e:	48 89 03             	mov    QWORD PTR [rbx],rax
762353-  c7d081:	4c 8d 6c 24 10       	lea    r13,[rsp+0x10]
762354-  c7d086:	4c 89 ef             	mov    rdi,r13
762355-  c7d089:	e8 41 40 e3 ff       	call   ab10cf <JNI_OnUnload@@Base+0x3899c>
762356-  c7d08e:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
762357-  c7d092:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
762358-  c7d097:	49 89 37             	mov    QWORD PTR [r15],rsi
762359-  c7d09a:	48 8d 05 97 c8 b8 00 	lea    rax,[rip+0xb8c897]        # 1809938 <_ZTIN4asio22service_already_existsE@@Base+0xb120>
762360-  c7d0a1:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
762361-  c7d0a6:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
762362-  c7d0ab:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
762363-  c7d0b0:	48 89 e7             	mov    rdi,rsp
762364-  c7d0b3:	e8 a0 9b e2 ff       	call   aa6c58 <JNI_OnUnload@@Base+0x2e525>
762365-  c7d0b8:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
762366-  c7d0bc:	48 83 24 24 00       	and    QWORD PTR [rsp],0x0
762367-  c7d0c1:	48 89 df             	mov    rdi,rbx
762368-  c7d0c4:	48 83 c7 18          	add    rdi,0x18
762369-  c7d0c8:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
762370-  c7d0cd:	48 89 02             	mov    QWORD PTR [rdx],rax
762371-  c7d0d0:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
--
766175-  c80353:	6a 03                	push   0x3
766176-  c80355:	5a                   	pop    rdx
766177-  c80356:	c3                   	ret
766178-  c80357:	cc                   	int3
766179-  c80358:	55                   	push   rbp
766180-  c80359:	41 57                	push   r15
766181-  c8035b:	41 56                	push   r14
766182-  c8035d:	41 55                	push   r13
766183-  c8035f:	41 54                	push   r12
766184-  c80361:	53                   	push   rbx
766185-  c80362:	48 83 ec 58          	sub    rsp,0x58
766186-  c80366:	48 89 cb             	mov    rbx,rcx
766187-  c80369:	49 89 d6             	mov    r14,rdx
766188-  c8036c:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
766189-  c80371:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
766190-  c80378:	00 00 
766191-  c8037a:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
766192-  c8037f:	48 89 cf             	mov    rdi,rcx
766193:  c80382:	e8 43 2f ee ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
766194-  c80387:	48 89 c5             	mov    rbp,rax
766195-  c8038a:	48 89 df             	mov    rdi,rbx
766196-  c8038d:	e8 e2 34 fd ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
766197-  c80392:	49 89 c7             	mov    r15,rax
766198-  c80395:	48 89 df             	mov    rdi,rbx
766199-  c80398:	e8 01 35 fd ff       	call   c5389e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a083e>
766200-  c8039d:	49 89 c4             	mov    r12,rax
766201-  c803a0:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
766202-  c803a7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
766203-  c803ac:	49 8b 86 38 01 00 00 	mov    rax,QWORD PTR [r14+0x138]
766204-  c803b3:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
766205-  c803b8:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
766206-  c803bc:	48 89 ef             	mov    rdi,rbp
766207-  c803bf:	ff 50 40             	call   QWORD PTR [rax+0x40]
766208-  c803c2:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
766209-  c803c7:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
766210-  c803cb:	48 89 ef             	mov    rdi,rbp
766211-  c803ce:	ff 50 38             	call   QWORD PTR [rax+0x38]
766212-  c803d1:	48 89 c5             	mov    rbp,rax
766213-  c803d4:	49 8b 5e 20          	mov    rbx,QWORD PTR [r14+0x20]
766214-  c803d8:	49 8b 07             	mov    rax,QWORD PTR [r15]
766215-  c803db:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
766216-  c803e0:	4c 89 ef             	mov    rdi,r13
766217-  c803e3:	4c 89 fe             	mov    rsi,r15
766218-  c803e6:	ff 50 28             	call   QWORD PTR [rax+0x28]
766219-  c803e9:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
766220-  c803ed:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
766221-  c803f2:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
766222-  c803f6:	4c 89 e7             	mov    rdi,r12
766223-  c803f9:	ff 50 28             	call   QWORD PTR [rax+0x28]
--
827673-  cb6e5b:	41 57                	push   r15
827674-  cb6e5d:	41 56                	push   r14
827675-  cb6e5f:	41 55                	push   r13
827676-  cb6e61:	41 54                	push   r12
827677-  cb6e63:	53                   	push   rbx
827678-  cb6e64:	48 81 ec f8 02 00 00 	sub    rsp,0x2f8
827679-  cb6e6b:	48 89 cb             	mov    rbx,rcx
827680-  cb6e6e:	49 89 d5             	mov    r13,rdx
827681-  cb6e71:	48 89 bc 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rdi
827682-  cb6e78:	00 
827683-  cb6e79:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
827684-  cb6e80:	00 00 
827685-  cb6e82:	48 89 84 24 f0 02 00 	mov    QWORD PTR [rsp+0x2f0],rax
827686-  cb6e89:	00 
827687-  cb6e8a:	48 89 cf             	mov    rdi,rcx
827688-  cb6e8d:	e8 b8 c9 f9 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
827689-  cb6e92:	49 89 c6             	mov    r14,rax
827690-  cb6e95:	48 89 df             	mov    rdi,rbx
827691:  cb6e98:	e8 2d c4 ea ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
827692-  cb6e9d:	49 89 c4             	mov    r12,rax
827693-  cb6ea0:	48 89 df             	mov    rdi,rbx
827694-  cb6ea3:	e8 f4 05 00 00       	call   cb749c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20443c>
827695-  cb6ea8:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
827696-  cb6eaf:	00 
827697-  cb6eb0:	48 89 df             	mov    rdi,rbx
827698-  cb6eb3:	e8 98 a8 f5 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
827699-  cb6eb8:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
827700-  cb6ebf:	00 
827701-  cb6ec0:	48 89 df             	mov    rdi,rbx
827702-  cb6ec3:	e8 d8 c3 ea ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
827703-  cb6ec8:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
827704-  cb6ecf:	00 
827705-  cb6ed0:	48 89 df             	mov    rdi,rbx
827706-  cb6ed3:	e8 bc 10 ed ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
827707-  cb6ed8:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
827708-  cb6edf:	00 
827709-  cb6ee0:	48 89 df             	mov    rdi,rbx
827710-  cb6ee3:	e8 d6 10 ed ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
827711-  cb6ee8:	48 89 84 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rax
827712-  cb6eef:	00 
827713-  cb6ef0:	48 89 df             	mov    rdi,rbx
827714-  cb6ef3:	e8 7c c9 f9 ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
827715-  cb6ef8:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
827716-  cb6eff:	00 
827717-  cb6f00:	48 89 df             	mov    rdi,rbx
827718-  cb6f03:	e8 f0 f7 f8 ff       	call   c466f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x193698>
827719-  cb6f08:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
827720-  cb6f0f:	00 
827721-  cb6f10:	48 89 df             	mov    rdi,rbx
--
991730-  d4bfc2:	48 81 ec b8 01 00 00 	sub    rsp,0x1b8
991731-  d4bfc9:	48 89 cb             	mov    rbx,rcx
991732-  d4bfcc:	49 89 d5             	mov    r13,rdx
991733-  d4bfcf:	48 89 fd             	mov    rbp,rdi
991734-  d4bfd2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
991735-  d4bfd9:	00 00 
991736-  d4bfdb:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
991737-  d4bfe2:	00 
991738-  d4bfe3:	48 89 cf             	mov    rdi,rcx
991739-  d4bfe6:	e8 b5 72 e1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
991740-  d4bfeb:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
991741-  d4bff0:	48 89 df             	mov    rdi,rbx
991742-  d4bff3:	e8 9c bf e3 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
991743-  d4bff8:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
991744-  d4bffd:	48 89 df             	mov    rdi,rbx
991745-  d4c000:	e8 45 78 f0 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
991746-  d4c005:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
991747-  d4c00a:	48 89 df             	mov    rdi,rbx
991748:  d4c00d:	e8 b8 72 e1 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
991749-  d4c012:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
991750-  d4c019:	00 
991751-  d4c01a:	48 89 df             	mov    rdi,rbx
991752-  d4c01d:	e8 40 9c ef ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
991753-  d4c022:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
991754-  d4c029:	00 
991755-  d4c02a:	48 89 df             	mov    rdi,rbx
991756-  d4c02d:	e8 5a 9c ef ff       	call   c45c8c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c2c>
991757-  d4c032:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
991758-  d4c039:	00 
991759-  d4c03a:	48 89 df             	mov    rdi,rbx
991760-  d4c03d:	e8 32 72 e1 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
991761-  d4c042:	48 89 84 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rax
991762-  d4c049:	00 
991763-  d4c04a:	48 89 df             	mov    rdi,rbx
991764-  d4c04d:	e8 22 78 f0 ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
991765-  d4c052:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
991766-  d4c057:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
991767-  d4c05b:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
991768-  d4c05f:	6a 4c                	push   0x4c
991769-  d4c061:	5a                   	pop    rdx
991770-  d4c062:	e8 77 62 e1 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
991771-  d4c067:	48 8b 03             	mov    rax,QWORD PTR [rbx]
991772-  d4c06a:	4c 8b b0 60 02 00 00 	mov    r14,QWORD PTR [rax+0x260]
991773-  d4c071:	4d 85 f6             	test   r14,r14
991774-  d4c074:	0f 84 dd 03 00 00    	je     d4c457 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194dd>
991775-  d4c07a:	48 89 df             	mov    rdi,rbx
991776-  d4c07d:	e8 f8 56 ec ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
991777-  d4c082:	48 89 c3             	mov    rbx,rax
991778-  d4c085:	49 8b bd 98 00 00 00 	mov    rdi,QWORD PTR [r13+0x98]
--
2247926- 11c70ff:	48 89 cb             	mov    rbx,rcx
2247927- 11c7102:	49 89 d4             	mov    r12,rdx
2247928- 11c7105:	49 89 fe             	mov    r14,rdi
2247929- 11c7108:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2247930- 11c710f:	00 00 
2247931- 11c7111:	48 89 84 24 b0 03 00 	mov    QWORD PTR [rsp+0x3b0],rax
2247932- 11c7118:	00 
2247933- 11c7119:	48 8b 42 30          	mov    rax,QWORD PTR [rdx+0x30]
2247934- 11c711d:	48 8b 38             	mov    rdi,QWORD PTR [rax]
2247935- 11c7120:	48 8d 35 59 ec 26 ff 	lea    rsi,[rip+0xffffffffff26ec59]        # 435d80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7cf>
2247936- 11c7127:	48 8d 0d 66 ec 26 ff 	lea    rcx,[rip+0xffffffffff26ec66]        # 435d94 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b7e3>
2247937- 11c712e:	6a 13                	push   0x13
2247938- 11c7130:	5a                   	pop    rdx
2247939- 11c7131:	6a 0a                	push   0xa
2247940- 11c7133:	41 58                	pop    r8
2247941- 11c7135:	45 31 c9             	xor    r9d,r9d
2247942- 11c7138:	e8 21 04 42 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
2247943- 11c713d:	48 89 df             	mov    rdi,rbx
2247944: 11c7140:	e8 85 c1 99 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
2247945- 11c7145:	49 89 c7             	mov    r15,rax
2247946- 11c7148:	48 89 df             	mov    rdi,rbx
2247947- 11c714b:	e8 bc a3 9c ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
2247948- 11c7150:	49 89 c5             	mov    r13,rax
2247949- 11c7153:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
2247950- 11c7158:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
2247951- 11c715d:	49 8b 5c 24 60       	mov    rbx,QWORD PTR [r12+0x60]
2247952- 11c7162:	48 8d 35 be 6e 19 ff 	lea    rsi,[rip+0xffffffffff196ebe]        # 35e027 <_ZTSSt12bad_any_cast@@Base-0x321a1>
2247953- 11c7169:	48 8d bc 24 90 02 00 	lea    rdi,[rsp+0x290]
2247954- 11c7170:	00 
2247955- 11c7171:	e8 08 29 8b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2247956- 11c7176:	48 8d 2d ff ad 28 ff 	lea    rbp,[rip+0xffffffffff28adff]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
2247957- 11c717d:	48 8d bc 24 a0 01 00 	lea    rdi,[rsp+0x1a0]
2247958- 11c7184:	00 
2247959- 11c7185:	48 89 ee             	mov    rsi,rbp
2247960- 11c7188:	e8 f1 28 8b ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2247961- 11c718d:	4c 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],r15
2247962- 11c7192:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
2247963- 11c7197:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
2247964- 11c719a:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2247965- 11c71a1:	00 
2247966- 11c71a2:	48 8d 9c 24 90 02 00 	lea    rbx,[rsp+0x290]
2247967- 11c71a9:	00 
2247968- 11c71aa:	4c 8d b4 24 a0 01 00 	lea    r14,[rsp+0x1a0]
2247969- 11c71b1:	00 
2247970- 11c71b2:	48 89 da             	mov    rdx,rbx
2247971- 11c71b5:	4c 89 f1             	mov    rcx,r14
2247972- 11c71b8:	e8 33 be 44 00       	call   1612ff0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe15e>
2247973- 11c71bd:	4c 89 f7             	mov    rdi,r14
2247974- 11c71c0:	e8 cb 6c 62 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
--
2692416- 135c881:	53                   	push   rbx
2692417- 135c882:	48 81 ec 68 03 00 00 	sub    rsp,0x368
2692418- 135c889:	49 89 cf             	mov    r15,rcx
2692419- 135c88c:	48 89 d5             	mov    rbp,rdx
2692420- 135c88f:	48 89 bc 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rdi
2692421- 135c896:	00 
2692422- 135c897:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2692423- 135c89e:	00 00 
2692424- 135c8a0:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
2692425- 135c8a7:	00 
2692426- 135c8a8:	48 89 cf             	mov    rdi,rcx
2692427- 135c8ab:	e8 de a3 95 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
2692428- 135c8b0:	49 89 c4             	mov    r12,rax
2692429- 135c8b3:	4c 89 ff             	mov    rdi,r15
2692430- 135c8b6:	e8 8f 6f 8f ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
2692431- 135c8bb:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
2692432- 135c8c2:	00 
2692433- 135c8c3:	4c 89 ff             	mov    rdi,r15
2692434: 135c8c6:	e8 ff 69 80 ff       	call   b632ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb026a>
2692435- 135c8cb:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
2692436- 135c8d2:	00 
2692437- 135c8d3:	4c 89 ff             	mov    rdi,r15
2692438- 135c8d6:	e8 b9 b6 82 ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
2692439- 135c8db:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
2692440- 135c8e2:	00 
2692441- 135c8e3:	4c 89 ff             	mov    rdi,r15
2692442- 135c8e6:	e8 d3 b6 82 ff       	call   b87fbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f5e>
2692443- 135c8eb:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
2692444- 135c8f2:	00 
2692445- 135c8f3:	4c 89 ff             	mov    rdi,r15
2692446- 135c8f6:	e8 55 4e 8b ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
2692447- 135c8fb:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
2692448- 135c902:	00 
2692449- 135c903:	4c 89 ff             	mov    rdi,r15
2692450- 135c906:	e8 69 6f 8f ff       	call   c53874 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0814>
2692451- 135c90b:	48 89 84 24 98 01 00 	mov    QWORD PTR [rsp+0x198],rax
2692452- 135c912:	00 
2692453- 135c913:	4c 89 ff             	mov    rdi,r15
2692454- 135c916:	e8 ad ab 95 ff       	call   cb74c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x204468>
2692455- 135c91b:	49 89 c5             	mov    r13,rax
2692456- 135c91e:	4c 89 ff             	mov    rdi,r15
2692457- 135c921:	e8 e6 4b 83 ff       	call   b9150c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4ac>
2692458- 135c926:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
2692459- 135c92d:	00 
2692460- 135c92e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
2692461- 135c932:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]
2692462- 135c936:	ba b7 00 00 00       	mov    edx,0xb7
2692463- 135c93b:	e8 9e 59 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2692464- 135c940:	49 8b 07             	mov    rax,QWORD PTR [r15]

## Callers that invoke two or more facade helpers in one local window
