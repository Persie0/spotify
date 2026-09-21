# Compact real service184 registry trace

Facade ABI: +0 service table, +8 ID buffer, +0x10 ID count.
Accessor b8f02e validates ID 0xb8 then returns [facade[0] + 0x5c0].

## b8f02e caller receiver provenance
### call 0xb8ec45, FDE=(12119050, 12120109)
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

### call 0xc7d490, FDE=(13096030, 13096412)
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

### call 0xe8c9d1, FDE=(15255132, 15263896)
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

### call 0x10885e3, FDE=(17335610, 17338257)
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

### call 0x11ee6b0, FDE=(18802184, 18804775)
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

### call 0x1442026, FDE=(21241846, 21243183)
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

## 0x11ee6b0 receiver rbx provenance
FDE=(18802184, 18804775)
     11ee619:	48 89 cb             	mov    rbx,rcx
     11ee63e:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     11ee642:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
     11ee64e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee666:	48 89 df             	mov    rdi,rbx
     11ee676:	48 89 df             	mov    rdi,rbx
     11ee683:	48 89 df             	mov    rdi,rbx
     11ee693:	48 89 df             	mov    rdi,rbx
     11ee6a0:	48 89 df             	mov    rdi,rbx
     11ee6ad:	48 89 df             	mov    rdi,rbx

## Exact facade-shaped write clusters
### score=15 span=0x7 FDE=0xb0fa2f..0xb0fb4f base=rcx
      b0fb1a:	4c 89 31             	mov    QWORD PTR [rcx],r14
      b0fb1d:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
      b0fb21:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax

### score=15 span=0x7 FDE=0xb288c2..0xb28965 base=rsi
      b28902:	48 89 06             	mov    QWORD PTR [rsi],rax
      b28905:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b28909:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb32d60..0xb32dad base=rdx
      b32d82:	48 89 02             	mov    QWORD PTR [rdx],rax
      b32d85:	48 89 42 08          	mov    QWORD PTR [rdx+0x8],rax
      b32d89:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0

### score=15 span=0x7 FDE=0xb34da0..0xb34e5b base=rbx
      b34e3f:	4c 89 2b             	mov    QWORD PTR [rbx],r13
      b34e42:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
      b34e46:	89 6b 10             	mov    DWORD PTR [rbx+0x10],ebp

### score=15 span=0x7 FDE=0xb3f390..0xb3f45f base=rsi
      b3f3e7:	48 89 06             	mov    QWORD PTR [rsi],rax
      b3f3ea:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b3f3ee:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb3f460..0xb3f552 base=rsi
      b3f4f1:	48 89 06             	mov    QWORD PTR [rsi],rax
      b3f4f4:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b3f4f8:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb3f56c..0xb3f703 base=rsi
      b3f5a6:	48 89 06             	mov    QWORD PTR [rsi],rax
      b3f5a9:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b3f5ad:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb3fc06..0xb406cc base=rsi
      b3fffd:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      b40000:	48 89 4e 08          	mov    QWORD PTR [rsi+0x8],rcx
      b40004:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb40b8e..0xb40c2c base=rsi
      b40bc0:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      b40bc3:	48 89 4e 08          	mov    QWORD PTR [rsi+0x8],rcx
      b40bc7:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb434cc..0xb4369c base=rdi
      b4365c:	4c 89 07             	mov    QWORD PTR [rdi],r8
      b4365f:	4c 89 67 08          	mov    QWORD PTR [rdi+0x8],r12
      b43663:	c6 47 10 01          	mov    BYTE PTR [rdi+0x10],0x1

### score=15 span=0x7 FDE=0xb54996..0xb54efa base=rdi
      b54c97:	48 89 07             	mov    QWORD PTR [rdi],rax
      b54c9a:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      b54c9e:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax

### score=15 span=0x7 FDE=0xb5971a..0xb598a5 base=rsi
      b5980b:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5980e:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b59812:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb5ad5c..0xb5adf6 base=rsi
      b5ad9f:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5ada2:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b5ada6:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb5ee68..0xb5ef5f base=rsi
      b5eeb8:	48 89 06             	mov    QWORD PTR [rsi],rax
      b5eebb:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b5eebf:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xb633b2..0xb63451 base=rbx
      b63423:	48 89 03             	mov    QWORD PTR [rbx],rax
      b63426:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
      b6342a:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14

### score=15 span=0x7 FDE=0xb6958c..0xb696d3 base=rdi
      b696a4:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      b696a7:	4c 89 5f 08          	mov    QWORD PTR [rdi+0x8],r11
      b696ab:	c6 47 10 01          	mov    BYTE PTR [rdi+0x10],0x1

### score=15 span=0x7 FDE=0xb6ca46..0xb6cb8d base=rdi
      b6cb5e:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      b6cb61:	4c 89 5f 08          	mov    QWORD PTR [rdi+0x8],r11
      b6cb65:	c6 47 10 01          	mov    BYTE PTR [rdi+0x10],0x1

### score=15 span=0x7 FDE=0xb6cbbe..0xb6cdda base=rdi
      b6cda6:	4c 89 2f             	mov    QWORD PTR [rdi],r13
      b6cda9:	4c 89 57 08          	mov    QWORD PTR [rdi+0x8],r10
      b6cdad:	c6 47 10 01          	mov    BYTE PTR [rdi+0x10],0x1

### score=15 span=0x7 FDE=0xb6e47a..0xb6e5c9 base=rax
      b6e537:	4c 89 30             	mov    QWORD PTR [rax],r14
      b6e53a:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
      b6e53e:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12

### score=15 span=0x7 FDE=0xb707e4..0xb70ab6 base=rax
      b70996:	4c 89 28             	mov    QWORD PTR [rax],r13
      b70999:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
      b7099d:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx

### score=15 span=0x7 FDE=0xb70ab6..0xb70d7e base=rax
      b70c67:	4c 89 28             	mov    QWORD PTR [rax],r13
      b70c6a:	48 89 68 08          	mov    QWORD PTR [rax+0x8],rbp
      b70c6e:	48 89 58 10          	mov    QWORD PTR [rax+0x10],rbx

### score=15 span=0x7 FDE=0xb710dc..0xb7151a base=rax
      b712aa:	48 89 10             	mov    QWORD PTR [rax],rdx
      b712ad:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      b712b1:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp

### score=15 span=0x7 FDE=0xb73ace..0xb73f2a base=rax
      b73e2d:	4c 89 20             	mov    QWORD PTR [rax],r12
      b73e30:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      b73e34:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp

### score=15 span=0x7 FDE=0xb748cc..0xb74f58 base=rax
      b74c4d:	48 89 18             	mov    QWORD PTR [rax],rbx
      b74c50:	4c 89 78 08          	mov    QWORD PTR [rax+0x8],r15
      b74c54:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp

### score=15 span=0x7 FDE=0xb77ff2..0xb78292 base=rax
      b781a2:	4c 89 20             	mov    QWORD PTR [rax],r12
      b781a5:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      b781a9:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp

### score=15 span=0x7 FDE=0xb78834..0xb78984 base=rax
      b7896f:	4c 89 28             	mov    QWORD PTR [rax],r13
      b78972:	44 89 70 08          	mov    DWORD PTR [rax+0x8],r14d
      b78976:	c6 40 10 01          	mov    BYTE PTR [rax+0x10],0x1

### score=15 span=0x7 FDE=0xb7cb44..0xb7cdfd base=rax
      b7cd1b:	4c 89 38             	mov    QWORD PTR [rax],r15
      b7cd1e:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      b7cd22:	4c 89 68 10          	mov    QWORD PTR [rax+0x10],r13

### score=15 span=0x7 FDE=0xb92c9a..0xb92def base=rdi
      b92ce2:	48 89 07             	mov    QWORD PTR [rdi],rax
      b92ce5:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      b92ce9:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0

### score=15 span=0x7 FDE=0xb94ec2..0xb96465 base=rsi
      b95198:	48 89 06             	mov    QWORD PTR [rsi],rax
      b9519b:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      b9519f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0

### score=15 span=0x7 FDE=0xbc8324..0xbc84f7 base=rax
      bc847b:	48 89 08             	mov    QWORD PTR [rax],rcx
      bc847e:	4c 89 60 08          	mov    QWORD PTR [rax+0x8],r12
      bc8482:	c7 40 10 01 00 00 00 	mov    DWORD PTR [rax+0x10],0x1

### score=15 span=0x7 FDE=0xbca2f4..0xbca3df base=rcx
      bca3c6:	48 89 11             	mov    QWORD PTR [rcx],rdx
      bca3c9:	4c 89 69 08          	mov    QWORD PTR [rcx+0x8],r13
      bca3cd:	88 41 10             	mov    BYTE PTR [rcx+0x10],al

### score=15 span=0x7 FDE=0xbca418..0xbcb2fd base=rsi
      bca711:	48 89 06             	mov    QWORD PTR [rsi],rax
      bca714:	48 89 6e 08          	mov    QWORD PTR [rsi+0x8],rbp
      bca718:	66 c7 46 10 00 02    	mov    WORD PTR [rsi+0x10],0x200

### score=15 span=0x7 FDE=0xbcbcaa..0xbcbd1d base=rdi
      bcbd0d:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bcbd10:	48 89 57 08          	mov    QWORD PTR [rdi+0x8],rdx
      bcbd14:	44 88 57 10          	mov    BYTE PTR [rdi+0x10],r10b

### score=15 span=0x7 FDE=0xbd3094..0xbd335f base=rax
      bd30e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      bd30e3:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      bd30e7:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx

### score=15 span=0x7 FDE=0xbd5ae1..0xbd5d5c base=rbx
      bd5c4d:	48 89 33             	mov    QWORD PTR [rbx],rsi
      bd5c50:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
      bd5c54:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax

### score=15 span=0x7 FDE=0xbd66f0..0xbd675c base=rdi
      bd6750:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      bd6753:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
      bd6757:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax

### score=15 span=0x7 FDE=0xbd75f8..0xbd77a5 base=rbx
      bd763e:	48 89 13             	mov    QWORD PTR [rbx],rdx
      bd7641:	4c 89 63 08          	mov    QWORD PTR [rbx+0x8],r12
      bd7645:	88 43 10             	mov    BYTE PTR [rbx+0x10],al

### score=15 span=0x7 FDE=0xbddd8a..0xbdde63 base=rbx
      bdde4d:	f2 0f 11 03          	movsd  QWORD PTR [rbx],xmm0
      bdde51:	88 43 08             	mov    BYTE PTR [rbx+0x8],al
      bdde54:	48 89 73 10          	mov    QWORD PTR [rbx+0x10],rsi

### score=15 span=0x7 FDE=0xbe00ae..0xbe02cb base=r9
      be014e:	4d 89 01             	mov    QWORD PTR [r9],r8
      be0151:	49 89 51 08          	mov    QWORD PTR [r9+0x8],rdx
      be0155:	49 89 79 10          	mov    QWORD PTR [r9+0x10],rdi

### score=15 span=0x7 FDE=0xbe00ae..0xbe02cb base=r8
      be0181:	49 89 30             	mov    QWORD PTR [r8],rsi
      be0184:	49 89 48 08          	mov    QWORD PTR [r8+0x8],rcx
      be0188:	49 89 40 10          	mov    QWORD PTR [r8+0x10],rax

## Pointer-table indexed stores
### 0xa013f8 FDE=0xa010e0..0xa0143a
      a013f8:	f2 0f 10 0c d7       	movsd  xmm1,QWORD PTR [rdi+rdx*8]
      a013e3:	48 c1 fa 03          	sar    rdx,0x3
      a013e7:	48 83 fa 02          	cmp    rdx,0x2
      a013eb:	0f 8c 53 ff ff ff    	jl     a01344 <_ZNSt6__ndk16__sortIRNS_6__lessIggEEPgEEvT0_S5_T_@@Base+0x5cb4>
      a013f1:	48 83 c2 fe          	add    rdx,0xfffffffffffffffe
      a013f5:	48 d1 ea             	shr    rdx,1
      a013f8:	f2 0f 10 0c d7       	movsd  xmm1,QWORD PTR [rdi+rdx*8]
      a013fd:	f2 0f 10 00          	movsd  xmm0,QWORD PTR [rax]
      a01401:	66 0f 2e c1          	ucomisd xmm0,xmm1
      a01405:	0f 86 39 ff ff ff    	jbe    a01344 <_ZNSt6__ndk16__sortIRNS_6__lessIggEEPgEEvT0_S5_T_@@Base+0x5cb4>
      a0140b:	4c 8d 0c d7          	lea    r9,[rdi+rdx*8]
      a0140f:	90                   	nop
      a01410:	f2 0f 11 08          	movsd  QWORD PTR [rax],xmm1

### 0xa0142a FDE=0xa010e0..0xa0143a
      a0142a:	f2 0f 10 0c d7       	movsd  xmm1,QWORD PTR [rdi+rdx*8]
      a01417:	48 85 d2             	test   rdx,rdx
      a0141a:	0f 84 20 ff ff ff    	je     a01340 <_ZNSt6__ndk16__sortIRNS_6__lessIggEEPgEEvT0_S5_T_@@Base+0x5cb0>
      a01420:	48 ff ca             	dec    rdx
      a01423:	48 d1 ea             	shr    rdx,1
      a01426:	4c 8d 0c d7          	lea    r9,[rdi+rdx*8]
      a0142a:	f2 0f 10 0c d7       	movsd  xmm1,QWORD PTR [rdi+rdx*8]
      a0142f:	66 0f 2e c1          	ucomisd xmm0,xmm1
      a01433:	77 db                	ja     a01410 <_ZNSt6__ndk16__sortIRNS_6__lessIggEEPgEEvT0_S5_T_@@Base+0x5d80>
      a01435:	e9 06 ff ff ff       	jmp    a01340 <_ZNSt6__ndk16__sortIRNS_6__lessIggEEPgEEvT0_S5_T_@@Base+0x5cb0>
      a0143a:	cc                   	int3
      a0143b:	cc                   	int3
      a0143c:	cc                   	int3

### 0xa03067 FDE=0xa02e30..0xa03465
      a03067:	40 88 7c f0 10       	mov    BYTE PTR [rax+rsi*8+0x10],dil
      a03050:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
      a03055:	48 89 34 28          	mov    QWORD PTR [rax+rbp*1],rsi
      a03059:	4c 89 6c 28 08       	mov    QWORD PTR [rax+rbp*1+0x8],r13
      a0305e:	4b 8d 34 76          	lea    rsi,[r14+r14*2]
      a03062:	0f b6 7c 24 0f       	movzx  edi,BYTE PTR [rsp+0xf]
      a03067:	40 88 7c f0 10       	mov    BYTE PTR [rax+rsi*8+0x10],dil
      a0306c:	4c 8d 34 28          	lea    r14,[rax+rbp*1]
      a03070:	49 83 c6 18          	add    r14,0x18
      a03074:	4c 39 fb             	cmp    rbx,r15
      a03077:	0f 84 9a 00 00 00    	je     a03117 <_ZNKSt6__ndk14__fs10filesystem4path16lexically_normalEv@@Base+0x2e7>
      a0307d:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
      a03082:	66 66 66 66 66 2e 0f 	data16 data16 data16 data16 cs nop WORD PTR [rax+rax*1+0x0]

### 0xa03265 FDE=0xa02e30..0xa03465
      a03265:	c6 44 f0 10 04       	mov    BYTE PTR [rax+rsi*8+0x10],0x4
      a0324d:	48 8d 35 7f e7 94 ff 	lea    rsi,[rip+0xffffffffff94e77f]        # 3519d3 <_ZTSSt12bad_any_cast@@Base-0x3e7f5>
      a03254:	48 89 34 18          	mov    QWORD PTR [rax+rbx*1],rsi
      a03258:	48 c7 44 18 08 02 00 	mov    QWORD PTR [rax+rbx*1+0x8],0x2
      a0325f:	00 00 
      a03261:	4b 8d 34 76          	lea    rsi,[r14+r14*2]
      a03265:	c6 44 f0 10 04       	mov    BYTE PTR [rax+rsi*8+0x10],0x4
      a0326a:	4c 8d 34 18          	lea    r14,[rax+rbx*1]
      a0326e:	49 83 c6 18          	add    r14,0x18
      a03272:	4d 39 e7             	cmp    r15,r12
      a03275:	74 41                	je     a032b8 <_ZNKSt6__ndk14__fs10filesystem4path16lexically_normalEv@@Base+0x488>
      a03277:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
      a0327e:	00 00 

### 0xa0fb7e FDE=0xa0fae0..0xa0fc68
      a0fb7e:	4a 89 1c e0          	mov    QWORD PTR [rax+r12*8],rbx
      a0fb6e:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
      a0fb72:	eb 02                	jmp    a0fb76 <_ZNSt6__ndk115__thread_struct27__make_ready_at_thread_exitEPNS_17__assoc_sub_stateE@@Base+0x96>
      a0fb74:	31 c0                	xor    eax,eax
      a0fb76:	4a 8d 34 e0          	lea    rsi,[rax+r12*8]
      a0fb7a:	4a 8d 14 f8          	lea    rdx,[rax+r15*8]
      a0fb7e:	4a 89 1c e0          	mov    QWORD PTR [rax+r12*8],rbx
      a0fb82:	4e 8d 3c e0          	lea    r15,[rax+r12*8]
      a0fb86:	49 83 c7 08          	add    r15,0x8
      a0fb8a:	49 89 c9             	mov    r9,rcx
      a0fb8d:	49 29 f9             	sub    r9,rdi
      a0fb90:	0f 84 a2 00 00 00    	je     a0fc38 <_ZNSt6__ndk115__thread_struct27__make_ready_at_thread_exitEPNS_17__assoc_sub_stateE@@Base+0x158>
      a0fb96:	49 83 c1 f8          	add    r9,0xfffffffffffffff8

### 0xa0fbfc FDE=0xa0fae0..0xa0fc68
      a0fbfc:	42 0f 11 0c e0       	movups XMMWORD PTR [rax+r12*8],xmm1
      a0fbe3:	49 f7 db             	neg    r11
      a0fbe6:	45 31 e4             	xor    r12d,r12d
      a0fbe9:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
      a0fbf0:	42 0f 10 44 e1 e0    	movups xmm0,XMMWORD PTR [rcx+r12*8-0x20]
      a0fbf6:	42 0f 10 4c e1 f0    	movups xmm1,XMMWORD PTR [rcx+r12*8-0x10]
      a0fbfc:	42 0f 11 0c e0       	movups XMMWORD PTR [rax+r12*8],xmm1
      a0fc01:	42 0f 11 44 e0 f0    	movups XMMWORD PTR [rax+r12*8-0x10],xmm0
      a0fc07:	49 83 c4 fc          	add    r12,0xfffffffffffffffc
      a0fc0b:	4d 39 e3             	cmp    r11,r12
      a0fc0e:	75 e0                	jne    a0fbf0 <_ZNSt6__ndk115__thread_struct27__make_ready_at_thread_exitEPNS_17__assoc_sub_stateE@@Base+0x110>
      a0fc10:	4d 39 d1             	cmp    r9,r10
      a0fc13:	74 20                	je     a0fc35 <_ZNSt6__ndk115__thread_struct27__make_ready_at_thread_exitEPNS_17__assoc_sub_stateE@@Base+0x155>

### 0xa10330 FDE=0xa10280..0xa10357
      a10330:	4c 89 3c ca          	mov    QWORD PTR [rdx+rcx*8],r15
      a1031c:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      a10320:	4d 89 66 50          	mov    QWORD PTR [r14+0x50],r12
      a10324:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
      a10328:	48 8d 41 01          	lea    rax,[rcx+0x1]
      a1032c:	49 8b 56 38          	mov    rdx,QWORD PTR [r14+0x38]
      a10330:	4c 89 3c ca          	mov    QWORD PTR [rdx+rcx*8],r15
      a10334:	49 8b 56 40          	mov    rdx,QWORD PTR [r14+0x40]
      a10338:	89 1c 8a             	mov    DWORD PTR [rdx+rcx*4],ebx
      a1033b:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      a1033f:	48 83 c4 08          	add    rsp,0x8
      a10343:	5b                   	pop    rbx
      a10344:	41 5c                	pop    r12

### 0xa10634 FDE=0xa10510..0xa107d2
      a10634:	48 8b 0c c1          	mov    rcx,QWORD PTR [rcx+rax*8]
      a1061e:	74 3e                	je     a1065e <_ZNSt6__ndk18ios_base7copyfmtERKS0_@@Base+0x14e>
      a10620:	31 c0                	xor    eax,eax
      a10622:	66 66 66 66 66 2e 0f 	data16 data16 data16 data16 cs nop WORD PTR [rax+rax*1+0x0]
      a10629:	1f 84 00 00 00 00 00 
      a10630:	49 8b 4f 38          	mov    rcx,QWORD PTR [r15+0x38]
      a10634:	48 8b 0c c1          	mov    rcx,QWORD PTR [rcx+rax*8]
      a10638:	49 8b 54 24 38       	mov    rdx,QWORD PTR [r12+0x38]
      a1063d:	48 89 0c c2          	mov    QWORD PTR [rdx+rax*8],rcx
      a10641:	49 8b 4f 40          	mov    rcx,QWORD PTR [r15+0x40]
      a10645:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
      a10648:	49 8b 54 24 40       	mov    rdx,QWORD PTR [r12+0x40]
      a1064d:	89 0c 82             	mov    DWORD PTR [rdx+rax*4],ecx

### 0xa1063d FDE=0xa10510..0xa107d2
      a1063d:	48 89 0c c2          	mov    QWORD PTR [rdx+rax*8],rcx
      a10622:	66 66 66 66 66 2e 0f 	data16 data16 data16 data16 cs nop WORD PTR [rax+rax*1+0x0]
      a10629:	1f 84 00 00 00 00 00 
      a10630:	49 8b 4f 38          	mov    rcx,QWORD PTR [r15+0x38]
      a10634:	48 8b 0c c1          	mov    rcx,QWORD PTR [rcx+rax*8]
      a10638:	49 8b 54 24 38       	mov    rdx,QWORD PTR [r12+0x38]
      a1063d:	48 89 0c c2          	mov    QWORD PTR [rdx+rax*8],rcx
      a10641:	49 8b 4f 40          	mov    rcx,QWORD PTR [r15+0x40]
      a10645:	8b 0c 81             	mov    ecx,DWORD PTR [rcx+rax*4]
      a10648:	49 8b 54 24 40       	mov    rdx,QWORD PTR [r12+0x40]
      a1064d:	89 0c 82             	mov    DWORD PTR [rdx+rax*4],ecx
      a10650:	48 ff c0             	inc    rax
      a10653:	49 89 44 24 48       	mov    QWORD PTR [r12+0x48],rax

### 0xa106a0 FDE=0xa10510..0xa107d2
      a106a0:	48 8b 34 d0          	mov    rsi,QWORD PTR [rax+rdx*8]
      a10692:	74 27                	je     a106bb <_ZNSt6__ndk18ios_base7copyfmtERKS0_@@Base+0x1ab>
      a10694:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
      a10698:	49 8b 4c 24 58       	mov    rcx,QWORD PTR [r12+0x58]
      a1069d:	31 d2                	xor    edx,edx
      a1069f:	90                   	nop
      a106a0:	48 8b 34 d0          	mov    rsi,QWORD PTR [rax+rdx*8]
      a106a4:	48 89 34 d1          	mov    QWORD PTR [rcx+rdx*8],rsi
      a106a8:	49 8b 54 24 60       	mov    rdx,QWORD PTR [r12+0x60]
      a106ad:	48 ff c2             	inc    rdx
      a106b0:	49 89 54 24 60       	mov    QWORD PTR [r12+0x60],rdx
      a106b5:	49 3b 57 60          	cmp    rdx,QWORD PTR [r15+0x60]
      a106b9:	72 e5                	jb     a106a0 <_ZNSt6__ndk18ios_base7copyfmtERKS0_@@Base+0x190>

### 0xa106a4 FDE=0xa10510..0xa107d2
      a106a4:	48 89 34 d1          	mov    QWORD PTR [rcx+rdx*8],rsi
      a10694:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
      a10698:	49 8b 4c 24 58       	mov    rcx,QWORD PTR [r12+0x58]
      a1069d:	31 d2                	xor    edx,edx
      a1069f:	90                   	nop
      a106a0:	48 8b 34 d0          	mov    rsi,QWORD PTR [rax+rdx*8]
      a106a4:	48 89 34 d1          	mov    QWORD PTR [rcx+rdx*8],rsi
      a106a8:	49 8b 54 24 60       	mov    rdx,QWORD PTR [r12+0x60]
      a106ad:	48 ff c2             	inc    rdx
      a106b0:	49 89 54 24 60       	mov    QWORD PTR [r12+0x60],rdx
      a106b5:	49 3b 57 60          	cmp    rdx,QWORD PTR [r15+0x60]
      a106b9:	72 e5                	jb     a106a0 <_ZNSt6__ndk18ios_base7copyfmtERKS0_@@Base+0x190>
      a106bb:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]

### 0xa10704 FDE=0xa10510..0xa107d2
      a10704:	48 8b 0c c1          	mov    rcx,QWORD PTR [rcx+rax*8]
      a106f4:	74 29                	je     a1071f <_ZNSt6__ndk18ios_base7copyfmtERKS0_@@Base+0x20f>
      a106f6:	31 c0                	xor    eax,eax
      a106f8:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
      a106ff:	00 
      a10700:	49 8b 4f 70          	mov    rcx,QWORD PTR [r15+0x70]
      a10704:	48 8b 0c c1          	mov    rcx,QWORD PTR [rcx+rax*8]
      a10708:	49 8b 54 24 70       	mov    rdx,QWORD PTR [r12+0x70]
      a1070d:	48 89 0c c2          	mov    QWORD PTR [rdx+rax*8],rcx
      a10711:	48 ff c0             	inc    rax
      a10714:	49 89 44 24 78       	mov    QWORD PTR [r12+0x78],rax
      a10719:	49 3b 47 78          	cmp    rax,QWORD PTR [r15+0x78]
      a1071d:	72 e1                	jb     a10700 <_ZNSt6__ndk18ios_base7copyfmtERKS0_@@Base+0x1f0>

### 0xa1070d FDE=0xa10510..0xa107d2
      a1070d:	48 89 0c c2          	mov    QWORD PTR [rdx+rax*8],rcx
      a106f8:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
      a106ff:	00 
      a10700:	49 8b 4f 70          	mov    rcx,QWORD PTR [r15+0x70]
      a10704:	48 8b 0c c1          	mov    rcx,QWORD PTR [rcx+rax*8]
      a10708:	49 8b 54 24 70       	mov    rdx,QWORD PTR [r12+0x70]
      a1070d:	48 89 0c c2          	mov    QWORD PTR [rdx+rax*8],rcx
      a10711:	48 ff c0             	inc    rax
      a10714:	49 89 44 24 78       	mov    QWORD PTR [r12+0x78],rax
      a10719:	49 3b 47 78          	cmp    rax,QWORD PTR [r15+0x78]
      a1071d:	72 e1                	jb     a10700 <_ZNSt6__ndk18ios_base7copyfmtERKS0_@@Base+0x1f0>
      a1071f:	48 85 ed             	test   rbp,rbp
      a10722:	74 08                	je     a1072c <_ZNSt6__ndk18ios_base7copyfmtERKS0_@@Base+0x21c>

### 0xa378d3 FDE=0xa377a0..0xa37e84
      a378d3:	48 8b 34 f0          	mov    rsi,QWORD PTR [rax+rsi*8]
      a378c5:	48 29 c7             	sub    rdi,rax
      a378c8:	48 c1 ff 03          	sar    rdi,0x3
      a378cc:	ff c2                	inc    edx
      a378ce:	48 39 f7             	cmp    rdi,rsi
      a378d1:	76 18                	jbe    a378eb <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x27bb>
      a378d3:	48 8b 34 f0          	mov    rsi,QWORD PTR [rax+rsi*8]
      a378d7:	48 85 f6             	test   rsi,rsi
      a378da:	74 e4                	je     a378c0 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2790>
      a378dc:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      a378e1:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      a378e5:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      a378e9:	eb d5                	jmp    a378c0 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2790>

### 0xa37dea FDE=0xa377a0..0xa37e84
      a37dea:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]
      a37ddb:	48 29 c2             	sub    rdx,rax
      a37dde:	48 c1 fa 03          	sar    rdx,0x3
      a37de2:	41 ff c4             	inc    r12d
      a37de5:	48 39 ca             	cmp    rdx,rcx
      a37de8:	76 cd                	jbe    a37db7 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2c87>
      a37dea:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]
      a37dee:	48 85 ff             	test   rdi,rdi
      a37df1:	74 dd                	je     a37dd0 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2ca0>
      a37df3:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a37dfa:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a37e00:	48 85 c0             	test   rax,rax
      a37e03:	75 cb                	jne    a37dd0 <_ZNSt6__ndk114codecvt_bynameIDiDu9mbstate_tED0Ev@@Base+0x2ca0>

### 0xa39953 FDE=0xa39840..0xa39eea
      a39953:	48 8b 34 f0          	mov    rsi,QWORD PTR [rax+rsi*8]
      a39945:	48 29 c7             	sub    rdi,rax
      a39948:	48 c1 ff 03          	sar    rdi,0x3
      a3994c:	ff c2                	inc    edx
      a3994e:	48 39 f7             	cmp    rdi,rsi
      a39951:	76 18                	jbe    a3996b <_ZNSt6__ndk16locale7classicEv@@Base+0x1adb>
      a39953:	48 8b 34 f0          	mov    rsi,QWORD PTR [rax+rsi*8]
      a39957:	48 85 f6             	test   rsi,rsi
      a3995a:	74 e4                	je     a39940 <_ZNSt6__ndk16locale7classicEv@@Base+0x1ab0>
      a3995c:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      a39961:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      a39965:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      a39969:	eb d5                	jmp    a39940 <_ZNSt6__ndk16locale7classicEv@@Base+0x1ab0>

### 0xa39e48 FDE=0xa39840..0xa39eea
      a39e48:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]
      a39e3a:	48 29 c2             	sub    rdx,rax
      a39e3d:	48 c1 fa 03          	sar    rdx,0x3
      a39e41:	ff c5                	inc    ebp
      a39e43:	48 39 ca             	cmp    rdx,rcx
      a39e46:	76 d4                	jbe    a39e1c <_ZNSt6__ndk16locale7classicEv@@Base+0x1f8c>
      a39e48:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]
      a39e4c:	48 85 ff             	test   rdi,rdi
      a39e4f:	74 df                	je     a39e30 <_ZNSt6__ndk16locale7classicEv@@Base+0x1fa0>
      a39e51:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a39e58:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a39e5e:	48 85 c0             	test   rax,rax
      a39e61:	75 cd                	jne    a39e30 <_ZNSt6__ndk16locale7classicEv@@Base+0x1fa0>

### 0xa3a003 FDE=0xa39ef0..0xa3a29a
      a3a003:	48 8b 34 f0          	mov    rsi,QWORD PTR [rax+rsi*8]
      a39ff5:	48 29 c7             	sub    rdi,rax
      a39ff8:	48 c1 ff 03          	sar    rdi,0x3
      a39ffc:	ff c2                	inc    edx
      a39ffe:	48 39 f7             	cmp    rdi,rsi
      a3a001:	76 18                	jbe    a3a01b <_ZNSt6__ndk16locale7classicEv@@Base+0x218b>
      a3a003:	48 8b 34 f0          	mov    rsi,QWORD PTR [rax+rsi*8]
      a3a007:	48 85 f6             	test   rsi,rsi
      a3a00a:	74 e4                	je     a39ff0 <_ZNSt6__ndk16locale7classicEv@@Base+0x2160>
      a3a00c:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      a3a011:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
      a3a015:	48 8b 4b 18          	mov    rcx,QWORD PTR [rbx+0x18]
      a3a019:	eb d5                	jmp    a39ff0 <_ZNSt6__ndk16locale7classicEv@@Base+0x2160>

### 0xa3a1f8 FDE=0xa39ef0..0xa3a29a
      a3a1f8:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]
      a3a1ea:	48 29 c2             	sub    rdx,rax
      a3a1ed:	48 c1 fa 03          	sar    rdx,0x3
      a3a1f1:	ff c5                	inc    ebp
      a3a1f3:	48 39 ca             	cmp    rdx,rcx
      a3a1f6:	76 d2                	jbe    a3a1ca <_ZNSt6__ndk16locale7classicEv@@Base+0x233a>
      a3a1f8:	48 8b 3c c8          	mov    rdi,QWORD PTR [rax+rcx*8]
      a3a1fc:	48 85 ff             	test   rdi,rdi
      a3a1ff:	74 df                	je     a3a1e0 <_ZNSt6__ndk16locale7classicEv@@Base+0x2350>
      a3a201:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a3a208:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a3a20e:	48 85 c0             	test   rax,rax
      a3a211:	75 cd                	jne    a3a1e0 <_ZNSt6__ndk16locale7classicEv@@Base+0x2350>

### 0xa3c596 FDE=0xa3c460..0xa3c747
      a3c596:	48 8b 34 f7          	mov    rsi,QWORD PTR [rdi+rsi*8]
      a3c588:	48 c1 ff 03          	sar    rdi,0x3
      a3c58c:	ff c2                	inc    edx
      a3c58e:	48 39 f7             	cmp    rdi,rsi
      a3c591:	76 1b                	jbe    a3c5ae <_ZNSt6__ndk16locale7classicEv@@Base+0x471e>
      a3c593:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
      a3c596:	48 8b 34 f7          	mov    rsi,QWORD PTR [rdi+rsi*8]
      a3c59a:	48 85 f6             	test   rsi,rsi
      a3c59d:	74 e1                	je     a3c580 <_ZNSt6__ndk16locale7classicEv@@Base+0x46f0>
      a3c59f:	f0 48 ff 46 08       	lock inc QWORD PTR [rsi+0x8]
      a3c5a4:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
      a3c5a8:	49 8b 4d 18          	mov    rcx,QWORD PTR [r13+0x18]
      a3c5ac:	eb d2                	jmp    a3c580 <_ZNSt6__ndk16locale7classicEv@@Base+0x46f0>

### 0xa3c5eb FDE=0xa3c460..0xa3c747
      a3c5eb:	4a 8b 3c e0          	mov    rdi,QWORD PTR [rax+r12*8]
      a3c5dc:	49 8b 06             	mov    rax,QWORD PTR [r14]
      a3c5df:	eb 0a                	jmp    a3c5eb <_ZNSt6__ndk16locale7classicEv@@Base+0x475b>
      a3c5e1:	73 08                	jae    a3c5eb <_ZNSt6__ndk16locale7classicEv@@Base+0x475b>
      a3c5e3:	48 8d 0c d0          	lea    rcx,[rax+rdx*8]
      a3c5e7:	48 89 4b 18          	mov    QWORD PTR [rbx+0x18],rcx
      a3c5eb:	4a 8b 3c e0          	mov    rdi,QWORD PTR [rax+r12*8]
      a3c5ef:	48 85 ff             	test   rdi,rdi
      a3c5f2:	74 12                	je     a3c606 <_ZNSt6__ndk16locale7classicEv@@Base+0x4776>
      a3c5f4:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a3c5fb:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a3c601:	48 85 c0             	test   rax,rax
      a3c604:	74 2d                	je     a3c633 <_ZNSt6__ndk16locale7classicEv@@Base+0x47a3>

