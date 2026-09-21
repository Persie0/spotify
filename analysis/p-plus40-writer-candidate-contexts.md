# Candidate writes/reads near the concrete P creator

Known P = outer+0x18 (AP 0x1832be8), final dependency field P+0x40 = outer+0x58.
Contexts are intentionally wide so base-register provenance can be checked, not inferred from the numeric offset.

## 0xe94cba
      e94bc9:	0f 84 ae 05 00 00    	je     e9517d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c593>
      e94bcf:	40 88 ac 24 88 00 00 	mov    BYTE PTR [rsp+0x88],bpl
      e94bd6:	00 
      e94bd7:	6a 38                	push   0x38
      e94bd9:	5f                   	pop    rdi
      e94bda:	e8 21 93 95 00       	call   17edf00 <_Znwm@plt>
      e94bdf:	66 0f ef c0          	pxor   xmm0,xmm0
      e94be3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94be8:	48 8d 15 79 88 96 00 	lea    rdx,[rip+0x968879]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94bef:	48 8b 8c 24 10 03 00 	mov    rcx,QWORD PTR [rsp+0x310]
      e94bf6:	00 
      e94bf7:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
      e94bfe:	00 00 
      e94c00:	48 89 10             	mov    QWORD PTR [rax],rdx
      e94c03:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
      e94c0a:	00 00 
      e94c0c:	48 8d 15 b5 fa 9a 00 	lea    rdx,[rip+0x9afab5]        # 18446c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xdb0>
      e94c13:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94c17:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94c1b:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      e94c1f:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
      e94c23:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94c2a:	00 
      e94c2b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
      e94c30:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e94c35:	49 89 c4             	mov    r12,rax
      e94c38:	4c 89 f7             	mov    rdi,r14
      e94c3b:	e8 e2 8e c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e94c40:	48 8d 84 24 90 0e 00 	lea    rax,[rsp+0xe90]
      e94c47:	00 
      e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
      e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94c9b:	00 
      e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94ca3:	00 
      e94ca4:	66 0f ef c0          	pxor   xmm0,xmm0
      e94ca8:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e94cac:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94cb3:	00 f0 3f 
      e94cb6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e94cbf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      e94cc3:	4c 89 f6             	mov    rsi,r14
      e94cc6:	e8 25 32 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ccb:	48 89 df             	mov    rdi,rbx
      e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
      e94ce3:	00 
      e94ce4:	4c 89 f7             	mov    rdi,r14
      e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0
      e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
      e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
      e94d54:	6a 64                	push   0x64
      e94d56:	59                   	pop    rcx
      e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
      e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
      e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
      e94d6c:	00 
      e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
      e94d74:	00 
      e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
      e94d7c:	00 00 
      e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0

## 0xe94cbf
      e94bcf:	40 88 ac 24 88 00 00 	mov    BYTE PTR [rsp+0x88],bpl
      e94bd6:	00 
      e94bd7:	6a 38                	push   0x38
      e94bd9:	5f                   	pop    rdi
      e94bda:	e8 21 93 95 00       	call   17edf00 <_Znwm@plt>
      e94bdf:	66 0f ef c0          	pxor   xmm0,xmm0
      e94be3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e94be8:	48 8d 15 79 88 96 00 	lea    rdx,[rip+0x968879]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e94bef:	48 8b 8c 24 10 03 00 	mov    rcx,QWORD PTR [rsp+0x310]
      e94bf6:	00 
      e94bf7:	48 83 a4 24 10 03 00 	and    QWORD PTR [rsp+0x310],0x0
      e94bfe:	00 00 
      e94c00:	48 89 10             	mov    QWORD PTR [rax],rdx
      e94c03:	66 0f 7f 84 24 00 03 	movdqa XMMWORD PTR [rsp+0x300],xmm0
      e94c0a:	00 00 
      e94c0c:	48 8d 15 b5 fa 9a 00 	lea    rdx,[rip+0x9afab5]        # 18446c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xdb0>
      e94c13:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      e94c17:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      e94c1b:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
      e94c1f:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx
      e94c23:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94c2a:	00 
      e94c2b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
      e94c30:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      e94c35:	49 89 c4             	mov    r12,rax
      e94c38:	4c 89 f7             	mov    rdi,r14
      e94c3b:	e8 e2 8e c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e94c40:	48 8d 84 24 90 0e 00 	lea    rax,[rsp+0xe90]
      e94c47:	00 
      e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
      e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94c9b:	00 
      e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94ca3:	00 
      e94ca4:	66 0f ef c0          	pxor   xmm0,xmm0
      e94ca8:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e94cac:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94cb3:	00 f0 3f 
      e94cb6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e94cbf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      e94cc3:	4c 89 f6             	mov    rsi,r14
      e94cc6:	e8 25 32 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ccb:	48 89 df             	mov    rdi,rbx
      e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
      e94ce3:	00 
      e94ce4:	4c 89 f7             	mov    rdi,r14
      e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0
      e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
      e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
      e94d54:	6a 64                	push   0x64
      e94d56:	59                   	pop    rcx
      e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
      e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
      e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
      e94d6c:	00 
      e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
      e94d74:	00 
      e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
      e94d7c:	00 00 
      e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0
      e94d85:	00 00 

## 0xe94d26
      e94c35:	49 89 c4             	mov    r12,rax
      e94c38:	4c 89 f7             	mov    rdi,r14
      e94c3b:	e8 e2 8e c2 ff       	call   abdb22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaac2>
      e94c40:	48 8d 84 24 90 0e 00 	lea    rax,[rsp+0xe90]
      e94c47:	00 
      e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
      e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94c9b:	00 
      e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94ca3:	00 
      e94ca4:	66 0f ef c0          	pxor   xmm0,xmm0
      e94ca8:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e94cac:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94cb3:	00 f0 3f 
      e94cb6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e94cbf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      e94cc3:	4c 89 f6             	mov    rsi,r14
      e94cc6:	e8 25 32 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ccb:	48 89 df             	mov    rdi,rbx
      e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
      e94ce3:	00 
      e94ce4:	4c 89 f7             	mov    rdi,r14
      e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0
      e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
      e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
      e94d54:	6a 64                	push   0x64
      e94d56:	59                   	pop    rcx
      e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
      e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
      e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
      e94d6c:	00 
      e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
      e94d74:	00 
      e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
      e94d7c:	00 00 
      e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0
      e94d85:	00 00 
      e94d87:	41 89 87 f0 00 00 00 	mov    DWORD PTR [r15+0xf0],eax
      e94d8e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e94d93:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e94d97:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94d9c:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
      e94da0:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e94da3:	48 8d 15 48 f3 53 ff 	lea    rdx,[rip+0xffffffffff53f348]        # 3d40f2 <_ZTSN5boost17bad_function_callE@@Base+0x1438>
      e94daa:	4c 8d 05 4f f3 53 ff 	lea    r8,[rip+0xffffffffff53f34f]        # 3d4100 <_ZTSN5boost17bad_function_callE@@Base+0x1446>
      e94db1:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94db8:	00 
      e94db9:	6a 0b                	push   0xb
      e94dbb:	59                   	pop    rcx
      e94dbc:	6a 25                	push   0x25
      e94dbe:	41 59                	pop    r9
      e94dc0:	4c 89 f7             	mov    rdi,r14
      e94dc3:	e8 00 27 75 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
      e94dc8:	45 31 e4             	xor    r12d,r12d
      e94dcb:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
      e94dd0:	74 4e                	je     e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>
      e94dd2:	48 8d 35 f7 3d 54 ff 	lea    rsi,[rip+0xffffffffff543df7]        # 3d8bd0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37b5>
      e94dd9:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94de0:	00 
      e94de1:	e8 69 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e94de6:	84 c0                	test   al,al

## 0xe94d32
      e94c40:	48 8d 84 24 90 0e 00 	lea    rax,[rsp+0xe90]
      e94c47:	00 
      e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
      e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94c9b:	00 
      e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94ca3:	00 
      e94ca4:	66 0f ef c0          	pxor   xmm0,xmm0
      e94ca8:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e94cac:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94cb3:	00 f0 3f 
      e94cb6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e94cbf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      e94cc3:	4c 89 f6             	mov    rsi,r14
      e94cc6:	e8 25 32 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ccb:	48 89 df             	mov    rdi,rbx
      e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
      e94ce3:	00 
      e94ce4:	4c 89 f7             	mov    rdi,r14
      e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0
      e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
      e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
      e94d54:	6a 64                	push   0x64
      e94d56:	59                   	pop    rcx
      e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
      e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
      e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
      e94d6c:	00 
      e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
      e94d74:	00 
      e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
      e94d7c:	00 00 
      e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0
      e94d85:	00 00 
      e94d87:	41 89 87 f0 00 00 00 	mov    DWORD PTR [r15+0xf0],eax
      e94d8e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e94d93:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e94d97:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94d9c:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
      e94da0:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e94da3:	48 8d 15 48 f3 53 ff 	lea    rdx,[rip+0xffffffffff53f348]        # 3d40f2 <_ZTSN5boost17bad_function_callE@@Base+0x1438>
      e94daa:	4c 8d 05 4f f3 53 ff 	lea    r8,[rip+0xffffffffff53f34f]        # 3d4100 <_ZTSN5boost17bad_function_callE@@Base+0x1446>
      e94db1:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94db8:	00 
      e94db9:	6a 0b                	push   0xb
      e94dbb:	59                   	pop    rcx
      e94dbc:	6a 25                	push   0x25
      e94dbe:	41 59                	pop    r9
      e94dc0:	4c 89 f7             	mov    rdi,r14
      e94dc3:	e8 00 27 75 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
      e94dc8:	45 31 e4             	xor    r12d,r12d
      e94dcb:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
      e94dd0:	74 4e                	je     e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>
      e94dd2:	48 8d 35 f7 3d 54 ff 	lea    rsi,[rip+0xffffffffff543df7]        # 3d8bd0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37b5>
      e94dd9:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94de0:	00 
      e94de1:	e8 69 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e94de6:	84 c0                	test   al,al
      e94de8:	74 06                	je     e94df0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c206>
      e94dea:	6a 02                	push   0x2
      e94dec:	41 5c                	pop    r12

