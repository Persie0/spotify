# Registry facade constructor candidates

## Candidate b0fa2f

/tmp/regfac2/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b0fa00 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5c9a0>:
  b0fa00:	00 f3                	add    bl,dh
  b0fa02:	ff                   	(bad)
  b0fa03:	ff 4c 89 f7          	dec    DWORD PTR [rcx+rcx*4-0x9]
  b0fa07:	e8 04 f2 ff ff       	call   b0ec10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5bbb0>
  b0fa0c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b0fa13:	00 00 
  b0fa15:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
  b0fa1c:	00 
  b0fa1d:	75 0b                	jne    b0fa2a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5c9ca>
  b0fa1f:	48 81 c4 08 01 00 00 	add    rsp,0x108
  b0fa26:	5b                   	pop    rbx
  b0fa27:	41 5e                	pop    r14
  b0fa29:	c3                   	ret
  b0fa2a:	e8 81 00 ce 00       	call   17efab0 <__stack_chk_fail@plt>
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
  b0fb4f:	48 39 f7             	cmp    rdi,rsi
  b0fb52:	74 14                	je     b0fb68 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb08>
  b0fb54:	8a 02                	mov    al,BYTE PTR [rdx]
  b0fb56:	38 07                	cmp    BYTE PTR [rdi],al
  b0fb58:	75 06                	jne    b0fb60 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5cb00>
  b0fb5a:	8a 01                	mov    al,BYTE PTR [rcx]
  b0fb5c:	88 07                	mov    BYTE PTR [rdi],al
  b0fb5e:	8a 02                	mov    al,BYTE PTR [rdx]
  b0fb60:	48 ff c7             	inc    rdi
  b0fb63:	48 39 f7             	cmp    rdi,rsi
  b0fb66:	75 ee                	jne    b0fb56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x5caf6>
  b0fb68:	c3                   	ret
  b0fb69:	41 56                	push   r14
  b0fb6b:	53                   	push   rbx
  b0fb6c:	50                   	push   rax
  b0fb6d:	49 89 d6             	mov    r14,rdx

### direct callers of b0fa2f
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
--
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

## Candidate b633b2

/tmp/regfac2/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b63390 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0330>:
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
  b6346a:	c6                   	.byte 0xc6
  b6346b:	83 cc 00             	or     esp,0x0
	...

### direct callers of b633b2

## Candidate b34da0