### 0xa3c609 FDE=0xa3c460..0xa3c747
      a3c609:	4e 89 3c e0          	mov    QWORD PTR [rax+r12*8],r15
      a3c5f4:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a3c5fb:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a3c601:	48 85 c0             	test   rax,rax
      a3c604:	74 2d                	je     a3c633 <_ZNSt6__ndk16locale7classicEv@@Base+0x47a3>
      a3c606:	49 8b 06             	mov    rax,QWORD PTR [r14]
      a3c609:	4e 89 3c e0          	mov    QWORD PTR [rax+r12*8],r15
      a3c60d:	4d 85 ff             	test   r15,r15
      a3c610:	74 12                	je     a3c624 <_ZNSt6__ndk16locale7classicEv@@Base+0x4794>
      a3c612:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a3c619:	f0 49 0f c1 47 08    	lock xadd QWORD PTR [r15+0x8],rax
      a3c61f:	48 85 c0             	test   rax,rax
      a3c622:	74 23                	je     a3c647 <_ZNSt6__ndk16locale7classicEv@@Base+0x47b7>

### 0xa3c63c FDE=0xa3c460..0xa3c747
      a3c63c:	4e 89 3c e0          	mov    QWORD PTR [rax+r12*8],r15
      a3c631:	5d                   	pop    rbp
      a3c632:	c3                   	ret
      a3c633:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a3c636:	ff 50 10             	call   QWORD PTR [rax+0x10]
      a3c639:	49 8b 06             	mov    rax,QWORD PTR [r14]
      a3c63c:	4e 89 3c e0          	mov    QWORD PTR [rax+r12*8],r15
      a3c640:	4d 85 ff             	test   r15,r15
      a3c643:	75 cd                	jne    a3c612 <_ZNSt6__ndk16locale7classicEv@@Base+0x4782>
      a3c645:	eb dd                	jmp    a3c624 <_ZNSt6__ndk16locale7classicEv@@Base+0x4794>
      a3c647:	49 8b 07             	mov    rax,QWORD PTR [r15]
      a3c64a:	4c 89 ff             	mov    rdi,r15
      a3c64d:	48 83 c4 28          	add    rsp,0x28

### 0xa3c798 FDE=0xa3c750..0xa3c802
      a3c798:	48 8b 3c c7          	mov    rdi,QWORD PTR [rdi+rax*8]
      a3c78a:	48 29 f9             	sub    rcx,rdi
      a3c78d:	48 c1 f9 03          	sar    rcx,0x3
      a3c791:	ff c5                	inc    ebp
      a3c793:	48 39 c1             	cmp    rcx,rax
      a3c796:	76 23                	jbe    a3c7bb <_ZNSt6__ndk16locale7classicEv@@Base+0x492b>
      a3c798:	48 8b 3c c7          	mov    rdi,QWORD PTR [rdi+rax*8]
      a3c79c:	48 85 ff             	test   rdi,rdi
      a3c79f:	74 df                	je     a3c780 <_ZNSt6__ndk16locale7classicEv@@Base+0x48f0>
      a3c7a1:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a3c7a8:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a3c7ae:	48 85 c0             	test   rax,rax
      a3c7b1:	75 cd                	jne    a3c780 <_ZNSt6__ndk16locale7classicEv@@Base+0x48f0>

### 0xa3c858 FDE=0xa3c810..0xa3c8ca
      a3c858:	48 8b 3c c7          	mov    rdi,QWORD PTR [rdi+rax*8]
      a3c84a:	48 29 f9             	sub    rcx,rdi
      a3c84d:	48 c1 f9 03          	sar    rcx,0x3
      a3c851:	ff c5                	inc    ebp
      a3c853:	48 39 c1             	cmp    rcx,rax
      a3c856:	76 23                	jbe    a3c87b <_ZNSt6__ndk16locale7classicEv@@Base+0x49eb>
      a3c858:	48 8b 3c c7          	mov    rdi,QWORD PTR [rdi+rax*8]
      a3c85c:	48 85 ff             	test   rdi,rdi
      a3c85f:	74 df                	je     a3c840 <_ZNSt6__ndk16locale7classicEv@@Base+0x49b0>
      a3c861:	48 c7 c0 ff ff ff ff 	mov    rax,0xffffffffffffffff
      a3c868:	f0 48 0f c1 47 08    	lock xadd QWORD PTR [rdi+0x8],rax
      a3c86e:	48 85 c0             	test   rax,rax
      a3c871:	75 cd                	jne    a3c840 <_ZNSt6__ndk16locale7classicEv@@Base+0x49b0>

### 0xa3df0a FDE=0xa3ded0..0xa3df14
      a3df0a:	48 8b 3c fe          	mov    rdi,QWORD PTR [rsi+rdi*8]
      a3defd:	48 39 d0             	cmp    rax,rdx
      a3df00:	74 0e                	je     a3df10 <_ZNKSt6__ndk15ctypeIwE5do_isEPKwS3_Pm@@Base+0x40>
      a3df02:	8b 38                	mov    edi,DWORD PTR [rax]
      a3df04:	48 83 ff 7f          	cmp    rdi,0x7f
      a3df08:	77 e6                	ja     a3def0 <_ZNKSt6__ndk15ctypeIwE5do_isEPKwS3_Pm@@Base+0x20>
      a3df0a:	48 8b 3c fe          	mov    rdi,QWORD PTR [rsi+rdi*8]
      a3df0e:	eb e2                	jmp    a3def2 <_ZNKSt6__ndk15ctypeIwE5do_isEPKwS3_Pm@@Base+0x22>
      a3df10:	48 89 d0             	mov    rax,rdx
      a3df13:	c3                   	ret
      a3df14:	cc                   	int3
      a3df15:	cc                   	int3
      a3df16:	cc                   	int3

### 0xa3f390 FDE=0xa3f360..0xa3f4b1
      a3f390:	4a 8b 44 ed 00       	mov    rax,QWORD PTR [rbp+r13*8+0x0]
      a3f37a:	49 89 d6             	mov    r14,rdx
      a3f37d:	49 89 fc             	mov    r12,rdi
      a3f380:	48 8d 2d c9 24 95 ff 	lea    rbp,[rip+0xffffffffff9524c9]        # 391850 <_ZNSt6__ndk15ctypeIcE10table_sizeE@@Base+0x8>
      a3f387:	eb 20                	jmp    a3f3a9 <_ZNKSt6__ndk112ctype_bynameIwE5do_isEPKwS3_Pm@@Base+0x49>
      a3f389:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
      a3f390:	4a 8b 44 ed 00       	mov    rax,QWORD PTR [rbp+r13*8+0x0]
      a3f395:	49 89 07             	mov    QWORD PTR [r15],rax
      a3f398:	48 83 c3 04          	add    rbx,0x4
      a3f39c:	49 83 c7 08          	add    r15,0x8
      a3f3a0:	4c 39 f3             	cmp    rbx,r14
      a3f3a3:	0f 84 f3 00 00 00    	je     a3f49c <_ZNKSt6__ndk112ctype_bynameIwE5do_isEPKwS3_Pm@@Base+0x13c>
      a3f3a9:	44 8b 2b             	mov    r13d,DWORD PTR [rbx]

### 0xa45f62 FDE=0xa45d30..0xa462fa
      a45f62:	48 8b 84 c1 68 01 00 	mov    rax,QWORD PTR [rcx+rax*8+0x168]
      a45f4c:	48 01 e8             	add    rax,rbp
      a45f4f:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
      a45f54:	f6 84 c1 58 01 00 00 	test   BYTE PTR [rcx+rax*8+0x158],0x1
      a45f5b:	01 
      a45f5c:	0f 84 4c 01 00 00    	je     a460ae <_ZNSt6__ndk118__time_get_storageIcE9__analyzeEcRKNS_5ctypeIcEE@@Base+0x37e>
      a45f62:	48 8b 84 c1 68 01 00 	mov    rax,QWORD PTR [rcx+rax*8+0x168]
      a45f69:	00 
      a45f6a:	0f b6 00             	movzx  eax,BYTE PTR [rax]
      a45f6d:	84 c0                	test   al,al
      a45f6f:	0f 89 4e 01 00 00    	jns    a460c3 <_ZNSt6__ndk118__time_get_storageIcE9__analyzeEcRKNS_5ctypeIcEE@@Base+0x393>
      a45f75:	e9 a6 fe ff ff       	jmp    a45e20 <_ZNSt6__ndk118__time_get_storageIcE9__analyzeEcRKNS_5ctypeIcEE@@Base+0xf0>
      a45f7a:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]

### 0xa4692f FDE=0xa46650..0xa46d49
      a4692f:	48 8b 84 c1 68 01 00 	mov    rax,QWORD PTR [rcx+rax*8+0x168]
      a46919:	48 01 e8             	add    rax,rbp
      a4691c:	48 8b 4c 24 40       	mov    rcx,QWORD PTR [rsp+0x40]
      a46921:	f6 84 c1 58 01 00 00 	test   BYTE PTR [rcx+rax*8+0x158],0x1
      a46928:	01 
      a46929:	0f 84 b3 01 00 00    	je     a46ae2 <_ZNSt6__ndk118__time_get_storageIwE9__analyzeEcRKNS_5ctypeIwEE@@Base+0x492>
      a4692f:	48 8b 84 c1 68 01 00 	mov    rax,QWORD PTR [rcx+rax*8+0x168]
      a46936:	00 
      a46937:	e9 b0 01 00 00       	jmp    a46aec <_ZNSt6__ndk118__time_get_storageIwE9__analyzeEcRKNS_5ctypeIwEE@@Base+0x49c>
      a4693c:	48 8b 54 24 40       	mov    rdx,QWORD PTR [rsp+0x40]
      a46941:	0f b6 82 98 03 00 00 	movzx  eax,BYTE PTR [rdx+0x398]
      a46948:	a8 01                	test   al,0x1
      a4694a:	74 21                	je     a4696d <_ZNSt6__ndk118__time_get_storageIwE9__analyzeEcRKNS_5ctypeIwEE@@Base+0x31d>

### 0xa4c10c FDE=0xa4bf80..0xa4c195
      a4c10c:	43 0f 11 0c d9       	movups XMMWORD PTR [r9+r11*8],xmm1
      a4c0f9:	49 f7 da             	neg    r10
      a4c0fc:	45 31 db             	xor    r11d,r11d
      a4c0ff:	90                   	nop
      a4c100:	42 0f 10 44 df e0    	movups xmm0,XMMWORD PTR [rdi+r11*8-0x20]
      a4c106:	42 0f 10 4c df f0    	movups xmm1,XMMWORD PTR [rdi+r11*8-0x10]
      a4c10c:	43 0f 11 0c d9       	movups XMMWORD PTR [r9+r11*8],xmm1
      a4c111:	43 0f 11 44 d9 f0    	movups XMMWORD PTR [r9+r11*8-0x10],xmm0
      a4c117:	49 83 c3 fc          	add    r11,0xfffffffffffffffc
      a4c11b:	4d 39 da             	cmp    r10,r11
      a4c11e:	75 e0                	jne    a4c100 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x9a0>
      a4c120:	4c 39 c6             	cmp    rsi,r8
      a4c123:	74 20                	je     a4c145 <_ZNSt6__ndk17codecvtIwc9mbstate_tED1Ev@@Base+0x9e5>

### 0xa4f2bd FDE=0xa4f110..0xa4f3ad
      a4f2bd:	48 8b 04 d6          	mov    rax,QWORD PTR [rsi+rdx*8]
      a4f2a9:	48 ba 8f e3 38 8e e3 	movabs rdx,0xe38e38e38e38e38f
      a4f2b0:	38 8e e3 
      a4f2b3:	48 89 c8             	mov    rax,rcx
      a4f2b6:	48 f7 e2             	mul    rdx
      a4f2b9:	48 c1 ea 05          	shr    rdx,0x5
      a4f2bd:	48 8b 04 d6          	mov    rax,QWORD PTR [rsi+rdx*8]
      a4f2c1:	48 c1 e2 02          	shl    rdx,0x2
      a4f2c5:	48 8d 14 d2          	lea    rdx,[rdx+rdx*8]
      a4f2c9:	48 29 d1             	sub    rcx,rdx
      a4f2cc:	48 6b c9 70          	imul   rcx,rcx,0x70
      a4f2d0:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
      a4f2d5:	48 89 14 08          	mov    QWORD PTR [rax+rcx*1],rdx

### 0xa4f72f FDE=0xa4f600..0xa4f848
      a4f72f:	48 8b 04 d6          	mov    rax,QWORD PTR [rsi+rdx*8]
      a4f71d:	49 03 4e 20          	add    rcx,QWORD PTR [r14+0x20]
      a4f721:	49 8b 76 08          	mov    rsi,QWORD PTR [r14+0x8]
      a4f725:	48 89 c8             	mov    rax,rcx
      a4f728:	49 f7 e4             	mul    r12
      a4f72b:	48 c1 ea 05          	shr    rdx,0x5
      a4f72f:	48 8b 04 d6          	mov    rax,QWORD PTR [rsi+rdx*8]
      a4f733:	48 c1 e2 02          	shl    rdx,0x2
      a4f737:	48 8d 14 d2          	lea    rdx,[rdx+rdx*8]
      a4f73b:	48 29 d1             	sub    rcx,rdx
      a4f73e:	48 6b c9 70          	imul   rcx,rcx,0x70
      a4f742:	48 8b 54 08 18       	mov    rdx,QWORD PTR [rax+rcx*1+0x18]
      a4f747:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx

### 0xa4f899 FDE=0xa4f870..0xa4f8b4
      a4f899:	48 8b 04 d6          	mov    rax,QWORD PTR [rsi+rdx*8]
      a4f885:	48 ba 8f e3 38 8e e3 	movabs rdx,0xe38e38e38e38e38f
      a4f88c:	38 8e e3 
      a4f88f:	48 89 c8             	mov    rax,rcx
      a4f892:	48 f7 e2             	mul    rdx
      a4f895:	48 c1 ea 05          	shr    rdx,0x5
      a4f899:	48 8b 04 d6          	mov    rax,QWORD PTR [rsi+rdx*8]
      a4f89d:	48 c1 e2 02          	shl    rdx,0x2
      a4f8a1:	48 8d 14 d2          	lea    rdx,[rdx+rdx*8]
      a4f8a5:	48 29 d1             	sub    rcx,rdx
      a4f8a8:	48 6b c9 70          	imul   rcx,rcx,0x70
      a4f8ac:	48 01 c8             	add    rax,rcx
      a4f8af:	48 83 c0 20          	add    rax,0x20

### 0xa4f998 FDE=0xa4f920..0xa4fd2b
      a4f998:	4c 8b 2c d6          	mov    r13,QWORD PTR [rsi+rdx*8]
      a4f984:	48 ba 8f e3 38 8e e3 	movabs rdx,0xe38e38e38e38e38f
      a4f98b:	38 8e e3 
      a4f98e:	4c 89 f8             	mov    rax,r15
      a4f991:	48 f7 e2             	mul    rdx
      a4f994:	48 c1 ea 05          	shr    rdx,0x5
      a4f998:	4c 8b 2c d6          	mov    r13,QWORD PTR [rsi+rdx*8]
      a4f99c:	48 c1 e2 02          	shl    rdx,0x2
      a4f9a0:	48 8d 04 d2          	lea    rax,[rdx+rdx*8]
      a4f9a4:	49 29 c7             	sub    r15,rax
      a4f9a7:	0f b6 69 30          	movzx  ebp,BYTE PTR [rcx+0x30]
      a4f9ab:	c7 04 24 00 00 00 00 	mov    DWORD PTR [rsp],0x0
      a4f9b2:	e8 f9 e5 d9 00       	call   17edfb0 <_ZNSt6__ndk115system_categoryEv@plt>

### 0xa4fb24 FDE=0xa4f920..0xa4fd2b
      a4fb24:	48 8b 04 d7          	mov    rax,QWORD PTR [rdi+rdx*8]
      a4fb11:	48 03 4b 28          	add    rcx,QWORD PTR [rbx+0x28]
      a4fb15:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
      a4fb1a:	48 89 c8             	mov    rax,rcx
      a4fb1d:	49 f7 e6             	mul    r14
      a4fb20:	48 c1 ea 05          	shr    rdx,0x5
      a4fb24:	48 8b 04 d7          	mov    rax,QWORD PTR [rdi+rdx*8]
      a4fb28:	48 c1 e2 02          	shl    rdx,0x2
      a4fb2c:	48 8d 14 d2          	lea    rdx,[rdx+rdx*8]
      a4fb30:	48 29 d1             	sub    rcx,rdx
      a4fb33:	48 6b c9 70          	imul   rcx,rcx,0x70
      a4fb37:	48 89 34 08          	mov    QWORD PTR [rax+rcx*1],rsi
      a4fb3b:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]

### 0xa50db0 FDE=0xa50950..0xa5104e
      a50db0:	41 0f 10 04 ff       	movups xmm0,XMMWORD PTR [r15+rdi*8]
      a50d9b:	48 83 c2 10          	add    rdx,0x10
      a50d9f:	31 ff                	xor    edi,edi
      a50da1:	66 66 66 66 66 66 2e 	data16 data16 data16 data16 data16 cs nop WORD PTR [rax+rax*1+0x0]
      a50da8:	0f 1f 84 00 00 00 00 
      a50daf:	00 
      a50db0:	41 0f 10 04 ff       	movups xmm0,XMMWORD PTR [r15+rdi*8]
      a50db5:	41 0f 10 4c ff 10    	movups xmm1,XMMWORD PTR [r15+rdi*8+0x10]
      a50dbb:	0f 11 44 fa f0       	movups XMMWORD PTR [rdx+rdi*8-0x10],xmm0
      a50dc0:	0f 11 0c fa          	movups XMMWORD PTR [rdx+rdi*8],xmm1
      a50dc4:	48 83 c7 04          	add    rdi,0x4
      a50dc8:	48 39 fe             	cmp    rsi,rdi
      a50dcb:	75 e3                	jne    a50db0 <_ZdaPv@@Base+0xa40>

### 0xa50db5 FDE=0xa50950..0xa5104e
      a50db5:	41 0f 10 4c ff 10    	movups xmm1,XMMWORD PTR [r15+rdi*8+0x10]
      a50d9f:	31 ff                	xor    edi,edi
      a50da1:	66 66 66 66 66 66 2e 	data16 data16 data16 data16 data16 cs nop WORD PTR [rax+rax*1+0x0]
      a50da8:	0f 1f 84 00 00 00 00 
      a50daf:	00 
      a50db0:	41 0f 10 04 ff       	movups xmm0,XMMWORD PTR [r15+rdi*8]
      a50db5:	41 0f 10 4c ff 10    	movups xmm1,XMMWORD PTR [r15+rdi*8+0x10]
      a50dbb:	0f 11 44 fa f0       	movups XMMWORD PTR [rdx+rdi*8-0x10],xmm0
      a50dc0:	0f 11 0c fa          	movups XMMWORD PTR [rdx+rdi*8],xmm1
      a50dc4:	48 83 c7 04          	add    rdi,0x4
      a50dc8:	48 39 fe             	cmp    rsi,rdi
      a50dcb:	75 e3                	jne    a50db0 <_ZdaPv@@Base+0xa40>
      a50dcd:	49 39 f5             	cmp    r13,rsi

### 0xa50dc0 FDE=0xa50950..0xa5104e
      a50dc0:	0f 11 0c fa          	movups XMMWORD PTR [rdx+rdi*8],xmm1
      a50da8:	0f 1f 84 00 00 00 00 
      a50daf:	00 
      a50db0:	41 0f 10 04 ff       	movups xmm0,XMMWORD PTR [r15+rdi*8]
      a50db5:	41 0f 10 4c ff 10    	movups xmm1,XMMWORD PTR [r15+rdi*8+0x10]
      a50dbb:	0f 11 44 fa f0       	movups XMMWORD PTR [rdx+rdi*8-0x10],xmm0
      a50dc0:	0f 11 0c fa          	movups XMMWORD PTR [rdx+rdi*8],xmm1
      a50dc4:	48 83 c7 04          	add    rdi,0x4
      a50dc8:	48 39 fe             	cmp    rsi,rdi
      a50dcb:	75 e3                	jne    a50db0 <_ZdaPv@@Base+0xa40>
      a50dcd:	49 39 f5             	cmp    r13,rsi
      a50dd0:	74 21                	je     a50df3 <_ZdaPv@@Base+0xa83>
      a50dd2:	66 66 66 66 66 2e 0f 	data16 data16 data16 data16 cs nop WORD PTR [rax+rax*1+0x0]

### 0xa50ed0 FDE=0xa50950..0xa5104e
      a50ed0:	42 0f 10 44 d3 08    	movups xmm0,XMMWORD PTR [rbx+r10*8+0x8]
      a50ebc:	4d 8d 0c 04          	lea    r9,[r12+rax*1]
      a50ec0:	49 83 c1 10          	add    r9,0x10
      a50ec4:	45 31 d2             	xor    r10d,r10d
      a50ec7:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
      a50ece:	00 00 
      a50ed0:	42 0f 10 44 d3 08    	movups xmm0,XMMWORD PTR [rbx+r10*8+0x8]
      a50ed6:	42 0f 10 4c d3 18    	movups xmm1,XMMWORD PTR [rbx+r10*8+0x18]
      a50edc:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a50ee2:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a50ee7:	49 83 c2 04          	add    r10,0x4
      a50eeb:	4d 39 d0             	cmp    r8,r10
      a50eee:	75 e0                	jne    a50ed0 <_ZdaPv@@Base+0xb60>

### 0xa50ed6 FDE=0xa50950..0xa5104e
      a50ed6:	42 0f 10 4c d3 18    	movups xmm1,XMMWORD PTR [rbx+r10*8+0x18]
      a50ec0:	49 83 c1 10          	add    r9,0x10
      a50ec4:	45 31 d2             	xor    r10d,r10d
      a50ec7:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
      a50ece:	00 00 
      a50ed0:	42 0f 10 44 d3 08    	movups xmm0,XMMWORD PTR [rbx+r10*8+0x8]
      a50ed6:	42 0f 10 4c d3 18    	movups xmm1,XMMWORD PTR [rbx+r10*8+0x18]
      a50edc:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a50ee2:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a50ee7:	49 83 c2 04          	add    r10,0x4
      a50eeb:	4d 39 d0             	cmp    r8,r10
      a50eee:	75 e0                	jne    a50ed0 <_ZdaPv@@Base+0xb60>
      a50ef0:	4d 39 c7             	cmp    r15,r8

### 0xa50ee2 FDE=0xa50950..0xa5104e
      a50ee2:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a50ec7:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
      a50ece:	00 00 
      a50ed0:	42 0f 10 44 d3 08    	movups xmm0,XMMWORD PTR [rbx+r10*8+0x8]
      a50ed6:	42 0f 10 4c d3 18    	movups xmm1,XMMWORD PTR [rbx+r10*8+0x18]
      a50edc:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a50ee2:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a50ee7:	49 83 c2 04          	add    r10,0x4
      a50eeb:	4d 39 d0             	cmp    r8,r10
      a50eee:	75 e0                	jne    a50ed0 <_ZdaPv@@Base+0xb60>
      a50ef0:	4d 39 c7             	cmp    r15,r8
      a50ef3:	74 1e                	je     a50f13 <_ZdaPv@@Base+0xba3>
      a50ef5:	66 66 2e 0f 1f 84 00 	data16 cs nop WORD PTR [rax+rax*1+0x0]

### 0xa50f89 FDE=0xa50950..0xa5104e
      a50f89:	42 0f 10 44 d3 08    	movups xmm0,XMMWORD PTR [rbx+r10*8+0x8]
      a50f76:	4a 8d 3c c2          	lea    rdi,[rdx+r8*8]
      a50f7a:	4f 8d 34 c6          	lea    r14,[r14+r8*8]
      a50f7e:	4d 8d 0c 04          	lea    r9,[r12+rax*1]
      a50f82:	49 83 c1 10          	add    r9,0x10
      a50f86:	45 31 d2             	xor    r10d,r10d
      a50f89:	42 0f 10 44 d3 08    	movups xmm0,XMMWORD PTR [rbx+r10*8+0x8]
      a50f8f:	42 0f 10 4c d3 18    	movups xmm1,XMMWORD PTR [rbx+r10*8+0x18]
      a50f95:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a50f9b:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a50fa0:	49 83 c2 04          	add    r10,0x4
      a50fa4:	4d 39 d0             	cmp    r8,r10
      a50fa7:	75 e0                	jne    a50f89 <_ZdaPv@@Base+0xc19>

### 0xa50f8f FDE=0xa50950..0xa5104e
      a50f8f:	42 0f 10 4c d3 18    	movups xmm1,XMMWORD PTR [rbx+r10*8+0x18]
      a50f7a:	4f 8d 34 c6          	lea    r14,[r14+r8*8]
      a50f7e:	4d 8d 0c 04          	lea    r9,[r12+rax*1]
      a50f82:	49 83 c1 10          	add    r9,0x10
      a50f86:	45 31 d2             	xor    r10d,r10d
      a50f89:	42 0f 10 44 d3 08    	movups xmm0,XMMWORD PTR [rbx+r10*8+0x8]
      a50f8f:	42 0f 10 4c d3 18    	movups xmm1,XMMWORD PTR [rbx+r10*8+0x18]
      a50f95:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a50f9b:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a50fa0:	49 83 c2 04          	add    r10,0x4
      a50fa4:	4d 39 d0             	cmp    r8,r10
      a50fa7:	75 e0                	jne    a50f89 <_ZdaPv@@Base+0xc19>
      a50fa9:	4d 39 c7             	cmp    r15,r8

### 0xa50f9b FDE=0xa50950..0xa5104e
      a50f9b:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a50f82:	49 83 c1 10          	add    r9,0x10
      a50f86:	45 31 d2             	xor    r10d,r10d
      a50f89:	42 0f 10 44 d3 08    	movups xmm0,XMMWORD PTR [rbx+r10*8+0x8]
      a50f8f:	42 0f 10 4c d3 18    	movups xmm1,XMMWORD PTR [rbx+r10*8+0x18]
      a50f95:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a50f9b:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a50fa0:	49 83 c2 04          	add    r10,0x4
      a50fa4:	4d 39 d0             	cmp    r8,r10
      a50fa7:	75 e0                	jne    a50f89 <_ZdaPv@@Base+0xc19>
      a50fa9:	4d 39 c7             	cmp    r15,r8
      a50fac:	74 15                	je     a50fc3 <_ZdaPv@@Base+0xc53>
      a50fae:	66 90                	xchg   ax,ax

### 0xa511d0 FDE=0xa51050..0xa51202
      a511d0:	43 0f 10 04 dc       	movups xmm0,XMMWORD PTR [r12+r11*8]
      a511bd:	4f 8d 04 cc          	lea    r8,[r12+r9*8]
      a511c1:	4e 8d 14 28          	lea    r10,[rax+r13*1]
      a511c5:	49 83 c2 10          	add    r10,0x10
      a511c9:	45 31 db             	xor    r11d,r11d
      a511cc:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
      a511d0:	43 0f 10 04 dc       	movups xmm0,XMMWORD PTR [r12+r11*8]
      a511d5:	43 0f 10 4c dc 10    	movups xmm1,XMMWORD PTR [r12+r11*8+0x10]
      a511db:	43 0f 11 44 da f0    	movups XMMWORD PTR [r10+r11*8-0x10],xmm0
      a511e1:	43 0f 11 0c da       	movups XMMWORD PTR [r10+r11*8],xmm1
      a511e6:	49 83 c3 04          	add    r11,0x4
      a511ea:	4d 39 d9             	cmp    r9,r11
      a511ed:	75 e1                	jne    a511d0 <_ZdaPv@@Base+0xe60>

### 0xa511d5 FDE=0xa51050..0xa51202
      a511d5:	43 0f 10 4c dc 10    	movups xmm1,XMMWORD PTR [r12+r11*8+0x10]
      a511c1:	4e 8d 14 28          	lea    r10,[rax+r13*1]
      a511c5:	49 83 c2 10          	add    r10,0x10
      a511c9:	45 31 db             	xor    r11d,r11d
      a511cc:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
      a511d0:	43 0f 10 04 dc       	movups xmm0,XMMWORD PTR [r12+r11*8]
      a511d5:	43 0f 10 4c dc 10    	movups xmm1,XMMWORD PTR [r12+r11*8+0x10]
      a511db:	43 0f 11 44 da f0    	movups XMMWORD PTR [r10+r11*8-0x10],xmm0
      a511e1:	43 0f 11 0c da       	movups XMMWORD PTR [r10+r11*8],xmm1
      a511e6:	49 83 c3 04          	add    r11,0x4
      a511ea:	4d 39 d9             	cmp    r9,r11
      a511ed:	75 e1                	jne    a511d0 <_ZdaPv@@Base+0xe60>
      a511ef:	4c 39 cd             	cmp    rbp,r9

### 0xa511e1 FDE=0xa51050..0xa51202
      a511e1:	43 0f 11 0c da       	movups XMMWORD PTR [r10+r11*8],xmm1
      a511c9:	45 31 db             	xor    r11d,r11d
      a511cc:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
      a511d0:	43 0f 10 04 dc       	movups xmm0,XMMWORD PTR [r12+r11*8]
      a511d5:	43 0f 10 4c dc 10    	movups xmm1,XMMWORD PTR [r12+r11*8+0x10]
      a511db:	43 0f 11 44 da f0    	movups XMMWORD PTR [r10+r11*8-0x10],xmm0
      a511e1:	43 0f 11 0c da       	movups XMMWORD PTR [r10+r11*8],xmm1
      a511e6:	49 83 c3 04          	add    r11,0x4
      a511ea:	4d 39 d9             	cmp    r9,r11
      a511ed:	75 e1                	jne    a511d0 <_ZdaPv@@Base+0xe60>
      a511ef:	4c 39 cd             	cmp    rbp,r9
      a511f2:	0f 85 58 ff ff ff    	jne    a51150 <_ZdaPv@@Base+0xde0>
      a511f8:	e9 66 ff ff ff       	jmp    a51163 <_ZdaPv@@Base+0xdf3>

### 0xa51340 FDE=0xa51210..0xa513c4
      a51340:	43 0f 10 04 d7       	movups xmm0,XMMWORD PTR [r15+r10*8]
      a5132a:	4c 8d 0c 28          	lea    r9,[rax+rbp*1]
      a5132e:	49 83 c1 10          	add    r9,0x10
      a51332:	45 31 d2             	xor    r10d,r10d
      a51335:	66 66 2e 0f 1f 84 00 	data16 cs nop WORD PTR [rax+rax*1+0x0]
      a5133c:	00 00 00 00 
      a51340:	43 0f 10 04 d7       	movups xmm0,XMMWORD PTR [r15+r10*8]
      a51345:	43 0f 10 4c d7 10    	movups xmm1,XMMWORD PTR [r15+r10*8+0x10]
      a5134b:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a51351:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a51356:	49 83 c2 04          	add    r10,0x4
      a5135a:	4d 39 d0             	cmp    r8,r10
      a5135d:	75 e1                	jne    a51340 <_ZdaPv@@Base+0xfd0>

### 0xa51345 FDE=0xa51210..0xa513c4
      a51345:	43 0f 10 4c d7 10    	movups xmm1,XMMWORD PTR [r15+r10*8+0x10]
      a5132e:	49 83 c1 10          	add    r9,0x10
      a51332:	45 31 d2             	xor    r10d,r10d
      a51335:	66 66 2e 0f 1f 84 00 	data16 cs nop WORD PTR [rax+rax*1+0x0]
      a5133c:	00 00 00 00 
      a51340:	43 0f 10 04 d7       	movups xmm0,XMMWORD PTR [r15+r10*8]
      a51345:	43 0f 10 4c d7 10    	movups xmm1,XMMWORD PTR [r15+r10*8+0x10]
      a5134b:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a51351:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a51356:	49 83 c2 04          	add    r10,0x4
      a5135a:	4d 39 d0             	cmp    r8,r10
      a5135d:	75 e1                	jne    a51340 <_ZdaPv@@Base+0xfd0>
      a5135f:	4d 39 c5             	cmp    r13,r8

### 0xa51351 FDE=0xa51210..0xa513c4
      a51351:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a51335:	66 66 2e 0f 1f 84 00 	data16 cs nop WORD PTR [rax+rax*1+0x0]
      a5133c:	00 00 00 00 
      a51340:	43 0f 10 04 d7       	movups xmm0,XMMWORD PTR [r15+r10*8]
      a51345:	43 0f 10 4c d7 10    	movups xmm1,XMMWORD PTR [r15+r10*8+0x10]
      a5134b:	43 0f 11 44 d1 f0    	movups XMMWORD PTR [r9+r10*8-0x10],xmm0
      a51351:	43 0f 11 0c d1       	movups XMMWORD PTR [r9+r10*8],xmm1
      a51356:	49 83 c2 04          	add    r10,0x4
      a5135a:	4d 39 d0             	cmp    r8,r10
      a5135d:	75 e1                	jne    a51340 <_ZdaPv@@Base+0xfd0>
      a5135f:	4d 39 c5             	cmp    r13,r8
      a51362:	74 1f                	je     a51383 <_ZdaPv@@Base+0x1013>
      a51364:	66 66 66 2e 0f 1f 84 	data16 data16 cs nop WORD PTR [rax+rax*1+0x0]

### 0xa51401 FDE=0xa513d0..0xa514c0
      a51401:	4c 8b 34 d6          	mov    r14,QWORD PTR [rsi+rdx*8]
      a513ed:	48 ba 8f e3 38 8e e3 	movabs rdx,0xe38e38e38e38e38f
      a513f4:	38 8e e3 
      a513f7:	48 89 c8             	mov    rax,rcx
      a513fa:	48 f7 e2             	mul    rdx
      a513fd:	48 c1 ea 05          	shr    rdx,0x5
      a51401:	4c 8b 34 d6          	mov    r14,QWORD PTR [rsi+rdx*8]
      a51405:	48 c1 e2 02          	shl    rdx,0x2
      a51409:	48 8d 04 d2          	lea    rax,[rdx+rdx*8]
      a5140d:	48 29 c1             	sub    rcx,rax
      a51410:	4c 6b f9 70          	imul   r15,rcx,0x70
      a51414:	4b 83 3c 3e 00       	cmp    QWORD PTR [r14+r15*1],0x0
      a51419:	74 24                	je     a5143f <_ZdaPv@@Base+0x10cf>

