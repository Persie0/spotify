# Skip Ad readiness source bridge

Proven source coordinate:
- constructor FDE begins near 0xef91d3
- 0xef9217 saves incoming rsi to rsp+0x60
- 0xefc623 tests source+0x1b5
- 0xefc630 loads availability receiver = [source+0x10]
- therefore the previous 0x183ba50/fb1b50 receiver identification was a false alias and is rejected

## All direct writes to source-family bytes +0x1b2/+0x1b5/+0x1b7/+0x1b8
### +0x1b2
- no direct writes found

### +0x1b5
#### 0xcea876; FDE=(13541732, 13544418): mov    WORD PTR [rsp+0x1b5],ax
      cea847:	48 89 c7             	mov    rdi,rax
      cea84a:	48 89 d6             	mov    rsi,rdx
      cea84d:	e8 1b 17 84 00       	call   152bf6d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3714f1>
      cea852:	89 84 24 b0 01 00 00 	mov    DWORD PTR [rsp+0x1b0],eax
      cea859:	41 8a 87 b4 00 00 00 	mov    al,BYTE PTR [r15+0xb4]
      cea860:	88 84 24 b4 01 00 00 	mov    BYTE PTR [rsp+0x1b4],al
      cea867:	41 0f b6 87 b5 00 00 	movzx  eax,BYTE PTR [r15+0xb5]
      cea86e:	00 
      cea86f:	b9 00 01 00 00       	mov    ecx,0x100
      cea874:	09 c8                	or     eax,ecx
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax
      cea88f:	00 
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea8ba:	41 c6 04 24 28       	mov    BYTE PTR [r12],0x28


### +0x1b7
#### 0xcea888; FDE=(13541732, 13544418): mov    WORD PTR [rsp+0x1b7],ax
      cea860:	88 84 24 b4 01 00 00 	mov    BYTE PTR [rsp+0x1b4],al
      cea867:	41 0f b6 87 b5 00 00 	movzx  eax,BYTE PTR [r15+0xb5]
      cea86e:	00 
      cea86f:	b9 00 01 00 00       	mov    ecx,0x100
      cea874:	09 c8                	or     eax,ecx
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea87d:	00 
      cea87e:	41 0f b6 87 b6 00 00 	movzx  eax,BYTE PTR [r15+0xb6]
      cea885:	00 
      cea886:	09 c8                	or     eax,ecx
      cea888:	66 89 84 24 b7 01 00 	mov    WORD PTR [rsp+0x1b7],ax
      cea88f:	00 
      cea890:	41 80 7d 14 00       	cmp    BYTE PTR [r13+0x14],0x0
      cea895:	74 3e                	je     cea8d5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x237875>
      cea897:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      cea89e:	00 
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea8a3:	4c 8d 64 24 68       	lea    r12,[rsp+0x68]
      cea8a8:	41 89 44 24 11       	mov    DWORD PTR [r12+0x11],eax
      cea8ad:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      cea8b3:	f3 41 0f 7f 44 24 01 	movdqu XMMWORD PTR [r12+0x1],xmm0
      cea8ba:	41 c6 04 24 28       	mov    BYTE PTR [r12],0x28
      cea8bf:	41 c6 44 24 15 00    	mov    BYTE PTR [r12+0x15],0x0
      cea8c5:	4c 89 e6             	mov    rsi,r12
      cea8c8:	e8 61 11 d9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      cea8cd:	4c 89 e7             	mov    rdi,r12
      cea8d0:	e8 bb 35 b0 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>


### +0x1b8
#### 0x9d706d; FDE=(10317472, 10318084): mov    QWORD PTR [r14+0x1b8],rax
      9d7048:	48 8d 3c 88          	lea    rdi,[rax+rcx*4]
      9d704c:	48 89 3c d6          	mov    QWORD PTR [rsi+rdx*8],rdi
      9d7050:	48 83 c2 01          	add    rdx,0x1
      9d7054:	01 e9                	add    ecx,ebp
      9d7056:	49 83 c2 ff          	add    r10,0xffffffffffffffff
      9d705a:	75 e2                	jne    9d703e <_ZTSN5boost6locale4conv16conversion_errorE@@Base+0x58505e>
      9d705c:	eb 0b                	jmp    9d7069 <_ZTSN5boost6locale4conv16conversion_errorE@@Base+0x585089>
      9d705e:	49 c7 86 c8 01 00 00 	mov    QWORD PTR [r14+0x1c8],0x0
      9d7065:	00 00 00 00 
      9d7069:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      9d706d:	49 89 86 b8 01 00 00 	mov    QWORD PTR [r14+0x1b8],rax
      9d7074:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
      9d7078:	41 0f 10 4f 10       	movups xmm1,XMMWORD PTR [r15+0x10]
      9d707d:	41 0f 11 8e a8 01 00 	movups XMMWORD PTR [r14+0x1a8],xmm1
      9d7084:	00 
      9d7085:	41 0f 11 86 98 01 00 	movups XMMWORD PTR [r14+0x198],xmm0
      9d708c:	00 
      9d708d:	4c 89 33             	mov    QWORD PTR [rbx],r14
      9d7090:	31 ed                	xor    ebp,ebp
      9d7092:	eb 5f                	jmp    9d70f3 <_ZTSN5boost6locale4conv16conversion_errorE@@Base+0x585113>
      9d7094:	bd 0d 00 00 00       	mov    ebp,0xd
      9d7099:	eb 08                	jmp    9d70a3 <_ZTSN5boost6locale4conv16conversion_errorE@@Base+0x5850c3>
      9d709b:	4c 89 ef             	mov    rdi,r13
      9d709e:	e8 bd 76 e1 00       	call   17ee760 <free@plt>
      9d70a3:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      9d70a6:	31 f6                	xor    esi,esi
      9d70a8:	e8 d3 0b 00 00       	call   9d7c80 <_ZNKSt6__ndk18time_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE13do_date_orderEv@@Base+0x710>

#### 0x9d74d5; FDE=(10318864, 10319106): mov    QWORD PTR [rbx+0x1b8],rax
      9d74a3:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      9d74a8:	48 89 03             	mov    QWORD PTR [rbx],rax
      9d74ab:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
      9d74b2:	00 
      9d74b3:	48 89 83 c0 01 00 00 	mov    QWORD PTR [rbx+0x1c0],rax
      9d74ba:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      9d74be:	41 0f 10 4e 10       	movups xmm1,XMMWORD PTR [r14+0x10]
      9d74c3:	0f 11 83 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm0
      9d74ca:	0f 11 8b a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm1
      9d74d1:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
      9d74d5:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax
      9d74dc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9d74e3:	00 00 
      9d74e5:	48 3b 84 24 d8 01 00 	cmp    rax,QWORD PTR [rsp+0x1d8]
      9d74ec:	00 
      9d74ed:	75 0e                	jne    9d74fd <_ZTSN5boost6locale4conv16conversion_errorE@@Base+0x58551d>
      9d74ef:	89 e8                	mov    eax,ebp
      9d74f1:	48 81 c4 e0 01 00 00 	add    rsp,0x1e0
      9d74f8:	5b                   	pop    rbx
      9d74f9:	41 5e                	pop    r14
      9d74fb:	5d                   	pop    rbp
      9d74fc:	c3                   	ret
      9d74fd:	e8 ae 85 e1 00       	call   17efab0 <__stack_chk_fail@plt>
      9d7502:	cc                   	int3
      9d7503:	cc                   	int3
      9d7504:	cc                   	int3
      9d7505:	cc                   	int3

#### 0x9d77cd; FDE=(10319712, 10319947): mov    QWORD PTR [rsp+0x1b8],rax
      9d77a8:	00 
      9d77a9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      9d77b0:	00 00 
      9d77b2:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
      9d77b9:	00 
      9d77ba:	48 89 e0             	mov    rax,rsp
      9d77bd:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
      9d77c4:	00 
      9d77c5:	48 8d 84 24 f0 01 00 	lea    rax,[rsp+0x1f0]
      9d77cc:	00 
      9d77cd:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      9d77d4:	00 
      9d77d5:	48 b8 30 00 00 00 30 	movabs rax,0x3000000030
      9d77dc:	00 00 00 
      9d77df:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
      9d77e6:	00 
      9d77e7:	48 8d ac 24 b0 00 00 	lea    rbp,[rsp+0xb0]
      9d77ee:	00 
      9d77ef:	48 8d 8c 24 b0 01 00 	lea    rcx,[rsp+0x1b0]
      9d77f6:	00 
      9d77f7:	be 00 01 00 00       	mov    esi,0x100
      9d77fc:	48 89 ef             	mov    rdi,rbp
      9d77ff:	e8 6c 73 e1 00       	call   17eeb70 <vsnprintf@plt>
      9d7804:	48 8d 35 0e c6 95 ff 	lea    rsi,[rip+0xffffffffff95c60e]        # 333e19 <_ZTSSt12bad_any_cast@@Base-0x5c3af>
      9d780b:	48 8d 15 0d c6 95 ff 	lea    rdx,[rip+0xffffffffff95c60d]        # 333e1f <_ZTSSt12bad_any_cast@@Base-0x5c3a9>
      9d7812:	bf 04 00 00 00       	mov    edi,0x4
      9d7817:	48 89 d9             	mov    rcx,rbx

#### 0xaa2b3a; FDE=(11146264, 11168470): and    QWORD PTR [rsp+0x1b8],0x0
      aa2b13:	00 
      aa2b14:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
      aa2b18:	e9 22 33 00 00       	jmp    aa5e3f <JNI_OnUnload@@Base+0x2d70c>
      aa2b1d:	48 8d 35 58 f4 9a ff 	lea    rsi,[rip+0xffffffffff9af458]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      aa2b24:	48 8d 0d 24 e0 8b ff 	lea    rcx,[rip+0xffffffffff8be024]        # 360b4f <_ZTSSt12bad_any_cast@@Base-0x2f679>
      aa2b2b:	6a 02                	push   0x2
      aa2b2d:	5f                   	pop    rdi
      aa2b2e:	ba d4 00 00 00       	mov    edx,0xd4
      aa2b33:	31 c0                	xor    eax,eax
      aa2b35:	e8 98 3d d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      aa2b3a:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      aa2b41:	00 00 
      aa2b43:	e9 f8 09 00 00       	jmp    aa3540 <JNI_OnUnload@@Base+0x2ae0d>
      aa2b48:	31 db                	xor    ebx,ebx
      aa2b4a:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
      aa2b4f:	eb 53                	jmp    aa2ba4 <JNI_OnUnload@@Base+0x2a471>
      aa2b51:	48 8d 94 24 31 10 00 	lea    rdx,[rsp+0x1031]
      aa2b58:	00 
      aa2b59:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]
      aa2b5e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      aa2b62:	48 8d 0d 18 ba 8c ff 	lea    rcx,[rip+0xffffffffff8cba18]        # 36e581 <_ZTSSt12bad_any_cast@@Base-0x21c47>
      aa2b69:	4c 89 e7             	mov    rdi,r12
      aa2b6c:	4c 89 f6             	mov    rsi,r14
      aa2b6f:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa2b75:	49 89 c6             	mov    r14,rax
      aa2b78:	4c 89 e7             	mov    rdi,r12
      aa2b7b:	e8 68 20 d3 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>

#### 0xaa352b; FDE=(11146264, 11168470): mov    QWORD PTR [rsp+0x1b8],rbx
      aa3503:	48 83 a4 24 30 02 00 	and    QWORD PTR [rsp+0x230],0x0
      aa350a:	00 00 
      aa350c:	eb 1d                	jmp    aa352b <JNI_OnUnload@@Base+0x2adf8>
      aa350e:	48 8d 35 67 ea 9a ff 	lea    rsi,[rip+0xffffffffff9aea67]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      aa3515:	48 8d 0d 2b 63 89 ff 	lea    rcx,[rip+0xffffffffff89632b]        # 339847 <_ZTSSt12bad_any_cast@@Base-0x56981>
      aa351c:	6a 02                	push   0x2
      aa351e:	5f                   	pop    rdi
      aa351f:	ba dc 00 00 00       	mov    edx,0xdc
      aa3524:	31 c0                	xor    eax,eax
      aa3526:	e8 a7 33 d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      aa352b:	48 89 9c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbx
      aa3532:	00 
      aa3533:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
      aa353a:	00 
      aa353b:	e8 9e 36 00 00       	call   aa6bde <JNI_OnUnload@@Base+0x2e4ab>
      aa3540:	48 8b 9c 24 20 22 00 	mov    rbx,QWORD PTR [rsp+0x2220]
      aa3547:	00 
      aa3548:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
      aa354f:	00 
      aa3550:	e8 71 27 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      aa3555:	48 85 db             	test   rbx,rbx
      aa3558:	74 4e                	je     aa35a8 <JNI_OnUnload@@Base+0x2ae75>
      aa355a:	6a 30                	push   0x30
      aa355c:	5f                   	pop    rdi
      aa355d:	e8 9e a9 d4 00       	call   17edf00 <_Znwm@plt>
      aa3562:	49 89 c5             	mov    r13,rax
      aa3565:	48 89 c7             	mov    rdi,rax