/tmp/regfac2/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b34d70 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d10>:
  b34d70:	89 ff                	mov    edi,edi
  b34d72:	e8 6b 9a f6 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
  b34d77:	49 89 c7             	mov    r15,rax
  b34d7a:	48 39 d8             	cmp    rax,rbx
  b34d7d:	75 dd                	jne    b34d5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81cfc>
  b34d7f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b34d86:	00 00 
  b34d88:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  b34d8d:	75 0c                	jne    b34d9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d3b>
  b34d8f:	48 83 c4 28          	add    rsp,0x28
  b34d93:	5b                   	pop    rbx
  b34d94:	41 5c                	pop    r12
  b34d96:	41 5e                	pop    r14
  b34d98:	41 5f                	pop    r15
  b34d9a:	c3                   	ret
  b34d9b:	e8 10 ad cb 00       	call   17efab0 <__stack_chk_fail@plt>
  b34da0:	55                   	push   rbp
  b34da1:	41 57                	push   r15
  b34da3:	41 56                	push   r14
  b34da5:	41 55                	push   r13
  b34da7:	41 54                	push   r12
  b34da9:	53                   	push   rbx
  b34daa:	50                   	push   rax
  b34dab:	49 89 cf             	mov    r15,rcx
  b34dae:	49 89 d4             	mov    r12,rdx
  b34db1:	49 89 f6             	mov    r14,rsi
  b34db4:	48 89 fb             	mov    rbx,rdi
  b34db7:	48 89 d7             	mov    rdi,rdx
  b34dba:	e8 77 6a f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  b34dbf:	4c 89 f7             	mov    rdi,r14
  b34dc2:	48 89 c6             	mov    rsi,rax
  b34dc5:	e8 30 fd ff ff       	call   b34afa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81a9a>
  b34dca:	89 d5                	mov    ebp,edx
  b34dcc:	48 85 c0             	test   rax,rax
  b34dcf:	74 07                	je     b34dd8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d78>
  b34dd1:	49 89 c5             	mov    r13,rax
  b34dd4:	31 c0                	xor    eax,eax
  b34dd6:	eb 67                	jmp    b34e3f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81ddf>
  b34dd8:	41 8b 36             	mov    esi,DWORD PTR [r14]
  b34ddb:	ff c6                	inc    esi
  b34ddd:	4c 89 f7             	mov    rdi,r14
  b34de0:	e8 73 fd ff ff       	call   b34b58 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81af8>
  b34de5:	84 c0                	test   al,al
  b34de7:	74 15                	je     b34dfe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d9e>
  b34de9:	4c 89 e7             	mov    rdi,r12
  b34dec:	e8 45 6a f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  b34df1:	4c 89 f7             	mov    rdi,r14
  b34df4:	48 89 c6             	mov    rsi,rax
  b34df7:	e8 e4 b6 f8 ff       	call   ac04e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd480>
  b34dfc:	89 c5                	mov    ebp,eax
  b34dfe:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
  b34e02:	6a 38                	push   0x38
  b34e04:	5e                   	pop    rsi
  b34e05:	e8 4c ba f8 ff       	call   ac0856 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7f6>
  b34e0a:	49 89 c5             	mov    r13,rax
  b34e0d:	48 8d 78 08          	lea    rdi,[rax+0x8]
  b34e11:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
  b34e15:	4c 89 e2             	mov    rdx,r12
  b34e18:	e8 4b ba f8 ff       	call   ac0868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd808>
  b34e1d:	49 8d 7d 20          	lea    rdi,[r13+0x20]
  b34e21:	49 8b 76 18          	mov    rsi,QWORD PTR [r14+0x18]
  b34e25:	4c 89 fa             	mov    rdx,r15
  b34e28:	e8 3b ba f8 ff       	call   ac0868 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd808>
  b34e2d:	4c 89 f7             	mov    rdi,r14
  b34e30:	89 ee                	mov    esi,ebp
  b34e32:	4c 89 ea             	mov    rdx,r13
  b34e35:	e8 d8 b6 f8 ff       	call   ac0512 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4b2>
  b34e3a:	41 ff 06             	inc    DWORD PTR [r14]
  b34e3d:	b0 01                	mov    al,0x1
  b34e3f:	4c 89 2b             	mov    QWORD PTR [rbx],r13
  b34e42:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  b34e46:	89 6b 10             	mov    DWORD PTR [rbx+0x10],ebp
  b34e49:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
  b34e4c:	48 83 c4 08          	add    rsp,0x8
  b34e50:	5b                   	pop    rbx
  b34e51:	41 5c                	pop    r12
  b34e53:	41 5d                	pop    r13
  b34e55:	41 5e                	pop    r14
  b34e57:	41 5f                	pop    r15
  b34e59:	5d                   	pop    rbp
  b34e5a:	c3                   	ret
  b34e5b:	cc                   	int3
  b34e5c:	55                   	push   rbp
  b34e5d:	41 57                	push   r15
  b34e5f:	41 56                	push   r14
  b34e61:	41 55                	push   r13
  b34e63:	41 54                	push   r12
  b34e65:	53                   	push   rbx
  b34e66:	48 81 ec e8 01 00 00 	sub    rsp,0x1e8
  b34e6d:	49 89 cf             	mov    r15,rcx
  b34e70:	49 89 d4             	mov    r12,rdx
  b34e73:	49 89 f6             	mov    r14,rsi
  b34e76:	48 89 fb             	mov    rbx,rdi
  b34e79:	64                   	fs
  b34e7a:	48                   	rex.W
  b34e7b:	8b                   	.byte 0x8b
  b34e7c:	04 25                	add    al,0x25
  b34e7e:	28 00                	sub    BYTE PTR [rax],al

