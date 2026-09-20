# Orbit restriction-owner class recovery

The restriction builder uses an object larger than +0x1890. The callback containing 0x10a9668 is registered in data.rel.ro around 0x184c840.
This report finds constructors/vptr stores that reference that exact data.rel.ro neighborhood.

## Relocations in callback/vtable neighborhood

    000000000184c210  0000000000000008 R_X86_64_RELATIVE                         10a11cc
    000000000184c218  0000000000000008 R_X86_64_RELATIVE                         10a1252
    000000000184c220  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000184c228  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000184c230  0000000000000008 R_X86_64_RELATIVE                         10a1264
    000000000184c238  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000184c250  0000000000000008 R_X86_64_RELATIVE                         10a1086
    000000000184c258  0000000000000008 R_X86_64_RELATIVE                         10a1126
    000000000184c260  0000000000000008 R_X86_64_RELATIVE                         174ec6a
    000000000184c268  0000000000000008 R_X86_64_RELATIVE                         174f1dc
    000000000184c270  0000000000000008 R_X86_64_RELATIVE                         10a1138
    000000000184c278  0000000000000008 R_X86_64_RELATIVE                         174ef82
    000000000184c280  0000000000000008 R_X86_64_RELATIVE                         19be480
    000000000184c288  0000000000000008 R_X86_64_RELATIVE                         19be5c0
    000000000184c290  0000000000000008 R_X86_64_RELATIVE                         19be7f8
    000000000184c298  0000000000000008 R_X86_64_RELATIVE                         19be980
    000000000184c2a0  0000000000000008 R_X86_64_RELATIVE                         19beac0
    000000000184c2a8  0000000000000008 R_X86_64_RELATIVE                         19bc2a8
    000000000184c2b0  0000000000000008 R_X86_64_RELATIVE                         19bc6d8
    000000000184c2b8  0000000000000008 R_X86_64_RELATIVE                         19bc968
    000000000184c2c0  0000000000000008 R_X86_64_RELATIVE                         19bd1b8
    000000000184c2c8  0000000000000008 R_X86_64_RELATIVE                         19bd8a8
    000000000184c2d0  0000000000000008 R_X86_64_RELATIVE                         19bec58
    000000000184c2d8  0000000000000008 R_X86_64_RELATIVE                         19bee60
    000000000184c2e0  0000000000000008 R_X86_64_RELATIVE                         19bf0c0
    000000000184c2e8  0000000000000008 R_X86_64_RELATIVE                         19bb220
    000000000184c2f0  0000000000000008 R_X86_64_RELATIVE                         19bf290
    000000000184c2f8  0000000000000008 R_X86_64_RELATIVE                         19bf468
    000000000184c300  0000000000000008 R_X86_64_RELATIVE                         19bf640
    000000000184c308  0000000000000008 R_X86_64_RELATIVE                         19bf7e0
    000000000184c310  0000000000000008 R_X86_64_RELATIVE                         18f70b0
    000000000184c318  0000000000000008 R_X86_64_RELATIVE                         18f70f0
    000000000184c320  0000000000000008 R_X86_64_RELATIVE                         18f7138
    000000000184c328  0000000000000008 R_X86_64_RELATIVE                         18f7038
    000000000184c330  0000000000000008 R_X86_64_RELATIVE                         18f7180
    000000000184c338  0000000000000008 R_X86_64_RELATIVE                         18f6fc0
    000000000184c340  0000000000000008 R_X86_64_RELATIVE                         18f7078
    000000000184c348  0000000000000008 R_X86_64_RELATIVE                         18f7008
    000000000184c360  0000000000000008 R_X86_64_RELATIVE                         10a2082
    000000000184c368  0000000000000008 R_X86_64_RELATIVE                         10a2130
    000000000184c370  0000000000000008 R_X86_64_RELATIVE                         10a2142
    000000000184c378  0000000000000008 R_X86_64_RELATIVE                         10a21de
    000000000184c380  0000000000000008 R_X86_64_RELATIVE                         10a227e
    000000000184c388  0000000000000008 R_X86_64_RELATIVE                         10a228a
    000000000184c390  0000000000000008 R_X86_64_RELATIVE                         d16f8e
    000000000184c398  0000000000000008 R_X86_64_RELATIVE                         d16ffa
    000000000184c3a0  0000000000000008 R_X86_64_RELATIVE                         10a2296
    000000000184c3a8  0000000000000008 R_X86_64_RELATIVE                         10a229e
    000000000184c3b0  0000000000000008 R_X86_64_RELATIVE                         10a2bc4
    000000000184c3b8  0000000000000008 R_X86_64_RELATIVE                         10a2c64
    000000000184c3c0  0000000000000008 R_X86_64_RELATIVE                         10a2c70
    000000000184c3d8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c3e0  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c3e8  0000000000000008 R_X86_64_RELATIVE                         10a1838
    000000000184c3f0  0000000000000008 R_X86_64_RELATIVE                         10a1858
    000000000184c3f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c400  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c408  0000000000000008 R_X86_64_RELATIVE                         10a186c
    000000000184c420  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c428  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c430  0000000000000008 R_X86_64_RELATIVE                         10a170c
    000000000184c438  0000000000000008 R_X86_64_RELATIVE                         10a172c
    000000000184c440  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c448  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c450  0000000000000008 R_X86_64_RELATIVE                         10a1740
    000000000184c468  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c470  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c478  0000000000000008 R_X86_64_RELATIVE                         10a16c4
    000000000184c480  0000000000000008 R_X86_64_RELATIVE                         10a16e4
    000000000184c488  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c490  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c498  0000000000000008 R_X86_64_RELATIVE                         10a16f8
    000000000184c4b0  0000000000000008 R_X86_64_RELATIVE                         10a1674
    000000000184c4b8  0000000000000008 R_X86_64_RELATIVE                         10a1684
    000000000184c4c0  0000000000000008 R_X86_64_RELATIVE                         10a1696
    000000000184c4d0  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c4e8  0000000000000008 R_X86_64_RELATIVE                         10a3c3a
    000000000184c4f0  0000000000000008 R_X86_64_RELATIVE                         10a3c8c
    000000000184c508  0000000000000008 R_X86_64_RELATIVE                         10a3c9e
    000000000184c510  0000000000000008 R_X86_64_RELATIVE                         10a3cb2
    000000000184c528  0000000000000008 R_X86_64_RELATIVE                         10a44d0
    000000000184c530  0000000000000008 R_X86_64_RELATIVE                         10a44f6
    000000000184c538  0000000000000008 R_X86_64_RELATIVE                         10a4508
    000000000184c540  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c558  0000000000000008 R_X86_64_RELATIVE                         10a443c
    000000000184c560  0000000000000008 R_X86_64_RELATIVE                         a02220
    000000000184c570  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c588  0000000000000008 R_X86_64_RELATIVE                         10a4954
    000000000184c590  0000000000000008 R_X86_64_RELATIVE                         10a4968
    000000000184c598  0000000000000008 R_X86_64_RELATIVE                         10a497a
    000000000184c5a0  0000000000000008 R_X86_64_RELATIVE                         10a4a1a
    000000000184c5a8  0000000000000008 R_X86_64_RELATIVE                         b79962
    000000000184c5b0  0000000000000008 R_X86_64_RELATIVE                         b7996c
    000000000184c5b8  0000000000000008 R_X86_64_RELATIVE                         10a4a34
    000000000184c5d0  0000000000000008 R_X86_64_RELATIVE                         10a481c
    000000000184c5d8  0000000000000008 R_X86_64_RELATIVE                         10a4830
    000000000184c5e0  0000000000000008 R_X86_64_RELATIVE                         10a4842
    000000000184c5e8  0000000000000008 R_X86_64_RELATIVE                         10a48e2
    000000000184c5f0  0000000000000008 R_X86_64_RELATIVE                         b79962
    000000000184c5f8  0000000000000008 R_X86_64_RELATIVE                         b7996c
    000000000184c600  0000000000000008 R_X86_64_RELATIVE                         10a48fc
    000000000184c618  0000000000000008 R_X86_64_RELATIVE                         10a4460
    000000000184c620  0000000000000008 R_X86_64_RELATIVE                         10a4470
    000000000184c628  0000000000000008 R_X86_64_RELATIVE                         10a4482
    000000000184c638  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c640  0000000000000008 R_X86_64_RELATIVE                         335c78
    000000000184c648  0000000000000008 R_X86_64_RELATIVE                         350131
    000000000184c650  0000000000000008 R_X86_64_RELATIVE                         36024a
    000000000184c658  0000000000000008 R_X86_64_RELATIVE                         34a262
    000000000184c670  0000000000000008 R_X86_64_RELATIVE                         10a54ea
    000000000184c678  0000000000000008 R_X86_64_RELATIVE                         10a550a
    000000000184c680  0000000000000008 R_X86_64_RELATIVE                         10a551c
    000000000184c688  0000000000000008 R_X86_64_RELATIVE                         10a55b6
    000000000184c690  0000000000000008 R_X86_64_RELATIVE                         10a55ca
    000000000184c6a8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c6b0  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c6b8  0000000000000008 R_X86_64_RELATIVE                         10a576e
    000000000184c6c0  0000000000000008 R_X86_64_RELATIVE                         10a5772
    000000000184c6c8  0000000000000008 R_X86_64_RELATIVE                         10a577e
    000000000184c6d0  0000000000000008 R_X86_64_RELATIVE                         10a578a
    000000000184c6e8  0000000000000008 R_X86_64_RELATIVE                         10a5ddc
    000000000184c6f0  0000000000000008 R_X86_64_RELATIVE                         10a5e0a
    000000000184c6f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c700  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c708  0000000000000008 R_X86_64_RELATIVE                         ac3ae0
    000000000184c710  0000000000000008 R_X86_64_RELATIVE                         10a5e1c
    000000000184c718  0000000000000008 R_X86_64_RELATIVE                         10a5e2a
    000000000184c720  0000000000000008 R_X86_64_RELATIVE                         10a5ef6
    000000000184c738  0000000000000008 R_X86_64_RELATIVE                         10a8812
    000000000184c740  0000000000000008 R_X86_64_RELATIVE                         10a88e0
    000000000184c748  0000000000000008 R_X86_64_RELATIVE                         10a88f2
    000000000184c750  0000000000000008 R_X86_64_RELATIVE                         10a89b6
    000000000184c758  0000000000000008 R_X86_64_RELATIVE                         10a8aae
    000000000184c760  0000000000000008 R_X86_64_RELATIVE                         10a8da4
    000000000184c768  0000000000000008 R_X86_64_RELATIVE                         10a8dac
    000000000184c770  0000000000000008 R_X86_64_RELATIVE                         10a8db4
    000000000184c778  0000000000000008 R_X86_64_RELATIVE                         10a8eae
    000000000184c780  0000000000000008 R_X86_64_RELATIVE                         10a8ecc
    000000000184c788  0000000000000008 R_X86_64_RELATIVE                         10a8f66
    000000000184c790  0000000000000008 R_X86_64_RELATIVE                         10a8f84
    000000000184c798  0000000000000008 R_X86_64_RELATIVE                         10a913a
    000000000184c7a0  0000000000000008 R_X86_64_RELATIVE                         10a9298
    000000000184c7a8  0000000000000008 R_X86_64_RELATIVE                         10a92b6
    000000000184c7b0  0000000000000008 R_X86_64_RELATIVE                         10a92d4
    000000000184c7b8  0000000000000008 R_X86_64_RELATIVE                         10a92f2
    000000000184c7c0  0000000000000008 R_X86_64_RELATIVE                         10a9310
    000000000184c7c8  0000000000000008 R_X86_64_RELATIVE                         10a932e
    000000000184c7d0  0000000000000008 R_X86_64_RELATIVE                         10a934c
    000000000184c7d8  0000000000000008 R_X86_64_RELATIVE                         10a936a
    000000000184c7e0  0000000000000008 R_X86_64_RELATIVE                         10a9388
    000000000184c7e8  0000000000000008 R_X86_64_RELATIVE                         10a93a6
    000000000184c7f0  0000000000000008 R_X86_64_RELATIVE                         10a93c4
    000000000184c7f8  0000000000000008 R_X86_64_RELATIVE                         10a93dc
    000000000184c800  0000000000000008 R_X86_64_RELATIVE                         10a941c
    000000000184c808  0000000000000008 R_X86_64_RELATIVE                         10a9436
    000000000184c810  0000000000000008 R_X86_64_RELATIVE                         10a9566
    000000000184c818  0000000000000008 R_X86_64_RELATIVE                         10a9584
    000000000184c820  0000000000000008 R_X86_64_RELATIVE                         10a95a2
    000000000184c828  0000000000000008 R_X86_64_RELATIVE                         10a95c0
    000000000184c830  0000000000000008 R_X86_64_RELATIVE                         10a95de
    000000000184c838  0000000000000008 R_X86_64_RELATIVE                         10a95fc
    000000000184c840  0000000000000008 R_X86_64_RELATIVE                         10a9668
    000000000184c858  0000000000000008 R_X86_64_RELATIVE                         10a969c
    000000000184c860  0000000000000008 R_X86_64_RELATIVE                         10a96a6
    000000000184c868  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c870  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c878  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c880  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c888  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c890  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c898  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8a0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8a8  0000000000000008 R_X86_64_RELATIVE                         10a96b0
    000000000184c8b0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8b8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8c0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8c8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8d0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8d8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8e0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c8f8  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c900  0000000000000008 R_X86_64_RELATIVE                         a50370
    000000000184c908  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c910  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c918  0000000000000008 R_X86_64_RELATIVE                         9d7de0
    000000000184c920  0000000000000008 R_X86_64_RELATIVE                         10ab276
    000000000184c928  0000000000000008 R_X86_64_RELATIVE                         10ab276
    000000000184c930  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c938  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c940  0000000000000008 R_X86_64_RELATIVE                         a3fa60
    000000000184c948  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c950  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c958  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c960  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c968  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c970  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c978  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c980  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c988  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c990  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c998  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9a0  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9a8  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9b0  0000000000000008 R_X86_64_RELATIVE                         a3fa60
    000000000184c9b8  0000000000000008 R_X86_64_RELATIVE                         10ab27e
    000000000184c9c0  0000000000000008 R_X86_64_RELATIVE                         10ab27e
    000000000184c9c8  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9d0  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9d8  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9e0  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9e8  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9f0  0000000000000008 R_X86_64_RELATIVE                         d8d19e
    000000000184c9f8  0000000000000008 R_X86_64_RELATIVE                         bd7a10
    000000000184c4c8  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
    000000000184c630  000006bb00000001 R_X86_64_64            00000000009d81d0 _ZNKSt6__ndk119__shared_weak_count13__get_deleterERKSt9type_info + 0
    000000000184c568  000007ea00000001 R_X86_64_64            0000000000a55b50 __cxa_pure_virtual + 0