#### 0xaa38c9; FDE=(11146264, 11168470): and    QWORD PTR [rsp+0x1b8],0x0
      aa38a1:	0f 57 c0             	xorps  xmm0,xmm0
      aa38a4:	0f 29 84 24 90 01 00 	movaps XMMWORD PTR [rsp+0x190],xmm0
      aa38ab:	00 
      aa38ac:	48 8d bc 24 80 07 00 	lea    rdi,[rsp+0x780]
      aa38b3:	00 
      aa38b4:	48 8d b4 24 b0 02 00 	lea    rsi,[rsp+0x2b0]
      aa38bb:	00 
      aa38bc:	e8 d9 32 00 00       	call   aa6b9a <JNI_OnUnload@@Base+0x2e467>
      aa38c1:	4c 8b ac 24 b8 01 00 	mov    r13,QWORD PTR [rsp+0x1b8]
      aa38c8:	00 
      aa38c9:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      aa38d0:	00 00 
      aa38d2:	48 8b 84 24 78 01 00 	mov    rax,QWORD PTR [rsp+0x178]
      aa38d9:	00 
      aa38da:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      aa38df:	48 83 a4 24 78 01 00 	and    QWORD PTR [rsp+0x178],0x0
      aa38e6:	00 00 
      aa38e8:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
      aa38ef:	00 
      aa38f0:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
      aa38f5:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
      aa38fc:	00 00 
      aa38fe:	48 8d 05 cb 9b d5 00 	lea    rax,[rip+0xd59bcb]        # 17fd4d0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x570>
      aa3905:	48 8b 4c 24 60       	mov    rcx,QWORD PTR [rsp+0x60]
      aa390a:	48 89 01             	mov    QWORD PTR [rcx],rax
      aa390d:	48 85 db             	test   rbx,rbx
      aa3910:	74 05                	je     aa3917 <JNI_OnUnload@@Base+0x2b1e4>

#### 0xab0d6a; FDE=(11209472, 11210959): mov    QWORD PTR [r13+0x1b8],rax
      ab0d29:	f3 41 0f 7f 85 78 01 	movdqu XMMWORD PTR [r13+0x178],xmm0
      ab0d30:	00 00 
      ab0d32:	49 8d 85 88 01 00 00 	lea    rax,[r13+0x188]
      ab0d39:	48 8b 0d b0 0f e0 00 	mov    rcx,QWORD PTR [rip+0xe00fb0]        # 18b1cf0 <_ZZN4asio9execution6detail17any_executor_base16target_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS2_10target_fnsEbPNS6_9enable_ifIXntsr7is_sameIT_vEE5valueEvE4typeEE16fns_with_execute@@Base+0x1ec78>
      ab0d40:	49 89 8d b0 01 00 00 	mov    QWORD PTR [r13+0x1b0],rcx
      ab0d47:	48 8b 0d ba 0f e0 00 	mov    rcx,QWORD PTR [rip+0xe00fba]        # 18b1d08 <_ZZN4asio9execution6detail17any_executor_base16object_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS2_10object_fnsEPNS6_9enable_ifIXaantsr7is_sameIT_vEE5valuentsr7is_sameISE_NS1_22shared_target_executorEEE5valueEvE4typeEE3fns@@Base+0x1ec70>
      ab0d4e:	49 89 8d a0 01 00 00 	mov    QWORD PTR [r13+0x1a0],rcx
      ab0d55:	4d 89 bd 88 01 00 00 	mov    QWORD PTR [r13+0x188],r15
      ab0d5c:	49 89 85 a8 01 00 00 	mov    QWORD PTR [r13+0x1a8],rax
      ab0d63:	48 8b 05 a6 0f e0 00 	mov    rax,QWORD PTR [rip+0xe00fa6]        # 18b1d10 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x1ec50>
      ab0d6a:	49 89 85 b8 01 00 00 	mov    QWORD PTR [r13+0x1b8],rax
      ab0d71:	49 83 a5 50 01 00 00 	and    QWORD PTR [r13+0x150],0x0
      ab0d78:	00 
      ab0d79:	31 ed                	xor    ebp,ebp
      ab0d7b:	41 88 ad 58 01 00 00 	mov    BYTE PTR [r13+0x158],bpl
      ab0d82:	49 8d bd c0 01 00 00 	lea    rdi,[r13+0x1c0]
      ab0d89:	49 8b b5 40 01 00 00 	mov    rsi,QWORD PTR [r13+0x140]
      ab0d90:	e8 07 de b9 00       	call   164eb9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d08>
      ab0d95:	41 88 ad d0 01 00 00 	mov    BYTE PTR [r13+0x1d0],bpl
      ab0d9c:	49 83 a5 f4 01 00 00 	and    QWORD PTR [r13+0x1f4],0x0
      ab0da3:	00 
      ab0da4:	66 0f ef c0          	pxor   xmm0,xmm0
      ab0da8:	f3 41 0f 7f 85 d4 01 	movdqu XMMWORD PTR [r13+0x1d4],xmm0
      ab0daf:	00 00 
      ab0db1:	f3 41 0f 7f 85 e4 01 	movdqu XMMWORD PTR [r13+0x1e4],xmm0
      ab0db8:	00 00 
      ab0dba:	4c 89 64 24 50       	mov    QWORD PTR [rsp+0x50],r12

#### 0xad21b5; FDE=(11344500, 11358295): movdqu XMMWORD PTR [r12+0x1b8],xmm0
      ad2186:	f3 41 0f 7f 44 04 f0 	movdqu XMMWORD PTR [r12+rax*1-0x10],xmm0
      ad218d:	f3 41 0f 7f 44 04 e0 	movdqu XMMWORD PTR [r12+rax*1-0x20],xmm0
      ad2194:	41 c7 04 04 00 00 80 	mov    DWORD PTR [r12+rax*1],0x3f800000
      ad219b:	3f 
      ad219c:	48 83 c0 28          	add    rax,0x28
      ad21a0:	48 3d d8 01 00 00    	cmp    rax,0x1d8
      ad21a6:	75 de                	jne    ad2186 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f126>
      ad21a8:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ad21ad:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      ad21b1:	66 0f 6f 01          	movdqa xmm0,XMMWORD PTR [rcx]
      ad21b5:	f3 41 0f 7f 84 24 b8 	movdqu XMMWORD PTR [r12+0x1b8],xmm0
      ad21bc:	01 00 00 
      ad21bf:	48 85 c0             	test   rax,rax
      ad21c2:	74 05                	je     ad21c9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f169>
      ad21c4:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ad21c9:	49 8d bc 24 d0 01 00 	lea    rdi,[r12+0x1d0]
      ad21d0:	00 
      ad21d1:	e8 ba 80 fa ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      ad21d6:	e8 75 bf d1 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
      ad21db:	49 89 84 24 00 02 00 	mov    QWORD PTR [r12+0x200],rax
      ad21e2:	00 
      ad21e3:	e8 78 bf d1 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
      ad21e8:	49 89 84 24 08 02 00 	mov    QWORD PTR [r12+0x208],rax
      ad21ef:	00 
      ad21f0:	4c 89 e7             	mov    rdi,r12
      ad21f3:	48 81 c7 10 02 00 00 	add    rdi,0x210
      ad21fa:	e8 03 7c d0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>

#### 0xad8933; FDE=(11372000, 11374203): mov    QWORD PTR [rsp+0x1b8],r13
      ad8911:	00 
      ad8912:	48 0f c8             	bswap  rax
      ad8915:	49 ff c4             	inc    r12
      ad8918:	85 44 24 60          	test   DWORD PTR [rsp+0x60],eax
      ad891c:	75 92                	jne    ad88b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25850>
      ad891e:	49 89 de             	mov    r14,rbx
      ad8921:	e8 3a 58 d1 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
      ad8926:	48 2b 44 24 50       	sub    rax,QWORD PTR [rsp+0x50]
      ad892b:	4c 89 bc 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r15
      ad8932:	00 
      ad8933:	4c 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r13
      ad893a:	00 
      ad893b:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
      ad8942:	00 
      ad8943:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      ad8948:	83 7f 28 04          	cmp    DWORD PTR [rdi+0x28],0x4
      ad894c:	75 47                	jne    ad8995 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25935>
      ad894e:	48 8b 5f 20          	mov    rbx,QWORD PTR [rdi+0x20]
      ad8952:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
      ad8957:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
      ad895c:	4d 89 f5             	mov    r13,r14
      ad895f:	4c 8d b4 24 70 01 00 	lea    r14,[rsp+0x170]
      ad8966:	00 
      ad8967:	eb 71                	jmp    ad89da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2597a>
      ad8969:	6a 04                	push   0x4
      ad896b:	5f                   	pop    rdi
      ad896c:	48 8d 35 09 96 97 ff 	lea    rsi,[rip+0xffffffffff979609]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>

#### 0xae3d7d; FDE=(11415662, 11422402): mov    QWORD PTR [rbx+0x1b8],rax
      ae3d4d:	48 8d b4 24 60 03 00 	lea    rsi,[rsp+0x360]
      ae3d54:	00 
      ae3d55:	e8 4a 35 00 00       	call   ae72a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34244>
      ae3d5a:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
      ae3d61:	48 8d b4 24 78 03 00 	lea    rsi,[rsp+0x378]
      ae3d68:	00 
      ae3d69:	e8 6e 35 00 00       	call   ae72dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3427c>
      ae3d6e:	48 8d 8c 24 60 02 00 	lea    rcx,[rsp+0x260]
      ae3d75:	00 
      ae3d76:	48 8b 81 60 01 00 00 	mov    rax,QWORD PTR [rcx+0x160]
      ae3d7d:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax
      ae3d84:	f3 0f 6f 81 40 01 00 	movdqu xmm0,XMMWORD PTR [rcx+0x140]
      ae3d8b:	00 
      ae3d8c:	0f 10 89 50 01 00 00 	movups xmm1,XMMWORD PTR [rcx+0x150]
      ae3d93:	0f 11 8b a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm1
      ae3d9a:	f3 0f 7f 83 98 01 00 	movdqu XMMWORD PTR [rbx+0x198],xmm0
      ae3da1:	00 
      ae3da2:	48 81 c3 c0 01 00 00 	add    rbx,0x1c0
      ae3da9:	48 89 df             	mov    rdi,rbx
      ae3dac:	48 8d b4 24 c8 03 00 	lea    rsi,[rsp+0x3c8]
      ae3db3:	00 
      ae3db4:	e8 75 7c f9 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      ae3db9:	4c 89 f7             	mov    rdi,r14
      ae3dbc:	e8 d7 35 00 00       	call   ae7398 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34338>
      ae3dc1:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
      ae3dc6:	4c 8b 30             	mov    r14,QWORD PTR [rax]
      ae3dc9:	48 8b 68 08          	mov    rbp,QWORD PTR [rax+0x8]

#### 0xaee9ad; FDE=(11462790, 11463130): mov    QWORD PTR [r14+0x1b8],rax
      aee977:	0f 11 09             	movups XMMWORD PTR [rcx],xmm1
      aee97a:	48 8b 83 a0 01 00 00 	mov    rax,QWORD PTR [rbx+0x1a0]
      aee981:	49 89 86 a0 01 00 00 	mov    QWORD PTR [r14+0x1a0],rax
      aee988:	0f 10 8b 80 01 00 00 	movups xmm1,XMMWORD PTR [rbx+0x180]
      aee98f:	0f 10 93 90 01 00 00 	movups xmm2,XMMWORD PTR [rbx+0x190]
      aee996:	41 0f 11 96 90 01 00 	movups XMMWORD PTR [r14+0x190],xmm2
      aee99d:	00 
      aee99e:	41 0f 11 8e 80 01 00 	movups XMMWORD PTR [r14+0x180],xmm1
      aee9a5:	00 
      aee9a6:	48 8b 83 b8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1b8]
      aee9ad:	49 89 86 b8 01 00 00 	mov    QWORD PTR [r14+0x1b8],rax
      aee9b4:	0f 10 8b a8 01 00 00 	movups xmm1,XMMWORD PTR [rbx+0x1a8]
      aee9bb:	41 0f 11 8e a8 01 00 	movups XMMWORD PTR [r14+0x1a8],xmm1
      aee9c2:	00 
      aee9c3:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
      aee9ca:	48 83 a3 b8 01 00 00 	and    QWORD PTR [rbx+0x1b8],0x0
      aee9d1:	00 
      aee9d2:	48 83 c4 08          	add    rsp,0x8
      aee9d6:	5b                   	pop    rbx
      aee9d7:	41 5e                	pop    r14
      aee9d9:	c3                   	ret
      aee9da:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      aee9de:	e9 01 00 00 00       	jmp    aee9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3b984>
      aee9e3:	cc                   	int3
      aee9e4:	53                   	push   rbx
      aee9e5:	48 89 fb             	mov    rbx,rdi
      aee9e8:	48 85 ff             	test   rdi,rdi

#### 0xaee9ca; FDE=(11462790, 11463130): and    QWORD PTR [rbx+0x1b8],0x0
      aee996:	41 0f 11 96 90 01 00 	movups XMMWORD PTR [r14+0x190],xmm2
      aee99d:	00 
      aee99e:	41 0f 11 8e 80 01 00 	movups XMMWORD PTR [r14+0x180],xmm1
      aee9a5:	00 
      aee9a6:	48 8b 83 b8 01 00 00 	mov    rax,QWORD PTR [rbx+0x1b8]
      aee9ad:	49 89 86 b8 01 00 00 	mov    QWORD PTR [r14+0x1b8],rax
      aee9b4:	0f 10 8b a8 01 00 00 	movups xmm1,XMMWORD PTR [rbx+0x1a8]
      aee9bb:	41 0f 11 8e a8 01 00 	movups XMMWORD PTR [r14+0x1a8],xmm1
      aee9c2:	00 
      aee9c3:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
      aee9ca:	48 83 a3 b8 01 00 00 	and    QWORD PTR [rbx+0x1b8],0x0
      aee9d1:	00 
      aee9d2:	48 83 c4 08          	add    rsp,0x8
      aee9d6:	5b                   	pop    rbx
      aee9d7:	41 5e                	pop    r14
      aee9d9:	c3                   	ret
      aee9da:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      aee9de:	e9 01 00 00 00       	jmp    aee9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3b984>
      aee9e3:	cc                   	int3
      aee9e4:	53                   	push   rbx
      aee9e5:	48 89 fb             	mov    rbx,rdi
      aee9e8:	48 85 ff             	test   rdi,rdi
      aee9eb:	74 08                	je     aee9f5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3b995>
      aee9ed:	48 89 df             	mov    rdi,rbx
      aee9f0:	e8 09 00 00 00       	call   aee9fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3b99e>
      aee9f5:	48 89 df             	mov    rdi,rbx
      aee9f8:	5b                   	pop    rbx

