# Exact registry facade candidate

## 0xb0fa2f..0xb0fb4f

/tmp/regfac3/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b0fa2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5c9cf>:
  b0fa2f:	55                   	push   rbp
  b0fa30:	41 57                	push   r15
  b0fa32:	41 56                	push   r14
  b0fa34:	41 55                	push   r13
  b0fa36:	41 54                	push   r12
  b0fa38:	53                   	push   rbx
  b0fa39:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
  b0fa40:	44 89 cb             	mov    ebx,r9d
  b0fa43:	4c 89 44 24 20       	mov    QWORD PTR [rsp+0x20],r8
  b0fa48:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
  b0fa4d:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
  b0fa52:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b0fa59:	00 00 
  b0fa5b:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
  b0fa62:	00 
  b0fa63:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
  b0fa68:	48 89 f7             	mov    rdi,rsi
  b0fa6b:	48 89 d6             	mov    rsi,rdx
  b0fa6e:	4c 89 e2             	mov    rdx,r12
  b0fa71:	e8 d6 67 c9 00       	call   17a624c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a3b8>
  b0fa76:	e8 e5 e6 cd 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
  b0fa7b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  b0fa80:	49 8b 6c 24 0c       	mov    rbp,QWORD PTR [r12+0xc]
  b0fa85:	48 0f cd             	bswap  rbp
  b0fa88:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]
  b0fa8d:	4c 89 ef             	mov    rdi,r13
  b0fa90:	e8 8f 54 c9 00       	call   17a4f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159090>
  b0fa95:	6a ff                	push   0xffffffffffffffff
  b0fa97:	41 5c                	pop    r12
  b0fa99:	89 d9                	mov    ecx,ebx
  b0fa9b:	41 d3 e4             	shl    r12d,cl
  b0fa9e:	41 f7 d4             	not    r12d
  b0faa1:	45 31 ff             	xor    r15d,r15d
  b0faa4:	4d 8d 34 2f          	lea    r14,[r15+rbp*1]
  b0faa8:	49 0f ce             	bswap  r14
  b0faab:	4c 89 b4 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r14
  b0fab2:	00 
  b0fab3:	4c 89 fb             	mov    rbx,r15
  b0fab6:	48 0f cb             	bswap  rbx
  b0fab9:	48 89 9c 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rbx
  b0fac0:	00 
  b0fac1:	4c 89 ef             	mov    rdi,r13
  b0fac4:	e8 5b 54 c9 00       	call   17a4f24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159090>
  b0fac9:	4c 89 ef             	mov    rdi,r13
  b0facc:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
  b0fad1:	48 8b 54 24 20       	mov    rdx,QWORD PTR [rsp+0x20]
  b0fad6:	e8 07 66 c9 00       	call   17a60e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a24e>
  b0fadb:	4c 89 ef             	mov    rdi,r13
  b0fade:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  b0fae5:	00 
  b0fae6:	6a 10                	push   0x10
  b0fae8:	5a                   	pop    rdx
  b0fae9:	e8 f4 65 c9 00       	call   17a60e2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a24e>
  b0faee:	4c 89 ef             	mov    rdi,r13
  b0faf1:	48 8d 74 24 3c       	lea    rsi,[rsp+0x3c]
  b0faf6:	e8 a7 66 c9 00       	call   17a61a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a30e>
  b0fafb:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
  b0fb00:	48 0f c8             	bswap  rax
  b0fb03:	49 ff c7             	inc    r15
  b0fb06:	44 85 e0             	test   eax,r12d
  b0fb09:	75 99                	jne    b0faa4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5ca44>
  b0fb0b:	e8 50 e6 cd 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
  b0fb10:	48 2b 44 24 08       	sub    rax,QWORD PTR [rsp+0x8]
  b0fb15:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
  b0fb1a:	4c 89 31             	mov    QWORD PTR [rcx],r14
  b0fb1d:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
  b0fb21:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  b0fb25:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b0fb2c:	00 00 
  b0fb2e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
  b0fb35:	00 
  b0fb36:	75 12                	jne    b0fb4a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5caea>
  b0fb38:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
  b0fb3f:	5b                   	pop    rbx
  b0fb40:	41 5c                	pop    r12
  b0fb42:	41 5d                	pop    r13
  b0fb44:	41 5e                	pop    r14
  b0fb46:	41 5f                	pop    r15
  b0fb48:	5d                   	pop    rbp
  b0fb49:	c3                   	ret
  b0fb4a:	e8 61 ff cd 00       	call   17efab0 <__stack_chk_fail@plt>

