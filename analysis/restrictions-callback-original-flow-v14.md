# Restrictions callback invocation/original flow v14

Focus: find how the package containing `e99c54` is later invoked and what object becomes `rdi`/`original` for `e99c54`. Static provenance only.

## Text windows mentioning callback package / `e99c54`

| addr | instruction |
|---:|---|
| `0x9d86d5` | `9d86d5:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d86d8` | `9d86d8:	0f 84 75 01 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d86de` | `9d86de:	8b 48 40             	mov    ecx,DWORD PTR [rax+0x40]` |
| `0x9d86e1` | `9d86e1:	85 c9                	test   ecx,ecx` |
| `0x9d86e3` | `9d86e3:	0f 84 a9 01 00 00    	je     9d8892 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6c2>` |
| `0x9d86e9` | `9d86e9:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d86ec` | `9d86ec:	0f 84 61 01 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d86f2` | `9d86f2:	8b 48 58             	mov    ecx,DWORD PTR [rax+0x58]` |
| `0x9d86f5` | `9d86f5:	85 c9                	test   ecx,ecx` |
| `0x9d86f7` | `9d86f7:	0f 84 a3 01 00 00    	je     9d88a0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6d0>` |
| `0x9d86fd` | `9d86fd:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d8700` | `9d8700:	0f 84 4d 01 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d8706` | `9d8706:	8b 48 70             	mov    ecx,DWORD PTR [rax+0x70]` |
| `0x9d8709` | `9d8709:	85 c9                	test   ecx,ecx` |
| `0x9d870b` | `9d870b:	0f 84 9d 01 00 00    	je     9d88ae <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6de>` |
| `0x9d8711` | `9d8711:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d8714` | `9d8714:	0f 84 39 01 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d871a` | `9d871a:	8b 88 88 00 00 00    	mov    ecx,DWORD PTR [rax+0x88]` |
| `0x9d8720` | `9d8720:	85 c9                	test   ecx,ecx` |
| `0x9d8722` | `9d8722:	0f 84 94 01 00 00    	je     9d88bc <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6ec>` |
| `0x9d8728` | `9d8728:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d872b` | `9d872b:	0f 84 22 01 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d8731` | `9d8731:	8b 88 a0 00 00 00    	mov    ecx,DWORD PTR [rax+0xa0]` |
| `0x9d8737` | `9d8737:	85 c9                	test   ecx,ecx` |
| `0x9d8739` | `9d8739:	0f 84 8e 01 00 00    	je     9d88cd <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6fd>` |
| `0x9d873f` | `9d873f:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d8742` | `9d8742:	0f 84 0b 01 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d8748` | `9d8748:	8b 88 b8 00 00 00    	mov    ecx,DWORD PTR [rax+0xb8]` |
| `0x9d874e` | `9d874e:	85 c9                	test   ecx,ecx` |
| `0x9d8750` | `9d8750:	0f 84 85 01 00 00    	je     9d88db <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x70b>` |
| `0x9d8756` | `9d8756:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d8759` | `9d8759:	0f 84 f4 00 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d875f` | `9d875f:	8b 88 d0 00 00 00    	mov    ecx,DWORD PTR [rax+0xd0]` |
| `0x9d8765` | `9d8765:	85 c9                	test   ecx,ecx` |
| `0x9d8767` | `9d8767:	0f 84 7c 01 00 00    	je     9d88e9 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x719>` |
| `0x9d876d` | `9d876d:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d8770` | `9d8770:	0f 84 dd 00 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d8776` | `9d8776:	8b 88 e8 00 00 00    	mov    ecx,DWORD PTR [rax+0xe8]` |
| `0x9d877c` | `9d877c:	85 c9                	test   ecx,ecx` |
| `0x9d877e` | `9d877e:	0f 84 73 01 00 00    	je     9d88f7 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x727>` |
| `0x9d8784` | `9d8784:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d8787` | `9d8787:	0f 84 c6 00 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d878d` | `9d878d:	8b 88 00 01 00 00    	mov    ecx,DWORD PTR [rax+0x100]` |
| `0x9d8793` | `9d8793:	85 c9                	test   ecx,ecx` |
| `0x9d8795` | `9d8795:	0f 84 6a 01 00 00    	je     9d8905 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x735>` |
| `0x9d879b` | `9d879b:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d879e` | `9d879e:	0f 84 af 00 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d87a4` | `9d87a4:	8b 88 18 01 00 00    	mov    ecx,DWORD PTR [rax+0x118]` |
| `0x9d87aa` | `9d87aa:	85 c9                	test   ecx,ecx` |
| `0x9d87ac` | `9d87ac:	0f 84 61 01 00 00    	je     9d8913 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x743>` |
| `0x9d87b2` | `9d87b2:	44 39 c1             	cmp    ecx,r8d` |
| `0x9d87b5` | `9d87b5:	0f 84 98 00 00 00    	je     9d8853 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x683>` |
| `0x9d886b` | `9d886b:	48 89 44 f3 30       	mov    QWORD PTR [rbx+rsi*8+0x30],rax` |
| `0x9d8870` | `9d8870:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]` |
| `0x9d8874` | `9d8874:	5b                   	pop    rbx` |
| `0x9d8875` | `9d8875:	c3                   	ret` |
| `0x9d8876` | `9d8876:	48 8d 8b 40 05 00 00 	lea    rcx,[rbx+0x540]` |
| `0x9d887d` | `9d887d:	31 f6                	xor    esi,esi` |
| `0x9d887f` | `9d887f:	e9 d3 00 00 00       	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d8884` | `9d8884:	48 8d 48 28          	lea    rcx,[rax+0x28]` |
| `0x9d8888` | `9d8888:	be 01 00 00 00       	mov    esi,0x1` |
| `0x9d888d` | `9d888d:	e9 c5 00 00 00       	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d8892` | `9d8892:	48 8d 48 40          	lea    rcx,[rax+0x40]` |
| `0x9d8896` | `9d8896:	be 02 00 00 00       	mov    esi,0x2` |
| `0x9d889b` | `9d889b:	e9 b7 00 00 00       	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d88a0` | `9d88a0:	48 8d 48 58          	lea    rcx,[rax+0x58]` |
| `0x9d88a4` | `9d88a4:	be 03 00 00 00       	mov    esi,0x3` |
| `0x9d88a9` | `9d88a9:	e9 a9 00 00 00       	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d88ae` | `9d88ae:	48 8d 48 70          	lea    rcx,[rax+0x70]` |
| `0x9d88b2` | `9d88b2:	be 04 00 00 00       	mov    esi,0x4` |
| `0x9d88b7` | `9d88b7:	e9 9b 00 00 00       	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d88bc` | `9d88bc:	48 8d 88 88 00 00 00 	lea    rcx,[rax+0x88]` |
| `0x9d88c3` | `9d88c3:	be 05 00 00 00       	mov    esi,0x5` |
| `0x9d88c8` | `9d88c8:	e9 8a 00 00 00       	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d88cd` | `9d88cd:	48 8d 88 a0 00 00 00 	lea    rcx,[rax+0xa0]` |
| `0x9d88d4` | `9d88d4:	be 06 00 00 00       	mov    esi,0x6` |
| `0x9d88d9` | `9d88d9:	eb 7c                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d88db` | `9d88db:	48 8d 88 b8 00 00 00 	lea    rcx,[rax+0xb8]` |
| `0x9d88e2` | `9d88e2:	be 07 00 00 00       	mov    esi,0x7` |
| `0x9d88e7` | `9d88e7:	eb 6e                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d88e9` | `9d88e9:	48 8d 88 d0 00 00 00 	lea    rcx,[rax+0xd0]` |
| `0x9d88f0` | `9d88f0:	be 08 00 00 00       	mov    esi,0x8` |
| `0x9d88f5` | `9d88f5:	eb 60                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d88f7` | `9d88f7:	48 8d 88 e8 00 00 00 	lea    rcx,[rax+0xe8]` |
| `0x9d88fe` | `9d88fe:	be 09 00 00 00       	mov    esi,0x9` |
| `0x9d8903` | `9d8903:	eb 52                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d8905` | `9d8905:	48 8d 88 00 01 00 00 	lea    rcx,[rax+0x100]` |
| `0x9d890c` | `9d890c:	be 0a 00 00 00       	mov    esi,0xa` |
| `0x9d8911` | `9d8911:	eb 44                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d8913` | `9d8913:	48 8d 88 18 01 00 00 	lea    rcx,[rax+0x118]` |
| `0x9d891a` | `9d891a:	be 0b 00 00 00       	mov    esi,0xb` |
| `0x9d891f` | `9d891f:	eb 36                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d8921` | `9d8921:	48 8d 88 30 01 00 00 	lea    rcx,[rax+0x130]` |
| `0x9d8928` | `9d8928:	be 0c 00 00 00       	mov    esi,0xc` |
| `0x9d892d` | `9d892d:	eb 28                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d892f` | `9d892f:	48 8d 88 48 01 00 00 	lea    rcx,[rax+0x148]` |
| `0x9d8936` | `9d8936:	be 0d 00 00 00       	mov    esi,0xd` |
| `0x9d893b` | `9d893b:	eb 1a                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d893d` | `9d893d:	48 8d 88 60 01 00 00 	lea    rcx,[rax+0x160]` |
| `0x9d8944` | `9d8944:	be 0e 00 00 00       	mov    esi,0xe` |
| `0x9d8949` | `9d8949:	eb 0c                	jmp    9d8957 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x787>` |
| `0x9d894b` | `9d894b:	48 8d 88 78 01 00 00 	lea    rcx,[rax+0x178]` |
| `0x9d8952` | `9d8952:	be 0f 00 00 00       	mov    esi,0xf` |
| `0x9d8957` | `9d8957:	48 8d 34 76          	lea    rsi,[rsi+rsi*2]` |
| `0x9f3a28` | `9f3a28:	0f 59 e6             	mulps  xmm4,xmm6` |
| `0x9f3a2b` | `9f3a2b:	0f 58 e7             	addps  xmm4,xmm7` |
| `0x9f3a2e` | `9f3a2e:	66 42 0f 3a 21 54 31 	insertps xmm2,DWORD PTR [rcx+r14*1+0x8],0x10` |
| `0x9f3a35` | `9f3a35:	08 10` |
| `0x9f3a37` | `9f3a37:	66 42 0f 3a 21 54 32 	insertps xmm2,DWORD PTR [rdx+r14*1+0x8],0x20` |
| `0x9f3a3e` | `9f3a3e:	08 20` |
| `0x9f3a40` | `9f3a40:	0f c6 db 00          	shufps xmm3,xmm3,0x0` |
| `0x9f3a44` | `9f3a44:	66 42 0f 3a 21 54 35 	insertps xmm2,DWORD PTR [rbp+r14*1+0x8],0x30` |
| `0x9f3a4b` | `9f3a4b:	08 30` |
| `0x9f3a4d` | `9f3a4d:	0f 59 d3             	mulps  xmm2,xmm3` |
| `0x9f3a50` | `9f3a50:	0f 58 d4             	addps  xmm2,xmm4` |
| `0x9f3a53` | `9f3a53:	0f c6 c9 00          	shufps xmm1,xmm1,0x0` |
| `0x9f3a57` | `9f3a57:	66 42 0f 3a 21 44 31 	insertps xmm0,DWORD PTR [rcx+r14*1+0xc],0x10` |
| `0x9f3a5e` | `9f3a5e:	0c 10` |
| `0x9f3a60` | `9f3a60:	66 42 0f 3a 21 44 32 	insertps xmm0,DWORD PTR [rdx+r14*1+0xc],0x20` |
| `0x9f3a67` | `9f3a67:	0c 20` |
| `0x9f3a69` | `9f3a69:	66 42 0f 3a 21 44 35 	insertps xmm0,DWORD PTR [rbp+r14*1+0xc],0x30` |
| `0x9f3a70` | `9f3a70:	0c 30` |
| `0x9f3a72` | `9f3a72:	0f 59 c1             	mulps  xmm0,xmm1` |
| `0x9f3a75` | `9f3a75:	0f 58 c2             	addps  xmm0,xmm2` |
| `0x9f3a78` | `9f3a78:	49 83 c6 10          	add    r14,0x10` |
| `0x9f3a7c` | `9f3a7c:	83 c0 ff             	add    eax,0xffffffff` |
| `0x9f3a7f` | `9f3a7f:	0f 85 2b ff ff ff    	jne    9f39b0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xbe00>` |
| `0x9f3a85` | `9f3a85:	4c 89 f7             	mov    rdi,r14` |
| `0x9f3a88` | `9f3a88:	4c 29 d7             	sub    rdi,r10` |
| `0x9f3a8b` | `9f3a8b:	4d 89 f2             	mov    r10,r14` |
| `0x9f3a8e` | `9f3a8e:	4c 2b 54 24 98       	sub    r10,QWORD PTR [rsp-0x68]` |
| `0x9f3a93` | `9f3a93:	4d 89 f3             	mov    r11,r14` |
| `0x9f3a96` | `9f3a96:	4c 2b 5c 24 b0       	sub    r11,QWORD PTR [rsp-0x50]` |
| `0x9f3a9b` | `9f3a9b:	4b 8d 04 30          	lea    rax,[r8+r14*1]` |
| `0x9f3a9f` | `9f3a9f:	4d 29 ce             	sub    r14,r9` |
| `0x9f3aa2` | `9f3aa2:	44 8b 4c 24 80       	mov    r9d,DWORD PTR [rsp-0x80]` |
| `0x9f3aa7` | `9f3aa7:	45 85 c9             	test   r9d,r9d` |
| `0x9f3aaa` | `9f3aaa:	0f 8f 42 00 00 00    	jg     9f3af2 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xbf42>` |
| `0x9f3ab0` | `9f3ab0:	e9 8b fe ff ff       	jmp    9f3940 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xbd90>` |
| `0x9f3ab5` | `9f3ab5:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]` |
| `0x9f3abc` | `9f3abc:	00 00 00` |
| `0x9f3abf` | `9f3abf:	90                   	nop` |
| `0x9f3ac0` | `9f3ac0:	48 8b 44 24 90       	mov    rax,QWORD PTR [rsp-0x70]` |
| `0x9f3ac5` | `9f3ac5:	4d 8d 1c 84          	lea    r11,[r12+rax*4]` |
| `0x9f3ac9` | `9f3ac9:	48 8b 44 24 d0       	mov    rax,QWORD PTR [rsp-0x30]` |
| `0x9f3ace` | `9f3ace:	4d 8d 14 84          	lea    r10,[r12+rax*4]` |
| `0x9f3ad2` | `9f3ad2:	48 8b 44 24 e8       	mov    rax,QWORD PTR [rsp-0x18]` |
| `0x9f3ad7` | `9f3ad7:	49 8d 3c 84          	lea    rdi,[r12+rax*4]` |
| `0x9f3adb` | `9f3adb:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0x9f3ade` | `9f3ade:	4d 89 e6             	mov    r14,r12` |
| `0x9f3ae1` | `9f3ae1:	4c 89 c0             	mov    rax,r8` |
| `0x9f3ae4` | `9f3ae4:	44 8b 4c 24 80       	mov    r9d,DWORD PTR [rsp-0x80]` |
| `0x9f3ae9` | `9f3ae9:	45 85 c9             	test   r9d,r9d` |
| `0x9f3aec` | `9f3aec:	0f 8e 4e fe ff ff    	jle    9f3940 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xbd90>` |
| `0x9f3af2` | `9f3af2:	41 83 f9 01          	cmp    r9d,0x1` |
| `0x9f3af6` | `9f3af6:	0f 84 93 00 00 00    	je     9f3b8f <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0xbfdf>` |
| `0xa630e4` | `a630e4:	48 0f 46 f7          	cmovbe rsi,rdi` |
| `0xa630e8` | `a630e8:	48 89 73 10          	mov    QWORD PTR [rbx+0x10],rsi` |
| `0xa630ec` | `a630ec:	48 89 c7             	mov    rdi,rax` |
| `0xa630ef` | `a630ef:	e8 6c bd d8 00       	call   17eee60 <realloc@plt>` |
| `0xa630f4` | `a630f4:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xa630f7` | `a630f7:	48 85 c0             	test   rax,rax` |
| `0xa630fa` | `a630fa:	0f 84 82 00 00 00    	je     a63182 <__cxa_demangle@@Base+0xbe22>` |
| `0xa63100` | `a63100:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0xa63104` | `a63104:	48 8d 51 01          	lea    rdx,[rcx+0x1]` |
| `0xa63108` | `a63108:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx` |
| `0xa6310c` | `a6310c:	c6 04 08 28          	mov    BYTE PTR [rax+rcx*1],0x28` |
| `0xa63110` | `a63110:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]` |
| `0xa63114` | `a63114:	48 89 de             	mov    rsi,rbx` |
| `0xa63117` | `a63117:	ba 13 00 00 00       	mov    edx,0x13` |
| `0xa6311c` | `a6311c:	31 c9                	xor    ecx,ecx` |
| `0xa6311e` | `a6311e:	e8 6d f0 ff ff       	call   a62190 <__cxa_demangle@@Base+0xae30>` |
| `0xa63123` | `a63123:	ff 4b 20             	dec    DWORD PTR [rbx+0x20]` |
| `0xa63126` | `a63126:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa63129` | `a63129:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0xa6312d` | `a6312d:	48 8d 51 01          	lea    rdx,[rcx+0x1]` |
| `0xa63131` | `a63131:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0xa63135` | `a63135:	48 39 f2             	cmp    rdx,rsi` |
| `0xa63138` | `a63138:	76 2d                	jbe    a63167 <__cxa_demangle@@Base+0xbe07>` |
| `0xa6313a` | `a6313a:	48 81 c1 e1 03 00 00 	add    rcx,0x3e1` |
| `0xa63141` | `a63141:	48 01 f6             	add    rsi,rsi` |
| `0xa63144` | `a63144:	48 39 ce             	cmp    rsi,rcx` |
| `0xa63147` | `a63147:	48 0f 46 f1          	cmovbe rsi,rcx` |
| `0xa6314b` | `a6314b:	48 89 73 10          	mov    QWORD PTR [rbx+0x10],rsi` |
| `0xa6314f` | `a6314f:	48 89 c7             	mov    rdi,rax` |
| `0xa63152` | `a63152:	e8 09 bd d8 00       	call   17eee60 <realloc@plt>` |
| `0xa63157` | `a63157:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0xa6315a` | `a6315a:	48 85 c0             	test   rax,rax` |
| `0xa6315d` | `a6315d:	74 28                	je     a63187 <__cxa_demangle@@Base+0xbe27>` |
| `0xa6315f` | `a6315f:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0xa63163` | `a63163:	48 8d 51 01          	lea    rdx,[rcx+0x1]` |
| `0xa63167` | `a63167:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx` |
| `0xa6316b` | `a6316b:	c6 04 08 29          	mov    BYTE PTR [rax+rcx*1],0x29` |
| `0xa6316f` | `a6316f:	5b                   	pop    rbx` |
| `0xa63170` | `a63170:	41 5c                	pop    r12` |
| `0xa63172` | `a63172:	41 5e                	pop    r14` |
| `0xa63174` | `a63174:	41 5f                	pop    r15` |
| `0xa63176` | `a63176:	5d                   	pop    rbp` |
| `0xa63177` | `a63177:	c3                   	ret` |
| `0xa63178` | `a63178:	e8 33 bb d8 00       	call   17eecb0 <abort@plt>` |
| `0xa6317d` | `a6317d:	e8 2e bb d8 00       	call   17eecb0 <abort@plt>` |
| `0xa63182` | `a63182:	e8 29 bb d8 00       	call   17eecb0 <abort@plt>` |
| `0xa63187` | `a63187:	e8 24 bb d8 00       	call   17eecb0 <abort@plt>` |
| `0xa6318c` | `a6318c:	e8 1f bb d8 00       	call   17eecb0 <abort@plt>` |
| `0xa63191` | `a63191:	89 6b 20             	mov    DWORD PTR [rbx+0x20],ebp` |
| `0xa63194` | `a63194:	48 89 c7             	mov    rdi,rax` |
| `0xa63197` | `a63197:	e8 34 cb 00 00       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xa6319c` | `a6319c:	cc                   	int3` |
| `0xa73f64` | `a73f64:	48 89 df             	mov    rdi,rbx` |
| `0xa73f67` | `a73f67:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]` |
| `0xa73f6d` | `a73f6d:	48 89 05 a4 f4 f6 00 	mov    QWORD PTR [rip+0xf6f4a4],rax        # 19e3418 <__cxa_new_handler@@Base+0x2ca8>` |
| `0xa73f74` | `a73f74:	48 89 df             	mov    rdi,rbx` |
| `0xa73f77` | `a73f77:	e8 6c 0c d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa73f7c` | `a73f7c:	48 83 3d 8c f4 f6 00 	cmp    QWORD PTR [rip+0xf6f48c],0x0        # 19e3410 <__cxa_new_handler@@Base+0x2ca0>` |
| `0xa73f83` | `a73f83:	00` |
| `0xa73f84` | `a73f84:	0f 84 ea 00 00 00    	je     a74074 <JNI_OnLoad@@Base+0x7fc>` |
| `0xa73f8a` | `a73f8a:	48 83 3d 86 f4 f6 00 	cmp    QWORD PTR [rip+0xf6f486],0x0        # 19e3418 <__cxa_new_handler@@Base+0x2ca8>` |
| `0xa73f91` | `a73f91:	00` |
| `0xa73f92` | `a73f92:	0f 84 dc 00 00 00    	je     a74074 <JNI_OnLoad@@Base+0x7fc>` |
| `0xa73f98` | `a73f98:	4c 8d 35 f2 90 02 00 	lea    r14,[rip+0x290f2]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xa73f9f` | `a73f9f:	48 8d 0d 68 be 02 00 	lea    rcx,[rip+0x2be68]        # a9fe0e <JNI_OnUnload@@Base+0x276db>` |
| `0xa73fa6` | `a73fa6:	4c 8d a4 24 d0 01 00 	lea    r12,[rsp+0x1d0]` |
| `0xa73fad` | `a73fad:	00` |
| `0xa73fae` | `a73fae:	4c 8d 44 24 78       	lea    r8,[rsp+0x78]` |
| `0xa73fb3` | `a73fb3:	6a 01                	push   0x1` |
| `0xa73fb5` | `a73fb5:	41 5f                	pop    r15` |
| `0xa73fb7` | `a73fb7:	4c 89 e7             	mov    rdi,r12` |
| `0xa73fba` | `a73fba:	4c 89 f6             	mov    rsi,r14` |
| `0xa73fbd` | `a73fbd:	31 d2                	xor    edx,edx` |
| `0xa73fbf` | `a73fbf:	4d 89 f9             	mov    r9,r15` |
| `0xa73fc2` | `a73fc2:	e8 cd 67 d6 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa73fc7` | `a73fc7:	4c 8d ac 24 80 01 00 	lea    r13,[rsp+0x180]` |
| `0xa73fce` | `a73fce:	00` |
| `0xa73fcf` | `a73fcf:	4c 89 ef             	mov    rdi,r13` |
| `0xa73fd2` | `a73fd2:	4c 89 e6             	mov    rsi,r12` |
| `0xa73fd5` | `a73fd5:	e8 60 67 d6 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa73fda` | `a73fda:	48 8d 35 ff e2 f7 00 	lea    rsi,[rip+0xf7e2ff]        # 19f22e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f>` |
| `0xa73fe1` | `a73fe1:	48 8d ac 24 60 01 00 	lea    rbp,[rsp+0x160]` |
| `0xa73fe8` | `a73fe8:	00` |
| `0xa73fe9` | `a73fe9:	48 89 ef             	mov    rdi,rbp` |
| `0xa73fec` | `a73fec:	4c 89 ea             	mov    rdx,r13` |
| `0xa73fef` | `a73fef:	e8 d6 5f d6 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa73ff4` | `a73ff4:	4c 89 ef             	mov    rdi,r13` |
| `0xa73ff7` | `a73ff7:	e8 ec 67 d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa73ffc` | `a73ffc:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0xa74000` | `a74000:	e8 81 a4 02 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa74005` | `a74005:	4c 89 e7             	mov    rdi,r12` |
| `0xa74008` | `a74008:	e8 db 67 d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa7400d` | `a7400d:	48 8d 0d 80 bf 02 00 	lea    rcx,[rip+0x2bf80]        # a9ff94 <JNI_OnUnload@@Base+0x27861>` |
| `0xa74014` | `a74014:	4c 8d a4 24 d0 01 00 	lea    r12,[rsp+0x1d0]` |
| `0xa7401b` | `a7401b:	00` |
| `0xa7401c` | `a7401c:	4c 8d 44 24 60       	lea    r8,[rsp+0x60]` |
| `0xa74021` | `a74021:	4c 89 e7             	mov    rdi,r12` |
| `0xa74024` | `a74024:	4c 89 f6             	mov    rsi,r14` |
| `0xa74027` | `a74027:	31 d2                	xor    edx,edx` |
| `0xa74029` | `a74029:	4d 89 f9             	mov    r9,r15` |
| `0xa7402c` | `a7402c:	e8 63 67 d6 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa74031` | `a74031:	4c 8d b4 24 80 01 00 	lea    r14,[rsp+0x180]` |
| `0xa74038` | `a74038:	00` |
| `0xa74039` | `a74039:	4c 89 f7             	mov    rdi,r14` |
| `0xa7403c` | `a7403c:	4c 89 e6             	mov    rsi,r12` |
| `0xa7403f` | `a7403f:	e8 f6 66 d6 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa74044` | `a74044:	48 8d 35 ed e2 f7 00 	lea    rsi,[rip+0xf7e2ed]        # 19f2338 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x3f7>` |
| `0xa7404b` | `a7404b:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]` |
| `0xa74050` | `a74050:	4c 89 ff             	mov    rdi,r15` |
| `0xa74053` | `a74053:	4c 89 f2             	mov    rdx,r14` |
| `0xa74056` | `a74056:	e8 6f 5f d6 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa7405b` | `a7405b:	4c 89 f7             	mov    rdi,r14` |
| `0xa7405e` | `a7405e:	e8 85 67 d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa74063` | `a74063:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xa74067` | `a74067:	e8 1a a4 02 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa7406c` | `a7406c:	4c 89 e7             	mov    rdi,r12` |
| `0xa7406f` | `a7406f:	e8 74 67 d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa74074` | `a74074:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]` |
| `0xa7407b` | `a7407b:	00` |
| `0xa7407c` | `a7407c:	e8 45 1c d6 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa74081` | `a74081:	4c 8b 35 78 a3 f8 00 	mov    r14,QWORD PTR [rip+0xf8a378]        # 19fe400 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xc4bf>` |
| `0xa74088` | `a74088:	48 8d 35 b7 ea 90 ff 	lea    rsi,[rip+0xffffffffff90eab7]        # 382b46 <_ZTSSt12bad_any_cast@@Base-0xd682>` |
| `0xa7408f` | `a7408f:	4c 8d bc 24 80 01 00 	lea    r15,[rsp+0x180]` |
| `0xa74096` | `a74096:	00` |
| `0xa74097` | `a74097:	4c 89 ff             	mov    rdi,r15` |
| `0xa7409a` | `a7409a:	e8 df 59 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa7409f` | `a7409f:	4c 8d a4 24 d0 01 00 	lea    r12,[rsp+0x1d0]` |
| `0xa740a6` | `a740a6:	00` |
| `0xa740a7` | `a740a7:	4c 89 e7             	mov    rdi,r12` |
| `0xa740aa` | `a740aa:	48 89 de             	mov    rsi,rbx` |
| `0xa75bef` | `a75bef:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xa75bf2` | `a75bf2:	48 83 3d e6 98 f7 00 	cmp    QWORD PTR [rip+0xf798e6],0x0        # 19ef4e0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc10>` |
| `0xa75bf9` | `a75bf9:	00` |
| `0xa75bfa` | `a75bfa:	0f 85 f6 25 00 00    	jne    a781f6 <JNI_OnLoad@@Base+0x497e>` |
| `0xa75c00` | `a75c00:	48 89 05 d9 98 f7 00 	mov    QWORD PTR [rip+0xf798d9],rax        # 19ef4e0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc10>` |
| `0xa75c07` | `a75c07:	48 8d 35 a0 14 8e ff 	lea    rsi,[rip+0xffffffffff8e14a0]        # 3570ae <_ZTSSt12bad_any_cast@@Base-0x3911a>` |
| `0xa75c0e` | `a75c0e:	48 8d 15 eb 1a e0 00 	lea    rdx,[rip+0xe01aeb]        # 1877700 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x33de8>` |
| `0xa75c15` | `a75c15:	48 8d 0d 44 1b e0 00 	lea    rcx,[rip+0xe01b44]        # 1877760 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x33e48>` |
| `0xa75c1c` | `a75c1c:	48 89 df             	mov    rdi,rbx` |
| `0xa75c1f` | `a75c1f:	e8 6b 02 d6 00       	call   17d5e8f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1cb0>` |
| `0xa75c24` | `a75c24:	48 83 3d bc 98 f7 00 	cmp    QWORD PTR [rip+0xf798bc],0x0        # 19ef4e8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc18>` |
| `0xa75c2b` | `a75c2b:	00` |
| `0xa75c2c` | `a75c2c:	0f 85 c9 25 00 00    	jne    a781fb <JNI_OnLoad@@Base+0x4983>` |
| `0xa75c32` | `a75c32:	6a 08                	push   0x8` |
| `0xa75c34` | `a75c34:	5f                   	pop    rdi` |
| `0xa75c35` | `a75c35:	e8 c6 82 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa75c3a` | `a75c3a:	49 89 c6             	mov    r14,rax` |
| `0xa75c3d` | `a75c3d:	48 8d 15 6a 14 8e ff 	lea    rdx,[rip+0xffffffffff8e146a]        # 3570ae <_ZTSSt12bad_any_cast@@Base-0x3911a>` |
| `0xa75c44` | `a75c44:	48 89 c7             	mov    rdi,rax` |
| `0xa75c47` | `a75c47:	48 89 de             	mov    rsi,rbx` |
| `0xa75c4a` | `a75c4a:	e8 0f 18 d5 00       	call   17c745e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b5ca>` |
| `0xa75c4f` | `a75c4f:	4c 89 35 92 98 f7 00 	mov    QWORD PTR [rip+0xf79892],r14        # 19ef4e8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc18>` |
| `0xa75c56` | `a75c56:	4c 8b 35 53 98 f7 00 	mov    r14,QWORD PTR [rip+0xf79853]        # 19ef4b0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbe0>` |
| `0xa75c5d` | `a75c5d:	6a 08                	push   0x8` |
| `0xa75c5f` | `a75c5f:	5f                   	pop    rdi` |
| `0xa75c60` | `a75c60:	e8 9b 82 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa75c65` | `a75c65:	48 8d 0d f4 7f d8 00 	lea    rcx,[rip+0xd87ff4]        # 17fdc60 <_ZTINSt6__ndk117bad_function_callE@@Base+0xd00>` |
| `0xa75c6c` | `a75c6c:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xa75c6f` | `a75c6f:	4d 85 f6             	test   r14,r14` |
| `0xa75c72` | `a75c72:	0f 85 88 25 00 00    	jne    a78200 <JNI_OnLoad@@Base+0x4988>` |
| `0xa75c78` | `a75c78:	48 89 05 31 98 f7 00 	mov    QWORD PTR [rip+0xf79831],rax        # 19ef4b0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbe0>` |
| `0xa75c7f` | `a75c7f:	48 8d 35 90 3c 8c ff 	lea    rsi,[rip+0xffffffffff8c3c90]        # 339916 <_ZTSSt12bad_any_cast@@Base-0x568b2>` |
| `0xa75c86` | `a75c86:	48 8d 15 63 19 e0 00 	lea    rdx,[rip+0xe01963]        # 18775f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x33cd8>` |
| `0xa75c8d` | `a75c8d:	48 8d 0d bc 19 e0 00 	lea    rcx,[rip+0xe019bc]        # 1877650 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x33d38>` |
| `0xa75c94` | `a75c94:	48 89 df             	mov    rdi,rbx` |
| `0xa75c97` | `a75c97:	e8 f3 01 d6 00       	call   17d5e8f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1cb0>` |
| `0xa75c9c` | `a75c9c:	48 83 3d 14 98 f7 00 	cmp    QWORD PTR [rip+0xf79814],0x0        # 19ef4b8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbe8>` |
| `0xa75ca3` | `a75ca3:	00` |
| `0xa75ca4` | `a75ca4:	0f 85 5b 25 00 00    	jne    a78205 <JNI_OnLoad@@Base+0x498d>` |
| `0xa75caa` | `a75caa:	6a 08                	push   0x8` |
| `0xa75cac` | `a75cac:	5f                   	pop    rdi` |
| `0xa75cad` | `a75cad:	e8 4e 82 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa75cb2` | `a75cb2:	49 89 c6             	mov    r14,rax` |
| `0xa75cb5` | `a75cb5:	48 8d 15 5a 3c 8c ff 	lea    rdx,[rip+0xffffffffff8c3c5a]        # 339916 <_ZTSSt12bad_any_cast@@Base-0x568b2>` |
| `0xa75cbc` | `a75cbc:	48 89 c7             	mov    rdi,rax` |
| `0xa75cbf` | `a75cbf:	48 89 de             	mov    rsi,rbx` |
| `0xa75cc2` | `a75cc2:	e8 97 17 d5 00       	call   17c745e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b5ca>` |
| `0xa75cc7` | `a75cc7:	4c 89 35 ea 97 f7 00 	mov    QWORD PTR [rip+0xf797ea],r14        # 19ef4b8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbe8>` |
| `0xa75cce` | `a75cce:	4c 8b 35 eb e2 f6 00 	mov    r14,QWORD PTR [rip+0xf6e2eb]        # 19e3fc0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9f0>` |
| `0xa75cd5` | `a75cd5:	6a 08                	push   0x8` |
| `0xa75cd7` | `a75cd7:	5f                   	pop    rdi` |
| `0xa75cd8` | `a75cd8:	e8 23 82 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa75cdd` | `a75cdd:	48 8d 0d 7c 7f d8 00 	lea    rcx,[rip+0xd87f7c]        # 17fdc60 <_ZTINSt6__ndk117bad_function_callE@@Base+0xd00>` |
| `0xa75ce4` | `a75ce4:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xa75ce7` | `a75ce7:	4d 85 f6             	test   r14,r14` |
| `0xa75cea` | `a75cea:	0f 85 1a 25 00 00    	jne    a7820a <JNI_OnLoad@@Base+0x4992>` |
| `0xa75cf0` | `a75cf0:	48 89 05 c9 e2 f6 00 	mov    QWORD PTR [rip+0xf6e2c9],rax        # 19e3fc0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x9f0>` |
| `0xa75cf7` | `a75cf7:	48 8d 35 7f ea 8b ff 	lea    rsi,[rip+0xffffffffff8bea7f]        # 33477d <_ZTSSt12bad_any_cast@@Base-0x5ba4b>` |
| `0xa75cfe` | `a75cfe:	48 8d 15 4b 69 d9 00 	lea    rdx,[rip+0xd9694b]        # 180c650 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2310>` |
| `0xa75d05` | `a75d05:	48 8d 0d 74 69 d9 00 	lea    rcx,[rip+0xd96974]        # 180c680 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x2340>` |
| `0xa76c5c` | `a76c5c:	e8 87 df d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa76c61` | `a76c61:	49 8b 74 24 08       	mov    rsi,QWORD PTR [r12+0x8]` |
| `0xa76c66` | `a76c66:	48 8d 3d b3 c7 f6 00 	lea    rdi,[rip+0xf6c7b3]        # 19e3420 <__cxa_new_handler@@Base+0x2cb0>` |
| `0xa76c6d` | `a76c6d:	e8 b0 e6 d5 00       	call   17d5322 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1143>` |
| `0xa76c72` | `a76c72:	48 8b 35 a7 c7 f6 00 	mov    rsi,QWORD PTR [rip+0xf6c7a7]        # 19e3420 <__cxa_new_handler@@Base+0x2cb0>` |
| `0xa76c79` | `a76c79:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa76c7c` | `a76c7c:	48 8d 15 85 27 91 ff 	lea    rdx,[rip+0xffffffffff912785]        # 389408 <_ZTSSt12bad_any_cast@@Base-0x6dc0>` |
| `0xa76c83` | `a76c83:	48 8d 0d 3d e6 8e ff 	lea    rcx,[rip+0xffffffffff8ee63d]        # 3652c7 <_ZTSSt12bad_any_cast@@Base-0x2af01>` |
| `0xa76c8a` | `a76c8a:	48 89 df             	mov    rdi,rbx` |
| `0xa76c8d` | `a76c8d:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]` |
| `0xa76c93` | `a76c93:	48 89 05 9e c7 f6 00 	mov    QWORD PTR [rip+0xf6c79e],rax        # 19e3438 <__cxa_new_handler@@Base+0x2cc8>` |
| `0xa76c9a` | `a76c9a:	48 89 df             	mov    rdi,rbx` |
| `0xa76c9d` | `a76c9d:	e8 46 df d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa76ca2` | `a76ca2:	48 8d 35 e8 63 02 00 	lea    rsi,[rip+0x263e8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xa76ca9` | `a76ca9:	48 8d 0d 3a 94 02 00 	lea    rcx,[rip+0x2943a]        # aa00ea <JNI_OnUnload@@Base+0x279b7>` |
| `0xa76cb0` | `a76cb0:	4c 8d bc 24 d0 01 00 	lea    r15,[rsp+0x1d0]` |
| `0xa76cb7` | `a76cb7:	00` |
| `0xa76cb8` | `a76cb8:	4c 8d 44 24 78       	lea    r8,[rsp+0x78]` |
| `0xa76cbd` | `a76cbd:	6a 01                	push   0x1` |
| `0xa76cbf` | `a76cbf:	41 59                	pop    r9` |
| `0xa76cc1` | `a76cc1:	4c 89 ff             	mov    rdi,r15` |
| `0xa76cc4` | `a76cc4:	31 d2                	xor    edx,edx` |
| `0xa76cc6` | `a76cc6:	e8 c9 3a d6 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa76ccb` | `a76ccb:	4c 8d a4 24 80 01 00 	lea    r12,[rsp+0x180]` |
| `0xa76cd2` | `a76cd2:	00` |
| `0xa76cd3` | `a76cd3:	4c 89 e7             	mov    rdi,r12` |
| `0xa76cd6` | `a76cd6:	4c 89 fe             	mov    rsi,r15` |
| `0xa76cd9` | `a76cd9:	e8 5c 3a d6 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa76cde` | `a76cde:	48 8d 35 2b 7c f7 00 	lea    rsi,[rip+0xf77c2b]        # 19ee910 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x40>` |
| `0xa76ce5` | `a76ce5:	4c 8d ac 24 10 02 00 	lea    r13,[rsp+0x210]` |
| `0xa76cec` | `a76cec:	00` |
| `0xa76ced` | `a76ced:	4c 89 ef             	mov    rdi,r13` |
| `0xa76cf0` | `a76cf0:	4c 89 e2             	mov    rdx,r12` |
| `0xa76cf3` | `a76cf3:	e8 d2 32 d6 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa76cf8` | `a76cf8:	4c 89 e7             	mov    rdi,r12` |
| `0xa76cfb` | `a76cfb:	e8 e8 3a d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa76d00` | `a76d00:	48 8d 3d 21 c7 f6 00 	lea    rdi,[rip+0xf6c721]        # 19e3428 <__cxa_new_handler@@Base+0x2cb8>` |
| `0xa76d07` | `a76d07:	4c 89 ee             	mov    rsi,r13` |
| `0xa76d0a` | `a76d0a:	e8 9f 2d d6 00       	call   17d9aae <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x58cf>` |
| `0xa76d0f` | `a76d0f:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa76d13` | `a76d13:	e8 6e 77 02 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa76d18` | `a76d18:	4c 89 ff             	mov    rdi,r15` |
| `0xa76d1b` | `a76d1b:	e8 c8 3a d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa76d20` | `a76d20:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]` |
| `0xa76d27` | `a76d27:	00` |
| `0xa76d28` | `a76d28:	e8 99 ef d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa76d2d` | `a76d2d:	6a 08                	push   0x8` |
| `0xa76d2f` | `a76d2f:	5f                   	pop    rdi` |
| `0xa76d30` | `a76d30:	e8 cb 71 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa76d35` | `a76d35:	48 8d 0d 84 04 e0 00 	lea    rcx,[rip+0xe00484]        # 18771c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x338a8>` |
| `0xa76d3c` | `a76d3c:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xa76d3f` | `a76d3f:	48 83 3d a9 87 f7 00 	cmp    QWORD PTR [rip+0xf787a9],0x0        # 19ef4f0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc20>` |
| `0xa78d1f` | `a78d1f:	48 83 25 a9 66 f7 00 	and    QWORD PTR [rip+0xf766a9],0x0        # 19ef3d0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb00>` |
| `0xa78d26` | `a78d26:	00` |
| `0xa78d27` | `a78d27:	4c 89 f7             	mov    rdi,r14` |
| `0xa78d2a` | `a78d2a:	e8 69 e9 d4 00       	call   17c7698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b804>` |
| `0xa78d2f` | `a78d2f:	4c 89 f7             	mov    rdi,r14` |
| `0xa78d32` | `a78d32:	e8 e9 51 d7 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xa78d37` | `a78d37:	48 8b 3d 8a 66 f7 00 	mov    rdi,QWORD PTR [rip+0xf7668a]        # 19ef3c8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xaf8>` |
| `0xa78d3e` | `a78d3e:	48 85 ff             	test   rdi,rdi` |
| `0xa78d41` | `a78d41:	0f 84 da 0b 00 00    	je     a79921 <JNI_OnUnload@@Base+0x11ee>` |
| `0xa78d47` | `a78d47:	48 83 25 79 66 f7 00 	and    QWORD PTR [rip+0xf76679],0x0        # 19ef3c8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xaf8>` |
| `0xa78d4e` | `a78d4e:	00` |
| `0xa78d4f` | `a78d4f:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xa78d52` | `a78d52:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0xa78d55` | `a78d55:	4c 8b 35 5c 67 f7 00 	mov    r14,QWORD PTR [rip+0xf7675c]        # 19ef4b8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbe8>` |
| `0xa78d5c` | `a78d5c:	4d 85 f6             	test   r14,r14` |
| `0xa78d5f` | `a78d5f:	0f 84 c1 0b 00 00    	je     a79926 <JNI_OnUnload@@Base+0x11f3>` |
| `0xa78d65` | `a78d65:	48 83 25 4b 67 f7 00 	and    QWORD PTR [rip+0xf7674b],0x0        # 19ef4b8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbe8>` |
| `0xa78d6c` | `a78d6c:	00` |
| `0xa78d6d` | `a78d6d:	4c 89 f7             	mov    rdi,r14` |
| `0xa78d70` | `a78d70:	e8 23 e9 d4 00       	call   17c7698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b804>` |
| `0xa78d75` | `a78d75:	4c 89 f7             	mov    rdi,r14` |
| `0xa78d78` | `a78d78:	e8 a3 51 d7 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xa78d7d` | `a78d7d:	48 8b 3d 2c 67 f7 00 	mov    rdi,QWORD PTR [rip+0xf7672c]        # 19ef4b0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbe0>` |
| `0xa78d84` | `a78d84:	48 85 ff             	test   rdi,rdi` |
| `0xa78d87` | `a78d87:	0f 84 9e 0b 00 00    	je     a7992b <JNI_OnUnload@@Base+0x11f8>` |
| `0xa78d8d` | `a78d8d:	48 83 25 1b 67 f7 00 	and    QWORD PTR [rip+0xf7671b],0x0        # 19ef4b0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xbe0>` |
| `0xa78d94` | `a78d94:	00` |
| `0xa78d95` | `a78d95:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xa78d98` | `a78d98:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0xa78d9b` | `a78d9b:	4c 8b 35 46 67 f7 00 	mov    r14,QWORD PTR [rip+0xf76746]        # 19ef4e8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc18>` |
| `0xa78da2` | `a78da2:	4d 85 f6             	test   r14,r14` |
| `0xa78da5` | `a78da5:	0f 84 85 0b 00 00    	je     a79930 <JNI_OnUnload@@Base+0x11fd>` |
| `0xa78dab` | `a78dab:	48 83 25 35 67 f7 00 	and    QWORD PTR [rip+0xf76735],0x0        # 19ef4e8 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc18>` |
| `0xa78db2` | `a78db2:	00` |
| `0xa78db3` | `a78db3:	4c 89 f7             	mov    rdi,r14` |
| `0xa78db6` | `a78db6:	e8 dd e8 d4 00       	call   17c7698 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b804>` |
| `0xa78dbb` | `a78dbb:	4c 89 f7             	mov    rdi,r14` |
| `0xa78dbe` | `a78dbe:	e8 5d 51 d7 00       	call   17edf20 <_ZdlPv@plt>` |
| `0xa78dc3` | `a78dc3:	48 8b 3d 16 67 f7 00 	mov    rdi,QWORD PTR [rip+0xf76716]        # 19ef4e0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc10>` |
| `0xa78dca` | `a78dca:	48 85 ff             	test   rdi,rdi` |
| `0xa78dcd` | `a78dcd:	0f 84 62 0b 00 00    	je     a79935 <JNI_OnUnload@@Base+0x1202>` |
| `0xa78dd3` | `a78dd3:	48 83 25 05 67 f7 00 	and    QWORD PTR [rip+0xf76705],0x0        # 19ef4e0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc10>` |
| `0xa78dda` | `a78dda:	00` |
| `0xa78ddb` | `a78ddb:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xa78dde` | `a78dde:	ff 50 08             	call   QWORD PTR [rax+0x8]` |
| `0xa78de1` | `a78de1:	48 8b 35 38 66 f7 00 	mov    rsi,QWORD PTR [rip+0xf76638]        # 19ef420 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb50>` |
| `0xa78de8` | `a78de8:	48 83 25 30 66 f7 00 	and    QWORD PTR [rip+0xf76630],0x0        # 19ef420 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb50>` |
| `0xa78def` | `a78def:	00` |
| `0xa78df0` | `a78df0:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa78df3` | `a78df3:	48 89 df             	mov    rdi,rbx` |
| `0xa78df6` | `a78df6:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]` |
| `0xa78dfc` | `a78dfc:	48 8b 35 35 66 f7 00 	mov    rsi,QWORD PTR [rip+0xf76635]        # 19ef438 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb68>` |
| `0xa78e03` | `a78e03:	48 83 25 2d 66 f7 00 	and    QWORD PTR [rip+0xf7662d],0x0        # 19ef438 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xb68>` |
| `0xa78e0a` | `a78e0a:	00` |
| `0xa78e0b` | `a78e0b:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa7d028` | `a7d028:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0xa7d02d` | `a7d02d:	48 8d 05 ff 30 92 ff 	lea    rax,[rip+0xffffffffff9230ff]        # 3a0133 <_ZTSN5boost9exceptionE@@Base+0xb15>` |
| `0xa7d034` | `a7d034:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]` |
| `0xa7d039` | `a7d039:	48 89 06             	mov    QWORD PTR [rsi],rax` |
| `0xa7d03c` | `a7d03c:	c7 46 08 e7 6f 01 b0 	mov    DWORD PTR [rsi+0x8],0xb0016fe7` |
| `0xa7d043` | `a7d043:	48 8d 1d 26 71 f6 00 	lea    rbx,[rip+0xf67126]        # 19e4170 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xba0>` |
| `0xa7d04a` | `a7d04a:	48 89 df             	mov    rdi,rbx` |
| `0xa7d04d` | `a7d04d:	e8 58 4d d4 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>` |
| `0xa7d052` | `a7d052:	48 8b 3d e7 49 e3 00 	mov    rdi,QWORD PTR [rip+0xe349e7]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>` |
| `0xa7d059` | `a7d059:	48 8d 15 a0 6f d7 00 	lea    rdx,[rip+0xd76fa0]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>` |
| `0xa7d060` | `a7d060:	48 89 de             	mov    rsi,rbx` |
| `0xa7d063` | `a7d063:	e8 f8 0d d7 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa7d068` | `a7d068:	48 8d 05 cd 30 92 ff 	lea    rax,[rip+0xffffffffff9230cd]        # 3a013c <_ZTSN5boost9exceptionE@@Base+0xb1e>` |
| `0xa7d06f` | `a7d06f:	48 89 05 12 71 f6 00 	mov    QWORD PTR [rip+0xf67112],rax        # 19e4188 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbb8>` |
| `0xa7d076` | `a7d076:	c7 05 10 71 f6 00 d7 	mov    DWORD PTR [rip+0xf67110],0xf01a83d7        # 19e4190 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbc0>` |
| `0xa7d07d` | `a7d07d:	83 1a f0` |
| `0xa7d080` | `a7d080:	48 8d 05 c7 30 92 ff 	lea    rax,[rip+0xffffffffff9230c7]        # 3a014e <_ZTSN5boost9exceptionE@@Base+0xb30>` |
| `0xa7d087` | `a7d087:	48 89 05 0a 71 f6 00 	mov    QWORD PTR [rip+0xf6710a],rax        # 19e4198 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbc8>` |
| `0xa7d08e` | `a7d08e:	c7 05 08 71 f6 00 7f 	mov    DWORD PTR [rip+0xf67108],0xfa9a157f        # 19e41a0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbd0>` |
| `0xa7d095` | `a7d095:	15 9a fa` |
| `0xa7d098` | `a7d098:	48 8d 05 ca 30 92 ff 	lea    rax,[rip+0xffffffffff9230ca]        # 3a0169 <_ZTSN5boost9exceptionE@@Base+0xb4b>` |
| `0xa7d09f` | `a7d09f:	48 89 05 02 71 f6 00 	mov    QWORD PTR [rip+0xf67102],rax        # 19e41a8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbd8>` |
| `0xa7d0a6` | `a7d0a6:	c7 05 00 71 f6 00 8d 	mov    DWORD PTR [rip+0xf67100],0x727d78d        # 19e41b0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbe0>` |
| `0xa7d0ad` | `a7d0ad:	d7 27 07` |
| `0xa7d0b0` | `a7d0b0:	48 8d 05 cd 30 92 ff 	lea    rax,[rip+0xffffffffff9230cd]        # 3a0184 <_ZTSN5boost9exceptionE@@Base+0xb66>` |
| `0xa7d0b7` | `a7d0b7:	48 89 05 fa 70 f6 00 	mov    QWORD PTR [rip+0xf670fa],rax        # 19e41b8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbe8>` |
| `0xa7d0be` | `a7d0be:	c7 05 f8 70 f6 00 9e 	mov    DWORD PTR [rip+0xf670f8],0x4b46869e        # 19e41c0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbf0>` |
| `0xa7d0c5` | `a7d0c5:	86 46 4b` |
| `0xa7d0c8` | `a7d0c8:	48 8d 05 cd 30 92 ff 	lea    rax,[rip+0xffffffffff9230cd]        # 3a019c <_ZTSN5boost9exceptionE@@Base+0xb7e>` |
| `0xa7d0cf` | `a7d0cf:	48 89 05 f2 70 f6 00 	mov    QWORD PTR [rip+0xf670f2],rax        # 19e41c8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xbf8>` |
| `0xa7d0d6` | `a7d0d6:	c7 05 f0 70 f6 00 33 	mov    DWORD PTR [rip+0xf670f0],0x4e1dfb33        # 19e41d0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc00>` |
| `0xa7d0dd` | `a7d0dd:	fb 1d 4e` |
| `0xa7d0e0` | `a7d0e0:	48 8d 05 d1 30 92 ff 	lea    rax,[rip+0xffffffffff9230d1]        # 3a01b8 <_ZTSN5boost9exceptionE@@Base+0xb9a>` |
| `0xa7d0e7` | `a7d0e7:	48 89 05 ea 70 f6 00 	mov    QWORD PTR [rip+0xf670ea],rax        # 19e41d8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc08>` |
| `0xa7d0ee` | `a7d0ee:	c7 05 e8 70 f6 00 29 	mov    DWORD PTR [rip+0xf670e8],0x411d9b29        # 19e41e0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc10>` |
| `0xa7d0f5` | `a7d0f5:	9b 1d 41` |
| `0xa7d0f8` | `a7d0f8:	48 8d 05 e0 30 92 ff 	lea    rax,[rip+0xffffffffff9230e0]        # 3a01df <_ZTSN5boost9exceptionE@@Base+0xbc1>` |
| `0xa7d0ff` | `a7d0ff:	48 89 05 e2 70 f6 00 	mov    QWORD PTR [rip+0xf670e2],rax        # 19e41e8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc18>` |
| `0xa7d106` | `a7d106:	c7 05 e0 70 f6 00 4a 	mov    DWORD PTR [rip+0xf670e0],0xec9ba14a        # 19e41f0 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc20>` |
| `0xa7d10d` | `a7d10d:	a1 9b ec` |
| `0xa7d110` | `a7d110:	48 8d 05 e8 30 92 ff 	lea    rax,[rip+0xffffffffff9230e8]        # 3a01ff <_ZTSN5boost9exceptionE@@Base+0xbe1>` |
| `0xa7d117` | `a7d117:	48 89 05 da 70 f6 00 	mov    QWORD PTR [rip+0xf670da],rax        # 19e41f8 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc28>` |
| `0xa7d11e` | `a7d11e:	c7 05 d8 70 f6 00 71 	mov    DWORD PTR [rip+0xf670d8],0x6743c371        # 19e4200 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0xc30>` |
| `0xa7d125` | `a7d125:	c3 43 67` |
| `0xa7d128` | `a7d128:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa7d12f` | `a7d12f:	00 00` |
| `0xa7d131` | `a7d131:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]` |
| `0xa7d136` | `a7d136:	75 06                	jne    a7d13e <JNI_OnUnload@@Base+0x4a0b>` |
| `0xa7d138` | `a7d138:	48 83 c4 20          	add    rsp,0x20` |
| `0xa7d13c` | `a7d13c:	5b                   	pop    rbx` |
| `0xa7d13d` | `a7d13d:	c3                   	ret` |
| `0xa7d13e` | `a7d13e:	e8 6d 29 d7 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xa837d9` | `a837d9:	48 89 da             	mov    rdx,rbx` |
| `0xa837dc` | `a837dc:	e8 7f a6 d6 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa837e1` | `a837e1:	4c 8d 3d 48 32 f6 00 	lea    r15,[rip+0xf63248]        # 19e6a30 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1020>` |
| `0xa837e8` | `a837e8:	48 8d 35 1c 34 8e ff 	lea    rsi,[rip+0xffffffffff8e341c]        # 366c0b <_ZTSSt12bad_any_cast@@Base-0x295bd>` |
| `0xa837ef` | `a837ef:	4c 89 ff             	mov    rdi,r15` |
| `0xa837f2` | `a837f2:	4c 89 ea             	mov    rdx,r13` |
| `0xa837f5` | `a837f5:	e8 a6 a6 d6 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>` |
| `0xa837fa` | `a837fa:	4c 89 f7             	mov    rdi,r14` |
| `0xa837fd` | `a837fd:	4c 89 fe             	mov    rsi,r15` |
| `0xa83800` | `a83800:	48 89 da             	mov    rdx,rbx` |
| `0xa83803` | `a83803:	e8 58 a6 d6 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa83808` | `a83808:	4c 8d 3d 39 32 f6 00 	lea    r15,[rip+0xf63239]        # 19e6a48 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1038>` |
| `0xa8380f` | `a8380f:	48 8d 35 fd 7e 8a ff 	lea    rsi,[rip+0xffffffffff8a7efd]        # 32b713 <_ZTSSt12bad_any_cast@@Base-0x64ab5>` |
| `0xa83816` | `a83816:	4c 89 ff             	mov    rdi,r15` |
| `0xa83819` | `a83819:	6a 17                	push   0x17` |
| `0xa8381b` | `a8381b:	5d                   	pop    rbp` |
| `0xa8381c` | `a8381c:	48 89 ea             	mov    rdx,rbp` |
| `0xa8381f` | `a8381f:	e8 7c a6 d6 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>` |
| `0xa83824` | `a83824:	4c 89 f7             	mov    rdi,r14` |
| `0xa83827` | `a83827:	4c 89 fe             	mov    rsi,r15` |
| `0xa8382a` | `a8382a:	48 89 da             	mov    rdx,rbx` |
| `0xa8382d` | `a8382d:	e8 2e a6 d6 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa83832` | `a83832:	4c 8d 3d 27 32 f6 00 	lea    r15,[rip+0xf63227]        # 19e6a60 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1050>` |
| `0xa83839` | `a83839:	48 8d 35 e9 99 8c ff 	lea    rsi,[rip+0xffffffffff8c99e9]        # 34d229 <_ZTSSt12bad_any_cast@@Base-0x42f9f>` |
| `0xa83840` | `a83840:	6a 1e                	push   0x1e` |
| `0xa83842` | `a83842:	41 5c                	pop    r12` |
| `0xa83844` | `a83844:	4c 89 ff             	mov    rdi,r15` |
| `0xa83847` | `a83847:	4c 89 e2             	mov    rdx,r12` |
| `0xa8384a` | `a8384a:	e8 51 a6 d6 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>` |
| `0xa8384f` | `a8384f:	4c 89 f7             	mov    rdi,r14` |
| `0xa83852` | `a83852:	4c 89 fe             	mov    rsi,r15` |
| `0xa83855` | `a83855:	48 89 da             	mov    rdx,rbx` |
| `0xa83858` | `a83858:	e8 03 a6 d6 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa8385d` | `a8385d:	4c 8d 3d 14 32 f6 00 	lea    r15,[rip+0xf63214]        # 19e6a78 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1068>` |
| `0xa83864` | `a83864:	48 8d 35 a0 cf 8f ff 	lea    rsi,[rip+0xffffffffff8fcfa0]        # 38080b <_ZTSSt12bad_any_cast@@Base-0xf9bd>` |
| `0xa8386b` | `a8386b:	4c 89 ff             	mov    rdi,r15` |
| `0xa8386e` | `a8386e:	48 89 ea             	mov    rdx,rbp` |
| `0xa83871` | `a83871:	e8 2a a6 d6 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>` |
| `0xa83876` | `a83876:	4c 89 f7             	mov    rdi,r14` |
| `0xa83879` | `a83879:	4c 89 fe             	mov    rsi,r15` |
| `0xa8387c` | `a8387c:	48 89 da             	mov    rdx,rbx` |
| `0xa8387f` | `a8387f:	e8 dc a5 d6 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa83884` | `a83884:	4c 8d 3d 05 32 f6 00 	lea    r15,[rip+0xf63205]        # 19e6a90 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x1080>` |
| `0xa8388b` | `a8388b:	48 8d 35 95 ea 8a ff 	lea    rsi,[rip+0xffffffffff8aea95]        # 332327 <_ZTSSt12bad_any_cast@@Base-0x5dea1>` |
| `0xa83892` | `a83892:	4c 89 ff             	mov    rdi,r15` |
| `0xa83895` | `a83895:	6a 1d                	push   0x1d` |
| `0xa83897` | `a83897:	41 5d                	pop    r13` |
| `0xa83899` | `a83899:	4c 89 ea             	mov    rdx,r13` |
| `0xa8389c` | `a8389c:	e8 ff a5 d6 00       	call   17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>` |
| `0xa838a1` | `a838a1:	4c 89 f7             	mov    rdi,r14` |
| `0xa838a4` | `a838a4:	4c 89 fe             	mov    rsi,r15` |
| `0xa838a7` | `a838a7:	48 89 da             	mov    rdx,rbx` |
| `0xa871fc` | `a871fc:	48 8b 3d 3d a8 e2 00 	mov    rdi,QWORD PTR [rip+0xe2a83d]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>` |
| `0xa87203` | `a87203:	48 8d 35 ce 1d f6 00 	lea    rsi,[rip+0xf61dce]        # 19e8fd8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x35c8>` |
| `0xa8720a` | `a8720a:	48 8d 15 ef cd d6 00 	lea    rdx,[rip+0xd6cdef]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>` |
| `0xa87211` | `a87211:	48 83 c4 18          	add    rsp,0x18` |
| `0xa87215` | `a87215:	e9 46 6c d6 00       	jmp    17ede60 <__cxa_atexit@plt>` |
| `0xa8721a` | `a8721a:	e8 91 88 d6 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xa8721f` | `a8721f:	55                   	push   rbp` |
| `0xa87220` | `a87220:	41 57                	push   r15` |
| `0xa87222` | `a87222:	41 56                	push   r14` |
| `0xa87224` | `a87224:	41 55                	push   r13` |
| `0xa87226` | `a87226:	41 54                	push   r12` |
| `0xa87228` | `a87228:	53                   	push   rbx` |
| `0xa87229` | `a87229:	48 81 ec 48 0e 00 00 	sub    rsp,0xe48` |
| `0xa87230` | `a87230:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa87237` | `a87237:	00 00` |
| `0xa87239` | `a87239:	48 89 84 24 40 0e 00 	mov    QWORD PTR [rsp+0xe40],rax` |
| `0xa87240` | `a87240:	00` |
| `0xa87241` | `a87241:	48 8d 35 bf 65 8b ff 	lea    rsi,[rip+0xffffffffff8b65bf]        # 33d807 <_ZTSSt12bad_any_cast@@Base-0x529c1>` |
| `0xa87248` | `a87248:	48 8d 9c 24 10 06 00 	lea    rbx,[rsp+0x610]` |
| `0xa8724f` | `a8724f:	00` |
| `0xa87250` | `a87250:	48 89 df             	mov    rdi,rbx` |
| `0xa87253` | `a87253:	e8 26 28 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa87258` | `a87258:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]` |
| `0xa8725f` | `a8725f:	00` |
| `0xa87260` | `a87260:	48 89 de             	mov    rsi,rbx` |
| `0xa87263` | `a87263:	e8 d8 6c d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xa87268` | `a87268:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]` |
| `0xa8726f` | `a8726f:	00` |
| `0xa87270` | `a87270:	c6 46 18 01          	mov    BYTE PTR [rsi+0x18],0x1` |
| `0xa87274` | `a87274:	48 8d bc 24 28 06 00 	lea    rdi,[rsp+0x628]` |
| `0xa8727b` | `a8727b:	00` |
| `0xa8727c` | `a8727c:	6a 01                	push   0x1` |
| `0xa8727e` | `a8727e:	5a                   	pop    rdx` |
| `0xa8727f` | `a8727f:	e8 a4 4c 28 00       	call   d0bf28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258ec8>` |
| `0xa87284` | `a87284:	48 8d bc 24 08 0c 00 	lea    rdi,[rsp+0xc08]` |
| `0xa8728b` | `a8728b:	00` |
| `0xa8728c` | `a8728c:	c7 47 f8 01 00 00 00 	mov    DWORD PTR [rdi-0x8],0x1` |
| `0xa87293` | `a87293:	48 8d b4 24 28 06 00 	lea    rsi,[rsp+0x628]` |
| `0xa8729a` | `a8729a:	00` |
| `0xa8729b` | `a8729b:	e8 40 4d 28 00       	call   d0bfe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258f80>` |
| `0xa872a0` | `a872a0:	4c 8d bc 24 20 0c 00 	lea    r15,[rsp+0xc20]` |
| `0xa872a7` | `a872a7:	00` |
| `0xa872a8` | `a872a8:	48 8d 35 58 65 8b ff 	lea    rsi,[rip+0xffffffffff8b6558]        # 33d807 <_ZTSSt12bad_any_cast@@Base-0x529c1>` |
| `0xa872af` | `a872af:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]` |
| `0xa872b6` | `a872b6:	00` |
| `0xa872b7` | `a872b7:	e8 c2 27 ff ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa872bc` | `a872bc:	48 8d bc 24 c0 0b 00 	lea    rdi,[rsp+0xbc0]` |
| `0xa872c3` | `a872c3:	00` |
| `0xa872c4` | `a872c4:	48 8d b4 24 e0 05 00 	lea    rsi,[rsp+0x5e0]` |
| `0xa872cb` | `a872cb:	00` |
| `0xa872cc` | `a872cc:	e8 6f 6c d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xa872d1` | `a872d1:	48 8d b4 24 c0 0b 00 	lea    rsi,[rsp+0xbc0]` |
| `0xa872d8` | `a872d8:	00` |
| `0xa872d9` | `a872d9:	c6 46 18 00          	mov    BYTE PTR [rsi+0x18],0x0` |
| `0xa872dd` | `a872dd:	48 8d bc 24 f8 05 00 	lea    rdi,[rsp+0x5f8]` |
| `0xa872e4` | `a872e4:	00` |
| `0xa8836f` | `a8836f:	e8 1c 5b d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa88374` | `a88374:	48 8d bc 24 c8 05 00 	lea    rdi,[rsp+0x5c8]` |
| `0xa8837b` | `a8837b:	00` |
| `0xa8837c` | `a8837c:	e8 49 df 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa88381` | `a88381:	48 8d bc 24 a0 0b 00 	lea    rdi,[rsp+0xba0]` |
| `0xa88388` | `a88388:	00` |
| `0xa88389` | `a88389:	e8 02 5b d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8838e` | `a8838e:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]` |
| `0xa88395` | `a88395:	00` |
| `0xa88396` | `a88396:	e8 f5 5a d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8839b` | `a8839b:	48 8d bc 24 f8 05 00 	lea    rdi,[rsp+0x5f8]` |
| `0xa883a2` | `a883a2:	00` |
| `0xa883a3` | `a883a3:	e8 22 df 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa883a8` | `a883a8:	48 8d bc 24 c0 0b 00 	lea    rdi,[rsp+0xbc0]` |
| `0xa883af` | `a883af:	00` |
| `0xa883b0` | `a883b0:	e8 db 5a d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa883b5` | `a883b5:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]` |
| `0xa883bc` | `a883bc:	00` |
| `0xa883bd` | `a883bd:	e8 ce 5a d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa883c2` | `a883c2:	48 8d bc 24 28 06 00 	lea    rdi,[rsp+0x628]` |
| `0xa883c9` | `a883c9:	00` |
| `0xa883ca` | `a883ca:	e8 fb de 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa883cf` | `a883cf:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]` |
| `0xa883d6` | `a883d6:	00` |
| `0xa883d7` | `a883d7:	e8 b4 5a d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa883dc` | `a883dc:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]` |
| `0xa883e3` | `a883e3:	00` |
| `0xa883e4` | `a883e4:	e8 a7 5a d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa883e9` | `a883e9:	48 8d 3d ba 41 28 00 	lea    rdi,[rip+0x2841ba]        # d0c5aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25954a>` |
| `0xa883f0` | `a883f0:	48 8d 35 01 0c f6 00 	lea    rsi,[rip+0xf60c01]        # 19e8ff8 <_ZGVN4asio6detail30execution_context_service_baseINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS6_EEEEEEE2idE@@Base+0x35e8>` |
| `0xa883f7` | `a883f7:	48 8d 15 02 bc d6 00 	lea    rdx,[rip+0xd6bc02]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>` |
| `0xa883fe` | `a883fe:	e8 5d 5a d6 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa88403` | `a88403:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa8840a` | `a8840a:	00 00` |
| `0xa8840c` | `a8840c:	48 3b 84 24 40 0e 00 	cmp    rax,QWORD PTR [rsp+0xe40]` |
| `0xa88413` | `a88413:	00` |
| `0xa88414` | `a88414:	0f 85 d6 07 00 00    	jne    a88bf0 <JNI_OnUnload@@Base+0x104bd>` |
| `0xa8841a` | `a8841a:	48 81 c4 48 0e 00 00 	add    rsp,0xe48` |
| `0xa88421` | `a88421:	5b                   	pop    rbx` |
| `0xa88422` | `a88422:	41 5c                	pop    r12` |
| `0xa88424` | `a88424:	41 5d                	pop    r13` |
| `0xa88426` | `a88426:	41 5e                	pop    r14` |
| `0xa88428` | `a88428:	41 5f                	pop    r15` |
| `0xa8842a` | `a8842a:	5d                   	pop    rbp` |
| `0xa8842b` | `a8842b:	c3                   	ret` |
| `0xa8842c` | `a8842c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88431` | `a88431:	41 be 28 02 00 00    	mov    r14d,0x228` |
| `0xa88437` | `a88437:	4a 8d 3c 34          	lea    rdi,[rsp+r14*1]` |
| `0xa8843b` | `a8843b:	48 81 c7 00 0c 00 00 	add    rdi,0xc00` |
| `0xa88442` | `a88442:	e8 83 de 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa88447` | `a88447:	49 83 c6 e0          	add    r14,0xffffffffffffffe0` |
| `0xa8844b` | `a8844b:	49 83 fe e8          	cmp    r14,0xffffffffffffffe8` |
| `0xa88b26` | `a88b26:	e8 65 53 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa88b2b` | `a88b2b:	48 8d bc 24 c8 05 00 	lea    rdi,[rsp+0x5c8]` |
| `0xa88b32` | `a88b32:	00` |
| `0xa88b33` | `a88b33:	e8 92 d7 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa88b38` | `a88b38:	48 8d bc 24 a0 0b 00 	lea    rdi,[rsp+0xba0]` |
| `0xa88b3f` | `a88b3f:	00` |
| `0xa88b40` | `a88b40:	e8 4b 53 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa88b45` | `a88b45:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]` |
| `0xa88b4c` | `a88b4c:	00` |
| `0xa88b4d` | `a88b4d:	e8 3e 53 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa88b52` | `a88b52:	48 8d bc 24 f8 05 00 	lea    rdi,[rsp+0x5f8]` |
| `0xa88b59` | `a88b59:	00` |
| `0xa88b5a` | `a88b5a:	e8 6b d7 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa88b5f` | `a88b5f:	48 8d bc 24 c0 0b 00 	lea    rdi,[rsp+0xbc0]` |
| `0xa88b66` | `a88b66:	00` |
| `0xa88b67` | `a88b67:	e8 24 53 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa88b6c` | `a88b6c:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]` |
| `0xa88b73` | `a88b73:	00` |
| `0xa88b74` | `a88b74:	e8 17 53 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa88b79` | `a88b79:	48 8d bc 24 28 06 00 	lea    rdi,[rsp+0x628]` |
| `0xa88b80` | `a88b80:	00` |
| `0xa88b81` | `a88b81:	e8 44 d7 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa88b86` | `a88b86:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]` |
| `0xa88b8d` | `a88b8d:	00` |
| `0xa88b8e` | `a88b8e:	e8 fd 52 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa88b93` | `a88b93:	8b 6c 24 0c          	mov    ebp,DWORD PTR [rsp+0xc]` |
| `0xa88b97` | `a88b97:	48 8d bc 24 10 06 00 	lea    rdi,[rsp+0x610]` |
| `0xa88b9e` | `a88b9e:	00` |
| `0xa88b9f` | `a88b9f:	e8 ec 52 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa88ba4` | `a88ba4:	48 8d 9c 24 00 0c 00 	lea    rbx,[rsp+0xc00]` |
| `0xa88bab` | `a88bab:	00` |
| `0xa88bac` | `a88bac:	4c 39 fb             	cmp    rbx,r15` |
| `0xa88baf` | `a88baf:	0f 95 c0             	setne  al` |
| `0xa88bb2` | `a88bb2:	40 84 ed             	test   bpl,bpl` |
| `0xa88bb5` | `a88bb5:	74 1c                	je     a88bd3 <JNI_OnUnload@@Base+0x104a0>` |
| `0xa88bb7` | `a88bb7:	84 c0                	test   al,al` |
| `0xa88bb9` | `a88bb9:	74 18                	je     a88bd3 <JNI_OnUnload@@Base+0x104a0>` |
| `0xa88bbb` | `a88bbb:	4d 8d 77 e0          	lea    r14,[r15-0x20]` |
| `0xa88bbf` | `a88bbf:	49 83 c7 e8          	add    r15,0xffffffffffffffe8` |
| `0xa88bc3` | `a88bc3:	4c 89 ff             	mov    rdi,r15` |
| `0xa88bc6` | `a88bc6:	e8 ff d6 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa88bcb` | `a88bcb:	4d 89 f7             	mov    r15,r14` |
| `0xa88bce` | `a88bce:	49 39 de             	cmp    r14,rbx` |
| `0xa88bd1` | `a88bd1:	75 e8                	jne    a88bbb <JNI_OnUnload@@Base+0x10488>` |
| `0xa88bd3` | `a88bd3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa88bda` | `a88bda:	00 00` |
| `0xa88bdc` | `a88bdc:	48 3b 84 24 40 0e 00 	cmp    rax,QWORD PTR [rsp+0xe40]` |
| `0xa88be3` | `a88be3:	00` |
| `0xa88be4` | `a88be4:	75 0a                	jne    a88bf0 <JNI_OnUnload@@Base+0x104bd>` |
| `0xa88be6` | `a88be6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0xa88beb` | `a88beb:	e8 e0 70 fe ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0xa88bf0` | `a88bf0:	e8 bb 6e d6 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xa88bf5` | `a88bf5:	eb 00                	jmp    a88bf7 <JNI_OnUnload@@Base+0x104c4>` |
| `0xa88bf7` | `a88bf7:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88bfc` | `a88bfc:	41 b6 01             	mov    r14b,0x1` |
| `0xa88bff` | `a88bff:	b0 01                	mov    al,0x1` |
| `0xa88c01` | `a88c01:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa88c05` | `a88c05:	e9 0a f9 ff ff       	jmp    a88514 <JNI_OnUnload@@Base+0xfde1>` |
| `0xa88c0a` | `a88c0a:	eb 00                	jmp    a88c0c <JNI_OnUnload@@Base+0x104d9>` |
| `0xa88c0c` | `a88c0c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88c11` | `a88c11:	41 b6 01             	mov    r14b,0x1` |
| `0xa88c14` | `a88c14:	b0 01                	mov    al,0x1` |
| `0xa88c16` | `a88c16:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa88c1a` | `a88c1a:	e9 02 f9 ff ff       	jmp    a88521 <JNI_OnUnload@@Base+0xfdee>` |
| `0xa88c1f` | `a88c1f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88c24` | `a88c24:	41 b6 01             	mov    r14b,0x1` |
| `0xa88c27` | `a88c27:	eb 10                	jmp    a88c39 <JNI_OnUnload@@Base+0x10506>` |
| `0xa88c29` | `a88c29:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88c2e` | `a88c2e:	41 b6 01             	mov    r14b,0x1` |
| `0xa88c31` | `a88c31:	4c 8d bc 24 40 06 00 	lea    r15,[rsp+0x640]` |
| `0xa88c38` | `a88c38:	00` |
| `0xa88c39` | `a88c39:	b0 01                	mov    al,0x1` |
| `0xa88c3b` | `a88c3b:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa88c3f` | `a88c3f:	e9 ea f8 ff ff       	jmp    a8852e <JNI_OnUnload@@Base+0xfdfb>` |
| `0xa88c44` | `a88c44:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88c49` | `a88c49:	b0 01                	mov    al,0x1` |
| `0xa88c4b` | `a88c4b:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa88c4f` | `a88c4f:	e9 17 f9 ff ff       	jmp    a8856b <JNI_OnUnload@@Base+0xfe38>` |
| `0xa88c54` | `a88c54:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88c59` | `a88c59:	b0 01                	mov    al,0x1` |
| `0xa88c5b` | `a88c5b:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa88c5f` | `a88c5f:	e9 0f f9 ff ff       	jmp    a88573 <JNI_OnUnload@@Base+0xfe40>` |
| `0xa88c64` | `a88c64:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88c69` | `a88c69:	b0 01                	mov    al,0x1` |
| `0xa88c6b` | `a88c6b:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa88c6f` | `a88c6f:	e9 0c f9 ff ff       	jmp    a88580 <JNI_OnUnload@@Base+0xfe4d>` |
| `0xa88c74` | `a88c74:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88c79` | `a88c79:	41 b6 01             	mov    r14b,0x1` |
| `0xa88c7c` | `a88c7c:	b0 01                	mov    al,0x1` |
| `0xa88c7e` | `a88c7e:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa88c82` | `a88c82:	e9 1c f9 ff ff       	jmp    a885a3 <JNI_OnUnload@@Base+0xfe70>` |
| `0xa88c87` | `a88c87:	eb 00                	jmp    a88c89 <JNI_OnUnload@@Base+0x10556>` |
| `0xa88c89` | `a88c89:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa88c8e` | `a88c8e:	41 b6 01             	mov    r14b,0x1` |
| `0xa88c91` | `a88c91:	b0 01                	mov    al,0x1` |
| `0xa88c93` | `a88c93:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8d4d0` | `a8d4d0:	4c 89 f7             	mov    rdi,r14` |
| `0xa8d4d3` | `a8d4d3:	e8 68 0a d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xa8d4d8` | `a8d4d8:	48 8d b4 24 40 0c 00 	lea    rsi,[rsp+0xc40]` |
| `0xa8d4df` | `a8d4df:	00` |
| `0xa8d4e0` | `a8d4e0:	c6 86 98 00 00 00 01 	mov    BYTE PTR [rsi+0x98],0x1` |
| `0xa8d4e7` | `a8d4e7:	48 8d bc 24 28 04 00 	lea    rdi,[rsp+0x428]` |
| `0xa8d4ee` | `a8d4ee:	00` |
| `0xa8d4ef` | `a8d4ef:	6a 05                	push   0x5` |
| `0xa8d4f1` | `a8d4f1:	5a                   	pop    rdx` |
| `0xa8d4f2` | `a8d4f2:	e8 31 ea 27 00       	call   d0bf28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258ec8>` |
| `0xa8d4f7` | `a8d4f7:	48 8d bc 24 e8 13 00 	lea    rdi,[rsp+0x13e8]` |
| `0xa8d4fe` | `a8d4fe:	00` |
| `0xa8d4ff` | `a8d4ff:	c7 47 f8 0e 00 00 00 	mov    DWORD PTR [rdi-0x8],0xe` |
| `0xa8d506` | `a8d506:	48 8d b4 24 28 04 00 	lea    rsi,[rsp+0x428]` |
| `0xa8d50d` | `a8d50d:	00` |
| `0xa8d50e` | `a8d50e:	e8 cd ea 27 00       	call   d0bfe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258f80>` |
| `0xa8d513` | `a8d513:	4c 8d ac 24 00 14 00 	lea    r13,[rsp+0x1400]` |
| `0xa8d51a` | `a8d51a:	00` |
| `0xa8d51b` | `a8d51b:	48 8d 35 69 70 8d ff 	lea    rsi,[rip+0xffffffffff8d7069]        # 36458b <_ZTSSt12bad_any_cast@@Base-0x2bc3d>` |
| `0xa8d522` | `a8d522:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]` |
| `0xa8d529` | `a8d529:	00` |
| `0xa8d52a` | `a8d52a:	e8 4f c5 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa8d52f` | `a8d52f:	48 8d bc 24 e0 0b 00 	lea    rdi,[rsp+0xbe0]` |
| `0xa8d536` | `a8d536:	00` |
| `0xa8d537` | `a8d537:	48 8d b4 24 80 03 00 	lea    rsi,[rsp+0x380]` |
| `0xa8d53e` | `a8d53e:	00` |
| `0xa8d53f` | `a8d53f:	e8 fc 09 d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xa8d544` | `a8d544:	4c 8d bc 24 00 0c 00 	lea    r15,[rsp+0xc00]` |
| `0xa8d54b` | `a8d54b:	00` |
| `0xa8d54c` | `a8d54c:	41 c6 47 f8 01       	mov    BYTE PTR [r15-0x8],0x1` |
| `0xa8d551` | `a8d551:	48 8d 35 0d f6 89 ff 	lea    rsi,[rip+0xffffffffff89f60d]        # 32cb65 <_ZTSSt12bad_any_cast@@Base-0x63663>` |
| `0xa8d558` | `a8d558:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]` |
| `0xa8d55f` | `a8d55f:	00` |
| `0xa8d560` | `a8d560:	e8 19 c5 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa8d565` | `a8d565:	48 8d b4 24 68 03 00 	lea    rsi,[rsp+0x368]` |
| `0xa8d56c` | `a8d56c:	00` |
| `0xa8d56d` | `a8d56d:	4c 89 ff             	mov    rdi,r15` |
| `0xa8d570` | `a8d570:	e8 cb 09 d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xa8d575` | `a8d575:	4c 8d bc 24 20 0c 00 	lea    r15,[rsp+0xc20]` |
| `0xa8d57c` | `a8d57c:	00` |
| `0xa8d57d` | `a8d57d:	41 c6 47 f8 01       	mov    BYTE PTR [r15-0x8],0x1` |
| `0xa8d582` | `a8d582:	48 8d 35 11 e2 8e ff 	lea    rsi,[rip+0xffffffffff8ee211]        # 37b79a <_ZTSSt12bad_any_cast@@Base-0x14a2e>` |
| `0xa8d589` | `a8d589:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]` |
| `0xa8d590` | `a8d590:	00` |
| `0xa8d591` | `a8d591:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15` |
| `0xa8d596` | `a8d596:	e8 e3 c4 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa8d59b` | `a8d59b:	48 8d b4 24 50 03 00 	lea    rsi,[rsp+0x350]` |
| `0xa8d5a2` | `a8d5a2:	00` |
| `0xa8d5a3` | `a8d5a3:	4c 89 ff             	mov    rdi,r15` |
| `0xa8d5a6` | `a8d5a6:	e8 95 09 d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xa8d5ab` | `a8d5ab:	48 8d b4 24 e0 0b 00 	lea    rsi,[rsp+0xbe0]` |
| `0xa8d5b2` | `a8d5b2:	00` |
| `0xa8d5b3` | `a8d5b3:	c6 46 58 01          	mov    BYTE PTR [rsi+0x58],0x1` |
| `0xa8d5b7` | `a8d5b7:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]` |
| `0xa8d5be` | `a8d5be:	00` |
| `0xa8d5bf` | `a8d5bf:	6a 03                	push   0x3` |
| `0xa8d5c1` | `a8d5c1:	5a                   	pop    rdx` |
| `0xa8d5c2` | `a8d5c2:	e8 61 e9 27 00       	call   d0bf28 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258ec8>` |
| `0xa8d5c7` | `a8d5c7:	48 8d bc 24 08 14 00 	lea    rdi,[rsp+0x1408]` |
| `0xa8d5ce` | `a8d5ce:	00` |
| `0xa8d5cf` | `a8d5cf:	c7 47 f8 0f 00 00 00 	mov    DWORD PTR [rdi-0x8],0xf` |
| `0xa8d5d6` | `a8d5d6:	48 8d b4 24 98 03 00 	lea    rsi,[rsp+0x398]` |
| `0xa8d5dd` | `a8d5dd:	00` |
| `0xa8d5de` | `a8d5de:	e8 fd e9 27 00       	call   d0bfe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258f80>` |
| `0xa8d5e3` | `a8d5e3:	4c 8d ac 24 20 14 00 	lea    r13,[rsp+0x1420]` |
| `0xa8d5ea` | `a8d5ea:	00` |
| `0xa8d5eb` | `a8d5eb:	48 8d 35 99 6f 8d ff 	lea    rsi,[rip+0xffffffffff8d6f99]        # 36458b <_ZTSSt12bad_any_cast@@Base-0x2bc3d>` |
| `0xa8d5f2` | `a8d5f2:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]` |
| `0xa8d5f9` | `a8d5f9:	00` |
| `0xa8d5fa` | `a8d5fa:	e8 7f c4 fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa8d5ff` | `a8d5ff:	48 8d bc 24 80 0b 00 	lea    rdi,[rsp+0xb80]` |
| `0xa8d606` | `a8d606:	00` |
| `0xa8d607` | `a8d607:	48 8d b4 24 20 03 00 	lea    rsi,[rsp+0x320]` |
| `0xa8d60e` | `a8d60e:	00` |
| `0xa8d60f` | `a8d60f:	e8 2c 09 d6 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>` |
| `0xa8d614` | `a8d614:	4c 8d bc 24 a0 0b 00 	lea    r15,[rsp+0xba0]` |
| `0xa8d61b` | `a8d61b:	00` |
| `0xa8d61c` | `a8d61c:	41 c6 47 f8 00       	mov    BYTE PTR [r15-0x8],0x0` |
| `0xa8d621` | `a8d621:	48 8d 35 3d f5 89 ff 	lea    rsi,[rip+0xffffffffff89f53d]        # 32cb65 <_ZTSSt12bad_any_cast@@Base-0x63663>` |
| `0xa8d628` | `a8d628:	48 8d bc 24 08 03 00 	lea    rdi,[rsp+0x308]` |
| `0xa8ddf9` | `a8ddf9:	5b                   	pop    rbx` |
| `0xa8ddfa` | `a8ddfa:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]` |
| `0xa8ddfe` | `a8ddfe:	48 81 c7 80 0b 00 00 	add    rdi,0xb80` |
| `0xa8de05` | `a8de05:	e8 86 00 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8de0a` | `a8de0a:	48 83 c3 e0          	add    rbx,0xffffffffffffffe0` |
| `0xa8de0e` | `a8de0e:	48 83 fb e0          	cmp    rbx,0xffffffffffffffe0` |
| `0xa8de12` | `a8de12:	75 e6                	jne    a8ddfa <JNI_OnUnload@@Base+0x156c7>` |
| `0xa8de14` | `a8de14:	48 8d bc 24 f0 02 00 	lea    rdi,[rsp+0x2f0]` |
| `0xa8de1b` | `a8de1b:	00` |
| `0xa8de1c` | `a8de1c:	e8 6f 00 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8de21` | `a8de21:	48 8d bc 24 08 03 00 	lea    rdi,[rsp+0x308]` |
| `0xa8de28` | `a8de28:	00` |
| `0xa8de29` | `a8de29:	e8 62 00 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8de2e` | `a8de2e:	48 8d bc 24 20 03 00 	lea    rdi,[rsp+0x320]` |
| `0xa8de35` | `a8de35:	00` |
| `0xa8de36` | `a8de36:	e8 55 00 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8de3b` | `a8de3b:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]` |
| `0xa8de42` | `a8de42:	00` |
| `0xa8de43` | `a8de43:	e8 82 84 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa8de48` | `a8de48:	6a 40                	push   0x40` |
| `0xa8de4a` | `a8de4a:	5b                   	pop    rbx` |
| `0xa8de4b` | `a8de4b:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]` |
| `0xa8de4f` | `a8de4f:	48 81 c7 e0 0b 00 00 	add    rdi,0xbe0` |
| `0xa8de56` | `a8de56:	e8 35 00 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8de5b` | `a8de5b:	48 83 c3 e0          	add    rbx,0xffffffffffffffe0` |
| `0xa8de5f` | `a8de5f:	48 83 fb e0          	cmp    rbx,0xffffffffffffffe0` |
| `0xa8de63` | `a8de63:	75 e6                	jne    a8de4b <JNI_OnUnload@@Base+0x15718>` |
| `0xa8de65` | `a8de65:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]` |
| `0xa8de6c` | `a8de6c:	00` |
| `0xa8de6d` | `a8de6d:	e8 1e 00 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8de72` | `a8de72:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]` |
| `0xa8de79` | `a8de79:	00` |
| `0xa8de7a` | `a8de7a:	e8 11 00 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8de7f` | `a8de7f:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]` |
| `0xa8de86` | `a8de86:	00` |
| `0xa8de87` | `a8de87:	e8 04 00 d6 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8de8c` | `a8de8c:	48 8d bc 24 28 04 00 	lea    rdi,[rsp+0x428]` |
| `0xa8de93` | `a8de93:	00` |
| `0xa8de94` | `a8de94:	e8 31 84 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa8de99` | `a8de99:	bb 80 00 00 00       	mov    ebx,0x80` |
| `0xa8de9e` | `a8de9e:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]` |
| `0xa8dea2` | `a8dea2:	48 81 c7 40 0c 00 00 	add    rdi,0xc40` |
| `0xa8dea9` | `a8dea9:	e8 e2 ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8deae` | `a8deae:	48 83 c3 e0          	add    rbx,0xffffffffffffffe0` |
| `0xa8deb2` | `a8deb2:	48 83 fb e0          	cmp    rbx,0xffffffffffffffe0` |
| `0xa8deb6` | `a8deb6:	75 e6                	jne    a8de9e <JNI_OnUnload@@Base+0x1576b>` |
| `0xa8deb8` | `a8deb8:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]` |
| `0xa8debf` | `a8debf:	00` |
| `0xa8dec0` | `a8dec0:	e8 cb ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8dec5` | `a8dec5:	48 8d bc 24 c8 03 00 	lea    rdi,[rsp+0x3c8]` |
| `0xa8decc` | `a8decc:	00` |
| `0xa8decd` | `a8decd:	e8 be ff d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e856` | `a8e856:	48 8d 84 24 80 0b 00 	lea    rax,[rsp+0xb80]` |
| `0xa8e85d` | `a8e85d:	00` |
| `0xa8e85e` | `a8e85e:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]` |
| `0xa8e863` | `a8e863:	0f 95 c0             	setne  al` |
| `0xa8e866` | `a8e866:	40 84 ed             	test   bpl,bpl` |
| `0xa8e869` | `a8e869:	74 22                	je     a8e88d <JNI_OnUnload@@Base+0x1615a>` |
| `0xa8e86b` | `a8e86b:	84 c0                	test   al,al` |
| `0xa8e86d` | `a8e86d:	74 1e                	je     a8e88d <JNI_OnUnload@@Base+0x1615a>` |
| `0xa8e86f` | `a8e86f:	4c 8d bc 24 80 0b 00 	lea    r15,[rsp+0xb80]` |
| `0xa8e876` | `a8e876:	00` |
| `0xa8e877` | `a8e877:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]` |
| `0xa8e87c` | `a8e87c:	49 83 c4 e0          	add    r12,0xffffffffffffffe0` |
| `0xa8e880` | `a8e880:	4c 89 e7             	mov    rdi,r12` |
| `0xa8e883` | `a8e883:	e8 08 f6 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e888` | `a8e888:	4d 39 fc             	cmp    r12,r15` |
| `0xa8e88b` | `a8e88b:	75 ef                	jne    a8e87c <JNI_OnUnload@@Base+0x16149>` |
| `0xa8e88d` | `a8e88d:	48 8d bc 24 98 03 00 	lea    rdi,[rsp+0x398]` |
| `0xa8e894` | `a8e894:	00` |
| `0xa8e895` | `a8e895:	e8 30 7a 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa8e89a` | `a8e89a:	6a 40                	push   0x40` |
| `0xa8e89c` | `a8e89c:	41 5f                	pop    r15` |
| `0xa8e89e` | `a8e89e:	4a 8d 3c 3c          	lea    rdi,[rsp+r15*1]` |
| `0xa8e8a2` | `a8e8a2:	48 81 c7 e0 0b 00 00 	add    rdi,0xbe0` |
| `0xa8e8a9` | `a8e8a9:	e8 e2 f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e8ae` | `a8e8ae:	49 83 c7 e0          	add    r15,0xffffffffffffffe0` |
| `0xa8e8b2` | `a8e8b2:	49 83 ff e0          	cmp    r15,0xffffffffffffffe0` |
| `0xa8e8b6` | `a8e8b6:	75 e6                	jne    a8e89e <JNI_OnUnload@@Base+0x1616b>` |
| `0xa8e8b8` | `a8e8b8:	31 ed                	xor    ebp,ebp` |
| `0xa8e8ba` | `a8e8ba:	48 8d bc 24 50 03 00 	lea    rdi,[rsp+0x350]` |
| `0xa8e8c1` | `a8e8c1:	00` |
| `0xa8e8c2` | `a8e8c2:	e8 c9 f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e8c7` | `a8e8c7:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]` |
| `0xa8e8ce` | `a8e8ce:	00` |
| `0xa8e8cf` | `a8e8cf:	e8 bc f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e8d4` | `a8e8d4:	48 8d bc 24 80 03 00 	lea    rdi,[rsp+0x380]` |
| `0xa8e8db` | `a8e8db:	00` |
| `0xa8e8dc` | `a8e8dc:	e8 af f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e8e1` | `a8e8e1:	48 8d 84 24 e0 0b 00 	lea    rax,[rsp+0xbe0]` |
| `0xa8e8e8` | `a8e8e8:	00` |
| `0xa8e8e9` | `a8e8e9:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]` |
| `0xa8e8ee` | `a8e8ee:	0f 95 c0             	setne  al` |
| `0xa8e8f1` | `a8e8f1:	40 84 ed             	test   bpl,bpl` |
| `0xa8e8f4` | `a8e8f4:	74 22                	je     a8e918 <JNI_OnUnload@@Base+0x161e5>` |
| `0xa8e8f6` | `a8e8f6:	84 c0                	test   al,al` |
| `0xa8e8f8` | `a8e8f8:	74 1e                	je     a8e918 <JNI_OnUnload@@Base+0x161e5>` |
| `0xa8e8fa` | `a8e8fa:	4c 8d bc 24 e0 0b 00 	lea    r15,[rsp+0xbe0]` |
| `0xa8e901` | `a8e901:	00` |
| `0xa8e902` | `a8e902:	4c 8b 64 24 40       	mov    r12,QWORD PTR [rsp+0x40]` |
| `0xa8e907` | `a8e907:	49 83 c4 e0          	add    r12,0xffffffffffffffe0` |
| `0xa8e90b` | `a8e90b:	4c 89 e7             	mov    rdi,r12` |
| `0xa8e90e` | `a8e90e:	e8 7d f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e913` | `a8e913:	4d 39 fc             	cmp    r12,r15` |
| `0xa8e916` | `a8e916:	75 ef                	jne    a8e907 <JNI_OnUnload@@Base+0x161d4>` |
| `0xa8e918` | `a8e918:	48 8d bc 24 28 04 00 	lea    rdi,[rsp+0x428]` |
| `0xa8e91f` | `a8e91f:	00` |
| `0xa8e920` | `a8e920:	e8 a5 79 19 00       	call   c262ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17326a>` |
| `0xa8e925` | `a8e925:	41 bf 80 00 00 00    	mov    r15d,0x80` |
| `0xa8e92b` | `a8e92b:	4a 8d 3c 3c          	lea    rdi,[rsp+r15*1]` |
| `0xa8e92f` | `a8e92f:	48 81 c7 40 0c 00 00 	add    rdi,0xc40` |
| `0xa8e936` | `a8e936:	e8 55 f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e93b` | `a8e93b:	49 83 c7 e0          	add    r15,0xffffffffffffffe0` |
| `0xa8e93f` | `a8e93f:	49 83 ff e0          	cmp    r15,0xffffffffffffffe0` |
| `0xa8e943` | `a8e943:	75 e6                	jne    a8e92b <JNI_OnUnload@@Base+0x161f8>` |
| `0xa8e945` | `a8e945:	31 ed                	xor    ebp,ebp` |
| `0xa8e947` | `a8e947:	48 8d bc 24 b0 03 00 	lea    rdi,[rsp+0x3b0]` |
| `0xa8e94e` | `a8e94e:	00` |
| `0xa8e94f` | `a8e94f:	e8 3c f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e954` | `a8e954:	48 8d bc 24 c8 03 00 	lea    rdi,[rsp+0x3c8]` |
| `0xa8e95b` | `a8e95b:	00` |
| `0xa8e95c` | `a8e95c:	e8 2f f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e961` | `a8e961:	48 8d bc 24 e0 03 00 	lea    rdi,[rsp+0x3e0]` |
| `0xa8e968` | `a8e968:	00` |
| `0xa8e969` | `a8e969:	e8 22 f5 d5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa8e96e` | `a8e96e:	48 8d bc 24 f8 03 00 	lea    rdi,[rsp+0x3f8]` |
| `0xa8e975` | `a8e975:	00` |
| `0xa8f4a7` | `a8f4a7:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f4ab` | `a8f4ab:	e9 dd f3 ff ff       	jmp    a8e88d <JNI_OnUnload@@Base+0x1615a>` |
| `0xa8f4b0` | `a8f4b0:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f4b5` | `a8f4b5:	b0 01                	mov    al,0x1` |
| `0xa8f4b7` | `a8f4b7:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f4bb` | `a8f4bb:	e9 da f3 ff ff       	jmp    a8e89a <JNI_OnUnload@@Base+0x16167>` |
| `0xa8f4c0` | `a8f4c0:	40 b5 01             	mov    bpl,0x1` |
| `0xa8f4c3` | `a8f4c3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f4c8` | `a8f4c8:	b0 01                	mov    al,0x1` |
| `0xa8f4ca` | `a8f4ca:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f4ce` | `a8f4ce:	e9 e7 f3 ff ff       	jmp    a8e8ba <JNI_OnUnload@@Base+0x16187>` |
| `0xa8f4d3` | `a8f4d3:	eb 05                	jmp    a8f4da <JNI_OnUnload@@Base+0x16da7>` |
| `0xa8f4d5` | `a8f4d5:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15` |
| `0xa8f4da` | `a8f4da:	40 b5 01             	mov    bpl,0x1` |
| `0xa8f4dd` | `a8f4dd:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f4e2` | `a8f4e2:	b0 01                	mov    al,0x1` |
| `0xa8f4e4` | `a8f4e4:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f4e8` | `a8f4e8:	e9 da f3 ff ff       	jmp    a8e8c7 <JNI_OnUnload@@Base+0x16194>` |
| `0xa8f4ed` | `a8f4ed:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15` |
| `0xa8f4f2` | `a8f4f2:	40 b5 01             	mov    bpl,0x1` |
| `0xa8f4f5` | `a8f4f5:	eb 10                	jmp    a8f507 <JNI_OnUnload@@Base+0x16dd4>` |
| `0xa8f4f7` | `a8f4f7:	40 b5 01             	mov    bpl,0x1` |
| `0xa8f4fa` | `a8f4fa:	48 8d 8c 24 e0 0b 00 	lea    rcx,[rsp+0xbe0]` |
| `0xa8f501` | `a8f501:	00` |
| `0xa8f502` | `a8f502:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx` |
| `0xa8f507` | `a8f507:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f50c` | `a8f50c:	b0 01                	mov    al,0x1` |
| `0xa8f50e` | `a8f50e:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f512` | `a8f512:	e9 bd f3 ff ff       	jmp    a8e8d4 <JNI_OnUnload@@Base+0x161a1>` |
| `0xa8f517` | `a8f517:	b1 01                	mov    cl,0x1` |
| `0xa8f519` | `a8f519:	89 4c 24 0c          	mov    DWORD PTR [rsp+0xc],ecx` |
| `0xa8f51d` | `a8f51d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f522` | `a8f522:	e9 f1 f3 ff ff       	jmp    a8e918 <JNI_OnUnload@@Base+0x161e5>` |
| `0xa8f527` | `a8f527:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f52c` | `a8f52c:	b0 01                	mov    al,0x1` |
| `0xa8f52e` | `a8f52e:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f532` | `a8f532:	e9 e1 f3 ff ff       	jmp    a8e918 <JNI_OnUnload@@Base+0x161e5>` |
| `0xa8f537` | `a8f537:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f53c` | `a8f53c:	b0 01                	mov    al,0x1` |
| `0xa8f53e` | `a8f53e:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f542` | `a8f542:	e9 de f3 ff ff       	jmp    a8e925 <JNI_OnUnload@@Base+0x161f2>` |
| `0xa8f547` | `a8f547:	40 b5 01             	mov    bpl,0x1` |
| `0xa8f54a` | `a8f54a:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f54f` | `a8f54f:	b0 01                	mov    al,0x1` |
| `0xa8f551` | `a8f551:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f555` | `a8f555:	e9 ed f3 ff ff       	jmp    a8e947 <JNI_OnUnload@@Base+0x16214>` |
| `0xa8f55a` | `a8f55a:	eb 00                	jmp    a8f55c <JNI_OnUnload@@Base+0x16e29>` |
| `0xa8f55c` | `a8f55c:	40 b5 01             	mov    bpl,0x1` |
| `0xa8f55f` | `a8f55f:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xa8f564` | `a8f564:	b0 01                	mov    al,0x1` |
| `0xa8f566` | `a8f566:	89 44 24 0c          	mov    DWORD PTR [rsp+0xc],eax` |
| `0xa8f56a` | `a8f56a:	e9 e5 f3 ff ff       	jmp    a8e954 <JNI_OnUnload@@Base+0x16221>` |
| `0xa93ace` | `a93ace:	e8 c7 cc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>` |
| `0xa93ad3` | `a93ad3:	e8 09 cd 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>` |
| `0xa93ad8` | `a93ad8:	e8 4b cd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>` |
| `0xa93add` | `a93add:	58                   	pop    rax` |
| `0xa93ade` | `a93ade:	e9 8c cd 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>` |
| `0xa93ae3` | `a93ae3:	41 57                	push   r15` |
| `0xa93ae5` | `a93ae5:	41 56                	push   r14` |
| `0xa93ae7` | `a93ae7:	53                   	push   rbx` |
| `0xa93ae8` | `a93ae8:	e8 ad cc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>` |
| `0xa93aed` | `a93aed:	e8 ef cc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>` |
| `0xa93af2` | `a93af2:	e8 31 cd 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>` |
| `0xa93af7` | `a93af7:	e8 73 cd 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>` |
| `0xa93afc` | `a93afc:	48 8d 1d 05 be f5 00 	lea    rbx,[rip+0xf5be05]        # 19ef908 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1038>` |
| `0xa93b03` | `a93b03:	48 8d 35 b8 d1 8b ff 	lea    rsi,[rip+0xffffffffff8bd1b8]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>` |
| `0xa93b0a` | `a93b0a:	48 89 df             	mov    rdi,rbx` |
| `0xa93b0d` | `a93b0d:	e8 6c 5f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa93b12` | `a93b12:	4c 8b 35 27 df e1 00 	mov    r14,QWORD PTR [rip+0xe1df27]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>` |
| `0xa93b19` | `a93b19:	4c 8d 3d e0 04 d6 00 	lea    r15,[rip+0xd604e0]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>` |
| `0xa93b20` | `a93b20:	4c 89 f7             	mov    rdi,r14` |
| `0xa93b23` | `a93b23:	48 89 de             	mov    rsi,rbx` |
| `0xa93b26` | `a93b26:	4c 89 fa             	mov    rdx,r15` |
| `0xa93b29` | `a93b29:	e8 32 a3 d5 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa93b2e` | `a93b2e:	48 8d 1d eb bd f5 00 	lea    rbx,[rip+0xf5bdeb]        # 19ef920 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1050>` |
| `0xa93b35` | `a93b35:	48 8d 35 8e c2 89 ff 	lea    rsi,[rip+0xffffffffff89c28e]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>` |
| `0xa93b3c` | `a93b3c:	48 89 df             	mov    rdi,rbx` |
| `0xa93b3f` | `a93b3f:	e8 3a 5f fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa93b44` | `a93b44:	4c 89 f7             	mov    rdi,r14` |
| `0xa93b47` | `a93b47:	48 89 de             	mov    rsi,rbx` |
| `0xa93b4a` | `a93b4a:	4c 89 fa             	mov    rdx,r15` |
| `0xa93b4d` | `a93b4d:	5b                   	pop    rbx` |
| `0xa93b4e` | `a93b4e:	41 5e                	pop    r14` |
| `0xa93b50` | `a93b50:	41 5f                	pop    r15` |
| `0xa93b52` | `a93b52:	e9 09 a3 d5 00       	jmp    17ede60 <__cxa_atexit@plt>` |
| `0xa93b57` | `a93b57:	41 57                	push   r15` |
| `0xa93b59` | `a93b59:	41 56                	push   r14` |
| `0xa93b5b` | `a93b5b:	53                   	push   rbx` |
| `0xa93b5c` | `a93b5c:	e8 39 cc 01 00       	call   ab079a <JNI_OnUnload@@Base+0x38067>` |
| `0xa93b61` | `a93b61:	e8 7b cc 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>` |
| `0xa93b66` | `a93b66:	e8 bd cc 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>` |
| `0xa93b6b` | `a93b6b:	e8 ff cc 01 00       	call   ab086f <JNI_OnUnload@@Base+0x3813c>` |
| `0xa93b70` | `a93b70:	48 8d 1d f1 bd f5 00 	lea    rbx,[rip+0xf5bdf1]        # 19ef968 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x1098>` |
| `0xa93b77` | `a93b77:	48 8d 35 44 d1 8b ff 	lea    rsi,[rip+0xffffffffff8bd144]        # 350cc2 <_ZTSSt12bad_any_cast@@Base-0x3f506>` |
| `0xa93b7e` | `a93b7e:	48 89 df             	mov    rdi,rbx` |
| `0xa93b81` | `a93b81:	e8 f8 5e fe ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa93b86` | `a93b86:	4c 8b 35 b3 de e1 00 	mov    r14,QWORD PTR [rip+0xe1deb3]        # 18b1a40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@@Base+0xeaba80>` |
| `0xa93b8d` | `a93b8d:	4c 8d 3d 6c 04 d6 00 	lea    r15,[rip+0xd6046c]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>` |
| `0xa93b94` | `a93b94:	4c 89 f7             	mov    rdi,r14` |
| `0xa93b97` | `a93b97:	48 89 de             	mov    rsi,rbx` |
| `0xa93b9a` | `a93b9a:	4c 89 fa             	mov    rdx,r15` |
| `0xa93b9d` | `a93b9d:	e8 be a2 d5 00       	call   17ede60 <__cxa_atexit@plt>` |
| `0xa93ba2` | `a93ba2:	48 8d 1d d7 bd f5 00 	lea    rbx,[rip+0xf5bdd7]        # 19ef980 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x10b0>` |
| `0xa93ba9` | `a93ba9:	48 8d 35 1a c2 89 ff 	lea    rsi,[rip+0xffffffffff89c21a]        # 32fdca <_ZTSSt12bad_any_cast@@Base-0x603fe>` |
| `0xa9b515` | `a9b515:	41 57                	push   r15` |
| `0xa9b517` | `a9b517:	41 56                	push   r14` |
| `0xa9b519` | `a9b519:	41 55                	push   r13` |
| `0xa9b51b` | `a9b51b:	41 54                	push   r12` |
| `0xa9b51d` | `a9b51d:	53                   	push   rbx` |
| `0xa9b51e` | `a9b51e:	48 81 ec a8 01 00 00 	sub    rsp,0x1a8` |
| `0xa9b525` | `a9b525:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa9b52c` | `a9b52c:	00 00` |
| `0xa9b52e` | `a9b52e:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax` |
| `0xa9b535` | `a9b535:	00` |
| `0xa9b536` | `a9b536:	48 8d 1d 54 1b 00 00 	lea    rbx,[rip+0x1b54]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xa9b53d` | `a9b53d:	48 8d 0d 52 1b 00 00 	lea    rcx,[rip+0x1b52]        # a9d096 <JNI_OnUnload@@Base+0x24963>` |
| `0xa9b544` | `a9b544:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9b54b` | `a9b54b:	00` |
| `0xa9b54c` | `a9b54c:	4c 8d 84 24 30 01 00 	lea    r8,[rsp+0x130]` |
| `0xa9b553` | `a9b553:	00` |
| `0xa9b554` | `a9b554:	6a 01                	push   0x1` |
| `0xa9b556` | `a9b556:	41 5e                	pop    r14` |
| `0xa9b558` | `a9b558:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b55b` | `a9b55b:	48 89 de             	mov    rsi,rbx` |
| `0xa9b55e` | `a9b55e:	31 d2                	xor    edx,edx` |
| `0xa9b560` | `a9b560:	4d 89 f1             	mov    r9,r14` |
| `0xa9b563` | `a9b563:	e8 2c f2 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9b568` | `a9b568:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9b56f` | `a9b56f:	00` |
| `0xa9b570` | `a9b570:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b573` | `a9b573:	4c 89 fe             	mov    rsi,r15` |
| `0xa9b576` | `a9b576:	e8 bf f1 d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9b57b` | `a9b57b:	48 8d 35 ae 96 f5 00 	lea    rsi,[rip+0xf596ae]        # 19f4c30 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2cef>` |
| `0xa9b582` | `a9b582:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]` |
| `0xa9b589` | `a9b589:	00` |
| `0xa9b58a` | `a9b58a:	4c 89 ef             	mov    rdi,r13` |
| `0xa9b58d` | `a9b58d:	4c 89 e2             	mov    rdx,r12` |
| `0xa9b590` | `a9b590:	e8 35 ea d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9b595` | `a9b595:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b598` | `a9b598:	e8 4b f2 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b59d` | `a9b59d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9b5a1` | `a9b5a1:	e8 e0 2e 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b5a6` | `a9b5a6:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b5a9` | `a9b5a9:	e8 3a f2 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b5ae` | `a9b5ae:	48 8d 0d 11 1c 00 00 	lea    rcx,[rip+0x1c11]        # a9d1c6 <JNI_OnUnload@@Base+0x24a93>` |
| `0xa9b5b5` | `a9b5b5:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]` |
| `0xa9b5bc` | `a9b5bc:	00` |
| `0xa9b5bd` | `a9b5bd:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]` |
| `0xa9b5c4` | `a9b5c4:	00` |
| `0xa9b5c5` | `a9b5c5:	48 89 de             	mov    rsi,rbx` |
| `0xa9b5c8` | `a9b5c8:	31 d2                	xor    edx,edx` |
| `0xa9b5ca` | `a9b5ca:	4d 89 f1             	mov    r9,r14` |
| `0xa9b5cd` | `a9b5cd:	e8 c2 f1 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9b5d2` | `a9b5d2:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]` |
| `0xa9b5d9` | `a9b5d9:	00` |
| `0xa9b5da` | `a9b5da:	e8 17 e4 d3 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0xa9b5df` | `a9b5df:	48 8d 3d c2 95 f5 00 	lea    rdi,[rip+0xf595c2]        # 19f4ba8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2c67>` |
| `0xa9b5e6` | `a9b5e6:	e8 05 2b d5 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xa9b5eb` | `a9b5eb:	48 8d 3d 96 96 f5 00 	lea    rdi,[rip+0xf59696]        # 19f4c88 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2d47>` |
| `0xa9b5f2` | `a9b5f2:	e8 47 e9 d3 00       	call   17d9f3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d5f>` |
| `0xa9b5f7` | `a9b5f7:	89 c3                	mov    ebx,eax` |
| `0xa9b5f9` | `a9b5f9:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]` |
| `0xa9b600` | `a9b600:	00` |
| `0xa9b601` | `a9b601:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]` |
| `0xa9b608` | `a9b608:	00` |
| `0xa9b609` | `a9b609:	4c 89 f7             	mov    rdi,r14` |
| `0xa9b60c` | `a9b60c:	e8 29 f1 d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9b611` | `a9b611:	48 8d 35 70 96 f5 00 	lea    rsi,[rip+0xf59670]        # 19f4c88 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2d47>` |
| `0xa9b618` | `a9b618:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]` |
| `0xa9b61f` | `a9b61f:	00` |
| `0xa9b620` | `a9b620:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b623` | `a9b623:	4c 89 f2             	mov    rdx,r14` |
| `0xa9b626` | `a9b626:	e8 9f e9 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9b62b` | `a9b62b:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]` |
| `0xa9b632` | `a9b632:	00` |
| `0xa9b633` | `a9b633:	4c 89 fe             	mov    rsi,r15` |
| `0xa9b636` | `a9b636:	e8 73 e4 d3 00       	call   17d9aae <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x58cf>` |
| `0xa9b63b` | `a9b63b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xa9b63f` | `a9b63f:	e8 42 2e 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b644` | `a9b644:	4c 89 f7             	mov    rdi,r14` |
| `0xa9b647` | `a9b647:	e8 9c f1 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b64c` | `a9b64c:	48 8d 3d 55 95 f5 00 	lea    rdi,[rip+0xf59555]        # 19f4ba8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2c67>` |
| `0xa9b882` | `a9b882:	e8 af 40 c0 00       	call   169f936 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53aa2>` |
| `0xa9b887` | `a9b887:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]` |
| `0xa9b88e` | `a9b88e:	00` |
| `0xa9b88f` | `a9b88f:	e8 9e 3f c0 00       	call   169f832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5399e>` |
| `0xa9b894` | `a9b894:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]` |
| `0xa9b89b` | `a9b89b:	00` |
| `0xa9b89c` | `a9b89c:	e8 e5 2b 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b8a1` | `a9b8a1:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]` |
| `0xa9b8a8` | `a9b8a8:	00` |
| `0xa9b8a9` | `a9b8a9:	e8 3a ef d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b8ae` | `a9b8ae:	48 8d 1d dc 17 00 00 	lea    rbx,[rip+0x17dc]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xa9b8b5` | `a9b8b5:	48 8d 0d 4c 1b 00 00 	lea    rcx,[rip+0x1b4c]        # a9d408 <JNI_OnUnload@@Base+0x24cd5>` |
| `0xa9b8bc` | `a9b8bc:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9b8c3` | `a9b8c3:	00` |
| `0xa9b8c4` | `a9b8c4:	4c 8d 84 24 00 01 00 	lea    r8,[rsp+0x100]` |
| `0xa9b8cb` | `a9b8cb:	00` |
| `0xa9b8cc` | `a9b8cc:	6a 01                	push   0x1` |
| `0xa9b8ce` | `a9b8ce:	41 5e                	pop    r14` |
| `0xa9b8d0` | `a9b8d0:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b8d3` | `a9b8d3:	48 89 de             	mov    rsi,rbx` |
| `0xa9b8d6` | `a9b8d6:	31 d2                	xor    edx,edx` |
| `0xa9b8d8` | `a9b8d8:	4d 89 f1             	mov    r9,r14` |
| `0xa9b8db` | `a9b8db:	e8 b4 ee d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9b8e0` | `a9b8e0:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9b8e7` | `a9b8e7:	00` |
| `0xa9b8e8` | `a9b8e8:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b8eb` | `a9b8eb:	4c 89 fe             	mov    rsi,r15` |
| `0xa9b8ee` | `a9b8ee:	e8 47 ee d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9b8f3` | `a9b8f3:	48 8d 35 e6 93 f5 00 	lea    rsi,[rip+0xf593e6]        # 19f4ce0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2d9f>` |
| `0xa9b8fa` | `a9b8fa:	4c 8d ac 24 30 01 00 	lea    r13,[rsp+0x130]` |
| `0xa9b901` | `a9b901:	00` |
| `0xa9b902` | `a9b902:	4c 89 ef             	mov    rdi,r13` |
| `0xa9b905` | `a9b905:	4c 89 e2             	mov    rdx,r12` |
| `0xa9b908` | `a9b908:	e8 bd e6 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9b90d` | `a9b90d:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b910` | `a9b910:	e8 d3 ee d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b915` | `a9b915:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9b919` | `a9b919:	e8 68 2b 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b91e` | `a9b91e:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b921` | `a9b921:	e8 c2 ee d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b926` | `a9b926:	48 8d 0d b5 1b 00 00 	lea    rcx,[rip+0x1bb5]        # a9d4e2 <JNI_OnUnload@@Base+0x24daf>` |
| `0xa9b92d` | `a9b92d:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9b934` | `a9b934:	00` |
| `0xa9b935` | `a9b935:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]` |
| `0xa9b93c` | `a9b93c:	00` |
| `0xa9b93d` | `a9b93d:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b940` | `a9b940:	48 89 de             	mov    rsi,rbx` |
| `0xa9b943` | `a9b943:	31 d2                	xor    edx,edx` |
| `0xa9b945` | `a9b945:	4d 89 f1             	mov    r9,r14` |
| `0xa9b948` | `a9b948:	e8 47 ee d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| ... | truncated 70168 more |

## `callback body e99c54` `0xe99c54`

```text
  e99ba7:	eb 06                	jmp    e99baf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60fc5>
  e99ba9:	4d 89 ef             	mov    r15,r13
  e99bac:	4c 89 e1             	mov    rcx,r12
  e99baf:	49 83 c4 10          	add    r12,0x10
  e99bb3:	4c 01 f0             	add    rax,r14
  e99bb6:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  e99bb9:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  e99bbd:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  e99bc1:	4d 39 fd             	cmp    r13,r15
  e99bc4:	74 0f                	je     e99bd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60feb>
  e99bc6:	49 8b 7d f8          	mov    rdi,QWORD PTR [r13-0x8]
  e99bca:	49 83 c5 f0          	add    r13,0xfffffffffffffff0
  e99bce:	e8 b3 48 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99bd3:	eb ec                	jmp    e99bc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60fd7>
  e99bd5:	4d 85 ff             	test   r15,r15
  e99bd8:	74 08                	je     e99be2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ff8>
  e99bda:	4c 89 ff             	mov    rdi,r15
  e99bdd:	e8 3e 43 95 00       	call   17edf20 <_ZdlPv@plt>
  e99be2:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  e99be6:	48 83 c4 08          	add    rsp,0x8
  e99bea:	5b                   	pop    rbx
  e99beb:	41 5c                	pop    r12
  e99bed:	41 5d                	pop    r13
  e99bef:	41 5e                	pop    r14
  e99bf1:	41 5f                	pop    r15
  e99bf3:	5d                   	pop    rbp
  e99bf4:	c3                   	ret
  e99bf5:	e8 c6 a9 b6 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
  e99bfa:	e8 e0 1a be ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
  e99bff:	cc                   	int3
  e99c00:	48 8d 35 67 a4 53 ff 	lea    rsi,[rip+0xffffffffff53a467]        # 3d406e <_ZTSN5boost17bad_function_callE@@Base+0x13b4>
  e99c07:	48 8d 0d 72 a4 53 ff 	lea    rcx,[rip+0xffffffffff53a472]        # 3d4080 <_ZTSN5boost17bad_function_callE@@Base+0x13c6>
  e99c0e:	6a 0b                	push   0xb
  e99c10:	5a                   	pop    rdx
  e99c11:	6a 11                	push   0x11
  e99c13:	41 58                	pop    r8
  e99c15:	45 31 c9             	xor    r9d,r9d
  e99c18:	e9 6d d7 74 00       	jmp    15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e99c1d:	cc                   	int3
  e99c1e:	53                   	push   rbx
  e99c1f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  e99c22:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99c26:	48 85 db             	test   rbx,rbx
  e99c29:	74 27                	je     e99c52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61068>
  e99c2b:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  e99c32:	e8 0f 7b 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  e99c37:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
  e99c3b:	e8 2a 03 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e99c40:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  e99c44:	e8 21 03 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e99c49:	48 89 df             	mov    rdi,rbx
  e99c4c:	5b                   	pop    rbx
  e99c4d:	e9 ce 42 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e99c52:	5b                   	pop    rbx
  e99c53:	c3                   	ret
  e99c54:	41 56                	push   r14
  e99c56:	53                   	push   rbx
  e99c57:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99c5e:	48 89 fb             	mov    rbx,rdi
  e99c61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99c68:	00 00
  e99c6a:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99c71:	00
  e99c72:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e99c77:	4c 89 f7             	mov    rdi,r14
  e99c7a:	48 89 de             	mov    rsi,rbx
  e99c7d:	e8 ae 16 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e99c82:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e99c85:	48 85 f6             	test   rsi,rsi
  e99c88:	74 28                	je     e99cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x610c8>
  e99c8a:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99c8e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99c91:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99c96:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99c99:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99c9c:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
  e99ca1:	48 89 df             	mov    rdi,rbx
  e99ca4:	4c 89 f6             	mov    rsi,r14
  e99ca7:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e99caa:	4c 89 f7             	mov    rdi,r14
  e99cad:	e8 ac db 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99cb2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99cb7:	e8 ca 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99cbc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99cc3:	00 00
  e99cc5:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99ccc:	00
  e99ccd:	75 33                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>
  e99ccf:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e99cd6:	5b                   	pop    rbx
  e99cd7:	41 5e                	pop    r14
  e99cd9:	c3                   	ret
  e99cda:	48 89 c3             	mov    rbx,rax
  e99cdd:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99ce2:	e8 9f 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99ce7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99cee:	00 00
  e99cf0:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99cf7:	00
  e99cf8:	75 08                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>
  e99cfa:	48 89 df             	mov    rdi,rbx
  e99cfd:	e8 ce 5f bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99d02:	e8 a9 5d 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99d07:	55                   	push   rbp
  e99d08:	41 57                	push   r15
  e99d0a:	41 56                	push   r14
  e99d0c:	41 55                	push   r13
  e99d0e:	41 54                	push   r12
  e99d10:	53                   	push   rbx
  e99d11:	48 81 ec 08 12 00 00 	sub    rsp,0x1208
  e99d18:	4c 89 cb             	mov    rbx,r9
  e99d1b:	4d 89 c6             	mov    r14,r8
  e99d1e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99d25:	00 00
  e99d27:	48 89 84 24 00 12 00 	mov    QWORD PTR [rsp+0x1200],rax
  e99d2e:	00
  e99d2f:	48 b8 00 00 00 00 00 	movabs rax,0x1000000000000
  e99d36:	00 01 00
  e99d39:	4c 8d 84 24 f0 06 00 	lea    r8,[rsp+0x6f0]
  e99d40:	00
  e99d41:	49 89 40 e0          	mov    QWORD PTR [r8-0x20],rax
  e99d45:	66 41 83 60 e8 00    	and    WORD PTR [r8-0x18],0x0
  e99d4b:	48 89 8c 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rcx
  e99d52:	00
  e99d53:	41 83 60 ec 00       	and    DWORD PTR [r8-0x14],0x0
  e99d58:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
  e99d5d:	41 83 60 ef 00       	and    DWORD PTR [r8-0x11],0x0
  e99d62:	49 89 f4             	mov    r12,rsi
  e99d65:	41 c7 40 f4 00 01 00 	mov    DWORD PTR [r8-0xc],0x100
  e99d6c:	00
  e99d6d:	48 8d 05 4c 40 96 00 	lea    rax,[rip+0x96404c]        # 17fddc0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe60>
  e99d74:	49 89 00             	mov    QWORD PTR [r8],rax
  e99d77:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
  e99d7b:	49 83 60 30 00       	and    QWORD PTR [r8+0x30],0x0
  e99d80:	49 89 ff             	mov    r15,rdi
  e99d83:	41 83 60 37 00       	and    DWORD PTR [r8+0x37],0x0
  e99d88:	48 8b b4 24 68 13 00 	mov    rsi,QWORD PTR [rsp+0x1368]
  e99d8f:	00
  e99d90:	49 c7 40 40 96 00 00 	mov    QWORD PTR [r8+0x40],0x96
  e99d97:	00
  e99d98:	41 c6 40 48 01       	mov    BYTE PTR [r8+0x48],0x1
  e99d9d:	48 b8 00 00 00 00 0a 	movabs rax,0xa00000000
  e99da4:	00 00 00
  e99da7:	49 89 40 58          	mov    QWORD PTR [r8+0x58],rax
  e99dab:	41 83 60 50 00       	and    DWORD PTR [r8+0x50],0x0
  e99db0:	31 c0                	xor    eax,eax
  e99db2:	41 88 40 54          	mov    BYTE PTR [r8+0x54],al
  e99db6:	41 88 40 60          	mov    BYTE PTR [r8+0x60],al
  e99dba:	49 c7 40 68 50 00 00 	mov    QWORD PTR [r8+0x68],0x50
  e99dc1:	00
  e99dc2:	49 83 60 70 00       	and    QWORD PTR [r8+0x70],0x0
  e99dc7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99dca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99dd1:	00
  e99dd2:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e99dd5:	4c 89 a4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r12
  e99ddc:	00
  e99ddd:	6a 38                	push   0x38
  e99ddf:	5f                   	pop    rdi
  e99de0:	e8 1b 41 95 00       	call   17edf00 <_Znwm@plt>
  e99de5:	4c 8b a4 24 58 12 00 	mov    r12,QWORD PTR [rsp+0x1258]
  e99dec:	00
  e99ded:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e99df4:	00
  e99df5:	66 0f ef c9          	pxor   xmm1,xmm1
  e99df9:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
  e99dfe:	48 8d 0d 7b 72 96 00 	lea    rcx,[rip+0x96727b]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
  e99e05:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99e08:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
  e99e0f:	00
  e99e10:	66 0f 7f 8c 24 70 07 	movdqa XMMWORD PTR [rsp+0x770],xmm1
  e99e17:	00 00
  e99e19:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
  e99e1d:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
  e99e21:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  e99e26:	48 89 58 30          	mov    QWORD PTR [rax+0x30],rbx
  e99e2a:	31 ff                	xor    edi,edi
  e99e2c:	e8 55 46 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99e31:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e99e38:	00
  e99e39:	e8 48 46 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99e3e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e99e42:	48 8d 35 ee 9e 53 ff 	lea    rsi,[rip+0xffffffffff539eee]        # 3d3d37 <_ZTSN5boost17bad_function_callE@@Base+0x107d>
  e99e49:	48 8d 0d 00 9f 53 ff 	lea    rcx,[rip+0xffffffffff539f00]        # 3d3d50 <_ZTSN5boost17bad_function_callE@@Base+0x1096>
  e99e50:	6a 0b                	push   0xb
  e99e52:	5a                   	pop    rdx
  e99e53:	6a 40                	push   0x40
  e99e55:	41 58                	pop    r8
  e99e57:	45 31 c9             	xor    r9d,r9d
  e99e5a:	e8 2b d5 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e99e5f:	88 44 24 24          	mov    BYTE PTR [rsp+0x24],al
  e99e63:	f3 41 0f 6f 04 24    	movdqu xmm0,XMMWORD PTR [r12]
  e99e69:	66 0f 7f 84 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm0
  e99e70:	00 00
  e99e72:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  e99e77:	48 85 c0             	test   rax,rax
  e99e7a:	74 05                	je     e99e81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61297>
  e99e7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e99e81:	66 0f ef c0          	pxor   xmm0,xmm0
  e99e85:	66 0f 7f 84 24 70 01 	movdqa XMMWORD PTR [rsp+0x170],xmm0
  e99e8c:	00 00
  e99e8e:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
  e99e95:	00 00
  e99e97:	48 83 bc 24 40 12 00 	cmp    QWORD PTR [rsp+0x1240],0x0
  e99e9e:	00 00
  e99ea0:	74 73                	je     e99f15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6132b>
  e99ea2:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e99ea6:	48 8d 15 5f 93 53 ff 	lea    rdx,[rip+0xffffffffff53935f]        # 3d320c <_ZTSN5boost17bad_function_callE@@Base+0x552>
  e99ead:	4c 8d 05 6c 93 53 ff 	lea    r8,[rip+0xffffffffff53936c]        # 3d3220 <_ZTSN5boost17bad_function_callE@@Base+0x566>
  e99eb4:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e99ebb:	00
  e99ebc:	6a 0b                	push   0xb
  e99ebe:	59                   	pop    rcx
  e99ebf:	6a 11                	push   0x11
  e99ec1:	41 59                	pop    r9
  e99ec3:	48 89 df             	mov    rdi,rbx
  e99ec6:	e8 fd d5 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e99ecb:	40 b5 01             	mov    bpl,0x1
  e99ece:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
  e99ed2:	74 32                	je     e99f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6131c>
  e99ed4:	48 8d 35 60 93 53 ff 	lea    rsi,[rip+0xffffffffff539360]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e99edb:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99ee2:	00
  e99ee3:	e8 67 19 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99ee8:	84 c0                	test   al,al
  e99eea:	75 1a                	jne    e99f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6131c>
  e99eec:	48 8d 35 3f 93 53 ff 	lea    rsi,[rip+0xffffffffff53933f]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
  e99ef3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99efa:	00
  e99efb:	e8 4f 19 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99f00:	89 c5                	mov    ebp,eax
  e99f02:	40 80 f5 01          	xor    bpl,0x1
  e99f06:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f0d:	00
  e99f0e:	e8 1d ce c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e99f13:	eb 02                	jmp    e99f17 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6132d>
  e99f15:	31 ed                	xor    ebp,ebp
  e99f17:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e99f1b:	48 8d 15 5f 9b 53 ff 	lea    rdx,[rip+0xffffffffff539b5f]        # 3d3a81 <_ZTSN5boost17bad_function_callE@@Base+0xdc7>
  e99f22:	4c 8d 05 67 9b 53 ff 	lea    r8,[rip+0xffffffffff539b67]        # 3d3a90 <_ZTSN5boost17bad_function_callE@@Base+0xdd6>
  e99f29:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e99f30:	00
  e99f31:	6a 0b                	push   0xb
  e99f33:	59                   	pop    rcx
  e99f34:	6a 27                	push   0x27
