# Smart skip interval-provider object origins

Known final pointers:
- dependency+0xb08 = [rsp+0x70] + 0x10
- dependency+0xb10 = [rsp+0x48] + 0x10

## All writes/reads of rsp+0x70
### 0x135d0f7: mov    QWORD PTR [rsp+0x70],rcx
     135d0c3:	00 
     135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
     135d0cb:	00 
     135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
     135d0d3:	00 
     135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
     135d0db:	00 
     135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
     135d0e3:	00 
     135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
     135d0eb:	00 
     135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
     135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
     135d0f4:	48 89 f5             	mov    rbp,rsi
     135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
     135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
     135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
     135d108:	00 
     135d109:	4c 8d 6f 10          	lea    r13,[rdi+0x10]
     135d10d:	48 8d 47 20          	lea    rax,[rdi+0x20]
     135d111:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
     135d118:	00 
     135d119:	48 8d 87 80 00 00 00 	lea    rax,[rdi+0x80]
     135d120:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     135d127:	00 
     135d128:	48 8d 87 88 00 00 00 	lea    rax,[rdi+0x88]
     135d12f:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     135d136:	00 
     135d137:	48 8d 87 a0 00 00 00 	lea    rax,[rdi+0xa0]
     135d13e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     135d145:	00 
     135d146:	48 8d 87 a8 00 00 00 	lea    rax,[rdi+0xa8]
     135d14d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
     135d154:	00 
     135d155:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
     135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     135d163:	00 
     135d164:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
     135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
     135d172:	00 
     135d173:	48 8d 87 c0 00 00 00 	lea    rax,[rdi+0xc0]
     135d17a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax

### 0x135dcc5: mov    r15,QWORD PTR [rsp+0x70]
     135dc95:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     135dc98:	48 89 28             	mov    QWORD PTR [rax],rbp
     135dc9b:	48 85 ff             	test   rdi,rdi
     135dc9e:	74 06                	je     135dca6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a322a>
     135dca0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dca3:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dca6:	48 8d bc 24 e0 08 00 	lea    rdi,[rsp+0x8e0]
     135dcad:	00 
     135dcae:	e8 b3 f3 74 ff       	call   aad066 <JNI_OnUnload@@Base+0x34933>
     135dcb3:	6a 08                	push   0x8
     135dcb5:	5f                   	pop    rdi
     135dcb6:	e8 45 02 49 00       	call   17edf00 <_Znwm@plt>
     135dcbb:	48 8b 5c 24 30       	mov    rbx,QWORD PTR [rsp+0x30]
     135dcc0:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
     135dcc5:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135dcca:	48 8d 0d d7 bf 50 00 	lea    rcx,[rip+0x50bfd7]        # 1869ca8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26390>
     135dcd1:	48 89 08             	mov    QWORD PTR [rax],rcx
     135dcd4:	48 8b 8c 24 c8 00 00 	mov    rcx,QWORD PTR [rsp+0xc8]
     135dcdb:	00 
     135dcdc:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135dcdf:	48 89 01             	mov    QWORD PTR [rcx],rax
     135dce2:	48 85 ff             	test   rdi,rdi
     135dce5:	74 06                	je     135dced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a3271>
     135dce7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcea:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135dced:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     135dcf2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135dcf5:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135dcf8:	49 89 c4             	mov    r12,rax
     135dcfb:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dcfe:	4c 89 ff             	mov    rdi,r15
     135dd01:	ff 50 40             	call   QWORD PTR [rax+0x40]
     135dd04:	49 89 c5             	mov    r13,rax
     135dd07:	49 8b 07             	mov    rax,QWORD PTR [r15]
     135dd0a:	4c 89 ff             	mov    rdi,r15
     135dd0d:	ff 50 30             	call   QWORD PTR [rax+0x30]
     135dd10:	48 8d bc 24 b0 08 00 	lea    rdi,[rsp+0x8b0]
     135dd17:	00 
     135dd18:	48 89 c6             	mov    rsi,rax
     135dd1b:	e8 70 c5 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135dd20:	48 8b b4 24 68 10 00 	mov    rsi,QWORD PTR [rsp+0x1068]
     135dd27:	00 

### 0x135dde1: mov    QWORD PTR [rsp+0x70],r15
     135ddad:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     135ddb1:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
     135ddb8:	00 
     135ddb9:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135ddbc:	48 89 01             	mov    QWORD PTR [rcx],rax
     135ddbf:	48 85 ff             	test   rdi,rdi
     135ddc2:	74 06                	je     135ddca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a334e>
     135ddc4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ddc7:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135ddca:	41 80 7e 04 00       	cmp    BYTE PTR [r14+0x4],0x0
     135ddcf:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135ddd6:	00 
     135ddd7:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
     135dddc:	4c 89 6c 24 68       	mov    QWORD PTR [rsp+0x68],r13
     135dde1:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
     135dde6:	74 30                	je     135de18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a339c>
     135dde8:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     135ddec:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     135ddf3:	00 
     135ddf4:	b8 d0 07 00 00       	mov    eax,0x7d0
     135ddf9:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     135de00:	00 
     135de01:	6a 01                	push   0x1
     135de03:	58                   	pop    rax
     135de04:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
     135de0b:	c7 84 24 98 00 00 00 	mov    DWORD PTR [rsp+0x98],0x0
     135de12:	00 00 00 00 
     135de16:	eb 2e                	jmp    135de46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a33ca>
     135de18:	b0 01                	mov    al,0x1
     135de1a:	89 84 24 98 00 00 00 	mov    DWORD PTR [rsp+0x98],eax
     135de21:	b8 a0 0f 00 00       	mov    eax,0xfa0
     135de26:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     135de2d:	00 
     135de2e:	b8 d0 07 00 00       	mov    eax,0x7d0
     135de33:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     135de3a:	00 
     135de3b:	c7 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],0x0
     135de42:	00 00 00 00 
     135de46:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135de49:	e8 ce 02 96 ff       	call   cbe11c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b0bc>
     135de4e:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135de51:	e8 12 03 96 ff       	call   cbe168 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b108>