### 0xa57cbb FDE=0xa57b90..0xa58694
      a57cbb:	4c 8b 04 f0          	mov    r8,QWORD PTR [rax+rsi*8]
      a57ca2:	48 3b 93 a0 02 00 00 	cmp    rdx,QWORD PTR [rbx+0x2a0]
      a57ca9:	0f 84 2b 08 00 00    	je     a584da <__cxa_demangle@@Base+0x117a>
      a57caf:	48 8b 3a             	mov    rdi,QWORD PTR [rdx]
      a57cb2:	48 85 ff             	test   rdi,rdi
      a57cb5:	0f 84 1f 08 00 00    	je     a584da <__cxa_demangle@@Base+0x117a>
      a57cbb:	4c 8b 04 f0          	mov    r8,QWORD PTR [rax+rsi*8]
      a57cbf:	4d 8b 48 10          	mov    r9,QWORD PTR [r8+0x10]
      a57cc3:	4c 8b 17             	mov    r10,QWORD PTR [rdi]
      a57cc6:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      a57cca:	4c 29 d7             	sub    rdi,r10
      a57ccd:	48 c1 ff 03          	sar    rdi,0x3
      a57cd1:	49 39 f9             	cmp    r9,rdi

### 0xa57cf3 FDE=0xa57b90..0xa58694
      a57cf3:	4b 8b 34 ca          	mov    rsi,QWORD PTR [r10+r9*8]
      a57cde:	48 ff c6             	inc    rsi
      a57ce1:	66 66 66 66 66 66 2e 	data16 data16 data16 data16 data16 cs nop WORD PTR [rax+rax*1+0x0]
      a57ce8:	0f 1f 84 00 00 00 00 
      a57cef:	00 
      a57cf0:	49 89 f3             	mov    r11,rsi
      a57cf3:	4b 8b 34 ca          	mov    rsi,QWORD PTR [r10+r9*8]
      a57cf7:	49 89 70 18          	mov    QWORD PTR [r8+0x18],rsi
      a57cfb:	4c 39 d9             	cmp    rcx,r11
      a57cfe:	0f 84 26 01 00 00    	je     a57e2a <__cxa_demangle@@Base+0xaca>
      a57d04:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
      a57d07:	48 85 f6             	test   rsi,rsi
      a57d0a:	74 1f                	je     a57d2b <__cxa_demangle@@Base+0x9cb>

### 0xa57d0c FDE=0xa57b90..0xa58694
      a57d0c:	4e 8b 04 d8          	mov    r8,QWORD PTR [rax+r11*8]
      a57cfb:	4c 39 d9             	cmp    rcx,r11
      a57cfe:	0f 84 26 01 00 00    	je     a57e2a <__cxa_demangle@@Base+0xaca>
      a57d04:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
      a57d07:	48 85 f6             	test   rsi,rsi
      a57d0a:	74 1f                	je     a57d2b <__cxa_demangle@@Base+0x9cb>
      a57d0c:	4e 8b 04 d8          	mov    r8,QWORD PTR [rax+r11*8]
      a57d10:	4d 8b 48 10          	mov    r9,QWORD PTR [r8+0x10]
      a57d14:	4c 8b 16             	mov    r10,QWORD PTR [rsi]
      a57d17:	4c 8b 7e 08          	mov    r15,QWORD PTR [rsi+0x8]
      a57d1b:	4d 29 d7             	sub    r15,r10
      a57d1e:	49 c1 ff 03          	sar    r15,0x3
      a57d22:	49 8d 73 01          	lea    rsi,[r11+0x1]

### 0xa5cc52 FDE=0xa5c940..0xa5cd2b
      a5cc52:	48 8b 34 c8          	mov    rsi,QWORD PTR [rax+rcx*8]
      a5cc3f:	48 8b 97 a0 02 00 00 	mov    rdx,QWORD PTR [rdi+0x2a0]
      a5cc46:	48 29 c2             	sub    rdx,rax
      a5cc49:	48 c1 fa 03          	sar    rdx,0x3
      a5cc4d:	48 39 d1             	cmp    rcx,rdx
      a5cc50:	73 22                	jae    a5cc74 <__cxa_demangle@@Base+0x5914>
      a5cc52:	48 8b 34 c8          	mov    rsi,QWORD PTR [rax+rcx*8]
      a5cc56:	48 85 f6             	test   rsi,rsi
      a5cc59:	74 19                	je     a5cc74 <__cxa_demangle@@Base+0x5914>
      a5cc5b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      a5cc5e:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      a5cc62:	48 29 c6             	sub    rsi,rax
      a5cc65:	48 c1 fe 03          	sar    rsi,0x3

### 0xa5cc6e FDE=0xa5c940..0xa5cd2b
      a5cc6e:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
      a5cc5e:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
      a5cc62:	48 29 c6             	sub    rsi,rax
      a5cc65:	48 c1 fe 03          	sar    rsi,0x3
      a5cc69:	49 39 f7             	cmp    r15,rsi
      a5cc6c:	73 06                	jae    a5cc74 <__cxa_demangle@@Base+0x5914>
      a5cc6e:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
      a5cc72:	eb b5                	jmp    a5cc29 <__cxa_demangle@@Base+0x58c9>
      a5cc74:	31 c0                	xor    eax,eax
      a5cc76:	48 39 d1             	cmp    rcx,rdx
      a5cc79:	77 ae                	ja     a5cc29 <__cxa_demangle@@Base+0x58c9>
      a5cc7b:	48 39 8f 10 03 00 00 	cmp    QWORD PTR [rdi+0x310],rcx
      a5cc82:	75 a5                	jne    a5cc29 <__cxa_demangle@@Base+0x58c9>

### 0xa5cf80 FDE=0xa5ce60..0xa5d101
      a5cf80:	48 8b 44 f0 08       	mov    rax,QWORD PTR [rax+rsi*8+0x8]
      a5cf69:	48 8b 8f 30 01 00 00 	mov    rcx,QWORD PTR [rdi+0x130]
      a5cf70:	48 29 c1             	sub    rcx,rax
      a5cf73:	48 c1 f9 03          	sar    rcx,0x3
      a5cf77:	48 39 ca             	cmp    rdx,rcx
      a5cf7a:	0f 83 74 ff ff ff    	jae    a5cef4 <__cxa_demangle@@Base+0x5b94>
      a5cf80:	48 8b 44 f0 08       	mov    rax,QWORD PTR [rax+rsi*8+0x8]
      a5cf85:	e9 6c ff ff ff       	jmp    a5cef6 <__cxa_demangle@@Base+0x5b96>
      a5cf8a:	b8 05 00 00 00       	mov    eax,0x5
      a5cf8f:	eb 13                	jmp    a5cfa4 <__cxa_demangle@@Base+0x5c44>
      a5cf91:	b8 02 00 00 00       	mov    eax,0x2
      a5cf96:	eb 0c                	jmp    a5cfa4 <__cxa_demangle@@Base+0x5c44>
      a5cf98:	b8 03 00 00 00       	mov    eax,0x3

### 0xa62a18 FDE=0xa62970..0xa62a5e
      a62a18:	4a 8b 3c f8          	mov    rdi,QWORD PTR [rax+r15*8]
      a62a03:	66 c7 04 08 2c 20    	mov    WORD PTR [rax+rcx*1],0x202c
      a62a09:	4c 8b 6b 08          	mov    r13,QWORD PTR [rbx+0x8]
      a62a0d:	49 83 c5 02          	add    r13,0x2
      a62a11:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
      a62a15:	49 8b 06             	mov    rax,QWORD PTR [r14]
      a62a18:	4a 8b 3c f8          	mov    rdi,QWORD PTR [rax+r15*8]
      a62a1c:	45 31 f6             	xor    r14d,r14d
      a62a1f:	48 89 de             	mov    rsi,rbx
      a62a22:	ba 12 00 00 00       	mov    edx,0x12
      a62a27:	31 c9                	xor    ecx,ecx
      a62a29:	e8 62 f7 ff ff       	call   a62190 <__cxa_demangle@@Base+0xae30>
      a62a2e:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]

### 0xa68f9b FDE=0xa68f90..0xa68fae
      a68f9b:	48 8b 14 c1          	mov    rdx,QWORD PTR [rcx+rax*8]
      a68f8d:	cc                   	int3
      a68f8e:	cc                   	int3
      a68f8f:	cc                   	int3
      a68f90:	48 63 47 0c          	movsxd rax,DWORD PTR [rdi+0xc]
      a68f94:	48 8d 0d fd ba 92 ff 	lea    rcx,[rip+0xffffffffff92bafd]        # 394a98 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x1679>
      a68f9b:	48 8b 14 c1          	mov    rdx,QWORD PTR [rcx+rax*8]
      a68f9f:	48 8d 0d 22 bb 92 ff 	lea    rcx,[rip+0xffffffffff92bb22]        # 394ac8 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x16a9>
      a68fa6:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
      a68faa:	48 01 c8             	add    rax,rcx
      a68fad:	c3                   	ret
      a68fae:	cc                   	int3
      a68faf:	cc                   	int3

### 0xa69626 FDE=0xa69610..0xa6965e
      a69626:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a69616:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
      a69619:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a6961d:	48 39 c1             	cmp    rcx,rax
      a69620:	76 33                	jbe    a69655 <__cxa_demangle@@Base+0x122f5>
      a69622:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      a69626:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a6962a:	0f b6 47 09          	movzx  eax,BYTE PTR [rdi+0x9]
      a6962e:	89 c1                	mov    ecx,eax
      a69630:	80 e1 c0             	and    cl,0xc0
      a69633:	80 f9 80             	cmp    cl,0x80
      a69636:	75 20                	jne    a69658 <__cxa_demangle@@Base+0x122f8>
      a69638:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xa69676 FDE=0xa69660..0xa696ab
      a69676:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a69666:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
      a69669:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a6966d:	48 39 c1             	cmp    rcx,rax
      a69670:	76 30                	jbe    a696a2 <__cxa_demangle@@Base+0x12342>
      a69672:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      a69676:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a6967a:	0f b6 47 0a          	movzx  eax,BYTE PTR [rdi+0xa]
      a6967e:	24 03                	and    al,0x3
      a69680:	3c 02                	cmp    al,0x2
      a69682:	75 21                	jne    a696a5 <__cxa_demangle@@Base+0x12345>
      a69684:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a69687:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]

### 0xa696c6 FDE=0xa696b0..0xa696fe
      a696c6:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a696b6:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
      a696b9:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a696bd:	48 39 c1             	cmp    rcx,rax
      a696c0:	76 33                	jbe    a696f5 <__cxa_demangle@@Base+0x12395>
      a696c2:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      a696c6:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a696ca:	0f b7 47 09          	movzx  eax,WORD PTR [rdi+0x9]
      a696ce:	c1 e8 0a             	shr    eax,0xa
      a696d1:	24 03                	and    al,0x3
      a696d3:	3c 02                	cmp    al,0x2
      a696d5:	75 21                	jne    a696f8 <__cxa_demangle@@Base+0x12398>
      a696d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xa69716 FDE=0xa69700..0xa6973c
      a69716:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a69706:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
      a69709:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a6970d:	48 39 c1             	cmp    rcx,rax
      a69710:	76 26                	jbe    a69738 <__cxa_demangle@@Base+0x123d8>
      a69712:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      a69716:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a6971a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a6971d:	48 8b 40 18          	mov    rax,QWORD PTR [rax+0x18]
      a69721:	ff e0                	jmp    rax
      a69723:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a69727:	89 4e 1c             	mov    DWORD PTR [rsi+0x1c],ecx
      a6972a:	c7 46 18 00 00 00 00 	mov    DWORD PTR [rsi+0x18],0x0

### 0xa69756 FDE=0xa69740..0xa69779
      a69756:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a69746:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
      a69749:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a6974d:	48 39 c1             	cmp    rcx,rax
      a69750:	76 26                	jbe    a69778 <__cxa_demangle@@Base+0x12418>
      a69752:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      a69756:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a6975a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a6975d:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
      a69761:	ff e0                	jmp    rax
      a69763:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a69767:	89 4e 1c             	mov    DWORD PTR [rsi+0x1c],ecx
      a6976a:	c7 46 18 00 00 00 00 	mov    DWORD PTR [rsi+0x18],0x0

### 0xa69796 FDE=0xa69780..0xa697b9
      a69796:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a69786:	8b 46 18             	mov    eax,DWORD PTR [rsi+0x18]
      a69789:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a6978d:	48 39 c1             	cmp    rcx,rax
      a69790:	76 26                	jbe    a697b8 <__cxa_demangle@@Base+0x12458>
      a69792:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      a69796:	48 8b 3c c1          	mov    rdi,QWORD PTR [rcx+rax*8]
      a6979a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a6979d:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
      a697a1:	ff e0                	jmp    rax
      a697a3:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
      a697a7:	89 4e 1c             	mov    DWORD PTR [rsi+0x1c],ecx
      a697aa:	c7 46 18 00 00 00 00 	mov    DWORD PTR [rsi+0x18],0x0

### 0xa6e4f7 FDE=0xa6e1f0..0xa6e83e
      a6e4f7:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
      a6e4d9:	0f 87 b9 02 00 00    	ja     a6e798 <__gxx_personality_v0@@Base+0x788>
      a6e4df:	66 83 7c 24 38 00    	cmp    WORD PTR [rsp+0x38],0x0
      a6e4e5:	0f 84 ad 02 00 00    	je     a6e798 <__gxx_personality_v0@@Base+0x788>
      a6e4eb:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
      a6e4f0:	48 8d 0d 21 66 92 ff 	lea    rcx,[rip+0xffffffffff926621]        # 394b18 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x16f9>
      a6e4f7:	48 8b 04 c1          	mov    rax,QWORD PTR [rcx+rax*8]
      a6e4fb:	48 0f af c5          	imul   rax,rbp
      a6e4ff:	48 01 f0             	add    rax,rsi
      a6e502:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      a6e507:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
      a6e50c:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
      a6e511:	31 d2                	xor    edx,edx

### 0xa6ec99 FDE=0xa6ec00..0xa6ed1f
      a6ec99:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
      a6ec86:	41 80 fe 0c          	cmp    r14b,0xc
      a6ec8a:	77 70                	ja     a6ecfc <__cxa_call_unexpected@@Base+0x4bc>
      a6ec8c:	66 45 85 ff          	test   r15w,r15w
      a6ec90:	74 6a                	je     a6ecfc <__cxa_call_unexpected@@Base+0x4bc>
      a6ec92:	48 8d 05 7f 5e 92 ff 	lea    rax,[rip+0xffffffffff925e7f]        # 394b18 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x16f9>
      a6ec99:	4a 8b 04 f0          	mov    rax,QWORD PTR [rax+r14*8]
      a6ec9d:	49 0f af c4          	imul   rax,r12
      a6eca1:	48 03 44 24 10       	add    rax,QWORD PTR [rsp+0x10]
      a6eca6:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      a6ecab:	48 89 ef             	mov    rdi,rbp
      a6ecae:	89 de                	mov    esi,ebx
      a6ecb0:	48 8b 54 24 60       	mov    rdx,QWORD PTR [rsp+0x60]

### 0xa6f373 FDE=0xa6f240..0xa6f404
      a6f373:	4f 8b 7c ee 08       	mov    r15,QWORD PTR [r14+r13*8+0x8]
      a6f35a:	49 c7 06 01 00 00 00 	mov    QWORD PTR [r14],0x1
      a6f361:	4d 89 66 08          	mov    QWORD PTR [r14+0x8],r12
      a6f365:	8b 3d ad 16 f7 00    	mov    edi,DWORD PTR [rip+0xf716ad]        # 19e0a18 <__cxa_new_handler@@Base+0x2a8>
      a6f36b:	4c 89 f6             	mov    rsi,r14
      a6f36e:	e8 3d f0 d7 00       	call   17ee3b0 <pthread_setspecific@plt>
      a6f373:	4f 8b 7c ee 08       	mov    r15,QWORD PTR [r14+r13*8+0x8]
      a6f378:	4d 85 ff             	test   r15,r15
      a6f37b:	75 66                	jne    a6f3e3 <__emutls_get_address@@Base+0x1a3>
      a6f37d:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      a6f381:	48 83 f8 09          	cmp    rax,0x9
      a6f385:	41 bf 08 00 00 00    	mov    r15d,0x8
      a6f38b:	4c 0f 43 f8          	cmovae r15,rax

### 0xa6f3de FDE=0xa6f240..0xa6f404
      a6f3de:	4f 89 7c ee 08       	mov    QWORD PTR [r14+r13*8+0x8],r15
      a6f3cd:	e8 fe 06 d8 00       	call   17efad0 <memcpy@plt>
      a6f3d2:	eb 0a                	jmp    a6f3de <__emutls_get_address@@Base+0x19e>
      a6f3d4:	31 f6                	xor    esi,esi
      a6f3d6:	4c 89 e2             	mov    rdx,r12
      a6f3d9:	e8 b2 f7 d7 00       	call   17eeb90 <memset@plt>
      a6f3de:	4f 89 7c ee 08       	mov    QWORD PTR [r14+r13*8+0x8],r15
      a6f3e3:	4c 89 f8             	mov    rax,r15
      a6f3e6:	5b                   	pop    rbx
      a6f3e7:	41 5c                	pop    r12
      a6f3e9:	41 5d                	pop    r13
      a6f3eb:	41 5e                	pop    r14
      a6f3ed:	41 5f                	pop    r15

### 0xa6f4b8 FDE=0xa6f470..0xa6f4e0
      a6f4b8:	4a 8b 4c f3 10       	mov    rcx,QWORD PTR [rbx+r14*8+0x10]
      a6f4a8:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
      a6f4af:	00 
      a6f4b0:	49 ff c6             	inc    r14
      a6f4b3:	49 39 c6             	cmp    r14,rax
      a6f4b6:	73 19                	jae    a6f4d1 <__emutls_get_address@@Base+0x291>
      a6f4b8:	4a 8b 4c f3 10       	mov    rcx,QWORD PTR [rbx+r14*8+0x10]
      a6f4bd:	48 85 c9             	test   rcx,rcx
      a6f4c0:	74 ee                	je     a6f4b0 <__emutls_get_address@@Base+0x270>
      a6f4c2:	48 8b 79 f8          	mov    rdi,QWORD PTR [rcx-0x8]
      a6f4c6:	e8 95 f2 d7 00       	call   17ee760 <free@plt>
      a6f4cb:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      a6f4cf:	eb df                	jmp    a6f4b0 <__emutls_get_address@@Base+0x270>

### 0xa6f5b8 FDE=0xa6f4e0..0xa6f5f2
      a6f5b8:	49 c7 04 de 00 00 00 	mov    QWORD PTR [r14+rbx*8],0x0
      a6f5a8:	75 f6                	jne    a6f5a0 <__emutls_get_address@@Base+0x360>
      a6f5aa:	48 63 c7             	movsxd rax,edi
      a6f5ad:	48 89 d7             	mov    rdi,rdx
      a6f5b0:	48 89 c2             	mov    rdx,rax
      a6f5b3:	e8 18 05 d8 00       	call   17efad0 <memcpy@plt>
      a6f5b8:	49 c7 04 de 00 00 00 	mov    QWORD PTR [r14+rbx*8],0x0
      a6f5bf:	00 
      a6f5c0:	48 83 c4 08          	add    rsp,0x8
      a6f5c4:	5b                   	pop    rbx
      a6f5c5:	41 5e                	pop    r14
      a6f5c7:	c3                   	ret
      a6f5c8:	8d 41 ff             	lea    eax,[rcx-0x1]

### 0xa6f6fb FDE=0xa6f600..0xa6f7ac
      a6f6fb:	49 c7 04 de 00 00 00 	mov    QWORD PTR [r14+rbx*8],0x0
      a6f6ea:	48 63 c7             	movsxd rax,edi
      a6f6ed:	48 89 f7             	mov    rdi,rsi
      a6f6f0:	48 89 d6             	mov    rsi,rdx
      a6f6f3:	48 89 c2             	mov    rdx,rax
      a6f6f6:	e8 d5 03 d8 00       	call   17efad0 <memcpy@plt>
      a6f6fb:	49 c7 04 de 00 00 00 	mov    QWORD PTR [r14+rbx*8],0x0
      a6f702:	00 
      a6f703:	48 83 c4 08          	add    rsp,0x8
      a6f707:	5b                   	pop    rbx
      a6f708:	41 5e                	pop    r14
      a6f70a:	c3                   	ret
      a6f70b:	88 06                	mov    BYTE PTR [rsi],al

### 0xa6f8da FDE=0xa6f7b0..0xa6f973
      a6f8da:	4b c7 44 e5 00 00 00 	mov    QWORD PTR [r13+r12*8+0x0],0x0
      a6f8c7:	e8 04 02 d8 00       	call   17efad0 <memcpy@plt>
      a6f8cc:	4c 89 ff             	mov    rdi,r15
      a6f8cf:	4c 89 f6             	mov    rsi,r14
      a6f8d2:	48 89 da             	mov    rdx,rbx
      a6f8d5:	e8 f6 01 d8 00       	call   17efad0 <memcpy@plt>
      a6f8da:	4b c7 44 e5 00 00 00 	mov    QWORD PTR [r13+r12*8+0x0],0x0
      a6f8e1:	00 00 
      a6f8e3:	5b                   	pop    rbx
      a6f8e4:	41 5c                	pop    r12
      a6f8e6:	41 5d                	pop    r13
      a6f8e8:	41 5e                	pop    r14
      a6f8ea:	41 5f                	pop    r15

### 0xa7ec07 FDE=0xa7e773..0xa7f6a3
      a7ec07:	4a 8b 04 e8          	mov    rax,QWORD PTR [rax+r13*8]
      a7ebf5:	4c 89 e0             	mov    rax,r12
      a7ebf8:	31 d2                	xor    edx,edx
      a7ebfa:	48 f7 f5             	div    rbp
      a7ebfd:	49 89 d5             	mov    r13,rdx
      a7ec00:	48 8b 05 29 63 f6 00 	mov    rax,QWORD PTR [rip+0xf66329]        # 19e4f30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1960>
      a7ec07:	4a 8b 04 e8          	mov    rax,QWORD PTR [rax+r13*8]
      a7ec0b:	48 85 c0             	test   rax,rax
      a7ec0e:	74 45                	je     a7ec55 <JNI_OnUnload@@Base+0x6522>
      a7ec10:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      a7ec13:	48 85 f6             	test   rsi,rsi
      a7ec16:	74 3d                	je     a7ec55 <JNI_OnUnload@@Base+0x6522>
      a7ec18:	48 8d 7d ff          	lea    rdi,[rbp-0x1]

### 0xa7ee21 FDE=0xa7e773..0xa7f6a3
      a7ee21:	48 89 1c c8          	mov    QWORD PTR [rax+rcx*8],rbx
      a7ee0f:	48 89 c8             	mov    rax,rcx
      a7ee12:	31 d2                	xor    edx,edx
      a7ee14:	49 f7 f5             	div    r13
      a7ee17:	48 89 d1             	mov    rcx,rdx
      a7ee1a:	48 8b 05 0f 61 f6 00 	mov    rax,QWORD PTR [rip+0xf6610f]        # 19e4f30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1960>
      a7ee21:	48 89 1c c8          	mov    QWORD PTR [rax+rcx*8],rbx
      a7ee25:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
      a7ee28:	4d 85 c0             	test   r8,r8
      a7ee2b:	0f 84 12 01 00 00    	je     a7ef43 <JNI_OnUnload@@Base+0x6810>
      a7ee31:	4d 8d 4d ff          	lea    r9,[r13-0x1]
      a7ee35:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
      a7ee39:	83 fe 01             	cmp    esi,0x1

### 0xa7ee70 FDE=0xa7e773..0xa7f6a3
      a7ee70:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a7ee5c:	48 83 3c c2 00       	cmp    QWORD PTR [rdx+rax*8],0x0
      a7ee61:	74 3e                	je     a7eea1 <JNI_OnUnload@@Base+0x676e>
      a7ee63:	49 8b 10             	mov    rdx,QWORD PTR [r8]
      a7ee66:	48 89 17             	mov    QWORD PTR [rdi],rdx
      a7ee69:	48 8b 15 c0 60 f6 00 	mov    rdx,QWORD PTR [rip+0xf660c0]        # 19e4f30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1960>
      a7ee70:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a7ee74:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      a7ee77:	49 89 10             	mov    QWORD PTR [r8],rdx
      a7ee7a:	48 8b 15 af 60 f6 00 	mov    rdx,QWORD PTR [rip+0xf660af]        # 19e4f30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1960>
      a7ee81:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a7ee85:	4c 89 00             	mov    QWORD PTR [rax],r8
      a7ee88:	49 89 f8             	mov    r8,rdi

### 0xa7ee81 FDE=0xa7e773..0xa7f6a3
      a7ee81:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a7ee69:	48 8b 15 c0 60 f6 00 	mov    rdx,QWORD PTR [rip+0xf660c0]        # 19e4f30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1960>
      a7ee70:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a7ee74:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      a7ee77:	49 89 10             	mov    QWORD PTR [r8],rdx
      a7ee7a:	48 8b 15 af 60 f6 00 	mov    rdx,QWORD PTR [rip+0xf660af]        # 19e4f30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1960>
      a7ee81:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a7ee85:	4c 89 00             	mov    QWORD PTR [rax],r8
      a7ee88:	49 89 f8             	mov    r8,rdi
      a7ee8b:	48 89 c8             	mov    rax,rcx
      a7ee8e:	4c 89 c7             	mov    rdi,r8
      a7ee91:	4d 8b 00             	mov    r8,QWORD PTR [r8]
      a7ee94:	48 89 c1             	mov    rcx,rax

### 0xa7eea1 FDE=0xa7e773..0xa7f6a3
      a7eea1:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
      a7ee91:	4d 8b 00             	mov    r8,QWORD PTR [r8]
      a7ee94:	48 89 c1             	mov    rcx,rax
      a7ee97:	4d 85 c0             	test   r8,r8
      a7ee9a:	75 99                	jne    a7ee35 <JNI_OnUnload@@Base+0x6702>
      a7ee9c:	e9 a2 00 00 00       	jmp    a7ef43 <JNI_OnUnload@@Base+0x6810>
      a7eea1:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
      a7eea5:	eb e7                	jmp    a7ee8e <JNI_OnUnload@@Base+0x675b>
      a7eea7:	48 89 c1             	mov    rcx,rax
      a7eeaa:	48 d1 e9             	shr    rcx,1
      a7eead:	83 e0 01             	and    eax,0x1
      a7eeb0:	48 09 c8             	or     rax,rcx
      a7eeb3:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax

### 0xa7ef72 FDE=0xa7e773..0xa7f6a3
      a7ef72:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
      a7ef60:	4c 89 e0             	mov    rax,r12
      a7ef63:	31 d2                	xor    edx,edx
      a7ef65:	48 f7 f5             	div    rbp
      a7ef68:	49 89 d4             	mov    r12,rdx
      a7ef6b:	48 8b 05 be 5f f6 00 	mov    rax,QWORD PTR [rip+0xf65fbe]        # 19e4f30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1960>
      a7ef72:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
      a7ef76:	48 8b 8c 24 08 01 00 	mov    rcx,QWORD PTR [rsp+0x108]
      a7ef7d:	00 
      a7ef7e:	48 85 c0             	test   rax,rax
      a7ef81:	74 08                	je     a7ef8b <JNI_OnUnload@@Base+0x6858>
      a7ef83:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      a7ef86:	48 89 11             	mov    QWORD PTR [rcx],rdx

### 0xa7efa3 FDE=0xa7e773..0xa7f6a3
      a7efa3:	4a 89 1c e0          	mov    QWORD PTR [rax+r12*8],rbx
      a7ef89:	eb 4e                	jmp    a7efd9 <JNI_OnUnload@@Base+0x68a6>
      a7ef8b:	48 8b 05 ae 5f f6 00 	mov    rax,QWORD PTR [rip+0xf65fae]        # 19e4f40 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1970>
      a7ef92:	48 89 01             	mov    QWORD PTR [rcx],rax
      a7ef95:	48 89 0d a4 5f f6 00 	mov    QWORD PTR [rip+0xf65fa4],rcx        # 19e4f40 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1970>
      a7ef9c:	48 8b 05 8d 5f f6 00 	mov    rax,QWORD PTR [rip+0xf65f8d]        # 19e4f30 <_ZGVZN4asio5error17get_misc_categoryEvE8instance@@Base+0x1960>
      a7efa3:	4a 89 1c e0          	mov    QWORD PTR [rax+r12*8],rbx
      a7efa7:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      a7efaa:	48 85 c0             	test   rax,rax
      a7efad:	74 2d                	je     a7efdc <JNI_OnUnload@@Base+0x68a9>
      a7efaf:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      a7efb3:	48 8d 55 ff          	lea    rdx,[rbp-0x1]
      a7efb7:	48 85 d5             	test   rbp,rdx

### 0xa8bbbe FDE=0xa8ae88..0xa8c879
      a8bbbe:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
      a8bbac:	4c 89 f8             	mov    rax,r15
      a8bbaf:	31 d2                	xor    edx,edx
      a8bbb1:	49 f7 f5             	div    r13
      a8bbb4:	49 89 d4             	mov    r12,rdx
      a8bbb7:	48 8b 05 d2 f0 f5 00 	mov    rax,QWORD PTR [rip+0xf5f0d2]        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8bbbe:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
      a8bbc2:	48 85 c0             	test   rax,rax
      a8bbc5:	74 44                	je     a8bc0b <JNI_OnUnload@@Base+0x134d8>
      a8bbc7:	48 8b 30             	mov    rsi,QWORD PTR [rax]
      a8bbca:	48 85 f6             	test   rsi,rsi
      a8bbcd:	74 3c                	je     a8bc0b <JNI_OnUnload@@Base+0x134d8>
      a8bbcf:	49 8d 7d ff          	lea    rdi,[r13-0x1]

### 0xa8bdd9 FDE=0xa8ae88..0xa8c879
      a8bdd9:	48 89 2c c8          	mov    QWORD PTR [rax+rcx*8],rbp
      a8bdc7:	48 89 c8             	mov    rax,rcx
      a8bdca:	31 d2                	xor    edx,edx
      a8bdcc:	49 f7 f4             	div    r12
      a8bdcf:	48 89 d1             	mov    rcx,rdx
      a8bdd2:	48 8b 05 b7 ee f5 00 	mov    rax,QWORD PTR [rip+0xf5eeb7]        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8bdd9:	48 89 2c c8          	mov    QWORD PTR [rax+rcx*8],rbp
      a8bddd:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
      a8bde0:	4d 85 c0             	test   r8,r8
      a8bde3:	0f 84 13 01 00 00    	je     a8befc <JNI_OnUnload@@Base+0x137c9>
      a8bde9:	4d 8d 4c 24 ff       	lea    r9,[r12-0x1]
      a8bdee:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
      a8bdf2:	83 fe 01             	cmp    esi,0x1

### 0xa8be29 FDE=0xa8ae88..0xa8c879
      a8be29:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a8be15:	48 83 3c c2 00       	cmp    QWORD PTR [rdx+rax*8],0x0
      a8be1a:	74 3e                	je     a8be5a <JNI_OnUnload@@Base+0x13727>
      a8be1c:	49 8b 10             	mov    rdx,QWORD PTR [r8]
      a8be1f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      a8be22:	48 8b 15 67 ee f5 00 	mov    rdx,QWORD PTR [rip+0xf5ee67]        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8be29:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a8be2d:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      a8be30:	49 89 10             	mov    QWORD PTR [r8],rdx
      a8be33:	48 8b 15 56 ee f5 00 	mov    rdx,QWORD PTR [rip+0xf5ee56]        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8be3a:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a8be3e:	4c 89 00             	mov    QWORD PTR [rax],r8
      a8be41:	49 89 f8             	mov    r8,rdi

### 0xa8be3a FDE=0xa8ae88..0xa8c879
      a8be3a:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a8be22:	48 8b 15 67 ee f5 00 	mov    rdx,QWORD PTR [rip+0xf5ee67]        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8be29:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a8be2d:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      a8be30:	49 89 10             	mov    QWORD PTR [r8],rdx
      a8be33:	48 8b 15 56 ee f5 00 	mov    rdx,QWORD PTR [rip+0xf5ee56]        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8be3a:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a8be3e:	4c 89 00             	mov    QWORD PTR [rax],r8
      a8be41:	49 89 f8             	mov    r8,rdi
      a8be44:	48 89 c8             	mov    rax,rcx
      a8be47:	4c 89 c7             	mov    rdi,r8
      a8be4a:	4d 8b 00             	mov    r8,QWORD PTR [r8]
      a8be4d:	48 89 c1             	mov    rcx,rax

### 0xa8be5a FDE=0xa8ae88..0xa8c879
      a8be5a:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
      a8be4a:	4d 8b 00             	mov    r8,QWORD PTR [r8]
      a8be4d:	48 89 c1             	mov    rcx,rax
      a8be50:	4d 85 c0             	test   r8,r8
      a8be53:	75 99                	jne    a8bdee <JNI_OnUnload@@Base+0x136bb>
      a8be55:	e9 a2 00 00 00       	jmp    a8befc <JNI_OnUnload@@Base+0x137c9>
      a8be5a:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
      a8be5e:	eb e7                	jmp    a8be47 <JNI_OnUnload@@Base+0x13714>
      a8be60:	48 89 c1             	mov    rcx,rax
      a8be63:	48 d1 e9             	shr    rcx,1
      a8be66:	83 e0 01             	and    eax,0x1
      a8be69:	48 09 c8             	or     rax,rcx
      a8be6c:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax

### 0xa8bf28 FDE=0xa8ae88..0xa8c879
      a8bf28:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
      a8bf16:	4c 89 f8             	mov    rax,r15
      a8bf19:	31 d2                	xor    edx,edx
      a8bf1b:	49 f7 f5             	div    r13
      a8bf1e:	49 89 d7             	mov    r15,rdx
      a8bf21:	48 8b 05 68 ed f5 00 	mov    rax,QWORD PTR [rip+0xf5ed68]        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8bf28:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
      a8bf2c:	48 8b 8c 24 d8 07 00 	mov    rcx,QWORD PTR [rsp+0x7d8]
      a8bf33:	00 
      a8bf34:	48 85 c0             	test   rax,rax
      a8bf37:	74 08                	je     a8bf41 <JNI_OnUnload@@Base+0x1380e>
      a8bf39:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      a8bf3c:	48 89 11             	mov    QWORD PTR [rcx],rdx