#### 0xaf88e3; FDE=(11502972, 11505072): movdqu XMMWORD PTR [r15+0x1b8],xmm0
      af88b7:	4c 89 e2             	mov    rdx,r12
      af88ba:	e8 3f 3b 00 00       	call   afc3fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4939e>
      af88bf:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
      af88c4:	66 0f ef c0          	pxor   xmm0,xmm0
      af88c8:	f3 41 0f 7f 87 e8 01 	movdqu XMMWORD PTR [r15+0x1e8],xmm0
      af88cf:	00 00 
      af88d1:	f3 41 0f 7f 87 d8 01 	movdqu XMMWORD PTR [r15+0x1d8],xmm0
      af88d8:	00 00 
      af88da:	f3 41 0f 7f 87 c8 01 	movdqu XMMWORD PTR [r15+0x1c8],xmm0
      af88e1:	00 00 
      af88e3:	f3 41 0f 7f 87 b8 01 	movdqu XMMWORD PTR [r15+0x1b8],xmm0
      af88ea:	00 00 
      af88ec:	f3 41 0f 7f 87 a8 01 	movdqu XMMWORD PTR [r15+0x1a8],xmm0
      af88f3:	00 00 
      af88f5:	49 83 a7 f8 01 00 00 	and    QWORD PTR [r15+0x1f8],0x0
      af88fc:	00 
      af88fd:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
      af8901:	4c 89 7b 20          	mov    QWORD PTR [rbx+0x20],r15
      af8905:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      af8909:	48 85 c0             	test   rax,rax
      af890c:	74 0a                	je     af8918 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x458b8>
      af890e:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      af8912:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
      af8916:	75 23                	jne    af893b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x458db>
      af8918:	f0 49 ff 47 08       	lock inc QWORD PTR [r15+0x8]
      af891d:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      af8922:	49 89 4f 20          	mov    QWORD PTR [r15+0x20],rcx

#### 0xafe2b3; FDE=(11526158, 11527229): mov    QWORD PTR [rbx+0x1b8],rax
      afe288:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      afe28d:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
      afe292:	48 8d 15 6d 46 88 ff 	lea    rdx,[rip+0xffffffffff88466d]        # 382906 <_ZTSSt12bad_any_cast@@Base-0xd8c2>
      afe299:	31 c9                	xor    ecx,ecx
      afe29b:	e8 f2 66 cc 00       	call   17c4992 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178afe>
      afe2a0:	48 89 c7             	mov    rdi,rax
      afe2a3:	31 f6                	xor    esi,esi
      afe2a5:	e8 46 5d cc 00       	call   17c3ff0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17815c>
      afe2aa:	48 98                	cdqe
      afe2ac:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
      afe2b3:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax
      afe2ba:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      afe2bf:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
      afe2c4:	48 8d 15 24 12 88 ff 	lea    rdx,[rip+0xffffffffff881224]        # 37f4ef <_ZTSSt12bad_any_cast@@Base-0x10cd9>
      afe2cb:	31 c9                	xor    ecx,ecx
      afe2cd:	e8 c0 66 cc 00       	call   17c4992 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178afe>
      afe2d2:	48 8d 35 a3 3c 95 ff 	lea    rsi,[rip+0xffffffffff953ca3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      afe2d9:	48 89 c7             	mov    rdi,rax
      afe2dc:	e8 61 54 cc 00       	call   17c3742 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1778ae>
      afe2e1:	48 89 e7             	mov    rdi,rsp
      afe2e4:	48 89 c6             	mov    rsi,rax
      afe2e7:	e8 92 b7 f7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      afe2ec:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
      afe2f1:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
      afe2f6:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
      afe2fb:	48 8d 15 63 97 83 ff 	lea    rdx,[rip+0xffffffffff839763]        # 337a65 <_ZTSSt12bad_any_cast@@Base-0x58763>
      afe302:	31 c9                	xor    ecx,ecx

#### 0xb07a61; FDE=(11565154, 11566905): movups XMMWORD PTR [rsp+0x1b8],xmm0
      b07a37:	48 89 c7             	mov    rdi,rax
      b07a3a:	e8 15 07 00 00       	call   b08154 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x550f4>
      b07a3f:	49 89 c4             	mov    r12,rax
      b07a42:	83 78 1c 01          	cmp    DWORD PTR [rax+0x1c],0x1
      b07a46:	0f 85 d6 00 00 00    	jne    b07b22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54ac2>
      b07a4c:	4d 8b 7c 24 10       	mov    r15,QWORD PTR [r12+0x10]
      b07a51:	e9 f9 00 00 00       	jmp    b07b4f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x54aef>
      b07a56:	83 a4 24 b0 01 00 00 	and    DWORD PTR [rsp+0x1b0],0x0
      b07a5d:	00 
      b07a5e:	0f 57 c0             	xorps  xmm0,xmm0
      b07a61:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      b07a68:	00 
      b07a69:	0f 11 84 24 c8 01 00 	movups XMMWORD PTR [rsp+0x1c8],xmm0
      b07a70:	00 
      b07a71:	0f 11 84 24 d8 01 00 	movups XMMWORD PTR [rsp+0x1d8],xmm0
      b07a78:	00 
      b07a79:	0f 11 84 24 e8 01 00 	movups XMMWORD PTR [rsp+0x1e8],xmm0
      b07a80:	00 
      b07a81:	0f 11 84 24 f8 01 00 	movups XMMWORD PTR [rsp+0x1f8],xmm0
      b07a88:	00 
      b07a89:	48 83 a4 24 30 02 00 	and    QWORD PTR [rsp+0x230],0x0
      b07a90:	00 00 
      b07a92:	48 83 a4 24 60 02 00 	and    QWORD PTR [rsp+0x260],0x0
      b07a99:	00 00 
      b07a9b:	48 83 a4 24 90 02 00 	and    QWORD PTR [rsp+0x290],0x0
      b07aa2:	00 00 
      b07aa4:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]

#### 0xb351a4; FDE=(11751004, 11753454): and    QWORD PTR [rsp+0x1b8],0x0
      b3517a:	48 8d 2d df 4d cd 00 	lea    rbp,[rip+0xcd4ddf]        # 1809f60 <_ZTIN4asio22service_already_existsE@@Base+0xb748>
      b35181:	49 89 6d 00          	mov    QWORD PTR [r13+0x0],rbp
      b35185:	49 83 c4 30          	add    r12,0x30
      b35189:	4c 89 e7             	mov    rdi,r12
      b3518c:	e8 a5 66 f4 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      b35191:	4c 89 ef             	mov    rdi,r13
      b35194:	48 89 c6             	mov    rsi,rax
      b35197:	e8 b6 a6 c4 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      b3519c:	84 c0                	test   al,al
      b3519e:	0f 84 c2 01 00 00    	je     b35366 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82306>
      b351a4:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      b351ab:	00 00 
      b351ad:	83 a4 24 c0 01 00 00 	and    DWORD PTR [rsp+0x1c0],0x0
      b351b4:	00 
      b351b5:	48 89 ac 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rbp
      b351bc:	00 
      b351bd:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
      b351c4:	00 
      b351c5:	a8 01                	test   al,0x1
      b351c7:	0f 85 d8 05 00 00    	jne    b357a5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x82745>
      b351cd:	48 85 c0             	test   rax,rax
      b351d0:	0f 84 25 03 00 00    	je     b354fb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8249b>
      b351d6:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      b351dd:	00 
      b351de:	48 8d b4 24 68 01 00 	lea    rsi,[rsp+0x168]
      b351e5:	00 
      b351e6:	e8 75 98 c1 00       	call   174ea60 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x102bcc>

#### 0xb36267; FDE=(11754596, 11756654): mov    QWORD PTR [rsp+0x1b8],rcx
      b3623e:	4c 89 a4 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r12
      b36245:	00 
      b36246:	48 8b 8c 24 b0 01 00 	mov    rcx,QWORD PTR [rsp+0x1b0]
      b3624d:	00 
      b3624e:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
      b36253:	4c 89 ac 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r13
      b3625a:	00 
      b3625b:	4c 8b a4 24 b8 01 00 	mov    r12,QWORD PTR [rsp+0x1b8]
      b36262:	00 
      b36263:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
      b36267:	48 89 8c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rcx
      b3626e:	00 
      b3626f:	49 89 c5             	mov    r13,rax
      b36272:	4c 89 ff             	mov    rdi,r15
      b36275:	e8 24 97 f6 ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
      b3627a:	4d 89 e2             	mov    r10,r12
      b3627d:	4c 8b 4c 24 08       	mov    r9,QWORD PTR [rsp+0x8]
      b36282:	49 8b 46 f8          	mov    rax,QWORD PTR [r14-0x8]
      b36286:	49 83 c6 f8          	add    r14,0xfffffffffffffff8
      b3628a:	48 89 45 f8          	mov    QWORD PTR [rbp-0x8],rax
      b3628e:	4c 8b a4 24 38 01 00 	mov    r12,QWORD PTR [rsp+0x138]
      b36295:	00 
      b36296:	49 83 c4 f8          	add    r12,0xfffffffffffffff8
      b3629a:	4c 89 a4 24 38 01 00 	mov    QWORD PTR [rsp+0x138],r12
      b362a1:	00 
      b362a2:	4c 3b 73 68          	cmp    r14,QWORD PTR [rbx+0x68]
      b362a6:	6a 01                	push   0x1

#### 0xb469a4; FDE=(11823500, 11823674): mov    QWORD PTR [rsp+0x1b8],rax
      b46981:	c3                   	ret
      b46982:	e8 38 36 f3 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b46987:	e8 33 36 f3 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b4698c:	41 57                	push   r15
      b4698e:	41 56                	push   r14
      b46990:	53                   	push   rbx
      b46991:	48 81 ec c0 01 00 00 	sub    rsp,0x1c0
      b46998:	49 89 d6             	mov    r14,rdx
      b4699b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b469a2:	00 00 
      b469a4:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      b469ab:	00 
      b469ac:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
      b469b0:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
      b469b5:	e8 86 75 ca 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b469ba:	e8 91 77 ca 00       	call   17ee150 <_ZNSt6__ndk16chrono12system_clock3nowEv@plt>
      b469bf:	49 89 c7             	mov    r15,rax
      b469c2:	48 89 e7             	mov    rdi,rsp
      b469c5:	4c 89 f6             	mov    rsi,r14
      b469c8:	e8 73 75 ca 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      b469cd:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
      b469d2:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b469d7:	48 89 e1             	mov    rcx,rsp
      b469da:	4c 89 f7             	mov    rdi,r14
      b469dd:	4c 89 fa             	mov    rdx,r15
      b469e0:	e8 f4 ce ff ff       	call   b438d9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x90879>
      b469e5:	48 8b 03             	mov    rax,QWORD PTR [rbx]

#### 0xb63a40; FDE=(11942008, 11942882): movups XMMWORD PTR [rsp+0x1b8],xmm0
      b63a15:	e8 f6 06 00 00       	call   b64110 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb10b0>
      b63a1a:	41 80 7f 10 00       	cmp    BYTE PTR [r15+0x10],0x0
      b63a1f:	74 0a                	je     b63a2b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb09cb>
      b63a21:	48 8b 54 24 70       	mov    rdx,QWORD PTR [rsp+0x70]
      b63a26:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
      b63a2b:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
      b63a32:	00 
      b63a33:	48 89 94 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rdx
      b63a3a:	00 
      b63a3b:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
      b63a40:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      b63a47:	00 
      b63a48:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
      b63a4d:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
      b63a54:	00 
      b63a55:	0f 57 c0             	xorps  xmm0,xmm0
      b63a58:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
      b63a5d:	48 83 64 24 30 00    	and    QWORD PTR [rsp+0x30],0x0
      b63a63:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      b63a68:	4c 8b 78 20          	mov    r15,QWORD PTR [rax+0x20]
      b63a6c:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
      b63a73:	00 
      b63a74:	48 89 de             	mov    rsi,rbx
      b63a77:	e8 de 0b 00 00       	call   b6465a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb15fa>
      b63a7c:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      b63a81:	48 8b 41 08          	mov    rax,QWORD PTR [rcx+0x8]
      b63a85:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]

#### 0xb67b00; FDE=(11958660, 11960039): mov    BYTE PTR [rsp+0x1b8],al
      b67ae1:	00 
      b67ae2:	e8 d9 0a 00 00       	call   b685c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5560>
      b67ae7:	eb 1e                	jmp    b67b07 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4aa7>
      b67ae9:	31 ed                	xor    ebp,ebp
      b67aeb:	49 8b 7e 70          	mov    rdi,QWORD PTR [r14+0x70]
      b67aef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b67af2:	ff 50 18             	call   QWORD PTR [rax+0x18]
      b67af5:	e9 27 03 00 00       	jmp    b67e21 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4dc1>
      b67afa:	31 c0                	xor    eax,eax
      b67afc:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
      b67b00:	88 84 24 b8 01 00 00 	mov    BYTE PTR [rsp+0x1b8],al
      b67b07:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
      b67b0e:	00 
      b67b0f:	e8 e4 bd b6 00       	call   16d38f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87a64>
      b67b14:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      b67b1b:	00 
      b67b1c:	e8 09 0a 00 00       	call   b6852a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54ca>
      b67b21:	41 0f b7 6e 68       	movzx  ebp,WORD PTR [r14+0x68]
      b67b26:	4c 8d bc 24 c0 01 00 	lea    r15,[rsp+0x1c0]
      b67b2d:	00 
      b67b2e:	4c 89 ff             	mov    rdi,r15
      b67b31:	4c 89 f6             	mov    rsi,r14
      b67b34:	e8 f1 29 b6 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
      b67b39:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
      b67b3d:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
      b67b42:	48 8d bc 24 58 02 00 	lea    rdi,[rsp+0x258]
      b67b49:	00 

