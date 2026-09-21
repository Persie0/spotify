# Fast provider descriptor ID 0xb8 resolution

## Tiny ID methods
- 0x135c85c

## Candidate providers: 1
### AP 0x1867c58; ID=0xb8 method=0x135c85c; relocation slot=0x1867c68
- +0x0: 0x9d7de0
- +0x8: 0xa50370
- +0x10: 0x135c85c
- +0x18: 0x135c860
- +0x20: 0x135c86c
- +0x28: 0x135c878
- +0x30: 0x0
- +0x38: 0x0
- +0x40: 0x1364a94
- +0x48: 0x1364b3c
- +0x50: 0x9d7de0
#### metadata method +0x18
     135c860:	48 8d 05 d2 a9 fe fe 	lea    rax,[rip+0xfffffffffefea9d2]        # 347239 <_ZTSSt12bad_any_cast@@Base-0x48f8f>
     135c867:	6a 1a                	push   0x1a
     135c869:	5a                   	pop    rdx
     135c86a:	c3                   	ret
     135c86b:	cc                   	int3
     135c86c:	48 8d 05 1d 08 08 ff 	lea    rax,[rip+0xffffffffff08081d]        # 3dd090 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2adf>
     135c873:	6a 12                	push   0x12
     135c875:	5a                   	pop    rdx
     135c876:	c3                   	ret
     135c877:	cc                   	int3
     135c878:	55                   	push   rbp
     135c879:	41 57                	push   r15
    decoded ptr=0x3dd090 len=18: b'E\x12/Ur^1f2\xb7QJe\x02w\x00\x9em'
#### metadata method +0x20
     135c86c:	48 8d 05 1d 08 08 ff 	lea    rax,[rip+0xffffffffff08081d]        # 3dd090 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x2adf>
     135c873:	6a 12                	push   0x12
     135c875:	5a                   	pop    rdx
     135c876:	c3                   	ret
     135c877:	cc                   	int3
     135c878:	55                   	push   rbp
     135c879:	41 57                	push   r15
     135c87b:	41 56                	push   r14
     135c87d:	41 55                	push   r13
     135c87f:	41 54                	push   r12
     135c881:	53                   	push   rbx
     135c882:	48 81 ec 68 03 00 00 	sub    rsp,0x368
    decoded ptr=0x3dd090 len=18: b'E\x12/Ur^1f2\xb7QJe\x02w\x00\x9em'
#### factory +0x28 entry/context
     135c878:	55                   	push   rbp
     135c879:	41 57                	push   r15
     135c87b:	41 56                	push   r14
     135c87d:	41 55                	push   r13
     135c87f:	41 54                	push   r12
     135c881:	53                   	push   rbx
     135c882:	48 81 ec 68 03 00 00 	sub    rsp,0x368
     135c889:	49 89 cf             	mov    r15,rcx
     135c88c:	48 89 d5             	mov    rbp,rdx
     135c88f:	48 89 bc 24 88 01 00 	mov    QWORD PTR [rsp+0x188],rdi
     135c896:	00 
     135c897:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c89e:	00 00 
     135c8a0:	48 89 84 24 60 03 00 	mov    QWORD PTR [rsp+0x360],rax
     135c8a7:	00 
     135c8a8:	48 89 cf             	mov    rdi,rcx
     135c8ab:	e8 de a3 95 ff       	call   cb6c8e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x203c2e>
     135c8b0:	49 89 c4             	mov    r12,rax
     135c8b3:	4c 89 ff             	mov    rdi,r15
     135c8b6:	e8 8f 6f 8f ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
#### AP materializations
- 0xb60cd3: lea    rcx,[rip+0xd06f7e]        # 1867c58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24340>
      b60c9b:	5f                   	pop    rdi
      b60c9c:	e8 5f d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60ca1:	48 8d 0d 60 9b cf 00 	lea    rcx,[rip+0xcf9b60]        # 185a808 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x16ef0>
      b60ca8:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cab:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60cb0:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60cb3:	48 89 e7             	mov    rdi,rsp
      b60cb6:	e8 5b ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60cbb:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cc0:	48 85 ff             	test   rdi,rdi
      b60cc3:	74 06                	je     b60ccb <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc6b>
      b60cc5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cc8:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60ccb:	6a 08                	push   0x8
      b60ccd:	5f                   	pop    rdi
      b60cce:	e8 2d d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60cd3:	48 8d 0d 7e 6f d0 00 	lea    rcx,[rip+0xd06f7e]        # 1867c58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24340>
      b60cda:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60cdd:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60ce2:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60ce5:	48 89 e7             	mov    rdi,rsp
      b60ce8:	e8 29 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60ced:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60cf2:	48 85 ff             	test   rdi,rdi
      b60cf5:	74 06                	je     b60cfd <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc9d>
      b60cf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60cfa:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60cfd:	6a 08                	push   0x8
      b60cff:	5f                   	pop    rdi
      b60d00:	e8 fb d1 c8 00       	call   17edf00 <_Znwm@plt>
      b60d05:	48 8d 0d 8c 0a d1 00 	lea    rcx,[rip+0xd10a8c]        # 1871798 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2de80>
      b60d0c:	48 89 08             	mov    QWORD PTR [rax],rcx

