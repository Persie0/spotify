# Smart Skip provider descriptor IDs

Target registry IDs from exact accessors:
- primary interval provider: 0x2f -> table+0x178
- fallback interval provider: 0x32 -> table+0x190

## Methods returning ID 0x2f
### ID method FDE 0xc8049a..0xc8049d
      c8049a:	b0 2f                	mov    al,0x2f
      c8049c:	c3                   	ret
- relocation slot 0x181bca8 -> method
  candidate descriptor AP 0x181bc98:
    +0x0: 0x9d7de0
    +0x8: 0xa50370
    +0x10: 0xc8049a
    +0x18: 0xc8049e
    +0x20: 0xc804aa
    +0x28: 0xc804b6
    +0x30: 0x0
    +0x38: 0x0
  metadata method 0xc8049e:
    string='DownloadSetupImpl'
  factory +0x28 = 0xc804b6, FDE=(13108406, 13113820)

## Methods returning ID 0x32
### ID method FDE 0xc8f428..0xc8f42b
      c8f428:	b0 32                	mov    al,0x32
      c8f42a:	c3                   	ret
- relocation slot 0x181cce0 -> method
  candidate descriptor AP 0x181ccd0:
    +0x0: 0x9d7de0
    +0x8: 0xa50370
    +0x10: 0xc8f428
    +0x18: 0xc8f42c
    +0x20: 0xa5bbf0
    +0x28: 0xc8f438
    +0x30: 0x0
    +0x38: 0x0
  metadata method 0xc8f42c:
    string='DspSetupImpl'
  factory +0x28 = 0xc8f438, FDE=(13169720, 13171289)

## Exact smart-skip accessor evidence
### 0xb632ca
      b632c4:	c3                   	ret
      b632c5:	e8 f5 6c f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b632ca:	53                   	push   rbx
      b632cb:	48 89 fb             	mov    rbx,rdi
      b632ce:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b632d2:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b632d6:	6a 2f                	push   0x2f
      b632d8:	5a                   	pop    rdx
      b632d9:	e8 00 f0 ff ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      b632de:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b632e1:	48 8b 80 78 01 00 00 	mov    rax,QWORD PTR [rax+0x178]
      b632e8:	48 85 c0             	test   rax,rax
      b632eb:	74 02                	je     b632ef <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb028f>
      b632ed:	5b                   	pop    rbx
      b632ee:	c3                   	ret
      b632ef:	e8 cb 6c f1 ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b632f4:	53                   	push   rbx
      b632f5:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
      b632f8:	48 89 37             	mov    QWORD PTR [rdi],rsi
      b632fb:	48 85 db             	test   rbx,rbx
      b632fe:	74 13                	je     b63313 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb02b3>

### 0xb9150c
      b91502:	e8 c9 e7 ed ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      b91507:	e8 a4 e5 c5 00       	call   17efab0 <__stack_chk_fail@plt>
      b9150c:	53                   	push   rbx
      b9150d:	48 89 fb             	mov    rbx,rdi
      b91510:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b91514:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
      b91518:	6a 32                	push   0x32
      b9151a:	5a                   	pop    rdx
      b9151b:	e8 be 0d fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
      b91520:	48 8b 03             	mov    rax,QWORD PTR [rbx]
      b91523:	48 8b 80 90 01 00 00 	mov    rax,QWORD PTR [rax+0x190]
      b9152a:	48 85 c0             	test   rax,rax
      b9152d:	74 02                	je     b91531 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xde4d1>
      b9152f:	5b                   	pop    rbx
      b91530:	c3                   	ret
      b91531:	e8 89 8a ee ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
      b91536:	41 56                	push   r14
      b91538:	53                   	push   rbx
      b91539:	48 83 ec 28          	sub    rsp,0x28
      b9153d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      b91544:	00 00 