## Executable xrefs to 0x184c200..0x184ca00

Total: 44
### 0xb60c3d -> 0x184c6a8 from 0xb5f6f7..0xb6218e
      b60c15:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c1a:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c1d:	48 89 e7             	mov    rdi,rsp
      b60c20:	e8 f1 ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c25:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c2a:	48 85 ff             	test   rdi,rdi
      b60c2d:	74 06                	je     b60c35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadbd5>
      b60c2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c32:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c35:	6a 08                	push   0x8
      b60c37:	5f                   	pop    rdi
      b60c38:	e8 c3 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c3d:	48 8d 0d 64 ba ce 00 	lea    rcx,[rip+0xceba64]        # 184c6a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d90>
      b60c44:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c47:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c4c:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c4f:	48 89 e7             	mov    rdi,rsp
      b60c52:	e8 bf ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>
      b60c57:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      b60c5c:	48 85 ff             	test   rdi,rdi
      b60c5f:	74 06                	je     b60c67 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xadc07>
      b60c61:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b60c64:	ff 50 08             	call   QWORD PTR [rax+0x8]
      b60c67:	6a 08                	push   0x8
      b60c69:	5f                   	pop    rdi
      b60c6a:	e8 91 d2 c8 00       	call   17edf00 <_Znwm@plt>
      b60c6f:	48 8d 0d 8a 66 d0 00 	lea    rcx,[rip+0xd0668a]        # 1867300 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x239e8>
      b60c76:	48 89 08             	mov    QWORD PTR [rax],rcx
      b60c79:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      b60c7e:	48 89 06             	mov    QWORD PTR [rsi],rax
      b60c81:	48 89 e7             	mov    rdi,rsp
      b60c84:	e8 8d ce f7 ff       	call   addb16 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2aab6>

### 0x109935d -> 0x184c360 from 0x109917a..0x1099d71
     1099330:	48 8d 94 24 f0 00 00 	lea    rdx,[rsp+0xf0]
     1099337:	00 
     1099338:	48 89 de             	mov    rsi,rbx
     109933b:	ff 50 18             	call   QWORD PTR [rax+0x18]
     109933e:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     1099342:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
     1099349:	00 
     109934a:	4c 89 e6             	mov    rsi,r12
     109934d:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1099350:	bf e0 04 00 00       	mov    edi,0x4e0
     1099355:	e8 a6 4b 75 00       	call   17edf00 <_Znwm@plt>
     109935a:	49 89 c5             	mov    r13,rax
     109935d:	48 8d 05 fc 2f 7b 00 	lea    rax,[rip+0x7b2ffc]        # 184c360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8a48>
     1099364:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     1099368:	4d 8d 7d 08          	lea    r15,[r13+0x8]
     109936c:	48 8d b4 24 c8 00 00 	lea    rsi,[rsp+0xc8]
     1099373:	00 
     1099374:	4c 89 ff             	mov    rdi,r15
     1099377:	e8 c4 4b 75 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     109937c:	49 8d 5d 20          	lea    rbx,[r13+0x20]
     1099380:	48 8d b4 24 d0 01 00 	lea    rsi,[rsp+0x1d0]
     1099387:	00 
     1099388:	48 89 df             	mov    rdi,rbx
     109938b:	4c 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r15
     1099392:	00 
     1099393:	e8 f8 0e 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1099398:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     109939d:	49 89 45 50          	mov    QWORD PTR [r13+0x50],rax
     10993a1:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp
     10993a8:	00 
     10993a9:	49 89 6d 58          	mov    QWORD PTR [r13+0x58],rbp
     10993ad:	49 8d 7d 60          	lea    rdi,[r13+0x60]

### 0x1099416 -> 0x184c3d8 from 0x109917a..0x1099d71
     10993e2:	49 8d bd 80 00 00 00 	lea    rdi,[r13+0x80]
     10993e9:	48 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],rdi
     10993ee:	31 f6                	xor    esi,esi
     10993f0:	e8 f1 e3 54 00       	call   15e77e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cd6a>
     10993f5:	49 8d bd f8 01 00 00 	lea    rdi,[r13+0x1f8]
     10993fc:	6a 01                	push   0x1
     10993fe:	5e                   	pop    rsi
     10993ff:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1099404:	e8 dd e3 54 00       	call   15e77e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cd6a>
     1099409:	bf c0 01 00 00       	mov    edi,0x1c0
     109940e:	e8 ed 4a 75 00       	call   17edf00 <_Znwm@plt>
     1099413:	48 89 c5             	mov    rbp,rax
     1099416:	48 8d 05 bb 2f 7b 00 	lea    rax,[rip+0x7b2fbb]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     109941d:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     1099424:	00 
     1099425:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099428:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     109942c:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     1099430:	48 8d 05 e9 2f 7b 00 	lea    rax,[rip+0x7b2fe9]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     1099437:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     109943e:	00 
     109943f:	48 89 01             	mov    QWORD PTR [rcx],rax
     1099442:	4c 89 69 08          	mov    QWORD PTR [rcx+0x8],r13
     1099446:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     109944a:	4c 89 75 00          	mov    QWORD PTR [rbp+0x0],r14
     109944e:	4c 8d 75 10          	lea    r14,[rbp+0x10]
     1099452:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
     1099459:	00 
     109945a:	4c 89 f7             	mov    rdi,r14
     109945d:	e8 2e 0e 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1099462:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
     1099466:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]

### 0x1099430 -> 0x184c420 from 0x109917a..0x1099d71
     10993fe:	5e                   	pop    rsi
     10993ff:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     1099404:	e8 dd e3 54 00       	call   15e77e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cd6a>
     1099409:	bf c0 01 00 00       	mov    edi,0x1c0
     109940e:	e8 ed 4a 75 00       	call   17edf00 <_Znwm@plt>
     1099413:	48 89 c5             	mov    rbp,rax
     1099416:	48 8d 05 bb 2f 7b 00 	lea    rax,[rip+0x7b2fbb]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     109941d:	48 8d 9c 24 30 02 00 	lea    rbx,[rsp+0x230]
     1099424:	00 
     1099425:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099428:	4c 89 6b 08          	mov    QWORD PTR [rbx+0x8],r13
     109942c:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
     1099430:	48 8d 05 e9 2f 7b 00 	lea    rax,[rip+0x7b2fe9]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     1099437:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
     109943e:	00 
     109943f:	48 89 01             	mov    QWORD PTR [rcx],rax
     1099442:	4c 89 69 08          	mov    QWORD PTR [rcx+0x8],r13
     1099446:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     109944a:	4c 89 75 00          	mov    QWORD PTR [rbp+0x0],r14
     109944e:	4c 8d 75 10          	lea    r14,[rbp+0x10]
     1099452:	48 8d b4 24 a0 01 00 	lea    rsi,[rsp+0x1a0]
     1099459:	00 
     109945a:	4c 89 f7             	mov    rdi,r14
     109945d:	e8 2e 0e 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1099462:	48 8d 7d 40          	lea    rdi,[rbp+0x40]
     1099466:	48 8d b4 24 70 01 00 	lea    rsi,[rsp+0x170]
     109946d:	00 
     109946e:	48 89 7c 24 58       	mov    QWORD PTR [rsp+0x58],rdi
     1099473:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
     1099478:	e8 13 0e 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     109947d:	48 8d 75 70          	lea    rsi,[rbp+0x70]
     1099481:	48 8b 84 24 50 02 00 	mov    rax,QWORD PTR [rsp+0x250]

### 0x1099608 -> 0x184c468 from 0x109917a..0x1099d71
     10995d2:	e8 11 12 74 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     10995d7:	49 89 ad 70 03 00 00 	mov    QWORD PTR [r13+0x370],rbp
     10995de:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
     10995e5:	00 
     10995e6:	e8 7f 09 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     10995eb:	4c 8d b4 24 30 02 00 	lea    r14,[rsp+0x230]
     10995f2:	00 
     10995f3:	4c 89 f7             	mov    rdi,r14
     10995f6:	e8 6f 09 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     10995fb:	bf 80 00 00 00       	mov    edi,0x80
     1099600:	e8 fb 48 75 00       	call   17edf00 <_Znwm@plt>
     1099605:	48 89 c3             	mov    rbx,rax
     1099608:	48 8d 05 59 2e 7b 00 	lea    rax,[rip+0x7b2e59]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     109960f:	48 89 84 24 30 02 00 	mov    QWORD PTR [rsp+0x230],rax
     1099616:	00 
     1099617:	4c 89 ac 24 38 02 00 	mov    QWORD PTR [rsp+0x238],r13
     109961e:	00 
     109961f:	4c 89 b4 24 50 02 00 	mov    QWORD PTR [rsp+0x250],r14
     1099626:	00 
     1099627:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
     109962e:	00 
     109962f:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099632:	4c 8d 7b 10          	lea    r15,[rbx+0x10]
     1099636:	4c 89 ff             	mov    rdi,r15
     1099639:	4c 89 f6             	mov    rsi,r14
     109963c:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
     1099641:	e8 4a 0c 9e ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
     1099646:	4c 8d 73 40          	lea    r14,[rbx+0x40]
     109964a:	4c 89 f7             	mov    rdi,r14
     109964d:	e8 a4 03 74 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     1099652:	0f 57 c0             	xorps  xmm0,xmm0
     1099655:	0f 29 43 60          	movaps XMMWORD PTR [rbx+0x60],xmm0

### 0x10996ff -> 0x184c4b0 from 0x109917a..0x1099d71
     10996d1:	49 89 9d 78 03 00 00 	mov    QWORD PTR [r13+0x378],rbx
     10996d8:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
     10996df:	00 
     10996e0:	e8 85 08 9e ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     10996e5:	41 c6 85 80 03 00 00 	mov    BYTE PTR [r13+0x380],0x0
     10996ec:	00 
     10996ed:	6a 60                	push   0x60
     10996ef:	5f                   	pop    rdi
     10996f0:	e8 0b 48 75 00       	call   17edf00 <_Znwm@plt>
     10996f5:	48 89 c3             	mov    rbx,rax
     10996f8:	0f 57 c0             	xorps  xmm0,xmm0
     10996fb:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10996ff:	48 8d 05 aa 2d 7b 00 	lea    rax,[rip+0x7b2daa]        # 184c4b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b98>
     1099706:	48 89 03             	mov    QWORD PTR [rbx],rax
     1099709:	48 89 d8             	mov    rax,rbx
     109970c:	48 83 c0 18          	add    rax,0x18
     1099710:	0f 11 43 38          	movups XMMWORD PTR [rbx+0x38],xmm0
     1099714:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
     1099718:	0f 11 43 28          	movups XMMWORD PTR [rbx+0x28],xmm0
     109971c:	c7 43 38 00 00 80 3f 	mov    DWORD PTR [rbx+0x38],0x3f800000
     1099723:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
     1099728:	49 89 85 88 03 00 00 	mov    QWORD PTR [r13+0x388],rax
     109972f:	49 89 9d 90 03 00 00 	mov    QWORD PTR [r13+0x390],rbx
     1099736:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     109973b:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     1099740:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     1099744:	48 89 5b 50          	mov    QWORD PTR [rbx+0x50],rbx
     1099748:	31 ff                	xor    edi,edi
     109974a:	e8 63 4d a0 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     109974f:	48 89 df             	mov    rdi,rbx
     1099752:	e8 2f 4d a0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1099757:	4c 8d 25 89 f5 29 ff 	lea    r12,[rip+0xffffffffff29f589]        # 338ce7 <_ZTSSt12bad_any_cast@@Base-0x574e1>

