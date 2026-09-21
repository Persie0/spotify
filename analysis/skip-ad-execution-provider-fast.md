# Fast Skip Ad execution provider decode

## b8f02e exact window

/tmp/sapfast/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b8ef80 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbf20>:
  b8ef80:	c5 48 8b             	(bad)
  b8ef83:	7c 24                	jl     b8efa9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbf49>
  b8ef85:	20 e8                	and    al,ch
  b8ef87:	bb 27 c3 00 eb       	mov    ebx,0xeb00c327
  b8ef8c:	03 49 89             	add    ecx,DWORD PTR [rcx-0x77]
  b8ef8f:	c5 49 8b             	(bad)
  b8ef92:	bc 24 80 00 00       	mov    esp,0x8024
  b8ef97:	00 e8                	add    al,ch
  b8ef99:	75 06                	jne    b8efa1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbf41>
  b8ef9b:	00 00                	add    BYTE PTR [rax],al
  b8ef9d:	49 8b 7c 24 70       	mov    rdi,QWORD PTR [r12+0x70]
  b8efa2:	e8 df f4 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8efa7:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  b8efac:	e8 23 ac c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b8efb1:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
  b8efb5:	e8 1a ac c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b8efba:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
  b8efbf:	e8 c2 f4 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8efc4:	eb 03                	jmp    b8efc9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbf69>
  b8efc6:	49 89 c5             	mov    r13,rax
  b8efc9:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
  b8efce:	e8 b3 f4 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8efd3:	4c 89 e7             	mov    rdi,r12
  b8efd6:	e8 45 ef c5 00       	call   17edf20 <_ZdlPv@plt>
  b8efdb:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  b8efe0:	e8 43 ae ee ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  b8efe5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b8efea:	e8 31 ef c5 00       	call   17edf20 <_ZdlPv@plt>
  b8efef:	eb 08                	jmp    b8eff9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbf99>
  b8eff1:	49 89 c5             	mov    r13,rax
  b8eff4:	eb e5                	jmp    b8efdb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbf7b>
  b8eff6:	49 89 c5             	mov    r13,rax
  b8eff9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  b8effe:	e8 83 f4 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8f003:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  b8f008:	e8 83 ee c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f00d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f014:	00 00 
  b8f016:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
  b8f01d:	00 
  b8f01e:	75 08                	jne    b8f028 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfc8>
  b8f020:	4c 89 ef             	mov    rdi,r13
  b8f023:	e8 a8 0c ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b8f028:	e8 83 0a c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b8f02d:	cc                   	int3
  b8f02e:	53                   	push   rbx
  b8f02f:	48 89 fb             	mov    rbx,rdi
  b8f032:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b8f036:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b8f03a:	ba b8 00 00 00       	mov    edx,0xb8
  b8f03f:	e8 9a 32 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
  b8f04e:	48 85 c0             	test   rax,rax
  b8f051:	74 02                	je     b8f055 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbff5>
  b8f053:	5b                   	pop    rbx
  b8f054:	c3                   	ret
  b8f055:	e8 65 af ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b8f05a:	48 8d 05 67 f3 c7 00 	lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
  b8f061:	48 89 07             	mov    QWORD PTR [rdi],rax
  b8f064:	48 83 c7 10          	add    rdi,0x10
  b8f068:	e9 bb ad ee ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
  b8f06d:	cc                   	int3
  b8f06e:	53                   	push   rbx
  b8f06f:	48 89 fb             	mov    rbx,rdi
  b8f072:	e8 e3 ff ff ff       	call   b8f05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbffa>
  b8f077:	48 89 df             	mov    rdi,rbx
  b8f07a:	5b                   	pop    rbx
  b8f07b:	e9 a0 ee c5 00       	jmp    17edf20 <_ZdlPv@plt>
  b8f080:	55                   	push   rbp
  b8f081:	41 57                	push   r15
  b8f083:	41 56                	push   r14
  b8f085:	53                   	push   rbx
  b8f086:	48 81 ec e8 14 00 00 	sub    rsp,0x14e8
  b8f08d:	48 89 fb             	mov    rbx,rdi
  b8f090:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f097:	00 00 
  b8f099:	48 89 84 24 e0 14 00 	mov    QWORD PTR [rsp+0x14e0],rax
  b8f0a0:	00 
  b8f0a1:	4c 8d b4 24 ac 00 00 	lea    r14,[rsp+0xac]
  b8f0a8:	00 
  b8f0a9:	4c 89 f7             	mov    rdi,r14
  b8f0ac:	e8 b9 9c f1 ff       	call   aa8d6a <JNI_OnUnload@@Base+0x30637>
  b8f0b1:	4c 89 f7             	mov    rdi,r14
  b8f0b4:	e8 57 f0 c5 00       	call   17ee110 <_ZNSt6__ndk113random_deviceclEv@plt>
  b8f0b9:	89 c6                	mov    esi,eax
  b8f0bb:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
  b8f0c2:	00 
  b8f0c3:	e8 de 39 f6 ff       	call   af2aa6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fa46>
  b8f0c8:	48 b8 01 00 00 00 04 	movabs rax,0x400000001
  b8f0cf:	00 00 00 
  b8f0d2:	48 89 84 24 a4 00 00 	mov    QWORD PTR [rsp+0xa4],rax
  b8f0d9:	00 
  b8f0da:	48 b8 40 42 0f 00 7f 	movabs rax,0x98967f000f4240
  b8f0e1:	96 98 00 
  b8f0e4:	48 89 84 24 9c 00 00 	mov    QWORD PTR [rsp+0x9c],rax
  b8f0eb:	00 
  b8f0ec:	4c 8b 73 10          	mov    r14,QWORD PTR [rbx+0x10]
  b8f0f0:	48 8d 05 0b 0e 81 ff 	lea    rax,[rip+0xffffffffff810e0b]        # 39ff02 <_ZTSN5boost9exceptionE@@Base+0x8e4>
  b8f0f7:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  b8f0fe:	00 
  b8f0ff:	48 89 06             	mov    QWORD PTR [rsi],rax
  b8f102:	c7 46 08 8c 04 25 4c 	mov    DWORD PTR [rsi+0x8],0x4c25048c
  b8f109:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  b8f110:	00 
  b8f111:	e8 94 2c c3 00       	call   17c1daa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175f16>
  b8f116:	48 8d 35 5f 2e 8c ff 	lea    rsi,[rip+0xffffffffff8c2e5f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
  b8f11d:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  b8f124:	00 
  b8f125:	e8 54 a9 ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  b8f12a:	49 8b 36             	mov    rsi,QWORD PTR [r14]
  b8f12d:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  b8f134:	00 
  b8f135:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
  b8f13c:	00 
  b8f13d:	4c 8d bc 24 d0 00 00 	lea    r15,[rsp+0xd0]
  b8f144:	00 
  b8f145:	4c 89 f2             	mov    rdx,r14
  b8f148:	4c 89 f9             	mov    rcx,r15
  b8f14b:	e8 16 1e 00 00       	call   b90f66 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xddf06>
  b8f150:	4c 89 ff             	mov    rdi,r15
  b8f153:	e8 38 ed c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f158:	4c 89 f7             	mov    rdi,r14
  b8f15b:	e8 30 ed c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f160:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  b8f164:	e8 5a 0f 00 00       	call   b900c3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdd063>
  b8f169:	89 c5                	mov    ebp,eax
  b8f16b:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  b8f16f:	e8 2f 15 00 00       	call   b906a3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdd643>
  b8f174:	48 8d bc 24 a4 00 00 	lea    rdi,[rsp+0xa4]
  b8f17b:	00 
  b8f17c:	48                   	rex.W
  b8f17d:	8d                   	.byte 0x8d
  b8f17e:	b4 24                	mov    ah,0x24

## Caller chain around b8f02e and provider +0x28

/tmp/sapfast/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000011ee670 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33bf4>:
 11ee670:	84 24 20             	test   BYTE PTR [rax+riz*1],ah
 11ee673:	01 00                	add    DWORD PTR [rax],eax
 11ee675:	00 48 89             	add    BYTE PTR [rax-0x77],cl
 11ee678:	df e8                	fucomip st,st(0)
 11ee67a:	28 05 e8 ff 48 89    	sub    BYTE PTR [rip+0xffffffff8948ffe8],al        # ffffffff8a67e668 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xffffffff88c8c727>
 11ee680:	44 24 58             	rex.R and al,0x58
 11ee683:	48 89 df             	mov    rdi,rbx
 11ee686:	e8 15 4d a6 ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
 11ee68b:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
 11ee692:	00 
 11ee693:	48 89 df             	mov    rdi,rbx
 11ee696:	e8 05 4c 97 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 11ee6a0:	48 89 df             	mov    rdi,rbx
 11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
 11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 11ee6ad:	48 89 df             	mov    rdi,rbx
 11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
 11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
 11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
 11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
 11ee6e0:	48 89 df             	mov    rdi,rbx
 11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
 11ee6e8:	49 89 c4             	mov    r12,rax
 11ee6eb:	48 89 df             	mov    rdi,rbx
 11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
 11ee6f3:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
 11ee6fa:	00 
 11ee6fb:	48 89 df             	mov    rdi,rbx
 11ee6fe:	e8 c7 6a bf ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
 11ee703:	48 89 c5             	mov    rbp,rax
 11ee706:	48 89 df             	mov    rdi,rbx
 11ee709:	e8 c0 30 a2 ff       	call   c117ce <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e76e>
 11ee70e:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
 11ee715:	00 
 11ee716:	48 89 df             	mov    rdi,rbx
 11ee719:	e8 10 76 eb ff       	call   10a5d2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d144>
 11ee71e:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
 11ee723:	48 89 df             	mov    rdi,rbx
 11ee726:	e8 fd 08 00 00       	call   11ef028 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x345ac>
 11ee72b:	48 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],rax
 11ee732:	00 
 11ee733:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee737:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee73b:	6a 48                	push   0x48
 11ee73d:	5a                   	pop    rdx
 11ee73e:	e8 9b 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee743:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee746:	48 8b 80 40 02 00 00 	mov    rax,QWORD PTR [rax+0x240]
 11ee74d:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
 11ee754:	00 
 11ee755:	48 85 c0             	test   rax,rax
 11ee758:	0f 84 c6 07 00 00    	je     11eef24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344a8>
 11ee75e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee762:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee766:	ba ba 00 00 00       	mov    edx,0xba
 11ee76b:	e8 6e 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee770:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee773:	48 8b 80 d0 05 00 00 	mov    rax,QWORD PTR [rax+0x5d0]
 11ee77a:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
 11ee77f:	48 85 c0             	test   rax,rax
 11ee782:	0f 84 a1 07 00 00    	je     11eef29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344ad>
 11ee788:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee78c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee790:	6a 23                	push   0x23
 11ee792:	5a                   	pop    rdx
 11ee793:	e8 46 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee798:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee79b:	48 8b 80 18 01 00 00 	mov    rax,QWORD PTR [rax+0x118]
 11ee7a2:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
 11ee7a9:	00 
 11ee7aa:	48 85 c0             	test   rax,rax
 11ee7ad:	0f 84 7b 07 00 00    	je     11eef2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344b2>
 11ee7b3:	4c 89 b4 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r14
 11ee7ba:	00 
 11ee7bb:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee7bf:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee7c3:	ba c2 00 00 00       	mov    edx,0xc2
 11ee7c8:	e8 11 3b 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee7cd:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee7d0:	48 8b 80 10 06 00 00 	mov    rax,QWORD PTR [rax+0x610]
 11ee7d7:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
 11ee7de:	00 
 11ee7df:	48 85 c0             	test   rax,rax
 11ee7e2:	0f 84 4b 07 00 00    	je     11eef33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344b7>
 11ee7e8:	48 89 df             	mov    rdi,rbx
 11ee7eb:	e8 6a d1 c8 ff       	call   e7b95a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42d70>
 11ee7f0:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 11ee7f5:	48 89 df             	mov    rdi,rbx
 11ee7f8:	e8 1f 8d ac ff       	call   cb751c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2044bc>
 11ee7fd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
 11ee802:	48 89 df             	mov    rdi,rbx
 11ee805:	e8 74 77 99 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
 11ee80a:	49 89 c6             	mov    r14,rax
 11ee80d:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee811:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee815:	6a 7a                	push   0x7a
 11ee817:	5a                   	pop    rdx
 11ee818:	e8 c1 3a 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee81d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee820:	48 8b 80 d0 03 00 00 	mov    rax,QWORD PTR [rax+0x3d0]
 11ee827:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 11ee82c:	48 85 c0             	test   rax,rax
 11ee82f:	0f 84 03 07 00 00    	je     11eef38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344bc>
 11ee835:	4c 89 a4 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r12
 11ee83c:	00 
 11ee83d:	4c 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r15
 11ee844:	00 
 11ee845:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee849:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee84d:	6a 7a                	push   0x7a
 11ee84f:	5a                   	pop    rdx
 11ee850:	e8 89 3a 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee855:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee858:	48 8b 80 d0 03 00 00 	mov    rax,QWORD PTR [rax+0x3d0]
 11ee85f:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
 11ee866:	00 
 11ee867:	48 85 c0             	test   rax,rax
 11ee86a:	0f 84 cd 06 00 00    	je     11eef3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x344c1>
 11ee870:	48 89 df             	mov    rdi,rbx
 11ee873:	e8 f6 73 a1 ff       	call   c05c6e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x152c0e>
 11ee878:	49 89 c4             	mov    r12,rax
 11ee87b:	48 89 df             	mov    rdi,rbx
 11ee87e:	e8 69 00 ca ff       	call   e8e8ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55d02>
 11ee883:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
 11ee888:	48 89 df             	mov    rdi,rbx
 11ee88b:	e8 c0 2e a2 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
 11ee890:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 11ee895:	48 89 df             	mov    rdi,rbx
 11ee898:	e8 1f 71 e8 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
 11ee89d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
 11ee8a4:	00 
 11ee8a5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
 11ee8aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11ee8ad:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11ee8b0:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
 11ee8b7:	00 
 11ee8b8:	48 8b 7c 24 58       	mov    rdi,QWORD PTR [rsp+0x58]
 11ee8bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11ee8c0:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11ee8c3:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
 11ee8ca:	00 
 11ee8cb:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
 11ee8d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11ee8d3:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11ee8d6:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
 11ee8db:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
 11ee8e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11ee8e3:	ff 50 30             	call   QWORD PTR [rax+0x30]
 11ee8e6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 11ee8e9:	48 89 c7             	mov    rdi,rax
 11ee8ec:	ff 91 78 01 00 00    	call   QWORD PTR [rcx+0x178]
 11ee8f2:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11ee8f7:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
 11ee8fc:	48 8b 07             	mov    rax,QWORD PTR [rdi]
 11ee8ff:	ff 50 28             	call   QWORD PTR [rax+0x28]
 11ee902:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 11ee907:	49 8b 5d 68          	mov    rbx,QWORD PTR [r13+0x68]
 11ee90b:	48 8d 35 4d 8d 19 ff 	lea    rsi,[rip+0xffffffffff198d4d]        # 38765f <_ZTSSt12bad_any_cast@@Base-0x8b69>
 11ee912:	4c 8d bc 24 38 02 00 	lea    r15,[rsp+0x238]
 11ee919:	00 
 11ee91a:	4c 89 ff             	mov    rdi,r15
 11ee91d:	e8 5c b1 88 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 11ee922:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee925:	48 8d bc 24 50 02 00 	lea    rdi,[rsp+0x250]
 11ee92c:	00 
 11ee92d:	48 89 de             	mov    rsi,rbx