## 0xe94d36
      e94c47:	00 
      e94c48:	48 8d 2d 91 9c 97 00 	lea    rbp,[rip+0x979c91]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e94c4f:	48 89 28             	mov    QWORD PTR [rax],rbp
      e94c52:	4c 8b 2d 47 ce a1 00 	mov    r13,QWORD PTR [rip+0xa1ce47]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e94c59:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      e94c5d:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e94c61:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94c66:	48 8b 80 e8 00 00 00 	mov    rax,QWORD PTR [rax+0xe8]
      e94c6d:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      e94c72:	bf 90 00 00 00       	mov    edi,0x90
      e94c77:	4c 89 a4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r12
      e94c7e:	00 
      e94c7f:	e8 7c 92 95 00       	call   17edf00 <_Znwm@plt>
      e94c84:	48 89 c3             	mov    rbx,rax
      e94c87:	4d 8d 7c 24 08       	lea    r15,[r12+0x8]
      e94c8c:	48 89 ac 24 e0 0b 00 	mov    QWORD PTR [rsp+0xbe0],rbp
      e94c93:	00 
      e94c94:	4c 89 ac 24 e8 0b 00 	mov    QWORD PTR [rsp+0xbe8],r13
      e94c9b:	00 
      e94c9c:	4c 89 b4 24 00 0c 00 	mov    QWORD PTR [rsp+0xc00],r14
      e94ca3:	00 
      e94ca4:	66 0f ef c0          	pxor   xmm0,xmm0
      e94ca8:	66 0f 7f 00          	movdqa XMMWORD PTR [rax],xmm0
      e94cac:	48 b8 00 00 00 00 00 	movabs rax,0x3ff0000000000000
      e94cb3:	00 f0 3f 
      e94cb6:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e94cba:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e94cbf:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
      e94cc3:	4c 89 f6             	mov    rsi,r14
      e94cc6:	e8 25 32 c4 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e94ccb:	48 89 df             	mov    rdi,rbx
      e94cce:	48 83 ef 80          	sub    rdi,0xffffffffffffff80
      e94cd2:	48 8b 74 24 70       	mov    rsi,QWORD PTR [rsp+0x70]
      e94cd7:	e8 e6 c9 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e94cdc:	48 89 9c 24 50 10 00 	mov    QWORD PTR [rsp+0x1050],rbx
      e94ce3:	00 
      e94ce4:	4c 89 f7             	mov    rdi,r14
      e94ce7:	e8 7e 52 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e94cec:	f0 49 ff 07          	lock inc QWORD PTR [r15]
      e94cf0:	bf 00 01 00 00       	mov    edi,0x100
      e94cf5:	e8 06 92 95 00       	call   17edf00 <_Znwm@plt>
      e94cfa:	49 89 c7             	mov    r15,rax
      e94cfd:	4c 89 e0             	mov    rax,r12
      e94d00:	48 83 c0 18          	add    rax,0x18
      e94d04:	48 8d 0d 8d fa 9a 00 	lea    rcx,[rip+0x9afa8d]        # 1844798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xe80>
      e94d0b:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e94d0e:	49 89 47 08          	mov    QWORD PTR [r15+0x8],rax
      e94d12:	4d 89 67 10          	mov    QWORD PTR [r15+0x10],r12
      e94d16:	66 0f ef c0          	pxor   xmm0,xmm0
      e94d1a:	f3 41 0f 7f 47 18    	movdqu XMMWORD PTR [r15+0x18],xmm0
      e94d20:	f3 41 0f 7f 47 28    	movdqu XMMWORD PTR [r15+0x28],xmm0
      e94d26:	49 83 67 38 00       	and    QWORD PTR [r15+0x38],0x0
      e94d2b:	4c 89 f8             	mov    rax,r15
      e94d2e:	48 83 c0 40          	add    rax,0x40
      e94d32:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
      e94d36:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
      e94d3a:	66 41 0f 7f 47 50    	movdqa XMMWORD PTR [r15+0x50],xmm0
      e94d40:	66 41 0f 7f 47 60    	movdqa XMMWORD PTR [r15+0x60],xmm0
      e94d46:	49 83 67 70 00       	and    QWORD PTR [r15+0x70],0x0
      e94d4b:	b8 00 00 80 3f       	mov    eax,0x3f800000
      e94d50:	41 89 47 78          	mov    DWORD PTR [r15+0x78],eax
      e94d54:	6a 64                	push   0x64
      e94d56:	59                   	pop    rcx
      e94d57:	49 89 8f 80 00 00 00 	mov    QWORD PTR [r15+0x80],rcx
      e94d5e:	49 89 8f 88 00 00 00 	mov    QWORD PTR [r15+0x88],rcx
      e94d65:	49 83 a7 90 00 00 00 	and    QWORD PTR [r15+0x90],0x0
      e94d6c:	00 
      e94d6d:	49 83 a7 c0 00 00 00 	and    QWORD PTR [r15+0xc0],0x0
      e94d74:	00 
      e94d75:	66 41 0f 7f 87 d0 00 	movdqa XMMWORD PTR [r15+0xd0],xmm0
      e94d7c:	00 00 
      e94d7e:	66 41 0f 7f 87 e0 00 	movdqa XMMWORD PTR [r15+0xe0],xmm0
      e94d85:	00 00 
      e94d87:	41 89 87 f0 00 00 00 	mov    DWORD PTR [r15+0xf0],eax
      e94d8e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e94d93:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e94d97:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e94d9c:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
      e94da0:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      e94da3:	48 8d 15 48 f3 53 ff 	lea    rdx,[rip+0xffffffffff53f348]        # 3d40f2 <_ZTSN5boost17bad_function_callE@@Base+0x1438>
      e94daa:	4c 8d 05 4f f3 53 ff 	lea    r8,[rip+0xffffffffff53f34f]        # 3d4100 <_ZTSN5boost17bad_function_callE@@Base+0x1446>
      e94db1:	4c 8d b4 24 e0 0b 00 	lea    r14,[rsp+0xbe0]
      e94db8:	00 
      e94db9:	6a 0b                	push   0xb
      e94dbb:	59                   	pop    rcx
      e94dbc:	6a 25                	push   0x25
      e94dbe:	41 59                	pop    r9
      e94dc0:	4c 89 f7             	mov    rdi,r14
      e94dc3:	e8 00 27 75 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
      e94dc8:	45 31 e4             	xor    r12d,r12d
      e94dcb:	41 80 7e 18 00       	cmp    BYTE PTR [r14+0x18],0x0
      e94dd0:	74 4e                	je     e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>
      e94dd2:	48 8d 35 f7 3d 54 ff 	lea    rsi,[rip+0xffffffffff543df7]        # 3d8bd0 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x37b5>
      e94dd9:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e94de0:	00 
      e94de1:	e8 69 6a be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
      e94de6:	84 c0                	test   al,al
      e94de8:	74 06                	je     e94df0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c206>
      e94dea:	6a 02                	push   0x2
      e94dec:	41 5c                	pop    r12
      e94dee:	eb 30                	jmp    e94e20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c236>