### 0x135e017: mov    rax,QWORD PTR [rsp+0x70]
     135dfdf:	48 8d b4 24 b0 08 00 	lea    rsi,[rsp+0x8b0]
     135dfe6:	00 
     135dfe7:	48 89 df             	mov    rdi,rbx
     135dfea:	4c 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r15
     135dff1:	00 
     135dff2:	e8 99 c2 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135dff7:	4c 8d b4 24 20 06 00 	lea    r14,[rsp+0x620]
     135dffe:	00 
     135dfff:	4c 89 f7             	mov    rdi,r14
     135e002:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135e009:	00 
     135e00a:	e8 d7 ef 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135e00f:	48 8d bc 24 e8 06 00 	lea    rdi,[rsp+0x6e8]
     135e016:	00 
     135e017:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
     135e01c:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
     135e020:	4c 89 ee             	mov    rsi,r13
     135e023:	e8 6c ea 96 ff       	call   ccca94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x219a34>
     135e028:	66 83 a4 24 00 07 00 	and    WORD PTR [rsp+0x700],0x0
     135e02f:	00 00 
     135e031:	8b 9c 24 b8 00 00 00 	mov    ebx,DWORD PTR [rsp+0xb8]
     135e038:	89 9c 24 04 07 00 00 	mov    DWORD PTR [rsp+0x704],ebx
     135e03f:	48 c7 84 24 08 07 00 	mov    QWORD PTR [rsp+0x708],0x3e8
     135e046:	00 e8 03 00 00 
     135e04b:	48 c7 84 24 10 07 00 	mov    QWORD PTR [rsp+0x710],0xfa0
     135e052:	00 a0 0f 00 00 
     135e057:	48 83 a4 24 18 07 00 	and    QWORD PTR [rsp+0x718],0x0
     135e05e:	00 00 
     135e060:	c6 84 24 20 07 00 00 	mov    BYTE PTR [rsp+0x720],0x1
     135e067:	01 
     135e068:	83 a4 24 21 07 00 00 	and    DWORD PTR [rsp+0x721],0x0
     135e06f:	00 
     135e070:	66 83 a4 24 25 07 00 	and    WORD PTR [rsp+0x725],0x0
     135e077:	00 00 
     135e079:	48 c7 84 24 28 07 00 	mov    QWORD PTR [rsp+0x728],0x1
     135e080:	00 01 00 00 00 
     135e085:	31 c0                	xor    eax,eax
     135e087:	88 84 24 30 07 00 00 	mov    BYTE PTR [rsp+0x730],al
     135e08e:	8b 8c 24 89 02 00 00 	mov    ecx,DWORD PTR [rsp+0x289]
     135e095:	89 8c 24 31 07 00 00 	mov    DWORD PTR [rsp+0x731],ecx
     135e09c:	8b 8c 24 8c 02 00 00 	mov    ecx,DWORD PTR [rsp+0x28c]
     135e0a3:	89 8c 24 34 07 00 00 	mov    DWORD PTR [rsp+0x734],ecx

### 0x135f3b6: mov    QWORD PTR [rsp+0x70],rbp
     135f37b:	00 
     135f37c:	48 8d 84 24 30 0a 00 	lea    rax,[rsp+0xa30]
     135f383:	00 
     135f384:	48 89 84 24 68 0f 00 	mov    QWORD PTR [rsp+0xf68],rax
     135f38b:	00 
     135f38c:	48 c7 84 24 70 0f 00 	mov    QWORD PTR [rsp+0xf70],0x1
     135f393:	00 01 00 00 00 
     135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>
     135f39f:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f3a2:	48 89 df             	mov    rdi,rbx
     135f3a5:	48 83 c7 10          	add    rdi,0x10
     135f3a9:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135f3b0:	00 
     135f3b1:	e8 b0 1b 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f3b6:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
     135f3bb:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135f3c2:	00 
     135f3c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135f3c7:	48 89 9c 24 a0 0d 00 	mov    QWORD PTR [rsp+0xda0],rbx
     135f3ce:	00 
     135f3cf:	e8 f6 ae 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135f3d4:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     135f3db:	00 00 
     135f3dd:	48 8d 05 9c 8c 50 00 	lea    rax,[rip+0x508c9c]        # 1868080 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24768>
     135f3e4:	48 8d 8c 24 a0 0a 00 	lea    rcx,[rsp+0xaa0]
     135f3eb:	00 
     135f3ec:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f3ef:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f3f3:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135f3fa:	00 
     135f3fb:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     135f402:	00 
     135f403:	e8 9a 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f408:	48 83 a4 24 90 0a 00 	and    QWORD PTR [rsp+0xa90],0x0
     135f40f:	00 00 
     135f411:	6a 50                	push   0x50
     135f413:	5f                   	pop    rdi
     135f414:	e8 e7 ea 48 00       	call   17edf00 <_Znwm@plt>
     135f419:	48 89 c3             	mov    rbx,rax
     135f41c:	48 8d ac 24 b8 03 00 	lea    rbp,[rsp+0x3b8]
     135f423:	00 
     135f424:	48 8d 05 9d 8c 50 00 	lea    rax,[rip+0x508c9d]        # 18680c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247b0>