```
## `callback destructor e99c1e` `0xe99c1e`

```text
  e99b6f:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]
  e99b73:	49 39 d5             	cmp    r13,rdx
  e99b76:	74 31                	je     e99ba9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60fbf>
  e99b78:	4c 89 e1             	mov    rcx,r12
  e99b7b:	49 8b 75 f0          	mov    rsi,QWORD PTR [r13-0x10]
  e99b7f:	48 89 71 f0          	mov    QWORD PTR [rcx-0x10],rsi
  e99b83:	49 8b 75 f8          	mov    rsi,QWORD PTR [r13-0x8]
  e99b87:	48 89 71 f8          	mov    QWORD PTR [rcx-0x8],rsi
  e99b8b:	48 83 c1 f0          	add    rcx,0xfffffffffffffff0
  e99b8f:	41 0f 11 45 f0       	movups XMMWORD PTR [r13-0x10],xmm0
  e99b94:	49 8d 75 f0          	lea    rsi,[r13-0x10]
  e99b98:	49 89 f5             	mov    r13,rsi
  e99b9b:	48 39 d6             	cmp    rsi,rdx
  e99b9e:	75 db                	jne    e99b7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60f91>
  e99ba0:	4c 8b 3b             	mov    r15,QWORD PTR [rbx]
  e99ba3:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]
  e99ba7:	eb 06                	jmp    e99baf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60fc5>
  e99ba9:	4d 89 ef             	mov    r15,r13
  e99bac:	4c 89 e1             	mov    rcx,r12
  e99baf:	49 83 c4 10          	add    r12,0x10
  e99bb3:	4c 01 f0             	add    rax,r14
  e99bb6:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  e99bb9:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  e99bbd:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  e99bc1:	4d 39 fd             	cmp    r13,r15
  e99bc4:	74 0f                	je     e99bd5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60feb>
  e99bc6:	49 8b 7d f8          	mov    rdi,QWORD PTR [r13-0x8]
  e99bca:	49 83 c5 f0          	add    r13,0xfffffffffffffff0
  e99bce:	e8 b3 48 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99bd3:	eb ec                	jmp    e99bc1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60fd7>
  e99bd5:	4d 85 ff             	test   r15,r15
  e99bd8:	74 08                	je     e99be2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60ff8>
  e99bda:	4c 89 ff             	mov    rdi,r15
  e99bdd:	e8 3e 43 95 00       	call   17edf20 <_ZdlPv@plt>
  e99be2:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
  e99be6:	48 83 c4 08          	add    rsp,0x8
  e99bea:	5b                   	pop    rbx
  e99beb:	41 5c                	pop    r12
  e99bed:	41 5d                	pop    r13
  e99bef:	41 5e                	pop    r14
  e99bf1:	41 5f                	pop    r15
  e99bf3:	5d                   	pop    rbp
  e99bf4:	c3                   	ret
  e99bf5:	e8 c6 a9 b6 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
  e99bfa:	e8 e0 1a be ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
  e99bff:	cc                   	int3
  e99c00:	48 8d 35 67 a4 53 ff 	lea    rsi,[rip+0xffffffffff53a467]        # 3d406e <_ZTSN5boost17bad_function_callE@@Base+0x13b4>
  e99c07:	48 8d 0d 72 a4 53 ff 	lea    rcx,[rip+0xffffffffff53a472]        # 3d4080 <_ZTSN5boost17bad_function_callE@@Base+0x13c6>
  e99c0e:	6a 0b                	push   0xb
  e99c10:	5a                   	pop    rdx
  e99c11:	6a 11                	push   0x11
  e99c13:	41 58                	pop    r8
  e99c15:	45 31 c9             	xor    r9d,r9d
  e99c18:	e9 6d d7 74 00       	jmp    15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e99c1d:	cc                   	int3
  e99c1e:	53                   	push   rbx
  e99c1f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  e99c22:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e99c26:	48 85 db             	test   rbx,rbx
  e99c29:	74 27                	je     e99c52 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61068>
  e99c2b:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  e99c32:	e8 0f 7b 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  e99c37:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
  e99c3b:	e8 2a 03 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e99c40:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  e99c44:	e8 21 03 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e99c49:	48 89 df             	mov    rdi,rbx
  e99c4c:	5b                   	pop    rbx
  e99c4d:	e9 ce 42 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e99c52:	5b                   	pop    rbx
  e99c53:	c3                   	ret
  e99c54:	41 56                	push   r14
  e99c56:	53                   	push   rbx
  e99c57:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99c5e:	48 89 fb             	mov    rbx,rdi
  e99c61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99c68:	00 00
  e99c6a:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99c71:	00
  e99c72:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e99c77:	4c 89 f7             	mov    rdi,r14
  e99c7a:	48 89 de             	mov    rsi,rbx
  e99c7d:	e8 ae 16 c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e99c82:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e99c85:	48 85 f6             	test   rsi,rsi
  e99c88:	74 28                	je     e99cb2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x610c8>
  e99c8a:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99c8e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99c91:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99c96:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99c99:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99c9c:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
  e99ca1:	48 89 df             	mov    rdi,rbx
  e99ca4:	4c 89 f6             	mov    rsi,r14
  e99ca7:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e99caa:	4c 89 f7             	mov    rdi,r14
  e99cad:	e8 ac db 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99cb2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99cb7:	e8 ca 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99cbc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99cc3:	00 00
  e99cc5:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99ccc:	00
  e99ccd:	75 33                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>
  e99ccf:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e99cd6:	5b                   	pop    rbx
  e99cd7:	41 5e                	pop    r14
  e99cd9:	c3                   	ret
  e99cda:	48 89 c3             	mov    rbx,rax
  e99cdd:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99ce2:	e8 9f 47 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99ce7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99cee:	00 00
  e99cf0:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99cf7:	00
  e99cf8:	75 08                	jne    e99d02 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61118>
  e99cfa:	48 89 df             	mov    rdi,rbx
  e99cfd:	e8 ce 5f bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99d02:	e8 a9 5d 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99d07:	55                   	push   rbp
  e99d08:	41 57                	push   r15
  e99d0a:	41 56                	push   r14
  e99d0c:	41 55                	push   r13
  e99d0e:	41 54                	push   r12
  e99d10:	53                   	push   rbx
  e99d11:	48 81 ec 08 12 00 00 	sub    rsp,0x1208
  e99d18:	4c 89 cb             	mov    rbx,r9
  e99d1b:	4d 89 c6             	mov    r14,r8
  e99d1e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99d25:	00 00
  e99d27:	48 89 84 24 00 12 00 	mov    QWORD PTR [rsp+0x1200],rax
  e99d2e:	00
  e99d2f:	48 b8 00 00 00 00 00 	movabs rax,0x1000000000000
  e99d36:	00 01 00
  e99d39:	4c 8d 84 24 f0 06 00 	lea    r8,[rsp+0x6f0]
  e99d40:	00
  e99d41:	49 89 40 e0          	mov    QWORD PTR [r8-0x20],rax
  e99d45:	66 41 83 60 e8 00    	and    WORD PTR [r8-0x18],0x0
  e99d4b:	48 89 8c 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rcx
  e99d52:	00
  e99d53:	41 83 60 ec 00       	and    DWORD PTR [r8-0x14],0x0
  e99d58:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx
  e99d5d:	41 83 60 ef 00       	and    DWORD PTR [r8-0x11],0x0
  e99d62:	49 89 f4             	mov    r12,rsi
  e99d65:	41 c7 40 f4 00 01 00 	mov    DWORD PTR [r8-0xc],0x100
  e99d6c:	00
  e99d6d:	48 8d 05 4c 40 96 00 	lea    rax,[rip+0x96404c]        # 17fddc0 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe60>
  e99d74:	49 89 00             	mov    QWORD PTR [r8],rax
  e99d77:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
  e99d7b:	49 83 60 30 00       	and    QWORD PTR [r8+0x30],0x0
  e99d80:	49 89 ff             	mov    r15,rdi
  e99d83:	41 83 60 37 00       	and    DWORD PTR [r8+0x37],0x0
  e99d88:	48 8b b4 24 68 13 00 	mov    rsi,QWORD PTR [rsp+0x1368]
  e99d8f:	00
  e99d90:	49 c7 40 40 96 00 00 	mov    QWORD PTR [r8+0x40],0x96
  e99d97:	00
  e99d98:	41 c6 40 48 01       	mov    BYTE PTR [r8+0x48],0x1
  e99d9d:	48 b8 00 00 00 00 0a 	movabs rax,0xa00000000
  e99da4:	00 00 00
  e99da7:	49 89 40 58          	mov    QWORD PTR [r8+0x58],rax
  e99dab:	41 83 60 50 00       	and    DWORD PTR [r8+0x50],0x0
  e99db0:	31 c0                	xor    eax,eax
  e99db2:	41 88 40 54          	mov    BYTE PTR [r8+0x54],al
  e99db6:	41 88 40 60          	mov    BYTE PTR [r8+0x60],al
  e99dba:	49 c7 40 68 50 00 00 	mov    QWORD PTR [r8+0x68],0x50
  e99dc1:	00
  e99dc2:	49 83 60 70 00       	and    QWORD PTR [r8+0x70],0x0
  e99dc7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99dca:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99dd1:	00
  e99dd2:	ff 50 10             	call   QWORD PTR [rax+0x10]
  e99dd5:	4c 89 a4 24 10 01 00 	mov    QWORD PTR [rsp+0x110],r12
  e99ddc:	00
  e99ddd:	6a 38                	push   0x38
  e99ddf:	5f                   	pop    rdi
  e99de0:	e8 1b 41 95 00       	call   17edf00 <_Znwm@plt>
  e99de5:	4c 8b a4 24 58 12 00 	mov    r12,QWORD PTR [rsp+0x1258]
  e99dec:	00
  e99ded:	4c 8b ac 24 48 12 00 	mov    r13,QWORD PTR [rsp+0x1248]
  e99df4:	00
  e99df5:	66 0f ef c9          	pxor   xmm1,xmm1
  e99df9:	f3 0f 7f 48 08       	movdqu XMMWORD PTR [rax+0x8],xmm1
  e99dfe:	48 8d 0d 7b 72 96 00 	lea    rcx,[rip+0x96727b]        # 1801080 <_ZTIN4asio22service_already_existsE@@Base+0x2868>
  e99e05:	48 89 08             	mov    QWORD PTR [rax],rcx
  e99e08:	0f 28 84 24 70 07 00 	movaps xmm0,XMMWORD PTR [rsp+0x770]
  e99e0f:	00
  e99e10:	66 0f 7f 8c 24 70 07 	movdqa XMMWORD PTR [rsp+0x770],xmm1
  e99e17:	00 00
  e99e19:	0f 11 40 18          	movups XMMWORD PTR [rax+0x18],xmm0
  e99e1d:	4c 89 70 28          	mov    QWORD PTR [rax+0x28],r14
  e99e21:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  e99e26:	48 89 58 30          	mov    QWORD PTR [rax+0x30],rbx
  e99e2a:	31 ff                	xor    edi,edi
  e99e2c:	e8 55 46 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99e31:	48 8b bc 24 78 07 00 	mov    rdi,QWORD PTR [rsp+0x778]
  e99e38:	00
  e99e39:	e8 48 46 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99e3e:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
  e99e42:	48 8d 35 ee 9e 53 ff 	lea    rsi,[rip+0xffffffffff539eee]        # 3d3d37 <_ZTSN5boost17bad_function_callE@@Base+0x107d>
  e99e49:	48 8d 0d 00 9f 53 ff 	lea    rcx,[rip+0xffffffffff539f00]        # 3d3d50 <_ZTSN5boost17bad_function_callE@@Base+0x1096>
  e99e50:	6a 0b                	push   0xb
  e99e52:	5a                   	pop    rdx
  e99e53:	6a 40                	push   0x40
  e99e55:	41 58                	pop    r8
  e99e57:	45 31 c9             	xor    r9d,r9d
  e99e5a:	e8 2b d5 74 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  e99e5f:	88 44 24 24          	mov    BYTE PTR [rsp+0x24],al
  e99e63:	f3 41 0f 6f 04 24    	movdqu xmm0,XMMWORD PTR [r12]
  e99e69:	66 0f 7f 84 24 00 01 	movdqa XMMWORD PTR [rsp+0x100],xmm0
  e99e70:	00 00
  e99e72:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
  e99e77:	48 85 c0             	test   rax,rax
  e99e7a:	74 05                	je     e99e81 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61297>
  e99e7c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e99e81:	66 0f ef c0          	pxor   xmm0,xmm0
  e99e85:	66 0f 7f 84 24 70 01 	movdqa XMMWORD PTR [rsp+0x170],xmm0
  e99e8c:	00 00
  e99e8e:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
  e99e95:	00 00
  e99e97:	48 83 bc 24 40 12 00 	cmp    QWORD PTR [rsp+0x1240],0x0
  e99e9e:	00 00
  e99ea0:	74 73                	je     e99f15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6132b>
  e99ea2:	49 8b 75 00          	mov    rsi,QWORD PTR [r13+0x0]
  e99ea6:	48 8d 15 5f 93 53 ff 	lea    rdx,[rip+0xffffffffff53935f]        # 3d320c <_ZTSN5boost17bad_function_callE@@Base+0x552>
  e99ead:	4c 8d 05 6c 93 53 ff 	lea    r8,[rip+0xffffffffff53936c]        # 3d3220 <_ZTSN5boost17bad_function_callE@@Base+0x566>
  e99eb4:	48 8d 9c 24 70 07 00 	lea    rbx,[rsp+0x770]
  e99ebb:	00
  e99ebc:	6a 0b                	push   0xb
  e99ebe:	59                   	pop    rcx
  e99ebf:	6a 11                	push   0x11
  e99ec1:	41 59                	pop    r9
  e99ec3:	48 89 df             	mov    rdi,rbx
  e99ec6:	e8 fd d5 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e99ecb:	40 b5 01             	mov    bpl,0x1
  e99ece:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
  e99ed2:	74 32                	je     e99f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6131c>
  e99ed4:	48 8d 35 60 93 53 ff 	lea    rsi,[rip+0xffffffffff539360]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e99edb:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99ee2:	00
  e99ee3:	e8 67 19 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99ee8:	84 c0                	test   al,al
  e99eea:	75 1a                	jne    e99f06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6131c>
  e99eec:	48 8d 35 3f 93 53 ff 	lea    rsi,[rip+0xffffffffff53933f]        # 3d3232 <_ZTSN5boost17bad_function_callE@@Base+0x578>
  e99ef3:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99efa:	00