## 0xe9525c
      e95177:	00 
      e95178:	e8 09 93 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9517d:	4d 85 ff             	test   r15,r15
      e95180:	74 05                	je     e95187 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c59d>
      e95182:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95187:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e9518c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95190:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
      e95197:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      e9519e:	00 
      e9519f:	bf 98 00 00 00       	mov    edi,0x98
      e951a4:	e8 57 8d 95 00       	call   17edf00 <_Znwm@plt>
      e951a9:	49 89 c6             	mov    r14,rax
      e951ac:	66 0f ef c0          	pxor   xmm0,xmm0
      e951b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e951b5:	48 8d 05 ac 82 96 00 	lea    rax,[rip+0x9682ac]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e951bc:	49 89 06             	mov    QWORD PTR [r14],rax
      e951bf:	4d 8d 66 18          	lea    r12,[r14+0x18]
      e951c3:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e951ca:	00 
      e951cb:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e951d0:	48 89 06             	mov    QWORD PTR [rsi],rax
      e951d3:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      e951d8:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e951dc:	4c 89 e7             	mov    rdi,r12
      e951df:	e8 34 2a 03 00       	call   ec7c18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f02e>
      e951e4:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e951eb:	00 
      e951ec:	e8 95 92 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e951f1:	31 ff                	xor    edi,edi
      e951f3:	e8 24 92 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e951f8:	bf f0 00 00 00       	mov    edi,0xf0
      e951fd:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14
      e95204:	00 
      e95205:	e8 f6 8c 95 00       	call   17edf00 <_Znwm@plt>
      e9520a:	48 89 c3             	mov    rbx,rax
      e9520d:	4c 89 f0             	mov    rax,r14
      e95210:	48 83 c0 08          	add    rax,0x8
      e95214:	66 0f ef c0          	pxor   xmm0,xmm0
      e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9521d:	48 8d 0d a4 c1 99 00 	lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e95224:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e95227:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9522b:	48 8d 05 2e da 99 00 	lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>
      e95232:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e95236:	48 c7 43 20 32 00 00 	mov    QWORD PTR [rbx+0x20],0x32
      e9523d:	00 
      e9523e:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
      e95245:	00 
      e95246:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      e9524a:	4d 85 ff             	test   r15,r15
      e9524d:	74 05                	je     e95254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c66a>
      e9524f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95254:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12
      e9525b:	00 
      e9525c:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12
      e95260:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14
      e95264:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e95269:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e95270:	00 00 
      e95272:	66 49 0f 7e c4       	movq   r12,xmm0
      e95277:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e9527b:	4c 89 e7             	mov    rdi,r12
      e9527e:	48 89 5c 24 70       	mov    QWORD PTR [rsp+0x70],rbx
      e95283:	ff 10                	call   QWORD PTR [rax]
      e95285:	49 89 c5             	mov    r13,rax
      e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]
      e9528c:	66 0f ef c0          	pxor   xmm0,xmm0
      e95290:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e95296:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      e9529c:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      e952a1:	48 89 c7             	mov    rdi,rax
      e952a4:	e8 51 47 ff ff       	call   e899fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e10>
      e952a9:	48 89 c5             	mov    rbp,rax
      e952ac:	49 89 d6             	mov    r14,rdx
      e952af:	4c 89 ef             	mov    rdi,r13
      e952b2:	e8 6b 47 ff ff       	call   e89a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e38>
      e952b7:	49 89 d0             	mov    r8,rdx
      e952ba:	4c 89 ff             	mov    rdi,r15
      e952bd:	48 89 ee             	mov    rsi,rbp
      e952c0:	4c 89 f2             	mov    rdx,r14
      e952c3:	48 89 c1             	mov    rcx,rax
      e952c6:	e8 09 0c 03 00       	call   ec5ed4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d2ea>
      e952cb:	4c 8d 6b 18          	lea    r13,[rbx+0x18]
      e952cf:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]
      e952d6:	00 
      e952d7:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]
      e952db:	40 84 ed             	test   bpl,bpl
      e952de:	74 22                	je     e95302 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c718>
      e952e0:	48 8d 9c 24 d0 0f 00 	lea    rbx,[rsp+0xfd0]
      e952e7:	00 
      e952e8:	48 89 df             	mov    rdi,rbx
      e952eb:	e8 06 47 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e952f0:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e952f7:	00 
      e952f8:	48 89 de             	mov    rsi,rbx
      e952fb:	e8 3e 47 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e95300:	eb 44                	jmp    e95346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c75c>
      e95302:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e95309:	00 
      e9530a:	4d 89 28             	mov    QWORD PTR [r8],r13

## 0xe95260
      e95178:	e8 09 93 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9517d:	4d 85 ff             	test   r15,r15
      e95180:	74 05                	je     e95187 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c59d>
      e95182:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95187:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      e9518c:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e95190:	49 8b 85 70 05 00 00 	mov    rax,QWORD PTR [r13+0x570]
      e95197:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
      e9519e:	00 
      e9519f:	bf 98 00 00 00       	mov    edi,0x98
      e951a4:	e8 57 8d 95 00       	call   17edf00 <_Znwm@plt>
      e951a9:	49 89 c6             	mov    r14,rax
      e951ac:	66 0f ef c0          	pxor   xmm0,xmm0
      e951b0:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e951b5:	48 8d 05 ac 82 96 00 	lea    rax,[rip+0x9682ac]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e951bc:	49 89 06             	mov    QWORD PTR [r14],rax
      e951bf:	4d 8d 66 18          	lea    r12,[r14+0x18]
      e951c3:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]
      e951ca:	00 
      e951cb:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      e951d0:	48 89 06             	mov    QWORD PTR [rsi],rax
      e951d3:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
      e951d8:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      e951dc:	4c 89 e7             	mov    rdi,r12
      e951df:	e8 34 2a 03 00       	call   ec7c18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8f02e>
      e951e4:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e951eb:	00 
      e951ec:	e8 95 92 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e951f1:	31 ff                	xor    edi,edi
      e951f3:	e8 24 92 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e951f8:	bf f0 00 00 00       	mov    edi,0xf0
      e951fd:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14
      e95204:	00 
      e95205:	e8 f6 8c 95 00       	call   17edf00 <_Znwm@plt>
      e9520a:	48 89 c3             	mov    rbx,rax
      e9520d:	4c 89 f0             	mov    rax,r14
      e95210:	48 83 c0 08          	add    rax,0x8
      e95214:	66 0f ef c0          	pxor   xmm0,xmm0
      e95218:	f3 0f 7f 43 08       	movdqu XMMWORD PTR [rbx+0x8],xmm0
      e9521d:	48 8d 0d a4 c1 99 00 	lea    rcx,[rip+0x99c1a4]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
      e95224:	48 89 0b             	mov    QWORD PTR [rbx],rcx
      e95227:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e9522b:	48 8d 05 2e da 99 00 	lea    rax,[rip+0x99da2e]        # 1832c60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x4bf8>
      e95232:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      e95236:	48 c7 43 20 32 00 00 	mov    QWORD PTR [rbx+0x20],0x32
      e9523d:	00 
      e9523e:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
      e95245:	00 
      e95246:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
      e9524a:	4d 85 ff             	test   r15,r15
      e9524d:	74 05                	je     e95254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c66a>
      e9524f:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95254:	4c 89 a4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r12
      e9525b:	00 
      e9525c:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12
      e95260:	4c 89 73 40          	mov    QWORD PTR [rbx+0x40],r14
      e95264:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      e95269:	66 0f 6f 84 24 00 01 	movdqa xmm0,XMMWORD PTR [rsp+0x100]
      e95270:	00 00 
      e95272:	66 49 0f 7e c4       	movq   r12,xmm0
      e95277:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      e9527b:	4c 89 e7             	mov    rdi,r12
      e9527e:	48 89 5c 24 70       	mov    QWORD PTR [rsp+0x70],rbx
      e95283:	ff 10                	call   QWORD PTR [rax]
      e95285:	49 89 c5             	mov    r13,rax
      e95288:	4c 8d 7b 48          	lea    r15,[rbx+0x48]
      e9528c:	66 0f ef c0          	pxor   xmm0,xmm0
      e95290:	f3 41 0f 7f 47 20    	movdqu XMMWORD PTR [r15+0x20],xmm0
      e95296:	f3 41 0f 7f 47 10    	movdqu XMMWORD PTR [r15+0x10],xmm0
      e9529c:	f3 41 0f 7f 07       	movdqu XMMWORD PTR [r15],xmm0
      e952a1:	48 89 c7             	mov    rdi,rax
      e952a4:	e8 51 47 ff ff       	call   e899fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e10>
      e952a9:	48 89 c5             	mov    rbp,rax
      e952ac:	49 89 d6             	mov    r14,rdx
      e952af:	4c 89 ef             	mov    rdi,r13
      e952b2:	e8 6b 47 ff ff       	call   e89a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50e38>
      e952b7:	49 89 d0             	mov    r8,rdx
      e952ba:	4c 89 ff             	mov    rdi,r15
      e952bd:	48 89 ee             	mov    rsi,rbp
      e952c0:	4c 89 f2             	mov    rdx,r14
      e952c3:	48 89 c1             	mov    rcx,rax
      e952c6:	e8 09 0c 03 00       	call   ec5ed4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8d2ea>
      e952cb:	4c 8d 6b 18          	lea    r13,[rbx+0x18]
      e952cf:	4c 8b b4 24 88 00 00 	mov    r14,QWORD PTR [rsp+0x88]
      e952d6:	00 
      e952d7:	41 8a 6e 01          	mov    bpl,BYTE PTR [r14+0x1]
      e952db:	40 84 ed             	test   bpl,bpl
      e952de:	74 22                	je     e95302 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c718>
      e952e0:	48 8d 9c 24 d0 0f 00 	lea    rbx,[rsp+0xfd0]
      e952e7:	00 
      e952e8:	48 89 df             	mov    rdi,rbx
      e952eb:	e8 06 47 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e952f0:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e952f7:	00 
      e952f8:	48 89 de             	mov    rsi,rbx
      e952fb:	e8 3e 47 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
      e95300:	eb 44                	jmp    e95346 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5c75c>
      e95302:	4c 8d 84 24 30 0a 00 	lea    r8,[rsp+0xa30]
      e95309:	00 
      e9530a:	4d 89 28             	mov    QWORD PTR [r8],r13
      e9530d:	48 8d 35 7d 7d c0 ff 	lea    rsi,[rip+0xffffffffffc07d7d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>

## 0xe958eb
      e95807:	31 ff                	xor    edi,edi
      e95809:	e8 78 8c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9580e:	31 ff                	xor    edi,edi
      e95810:	e8 07 8c c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95815:	6a 58                	push   0x58
      e95817:	5f                   	pop    rdi
      e95818:	e8 e3 86 95 00       	call   17edf00 <_Znwm@plt>
      e9581d:	49 89 c7             	mov    r15,rax
      e95820:	66 0f ef c0          	pxor   xmm0,xmm0
      e95824:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e95829:	48 8d 05 38 7c 96 00 	lea    rax,[rip+0x967c38]        # 17fd468 <_ZTINSt6__ndk117bad_function_callE@@Base+0x508>
      e95830:	49 89 07             	mov    QWORD PTR [r15],rax
      e95833:	48 8d 05 86 e3 9a 00 	lea    rax,[rip+0x9ae386]        # 1843bc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a8>
      e9583a:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e9583e:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      e95842:	4d 89 67 28          	mov    QWORD PTR [r15+0x28],r12
      e95846:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
      e9584c:	49 8d 7f 30          	lea    rdi,[r15+0x30]
      e95850:	48 8d 35 e9 4b 4e ff 	lea    rsi,[rip+0xffffffffff4e4be9]        # 37a440 <_ZTSSt12bad_any_cast@@Base-0x15d88>
      e95857:	6a 08                	push   0x8
      e95859:	5a                   	pop    rdx
      e9585a:	e8 bb 71 c0 ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      e9585f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e95864:	4c 8b 35 35 c2 a1 00 	mov    r14,QWORD PTR [rip+0xa1c235]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e9586b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      e95870:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e95874:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e95878:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
      e9587e:	48 85 c0             	test   rax,rax
      e95881:	74 05                	je     e95888 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cc9e>
      e95883:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95888:	4c 89 e7             	mov    rdi,r12
      e9588b:	e8 f6 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95890:	31 ff                	xor    edi,edi
      e95892:	e8 85 8b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95897:	31 ff                	xor    edi,edi
      e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      e958c1:	00 
      e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e958c7:	6a 50                	push   0x50
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95969:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      e95970:	00 00 
      e95972:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
      e95979:	00 00 
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
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

## 0xe95948
      e9585f:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e95864:	4c 8b 35 35 c2 a1 00 	mov    r14,QWORD PTR [rip+0xa1c235]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e9586b:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      e95870:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      e95874:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      e95878:	f3 41 0f 7f 47 48    	movdqu XMMWORD PTR [r15+0x48],xmm0
      e9587e:	48 85 c0             	test   rax,rax
      e95881:	74 05                	je     e95888 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5cc9e>
      e95883:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e95888:	4c 89 e7             	mov    rdi,r12
      e9588b:	e8 f6 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e95890:	31 ff                	xor    edi,edi
      e95892:	e8 85 8b c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e95897:	31 ff                	xor    edi,edi
      e95899:	e8 e8 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9589e:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e958a5:	00 
      e958a6:	e8 db 8b c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e958ab:	48 8d b3 30 02 00 00 	lea    rsi,[rbx+0x230]
      e958b2:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]
      e958b9:	00 
      e958ba:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
      e958c1:	00 
      e958c2:	e8 f7 63 c3 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>
      e958c7:	6a 50                	push   0x50
      e958c9:	5f                   	pop    rdi
      e958ca:	e8 31 86 95 00       	call   17edf00 <_Znwm@plt>
      e958cf:	48 89 c5             	mov    rbp,rax
      e958d2:	66 0f ef c0          	pxor   xmm0,xmm0
      e958d6:	f3 0f 7f 45 08       	movdqu XMMWORD PTR [rbp+0x8],xmm0
      e958db:	48 8d 05 46 ba 96 00 	lea    rax,[rip+0x96ba46]        # 1801328 <_ZTIN4asio22service_already_existsE@@Base+0x2b10>
      e958e2:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
      e958e6:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
      e958eb:	48 83 65 40 00       	and    QWORD PTR [rbp+0x40],0x0
      e958f0:	4c 89 f8             	mov    rax,r15
      e958f3:	48 83 c0 18          	add    rax,0x18
      e958f7:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
      e958fa:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
      e95901:	00 
      e95902:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]
      e95906:	48 89 8c 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rcx
      e9590d:	00 
      e9590e:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      e95912:	48 89 8c 24 48 01 00 	mov    QWORD PTR [rsp+0x148],rcx
      e95919:	00 
      e9591a:	48 8b 8b d8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd8]
      e95921:	48 89 8c 24 40 01 00 	mov    QWORD PTR [rsp+0x140],rcx
      e95928:	00 
      e95929:	48 8b 8b e0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xe0]
      e95930:	48 89 8c 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rcx
      e95937:	00 
      e95938:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
      e9593c:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
      e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
      e95947:	00 
      e95948:	48 8b 4b 40          	mov    rcx,QWORD PTR [rbx+0x40]
      e9594c:	48 89 8c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rcx
      e95953:	00 
      e95954:	48 89 84 24 30 0a 00 	mov    QWORD PTR [rsp+0xa30],rax
      e9595b:	00 
      e9595c:	4c 89 bc 24 38 0a 00 	mov    QWORD PTR [rsp+0xa38],r15
      e95963:	00 
      e95964:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e95969:	66 0f 6f 84 24 d0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xd0]
      e95970:	00 00 
      e95972:	66 0f 7f 84 24 50 10 	movdqa XMMWORD PTR [rsp+0x1050],xmm0
      e95979:	00 00 
      e9597b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
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