### 0x135fb45: mov    r15,QWORD PTR [rsp+0x70]
     135fb02:	49 8d 86 38 0a 00 00 	lea    rax,[r14+0xa38]
     135fb09:	66 0f ef c0          	pxor   xmm0,xmm0
     135fb0d:	f3 41 0f 7f 86 38 0a 	movdqu XMMWORD PTR [r14+0xa38],xmm0
     135fb14:	00 00 
     135fb16:	49 89 86 30 0a 00 00 	mov    QWORD PTR [r14+0xa30],rax
     135fb1d:	41 88 ae 80 0a 00 00 	mov    BYTE PTR [r14+0xa80],bpl
     135fb24:	f3 41 0f 7f 86 48 0a 	movdqu XMMWORD PTR [r14+0xa48],xmm0
     135fb2b:	00 00 
     135fb2d:	f3 41 0f 7f 86 58 0a 	movdqu XMMWORD PTR [r14+0xa58],xmm0
     135fb34:	00 00 
     135fb36:	41 88 ae 68 0a 00 00 	mov    BYTE PTR [r14+0xa68],bpl
     135fb3d:	6a 38                	push   0x38
     135fb3f:	5f                   	pop    rdi
     135fb40:	e8 bb e3 48 00       	call   17edf00 <_Znwm@plt>
     135fb45:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135fb4a:	49 83 c7 10          	add    r15,0x10
     135fb4e:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]
     135fb53:	49 83 c4 10          	add    r12,0x10
     135fb57:	66 0f ef c0          	pxor   xmm0,xmm0
     135fb5b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135fb60:	48 8d 0d 39 8e 50 00 	lea    rcx,[rip+0x508e39]        # 18689a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25088>
     135fb67:	48 89 08             	mov    QWORD PTR [rax],rcx
     135fb6a:	48 89 c1             	mov    rcx,rax
     135fb6d:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     135fb72:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     135fb76:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
     135fb7b:	48 83 c1 18          	add    rcx,0x18
     135fb7f:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     135fb84:	49 89 8e 88 0a 00 00 	mov    QWORD PTR [r14+0xa88],rcx
     135fb8b:	49 89 86 90 0a 00 00 	mov    QWORD PTR [r14+0xa90],rax
     135fb92:	f3 41 0f 7f 86 98 0a 	movdqu XMMWORD PTR [r14+0xa98],xmm0
     135fb99:	00 00 
     135fb9b:	66 41 83 a6 a8 0a 00 	and    WORD PTR [r14+0xaa8],0x0
     135fba2:	00 00 
     135fba4:	48 8d bc 24 20 0f 00 	lea    rdi,[rsp+0xf20]
     135fbab:	00 
     135fbac:	e8 d5 94 e9 ff       	call   11f9086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e60a>
     135fbb1:	48 8d bc 24 40 0f 00 	lea    rdi,[rsp+0xf40]
     135fbb8:	00 
     135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
     135fbbe:	31 db                	xor    ebx,ebx
     135fbc0:	41 88 9e e8 0a 00 00 	mov    BYTE PTR [r14+0xae8],bl

- total hits: 6

## Writes to rsp+0x70 only
 135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
 135dde1:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
 135f3b6:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