### 0x1099970 -> 0x184c670 from 0x109917a..0x1099d71
     1099948:	00 
     1099949:	ff 50 28             	call   QWORD PTR [rax+0x28]
     109994c:	6a 48                	push   0x48
     109994e:	5f                   	pop    rdi
     109994f:	e8 ac 45 75 00       	call   17edf00 <_Znwm@plt>
     1099954:	0f 57 c0             	xorps  xmm0,xmm0
     1099957:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     109995b:	48 8d 0d e6 1d 7b 00 	lea    rcx,[rip+0x7b1de6]        # 184b748 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x7e30>
     1099962:	48 89 08             	mov    QWORD PTR [rax],rcx
     1099965:	48 89 c1             	mov    rcx,rax
     1099968:	48 83 c1 18          	add    rcx,0x18
     109996c:	4c 89 60 20          	mov    QWORD PTR [rax+0x20],r12
     1099970:	48 8d 15 f9 2c 7b 00 	lea    rdx,[rip+0x7b2cf9]        # 184c670 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d58>
     1099977:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
     109997b:	48 8b 94 24 38 02 00 	mov    rdx,QWORD PTR [rsp+0x238]
     1099982:	00 
     1099983:	0f 28 8c 24 30 02 00 	movaps xmm1,XMMWORD PTR [rsp+0x230]
     109998a:	00 
     109998b:	0f 11 48 28          	movups XMMWORD PTR [rax+0x28],xmm1
     109998f:	48 85 d2             	test   rdx,rdx
     1099992:	74 05                	je     1099999 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x260daf>
     1099994:	f0 48 ff 42 08       	lock inc QWORD PTR [rdx+0x8]
     1099999:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
     109999d:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
     10999a4:	00 
     10999a5:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     10999a8:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10999ac:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
     10999b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10999b4:	ff 50 38             	call   QWORD PTR [rax+0x38]
     10999b7:	48 8b 9c 24 98 00 00 	mov    rbx,QWORD PTR [rsp+0x98]
     10999be:	00 

### 0x109f872 -> 0x184c250 from 0x109f84e..0x109f89d
     109f84f:	48 85 ff             	test   rdi,rdi
     109f852:	74 11                	je     109f865 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x266c7b>
     109f854:	48 89 fb             	mov    rbx,rdi
     109f857:	6a 50                	push   0x50
     109f859:	5e                   	pop    rsi
     109f85a:	e8 cd ab 6e 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     109f85f:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     109f863:	eb 0d                	jmp    109f872 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x266c88>
     109f865:	6a 50                	push   0x50
     109f867:	5f                   	pop    rdi
     109f868:	e8 93 e6 74 00       	call   17edf00 <_Znwm@plt>
     109f86d:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     109f872:	48 8d 0d d7 c9 7a 00 	lea    rcx,[rip+0x7ac9d7]        # 184c250 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8938>
     109f879:	48 89 08             	mov    QWORD PTR [rax],rcx
     109f87c:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     109f881:	48 8d 0d 70 ff 39 ff 	lea    rcx,[rip+0xffffffffff39ff70]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     109f888:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     109f88c:	0f 57 c0             	xorps  xmm0,xmm0
     109f88f:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     109f893:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     109f897:	0f 11 40 40          	movups XMMWORD PTR [rax+0x40],xmm0
     109f89b:	5b                   	pop    rbx
     109f89c:	c3                   	ret
     109f89d:	cc                   	int3
     109f89e:	41 56                	push   r14
     109f8a0:	53                   	push   rbx
     109f8a1:	50                   	push   rax
     109f8a2:	89 f3                	mov    ebx,esi
     109f8a4:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     109f8a7:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
     109f8aa:	48 83 c7 08          	add    rdi,0x8
     109f8ae:	e8 8b 8a ac ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>

### 0x109f904 -> 0x184c210 from 0x109f8e0..0x109f930
     109f8e1:	48 85 ff             	test   rdi,rdi
     109f8e4:	74 11                	je     109f8f7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x266d0d>
     109f8e6:	48 89 fb             	mov    rbx,rdi
     109f8e9:	6a 48                	push   0x48
     109f8eb:	5e                   	pop    rsi
     109f8ec:	e8 3b ab 6e 00       	call   178a42c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x13e598>
     109f8f1:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
     109f8f5:	eb 0d                	jmp    109f904 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x266d1a>
     109f8f7:	6a 48                	push   0x48
     109f8f9:	5f                   	pop    rdi
     109f8fa:	e8 01 e6 74 00       	call   17edf00 <_Znwm@plt>
     109f8ff:	48 83 60 08 00       	and    QWORD PTR [rax+0x8],0x0
     109f904:	48 8d 0d 05 c9 7a 00 	lea    rcx,[rip+0x7ac905]        # 184c210 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x88f8>
     109f90b:	48 89 08             	mov    QWORD PTR [rax],rcx
     109f90e:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     109f913:	48 8d 0d de fe 39 ff 	lea    rcx,[rip+0xffffffffff39fede]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     109f91a:	48 89 48 18          	mov    QWORD PTR [rax+0x18],rcx
     109f91e:	0f 57 c0             	xorps  xmm0,xmm0
     109f921:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
     109f925:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
     109f929:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     109f92e:	5b                   	pop    rbx
     109f92f:	c3                   	ret
     109f930:	53                   	push   rbx
     109f931:	48 89 d3             	mov    rbx,rdx
     109f934:	48 89 f7             	mov    rdi,rsi
     109f937:	e8 06 00 00 00       	call   109f942 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x266d58>
     109f93c:	48 89 03             	mov    QWORD PTR [rbx],rax
     109f93f:	5b                   	pop    rbx
     109f940:	c3                   	ret
     109f941:	cc                   	int3
     109f942:	53                   	push   rbx

### 0x10a1159 -> 0x184c250 from 0x10a1152..0x10a1183
     10a112a:	e8 57 ff ff ff       	call   10a1086 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26849c>
     10a112f:	48 89 df             	mov    rdi,rbx
     10a1132:	5b                   	pop    rbx
     10a1133:	e9 e8 cd 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a1138:	0f 18 0d 61 68 85 00 	prefetcht0 BYTE PTR [rip+0x856861]        # 18f79a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3edb0>
     10a113f:	48 8d 05 5a 68 85 00 	lea    rax,[rip+0x85685a]        # 18f79a0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3edb0>
     10a1146:	48 8b 0d 5b 68 85 00 	mov    rcx,QWORD PTR [rip+0x85685b]        # 18f79a8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3edb8>
     10a114d:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     10a1150:	c3                   	ret
     10a1151:	cc                   	int3
     10a1152:	48 89 f0             	mov    rax,rsi
     10a1155:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     10a1159:	48 8d 0d f0 b0 7a 00 	lea    rcx,[rip+0x7ab0f0]        # 184c250 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8938>
     10a1160:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     10a1163:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     10a1168:	48 8d 0d 89 e6 39 ff 	lea    rcx,[rip+0xffffffffff39e689]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     10a116f:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
     10a1173:	0f 57 c0             	xorps  xmm0,xmm0
     10a1176:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
     10a117a:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     10a117e:	0f 11 46 40          	movups XMMWORD PTR [rsi+0x40],xmm0
     10a1182:	c3                   	ret
     10a1183:	cc                   	int3
     10a1184:	0f 18 0d 3d 66 85 00 	prefetcht0 BYTE PTR [rip+0x85663d]        # 18f77c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ebd8>
     10a118b:	48 8d 05 36 66 85 00 	lea    rax,[rip+0x856636]        # 18f77c8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ebd8>
     10a1192:	48 8b 0d 37 66 85 00 	mov    rcx,QWORD PTR [rip+0x856637]        # 18f77d0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3ebe0>
     10a1199:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     10a119c:	c3                   	ret
     10a119d:	cc                   	int3
     10a119e:	48 89 f0             	mov    rax,rsi
     10a11a1:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     10a11a5:	48 8d 0d 64 af 7a 00 	lea    rcx,[rip+0x7aaf64]        # 184c110 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x87f8>

### 0x10a1285 -> 0x184c210 from 0x10a127e..0x10a12b0
     10a1256:	e8 71 ff ff ff       	call   10a11cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2685e2>
     10a125b:	48 89 df             	mov    rdi,rbx
     10a125e:	5b                   	pop    rbx
     10a125f:	e9 bc cc 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a1264:	0f 18 0d 75 63 85 00 	prefetcht0 BYTE PTR [rip+0x856375]        # 18f75e0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e9f0>
     10a126b:	48 8d 05 6e 63 85 00 	lea    rax,[rip+0x85636e]        # 18f75e0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e9f0>
     10a1272:	48 8b 0d 6f 63 85 00 	mov    rcx,QWORD PTR [rip+0x85636f]        # 18f75e8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x3e9f8>
     10a1279:	0f 18 09             	prefetcht0 BYTE PTR [rcx]
     10a127c:	c3                   	ret
     10a127d:	cc                   	int3
     10a127e:	48 89 f0             	mov    rax,rsi
     10a1281:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     10a1285:	48 8d 0d 84 af 7a 00 	lea    rcx,[rip+0x7aaf84]        # 184c210 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x88f8>
     10a128c:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     10a128f:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
     10a1294:	48 8d 0d 5d e5 39 ff 	lea    rcx,[rip+0xffffffffff39e55d]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
     10a129b:	48 89 4e 18          	mov    QWORD PTR [rsi+0x18],rcx
     10a129f:	0f 57 c0             	xorps  xmm0,xmm0
     10a12a2:	0f 11 46 20          	movups XMMWORD PTR [rsi+0x20],xmm0
     10a12a6:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
     10a12aa:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
     10a12af:	c3                   	ret
     10a12b0:	41 56                	push   r14
     10a12b2:	53                   	push   rbx
     10a12b3:	50                   	push   rax
     10a12b4:	48 89 fb             	mov    rbx,rdi
     10a12b7:	48 83 c7 08          	add    rdi,0x8
     10a12bb:	e8 48 97 a0 ff       	call   aaaa08 <JNI_OnUnload@@Base+0x322d5>
     10a12c0:	48 8b 7b 18          	mov    rdi,QWORD PTR [rbx+0x18]
     10a12c4:	e8 df 45 6c 00       	call   17658a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119a14>
     10a12c9:	4c 8b 73 20          	mov    r14,QWORD PTR [rbx+0x20]
     10a12cd:	4d 85 f6             	test   r14,r14

### 0x10a1674 -> 0x184c4b0 from 0x10a1674..0x10a1683
     10a1654:	53                   	push   rbx
     10a1655:	48 89 fb             	mov    rbx,rdi
     10a1658:	e8 b9 c9 2a 00       	call   134e016 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19359a>
     10a165d:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     10a1661:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
     10a1666:	48 85 ff             	test   rdi,rdi
     10a1669:	74 07                	je     10a1672 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268a88>
     10a166b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a166e:	5b                   	pop    rbx
     10a166f:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
     10a1672:	5b                   	pop    rbx
     10a1673:	c3                   	ret
     10a1674:	48 8d 05 35 ae 7a 00 	lea    rax,[rip+0x7aae35]        # 184c4b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b98>
     10a167b:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a167e:	e9 8d c9 74 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     10a1683:	cc                   	int3
     10a1684:	53                   	push   rbx
     10a1685:	48 89 fb             	mov    rbx,rdi
     10a1688:	e8 e7 ff ff ff       	call   10a1674 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268a8a>
     10a168d:	48 89 df             	mov    rdi,rbx
     10a1690:	5b                   	pop    rbx
     10a1691:	e9 8a c8 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a1696:	53                   	push   rbx
     10a1697:	48 89 fb             	mov    rbx,rdi
     10a169a:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
     10a169e:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
     10a16a3:	48 85 ff             	test   rdi,rdi
     10a16a6:	74 06                	je     10a16ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268ac4>
     10a16a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a16ab:	ff 50 08             	call   QWORD PTR [rax+0x8]
     10a16ae:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
     10a16b2:	48 83 c3 18          	add    rbx,0x18

### 0x10a16d0 -> 0x184c468 from 0x10a16c4..0x10a16e4
     10a16ab:	ff 50 08             	call   QWORD PTR [rax+0x8]
     10a16ae:	48 8b 7b 50          	mov    rdi,QWORD PTR [rbx+0x50]
     10a16b2:	48 83 c3 18          	add    rbx,0x18
     10a16b6:	e8 f7 cd 9f ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     10a16bb:	48 89 df             	mov    rdi,rbx
     10a16be:	5b                   	pop    rbx
     10a16bf:	e9 1c 69 a4 ff       	jmp    ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
     10a16c4:	53                   	push   rbx
     10a16c5:	48 89 fb             	mov    rbx,rdi
     10a16c8:	6a 10                	push   0x10
     10a16ca:	5f                   	pop    rdi
     10a16cb:	e8 30 c8 74 00       	call   17edf00 <_Znwm@plt>
     10a16d0:	48 8d 0d 91 ad 7a 00 	lea    rcx,[rip+0x7aad91]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     10a16d7:	48 89 08             	mov    QWORD PTR [rax],rcx
     10a16da:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     10a16de:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     10a16e2:	5b                   	pop    rbx
     10a16e3:	c3                   	ret
     10a16e4:	48 8d 05 7d ad 7a 00 	lea    rax,[rip+0x7aad7d]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     10a16eb:	48 89 06             	mov    QWORD PTR [rsi],rax
     10a16ee:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10a16f2:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a16f6:	c3                   	ret
     10a16f7:	cc                   	int3
     10a16f8:	50                   	push   rax
     10a16f9:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     10a16fd:	e8 3e fd ff ff       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     10a1702:	58                   	pop    rax
     10a1703:	c3                   	ret
     10a1704:	48 89 c7             	mov    rdi,rax
     10a1707:	e8 99 83 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a170c:	53                   	push   rbx

