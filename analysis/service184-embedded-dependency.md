# Service184 embedded execution dependency assignment

Known: candidate service +0x28 returns this+0x50; constructor assigns that member at 0x135bd71.

## b88146 temporary builder

/tmp/s184dep/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b880c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5060>:
  b880c0:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  b880c3:	48 85 c9             	test   rcx,rcx
  b880c6:	74 05                	je     b880cd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd506d>
  b880c8:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]
  b880cd:	c3                   	ret
  b880ce:	53                   	push   rbx
  b880cf:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  b880d2:	48 89 37             	mov    QWORD PTR [rdi],rsi
  b880d5:	48 85 db             	test   rbx,rbx
  b880d8:	74 1a                	je     b880f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5094>
  b880da:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  b880de:	e8 a3 63 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b880e3:	48 89 df             	mov    rdi,rbx
  b880e6:	e8 e9 1a c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b880eb:	48 89 df             	mov    rdi,rbx
  b880ee:	5b                   	pop    rbx
  b880ef:	e9 2c 5e c6 00       	jmp    17edf20 <_ZdlPv@plt>
  b880f4:	5b                   	pop    rbx
  b880f5:	c3                   	ret
  b880f6:	31 f6                	xor    esi,esi
  b880f8:	e9 d1 ff ff ff       	jmp    b880ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd506e>
  b880fd:	cc                   	int3
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
  b8818b:	cc                   	int3

## b8818c destination assignment

/tmp/s184dep/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b8818c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd512c>:
  b8818c:	41 57                	push   r15
  b8818e:	41 56                	push   r14
  b88190:	53                   	push   rbx
  b88191:	49 89 f6             	mov    r14,rsi
  b88194:	48 89 fb             	mov    rbx,rdi
  b88197:	e8 92 38 ef ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
  b8819c:	4c 8d 7b 20          	lea    r15,[rbx+0x20]
  b881a0:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
  b881a4:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
  b881a9:	4c 39 ff             	cmp    rdi,r15
  b881ac:	74 0a                	je     b881b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5158>
  b881ae:	48 85 ff             	test   rdi,rdi
  b881b1:	74 11                	je     b881c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5164>
  b881b3:	6a 05                	push   0x5
  b881b5:	58                   	pop    rax
  b881b6:	eb 06                	jmp    b881be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd515e>
  b881b8:	6a 04                	push   0x4
  b881ba:	58                   	pop    rax
  b881bb:	4c 89 ff             	mov    rdi,r15
  b881be:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  b881c1:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
  b881c4:	48 8d 4b 40          	lea    rcx,[rbx+0x40]
  b881c8:	49 8b 56 40          	mov    rdx,QWORD PTR [r14+0x40]
  b881cc:	48 85 d2             	test   rdx,rdx
  b881cf:	74 12                	je     b881e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5183>
  b881d1:	49 8d 76 20          	lea    rsi,[r14+0x20]
  b881d5:	49 8d 46 40          	lea    rax,[r14+0x40]
  b881d9:	48 39 f2             	cmp    rdx,rsi
  b881dc:	74 0e                	je     b881ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd518c>
  b881de:	48 89 11             	mov    QWORD PTR [rcx],rdx
  b881e1:	eb 03                	jmp    b881e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5186>
  b881e3:	48 89 c8             	mov    rax,rcx
  b881e6:	48 83 20 00          	and    QWORD PTR [rax],0x0
  b881ea:	eb 0f                	jmp    b881fb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd519b>
  b881ec:	4c 89 39             	mov    QWORD PTR [rcx],r15
  b881ef:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  b881f2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b881f5:	4c 89 fe             	mov    rsi,r15
  b881f8:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b881fb:	4c 8d 7b 50          	lea    r15,[rbx+0x50]
  b881ff:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
  b88203:	48 83 63 70 00       	and    QWORD PTR [rbx+0x70],0x0
  b88208:	4c 39 ff             	cmp    rdi,r15
  b8820b:	74 0a                	je     b88217 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd51b7>
  b8820d:	48 85 ff             	test   rdi,rdi
  b88210:	74 11                	je     b88223 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd51c3>
  b88212:	6a 05                	push   0x5
  b88214:	58                   	pop    rax
  b88215:	eb 06                	jmp    b8821d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd51bd>
  b88217:	6a 04                	push   0x4
  b88219:	58                   	pop    rax
  b8821a:	4c 89 ff             	mov    rdi,r15
  b8821d:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
  b88220:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
  b88223:	48 8d 43 70          	lea    rax,[rbx+0x70]
  b88227:	49 8b 4e 70          	mov    rcx,QWORD PTR [r14+0x70]
  b8822b:	48 85 c9             	test   rcx,rcx
  b8822e:	74 12                	je     b88242 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd51e2>
  b88230:	49 8d 56 50          	lea    rdx,[r14+0x50]
  b88234:	49 83 c6 70          	add    r14,0x70
  b88238:	48 39 d1             	cmp    rcx,rdx
  b8823b:	74 0e                	je     b8824b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd51eb>
  b8823d:	48 89 08             	mov    QWORD PTR [rax],rcx