### 0xa8bf59 FDE=0xa8ae88..0xa8c879
      a8bf59:	4a 89 2c f8          	mov    QWORD PTR [rax+r15*8],rbp
      a8bf3f:	eb 4e                	jmp    a8bf8f <JNI_OnUnload@@Base+0x1385c>
      a8bf41:	48 8b 05 58 ed f5 00 	mov    rax,QWORD PTR [rip+0xf5ed58]        # 19eaca0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18d8>
      a8bf48:	48 89 01             	mov    QWORD PTR [rcx],rax
      a8bf4b:	48 89 0d 4e ed f5 00 	mov    QWORD PTR [rip+0xf5ed4e],rcx        # 19eaca0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18d8>
      a8bf52:	48 8b 05 37 ed f5 00 	mov    rax,QWORD PTR [rip+0xf5ed37]        # 19eac90 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x18c8>
      a8bf59:	4a 89 2c f8          	mov    QWORD PTR [rax+r15*8],rbp
      a8bf5d:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      a8bf60:	48 85 c0             	test   rax,rax
      a8bf63:	74 2d                	je     a8bf92 <JNI_OnUnload@@Base+0x1385f>
      a8bf65:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      a8bf69:	49 8d 55 ff          	lea    rdx,[r13-0x1]
      a8bf6d:	49 85 d5             	test   r13,rdx

### 0xa91c30 FDE=0xa91a70..0xa92141
      a91c30:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
      a91c1e:	4c 89 f8             	mov    rax,r15
      a91c21:	31 d2                	xor    edx,edx
      a91c23:	49 f7 f6             	div    r14
      a91c26:	49 89 d4             	mov    r12,rdx
      a91c29:	48 8b 05 b0 9f f5 00 	mov    rax,QWORD PTR [rip+0xf59fb0]        # 19ebbe0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2818>
      a91c30:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
      a91c34:	48 85 c0             	test   rax,rax
      a91c37:	74 55                	je     a91c8e <JNI_OnUnload@@Base+0x1955b>
      a91c39:	48 8b 18             	mov    rbx,QWORD PTR [rax]
      a91c3c:	48 85 db             	test   rbx,rbx
      a91c3f:	74 4d                	je     a91c8e <JNI_OnUnload@@Base+0x1955b>
      a91c41:	49 8d 46 ff          	lea    rax,[r14-0x1]

### 0xa91e59 FDE=0xa91a70..0xa92141
      a91e59:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
      a91e43:	31 d2                	xor    edx,edx
      a91e45:	49 f7 f4             	div    r12
      a91e48:	48 89 d1             	mov    rcx,rdx
      a91e4b:	48 8b 05 8e 9d f5 00 	mov    rax,QWORD PTR [rip+0xf59d8e]        # 19ebbe0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2818>
      a91e52:	48 8d 15 97 9d f5 00 	lea    rdx,[rip+0xf59d97]        # 19ebbf0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2828>
      a91e59:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
      a91e5d:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
      a91e60:	4d 85 c0             	test   r8,r8
      a91e63:	0f 84 13 01 00 00    	je     a91f7c <JNI_OnUnload@@Base+0x19849>
      a91e69:	4d 8d 4c 24 ff       	lea    r9,[r12-0x1]
      a91e6e:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
      a91e72:	83 fe 01             	cmp    esi,0x1

### 0xa91ea9 FDE=0xa91a70..0xa92141
      a91ea9:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a91e95:	48 83 3c c2 00       	cmp    QWORD PTR [rdx+rax*8],0x0
      a91e9a:	74 3e                	je     a91eda <JNI_OnUnload@@Base+0x197a7>
      a91e9c:	49 8b 10             	mov    rdx,QWORD PTR [r8]
      a91e9f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      a91ea2:	48 8b 15 37 9d f5 00 	mov    rdx,QWORD PTR [rip+0xf59d37]        # 19ebbe0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2818>
      a91ea9:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a91ead:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      a91eb0:	49 89 10             	mov    QWORD PTR [r8],rdx
      a91eb3:	48 8b 15 26 9d f5 00 	mov    rdx,QWORD PTR [rip+0xf59d26]        # 19ebbe0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2818>
      a91eba:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a91ebe:	4c 89 00             	mov    QWORD PTR [rax],r8
      a91ec1:	49 89 f8             	mov    r8,rdi

### 0xa91eba FDE=0xa91a70..0xa92141
      a91eba:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a91ea2:	48 8b 15 37 9d f5 00 	mov    rdx,QWORD PTR [rip+0xf59d37]        # 19ebbe0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2818>
      a91ea9:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a91ead:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      a91eb0:	49 89 10             	mov    QWORD PTR [r8],rdx
      a91eb3:	48 8b 15 26 9d f5 00 	mov    rdx,QWORD PTR [rip+0xf59d26]        # 19ebbe0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2818>
      a91eba:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a91ebe:	4c 89 00             	mov    QWORD PTR [rax],r8
      a91ec1:	49 89 f8             	mov    r8,rdi
      a91ec4:	48 89 c8             	mov    rax,rcx
      a91ec7:	4c 89 c7             	mov    rdi,r8
      a91eca:	4d 8b 00             	mov    r8,QWORD PTR [r8]
      a91ecd:	48 89 c1             	mov    rcx,rax

### 0xa91eda FDE=0xa91a70..0xa92141
      a91eda:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
      a91eca:	4d 8b 00             	mov    r8,QWORD PTR [r8]
      a91ecd:	48 89 c1             	mov    rcx,rax
      a91ed0:	4d 85 c0             	test   r8,r8
      a91ed3:	75 99                	jne    a91e6e <JNI_OnUnload@@Base+0x1973b>
      a91ed5:	e9 a2 00 00 00       	jmp    a91f7c <JNI_OnUnload@@Base+0x19849>
      a91eda:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
      a91ede:	eb e7                	jmp    a91ec7 <JNI_OnUnload@@Base+0x19794>
      a91ee0:	48 89 c1             	mov    rcx,rax
      a91ee3:	48 d1 e9             	shr    rcx,1
      a91ee6:	83 e0 01             	and    eax,0x1
      a91ee9:	48 09 c8             	or     rax,rcx
      a91eec:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax

### 0xa91fa8 FDE=0xa91a70..0xa92141
      a91fa8:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
      a91f96:	4c 89 f8             	mov    rax,r15
      a91f99:	31 d2                	xor    edx,edx
      a91f9b:	49 f7 f6             	div    r14
      a91f9e:	49 89 d7             	mov    r15,rdx
      a91fa1:	48 8b 05 38 9c f5 00 	mov    rax,QWORD PTR [rip+0xf59c38]        # 19ebbe0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2818>
      a91fa8:	4a 8b 04 f8          	mov    rax,QWORD PTR [rax+r15*8]
      a91fac:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
      a91fb1:	48 85 c0             	test   rax,rax
      a91fb4:	74 08                	je     a91fbe <JNI_OnUnload@@Base+0x1988b>
      a91fb6:	48 8b 10             	mov    rdx,QWORD PTR [rax]
      a91fb9:	48 89 11             	mov    QWORD PTR [rcx],rdx
      a91fbc:	eb 55                	jmp    a92013 <JNI_OnUnload@@Base+0x198e0>

### 0xa91fdd FDE=0xa91a70..0xa92141
      a91fdd:	4a 89 14 f8          	mov    QWORD PTR [rax+r15*8],rdx
      a91fbe:	48 8b 05 2b 9c f5 00 	mov    rax,QWORD PTR [rip+0xf59c2b]        # 19ebbf0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2828>
      a91fc5:	48 89 01             	mov    QWORD PTR [rcx],rax
      a91fc8:	48 89 0d 21 9c f5 00 	mov    QWORD PTR [rip+0xf59c21],rcx        # 19ebbf0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2828>
      a91fcf:	48 8b 05 0a 9c f5 00 	mov    rax,QWORD PTR [rip+0xf59c0a]        # 19ebbe0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2818>
      a91fd6:	48 8d 15 13 9c f5 00 	lea    rdx,[rip+0xf59c13]        # 19ebbf0 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x2828>
      a91fdd:	4a 89 14 f8          	mov    QWORD PTR [rax+r15*8],rdx
      a91fe1:	48 8b 01             	mov    rax,QWORD PTR [rcx]
      a91fe4:	48 85 c0             	test   rax,rax
      a91fe7:	74 2d                	je     a92016 <JNI_OnUnload@@Base+0x198e3>
      a91fe9:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      a91fed:	49 8d 56 ff          	lea    rdx,[r14-0x1]
      a91ff1:	49 85 d6             	test   r14,rdx

### 0xa9ca30 FDE=0xa9ca1f..0xa9ca4e
      a9ca30:	48 8b 14 c8          	mov    rdx,QWORD PTR [rax+rcx*8]
      a9ca1a:	e9 81 14 d5 00       	jmp    17edea0 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6__initEPKcm@plt>
      a9ca1f:	40 80 ff 03          	cmp    dil,0x3
      a9ca23:	77 1e                	ja     a9ca43 <JNI_OnUnload@@Base+0x24310>
      a9ca25:	48 8d 05 64 2e 8f ff 	lea    rax,[rip+0xffffffffff8f2e64]        # 38f890 <_ZTSSt12bad_any_cast@@Base-0x938>
      a9ca2c:	40 0f b6 cf          	movzx  ecx,dil
      a9ca30:	48 8b 14 c8          	mov    rdx,QWORD PTR [rax+rcx*8]
      a9ca34:	48 8d 35 89 1e 90 ff 	lea    rsi,[rip+0xffffffffff901e89]        # 39e8c4 <_ZTSNSt6__ndk117bad_function_callE@@Base+0xac>
      a9ca3b:	48 63 04 8e          	movsxd rax,DWORD PTR [rsi+rcx*4]
      a9ca3f:	48 01 f0             	add    rax,rsi
      a9ca42:	c3                   	ret
      a9ca43:	48 8d 05 ce 51 9b ff 	lea    rax,[rip+0xffffffffff9b51ce]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      a9ca4a:	6a 07                	push   0x7

### 0xa9eb2d FDE=0xa9e80f..0xa9f4eb
      a9eb2d:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
      a9eb1d:	31 d2                	xor    edx,edx
      a9eb1f:	48 f7 f5             	div    rbp
      a9eb22:	49 89 d4             	mov    r12,rdx
      a9eb25:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
      a9eb2c:	00 
      a9eb2d:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
      a9eb31:	48 85 c0             	test   rax,rax
      a9eb34:	74 5d                	je     a9eb93 <JNI_OnUnload@@Base+0x26460>
      a9eb36:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a9eb39:	48 85 c9             	test   rcx,rcx
      a9eb3c:	74 55                	je     a9eb93 <JNI_OnUnload@@Base+0x26460>
      a9eb3e:	48 8d 45 ff          	lea    rax,[rbp-0x1]

### 0xa9ec05 FDE=0xa9e80f..0xa9f4eb
      a9ec05:	48 8b 04 e8          	mov    rax,QWORD PTR [rax+rbp*8]
      a9ebf5:	31 d2                	xor    edx,edx
      a9ebf7:	49 f7 f4             	div    r12
      a9ebfa:	48 89 d5             	mov    rbp,rdx
      a9ebfd:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
      a9ec04:	00 
      a9ec05:	48 8b 04 e8          	mov    rax,QWORD PTR [rax+rbp*8]
      a9ec09:	48 85 c0             	test   rax,rax
      a9ec0c:	74 6a                	je     a9ec78 <JNI_OnUnload@@Base+0x26545>
      a9ec0e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a9ec11:	48 85 c9             	test   rcx,rcx
      a9ec14:	74 62                	je     a9ec78 <JNI_OnUnload@@Base+0x26545>
      a9ec16:	49 89 ef             	mov    r15,rbp

### 0xa9ee74 FDE=0xa9e80f..0xa9f4eb
      a9ee74:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
      a9ee61:	48 89 d1             	mov    rcx,rdx
      a9ee64:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
      a9ee6b:	00 
      a9ee6c:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
      a9ee73:	00 
      a9ee74:	48 89 14 c8          	mov    QWORD PTR [rax+rcx*8],rdx
      a9ee78:	4c 8b 07             	mov    r8,QWORD PTR [rdi]
      a9ee7b:	4d 85 c0             	test   r8,r8
      a9ee7e:	0f 84 28 01 00 00    	je     a9efac <JNI_OnUnload@@Base+0x26879>
      a9ee84:	4c 8d 4b ff          	lea    r9,[rbx-0x1]
      a9ee88:	49 8b 40 08          	mov    rax,QWORD PTR [r8+0x8]
      a9ee8c:	83 fe 01             	cmp    esi,0x1

### 0xa9eec5 FDE=0xa9e80f..0xa9f4eb
      a9eec5:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a9eeb5:	74 40                	je     a9eef7 <JNI_OnUnload@@Base+0x267c4>
      a9eeb7:	49 8b 10             	mov    rdx,QWORD PTR [r8]
      a9eeba:	48 89 17             	mov    QWORD PTR [rdi],rdx
      a9eebd:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
      a9eec4:	00 
      a9eec5:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a9eec9:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      a9eecc:	49 89 10             	mov    QWORD PTR [r8],rdx
      a9eecf:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
      a9eed6:	00 
      a9eed7:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a9eedb:	4c 89 00             	mov    QWORD PTR [rax],r8

### 0xa9eed7 FDE=0xa9e80f..0xa9f4eb
      a9eed7:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a9eec5:	48 8b 14 c2          	mov    rdx,QWORD PTR [rdx+rax*8]
      a9eec9:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
      a9eecc:	49 89 10             	mov    QWORD PTR [r8],rdx
      a9eecf:	48 8b 94 24 e0 00 00 	mov    rdx,QWORD PTR [rsp+0xe0]
      a9eed6:	00 
      a9eed7:	48 8b 04 c2          	mov    rax,QWORD PTR [rdx+rax*8]
      a9eedb:	4c 89 00             	mov    QWORD PTR [rax],r8
      a9eede:	49 89 f8             	mov    r8,rdi
      a9eee1:	48 89 c8             	mov    rax,rcx
      a9eee4:	4c 89 c7             	mov    rdi,r8
      a9eee7:	4d 8b 00             	mov    r8,QWORD PTR [r8]
      a9eeea:	48 89 c1             	mov    rcx,rax

### 0xa9eef7 FDE=0xa9e80f..0xa9f4eb
      a9eef7:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
      a9eee7:	4d 8b 00             	mov    r8,QWORD PTR [r8]
      a9eeea:	48 89 c1             	mov    rcx,rax
      a9eeed:	4d 85 c0             	test   r8,r8
      a9eef0:	75 96                	jne    a9ee88 <JNI_OnUnload@@Base+0x26755>
      a9eef2:	e9 b5 00 00 00       	jmp    a9efac <JNI_OnUnload@@Base+0x26879>
      a9eef7:	48 89 3c c2          	mov    QWORD PTR [rdx+rax*8],rdi
      a9eefb:	eb e7                	jmp    a9eee4 <JNI_OnUnload@@Base+0x267b1>
      a9eefd:	4c 8b 64 24 40       	mov    r12,QWORD PTR [rsp+0x40]
      a9ef02:	e9 84 01 00 00       	jmp    a9f08b <JNI_OnUnload@@Base+0x26958>
      a9ef07:	48 89 c1             	mov    rcx,rax
      a9ef0a:	48 d1 e9             	shr    rcx,1
      a9ef0d:	83 e0 01             	and    eax,0x1

### 0xa9efde FDE=0xa9e80f..0xa9f4eb
      a9efde:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
      a9efce:	48 89 d0             	mov    rax,rdx
      a9efd1:	31 d2                	xor    edx,edx
      a9efd3:	49 f7 f4             	div    r12
      a9efd6:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
      a9efdd:	00 
      a9efde:	48 8b 04 d0          	mov    rax,QWORD PTR [rax+rdx*8]
      a9efe2:	48 8b ac 24 08 01 00 	mov    rbp,QWORD PTR [rsp+0x108]
      a9efe9:	00 
      a9efea:	48 85 c0             	test   rax,rax
      a9efed:	74 09                	je     a9eff8 <JNI_OnUnload@@Base+0x268c5>
      a9efef:	48 8b 08             	mov    rcx,QWORD PTR [rax]
      a9eff2:	48 89 4d 00          	mov    QWORD PTR [rbp+0x0],rcx

### 0xa9f01c FDE=0xa9e80f..0xa9f4eb
      a9f01c:	48 89 0c d0          	mov    QWORD PTR [rax+rdx*8],rcx
      a9f00b:	00 
      a9f00c:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
      a9f013:	00 
      a9f014:	48 8d 8c 24 f0 00 00 	lea    rcx,[rsp+0xf0]
      a9f01b:	00 
      a9f01c:	48 89 0c d0          	mov    QWORD PTR [rax+rdx*8],rcx
      a9f020:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
      a9f024:	48 85 c0             	test   rax,rax
      a9f027:	74 2f                	je     a9f058 <JNI_OnUnload@@Base+0x26925>
      a9f029:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      a9f02d:	49 8d 4c 24 ff       	lea    rcx,[r12-0x1]
      a9f032:	49 85 cc             	test   r12,rcx

### 0xaa416f FDE=0xaa1418..0xaa6ad6
      aa416f:	4a 8b bc e4 30 10 00 	mov    rdi,QWORD PTR [rsp+r12*8+0x1030]
      aa4159:	e8 0e 08 01 00       	call   ab496c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x190c>
      aa415e:	4c 89 b4 24 38 19 00 	mov    QWORD PTR [rsp+0x1938],r14
      aa4165:	00 
      aa4166:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      aa416a:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
      aa416f:	4a 8b bc e4 30 10 00 	mov    rdi,QWORD PTR [rsp+r12*8+0x1030]
      aa4176:	00 
      aa4177:	4a 89 84 e4 30 10 00 	mov    QWORD PTR [rsp+r12*8+0x1030],rax
      aa417e:	00 
      aa417f:	48 85 ff             	test   rdi,rdi
      aa4182:	74 06                	je     aa418a <JNI_OnUnload@@Base+0x2ba57>
      aa4184:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xaa4177 FDE=0xaa1418..0xaa6ad6
      aa4177:	4a 89 84 e4 30 10 00 	mov    QWORD PTR [rsp+r12*8+0x1030],rax
      aa4165:	00 
      aa4166:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      aa416a:	49 83 65 00 00       	and    QWORD PTR [r13+0x0],0x0
      aa416f:	4a 8b bc e4 30 10 00 	mov    rdi,QWORD PTR [rsp+r12*8+0x1030]
      aa4176:	00 
      aa4177:	4a 89 84 e4 30 10 00 	mov    QWORD PTR [rsp+r12*8+0x1030],rax
      aa417e:	00 
      aa417f:	48 85 ff             	test   rdi,rdi
      aa4182:	74 06                	je     aa418a <JNI_OnUnload@@Base+0x2ba57>
      aa4184:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aa4187:	ff 50 08             	call   QWORD PTR [rax+0x8]
      aa418a:	49 83 c5 08          	add    r13,0x8

### 0xaa454e FDE=0xaa1418..0xaa6ad6
      aa454e:	0f 10 8c c4 30 10 00 	movups xmm1,XMMWORD PTR [rsp+rax*8+0x1030]
      aa453c:	00 
      aa453d:	c6 84 24 48 19 00 00 	mov    BYTE PTR [rsp+0x1948],0x1
      aa4544:	01 
      aa4545:	b8 24 01 00 00       	mov    eax,0x124
      aa454a:	66 0f ef c0          	pxor   xmm0,xmm0
      aa454e:	0f 10 8c c4 30 10 00 	movups xmm1,XMMWORD PTR [rsp+rax*8+0x1030]
      aa4555:	00 
      aa4556:	f3 0f 7f 84 c4 30 10 	movdqu XMMWORD PTR [rsp+rax*8+0x1030],xmm0
      aa455d:	00 00 
      aa455f:	0f 11 8c c4 f0 fe ff 	movups XMMWORD PTR [rsp+rax*8-0x110],xmm1
      aa4566:	ff 
      aa4567:	48 83 c0 02          	add    rax,0x2

### 0xaa4556 FDE=0xaa1418..0xaa6ad6
      aa4556:	f3 0f 7f 84 c4 30 10 	movdqu XMMWORD PTR [rsp+rax*8+0x1030],xmm0
      aa4544:	01 
      aa4545:	b8 24 01 00 00       	mov    eax,0x124
      aa454a:	66 0f ef c0          	pxor   xmm0,xmm0
      aa454e:	0f 10 8c c4 30 10 00 	movups xmm1,XMMWORD PTR [rsp+rax*8+0x1030]
      aa4555:	00 
      aa4556:	f3 0f 7f 84 c4 30 10 	movdqu XMMWORD PTR [rsp+rax*8+0x1030],xmm0
      aa455d:	00 00 
      aa455f:	0f 11 8c c4 f0 fe ff 	movups XMMWORD PTR [rsp+rax*8-0x110],xmm1
      aa4566:	ff 
      aa4567:	48 83 c0 02          	add    rax,0x2
      aa456b:	48 3d 24 02 00 00    	cmp    rax,0x224
      aa4571:	75 db                	jne    aa454e <JNI_OnUnload@@Base+0x2be1b>

### 0xaa45a9 FDE=0xaa1418..0xaa6ad6
      aa45a9:	4a 8b 84 f4 10 08 00 	mov    rax,QWORD PTR [rsp+r14*8+0x810]
      aa4595:	0f 11 84 24 50 21 00 	movups XMMWORD PTR [rsp+0x2150],xmm0
      aa459c:	00 
      aa459d:	48 83 a4 24 60 21 00 	and    QWORD PTR [rsp+0x2160],0x0
      aa45a4:	00 00 
      aa45a6:	45 31 f6             	xor    r14d,r14d
      aa45a9:	4a 8b 84 f4 10 08 00 	mov    rax,QWORD PTR [rsp+r14*8+0x810]
      aa45b0:	00 
      aa45b1:	4a 83 a4 f4 10 08 00 	and    QWORD PTR [rsp+r14*8+0x810],0x0
      aa45b8:	00 00 
      aa45ba:	4b 8b bc f5 d8 02 00 	mov    rdi,QWORD PTR [r13+r14*8+0x2d8]
      aa45c1:	00 
      aa45c2:	4b 89 84 f5 d8 02 00 	mov    QWORD PTR [r13+r14*8+0x2d8],rax

### 0xaa45ba FDE=0xaa1418..0xaa6ad6
      aa45ba:	4b 8b bc f5 d8 02 00 	mov    rdi,QWORD PTR [r13+r14*8+0x2d8]
      aa45a6:	45 31 f6             	xor    r14d,r14d
      aa45a9:	4a 8b 84 f4 10 08 00 	mov    rax,QWORD PTR [rsp+r14*8+0x810]
      aa45b0:	00 
      aa45b1:	4a 83 a4 f4 10 08 00 	and    QWORD PTR [rsp+r14*8+0x810],0x0
      aa45b8:	00 00 
      aa45ba:	4b 8b bc f5 d8 02 00 	mov    rdi,QWORD PTR [r13+r14*8+0x2d8]
      aa45c1:	00 
      aa45c2:	4b 89 84 f5 d8 02 00 	mov    QWORD PTR [r13+r14*8+0x2d8],rax
      aa45c9:	00 
      aa45ca:	48 85 ff             	test   rdi,rdi
      aa45cd:	74 06                	je     aa45d5 <JNI_OnUnload@@Base+0x2bea2>
      aa45cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xaa45c2 FDE=0xaa1418..0xaa6ad6
      aa45c2:	4b 89 84 f5 d8 02 00 	mov    QWORD PTR [r13+r14*8+0x2d8],rax
      aa45b0:	00 
      aa45b1:	4a 83 a4 f4 10 08 00 	and    QWORD PTR [rsp+r14*8+0x810],0x0
      aa45b8:	00 00 
      aa45ba:	4b 8b bc f5 d8 02 00 	mov    rdi,QWORD PTR [r13+r14*8+0x2d8]
      aa45c1:	00 
      aa45c2:	4b 89 84 f5 d8 02 00 	mov    QWORD PTR [r13+r14*8+0x2d8],rax
      aa45c9:	00 
      aa45ca:	48 85 ff             	test   rdi,rdi
      aa45cd:	74 06                	je     aa45d5 <JNI_OnUnload@@Base+0x2bea2>
      aa45cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aa45d2:	ff 50 08             	call   QWORD PTR [rax+0x8]
      aa45d5:	49 ff c6             	inc    r14

### 0xaa5601 FDE=0xaa1418..0xaa6ad6
      aa5601:	49 8b 7c c5 00       	mov    rdi,QWORD PTR [r13+rax*8+0x0]
      aa55f1:	4c 39 f3             	cmp    rbx,r14
      aa55f4:	4c 8b ac 24 b8 00 00 	mov    r13,QWORD PTR [rsp+0xb8]
      aa55fb:	00 
      aa55fc:	74 16                	je     aa5614 <JNI_OnUnload@@Base+0x2cee1>
      aa55fe:	0f b6 03             	movzx  eax,BYTE PTR [rbx]
      aa5601:	49 8b 7c c5 00       	mov    rdi,QWORD PTR [r13+rax*8+0x0]
      aa5606:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aa5609:	ff 50 10             	call   QWORD PTR [rax+0x10]
      aa560c:	48 ff c3             	inc    rbx
      aa560f:	4c 39 f3             	cmp    rbx,r14
      aa5612:	75 ea                	jne    aa55fe <JNI_OnUnload@@Base+0x2cecb>
      aa5614:	4c 89 ff             	mov    rdi,r15

### 0xaa9dd9 FDE=0xaa9d52..0xaa9fbe
      aa9dd9:	4a 89 04 c7          	mov    QWORD PTR [rdi+r8*8],rax
      aa9dc7:	49 8b 7f 10          	mov    rdi,QWORD PTR [r15+0x10]
      aa9dcb:	48 89 78 10          	mov    QWORD PTR [rax+0x10],rdi
      aa9dcf:	45 31 c0             	xor    r8d,r8d
      aa9dd2:	4c 39 3f             	cmp    QWORD PTR [rdi],r15
      aa9dd5:	41 0f 95 c0          	setne  r8b
      aa9dd9:	4a 89 04 c7          	mov    QWORD PTR [rdi+r8*8],rax
      aa9ddd:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      aa9de0:	48 89 38             	mov    QWORD PTR [rax],rdi
      aa9de3:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      aa9de7:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      aa9deb:	48 89 78 08          	mov    QWORD PTR [rax+0x8],rdi
      aa9def:	48 85 ff             	test   rdi,rdi

### 0xaa9efd FDE=0xaa9d52..0xaa9fbe
      aa9efd:	4c 8b 34 d1          	mov    r14,QWORD PTR [rcx+rdx*8]
      aa9eef:	74 36                	je     aa9f27 <JNI_OnUnload@@Base+0x317f4>
      aa9ef1:	48 8b 48 10          	mov    rcx,QWORD PTR [rax+0x10]
      aa9ef5:	31 d2                	xor    edx,edx
      aa9ef7:	48 39 01             	cmp    QWORD PTR [rcx],rax
      aa9efa:	0f 94 c2             	sete   dl
      aa9efd:	4c 8b 34 d1          	mov    r14,QWORD PTR [rcx+rdx*8]
      aa9f01:	e9 1b ff ff ff       	jmp    aa9e21 <JNI_OnUnload@@Base+0x316ee>
      aa9f06:	c6 41 18 01          	mov    BYTE PTR [rcx+0x18],0x1
      aa9f0a:	eb 1f                	jmp    aa9f2b <JNI_OnUnload@@Base+0x317f8>
      aa9f0c:	48 8b 70 10          	mov    rsi,QWORD PTR [rax+0x10]
      aa9f10:	b2 01                	mov    dl,0x1
      aa9f12:	31 c9                	xor    ecx,ecx

### 0xaa9fe2 FDE=0xaa9fbe..0xaa9fee
      aa9fe2:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
      aa9fd2:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      aa9fd6:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      aa9fda:	31 d2                	xor    edx,edx
      aa9fdc:	48 39 39             	cmp    QWORD PTR [rcx],rdi
      aa9fdf:	0f 95 c2             	setne  dl
      aa9fe2:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
      aa9fe6:	48 89 38             	mov    QWORD PTR [rax],rdi
      aa9fe9:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      aa9fed:	c3                   	ret
      aa9fee:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aa9ff1:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
      aa9ff5:	48 89 0f             	mov    QWORD PTR [rdi],rcx

### 0xaaa011 FDE=0xaa9fee..0xaaa01e
      aaa011:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
      aaa001:	48 8b 4f 10          	mov    rcx,QWORD PTR [rdi+0x10]
      aaa005:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
      aaa009:	31 d2                	xor    edx,edx
      aaa00b:	48 39 39             	cmp    QWORD PTR [rcx],rdi
      aaa00e:	0f 95 c2             	setne  dl
      aaa011:	48 89 04 d1          	mov    QWORD PTR [rcx+rdx*8],rax
      aaa015:	48 89 78 08          	mov    QWORD PTR [rax+0x8],rdi
      aaa019:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      aaa01d:	c3                   	ret
      aaa01e:	53                   	push   rbx
      aaa01f:	48 39 fe             	cmp    rsi,rdi
      aaa022:	0f 94 46 18          	sete   BYTE PTR [rsi+0x18]

### 0xab2161 FDE=0xab214e..0xab218b
      ab2161:	4a 8b 3c f3          	mov    rdi,QWORD PTR [rbx+r14*8]
      ab2151:	50                   	push   rax
      ab2152:	48 89 fb             	mov    rbx,rdi
      ab2155:	48 83 c7 60          	add    rdi,0x60
      ab2159:	e8 2e 00 00 00       	call   ab218c <JNI_OnUnload@@Base+0x39a59>
      ab215e:	45 31 f6             	xor    r14d,r14d
      ab2161:	4a 8b 3c f3          	mov    rdi,QWORD PTR [rbx+r14*8]
      ab2165:	48 85 ff             	test   rdi,rdi
      ab2168:	74 05                	je     ab216f <JNI_OnUnload@@Base+0x39a3c>
      ab216a:	e8 b1 bd d3 00       	call   17edf20 <_ZdlPv@plt>
      ab216f:	49 ff c6             	inc    r14
      ab2172:	49 83 fe 0a          	cmp    r14,0xa
      ab2176:	75 e9                	jne    ab2161 <JNI_OnUnload@@Base+0x39a2e>

### 0xab47a9 FDE=0xab4782..0xab47f7
      ab47a9:	48 8b 3c cb          	mov    rdi,QWORD PTR [rbx+rcx*8]
      ab4791:	48 8b 87 00 08 00 00 	mov    rax,QWORD PTR [rdi+0x800]
      ab4798:	4c 8b bf 08 08 00 00 	mov    r15,QWORD PTR [rdi+0x808]
      ab479f:	49 39 c7             	cmp    r15,rax
      ab47a2:	74 21                	je     ab47c5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1765>
      ab47a4:	41 0f b6 4f ff       	movzx  ecx,BYTE PTR [r15-0x1]
      ab47a9:	48 8b 3c cb          	mov    rdi,QWORD PTR [rbx+rcx*8]
      ab47ad:	48 83 24 cb 00       	and    QWORD PTR [rbx+rcx*8],0x0
      ab47b2:	48 85 ff             	test   rdi,rdi
      ab47b5:	74 09                	je     ab47c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1760>
      ab47b7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ab47ba:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ab47bd:	49 8b 06             	mov    rax,QWORD PTR [r14]

### 0xab4bae FDE=0xab4bac..0xab4bbe
      ab4bae:	48 8b 04 c7          	mov    rax,QWORD PTR [rdi+rax*8]
      ab4b9a:	e8 e7 98 fe ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ab4b9f:	48 89 df             	mov    rdi,rbx
      ab4ba2:	e8 29 b1 fb ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ab4ba7:	e8 04 af d3 00       	call   17efab0 <__stack_chk_fail@plt>
      ab4bac:	89 f0                	mov    eax,esi
      ab4bae:	48 8b 04 c7          	mov    rax,QWORD PTR [rdi+rax*8]
      ab4bb2:	48 85 c0             	test   rax,rax
      ab4bb5:	74 01                	je     ab4bb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1b58>
      ab4bb7:	c3                   	ret
      ab4bb8:	50                   	push   rax
      ab4bb9:	e8 01 54 fc ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      ab4bbe:	53                   	push   rbx

### 0xab4d9e FDE=0xab4d04..0xab4eac
      ab4d9e:	49 8b bc c7 d8 02 00 	mov    rdi,QWORD PTR [r15+rax*8+0x2d8]
      ab4d86:	e8 e1 fb ff ff       	call   ab496c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x190c>
      ab4d8b:	45 31 e4             	xor    r12d,r12d
      ab4d8e:	4c 8d 2d cb 9c 8e ff 	lea    r13,[rip+0xffffffffff8e9ccb]        # 39ea60 <_ZTSN4asio22service_already_existsE@@Base+0x2d>
      ab4d95:	43 0f b6 04 2c       	movzx  eax,BYTE PTR [r12+r13*1]
      ab4d9a:	88 44 24 20          	mov    BYTE PTR [rsp+0x20],al
      ab4d9e:	49 8b bc c7 d8 02 00 	mov    rdi,QWORD PTR [r15+rax*8+0x2d8]
      ab4da5:	00 
      ab4da6:	48 85 ff             	test   rdi,rdi
      ab4da9:	74 15                	je     ab4dc0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d60>
      ab4dab:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
      ab4daf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ab4db2:	ff 50 20             	call   QWORD PTR [rax+0x20]

### 0xab4e0a FDE=0xab4d04..0xab4eac
      ab4e0a:	49 8b 9c c7 d8 02 00 	mov    rbx,QWORD PTR [r15+rax*8+0x2d8]
      ab4dfd:	48 89 ce             	mov    rsi,rcx
      ab4e00:	eb 03                	jmp    ab4e05 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1da5>
      ab4e02:	48 89 d6             	mov    rsi,rdx
      ab4e05:	48 39 ce             	cmp    rsi,rcx
      ab4e08:	75 1b                	jne    ab4e25 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dc5>
      ab4e0a:	49 8b 9c c7 d8 02 00 	mov    rbx,QWORD PTR [r15+rax*8+0x2d8]
      ab4e11:	00 
      ab4e12:	c6 43 08 01          	mov    BYTE PTR [rbx+0x8],0x1
      ab4e16:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      ab4e19:	48 89 df             	mov    rdi,rbx
      ab4e1c:	ff 50 20             	call   QWORD PTR [rax+0x20]
      ab4e1f:	80 7b 08 00          	cmp    BYTE PTR [rbx+0x8],0x0

## +0x5c0 operations with facade-likeness
### 0xa802c1 FDE=(11008817, 11015745) base=rsp facade_like=False
      a802c1:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0xa8d053 FDE=(11061369, 11074699) base=rsp facade_like=False
      a8d053:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xa8d068 FDE=(11061369, 11074699) base=rsp facade_like=False
      a8d068:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0xa8e04e FDE=(11061369, 11074699) base=rsp facade_like=False
      a8e04e:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xa8ebbe FDE=(11061369, 11074699) base=rsp facade_like=False
      a8ebbe:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xaa2779 FDE=(11146264, 11168470) base=rsp facade_like=False
      aa2779:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0

### 0xab3d5a FDE=(11222304, 11222444) base=rax facade_like=False
      ab3d5a:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xabdcab FDE=(11263075, 11263269) base=rax facade_like=False
      abdcab:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xad1308 FDE=(11342349, 11343068) base=rax facade_like=False
      ad1308:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xb1e1c0 FDE=(11657289, 11658211) base=rax facade_like=False
      b1e1c0:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xb3a15b FDE=(11772160, 11774812) base=rax facade_like=False
      b3a15b:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xb8f047 FDE=(12120110, 12120154) base=rax facade_like=False
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]