### 0x10a16e4 -> 0x184c468 from 0x10a16e4..0x10a16f7
     10a16bf:	e9 1c 69 a4 ff       	jmp    ae7fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x34f80>
     10a16c4:	53                   	push   rbx
     10a16c5:	48 89 fb             	mov    rbx,rdi
     10a16c8:	6a 10                	push   0x10
     10a16ca:	5f                   	pop    rdi
     10a16cb:	e8 30 c8 74 00       	call   17edf00 <_Znwm@plt>
     10a16d0:	48 8d 0d 91 ad 7a 00 	lea    rcx,[rip+0x7aad91]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     10a16d7:	48 89 08             	mov    QWORD PTR [rax],rcx
     10a16da:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     10a16de:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     10a16e2:	5b                   	pop    rbx
     10a16e3:	c3                   	ret
     10a16e4:	48 8d 05 7d ad 7a 00 	lea    rax,[rip+0x7aad7d]        # 184c468 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b50>
     10a16eb:	48 89 06             	mov    QWORD PTR [rsi],rax
     10a16ee:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10a16f2:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a16f6:	c3                   	ret
     10a16f7:	cc                   	int3
     10a16f8:	50                   	push   rax
     10a16f9:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     10a16fd:	e8 3e fd ff ff       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     10a1702:	58                   	pop    rax
     10a1703:	c3                   	ret
     10a1704:	48 89 c7             	mov    rdi,rax
     10a1707:	e8 99 83 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a170c:	53                   	push   rbx
     10a170d:	48 89 fb             	mov    rbx,rdi
     10a1710:	6a 10                	push   0x10
     10a1712:	5f                   	pop    rdi
     10a1713:	e8 e8 c7 74 00       	call   17edf00 <_Znwm@plt>
     10a1718:	48 8d 0d 01 ad 7a 00 	lea    rcx,[rip+0x7aad01]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     10a171f:	48 89 08             	mov    QWORD PTR [rax],rcx

### 0x10a1718 -> 0x184c420 from 0x10a170c..0x10a172c
     10a16f8:	50                   	push   rax
     10a16f9:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     10a16fd:	e8 3e fd ff ff       	call   10a1440 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268856>
     10a1702:	58                   	pop    rax
     10a1703:	c3                   	ret
     10a1704:	48 89 c7             	mov    rdi,rax
     10a1707:	e8 99 83 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a170c:	53                   	push   rbx
     10a170d:	48 89 fb             	mov    rbx,rdi
     10a1710:	6a 10                	push   0x10
     10a1712:	5f                   	pop    rdi
     10a1713:	e8 e8 c7 74 00       	call   17edf00 <_Znwm@plt>
     10a1718:	48 8d 0d 01 ad 7a 00 	lea    rcx,[rip+0x7aad01]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     10a171f:	48 89 08             	mov    QWORD PTR [rax],rcx
     10a1722:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     10a1726:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     10a172a:	5b                   	pop    rbx
     10a172b:	c3                   	ret
     10a172c:	48 8d 05 ed ac 7a 00 	lea    rax,[rip+0x7aaced]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     10a1733:	48 89 06             	mov    QWORD PTR [rsi],rax
     10a1736:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10a173a:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a173e:	c3                   	ret
     10a173f:	cc                   	int3
     10a1740:	41 57                	push   r15
     10a1742:	41 56                	push   r14
     10a1744:	53                   	push   rbx
     10a1745:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     10a174c:	49 89 f6             	mov    r14,rsi
     10a174f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a1756:	00 00 
     10a1758:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax

### 0x10a172c -> 0x184c420 from 0x10a172c..0x10a173f
     10a1707:	e8 99 83 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a170c:	53                   	push   rbx
     10a170d:	48 89 fb             	mov    rbx,rdi
     10a1710:	6a 10                	push   0x10
     10a1712:	5f                   	pop    rdi
     10a1713:	e8 e8 c7 74 00       	call   17edf00 <_Znwm@plt>
     10a1718:	48 8d 0d 01 ad 7a 00 	lea    rcx,[rip+0x7aad01]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     10a171f:	48 89 08             	mov    QWORD PTR [rax],rcx
     10a1722:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     10a1726:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     10a172a:	5b                   	pop    rbx
     10a172b:	c3                   	ret
     10a172c:	48 8d 05 ed ac 7a 00 	lea    rax,[rip+0x7aaced]        # 184c420 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b08>
     10a1733:	48 89 06             	mov    QWORD PTR [rsi],rax
     10a1736:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10a173a:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a173e:	c3                   	ret
     10a173f:	cc                   	int3
     10a1740:	41 57                	push   r15
     10a1742:	41 56                	push   r14
     10a1744:	53                   	push   rbx
     10a1745:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     10a174c:	49 89 f6             	mov    r14,rsi
     10a174f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a1756:	00 00 
     10a1758:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     10a175d:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     10a1761:	48 8b 73 70          	mov    rsi,QWORD PTR [rbx+0x70]
     10a1765:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     10a176a:	e8 7d ed 5d 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
     10a176f:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a1774:	4c 89 f6             	mov    rsi,r14

### 0x10a1844 -> 0x184c3d8 from 0x10a1838..0x10a1858
     10a181c:	e8 0d 3b 62 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     10a1821:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
     10a1826:	e8 5b cc 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a182b:	eb 03                	jmp    10a1830 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268c46>
     10a182d:	48 89 c3             	mov    rbx,rax
     10a1830:	48 89 df             	mov    rdi,rbx
     10a1833:	e8 6d 82 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a1838:	53                   	push   rbx
     10a1839:	48 89 fb             	mov    rbx,rdi
     10a183c:	6a 10                	push   0x10
     10a183e:	5f                   	pop    rdi
     10a183f:	e8 bc c6 74 00       	call   17edf00 <_Znwm@plt>
     10a1844:	48 8d 0d 8d ab 7a 00 	lea    rcx,[rip+0x7aab8d]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     10a184b:	48 89 08             	mov    QWORD PTR [rax],rcx
     10a184e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     10a1852:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     10a1856:	5b                   	pop    rbx
     10a1857:	c3                   	ret
     10a1858:	48 8d 05 79 ab 7a 00 	lea    rax,[rip+0x7aab79]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     10a185f:	48 89 06             	mov    QWORD PTR [rsi],rax
     10a1862:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10a1866:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a186a:	c3                   	ret
     10a186b:	cc                   	int3
     10a186c:	55                   	push   rbp
     10a186d:	41 57                	push   r15
     10a186f:	41 56                	push   r14
     10a1871:	41 55                	push   r13
     10a1873:	41 54                	push   r12
     10a1875:	53                   	push   rbx
     10a1876:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     10a187d:	49 89 d4             	mov    r12,rdx

### 0x10a1858 -> 0x184c3d8 from 0x10a1858..0x10a186b
     10a1833:	e8 6d 82 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a1838:	53                   	push   rbx
     10a1839:	48 89 fb             	mov    rbx,rdi
     10a183c:	6a 10                	push   0x10
     10a183e:	5f                   	pop    rdi
     10a183f:	e8 bc c6 74 00       	call   17edf00 <_Znwm@plt>
     10a1844:	48 8d 0d 8d ab 7a 00 	lea    rcx,[rip+0x7aab8d]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     10a184b:	48 89 08             	mov    QWORD PTR [rax],rcx
     10a184e:	48 8b 4b 08          	mov    rcx,QWORD PTR [rbx+0x8]
     10a1852:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     10a1856:	5b                   	pop    rbx
     10a1857:	c3                   	ret
     10a1858:	48 8d 05 79 ab 7a 00 	lea    rax,[rip+0x7aab79]        # 184c3d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8ac0>
     10a185f:	48 89 06             	mov    QWORD PTR [rsi],rax
     10a1862:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     10a1866:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
     10a186a:	c3                   	ret
     10a186b:	cc                   	int3
     10a186c:	55                   	push   rbp
     10a186d:	41 57                	push   r15
     10a186f:	41 56                	push   r14
     10a1871:	41 55                	push   r13
     10a1873:	41 54                	push   r12
     10a1875:	53                   	push   rbx
     10a1876:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     10a187d:	49 89 d4             	mov    r12,rdx
     10a1880:	49 89 f7             	mov    r15,rsi
     10a1883:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a188a:	00 00 
     10a188c:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     10a1893:	00 
     10a1894:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]

### 0x10a19d6 -> 0x184c640 from 0x10a186c..0x10a1b62
     10a19a5:	48 89 c6             	mov    rsi,rax
     10a19a8:	e8 33 10 a5 ff       	call   af29e0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f980>
     10a19ad:	45 31 e4             	xor    r12d,r12d
     10a19b0:	84 c0                	test   al,al
     10a19b2:	0f 84 de 00 00 00    	je     10a1a96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268eac>
     10a19b8:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
     10a19bc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     10a19c1:	4c 89 fe             	mov    rsi,r15
     10a19c4:	e8 77 c5 74 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     10a19c9:	45 31 f6             	xor    r14d,r14d
     10a19cc:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
     10a19d1:	48 8d 6c 24 08       	lea    rbp,[rsp+0x8]
     10a19d6:	48 8d 05 63 ac 7a 00 	lea    rax,[rip+0x7aac63]        # 184c640 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d28>
     10a19dd:	4d 8b 2c 06          	mov    r13,QWORD PTR [r14+rax*1]
     10a19e1:	4c 89 e7             	mov    rdi,r12
     10a19e4:	4c 89 ee             	mov    rsi,r13
     10a19e7:	6a 06                	push   0x6
     10a19e9:	5a                   	pop    rdx
     10a19ea:	e8 ab 0d a5 ff       	call   af279a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3f73a>
     10a19ef:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     10a19f3:	74 72                	je     10a1a67 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268e7d>
     10a19f5:	48 89 ef             	mov    rdi,rbp
     10a19f8:	4c 89 ee             	mov    rsi,r13
     10a19fb:	e8 7e 80 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a1a00:	4c 89 e7             	mov    rdi,r12
     10a1a03:	48 89 ee             	mov    rsi,rbp
     10a1a06:	e8 8b 38 a5 ff       	call   af5296 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x42236>
     10a1a0b:	48 83 f8 ff          	cmp    rax,0xffffffffffffffff
     10a1a0f:	74 1e                	je     10a1a2f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268e45>
     10a1a11:	0f b6 54 24 08       	movzx  edx,BYTE PTR [rsp+0x8]
     10a1a16:	f6 c2 01             	test   dl,0x1
     10a1a19:	74 07                	je     10a1a22 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268e38>

### 0x10a2086 -> 0x184c360 from 0x10a2082..0x10a2130
     10a2066:	48 83 c3 08          	add    rbx,0x8
     10a206a:	4c 89 f7             	mov    rdi,r14
     10a206d:	48 89 de             	mov    rsi,rbx
     10a2070:	e8 ed fa ff ff       	call   10a1b62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x268f78>
     10a2075:	5b                   	pop    rbx
     10a2076:	41 5e                	pop    r14
     10a2078:	5d                   	pop    rbp
     10a2079:	c3                   	ret
     10a207a:	48 89 c7             	mov    rdi,rax
     10a207d:	e8 23 7a 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a2082:	53                   	push   rbx
     10a2083:	48 89 fb             	mov    rbx,rdi
     10a2086:	48 8d 05 d3 a2 7a 00 	lea    rax,[rip+0x7aa2d3]        # 184c360 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8a48>
     10a208d:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a2090:	48 81 c7 c8 04 00 00 	add    rdi,0x4c8
     10a2097:	e8 e0 d0 ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     10a209c:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
     10a20a3:	e8 be 7d 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     10a20a8:	48 8d bb 18 04 00 00 	lea    rdi,[rbx+0x418]
     10a20af:	e8 b2 7d 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
     10a20b4:	48 8b bb 10 04 00 00 	mov    rdi,QWORD PTR [rbx+0x410]
     10a20bb:	e8 c6 c3 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a20c0:	48 8d bb 98 03 00 00 	lea    rdi,[rbx+0x398]
     10a20c7:	e8 9e 67 54 00       	call   15e886a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ddee>
     10a20cc:	48 8d bb 88 03 00 00 	lea    rdi,[rbx+0x388]
     10a20d3:	e8 ae f4 ff ff       	call   10a1586 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26899c>
     10a20d8:	48 8d bb 78 03 00 00 	lea    rdi,[rbx+0x378]
     10a20df:	e8 c0 f4 ff ff       	call   10a15a4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ba>
     10a20e4:	48 8d bb 70 03 00 00 	lea    rdi,[rbx+0x370]
     10a20eb:	e8 e8 f4 ff ff       	call   10a15d8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2689ee>
     10a20f0:	48 8d bb f8 01 00 00 	lea    rdi,[rbx+0x1f8]
     10a20f7:	e8 0a 58 54 00       	call   15e7906 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ce8a>

