# Service184 embedded +0x578 candidate

## Producer region around 0x13394b7

/tmp/s184e/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000001339200 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e784>:
 1339200:	ff 47 08             	inc    DWORD PTR [rdi+0x8]
 1339203:	48 8d 7e 18          	lea    rdi,[rsi+0x18]
 1339207:	48 39 f9             	cmp    rcx,rdi
 133920a:	75 d2                	jne    13391de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e762>
 133920c:	4c 8d 34 30          	lea    r14,[rax+rsi*1]
 1339210:	49 83 c6 18          	add    r14,0x18
 1339214:	4c 89 b4 24 20 02 00 	mov    QWORD PTR [rsp+0x220],r14
 133921b:	00 
 133921c:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
 1339223:	00 
 1339224:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
 1339228:	e8 6d 07 00 00       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
 133922d:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
 1339232:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
 1339239:	00 
 133923a:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
 133923e:	e8 95 07 00 00       	call   13399d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef5c>
 1339243:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 1339247:	e8 28 fa ff ff       	call   1338c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1f8>
 133924c:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 1339251:	48 2b 44 24 70       	sub    rax,QWORD PTR [rsp+0x70]
 1339256:	6a 18                	push   0x18
 1339258:	59                   	pop    rcx
 1339259:	48 99                	cqo
 133925b:	48 f7 f9             	idiv   rcx
 133925e:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
 1339265:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
 133926a:	48 89 c6             	mov    rsi,rax
 133926d:	e8 72 07 00 00       	call   13399e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef68>
 1339272:	48 8d 83 68 05 00 00 	lea    rax,[rbx+0x568]
 1339279:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 133927e:	48 83 a3 68 05 00 00 	and    QWORD PTR [rbx+0x568],0x0
 1339285:	00 
 1339286:	4c 8d bc 24 98 00 00 	lea    r15,[rsp+0x98]
 133928d:	00 
 133928e:	0f 57 c0             	xorps  xmm0,xmm0
 1339291:	49 83 67 18 00       	and    QWORD PTR [r15+0x18],0x0
 1339296:	41 0f 29 47 08       	movaps XMMWORD PTR [r15+0x8],xmm0
 133929b:	41 0f 29 47 f8       	movaps XMMWORD PTR [r15-0x8],xmm0
 13392a0:	41 c7 47 20 00 00 80 	mov    DWORD PTR [r15+0x20],0x3f800000
 13392a7:	3f 
 13392a8:	48 8d bb 70 05 00 00 	lea    rdi,[rbx+0x570]
 13392af:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 13392b6:	00 
 13392b7:	e8 52 4f ee ff       	call   121e20e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63792>
 13392bc:	4c 89 ff             	mov    rdi,r15
 13392bf:	e8 a2 93 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 13392c4:	48 8d 05 a5 cc 52 00 	lea    rax,[rip+0x52cca5]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
 13392cb:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
 13392d2:	00 
 13392d3:	48 89 01             	mov    QWORD PTR [rcx],rax
 13392d6:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
 13392da:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
 13392de:	48 8b b3 48 04 00 00 	mov    rsi,QWORD PTR [rbx+0x448]
 13392e5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13392e8:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
 13392ef:	00 
 13392f0:	4c 89 ff             	mov    rdi,r15
 13392f3:	ff 50 18             	call   QWORD PTR [rax+0x18]
 13392f6:	41 8b 07             	mov    eax,DWORD PTR [r15]
 13392f9:	ff c8                	dec    eax
 13392fb:	8b 8b d0 01 00 00    	mov    ecx,DWORD PTR [rbx+0x1d0]
 1339301:	89 ca                	mov    edx,ecx
 1339303:	80 e2 ef             	and    dl,0xef
 1339306:	83 f8 fe             	cmp    eax,0xfffffffe
 1339309:	0f b6 ea             	movzx  ebp,dl
 133930c:	0f 43 e9             	cmovae ebp,ecx
 133930f:	41 f6 47 0c 01       	test   BYTE PTR [r15+0xc],0x1
 1339314:	0f 44 e9             	cmove  ebp,ecx
 1339317:	4c 8d bc 24 a8 00 00 	lea    r15,[rsp+0xa8]
 133931e:	00 
 133931f:	4c 89 ff             	mov    rdi,r15
 1339322:	e8 01 24 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1339327:	8a 83 61 03 00 00    	mov    al,BYTE PTR [rbx+0x361]
 133932d:	88 44 24 04          	mov    BYTE PTR [rsp+0x4],al
 1339331:	8a 83 60 03 00 00    	mov    al,BYTE PTR [rbx+0x360]
 1339337:	88 44 24 20          	mov    BYTE PTR [rsp+0x20],al
 133933b:	8a 83 63 03 00 00    	mov    al,BYTE PTR [rbx+0x363]
 1339341:	88 44 24 03          	mov    BYTE PTR [rsp+0x3],al
 1339345:	8a 83 41 02 00 00    	mov    al,BYTE PTR [rbx+0x241]
 133934b:	88 44 24 02          	mov    BYTE PTR [rsp+0x2],al
 133934f:	4c 8b 83 70 01 00 00 	mov    r8,QWORD PTR [rbx+0x170]
 1339356:	4c 8b 8b 78 01 00 00 	mov    r9,QWORD PTR [rbx+0x178]
 133935d:	4d 29 c1             	sub    r9,r8
 1339360:	49 c1 f9 02          	sar    r9,0x2
 1339364:	8b 83 70 02 00 00    	mov    eax,DWORD PTR [rbx+0x270]
 133936a:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax
 133936e:	8b 83 50 02 00 00    	mov    eax,DWORD PTR [rbx+0x250]
 1339374:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
 1339378:	48 8b 83 a0 05 00 00 	mov    rax,QWORD PTR [rbx+0x5a0]
 133937f:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 1339384:	48 8b 83 b0 05 00 00 	mov    rax,QWORD PTR [rbx+0x5b0]
 133938b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 1339390:	4c 8d 93 18 05 00 00 	lea    r10,[rbx+0x518]
 1339397:	31 ff                	xor    edi,edi
 1339399:	80 bb 38 05 00 00 00 	cmp    BYTE PTR [rbx+0x538],0x0
 13393a0:	4c 0f 44 d7          	cmove  r10,rdi
 13393a4:	80 bb 60 05 00 00 00 	cmp    BYTE PTR [rbx+0x560],0x0
 13393ab:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
 13393b2:	48 0f 44 c7          	cmove  rax,rdi
 13393b6:	40 8a b3 00 06 00 00 	mov    sil,BYTE PTR [rbx+0x600]
 13393bd:	0f 10 83 08 06 00 00 	movups xmm0,XMMWORD PTR [rbx+0x608]
 13393c4:	44 8a 9b 65 03 00 00 	mov    r11b,BYTE PTR [rbx+0x365]
 13393cb:	48 8b 93 40 04 00 00 	mov    rdx,QWORD PTR [rbx+0x440]
 13393d2:	4c 8b a3 48 04 00 00 	mov    r12,QWORD PTR [rbx+0x448]
 13393d9:	4c 8b ab d0 02 00 00 	mov    r13,QWORD PTR [rbx+0x2d0]
 13393e0:	48 8b 8b 28 01 00 00 	mov    rcx,QWORD PTR [rbx+0x128]
 13393e7:	48 8b bb 30 01 00 00 	mov    rdi,QWORD PTR [rbx+0x130]
 13393ee:	44 8a 74 24 04       	mov    r14b,BYTE PTR [rsp+0x4]
 13393f3:	45 88 77 e8          	mov    BYTE PTR [r15-0x18],r14b
 13393f7:	44 8a 74 24 20       	mov    r14b,BYTE PTR [rsp+0x20]
 13393fc:	45 88 77 e9          	mov    BYTE PTR [r15-0x17],r14b
 1339400:	44 8a 74 24 03       	mov    r14b,BYTE PTR [rsp+0x3]
 1339405:	45 88 77 ea          	mov    BYTE PTR [r15-0x16],r14b
 1339409:	44 8a 74 24 02       	mov    r14b,BYTE PTR [rsp+0x2]
 133940e:	45 88 77 eb          	mov    BYTE PTR [r15-0x15],r14b
 1339412:	4d 89 47 f0          	mov    QWORD PTR [r15-0x10],r8
 1339416:	4d 89 4f f8          	mov    QWORD PTR [r15-0x8],r9
 133941a:	44 8b 44 24 0c       	mov    r8d,DWORD PTR [rsp+0xc]
 133941f:	45 89 07             	mov    DWORD PTR [r15],r8d
 1339422:	44 8b 44 24 08       	mov    r8d,DWORD PTR [rsp+0x8]
 1339427:	45 89 47 04          	mov    DWORD PTR [r15+0x4],r8d
 133942b:	89 6c 24 04          	mov    DWORD PTR [rsp+0x4],ebp
 133942f:	41 88 6f 08          	mov    BYTE PTR [r15+0x8],bpl
 1339433:	4c 8b 44 24 50       	mov    r8,QWORD PTR [rsp+0x50]
 1339438:	4d 89 47 10          	mov    QWORD PTR [r15+0x10],r8
 133943c:	4c 8b 44 24 48       	mov    r8,QWORD PTR [rsp+0x48]
 1339441:	4d 89 47 18          	mov    QWORD PTR [r15+0x18],r8
 1339445:	49 89 57 20          	mov    QWORD PTR [r15+0x20],rdx
 1339449:	41 88 77 28          	mov    BYTE PTR [r15+0x28],sil
 133944d:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
 1339451:	4d 89 67 38          	mov    QWORD PTR [r15+0x38],r12
 1339455:	4d 89 6f 40          	mov    QWORD PTR [r15+0x40],r13
 1339459:	49 89 7f 48          	mov    QWORD PTR [r15+0x48],rdi
 133945d:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
 1339462:	45 88 5f 60          	mov    BYTE PTR [r15+0x60],r11b
 1339466:	48 8d 8b d8 04 00 00 	lea    rcx,[rbx+0x4d8]
 133946d:	49 89 4f 68          	mov    QWORD PTR [r15+0x68],rcx
 1339471:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
 1339478:	49 89 4f 70          	mov    QWORD PTR [r15+0x70],rcx
 133947c:	4d 89 57 78          	mov    QWORD PTR [r15+0x78],r10
 1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
 1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
 133948e:	00 
 133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
 1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
 133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
 13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
 13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
 13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
 13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
 13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
 13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
 13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
 13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
 13394e1:	00 
 13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
 13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
 13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
 13394f5:	48 85 c0             	test   rax,rax
 13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
 13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
 13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>
 1339500:	45 31 ed             	xor    r13d,r13d
 1339503:	44 8a bc 24 d0 00 00 	mov    r15b,BYTE PTR [rsp+0xd0]
 133950a:	00 
 133950b:	48 8b ac 24 c8 00 00 	mov    rbp,QWORD PTR [rsp+0xc8]
 1339512:	00 
 1339513:	4c 8b a4 24 d8 00 00 	mov    r12,QWORD PTR [rsp+0xd8]
 133951a:	00 
 133951b:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
 1339522:	00 
 1339523:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1339526:	0f 10 84 24 b8 00 00 	movups xmm0,XMMWORD PTR [rsp+0xb8]
 133952d:	00 
 133952e:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 1339533:	4c 8d b4 24 d8 01 00 	lea    r14,[rsp+0x1d8]
 133953a:	00 
 133953b:	4c 89 f7             	mov    rdi,r14
 133953e:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1339541:	41 8b 06             	mov    eax,DWORD PTR [r14]
 1339544:	ff c8                	dec    eax
 1339546:	83 f8 fe             	cmp    eax,0xfffffffe
 1339549:	0f 92 c0             	setb   al
 133954c:	41 22 46 0c          	and    al,BYTE PTR [r14+0xc]
 1339550:	48 8b 8c 24 e8 00 00 	mov    rcx,QWORD PTR [rsp+0xe8]
 1339557:	00 
 1339558:	48 8b 94 24 f8 00 00 	mov    rdx,QWORD PTR [rsp+0xf8]
 133955f:	00 
 1339560:	48 8b b4 24 48 01 00 	mov    rsi,QWORD PTR [rsp+0x148]
 1339567:	00 
 1339568:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
 133956f:	00 
 1339570:	44 8a 84 24 08 01 00 	mov    r8b,BYTE PTR [rsp+0x108]
 1339577:	00 
 1339578:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
 133957d:	f3 0f 11 84 24 58 01 	movss  DWORD PTR [rsp+0x158],xmm0
 1339584:	00 00 
 1339586:	0f 10 84 24 08 02 00 	movups xmm0,XMMWORD PTR [rsp+0x208]
 133958d:	00 
 133958e:	0f 11 84 24 5c 01 00 	movups XMMWORD PTR [rsp+0x15c],xmm0
 1339595:	00 
 1339596:	44 8b 8c 24 18 02 00 	mov    r9d,DWORD PTR [rsp+0x218]
 133959d:	00 
 133959e:	44 89 8c 24 6c 01 00 	mov    DWORD PTR [rsp+0x16c],r9d
 13395a5:	00 
 13395a6:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
 13395ab:	0f 13 84 24 70 01 00 	movlps QWORD PTR [rsp+0x170],xmm0
 13395b2:	00 
 13395b3:	44 8b 4c 24 04       	mov    r9d,DWORD PTR [rsp+0x4]
 13395b8:	44 88 8c 24 78 01 00 	mov    BYTE PTR [rsp+0x178],r9b
 13395bf:	00 
 13395c0:	44 88 ac 24 79 01 00 	mov    BYTE PTR [rsp+0x179],r13b
 13395c7:	00 
 13395c8:	44 88 bc 24 7a 01 00 	mov    BYTE PTR [rsp+0x17a],r15b
 13395cf:	00 
 13395d0:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
 13395d5:	0f 11 84 24 80 01 00 	movups XMMWORD PTR [rsp+0x180],xmm0
 13395dc:	00 
 13395dd:	48 89 ac 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rbp
 13395e4:	00 
 13395e5:	4c 89 a4 24 98 01 00 	mov    QWORD PTR [rsp+0x198],r12
 13395ec:	00 
 13395ed:	88 84 24 a0 01 00 00 	mov    BYTE PTR [rsp+0x1a0],al
 13395f4:	48 89 8c 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rcx
 13395fb:	00 
 13395fc:	48 89 94 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rdx
 1339603:	00 
 1339604:	48 89 b4 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rsi
 133960b:	00 
 133960c:	48 89 bc 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rdi
 1339613:	00 
 1339614:	44 88 84 24 c8 01 00 	mov    BYTE PTR [rsp+0x1c8],r8b
 133961b:	00 
 133961c:	48 83 a4 24 d0 01 00 	and    QWORD PTR [rsp+0x1d0],0x0
 1339623:	00 00 
 1339625:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
 133962c:	00 
 133962d:	e8 f6 20 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
 1339632:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
 1339637:	48 8b 44 24 78       	mov    rax,QWORD PTR [rsp+0x78]
 133963c:	48 29 e8             	sub    rax,rbp
 133963f:	48 99                	cqo
 1339641:	6a 18                	push   0x18
 1339643:	59                   	pop    rcx
 1339644:	48 f7 f9             	idiv   rcx
 1339647:	49 89 c4             	mov    r12,rax
 133964a:	80 bb 28 06 00 00 00 	cmp    BYTE PTR [rbx+0x628],0x0
 1339651:	74 20                	je     1339673 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ebf7>
 1339653:	48 8b 83 18 06 00 00 	mov    rax,QWORD PTR [rbx+0x618]
 133965a:	48 8b 8b 20 06 00 00 	mov    rcx,QWORD PTR [rbx+0x620]
 1339661:	49 29 c4             	sub    r12,rax
 1339664:	48 83 f9 ff          	cmp    rcx,0xffffffffffffffff
 1339668:	4c 0f 45 e1          	cmovne r12,rcx
 133966c:	48 6b c0 18          	imul   rax,rax,0x18
 1339670:	48 01 c5             	add    rbp,rax
 1339673:	48 8d b3 48 06 00 00 	lea    rsi,[rbx+0x648]
 133967a:	4c 8d b4 24 08 02 00 	lea    r14,[rsp+0x208]
 1339681:	00 
 1339682:	4c 89 f7             	mov    rdi,r14
 1339685:	e8 a6 1c 77 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
 133968a:	4d 8b 36             	mov    r14,QWORD PTR [r14]
 133968d:	4d 85 f6             	test   r14,r14
 1339690:	74 13                	je     13396a5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ec29>
 1339692:	49 8b 06             	mov    rax,QWORD PTR [r14]
 1339695:	48 8d 15 5c 15 5e 00 	lea    rdx,[rip+0x5e155c]        # 191abf8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62008>
 133969c:	6a 04                	push   0x4
 133969e:	5e                   	pop    rsi
 133969f:	4c 89 f7             	mov    rdi,r14
 13396a2:	ff 50 10             	call   QWORD PTR [rax+0x10]
 13396a5:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
 13396aa:	4d 85 e4             	test   r12,r12
 13396ad:	0f 84 99 01 00 00    	je     133984c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17edd0>
 13396b3:	4d 6b f4 18          	imul   r14,r12,0x18
 13396b7:	45 31 ff             	xor    r15d,r15d
 13396ba:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
 13396bf:	48 8d 05 1a d2 52 00 	lea    rax,[rip+0x52d21a]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
 13396c6:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 13396cb:	4a 8b 44 3d 10       	mov    rax,QWORD PTR [rbp+r15*1+0x10]
 13396d0:	42 0f 10 44 3d 08    	movups xmm0,XMMWORD PTR [rbp+r15*1+0x8]
 13396d6:	0f 11 44 24 60       	movups XMMWORD PTR [rsp+0x60],xmm0
 13396db:	48 85 c0             	test   rax,rax
 13396de:	74 05                	je     13396e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ec69>
 13396e0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 13396e5:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 13396ec:	00 
 13396ed:	4c 89 e6             	mov    rsi,r12
 13396f0:	e8 2b a6 00 00       	call   1343d20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1892a4>
 13396f5:	48 8b 8c 24 38 01 00 	mov    rcx,QWORD PTR [rsp+0x138]
 13396fc:	00 
 13396fd:	48                   	rex.W
 13396fe:	8b                   	.byte 0x8b
 13396ff:	94                   	xchg   esp,eax

