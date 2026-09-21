# Real service184 +0x20 subobject analysis

Ground truth:
- b8f02e returns registry table[0xb8]
- 0x135c7b3 loads the same table[0xb8] object
- 0x135c7d0 converts that exact service pointer to service+0x20
- 0x135c7e5 passes service+0x20 as rdx into cc060b
- real service methods: +0x28 pointer return, +0x30 pointer return, +0x38 sret

## cc060b FDE (13370891, 13371082)
      cc060b:	55                   	push   rbp
      cc060c:	41 57                	push   r15
      cc060e:	41 56                	push   r14
      cc0610:	41 55                	push   r13
      cc0612:	41 54                	push   r12
      cc0614:	53                   	push   rbx
      cc0615:	50                   	push   rax
      cc0616:	4d 89 c4             	mov    r12,r8
      cc0619:	49 89 cd             	mov    r13,rcx
      cc061c:	48 89 d5             	mov    rbp,rdx
      cc061f:	49 89 f7             	mov    r15,rsi
      cc0622:	49 89 fe             	mov    r14,rdi
      cc0625:	6a 40                	push   0x40
      cc0627:	5f                   	pop    rdi
      cc0628:	e8 d3 d8 b2 00       	call   17edf00 <_Znwm@plt>
      cc062d:	48 89 c3             	mov    rbx,rax
      cc0630:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      cc0634:	48 8d 05 ad 0b bb 00 	lea    rax,[rip+0xbb0bad]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>
      cc063b:	48 89 03             	mov    QWORD PTR [rbx],rax
      cc063e:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
      cc0643:	48 8d 43 10          	lea    rax,[rbx+0x10]
      cc0647:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      cc064b:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      cc0650:	6a 18                	push   0x18
      cc0652:	5f                   	pop    rdi
      cc0653:	e8 a8 d8 b2 00       	call   17edf00 <_Znwm@plt>
      cc0658:	48 89 28             	mov    QWORD PTR [rax],rbp
      cc065b:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      cc065f:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
      cc0663:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      cc0667:	48 8d 05 a0 1c ea ff 	lea    rax,[rip+0xffffffffffea1ca0]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
      cc066e:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      cc0672:	48 8d 05 51 00 00 00 	lea    rax,[rip+0x51]        # cc06ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d66a>
      cc0679:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      cc067d:	0f 57 c0             	xorps  xmm0,xmm0
      cc0680:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
      cc0684:	48 89 df             	mov    rdi,rbx
      cc0687:	4c 89 fe             	mov    rsi,r15
      cc068a:	e8 b5 e5 e0 ff       	call   acec44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1bbe4>
      cc068f:	49 89 1e             	mov    QWORD PTR [r14],rbx
      cc0692:	48 83 c4 08          	add    rsp,0x8
      cc0696:	5b                   	pop    rbx
      cc0697:	41 5c                	pop    r12
      cc0699:	41 5d                	pop    r13
      cc069b:	41 5e                	pop    r14
      cc069d:	41 5f                	pop    r15
      cc069f:	5d                   	pop    rbp
      cc06a0:	c3                   	ret
      cc06a1:	49 89 c6             	mov    r14,rax
      cc06a4:	48 89 df             	mov    rdi,rbx
      cc06a7:	e8 d8 33 e0 ff       	call   ac3a84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a24>
      cc06ac:	eb 0c                	jmp    cc06ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d65a>
      cc06ae:	49 89 c6             	mov    r14,rax
      cc06b1:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      cc06b5:	e8 ee 33 e0 ff       	call   ac3aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a48>
      cc06ba:	48 89 df             	mov    rdi,rbx
      cc06bd:	e8 5e d8 b2 00       	call   17edf20 <_ZdlPv@plt>
      cc06c2:	4c 89 f7             	mov    rdi,r14
      cc06c5:	e8 06 f6 da ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

## Incoming rdx (= service184+0x20) dataflow inside cc060b
### 0xcc061c: mov    rbp,rdx
      cc0612:	41 54                	push   r12
      cc0614:	53                   	push   rbx
      cc0615:	50                   	push   rax
      cc0616:	4d 89 c4             	mov    r12,r8
      cc0619:	49 89 cd             	mov    r13,rcx
      cc061c:	48 89 d5             	mov    rbp,rdx
      cc061f:	49 89 f7             	mov    r15,rsi
      cc0622:	49 89 fe             	mov    r14,rdi
      cc0625:	6a 40                	push   0x40
      cc0627:	5f                   	pop    rdi
      cc0628:	e8 d3 d8 b2 00       	call   17edf00 <_Znwm@plt>
      cc062d:	48 89 c3             	mov    rbx,rax
      cc0630:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
      cc0634:	48 8d 05 ad 0b bb 00 	lea    rax,[rip+0xbb0bad]        # 18711e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d8d0>

### 0xcc0658: mov    QWORD PTR [rax],rbp
      cc0647:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      cc064b:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
      cc0650:	6a 18                	push   0x18
      cc0652:	5f                   	pop    rdi
      cc0653:	e8 a8 d8 b2 00       	call   17edf00 <_Znwm@plt>
      cc0658:	48 89 28             	mov    QWORD PTR [rax],rbp
      cc065b:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
      cc065f:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
      cc0663:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      cc0667:	48 8d 05 a0 1c ea ff 	lea    rax,[rip+0xffffffffffea1ca0]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
      cc066e:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      cc0672:	48 8d 05 51 00 00 00 	lea    rax,[rip+0x51]        # cc06ca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d66a>
      cc0679:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      cc067d:	0f 57 c0             	xorps  xmm0,xmm0

### 0xcc069f: pop    rbp
      cc0696:	5b                   	pop    rbx
      cc0697:	41 5c                	pop    r12
      cc0699:	41 5d                	pop    r13
      cc069b:	41 5e                	pop    r14
      cc069d:	41 5f                	pop    r15
      cc069f:	5d                   	pop    rbp
      cc06a0:	c3                   	ret
      cc06a1:	49 89 c6             	mov    r14,rax
      cc06a4:	48 89 df             	mov    rdi,rbx
      cc06a7:	e8 d8 33 e0 ff       	call   ac3a84 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a24>
      cc06ac:	eb 0c                	jmp    cc06ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d65a>
      cc06ae:	49 89 c6             	mov    r14,rax
      cc06b1:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
      cc06b5:	e8 ee 33 e0 ff       	call   ac3aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x10a48>

## Subobject-relative offsets inferred from cc060b
- aliases: rbp, rdx
- offsets: 

## Service184 candidates re-ranked with +0x20 constructor/subobject evidence
- candidates: 158
### score=60 AP=0x1817068
- +0x28=0xa7a004 FDE=(10985476, 10985481)
- +0x30=0xb411a4 FDE=(11800996, 11801001)
- +0x38=0xc2e940 FDE=(12773696, 12773727)
- materializations:
  - 0xc2c5ff: lea    rcx,[rip+0xbeaa62]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>; FDE=(12764448, 12771716)
  - 0xc2e8c2: lea    rax,[rip+0xbe879f]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>; FDE=(12773566, 12773677)
- +0x20 evidence:
  - materialization 0xc2c5ff; FDE=(12764448, 12771716)
        c2c56e:	41 88 46 20          	mov    BYTE PTR [r14+0x20],al
        c2c659:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
        c2c666:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
        c2c6a0:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
        c2c92e:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
        c2cda5:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
        c2cefc:	4c 8d 73 20          	lea    r14,[rbx+0x20]
        c2cf04:	f3 0f 7f 43 20       	movdqu XMMWORD PTR [rbx+0x20],xmm0
  - materialization 0xc2e8c2; FDE=(12773566, 12773677)
        c2e90e:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
#### +0x28 body
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret

### score=40 AP=0x1808ee0
- +0x28=0xb28244 FDE=(11698756, 11698765)
- +0x30=0xb2824e FDE=(11698766, 11698788)
- +0x38=0xb28264 FDE=(11698788, 11698813)
- materializations:
  - 0xb0449e: lea    rax,[rip+0xd04a3b]        # 1808ee0 <_ZTIN4asio22service_already_existsE@@Base+0xa6c8>; FDE=(11550686, 11552953)
- +0x20 evidence:
  - materialization 0xb0449e; FDE=(11550686, 11552953)
        b03fef:	4c 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],r9
        b041e3:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
        b04433:	66 0f 7f 4c 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm1
        b04501:	49 8d 6f 20          	lea    rbp,[r15+0x20]
        b04509:	41 0f 29 47 20       	movaps XMMWORD PTR [r15+0x20],xmm0
        b04537:	0f 28 44 24 20       	movaps xmm0,XMMWORD PTR [rsp+0x20]
        b045c8:	49 89 6e 20          	mov    QWORD PTR [r14+0x20],rbp
        b045ed:	49 89 6f 20          	mov    QWORD PTR [r15+0x20],rbp
#### +0x28 body
      b28244:	48 83 c7 08          	add    rdi,0x8
      b28248:	e9 ab ff ff ff       	jmp    b281f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75198>

### score=36 AP=0x1867b28
- +0x28=0xb00302 FDE=(11535106, 11535111)
- +0x30=0x11ca6fe FDE=(18654974, 18654982)
- +0x38=0x135c758 FDE=(20301656, 20301681)
- materializations:
  - 0x135a7e1: lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>; FDE=(20293452, 20300282)
  - 0x135c710: lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>; FDE=(20301580, 20301637)
- +0x20 evidence:
  - materialization 0x135a7e1; FDE=(20293452, 20300282)
       135a78f:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
       135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
       135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
       135abf1:	48 89 50 20          	mov    QWORD PTR [rax+0x20],rdx
       135ac4e:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
       135ac94:	48 8d 48 20          	lea    rcx,[rax+0x20]
       135acbb:	4c 8b 74 24 20       	mov    r14,QWORD PTR [rsp+0x20]
       135ad2c:	f3 41 0f 7f 44 24 20 	movdqu XMMWORD PTR [r12+0x20],xmm0
#### +0x28 body
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret

### score=20 AP=0x185abd0
- +0x28=0xad6470 FDE=(11363440, 11363449)
- +0x30=0xad647a FDE=(11363450, 11363472)
- +0x38=0x11d1e46 FDE=(18685510, 18685628)
- materializations:
  - 0x11cba40: lea    rcx,[rip+0x68f189]        # 185abd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x172b8>; FDE=(18654982, 18667010)
- +0x20 evidence:
  - materialization 0x11cba40; FDE=(18654982, 18667010)
       11ca77d:	48 83 67 20 00       	and    QWORD PTR [rdi+0x20],0x0
       11ca924:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
       11ca92e:	49 8d 47 20          	lea    rax,[r15+0x20]
       11ca9e7:	48 89 7c 24 20       	mov    QWORD PTR [rsp+0x20],rdi
       11cad5f:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
       11cadef:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
       11caeab:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
       11cb13d:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
#### +0x28 body
      ad6470:	48 83 c7 10          	add    rdi,0x10
      ad6474:	e9 f1 3a fa ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>

### score=20 AP=0x181dc58
- +0x28=0xca3a7e FDE=(13253246, 13253280)
- +0x30=0xca3aa0 FDE=(13253280, 13253298)
- +0x38=0xca3ab2 FDE=(13253298, 13253565)
- materializations:
  - 0xc93d6c: lea    rcx,[rip+0xb89ee5]        # 181dc58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x13918>; FDE=(13183092, 13191889)
- +0x20 evidence:
  - materialization 0xc93d6c; FDE=(13183092, 13191889)
        c9290d:	88 44 24 20          	mov    BYTE PTR [rsp+0x20],al
        c92b73:	8a 44 24 20          	mov    al,BYTE PTR [rsp+0x20]
        c92ff2:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
        c930f9:	f3 0f 7f 45 20       	movdqu XMMWORD PTR [rbp+0x20],xmm0
        c931d7:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
        c9321b:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
        c93415:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
        c93459:	49 8d 5d 20          	lea    rbx,[r13+0x20]
#### +0x28 body
      ca3a7e:	48 89 f8             	mov    rax,rdi
      ca3a81:	48 8d 0d f8 a1 b7 00 	lea    rcx,[rip+0xb7a1f8]        # 181dc80 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x13940>
      ca3a88:	48 89 0f             	mov    QWORD PTR [rdi],rcx
      ca3a8b:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      ca3a8f:	48 83 60 18 00       	and    QWORD PTR [rax+0x18],0x0
      ca3a94:	48 85 ff             	test   rdi,rdi
      ca3a97:	74 06                	je     ca3a9f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f0a3f>
      ca3a99:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ca3a9c:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
      ca3a9f:	c3                   	ret

### score=16 AP=0x1896f90
- +0x28=0x166231c FDE=(23470876, 23470890)
- +0x30=0x1662336 FDE=(23470902, 23470916)
- +0x38=0x1662350 FDE=(23470928, 23470993)
#### +0x28 body
     166231c:	48 8b 87 90 00 00 00 	mov    rax,QWORD PTR [rdi+0x90]
     1662323:	8a 80 56 01 00 00    	mov    al,BYTE PTR [rax+0x156]
     1662329:	c3                   	ret

