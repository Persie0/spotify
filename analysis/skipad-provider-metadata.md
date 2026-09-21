# Skip Ad provider metadata

## Exact returned metadata strings
- 0x353204 len=0x13: b'ListPlayerSetupImpl' -> ListPlayerSetupImpl
- 0x3dafb0 len=0x1a: b'Es\x86} QJ\xb8\x9ewq\xa1D\x98H\xba#\xc2\x15\xb6\x04z\x11A^m' -> Es�} QJ��wq�D�H�#��zA^m

## Skip Ad descriptor tiny methods

/tmp/skipmeta/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

00000000011ee5ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33b70>:
 11ee5ec:	b0 47                	mov    al,0x47
 11ee5ee:	c3                   	ret
 11ee5ef:	cc                   	int3
 11ee5f0:	48 8d 05 0d 4c 16 ff 	lea    rax,[rip+0xffffffffff164c0d]        # 353204 <_ZTSSt12bad_any_cast@@Base-0x3cfc4>
 11ee5f7:	6a 13                	push   0x13
 11ee5f9:	5a                   	pop    rdx
 11ee5fa:	c3                   	ret
 11ee5fb:	cc                   	int3
 11ee5fc:	48 8d 05 ad c9 1e ff 	lea    rax,[rip+0xffffffffff1ec9ad]        # 3dafb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x9ff>
 11ee603:	6a 1a                	push   0x1a
 11ee605:	5a                   	pop    rdx
 11ee606:	c3                   	ret
 11ee607:	cc                   	int3

## Neighbor provider descriptor tiny methods
### AP 0x1871f30
- +0x10 -> 0x144dff6
     144dff6:	b0 ba                	mov    al,0xba
     144dff8:	c3                   	ret
     144dff9:	cc                   	int3
     144dffa:	48 8d 05 bc 96 ef fe 	lea    rax,[rip+0xfffffffffeef96bc]        # 3476bd <_ZTSSt12bad_any_cast@@Base-0x48b0b>
     144e001:	6a 1a                	push   0x1a
     144e003:	5a                   	pop    rdx
     144e004:	c3                   	ret
     144e005:	cc                   	int3
- +0x18 -> 0x144dffa
     144dffa:	48 8d 05 bc 96 ef fe 	lea    rax,[rip+0xfffffffffeef96bc]        # 3476bd <_ZTSSt12bad_any_cast@@Base-0x48b0b>
     144e001:	6a 1a                	push   0x1a
     144e003:	5a                   	pop    rdx
     144e004:	c3                   	ret
     144e005:	cc                   	int3
     144e006:	48 8d 05 4f 7a fe fe 	lea    rax,[rip+0xfffffffffefe7a4f]        # 435a5c <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ab>
     144e00d:	6a 03                	push   0x3
     144e00f:	5a                   	pop    rdx
- +0x20 -> 0x144e006
     144e006:	48 8d 05 4f 7a fe fe 	lea    rax,[rip+0xfffffffffefe7a4f]        # 435a5c <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b4ab>
     144e00d:	6a 03                	push   0x3
     144e00f:	5a                   	pop    rdx
     144e010:	c3                   	ret
     144e011:	cc                   	int3
     144e012:	55                   	push   rbp
     144e013:	41 57                	push   r15
     144e015:	41 56                	push   r14
- +0x28 -> 0x144e012
     144e012:	55                   	push   rbp
     144e013:	41 57                	push   r15
     144e015:	41 56                	push   r14
     144e017:	41 55                	push   r13
     144e019:	41 54                	push   r12
     144e01b:	53                   	push   rbx
     144e01c:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     144e023:	49 89 cf             	mov    r15,rcx

### AP 0x185b8d0
- +0x10 -> 0x11ee5ec
     11ee5ec:	b0 47                	mov    al,0x47
     11ee5ee:	c3                   	ret
     11ee5ef:	cc                   	int3
     11ee5f0:	48 8d 05 0d 4c 16 ff 	lea    rax,[rip+0xffffffffff164c0d]        # 353204 <_ZTSSt12bad_any_cast@@Base-0x3cfc4>
     11ee5f7:	6a 13                	push   0x13
     11ee5f9:	5a                   	pop    rdx
     11ee5fa:	c3                   	ret
     11ee5fb:	cc                   	int3
