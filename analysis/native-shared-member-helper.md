# Shared member initializer behind b2828e

b2828e is a tiny wrapper around 0x17d9e02.

## b28270..b282b0 wrappers


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b28270 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75210>:
  b28270:	11 07                	adc    DWORD PTR [rdi],eax
  b28272:	48 85 c9             	test   rcx,rcx
  b28275:	74 05                	je     b2827c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521c>
  b28277:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  b2827c:	c3                   	ret
  b2827d:	cc                   	int3
  b2827e:	50                   	push   rax
  b2827f:	e8 7e 1b cb 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b28284:	58                   	pop    rax
  b28285:	c3                   	ret
  b28286:	48 89 c7             	mov    rdi,rax
  b28289:	e8 17 18 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b2828e:	50                   	push   rax
  b2828f:	e8 6e 1b cb 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b28294:	58                   	pop    rax
  b28295:	c3                   	ret
  b28296:	48 89 c7             	mov    rdi,rax
  b28299:	e8 07 18 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b2829e:	48 8d 05 23 0d ce 00 	lea    rax,[rip+0xce0d23]        # 1808fc8 <_ZTIN4asio22service_already_existsE@@Base+0xa7b0>
  b282a5:	48 89 07             	mov    QWORD PTR [rdi],rax
  b282a8:	e9 63 5d cc 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  b282ad:	cc                   	int3
  b282ae:	53                   	push   rbx
  b282af:	48                   	rex.W

## 0x17d9e02 initializer + 0x17d9e66 teardown


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000017d9dc0 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5be1>:
 17d9dc0:	00 75 10             	add    BYTE PTR [rbp+0x10],dh
 17d9dc3:	48 8b 33             	mov    rsi,QWORD PTR [rbx]
 17d9dc6:	48 83 c6 10          	add    rsi,0x10
 17d9dca:	48 89 33             	mov    QWORD PTR [rbx],rsi
 17d9dcd:	48 3b 73 08          	cmp    rsi,QWORD PTR [rbx+0x8]
 17d9dd1:	75 c9                	jne    17d9d9c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5bbd>
 17d9dd3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17d9dda:	00 00 
 17d9ddc:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 17d9de1:	75 08                	jne    17d9deb <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c0c>
 17d9de3:	48 83 c4 18          	add    rsp,0x18
 17d9de7:	5b                   	pop    rbx
 17d9de8:	41 5e                	pop    r14
 17d9dea:	c3                   	ret
 17d9deb:	e8 c0 5c 01 00       	call   17efab0 <__stack_chk_fail@plt>
 17d9df0:	53                   	push   rbx
 17d9df1:	48 89 fb             	mov    rbx,rdi
 17d9df4:	48 83 07 10          	add    QWORD PTR [rdi],0x10
 17d9df8:	e8 7b ff ff ff       	call   17d9d78 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5b99>
 17d9dfd:	48 89 d8             	mov    rax,rbx
 17d9e00:	5b                   	pop    rbx
 17d9e01:	c3                   	ret
 17d9e02:	41 56                	push   r14
 17d9e04:	53                   	push   rbx
 17d9e05:	48 83 ec 18          	sub    rsp,0x18
 17d9e09:	48 89 fb             	mov    rbx,rdi
 17d9e0c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17d9e13:	00 00 
 17d9e15:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
 17d9e1a:	49 89 e6             	mov    r14,rsp
 17d9e1d:	4c 89 f7             	mov    rdi,r14
 17d9e20:	e8 d1 b8 38 ff       	call   b656f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2696>
 17d9e25:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
 17d9e29:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 17d9e2c:	31 ff                	xor    edi,edi
 17d9e2e:	e8 53 46 2c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 17d9e33:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17d9e3a:	00 00 
 17d9e3c:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
 17d9e41:	75 1e                	jne    17d9e61 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c82>
 17d9e43:	48 83 c3 10          	add    rbx,0x10
 17d9e47:	0f 57 c0             	xorps  xmm0,xmm0
 17d9e4a:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
 17d9e4e:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
 17d9e52:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
 17d9e56:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
 17d9e59:	48 83 c4 18          	add    rsp,0x18
 17d9e5d:	5b                   	pop    rbx
 17d9e5e:	41 5e                	pop    r14
 17d9e60:	c3                   	ret
 17d9e61:	e8 4a 5c 01 00       	call   17efab0 <__stack_chk_fail@plt>
 17d9e66:	41 57                	push   r15
 17d9e68:	41 56                	push   r14
 17d9e6a:	41 55                	push   r13
 17d9e6c:	41 54                	push   r12
 17d9e6e:	53                   	push   rbx
 17d9e6f:	48 89 fb             	mov    rbx,rdi
 17d9e72:	4c 8d 77 38          	lea    r14,[rdi+0x38]
 17d9e76:	4c 8b 7f 38          	mov    r15,QWORD PTR [rdi+0x38]
 17d9e7a:	4c 8b 67 40          	mov    r12,QWORD PTR [rdi+0x40]
 17d9e7e:	4d 29 fc             	sub    r12,r15
 17d9e81:	74 18                	je     17d9e9b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5cbc>
 17d9e83:	45 31 ed             	xor    r13d,r13d
 17d9e86:	4b 8b 3c 2f          	mov    rdi,QWORD PTR [r15+r13*1]
 17d9e8a:	e8 8f fc ff ff       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
 17d9e8f:	49 83 c5 10          	add    r13,0x10
 17d9e93:	4d 39 ec             	cmp    r12,r13
 17d9e96:	75 ee                	jne    17d9e86 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5ca7>
 17d9e98:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
 17d9e9b:	4d 85 ff             	test   r15,r15
 17d9e9e:	74 10                	je     17d9eb0 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5cd1>
 17d9ea0:	4c 89 f7             	mov    rdi,r14
 17d9ea3:	e8 c8 d6 2d ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
 17d9ea8:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
 17d9eab:	e8 70 40 01 00       	call   17edf20 <_ZdlPv@plt>
 17d9eb0:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
 17d9eb4:	e8 97 41 01 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
 17d9eb9:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
 17d9ebd:	5b                   	pop    rbx
 17d9ebe:	41 5c                	pop    r12
 17d9ec0:	41 5d                	pop    r13
 17d9ec2:	41 5e                	pop    r14
 17d9ec4:	41 5f                	pop    r15
 17d9ec6:	e9 bb 45 2c ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
 17d9ecb:	48 89 c7             	mov    rdi,rax
 17d9ece:	e8 d2 fb 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17d9ed3:	cc                   	int3
 17d9ed4:	41 57                	push   r15
 17d9ed6:	41 56                	push   r14
 17d9ed8:	41 55                	push   r13
 17d9eda:	41 54                	push   r12
 17d9edc:	53                   	push   rbx
 17d9edd:	49 89 fe             	mov    r14,rdi
 17d9ee0:	48 8d 5f 10          	lea    rbx,[rdi+0x10]
 17d9ee4:	48 89 df             	mov    rdi,rbx
 17d9ee7:	e8 04 42 01 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 17d9eec:	4d 8b 7e 38          	mov    r15,QWORD PTR [r14+0x38]
 17d9ef0:	4d 8b 66 40          	mov    r12,QWORD PTR [r14+0x40]
 17d9ef4:	4d 29 fc             	sub    r12,r15
 17d9ef7:	74 15                	je     17d9f0e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d2f>
 17d9ef9:	45 31 ed             	xor    r13d,r13d
 17d9efc:	4b 8b 3c 2f          	mov    rdi,QWORD PTR [r15+r13*1]
 17d9f00:	e8 19 fc ff ff       	call   17d9b1e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x593f>
 17d9f05:	49 83 c5 10          	add    r13,0x10
 17d9f09:	4d 39 ec             	cmp    r12,r13
 17d9f0c:	75 ee                	jne    17d9efc <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d1d>
 17d9f0e:	49 83 c6 38          	add    r14,0x38
 17d9f12:	4c 89 f7             	mov    rdi,r14
 17d9f15:	e8 56 d6 2d ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
 17d9f1a:	48 89 df             	mov    rdi,rbx
 17d9f1d:	5b                   	pop    rbx
 17d9f1e:	41 5c                	pop    r12
 17d9f20:	41 5d                	pop    r13
 17d9f22:	41 5e                	pop    r14
 17d9f24:	41 5f                	pop    r15
 17d9f26:	e9 d5 41 01 00       	jmp    17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
 17d9f2b:	49 89 c6             	mov    r14,rax
 17d9f2e:	48 89 df             	mov    rdi,rbx
 17d9f31:	e8 ca 41 01 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
 17d9f36:	4c 89 f7             	mov    rdi,r14
 17d9f39:	e8 92 5d 29 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 17d9f3e:	55                   	push   rbp
 17d9f3f:	41 57                	push   r15
 17d9f41:	41 56                	push   r14
 17d9f43:	41 55                	push   r13
 17d9f45:	41 54                	push   r12
 17d9f47:	53                   	push   rbx
 17d9f48:	50                   	push   rax
 17d9f49:	49 89 fe             	mov    r14,rdi
 17d9f4c:	48 8d 5f 10          	lea    rbx,[rdi+0x10]
 17d9f50:	48 89 df             	mov    rdi,rbx
 17d9f53:	e8 98 41 01 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
 17d9f58:	4d 8b 66 38          	mov    r12,QWORD PTR [r14+0x38]
 17d9f5c:	4d 8b 7e 40          	mov    r15,QWORD PTR [r14+0x40]
 17d9f60:	4d 89 fd             	mov    r13,r15
 17d9f63:	4d 29 e5             	sub    r13,r12
 17d9f66:	74 19                	je     17d9f81 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5da2>
 17d9f68:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 17d9f6c:	e8 f7 fb ff ff       	call   17d9b68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5989>
 17d9f71:	84 c0                	test   al,al
 17d9f73:	75 11                	jne    17d9f86 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5da7>
 17d9f75:	49 83 c4 10          	add    r12,0x10
 17d9f79:	49 83 c5 f0          	add    r13,0xfffffffffffffff0
 17d9f7d:	75 e9                	jne    17d9f68 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d89>
 17d9f7f:	eb 08                	jmp    17d9f89 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5daa>
 17d9f81:	4c 89 e0             	mov    rax,r12
 17d9f84:	eb 0b                	jmp    17d9f91 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5db2>
 17d9f86:	4d 89 e7             	mov    r15,r12
 17d9f89:	4d 8b 66 38          	mov    r12,QWORD PTR [r14+0x38]
 17d9f8d:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
 17d9f91:	4c 29 e0             	sub    rax,r12
 17d9f94:	4c 01 e0             	add    rax,r12
 17d9f97:	49 39 c7             	cmp    r15,rax
 17d9f9a:	40 0f 94 c5          	sete   bpl
 17d9f9e:	48 89 df             	mov    rdi,rbx
 17d9fa1:	e8 5a 41 01 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
 17d9fa6:	89 e8                	mov    eax,ebp
 17d9fa8:	48 83 c4 08          	add    rsp,0x8
 17d9fac:	5b                   	pop    rbx
 17d9fad:	41 5c                	pop    r12
 17d9faf:	41 5d                	pop    r13
 17d9fb1:	41 5e                	pop    r14
 17d9fb3:	41 5f                	pop    r15
 17d9fb5:	5d                   	pop    rbp
 17d9fb6:	c3                   	ret
 17d9fb7:	49 89 c6             	mov    r14,rax
 17d9fba:	48 89 df             	mov    rdi,rbx
 17d9fbd:	e8 3e 41 01 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
 17d9fc2:	4c 89 f7             	mov    rdi,r14
 17d9fc5:	e8 06 5d 29 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 17d9fca:	55                   	push   rbp
 17d9fcb:	41 57                	push   r15
 17d9fcd:	41 56                	push   r14
 17d9fcf:	41 55                	push   r13
 17d9fd1:	41 54                	push   r12
 17d9fd3:	53                   	push   rbx
 17d9fd4:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
 17d9fdb:	49 89 d5             	mov    r13,rdx
 17d9fde:	49 89 f6             	mov    r14,rsi
 17d9fe1:	49 89 fc             	mov    r12,rdi
 17d9fe4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17d9feb:	00 00 
 17d9fed:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
 17d9ff4:	00 
 17d9ff5:	48 8d 5e 10          	lea    rbx,[rsi+0x10]
 17d9ff9:	48 89 df             	mov    rdi,rbx
 17d9ffc:	e8                   	.byte 0xe8
 17d9ffd:	ef                   	out    dx,eax
 17d9ffe:	40                   	rex
 17d9fff:	01                   	.byte 0x1

## b656f6 first-16-byte state constructor


/tmp/native/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000b656b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2650>:
  b656b0:	44 24 20             	rex.R and al,0x20
  b656b3:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
  b656b7:	48 89 c7             	mov    rdi,rax
  b656ba:	ff d2                	call   rdx
  b656bc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b656c3:	00 00 
  b656c5:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
  b656ca:	75 18                	jne    b656e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2684>
  b656cc:	0f 57 c0             	xorps  xmm0,xmm0
  b656cf:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
  b656d3:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  b656d6:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
  b656db:	48 89 d8             	mov    rax,rbx
  b656de:	48 83 c4 40          	add    rsp,0x40
  b656e2:	5b                   	pop    rbx
  b656e3:	c3                   	ret
  b656e4:	e8 c7 a3 c8 00       	call   17efab0 <__stack_chk_fail@plt>
  b656e9:	cc                   	int3
  b656ea:	49 8b 78 20          	mov    rdi,QWORD PTR [r8+0x20]
  b656ee:	48 89 ce             	mov    rsi,rcx
  b656f1:	e9 14 bf f7 ff       	jmp    ae160a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2e5aa>
  b656f6:	53                   	push   rbx
  b656f7:	48 89 fb             	mov    rbx,rdi
  b656fa:	6a 20                	push   0x20
  b656fc:	5f                   	pop    rdi
  b656fd:	e8 fe 87 c8 00       	call   17edf00 <_Znwm@plt>
  b65702:	0f 57 c0             	xorps  xmm0,xmm0
  b65705:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  b65709:	48 8d 0d c0 b1 c9 00 	lea    rcx,[rip+0xc9b1c0]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
  b65710:	48 89 08             	mov    QWORD PTR [rax],rcx
  b65713:	48 8d 48 18          	lea    rcx,[rax+0x18]
  b65717:	c6 40 18 00          	mov    BYTE PTR [rax+0x18],0x0
  b6571b:	48 89 0b             	mov    QWORD PTR [rbx],rcx
  b6571e:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  b65722:	31 ff                	xor    edi,edi
  b65724:	5b                   	pop    rbx
  b65725:	e9 f2 8c f3 ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  b6572a:	48 83 ec 18          	sub    rsp,0x18
  b6572e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b65735:	00 00 
  b65737:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  b6573c:	48 8d 74 24 0f       	lea    rsi,[rsp+0xf]
  b65741:	c6 06 00             	mov    BYTE PTR [rsi],0x0
  b65744:	e8 93 02 00 00       	call   b659dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb297c>
  b65749:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  b65750:	00 00 
  b65752:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
  b65757:	75 05                	jne    b6575e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26fe>
  b65759:	48 83 c4 18          	add    rsp,0x18
  b6575d:	c3                   	ret
  b6575e:	e8 4d a3 c8 00       	call   17efab0 <__stack_chk_fail@plt>
  b65763:	cc                   	int3
  b65764:	e9 d7 01 00 00       	jmp    b65940 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb28e0>
  b65769:	cc                   	int3
  b6576a:	41 57                	push   r15
  b6576c:	41 56                	push   r14
  b6576e:	53                   	push   rbx
  b6576f:	48 89 fb             	mov    rbx,rdi
  b65772:	4c 8b 77 10          	mov    r14,QWORD PTR [rdi+0x10]
  b65776:	4d 85 f6             	test   r14,r14
  b65779:	74 1c                	je     b65797 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2737>
  b6577b:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
  b6577e:	49                   	rex.WB
  b6577f:	8d                   	.byte 0x8d