#### 0xb6a514; FDE=(11969454, 11970457): and    QWORD PTR [rsp+0x1b8],0x0
      b6a4e9:	48 83 a4 24 80 01 00 	and    QWORD PTR [rsp+0x180],0x0
      b6a4f0:	00 00 
      b6a4f2:	48 8d 05 2f 11 d0 00 	lea    rax,[rip+0xd0112f]        # 186b628 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x27d10>
      b6a4f9:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
      b6a500:	00 
      b6a501:	0f 57 c0             	xorps  xmm0,xmm0
      b6a504:	0f 11 84 24 88 01 00 	movups XMMWORD PTR [rsp+0x188],xmm0
      b6a50b:	00 
      b6a50c:	0f 11 84 24 98 01 00 	movups XMMWORD PTR [rsp+0x198],xmm0
      b6a513:	00 
      b6a514:	48 83 a4 24 b8 01 00 	and    QWORD PTR [rsp+0x1b8],0x0
      b6a51b:	00 00 
      b6a51d:	0f 11 84 24 a8 01 00 	movups XMMWORD PTR [rsp+0x1a8],xmm0
      b6a524:	00 
      b6a525:	48 8d 05 cc 52 8d ff 	lea    rax,[rip+0xffffffffff8d52cc]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
      b6a52c:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
      b6a533:	00 
      b6a534:	0f 11 84 24 c8 01 00 	movups XMMWORD PTR [rsp+0x1c8],xmm0
      b6a53b:	00 
      b6a53c:	48 83 a4 24 d8 01 00 	and    QWORD PTR [rsp+0x1d8],0x0
      b6a543:	00 00 
      b6a545:	49 8d 87 b8 00 00 00 	lea    rax,[r15+0xb8]
      b6a54c:	49 8b 8f b8 00 00 00 	mov    rcx,QWORD PTR [r15+0xb8]
      b6a553:	49 89 cc             	mov    r12,rcx
      b6a556:	49 83 c4 07          	add    r12,0x7
      b6a55a:	f6 c1 01             	test   cl,0x1
      b6a55d:	4c 0f 44 e0          	cmove  r12,rax

#### 0xb7b365; FDE=(12038796, 12039240): mov    BYTE PTR [rbx+0x1b8],al
      b7b332:	48 8d 83 20 01 00 00 	lea    rax,[rbx+0x120]
      b7b339:	0f 29 83 20 01 00 00 	movaps XMMWORD PTR [rbx+0x120],xmm0
      b7b340:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
      b7b347:	48 83 a3 30 01 00 00 	and    QWORD PTR [rbx+0x130],0x0
      b7b34e:	00 
      b7b34f:	66 83 a3 38 01 00 00 	and    WORD PTR [rbx+0x138],0x0
      b7b356:	00 
      b7b357:	31 c0                	xor    eax,eax
      b7b359:	88 83 a0 01 00 00    	mov    BYTE PTR [rbx+0x1a0],al
      b7b35f:	88 83 b0 01 00 00    	mov    BYTE PTR [rbx+0x1b0],al
      b7b365:	88 83 b8 01 00 00    	mov    BYTE PTR [rbx+0x1b8],al
      b7b36b:	0f 29 83 40 01 00 00 	movaps XMMWORD PTR [rbx+0x140],xmm0
      b7b372:	0f 29 83 50 01 00 00 	movaps XMMWORD PTR [rbx+0x150],xmm0
      b7b379:	0f 29 83 60 01 00 00 	movaps XMMWORD PTR [rbx+0x160],xmm0
      b7b380:	0f 29 83 70 01 00 00 	movaps XMMWORD PTR [rbx+0x170],xmm0
      b7b387:	0f 29 83 80 01 00 00 	movaps XMMWORD PTR [rbx+0x180],xmm0
      b7b38e:	0f 11 83 8a 01 00 00 	movups XMMWORD PTR [rbx+0x18a],xmm0
      b7b395:	48 39 43 38          	cmp    QWORD PTR [rbx+0x38],rax
      b7b399:	48 8d 05 c4 81 8c ff 	lea    rax,[rip+0xffffffffff8c81c4]        # 443564 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9170>
      b7b3a0:	4c 8d 05 b9 81 8c ff 	lea    r8,[rip+0xffffffffff8c81b9]        # 443560 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x916c>
      b7b3a7:	4c 0f 44 c0          	cmove  r8,rax
      b7b3ab:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b7b3b2:	00 00 
      b7b3b4:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      b7b3b9:	0f 85 84 00 00 00    	jne    b7b443 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc83e3>
      b7b3bf:	48 8d 35 b6 6b 8d ff 	lea    rsi,[rip+0xffffffffff8d6bb6]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b7b3c6:	48 8d 0d c3 c9 7b ff 	lea    rcx,[rip+0xffffffffff7bc9c3]        # 337d90 <_ZTSSt12bad_any_cast@@Base-0x58438>

#### 0xb7d0ad; FDE=(12046468, 12046518): mov    BYTE PTR [rbx+0x1b8],0x1
      b7d08e:	53                   	push   rbx
      b7d08f:	48 89 fb             	mov    rbx,rdi
      b7d092:	48 8d 35 e3 4e 8d ff 	lea    rsi,[rip+0xffffffffff8d4ee3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      b7d099:	48 8d 0d 00 f2 7c ff 	lea    rcx,[rip+0xffffffffff7cf200]        # 34c2a0 <_ZTSSt12bad_any_cast@@Base-0x43f28>
      b7d0a0:	6a 04                	push   0x4
      b7d0a2:	5f                   	pop    rdi
      b7d0a3:	6a 7e                	push   0x7e
      b7d0a5:	5a                   	pop    rdx
      b7d0a6:	31 c0                	xor    eax,eax
      b7d0a8:	e8 25 98 c5 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      b7d0ad:	c6 83 b8 01 00 00 01 	mov    BYTE PTR [rbx+0x1b8],0x1
      b7d0b4:	5b                   	pop    rbx
      b7d0b5:	c3                   	ret
      b7d0b6:	53                   	push   rbx
      b7d0b7:	48 89 fb             	mov    rbx,rdi
      b7d0ba:	6a 10                	push   0x10
      b7d0bc:	5f                   	pop    rdi
      b7d0bd:	e8 3e 0e c7 00       	call   17edf00 <_Znwm@plt>
      b7d0c2:	48 8d 0d e7 09 c9 00 	lea    rcx,[rip+0xc909e7]        # 180dab0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3770>
      b7d0c9:	48 89 08             	mov    QWORD PTR [rax],rcx
      b7d0cc:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
      b7d0d0:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      b7d0d4:	5b                   	pop    rbx
      b7d0d5:	c3                   	ret
      b7d0d6:	48 8d 05 d3 09 c9 00 	lea    rax,[rip+0xc909d3]        # 180dab0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3770>
      b7d0dd:	48 89 06             	mov    QWORD PTR [rsi],rax
      b7d0e0:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]

#### 0xb7eb29; FDE=(12051374, 12057354): mov    QWORD PTR [rsp+0x1b8],rbx
      b7eb01:	48 89 84 24 50 02 00 	mov    QWORD PTR [rsp+0x250],rax
      b7eb08:	00 
      b7eb09:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      b7eb10:	00 
      b7eb11:	4c 89 ee             	mov    rsi,r13
      b7eb14:	e8 2d 0e f2 ff       	call   a9f946 <JNI_OnUnload@@Base+0x27213>
      b7eb19:	48 8b 9c 24 b8 01 00 	mov    rbx,QWORD PTR [rsp+0x1b8]
      b7eb20:	00 
      b7eb21:	4c 89 ef             	mov    rdi,r13
      b7eb24:	e8 75 0e f2 ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
      b7eb29:	48 89 9c 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rbx
      b7eb30:	00 
      b7eb31:	49 8b 8c 24 98 03 00 	mov    rcx,QWORD PTR [r12+0x398]
      b7eb38:	00 
      b7eb39:	49 8b 94 24 a0 03 00 	mov    rdx,QWORD PTR [r12+0x3a0]
      b7eb40:	00 
      b7eb41:	48 ff c5             	inc    rbp
      b7eb44:	48 89 d0             	mov    rax,rdx
      b7eb47:	48 29 c8             	sub    rax,rcx
      b7eb4a:	48 c1 e8 03          	shr    rax,0x3
      b7eb4e:	48 98                	cdqe
      b7eb50:	48 39 c5             	cmp    rbp,rax
      b7eb53:	0f 8c bc fe ff ff    	jl     b7ea15 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcb9b5>
      b7eb59:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      b7eb60:	00 
      b7eb61:	e8 e4 56 00 00       	call   b8424a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd11ea>
      b7eb66:	4c 8b b4 24 b8 01 00 	mov    r14,QWORD PTR [rsp+0x1b8]

#### 0xb8aa51; FDE=(12102198, 12102444): mov    QWORD PTR [rsp+0x1b8],rax
      b8aa2c:	e8 9f 52 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b8aa31:	e8 7a 50 c6 00       	call   17efab0 <__stack_chk_fail@plt>
      b8aa36:	41 57                	push   r15
      b8aa38:	41 56                	push   r14
      b8aa3a:	53                   	push   rbx
      b8aa3b:	48 81 ec c0 01 00 00 	sub    rsp,0x1c0
      b8aa42:	49 89 f6             	mov    r14,rsi
      b8aa45:	49 89 ff             	mov    r15,rdi
      b8aa48:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8aa4f:	00 00 
      b8aa51:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      b8aa58:	00 
      b8aa59:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      b8aa5c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b8aa5f:	48 89 f7             	mov    rdi,rsi
      b8aa62:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      b8aa68:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      b8aa6d:	48 89 07             	mov    QWORD PTR [rdi],rax
      b8aa70:	48 89 57 08          	mov    QWORD PTR [rdi+0x8],rdx
      b8aa74:	49 83 c7 08          	add    r15,0x8
      b8aa78:	4c 89 fe             	mov    rsi,r15
      b8aa7b:	e8 a2 01 00 00       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
      b8aa80:	84 c0                	test   al,al
      b8aa82:	74 4c                	je     b8aad0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7a70>
      b8aa84:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b8aa87:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
      b8aa8c:	6a ff                	push   0xffffffffffffffff

#### 0xb8ab47; FDE=(12102444, 12102690): mov    QWORD PTR [rsp+0x1b8],rax
      b8ab22:	e8 a9 51 ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b8ab27:	e8 84 4f c6 00       	call   17efab0 <__stack_chk_fail@plt>
      b8ab2c:	41 57                	push   r15
      b8ab2e:	41 56                	push   r14
      b8ab30:	53                   	push   rbx
      b8ab31:	48 81 ec c0 01 00 00 	sub    rsp,0x1c0
      b8ab38:	49 89 f6             	mov    r14,rsi
      b8ab3b:	49 89 ff             	mov    r15,rdi
      b8ab3e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b8ab45:	00 00 
      b8ab47:	48 89 84 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],rax
      b8ab4e:	00 
      b8ab4f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      b8ab52:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      b8ab55:	48 89 f7             	mov    rdi,rsi
      b8ab58:	ff 90 68 01 00 00    	call   QWORD PTR [rax+0x168]
      b8ab5e:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
      b8ab63:	48 89 07             	mov    QWORD PTR [rdi],rax
      b8ab66:	48 89 57 08          	mov    QWORD PTR [rdi+0x8],rdx
      b8ab6a:	49 83 c7 08          	add    r15,0x8
      b8ab6e:	4c 89 fe             	mov    rsi,r15
      b8ab71:	e8 ac 00 00 00       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
      b8ab76:	84 c0                	test   al,al
      b8ab78:	74 4c                	je     b8abc6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7b66>
      b8ab7a:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b8ab7d:	4c 8d 7c 24 58       	lea    r15,[rsp+0x58]
      b8ab82:	6a ff                	push   0xffffffffffffffff

#### 0xb8c590; FDE=(12104738, 12113141): mov    QWORD PTR [rsp+0x1b8],r15
      b8c569:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b8c56e:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
      b8c575:	00 
      b8c576:	4c 89 ac 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r13
      b8c57d:	00 
      b8c57e:	4c 89 b4 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],r14
      b8c585:	00 
      b8c586:	4d 85 f6             	test   r14,r14
      b8c589:	74 05                	je     b8c590 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9530>
      b8c58b:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c590:	4c 89 bc 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r15
      b8c597:	00 
      b8c598:	4c 89 ac 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],r13
      b8c59f:	00 
      b8c5a0:	4c 89 b4 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],r14
      b8c5a7:	00 
      b8c5a8:	40 84 ed             	test   bpl,bpl
      b8c5ab:	75 05                	jne    b8c5b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9552>
      b8c5ad:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
      b8c5b2:	4c 89 bc 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],r15
      b8c5b9:	00 
      b8c5ba:	4c 89 bc 24 d8 01 00 	mov    QWORD PTR [rsp+0x1d8],r15
      b8c5c1:	00 
      b8c5c2:	4c 89 bc 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],r15
      b8c5c9:	00 
      b8c5ca:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
      b8c5cf:	48 89 84 24 40 02 00 	mov    QWORD PTR [rsp+0x240],rax

