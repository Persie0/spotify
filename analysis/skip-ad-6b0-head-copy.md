# Skip Ad 0x6b0 receiver head copy

## 0x12240f8 exact

/tmp/headcopy/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000012240f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6967c>:
 12240f8:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 12240fc:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1224100:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
 1224103:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 1224106:	0f 57 c0             	xorps  xmm0,xmm0
 1224109:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
 122410c:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 1224111:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
 1224115:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
 1224119:	0f 10 4e 18          	movups xmm1,XMMWORD PTR [rsi+0x18]
 122411d:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
 1224121:	0f 11 46 18          	movups XMMWORD PTR [rsi+0x18],xmm0
 1224125:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
 122412a:	48 8b 46 40          	mov    rax,QWORD PTR [rsi+0x40]
 122412e:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
 1224132:	0f 10 4e 30          	movups xmm1,XMMWORD PTR [rsi+0x30]
 1224136:	0f 11 4f 30          	movups XMMWORD PTR [rdi+0x30],xmm1
 122413a:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
 122413e:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
 1224143:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
 1224147:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
 122414b:	0f 10 4e 48          	movups xmm1,XMMWORD PTR [rsi+0x48]
 122414f:	0f 11 4f 48          	movups XMMWORD PTR [rdi+0x48],xmm1
 1224153:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
 1224157:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
 122415c:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]
 1224160:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
 1224164:	0f 10 4e 60          	movups xmm1,XMMWORD PTR [rsi+0x60]
 1224168:	0f 11 4f 60          	movups XMMWORD PTR [rdi+0x60],xmm1
 122416c:	0f 11 46 60          	movups XMMWORD PTR [rsi+0x60],xmm0
 1224170:	48 83 66 70 00       	and    QWORD PTR [rsi+0x70],0x0
 1224175:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
 1224179:	48 8b 4e 7d          	mov    rcx,QWORD PTR [rsi+0x7d]
 122417d:	48 89 4f 7d          	mov    QWORD PTR [rdi+0x7d],rcx
 1224181:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
 1224185:	0f 10 8e 88 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x88]
 122418c:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
 1224193:	48 8b 86 98 00 00 00 	mov    rax,QWORD PTR [rsi+0x98]
 122419a:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
 12241a1:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
 12241a8:	48 83 a6 98 00 00 00 	and    QWORD PTR [rsi+0x98],0x0
 12241af:	00 
 12241b0:	b8 a0 00 00 00       	mov    eax,0xa0
 12241b5:	48 01 c7             	add    rdi,rax
 12241b8:	48 01 c6             	add    rsi,rax
 12241bb:	e9 68 a2 e6 ff       	jmp    108e428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25583e>
 12241c0:	53                   	push   rbx
 12241c1:	48 89 fb             	mov    rbx,rdi
 12241c4:	8a 87 c0 00 00 00    	mov    al,BYTE PTR [rdi+0xc0]
 12241ca:	3a 86 c0 00 00 00    	cmp    al,BYTE PTR [rsi+0xc0]
 12241d0:	75 0e                	jne    12241e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69764>
 12241d2:	84 c0                	test   al,al
 12241d4:	74 24                	je     12241fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6977e>
 12241d6:	48 89 df             	mov    rdi,rbx
 12241d9:	e8 16 0f ff ff       	call   12150f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5a678>
 12241de:	eb 1a                	jmp    12241fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6977e>
 12241e0:	48 89 df             	mov    rdi,rbx
 12241e3:	84 c0                	test   al,al
 12241e5:	74 0e                	je     12241f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69779>
 12241e7:	e8 66 5b e8 ff       	call   10a9d52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x271168>
 12241ec:	c6 83 c0 00 00 00 00 	mov    BYTE PTR [rbx+0xc0],0x0
 12241f3:	eb 05                	jmp    12241fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6977e>
 12241f5:	e8 bc 14 ff ff       	call   12156b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ac3a>
 12241fa:	48 89 d8             	mov    rax,rbx
 12241fd:	5b                   	pop    rbx
 12241fe:	c3                   	ret
 12241ff:	cc                   	int3
 1224200:	53                   	push   rbx
 1224201:	48 83 ec 10          	sub    rsp,0x10
 1224205:	48 89 f2             	mov    rdx,rsi
 1224208:	48 89 fb             	mov    rbx,rdi
 122420b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1224212:	00 00 
 1224214:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 1224219:	83 7f 20 ff          	cmp    DWORD PTR [rdi+0x20],0xffffffff
 122421d:	8b 46 20             	mov    eax,DWORD PTR [rsi+0x20]
 1224220:	75 05                	jne    1224227 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x697ab>
 1224222:	83 f8 ff             	cmp    eax,0xffffffff
 1224225:	74 22                	je     1224249 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x697cd>
 1224227:	83 f8 ff             	cmp    eax,0xffffffff
 122422a:	74 15                	je     1224241 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x697c5>
 122422c:	48 89 e7             	mov    rdi,rsp
 122422f:	48 89 1f             	mov    QWORD PTR [rdi],rbx
 1224232:	48 8d 0d a7 8a 63 00 	lea    rcx,[rip+0x638aa7]        # 185cce0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x193c8>
 1224239:	48 89 de             	mov    rsi,rbx
 122423c:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
 122423f:	eb 08                	jmp    1224249 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x697cd>
 1224241:	48 89 df             	mov    rdi,rbx
 1224244:	e8 7f d6 fe ff       	call   12118c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56e4c>
 1224249:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1224250:	00 00 
 1224252:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
 1224257:	75 09                	jne    1224262 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x697e6>
 1224259:	48 89 d8             	mov    rax,rbx
 122425c:	48 83 c4 10          	add    rsp,0x10
 1224260:	5b                   	pop    rbx
 1224261:	c3                   	ret
 1224262:	e8 49 b8 5c 00       	call   17efab0 <__stack_chk_fail@plt>
 1224267:	48 89 c7             	mov    rdi,rax
 122426a:	e8 36 58 85 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 122426f:	cc                   	int3
 1224270:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 1224273:	83 7f 20 01          	cmp    DWORD PTR [rdi+0x20],0x1
 1224277:	75 0b                	jne    1224284 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69808>
 1224279:	48 89 f7             	mov    rdi,rsi
 122427c:	48 89 d6             	mov    rsi,rdx
 122427f:	e9 e0 14 8b ff       	jmp    ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
 1224284:	48 89 d6             	mov    rsi,rdx
 1224287:	e9 60 3b ff ff       	jmp    1217dec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d370>
 122428c:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 122428f:	83 7f 20 02          	cmp    DWORD PTR [rdi+0x20],0x2
 1224293:	75 0b                	jne    12242a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69824>
 1224295:	48 89 f7             	mov    rdi,rsi
 1224298:	48 89 d6             	mov    rsi,rdx
 122429b:	e9 8e 77 85 ff       	jmp    a7ba2e <JNI_OnUnload@@Base+0x32fb>
 12242a0:	48 89 d6             	mov    rsi,rdx
 12242a3:	e9 08 3b ff ff       	jmp    1217db0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d334>
 12242a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12242ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
 12242ae:	48 8b 00             	mov    rax,QWORD PTR [rax]
 12242b1:	48 b9 01 00 00 00 01 	movabs rcx,0x100000001
 12242b8:	00 00 00 
 12242bb:	80 38 00             	cmp    BYTE PTR [rax],0x0
 12242be:	48 8d 41 01          	lea    rax,[rcx+0x1]
 12242c2:	48 0f 44 c1          	cmove  rax,rcx
 12242c6:	c3                   	ret
 12242c7:	cc                   	int3
 12242c8:	48 b8 01 00 00 00 02 	movabs rax,0x200000001
 12242cf:	00 00 00 
 12242d2:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
 12242d5:	48 8b 51 08          	mov    rdx,QWORD PTR [rcx+0x8]
 12242d9:	80 3a 00             	cmp    BYTE PTR [rdx],0x0
 12242dc:	8b 16                	mov    edx,DWORD PTR [rsi]
 12242de:	74 06                	je     12242e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6986a>
 12242e0:	83 fa 01             	cmp    edx,0x1
 12242e3:	75 01                	jne    12242e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6986a>
 12242e5:	c3                   	ret
 12242e6:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
 12242ea:	80 3e 00             	cmp    BYTE PTR [rsi],0x0
 12242ed:	74 09                	je     12242f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6987c>
 12242ef:	83 fa 02             	cmp    edx,0x2
 12242f2:	75 04                	jne    12242f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6987c>
 12242f4:	48 ff c0             	inc    rax
 12242f7:	c3                   	ret
 12242f8:	48 8b 49 10          	mov    rcx,QWORD PTR [rcx+0x10]
 12242fc:	48 8b 09             	mov    rcx,QWORD PTR [rcx]
 12242ff:	48 8d 50 01          	lea    rdx,[rax+0x1]
 1224303:	80 39 00             	cmp    BYTE PTR [rcx],0x0
 1224306:	48 0f 45 c2          	cmovne rax,rdx
 122430a:	c3                   	ret
 122430b:	cc                   	int3
 122430c:	8b 0e                	mov    ecx,DWORD PTR [rsi]
 122430e:	48 b8 00 00 00 00 03 	movabs rax,0x300000000
 1224315:	00 00 00 
 1224318:	48 09 c8             	or     rax,rcx
 122431b:	c3                   	ret
 122431c:	8b 06                	mov    eax,DWORD PTR [rsi]
 122431e:	48 0f ba e8 22       	bts    rax,0x22
 1224323:	c3                   	ret
 1224324:	53                   	push   rbx
 1224325:	48 89 fb             	mov    rbx,rdi
 1224328:	48 83 c7 48          	add    rdi,0x48
 122432c:	e8 c3 59 e8 ff       	call   10a9cf4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27110a>
 1224331:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1224335:	e8 6a 56 e6 ff       	call   10899a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250dba>
 122433a:	48 89 df             	mov    rdi,rbx
 122433d:	5b                   	pop    rbx
 122433e:	e9 4d 9b 5c 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1224343:	cc                   	int3
 1224344:	53                   	push   rbx
 1224345:	48 89 fb             	mov    rbx,rdi
 1224348:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 122434c:	e8 5d 05 00 00       	call   12248ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69e32>
 1224351:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1224354:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 1224358:	48 85 ff             	test   rdi,rdi
 122435b:	74 06                	je     1224363 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x698e7>
 122435d:	5b                   	pop    rbx
 122435e:	e9 bd 9b 5c 00       	jmp    17edf20 <_ZdlPv@plt>
 1224363:	5b                   	pop    rbx
 1224364:	c3                   	ret
 1224365:	cc                   	int3
 1224366:	53                   	push   rbx
 1224367:	48 89 fb             	mov    rbx,rdi
 122436a:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 122436e:	e8 f5 04 00 00       	call   1224868 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69dec>
 1224373:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1224376:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 122437a:	48 85 ff             	test   rdi,rdi
 122437d:	74 06                	je     1224385 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69909>
 122437f:	5b                   	pop    rbx
 1224380:	e9 9b 9b 5c 00       	jmp    17edf20 <_ZdlPv@plt>
 1224385:	5b                   	pop    rbx
 1224386:	c3                   	ret
 1224387:	cc                   	int3
 1224388:	53                   	push   rbx
 1224389:	48 89 fb             	mov    rbx,rdi
 122438c:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1224390:	e8 8d 04 00 00       	call   1224822 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69da6>
 1224395:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1224398:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 122439c:	48 85 ff             	test   rdi,rdi
 122439f:	74 06                	je     12243a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6992b>
 12243a1:	5b                   	pop    rbx
 12243a2:	e9 79 9b 5c 00       	jmp    17edf20 <_ZdlPv@plt>
 12243a7:	5b                   	pop    rbx
 12243a8:	c3                   	ret
 12243a9:	cc                   	int3
 12243aa:	53                   	push   rbx
 12243ab:	48 89 fb             	mov    rbx,rdi
 12243ae:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 12243b2:	e8 0d 04 00 00       	call   12247c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69d48>
 12243b7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 12243ba:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 12243be:	48 85 ff             	test   rdi,rdi
 12243c1:	74 06                	je     12243c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6994d>
 12243c3:	5b                   	pop    rbx
 12243c4:	e9 57 9b 5c 00       	jmp    17edf20 <_ZdlPv@plt>
 12243c9:	5b                   	pop    rbx
 12243ca:	c3                   	ret
 12243cb:	cc                   	int3
 12243cc:	53                   	push   rbx
 12243cd:	48 89 fb             	mov    rbx,rdi
 12243d0:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 12243d4:	e8 1f 03 00 00       	call   12246f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69c7c>
 12243d9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 12243dc:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 12243e0:	48 85 ff             	test   rdi,rdi
 12243e3:	74 06                	je     12243eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6996f>
 12243e5:	5b                   	pop    rbx
 12243e6:	e9 35 9b 5c 00       	jmp    17edf20 <_ZdlPv@plt>
 12243eb:	5b                   	pop    rbx
 12243ec:	c3                   	ret
 12243ed:	cc                   	int3
 12243ee:	53                   	push   rbx
 12243ef:	48 89 fb             	mov    rbx,rdi
 12243f2:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 12243f6:	e8 15 00 00 00       	call   1224410 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
 12243fb:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 12243fe:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 1224402:	48 85 ff             	test   rdi,rdi
 1224405:	74 06                	je     122440d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69991>
 1224407:	5b                   	pop    rbx
 1224408:	e9 13 9b 5c 00       	jmp    17edf20 <_ZdlPv@plt>
 122440d:	5b                   	pop    rbx
 122440e:	c3                   	ret
 122440f:	cc                   	int3
 1224410:	48 85 ff             	test   rdi,rdi
 1224413:	74 2a                	je     122443f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x699c3>
 1224415:	41 56                	push   r14
 1224417:	53                   	push   rbx
 1224418:	50                   	push   rax
 1224419:	48 89 fb             	mov    rbx,rdi
 122441c:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
 122441f:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 1224423:	e8 18 00 00 00       	call   1224440 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x699c4>
 1224428:	48 89 df             	mov    rdi,rbx
 122442b:	e8 f0 9a 5c 00       	call   17edf20 <_ZdlPv@plt>
 1224430:	4c 89 f3             	mov    rbx,r14
 1224433:	4d 85 f6             	test   r14,r14
 1224436:	75 e4                	jne    122441c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x699a0>
 1224438:	48 83 c4 08          	add    rsp,0x8
 122443c:	5b                   	pop    rbx
 122443d:	41 5e                	pop    r14
 122443f:	c3                   	ret
 1224440:	53                   	push   rbx
 1224441:	48 89 fb             	mov    rbx,rdi
 1224444:	48 83 c7 48          	add    rdi,0x48
 1224448:	e8 09 00 00 00       	call   1224456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x699da>
 122444d:	48 89 df             	mov    rdi,rbx
 1224450:	5b                   	pop    rbx
 1224451:	e9 76 a3 87 ff       	jmp    a9e7cc <JNI_OnUnload@@Base+0x26099>
 1224456:	53                   	push   rbx
 1224457:	48 83 ec 10          	sub    rsp,0x10
 122445b:	48 89 fb             	mov    rbx,rdi
 122445e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1224465:	00 00 
 1224467:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 122446c:	8b 87 90 02 00 00    	mov    eax,DWORD PTR [rdi+0x290]
 1224472:	b9 ff ff ff ff       	mov    ecx,0xffffffff
 1224477:	48 39 c8             	cmp    rax,rcx
 122447a:	74 12                	je     122448e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a12>
 122447c:	48 8d 0d fd 87 63 00 	lea    rcx,[rip+0x6387fd]        # 185cc80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19368>
 1224483:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
 1224488:	48 89 de             	mov    rsi,rbx
 122448b:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
 122448e:	83 8b 90 02 00 00 ff 	or     DWORD PTR [rbx+0x290],0xffffffff
 1224495:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 122449c:	00 00 
 122449e:	48                   	rex.W
 122449f:	3b                   	.byte 0x3b