## Direct xrefs to initializer / teardown / first-state helper

  a92548:	e8 94 e2 01 00       	call   ab07e1 <JNI_OnUnload@@Base+0x380ae>
  a9254d:	e8 d6 e2 01 00       	call   ab0828 <JNI_OnUnload@@Base+0x380f5>
  a92552:	58                   	pop    rax
  a92553:	e9 17 e3 01 00       	jmp    ab086f <JNI_OnUnload@@Base+0x3813c>
  a92558:	50                   	push   rax
  a92559:	48 8d 3d b0 c3 f5 00 	lea    rdi,[rip+0xf5c3b0]        # 19ee910 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x40>
  a92560:	e8 9d 78 d4 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a92565:	48 8d 3d fa 78 d4 00 	lea    rdi,[rip+0xd478fa]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a9256c:	48 8d 35 9d c3 f5 00 	lea    rsi,[rip+0xf5c39d]        # 19ee910 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x40>
  a92573:	48 8d 15 86 1a d6 00 	lea    rdx,[rip+0xd61a86]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a9257a:	58                   	pop    rax
  a9257b:	e9 e0 b8 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a92580:	48 89 c7             	mov    rdi,rax
  a92583:	e8 1d 75 fe ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  a92588:	50                   	push   rax
--
  a97e40:	48 8d 3d b1 ae ee 00 	lea    rdi,[rip+0xeeaeb1]        # 1982cf8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4b940>
  a97e47:	e9 7b f6 ca 00       	jmp    17474c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfb633>
  a97e4c:	41 57                	push   r15
  a97e4e:	41 56                	push   r14
  a97e50:	53                   	push   rbx
  a97e51:	48 8d 3d 30 a4 f5 00 	lea    rdi,[rip+0xf5a430]        # 19f2288 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x347>
  a97e58:	e8 a5 1f d4 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a97e5d:	48 8d 3d 02 20 d4 00 	lea    rdi,[rip+0xd42002]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a97e64:	48 8d 35 1d a4 f5 00 	lea    rsi,[rip+0xf5a41d]        # 19f2288 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x347>
  a97e6b:	48 8d 15 8e c1 d5 00 	lea    rdx,[rip+0xd5c18e]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a97e72:	e8 e9 5f d5 00       	call   17ede60 <__cxa_atexit@plt>
  a97e77:	48 8d 3d 62 a4 f5 00 	lea    rdi,[rip+0xf5a462]        # 19f22e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f>
  a97e7e:	e8 7f 1f d4 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a97e83:	48 8d 1d dc 1f d4 00 	lea    rbx,[rip+0xd41fdc]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a97e8a:	48 8d 35 4f a4 f5 00 	lea    rsi,[rip+0xf5a44f]        # 19f22e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f>
  a97e91:	4c 8d 35 68 c1 d5 00 	lea    r14,[rip+0xd5c168]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a97e98:	48 89 df             	mov    rdi,rbx
  a97e9b:	4c 89 f2             	mov    rdx,r14
  a97e9e:	e8 bd 5f d5 00       	call   17ede60 <__cxa_atexit@plt>
  a97ea3:	4c 8d 3d 8e a4 f5 00 	lea    r15,[rip+0xf5a48e]        # 19f2338 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x3f7>
  a97eaa:	4c 89 ff             	mov    rdi,r15
--
  a97ec0:	e9 9b 5f d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a97ec5:	eb 00                	jmp    a97ec7 <JNI_OnUnload@@Base+0x1f794>
  a97ec7:	48 89 c7             	mov    rdi,rax
  a97eca:	e8 d6 1b fe ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  a97ecf:	50                   	push   rax
  a97ed0:	48 8d 3d b9 a4 f5 00 	lea    rdi,[rip+0xf5a4b9]        # 19f2390 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x44f>
  a97ed7:	e8 26 1f d4 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a97edc:	48 8d 3d 83 1f d4 00 	lea    rdi,[rip+0xd41f83]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a97ee3:	48 8d 35 a6 a4 f5 00 	lea    rsi,[rip+0xf5a4a6]        # 19f2390 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x44f>
  a97eea:	48 8d 15 0f c1 d5 00 	lea    rdx,[rip+0xd5c10f]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a97ef1:	58                   	pop    rax
  a97ef2:	e9 69 5f d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a97ef7:	48 89 c7             	mov    rdi,rax
  a97efa:	e8 a6 1b fe ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  a97eff:	53                   	push   rbx
--
  a9a39e:	e8 a7 56 c0 00       	call   169fa4a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53bb6>
  a9a3a3:	4c 89 f7             	mov    rdi,r14
  a9a3a6:	4c 89 fe             	mov    rsi,r15
  a9a3a9:	48 89 da             	mov    rdx,rbx
  a9a3ac:	e8 af 3a d5 00       	call   17ede60 <__cxa_atexit@plt>
  a9a3b1:	48 8d 3d 88 aa f5 00 	lea    rdi,[rip+0xf5aa88]        # 19f4e40 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2eff>
  a9a3b8:	e8 45 fa d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a9a3bd:	48 8d 3d a2 fa d3 00 	lea    rdi,[rip+0xd3faa2]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a9a3c4:	48 8d 35 75 aa f5 00 	lea    rsi,[rip+0xf5aa75]        # 19f4e40 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2eff>
  a9a3cb:	48 8d 15 2e 9c d5 00 	lea    rdx,[rip+0xd59c2e]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a9a3d2:	e8 89 3a d5 00       	call   17ede60 <__cxa_atexit@plt>
  a9a3d7:	48 8d 3d ba aa f5 00 	lea    rdi,[rip+0xf5aaba]        # 19f4e98 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2f57>
  a9a3de:	e8 1f fa d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a9a3e3:	48 8d 3d 7c fa d3 00 	lea    rdi,[rip+0xd3fa7c]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a9a3ea:	48 8d 35 a7 aa f5 00 	lea    rsi,[rip+0xf5aaa7]        # 19f4e98 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2f57>
  a9a3f1:	48 8d 15 08 9c d5 00 	lea    rdx,[rip+0xd59c08]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a9a3f8:	e8 63 3a d5 00       	call   17ede60 <__cxa_atexit@plt>
  a9a3fd:	48 8d 3d ec aa f5 00 	lea    rdi,[rip+0xf5aaec]        # 19f4ef0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2faf>
  a9a404:	e8 f9 f9 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a9a409:	48 8d 3d 56 fa d3 00 	lea    rdi,[rip+0xd3fa56]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a9a410:	48 8d 35 d9 aa f5 00 	lea    rsi,[rip+0xf5aad9]        # 19f4ef0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2faf>
  a9a417:	48 8d 15 e2 9b d5 00 	lea    rdx,[rip+0xd59be2]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a9a41e:	e8 3d 3a d5 00       	call   17ede60 <__cxa_atexit@plt>
  a9a423:	48 8d 3d 1e ab f5 00 	lea    rdi,[rip+0xf5ab1e]        # 19f4f48 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x3007>
  a9a42a:	e8 d3 f9 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a9a42f:	48 8d 3d 30 fa d3 00 	lea    rdi,[rip+0xd3fa30]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a9a436:	48 8d 35 0b ab f5 00 	lea    rsi,[rip+0xf5ab0b]        # 19f4f48 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x3007>
  a9a43d:	48 8d 15 bc 9b d5 00 	lea    rdx,[rip+0xd59bbc]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a9a444:	e8 17 3a d5 00       	call   17ede60 <__cxa_atexit@plt>
  a9a449:	48 8d 3d 50 ab f5 00 	lea    rdi,[rip+0xf5ab50]        # 19f4fa0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x305f>
  a9a450:	e8 ad f9 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  a9a455:	48 8d 3d 0a fa d3 00 	lea    rdi,[rip+0xd3fa0a]        # 17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  a9a45c:	48 8d 35 3d ab f5 00 	lea    rsi,[rip+0xf5ab3d]        # 19f4fa0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x305f>
  a9a463:	48 8d 15 96 9b d5 00 	lea    rdx,[rip+0xd59b96]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  a9a46a:	5b                   	pop    rbx
  a9a46b:	41 5e                	pop    r14
  a9a46d:	41 5f                	pop    r15
  a9a46f:	e9 ec 39 d5 00       	jmp    17ede60 <__cxa_atexit@plt>
  a9a474:	eb 06                	jmp    a9a47c <JNI_OnUnload@@Base+0x21d49>
--
  aa0601:	e8 c2 17 3c 00       	call   e61dc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x291de>
  aa0606:	4d 89 34 24          	mov    QWORD PTR [r12],r14
  aa060a:	49 89 6c 24 08       	mov    QWORD PTR [r12+0x8],rbp
  aa060f:	4d 89 6c 24 10       	mov    QWORD PTR [r12+0x10],r13
  aa0614:	4d 8d 74 24 18       	lea    r14,[r12+0x18]
  aa0619:	4c 89 f7             	mov    rdi,r14
  aa061c:	e8 e1 97 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  aa0621:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  aa0628:	00 
  aa0629:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  aa0630:	00 
  aa0631:	e8 92 17 3c 00       	call   e61dc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x291de>
  aa0636:	bf 88 00 00 00       	mov    edi,0x88
  aa063b:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
  aa0640:	e8 bb d8 d4 00       	call   17edf00 <_Znwm@plt>
--
  aa0a6a:	eb 03                	jmp    aa0a6f <JNI_OnUnload@@Base+0x2833c>
  aa0a6c:	49 89 c6             	mov    r14,rax
  aa0a6f:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
  aa0a76:	00 
  aa0a77:	e8 84 00 00 00       	call   aa0b00 <JNI_OnUnload@@Base+0x283cd>
  aa0a7c:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  aa0a81:	e8 e0 93 d3 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  aa0a86:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  aa0a8d:	00 
  aa0a8e:	e8 6d 00 00 00       	call   aa0b00 <JNI_OnUnload@@Base+0x283cd>
  aa0a93:	4c 89 e7             	mov    rdi,r12
  aa0a96:	e8 85 d4 d4 00       	call   17edf20 <_ZdlPv@plt>
  aa0a9b:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  aa0aa2:	00 
  aa0aa3:	e8 58 00 00 00       	call   aa0b00 <JNI_OnUnload@@Base+0x283cd>
--
  aa3bee:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  aa3bf3:	48 8d 05 5e ae d5 00 	lea    rax,[rip+0xd5ae5e]        # 17fea58 <_ZTIN4asio22service_already_existsE@@Base+0x240>
  aa3bfa:	48 89 03             	mov    QWORD PTR [rbx],rax
  aa3bfd:	49 89 de             	mov    r14,rbx
  aa3c00:	49 83 c6 18          	add    r14,0x18
  aa3c04:	4c 89 f7             	mov    rdi,r14
  aa3c07:	e8 f6 61 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  aa3c0c:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  aa3c11:	4c 89 70 38          	mov    QWORD PTR [rax+0x38],r14
  aa3c15:	48 89 58 40          	mov    QWORD PTR [rax+0x40],rbx
  aa3c19:	48 83 c0 50          	add    rax,0x50
  aa3c1d:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  aa3c22:	66 0f 6f 84 24 c0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xc0]
  aa3c29:	00 00 
  aa3c2b:	66 48 0f 7e c0       	movq   rax,xmm0
--
  aa4db6:	48 89 03             	mov    QWORD PTR [rbx],rax
  aa4db9:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
  aa4dc0:	00 
  aa4dc1:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
  aa4dc5:	c6 43 20 00          	mov    BYTE PTR [rbx+0x20],0x0
  aa4dc9:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
  aa4dcd:	e8 30 50 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  aa4dd2:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  aa4dd9:	e8 24 50 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  aa4dde:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
  aa4de5:	e8 34 6e 01 00       	call   abbc1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bbe>
  aa4dea:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
  aa4df1:	e8 0c 50 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  aa4df6:	48 8d bb 88 01 00 00 	lea    rdi,[rbx+0x188]
  aa4dfd:	e8 00 50 d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  aa4e02:	48 8d bb e0 01 00 00 	lea    rdi,[rbx+0x1e0]
  aa4e09:	e8 f4 4f d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  aa4e0e:	48 89 d8             	mov    rax,rbx
  aa4e11:	48 83 c0 18          	add    rax,0x18
  aa4e15:	66 0f ef c0          	pxor   xmm0,xmm0
  aa4e19:	f3 0f 7f 83 58 02 00 	movdqu XMMWORD PTR [rbx+0x258],xmm0
  aa4e20:	00 
  aa4e21:	f3 0f 7f 83 48 02 00 	movdqu XMMWORD PTR [rbx+0x248],xmm0
  aa4e28:	00 
  aa4e29:	f3 0f 7f 83 38 02 00 	movdqu XMMWORD PTR [rbx+0x238],xmm0
--
  aa51ba:	f3 41 0f 7f 46 28    	movdqu XMMWORD PTR [r14+0x28],xmm0
  aa51c0:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
  aa51c6:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
  aa51cc:	f3 41 0f 7f 46 58    	movdqu XMMWORD PTR [r14+0x58],xmm0
  aa51d2:	49 83 66 68 00       	and    QWORD PTR [r14+0x68],0x0
  aa51d7:	48 89 ef             	mov    rdi,rbp
  aa51da:	e8 23 4c d3 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  aa51df:	49 89 6f 30          	mov    QWORD PTR [r15+0x30],rbp
  aa51e3:	49 8b 7f 38          	mov    rdi,QWORD PTR [r15+0x38]
  aa51e7:	4d 89 77 38          	mov    QWORD PTR [r15+0x38],r14
  aa51eb:	e8 96 92 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aa51f0:	31 ff                	xor    edi,edi
  aa51f2:	e8 8f 92 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  aa51f7:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
  aa51fe:	00 