## Direct call xrefs to b8f02e
  b8ec14:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
  b8ec1b:	49 89 ce             	mov    r14,rcx
  b8ec1e:	49 89 d7             	mov    r15,rdx
  b8ec21:	48 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],rdi
  b8ec26:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8ec2d:	00 00 
  b8ec2f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
  b8ec36:	00 
  b8ec37:	48 89 cf             	mov    rdi,rcx
  b8ec3a:	e8 03 93 ff ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
  b8ec3f:	48 89 c3             	mov    rbx,rax
  b8ec42:	4c 89 f7             	mov    rdi,r14
  b8ec45:	e8 e4 03 00 00       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
  b8ec4a:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  b8ec4d:	48 89 c7             	mov    rdi,rax
  b8ec50:	ff 51 28             	call   QWORD PTR [rcx+0x28]
  b8ec53:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  b8ec58:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
  b8ec5c:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  b8ec60:	49 8b 6f 60          	mov    rbp,QWORD PTR [r15+0x60]
  b8ec64:	4d 8b af 80 00 00 00 	mov    r13,QWORD PTR [r15+0x80]
  b8ec6b:	4d 8b 77 68          	mov    r14,QWORD PTR [r15+0x68]
  b8ec6f:	48 8d 35 8a 91 7a ff 	lea    rsi,[rip+0xffffffffff7a918a]        # 337e00 <_ZTSSt12bad_any_cast@@Base-0x583c8>
  b8ec76:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
  b8ec7b:	4c 89 ff             	mov    rdi,r15
  b8ec7e:	e8 fb ad ee ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
  b8ec83:	49 8b 06             	mov    rax,QWORD PTR [r14]
  b8ec86:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
  b8ec8b:	4c 89 f6             	mov    rsi,r14
  b8ec8e:	4c 89 fa             	mov    rdx,r15
  b8ec91:	ff 50 18             	call   QWORD PTR [rax+0x18]