### 0xbc55a5 FDE=(12342684, 12342788) base=rax facade_like=False
      bc55a5:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xc548ce FDE=(12925210, 12939723) base=rsp facade_like=False
      c548ce:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]

### 0xcc776a FDE=(13399724, 13404900) base=rsp facade_like=False
      cc776a:	80 bc 24 c0 05 00 00 	cmp    BYTE PTR [rsp+0x5c0],0x0

### 0xcc7870 FDE=(13399724, 13404900) base=rsp facade_like=False
      cc7870:	80 bc 24 c0 05 00 00 	cmp    BYTE PTR [rsp+0x5c0],0x0

### 0xcc8821 FDE=(13399724, 13404900) base=rsp facade_like=False
      cc8821:	80 bc 24 c0 05 00 00 	cmp    BYTE PTR [rsp+0x5c0],0x0

### 0xcddeba FDE=(13489984, 13494021) base=rsp facade_like=False
      cddeba:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xcde59e FDE=(13489984, 13494021) base=rsp facade_like=False
      cde59e:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd22c37 FDE=(13773722, 13774268) base=r14 facade_like=False
      d22c37:	4d 8d be c0 05 00 00 	lea    r15,[r14+0x5c0]

### 0xd43afc FDE=(13908600, 13908929) base=rax facade_like=False
      d43afc:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xd4d7d3 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4d7d3:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4d7f8 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4d7f8:	66 0f 6f 84 24 c0 05 	movdqa xmm0,XMMWORD PTR [rsp+0x5c0]

### 0xd4d80e FDE=(13944548, 13959782) base=rsp facade_like=False
      d4d80e:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0

### 0xd4de45 FDE=(13944548, 13959782) base=rsp facade_like=True
      d4de45:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d4de11:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4de18:	00 
      d4de19:	e8 4c c1 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d4de1e:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
      d4de25:	00 
      d4de26:	e8 3f c1 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d4de2b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      d4de32:	00 
      d4de33:	e8 58 00 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d4de38:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
      d4de3f:	00 
      d4de40:	e8 4b 00 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d4de45:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d4de4c:	00 
      d4de4d:	e8 3e 00 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d4de52:	4c 8b bc 24 78 01 00 	mov    r15,QWORD PTR [rsp+0x178]
      d4de59:	00 
      d4de5a:	49 8b 07             	mov    rax,QWORD PTR [r15]
      d4de5d:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4de64:	00 
      d4de65:	4c 89 fe             	mov    rsi,r15
      d4de68:	4c 8b 74 24 48       	mov    r14,QWORD PTR [rsp+0x48]
      d4de6d:	4c 89 7c 24 50       	mov    QWORD PTR [rsp+0x50],r15
      d4de72:	ff 90 38 01 00 00    	call   QWORD PTR [rax+0x138]
      d4de78:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
      d4de7f:	00 
      d4de80:	48 8d 9c 24 20 04 00 	lea    rbx,[rsp+0x420]
      d4de87:	00 
      d4de88:	48 89 de             	mov    rsi,rbx
      d4de8b:	e8 2e de d7 ff       	call   acbcbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x18c5e>

### 0xd4e1e5 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e1e5:	48 8d 84 24 c0 05 00 	lea    rax,[rsp+0x5c0]

### 0xd4e2fe FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e2fe:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4e30f FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e30f:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0xd4e36f FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e36f:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4e380 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e380:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0xd4e582 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e582:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4e59a FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e59a:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0xd4e626 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e626:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4e641 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e641:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0xd4e69d FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e69d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4e6b5 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e6b5:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0xd4e6fb FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e6fb:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4e736 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e736:	0f b6 84 24 c0 05 00 	movzx  eax,BYTE PTR [rsp+0x5c0]

### 0xd4e77d FDE=(13944548, 13959782) base=rsp facade_like=False
      d4e77d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4f119 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4f119:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0xd4f358 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4f358:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd4f6e2 FDE=(13944548, 13959782) base=rsp facade_like=False
      d4f6e2:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0xd4fa7a FDE=(13944548, 13959782) base=rsp facade_like=True
      d4fa7a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d4fa46:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
      d4fa4d:	00 
      d4fa4e:	e8 b7 d6 d5 ff       	call   aad10a <JNI_OnUnload@@Base+0x349d7>
      d4fa53:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
      d4fa5a:	00 
      d4fa5b:	e8 0a a5 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d4fa60:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
      d4fa67:	00 
      d4fa68:	e8 fd a4 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d4fa6d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      d4fa74:	00 
      d4fa75:	e8 f0 a4 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d4fa7a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d4fa81:	00 
      d4fa82:	e8 e3 a4 d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      d4fa87:	31 c0                	xor    eax,eax
      d4fa89:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      d4fa8e:	45 31 ed             	xor    r13d,r13d
      d4fa91:	48 8d bc 24 80 05 00 	lea    rdi,[rsp+0x580]
      d4fa98:	00 
      d4fa99:	e8 0c f7 d6 ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
      d4fa9e:	4d 85 e4             	test   r12,r12
      d4faa1:	74 0a                	je     d4faad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cb33>
      d4faa3:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d4faa7:	4c 89 e7             	mov    rdi,r12
      d4faaa:	ff 50 18             	call   QWORD PTR [rax+0x18]
      d4faad:	48 89 df             	mov    rdi,rbx
      d4fab0:	e8 6b e4 a9 00       	call   17edf20 <_ZdlPv@plt>
      d4fab5:	45 31 e4             	xor    r12d,r12d
      d4fab8:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]

### 0xd4ff20 FDE=(13944548, 13959782) base=rsp facade_like=True
      d4ff20:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d4fef0:	75 e6                	jne    d4fed8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf5e>
      d4fef2:	eb 10                	jmp    d4ff04 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf8a>
      d4fef4:	48 89 c5             	mov    rbp,rax
      d4fef7:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4fefe:	00 
      d4feff:	e8 8c df a9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d4ff04:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
      d4ff09:	4c 8b 7c 24 48       	mov    r15,QWORD PTR [rsp+0x48]
      d4ff0e:	4c 8b 64 24 40       	mov    r12,QWORD PTR [rsp+0x40]
      d4ff13:	48 89 eb             	mov    rbx,rbp
      d4ff16:	e9 dc 02 00 00       	jmp    d501f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d27d>
      d4ff1b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d4ff20:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d4ff27:	00 
      d4ff28:	e8 63 df a9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d4ff2d:	48 8d bc 24 20 04 00 	lea    rdi,[rsp+0x420]
      d4ff34:	00 
      d4ff35:	e8 56 df a9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d4ff3a:	4c 89 ef             	mov    rdi,r13
      d4ff3d:	e8 e4 0e 01 00       	call   d60e26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2deac>
      d4ff42:	4c 89 e7             	mov    rdi,r12
      d4ff45:	e8 8a 9c a8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      d4ff4a:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
      d4ff51:	00 
      d4ff52:	e8 0f 9f a8 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d4ff57:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
      d4ff5e:	00 
      d4ff5f:	e8 02 9f a8 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
      d4ff64:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
      d4ff69:	e8 fc 9f d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>

### 0xd50074 FDE=(13944548, 13959782) base=rsp facade_like=True
      d50074:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d5003e:	e9 e9 00 00 00       	jmp    d5012c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1b2>
      d50043:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d50048:	e9 d2 00 00 00       	jmp    d5011f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1a5>
      d5004d:	48 89 c3             	mov    rbx,rax
      d50050:	e9 a2 01 00 00       	jmp    d501f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d27d>
      d50055:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d5005a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
      d50061:	00 
      d50062:	e8 29 de a9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d50067:	48 8d bc 24 80 04 00 	lea    rdi,[rsp+0x480]
      d5006e:	00 
      d5006f:	e8 1c de a9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d50074:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      d5007b:	00 
      d5007c:	e8 0f de a9 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      d50081:	e9 d0 00 00 00       	jmp    d50156 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1dc>
      d50086:	e9 fa 00 00 00       	jmp    d50185 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d20b>
      d5008b:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      d50090:	4c 89 e7             	mov    rdi,r12
      d50093:	e8 3c 9b a8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      d50098:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      d5009d:	e8 32 9b a8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      d500a2:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      d500a6:	e8 43 fe a6 00       	call   17bfeee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17405a>
      d500ab:	48 8b 7c 24 50       	mov    rdi,QWORD PTR [rsp+0x50]
      d500b0:	e8 1f 9b a8 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
      d500b5:	48 89 df             	mov    rdi,rbx
      d500b8:	e8 63 de a9 00       	call   17edf20 <_ZdlPv@plt>
      d500bd:	eb 60                	jmp    d5011f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d1a5>
      d500bf:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### 0xd6ba55 FDE=(14068377, 14086279) base=r15 facade_like=False
      d6ba55:	41 88 87 c0 05 00 00 	mov    BYTE PTR [r15+0x5c0],al

### 0xd6bb1c FDE=(14068377, 14086279) base=rsp facade_like=False
      d6bb1c:	48 8d 84 24 c0 05 00 	lea    rax,[rsp+0x5c0]

### 0xd6bb4d FDE=(14068377, 14086279) base=rsp facade_like=False
      d6bb4d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd6e0bd FDE=(14068377, 14086279) base=rsp facade_like=False
      d6e0bd:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd6eeaf FDE=(14068377, 14086279) base=rsp facade_like=False
      d6eeaf:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xd73ad5 FDE=(14104824, 14108823) base=r12 facade_like=False
      d73ad5:	41 80 bc 24 c0 05 00 	cmp    BYTE PTR [r12+0x5c0],0x0

### 0xd772d2 FDE=(14119634, 14119683) base=rdi facade_like=False
      d772d2:	80 bf c0 05 00 00 00 	cmp    BYTE PTR [rdi+0x5c0],0x0

### 0xd78336 FDE=(14123786, 14124338) base=rdi facade_like=False
      d78336:	80 bf c0 05 00 00 00 	cmp    BYTE PTR [rdi+0x5c0],0x0

### 0xd7849a FDE=(14123786, 14124338) base=rbx facade_like=False
      d7849a:	80 bb c0 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c0],0x0

### 0xd784ab FDE=(14123786, 14124338) base=rbx facade_like=False
      d784ab:	c6 83 c0 05 00 00 00 	mov    BYTE PTR [rbx+0x5c0],0x0

### 0xd7ad65 FDE=(14134450, 14135407) base=rbx facade_like=False
      d7ad65:	80 bb c0 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c0],0x0

### 0xd7f3e5 FDE=(14151490, 14154617) base=rbx facade_like=False
      d7f3e5:	8a 83 c0 05 00 00    	mov    al,BYTE PTR [rbx+0x5c0]

### 0xd7f790 FDE=(14151490, 14154617) base=rbx facade_like=False
      d7f790:	8a 83 c0 05 00 00    	mov    al,BYTE PTR [rbx+0x5c0]

### 0xd80340 FDE=(14156070, 14157072) base=rbp facade_like=False
      d80340:	80 bd c0 05 00 00 00 	cmp    BYTE PTR [rbp+0x5c0],0x0

### 0xd82c40 FDE=(14166908, 14167586) base=rbx facade_like=False
      d82c40:	80 bb c0 05 00 00 00 	cmp    BYTE PTR [rbx+0x5c0],0x0

### 0xd85046 FDE=(14175768, 14176377) base=r12 facade_like=False
      d85046:	41 0f b6 84 24 c0 05 	movzx  eax,BYTE PTR [r12+0x5c0]

### 0xd85279 FDE=(14176700, 14177077) base=r14 facade_like=False
      d85279:	41 80 be c0 05 00 00 	cmp    BYTE PTR [r14+0x5c0],0x0

### 0xd89fd3 FDE=(14196654, 14197024) base=rdi facade_like=False
      d89fd3:	80 bf c0 05 00 00 00 	cmp    BYTE PTR [rdi+0x5c0],0x0

### 0xd8b05b FDE=(14200712, 14201479) base=rax facade_like=False
      d8b05b:	80 b8 c0 05 00 00 00 	cmp    BYTE PTR [rax+0x5c0],0x0

### 0xd8b4d9 FDE=(14201884, 14202239) base=r13 facade_like=False
      d8b4d9:	41 80 bd c0 05 00 00 	cmp    BYTE PTR [r13+0x5c0],0x0

### 0xdb13cc FDE=(14355474, 14361896) base=rsp facade_like=False
      db13cc:	48 8b 9c 24 c0 05 00 	mov    rbx,QWORD PTR [rsp+0x5c0]

### 0xdb1e8c FDE=(14355474, 14361896) base=rsp facade_like=False
      db1e8c:	48 8b b4 24 c0 05 00 	mov    rsi,QWORD PTR [rsp+0x5c0]

### 0xdb6e96 FDE=(14380256, 14381941) base=rbx facade_like=False
      db6e96:	48 8d bb c0 05 00 00 	lea    rdi,[rbx+0x5c0]

### 0xdb6fb7 FDE=(14380256, 14381941) base=rbx facade_like=False
      db6fb7:	48 8d bb c0 05 00 00 	lea    rdi,[rbx+0x5c0]

### 0xdb701b FDE=(14380256, 14381941) base=rbx facade_like=False
      db701b:	f6 83 c0 05 00 00 01 	test   BYTE PTR [rbx+0x5c0],0x1

### 0xdb71d9 FDE=(14380256, 14381941) base=rbx facade_like=False
      db71d9:	48 8d bb c0 05 00 00 	lea    rdi,[rbx+0x5c0]

### 0xde7fe0 FDE=(14579182, 14583796) base=rsp facade_like=False
      de7fe0:	0f 10 84 24 c0 05 00 	movups xmm0,XMMWORD PTR [rsp+0x5c0]

### 0xde800c FDE=(14579182, 14583796) base=rsp facade_like=False
      de800c:	0f 11 84 24 c0 05 00 	movups XMMWORD PTR [rsp+0x5c0],xmm0

### 0xde85ed FDE=(14579182, 14583796) base=rsp facade_like=False
      de85ed:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xe40d24 FDE=(14945258, 14947217) base=rsp facade_like=True
      e40d24:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      e40cf1:	4d 8b ae b0 00 00 00 	mov    r13,QWORD PTR [r14+0xb0]
      e40cf8:	0f 57 c0             	xorps  xmm0,xmm0
      e40cfb:	49 83 a6 b0 00 00 00 	and    QWORD PTR [r14+0xb0],0x0
      e40d02:	00 
      e40d03:	41 0f 11 86 a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm0
      e40d0a:	00 
      e40d0b:	be b8 00 00 00       	mov    esi,0xb8
      e40d10:	49 8d 2c 34          	lea    rbp,[r12+rsi*1]
      e40d14:	4c 01 f6             	add    rsi,r14
      e40d17:	ba 82 00 00 00       	mov    edx,0x82
      e40d1c:	48 89 ef             	mov    rdi,rbp
      e40d1f:	e8 ac ed 9a 00       	call   17efad0 <memcpy@plt>
      e40d24:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      e40d2b:	00 
      e40d2c:	48 8d b4 24 40 05 00 	lea    rsi,[rsp+0x540]
      e40d33:	00 
      e40d34:	e8 57 40 00 00       	call   e44d90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1a6>
      e40d39:	48 8d bc 24 90 05 00 	lea    rdi,[rsp+0x590]
      e40d40:	00 
      e40d41:	48 8d b4 24 10 05 00 	lea    rsi,[rsp+0x510]
      e40d48:	00 
      e40d49:	e8 62 f9 e8 ff       	call   cd06b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d650>
      e40d4e:	48 8d bc 24 60 05 00 	lea    rdi,[rsp+0x560]
      e40d55:	00 
      e40d56:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
      e40d5d:	00 
      e40d5e:	e8 8d 71 c9 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e40d63:	48 8d 05 26 d6 9e 00 	lea    rax,[rip+0x9ed626]        # 182e390 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x328>
      e40d6a:	49 89 07             	mov    QWORD PTR [r15],rax
      e40d6d:	49 8d 7f 38          	lea    rdi,[r15+0x38]

### 0xe40e20 FDE=(14945258, 14947217) base=rsp facade_like=True
      e40e20:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
      e40de4:	48 8d b4 24 90 05 00 	lea    rsi,[rsp+0x590]
      e40deb:	00 
      e40dec:	e8 bf f8 e8 ff       	call   cd06b0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21d650>
      e40df1:	49 8d bf c0 01 00 00 	lea    rdi,[r15+0x1c0]
      e40df8:	48 8d b4 24 60 05 00 	lea    rsi,[rsp+0x560]
      e40dff:	00 
      e40e00:	e8 eb 70 c9 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
      e40e05:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
      e40e0a:	49 89 87 f0 01 00 00 	mov    QWORD PTR [r15+0x1f0],rax
      e40e11:	41 83 a7 f8 01 00 00 	and    DWORD PTR [r15+0x1f8],0x0
      e40e18:	00 
      e40e19:	49 8d bf 00 02 00 00 	lea    rdi,[r15+0x200]
      e40e20:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
      e40e27:	00 
      e40e28:	e8 63 3f 00 00       	call   e44d90 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1a6>
      e40e2d:	49 8d bf 20 02 00 00 	lea    rdi,[r15+0x220]
      e40e34:	66 0f 6f 44 24 10    	movdqa xmm0,XMMWORD PTR [rsp+0x10]
      e40e3a:	66 48 0f 3a 16 c6 01 	pextrq rsi,xmm0,0x1
      e40e41:	e8 7c 08 98 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
      e40e46:	49 c7 87 30 02 00 00 	mov    QWORD PTR [r15+0x230],0x1d4c0
      e40e4d:	c0 d4 01 00 
      e40e51:	41 83 a7 38 02 00 00 	and    DWORD PTR [r15+0x238],0x0
      e40e58:	00 
      e40e59:	49 8d bf 40 02 00 00 	lea    rdi,[r15+0x240]
      e40e60:	e8 ac dc 80 00       	call   164eb11 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7d>
      e40e65:	48 8d bc 24 e0 05 00 	lea    rdi,[rsp+0x5e0]
      e40e6c:	00 
      e40e6d:	48 89 ee             	mov    rsi,rbp
      e40e70:	e8 1b 94 c3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      e40e75:	41 8a 6f 38          	mov    bpl,BYTE PTR [r15+0x38]

### 0xe40f1b FDE=(14945258, 14947217) base=rsp facade_like=False
      e40f1b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xe929dc FDE=(15268560, 15281225) base=rsp facade_like=False
      e929dc:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0xeb0bca FDE=(15403924, 15404488) base=rsp facade_like=False
      eb0bca:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xeb0c8b FDE=(15403924, 15404488) base=rsp facade_like=False
      eb0c8b:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0xeb0d41 FDE=(15403924, 15404488) base=rsp facade_like=False
      eb0d41:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xeb0d9b FDE=(15403924, 15404488) base=rsp facade_like=False
      eb0d9b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xebce8b FDE=(15451962, 15457591) base=rsp facade_like=False
      ebce8b:	f3 0f 7f 84 24 c0 05 	movdqu XMMWORD PTR [rsp+0x5c0],xmm0

### 0xebcee2 FDE=(15451962, 15457591) base=rsp facade_like=False
      ebcee2:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0xebcfa0 FDE=(15451962, 15457591) base=rsp facade_like=False
      ebcfa0:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xebd045 FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd045:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd012:	66 41 0f 7f 46 30    	movdqa XMMWORD PTR [r14+0x30],xmm0
      ebd018:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
      ebd01d:	48 8d bc 24 78 04 00 	lea    rdi,[rsp+0x478]
      ebd024:	00 
      ebd025:	4c 89 f6             	mov    rsi,r14
      ebd028:	e8 77 c6 fc ff       	call   e896a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x50aba>
      ebd02d:	4c 89 f7             	mov    rdi,r14
      ebd030:	e8 59 13 1f 00       	call   10ae38e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2757a4>
      ebd035:	4c 89 ff             	mov    rdi,r15
      ebd038:	e8 53 0e 93 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ebd03d:	48 89 df             	mov    rdi,rbx
      ebd040:	e8 4b 0e 93 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ebd045:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd04c:	00 
      ebd04d:	e8 b8 f0 f4 ff       	call   e0c10a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9190>
      ebd052:	49 89 c6             	mov    r14,rax
      ebd055:	49 89 d4             	mov    r12,rdx
      ebd058:	4c 8d bc 24 00 01 00 	lea    r15,[rsp+0x100]
      ebd05f:	00 
      ebd060:	4c 89 ff             	mov    rdi,r15
      ebd063:	e8 a2 f0 f4 ff       	call   e0c10a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9190>
      ebd068:	49 89 c5             	mov    r13,rax
      ebd06b:	48 89 d3             	mov    rbx,rdx
      ebd06e:	4c 89 ff             	mov    rdi,r15
      ebd071:	e8 be f0 f4 ff       	call   e0c134 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd91ba>
      ebd076:	49 89 d7             	mov    r15,rdx
      ebd079:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ebd07d:	48 89 c7             	mov    rdi,rax
      ebd080:	48 89 d6             	mov    rsi,rdx
      ebd083:	4c 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],r13

### 0xebd13f FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd13f:	4c 8b 84 24 c0 05 00 	mov    r8,QWORD PTR [rsp+0x5c0]
      ebd10f:	41 f6 c5 0f          	test   r13b,0xf
      ebd113:	41 0f 95 c6          	setne  r14b
      ebd117:	4d 8d 2c 2e          	lea    r13,[r14+rbp*1]
      ebd11b:	48 01 c6             	add    rsi,rax
      ebd11e:	49 29 f4             	sub    r12,rsi
      ebd121:	4c 89 64 24 28       	mov    QWORD PTR [rsp+0x28],r12
      ebd126:	49 c1 ec 04          	shr    r12,0x4
      ebd12a:	4d 39 e5             	cmp    r13,r12
      ebd12d:	4d 0f 42 e5          	cmovb  r12,r13
      ebd131:	0f 86 12 01 00 00    	jbe    ebd249 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8465f>
      ebd137:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
      ebd13c:	4d 29 e5             	sub    r13,r12
      ebd13f:	4c 8b 84 24 c0 05 00 	mov    r8,QWORD PTR [rsp+0x5c0]
      ebd146:	00 
      ebd147:	48 8b b4 24 d8 05 00 	mov    rsi,QWORD PTR [rsp+0x5d8]
      ebd14e:	00 
      ebd14f:	4c 29 c6             	sub    rsi,r8
      ebd152:	49 89 f1             	mov    r9,rsi
      ebd155:	49 c1 f9 03          	sar    r9,0x3
      ebd159:	48 c1 ff 03          	sar    rdi,0x3
      ebd15d:	49 29 f9             	sub    r9,rdi
      ebd160:	4d 39 cd             	cmp    r13,r9
      ebd163:	0f 86 a2 03 00 00    	jbe    ebd50b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84921>
      ebd169:	45 31 f6             	xor    r14d,r14d
      ebd16c:	48 39 ca             	cmp    rdx,rcx
      ebd16f:	40 0f 94 c5          	sete   bpl
      ebd173:	48 c1 fe 02          	sar    rsi,0x2
      ebd177:	4c 01 ef             	add    rdi,r13
      ebd17a:	48 39 fe             	cmp    rsi,rdi
      ebd17d:	48 0f 47 fe          	cmova  rdi,rsi

### 0xebd1d2 FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd1d2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd1ab:	00 
      ebd1ac:	31 c9                	xor    ecx,ecx
      ebd1ae:	48 2b 84 24 c8 05 00 	sub    rax,QWORD PTR [rsp+0x5c8]
      ebd1b5:	00 
      ebd1b6:	48 8d 44 00 ff       	lea    rax,[rax+rax*1-0x1]
      ebd1bb:	48 0f 45 c8          	cmovne rcx,rax
      ebd1bf:	48 03 b4 24 e0 05 00 	add    rsi,QWORD PTR [rsp+0x5e0]
      ebd1c6:	00 
      ebd1c7:	48 29 f1             	sub    rcx,rsi
      ebd1ca:	4d 89 ee             	mov    r14,r13
      ebd1cd:	49 29 cd             	sub    r13,rcx
      ebd1d0:	76 1d                	jbe    ebd1ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84605>
      ebd1d2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd1d9:	00 
      ebd1da:	4c 89 ee             	mov    rsi,r13
      ebd1dd:	e8 2a 12 00 00       	call   ebe40c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85822>
      ebd1e2:	4c 8b a4 24 e8 05 00 	mov    r12,QWORD PTR [rsp+0x5e8]
      ebd1e9:	00 
      ebd1ea:	4c 2b 64 24 38       	sub    r12,QWORD PTR [rsp+0x38]
      ebd1ef:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd1f6:	00 
      ebd1f7:	e8 38 ef f4 ff       	call   e0c134 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd91ba>
      ebd1fc:	49 89 d5             	mov    r13,rdx
      ebd1ff:	48 89 c5             	mov    rbp,rax
      ebd202:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
      ebd209:	00 
      ebd20a:	48 89 94 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rdx
      ebd211:	00 
      ebd212:	4c 89 f1             	mov    rcx,r14
      ebd215:	4c 89 f2             	mov    rdx,r14

### 0xebd1ef FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd1ef:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd1c6:	00 
      ebd1c7:	48 29 f1             	sub    rcx,rsi
      ebd1ca:	4d 89 ee             	mov    r14,r13
      ebd1cd:	49 29 cd             	sub    r13,rcx
      ebd1d0:	76 1d                	jbe    ebd1ef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84605>
      ebd1d2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd1d9:	00 
      ebd1da:	4c 89 ee             	mov    rsi,r13
      ebd1dd:	e8 2a 12 00 00       	call   ebe40c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x85822>
      ebd1e2:	4c 8b a4 24 e8 05 00 	mov    r12,QWORD PTR [rsp+0x5e8]
      ebd1e9:	00 
      ebd1ea:	4c 2b 64 24 38       	sub    r12,QWORD PTR [rsp+0x38]
      ebd1ef:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd1f6:	00 
      ebd1f7:	e8 38 ef f4 ff       	call   e0c134 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd91ba>
      ebd1fc:	49 89 d5             	mov    r13,rdx
      ebd1ff:	48 89 c5             	mov    rbp,rax
      ebd202:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
      ebd209:	00 
      ebd20a:	48 89 94 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rdx
      ebd211:	00 
      ebd212:	4c 89 f1             	mov    rcx,r14
      ebd215:	4c 89 f2             	mov    rdx,r14
      ebd218:	4c 29 e2             	sub    rdx,r12
      ebd21b:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
      ebd220:	76 1e                	jbe    ebd240 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84656>
      ebd222:	48 d1 e9             	shr    rcx,1
      ebd225:	49 39 cc             	cmp    r12,rcx
      ebd228:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      ebd22c:	73 78                	jae    ebd2a6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x846bc>

### 0xebd28c FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd28c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd25b:	4d 85 e4             	test   r12,r12
      ebd25e:	0f 84 1d 05 00 00    	je     ebd781 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84b97>
      ebd264:	4c 8d b4 24 e0 02 00 	lea    r14,[rsp+0x2e0]
      ebd26b:	00 
      ebd26c:	48 8b 84 24 d0 05 00 	mov    rax,QWORD PTR [rsp+0x5d0]
      ebd273:	00 
      ebd274:	48 8b 48 f8          	mov    rcx,QWORD PTR [rax-0x8]
      ebd278:	48 83 c0 f8          	add    rax,0xfffffffffffffff8
      ebd27c:	48 89 8c 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rcx
      ebd283:	00 
      ebd284:	48 89 84 24 d0 05 00 	mov    QWORD PTR [rsp+0x5d0],rax
      ebd28b:	00 
      ebd28c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd293:	00 
      ebd294:	4c 89 f6             	mov    rsi,r14
      ebd297:	e8 1e 0f c9 ff       	call   b4e1ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b15a>
      ebd29c:	49 ff cc             	dec    r12
      ebd29f:	75 cb                	jne    ebd26c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84682>
      ebd2a1:	e9 db 04 00 00       	jmp    ebd781 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84b97>
      ebd2a6:	4c 89 fe             	mov    rsi,r15
      ebd2a9:	e8 c7 0f 00 00       	call   ebe275 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8568b>
      ebd2ae:	4c 39 fa             	cmp    rdx,r15
      ebd2b1:	74 75                	je     ebd328 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8473e>
      ebd2b3:	49 89 c6             	mov    r14,rax
      ebd2b6:	49 89 d4             	mov    r12,rdx
      ebd2b9:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
      ebd2be:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      ebd2c2:	4c 89 ef             	mov    rdi,r13
      ebd2c5:	4c 89 e6             	mov    rsi,r12
      ebd2c8:	e8 f7 bf 7b 00       	call   16792c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d430>

### 0xebd53b FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd53b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd50b:	4d 85 ed             	test   r13,r13
      ebd50e:	0f 84 9d 00 00 00    	je     ebd5b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x849c7>
      ebd514:	4c 39 c1             	cmp    rcx,r8
      ebd517:	0f 84 94 00 00 00    	je     ebd5b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x849c7>
      ebd51d:	48 f7 dd             	neg    rbp
      ebd520:	4d 89 e5             	mov    r13,r12
      ebd523:	49 f7 d5             	not    r13
      ebd526:	4d 01 f5             	add    r13,r14
      ebd529:	bf 00 47 00 00       	mov    edi,0x4700
      ebd52e:	e8 cd 09 93 00       	call   17edf00 <_Znwm@plt>
      ebd533:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
      ebd53a:	00 
      ebd53b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd542:	00 
      ebd543:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
      ebd54a:	00 
      ebd54b:	e8 6a 0c c9 ff       	call   b4e1ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b15a>
      ebd550:	48 8b 84 24 d0 05 00 	mov    rax,QWORD PTR [rsp+0x5d0]
      ebd557:	00 
      ebd558:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
      ebd55f:	00 
      ebd560:	48 8b 94 24 c8 05 00 	mov    rdx,QWORD PTR [rsp+0x5c8]
      ebd567:	00 
      ebd568:	48 29 d0             	sub    rax,rdx
      ebd56b:	31 f6                	xor    esi,esi
      ebd56d:	48 83 f8 08          	cmp    rax,0x8
      ebd571:	40 0f 94 c6          	sete   sil
      ebd575:	48 8b 84 24 e0 05 00 	mov    rax,QWORD PTR [rsp+0x5e0]
      ebd57c:	00 
      ebd57d:	48 f7 de             	neg    rsi

### 0xebd558 FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd558:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
      ebd526:	4d 01 f5             	add    r13,r14
      ebd529:	bf 00 47 00 00       	mov    edi,0x4700
      ebd52e:	e8 cd 09 93 00       	call   17edf00 <_Znwm@plt>
      ebd533:	48 89 84 24 e0 02 00 	mov    QWORD PTR [rsp+0x2e0],rax
      ebd53a:	00 
      ebd53b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd542:	00 
      ebd543:	48 8d b4 24 e0 02 00 	lea    rsi,[rsp+0x2e0]
      ebd54a:	00 
      ebd54b:	e8 6a 0c c9 ff       	call   b4e1ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b15a>
      ebd550:	48 8b 84 24 d0 05 00 	mov    rax,QWORD PTR [rsp+0x5d0]
      ebd557:	00 
      ebd558:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
      ebd55f:	00 
      ebd560:	48 8b 94 24 c8 05 00 	mov    rdx,QWORD PTR [rsp+0x5c8]
      ebd567:	00 
      ebd568:	48 29 d0             	sub    rax,rdx
      ebd56b:	31 f6                	xor    esi,esi
      ebd56d:	48 83 f8 08          	cmp    rax,0x8
      ebd571:	40 0f 94 c6          	sete   sil
      ebd575:	48 8b 84 24 e0 05 00 	mov    rax,QWORD PTR [rsp+0x5e0]
      ebd57c:	00 
      ebd57d:	48 f7 de             	neg    rsi
      ebd580:	48 01 f0             	add    rax,rsi
      ebd583:	48 83 c0 10          	add    rax,0x10
      ebd587:	48 89 84 24 e0 05 00 	mov    QWORD PTR [rsp+0x5e0],rax
      ebd58e:	00 
      ebd58f:	48 8d 75 01          	lea    rsi,[rbp+0x1]
      ebd593:	49 39 ed             	cmp    r13,rbp
      ebd596:	74 08                	je     ebd5a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x849b6>

### 0xebd5d0 FDE=(15451962, 15457591) base=rsp facade_like=False
      ebd5d0:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xebd635 FDE=(15451962, 15457591) base=rsp facade_like=False
      ebd635:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xebd734 FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd734:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
      ebd708:	4c 8d a4 24 e0 02 00 	lea    r12,[rsp+0x2e0]
      ebd70f:	00 
      ebd710:	4c 89 e7             	mov    rdi,r12
      ebd713:	4c 89 f6             	mov    rsi,r14
      ebd716:	e8 03 0d c9 ff       	call   b4e41e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b3be>
      ebd71b:	49 83 c6 08          	add    r14,0x8
      ebd71f:	4c 3b b4 24 d0 05 00 	cmp    r14,QWORD PTR [rsp+0x5d0]
      ebd726:	00 
      ebd727:	75 e7                	jne    ebd710 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84b26>
      ebd729:	48 8b b4 24 c8 05 00 	mov    rsi,QWORD PTR [rsp+0x5c8]
      ebd730:	00 
      ebd731:	4c 89 f0             	mov    rax,r14
      ebd734:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
      ebd73b:	00 
      ebd73c:	48 8b 94 24 d8 05 00 	mov    rdx,QWORD PTR [rsp+0x5d8]
      ebd743:	00 
      ebd744:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
      ebd74b:	00 
      ebd74c:	66 0f 6f 07          	movdqa xmm0,XMMWORD PTR [rdi]
      ebd750:	0f 28 4f 10          	movaps xmm1,XMMWORD PTR [rdi+0x10]
      ebd754:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      ebd757:	f3 0f 7f 84 24 c0 05 	movdqu XMMWORD PTR [rsp+0x5c0],xmm0
      ebd75e:	00 00 
      ebd760:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
      ebd764:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ebd768:	0f 11 8c 24 d0 05 00 	movups XMMWORD PTR [rsp+0x5d0],xmm1
      ebd76f:	00 
      ebd770:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
      ebd774:	4c 01 ac 24 e0 05 00 	add    QWORD PTR [rsp+0x5e0],r13
      ebd77b:	00 