--
  ab0c92:	74 05                	je     ab0c99 <JNI_OnUnload@@Base+0x38566>
  ab0c94:	f0 48 ff 45 08       	lock inc QWORD PTR [rbp+0x8]
  ab0c99:	31 c0                	xor    eax,eax
  ab0c9b:	41 88 85 90 00 00 00 	mov    BYTE PTR [r13+0x90],al
  ab0ca2:	41 88 85 c0 00 00 00 	mov    BYTE PTR [r13+0xc0],al
  ab0ca9:	49 8d bd c8 00 00 00 	lea    rdi,[r13+0xc8]
  ab0cb0:	e8 4d 91 d2 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ab0cb5:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
  ab0cba:	31 c0                	xor    eax,eax
  ab0cbc:	41 88 85 20 01 00 00 	mov    BYTE PTR [r13+0x120],al
  ab0cc3:	49 c7 85 28 01 00 00 	mov    QWORD PTR [r13+0x128],0x927c0
  ab0cca:	c0 27 09 00 
  ab0cce:	41 88 85 30 01 00 00 	mov    BYTE PTR [r13+0x130],al
  ab0cd5:	4d 89 a5 38 01 00 00 	mov    QWORD PTR [r13+0x138],r12
  ab0cdc:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
--
  ab4cbb:	48 89 fb             	mov    rbx,rdi
  ab4cbe:	e8 e7 ff ff ff       	call   ab4caa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c4a>
  ab4cc3:	48 89 df             	mov    rdi,rbx
  ab4cc6:	5b                   	pop    rbx
  ab4cc7:	e9 54 92 d3 00       	jmp    17edf20 <_ZdlPv@plt>
  ab4ccc:	48 83 c7 18          	add    rdi,0x18
  ab4cd0:	e9 91 51 d2 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ab4cd5:	cc                   	int3
  ab4cd6:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
  ab4cda:	80 b8 18 0b 00 00 00 	cmp    BYTE PTR [rax+0xb18],0x0
  ab4ce1:	74 09                	je     ab4cec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c8c>
  ab4ce3:	48 83 c7 08          	add    rdi,0x8
  ab4ce7:	e9 42 fe ff ff       	jmp    ab4b2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ace>
  ab4cec:	50                   	push   rax
  ab4ced:	e8 cd 52 fc ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
--
  ab767f:	48 85 ff             	test   rdi,rdi
  ab7682:	74 05                	je     ab7689 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4629>
  ab7684:	e8 97 68 d3 00       	call   17edf20 <_ZdlPv@plt>
  ab7689:	48 8d bb 38 02 00 00 	lea    rdi,[rbx+0x238]
  ab7690:	e8 79 00 00 00       	call   ab770e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ae>
  ab7695:	48 8d bb e0 01 00 00 	lea    rdi,[rbx+0x1e0]
  ab769c:	e8 c5 27 d2 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ab76a1:	48 8d bb 88 01 00 00 	lea    rdi,[rbx+0x188]
  ab76a8:	e8 b9 27 d2 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ab76ad:	48 8d bb 30 01 00 00 	lea    rdi,[rbx+0x130]
  ab76b4:	e8 ad 27 d2 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ab76b9:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
  ab76c0:	e8 a1 27 d2 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ab76c5:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  ab76cc:	e8 95 27 d2 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ab76d1:	48 83 c3 28          	add    rbx,0x28
  ab76d5:	48 89 df             	mov    rdi,rbx
  ab76d8:	5b                   	pop    rbx
  ab76d9:	e9 88 27 d2 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ab76de:	48 85 ff             	test   rdi,rdi
  ab76e1:	74 2a                	je     ab770d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x46ad>
  ab76e3:	41 56                	push   r14
  ab76e5:	53                   	push   rbx
  ab76e6:	50                   	push   rax
  ab76e7:	48 89 fb             	mov    rbx,rdi
  ab76ea:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
  ab76ed:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
--
  abbc10:	eb 04                	jmp    abbc16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bb6>
  abbc12:	eb 02                	jmp    abbc16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bb6>
  abbc14:	eb 00                	jmp    abbc16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bb6>
  abbc16:	48 89 c7             	mov    rdi,rax
  abbc19:	e8 87 de fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  abbc1e:	50                   	push   rax
  abbc1f:	e8 de e1 d1 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  abbc24:	58                   	pop    rax
  abbc25:	c3                   	ret
  abbc26:	48 89 c7             	mov    rdi,rax
  abbc29:	e8 77 de fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  abbc2e:	49 89 f0             	mov    r8,rsi
  abbc31:	f6 06 01             	test   BYTE PTR [rsi],0x1
  abbc34:	74 06                	je     abbc3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bdc>
  abbc36:	4d 8b 40 10          	mov    r8,QWORD PTR [r8+0x10]
--
  abd1f8:	e9 23 0d d3 00       	jmp    17edf20 <_ZdlPv@plt>
  abd1fd:	5b                   	pop    rbx
  abd1fe:	41 5e                	pop    r14
  abd200:	c3                   	ret
  abd201:	cc                   	int3
  abd202:	50                   	push   rax
  abd203:	e8 fa cb d1 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  abd208:	58                   	pop    rax
  abd209:	c3                   	ret
  abd20a:	48 89 c7             	mov    rdi,rax
  abd20d:	e8 93 c8 fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  abd212:	53                   	push   rbx
  abd213:	48 89 fb             	mov    rbx,rdi
  abd216:	48 8d 05 03 1d d4 00 	lea    rax,[rip+0xd41d03]        # 17fef20 <_ZTIN4asio22service_already_existsE@@Base+0x708>
  abd21d:	48 89 07             	mov    QWORD PTR [rdi],rax
  abd220:	48 81 c7 08 01 00 00 	add    rdi,0x108
  abd227:	e8 3a cc d1 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  abd22c:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
  abd233:	e8 2e cc d1 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  abd238:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
  abd23f:	e8 02 45 d0 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  abd244:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  abd24b:	e8 40 0c d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  abd250:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  abd254:	e8 37 0c d3 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  abd259:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
  abd25d:	e8 aa 01 00 00       	call   abd40c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa3ac>
--
  ac22de:	e8 b1 cd 09 00       	call   b5f094 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac034>
  ac22e3:	49 83 a6 b8 00 00 00 	and    QWORD PTR [r14+0xb8],0x0
  ac22ea:	00 
  ac22eb:	49 83 a6 c8 00 00 00 	and    QWORD PTR [r14+0xc8],0x0
  ac22f2:	00 
  ac22f3:	49 8d be d8 00 00 00 	lea    rdi,[r14+0xd8]
  ac22fa:	e8 03 7b d1 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ac22ff:	4c 89 f3             	mov    rbx,r14
  ac2302:	48 83 c3 18          	add    rbx,0x18
  ac2306:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  ac230d:	00 
  ac230e:	e8 51 d3 09 00       	call   b5f664 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac604>
  ac2313:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
  ac231a:	00 
  ac231b:	e8 44 d3 09 00       	call   b5f664 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac604>
--
  ac3706:	4d 8d b7 98 00 00 00 	lea    r14,[r15+0x98]
  ac370d:	4d 89 fd             	mov    r13,r15
  ac3710:	49 81 c5 b0 00 00 00 	add    r13,0xb0
  ac3717:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  ac371c:	e8 49 68 fb ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ac3721:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  ac3726:	e8 3b 67 d1 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ac372b:	4c 89 ef             	mov    rdi,r13
  ac372e:	e8 1d a9 d2 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  ac3733:	4c 89 f7             	mov    rdi,r14
  ac3736:	e8 ad 7e fb ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  ac373b:	48 89 df             	mov    rdi,rbx
  ac373e:	e8 0d a9 d2 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  ac3743:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
  ac3748:	e8 67 02 00 00       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
--
  ac3aff:	48 89 df             	mov    rdi,rbx
  ac3b02:	5b                   	pop    rbx
  ac3b03:	e9 18 a4 d2 00       	jmp    17edf20 <_ZdlPv@plt>
  ac3b08:	53                   	push   rbx
  ac3b09:	48 89 fb             	mov    rbx,rdi
  ac3b0c:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
  ac3b13:	e8 4e 63 d1 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ac3b18:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
  ac3b1f:	e8 2c a5 d2 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  ac3b24:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
  ac3b2b:	e8 b8 7a fb ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  ac3b30:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  ac3b34:	e8 17 a5 d2 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  ac3b39:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  ac3b3d:	e8 72 fe ff ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
--
  ac4be1:	c6 05 58 eb f1 00 01 	mov    BYTE PTR [rip+0xf1eb58],0x1        # 19e3740 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x170>
  ac4be8:	48 8d 3d 39 52 fb ff 	lea    rdi,[rip+0xfffffffffffb5239]        # a79e28 <JNI_OnUnload@@Base+0x16f5>
  ac4bef:	48 8d 35 1a f1 f1 00 	lea    rsi,[rip+0xf1f11a]        # 19e3d10 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x740>
  ac4bf6:	48 8d 15 03 f4 d2 00 	lea    rdx,[rip+0xd2f403]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  ac4bfd:	e9 5e 92 d2 00       	jmp    17ede60 <__cxa_atexit@plt>
  ac4c02:	50                   	push   rax
  ac4c03:	e8 fa 51 d1 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ac4c08:	58                   	pop    rax
  ac4c09:	c3                   	ret
  ac4c0a:	48 89 c7             	mov    rdi,rax
  ac4c0d:	e8 93 4e fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac4c12:	48 8b 05 ff f0 f1 00 	mov    rax,QWORD PTR [rip+0xf1f0ff]        # 19e3d18 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x748>
  ac4c19:	48 85 c0             	test   rax,rax
  ac4c1c:	74 01                	je     ac4c1f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11bbf>
  ac4c1e:	c3                   	ret
--
  ac4ed9:	0f b6 74 24 11       	movzx  esi,BYTE PTR [rsp+0x11]
  ac4ede:	8b 7c 24 10          	mov    edi,DWORD PTR [rsp+0x10]
  ac4ee2:	e8 df fc d0 00       	call   17d4bc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9e7>
  ac4ee7:	4c 89 f7             	mov    rdi,r14
  ac4eea:	e8 1d 05 d1 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
  ac4eef:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
  ac4ef3:	e8 6e 4f d1 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ac4ef8:	48 89 df             	mov    rdi,rbx
  ac4efb:	e8 4a 0e d1 00       	call   17d5d4a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1b6b>
  ac4f00:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  ac4f04:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ac4f0b:	00 00 
  ac4f0d:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  ac4f12:	75 0e                	jne    ac4f22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11ec2>
  ac4f14:	48 83 c4 20          	add    rsp,0x20
--
  ac5c69:	48 8d 3d b8 41 fb ff 	lea    rdi,[rip+0xfffffffffffb41b8]        # a79e28 <JNI_OnUnload@@Base+0x16f5>
  ac5c70:	48 8d 35 b9 e0 f1 00 	lea    rsi,[rip+0xf1e0b9]        # 19e3d30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x760>
  ac5c77:	48 8d 15 82 e3 d2 00 	lea    rdx,[rip+0xd2e382]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
  ac5c7e:	e9 dd 81 d2 00       	jmp    17ede60 <__cxa_atexit@plt>
  ac5c83:	cc                   	int3
  ac5c84:	50                   	push   rax
  ac5c85:	e8 78 41 d1 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ac5c8a:	58                   	pop    rax
  ac5c8b:	c3                   	ret
  ac5c8c:	48 89 c7             	mov    rdi,rax
  ac5c8f:	e8 11 3e fb ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ac5c94:	48 8b 05 9d e0 f1 00 	mov    rax,QWORD PTR [rip+0xf1e09d]        # 19e3d38 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x768>
  ac5c9b:	48 85 c0             	test   rax,rax
  ac5c9e:	74 01                	je     ac5ca1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12c41>
  ac5ca0:	c3                   	ret
--
  ac5f19:	0f b6 74 24 11       	movzx  esi,BYTE PTR [rsp+0x11]
  ac5f1e:	8b 7c 24 10          	mov    edi,DWORD PTR [rsp+0x10]
  ac5f22:	e8 9f ec d0 00       	call   17d4bc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x9e7>
  ac5f27:	4c 89 f7             	mov    rdi,r14
  ac5f2a:	e8 dd f4 d0 00       	call   17d540c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x122d>
  ac5f2f:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
  ac5f33:	e8 2e 3f d1 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ac5f38:	48 89 df             	mov    rdi,rbx
  ac5f3b:	e8 0a fe d0 00       	call   17d5d4a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1b6b>
  ac5f40:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  ac5f44:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  ac5f4b:	00 00 
  ac5f4d:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  ac5f52:	75 0e                	jne    ac5f62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12f02>
  ac5f54:	48 83 c4 20          	add    rsp,0x20
--
  acfebe:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0
  acfec2:	49 8d 87 98 00 00 00 	lea    rax,[r15+0x98]
  acfec9:	f3 41 0f 7f 87 98 00 	movdqu XMMWORD PTR [r15+0x98],xmm0
  acfed0:	00 00 
  acfed2:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
  acfed9:	49 8d bf a8 00 00 00 	lea    rdi,[r15+0xa8]
  acfee0:	e8 1d 9f d0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  acfee5:	41 c6 87 00 01 00 00 	mov    BYTE PTR [r15+0x100],0x1
  acfeec:	01 
  acfeed:	6a 20                	push   0x20
  acfeef:	5f                   	pop    rdi
  acfef0:	e8 0b e0 d1 00       	call   17edf00 <_Znwm@plt>
  acfef5:	49 89 c4             	mov    r12,rax
  acfef8:	66 0f ef c0          	pxor   xmm0,xmm0
  acfefc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
--
  ad21e2:	00 
  ad21e3:	e8 78 bf d1 00       	call   17ee160 <_ZNSt6__ndk16chrono12steady_clock3nowEv@plt>
  ad21e8:	49 89 84 24 08 02 00 	mov    QWORD PTR [r12+0x208],rax
  ad21ef:	00 
  ad21f0:	4c 89 e7             	mov    rdi,r12
  ad21f3:	48 81 c7 10 02 00 00 	add    rdi,0x210
  ad21fa:	e8 03 7c d0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ad21ff:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
  ad2203:	4d 89 66 10          	mov    QWORD PTR [r14+0x10],r12
  ad2207:	31 ff                	xor    edi,edi
  ad2209:	e8 0e c2 fc ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  ad220e:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  ad2213:	48 8b 68 20          	mov    rbp,QWORD PTR [rax+0x20]
  ad2217:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
  ad221c:	4c 8b b8 10 01 00 00 	mov    r15,QWORD PTR [rax+0x110]
--
  ad2dbb:	00 
  ad2dbc:	66 0f ef c0          	pxor   xmm0,xmm0
  ad2dc0:	66 41 0f 7f 84 24 60 	movdqa XMMWORD PTR [r12+0x360],xmm0
  ad2dc7:	03 00 00 
  ad2dca:	f3 41 0f 7f 84 24 69 	movdqu XMMWORD PTR [r12+0x369],xmm0
  ad2dd1:	03 00 00 
  ad2dd4:	e8 29 70 d0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ad2dd9:	49 8d 5c 24 20       	lea    rbx,[r12+0x20]
  ad2dde:	4c 89 e7             	mov    rdi,r12
  ad2de1:	48 81 c7 d8 03 00 00 	add    rdi,0x3d8
  ad2de8:	e8 43 76 00 00       	call   ada430 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x273d0>
  ad2ded:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
  ad2df4:	00 
  ad2df5:	e8 8e 26 00 00       	call   ad5488 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22428>
  ad2dfa:	48 8d bc 24 40 09 00 	lea    rdi,[rsp+0x940]