## 0x108dcd4 tail copy

/tmp/headcopy/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

000000000108dcd4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2550ea>:
 108dcd4:	41 56                	push   r14
 108dcd6:	53                   	push   rbx
 108dcd7:	50                   	push   rax
 108dcd8:	49 89 f6             	mov    r14,rsi
 108dcdb:	48 89 fb             	mov    rbx,rdi
 108dcde:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 108dce2:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 108dce6:	0f 10 06             	movups xmm0,XMMWORD PTR [rsi]
 108dce9:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 108dcec:	0f 57 c9             	xorps  xmm1,xmm1
 108dcef:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
 108dcf4:	0f 11 0e             	movups XMMWORD PTR [rsi],xmm1
 108dcf7:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
 108dcfb:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
 108dcff:	0f 10 46 18          	movups xmm0,XMMWORD PTR [rsi+0x18]
 108dd03:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
 108dd07:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
 108dd0c:	0f 11 4e 18          	movups XMMWORD PTR [rsi+0x18],xmm1
 108dd10:	8a 46 40             	mov    al,BYTE PTR [rsi+0x40]
 108dd13:	88 47 40             	mov    BYTE PTR [rdi+0x40],al
 108dd16:	0f 10 46 30          	movups xmm0,XMMWORD PTR [rsi+0x30]
 108dd1a:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0
 108dd1e:	48 8b 46 58          	mov    rax,QWORD PTR [rsi+0x58]
 108dd22:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
 108dd26:	0f 10 46 48          	movups xmm0,XMMWORD PTR [rsi+0x48]
 108dd2a:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
 108dd2e:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
 108dd33:	0f 11 4e 48          	movups XMMWORD PTR [rsi+0x48],xmm1
 108dd37:	48 8b 46 70          	mov    rax,QWORD PTR [rsi+0x70]
 108dd3b:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
 108dd3f:	0f 10 46 60          	movups xmm0,XMMWORD PTR [rsi+0x60]
 108dd43:	0f 11 47 60          	movups XMMWORD PTR [rdi+0x60],xmm0
 108dd47:	48 83 66 70 00       	and    QWORD PTR [rsi+0x70],0x0
 108dd4c:	0f 11 4e 60          	movups XMMWORD PTR [rsi+0x60],xmm1
 108dd50:	48 8b 86 88 00 00 00 	mov    rax,QWORD PTR [rsi+0x88]
 108dd57:	48 89 87 88 00 00 00 	mov    QWORD PTR [rdi+0x88],rax
 108dd5e:	0f 10 46 78          	movups xmm0,XMMWORD PTR [rsi+0x78]
 108dd62:	0f 11 47 78          	movups XMMWORD PTR [rdi+0x78],xmm0
 108dd66:	48 83 a6 88 00 00 00 	and    QWORD PTR [rsi+0x88],0x0
 108dd6d:	00 
 108dd6e:	0f 11 4e 78          	movups XMMWORD PTR [rsi+0x78],xmm1
 108dd72:	be 90 00 00 00       	mov    esi,0x90
 108dd77:	48 01 f7             	add    rdi,rsi
 108dd7a:	4c 01 f6             	add    rsi,r14
 108dd7d:	e8 3c 01 00 00       	call   108debe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552d4>
 108dd82:	be d8 02 00 00       	mov    esi,0x2d8
 108dd87:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108dd8b:	4c 01 f6             	add    rsi,r14
 108dd8e:	ba 99 00 00 00       	mov    edx,0x99
 108dd93:	e8 38 1d 76 00       	call   17efad0 <memcpy@plt>
 108dd98:	0f 57 c9             	xorps  xmm1,xmm1
 108dd9b:	49 8b 86 88 03 00 00 	mov    rax,QWORD PTR [r14+0x388]
 108dda2:	48 89 83 88 03 00 00 	mov    QWORD PTR [rbx+0x388],rax
 108dda9:	41 0f 10 86 78 03 00 	movups xmm0,XMMWORD PTR [r14+0x378]
 108ddb0:	00 
 108ddb1:	0f 11 83 78 03 00 00 	movups XMMWORD PTR [rbx+0x378],xmm0
 108ddb8:	49 83 a6 88 03 00 00 	and    QWORD PTR [r14+0x388],0x0
 108ddbf:	00 
 108ddc0:	41 0f 11 8e 78 03 00 	movups XMMWORD PTR [r14+0x378],xmm1
 108ddc7:	00 
 108ddc8:	49 8b 86 a0 03 00 00 	mov    rax,QWORD PTR [r14+0x3a0]
 108ddcf:	48 89 83 a0 03 00 00 	mov    QWORD PTR [rbx+0x3a0],rax
 108ddd6:	41 0f 10 86 90 03 00 	movups xmm0,XMMWORD PTR [r14+0x390]
 108dddd:	00 
 108ddde:	0f 11 83 90 03 00 00 	movups XMMWORD PTR [rbx+0x390],xmm0
 108dde5:	49 83 a6 a0 03 00 00 	and    QWORD PTR [r14+0x3a0],0x0
 108ddec:	00 
 108dded:	41 0f 11 8e 90 03 00 	movups XMMWORD PTR [r14+0x390],xmm1
 108ddf4:	00 
 108ddf5:	49 8b 86 a8 03 00 00 	mov    rax,QWORD PTR [r14+0x3a8]
 108ddfc:	48 89 83 a8 03 00 00 	mov    QWORD PTR [rbx+0x3a8],rax
 108de03:	31 c0                	xor    eax,eax
 108de05:	88 83 b0 03 00 00    	mov    BYTE PTR [rbx+0x3b0],al
 108de0b:	88 83 c8 03 00 00    	mov    BYTE PTR [rbx+0x3c8],al
 108de11:	41 38 86 c8 03 00 00 	cmp    BYTE PTR [r14+0x3c8],al
 108de18:	74 34                	je     108de4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255264>
 108de1a:	48 8d 83 b0 03 00 00 	lea    rax,[rbx+0x3b0]
 108de21:	49 8b 8e c0 03 00 00 	mov    rcx,QWORD PTR [r14+0x3c0]
 108de28:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108de2c:	41 0f 10 86 b0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3b0]
 108de33:	00 
 108de34:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108de37:	41 0f 11 8e b0 03 00 	movups XMMWORD PTR [r14+0x3b0],xmm1
 108de3e:	00 
 108de3f:	49 83 a6 c0 03 00 00 	and    QWORD PTR [r14+0x3c0],0x0
 108de46:	00 
 108de47:	c6 83 c8 03 00 00 01 	mov    BYTE PTR [rbx+0x3c8],0x1
 108de4e:	41 0f 10 86 d0 03 00 	movups xmm0,XMMWORD PTR [r14+0x3d0]
 108de55:	00 
 108de56:	41 0f 10 8e e0 03 00 	movups xmm1,XMMWORD PTR [r14+0x3e0]
 108de5d:	00 
 108de5e:	0f 11 8b e0 03 00 00 	movups XMMWORD PTR [rbx+0x3e0],xmm1
 108de65:	0f 11 83 d0 03 00 00 	movups XMMWORD PTR [rbx+0x3d0],xmm0
 108de6c:	31 c0                	xor    eax,eax
 108de6e:	88 83 f0 03 00 00    	mov    BYTE PTR [rbx+0x3f0],al
 108de74:	88 83 28 04 00 00    	mov    BYTE PTR [rbx+0x428],al
 108de7a:	41 38 86 28 04 00 00 	cmp    BYTE PTR [r14+0x428],al
 108de81:	74 13                	je     108de96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2552ac>
 108de83:	48 8d bb f0 03 00 00 	lea    rdi,[rbx+0x3f0]
 108de8a:	49 8d b6 f0 03 00 00 	lea    rsi,[r14+0x3f0]
 108de91:	e8 3a 05 00 00       	call   108e3d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2557e6>
 108de96:	be 30 04 00 00       	mov    esi,0x430
 108de9b:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
 108de9f:	4c 01 f6             	add    rsi,r14
 108dea2:	e8 8b 03 00 00       	call   108e232 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255648>
 108dea7:	49 8b 86 48 05 00 00 	mov    rax,QWORD PTR [r14+0x548]
 108deae:	48 89 83 48 05 00 00 	mov    QWORD PTR [rbx+0x548],rax
 108deb5:	48 83 c4 08          	add    rsp,0x8
 108deb9:	5b                   	pop    rbx
 108deba:	41 5e                	pop    r14
 108debc:	c3                   	ret
 108debd:	cc                   	int3
 108debe:	41 56                	push   r14
 108dec0:	53                   	push   rbx
 108dec1:	50                   	push   rax
 108dec2:	49 89 f6             	mov    r14,rsi
 108dec5:	48 89 fb             	mov    rbx,rdi
 108dec8:	31 c0                	xor    eax,eax
 108deca:	88 07                	mov    BYTE PTR [rdi],al
 108decc:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
 108decf:	38 46 18             	cmp    BYTE PTR [rsi+0x18],al
 108ded2:	74 1f                	je     108def3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255309>
 108ded4:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 108ded8:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 108dedc:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
 108dee0:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 108dee3:	0f 57 c0             	xorps  xmm0,xmm0
 108dee6:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 108deea:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
 108deef:	c6 43 18 01          	mov    BYTE PTR [rbx+0x18],0x1
 108def3:	31 c0                	xor    eax,eax
 108def5:	88 43 20             	mov    BYTE PTR [rbx+0x20],al
 108def8:	88 43 38             	mov    BYTE PTR [rbx+0x38],al
 108defb:	41 38 46 38          	cmp    BYTE PTR [r14+0x38],al
 108deff:	74 25                	je     108df26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25533c>
 108df01:	48 8d 43 20          	lea    rax,[rbx+0x20]
 108df05:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
 108df09:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108df0d:	41 0f 10 46 20       	movups xmm0,XMMWORD PTR [r14+0x20]
 108df12:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108df15:	0f 57 c0             	xorps  xmm0,xmm0
 108df18:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
 108df1d:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
 108df22:	c6 43 38 01          	mov    BYTE PTR [rbx+0x38],0x1
 108df26:	31 c0                	xor    eax,eax
 108df28:	88 43 40             	mov    BYTE PTR [rbx+0x40],al
 108df2b:	88 43 58             	mov    BYTE PTR [rbx+0x58],al
 108df2e:	41 38 46 58          	cmp    BYTE PTR [r14+0x58],al
 108df32:	74 25                	je     108df59 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25536f>
 108df34:	48 8d 43 40          	lea    rax,[rbx+0x40]
 108df38:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
 108df3c:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108df40:	41 0f 10 46 40       	movups xmm0,XMMWORD PTR [r14+0x40]
 108df45:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108df48:	0f 57 c0             	xorps  xmm0,xmm0
 108df4b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
 108df50:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
 108df55:	c6 43 58 01          	mov    BYTE PTR [rbx+0x58],0x1
 108df59:	31 c0                	xor    eax,eax
 108df5b:	88 43 60             	mov    BYTE PTR [rbx+0x60],al
 108df5e:	88 43 78             	mov    BYTE PTR [rbx+0x78],al
 108df61:	41 38 46 78          	cmp    BYTE PTR [r14+0x78],al
 108df65:	74 25                	je     108df8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2553a2>
 108df67:	48 8d 43 60          	lea    rax,[rbx+0x60]
 108df6b:	49 8b 4e 70          	mov    rcx,QWORD PTR [r14+0x70]
 108df6f:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108df73:	41 0f 10 46 60       	movups xmm0,XMMWORD PTR [r14+0x60]
 108df78:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108df7b:	0f 57 c0             	xorps  xmm0,xmm0
 108df7e:	41 0f 11 46 60       	movups XMMWORD PTR [r14+0x60],xmm0
 108df83:	49 83 66 70 00       	and    QWORD PTR [r14+0x70],0x0
 108df88:	c6 43 78 01          	mov    BYTE PTR [rbx+0x78],0x1
 108df8c:	31 c0                	xor    eax,eax
 108df8e:	88 83 80 00 00 00    	mov    BYTE PTR [rbx+0x80],al
 108df94:	88 83 98 00 00 00    	mov    BYTE PTR [rbx+0x98],al
 108df9a:	41 38 86 98 00 00 00 	cmp    BYTE PTR [r14+0x98],al
 108dfa1:	74 37                	je     108dfda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2553f0>
 108dfa3:	48 8d 83 80 00 00 00 	lea    rax,[rbx+0x80]
 108dfaa:	49 8b 8e 90 00 00 00 	mov    rcx,QWORD PTR [r14+0x90]
 108dfb1:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108dfb5:	41 0f 10 86 80 00 00 	movups xmm0,XMMWORD PTR [r14+0x80]
 108dfbc:	00 
 108dfbd:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108dfc0:	0f 57 c0             	xorps  xmm0,xmm0
 108dfc3:	41 0f 11 86 80 00 00 	movups XMMWORD PTR [r14+0x80],xmm0
 108dfca:	00 
 108dfcb:	49 83 a6 90 00 00 00 	and    QWORD PTR [r14+0x90],0x0
 108dfd2:	00 
 108dfd3:	c6 83 98 00 00 00 01 	mov    BYTE PTR [rbx+0x98],0x1
 108dfda:	31 c0                	xor    eax,eax
 108dfdc:	88 83 a0 00 00 00    	mov    BYTE PTR [rbx+0xa0],al
 108dfe2:	88 83 b8 00 00 00    	mov    BYTE PTR [rbx+0xb8],al
 108dfe8:	41 38 86 b8 00 00 00 	cmp    BYTE PTR [r14+0xb8],al
 108dfef:	74 37                	je     108e028 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25543e>
 108dff1:	48 8d 83 a0 00 00 00 	lea    rax,[rbx+0xa0]
 108dff8:	49 8b 8e b0 00 00 00 	mov    rcx,QWORD PTR [r14+0xb0]
 108dfff:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108e003:	41 0f 10 86 a0 00 00 	movups xmm0,XMMWORD PTR [r14+0xa0]
 108e00a:	00 
 108e00b:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108e00e:	0f 57 c0             	xorps  xmm0,xmm0
 108e011:	41 0f 11 86 a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm0
 108e018:	00 
 108e019:	49 83 a6 b0 00 00 00 	and    QWORD PTR [r14+0xb0],0x0
 108e020:	00 
 108e021:	c6 83 b8 00 00 00 01 	mov    BYTE PTR [rbx+0xb8],0x1
 108e028:	31 c0                	xor    eax,eax
 108e02a:	88 83 c0 00 00 00    	mov    BYTE PTR [rbx+0xc0],al
 108e030:	88 83 d8 00 00 00    	mov    BYTE PTR [rbx+0xd8],al
 108e036:	41 38 86 d8 00 00 00 	cmp    BYTE PTR [r14+0xd8],al
 108e03d:	74 37                	je     108e076 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25548c>
 108e03f:	48 8d 83 c0 00 00 00 	lea    rax,[rbx+0xc0]
 108e046:	49 8b 8e d0 00 00 00 	mov    rcx,QWORD PTR [r14+0xd0]
 108e04d:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108e051:	41 0f 10 86 c0 00 00 	movups xmm0,XMMWORD PTR [r14+0xc0]
 108e058:	00 
 108e059:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108e05c:	0f 57 c0             	xorps  xmm0,xmm0
 108e05f:	41 0f 11 86 c0 00 00 	movups XMMWORD PTR [r14+0xc0],xmm0
 108e066:	00 
 108e067:	49 83 a6 d0 00 00 00 	and    QWORD PTR [r14+0xd0],0x0
 108e06e:	00 
 108e06f:	c6 83 d8 00 00 00 01 	mov    BYTE PTR [rbx+0xd8],0x1
 108e076:	31 c0                	xor    eax,eax
 108e078:	88 83 e0 00 00 00    	mov    BYTE PTR [rbx+0xe0],al
 108e07e:	88 83 f8 00 00 00    	mov    BYTE PTR [rbx+0xf8],al
 108e084:	41 38 86 f8 00 00 00 	cmp    BYTE PTR [r14+0xf8],al
 108e08b:	74 37                	je     108e0c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2554da>
 108e08d:	48 8d 83 e0 00 00 00 	lea    rax,[rbx+0xe0]
 108e094:	49 8b 8e f0 00 00 00 	mov    rcx,QWORD PTR [r14+0xf0]
 108e09b:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108e09f:	41 0f 10 86 e0 00 00 	movups xmm0,XMMWORD PTR [r14+0xe0]
 108e0a6:	00 
 108e0a7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108e0aa:	0f 57 c0             	xorps  xmm0,xmm0
 108e0ad:	41 0f 11 86 e0 00 00 	movups XMMWORD PTR [r14+0xe0],xmm0
 108e0b4:	00 
 108e0b5:	49 83 a6 f0 00 00 00 	and    QWORD PTR [r14+0xf0],0x0
 108e0bc:	00 
 108e0bd:	c6 83 f8 00 00 00 01 	mov    BYTE PTR [rbx+0xf8],0x1
 108e0c4:	31 c0                	xor    eax,eax
 108e0c6:	88 83 00 01 00 00    	mov    BYTE PTR [rbx+0x100],al
 108e0cc:	88 83 18 01 00 00    	mov    BYTE PTR [rbx+0x118],al
 108e0d2:	41 38 86 18 01 00 00 	cmp    BYTE PTR [r14+0x118],al
 108e0d9:	74 37                	je     108e112 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255528>
 108e0db:	48 8d 83 00 01 00 00 	lea    rax,[rbx+0x100]
 108e0e2:	49 8b 8e 10 01 00 00 	mov    rcx,QWORD PTR [r14+0x110]
 108e0e9:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108e0ed:	41 0f 10 86 00 01 00 	movups xmm0,XMMWORD PTR [r14+0x100]
 108e0f4:	00 
 108e0f5:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108e0f8:	0f 57 c0             	xorps  xmm0,xmm0
 108e0fb:	41 0f 11 86 00 01 00 	movups XMMWORD PTR [r14+0x100],xmm0
 108e102:	00 
 108e103:	49 83 a6 10 01 00 00 	and    QWORD PTR [r14+0x110],0x0
 108e10a:	00 
 108e10b:	c6 83 18 01 00 00 01 	mov    BYTE PTR [rbx+0x118],0x1
 108e112:	31 c0                	xor    eax,eax
 108e114:	88 83 20 01 00 00    	mov    BYTE PTR [rbx+0x120],al
 108e11a:	88 83 38 01 00 00    	mov    BYTE PTR [rbx+0x138],al
 108e120:	41 38 86 38 01 00 00 	cmp    BYTE PTR [r14+0x138],al
 108e127:	74 37                	je     108e160 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x255576>
 108e129:	48 8d 83 20 01 00 00 	lea    rax,[rbx+0x120]
 108e130:	49 8b 8e 30 01 00 00 	mov    rcx,QWORD PTR [r14+0x130]
 108e137:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
 108e13b:	41 0f 10 86 20 01 00 	movups xmm0,XMMWORD PTR [r14+0x120]
 108e142:	00 
 108e143:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
 108e146:	0f 57 c0             	xorps  xmm0,xmm0
 108e149:	41 0f 11 86 20 01 00 	movups XMMWORD PTR [r14+0x120],xmm0
 108e150:	00 
 108e151:	49 83 a6 30 01 00 00 	and    QWORD PTR [r14+0x130],0x0
 108e158:	00 
 108e159:	c6 83 38 01 00 00 01 	mov    BYTE PTR [rbx+0x138],0x1
 108e160:	31 c0                	xor    eax,eax
 108e162:	88 83 40 01 00 00    	mov    BYTE PTR [rbx+0x140],al
 108e168:	88 83 58 01 00 00    	mov    BYTE PTR [rbx+0x158],al
 108e16e:	41 38 86 58 01 00 00 	cmp    BYTE PTR [r14+0x158],al
 108e175:	74 37                	je     108e1ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2555c4>
 108e177:	48 8d 83 40 01 00 00 	lea    rax,[rbx+0x140]
 108e17e:	49                   	rex.WB
 108e17f:	8b                   	.byte 0x8b

