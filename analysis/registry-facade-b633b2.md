# Registry facade constructor b633b2

## Exact function

/tmp/regb633/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b633b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0352>:
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

## Wider helper family

/tmp/regb633/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b63000 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaffa0>:
  b63000:	74 17                	je     b63019 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaffb9>
  b63002:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b63009:	00 
  b6300a:	e8 21 3d f4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  b6300f:	b3 01                	mov    bl,0x1
  b63011:	45 89 ec             	mov    r12d,r13d
  b63014:	e9 2b fb ff ff       	jmp    b62b44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xafae4>
  b63019:	48 8d 35 f8 e9 7d ff 	lea    rsi,[rip+0xffffffffff7de9f8]        # 341a18 <_ZTSSt12bad_any_cast@@Base-0x4e7b0>
  b63020:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b63027:	00 
  b63028:	e8 22 88 f1 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  b6302d:	84 c0                	test   al,al
  b6302f:	74 14                	je     b63045 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaffe5>
  b63031:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b63038:	00 
  b63039:	e8 f2 3c f4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  b6303e:	6a 02                	push   0x2
  b63040:	e9 9a fa ff ff       	jmp    b62adf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xafa7f>
  b63045:	48 8d 35 ed 0b 7c ff 	lea    rsi,[rip+0xffffffffff7c0bed]        # 323c39 <_ZTSSt12bad_any_cast@@Base-0x6c58f>
  b6304c:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b63053:	00 
  b63054:	e8 f6 87 f1 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  b63059:	84 c0                	test   al,al
  b6305b:	0f 84 d4 fa ff ff    	je     b62b35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xafad5>
  b63061:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b63068:	00 
  b63069:	e8 c2 3c f4 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  b6306e:	6a 03                	push   0x3
  b63070:	e9 6a fa ff ff       	jmp    b62adf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xafa7f>
  b63075:	49 89 c4             	mov    r12,rax
  b63078:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b6307f:	00 
  b63080:	e8 e5 6e f1 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b63085:	e9 90 01 00 00       	jmp    b6321a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb01ba>
  b6308a:	eb 00                	jmp    b6308c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb002c>
  b6308c:	48 89 c7             	mov    rdi,rax
  b6308f:	e8 11 6a f1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b63094:	49 89 c4             	mov    r12,rax
  b63097:	48 8b bd e8 01 00 00 	mov    rdi,QWORD PTR [rbp+0x1e8]
  b6309e:	e8 e3 b3 f3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b630a3:	eb 03                	jmp    b630a8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0048>
  b630a5:	49 89 c4             	mov    r12,rax
  b630a8:	48 8d 85 a0 00 00 00 	lea    rax,[rbp+0xa0]
  b630af:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  b630b4:	48 8d 85 f0 00 00 00 	lea    rax,[rbp+0xf0]
  b630bb:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  b630c0:	48 8d 85 50 01 00 00 	lea    rax,[rbp+0x150]
  b630c7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  b630cc:	48 8d 85 78 01 00 00 	lea    rax,[rbp+0x178]
  b630d3:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  b630d8:	48 8d 9d a0 01 00 00 	lea    rbx,[rbp+0x1a0]
  b630df:	49 89 ed             	mov    r13,rbp
  b630e2:	49 81 c5 c8 00 00 00 	add    r13,0xc8
  b630e9:	48 8b bd d0 01 00 00 	mov    rdi,QWORD PTR [rbp+0x1d0]
  b630f0:	e8 6f 26 00 00       	call   b65764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2704>
  b630f5:	48 89 df             	mov    rdi,rbx
  b630f8:	e8 53 af c8 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b630fd:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b63102:	e8 63 26 00 00       	call   b6576a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb270a>
  b63107:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  b6310c:	e8 a3 26 00 00       	call   b657b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2754>
  b63111:	48 8b bd 40 01 00 00 	mov    rdi,QWORD PTR [rbp+0x140]
  b63118:	e8 e1 26 00 00       	call   b657fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb279e>
  b6311d:	48 8b bd 28 01 00 00 	mov    rdi,QWORD PTR [rbp+0x128]
  b63124:	e8 db 26 00 00       	call   b65804 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb27a4>
  b63129:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  b6312e:	e8 d7 26 00 00       	call   b6580a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb27aa>
  b63133:	4c 89 ef             	mov    rdi,r13
  b63136:	e8 09 27 00 00       	call   b65844 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb27e4>
  b6313b:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  b63140:	e8 0b af c8 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b63145:	4c 89 f7             	mov    rdi,r14
  b63148:	e8 f7 01 00 00       	call   b63344 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02e4>
  b6314d:	4c 89 ff             	mov    rdi,r15
  b63150:	e8 15 02 00 00       	call   b6336a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb030a>
  b63155:	48 89 ef             	mov    rdi,rbp
  b63158:	e8 c3 ad c8 00       	call   17edf20 <_ZdlPv@plt>
  b6315d:	eb 03                	jmp    b63162 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0102>
  b6315f:	49 89 c4             	mov    r12,rax
  b63162:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  b63169:	00 
  b6316a:	e8 d5 01 00 00       	call   b63344 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02e4>
  b6316f:	eb 4d                	jmp    b631be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb015e>
  b63171:	49 89 c4             	mov    r12,rax
  b63174:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  b6317b:	00 
  b6317c:	e8 c3 01 00 00       	call   b63344 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02e4>
  b63181:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
  b63188:	00 
  b63189:	e8 f8 b2 f3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
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
  b634bc:	0f 11 83 2c 01 00 00 	movups XMMWORD PTR [rbx+0x12c],xmm0
  b634c3:	83 a3 3c 01 00 00 00 	and    DWORD PTR [rbx+0x13c],0x0
  b634ca:	5b                   	pop    rbx
  b634cb:	c3                   	ret
  b634cc:	48 8d 05 a5 9a ca 00 	lea    rax,[rip+0xca9aa5]        # 180cf78 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2c38>
  b634d3:	48 89 07             	mov    QWORD PTR [rdi],rax
  b634d6:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
  b634da:	e9 a7 af f3 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  b634df:	cc                   	int3
  b634e0:	53                   	push   rbx
  b634e1:	48 89 fb             	mov    rbx,rdi
  b634e4:	e8 e3 ff ff ff       	call   b634cc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb046c>
  b634e9:	48 89 df             	mov    rdi,rbx
  b634ec:	5b                   	pop    rbx
  b634ed:	e9 2e aa c8 00       	jmp    17edf20 <_ZdlPv@plt>
  b634f2:	53                   	push   rbx
  b634f3:	48 89 fb             	mov    rbx,rdi
  b634f6:	6a 18                	push   0x18
  b634f8:	5f                   	pop    rdi
  b634f9:	e8 02 aa c8 00       	call   17edf00 <_Znwm@plt>
  b634fe:	48 8d 0d 73 9a ca 00 	lea    rcx,[rip+0xca9a73]        # 180cf78 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2c38>
  b63505:	48 89 08             	mov    QWORD PTR [rax],rcx
  b63508:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
  b6350c:	0f 10 43 08          	movups xmm0,XMMWORD PTR [rbx+0x8]
  b63510:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  b63514:	48 85 c9             	test   rcx,rcx
  b63517:	74 05                	je     b6351e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb04be>
  b63519:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  b6351e:	5b                   	pop    rbx
  b6351f:	c3                   	ret
  b63520:	48 8d 05 51 9a ca 00 	lea    rax,[rip+0xca9a51]        # 180cf78 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2c38>
  b63527:	48 89 06             	mov    QWORD PTR [rsi],rax
  b6352a:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  b6352e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  b63532:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
  b63536:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  b6353a:	48 85 c0             	test   rax,rax
  b6353d:	74 05                	je     b63544 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb04e4>
  b6353f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  b63544:	c3                   	ret
  b63545:	cc                   	int3
  b63546:	53                   	push   rbx
  b63547:	48 83 ec 20          	sub    rsp,0x20
  b6354b:	48 89 d0             	mov    rax,rdx
  b6354e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
  b63555:	00 00 
  b63557:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
  b6355c:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
  b6355f:	4c 8b 40 08          	mov    r8,QWORD PTR [rax+0x8]
  b63563:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]
  b63567:	4d 85 c0             	test   r8,r8
  b6356a:	74 2c                	je     b63598 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0538>
  b6356c:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  b6356f:	48 89 e3             	mov    rbx,rsp
  b63572:	48 89 df             	mov    rdi,rbx
  b63575:	e8 fa 0f 02 00       	call   b84574 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd1514>
  b6357a:	48 89 df             	mov    rdi,rbx
  b6357d:	e8                   	.byte 0xe8
  b6357e:	7a c0                	jp     b63540 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb04e0>

## Direct callers

## Calls into any point in this constructor/helper cluster