## All accesses to +0x578 in 0x1320000..0x1350000
2646162: 1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
2652639: 13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
2653515: 133a070:	49 8d be 78 05 00 00 	lea    rdi,[r14+0x578]

## Context around writes to +0x578
1295847-  e62326:	e8 75 ad c5 ff       	call   abd0a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa040>
1295848-  e6232b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
1295849-  e62330:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
1295850-  e62335:	48 89 da             	mov    rdx,rbx
1295851-  e62338:	48 89 d9             	mov    rcx,rbx
1295852-  e6233b:	e8 60 ad c5 ff       	call   abd0a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa040>
1295853-  e62340:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
1295854-  e62345:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
1295855-  e6234a:	e8 6d a7 c5 ff       	call   abcabc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a5c>
1295856-  e6234f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
1295857-  e62354:	e8 2d c1 c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
1295858-  e62359:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
1295859-  e6235e:	e8 23 c1 c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
1295860-  e62363:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
1295861-  e62368:	e8 f7 a7 c5 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
1295862-  e6236d:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
1295863-  e62374:	00 
1295864-  e62375:	e8 ea a7 c5 ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
1295865-  e6237a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
1295866-  e6237f:	e8 02 c1 c3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
1295867-  e62384:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1295868-  e6238b:	00 00 
1295869-  e6238d:	48 3b 84 24 a8 00 00 	cmp    rax,QWORD PTR [rsp+0xa8]
--
1343223-  e8dafe:	00 
1343224-  e8daff:	50                   	push   rax
1343225-  e8db00:	48 8d 84 24 c8 05 00 	lea    rax,[rsp+0x5c8]
1343226-  e8db07:	00 
1343227-  e8db08:	50                   	push   rax
1343228-  e8db09:	48 8d 84 24 e0 05 00 	lea    rax,[rsp+0x5e0]
1343229-  e8db10:	00 
1343230-  e8db11:	50                   	push   rax
1343231-  e8db12:	48 8d 84 24 e0 08 00 	lea    rax,[rsp+0x8e0]
1343232-  e8db19:	00 
1343233-  e8db1a:	50                   	push   rax
1343234-  e8db1b:	ff b4 24 c0 02 00 00 	push   QWORD PTR [rsp+0x2c0]
1343235-  e8db22:	48 8d 84 24 60 04 00 	lea    rax,[rsp+0x460]
1343236-  e8db29:	00 
1343237-  e8db2a:	50                   	push   rax
1343238-  e8db2b:	ff b4 24 a8 01 00 00 	push   QWORD PTR [rsp+0x1a8]
1343239-  e8db32:	48 8d 84 24 40 06 00 	lea    rax,[rsp+0x640]
1343240-  e8db39:	00 
1343241-  e8db3a:	50                   	push   rax
1343242-  e8db3b:	ff b4 24 e0 01 00 00 	push   QWORD PTR [rsp+0x1e0]
1343243-  e8db42:	ff b4 24 18 03 00 00 	push   QWORD PTR [rsp+0x318]
1343244-  e8db49:	ff b4 24 08 03 00 00 	push   QWORD PTR [rsp+0x308]
1343245-  e8db50:	ff b4 24 00 02 00 00 	push   QWORD PTR [rsp+0x200]
1343246-  e8db57:	ff b4 24 18 02 00 00 	push   QWORD PTR [rsp+0x218]
1343247:  e8db5e:	48 8d 84 24 78 05 00 	lea    rax,[rsp+0x578]
1343248-  e8db65:	00 
1343249-  e8db66:	50                   	push   rax
1343250-  e8db67:	ff b4 24 b8 01 00 00 	push   QWORD PTR [rsp+0x1b8]
1343251-  e8db6e:	48 8d 84 24 a0 05 00 	lea    rax,[rsp+0x5a0]
1343252-  e8db75:	00 
1343253-  e8db76:	50                   	push   rax
1343254-  e8db77:	48 8d 84 24 38 07 00 	lea    rax,[rsp+0x738]
1343255-  e8db7e:	00 
1343256-  e8db7f:	50                   	push   rax
1343257-  e8db80:	ff b4 24 68 02 00 00 	push   QWORD PTR [rsp+0x268]
1343258-  e8db87:	41 53                	push   r11
1343259-  e8db89:	ff b4 24 40 03 00 00 	push   QWORD PTR [rsp+0x340]
1343260-  e8db90:	ff b4 24 10 02 00 00 	push   QWORD PTR [rsp+0x210]
1343261-  e8db97:	48 8d 84 24 80 06 00 	lea    rax,[rsp+0x680]
1343262-  e8db9e:	00 
1343263-  e8db9f:	50                   	push   rax
1343264-  e8dba0:	ff b4 24 d0 02 00 00 	push   QWORD PTR [rsp+0x2d0]
1343265-  e8dba7:	e8 24 1f 00 00       	call   e8fad0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56ee6>
1343266-  e8dbac:	48 81 c4 f0 01 00 00 	add    rsp,0x1f0
1343267-  e8dbb3:	48 8d 9c 24 40 06 00 	lea    rbx,[rsp+0x640]
1343268-  e8dbba:	00 
1343269-  e8dbbb:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
1343270-  e8dbc0:	48 89 de             	mov    rsi,rbx
1343271-  e8dbc3:	e8 54 bc c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
1343272-  e8dbc8:	49 8d 7e 28          	lea    rdi,[r14+0x28]
1343273-  e8dbcc:	4c 8d bc 24 50 06 00 	lea    r15,[rsp+0x650]
1343274-  e8dbd3:	00 
1343275-  e8dbd4:	4c 89 fe             	mov    rsi,r15
1343276-  e8dbd7:	e8 40 bc c2 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
1343277-  e8dbdc:	41 0f 10 47 10       	movups xmm0,XMMWORD PTR [r15+0x10]
1343278-  e8dbe1:	66 0f ef c9          	pxor   xmm1,xmm1
1343279-  e8dbe5:	f3 41 0f 7f 4f 10    	movdqu XMMWORD PTR [r15+0x10],xmm1
1343280-  e8dbeb:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
1343281-  e8dbef:	41 0f 11 46 38       	movups XMMWORD PTR [r14+0x38],xmm0
1343282-  e8dbf4:	e8 8d 08 c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
1343283-  e8dbf9:	41 0f 10 47 20       	movups xmm0,XMMWORD PTR [r15+0x20]
1343284-  e8dbfe:	66 0f ef c9          	pxor   xmm1,xmm1
1343285-  e8dc02:	f3 41 0f 7f 4f 20    	movdqu XMMWORD PTR [r15+0x20],xmm1
1343286-  e8dc08:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
1343287-  e8dc0c:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
--
1350325-  e949c0:	49 89 44 24 18       	mov    QWORD PTR [r12+0x18],rax
1350326-  e949c5:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
1350327-  e949cc:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
1350328-  e949d3:	00 
1350329-  e949d4:	49 89 5c 24 30       	mov    QWORD PTR [r12+0x30],rbx
1350330-  e949d9:	49 8b 45 28          	mov    rax,QWORD PTR [r13+0x28]
1350331-  e949dd:	48 8b 38             	mov    rdi,QWORD PTR [rax]
1350332-  e949e0:	66 0f 7f 84 24 20 03 	movdqa XMMWORD PTR [rsp+0x320],xmm0
1350333-  e949e7:	00 00 
1350334-  e949e9:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
1350335-  e949f0:	00 00 
1350336-  e949f2:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
1350337-  e949f9:	00 00 
1350338-  e949fb:	48 8d 35 90 f6 53 ff 	lea    rsi,[rip+0xffffffffff53f690]        # 3d4092 <_ZTSN5boost17bad_function_callE@@Base+0x13d8>
1350339-  e94a02:	48 8d 0d 97 f6 53 ff 	lea    rcx,[rip+0xffffffffff53f697]        # 3d40a0 <_ZTSN5boost17bad_function_callE@@Base+0x13e6>
1350340-  e94a09:	6a 0b                	push   0xb
1350341-  e94a0b:	5a                   	pop    rdx
1350342-  e94a0c:	6a 1e                	push   0x1e
1350343-  e94a0e:	41 58                	pop    r8
1350344-  e94a10:	45 31 c9             	xor    r9d,r9d
1350345-  e94a13:	e8 72 29 75 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
1350346-  e94a18:	89 c5                	mov    ebp,eax
1350347-  e94a1a:	84 c0                	test   al,al
1350348-  e94a1c:	74 68                	je     e94a86 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5be9c>
1350349:  e94a1e:	49 8b 9d 78 05 00 00 	mov    rbx,QWORD PTR [r13+0x578]
1350350-  e94a25:	6a 28                	push   0x28
1350351-  e94a27:	5f                   	pop    rdi
1350352-  e94a28:	e8 d3 94 95 00       	call   17edf00 <_Znwm@plt>
1350353-  e94a2d:	66 0f ef c0          	pxor   xmm0,xmm0
1350354-  e94a31:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
1350355-  e94a36:	48 8d 0d 2b 8a 96 00 	lea    rcx,[rip+0x968a2b]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
1350356-  e94a3d:	48 89 08             	mov    QWORD PTR [rax],rcx
1350357-  e94a40:	48 89 c1             	mov    rcx,rax
1350358-  e94a43:	48 83 c1 18          	add    rcx,0x18
1350359-  e94a47:	48 8d 15 f2 fb 9a 00 	lea    rdx,[rip+0x9afbf2]        # 1844640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xd28>
1350360-  e94a4e:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
1350361-  e94a52:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
1350362-  e94a56:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
1350363-  e94a5d:	00 
--
1977957- 10d2346:	00 
1977958- 10d2347:	74 0c                	je     10d2355 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29976b>
1977959- 10d2349:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
1977960- 10d234d:	48 8d 84 24 60 02 00 	lea    rax,[rsp+0x260]
1977961- 10d2354:	00 
1977962- 10d2355:	66 0f ef c0          	pxor   xmm0,xmm0
1977963- 10d2359:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
1977964- 10d235d:	48 8d bd 58 02 00 00 	lea    rdi,[rbp+0x258]
1977965- 10d2364:	4c 8d b4 24 50 04 00 	lea    r14,[rsp+0x450]
1977966- 10d236b:	00 
1977967- 10d236c:	48 8b 9c 24 80 00 00 	mov    rbx,QWORD PTR [rsp+0x80]
1977968- 10d2373:	00 
1977969- 10d2374:	49 89 1e             	mov    QWORD PTR [r14],rbx
1977970- 10d2377:	48 8d 05 e6 a0 9a ff 	lea    rax,[rip+0xffffffffff9aa0e6]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
1977971- 10d237e:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
1977972- 10d2382:	48 8d 05 1b 35 01 00 	lea    rax,[rip+0x1351b]        # 10e58a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2accba>
1977973- 10d2389:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
1977974- 10d238d:	4c 8d bc 24 f0 02 00 	lea    r15,[rsp+0x2f0]
1977975- 10d2394:	00 
1977976- 10d2395:	49 8b 77 d0          	mov    rsi,QWORD PTR [r15-0x30]
1977977- 10d2399:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
1977978- 10d239e:	4c 89 e2             	mov    rdx,r12
1977979- 10d23a1:	4c 89 f1             	mov    rcx,r14
1977980- 10d23a4:	45 31 c0             	xor    r8d,r8d
1977981- 10d23a7:	e8 ae 7a 27 00       	call   1349e5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f3de>
1977982- 10d23ac:	4c 89 f7             	mov    rdi,r14
1977983- 10d23af:	e8 ea 4e 9d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
1977984- 10d23b4:	4c 8d ad 60 02 00 00 	lea    r13,[rbp+0x260]
1977985- 10d23bb:	49 89 1e             	mov    QWORD PTR [r14],rbx
1977986- 10d23be:	48 8d 05 9f a0 9a ff 	lea    rax,[rip+0xffffffffff9aa09f]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
1977987- 10d23c5:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
1977988- 10d23c9:	48 8d 05 5a 3f 01 00 	lea    rax,[rip+0x13f5a]        # 10e632a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ad740>
1977989- 10d23d0:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
1977990- 10d23d4:	4d 89 fe             	mov    r14,r15
1977991- 10d23d7:	49 8b 77 d8          	mov    rsi,QWORD PTR [r15-0x28]
1977992- 10d23db:	48 8d 9c 24 50 04 00 	lea    rbx,[rsp+0x450]
--
1978097- 10d25ce:	00 
1978098- 10d25cf:	48 83 a5 38 04 00 00 	and    QWORD PTR [rbp+0x438],0x0
1978099- 10d25d6:	00 
1978100- 10d25d7:	f3 0f 7f 85 28 04 00 	movdqu XMMWORD PTR [rbp+0x428],xmm0
1978101- 10d25de:	00 
1978102- 10d25df:	48 89 85 40 04 00 00 	mov    QWORD PTR [rbp+0x440],rax
1978103- 10d25e6:	4c 8d bd 48 04 00 00 	lea    r15,[rbp+0x448]
1978104- 10d25ed:	48 63 84 24 a8 02 00 	movsxd rax,DWORD PTR [rsp+0x2a8]
1978105- 10d25f4:	00 
1978106- 10d25f5:	48 63 8c 24 b0 02 00 	movsxd rcx,DWORD PTR [rsp+0x2b0]
1978107- 10d25fc:	00 
1978108- 10d25fd:	8a 94 24 bc 02 00 00 	mov    dl,BYTE PTR [rsp+0x2bc]
1978109- 10d2604:	4c 89 b5 48 04 00 00 	mov    QWORD PTR [rbp+0x448],r14
1978110- 10d260b:	48 89 9d 50 04 00 00 	mov    QWORD PTR [rbp+0x450],rbx
1978111- 10d2612:	4c 89 a5 58 04 00 00 	mov    QWORD PTR [rbp+0x458],r12
1978112- 10d2619:	66 0f 7f 85 60 04 00 	movdqa XMMWORD PTR [rbp+0x460],xmm0
1978113- 10d2620:	00 
1978114- 10d2621:	66 0f 7f 85 70 04 00 	movdqa XMMWORD PTR [rbp+0x470],xmm0
1978115- 10d2628:	00 
1978116- 10d2629:	66 0f 7f 85 80 04 00 	movdqa XMMWORD PTR [rbp+0x480],xmm0
1978117- 10d2630:	00 
1978118- 10d2631:	48 89 85 90 04 00 00 	mov    QWORD PTR [rbp+0x490],rax
1978119- 10d2638:	48 89 8d 98 04 00 00 	mov    QWORD PTR [rbp+0x498],rcx
1978120- 10d263f:	88 95 a0 04 00 00    	mov    BYTE PTR [rbp+0x4a0],dl
1978121: 10d2645:	48 8b 84 24 78 05 00 	mov    rax,QWORD PTR [rsp+0x578]
1978122- 10d264c:	00 
1978123- 10d264d:	48 89 85 a8 04 00 00 	mov    QWORD PTR [rbp+0x4a8],rax
1978124- 10d2654:	48 8d 05 e5 d4 77 00 	lea    rax,[rip+0x77d4e5]        # 184fb40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xc228>
--
1978132- 10d2678:	48 89 b4 24 70 04 00 	mov    QWORD PTR [rsp+0x470],rsi
1978133- 10d267f:	00 
1978134- 10d2680:	66 0f 6f 84 24 90 02 	movdqa xmm0,XMMWORD PTR [rsp+0x290]
1978135- 10d2687:	00 00 
1978136- 10d2689:	66 0f 7f 85 b0 04 00 	movdqa XMMWORD PTR [rbp+0x4b0],xmm0
1978137- 10d2690:	00 
1978138- 10d2691:	66 0f d6 85 c0 04 00 	movq   QWORD PTR [rbp+0x4c0],xmm0
1978139- 10d2698:	00 
1978140- 10d2699:	48 8d bd d0 04 00 00 	lea    rdi,[rbp+0x4d0]
1978141- 10d26a0:	e8 eb 7b 9a ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
1978142- 10d26a5:	48 8d 85 b0 04 00 00 	lea    rax,[rbp+0x4b0]
1978143- 10d26ac:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
1978144- 10d26b3:	00 
1978145- 10d26b4:	49 89 06             	mov    QWORD PTR [r14],rax
1978146- 10d26b7:	48 8d 05 a6 9d 9a ff 	lea    rax,[rip+0xffffffffff9a9da6]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
1978147- 10d26be:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
1978148- 10d26c2:	48 8d 05 49 bc 01 00 	lea    rax,[rip+0x1bc49]        # 10ee312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2b5728>
1978149- 10d26c9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
1978150- 10d26cd:	48 8d bd 00 05 00 00 	lea    rdi,[rbp+0x500]
1978151- 10d26d4:	48 8b b5 c0 04 00 00 	mov    rsi,QWORD PTR [rbp+0x4c0]
1978152- 10d26db:	45 31 ff             	xor    r15d,r15d
1978153- 10d26de:	48 89 da             	mov    rdx,rbx
1978154- 10d26e1:	4c 89 f1             	mov    rcx,r14
1978155- 10d26e4:	45 31 c0             	xor    r8d,r8d
1978156- 10d26e7:	e8 6e 77 27 00       	call   1349e5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f3de>
1978157- 10d26ec:	4c 89 f7             	mov    rdi,r14
1978158- 10d26ef:	e8 aa 4b 9d ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
1978159- 10d26f4:	44 88 bd 08 05 00 00 	mov    BYTE PTR [rbp+0x508],r15b
1978160- 10d26fb:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
1978161- 10d2702:	00 
--
1978264- 10d28fb:	6a 08                	push   0x8
1978265- 10d28fd:	41 59                	pop    r9
1978266- 10d28ff:	4c 89 f7             	mov    rdi,r14
1978267- 10d2902:	31 d2                	xor    edx,edx
1978268- 10d2904:	e8 8b 7e 70 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
1978269- 10d2909:	49 8b 07             	mov    rax,QWORD PTR [r15]
1978270- 10d290c:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
1978271- 10d2913:	00 
1978272- 10d2914:	4c 89 fe             	mov    rsi,r15
1978273- 10d2917:	4c 89 f2             	mov    rdx,r14
1978274- 10d291a:	ff 50 28             	call   QWORD PTR [rax+0x28]
1978275- 10d291d:	4c 8d bd 98 07 00 00 	lea    r15,[rbp+0x798]
1978276- 10d2924:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
1978277- 10d292b:	00 
1978278- 10d292c:	4c 89 ff             	mov    rdi,r15
1978279- 10d292f:	4c 89 f6             	mov    rsi,r14
1978280- 10d2932:	e8 07 71 70 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
1978281- 10d2937:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
1978282- 10d293b:	e8 46 bb 9c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
1978283- 10d2940:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
1978284- 10d2947:	00 
1978285- 10d2948:	e8 9b 7e 70 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
1978286- 10d294d:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
1978287- 10d2952:	48 89 85 a8 07 00 00 	mov    QWORD PTR [rbp+0x7a8],rax
1978288: 10d2959:	48 8b 84 24 78 05 00 	mov    rax,QWORD PTR [rsp+0x578]
1978289- 10d2960:	00 
1978290- 10d2961:	48 89 85 b0 07 00 00 	mov    QWORD PTR [rbp+0x7b0],rax
1978291- 10d2968:	48 8d 35 21 08 29 ff 	lea    rsi,[rip+0xffffffffff290821]        # 363190 <_ZTSSt12bad_any_cast@@Base-0x2d038>
1978292- 10d296f:	48 8d bc 24 50 04 00 	lea    rdi,[rsp+0x450]
1978293- 10d2976:	00 
1978294- 10d2977:	e8 02 71 9a ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
1978295- 10d297c:	4c 8d 65 20          	lea    r12,[rbp+0x20]
1978296- 10d2980:	48 8d bd b8 07 00 00 	lea    rdi,[rbp+0x7b8]
1978297- 10d2987:	48 8d 9c 24 50 04 00 	lea    rbx,[rsp+0x450]
--
2545640- 12d8e2f:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
2545641- 12d8e33:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
2545642- 12d8e37:	48 85 d7             	test   rdi,rdx
2545643- 12d8e3a:	75 05                	jne    12d8e41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e3c5>
2545644- 12d8e3c:	48 21 d0             	and    rax,rdx
2545645- 12d8e3f:	eb 0d                	jmp    12d8e4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e3d2>
2545646- 12d8e41:	48 39 f8             	cmp    rax,rdi
2545647- 12d8e44:	72 08                	jb     12d8e4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e3d2>
2545648- 12d8e46:	31 d2                	xor    edx,edx
2545649- 12d8e48:	48 f7 f7             	div    rdi
2545650- 12d8e4b:	48 89 d0             	mov    rax,rdx
2545651- 12d8e4e:	49 8b 16             	mov    rdx,QWORD PTR [r14]
2545652- 12d8e51:	48 89 34 c2          	mov    QWORD PTR [rdx+rax*8],rsi
2545653- 12d8e55:	0f 57 c0             	xorps  xmm0,xmm0
2545654- 12d8e58:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
2545655- 12d8e5b:	4c 8d b3 98 05 00 00 	lea    r14,[rbx+0x598]
2545656- 12d8e62:	48 83 bb b0 05 00 00 	cmp    QWORD PTR [rbx+0x5b0],0x0
2545657- 12d8e69:	00 
2545658- 12d8e6a:	74 3a                	je     12d8ea6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11e42a>
2545659- 12d8e6c:	48 8b bb a8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5a8]
2545660- 12d8e73:	e8 b8 32 ff ff       	call   12cc130 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1116b4>
2545661- 12d8e78:	48 83 a3 a8 05 00 00 	and    QWORD PTR [rbx+0x5a8],0x0
2545662- 12d8e7f:	00 
--
2646138- 133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646139- 1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
2646140- 133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
2646141- 1333732:	00 
2646142- 1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646143- 1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
2646144- 133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
2646145- 1333746:	00 
2646146- 1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646147- 133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
2646148- 1333753:	00 
2646149- 1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
2646150- 133375b:	00 
2646151- 133375c:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
2646152- 1333763:	00 
2646153- 1333764:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
2646154- 133376b:	00 
2646155- 133376c:	31 c0                	xor    eax,eax
2646156- 133376e:	88 83 18 05 00 00    	mov    BYTE PTR [rbx+0x518],al
2646157- 1333774:	88 83 38 05 00 00    	mov    BYTE PTR [rbx+0x538],al
2646158- 133377a:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
2646159- 1333780:	88 83 60 05 00 00    	mov    BYTE PTR [rbx+0x560],al
2646160- 1333786:	0f 57 c0             	xorps  xmm0,xmm0
2646161- 1333789:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
2646162: 1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
2646163- 1333797:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
2646164- 133379e:	c7 83 98 05 00 00 00 	mov    DWORD PTR [rbx+0x598],0x3f800000
2646165- 13337a5:	00 80 3f 
2646166- 13337a8:	66 0f 6f 84 24 50 01 	movdqa xmm0,XMMWORD PTR [rsp+0x150]
2646167- 13337af:	00 00 
2646168- 13337b1:	66 0f 7f 83 a0 05 00 	movdqa XMMWORD PTR [rbx+0x5a0],xmm0
2646169- 13337b8:	00 
2646170- 13337b9:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
2646171- 13337c0:	48 85 c0             	test   rax,rax
2646172- 13337c3:	74 05                	je     13337ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d4e>
2646173- 13337c5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2646174- 13337ca:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2646175- 13337cf:	48 8d 83 d8 04 00 00 	lea    rax,[rbx+0x4d8]
2646176- 13337d6:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
2646177- 13337db:	48 8d 83 f8 04 00 00 	lea    rax,[rbx+0x4f8]
2646178- 13337e2:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2646179- 13337e7:	48 8d 83 18 05 00 00 	lea    rax,[rbx+0x518]
2646180- 13337ee:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
2646181- 13337f5:	00 
2646182- 13337f6:	48 8d 83 40 05 00 00 	lea    rax,[rbx+0x540]
2646183- 13337fd:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
2646184- 1333802:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
2646185- 1333806:	48 89 ef             	mov    rdi,rbp
2646186- 1333809:	4c 89 bc 24 00 01 00 	mov    QWORD PTR [rsp+0x100],r15
2646187- 1333810:	00 
2646188- 1333811:	ff 50 50             	call   QWORD PTR [rax+0x50]
2646189- 1333814:	48 89 83 b0 05 00 00 	mov    QWORD PTR [rbx+0x5b0],rax
2646190- 133381b:	48 83 a4 24 e8 01 00 	and    QWORD PTR [rsp+0x1e8],0x0
2646191- 1333822:	00 00 
2646192- 1333824:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
2646193- 1333829:	48 89 83 b8 05 00 00 	mov    QWORD PTR [rbx+0x5b8],rax
2646194- 1333830:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
2646195- 1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax
2646196- 133383c:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
2646197- 1333841:	48 89 83 c8 05 00 00 	mov    QWORD PTR [rbx+0x5c8],rax
2646198- 1333848:	48 8d bb d0 05 00 00 	lea    rdi,[rbx+0x5d0]
2646199- 133384f:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
2646200- 1333854:	e8 9d 61 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646201- 1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
2646202- 1333860:	48 8b 07             	mov    rax,QWORD PTR [rdi]
--
2652615- 1339438:	4d 89 47 10          	mov    QWORD PTR [r15+0x10],r8
2652616- 133943c:	4c 8b 44 24 48       	mov    r8,QWORD PTR [rsp+0x48]
2652617- 1339441:	4d 89 47 18          	mov    QWORD PTR [r15+0x18],r8
2652618- 1339445:	49 89 57 20          	mov    QWORD PTR [r15+0x20],rdx
2652619- 1339449:	41 88 77 28          	mov    BYTE PTR [r15+0x28],sil
2652620- 133944d:	49 89 4f 30          	mov    QWORD PTR [r15+0x30],rcx
2652621- 1339451:	4d 89 67 38          	mov    QWORD PTR [r15+0x38],r12
2652622- 1339455:	4d 89 6f 40          	mov    QWORD PTR [r15+0x40],r13
2652623- 1339459:	49 89 7f 48          	mov    QWORD PTR [r15+0x48],rdi
2652624- 133945d:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
2652625- 1339462:	45 88 5f 60          	mov    BYTE PTR [r15+0x60],r11b
2652626- 1339466:	48 8d 8b d8 04 00 00 	lea    rcx,[rbx+0x4d8]
2652627- 133946d:	49 89 4f 68          	mov    QWORD PTR [r15+0x68],rcx
2652628- 1339471:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
2652629- 1339478:	49 89 4f 70          	mov    QWORD PTR [r15+0x70],rcx
2652630- 133947c:	4d 89 57 78          	mov    QWORD PTR [r15+0x78],r10
2652631- 1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
2652632- 1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
2652633- 133948e:	00 
2652634- 133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
2652635- 1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
2652636- 133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
2652637- 13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
2652638- 13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
2652639: 13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
2652640- 13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
2652641- 13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
2652642- 13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
2652643- 13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
2652644- 13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
2652645- 13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
2652646- 13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
2652647- 13394e1:	00 
2652648- 13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
2652649- 13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
2652650- 13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2652651- 13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
2652652- 13394f5:	48 85 c0             	test   rax,rax
2652653- 13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
2652654- 13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
2652655- 13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>
2652656- 1339500:	45 31 ed             	xor    r13d,r13d
2652657- 1339503:	44 8a bc 24 d0 00 00 	mov    r15b,BYTE PTR [rsp+0xd0]
2652658- 133950a:	00 
2652659- 133950b:	48 8b ac 24 c8 00 00 	mov    rbp,QWORD PTR [rsp+0xc8]
2652660- 1339512:	00 
2652661- 1339513:	4c 8b a4 24 d8 00 00 	mov    r12,QWORD PTR [rsp+0xd8]
2652662- 133951a:	00 
2652663- 133951b:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
2652664- 1339522:	00 
2652665- 1339523:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2652666- 1339526:	0f 10 84 24 b8 00 00 	movups xmm0,XMMWORD PTR [rsp+0xb8]
2652667- 133952d:	00 
2652668- 133952e:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
2652669- 1339533:	4c 8d b4 24 d8 01 00 	lea    r14,[rsp+0x1d8]
2652670- 133953a:	00 
2652671- 133953b:	4c 89 f7             	mov    rdi,r14
2652672- 133953e:	ff 50 18             	call   QWORD PTR [rax+0x18]
2652673- 1339541:	41 8b 06             	mov    eax,DWORD PTR [r14]
2652674- 1339544:	ff c8                	dec    eax
2652675- 1339546:	83 f8 fe             	cmp    eax,0xfffffffe
2652676- 1339549:	0f 92 c0             	setb   al
2652677- 133954c:	41 22 46 0c          	and    al,BYTE PTR [r14+0xc]
2652678- 1339550:	48 8b 8c 24 e8 00 00 	mov    rcx,QWORD PTR [rsp+0xe8]
2652679- 1339557:	00 
--
2653491- 1339fe8:	49 89 fe             	mov    r14,rdi
2653492- 1339feb:	48 8d 05 4e bd 52 00 	lea    rax,[rip+0x52bd4e]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>
2653493- 1339ff2:	48 89 07             	mov    QWORD PTR [rdi],rax
2653494- 1339ff5:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
2653495- 1339ff9:	48 8d 05 20 be 52 00 	lea    rax,[rip+0x52be20]        # 1865e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22508>
2653496- 133a000:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
2653497- 133a004:	48 8b bf 78 06 00 00 	mov    rdi,QWORD PTR [rdi+0x678]
2653498- 133a00b:	e8 76 44 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2653499- 133a010:	49 8d be 58 06 00 00 	lea    rdi,[r14+0x658]
2653500- 133a017:	e8 60 51 83 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
2653501- 133a01c:	49 8b be 50 06 00 00 	mov    rdi,QWORD PTR [r14+0x650]
2653502- 133a023:	e8 8a 44 76 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
2653503- 133a028:	49 8d be 38 06 00 00 	lea    rdi,[r14+0x638]
2653504- 133a02f:	e8 a0 fb 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653505- 133a034:	49 8d be f0 05 00 00 	lea    rdi,[r14+0x5f0]
2653506- 133a03b:	e8 06 77 48 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
2653507- 133a040:	49 8d be d0 05 00 00 	lea    rdi,[r14+0x5d0]
2653508- 133a047:	e8 88 fb 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653509- 133a04c:	49 8b be c8 05 00 00 	mov    rdi,QWORD PTR [r14+0x5c8]
2653510- 133a053:	e8 2e 44 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2653511- 133a058:	49 8d be b8 05 00 00 	lea    rdi,[r14+0x5b8]
2653512- 133a05f:	e8 a6 02 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
2653513- 133a064:	49 8b be a8 05 00 00 	mov    rdi,QWORD PTR [r14+0x5a8]
2653514- 133a06b:	e8 16 44 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2653515: 133a070:	49 8d be 78 05 00 00 	lea    rdi,[r14+0x578]
2653516- 133a077:	e8 ea 85 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
2653517- 133a07c:	49 8d be 40 05 00 00 	lea    rdi,[r14+0x540]
2653518- 133a083:	e8 2a ea ff ff       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
2653519- 133a088:	49 8d be 18 05 00 00 	lea    rdi,[r14+0x518]
2653520- 133a08f:	e8 1e ea ff ff       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
2653521- 133a094:	49 8d be f8 04 00 00 	lea    rdi,[r14+0x4f8]
2653522- 133a09b:	e8 e4 20 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
2653523- 133a0a0:	49 8d be d8 04 00 00 	lea    rdi,[r14+0x4d8]
2653524- 133a0a7:	e8 d8 20 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
2653525- 133a0ac:	49 8d be c8 04 00 00 	lea    rdi,[r14+0x4c8]
2653526- 133a0b3:	e8 1c fb 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653527- 133a0b8:	49 8d be b8 04 00 00 	lea    rdi,[r14+0x4b8]
2653528- 133a0bf:	e8 10 fb 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653529- 133a0c4:	49 8d be a8 04 00 00 	lea    rdi,[r14+0x4a8]
2653530- 133a0cb:	e8 04 fb 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653531- 133a0d0:	49 8d be 98 04 00 00 	lea    rdi,[r14+0x498]
2653532- 133a0d7:	e8 f8 fa 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653533- 133a0dc:	49 8d be 88 04 00 00 	lea    rdi,[r14+0x488]
2653534- 133a0e3:	e8 ec fa 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653535- 133a0e8:	49 8d be 78 04 00 00 	lea    rdi,[r14+0x478]
2653536- 133a0ef:	e8 e0 fa 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653537- 133a0f4:	49 8d be 68 04 00 00 	lea    rdi,[r14+0x468]
2653538- 133a0fb:	e8 d4 fa 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653539- 133a100:	49 8d be 58 04 00 00 	lea    rdi,[r14+0x458]
2653540- 133a107:	e8 c8 fa 49 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2653541- 133a10c:	49 8d be d8 03 00 00 	lea    rdi,[r14+0x3d8]
2653542- 133a113:	e8 16 b2 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2653543- 133a118:	49 8b be c0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3c0]
2653544- 133a11f:	e8 62 43 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2653545- 133a124:	49 8b be b0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3b0]
2653546- 133a12b:	e8 56 43 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2653547- 133a130:	49 8b be a0 03 00 00 	mov    rdi,QWORD PTR [r14+0x3a0]
2653548- 133a137:	e8 4a 43 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2653549- 133a13c:	49 8d be 90 03 00 00 	lea    rdi,[r14+0x390]
2653550- 133a143:	e8 b0 db ff ff       	call   1337cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d27c>
2653551- 133a148:	49 8b be 88 03 00 00 	mov    rdi,QWORD PTR [r14+0x388]
2653552- 133a14f:	e8 32 43 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2653553- 133a154:	49 8d be 68 03 00 00 	lea    rdi,[r14+0x368]
2653554- 133a15b:	e8 62 bd 8e ff       	call   c25ec2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x172e62>
2653555- 133a160:	49 8d be e0 02 00 00 	lea    rdi,[r14+0x2e0]
--
2794138- 13bbd80:	4c 8d b3 18 05 00 00 	lea    r14,[rbx+0x518]
2794139- 13bbd87:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
2794140- 13bbd8b:	48 85 c0             	test   rax,rax
2794141- 13bbd8e:	74 22                	je     13bbdb2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x201336>
2794142- 13bbd90:	48 89 83 28 05 00 00 	mov    QWORD PTR [rbx+0x528],rax
2794143- 13bbd97:	6a 01                	push   0x1
2794144- 13bbd99:	5f                   	pop    rdi
2794145- 13bbd9a:	4c 89 f6             	mov    rsi,r14
2794146- 13bbd9d:	4c 89 fa             	mov    rdx,r15
2794147- 13bbda0:	ff d0                	call   rax
2794148- 13bbda2:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
2794149- 13bbda6:	48 89 83 30 05 00 00 	mov    QWORD PTR [rbx+0x530],rax
2794150- 13bbdad:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
2794151- 13bbdb2:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
2794152- 13bbdb7:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
2794153- 13bbdbb:	48 89 83 38 05 00 00 	mov    QWORD PTR [rbx+0x538],rax
2794154- 13bbdc2:	48 c7 83 40 05 00 00 	mov    QWORD PTR [rbx+0x540],0x31
2794155- 13bbdc9:	31 00 00 00 
2794156- 13bbdcd:	0f 57 c0             	xorps  xmm0,xmm0
2794157- 13bbdd0:	0f 11 83 48 05 00 00 	movups XMMWORD PTR [rbx+0x548],xmm0
2794158- 13bbdd7:	0f 11 83 58 05 00 00 	movups XMMWORD PTR [rbx+0x558],xmm0
2794159- 13bbdde:	48 89 83 68 05 00 00 	mov    QWORD PTR [rbx+0x568],rax
2794160- 13bbde5:	48 c7 83 70 05 00 00 	mov    QWORD PTR [rbx+0x570],0x29
2794161- 13bbdec:	29 00 00 00 
2794162: 13bbdf0:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
2794163- 13bbdf7:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
2794164- 13bbdfe:	c6 83 98 05 00 00 01 	mov    BYTE PTR [rbx+0x598],0x1
2794165- 13bbe05:	83 a3 a0 05 00 00 00 	and    DWORD PTR [rbx+0x5a0],0x0
2794166- 13bbe0c:	48 8d bb a8 05 00 00 	lea    rdi,[rbx+0x5a8]
2794167- 13bbe13:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
2794168- 13bbe17:	e8 e6 df 41 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
2794169- 13bbe1c:	48 8d bb 00 06 00 00 	lea    rdi,[rbx+0x600]
2794170- 13bbe23:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
2794171- 13bbe28:	e8 c9 db 41 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2794172- 13bbe2d:	4c 8d b3 10 06 00 00 	lea    r14,[rbx+0x610]
2794173- 13bbe34:	4c 89 f7             	mov    rdi,r14
2794174- 13bbe37:	e8 ba db 41 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2794175- 13bbe3c:	4c 8d bb 20 06 00 00 	lea    r15,[rbx+0x620]
2794176- 13bbe43:	4c 89 ff             	mov    rdi,r15