#### 0xbac01c; FDE=(12150626, 12300170): movups XMMWORD PTR [rbx+0x1b8],xmm0
      babfe2:	48 b8 54 b0 8d 35 46 	movabs rax,0xd3e07046358db054
      babfe9:	70 e0 d3 
      babfec:	48 89 83 a0 01 00 00 	mov    QWORD PTR [rbx+0x1a0],rax
      babff3:	48 b8 ca 05 98 99 eb 	movabs rax,0xdc6d79eb999805ca
      babffa:	79 6d dc 
      babffd:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
      bac004:	48 b8 f8 a9 6a e6 6f 	movabs rax,0xa7a4c6fe66aa9f8
      bac00b:	4c 7a 0a 
      bac00e:	48 89 83 b0 01 00 00 	mov    QWORD PTR [rbx+0x1b0],rax
      bac015:	0f 28 05 74 15 7e ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff7e1574]        # 38d590 <_ZTSSt12bad_any_cast@@Base-0x2c38>
      bac01c:	0f 11 83 b8 01 00 00 	movups XMMWORD PTR [rbx+0x1b8],xmm0
      bac023:	0f 28 05 66 0c 7e ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff7e0c66]        # 38cc90 <_ZTSSt12bad_any_cast@@Base-0x3538>
      bac02a:	0f 11 83 c8 01 00 00 	movups XMMWORD PTR [rbx+0x1c8],xmm0
      bac031:	0f 28 05 b8 1f 7e ff 	movaps xmm0,XMMWORD PTR [rip+0xffffffffff7e1fb8]        # 38dff0 <_ZTSSt12bad_any_cast@@Base-0x21d8>
      bac038:	0f 11 83 d8 01 00 00 	movups XMMWORD PTR [rbx+0x1d8],xmm0
      bac03f:	41 69 c4 81 f0 9d 89 	imul   eax,r12d,0x899df081
      bac046:	3d 24 1b 72 2c       	cmp    eax,0x2c721b24
      bac04b:	75 38                	jne    bac085 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xf9025>
      bac04d:	48 8d 94 24 40 01 00 	lea    rdx,[rsp+0x140]
      bac054:	00 
      bac055:	48 89 1a             	mov    QWORD PTR [rdx],rbx
      bac058:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
      bac05f:	00 
      bac060:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      bac064:	44 89 62 10          	mov    DWORD PTR [rdx+0x10],r12d
      bac068:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
      bac06f:	00 

#### 0xbd1176; FDE=(12390452, 12391170): mov    BYTE PTR [rbx+0x1b8],al
      bd1148:	be 00 20 00 00       	mov    esi,0x2000
      bd114d:	4c 89 ff             	mov    rdi,r15
      bd1150:	e8 4f 86 ff ff       	call   bc97a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x116744>
      bd1155:	0f 57 c0             	xorps  xmm0,xmm0
      bd1158:	0f 11 83 91 01 00 00 	movups XMMWORD PTR [rbx+0x191],xmm0
      bd115f:	0f 11 83 88 01 00 00 	movups XMMWORD PTR [rbx+0x188],xmm0
      bd1166:	48 83 a3 a8 01 00 00 	and    QWORD PTR [rbx+0x1a8],0x0
      bd116d:	00 
      bd116e:	31 c0                	xor    eax,eax
      bd1170:	88 83 b0 01 00 00    	mov    BYTE PTR [rbx+0x1b0],al
      bd1176:	88 83 b8 01 00 00    	mov    BYTE PTR [rbx+0x1b8],al
      bd117c:	66 83 a3 bc 01 00 00 	and    WORD PTR [rbx+0x1bc],0x0
      bd1183:	00 
      bd1184:	88 83 be 01 00 00    	mov    BYTE PTR [rbx+0x1be],al
      bd118a:	48 83 a3 d0 01 00 00 	and    QWORD PTR [rbx+0x1d0],0x0
      bd1191:	00 
      bd1192:	4c 8d ab a8 01 00 00 	lea    r13,[rbx+0x1a8]
      bd1199:	48 83 a3 c0 01 00 00 	and    QWORD PTR [rbx+0x1c0],0x0
      bd11a0:	00 
      bd11a1:	48 8d bb d8 01 00 00 	lea    rdi,[rbx+0x1d8]
      bd11a8:	83 a3 c8 01 00 00 00 	and    DWORD PTR [rbx+0x1c8],0x0
      bd11af:	31 f6                	xor    esi,esi
      bd11b1:	e8 9e 92 98 00       	call   155a454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39f9d8>
      bd11b6:	49 89 df             	mov    r15,rbx
      bd11b9:	49 83 c7 20          	add    r15,0x20
      bd11bd:	31 ff                	xor    edi,edi
      bd11bf:	e8 58 d2 ec ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>

#### 0xbf2b24; FDE=(12521182, 12534473): mov    DWORD PTR [rbx+0x1b8],0x4
      bf2afc:	f2 0f 59 1d 9c c9 79 	mulsd  xmm3,QWORD PTR [rip+0xffffffffff79c99c]        # 38f4a0 <_ZTSSt12bad_any_cast@@Base-0xd28>
      bf2b03:	ff 
      bf2b04:	f2 0f 5e de          	divsd  xmm3,xmm6
      bf2b08:	f2 0f 58 dc          	addsd  xmm3,xmm4
      bf2b0c:	f2 0f 11 9b a0 01 00 	movsd  QWORD PTR [rbx+0x1a0],xmm3
      bf2b13:	00 
      bf2b14:	f2 0f 11 93 a8 01 00 	movsd  QWORD PTR [rbx+0x1a8],xmm2
      bf2b1b:	00 
      bf2b1c:	f2 0f 11 83 b0 01 00 	movsd  QWORD PTR [rbx+0x1b0],xmm0
      bf2b23:	00 
      bf2b24:	c7 83 b8 01 00 00 04 	mov    DWORD PTR [rbx+0x1b8],0x4
      bf2b2b:	00 00 00 
      bf2b2e:	f2 0f 59 ce          	mulsd  xmm1,xmm6
      bf2b32:	f2 0f 5e ce          	divsd  xmm1,xmm6
      bf2b36:	f2 0f 58 cc          	addsd  xmm1,xmm4
      bf2b3a:	f2 0f 11 8b c0 01 00 	movsd  QWORD PTR [rbx+0x1c0],xmm1
      bf2b41:	00 
      bf2b42:	f2 0f 11 83 c8 01 00 	movsd  QWORD PTR [rbx+0x1c8],xmm0
      bf2b49:	00 
      bf2b4a:	f2 44 0f 11 83 d0 01 	movsd  QWORD PTR [rbx+0x1d0],xmm8
      bf2b51:	00 00 
      bf2b53:	81 7c 24 64 01 01 00 	cmp    DWORD PTR [rsp+0x64],0x101
      bf2b5a:	00 
      bf2b5b:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      bf2b60:	f2 0f 10 64 24 20    	movsd  xmm4,QWORD PTR [rsp+0x20]
      bf2b66:	7c 0a                	jl     bf2b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13fb12>
      bf2b68:	c7 83 b8 01 00 00 03 	mov    DWORD PTR [rbx+0x1b8],0x3

#### 0xbf2b68; FDE=(12521182, 12534473): mov    DWORD PTR [rbx+0x1b8],0x3
      bf2b41:	00 
      bf2b42:	f2 0f 11 83 c8 01 00 	movsd  QWORD PTR [rbx+0x1c8],xmm0
      bf2b49:	00 
      bf2b4a:	f2 44 0f 11 83 d0 01 	movsd  QWORD PTR [rbx+0x1d0],xmm8
      bf2b51:	00 00 
      bf2b53:	81 7c 24 64 01 01 00 	cmp    DWORD PTR [rsp+0x64],0x101
      bf2b5a:	00 
      bf2b5b:	48 8b 4c 24 48       	mov    rcx,QWORD PTR [rsp+0x48]
      bf2b60:	f2 0f 10 64 24 20    	movsd  xmm4,QWORD PTR [rsp+0x20]
      bf2b66:	7c 0a                	jl     bf2b72 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13fb12>
      bf2b68:	c7 83 b8 01 00 00 03 	mov    DWORD PTR [rbx+0x1b8],0x3
      bf2b6f:	00 00 00 
      bf2b72:	66 0f 2e 3d f6 c2 79 	ucomisd xmm7,QWORD PTR [rip+0xffffffffff79c2f6]        # 38ee70 <_ZTSSt12bad_any_cast@@Base-0x1358>
      bf2b79:	ff 
      bf2b7a:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
      bf2b7f:	48 8b 94 24 80 00 00 	mov    rdx,QWORD PTR [rsp+0x80]
      bf2b86:	00 
      bf2b87:	0f 86 df fc ff ff    	jbe    bf286c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x13f80c>
      bf2b8d:	f2 0f 58 3d cb c4 79 	addsd  xmm7,QWORD PTR [rip+0xffffffffff79c4cb]        # 38f060 <_ZTSSt12bad_any_cast@@Base-0x1168>
      bf2b94:	ff 
      bf2b95:	66 0f 28 c7          	movapd xmm0,xmm7
      bf2b99:	f2 0f 59 05 c7 c8 79 	mulsd  xmm0,QWORD PTR [rip+0xffffffffff79c8c7]        # 38f468 <_ZTSSt12bad_any_cast@@Base-0xd60>
      bf2ba0:	ff 
      bf2ba1:	f2 0f 58 e0          	addsd  xmm4,xmm0
      bf2ba5:	f2 0f 10 05 9b c5 79 	movsd  xmm0,QWORD PTR [rip+0xffffffffff79c59b]        # 38f148 <_ZTSSt12bad_any_cast@@Base-0x1080>
      bf2bac:	ff 
      bf2bad:	f2 0f 5f c4          	maxsd  xmm0,xmm4

#### 0xbf5ce7; FDE=(12540938, 12541646): mov    QWORD PTR [rbx+0x1b8],r13
      bf5cb6:	ba f8 00 00 00       	mov    edx,0xf8
      bf5cbb:	31 f6                	xor    esi,esi
      bf5cbd:	e8 ce 8e bf 00       	call   17eeb90 <memset@plt>
      bf5cc2:	48 8d 35 7e a2 77 ff 	lea    rsi,[rip+0xffffffffff77a27e]        # 36ff47 <_ZTSSt12bad_any_cast@@Base-0x20281>
      bf5cc9:	4c 89 ff             	mov    rdi,r15
      bf5ccc:	e8 c9 c5 91 00       	call   151229a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35781e>
      bf5cd1:	4c 8d a3 a8 01 00 00 	lea    r12,[rbx+0x1a8]
      bf5cd8:	48 8d 35 ea 35 75 ff 	lea    rsi,[rip+0xffffffffff7535ea]        # 3492c9 <_ZTSSt12bad_any_cast@@Base-0x46eff>
      bf5cdf:	4c 89 e7             	mov    rdi,r12
      bf5ce2:	e8 b3 c5 91 00       	call   151229a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35781e>
      bf5ce7:	4c 89 ab b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],r13
      bf5cee:	48 8d bb c0 01 00 00 	lea    rdi,[rbx+0x1c0]
      bf5cf5:	6a 01                	push   0x1
      bf5cf7:	5e                   	pop    rsi
      bf5cf8:	e8 57 47 96 00       	call   155a454 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39f9d8>
      bf5cfd:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      bf5d00:	49 8b 44 24 08       	mov    rax,QWORD PTR [r12+0x8]
      bf5d05:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
      bf5d0a:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
      bf5d0f:	48 85 c0             	test   rax,rax
      bf5d12:	74 05                	je     bf5d19 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x142cb9>
      bf5d14:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      bf5d19:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf5d1c:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
      bf5d21:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
      bf5d27:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
      bf5d2c:	e8 55 87 ea ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>

#### 0xc0a9af; FDE=(12625916, 12627177): mov    QWORD PTR [rbx+0x1b8],rax
      c0a971:	0f 29 83 70 01 00 00 	movaps XMMWORD PTR [rbx+0x170],xmm0
      c0a978:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
      c0a97d:	e8 ad 47 f3 ff       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
      c0a982:	4c 8d ab a0 01 00 00 	lea    r13,[rbx+0x1a0]
      c0a989:	4c 8d bb a8 01 00 00 	lea    r15,[rbx+0x1a8]
      c0a990:	0f 57 c0             	xorps  xmm0,xmm0
      c0a993:	0f 11 83 a8 01 00 00 	movups XMMWORD PTR [rbx+0x1a8],xmm0
      c0a99a:	4c 89 bb a0 01 00 00 	mov    QWORD PTR [rbx+0x1a0],r15
      c0a9a1:	48 8d 83 c0 01 00 00 	lea    rax,[rbx+0x1c0]
      c0a9a8:	0f 29 83 c0 01 00 00 	movaps XMMWORD PTR [rbx+0x1c0],xmm0
      c0a9af:	48 89 83 b8 01 00 00 	mov    QWORD PTR [rbx+0x1b8],rax
      c0a9b6:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      c0a9bd:	00 
      c0a9be:	e8 a7 f5 e6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c0a9c3:	31 ff                	xor    edi,edi
      c0a9c5:	e8 bc 3a e9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c0a9ca:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      c0a9cf:	e8 a2 5d 00 00       	call   c10776 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15d716>
      c0a9d4:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
      c0a9db:	00 
      c0a9dc:	e8 89 f5 e6 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      c0a9e1:	31 ff                	xor    edi,edi
      c0a9e3:	e8 34 3a e9 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      c0a9e8:	31 ff                	xor    edi,edi
      c0a9ea:	e8 97 3a e9 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c0a9ef:	48 8d 83 20 01 00 00 	lea    rax,[rbx+0x120]
      c0a9f6:	48 8b 8b 20 01 00 00 	mov    rcx,QWORD PTR [rbx+0x120]