--
  c7d465:	41 54                	push   r12
  c7d467:	53                   	push   rbx
  c7d468:	48 83 ec 28          	sub    rsp,0x28
  c7d46c:	49 89 cf             	mov    r15,rcx
  c7d46f:	49 89 d6             	mov    r14,rdx
  c7d472:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
  c7d477:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  c7d47e:	00 00 
  c7d480:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  c7d485:	48 89 cf             	mov    rdi,rcx
  c7d488:	e8 4f 01 00 00       	call   c7d5dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca57c>
  c7d48d:	4c 89 ff             	mov    rdi,r15
  c7d490:	e8 99 1b f1 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
  c7d495:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  c7d498:	48 89 c7             	mov    rdi,rax
  c7d49b:	ff 51 30             	call   QWORD PTR [rcx+0x30]
  c7d49e:	49 89 c4             	mov    r12,rax
  c7d4a1:	4c 89 ff             	mov    rdi,r15
  c7d4a4:	e8 f7 5e fd ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
  c7d4a9:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  c7d4ac:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  c7d4b1:	48 89 c6             	mov    rsi,rax
  c7d4b4:	ff 51 48             	call   QWORD PTR [rcx+0x48]
  c7d4b7:	4d 8b ae 80 00 00 00 	mov    r13,QWORD PTR [r14+0x80]
  c7d4be:	4d 8b be 38 01 00 00 	mov    r15,QWORD PTR [r14+0x138]
  c7d4c5:	6a 78                	push   0x78
  c7d4c7:	5f                   	pop    rdi
  c7d4c8:	e8 33 0a b7 00       	call   17edf00 <_Znwm@plt>
  c7d4cd:	49 89 c6             	mov    r14,rax
  c7d4d0:	48 8d 68 10          	lea    rbp,[rax+0x10]
  c7d4d4:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
