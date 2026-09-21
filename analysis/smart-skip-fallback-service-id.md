# Fallback smart-skip registry accessor

## b9150c

/tmp/fbsvc/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b914b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde450>:
  b914b0:	3b 44 24 60          	cmp    eax,DWORD PTR [rsp+0x60]
  b914b4:	75 51                	jne    b91507 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4a7>
  b914b6:	48 89 c8             	mov    rax,rcx
  b914b9:	48 83 c4 68          	add    rsp,0x68
  b914bd:	5b                   	pop    rbx
  b914be:	41 5c                	pop    r12
  b914c0:	41 5d                	pop    r13
  b914c2:	41 5e                	pop    r14
  b914c4:	41 5f                	pop    r15
  b914c6:	5d                   	pop    rbp
  b914c7:	c3                   	ret
  b914c8:	49 89 c6             	mov    r14,rax
  b914cb:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  b914d0:	e8 95 8a ee ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b914d5:	eb 05                	jmp    b914dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde47c>
  b914d7:	eb 00                	jmp    b914d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde479>
  b914d9:	49 89 c6             	mov    r14,rax
  b914dc:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  b914e1:	e8 84 8a ee ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  b914e6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b914ed:	00 00 
  b914ef:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
  b914f4:	75 11                	jne    b91507 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4a7>
  b914f6:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  b914fa:	e8 21 ca c5 00       	call   17edf20 <_ZdlPv@plt>
  b914ff:	4c 89 f7             	mov    rdi,r14
  b91502:	e8 c9 e7 ed ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b91507:	e8 a4 e5 c5 00       	call   17efab0 <__stack_chk_fail@plt>
  b9150c:	53                   	push   rbx
  b9150d:	48 89 fb             	mov    rbx,rdi
  b91510:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b91514:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b91518:	6a 32                	push   0x32
  b9151a:	5a                   	pop    rdx
  b9151b:	e8 be 0d fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b91520:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b91523:	48 8b 80 90 01 00 00 	mov    rax,QWORD PTR [rax+0x190]
  b9152a:	48 85 c0             	test   rax,rax
  b9152d:	74 02                	je     b91531 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4d1>
  b9152f:	5b                   	pop    rbx
  b91530:	c3                   	ret
  b91531:	e8 89 8a ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b91536:	41 56                	push   r14
  b91538:	53                   	push   rbx
  b91539:	48 83 ec 28          	sub    rsp,0x28
  b9153d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b91544:	00 00 
  b91546:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  b9154b:	48 39 fe             	cmp    rsi,rdi
  b9154e:	0f 84 c2 00 00 00    	je     b91616 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde5b6>
  b91554:	48 89 f3             	mov    rbx,rsi
  b91557:	49 89 fe             	mov    r14,rdi
  b9155a:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
  b9155e:	48 8b 4e 20          	mov    rcx,QWORD PTR [rsi+0x20]
  b91562:	48 39 f8             	cmp    rax,rdi
  b91565:	74 12                	je     b91579 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde519>
  b91567:	48 39 d9             	cmp    rcx,rbx
  b9156a:	74 32                	je     b9159e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde53e>
  b9156c:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
  b91570:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
  b91574:	e9 9d 00 00 00       	jmp    b91616 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde5b6>
  b91579:	48 39 d9             	cmp    rcx,rbx
  b9157c:	74 44                	je     b915c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde562>
  b9157e:	49 8b 06             	mov    rax,QWORD PTR [r14]
  b91581:	4c 89 f7             	mov    rdi,r14
  b91584:	48 89 de             	mov    rsi,rbx
  b91587:	ff 50 18             	call   QWORD PTR [rax+0x18]
  b9158a:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  b9158e:	48                   	rex.W
  b9158f:	8b                   	.byte 0x8b

## primary b632ca reference

/tmp/fbsvc/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b632c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0260>:
  b632c0:	c0 74 02 5b c3       	shl    BYTE PTR [rdx+rax*1+0x5b],0xc3
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