### 0x10a2322 -> 0x184c528 from 0x10a229e..0x10a2bc4
     10a22f2:	48 89 c6             	mov    rsi,rax
     10a22f5:	e8 2c 1c 00 00       	call   10a3f26 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b33c>
     10a22fa:	6a 60                	push   0x60
     10a22fc:	5f                   	pop    rdi
     10a22fd:	e8 fe bb 74 00       	call   17edf00 <_Znwm@plt>
     10a2302:	48 89 c3             	mov    rbx,rax
     10a2305:	4d 8b 66 50          	mov    r12,QWORD PTR [r14+0x50]
     10a2309:	66 83 60 08 00       	and    WORD PTR [rax+0x8],0x0
     10a230e:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     10a2313:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
     10a2318:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
     10a231d:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     10a2322:	48 8d 05 ff a1 7a 00 	lea    rax,[rip+0x7aa1ff]        # 184c528 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c10>
     10a2329:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a232c:	bf a8 00 00 00       	mov    edi,0xa8
     10a2331:	e8 ca bb 74 00       	call   17edf00 <_Znwm@plt>
     10a2336:	49 89 c7             	mov    r15,rax
     10a2339:	0f 57 c0             	xorps  xmm0,xmm0
     10a233c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10a2340:	48 8d 05 d1 a2 7a 00 	lea    rax,[rip+0x7aa2d1]        # 184c618 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d00>
     10a2347:	49 89 07             	mov    QWORD PTR [r15],rax
     10a234a:	49 8d 7f 18          	lea    rdi,[r15+0x18]
     10a234e:	48 89 9c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rbx
     10a2355:	00 
     10a2356:	48 8d 05 07 a1 9d ff 	lea    rax,[rip+0xffffffffff9da107]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     10a235d:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     10a2364:	00 
     10a2365:	48 8d 05 60 20 00 00 	lea    rax,[rip+0x2060]        # 10a43cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b7e2>
     10a236c:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
     10a2373:	00 
     10a2374:	48 89 9c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbx
     10a237b:	00 

### 0x10a2340 -> 0x184c618 from 0x10a229e..0x10a2bc4
     10a2309:	66 83 60 08 00       	and    WORD PTR [rax+0x8],0x0
     10a230e:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     10a2313:	48 83 60 20 00       	and    QWORD PTR [rax+0x20],0x0
     10a2318:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
     10a231d:	48 83 60 40 00       	and    QWORD PTR [rax+0x40],0x0
     10a2322:	48 8d 05 ff a1 7a 00 	lea    rax,[rip+0x7aa1ff]        # 184c528 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c10>
     10a2329:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a232c:	bf a8 00 00 00       	mov    edi,0xa8
     10a2331:	e8 ca bb 74 00       	call   17edf00 <_Znwm@plt>
     10a2336:	49 89 c7             	mov    r15,rax
     10a2339:	0f 57 c0             	xorps  xmm0,xmm0
     10a233c:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     10a2340:	48 8d 05 d1 a2 7a 00 	lea    rax,[rip+0x7aa2d1]        # 184c618 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d00>
     10a2347:	49 89 07             	mov    QWORD PTR [r15],rax
     10a234a:	49 8d 7f 18          	lea    rdi,[r15+0x18]
     10a234e:	48 89 9c 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rbx
     10a2355:	00 
     10a2356:	48 8d 05 07 a1 9d ff 	lea    rax,[rip+0xffffffffff9da107]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     10a235d:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     10a2364:	00 
     10a2365:	48 8d 05 60 20 00 00 	lea    rax,[rip+0x2060]        # 10a43cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b7e2>
     10a236c:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
     10a2373:	00 
     10a2374:	48 89 9c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rbx
     10a237b:	00 
     10a237c:	48 8d 05 e1 a0 9d ff 	lea    rax,[rip+0xffffffffff9da0e1]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
     10a2383:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
     10a238a:	00 
     10a238b:	48 8d 05 72 20 00 00 	lea    rax,[rip+0x2072]        # 10a4404 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b81a>
     10a2392:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
     10a2399:	00 
     10a239a:	48 8d 35 df 4e 33 ff 	lea    rsi,[rip+0xffffffffff334edf]        # 3d7280 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1e65>

### 0x10a248a -> 0x184c4e8 from 0x10a229e..0x10a2bc4
     10a2459:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     10a245e:	48 8d 05 7b 59 93 ff 	lea    rax,[rip+0xffffffffff93597b]        # 9d7de0 <_ZNSt13bad_exceptionD1Ev@@Base>
     10a2465:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
     10a246a:	4d 8b b6 88 03 00 00 	mov    r14,QWORD PTR [r14+0x388]
     10a2471:	6a 48                	push   0x48
     10a2473:	5f                   	pop    rdi
     10a2474:	e8 87 ba 74 00       	call   17edf00 <_Znwm@plt>
     10a2479:	49 89 c7             	mov    r15,rax
     10a247c:	0f 57 c0             	xorps  xmm0,xmm0
     10a247f:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     10a2482:	0f 29 40 20          	movaps XMMWORD PTR [rax+0x20],xmm0
     10a2486:	0f 29 40 10          	movaps XMMWORD PTR [rax+0x10],xmm0
     10a248a:	48 8d 05 57 a0 7a 00 	lea    rax,[rip+0x7aa057]        # 184c4e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8bd0>
     10a2491:	49 89 07             	mov    QWORD PTR [r15],rax
     10a2494:	41 0f 11 47 30       	movups XMMWORD PTR [r15+0x30],xmm0
     10a2499:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
     10a249e:	6a 48                	push   0x48
     10a24a0:	5f                   	pop    rdi
     10a24a1:	e8 5a ba 74 00       	call   17edf00 <_Znwm@plt>
     10a24a6:	49 89 c4             	mov    r12,rax
     10a24a9:	48 8d 68 48          	lea    rbp,[rax+0x48]
     10a24ad:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]
     10a24b4:	00 
     10a24b5:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
     10a24ba:	4c 89 ef             	mov    rdi,r13
     10a24bd:	e8 44 0f 00 00       	call   10a3406 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a81c>
     10a24c2:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
     10a24c6:	49 8d 7c 24 08       	lea    rdi,[r12+0x8]
     10a24cb:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
     10a24d0:	e8 79 0f 00 00       	call   10a344e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a864>
     10a24d5:	49 8d 7c 24 28       	lea    rdi,[r12+0x28]
     10a24da:	4c 89 ee             	mov    rsi,r13

### 0x10a3c42 -> 0x184c4e8 from 0x10a3c3a..0x10a3c8c
     10a3c20:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     10a3c25:	75 05                	jne    10a3c2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b042>
     10a3c27:	48 83 c4 18          	add    rsp,0x18
     10a3c2b:	c3                   	ret
     10a3c2c:	e8 7f be 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a3c31:	48 89 c7             	mov    rdi,rax
     10a3c34:	e8 6c 5e 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a3c39:	cc                   	int3
     10a3c3a:	41 57                	push   r15
     10a3c3c:	41 56                	push   r14
     10a3c3e:	53                   	push   rbx
     10a3c3f:	48 89 fb             	mov    rbx,rdi
     10a3c42:	48 8d 05 9f 88 7a 00 	lea    rax,[rip+0x7a889f]        # 184c4e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8bd0>
     10a3c49:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a3c4c:	4c 8b 7f 30          	mov    r15,QWORD PTR [rdi+0x30]
     10a3c50:	4d 85 ff             	test   r15,r15
     10a3c53:	74 2a                	je     10a3c7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b095>
     10a3c55:	4c 8b 73 38          	mov    r14,QWORD PTR [rbx+0x38]
     10a3c59:	4c 89 ff             	mov    rdi,r15
     10a3c5c:	4d 39 fe             	cmp    r14,r15
     10a3c5f:	74 15                	je     10a3c76 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b08c>
     10a3c61:	49 83 c6 b8          	add    r14,0xffffffffffffffb8
     10a3c65:	4c 89 f7             	mov    rdi,r14
     10a3c68:	e8 29 f8 ff ff       	call   10a3496 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26a8ac>
     10a3c6d:	4d 39 fe             	cmp    r14,r15
     10a3c70:	75 ef                	jne    10a3c61 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b077>
     10a3c72:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
     10a3c76:	4c 89 7b 38          	mov    QWORD PTR [rbx+0x38],r15
     10a3c7a:	e8 a1 a2 74 00       	call   17edf20 <_ZdlPv@plt>
     10a3c7f:	48 89 df             	mov    rdi,rbx
     10a3c82:	5b                   	pop    rbx
     10a3c83:	41 5e                	pop    r14

### 0x10a3c9e -> 0x184c508 from 0x10a3c9e..0x10a3cb1
     10a3c7a:	e8 a1 a2 74 00       	call   17edf20 <_ZdlPv@plt>
     10a3c7f:	48 89 df             	mov    rdi,rbx
     10a3c82:	5b                   	pop    rbx
     10a3c83:	41 5e                	pop    r14
     10a3c85:	41 5f                	pop    r15
     10a3c87:	e9 12 00 00 00       	jmp    10a3c9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b0b4>
     10a3c8c:	53                   	push   rbx
     10a3c8d:	48 89 fb             	mov    rbx,rdi
     10a3c90:	e8 a5 ff ff ff       	call   10a3c3a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b050>
     10a3c95:	48 89 df             	mov    rdi,rbx
     10a3c98:	5b                   	pop    rbx
     10a3c99:	e9 82 a2 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a3c9e:	48 8d 05 63 88 7a 00 	lea    rax,[rip+0x7a8863]        # 184c508 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8bf0>
     10a3ca5:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a3ca8:	48 83 c7 10          	add    rdi,0x10
     10a3cac:	e9 ed 35 a0 ff       	jmp    aa729e <JNI_OnUnload@@Base+0x2eb6b>
     10a3cb1:	cc                   	int3
     10a3cb2:	53                   	push   rbx
     10a3cb3:	48 89 fb             	mov    rbx,rdi
     10a3cb6:	e8 e3 ff ff ff       	call   10a3c9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b0b4>
     10a3cbb:	48 89 df             	mov    rdi,rbx
     10a3cbe:	5b                   	pop    rbx
     10a3cbf:	e9 5c a2 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a3cc4:	41 57                	push   r15
     10a3cc6:	41 56                	push   r14
     10a3cc8:	53                   	push   rbx
     10a3cc9:	48 89 fb             	mov    rbx,rdi
     10a3ccc:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
     10a3cd1:	49 89 d7             	mov    r15,rdx
     10a3cd4:	49 89 f6             	mov    r14,rsi
     10a3cd7:	48 89 4f 20          	mov    QWORD PTR [rdi+0x20],rcx
     10a3cdb:	48 85 f6             	test   rsi,rsi

### 0x10a4440 -> 0x184c558 from 0x10a443c..0x10a4460
     10a4424:	48 89 de             	mov    rsi,rbx
     10a4427:	48 83 c4 08          	add    rsp,0x8
     10a442b:	5b                   	pop    rbx
     10a442c:	41 5e                	pop    r14
     10a442e:	e9 01 f5 c0 ff       	jmp    cb3934 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2008d4>
     10a4433:	48 83 c4 08          	add    rsp,0x8
     10a4437:	5b                   	pop    rbx
     10a4438:	41 5e                	pop    r14
     10a443a:	c3                   	ret
     10a443b:	cc                   	int3
     10a443c:	53                   	push   rbx
     10a443d:	48 89 fb             	mov    rbx,rdi
     10a4440:	48 8d 05 11 81 7a 00 	lea    rax,[rip+0x7a8111]        # 184c558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c40>
     10a4447:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a444a:	48 83 c7 30          	add    rdi,0x30
     10a444e:	e8 09 16 b7 ff       	call   c15a5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1629fc>
     10a4453:	48 83 c3 10          	add    rbx,0x10
     10a4457:	48 89 df             	mov    rdi,rbx
     10a445a:	5b                   	pop    rbx
     10a445b:	e9 64 f5 ff ff       	jmp    10a39c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26adda>
     10a4460:	48 8d 05 b1 81 7a 00 	lea    rax,[rip+0x7a81b1]        # 184c618 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d00>
     10a4467:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a446a:	e9 a1 9b 74 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     10a446f:	cc                   	int3
     10a4470:	53                   	push   rbx
     10a4471:	48 89 fb             	mov    rbx,rdi
     10a4474:	e8 e7 ff ff ff       	call   10a4460 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b876>
     10a4479:	48 89 df             	mov    rdi,rbx
     10a447c:	5b                   	pop    rbx
     10a447d:	e9 9e 9a 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a4482:	41 56                	push   r14
     10a4484:	53                   	push   rbx