#### 0xc1fc78; FDE=(12712514, 12713610): and    DWORD PTR [rbx+0x1b8],0x0
      c1fc43:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
      c1fc48:	e8 a9 9d bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c1fc4d:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
      c1fc54:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
      c1fc59:	e8 98 9d bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c1fc5e:	48 8d ab a0 01 00 00 	lea    rbp,[rbx+0x1a0]
      c1fc65:	48 89 ef             	mov    rdi,rbp
      c1fc68:	e8 89 9d bb 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
      c1fc6d:	48 c7 83 b0 01 00 00 	mov    QWORD PTR [rbx+0x1b0],0x1
      c1fc74:	01 00 00 00 
      c1fc78:	83 a3 b8 01 00 00 00 	and    DWORD PTR [rbx+0x1b8],0x0
      c1fc7f:	48 83 a3 18 02 00 00 	and    QWORD PTR [rbx+0x218],0x0
      c1fc86:	00 
      c1fc87:	48 83 a3 28 02 00 00 	and    QWORD PTR [rbx+0x228],0x0
      c1fc8e:	00 
      c1fc8f:	48 8d 83 c0 01 00 00 	lea    rax,[rbx+0x1c0]
      c1fc96:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      c1fc9b:	48 83 a3 38 02 00 00 	and    QWORD PTR [rbx+0x238],0x0
      c1fca2:	00 
      c1fca3:	48 8d 83 28 02 00 00 	lea    rax,[rbx+0x228]
      c1fcaa:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      c1fcaf:	48 83 a3 48 02 00 00 	and    QWORD PTR [rbx+0x248],0x0
      c1fcb6:	00 
      c1fcb7:	48 8d 83 48 02 00 00 	lea    rax,[rbx+0x248]
      c1fcbe:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      c1fcc3:	48 83 a3 58 02 00 00 	and    QWORD PTR [rbx+0x258],0x0
      c1fcca:	00 

#### 0xc20050; FDE=(12714010, 12714643): mov    DWORD PTR [rbx+0x1b8],0x3
      c20029:	48 89 fb             	mov    rbx,rdi
      c2002c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c20033:	00 00 
      c20035:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      c2003c:	00 
      c2003d:	8b 87 b8 01 00 00    	mov    eax,DWORD PTR [rdi+0x1b8]
      c20043:	85 c0                	test   eax,eax
      c20045:	74 18                	je     c2005f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cfff>
      c20047:	83 f8 01             	cmp    eax,0x1
      c2004a:	0f 85 be 01 00 00    	jne    c2020e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16d1ae>
      c20050:	c7 83 b8 01 00 00 03 	mov    DWORD PTR [rbx+0x1b8],0x3
      c20057:	00 00 00 
      c2005a:	e9 af 01 00 00       	jmp    c2020e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16d1ae>
      c2005f:	c7 83 b8 01 00 00 01 	mov    DWORD PTR [rbx+0x1b8],0x1
      c20066:	00 00 00 
      c20069:	48 8b 83 90 00 00 00 	mov    rax,QWORD PTR [rbx+0x90]
      c20070:	48 8b 78 70          	mov    rdi,QWORD PTR [rax+0x70]
      c20074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c20077:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c2007a:	89 c5                	mov    ebp,eax
      c2007c:	48 8b 83 90 00 00 00 	mov    rax,QWORD PTR [rbx+0x90]
      c20083:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]
      c20087:	e8 d6 a3 e5 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      c2008c:	49 89 c6             	mov    r14,rax
      c2008f:	b8 00 87 93 03       	mov    eax,0x3938700
      c20094:	48 03 83 28 01 00 00 	add    rax,QWORD PTR [rbx+0x128]
      c2009b:	4c 39 f0             	cmp    rax,r14

#### 0xc2005f; FDE=(12714010, 12714643): mov    DWORD PTR [rbx+0x1b8],0x1
      c20035:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
      c2003c:	00 
      c2003d:	8b 87 b8 01 00 00    	mov    eax,DWORD PTR [rdi+0x1b8]
      c20043:	85 c0                	test   eax,eax
      c20045:	74 18                	je     c2005f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cfff>
      c20047:	83 f8 01             	cmp    eax,0x1
      c2004a:	0f 85 be 01 00 00    	jne    c2020e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16d1ae>
      c20050:	c7 83 b8 01 00 00 03 	mov    DWORD PTR [rbx+0x1b8],0x3
      c20057:	00 00 00 
      c2005a:	e9 af 01 00 00       	jmp    c2020e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16d1ae>
      c2005f:	c7 83 b8 01 00 00 01 	mov    DWORD PTR [rbx+0x1b8],0x1
      c20066:	00 00 00 
      c20069:	48 8b 83 90 00 00 00 	mov    rax,QWORD PTR [rbx+0x90]
      c20070:	48 8b 78 70          	mov    rdi,QWORD PTR [rax+0x70]
      c20074:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c20077:	ff 50 10             	call   QWORD PTR [rax+0x10]
      c2007a:	89 c5                	mov    ebp,eax
      c2007c:	48 8b 83 90 00 00 00 	mov    rax,QWORD PTR [rbx+0x90]
      c20083:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]
      c20087:	e8 d6 a3 e5 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      c2008c:	49 89 c6             	mov    r14,rax
      c2008f:	b8 00 87 93 03       	mov    eax,0x3938700
      c20094:	48 03 83 28 01 00 00 	add    rax,QWORD PTR [rbx+0x128]
      c2009b:	4c 39 f0             	cmp    rax,r14
      c2009e:	7d 33                	jge    c200d3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16d073>
      c200a0:	40 84 ed             	test   bpl,bpl
      c200a3:	75 44                	jne    c200e9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16d089>

#### 0xc2033c; FDE=(12714766, 12717466): and    DWORD PTR [rbx+0x1b8],0x0
      c20315:	41 54                	push   r12
      c20317:	53                   	push   rbx
      c20318:	48 81 ec 48 03 00 00 	sub    rsp,0x348
      c2031f:	48 89 fb             	mov    rbx,rdi
      c20322:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c20329:	00 00 
      c2032b:	48 89 84 24 40 03 00 	mov    QWORD PTR [rsp+0x340],rax
      c20332:	00 
      c20333:	83 bf b8 01 00 00 03 	cmp    DWORD PTR [rdi+0x1b8],0x3
      c2033a:	75 37                	jne    c20373 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16d313>
      c2033c:	83 a3 b8 01 00 00 00 	and    DWORD PTR [rbx+0x1b8],0x0
      c20343:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c2034a:	00 00 
      c2034c:	48 3b 84 24 40 03 00 	cmp    rax,QWORD PTR [rsp+0x340]
      c20353:	00 
      c20354:	0f 85 3b 0a 00 00    	jne    c20d95 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16dd35>
      c2035a:	48 89 df             	mov    rdi,rbx
      c2035d:	48 81 c4 48 03 00 00 	add    rsp,0x348
      c20364:	5b                   	pop    rbx
      c20365:	41 5c                	pop    r12
      c20367:	41 5d                	pop    r13
      c20369:	41 5e                	pop    r14
      c2036b:	41 5f                	pop    r15
      c2036d:	5d                   	pop    rbp
      c2036e:	e9 a7 fc ff ff       	jmp    c2001a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cfba>
      c20373:	0f 57 c0             	xorps  xmm0,xmm0
      c20376:	48 83 a4 24 40 02 00 	and    QWORD PTR [rsp+0x240],0x0

#### 0xc21a66; FDE=(12720696, 12722615): and    DWORD PTR [rbx+0x1b8],0x0
      c21a3f:	41 54                	push   r12
      c21a41:	53                   	push   rbx
      c21a42:	48 81 ec 38 01 00 00 	sub    rsp,0x138
      c21a49:	48 89 fb             	mov    rbx,rdi
      c21a4c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c21a53:	00 00 
      c21a55:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
      c21a5c:	00 
      c21a5d:	83 bf b8 01 00 00 03 	cmp    DWORD PTR [rdi+0x1b8],0x3
      c21a64:	75 37                	jne    c21a9d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16ea3d>
      c21a66:	83 a3 b8 01 00 00 00 	and    DWORD PTR [rbx+0x1b8],0x0
      c21a6d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      c21a74:	00 00 
      c21a76:	48 3b 84 24 30 01 00 	cmp    rax,QWORD PTR [rsp+0x130]
      c21a7d:	00 
      c21a7e:	0f 85 2e 07 00 00    	jne    c221b2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16f152>
      c21a84:	48 89 df             	mov    rdi,rbx
      c21a87:	48 81 c4 38 01 00 00 	add    rsp,0x138
      c21a8e:	5b                   	pop    rbx
      c21a8f:	41 5c                	pop    r12
      c21a91:	41 5d                	pop    r13
      c21a93:	41 5e                	pop    r14
      c21a95:	41 5f                	pop    r15
      c21a97:	5d                   	pop    rbp
      c21a98:	e9 7d e5 ff ff       	jmp    c2001a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16cfba>
      c21a9d:	48 8b 83 90 00 00 00 	mov    rax,QWORD PTR [rbx+0x90]
      c21aa4:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]

#### 0xc21f36; FDE=(12720696, 12722615): and    DWORD PTR [rbx+0x1b8],0x0
      c21f0a:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
      c21f0d:	e9 f1 fc ff ff       	jmp    c21c03 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16eba3>
      c21f12:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
      c21f16:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      c21f19:	e9 a8 fc ff ff       	jmp    c21bc6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16eb66>
      c21f1e:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      c21f25:	00 
      c21f26:	e8 8d 02 00 00       	call   c221b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16f158>
      c21f2b:	c7 40 20 c8 00 00 00 	mov    DWORD PTR [rax+0x20],0xc8
      c21f32:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
      c21f36:	83 a3 b8 01 00 00 00 	and    DWORD PTR [rbx+0x1b8],0x0
      c21f3d:	0f 57 c0             	xorps  xmm0,xmm0
      c21f40:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
      c21f45:	0f 29 06             	movaps XMMWORD PTR [rsi],xmm0
      c21f48:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      c21f4d:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
      c21f54:	00 
      c21f55:	e8 46 dd b5 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
      c21f5a:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
      c21f5f:	e8 5c d7 e7 ff       	call   a9f6c0 <JNI_OnUnload@@Base+0x26f8d>
      c21f64:	48 3b 83 b0 01 00 00 	cmp    rax,QWORD PTR [rbx+0x1b0]
      c21f6b:	0f 84 3f 01 00 00    	je     c220b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16f050>
      c21f71:	49 89 c6             	mov    r14,rax
      c21f74:	48 8b 83 48 01 00 00 	mov    rax,QWORD PTR [rbx+0x148]
      c21f7b:	44 8a 68 50          	mov    r13b,BYTE PTR [rax+0x50]
      c21f7f:	40 8a ab 18 01 00 00 	mov    bpl,BYTE PTR [rbx+0x118]
      c21f86:	48 8d b3 d8 02 00 00 	lea    rsi,[rbx+0x2d8]

#### 0xc2871a; FDE=(12747912, 12754236): movups XMMWORD PTR [rsp+0x1b8],xmm0
      c286f4:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
      c286f8:	49 83 c4 30          	add    r12,0x30
      c286fc:	4c 89 e7             	mov    rdi,r12
      c286ff:	e8 32 31 e5 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      c28704:	4c 89 ef             	mov    rdi,r13
      c28707:	48 89 c6             	mov    rsi,rax
      c2870a:	e8 43 71 b5 00       	call   177f852 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1339be>
      c2870f:	0f 57 c0             	xorps  xmm0,xmm0
      c28712:	84 c0                	test   al,al
      c28714:	0f 84 94 10 00 00    	je     c297ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17674e>
      c2871a:	0f 11 84 24 b8 01 00 	movups XMMWORD PTR [rsp+0x1b8],xmm0
      c28721:	00 
      c28722:	48 8d 05 17 dd be 00 	lea    rax,[rip+0xbedd17]        # 1816440 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xc100>
      c28729:	48 89 84 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rax
      c28730:	00 
      c28731:	48 89 ac 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rbp
      c28738:	00 
      c28739:	48 8b 84 24 80 06 00 	mov    rax,QWORD PTR [rsp+0x680]
      c28740:	00 
      c28741:	a8 01                	test   al,0x1
      c28743:	0f 85 76 15 00 00    	jne    c29cbf <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x176c5f>
      c28749:	48 85 c0             	test   rax,rax
      c2874c:	0f 84 9c 10 00 00    	je     c297ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17678e>
      c28752:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      c28759:	00 
      c2875a:	48 8d b4 24 78 06 00 	lea    rsi,[rsp+0x678]
      c28761:	00 


## FDEs that touch both source+0x10 and source+0x1b5
### FDE 0xad1a74..0xad5057
      ad1aa0:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      ad1aa9:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ad1ab7:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      ad1abc:	48 8b 42 10          	mov    rax,QWORD PTR [rdx+0x10]
      ad1adb:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      ad1b94:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      ad1bf7:	4d 8d 7c 24 10       	lea    r15,[r12+0x10]
      ad1c03:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
      ad1c61:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
      ad1cd3:	45 89 7d 10          	mov    DWORD PTR [r13+0x10],r15d
      ad1e1b:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad1fb0:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax
      ad212a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad21a8:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ad2203:	4d 89 66 10          	mov    QWORD PTR [r14+0x10],r12
      ad220e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad22cc:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      ad231a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad235c:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      ad2421:	f3 0f 7f 40 10       	movdqu XMMWORD PTR [rax+0x10],xmm0
      ad2499:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      ad2503:	41 80 bf b5 01 00 00 	cmp    BYTE PTR [r15+0x1b5],0x0
      ad28e7:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      ad2a1c:	66 0f 7f 47 10       	movdqa XMMWORD PTR [rdi+0x10],xmm0
      ad2aef:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
      ad2b0c:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      ad2b30:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
      ad2c34:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
      ad2d63:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad2e21:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
      ad351b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad3533:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad392a:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      ad39de:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      ad3a61:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad3a76:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
      ad3a95:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad3b14:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ad3b7d:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad3c18:	66 41 0f 7f 47 10    	movdqa XMMWORD PTR [r15+0x10],xmm0
      ad3c4d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad3da5:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13
      ad3e76:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad3e8e:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad3ed3:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
      ad3ef0:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad3f00:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ad3fa7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad3fea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad4022:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      ad40b5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad41b3:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
      ad427d:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
      ad42c9:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
      ad458a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
      ad46b7:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
      ad4785:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad487d:	ff 50 10             	call   QWORD PTR [rax+0x10]
      ad4bf0:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]
      ad4c31:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ad4dca:	49 8b 7c 24 10       	mov    rdi,QWORD PTR [r12+0x10]