```
## `package helper 17da794` `0x17da794`

```text
 17da6d5:	e8 d6 53 01 00       	call   17efab0 <__stack_chk_fail@plt>
 17da6da:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 17da6df:	0f 57 c0             	xorps  xmm0,xmm0
 17da6e2:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 17da6e5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 17da6e8:	48 89 07             	mov    QWORD PTR [rdi],rax
 17da6eb:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 17da6ef:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 17da6f3:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 17da6f7:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 17da6fb:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
 17da6fe:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
 17da702:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 17da706:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
 17da70a:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
 17da70e:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
 17da713:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
 17da717:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
 17da71b:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
 17da720:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
 17da724:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
 17da728:	48 83 66 30 00       	and    QWORD PTR [rsi+0x30],0x0
 17da72d:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
 17da731:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
 17da735:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
 17da739:	c3                   	ret
 17da73a:	41 56                	push   r14
 17da73c:	53                   	push   rbx
 17da73d:	50                   	push   rax
 17da73e:	49 89 f6             	mov    r14,rsi
 17da741:	48 89 fb             	mov    rbx,rdi
 17da744:	e8 ad 45 e1 ff       	call   15eecf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43427a>
 17da749:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 17da74d:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 17da751:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
 17da755:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 17da759:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
 17da75d:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 17da761:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 17da765:	6a 08                	push   0x8
 17da767:	5e                   	pop    rsi
 17da768:	e8 d3 50 01 00       	call   17ef840 <_ZnamSt11align_val_t@plt>
 17da76d:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 17da771:	49 8b 56 38          	mov    rdx,QWORD PTR [r14+0x38]
 17da775:	48 89 53 38          	mov    QWORD PTR [rbx+0x38],rdx
 17da779:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 17da77d:	48 89 c7             	mov    rdi,rax
 17da780:	ff 53 18             	call   QWORD PTR [rbx+0x18]
 17da783:	48 83 c4 08          	add    rsp,0x8
 17da787:	5b                   	pop    rbx
 17da788:	41 5e                	pop    r14
 17da78a:	c3                   	ret
 17da78b:	48 89 c7             	mov    rdi,rax
 17da78e:	e8 12 f3 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17da793:	cc                   	int3
 17da794:	41 57                	push   r15
 17da796:	41 56                	push   r14
 17da798:	53                   	push   rbx
 17da799:	4c 89 cb             	mov    rbx,r9
 17da79c:	4d 89 c6             	mov    r14,r8
 17da79f:	49 89 ff             	mov    r15,rdi
 17da7a2:	0f 57 c0             	xorps  xmm0,xmm0
 17da7a5:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 17da7aa:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 17da7ad:	48 89 77 18          	mov    QWORD PTR [rdi+0x18],rsi
 17da7b1:	48 89 57 20          	mov    QWORD PTR [rdi+0x20],rdx
 17da7b5:	48 89 4f 28          	mov    QWORD PTR [rdi+0x28],rcx
 17da7b9:	6a 08                	push   0x8
 17da7bb:	5e                   	pop    rsi
 17da7bc:	4c 89 cf             	mov    rdi,r9
 17da7bf:	e8 7c 50 01 00       	call   17ef840 <_ZnamSt11align_val_t@plt>
 17da7c4:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 17da7c8:	49 89 5f 38          	mov    QWORD PTR [r15+0x38],rbx
 17da7cc:	48 89 c7             	mov    rdi,rax
 17da7cf:	4c 89 f6             	mov    rsi,r14
 17da7d2:	48 89 da             	mov    rdx,rbx
 17da7d5:	41 ff 57 18          	call   QWORD PTR [r15+0x18]
 17da7d9:	5b                   	pop    rbx
 17da7da:	41 5e                	pop    r14
 17da7dc:	41 5f                	pop    r15
 17da7de:	c3                   	ret
 17da7df:	48 89 c7             	mov    rdi,rax
 17da7e2:	e8 be f2 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17da7e7:	cc                   	int3
 17da7e8:	53                   	push   rbx
 17da7e9:	48 89 fb             	mov    rbx,rdi
 17da7ec:	e8 11 00 00 00       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>
 17da7f1:	48 89 df             	mov    rdi,rbx
 17da7f4:	5b                   	pop    rbx
 17da7f5:	e9 82 4a e1 ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>
 17da7fa:	48 89 c7             	mov    rdi,rax
 17da7fd:	e8 a3 f2 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17da802:	53                   	push   rbx
 17da803:	48 89 fb             	mov    rbx,rdi
 17da806:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
 17da80a:	48 85 ff             	test   rdi,rdi
 17da80d:	74 1d                	je     17da82c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x664d>
 17da80f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 17da813:	48 85 c0             	test   rax,rax
 17da816:	74 06                	je     17da81e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x663f>
 17da818:	ff d0                	call   rax
 17da81a:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
 17da81e:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
 17da823:	6a 08                	push   0x8
 17da825:	5e                   	pop    rsi
 17da826:	5b                   	pop    rbx
 17da827:	e9 04 50 01 00       	jmp    17ef830 <_ZdaPvSt11align_val_t@plt>
 17da82c:	5b                   	pop    rbx
 17da82d:	c3                   	ret
 17da82e:	41 56                	push   r14
 17da830:	53                   	push   rbx
 17da831:	50                   	push   rax
 17da832:	48 89 fb             	mov    rbx,rdi
 17da835:	48 39 f7             	cmp    rdi,rsi
 17da838:	74 6c                	je     17da8a6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x66c7>
 17da83a:	49 89 f6             	mov    r14,rsi
 17da83d:	48 89 df             	mov    rdi,rbx
 17da840:	e8 bd ff ff ff       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>
 17da845:	48 89 df             	mov    rdi,rbx
 17da848:	e8 69 d8 ff ff       	call   17d80b6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3ed7>
 17da84d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 17da850:	48 89 03             	mov    QWORD PTR [rbx],rax
 17da853:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 17da857:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
 17da85b:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 17da85f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 17da863:	0f 57 c0             	xorps  xmm0,xmm0
 17da866:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 17da86a:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 17da86e:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 17da873:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 17da877:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
 17da87b:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
 17da880:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 17da884:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
 17da888:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
 17da88d:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 17da891:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
 17da895:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
 17da89a:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 17da89e:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
 17da8a2:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
 17da8a6:	48 89 d8             	mov    rax,rbx
 17da8a9:	48 83 c4 08          	add    rsp,0x8
 17da8ad:	5b                   	pop    rbx
 17da8ae:	41 5e                	pop    r14
 17da8b0:	c3                   	ret
 17da8b1:	48 89 c7             	mov    rdi,rax
 17da8b4:	e8 ec f1 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17da8b9:	cc                   	int3
 17da8ba:	53                   	push   rbx
 17da8bb:	48 83 ec 20          	sub    rsp,0x20
 17da8bf:	48 89 fb             	mov    rbx,rdi
 17da8c2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da8c9:	00 00
 17da8cb:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 17da8d0:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
 17da8d5:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
 17da8dc:	48 85 c0             	test   rax,rax
 17da8df:	74 05                	je     17da8e6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6707>
 17da8e1:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
 17da8e6:	48 89 e6             	mov    rsi,rsp
 17da8e9:	48 89 df             	mov    rdi,rbx
 17da8ec:	e8 6d 66 39 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>
 17da8f1:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 17da8f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da8fd:	00 00
 17da8ff:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 17da904:	75 33                	jne    17da939 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x675a>
 17da906:	e8 a7 3b 2c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 17da90b:	48 89 d8             	mov    rax,rbx
 17da90e:	48 83 c4 20          	add    rsp,0x20
 17da912:	5b                   	pop    rbx
 17da913:	c3                   	ret
 17da914:	48 89 c3             	mov    rbx,rax
 17da917:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 17da91c:	e8 91 3b 2c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 17da921:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da928:	00 00
 17da92a:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 17da92f:	75 08                	jne    17da939 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x675a>
 17da931:	48 89 df             	mov    rdi,rbx
 17da934:	e8 97 53 29 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 17da939:	e8 72 51 01 00       	call   17efab0 <__stack_chk_fail@plt>
 17da93e:	55                   	push   rbp
 17da93f:	41 57                	push   r15
 17da941:	41 56                	push   r14
 17da943:	41 55                	push   r13
 17da945:	41 54                	push   r12
 17da947:	53                   	push   rbx
 17da948:	48 81 ec 98 00 00 00 	sub    rsp,0x98
 17da94f:	49 89 fc             	mov    r12,rdi
 17da952:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da959:	00 00
 17da95b:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 17da962:	00
 17da963:	48 89 d5             	mov    rbp,rdx
 17da966:	48 29 f5             	sub    rbp,rsi
 17da969:	48 89 e8             	mov    rax,rbp
 17da96c:	48 c1 f8 04          	sar    rax,0x4
 17da970:	48 85 c0             	test   rax,rax
 17da973:	0f 8e 9a 02 00 00    	jle    17dac13 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a34>
 17da979:	49 89 f7             	mov    r15,rsi
 17da97c:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
 17da981:	4d 8d 6c 24 10       	lea    r13,[r12+0x10]
 17da986:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
 17da98b:	48 89 f1             	mov    rcx,rsi
 17da98e:	4c 29 f1             	sub    rcx,r14
 17da991:	48 c1 f9 04          	sar    rcx,0x4
 17da995:	48 39 c1             	cmp    rcx,rax
 17da998:	0f 8d 36 01 00 00    	jge    17daad4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x68f5>
 17da99e:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 17da9a2:	4c 89 f2             	mov    rdx,r14
 17da9a5:	48 29 fa             	sub    rdx,rdi
 17da9a8:	48 c1 fa 04          	sar    rdx,0x4
 17da9ac:	48 01 c2             	add    rdx,rax
 17da9af:	e8 ea eb 2d ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
 17da9b4:	4c 89 f2             	mov    rdx,r14
 17da9b7:	4c 89 e3             	mov    rbx,r12
 17da9ba:	49 2b 14 24          	sub    rdx,QWORD PTR [r12]
 17da9be:	48 c1 fa 04          	sar    rdx,0x4
 17da9c2:	4c 8d 64 24 48       	lea    r12,[rsp+0x48]
 17da9c7:	4c 89 e7             	mov    rdi,r12
 17da9ca:	48 89 c6             	mov    rsi,rax
 17da9cd:	4c 89 e9             	mov    rcx,r13
 17da9d0:	e8 3b d9 39 ff       	call   b78310 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc52b0>
 17da9d5:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
 17da9da:	48 01 c5             	add    rbp,rax
 17da9dd:	31 c9                	xor    ecx,ecx
 17da9df:	49 8b 14 0f          	mov    rdx,QWORD PTR [r15+rcx*1]
 17da9e3:	48 89 14 08          	mov    QWORD PTR [rax+rcx*1],rdx
 17da9e7:	49 8b 54 0f 08       	mov    rdx,QWORD PTR [r15+rcx*1+0x8]
 17da9ec:	48 89 54 08 08       	mov    QWORD PTR [rax+rcx*1+0x8],rdx
 17da9f1:	48 85 d2             	test   rdx,rdx
 17da9f4:	74 05                	je     17da9fb <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x681c>
 17da9f6:	f0 48 ff 42 10       	lock inc QWORD PTR [rdx+0x10]
 17da9fb:	48 8d 14 08          	lea    rdx,[rax+rcx*1]
 17da9ff:	48 83 c1 10          	add    rcx,0x10
 17daa03:	48 83 c2 10          	add    rdx,0x10
 17daa07:	48 39 ea             	cmp    rdx,rbp
 17daa0a:	75 d3                	jne    17da9df <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6800>
 17daa0c:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
 17daa11:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 17daa16:	49 89 dc             	mov    r12,rbx
 17daa19:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