### 0x10a4460 -> 0x184c618 from 0x10a4460..0x10a446f
     10a443a:	c3                   	ret
     10a443b:	cc                   	int3
     10a443c:	53                   	push   rbx
     10a443d:	48 89 fb             	mov    rbx,rdi
     10a4440:	48 8d 05 11 81 7a 00 	lea    rax,[rip+0x7a8111]        # 184c558 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c40>
     10a4447:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a444a:	48 83 c7 30          	add    rdi,0x30
     10a444e:	e8 09 16 b7 ff       	call   c15a5c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1629fc>
     10a4453:	48 83 c3 10          	add    rbx,0x10
     10a4457:	48 89 df             	mov    rdi,rbx
     10a445a:	5b                   	pop    rbx
     10a445b:	e9 64 f5 ff ff       	jmp    10a39c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26adda>
     10a4460:	48 8d 05 b1 81 7a 00 	lea    rax,[rip+0x7a81b1]        # 184c618 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8d00>
     10a4467:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a446a:	e9 a1 9b 74 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
     10a446f:	cc                   	int3
     10a4470:	53                   	push   rbx
     10a4471:	48 89 fb             	mov    rbx,rdi
     10a4474:	e8 e7 ff ff ff       	call   10a4460 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b876>
     10a4479:	48 89 df             	mov    rdi,rbx
     10a447c:	5b                   	pop    rbx
     10a447d:	e9 9e 9a 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a4482:	41 56                	push   r14
     10a4484:	53                   	push   rbx
     10a4485:	50                   	push   rax
     10a4486:	48 89 fb             	mov    rbx,rdi
     10a4489:	4c 8d 77 18          	lea    r14,[rdi+0x18]
     10a448d:	48 81 c7 98 00 00 00 	add    rdi,0x98
     10a4494:	e8 e3 ac ac ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
     10a4499:	48 8b bb 90 00 00 00 	mov    rdi,QWORD PTR [rbx+0x90]
     10a44a0:	e8 e1 9f 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a44a5:	48 8d 7b 60          	lea    rdi,[rbx+0x60]

### 0x10a44d4 -> 0x184c528 from 0x10a44d0..0x10a44f5
     10a44ae:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
     10a44b2:	e8 0d f5 ff ff       	call   10a39c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26adda>
     10a44b7:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
     10a44bb:	e8 c6 9f 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a44c0:	4c 89 f7             	mov    rdi,r14
     10a44c3:	48 83 c4 08          	add    rsp,0x8
     10a44c7:	5b                   	pop    rbx
     10a44c8:	41 5e                	pop    r14
     10a44ca:	e9 c1 99 74 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a44cf:	cc                   	int3
     10a44d0:	53                   	push   rbx
     10a44d1:	48 89 fb             	mov    rbx,rdi
     10a44d4:	48 8d 05 4d 80 7a 00 	lea    rax,[rip+0x7a804d]        # 184c528 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c10>
     10a44db:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a44de:	48 8b 7f 58          	mov    rdi,QWORD PTR [rdi+0x58]
     10a44e2:	48 85 ff             	test   rdi,rdi
     10a44e5:	74 05                	je     10a44ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b902>
     10a44e7:	e8 a4 9f 9f ff       	call   a9e490 <JNI_OnUnload@@Base+0x25d5d>
     10a44ec:	48 89 df             	mov    rdi,rbx
     10a44ef:	5b                   	pop    rbx
     10a44f0:	e9 47 ff ff ff       	jmp    10a443c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b852>
     10a44f5:	cc                   	int3
     10a44f6:	53                   	push   rbx
     10a44f7:	48 89 fb             	mov    rbx,rdi
     10a44fa:	e8 d1 ff ff ff       	call   10a44d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26b8e6>
     10a44ff:	48 89 df             	mov    rdi,rbx
     10a4502:	5b                   	pop    rbx
     10a4503:	e9 18 9a 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a4508:	41 57                	push   r15
     10a450a:	41 56                	push   r14
     10a450c:	41 55                	push   r13
     10a450e:	41 54                	push   r12

### 0x10a461f -> 0x184c588 from 0x10a4508..0x10a481c
     10a45f1:	4c 89 f7             	mov    rdi,r14
     10a45f4:	e8 b3 4b ad ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     10a45f9:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     10a4600:	00 
     10a4601:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
     10a4606:	e8 63 52 ad ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     10a460b:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
     10a4612:	00 00 
     10a4614:	6a 20                	push   0x20
     10a4616:	5f                   	pop    rdi
     10a4617:	e8 e4 98 74 00       	call   17edf00 <_Znwm@plt>
     10a461c:	49 89 c7             	mov    r15,rax
     10a461f:	48 8d 05 62 7f 7a 00 	lea    rax,[rip+0x7a7f62]        # 184c588 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c70>
     10a4626:	49 89 07             	mov    QWORD PTR [r15],rax
     10a4629:	4c 89 ff             	mov    rdi,r15
     10a462c:	48 83 c7 08          	add    rdi,0x8
     10a4630:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
     10a4637:	00 
     10a4638:	e8 31 52 ad ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     10a463d:	4c 8d a4 24 e0 00 00 	lea    r12,[rsp+0xe0]
     10a4644:	00 
     10a4645:	4d 89 7c 24 20       	mov    QWORD PTR [r12+0x20],r15
     10a464a:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     10a4651:	00 
     10a4652:	e8 cf c4 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     10a4657:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     10a465c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a465f:	4c 89 e6             	mov    rsi,r12
     10a4662:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     10a4668:	4c 8d 7c 24 28       	lea    r15,[rsp+0x28]
     10a466d:	49 89 5f f8          	mov    QWORD PTR [r15-0x8],rbx
     10a4671:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]

### 0x10a46a2 -> 0x184c5d0 from 0x10a4508..0x10a481c
     10a4678:	00 
     10a4679:	4c 89 ff             	mov    rdi,r15
     10a467c:	e8 2b 4b ad ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
     10a4681:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
     10a4688:	00 
     10a4689:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     10a468e:	e8 db 51 ad ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     10a4693:	6a 20                	push   0x20
     10a4695:	5f                   	pop    rdi
     10a4696:	e8 65 98 74 00       	call   17edf00 <_Znwm@plt>
     10a469b:	49 89 c5             	mov    r13,rax
     10a469e:	48 83 c3 70          	add    rbx,0x70
     10a46a2:	48 8d 05 27 7f 7a 00 	lea    rax,[rip+0x7a7f27]        # 184c5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8cb8>
     10a46a9:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     10a46ad:	4c 89 ef             	mov    rdi,r13
     10a46b0:	48 83 c7 08          	add    rdi,0x8
     10a46b4:	48 8d b4 24 98 00 00 	lea    rsi,[rsp+0x98]
     10a46bb:	00 
     10a46bc:	e8 ad 51 ad ff       	call   b7986e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc680e>
     10a46c1:	4c 8d a4 24 b0 00 00 	lea    r12,[rsp+0xb0]
     10a46c8:	00 
     10a46c9:	4d 89 6c 24 20       	mov    QWORD PTR [r12+0x20],r13
     10a46ce:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     10a46d5:	00 
     10a46d6:	e8 4b c4 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     10a46db:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
     10a46e0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a46e3:	4c 89 e6             	mov    rsi,r12
     10a46e6:	ff 90 a0 00 00 00    	call   QWORD PTR [rax+0xa0]
     10a46ec:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     10a46f1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     10a46f4:	4c 8d 6c 24 78       	lea    r13,[rsp+0x78]

### 0x10a481c -> 0x184c5d0 from 0x10a481c..0x10a482f
     10a47ea:	e8 97 9c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a47ef:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     10a47f6:	00 
     10a47f7:	e8 2a c3 9f ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
     10a47fc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a4803:	00 00 
     10a4805:	48 3b 84 24 18 01 00 	cmp    rax,QWORD PTR [rsp+0x118]
     10a480c:	00 
     10a480d:	75 08                	jne    10a4817 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bc2d>
     10a480f:	48 89 df             	mov    rdi,rbx
     10a4812:	e8 b9 b4 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10a4817:	e8 94 b2 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a481c:	48 8d 05 ad 7d 7a 00 	lea    rax,[rip+0x7a7dad]        # 184c5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8cb8>
     10a4823:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a4826:	48 83 c7 10          	add    rdi,0x10
     10a482a:	e9 f7 c2 9f ff       	jmp    aa0b26 <JNI_OnUnload@@Base+0x283f3>
     10a482f:	cc                   	int3
     10a4830:	53                   	push   rbx
     10a4831:	48 89 fb             	mov    rbx,rdi
     10a4834:	e8 e3 ff ff ff       	call   10a481c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bc32>
     10a4839:	48 89 df             	mov    rdi,rbx
     10a483c:	5b                   	pop    rbx
     10a483d:	e9 de 96 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a4842:	41 56                	push   r14
     10a4844:	53                   	push   rbx
     10a4845:	48 83 ec 28          	sub    rsp,0x28
     10a4849:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a4850:	00 00 
     10a4852:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a4857:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     10a485b:	6a 20                	push   0x20
     10a485d:	5f                   	pop    rdi

### 0x10a487d -> 0x184c5d0 from 0x10a4842..0x10a48e2
     10a4850:	00 00 
     10a4852:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a4857:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     10a485b:	6a 20                	push   0x20
     10a485d:	5f                   	pop    rdi
     10a485e:	e8 9d 96 74 00       	call   17edf00 <_Znwm@plt>
     10a4863:	48 89 c3             	mov    rbx,rax
     10a4866:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     10a486a:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     10a486f:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     10a4874:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     10a487b:	00 00 
     10a487d:	48 8d 05 4c 7d 7a 00 	lea    rax,[rip+0x7a7d4c]        # 184c5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8cb8>
     10a4884:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a4887:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     10a488b:	4c 89 f6             	mov    rsi,r14
     10a488e:	e8 0d 52 ad ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     10a4893:	48 89 e7             	mov    rdi,rsp
     10a4896:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     10a489a:	e8 2b 5a 9d ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     10a489f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a48a6:	00 00 
     10a48a8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     10a48ad:	75 2e                	jne    10a48dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bcf3>
     10a48af:	48 89 d8             	mov    rax,rbx
     10a48b2:	48 83 c4 28          	add    rsp,0x28
     10a48b6:	5b                   	pop    rbx
     10a48b7:	41 5e                	pop    r14
     10a48b9:	c3                   	ret
     10a48ba:	48 89 c3             	mov    rbx,rax
     10a48bd:	48 89 e7             	mov    rdi,rsp
     10a48c0:	e8 05 5a 9d ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>

### 0x10a48e6 -> 0x184c5d0 from 0x10a48e2..0x10a48fc
     10a48b9:	c3                   	ret
     10a48ba:	48 89 c3             	mov    rbx,rax
     10a48bd:	48 89 e7             	mov    rdi,rsp
     10a48c0:	e8 05 5a 9d ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     10a48c5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a48cc:	00 00 
     10a48ce:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     10a48d3:	75 08                	jne    10a48dd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bcf3>
     10a48d5:	48 89 df             	mov    rdi,rbx
     10a48d8:	e8 f3 b3 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10a48dd:	e8 ce b1 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a48e2:	48 8d 47 08          	lea    rax,[rdi+0x8]
     10a48e6:	48 8d 0d e3 7c 7a 00 	lea    rcx,[rip+0x7a7ce3]        # 184c5d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8cb8>
     10a48ed:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     10a48f0:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
     10a48f4:	48 89 c6             	mov    rsi,rax
     10a48f7:	e9 a4 51 ad ff       	jmp    b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     10a48fc:	53                   	push   rbx
     10a48fd:	48 83 ec 10          	sub    rsp,0x10
     10a4901:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a4908:	00 00 
     10a490a:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     10a490f:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     10a4913:	48 83 c7 10          	add    rdi,0x10
     10a4917:	e8 22 3a ac ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
     10a491c:	84 c0                	test   al,al
     10a491e:	75 11                	jne    10a4931 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bd47>
     10a4920:	48 83 c3 48          	add    rbx,0x48
     10a4924:	48 8d 74 24 07       	lea    rsi,[rsp+0x7]
     10a4929:	48 89 df             	mov    rdi,rbx
     10a492c:	e8 03 f0 c0 ff       	call   cb3934 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2008d4>
     10a4931:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0x10a4954 -> 0x184c588 from 0x10a4954..0x10a4967
     10a4929:	48 89 df             	mov    rdi,rbx
     10a492c:	e8 03 f0 c0 ff       	call   cb3934 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2008d4>
     10a4931:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a4938:	00 00 
     10a493a:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
     10a493f:	75 06                	jne    10a4947 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bd5d>
     10a4941:	48 83 c4 10          	add    rsp,0x10
     10a4945:	5b                   	pop    rbx
     10a4946:	c3                   	ret
     10a4947:	e8 64 b1 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a494c:	48 89 c7             	mov    rdi,rax
     10a494f:	e8 51 51 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a4954:	48 8d 05 2d 7c 7a 00 	lea    rax,[rip+0x7a7c2d]        # 184c588 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c70>
     10a495b:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a495e:	48 83 c7 10          	add    rdi,0x10
     10a4962:	e9 bf c1 9f ff       	jmp    aa0b26 <JNI_OnUnload@@Base+0x283f3>
     10a4967:	cc                   	int3
     10a4968:	53                   	push   rbx
     10a4969:	48 89 fb             	mov    rbx,rdi
     10a496c:	e8 e3 ff ff ff       	call   10a4954 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bd6a>
     10a4971:	48 89 df             	mov    rdi,rbx
     10a4974:	5b                   	pop    rbx
     10a4975:	e9 a6 95 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a497a:	41 56                	push   r14
     10a497c:	53                   	push   rbx
     10a497d:	48 83 ec 28          	sub    rsp,0x28
     10a4981:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a4988:	00 00 
     10a498a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a498f:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     10a4993:	6a 20                	push   0x20
     10a4995:	5f                   	pop    rdi