--
  ad31ba:	66 0f 7f 84 24 70 04 	movdqa XMMWORD PTR [rsp+0x470],xmm0
  ad31c1:	00 00 
  ad31c3:	48 8d 05 a6 ad da 00 	lea    rax,[rip+0xdaada6]        # 187df70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3a658>
  ad31ca:	49 89 04 24          	mov    QWORD PTR [r12],rax
  ad31ce:	49 8d 5c 24 08       	lea    rbx,[r12+0x8]
  ad31d3:	48 89 df             	mov    rdi,rbx
  ad31d6:	e8 27 6c d0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ad31db:	41 89 6c 24 60       	mov    DWORD PTR [r12+0x60],ebp
  ad31e0:	49 8d 74 24 70       	lea    rsi,[r12+0x70]
  ad31e5:	48 8b 84 24 70 07 00 	mov    rax,QWORD PTR [rsp+0x770]
  ad31ec:	00 
  ad31ed:	48 85 c0             	test   rax,rax
  ad31f0:	48 89 5c 24 60       	mov    QWORD PTR [rsp+0x60],rbx
  ad31f5:	48 89 74 24 70       	mov    QWORD PTR [rsp+0x70],rsi
  ad31fa:	74 17                	je     ad3213 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x201b3>
--
  ad368e:	00 00 00 
  ad3691:	49 83 a4 24 c8 00 00 	and    QWORD PTR [r12+0xc8],0x0
  ad3698:	00 00 
  ad369a:	4d 8d bc 24 d0 00 00 	lea    r15,[r12+0xd0]
  ad36a1:	00 
  ad36a2:	4c 89 ff             	mov    rdi,r15
  ad36a5:	e8 58 67 d0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ad36aa:	4c 89 f3             	mov    rbx,r14
  ad36ad:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
  ad36b2:	40 88 ac 24 80 00 00 	mov    BYTE PTR [rsp+0x80],bpl
  ad36b9:	00 
  ad36ba:	49 8d 84 24 a8 00 00 	lea    rax,[r12+0xa8]
  ad36c1:	00 
  ad36c2:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  ad36c9:	00 
--
  ad4685:	4d 8d ae 38 01 00 00 	lea    r13,[r14+0x138]
  ad468c:	66 0f ef c0          	pxor   xmm0,xmm0
  ad4690:	66 41 0f 7f 46 60    	movdqa XMMWORD PTR [r14+0x60],xmm0
  ad4696:	66 41 0f 7f 46 70    	movdqa XMMWORD PTR [r14+0x70],xmm0
  ad469c:	f3 41 0f 7f 46 7c    	movdqu XMMWORD PTR [r14+0x7c],xmm0
  ad46a2:	4c 89 ef             	mov    rdi,r13
  ad46a5:	e8 58 57 d0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ad46aa:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
  ad46af:	48 85 ed             	test   rbp,rbp
  ad46b2:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12
  ad46b7:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
  ad46bc:	74 4a                	je     ad4708 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x216a8>
  ad46be:	4c 8d 84 24 90 06 00 	lea    r8,[rsp+0x690]
  ad46c5:	00 
  ad46c6:	4d 89 30             	mov    QWORD PTR [r8],r14
--
  ad4c1d:	00 
  ad4c1e:	e8 c5 5b d0 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  ad4c23:	4d 8d 7e 60          	lea    r15,[r14+0x60]
  ad4c27:	4d 89 f4             	mov    r12,r14
  ad4c2a:	49 81 c4 90 00 00 00 	add    r12,0x90
  ad4c31:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  ad4c36:	e8 2b 52 d0 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ad4c3b:	4c 89 e7             	mov    rdi,r12
  ad4c3e:	e8 8d f6 01 00       	call   af42d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x41270>
  ad4c43:	4c 89 ff             	mov    rdi,r15
  ad4c46:	e8 05 94 d1 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  ad4c4b:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  ad4c50:	e8 15 53 fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad4c55:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
  ad4c59:	e8 28 98 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
--
  ad4c8f:	e8 2e d9 00 00       	call   ae25c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f562>
  ad4c94:	48 89 ef             	mov    rdi,rbp
  ad4c97:	e8 62 d9 00 00       	call   ae25fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f59e>
  ad4c9c:	4c 89 ef             	mov    rdi,r13
  ad4c9f:	e8 c2 d9 00 00       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  ad4ca4:	4c 89 ff             	mov    rdi,r15
  ad4ca7:	e8 ba 51 d0 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ad4cac:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  ad4cb3:	00 
  ad4cb4:	e8 97 93 d1 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  ad4cb9:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
  ad4cc0:	00 
  ad4cc1:	e8 80 ca ce 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  ad4cc6:	eb 0d                	jmp    ad4cd5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21c75>
  ad4cc8:	e9 c5 02 00 00       	jmp    ad4f92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21f32>
--
  ad4fe3:	4c 89 e7             	mov    rdi,r12
  ad4fe6:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
  ad4fed:	e8 9e 8e d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ad4ff2:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
  ad4ff7:	e8 6e 4f fa ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  ad4ffc:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  ad5001:	e8 60 4e d0 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ad5006:	48 8d bc 24 90 06 00 	lea    rdi,[rsp+0x690]
  ad500d:	00 
  ad500e:	e8 7d 8e d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ad5013:	48 8d bc 24 f0 06 00 	lea    rdi,[rsp+0x6f0]
  ad501a:	00 
  ad501b:	e8 70 8e d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ad5020:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
  ad5027:	00 
--
  ada41b:	48 89 df             	mov    rdi,rbx
  ada41e:	e8 6d 3a d1 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  ada423:	4c 89 ef             	mov    rdi,r13
  ada426:	e8 a5 58 f9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  ada42b:	e8 80 56 d1 00       	call   17efab0 <__stack_chk_fail@plt>
  ada430:	50                   	push   rax
  ada431:	e8 cc f9 cf 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  ada436:	58                   	pop    rax
  ada437:	c3                   	ret
  ada438:	48 89 c7             	mov    rdi,rax
  ada43b:	e8 65 f6 f9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  ada440:	48 89 f7             	mov    rdi,rsi
  ada443:	48 89 d6             	mov    rsi,rdx
  ada446:	e9 bf 02 00 00       	jmp    ada70a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x276aa>
  ada44b:	cc                   	int3
--
  adb00b:	e8 95 ea f9 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  adb010:	53                   	push   rbx
  adb011:	48 89 fb             	mov    rbx,rdi
  adb014:	48 8d 05 45 62 d2 00 	lea    rax,[rip+0xd26245]        # 1801260 <_ZTIN4asio22service_already_existsE@@Base+0x2a48>
  adb01b:	48 89 07             	mov    QWORD PTR [rdi],rax
  adb01e:	48 81 c7 b8 03 00 00 	add    rdi,0x3b8
  adb025:	e8 3c ee cf 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  adb02a:	48 8d bb 60 03 00 00 	lea    rdi,[rbx+0x360]
  adb031:	e8 30 ee cf 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  adb036:	48 8d bb 40 03 00 00 	lea    rdi,[rbx+0x340]
  adb03d:	e8 68 00 00 00       	call   adb0aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2804a>
  adb042:	80 bb 38 03 00 00 00 	cmp    BYTE PTR [rbx+0x338],0x0
  adb049:	74 0c                	je     adb057 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27ff7>
  adb04b:	48 8b bb 30 03 00 00 	mov    rdi,QWORD PTR [rbx+0x330]
  adb052:	e8 2f 34 fc ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  adb057:	48 8d bb e0 02 00 00 	lea    rdi,[rbx+0x2e0]
  adb05e:	e8 07 ef f9 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
--
  ae277f:	e8 3e fe ff ff       	call   ae25c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f562>
  ae2784:	48 8d bb 60 01 00 00 	lea    rdi,[rbx+0x160]
  ae278b:	e8 6e fe ff ff       	call   ae25fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f59e>
  ae2790:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
  ae2797:	e8 ca fe ff ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  ae279c:	48 8d bb d0 00 00 00 	lea    rdi,[rbx+0xd0]
  ae27a3:	e8 be 76 cf 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  ae27a8:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
  ae27af:	e8 9c b8 d0 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  ae27b4:	48 8d bb 98 00 00 00 	lea    rdi,[rbx+0x98]
  ae27bb:	e8 86 ef cd 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  ae27c0:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
  ae27c4:	e8 6f 2d ff ff       	call   ad5538 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x224d8>
  ae27c9:	48 83 c3 08          	add    rbx,0x8
  ae27cd:	48 89 df             	mov    rdi,rbx
--
  af5235:	48 89 07             	mov    QWORD PTR [rdi],rax
  af5238:	48 8b bf a8 01 00 00 	mov    rdi,QWORD PTR [rdi+0x1a8]
  af523f:	e8 42 92 fa ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  af5244:	48 8d bb 90 01 00 00 	lea    rdi,[rbx+0x190]
  af524b:	e8 84 49 ce 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  af5250:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
  af5257:	e8 0a 4c ce 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  af525c:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
  af5263:	e8 68 f0 ff ff       	call   af42d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x41270>
  af5268:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
  af526c:	e8 df 8d cf 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  af5271:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  af5275:	e8 f0 4c f8 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  af527a:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
  af527e:	5b                   	pop    rbx
--
  b28272:	48 85 c9             	test   rcx,rcx
  b28275:	74 05                	je     b2827c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7521c>
  b28277:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  b2827c:	c3                   	ret
  b2827d:	cc                   	int3
  b2827e:	50                   	push   rax
  b2827f:	e8 7e 1b cb 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b28284:	58                   	pop    rax
  b28285:	c3                   	ret
  b28286:	48 89 c7             	mov    rdi,rax
  b28289:	e8 17 18 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b2828e:	50                   	push   rax
  b2828f:	e8 6e 1b cb 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b28294:	58                   	pop    rax
  b28295:	c3                   	ret
  b28296:	48 89 c7             	mov    rdi,rax
  b28299:	e8 07 18 f5 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b2829e:	48 8d 05 23 0d ce 00 	lea    rax,[rip+0xce0d23]        # 1808fc8 <_ZTIN4asio22service_already_existsE@@Base+0xa7b0>
  b282a5:	48 89 07             	mov    QWORD PTR [rdi],rax
  b282a8:	e9 63 5d cc 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  b282ad:	cc                   	int3
--
  b282b7:	48 89 df             	mov    rdi,rbx
  b282ba:	5b                   	pop    rbx
  b282bb:	e9 60 5c cc 00       	jmp    17edf20 <_ZdlPv@plt>
  b282c0:	53                   	push   rbx
  b282c1:	48 89 fb             	mov    rbx,rdi
  b282c4:	48 81 c7 b0 01 00 00 	add    rdi,0x1b0
  b282cb:	e8 96 1b cb 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b282d0:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
  b282d7:	e8 8a 1b cb 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b282dc:	48 8b bb 48 01 00 00 	mov    rdi,QWORD PTR [rbx+0x148]
  b282e3:	e8 9e 61 f7 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b282e8:	48 8d bb 28 01 00 00 	lea    rdi,[rbx+0x128]
  b282ef:	e8 4c 00 00 00       	call   b28340 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x752e0>
  b282f4:	48 8d bb e8 00 00 00 	lea    rdi,[rbx+0xe8]
  b282fb:	e8 04 c6 fd ff       	call   b04904 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x518a4>
  b28300:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
  b28307:	e8 44 5d cc 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
--
  b3d4ec:	49 8d be 60 14 00 00 	lea    rdi,[r14+0x1460]
  b3d4f3:	0f 57 c0             	xorps  xmm0,xmm0
  b3d4f6:	41 0f 11 86 50 14 00 	movups XMMWORD PTR [r14+0x1450],xmm0
  b3d4fd:	00 
  b3d4fe:	41 0f 11 86 40 14 00 	movups XMMWORD PTR [r14+0x1440],xmm0
  b3d505:	00 
  b3d506:	e8 f7 c8 c9 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b3d50b:	4d 8d 6e 18          	lea    r13,[r14+0x18]
  b3d50f:	4c 89 f7             	mov    rdi,r14
  b3d512:	48 81 c7 b8 14 00 00 	add    rdi,0x14b8
  b3d519:	e8 00 e7 f7 ff       	call   abbc1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bbe>
  b3d51e:	0f 57 c0             	xorps  xmm0,xmm0
  b3d521:	41 0f 11 86 20 15 00 	movups XMMWORD PTR [r14+0x1520],xmm0
  b3d528:	00 
  b3d529:	41 0f 11 86 10 15 00 	movups XMMWORD PTR [r14+0x1510],xmm0
--
  b3f165:	48 89 fb             	mov    rbx,rdi
  b3f168:	48 8d 05 c9 c0 cc 00 	lea    rax,[rip+0xccc0c9]        # 180b238 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xef8>
  b3f16f:	48 89 07             	mov    QWORD PTR [rdi],rax
  b3f172:	48 81 c7 f8 14 00 00 	add    rdi,0x14f8
  b3f179:	e8 d2 ee ca 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b3f17e:	48 8d bb a0 14 00 00 	lea    rdi,[rbx+0x14a0]
  b3f185:	e8 dc ac c9 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b3f18a:	48 8d bb 48 14 00 00 	lea    rdi,[rbx+0x1448]
  b3f191:	e8 d0 ac c9 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b3f196:	48 8b bb 40 14 00 00 	mov    rdi,QWORD PTR [rbx+0x1440]
  b3f19d:	e8 e4 f2 f5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b3f1a2:	48 8b bb 30 14 00 00 	mov    rdi,QWORD PTR [rbx+0x1430]
  b3f1a9:	e8 d8 f2 f5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b3f1ae:	48 8b bb 20 14 00 00 	mov    rdi,QWORD PTR [rbx+0x1420]
  b3f1b5:	e8 cc f2 f5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b3f1ba:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
  b3f1be:	e8 83 25 c8 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
--
  b482b2:	e8 4d e4 b1 00       	call   1666704 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a870>
  b482b7:	c6 43 08 00          	mov    BYTE PTR [rbx+0x8],0x0
  b482bb:	5b                   	pop    rbx
  b482bc:	c3                   	ret
  b482bd:	cc                   	int3
  b482be:	50                   	push   rax
  b482bf:	e8 3e 1b c9 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b482c4:	58                   	pop    rax
  b482c5:	c3                   	ret
  b482c6:	48 89 c7             	mov    rdi,rax
  b482c9:	e8 d7 17 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b482ce:	53                   	push   rbx
  b482cf:	48 81 ec a0 00 00 00 	sub    rsp,0xa0
  b482d6:	48 89 f3             	mov    rbx,rsi
  b482d9:	48 89 fe             	mov    rsi,rdi