## callers
347948-  b0799c:	48 83 c0 10          	add    rax,0x10
347949-  b079a0:	f6 c1 01             	test   cl,0x1
347950-  b079a3:	49 63 d5             	movsxd rdx,r13d
347951-  b079a6:	48 8d 4c d1 07       	lea    rcx,[rcx+rdx*8+0x7]
347952-  b079ab:	48 0f 44 c8          	cmove  rcx,rax
347953-  b079af:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
347954-  b079b2:	8b 43 1c             	mov    eax,DWORD PTR [rbx+0x1c]
347955-  b079b5:	83 f8 02             	cmp    eax,0x2
347956-  b079b8:	4c 8b bc 24 f0 03 00 	mov    r15,QWORD PTR [rsp+0x3f0]
347957-  b079bf:	00 
347958-  b079c0:	0f 84 90 00 00 00    	je     b07a56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x549f6>
347959-  b079c6:	83 f8 01             	cmp    eax,0x1
347960-  b079c9:	0f 85 b4 04 00 00    	jne    b07e83 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54e23>
347961-  b079cf:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
347962-  b079d3:	48 83 e0 fc          	and    rax,0xfffffffffffffffc
347963-  b079d7:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
347964-  b079db:	4c 8b 57 18          	mov    r10,QWORD PTR [rdi+0x18]
347965-  b079df:	49 83 e2 fc          	and    r10,0xfffffffffffffffc
347966-  b079e3:	0f b6 08             	movzx  ecx,BYTE PTR [rax]
347967-  b079e6:	48 8d 70 01          	lea    rsi,[rax+0x1]
347968-  b079ea:	89 ca                	mov    edx,ecx
347969-  b079ec:	d1 ea                	shr    edx,1
347970-  b079ee:	f6 c1 01             	test   cl,0x1
347971-  b079f1:	48 0f 45 70 10       	cmovne rsi,QWORD PTR [rax+0x10]
347972-  b079f6:	48 0f 45 50 08       	cmovne rdx,QWORD PTR [rax+0x8]
347973-  b079fb:	41 0f b6 02          	movzx  eax,BYTE PTR [r10]
347974-  b079ff:	49 8d 4a 01          	lea    rcx,[r10+0x1]
347975-  b07a03:	41 89 c0             	mov    r8d,eax
347976-  b07a06:	41 d1 e8             	shr    r8d,1
347977-  b07a09:	a8 01                	test   al,0x1
347978-  b07a0b:	49 0f 45 4a 10       	cmovne rcx,QWORD PTR [r10+0x10]
347979-  b07a10:	44 8b 4f 20          	mov    r9d,DWORD PTR [rdi+0x20]
347980-  b07a14:	4d 0f 45 42 08       	cmovne r8,QWORD PTR [r10+0x8]
347981-  b07a19:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
347982-  b07a20:	00 
347983:  b07a21:	e8 09 80 00 00       	call   b0fa2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5c9cf>
347984-  b07a26:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
347985-  b07a2b:	48 89 df             	mov    rdi,rbx
347986-  b07a2e:	e8 f1 06 00 00       	call   b08124 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x550c4>
347987-  b07a33:	48 83 c0 10          	add    rax,0x10
347988-  b07a37:	48 89 c7             	mov    rdi,rax
347989-  b07a3a:	e8 15 07 00 00       	call   b08154 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x550f4>
347990-  b07a3f:	49 89 c4             	mov    r12,rax
347991-  b07a42:	83 78 1c 01          	cmp    DWORD PTR [rax+0x1c],0x1
347992-  b07a46:	0f 85 d6 00 00 00    	jne    b07b22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ac2>
347993-  b07a4c:	4d 8b 7c 24 10       	mov    r15,QWORD PTR [r12+0x10]
347994-  b07a51:	e9 f9 00 00 00       	jmp    b07b4f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54aef>
347995-  b07a56:	83 a4 24 b0 01 00 00 	and    DWORD PTR [rsp+0x1b0],0x0
347996-  b07a5d:	00 
347997-  b07a5e:	0f 57 c0             	xorps  xmm0,xmm0
347998-  b07a61:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
347999-  b07a68:	00 
348000-  b07a69:	0f 11 84 24 c8 01 00 	movups XMMWORD PTR [rsp+0x1c8],xmm0
348001-  b07a70:	00 
348002-  b07a71:	0f 11 84 24 d8 01 00 	movups XMMWORD PTR [rsp+0x1d8],xmm0
348003-  b07a78:	00 
348004-  b07a79:	0f 11 84 24 e8 01 00 	movups XMMWORD PTR [rsp+0x1e8],xmm0
348005-  b07a80:	00 
348006-  b07a81:	0f 11 84 24 f8 01 00 	movups XMMWORD PTR [rsp+0x1f8],xmm0
348007-  b07a88:	00 
348008-  b07a89:	48 83 a4 24 30 02 00 	and    QWORD PTR [rsp+0x230],0x0
348009-  b07a90:	00 00 
348010-  b07a92:	48 83 a4 24 60 02 00 	and    QWORD PTR [rsp+0x260],0x0
348011-  b07a99:	00 00 
348012-  b07a9b:	48 83 a4 24 90 02 00 	and    QWORD PTR [rsp+0x290],0x0
348013-  b07aa2:	00 00 
348014-  b07aa4:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
348015-  b07aa8:	8b 48 20             	mov    ecx,DWORD PTR [rax+0x20]
348016-  b07aab:	83 f9 02             	cmp    ecx,0x2
348017-  b07aae:	73 3e                	jae    b07aee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54a8e>
348018-  b07ab0:	89 8c 24 b0 01 00 00 	mov    DWORD PTR [rsp+0x1b0],ecx
348019-  b07ab7:	8b 48 24             	mov    ecx,DWORD PTR [rax+0x24]
348020-  b07aba:	85 c9                	test   ecx,ecx
348021-  b07abc:	0f 88 24 01 00 00    	js     b07be6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54b86>
348022-  b07ac2:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
348023-  b07ac9:	00 
348024-  b07aca:	48 89 4f f8          	mov    QWORD PTR [rdi-0x8],rcx
348025-  b07ace:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
348026-  b07ad2:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
348027-  b07ad6:	e8 a5 65 ce 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
348028-  b07adb:	83 7b 1c 02          	cmp    DWORD PTR [rbx+0x1c],0x2
348029-  b07adf:	0f 85 7d 01 00 00    	jne    b07c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54c02>
348030-  b07ae5:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
348031-  b07ae9:	e9 7b 01 00 00       	jmp    b07c69 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54c09>
348032-  b07aee:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
348033-  b07af3:	80 88 18 01 00 00 04 	or     BYTE PTR [rax+0x118],0x4
348034-  b07afa:	48 8d b8 68 01 00 00 	lea    rdi,[rax+0x168]
348035-  b07b01:	48 8b 90 10 01 00 00 	mov    rdx,QWORD PTR [rax+0x110]
348036-  b07b08:	f6 c2 01             	test   dl,0x1
348037-  b07b0b:	0f 85 ba 03 00 00    	jne    b07ecb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54e6b>
348038-  b07b11:	48 8d 35 4a 18 87 ff 	lea    rsi,[rip+0xffffffffff87184a]        # 379362 <_ZTSSt12bad_any_cast@@Base-0x16e66>
--
352063-  b0b661:	f6 c1 01             	test   cl,0x1
352064-  b0b664:	49 63 d5             	movsxd rdx,r13d
352065-  b0b667:	48 8d 4c d1 07       	lea    rcx,[rcx+rdx*8+0x7]
352066-  b0b66c:	48 0f 44 c8          	cmove  rcx,rax
352067-  b0b670:	48 8b 19             	mov    rbx,QWORD PTR [rcx]
352068-  b0b673:	8b 43 1c             	mov    eax,DWORD PTR [rbx+0x1c]
352069-  b0b676:	ff c8                	dec    eax
352070-  b0b678:	83 f8 03             	cmp    eax,0x3
352071-  b0b67b:	0f 87 ee 09 00 00    	ja     b0c06f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5900f>
352072-  b0b681:	48 8d 0d 58 a1 88 ff 	lea    rcx,[rip+0xffffffffff88a158]        # 3957e0 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x23c1>
352073-  b0b688:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
352074-  b0b68c:	48 01 c8             	add    rax,rcx
352075-  b0b68f:	ff e0                	jmp    rax
352076-  b0b691:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
352077-  b0b696:	48 83 e0 fc          	and    rax,0xfffffffffffffffc
352078-  b0b69a:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
352079-  b0b69e:	4c 8b 57 18          	mov    r10,QWORD PTR [rdi+0x18]
352080-  b0b6a2:	49 83 e2 fc          	and    r10,0xfffffffffffffffc
352081-  b0b6a6:	0f b6 08             	movzx  ecx,BYTE PTR [rax]
352082-  b0b6a9:	48 8d 70 01          	lea    rsi,[rax+0x1]
352083-  b0b6ad:	89 ca                	mov    edx,ecx
352084-  b0b6af:	d1 ea                	shr    edx,1
352085-  b0b6b1:	f6 c1 01             	test   cl,0x1
352086-  b0b6b4:	48 0f 45 70 10       	cmovne rsi,QWORD PTR [rax+0x10]
352087-  b0b6b9:	48 0f 45 50 08       	cmovne rdx,QWORD PTR [rax+0x8]
352088-  b0b6be:	41 0f b6 02          	movzx  eax,BYTE PTR [r10]
352089-  b0b6c2:	49 8d 4a 01          	lea    rcx,[r10+0x1]
352090-  b0b6c6:	41 89 c0             	mov    r8d,eax
352091-  b0b6c9:	41 d1 e8             	shr    r8d,1
352092-  b0b6cc:	a8 01                	test   al,0x1
352093-  b0b6ce:	49 0f 45 4a 10       	cmovne rcx,QWORD PTR [r10+0x10]
352094-  b0b6d3:	44 8b 4f 20          	mov    r9d,DWORD PTR [rdi+0x20]
352095-  b0b6d7:	4d 0f 45 42 08       	cmovne r8,QWORD PTR [r10+0x8]
352096-  b0b6dc:	48 8d bc 24 60 03 00 	lea    rdi,[rsp+0x360]
352097-  b0b6e3:	00 
352098:  b0b6e4:	e8 46 43 00 00       	call   b0fa2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5c9cf>
352099-  b0b6e9:	4c 89 ff             	mov    rdi,r15
352100-  b0b6ec:	e8 e3 0b 00 00       	call   b0c2d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x59274>
352101-  b0b6f1:	48 83 c0 10          	add    rax,0x10
352102-  b0b6f5:	48 89 c7             	mov    rdi,rax
352103-  b0b6f8:	e8 07 0c 00 00       	call   b0c304 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x592a4>
352104-  b0b6fd:	49 89 c6             	mov    r14,rax
352105-  b0b700:	83 78 1c 01          	cmp    DWORD PTR [rax+0x1c],0x1
352106-  b0b704:	0f 85 89 04 00 00    	jne    b0bb93 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x58b33>
352107-  b0b70a:	49 8b 5e 10          	mov    rbx,QWORD PTR [r14+0x10]
352108-  b0b70e:	e9 aa 04 00 00       	jmp    b0bbbd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x58b5d>
352109-  b0b713:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
352110-  b0b71a:	00 
352111-  b0b71b:	48 83 67 50 00       	and    QWORD PTR [rdi+0x50],0x0
352112-  b0b720:	0f 57 c0             	xorps  xmm0,xmm0
352113-  b0b723:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
352114-  b0b726:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
352115-  b0b72a:	0f 29 47 20          	movaps XMMWORD PTR [rdi+0x20],xmm0
352116-  b0b72e:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
352117-  b0b732:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
352118-  b0b736:	48 85 c0             	test   rax,rax
352119-  b0b739:	48 8d 0d a8 85 db 00 	lea    rcx,[rip+0xdb85a8]        # 18c3ce8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0xb0f8>
352120-  b0b740:	48 0f 45 c8          	cmovne rcx,rax
352121-  b0b744:	48 8b 71 18          	mov    rsi,QWORD PTR [rcx+0x18]
352122-  b0b748:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
352123-  b0b74c:	e8 2f 29 ce 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
352124-  b0b751:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
352125-  b0b756:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
352126-  b0b75b:	48 8d b0 90 00 00 00 	lea    rsi,[rax+0x90]
352127-  b0b762:	48 8d bc 24 88 02 00 	lea    rdi,[rsp+0x288]
352128-  b0b769:	00 
352129-  b0b76a:	e8 11 29 ce 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
352130-  b0b76f:	83 7b 1c 03          	cmp    DWORD PTR [rbx+0x1c],0x3
352131-  b0b773:	0f 85 49 02 00 00    	jne    b0b9c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x58962>
352132-  b0b779:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
352133-  b0b77d:	e9 47 02 00 00       	jmp    b0b9c9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x58969>
352134-  b0b782:	0f 57 c0             	xorps  xmm0,xmm0
352135-  b0b785:	0f 29 84 24 70 02 00 	movaps XMMWORD PTR [rsp+0x270],xmm0
352136-  b0b78c:	00 
352137-  b0b78d:	48 83 a4 24 80 02 00 	and    QWORD PTR [rsp+0x280],0x0
352138-  b0b794:	00 00 
352139-  b0b796:	48 83 a4 24 b0 02 00 	and    QWORD PTR [rsp+0x2b0],0x0
352140-  b0b79d:	00 00 
352141-  b0b79f:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
352142-  b0b7a3:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
352143-  b0b7a7:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
352144-  b0b7ab:	f6 07 01             	test   BYTE PTR [rdi],0x1
352145-  b0b7ae:	0f 84 88 00 00 00    	je     b0b83c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x587dc>
352146-  b0b7b4:	48 8b 5f 10          	mov    rbx,QWORD PTR [rdi+0x10]
352147-  b0b7b8:	e9 83 00 00 00       	jmp    b0b840 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x587e0>
352148-  b0b7bd:	83 a4 24 70 02 00 00 	and    DWORD PTR [rsp+0x270],0x0
352149-  b0b7c4:	00 
352150-  b0b7c5:	0f 57 c0             	xorps  xmm0,xmm0
352151-  b0b7c8:	0f 11 84 24 78 02 00 	movups XMMWORD PTR [rsp+0x278],xmm0
352152-  b0b7cf:	00 
352153-  b0b7d0:	0f 11 84 24 88 02 00 	movups XMMWORD PTR [rsp+0x288],xmm0

