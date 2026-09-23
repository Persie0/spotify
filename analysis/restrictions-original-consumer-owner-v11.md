# Restrictions original/consumer owner trace v11

Focus: identify the owner object passed to `e99c54` and the consumer stored at `[original+0x10]`. Static provenance only.

## Relocations into e99c bridge method region

```text
```
## Candidate +0x10 writes/calls and bridge mentions

| addr | instruction |
|---:|---|
| `0x9d7157` | `9d7157:	7e 38                	jle    9d7191 <_ZTSN5boost6locale4conv16conversion_errorE@@Base+0x5851b1>` |
| `0x9d7159` | `9d7159:	31 ed                	xor    ebp,ebp` |
| `0x9d715b` | `9d715b:	4c 89 fb             	mov    rbx,r15` |
| `0x9d715e` | `9d715e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]` |
| `0x9d7162` | `9d7162:	48 8b 04 e8          	mov    rax,QWORD PTR [rax+rbp*8]` |
| `0x9d7166` | `9d7166:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]` |
| `0x9d716a` | `9d716a:	8b 50 18             	mov    edx,DWORD PTR [rax+0x18]` |
| `0x9d716d` | `9d716d:	48 89 df             	mov    rdi,rbx` |
| `0x9d7170` | `9d7170:	31 c9                	xor    ecx,ecx` |
| `0x9d7172` | `9d7172:	e8 d9 06 00 00       	call   9d7850 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x2e0>` |
| `0x9d7177` | `9d7177:	85 c0                	test   eax,eax` |
| `0x9d7179` | `9d7179:	0f 85 fb 00 00 00    	jne    9d727a <_ZTSN5boost6locale4conv16conversion_errorE@@Base+0x58529a>` |
| `0x9d717f` | `9d717f:	48 83 c5 01          	add    rbp,0x1` |
| `0x9d74a8` | `9d74a8:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x9d74ab` | `9d74ab:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]` |
| `0x9d74b2` | `9d74b2:	00` |
| `0x9d74b3` | `9d74b3:	48 89 83 c0 01 00 00 	mov    QWORD PTR [rbx+0x1c0],rax` |
| `0x9d74ba` | `9d74ba:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]` |
| `0x9d74be` | `9d74be:	41 0f 10 4e 10       	movups xmm1,XMMWORD PTR [r14+0x10]` |
| `0x9d74c3` | `9d74c3:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0` |
| `0x9d74ca` | `9d74ca:	0f 11 8b a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm1` |
| `0x9d74d1` | `9d74d1:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]` |
| `0x9d74d5` | `9d74d5:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax` |
| `0x9d74dc` | `9d74dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0x9d74e3` | `9d74e3:	00 00` |
| `0x9d74e5` | `9d74e5:	48 3b 84 24 d8 01 00 	cmp    rax,QWORD PTR [rsp+0x1d8]` |
| `0x9d7dcc` | `9d7dcc:	cc                   	int3` |
| `0x9d7dcd` | `9d7dcd:	cc                   	int3` |
| `0x9d7dce` | `9d7dce:	cc                   	int3` |
| `0x9d7dcf` | `9d7dcf:	cc                   	int3` |
| `0x9d7dd0` | `9d7dd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0x9d7dd3` | `9d7dd3:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]` |
| `0x9d7dd7` | `9d7dd7:	ff e0                	jmp    rax` |
| `0x9d7dd9` | `9d7dd9:	cc                   	int3` |
| `0x9d7dda` | `9d7dda:	cc                   	int3` |
| `0x9d7ddb` | `9d7ddb:	cc                   	int3` |
| `0x9d7ddc` | `9d7ddc:	cc                   	int3` |
| `0x9d7ddd` | `9d7ddd:	cc                   	int3` |
| `0x9d7dde` | `9d7dde:	cc                   	int3` |
| `0x9d8176` | `9d8176:	48 21 c2             	and    rdx,rax` |
| `0x9d8179` | `9d8179:	48 8d 47 20          	lea    rax,[rdi+0x20]` |
| `0x9d817d` | `9d817d:	48 83 c7 38          	add    rdi,0x38` |
| `0x9d8181` | `9d8181:	83 fe 01             	cmp    esi,0x1` |
| `0x9d8184` | `9d8184:	48 0f 44 f8          	cmove  rdi,rax` |
| `0x9d8188` | `9d8188:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x9d818c` | `9d818c:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]` |
| `0x9d818f` | `9d818f:	48 01 c3             	add    rbx,rax` |
| `0x9d8192` | `9d8192:	48 01 d0             	add    rax,rdx` |
| `0x9d8195` | `9d8195:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax` |
| `0x9d8199` | `9d8199:	45 85 c9             	test   r9d,r9d` |
| `0x9d819c` | `9d819c:	74 0a                	je     9d81a8 <_ZNSt13bad_exceptionD1Ev@@Base+0x3c8>` |
| `0x9d819e` | `9d819e:	48 89 df             	mov    rdi,rbx` |
| `0x9d81a1` | `9d81a1:	31 f6                	xor    esi,esi` |
| `0x9d81a3` | `9d81a3:	e8 e8 69 e1 00       	call   17eeb90 <memset@plt>` |
| `0x9d81a8` | `9d81a8:	48 89 d8             	mov    rax,rbx` |
| `0x9d81ab` | `9d81ab:	5b                   	pop    rbx` |
| `0x9d8f5a` | `9d8f5a:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9d8f5e` | `9d8f5e:	48 03 73 20          	add    rsi,QWORD PTR [rbx+0x20]` |
| `0x9d8f62` | `9d8f62:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0x9d8f65` | `9d8f65:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0x9d8f69` | `9d8f69:	45 8b 4e 04          	mov    r9d,DWORD PTR [r14+0x4]` |
| `0x9d8f6d` | `9d8f6d:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]` |
| `0x9d8f71` | `9d8f71:	44 8b 43 18          	mov    r8d,DWORD PTR [rbx+0x18]` |
| `0x9d8f75` | `9d8f75:	48 8d 44 24 10       	lea    rax,[rsp+0x10]` |
| `0x9d8f7a` | `9d8f7a:	48 89 04 24          	mov    QWORD PTR [rsp],rax` |
| `0x9d8f7e` | `9d8f7e:	e8 4d 93 00 00       	call   9e22d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xa100>` |
| `0x9d8f83` | `9d8f83:	83 43 30 01          	add    DWORD PTR [rbx+0x30],0x1` |
| `0x9d8f87` | `9d8f87:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]` |
| `0x9d8f8a` | `9d8f8a:	41 8b 76 04          	mov    esi,DWORD PTR [r14+0x4]` |
| `0x9d9084` | `9d9084:	74 19                	je     9d909f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xecf>` |
| `0x9d9086` | `9d9086:	41 89 c4             	mov    r12d,eax` |
| `0x9d9089` | `9d9089:	41 8b 5e 18          	mov    ebx,DWORD PTR [r14+0x18]` |
| `0x9d908d` | `9d908d:	85 db                	test   ebx,ebx` |
| `0x9d908f` | `9d908f:	74 24                	je     9d90b5 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xee5>` |
| `0x9d9091` | `9d9091:	49 8b 6e 10          	mov    rbp,QWORD PTR [r14+0x10]` |
| `0x9d9095` | `9d9095:	41 8b 46 1c          	mov    eax,DWORD PTR [r14+0x1c]` |
| `0x9d9099` | `9d9099:	89 44 24 18          	mov    DWORD PTR [rsp+0x18],eax` |
| `0x9d909d` | `9d909d:	eb 56                	jmp    9d90f5 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0xf25>` |
| `0x9d909f` | `9d909f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0x9d90a3` | `9d90a3:	41 8b 4e 20          	mov    ecx,DWORD PTR [r14+0x20]` |
| `0x9d90a7` | `9d90a7:	48 8d 15 ab 99 99 ff 	lea    rdx,[rip+0xffffffffff9999ab]        # 372a59 <_ZTSSt12bad_any_cast@@Base-0x1d76f>` |
| `0x9d90ae` | `9d90ae:	be 10 00 00 00       	mov    esi,0x10` |
| `0x9d9b62` | `9d9b62:	8b 4c 24 08          	mov    ecx,DWORD PTR [rsp+0x8]` |
| `0x9d9b66` | `9d9b66:	41 0f af 8e 9c 00 00 	imul   ecx,DWORD PTR [r14+0x9c]` |
| `0x9d9b6d` | `9d9b6d:	00` |
| `0x9d9b6e` | `9d9b6e:	41 39 8e 98 00 00 00 	cmp    DWORD PTR [r14+0x98],ecx` |
| `0x9d9b75` | `9d9b75:	75 0a                	jne    9d9b81 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x19b1>` |
| `0x9d9b77` | `9d9b77:	49 c7 46 10 00 00 00 	mov    QWORD PTR [r14+0x10],0x0` |
| `0x9d9b7e` | `9d9b7e:	00` |
| `0x9d9b7f` | `9d9b7f:	eb 10                	jmp    9d9b91 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x19c1>` |
| `0x9d9b81` | `9d9b81:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9d9b85` | `9d9b85:	41 8b 56 3c          	mov    edx,DWORD PTR [r14+0x3c]` |
| `0x9d9b89` | `9d9b89:	4c 89 ff             	mov    rdi,r15` |
| `0x9d9b8c` | `9d9b8c:	e8 4f 7c 01 00       	call   9f17e0 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x9c30>` |
| `0x9d9b91` | `9d9b91:	48 89 ee             	mov    rsi,rbp` |
| `0x9d9b94` | `9d9b94:	89 da                	mov    edx,ebx` |
| `0x9d9b96` | `9d9b96:	48 8d 4c 24 1c       	lea    rcx,[rsp+0x1c]` |
| `0x9d9b9b` | `9d9b9b:	4c 89 e7             	mov    rdi,r12` |
| `0x9d9d64` | `9d9d64:	e9 46 fd ff ff       	jmp    9d9aaf <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x18df>` |
| `0x9d9d69` | `9d9d69:	49 8b 3e             	mov    rdi,QWORD PTR [r14]` |
| `0x9d9d6c` | `9d9d6c:	e8 ff 7b 01 00       	call   9f1970 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x9dc0>` |
| `0x9d9d71` | `9d9d71:	89 c3                	mov    ebx,eax` |
| `0x9d9d73` | `9d9d73:	03 9c 24 ac 00 00 00 	add    ebx,DWORD PTR [rsp+0xac]` |
| `0x9d9d7a` | `9d9d7a:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9d9d7e` | `9d9d7e:	48 85 ff             	test   rdi,rdi` |
| `0x9d9d81` | `9d9d81:	74 07                	je     9d9d8a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1bba>` |
| `0x9d9d83` | `9d9d83:	e8 78 79 01 00       	call   9f1700 <_ZNKSt6__ndk17codecvtIDiDu9mbstate_tE13do_max_lengthEv@@Base+0x9b50>` |
| `0x9d9d88` | `9d9d88:	01 c3                	add    ebx,eax` |
| `0x9d9d8a` | `9d9d8a:	41 89 9e 94 00 00 00 	mov    DWORD PTR [r14+0x94],ebx` |
| `0x9d9d91` | `9d9d91:	45 31 ed             	xor    r13d,r13d` |
| `0x9d9d94` | `9d9d94:	e9 5a fd ff ff       	jmp    9d9af3 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1923>` |
| `0x9d9df0` | `9d9df0:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0x9d9df3` | `9d9df3:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]` |
| `0x9d9df7` | `9d9df7:	44 8b 47 04          	mov    r8d,DWORD PTR [rdi+0x4]` |
| `0x9d9dfb` | `9d9dfb:	4c 8b 59 08          	mov    r11,QWORD PTR [rcx+0x8]` |
| `0x9d9dff` | `9d9dff:	4c 63 73 30          	movsxd r14,DWORD PTR [rbx+0x30]` |
| `0x9d9e03` | `9d9e03:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x9d9e07` | `9d9e07:	8b 4b 18             	mov    ecx,DWORD PTR [rbx+0x18]` |
| `0x9d9e0a` | `9d9e0a:	48 83 ec 08          	sub    rsp,0x8` |
| `0x9d9e0e` | `9d9e0e:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]` |
| `0x9d9e13` | `9d9e13:	48 89 c7             	mov    rdi,rax` |
| `0x9d9e16` | `9d9e16:	43 ff 34 f3          	push   QWORD PTR [r11+r14*8]` |
| `0x9d9e1a` | `9d9e1a:	41 57                	push   r15` |
| `0x9d9e1c` | `9d9e1c:	41 52                	push   r10` |
| `0x9d9e8b` | `9d9e8b:	48 89 d3             	mov    rbx,rdx` |
| `0x9d9e8e` | `9d9e8e:	49 89 f7             	mov    r15,rsi` |
| `0x9d9e91` | `9d9e91:	8b 52 18             	mov    edx,DWORD PTR [rdx+0x18]` |
| `0x9d9e94` | `9d9e94:	85 d2                	test   edx,edx` |
| `0x9d9e96` | `9d9e96:	74 4f                	je     9d9ee7 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1d17>` |
| `0x9d9e98` | `9d9e98:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9d9e9c` | `9d9e9c:	48 89 df             	mov    rdi,rbx` |
| `0x9d9e9f` | `9d9e9f:	e8 1c 14 00 00       	call   9db2c0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x30f0>` |
| `0x9d9ea4` | `9d9ea4:	48 85 d2             	test   rdx,rdx` |
| `0x9d9ea7` | `9d9ea7:	74 5a                	je     9d9f03 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x1d33>` |
| `0x9d9ea9` | `9d9ea9:	49 89 c4             	mov    r12,rax` |
| `0x9d9eac` | `9d9eac:	8b 5b 20             	mov    ebx,DWORD PTR [rbx+0x20]` |
| `0x9d9eaf` | `9d9eaf:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0x9db892` | `9db892:	49 83 c6 08          	add    r14,0x8` |
| `0x9db896` | `9db896:	4c 29 fa             	sub    rdx,r15` |
| `0x9db899` | `9db899:	48 83 c2 f8          	add    rdx,0xfffffffffffffff8` |
| `0x9db89d` | `9db89d:	44 89 17             	mov    DWORD PTR [rdi],r10d` |
| `0x9db8a0` | `9db8a0:	4c 89 47 08          	mov    QWORD PTR [rdi+0x8],r8` |
| `0x9db8a4` | `9db8a4:	4c 89 5f 10          	mov    QWORD PTR [rdi+0x10],r11` |
| `0x9db8a8` | `9db8a8:	4c 89 67 18          	mov    QWORD PTR [rdi+0x18],r12` |
| `0x9db8ac` | `9db8ac:	4c 89 7f 20          	mov    QWORD PTR [rdi+0x20],r15` |
| `0x9db8b0` | `9db8b0:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax` |
| `0x9db8b4` | `9db8b4:	48 c7 47 30 00 00 00 	mov    QWORD PTR [rdi+0x30],0x0` |
| `0x9db8bb` | `9db8bb:	00` |
| `0x9db8bc` | `9db8bc:	4c 89 77 38          	mov    QWORD PTR [rdi+0x38],r14` |
| `0x9db8c0` | `9db8c0:	48 89 77 40          	mov    QWORD PTR [rdi+0x40],rsi` |
| `0x9db914` | `9db914:	74 74                	je     9db98a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x37ba>` |
| `0x9db916` | `9db916:	49 89 f5             	mov    r13,rsi` |
| `0x9db919` | `9db919:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx` |
| `0x9db91e` | `9db91e:	48 8b 6f 08          	mov    rbp,QWORD PTR [rdi+0x8]` |
| `0x9db922` | `9db922:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi` |
| `0x9db927` | `9db927:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]` |
| `0x9db92b` | `9db92b:	45 31 e4             	xor    r12d,r12d` |
| `0x9db92e` | `9db92e:	eb 08                	jmp    9db938 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3768>` |
| `0x9db930` | `9db930:	44 89 fb             	mov    ebx,r15d` |
| `0x9db933` | `9db933:	41 39 dc             	cmp    r12d,ebx` |
| `0x9db936` | `9db936:	73 2b                	jae    9db963 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3793>` |
| `0x9db938` | `9db938:	45 8d 3c 1c          	lea    r15d,[r12+rbx*1]` |
| `0x9db93c` | `9db93c:	41 d1 ef             	shr    r15d,1` |
| `0x9db9ae` | `9db9ae:	48 89 f5             	mov    rbp,rsi` |
| `0x9db9b1` | `9db9b1:	48 89 fb             	mov    rbx,rdi` |
| `0x9db9b4` | `9db9b4:	48 89 37             	mov    QWORD PTR [rdi],rsi` |
| `0x9db9b7` | `9db9b7:	8b 06                	mov    eax,DWORD PTR [rsi]` |
| `0x9db9b9` | `9db9b9:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax` |
| `0x9db9bd` | `9db9bd:	48 89 57 10          	mov    QWORD PTR [rdi+0x10],rdx` |
| `0x9db9c1` | `9db9c1:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx` |
| `0x9db9c6` | `9db9c6:	48 89 d7             	mov    rdi,rdx` |
| `0x9db9c9` | `9db9c9:	e8 42 25 e1 00       	call   17edf10 <strlen@plt>` |
| `0x9db9ce` | `9db9ce:	48 89 1c 24          	mov    QWORD PTR [rsp],rbx` |
| `0x9db9d2` | `9db9d2:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax` |
| `0x9db9d6` | `9db9d6:	8b 5d 00             	mov    ebx,DWORD PTR [rbp+0x0]` |
| `0x9db9d9` | `9db9d9:	85 db                	test   ebx,ebx` |
| `0x9dbaba` | `9dbaba:	48 89 53 08          	mov    QWORD PTR [rbx+0x8],rdx` |
| `0x9dbabe` | `9dbabe:	4c 39 fa             	cmp    rdx,r15` |
| `0x9dbac1` | `9dbac1:	73 21                	jae    9dbae4 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3914>` |
| `0x9dbac3` | `9dbac3:	8b 44 c1 08          	mov    eax,DWORD PTR [rcx+rax*8+0x8]` |
| `0x9dbac7` | `9dbac7:	48 01 c7             	add    rdi,rax` |
| `0x9dbaca` | `9dbaca:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9dbace` | `9dbace:	48 8b 53 18          	mov    rdx,QWORD PTR [rbx+0x18]` |
| `0x9dbad2` | `9dbad2:	e8 99 33 e1 00       	call   17eee70 <strncmp@plt>` |
| `0x9dbad7` | `9dbad7:	85 c0                	test   eax,eax` |
| `0x9dbad9` | `9dbad9:	74 09                	je     9dbae4 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3914>` |
| `0x9dbadb` | `9dbadb:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15` |
| `0x9dbadf` | `9dbadf:	eb 03                	jmp    9dbae4 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3914>` |
| `0x9dbae1` | `9dbae1:	45 31 f6             	xor    r14d,r14d` |
| `0x9dc34a` | `9dc34a:	48 0f 45 c1          	cmovne rax,rcx` |
| `0x9dc34e` | `9dc34e:	c3                   	ret` |
| `0x9dc34f` | `9dc34f:	cc                   	int3` |
| `0x9dc350` | `9dc350:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0x9dc353` | `9dc353:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0x9dc356` | `9dc356:	48 c7 47 10 00 00 00 	mov    QWORD PTR [rdi+0x10],0x0` |
| `0x9dc35d` | `9dc35d:	00` |
| `0x9dc35e` | `9dc35e:	c3                   	ret` |
| `0x9dc35f` | `9dc35f:	cc                   	int3` |
| `0x9dc360` | `9dc360:	41 56                	push   r14` |
| `0x9dc362` | `9dc362:	53                   	push   rbx` |
| `0x9dc363` | `9dc363:	50                   	push   rax` |
| `0x9dc364` | `9dc364:	48 85 f6             	test   rsi,rsi` |
| `0x9dc389` | `9dc389:	77 05                	ja     9dc390 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x41c0>` |
| `0x9dc38b` | `9dc38b:	e8 50 08 00 00       	call   9dcbe0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4a10>` |
| `0x9dc390` | `9dc390:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]` |
| `0x9dc394` | `9dc394:	4c 89 f7             	mov    rdi,r14` |
| `0x9dc397` | `9dc397:	e8 c4 04 00 00       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9dc39c` | `9dc39c:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0x9dc3a0` | `9dc3a0:	48 85 ff             	test   rdi,rdi` |
| `0x9dc3a3` | `9dc3a3:	74 1b                	je     9dc3c0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x41f0>` |
| `0x9dc3a5` | `9dc3a5:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0x9dc3a8` | `9dc3a8:	0f b6 70 0d          	movzx  esi,BYTE PTR [rax+0xd]` |
| `0x9dc3ac` | `9dc3ac:	48 01 f6             	add    rsi,rsi` |
| `0x9dc3af` | `9dc3af:	e8 ec 07 00 00       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9dc3b4` | `9dc3b4:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9dc3b8` | `9dc3b8:	4c 89 f7             	mov    rdi,r14` |
| `0x9dc3bb` | `9dc3bb:	e8 a0 04 00 00       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9dc3c0` | `9dc3c0:	be 18 00 00 00       	mov    esi,0x18` |
| `0x9dc3c5` | `9dc3c5:	48 89 df             	mov    rdi,rbx` |
| `0x9dc3c8` | `9dc3c8:	48 83 c4 08          	add    rsp,0x8` |
| `0x9dc3cc` | `9dc3cc:	5b                   	pop    rbx` |
| `0x9dc3cd` | `9dc3cd:	41 5e                	pop    r14` |
| `0x9dc44e` | `9dc44e:	74 2b                	je     9dc47b <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x42ab>` |
| `0x9dc450` | `9dc450:	41 0f b6 57 0d       	movzx  edx,BYTE PTR [r15+0xd]` |
| `0x9dc455` | `9dc455:	be 02 00 00 00       	mov    esi,0x2` |
| `0x9dc45a` | `9dc45a:	4c 89 f7             	mov    rdi,r14` |
| `0x9dc45d` | `9dc45d:	e8 de 00 00 00       	call   9dc540 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4370>` |
| `0x9dc462` | `9dc462:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0x9dc466` | `9dc466:	48 85 c0             	test   rax,rax` |
| `0x9dc469` | `9dc469:	75 10                	jne    9dc47b <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x42ab>` |
| `0x9dc46b` | `9dc46b:	4c 89 f7             	mov    rdi,r14` |
| `0x9dc46e` | `9dc46e:	48 89 de             	mov    rsi,rbx` |
| `0x9dc471` | `9dc471:	e8 ea fe ff ff       	call   9dc360 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4190>` |
| `0x9dc476` | `9dc476:	bd 80 ae ff ff       	mov    ebp,0xffffae80` |
| `0x9dc47b` | `9dc47b:	89 e8                	mov    eax,ebp` |
| `0x9dc5d2` | `9dc5d2:	e8 b9 05 00 00       	call   9dcb90 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49c0>` |
| `0x9dc5d7` | `9dc5d7:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]` |
| `0x9dc5db` | `9dc5db:	4c 29 e9             	sub    rcx,r13` |
| `0x9dc5de` | `9dc5de:	48 83 f9 47          	cmp    rcx,0x47` |
| `0x9dc5e2` | `9dc5e2:	77 1f                	ja     9dc603 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4433>` |
| `0x9dc5e4` | `9dc5e4:	48 c7 43 10 01 00 00 	mov    QWORD PTR [rbx+0x10],0x1` |
| `0x9dc5eb` | `9dc5eb:	00` |
| `0x9dc5ec` | `9dc5ec:	48 8b 43 28          	mov    rax,QWORD PTR [rbx+0x28]` |
| `0x9dc5f0` | `9dc5f0:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]` |
| `0x9dc5f4` | `9dc5f4:	48 85 c0             	test   rax,rax` |
| `0x9dc5f7` | `9dc5f7:	74 74                	je     9dc66d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x449d>` |
| `0x9dc5f9` | `9dc5f9:	48 89 48 30          	mov    QWORD PTR [rax+0x30],rcx` |
| `0x9dc5fd` | `9dc5fd:	48 8b 4b 30          	mov    rcx,QWORD PTR [rbx+0x30]` |
| `0x9dc6ea` | `9dc6ea:	48 8d 7b 28          	lea    rdi,[rbx+0x28]` |
| `0x9dc6ee` | `9dc6ee:	48 85 f6             	test   rsi,rsi` |
| `0x9dc6f1` | `9dc6f1:	74 04                	je     9dc6f7 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4527>` |
| `0x9dc6f3` | `9dc6f3:	48 89 56 28          	mov    QWORD PTR [rsi+0x28],rdx` |
| `0x9dc6f7` | `9dc6f7:	4c 8d 7b 40          	lea    r15,[rbx+0x40]` |
| `0x9dc6fb` | `9dc6fb:	48 c7 43 10 01 00 00 	mov    QWORD PTR [rbx+0x10],0x1` |
| `0x9dc702` | `9dc702:	00` |
| `0x9dc703` | `9dc703:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13` |
| `0x9dc707` | `9dc707:	48 89 53 20          	mov    QWORD PTR [rbx+0x20],rdx` |
| `0x9dc70b` | `9dc70b:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0x9dc70e` | `9dc70e:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0x9dc711` | `9dc711:	41 f6 44 24 20 01    	test   BYTE PTR [r12+0x20],0x1` |
| `0x9dc717` | `9dc717:	74 33                	je     9dc74c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x457c>` |
| `0x9dca34` | `9dca34:	0f 11 41 20          	movups XMMWORD PTR [rcx+0x20],xmm0` |
| `0x9dca38` | `9dca38:	0f 11 41 10          	movups XMMWORD PTR [rcx+0x10],xmm0` |
| `0x9dca3c` | `9dca3c:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0` |
| `0x9dca3f` | `9dca3f:	41 f6 46 20 02       	test   BYTE PTR [r14+0x20],0x2` |
| `0x9dca44` | `9dca44:	0f 84 35 ff ff ff    	je     9dc97f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x47af>` |
| `0x9dca4a` | `9dca4a:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9dca4e` | `9dca4e:	48 85 c0             	test   rax,rax` |
| `0x9dca51` | `9dca51:	74 19                	je     9dca6c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x489c>` |
| `0x9dca53` | `9dca53:	4c 39 20             	cmp    QWORD PTR [rax],r12` |
| `0x9dca56` | `9dca56:	75 14                	jne    9dca6c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x489c>` |
| `0x9dca58` | `9dca58:	4c 39 78 38          	cmp    QWORD PTR [rax+0x38],r15` |
| `0x9dca5c` | `9dca5c:	75 0e                	jne    9dca6c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x489c>` |
| `0x9dca5e` | `9dca5e:	48 83 78 10 01       	cmp    QWORD PTR [rax+0x10],0x1` |
| `0x9dcaff` | `9dcaff:	cc                   	int3` |
| `0x9dcb00` | `9dcb00:	41 57                	push   r15` |
| `0x9dcb02` | `9dcb02:	41 56                	push   r14` |
| `0x9dcb04` | `9dcb04:	53                   	push   rbx` |
| `0x9dcb05` | `9dcb05:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0x9dcb08` | `9dcb08:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0` |
| `0x9dcb0c` | `9dcb0c:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0x9dcb0f` | `9dcb0f:	48 c7 47 20 00 00 00 	mov    QWORD PTR [rdi+0x20],0x0` |
| `0x9dcb16` | `9dcb16:	00` |
| `0x9dcb17` | `9dcb17:	48 83 fa 48          	cmp    rdx,0x48` |
| `0x9dcb1b` | `9dcb1b:	72 5c                	jb     9dcb79 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49a9>` |
| `0x9dcb1d` | `9dcb1d:	49 89 d6             	mov    r14,rdx` |
| `0x9dcb20` | `9dcb20:	49 89 ff             	mov    r15,rdi` |
| `0x9dcbc3` | `9dcbc3:	0f 11 47 5c          	movups XMMWORD PTR [rdi+0x5c],xmm0` |
| `0x9dcbc7` | `9dcbc7:	0f 11 47 50          	movups XMMWORD PTR [rdi+0x50],xmm0` |
| `0x9dcbcb` | `9dcbcb:	0f 11 47 40          	movups XMMWORD PTR [rdi+0x40],xmm0` |
| `0x9dcbcf` | `9dcbcf:	0f 11 47 30          	movups XMMWORD PTR [rdi+0x30],xmm0` |
| `0x9dcbd3` | `9dcbd3:	0f 11 47 20          	movups XMMWORD PTR [rdi+0x20],xmm0` |
| `0x9dcbd7` | `9dcbd7:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0` |
| `0x9dcbdb` | `9dcbdb:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0x9dcbde` | `9dcbde:	c3                   	ret` |
| `0x9dcbdf` | `9dcbdf:	cc                   	int3` |
| `0x9dcbe0` | `9dcbe0:	48 85 ff             	test   rdi,rdi` |
| `0x9dcbe3` | `9dcbe3:	74 0a                	je     9dcbef <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4a1f>` |
| `0x9dcbe5` | `9dcbe5:	be 6c 00 00 00       	mov    esi,0x6c` |
| `0x9dcbea` | `9dcbea:	e9 b1 ff ff ff       	jmp    9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9dd866` | `9dd866:	48 89 ef             	mov    rdi,rbp` |
| `0x9dd869` | `9dd869:	4c 89 f6             	mov    rsi,r14` |
| `0x9dd86c` | `9dd86c:	e8 bf f3 ff ff       	call   9dcc30 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4a60>` |
| `0x9dd871` | `9dd871:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0x9dd874` | `9dd874:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0` |
| `0x9dd878` | `9dd878:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0` |
| `0x9dd87d` | `9dd87d:	41 0f 11 46 20       	movups XMMWORD PTR [r14+0x20],xmm0` |
| `0x9dd882` | `9dd882:	49 c7 46 30 00 00 00 	mov    QWORD PTR [r14+0x30],0x0` |
| `0x9dd889` | `9dd889:	00` |
| `0x9dd88a` | `9dd88a:	8b 4d 00             	mov    ecx,DWORD PTR [rbp+0x0]` |
| `0x9dd88d` | `9dd88d:	8b 45 04             	mov    eax,DWORD PTR [rbp+0x4]` |
| `0x9dd890` | `9dd890:	0f a4 c8 03          	shld   eax,ecx,0x3` |
| `0x9dd894` | `9dd894:	89 c2                	mov    edx,eax` |
| `0x9dd926` | `9dd926:	8a 45 15             	mov    al,BYTE PTR [rbp+0x15]` |
| `0x9dd929` | `9dd929:	88 43 0e             	mov    BYTE PTR [rbx+0xe],al` |
| `0x9dd92c` | `9dd92c:	8a 45 14             	mov    al,BYTE PTR [rbp+0x14]` |
| `0x9dd92f` | `9dd92f:	88 43 0f             	mov    BYTE PTR [rbx+0xf],al` |
| `0x9dd932` | `9dd932:	8a 45 1b             	mov    al,BYTE PTR [rbp+0x1b]` |
| `0x9dd935` | `9dd935:	88 43 10             	mov    BYTE PTR [rbx+0x10],al` |
| `0x9dd938` | `9dd938:	8a 45 1a             	mov    al,BYTE PTR [rbp+0x1a]` |
| `0x9dd93b` | `9dd93b:	88 43 11             	mov    BYTE PTR [rbx+0x11],al` |
| `0x9dd93e` | `9dd93e:	8a 45 19             	mov    al,BYTE PTR [rbp+0x19]` |
| `0x9dd941` | `9dd941:	88 43 12             	mov    BYTE PTR [rbx+0x12],al` |
| `0x9dd944` | `9dd944:	8a 45 18             	mov    al,BYTE PTR [rbp+0x18]` |
| `0x9dd947` | `9dd947:	88 43 13             	mov    BYTE PTR [rbx+0x13],al` |
| `0x9dd94a` | `9dd94a:	8a 45 1f             	mov    al,BYTE PTR [rbp+0x1f]` |
| `0x9de1a3` | `9de1a3:	48 85 ff             	test   rdi,rdi` |
| `0x9de1a6` | `9de1a6:	74 19                	je     9de1c1 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x5ff1>` |
| `0x9de1a8` | `9de1a8:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]` |
| `0x9de1ac` | `9de1ac:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9de1b0` | `9de1b0:	e8 eb e9 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9de1b5` | `9de1b5:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9de1b9` | `9de1b9:	4c 89 f7             	mov    rdi,r14` |
| `0x9de1bc` | `9de1bc:	e8 9f e6 ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9de1c1` | `9de1c1:	c7 03 01 00 00 00    	mov    DWORD PTR [rbx],0x1` |
| `0x9de1c7` | `9de1c7:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0x9de1ca` | `9de1ca:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0` |
| `0x9de1ce` | `9de1ce:	48 83 c4 08          	add    rsp,0x8` |
| `0x9de1d2` | `9de1d2:	5b                   	pop    rbx` |
| `0x9de20a` | `9de20a:	48 89 de             	mov    rsi,rbx` |
| `0x9de20d` | `9de20d:	e8 2e e3 ff ff       	call   9dc540 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4370>` |
| `0x9de212` | `9de212:	48 85 c0             	test   rax,rax` |
| `0x9de215` | `9de215:	74 43                	je     9de25a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x608a>` |
| `0x9de217` | `9de217:	49 89 c4             	mov    r12,rax` |
| `0x9de21a` | `9de21a:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9de21e` | `9de21e:	48 85 f6             	test   rsi,rsi` |
| `0x9de221` | `9de221:	74 2d                	je     9de250 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6080>` |
| `0x9de223` | `9de223:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]` |
| `0x9de227` | `9de227:	48 c1 e2 03          	shl    rdx,0x3` |
| `0x9de22b` | `9de22b:	4c 89 e7             	mov    rdi,r12` |
| `0x9de22e` | `9de22e:	e8 9d 18 e1 00       	call   17efad0 <memcpy@plt>` |
| `0x9de233` | `9de233:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x9de237` | `9de237:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9de23b` | `9de23b:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9de23f` | `9de23f:	e8 5c e9 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9de244` | `9de244:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9de248` | `9de248:	4c 89 ff             	mov    rdi,r15` |
| `0x9de24b` | `9de24b:	e8 10 e6 ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9de250` | `9de250:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx` |
| `0x9de254` | `9de254:	4d 89 66 10          	mov    QWORD PTR [r14+0x10],r12` |
| `0x9de258` | `9de258:	31 ed                	xor    ebp,ebp` |
| `0x9de25a` | `9de25a:	89 e8                	mov    eax,ebp` |
| `0x9de25c` | `9de25c:	5b                   	pop    rbx` |
| `0x9de25d` | `9de25d:	41 5c                	pop    r12` |
| `0x9de25f` | `9de25f:	41 5e                	pop    r14` |
| `0x9de261` | `9de261:	41 5f                	pop    r15` |
| `0x9de263` | `9de263:	5d                   	pop    rbp` |
| `0x9de2fd` | `9de2fd:	48 89 de             	mov    rsi,rbx` |
| `0x9de300` | `9de300:	e8 3b e2 ff ff       	call   9dc540 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4370>` |
| `0x9de305` | `9de305:	48 85 c0             	test   rax,rax` |
| `0x9de308` | `9de308:	0f 84 96 00 00 00    	je     9de3a4 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x61d4>` |
| `0x9de30e` | `9de30e:	48 89 c7             	mov    rdi,rax` |
| `0x9de311` | `9de311:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9de315` | `9de315:	48 85 f6             	test   rsi,rsi` |
| `0x9de318` | `9de318:	74 30                	je     9de34a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x617a>` |
| `0x9de31a` | `9de31a:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]` |
| `0x9de31e` | `9de31e:	48 c1 e2 03          	shl    rdx,0x3` |
| `0x9de322` | `9de322:	48 89 fd             	mov    rbp,rdi` |
| `0x9de325` | `9de325:	e8 a6 17 e1 00       	call   17efad0 <memcpy@plt>` |
| `0x9de32a` | `9de32a:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x9de32e` | `9de32e:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9de332` | `9de332:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9de336` | `9de336:	e8 65 e8 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9de33b` | `9de33b:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9de33f` | `9de33f:	4c 89 e7             	mov    rdi,r12` |
| `0x9de342` | `9de342:	e8 19 e5 ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9de347` | `9de347:	48 89 ef             	mov    rdi,rbp` |
| `0x9de34a` | `9de34a:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx` |
| `0x9de34e` | `9de34e:	49 89 7e 10          	mov    QWORD PTR [r14+0x10],rdi` |
| `0x9de352` | `9de352:	eb 42                	jmp    9de396 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x61c6>` |
| `0x9de354` | `9de354:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]` |
| `0x9de358` | `9de358:	bd 00 00 00 00       	mov    ebp,0x0` |
| `0x9de35d` | `9de35d:	48 85 d2             	test   rdx,rdx` |
| `0x9de360` | `9de360:	74 42                	je     9de3a4 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x61d4>` |
| `0x9de362` | `9de362:	41 c7 06 01 00 00 00 	mov    DWORD PTR [r14],0x1` |
| `0x9de369` | `9de369:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9de36d` | `9de36d:	48 c1 e2 03          	shl    rdx,0x3` |
| `0x9de371` | `9de371:	31 ed                	xor    ebp,ebp` |
| `0x9de373` | `9de373:	31 f6                	xor    esi,esi` |
| `0x9de375` | `9de375:	e8 16 08 e1 00       	call   17eeb90 <memset@plt>` |
| `0x9de37a` | `9de37a:	eb 28                	jmp    9de3a4 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x61d4>` |
| `0x9de37c` | `9de37c:	48 c1 e3 03          	shl    rbx,0x3` |
| `0x9de380` | `9de380:	49 03 5e 10          	add    rbx,QWORD PTR [r14+0x10]` |
| `0x9de384` | `9de384:	48 c1 e2 03          	shl    rdx,0x3` |
| `0x9de388` | `9de388:	48 89 df             	mov    rdi,rbx` |
| `0x9de38b` | `9de38b:	31 f6                	xor    esi,esi` |
| `0x9de38d` | `9de38d:	e8 fe 07 e1 00       	call   17eeb90 <memset@plt>` |
| `0x9de392` | `9de392:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9de396` | `9de396:	49 8b 77 10          	mov    rsi,QWORD PTR [r15+0x10]` |
| `0x9de39a` | `9de39a:	4c 89 ea             	mov    rdx,r13` |
| `0x9de39d` | `9de39d:	e8 2e 17 e1 00       	call   17efad0 <memcpy@plt>` |
| `0x9de3a2` | `9de3a2:	31 ed                	xor    ebp,ebp` |
| `0x9de3a4` | `9de3a4:	89 e8                	mov    eax,ebp` |
| `0x9de3a6` | `9de3a6:	48 83 c4 08          	add    rsp,0x8` |
| `0x9de3aa` | `9de3aa:	5b                   	pop    rbx` |
| `0x9de3c8` | `9de3c8:	49 89 d6             	mov    r14,rdx` |
| `0x9de3cb` | `9de3cb:	48 89 f3             	mov    rbx,rsi` |
| `0x9de3ce` | `9de3ce:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]` |
| `0x9de3d2` | `9de3d2:	48 85 d2             	test   rdx,rdx` |
| `0x9de3d5` | `9de3d5:	74 0a                	je     9de3e1 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6211>` |
| `0x9de3d7` | `9de3d7:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]` |
| `0x9de3db` | `9de3db:	48 c1 e2 03          	shl    rdx,0x3` |
| `0x9de3df` | `9de3df:	eb 65                	jmp    9de446 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6276>` |
| `0x9de3e1` | `9de3e1:	49 89 fc             	mov    r12,rdi` |
| `0x9de3e4` | `9de3e4:	be 01 00 00 00       	mov    esi,0x1` |
| `0x9de3e9` | `9de3e9:	ba 08 00 00 00       	mov    edx,0x8` |
| `0x9de3ee` | `9de3ee:	e8 4d e1 ff ff       	call   9dc540 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4370>` |
| `0x9de3f3` | `9de3f3:	48 85 c0             	test   rax,rax` |
| `0x9de3f6` | `9de3f6:	0f 84 81 00 00 00    	je     9de47d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x62ad>` |
| `0x9de3fc` | `9de3fc:	49 89 c7             	mov    r15,rax` |
| `0x9de3ff` | `9de3ff:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9de403` | `9de403:	48 85 f6             	test   rsi,rsi` |
| `0x9de406` | `9de406:	74 2d                	je     9de435 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6265>` |
| `0x9de408` | `9de408:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0x9de40c` | `9de40c:	48 c1 e2 03          	shl    rdx,0x3` |
| `0x9de410` | `9de410:	4c 89 ff             	mov    rdi,r15` |
| `0x9de413` | `9de413:	e8 b8 16 e1 00       	call   17efad0 <memcpy@plt>` |
| `0x9de418` | `9de418:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]` |
| `0x9de41c` | `9de41c:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0x9de420` | `9de420:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9de424` | `9de424:	e8 77 e7 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9de429` | `9de429:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9de42d` | `9de42d:	4c 89 e7             	mov    rdi,r12` |
| `0x9de430` | `9de430:	e8 2b e4 ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9de435` | `9de435:	48 c7 43 08 01 00 00 	mov    QWORD PTR [rbx+0x8],0x1` |
| `0x9de43c` | `9de43c:	00` |
| `0x9de43d` | `9de43d:	4c 89 7b 10          	mov    QWORD PTR [rbx+0x10],r15` |
| `0x9de441` | `9de441:	ba 08 00 00 00       	mov    edx,0x8` |
| `0x9de446` | `9de446:	31 ed                	xor    ebp,ebp` |
| `0x9de448` | `9de448:	4c 89 ff             	mov    rdi,r15` |
| `0x9de44b` | `9de44b:	31 f6                	xor    esi,esi` |
| `0x9de44d` | `9de44d:	e8 3e 07 e1 00       	call   17eeb90 <memset@plt>` |
| `0x9de452` | `9de452:	31 c0                	xor    eax,eax` |
| `0x9de454` | `9de454:	4d 85 f6             	test   r14,r14` |
| `0x9de457` | `9de457:	0f 99 c0             	setns  al` |
| `0x9de45a` | `9de45a:	4c 89 f1             	mov    rcx,r14` |
| `0x9de45d` | `9de45d:	48 f7 d9             	neg    rcx` |
| `0x9de460` | `9de460:	49 0f 4c ce          	cmovl  rcx,r14` |
| `0x9de464` | `9de464:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x9de468` | `9de468:	48 89 0a             	mov    QWORD PTR [rdx],rcx` |
| `0x9de46b` | `9de46b:	01 c0                	add    eax,eax` |
| `0x9de46d` | `9de46d:	83 c0 ff             	add    eax,0xffffffff` |
| `0x9de470` | `9de470:	89 03                	mov    DWORD PTR [rbx],eax` |
| `0x9de472` | `9de472:	89 e8                	mov    eax,ebp` |
| `0x9de474` | `9de474:	5b                   	pop    rbx` |
| `0x9de475` | `9de475:	41 5c                	pop    r12` |
| `0x9de490` | `9de490:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]` |
| `0x9de494` | `9de494:	48 c1 e1 06          	shl    rcx,0x6` |
| `0x9de498` | `9de498:	31 c0                	xor    eax,eax` |
| `0x9de49a` | `9de49a:	48 39 f1             	cmp    rcx,rsi` |
| `0x9de49d` | `9de49d:	76 17                	jbe    9de4b6 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x62e6>` |
| `0x9de49f` | `9de49f:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]` |
| `0x9de4a3` | `9de4a3:	48 89 f1             	mov    rcx,rsi` |
| `0x9de4a6` | `9de4a6:	48 c1 e9 06          	shr    rcx,0x6` |
| `0x9de4aa` | `9de4aa:	48 8b 04 c8          	mov    rax,QWORD PTR [rax+rcx*8]` |
| `0x9de4ae` | `9de4ae:	89 f1                	mov    ecx,esi` |
| `0x9de4b0` | `9de4b0:	48 d3 e8             	shr    rax,cl` |
| `0x9de4b3` | `9de4b3:	83 e0 01             	and    eax,0x1` |
| `0x9de4b6` | `9de4b6:	c3                   	ret` |
| `0x9de4be` | `9de4be:	cc                   	int3` |
| `0x9de4bf` | `9de4bf:	cc                   	int3` |
| `0x9de4c0` | `9de4c0:	48 8b 57 08          	mov    rdx,QWORD PTR [rdi+0x8]` |
| `0x9de4c4` | `9de4c4:	48 85 d2             	test   rdx,rdx` |
| `0x9de4c7` | `9de4c7:	0f 84 62 00 00 00    	je     9de52f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x635f>` |
| `0x9de4cd` | `9de4cd:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]` |
| `0x9de4d1` | `9de4d1:	48 89 d0             	mov    rax,rdx` |
| `0x9de4d4` | `9de4d4:	48 c1 e0 06          	shl    rax,0x6` |
| `0x9de4d8` | `9de4d8:	48 83 c0 40          	add    rax,0x40` |
| `0x9de4dc` | `9de4dc:	48 83 c2 ff          	add    rdx,0xffffffffffffffff` |
| `0x9de4e0` | `9de4e0:	48 85 d2             	test   rdx,rdx` |
| `0x9de4e3` | `9de4e3:	74 4d                	je     9de532 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6362>` |
| `0x9de4e5` | `9de4e5:	48 8b 0c d6          	mov    rcx,QWORD PTR [rsi+rdx*8]` |
| `0x9de54e` | `9de54e:	cc                   	int3` |
| `0x9de54f` | `9de54f:	cc                   	int3` |
| `0x9de550` | `9de550:	48 8b 57 08          	mov    rdx,QWORD PTR [rdi+0x8]` |
| `0x9de554` | `9de554:	48 85 d2             	test   rdx,rdx` |
| `0x9de557` | `9de557:	0f 84 60 00 00 00    	je     9de5bd <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x63ed>` |
| `0x9de55d` | `9de55d:	48 8b 77 10          	mov    rsi,QWORD PTR [rdi+0x10]` |
| `0x9de561` | `9de561:	48 89 d0             	mov    rax,rdx` |
| `0x9de564` | `9de564:	48 c1 e0 06          	shl    rax,0x6` |
| `0x9de568` | `9de568:	48 83 c0 47          	add    rax,0x47` |
| `0x9de56c` | `9de56c:	48 83 c2 ff          	add    rdx,0xffffffffffffffff` |
| `0x9de570` | `9de570:	48 85 d2             	test   rdx,rdx` |
| `0x9de573` | `9de573:	74 4b                	je     9de5c0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x63f0>` |
| `0x9de575` | `9de575:	48 8b 0c d6          	mov    rcx,QWORD PTR [rsi+rdx*8]` |
| `0x9de93a` | `9de93a:	48 01 c3             	add    rbx,rax` |
| `0x9de93d` | `9de93d:	74 28                	je     9de967 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6797>` |
| `0x9de93f` | `9de93f:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x9de943` | `9de943:	48 39 de             	cmp    rsi,rbx` |
| `0x9de946` | `9de946:	75 5e                	jne    9de9a6 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x67d6>` |
| `0x9de948` | `9de948:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9de94c` | `9de94c:	48 8d 14 dd 00 00 00 	lea    rdx,[rbx*8+0x0]` |
| `0x9de953` | `9de953:	00` |
| `0x9de954` | `9de954:	31 f6                	xor    esi,esi` |
| `0x9de956` | `9de956:	e8 35 02 e1 00       	call   17eeb90 <memset@plt>` |
| `0x9de95b` | `9de95b:	41 c7 06 01 00 00 00 	mov    DWORD PTR [r14],0x1` |
| `0x9de962` | `9de962:	e9 fe 00 00 00       	jmp    9dea65 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6895>` |
| `0x9de967` | `9de967:	4d 85 f6             	test   r14,r14` |
| `0x9de96a` | `9de96a:	0f 84 f5 00 00 00    	je     9dea65 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6895>` |
| `0x9de970` | `9de970:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9de974` | `9de974:	48 85 ff             	test   rdi,rdi` |
| `0x9de977` | `9de977:	74 19                	je     9de992 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x67c2>` |
| `0x9de979` | `9de979:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x9de97d` | `9de97d:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9de981` | `9de981:	e8 1a e2 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9de986` | `9de986:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9de98a` | `9de98a:	4c 89 ef             	mov    rdi,r13` |
| `0x9de98d` | `9de98d:	e8 ce de ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9de992` | `9de992:	41 c7 06 01 00 00 00 	mov    DWORD PTR [r14],0x1` |
| `0x9de999` | `9de999:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0x9de99c` | `9de99c:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0` |
| `0x9de9a1` | `9de9a1:	e9 bf 00 00 00       	jmp    9dea65 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6895>` |
| `0x9de9a6` | `9de9a6:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12` |
| `0x9dea7f` | `9dea7f:	4c 89 e6             	mov    rsi,r12` |
| `0x9dea82` | `9dea82:	4c 89 fa             	mov    rdx,r15` |
| `0x9dea85` | `9dea85:	e8 46 10 e1 00       	call   17efad0 <memcpy@plt>` |
| `0x9dea8a` | `9dea8a:	48 85 db             	test   rbx,rbx` |
| `0x9dea8d` | `9dea8d:	0f 84 31 00 00 00    	je     9deac4 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x68f4>` |
| `0x9dea93` | `9dea93:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0x9dea97` | `9dea97:	48 8d 0c d8          	lea    rcx,[rax+rbx*8]` |
| `0x9dea9b` | `9dea9b:	48 83 c1 f0          	add    rcx,0xfffffffffffffff0` |
| `0x9dea9f` | `9dea9f:	90                   	nop` |
| `0x9deaa0` | `9deaa0:	48 8b 10             	mov    rdx,QWORD PTR [rax]` |
| `0x9deaa3` | `9deaa3:	48 0f ca             	bswap  rdx` |
| `0x9deaa6` | `9deaa6:	48 8b 71 08          	mov    rsi,QWORD PTR [rcx+0x8]` |
| `0x9deaaa` | `9deaaa:	48 0f ce             	bswap  rsi` |
| `0x9dec0e` | `9dec0e:	49 89 f6             	mov    r14,rsi` |
| `0x9dec11` | `9dec11:	49 89 ff             	mov    r15,rdi` |
| `0x9dec14` | `9dec14:	48 8b 4e 08          	mov    rcx,QWORD PTR [rsi+0x8]` |
| `0x9dec18` | `9dec18:	48 85 c9             	test   rcx,rcx` |
| `0x9dec1b` | `9dec1b:	74 60                	je     9dec7d <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6aad>` |
| `0x9dec1d` | `9dec1d:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]` |
| `0x9dec21` | `9dec21:	48 89 c8             	mov    rax,rcx` |
| `0x9dec24` | `9dec24:	48 c1 e0 06          	shl    rax,0x6` |
| `0x9dec28` | `9dec28:	48 83 c0 40          	add    rax,0x40` |
| `0x9dec2c` | `9dec2c:	48 8d 79 ff          	lea    rdi,[rcx-0x1]` |
| `0x9dec30` | `9dec30:	48 85 ff             	test   rdi,rdi` |
| `0x9dec33` | `9dec33:	74 4c                	je     9dec81 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6ab1>` |
| `0x9dec35` | `9dec35:	48 8b 34 fa          	mov    rsi,QWORD PTR [rdx+rdi*8]` |
| `0x9decd8` | `9decd8:	4c 89 e6             	mov    rsi,r12` |
| `0x9decdb` | `9decdb:	e8 60 d8 ff ff       	call   9dc540 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4370>` |
| `0x9dece0` | `9dece0:	48 85 c0             	test   rax,rax` |
| `0x9dece3` | `9dece3:	0f 84 ed 00 00 00    	je     9dedd6 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6c06>` |
| `0x9dece9` | `9dece9:	48 89 c5             	mov    rbp,rax` |
| `0x9decec` | `9decec:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9decf0` | `9decf0:	48 85 f6             	test   rsi,rsi` |
| `0x9decf3` | `9decf3:	74 2d                	je     9ded22 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6b52>` |
| `0x9decf5` | `9decf5:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]` |
| `0x9decf9` | `9decf9:	48 c1 e2 03          	shl    rdx,0x3` |
| `0x9decfd` | `9decfd:	48 89 ef             	mov    rdi,rbp` |
| `0x9ded00` | `9ded00:	e8 cb 0d e1 00       	call   17efad0 <memcpy@plt>` |
| `0x9ded05` | `9ded05:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]` |
| `0x9ded09` | `9ded09:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9ded0d` | `9ded0d:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9ded11` | `9ded11:	e8 8a de ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9ded16` | `9ded16:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9ded1a` | `9ded1a:	4c 89 ff             	mov    rdi,r15` |
| `0x9ded1d` | `9ded1d:	e8 3e db ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9ded22` | `9ded22:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12` |
| `0x9ded26` | `9ded26:	49 89 6e 10          	mov    QWORD PTR [r14+0x10],rbp` |
| `0x9ded2a` | `9ded2a:	4c 89 e1             	mov    rcx,r12` |
| `0x9ded2d` | `9ded2d:	41 89 df             	mov    r15d,ebx` |
| `0x9ded30` | `9ded30:	41 83 e7 3f          	and    r15d,0x3f` |
| `0x9ded34` | `9ded34:	48 c1 eb 06          	shr    rbx,0x6` |
| `0x9ded38` | `9ded38:	74 4f                	je     9ded89 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6bb9>` |
| `0x9ded3a` | `9ded3a:	49 89 cb             	mov    r11,rcx` |
| `0x9ded3d` | `9ded3d:	49 29 db             	sub    r11,rbx` |
| `0x9ded40` | `9ded40:	76 30                	jbe    9ded72 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6ba2>` |
| `0x9ded42` | `9ded42:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9ded46` | `9ded46:	49 89 d8             	mov    r8,rbx` |
| `0x9ded49` | `9ded49:	49 f7 d0             	not    r8` |
| `0x9ded4c` | `9ded4c:	49 83 fb 04          	cmp    r11,0x4` |
| `0x9ded50` | `9ded50:	0f 83 92 00 00 00    	jae    9dede8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6c18>` |
| `0x9ded56` | `9ded56:	4a 8d 04 c7          	lea    rax,[rdi+r8*8]` |
| `0x9ded5a` | `9ded5a:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]` |
| `0x9ded60` | `9ded60:	48 8b 14 c8          	mov    rdx,QWORD PTR [rax+rcx*8]` |
| `0x9ded69` | `9ded69:	48 83 c1 ff          	add    rcx,0xffffffffffffffff` |
| `0x9ded6d` | `9ded6d:	48 39 d9             	cmp    rcx,rbx` |
| `0x9ded70` | `9ded70:	77 ee                	ja     9ded60 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6b90>` |
| `0x9ded72` | `9ded72:	48 85 c9             	test   rcx,rcx` |
| `0x9ded75` | `9ded75:	74 12                	je     9ded89 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6bb9>` |
| `0x9ded77` | `9ded77:	49 8b 7e 10          	mov    rdi,QWORD PTR [r14+0x10]` |
| `0x9ded7b` | `9ded7b:	48 c1 e1 03          	shl    rcx,0x3` |
| `0x9ded7f` | `9ded7f:	31 f6                	xor    esi,esi` |
| `0x9ded81` | `9ded81:	48 89 ca             	mov    rdx,rcx` |
| `0x9ded84` | `9ded84:	e8 07 fe e0 00       	call   17eeb90 <memset@plt>` |
| `0x9ded89` | `9ded89:	45 31 ed             	xor    r13d,r13d` |
| `0x9ded8c` | `9ded8c:	4d 85 ff             	test   r15,r15` |
| `0x9ded8f` | `9ded8f:	0f 84 41 00 00 00    	je     9dedd6 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6c06>` |
| `0x9ded95` | `9ded95:	49 3b 5e 08          	cmp    rbx,QWORD PTR [r14+0x8]` |
| `0x9ded99` | `9ded99:	0f 83 37 00 00 00    	jae    9dedd6 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6c06>` |
| `0x9ded9f` | `9ded9f:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]` |
| `0x9deda3` | `9deda3:	b8 40 00 00 00       	mov    eax,0x40` |
| `0x9deda8` | `9deda8:	4c 29 f8             	sub    rax,r15` |
| `0x9dedab` | `9dedab:	45 31 ed             	xor    r13d,r13d` |
| `0x9dedae` | `9dedae:	31 ed                	xor    ebp,ebp` |
| `0x9dedb0` | `9dedb0:	48 8b 3c da          	mov    rdi,QWORD PTR [rdx+rbx*8]` |
| `0x9dedb4` | `9dedb4:	48 89 fe             	mov    rsi,rdi` |
| `0x9dedb7` | `9dedb7:	89 c1                	mov    ecx,eax` |
| `0x9def0b` | `9def0b:	00 00 00` |
| `0x9def0e` | `9def0e:	66 90                	xchg   ax,ax` |
| `0x9def10` | `9def10:	49 89 c1             	mov    r9,rax` |
| `0x9def13` | `9def13:	48 85 c0             	test   rax,rax` |
| `0x9def16` | `9def16:	74 10                	je     9def28 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6d58>` |
| `0x9def18` | `9def18:	48 8b 57 10          	mov    rdx,QWORD PTR [rdi+0x10]` |
| `0x9def1c` | `9def1c:	49 8d 41 ff          	lea    rax,[r9-0x1]` |
| `0x9def20` | `9def20:	4a 83 7c ca f8 00    	cmp    QWORD PTR [rdx+r9*8-0x8],0x0` |
| `0x9def26` | `9def26:	74 e8                	je     9def10 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6d40>` |
| `0x9def28` | `9def28:	48 8b 56 08          	mov    rdx,QWORD PTR [rsi+0x8]` |
| `0x9def2c` | `9def2c:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]` |
| `0x9def30` | `9def30:	48 89 d0             	mov    rax,rdx` |
| `0x9def33` | `9def33:	48 85 d2             	test   rdx,rdx` |
| `0x9def81` | `9def81:	85 d2                	test   edx,edx` |
| `0x9def83` | `9def83:	0f 8f 2f 00 00 00    	jg     9defb8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6de8>` |
| `0x9def89` | `9def89:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]` |
| `0x9def90` | `9def90:	4d 85 c9             	test   r9,r9` |
| `0x9def93` | `9def93:	74 24                	je     9defb9 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6de9>` |
| `0x9def95` | `9def95:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]` |
| `0x9def99` | `9def99:	49 8d 41 ff          	lea    rax,[r9-0x1]` |
| `0x9def9d` | `9def9d:	48 8b 56 10          	mov    rdx,QWORD PTR [rsi+0x10]` |
| `0x9defa1` | `9defa1:	4a 8b 54 ca f8       	mov    rdx,QWORD PTR [rdx+r9*8-0x8]` |
| `0x9defa6` | `9defa6:	4a 39 54 c9 f8       	cmp    QWORD PTR [rcx+r9*8-0x8],rdx` |
| `0x9defab` | `9defab:	77 08                	ja     9defb5 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6de5>` |
| `0x9defad` | `9defad:	49 89 c1             	mov    r9,rax` |
| `0x9defb0` | `9defb0:	73 de                	jae    9def90 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6dc0>` |
| `0x9defd6` | `9defd6:	48 8b 4f 08          	mov    rcx,QWORD PTR [rdi+0x8]` |
| `0x9defda` | `9defda:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]` |
| `0x9defe0` | `9defe0:	48 89 ca             	mov    rdx,rcx` |
| `0x9defe3` | `9defe3:	48 85 c9             	test   rcx,rcx` |
| `0x9defe6` | `9defe6:	74 10                	je     9deff8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6e28>` |
| `0x9defe8` | `9defe8:	4c 8b 47 10          	mov    r8,QWORD PTR [rdi+0x10]` |
| `0x9defec` | `9defec:	48 8d 4a ff          	lea    rcx,[rdx-0x1]` |
| `0x9deff0` | `9deff0:	49 83 7c d0 f8 00    	cmp    QWORD PTR [r8+rdx*8-0x8],0x0` |
| `0x9deff6` | `9deff6:	74 e8                	je     9defe0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6e10>` |
| `0x9deff8` | `9deff8:	45 31 c0             	xor    r8d,r8d` |
| `0x9deffb` | `9deffb:	4d 85 c9             	test   r9,r9` |
| `0x9deffe` | `9deffe:	41 0f 95 c0          	setne  r8b` |
| `0x9df002` | `9df002:	4c 89 c1             	mov    rcx,r8` |
| `0x9df035` | `9df035:	48 85 f6             	test   rsi,rsi` |
| `0x9df038` | `9df038:	0f 89 21 00 00 00    	jns    9df05f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6e8f>` |
| `0x9df03e` | `9df03e:	66 90                	xchg   ax,ax` |
| `0x9df040` | `9df040:	48 85 d2             	test   rdx,rdx` |
| `0x9df043` | `9df043:	74 1b                	je     9df060 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6e90>` |
| `0x9df045` | `9df045:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]` |
| `0x9df049` | `9df049:	48 8d 42 ff          	lea    rax,[rdx-0x1]` |
| `0x9df04d` | `9df04d:	4c 39 4c d1 f8       	cmp    QWORD PTR [rcx+rdx*8-0x8],r9` |
| `0x9df052` | `9df052:	77 08                	ja     9df05c <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6e8c>` |
| `0x9df054` | `9df054:	48 89 c2             	mov    rdx,rax` |
| `0x9df057` | `9df057:	73 e7                	jae    9df040 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x6e70>` |
| `0x9df059` | `9df059:	41 f7 d8             	neg    r8d` |
| `0x9df05c` | `9df05c:	44 89 c0             	mov    eax,r8d` |
| `0x9df31b` | `9df31b:	49 83 c5 01          	add    r13,0x1` |
| `0x9df31f` | `9df31f:	90                   	nop` |
| `0x9df320` | `9df320:	4d 89 ee             	mov    r14,r13` |
| `0x9df323` | `9df323:	49 83 fd 01          	cmp    r13,0x1` |
| `0x9df327` | `9df327:	74 28                	je     9df351 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7181>` |
| `0x9df329` | `9df329:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0x9df32d` | `9df32d:	4d 8d 6e ff          	lea    r13,[r14-0x1]` |
| `0x9df331` | `9df331:	4a 83 7c f0 f0 00    	cmp    QWORD PTR [rax+r14*8-0x10],0x0` |
| `0x9df337` | `9df337:	74 e7                	je     9df320 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7150>` |
| `0x9df339` | `9df339:	4d 8b 67 08          	mov    r12,QWORD PTR [r15+0x8]` |
| `0x9df33d` | `9df33d:	bd f6 ff ff ff       	mov    ebp,0xfffffff6` |
| `0x9df342` | `9df342:	4d 39 e5             	cmp    r13,r12` |
| `0x9df345` | `9df345:	0f 87 2d 02 00 00    	ja     9df578 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x73a8>` |
| `0x9df3c6` | `9df3c6:	49 89 c7             	mov    r15,rax` |
| `0x9df3c9` | `9df3c9:	e8 02 07 e1 00       	call   17efad0 <memcpy@plt>` |
| `0x9df3ce` | `9df3ce:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0x9df3d3` | `9df3d3:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]` |
| `0x9df3d7` | `9df3d7:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0x9df3dc` | `9df3dc:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]` |
| `0x9df3e0` | `9df3e0:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9df3e4` | `9df3e4:	e8 b7 d7 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9df3e9` | `9df3e9:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]` |
| `0x9df3ee` | `9df3ee:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]` |
| `0x9df3f2` | `9df3f2:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]` |
| `0x9df3f7` | `9df3f7:	e8 64 d4 ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9df3fc` | `9df3fc:	4c 89 f8             	mov    rax,r15` |
| `0x9df3ff` | `9df3ff:	4c 8b 54 24 08       	mov    r10,QWORD PTR [rsp+0x8]` |
| `0x9df404` | `9df404:	4d 89 62 08          	mov    QWORD PTR [r10+0x8],r12` |
| `0x9df408` | `9df408:	49 89 42 10          	mov    QWORD PTR [r10+0x10],rax` |
| `0x9df40c` | `9df40c:	4c 89 e2             	mov    rdx,r12` |
| `0x9df479` | `9df479:	4c 8b 54 24 08       	mov    r10,QWORD PTR [rsp+0x8]` |
| `0x9df47e` | `9df47e:	49 83 fe 01          	cmp    r14,0x1` |
| `0x9df482` | `9df482:	0f 84 e7 00 00 00    	je     9df56f <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x739f>` |
| `0x9df488` | `9df488:	4d 8b 42 10          	mov    r8,QWORD PTR [r10+0x10]` |
| `0x9df48c` | `9df48c:	49 8b 57 10          	mov    rdx,QWORD PTR [r15+0x10]` |
| `0x9df490` | `9df490:	48 8b 4b 10          	mov    rcx,QWORD PTR [rbx+0x10]` |
| `0x9df494` | `9df494:	49 83 fd 01          	cmp    r13,0x1` |
| `0x9df498` | `9df498:	75 06                	jne    9df4a0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x72d0>` |
| `0x9df49a` | `9df49a:	31 f6                	xor    esi,esi` |
| `0x9df49c` | `9df49c:	31 ff                	xor    edi,edi` |
| `0x9df49e` | `9df49e:	eb 5a                	jmp    9df4fa <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x732a>` |
| `0x9df4a0` | `9df4a0:	4d 89 e9             	mov    r9,r13` |
| `0x9df4a3` | `9df4a3:	49 83 e1 fe          	and    r9,0xfffffffffffffffe` |
| `0x9df5c6` | `9df5c6:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]` |
| `0x9df5cd` | `9df5cd:	00 00 00` |
| `0x9df5d0` | `9df5d0:	48 89 f2             	mov    rdx,rsi` |
| `0x9df5d3` | `9df5d3:	48 85 f6             	test   rsi,rsi` |
| `0x9df5d6` | `9df5d6:	74 10                	je     9df5e8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7418>` |
| `0x9df5d8` | `9df5d8:	48 8b 58 10          	mov    rbx,QWORD PTR [rax+0x10]` |
| `0x9df5dc` | `9df5dc:	48 8d 72 ff          	lea    rsi,[rdx-0x1]` |
| `0x9df5e0` | `9df5e0:	48 83 7c d3 f8 00    	cmp    QWORD PTR [rbx+rdx*8-0x8],0x0` |
| `0x9df5e6` | `9df5e6:	74 e8                	je     9df5d0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7400>` |
| `0x9df5e8` | `9df5e8:	48 8b 71 08          	mov    rsi,QWORD PTR [rcx+0x8]` |
| `0x9df5ec` | `9df5ec:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]` |
| `0x9df5f0` | `9df5f0:	48 89 f3             	mov    rbx,rsi` |
| `0x9df5f3` | `9df5f3:	48 85 f6             	test   rsi,rsi` |
| `0x9df615` | `9df615:	48 39 d3             	cmp    rbx,rdx` |
| `0x9df618` | `9df618:	0f 87 24 00 00 00    	ja     9df642 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7472>` |
| `0x9df61e` | `9df61e:	66 90                	xchg   ax,ax` |
| `0x9df620` | `9df620:	48 85 d2             	test   rdx,rdx` |
| `0x9df623` | `9df623:	74 34                	je     9df659 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7489>` |
| `0x9df625` | `9df625:	48 8b 68 10          	mov    rbp,QWORD PTR [rax+0x10]` |
| `0x9df629` | `9df629:	48 8d 72 ff          	lea    rsi,[rdx-0x1]` |
| `0x9df62d` | `9df62d:	48 8b 59 10          	mov    rbx,QWORD PTR [rcx+0x10]` |
| `0x9df631` | `9df631:	48 8b 5c d3 f8       	mov    rbx,QWORD PTR [rbx+rdx*8-0x8]` |
| `0x9df636` | `9df636:	48 39 5c d5 f8       	cmp    QWORD PTR [rbp+rdx*8-0x8],rbx` |
| `0x9df63b` | `9df63b:	77 1c                	ja     9df659 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7489>` |
| `0x9df63d` | `9df63d:	48 89 f2             	mov    rdx,rsi` |
| `0x9df640` | `9df640:	73 de                	jae    9df620 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7450>` |
| `0x9df6a9` | `9df6a9:	00 00 00` |
| `0x9df6ac` | `9df6ac:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]` |
| `0x9df6b0` | `9df6b0:	48 89 f2             	mov    rdx,rsi` |
| `0x9df6b3` | `9df6b3:	48 85 f6             	test   rsi,rsi` |
| `0x9df6b6` | `9df6b6:	74 10                	je     9df6c8 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x74f8>` |
| `0x9df6b8` | `9df6b8:	48 8b 58 10          	mov    rbx,QWORD PTR [rax+0x10]` |
| `0x9df6bc` | `9df6bc:	48 8d 72 ff          	lea    rsi,[rdx-0x1]` |
| `0x9df6c0` | `9df6c0:	48 83 7c d3 f8 00    	cmp    QWORD PTR [rbx+rdx*8-0x8],0x0` |
| `0x9df6c6` | `9df6c6:	74 e8                	je     9df6b0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x74e0>` |
| `0x9df6c8` | `9df6c8:	48 8b 71 08          	mov    rsi,QWORD PTR [rcx+0x8]` |
| `0x9df6cc` | `9df6cc:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]` |
| `0x9df6d0` | `9df6d0:	48 89 f3             	mov    rbx,rsi` |
| `0x9df6d3` | `9df6d3:	48 85 f6             	test   rsi,rsi` |
| `0x9df6f5` | `9df6f5:	48 39 d3             	cmp    rbx,rdx` |
| `0x9df6f8` | `9df6f8:	0f 87 24 00 00 00    	ja     9df722 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7552>` |
| `0x9df6fe` | `9df6fe:	66 90                	xchg   ax,ax` |
| `0x9df700` | `9df700:	48 85 d2             	test   rdx,rdx` |
| `0x9df703` | `9df703:	74 34                	je     9df739 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7569>` |
| `0x9df705` | `9df705:	48 8b 68 10          	mov    rbp,QWORD PTR [rax+0x10]` |
| `0x9df709` | `9df709:	48 8d 72 ff          	lea    rsi,[rdx-0x1]` |
| `0x9df70d` | `9df70d:	48 8b 59 10          	mov    rbx,QWORD PTR [rcx+0x10]` |
| `0x9df711` | `9df711:	48 8b 5c d3 f8       	mov    rbx,QWORD PTR [rbx+rdx*8-0x8]` |
| `0x9df716` | `9df716:	48 39 5c d5 f8       	cmp    QWORD PTR [rbp+rdx*8-0x8],rbx` |
| `0x9df71b` | `9df71b:	77 1c                	ja     9df739 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7569>` |
| `0x9df71d` | `9df71d:	48 89 f2             	mov    rdx,rsi` |
| `0x9df720` | `9df720:	73 de                	jae    9df700 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7530>` |
| `0x9df7a2` | `9df7a2:	48 89 c1             	mov    rcx,rax` |
| `0x9df7a5` | `9df7a5:	bd f4 ff ff ff       	mov    ebp,0xfffffff4` |
| `0x9df7aa` | `9df7aa:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]` |
| `0x9df7b0` | `9df7b0:	48 85 c9             	test   rcx,rcx` |
| `0x9df7b3` | `9df7b3:	0f 84 07 03 00 00    	je     9dfac0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x78f0>` |
| `0x9df7b9` | `9df7b9:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9df7bd` | `9df7bd:	48 83 7c ce f8 00    	cmp    QWORD PTR [rsi+rcx*8-0x8],0x0` |
| `0x9df7c3` | `9df7c3:	48 8d 49 ff          	lea    rcx,[rcx-0x1]` |
| `0x9df7c7` | `9df7c7:	0f 84 e3 ff ff ff    	je     9df7b0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x75e0>` |
| `0x9df7cd` | `9df7cd:	48 89 54 24 08       	mov    QWORD PTR [rsp+0x8],rdx` |
| `0x9df7d2` | `9df7d2:	83 3b 00             	cmp    DWORD PTR [rbx],0x0` |
| `0x9df7d5` | `9df7d5:	0f 84 e5 02 00 00    	je     9dfac0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x78f0>` |
| `0x9df7db` | `9df7db:	c7 44 24 78 01 00 00 	mov    DWORD PTR [rsp+0x78],0x1` |
| `0x9df82c` | `9df82c:	48 8d 51 ff          	lea    rdx,[rcx-0x1]` |
| `0x9df830` | `9df830:	48 83 7c ce f8 00    	cmp    QWORD PTR [rsi+rcx*8-0x8],0x0` |
| `0x9df836` | `9df836:	74 e8                	je     9df820 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7650>` |
| `0x9df838` | `9df838:	e9 13 00 00 00       	jmp    9df850 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7680>` |
| `0x9df83d` | `9df83d:	0f 1f 00             	nop    DWORD PTR [rax]` |
| `0x9df840` | `9df840:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9df844` | `9df844:	48 8d 42 ff          	lea    rax,[rdx-0x1]` |
| `0x9df848` | `9df848:	48 83 7c d6 f8 00    	cmp    QWORD PTR [rsi+rdx*8-0x8],0x0` |
| `0x9df84e` | `9df84e:	75 08                	jne    9df858 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7688>` |
| `0x9df850` | `9df850:	48 89 c2             	mov    rdx,rax` |
| `0x9df853` | `9df853:	48 85 c0             	test   rax,rax` |
| `0x9df856` | `9df856:	75 e8                	jne    9df840 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x7670>` |
| `0x9df858` | `9df858:	48 39 d1             	cmp    rcx,rdx` |
| `0x9df86e` | `9df86e:	66 90                	xchg   ax,ax` |
| `0x9df870` | `9df870:	48 85 c9             	test   rcx,rcx` |
| `0x9df873` | `9df873:	74 65                	je     9df8da <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x770a>` |
| `0x9df875` | `9df875:	49 8b 55 10          	mov    rdx,QWORD PTR [r13+0x10]` |
| `0x9df879` | `9df879:	48 8d 41 ff          	lea    rax,[rcx-0x1]` |
| `0x9df87d` | `9df87d:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9df881` | `9df881:	48 8b 74 ce f8       	mov    rsi,QWORD PTR [rsi+rcx*8-0x8]` |
| `0x9df886` | `9df886:	48 39 74 ca f8       	cmp    QWORD PTR [rdx+rcx*8-0x8],rsi` |
| `0x9df88b` | `9df88b:	77 4d                	ja     9df8da <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x770a>` |
| `0x9df88d` | `9df88d:	48 89 c1             	mov    rcx,rax` |
| `0x9df890` | `9df890:	73 de                	jae    9df870 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x76a0>` |
| `0x9df892` | `9df892:	4d 85 e4             	test   r12,r12` |
| `0x9df895` | `9df895:	74 18                	je     9df8af <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x76df>` |
| `0x9e0365` | `9e0365:	66 2e 0f 1f 84 00 00 	cs nop WORD PTR [rax+rax*1+0x0]` |
| `0x9e036c` | `9e036c:	00 00 00` |
| `0x9e036f` | `9e036f:	90                   	nop` |
| `0x9e0370` | `9e0370:	48 85 c0             	test   rax,rax` |
| `0x9e0373` | `9e0373:	74 19                	je     9e038e <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x81be>` |
| `0x9e0375` | `9e0375:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]` |
| `0x9e0379` | `9e0379:	48 83 7c c2 f8 00    	cmp    QWORD PTR [rdx+rax*8-0x8],0x0` |
| `0x9e037f` | `9e037f:	48 8d 40 ff          	lea    rax,[rax-0x1]` |
| `0x9e0383` | `9e0383:	74 eb                	je     9e0370 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x81a0>` |
| `0x9e0385` | `9e0385:	83 3b 00             	cmp    DWORD PTR [rbx],0x0` |
| `0x9e0388` | `9e0388:	0f 88 3e 01 00 00    	js     9e04cc <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x82fc>` |
| `0x9e038e` | `9e038e:	4c 89 ff             	mov    rdi,r15` |
| `0x9e0391` | `9e0391:	31 f6                	xor    esi,esi` |
| `0x9e03a6` | `9e03a6:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]` |
| `0x9e03aa` | `9e03aa:	48 89 c8             	mov    rax,rcx` |
| `0x9e03ad` | `9e03ad:	0f 1f 00             	nop    DWORD PTR [rax]` |
| `0x9e03b0` | `9e03b0:	48 85 c0             	test   rax,rax` |
| `0x9e03b3` | `9e03b3:	0f 84 97 00 00 00    	je     9e0450 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8280>` |
| `0x9e03b9` | `9e03b9:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]` |
| `0x9e03bd` | `9e03bd:	48 83 7c c2 f8 00    	cmp    QWORD PTR [rdx+rax*8-0x8],0x0` |
| `0x9e03c3` | `9e03c3:	48 8d 40 ff          	lea    rax,[rax-0x1]` |
| `0x9e03c7` | `9e03c7:	74 e7                	je     9e03b0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x81e0>` |
| `0x9e03c9` | `9e03c9:	41 83 3e 00          	cmp    DWORD PTR [r14],0x0` |
| `0x9e03cd` | `9e03cd:	0f 89 7d 00 00 00    	jns    9e0450 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8280>` |
| `0x9e03d3` | `9e03d3:	4c 89 ff             	mov    rdi,r15` |
| `0x9e03d6` | `9e03d6:	4c 89 f6             	mov    rsi,r14` |
| `0x9e0412` | `9e0412:	0f 8f bb 00 00 00    	jg     9e04d3 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8303>` |
| `0x9e0418` | `9e0418:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]` |
| `0x9e041f` | `9e041f:	00` |
| `0x9e0420` | `9e0420:	48 85 c0             	test   rax,rax` |
| `0x9e0423` | `9e0423:	0f 84 88 00 00 00    	je     9e04b1 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x82e1>` |
| `0x9e0429` | `9e0429:	49 8b 76 10          	mov    rsi,QWORD PTR [r14+0x10]` |
| `0x9e042d` | `9e042d:	48 8d 50 ff          	lea    rdx,[rax-0x1]` |
| `0x9e0431` | `9e0431:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]` |
| `0x9e0435` | `9e0435:	48 8b 7c c7 f8       	mov    rdi,QWORD PTR [rdi+rax*8-0x8]` |
| `0x9e043a` | `9e043a:	48 39 7c c6 f8       	cmp    QWORD PTR [rsi+rax*8-0x8],rdi` |
| `0x9e043f` | `9e043f:	77 6c                	ja     9e04ad <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x82dd>` |
| `0x9e0441` | `9e0441:	48 89 d0             	mov    rax,rdx` |
| `0x9e0444` | `9e0444:	73 da                	jae    9e0420 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8250>` |
| `0x9e0446` | `9e0446:	f7 d9                	neg    ecx` |
| `0x9e0448` | `9e0448:	e9 60 00 00 00       	jmp    9e04ad <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x82dd>` |
| `0x9e044d` | `9e044d:	0f 1f 00             	nop    DWORD PTR [rax]` |
| `0x9e0450` | `9e0450:	48 89 c8             	mov    rax,rcx` |
| `0x9e0453` | `9e0453:	48 85 c9             	test   rcx,rcx` |
| `0x9e0456` | `9e0456:	74 10                	je     9e0468 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8298>` |
| `0x9e0458` | `9e0458:	49 8b 56 10          	mov    rdx,QWORD PTR [r14+0x10]` |
| `0x9e045c` | `9e045c:	48 8d 48 ff          	lea    rcx,[rax-0x1]` |
| `0x9e0460` | `9e0460:	48 83 7c c2 f8 00    	cmp    QWORD PTR [rdx+rax*8-0x8],0x0` |
| `0x9e0466` | `9e0466:	74 e8                	je     9e0450 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8280>` |
| `0x9e0468` | `9e0468:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]` |
| `0x9e046c` | `9e046c:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]` |
| `0x9e0470` | `9e0470:	48 89 d1             	mov    rcx,rdx` |
| `0x9e0473` | `9e0473:	48 85 d2             	test   rdx,rdx` |
| `0x9e0476` | `9e0476:	74 10                	je     9e0488 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x82b8>` |
| `0x9e0478` | `9e0478:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]` |
| `0x9e047c` | `9e047c:	48 8d 51 ff          	lea    rdx,[rcx-0x1]` |
| `0x9e0480` | `9e0480:	48 83 7c ce f8 00    	cmp    QWORD PTR [rsi+rcx*8-0x8],0x0` |
| `0x9e0486` | `9e0486:	74 e8                	je     9e0470 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x82a0>` |
| `0x9e0488` | `9e0488:	48 89 ca             	mov    rdx,rcx` |
| `0x9e048b` | `9e048b:	48 09 c2             	or     rdx,rax` |
| `0x9e048e` | `9e048e:	74 21                	je     9e04b1 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x82e1>` |
| `0x9e0490` | `9e0490:	48 39 c8             	cmp    rax,rcx` |
| `0x9e08bf` | `9e08bf:	e8 7c bc ff ff       	call   9dc540 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4370>` |
| `0x9e08c4` | `9e08c4:	48 85 c0             	test   rax,rax` |
| `0x9e08c7` | `9e08c7:	0f 84 6d fe ff ff    	je     9e073a <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x856a>` |
| `0x9e08cd` | `9e08cd:	48 89 c5             	mov    rbp,rax` |
| `0x9e08d0` | `9e08d0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0x9e08d5` | `9e08d5:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]` |
| `0x9e08d9` | `9e08d9:	48 85 f6             	test   rsi,rsi` |
| `0x9e08dc` | `9e08dc:	74 43                	je     9e0921 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8751>` |
| `0x9e08de` | `9e08de:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]` |
| `0x9e08e2` | `9e08e2:	48 c1 e2 03          	shl    rdx,0x3` |
| `0x9e08e6` | `9e08e6:	48 89 ef             	mov    rdi,rbp` |
| `0x9e08e9` | `9e08e9:	e8 e2 f1 e0 00       	call   17efad0 <memcpy@plt>` |
| `0x9e08ee` | `9e08ee:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0x9e08f3` | `9e08f3:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]` |
| `0x9e08f7` | `9e08f7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0x9e08fc` | `9e08fc:	48 8b 78 10          	mov    rdi,QWORD PTR [rax+0x10]` |
| `0x9e0900` | `9e0900:	48 c1 e6 03          	shl    rsi,0x3` |
| `0x9e0904` | `9e0904:	e8 97 c2 ff ff       	call   9dcba0 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x49d0>` |
| `0x9e0909` | `9e0909:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0x9e090e` | `9e090e:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]` |
| `0x9e0912` | `9e0912:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0x9e0917` | `9e0917:	e8 44 bf ff ff       	call   9dc860 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x4690>` |
| `0x9e091c` | `9e091c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]` |
| `0x9e0921` | `9e0921:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12` |
| `0x9e0925` | `9e0925:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp` |
| `0x9e0929` | `9e0929:	48 8d ac 24 e8 00 00 	lea    rbp,[rsp+0xe8]` |
| `0x9e0930` | `9e0930:	00` |
| `0x9e0931` | `9e0931:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]` |
| `0x9e0936` | `9e0936:	eb 10                	jmp    9e0948 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x8778>` |
| `0x9e0938` | `9e0938:	48 8d ac 24 e8 00 00 	lea    rbp,[rsp+0xe8]` |
| `0x9e093f` | `9e093f:	00` |
| `0x9e0940` | `9e0940:	4d 85 e4             	test   r12,r12` |
| `0x9e0f10` | `9e0f10:	49 8b 50 08          	mov    rdx,QWORD PTR [r8+0x8]` |
| ... | truncated 335380 more |

