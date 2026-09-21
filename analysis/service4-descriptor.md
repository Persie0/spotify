# Registry service ID 4 descriptor

Authoritative accessor:
- b85f7e validates ID 4
- then returns table[4] at facade[0] + 0x20

## Tiny ID=4 methods: 6
### FDE 0x9dbdb0..0x9dbdc3
      9dbdb0:	b8 04 00 00 00       	mov    eax,0x4
      9dbdb5:	80 3f 01             	cmp    BYTE PTR [rdi],0x1
      9dbdb8:	75 08                	jne    9dbdc2 <_ZNKSt6__ndk114__codecvt_utf8IDiE11do_encodingEv@@Base+0x3bf2>
      9dbdba:	0f b7 47 02          	movzx  eax,WORD PTR [rdi+0x2]
      9dbdbe:	89 06                	mov    DWORD PTR [rsi],eax
      9dbdc0:	31 c0                	xor    eax,eax
      9dbdc2:	c3                   	ret

### FDE 0x9dbdd0..0x9dbdf9
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

### FDE 0x9e7bb0..0x9e7bb6
      9e7bb0:	b8 04 00 00 00       	mov    eax,0x4
      9e7bb5:	c3                   	ret
- relocation slot 0x17f4a78 -> ID method
  candidate AP 0x17f4a68 assuming ID slot +0x10:
    +0x0: 0x9e79f0 FDE=(10385904, 10385926)
    +0x8: 0x9e7a10 FDE=(10385936, 10386346)
    +0x10: 0x9e7bb0 FDE=(10386352, 10386358)
    +0x18: 0x9d81d0 FDE=(10322384, 10322387)
    +0x20: 0x38eca0 FDE=None
    +0x28: 0x38ecb8 FDE=None
    +0x30: 0x0 FDE=None
    +0x38: 0x0 FDE=None
    factory +0x28: 0x38ecb8 FDE=None
  candidate AP 0x17f4a60 assuming ID slot +0x18:
    +0x0: 0x9e7870 FDE=(10385520, 10385901)
    +0x8: 0x9e79f0 FDE=(10385904, 10385926)
    +0x10: 0x9e7a10 FDE=(10385936, 10386346)
    +0x18: 0x9e7bb0 FDE=(10386352, 10386358)
    +0x20: 0x9d81d0 FDE=(10322384, 10322387)
    +0x28: 0x38eca0 FDE=None
    +0x30: 0x38ecb8 FDE=None
    +0x38: 0x0 FDE=None
    factory +0x28: 0x38eca0 FDE=None
  candidate AP 0x17f4a58 assuming ID slot +0x20:
    +0x0: 0x9d81d0 FDE=(10322384, 10322387)
    +0x8: 0x9e7870 FDE=(10385520, 10385901)
    +0x10: 0x9e79f0 FDE=(10385904, 10385926)
    +0x18: 0x9e7a10 FDE=(10385936, 10386346)
    +0x20: 0x9e7bb0 FDE=(10386352, 10386358)
    +0x28: 0x9d81d0 FDE=(10322384, 10322387)
    +0x30: 0x38eca0 FDE=None
    +0x38: 0x38ecb8 FDE=None
    factory +0x28: 0x9d81d0 FDE=(10322384, 10322387)
  candidate AP 0x17f4a50 assuming ID slot +0x28:
    +0x0: 0x9e7820 FDE=(10385440, 10385508)
    +0x8: 0x9d81d0 FDE=(10322384, 10322387)
    +0x10: 0x9e7870 FDE=(10385520, 10385901)
    +0x18: 0x9e79f0 FDE=(10385904, 10385926)
    +0x20: 0x9e7a10 FDE=(10385936, 10386346)
    +0x28: 0x9e7bb0 FDE=(10386352, 10386358)
    +0x30: 0x9d81d0 FDE=(10322384, 10322387)
    +0x38: 0x38eca0 FDE=None
    factory +0x28: 0x9e7bb0 FDE=(10386352, 10386358)

### FDE 0xb8606a..0xb8606d
      b8606a:	b0 04                	mov    al,0x4
      b8606c:	c3                   	ret
- relocation slot 0x180dc60 -> ID method
  candidate AP 0x180dc50 assuming ID slot +0x10:
    +0x0: 0x9d7de0 FDE=(10321376, 10321377)
    +0x8: 0xa50370 FDE=(10814320, 10814325)
    +0x10: 0xb8606a FDE=(12083306, 12083309)
    +0x18: 0xb8606e FDE=(12083310, 12083321)
    +0x20: 0xb8607a FDE=(12083322, 12083333)
    +0x28: 0xb86086 FDE=(12083334, 12091202)
    +0x30: 0x0 FDE=None
    +0x38: 0x0 FDE=None
    metadata strings: ['AdsSetupImpl']
    factory +0x28: 0xb86086 FDE=(12083334, 12091202)
  candidate AP 0x180dc48 assuming ID slot +0x18:
    +0x0: 0x0 FDE=None
    +0x8: 0x9d7de0 FDE=(10321376, 10321377)
    +0x10: 0xa50370 FDE=(10814320, 10814325)
    +0x18: 0xb8606a FDE=(12083306, 12083309)
    +0x20: 0xb8606e FDE=(12083310, 12083321)
    +0x28: 0xb8607a FDE=(12083322, 12083333)
    +0x30: 0xb86086 FDE=(12083334, 12091202)
    +0x38: 0x0 FDE=None
    factory +0x28: 0xb8607a FDE=(12083322, 12083333)
  candidate AP 0x180dc40 assuming ID slot +0x20:
    +0x0: 0x0 FDE=None
    +0x8: 0x0 FDE=None
    +0x10: 0x9d7de0 FDE=(10321376, 10321377)
    +0x18: 0xa50370 FDE=(10814320, 10814325)
    +0x20: 0xb8606a FDE=(12083306, 12083309)
    +0x28: 0xb8606e FDE=(12083310, 12083321)
    +0x30: 0xb8607a FDE=(12083322, 12083333)
    +0x38: 0xb86086 FDE=(12083334, 12091202)
    factory +0x28: 0xb8606e FDE=(12083310, 12083321)
  candidate AP 0x180dc38 assuming ID slot +0x28:
    +0x0: 0xa7a004 FDE=(10985476, 10985481)
    +0x8: 0x0 FDE=None
    +0x10: 0x0 FDE=None
    +0x18: 0x9d7de0 FDE=(10321376, 10321377)
    +0x20: 0xa50370 FDE=(10814320, 10814325)
    +0x28: 0xb8606a FDE=(12083306, 12083309)
    +0x30: 0xb8606e FDE=(12083310, 12083321)
    +0x38: 0xb8607a FDE=(12083322, 12083333)
    factory +0x28: 0xb8606a FDE=(12083306, 12083309)

### FDE 0xca3d6c..0xca3d9b
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

### FDE 0x1380a22..0x1380a53
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

## b85f7e
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