--
  e8c9a5:	00 
  e8c9a6:	e8 73 da 7d 00       	call   166a41e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e58a>
  e8c9ab:	48 8b bc 24 48 06 00 	mov    rdi,QWORD PTR [rsp+0x648]
  e8c9b2:	00 
  e8c9b3:	e8 ce 1a c1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  e8c9b8:	49 8b 07             	mov    rax,QWORD PTR [r15]
  e8c9bb:	48 8d bc 24 b0 05 00 	lea    rdi,[rsp+0x5b0]
  e8c9c2:	00 
  e8c9c3:	4c 89 fe             	mov    rsi,r15
  e8c9c6:	ff 50 40             	call   QWORD PTR [rax+0x40]
  e8c9c9:	48 8b 6c 24 50       	mov    rbp,QWORD PTR [rsp+0x50]
  e8c9ce:	4c 89 ef             	mov    rdi,r13
  e8c9d1:	e8 58 26 d0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
  e8c9d6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  e8c9d9:	48 8d bc 24 58 03 00 	lea    rdi,[rsp+0x358]
  e8c9e0:	00 
  e8c9e1:	48 89 c6             	mov    rsi,rax
  e8c9e4:	ff 51 38             	call   QWORD PTR [rcx+0x38]
  e8c9e7:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
  e8c9ec:	48 8b 75 58          	mov    rsi,QWORD PTR [rbp+0x58]
  e8c9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  e8c9f3:	48 8d bc 24 40 03 00 	lea    rdi,[rsp+0x340]
  e8c9fa:	00 
  e8c9fb:	ff 50 28             	call   QWORD PTR [rax+0x28]
  e8c9fe:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
  e8ca02:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
  e8ca09:	00 
  e8ca0a:	48 8b 45 40          	mov    rax,QWORD PTR [rbp+0x40]
  e8ca0e:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  e8ca13:	48 8b 45 68          	mov    rax,QWORD PTR [rbp+0x68]
  e8ca17:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