## 0xe96461
      e96375:	48 89 03             	mov    QWORD PTR [rbx],rax
      e96378:	48 8d b4 24 60 06 00 	lea    rsi,[rsp+0x660]
      e9637f:	00 
      e96380:	48 8b 46 f0          	mov    rax,QWORD PTR [rsi-0x10]
      e96384:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      e96388:	8b 46 f8             	mov    eax,DWORD PTR [rsi-0x8]
      e9638b:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax
      e9638e:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      e96392:	4c 89 f7             	mov    rdi,r14
      e96395:	e8 7c 85 ff ff       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e9639a:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
      e963a1:	00 
      e963a2:	0f 28 84 24 e0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6e0]
      e963a9:	00 
      e963aa:	0f 11 83 a0 00 00 00 	movups XMMWORD PTR [rbx+0xa0],xmm0
      e963b1:	48 85 c0             	test   rax,rax
      e963b4:	74 05                	je     e963bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7d1>
      e963b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e963bb:	44 88 bc 24 68 01 00 	mov    BYTE PTR [rsp+0x168],r15b
      e963c2:	00 
      e963c3:	0f 28 84 24 f0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6f0]
      e963ca:	00 
      e963cb:	0f 29 83 b0 00 00 00 	movaps XMMWORD PTR [rbx+0xb0],xmm0
      e963d2:	48 8b 84 24 08 07 00 	mov    rax,QWORD PTR [rsp+0x708]
      e963d9:	00 
      e963da:	66 0f 6f 84 24 00 07 	movdqa xmm0,XMMWORD PTR [rsp+0x700]
      e963e1:	00 00 
      e963e3:	f3 0f 7f 83 c0 00 00 	movdqu XMMWORD PTR [rbx+0xc0],xmm0
      e963ea:	00 
      e963eb:	48 85 c0             	test   rax,rax
      e963ee:	74 05                	je     e963f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d80b>
      e963f0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e963f5:	4c 8d bb d0 00 00 00 	lea    r15,[rbx+0xd0]
      e963fc:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      e96403:	00 
      e96404:	4c 89 ff             	mov    rdi,r15
      e96407:	e8 84 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9640c:	44 88 a4 24 60 01 00 	mov    BYTE PTR [rsp+0x160],r12b
      e96413:	00 
      e96414:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
      e9641b:	48 8d b4 24 40 07 00 	lea    rsi,[rsp+0x740]
      e96422:	00 
      e96423:	e8 68 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96428:	4c 8d b4 24 90 07 00 	lea    r14,[rsp+0x790]
      e9642f:	00 
      e96430:	41 0f 28 46 e0       	movaps xmm0,XMMWORD PTR [r14-0x20]
      e96435:	0f 29 83 30 01 00 00 	movaps XMMWORD PTR [rbx+0x130],xmm0
      e9643c:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96526:	4d 8b bd 90 05 00 00 	mov    r15,QWORD PTR [r13+0x590]
      e9652d:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e96534:	00 
      e96535:	74 1e                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96537:	41 0f 10 85 58 04 00 	movups xmm0,XMMWORD PTR [r13+0x458]

## 0xe96482
      e9638b:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax
      e9638e:	4c 8d 73 20          	lea    r14,[rbx+0x20]
      e96392:	4c 89 f7             	mov    rdi,r14
      e96395:	e8 7c 85 ff ff       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e9639a:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
      e963a1:	00 
      e963a2:	0f 28 84 24 e0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6e0]
      e963a9:	00 
      e963aa:	0f 11 83 a0 00 00 00 	movups XMMWORD PTR [rbx+0xa0],xmm0
      e963b1:	48 85 c0             	test   rax,rax
      e963b4:	74 05                	je     e963bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7d1>
      e963b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e963bb:	44 88 bc 24 68 01 00 	mov    BYTE PTR [rsp+0x168],r15b
      e963c2:	00 
      e963c3:	0f 28 84 24 f0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6f0]
      e963ca:	00 
      e963cb:	0f 29 83 b0 00 00 00 	movaps XMMWORD PTR [rbx+0xb0],xmm0
      e963d2:	48 8b 84 24 08 07 00 	mov    rax,QWORD PTR [rsp+0x708]
      e963d9:	00 
      e963da:	66 0f 6f 84 24 00 07 	movdqa xmm0,XMMWORD PTR [rsp+0x700]
      e963e1:	00 00 
      e963e3:	f3 0f 7f 83 c0 00 00 	movdqu XMMWORD PTR [rbx+0xc0],xmm0
      e963ea:	00 
      e963eb:	48 85 c0             	test   rax,rax
      e963ee:	74 05                	je     e963f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d80b>
      e963f0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e963f5:	4c 8d bb d0 00 00 00 	lea    r15,[rbx+0xd0]
      e963fc:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      e96403:	00 
      e96404:	4c 89 ff             	mov    rdi,r15
      e96407:	e8 84 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9640c:	44 88 a4 24 60 01 00 	mov    BYTE PTR [rsp+0x160],r12b
      e96413:	00 
      e96414:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
      e9641b:	48 8d b4 24 40 07 00 	lea    rsi,[rsp+0x740]
      e96422:	00 
      e96423:	e8 68 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96428:	4c 8d b4 24 90 07 00 	lea    r14,[rsp+0x790]
      e9642f:	00 
      e96430:	41 0f 28 46 e0       	movaps xmm0,XMMWORD PTR [r14-0x20]
      e96435:	0f 29 83 30 01 00 00 	movaps XMMWORD PTR [rbx+0x130],xmm0
      e9643c:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96526:	4d 8b bd 90 05 00 00 	mov    r15,QWORD PTR [r13+0x590]
      e9652d:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e96534:	00 
      e96535:	74 1e                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96537:	41 0f 10 85 58 04 00 	movups xmm0,XMMWORD PTR [r13+0x458]
      e9653e:	00 
      e9653f:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e96544:	49 8b 85 60 04 00 00 	mov    rax,QWORD PTR [r13+0x460]
      e9654b:	48 85 c0             	test   rax,rax
      e9654e:	74 05                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96550:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]