```
## `post-package transformer e994ce` `0xe994ce`

```text
  e99409:	5b                   	pop    rbx
  e9940a:	c3                   	ret
  e9940b:	cc                   	int3
  e9940c:	41 56                	push   r14
  e9940e:	53                   	push   rbx
  e9940f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e99416:	48 89 fb             	mov    rbx,rdi
  e99419:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99420:	00 00
  e99422:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e99429:	00
  e9942a:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e9942f:	4c 89 f7             	mov    rdi,r14
  e99432:	48 89 de             	mov    rsi,rbx
  e99435:	e8 f6 1e c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e9943a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9943d:	48 85 f6             	test   rsi,rsi
  e99440:	74 27                	je     e99469 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6087f>
  e99442:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99446:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99449:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e9944e:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e99451:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99454:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e99459:	48 89 df             	mov    rdi,rbx
  e9945c:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e9945f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99464:	e8 f5 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e99469:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e9946e:	e8 13 50 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99473:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9947a:	00 00
  e9947c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99483:	00
  e99484:	75 42                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e99486:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9948d:	5b                   	pop    rbx
  e9948e:	41 5e                	pop    r14
  e99490:	c3                   	ret
  e99491:	48 89 c3             	mov    rbx,rax
  e99494:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99499:	e8 c0 e3 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9949e:	eb 03                	jmp    e994a3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608b9>
  e994a0:	48 89 c3             	mov    rbx,rax
  e994a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e994a8:	e8 d9 4f c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e994ad:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994b4:	00 00
  e994b6:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e994bd:	00
  e994be:	75 08                	jne    e994c8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x608de>
  e994c0:	48 89 df             	mov    rdi,rbx
  e994c3:	e8 08 68 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e994c8:	e8 e3 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e994cd:	cc                   	int3
  e994ce:	41 57                	push   r15
  e994d0:	41 56                	push   r14
  e994d2:	41 55                	push   r13
  e994d4:	41 54                	push   r12
  e994d6:	53                   	push   rbx
  e994d7:	48 83 ec 30          	sub    rsp,0x30
  e994db:	49 89 f6             	mov    r14,rsi
  e994de:	48 89 fb             	mov    rbx,rdi
  e994e1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e994e8:	00 00
  e994ea:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  e994ef:	4c 8b 7f 08          	mov    r15,QWORD PTR [rdi+0x8]
  e994f3:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]
  e994f7:	49 39 f7             	cmp    r15,rsi
  e994fa:	73 15                	jae    e99511 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60927>
  e994fc:	4c 89 ff             	mov    rdi,r15
  e994ff:	4c 89 f6             	mov    rsi,r14
  e99502:	e8 37 05 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99507:	49 83 c7 10          	add    r15,0x10
  e9950b:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e9950f:	eb 63                	jmp    e99574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6098a>
  e99511:	4c 8d 63 10          	lea    r12,[rbx+0x10]
  e99515:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  e99518:	49 29 ff             	sub    r15,rdi
  e9951b:	49 c1 ff 04          	sar    r15,0x4
  e9951f:	49 ff c7             	inc    r15
  e99522:	4c 89 fa             	mov    rdx,r15
  e99525:	e8 74 00 c2 ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
  e9952a:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
  e9952e:	48 2b 13             	sub    rdx,QWORD PTR [rbx]
  e99531:	48 c1 fa 04          	sar    rdx,0x4
  e99535:	49 89 e5             	mov    r13,rsp
  e99538:	4c 89 ef             	mov    rdi,r13
  e9953b:	48 89 c6             	mov    rsi,rax
  e9953e:	4c 89 e1             	mov    rcx,r12
  e99541:	e8 94 00 c2 ff       	call   ab95da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x657a>
  e99546:	4d 8b 7d 10          	mov    r15,QWORD PTR [r13+0x10]
  e9954a:	4c 89 ff             	mov    rdi,r15
  e9954d:	4c 89 f6             	mov    rsi,r14
  e99550:	e8 e9 04 94 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
  e99555:	49 83 c7 10          	add    r15,0x10
  e99559:	4d 89 7d 10          	mov    QWORD PTR [r13+0x10],r15
  e9955d:	48 89 df             	mov    rdi,rbx
  e99560:	4c 89 ee             	mov    rsi,r13
  e99563:	e8 e6 3b c2 ff       	call   abd14e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa0ee>
  e99568:	4c 8b 7b 08          	mov    r15,QWORD PTR [rbx+0x8]
  e9956c:	4c 89 ef             	mov    rdi,r13
  e9956f:	e8 3c 01 c2 ff       	call   ab96b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x6650>
  e99574:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
  e99578:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9957f:	00 00
  e99581:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  e99586:	75 0e                	jne    e99596 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x609ac>
  e99588:	48 83 c4 30          	add    rsp,0x30
  e9958c:	5b                   	pop    rbx
  e9958d:	41 5c                	pop    r12
  e9958f:	41 5d                	pop    r13
  e99591:	41 5e                	pop    r14
  e99593:	41 5f                	pop    r15
  e99595:	c3                   	ret
  e99596:	e8 15 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9959b:	cc                   	int3
  e9959c:	41 56                	push   r14
  e9959e:	53                   	push   rbx
  e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e995a6:	48 89 fb             	mov    rbx,rdi
  e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e995b0:	00 00
  e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e995b9:	00
  e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e995bf:	4c 89 f7             	mov    rdi,r14
  e995c2:	48 89 de             	mov    rsi,rbx
  e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e995cd:	48 85 f6             	test   rsi,rsi
  e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>
  e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e995e9:	48 89 df             	mov    rdi,rbx
  e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995f4:	e8 65 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e995fe:	e8 83 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99603:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9960a:	00 00
  e9960c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99613:	00
  e99614:	75 42                	jne    e99658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a6e>
  e99616:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9961d:	5b                   	pop    rbx
  e9961e:	41 5e                	pop    r14
  e99620:	c3                   	ret
  e99621:	48 89 c3             	mov    rbx,rax
  e99624:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99629:	e8 30 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9962e:	eb 03                	jmp    e99633 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a49>
  e99630:	48 89 c3             	mov    rbx,rax
  e99633:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99638:	e8 49 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9963d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99644:	00 00
  e99646:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e9964d:	00
  e9964e:	75 08                	jne    e99658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a6e>
  e99650:	48 89 df             	mov    rdi,rbx
  e99653:	e8 78 66 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99658:	e8 53 64 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9965d:	cc                   	int3
  e9965e:	41 56                	push   r14
  e99660:	53                   	push   rbx
  e99661:	50                   	push   rax
  e99662:	48 89 f3             	mov    rbx,rsi
  e99665:	49 89 fe             	mov    r14,rdi
  e99668:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
  e9966c:	74 1c                	je     e9968a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60aa0>
  e9966e:	4c 89 f7             	mov    rdi,r14
  e99671:	e8 64 3a c2 ff       	call   abd0da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa07a>
  e99676:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  e99679:	e8 a2 48 95 00       	call   17edf20 <_ZdlPv@plt>
  e9967e:	0f 57 c0             	xorps  xmm0,xmm0
  e99681:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
  e99685:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  e9968a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e9968d:	49 89 06             	mov    QWORD PTR [r14],rax
  e99690:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  e99694:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  e99698:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  e9969c:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  e996a0:	0f 57 c0             	xorps  xmm0,xmm0
  e996a3:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  e996a6:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  e996ab:	48 83 c4 08          	add    rsp,0x8
  e996af:	5b                   	pop    rbx
  e996b0:	41 5e                	pop    r14
  e996b2:	c3                   	ret
  e996b3:	cc                   	int3
  e996b4:	53                   	push   rbx
  e996b5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  e996b8:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e996bc:	48 85 db             	test   rbx,rbx
  e996bf:	74 26                	je     e996e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60afd>
  e996c1:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
  e996c8:	e8 79 80 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  e996cd:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
  e996d1:	e8 94 08 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e996d6:	48 89 df             	mov    rdi,rbx
  e996d9:	e8 88 07 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e996de:	48 89 df             	mov    rdi,rbx
  e996e1:	5b                   	pop    rbx
  e996e2:	e9 39 48 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e996e7:	5b                   	pop    rbx
  e996e8:	c3                   	ret
  e996e9:	cc                   	int3
  e996ea:	41 57                	push   r15
  e996ec:	41 56                	push   r14
  e996ee:	53                   	push   rbx
  e996ef:	48 81 ec 70 0a 00 00 	sub    rsp,0xa70
  e996f6:	48 89 fb             	mov    rbx,rdi
  e996f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99700:	00 00
  e99702:	48 89 84 24 68 0a 00 	mov    QWORD PTR [rsp+0xa68],rax
  e99709:	00
  e9970a:	49 89 e6             	mov    r14,rsp
  e9970d:	4c 89 f7             	mov    rdi,r14
  e99710:	48 89 de             	mov    rsi,rbx
  e99713:	e8 18 1c c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e99718:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9971b:	48 85 f6             	test   rsi,rsi
  e9971e:	74 4b                	je     e9976b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60b81>
  e99720:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99724:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99727:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  e9972c:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e9972f:	4c 8d b4 24 38 05 00 	lea    r14,[rsp+0x538]
  e99736:	00
  e99737:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
  e9973c:	4c 89 f7             	mov    rdi,r14
  e9973f:	4c 89 fe             	mov    rsi,r15
  e99742:	e8 9b 26 01 00       	call   eabde2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x731f8>
  e99747:	41 83 a6 28 05 00 00 	and    DWORD PTR [r14+0x528],0x0
  e9974e:	00
  e9974f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99752:	48 89 df             	mov    rdi,rbx
  e99755:	4c 89 f6             	mov    rsi,r14