### score=16 AP=0x184f8e8
- +0x28=0x10e581a FDE=(17717274, 17717282)
- +0x30=0xa7a004 FDE=(10985476, 10985481)
- +0x38=0x10e5822 FDE=(17717282, 17717313)
#### +0x28 body
     10e581a:	48 8d 87 80 06 00 00 	lea    rax,[rdi+0x680]
     10e5821:	c3                   	ret

### score=16 AP=0x182b850
- +0x28=0xdf3062 FDE=(14626914, 14626922)
- +0x30=0xc44ebc FDE=(12865212, 12865220)
- +0x38=0xdf306a FDE=(14626922, 14626968)
#### +0x28 body
      df3062:	48 8d 87 e0 00 00 00 	lea    rax,[rdi+0xe0]
      df3069:	c3                   	ret

### score=16 AP=0x1822988
- +0x28=0xd1a440 FDE=(13739072, 13739108)
- +0x30=0xaf6576 FDE=(11494774, 11494779)
- +0x38=0xd1a464 FDE=(13739108, 13741320)
#### +0x28 body
      d1a440:	48 8b 87 08 04 00 00 	mov    rax,QWORD PTR [rdi+0x408]
      d1a447:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
      d1a44b:	48 85 ff             	test   rdi,rdi
      d1a44e:	74 13                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
      d1a450:	80 bf 98 00 00 00 00 	cmp    BYTE PTR [rdi+0x98],0x0
      d1a457:	74 0a                	je     d1a463 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x267403>
      d1a459:	80 7f 15 00          	cmp    BYTE PTR [rdi+0x15],0x0
      d1a45d:	0f 85 91 a5 00 00    	jne    d249f4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271994>
      d1a463:	c3                   	ret

### score=16 AP=0x18228d8
- +0x28=0xd17212 FDE=(13726226, 13726234)
- +0x30=0xd1721a FDE=(13726234, 13726305)
- +0x38=0xd17262 FDE=(13726306, 13726538)
#### +0x28 body
      d17212:	48 8d 87 18 02 00 00 	lea    rax,[rdi+0x218]
      d17219:	c3                   	ret

### score=16 AP=0x181f788
- +0x28=0xcc4eea FDE=(13389546, 13389554)
- +0x30=0xcc4eea FDE=(13389546, 13389554)
- +0x38=0xcc4ef2 FDE=(13389554, 13389787)
#### +0x28 body
      cc4eea:	48 8b 87 e0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5e0]
      cc4ef1:	c3                   	ret

### score=16 AP=0x180dce8
- +0x28=0xb89634 FDE=(12097076, 12097084)
- +0x30=0xb8963c FDE=(12097084, 12097092)
- +0x38=0xb89644 FDE=(12097092, 12097123)
#### +0x28 body
      b89634:	48 8d 87 70 02 00 00 	lea    rax,[rdi+0x270]
      b8963b:	c3                   	ret

### score=16 AP=0x1802fc8
- +0x28=0xaf6576 FDE=(11494774, 11494779)
- +0x30=0xa4b870 FDE=(10795120, 10795125)
- +0x38=0xaf657c FDE=(11494780, 11494805)
#### +0x28 body
      af6576:	48 8d 47 08          	lea    rax,[rdi+0x8]
      af657a:	c3                   	ret

### score=8 AP=0x18adb10
- +0x28=0x17c9d52 FDE=(24943954, 24943972)
- +0x30=0x17c9a04 FDE=(24943108, 24943733)
- +0x38=0x17c9d64 FDE=(24943972, 24944161)
#### +0x28 body
     17c9d52:	53                   	push   rbx
     17c9d53:	48 89 fb             	mov    rbx,rdi
     17c9d56:	e8 ef a4 3b ff       	call   b8424a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd11ea>
     17c9d5b:	48 89 df             	mov    rdi,rbx
     17c9d5e:	5b                   	pop    rbx
     17c9d5f:	e9 bc 41 02 00       	jmp    17edf20 <_ZdlPv@plt>

### score=8 AP=0x1899f18
- +0x28=0x16966d4 FDE=(23684820, 23684833)
- +0x30=0x16966e2 FDE=(23684834, 23684847)
- +0x38=0x16966f0 FDE=(23684848, 23684996)
#### +0x28 body
     16966d4:	48 8b 4f 40          	mov    rcx,QWORD PTR [rdi+0x40]
     16966d8:	48 8b 41 10          	mov    rax,QWORD PTR [rcx+0x10]
     16966dc:	48 8b 51 18          	mov    rdx,QWORD PTR [rcx+0x18]
     16966e0:	c3                   	ret

### score=8 AP=0x1892ce0
- +0x28=0x1649e7c FDE=(23371388, 23371850)
- +0x30=0x164a04a FDE=(23371850, 23371868)
- +0x38=0x1649d20 FDE=(23371040, 23371073)
#### +0x28 body
     1649e7c:	55                   	push   rbp
     1649e7d:	41 57                	push   r15
     1649e7f:	41 56                	push   r14
     1649e81:	41 55                	push   r13
     1649e83:	41 54                	push   r12
     1649e85:	53                   	push   rbx
     1649e86:	48 83 ec 28          	sub    rsp,0x28
     1649e8a:	48 89 fb             	mov    rbx,rdi
     1649e8d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1649e94:	00 00 
     1649e96:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     1649e9b:	48 8d 05 66 8e 24 00 	lea    rax,[rip+0x248e66]        # 1892d08 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb9e0>
     1649ea2:	48 89 07             	mov    QWORD PTR [rdi],rax
     1649ea5:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     1649ea9:	48 85 c0             	test   rax,rax
     1649eac:	0f 84 6d 01 00 00    	je     164a01f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4518d>
     1649eb2:	4c 8b 28             	mov    r13,QWORD PTR [rax]
     1649eb5:	4d 8d bd a8 01 00 00 	lea    r15,[r13+0x1a8]
     1649ebc:	4c 8d 63 38          	lea    r12,[rbx+0x38]
     1649ec0:	4c 89 ff             	mov    rdi,r15
     1649ec3:	4c 89 e6             	mov    rsi,r12
     1649ec6:	e8 2d 5b 78 ff       	call   dcf9f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ca7e>
     1649ecb:	48 85 c0             	test   rax,rax
     1649ece:	0f 84 4b 01 00 00    	je     164a01f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4518d>
     1649ed4:	49 89 c6             	mov    r14,rax
     1649ed7:	48 89 c5             	mov    rbp,rax
     1649eda:	48 8b 6d 00          	mov    rbp,QWORD PTR [rbp+0x0]
     1649ede:	48 85 ed             	test   rbp,rbp
     1649ee1:	74 12                	je     1649ef5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45063>
     1649ee3:	48 8d 7d 10          	lea    rdi,[rbp+0x10]
     1649ee7:	4c 89 e6             	mov    rsi,r12
     1649eea:	e8 33 0d 54 ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
     1649eef:	84 c0                	test   al,al
     1649ef1:	75 e7                	jne    1649eda <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45048>
     1649ef3:	eb 02                	jmp    1649ef7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45065>
     1649ef5:	31 ed                	xor    ebp,ebp
     1649ef7:	49 39 ee             	cmp    r14,rbp
     1649efa:	74 13                	je     1649f0f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4507d>
     1649efc:	49 39 5e 20          	cmp    QWORD PTR [r14+0x20],rbx
     1649f00:	74 0d                	je     1649f0f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4507d>
     1649f02:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     1649f05:	49 39 ee             	cmp    r14,rbp
     1649f08:	75 f2                	jne    1649efc <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4506a>
     1649f0a:	e9 10 01 00 00       	jmp    164a01f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4518d>
     1649f0f:	49 39 ee             	cmp    r14,rbp
     1649f12:	0f 84 07 01 00 00    	je     164a01f <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4518d>
     1649f18:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
     1649f1b:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
     1649f1f:	4d 8b 85 b0 01 00 00 	mov    r8,QWORD PTR [r13+0x1b0]
     1649f26:	f3 4d 0f b8 d8       	popcnt r11,r8
     1649f2b:	49 83 fb 01          	cmp    r11,0x1
     1649f2f:	77 09                	ja     1649f3a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x450a8>
     1649f31:	49 8d 40 ff          	lea    rax,[r8-0x1]
     1649f35:	48 21 c1             	and    rcx,rax
     1649f38:	eb 10                	jmp    1649f4a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x450b8>
     1649f3a:	4c 39 c1             	cmp    rcx,r8
     1649f3d:	72 0b                	jb     1649f4a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x450b8>
     1649f3f:	48 89 c8             	mov    rax,rcx
     1649f42:	31 d2                	xor    edx,edx
     1649f44:	49 f7 f0             	div    r8

### score=8 AP=0x1892650
- +0x28=0x163f366 FDE=(23327590, 23327643)
- +0x30=0xc44ebc FDE=(12865212, 12865220)
- +0x38=0x163f762 FDE=(23328610, 23328641)
#### +0x28 body
     163f366:	41 56                	push   r14
     163f368:	53                   	push   rbx
     163f369:	50                   	push   rax
     163f36a:	48 89 fb             	mov    rbx,rdi
     163f36d:	4c 8d b7 a0 00 00 00 	lea    r14,[rdi+0xa0]
     163f374:	48 8b b7 a8 00 00 00 	mov    rsi,QWORD PTR [rdi+0xa8]
     163f37b:	8b bf a0 00 00 00    	mov    edi,DWORD PTR [rdi+0xa0]
     163f381:	e8 9a c4 43 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     163f386:	48 83 c3 50          	add    rbx,0x50
     163f38a:	84 c0                	test   al,al
     163f38c:	49 0f 44 de          	cmove  rbx,r14
     163f390:	48 89 d8             	mov    rax,rbx
     163f393:	48 83 c4 08          	add    rsp,0x8
     163f397:	5b                   	pop    rbx
     163f398:	41 5e                	pop    r14
     163f39a:	c3                   	ret

### score=8 AP=0x1883338
- +0x28=0x159ddce FDE=(22666702, 22666749)
- +0x30=0x159ddfe FDE=(22666750, 22666772)
- +0x38=0x159de14 FDE=(22666772, 22666923)
#### +0x28 body
     159ddce:	53                   	push   rbx
     159ddcf:	48 8b 5f 70          	mov    rbx,QWORD PTR [rdi+0x70]
     159ddd3:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
     159ddda:	e8 0f 19 50 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     159dddf:	84 c0                	test   al,al
     159dde1:	74 16                	je     159ddf9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e337d>
     159dde3:	48 8b b3 c0 00 00 00 	mov    rsi,QWORD PTR [rbx+0xc0]
     159ddea:	8b bb b8 00 00 00    	mov    edi,DWORD PTR [rbx+0xb8]
     159ddf0:	e8 2b da 4d ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     159ddf5:	34 01                	xor    al,0x1
     159ddf7:	eb 02                	jmp    159ddfb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3e337f>
     159ddf9:	31 c0                	xor    eax,eax
     159ddfb:	5b                   	pop    rbx
     159ddfc:	c3                   	ret

### score=8 AP=0x18817b0
- +0x28=0x1576554 FDE=(22504788, 22504800)
- +0x30=0xd88b6a FDE=(14191466, 14191474)
- +0x38=0x157d284 FDE=(22532740, 22533284)
#### +0x28 body
     1576554:	48 81 c7 f8 00 00 00 	add    rdi,0xf8
     157655b:	e9 ea 2e 00 00       	jmp    157944a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3be9ce>

### score=8 AP=0x1870a38
- +0x28=0x142d538 FDE=(21157176, 21157194)
- +0x30=0xaf6576 FDE=(11494774, 11494779)
- +0x38=0x142d54a FDE=(21157194, 21159090)
- materializations:
  - 0x142c837: lea    rax,[rip+0x4441fa]        # 1870a38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2d120>; FDE=(21153765, 21153889)
#### +0x28 body
     142d538:	53                   	push   rbx
     142d539:	48 89 fb             	mov    rbx,rdi
     142d53c:	e8 b7 fe ff ff       	call   142d3f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27297c>
     142d541:	48 89 df             	mov    rdi,rbx
     142d544:	5b                   	pop    rbx
     142d545:	e9 d6 09 3c 00       	jmp    17edf20 <_ZdlPv@plt>

### score=8 AP=0x186e8b0
- +0x28=0x13ec8d6 FDE=(20891862, 20891894)
- +0x30=0x13ec5be FDE=(20891070, 20891121)
- +0x38=0x13ec5f2 FDE=(20891122, 20891448)
#### +0x28 body
     13ec8d6:	80 7f 78 00          	cmp    BYTE PTR [rdi+0x78],0x0
     13ec8da:	0f 95 c0             	setne  al
     13ec8dd:	80 bf 84 00 00 00 00 	cmp    BYTE PTR [rdi+0x84],0x0
     13ec8e4:	0f 95 c2             	setne  dl
     13ec8e7:	20 c2                	and    dl,al
     13ec8e9:	74 08                	je     13ec8f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x231e77>
     13ec8eb:	48 8b 87 88 00 00 00 	mov    rax,QWORD PTR [rdi+0x88]
     13ec8f2:	c3                   	ret
     13ec8f3:	31 c0                	xor    eax,eax
     13ec8f5:	c3                   	ret