### direct callers of b34da0
401142-  b34d32:	41 57                	push   r15
401143-  b34d34:	41 56                	push   r14
401144-  b34d36:	41 54                	push   r12
401145-  b34d38:	53                   	push   rbx
401146-  b34d39:	48 83 ec 28          	sub    rsp,0x28
401147-  b34d3d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
401148-  b34d44:	00 00 
401149-  b34d46:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
401150-  b34d4b:	48 39 d6             	cmp    rsi,rdx
401151-  b34d4e:	74 2f                	je     b34d7f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d1f>
401152-  b34d50:	48 89 d3             	mov    rbx,rdx
401153-  b34d53:	49 89 f7             	mov    r15,rsi
401154-  b34d56:	49 89 fe             	mov    r14,rdi
401155-  b34d59:	49 89 e4             	mov    r12,rsp
401156-  b34d5c:	49 8d 57 20          	lea    rdx,[r15+0x20]
401157-  b34d60:	49 8d 4f 38          	lea    rcx,[r15+0x38]
401158-  b34d64:	4c 89 e7             	mov    rdi,r12
401159-  b34d67:	4c 89 f6             	mov    rsi,r14
401160:  b34d6a:	e8 31 00 00 00       	call   b34da0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d40>
401161-  b34d6f:	4c 89 ff             	mov    rdi,r15
401162-  b34d72:	e8 6b 9a f6 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
401163-  b34d77:	49 89 c7             	mov    r15,rax
401164-  b34d7a:	48 39 d8             	cmp    rax,rbx
401165-  b34d7d:	75 dd                	jne    b34d5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81cfc>
401166-  b34d7f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
401167-  b34d86:	00 00 
401168-  b34d88:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
401169-  b34d8d:	75 0c                	jne    b34d9b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d3b>
401170-  b34d8f:	48 83 c4 28          	add    rsp,0x28
401171-  b34d93:	5b                   	pop    rbx
401172-  b34d94:	41 5c                	pop    r12
401173-  b34d96:	41 5e                	pop    r14
401174-  b34d98:	41 5f                	pop    r15
401175-  b34d9a:	c3                   	ret
401176-  b34d9b:	e8 10 ad cb 00       	call   17efab0 <__stack_chk_fail@plt>
401177-  b34da0:	55                   	push   rbp
401178-  b34da1:	41 57                	push   r15
401179-  b34da3:	41 56                	push   r14
401180-  b34da5:	41 55                	push   r13
401181-  b34da7:	41 54                	push   r12
401182-  b34da9:	53                   	push   rbx
401183-  b34daa:	50                   	push   rax
401184-  b34dab:	49 89 cf             	mov    r15,rcx
401185-  b34dae:	49 89 d4             	mov    r12,rdx
401186-  b34db1:	49 89 f6             	mov    r14,rsi
401187-  b34db4:	48 89 fb             	mov    rbx,rdi
401188-  b34db7:	48 89 d7             	mov    rdi,rdx
401189-  b34dba:	e8 77 6a f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
401190-  b34dbf:	4c 89 f7             	mov    rdi,r14
401191-  b34dc2:	48 89 c6             	mov    rsi,rax
401192-  b34dc5:	e8 30 fd ff ff       	call   b34afa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81a9a>
401193-  b34dca:	89 d5                	mov    ebp,edx
401194-  b34dcc:	48 85 c0             	test   rax,rax
401195-  b34dcf:	74 07                	je     b34dd8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d78>
401196-  b34dd1:	49 89 c5             	mov    r13,rax
401197-  b34dd4:	31 c0                	xor    eax,eax
401198-  b34dd6:	eb 67                	jmp    b34e3f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81ddf>
--
409459-  b3c46c:	e8 3f 36 cb 00       	call   17efab0 <__stack_chk_fail@plt>
409460-  b3c471:	cc                   	int3
409461-  b3c472:	41 57                	push   r15
409462-  b3c474:	41 56                	push   r14
409463-  b3c476:	53                   	push   rbx
409464-  b3c477:	48 83 ec 30          	sub    rsp,0x30
409465-  b3c47b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
409466-  b3c482:	00 00 
409467-  b3c484:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
409468-  b3c489:	48 85 f6             	test   rsi,rsi
409469-  b3c48c:	74 26                	je     b3c4b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89454>
409470-  b3c48e:	48 89 f3             	mov    rbx,rsi
409471-  b3c491:	49 89 fe             	mov    r14,rdi
409472-  b3c494:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
409473-  b3c499:	48 8d 53 10          	lea    rdx,[rbx+0x10]
409474-  b3c49d:	48 8d 4b 28          	lea    rcx,[rbx+0x28]
409475-  b3c4a1:	4c 89 ff             	mov    rdi,r15
409476-  b3c4a4:	4c 89 f6             	mov    rsi,r14
409477:  b3c4a7:	e8 f4 88 ff ff       	call   b34da0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d40>
409478-  b3c4ac:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
409479-  b3c4af:	48 85 db             	test   rbx,rbx
409480-  b3c4b2:	75 e5                	jne    b3c499 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89439>
409481-  b3c4b4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
409482-  b3c4bb:	00 00 
409483-  b3c4bd:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
409484-  b3c4c2:	75 0a                	jne    b3c4ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8946e>
409485-  b3c4c4:	48 83 c4 30          	add    rsp,0x30
409486-  b3c4c8:	5b                   	pop    rbx
409487-  b3c4c9:	41 5e                	pop    r14
409488-  b3c4cb:	41 5f                	pop    r15
409489-  b3c4cd:	c3                   	ret
409490-  b3c4ce:	e8 dd 35 cb 00       	call   17efab0 <__stack_chk_fail@plt>
409491-  b3c4d3:	cc                   	int3
409492-  b3c4d4:	53                   	push   rbx
409493-  b3c4d5:	48 89 fb             	mov    rbx,rdi
409494-  b3c4d8:	48 39 f7             	cmp    rdi,rsi
409495-  b3c4db:	74 1c                	je     b3c4f9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89499>
409496-  b3c4dd:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
409497-  b3c4e1:	48 3b 46 18          	cmp    rax,QWORD PTR [rsi+0x18]
409498-  b3c4e5:	74 0a                	je     b3c4f1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89491>
409499-  b3c4e7:	48 89 df             	mov    rdi,rbx
409500-  b3c4ea:	e8 11 01 00 00       	call   b3c600 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x895a0>
409501-  b3c4ef:	eb 08                	jmp    b3c4f9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x89499>
409502-  b3c4f1:	48 89 df             	mov    rdi,rbx
409503-  b3c4f4:	e8 35 01 00 00       	call   b3c62e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x895ce>
409504-  b3c4f9:	48 89 d8             	mov    rax,rbx
409505-  b3c4fc:	5b                   	pop    rbx
409506-  b3c4fd:	c3                   	ret
409507-  b3c4fe:	48 89 c7             	mov    rdi,rax
409508-  b3c501:	e8 9f d5 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
409509-  b3c506:	41 57                	push   r15
409510-  b3c508:	41 56                	push   r14
409511-  b3c50a:	53                   	push   rbx
409512-  b3c50b:	48 89 d3             	mov    rbx,rdx
409513-  b3c50e:	49 89 f6             	mov    r14,rsi
409514-  b3c511:	49 89 ff             	mov    r15,rdi
409515-  b3c514:	0f 57 c0             	xorps  xmm0,xmm0
--
1240973-  e2f654:	41 57                	push   r15
1240974-  e2f656:	41 56                	push   r14
1240975-  e2f658:	41 54                	push   r12
1240976-  e2f65a:	53                   	push   rbx
1240977-  e2f65b:	48 83 ec 28          	sub    rsp,0x28
1240978-  e2f65f:	48 89 d3             	mov    rbx,rdx
1240979-  e2f662:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1240980-  e2f669:	00 00 
1240981-  e2f66b:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
1240982-  e2f670:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
1240983-  e2f673:	48 3b 13             	cmp    rdx,QWORD PTR [rbx]
1240984-  e2f676:	74 27                	je     e2f69f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc725>
1240985-  e2f678:	49 89 f6             	mov    r14,rsi
1240986-  e2f67b:	49 89 ff             	mov    r15,rdi
1240987-  e2f67e:	49 89 e4             	mov    r12,rsp
1240988-  e2f681:	48 8d 4a 18          	lea    rcx,[rdx+0x18]
1240989-  e2f685:	4c 89 e7             	mov    rdi,r12
1240990-  e2f688:	4c 89 fe             	mov    rsi,r15
1240991:  e2f68b:	e8 10 57 d0 ff       	call   b34da0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x81d40>
1240992-  e2f690:	49 8b 16             	mov    rdx,QWORD PTR [r14]
1240993-  e2f693:	48 83 c2 30          	add    rdx,0x30
1240994-  e2f697:	49 89 16             	mov    QWORD PTR [r14],rdx
1240995-  e2f69a:	48 3b 13             	cmp    rdx,QWORD PTR [rbx]
1240996-  e2f69d:	75 e2                	jne    e2f681 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc707>
1240997-  e2f69f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1240998-  e2f6a6:	00 00 
1240999-  e2f6a8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
1241000-  e2f6ad:	75 0c                	jne    e2f6bb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc741>
1241001-  e2f6af:	48 83 c4 28          	add    rsp,0x28
1241002-  e2f6b3:	5b                   	pop    rbx
1241003-  e2f6b4:	41 5c                	pop    r12
1241004-  e2f6b6:	41 5e                	pop    r14
1241005-  e2f6b8:	41 5f                	pop    r15
1241006-  e2f6ba:	c3                   	ret
1241007-  e2f6bb:	e8 f0 03 9c 00       	call   17efab0 <__stack_chk_fail@plt>
1241008-  e2f6c0:	41 56                	push   r14
1241009-  e2f6c2:	53                   	push   rbx
1241010-  e2f6c3:	50                   	push   rax
1241011-  e2f6c4:	48 85 ff             	test   rdi,rdi
1241012-  e2f6c7:	74 18                	je     e2f6e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc767>
1241013-  e2f6c9:	49 89 fe             	mov    r14,rdi
1241014-  e2f6cc:	be f0 03 00 00       	mov    esi,0x3f0
1241015-  e2f6d1:	e8 56 ad 95 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
1241016-  e2f6d6:	48 89 c3             	mov    rbx,rax
1241017-  e2f6d9:	48 89 c7             	mov    rdi,rax
1241018-  e2f6dc:	4c 89 f6             	mov    rsi,r14
1241019-  e2f6df:	eb 12                	jmp    e2f6f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfc779>
1241020-  e2f6e1:	bf f0 03 00 00       	mov    edi,0x3f0
1241021-  e2f6e6:	e8 15 e8 9b 00       	call   17edf00 <_Znwm@plt>
1241022-  e2f6eb:	48 89 c3             	mov    rbx,rax
1241023-  e2f6ee:	48 89 c7             	mov    rdi,rax
1241024-  e2f6f1:	31 f6                	xor    esi,esi
1241025-  e2f6f3:	e8 78 1e 6e 00       	call   1511570 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x356af4>
1241026-  e2f6f8:	48 89 d8             	mov    rax,rbx
1241027-  e2f6fb:	48 83 c4 08          	add    rsp,0x8
1241028-  e2f6ff:	5b                   	pop    rbx
1241029-  e2f700:	41 5e                	pop    r14