```
## `installer/helper e9965e` `0xe9965e`

```text
  e99595:	c3                   	ret
  e99596:	e8 15 65 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9959b:	cc                   	int3
  e9959c:	41 56                	push   r14
  e9959e:	53                   	push   rbx
  e9959f:	48 81 ec 48 05 00 00 	sub    rsp,0x548
  e995a6:	48 89 fb             	mov    rbx,rdi
  e995a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e995b0:	00 00
  e995b2:	48 89 84 24 40 05 00 	mov    QWORD PTR [rsp+0x540],rax
  e995b9:	00
  e995ba:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
  e995bf:	4c 89 f7             	mov    rdi,r14
  e995c2:	48 89 de             	mov    rsi,rbx
  e995c5:	e8 66 1d c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e995ca:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e995cd:	48 85 f6             	test   rsi,rsi
  e995d0:	74 27                	je     e995f9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a0f>
  e995d2:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e995d6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e995d9:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995de:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e995e1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e995e4:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
  e995e9:	48 89 df             	mov    rdi,rbx
  e995ec:	ff 50 30             	call   QWORD PTR [rax+0x30]
  e995ef:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e995f4:	e8 65 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e995f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e995fe:	e8 83 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99603:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9960a:	00 00
  e9960c:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e99613:	00
  e99614:	75 42                	jne    e99658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a6e>
  e99616:	48 81 c4 48 05 00 00 	add    rsp,0x548
  e9961d:	5b                   	pop    rbx
  e9961e:	41 5e                	pop    r14
  e99620:	c3                   	ret
  e99621:	48 89 c3             	mov    rbx,rax
  e99624:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99629:	e8 30 e2 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9962e:	eb 03                	jmp    e99633 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a49>
  e99630:	48 89 c3             	mov    rbx,rax
  e99633:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99638:	e8 49 4e c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9963d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99644:	00 00
  e99646:	48 3b 84 24 40 05 00 	cmp    rax,QWORD PTR [rsp+0x540]
  e9964d:	00
  e9964e:	75 08                	jne    e99658 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60a6e>
  e99650:	48 89 df             	mov    rdi,rbx
  e99653:	e8 78 66 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99658:	e8 53 64 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e9965d:	cc                   	int3
  e9965e:	41 56                	push   r14
  e99660:	53                   	push   rbx
  e99661:	50                   	push   rax
  e99662:	48 89 f3             	mov    rbx,rsi
  e99665:	49 89 fe             	mov    r14,rdi
  e99668:	48 83 3f 00          	cmp    QWORD PTR [rdi],0x0
  e9966c:	74 1c                	je     e9968a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60aa0>
  e9966e:	4c 89 f7             	mov    rdi,r14
  e99671:	e8 64 3a c2 ff       	call   abd0da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa07a>
  e99676:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
  e99679:	e8 a2 48 95 00       	call   17edf20 <_ZdlPv@plt>
  e9967e:	0f 57 c0             	xorps  xmm0,xmm0
  e99681:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
  e99685:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  e9968a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e9968d:	49 89 06             	mov    QWORD PTR [r14],rax
  e99690:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
  e99694:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
  e99698:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  e9969c:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  e996a0:	0f 57 c0             	xorps  xmm0,xmm0
  e996a3:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  e996a6:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
  e996ab:	48 83 c4 08          	add    rsp,0x8
  e996af:	5b                   	pop    rbx
  e996b0:	41 5e                	pop    r14
  e996b2:	c3                   	ret
  e996b3:	cc                   	int3
  e996b4:	53                   	push   rbx
  e996b5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  e996b8:	48 83 27 00          	and    QWORD PTR [rdi],0x0
  e996bc:	48 85 db             	test   rbx,rbx
  e996bf:	74 26                	je     e996e7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60afd>
  e996c1:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
  e996c8:	e8 79 80 92 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  e996cd:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
  e996d1:	e8 94 08 be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e996d6:	48 89 df             	mov    rdi,rbx
  e996d9:	e8 88 07 94 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  e996de:	48 89 df             	mov    rdi,rbx
  e996e1:	5b                   	pop    rbx
  e996e2:	e9 39 48 95 00       	jmp    17edf20 <_ZdlPv@plt>
  e996e7:	5b                   	pop    rbx
  e996e8:	c3                   	ret
  e996e9:	cc                   	int3
  e996ea:	41 57                	push   r15
  e996ec:	41 56                	push   r14
  e996ee:	53                   	push   rbx
  e996ef:	48 81 ec 70 0a 00 00 	sub    rsp,0xa70
  e996f6:	48 89 fb             	mov    rbx,rdi
  e996f9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99700:	00 00
  e99702:	48 89 84 24 68 0a 00 	mov    QWORD PTR [rsp+0xa68],rax
  e99709:	00
  e9970a:	49 89 e6             	mov    r14,rsp
  e9970d:	4c 89 f7             	mov    rdi,r14
  e99710:	48 89 de             	mov    rsi,rbx
  e99713:	e8 18 1c c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e99718:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  e9971b:	48 85 f6             	test   rsi,rsi
  e9971e:	74 4b                	je     e9976b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60b81>
  e99720:	48 8b 5b 10          	mov    rbx,QWORD PTR [rbx+0x10]
  e99724:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e99727:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  e9972c:	ff 50 78             	call   QWORD PTR [rax+0x78]
  e9972f:	4c 8d b4 24 38 05 00 	lea    r14,[rsp+0x538]
  e99736:	00
  e99737:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
  e9973c:	4c 89 f7             	mov    rdi,r14
  e9973f:	4c 89 fe             	mov    rsi,r15
  e99742:	e8 9b 26 01 00       	call   eabde2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x731f8>
  e99747:	41 83 a6 28 05 00 00 	and    DWORD PTR [r14+0x528],0x0
  e9974e:	00
  e9974f:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e99752:	48 89 df             	mov    rdi,rbx
  e99755:	4c 89 f6             	mov    rsi,r14
  e99758:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e9975b:	4c 89 f7             	mov    rdi,r14
  e9975e:	e8 0b 26 01 00       	call   eabd6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73184>
  e99763:	4c 89 ff             	mov    rdi,r15
  e99766:	e8 f3 e0 00 00       	call   ea785e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6ec74>
  e9976b:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  e99770:	e8 11 4d c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99775:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9977c:	00 00
  e9977e:	48 3b 84 24 68 0a 00 	cmp    rax,QWORD PTR [rsp+0xa68]
  e99785:	00
  e99786:	75 35                	jne    e997bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60bd3>
  e99788:	48 81 c4 70 0a 00 00 	add    rsp,0xa70
  e9978f:	5b                   	pop    rbx
  e99790:	41 5e                	pop    r14
  e99792:	41 5f                	pop    r15
  e99794:	c3                   	ret
  e99795:	48 89 c3             	mov    rbx,rax
  e99798:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  e9979d:	e8 e4 4c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e997a2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e997a9:	00 00
  e997ab:	48 3b 84 24 68 0a 00 	cmp    rax,QWORD PTR [rsp+0xa68]
  e997b2:	00
  e997b3:	75 08                	jne    e997bd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60bd3>
  e997b5:	48 89 df             	mov    rdi,rbx
  e997b8:	e8 13 65 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e997bd:	e8 ee 62 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e997c2:	41 57                	push   r15
  e997c4:	41 56                	push   r14
  e997c6:	53                   	push   rbx
  e997c7:	48 81 ec 50 05 00 00 	sub    rsp,0x550
  e997ce:	48 89 f3             	mov    rbx,rsi
  e997d1:	49 89 fe             	mov    r14,rdi
  e997d4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e997db:	00 00
  e997dd:	48 89 84 24 48 05 00 	mov    QWORD PTR [rsp+0x548],rax
  e997e4:	00
  e997e5:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
  e997ea:	4c 89 ff             	mov    rdi,r15
  e997ed:	4c 89 f6             	mov    rsi,r14
  e997f0:	e8 3b 1b c1 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  e997f5:	49 83 3f 00          	cmp    QWORD PTR [r15],0x0
  e997f9:	74 34                	je     e9982f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60c45>
  e997fb:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
  e997ff:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  e99804:	48 89 de             	mov    rsi,rbx
  e99807:	e8 f4 0f 7d 00       	call   166a800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e96c>
  e9980c:	48 8d 5c 24 18       	lea    rbx,[rsp+0x18]
  e99811:	c7 83 28 05 00 00 01 	mov    DWORD PTR [rbx+0x528],0x1
  e99818:	00 00 00
  e9981b:	49 8b 06             	mov    rax,QWORD PTR [r14]
  e9981e:	4c 89 f7             	mov    rdi,r14
  e99821:	48 89 de             	mov    rsi,rbx
  e99824:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e99827:	48 89 df             	mov    rdi,rbx
  e9982a:	e8 3f 25 01 00       	call   eabd6e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73184>
  e9982f:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99834:	e8 4d 4c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99839:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e99840:	00 00
  e99842:	48 3b 84 24 48 05 00 	cmp    rax,QWORD PTR [rsp+0x548]
  e99849:	00
  e9984a:	75 35                	jne    e99881 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60c97>
  e9984c:	48 81 c4 50 05 00 00 	add    rsp,0x550
  e99853:	5b                   	pop    rbx
  e99854:	41 5e                	pop    r14
  e99856:	41 5f                	pop    r15
  e99858:	c3                   	ret
  e99859:	48 89 c3             	mov    rbx,rax
  e9985c:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  e99861:	e8 20 4c c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e99866:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  e9986d:	00 00
  e9986f:	48 3b 84 24 48 05 00 	cmp    rax,QWORD PTR [rsp+0x548]
  e99876:	00
  e99877:	75 08                	jne    e99881 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x60c97>
  e99879:	48 89 df             	mov    rdi,rbx
  e9987c:	e8 4f 64 bd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  e99881:	e8 2a 62 95 00       	call   17efab0 <__stack_chk_fail@plt>
  e99886:	41 57                	push   r15
  e99888:	41 56                	push   r14
  e9988a:	53                   	push   rbx
  e9988b:	48 89 fb             	mov    rbx,rdi
  e9988e:	bf a8 00 00 00       	mov    edi,0xa8
  e99893:	e8 68 46 95 00       	call   17edf00 <_Znwm@plt>
  e99898:	49 89 c6             	mov    r14,rax
  e9989b:	0f 57 c0             	xorps  xmm0,xmm0
  e9989e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  e998a2:	48 8d 05 1f 7b 99 00 	lea    rax,[rip+0x997b1f]        # 18313c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3360>
  e998a9:	49 89 06             	mov    QWORD PTR [r14],rax
  e998ac:	4d 8d 7e 18          	lea    r15,[r14+0x18]
  e998b0:	48 8d 05 21 a6 9a 00 	lea    rax,[rip+0x9aa621]        # 1843ed8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5c0>
  e998b7:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  e998bb:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0
  e998c0:	41 0f 11 46 30       	movups XMMWORD PTR [r14+0x30],xmm0
  e998c5:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
  e998ca:	49 8d 7e 50          	lea    rdi,[r14+0x50]
  e998ce:	e8 bb e9 c8 ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  e998d3:	4c 89 3b             	mov    QWORD PTR [rbx],r15
  e998d6:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  e998da:	5b                   	pop    rbx
  e998db:	41 5e                	pop    r14
  e998dd:	41 5f                	pop    r15
  e998df:	c3                   	ret
  e998e0:	41 57                	push   r15
  e998e2:	41 56                	push   r14
  e998e4:	41 55                	push   r13
  e998e6:	41 54                	push   r12
  e998e8:	53                   	push   rbx
  e998e9:	49 89 f7             	mov    r15,rsi
  e998ec:	48 89 fb             	mov    rbx,rdi
  e998ef:	e8 d0 18 01 00       	call   eab1c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x725da>
  e998f4:	4c 8d 73 38          	lea    r14,[rbx+0x38]