## Vptr-looking LEAs around parent construction region
 1338aac:	5b                   	pop    rbx
 1338aad:	e9 64 36 ff ff       	jmp    132c116 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17169a>
 1338ab2:	80 7f 20 00          	cmp    BYTE PTR [rdi+0x20],0x0
 1338ab6:	0f 85 c8 36 ff ff    	jne    132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
 1338abc:	c3                   	ret
 1338abd:	cc                   	int3
 1338abe:	53                   	push   rbx
 1338abf:	48 89 fb             	mov    rbx,rdi
 1338ac2:	48 8d 05 7f e4 52 00 	lea    rax,[rip+0x52e47f]        # 1866f48 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23630>
 1338ac9:	48 89 07             	mov    QWORD PTR [rdi],rax
 1338acc:	48 83 c7 28          	add    rdi,0x28
 1338ad0:	e8 91 13 4a 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 1338ad5:	48 83 c3 18          	add    rbx,0x18
 1338ad9:	48 89 df             	mov    rdi,rbx
 1338adc:	5b                   	pop    rbx
 1338add:	e9 f2 10 4a 00       	jmp    17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
 1338ae2:	41 56                	push   r14
 1338ae4:	53                   	push   rbx
 1338ae5:	50                   	push   rax
 1338ae6:	48 89 fb             	mov    rbx,rdi
 1338ae9:	48 8d 05 b8 d3 52 00 	lea    rax,[rip+0x52d3b8]        # 1865ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22590>
 1338af0:	48 89 07             	mov    QWORD PTR [rdi],rax
 1338af3:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
 1338afa:	e8 67 13 4a 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
 1338aff:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
 1338b06:	e8 3b 00 00 00       	call   1338b46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e0ca>
 1338b0b:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
 1338b0f:	e8 70 36 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
 1338b14:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
 1338b18:	e8 f9 35 ff ff       	call   132c116 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17169a>
 1338b1d:	4c 8d 73 08          	lea    r14,[rbx+0x8]
 1338b21:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
 1338b25:	e8 ac 74 8e ff       	call   c1ffd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cf76>
 1338b2a:	48 83 c3 20          	add    rbx,0x20
 1338b2e:	48 89 df             	mov    rdi,rbx
 1338b31:	e8 a0 74 8e ff       	call   c1ffd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cf76>
 1338b36:	4c 89 f7             	mov    rdi,r14