--
 10885b9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 10885be:	48 89 df             	mov    rdi,rbx
 10885c1:	e8 34 92 b8 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
 10885c6:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10885c9:	48 89 c7             	mov    rdi,rax
 10885cc:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 10885cf:	48 89 c5             	mov    rbp,rax
 10885d2:	49 8b 06             	mov    rax,QWORD PTR [r14]
 10885d5:	4c 89 f7             	mov    rdi,r14
 10885d8:	ff 50 28             	call   QWORD PTR [rax+0x28]
 10885db:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 10885e0:	48 89 df             	mov    rdi,rbx
 10885e3:	e8 46 6a b0 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
 10885e8:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 10885eb:	48 89 c7             	mov    rdi,rax
 10885ee:	ff 51 28             	call   QWORD PTR [rcx+0x28]
 10885f1:	49 89 c6             	mov    r14,rax
 10885f4:	6a 28                	push   0x28
 10885f6:	5f                   	pop    rdi
 10885f7:	e8 04 59 76 00       	call   17edf00 <_Znwm@plt>
 10885fc:	48 89 c3             	mov    rbx,rax
 10885ff:	0f 10 45 00          	movups xmm0,XMMWORD PTR [rbp+0x0]
 1088603:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
 1088608:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
 108860c:	48 85 c0             	test   rax,rax
 108860f:	74 05                	je     1088616 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24fa2c>
 1088611:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
 1088616:	41 0f 28 87 40 01 00 	movaps xmm0,XMMWORD PTR [r15+0x140]
 108861d:	00 
 108861e:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
 1088623:	49 8b 87 48 01 00 00 	mov    rax,QWORD PTR [r15+0x148]