### score=8 AP=0x185e070
- +0x28=0x124f174 FDE=(19198324, 19198342)
- +0x30=0xd1b8fe FDE=(13744382, 13744387)
- +0x38=0x124f186 FDE=(19198342, 19198491)
#### +0x28 body
     124f174:	53                   	push   rbx
     124f175:	48 89 fb             	mov    rbx,rdi
     124f178:	e8 9d ff ff ff       	call   124f11a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9469e>
     124f17d:	48 89 df             	mov    rdi,rbx
     124f180:	5b                   	pop    rbx
     124f181:	e9 9a ed 59 00       	jmp    17edf20 <_ZdlPv@plt>

### score=8 AP=0x185a348
- +0x28=0x11c1398 FDE=(18617240, 18617461)
- +0x30=0x11c161c FDE=(18617884, 18617978)
- +0x38=0x11c167a FDE=(18617978, 18618700)
#### +0x28 body
     11c1398:	55                   	push   rbp
     11c1399:	41 57                	push   r15
     11c139b:	41 56                	push   r14
     11c139d:	53                   	push   rbx
     11c139e:	50                   	push   rax
     11c139f:	80 7f 48 00          	cmp    BYTE PTR [rdi+0x48],0x0
     11c13a3:	0f 84 a3 00 00 00    	je     11c144c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69d0>
     11c13a9:	48 89 fb             	mov    rbx,rdi
     11c13ac:	c6 47 48 00          	mov    BYTE PTR [rdi+0x48],0x0
     11c13b0:	48 81 c7 d8 00 00 00 	add    rdi,0xd8
     11c13b7:	e8 6a d5 8e ff       	call   aae926 <JNI_OnUnload@@Base+0x361f3>
     11c13bc:	4c 8d 73 50          	lea    r14,[rbx+0x50]
     11c13c0:	48 8b 43 50          	mov    rax,QWORD PTR [rbx+0x50]
     11c13c4:	4c 8d 7b 58          	lea    r15,[rbx+0x58]
     11c13c8:	4c 39 f8             	cmp    rax,r15
     11c13cb:	74 1c                	je     11c13e9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x696d>
     11c13cd:	80 b8 b0 00 00 00 00 	cmp    BYTE PTR [rax+0xb0],0x0
     11c13d4:	40 0f 94 c5          	sete   bpl
     11c13d8:	75 12                	jne    11c13ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6970>
     11c13da:	48 89 c7             	mov    rdi,rax
     11c13dd:	e8 00 d4 8d ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
     11c13e2:	4c 39 f8             	cmp    rax,r15
     11c13e5:	75 e6                	jne    11c13cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6951>
     11c13e7:	eb 03                	jmp    11c13ec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6970>
     11c13e9:	40 b5 01             	mov    bpl,0x1
     11c13ec:	4c 89 f7             	mov    rdi,r14
     11c13ef:	e8 c6 00 00 00       	call   11c14ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a3e>
     11c13f4:	4c 8d 73 70          	lea    r14,[rbx+0x70]
     11c13f8:	48 8b 7b 70          	mov    rdi,QWORD PTR [rbx+0x70]
     11c13fc:	e8 9d d3 8d ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
     11c1401:	4c 89 73 68          	mov    QWORD PTR [rbx+0x68],r14
     11c1405:	0f 57 c0             	xorps  xmm0,xmm0
     11c1408:	0f 29 43 70          	movaps XMMWORD PTR [rbx+0x70],xmm0
     11c140c:	4c 8b 73 40          	mov    r14,QWORD PTR [rbx+0x40]
     11c1410:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
     11c1415:	4d 85 f6             	test   r14,r14
     11c1418:	74 09                	je     11c1423 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a7>
     11c141a:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11c141d:	4c 89 f7             	mov    rdi,r14
     11c1420:	ff 50 28             	call   QWORD PTR [rax+0x28]
     11c1423:	40 84 ed             	test   bpl,bpl
     11c1426:	75 0c                	jne    11c1434 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69b8>
     11c1428:	48 83 eb 80          	sub    rbx,0xffffffffffffff80
     11c142c:	48 89 df             	mov    rdi,rbx
     11c142f:	e8 74 76 96 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     11c1434:	4d 85 f6             	test   r14,r14
     11c1437:	74 13                	je     11c144c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69d0>
     11c1439:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11c143c:	4c 89 f7             	mov    rdi,r14
     11c143f:	48 83 c4 08          	add    rsp,0x8
     11c1443:	5b                   	pop    rbx
     11c1444:	41 5e                	pop    r14
     11c1446:	41 5f                	pop    r15
     11c1448:	5d                   	pop    rbp
     11c1449:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
     11c144c:	48 83 c4 08          	add    rsp,0x8
     11c1450:	5b                   	pop    rbx
     11c1451:	41 5e                	pop    r14
     11c1453:	41 5f                	pop    r15
     11c1455:	5d                   	pop    rbp

### score=8 AP=0x1850a90
- +0x28=0xac3ae0 FDE=(11287264, 11287269)
- +0x30=0xa7a004 FDE=(10985476, 10985481)
- +0x38=0xadd7ba FDE=(11392954, 11392979)
#### +0x28 body
      ac3ae0:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
      ac3ae4:	c3                   	ret

### score=8 AP=0x1849220
- +0x28=0xac3ae0 FDE=(11287264, 11287269)
- +0x30=0xa7a004 FDE=(10985476, 10985481)
- +0x38=0xaf657c FDE=(11494780, 11494805)
#### +0x28 body
      ac3ae0:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
      ac3ae4:	c3                   	ret

### score=8 AP=0x1826038
- +0x28=0xd1b8f0 FDE=(13744368, 13744373)
- +0x30=0xd600c8 FDE=(14024904, 14024923)
- +0x38=0xd600dc FDE=(14024924, 14025465)
#### +0x28 body
      d1b8f0:	48 8d 47 48          	lea    rax,[rdi+0x48]
      d1b8f4:	c3                   	ret

### score=8 AP=0x18234a8
- +0x28=0xd2ea58 FDE=(13822552, 13822570)
- +0x30=0xd2ea6a FDE=(13822570, 13822593)
- +0x38=0xd2ea82 FDE=(13822594, 13822998)
#### +0x28 body
      d2ea58:	53                   	push   rbx
      d2ea59:	48 89 fb             	mov    rbx,rdi
      d2ea5c:	e8 65 fe ff ff       	call   d2e8c6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x27b866>
      d2ea61:	48 89 df             	mov    rdi,rbx
      d2ea64:	5b                   	pop    rbx
      d2ea65:	e9 b6 f4 ab 00       	jmp    17edf20 <_ZdlPv@plt>

### score=8 AP=0x1820080
- +0x28=0xce65fc FDE=(13526524, 13526583)
- +0x30=0xce0ce6 FDE=(13503718, 13504211)
- +0x38=0xce6638 FDE=(13526584, 13527152)
#### +0x28 body
      ce65fc:	53                   	push   rbx
      ce65fd:	48 89 fb             	mov    rbx,rdi
      ce6600:	48 8b bf 90 0e 00 00 	mov    rdi,QWORD PTR [rdi+0xe90]
      ce6607:	48 83 a3 90 0e 00 00 	and    QWORD PTR [rbx+0xe90],0x0
      ce660e:	00 
      ce660f:	48 85 ff             	test   rdi,rdi
      ce6612:	74 06                	je     ce661a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2335ba>
      ce6614:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ce6617:	ff 50 08             	call   QWORD PTR [rax+0x8]
      ce661a:	48 8b bb 38 04 00 00 	mov    rdi,QWORD PTR [rbx+0x438]
      ce6621:	48 83 a3 38 04 00 00 	and    QWORD PTR [rbx+0x438],0x0
      ce6628:	00 
      ce6629:	48 85 ff             	test   rdi,rdi
      ce662c:	74 07                	je     ce6635 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2335d5>
      ce662e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ce6631:	5b                   	pop    rbx
      ce6632:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
      ce6635:	5b                   	pop    rbx
      ce6636:	c3                   	ret

### score=8 AP=0x181ef90
- +0x28=0xcc0394 FDE=(13370260, 13370276)
- +0x30=0xc94fd2 FDE=(13193170, 13193178)
- +0x38=0xcc03a4 FDE=(13370276, 13370307)
#### +0x28 body
      cc0394:	48 8b bf b8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb8]
      cc039b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      cc039e:	ff a0 78 01 00 00    	jmp    QWORD PTR [rax+0x178]

### score=8 AP=0x181ee50
- +0x28=0xac3ae0 FDE=(11287264, 11287269)
- +0x30=0xa7a004 FDE=(10985476, 10985481)
- +0x38=0xadd7ba FDE=(11392954, 11392979)
#### +0x28 body
      ac3ae0:	c6 47 08 00          	mov    BYTE PTR [rdi+0x8],0x0
      ac3ae4:	c3                   	ret

### score=8 AP=0x1812b38
- +0x28=0xbddb90 FDE=(12442512, 12442632)
- +0x30=0xbddc08 FDE=(12442632, 12442645)
- +0x38=0xbddc16 FDE=(12442646, 12442677)
#### +0x28 body
      bddb90:	53                   	push   rbx
      bddb91:	48 83 ec 10          	sub    rsp,0x10
      bddb95:	48 89 fb             	mov    rbx,rdi
      bddb98:	48 8b 87 28 01 00 00 	mov    rax,QWORD PTR [rdi+0x128]
      bddb9f:	48 3b 87 30 01 00 00 	cmp    rax,QWORD PTR [rdi+0x130]
      bddba6:	74 4b                	je     bddbf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12ab93>
      bddba8:	f2 0f 10 15 78 12 7b 	movsd  xmm2,QWORD PTR [rip+0xffffffffff7b1278]        # 38ee28 <_ZTSSt12bad_any_cast@@Base-0x13a0>
      bddbaf:	ff 
      bddbb0:	f2 0f 58 d0          	addsd  xmm2,xmm0
      bddbb4:	66 0f 54 15 04 ed 7a 	andpd  xmm2,XMMWORD PTR [rip+0xffffffffff7aed04]        # 38c8c0 <_ZTSSt12bad_any_cast@@Base-0x3908>
      bddbbb:	ff 
      bddbbc:	f2 0f 10 0d 54 14 7b 	movsd  xmm1,QWORD PTR [rip+0xffffffffff7b1454]        # 38f018 <_ZTSSt12bad_any_cast@@Base-0x11b0>
      bddbc3:	ff 
      bddbc4:	66 0f 2e ca          	ucomisd xmm1,xmm2
      bddbc8:	77 29                	ja     bddbf3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x12ab93>
      bddbca:	48 8d 35 ab 43 87 ff 	lea    rsi,[rip+0xffffffffff8743ab]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      bddbd1:	48 8d 0d fe 79 77 ff 	lea    rcx,[rip+0xffffffffff7779fe]        # 3555d6 <_ZTSSt12bad_any_cast@@Base-0x3abf2>
      bddbd8:	6a 03                	push   0x3
      bddbda:	5f                   	pop    rdi
      bddbdb:	ba 99 01 00 00       	mov    edx,0x199
      bddbe0:	b0 01                	mov    al,0x1
      bddbe2:	f2 0f 11 44 24 08    	movsd  QWORD PTR [rsp+0x8],xmm0
      bddbe8:	e8 e5 8c bf 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      bddbed:	f2 0f 10 44 24 08    	movsd  xmm0,QWORD PTR [rsp+0x8]
      bddbf3:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
      bddbf7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bddbfa:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
      bddc01:	48 83 c4 10          	add    rsp,0x10
      bddc05:	5b                   	pop    rbx
      bddc06:	ff e0                	jmp    rax

### score=8 AP=0x1811978
- +0x28=0xbc7936 FDE=(12351798, 12351805)
- +0x30=0xbd7a10 FDE=(12417552, 12417566)
- +0x38=0xbc793e FDE=(12351806, 12352421)
#### +0x28 body
      bc7936:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      bc793a:	b2 01                	mov    dl,0x1
      bc793c:	c3                   	ret

### score=8 AP=0x1800d38
- +0x28=0xad5c0e FDE=(11361294, 11361306)
- +0x30=0xad5c1a FDE=(11361306, 11361316)
- +0x38=0xad5c24 FDE=(11361316, 11361351)
#### +0x28 body
      ad5c0e:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      ad5c12:	48 8b 80 80 02 00 00 	mov    rax,QWORD PTR [rax+0x280]
      ad5c19:	c3                   	ret

### score=8 AP=0x17fd088
- +0x28=0xa7b124 FDE=(10989860, 10989882)
- +0x30=0xa7b13a FDE=(10989882, 10990072)
- +0x38=0xa7b1f8 FDE=(10990072, 10990508)
#### +0x28 body
      a7b124:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      a7b128:	48 8b 00             	mov    rax,QWORD PTR [rax]
      a7b12b:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      a7b12e:	48 8d 35 7b 37 92 ff 	lea    rsi,[rip+0xffffffffff92377b]        # 39e8b0 <_ZTSNSt6__ndk117bad_function_callE@@Base+0x98>
      a7b135:	e9 60 5f d4 00       	jmp    17c109a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175206>