- +0x18 -> 0x11ee5f0
     11ee5f0:	48 8d 05 0d 4c 16 ff 	lea    rax,[rip+0xffffffffff164c0d]        # 353204 <_ZTSSt12bad_any_cast@@Base-0x3cfc4>
     11ee5f7:	6a 13                	push   0x13
     11ee5f9:	5a                   	pop    rdx
     11ee5fa:	c3                   	ret
     11ee5fb:	cc                   	int3
     11ee5fc:	48 8d 05 ad c9 1e ff 	lea    rax,[rip+0xffffffffff1ec9ad]        # 3dafb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x9ff>
     11ee603:	6a 1a                	push   0x1a
     11ee605:	5a                   	pop    rdx
- +0x20 -> 0x11ee5fc
     11ee5fc:	48 8d 05 ad c9 1e ff 	lea    rax,[rip+0xffffffffff1ec9ad]        # 3dafb0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x9ff>
     11ee603:	6a 1a                	push   0x1a
     11ee605:	5a                   	pop    rdx
     11ee606:	c3                   	ret
     11ee607:	cc                   	int3
     11ee608:	55                   	push   rbp
     11ee609:	41 57                	push   r15
     11ee60b:	41 56                	push   r14
- +0x28 -> 0x11ee608
     11ee608:	55                   	push   rbp
     11ee609:	41 57                	push   r15
     11ee60b:	41 56                	push   r14
     11ee60d:	41 55                	push   r13
     11ee60f:	41 54                	push   r12
     11ee611:	53                   	push   rbx
     11ee612:	48 81 ec 68 03 00 00 	sub    rsp,0x368
     11ee619:	48 89 cb             	mov    rbx,rcx

### AP 0x181b748
- +0x10 -> 0xc7d442
      c7d442:	b0 46                	mov    al,0x46
      c7d444:	c3                   	ret
      c7d445:	cc                   	int3
      c7d446:	48 8d 05 6f f9 6f ff 	lea    rax,[rip+0xffffffffff6ff96f]        # 37cdbc <_ZTSSt12bad_any_cast@@Base-0x1340c>
      c7d44d:	6a 22                	push   0x22
      c7d44f:	5a                   	pop    rdx
      c7d450:	c3                   	ret
      c7d451:	cc                   	int3
- +0x18 -> 0xc7d446
      c7d446:	48 8d 05 6f f9 6f ff 	lea    rax,[rip+0xffffffffff6ff96f]        # 37cdbc <_ZTSSt12bad_any_cast@@Base-0x1340c>
      c7d44d:	6a 22                	push   0x22
      c7d44f:	5a                   	pop    rdx
      c7d450:	c3                   	ret
      c7d451:	cc                   	int3
      c7d452:	48 8d 05 3f ec 74 ff 	lea    rax,[rip+0xffffffffff74ec3f]        # 3cc098 <_ZTSN5boost9exceptionE@@Base+0x2ca7a>
      c7d459:	6a 03                	push   0x3
      c7d45b:	5a                   	pop    rdx
- +0x20 -> 0xc7d452
      c7d452:	48 8d 05 3f ec 74 ff 	lea    rax,[rip+0xffffffffff74ec3f]        # 3cc098 <_ZTSN5boost9exceptionE@@Base+0x2ca7a>
      c7d459:	6a 03                	push   0x3
      c7d45b:	5a                   	pop    rdx
      c7d45c:	c3                   	ret
      c7d45d:	cc                   	int3
      c7d45e:	55                   	push   rbp
      c7d45f:	41 57                	push   r15
      c7d461:	41 56                	push   r14
- +0x28 -> 0xc7d45e
      c7d45e:	55                   	push   rbp
      c7d45f:	41 57                	push   r15
      c7d461:	41 56                	push   r14
      c7d463:	41 55                	push   r13
      c7d465:	41 54                	push   r12
      c7d467:	53                   	push   rbx
      c7d468:	48 83 ec 28          	sub    rsp,0x28
      c7d46c:	49 89 cf             	mov    r15,rcx