## e99c54 bridge window `0xe99c54`

```text
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
```
## e99d07 window `0xe99d07`

```text
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
  e99f36:	41 59                	pop    r9
  e99f38:	48 89 df             	mov    rdi,rbx
  e99f3b:	e8 88 d5 74 00       	call   15e74c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ca4c>
  e99f40:	80 7b 18 00          	cmp    BYTE PTR [rbx+0x18],0x0
  e99f44:	74 18                	je     e99f5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61374>
  e99f46:	48 8d 35 ee 92 53 ff 	lea    rsi,[rip+0xffffffffff5392ee]        # 3d323b <_ZTSN5boost17bad_function_callE@@Base+0x581>
  e99f4d:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f54:	00
  e99f55:	e8 f5 18 be ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
  e99f5a:	89 c3                	mov    ebx,eax
  e99f5c:	eb 02                	jmp    e99f60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x61376>
  e99f5e:	31 db                	xor    ebx,ebx
  e99f60:	4c 89 bc 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],r15
  e99f67:	00
  e99f68:	48 8d bc 24 70 07 00 	lea    rdi,[rsp+0x770]
  e99f6f:	00
  e99f70:	e8 bb cd c0 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  e99f75:	88 9c 24 29 07 00 00 	mov    BYTE PTR [rsp+0x729],bl
```
## fd4c04 window `0xfd4c04`