--
  b48655:	e8 76 76 f2 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b4865a:	e8 51 74 ca 00       	call   17efab0 <__stack_chk_fail@plt>
  b4865f:	cc                   	int3
  b48660:	53                   	push   rbx
  b48661:	48 89 fb             	mov    rbx,rdi
  b48664:	48 81 c7 a0 00 00 00 	add    rdi,0xa0
  b4866b:	e8 f6 17 c9 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b48670:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
  b48677:	e8 58 15 c9 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b4867c:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
  b48680:	e8 0b 58 ca 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  b48685:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
  b48689:	e8 60 fa ff ff       	call   b480ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9508e>
  b4868e:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  b48692:	e8 7d fa ff ff       	call   b48114 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x950b4>
--
  b4892f:	41 5e                	pop    r14
  b48931:	41 5f                	pop    r15
  b48933:	c3                   	ret
  b48934:	e8 77 71 ca 00       	call   17efab0 <__stack_chk_fail@plt>
  b48939:	cc                   	int3
  b4893a:	50                   	push   rax
  b4893b:	e8 c2 14 c9 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b48940:	58                   	pop    rax
  b48941:	c3                   	ret
  b48942:	48 89 c7             	mov    rdi,rax
  b48945:	e8 5b 11 f3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b4894a:	41 56                	push   r14
  b4894c:	53                   	push   rbx
  b4894d:	50                   	push   rax
  b4894e:	48 89 f3             	mov    rbx,rsi
--
  b4898d:	cc                   	int3
  b4898e:	53                   	push   rbx
  b4898f:	48 89 fb             	mov    rbx,rdi
  b48992:	48 8d 05 ff 34 cc 00 	lea    rax,[rip+0xcc34ff]        # 180be98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x1b58>
  b48999:	48 89 07             	mov    QWORD PTR [rdi],rax
  b4899c:	48 81 c7 a8 00 00 00 	add    rdi,0xa8
  b489a3:	e8 be 14 c9 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b489a8:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
  b489af:	e8 c2 5d f5 ff       	call   a9e776 <JNI_OnUnload@@Base+0x26043>
  b489b4:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]
  b489bb:	e8 b6 5d f5 ff       	call   a9e776 <JNI_OnUnload@@Base+0x26043>
  b489c0:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
  b489c4:	e8 87 56 ca 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b489c9:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  b489cd:	e8 98 15 f3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
--
  b5f0d3:	c3                   	ret
  b5f0d4:	48 89 c7             	mov    rdi,rax
  b5f0d7:	e8 c9 a9 f1 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b5f0dc:	53                   	push   rbx
  b5f0dd:	48 89 fb             	mov    rbx,rdi
  b5f0e0:	48 81 c7 c0 00 00 00 	add    rdi,0xc0
  b5f0e7:	e8 7a ad c7 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b5f0ec:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
  b5f0f3:	e8 a2 20 f4 ff       	call   aa119a <JNI_OnUnload@@Base+0x28a67>
  b5f0f8:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  b5f0ff:	e8 60 05 00 00       	call   b5f664 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac604>
  b5f104:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
  b5f108:	e8 57 05 00 00       	call   b5f664 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac604>
  b5f10d:	48 83 c3 08          	add    rbx,0x8
  b5f111:	48 89 df             	mov    rdi,rbx
--
  b62f23:	48 8d 85 d0 01 00 00 	lea    rax,[rbp+0x1d0]
  b62f2a:	66 0f 11 85 d0 01 00 	movupd XMMWORD PTR [rbp+0x1d0],xmm0
  b62f31:	00 
  b62f32:	48 89 85 c8 01 00 00 	mov    QWORD PTR [rbp+0x1c8],rax
  b62f39:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
  b62f40:	00 
  b62f41:	e8 b0 27 00 00       	call   b656f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2696>
  b62f46:	66 0f 28 84 24 a0 00 	movapd xmm0,XMMWORD PTR [rsp+0xa0]
  b62f4d:	00 00 
  b62f4f:	66 0f 11 85 e0 01 00 	movupd XMMWORD PTR [rbp+0x1e0],xmm0
  b62f56:	00 
  b62f57:	31 ff                	xor    edi,edi
  b62f59:	e8 28 b5 f3 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b62f5e:	48 8d bd f0 01 00 00 	lea    rdi,[rbp+0x1f0]
  b62f65:	e8 c0 27 00 00       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
--
  b6f418:	0f 11 83 00 03 00 00 	movups XMMWORD PTR [rbx+0x300],xmm0
  b6f41f:	0f 11 83 f0 02 00 00 	movups XMMWORD PTR [rbx+0x2f0],xmm0
  b6f426:	48 83 a3 10 03 00 00 	and    QWORD PTR [rbx+0x310],0x0
  b6f42d:	00 
  b6f42e:	4c 8d a3 18 03 00 00 	lea    r12,[rbx+0x318]
  b6f435:	4c 89 e7             	mov    rdi,r12
  b6f438:	e8 c5 a9 c6 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b6f43d:	48 89 d8             	mov    rax,rbx
  b6f440:	48 81 c3 38 01 00 00 	add    rbx,0x138
  b6f447:	0f 57 c0             	xorps  xmm0,xmm0
  b6f44a:	0f 11 80 80 03 00 00 	movups XMMWORD PTR [rax+0x380],xmm0
  b6f451:	0f 11 80 70 03 00 00 	movups XMMWORD PTR [rax+0x370],xmm0
  b6f458:	c7 80 90 03 00 00 00 	mov    DWORD PTR [rax+0x390],0x3f800000
  b6f45f:	00 80 3f 
  b6f462:	0f 11 80 98 03 00 00 	movups XMMWORD PTR [rax+0x398],xmm0
--
  b6f6b6:	41 0f 11 86 30 03 00 	movups XMMWORD PTR [r14+0x330],xmm0
  b6f6bd:	00 
  b6f6be:	49 83 a6 40 03 00 00 	and    QWORD PTR [r14+0x340],0x0
  b6f6c5:	00 
  b6f6c6:	49 8d be 48 03 00 00 	lea    rdi,[r14+0x348]
  b6f6cd:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
  b6f6d2:	e8 2b a7 c6 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b6f6d7:	49 8d ae a0 03 00 00 	lea    rbp,[r14+0x3a0]
  b6f6de:	48 89 ef             	mov    rdi,rbp
  b6f6e1:	e8 1c a7 c6 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b6f6e6:	4c 8b 7c 24 50       	mov    r15,QWORD PTR [rsp+0x50]
  b6f6eb:	4d 8d a6 48 04 00 00 	lea    r12,[r14+0x448]
  b6f6f2:	0f 57 c0             	xorps  xmm0,xmm0
  b6f6f5:	41 0f 11 86 08 04 00 	movups XMMWORD PTR [r14+0x408],xmm0
  b6f6fc:	00 
  b6f6fd:	41 0f 11 86 f8 03 00 	movups XMMWORD PTR [r14+0x3f8],xmm0
  b6f704:	00 
  b6f705:	41 83 a6 18 04 00 00 	and    DWORD PTR [r14+0x418],0x0
--
  b6f728:	e8 ed 4d ff ff       	call   b6451a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb14ba>
  b6f72d:	49 83 a6 08 05 00 00 	and    QWORD PTR [r14+0x508],0x0
  b6f734:	00 
  b6f735:	66 41 83 a6 10 05 00 	and    WORD PTR [r14+0x510],0x0
  b6f73c:	00 00 
  b6f73e:	49 8d be 18 05 00 00 	lea    rdi,[r14+0x518]
  b6f745:	e8 ac 5f ff ff       	call   b656f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2696>
  b6f74a:	49 89 9e 28 05 00 00 	mov    QWORD PTR [r14+0x528],rbx
  b6f751:	49 8d 86 30 05 00 00 	lea    rax,[r14+0x530]
  b6f758:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  b6f75d:	0f 57 c0             	xorps  xmm0,xmm0
  b6f760:	41 0f 11 86 30 05 00 	movups XMMWORD PTR [r14+0x530],xmm0
  b6f767:	00 
  b6f768:	41 0f 11 86 40 05 00 	movups XMMWORD PTR [r14+0x540],xmm0
  b6f76f:	00 
--
  b70166:	4d 8d ae f8 03 00 00 	lea    r13,[r14+0x3f8]
  b7016d:	4c 89 e7             	mov    rdi,r12
  b70170:	e8 a1 26 ae 00       	call   1652816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6982>
  b70175:	4c 89 ef             	mov    rdi,r13
  b70178:	e8 ab b5 f0 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  b7017d:	48 89 ef             	mov    rdi,rbp
  b70180:	e8 e1 9c c6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b70185:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b7018a:	e8 d7 9c c6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b7018f:	4c 89 ff             	mov    rdi,r15
  b70192:	e8 b9 de c7 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b70197:	49 8b be 10 03 00 00 	mov    rdi,QWORD PTR [r14+0x310]
  b7019e:	e8 17 e4 f6 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
  b701a3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  b701a8:	e8 cd b6 84 00       	call   13bb87a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x200dfe>
  b701ad:	49 8b be d8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1d8]
  b701b4:	e8 cd e2 f2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
--
  b702ed:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
  b702f2:	e8 05 f3 f2 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
  b702f7:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
  b702fc:	e8 dd dc 00 00       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  b70301:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
  b70308:	00 
  b70309:	e8 58 9b c6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b7030e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b70313:	e8 38 dd c7 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b70318:	49 8b be e8 02 00 00 	mov    rdi,QWORD PTR [r14+0x2e8]
  b7031f:	e8 62 e1 f2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b70324:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
  b7032b:	00 
  b7032c:	e8 b9 32 ff ff       	call   b635ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb058a>
  b70331:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
--
  b705a0:	e8 e1 de f2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b705a5:	4c 89 ff             	mov    rdi,r15
  b705a8:	e8 69 22 ae 00       	call   1652816 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6982>
  b705ad:	48 8d bb f8 03 00 00 	lea    rdi,[rbx+0x3f8]
  b705b4:	e8 6f b1 f0 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
  b705b9:	48 8d bb a0 03 00 00 	lea    rdi,[rbx+0x3a0]
  b705c0:	e8 a1 98 c6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b705c5:	48 8d bb 48 03 00 00 	lea    rdi,[rbx+0x348]
  b705cc:	e8 95 98 c6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b705d1:	48 8d bb 20 03 00 00 	lea    rdi,[rbx+0x320]
  b705d8:	e8 73 da c7 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b705dd:	48 8b bb 10 03 00 00 	mov    rdi,QWORD PTR [rbx+0x310]
  b705e4:	e8 d1 df f6 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
  b705e9:	48 8d bb 90 02 00 00 	lea    rdi,[rbx+0x290]
  b705f0:	e8 85 b2 84 00       	call   13bb87a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x200dfe>
  b705f5:	48 8b bb d8 01 00 00 	mov    rdi,QWORD PTR [rbx+0x1d8]
  b705fc:	e8 85 de f2 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
--
  b835e9:	e8 0e c0 f1 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
  b835ee:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
  b835f5:	e8 02 c0 f1 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
  b835fa:	48 8d bb 70 03 00 00 	lea    rdi,[rbx+0x370]
  b83601:	e8 d8 a9 ff ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  b83606:	48 8d bb 18 03 00 00 	lea    rdi,[rbx+0x318]
  b8360d:	e8 54 68 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b83612:	48 8d bb f0 02 00 00 	lea    rdi,[rbx+0x2f0]
  b83619:	e8 32 aa c6 00       	call   17ee050 <_ZNSt6__ndk15mutexD1Ev@plt>
  b8361e:	48 8b bb e8 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2e8]
  b83625:	e8 5c ae f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8362a:	48 8d bb a0 01 00 00 	lea    rdi,[rbx+0x1a0]
  b83631:	e8 b4 ff fd ff       	call   b635ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb058a>
  b83636:	4c 89 ff             	mov    rdi,r15
  b83639:	e8 66 cd fe ff       	call   b703a4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbd344>
--
  b862b6:	e8 09 34 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
  b862bb:	48 8d bb 38 02 00 00 	lea    rdi,[rbx+0x238]
  b862c2:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
  b862c7:	e8 f8 33 00 00       	call   b896c4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6664>
  b862cc:	48 8d bb 90 02 00 00 	lea    rdi,[rbx+0x290]
  b862d3:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
  b862d8:	e8 25 3b c5 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b862dd:	4c 89 7c 24 30       	mov    QWORD PTR [rsp+0x30],r15
  b862e2:	48 89 ac 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rbp
  b862e9:	00 
  b862ea:	4c 89 ac 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r13
  b862f1:	00 
  b862f2:	48 8d bb e8 02 00 00 	lea    rdi,[rbx+0x2e8]
  b862f9:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
  b86300:	00 
  b86301:	e8 fc 3a c5 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b86306:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
  b8630a:	4c 8b 6b 20          	mov    r13,QWORD PTR [rbx+0x20]
  b8630e:	4c 8d 84 24 40 02 00 	lea    r8,[rsp+0x240]
  b86315:	00 
  b86316:	4d 89 38             	mov    QWORD PTR [r8],r15
  b86319:	48 8d 35 71 6d f1 ff 	lea    rsi,[rip+0xfffffffffff16d71]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
  b86320:	48 8d 0d ad 33 00 00 	lea    rcx,[rip+0x33ad]        # b896d4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6674>
  b86327:	48 8d ac 24 70 06 00 	lea    rbp,[rsp+0x670]
--
  b87cd7:	48 89 c5             	mov    rbp,rax
  b87cda:	48 8d bc 24 70 06 00 	lea    rdi,[rsp+0x670]
  b87ce1:	00 
  b87ce2:	e8 01 2b c5 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  b87ce7:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
  b87cee:	00 
  b87cef:	e8 72 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b87cf4:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
  b87cf9:	e8 68 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b87cfe:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
  b87d03:	e8 5e 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b87d08:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
  b87d0d:	e8 54 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b87d12:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
  b87d19:	00 
  b87d1a:	e8 47 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b87d1f:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
  b87d26:	00 
  b87d27:	e8 3a 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b87d2c:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
  b87d31:	e8 30 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b87d36:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
  b87d3d:	00 
  b87d3e:	e8 23 21 c5 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b87d43:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
  b87d47:	e8 20 1f 00 00       	call   b89c6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c0c>
  b87d4c:	4c 89 e7             	mov    rdi,r12
  b87d4f:	e8 80 1e c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b87d54:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  b87d59:	e8 76 1e c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b87d5e:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  b87d63:	e8 6c 1e c5 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
--
  b896b8:	48 85 c9             	test   rcx,rcx
  b896bb:	74 05                	je     b896c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6662>
  b896bd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  b896c2:	c3                   	ret
  b896c3:	cc                   	int3
  b896c4:	50                   	push   rax
  b896c5:	e8 38 07 c5 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b896ca:	58                   	pop    rax
  b896cb:	c3                   	ret
  b896cc:	48 89 c7             	mov    rdi,rax
  b896cf:	e8 d1 03 ef ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b896d4:	41 57                	push   r15
  b896d6:	41 56                	push   r14
  b896d8:	41 55                	push   r13
  b896da:	41 54                	push   r12