### Last write before final consumer: 0x135f3b6: mov    QWORD PTR [rsp+0x70],rbp
     135f271:	00 
     135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
     135f309:	00 
     135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
     135f316:	00 00 
     135f318:	6a 70                	push   0x70
     135f31a:	5f                   	pop    rdi
     135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>
     135f320:	48 89 c3             	mov    rbx,rax
     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>
     135f32a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f32d:	48 89 df             	mov    rdi,rbx
     135f330:	48 83 c7 10          	add    rdi,0x10
     135f334:	48 8d b4 24 b0 0d 00 	lea    rsi,[rsp+0xdb0]
     135f33b:	00 
     135f33c:	e8 cb 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f341:	48 89 9c 24 30 0e 00 	mov    QWORD PTR [rsp+0xe30],rbx
     135f348:	00 
     135f349:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f350:	00 
     135f351:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135f358:	00 
     135f359:	e8 08 1c 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f35e:	48 83 a4 24 a0 0d 00 	and    QWORD PTR [rsp+0xda0],0x0
     135f365:	00 00 
     135f367:	bf c0 02 00 00       	mov    edi,0x2c0
     135f36c:	e8 8f eb 48 00       	call   17edf00 <_Znwm@plt>
     135f371:	48 89 c3             	mov    rbx,rax
     135f374:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135f37b:	00 
     135f37c:	48 8d 84 24 30 0a 00 	lea    rax,[rsp+0xa30]
     135f383:	00 
     135f384:	48 89 84 24 68 0f 00 	mov    QWORD PTR [rsp+0xf68],rax
     135f38b:	00 
     135f38c:	48 c7 84 24 70 0f 00 	mov    QWORD PTR [rsp+0xf70],0x1
     135f393:	00 01 00 00 00 
     135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>
     135f39f:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f3a2:	48 89 df             	mov    rdi,rbx
     135f3a5:	48 83 c7 10          	add    rdi,0x10
     135f3a9:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135f3b0:	00 
     135f3b1:	e8 b0 1b 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f3b6:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
     135f3bb:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135f3c2:	00 
     135f3c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135f3c7:	48 89 9c 24 a0 0d 00 	mov    QWORD PTR [rsp+0xda0],rbx
     135f3ce:	00 
     135f3cf:	e8 f6 ae 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135f3d4:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     135f3db:	00 00 
     135f3dd:	48 8d 05 9c 8c 50 00 	lea    rax,[rip+0x508c9c]        # 1868080 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24768>
     135f3e4:	48 8d 8c 24 a0 0a 00 	lea    rcx,[rsp+0xaa0]
     135f3eb:	00 
     135f3ec:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f3ef:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f3f3:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135f3fa:	00 
     135f3fb:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     135f402:	00 
     135f403:	e8 9a 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f408:	48 83 a4 24 90 0a 00 	and    QWORD PTR [rsp+0xa90],0x0
     135f40f:	00 00 
     135f411:	6a 50                	push   0x50
     135f413:	5f                   	pop    rdi
     135f414:	e8 e7 ea 48 00       	call   17edf00 <_Znwm@plt>
     135f419:	48 89 c3             	mov    rbx,rax
     135f41c:	48 8d ac 24 b8 03 00 	lea    rbp,[rsp+0x3b8]
     135f423:	00 
     135f424:	48 8d 05 9d 8c 50 00 	lea    rax,[rip+0x508c9d]        # 18680c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247b0>
     135f42b:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f42e:	48 89 df             	mov    rdi,rbx
     135f431:	48 83 c7 10          	add    rdi,0x10
     135f435:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
     135f43c:	00 
     135f43d:	e8 60 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f442:	48 89 9c 24 90 0a 00 	mov    QWORD PTR [rsp+0xa90],rbx
     135f449:	00 
     135f44a:	48 8d 05 8f f4 4a 00 	lea    rax,[rip+0x4af48f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135f451:	48 8d 8c 24 00 0a 00 	lea    rcx,[rsp+0xa00]
     135f458:	00 
     135f459:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f45c:	48 8d 05 63 1a 00 00 	lea    rax,[rip+0x1a63]        # 1360ec6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a644a>
     135f463:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f467:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f46b:	48 8d 05 9e 8c 50 00 	lea    rax,[rip+0x508c9e]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>
     135f472:	48 8d 8c 24 d0 09 00 	lea    rcx,[rsp+0x9d0]
     135f479:	00 
     135f47a:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f47d:	48 8b 84 24 80 10 00 	mov    rax,QWORD PTR [rsp+0x1080]
     135f484:	00 
     135f485:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f489:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f48d:	48 8d 05 6c 8d 50 00 	lea    rax,[rip+0x508d6c]        # 1868200 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x248e8>
     135f494:	49 89 06             	mov    QWORD PTR [r14],rax
     135f497:	48 8d 05 2a 8f 50 00 	lea    rax,[rip+0x508f2a]        # 18683c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ab0>
     135f49e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     135f4a2:	48 8d 05 4f 8f 50 00 	lea    rax,[rip+0x508f4f]        # 18683f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ae0>
     135f4a9:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     135f4ad:	48 8d 05 0c 90 50 00 	lea    rax,[rip+0x50900c]        # 18684c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24ba8>
     135f4b4:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
     135f4b8:	49 8d 5e 20          	lea    rbx,[r14+0x20]
     135f4bc:	6a 61                	push   0x61
     135f4be:	59                   	pop    rcx
     135f4bf:	48 8d 84 24 20 03 00 	lea    rax,[rsp+0x320]
     135f4c6:	00 
     135f4c7:	48 89 df             	mov    rdi,rbx
     135f4ca:	48 89 c6             	mov    rsi,rax
     135f4cd:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]
     135f4cf:	0f 10 40 68          	movups xmm0,XMMWORD PTR [rax+0x68]
     135f4d3:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
     135f4da:	00 
     135f4db:	48 8b 40 78          	mov    rax,QWORD PTR [rax+0x78]
     135f4df:	49 89 86 98 00 00 00 	mov    QWORD PTR [r14+0x98],rax
     135f4e6:	0f 57 c0             	xorps  xmm0,xmm0
     135f4e9:	48 8d 84 24 88 03 00 	lea    rax,[rsp+0x388]
     135f4f0:	00 
     135f4f1:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     135f4f6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     135f4f9:	0f 10 4d e8          	movups xmm1,XMMWORD PTR [rbp-0x18]
     135f4fd:	41 0f 29 8e a0 00 00 	movaps XMMWORD PTR [r14+0xa0],xmm1
     135f504:	00 
     135f505:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     135f509:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
     135f510:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
     135f515:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
     135f51a:	f3 0f 6f 45 00       	movdqu xmm0,XMMWORD PTR [rbp+0x0]
     135f51f:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
     135f526:	00 00 
     135f528:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f52f:	00 
     135f530:	49 89 86 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],rax
     135f537:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135f53e:	00 
     135f53f:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
     135f546:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     135f54b:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
     135f552:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     135f557:	49 89 86 e0 00 00 00 	mov    QWORD PTR [r14+0xe0],rax
     135f55e:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
     135f565:	48 8d b4 24 40 0e 00 	lea    rsi,[rsp+0xe40]
     135f56c:	00 
     135f56d:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
     135f572:	e8 27 fa 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
     135f577:	4d 8d ae b0 01 00 00 	lea    r13,[r14+0x1b0]
     135f57e:	48 8b 84 24 30 0e 00 	mov    rax,QWORD PTR [rsp+0xe30]
     135f585:	00 
     135f586:	48 85 c0             	test   rax,rax
     135f589:	74 1e                	je     135f5a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b2d>
     135f58b:	48 8d 8c 24 10 0e 00 	lea    rcx,[rsp+0xe10]
     135f592:	00 
     135f593:	48 39 c8             	cmp    rax,rcx