### score=0 AP=0x18b11b0
- +0x28=0xa93214 FDE=(11088404, 11088430)
- +0x30=0xa9323a FDE=(11088442, 11088468)
- +0x38=0xa9326c FDE=(11088492, 11088705)
#### +0x28 body
      a93214:	48 8b 3d 15 e9 e1 00 	mov    rdi,QWORD PTR [rip+0xe1e915]        # 18b1b30 <_ZNSt6__ndk114error_categoryD2Ev@@Base+0xed9d50>
      a9321b:	48 8d 35 4e 66 e9 00 	lea    rsi,[rip+0xe9664e]        # 1929870 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x70c80>
      a93222:	48 8d 15 d7 0d d6 00 	lea    rdx,[rip+0xd60dd7]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
      a93229:	e9 32 ac d5 00       	jmp    17ede60 <__cxa_atexit@plt>

### score=0 AP=0x1899bf0
- +0x28=0x168ef1e FDE=(23654174, 23654238)
- +0x30=0x168ef5e FDE=(23654238, 23654276)
- +0x38=0x168ef84 FDE=(23654276, 23654463)
#### +0x28 body
     168ef1e:	53                   	push   rbx
     168ef1f:	48 89 fb             	mov    rbx,rdi
     168ef22:	83 a7 80 00 00 00 00 	and    DWORD PTR [rdi+0x80],0x0
     168ef29:	e8 a4 03 00 00       	call   168f2d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4343e>
     168ef2e:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     168ef32:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     168ef35:	ff 50 18             	call   QWORD PTR [rax+0x18]
     168ef38:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     168ef3c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     168ef3f:	ff 50 10             	call   QWORD PTR [rax+0x10]
     168ef42:	84 c0                	test   al,al
     168ef44:	74 0f                	je     168ef55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x430c1>
     168ef46:	48 8d 53 50          	lea    rdx,[rbx+0x50]
     168ef4a:	48 89 df             	mov    rdi,rbx
     168ef4d:	31 f6                	xor    esi,esi
     168ef4f:	5b                   	pop    rbx
     168ef50:	e9 97 07 00 00       	jmp    168f6ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43858>
     168ef55:	c6 83 84 00 00 00 00 	mov    BYTE PTR [rbx+0x84],0x0
     168ef5c:	5b                   	pop    rbx
     168ef5d:	c3                   	ret

### score=0 AP=0x18930f8
- +0x28=0xd31e4c FDE=(13835852, 13835872)
- +0x30=0xd31da2 FDE=(13835682, 13835709)
- +0x38=0xd31eca FDE=(13835978, 13836025)
#### +0x28 body
      d31e4c:	53                   	push   rbx
      d31e4d:	48 89 fb             	mov    rbx,rdi
      d31e50:	6a 04                	push   0x4
      d31e52:	5f                   	pop    rdi
      d31e53:	e8 a8 c0 ab 00       	call   17edf00 <_Znwm@plt>
      d31e58:	83 20 00             	and    DWORD PTR [rax],0x0
      d31e5b:	48 89 03             	mov    QWORD PTR [rbx],rax
      d31e5e:	5b                   	pop    rbx
      d31e5f:	c3                   	ret

### score=0 AP=0x1892dd8
- +0x28=0x164a2ba FDE=(23372474, 23373007)
- +0x30=0x164a4d0 FDE=(23373008, 23373026)
- +0x38=0x164a4e2 FDE=(23373026, 23373069)
#### +0x28 body
     164a2ba:	55                   	push   rbp
     164a2bb:	41 57                	push   r15
     164a2bd:	41 56                	push   r14
     164a2bf:	41 55                	push   r13
     164a2c1:	41 54                	push   r12
     164a2c3:	53                   	push   rbx
     164a2c4:	48 83 ec 28          	sub    rsp,0x28
     164a2c8:	48 89 fb             	mov    rbx,rdi
     164a2cb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     164a2d2:	00 00 
     164a2d4:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     164a2d9:	48 8d 05 20 8b 24 00 	lea    rax,[rip+0x248b20]        # 1892e00 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbad8>
     164a2e0:	48 89 07             	mov    QWORD PTR [rdi],rax
     164a2e3:	4c 8b 6f 18          	mov    r13,QWORD PTR [rdi+0x18]
     164a2e7:	4d 85 ed             	test   r13,r13
     164a2ea:	0f 84 a8 01 00 00    	je     164a498 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45606>
     164a2f0:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     164a2f4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     164a2f8:	48 8d b8 58 01 00 00 	lea    rdi,[rax+0x158]
     164a2ff:	4c 8d a3 a0 00 00 00 	lea    r12,[rbx+0xa0]
     164a306:	48 89 fd             	mov    rbp,rdi
     164a309:	4c 89 e6             	mov    rsi,r12
     164a30c:	e8 e7 56 78 ff       	call   dcf9f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9ca7e>
     164a311:	48 85 c0             	test   rax,rax
     164a314:	0f 84 59 01 00 00    	je     164a473 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x455e1>
     164a31a:	49 89 c7             	mov    r15,rax
     164a31d:	49 89 c6             	mov    r14,rax
     164a320:	4d 8b 36             	mov    r14,QWORD PTR [r14]
     164a323:	4d 85 f6             	test   r14,r14
     164a326:	74 12                	je     164a33a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454a8>
     164a328:	49 8d 7e 10          	lea    rdi,[r14+0x10]
     164a32c:	4c 89 e6             	mov    rsi,r12
     164a32f:	e8 ee 08 54 ff       	call   b8ac22 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd7bc2>
     164a334:	84 c0                	test   al,al
     164a336:	75 e8                	jne    164a320 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4548e>
     164a338:	eb 03                	jmp    164a33d <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454ab>
     164a33a:	45 31 f6             	xor    r14d,r14d
     164a33d:	4d 39 f7             	cmp    r15,r14
     164a340:	74 13                	je     164a355 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454c3>
     164a342:	49 39 5f 20          	cmp    QWORD PTR [r15+0x20],rbx
     164a346:	74 0d                	je     164a355 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454c3>
     164a348:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     164a34b:	4d 39 f7             	cmp    r15,r14
     164a34e:	75 f2                	jne    164a342 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454b0>
     164a350:	e9 1e 01 00 00       	jmp    164a473 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x455e1>
     164a355:	4d 39 f7             	cmp    r15,r14
     164a358:	0f 84 15 01 00 00    	je     164a473 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x455e1>
     164a35e:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
     164a361:	49 8b 4f 08          	mov    rcx,QWORD PTR [r15+0x8]
     164a365:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
     164a369:	4c 8b 80 60 01 00 00 	mov    r8,QWORD PTR [rax+0x160]
     164a370:	f3 4d 0f b8 d8       	popcnt r11,r8
     164a375:	49 83 fb 01          	cmp    r11,0x1
     164a379:	77 09                	ja     164a384 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x454f2>
     164a37b:	49 8d 40 ff          	lea    rax,[r8-0x1]
     164a37f:	48 21 c1             	and    rcx,rax
     164a382:	eb 10                	jmp    164a394 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45502>
     164a384:	4c 39 c1             	cmp    rcx,r8
     164a387:	72 0b                	jb     164a394 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45502>
     164a389:	48 89 c8             	mov    rax,rcx

### score=0 AP=0x188c1f0
- +0x28=0x1612bf2 FDE=(23145458, 23145467)
- +0x30=0x1612bfc FDE=(23145468, 23145490)
- +0x38=0x1612c12 FDE=(23145490, 23146161)
#### +0x28 body
     1612bf2:	48 83 c7 08          	add    rdi,0x8
     1612bf6:	e9 f3 02 00 00       	jmp    1612eee <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe05c>

### score=0 AP=0x188b4b0
- +0x28=0xaaaedc FDE=(11185884, 11185893)
- +0x30=0xaaaee6 FDE=(11185894, 11185916)
- +0x38=0x15ffcde FDE=(23067870, 23068264)
#### +0x28 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>

### score=0 AP=0x188b348
- +0x28=0xaaaedc FDE=(11185884, 11185893)
- +0x30=0xaaaee6 FDE=(11185894, 11185916)
- +0x38=0x15feff6 FDE=(23064566, 23065021)
#### +0x28 body
      aaaedc:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aaaee0:	e9 cd 35 ff ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>

### score=0 AP=0x188af90
- +0x28=0x15f8cf0 FDE=(23039216, 23042847)
- +0x30=0x15f9b20 FDE=(23042848, 23043171)
- +0x38=0x15f9c64 FDE=(23043172, 23043782)
#### +0x28 body
     15f8cf0:	55                   	push   rbp
     15f8cf1:	41 57                	push   r15
     15f8cf3:	41 56                	push   r14
     15f8cf5:	41 55                	push   r13
     15f8cf7:	41 54                	push   r12
     15f8cf9:	53                   	push   rbx
     15f8cfa:	48 81 ec 08 01 00 00 	sub    rsp,0x108
     15f8d01:	48 89 fb             	mov    rbx,rdi
     15f8d04:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15f8d0b:	00 00 
     15f8d0d:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
     15f8d14:	00 
     15f8d15:	48 8d 77 10          	lea    rsi,[rdi+0x10]
     15f8d19:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
     15f8d1e:	e8 37 31 69 ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
     15f8d23:	41 b6 01             	mov    r14b,0x1
     15f8d26:	80 bb b8 02 00 00 00 	cmp    BYTE PTR [rbx+0x2b8],0x0
     15f8d2d:	0f 85 cd 01 00 00    	jne    15f8f00 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e484>
     15f8d33:	48 8b bb b8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3b8]
     15f8d3a:	48 85 ff             	test   rdi,rdi
     15f8d3d:	74 44                	je     15f8d83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e307>
     15f8d3f:	48 8b 73 28          	mov    rsi,QWORD PTR [rbx+0x28]
     15f8d43:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15f8d46:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15f8d49:	89 c5                	mov    ebp,eax
     15f8d4b:	6a 0c                	push   0xc
     15f8d4d:	58                   	pop    rax
     15f8d4e:	83 fd 05             	cmp    ebp,0x5
     15f8d51:	0f 87 45 01 00 00    	ja     15f8e9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e420>
     15f8d57:	89 e9                	mov    ecx,ebp
     15f8d59:	48 8d 15 34 0a da fe 	lea    rdx,[rip+0xfffffffffeda0a34]        # 399794 <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x6375>
     15f8d60:	48 63 0c 8a          	movsxd rcx,DWORD PTR [rdx+rcx*4]
     15f8d64:	48 01 d1             	add    rcx,rdx
     15f8d67:	ff e1                	jmp    rcx
     15f8d69:	48 8b bb b8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3b8]
     15f8d70:	48 83 a3 b8 03 00 00 	and    QWORD PTR [rbx+0x3b8],0x0
     15f8d77:	00 
     15f8d78:	48 85 ff             	test   rdi,rdi
     15f8d7b:	74 06                	je     15f8d83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e307>
     15f8d7d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15f8d80:	ff 50 08             	call   QWORD PTR [rax+0x8]
     15f8d83:	48 8b 83 a8 03 00 00 	mov    rax,QWORD PTR [rbx+0x3a8]
     15f8d8a:	48 8b 78 70          	mov    rdi,QWORD PTR [rax+0x70]
     15f8d8e:	e8 37 aa ff ff       	call   15f37ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x438d4e>
     15f8d93:	84 c0                	test   al,al
     15f8d95:	74 3f                	je     15f8dd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e35a>
     15f8d97:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
     15f8d9e:	00 
     15f8d9f:	4c 89 f7             	mov    rdi,r14
     15f8da2:	e8 55 16 ff ff       	call   15ea3fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42f980>
     15f8da7:	41 c7 06 0b 00 00 00 	mov    DWORD PTR [r14],0xb
     15f8dae:	48 8d 05 a3 7a 35 00 	lea    rax,[rip+0x357aa3]        # 1950858 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x194a0>
     15f8db5:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
     15f8db9:	48 89 df             	mov    rdi,rbx
     15f8dbc:	4c 89 f6             	mov    rsi,r14
     15f8dbf:	e8 0c 1c 00 00       	call   15fa9d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43ff54>
     15f8dc4:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     15f8dcb:	00 
     15f8dcc:	e8 83 e0 4a ff       	call   aa6e54 <JNI_OnUnload@@Base+0x2e721>
     15f8dd1:	e9 27 01 00 00       	jmp    15f8efd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43e481>

### score=0 AP=0x188ace0
- +0x28=0x15f3f40 FDE=(23019328, 23019337)
- +0x30=0x15f3f4a FDE=(23019338, 23019360)
- +0x38=0x15f3f60 FDE=(23019360, 23019836)
#### +0x28 body
     15f3f40:	48 83 c7 10          	add    rdi,0x10
     15f3f44:	e9 e9 fe ff ff       	jmp    15f3e32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4393b6>