--
 11ee67e:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11ee683:	48 89 df             	mov    rdi,rbx
 11ee686:	e8 15 4d a6 ff       	call   c533a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a0340>
 11ee68b:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
 11ee692:	00 
 11ee693:	48 89 df             	mov    rdi,rbx
 11ee696:	e8 05 4c 97 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
 11ee69b:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
 11ee6a0:	48 89 df             	mov    rdi,rbx
 11ee6a3:	e8 d2 30 a2 ff       	call   c1177a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e71a>
 11ee6a8:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
 11ee6ad:	48 89 df             	mov    rdi,rbx
 11ee6b0:	e8 79 09 9a ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
 11ee6b5:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
 11ee6ba:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 11ee6be:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
 11ee6c2:	ba b8 00 00 00       	mov    edx,0xb8
 11ee6c7:	e8 12 3c 97 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
 11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
 11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]
 11ee6d6:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
 11ee6db:	e8 ba 85 bf ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
 11ee6e0:	48 89 df             	mov    rdi,rbx
 11ee6e3:	e8 2c 99 99 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
 11ee6e8:	49 89 c4             	mov    r12,rax
 11ee6eb:	48 89 df             	mov    rdi,rbx
 11ee6ee:	e8 43 86 ac ff       	call   cb6d36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203cd6>
 11ee6f3:	48 89 84 24 28 01 00 	mov    QWORD PTR [rsp+0x128],rax
 11ee6fa:	00 
 11ee6fb:	48 89 df             	mov    rdi,rbx
 11ee6fe:	e8 c7 6a bf ff       	call   de51ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb2250>