### AP 0x182b5e0
- +0x10 -> 0xde4ff4
      de4ff4:	b0 6f                	mov    al,0x6f
      de4ff6:	c3                   	ret
      de4ff7:	cc                   	int3
      de4ff8:	48 8d 05 06 82 58 ff 	lea    rax,[rip+0xffffffffff588206]        # 36d205 <_ZTSSt12bad_any_cast@@Base-0x22fc3>
      de4fff:	6a 1e                	push   0x1e
      de5001:	5a                   	pop    rdx
      de5002:	c3                   	ret
      de5003:	cc                   	int3
- +0x18 -> 0xde4ff8
      de4ff8:	48 8d 05 06 82 58 ff 	lea    rax,[rip+0xffffffffff588206]        # 36d205 <_ZTSSt12bad_any_cast@@Base-0x22fc3>
      de4fff:	6a 1e                	push   0x1e
      de5001:	5a                   	pop    rdx
      de5002:	c3                   	ret
      de5003:	cc                   	int3
      de5004:	48 8d 05 d3 c5 5e ff 	lea    rax,[rip+0xffffffffff5ec5d3]        # 3d15de <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2432>
      de500b:	6a 03                	push   0x3
      de500d:	5a                   	pop    rdx
- +0x20 -> 0xde5004
      de5004:	48 8d 05 d3 c5 5e ff 	lea    rax,[rip+0xffffffffff5ec5d3]        # 3d15de <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2432>
      de500b:	6a 03                	push   0x3
      de500d:	5a                   	pop    rdx
      de500e:	c3                   	ret
      de500f:	cc                   	int3
      de5010:	55                   	push   rbp
      de5011:	41 57                	push   r15
      de5013:	41 56                	push   r14
- +0x28 -> 0xde5010
      de5010:	55                   	push   rbp
      de5011:	41 57                	push   r15
      de5013:	41 56                	push   r14
      de5015:	41 55                	push   r13
      de5017:	41 54                	push   r12
      de5019:	53                   	push   rbx
      de501a:	48 83 ec 48          	sub    rsp,0x48
      de501e:	49 89 ce             	mov    r14,rcx

### AP 0x1851990
- +0x10 -> 0x111a248
     111a248:	b0 ac                	mov    al,0xac
     111a24a:	c3                   	ret
     111a24b:	cc                   	int3
     111a24c:	48 8d 05 cd 38 26 ff 	lea    rax,[rip+0xffffffffff2638cd]        # 37db20 <_ZTSSt12bad_any_cast@@Base-0x126a8>
     111a253:	6a 13                	push   0x13
     111a255:	5a                   	pop    rdx
     111a256:	c3                   	ret
     111a257:	cc                   	int3
- +0x18 -> 0x111a24c
     111a24c:	48 8d 05 cd 38 26 ff 	lea    rax,[rip+0xffffffffff2638cd]        # 37db20 <_ZTSSt12bad_any_cast@@Base-0x126a8>
     111a253:	6a 13                	push   0x13
     111a255:	5a                   	pop    rdx
     111a256:	c3                   	ret
     111a257:	cc                   	int3
     111a258:	48 8d 05 89 e8 2b ff 	lea    rax,[rip+0xffffffffff2be889]        # 3d8ae8 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36cd>
     111a25f:	6a 0a                	push   0xa
     111a261:	5a                   	pop    rdx
- +0x20 -> 0x111a258
     111a258:	48 8d 05 89 e8 2b ff 	lea    rax,[rip+0xffffffffff2be889]        # 3d8ae8 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x36cd>
     111a25f:	6a 0a                	push   0xa
     111a261:	5a                   	pop    rdx
     111a262:	c3                   	ret
     111a263:	cc                   	int3
     111a264:	55                   	push   rbp
     111a265:	41 57                	push   r15
     111a267:	41 56                	push   r14
- +0x28 -> 0x111a264
     111a264:	55                   	push   rbp
     111a265:	41 57                	push   r15
     111a267:	41 56                	push   r14
     111a269:	41 55                	push   r13
     111a26b:	41 54                	push   r12
     111a26d:	53                   	push   rbx
     111a26e:	48 81 ec 68 09 00 00 	sub    rsp,0x968
     111a275:	48 89 cb             	mov    rbx,rcx