```text
  fd4b87:	4c 89 ff             	mov    rdi,r15
  fd4b8a:	e8 83 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4b8f:	4c 89 f7             	mov    rdi,r14
  fd4b92:	e8 7b 07 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4b97:	48 89 e7             	mov    rdi,rsp
  fd4b9a:	e8 dd 73 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd4b9f:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fd4ba4:	e8 dd 98 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4ba9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4bb0:	00 00
  fd4bb2:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
  fd4bb9:	00
  fd4bba:	75 14                	jne    fd4bd0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bfe6>
  fd4bbc:	48 89 d8             	mov    rax,rbx
  fd4bbf:	48 81 c4 d0 00 00 00 	add    rsp,0xd0
  fd4bc6:	5b                   	pop    rbx
  fd4bc7:	41 5c                	pop    r12
  fd4bc9:	41 5d                	pop    r13
  fd4bcb:	41 5e                	pop    r14
  fd4bcd:	41 5f                	pop    r15
  fd4bcf:	c3                   	ret
  fd4bd0:	e8 db ae 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4bd5:	48 89 c7             	mov    rdi,rax
  fd4bd8:	e8 c8 4e aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4bdd:	cc                   	int3
  fd4bde:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd4be2:	e9 ff fb ff ff       	jmp    fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
  fd4be7:	cc                   	int3
  fd4be8:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd4bec:	e9 37 fc ff ff       	jmp    fd4828 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bc3e>
  fd4bf1:	cc                   	int3
  fd4bf2:	53                   	push   rbx
  fd4bf3:	48 89 fb             	mov    rbx,rdi
  fd4bf6:	48 83 c6 f8          	add    rsi,0xfffffffffffffff8
  fd4bfa:	e8 93 fe ff ff       	call   fd4a92 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bea8>
  fd4bff:	48 89 d8             	mov    rax,rbx
  fd4c02:	5b                   	pop    rbx
  fd4c03:	c3                   	ret
  fd4c04:	41 56                	push   r14
  fd4c06:	53                   	push   rbx
  fd4c07:	50                   	push   rax
  fd4c08:	48 89 fb             	mov    rbx,rdi
  fd4c0b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd4c0e:	48 85 c0             	test   rax,rax
  fd4c11:	74 21                	je     fd4c34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c04a>
  fd4c13:	84 d2                	test   dl,dl
  fd4c15:	74 1d                	je     fd4c34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c04a>
  fd4c17:	48 89 03             	mov    QWORD PTR [rbx],rax
  fd4c1a:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
  fd4c1e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  fd4c22:	48 85 c0             	test   rax,rax
  fd4c25:	74 05                	je     fd4c2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c042>
  fd4c27:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  fd4c2c:	48 83 c4 08          	add    rsp,0x8
  fd4c30:	5b                   	pop    rbx
  fd4c31:	41 5e                	pop    r14
  fd4c33:	c3                   	ret
  fd4c34:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
  fd4c38:	bf 88 00 00 00       	mov    edi,0x88
  fd4c3d:	e8 be 92 81 00       	call   17edf00 <_Znwm@plt>
  fd4c42:	48 89 c2             	mov    rdx,rax
  fd4c45:	0f 57 c0             	xorps  xmm0,xmm0
  fd4c48:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4c4c:	48 8d 0d 6d 5b 86 00 	lea    rcx,[rip+0x865b6d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  fd4c53:	48 89 08             	mov    QWORD PTR [rax],rcx
  fd4c56:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
  fd4c5a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
  fd4c5e:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
  fd4c62:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
  fd4c66:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
  fd4c6a:	48 85 c9             	test   rcx,rcx
  fd4c6d:	74 05                	je     fd4c74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c08a>
  fd4c6f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4c74:	48 8d 0d 45 d3 86 00 	lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
  fd4c7b:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
  fd4c7f:	48 8d 0d 2a d5 86 00 	lea    rcx,[rip+0x86d52a]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
  fd4c86:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
  fd4c8a:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
  fd4c8e:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
  fd4c92:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
  fd4c96:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
  fd4c9a:	48 85 c9             	test   rcx,rcx
  fd4c9d:	74 05                	je     fd4ca4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0ba>
  fd4c9f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4ca4:	48 83 c0 18          	add    rax,0x18
  fd4ca8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  fd4cac:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
  fd4cb0:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
  fd4cb4:	48 89 4a 60          	mov    QWORD PTR [rdx+0x60],rcx
  fd4cb8:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
  fd4cbc:	48 89 4a 68          	mov    QWORD PTR [rdx+0x68],rcx
  fd4cc0:	48 85 c9             	test   rcx,rcx
  fd4cc3:	74 05                	je     fd4cca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0e0>
  fd4cc5:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4cca:	49 8b 4e 68          	mov    rcx,QWORD PTR [r14+0x68]
  fd4cce:	48 89 8a 80 00 00 00 	mov    QWORD PTR [rdx+0x80],rcx
  fd4cd5:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
  fd4cda:	0f 11 42 70          	movups XMMWORD PTR [rdx+0x70],xmm0
  fd4cde:	48 89 df             	mov    rdi,rbx
  fd4ce1:	48 89 c6             	mov    rsi,rax
  fd4ce4:	e8 1b 9b f2 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  fd4ce9:	31 ff                	xor    edi,edi
  fd4ceb:	48 83 c4 08          	add    rsp,0x8
  fd4cef:	5b                   	pop    rbx
  fd4cf0:	41 5e                	pop    r14
  fd4cf2:	e9 25 97 ac ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4cf7:	48 89 c7             	mov    rdi,rax
  fd4cfa:	e8 a6 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4cff:	cc                   	int3
  fd4d00:	41 57                	push   r15
  fd4d02:	41 56                	push   r14
  fd4d04:	41 55                	push   r13
  fd4d06:	41 54                	push   r12
  fd4d08:	53                   	push   rbx
  fd4d09:	48 83 ec 40          	sub    rsp,0x40
  fd4d0d:	49 89 f7             	mov    r15,rsi
  fd4d10:	48 89 fb             	mov    rbx,rdi
  fd4d13:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4d1a:	00 00
  fd4d1c:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  fd4d21:	bf 80 00 00 00       	mov    edi,0x80
  fd4d26:	e8 d5 91 81 00       	call   17edf00 <_Znwm@plt>
  fd4d2b:	49 89 c6             	mov    r14,rax
  fd4d2e:	0f 57 c0             	xorps  xmm0,xmm0
  fd4d31:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4d35:	48 8d 05 6c 57 86 00 	lea    rax,[rip+0x86576c]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
  fd4d3c:	49 89 06             	mov    QWORD PTR [r14],rax
  fd4d3f:	4d 89 f4             	mov    r12,r14
  fd4d42:	49 83 c4 18          	add    r12,0x18
  fd4d46:	49 89 e5             	mov    r13,rsp
  fd4d49:	4c 89 ef             	mov    rdi,r13
  fd4d4c:	4c 89 fe             	mov    rsi,r15
  fd4d4f:	e8 30 0e f5 ff       	call   f25b84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf9a>
  fd4d54:	4c 89 e7             	mov    rdi,r12
  fd4d57:	4c 89 ee             	mov    rsi,r13
  fd4d5a:	e8 bb 0d f5 ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
  fd4d5f:	4c 89 ef             	mov    rdi,r13
  fd4d62:	e8 ab 05 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd4d67:	4c 89 23             	mov    QWORD PTR [rbx],r12
  fd4d6a:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  fd4d6e:	31 ff                	xor    edi,edi
  fd4d70:	e8 a7 96 ac ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4d75:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4d7c:	00 00
  fd4d7e:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
  fd4d83:	75 0e                	jne    fd4d93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1a9>
  fd4d85:	48 83 c4 40          	add    rsp,0x40
  fd4d89:	5b                   	pop    rbx
  fd4d8a:	41 5c                	pop    r12
  fd4d8c:	41 5d                	pop    r13
  fd4d8e:	41 5e                	pop    r14
  fd4d90:	41 5f                	pop    r15
  fd4d92:	c3                   	ret
  fd4d93:	e8 18 ad 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4d98:	48 89 c7             	mov    rdi,rax
  fd4d9b:	e8 05 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4da0:	53                   	push   rbx
  fd4da1:	48 89 fb             	mov    rbx,rdi
  fd4da4:	48 8d 05 2d d4 86 00 	lea    rax,[rip+0x86d42d]        # 18421d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14170>
  fd4dab:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd4dae:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
  fd4db2:	e8 cf 96 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4db7:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  fd4dbb:	5b                   	pop    rbx
  fd4dbc:	e9 f1 96 ac ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd4dc1:	cc                   	int3
  fd4dc2:	53                   	push   rbx
  fd4dc3:	48 89 fb             	mov    rbx,rdi
  fd4dc6:	e8 d5 ff ff ff       	call   fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
  fd4dcb:	48 89 df             	mov    rdi,rbx
  fd4dce:	5b                   	pop    rbx
  fd4dcf:	e9 4c 91 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd4dd4:	53                   	push   rbx
  fd4dd5:	48 89 fb             	mov    rbx,rdi
  fd4dd8:	e8 05 00 00 00       	call   fd4de2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1f8>
  fd4ddd:	48 89 d8             	mov    rax,rbx
  fd4de0:	5b                   	pop    rbx
  fd4de1:	c3                   	ret
  fd4de2:	55                   	push   rbp
  fd4de3:	41 57                	push   r15
  fd4de5:	41 56                	push   r14
  fd4de7:	41 55                	push   r13
  fd4de9:	41 54                	push   r12
  fd4deb:	53                   	push   rbx
  fd4dec:	48 83 ec 68          	sub    rsp,0x68
  fd4df0:	48 89 fb             	mov    rbx,rdi
  fd4df3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4dfa:	00 00
  fd4dfc:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  fd4e01:	48 83 c6 08          	add    rsi,0x8
  fd4e05:	48 89 e7             	mov    rdi,rsp
  fd4e08:	e8 4d 70 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd4e0d:	bf 80 00 00 00       	mov    edi,0x80
  fd4e12:	e8 e9 90 81 00       	call   17edf00 <_Znwm@plt>
  fd4e17:	49 89 c6             	mov    r14,rax
  fd4e1a:	0f 57 c0             	xorps  xmm0,xmm0
  fd4e1d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4e21:	48 8d 05 80 56 86 00 	lea    rax,[rip+0x865680]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
```
## fd381a window `0xfd381a`