### 0xebd757 FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd757:	f3 0f 7f 84 24 c0 05 	movdqu XMMWORD PTR [rsp+0x5c0],xmm0
      ebd729:	48 8b b4 24 c8 05 00 	mov    rsi,QWORD PTR [rsp+0x5c8]
      ebd730:	00 
      ebd731:	4c 89 f0             	mov    rax,r14
      ebd734:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
      ebd73b:	00 
      ebd73c:	48 8b 94 24 d8 05 00 	mov    rdx,QWORD PTR [rsp+0x5d8]
      ebd743:	00 
      ebd744:	48 8d bc 24 e0 02 00 	lea    rdi,[rsp+0x2e0]
      ebd74b:	00 
      ebd74c:	66 0f 6f 07          	movdqa xmm0,XMMWORD PTR [rdi]
      ebd750:	0f 28 4f 10          	movaps xmm1,XMMWORD PTR [rdi+0x10]
      ebd754:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      ebd757:	f3 0f 7f 84 24 c0 05 	movdqu XMMWORD PTR [rsp+0x5c0],xmm0
      ebd75e:	00 00 
      ebd760:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
      ebd764:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ebd768:	0f 11 8c 24 d0 05 00 	movups XMMWORD PTR [rsp+0x5d0],xmm1
      ebd76f:	00 
      ebd770:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
      ebd774:	4c 01 ac 24 e0 05 00 	add    QWORD PTR [rsp+0x5e0],r13
      ebd77b:	00 
      ebd77c:	e8 1d 22 be ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
      ebd781:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd788:	00 
      ebd789:	e8 7c e9 f4 ff       	call   e0c10a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9190>
      ebd78e:	49 89 d5             	mov    r13,rdx
      ebd791:	49 89 c4             	mov    r12,rax
      ebd794:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
      ebd79b:	00 
      ebd79c:	48 89 94 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rdx

### 0xebd781 FDE=(15451962, 15457591) base=rsp facade_like=True
      ebd781:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd750:	0f 28 4f 10          	movaps xmm1,XMMWORD PTR [rdi+0x10]
      ebd754:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      ebd757:	f3 0f 7f 84 24 c0 05 	movdqu XMMWORD PTR [rsp+0x5c0],xmm0
      ebd75e:	00 00 
      ebd760:	48 89 77 08          	mov    QWORD PTR [rdi+0x8],rsi
      ebd764:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ebd768:	0f 11 8c 24 d0 05 00 	movups XMMWORD PTR [rsp+0x5d0],xmm1
      ebd76f:	00 
      ebd770:	48 89 57 18          	mov    QWORD PTR [rdi+0x18],rdx
      ebd774:	4c 01 ac 24 e0 05 00 	add    QWORD PTR [rsp+0x5e0],r13
      ebd77b:	00 
      ebd77c:	e8 1d 22 be ff       	call   a9f99e <JNI_OnUnload@@Base+0x2726b>
      ebd781:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
      ebd788:	00 
      ebd789:	e8 7c e9 f4 ff       	call   e0c10a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9190>
      ebd78e:	49 89 d5             	mov    r13,rdx
      ebd791:	49 89 c4             	mov    r12,rax
      ebd794:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
      ebd79b:	00 
      ebd79c:	48 89 94 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rdx
      ebd7a3:	00 
      ebd7a4:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
      ebd7a9:	48 89 ca             	mov    rdx,rcx
      ebd7ac:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
      ebd7b1:	48 29 c2             	sub    rdx,rax
      ebd7b4:	76 1e                	jbe    ebd7d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84bea>
      ebd7b6:	48 d1 e9             	shr    rcx,1
      ebd7b9:	48 39 c8             	cmp    rax,rcx
      ebd7bc:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      ebd7c1:	73 1b                	jae    ebd7de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84bf4>

### 0xebda43 FDE=(15451962, 15457591) base=rsp facade_like=False
      ebda43:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xece2bf FDE=(15523972, 15525243) base=rbx facade_like=False
      ece2bf:	48 8d bb c0 05 00 00 	lea    rdi,[rbx+0x5c0]

### 0xed0aac FDE=(15534704, 15539299) base=rsp facade_like=False
      ed0aac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed0ad4 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed0ad4:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed0b60 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed0b60:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed0db4 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed0db4:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed0dc3 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed0dc3:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed0f62 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed0f62:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed0ffb FDE=(15534704, 15539299) base=rsp facade_like=False
      ed0ffb:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0xed1067 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1067:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0xed1088 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1088:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1184 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1184:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1194 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1194:	83 bc 24 c0 05 00 00 	cmp    DWORD PTR [rsp+0x5c0],0x2

### 0xed1205 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1205:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1219 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1219:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed1229 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1229:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed123d FDE=(15534704, 15539299) base=rsp facade_like=False
      ed123d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1251 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1251:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed1261 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1261:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1275 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1275:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1289 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1289:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed1299 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1299:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed12ad FDE=(15534704, 15539299) base=rsp facade_like=False
      ed12ad:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed12c1 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed12c1:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed12d1 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed12d1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed12e5 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed12e5:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed12f9 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed12f9:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed1309 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1309:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed131d FDE=(15534704, 15539299) base=rsp facade_like=False
      ed131d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1331 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1331:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed1341 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1341:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1355 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1355:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1369 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1369:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed1379 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1379:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed138d FDE=(15534704, 15539299) base=rsp facade_like=False
      ed138d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed13a1 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed13a1:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed13b1 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed13b1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed13c5 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed13c5:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed13d9 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed13d9:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed13e9 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed13e9:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1407 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1407:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1414 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1414:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0xed1424 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1424:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1438 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1438:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed144c FDE=(15534704, 15539299) base=rsp facade_like=False
      ed144c:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed145c FDE=(15534704, 15539299) base=rsp facade_like=False
      ed145c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1470 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1470:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1484 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1484:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed1494 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1494:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed14a8 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed14a8:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed14bc FDE=(15534704, 15539299) base=rsp facade_like=False
      ed14bc:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed14cc FDE=(15534704, 15539299) base=rsp facade_like=False
      ed14cc:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed14e0 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed14e0:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed14f4 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed14f4:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0xed1504 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1504:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1b99 FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1b99:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1bfb FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1bfb:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xed1c0d FDE=(15534704, 15539299) base=rsp facade_like=False
      ed1c0d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xf059e7 FDE=(15751623, 15753037) base=rsp facade_like=False
      f059e7:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax

### 0xf05e6f FDE=(15751623, 15753037) base=rsp facade_like=False
      f05e6f:	48 3b 84 24 c0 05 00 	cmp    rax,QWORD PTR [rsp+0x5c0]

### 0xf05f36 FDE=(15751623, 15753037) base=rsp facade_like=False
      f05f36:	48 3b 84 24 c0 05 00 	cmp    rax,QWORD PTR [rsp+0x5c0]

### 0xf35bf2 FDE=(15948720, 15950852) base=rsp facade_like=False
      f35bf2:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0xf35c22 FDE=(15948720, 15950852) base=rsp facade_like=False
      f35c22:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0xf35c73 FDE=(15948720, 15950852) base=rsp facade_like=False
      f35c73:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xf35d46 FDE=(15948720, 15950852) base=rsp facade_like=False
      f35d46:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0xf36148 FDE=(15948720, 15950852) base=rsp facade_like=False
      f36148:	48 89 ac 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rbp

### 0xf36162 FDE=(15948720, 15950852) base=rsp facade_like=False
      f36162:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0

### 0xf3616f FDE=(15948720, 15950852) base=rsp facade_like=False
      f3616f:	48 89 ac 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rbp

### 0xf361a5 FDE=(15948720, 15950852) base=rsp facade_like=False
      f361a5:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]

### 0xf3620d FDE=(15948720, 15950852) base=rsp facade_like=False
      f3620d:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0xf36229 FDE=(15948720, 15950852) base=rsp facade_like=False
      f36229:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0xf3626d FDE=(15948720, 15950852) base=rsp facade_like=False
      f3626d:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0xf36396 FDE=(15948720, 15950852) base=rsp facade_like=False
      f36396:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xf54ce5 FDE=(16075858, 16077554) base=rsp facade_like=True
      f54ce5:	48 8b bc 24 c0 05 00 	mov    rdi,QWORD PTR [rsp+0x5c0]
      f54cbd:	44 38 f8             	cmp    al,r15b
      f54cc0:	75 05                	jne    f54cc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11c0dd>
      f54cc2:	45 31 ff             	xor    r15d,r15d
      f54cc5:	eb 30                	jmp    f54cf7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11c10d>
      f54cc7:	49 8b 06             	mov    rax,QWORD PTR [r14]
      f54cca:	48 8d bc 24 b8 05 00 	lea    rdi,[rsp+0x5b8]
      f54cd1:	00 
      f54cd2:	4c 89 f6             	mov    rsi,r14
      f54cd5:	ff 50 28             	call   QWORD PTR [rax+0x28]
      f54cd8:	48 83 bc 24 b8 05 00 	cmp    QWORD PTR [rsp+0x5b8],0x0
      f54cdf:	00 00 
      f54ce1:	41 0f 95 c7          	setne  r15b
      f54ce5:	48 8b bc 24 c0 05 00 	mov    rdi,QWORD PTR [rsp+0x5c0]
      f54cec:	00 
      f54ced:	e8 94 97 b4 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f54cf2:	40 38 eb             	cmp    bl,bpl
      f54cf5:	75 0a                	jne    f54d01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11c117>
      f54cf7:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
      f54cfc:	e8 1d 6d f2 ff       	call   e7ba1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42e34>
      f54d01:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
      f54d08:	00 
      f54d09:	e8 dc 65 ba ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
      f54d0e:	45 84 ff             	test   r15b,r15b
      f54d11:	0f 84 5a 01 00 00    	je     f54e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11c287>
      f54d17:	4c 89 64 24 10       	mov    QWORD PTR [rsp+0x10],r12
      f54d1c:	4d 8b a6 f0 0b 00 00 	mov    r12,QWORD PTR [r14+0xbf0]
      f54d23:	49 8b 06             	mov    rax,QWORD PTR [r14]
      f54d26:	48 8d 9c 24 e8 00 00 	lea    rbx,[rsp+0xe8]
      f54d2d:	00 
      f54d2e:	48 89 df             	mov    rdi,rbx

### 0xf55008 FDE=(16075858, 16077554) base=rsp facade_like=False
      f55008:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xf55062 FDE=(16075858, 16077554) base=rsp facade_like=False
      f55062:	4c 8b a4 24 c0 05 00 	mov    r12,QWORD PTR [rsp+0x5c0]

### 0xf552a9 FDE=(16075858, 16077554) base=rsp facade_like=False
      f552a9:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0xf565c0 FDE=(16082048, 16084675) base=rsp facade_like=False
      f565c0:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0

### 0x105e34b FDE=(17162004, 17163834) base=rsp facade_like=False
     105e34b:	0f 29 84 24 c0 05 00 	movaps XMMWORD PTR [rsp+0x5c0],xmm0

### 0x105e357 FDE=(17162004, 17163834) base=rsp facade_like=False
     105e357:	c6 84 24 c0 05 00 00 	mov    BYTE PTR [rsp+0x5c0],0x0

### 0x105e361 FDE=(17162004, 17163834) base=rsp facade_like=False
     105e361:	4c 8d 84 24 c0 05 00 	lea    r8,[rsp+0x5c0]

### 0x1066952 FDE=(17197298, 17197530) base=rbx facade_like=True
     1066952:	48 83 a3 c0 05 00 00 	and    QWORD PTR [rbx+0x5c0],0x0
     106691e:	48 8d 05 a3 44 7a 00 	lea    rax,[rip+0x7a44a3]        # 180adc8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xa88>
     1066925:	48 89 03             	mov    QWORD PTR [rbx],rax
     1066928:	4c 8d 6b 20          	lea    r13,[rbx+0x20]
     106692c:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
     1066930:	48 8d 05 91 1b 7e 00 	lea    rax,[rip+0x7e1b91]        # 18484c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x4bb0>
     1066937:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
     106693b:	31 ed                	xor    ebp,ebp
     106693d:	40 88 6b 38          	mov    BYTE PTR [rbx+0x38],bpl
     1066941:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     1066945:	e8 2a 26 ff ff       	call   1058f74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22038a>
     106694a:	48 83 a3 90 05 00 00 	and    QWORD PTR [rbx+0x590],0x0
     1066951:	00 
     1066952:	48 83 a3 c0 05 00 00 	and    QWORD PTR [rbx+0x5c0],0x0
     1066959:	00 
     106695a:	40 88 ab d0 05 00 00 	mov    BYTE PTR [rbx+0x5d0],bpl
     1066961:	44 89 a3 d4 05 00 00 	mov    DWORD PTR [rbx+0x5d4],r12d
     1066968:	40 88 ab d8 05 00 00 	mov    BYTE PTR [rbx+0x5d8],bpl
     106696f:	44 88 bb 60 05 00 00 	mov    BYTE PTR [rbx+0x560],r15b
     1066976:	44 88 7b 68          	mov    BYTE PTR [rbx+0x68],r15b
     106697a:	8b 44 24 04          	mov    eax,DWORD PTR [rsp+0x4]
     106697e:	88 83 61 05 00 00    	mov    BYTE PTR [rbx+0x561],al
     1066984:	4d 89 2e             	mov    QWORD PTR [r14],r13
     1066987:	49 89 5e 08          	mov    QWORD PTR [r14+0x8],rbx
     106698b:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     106698f:	48 85 ff             	test   rdi,rdi
     1066992:	74 19                	je     10669ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ddc3>
     1066994:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     1066998:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     106699c:	74 0f                	je     10669ad <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22ddc3>
     106699e:	48 83 c4 08          	add    rsp,0x8

### 0x1089e9f FDE=(17341854, 17342366) base=r14 facade_like=False
     1089e9f:	49 8b 86 c0 05 00 00 	mov    rax,QWORD PTR [r14+0x5c0]

### 0x1089ea6 FDE=(17341854, 17342366) base=rbx facade_like=False
     1089ea6:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax

### 0x1089ebc FDE=(17341854, 17342366) base=r14 facade_like=False
     1089ebc:	49 83 a6 c0 05 00 00 	and    QWORD PTR [r14+0x5c0],0x0

### 0x10a6bbb FDE=(17458276, 17465170) base=r14 facade_like=False
     10a6bbb:	49 3b 86 c0 05 00 00 	cmp    rax,QWORD PTR [r14+0x5c0]

### 0x10e57be FDE=(17717084, 17717255) base=rbx facade_like=False
     10e57be:	48 8d bb c0 05 00 00 	lea    rdi,[rbx+0x5c0]

### 0x11a3653 FDE=(18493836, 18495534) base=rbx facade_like=False
     11a3653:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x11a365a FDE=(18493836, 18495534) base=rbx facade_like=False
     11a365a:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax

### 0x11a3682 FDE=(18493836, 18495534) base=rbx facade_like=False
     11a3682:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x11b08c7 FDE=(18544350, 18555122) base=rsp facade_like=False
     11b08c7:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]

### 0x11b08f1 FDE=(18544350, 18555122) base=rsp facade_like=False
     11b08f1:	48 83 a4 24 c0 05 00 	and    QWORD PTR [rsp+0x5c0],0x0

### 0x11b7760 FDE=(18576038, 18587535) base=rsp facade_like=False
     11b7760:	4c 8b bc 24 c0 05 00 	mov    r15,QWORD PTR [rsp+0x5c0]

### 0x11ee6cf FDE=(18802184, 18804775) base=rax facade_like=False
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]

### 0x11ef6e0 FDE=(18805556, 18832116) base=rsp facade_like=False
     11ef6e0:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11ef930 FDE=(18805556, 18832116) base=rsp facade_like=False
     11ef930:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11ef9d3 FDE=(18805556, 18832116) base=rsp facade_like=False
     11ef9d3:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]

### 0x11efa1f FDE=(18805556, 18832116) base=rsp facade_like=False
     11efa1f:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11efbe0 FDE=(18805556, 18832116) base=rsp facade_like=False
     11efbe0:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]

### 0x11efc46 FDE=(18805556, 18832116) base=rsp facade_like=False
     11efc46:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11efca1 FDE=(18805556, 18832116) base=rsp facade_like=False
     11efca1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11efcd3 FDE=(18805556, 18832116) base=rsp facade_like=False
     11efcd3:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11efd1b FDE=(18805556, 18832116) base=rsp facade_like=False
     11efd1b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11eff42 FDE=(18805556, 18832116) base=rsp facade_like=False
     11eff42:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax

### 0x11eff52 FDE=(18805556, 18832116) base=rsp facade_like=False
     11eff52:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0x11eff96 FDE=(18805556, 18832116) base=rsp facade_like=False
     11eff96:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11effc3 FDE=(18805556, 18832116) base=rsp facade_like=False
     11effc3:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f0015 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0015:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f0046 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0046:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f00aa FDE=(18805556, 18832116) base=rsp facade_like=False
     11f00aa:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f0139 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0139:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f018c FDE=(18805556, 18832116) base=rsp facade_like=False
     11f018c:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f01d4 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f01d4:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f0225 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0225:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f03d1 FDE=(18805556, 18832116) base=rsp facade_like=True
     11f03d1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f03a6:	00 
     11f03a7:	49 89 18             	mov    QWORD PTR [r8],rbx
     11f03aa:	48 8d 35 e0 cc 8a ff 	lea    rsi,[rip+0xffffffffff8acce0]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f03b1:	48 8d 0d 3c 58 00 00 	lea    rcx,[rip+0x583c]        # 11f5bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b178>
     11f03b8:	4c 8d b4 24 f0 01 00 	lea    r14,[rsp+0x1f0]
     11f03bf:	00 
     11f03c0:	6a 08                	push   0x8
     11f03c2:	41 59                	pop    r9
     11f03c4:	4c 89 f7             	mov    rdi,r14
     11f03c7:	31 d2                	xor    edx,edx
     11f03c9:	e8 c6 a3 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11f03ce:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11f03d1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f03d8:	00 
     11f03d9:	4c 89 fe             	mov    rsi,r15
     11f03dc:	4c 89 f2             	mov    rdx,r14
     11f03df:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     11f03e5:	48 8d bb c0 06 00 00 	lea    rdi,[rbx+0x6c0]
     11f03ec:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11f03f3:	00 
     11f03f4:	4c 89 f6             	mov    rsi,r14
     11f03f7:	e8 42 96 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f03fc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f0400:	e8 81 e0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0405:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     11f040c:	00 
     11f040d:	e8 d6 a3 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0412:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f0419:	00 
     11f041a:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x11f03ec FDE=(18805556, 18832116) base=rsp facade_like=True
     11f03ec:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11f03c0:	6a 08                	push   0x8
     11f03c2:	41 59                	pop    r9
     11f03c4:	4c 89 f7             	mov    rdi,r14
     11f03c7:	31 d2                	xor    edx,edx
     11f03c9:	e8 c6 a3 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11f03ce:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11f03d1:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f03d8:	00 
     11f03d9:	4c 89 fe             	mov    rsi,r15
     11f03dc:	4c 89 f2             	mov    rdx,r14
     11f03df:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     11f03e5:	48 8d bb c0 06 00 00 	lea    rdi,[rbx+0x6c0]
     11f03ec:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]
     11f03f3:	00 
     11f03f4:	4c 89 f6             	mov    rsi,r14
     11f03f7:	e8 42 96 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     11f03fc:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f0400:	e8 81 e0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f0405:	48 8d bc 24 f0 01 00 	lea    rdi,[rsp+0x1f0]
     11f040c:	00 
     11f040d:	e8 d6 a3 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f0412:	48 8b bc 24 70 06 00 	mov    rdi,QWORD PTR [rsp+0x670]
     11f0419:	00 
     11f041a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f041d:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11f0420:	4c 8b b4 24 90 06 00 	mov    r14,QWORD PTR [rsp+0x690]
     11f0427:	00 
     11f0428:	48 8d 93 60 06 00 00 	lea    rdx,[rbx+0x660]
     11f042f:	48 8d 0d ca c5 66 00 	lea    rcx,[rip+0x66c5ca]        # 185ca00 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x190e8>
     11f0436:	48 89 8b d0 06 00 00 	mov    QWORD PTR [rbx+0x6d0],rcx

### 0x11f0549 FDE=(18805556, 18832116) base=rsp facade_like=True
     11f0549:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
     11f050e:	00 
     11f050f:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     11f0515:	48 8d ab a8 05 00 00 	lea    rbp,[rbx+0x5a8]
     11f051c:	4c 8d bb e8 06 00 00 	lea    r15,[rbx+0x6e8]
     11f0523:	48 8b bc 24 e8 04 00 	mov    rdi,QWORD PTR [rsp+0x4e8]
     11f052a:	00 
     11f052b:	e8 90 e0 8e ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
     11f0530:	4c 8d 84 24 b0 01 00 	lea    r8,[rsp+0x1b0]
     11f0537:	00 
     11f0538:	4d 89 38             	mov    QWORD PTR [r8],r15
     11f053b:	48 8d 35 4f cb 8a ff 	lea    rsi,[rip+0xffffffffff8acb4f]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     11f0542:	48 8d 0d 45 57 00 00 	lea    rcx,[rip+0x5745]        # 11f5c8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b212>
     11f0549:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
     11f0550:	00 
     11f0551:	6a 08                	push   0x8
     11f0553:	41 59                	pop    r9
     11f0555:	4c 89 ef             	mov    rdi,r13
     11f0558:	31 d2                	xor    edx,edx
     11f055a:	e8 35 a2 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     11f055f:	48 8b 83 a8 05 00 00 	mov    rax,QWORD PTR [rbx+0x5a8]
     11f0566:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f056d:	00 
     11f056e:	6a 07                	push   0x7
     11f0570:	5a                   	pop    rdx
     11f0571:	48 89 6c 24 18       	mov    QWORD PTR [rsp+0x18],rbp
     11f0576:	48 89 ee             	mov    rsi,rbp
     11f0579:	4c 89 e9             	mov    rcx,r13
     11f057c:	ff 50 18             	call   QWORD PTR [rax+0x18]
     11f057f:	4c 8d ab 20 07 00 00 	lea    r13,[rbx+0x720]
     11f0586:	48 8d ac 24 50 05 00 	lea    rbp,[rsp+0x550]

### 0x11f05a2 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f05a2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f05cd FDE=(18805556, 18832116) base=rsp facade_like=False
     11f05cd:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]

### 0x11f0619 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0619:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f0736 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0736:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax

### 0x11f07c1 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f07c1:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f08d1 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f08d1:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f0925 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0925:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f09dc FDE=(18805556, 18832116) base=rsp facade_like=False
     11f09dc:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]

### 0x11f0a23 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0a23:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f0aeb FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0aeb:	4c 89 b4 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r14

### 0x11f0b80 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0b80:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x11f0bef FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0bef:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f0c2d FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0c2d:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x11f0d6d FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0d6d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f0e58 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0e58:	4c 89 bc 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r15

### 0x11f0f0a FDE=(18805556, 18832116) base=rsp facade_like=False
     11f0f0a:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x11f1010 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1010:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f109e FDE=(18805556, 18832116) base=rsp facade_like=False
     11f109e:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f10fa FDE=(18805556, 18832116) base=rsp facade_like=False
     11f10fa:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f123f FDE=(18805556, 18832116) base=rsp facade_like=False
     11f123f:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f128c FDE=(18805556, 18832116) base=rsp facade_like=False
     11f128c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f13dd FDE=(18805556, 18832116) base=rsp facade_like=False
     11f13dd:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f142a FDE=(18805556, 18832116) base=rsp facade_like=True
     11f142a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f13ff:	6a 03                	push   0x3
     11f1401:	5a                   	pop    rdx
     11f1402:	48 89 ee             	mov    rsi,rbp
     11f1405:	4c 89 f1             	mov    rcx,r14
     11f1408:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
     11f140e:	4c 8d b4 24 e0 04 00 	lea    r14,[rsp+0x4e0]
     11f1415:	00 
     11f1416:	4c 89 ef             	mov    rdi,r13
     11f1419:	4c 89 f6             	mov    rsi,r14
     11f141c:	e8 d1 87 5e 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     11f1421:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     11f1425:	e8 5c d0 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f142a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f1431:	00 
     11f1432:	e8 b1 93 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f1437:	48 8d 05 82 d5 66 00 	lea    rax,[rip+0x66d582]        # 185e9c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1b0a8>
     11f143e:	48 89 83 78 18 00 00 	mov    QWORD PTR [rbx+0x1878],rax
     11f1445:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
     11f144c:	00 
     11f144d:	48 89 83 80 18 00 00 	mov    QWORD PTR [rbx+0x1880],rax
     11f1454:	48 83 a3 a8 18 00 00 	and    QWORD PTR [rbx+0x18a8],0x0
     11f145b:	00 
     11f145c:	48 83 a3 98 18 00 00 	and    QWORD PTR [rbx+0x1898],0x0
     11f1463:	00 
     11f1464:	66 0f ef c0          	pxor   xmm0,xmm0
     11f1468:	f3 0f 7f 83 88 18 00 	movdqu XMMWORD PTR [rbx+0x1888],xmm0
     11f146f:	00 
     11f1470:	48 8b 83 d0 0e 00 00 	mov    rax,QWORD PTR [rbx+0xed0]
     11f1477:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     11f147c:	48 8b bc 24 68 06 00 	mov    rdi,QWORD PTR [rsp+0x668]

### 0x11f1811 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1811:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f185c FDE=(18805556, 18832116) base=rsp facade_like=False
     11f185c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f1886 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1886:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f1969 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1969:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f1b1f FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1b1f:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f1bc4 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1bc4:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f1c12 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1c12:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f1ccf FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1ccf:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f1d34 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1d34:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f1d89 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1d89:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f1e5b FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1e5b:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f1f2f FDE=(18805556, 18832116) base=rsp facade_like=False
     11f1f2f:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f2001 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2001:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f20d3 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f20d3:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f21a5 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f21a5:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f2277 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2277:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f26ef FDE=(18805556, 18832116) base=rsp facade_like=False
     11f26ef:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f2737 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2737:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f2761 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2761:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f2901 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2901:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f294c FDE=(18805556, 18832116) base=rsp facade_like=False
     11f294c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f2976 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2976:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]

### 0x11f29bf FDE=(18805556, 18832116) base=rsp facade_like=False
     11f29bf:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f2a77 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2a77:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f2b46 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2b46:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f2c18 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2c18:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f2cea FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2cea:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f2dbc FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2dbc:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f2e8e FDE=(18805556, 18832116) base=rsp facade_like=False
     11f2e8e:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f303e FDE=(18805556, 18832116) base=rsp facade_like=False
     11f303e:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f308b FDE=(18805556, 18832116) base=rsp facade_like=False
     11f308b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f30bd FDE=(18805556, 18832116) base=rsp facade_like=False
     11f30bd:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f3379 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3379:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f33cc FDE=(18805556, 18832116) base=rsp facade_like=False
     11f33cc:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f3485 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3485:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f3a47 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3a47:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f3b04 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3b04:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f3b18 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3b18:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f3b65 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3b65:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f3b77 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3b77:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]

### 0x11f3c78 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3c78:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f3ca3 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3ca3:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f3d38 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3d38:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]

### 0x11f3d93 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3d93:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x11f3def FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3def:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f3e15 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3e15:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f3e61 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3e61:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f3f4e FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3f4e:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f3fac FDE=(18805556, 18832116) base=rsp facade_like=False
     11f3fac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f42b1 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f42b1:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f430a FDE=(18805556, 18832116) base=rsp facade_like=False
     11f430a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f4330 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4330:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x11f4387 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4387:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f43d3 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f43d3:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f4429 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4429:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f4631 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4631:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f46e4 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f46e4:	48 89 8c 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rcx

### 0x11f4709 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4709:	66 0f 7f 84 24 c0 05 	movdqa XMMWORD PTR [rsp+0x5c0],xmm0

### 0x11f4720 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4720:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0x11f4798 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4798:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f47eb FDE=(18805556, 18832116) base=rsp facade_like=False
     11f47eb:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f4818 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4818:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]

### 0x11f4863 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4863:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f48fc FDE=(18805556, 18832116) base=rsp facade_like=False
     11f48fc:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f491c FDE=(18805556, 18832116) base=rsp facade_like=False
     11f491c:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0x11f4966 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4966:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f497a FDE=(18805556, 18832116) base=rsp facade_like=False
     11f497a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f499a FDE=(18805556, 18832116) base=rsp facade_like=False
     11f499a:	48 8d 94 24 c0 05 00 	lea    rdx,[rsp+0x5c0]

### 0x11f49e8 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f49e8:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f4a4b FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4a4b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f4a62 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4a62:	4c 8b bc 24 c0 05 00 	mov    r15,QWORD PTR [rsp+0x5c0]

### 0x11f4cbe FDE=(18805556, 18832116) base=rsp facade_like=True
     11f4cbe:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f4c7e:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
     11f4c83:	4c 89 e7             	mov    rdi,r12
     11f4c86:	48 83 c7 40          	add    rdi,0x40
     11f4c8a:	66 0f ef c0          	pxor   xmm0,xmm0
     11f4c8e:	f3 41 0f 7f 44 24 10 	movdqu XMMWORD PTR [r12+0x10],xmm0
     11f4c95:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
     11f4c9c:	f3 41 0f 7f 44 24 30 	movdqu XMMWORD PTR [r12+0x30],xmm0
     11f4ca3:	e8 9a 6b b3 ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
     11f4ca8:	4c 89 a3 58 4a 00 00 	mov    QWORD PTR [rbx+0x4a58],r12
     11f4caf:	4c 89 bb 18 1a 00 00 	mov    QWORD PTR [rbx+0x1a18],r15
     11f4cb6:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f4cbb:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f4cbe:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f4cc5:	00 
     11f4cc6:	4c 89 ff             	mov    rdi,r15
     11f4cc9:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f4ccc:	48 8b bc 24 c0 05 00 	mov    rdi,QWORD PTR [rsp+0x5c0]
     11f4cd3:	00 
     11f4cd4:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     11f4cdb:	00 
     11f4cdc:	4c 89 26             	mov    QWORD PTR [rsi],r12
     11f4cdf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4ce2:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11f4ce5:	48 8b bc 24 e0 04 00 	mov    rdi,QWORD PTR [rsp+0x4e0]
     11f4cec:	00 
     11f4ced:	48 83 a4 24 e0 04 00 	and    QWORD PTR [rsp+0x4e0],0x0
     11f4cf4:	00 00 
     11f4cf6:	48 85 ff             	test   rdi,rdi
     11f4cf9:	74 06                	je     11f4d01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a285>
     11f4cfb:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0x11f4ccc FDE=(18805556, 18832116) base=rsp facade_like=True
     11f4ccc:	48 8b bc 24 c0 05 00 	mov    rdi,QWORD PTR [rsp+0x5c0]
     11f4c8e:	f3 41 0f 7f 44 24 10 	movdqu XMMWORD PTR [r12+0x10],xmm0
     11f4c95:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
     11f4c9c:	f3 41 0f 7f 44 24 30 	movdqu XMMWORD PTR [r12+0x30],xmm0
     11f4ca3:	e8 9a 6b b3 ff       	call   d2b842 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2787e2>
     11f4ca8:	4c 89 a3 58 4a 00 00 	mov    QWORD PTR [rbx+0x4a58],r12
     11f4caf:	4c 89 bb 18 1a 00 00 	mov    QWORD PTR [rbx+0x1a18],r15
     11f4cb6:	48 8b 74 24 50       	mov    rsi,QWORD PTR [rsp+0x50]
     11f4cbb:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     11f4cbe:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]
     11f4cc5:	00 
     11f4cc6:	4c 89 ff             	mov    rdi,r15
     11f4cc9:	ff 50 30             	call   QWORD PTR [rax+0x30]
     11f4ccc:	48 8b bc 24 c0 05 00 	mov    rdi,QWORD PTR [rsp+0x5c0]
     11f4cd3:	00 
     11f4cd4:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     11f4cdb:	00 
     11f4cdc:	4c 89 26             	mov    QWORD PTR [rsi],r12
     11f4cdf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4ce2:	ff 50 38             	call   QWORD PTR [rax+0x38]
     11f4ce5:	48 8b bc 24 e0 04 00 	mov    rdi,QWORD PTR [rsp+0x4e0]
     11f4cec:	00 
     11f4ced:	48 83 a4 24 e0 04 00 	and    QWORD PTR [rsp+0x4e0],0x0
     11f4cf4:	00 00 
     11f4cf6:	48 85 ff             	test   rdi,rdi
     11f4cf9:	74 06                	je     11f4d01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a285>
     11f4cfb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f4cfe:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11f4d01:	4c 8d a3 f0 29 00 00 	lea    r12,[rbx+0x29f0]
     11f4d08:	48 8b bc 24 c8 05 00 	mov    rdi,QWORD PTR [rsp+0x5c8]
     11f4d0f:	00 

### 0x11f4d29 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4d29:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax

### 0x11f4dfb FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4dfb:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x11f4e84 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4e84:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0x11f4ee4 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4ee4:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x11f4f47 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4f47:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f4f5c FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4f5c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f4ffb FDE=(18805556, 18832116) base=rsp facade_like=False
     11f4ffb:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f502e FDE=(18805556, 18832116) base=rsp facade_like=False
     11f502e:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f50cf FDE=(18805556, 18832116) base=rsp facade_like=False
     11f50cf:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f5103 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f5103:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f511a FDE=(18805556, 18832116) base=rsp facade_like=False
     11f511a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f51a9 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f51a9:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f526e FDE=(18805556, 18832116) base=rsp facade_like=True
     11f526e:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f523e:	00 
     11f523f:	e8 0c 3f 00 00       	call   11f9150 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
     11f5244:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     11f524b:	00 
     11f524c:	e9 eb 02 00 00       	jmp    11f553c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3aac0>
     11f5251:	e9 54 07 00 00       	jmp    11f59aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af2e>
     11f5256:	e9 4f 07 00 00       	jmp    11f59aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af2e>
     11f525b:	48 89 c3             	mov    rbx,rax
     11f525e:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f5265:	00 
     11f5266:	e9 b9 07 00 00       	jmp    11f5a24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afa8>
     11f526b:	48 89 c3             	mov    rbx,rax
     11f526e:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f5275:	00 
     11f5276:	e8 6d 55 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f527b:	4c 89 e7             	mov    rdi,r12
     11f527e:	e8 51 49 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f5283:	eb 10                	jmp    11f5295 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a819>
     11f5285:	48 89 c3             	mov    rbx,rax
     11f5288:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f528f:	00 
     11f5290:	e8 53 55 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f5295:	4c 89 f7             	mov    rdi,r14
     11f5298:	48 83 c7 10          	add    rdi,0x10
     11f529c:	e8 f3 af 05 00       	call   1250294 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95818>
     11f52a1:	eb 03                	jmp    11f52a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a82a>
     11f52a3:	48 89 c3             	mov    rbx,rax
     11f52a6:	4c 89 f7             	mov    rdi,r14
     11f52a9:	e8 72 8c 5f 00       	call   17edf20 <_ZdlPv@plt>
     11f52ae:	e9 83 07 00 00       	jmp    11f5a36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afba>