## 0xe96493
      e96395:	e8 7c 85 ff ff       	call   e8e916 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d2c>
      e9639a:	48 8b 84 24 e8 06 00 	mov    rax,QWORD PTR [rsp+0x6e8]
      e963a1:	00 
      e963a2:	0f 28 84 24 e0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6e0]
      e963a9:	00 
      e963aa:	0f 11 83 a0 00 00 00 	movups XMMWORD PTR [rbx+0xa0],xmm0
      e963b1:	48 85 c0             	test   rax,rax
      e963b4:	74 05                	je     e963bb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d7d1>
      e963b6:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e963bb:	44 88 bc 24 68 01 00 	mov    BYTE PTR [rsp+0x168],r15b
      e963c2:	00 
      e963c3:	0f 28 84 24 f0 06 00 	movaps xmm0,XMMWORD PTR [rsp+0x6f0]
      e963ca:	00 
      e963cb:	0f 29 83 b0 00 00 00 	movaps XMMWORD PTR [rbx+0xb0],xmm0
      e963d2:	48 8b 84 24 08 07 00 	mov    rax,QWORD PTR [rsp+0x708]
      e963d9:	00 
      e963da:	66 0f 6f 84 24 00 07 	movdqa xmm0,XMMWORD PTR [rsp+0x700]
      e963e1:	00 00 
      e963e3:	f3 0f 7f 83 c0 00 00 	movdqu XMMWORD PTR [rbx+0xc0],xmm0
      e963ea:	00 
      e963eb:	48 85 c0             	test   rax,rax
      e963ee:	74 05                	je     e963f5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d80b>
      e963f0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e963f5:	4c 8d bb d0 00 00 00 	lea    r15,[rbx+0xd0]
      e963fc:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      e96403:	00 
      e96404:	4c 89 ff             	mov    rdi,r15
      e96407:	e8 84 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e9640c:	44 88 a4 24 60 01 00 	mov    BYTE PTR [rsp+0x160],r12b
      e96413:	00 
      e96414:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
      e9641b:	48 8d b4 24 40 07 00 	lea    rsi,[rsp+0x740]
      e96422:	00 
      e96423:	e8 68 3e be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e96428:	4c 8d b4 24 90 07 00 	lea    r14,[rsp+0x790]
      e9642f:	00 
      e96430:	41 0f 28 46 e0       	movaps xmm0,XMMWORD PTR [r14-0x20]
      e96435:	0f 29 83 30 01 00 00 	movaps XMMWORD PTR [rbx+0x130],xmm0
      e9643c:	49 8b 46 f0          	mov    rax,QWORD PTR [r14-0x10]
      e96440:	48 89 83 40 01 00 00 	mov    QWORD PTR [rbx+0x140],rax
      e96447:	0f 57 c0             	xorps  xmm0,xmm0
      e9644a:	41 0f 11 46 e8       	movups XMMWORD PTR [r14-0x18],xmm0
      e9644f:	48 89 df             	mov    rdi,rbx
      e96452:	48 81 c7 50 01 00 00 	add    rdi,0x150
      e96459:	4c 89 f6             	mov    rsi,r14
      e9645c:	e8 cb 65 fe ff       	call   e7ca2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e42>
      e96461:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      e96465:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
      e9646c:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
      e96471:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      e96478:	66 0f ef c9          	pxor   xmm1,xmm1
      e9647c:	66 41 0f 7f 4e 30    	movdqa XMMWORD PTR [r14+0x30],xmm1
      e96482:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      e96487:	41 0f 10 46 48       	movups xmm0,XMMWORD PTR [r14+0x48]
      e9648c:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      e96493:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
      e96497:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      e9649e:	0f 57 c0             	xorps  xmm0,xmm0
      e964a1:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e964a6:	66 41 0f 7f 4e 50    	movdqa XMMWORD PTR [r14+0x50],xmm1
      e964ac:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
      e964b1:	0f 29 83 b0 01 00 00 	movaps XMMWORD PTR [rbx+0x1b0],xmm0
      e964b8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e964bf:	00 
      e964c0:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      e964c4:	48 89 9c 24 20 08 00 	mov    QWORD PTR [rsp+0x820],rbx
      e964cb:	00 
      e964cc:	e8 f9 3d be ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      e964d1:	48 8d 84 24 20 06 00 	lea    rax,[rsp+0x620]
      e964d8:	00 
      e964d9:	48 8d 0d 00 84 97 00 	lea    rcx,[rip+0x978400]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96526:	4d 8b bd 90 05 00 00 	mov    r15,QWORD PTR [r13+0x590]
      e9652d:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0
      e96534:	00 
      e96535:	74 1e                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96537:	41 0f 10 85 58 04 00 	movups xmm0,XMMWORD PTR [r13+0x458]
      e9653e:	00 
      e9653f:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      e96544:	49 8b 85 60 04 00 00 	mov    rax,QWORD PTR [r13+0x460]
      e9654b:	48 85 c0             	test   rax,rax
      e9654e:	74 05                	je     e96555 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d96b>
      e96550:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      e96555:	bf 60 03 00 00       	mov    edi,0x360
      e9655a:	e8 a1 79 95 00       	call   17edf00 <_Znwm@plt>
      e9655f:	48 89 c5             	mov    rbp,rax

## 0xe96ea5
      e96db0:	00 
      e96db1:	e8 c8 b7 00 00       	call   ea257e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69994>
      e96db6:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
      e96dbd:	00 
      e96dbe:	e8 a7 31 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96dc3:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
      e96dca:	00 
      e96dcb:	e8 20 b8 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e96dd0:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96dd5:	48 8b 83 98 05 00 00 	mov    rax,QWORD PTR [rbx+0x598]
      e96ddc:	48 89 85 c8 02 00 00 	mov    QWORD PTR [rbp+0x2c8],rax
      e96de3:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e96de8:	49 89 2c 24          	mov    QWORD PTR [r12],rbp
      e96dec:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e96df1:	4d 89 6c 24 08       	mov    QWORD PTR [r12+0x8],r13
      e96df6:	e8 8b 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96dfb:	4c 8b bb b0 00 00 00 	mov    r15,QWORD PTR [rbx+0xb0]
      e96e02:	48 8b 83 90 05 00 00 	mov    rax,QWORD PTR [rbx+0x590]
      e96e09:	4c 8d 84 24 10 10 00 	lea    r8,[rsp+0x1010]
      e96e10:	00 
      e96e11:	49 89 00             	mov    QWORD PTR [r8],rax
      e96e14:	48 8d 35 76 62 c0 ff 	lea    rsi,[rip+0xffffffffffc06276]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e96e1b:	48 8d 0d 48 b8 00 00 	lea    rcx,[rip+0xb848]        # ea266a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a80>
      e96e22:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e96e29:	00 
      e96e2a:	6a 08                	push   0x8
      e96e2c:	41 59                	pop    r9
      e96e2e:	4c 89 e7             	mov    rdi,r12
      e96e31:	31 d2                	xor    edx,edx
      e96e33:	e8 5c 39 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e96e38:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e96e3b:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
      e96e58:	00 
      e96e59:	e8 28 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12

## 0xe96ec8
      e96ddc:	48 89 85 c8 02 00 00 	mov    QWORD PTR [rbp+0x2c8],rax
      e96de3:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      e96de8:	49 89 2c 24          	mov    QWORD PTR [r12],rbp
      e96dec:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e96df1:	4d 89 6c 24 08       	mov    QWORD PTR [r12+0x8],r13
      e96df6:	e8 8b 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96dfb:	4c 8b bb b0 00 00 00 	mov    r15,QWORD PTR [rbx+0xb0]
      e96e02:	48 8b 83 90 05 00 00 	mov    rax,QWORD PTR [rbx+0x590]
      e96e09:	4c 8d 84 24 10 10 00 	lea    r8,[rsp+0x1010]
      e96e10:	00 
      e96e11:	49 89 00             	mov    QWORD PTR [r8],rax
      e96e14:	48 8d 35 76 62 c0 ff 	lea    rsi,[rip+0xffffffffffc06276]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e96e1b:	48 8d 0d 48 b8 00 00 	lea    rcx,[rip+0xb848]        # ea266a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a80>
      e96e22:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e96e29:	00 
      e96e2a:	6a 08                	push   0x8
      e96e2c:	41 59                	pop    r9
      e96e2e:	4c 89 e7             	mov    rdi,r12
      e96e31:	31 d2                	xor    edx,edx
      e96e33:	e8 5c 39 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e96e38:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e96e3b:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
      e96e58:	00 
      e96e59:	e8 28 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]