### score=0 AP=0x1884718
- +0x28=0x15b40ce FDE=(22757582, 22757600)
- +0x30=0x15b40e0 FDE=(22757600, 22757713)
- +0x38=0x15b4152 FDE=(22757714, 22758013)
#### +0x28 body
     15b40ce:	53                   	push   rbx
     15b40cf:	48 89 fb             	mov    rbx,rdi
     15b40d2:	e8 8d ff ff ff       	call   15b4064 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f95e8>
     15b40d7:	48 89 df             	mov    rdi,rbx
     15b40da:	5b                   	pop    rbx
     15b40db:	e9 40 9e 23 00       	jmp    17edf20 <_ZdlPv@plt>

### score=0 AP=0x1880cb8
- +0x28=0x155ed82 FDE=(22408578, 22408587)
- +0x30=0x155ed8c FDE=(22408588, 22408610)
- +0x38=0x156347c FDE=(22426748, 22427077)
#### +0x28 body
     155ed82:	48 83 c7 08          	add    rdi,0x8
     155ed86:	e9 f7 fe ff ff       	jmp    155ec82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3a4206>

### score=0 AP=0x187f558
- +0x28=0xaae9b2 FDE=(11200946, 11200955)
- +0x30=0xaae9bc FDE=(11200956, 11200978)
- +0x38=0x154f6e6 FDE=(22345446, 22346023)
- materializations:
  - 0x154dc5b: lea    rcx,[rip+0x3318f6]        # 187f558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3bc40>; FDE=(22338598, 22338743)
#### +0x28 body
      aae9b2:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      aae9b6:	e9 cb fa fe ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>

### score=0 AP=0x187f4d8
- +0x28=0x154d060 FDE=(22335584, 22335765)
- +0x30=0x154d116 FDE=(22335766, 22335784)
- +0x38=0x154d128 FDE=(22335784, 22336209)
#### +0x28 body
     154d060:	41 57                	push   r15
     154d062:	41 56                	push   r14
     154d064:	53                   	push   rbx
     154d065:	48 89 fb             	mov    rbx,rdi
     154d068:	48 8d 05 31 24 33 00 	lea    rax,[rip+0x332431]        # 187f4a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3bb88>
     154d06f:	48 89 07             	mov    QWORD PTR [rdi],rax
     154d072:	48 81 c7 30 01 00 00 	add    rdi,0x130
     154d079:	e8 ec ce 52 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     154d07e:	48 8b bb 28 01 00 00 	mov    rdi,QWORD PTR [rbx+0x128]
     154d085:	48 83 a3 28 01 00 00 	and    QWORD PTR [rbx+0x128],0x0
     154d08c:	00 
     154d08d:	48 85 ff             	test   rdi,rdi
     154d090:	74 06                	je     154d098 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39261c>
     154d092:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     154d095:	ff 50 08             	call   QWORD PTR [rax+0x8]
     154d098:	4c 8b bb 08 01 00 00 	mov    r15,QWORD PTR [rbx+0x108]
     154d09f:	4d 85 ff             	test   r15,r15
     154d0a2:	74 33                	je     154d0d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39265b>
     154d0a4:	4c 8b b3 10 01 00 00 	mov    r14,QWORD PTR [rbx+0x110]
     154d0ab:	4c 89 ff             	mov    rdi,r15
     154d0ae:	4d 39 fe             	cmp    r14,r15
     154d0b1:	74 18                	je     154d0cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39264f>
     154d0b3:	49 83 c6 b8          	add    r14,0xffffffffffffffb8
     154d0b7:	4c 89 f7             	mov    rdi,r14
     154d0ba:	e8 59 30 00 00       	call   1550118 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39569c>
     154d0bf:	4d 39 fe             	cmp    r14,r15
     154d0c2:	75 ef                	jne    154d0b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x392637>
     154d0c4:	48 8b bb 08 01 00 00 	mov    rdi,QWORD PTR [rbx+0x108]
     154d0cb:	4c 89 bb 10 01 00 00 	mov    QWORD PTR [rbx+0x110],r15
     154d0d2:	e8 49 0e 2a 00       	call   17edf20 <_ZdlPv@plt>
     154d0d7:	48 8d bb e0 00 00 00 	lea    rdi,[rbx+0xe0]
     154d0de:	e8 15 f3 ff ff       	call   154c3f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39197c>
     154d0e3:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]
     154d0ea:	e8 09 f3 ff ff       	call   154c3f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x39197c>
     154d0ef:	48 8d 7b 48          	lea    rdi,[rbx+0x48]
     154d0f3:	e8 3c d3 f5 ff       	call   14aa434 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ef9b8>
     154d0f8:	4c 8d 73 08          	lea    r14,[rbx+0x8]
     154d0fc:	48 83 c3 28          	add    rbx,0x28
     154d100:	48 89 df             	mov    rdi,rbx
     154d103:	e8 28 9c 55 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     154d108:	4c 89 f7             	mov    rdi,r14
     154d10b:	5b                   	pop    rbx
     154d10c:	41 5e                	pop    r14
     154d10e:	41 5f                	pop    r15
     154d110:	e9 1b 9c 55 ff       	jmp    aa6d30 <JNI_OnUnload@@Base+0x2e5fd>

### score=0 AP=0x187b208
- +0x28=0xbd80cc FDE=(12419276, 12419292)
- +0x30=0xbd80dc FDE=(12419292, 12419305)
- +0x38=0xaf657c FDE=(11494780, 11494805)
#### +0x28 body
      bd80cc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80d3:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
      bd80da:	ff e0                	jmp    rax

### score=0 AP=0x1879aa8
- +0x28=0x14e5000 FDE=(21909504, 21909525)
- +0x30=0x14e5016 FDE=(21909526, 21909558)
- +0x38=0x14e5036 FDE=(21909558, 21909773)
#### +0x28 body
     14e5000:	50                   	push   rax
     14e5001:	48 81 c7 e8 00 00 00 	add    rdi,0xe8
     14e5008:	e8 b5 78 5d ff       	call   abc8c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9862>
     14e500d:	48 85 c0             	test   rax,rax
     14e5010:	0f 95 c0             	setne  al
     14e5013:	59                   	pop    rcx
     14e5014:	c3                   	ret

### score=0 AP=0x18795b0
- +0x28=0x14d6c3c FDE=(21851196, 21851253)
- +0x30=0x14d6c76 FDE=(21851254, 21851272)
- +0x38=0x14d6c88 FDE=(21851272, 21851393)
#### +0x28 body
     14d6c3c:	53                   	push   rbx
     14d6c3d:	48 89 fb             	mov    rbx,rdi
     14d6c40:	48 8d 05 91 29 3a 00 	lea    rax,[rip+0x3a2991]        # 18795d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x35cc0>
     14d6c47:	48 89 07             	mov    QWORD PTR [rdi],rax
     14d6c4a:	48 81 c7 98 00 00 00 	add    rdi,0x98
     14d6c51:	e8 7e 2f 30 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     14d6c56:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     14d6c5a:	e8 07 32 30 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     14d6c5f:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     14d6c63:	e8 1e 78 5c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     14d6c68:	48 83 c3 08          	add    rbx,0x8
     14d6c6c:	48 89 df             	mov    rdi,rbx
     14d6c6f:	5b                   	pop    rbx
     14d6c70:	e9 f1 b9 60 ff       	jmp    ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>

### score=0 AP=0x18751d8
- +0x28=0x1476438 FDE=(21455928, 21455942)
- +0x30=0x1476438 FDE=(21455928, 21455942)
- +0x38=0x1476446 FDE=(21455942, 21456167)
#### +0x28 body
     1476438:	48 89 f8             	mov    rax,rdi
     147643b:	31 c9                	xor    ecx,ecx
     147643d:	88 0f                	mov    BYTE PTR [rdi],cl
     147643f:	88 8f 98 02 00 00    	mov    BYTE PTR [rdi+0x298],cl
     1476445:	c3                   	ret

### score=0 AP=0x1874da8
- +0x28=0x145c562 FDE=(21349730, 21349756)
- +0x30=0x146d75e FDE=(21419870, 21419888)
- +0x38=0x146d770 FDE=(21419888, 21420564)
#### +0x28 body
     145c562:	53                   	push   rbx
     145c563:	48 89 fb             	mov    rbx,rdi
     145c566:	48 83 c7 68          	add    rdi,0x68
     145c56a:	e8 2f 51 ff ff       	call   145169e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x296c22>
     145c56f:	48 83 c3 10          	add    rbx,0x10
     145c573:	48 89 df             	mov    rdi,rbx
     145c576:	5b                   	pop    rbx
     145c577:	e9 8e ff ff ff       	jmp    145c50a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1a8e>

### score=0 AP=0x18746e0
- +0x28=0x145f118 FDE=(21360920, 21361243)
- +0x30=0x145f25c FDE=(21361244, 21362121)
- +0x38=0x145f5ca FDE=(21362122, 21362573)
- materializations:
  - 0x145e725: lea    rcx,[rip+0x415fb4]        # 18746e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30dc8>; FDE=(21358304, 21358491)
#### +0x28 body
     145f118:	41 57                	push   r15
     145f11a:	41 56                	push   r14
     145f11c:	41 54                	push   r12
     145f11e:	53                   	push   rbx
     145f11f:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
     145f126:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     145f12d:	00 00 
     145f12f:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
     145f136:	00 
     145f137:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
     145f13a:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
     145f13f:	4c 89 e7             	mov    rdi,r12
     145f142:	e8 03 2a 00 00       	call   1461b4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a70ce>
     145f147:	4d 8b 7e 60          	mov    r15,QWORD PTR [r14+0x60]
     145f14b:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
     145f150:	4c 89 73 f8          	mov    QWORD PTR [rbx-0x8],r14
     145f154:	48 89 df             	mov    rdi,rbx
     145f157:	4c 89 e6             	mov    rsi,r12
     145f15a:	e8 eb 29 00 00       	call   1461b4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a70ce>
     145f15f:	48 8d 35 97 9e 00 00 	lea    rsi,[rip+0x9e97]        # 1468ffd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ae581>
     145f166:	48 8d 15 a3 9e 00 00 	lea    rdx,[rip+0x9ea3]        # 1469010 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ae594>
     145f16d:	48 8d 0d a6 9e 00 00 	lea    rcx,[rip+0x9ea6]        # 146901a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ae59e>
     145f174:	4c 8d 64 24 70       	lea    r12,[rsp+0x70]
     145f179:	4c 8d 44 24 38       	lea    r8,[rsp+0x38]
     145f17e:	6a 38                	push   0x38
     145f180:	41 59                	pop    r9
     145f182:	4c 89 e7             	mov    rdi,r12
     145f185:	e8 0a b6 37 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     145f18a:	49 8b 07             	mov    rax,QWORD PTR [r15]
     145f18d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     145f194:	00 
     145f195:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     145f19a:	4c 89 fe             	mov    rsi,r15
     145f19d:	4c 89 e1             	mov    rcx,r12
     145f1a0:	ff 50 60             	call   QWORD PTR [rax+0x60]
     145f1a3:	49 81 c6 00 01 00 00 	add    r14,0x100
     145f1aa:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     145f1b1:	00 
     145f1b2:	4c 89 f7             	mov    rdi,r14
     145f1b5:	e8 a0 ca 65 ff       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>
     145f1ba:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
     145f1c1:	00 
     145f1c2:	e8 bf f2 63 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     145f1c7:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     145f1cc:	e8 17 b6 37 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     145f1d1:	48 89 df             	mov    rdi,rbx
     145f1d4:	e8 3f 81 7a ff       	call   c07318 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1542b8>
     145f1d9:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     145f1de:	e8 35 81 7a ff       	call   c07318 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1542b8>
     145f1e3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     145f1ea:	00 00 
     145f1ec:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
     145f1f3:	00 
     145f1f4:	75 60                	jne    145f256 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a47da>
     145f1f6:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
     145f1fd:	5b                   	pop    rbx
     145f1fe:	41 5c                	pop    r12
     145f200:	41 5e                	pop    r14
     145f202:	41 5f                	pop    r15
     145f204:	c3                   	ret

### score=0 AP=0x1870480
- +0x28=0x1425caa FDE=(21126314, 21126324)
- +0x30=0x1425cb4 FDE=(21126324, 21126337)
- +0x38=0xadd7ba FDE=(11392954, 11392979)
#### +0x28 body
     1425caa:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     1425cae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1425cb1:	ff 60 78             	jmp    QWORD PTR [rax+0x78]

### score=0 AP=0x186f6c8
- +0x28=0x141f834 FDE=(21100596, 21100621)
- +0x30=0x141f84e FDE=(21100622, 21100638)
- +0x38=0x141f85e FDE=(21100638, 21100670)
#### +0x28 body
     141f834:	53                   	push   rbx
     141f835:	48 89 fb             	mov    rbx,rdi
     141f838:	48 8b b6 d0 02 00 00 	mov    rsi,QWORD PTR [rsi+0x2d0]
     141f83f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     141f842:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     141f848:	48 89 d8             	mov    rax,rbx
     141f84b:	5b                   	pop    rbx
     141f84c:	c3                   	ret