--
  b8ac25:	e9 32 06 fc ff       	jmp    b4b25c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x981fc>
  b8ac2a:	53                   	push   rbx
  b8ac2b:	48 89 fb             	mov    rbx,rdi
  b8ac2e:	48 8d 05 db 33 c8 00 	lea    rax,[rip+0xc833db]        # 180e010 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3cd0>
  b8ac35:	48 89 07             	mov    QWORD PTR [rdi],rax
  b8ac38:	48 81 c7 d0 02 00 00 	add    rdi,0x2d0
  b8ac3f:	e8 22 f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac44:	48 8d bb 78 02 00 00 	lea    rdi,[rbx+0x278]
  b8ac4b:	e8 16 f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac50:	48 8d bb 20 02 00 00 	lea    rdi,[rbx+0x220]
  b8ac57:	e8 0a f2 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac5c:	48 8d bb c8 01 00 00 	lea    rdi,[rbx+0x1c8]
  b8ac63:	e8 fe f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac68:	48 8d bb 70 01 00 00 	lea    rdi,[rbx+0x170]
  b8ac6f:	e8 f2 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac74:	48 8d bb 18 01 00 00 	lea    rdi,[rbx+0x118]
  b8ac7b:	e8 e6 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac80:	48 8d bb c0 00 00 00 	lea    rdi,[rbx+0xc0]
  b8ac87:	e8 da f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac8c:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  b8ac90:	e8 d1 f1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8ac95:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
  b8ac99:	e8 ce ef ff ff       	call   b89c6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6c0c>
  b8ac9e:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  b8aca2:	e8 2d ef c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b8aca7:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
  b8acab:	e8 24 ef c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b8acb0:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  b8acb4:	e8 1b ef c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
--
  b8b1df:	48 89 c3             	mov    rbx,rax
  b8b1e2:	4c 89 f7             	mov    rdi,r14
  b8b1e5:	e8 36 2d c6 00       	call   17edf20 <_ZdlPv@plt>
  b8b1ea:	48 89 df             	mov    rdi,rbx
  b8b1ed:	e8 de 4a ee ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  b8b1f2:	50                   	push   rax
  b8b1f3:	e8 0a ec c4 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  b8b1f8:	58                   	pop    rax
  b8b1f9:	c3                   	ret
  b8b1fa:	48 89 c7             	mov    rdi,rax
  b8b1fd:	e8 a3 e8 ee ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b8b202:	48 89 f8             	mov    rax,rdi
  b8b205:	48 8d 0d 44 2f c8 00 	lea    rcx,[rip+0xc82f44]        # 180e150 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3e10>
  b8b20c:	48 89 0f             	mov    QWORD PTR [rdi],rcx
  b8b20f:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
--
  b8cd26:	e8 5b 17 f1 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  b8cd2b:	e9 da 03 00 00       	jmp    b8d10a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda0aa>
  b8cd30:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  b8cd35:	4c 89 e7             	mov    rdi,r12
  b8cd38:	e8 97 ce c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b8cd3d:	4c 89 ff             	mov    rdi,r15
  b8cd40:	e8 21 d1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8cd45:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
  b8cd49:	e8 64 17 f1 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  b8cd4e:	4c 89 f7             	mov    rdi,r14
  b8cd51:	e8 ba 12 c6 00       	call   17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
  b8cd56:	4c 89 f7             	mov    rdi,r14
  b8cd59:	e8 be 16 f1 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  b8cd5e:	e9 a7 03 00 00       	jmp    b8d10a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda0aa>
  b8cd63:	eb 35                	jmp    b8cd9a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd9d3a>
--
  b8dcb8:	eb ec                	jmp    b8dca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdac46>
  b8dcba:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
  b8dcc1:	e8 0c 0f 00 00       	call   b8ebd2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdbb72>
  b8dcc6:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
  b8dcca:	e8 05 bf c4 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  b8dccf:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  b8dcd3:	e8 8e c1 c4 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  b8dcd8:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  b8dcdc:	5b                   	pop    rbx
  b8dcdd:	41 5e                	pop    r14
  b8dcdf:	41 5f                	pop    r15
  b8dce1:	e9 cc 07 f1 ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  b8dce6:	48 89 c7             	mov    rdi,rax
  b8dce9:	e8 b7 bd ee ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  b8dcee:	53                   	push   rbx
--
  bcf79e:	49 81 c7 80 01 00 00 	add    r15,0x180
  bcf7a5:	ba c0 01 00 00       	mov    edx,0x1c0
  bcf7aa:	4c 89 f7             	mov    rdi,r14
  bcf7ad:	31 f6                	xor    esi,esi
  bcf7af:	e8 dc f3 c1 00       	call   17eeb90 <memset@plt>
  bcf7b4:	4c 89 ff             	mov    rdi,r15
  bcf7b7:	e8 46 a6 c0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  bcf7bc:	4d 89 74 24 20       	mov    QWORD PTR [r12+0x20],r14
  bcf7c1:	49 8b 7c 24 28       	mov    rdi,QWORD PTR [r12+0x28]
  bcf7c6:	49 89 5c 24 28       	mov    QWORD PTR [r12+0x28],rbx
  bcf7cb:	e8 b6 ec ec ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  bcf7d0:	31 ff                	xor    edi,edi
  bcf7d2:	e8 af ec ec ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  bcf7d7:	6a 58                	push   0x58
  bcf7d9:	5f                   	pop    rdi
--
  bcfc8b:	e8 90 e2 c1 00       	call   17edf20 <_ZdlPv@plt>
  bcfc90:	4c 89 f7             	mov    rdi,r14
  bcfc93:	e8 38 00 ea ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  bcfc98:	e8 13 fe c1 00       	call   17efab0 <__stack_chk_fail@plt>
  bcfc9d:	cc                   	int3
  bcfc9e:	50                   	push   rax
  bcfc9f:	e8 5e a1 c0 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  bcfca4:	58                   	pop    rax
  bcfca5:	c3                   	ret
  bcfca6:	48 89 c7             	mov    rdi,rax
  bcfca9:	e8 f7 9d ea ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  bcfcae:	53                   	push   rbx
  bcfcaf:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  bcfcb2:	48 89 37             	mov    QWORD PTR [rdi],rsi
  bcfcb5:	48 85 db             	test   rbx,rbx
--
  bcfd57:	48 89 df             	mov    rdi,rbx
  bcfd5a:	5b                   	pop    rbx
  bcfd5b:	e9 c0 e1 c1 00       	jmp    17edf20 <_ZdlPv@plt>
  bcfd60:	53                   	push   rbx
  bcfd61:	48 8d 5f 18          	lea    rbx,[rdi+0x18]
  bcfd65:	48 81 c7 80 01 00 00 	add    rdi,0x180
  bcfd6c:	e8 f5 a0 c0 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  bcfd71:	48 89 df             	mov    rdi,rbx
  bcfd74:	5b                   	pop    rbx
  bcfd75:	e9 00 00 00 00       	jmp    bcfd7a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11cd1a>
  bcfd7a:	80 bf 60 01 00 00 00 	cmp    BYTE PTR [rdi+0x160],0x0
  bcfd81:	0f 85 5f a3 fb ff    	jne    b8a0e6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7086>
  bcfd87:	c3                   	ret
  bcfd88:	53                   	push   rbx
  bcfd89:	48 89 fb             	mov    rbx,rdi
--
  bd1ada:	00 
  bd1adb:	48 85 ff             	test   rdi,rdi
  bd1ade:	74 06                	je     bd1ae6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11ea86>
  bd1ae0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  bd1ae3:	ff 50 08             	call   QWORD PTR [rax+0x8]
  bd1ae6:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
  bd1aed:	e8 74 83 c0 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  bd1af2:	48 8d bb a8 00 00 00 	lea    rdi,[rbx+0xa8]
  bd1af9:	e8 68 83 c0 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  bd1afe:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
  bd1b05:	e8 6c 07 00 00       	call   bd2276 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11f216>
  bd1b0a:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
  bd1b0e:	48 85 f6             	test   rsi,rsi
  bd1b11:	74 14                	je     bd1b27 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x11eac7>
  bd1b13:	4c 8d 73 78          	lea    r14,[rbx+0x78]
  bd1b17:	4c 89 f7             	mov    rdi,r14
  bd1b1a:	e8 f1 2d fc ff       	call   b94910 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xe18b0>
--
  c2e4e0:	e8 ef b6 ba 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c2e4e5:	48 8b bb f0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xf0]
  c2e4ec:	e8 95 ff e6 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  c2e4f1:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]
  c2e4f8:	e8 6d ba e4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c2e4fd:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
  c2e501:	e8 60 b9 ba 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c2e506:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
  c2e50a:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
  c2e50f:	48 85 ff             	test   rdi,rdi
  c2e512:	74 06                	je     c2e51a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b4ba>
  c2e514:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  c2e517:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c2e51a:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  c2e51e:	e8 05 b9 e4 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
--
  c34cc7:	48 89 07             	mov    QWORD PTR [rdi],rax
  c34cca:	48 83 c7 60          	add    rdi,0x60
  c34cce:	e8 db 01 00 00       	call   c34eae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181e4e>
  c34cd3:	48 83 c3 08          	add    rbx,0x8
  c34cd7:	48 89 df             	mov    rdi,rbx
  c34cda:	5b                   	pop    rbx
  c34cdb:	e9 86 51 ba 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c34ce0:	53                   	push   rbx
  c34ce1:	48 89 fb             	mov    rbx,rdi
  c34ce4:	e8 d3 ff ff ff       	call   c34cbc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x181c5c>
  c34ce9:	48 89 df             	mov    rdi,rbx
  c34cec:	5b                   	pop    rbx
  c34ced:	e9 2e 92 bb 00       	jmp    17edf20 <_ZdlPv@plt>
  c34cf2:	55                   	push   rbp
  c34cf3:	41 57                	push   r15
--
  c356af:	41 88 47 08          	mov    BYTE PTR [r15+0x8],al
  c356b3:	49 8d 5f 28          	lea    rbx,[r15+0x28]
  c356b7:	0f 57 c0             	xorps  xmm0,xmm0
  c356ba:	41 0f 11 47 10       	movups XMMWORD PTR [r15+0x10],xmm0
  c356bf:	41 88 47 20          	mov    BYTE PTR [r15+0x20],al
  c356c3:	48 89 df             	mov    rdi,rbx
  c356c6:	e8 37 47 ba 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  c356cb:	4d 8d b7 80 00 00 00 	lea    r14,[r15+0x80]
  c356d2:	4c 89 f7             	mov    rdi,r14
  c356d5:	e8 28 47 ba 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  c356da:	4d 89 af d8 00 00 00 	mov    QWORD PTR [r15+0xd8],r13
  c356e1:	6a 40                	push   0x40
  c356e3:	5f                   	pop    rdi
  c356e4:	48 89 5c 24 20       	mov    QWORD PTR [rsp+0x20],rbx
  c356e9:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
  c356ee:	e8 0d 88 bb 00       	call   17edf00 <_Znwm@plt>
  c356f3:	49 89 c5             	mov    r13,rax
  c356f6:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
--
  c35aa9:	48 8d 05 e8 22 be 00 	lea    rax,[rip+0xbe22e8]        # 1817d98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xda58>
  c35ab0:	49 89 06             	mov    QWORD PTR [r14],rax
  c35ab3:	49 8d 7e 08          	lea    rdi,[r14+0x8]
  c35ab7:	e8 7e 2e f1 ff       	call   b4893a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x958da>
  c35abc:	4c 89 f7             	mov    rdi,r14
  c35abf:	48 83 c7 60          	add    rdi,0x60
  c35ac3:	e8 3a 43 ba 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  c35ac8:	48 8b 9c 24 80 00 00 	mov    rbx,QWORD PTR [rsp+0x80]
  c35acf:	00 
  c35ad0:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
  c35ad5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  c35ad8:	4c 89 30             	mov    QWORD PTR [rax],r14
  c35adb:	48 85 ff             	test   rdi,rdi
  c35ade:	0f 84 e8 02 00 00    	je     c35dcc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x182d6c>
  c35ae4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
--
  c35e77:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  c35e7c:	48 89 df             	mov    rdi,rbx
  c35e7f:	e8 c2 b8 b8 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  c35e84:	48 89 ef             	mov    rdi,rbp
  c35e87:	e8 48 3d ba 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c35e8c:	4c 89 f7             	mov    rdi,r14
  c35e8f:	e8 d2 3f ba 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c35e94:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
  c35e9b:	00 
  c35e9c:	e8 c9 40 e4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c35ea1:	eb 05                	jmp    c35ea8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x182e48>
  c35ea3:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  c35ea8:	4c 89 e7             	mov    rdi,r12
  c35eab:	e8 70 80 bb 00       	call   17edf20 <_ZdlPv@plt>
  c35eb0:	eb 05                	jmp    c35eb7 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x182e57>
--
  c36026:	e9 76 01 00 00       	jmp    c361a1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x183141>
  c3602b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
  c36030:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
  c36037:	00 
  c36038:	e8 9d 04 00 00       	call   c364da <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18347a>
  c3603d:	48 89 ef             	mov    rdi,rbp
  c36040:	e8 21 3e ba 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c36045:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  c3604a:	e8 85 3b ba 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c3604f:	4c 89 e7             	mov    rdi,r12
  c36052:	e8 91 55 e4 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  c36057:	4c 89 f7             	mov    rdi,r14
  c3605a:	e8 c1 7e bb 00       	call   17edf20 <_ZdlPv@plt>
  c3605f:	49 8d 7f 40          	lea    rdi,[r15+0x40]
  c36063:	e8 c0 3d e4 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
--
  c360d4:	49 8d bf e0 00 00 00 	lea    rdi,[r15+0xe0]
  c360db:	e8 c6 7b 00 00       	call   c3dca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18ac46>
  c360e0:	4c 89 ff             	mov    rdi,r15
  c360e3:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
  c360ea:	e8 39 3d e4 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c360ef:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  c360f4:	e8 6d 3d ba 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c360f9:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  c360fe:	e8 63 3d ba 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c36103:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
  c3610a:	00 
  c3610b:	e8 5a 3e e4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c36110:	4c 89 ff             	mov    rdi,r15
  c36113:	e8 08 7e bb 00       	call   17edf20 <_ZdlPv@plt>
  c36118:	45 31 ed             	xor    r13d,r13d
  c3611b:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
  c36122:	00 
--
  c36798:	48 8b 47 78          	mov    rax,QWORD PTR [rdi+0x78]
  c3679c:	c3                   	ret
  c3679d:	cc                   	int3
  c3679e:	53                   	push   rbx
  c3679f:	48 89 fb             	mov    rbx,rdi
  c367a2:	48 83 c7 60          	add    rdi,0x60
  c367a6:	e8 bb 36 ba 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c367ab:	48 83 c3 08          	add    rbx,0x8
  c367af:	48 89 df             	mov    rdi,rbx
  c367b2:	5b                   	pop    rbx
  c367b3:	e9 ae 36 ba 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c367b8:	53                   	push   rbx
  c367b9:	48 89 fb             	mov    rbx,rdi
  c367bc:	48 81 c7 80 00 00 00 	add    rdi,0x80
  c367c3:	e8 a2 37 e4 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  c367c8:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  c367cc:	e8 03 34 ba 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c367d1:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
  c367d5:	e8 fa 33 ba 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