--
 1338f34:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1338f39:	80 7f 20 00          	cmp    BYTE PTR [rdi+0x20],0x0
 1338f3d:	74 26                	je     1338f65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e4e9>
 1338f3f:	48 89 fb             	mov    rbx,rdi
 1338f42:	8b 47 18             	mov    eax,DWORD PTR [rdi+0x18]
 1338f45:	b9 ff ff ff ff       	mov    ecx,0xffffffff
 1338f4a:	48 39 c8             	cmp    rax,rcx
 1338f4d:	74 12                	je     1338f61 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e4e5>
 1338f4f:	48 8d 0d da 2a 52 00 	lea    rcx,[rip+0x522ada]        # 185ba30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18118>
 1338f56:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
 1338f5b:	48 89 de             	mov    rsi,rbx
 1338f5e:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
 1338f61:	83 4b 18 ff          	or     DWORD PTR [rbx+0x18],0xffffffff
 1338f65:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1338f6c:	00 00 
 1338f6e:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 1338f73:	75 06                	jne    1338f7b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e4ff>
 1338f75:	48 83 c4 10          	add    rsp,0x10
 1338f79:	5b                   	pop    rbx
 1338f7a:	c3                   	ret
 1338f7b:	e8 30 6b 4b 00       	call   17efab0 <__stack_chk_fail@plt>
 1338f80:	48 89 c7             	mov    rdi,rax
 1338f83:	e8 1d 0b 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1338f88:	53                   	push   rbx
 1338f89:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