### 0x10a49b5 -> 0x184c588 from 0x10a497a..0x10a4a1a
     10a4988:	00 00 
     10a498a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a498f:	4c 8d 77 08          	lea    r14,[rdi+0x8]
     10a4993:	6a 20                	push   0x20
     10a4995:	5f                   	pop    rdi
     10a4996:	e8 65 95 74 00       	call   17edf00 <_Znwm@plt>
     10a499b:	48 89 c3             	mov    rbx,rax
     10a499e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
     10a49a2:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
     10a49a7:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     10a49ac:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
     10a49b3:	00 00 
     10a49b5:	48 8d 05 cc 7b 7a 00 	lea    rax,[rip+0x7a7bcc]        # 184c588 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c70>
     10a49bc:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a49bf:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
     10a49c3:	4c 89 f6             	mov    rsi,r14
     10a49c6:	e8 d5 50 ad ff       	call   b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     10a49cb:	48 89 e7             	mov    rdi,rsp
     10a49ce:	48 83 27 00          	and    QWORD PTR [rdi],0x0
     10a49d2:	e8 f3 58 9d ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     10a49d7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a49de:	00 00 
     10a49e0:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     10a49e5:	75 2e                	jne    10a4a15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26be2b>
     10a49e7:	48 89 d8             	mov    rax,rbx
     10a49ea:	48 83 c4 28          	add    rsp,0x28
     10a49ee:	5b                   	pop    rbx
     10a49ef:	41 5e                	pop    r14
     10a49f1:	c3                   	ret
     10a49f2:	48 89 c3             	mov    rbx,rax
     10a49f5:	48 89 e7             	mov    rdi,rsp
     10a49f8:	e8 cd 58 9d ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>

### 0x10a4a1e -> 0x184c588 from 0x10a4a1a..0x10a4a34
     10a49f1:	c3                   	ret
     10a49f2:	48 89 c3             	mov    rbx,rax
     10a49f5:	48 89 e7             	mov    rdi,rsp
     10a49f8:	e8 cd 58 9d ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
     10a49fd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a4a04:	00 00 
     10a4a06:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     10a4a0b:	75 08                	jne    10a4a15 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26be2b>
     10a4a0d:	48 89 df             	mov    rdi,rbx
     10a4a10:	e8 bb b2 9c ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     10a4a15:	e8 96 b0 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a4a1a:	48 8d 47 08          	lea    rax,[rdi+0x8]
     10a4a1e:	48 8d 0d 63 7b 7a 00 	lea    rcx,[rip+0x7a7b63]        # 184c588 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8c70>
     10a4a25:	48 89 0e             	mov    QWORD PTR [rsi],rcx
     10a4a28:	48 8d 7e 08          	lea    rdi,[rsi+0x8]
     10a4a2c:	48 89 c6             	mov    rsi,rax
     10a4a2f:	e9 6c 50 ad ff       	jmp    b79aa0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc6a40>
     10a4a34:	41 56                	push   r14
     10a4a36:	53                   	push   rbx
     10a4a37:	48 83 ec 48          	sub    rsp,0x48
     10a4a3b:	49 89 d6             	mov    r14,rdx
     10a4a3e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a4a45:	00 00 
     10a4a47:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
     10a4a4c:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
     10a4a50:	48 83 c7 10          	add    rdi,0x10
     10a4a54:	e8 e5 38 ac ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
     10a4a59:	84 c0                	test   al,al
     10a4a5b:	0f 85 92 00 00 00    	jne    10a4af3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26bf09>
     10a4a61:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     10a4a67:	48 8d 05 f2 59 7e 00 	lea    rax,[rip+0x7e59f2]        # 188a460 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3138>
     10a4a6e:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax

### 0x10a5831 -> 0x184c6e8 from 0x10a578a..0x10a5d2d
     10a57ff:	49 8b 6e 60          	mov    rbp,QWORD PTR [r14+0x60]
     10a5803:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
     10a580a:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     10a580f:	6a 40                	push   0x40
     10a5811:	5f                   	pop    rdi
     10a5812:	e8 e9 86 74 00       	call   17edf00 <_Znwm@plt>
     10a5817:	49 89 c5             	mov    r13,rax
     10a581a:	45 8a 77 11          	mov    r14b,BYTE PTR [r15+0x11]
     10a581e:	49 8b 8f 0c 01 00 00 	mov    rcx,QWORD PTR [r15+0x10c]
     10a5825:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
     10a582a:	49 89 c7             	mov    r15,rax
     10a582d:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
     10a5831:	48 8d 05 b0 6e 7a 00 	lea    rax,[rip+0x7a6eb0]        # 184c6e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8dd0>
     10a5838:	49 89 07             	mov    QWORD PTR [r15],rax
     10a583b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     10a583e:	48 89 df             	mov    rdi,rbx
     10a5841:	ff 50 30             	call   QWORD PTR [rax+0x30]
     10a5844:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
     10a5848:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
     10a584c:	49 8d 47 20          	lea    rax,[r15+0x20]
     10a5850:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a5855:	49 8d 47 28          	lea    rax,[r15+0x28]
     10a5859:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     10a585e:	49 83 c7 30          	add    r15,0x30
     10a5862:	0f 57 c0             	xorps  xmm0,xmm0
     10a5865:	41 0f 11 45 20       	movups XMMWORD PTR [r13+0x20],xmm0
     10a586a:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
     10a586f:	4c 89 ff             	mov    rdi,r15
     10a5872:	e8 7f 41 73 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
     10a5877:	45 84 f6             	test   r14b,r14b
     10a587a:	0f 84 f3 03 00 00    	je     10a5c73 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d089>
     10a5880:	48 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],rbp

### 0x10a58e3 -> 0x184c738 from 0x10a578a..0x10a5d2d
     10a58b3:	ff 50 28             	call   QWORD PTR [rax+0x28]
     10a58b6:	49 89 c4             	mov    r12,rax
     10a58b9:	bf b0 18 00 00       	mov    edi,0x18b0
     10a58be:	e8 3d 86 74 00       	call   17edf00 <_Znwm@plt>
     10a58c3:	48 89 c5             	mov    rbp,rax
     10a58c6:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
     10a58cb:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     10a58d0:	49 8b 46 68          	mov    rax,QWORD PTR [r14+0x68]
     10a58d4:	48 85 c0             	test   rax,rax
     10a58d7:	74 05                	je     10a58de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ccf4>
     10a58d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10a58de:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     10a58e3:	48 8d 05 4e 6e 7a 00 	lea    rax,[rip+0x7a6e4e]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>
     10a58ea:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     10a58ee:	48 8d 05 63 6f 7a 00 	lea    rax,[rip+0x7a6f63]        # 184c858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f40>
     10a58f5:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     10a58f9:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     10a58fe:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     10a5902:	48 89 5d 18          	mov    QWORD PTR [rbp+0x18],rbx
     10a5906:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     10a590b:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     10a590f:	4c 89 7d 28          	mov    QWORD PTR [rbp+0x28],r15
     10a5913:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     10a5918:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
     10a591c:	48 8d 7d 38          	lea    rdi,[rbp+0x38]
     10a5920:	e8 c7 06 00 00       	call   10a5fec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d402>
     10a5925:	48 8b 5d 18          	mov    rbx,QWORD PTR [rbp+0x18]
     10a5929:	4c 8d 44 24 68       	lea    r8,[rsp+0x68]
     10a592e:	49 89 28             	mov    QWORD PTR [r8],rbp
     10a5931:	48 8d 35 59 77 9f ff 	lea    rsi,[rip+0xffffffffff9f7759]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     10a5938:	48 8d 0d 91 07 00 00 	lea    rcx,[rip+0x791]        # 10a60d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d4e6>
     10a593f:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]

### 0x10a58ee -> 0x184c858 from 0x10a578a..0x10a5d2d
     10a58b9:	bf b0 18 00 00       	mov    edi,0x18b0
     10a58be:	e8 3d 86 74 00       	call   17edf00 <_Znwm@plt>
     10a58c3:	48 89 c5             	mov    rbp,rax
     10a58c6:	41 0f 28 46 60       	movaps xmm0,XMMWORD PTR [r14+0x60]
     10a58cb:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     10a58d0:	49 8b 46 68          	mov    rax,QWORD PTR [r14+0x68]
     10a58d4:	48 85 c0             	test   rax,rax
     10a58d7:	74 05                	je     10a58de <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ccf4>
     10a58d9:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
     10a58de:	4c 89 64 24 08       	mov    QWORD PTR [rsp+0x8],r12
     10a58e3:	48 8d 05 4e 6e 7a 00 	lea    rax,[rip+0x7a6e4e]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>
     10a58ea:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
     10a58ee:	48 8d 05 63 6f 7a 00 	lea    rax,[rip+0x7a6f63]        # 184c858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f40>
     10a58f5:	48 89 45 08          	mov    QWORD PTR [rbp+0x8],rax
     10a58f9:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
     10a58fe:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
     10a5902:	48 89 5d 18          	mov    QWORD PTR [rbp+0x18],rbx
     10a5906:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
     10a590b:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
     10a590f:	4c 89 7d 28          	mov    QWORD PTR [rbp+0x28],r15
     10a5913:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
     10a5918:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
     10a591c:	48 8d 7d 38          	lea    rdi,[rbp+0x38]
     10a5920:	e8 c7 06 00 00       	call   10a5fec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d402>
     10a5925:	48 8b 5d 18          	mov    rbx,QWORD PTR [rbp+0x18]
     10a5929:	4c 8d 44 24 68       	lea    r8,[rsp+0x68]
     10a592e:	49 89 28             	mov    QWORD PTR [r8],rbp
     10a5931:	48 8d 35 59 77 9f ff 	lea    rsi,[rip+0xffffffffff9f7759]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     10a5938:	48 8d 0d 91 07 00 00 	lea    rcx,[rip+0x791]        # 10a60d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d4e6>
     10a593f:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
     10a5944:	6a 08                	push   0x8
     10a5946:	41 59                	pop    r9

### 0x10a5c7b -> 0x184c8f8 from 0x10a578a..0x10a5d2d
     10a5c50:	ff 50 10             	call   QWORD PTR [rax+0x10]
     10a5c53:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     10a5c58:	4c 89 f6             	mov    rsi,r14
     10a5c5b:	e8 92 3f 73 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     10a5c60:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     10a5c64:	e8 1d 88 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a5c69:	48 89 df             	mov    rdi,rbx
     10a5c6c:	e8 77 4b 73 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     10a5c71:	eb 28                	jmp    10a5c9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d0b1>
     10a5c73:	6a 08                	push   0x8
     10a5c75:	5f                   	pop    rdi
     10a5c76:	e8 85 82 74 00       	call   17edf00 <_Znwm@plt>
     10a5c7b:	48 8d 0d 76 6c 7a 00 	lea    rcx,[rip+0x7a6c76]        # 184c8f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8fe0>
     10a5c82:	48 89 08             	mov    QWORD PTR [rax],rcx
     10a5c85:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
     10a5c8a:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
     10a5c8d:	48 89 01             	mov    QWORD PTR [rcx],rax
     10a5c90:	48 85 ff             	test   rdi,rdi
     10a5c93:	74 06                	je     10a5c9b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d0b1>
     10a5c95:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a5c98:	ff 50 08             	call   QWORD PTR [rax+0x8]
     10a5c9b:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
     10a5ca0:	4c 89 28             	mov    QWORD PTR [rax],r13
     10a5ca3:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     10a5caa:	00 00 
     10a5cac:	48 3b 8c 24 c0 00 00 	cmp    rcx,QWORD PTR [rsp+0xc0]
     10a5cb3:	00 
     10a5cb4:	75 72                	jne    10a5d28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d13e>
     10a5cb6:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
     10a5cbd:	5b                   	pop    rbx
     10a5cbe:	41 5c                	pop    r12
     10a5cc0:	41 5d                	pop    r13

### 0x10a5de0 -> 0x184c6e8 from 0x10a5ddc..0x10a5e09
     10a5dc4:	48 89 c7             	mov    rdi,rax
     10a5dc7:	e8 76 e2 a8 ff       	call   b34042 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80fe2>
     10a5dcc:	84 c0                	test   al,al
     10a5dce:	74 09                	je     10a5dd9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d1ef>
     10a5dd0:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
     10a5dd3:	5b                   	pop    rbx
     10a5dd4:	e9 7f ff ff ff       	jmp    10a5d58 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d16e>
     10a5dd9:	5b                   	pop    rbx
     10a5dda:	c3                   	ret
     10a5ddb:	cc                   	int3
     10a5ddc:	53                   	push   rbx
     10a5ddd:	48 89 fb             	mov    rbx,rdi
     10a5de0:	48 8d 05 01 69 7a 00 	lea    rax,[rip+0x7a6901]        # 184c6e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8dd0>
     10a5de7:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a5dea:	48 83 c7 30          	add    rdi,0x30
     10a5dee:	e8 e1 3d 73 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     10a5df3:	48 8d 7b 28          	lea    rdi,[rbx+0x28]
     10a5df7:	e8 2c 40 9d ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
     10a5dfc:	48 83 c3 20          	add    rbx,0x20
     10a5e00:	48 89 df             	mov    rdi,rbx
     10a5e03:	5b                   	pop    rbx
     10a5e04:	e9 1f 40 9d ff       	jmp    a79e28 <JNI_OnUnload@@Base+0x16f5>
     10a5e09:	cc                   	int3
     10a5e0a:	53                   	push   rbx
     10a5e0b:	48 89 fb             	mov    rbx,rdi
     10a5e0e:	e8 c9 ff ff ff       	call   10a5ddc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d1f2>
     10a5e13:	48 89 df             	mov    rdi,rbx
     10a5e16:	5b                   	pop    rbx
     10a5e17:	e9 04 81 74 00       	jmp    17edf20 <_ZdlPv@plt>
     10a5e1c:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     10a5e20:	48 85 c0             	test   rax,rax
     10a5e23:	75 04                	jne    10a5e29 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d23f>