### 0x11f5288 FDE=(18805556, 18832116) base=rsp facade_like=True
     11f5288:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f525b:	48 89 c3             	mov    rbx,rax
     11f525e:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f5265:	00 
     11f5266:	e9 b9 07 00 00       	jmp    11f5a24 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afa8>
     11f526b:	48 89 c3             	mov    rbx,rax
     11f526e:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f5275:	00 
     11f5276:	e8 6d 55 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f527b:	4c 89 e7             	mov    rdi,r12
     11f527e:	e8 51 49 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f5283:	eb 10                	jmp    11f5295 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a819>
     11f5285:	48 89 c3             	mov    rbx,rax
     11f5288:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f528f:	00 
     11f5290:	e8 53 55 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f5295:	4c 89 f7             	mov    rdi,r14
     11f5298:	48 83 c7 10          	add    rdi,0x10
     11f529c:	e8 f3 af 05 00       	call   1250294 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x95818>
     11f52a1:	eb 03                	jmp    11f52a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a82a>
     11f52a3:	48 89 c3             	mov    rbx,rax
     11f52a6:	4c 89 f7             	mov    rdi,r14
     11f52a9:	e8 72 8c 5f 00       	call   17edf20 <_ZdlPv@plt>
     11f52ae:	e9 83 07 00 00       	jmp    11f5a36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afba>
     11f52b3:	48 89 c3             	mov    rbx,rax
     11f52b6:	e9 7b 07 00 00       	jmp    11f5a36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afba>
     11f52bb:	48 89 c3             	mov    rbx,rax
     11f52be:	e9 80 07 00 00       	jmp    11f5a43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afc7>
     11f52c3:	48 89 c3             	mov    rbx,rax
     11f52c6:	e9 85 07 00 00       	jmp    11f5a50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afd4>
     11f52cb:	48 89 c3             	mov    rbx,rax

### 0x11f52de FDE=(18805556, 18832116) base=rsp facade_like=True
     11f52de:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f52ae:	e9 83 07 00 00       	jmp    11f5a36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afba>
     11f52b3:	48 89 c3             	mov    rbx,rax
     11f52b6:	e9 7b 07 00 00       	jmp    11f5a36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afba>
     11f52bb:	48 89 c3             	mov    rbx,rax
     11f52be:	e9 80 07 00 00       	jmp    11f5a43 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afc7>
     11f52c3:	48 89 c3             	mov    rbx,rax
     11f52c6:	e9 85 07 00 00       	jmp    11f5a50 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afd4>
     11f52cb:	48 89 c3             	mov    rbx,rax
     11f52ce:	e9 8a 07 00 00       	jmp    11f5a5d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afe1>
     11f52d3:	48 89 c3             	mov    rbx,rax
     11f52d6:	e9 8f 07 00 00       	jmp    11f5a6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3afee>
     11f52db:	48 89 c3             	mov    rbx,rax
     11f52de:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f52e5:	00 
     11f52e6:	e8 fd 54 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f52eb:	4c 89 f7             	mov    rdi,r14
     11f52ee:	e8 35 4b 88 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     11f52f3:	48 89 ef             	mov    rdi,rbp
     11f52f6:	e8 57 f5 05 00       	call   1254852 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99dd6>
     11f52fb:	45 31 e4             	xor    r12d,r12d
     11f52fe:	4c 89 ff             	mov    rdi,r15
     11f5301:	48 83 c7 10          	add    rdi,0x10
     11f5305:	e8 7a f5 05 00       	call   1254884 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x99e08>
     11f530a:	4d 85 e4             	test   r12,r12
     11f530d:	75 05                	jne    11f5314 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a898>
     11f530f:	eb 0d                	jmp    11f531e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a8a2>
     11f5311:	48 89 c3             	mov    rbx,rax
     11f5314:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     11f5318:	4c 89 e7             	mov    rdi,r12
     11f531b:	ff 50 08             	call   QWORD PTR [rax+0x8]

### 0x11f53cb FDE=(18805556, 18832116) base=rsp facade_like=True
     11f53cb:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f539b:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f53a2:	00 
     11f53a3:	e9 ec 06 00 00       	jmp    11f5a94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b018>
     11f53a8:	48 89 c5             	mov    rbp,rax
     11f53ab:	e9 f6 06 00 00       	jmp    11f5aa6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b02a>
     11f53b0:	48 89 c5             	mov    rbp,rax
     11f53b3:	e9 fb 06 00 00       	jmp    11f5ab3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b037>
     11f53b8:	48 89 c5             	mov    rbp,rax
     11f53bb:	e9 00 07 00 00       	jmp    11f5ac0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b044>
     11f53c0:	48 89 c5             	mov    rbp,rax
     11f53c3:	e9 05 07 00 00       	jmp    11f5acd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b051>
     11f53c8:	48 89 c5             	mov    rbp,rax
     11f53cb:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f53d2:	00 
     11f53d3:	e8 10 54 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f53d8:	4c 89 e7             	mov    rdi,r12
     11f53db:	e8 40 8b 5f 00       	call   17edf20 <_ZdlPv@plt>
     11f53e0:	e9 f5 06 00 00       	jmp    11f5ada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b05e>
     11f53e5:	48 89 c5             	mov    rbp,rax
     11f53e8:	e9 ed 06 00 00       	jmp    11f5ada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b05e>
     11f53ed:	48 89 c5             	mov    rbp,rax
     11f53f0:	4c 89 f7             	mov    rdi,r14
     11f53f3:	e8 dc 47 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f53f8:	e9 ef 06 00 00       	jmp    11f5aec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b070>
     11f53fd:	e9 a8 05 00 00       	jmp    11f59aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af2e>
     11f5402:	48 89 c5             	mov    rbp,rax
     11f5405:	48 81 c3 98 17 00 00 	add    rbx,0x1798
     11f540c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f5413:	00 
     11f5414:	e8 cf 53 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>

### 0x11f540c FDE=(18805556, 18832116) base=rsp facade_like=True
     11f540c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f53d8:	4c 89 e7             	mov    rdi,r12
     11f53db:	e8 40 8b 5f 00       	call   17edf20 <_ZdlPv@plt>
     11f53e0:	e9 f5 06 00 00       	jmp    11f5ada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b05e>
     11f53e5:	48 89 c5             	mov    rbp,rax
     11f53e8:	e9 ed 06 00 00       	jmp    11f5ada <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b05e>
     11f53ed:	48 89 c5             	mov    rbp,rax
     11f53f0:	4c 89 f7             	mov    rdi,r14
     11f53f3:	e8 dc 47 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f53f8:	e9 ef 06 00 00       	jmp    11f5aec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b070>
     11f53fd:	e9 a8 05 00 00       	jmp    11f59aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af2e>
     11f5402:	48 89 c5             	mov    rbp,rax
     11f5405:	48 81 c3 98 17 00 00 	add    rbx,0x1798
     11f540c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f5413:	00 
     11f5414:	e8 cf 53 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f5419:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
     11f541e:	e8 6d 8a 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f5423:	4c 89 ef             	mov    rdi,r13
     11f5426:	e8 a9 47 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f542b:	4c 89 e7             	mov    rdi,r12
     11f542e:	e8 13 c3 5c 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     11f5433:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     11f5438:	e8 29 4a 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11f543d:	48 89 df             	mov    rdi,rbx
     11f5440:	e8 b5 fa 95 ff       	call   b54efa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1e9a>
     11f5445:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11f544a:	e8 85 4e 00 00       	call   11fa2d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f858>
     11f544f:	e9 98 06 00 00       	jmp    11f5aec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b070>
     11f5454:	48 89 c5             	mov    rbp,rax
     11f5457:	48 81 c3 10 16 00 00 	add    rbx,0x1610

### 0x11f545e FDE=(18805556, 18832116) base=rsp facade_like=True
     11f545e:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f5426:	e8 a9 47 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f542b:	4c 89 e7             	mov    rdi,r12
     11f542e:	e8 13 c3 5c 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     11f5433:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     11f5438:	e8 29 4a 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11f543d:	48 89 df             	mov    rdi,rbx
     11f5440:	e8 b5 fa 95 ff       	call   b54efa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1e9a>
     11f5445:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11f544a:	e8 85 4e 00 00       	call   11fa2d4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f858>
     11f544f:	e9 98 06 00 00       	jmp    11f5aec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b070>
     11f5454:	48 89 c5             	mov    rbp,rax
     11f5457:	48 81 c3 10 16 00 00 	add    rbx,0x1610
     11f545e:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f5465:	00 
     11f5466:	e8 7d 53 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f546b:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
     11f5470:	e8 1b 8a 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f5475:	4c 89 ef             	mov    rdi,r13
     11f5478:	e8 57 47 5e 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     11f547d:	4c 89 e7             	mov    rdi,r12
     11f5480:	e8 c1 c2 5c 00       	call   17c1746 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1758b2>
     11f5485:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
     11f548c:	00 
     11f548d:	e8 d4 49 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11f5492:	48 89 df             	mov    rdi,rbx
     11f5495:	e8 60 fa 95 ff       	call   b54efa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1e9a>
     11f549a:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     11f549f:	e8 d2 4d 00 00       	call   11fa276 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f7fa>
     11f54a4:	e9 43 06 00 00       	jmp    11f5aec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b070>
     11f54a9:	48 89 c5             	mov    rbp,rax

### 0x11f54ac FDE=(18805556, 18832116) base=rsp facade_like=False
     11f54ac:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f5534 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f5534:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f557b FDE=(18805556, 18832116) base=rsp facade_like=False
     11f557b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f5590 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f5590:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f55e6 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f55e6:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f562f FDE=(18805556, 18832116) base=rsp facade_like=False
     11f562f:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f567d FDE=(18805556, 18832116) base=rsp facade_like=False
     11f567d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f5697 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f5697:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f5709 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f5709:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f571b FDE=(18805556, 18832116) base=rsp facade_like=False
     11f571b:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f572d FDE=(18805556, 18832116) base=rsp facade_like=False
     11f572d:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f57c3 FDE=(18805556, 18832116) base=rsp facade_like=False
     11f57c3:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x11f58a8 FDE=(18805556, 18832116) base=rsp facade_like=True
     11f58a8:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f5881:	00 
     11f5882:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
     11f5889:	00 00 
     11f588b:	48 85 ff             	test   rdi,rdi
     11f588e:	74 06                	je     11f5896 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ae1a>
     11f5890:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11f5893:	ff 50 08             	call   QWORD PTR [rax+0x8]
     11f5896:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
     11f589d:	00 
     11f589e:	e8 51 02 00 00       	call   11f5af4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b078>
     11f58a3:	eb 25                	jmp    11f58ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ae4e>
     11f58a5:	48 89 c5             	mov    rbp,rax
     11f58a8:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f58af:	00 
     11f58b0:	e8 33 4f 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     11f58b5:	4c 89 e7             	mov    rdi,r12
     11f58b8:	e8 a9 45 5e 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     11f58bd:	4c 89 f7             	mov    rdi,r14
     11f58c0:	e8 5b 86 5f 00       	call   17edf20 <_ZdlPv@plt>
     11f58c5:	eb 03                	jmp    11f58ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ae4e>
     11f58c7:	48 89 c5             	mov    rbp,rax
     11f58ca:	48 8b bc 24 58 05 00 	mov    rdi,QWORD PTR [rsp+0x558]
     11f58d1:	00 
     11f58d2:	e8 af 8b 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f58d7:	e9 10 02 00 00       	jmp    11f5aec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b070>
     11f58dc:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     11f58e1:	48 8b bb b8 02 00 00 	mov    rdi,QWORD PTR [rbx+0x2b8]
     11f58e8:	e8 99 8b 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f58ed:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     11f58f2:	e8 63 48 00 00       	call   11fa15a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f6de>

### 0x11f5974 FDE=(18805556, 18832116) base=rsp facade_like=True
     11f5974:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f593f:	e8 70 e0 8c ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
     11f5944:	48 8b 7b 78          	mov    rdi,QWORD PTR [rbx+0x78]
     11f5948:	e8 39 8b 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     11f594d:	48 8d bc 24 20 05 00 	lea    rdi,[rsp+0x520]
     11f5954:	00 
     11f5955:	e8 f8 c2 be ff       	call   de1c52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaecd8>
     11f595a:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
     11f5961:	00 
     11f5962:	e8 e9 37 00 00       	call   11f9150 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6d4>
     11f5967:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     11f596e:	00 
     11f596f:	e8 02 38 00 00       	call   11f9176 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e6fa>
     11f5974:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     11f597b:	00 
     11f597c:	e8 33 e0 8c ff       	call   ac39b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10954>
     11f5981:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     11f5986:	e9 61 01 00 00       	jmp    11f5aec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b070>
     11f598b:	48 89 c3             	mov    rbx,rax
     11f598e:	48 89 ef             	mov    rdi,rbp
     11f5991:	e8 fa 84 5f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     11f5996:	eb 03                	jmp    11f599b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af1f>
     11f5998:	48 89 c3             	mov    rbx,rax
     11f599b:	4c 89 f7             	mov    rdi,r14
     11f599e:	e8 7d 85 5f 00       	call   17edf20 <_ZdlPv@plt>
     11f59a3:	e9 dc 00 00 00       	jmp    11f5a84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b008>
     11f59a8:	eb 00                	jmp    11f59aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3af2e>
     11f59aa:	48 89 c7             	mov    rdi,rax
     11f59ad:	e8 f3 40 88 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     11f59b2:	49 89 c5             	mov    r13,rax
     11f59b5:	48 8b bc 24 88 05 00 	mov    rdi,QWORD PTR [rsp+0x588]

### 0x1203231 FDE=(18884874, 18890725) base=rsp facade_like=False
     1203231:	48 8b b4 24 c0 05 00 	mov    rsi,QWORD PTR [rsp+0x5c0]

### 0x12286e1 FDE=(19039932, 19042774) base=rsp facade_like=False
     12286e1:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax

### 0x1228eb4 FDE=(19039932, 19042774) base=rcx facade_like=False
     1228eb4:	48 8b b1 c0 05 00 00 	mov    rsi,QWORD PTR [rcx+0x5c0]

### 0x122907f FDE=(19039932, 19042774) base=r13 facade_like=False
     122907f:	49 8b b5 c0 05 00 00 	mov    rsi,QWORD PTR [r13+0x5c0]

### 0x12290b9 FDE=(19039932, 19042774) base=rsp facade_like=False
     12290b9:	48 3b 84 24 c0 05 00 	cmp    rax,QWORD PTR [rsp+0x5c0]

### 0x1229382 FDE=(19043053, 19044451) base=rsp facade_like=True
     1229382:	8a 84 24 c0 05 00 00 	mov    al,BYTE PTR [rsp+0x5c0]
     122934f:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     1229354:	4c 89 f6             	mov    rsi,r14
     1229357:	e8 e4 4b 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     122935c:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
     1229361:	48 89 df             	mov    rdi,rbx
     1229364:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
     1229369:	e8 d2 4b 5c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     122936e:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     1229373:	8a 41 10             	mov    al,BYTE PTR [rcx+0x10]
     1229376:	88 43 28             	mov    BYTE PTR [rbx+0x28],al
     1229379:	f3 0f 6f 01          	movdqu xmm0,XMMWORD PTR [rcx]
     122937d:	f3 0f 7f 43 18       	movdqu XMMWORD PTR [rbx+0x18],xmm0
     1229382:	8a 84 24 c0 05 00 00 	mov    al,BYTE PTR [rsp+0x5c0]
     1229389:	88 44 24 2f          	mov    BYTE PTR [rsp+0x2f],al
     122938d:	41 80 be 2d 02 00 00 	cmp    BYTE PTR [r14+0x22d],0x0
     1229394:	00 
     1229395:	0f 84 83 00 00 00    	je     122941e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6e9a2>
     122939b:	66 41 0f 38 31 86 29 	pmovzxbd xmm0,DWORD PTR [r14+0x229]
     12293a2:	02 00 00 
     12293a5:	66 0f 76 05 43 4a 16 	pcmpeqd xmm0,XMMWORD PTR [rip+0xffffffffff164a43]        # 38ddf0 <_ZTSSt12bad_any_cast@@Base-0x23d8>
     12293ac:	ff 
     12293ad:	0f 50 c0             	movmskps eax,xmm0
     12293b0:	89 c1                	mov    ecx,eax
     12293b2:	89 c2                	mov    edx,eax
     12293b4:	66 0f 6e c0          	movd   xmm0,eax
     12293b8:	24 04                	and    al,0x4
     12293ba:	c0 e8 02             	shr    al,0x2
     12293bd:	80 e1 02             	and    cl,0x2
     12293c0:	d0 e9                	shr    cl,1
     12293c2:	c0 ea 03             	shr    dl,0x3

### 0x122ad5d FDE=(19049690, 19049974) base=rbx facade_like=False
     122ad5d:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0

### 0x122c9dc FDE=(19056932, 19057375) base=rbx facade_like=False
     122c9dc:	48 8d bb c0 05 00 00 	lea    rdi,[rbx+0x5c0]

### 0x122cba0 FDE=(19057568, 19057576) base=rdi facade_like=False
     122cba0:	48 8d 87 c0 05 00 00 	lea    rax,[rdi+0x5c0]

### 0x1264a7c FDE=(19280404, 19290341) base=rsp facade_like=False
     1264a7c:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x127b61b FDE=(19378798, 19388543) base=rsp facade_like=False
     127b61b:	0f 11 84 24 c0 05 00 	movups XMMWORD PTR [rsp+0x5c0],xmm0

### 0x1288b5b FDE=(19434302, 19434972) base=rsp facade_like=True
     1288b5b:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     1288b36:	48 89 df             	mov    rdi,rbx
     1288b39:	e8 67 0f 7f ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     1288b3e:	55                   	push   rbp
     1288b3f:	41 57                	push   r15
     1288b41:	41 56                	push   r14
     1288b43:	41 55                	push   r13
     1288b45:	41 54                	push   r12
     1288b47:	53                   	push   rbx
     1288b48:	48 81 ec c8 05 00 00 	sub    rsp,0x5c8
     1288b4f:	49 89 f6             	mov    r14,rsi
     1288b52:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1288b59:	00 00 
     1288b5b:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax
     1288b62:	00 
     1288b63:	80 be f4 00 00 00 00 	cmp    BYTE PTR [rsi+0xf4],0x0
     1288b6a:	74 09                	je     1288b75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xce0f9>
     1288b6c:	41 8b ae f0 00 00 00 	mov    ebp,DWORD PTR [r14+0xf0]
     1288b73:	eb 03                	jmp    1288b78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xce0fc>
     1288b75:	6a 01                	push   0x1
     1288b77:	5d                   	pop    rbp
     1288b78:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1288b7b:	49 8d 76 18          	lea    rsi,[r14+0x18]
     1288b7f:	48 8d bc 24 70 01 00 	lea    rdi,[rsp+0x170]
     1288b86:	00 
     1288b87:	e8 b4 53 56 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1288b8c:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
     1288b93:	00 
     1288b94:	4c 89 f6             	mov    rsi,r14
     1288b97:	e8 a4 53 56 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1288b9c:	89 ac 24 8c 00 00 00 	mov    DWORD PTR [rsp+0x8c],ebp

### 0x1288d6c FDE=(19434302, 19434972) base=rsp facade_like=False
     1288d6c:	48 3b 84 24 c0 05 00 	cmp    rax,QWORD PTR [rsp+0x5c0]

### 0x1288dc5 FDE=(19434302, 19434972) base=rsp facade_like=False
     1288dc5:	48 3b 84 24 c0 05 00 	cmp    rax,QWORD PTR [rsp+0x5c0]

### 0x12995bb FDE=(19500422, 19507323) base=rsp facade_like=False
     12995bb:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax

### 0x12abd08 FDE=(19578074, 19580093) base=rsp facade_like=False
     12abd08:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax

### 0x12ac321 FDE=(19578074, 19580093) base=rsp facade_like=False
     12ac321:	48 3b 84 24 c0 05 00 	cmp    rax,QWORD PTR [rsp+0x5c0]

### 0x12ac4a6 FDE=(19578074, 19580093) base=rsp facade_like=False
     12ac4a6:	48 3b 84 24 c0 05 00 	cmp    rax,QWORD PTR [rsp+0x5c0]

### 0x12cb808 FDE=(19706118, 19709044) base=rbx facade_like=False
     12cb808:	0f 11 83 c0 05 00 00 	movups XMMWORD PTR [rbx+0x5c0],xmm0

### 0x12d8f46 FDE=(19762468, 19763369) base=rbx facade_like=False
     12d8f46:	4c 8d b3 c0 05 00 00 	lea    r14,[rbx+0x5c0]

### 0x12fb9b2 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fb9b2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fb9ce FDE=(19904858, 19910170) base=rsp facade_like=False
     12fb9ce:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fba30 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fba30:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fba52 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fba52:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fbaca FDE=(19904858, 19910170) base=rsp facade_like=False
     12fbaca:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x12fbaec FDE=(19904858, 19910170) base=rsp facade_like=False
     12fbaec:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fbcec FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbcec:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
     12fbcb6:	00 
     12fbcb7:	48 8d 15 7a 08 0e ff 	lea    rdx,[rip+0xffffffffff0e087a]        # 3dc538 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f87>
     12fbcbe:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbcc5:	00 
     12fbcc6:	e8 4f 11 00 00       	call   12fce1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14239e>
     12fbccb:	44 89 74 24 28       	mov    DWORD PTR [rsp+0x28],r14d
     12fbcd0:	4c 89 6c 24 30       	mov    QWORD PTR [rsp+0x30],r13
     12fbcd5:	4c 8b a4 24 a0 06 00 	mov    r12,QWORD PTR [rsp+0x6a0]
     12fbcdc:	00 
     12fbcdd:	4c 8b b4 24 a8 06 00 	mov    r14,QWORD PTR [rsp+0x6a8]
     12fbce4:	00 
     12fbce5:	4c 8d 2d 34 08 0e ff 	lea    r13,[rip+0xffffffffff0e0834]        # 3dc520 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f6f>
     12fbcec:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
     12fbcf3:	00 
     12fbcf4:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     12fbcf9:	4d 39 f4             	cmp    r12,r14
     12fbcfc:	0f 84 2e 02 00 00    	je     12fbf30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1414b4>
     12fbd02:	49 83 c4 30          	add    r12,0x30
     12fbd06:	48 89 ef             	mov    rdi,rbp
     12fbd09:	4c 89 e6             	mov    rsi,r12
     12fbd0c:	4c 89 ea             	mov    rdx,r13
     12fbd0f:	e8 14 11 00 00       	call   12fce28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1423ac>
     12fbd14:	4c 8b bc 24 c0 05 00 	mov    r15,QWORD PTR [rsp+0x5c0]
     12fbd1b:	00 
     12fbd1c:	48 8b 9c 24 c8 05 00 	mov    rbx,QWORD PTR [rsp+0x5c8]
     12fbd23:	00 
     12fbd24:	48 89 ef             	mov    rdi,rbp
     12fbd27:	e8 2e 8f bc ff       	call   ec4c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c070>
     12fbd2c:	49 83 c4 38          	add    r12,0x38
     12fbd30:	49 39 df             	cmp    r15,rbx

### 0x12fbd14 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbd14:	4c 8b bc 24 c0 05 00 	mov    r15,QWORD PTR [rsp+0x5c0]
     12fbce4:	00 
     12fbce5:	4c 8d 2d 34 08 0e ff 	lea    r13,[rip+0xffffffffff0e0834]        # 3dc520 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1f6f>
     12fbcec:	48 8d ac 24 c0 05 00 	lea    rbp,[rsp+0x5c0]
     12fbcf3:	00 
     12fbcf4:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     12fbcf9:	4d 39 f4             	cmp    r12,r14
     12fbcfc:	0f 84 2e 02 00 00    	je     12fbf30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1414b4>
     12fbd02:	49 83 c4 30          	add    r12,0x30
     12fbd06:	48 89 ef             	mov    rdi,rbp
     12fbd09:	4c 89 e6             	mov    rsi,r12
     12fbd0c:	4c 89 ea             	mov    rdx,r13
     12fbd0f:	e8 14 11 00 00       	call   12fce28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1423ac>
     12fbd14:	4c 8b bc 24 c0 05 00 	mov    r15,QWORD PTR [rsp+0x5c0]
     12fbd1b:	00 
     12fbd1c:	48 8b 9c 24 c8 05 00 	mov    rbx,QWORD PTR [rsp+0x5c8]
     12fbd23:	00 
     12fbd24:	48 89 ef             	mov    rdi,rbp
     12fbd27:	e8 2e 8f bc ff       	call   ec4c5a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8c070>
     12fbd2c:	49 83 c4 38          	add    r12,0x38
     12fbd30:	49 39 df             	cmp    r15,rbx
     12fbd33:	4c 8b 7c 24 38       	mov    r15,QWORD PTR [rsp+0x38]
     12fbd38:	74 bf                	je     12fbcf9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14127d>
     12fbd3a:	4c 8d a4 24 a0 06 00 	lea    r12,[rsp+0x6a0]
     12fbd41:	00 
     12fbd42:	4c 89 e7             	mov    rdi,r12
     12fbd45:	e8 3e f6 b0 ff       	call   e0b388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd840e>
     12fbd4a:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     12fbd4f:	4c 8d b5 18 04 00 00 	lea    r14,[rbp+0x418]
     12fbd56:	4c 8d 3d cb 7d 56 00 	lea    r15,[rip+0x567dcb]        # 1863b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20210>
     12fbd5d:	48 8d 84 24 b0 00 00 	lea    rax,[rsp+0xb0]

### 0x12fbdc6 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbdc6:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbd92:	48 8d 0d cf 7d 56 00 	lea    rcx,[rip+0x567dcf]        # 1863b68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20250>
     12fbd99:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     12fbda0:	00 
     12fbda1:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     12fbda4:	48 8d 8c 24 20 01 00 	lea    rcx,[rsp+0x120]
     12fbdab:	00 
     12fbdac:	48 89 4e 08          	mov    QWORD PTR [rsi+0x8],rcx
     12fbdb0:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     12fbdb5:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
     12fbdb9:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     12fbdbd:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     12fbdc2:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     12fbdc6:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbdcd:	00 
     12fbdce:	e8 91 45 00 00       	call   1300364 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1458e8>
     12fbdd3:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbdda:	00 
     12fbddb:	e8 48 b0 ff ff       	call   12f6e28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13c3ac>
     12fbde0:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]
     12fbde7:	00 
     12fbde8:	48 89 c7             	mov    rdi,rax
     12fbdeb:	48 89 de             	mov    rsi,rbx
     12fbdee:	e8 65 b0 ff ff       	call   12f6e58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13c3dc>
     12fbdf3:	48 89 df             	mov    rdi,rbx
     12fbdf6:	e8 d3 80 3b 00       	call   16b3ece <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6803a>
     12fbdfb:	4c 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r15
     12fbe02:	00 
     12fbe03:	4c 89 b4 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],r14
     12fbe0a:	00 
     12fbe0b:	0f 57 c0             	xorps  xmm0,xmm0

### 0x12fbde0 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbde0:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]
     12fbdac:	48 89 4e 08          	mov    QWORD PTR [rsi+0x8],rcx
     12fbdb0:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     12fbdb5:	48 89 4e 10          	mov    QWORD PTR [rsi+0x10],rcx
     12fbdb9:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
     12fbdbd:	48 8d 44 24 60       	lea    rax,[rsp+0x60]
     12fbdc2:	48 89 46 20          	mov    QWORD PTR [rsi+0x20],rax
     12fbdc6:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbdcd:	00 
     12fbdce:	e8 91 45 00 00       	call   1300364 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1458e8>
     12fbdd3:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbdda:	00 
     12fbddb:	e8 48 b0 ff ff       	call   12f6e28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13c3ac>
     12fbde0:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]
     12fbde7:	00 
     12fbde8:	48 89 c7             	mov    rdi,rax
     12fbdeb:	48 89 de             	mov    rsi,rbx
     12fbdee:	e8 65 b0 ff ff       	call   12f6e58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13c3dc>
     12fbdf3:	48 89 df             	mov    rdi,rbx
     12fbdf6:	e8 d3 80 3b 00       	call   16b3ece <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6803a>
     12fbdfb:	4c 89 bc 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r15
     12fbe02:	00 
     12fbe03:	4c 89 b4 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],r14
     12fbe0a:	00 
     12fbe0b:	0f 57 c0             	xorps  xmm0,xmm0
     12fbe0e:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0
     12fbe13:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     12fbe1a:	00 00 
     12fbe1c:	48 8d 15 55 06 0e ff 	lea    rdx,[rip+0xffffffffff0e0655]        # 3dc478 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1ec7>
     12fbe23:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     12fbe2a:	00 

### 0x12fbe66 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbe66:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
     12fbe33:	e8 e2 0f 00 00       	call   12fce1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14239e>
     12fbe38:	48 8b 84 24 d8 00 00 	mov    rax,QWORD PTR [rsp+0xd8]
     12fbe3f:	00 
     12fbe40:	48 8b 8c 24 e0 00 00 	mov    rcx,QWORD PTR [rsp+0xe0]
     12fbe47:	00 
     12fbe48:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
     12fbe4d:	48 39 c8             	cmp    rax,rcx
     12fbe50:	0f 84 4f 0c 00 00    	je     12fcaa5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x142029>
     12fbe56:	4c 8d b4 24 c0 00 00 	lea    r14,[rsp+0xc0]
     12fbe5d:	00 
     12fbe5e:	4c 8d bc 24 f0 00 00 	lea    r15,[rsp+0xf0]
     12fbe65:	00 
     12fbe66:	4c 8d ac 24 c0 05 00 	lea    r13,[rsp+0x5c0]
     12fbe6d:	00 
     12fbe6e:	4c 8d a4 24 88 00 00 	lea    r12,[rsp+0x88]
     12fbe75:	00 
     12fbe76:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
     12fbe7b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     12fbe80:	48 8d 70 30          	lea    rsi,[rax+0x30]
     12fbe84:	4c 89 f7             	mov    rdi,r14
     12fbe87:	48 8d 15 02 06 0e ff 	lea    rdx,[rip+0xffffffffff0e0602]        # 3dc490 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x1edf>
     12fbe8e:	e8 95 0f 00 00       	call   12fce28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1423ac>
     12fbe93:	4c 8b b4 24 c0 00 00 	mov    r14,QWORD PTR [rsp+0xc0]
     12fbe9a:	00 
     12fbe9b:	48 8b ac 24 c8 00 00 	mov    rbp,QWORD PTR [rsp+0xc8]
     12fbea2:	00 
     12fbea3:	49 39 ee             	cmp    r14,rbp
     12fbea6:	74 50                	je     12fbef8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14147c>
     12fbea8:	48 8d 05 e1 7e 56 00 	lea    rax,[rip+0x567ee1]        # 1863d90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20478>
     12fbeaf:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax

### 0x12fbf68 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbf68:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf37:	00 
     12fbf38:	e8 4b f4 b0 ff       	call   e0b388 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd840e>
     12fbf3d:	4c 8b 6c 24 30       	mov    r13,QWORD PTR [rsp+0x30]
     12fbf42:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     12fbf47:	44 8b 74 24 28       	mov    r14d,DWORD PTR [rsp+0x28]
     12fbf4c:	48 8d 9c 24 50 01 00 	lea    rbx,[rsp+0x150]
     12fbf53:	00 
     12fbf54:	48 8d 35 25 07 14 ff 	lea    rsi,[rip+0xffffffffff140725]        # 43c680 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x228c>
     12fbf5b:	48 89 df             	mov    rdi,rbx
     12fbf5e:	e8 09 f5 95 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
     12fbf63:	48 85 c0             	test   rax,rax
     12fbf66:	74 4e                	je     12fbfb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14153a>
     12fbf68:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf6f:	00 
     12fbf70:	48 89 c6             	mov    rsi,rax
     12fbf73:	e8 9d f8 ff ff       	call   12fb815 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d99>
     12fbf78:	80 bc 24 90 06 00 00 	cmp    BYTE PTR [rsp+0x690],0x0
     12fbf7f:	00 
     12fbf80:	74 27                	je     12fbfa9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14152d>
     12fbf82:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbf89:	00 
     12fbf8a:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
     12fbf91:	00 
     12fbf92:	e8 f5 ea f9 ff       	call   129aa8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0010>
     12fbf97:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf9e:	00 
     12fbf9f:	e8 60 43 f1 ff       	call   1210304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55888>
     12fbfa4:	e9 03 01 00 00       	jmp    12fc0ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141630>
     12fbfa9:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbfb0:	00 

### 0x12fbf8a FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbf8a:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
     12fbf5e:	e8 09 f5 95 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
     12fbf63:	48 85 c0             	test   rax,rax
     12fbf66:	74 4e                	je     12fbfb6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14153a>
     12fbf68:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf6f:	00 
     12fbf70:	48 89 c6             	mov    rsi,rax
     12fbf73:	e8 9d f8 ff ff       	call   12fb815 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d99>
     12fbf78:	80 bc 24 90 06 00 00 	cmp    BYTE PTR [rsp+0x690],0x0
     12fbf7f:	00 
     12fbf80:	74 27                	je     12fbfa9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14152d>
     12fbf82:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbf89:	00 
     12fbf8a:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
     12fbf91:	00 
     12fbf92:	e8 f5 ea f9 ff       	call   129aa8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0010>
     12fbf97:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf9e:	00 
     12fbf9f:	e8 60 43 f1 ff       	call   1210304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55888>
     12fbfa4:	e9 03 01 00 00       	jmp    12fc0ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141630>
     12fbfa9:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbfb0:	00 
     12fbfb1:	e8 4e 43 f1 ff       	call   1210304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55888>
     12fbfb6:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbfbd:	00 
     12fbfbe:	e8 21 b2 ff ff       	call   12f71e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13c768>
     12fbfc3:	48 8d 35 f6 05 14 ff 	lea    rsi,[rip+0xffffffffff1405f6]        # 43c5c0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x21cc>
     12fbfca:	48 89 df             	mov    rdi,rbx
     12fbfcd:	e8 9a f4 95 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
     12fbfd2:	48 85 c0             	test   rax,rax
     12fbfd5:	74 1e                	je     12fbff5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141579>

### 0x12fbf97 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbf97:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf68:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf6f:	00 
     12fbf70:	48 89 c6             	mov    rsi,rax
     12fbf73:	e8 9d f8 ff ff       	call   12fb815 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x140d99>
     12fbf78:	80 bc 24 90 06 00 00 	cmp    BYTE PTR [rsp+0x690],0x0
     12fbf7f:	00 
     12fbf80:	74 27                	je     12fbfa9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14152d>
     12fbf82:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbf89:	00 
     12fbf8a:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
     12fbf91:	00 
     12fbf92:	e8 f5 ea f9 ff       	call   129aa8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0010>
     12fbf97:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf9e:	00 
     12fbf9f:	e8 60 43 f1 ff       	call   1210304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55888>
     12fbfa4:	e9 03 01 00 00       	jmp    12fc0ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141630>
     12fbfa9:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbfb0:	00 
     12fbfb1:	e8 4e 43 f1 ff       	call   1210304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55888>
     12fbfb6:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbfbd:	00 
     12fbfbe:	e8 21 b2 ff ff       	call   12f71e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13c768>
     12fbfc3:	48 8d 35 f6 05 14 ff 	lea    rsi,[rip+0xffffffffff1405f6]        # 43c5c0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x21cc>
     12fbfca:	48 89 df             	mov    rdi,rbx
     12fbfcd:	e8 9a f4 95 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
     12fbfd2:	48 85 c0             	test   rax,rax
     12fbfd5:	74 1e                	je     12fbff5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141579>
     12fbfd7:	48 89 c7             	mov    rdi,rax
     12fbfda:	e8 57 f8 77 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     12fbfdf:	48 8d 8c 24 a0 06 00 	lea    rcx,[rsp+0x6a0]