## All writes/reads of rsp+0x48
### 0x135d486: mov    DWORD PTR [rsp+0x48],eax
     135d44e:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     135d455:	00 
     135d456:	4c 89 f6             	mov    rsi,r14
     135d459:	e8 22 0b 49 00       	call   17edf80 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc@plt>
     135d45e:	48 89 6c 24 38       	mov    QWORD PTR [rsp+0x38],rbp
     135d463:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d466:	e8 d9 fe 95 ff       	call   cbd344 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a2e4>
     135d46b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d46e:	e8 b3 fe 95 ff       	call   cbd326 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a2c6>
     135d473:	41 89 c7             	mov    r15d,eax
     135d476:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d479:	e8 62 ff 95 ff       	call   cbd3e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a380>
     135d47e:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d481:	e8 dc fe 95 ff       	call   cbd362 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a302>
     135d486:	89 44 24 48          	mov    DWORD PTR [rsp+0x48],eax
     135d48a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d48d:	e8 76 fe 95 ff       	call   cbd308 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a2a8>
     135d492:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d495:	e8 50 fe 95 ff       	call   cbd2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a28a>
     135d49a:	89 c5                	mov    ebp,eax
     135d49c:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d49f:	e8 d6 00 96 ff       	call   cbd57a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a51a>
     135d4a4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4a7:	e8 34 00 96 ff       	call   cbd4e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a480>
     135d4ac:	41 89 c4             	mov    r12d,eax
     135d4af:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4b2:	e8 7d f6 95 ff       	call   cbcb34 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209ad4>
     135d4b7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4ba:	e8 39 f9 95 ff       	call   cbcdf8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209d98>
     135d4bf:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4c2:	e8 f5 fb 95 ff       	call   cbd0bc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20a05c>
     135d4c7:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4ca:	e8 43 f5 95 ff       	call   cbca12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2099b2>
     135d4cf:	89 44 24 40          	mov    DWORD PTR [rsp+0x40],eax
     135d4d3:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4d6:	e8 fb f7 95 ff       	call   cbccd6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209c76>
     135d4db:	89 44 24 58          	mov    DWORD PTR [rsp+0x58],eax
     135d4df:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135d4e2:	e8 b3 fa 95 ff       	call   cbcf9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x209f3a>
     135d4e7:	89 44 24 50          	mov    DWORD PTR [rsp+0x50],eax
     135d4eb:	6a 10                	push   0x10
     135d4ed:	5f                   	pop    rdi

### 0x135d688: mov    eax,DWORD PTR [rsp+0x48]
     135d647:	48 c7 84 24 18 06 00 	mov    QWORD PTR [rsp+0x618],0xfa0
     135d64e:	00 a0 0f 00 00 
     135d653:	48 83 a4 24 20 06 00 	and    QWORD PTR [rsp+0x620],0x0
     135d65a:	00 00 
     135d65c:	83 a4 24 28 06 00 00 	and    DWORD PTR [rsp+0x628],0x0
     135d663:	00 
     135d664:	48 c7 84 24 30 06 00 	mov    QWORD PTR [rsp+0x630],0xfa
     135d66b:	00 fa 00 00 00 
     135d670:	48 89 84 24 38 06 00 	mov    QWORD PTR [rsp+0x638],rax
     135d677:	00 
     135d678:	40 88 ac 24 40 06 00 	mov    BYTE PTR [rsp+0x640],bpl
     135d67f:	00 
     135d680:	44 88 bc 24 41 06 00 	mov    BYTE PTR [rsp+0x641],r15b
     135d687:	00 
     135d688:	8b 44 24 48          	mov    eax,DWORD PTR [rsp+0x48]
     135d68c:	89 84 24 44 06 00 00 	mov    DWORD PTR [rsp+0x644],eax
     135d693:	44 89 a4 24 48 06 00 	mov    DWORD PTR [rsp+0x648],r12d
     135d69a:	00 
     135d69b:	c6 84 24 4c 06 00 00 	mov    BYTE PTR [rsp+0x64c],0x1
     135d6a2:	01 
     135d6a3:	48 8d 9c 24 d8 01 00 	lea    rbx,[rsp+0x1d8]
     135d6aa:	00 
     135d6ab:	48 89 df             	mov    rdi,rbx
     135d6ae:	48 8b b4 24 e0 10 00 	mov    rsi,QWORD PTR [rsp+0x10e0]
     135d6b5:	00 
     135d6b6:	e8 3f 7d 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135d6bb:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135d6c2:	00 
     135d6c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135d6c7:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
     135d6ca:	e8 53 7c 47 00       	call   17d5322 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1143>
     135d6cf:	4c 8d bc 24 f0 0a 00 	lea    r15,[rsp+0xaf0]
     135d6d6:	00 
     135d6d7:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135d6de:	00 
     135d6df:	49 89 47 e0          	mov    QWORD PTR [r15-0x20],rax
     135d6e3:	4d 89 77 e8          	mov    QWORD PTR [r15-0x18],r14
     135d6e7:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135d6ee:	00 
     135d6ef:	49 89 47 f0          	mov    QWORD PTR [r15-0x10],rax
     135d6f3:	4d 89 6f f8          	mov    QWORD PTR [r15-0x8],r13
     135d6f7:	4c 89 ff             	mov    rdi,r15