--
 13391b9:	48 89 94 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdx
 13391c0:	00 
 13391c1:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
 13391c8:	00 
 13391c9:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
 13391d0:	00 
 13391d1:	49 6b cf 18          	imul   rcx,r15,0x18
 13391d5:	31 ff                	xor    edi,edi
 13391d7:	48 8d 15 02 d7 52 00 	lea    rdx,[rip+0x52d702]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
 13391de:	48 89 fe             	mov    rsi,rdi
 13391e1:	48 89 14 38          	mov    QWORD PTR [rax+rdi*1],rdx
 13391e5:	49 8b 7c 3e 08       	mov    rdi,QWORD PTR [r14+rdi*1+0x8]
 13391ea:	48 89 7c 30 08       	mov    QWORD PTR [rax+rsi*1+0x8],rdi
 13391ef:	49 8b 7c 36 10       	mov    rdi,QWORD PTR [r14+rsi*1+0x10]
 13391f4:	48 89 7c 30 10       	mov    QWORD PTR [rax+rsi*1+0x10],rdi
 13391f9:	48 85 ff             	test   rdi,rdi
 13391fc:	74 05                	je     1339203 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e787>
 13391fe:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
 1339203:	48 8d 7e 18          	lea    rdi,[rsi+0x18]
 1339207:	48 39 f9             	cmp    rcx,rdi
 133920a:	75 d2                	jne    13391de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e762>
 133920c:	4c 8d 34 30          	lea    r14,[rax+rsi*1]
 1339210:	49 83 c6 18          	add    r14,0x18
 1339214:	4c 89 b4 24 20 02 00 	mov    QWORD PTR [rsp+0x220],r14
 133921b:	00 