--
  c3ac27:	e8 1a 6b b8 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
  c3ac2c:	48 8d 7b 70          	lea    rdi,[rbx+0x70]
  c3ac30:	e8 9f ef b9 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c3ac35:	48 83 c3 18          	add    rbx,0x18
  c3ac39:	48 89 df             	mov    rdi,rbx
  c3ac3c:	5b                   	pop    rbx
  c3ac3d:	e9 24 f2 b9 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c3ac42:	53                   	push   rbx
  c3ac43:	48 89 fb             	mov    rbx,rdi
  c3ac46:	e8 bb ff ff ff       	call   c3ac06 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x187ba6>
  c3ac4b:	48 89 df             	mov    rdi,rbx
  c3ac4e:	5b                   	pop    rbx
  c3ac4f:	e9 cc 32 bb 00       	jmp    17edf20 <_ZdlPv@plt>
  c3ac54:	41 57                	push   r15
  c3ac56:	41 56                	push   r14
--
  c3ae9f:	e8 01 ec e3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  c3aea4:	53                   	push   rbx
  c3aea5:	48 89 fb             	mov    rbx,rdi
  c3aea8:	48 8d 05 81 cf bd 00 	lea    rax,[rip+0xbdcf81]        # 1817e30 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xdaf0>
  c3aeaf:	48 89 07             	mov    QWORD PTR [rdi],rax
  c3aeb2:	48 83 c7 38          	add    rdi,0x38
  c3aeb6:	e8 ab ef b9 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c3aebb:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
  c3aebf:	e8 10 ed b9 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c3aec4:	48 83 c3 10          	add    rbx,0x10
  c3aec8:	48 89 df             	mov    rdi,rbx
  c3aecb:	5b                   	pop    rbx
  c3aecc:	e9 17 07 e4 ff       	jmp    a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
  c3aed1:	cc                   	int3
  c3aed2:	53                   	push   rbx
--
  c3dd69:	ff 50 08             	call   QWORD PTR [rax+0x8]
  c3dd6c:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
  c3dd73:	e8 2e ff ff ff       	call   c3dca6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18ac46>
  c3dd78:	48 8d bb d8 00 00 00 	lea    rdi,[rbx+0xd8]
  c3dd7f:	e8 a4 c0 e3 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c3dd84:	48 8d bb 80 00 00 00 	lea    rdi,[rbx+0x80]
  c3dd8b:	e8 d6 c0 b9 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c3dd90:	48 83 c3 28          	add    rbx,0x28
  c3dd94:	48 89 df             	mov    rdi,rbx
  c3dd97:	5b                   	pop    rbx
  c3dd98:	e9 c9 c0 b9 00       	jmp    17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c3dd9d:	cc                   	int3
  c3dd9e:	53                   	push   rbx
  c3dd9f:	48 89 fb             	mov    rbx,rdi
  c3dda2:	e8 85 ff ff ff       	call   c3dd2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18accc>
  c3dda7:	48 89 df             	mov    rdi,rbx
  c3ddaa:	5b                   	pop    rbx
  c3ddab:	e9 70 01 bb 00       	jmp    17edf20 <_ZdlPv@plt>
  c3ddb0:	41 56                	push   r14
--
  c56471:	e8 80 35 b8 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  c56476:	48 8b 84 24 d0 05 00 	mov    rax,QWORD PTR [rsp+0x5d0]
  c5647d:	00 
  c5647e:	48 89 43 58          	mov    QWORD PTR [rbx+0x58],rax
  c56482:	4c 8d 73 60          	lea    r14,[rbx+0x60]
  c56486:	4c 89 f7             	mov    rdi,r14
  c56489:	e8 74 39 b8 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  c5648e:	4c 89 74 24 18       	mov    QWORD PTR [rsp+0x18],r14
  c56493:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  c56497:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
  c5649b:	48 8d 05 e6 35 bc 00 	lea    rax,[rip+0xbc35e6]        # 1819a88 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xf748>
  c564a2:	48 89 84 24 10 05 00 	mov    QWORD PTR [rsp+0x510],rax
  c564a9:	00 
  c564aa:	48 89 9c 24 18 05 00 	mov    QWORD PTR [rsp+0x518],rbx
  c564b1:	00 
--
  c570fd:	75 ef                	jne    c570ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a408e>
  c570ff:	eb 77                	jmp    c57178 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a4118>
  c57101:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  c57105:	49 89 de             	mov    r14,rbx
  c57108:	49 83 c6 28          	add    r14,0x28
  c5710c:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  c57111:	e8 50 2d b8 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c57116:	4c 89 ff             	mov    rdi,r15
  c57119:	e8 b6 2a b8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c5711e:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  c57123:	e8 ac 2a b8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c57128:	4c 89 f7             	mov    rdi,r14
  c5712b:	e8 f8 2c e2 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c57130:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  c57134:	e8 b5 8d b6 00       	call   17bfeee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17405a>
--
  c57426:	53                   	push   rbx
  c57427:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
  c5742a:	48 89 37             	mov    QWORD PTR [rdi],rsi
  c5742d:	48 85 db             	test   rbx,rbx
  c57430:	74 36                	je     c57468 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a4408>
  c57432:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
  c57436:	e8 2b 2a b8 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c5743b:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
  c5743f:	e8 90 27 b8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c57444:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
  c57448:	e8 87 27 b8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
  c5744d:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
  c57451:	e8 d2 29 e2 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c57456:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
  c5745a:	e8 8f 8a b6 00       	call   17bfeee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17405a>
--
  c6deed:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  c6def2:	e8 c9 0b b8 00       	call   17eeac0 <_ZNSt6__ndk115recursive_mutexD1Ev@plt>
  c6def7:	4c 89 f7             	mov    rdi,r14
  c6defa:	e8 d9 7a fa ff       	call   c159d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162978>
  c6deff:	48 8b bc 24 d8 00 00 	mov    rdi,QWORD PTR [rsp+0xd8]
  c6df06:	00 
  c6df07:	e8 5a bf b6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c6df0c:	48 89 df             	mov    rdi,rbx
  c6df0f:	e8 36 46 00 00       	call   c7254a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bf4ea>
  c6df14:	31 c0                	xor    eax,eax
  c6df16:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  c6df1b:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
  c6df22:	00 
  c6df23:	e8 68 ff b7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c6df28:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
--
  c775dd:	e8 46 28 e0 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
  c775e2:	4c 89 ff             	mov    rdi,r15
  c775e5:	e8 d6 74 b7 00       	call   17eeac0 <_ZNSt6__ndk115recursive_mutexD1Ev@plt>
  c775ea:	48 8d bb b0 01 00 00 	lea    rdi,[rbx+0x1b0]
  c775f1:	e8 e2 e3 f9 ff       	call   c159d8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x162978>
  c775f6:	48 8d bb 58 01 00 00 	lea    rdi,[rbx+0x158]
  c775fd:	e8 64 28 b6 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
  c77602:	48 8d bb 50 01 00 00 	lea    rdi,[rbx+0x150]
  c77609:	e8 3c af ff ff       	call   c7254a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bf4ea>
  c7760e:	48 8d bb 38 01 00 00 	lea    rdi,[rbx+0x138]
  c77615:	e8 76 68 b7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  c7761a:	48 81 c3 10 01 00 00 	add    rbx,0x110
  c77621:	48 89 df             	mov    rdi,rbx
  c77624:	e8 b5 69 f0 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
  c77629:	4c 89 f7             	mov    rdi,r14
--
  c7c9b2:	4d 89 37             	mov    QWORD PTR [r15],r14
  c7c9b5:	49 8d 7f 08          	lea    rdi,[r15+0x8]
  c7c9b9:	4c 89 e6             	mov    rsi,r12
  c7c9bc:	e8 b7 01 00 00       	call   c7cb78 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9b18>
  c7c9c1:	4c 89 ff             	mov    rdi,r15
  c7c9c4:	48 83 c7 28          	add    rdi,0x28
  c7c9c8:	e8 35 d4 b5 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
  c7c9cd:	4c 89 7b 10          	mov    QWORD PTR [rbx+0x10],r15
  c7c9d1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  c7c9d6:	e8 e5 01 00 00       	call   c7cbc0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1c9b60>
  c7c9db:	4c 8d 63 20          	lea    r12,[rbx+0x20]
  c7c9df:	48 8b 7d 00          	mov    rdi,QWORD PTR [rbp+0x0]
  c7c9e3:	48 8d 35 b6 f6 74 ff 	lea    rsi,[rip+0xffffffffff74f6b6]        # 3cc0a0 <_ZTSN5boost9exceptionE@@Base+0x2ca82>
  c7c9ea:	48 8d 0d bf f6 74 ff 	lea    rcx,[rip+0xffffffffff74f6bf]        # 3cc0b0 <_ZTSN5boost9exceptionE@@Base+0x2ca92>