### 0x135ddd7: mov    QWORD PTR [rsp+0x48],r12
     135dda3:	48 8d 0d 96 a1 50 00 	lea    rcx,[rip+0x50a196]        # 1867f40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24628>
     135ddaa:	48 89 08             	mov    QWORD PTR [rax],rcx
     135ddad:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     135ddb1:	48 8b 8c 24 c0 00 00 	mov    rcx,QWORD PTR [rsp+0xc0]
     135ddb8:	00 
     135ddb9:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     135ddbc:	48 89 01             	mov    QWORD PTR [rcx],rax
     135ddbf:	48 85 ff             	test   rdi,rdi
     135ddc2:	74 06                	je     135ddca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a334e>
     135ddc4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135ddc7:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135ddca:	41 80 7e 04 00       	cmp    BYTE PTR [r14+0x4],0x0
     135ddcf:	48 8b 9c 24 88 10 00 	mov    rbx,QWORD PTR [rsp+0x1088]
     135ddd6:	00 
     135ddd7:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
     135dddc:	4c 89 6c 24 68       	mov    QWORD PTR [rsp+0x68],r13
     135dde1:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
     135dde6:	74 30                	je     135de18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a339c>
     135dde8:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
     135ddec:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     135ddf3:	00 
     135ddf4:	b8 d0 07 00 00       	mov    eax,0x7d0
     135ddf9:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     135de00:	00 
     135de01:	6a 01                	push   0x1
     135de03:	58                   	pop    rax
     135de04:	89 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],eax
     135de0b:	c7 84 24 98 00 00 00 	mov    DWORD PTR [rsp+0x98],0x0
     135de12:	00 00 00 00 
     135de16:	eb 2e                	jmp    135de46 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a33ca>
     135de18:	b0 01                	mov    al,0x1
     135de1a:	89 84 24 98 00 00 00 	mov    DWORD PTR [rsp+0x98],eax
     135de21:	b8 a0 0f 00 00       	mov    eax,0xfa0
     135de26:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
     135de2d:	00 
     135de2e:	b8 d0 07 00 00       	mov    eax,0x7d0
     135de33:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     135de3a:	00 
     135de3b:	c7 84 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],0x0
     135de42:	00 00 00 00 
     135de46:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     135de49:	e8 ce 02 96 ff       	call   cbe11c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20b0bc>

### 0x135df9d: mov    rax,QWORD PTR [rsp+0x48]
     135df65:	4c 8b 64 24 78       	mov    r12,QWORD PTR [rsp+0x78]
     135df6a:	4c 89 65 f8          	mov    QWORD PTR [rbp-0x8],r12
     135df6e:	48 89 ef             	mov    rdi,rbp
     135df71:	48 89 de             	mov    rsi,rbx
     135df74:	e8 81 74 47 00       	call   17d53fa <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x121b>
     135df79:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135df80:	00 
     135df81:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     135df85:	48 8b 84 24 a0 10 00 	mov    rax,QWORD PTR [rsp+0x10a0]
     135df8c:	00 
     135df8d:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     135df91:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
     135df98:	00 
     135df99:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
     135df9d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     135dfa2:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     135dfa6:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
     135dfab:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
     135dfaf:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
     135dfb6:	00 
     135dfb7:	66 0f 6f 84 24 c0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1c0]
     135dfbe:	00 00 
     135dfc0:	f3 0f 7f 45 30       	movdqu XMMWORD PTR [rbp+0x30],xmm0
     135dfc5:	48 85 c0             	test   rax,rax
     135dfc8:	4c 8b ac 24 e8 10 00 	mov    r13,QWORD PTR [rsp+0x10e8]
     135dfcf:	00 
     135dfd0:	74 05                	je     135dfd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a355b>
     135dfd2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135dfd7:	48 8d 9c 24 f0 05 00 	lea    rbx,[rsp+0x5f0]
     135dfde:	00 
     135dfdf:	48 8d b4 24 b0 08 00 	lea    rsi,[rsp+0x8b0]
     135dfe6:	00 
     135dfe7:	48 89 df             	mov    rdi,rbx
     135dfea:	4c 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r15
     135dff1:	00 
     135dff2:	e8 99 c2 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135dff7:	4c 8d b4 24 20 06 00 	lea    r14,[rsp+0x620]
     135dffe:	00 
     135dfff:	4c 89 f7             	mov    rdi,r14
     135e002:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135e009:	00 
     135e00a:	e8 d7 ef 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>

### 0x135f2ae: mov    QWORD PTR [rsp+0x48],rax
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
     135f309:	00 
     135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
     135f316:	00 00 
     135f318:	6a 70                	push   0x70
     135f31a:	5f                   	pop    rdi
     135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>

### 0x135fb4e: mov    r12,QWORD PTR [rsp+0x48]
     135fb0d:	f3 41 0f 7f 86 38 0a 	movdqu XMMWORD PTR [r14+0xa38],xmm0
     135fb14:	00 00 
     135fb16:	49 89 86 30 0a 00 00 	mov    QWORD PTR [r14+0xa30],rax
     135fb1d:	41 88 ae 80 0a 00 00 	mov    BYTE PTR [r14+0xa80],bpl
     135fb24:	f3 41 0f 7f 86 48 0a 	movdqu XMMWORD PTR [r14+0xa48],xmm0
     135fb2b:	00 00 
     135fb2d:	f3 41 0f 7f 86 58 0a 	movdqu XMMWORD PTR [r14+0xa58],xmm0
     135fb34:	00 00 
     135fb36:	41 88 ae 68 0a 00 00 	mov    BYTE PTR [r14+0xa68],bpl
     135fb3d:	6a 38                	push   0x38
     135fb3f:	5f                   	pop    rdi
     135fb40:	e8 bb e3 48 00       	call   17edf00 <_Znwm@plt>
     135fb45:	4c 8b 7c 24 70       	mov    r15,QWORD PTR [rsp+0x70]
     135fb4a:	49 83 c7 10          	add    r15,0x10
     135fb4e:	4c 8b 64 24 48       	mov    r12,QWORD PTR [rsp+0x48]
     135fb53:	49 83 c4 10          	add    r12,0x10
     135fb57:	66 0f ef c0          	pxor   xmm0,xmm0
     135fb5b:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     135fb60:	48 8d 0d 39 8e 50 00 	lea    rcx,[rip+0x508e39]        # 18689a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x25088>
     135fb67:	48 89 08             	mov    QWORD PTR [rax],rcx
     135fb6a:	48 89 c1             	mov    rcx,rax
     135fb6d:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     135fb72:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     135fb76:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
     135fb7b:	48 83 c1 18          	add    rcx,0x18
     135fb7f:	f3 0f 7f 40 20       	movdqu XMMWORD PTR [rax+0x20],xmm0
     135fb84:	49 89 8e 88 0a 00 00 	mov    QWORD PTR [r14+0xa88],rcx
     135fb8b:	49 89 86 90 0a 00 00 	mov    QWORD PTR [r14+0xa90],rax
     135fb92:	f3 41 0f 7f 86 98 0a 	movdqu XMMWORD PTR [r14+0xa98],xmm0
     135fb99:	00 00 
     135fb9b:	66 41 83 a6 a8 0a 00 	and    WORD PTR [r14+0xaa8],0x0
     135fba2:	00 00 
     135fba4:	48 8d bc 24 20 0f 00 	lea    rdi,[rsp+0xf20]
     135fbab:	00 
     135fbac:	e8 d5 94 e9 ff       	call   11f9086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e60a>
     135fbb1:	48 8d bc 24 40 0f 00 	lea    rdi,[rsp+0xf40]
     135fbb8:	00 
     135fbb9:	e8 bc 71 00 00       	call   1366d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ac2fe>
     135fbbe:	31 db                	xor    ebx,ebx
     135fbc0:	41 88 9e e8 0a 00 00 	mov    BYTE PTR [r14+0xae8],bl
     135fbc7:	66 0f ef c0          	pxor   xmm0,xmm0
     135fbcb:	66 41 0f 7f 86 b0 0a 	movdqa XMMWORD PTR [r14+0xab0],xmm0