## Head qword stores/copies
 12240fc:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 1224103:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 1224115:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
 122411d:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
 122412e:	48 89 47 40          	mov    QWORD PTR [rdi+0x40],rax
 1224136:	0f 11 4f 30          	movups XMMWORD PTR [rdi+0x30],xmm1
 1224147:	48 89 47 58          	mov    QWORD PTR [rdi+0x58],rax
 122414f:	0f 11 4f 48          	movups XMMWORD PTR [rdi+0x48],xmm1
 1224160:	48 89 47 70          	mov    QWORD PTR [rdi+0x70],rax
 1224168:	0f 11 4f 60          	movups XMMWORD PTR [rdi+0x60],xmm1
 122417d:	48 89 4f 7d          	mov    QWORD PTR [rdi+0x7d],rcx
 1224181:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
 122418c:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
 122419a:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
 12241c4:	8a 87 c0 00 00 00    	mov    al,BYTE PTR [rdi+0xc0]
 12241ec:	c6 83 c0 00 00 00 00 	mov    BYTE PTR [rbx+0xc0],0x0
 1224219:	83 7f 20 ff          	cmp    DWORD PTR [rdi+0x20],0xffffffff
 122422f:	48 89 1f             	mov    QWORD PTR [rdi],rbx
 1224270:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 1224273:	83 7f 20 01          	cmp    DWORD PTR [rdi+0x20],0x1
 122428c:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
 122428f:	83 7f 20 02          	cmp    DWORD PTR [rdi+0x20],0x2
 12242a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 12242d2:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
 1224331:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
 1224348:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1224351:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1224354:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 122436a:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1224373:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1224376:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 122438c:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 1224395:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 1224398:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 12243ae:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 12243b7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 12243ba:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 12243d0:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 12243d9:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 12243dc:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 12243f2:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
 12243fb:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
 12243fe:	48 83 23 00          	and    QWORD PTR [rbx],0x0
 122441c:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
 122441f:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 122446c:	8b 87 90 02 00 00    	mov    eax,DWORD PTR [rdi+0x290]
 122448e:	83 8b 90 02 00 00 ff 	or     DWORD PTR [rbx+0x290],0xffffffff

## High address constants
 1224232:	48 8d 0d a7 8a 63 00 	lea    rcx,[rip+0x638aa7]        # 185cce0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x193c8>
 122447c:	48 8d 0d fd 87 63 00 	lea    rcx,[rip+0x6387fd]        # 185cc80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19368>