## 0xe96ed0
      e96de8:	49 89 2c 24          	mov    QWORD PTR [r12],rbp
      e96dec:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      e96df1:	4d 89 6c 24 08       	mov    QWORD PTR [r12+0x8],r13
      e96df6:	e8 8b 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96dfb:	4c 8b bb b0 00 00 00 	mov    r15,QWORD PTR [rbx+0xb0]
      e96e02:	48 8b 83 90 05 00 00 	mov    rax,QWORD PTR [rbx+0x590]
      e96e09:	4c 8d 84 24 10 10 00 	lea    r8,[rsp+0x1010]
      e96e10:	00 
      e96e11:	49 89 00             	mov    QWORD PTR [r8],rax
      e96e14:	48 8d 35 76 62 c0 ff 	lea    rsi,[rip+0xffffffffffc06276]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e96e1b:	48 8d 0d 48 b8 00 00 	lea    rcx,[rip+0xb848]        # ea266a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a80>
      e96e22:	4c 8d a4 24 50 10 00 	lea    r12,[rsp+0x1050]
      e96e29:	00 
      e96e2a:	6a 08                	push   0x8
      e96e2c:	41 59                	pop    r9
      e96e2e:	4c 89 e7             	mov    rdi,r12
      e96e31:	31 d2                	xor    edx,edx
      e96e33:	e8 5c 39 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e96e38:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e96e3b:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
      e96e58:	00 
      e96e59:	e8 28 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]

## 0xe96f02
      e96e2a:	6a 08                	push   0x8
      e96e2c:	41 59                	pop    r9
      e96e2e:	4c 89 e7             	mov    rdi,r12
      e96e31:	31 d2                	xor    edx,edx
      e96e33:	e8 5c 39 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e96e38:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e96e3b:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
      e96e58:	00 
      e96e59:	e8 28 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>

## 0xe96f14
      e96e38:	49 8b 07             	mov    rax,QWORD PTR [r15]
      e96e3b:	48 8d bc 24 98 02 00 	lea    rdi,[rsp+0x298]
      e96e42:	00 
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
      e96e58:	00 
      e96e59:	e8 28 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
      e96fc1:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96fc4:	48 8b bc 24 50 10 00 	mov    rdi,QWORD PTR [rsp+0x1050]

## 0xe96f1e
      e96e43:	4c 89 fe             	mov    rsi,r15
      e96e46:	4c 89 e2             	mov    rdx,r12
      e96e49:	4c 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],r13
      e96e4e:	ff 50 40             	call   QWORD PTR [rax+0x40]
      e96e51:	48 8b bc 24 a0 02 00 	mov    rdi,QWORD PTR [rsp+0x2a0]
      e96e58:	00 
      e96e59:	e8 28 76 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96e5e:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96e65:	00 
      e96e66:	4c 89 ff             	mov    rdi,r15
      e96e69:	e8 7a 39 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e96e6e:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
      e96fc1:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96fc4:	48 8b bc 24 50 10 00 	mov    rdi,QWORD PTR [rsp+0x1050]
      e96fcb:	00 
      e96fcc:	48 85 ff             	test   rdi,rdi
      e96fcf:	74 66                	je     e97037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e44d>

## 0xe96f4a
      e96e73:	48 8b 83 e8 00 00 00 	mov    rax,QWORD PTR [rbx+0xe8]
      e96e7a:	48 8d 0d 6f ae 99 00 	lea    rcx,[rip+0x99ae6f]        # 1831cf0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3c88>
      e96e81:	49 89 0f             	mov    QWORD PTR [r15],rcx
      e96e84:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96e8a:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      e96e90:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      e96e94:	4d 89 7f 20          	mov    QWORD PTR [r15+0x20],r15
      e96e98:	48 8b 5c 24 58       	mov    rbx,QWORD PTR [rsp+0x58]
      e96e9d:	4c 8b a4 24 f0 01 00 	mov    r12,QWORD PTR [rsp+0x1f0]
      e96ea4:	00 
      e96ea5:	4c 39 63 40          	cmp    QWORD PTR [rbx+0x40],r12
      e96ea9:	74 30                	je     e96edb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e2f1>
      e96eab:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96eb2:	00 
      e96eb3:	4c 89 ff             	mov    rdi,r15
      e96eb6:	4c 89 e6             	mov    rsi,r12
      e96eb9:	e8 14 b9 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ebe:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ec2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96ec5:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96ec8:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
      e96ecc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      e96ed0:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96ed4:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96ed9:	eb 73                	jmp    e96f4e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e364>
      e96edb:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96ee2:	00 
      e96ee3:	48 8d b4 24 10 10 00 	lea    rsi,[rsp+0x1010]
      e96eea:	00 
      e96eeb:	4c 89 ff             	mov    rdi,r15
      e96eee:	e8 df b8 00 00       	call   ea27d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
      e96ef3:	49 8b 7f 20          	mov    rdi,QWORD PTR [r15+0x20]
      e96ef7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96efa:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96efd:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
      e96f02:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f09:	4c 89 fe             	mov    rsi,r15
      e96f0c:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f0f:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      e96f14:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e96f18:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f1b:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f1e:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
      e96f23:	4c 89 bc 24 70 10 00 	mov    QWORD PTR [rsp+0x1070],r15
      e96f2a:	00 
      e96f2b:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f32:	00 
      e96f33:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f36:	4c 89 e6             	mov    rsi,r12
      e96f39:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f3c:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e96f43:	00 
      e96f44:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f47:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96f4a:	4c 89 63 40          	mov    QWORD PTR [rbx+0x40],r12
      e96f4e:	49 83 c6 08          	add    r14,0x8
      e96f52:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f59:	00 
      e96f5a:	4c 89 ff             	mov    rdi,r15
      e96f5d:	e8 08 30 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e96f62:	31 ff                	xor    edi,edi
      e96f64:	e8 49 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f69:	31 ff                	xor    edi,edi
      e96f6b:	e8 42 75 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
      e96f70:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
      e96f76:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
      e96f7b:	f0 49 ff 06          	lock inc QWORD PTR [r14]
      e96f7f:	48 8b bc 24 88 01 00 	mov    rdi,QWORD PTR [rsp+0x188]
      e96f86:	00 
      e96f87:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e96f8a:	4c 8d bc 24 50 10 00 	lea    r15,[rsp+0x1050]
      e96f91:	00 
      e96f92:	4c 89 fe             	mov    rsi,r15
      e96f95:	ff 50 18             	call   QWORD PTR [rax+0x18]
      e96f98:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      e96f9c:	e8 e5 74 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e96fa1:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
      e96fa6:	48 8b b3 c0 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3c0]
      e96fad:	48 85 f6             	test   rsi,rsi
      e96fb0:	0f 84 8e 00 00 00    	je     e97044 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e45a>
      e96fb6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      e96fb9:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e96fc0:	00 
      e96fc1:	ff 50 20             	call   QWORD PTR [rax+0x20]
      e96fc4:	48 8b bc 24 50 10 00 	mov    rdi,QWORD PTR [rsp+0x1050]
      e96fcb:	00 
      e96fcc:	48 85 ff             	test   rdi,rdi
      e96fcf:	74 66                	je     e97037 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e44d>
      e96fd1:	48 8b 9c 24 18 01 00 	mov    rbx,QWORD PTR [rsp+0x118]
      e96fd8:	00 
      e96fd9:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fde:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e96fe3:	48 8d 05 96 ad 99 00 	lea    rax,[rip+0x99ad96]        # 1831d80 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d18>
      e96fea:	4c 8d a4 24 f0 05 00 	lea    r12,[rsp+0x5f0]
      e96ff1:	00 
      e96ff2:	49 89 04 24          	mov    QWORD PTR [r12],rax
      e96ff6:	48 8b 84 24 88 01 00 	mov    rax,QWORD PTR [rsp+0x188]
      e96ffd:	00 
      e96ffe:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      e97003:	49 89 5c 24 10       	mov    QWORD PTR [r12+0x10],rbx