- total hits: 6

## Writes to rsp+0x48 only
 135d486:	89 44 24 48          	mov    DWORD PTR [rsp+0x48],eax
 135ddd7:	4c 89 64 24 48       	mov    QWORD PTR [rsp+0x48],r12
 135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
### Last write before final consumer: 0x135f2ae: mov    QWORD PTR [rsp+0x48],rax
     135f18d:	4c 89 f3             	mov    rbx,r14
     135f190:	4c 39 f0             	cmp    rax,r14
     135f193:	74 17                	je     135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f195:	48 83 38 00          	cmp    QWORD PTR [rax],0x0
     135f199:	7f 0e                	jg     135f1a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a472d>
     135f19b:	48 83 c0 18          	add    rax,0x18
     135f19f:	4c 39 f0             	cmp    rax,r14
     135f1a2:	75 f1                	jne    135f195 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4719>
     135f1a4:	4c 89 f3             	mov    rbx,r14
     135f1a7:	eb 03                	jmp    135f1ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4730>
     135f1a9:	48 89 c3             	mov    rbx,rax
     135f1ac:	48 89 9c 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rbx
     135f1b3:	00 
     135f1b4:	c6 84 24 20 02 00 00 	mov    BYTE PTR [rsp+0x220],0x1
     135f1bb:	01 
     135f1bc:	4c 39 f3             	cmp    rbx,r14
     135f1bf:	74 38                	je     135f1f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a477d>
     135f1c1:	4c 89 ef             	mov    rdi,r13
     135f1c4:	48 89 de             	mov    rsi,rbx
     135f1c7:	e8 ec 1b 00 00       	call   1360db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a633c>
     135f1cc:	48 8b 84 24 08 02 00 	mov    rax,QWORD PTR [rsp+0x208]
     135f1d3:	00 
     135f1d4:	48 83 c3 18          	add    rbx,0x18
     135f1d8:	48 39 c3             	cmp    rbx,rax
     135f1db:	74 14                	je     135f1f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4775>
     135f1dd:	48 8d 4b 18          	lea    rcx,[rbx+0x18]
     135f1e1:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
     135f1e5:	48 89 cb             	mov    rbx,rcx
     135f1e8:	7e ee                	jle    135f1d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a475c>
     135f1ea:	48 83 c1 e8          	add    rcx,0xffffffffffffffe8
     135f1ee:	48 89 c8             	mov    rax,rcx
     135f1f1:	48 89 c3             	mov    rbx,rax
     135f1f4:	4c 39 f0             	cmp    rax,r14
     135f1f7:	75 c8                	jne    135f1c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4745>
     135f1f9:	8a 44 24 2f          	mov    al,BYTE PTR [rsp+0x2f]
     135f1fd:	88 84 24 b8 03 00 00 	mov    BYTE PTR [rsp+0x3b8],al
     135f204:	48 63 84 24 e8 00 00 	movsxd rax,DWORD PTR [rsp+0xe8]
     135f20b:	00 
     135f20c:	48 89 84 24 c0 03 00 	mov    QWORD PTR [rsp+0x3c0],rax
     135f213:	00 
     135f214:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
     135f21b:	00 
     135f21c:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f21f:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135f224:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f227:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f22a:	49 89 c6             	mov    r14,rax
     135f22d:	4c 89 a4 24 90 02 00 	mov    QWORD PTR [rsp+0x290],r12
     135f234:	00 
     135f235:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
     135f23c:	00 
     135f23d:	48 89 84 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rax
     135f244:	00 
     135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
     135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
     135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     135f257:	00 
     135f258:	48 89 c6             	mov    rsi,rax
     135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
     135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
     135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
     135f271:	00 
     135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
     135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
     135f27c:	00 
     135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
     135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     135f28f:	00 
     135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
     135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
     135f29a:	00 
     135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
     135f2aa:	00 
     135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
     135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
     135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
     135f2bd:	49 89 c6             	mov    r14,rax
     135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
     135f2c7:	00 
     135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
     135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
     135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
     135f2d6:	48 85 c0             	test   rax,rax
     135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
     135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
     135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
     135f2ec:	00 
     135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
     135f2f4:	00 
     135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
     135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
     135f301:	00 
     135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
     135f309:	00 
     135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
     135f316:	00 00 
     135f318:	6a 70                	push   0x70
     135f31a:	5f                   	pop    rdi
     135f31b:	e8 e0 eb 48 00       	call   17edf00 <_Znwm@plt>
     135f320:	48 89 c3             	mov    rbx,rax
     135f323:	48 8d 05 c6 8c 50 00 	lea    rax,[rip+0x508cc6]        # 1867ff0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x246d8>
     135f32a:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f32d:	48 89 df             	mov    rdi,rbx
     135f330:	48 83 c7 10          	add    rdi,0x10
     135f334:	48 8d b4 24 b0 0d 00 	lea    rsi,[rsp+0xdb0]
     135f33b:	00 
     135f33c:	e8 cb 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
     135f341:	48 89 9c 24 30 0e 00 	mov    QWORD PTR [rsp+0xe30],rbx
     135f348:	00 
     135f349:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135f350:	00 
     135f351:	48 8d b4 24 a0 05 00 	lea    rsi,[rsp+0x5a0]
     135f358:	00 
     135f359:	e8 08 1c 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f35e:	48 83 a4 24 a0 0d 00 	and    QWORD PTR [rsp+0xda0],0x0
     135f365:	00 00 
     135f367:	bf c0 02 00 00       	mov    edi,0x2c0
     135f36c:	e8 8f eb 48 00       	call   17edf00 <_Znwm@plt>
     135f371:	48 89 c3             	mov    rbx,rax
     135f374:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135f37b:	00 
     135f37c:	48 8d 84 24 30 0a 00 	lea    rax,[rsp+0xa30]
     135f383:	00 
     135f384:	48 89 84 24 68 0f 00 	mov    QWORD PTR [rsp+0xf68],rax
     135f38b:	00 
     135f38c:	48 c7 84 24 70 0f 00 	mov    QWORD PTR [rsp+0xf70],0x1
     135f393:	00 01 00 00 00 
     135f398:	48 8d 05 99 8c 50 00 	lea    rax,[rip+0x508c99]        # 1868038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24720>
     135f39f:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f3a2:	48 89 df             	mov    rdi,rbx
     135f3a5:	48 83 c7 10          	add    rdi,0x10
     135f3a9:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
     135f3b0:	00 
     135f3b1:	e8 b0 1b 00 00       	call   1360f66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a64ea>
     135f3b6:	48 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],rbp
     135f3bb:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
     135f3c2:	00 
     135f3c3:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     135f3c7:	48 89 9c 24 a0 0d 00 	mov    QWORD PTR [rsp+0xda0],rbx
     135f3ce:	00 
     135f3cf:	e8 f6 ae 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     135f3d4:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     135f3db:	00 00 
     135f3dd:	48 8d 05 9c 8c 50 00 	lea    rax,[rip+0x508c9c]        # 1868080 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24768>
     135f3e4:	48 8d 8c 24 a0 0a 00 	lea    rcx,[rsp+0xaa0]
     135f3eb:	00 
     135f3ec:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f3ef:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f3f3:	48 8d bc 24 30 0a 00 	lea    rdi,[rsp+0xa30]
     135f3fa:	00 
     135f3fb:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     135f402:	00 
     135f403:	e8 9a 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f408:	48 83 a4 24 90 0a 00 	and    QWORD PTR [rsp+0xa90],0x0
     135f40f:	00 00 
     135f411:	6a 50                	push   0x50
     135f413:	5f                   	pop    rdi
     135f414:	e8 e7 ea 48 00       	call   17edf00 <_Znwm@plt>
     135f419:	48 89 c3             	mov    rbx,rax
     135f41c:	48 8d ac 24 b8 03 00 	lea    rbp,[rsp+0x3b8]
     135f423:	00 
     135f424:	48 8d 05 9d 8c 50 00 	lea    rax,[rip+0x508c9d]        # 18680c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247b0>
     135f42b:	48 89 03             	mov    QWORD PTR [rbx],rax
     135f42e:	48 89 df             	mov    rdi,rbx
     135f431:	48 83 c7 10          	add    rdi,0x10
     135f435:	48 8d b4 24 30 0a 00 	lea    rsi,[rsp+0xa30]
     135f43c:	00 
     135f43d:	e8 60 1c 00 00       	call   13610a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6626>
     135f442:	48 89 9c 24 90 0a 00 	mov    QWORD PTR [rsp+0xa90],rbx
     135f449:	00 
     135f44a:	48 8d 05 8f f4 4a 00 	lea    rax,[rip+0x4af48f]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135f451:	48 8d 8c 24 00 0a 00 	lea    rcx,[rsp+0xa00]
     135f458:	00 
     135f459:	48 89 01             	mov    QWORD PTR [rcx],rax
     135f45c:	48 8d 05 63 1a 00 00 	lea    rax,[rip+0x1a63]        # 1360ec6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a644a>
     135f463:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
     135f467:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     135f46b:	48 8d 05 9e 8c 50 00 	lea    rax,[rip+0x508c9e]        # 1868110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x247f8>
     135f472:	48 8d 8c 24 d0 09 00 	lea    rcx,[rsp+0x9d0]
     135f479:	00 
     135f47a:	48 89 01             	mov    QWORD PTR [rcx],rax

## Constructor entry argument spills
 135d067:	4c 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],r9
 135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
 135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
 135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
 135d18e:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
 135d25b:	48 8d b4 24 d0 0a 00 	lea    rsi,[rsp+0xad0]
 135d27f:	48 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],rcx
 135d297:	48 8d 3c 1c          	lea    rdi,[rsp+rbx*1]