### score=0 AP=0x186f638
- +0x28=0x141cf36 FDE=(21090102, 21090127)
- +0x30=0x141cf50 FDE=(21090128, 21090144)
- +0x38=0x141cf60 FDE=(21090144, 21090176)
#### +0x28 body
     141cf36:	53                   	push   rbx
     141cf37:	48 89 fb             	mov    rbx,rdi
     141cf3a:	48 8b b6 d8 02 00 00 	mov    rsi,QWORD PTR [rsi+0x2d8]
     141cf41:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     141cf44:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     141cf4a:	48 89 d8             	mov    rax,rbx
     141cf4d:	5b                   	pop    rbx
     141cf4e:	c3                   	ret

### score=0 AP=0x186f598
- +0x28=0x141a742 FDE=(21079874, 21079892)
- +0x30=0x141a754 FDE=(21079892, 21079944)
- +0x38=0x141a788 FDE=(21079944, 21083451)
#### +0x28 body
     141a742:	53                   	push   rbx
     141a743:	48 89 fb             	mov    rbx,rdi
     141a746:	e8 db fe ff ff       	call   141a626 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25fbaa>
     141a74b:	48 89 df             	mov    rdi,rbx
     141a74e:	5b                   	pop    rbx
     141a74f:	e9 cc 37 3d 00       	jmp    17edf20 <_ZdlPv@plt>

### score=0 AP=0x186f560
- +0x28=0x14093c0 FDE=(21009344, 21009363)
- +0x30=0x14093d4 FDE=(21009364, 21009382)
- +0x38=0x14093e6 FDE=(21009382, 21009911)
#### +0x28 body
     14093c0:	48 8d 05 c1 61 46 00 	lea    rax,[rip+0x4661c1]        # 186f588 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2bc70>
     14093c7:	48 89 07             	mov    QWORD PTR [rdi],rax
     14093ca:	48 83 c7 50          	add    rdi,0x50
     14093ce:	e9 93 3c 6a ff       	jmp    aad066 <JNI_OnUnload@@Base+0x34933>

### score=0 AP=0x186eb00
- +0x28=0x13f1a68 FDE=(20912744, 20912942)
- +0x30=0x13f1b2e FDE=(20912942, 20913093)
- +0x38=0x13f1bc6 FDE=(20913094, 20913669)
#### +0x28 body
     13f1a68:	41 57                	push   r15
     13f1a6a:	41 56                	push   r14
     13f1a6c:	53                   	push   rbx
     13f1a6d:	48 83 ec 70          	sub    rsp,0x70
     13f1a71:	48 89 fb             	mov    rbx,rdi
     13f1a74:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13f1a7b:	00 00 
     13f1a7d:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     13f1a82:	48 83 c7 08          	add    rdi,0x8
     13f1a86:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
     13f1a8b:	c6 44 24 60 01       	mov    BYTE PTR [rsp+0x60],0x1
     13f1a90:	e8 5b c6 3f 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     13f1a95:	48 8b 73 48          	mov    rsi,QWORD PTR [rbx+0x48]
     13f1a99:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     13f1a9c:	48 89 e7             	mov    rdi,rsp
     13f1a9f:	ff 50 50             	call   QWORD PTR [rax+0x50]
     13f1aa2:	80 7c 24 50 00       	cmp    BYTE PTR [rsp+0x50],0x0
     13f1aa7:	74 1f                	je     13f1ac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23704c>
     13f1aa9:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     13f1aae:	48 85 c0             	test   rax,rax
     13f1ab1:	7e 15                	jle    13f1ac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23704c>
     13f1ab3:	49 bf 00 ff ff ff ff 	movabs r15,0x7fffffffffffff00
     13f1aba:	ff ff 7f 
     13f1abd:	49 21 c7             	and    r15,rax
     13f1ac0:	44 0f b6 f0          	movzx  r14d,al
     13f1ac4:	b3 01                	mov    bl,0x1
     13f1ac6:	eb 08                	jmp    13f1ad0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237054>
     13f1ac8:	31 db                	xor    ebx,ebx
     13f1aca:	45 31 ff             	xor    r15d,r15d
     13f1acd:	45 31 f6             	xor    r14d,r14d
     13f1ad0:	48 89 e7             	mov    rdi,rsp
     13f1ad3:	e8 f4 05 00 00       	call   13f20cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x237650>
     13f1ad8:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     13f1add:	e8 4e a3 6b ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     13f1ae2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13f1ae9:	00 00 
     13f1aeb:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
     13f1af0:	75 37                	jne    13f1b29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2370ad>
     13f1af2:	4d 09 fe             	or     r14,r15
     13f1af5:	4c 89 f0             	mov    rax,r14
     13f1af8:	89 da                	mov    edx,ebx
     13f1afa:	48 83 c4 70          	add    rsp,0x70
     13f1afe:	5b                   	pop    rbx
     13f1aff:	41 5e                	pop    r14
     13f1b01:	41 5f                	pop    r15
     13f1b03:	c3                   	ret
     13f1b04:	48 89 c3             	mov    rbx,rax
     13f1b07:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
     13f1b0c:	e8 1f a3 6b ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     13f1b11:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13f1b18:	00 00 
     13f1b1a:	48 3b 44 24 68       	cmp    rax,QWORD PTR [rsp+0x68]
     13f1b1f:	75 08                	jne    13f1b29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2370ad>
     13f1b21:	48 89 df             	mov    rdi,rbx
     13f1b24:	e8 a7 e1 67 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     13f1b29:	e8 82 df 3f 00       	call   17efab0 <__stack_chk_fail@plt>

### score=0 AP=0x186e088
- +0x28=0x13e71a6 FDE=(20869542, 20869577)
- +0x30=0x13e71ca FDE=(20869578, 20869596)
- +0x38=0x13e7016 FDE=(20869142, 20869192)
#### +0x28 body
     13e71a6:	53                   	push   rbx
     13e71a7:	48 89 fb             	mov    rbx,rdi
     13e71aa:	48 8d 05 cf 6e 48 00 	lea    rax,[rip+0x486ecf]        # 186e080 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a768>
     13e71b1:	48 89 07             	mov    QWORD PTR [rdi],rax
     13e71b4:	48 81 c7 80 00 00 00 	add    rdi,0x80
     13e71bb:	e8 68 45 69 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13e71c0:	48 89 df             	mov    rdi,rbx
     13e71c3:	5b                   	pop    rbx
     13e71c4:	e9 c1 f7 ff ff       	jmp    13e698a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22bf0e>

### score=0 AP=0x186e028
- +0x28=0x13e698a FDE=(20867466, 20867511)
- +0x30=0x13e6e14 FDE=(20868628, 20868646)
- +0x38=0x13e7016 FDE=(20869142, 20869192)
#### +0x28 body
     13e698a:	53                   	push   rbx
     13e698b:	48 89 fb             	mov    rbx,rdi
     13e698e:	48 8d 05 fb 75 48 00 	lea    rax,[rip+0x4875fb]        # 186df90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a678>
     13e6995:	48 89 07             	mov    QWORD PTR [rdi],rax
     13e6998:	48 83 c7 40          	add    rdi,0x40
     13e699c:	e8 87 4d 69 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13e69a1:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     13e69a5:	e8 7e 4d 69 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13e69aa:	48 83 c3 08          	add    rbx,0x8
     13e69ae:	48 89 df             	mov    rdi,rbx
     13e69b1:	5b                   	pop    rbx
     13e69b2:	e9 71 4d 69 ff       	jmp    a7b728 <JNI_OnUnload@@Base+0x2ff5>

### score=0 AP=0x186dff8
- +0x28=0x13e698a FDE=(20867466, 20867511)
- +0x30=0x13e6e14 FDE=(20868628, 20868646)
- +0x38=0x13e6f48 FDE=(20868936, 20868984)
#### +0x28 body
     13e698a:	53                   	push   rbx
     13e698b:	48 89 fb             	mov    rbx,rdi
     13e698e:	48 8d 05 fb 75 48 00 	lea    rax,[rip+0x4875fb]        # 186df90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2a678>
     13e6995:	48 89 07             	mov    QWORD PTR [rdi],rax
     13e6998:	48 83 c7 40          	add    rdi,0x40
     13e699c:	e8 87 4d 69 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13e69a1:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     13e69a5:	e8 7e 4d 69 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
     13e69aa:	48 83 c3 08          	add    rbx,0x8
     13e69ae:	48 89 df             	mov    rdi,rbx
     13e69b1:	5b                   	pop    rbx
     13e69b2:	e9 71 4d 69 ff       	jmp    a7b728 <JNI_OnUnload@@Base+0x2ff5>

### score=0 AP=0x186def8
- +0x28=0x13e5288 FDE=(20861576, 20861608)
- +0x30=0x13e66f2 FDE=(20866802, 20866820)
- +0x38=0x13e67b6 FDE=(20866998, 20867120)
#### +0x28 body
     13e5288:	53                   	push   rbx
     13e5289:	48 89 fb             	mov    rbx,rdi
     13e528c:	48 8d 05 ed 84 48 00 	lea    rax,[rip+0x4884ed]        # 186d780 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x29e68>
     13e5293:	48 89 07             	mov    QWORD PTR [rdi],rax
     13e5296:	48 83 c7 30          	add    rdi,0x30
     13e529a:	e8 09 00 00 00       	call   13e52a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a82c>
     13e529f:	48 89 df             	mov    rdi,rbx
     13e52a2:	5b                   	pop    rbx
     13e52a3:	e9 14 00 00 00       	jmp    13e52bc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x22a840>

### score=0 AP=0x186ada0
- +0x28=0x13b067a FDE=(20645498, 20645635)
- +0x30=0x13b0704 FDE=(20645636, 20645650)
- +0x38=0x13b0712 FDE=(20645650, 20645866)
#### +0x28 body
     13b067a:	55                   	push   rbp
     13b067b:	41 56                	push   r14
     13b067d:	53                   	push   rbx
     13b067e:	49 89 fe             	mov    r14,rdi
     13b0681:	48 8d 9f e0 01 00 00 	lea    rbx,[rdi+0x1e0]
     13b0688:	48 89 df             	mov    rdi,rbx
     13b068b:	e8 70 f2 ff ff       	call   13af900 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f4e84>
     13b0690:	40 b5 01             	mov    bpl,0x1
     13b0693:	41 83 be a8 01 00 00 	cmp    DWORD PTR [r14+0x1a8],0x0
     13b069a:	00 
     13b069b:	75 3e                	jne    13b06db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f5c5f>
     13b069d:	41 80 be a4 01 00 00 	cmp    BYTE PTR [r14+0x1a4],0x0
     13b06a4:	00 
     13b06a5:	74 12                	je     13b06b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f5c3d>
     13b06a7:	49 8b be c8 01 00 00 	mov    rdi,QWORD PTR [r14+0x1c8]
     13b06ae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13b06b1:	ff 50 40             	call   QWORD PTR [rax+0x40]
     13b06b4:	48 85 c0             	test   rax,rax
     13b06b7:	74 04                	je     13b06bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f5c41>
     13b06b9:	31 ed                	xor    ebp,ebp
     13b06bb:	eb 1e                	jmp    13b06db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f5c5f>
     13b06bd:	49 81 c6 18 01 00 00 	add    r14,0x118
     13b06c4:	4c 89 f7             	mov    rdi,r14
     13b06c7:	e8 22 c6 15 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>
     13b06cc:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13b06cf:	48 89 c7             	mov    rdi,rax
     13b06d2:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     13b06d5:	89 c5                	mov    ebp,eax
     13b06d7:	40 80 f5 01          	xor    bpl,0x1
     13b06db:	6a 01                	push   0x1
     13b06dd:	5e                   	pop    rsi
     13b06de:	48 89 df             	mov    rdi,rbx
     13b06e1:	e8 54 ee 7a ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13b06e6:	89 e8                	mov    eax,ebp
     13b06e8:	5b                   	pop    rbx
     13b06e9:	41 5e                	pop    r14
     13b06eb:	5d                   	pop    rbp
     13b06ec:	c3                   	ret
     13b06ed:	49 89 c6             	mov    r14,rax
     13b06f0:	6a 01                	push   0x1
     13b06f2:	5e                   	pop    rsi
     13b06f3:	48 89 df             	mov    rdi,rbx
     13b06f6:	e8 3f ee 7a ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13b06fb:	4c 89 f7             	mov    rdi,r14
     13b06fe:	e8 cd f5 6b ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### score=0 AP=0x186ac68