### 0x10a8816 -> 0x184c738 from 0x10a8812..0x10a88e0
     10a87e6:	0f 57 c0             	xorps  xmm0,xmm0
     10a87e9:	0f 11 47 78          	movups XMMWORD PTR [rdi+0x78],xmm0
     10a87ed:	0f 11 87 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm0
     10a87f4:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     10a87fb:	00 
     10a87fc:	0f 11 87 98 00 00 00 	movups XMMWORD PTR [rdi+0x98],xmm0
     10a8803:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
     10a880a:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
     10a880e:	88 47 58             	mov    BYTE PTR [rdi+0x58],al
     10a8811:	c3                   	ret
     10a8812:	53                   	push   rbx
     10a8813:	48 89 fb             	mov    rbx,rdi
     10a8816:	48 8d 05 1b 3f 7a 00 	lea    rax,[rip+0x7a3f1b]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>
     10a881d:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a8820:	48 8d 05 31 40 7a 00 	lea    rax,[rip+0x7a4031]        # 184c858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f40>
     10a8827:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     10a882b:	48 81 c7 a0 18 00 00 	add    rdi,0x18a0
     10a8832:	e8 9d 13 73 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     10a8837:	48 8b bb 98 18 00 00 	mov    rdi,QWORD PTR [rbx+0x1898]
     10a883e:	e8 43 5c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a8843:	48 8b bb 88 18 00 00 	mov    rdi,QWORD PTR [rbx+0x1888]
     10a884a:	e8 37 5c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a884f:	48 8d bb 60 18 00 00 	lea    rdi,[rbx+0x1860]
     10a8856:	e8 d5 e4 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     10a885b:	48 8b bb 50 18 00 00 	mov    rdi,QWORD PTR [rbx+0x1850]
     10a8862:	e8 1f 5c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a8867:	48 8d bb 38 18 00 00 	lea    rdi,[rbx+0x1838]
     10a886e:	e8 61 13 73 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     10a8873:	48 8d bb 58 14 00 00 	lea    rdi,[rbx+0x1458]
     10a887a:	e8 85 c7 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
     10a887f:	48 8d bb 90 10 00 00 	lea    rdi,[rbx+0x1090]
     10a8886:	e8 79 c7 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>

### 0x10a8820 -> 0x184c858 from 0x10a8812..0x10a88e0
     10a87ed:	0f 11 87 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm0
     10a87f4:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
     10a87fb:	00 
     10a87fc:	0f 11 87 98 00 00 00 	movups XMMWORD PTR [rdi+0x98],xmm0
     10a8803:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
     10a880a:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
     10a880e:	88 47 58             	mov    BYTE PTR [rdi+0x58],al
     10a8811:	c3                   	ret
     10a8812:	53                   	push   rbx
     10a8813:	48 89 fb             	mov    rbx,rdi
     10a8816:	48 8d 05 1b 3f 7a 00 	lea    rax,[rip+0x7a3f1b]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>
     10a881d:	48 89 07             	mov    QWORD PTR [rdi],rax
     10a8820:	48 8d 05 31 40 7a 00 	lea    rax,[rip+0x7a4031]        # 184c858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8f40>
     10a8827:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
     10a882b:	48 81 c7 a0 18 00 00 	add    rdi,0x18a0
     10a8832:	e8 9d 13 73 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     10a8837:	48 8b bb 98 18 00 00 	mov    rdi,QWORD PTR [rbx+0x1898]
     10a883e:	e8 43 5c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a8843:	48 8b bb 88 18 00 00 	mov    rdi,QWORD PTR [rbx+0x1888]
     10a884a:	e8 37 5c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a884f:	48 8d bb 60 18 00 00 	lea    rdi,[rbx+0x1860]
     10a8856:	e8 d5 e4 9f ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     10a885b:	48 8b bb 50 18 00 00 	mov    rdi,QWORD PTR [rbx+0x1850]
     10a8862:	e8 1f 5c 9f ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     10a8867:	48 8d bb 38 18 00 00 	lea    rdi,[rbx+0x1838]
     10a886e:	e8 61 13 73 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
     10a8873:	48 8d bb 58 14 00 00 	lea    rdi,[rbx+0x1458]
     10a887a:	e8 85 c7 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
     10a887f:	48 8d bb 90 10 00 00 	lea    rdi,[rbx+0x1090]
     10a8886:	e8 79 c7 c4 ff       	call   cf5004 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x241fa4>
     10a888b:	48 8d bb 38 10 00 00 	lea    rdi,[rbx+0x1038]
     10a8892:	e8 cf 15 73 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>

### 0x1299ec7 -> 0x184c4b0 from 0x1298d86..0x129a87b
     1299e99:	c6 45 40 01          	mov    BYTE PTR [rbp+0x40],0x1
     1299e9d:	88 5d 41             	mov    BYTE PTR [rbp+0x41],bl
     1299ea0:	c6 45 42 00          	mov    BYTE PTR [rbp+0x42],0x0
     1299ea4:	4c 89 75 48          	mov    QWORD PTR [rbp+0x48],r14
     1299ea8:	f3 0f 7f 4d 50       	movdqu XMMWORD PTR [rbp+0x50],xmm1
     1299ead:	6a 60                	push   0x60
     1299eaf:	5f                   	pop    rdi
     1299eb0:	66 0f 7f 4c 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm1
     1299eb6:	e8 45 40 55 00       	call   17edf00 <_Znwm@plt>
     1299ebb:	48 89 c3             	mov    rbx,rax
     1299ebe:	66 0f ef c0          	pxor   xmm0,xmm0
     1299ec2:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
     1299ec7:	48 8d 05 e2 25 5b 00 	lea    rax,[rip+0x5b25e2]        # 184c4b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8b98>
     1299ece:	48 89 03             	mov    QWORD PTR [rbx],rax
     1299ed1:	48 89 d8             	mov    rax,rbx
     1299ed4:	48 83 c0 18          	add    rax,0x18
     1299ed8:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0
     1299edd:	f3 0f 7f 43 18       	movdqu XMMWORD PTR [rbx+0x18],xmm0
     1299ee2:	f3 0f 7f 43 28       	movdqu XMMWORD PTR [rbx+0x28],xmm0
     1299ee7:	c7 43 38 00 00 80 3f 	mov    DWORD PTR [rbx+0x38],0x3f800000
     1299eee:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
     1299ef3:	48 89 45 60          	mov    QWORD PTR [rbp+0x60],rax
     1299ef7:	48 89 5d 68          	mov    QWORD PTR [rbp+0x68],rbx
     1299efb:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
     1299f00:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
     1299f05:	4c 8d 75 18          	lea    r14,[rbp+0x18]
     1299f09:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
     1299f0d:	48 89 5b 50          	mov    QWORD PTR [rbx+0x50],rbx
     1299f11:	45 31 ff             	xor    r15d,r15d
     1299f14:	31 ff                	xor    edi,edi
     1299f16:	e8 97 45 80 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1299f1b:	48 89 df             	mov    rdi,rbx

## Candidate owner/constructor functions

### 0xb5f6f7..0xb6218e
Callback-table refs: 0xb60c3d->0x184c6a8
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x109917a..0x1099d71
Callback-table refs: 0x109935d->0x184c360, 0x1099416->0x184c3d8, 0x1099430->0x184c420, 0x1099608->0x184c468, 0x10996ff->0x184c4b0, 0x1099970->0x184c670
Touches >=0x1400-like fields: False
Relevant object-field accesses:
     1099801:	4d 8d b5 70 04 00 00 	lea    r14,[r13+0x470]
Printable strings:
- 0x1099311: cpp-recently_played-recently_played_setup_impl
- 0x1099757: recently_played

### 0x109f84e..0x109f89d
Callback-table refs: 0x109f872->0x184c250
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x109f8e0..0x109f930
Callback-table refs: 0x109f904->0x184c210
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a1152..0x10a1183
Callback-table refs: 0x10a1159->0x184c250
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a127e..0x10a12b0
Callback-table refs: 0x10a1285->0x184c210
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a1674..0x10a1683
Callback-table refs: 0x10a1674->0x184c4b0
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a16c4..0x10a16e4
Callback-table refs: 0x10a16d0->0x184c468
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a16e4..0x10a16f7
Callback-table refs: 0x10a16e4->0x184c468
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a170c..0x10a172c
Callback-table refs: 0x10a1718->0x184c420
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a172c..0x10a173f
Callback-table refs: 0x10a172c->0x184c420
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a1838..0x10a1858
Callback-table refs: 0x10a1844->0x184c3d8
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a1858..0x10a186b
Callback-table refs: 0x10a1858->0x184c3d8
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a186c..0x10a1b62
Callback-table refs: 0x10a19d6->0x184c640
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a2082..0x10a2130
Callback-table refs: 0x10a2086->0x184c360
Touches >=0x1400-like fields: False
Relevant object-field accesses:
     10a209c:	48 8d bb 70 04 00 00 	lea    rdi,[rbx+0x470]
Printable strings:
- none

### 0x10a229e..0x10a2bc4
Callback-table refs: 0x10a2322->0x184c528, 0x10a2340->0x184c618, 0x10a248a->0x184c4e8
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- 0x10a239a: recently-played/v3/recently-played?limit=50&filter=default,collection-new-episodes

### 0x10a3c3a..0x10a3c8c
Callback-table refs: 0x10a3c42->0x184c4e8
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a3c9e..0x10a3cb1
Callback-table refs: 0x10a3c9e->0x184c508
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a443c..0x10a4460
Callback-table refs: 0x10a4440->0x184c558
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a4460..0x10a446f
Callback-table refs: 0x10a4460->0x184c618
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a44d0..0x10a44f5
Callback-table refs: 0x10a44d4->0x184c528
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a4508..0x10a481c
Callback-table refs: 0x10a461f->0x184c588, 0x10a46a2->0x184c5d0
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a481c..0x10a482f
Callback-table refs: 0x10a481c->0x184c5d0
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a4842..0x10a48e2
Callback-table refs: 0x10a487d->0x184c5d0
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a48e2..0x10a48fc
Callback-table refs: 0x10a48e6->0x184c5d0
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a4954..0x10a4967
Callback-table refs: 0x10a4954->0x184c588
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a497a..0x10a4a1a
Callback-table refs: 0x10a49b5->0x184c588
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a4a1a..0x10a4a34
Callback-table refs: 0x10a4a1e->0x184c588
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a578a..0x10a5d2d
Callback-table refs: 0x10a5831->0x184c6e8, 0x10a58e3->0x184c738, 0x10a58ee->0x184c858, 0x10a5c7b->0x184c8f8
Touches >=0x1400-like fields: True
Relevant object-field accesses:
     10a5b36:	66 83 a5 58 18 00 00 	and    WORD PTR [rbp+0x1858],0x0
     10a5b58:	48 89 9d 90 18 00 00 	mov    QWORD PTR [rbp+0x1890],rbx
     10a5b74:	48 8b 9d 90 18 00 00 	mov    rbx,QWORD PTR [rbp+0x1890]
Printable strings:
- none

### 0x10a5ddc..0x10a5e09
Callback-table refs: 0x10a5de0->0x184c6e8
Touches >=0x1400-like fields: False
Relevant object-field accesses:
Printable strings:
- none

### 0x10a8812..0x10a88e0
Callback-table refs: 0x10a8816->0x184c738, 0x10a8820->0x184c858
Touches >=0x1400-like fields: True
Relevant object-field accesses:
Printable strings:
- none

### 0x1298d86..0x129a87b
Callback-table refs: 0x1299ec7->0x184c4b0
Touches >=0x1400-like fields: False
Relevant object-field accesses:
     1299d1a:	40 8a b4 24 70 04 00 	mov    sil,BYTE PTR [rsp+0x470]
Printable strings:
- none

## Potential Itanium vtable/typeinfo headers

### address-point candidate 0x184c210
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c250
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c360
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c3d8
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c420
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c468
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c4b0
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c4e8
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c508
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c528
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c558
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c588
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c5d0
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c618
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c640
- offset-to-top raw: 0
- typeinfo candidate: 0xa50370
- type-name pointer candidate: 0xcccccccccccccccc
- type-name: None

### address-point candidate 0x184c670
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c6a8
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c6e8
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c738
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c858
- offset-to-top raw: -8
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

### address-point candidate 0x184c8f8
- offset-to-top raw: 0
- typeinfo candidate: 0x0
- type-name pointer candidate: 0x0
- type-name: None

## Known restriction owner methods

- 0x10a6464..0x10a7f52: restriction builder
- 0x10a9668..0x10a969c: event subtype-6 handler then restriction rebuild
- object fields include +0x470, +0x598, +0x14a0, +0x1858, +0x1890