```
## `builder candidate e9207e` `0xe9207e`

```text
  e91f94:	00
  e91f95:	e8 ec c4 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91f9a:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
  e91fa1:	00
  e91fa2:	e8 41 88 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e91fa7:	48 8b bc 24 98 09 00 	mov    rdi,QWORD PTR [rsp+0x998]
  e91fae:	00
  e91faf:	e8 d2 c4 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e91fb4:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
  e91fbb:	00
  e91fbc:	48 8d b4 24 60 04 00 	lea    rsi,[rsp+0x460]
  e91fc3:	00
  e91fc4:	e8 c7 82 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e91fc9:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
  e91fd0:	00
  e91fd1:	40 8a 68 01          	mov    bpl,BYTE PTR [rax+0x1]
  e91fd5:	48 8b 9c 24 48 03 00 	mov    rbx,QWORD PTR [rsp+0x348]
  e91fdc:	00
  e91fdd:	48 8d 35 d2 8f 4f ff 	lea    rsi,[rip+0xffffffffff4f8fd2]        # 38afb6 <_ZTSSt12bad_any_cast@@Base-0x5212>
  e91fe4:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  e91feb:	00
  e91fec:	e8 8d 7a be ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  e91ff1:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
  e91ff6:	48 8b b4 24 00 05 00 	mov    rsi,QWORD PTR [rsp+0x500]
  e91ffd:	00
  e91ffe:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
  e92005:	00
  e92006:	48 8d 94 24 a0 00 00 	lea    rdx,[rsp+0xa0]
  e9200d:	00
  e9200e:	e8 a7 b0 c1 ff       	call   aad0ba <JNI_OnUnload@@Base+0x34987>
  e92013:	48 8d 05 c6 c8 97 00 	lea    rax,[rip+0x97c8c6]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
  e9201a:	48 8d 8c 24 00 08 00 	lea    rcx,[rsp+0x800]
  e92021:	00
  e92022:	48 89 01             	mov    QWORD PTR [rcx],rax
  e92025:	48 8b 05 74 fa a1 00 	mov    rax,QWORD PTR [rip+0xa1fa74]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
  e9202c:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
  e92030:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  e92034:	bf 60 01 00 00       	mov    edi,0x160
  e92039:	e8 c2 be 95 00       	call   17edf00 <_Znwm@plt>
  e9203e:	49 89 c4             	mov    r12,rax
  e92041:	66 0f ef c0          	pxor   xmm0,xmm0
  e92045:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  e9204a:	48 8d 05 57 f9 99 00 	lea    rax,[rip+0x99f957]        # 18319a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3940>
  e92051:	49 89 04 24          	mov    QWORD PTR [r12],rax
  e92055:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
  e9205c:	00
  e9205d:	48 8d b4 24 30 08 00 	lea    rsi,[rsp+0x830]
  e92064:	00
  e92065:	e8 8e 71 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9206a:	48 83 a4 24 80 08 00 	and    QWORD PTR [rsp+0x880],0x0
  e92071:	00 00
  e92073:	6a 40                	push   0x40
  e92075:	5f                   	pop    rdi
  e92076:	e8 85 be 95 00       	call   17edf00 <_Znwm@plt>
  e9207b:	49 89 c7             	mov    r15,rax
  e9207e:	48 8d 05 5b f9 99 00 	lea    rax,[rip+0x99f95b]        # 18319e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x3978>
  e92085:	49 89 07             	mov    QWORD PTR [r15],rax
  e92088:	4c 89 ff             	mov    rdi,r15
  e9208b:	48 83 c7 10          	add    rdi,0x10
  e9208f:	48 8d b4 24 90 09 00 	lea    rsi,[rsp+0x990]
  e92096:	00
  e92097:	e8 5c 71 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e9209c:	48 8d b4 24 60 08 00 	lea    rsi,[rsp+0x860]
  e920a3:	00
  e920a4:	4c 89 7e 20          	mov    QWORD PTR [rsi+0x20],r15
  e920a8:	48 8d 05 79 f9 99 00 	lea    rax,[rip+0x99f979]        # 1831a28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x39c0>
  e920af:	48 89 84 24 60 09 00 	mov    QWORD PTR [rsp+0x960],rax
  e920b6:	00
  e920b7:	40 88 ac 24 68 09 00 	mov    BYTE PTR [rsp+0x968],bpl
  e920be:	00
  e920bf:	4c 89 b4 24 80 09 00 	mov    QWORD PTR [rsp+0x980],r14
  e920c6:	00
  e920c7:	48 8d 05 9a 62 9e 00 	lea    rax,[rip+0x9e629a]        # 1878368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x34a50>
  e920ce:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
  e920d3:	41 c6 44 24 28 00    	mov    BYTE PTR [r12+0x28],0x0
  e920d9:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
  e920df:	4d 8d 7c 24 40       	lea    r15,[r12+0x40]
  e920e4:	66 41 83 64 24 3c 00 	and    WORD PTR [r12+0x3c],0x0
  e920eb:	4c 89 ff             	mov    rdi,r15
  e920ee:	e8 05 71 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e920f3:	49 8d 6c 24 70       	lea    rbp,[r12+0x70]
  e920f8:	48 89 ef             	mov    rdi,rbp
  e920fb:	4c 89 f6             	mov    rsi,r14
  e920fe:	e8 f5 70 cf ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
  e92103:	48 8b 84 24 d8 08 00 	mov    rax,QWORD PTR [rsp+0x8d8]
  e9210a:	00
  e9210b:	66 0f 6f 84 24 d0 08 	movdqa xmm0,XMMWORD PTR [rsp+0x8d0]
  e92112:	00 00
  e92114:	66 41 0f 7f 84 24 a0 	movdqa XMMWORD PTR [r12+0xa0],xmm0
  e9211b:	00 00 00
  e9211e:	48 85 c0             	test   rax,rax
  e92121:	74 05                	je     e92128 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5953e>
  e92123:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e92128:	4d 8d b4 24 b0 00 00 	lea    r14,[r12+0xb0]
  e9212f:	00
  e92130:	4c 89 f7             	mov    rdi,r14
  e92133:	48 89 de             	mov    rsi,rbx
  e92136:	e8 87 f5 92 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
  e9213b:	49 8d 9c 24 c0 00 00 	lea    rbx,[r12+0xc0]
  e92142:	00
  e92143:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
  e9214a:	00
  e9214b:	48 89 df             	mov    rdi,rbx
  e9214e:	e8 ed bd 95 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  e92153:	4d 8d ac 24 e0 00 00 	lea    r13,[r12+0xe0]
  e9215a:	00
  e9215b:	48 8d b4 24 00 08 00 	lea    rsi,[rsp+0x800]
  e92162:	00
  e92163:	4c 89 ef             	mov    rdi,r13
  e92166:	e8 25 81 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e9216b:	49 8d bc 24 10 01 00 	lea    rdi,[r12+0x110]
  e92172:	00
  e92173:	48 8d b4 24 b0 02 00 	lea    rsi,[rsp+0x2b0]
  e9217a:	00
  e9217b:	e8 10 81 be ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  e92180:	49 8d 5c 24 20       	lea    rbx,[r12+0x20]
  e92185:	31 c0                	xor    eax,eax
  e92187:	41 88 84 24 40 01 00 	mov    BYTE PTR [r12+0x140],al
  e9218e:	00
  e9218f:	41 88 84 24 48 01 00 	mov    BYTE PTR [r12+0x148],al
  e92196:	00
  e92197:	41 83 a4 24 50 01 00 	and    DWORD PTR [r12+0x150],0x0
  e9219e:	00 00
  e921a0:	48 8d bc 24 60 09 00 	lea    rdi,[rsp+0x960]
  e921a7:	00
  e921a8:	e8 bd 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e921ad:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
  e921b4:	00
  e921b5:	e8 b0 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e921ba:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
  e921c1:	00
  e921c2:	e8 a3 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e921c7:	66 49 0f 6e c4       	movq   xmm0,r12
  e921cc:	66 48 0f 6e cb       	movq   xmm1,rbx
  e921d1:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  e921d5:	66 0f 7f 4c 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm1
  e921db:	31 ff                	xor    edi,edi
  e921dd:	e8 3a c2 c0 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  e921e2:	48 8d bc 24 00 08 00 	lea    rdi,[rsp+0x800]
  e921e9:	00
  e921ea:	e8 7b 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e921ef:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
  e921f6:	00
  e921f7:	e8 94 bc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e921fc:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  e92203:	00
  e92204:	e8 87 bc 95 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  e92209:	48 8d bc 24 30 08 00 	lea    rdi,[rsp+0x830]
  e92210:	00
  e92211:	e8 54 7d be ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  e92216:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
  e9221c:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
  e92221:	48 8b b8 d8 00 00 00 	mov    rdi,QWORD PTR [rax+0xd8]
  e92228:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
  e9222d:	0f 11 80 d0 00 00 00 	movups XMMWORD PTR [rax+0xd0],xmm0
  e92234:	e8 4d c2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e92239:	66 0f 6f 84 24 d0 08 	movdqa xmm0,XMMWORD PTR [rsp+0x8d0]
  e92240:	00 00
  e92242:	48 8b 84 24 d8 08 00 	mov    rax,QWORD PTR [rsp+0x8d8]
  e92249:	00
  e9224a:	48 85 c0             	test   rax,rax
  e9224d:	74 05                	je     e92254 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5966a>
  e9224f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  e92254:	48 8b 5c 24 38       	mov    rbx,QWORD PTR [rsp+0x38]
  e92259:	48 8b bb e8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xe8]
  e92260:	f3 0f 7f 83 e0 00 00 	movdqu XMMWORD PTR [rbx+0xe0],xmm0
  e92267:	00
  e92268:	e8 19 c2 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e9226d:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
  e92274:	00
  e92275:	8a 48 01             	mov    cl,BYTE PTR [rax+0x1]
  e92278:	80 f1 01             	xor    cl,0x1
  e9227b:	88 8b f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],cl
  e92281:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e92285:	0f 85 3b 01 00 00    	jne    e923c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x597dc>
  e9228b:	48 8d b4 24 60 09 00 	lea    rsi,[rsp+0x960]
  e92292:	00
  e92293:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  e92299:	66 0f 7f 06          	movdqa XMMWORD PTR [rsi],xmm0
  e9229d:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
  e922a3:	48 8b bc 24 40 05 00 	mov    rdi,QWORD PTR [rsp+0x540]
  e922aa:	00
  e922ab:	e8 e0 ba c2 ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
  e922b0:	48 8b bc 24 68 09 00 	mov    rdi,QWORD PTR [rsp+0x968]
  e922b7:	00
  e922b8:	e8 f5 c1 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e922bd:	48 8b bc 24 48 03 00 	mov    rdi,QWORD PTR [rsp+0x348]
  e922c4:	00
  e922c5:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
  e922cb:	48 8d b4 24 90 09 00 	lea    rsi,[rsp+0x990]
  e922d2:	00
  e922d3:	48 8d 05 3e f9 5b ff 	lea    rax,[rip+0xffffffffff5bf93e]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
  e922da:	48 89 06             	mov    QWORD PTR [rsi],rax
  e922dd:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
  e922e1:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
  e922e6:	48 8d 9c 24 60 08 00 	lea    rbx,[rsp+0x860]
  e922ed:	00
  e922ee:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  e922f4:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
  e922f8:	48 8d 05 25 bc c6 ff 	lea    rax,[rip+0xffffffffffc6bc25]        # afdf24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4aec4>
  e922ff:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
  e92303:	48 8d 05 d2 6c 00 00 	lea    rax,[rip+0x6cd2]        # e98fdc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x603f2>
  e9230a:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  e9230e:	48 89 da             	mov    rdx,rbx
  e92311:	e8 72 f1 92 00       	call   17c1488 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1755f4>
  e92316:	48 89 df             	mov    rdi,rbx
  e92319:	e8 80 4f c1 ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
  e9231e:	31 ff                	xor    edi,edi
  e92320:	e8 bf d2 c4 ff       	call   adf5e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2c584>
  e92325:	31 ff                	xor    edi,edi
  e92327:	e8 86 c1 c0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  e9232c:	48 8b 84 24 d0 07 00 	mov    rax,QWORD PTR [rsp+0x7d0]
  e92333:	00
  e92334:	80 78 01 00          	cmp    BYTE PTR [rax+0x1],0x0
  e92338:	0f 85 88 00 00 00    	jne    e923c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x597dc>
  e9233e:	48 8b 9c 24 a0 08 00 	mov    rbx,QWORD PTR [rsp+0x8a0]
  e92345:	00
  e92346:	4c 8d 84 24 30 08 00 	lea    r8,[rsp+0x830]
  e9234d:	00
  e9234e:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  e92354:	66 41 0f 7f 00       	movdqa XMMWORD PTR [r8],xmm0
  e92359:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
  e9235f:	48 8d 35 6a b8 cf ff 	lea    rsi,[rip+0xffffffffffcfb86a]        # b8dbd0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab70>
  e92366:	48 8d 15 7c b8 cf ff 	lea    rdx,[rip+0xffffffffffcfb87c]        # b8dbe9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdab89>
  e9236d:	48 8d 0d 6e 6c 00 00 	lea    rcx,[rip+0x6c6e]        # e98fe2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x603f8>
  e92374:	4c 8d b4 24 60 08 00 	lea    r14,[rsp+0x860]
  e9237b:	00
  e9237c:	6a 10                	push   0x10
  e9237e:	41 59                	pop    r9
  e92380:	4c 89 f7             	mov    rdi,r14
  e92383:	e8 0c 84 94 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
  e92388:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  e9238b:	48 8d bc 24 90 09 00 	lea    rdi,[rsp+0x990]
  e92392:	00
  e92393:	48 89 de             	mov    rsi,rbx
  e92396:	4c 89 f2             	mov    rdx,r14
  e92399:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
  e9239f:	48 8b bc 24 98 09 00 	mov    rdi,QWORD PTR [rsp+0x998]
  e923a6:	00
  e923a7:	e8 da c0 c0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e923ac:	48 8d bc 24 60 08 00 	lea    rdi,[rsp+0x860]
  e923b3:	00
  e923b4:	e8 2f 84 94 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  e923b9:	48 8b bc 24 38 08 00 	mov    rdi,QWORD PTR [rsp+0x838]
  e923c0:	00