- +0x28=0x13aebc2 FDE=(20638658, 20638795)
- +0x30=0x13aec4c FDE=(20638796, 20638810)
- +0x38=0x13aec5a FDE=(20638810, 20638909)
#### +0x28 body
     13aebc2:	55                   	push   rbp
     13aebc3:	41 56                	push   r14
     13aebc5:	53                   	push   rbx
     13aebc6:	49 89 fe             	mov    r14,rdi
     13aebc9:	48 8d 9f 90 01 00 00 	lea    rbx,[rdi+0x190]
     13aebd0:	48 89 df             	mov    rdi,rbx
     13aebd3:	e8 80 03 00 00       	call   13aef58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f44dc>
     13aebd8:	40 b5 01             	mov    bpl,0x1
     13aebdb:	41 83 be 60 01 00 00 	cmp    DWORD PTR [r14+0x160],0x0
     13aebe2:	00 
     13aebe3:	75 3e                	jne    13aec23 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f41a7>
     13aebe5:	41 80 be 58 01 00 00 	cmp    BYTE PTR [r14+0x158],0x0
     13aebec:	00 
     13aebed:	74 12                	je     13aec01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f4185>
     13aebef:	49 8b be 78 01 00 00 	mov    rdi,QWORD PTR [r14+0x178]
     13aebf6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13aebf9:	ff 50 40             	call   QWORD PTR [rax+0x40]
     13aebfc:	48 85 c0             	test   rax,rax
     13aebff:	74 04                	je     13aec05 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f4189>
     13aec01:	31 ed                	xor    ebp,ebp
     13aec03:	eb 1e                	jmp    13aec23 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f41a7>
     13aec05:	49 81 c6 00 01 00 00 	add    r14,0x100
     13aec0c:	4c 89 f7             	mov    rdi,r14
     13aec0f:	e8 da e0 15 00       	call   150ccee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x352272>
     13aec14:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     13aec17:	48 89 c7             	mov    rdi,rax
     13aec1a:	ff 51 38             	call   QWORD PTR [rcx+0x38]
     13aec1d:	89 c5                	mov    ebp,eax
     13aec1f:	40 80 f5 01          	xor    bpl,0x1
     13aec23:	6a 01                	push   0x1
     13aec25:	5e                   	pop    rsi
     13aec26:	48 89 df             	mov    rdi,rbx
     13aec29:	e8 0c 09 7b ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13aec2e:	89 e8                	mov    eax,ebp
     13aec30:	5b                   	pop    rbx
     13aec31:	41 5e                	pop    r14
     13aec33:	5d                   	pop    rbp
     13aec34:	c3                   	ret
     13aec35:	49 89 c6             	mov    r14,rax
     13aec38:	6a 01                	push   0x1
     13aec3a:	5e                   	pop    rsi
     13aec3b:	48 89 df             	mov    rdi,rbx
     13aec3e:	e8 f7 08 7b ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13aec43:	4c 89 f7             	mov    rdi,r14
     13aec46:	e8 85 10 6c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

### score=0 AP=0x186aa18
- +0x28=0x13a9782 FDE=(20617090, 20617138)
- +0x30=0x13a97b2 FDE=(20617138, 20617186)
- +0x38=0x13a97e2 FDE=(20617186, 20617588)
#### +0x28 body
     13a9782:	41 56                	push   r14
     13a9784:	53                   	push   rbx
     13a9785:	50                   	push   rax
     13a9786:	48 89 fb             	mov    rbx,rdi
     13a9789:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     13a978d:	4c 89 f7             	mov    rdi,r14
     13a9790:	e8 6d 15 00 00       	call   13aad02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f0286>
     13a9795:	48 8b 9b f0 01 00 00 	mov    rbx,QWORD PTR [rbx+0x1f0]
     13a979c:	6a 01                	push   0x1
     13a979e:	5e                   	pop    rsi
     13a979f:	4c 89 f7             	mov    rdi,r14
     13a97a2:	e8 93 5d 7b ff       	call   b5f53a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac4da>
     13a97a7:	48 89 d8             	mov    rax,rbx
     13a97aa:	48 83 c4 08          	add    rsp,0x8
     13a97ae:	5b                   	pop    rbx
     13a97af:	41 5e                	pop    r14
     13a97b1:	c3                   	ret

### score=0 AP=0x186aa00
- +0x28=0x13a94f8 FDE=(20616440, 20616970)
- +0x30=0x13a970a FDE=(20616970, 20617057)
- +0x38=0x13a9762 FDE=(20617058, 20617089)
#### +0x28 body
     13a94f8:	41 57                	push   r15
     13a94fa:	41 56                	push   r14
     13a94fc:	41 55                	push   r13
     13a94fe:	41 54                	push   r12
     13a9500:	53                   	push   rbx
     13a9501:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     13a9508:	66 0f d6 04 24       	movq   QWORD PTR [rsp],xmm0
     13a950d:	49 89 fe             	mov    r14,rdi
     13a9510:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13a9517:	00 00 
     13a9519:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     13a951e:	48 8b bf c0 01 00 00 	mov    rdi,QWORD PTR [rdi+0x1c0]
     13a9525:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13a9528:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
     13a952e:	49 89 c5             	mov    r13,rax
     13a9531:	49 8b be c0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1c0]
     13a9538:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     13a953b:	ff 90 e0 00 00 00    	call   QWORD PTR [rax+0xe0]
     13a9541:	49 89 c4             	mov    r12,rax
     13a9544:	49 8d 5e 08          	lea    rbx,[r14+0x8]
     13a9548:	48 89 df             	mov    rdi,rbx
     13a954b:	e8 b2 17 00 00       	call   13aad02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f0286>
     13a9550:	f2 0f 10 0c 24       	movsd  xmm1,QWORD PTR [rsp]
     13a9555:	f2 41 0f 10 96 00 02 	movsd  xmm2,QWORD PTR [r14+0x200]
     13a955c:	00 00 
     13a955e:	66 0f 2e d1          	ucomisd xmm2,xmm1
     13a9562:	75 06                	jne    13a956a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eeaee>
     13a9564:	0f 8b 43 01 00 00    	jnp    13a96ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eec31>
     13a956a:	4d 89 ef             	mov    r15,r13
     13a956d:	4d 2b be e0 01 00 00 	sub    r15,QWORD PTR [r14+0x1e0]
     13a9574:	4d 89 ae e0 01 00 00 	mov    QWORD PTR [r14+0x1e0],r13
     13a957b:	4d 03 be d0 01 00 00 	add    r15,QWORD PTR [r14+0x1d0]
     13a9582:	f2 49 0f 2a c7       	cvtsi2sd xmm0,r15
     13a9587:	f2 0f 59 c2          	mulsd  xmm0,xmm2
     13a958b:	f2 0f 5e c1          	divsd  xmm0,xmm1
     13a958f:	f2 0f 11 54 24 08    	movsd  QWORD PTR [rsp+0x8],xmm2
     13a9595:	e8 76 77 44 00       	call   17f0d10 <llround@plt>
     13a959a:	49 89 c5             	mov    r13,rax
     13a959d:	49 89 86 d0 01 00 00 	mov    QWORD PTR [r14+0x1d0],rax
     13a95a4:	4c 89 e0             	mov    rax,r12
     13a95a7:	49 2b 86 e8 01 00 00 	sub    rax,QWORD PTR [r14+0x1e8]
     13a95ae:	4d 89 a6 e8 01 00 00 	mov    QWORD PTR [r14+0x1e8],r12
     13a95b5:	49 03 86 d8 01 00 00 	add    rax,QWORD PTR [r14+0x1d8]
     13a95bc:	f2 48 0f 2a c0       	cvtsi2sd xmm0,rax
     13a95c1:	f2 0f 59 44 24 08    	mulsd  xmm0,QWORD PTR [rsp+0x8]
     13a95c7:	f2 0f 5e 04 24       	divsd  xmm0,QWORD PTR [rsp]
     13a95cc:	e8 3f 77 44 00       	call   17f0d10 <llround@plt>
     13a95d1:	49 89 86 d8 01 00 00 	mov    QWORD PTR [r14+0x1d8],rax
     13a95d8:	49 8b be b0 01 00 00 	mov    rdi,QWORD PTR [r14+0x1b0]
     13a95df:	6a 01                	push   0x1
     13a95e1:	59                   	pop    rcx
     13a95e2:	4c 89 fe             	mov    rsi,r15
     13a95e5:	4c 89 ea             	mov    rdx,r13
     13a95e8:	e8 6d 75 00 00       	call   13b0b5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1f60de>
     13a95ed:	f3 0f 7e 04 24       	movq   xmm0,QWORD PTR [rsp]
     13a95f2:	66 41 0f d6 86 00 02 	movq   QWORD PTR [r14+0x200],xmm0
     13a95f9:	00 00 
     13a95fb:	41 80 be 28 01 00 00 	cmp    BYTE PTR [r14+0x128],0x0
     13a9602:	00 
     13a9603:	74 4f                	je     13a9654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1eebd8>

### score=0 AP=0x186a870
- +0x28=0xbd80cc FDE=(12419276, 12419292)
- +0x30=0xbd80dc FDE=(12419292, 12419305)
- +0x38=0x13a6e60 FDE=(20606560, 20606585)
#### +0x28 body
      bd80cc:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd80d0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd80d3:	48 8b 80 98 00 00 00 	mov    rax,QWORD PTR [rax+0x98]
      bd80da:	ff e0                	jmp    rax

### score=0 AP=0x1869b58
- +0x28=0x13901f6 FDE=(20513270, 20513424)
- +0x30=0x1390290 FDE=(20513424, 20513437)
- +0x38=0x139029e FDE=(20513438, 20514065)
#### +0x28 body
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
     139024c:	e8 51 0a 00 00       	call   1390ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6226>
     1390251:	48 89 df             	mov    rdi,rbx
     1390254:	4c 89 fe             	mov    rsi,r15
     1390257:	4c 89 f2             	mov    rdx,r14
     139025a:	e8 6f 0b 00 00       	call   1390dce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6352>
     139025f:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1390263:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390266:	48 8b 80 90 00 00 00 	mov    rax,QWORD PTR [rax+0x90]
     139026d:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1390274:	00 00 
     1390276:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
     139027b:	75 0e                	jne    139028b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d580f>
     139027d:	48 89 de             	mov    rsi,rbx
     1390280:	48 83 c4 30          	add    rsp,0x30
     1390284:	5b                   	pop    rbx
     1390285:	41 5e                	pop    r14
     1390287:	41 5f                	pop    r15
     1390289:	ff e0                	jmp    rax
     139028b:	e8 20 f8 45 00       	call   17efab0 <__stack_chk_fail@plt>

### score=0 AP=0x18699c0
- +0x28=0x13901f6 FDE=(20513270, 20513424)
- +0x30=0x1390290 FDE=(20513424, 20513437)
- +0x38=0x139029e FDE=(20513438, 20514065)
#### +0x28 body
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
     139024c:	e8 51 0a 00 00       	call   1390ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6226>
     1390251:	48 89 df             	mov    rdi,rbx
     1390254:	4c 89 fe             	mov    rsi,r15
     1390257:	4c 89 f2             	mov    rdx,r14
     139025a:	e8 6f 0b 00 00       	call   1390dce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6352>
     139025f:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1390263:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390266:	48 8b 80 90 00 00 00 	mov    rax,QWORD PTR [rax+0x90]
     139026d:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1390274:	00 00 
     1390276:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
     139027b:	75 0e                	jne    139028b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d580f>
     139027d:	48 89 de             	mov    rsi,rbx
     1390280:	48 83 c4 30          	add    rsp,0x30
     1390284:	5b                   	pop    rbx
     1390285:	41 5e                	pop    r14
     1390287:	41 5f                	pop    r15
     1390289:	ff e0                	jmp    rax
     139028b:	e8 20 f8 45 00       	call   17efab0 <__stack_chk_fail@plt>

### score=0 AP=0x1869808
- +0x28=0x13901f6 FDE=(20513270, 20513424)
- +0x30=0x1390290 FDE=(20513424, 20513437)
- +0x38=0x139029e FDE=(20513438, 20514065)
#### +0x28 body
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
     139024c:	e8 51 0a 00 00       	call   1390ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6226>
     1390251:	48 89 df             	mov    rdi,rbx
     1390254:	4c 89 fe             	mov    rsi,r15
     1390257:	4c 89 f2             	mov    rdx,r14
     139025a:	e8 6f 0b 00 00       	call   1390dce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6352>
     139025f:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1390263:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390266:	48 8b 80 90 00 00 00 	mov    rax,QWORD PTR [rax+0x90]
     139026d:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1390274:	00 00 
     1390276:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
     139027b:	75 0e                	jne    139028b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d580f>
     139027d:	48 89 de             	mov    rsi,rbx
     1390280:	48 83 c4 30          	add    rsp,0x30
     1390284:	5b                   	pop    rbx
     1390285:	41 5e                	pop    r14
     1390287:	41 5f                	pop    r15
     1390289:	ff e0                	jmp    rax
     139028b:	e8 20 f8 45 00       	call   17efab0 <__stack_chk_fail@plt>

### score=0 AP=0x1869600
- +0x28=0x13901f6 FDE=(20513270, 20513424)
- +0x30=0x1390290 FDE=(20513424, 20513437)
- +0x38=0x139029e FDE=(20513438, 20514065)
#### +0x28 body
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
     139024c:	e8 51 0a 00 00       	call   1390ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6226>
     1390251:	48 89 df             	mov    rdi,rbx
     1390254:	4c 89 fe             	mov    rsi,r15
     1390257:	4c 89 f2             	mov    rdx,r14
     139025a:	e8 6f 0b 00 00       	call   1390dce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6352>
     139025f:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1390263:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390266:	48 8b 80 90 00 00 00 	mov    rax,QWORD PTR [rax+0x90]
     139026d:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1390274:	00 00 
     1390276:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
     139027b:	75 0e                	jne    139028b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d580f>
     139027d:	48 89 de             	mov    rsi,rbx
     1390280:	48 83 c4 30          	add    rsp,0x30
     1390284:	5b                   	pop    rbx
     1390285:	41 5e                	pop    r14
     1390287:	41 5f                	pop    r15
     1390289:	ff e0                	jmp    rax
     139028b:	e8 20 f8 45 00       	call   17efab0 <__stack_chk_fail@plt>