```text
  fd379b:	75 12                	jne    fd37af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19abc5>
  fd379d:	48 81 c4 c8 0c 00 00 	add    rsp,0xcc8
  fd37a4:	5b                   	pop    rbx
  fd37a5:	41 5c                	pop    r12
  fd37a7:	41 5d                	pop    r13
  fd37a9:	41 5e                	pop    r14
  fd37ab:	41 5f                	pop    r15
  fd37ad:	5d                   	pop    rbp
  fd37ae:	c3                   	ret
  fd37af:	e8 fc c2 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd37b4:	48 89 c7             	mov    rdi,rax
  fd37b7:	e8 e9 62 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd37bc:	48 89 c3             	mov    rbx,rax
  fd37bf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fd37c4:	e8 01 3b 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  fd37c9:	eb 03                	jmp    fd37ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19abe4>
  fd37cb:	48 89 c3             	mov    rbx,rax
  fd37ce:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  fd37d3:	e8 58 35 ad ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  fd37d8:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  fd37dd:	e8 a4 ac ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd37e2:	48 89 df             	mov    rdi,rbx
  fd37e5:	e8 bb 62 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd37ea:	48 83 c7 08          	add    rdi,0x8
  fd37ee:	e9 f9 fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd37f3:	cc                   	int3
  fd37f4:	53                   	push   rbx
  fd37f5:	48 89 fb             	mov    rbx,rdi
  fd37f8:	48 83 c7 08          	add    rdi,0x8
  fd37fc:	e8 eb fb ff ff       	call   fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd3801:	48 89 df             	mov    rdi,rbx
  fd3804:	5b                   	pop    rbx
  fd3805:	e9 16 a7 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd380a:	e9 dd fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd380f:	cc                   	int3
  fd3810:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd3814:	e9 db ff ff ff       	jmp    fd37f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac0a>
  fd3819:	cc                   	int3
  fd381a:	41 56                	push   r14
  fd381c:	53                   	push   rbx
  fd381d:	48 83 ec 28          	sub    rsp,0x28
  fd3821:	49 89 f6             	mov    r14,rsi
  fd3824:	48 89 fb             	mov    rbx,rdi
  fd3827:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd382e:	00 00
  fd3830:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  fd3835:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
  fd3839:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd383c:	ff 50 70             	call   QWORD PTR [rax+0x70]
  fd383f:	41 80 7e 68 00       	cmp    BYTE PTR [r14+0x68],0x0
  fd3844:	74 3c                	je     fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
  fd3846:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  fd384a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd384d:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd3853:	85 c0                	test   eax,eax
  fd3855:	75 2b                	jne    fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
  fd3857:	48 8d 35 2c 38 37 ff 	lea    rsi,[rip+0xffffffffff37382c]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd385e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd3863:	6a 07                	push   0x7
  fd3865:	5a                   	pop    rdx
  fd3866:	e8 af 91 ac ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  fd386b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  fd3870:	48 89 df             	mov    rdi,rbx
  fd3873:	e8 b4 01 d5 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fd3878:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd387d:	e8 0e a6 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fd3882:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3889:	00 00
  fd388b:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fd3890:	75 3f                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
  fd3892:	48 89 d8             	mov    rax,rbx
  fd3895:	48 83 c4 28          	add    rsp,0x28
  fd3899:	5b                   	pop    rbx
  fd389a:	41 5e                	pop    r14
  fd389c:	c3                   	ret
  fd389d:	49 89 c6             	mov    r14,rax
  fd38a0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd38a5:	e8 e6 a5 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fd38aa:	eb 05                	jmp    fd38b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc7>
  fd38ac:	eb 00                	jmp    fd38ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc4>
  fd38ae:	49 89 c6             	mov    r14,rax
  fd38b1:	48 89 df             	mov    rdi,rbx
  fd38b4:	e8 ad ed b0 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  fd38b9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38c0:	00 00
  fd38c2:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fd38c7:	75 08                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
  fd38c9:	4c 89 f7             	mov    rdi,r14
  fd38cc:	e8 ff c3 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  fd38d1:	e8 da c1 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd38d6:	41 57                	push   r15
  fd38d8:	41 56                	push   r14
  fd38da:	41 55                	push   r13
  fd38dc:	41 54                	push   r12
  fd38de:	53                   	push   rbx
  fd38df:	48 83 ec 20          	sub    rsp,0x20
  fd38e3:	49 89 ce             	mov    r14,rcx
  fd38e6:	49 89 d7             	mov    r15,rdx
  fd38e9:	49 89 f4             	mov    r12,rsi
  fd38ec:	48 89 fb             	mov    rbx,rdi
  fd38ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38f6:	00 00
  fd38f8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  fd38fd:	48 89 d7             	mov    rdi,rdx
  fd3900:	e8 31 7f aa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  fd3905:	48 89 d1             	mov    rcx,rdx
  fd3908:	48 8d 3d 7b 37 37 ff 	lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd390f:	6a 07                	push   0x7
  fd3911:	5e                   	pop    rsi
  fd3912:	48 89 c2             	mov    rdx,rax
  fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  fd391a:	84 c0                	test   al,al
  fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
  fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd392c:	85 c0                	test   eax,eax
  fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
  fd3930:	49 83 c4 08          	add    r12,0x8
  fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  fd3939:	4c 89 ef             	mov    rdi,r13
  fd393c:	4c 89 e6             	mov    rsi,r12
  fd393f:	4c 89 fa             	mov    rdx,r15
  fd3942:	4c 89 f1             	mov    rcx,r14
  fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
  fd394a:	48 89 df             	mov    rdi,rbx
  fd394d:	4c 89 ee             	mov    rsi,r13
  fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
  fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3965:	00 00
  fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>
  fd396e:	48 89 d8             	mov    rax,rbx
  fd3971:	48 83 c4 20          	add    rsp,0x20
  fd3975:	5b                   	pop    rbx
  fd3976:	41 5c                	pop    r12
  fd3978:	41 5d                	pop    r13
  fd397a:	41 5e                	pop    r14
  fd397c:	41 5f                	pop    r15
  fd397e:	c3                   	ret
  fd397f:	41 80 7c 24 68 00    	cmp    BYTE PTR [r12+0x68],0x0
  fd3985:	74 a9                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3987:	41 80 7e 60 00       	cmp    BYTE PTR [r14+0x60],0x0
  fd398c:	74 a2                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd398e:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
  fd3992:	49 3b 44 24 58       	cmp    rax,QWORD PTR [r12+0x58]
  fd3997:	7e 97                	jle    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3999:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
  fd399e:	48 39 f0             	cmp    rax,rsi
  fd39a1:	7d 8d                	jge    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39a3:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
  fd39a8:	48 ff c6             	inc    rsi
  fd39ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd39ae:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fd39b1:	e9 7a ff ff ff       	jmp    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39b6:	e8 f5 c0 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd39bb:	cc                   	int3
  fd39bc:	55                   	push   rbp
  fd39bd:	41 57                	push   r15
  fd39bf:	41 56                	push   r14
  fd39c1:	41 55                	push   r13
  fd39c3:	41 54                	push   r12
  fd39c5:	53                   	push   rbx
  fd39c6:	48 81 ec 58 01 00 00 	sub    rsp,0x158
  fd39cd:	49 89 f4             	mov    r12,rsi
  fd39d0:	49 89 ff             	mov    r15,rdi
  fd39d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd39da:	00 00
  fd39dc:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  fd39e3:	00
  fd39e4:	48 8d 5e 10          	lea    rbx,[rsi+0x10]
  fd39e8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  fd39ef:	00
  fd39f0:	48 89 de             	mov    rsi,rbx
  fd39f3:	e8 62 84 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd39f8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  fd39ff:	00
  fd3a00:	48 89 de             	mov    rsi,rbx
  fd3a03:	e8 52 84 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd3a08:	66 0f ef c0          	pxor   xmm0,xmm0
  fd3a0c:	48 8d 94 24 e0 00 00 	lea    rdx,[rsp+0xe0]
  fd3a13:	00
  fd3a14:	66 0f 7f 02          	movdqa XMMWORD PTR [rdx],xmm0
  fd3a18:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
  fd3a1d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
  fd3a24:	00
  fd3a25:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  fd3a2c:	00
  fd3a2d:	48 89 df             	mov    rdi,rbx
  fd3a30:	e8 25 16 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd3a35:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  fd3a39:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
  fd3a3d:	48 85 f6             	test   rsi,rsi
  fd3a40:	74 3e                	je     fd3a80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ae96>
  fd3a42:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd3a45:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
```