--
 1441ffb:	41 55                	push   r13
 1441ffd:	41 54                	push   r12
 1441fff:	53                   	push   rbx
 1442000:	48 81 ec 68 01 00 00 	sub    rsp,0x168
 1442007:	49 89 ce             	mov    r14,rcx
 144200a:	48 89 d3             	mov    rbx,rdx
 144200d:	48 89 7c 24 48       	mov    QWORD PTR [rsp+0x48],rdi
 1442012:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1442019:	00 00 
 144201b:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
 1442022:	00 
 1442023:	48 89 cf             	mov    rdi,rcx
 1442026:	e8 03 d0 74 ff       	call   b8f02e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfce>
 144202b:	49 89 c7             	mov    r15,rax
 144202e:	4c 89 f7             	mov    rdi,r14
 1442031:	e8 e6 a2 83 ff       	call   c7c31c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c92bc>
 1442036:	48 89 04 24          	mov    QWORD PTR [rsp],rax
 144203a:	4c 89 f7             	mov    rdi,r14
 144203d:	e8 d2 5f 74 ff       	call   b88014 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4fb4>
 1442042:	49 89 c4             	mov    r12,rax
 1442045:	4c 89 f7             	mov    rdi,r14
 1442048:	e8 f5 5e 74 ff       	call   b87f42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4ee2>
 144204d:	49 89 c5             	mov    r13,rax
 1442050:	4c 89 f7             	mov    rdi,r14
 1442053:	e8 64 39 c3 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
 1442058:	48 89 c5             	mov    rbp,rax
 144205b:	49 8b 07             	mov    rax,QWORD PTR [r15]
 144205e:	4c 89 ff             	mov    rdi,r15
 1442061:	ff 50 28             	call   QWORD PTR [rax+0x28]
 1442064:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 1442069:	48 8b 83 50 01 00 00 	mov    rax,QWORD PTR [rbx+0x150]

## Immediate code xrefs to any constant address returned/loaded by b8f02e
  b8efe0:	e8 43 ae ee ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  b8efe5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b8efea:	e8 31 ef c5 00       	call   17edf20 <_ZdlPv@plt>
  b8efef:	eb 08                	jmp    b8eff9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbf99>
  b8eff1:	49 89 c5             	mov    r13,rax
  b8eff4:	eb e5                	jmp    b8efdb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbf7b>
  b8eff6:	49 89 c5             	mov    r13,rax
  b8eff9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  b8effe:	e8 83 f4 f0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8f003:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  b8f008:	e8 83 ee c5 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b8f00d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b8f014:	00 00 
  b8f016:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
  b8f01d:	00 
  b8f01e:	75 08                	jne    b8f028 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbfc8>
  b8f020:	4c 89 ef             	mov    rdi,r13
  b8f023:	e8 a8 0c ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b8f028:	e8 83 0a c6 00       	call   17efab0 <__stack_chk_fail@plt>
  b8f02d:	cc                   	int3
  b8f02e:	53                   	push   rbx
  b8f02f:	48 89 fb             	mov    rbx,rdi
  b8f032:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b8f036:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b8f03a:	ba b8 00 00 00       	mov    edx,0xb8
  b8f03f:	e8 9a 32 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]
  b8f04e:	48 85 c0             	test   rax,rax
  b8f051:	74 02                	je     b8f055 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbff5>
  b8f053:	5b                   	pop    rbx
  b8f054:	c3                   	ret
  b8f055:	e8 65 af ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b8f05a:	48 8d 05 67 f3 c7 00 	lea    rax,[rip+0xc7f367]        # 180e3c8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x4088>
  b8f061:	48 89 07             	mov    QWORD PTR [rdi],rax
  b8f064:	48 83 c7 10          	add    rdi,0x10
  b8f068:	e9 bb ad ee ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
  b8f06d:	cc                   	int3
  b8f06e:	53                   	push   rbx
  b8f06f:	48 89 fb             	mov    rbx,rdi
  b8f072:	e8 e3 ff ff ff       	call   b8f05a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbffa>
  b8f077:	48 89 df             	mov    rdi,rbx
  b8f07a:	5b                   	pop    rbx
  b8f07b:	e9 a0 ee c5 00       	jmp    17edf20 <_ZdlPv@plt>
  b8f080:	55                   	push   rbp
  b8f081:	41 57                	push   r15
  b8f083:	41 56                	push   r14
  b8f085:	53                   	push   rbx
  b8f086:	48 81 ec e8 14 00 00 	sub    rsp,0x14e8
  b8f08d:	48 89 fb             	mov    rbx,rdi
  b8f090:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