### FDE 0xcea164..0xceabe2
      cea1a8:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
      cea20b:	41 8a 56 10          	mov    dl,BYTE PTR [r14+0x10]
      cea26a:	66 0f 7f 4c 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm1
      cea2cf:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      cea6e3:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      cea876:	66 89 84 24 b5 01 00 	mov    WORD PTR [rsp+0x1b5],ax
      cea89f:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
      cea990:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      ceaa87:	41 89 47 10          	mov    DWORD PTR [r15+0x10],eax

### FDE 0xef91cc..0xefe62b
      ef91ff:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ef93fa:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      ef9431:	4c 89 79 10          	mov    QWORD PTR [rcx+0x10],r15
      ef94df:	49 8d 4c 24 10       	lea    rcx,[r12+0x10]
      ef97d2:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      ef9ab8:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
      efa2fe:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
      efa4b0:	66 0f 6f 43 10       	movdqa xmm0,XMMWORD PTR [rbx+0x10]
      efaa16:	f0 49 ff 47 10       	lock inc QWORD PTR [r15+0x10]
      efab5c:	48 8b 4d 10          	mov    rcx,QWORD PTR [rbp+0x10]
      efaba3:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      efb03d:	4c 89 70 10          	mov    QWORD PTR [rax+0x10],r14
      efb64a:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
      efba86:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
      efc237:	4c 8b 65 10          	mov    r12,QWORD PTR [rbp+0x10]
      efc623:	80 bb b5 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b5],0x0
      efc630:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
      efd524:	ff 50 10             	call   QWORD PTR [rax+0x10]
      efe1a0:	48 8b 7d 10          	mov    rdi,QWORD PTR [rbp+0x10]

### FDE 0x11ff756..0x11ffbf5
     11ff793:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11ff7a0:	ff 50 10             	call   QWORD PTR [rax+0x10]
     11ff845:	4d 8b 67 10          	mov    r12,QWORD PTR [r15+0x10]
     11ff872:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     11ff9d0:	49 89 44 24 10       	mov    QWORD PTR [r12+0x10],rax
     11ffa9d:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11ffaee:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
     11ffaf2:	48 8d 05 b5 01 00 00 	lea    rax,[rip+0x1b5]        # 11ffcae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45232>

### FDE 0x12d0bc4..0x12d38ce
     12d0bdf:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     12d0c9c:	80 49 10 40          	or     BYTE PTR [rcx+0x10],0x40
     12d0cc2:	80 49 10 80          	or     BYTE PTR [rcx+0x10],0x80
     12d0cc6:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     12d0d10:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     12d0d5e:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     12d0d72:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
     12d0dd4:	41 80 4e 10 04       	or     BYTE PTR [r14+0x10],0x4
     12d0e20:	4c 8d 65 10          	lea    r12,[rbp+0x10]
     12d0e30:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     12d0e98:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     12d0ef6:	41 80 4e 10 02       	or     BYTE PTR [r14+0x10],0x2
     12d0f29:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12d0f4f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0f71:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0f92:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0fb3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0fd4:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d0ff5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1016:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d103a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d105b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d107f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d10ac:	41 8b 7d 10          	mov    edi,DWORD PTR [r13+0x10]
     12d10ca:	41 8b 4d 10          	mov    ecx,DWORD PTR [r13+0x10]
     12d10d1:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]
     12d10d9:	89 50 10             	mov    DWORD PTR [rax+0x10],edx
     12d10e6:	89 48 10             	mov    DWORD PTR [rax+0x10],ecx
     12d113f:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12d115b:	ff 51 10             	call   QWORD PTR [rcx+0x10]
     12d1193:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1198:	8b 40 10             	mov    eax,DWORD PTR [rax+0x10]
     12d11b7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1234:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1269:	80 48 10 20          	or     BYTE PTR [rax+0x10],0x20
     12d12d6:	80 4b 10 03          	or     BYTE PTR [rbx+0x10],0x3
     12d12e7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1301:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     12d13e4:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d1403:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
     12d1442:	41 80 4e 10 01       	or     BYTE PTR [r14+0x10],0x1
     12d1447:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d14b4:	41 83 4d 10 01       	or     DWORD PTR [r13+0x10],0x1
     12d150d:	41 80 4d 10 02       	or     BYTE PTR [r13+0x10],0x2
     12d1522:	41 80 4d 10 04       	or     BYTE PTR [r13+0x10],0x4
     12d1537:	41 80 4d 10 08       	or     BYTE PTR [r13+0x10],0x8
     12d154b:	41 80 4d 10 10       	or     BYTE PTR [r13+0x10],0x10
     12d1554:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d161f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d1658:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     12d165d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1662:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     12d166f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d168a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d16cd:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12d16e2:	4c 8b 51 10          	mov    r10,QWORD PTR [rcx+0x10]
     12d172b:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1730:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
     12d173d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1758:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d177d:	48 8b 49 10          	mov    rcx,QWORD PTR [rcx+0x10]
     12d17f5:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d17fa:	80 48 10 08          	or     BYTE PTR [rax+0x10],0x8
     12d1807:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1822:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d182f:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     12d184b:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d1858:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     12d1869:	4c 8b 53 10          	mov    r10,QWORD PTR [rbx+0x10]
     12d18a1:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d18a6:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
     12d18b3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d18ce:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d18db:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     12d192b:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12d1941:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d1948:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1951:	80 48 10 10          	or     BYTE PTR [rax+0x10],0x10
     12d1981:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1990:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12d19a5:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d19d0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d19d9:	80 48 10 10          	or     BYTE PTR [rax+0x10],0x10
     12d19df:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d1a3a:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
     12d1aea:	80 48 10 08          	or     BYTE PTR [rax+0x10],0x8
     12d1ce0:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     12d1de1:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
     12d1df7:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     12d1e24:	f3 0f 11 44 24 10    	movss  DWORD PTR [rsp+0x10],xmm0
     12d1e70:	48 8d 42 10          	lea    rax,[rdx+0x10]
     12d1e74:	48 8b 4a 10          	mov    rcx,QWORD PTR [rdx+0x10]
     12d1edc:	0f 2e 44 24 10       	ucomiss xmm0,DWORD PTR [rsp+0x10]
     12d2028:	83 48 10 01          	or     DWORD PTR [rax+0x10],0x1
     12d2047:	41 83 4c 24 10 02    	or     DWORD PTR [r12+0x10],0x2
     12d20d0:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     12d2147:	4c 89 78 10          	mov    QWORD PTR [rax+0x10],r15
     12d215d:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     12d218b:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     12d21ca:	49 8d 77 10          	lea    rsi,[r15+0x10]
     12d2224:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     12d22d8:	80 48 10 01          	or     BYTE PTR [rax+0x10],0x1
     12d2344:	49 8b 4f 10          	mov    rcx,QWORD PTR [r15+0x10]
     12d2354:	48 8b 53 10          	mov    rdx,QWORD PTR [rbx+0x10]
     12d2374:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     12d237d:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     12d2392:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
     12d2469:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     12d248f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d24a0:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     12d24dd:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d2512:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d2517:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     12d2564:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12d258d:	48 8b 49 10          	mov    rcx,QWORD PTR [rcx+0x10]
     12d25c1:	80 4b 10 01          	or     BYTE PTR [rbx+0x10],0x1
     12d25fd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2612:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d262d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d264a:	8b 4d 10             	mov    ecx,DWORD PTR [rbp+0x10]
     12d2650:	89 4d 10             	mov    DWORD PTR [rbp+0x10],ecx
     12d272b:	80 4d 10 01          	or     BYTE PTR [rbp+0x10],0x1
     12d2748:	8b 4d 10             	mov    ecx,DWORD PTR [rbp+0x10]
     12d2751:	89 4d 10             	mov    DWORD PTR [rbp+0x10],ecx
     12d27a6:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d27d4:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
     12d27e6:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d27eb:	81 48 10 00 00 01 00 	or     DWORD PTR [rax+0x10],0x10000
     12d27fe:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2819:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d284a:	41 80 4f 10 01       	or     BYTE PTR [r15+0x10],0x1
     12d2872:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2877:	80 48 10 04          	or     BYTE PTR [rax+0x10],0x4
     12d2888:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d28b4:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     12d28c7:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2960:	4c 8b 60 10          	mov    r12,QWORD PTR [rax+0x10]
     12d2975:	41 0f b7 5c 24 10    	movzx  ebx,WORD PTR [r12+0x10]
     12d29cd:	8b 48 10             	mov    ecx,DWORD PTR [rax+0x10]
     12d29d5:	89 50 10             	mov    DWORD PTR [rax+0x10],edx
     12d29e3:	89 48 10             	mov    DWORD PTR [rax+0x10],ecx
     12d2a7c:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2a96:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2ab3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2ada:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12d2b07:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12d2b3d:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp
     12d2beb:	80 49 10 01          	or     BYTE PTR [rcx+0x10],0x1
     12d2c42:	41 80 4d 10 04       	or     BYTE PTR [r13+0x10],0x4
     12d2c92:	80 49 10 01          	or     BYTE PTR [rcx+0x10],0x1
     12d2ce4:	41 80 4d 10 02       	or     BYTE PTR [r13+0x10],0x2
     12d2d12:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
     12d2d60:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2d65:	81 48 10 00 80 00 00 	or     DWORD PTR [rax+0x10],0x8000
     12d2d78:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2d93:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2dc7:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     12d2e52:	80 4b 10 02          	or     BYTE PTR [rbx+0x10],0x2
     12d2eca:	80 4b 10 04          	or     BYTE PTR [rbx+0x10],0x4
     12d2f06:	49 8b 4c 24 10       	mov    rcx,QWORD PTR [r12+0x10]
     12d2f4a:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d2f9f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d2fbd:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d2fcf:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
     12d2ffa:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d3018:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d303a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d3070:	ff 50 10             	call   QWORD PTR [rax+0x10]
     12d3087:	41 0a 84 24 b5 01 00 	or     al,BYTE PTR [r12+0x1b5]
     12d30ac:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d30e3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d30e8:	80 48 10 02          	or     BYTE PTR [rax+0x10],0x2
     12d30f9:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     12d311e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d3217:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d321c:	83 48 10 08          	or     DWORD PTR [rax+0x10],0x8
     12d3229:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12d3241:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d32af:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     12d32b4:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
     12d32fa:	ff 50 10             	call   QWORD PTR [rax+0x10]

### FDE 0x15fa4e0..0x15fa8bd
     15fa51c:	80 bb b5 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b5],0x0
     15fa6d2:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15fa76b:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
     15fa786:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
     15fa818:	41 0f b6 4e 10       	movzx  ecx,BYTE PTR [r14+0x10]

### FDE 0x15ff76e..0x15ff97c
     15ff7a0:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     15ff7a9:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     15ff7c4:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
     15ff7dc:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
     15ff7e0:	48 8d 05 b5 01 00 00 	lea    rax,[rip+0x1b5]        # 15ff99c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x444f20>
     15ff816:	4d 8b 66 10          	mov    r12,QWORD PTR [r14+0x10]
     15ff822:	f0 49 ff 44 24 10    	lock inc QWORD PTR [r12+0x10]
     15ff82c:	4d 8b 6e 10          	mov    r13,QWORD PTR [r14+0x10]
     15ff835:	f0 49 ff 45 10       	lock inc QWORD PTR [r13+0x10]
     15ff847:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
     15ff8ad:	4d 89 6c 24 10       	mov    QWORD PTR [r12+0x10],r13
     15ff8c7:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]

## Service ID 4 descriptor candidates
### ID method FDE 0x9dbdb0..0x9dbdc3
      9dbdb0:	b8 04 00 00 00       	mov    eax,0x4
      9dbdb5:	80 3f 01             	cmp    BYTE PTR [rdi],0x1
      9dbdb8:	75 08                	jne    9dbdc2 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3bf2>
      9dbdba:	0f b7 47 02          	movzx  eax,WORD PTR [rdi+0x2]
      9dbdbe:	89 06                	mov    DWORD PTR [rsi],eax
      9dbdc0:	31 c0                	xor    eax,eax
      9dbdc2:	c3                   	ret

### ID method FDE 0x9dbdd0..0x9dbdf9
      9dbdd0:	50                   	push   rax
      9dbdd1:	b8 04 00 00 00       	mov    eax,0x4
      9dbdd6:	80 3f 01             	cmp    BYTE PTR [rdi],0x1
      9dbdd9:	75 1c                	jne    9dbdf7 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3c27>
      9dbddb:	48 89 f9             	mov    rcx,rdi
      9dbdde:	0f b7 57 02          	movzx  edx,WORD PTR [rdi+0x2]
      9dbde2:	48 83 c1 04          	add    rcx,0x4
      9dbde6:	48 c1 e2 04          	shl    rdx,0x4
      9dbdea:	48 89 f7             	mov    rdi,rsi
      9dbded:	48 89 ce             	mov    rsi,rcx
      9dbdf0:	e8 db 3c e1 00       	call   17efad0 <memcpy@plt>
      9dbdf5:	31 c0                	xor    eax,eax
      9dbdf7:	59                   	pop    rcx
      9dbdf8:	c3                   	ret

### ID method FDE 0x9e7bb0..0x9e7bb6
      9e7bb0:	b8 04 00 00 00       	mov    eax,0x4
      9e7bb5:	c3                   	ret