## Direct callers of b8f02e with receiver setup
501889-  b8ebc5:	e8 e8 f8 f0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
501890-  b8ebca:	4c 89 f7             	mov    rdi,r14
501891-  b8ebcd:	e8 fe 10 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
501892-  b8ebd2:	48 8b 37             	mov    rsi,QWORD PTR [rdi]
501893-  b8ebd5:	48 85 f6             	test   rsi,rsi
501894-  b8ebd8:	74 12                	je     b8ebec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbb8c>
501895-  b8ebda:	53                   	push   rbx
501896-  b8ebdb:	48 89 fb             	mov    rbx,rdi
501897-  b8ebde:	e8 95 89 f2 ff       	call   ab7578 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4518>
501898-  b8ebe3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
501899-  b8ebe6:	5b                   	pop    rbx
501900-  b8ebe7:	e9 34 f3 c5 00       	jmp    17edf20 <_ZdlPv@plt>
501901-  b8ebec:	c3                   	ret
501902-  b8ebed:	cc                   	int3
501903-  b8ebee:	b0 09                	mov    al,0x9
501904-  b8ebf0:	c3                   	ret
501905-  b8ebf1:	cc                   	int3
501906-  b8ebf2:	48 8d 05 ca 5c 7a ff 	lea    rax,[rip+0xffffffffff7a5cca]        # 3348c3 <_ZTSSt12bad_any_cast@@Base-0x5b905>
501907-  b8ebf9:	6a 1b                	push   0x1b
501908-  b8ebfb:	5a                   	pop    rdx
501909-  b8ebfc:	c3                   	ret
501910-  b8ebfd:	cc                   	int3
501911-  b8ebfe:	48 8d 05 87 12 81 ff 	lea    rax,[rip+0xffffffffff811287]        # 39fe8c <_ZTSN5boost9exceptionE@@Base+0x86e>
501912-  b8ec05:	6a 02                	push   0x2
501913-  b8ec07:	5a                   	pop    rdx
501914-  b8ec08:	c3                   	ret
501915-  b8ec09:	cc                   	int3
501916-  b8ec0a:	55                   	push   rbp
501917-  b8ec0b:	41 57                	push   r15
501918-  b8ec0d:	41 56                	push   r14
501919-  b8ec0f:	41 55                	push   r13
501920-  b8ec11:	41 54                	push   r12
501921-  b8ec13:	53                   	push   rbx
501922-  b8ec14:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
501923-  b8ec1b:	49 89 ce             	mov    r14,rcx
501924-  b8ec1e:	49 89 d7             	mov    r15,rdx
501925-  b8ec21:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
501926-  b8ec26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
501927-  b8ec2d:	00 00 
501928-  b8ec2f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
501929-  b8ec36:	00 
501930-  b8ec37:	48 89 cf             	mov    rdi,rcx
501931-  b8ec3a:	e8 03 93 ff ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
501932-  b8ec3f:	48 89 c3             	mov    rbx,rax
501933-  b8ec42:	4c 89 f7             	mov    rdi,r14
501934:  b8ec45:	e8 e4 03 00 00       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
501935-  b8ec4a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
501936-  b8ec4d:	48 89 c7             	mov    rdi,rax
501937-  b8ec50:	ff 51 28             	call   QWORD PTR [rcx+0x28]
501938-  b8ec53:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
501939-  b8ec58:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
501940-  b8ec5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
501941-  b8ec60:	49 8b 6f 60          	mov    rbp,QWORD PTR [r15+0x60]
501942-  b8ec64:	4d 8b af 80 00 00 00 	mov    r13,QWORD PTR [r15+0x80]
--
762625-  c7d411:	4c 89 fa             	mov    rdx,r15
762626-  c7d414:	ff 50 18             	call   QWORD PTR [rax+0x18]
762627-  c7d417:	4c 89 ff             	mov    rdi,r15
762628-  c7d41a:	e8 71 0a b7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
762629-  c7d41f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
762630-  c7d426:	00 00 
762631-  c7d428:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
762632-  c7d42d:	75 0d                	jne    c7d43c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca3dc>
762633-  c7d42f:	48 89 d8             	mov    rax,rbx
762634-  c7d432:	48 83 c4 20          	add    rsp,0x20
762635-  c7d436:	5b                   	pop    rbx
762636-  c7d437:	41 5e                	pop    r14
762637-  c7d439:	41 5f                	pop    r15
762638-  c7d43b:	c3                   	ret
762639-  c7d43c:	e8 6f 26 b7 00       	call   17efab0 <__stack_chk_fail@plt>
762640-  c7d441:	cc                   	int3
762641-  c7d442:	b0 46                	mov    al,0x46
762642-  c7d444:	c3                   	ret
762643-  c7d445:	cc                   	int3
762644-  c7d446:	48 8d 05 6f f9 6f ff 	lea    rax,[rip+0xffffffffff6ff96f]        # 37cdbc <_ZTSSt12bad_any_cast@@Base-0x1340c>
762645-  c7d44d:	6a 22                	push   0x22
762646-  c7d44f:	5a                   	pop    rdx
762647-  c7d450:	c3                   	ret
762648-  c7d451:	cc                   	int3
762649-  c7d452:	48 8d 05 3f ec 74 ff 	lea    rax,[rip+0xffffffffff74ec3f]        # 3cc098 <_ZTSN5boost9exceptionE@@Base+0x2ca7a>
762650-  c7d459:	6a 03                	push   0x3
762651-  c7d45b:	5a                   	pop    rdx
762652-  c7d45c:	c3                   	ret
762653-  c7d45d:	cc                   	int3
762654-  c7d45e:	55                   	push   rbp
762655-  c7d45f:	41 57                	push   r15
762656-  c7d461:	41 56                	push   r14
762657-  c7d463:	41 55                	push   r13
762658-  c7d465:	41 54                	push   r12
762659-  c7d467:	53                   	push   rbx
762660-  c7d468:	48 83 ec 28          	sub    rsp,0x28
762661-  c7d46c:	49 89 cf             	mov    r15,rcx
762662-  c7d46f:	49 89 d6             	mov    r14,rdx
762663-  c7d472:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
762664-  c7d477:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
762665-  c7d47e:	00 00 
762666-  c7d480:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
762667-  c7d485:	48 89 cf             	mov    rdi,rcx
762668-  c7d488:	e8 4f 01 00 00       	call   c7d5dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca57c>
762669-  c7d48d:	4c 89 ff             	mov    rdi,r15
762670:  c7d490:	e8 99 1b f1 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
762671-  c7d495:	48 8b 08             	mov    rcx,QWORD PTR [rax]
762672-  c7d498:	48 89 c7             	mov    rdi,rax
762673-  c7d49b:	ff 51 30             	call   QWORD PTR [rcx+0x30]
762674-  c7d49e:	49 89 c4             	mov    r12,rax
762675-  c7d4a1:	4c 89 ff             	mov    rdi,r15
762676-  c7d4a4:	e8 f7 5e fd ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
762677-  c7d4a9:	48 8b 08             	mov    rcx,QWORD PTR [rax]
762678-  c7d4ac:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
--
1342073-  e8c938:	48 85 d2             	test   rdx,rdx
1342074-  e8c93b:	74 0c                	je     e8c949 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d5f>
1342075-  e8c93d:	49 8b 07             	mov    rax,QWORD PTR [r15]
1342076-  e8c940:	6a 14                	push   0x14
1342077-  e8c942:	5e                   	pop    rsi
1342078-  e8c943:	4c 89 ff             	mov    rdi,r15
1342079-  e8c946:	ff 50 28             	call   QWORD PTR [rax+0x28]
1342080-  e8c949:	48 83 7d 40 00       	cmp    QWORD PTR [rbp+0x40],0x0
1342081-  e8c94e:	74 33                	je     e8c983 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53d99>
1342082-  e8c950:	48 83 c5 20          	add    rbp,0x20
1342083-  e8c954:	48 8d 9c 24 e0 05 00 	lea    rbx,[rsp+0x5e0]
1342084-  e8c95b:	00 
1342085-  e8c95c:	48 89 df             	mov    rdi,rbx
1342086-  e8c95f:	48 89 ee             	mov    rsi,rbp
1342087-  e8c962:	e8 29 d9 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
1342088-  e8c967:	49 8b 07             	mov    rax,QWORD PTR [r15]
1342089-  e8c96a:	6a 0a                	push   0xa
1342090-  e8c96c:	5e                   	pop    rsi
1342091-  e8c96d:	4c 89 ff             	mov    rdi,r15
1342092-  e8c970:	48 89 da             	mov    rdx,rbx
1342093-  e8c973:	ff 50 30             	call   QWORD PTR [rax+0x30]
1342094-  e8c976:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
1342095-  e8c97d:	00 
1342096-  e8c97e:	e8 e7 d5 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
1342097-  e8c983:	49 8b 07             	mov    rax,QWORD PTR [r15]
1342098-  e8c986:	48 8d 9c 24 40 06 00 	lea    rbx,[rsp+0x640]
1342099-  e8c98d:	00 
1342100-  e8c98e:	48 89 df             	mov    rdi,rbx
1342101-  e8c991:	4c 89 fe             	mov    rsi,r15
1342102-  e8c994:	ff 50 38             	call   QWORD PTR [rax+0x38]
1342103-  e8c997:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
1342104-  e8c99a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
1342105-  e8c99e:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
1342106-  e8c9a5:	00 
1342107-  e8c9a6:	e8 73 da 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
1342108-  e8c9ab:	48 8b bc 24 48 06 00 	mov    rdi,QWORD PTR [rsp+0x648]
1342109-  e8c9b2:	00 
1342110-  e8c9b3:	e8 ce 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
1342111-  e8c9b8:	49 8b 07             	mov    rax,QWORD PTR [r15]
1342112-  e8c9bb:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
1342113-  e8c9c2:	00 
1342114-  e8c9c3:	4c 89 fe             	mov    rsi,r15
1342115-  e8c9c6:	ff 50 40             	call   QWORD PTR [rax+0x40]
1342116-  e8c9c9:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
1342117-  e8c9ce:	4c 89 ef             	mov    rdi,r13
1342118:  e8c9d1:	e8 58 26 d0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
1342119-  e8c9d6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1342120-  e8c9d9:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
1342121-  e8c9e0:	00 
1342122-  e8c9e1:	48 89 c6             	mov    rsi,rax
1342123-  e8c9e4:	ff 51 38             	call   QWORD PTR [rcx+0x38]
1342124-  e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
1342125-  e8c9ec:	48 8b 75 58          	mov    rsi,QWORD PTR [rbp+0x58]
1342126-  e8c9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
--
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
1896539- 1088575:	e8 26 ad ad ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
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
1896569: 10885e3:	e8 46 6a b0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
1896570- 10885e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
1896571- 10885eb:	48 89 c7             	mov    rdi,rax
1896572- 10885ee:	ff 51 28             	call   QWORD PTR [rcx+0x28]
1896573- 10885f1:	49 89 c6             	mov    r14,rax
1896574- 10885f4:	6a 28                	push   0x28
1896575- 10885f6:	5f                   	pop    rdi
1896576- 10885f7:	e8 04 59 76 00       	call   17edf00 <_Znwm@plt>
1896577- 10885fc:	48 89 c3             	mov    rbx,rax
--
2292227- 11ee608:	55                   	push   rbp
2292228- 11ee609:	41 57                	push   r15
2292229- 11ee60b:	41 56                	push   r14
2292230- 11ee60d:	41 55                	push   r13
2292231- 11ee60f:	41 54                	push   r12
2292232- 11ee611:	53                   	push   rbx
2292233- 11ee612:	48 81 ec 68 03 00 00 	sub    rsp,0x368
2292234- 11ee619:	48 89 cb             	mov    rbx,rcx
2292235- 11ee61c:	49 89 d5             	mov    r13,rdx
2292236- 11ee61f:	49 89 ff             	mov    r15,rdi
2292237- 11ee622:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2292238- 11ee629:	00 00 
2292239- 11ee62b:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
2292240- 11ee632:	00 
2292241- 11ee633:	48 89 cf             	mov    rdi,rcx
2292242- 11ee636:	e8 53 86 ac ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
2292243- 11ee63b:	49 89 c6             	mov    r14,rax
2292244- 11ee63e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
2292245- 11ee642:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
2292246- 11ee646:	6a 73                	push   0x73
2292247- 11ee648:	5a                   	pop    rdx
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
2292266- 11ee696:	e8 05 4c 97 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2292267- 11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2292268- 11ee6a0:	48 89 df             	mov    rdi,rbx
2292269- 11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
2292270- 11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2292271- 11ee6ad:	48 89 df             	mov    rdi,rbx
2292272: 11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
2292273- 11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
2292274- 11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
2292275- 11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
2292276- 11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
2292277- 11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
2292278- 11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2292279- 11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
2292280- 11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
--
2939917- 1441fa3:	75 2f                	jne    1441fd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287558>
2939918- 1441fa5:	89 d8                	mov    eax,ebx
2939919- 1441fa7:	48 83 c4 28          	add    rsp,0x28
2939920- 1441fab:	5b                   	pop    rbx
2939921- 1441fac:	41 5e                	pop    r14
2939922- 1441fae:	c3                   	ret
2939923- 1441faf:	48 89 c3             	mov    rbx,rax
2939924- 1441fb2:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2939925- 1441fb7:	e8 d4 be 3a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2939926- 1441fbc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2939927- 1441fc3:	00 00 
2939928- 1441fc5:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
2939929- 1441fca:	75 08                	jne    1441fd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x287558>
2939930- 1441fcc:	48 89 df             	mov    rdi,rbx
2939931- 1441fcf:	e8 fc dc 62 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2939932- 1441fd4:	e8 d7 da 3a 00       	call   17efab0 <__stack_chk_fail@plt>
2939933- 1441fd9:	cc                   	int3
2939934- 1441fda:	b0 b9                	mov    al,0xb9
2939935- 1441fdc:	c3                   	ret
2939936- 1441fdd:	cc                   	int3
2939937- 1441fde:	48 8d 05 b2 5a f2 fe 	lea    rax,[rip+0xfffffffffef25ab2]        # 367a97 <_ZTSSt12bad_any_cast@@Base-0x28731>
2939938- 1441fe5:	6a 19                	push   0x19
2939939- 1441fe7:	5a                   	pop    rdx
2939940- 1441fe8:	c3                   	ret
2939941- 1441fe9:	cc                   	int3
2939942- 1441fea:	48 8d 05 e7 35 ff fe 	lea    rax,[rip+0xfffffffffeff35e7]        # 4355d8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b027>
2939943- 1441ff1:	6a 05                	push   0x5
2939944- 1441ff3:	5a                   	pop    rdx
2939945- 1441ff4:	c3                   	ret
2939946- 1441ff5:	cc                   	int3
2939947- 1441ff6:	55                   	push   rbp
2939948- 1441ff7:	41 57                	push   r15
2939949- 1441ff9:	41 56                	push   r14
2939950- 1441ffb:	41 55                	push   r13
2939951- 1441ffd:	41 54                	push   r12
2939952- 1441fff:	53                   	push   rbx
2939953- 1442000:	48 81 ec 68 01 00 00 	sub    rsp,0x168
2939954- 1442007:	49 89 ce             	mov    r14,rcx
2939955- 144200a:	48 89 d3             	mov    rbx,rdx
2939956- 144200d:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
2939957- 1442012:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2939958- 1442019:	00 00 
2939959- 144201b:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
2939960- 1442022:	00 
2939961- 1442023:	48 89 cf             	mov    rdi,rcx
2939962: 1442026:	e8 03 d0 74 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
2939963- 144202b:	49 89 c7             	mov    r15,rax
2939964- 144202e:	4c 89 f7             	mov    rdi,r14
2939965- 1442031:	e8 e6 a2 83 ff       	call   c7c31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c92bc>
2939966- 1442036:	48 89 04 24          	mov    QWORD PTR [rsp],rax
2939967- 144203a:	4c 89 f7             	mov    rdi,r14
2939968- 144203d:	e8 d2 5f 74 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
2939969- 1442042:	49 89 c4             	mov    r12,rax
2939970- 1442045:	4c 89 f7             	mov    rdi,r14