--
 13392a0:	41 c7 47 20 00 00 80 	mov    DWORD PTR [r15+0x20],0x3f800000
 13392a7:	3f 
 13392a8:	48 8d bb 70 05 00 00 	lea    rdi,[rbx+0x570]
 13392af:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
 13392b6:	00 
 13392b7:	e8 52 4f ee ff       	call   121e20e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x63792>
 13392bc:	4c 89 ff             	mov    rdi,r15
 13392bf:	e8 a2 93 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
 13392c4:	48 8d 05 a5 cc 52 00 	lea    rax,[rip+0x52cca5]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
 13392cb:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
 13392d2:	00 
 13392d3:	48 89 01             	mov    QWORD PTR [rcx],rax
 13392d6:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
 13392da:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
 13392de:	48 8b b3 48 04 00 00 	mov    rsi,QWORD PTR [rbx+0x448]
 13392e5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 13392e8:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
 13392ef:	00 
 13392f0:	4c 89 ff             	mov    rdi,r15
 13392f3:	ff 50 18             	call   QWORD PTR [rax+0x18]
 13392f6:	41 8b 07             	mov    eax,DWORD PTR [r15]
 13392f9:	ff c8                	dec    eax
 13392fb:	8b 8b d0 01 00 00    	mov    ecx,DWORD PTR [rbx+0x1d0]
 1339301:	89 ca                	mov    edx,ecx
 1339303:	80 e2 ef             	and    dl,0xef