### score=0 AP=0x1869450
- +0x28=0x13901f6 FDE=(20513270, 20513424)
- +0x30=0x1390290 FDE=(20513424, 20513437)
- +0x38=0x139029e FDE=(20513438, 20514065)
#### +0x28 body
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
     139024c:	e8 51 0a 00 00       	call   1390ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6226>
     1390251:	48 89 df             	mov    rdi,rbx
     1390254:	4c 89 fe             	mov    rsi,r15
     1390257:	4c 89 f2             	mov    rdx,r14
     139025a:	e8 6f 0b 00 00       	call   1390dce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6352>
     139025f:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1390263:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390266:	48 8b 80 90 00 00 00 	mov    rax,QWORD PTR [rax+0x90]
     139026d:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1390274:	00 00 
     1390276:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
     139027b:	75 0e                	jne    139028b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d580f>
     139027d:	48 89 de             	mov    rsi,rbx
     1390280:	48 83 c4 30          	add    rsp,0x30
     1390284:	5b                   	pop    rbx
     1390285:	41 5e                	pop    r14
     1390287:	41 5f                	pop    r15
     1390289:	ff e0                	jmp    rax
     139028b:	e8 20 f8 45 00       	call   17efab0 <__stack_chk_fail@plt>

### score=0 AP=0x1868da0
- +0x28=0x13901f6 FDE=(20513270, 20513424)
- +0x30=0x1390290 FDE=(20513424, 20513437)
- +0x38=0x139029e FDE=(20513438, 20514065)
#### +0x28 body
     13901f6:	41 57                	push   r15
     13901f8:	41 56                	push   r14
     13901fa:	53                   	push   rbx
     13901fb:	48 83 ec 30          	sub    rsp,0x30
     13901ff:	48 89 fb             	mov    rbx,rdi
     1390202:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1390209:	00 00 
     139020b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1390210:	48 8b bf 88 0a 00 00 	mov    rdi,QWORD PTR [rdi+0xa88]
     1390217:	48 39 bb 80 0a 00 00 	cmp    QWORD PTR [rbx+0xa80],rdi
     139021e:	74 12                	je     1390232 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57b6>
     1390220:	48 8d b3 80 0a 00 00 	lea    rsi,[rbx+0xa80]
     1390227:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
     139022b:	e8 5b 09 00 00       	call   1390b8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d610f>
     1390230:	eb 05                	jmp    1390237 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d57bb>
     1390232:	6a 01                	push   0x1
     1390234:	5a                   	pop    rdx
     1390235:	31 c0                	xor    eax,eax
     1390237:	49 89 e6             	mov    r14,rsp
     139023a:	49 89 06             	mov    QWORD PTR [r14],rax
     139023d:	49 89 56 08          	mov    QWORD PTR [r14+0x8],rdx
     1390241:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
     1390246:	4c 89 ff             	mov    rdi,r15
     1390249:	48 89 de             	mov    rsi,rbx
     139024c:	e8 51 0a 00 00       	call   1390ca2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6226>
     1390251:	48 89 df             	mov    rdi,rbx
     1390254:	4c 89 fe             	mov    rsi,r15
     1390257:	4c 89 f2             	mov    rdx,r14
     139025a:	e8 6f 0b 00 00       	call   1390dce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d6352>
     139025f:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
     1390263:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1390266:	48 8b 80 90 00 00 00 	mov    rax,QWORD PTR [rax+0x90]
     139026d:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     1390274:	00 00 
     1390276:	48 3b 4c 24 28       	cmp    rcx,QWORD PTR [rsp+0x28]
     139027b:	75 0e                	jne    139028b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d580f>
     139027d:	48 89 de             	mov    rsi,rbx
     1390280:	48 83 c4 30          	add    rsp,0x30
     1390284:	5b                   	pop    rbx
     1390285:	41 5e                	pop    r14
     1390287:	41 5f                	pop    r15
     1390289:	ff e0                	jmp    rax
     139028b:	e8 20 f8 45 00       	call   17efab0 <__stack_chk_fail@plt>

### score=0 AP=0x1868c20
- +0x28=0x13875ec FDE=(20477420, 20477429)
- +0x30=0x13875f6 FDE=(20477430, 20477439)
- +0x38=0x1385eb2 FDE=(20471474, 20471756)
#### +0x28 body
     13875ec:	48 83 c7 f0          	add    rdi,0xfffffffffffffff0
     13875f0:	e9 a7 fd ff ff       	jmp    138739c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cc920>

### score=0 AP=0x18682a8
- +0x28=0x1373bd4 FDE=(20397012, 20397146)
- +0x30=0x1373c5a FDE=(20397146, 20397386)
- +0x38=0x1373d4a FDE=(20397386, 20397827)
#### +0x28 body
     1373bd4:	41 57                	push   r15
     1373bd6:	41 56                	push   r14
     1373bd8:	41 55                	push   r13
     1373bda:	41 54                	push   r12
     1373bdc:	53                   	push   rbx
     1373bdd:	48 83 ec 20          	sub    rsp,0x20
     1373be1:	89 f3                	mov    ebx,esi
     1373be3:	49 89 fe             	mov    r14,rdi
     1373be6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1373bed:	00 00 
     1373bef:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     1373bf4:	4c 8d 3d 9f ed fb fe 	lea    r15,[rip+0xfffffffffefbed9f]        # 33299a <_ZTSSt12bad_any_cast@@Base-0x5d82e>
     1373bfb:	6a 17                	push   0x17
     1373bfd:	41 5c                	pop    r12
     1373bff:	4c 89 fe             	mov    rsi,r15
     1373c02:	4c 89 e2             	mov    rdx,r12
     1373c05:	e8 c2 86 00 00       	call   137c2cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1850>
     1373c0a:	49 8d b6 b8 09 00 00 	lea    rsi,[r14+0x9b8]
     1373c11:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     1373c16:	4c 89 ef             	mov    rdi,r13
     1373c19:	4c 89 fa             	mov    rdx,r15
     1373c1c:	4c 89 e1             	mov    rcx,r12
     1373c1f:	e8 6c f1 00 00       	call   1382d90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c8314>
     1373c24:	41 88 9e a8 0b 00 00 	mov    BYTE PTR [r14+0xba8],bl
     1373c2b:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
     1373c2f:	49 8b 75 08          	mov    rsi,QWORD PTR [r13+0x8]
     1373c33:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1373c3a:	00 00 
     1373c3c:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     1373c41:	75 12                	jne    1373c55 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b91d9>
     1373c43:	48 83 c4 20          	add    rsp,0x20
     1373c47:	5b                   	pop    rbx
     1373c48:	41 5c                	pop    r12
     1373c4a:	41 5d                	pop    r13
     1373c4c:	41 5e                	pop    r14
     1373c4e:	41 5f                	pop    r15
     1373c50:	e9 c3 f1 00 00       	jmp    1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     1373c55:	e8 56 be 47 00       	call   17efab0 <__stack_chk_fail@plt>

### score=0 AP=0x1867d98
- +0x28=0x13633c0 FDE=(20329408, 20329427)
- +0x30=0x13633d4 FDE=(20329428, 20329446)
- +0x38=0x13633e6 FDE=(20329446, 20329975)
#### +0x28 body
     13633c0:	48 8d 05 f9 49 50 00 	lea    rax,[rip+0x5049f9]        # 1867dc0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x244a8>
     13633c7:	48 89 07             	mov    QWORD PTR [rdi],rax
     13633ca:	48 83 c7 50          	add    rdi,0x50
     13633ce:	e9 93 9c 74 ff       	jmp    aad066 <JNI_OnUnload@@Base+0x34933>

### score=0 AP=0x1861438
- +0x28=0x129ac3c FDE=(19508284, 19508360)
- +0x30=0x129ac88 FDE=(19508360, 19508378)
- +0x38=0x129ac9a FDE=(19508378, 19508880)
#### +0x28 body
     129ac3c:	53                   	push   rbx
     129ac3d:	48 89 fb             	mov    rbx,rdi
     129ac40:	48 8d 05 19 68 5c 00 	lea    rax,[rip+0x5c6819]        # 1861460 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1db48>
     129ac47:	48 89 07             	mov    QWORD PTR [rdi],rax
     129ac4a:	48 81 c7 30 01 00 00 	add    rdi,0x130
     129ac51:	e8 96 f2 0a 00       	call   1349eec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f470>
     129ac56:	48 8d 7b 60          	lea    rdi,[rbx+0x60]
     129ac5a:	e8 65 79 42 00       	call   16c25c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76730>
     129ac5f:	48 8b 7b 48          	mov    rdi,QWORD PTR [rbx+0x48]
     129ac63:	e8 1e 38 80 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     129ac68:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
     129ac6c:	e8 f9 f2 7d ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     129ac71:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     129ac75:	48 83 63 08 00       	and    QWORD PTR [rbx+0x8],0x0
     129ac7a:	48 85 ff             	test   rdi,rdi
     129ac7d:	74 07                	je     129ac86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe020a>
     129ac7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     129ac82:	5b                   	pop    rbx
     129ac83:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
     129ac86:	5b                   	pop    rbx
     129ac87:	c3                   	ret

### score=0 AP=0x185ea78
- +0x28=0x125d2d0 FDE=(19256016, 19256025)
- +0x30=0x125d2da FDE=(19256026, 19256048)
- +0x38=0x125cab4 FDE=(19253940, 19254146)
#### +0x28 body
     125d2d0:	48 83 c7 10          	add    rdi,0x10
     125d2d4:	e9 73 11 e6 ff       	jmp    10be44c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285862>

### score=0 AP=0x185e6e8
- +0x28=0x12586ce FDE=(19236558, 19236637)
- +0x30=0x125871e FDE=(19236638, 19236656)
- +0x38=0x1258730 FDE=(19236656, 19237486)
#### +0x28 body
     12586ce:	41 56                	push   r14
     12586d0:	53                   	push   rbx
     12586d1:	50                   	push   rax
     12586d2:	48 89 fb             	mov    rbx,rdi
     12586d5:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     12586d9:	48 85 ff             	test   rdi,rdi
     12586dc:	74 1e                	je     12586fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dc80>
     12586de:	4c 8d 73 08          	lea    r14,[rbx+0x8]
     12586e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12586e5:	4c 89 f6             	mov    rsi,r14
     12586e8:	ff 50 20             	call   QWORD PTR [rax+0x20]
     12586eb:	84 c0                	test   al,al
     12586ed:	74 0d                	je     12586fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9dc80>
     12586ef:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     12586f3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12586f6:	4c 89 f6             	mov    rsi,r14
     12586f9:	ff 50 18             	call   QWORD PTR [rax+0x18]
     12586fc:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     1258700:	e8 61 17 58 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     1258705:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
     1258709:	48 83 c4 08          	add    rsp,0x8
     125870d:	5b                   	pop    rbx
     125870e:	41 5e                	pop    r14
     1258710:	e9 71 5d 84 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
     1258715:	48 89 c7             	mov    rdi,rax
     1258718:	e8 88 13 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## Exact real-service call site
     135c790:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c797:	00 00 
     135c799:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     135c79e:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
     135c7a2:	48 8b 71 10          	mov    rsi,QWORD PTR [rcx+0x10]
     135c7a6:	ba b8 00 00 00       	mov    edx,0xb8
     135c7ab:	e8 2e 5b 80 ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
     135c7b0:	49 8b 06             	mov    rax,QWORD PTR [r14]
     135c7b3:	4c 8b b0 c0 05 00 00 	mov    r14,QWORD PTR [rax+0x5c0]
     135c7ba:	4c 89 f7             	mov    rdi,r14
     135c7bd:	e8 d8 a4 a8 ff       	call   de6c9a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb3d20>
     135c7c2:	49 8b 8f 90 00 00 00 	mov    rcx,QWORD PTR [r15+0x90]
     135c7c9:	49 8b b7 38 01 00 00 	mov    rsi,QWORD PTR [r15+0x138]
     135c7d0:	49 83 c6 20          	add    r14,0x20
     135c7d4:	4c 8d 44 24 08       	lea    r8,[rsp+0x8]
     135c7d9:	49 83 20 00          	and    QWORD PTR [r8],0x0
     135c7dd:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
     135c7e2:	4c 89 f2             	mov    rdx,r14
     135c7e5:	e8 21 3e 96 ff       	call   cc060b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d5ab>
     135c7ea:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     135c7ef:	48 89 03             	mov    QWORD PTR [rbx],rax
     135c7f2:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     135c7f7:	48 83 64 24 08 00    	and    QWORD PTR [rsp+0x8],0x0
     135c7fd:	48 85 ff             	test   rdi,rdi
     135c800:	74 06                	je     135c808 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1d8c>
     135c802:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     135c805:	ff 50 08             	call   QWORD PTR [rax+0x8]
     135c808:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     135c80f:	00 00 