### 0x12fbfa9 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fbfa9:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf78:	80 bc 24 90 06 00 00 	cmp    BYTE PTR [rsp+0x690],0x0
     12fbf7f:	00 
     12fbf80:	74 27                	je     12fbfa9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14152d>
     12fbf82:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbf89:	00 
     12fbf8a:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
     12fbf91:	00 
     12fbf92:	e8 f5 ea f9 ff       	call   129aa8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0010>
     12fbf97:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbf9e:	00 
     12fbf9f:	e8 60 43 f1 ff       	call   1210304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55888>
     12fbfa4:	e9 03 01 00 00       	jmp    12fc0ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141630>
     12fbfa9:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fbfb0:	00 
     12fbfb1:	e8 4e 43 f1 ff       	call   1210304 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55888>
     12fbfb6:	48 8d bc 24 a0 06 00 	lea    rdi,[rsp+0x6a0]
     12fbfbd:	00 
     12fbfbe:	e8 21 b2 ff ff       	call   12f71e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13c768>
     12fbfc3:	48 8d 35 f6 05 14 ff 	lea    rsi,[rip+0xffffffffff1405f6]        # 43c5c0 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x21cc>
     12fbfca:	48 89 df             	mov    rdi,rbx
     12fbfcd:	e8 9a f4 95 ff       	call   c5b46c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a840c>
     12fbfd2:	48 85 c0             	test   rax,rax
     12fbfd5:	74 1e                	je     12fbff5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141579>
     12fbfd7:	48 89 c7             	mov    rdi,rax
     12fbfda:	e8 57 f8 77 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     12fbfdf:	48 8d 8c 24 a0 06 00 	lea    rcx,[rsp+0x6a0]
     12fbfe6:	00 
     12fbfe7:	48 89 c7             	mov    rdi,rax
     12fbfea:	48 89 d6             	mov    rsi,rdx
     12fbfed:	48 89 ca             	mov    rdx,rcx

### 0x12fc0d4 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc0d4:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fc0ff FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc0ff:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fc165 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc165:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fc1b7 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc1b7:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fc431 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fc431:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]
     12fc3f7:	81 c9 00 10 00 00    	or     ecx,0x1000
     12fc3fd:	89 8c 24 d0 05 00 00 	mov    DWORD PTR [rsp+0x5d0],ecx
     12fc404:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
     12fc409:	8b 49 1c             	mov    ecx,DWORD PTR [rcx+0x1c]
     12fc40c:	83 f9 02             	cmp    ecx,0x2
     12fc40f:	77 13                	ja     12fc424 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1419a8>
     12fc411:	89 8c 24 40 06 00 00 	mov    DWORD PTR [rsp+0x640],ecx
     12fc418:	0d 00 90 00 00       	or     eax,0x9000
     12fc41d:	89 84 24 d0 05 00 00 	mov    DWORD PTR [rsp+0x5d0],eax
     12fc424:	48 8d bc 24 38 05 00 	lea    rdi,[rsp+0x538]
     12fc42b:	00 
     12fc42c:	e8 e1 3e f1 ff       	call   1210312 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55896>
     12fc431:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]
     12fc438:	00 
     12fc439:	48 89 c7             	mov    rdi,rax
     12fc43c:	48 89 de             	mov    rsi,rbx
     12fc43f:	e8 9e 1a fa ff       	call   129dee2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3466>
     12fc444:	48 89 df             	mov    rdi,rbx
     12fc447:	e8 ac 72 3b 00       	call   16b36f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67864>
     12fc44c:	80 bc 24 18 01 00 00 	cmp    BYTE PTR [rsp+0x118],0x0
     12fc453:	00 
     12fc454:	74 7d                	je     12fc4d3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141a57>
     12fc456:	48 8d bc 24 38 05 00 	lea    rdi,[rsp+0x538]
     12fc45d:	00 
     12fc45e:	e8 af 3e f1 ff       	call   1210312 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55896>
     12fc463:	48 89 c7             	mov    rdi,rax
     12fc466:	e8 d7 3e f1 ff       	call   1210342 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x558c6>
     12fc46b:	48 89 c3             	mov    rbx,rax
     12fc46e:	8b 68 10             	mov    ebp,DWORD PTR [rax+0x10]
     12fc471:	40 f6 c5 01          	test   bpl,0x1

### 0x12fc4d3 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fc4d3:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc4a0:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     12fc4a5:	48 8d b0 40 05 00 00 	lea    rsi,[rax+0x540]
     12fc4ac:	83 cd 02             	or     ebp,0x2
     12fc4af:	89 6b 10             	mov    DWORD PTR [rbx+0x10],ebp
     12fc4b2:	48 89 df             	mov    rdi,rbx
     12fc4b5:	48 83 c7 20          	add    rdi,0x20
     12fc4b9:	48 8b 53 08          	mov    rdx,QWORD PTR [rbx+0x8]
     12fc4bd:	f6 c2 01             	test   dl,0x1
     12fc4c0:	0f 85 3c 07 00 00    	jne    12fcc02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x142186>
     12fc4c6:	e8 c7 92 46 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     12fc4cb:	48 89 df             	mov    rdi,rbx
     12fc4ce:	e8 2f 3f f1 ff       	call   1210402 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55986>
     12fc4d3:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc4da:	00 
     12fc4db:	e8 06 94 f6 ff       	call   12658e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaae6a>
     12fc4e0:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12fc4e5:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
     12fc4e9:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     12fc4ee:	74 2a                	je     12fc51a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141a9e>
     12fc4f0:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc4f7:	00 
     12fc4f8:	e8 f1 93 f6 ff       	call   12658ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaae72>
     12fc4fd:	48 89 c1             	mov    rcx,rax
     12fc500:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12fc505:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12fc508:	be e8 03 00 00       	mov    esi,0x3e8
     12fc50d:	48 99                	cqo
     12fc50f:	48 f7 fe             	idiv   rsi
     12fc512:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     12fc516:	80 49 10 01          	or     BYTE PTR [rcx+0x10],0x1

### 0x12fc4f0 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fc4f0:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc4bd:	f6 c2 01             	test   dl,0x1
     12fc4c0:	0f 85 3c 07 00 00    	jne    12fcc02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x142186>
     12fc4c6:	e8 c7 92 46 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
     12fc4cb:	48 89 df             	mov    rdi,rbx
     12fc4ce:	e8 2f 3f f1 ff       	call   1210402 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x55986>
     12fc4d3:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc4da:	00 
     12fc4db:	e8 06 94 f6 ff       	call   12658e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaae6a>
     12fc4e0:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12fc4e5:	80 7f 08 00          	cmp    BYTE PTR [rdi+0x8],0x0
     12fc4e9:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     12fc4ee:	74 2a                	je     12fc51a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141a9e>
     12fc4f0:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc4f7:	00 
     12fc4f8:	e8 f1 93 f6 ff       	call   12658ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaae72>
     12fc4fd:	48 89 c1             	mov    rcx,rax
     12fc500:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12fc505:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12fc508:	be e8 03 00 00       	mov    esi,0x3e8
     12fc50d:	48 99                	cqo
     12fc50f:	48 f7 fe             	idiv   rsi
     12fc512:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     12fc516:	80 49 10 01          	or     BYTE PTR [rcx+0x10],0x1
     12fc51a:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     12fc51e:	74 2b                	je     12fc54b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141acf>
     12fc520:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc527:	00 
     12fc528:	e8 63 4b f1 ff       	call   1211090 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56614>
     12fc52d:	48 89 c1             	mov    rcx,rax
     12fc530:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]

### 0x12fc520 FDE=(19904858, 19910170) base=rsp facade_like=True
     12fc520:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc4f7:	00 
     12fc4f8:	e8 f1 93 f6 ff       	call   12658ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xaae72>
     12fc4fd:	48 89 c1             	mov    rcx,rax
     12fc500:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12fc505:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12fc508:	be e8 03 00 00       	mov    esi,0x3e8
     12fc50d:	48 99                	cqo
     12fc50f:	48 f7 fe             	idiv   rsi
     12fc512:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     12fc516:	80 49 10 01          	or     BYTE PTR [rcx+0x10],0x1
     12fc51a:	80 7f 18 00          	cmp    BYTE PTR [rdi+0x18],0x0
     12fc51e:	74 2b                	je     12fc54b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x141acf>
     12fc520:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     12fc527:	00 
     12fc528:	e8 63 4b f1 ff       	call   1211090 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x56614>
     12fc52d:	48 89 c1             	mov    rcx,rax
     12fc530:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     12fc535:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     12fc539:	be e8 03 00 00       	mov    esi,0x3e8
     12fc53e:	48 99                	cqo
     12fc540:	48 f7 fe             	idiv   rsi
     12fc543:	48 89 41 18          	mov    QWORD PTR [rcx+0x18],rax
     12fc547:	80 49 10 01          	or     BYTE PTR [rcx+0x10],0x1
     12fc54b:	48 8d 9c 24 d8 05 00 	lea    rbx,[rsp+0x5d8]
     12fc552:	00 
     12fc553:	4c 8b 67 20          	mov    r12,QWORD PTR [rdi+0x20]
     12fc557:	4c 8b 7f 28          	mov    r15,QWORD PTR [rdi+0x28]
     12fc55b:	4c 89 f8             	mov    rax,r15
     12fc55e:	4c 29 e0             	sub    rax,r12
     12fc561:	6a 18                	push   0x18

### 0x12fc63d FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc63d:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0x12fc65f FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc65f:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fc674 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc674:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x12fc6cb FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc6cb:	4c 8d bc 24 c0 05 00 	lea    r15,[rsp+0x5c0]

### 0x12fc843 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc843:	48 8d 9c 24 c0 05 00 	lea    rbx,[rsp+0x5c0]

### 0x12fc96f FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc96f:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fc9df FDE=(19904858, 19910170) base=rsp facade_like=False
     12fc9df:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fca28 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fca28:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fca6c FDE=(19904858, 19910170) base=rsp facade_like=False
     12fca6c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fcc41 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fcc41:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fcc6c FDE=(19904858, 19910170) base=rsp facade_like=False
     12fcc6c:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fcc88 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fcc88:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fccf0 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fccf0:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fcd4a FDE=(19904858, 19910170) base=rsp facade_like=False
     12fcd4a:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fcd65 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fcd65:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fcda8 FDE=(19904858, 19910170) base=rsp facade_like=False
     12fcda8:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x12fcdbc FDE=(19904858, 19910170) base=rsp facade_like=False
     12fcdbc:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x1333835 FDE=(20131328, 20138970) base=rbx facade_like=False
     1333835:	48 89 83 c0 05 00 00 	mov    QWORD PTR [rbx+0x5c0],rax

### 0x1333859 FDE=(20131328, 20138970) base=rbx facade_like=False
     1333859:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x1333ade FDE=(20131328, 20138970) base=rbx facade_like=False
     1333ade:	4c 8b bb c0 05 00 00 	mov    r15,QWORD PTR [rbx+0x5c0]

### 0x1333c33 FDE=(20131328, 20138970) base=rbx facade_like=False
     1333c33:	48 8b b3 c0 05 00 00 	mov    rsi,QWORD PTR [rbx+0x5c0]

### 0x133435a FDE=(20131328, 20138970) base=rbx facade_like=False
     133435a:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x1337bfd FDE=(20151286, 20151420) base=rbx facade_like=False
     1337bfd:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x13383d5 FDE=(20152988, 20155013) base=rbx facade_like=False
     13383d5:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x1339135 FDE=(20156600, 20158873) base=rbx facade_like=False
     1339135:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x133a3e3 FDE=(20161470, 20161521) base=rbx facade_like=False
     133a3e3:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x133a5c5 FDE=(20161962, 20162273) base=rsi facade_like=False
     133a5c5:	48 8b b6 c0 05 00 00 	mov    rsi,QWORD PTR [rsi+0x5c0]

### 0x133a722 FDE=(20162274, 20162352) base=rbx facade_like=False
     133a722:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x133a75c FDE=(20162352, 20162631) base=r14 facade_like=False
     133a75c:	49 8b be c0 05 00 00 	mov    rdi,QWORD PTR [r14+0x5c0]

### 0x133a84c FDE=(20162632, 20162674) base=rdi facade_like=False
     133a84c:	48 8b bf c0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5c0]

### 0x1358d1c FDE=(20286734, 20287111) base=rsp facade_like=False
     1358d1c:	48 8b 9c 24 c0 05 00 	mov    rbx,QWORD PTR [rsp+0x5c0]

### 0x135c7b3 FDE=(20301694, 20301915) base=rax facade_like=False
     135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]

### 0x135d5f2 FDE=(20303958, 20319259) base=rsp facade_like=False
     135d5f2:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x135d936 FDE=(20303958, 20319259) base=rsp facade_like=True
     135d936:	4c 89 b4 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r14
     135d900:	49 89 c5             	mov    r13,rax
     135d903:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
     135d90a:	00 
     135d90b:	48 8d b4 24 a0 09 00 	lea    rsi,[rsp+0x9a0]
     135d912:	00 
     135d913:	e8 78 c9 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     135d918:	48 8d 05 c1 0f 4b 00 	lea    rax,[rip+0x4b0fc1]        # 180e8e0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x45a0>
     135d91f:	48 89 84 24 a0 05 00 	mov    QWORD PTR [rsp+0x5a0],rax
     135d926:	00 
     135d927:	48 8b 05 7a 41 55 00 	mov    rax,QWORD PTR [rip+0x55417a]        # 18b1aa8 <_ZNSt6__ndk16chrono12steady_clock3nowEv@@Base+0xeaf8e8>
     135d92e:	48 89 84 24 a8 05 00 	mov    QWORD PTR [rsp+0x5a8],rax
     135d935:	00 
     135d936:	4c 89 b4 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],r14
     135d93d:	00 
     135d93e:	48 8d 05 6b a5 50 00 	lea    rax,[rip+0x50a56b]        # 1867eb0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24598>
     135d945:	48 89 84 24 60 0f 00 	mov    QWORD PTR [rsp+0xf60],rax
     135d94c:	00 
     135d94d:	4c 89 bc 24 80 0f 00 	mov    QWORD PTR [rsp+0xf80],r15
     135d954:	00 
     135d955:	48 8b 9c 24 b0 0d 00 	mov    rbx,QWORD PTR [rsp+0xdb0]
     135d95c:	00 
     135d95d:	4c 8b b4 24 b8 0d 00 	mov    r14,QWORD PTR [rsp+0xdb8]
     135d964:	00 
     135d965:	48 89 9c 24 20 03 00 	mov    QWORD PTR [rsp+0x320],rbx
     135d96c:	00 
     135d96d:	4c 89 b4 24 28 03 00 	mov    QWORD PTR [rsp+0x328],r14
     135d974:	00 
     135d975:	4c 8b a4 24 c0 0d 00 	mov    r12,QWORD PTR [rsp+0xdc0]
     135d97c:	00 
     135d97d:	4c 89 a4 24 30 03 00 	mov    QWORD PTR [rsp+0x330],r12

### 0x135f6af FDE=(20303958, 20319259) base=r14 facade_like=False
     135f6af:	66 41 83 a6 c0 05 00 	and    WORD PTR [r14+0x5c0],0x0

### 0x1367c4d FDE=(20347734, 20348364) base=r14 facade_like=False
     1367c4d:	41 80 be c0 05 00 00 	cmp    BYTE PTR [r14+0x5c0],0x0

### 0x1367cc8 FDE=(20347734, 20348364) base=r14 facade_like=False
     1367cc8:	41 c6 86 c0 05 00 00 	mov    BYTE PTR [r14+0x5c0],0x0

### 0x136dd3d FDE=(20371922, 20373584) base=rbp facade_like=False
     136dd3d:	48 8b 85 c0 05 00 00 	mov    rax,QWORD PTR [rbp+0x5c0]

### 0x136f412 FDE=(20377578, 20379228) base=rbx facade_like=False
     136f412:	c6 83 c0 05 00 00 01 	mov    BYTE PTR [rbx+0x5c0],0x1

### 0x13760e8 FDE=(20404350, 20407732) base=rsp facade_like=False
     13760e8:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x13760f3 FDE=(20404350, 20407732) base=rsp facade_like=False
     13760f3:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x13762a8 FDE=(20404350, 20407732) base=rsp facade_like=False
     13762a8:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x137630c FDE=(20404350, 20407732) base=rsp facade_like=False
     137630c:	4c 8d b4 24 c0 05 00 	lea    r14,[rsp+0x5c0]

### 0x13764f8 FDE=(20404350, 20407732) base=rsp facade_like=False
     13764f8:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]

### 0x13771eb FDE=(20410404, 20411219) base=rsp facade_like=False
     13771eb:	48 89 84 24 c0 05 00 	mov    QWORD PTR [rsp+0x5c0],rax

### 0x144b149 FDE=(21277588, 21280229) base=rsp facade_like=True
     144b149:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     144b118:	41 88 45 d8          	mov    BYTE PTR [r13-0x28],al
     144b11c:	41 88 45 e0          	mov    BYTE PTR [r13-0x20],al
     144b120:	41 88 45 f8          	mov    BYTE PTR [r13-0x8],al
     144b124:	41 88 45 00          	mov    BYTE PTR [r13+0x0],al
     144b128:	41 88 45 18          	mov    BYTE PTR [r13+0x18],al
     144b12c:	4c 8d a4 24 a0 05 00 	lea    r12,[rsp+0x5a0]
     144b133:	00 
     144b134:	48 8b b3 a8 03 00 00 	mov    rsi,QWORD PTR [rbx+0x3a8]
     144b13b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     144b13e:	4c 89 e7             	mov    rdi,r12
     144b141:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
     144b146:	ff 50 28             	call   QWORD PTR [rax+0x28]
     144b149:	48 8d bc 24 c0 05 00 	lea    rdi,[rsp+0x5c0]
     144b150:	00 
     144b151:	be 30 03 00 00       	mov    esi,0x330
     144b156:	48 03 73 40          	add    rsi,QWORD PTR [rbx+0x40]
     144b15a:	e8 07 16 68 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
     144b15f:	8a 83 20 02 00 00    	mov    al,BYTE PTR [rbx+0x220]
     144b165:	88 84 24 f0 05 00 00 	mov    BYTE PTR [rsp+0x5f0],al
     144b16c:	0f 10 83 10 02 00 00 	movups xmm0,XMMWORD PTR [rbx+0x210]
     144b173:	0f 29 84 24 e0 05 00 	movaps XMMWORD PTR [rsp+0x5e0],xmm0
     144b17a:	00 
     144b17b:	48 8b b3 90 00 00 00 	mov    rsi,QWORD PTR [rbx+0x90]
     144b182:	8b bb 88 00 00 00    	mov    edi,DWORD PTR [rbx+0x88]
     144b188:	e8 93 06 63 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     144b18d:	84 c0                	test   al,al
     144b18f:	75 23                	jne    144b1b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x290738>
     144b191:	4c 8d b3 88 00 00 00 	lea    r14,[rbx+0x88]
     144b198:	4c 89 f7             	mov    rdi,r14
     144b19b:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]

### 0x146313f FDE=(21376614, 21378154) base=rsp facade_like=True
     146313f:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
     1463110:	48 8d bc 24 f8 05 00 	lea    rdi,[rsp+0x5f8]
     1463117:	00 
     1463118:	48 8d 94 24 50 01 00 	lea    rdx,[rsp+0x150]
     146311f:	00 
     1463120:	e8 33 0f 6d ff       	call   b34058 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80ff8>
     1463125:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     146312a:	48 8d b4 24 f8 05 00 	lea    rsi,[rsp+0x5f8]
     1463131:	00 
     1463132:	6a 01                	push   0x1
     1463134:	5a                   	pop    rdx
     1463135:	e8 4c 63 6e ff       	call   b49486 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96426>
     146313a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
     146313f:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]
     1463146:	00 
     1463147:	e8 f4 ad 38 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     146314c:	48 8d 9c 24 30 06 00 	lea    rbx,[rsp+0x630]
     1463153:	00 
     1463154:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
     1463159:	48 89 df             	mov    rdi,rbx
     146315c:	e8 d3 3c 00 00       	call   1466e34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ac3b8>
     1463161:	48 8d b4 24 28 06 00 	lea    rsi,[rsp+0x628]
     1463168:	00 
     1463169:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
     146316d:	e8 8a 3a 00 00       	call   1466bfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ac180>
     1463172:	48 89 df             	mov    rdi,rbx
     1463175:	e8 2a a2 ff ff       	call   145d3a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a2928>
     146317a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     146317f:	e8 2c a4 ff ff       	call   145d5b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a2b34>
     1463184:	48 8d bc 24 f8 05 00 	lea    rdi,[rsp+0x5f8]
     146318b:	00 

### 0x14631f0 FDE=(21376614, 21378154) base=rsp facade_like=False
     14631f0:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x148432a FDE=(21512659, 21516185) base=rsp facade_like=False
     148432a:	88 8c 24 c0 05 00 00 	mov    BYTE PTR [rsp+0x5c0],cl

### 0x1484cae FDE=(21512659, 21516185) base=rsp facade_like=False
     1484cae:	4c 8d a4 24 c0 05 00 	lea    r12,[rsp+0x5c0]

### 0x149df3e FDE=(21617322, 21628662) base=rsp facade_like=True
     149df3e:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
     149df11:	e8 7a 0c 35 00       	call   17eeb90 <memset@plt>
     149df16:	48 8b 6c 24 40       	mov    rbp,QWORD PTR [rsp+0x40]
     149df1b:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     149df1f:	48 89 ef             	mov    rdi,rbp
     149df22:	ff 50 10             	call   QWORD PTR [rax+0x10]
     149df25:	84 c0                	test   al,al
     149df27:	75 10                	jne    149df39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e34bd>
     149df29:	4c 89 ff             	mov    rdi,r15
     149df2c:	e8 b5 60 83 ff       	call   cd3fe6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x220f86>
     149df31:	84 c0                	test   al,al
     149df33:	0f 84 a6 1c 00 00    	je     149fbdf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5163>
     149df39:	4c 89 64 24 28       	mov    QWORD PTR [rsp+0x28],r12
     149df3e:	48 8b 8c 24 c0 05 00 	mov    rcx,QWORD PTR [rsp+0x5c0]
     149df45:	00 
     149df46:	8b 44 24 48          	mov    eax,DWORD PTR [rsp+0x48]
     149df4a:	83 e0 fd             	and    eax,0xfffffffd
     149df4d:	83 f8 01             	cmp    eax,0x1
     149df50:	0f 85 c5 00 00 00    	jne    149e01b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e359f>
     149df56:	66 0f 57 c0          	xorpd  xmm0,xmm0
     149df5a:	66 0f 28 4c 24 10    	movapd xmm1,XMMWORD PTR [rsp+0x10]
     149df60:	66 0f 2e c8          	ucomisd xmm1,xmm0
     149df64:	77 66                	ja     149dfcc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e3550>
     149df66:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
     149df6a:	48 89 ef             	mov    rdi,rbp
     149df6d:	ff 50 10             	call   QWORD PTR [rax+0x10]
     149df70:	41 8a 4f 40          	mov    cl,BYTE PTR [r15+0x40]
     149df74:	84 c9                	test   cl,cl
     149df76:	0f 95 c2             	setne  dl
     149df79:	08 d0                	or     al,dl
     149df7b:	75 0e                	jne    149df8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e350f>

### 0x149e0c0 FDE=(21617322, 21628662) base=rsp facade_like=True
     149e0c0:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149e095:	50                   	push   rax
     149e096:	48 8d 84 24 90 02 00 	lea    rax,[rsp+0x290]
     149e09d:	00 
     149e09e:	50                   	push   rax
     149e09f:	48 8d 84 24 e8 02 00 	lea    rax,[rsp+0x2e8]
     149e0a6:	00 
     149e0a7:	50                   	push   rax
     149e0a8:	e8 27 2a 00 00       	call   14a0ad4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e6058>
     149e0ad:	48 83 c4 60          	add    rsp,0x60
     149e0b1:	4c 8b 74 24 30       	mov    r14,QWORD PTR [rsp+0x30]
     149e0b6:	4c 8b 64 24 28       	mov    r12,QWORD PTR [rsp+0x28]
     149e0bb:	e9 c0 11 00 00       	jmp    149f280 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4804>
     149e0c0:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149e0c7:	00 
     149e0c8:	44 0f b6 78 0c       	movzx  r15d,BYTE PTR [rax+0xc]
     149e0cd:	44 0f b6 50 0d       	movzx  r10d,BYTE PTR [rax+0xd]
     149e0d2:	0f b6 40 0e          	movzx  eax,BYTE PTR [rax+0xe]
     149e0d6:	48 8d ac 24 30 01 00 	lea    rbp,[rsp+0x130]
     149e0dd:	00 
     149e0de:	4c 8d 9c 24 b0 01 00 	lea    r11,[rsp+0x1b0]
     149e0e5:	00 
     149e0e6:	4c 8d a4 24 d0 01 00 	lea    r12,[rsp+0x1d0]
     149e0ed:	00 
     149e0ee:	4c 8d b4 24 00 02 00 	lea    r14,[rsp+0x200]
     149e0f5:	00 
     149e0f6:	48 8d bc 24 c0 03 00 	lea    rdi,[rsp+0x3c0]
     149e0fd:	00 
     149e0fe:	48 8d b4 24 70 03 00 	lea    rsi,[rsp+0x370]
     149e105:	00 
     149e106:	48 8d 94 24 40 03 00 	lea    rdx,[rsp+0x340]

### 0x149ea02 FDE=(21617322, 21628662) base=rsp facade_like=True
     149ea02:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149e9cf:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     149e9d3:	48 c7 46 08 01 00 00 	mov    QWORD PTR [rsi+0x8],0x1
     149e9da:	00 
     149e9db:	48 c7 46 10 00 00 00 	mov    QWORD PTR [rsi+0x10],0x3f000000
     149e9e2:	3f 
     149e9e3:	e8 c4 ad fe ff       	call   14897ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ced30>
     149e9e8:	48 8d bc 24 38 05 00 	lea    rdi,[rsp+0x538]
     149e9ef:	00 
     149e9f0:	e8 07 be 82 ff       	call   cca7fc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21779c>
     149e9f5:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149e9fc:	00 
     149e9fd:	e8 26 1d 00 00       	call   14a0728 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5cac>
     149ea02:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149ea09:	00 
     149ea0a:	0f b6 68 0d          	movzx  ebp,BYTE PTR [rax+0xd]
     149ea0e:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149ea15:	00 
     149ea16:	4c 89 fe             	mov    rsi,r15
     149ea19:	e8 76 1e 00 00       	call   14a0894 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5e18>
     149ea1e:	80 bc 24 70 04 00 00 	cmp    BYTE PTR [rsp+0x470],0x0
     149ea25:	00 
     149ea26:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     149ea2b:	0f 84 e1 00 00 00    	je     149eb12 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4096>
     149ea31:	80 bc 24 30 04 00 00 	cmp    BYTE PTR [rsp+0x430],0x0
     149ea38:	00 
     149ea39:	74 72                	je     149eaad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e4031>
     149ea3b:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     149ea42:	00 
     149ea43:	48 8d b4 24 00 04 00 	lea    rsi,[rsp+0x400]
     149ea4a:	00 

### 0x149ed54 FDE=(21617322, 21628662) base=rsp facade_like=True
     149ed54:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149ed21:	48 8d b4 24 38 05 00 	lea    rsi,[rsp+0x538]
     149ed28:	00 
     149ed29:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     149ed2d:	48 c7 46 08 01 00 00 	mov    QWORD PTR [rsi+0x8],0x1
     149ed34:	00 
     149ed35:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     149ed3a:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
     149ed41:	00 
     149ed42:	e8 65 aa fe ff       	call   14897ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ced30>
     149ed47:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149ed4e:	00 
     149ed4f:	e8 54 1c 00 00       	call   14a09a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5f2c>
     149ed54:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149ed5b:	00 
     149ed5c:	0f b6 68 0c          	movzx  ebp,BYTE PTR [rax+0xc]
     149ed60:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149ed67:	00 
     149ed68:	4c 89 fe             	mov    rsi,r15
     149ed6b:	e8 e4 1c 00 00       	call   14a0a54 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5fd8>
     149ed70:	80 bc 24 d0 04 00 00 	cmp    BYTE PTR [rsp+0x4d0],0x0
     149ed77:	00 
     149ed78:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     149ed7d:	0f 84 e0 01 00 00    	je     149ef63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e44e7>
     149ed83:	80 bc 24 60 04 00 00 	cmp    BYTE PTR [rsp+0x460],0x0
     149ed8a:	00 
     149ed8b:	0f 84 17 01 00 00    	je     149eea8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e442c>
     149ed91:	48 8b bc 24 00 04 00 	mov    rdi,QWORD PTR [rsp+0x400]
     149ed98:	00 
     149ed99:	48 8b b4 24 08 04 00 	mov    rsi,QWORD PTR [rsp+0x408]
     149eda0:	00 

### 0x149ef70 FDE=(21617322, 21628662) base=rsp facade_like=True
     149ef70:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149ef3f:	48 c7 46 08 01 00 00 	mov    QWORD PTR [rsi+0x8],0x1
     149ef46:	00 
     149ef47:	48 c7 46 10 00 00 00 	mov    QWORD PTR [rsi+0x10],0x3f000000
     149ef4e:	3f 
     149ef4f:	e8 58 a8 fe ff       	call   14897ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ced30>
     149ef54:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
     149ef5b:	00 
     149ef5c:	89 ee                	mov    esi,ebp
     149ef5e:	e8 b4 19 00 00       	call   14a0917 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e5e9b>
     149ef63:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149ef6a:	00 
     149ef6b:	e8 16 1b 00 00       	call   14a0a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e600a>
     149ef70:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]
     149ef77:	00 
     149ef78:	0f b6 68 0e          	movzx  ebp,BYTE PTR [rax+0xe]
     149ef7c:	48 8d bc 24 00 04 00 	lea    rdi,[rsp+0x400]
     149ef83:	00 
     149ef84:	4c 89 fe             	mov    rsi,r15
     149ef87:	e8 08 1b 00 00       	call   14a0a94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e6018>
     149ef8c:	80 bc 24 30 05 00 00 	cmp    BYTE PTR [rsp+0x530],0x0
     149ef93:	00 
     149ef94:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     149ef99:	0f 84 d4 02 00 00    	je     149f273 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e47f7>
     149ef9f:	80 bc 24 90 04 00 00 	cmp    BYTE PTR [rsp+0x490],0x0
     149efa6:	00 
     149efa7:	0f 84 b9 01 00 00    	je     149f166 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e46ea>
     149efad:	48 8b bc 24 00 04 00 	mov    rdi,QWORD PTR [rsp+0x400]
     149efb4:	00 
     149efb5:	48 8b b4 24 08 04 00 	mov    rsi,QWORD PTR [rsp+0x408]
     149efbc:	00 

### 0x149f6bf FDE=(21617322, 21628662) base=rsp facade_like=False
     149f6bf:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]

### 0x149f8c9 FDE=(21617322, 21628662) base=rsp facade_like=False
     149f8c9:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]

### 0x149fa0c FDE=(21617322, 21628662) base=rsp facade_like=False
     149fa0c:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]

### 0x14a7845 FDE=(21657426, 21658147) base=rax facade_like=False
     14a7845:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0x14a7d33 FDE=(21658734, 21659242) base=rax facade_like=False
     14a7d33:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0x151fe88 FDE=(22147286, 22157774) base=rsi facade_like=False
     151fe88:	0f 29 86 c0 05 00 00 	movaps XMMWORD PTR [rsi+0x5c0],xmm0

### 0x152075d FDE=(22147286, 22157774) base=rsp facade_like=False
     152075d:	48 8d b4 24 c0 05 00 	lea    rsi,[rsp+0x5c0]

### 0x15290c8 FDE=(22187386, 22188581) base=r14 facade_like=False
     15290c8:	41 80 be c0 05 00 00 	cmp    BYTE PTR [r14+0x5c0],0x0

### 0x1632c13 FDE=(23274560, 23280021) base=rsp facade_like=False
     1632c13:	48 8b 84 24 c0 05 00 	mov    rax,QWORD PTR [rsp+0x5c0]

### 0x167af53 FDE=(23572256, 23572470) base=rdi facade_like=False
     167af53:	0f 11 87 c0 05 00 00 	movups XMMWORD PTR [rdi+0x5c0],xmm0

### 0x17d4220 FDE=(24986079, 24986739) base=rax facade_like=False
     17d4220:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

## Byte-buffer writes near IDs b2/b8/ba
## Proven direct service184 table reads
### 0xab3d5a FDE=(11222304, 11222444)
      ab3d4f:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ab3d5a:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xabdcab FDE=(11263075, 11263269)
      abdca0:	49 8b 07             	mov    rax,QWORD PTR [r15]
      abdcab:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xad1308 FDE=(11342349, 11343068)
      ad12fd:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ad1308:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xb1e1c0 FDE=(11657289, 11658211)
      b1e1b5:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b1e1c0:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xb3a15b FDE=(11772160, 11774812)
      b3a150:	49 8b 06             	mov    rax,QWORD PTR [r14]
      b3a15b:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xb8f047 FDE=(12120110, 12120154)
      b8f044:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b8f047:	48 8b 80 c0 05 00 00 	mov    rax,QWORD PTR [rax+0x5c0]

### 0xbc55a5 FDE=(12342684, 12342788)
      bc55a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bc55a5:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0xd43afc FDE=(13908600, 13908929)
      d43af0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      d43afc:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0x11ee6cf FDE=(18802184, 18804775)
     11ee6cc:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     11ee6cf:	48 8b b8 c0 05 00 00 	mov    rdi,QWORD PTR [rax+0x5c0]

### 0x1337bfd FDE=(20151286, 20151420)
     1337bfa:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     1337bfd:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]

### 0x135c7b3 FDE=(20301694, 20301915)
     135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]

### 0x14a7845 FDE=(21657426, 21658147)
     14a783a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7845:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0x14a7d33 FDE=(21658734, 21659242)
     14a7d28:	49 8b 07             	mov    rax,QWORD PTR [r15]
     14a7d33:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

### 0x17d4220 FDE=(24986079, 24986739)
     17d4218:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     17d4220:	ff 90 c0 05 00 00    	call   QWORD PTR [rax+0x5c0]