--
 133969f:	4c 89 f7             	mov    rdi,r14
 13396a2:	ff 50 10             	call   QWORD PTR [rax+0x10]
 13396a5:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
 13396aa:	4d 85 e4             	test   r12,r12
 13396ad:	0f 84 99 01 00 00    	je     133984c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17edd0>
 13396b3:	4d 6b f4 18          	imul   r14,r12,0x18
 13396b7:	45 31 ff             	xor    r15d,r15d
 13396ba:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
 13396bf:	48 8d 05 1a d2 52 00 	lea    rax,[rip+0x52d21a]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
 13396c6:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 13396cb:	4a 8b 44 3d 10       	mov    rax,QWORD PTR [rbp+r15*1+0x10]
 13396d0:	42 0f 10 44 3d 08    	movups xmm0,XMMWORD PTR [rbp+r15*1+0x8]
 13396d6:	0f 11 44 24 60       	movups XMMWORD PTR [rsp+0x60],xmm0
 13396db:	48 85 c0             	test   rax,rax
 13396de:	74 05                	je     13396e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ec69>
 13396e0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 13396e5:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 13396ec:	00 
 13396ed:	4c 89 e6             	mov    rsi,r12
 13396f0:	e8 2b a6 00 00       	call   1343d20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1892a4>
 13396f5:	48 8b 8c 24 38 01 00 	mov    rcx,QWORD PTR [rsp+0x138]
 13396fc:	00 
 13396fd:	48 8b 94 24 d0 01 00 	mov    rdx,QWORD PTR [rsp+0x1d0]
 1339704:	00 
 1339705:	48 89 11             	mov    QWORD PTR [rcx],rdx