## b8826e cleanup

/tmp/s184dep/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b88240 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd51e0>:
  b88240:	eb 03                	jmp    b88245 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd51e5>
  b88242:	49 89 c6             	mov    r14,rax
  b88245:	49 83 26 00          	and    QWORD PTR [r14],0x0
  b88249:	eb 0f                	jmp    b8825a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd51fa>
  b8824b:	4c 89 38             	mov    QWORD PTR [rax],r15
  b8824e:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  b88251:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  b88254:	4c 89 fe             	mov    rsi,r15
  b88257:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b8825a:	48 89 d8             	mov    rax,rbx
  b8825d:	5b                   	pop    rbx
  b8825e:	41 5e                	pop    r14
  b88260:	41 5f                	pop    r15
  b88262:	c3                   	ret
  b88263:	eb 00                	jmp    b88265 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd5205>
  b88265:	48 89 c7             	mov    rdi,rax
  b88268:	e8 38 18 ef ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b8826d:	cc                   	int3
  b8826e:	53                   	push   rbx
  b8826f:	48 89 fb             	mov    rbx,rdi
  b88272:	48 83 c7 50          	add    rdi,0x50
  b88276:	e8 ef 1c ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b8827b:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  b8827f:	e8 e6 1c ef ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b88284:	48 89 df             	mov    rdi,rbx
  b88287:	5b                   	pop    rbx
  b88288:	e9 03 5c c6 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8828d:	cc                   	int3
  b8828e:	53                   	push   rbx
  b8828f:	48 89 fb             	mov    rbx,rdi
  b88292:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
  b88296:	e8 eb 61 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8829b:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
  b8829f:	e8 e2 61 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b882a4:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  b882a8:	e8 d9 61 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b882ad:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  b882b1:	5b                   	pop    rbx
  b882b2:	e9 cf 61 f1 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
  b882b7:	cc                   	int3
  b882b8:	50                   	push   rax
  b882b9:	48 89 f8             	mov    rax,rdi
  b882bc:	48 8b 56 20          	mov    rdx,QWORD PTR [rsi+0x20]

## exact constructor callsite

/tmp/s184dep/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000135bd00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1284>:
 135bd00:	8b 4c 24 28          	mov    ecx,DWORD PTR [rsp+0x28]
 135bd04:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
 135bd08:	4c 89 68 38          	mov    QWORD PTR [rax+0x38],r13
 135bd0c:	4d 85 ed             	test   r13,r13
 135bd0f:	74 05                	je     135bd16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a129a>
 135bd11:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
 135bd16:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
 135bd1b:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
 135bd1f:	4c 89 70 48          	mov    QWORD PTR [rax+0x48],r14
 135bd23:	48 89 68 50          	mov    QWORD PTR [rax+0x50],rbp
 135bd27:	48 85 ed             	test   rbp,rbp
 135bd2a:	74 05                	je     135bd31 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a12b5>
 135bd2c:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
 135bd31:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]
 135bd38:	00 
 135bd39:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 135bd3d:	4c 8d a4 24 30 02 00 	lea    r12,[rsp+0x230]
 135bd44:	00 
 135bd45:	4c 8d bc 24 18 02 00 	lea    r15,[rsp+0x218]
 135bd4c:	00 
 135bd4d:	4c 8d ac 24 e0 01 00 	lea    r13,[rsp+0x1e0]
 135bd54:	00 
 135bd55:	4c 89 e7             	mov    rdi,r12
 135bd58:	4c 89 fe             	mov    rsi,r15
 135bd5b:	4c 89 ea             	mov    rdx,r13
 135bd5e:	48 89 d9             	mov    rcx,rbx
 135bd61:	e8 e0 c3 82 ff       	call   b88146 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd50e6>
 135bd66:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
 135bd6d:	00 
 135bd6e:	4c 89 e6             	mov    rsi,r12
 135bd71:	e8 16 c4 82 ff       	call   b8818c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd512c>
 135bd76:	4c 89 e7             	mov    rdi,r12
 135bd79:	e8 f0 c4 82 ff       	call   b8826e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd520e>
 135bd7e:	48 89 df             	mov    rdi,rbx
 135bd81:	e8 e4 e1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135bd86:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
 135bd8d:	00 
 135bd8e:	e8 a1 04 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
 135bd93:	4c 89 ef             	mov    rdi,r13
 135bd96:	e8 cf e1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 135bd9b:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
 135bda2:	00 
 135bda3:	e8 8c 04 00 00       	call   135c234 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a17b8>
 135bda8:	4c 89 ff             	mov    rdi,r15
 135bdab:	e8 e0 20 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>

## all vptr/table constants in b88100..b882c0

## direct callers of b88146/b8818c