- relocation slot 0x17f4a78
  candidate AP 0x17f4a68 (slot delta +0x10)
    +0x0: 0x9e79f0
    +0x8: 0x9e7a10
    +0x10: 0x9e7bb0
    +0x18: 0x9d81d0
    +0x20: 0x38eca0
    +0x28: 0x38ecb8
    +0x30: None
  candidate AP 0x17f4a70 (slot delta +0x8)
    +0x0: 0x9e7a10
    +0x8: 0x9e7bb0
    +0x10: 0x9d81d0
    +0x18: 0x38eca0
    +0x20: 0x38ecb8
    +0x28: None
    +0x30: None
  candidate AP 0x17f4a60 (slot delta +0x18)
    +0x0: 0x9e7870
    +0x8: 0x9e79f0
    +0x10: 0x9e7a10
    +0x18: 0x9e7bb0
    +0x20: 0x9d81d0
    +0x28: 0x38eca0
    +0x30: 0x38ecb8

### ID method FDE 0xb8606a..0xb8606d
      b8606a:	b0 04                	mov    al,0x4
      b8606c:	c3                   	ret
- relocation slot 0x180dc60
  candidate AP 0x180dc50 (slot delta +0x10)
    +0x0: 0x9d7de0
    +0x8: 0xa50370
    +0x10: 0xb8606a
    +0x18: 0xb8606e
    +0x20: 0xb8607a
    +0x28: 0xb86086
    +0x30: None
    metadata-string='AdsSetupImpl'
  candidate AP 0x180dc58 (slot delta +0x8)
    +0x0: 0xa50370
    +0x8: 0xb8606a
    +0x10: 0xb8606e
    +0x18: 0xb8607a
    +0x20: 0xb86086
    +0x28: None
    +0x30: None
  candidate AP 0x180dc48 (slot delta +0x18)
    +0x0: None
    +0x8: 0x9d7de0
    +0x10: 0xa50370
    +0x18: 0xb8606a
    +0x20: 0xb8606e
    +0x28: 0xb8607a
    +0x30: 0xb86086

### ID method FDE 0xca3d6c..0xca3d9b
      ca3d6c:	8d 8f 38 ff ff ff    	lea    ecx,[rdi-0xc8]
      ca3d72:	b0 01                	mov    al,0x1
      ca3d74:	83 f9 64             	cmp    ecx,0x64
      ca3d77:	72 21                	jb     ca3d9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f0d3a>
      ca3d79:	b0 04                	mov    al,0x4
      ca3d7b:	81 ff c3 01 00 00    	cmp    edi,0x1c3
      ca3d81:	74 17                	je     ca3d9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f0d3a>
      ca3d83:	8d 8f 70 fe ff ff    	lea    ecx,[rdi-0x190]
      ca3d89:	b0 03                	mov    al,0x3
      ca3d8b:	83 f9 64             	cmp    ecx,0x64
      ca3d8e:	72 0a                	jb     ca3d9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f0d3a>
      ca3d90:	31 c0                	xor    eax,eax
      ca3d92:	85 ff                	test   edi,edi
      ca3d94:	0f 94 c0             	sete   al
      ca3d97:	8d 04 40             	lea    eax,[rax+rax*2]
      ca3d9a:	c3                   	ret

### ID method FDE 0x1380a22..0x1380a53
     1380a22:	83 ff 05             	cmp    edi,0x5
     1380a25:	77 29                	ja     1380a50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c5fd4>
     1380a27:	89 f8                	mov    eax,edi
     1380a29:	89 f9                	mov    ecx,edi
     1380a2b:	48 8d 3d 1a 75 01 ff 	lea    rdi,[rip+0xffffffffff01751a]        # 397f4c <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x4b2d>
     1380a32:	48 63 0c 8f          	movsxd rcx,DWORD PTR [rdi+rcx*4]
     1380a36:	48 01 f9             	add    rcx,rdi
     1380a39:	ff e1                	jmp    rcx
     1380a3b:	b0 04                	mov    al,0x4
     1380a3d:	c3                   	ret
     1380a3e:	b0 03                	mov    al,0x3
     1380a40:	c3                   	ret
     1380a41:	b0 02                	mov    al,0x2
     1380a43:	40 84 f6             	test   sil,sil
     1380a46:	75 f5                	jne    1380a3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c5fc1>
     1380a48:	80 fa 01             	cmp    dl,0x1
     1380a4b:	b0 02                	mov    al,0x2
     1380a4d:	1c 00                	sbb    al,0x0
     1380a4f:	c3                   	ret
     1380a50:	31 c0                	xor    eax,eax
     1380a52:	c3                   	ret

## Relocations directly targeting readiness factory FDE 0x13524a4
### target 0x13524a4: slots=['0x1867328']
- possible AP 0x1867328, factory slot +0x0
  +0x0: 0x13524a4
  +0x8: None
  +0x10: None
  +0x18: 0x1353b66
  +0x20: 0x1353c26
  +0x28: 0x9d7de0
  +0x30: 0x9d7de0
- possible AP 0x1867320, factory slot +0x8
  +0x0: 0x1352498
  +0x8: 0x13524a4
  +0x10: None
  +0x18: None
  +0x20: 0x1353b66
  +0x28: 0x1353c26
  +0x30: 0x9d7de0
- possible AP 0x1867318, factory slot +0x10
  +0x0: 0x135248c
  +0x8: 0x1352498
  +0x10: 0x13524a4
  +0x18: None
  +0x20: None
  +0x28: 0x1353b66
  +0x30: 0x1353c26
- possible AP 0x1867310, factory slot +0x18
  +0x0: 0x1352488
  +0x8: 0x135248c
  +0x10: 0x1352498
  +0x18: 0x13524a4
  +0x20: None
  +0x28: None
  +0x30: 0x1353b66
  metadata-string='core-ads'
  metadata-string='daisy_chain_resolver_wait_timeout_ms'
  metadata-string='daisy_chain_hard_max_ads'
  metadata-string='\x02\x03\x07core-ads'
  metadata-string='\x07core-ads'
- possible AP 0x1867308, factory slot +0x20
  +0x0: 0xa50370
  +0x8: 0x1352488
  +0x10: 0x135248c
  +0x18: 0x1352498
  +0x20: 0x13524a4
  +0x28: None
  +0x30: None
- possible AP 0x1867300, factory slot +0x28
  +0x0: 0x9d7de0
  +0x8: 0xa50370
  +0x10: 0x1352488
  +0x18: 0x135248c
  +0x20: 0x1352498
  +0x28: 0x13524a4
  +0x30: None
  metadata-string='TimelineAdsSetupImpl'
- possible AP 0x18672f8, factory slot +0x30
  +0x0: None
  +0x8: 0x9d7de0
  +0x10: 0xa50370
  +0x18: 0x1352488
  +0x20: 0x135248c
  +0x28: 0x1352498
  +0x30: 0x13524a4
### target 0x13524d4: slots=[]

## Service-4 accessor
      b85f78:	e8 33 9b c6 00       	call   17efab0 <__stack_chk_fail@plt>
      b85f7d:	cc                   	int3
      b85f7e:	53                   	push   rbx
      b85f7f:	48 89 fb             	mov    rbx,rdi
      b85f82:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b85f86:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b85f8a:	6a 04                	push   0x4
      b85f8c:	5a                   	pop    rdx
      b85f8d:	e8 4c c3 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      b85f92:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b85f95:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
      b85f99:	48 85 c0             	test   rax,rax
      b85f9c:	74 02                	je     b85fa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f40>
      b85f9e:	5b                   	pop    rbx
      b85f9f:	c3                   	ret
      b85fa0:	e8 1a 40 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b85fa5:	cc                   	int3
      b85fa6:	53                   	push   rbx
      b85fa7:	48 8d 05 62 7c c8 00 	lea    rax,[rip+0xc87c62]        # 180dc10 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x38d0>
      b85fae:	48 89 07             	mov    QWORD PTR [rdi],rax
      b85fb1:	48 8b 5f 10          	mov    rbx,QWORD PTR [rdi+0x10]
      b85fb5:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      b85fba:	48 85 db             	test   rbx,rbx
      b85fbd:	0f 84 93 00 00 00    	je     b86056 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2ff6>
      b85fc3:	48 8b bb c8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xc8]

## +0x1b8 capture and branch
     13524f1:	49 8b 06             	mov    rax,QWORD PTR [r14]
     13524f4:	4c 8b a8 48 04 00 00 	mov    r13,QWORD PTR [rax+0x448]
     13524fb:	4d 85 ed             	test   r13,r13
     13524fe:	0f 84 ee 0c 00 00    	je     13531f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198776>
     1352504:	4c 89 f7             	mov    rdi,r14
     1352507:	e8 94 0d 81 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
     135250c:	49 89 c7             	mov    r15,rax
     135250f:	4c 89 f7             	mov    rdi,r14
     1352512:	e8 77 47 96 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     1352517:	8a 88 88 00 00 00    	mov    cl,BYTE PTR [rax+0x88]
     135251d:	88 4c 24 28          	mov    BYTE PTR [rsp+0x28],cl
     1352521:	8a 88 89 00 00 00    	mov    cl,BYTE PTR [rax+0x89]
     1352527:	88 4c 24 0f          	mov    BYTE PTR [rsp+0xf],cl
     135252b:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
     1352530:	49 8b 4d 10          	mov    rcx,QWORD PTR [r13+0x10]
     1352534:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
     1352539:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     135253d:	40 8a 68 11          	mov    bpl,BYTE PTR [rax+0x11]
     1352541:	4c 89 e7             	mov    rdi,r12
     1352544:	ff 51 28             	call   QWORD PTR [rcx+0x28]
     1352547:	8a 80 b8 01 00 00    	mov    al,BYTE PTR [rax+0x1b8]
     135254d:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
     1352551:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
     1352558:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     135255d:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1352560:	4c 89 ff             	mov    rdi,r15
     1352563:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1352566:	49 89 c7             	mov    r15,rax
     1352569:	4c 8b 6b 30          	mov    r13,QWORD PTR [rbx+0x30]
     135256d:	6a 60                	push   0x60
     135256f:	5f                   	pop    rdi
     1352570:	e8 8b b9 49 00       	call   17edf00 <_Znwm@plt>
     1352575:	48 89 c3             	mov    rbx,rax
     1352578:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1352583:	48 89 03             	mov    QWORD PTR [rbx],rax
     1352586:	66 0f ef c0          	pxor   xmm0,xmm0
     135258a:	f3 0f 7f 43 10       	movdqu XMMWORD PTR [rbx+0x10],xmm0
     135258f:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
     1352594:	f3 0f 7f 43 30       	movdqu XMMWORD PTR [rbx+0x30],xmm0
     1352599:	f3 0f 7f 43 40       	movdqu XMMWORD PTR [rbx+0x40],xmm0
     135259e:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0
     13525a3:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525a7:	48 8d 35 19 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a819]        # 3dcdc7 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2816>
     13525ae:	48 8d 0d 1b a8 08 ff 	lea    rcx,[rip+0xffffffffff08a81b]        # 3dcdd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x281f>
     13525b5:	6a 08                	push   0x8
     13525b7:	41 5e                	pop    r14
     13525b9:	6a 24                	push   0x24
     13525bb:	41 58                	pop    r8
     13525bd:	4c 89 f2             	mov    rdx,r14
     13525c0:	41 b9 dc 05 00 00    	mov    r9d,0x5dc
     13525c6:	68 10 27 00 00       	push   0x2710
     13525cb:	6a 64                	push   0x64
     13525cd:	e8 20 50 29 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
     13525d2:	48 83 c4 10          	add    rsp,0x10
     13525d6:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     13525da:	48 8d 35 14 a8 08 ff 	lea    rsi,[rip+0xffffffffff08a814]        # 3dcdf5 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2844>

## Source use in adapter constructor
      efc5fd:	e8 e9 22 00 00       	call   efe8eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5d01>
      efc602:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efc609:	00 
      efc60a:	4c 89 ef             	mov    rdi,r13
      efc60d:	48 89 de             	mov    rsi,rbx
      efc610:	e8 07 d2 bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      efc615:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efc619:	e8 68 1e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc61e:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      efc623:	80 bb b5 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b5],0x0
      efc62a:	0f 84 3d 01 00 00    	je     efc76d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3b83>
      efc630:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
      efc634:	bf 88 00 00 00       	mov    edi,0x88
      efc639:	e8 c2 18 8f 00       	call   17edf00 <_Znwm@plt>
      efc63e:	49 89 c6             	mov    r14,rax
      efc641:	66 0f ef c0          	pxor   xmm0,xmm0
      efc645:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efc64a:	48 8d 05 6f e1 93 00 	lea    rax,[rip+0x93e16f]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
      efc651:	49 89 06             	mov    QWORD PTR [r14],rax
      efc654:	0f 10 83 48 03 00 00 	movups xmm0,XMMWORD PTR [rbx+0x348]
      efc65b:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
      efc662:	00 
      efc663:	48 8b 83 50 03 00 00 	mov    rax,QWORD PTR [rbx+0x350]
      efc66a:	48 85 c0             	test   rax,rax
      efc66d:	74 05                	je     efc674 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a8a>
      efc66f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc674:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efc67a:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efc67e:	48 85 c0             	test   rax,rax
      efc681:	74 05                	je     efc688 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a9e>
      efc683:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc688:	49 8d 5e 18          	lea    rbx,[r14+0x18]
      efc68c:	48 8d 05 35 6f 94 00 	lea    rax,[rip+0x946f35]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efc693:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efc697:	66 0f ef c9          	pxor   xmm1,xmm1
      efc69b:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
      efc6a1:	48 8d 05 30 5b 94 00 	lea    rax,[rip+0x945b30]        # 18421d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14170>
      efc6a8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      efc6ac:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
      efc6b2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efc6b9:	48 85 ff             	test   rdi,rdi