--
 1339a6b:	41 5e                	pop    r14
 1339a6d:	c3                   	ret
 1339a6e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1339a75:	00 00 
 1339a77:	48 3b 44 24 30       	cmp    rax,QWORD PTR [rsp+0x30]
 1339a7c:	75 05                	jne    1339a83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f007>
 1339a7e:	e8 3d ab 6c ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
 1339a83:	e8 28 60 4b 00       	call   17efab0 <__stack_chk_fail@plt>
 1339a88:	48 8d 05 51 ce 52 00 	lea    rax,[rip+0x52ce51]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
 1339a8f:	48 89 07             	mov    QWORD PTR [rdi],rax
 1339a92:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1339a96:	e9 eb 49 76 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 1339a9b:	cc                   	int3
 1339a9c:	53                   	push   rbx
 1339a9d:	48 89 fb             	mov    rbx,rdi
 1339aa0:	6a 10                	push   0x10
 1339aa2:	5f                   	pop    rdi
 1339aa3:	e8 58 44 4b 00       	call   17edf00 <_Znwm@plt>
 1339aa8:	48 8d 0d c1 c4 52 00 	lea    rcx,[rip+0x52c4c1]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
 1339aaf:	48 89 08             	mov    QWORD PTR [rax],rcx
 1339ab2:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 1339ab6:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 1339aba:	5b                   	pop    rbx
 1339abb:	c3                   	ret
 1339abc:	48 8d 05 ad c4 52 00 	lea    rax,[rip+0x52c4ad]        # 1865f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22658>
 1339ac3:	48 89 06             	mov    QWORD PTR [rsi],rax
 1339ac6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 1339aca:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 1339ace:	c3                   	ret
 1339acf:	cc                   	int3
 1339ad0:	55                   	push   rbp
 1339ad1:	41 57                	push   r15
 1339ad3:	41 56                	push   r14
 1339ad5:	41 55                	push   r13
 1339ad7:	41 54                	push   r12
 1339ad9:	53                   	push   rbx
 1339ada:	48 83 ec 28          	sub    rsp,0x28
 1339ade:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1339ae5:	00 00 
 1339ae7:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 1339aec:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
--
 1339c75:	41 5e                	pop    r14
 1339c77:	e9 a4 42 4b 00       	jmp    17edf20 <_ZdlPv@plt>
 1339c7c:	5b                   	pop    rbx
 1339c7d:	41 5e                	pop    r14
 1339c7f:	c3                   	ret
 1339c80:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
 1339c85:	48 39 d6             	cmp    rsi,rdx
 1339c88:	74 36                	je     1339cc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f244>
 1339c8a:	48 8d 3d 4f cc 52 00 	lea    rdi,[rip+0x52cc4f]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
 1339c91:	0f 57 c0             	xorps  xmm0,xmm0
 1339c94:	48 8d 41 e8          	lea    rax,[rcx-0x18]
 1339c98:	48 89 79 e8          	mov    QWORD PTR [rcx-0x18],rdi
 1339c9c:	4c 8b 46 f0          	mov    r8,QWORD PTR [rsi-0x10]
 1339ca0:	4c 89 41 f0          	mov    QWORD PTR [rcx-0x10],r8
 1339ca4:	4c 8b 46 f8          	mov    r8,QWORD PTR [rsi-0x8]
 1339ca8:	4c 89 41 f8          	mov    QWORD PTR [rcx-0x8],r8
 1339cac:	0f 11 46 f0          	movups XMMWORD PTR [rsi-0x10],xmm0
 1339cb0:	4c 8d 46 e8          	lea    r8,[rsi-0x18]
 1339cb4:	48 89 c1             	mov    rcx,rax
 1339cb7:	4c 89 c6             	mov    rsi,r8
 1339cba:	49 39 d0             	cmp    r8,rdx
 1339cbd:	75 d5                	jne    1339c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f218>
 1339cbf:	c3                   	ret
 1339cc0:	48 89 c8             	mov    rax,rcx
 1339cc3:	c3                   	ret
--
 1339eb7:	48 89 c7             	mov    rdi,rax
 1339eba:	e8 e6 fb 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1339ebf:	cc                   	int3
 1339ec0:	53                   	push   rbx
 1339ec1:	48 89 fb             	mov    rbx,rdi
 1339ec4:	6a 10                	push   0x10
 1339ec6:	5f                   	pop    rdi
 1339ec7:	e8 34 40 4b 00       	call   17edf00 <_Znwm@plt>
 1339ecc:	48 8d 0d 55 c0 52 00 	lea    rcx,[rip+0x52c055]        # 1865f28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22610>
 1339ed3:	48 89 08             	mov    QWORD PTR [rax],rcx
 1339ed6:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 1339eda:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 1339ede:	5b                   	pop    rbx
 1339edf:	c3                   	ret
 1339ee0:	48 8d 05 41 c0 52 00 	lea    rax,[rip+0x52c041]        # 1865f28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22610>
 1339ee7:	48 89 06             	mov    QWORD PTR [rsi],rax
 1339eea:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 1339eee:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 1339ef2:	c3                   	ret
 1339ef3:	cc                   	int3
 1339ef4:	53                   	push   rbx
 1339ef5:	48 89 fb             	mov    rbx,rdi
 1339ef8:	8b 09                	mov    ecx,DWORD PTR [rcx]
 1339efa:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
 1339efe:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 1339f01:	ff 50 18             	call   QWORD PTR [rax+0x18]
 1339f04:	48 89 d8             	mov    rax,rbx
 1339f07:	5b                   	pop    rbx
 1339f08:	c3                   	ret
 1339f09:	cc                   	int3
 1339f0a:	53                   	push   rbx
 1339f0b:	48 89 fb             	mov    rbx,rdi
 1339f0e:	6a 10                	push   0x10
 1339f10:	5f                   	pop    rdi
 1339f11:	e8 ea 3f 4b 00       	call   17edf00 <_Znwm@plt>
 1339f16:	48 8d 0d c3 bf 52 00 	lea    rcx,[rip+0x52bfc3]        # 1865ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225c8>
 1339f1d:	48 89 08             	mov    QWORD PTR [rax],rcx
 1339f20:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
 1339f24:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
 1339f28:	5b                   	pop    rbx
 1339f29:	c3                   	ret
 1339f2a:	48 8d 05 af bf 52 00 	lea    rax,[rip+0x52bfaf]        # 1865ee0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x225c8>
 1339f31:	48 89 06             	mov    QWORD PTR [rsi],rax
 1339f34:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
 1339f38:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
 1339f3c:	c3                   	ret
 1339f3d:	cc                   	int3
 1339f3e:	41 56                	push   r14
 1339f40:	53                   	push   rbx
 1339f41:	50                   	push   rax
 1339f42:	49 89 d6             	mov    r14,rdx
 1339f45:	48 89 fb             	mov    rbx,rdi
 1339f48:	bf 78 02 00 00       	mov    edi,0x278
 1339f4d:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
 1339f51:	48 89 d6             	mov    rsi,rdx
 1339f54:	e8 26 1e a5 ff       	call   d8bd7f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x58e05>
 1339f59:	48 85 c0             	test   rax,rax
 1339f5c:	74 1a                	je     1339f78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f4fc>
--
 1339fde:	41 5e                	pop    r14
 1339fe0:	41 5f                	pop    r15
 1339fe2:	c3                   	ret
 1339fe3:	cc                   	int3
 1339fe4:	41 56                	push   r14
 1339fe6:	53                   	push   rbx
 1339fe7:	50                   	push   rax
 1339fe8:	49 89 fe             	mov    r14,rdi
 1339feb:	48 8d 05 4e bd 52 00 	lea    rax,[rip+0x52bd4e]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>
 1339ff2:	48 89 07             	mov    QWORD PTR [rdi],rax
 1339ff5:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
 1339ff9:	48 8d 05 20 be 52 00 	lea    rax,[rip+0x52be20]        # 1865e20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22508>