```
## Direct relocation/AP entries for key callback-flow functions

| entry | target | function | relocation |
|---:|---:|---|---|
| `0x18319a8` | `0xe9938c` | `near-e99` | `00000000018319a8  0000000000000008 R_X86_64_RELATIVE                         e9938c` |
| `0x18319b0` | `0xe9939c` | `near-e99` | `00000000018319b0  0000000000000008 R_X86_64_RELATIVE                         e9939c` |
| `0x18319b8` | `0xe993ae` | `near-e99` | `00000000018319b8  0000000000000008 R_X86_64_RELATIVE                         e993ae` |
| `0x18319e0` | `0xe992a2` | `near-e99` | `00000000018319e0  0000000000000008 R_X86_64_RELATIVE                         e992a2` |
| `0x18319e8` | `0xe992b6` | `near-e99` | `00000000018319e8  0000000000000008 R_X86_64_RELATIVE                         e992b6` |
| `0x18319f0` | `0xe992c8` | `near-e99` | `00000000018319f0  0000000000000008 R_X86_64_RELATIVE                         e992c8` |
| `0x18319f8` | `0xe99368` | `near-e99` | `00000000018319f8  0000000000000008 R_X86_64_RELATIVE                         e99368` |
| `0x1831a10` | `0xe99382` | `near-e99` | `0000000001831a10  0000000000000008 R_X86_64_RELATIVE                         e99382` |
| `0x1831a38` | `0xe9926a` | `near-e99` | `0000000001831a38  0000000000000008 R_X86_64_RELATIVE                         e9926a` |
| `0x1831a40` | `0xe99288` | `near-e99` | `0000000001831a40  0000000000000008 R_X86_64_RELATIVE                         e99288` |
| `0x1831a58` | `0xe9929a` | `near-e99` | `0000000001831a58  0000000000000008 R_X86_64_RELATIVE                         e9929a` |
| `0x188bde0` | `0xe99382` | `near-e99` | `000000000188bde0  0000000000000008 R_X86_64_RELATIVE                         e99382` |
| `0x1890490` | `0xe99382` | `near-e99` | `0000000001890490  0000000000000008 R_X86_64_RELATIVE                         e99382` |

## Current v14 interpretation target

The decisive evidence is whether the package stores a direct code pointer and whether the virtual `+0xa0` receiver copies it into an erased holder that later calls `e99c54`. If not visible, the report should identify the next concrete helper after `e95105`.