## 0xe97442
      e97347:	48 8b bb 10 03 00 00 	mov    rdi,QWORD PTR [rbx+0x310]
      e9734e:	48 85 ff             	test   rdi,rdi
      e97351:	0f 84 ee 08 00 00    	je     e97c45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f05b>
      e97357:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9735a:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      e97361:	00 
      e97362:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e97365:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
      e9736c:	00 
      e9736d:	e8 0a b4 f5 ff       	call   df277c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf802>
      e97372:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
      e97379:	00 
      e9737a:	e8 eb 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9737f:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e97386:	00 
      e97387:	e8 de 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9738c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e97393:	00 
      e97394:	e8 d1 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e97399:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      e973a0:	00 
      e973a1:	e8 4a b2 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e973a6:	49 8d 7d 10          	lea    rdi,[r13+0x10]
      e973aa:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      e973b0:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
      e973b5:	e8 7c 77 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e973ba:	bf a0 0f 00 00       	mov    edi,0xfa0
      e973bf:	e8 3c 6b 95 00       	call   17edf00 <_Znwm@plt>
      e973c4:	49 89 c6             	mov    r14,rax
      e973c7:	66 0f ef c0          	pxor   xmm0,xmm0
      e973cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e973d0:	48 8d 05 f1 a9 99 00 	lea    rax,[rip+0x99a9f1]        # 1831dc8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d60>
      e973d7:	49 89 06             	mov    QWORD PTR [r14],rax
      e973da:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e973df:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e973e4:	4d 8d 6e 18          	lea    r13,[r14+0x18]
      e973e8:	48 8d 05 f1 cd 99 00 	lea    rax,[rip+0x99cdf1]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>
      e973ef:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e973f3:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e973f7:	48 8b 80 d8 fe ff ff 	mov    rax,QWORD PTR [rax-0x128]
      e973fe:	48 01 e8             	add    rax,rbp
      e97401:	48 8d 94 24 50 10 00 	lea    rdx,[rsp+0x1050]
      e97408:	00 
      e97409:	48 89 02             	mov    QWORD PTR [rdx],rax
      e9740c:	4c 89 7a 08          	mov    QWORD PTR [rdx+0x8],r15
      e97410:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e97415:	48 8d 35 e4 ce 99 00 	lea    rsi,[rip+0x99cee4]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      e9741c:	4c 89 ef             	mov    rdi,r13
      e9741f:	e8 5a 24 03 00       	call   ec987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90c94>
      e97424:	4c 89 ff             	mov    rdi,r15
      e97427:	e8 5a 70 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9742c:	48 8d 05 5d c3 99 00 	lea    rax,[rip+0x99c35d]        # 1833790 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5728>
      e97433:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e97437:	48 8d 05 a2 c5 99 00 	lea    rax,[rip+0x99c5a2]        # 18339e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5978>
      e9743e:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
      e97442:	49 89 6e 38          	mov    QWORD PTR [r14+0x38],rbp
      e97446:	4d 89 7e 40          	mov    QWORD PTR [r14+0x40],r15
      e9744a:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9744f:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      e97453:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      e97458:	e8 cd 36 7d 00       	call   166ab2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ec96>
      e9745d:	49 8d be 38 0f 00 00 	lea    rdi,[r14+0xf38]
      e97464:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
      e9746b:	00 
      e9746c:	e8 cd dc f6 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
      e97471:	4d 89 f4             	mov    r12,r14
      e97474:	49 81 c4 90 0f 00 00 	add    r12,0xf90
      e9747b:	4c 89 e7             	mov    rdi,r12
      e9747e:	e8 73 25 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e97483:	49 8b 5e 38          	mov    rbx,QWORD PTR [r14+0x38]
      e97487:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e9748a:	48 8b a8 d8 fe ff ff 	mov    rbp,QWORD PTR [rax-0x128]
      e97491:	4c 8d 84 24 d0 03 00 	lea    r8,[rsp+0x3d0]
      e97498:	00 
      e97499:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      e9749e:	4d 89 28             	mov    QWORD PTR [r8],r13
      e974a1:	48 8d 35 e9 5b c0 ff 	lea    rsi,[rip+0xffffffffffc05be9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e974a8:	48 8d 0d b7 41 03 00 	lea    rcx,[rip+0x341b7]        # ecb666 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92a7c>
      e974af:	4c 8d ac 24 50 10 00 	lea    r13,[rsp+0x1050]
      e974b6:	00 
      e974b7:	6a 08                	push   0x8
      e974b9:	41 59                	pop    r9
      e974bb:	4c 89 ef             	mov    rdi,r13
      e974be:	31 d2                	xor    edx,edx
      e974c0:	e8 cf 32 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e974c5:	48 8d 34 2b          	lea    rsi,[rbx+rbp*1]
      e974c9:	48 8b 04 2b          	mov    rax,QWORD PTR [rbx+rbp*1]
      e974cd:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e974d4:	00 
      e974d5:	4c 89 ea             	mov    rdx,r13
      e974d8:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      e974de:	48 8d 9c 24 10 10 00 	lea    rbx,[rsp+0x1010]
      e974e5:	00 
      e974e6:	4c 89 e7             	mov    rdi,r12
      e974e9:	48 89 de             	mov    rsi,rbx
      e974ec:	e8 01 27 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e974f1:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e974f5:	e8 8c 6f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e974fa:	48 8d 9c 24 50 10 00 	lea    rbx,[rsp+0x1050]
      e97501:	00 
      e97502:	48 89 df             	mov    rdi,rbx

## 0xe97446
      e9734e:	48 85 ff             	test   rdi,rdi
      e97351:	0f 84 ee 08 00 00    	je     e97c45 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f05b>
      e97357:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e9735a:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
      e97361:	00 
      e97362:	ff 50 30             	call   QWORD PTR [rax+0x30]
      e97365:	48 8d bc 24 80 02 00 	lea    rdi,[rsp+0x280]
      e9736c:	00 
      e9736d:	e8 0a b4 f5 ff       	call   df277c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xbf802>
      e97372:	48 8d bc 24 00 0a 00 	lea    rdi,[rsp+0xa00]
      e97379:	00 
      e9737a:	e8 eb 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9737f:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e97386:	00 
      e97387:	e8 de 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9738c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e97393:	00 
      e97394:	e8 d1 2b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e97399:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      e973a0:	00 
      e973a1:	e8 4a b2 00 00       	call   ea25f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a06>
      e973a6:	49 8d 7d 10          	lea    rdi,[r13+0x10]
      e973aa:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      e973b0:	48 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],rdi
      e973b5:	e8 7c 77 c4 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
      e973ba:	bf a0 0f 00 00       	mov    edi,0xfa0
      e973bf:	e8 3c 6b 95 00       	call   17edf00 <_Znwm@plt>
      e973c4:	49 89 c6             	mov    r14,rax
      e973c7:	66 0f ef c0          	pxor   xmm0,xmm0
      e973cb:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      e973d0:	48 8d 05 f1 a9 99 00 	lea    rax,[rip+0x99a9f1]        # 1831dc8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3d60>
      e973d7:	49 89 06             	mov    QWORD PTR [r14],rax
      e973da:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
      e973df:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e973e4:	4d 8d 6e 18          	lea    r13,[r14+0x18]
      e973e8:	48 8d 05 f1 cd 99 00 	lea    rax,[rip+0x99cdf1]        # 18341e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6178>
      e973ef:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e973f3:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      e973f7:	48 8b 80 d8 fe ff ff 	mov    rax,QWORD PTR [rax-0x128]
      e973fe:	48 01 e8             	add    rax,rbp
      e97401:	48 8d 94 24 50 10 00 	lea    rdx,[rsp+0x1050]
      e97408:	00 
      e97409:	48 89 02             	mov    QWORD PTR [rdx],rax
      e9740c:	4c 89 7a 08          	mov    QWORD PTR [rdx+0x8],r15
      e97410:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e97415:	48 8d 35 e4 ce 99 00 	lea    rsi,[rip+0x99cee4]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      e9741c:	4c 89 ef             	mov    rdi,r13
      e9741f:	e8 5a 24 03 00       	call   ec987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90c94>
      e97424:	4c 89 ff             	mov    rdi,r15
      e97427:	e8 5a 70 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9742c:	48 8d 05 5d c3 99 00 	lea    rax,[rip+0x99c35d]        # 1833790 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5728>
      e97433:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      e97437:	48 8d 05 a2 c5 99 00 	lea    rax,[rip+0x99c5a2]        # 18339e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x5978>
      e9743e:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax
      e97442:	49 89 6e 38          	mov    QWORD PTR [r14+0x38],rbp
      e97446:	4d 89 7e 40          	mov    QWORD PTR [r14+0x40],r15
      e9744a:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      e9744f:	49 8d 7e 48          	lea    rdi,[r14+0x48]
      e97453:	48 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],rdi
      e97458:	e8 cd 36 7d 00       	call   166ab2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ec96>
      e9745d:	49 8d be 38 0f 00 00 	lea    rdi,[r14+0xf38]
      e97464:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
      e9746b:	00 
      e9746c:	e8 cd dc f6 ff       	call   e0513e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd21c4>
      e97471:	4d 89 f4             	mov    r12,r14
      e97474:	49 81 c4 90 0f 00 00 	add    r12,0xf90
      e9747b:	4c 89 e7             	mov    rdi,r12
      e9747e:	e8 73 25 94 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      e97483:	49 8b 5e 38          	mov    rbx,QWORD PTR [r14+0x38]
      e97487:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      e9748a:	48 8b a8 d8 fe ff ff 	mov    rbp,QWORD PTR [rax-0x128]
      e97491:	4c 8d 84 24 d0 03 00 	lea    r8,[rsp+0x3d0]
      e97498:	00 
      e97499:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      e9749e:	4d 89 28             	mov    QWORD PTR [r8],r13
      e974a1:	48 8d 35 e9 5b c0 ff 	lea    rsi,[rip+0xffffffffffc05be9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
      e974a8:	48 8d 0d b7 41 03 00 	lea    rcx,[rip+0x341b7]        # ecb666 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x92a7c>
      e974af:	4c 8d ac 24 50 10 00 	lea    r13,[rsp+0x1050]
      e974b6:	00 
      e974b7:	6a 08                	push   0x8
      e974b9:	41 59                	pop    r9
      e974bb:	4c 89 ef             	mov    rdi,r13
      e974be:	31 d2                	xor    edx,edx
      e974c0:	e8 cf 32 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
      e974c5:	48 8d 34 2b          	lea    rsi,[rbx+rbp*1]
      e974c9:	48 8b 04 2b          	mov    rax,QWORD PTR [rbx+rbp*1]
      e974cd:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e974d4:	00 
      e974d5:	4c 89 ea             	mov    rdx,r13
      e974d8:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      e974de:	48 8d 9c 24 10 10 00 	lea    rbx,[rsp+0x1010]
      e974e5:	00 
      e974e6:	4c 89 e7             	mov    rdi,r12
      e974e9:	48 89 de             	mov    rsi,rbx
      e974ec:	e8 01 27 94 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
      e974f1:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      e974f5:	e8 8c 6f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e974fa:	48 8d 9c 24 50 10 00 	lea    rbx,[rsp+0x1050]
      e97501:	00 
      e97502:	48 89 df             	mov    rdi,rbx
      e97505:	e8 de 32 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

## 0xe98458
      e98371:	e8 9a 5c 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98376:	48 89 df             	mov    rdi,rbx
      e98379:	e8 9e 60 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9837e:	eb 77                	jmp    e983f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f80d>
      e98380:	eb 70                	jmp    e983f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f808>
      e98382:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98387:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e9838e:	00 
      e9838f:	e8 40 18 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98394:	48 8b bc 24 08 0a 00 	mov    rdi,QWORD PTR [rsp+0xa08]
      e9839b:	00 
      e9839c:	e8 e5 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e983a1:	eb 12                	jmp    e983b5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f7cb>
      e983a3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e983a8:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e983af:	00 
      e983b0:	e8 b5 1b be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e983b5:	48 8d bc 24 10 10 00 	lea    rdi,[rsp+0x1010]
      e983bc:	00 
      e983bd:	e8 6e 3a c1 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
      e983c2:	eb 05                	jmp    e983c9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f7df>
      e983c4:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e983c9:	48 89 ef             	mov    rdi,rbp
      e983cc:	e8 7d 3b f7 ff       	call   e0bf4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd8fd4>
      e983d1:	48 8d 35 78 b2 99 00 	lea    rsi,[rip+0x99b278]        # 1833650 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x55e8>
      e983d8:	4c 89 ff             	mov    rdi,r15
      e983db:	e8 56 a4 00 00       	call   ea2836 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69c4c>
      e983e0:	4c 89 f7             	mov    rdi,r14
      e983e3:	e8 28 5c 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e983e8:	4c 89 f7             	mov    rdi,r14
      e983eb:	e8 2c 60 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e983f0:	eb 05                	jmp    e983f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f80d>
      e983f2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e983f7:	48 8b bc 24 28 06 00 	mov    rdi,QWORD PTR [rsp+0x628]
      e983fe:	00 
      e983ff:	e8 82 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98404:	e9 dc 00 00 00       	jmp    e984e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8fb>
      e98409:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9840e:	48 8b bc 24 08 0a 00 	mov    rdi,QWORD PTR [rsp+0xa08]
      e98415:	00 
      e98416:	e8 6b 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9841b:	31 ff                	xor    edi,edi
      e9841d:	e8 64 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98422:	e9 be 00 00 00       	jmp    e984e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8fb>
      e98427:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9842c:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e98433:	00 
      e98434:	e8 af 23 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98439:	4c 89 e7             	mov    rdi,r12
      e9843c:	e8 93 17 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98441:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
      e98448:	00 
      e98449:	e8 18 1a 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e9844e:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      e98453:	e8 d0 2b 7d 00       	call   166b028 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f194>
      e98458:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
      e9845c:	e8 25 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98461:	48 8d 35 98 be 99 00 	lea    rsi,[rip+0x99be98]        # 1834300 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x6298>
      e98468:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      e9846d:	e8 c4 a3 00 00       	call   ea2836 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69c4c>
      e98472:	4c 89 ff             	mov    rdi,r15
      e98475:	e8 0c 60 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e9847a:	4c 89 f7             	mov    rdi,r14
      e9847d:	e8 8e 5b 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98482:	4c 89 f7             	mov    rdi,r14
      e98485:	e8 92 5f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e9848a:	eb 59                	jmp    e984e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8fb>
      e9848c:	eb 52                	jmp    e984e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8f6>
      e9848e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98493:	4c 89 ff             	mov    rdi,r15
      e98496:	e8 cf 1a be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e9849b:	eb 05                	jmp    e984a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8b8>
      e9849d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e984a2:	4c 89 f7             	mov    rdi,r14
      e984a5:	48 83 c7 38          	add    rdi,0x38
      e984a9:	e8 2c 0d 00 00       	call   e991da <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x605f0>
      e984ae:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
      e984b2:	e8 cf 5f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e984b7:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e984be:	00 
      e984bf:	e8 a6 1a be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      e984c4:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e984c9:	e8 b8 5f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e984ce:	4c 89 f7             	mov    rdi,r14
      e984d1:	e8 3a 5b 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e984d6:	4c 89 f7             	mov    rdi,r14
      e984d9:	e8 3e 5f c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e984de:	eb 05                	jmp    e984e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f8fb>
      e984e0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e984e5:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
      e984ec:	00 
      e984ed:	e8 9e 59 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e984f2:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      e984f7:	e8 8a 5f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e984fc:	e9 46 02 00 00       	jmp    e98747 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fb5d>
      e98501:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98506:	eb ea                	jmp    e984f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f908>
      e98508:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e9850d:	48 8d bc 24 50 10 00 	lea    rdi,[rsp+0x1050]
      e98514:	00 
      e98515:	e8 ce 22 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

## 0xe98cea
      e98c0a:	45 31 e4             	xor    r12d,r12d
      e98c0d:	eb 05                	jmp    e98c14 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6002a>
      e98c0f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c14:	4c 89 e7             	mov    rdi,r12
      e98c17:	e8 6a 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c1c:	eb 77                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c1e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c23:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]
      e98c2a:	00 
      e98c2b:	e8 b8 1b 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
      e98c30:	4c 89 f7             	mov    rdi,r14
      e98c33:	e8 be a2 02 00       	call   ec2ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a30c>
      e98c38:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
      e98c3f:	00 
      e98c40:	e8 21 12 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      e98c45:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      e98c4a:	e8 85 0f 94 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      e98c4f:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
      e98c56:	00 
      e98c57:	e8 e4 a2 02 00       	call   ec2f40 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a356>
      e98c5c:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
      e98c61:	e8 e0 8a 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
      e98c66:	eb 05                	jmp    e98c6d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60083>
      e98c68:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c6d:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
      e98c72:	e8 0f 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c77:	31 ff                	xor    edi,edi
      e98c79:	e8 08 58 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98c7e:	4c 89 e7             	mov    rdi,r12
      e98c81:	e8 8a 53 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98c86:	4c 89 e7             	mov    rdi,r12
      e98c89:	e8 8e 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98c8e:	eb 05                	jmp    e98c95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600ab>
      e98c90:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98c95:	48 8b bc 24 18 0e 00 	mov    rdi,QWORD PTR [rsp+0xe18]
      e98c9c:	00 
      e98c9d:	e8 e4 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98ca2:	e9 f8 fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98ca7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cac:	e9 ee fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cb6:	6a 20                	push   0x20
      e98cb8:	5b                   	pop    rbx
      e98cb9:	48 8b bc 1c d8 0b 00 	mov    rdi,QWORD PTR [rsp+rbx*1+0xbd8]
      e98cc0:	00 
      e98cc1:	e8 c0 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cc6:	48 83 c3 f0          	add    rbx,0xfffffffffffffff0
      e98cca:	75 ed                	jne    e98cb9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600cf>
      e98ccc:	e9 ce fa ff ff       	jmp    e9879f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbb5>
      e98cd1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98cd6:	4c 89 ff             	mov    rdi,r15
      e98cd9:	e8 12 34 f7 ff       	call   e0c0f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9176>
      e98cde:	eb 05                	jmp    e98ce5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x600fb>
      e98ce0:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98ce5:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
      e98cea:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
      e98cee:	e8 93 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cf3:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
      e98cf7:	e8 8a 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98cfc:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      e98d03:	00 
      e98d04:	e8 7d 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d09:	48 89 df             	mov    rdi,rbx
      e98d0c:	e8 ff 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d11:	48 89 df             	mov    rdi,rbx
      e98d14:	e8 03 57 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98d19:	eb 05                	jmp    e98d20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60136>
      e98d1b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d20:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      e98d27:	00 
      e98d28:	e8 59 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d2d:	eb 22                	jmp    e98d51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60167>
      e98d2f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d34:	48 8b bc 24 e8 0b 00 	mov    rdi,QWORD PTR [rsp+0xbe8]
      e98d3b:	00 
      e98d3c:	e8 45 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d41:	4c 89 f7             	mov    rdi,r14
      e98d44:	e8 c7 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d49:	4c 89 f7             	mov    rdi,r14
      e98d4c:	e8 cb 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98d51:	31 ff                	xor    edi,edi
      e98d53:	e8 2e 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d58:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
      e98d5d:	e8 24 57 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d62:	e9 4c fa ff ff       	jmp    e987b3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbc9>
      e98d67:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d6c:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
      e98d71:	eb e0                	jmp    e98d53 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60169>
      e98d73:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d78:	e9 60 fa ff ff       	jmp    e987dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5fbf3>
      e98d7d:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      e98d82:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
      e98d86:	e8 fb 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d8b:	48 89 df             	mov    rdi,rbx
      e98d8e:	e8 f3 56 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      e98d93:	4c 89 f7             	mov    rdi,r14
      e98d96:	e8 75 52 95 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      e98d9b:	4c 89 f7             	mov    rdi,r14
      e98d9e:	e8 79 56 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      e98da3:	31 db                	xor    ebx,ebx
      e98da5:	eb 05                	jmp    e98dac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x601c2>