## Nearby dynamic symbols

   336: 0000000000a05fc0    15 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEED2Ev
   345: 0000000000a0feb0    34 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk18ios_base7failureC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEERKNS_10error_codeE
   356: 0000000000a0a550   334 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk15stoldERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPm
   377: 0000000000a0ac00   331 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk14stofERKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEEPm
   398: 0000000000a05c30   311 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE21__grow_by_and_replaceEmmmmmmPKc
   407: 0000000000a1a330   194 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk114basic_ofstreamIcNS_11char_traitsIcEEE4openERKNS_12basic_stringIcS2_NS_9allocatorIcEEEEj
   409: 00000000017f5260    24 OBJECT  GLOBAL DEFAULT   19 _ZTISt19bad_optional_access
   423: 0000000000a33af0  1071 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk19money_putIcNS_19ostreambuf_iteratorIcNS_11char_traitsIcEEEEE6do_putES4_bRNS_8ios_baseEcRKNS_12basic_stringIcS3_NS_9allocatorIcEEEE
   425: 0000000000a06310   514 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
   449: 0000000000a3d970   175 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk114collate_bynameIwEC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
   469: 0000000000a05fc0    15 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEED1Ev
   475: 0000000000a075e0   167 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7compareEmmRKS5_mm
   485: 0000000000a0d310   218 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk112system_errorC1ENS_10error_codeERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
   513: 0000000000a3eb70   190 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk112ctype_bynameIcEC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
   518: 0000000000a43f70   106 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk115numpunct_bynameIwEC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
   525: 0000000000a071b0   303 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEmc
   539: 0000000000a07d60   199 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE5rfindEPKwmm
   542: 0000000000a07710    65 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7replaceEmmRKS5_mm
   551: 0000000000a19890   637 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEE3strEv
   580: 0000000000a09c10    80 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6resizeEmw
   585: 0000000000a07e30   162 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6__initEPKwmm
   591: 0000000000a0a410   305 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk14stodERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPm
   594: 00000000017f5d58    80 OBJECT  WEAK   DEFAULT   19 _ZTCNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE0_NS_13basic_istreamIcS2_EE
   600: 0000000000a0d690   228 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk112system_errorC2EiRKNS_14error_categoryERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
   603: 0000000000a19db0   229 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEE7seekoffExNS_8ios_base7seekdirEj
   617: 0000000000a05610     5 FUNC    GLOBAL DEFAULT   16 _ZNSt12experimental19bad_optional_accessD2Ev
   618: 0000000000a08630     5 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6assignEPKwm
   631: 0000000000a08070   354 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6insertEmmw
   632: 0000000000a08760   201 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEPKwm
   648: 0000000000a34b90  1060 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk19money_putIwNS_19ostreambuf_iteratorIwNS_11char_traitsIwEEEEE6do_putES4_bRNS_8ios_baseEwRKNS_12basic_stringIwS3_NS_9allocatorIwEEEE
   649: 0000000000a34fc0     8 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk18messagesIwE7do_openERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEERKNS_6localeE
   674: 0000000000a05ec0    33 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_
   676: 0000000000a48230  1937 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk118__time_get_storageIcEC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
   684: 0000000000a25ed0   330 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk19__num_getIwE17__stage2_int_loopEwiPcRS2_RjwRKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPjRSD_Pw
   696: 0000000000a0aea0   348 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk15stoldERKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEEPm
   698: 0000000000a07340    65 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendERKS5_mm
   699: 0000000000a086f0   108 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7reserveEm
   703: 000000000043a3f4    66 OBJECT  WEAK   DEFAULT   11 _ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
   707: 0000000000a090e0   449 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6assignEmw
   717: 0000000000a05fc0    15 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev
   718: 0000000000a08c00   300 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE9__grow_byEmmmmmm
   730: 0000000000a3cd20    85 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk16localeC1ERKS0_RKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEi
   745: 0000000000a088e0   219 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEC2ERKS5_mmRKS4_
   751: 0000000000a05610     5 FUNC    GLOBAL DEFAULT   16 _ZNSt12experimental19bad_optional_accessD1Ev
   752: 0000000000a094b0   144 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7compareEPKw
   756: 0000000000a3f100   175 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk112ctype_bynameIwEC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
   767: 0000000000a30fb0  5438 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk19money_getIwNS_19istreambuf_iteratorIwNS_11char_traitsIwEEEEE8__do_getERS4_S4_bRKNS_6localeEjRjRbRKNS_5ctypeIwEERNS_10unique_ptrIwPFvPvEEERPwSM_
   781: 0000000000a07470   141 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7compareEmmPKc
   788: 0000000000a218f0   340 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk19__num_getIcE17__stage2_int_loopEciPcRS2_RjcRKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPjRSD_S2_
   789: 0000000000a34480   469 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk111__money_putIwE13__gather_infoEbbRKNS_6localeERNS_10money_base7patternERwS8_RNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEERNS9_IwNSA_IwEENSC_IwEEEESJ_Ri
   801: 0000000000a07f50   143 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE16find_last_not_ofEPKwmm
   802: 0000000000a05ec0    33 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC1ERKS5_
   807: 0000000000a057a0   135 FUNC    GLOBAL DEFAULT   16 _ZNSt13runtime_errorC1ERKNSt6__ndk112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
   808: 0000000000a07910    76 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6resizeEmc
   823: 00000000017f5238    40 OBJECT  GLOBAL DEFAULT   19 _ZTVSt19bad_optional_access
   833: 0000000000a067b0     5 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKcm
   846: 0000000000a06920   390 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
   847: 0000000000a05fc0    15 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev
   851: 0000000000a07ee0    33 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEC2ERKS5_
   854: 0000000000a07500     5 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignEPKc
   855: 0000000000a06590   533 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7replaceEmmmc
   878: 00000000017f5278    40 OBJECT  GLOBAL DEFAULT   19 _ZTVNSt12experimental19bad_optional_accessE
   879: 0000000000a05620    18 FUNC    GLOBAL DEFAULT   16 _ZNSt12experimental19bad_optional_accessD0Ev
   902: 0000000000a08880    85 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE4copyEPwmm
   911: 0000000000a30960   469 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk111__money_getIcE13__gather_infoEbRKNS_6localeERNS_10money_base7patternERcS8_RNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEESF_SF_SF_Ri
   914: 0000000000a07510   193 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE4findEPKcmm
   940: 0000000000a09080    90 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE5rfindEwm
   950: 0000000000a3cd20    85 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk16localeC2ERKS0_RKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEi
   975: 0000000000a07ee0    33 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEC1ERKS5_
   981: 0000000000a07fe0   139 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE17find_first_not_ofEPKwmm
   982: 0000000000a35000    47 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk18messagesIwE6do_getEliiRKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEE
   989: 0000000000a067c0   338 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
   993: 00000000017f58f8   128 OBJECT  WEAK   DEFAULT   19 _ZTVNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1013: 0000000000a06db0   255 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9__grow_byEmmmmmm
  1034: 0000000000a08b30    44 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6insertEmPKw
  1054: 0000000000a19510   892 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEE4swapERS5_
  1086: 0000000000a192d0   569 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEaSEOS5_
  1091: 0000000000a03a00   786 FUNC    GLOBAL DEFAULT   16 _ZNKSt6__ndk14__fs10filesystem4path9__compareENS_17basic_string_viewIcNS_11char_traitsIcEEEE
  1092: 00000000017d41df   660 FUNC    GLOBAL DEFAULT   16 Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag
  1094: 0000000000a07ee0    33 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEC1ERKS5_RKS4_
  1097: 0000000000a096a0   220 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE4findEPKwmm
  1099: 00000000017f5c90    80 OBJECT  WEAK   DEFAULT   19 _ZTTNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1112: 0000000000a06b60   175 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_mmRKS4_
  1113: 0000000000a07400    97 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7compareEmmPKcm
  1114: 0000000000a05fd0   116 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE17find_first_not_ofEPKcmm
  1117: 0000000000a05ec0    33 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_RKS4_
  1118: 0000000000a09540   127 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7compareEmmPKwm
  1149: 00000000017f5ce0   120 OBJECT  WEAK   DEFAULT   19 _ZTCNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE0_NS_14basic_iostreamIcS2_EE
  1163: 0000000000a07f10    59 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7replaceEmmPKw
  1164: 0000000000a3d400   175 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk114collate_bynameIcEC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
  1169: 0000000000a19b10   112 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEE3strERKNS_12basic_stringIcS2_S4_EE
  1170: 0000000000a08210   157 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6__initEPKwm
  1183: 00000000017f52a0    24 OBJECT  GLOBAL DEFAULT   19 _ZTINSt12experimental19bad_optional_accessE
  1204: 0000000000a08a30   249 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6__initEmw
  1209: 0000000000a07160    76 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5rfindEcm
  1219: 0000000000a2f0d0  5607 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk19money_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE8__do_getERS4_S4_bRKNS_6localeEjRjRbRKNS_5ctypeIcEERNS_10unique_ptrIcPFvPvEEERPcSM_
  1223: 0000000000a0a7b0   355 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk15stoulERKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEEPmi
  1237: 0000000000390550     8 OBJECT  WEAK   DEFAULT   11 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE4nposE
  1250: 0000000000a43c30    98 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk115numpunct_bynameIcEC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
  1252: 0000000000a06c10   104 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE4findEcm
  1262: 0000000000a082b0    50 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE2atEm
  1283: 0000000000a0feb0    34 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk18ios_base7failureC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEERKNS_10error_codeE
  1289: 0000000000a07690    78 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_
  1293: 0000000000a07390   107 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7compareEPKc
  1305: 0000000000a0d310   218 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk112system_errorC2ENS_10error_codeERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1320: 0000000000a08e70   516 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEmw
  1342: 0000000000a1a1a0   194 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk114basic_ifstreamIcNS_11char_traitsIcEEE4openERKNS_12basic_stringIcS2_NS_9allocatorIcEEEEj
  1347: 0000000000a30b40   261 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk116__check_groupingERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPjS8_Rj
  1353: 0000000000a0ad50   331 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk14stodERKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEEPm
  1370: 0000000000a05600     8 FUNC    GLOBAL DEFAULT   16 _ZNKSt19bad_optional_access4whatEv
  1373: 0000000000a05640   135 FUNC    GLOBAL DEFAULT   16 _ZNSt11logic_errorC2ERKNSt6__ndk112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
  1396: 0000000000a06250   119 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm
  1412: 0000000000a3d970   175 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk114collate_bynameIwEC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
  1415: 0000000000a06c80   116 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEmc
  1460: 0000000000a09830    78 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEaSERKS5_
  1475: 0000000000a3cb90    70 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk16localeC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1483: 0000000000a49d50   124 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk110__time_putC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1490: 0000000000a43f70   106 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk115numpunct_bynameIwEC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
  1493: 0000000000a07be0   372 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE21__grow_by_and_replaceEmmmmmmPKw
  1503: 0000000000a08430   116 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE13find_first_ofEPKwmm
  1504: 0000000000a0a750    84 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk14stolERKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEEPmi
  1539: 0000000000a08d30   305 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE9push_backEw
  1550: 0000000000a06fe0   374 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
  1560: 0000000000a05d70   195 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5rfindEPKcmm
  1565: 0000000000a49110  1895 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk118__time_get_storageIwEC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1570: 0000000000a261a0   610 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk19__num_getIcE19__stage2_float_loopEcRbRcPcRS4_ccRKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPjRSE_RjS4_
  1600: 0000000000a06d00    44 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKc
  1612: 0000000000a0aa90   362 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk16stoullERKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEEPmi
  1616: 0000000000a09ed0   334 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk15stoulERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPmi
  1620: 0000000000a06b00    81 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE4copyEPcmm
  1624: 00000000017f5da8    80 OBJECT  WEAK   DEFAULT   19 _ZTCNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE16_NS_13basic_ostreamIcS2_EE
  1637: 0000000000a08830    73 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6assignERKS5_mm
  1660: 0000000000a082b0    50 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE2atEm
  1670: 0000000000a09db0    13 FUNC    GLOBAL DEFAULT   16 _ZNKSt6__ndk121__basic_string_commonILb1EE20__throw_length_errorEv
  1678: 0000000000390f5a    72 OBJECT  WEAK   DEFAULT   11 _ZTSNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1682: 0000000000a49d50   124 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk110__time_putC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1695: 0000000000a062d0    53 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE2atEm
  1703: 0000000001887328    16 OBJECT  WEAK   DEFAULT   19 _ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1705: 0000000000a062d0    53 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE2atEm
  1708: 0000000000a333f0   469 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk111__money_putIcE13__gather_infoEbbRKNS_6localeERNS_10money_base7patternERcS8_RNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEESF_SF_Ri
  1712: 0000000000a06520   109 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE13find_first_ofEPKcmm
  1721: 0000000000a19ea0   150 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEaSEOS5_
  1724: 0000000000a09780   172 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7compareEmmRKS5_mm
  1755: 0000000000a3eb70   190 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk112ctype_bynameIcEC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
  1758: 0000000000a076e0    39 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc
  1759: 0000000000a0fc90   135 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk113random_deviceC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1776: 0000000000a0a6a0   175 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk14stoiERKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEEPmi
  1785: 0000000000a09ab0    67 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7replaceEmmRKS5_mm
  1788: 0000000000a26700   607 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk19__num_getIwE19__stage2_float_loopEwRbRcPcRS4_wwRKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPjRSE_RjPw
  1795: 0000000000a053a0     5 FUNC    GLOBAL DEFAULT   16 _ZNSt19bad_optional_accessD2Ev
  1802: 0000000000390520    40 OBJECT  GLOBAL DEFAULT   11 _ZTSNSt12experimental19bad_optional_accessE
  1816: 0000000000a05ef0    59 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7replaceEmmPKc
  1818: 0000000000a088e0   219 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEC1ERKS5_mmRKS4_
  1825: 00000000017f5c00    24 OBJECT  WEAK   DEFAULT   19 _ZTINSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1829: 0000000000a089c0   106 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE4findEwm
  1830: 0000000000a19bc0    85 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEE9pbackfailEi
  1839: 0000000000a09cb0   244 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk1plIcNS_11char_traitsIcEENS_9allocatorIcEEEENS_12basic_stringIT_T0_T1_EEPKS6_RKS9_
  1840: 00000000017f5c18   120 OBJECT  WEAK   DEFAULT   19 _ZTVNSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1857: 0000000000390f15    69 OBJECT  WEAK   DEFAULT   11 _ZTSNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  1861: 0000000000a07760   427 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertENS_11__wrap_iterIPKcEEc
  1862: 0000000000a05f30   137 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE16find_last_not_ofEPKcmm
  1892: 0000000000a19b80    60 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEE9underflowEv
  1897: 0000000000a092b0    98 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE5eraseEmm
  1898: 0000000000a09b00   261 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6insertENS_11__wrap_iterIPKwEEw
  1901: 0000000000a324f0   675 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk19money_getIwNS_19istreambuf_iteratorIwNS_11char_traitsIwEEEEE6do_getES4_S4_bRNS_8ios_baseERjRNS_12basic_stringIwS3_NS_9allocatorIwEEEE
  1925: 0000000000a053a0     5 FUNC    GLOBAL DEFAULT   16 _ZNSt19bad_optional_accessD1Ev
  1931: 0000000000a05e40   123 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcmm
  1936: 0000000000a09660     5 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6assignEPKw
  1976: 0000000000a0a170   341 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk16stoullERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPmi
  1984: 0000000000a335d0  1307 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk111__money_putIcE8__formatEPcRS2_S3_jPKcS5_RKNS_5ctypeIcEEbRKNS_10money_base7patternEccRKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEESL_SL_i
  1993: 0000000000a09c60    67 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6insertEmRKS5_mm
  1996: 0000000000a3f100   175 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk112ctype_bynameIwEC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
  2001: 0000000000a45c90   124 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk110__time_getC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  2007: 0000000000a06ab0    70 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6assignERKS5_mm
  2024: 0000000000a19010   152 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEC1EOS5_
  2033: 0000000000a081e0    47 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEaSEw
  2036: 0000000000a05920   777 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7replaceEmmPKcm
  2038: 0000000000a06d30   118 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE12find_last_ofEPKcmm
  2044: 0000000000a079b0   542 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7replaceEmmPKwm
  2054: 0000000000a055e0    18 FUNC    GLOBAL DEFAULT   16 _ZNSt19bad_optional_accessD0Ev
  2055: 0000000000a05ec0    33 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC1ERKS5_RKS4_
  2059: 0000000000a06eb0   294 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
  2065: 0000000000a3cb90    70 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk16localeC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  2067: 0000000000a07960    65 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmRKS5_mm
  2086: 0000000000a34660  1328 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk111__money_putIwE8__formatEPwRS2_S3_jPKwS5_RKNS_5ctypeIwEEbRKNS_10money_base7patternEwwRKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEERKNSE_IwNSF_IwEENSH_IwEEEESQ_i
  2091: 0000000000a082f0   305 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6insertEmPKwm
  2121: 0000000000a0a920   355 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk15stollERKNS_12basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEEPmi
  2159: 0000000000a49110  1895 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk118__time_get_storageIwEC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  2166: 0000000000a072e0    92 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE5eraseEmm
  2180: 0000000000a19010   152 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEEC2EOS5_
  2185: 0000000000a09dc0   175 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk14stoiERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPmi
  2201: 0000000000a32bc0   469 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk111__money_getIwE13__gather_infoEbRKNS_6localeERNS_10money_base7patternERwS8_RNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEERNS9_IwNSA_IwEENSC_IwEEEESJ_SJ_Ri
  2212: 0000000000a06050   464 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmmc
  2226: 0000000000a45c90   124 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk110__time_getC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  2235: 0000000000a06b60   175 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC1ERKS5_mmRKS4_
  2250: 0000000000a084b0   372 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7replaceEmmmw
  2271: 0000000000a0a2d0   305 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk14stofERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPm
  2303: 0000000000a09e70    84 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk14stolERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPmi
  2314: 0000000000a48230  1937 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk118__time_get_storageIcEC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  2324: 0000000000a07bd0    13 FUNC    GLOBAL DEFAULT   16 _ZNKSt6__ndk121__basic_string_commonILb1EE20__throw_out_of_rangeEv
  2353: 0000000000a06220    43 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSEc
  2359: 0000000000a05640   135 FUNC    GLOBAL DEFAULT   16 _ZNSt11logic_errorC1ERKNSt6__ndk112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
  2366: 0000000000a0fc90   135 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk113random_deviceC2ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  2367: 0000000000a095c0   150 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE7compareEmmPKw
  2380: 0000000000a19c20   396 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk115basic_stringbufIcNS_11char_traitsIcEENS_9allocatorIcEEE8overflowEi
  2383: 0000000000a306c0   672 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk19money_getIcNS_19istreambuf_iteratorIcNS_11char_traitsIcEEEEE6do_getES4_S4_bRNS_8ios_baseERjRNS_12basic_stringIcS3_NS_9allocatorIcEEEE
  2412: 0000000000a07ee0    33 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEEC2ERKS5_RKS4_
  2418: 0000000000a34fc0     8 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk18messagesIcE7do_openERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEERKNS_6localeE
  2431: 0000000000a3d400   175 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk114collate_bynameIcEC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
  2438: 0000000000a099d0   209 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendEPKw
  2462: 0000000000390508    24 OBJECT  GLOBAL DEFAULT   11 _ZTSSt19bad_optional_access
  2465: 0000000000a08b60   146 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE12find_last_ofEPKwmm
  2466: 0000000000a0d690   228 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk112system_errorC1EiRKNS_14error_categoryERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  2471: 0000000000a34fd0    47 FUNC    WEAK   DEFAULT   16 _ZNKSt6__ndk18messagesIcE6do_getEliiRKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
  2475: 0000000000a057a0   135 FUNC    GLOBAL DEFAULT   16 _ZNSt13runtime_errorC2ERKNSt6__ndk112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
  2499: 0000000000a0a020   334 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk15stollERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEPmi
  2508: 0000000000a43c30    98 FUNC    GLOBAL DEFAULT   16 _ZNSt6__ndk115numpunct_bynameIcEC1ERKNS_12basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEEm
  2516: 0000000000390548     8 OBJECT  WEAK   DEFAULT   11 _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE4nposE
  2557: 0000000000a093b0   255 FUNC    WEAK   DEFAULT   16 _ZNSt6__ndk112basic_stringIwNS_11char_traitsIwEENS_9allocatorIwEEE6appendERKS5_mm
  2571: 00000000017f5df8    24 OBJECT  WEAK   DEFAULT   19 _ZTINSt6__ndk118basic_stringstreamIcNS_11char_traitsIcEENS_9allocatorIcEEEE

## Direct relocations near helper