## xrefs to b0fb1a neighborhood / jumps into FDE
346613:  b064fe:	e8 c9 96 00 00       	call   b0fbcc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb6c>
347983:  b07a21:	e8 09 80 00 00       	call   b0fa2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5c9cf>
350850:  b0a2de:	e8 e9 58 00 00       	call   b0fbcc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb6c>
352098:  b0b6e4:	e8 46 43 00 00       	call   b0fa2f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5c9cf>
353709:  b0cf55:	e8 f5 2b 00 00       	call   b0fb4f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5caef>
353724:  b0cf8b:	e8 bf 2b 00 00       	call   b0fb4f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5caef>
353737:  b0cfbb:	e8 a9 2b 00 00       	call   b0fb69 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb09>
353744:  b0cfd4:	e8 d9 2b 00 00       	call   b0fbb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb52>
356848:  b0fa1d:	75 0b                	jne    b0fa2a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5c9ca>
356914:  b0fb09:	75 99                	jne    b0faa4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5ca44>
356925:  b0fb36:	75 12                	jne    b0fb4a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5caea>
356936:  b0fb52:	74 14                	je     b0fb68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb08>
356939:  b0fb58:	75 06                	jne    b0fb60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb00>
356945:  b0fb66:	75 ee                	jne    b0fb56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5caf6>
356959:  b0fb8b:	74 1a                	je     b0fba7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb47>
356962:  b0fb94:	74 14                	je     b0fbaa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb4a>
356965:  b0fb9b:	74 05                	je     b0fba2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb42>
356969:  b0fba5:	eb ea                	jmp    b0fb91 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb31>
356976:  b0fbb5:	74 06                	je     b0fbbd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb5d>
356978:  b0fbbb:	eb 04                	jmp    b0fbc1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb61>
721192:  c5841f:	e8 45 77 eb ff       	call   b0fb69 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb09>
721199:  c58438:	e8 75 77 eb ff       	call   b0fbb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb52>
770717:  c84748:	e8 1c b4 e8 ff       	call   b0fb69 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb09>
770724:  c84761:	e8 4c b4 e8 ff       	call   b0fbb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb52>
2527583: 12c8082:	e8 c8 7a 84 ff       	call   b0fb4f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5caef>
3100162: 14d6373:	0f 85 39 98 63 ff    	jne    b0fbb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb52>
3120027: 14e839f:	e8 0e 78 62 ff       	call   b0fbb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb52>
3156360: 1509845:	e8 68 63 60 ff       	call   b0fbb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb52>
3752538: 171d478:	e8 35 27 3f ff       	call   b0fbb2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb52>
