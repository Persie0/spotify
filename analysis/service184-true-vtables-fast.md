# Fast structurally valid service184 vtable ranking

- candidates after structural + ABI filters: 1561

## rank 1: score=134 AP=0x1897a28 offset_to_top=0 typeinfo=0x0 direct_refs=10
- +0x28=0x1661d88 ['compact', 'pointer-field']
- +0x30=0x1661da6 ['compact', 'pointer-field']
- +0x38=0x1661dc4 ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x1661bd4 FDE=(23469012, 23469161)
- +0x18: 0x16647e6 FDE=(23480294, 23480383)
- +0x20: 0x1661d6e FDE=(23469422, 23469447)
- +0x28: 0x1661d88 FDE=(23469448, 23469478)
- +0x30: 0x1661da6 FDE=(23469478, 23469508)
- +0x38: 0x1661dc4 FDE=(23469508, 23469538)
- +0x40: 0x1661de2 FDE=(23469538, 23469554)
- +0x48: 0x1661c6a FDE=(23469162, 23469178)
- +0x50: 0x1661c8a FDE=(23469194, 23469202)
- +0x58: 0xa3fa60 FDE=(10746464, 10746467)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x1661c9a FDE=(23469210, 23469269)
- +0x70: 0x1661ce0 FDE=(23469280, 23469351)
- +0x78: 0x1661d3a FDE=(23469370, 23469412)
### +0x28 body
     1661d88:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     1661d8c:	48 8b 80 38 01 00 00 	mov    rax,QWORD PTR [rax+0x138]
     1661d93:	48 85 c0             	test   rax,rax
     1661d96:	48 8d 0d 13 dc 36 00 	lea    rcx,[rip+0x36dc13]        # 19cf9b0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x985f8>
     1661d9d:	48 0f 45 c8          	cmovne rcx,rax
     1661da1:	0f b7 41 18          	movzx  eax,WORD PTR [rcx+0x18]
     1661da5:	c3                   	ret
### +0x30 body
     1661da6:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     1661daa:	48 8b 80 38 01 00 00 	mov    rax,QWORD PTR [rax+0x138]
     1661db1:	48 85 c0             	test   rax,rax
     1661db4:	48 8d 0d f5 db 36 00 	lea    rcx,[rip+0x36dbf5]        # 19cf9b0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x985f8>
     1661dbb:	48 0f 45 c8          	cmovne rcx,rax
     1661dbf:	0f b7 41 1c          	movzx  eax,WORD PTR [rcx+0x1c]
     1661dc3:	c3                   	ret
### +0x38 body
     1661dc4:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
     1661dc8:	48 8b 80 38 01 00 00 	mov    rax,QWORD PTR [rax+0x138]
     1661dcf:	48 85 c0             	test   rax,rax
     1661dd2:	48 8d 0d d7 db 36 00 	lea    rcx,[rip+0x36dbd7]        # 19cf9b0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x985f8>
     1661dd9:	48 0f 45 c8          	cmovne rcx,rax
     1661ddd:	0f b7 41 20          	movzx  eax,WORD PTR [rcx+0x20]
     1661de1:	c3                   	ret
### AP materializations
      c19470:	48 8d 05 b1 e5 c7 00 	lea    rax,[rip+0xc7e5b1]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
      c1ce96:	48 8d 05 8b ab c7 00 	lea    rax,[rip+0xc7ab8b]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
     109bdea:	48 8d 05 37 bc 7f 00 	lea    rax,[rip+0x7fbc37]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
     1195b2a:	48 8d 05 f7 1e 70 00 	lea    rax,[rip+0x701ef7]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
     131bae6:	48 8d 05 3b bf 57 00 	lea    rax,[rip+0x57bf3b]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
     131be7a:	48 8d 05 a7 bb 57 00 	lea    rax,[rip+0x57bba7]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
     131c4b9:	48 8d 05 68 b5 57 00 	lea    rax,[rip+0x57b568]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
     134587a:	48 8d 05 a7 21 55 00 	lea    rax,[rip+0x5521a7]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
     164813b:	4c 8d 15 e6 f8 24 00 	lea    r10,[rip+0x24f8e6]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>
     1663873:	48 8d 15 ae 41 23 00 	lea    rdx,[rip+0x2341ae]        # 1897a28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4968>

## rank 2: score=134 AP=0x1896b28 offset_to_top=0 typeinfo=0x0 direct_refs=9
- +0x28=0x16612ca ['compact', 'pointer-field']
- +0x30=0x16612e8 ['compact', 'pointer-field']
- +0x38=0x1661306 ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x16612ae FDE=(23466670, 23466688)
- +0x18: 0x16647e6 FDE=(23480294, 23480383)
- +0x20: 0x16612c0 FDE=(23466688, 23466697)
- +0x28: 0x16612ca FDE=(23466698, 23466728)
- +0x30: 0x16612e8 FDE=(23466728, 23466758)
- +0x38: 0x1661306 FDE=(23466758, 23466788)
- +0x40: 0x1661324 FDE=(23466788, 23466799)
- +0x48: 0x1661330 FDE=(23466800, 23466816)
- +0x50: 0x1661340 FDE=(23466816, 23466824)
- +0x58: 0x1661348 FDE=(23466824, 23466882)
- +0x60: 0x1661382 FDE=(23466882, 23466893)
- +0x68: 0x166138e FDE=(23466894, 23466938)
- +0x70: 0x16613ba FDE=(23466938, 23467064)
- +0x78: 0x1661438 FDE=(23467064, 23467193)
### +0x28 body
     16612ca:	48 8b 47 48          	mov    rax,QWORD PTR [rdi+0x48]
     16612ce:	48 8b 80 38 01 00 00 	mov    rax,QWORD PTR [rax+0x138]
     16612d5:	48 85 c0             	test   rax,rax
     16612d8:	48 8d 0d d1 e6 36 00 	lea    rcx,[rip+0x36e6d1]        # 19cf9b0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x985f8>
     16612df:	48 0f 45 c8          	cmovne rcx,rax
     16612e3:	0f b7 41 18          	movzx  eax,WORD PTR [rcx+0x18]
     16612e7:	c3                   	ret
### +0x30 body
     16612e8:	48 8b 47 48          	mov    rax,QWORD PTR [rdi+0x48]
     16612ec:	48 8b 80 38 01 00 00 	mov    rax,QWORD PTR [rax+0x138]
     16612f3:	48 85 c0             	test   rax,rax
     16612f6:	48 8d 0d b3 e6 36 00 	lea    rcx,[rip+0x36e6b3]        # 19cf9b0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x985f8>
     16612fd:	48 0f 45 c8          	cmovne rcx,rax
     1661301:	0f b7 41 1c          	movzx  eax,WORD PTR [rcx+0x1c]
     1661305:	c3                   	ret
### +0x38 body
     1661306:	48 8b 47 48          	mov    rax,QWORD PTR [rdi+0x48]
     166130a:	48 8b 80 38 01 00 00 	mov    rax,QWORD PTR [rax+0x138]
     1661311:	48 85 c0             	test   rax,rax
     1661314:	48 8d 0d 95 e6 36 00 	lea    rcx,[rip+0x36e695]        # 19cf9b0 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x985f8>
     166131b:	48 0f 45 c8          	cmovne rcx,rax
     166131f:	0f b7 41 20          	movzx  eax,WORD PTR [rcx+0x20]
     1661323:	c3                   	ret
### AP materializations
      c19427:	48 8d 05 fa d6 c7 00 	lea    rax,[rip+0xc7d6fa]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
      c1ce4d:	48 8d 05 d4 9c c7 00 	lea    rax,[rip+0xc79cd4]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     109bda1:	48 8d 05 80 ad 7f 00 	lea    rax,[rip+0x7fad80]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     1195ae6:	48 8d 05 3b 10 70 00 	lea    rax,[rip+0x70103b]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     131baa0:	48 8d 05 81 b0 57 00 	lea    rax,[rip+0x57b081]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     131be37:	48 8d 05 ea ac 57 00 	lea    rax,[rip+0x57acea]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     131c475:	48 8d 05 ac a6 57 00 	lea    rax,[rip+0x57a6ac]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     1345839:	48 8d 05 e8 12 55 00 	lea    rax,[rip+0x5512e8]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>
     1648178:	4c 8d 25 a9 e9 24 00 	lea    r12,[rip+0x24e9a9]        # 1896b28 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3a68>

## rank 3: score=132 AP=0x1867b28 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xb00302 ['compact', 'this-relative-pointer']
- +0x30=0x11ca6fe ['compact', 'this-relative-pointer']
- +0x38=0x135c758 ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0x135c70c FDE=(20301580, 20301637)
- +0x8: 0x135c746 FDE=(20301638, 20301656)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xb00302 FDE=(11535106, 11535111)
- +0x30: 0x11ca6fe FDE=(18654974, 18654982)
- +0x38: 0x135c758 FDE=(20301656, 20301681)
- +0x40: 0x10d4edc FDE=(17649372, 17649397)
- +0x48: 0xbf7896 FDE=(12548246, 12548251)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x135c5b0 FDE=(20301232, 20301251)
- +0x68: 0x135c5c4 FDE=(20301252, 20301270)
- +0x70: 0x135c5d6 FDE=(20301270, 20301322)
- +0x78: 0x135c60a FDE=(20301322, 20301348)
### +0x28 body
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret
### +0x30 body
     11ca6fe:	48 8d 87 d0 00 00 00 	lea    rax,[rdi+0xd0]
     11ca705:	c3                   	ret
### +0x38 body
     135c758:	48 89 f8             	mov    rax,rdi
     135c75b:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]
     135c75f:	0f 28 46 40          	movaps xmm0,XMMWORD PTR [rsi+0x40]
     135c763:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     135c766:	48 85 c9             	test   rcx,rcx
     135c769:	74 05                	je     135c770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1cf4>
     135c76b:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     135c770:	c3                   	ret
### AP materializations
     135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
     135c710:	48 8d 05 11 b4 50 00 	lea    rax,[rip+0x50b411]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>

## rank 4: score=132 AP=0x184c738 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x10a8da4 ['compact', 'this-relative-pointer']
- +0x30=0x10a8dac ['compact', 'this-relative-pointer']
- +0x38=0x10a8db4 ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0x10a8812 FDE=(17467410, 17467616)
- +0x8: 0x10a88e0 FDE=(17467616, 17467634)
- +0x10: 0x10a88f2 FDE=(17467634, 17467830)
- +0x18: 0x10a89b6 FDE=(17467830, 17468077)
- +0x20: 0x10a8aae FDE=(17468078, 17468836)
- +0x28: 0x10a8da4 FDE=(17468836, 17468844)
- +0x30: 0x10a8dac FDE=(17468844, 17468852)
- +0x38: 0x10a8db4 FDE=(17468852, 17469101)
- +0x40: 0x10a8eae FDE=(17469102, 17469131)
- +0x48: 0x10a8ecc FDE=(17469132, 17469285)
- +0x50: 0x10a8f66 FDE=(17469286, 17469315)
- +0x58: 0x10a8f84 FDE=(17469316, 17469753)
- +0x60: 0x10a913a FDE=(17469754, 17470103)
- +0x68: 0x10a9298 FDE=(17470104, 17470133)
- +0x70: 0x10a92b6 FDE=(17470134, 17470163)
- +0x78: 0x10a92d4 FDE=(17470164, 17470193)
### +0x28 body
     10a8da4:	48 8d 87 90 10 00 00 	lea    rax,[rdi+0x1090]
     10a8dab:	c3                   	ret
### +0x30 body
     10a8dac:	48 8d 87 58 14 00 00 	lea    rax,[rdi+0x1458]
     10a8db3:	c3                   	ret
### +0x38 body
     10a8db4:	41 57                	push   r15
     10a8db6:	41 56                	push   r14
     10a8db8:	53                   	push   rbx
     10a8db9:	48 83 ec 50          	sub    rsp,0x50
     10a8dbd:	49 89 d7             	mov    r15,rdx
     10a8dc0:	49 89 f6             	mov    r14,rsi
     10a8dc3:	48 89 fb             	mov    rbx,rdi
     10a8dc6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a8dcd:	00 00 
     10a8dcf:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     10a8dd4:	48 8b 7e 28          	mov    rdi,QWORD PTR [rsi+0x28]
     10a8dd8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10a8ddb:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
     10a8de1:	84 c0                	test   al,al
     10a8de3:	74 13                	je     10a8df8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x27020e>
     10a8de5:	48 8d 43 08          	lea    rax,[rbx+0x8]
     10a8de9:	0f 57 c0             	xorps  xmm0,xmm0
     10a8dec:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
     10a8df0:	48 89 03             	mov    QWORD PTR [rbx],rax
     10a8df3:	e9 8b 00 00 00       	jmp    10a8e83 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270299>
     10a8df8:	49 8d be e8 05 00 00 	lea    rdi,[r14+0x5e8]
     10a8dff:	4c 89 fe             	mov    rsi,r15
     10a8e02:	e8 e7 68 9f ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     10a8e07:	84 c0                	test   al,al
     10a8e09:	74 da                	je     10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e0b:	41 80 7e 38 00       	cmp    BYTE PTR [r14+0x38],0x0
     10a8e10:	75 d3                	jne    10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e12:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a8e19:	00 
     10a8e1a:	74 c9                	je     10a8de5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2701fb>
     10a8e1c:	48 8d 44 24 38       	lea    rax,[rsp+0x38]
     10a8e21:	0f 57 c0             	xorps  xmm0,xmm0
     10a8e24:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10a8e27:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     10a8e2b:	48 8d 35 74 30 28 ff 	lea    rsi,[rip+0xffffffffff283074]        # 32bea6 <_ZTSSt12bad_any_cast@@Base-0x64322>
     10a8e32:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a8e37:	e8 42 0c 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a8e3c:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     10a8e41:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     10a8e46:	e8 45 4c d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a8e4b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     10a8e50:	e8 3b 50 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a8e55:	48 89 e7             	mov    rdi,rsp
     10a8e58:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     10a8e5d:	e8 22 09 aa ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     10a8e62:	49 89 e6             	mov    r14,rsp
     10a8e65:	48 89 df             	mov    rdi,rbx
     10a8e68:	4c 89 f6             	mov    rsi,r14
     10a8e6b:	e8 ca 08 00 00       	call   10a973a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270b50>
     10a8e70:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     10a8e74:	e8 6d af a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a8e79:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
     10a8e7e:	e8 63 af a8 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     10a8e83:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a8e8a:	00 00 
     10a8e8c:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     10a8e91:	75 0d                	jne    10a8ea0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2702b6>
     10a8e93:	48 89 d8             	mov    rax,rbx
     10a8e96:	48 83 c4 50          	add    rsp,0x50
     10a8e9a:	5b                   	pop    rbx
     10a8e9b:	41 5e                	pop    r14
     10a8e9d:	41 5f                	pop    r15
     10a8e9f:	c3                   	ret
     10a8ea0:	e8 0b 6c 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a8ea5:	48 89 c7             	mov    rdi,rax
     10a8ea8:	e8 f8 0b 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
### AP materializations
     10a58e3:	48 8d 05 4e 6e 7a 00 	lea    rax,[rip+0x7a6e4e]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>
     10a8816:	48 8d 05 1b 3f 7a 00 	lea    rax,[rip+0x7a3f1b]        # 184c738 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x8e20>

## rank 5: score=132 AP=0x181d2d0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xc94fd2 ['compact', 'pointer-field']
- +0x30=0xc072a2 ['compact', 'pointer-field']
- +0x38=0xc94fda ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0xc94f22 FDE=(13192994, 13193111)
- +0x8: 0xc94f98 FDE=(13193112, 13193130)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xc94faa FDE=(13193130, 13193169)
- +0x28: 0xc94fd2 FDE=(13193170, 13193178)
- +0x30: 0xc072a2 FDE=(12612258, 12612266)
- +0x38: 0xc94fda FDE=(13193178, 13193554)
- +0x40: 0xc95152 FDE=(13193554, 13193686)
- +0x48: 0xc951d6 FDE=(13193686, 13194910)
- +0x50: 0xc9569e FDE=(13194910, 13194922)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xc94ef6 FDE=(13192950, 13192965)
- +0x70: 0xc94f06 FDE=(13192966, 13192984)
- +0x78: 0xc94f18 FDE=(13192984, 13192993)
### +0x28 body
      c94fd2:	48 8b 87 98 00 00 00 	mov    rax,QWORD PTR [rdi+0x98]
      c94fd9:	c3                   	ret
### +0x30 body
      c072a2:	48 8b 87 c0 00 00 00 	mov    rax,QWORD PTR [rdi+0xc0]
      c072a9:	c3                   	ret
### +0x38 body
      c94fda:	55                   	push   rbp
      c94fdb:	41 57                	push   r15
      c94fdd:	41 56                	push   r14
      c94fdf:	41 55                	push   r13
      c94fe1:	41 54                	push   r12
      c94fe3:	53                   	push   rbx
      c94fe4:	48 83 ec 18          	sub    rsp,0x18
      c94fe8:	4c 8b bf a0 00 00 00 	mov    r15,QWORD PTR [rdi+0xa0]
      c94fef:	0f 10 0e             	movups xmm1,XMMWORD PTR [rsi]
      c94ff2:	66 0f ef c0          	pxor   xmm0,xmm0
      c94ff6:	f3 0f 7f 06          	movdqu XMMWORD PTR [rsi],xmm0
      c94ffa:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
      c94ffe:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      c95002:	49 39 c4             	cmp    r12,rax
      c95005:	73 11                	jae    c95018 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e1fb8>
      c95007:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
      c9500c:	49 83 c4 10          	add    r12,0x10
      c95010:	4d 89 e5             	mov    r13,r12
      c95013:	e9 fb 00 00 00       	jmp    c95113 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20b3>
      c95018:	0f 29 0c 24          	movaps XMMWORD PTR [rsp],xmm1
      c9501c:	4d 8b 77 10          	mov    r14,QWORD PTR [r15+0x10]
      c95020:	4d 89 e5             	mov    r13,r12
      c95023:	4d 29 f5             	sub    r13,r14
      c95026:	4c 89 ed             	mov    rbp,r13
      c95029:	48 c1 fd 04          	sar    rbp,0x4
      c9502d:	48 8d 4d 01          	lea    rcx,[rbp+0x1]
      c95031:	48 89 ca             	mov    rdx,rcx
      c95034:	48 c1 ea 3c          	shr    rdx,0x3c
      c95038:	0f 85 ee 00 00 00    	jne    c9512c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20cc>
      c9503e:	48 ba ff ff ff ff ff 	movabs rdx,0xfffffffffffffff
      c95045:	ff ff 0f 
      c95048:	4c 29 f0             	sub    rax,r14
      c9504b:	48 89 c3             	mov    rbx,rax
      c9504e:	48 c1 fb 03          	sar    rbx,0x3
      c95052:	48 39 cb             	cmp    rbx,rcx
      c95055:	48 0f 46 d9          	cmovbe rbx,rcx
      c95059:	48 b9 f0 ff ff ff ff 	movabs rcx,0x7ffffffffffffff0
      c95060:	ff ff 7f 
      c95063:	48 39 c8             	cmp    rax,rcx
      c95066:	48 0f 43 da          	cmovae rbx,rdx
      c9506a:	48 39 d3             	cmp    rbx,rdx
      c9506d:	0f 87 be 00 00 00    	ja     c95131 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20d1>
      c95073:	48 c1 e3 04          	shl    rbx,0x4
      c95077:	48 89 df             	mov    rdi,rbx
      c9507a:	e8 81 8e b5 00       	call   17edf00 <_Znwm@plt>
      c9507f:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      c95084:	66 42 0f d6 04 28    	movq   QWORD PTR [rax+r13*1],xmm0
      c9508a:	48 c1 e5 04          	shl    rbp,0x4
      c9508e:	66 48 0f 3a 16 44 28 	pextrq QWORD PTR [rax+rbp*1+0x8],xmm0,0x1
      c95095:	08 01 
      c95097:	4a 8d 0c 28          	lea    rcx,[rax+r13*1]
      c9509b:	48 01 c3             	add    rbx,rax
      c9509e:	49 01 c5             	add    r13,rax
      c950a1:	49 83 c5 10          	add    r13,0x10
      c950a5:	4d 39 f4             	cmp    r12,r14
      c950a8:	74 38                	je     c950e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e2082>
      c950aa:	66 0f ef c0          	pxor   xmm0,xmm0
      c950ae:	49 8b 44 24 f0       	mov    rax,QWORD PTR [r12-0x10]
      c950b3:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
      c950b7:	49 8b 44 24 f8       	mov    rax,QWORD PTR [r12-0x8]
      c950bc:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
      c950c0:	48 83 c1 f0          	add    rcx,0xfffffffffffffff0
      c950c4:	f3 41 0f 7f 44 24 f0 	movdqu XMMWORD PTR [r12-0x10],xmm0
      c950cb:	49 8d 44 24 f0       	lea    rax,[r12-0x10]
      c950d0:	49 89 c4             	mov    r12,rax
      c950d3:	4c 39 f0             	cmp    rax,r14
      c950d6:	75 d6                	jne    c950ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e204e>
      c950d8:	4d 8b 77 10          	mov    r14,QWORD PTR [r15+0x10]
      c950dc:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
      c950e0:	eb 03                	jmp    c950e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e2085>
      c950e2:	4d 89 e6             	mov    r14,r12
      c950e5:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
      c950e9:	4d 89 6f 18          	mov    QWORD PTR [r15+0x18],r13
      c950ed:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      c950f1:	4d 39 f4             	cmp    r12,r14
      c950f4:	74 10                	je     c95106 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20a6>
      c950f6:	49 8b 7c 24 f8       	mov    rdi,QWORD PTR [r12-0x8]
      c950fb:	49 83 c4 f0          	add    r12,0xfffffffffffffff0
      c950ff:	e8 82 93 e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c95104:	eb eb                	jmp    c950f1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e2091>
      c95106:	4d 85 f6             	test   r14,r14
      c95109:	74 08                	je     c95113 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20b3>
      c9510b:	4c 89 f7             	mov    rdi,r14
      c9510e:	e8 0d 8e b5 00       	call   17edf20 <_ZdlPv@plt>
      c95113:	4d 89 6f 18          	mov    QWORD PTR [r15+0x18],r13
      c95117:	31 ff                	xor    edi,edi
      c95119:	48 83 c4 18          	add    rsp,0x18
      c9511d:	5b                   	pop    rbx
      c9511e:	41 5c                	pop    r12
      c95120:	41 5d                	pop    r13
      c95122:	41 5e                	pop    r14
      c95124:	41 5f                	pop    r15
      c95126:	5d                   	pop    rbp
      c95127:	e9 5a 93 e0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      c9512c:	e8 8f f4 d6 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      c95131:	e8 a9 65 de ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
      c95136:	48 89 c3             	mov    rbx,rax
      c95139:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      c9513e:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      c95145:	e8 3c 93 e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c9514a:	48 89 df             	mov    rdi,rbx
      c9514d:	e8 7e ab dd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
### AP materializations
      c928b7:	48 8d 05 12 aa b8 00 	lea    rax,[rip+0xb8aa12]        # 181d2d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12f90>
      c94f26:	48 8d 05 a3 83 b8 00 	lea    rax,[rip+0xb883a3]        # 181d2d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x12f90>

## rank 6: score=132 AP=0x181b8f8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xc7ddb4 ['compact', 'pointer-field']
- +0x30=0xc072a2 ['compact', 'pointer-field']
- +0x38=0xc94fda ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0xc7dd70 FDE=(13098352, 13098401)
- +0x8: 0xc7dda2 FDE=(13098402, 13098420)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xc94faa FDE=(13193130, 13193169)
- +0x28: 0xc7ddb4 FDE=(13098420, 13098428)
- +0x30: 0xc072a2 FDE=(12612258, 12612266)
- +0x38: 0xc94fda FDE=(13193178, 13193554)
- +0x40: 0xc95152 FDE=(13193554, 13193686)
- +0x48: 0xc951d6 FDE=(13193686, 13194910)
- +0x50: 0xc9569e FDE=(13194910, 13194922)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xc7ddbc FDE=(13098428, 13098464)
- +0x70: 0xc7dde0 FDE=(13098464, 13098482)
- +0x78: 0xc7ddf2 FDE=(13098482, 13098854)
### +0x28 body
      c7ddb4:	48 8b 87 d0 00 00 00 	mov    rax,QWORD PTR [rdi+0xd0]
      c7ddbb:	c3                   	ret
### +0x30 body
      c072a2:	48 8b 87 c0 00 00 00 	mov    rax,QWORD PTR [rdi+0xc0]
      c072a9:	c3                   	ret
### +0x38 body
      c94fda:	55                   	push   rbp
      c94fdb:	41 57                	push   r15
      c94fdd:	41 56                	push   r14
      c94fdf:	41 55                	push   r13
      c94fe1:	41 54                	push   r12
      c94fe3:	53                   	push   rbx
      c94fe4:	48 83 ec 18          	sub    rsp,0x18
      c94fe8:	4c 8b bf a0 00 00 00 	mov    r15,QWORD PTR [rdi+0xa0]
      c94fef:	0f 10 0e             	movups xmm1,XMMWORD PTR [rsi]
      c94ff2:	66 0f ef c0          	pxor   xmm0,xmm0
      c94ff6:	f3 0f 7f 06          	movdqu XMMWORD PTR [rsi],xmm0
      c94ffa:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
      c94ffe:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      c95002:	49 39 c4             	cmp    r12,rax
      c95005:	73 11                	jae    c95018 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e1fb8>
      c95007:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
      c9500c:	49 83 c4 10          	add    r12,0x10
      c95010:	4d 89 e5             	mov    r13,r12
      c95013:	e9 fb 00 00 00       	jmp    c95113 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20b3>
      c95018:	0f 29 0c 24          	movaps XMMWORD PTR [rsp],xmm1
      c9501c:	4d 8b 77 10          	mov    r14,QWORD PTR [r15+0x10]
      c95020:	4d 89 e5             	mov    r13,r12
      c95023:	4d 29 f5             	sub    r13,r14
      c95026:	4c 89 ed             	mov    rbp,r13
      c95029:	48 c1 fd 04          	sar    rbp,0x4
      c9502d:	48 8d 4d 01          	lea    rcx,[rbp+0x1]
      c95031:	48 89 ca             	mov    rdx,rcx
      c95034:	48 c1 ea 3c          	shr    rdx,0x3c
      c95038:	0f 85 ee 00 00 00    	jne    c9512c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20cc>
      c9503e:	48 ba ff ff ff ff ff 	movabs rdx,0xfffffffffffffff
      c95045:	ff ff 0f 
      c95048:	4c 29 f0             	sub    rax,r14
      c9504b:	48 89 c3             	mov    rbx,rax
      c9504e:	48 c1 fb 03          	sar    rbx,0x3
      c95052:	48 39 cb             	cmp    rbx,rcx
      c95055:	48 0f 46 d9          	cmovbe rbx,rcx
      c95059:	48 b9 f0 ff ff ff ff 	movabs rcx,0x7ffffffffffffff0
      c95060:	ff ff 7f 
      c95063:	48 39 c8             	cmp    rax,rcx
      c95066:	48 0f 43 da          	cmovae rbx,rdx
      c9506a:	48 39 d3             	cmp    rbx,rdx
      c9506d:	0f 87 be 00 00 00    	ja     c95131 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20d1>
      c95073:	48 c1 e3 04          	shl    rbx,0x4
      c95077:	48 89 df             	mov    rdi,rbx
      c9507a:	e8 81 8e b5 00       	call   17edf00 <_Znwm@plt>
      c9507f:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      c95084:	66 42 0f d6 04 28    	movq   QWORD PTR [rax+r13*1],xmm0
      c9508a:	48 c1 e5 04          	shl    rbp,0x4
      c9508e:	66 48 0f 3a 16 44 28 	pextrq QWORD PTR [rax+rbp*1+0x8],xmm0,0x1
      c95095:	08 01 
      c95097:	4a 8d 0c 28          	lea    rcx,[rax+r13*1]
      c9509b:	48 01 c3             	add    rbx,rax
      c9509e:	49 01 c5             	add    r13,rax
      c950a1:	49 83 c5 10          	add    r13,0x10
      c950a5:	4d 39 f4             	cmp    r12,r14
      c950a8:	74 38                	je     c950e2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e2082>
      c950aa:	66 0f ef c0          	pxor   xmm0,xmm0
      c950ae:	49 8b 44 24 f0       	mov    rax,QWORD PTR [r12-0x10]
      c950b3:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
      c950b7:	49 8b 44 24 f8       	mov    rax,QWORD PTR [r12-0x8]
      c950bc:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
      c950c0:	48 83 c1 f0          	add    rcx,0xfffffffffffffff0
      c950c4:	f3 41 0f 7f 44 24 f0 	movdqu XMMWORD PTR [r12-0x10],xmm0
      c950cb:	49 8d 44 24 f0       	lea    rax,[r12-0x10]
      c950d0:	49 89 c4             	mov    r12,rax
      c950d3:	4c 39 f0             	cmp    rax,r14
      c950d6:	75 d6                	jne    c950ae <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e204e>
      c950d8:	4d 8b 77 10          	mov    r14,QWORD PTR [r15+0x10]
      c950dc:	4d 8b 67 18          	mov    r12,QWORD PTR [r15+0x18]
      c950e0:	eb 03                	jmp    c950e5 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e2085>
      c950e2:	4d 89 e6             	mov    r14,r12
      c950e5:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
      c950e9:	4d 89 6f 18          	mov    QWORD PTR [r15+0x18],r13
      c950ed:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      c950f1:	4d 39 f4             	cmp    r12,r14
      c950f4:	74 10                	je     c95106 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20a6>
      c950f6:	49 8b 7c 24 f8       	mov    rdi,QWORD PTR [r12-0x8]
      c950fb:	49 83 c4 f0          	add    r12,0xfffffffffffffff0
      c950ff:	e8 82 93 e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c95104:	eb eb                	jmp    c950f1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e2091>
      c95106:	4d 85 f6             	test   r14,r14
      c95109:	74 08                	je     c95113 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1e20b3>
      c9510b:	4c 89 f7             	mov    rdi,r14
      c9510e:	e8 0d 8e b5 00       	call   17edf20 <_ZdlPv@plt>
      c95113:	4d 89 6f 18          	mov    QWORD PTR [r15+0x18],r13
      c95117:	31 ff                	xor    edi,edi
      c95119:	48 83 c4 18          	add    rsp,0x18
      c9511d:	5b                   	pop    rbx
      c9511e:	41 5c                	pop    r12
      c95120:	41 5d                	pop    r13
      c95122:	41 5e                	pop    r14
      c95124:	41 5f                	pop    r15
      c95126:	5d                   	pop    rbp
      c95127:	e9 5a 93 e0 ff       	jmp    a9e486 <JNI_OnUnload@@Base+0x25d53>
      c9512c:	e8 8f f4 d6 ff       	call   a045c0 <_ZNSt6__ndk14__fs10filesystem4path8iterator11__decrementEv@@Base+0x4b0>
      c95131:	e8 a9 65 de ff       	call   a7b6df <JNI_OnUnload@@Base+0x2fac>
      c95136:	48 89 c3             	mov    rbx,rax
      c95139:	66 0f 6f 04 24       	movdqa xmm0,XMMWORD PTR [rsp]
      c9513e:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      c95145:	e8 3c 93 e0 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      c9514a:	48 89 df             	mov    rdi,rbx
      c9514d:	e8 7e ab dd ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
### AP materializations
      c7dc3e:	48 8d 05 b3 dc b9 00 	lea    rax,[rip+0xb9dcb3]        # 181b8f8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x115b8>
      c7dd74:	48 8d 05 7d db b9 00 	lea    rax,[rip+0xb9db7d]        # 181b8f8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x115b8>

## rank 7: score=132 AP=0x1817068 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xa7a004 ['compact', 'pointer-field']
- +0x30=0xb411a4 ['compact', 'pointer-field']
- +0x38=0xc2e940 ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0xc2e8be FDE=(12773566, 12773677)
- +0x8: 0xc2e92e FDE=(12773678, 12773696)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xa7a004 FDE=(10985476, 10985481)
- +0x30: 0xb411a4 FDE=(11800996, 11801001)
- +0x38: 0xc2e940 FDE=(12773696, 12773727)
- +0x40: 0xc072a2 FDE=(12612258, 12612266)
- +0x48: 0xc2e960 FDE=(12773728, 12773736)
- +0x50: 0xc2e968 FDE=(12773736, 12773743)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0xc2e67c FDE=(12772988, 12773223)
### +0x28 body
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
### +0x30 body
      b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      b411a8:	c3                   	ret
### +0x38 body
      c2e940:	48 89 f8             	mov    rax,rdi
      c2e943:	48 8b 8e b8 00 00 00 	mov    rcx,QWORD PTR [rsi+0xb8]
      c2e94a:	0f 28 86 b0 00 00 00 	movaps xmm0,XMMWORD PTR [rsi+0xb0]
      c2e951:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      c2e954:	48 85 c9             	test   rcx,rcx
      c2e957:	74 05                	je     c2e95e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b8fe>
      c2e959:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      c2e95e:	c3                   	ret
### AP materializations
      c2c5ff:	48 8d 0d 62 aa be 00 	lea    rcx,[rip+0xbeaa62]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>
      c2e8c2:	48 8d 05 9f 87 be 00 	lea    rax,[rip+0xbe879f]        # 1817068 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xcd28>

## rank 8: score=123 AP=0x1897db0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x1664940 ['compact', 'pointer-field']
- +0x30=0x1664954 ['compact', 'pointer-field']
- +0x38=0x1664968 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x1664912 FDE=(23480594, 23480619)
- +0x18: 0x16647e6 FDE=(23480294, 23480383)
- +0x20: 0x166492c FDE=(23480620, 23480639)
- +0x28: 0x1664940 FDE=(23480640, 23480659)
- +0x30: 0x1664954 FDE=(23480660, 23480679)
- +0x38: 0x1664968 FDE=(23480680, 23480699)
- +0x40: 0xfffffffffffffff8 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0xca132c FDE=(13243180, 13243189)
- +0x60: 0x166497c FDE=(23480700, 23480719)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
### +0x28 body
     1664940:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     1664944:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]
     1664947:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     166494a:	48 8b 49 20          	mov    rcx,QWORD PTR [rcx+0x20]
     166494e:	48 89 c7             	mov    rdi,rax
     1664951:	ff e1                	jmp    rcx
### +0x30 body
     1664954:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     1664958:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]
     166495b:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     166495e:	48 8b 49 28          	mov    rcx,QWORD PTR [rcx+0x28]
     1664962:	48 89 c7             	mov    rdi,rax
     1664965:	ff e1                	jmp    rcx
### +0x38 body
     1664968:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     166496c:	8b 77 18             	mov    esi,DWORD PTR [rdi+0x18]
     166496f:	48 8b 08             	mov    rcx,QWORD PTR [rax]
     1664972:	48 8b 49 38          	mov    rcx,QWORD PTR [rcx+0x38]
     1664976:	48 89 c7             	mov    rdi,rax
     1664979:	ff e1                	jmp    rcx
### AP materializations
     16648bc:	48 8d 05 ed 34 23 00 	lea    rax,[rip+0x2334ed]        # 1897db0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x4cf0>

## rank 9: score=122 AP=0x188bc58 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x160aec2 ['compact', 'pointer-field']
- +0x30=0x1217f0e ['compact', 'this-relative-pointer']
- +0x38=0x1217f06 ['writes-rdi-output']
- +0x0: 0x160ad78 FDE=(23113080, 23113245)
- +0x8: 0x160ae1e FDE=(23113246, 23113264)
- +0x10: 0x160ae30 FDE=(23113264, 23113330)
- +0x18: 0x160ae72 FDE=(23113330, 23113401)
- +0x20: 0x160aeba FDE=(23113402, 23113410)
- +0x28: 0x160aec2 FDE=(23113410, 23113418)
- +0x30: 0x1217f0e FDE=(18972430, 18972438)
- +0x38: 0x1217f06 FDE=(18972422, 18972429)
- +0x40: 0x160aeca FDE=(23113418, 23113463)
- +0x48: 0xfffffffffffffff8 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x160aef8 FDE=(23113464, 23113473)
- +0x60: 0x160af02 FDE=(23113474, 23113483)
- +0x68: 0x160af0c FDE=(23113484, 23113493)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
     160aec2:	48 8b 87 d0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1d0]
     160aec9:	c3                   	ret
### +0x30 body
     1217f0e:	48 8d 87 80 01 00 00 	lea    rax,[rdi+0x180]
     1217f15:	c3                   	ret
### +0x38 body
     1217f06:	8a 87 d8 01 00 00    	mov    al,BYTE PTR [rdi+0x1d8]
     1217f0c:	c3                   	ret
### AP materializations
      ad1b76:	48 8d 05 db a0 db 00 	lea    rax,[rip+0xdba0db]        # 188bc58 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4930>
     160ad80:	48 8d 05 d1 0e 28 00 	lea    rax,[rip+0x280ed1]        # 188bc58 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4930>

## rank 10: score=122 AP=0x186f128 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xe8f874 ['compact', 'pointer-field']
- +0x30=0x13f8afa ['compact', 'pointer-field']
- +0x38=0x13f8b0e ['writes-rdi-output']
- +0x0: 0x13f7a78 FDE=(20937336, 20937494)
- +0x8: 0x13f7b16 FDE=(20937494, 20937512)
- +0x10: 0x13f7b28 FDE=(20937512, 20937520)
- +0x18: 0x13f7b30 FDE=(20937520, 20940262)
- +0x20: 0x13f85e6 FDE=(20940262, 20941561)
- +0x28: 0xe8f874 FDE=(15267956, 15267964)
- +0x30: 0x13f8afa FDE=(20941562, 20941582)
- +0x38: 0x13f8b0e FDE=(20941582, 20941589)
- +0x40: 0x13f8b16 FDE=(20941590, 20941631)
- +0x48: 0x13f8b40 FDE=(20941632, 20942172)
- +0x50: 0x13f8d5c FDE=(20942172, 20942193)
- +0x58: 0x13f8d72 FDE=(20942194, 20942202)
- +0x60: 0x13f8d7a FDE=(20942202, 20942210)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
      e8f874:	48 8b 87 30 01 00 00 	mov    rax,QWORD PTR [rdi+0x130]
      e8f87b:	c3                   	ret
### +0x30 body
     13f8afa:	80 bf 18 01 00 00 00 	cmp    BYTE PTR [rdi+0x118],0x0
     13f8b01:	74 08                	je     13f8b0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23e08f>
     13f8b03:	48 8b 87 10 01 00 00 	mov    rax,QWORD PTR [rdi+0x110]
     13f8b0a:	c3                   	ret
     13f8b0b:	31 c0                	xor    eax,eax
     13f8b0d:	c3                   	ret
### +0x38 body
     13f8b0e:	8a 87 3b 01 00 00    	mov    al,BYTE PTR [rdi+0x13b]
     13f8b14:	c3                   	ret
### AP materializations
     13f79e4:	48 8d 05 3d 77 47 00 	lea    rax,[rip+0x47773d]        # 186f128 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b810>
     13f7a80:	48 8d 05 a1 76 47 00 	lea    rax,[rip+0x4776a1]        # 186f128 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b810>

## rank 11: score=122 AP=0x1867340 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xaa712a ['compact', 'pointer-field']
- +0x30=0xbf7896 ['compact', 'pointer-field']
- +0x38=0xaa7018 ['writes-rdi-output']
- +0x0: 0x1353b66 FDE=(20265830, 20266021)
- +0x8: 0x1353c26 FDE=(20266022, 20266040)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xaa712a FDE=(11170090, 11170095)
- +0x30: 0xbf7896 FDE=(12548246, 12548251)
- +0x38: 0xaa7018 FDE=(11169816, 11169821)
- +0x40: 0x13539b4 FDE=(20265396, 20265404)
- +0x48: 0x13539bc FDE=(20265404, 20265412)
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0x1353a36 FDE=(20265526, 20265534)
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xaae9b2 FDE=(11200946, 11200955)
### +0x28 body
      aa712a:	48 8b 47 50          	mov    rax,QWORD PTR [rdi+0x50]
      aa712e:	c3                   	ret
### +0x30 body
      bf7896:	48 8b 47 28          	mov    rax,QWORD PTR [rdi+0x28]
      bf789a:	c3                   	ret
### +0x38 body
      aa7018:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
      aa701c:	c3                   	ret
### AP materializations
     135257c:	48 8d 05 bd 4d 51 00 	lea    rax,[rip+0x514dbd]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>
     1353b7e:	48 8d 05 bb 37 51 00 	lea    rax,[rip+0x5137bb]        # 1867340 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23a28>

## rank 12: score=122 AP=0x18613a8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xb04950 ['compact', 'pointer-field']
- +0x30=0x12967f4 ['compact', 'pointer-field']
- +0x38=0x12967fe ['writes-rdi-output']
- +0x0: 0x12967a2 FDE=(19490722, 19490785)
- +0x8: 0x12967e2 FDE=(19490786, 19490804)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xb04950 FDE=(11553104, 11553109)
- +0x30: 0x12967f4 FDE=(19490804, 19490813)
- +0x38: 0x12967fe FDE=(19490814, 19490823)
- +0x40: 0xcd9d6e FDE=(13475182, 13475191)
- +0x48: 0x1296808 FDE=(19490824, 19490970)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x129689a FDE=(19490970, 19491011)
- +0x68: 0x12968c4 FDE=(19491012, 19491030)
- +0x70: 0x12ec716 FDE=(19842838, 19844181)
- +0x78: 0xaa8e00 FDE=(11177472, 11177626)
### +0x28 body
      b04950:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
      b04954:	c3                   	ret
### +0x30 body
     12967f4:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
     12967f8:	48 83 c0 08          	add    rax,0x8
     12967fc:	c3                   	ret
### +0x38 body
     12967fe:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     1296802:	48 83 c0 08          	add    rax,0x8
     1296806:	c3                   	ret
### AP materializations
     129507a:	48 8d 05 27 c3 5c 00 	lea    rax,[rip+0x5cc327]        # 18613a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1da90>
     12967a6:	48 8d 05 fb ab 5c 00 	lea    rax,[rip+0x5cabfb]        # 18613a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1da90>

## rank 13: score=122 AP=0x18547a8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xa7a004 ['compact', 'pointer-field']
- +0x30=0xcd9c74 ['compact', 'pointer-field']
- +0x38=0x1143352 ['writes-rdi-output']
- +0x0: 0x114331c FDE=(18101020, 18101056)
- +0x8: 0x1143340 FDE=(18101056, 18101074)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xa7a004 FDE=(10985476, 10985481)
- +0x30: 0xcd9c74 FDE=(13474932, 13474941)
- +0x38: 0x1143352 FDE=(18101074, 18101090)
- +0x40: 0x1143362 FDE=(18101090, 18101106)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x1143372 FDE=(18101106, 18101121)
- +0x60: 0x1143382 FDE=(18101122, 18101140)
- +0x68: 0x1143394 FDE=(18101140, 18101329)
- +0x70: 0x0 FDE=None
- +0x78: 0xa50370 FDE=(10814320, 10814325)
### +0x28 body
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
### +0x30 body
      cd9c74:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      cd9c78:	48 83 c0 08          	add    rax,0x8
      cd9c7c:	c3                   	ret
### +0x38 body
     1143352:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     1143356:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
     114335a:	48 8b 80 90 02 00 00 	mov    rax,QWORD PTR [rax+0x290]
     1143361:	c3                   	ret
### AP materializations
     1141ede:	48 8d 05 c3 28 71 00 	lea    rax,[rip+0x7128c3]        # 18547a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e90>
     1143320:	48 8d 05 81 14 71 00 	lea    rax,[rip+0x711481]        # 18547a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x10e90>

## rank 14: score=122 AP=0x184da88 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xaa7024 ['compact', 'pointer-field']
- +0x30=0xbf7896 ['compact', 'pointer-field']
- +0x38=0xb411a4 ['writes-rdi-output']
- +0x0: 0x10c09c6 FDE=(17566150, 17566310)
- +0x8: 0x10c0a66 FDE=(17566310, 17566328)
- +0x10: 0xe750be FDE=(15159486, 15159490)
- +0x18: 0xa55cb0 FDE=(10837168, 10837173)
- +0x20: 0xa7a004 FDE=(10985476, 10985481)
- +0x28: 0xaa7024 FDE=(11169828, 11169833)
- +0x30: 0xbf7896 FDE=(12548246, 12548251)
- +0x38: 0xb411a4 FDE=(11800996, 11801001)
- +0x40: 0xb04950 FDE=(11553104, 11553109)
- +0x48: 0xaa7012 FDE=(11169810, 11169815)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x10c0a78 FDE=(17566328, 17566354)
- +0x68: 0x10c0a92 FDE=(17566354, 17566372)
- +0x70: 0x10c0aa4 FDE=(17566372, 17566565)
- +0x78: 0x10c0b66 FDE=(17566566, 17566637)
### +0x28 body
      aa7024:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      aa7028:	c3                   	ret
### +0x30 body
      bf7896:	48 8b 47 28          	mov    rax,QWORD PTR [rdi+0x28]
      bf789a:	c3                   	ret
### +0x38 body
      b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      b411a8:	c3                   	ret
### AP materializations
     10ad68d:	48 8d 0d f4 03 7a 00 	lea    rcx,[rip+0x7a03f4]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>
     10c09ca:	48 8d 05 b7 d0 78 00 	lea    rax,[rip+0x78d0b7]        # 184da88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xa170>

## rank 15: score=122 AP=0x18253e0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xb411a4 ['compact', 'pointer-field']
- +0x30=0xa4b870 ['compact', 'this-relative-pointer']
- +0x38=0xaa712a ['writes-rdi-output']
- +0x0: 0xd50b2a FDE=(13962026, 13962107)
- +0x8: 0xd50b7c FDE=(13962108, 13962126)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xca8de2 FDE=(13274594, 13274604)
- +0x28: 0xb411a4 FDE=(11800996, 11801001)
- +0x30: 0xa4b870 FDE=(10795120, 10795125)
- +0x38: 0xaa712a FDE=(11170090, 11170095)
- +0x40: 0xd50b8e FDE=(13962126, 13962131)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xd50a06 FDE=(13961734, 13961753)
- +0x60: 0xd50a1a FDE=(13961754, 13961772)
- +0x68: 0xd50a2c FDE=(13961772, 13961932)
- +0x70: 0xd50acc FDE=(13961932, 13961958)
- +0x78: 0xad6470 FDE=(11363440, 11363449)
### +0x28 body
      b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      b411a8:	c3                   	ret
### +0x30 body
      a4b870:	48 8d 47 20          	lea    rax,[rdi+0x20]
      a4b874:	c3                   	ret
### +0x38 body
      aa712a:	48 8b 47 50          	mov    rax,QWORD PTR [rdi+0x50]
      aa712e:	c3                   	ret
### AP materializations
      d4c742:	48 8d 05 97 8c ad 00 	lea    rax,[rip+0xad8c97]        # 18253e0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1a10>
      d50b2e:	48 8d 05 ab 48 ad 00 	lea    rax,[rip+0xad48ab]        # 18253e0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1a10>

## rank 16: score=122 AP=0x18250a0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xa7a004 ['compact', 'pointer-field']
- +0x30=0xb411a4 ['compact', 'pointer-field']
- +0x38=0xb04950 ['writes-rdi-output']
- +0x0: 0xd4ac28 FDE=(13937704, 13937776)
- +0x8: 0xd4ac70 FDE=(13937776, 13937794)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0xd4ac82 FDE=(13937794, 13937804)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xa7a004 FDE=(10985476, 10985481)
- +0x30: 0xb411a4 FDE=(11800996, 11801001)
- +0x38: 0xb04950 FDE=(11553104, 11553109)
- +0x40: 0xaa7012 FDE=(11169810, 11169815)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0xa50370 FDE=(10814320, 10814325)
- +0x68: 0xd4abea FDE=(13937642, 13937674)
- +0x70: 0xd4ac0a FDE=(13937674, 13937693)
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
### +0x28 body
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
### +0x30 body
      b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      b411a8:	c3                   	ret
### +0x38 body
      b04950:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
      b04954:	c3                   	ret
### AP materializations
      d49955:	48 8d 0d 44 b7 ad 00 	lea    rcx,[rip+0xadb744]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>
      d4ac2c:	48 8d 05 6d a4 ad 00 	lea    rax,[rip+0xada46d]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>

## rank 17: score=122 AP=0x1818818 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xaa7024 ['compact', 'pointer-field']
- +0x30=0xb411a4 ['compact', 'pointer-field']
- +0x38=0xb04950 ['writes-rdi-output']
- +0x0: 0xc45864 FDE=(12867684, 12867747)
- +0x8: 0xc458a4 FDE=(12867748, 12867766)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xaa7024 FDE=(11169828, 11169833)
- +0x30: 0xb411a4 FDE=(11800996, 11801001)
- +0x38: 0xb04950 FDE=(11553104, 11553109)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0xa50370 FDE=(10814320, 10814325)
- +0x60: 0xc458b6 FDE=(12867766, 12867769)
- +0x68: 0xc458ba FDE=(12867770, 12867781)
- +0x70: 0xc458c6 FDE=(12867782, 12867793)
- +0x78: 0xc458d2 FDE=(12867794, 12868222)
### +0x28 body
      aa7024:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      aa7028:	c3                   	ret
### +0x30 body
      b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      b411a8:	c3                   	ret
### +0x38 body
      b04950:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
      b04954:	c3                   	ret
### AP materializations
      c4528a:	48 8d 05 87 35 bd 00 	lea    rax,[rip+0xbd3587]        # 1818818 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe4d8>
      c45868:	48 8d 05 a9 2f bd 00 	lea    rax,[rip+0xbd2fa9]        # 1818818 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe4d8>

## rank 18: score=122 AP=0x1812110 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xa7a004 ['compact', 'pointer-field']
- +0x30=0xaa7024 ['compact', 'pointer-field']
- +0x38=0xb04950 ['writes-rdi-output']
- +0x0: 0xbcfd88 FDE=(12385672, 12385735)
- +0x8: 0xbcfdc8 FDE=(12385736, 12385754)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xa7a004 FDE=(10985476, 10985481)
- +0x30: 0xaa7024 FDE=(11169828, 11169833)
- +0x38: 0xb04950 FDE=(11553104, 11553109)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0xbcfd3e FDE=(12385598, 12385613)
- +0x58: 0xbcfd4e FDE=(12385614, 12385632)
- +0x60: 0xbcfd60 FDE=(12385632, 12385658)
- +0x68: 0x0 FDE=None
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0x0 FDE=None
### +0x28 body
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
### +0x30 body
      aa7024:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      aa7028:	c3                   	ret
### +0x38 body
      b04950:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
      b04954:	c3                   	ret
### AP materializations
      bcf4b0:	48 8d 05 59 2c c4 00 	lea    rax,[rip+0xc42c59]        # 1812110 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7dd0>
      bcfd8c:	48 8d 05 7d 23 c4 00 	lea    rax,[rip+0xc4237d]        # 1812110 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x7dd0>

## rank 19: score=122 AP=0x17fdd70 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xaae332 ['compact', 'pointer-field']
- +0x30=0xaae34e ['compact', 'pointer-field']
- +0x38=0xaae356 ['writes-rdi-output']
- +0x0: 0xaadf6c FDE=(11198316, 11198400)
- +0x8: 0xaadfc0 FDE=(11198400, 11198418)
- +0x10: 0xaadfd2 FDE=(11198418, 11198852)
- +0x18: 0xaae184 FDE=(11198852, 11199186)
- +0x20: 0xaae2d2 FDE=(11199186, 11199281)
- +0x28: 0xaae332 FDE=(11199282, 11199310)
- +0x30: 0xaae34e FDE=(11199310, 11199318)
- +0x38: 0xaae356 FDE=(11199318, 11199325)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x9d7de0 FDE=(10321376, 10321377)
- +0x58: 0xa50370 FDE=(10814320, 10814325)
- +0x60: 0xaadf4a FDE=(11198282, 11198303)
- +0x68: 0xaadf60 FDE=(11198304, 11198315)
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xa50370 FDE=(10814320, 10814325)
### +0x28 body
      aae332:	48 8b 87 90 00 00 00 	mov    rax,QWORD PTR [rdi+0x90]
      aae339:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]
      aae33d:	48 85 ff             	test   rdi,rdi
      aae340:	74 09                	je     aae34b <JNI_OnUnload@@Base+0x35c18>
      aae342:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aae345:	ff a0 90 01 00 00    	jmp    QWORD PTR [rax+0x190]
      aae34b:	31 c0                	xor    eax,eax
      aae34d:	c3                   	ret
### +0x30 body
      aae34e:	48 8b 87 a8 00 00 00 	mov    rax,QWORD PTR [rdi+0xa8]
      aae355:	c3                   	ret
### +0x38 body
      aae356:	8a 87 b0 00 00 00    	mov    al,BYTE PTR [rdi+0xb0]
      aae35c:	c3                   	ret
### AP materializations
      aabfbc:	48 8d 05 ad 1d d5 00 	lea    rax,[rip+0xd51dad]        # 17fdd70 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe10>
      aadf70:	48 8d 05 f9 fd d4 00 	lea    rax,[rip+0xd4fdf9]        # 17fdd70 <_ZTINSt6__ndk117bad_function_callE@@Base+0xe10>

## rank 20: score=122 AP=0x17fd4d0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xaa701e ['compact', 'pointer-field']
- +0x30=0xaa7024 ['compact', 'pointer-field']
- +0x38=0xaa702a ['writes-rdi-output']
- +0x0: 0xaa6fa6 FDE=(11169702, 11169792)
- +0x8: 0xaa7000 FDE=(11169792, 11169810)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0xaa7012 FDE=(11169810, 11169815)
- +0x20: 0xaa7018 FDE=(11169816, 11169821)
- +0x28: 0xaa701e FDE=(11169822, 11169827)
- +0x30: 0xaa7024 FDE=(11169828, 11169833)
- +0x38: 0xaa702a FDE=(11169834, 11170070)
- +0x40: 0xaa7116 FDE=(11170070, 11170090)
- +0x48: 0xaa712a FDE=(11170090, 11170095)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0xaa6f84 FDE=(11169668, 11169686)
- +0x70: 0xaa6f96 FDE=(11169686, 11169702)
- +0x78: 0x0 FDE=None
### +0x28 body
      aa701e:	48 8b 47 48          	mov    rax,QWORD PTR [rdi+0x48]
      aa7022:	c3                   	ret
### +0x30 body
      aa7024:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      aa7028:	c3                   	ret
### +0x38 body
      aa702a:	41 57                	push   r15
      aa702c:	41 56                	push   r14
      aa702e:	41 54                	push   r12
      aa7030:	53                   	push   rbx
      aa7031:	48 83 ec 18          	sub    rsp,0x18
      aa7035:	49 89 f6             	mov    r14,rsi
      aa7038:	48 89 fb             	mov    rbx,rdi
      aa703b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      aa7042:	00 00 
      aa7044:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      aa7049:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      aa704d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      aa7050:	ff 50 18             	call   QWORD PTR [rax+0x18]
      aa7053:	4c 8b 7b 20          	mov    r15,QWORD PTR [rbx+0x20]
      aa7057:	4d 85 ff             	test   r15,r15
      aa705a:	74 75                	je     aa70d1 <JNI_OnUnload@@Base+0x2e99e>
      aa705c:	49 8b 06             	mov    rax,QWORD PTR [r14]
      aa705f:	4c 89 f7             	mov    rdi,r14
      aa7062:	4c 89 fe             	mov    rsi,r15
      aa7065:	ff 90 f8 00 00 00    	call   QWORD PTR [rax+0xf8]
      aa706b:	49 89 c4             	mov    r12,rax
      aa706e:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
      aa7072:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      aa7077:	4c 89 f7             	mov    rdi,r14
      aa707a:	e8 69 db d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa707f:	4d 85 e4             	test   r12,r12
      aa7082:	74 45                	je     aa70c9 <JNI_OnUnload@@Base+0x2e996>
      aa7084:	49 8b 06             	mov    rax,QWORD PTR [r14]
      aa7087:	48 8d 15 69 40 8a ff 	lea    rdx,[rip+0xffffffffff8a4069]        # 34b0f7 <_ZTSSt12bad_any_cast@@Base-0x450d1>
      aa708e:	48 8d 0d df ae 9a ff 	lea    rcx,[rip+0xffffffffff9aaedf]        # 451f74 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b80>
      aa7095:	4c 89 f7             	mov    rdi,r14
      aa7098:	4c 89 e6             	mov    rsi,r12
      aa709b:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
      aa70a1:	49 89 c4             	mov    r12,rax
      aa70a4:	4c 89 f7             	mov    rdi,r14
      aa70a7:	e8 3c db d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa70ac:	4d 85 e4             	test   r12,r12
      aa70af:	74 18                	je     aa70c9 <JNI_OnUnload@@Base+0x2e996>
      aa70b1:	4c 89 f7             	mov    rdi,r14
      aa70b4:	4c 89 fe             	mov    rsi,r15
      aa70b7:	4c 89 e2             	mov    rdx,r12
      aa70ba:	31 c0                	xor    eax,eax
      aa70bc:	e8 63 5b ff ff       	call   a9cc24 <JNI_OnUnload@@Base+0x244f1>
      aa70c1:	4c 89 f7             	mov    rdi,r14
      aa70c4:	e8 1f db d2 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>
      aa70c9:	48 89 e7             	mov    rdi,rsp
      aa70cc:	e8 f5 eb d2 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      aa70d1:	48 83 c3 08          	add    rbx,0x8
      aa70d5:	48 89 df             	mov    rdi,rbx
      aa70d8:	e8 27 dc 00 00       	call   ab4d04 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1ca4>
      aa70dd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      aa70e4:	00 00 
      aa70e6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      aa70eb:	75 0c                	jne    aa70f9 <JNI_OnUnload@@Base+0x2e9c6>
      aa70ed:	48 83 c4 18          	add    rsp,0x18
      aa70f1:	5b                   	pop    rbx
      aa70f2:	41 5c                	pop    r12
      aa70f4:	41 5e                	pop    r14
      aa70f6:	41 5f                	pop    r15
      aa70f8:	c3                   	ret
      aa70f9:	e8 b2 89 d4 00       	call   17efab0 <__stack_chk_fail@plt>
      aa70fe:	48 89 c3             	mov    rbx,rax
      aa7101:	48 89 e7             	mov    rdi,rsp
      aa7104:	e8 bd eb d2 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>
      aa7109:	eb 03                	jmp    aa710e <JNI_OnUnload@@Base+0x2e9db>
      aa710b:	48 89 c3             	mov    rbx,rax
      aa710e:	48 89 df             	mov    rdi,rbx
      aa7111:	e8 8f 29 fd ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
### AP materializations
      aa38fe:	48 8d 05 cb 9b d5 00 	lea    rax,[rip+0xd59bcb]        # 17fd4d0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x570>
      aa6faa:	48 8d 05 1f 65 d5 00 	lea    rax,[rip+0xd5651f]        # 17fd4d0 <_ZTINSt6__ndk117bad_function_callE@@Base+0x570>

## rank 21: score=118 AP=0x1890bd0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x1635d00 ['compact', 'pointer-field']
- +0x30=0x1635d0a ['compact', 'pointer-field']
- +0x38=0x1635d16 ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x1635c74 FDE=(23288948, 23288966)
- +0x18: 0x16647e6 FDE=(23480294, 23480383)
- +0x20: 0x1635cf8 FDE=(23289080, 23289088)
- +0x28: 0x1635d00 FDE=(23289088, 23289097)
- +0x30: 0x1635d0a FDE=(23289098, 23289109)
- +0x38: 0x1635d16 FDE=(23289110, 23289121)
- +0x40: 0x1635d22 FDE=(23289122, 23289132)
- +0x48: 0x1635d2c FDE=(23289132, 23289143)
- +0x50: 0x1635d38 FDE=(23289144, 23289155)
- +0x58: 0x1635d44 FDE=(23289156, 23289167)
- +0x60: 0x1635d50 FDE=(23289168, 23289176)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x1635d58 FDE=(23289176, 23289203)
- +0x78: 0x1635d74 FDE=(23289204, 23289223)
### +0x28 body
     1635d00:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
     1635d04:	48 83 c0 78          	add    rax,0x78
     1635d08:	c3                   	ret
### +0x30 body
     1635d0a:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
     1635d0e:	8b 80 00 01 00 00    	mov    eax,DWORD PTR [rax+0x100]
     1635d14:	c3                   	ret
### +0x38 body
     1635d16:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
     1635d1a:	8b 80 fc 00 00 00    	mov    eax,DWORD PTR [rax+0xfc]
     1635d20:	c3                   	ret
### AP materializations
     1635c95:	48 8d 05 34 af 25 00 	lea    rax,[rip+0x25af34]        # 1890bd0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x98a8>

## rank 22: score=118 AP=0x18909e8 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x1635b1e ['compact', 'pointer-field']
- +0x30=0x1635b2a ['compact', 'pointer-field']
- +0x38=0x1635b38 ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x1635b00 FDE=(23288576, 23288594)
- +0x18: 0x16647e6 FDE=(23480294, 23480383)
- +0x20: 0x1635b12 FDE=(23288594, 23288605)
- +0x28: 0x1635b1e FDE=(23288606, 23288618)
- +0x30: 0x1635b2a FDE=(23288618, 23288632)
- +0x38: 0x1635b38 FDE=(23288632, 23288646)
- +0x40: 0x1635b46 FDE=(23288646, 23288659)
- +0x48: 0x1635b54 FDE=(23288660, 23288674)
- +0x50: 0x1635b62 FDE=(23288674, 23288688)
- +0x58: 0x1635b70 FDE=(23288688, 23288702)
- +0x60: 0x1635b7e FDE=(23288702, 23288713)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x1635b8a FDE=(23288714, 23288744)
- +0x78: 0x1635ba8 FDE=(23288744, 23288766)
### +0x28 body
     1635b1e:	48 8b 87 80 00 00 00 	mov    rax,QWORD PTR [rdi+0x80]
     1635b25:	48 83 c0 78          	add    rax,0x78
     1635b29:	c3                   	ret
### +0x30 body
     1635b2a:	48 8b 87 80 00 00 00 	mov    rax,QWORD PTR [rdi+0x80]
     1635b31:	8b 80 00 01 00 00    	mov    eax,DWORD PTR [rax+0x100]
     1635b37:	c3                   	ret
### +0x38 body
     1635b38:	48 8b 87 80 00 00 00 	mov    rax,QWORD PTR [rdi+0x80]
     1635b3f:	8b 80 fc 00 00 00    	mov    eax,DWORD PTR [rax+0xfc]
     1635b45:	c3                   	ret
### AP materializations
     1635a89:	48 8d 05 58 af 25 00 	lea    rax,[rip+0x25af58]        # 18909e8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x96c0>

## rank 23: score=118 AP=0x186d080 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x13dd864 ['compact', 'pointer-field']
- +0x30=0x13dd872 ['compact', 'pointer-field']
- +0x38=0x13dd446 ['writes-rdi-output']
- +0x0: 0x13dd6ea FDE=(20829930, 20830162)
- +0x8: 0x13dd7d2 FDE=(20830162, 20830180)
- +0x10: 0x13dd7e4 FDE=(20830180, 20830193)
- +0x18: 0x13dd7f2 FDE=(20830194, 20830207)
- +0x20: 0x13dd800 FDE=(20830208, 20830308)
- +0x28: 0x13dd864 FDE=(20830308, 20830321)
- +0x30: 0x13dd872 FDE=(20830322, 20830335)
- +0x38: 0x13dd446 FDE=(20829254, 20829367)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x17d5d4a FDE=(24993098, 24993117)
- +0x58: 0xaa0bde FDE=(11144158, 11144176)
- +0x60: 0x13dd612 FDE=(20829714, 20829930)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x13dda46 FDE=(20830790, 20830907)
### +0x28 body
     13dd864:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     13dd868:	48 8b 70 28          	mov    rsi,QWORD PTR [rax+0x28]
     13dd86c:	e9 0f 00 00 00       	jmp    13dd880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222e04>
### +0x30 body
     13dd872:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     13dd876:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
     13dd87a:	e9 01 00 00 00       	jmp    13dd880 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222e04>
### +0x38 body
     13dd446:	53                   	push   rbx
     13dd447:	48 83 ec 30          	sub    rsp,0x30
     13dd44b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13dd452:	00 00 
     13dd454:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     13dd459:	48 89 f0             	mov    rax,rsi
     13dd45c:	48 c1 e8 20          	shr    rax,0x20
     13dd460:	31 c9                	xor    ecx,ecx
     13dd462:	84 c0                	test   al,al
     13dd464:	0f 45 ce             	cmovne ecx,esi
     13dd467:	48 8d 5c 24 08       	lea    rbx,[rsp+0x8]
     13dd46c:	48 89 3b             	mov    QWORD PTR [rbx],rdi
     13dd46f:	89 4b 08             	mov    DWORD PTR [rbx+0x8],ecx
     13dd472:	48 8d 05 cb 07 70 ff 	lea    rax,[rip+0xffffffffff7007cb]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
     13dd479:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
     13dd47d:	48 8d 05 34 00 00 00 	lea    rax,[rip+0x34]        # 13dd4b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222a3c>
     13dd484:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
     13dd488:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
     13dd48c:	48 89 de             	mov    rsi,rbx
     13dd48f:	e8 ac 00 00 00       	call   13dd540 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222ac4>
     13dd494:	48 89 df             	mov    rdi,rbx
     13dd497:	e8 02 9e 6c ff       	call   aa729e <JNI_OnUnload@@Base+0x2eb6b>
     13dd49c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     13dd4a3:	00 00 
     13dd4a5:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     13dd4aa:	75 06                	jne    13dd4b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x222a36>
     13dd4ac:	48 83 c4 30          	add    rsp,0x30
     13dd4b0:	5b                   	pop    rbx
     13dd4b1:	c3                   	ret
     13dd4b2:	e8 f9 25 41 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
     13dce7d:	48 8d 05 fc 01 49 00 	lea    rax,[rip+0x4901fc]        # 186d080 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x29768>

## rank 24: score=118 AP=0x18185d0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0xc44c58 ['compact', 'pointer-field']
- +0x30=0xc44c7c ['compact', 'pointer-field']
- +0x38=0xc44ca0 ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0xc44bec FDE=(12864492, 12864528)
- +0x18: 0xc44c10 FDE=(12864528, 12864564)
- +0x20: 0xc44c34 FDE=(12864564, 12864600)
- +0x28: 0xc44c58 FDE=(12864600, 12864636)
- +0x30: 0xc44c7c FDE=(12864636, 12864672)
- +0x38: 0xc44ca0 FDE=(12864672, 12864754)
- +0x40: 0xc44cf2 FDE=(12864754, 12864790)
- +0x48: 0xc44d16 FDE=(12864790, 12864826)
- +0x50: 0xc44d3a FDE=(12864826, 12864863)
- +0x58: 0xc44d60 FDE=(12864864, 12864900)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xa50370 FDE=(10814320, 10814325)
### +0x28 body
      c44c58:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      c44c5c:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c44c5f:	48 8d 35 5b 52 78 ff 	lea    rsi,[rip+0xffffffffff78525b]        # 3c9ec1 <_ZTSN5boost9exceptionE@@Base+0x2a8a3>
      c44c66:	48 8d 0d 63 52 78 ff 	lea    rcx,[rip+0xffffffffff785263]        # 3c9ed0 <_ZTSN5boost9exceptionE@@Base+0x2a8b2>
      c44c6d:	6a 0c                	push   0xc
      c44c6f:	5a                   	pop    rdx
      c44c70:	6a 18                	push   0x18
      c44c72:	41 58                	pop    r8
      c44c74:	45 31 c9             	xor    r9d,r9d
      c44c77:	e9 ae 27 9a 00       	jmp    15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
### +0x30 body
      c44c7c:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      c44c80:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c44c83:	48 8d 35 5f 52 78 ff 	lea    rsi,[rip+0xffffffffff78525f]        # 3c9ee9 <_ZTSN5boost9exceptionE@@Base+0x2a8cb>
      c44c8a:	48 8d 0d 6f 52 78 ff 	lea    rcx,[rip+0xffffffffff78526f]        # 3c9f00 <_ZTSN5boost9exceptionE@@Base+0x2a8e2>
      c44c91:	6a 0c                	push   0xc
      c44c93:	5a                   	pop    rdx
      c44c94:	6a 14                	push   0x14
      c44c96:	41 58                	pop    r8
      c44c98:	45 31 c9             	xor    r9d,r9d
      c44c9b:	e9 8a 27 9a 00       	jmp    15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
### +0x38 body
      c44ca0:	55                   	push   rbp
      c44ca1:	53                   	push   rbx
      c44ca2:	50                   	push   rax
      c44ca3:	48 89 fb             	mov    rbx,rdi
      c44ca6:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      c44caa:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c44cad:	48 8d 35 42 50 78 ff 	lea    rsi,[rip+0xffffffffff785042]        # 3c9cf6 <_ZTSN5boost9exceptionE@@Base+0x2a6d8>
      c44cb4:	48 8d 0d 55 50 78 ff 	lea    rcx,[rip+0xffffffffff785055]        # 3c9d10 <_ZTSN5boost9exceptionE@@Base+0x2a6f2>
      c44cbb:	6a 0c                	push   0xc
      c44cbd:	5a                   	pop    rdx
      c44cbe:	6a 26                	push   0x26
      c44cc0:	41 58                	pop    r8
      c44cc2:	31 ed                	xor    ebp,ebp
      c44cc4:	45 31 c9             	xor    r9d,r9d
      c44cc7:	e8 be 26 9a 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
      c44ccc:	84 c0                	test   al,al
      c44cce:	74 19                	je     c44ce9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x191c89>
      c44cd0:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
      c44cd4:	48 8b 38             	mov    rdi,QWORD PTR [rax]
      c44cd7:	e8 e5 9d 99 00       	call   15deac1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x424045>
      c44cdc:	31 c9                	xor    ecx,ecx
      c44cde:	83 f8 02             	cmp    eax,0x2
      c44ce1:	bd 60 ae 0a 00       	mov    ebp,0xaae60
      c44ce6:	0f 45 e9             	cmovne ebp,ecx
      c44ce9:	89 e8                	mov    eax,ebp
      c44ceb:	48 83 c4 08          	add    rsp,0x8
      c44cef:	5b                   	pop    rbx
      c44cf0:	5d                   	pop    rbp
      c44cf1:	c3                   	ret
### AP materializations
      c43729:	48 8d 0d a0 4e bd 00 	lea    rcx,[rip+0xbd4ea0]        # 18185d0 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe290>

## rank 25: score=116 AP=0x1899608 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x1681154 ['pointer-field', 'delegated-pointer-getter']
- +0x30=0x168123a ['delegated-pointer-getter']
- +0x38=0x16812da ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0x1680e64 FDE=(23596644, 23596738)
- +0x8: 0x1680ec2 FDE=(23596738, 23596756)
- +0x10: 0x1680ed4 FDE=(23596756, 23596763)
- +0x18: 0x1680edc FDE=(23596764, 23596957)
- +0x20: 0x1680f9e FDE=(23596958, 23597396)
- +0x28: 0x1681154 FDE=(23597396, 23597626)
- +0x30: 0x168123a FDE=(23597626, 23597786)
- +0x38: 0x16812da FDE=(23597786, 23597949)
- +0x40: 0x168137e FDE=(23597950, 23597963)
- +0x48: 0x15cc774 FDE=(22857588, 22857661)
- +0x50: 0x168138c FDE=(23597964, 23597985)
- +0x58: 0x16813a2 FDE=(23597986, 23598214)
- +0x60: 0x1681486 FDE=(23598214, 23598445)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x168156e FDE=(23598446, 23598553)
- +0x78: 0x16815da FDE=(23598554, 23598575)
### +0x28 body
     1681154:	53                   	push   rbx
     1681155:	48 83 ec 50          	sub    rsp,0x50
     1681159:	48 89 fb             	mov    rbx,rdi
     168115c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1681163:	00 00 
     1681165:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
     168116a:	48 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [rdi+0xc8]
     1681171:	48 8b 8f d0 00 00 00 	mov    rcx,QWORD PTR [rdi+0xd0]
     1681178:	48 29 c1             	sub    rcx,rax
     168117b:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
     1681180:	48 89 4c 24 40       	mov    QWORD PTR [rsp+0x40],rcx
     1681185:	48 8b 87 20 01 00 00 	mov    rax,QWORD PTR [rdi+0x120]
     168118c:	48 8b 8f 28 01 00 00 	mov    rcx,QWORD PTR [rdi+0x128]
     1681193:	48 29 c1             	sub    rcx,rax
     1681196:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     168119b:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
     16811a0:	48 8b bf 00 02 00 00 	mov    rdi,QWORD PTR [rdi+0x200]
     16811a7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     16811aa:	ff 50 28             	call   QWORD PTR [rax+0x28]
     16811ad:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     16811b4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     16811b7:	ff 50 10             	call   QWORD PTR [rax+0x10]
     16811ba:	84 c0                	test   al,al
     16811bc:	74 4f                	je     168120d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35379>
     16811be:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     16811c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     16811c8:	ff 50 40             	call   QWORD PTR [rax+0x40]
     16811cb:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     16811d0:	48 89 06             	mov    QWORD PTR [rsi],rax
     16811d3:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     16811d7:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
     16811dc:	e8 3b 1b 00 00       	call   1682d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e88>
     16811e1:	85 c0                	test   eax,eax
     16811e3:	7e 28                	jle    168120d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35379>
     16811e5:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     16811ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     16811ef:	ff 50 40             	call   QWORD PTR [rax+0x40]
     16811f2:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     16811f7:	48 89 06             	mov    QWORD PTR [rsi],rax
     16811fa:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     16811fe:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
     1681203:	e8 14 1b 00 00       	call   1682d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e88>
     1681208:	c1 e8 1f             	shr    eax,0x1f
     168120b:	eb 02                	jmp    168120f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3537b>
     168120d:	31 c0                	xor    eax,eax
     168120f:	88 83 08 02 00 00    	mov    BYTE PTR [rbx+0x208],al
     1681215:	48 89 df             	mov    rdi,rbx
     1681218:	31 f6                	xor    esi,esi
     168121a:	e8 ad 04 00 00       	call   16816cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35838>
     168121f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1681226:	00 00 
     1681228:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     168122d:	75 06                	jne    1681235 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x353a1>
     168122f:	48 83 c4 50          	add    rsp,0x50
     1681233:	5b                   	pop    rbx
     1681234:	c3                   	ret
     1681235:	e8 76 e8 16 00       	call   17efab0 <__stack_chk_fail@plt>
### +0x30 body
     168123a:	53                   	push   rbx
     168123b:	48 83 ec 30          	sub    rsp,0x30
     168123f:	48 89 fb             	mov    rbx,rdi
     1681242:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1681249:	00 00 
     168124b:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     1681250:	48 8b bf 00 02 00 00 	mov    rdi,QWORD PTR [rdi+0x200]
     1681257:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     168125a:	ff 50 30             	call   QWORD PTR [rax+0x30]
     168125d:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     1681264:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1681267:	ff 50 10             	call   QWORD PTR [rax+0x10]
     168126a:	84 c0                	test   al,al
     168126c:	74 40                	je     16812ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3541a>
     168126e:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     1681275:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1681278:	ff 50 40             	call   QWORD PTR [rax+0x40]
     168127b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     1681280:	48 89 06             	mov    QWORD PTR [rsi],rax
     1681283:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     1681287:	48 8b 83 20 01 00 00 	mov    rax,QWORD PTR [rbx+0x120]
     168128e:	48 8b 8b 28 01 00 00 	mov    rcx,QWORD PTR [rbx+0x128]
     1681295:	48 29 c1             	sub    rcx,rax
     1681298:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     168129d:	48 89 02             	mov    QWORD PTR [rdx],rax
     16812a0:	48 89 4a 08          	mov    QWORD PTR [rdx+0x8],rcx
     16812a4:	e8 73 1a 00 00       	call   1682d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e88>
     16812a9:	c1 e8 1f             	shr    eax,0x1f
     16812ac:	eb 02                	jmp    16812b0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3541c>
     16812ae:	31 c0                	xor    eax,eax
     16812b0:	88 83 08 02 00 00    	mov    BYTE PTR [rbx+0x208],al
     16812b6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     16812bd:	00 00 
     16812bf:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     16812c4:	75 0f                	jne    16812d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35441>
     16812c6:	48 89 df             	mov    rdi,rbx
     16812c9:	31 f6                	xor    esi,esi
     16812cb:	48 83 c4 30          	add    rsp,0x30
     16812cf:	5b                   	pop    rbx
     16812d0:	e9 f7 03 00 00       	jmp    16816cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35838>
     16812d5:	e8 d6 e7 16 00       	call   17efab0 <__stack_chk_fail@plt>
### +0x38 body
     16812da:	53                   	push   rbx
     16812db:	48 83 ec 30          	sub    rsp,0x30
     16812df:	48 89 fb             	mov    rbx,rdi
     16812e2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     16812e9:	00 00 
     16812eb:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
     16812f0:	48 8b bf 00 02 00 00 	mov    rdi,QWORD PTR [rdi+0x200]
     16812f7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     16812fa:	ff 50 38             	call   QWORD PTR [rax+0x38]
     16812fd:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     1681304:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1681307:	ff 50 10             	call   QWORD PTR [rax+0x10]
     168130a:	84 c0                	test   al,al
     168130c:	74 42                	je     1681350 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354bc>
     168130e:	48 8b bb 00 02 00 00 	mov    rdi,QWORD PTR [rbx+0x200]
     1681315:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1681318:	ff 50 40             	call   QWORD PTR [rax+0x40]
     168131b:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
     1681320:	48 89 06             	mov    QWORD PTR [rsi],rax
     1681323:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     1681327:	48 8b 83 c8 00 00 00 	mov    rax,QWORD PTR [rbx+0xc8]
     168132e:	48 8b 8b d0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd0]
     1681335:	48 29 c1             	sub    rcx,rax
     1681338:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     168133d:	48 89 02             	mov    QWORD PTR [rdx],rax
     1681340:	48 89 4a 08          	mov    QWORD PTR [rdx+0x8],rcx
     1681344:	e8 d3 19 00 00       	call   1682d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e88>
     1681349:	85 c0                	test   eax,eax
     168134b:	0f 9f c0             	setg   al
     168134e:	eb 02                	jmp    1681352 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354be>
     1681350:	31 c0                	xor    eax,eax
     1681352:	88 83 08 02 00 00    	mov    BYTE PTR [rbx+0x208],al
     1681358:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     168135f:	00 00 
     1681361:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
     1681366:	75 10                	jne    1681378 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354e4>
     1681368:	6a 01                	push   0x1
     168136a:	5e                   	pop    rsi
     168136b:	48 89 df             	mov    rdi,rbx
     168136e:	48 83 c4 30          	add    rsp,0x30
     1681372:	5b                   	pop    rbx
     1681373:	e9 54 03 00 00       	jmp    16816cc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35838>
     1681378:	e8 33 e7 16 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
     15c5018:	48 8d 05 e9 45 2d 00 	lea    rax,[rip+0x2d45e9]        # 1899608 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6548>
     1680d61:	48 8d 05 a0 88 21 00 	lea    rax,[rip+0x2188a0]        # 1899608 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6548>

## rank 26: score=116 AP=0x18847e8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xc82c70 ['compact', 'pointer-field']
- +0x30=0x15bc284 ['compact', 'delegated-pointer-getter']
- +0x38=0xd886cc ['writes-rdi-output']
- +0x0: 0x15bc19a FDE=(22790554, 22790769)
- +0x8: 0x15bc272 FDE=(22790770, 22790788)
- +0x10: 0x15b8a68 FDE=(22776424, 22778622)
- +0x18: 0x15b9360 FDE=(22778720, 22789865)
- +0x20: 0x15bc100 FDE=(22790400, 22790554)
- +0x28: 0xc82c70 FDE=(13118576, 13118584)
- +0x30: 0x15bc284 FDE=(22790788, 22790824)
- +0x38: 0xd886cc FDE=(14190284, 14190292)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x15bc0c0 FDE=(22790336, 22790351)
- +0x58: 0x15bc0d0 FDE=(22790352, 22790370)
- +0x60: 0x15bc0e2 FDE=(22790370, 22790379)
- +0x68: 0x0 FDE=None
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0x0 FDE=None
### +0x28 body
      c82c70:	48 8b 87 b8 00 00 00 	mov    rax,QWORD PTR [rdi+0xb8]
      c82c77:	c3                   	ret
### +0x30 body
     15bc284:	48 8b 0e             	mov    rcx,QWORD PTR [rsi]
     15bc287:	48 83 26 00          	and    QWORD PTR [rsi],0x0
     15bc28b:	48 89 f8             	mov    rax,rdi
     15bc28e:	48 8b bf 10 01 00 00 	mov    rdi,QWORD PTR [rdi+0x110]
     15bc295:	48 89 88 10 01 00 00 	mov    QWORD PTR [rax+0x110],rcx
     15bc29c:	48 85 ff             	test   rdi,rdi
     15bc29f:	74 06                	je     15bc2a7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40182b>
     15bc2a1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15bc2a4:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
     15bc2a7:	c3                   	ret
### +0x38 body
      d886cc:	48 8b 87 10 01 00 00 	mov    rax,QWORD PTR [rdi+0x110]
      d886d3:	c3                   	ret
### AP materializations
      c2cafd:	48 8d 05 e4 7c c5 00 	lea    rax,[rip+0xc57ce4]        # 18847e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40ed0>
     15bc1a2:	48 8d 05 3f 86 2c 00 	lea    rax,[rip+0x2c863f]        # 18847e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x40ed0>

## rank 27: score=116 AP=0x184ca90 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xa7a004 ['compact', 'pointer-field']
- +0x30=0x10ae21c ['compact', 'delegated-pointer-getter']
- +0x38=0x10ae226 ['writes-rdi-output']
- +0x0: 0x10ae156 FDE=(17490262, 17490379)
- +0x8: 0x10ae1cc FDE=(17490380, 17490398)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x10ae1de FDE=(17490398, 17490460)
- +0x28: 0xa7a004 FDE=(10985476, 10985481)
- +0x30: 0x10ae21c FDE=(17490460, 17490470)
- +0x38: 0x10ae226 FDE=(17490470, 17490479)
- +0x40: 0x10ae230 FDE=(17490480, 17490499)
- +0x48: 0x10ae244 FDE=(17490500, 17490516)
- +0x50: 0xc36798 FDE=(12806040, 12806045)
- +0x58: 0xd50b8e FDE=(13962126, 13962131)
- +0x60: 0x10ae254 FDE=(17490516, 17490521)
- +0x68: 0xaa7018 FDE=(11169816, 11169821)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
### +0x30 body
     10ae21c:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
     10ae220:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     10ae223:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### +0x38 body
     10ae226:	48 8b 47 60          	mov    rax,QWORD PTR [rdi+0x60]
     10ae22a:	48 83 c0 08          	add    rax,0x8
     10ae22e:	c3                   	ret
### AP materializations
     10aba74:	48 8d 05 15 10 7a 00 	lea    rax,[rip+0x7a1015]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>
     10ae15a:	48 8d 05 2f e9 79 00 	lea    rax,[rip+0x79e92f]        # 184ca90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x9178>

## rank 28: score=115 AP=0x18919d8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x1636fe4 ['compact', 'delegated-pointer-getter']
- +0x30=0xd9495e ['compact', 'delegated-pointer-getter']
- +0x38=0x1636fee ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x1636fd0 FDE=(23293904, 23293923)
- +0x18: 0x16647e6 FDE=(23480294, 23480383)
- +0x20: 0x13dafb8 FDE=(20819896, 20819906)
- +0x28: 0x1636fe4 FDE=(23293924, 23293934)
- +0x30: 0xd9495e FDE=(14240094, 14240104)
- +0x38: 0x1636fee FDE=(23293934, 23293944)
- +0x40: 0x1636ff8 FDE=(23293944, 23293954)
- +0x48: 0x1637002 FDE=(23293954, 23293969)
- +0x50: 0x1637012 FDE=(23293970, 23293985)
- +0x58: 0x1637022 FDE=(23293986, 23294004)
- +0x60: 0x1637034 FDE=(23294004, 23294022)
- +0x68: 0x1637046 FDE=(23294022, 23294040)
- +0x70: 0x1637058 FDE=(23294040, 23294064)
- +0x78: 0x1637070 FDE=(23294064, 23294082)
### +0x28 body
     1636fe4:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
     1636fe8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1636feb:	ff 60 28             	jmp    QWORD PTR [rax+0x28]
### +0x30 body
      d9495e:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
      d94962:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d94965:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     1636fee:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
     1636ff2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1636ff5:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     1636f3f:	48 8d 05 92 aa 25 00 	lea    rax,[rip+0x25aa92]        # 18919d8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xa6b0>
     16389ca:	48 8d 05 07 90 25 00 	lea    rax,[rip+0x259007]        # 18919d8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xa6b0>

## rank 29: score=114 AP=0x1881c88 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x1586db0 ['compact', 'pointer-field']
- +0x30=0x1586db8 ['compact', 'pointer-field']
- +0x38=0x1586dc0 ['reads-rsi-this']
- +0x0: 0x1586d20 FDE=(22572320, 22572406)
- +0x8: 0x1586d76 FDE=(22572406, 22572424)
- +0x10: 0x9d81d0 FDE=(10322384, 10322387)
- +0x18: 0x1586d88 FDE=(22572424, 22572463)
- +0x20: 0x9d81d0 FDE=(10322384, 10322387)
- +0x28: 0x1586db0 FDE=(22572464, 22572472)
- +0x30: 0x1586db8 FDE=(22572472, 22572480)
- +0x38: 0x1586dc0 FDE=(22572480, 22572924)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x158754e FDE=(22574414, 22574766)
- +0x58: 0x15876ae FDE=(22574766, 22574784)
- +0x60: 0x15876c0 FDE=(22574784, 22574796)
- +0x68: 0x15876cc FDE=(22574796, 22574817)
- +0x70: 0xa3fa60 FDE=(10746464, 10746467)
- +0x78: 0x1586db0 FDE=(22572464, 22572472)
### +0x28 body
     1586db0:	48 8b 87 a0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1a0]
     1586db7:	c3                   	ret
### +0x30 body
     1586db8:	48 8b 87 a8 01 00 00 	mov    rax,QWORD PTR [rdi+0x1a8]
     1586dbf:	c3                   	ret
### +0x38 body
     1586dc0:	41 57                	push   r15
     1586dc2:	41 56                	push   r14
     1586dc4:	41 55                	push   r13
     1586dc6:	41 54                	push   r12
     1586dc8:	53                   	push   rbx
     1586dc9:	48 81 ec 20 01 00 00 	sub    rsp,0x120
     1586dd0:	49 89 d7             	mov    r15,rdx
     1586dd3:	49 89 f6             	mov    r14,rsi
     1586dd6:	48 89 fb             	mov    rbx,rdi
     1586dd9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1586de0:	00 00 
     1586de2:	48 89 84 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rax
     1586de9:	00 
     1586dea:	4c 8d 6e 18          	lea    r13,[rsi+0x18]
     1586dee:	48 81 c6 10 01 00 00 	add    rsi,0x110
     1586df5:	41 80 be c0 01 00 00 	cmp    BYTE PTR [r14+0x1c0],0x0
     1586dfc:	00 
     1586dfd:	0f 84 89 00 00 00    	je     1586e8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc410>
     1586e03:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1586e08:	e8 31 fd ff ff       	call   1586b3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc0c2>
     1586e0d:	4c 8d 64 24 78       	lea    r12,[rsp+0x78]
     1586e12:	4c 89 e7             	mov    rdi,r12
     1586e15:	4c 89 ee             	mov    rsi,r13
     1586e18:	e8 49 30 14 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     1586e1d:	4c 8d ac 24 d0 00 00 	lea    r13,[rsp+0xd0]
     1586e24:	00 
     1586e25:	49 8d b6 c8 01 00 00 	lea    rsi,[r14+0x1c8]
     1586e2c:	4c 89 ef             	mov    rdi,r13
     1586e2f:	e8 6a cc fe ff       	call   1573a9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b9022>
     1586e34:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     1586e3b:	00 
     1586e3c:	49 8d b6 f8 01 00 00 	lea    rsi,[r14+0x1f8]
     1586e43:	e8 f8 70 26 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     1586e48:	48 8d 05 61 af 2f 00 	lea    rax,[rip+0x2faf61]        # 1881db0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e498>
     1586e4f:	49 89 e0             	mov    r8,rsp
     1586e52:	49 89 00             	mov    QWORD PTR [r8],rax
     1586e55:	4d 89 70 08          	mov    QWORD PTR [r8+0x8],r14
     1586e59:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
     1586e5d:	49 81 c6 a8 00 00 00 	add    r14,0xa8
     1586e64:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1586e67:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
     1586e6c:	48 89 df             	mov    rdi,rbx
     1586e6f:	4c 89 fe             	mov    rsi,r15
     1586e72:	4c 89 f1             	mov    rcx,r14
     1586e75:	ff 50 08             	call   QWORD PTR [rax+0x8]
     1586e78:	48 89 e7             	mov    rdi,rsp
     1586e7b:	e8 ea 30 4f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1586e80:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1586e85:	e8 f2 00 00 00       	call   1586f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc500>
     1586e8a:	eb 59                	jmp    1586ee5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc469>
     1586e8c:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
     1586e91:	4c 89 e7             	mov    rdi,r12
     1586e94:	e8 a5 fc ff ff       	call   1586b3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc0c2>
     1586e99:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
     1586e9e:	4c 89 ee             	mov    rsi,r13
     1586ea1:	e8 c0 2f 14 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     1586ea6:	48 8d 05 03 af 2f 00 	lea    rax,[rip+0x2faf03]        # 1881db0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e498>
     1586ead:	49 89 e0             	mov    r8,rsp
     1586eb0:	49 89 00             	mov    QWORD PTR [r8],rax
     1586eb3:	4d 89 70 08          	mov    QWORD PTR [r8+0x8],r14
     1586eb7:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
     1586ebb:	49 81 c6 a8 00 00 00 	add    r14,0xa8
     1586ec2:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1586ec5:	48 89 df             	mov    rdi,rbx
     1586ec8:	4c 89 fe             	mov    rsi,r15
     1586ecb:	4c 89 e2             	mov    rdx,r12
     1586ece:	4c 89 f1             	mov    rcx,r14
     1586ed1:	ff 10                	call   QWORD PTR [rax]
     1586ed3:	48 89 e7             	mov    rdi,rsp
     1586ed6:	e8 8f 30 4f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1586edb:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1586ee0:	e8 05 e7 fd ff       	call   15655ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3aab6e>
     1586ee5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1586eec:	00 00 
     1586eee:	48 3b 84 24 18 01 00 	cmp    rax,QWORD PTR [rsp+0x118]
     1586ef5:	00 
     1586ef6:	75 7f                	jne    1586f77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc4fb>
     1586ef8:	48 89 d8             	mov    rax,rbx
     1586efb:	48 81 c4 20 01 00 00 	add    rsp,0x120
     1586f02:	5b                   	pop    rbx
     1586f03:	41 5c                	pop    r12
     1586f05:	41 5d                	pop    r13
     1586f07:	41 5e                	pop    r14
     1586f09:	41 5f                	pop    r15
     1586f0b:	c3                   	ret
     1586f0c:	48 89 c3             	mov    rbx,rax
     1586f0f:	48 89 e7             	mov    rdi,rsp
     1586f12:	e8 53 30 4f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1586f17:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1586f1c:	e8 c9 e6 fd ff       	call   15655ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3aab6e>
     1586f21:	eb 39                	jmp    1586f5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc4e0>
     1586f23:	48 89 c3             	mov    rbx,rax
     1586f26:	48 89 e7             	mov    rdi,rsp
     1586f29:	e8 3c 30 4f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1586f2e:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1586f33:	e8 44 00 00 00       	call   1586f7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc500>
     1586f38:	eb 22                	jmp    1586f5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc4e0>
     1586f3a:	48 89 c3             	mov    rbx,rax
     1586f3d:	4c 89 ef             	mov    rdi,r13
     1586f40:	e8 6f 67 70 ff       	call   c8d6b4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1da654>
     1586f45:	eb 03                	jmp    1586f4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc4ce>
     1586f47:	48 89 c3             	mov    rbx,rax
     1586f4a:	4c 89 e7             	mov    rdi,r12
     1586f4d:	e8 dc e3 13 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1586f52:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1586f57:	e8 a4 e6 fd ff       	call   1565600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3aab84>
     1586f5c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1586f63:	00 00 
     1586f65:	48 3b 84 24 18 01 00 	cmp    rax,QWORD PTR [rsp+0x118]
     1586f6c:	00 
     1586f6d:	75 08                	jne    1586f77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc4fb>
     1586f6f:	48 89 df             	mov    rdi,rbx
     1586f72:	e8 59 8d 4e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1586f77:	e8 34 8b 26 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
     1586c95:	48 8d 05 ec af 2f 00 	lea    rax,[rip+0x2fafec]        # 1881c88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e370>
     1586d24:	48 8d 05 5d af 2f 00 	lea    rax,[rip+0x2faf5d]        # 1881c88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e370>

## rank 30: score=114 AP=0x1867c98 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xc2e960 ['compact', 'pointer-field']
- +0x30=0xc7ddb4 ['compact', 'pointer-field']
- +0x38=0x1364c6e ['reads-rsi-this']
- +0x0: 0x1364a94 FDE=(20335252, 20335420)
- +0x8: 0x1364b3c FDE=(20335420, 20335438)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x1364b4e FDE=(20335438, 20335725)
- +0x28: 0xc2e960 FDE=(12773728, 12773736)
- +0x30: 0xc7ddb4 FDE=(13098420, 13098428)
- +0x38: 0x1364c6e FDE=(20335726, 20335770)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x1364742 FDE=(20334402, 20334421)
- +0x58: 0x1364756 FDE=(20334422, 20334440)
- +0x60: 0x1364768 FDE=(20334440, 20334602)
- +0x68: 0x136480a FDE=(20334602, 20334628)
- +0x70: 0x1364824 FDE=(20334628, 20334637)
- +0x78: 0x136482e FDE=(20334638, 20334660)
### +0x28 body
      c2e960:	48 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [rdi+0xc8]
      c2e967:	c3                   	ret
### +0x30 body
      c7ddb4:	48 8b 87 d0 00 00 00 	mov    rax,QWORD PTR [rdi+0xd0]
      c7ddbb:	c3                   	ret
### +0x38 body
     1364c6e:	48 89 f8             	mov    rax,rdi
     1364c71:	48 8b 96 a0 00 00 00 	mov    rdx,QWORD PTR [rsi+0xa0]
     1364c78:	48 85 d2             	test   rdx,rdx
     1364c7b:	74 16                	je     1364c93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa217>
     1364c7d:	48 8b 4a 10          	mov    rcx,QWORD PTR [rdx+0x10]
     1364c81:	0f 10 42 08          	movups xmm0,XMMWORD PTR [rdx+0x8]
     1364c85:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1364c88:	48 85 c9             	test   rcx,rcx
     1364c8b:	74 0c                	je     1364c99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1aa21d>
     1364c8d:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     1364c92:	c3                   	ret
     1364c93:	0f 57 c0             	xorps  xmm0,xmm0
     1364c96:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1364c99:	c3                   	ret
### AP materializations
     135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
     1364a98:	48 8d 05 f9 31 50 00 	lea    rax,[rip+0x5031f9]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>

## rank 31: score=111 AP=0x18997d0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x162d53e ['compact', 'delegated-pointer-getter']
- +0x30=0x162d54c ['compact', 'delegated-pointer-getter']
- +0x38=0x162d55a ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x162d4d6 FDE=(23254230, 23254255)
- +0x8: 0x162d4f0 FDE=(23254256, 23254274)
- +0x10: 0x16828cc FDE=(23603404, 23603417)
- +0x18: 0x162d522 FDE=(23254306, 23254319)
- +0x20: 0x162d530 FDE=(23254320, 23254333)
- +0x28: 0x162d53e FDE=(23254334, 23254347)
- +0x30: 0x162d54c FDE=(23254348, 23254361)
- +0x38: 0x162d55a FDE=(23254362, 23254375)
- +0x40: 0x16828da FDE=(23603418, 23603440)
- +0x48: 0x162d59a FDE=(23254426, 23254439)
- +0x50: 0x162d5a8 FDE=(23254440, 23254456)
- +0x58: 0x162d5b8 FDE=(23254456, 23254475)
- +0x60: 0x16823b4 FDE=(23602100, 23602253)
- +0x68: 0x168244e FDE=(23602254, 23602501)
- +0x70: 0x162d5cc FDE=(23254476, 23254492)
- +0x78: 0x162d5dc FDE=(23254492, 23254505)
### +0x28 body
     162d53e:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d545:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d548:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x30 body
     162d54c:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d553:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d556:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### +0x38 body
     162d55a:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d561:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d564:	ff 60 48             	jmp    QWORD PTR [rax+0x48]
### AP materializations
     16827fb:	48 8d 05 ce 6f 21 00 	lea    rax,[rip+0x216fce]        # 18997d0 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6710>

## rank 32: score=111 AP=0x1890158 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x162d53e ['compact', 'delegated-pointer-getter']
- +0x30=0x162d54c ['compact', 'delegated-pointer-getter']
- +0x38=0x162d55a ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x162d4d6 FDE=(23254230, 23254255)
- +0x8: 0x162d4f0 FDE=(23254256, 23254274)
- +0x10: 0x162d502 FDE=(23254274, 23254306)
- +0x18: 0x162d522 FDE=(23254306, 23254319)
- +0x20: 0x162d530 FDE=(23254320, 23254333)
- +0x28: 0x162d53e FDE=(23254334, 23254347)
- +0x30: 0x162d54c FDE=(23254348, 23254361)
- +0x38: 0x162d55a FDE=(23254362, 23254375)
- +0x40: 0x162d568 FDE=(23254376, 23254426)
- +0x48: 0x162d59a FDE=(23254426, 23254439)
- +0x50: 0x162d5a8 FDE=(23254440, 23254456)
- +0x58: 0x162d5b8 FDE=(23254456, 23254475)
- +0x60: 0x16823b4 FDE=(23602100, 23602253)
- +0x68: 0x168244e FDE=(23602254, 23602501)
- +0x70: 0x162d5cc FDE=(23254476, 23254492)
- +0x78: 0x162d5dc FDE=(23254492, 23254505)
### +0x28 body
     162d53e:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d545:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d548:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x30 body
     162d54c:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d553:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d556:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### +0x38 body
     162d55a:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]
     162d561:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     162d564:	ff 60 48             	jmp    QWORD PTR [rax+0x48]
### AP materializations
     162d4b6:	48 8d 05 9b 2c 26 00 	lea    rax,[rip+0x262c9b]        # 1890158 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x8e30>

## rank 33: score=111 AP=0x185d9b8 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x123a2b0 ['compact', 'delegated-pointer-getter']
- +0x30=0xb7d2ca ['compact', 'delegated-pointer-getter']
- +0x38=0xbd7f6a ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0xe8f23c FDE=(15266364, 15266374)
- +0x18: 0xb7d29e FDE=(12047006, 12047016)
- +0x20: 0x123a2a6 FDE=(19112614, 19112624)
- +0x28: 0x123a2b0 FDE=(19112624, 19112634)
- +0x30: 0xb7d2ca FDE=(12047050, 12047060)
- +0x38: 0xbd7f6a FDE=(12418922, 12418932)
- +0x40: 0x123a2ba FDE=(19112634, 19112644)
- +0x48: 0xbd7fd2 FDE=(12419026, 12419036)
- +0x50: 0xc7e4d4 FDE=(13100244, 13100254)
- +0x58: 0x123a2c4 FDE=(19112644, 19112654)
- +0x60: 0x123a2ce FDE=(19112654, 19112664)
- +0x68: 0xbd800c FDE=(12419084, 12419094)
- +0x70: 0x123a2d8 FDE=(19112664, 19112674)
- +0x78: 0xbd8086 FDE=(12419206, 12419216)
### +0x28 body
     123a2b0:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     123a2b4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     123a2b7:	ff 60 28             	jmp    QWORD PTR [rax+0x28]
### +0x30 body
      b7d2ca:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b7d2ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b7d2d1:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
      bd7f6a:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      bd7f6e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bd7f71:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     1234a84:	48 8d 0d 2d 8f 62 00 	lea    rcx,[rip+0x628f2d]        # 185d9b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x1a0a0>

## rank 34: score=111 AP=0x1852848 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x1130f52 ['compact', 'delegated-pointer-getter']
- +0x30=0x1130f6a ['compact', 'delegated-pointer-getter']
- +0x38=0x1130f86 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x1130ed6 FDE=(18026198, 18026220)
- +0x8: 0x1130eec FDE=(18026220, 18026238)
- +0x10: 0x1130efe FDE=(18026238, 18026264)
- +0x18: 0x1130f18 FDE=(18026264, 18026291)
- +0x20: 0x1130f34 FDE=(18026292, 18026322)
- +0x28: 0x1130f52 FDE=(18026322, 18026345)
- +0x30: 0x1130f6a FDE=(18026346, 18026373)
- +0x38: 0x1130f86 FDE=(18026374, 18026404)
- +0x40: 0xe02660 FDE=(14689888, 14689898)
- +0x48: 0xbf5442 FDE=(12538946, 12538956)
- +0x50: 0x1135b30 FDE=(18045744, 18045788)
- +0x58: 0x113596e FDE=(18045294, 18045350)
- +0x60: 0x11359a6 FDE=(18045350, 18045406)
- +0x68: 0xbf547c FDE=(12539004, 12539014)
- +0x70: 0x1135b5c FDE=(18045788, 18045807)
- +0x78: 0x1135b70 FDE=(18045808, 18045827)
### +0x28 body
     1130f52:	53                   	push   rbx
     1130f53:	48 89 fb             	mov    rbx,rdi
     1130f56:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
     1130f5a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1130f5d:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1130f60:	48 89 df             	mov    rdi,rbx
     1130f63:	5b                   	pop    rbx
     1130f64:	e9 3b 00 00 00       	jmp    1130fa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f83ba>
### +0x30 body
     1130f6a:	53                   	push   rbx
     1130f6b:	48 89 fb             	mov    rbx,rdi
     1130f6e:	83 67 60 00          	and    DWORD PTR [rdi+0x60],0x0
     1130f72:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
     1130f76:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1130f79:	ff 50 30             	call   QWORD PTR [rax+0x30]
     1130f7c:	48 89 df             	mov    rdi,rbx
     1130f7f:	5b                   	pop    rbx
     1130f80:	e9 1f 00 00 00       	jmp    1130fa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f83ba>
### +0x38 body
     1130f86:	53                   	push   rbx
     1130f87:	48 89 fb             	mov    rbx,rdi
     1130f8a:	c7 47 60 01 00 00 00 	mov    DWORD PTR [rdi+0x60],0x1
     1130f91:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
     1130f95:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1130f98:	ff 50 38             	call   QWORD PTR [rax+0x38]
     1130f9b:	48 89 df             	mov    rdi,rbx
     1130f9e:	5b                   	pop    rbx
     1130f9f:	e9 00 00 00 00       	jmp    1130fa4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f83ba>
### AP materializations
     1130e86:	48 8d 0d bb 19 72 00 	lea    rcx,[rip+0x7219bb]        # 1852848 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xef30>

## rank 35: score=104 AP=0x1892e00 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x30=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x38=0x9d81d0 []
- +0x0: 0x164a2ba FDE=(23372474, 23373007)
- +0x8: 0x164a4d0 FDE=(23373008, 23373026)
- +0x10: 0x164a4e2 FDE=(23373026, 23373069)
- +0x18: 0x163ef12 FDE=(23326482, 23326571)
- +0x20: 0x164ad70 FDE=(23375216, 23375225)
- +0x28: 0xd1b8fe FDE=(13744382, 13744387)
- +0x30: 0xd1b8fe FDE=(13744382, 13744387)
- +0x38: 0x9d81d0 FDE=(10322384, 10322387)
- +0x40: 0x9d81d0 FDE=(10322384, 10322387)
- +0x48: 0xa10ec0 FDE=(10555072, 10555076)
- +0x50: 0xa10ec0 FDE=(10555072, 10555076)
- +0x58: 0x9d81d0 FDE=(10322384, 10322387)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0x9d81d0 FDE=(10322384, 10322387)
### +0x28 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x30 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x38 body
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
### AP materializations
     1640ac5:	48 8d 05 34 23 25 00 	lea    rax,[rip+0x252334]        # 1892e00 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbad8>
     164a2d9:	48 8d 05 20 8b 24 00 	lea    rax,[rip+0x248b20]        # 1892e00 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xbad8>

## rank 36: score=104 AP=0x18927d0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x30=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x38=0x9d81d0 []
- +0x0: 0x164167e FDE=(23336574, 23337051)
- +0x8: 0x164185c FDE=(23337052, 23337070)
- +0x10: 0x164186e FDE=(23337070, 23337120)
- +0x18: 0x163ef12 FDE=(23326482, 23326571)
- +0x20: 0x164ad70 FDE=(23375216, 23375225)
- +0x28: 0xd1b8fe FDE=(13744382, 13744387)
- +0x30: 0xd1b8fe FDE=(13744382, 13744387)
- +0x38: 0x9d81d0 FDE=(10322384, 10322387)
- +0x40: 0x9d81d0 FDE=(10322384, 10322387)
- +0x48: 0x9d81d0 FDE=(10322384, 10322387)
- +0x50: 0x9d81d0 FDE=(10322384, 10322387)
- +0x58: 0x9d81d0 FDE=(10322384, 10322387)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0xa10ec0 FDE=(10555072, 10555076)
### +0x28 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x30 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x38 body
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
### AP materializations
     1641163:	48 8d 05 66 16 25 00 	lea    rax,[rip+0x251666]        # 18927d0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb4a8>
     164169d:	48 8d 05 2c 11 25 00 	lea    rax,[rip+0x25112c]        # 18927d0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb4a8>

## rank 37: score=104 AP=0x18924b0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x30=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x38=0xa10ec0 []
- +0x0: 0x163ef6c FDE=(23326572, 23327245)
- +0x8: 0x163f20e FDE=(23327246, 23327264)
- +0x10: 0x163f220 FDE=(23327264, 23327315)
- +0x18: 0x163ef12 FDE=(23326482, 23326571)
- +0x20: 0x164ad70 FDE=(23375216, 23375225)
- +0x28: 0xd1b8fe FDE=(13744382, 13744387)
- +0x30: 0xd1b8fe FDE=(13744382, 13744387)
- +0x38: 0xa10ec0 FDE=(10555072, 10555076)
- +0x40: 0xa10ec0 FDE=(10555072, 10555076)
- +0x48: 0x9d81d0 FDE=(10322384, 10322387)
- +0x50: 0x9d81d0 FDE=(10322384, 10322387)
- +0x58: 0x9d81d0 FDE=(10322384, 10322387)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0x9d81d0 FDE=(10322384, 10322387)
### +0x28 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x30 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x38 body
      a10ec0:	48 89 f8             	mov    rax,rdi
      a10ec3:	c3                   	ret
### AP materializations
     14c87dc:	48 8d 05 cd 9c 3c 00 	lea    rax,[rip+0x3c9ccd]        # 18924b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb188>
     163ef8b:	48 8d 05 1e 35 25 00 	lea    rax,[rip+0x25351e]        # 18924b0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb188>

## rank 38: score=104 AP=0x1881d28 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x1586db0 ['compact', 'pointer-field']
- +0x30=0x1586db8 ['compact', 'pointer-field']
- +0x38=0x1587c10 []
- +0x0: 0x1587a9e FDE=(22575774, 22576126)
- +0x8: 0x1587bfe FDE=(22576126, 22576144)
- +0x10: 0x9d81d0 FDE=(10322384, 10322387)
- +0x18: 0x15876cc FDE=(22574796, 22574817)
- +0x20: 0x9d81d0 FDE=(10322384, 10322387)
- +0x28: 0x1586db0 FDE=(22572464, 22572472)
- +0x30: 0x1586db8 FDE=(22572472, 22572480)
- +0x38: 0x1587c10 FDE=(22576144, 22576533)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x1586960 FDE=(22571360, 22571375)
- +0x58: 0x1586970 FDE=(22571376, 22571394)
- +0x60: 0x1586982 FDE=(22571394, 22571453)
- +0x68: 0x0 FDE=None
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0x0 FDE=None
### +0x28 body
     1586db0:	48 8b 87 a0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1a0]
     1586db7:	c3                   	ret
### +0x30 body
     1586db8:	48 8b 87 a8 01 00 00 	mov    rax,QWORD PTR [rdi+0x1a8]
     1586dbf:	c3                   	ret
### +0x38 body
     1587c10:	55                   	push   rbp
     1587c11:	41 57                	push   r15
     1587c13:	41 56                	push   r14
     1587c15:	41 55                	push   r13
     1587c17:	41 54                	push   r12
     1587c19:	53                   	push   rbx
     1587c1a:	48 81 ec 18 01 00 00 	sub    rsp,0x118
     1587c21:	49 89 d7             	mov    r15,rdx
     1587c24:	49 89 f6             	mov    r14,rsi
     1587c27:	48 89 fb             	mov    rbx,rdi
     1587c2a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1587c31:	00 00 
     1587c33:	48 89 84 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rax
     1587c3a:	00 
     1587c3b:	48 81 c6 10 01 00 00 	add    rsi,0x110
     1587c42:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1587c47:	e8 f2 ee ff ff       	call   1586b3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc0c2>
     1587c4c:	4c 8d 64 24 78       	lea    r12,[rsp+0x78]
     1587c51:	49 8d 76 18          	lea    rsi,[r14+0x18]
     1587c55:	4c 89 e7             	mov    rdi,r12
     1587c58:	e8 09 22 14 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     1587c5d:	49 8b ae a0 01 00 00 	mov    rbp,QWORD PTR [r14+0x1a0]
     1587c64:	49 83 64 24 60 00    	and    QWORD PTR [r12+0x60],0x0
     1587c6a:	48 8d 05 f7 da 31 00 	lea    rax,[rip+0x31daf7]        # 18a5768 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x126a8>
     1587c71:	49 89 44 24 58       	mov    QWORD PTR [r12+0x58],rax
     1587c76:	48 8b 75 08          	mov    rsi,QWORD PTR [rbp+0x8]
     1587c7a:	40 f6 c6 01          	test   sil,0x1
     1587c7e:	74 15                	je     1587c95 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cd219>
     1587c80:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1587c87:	00 
     1587c88:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
     1587c8c:	48 83 c6 08          	add    rsi,0x8
     1587c90:	e8 6b 68 1c 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
     1587c95:	8b 45 10             	mov    eax,DWORD PTR [rbp+0x10]
     1587c98:	4c 8d ac 24 e8 00 00 	lea    r13,[rsp+0xe8]
     1587c9f:	00 
     1587ca0:	41 89 45 f8          	mov    DWORD PTR [r13-0x8],eax
     1587ca4:	41 83 65 fc 00       	and    DWORD PTR [r13-0x4],0x0
     1587ca9:	48 8d 55 18          	lea    rdx,[rbp+0x18]
     1587cad:	4c 89 ef             	mov    rdi,r13
     1587cb0:	31 f6                	xor    esi,esi
     1587cb2:	e8 d1 68 13 00       	call   16be588 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x726f4>
     1587cb7:	48 8b 7d 30          	mov    rdi,QWORD PTR [rbp+0x30]
     1587cbb:	31 f6                	xor    esi,esi
     1587cbd:	e8 44 30 52 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1587cc2:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
     1587cc7:	48 89 82 c8 00 00 00 	mov    QWORD PTR [rdx+0xc8],rax
     1587cce:	8a 45 38             	mov    al,BYTE PTR [rbp+0x38]
     1587cd1:	88 82 d0 00 00 00    	mov    BYTE PTR [rdx+0xd0],al
     1587cd7:	48 8d 05 d2 a0 2f 00 	lea    rax,[rip+0x2fa0d2]        # 1881db0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e498>
     1587cde:	49 89 e0             	mov    r8,rsp
     1587ce1:	49 89 00             	mov    QWORD PTR [r8],rax
     1587ce4:	4d 89 70 08          	mov    QWORD PTR [r8+0x8],r14
     1587ce8:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
     1587cec:	49 81 c6 a8 00 00 00 	add    r14,0xa8
     1587cf3:	49 8b 07             	mov    rax,QWORD PTR [r15]
     1587cf6:	48 89 df             	mov    rdi,rbx
     1587cf9:	4c 89 fe             	mov    rsi,r15
     1587cfc:	4c 89 f1             	mov    rcx,r14
     1587cff:	ff 50 18             	call   QWORD PTR [rax+0x18]
     1587d02:	48 89 e7             	mov    rdi,rsp
     1587d05:	e8 60 22 4f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1587d0a:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1587d0f:	e8 82 00 00 00       	call   1587d96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cd31a>
     1587d14:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1587d1b:	00 00 
     1587d1d:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
     1587d24:	00 
     1587d25:	75 69                	jne    1587d90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cd314>
     1587d27:	48 89 d8             	mov    rax,rbx
     1587d2a:	48 81 c4 18 01 00 00 	add    rsp,0x118
     1587d31:	5b                   	pop    rbx
     1587d32:	41 5c                	pop    r12
     1587d34:	41 5d                	pop    r13
     1587d36:	41 5e                	pop    r14
     1587d38:	41 5f                	pop    r15
     1587d3a:	5d                   	pop    rbp
     1587d3b:	c3                   	ret
     1587d3c:	48 89 c3             	mov    rbx,rax
     1587d3f:	48 89 e7             	mov    rdi,rsp
     1587d42:	e8 23 22 4f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1587d47:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1587d4c:	e8 45 00 00 00       	call   1587d96 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cd31a>
     1587d51:	eb 22                	jmp    1587d75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cd2f9>
     1587d53:	48 89 c3             	mov    rbx,rax
     1587d56:	4c 89 ef             	mov    rdi,r13
     1587d59:	e8 8c e6 fe ff       	call   15763ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bb96e>
     1587d5e:	eb 03                	jmp    1587d63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cd2e7>
     1587d60:	48 89 c3             	mov    rbx,rax
     1587d63:	4c 89 e7             	mov    rdi,r12
     1587d66:	e8 c3 d5 13 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1587d6b:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
     1587d70:	e8 8b d8 fd ff       	call   1565600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3aab84>
     1587d75:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1587d7c:	00 00 
     1587d7e:	48 3b 84 24 10 01 00 	cmp    rax,QWORD PTR [rsp+0x110]
     1587d85:	00 
     1587d86:	75 08                	jne    1587d90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cd314>
     1587d88:	48 89 df             	mov    rdi,rbx
     1587d8b:	e8 40 7f 4e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1587d90:	e8 1b 7d 26 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
     1587a51:	48 8d 05 d0 a2 2f 00 	lea    rax,[rip+0x2fa2d0]        # 1881d28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e410>
     1587aaf:	48 8d 05 72 a2 2f 00 	lea    rax,[rip+0x2fa272]        # 1881d28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e410>

## rank 39: score=104 AP=0x1881cd8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x1586db0 ['compact', 'pointer-field']
- +0x30=0x1586db8 ['compact', 'pointer-field']
- +0x38=0x15876e2 []
- +0x0: 0x158754e FDE=(22574414, 22574766)
- +0x8: 0x15876ae FDE=(22574766, 22574784)
- +0x10: 0x15876c0 FDE=(22574784, 22574796)
- +0x18: 0x15876cc FDE=(22574796, 22574817)
- +0x20: 0xa3fa60 FDE=(10746464, 10746467)
- +0x28: 0x1586db0 FDE=(22572464, 22572472)
- +0x30: 0x1586db8 FDE=(22572472, 22572480)
- +0x38: 0x15876e2 FDE=(22574818, 22575262)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x1587a9e FDE=(22575774, 22576126)
- +0x58: 0x1587bfe FDE=(22576126, 22576144)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x15876cc FDE=(22574796, 22574817)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0x1586db0 FDE=(22572464, 22572472)
### +0x28 body
     1586db0:	48 8b 87 a0 01 00 00 	mov    rax,QWORD PTR [rdi+0x1a0]
     1586db7:	c3                   	ret
### +0x30 body
     1586db8:	48 8b 87 a8 01 00 00 	mov    rax,QWORD PTR [rdi+0x1a8]
     1586dbf:	c3                   	ret
### +0x38 body
     15876e2:	55                   	push   rbp
     15876e3:	41 57                	push   r15
     15876e5:	41 56                	push   r14
     15876e7:	41 55                	push   r13
     15876e9:	41 54                	push   r12
     15876eb:	53                   	push   rbx
     15876ec:	48 81 ec 28 01 00 00 	sub    rsp,0x128
     15876f3:	49 89 d4             	mov    r12,rdx
     15876f6:	49 89 f7             	mov    r15,rsi
     15876f9:	48 89 fb             	mov    rbx,rdi
     15876fc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1587703:	00 00 
     1587705:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
     158770c:	00 
     158770d:	48 81 c6 10 01 00 00 	add    rsi,0x110
     1587714:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1587719:	e8 20 f4 ff ff       	call   1586b3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cc0c2>
     158771e:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
     1587723:	49 8d 77 18          	lea    rsi,[r15+0x18]
     1587727:	4c 89 f7             	mov    rdi,r14
     158772a:	e8 37 27 14 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
     158772f:	41 8a 87 c0 01 00 00 	mov    al,BYTE PTR [r15+0x1c0]
     1587736:	41 88 46 58          	mov    BYTE PTR [r14+0x58],al
     158773a:	49 8b af a0 01 00 00 	mov    rbp,QWORD PTR [r15+0x1a0]
     1587741:	49 83 66 68 00       	and    QWORD PTR [r14+0x68],0x0
     1587746:	48 8d 05 9b e6 31 00 	lea    rax,[rip+0x31e69b]        # 18a5de8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x12d28>
     158774d:	49 89 46 60          	mov    QWORD PTR [r14+0x60],rax
     1587751:	48 8b 75 08          	mov    rsi,QWORD PTR [rbp+0x8]
     1587755:	40 f6 c6 01          	test   sil,0x1
     1587759:	74 15                	je     1587770 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cccf4>
     158775b:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
     1587762:	00 
     1587763:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
     1587767:	48 83 c6 08          	add    rsi,0x8
     158776b:	e8 90 6d 1c 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
     1587770:	8b 45 10             	mov    eax,DWORD PTR [rbp+0x10]
     1587773:	4c 8d ac 24 e8 00 00 	lea    r13,[rsp+0xe8]
     158777a:	00 
     158777b:	41 89 45 f8          	mov    DWORD PTR [r13-0x8],eax
     158777f:	48 8d 75 18          	lea    rsi,[rbp+0x18]
     1587783:	0f 57 c0             	xorps  xmm0,xmm0
     1587786:	41 0f 11 45 fc       	movups XMMWORD PTR [r13-0x4],xmm0
     158778b:	41 0f 11 45 08       	movups XMMWORD PTR [r13+0x8],xmm0
     1587790:	4c 89 ef             	mov    rdi,r13
     1587793:	e8 3c 03 ff ff       	call   1577ad4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bd058>
     1587798:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
     158779f:	00 
     15877a0:	48 8d 55 30          	lea    rdx,[rbp+0x30]
     15877a4:	31 f6                	xor    esi,esi
     15877a6:	e8 ff 52 5d ff       	call   b5caaa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa9a4a>
     15877ab:	48 8b 7d 40          	mov    rdi,QWORD PTR [rbp+0x40]
     15877af:	31 f6                	xor    esi,esi
     15877b1:	e8 50 35 52 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     15877b6:	48 8d 54 24 30       	lea    rdx,[rsp+0x30]
     15877bb:	48 89 82 e0 00 00 00 	mov    QWORD PTR [rdx+0xe0],rax
     15877c2:	0f b7 45 48          	movzx  eax,WORD PTR [rbp+0x48]
     15877c6:	66 89 82 e8 00 00 00 	mov    WORD PTR [rdx+0xe8],ax
     15877cd:	48 8d 05 dc a5 2f 00 	lea    rax,[rip+0x2fa5dc]        # 1881db0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e498>
     15877d4:	49 89 e0             	mov    r8,rsp
     15877d7:	49 89 00             	mov    QWORD PTR [r8],rax
     15877da:	4d 89 78 08          	mov    QWORD PTR [r8+0x8],r15
     15877de:	4d 89 40 20          	mov    QWORD PTR [r8+0x20],r8
     15877e2:	49 81 c7 a8 00 00 00 	add    r15,0xa8
     15877e9:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     15877ed:	48 89 df             	mov    rdi,rbx
     15877f0:	4c 89 e6             	mov    rsi,r12
     15877f3:	4c 89 f9             	mov    rcx,r15
     15877f6:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15877f9:	48 89 e7             	mov    rdi,rsp
     15877fc:	e8 69 27 4f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1587801:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1587806:	e8 93 00 00 00       	call   158789e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cce22>
     158780b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1587812:	00 00 
     1587814:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     158781b:	00 
     158781c:	75 7b                	jne    1587899 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cce1d>
     158781e:	48 89 d8             	mov    rax,rbx
     1587821:	48 81 c4 28 01 00 00 	add    rsp,0x128
     1587828:	5b                   	pop    rbx
     1587829:	41 5c                	pop    r12
     158782b:	41 5d                	pop    r13
     158782d:	41 5e                	pop    r14
     158782f:	41 5f                	pop    r15
     1587831:	5d                   	pop    rbp
     1587832:	c3                   	ret
     1587833:	48 89 c3             	mov    rbx,rax
     1587836:	48 89 e7             	mov    rdi,rsp
     1587839:	e8 2c 27 4f ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     158783e:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1587843:	e8 56 00 00 00       	call   158789e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cce22>
     1587848:	eb 34                	jmp    158787e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cce02>
     158784a:	48 89 c3             	mov    rbx,rax
     158784d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
     1587854:	00 
     1587855:	e8 18 7a 53 ff       	call   abf272 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc212>
     158785a:	eb 03                	jmp    158785f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ccde3>
     158785c:	48 89 c3             	mov    rbx,rax
     158785f:	4c 89 ef             	mov    rdi,r13
     1587862:	e8 c5 eb fe ff       	call   157642c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3bb9b0>
     1587867:	eb 03                	jmp    158786c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3ccdf0>
     1587869:	48 89 c3             	mov    rbx,rax
     158786c:	4c 89 f7             	mov    rdi,r14
     158786f:	e8 ba da 13 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1587874:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1587879:	e8 82 dd fd ff       	call   1565600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3aab84>
     158787e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1587885:	00 00 
     1587887:	48 3b 84 24 20 01 00 	cmp    rax,QWORD PTR [rsp+0x120]
     158788e:	00 
     158788f:	75 08                	jne    1587899 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3cce1d>
     1587891:	48 89 df             	mov    rdi,rbx
     1587894:	e8 37 84 4e ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1587899:	e8 12 82 26 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
     15874f9:	48 8d 05 d8 a7 2f 00 	lea    rax,[rip+0x2fa7d8]        # 1881cd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e3c0>
     158755f:	48 8d 05 72 a7 2f 00 	lea    rax,[rip+0x2fa772]        # 1881cd8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e3c0>

## rank 40: score=104 AP=0x186ecd0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xbf7896 ['compact', 'pointer-field']
- +0x30=0xb04950 ['compact', 'pointer-field']
- +0x38=0x13f43ac []
- +0x0: 0x13f3970 FDE=(20920688, 20920736)
- +0x8: 0x13f39a0 FDE=(20920736, 20920754)
- +0x10: 0x13f39b2 FDE=(20920754, 20920762)
- +0x18: 0x13f39ba FDE=(20920762, 20922529)
- +0x20: 0x13f40a2 FDE=(20922530, 20923308)
- +0x28: 0xbf7896 FDE=(12548246, 12548251)
- +0x30: 0xb04950 FDE=(11553104, 11553109)
- +0x38: 0x13f43ac FDE=(20923308, 20923316)
- +0x40: 0x13f43b4 FDE=(20923316, 20923340)
- +0x48: 0x13f43cc FDE=(20923340, 20923800)
- +0x50: 0x13f4598 FDE=(20923800, 20923821)
- +0x58: 0x13f45ae FDE=(20923822, 20923973)
- +0x60: 0x13f4646 FDE=(20923974, 20923982)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
      bf7896:	48 8b 47 28          	mov    rax,QWORD PTR [rdi+0x28]
      bf789a:	c3                   	ret
### +0x30 body
      b04950:	48 8b 47 30          	mov    rax,QWORD PTR [rdi+0x30]
      b04954:	c3                   	ret
### +0x38 body
     13f43ac:	83 7f 18 05          	cmp    DWORD PTR [rdi+0x18],0x5
     13f43b0:	0f 94 c0             	sete   al
     13f43b3:	c3                   	ret
### AP materializations
     13f3906:	48 8d 05 c3 b3 47 00 	lea    rax,[rip+0x47b3c3]        # 186ecd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b3b8>
     13f3974:	48 8d 05 55 b3 47 00 	lea    rax,[rip+0x47b355]        # 186ecd0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x2b3b8>

## rank 41: score=104 AP=0x185d258 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xd95720 ['compact', 'this-relative-pointer']
- +0x30=0x1137574 ['compact', 'this-relative-pointer']
- +0x38=0x122caf2 []
- +0x0: 0x122c924 FDE=(19056932, 19057375)
- +0x8: 0x122cae0 FDE=(19057376, 19057394)
- +0x10: 0xaf6576 FDE=(11494774, 11494779)
- +0x18: 0xaa7012 FDE=(11169810, 11169815)
- +0x20: 0xacf158 FDE=(11333976, 11333981)
- +0x28: 0xd95720 FDE=(14243616, 14243621)
- +0x30: 0x1137574 FDE=(18052468, 18052476)
- +0x38: 0x122caf2 FDE=(19057394, 19057402)
- +0x40: 0xdf3062 FDE=(14626914, 14626922)
- +0x48: 0x1217ee0 FDE=(18972384, 18972392)
- +0x50: 0x122cafa FDE=(19057402, 19057410)
- +0x58: 0x122cb02 FDE=(19057410, 19057418)
- +0x60: 0x122cb0a FDE=(19057418, 19057426)
- +0x68: 0x122cb12 FDE=(19057426, 19057434)
- +0x70: 0x122cb1a FDE=(19057434, 19057442)
- +0x78: 0x122cb22 FDE=(19057442, 19057450)
### +0x28 body
      d95720:	48 8d 47 68          	lea    rax,[rdi+0x68]
      d95724:	c3                   	ret
### +0x30 body
     1137574:	48 8d 87 90 00 00 00 	lea    rax,[rdi+0x90]
     113757b:	c3                   	ret
### +0x38 body
     122caf2:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
     122caf9:	c3                   	ret
### AP materializations
     122bec4:	48 8d 05 8d 13 63 00 	lea    rax,[rip+0x63138d]        # 185d258 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19940>
     1235578:	48 8d 05 d9 7c 62 00 	lea    rax,[rip+0x627cd9]        # 185d258 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19940>

## rank 42: score=104 AP=0x185b948 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x11f99ea ['compact', 'pointer-field']
- +0x30=0x11f99f2 ['compact', 'this-relative-pointer']
- +0x38=0x11f99fa []
- +0x0: 0x11f9384 FDE=(18846596, 18847792)
- +0x8: 0x11f9830 FDE=(18847792, 18847810)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0x11f9842 FDE=(18847810, 18848234)
- +0x28: 0x11f99ea FDE=(18848234, 18848242)
- +0x30: 0x11f99f2 FDE=(18848242, 18848250)
- +0x38: 0x11f99fa FDE=(18848250, 18848258)
- +0x40: 0x11f9a02 FDE=(18848258, 18848266)
- +0x48: 0xa4b930 FDE=(10795312, 10795320)
- +0x50: 0x11f9a0a FDE=(18848266, 18848274)
- +0x58: 0x11f9a12 FDE=(18848274, 18848303)
- +0x60: 0x11f9a30 FDE=(18848304, 18848312)
- +0x68: 0x11f9a38 FDE=(18848312, 18848320)
- +0x70: 0x11f9a40 FDE=(18848320, 18848559)
- +0x78: 0x0 FDE=None
### +0x28 body
     11f99ea:	48 8b 87 00 4b 00 00 	mov    rax,QWORD PTR [rdi+0x4b00]
     11f99f1:	c3                   	ret
### +0x30 body
     11f99f2:	48 8d 87 10 4b 00 00 	lea    rax,[rdi+0x4b10]
     11f99f9:	c3                   	ret
### +0x38 body
     11f99fa:	48 8d 87 f0 22 00 00 	lea    rax,[rdi+0x22f0]
     11f9a01:	c3                   	ret
### AP materializations
     11ef37a:	48 8d 05 c7 c5 66 00 	lea    rax,[rip+0x66c5c7]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>
     11f938c:	48 8d 05 b5 25 66 00 	lea    rax,[rip+0x6625b5]        # 185b948 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18030>

## rank 43: score=104 AP=0x182b840 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xb00302 ['compact', 'this-relative-pointer']
- +0x30=0xc44ec4 ['compact', 'this-relative-pointer']
- +0x38=0xdf3062 []
- +0x0: 0xdf2ebe FDE=(14626494, 14626833)
- +0x8: 0xdf3012 FDE=(14626834, 14626852)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xdf3024 FDE=(14626852, 14626914)
- +0x28: 0xb00302 FDE=(11535106, 11535111)
- +0x30: 0xc44ec4 FDE=(12865220, 12865228)
- +0x38: 0xdf3062 FDE=(14626914, 14626922)
- +0x40: 0xc44ebc FDE=(12865212, 12865220)
- +0x48: 0xdf306a FDE=(14626922, 14626968)
- +0x50: 0xdf3098 FDE=(14626968, 14626999)
- +0x58: 0xdf30b8 FDE=(14627000, 14627018)
- +0x60: 0xdf30ca FDE=(14627018, 14627049)
- +0x68: 0xdf30ea FDE=(14627050, 14627081)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret
### +0x30 body
      c44ec4:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
      c44ecb:	c3                   	ret
### +0x38 body
      df3062:	48 8d 87 e0 00 00 00 	lea    rax,[rdi+0xe0]
      df3069:	c3                   	ret
### AP materializations
      deb84e:	48 8d 05 eb ff a3 00 	lea    rax,[rip+0xa3ffeb]        # 182b840 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7e70>
      df2ec2:	48 8d 05 77 89 a3 00 	lea    rax,[rip+0xa38977]        # 182b840 <_ZTIN4asio2ip16bad_address_castE@@Base+0x7e70>

## rank 44: score=104 AP=0x181bcd8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xa4b870 ['compact', 'this-relative-pointer']
- +0x30=0xb00302 ['compact', 'this-relative-pointer']
- +0x38=0xc44ebc []
- +0x0: 0xc82c0c FDE=(13118476, 13118557)
- +0x8: 0xc82c5e FDE=(13118558, 13118576)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xa4b870 FDE=(10795120, 10795125)
- +0x30: 0xb00302 FDE=(11535106, 11535111)
- +0x38: 0xc44ebc FDE=(12865212, 12865220)
- +0x40: 0xc82c70 FDE=(13118576, 13118584)
- +0x48: 0xc82c78 FDE=(13118584, 13118594)
- +0x50: 0x0 FDE=None
- +0x58: 0x0 FDE=None
- +0x60: 0x9d7de0 FDE=(10321376, 10321377)
- +0x68: 0xa50370 FDE=(10814320, 10814325)
- +0x70: 0xc829a2 FDE=(13117858, 13117879)
- +0x78: 0xc829b8 FDE=(13117880, 13117891)
### +0x28 body
      a4b870:	48 8d 47 20          	lea    rax,[rdi+0x20]
      a4b874:	c3                   	ret
### +0x30 body
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret
### +0x38 body
      c44ebc:	48 8d 87 80 00 00 00 	lea    rax,[rdi+0x80]
      c44ec3:	c3                   	ret
### AP materializations
      c805a5:	48 8d 05 2c b7 b9 00 	lea    rax,[rip+0xb9b72c]        # 181bcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11998>
      c82c10:	48 8d 05 c1 90 b9 00 	lea    rax,[rip+0xb990c1]        # 181bcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11998>

## rank 45: score=104 AP=0x1818510 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xb411a4 ['compact', 'pointer-field']
- +0x30=0xaa7018 ['compact', 'pointer-field']
- +0x38=0xb00302 []
- +0x0: 0xc44e1c FDE=(12865052, 12865193)
- +0x8: 0xc44eaa FDE=(12865194, 12865212)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xb411a4 FDE=(11800996, 11801001)
- +0x30: 0xaa7018 FDE=(11169816, 11169821)
- +0x38: 0xb00302 FDE=(11535106, 11535111)
- +0x40: 0xc44ebc FDE=(12865212, 12865220)
- +0x48: 0xc44ec4 FDE=(12865220, 12865228)
- +0x50: 0xc44ecc FDE=(12865228, 12865236)
- +0x58: 0xc44ed4 FDE=(12865236, 12865244)
- +0x60: 0xc44edc FDE=(12865244, 12865266)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
### +0x28 body
      b411a4:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
      b411a8:	c3                   	ret
### +0x30 body
      aa7018:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
      aa701c:	c3                   	ret
### +0x38 body
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret
### AP materializations
      c42fac:	48 8d 05 5d 55 bd 00 	lea    rax,[rip+0xbd555d]        # 1818510 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe1d0>
      c44e20:	48 8d 05 e9 36 bd 00 	lea    rax,[rip+0xbd36e9]        # 1818510 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0xe1d0>

## rank 46: score=104 AP=0x180dcd8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xa4b8e0 ['compact', 'this-relative-pointer']
- +0x30=0xb8962c ['compact', 'this-relative-pointer']
- +0x38=0xb89634 []
- +0x0: 0xb8959e FDE=(12096926, 12097049)
- +0x8: 0xb8961a FDE=(12097050, 12097068)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xa4b8e0 FDE=(10795232, 10795237)
- +0x30: 0xb8962c FDE=(12097068, 12097076)
- +0x38: 0xb89634 FDE=(12097076, 12097084)
- +0x40: 0xb8963c FDE=(12097084, 12097092)
- +0x48: 0xb89644 FDE=(12097092, 12097123)
- +0x50: 0xb89664 FDE=(12097124, 12097155)
- +0x58: 0xb89684 FDE=(12097156, 12097187)
- +0x60: 0xb896a4 FDE=(12097188, 12097219)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0x9d7de0 FDE=(10321376, 10321377)
### +0x28 body
      a4b8e0:	48 8d 47 10          	lea    rax,[rdi+0x10]
      a4b8e4:	c3                   	ret
### +0x30 body
      b8962c:	48 8d 87 f0 01 00 00 	lea    rax,[rdi+0x1f0]
      b89633:	c3                   	ret
### +0x38 body
      b89634:	48 8d 87 70 02 00 00 	lea    rax,[rdi+0x270]
      b8963b:	c3                   	ret
### AP materializations
      b866fc:	48 8d 05 d5 75 c8 00 	lea    rax,[rip+0xc875d5]        # 180dcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3998>
      b895a2:	48 8d 05 2f 47 c8 00 	lea    rax,[rip+0xc8472f]        # 180dcd8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x3998>

## rank 47: score=103 AP=0x1891ed0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x1637e66 ['delegated-pointer-getter']
- +0x30=0x1637e9e ['compact', 'delegated-pointer-getter']
- +0x38=0x1637ebc ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x1637bee FDE=(23297006, 23297024)
- +0x18: 0x16647e6 FDE=(23480294, 23480383)
- +0x20: 0x1637e4a FDE=(23297610, 23297638)
- +0x28: 0x1637e66 FDE=(23297638, 23297693)
- +0x30: 0x1637e9e FDE=(23297694, 23297723)
- +0x38: 0x1637ebc FDE=(23297724, 23297753)
- +0x40: 0x1637eda FDE=(23297754, 23297782)
- +0x48: 0x1637ef6 FDE=(23297782, 23297816)
- +0x50: 0x1637f18 FDE=(23297816, 23297845)
- +0x58: 0x1637f36 FDE=(23297846, 23297901)
- +0x60: 0x1637f6e FDE=(23297902, 23297949)
- +0x68: 0x1637f9e FDE=(23297950, 23297996)
- +0x70: 0x1637fcc FDE=(23297996, 23298024)
- +0x78: 0x1637fe8 FDE=(23298024, 23298062)
### +0x28 body
     1637e66:	53                   	push   rbx
     1637e67:	48 89 fb             	mov    rbx,rdi
     1637e6a:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     1637e6e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1637e71:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1637e74:	48 85 c0             	test   rax,rax
     1637e77:	74 08                	je     1637e81 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32fef>
     1637e79:	48 05 d0 00 00 00    	add    rax,0xd0
     1637e7f:	eb 13                	jmp    1637e94 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33002>
     1637e81:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     1637e85:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1637e88:	ff 50 20             	call   QWORD PTR [rax+0x20]
     1637e8b:	48 85 c0             	test   rax,rax
     1637e8e:	74 09                	je     1637e99 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33007>
     1637e90:	48 83 c0 70          	add    rax,0x70
     1637e94:	0f b7 00             	movzx  eax,WORD PTR [rax]
     1637e97:	5b                   	pop    rbx
     1637e98:	c3                   	ret
     1637e99:	31 c0                	xor    eax,eax
     1637e9b:	eb fa                	jmp    1637e97 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33005>
### +0x30 body
     1637e9e:	50                   	push   rax
     1637e9f:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     1637ea3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1637ea6:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1637ea9:	48 85 c0             	test   rax,rax
     1637eac:	74 09                	je     1637eb7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33025>
     1637eae:	0f b7 80 d2 00 00 00 	movzx  eax,WORD PTR [rax+0xd2]
     1637eb5:	eb 02                	jmp    1637eb9 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33027>
     1637eb7:	31 c0                	xor    eax,eax
     1637eb9:	59                   	pop    rcx
     1637eba:	c3                   	ret
### +0x38 body
     1637ebc:	50                   	push   rax
     1637ebd:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     1637ec1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1637ec4:	ff 50 10             	call   QWORD PTR [rax+0x10]
     1637ec7:	48 85 c0             	test   rax,rax
     1637eca:	74 09                	je     1637ed5 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33043>
     1637ecc:	0f b7 80 d4 00 00 00 	movzx  eax,WORD PTR [rax+0xd4]
     1637ed3:	eb 02                	jmp    1637ed7 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33045>
     1637ed5:	31 c0                	xor    eax,eax
     1637ed7:	59                   	pop    rcx
     1637ed8:	c3                   	ret
### AP materializations
     1636ef8:	48 8d 0d d1 af 25 00 	lea    rcx,[rip+0x25afd1]        # 1891ed0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xaba8>
     1638983:	48 8d 0d 46 95 25 00 	lea    rcx,[rip+0x259546]        # 1891ed0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xaba8>

## rank 48: score=100 AP=0x1892d58 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x30=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x38=0x9d81d0 []
- +0x0: 0x164a05c FDE=(23371868, 23371963)
- +0x8: 0xa02220 FDE=(10494496, 10494498)
- +0x10: 0x0 FDE=None
- +0x18: 0x163ef12 FDE=(23326482, 23326571)
- +0x20: 0x164ad70 FDE=(23375216, 23375225)
- +0x28: 0xd1b8fe FDE=(13744382, 13744387)
- +0x30: 0xd1b8fe FDE=(13744382, 13744387)
- +0x38: 0x9d81d0 FDE=(10322384, 10322387)
- +0x40: 0x9d81d0 FDE=(10322384, 10322387)
- +0x48: 0x9d81d0 FDE=(10322384, 10322387)
- +0x50: 0x9d81d0 FDE=(10322384, 10322387)
- +0x58: 0x9d81d0 FDE=(10322384, 10322387)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0x9d81d0 FDE=(10322384, 10322387)
### +0x28 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x30 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x38 body
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
### AP materializations
     164a060:	48 8d 05 f1 8c 24 00 	lea    rax,[rip+0x248cf1]        # 1892d58 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xba30>

## rank 49: score=100 AP=0x1892870 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x30=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x38=0x9d81d0 []
- +0x0: 0x164190e FDE=(23337230, 23337325)
- +0x8: 0xa02220 FDE=(10494496, 10494498)
- +0x10: 0x0 FDE=None
- +0x18: 0x163ef12 FDE=(23326482, 23326571)
- +0x20: 0x164ad70 FDE=(23375216, 23375225)
- +0x28: 0xd1b8fe FDE=(13744382, 13744387)
- +0x30: 0xd1b8fe FDE=(13744382, 13744387)
- +0x38: 0x9d81d0 FDE=(10322384, 10322387)
- +0x40: 0x9d81d0 FDE=(10322384, 10322387)
- +0x48: 0x9d81d0 FDE=(10322384, 10322387)
- +0x50: 0x9d81d0 FDE=(10322384, 10322387)
- +0x58: 0x9d81d0 FDE=(10322384, 10322387)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0x9d81d0 FDE=(10322384, 10322387)
### +0x28 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x30 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x38 body
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
### AP materializations
     1641912:	48 8d 05 57 0f 25 00 	lea    rax,[rip+0x250f57]        # 1892870 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb548>

## rank 50: score=100 AP=0x1892548 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x30=0xd1b8fe ['compact', 'this-relative-pointer']
- +0x38=0x9d81d0 []
- +0x0: 0x163eed6 FDE=(23326422, 23326481)
- +0x8: 0xa02220 FDE=(10494496, 10494498)
- +0x10: 0x0 FDE=None
- +0x18: 0x163ef12 FDE=(23326482, 23326571)
- +0x20: 0x164ad70 FDE=(23375216, 23375225)
- +0x28: 0xd1b8fe FDE=(13744382, 13744387)
- +0x30: 0xd1b8fe FDE=(13744382, 13744387)
- +0x38: 0x9d81d0 FDE=(10322384, 10322387)
- +0x40: 0x9d81d0 FDE=(10322384, 10322387)
- +0x48: 0x9d81d0 FDE=(10322384, 10322387)
- +0x50: 0x9d81d0 FDE=(10322384, 10322387)
- +0x58: 0x9d81d0 FDE=(10322384, 10322387)
- +0x60: 0x9d81d0 FDE=(10322384, 10322387)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0x9d81d0 FDE=(10322384, 10322387)
### +0x28 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x30 body
      d1b8fe:	48 8d 47 70          	lea    rax,[rdi+0x70]
      d1b902:	c3                   	ret
### +0x38 body
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
### AP materializations
     163eeda:	48 8d 05 67 36 25 00 	lea    rax,[rip+0x253667]        # 1892548 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb220>

## rank 51: score=100 AP=0x187a2d0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x14ee96a ['pointer-field']
- +0x30=0x14eea3c ['pointer-field']
- +0x38=0x14eeb0c ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0x14ee2a8 FDE=(21947048, 21947108)
- +0x8: 0x14ee2e4 FDE=(21947108, 21947126)
- +0x10: 0x14ee2f6 FDE=(21947126, 21947620)
- +0x18: 0x14ee4e4 FDE=(21947620, 21948419)
- +0x20: 0x14ee804 FDE=(21948420, 21948778)
- +0x28: 0x14ee96a FDE=(21948778, 21948987)
- +0x30: 0x14eea3c FDE=(21948988, 21949196)
- +0x38: 0x14eeb0c FDE=(21949196, 21949390)
- +0x40: 0x14eebce FDE=(21949390, 21949636)
- +0x48: 0x14eecc4 FDE=(21949636, 21949925)
- +0x50: 0x14eede6 FDE=(21949926, 21949931)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0x14ef0d4 FDE=(21950676, 21950787)
- +0x70: 0x14ef144 FDE=(21950788, 21950806)
- +0x78: 0x14ef156 FDE=(21950806, 21951487)
### +0x28 body
     14ee96a:	41 57                	push   r15
     14ee96c:	41 56                	push   r14
     14ee96e:	41 54                	push   r12
     14ee970:	53                   	push   rbx
     14ee971:	48 83 ec 28          	sub    rsp,0x28
     14ee975:	4d 89 c6             	mov    r14,r8
     14ee978:	49 89 cc             	mov    r12,rcx
     14ee97b:	48 89 f3             	mov    rbx,rsi
     14ee97e:	49 89 ff             	mov    r15,rdi
     14ee981:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee988:	00 00 
     14ee98a:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14ee98f:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14ee993:	bf b0 00 00 00       	mov    edi,0xb0
     14ee998:	48 03 38             	add    rdi,QWORD PTR [rax]
     14ee99b:	e8 08 a1 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14ee9a0:	41 80 7f 50 00       	cmp    BYTE PTR [r15+0x50],0x0
     14ee9a5:	74 50                	je     14ee9f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333f7b>
     14ee9a7:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     14ee9ab:	48 85 ff             	test   rdi,rdi
     14ee9ae:	74 47                	je     14ee9f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333f7b>
     14ee9b0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14ee9b3:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14ee9b6:	84 c0                	test   al,al
     14ee9b8:	74 3d                	je     14ee9f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333f7b>
     14ee9ba:	48 8d 53 58          	lea    rdx,[rbx+0x58]
     14ee9be:	48 83 c3 68          	add    rbx,0x68
     14ee9c2:	48 89 e0             	mov    rax,rsp
     14ee9c5:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     14ee9ca:	0f 57 c0             	xorps  xmm0,xmm0
     14ee9cd:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     14ee9d0:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     14ee9d4:	45 8b 44 24 08       	mov    r8d,DWORD PTR [r12+0x8]
     14ee9d9:	48 8d 35 70 a1 f4 fe 	lea    rsi,[rip+0xfffffffffef4a170]        # 438b50 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e59f>
     14ee9e0:	4c 89 ff             	mov    rdi,r15
     14ee9e3:	4d 89 f1             	mov    r9,r14
     14ee9e6:	50                   	push   rax
     14ee9e7:	53                   	push   rbx
     14ee9e8:	e8 ff 03 00 00       	call   14eedec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334370>
     14ee9ed:	58                   	pop    rax
     14ee9ee:	59                   	pop    rcx
     14ee9ef:	48 89 e7             	mov    rdi,rsp
     14ee9f2:	e8 99 f4 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14ee9f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14ee9fe:	00 00 
     14eea00:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14eea05:	75 2f                	jne    14eea36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333fba>
     14eea07:	48 83 c4 28          	add    rsp,0x28
     14eea0b:	5b                   	pop    rbx
     14eea0c:	41 5c                	pop    r12
     14eea0e:	41 5e                	pop    r14
     14eea10:	41 5f                	pop    r15
     14eea12:	c3                   	ret
     14eea13:	48 89 c3             	mov    rbx,rax
     14eea16:	48 89 e7             	mov    rdi,rsp
     14eea19:	e8 72 f4 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14eea1e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14eea25:	00 00 
     14eea27:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14eea2c:	75 08                	jne    14eea36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x333fba>
     14eea2e:	48 89 df             	mov    rdi,rbx
     14eea31:	e8 9a 12 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14eea36:	e8 75 10 30 00       	call   17efab0 <__stack_chk_fail@plt>
### +0x30 body
     14eea3c:	41 57                	push   r15
     14eea3e:	41 56                	push   r14
     14eea40:	41 54                	push   r12
     14eea42:	53                   	push   rbx
     14eea43:	48 83 ec 28          	sub    rsp,0x28
     14eea47:	4d 89 c6             	mov    r14,r8
     14eea4a:	49 89 cc             	mov    r12,rcx
     14eea4d:	48 89 f3             	mov    rbx,rsi
     14eea50:	49 89 ff             	mov    r15,rdi
     14eea53:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14eea5a:	00 00 
     14eea5c:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     14eea61:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     14eea65:	48 8b 38             	mov    rdi,QWORD PTR [rax]
     14eea68:	48 83 c7 58          	add    rdi,0x58
     14eea6c:	e8 37 a0 63 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
     14eea71:	41 80 7f 50 00       	cmp    BYTE PTR [r15+0x50],0x0
     14eea76:	74 50                	je     14eeac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33404c>
     14eea78:	48 8b 7b 58          	mov    rdi,QWORD PTR [rbx+0x58]
     14eea7c:	48 85 ff             	test   rdi,rdi
     14eea7f:	74 47                	je     14eeac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33404c>
     14eea81:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14eea84:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14eea87:	84 c0                	test   al,al
     14eea89:	74 3d                	je     14eeac8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33404c>
     14eea8b:	48 8d 53 58          	lea    rdx,[rbx+0x58]
     14eea8f:	48 83 c3 68          	add    rbx,0x68
     14eea93:	48 89 e0             	mov    rax,rsp
     14eea96:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     14eea9b:	0f 57 c0             	xorps  xmm0,xmm0
     14eea9e:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     14eeaa1:	49 8b 0c 24          	mov    rcx,QWORD PTR [r12]
     14eeaa5:	45 8b 44 24 08       	mov    r8d,DWORD PTR [r12+0x8]
     14eeaaa:	48 8d 35 87 a0 f4 fe 	lea    rsi,[rip+0xfffffffffef4a087]        # 438b38 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5e587>
     14eeab1:	4c 89 ff             	mov    rdi,r15
     14eeab4:	4d 89 f1             	mov    r9,r14
     14eeab7:	50                   	push   rax
     14eeab8:	53                   	push   rbx
     14eeab9:	e8 2e 03 00 00       	call   14eedec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334370>
     14eeabe:	58                   	pop    rax
     14eeabf:	59                   	pop    rcx
     14eeac0:	48 89 e7             	mov    rdi,rsp
     14eeac3:	e8 c8 f3 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14eeac8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14eeacf:	00 00 
     14eead1:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14eead6:	75 2f                	jne    14eeb07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33408b>
     14eead8:	48 83 c4 28          	add    rsp,0x28
     14eeadc:	5b                   	pop    rbx
     14eeadd:	41 5c                	pop    r12
     14eeadf:	41 5e                	pop    r14
     14eeae1:	41 5f                	pop    r15
     14eeae3:	c3                   	ret
     14eeae4:	48 89 c3             	mov    rbx,rax
     14eeae7:	48 89 e7             	mov    rdi,rsp
     14eeaea:	e8 a1 f3 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14eeaef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14eeaf6:	00 00 
     14eeaf8:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     14eeafd:	75 08                	jne    14eeb07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33408b>
     14eeaff:	48 89 df             	mov    rdi,rbx
     14eeb02:	e8 c9 11 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14eeb07:	e8 a4 0f 30 00       	call   17efab0 <__stack_chk_fail@plt>
### +0x38 body
     14eeb0c:	41 57                	push   r15
     14eeb0e:	41 56                	push   r14
     14eeb10:	41 55                	push   r13
     14eeb12:	41 54                	push   r12
     14eeb14:	53                   	push   rbx
     14eeb15:	48 83 ec 20          	sub    rsp,0x20
     14eeb19:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14eeb20:	00 00 
     14eeb22:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     14eeb27:	80 7f 50 00          	cmp    BYTE PTR [rdi+0x50],0x0
     14eeb2b:	74 5b                	je     14eeb88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33410c>
     14eeb2d:	49 89 f6             	mov    r14,rsi
     14eeb30:	49 89 fc             	mov    r12,rdi
     14eeb33:	48 8b 7e 58          	mov    rdi,QWORD PTR [rsi+0x58]
     14eeb37:	48 85 ff             	test   rdi,rdi
     14eeb3a:	74 4c                	je     14eeb88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33410c>
     14eeb3c:	4c 89 c3             	mov    rbx,r8
     14eeb3f:	49 89 cd             	mov    r13,rcx
     14eeb42:	49 89 d7             	mov    r15,rdx
     14eeb45:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     14eeb48:	ff 50 48             	call   QWORD PTR [rax+0x48]
     14eeb4b:	84 c0                	test   al,al
     14eeb4d:	74 39                	je     14eeb88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33410c>
     14eeb4f:	49 8d 56 58          	lea    rdx,[r14+0x58]
     14eeb53:	49 83 c6 68          	add    r14,0x68
     14eeb57:	48 89 e0             	mov    rax,rsp
     14eeb5a:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
     14eeb5f:	0f 57 c0             	xorps  xmm0,xmm0
     14eeb62:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
     14eeb65:	49 8b 4d 00          	mov    rcx,QWORD PTR [r13+0x0]
     14eeb69:	45 8b 45 08          	mov    r8d,DWORD PTR [r13+0x8]
     14eeb6d:	4c 89 e7             	mov    rdi,r12
     14eeb70:	4c 89 fe             	mov    rsi,r15
     14eeb73:	49 89 d9             	mov    r9,rbx
     14eeb76:	50                   	push   rax
     14eeb77:	41 56                	push   r14
     14eeb79:	e8 6e 02 00 00       	call   14eedec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x334370>
     14eeb7e:	58                   	pop    rax
     14eeb7f:	59                   	pop    rcx
     14eeb80:	48 89 e7             	mov    rdi,rsp
     14eeb83:	e8 08 f3 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14eeb88:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14eeb8f:	00 00 
     14eeb91:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14eeb96:	75 31                	jne    14eebc9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33414d>
     14eeb98:	48 83 c4 20          	add    rsp,0x20
     14eeb9c:	5b                   	pop    rbx
     14eeb9d:	41 5c                	pop    r12
     14eeb9f:	41 5d                	pop    r13
     14eeba1:	41 5e                	pop    r14
     14eeba3:	41 5f                	pop    r15
     14eeba5:	c3                   	ret
     14eeba6:	48 89 c3             	mov    rbx,rax
     14eeba9:	48 89 e7             	mov    rdi,rsp
     14eebac:	e8 df f2 2f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     14eebb1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     14eebb8:	00 00 
     14eebba:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     14eebbf:	75 08                	jne    14eebc9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x33414d>
     14eebc1:	48 89 df             	mov    rdi,rbx
     14eebc4:	e8 07 11 58 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     14eebc9:	e8 e2 0e 30 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
     14d348c:	48 8d 0d 3d 6e 3a 00 	lea    rcx,[rip+0x3a6e3d]        # 187a2d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x369b8>
     14ee2ac:	48 8d 05 1d c0 38 00 	lea    rax,[rip+0x38c01d]        # 187a2d0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x369b8>

## rank 52: score=100 AP=0x185d678 offset_to_top=0 typeinfo=0x0 direct_refs=5
- +0x28=0x122d910 ['compact']
- +0x30=0x122ba16 ['compact', 'delegated-pointer-getter']
- +0x38=0x122ba2a ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x122d8e8 FDE=(19060968, 19060988)
- +0x18: 0xca4170 FDE=(13255024, 13255028)
- +0x20: 0x122d8fc FDE=(19060988, 19061008)
- +0x28: 0x122d910 FDE=(19061008, 19061012)
- +0x30: 0x122ba16 FDE=(19053078, 19053098)
- +0x38: 0x122ba2a FDE=(19053098, 19053102)
- +0x40: 0x122d914 FDE=(19061012, 19061104)
- +0x48: 0x122d970 FDE=(19061104, 19061109)
- +0x50: 0x122d976 FDE=(19061110, 19061203)
- +0x58: 0x122d9d4 FDE=(19061204, 19061209)
- +0x60: 0x122d9da FDE=(19061210, 19061302)
- +0x68: 0xca5c00 FDE=(13261824, 13261829)
- +0x70: 0x122da36 FDE=(19061302, 19061322)
- +0x78: 0x122da4a FDE=(19061322, 19061326)
### +0x28 body
     122d910:	8a 47 13             	mov    al,BYTE PTR [rdi+0x13]
     122d913:	c3                   	ret
### +0x30 body
     122ba16:	c6 47 12 01          	mov    BYTE PTR [rdi+0x12],0x1
     122ba1a:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     122ba1e:	48 85 ff             	test   rdi,rdi
     122ba21:	74 06                	je     122ba29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70fad>
     122ba23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     122ba26:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
     122ba29:	c3                   	ret
### +0x38 body
     122ba2a:	8a 47 12             	mov    al,BYTE PTR [rdi+0x12]
     122ba2d:	c3                   	ret
### AP materializations
     122ba7e:	48 8d 05 f3 1b 63 00 	lea    rax,[rip+0x631bf3]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     122c67d:	48 8d 05 f4 0f 63 00 	lea    rax,[rip+0x630ff4]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     122c852:	48 8d 05 1f 0e 63 00 	lea    rax,[rip+0x630e1f]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     12345b0:	48 8d 05 c1 90 62 00 	lea    rax,[rip+0x6290c1]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>
     12346ea:	48 8d 05 87 8f 62 00 	lea    rax,[rip+0x628f87]        # 185d678 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19d60>

## rank 53: score=100 AP=0x185ca28 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0xacf158 ['compact', 'this-relative-pointer']
- +0x30=0xd1b7c0 ['compact', 'this-relative-pointer']
- +0x38=0x1217ee0 []
- +0x0: 0x12172a8 FDE=(18969256, 18969342)
- +0x8: 0x1217e62 FDE=(18972258, 18972276)
- +0x10: 0x1217e74 FDE=(18972276, 18972384)
- +0x18: 0xaf6576 FDE=(11494774, 11494779)
- +0x20: 0xca5c00 FDE=(13261824, 13261829)
- +0x28: 0xacf158 FDE=(11333976, 11333981)
- +0x30: 0xd1b7c0 FDE=(13744064, 13744072)
- +0x38: 0x1217ee0 FDE=(18972384, 18972392)
- +0x40: 0x1217ee8 FDE=(18972392, 18972400)
- +0x48: 0x1217ef0 FDE=(18972400, 18972407)
- +0x50: 0x1217ef8 FDE=(18972408, 18972422)
- +0x58: 0x1217f06 FDE=(18972422, 18972429)
- +0x60: 0x1217f0e FDE=(18972430, 18972438)
- +0x68: 0x1217f16 FDE=(18972438, 18972446)
- +0x70: 0x1217f1e FDE=(18972446, 18972454)
- +0x78: 0x1217f26 FDE=(18972454, 18972462)
### +0x28 body
      acf158:	48 8d 47 40          	lea    rax,[rdi+0x40]
      acf15c:	c3                   	ret
### +0x30 body
      d1b7c0:	48 8d 87 00 01 00 00 	lea    rax,[rdi+0x100]
      d1b7c7:	c3                   	ret
### +0x38 body
     1217ee0:	48 8d 87 08 01 00 00 	lea    rax,[rdi+0x108]
     1217ee7:	c3                   	ret
### AP materializations
     1217069:	48 8d 05 b8 59 64 00 	lea    rax,[rip+0x6459b8]        # 185ca28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19110>

## rank 54: score=100 AP=0x185b3f0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11dc2ee ['compact', 'pointer-field']
- +0x30=0xa4b870 ['compact', 'this-relative-pointer']
- +0x38=0xacf152 []
- +0x0: 0x11db974 FDE=(18725236, 18725268)
- +0x8: 0x11dc2be FDE=(18727614, 18727632)
- +0x10: 0x11dc2d0 FDE=(18727632, 18727639)
- +0x18: 0x11dc2d8 FDE=(18727640, 18727654)
- +0x20: 0x11dc2e6 FDE=(18727654, 18727662)
- +0x28: 0x11dc2ee FDE=(18727662, 18727670)
- +0x30: 0xa4b870 FDE=(10795120, 10795125)
- +0x38: 0xacf152 FDE=(11333970, 11333975)
- +0x40: 0x11dc2f6 FDE=(18727670, 18727679)
- +0x48: 0x11dc300 FDE=(18727680, 18727714)
- +0x50: 0x11dc322 FDE=(18727714, 18727736)
- +0x58: 0x11dc338 FDE=(18727736, 18727747)
- +0x60: 0x11dc344 FDE=(18727748, 18727761)
- +0x68: 0x9d81d0 FDE=(10322384, 10322387)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
     11dc2ee:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     11dc2f2:	8b 40 44             	mov    eax,DWORD PTR [rax+0x44]
     11dc2f5:	c3                   	ret
### +0x30 body
      a4b870:	48 8d 47 20          	lea    rax,[rdi+0x20]
      a4b874:	c3                   	ret
### +0x38 body
      acf152:	48 8d 47 30          	lea    rax,[rdi+0x30]
      acf156:	c3                   	ret
### AP materializations
     11db742:	48 8d 05 a7 fc 67 00 	lea    rax,[rip+0x67fca7]        # 185b3f0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x17ad8>

## rank 55: score=100 AP=0x1852ea0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0xa4b870 ['compact', 'this-relative-pointer']
- +0x30=0xd8680a ['compact', 'this-relative-pointer']
- +0x38=0xb00302 []
- +0x0: 0x11374fe FDE=(18052350, 18052427)
- +0x8: 0x113754c FDE=(18052428, 18052446)
- +0x10: 0x113755e FDE=(18052446, 18052467)
- +0x18: 0x1137574 FDE=(18052468, 18052476)
- +0x20: 0xaf6576 FDE=(11494774, 11494779)
- +0x28: 0xa4b870 FDE=(10795120, 10795125)
- +0x30: 0xd8680a FDE=(14182410, 14182415)
- +0x38: 0xb00302 FDE=(11535106, 11535111)
- +0x40: 0x1137232 FDE=(18051634, 18051752)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x1135f4e FDE=(18046798, 18046817)
- +0x60: 0x1135f62 FDE=(18046818, 18046836)
- +0x68: 0x1135f74 FDE=(18046836, 18051122)
- +0x70: 0x1137032 FDE=(18051122, 18051633)
- +0x78: 0x0 FDE=None
### +0x28 body
      a4b870:	48 8d 47 20          	lea    rax,[rdi+0x20]
      a4b874:	c3                   	ret
### +0x30 body
      d8680a:	48 8d 47 38          	lea    rax,[rdi+0x38]
      d8680e:	c3                   	ret
### +0x38 body
      b00302:	48 8d 47 50          	lea    rax,[rdi+0x50]
      b00306:	c3                   	ret
### AP materializations
     11375e7:	48 8d 0d b2 b8 71 00 	lea    rcx,[rip+0x71b8b2]        # 1852ea0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xf588>

## rank 56: score=99 AP=0x182ce30 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xe02190 ['delegated-pointer-getter']
- +0x30=0xc877aa ['compact', 'delegated-pointer-getter']
- +0x38=0xe02214 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0xe020ee FDE=(14688494, 14688590)
- +0x8: 0xe0214e FDE=(14688590, 14688608)
- +0x10: 0xe02160 FDE=(14688608, 14688624)
- +0x18: 0xe02170 FDE=(14688624, 14688640)
- +0x20: 0xe02180 FDE=(14688640, 14688656)
- +0x28: 0xe02190 FDE=(14688656, 14688787)
- +0x30: 0xc877aa FDE=(13137834, 13137844)
- +0x38: 0xe02214 FDE=(14688788, 14688804)
- +0x40: 0xe02224 FDE=(14688804, 14688814)
- +0x48: 0xd60ee8 FDE=(14028520, 14028530)
- +0x50: 0xc82c78 FDE=(13118584, 13118594)
- +0x58: 0xc37f98 FDE=(12812184, 12812203)
- +0x60: 0xe0222e FDE=(14688814, 14688836)
- +0x68: 0xe02244 FDE=(14688836, 14688855)
- +0x70: 0xe02258 FDE=(14688856, 14688878)
- +0x78: 0xe0226e FDE=(14688878, 14688897)
### +0x28 body
      e02190:	41 56                	push   r14
      e02192:	53                   	push   rbx
      e02193:	48 83 ec 28          	sub    rsp,0x28
      e02197:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e0219e:	00 00 
      e021a0:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      e021a5:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      e021a9:	31 c0                	xor    eax,eax
      e021ab:	88 04 24             	mov    BYTE PTR [rsp],al
      e021ae:	88 44 24 18          	mov    BYTE PTR [rsp+0x18],al
      e021b2:	38 42 18             	cmp    BYTE PTR [rdx+0x18],al
      e021b5:	74 20                	je     e021d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf25d>
      e021b7:	48 8b 42 10          	mov    rax,QWORD PTR [rdx+0x10]
      e021bb:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      e021c0:	0f 10 02             	movups xmm0,XMMWORD PTR [rdx]
      e021c3:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      e021c7:	0f 57 c0             	xorps  xmm0,xmm0
      e021ca:	0f 11 02             	movups XMMWORD PTR [rdx],xmm0
      e021cd:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
      e021d2:	c6 44 24 18 01       	mov    BYTE PTR [rsp+0x18],0x1
      e021d7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e021da:	40 0f b6 f6          	movzx  esi,sil
      e021de:	49 89 e6             	mov    r14,rsp
      e021e1:	4c 89 f2             	mov    rdx,r14
      e021e4:	ff 90 60 01 00 00    	call   QWORD PTR [rax+0x160]
      e021ea:	89 c3                	mov    ebx,eax
      e021ec:	4c 89 f7             	mov    rdi,r14
      e021ef:	e8 3c 4b ca ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e021f4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      e021fb:	00 00 
      e021fd:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      e02202:	75 0a                	jne    e0220e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf294>
      e02204:	89 d8                	mov    eax,ebx
      e02206:	48 83 c4 28          	add    rsp,0x28
      e0220a:	5b                   	pop    rbx
      e0220b:	41 5e                	pop    r14
      e0220d:	c3                   	ret
      e0220e:	e8 9d d8 9e 00       	call   17efab0 <__stack_chk_fail@plt>
### +0x30 body
      c877aa:	48 8b 7f 10          	mov    rdi,QWORD PTR [rdi+0x10]
      c877ae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      c877b1:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
### +0x38 body
      e02214:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      e02218:	48 85 ff             	test   rdi,rdi
      e0221b:	74 06                	je     e02223 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcf2a9>
      e0221d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e02220:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
      e02223:	c3                   	ret
### AP materializations
      df0602:	48 8d 05 27 c8 a3 00 	lea    rax,[rip+0xa3c827]        # 182ce30 <_ZTIN4asio2ip16bad_address_castE@@Base+0x9460>
      e020f2:	48 8d 05 37 ad a2 00 	lea    rax,[rip+0xa2ad37]        # 182ce30 <_ZTIN4asio2ip16bad_address_castE@@Base+0x9460>

## rank 57: score=97 AP=0x1822ac8 offset_to_top=-24 typeinfo=0x0 direct_refs=1
- +0x28=0xd1b904 ['compact', 'this-relative-pointer']
- +0x30=0xd1b90c ['compact', 'this-relative-pointer']
- +0x38=0xd1b914 ['compact-thunk']
- +0x0: 0xd1b8dc FDE=(13744348, 13744357)
- +0x8: 0xd1b8e6 FDE=(13744358, 13744367)
- +0x10: 0xd1b8f0 FDE=(13744368, 13744373)
- +0x18: 0xd1b8f6 FDE=(13744374, 13744382)
- +0x20: 0xd1b8fe FDE=(13744382, 13744387)
- +0x28: 0xd1b904 FDE=(13744388, 13744396)
- +0x30: 0xd1b90c FDE=(13744396, 13744404)
- +0x38: 0xd1b914 FDE=(13744404, 13744413)
- +0x40: 0x162f426 FDE=(23262246, 23262508)
- +0x48: 0x162f9e0 FDE=(23263712, 23264003)
- +0x50: 0x162fcde FDE=(23264478, 23264595)
- +0x58: 0x162fd54 FDE=(23264596, 23264985)
- +0x60: 0x0 FDE=None
- +0x68: 0x33ee18 FDE=None
- +0x70: 0x1 FDE=None
- +0x78: 0x379bc4 FDE=None
### +0x28 body
      d1b904:	48 8d 87 98 00 00 00 	lea    rax,[rdi+0x98]
      d1b90b:	c3                   	ret
### +0x30 body
      d1b90c:	48 8d 87 e8 00 00 00 	lea    rax,[rdi+0xe8]
      d1b913:	c3                   	ret
### +0x38 body
      d1b914:	48 83 c7 e8          	add    rdi,0xffffffffffffffe8
      d1b918:	e9 ab fe ff ff       	jmp    d1b7c8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x268768>
### AP materializations
      d07bed:	48 8d 05 d4 ae b1 00 	lea    rax,[rip+0xb1aed4]        # 1822ac8 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x18788>

## rank 58: score=95 AP=0x188bf78 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x16105e2 ['compact']
- +0x30=0x16105ee ['compact', 'pointer-field']
- +0x38=0xa10b90 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x16104ce FDE=(23135438, 23135447)
- +0x8: 0x16104d8 FDE=(23135448, 23135470)
- +0x10: 0x16104ee FDE=(23135470, 23135581)
- +0x18: 0x161055e FDE=(23135582, 23135607)
- +0x20: 0x1610578 FDE=(23135608, 23135714)
- +0x28: 0x16105e2 FDE=(23135714, 23135725)
- +0x30: 0x16105ee FDE=(23135726, 23135742)
- +0x38: 0xa10b90 FDE=(10554256, 10554262)
- +0x40: 0x16105fe FDE=(23135742, 23135911)
- +0x48: 0x16106a8 FDE=(23135912, 23135931)
- +0x50: 0x16106bc FDE=(23135932, 23135947)
- +0x58: 0x16106cc FDE=(23135948, 23135960)
- +0x60: 0x16106d8 FDE=(23135960, 23136075)
- +0x68: 0x161074c FDE=(23136076, 23136174)
- +0x70: 0x16107ae FDE=(23136174, 23136422)
- +0x78: 0x16108a6 FDE=(23136422, 23136493)
### +0x28 body
     16105e2:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     16105e6:	31 d2                	xor    edx,edx
     16105e8:	e9 07 ea ff ff       	jmp    160eff4 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa162>
### +0x30 body
     16105ee:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
     16105f2:	48 8b b8 60 01 00 00 	mov    rdi,QWORD PTR [rax+0x160]
     16105f9:	e9 64 9e 46 ff       	jmp    a7a462 <JNI_OnUnload@@Base+0x1d2f>
### +0x38 body
      a10b90:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      a10b93:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### AP materializations
     16100be:	48 8d 05 b3 be 27 00 	lea    rax,[rip+0x27beb3]        # 188bf78 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x4c50>

## rank 59: score=95 AP=0x18851c0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x15c5958 ['delegated-pointer-getter']
- +0x30=0x15c59ec ['compact', 'delegated-pointer-getter']
- +0x38=0x15c59f6 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c5926 FDE=(22829350, 22829372)
- +0x8: 0x15c593c FDE=(22829372, 22829390)
- +0x10: 0x15c594e FDE=(22829390, 22829400)
- +0x18: 0x1427118 FDE=(21131544, 21131554)
- +0x20: 0x142710e FDE=(21131534, 21131544)
- +0x28: 0x15c5958 FDE=(22829400, 22829548)
- +0x30: 0x15c59ec FDE=(22829548, 22829558)
- +0x38: 0x15c59f6 FDE=(22829558, 22829568)
- +0x40: 0x15c5a00 FDE=(22829568, 22829578)
- +0x48: 0x14271fa FDE=(21131770, 21131780)
- +0x50: 0x15c5a0a FDE=(22829578, 22829597)
- +0x58: 0x15c5a1e FDE=(22829598, 22829611)
- +0x60: 0x142720e FDE=(21131790, 21131803)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c5a2c FDE=(22829612, 22829631)
- +0x78: 0x15c5a40 FDE=(22829632, 22829645)
### +0x28 body
     15c5958:	41 56                	push   r14
     15c595a:	53                   	push   rbx
     15c595b:	48 83 ec 18          	sub    rsp,0x18
     15c595f:	49 89 f6             	mov    r14,rsi
     15c5962:	48 89 fb             	mov    rbx,rdi
     15c5965:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c596c:	00 00 
     15c596e:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     15c5973:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     15c5977:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c597a:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15c597d:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15c5981:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c5984:	ff 50 10             	call   QWORD PTR [rax+0x10]
     15c5987:	84 c0                	test   al,al
     15c5989:	74 44                	je     15c59cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40af53>
     15c598b:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15c598f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c5992:	ff 50 40             	call   QWORD PTR [rax+0x40]
     15c5995:	48 89 e6             	mov    rsi,rsp
     15c5998:	48 89 06             	mov    QWORD PTR [rsi],rax
     15c599b:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     15c599f:	4c 89 f2             	mov    rdx,r14
     15c59a2:	e8 75 d3 0b 00       	call   1682d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e88>
     15c59a7:	85 c0                	test   eax,eax
     15c59a9:	7e 24                	jle    15c59cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40af53>
     15c59ab:	48 8b 7b 28          	mov    rdi,QWORD PTR [rbx+0x28]
     15c59af:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c59b2:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
     15c59b6:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     15c59bd:	00 00 
     15c59bf:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     15c59c4:	75 21                	jne    15c59e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40af6b>
     15c59c6:	48 83 c4 18          	add    rsp,0x18
     15c59ca:	5b                   	pop    rbx
     15c59cb:	41 5e                	pop    r14
     15c59cd:	ff e0                	jmp    rax
     15c59cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15c59d6:	00 00 
     15c59d8:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     15c59dd:	75 08                	jne    15c59e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40af6b>
     15c59df:	48 83 c4 18          	add    rsp,0x18
     15c59e3:	5b                   	pop    rbx
     15c59e4:	41 5e                	pop    r14
     15c59e6:	c3                   	ret
     15c59e7:	e8 c4 a0 22 00       	call   17efab0 <__stack_chk_fail@plt>
### +0x30 body
     15c59ec:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     15c59f0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c59f3:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### +0x38 body
     15c59f6:	48 8b 7f 28          	mov    rdi,QWORD PTR [rdi+0x28]
     15c59fa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     15c59fd:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### AP materializations
     15c58b8:	48 8d 15 01 f9 2b 00 	lea    rdx,[rip+0x2bf901]        # 18851c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x418a8>

## rank 60: score=95 AP=0x1855ba0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x1166640 ['delegated-pointer-getter']
- +0x30=0x11666d4 ['compact', 'delegated-pointer-getter']
- +0x38=0x11666de ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x116658e FDE=(18245006, 18245028)
- +0x8: 0x1166610 FDE=(18245136, 18245154)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x116662c FDE=(18245164, 18245174)
- +0x20: 0x1166636 FDE=(18245174, 18245184)
- +0x28: 0x1166640 FDE=(18245184, 18245332)
- +0x30: 0x11666d4 FDE=(18245332, 18245342)
- +0x38: 0x11666de FDE=(18245342, 18245352)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x1166710 FDE=(18245392, 18245405)
- +0x60: 0x116671e FDE=(18245406, 18245419)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x116672c FDE=(18245420, 18245439)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     1166640:	41 56                	push   r14
     1166642:	53                   	push   rbx
     1166643:	48 83 ec 18          	sub    rsp,0x18
     1166647:	49 89 f6             	mov    r14,rsi
     116664a:	48 89 fb             	mov    rbx,rdi
     116664d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1166654:	00 00 
     1166656:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
     116665b:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     116665f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1166662:	ff 50 28             	call   QWORD PTR [rax+0x28]
     1166665:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1166669:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     116666c:	ff 50 10             	call   QWORD PTR [rax+0x10]
     116666f:	84 c0                	test   al,al
     1166671:	74 44                	je     11666b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32dacd>
     1166673:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1166677:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     116667a:	ff 50 40             	call   QWORD PTR [rax+0x40]
     116667d:	48 89 e6             	mov    rsi,rsp
     1166680:	48 89 06             	mov    QWORD PTR [rsi],rax
     1166683:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
     1166687:	4c 89 f2             	mov    rdx,r14
     116668a:	e8 8d c6 51 00       	call   1682d1c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36e88>
     116668f:	85 c0                	test   eax,eax
     1166691:	7e 24                	jle    11666b7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32dacd>
     1166693:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
     1166697:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     116669a:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]
     116669e:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
     11666a5:	00 00 
     11666a7:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
     11666ac:	75 21                	jne    11666cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32dae5>
     11666ae:	48 83 c4 18          	add    rsp,0x18
     11666b2:	5b                   	pop    rbx
     11666b3:	41 5e                	pop    r14
     11666b5:	ff e0                	jmp    rax
     11666b7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11666be:	00 00 
     11666c0:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
     11666c5:	75 08                	jne    11666cf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x32dae5>
     11666c7:	48 83 c4 18          	add    rsp,0x18
     11666cb:	5b                   	pop    rbx
     11666cc:	41 5e                	pop    r14
     11666ce:	c3                   	ret
     11666cf:	e8 dc 93 68 00       	call   17efab0 <__stack_chk_fail@plt>
### +0x30 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### +0x38 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### AP materializations
     1163c0a:	48 8d 0d 8f 1f 6f 00 	lea    rcx,[rip+0x6f1f8f]        # 1855ba0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x12288>

## rank 61: score=94 AP=0x1896cf8 offset_to_top=0 typeinfo=0x0 direct_refs=5
- +0x28=0x9d81d0 ['compact']
- +0x30=0x16616b4 ['pointer-field']
- +0x38=0x16617aa ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x16616ee FDE=(23467758, 23467826)
- +0x18: 0x1661732 FDE=(23467826, 23467914)
- +0x20: 0xa3fa60 FDE=(10746464, 10746467)
- +0x28: 0x9d81d0 FDE=(10322384, 10322387)
- +0x30: 0x16616b4 FDE=(23467700, 23467758)
- +0x38: 0x16617aa FDE=(23467946, 23467957)
- +0x40: 0x166178a FDE=(23467914, 23467930)
- +0x48: 0x16617b6 FDE=(23467958, 23467971)
- +0x50: 0x16617d2 FDE=(23467986, 23468026)
- +0x58: 0x1661804 FDE=(23468036, 23468093)
- +0x60: 0xfffffffffffffff8 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0x9d7de0 FDE=(10321376, 10321377)
- +0x78: 0xca132c FDE=(13243180, 13243189)
### +0x28 body
      9d81d0:	31 c0                	xor    eax,eax
      9d81d2:	c3                   	ret
### +0x30 body
     16616b4:	53                   	push   rbx
     16616b5:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     16616b9:	48 8b 98 50 01 00 00 	mov    rbx,QWORD PTR [rax+0x150]
     16616c0:	48 83 e3 fc          	and    rbx,0xfffffffffffffffc
     16616c4:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     16616c8:	8b 3b                	mov    edi,DWORD PTR [rbx]
     16616ca:	e8 51 a1 41 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     16616cf:	84 c0                	test   al,al
     16616d1:	74 04                	je     16616d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15843>
     16616d3:	31 c0                	xor    eax,eax
     16616d5:	eb 15                	jmp    16616ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15858>
     16616d7:	48 89 df             	mov    rdi,rbx
     16616da:	e8 57 a1 41 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     16616df:	48 89 c1             	mov    rcx,rax
     16616e2:	31 c0                	xor    eax,eax
     16616e4:	48 83 fa 10          	cmp    rdx,0x10
     16616e8:	48 0f 44 c1          	cmove  rax,rcx
     16616ec:	5b                   	pop    rbx
     16616ed:	c3                   	ret
### +0x38 body
     16617aa:	48 8b 47 18          	mov    rax,QWORD PTR [rdi+0x18]
     16617ae:	8a 80 68 01 00 00    	mov    al,BYTE PTR [rax+0x168]
     16617b4:	c3                   	ret
### AP materializations
      c191c3:	48 8d 05 2e db c7 00 	lea    rax,[rip+0xc7db2e]        # 1896cf8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3c38>
      c1c9b8:	48 8d 05 39 a3 c7 00 	lea    rax,[rip+0xc7a339]        # 1896cf8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3c38>
      dcefdc:	48 8d 05 15 7d ac 00 	lea    rax,[rip+0xac7d15]        # 1896cf8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3c38>
     109b954:	48 8d 05 9d b3 7f 00 	lea    rax,[rip+0x7fb39d]        # 1896cf8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3c38>
     164346f:	48 8d 05 82 38 25 00 	lea    rax,[rip+0x253882]        # 1896cf8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x3c38>

## rank 62: score=94 AP=0x1865d40 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x133a2e8 ['compact']
- +0x30=0x133a2fe ['compact', 'pointer-field']
- +0x38=0x133a2fe ['writes-rdi-output']
- +0x0: 0x1339fe4 FDE=(20160484, 20160951)
- +0x8: 0x133a1b8 FDE=(20160952, 20160970)
- +0x10: 0x133a1ca FDE=(20160970, 20161124)
- +0x18: 0x133a264 FDE=(20161124, 20161247)
- +0x20: 0x133a2e0 FDE=(20161248, 20161256)
- +0x28: 0x133a2e8 FDE=(20161256, 20161277)
- +0x30: 0x133a2fe FDE=(20161278, 20161286)
- +0x38: 0x133a2fe FDE=(20161278, 20161286)
- +0x40: 0x133a306 FDE=(20161286, 20161379)
- +0x48: 0x133a364 FDE=(20161380, 20161470)
- +0x50: 0x133a3be FDE=(20161470, 20161521)
- +0x58: 0x133a3f2 FDE=(20161522, 20161548)
- +0x60: 0x133a40c FDE=(20161548, 20161571)
- +0x68: 0xc94fd2 FDE=(13193170, 13193178)
- +0x70: 0x133a40c FDE=(20161548, 20161571)
- +0x78: 0x133a424 FDE=(20161572, 20161936)
### +0x28 body
     133a2e8:	53                   	push   rbx
     133a2e9:	48 89 fb             	mov    rbx,rdi
     133a2ec:	48 81 c6 70 05 00 00 	add    rsi,0x570
     133a2f3:	e8 d2 aa ee ff       	call   1224dca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a34e>
     133a2f8:	48 89 d8             	mov    rax,rbx
     133a2fb:	5b                   	pop    rbx
     133a2fc:	c3                   	ret
### +0x30 body
     133a2fe:	48 8b 87 a0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5a0]
     133a305:	c3                   	ret
### +0x38 body
     133a2fe:	48 8b 87 a0 05 00 00 	mov    rax,QWORD PTR [rdi+0x5a0]
     133a305:	c3                   	ret
### AP materializations
     1333285:	48 8d 05 b4 2a 53 00 	lea    rax,[rip+0x532ab4]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>
     1339feb:	48 8d 05 4e bd 52 00 	lea    rax,[rip+0x52bd4e]        # 1865d40 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22428>

## rank 63: score=94 AP=0x1864978 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x12f9e18 ['compact']
- +0x30=0x1318ba8 ['compact', 'pointer-field']
- +0x38=0x1318ba8 ['writes-rdi-output']
- +0x0: 0x13187c0 FDE=(20023232, 20023376)
- +0x8: 0x1318850 FDE=(20023376, 20023394)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x1318862 FDE=(20023394, 20023409)
- +0x20: 0x1318872 FDE=(20023410, 20024231)
- +0x28: 0x12f9e18 FDE=(19897880, 19897906)
- +0x30: 0x1318ba8 FDE=(20024232, 20024240)
- +0x38: 0x1318ba8 FDE=(20024232, 20024240)
- +0x40: 0x1318bb0 FDE=(20024240, 20025603)
- +0x48: 0x1319104 FDE=(20025604, 20025626)
- +0x50: 0x9d81d0 FDE=(10322384, 10322387)
- +0x58: 0xbea56e FDE=(12494190, 12494194)
- +0x60: 0x131911a FDE=(20025626, 20025778)
- +0x68: 0x13191b2 FDE=(20025778, 20025795)
- +0x70: 0x13191b2 FDE=(20025778, 20025795)
- +0x78: 0xa3fa60 FDE=(10746464, 10746467)
### +0x28 body
     12f9e18:	48 89 f8             	mov    rax,rdi
     12f9e1b:	0f 57 c0             	xorps  xmm0,xmm0
     12f9e1e:	48 83 67 20 00       	and    QWORD PTR [rdi+0x20],0x0
     12f9e23:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
     12f9e27:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     12f9e2a:	c7 47 28 00 00 80 3f 	mov    DWORD PTR [rdi+0x28],0x3f800000
     12f9e31:	c3                   	ret
### +0x30 body
     1318ba8:	48 8b 87 18 02 00 00 	mov    rax,QWORD PTR [rdi+0x218]
     1318baf:	c3                   	ret
### +0x38 body
     1318ba8:	48 8b 87 18 02 00 00 	mov    rax,QWORD PTR [rdi+0x218]
     1318baf:	c3                   	ret
### AP materializations
     12abfa8:	48 8d 05 c9 89 5b 00 	lea    rax,[rip+0x5b89c9]        # 1864978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21060>
     13187c4:	48 8d 05 ad c1 54 00 	lea    rax,[rip+0x54c1ad]        # 1864978 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21060>

## rank 64: score=94 AP=0x1849228 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xa7a004 ['compact', 'pointer-field']
- +0x30=0xaf657c ['compact']
- +0x38=0xaa701e ['writes-rdi-output']
- +0x0: 0x107492e FDE=(17254702, 17254783)
- +0x8: 0x1074980 FDE=(17254784, 17254802)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xac3ae0 FDE=(11287264, 11287269)
- +0x28: 0xa7a004 FDE=(10985476, 10985481)
- +0x30: 0xaf657c FDE=(11494780, 11494805)
- +0x38: 0xaa701e FDE=(11169822, 11169827)
- +0x40: 0xaa712a FDE=(11170090, 11170095)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x106ef44 FDE=(17231684, 17231699)
- +0x60: 0x106ef54 FDE=(17231700, 17231718)
- +0x68: 0x106ef66 FDE=(17231718, 17231802)
- +0x70: 0x0 FDE=None
- +0x78: 0xa50370 FDE=(10814320, 10814325)
### +0x28 body
      a7a004:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      a7a008:	c3                   	ret
### +0x30 body
      af657c:	48 89 f8             	mov    rax,rdi
      af657f:	48 8b 4e 40          	mov    rcx,QWORD PTR [rsi+0x40]
      af6583:	0f 10 46 38          	movups xmm0,XMMWORD PTR [rsi+0x38]
      af6587:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      af658a:	48 85 c9             	test   rcx,rcx
      af658d:	74 05                	je     af6594 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x43534>
      af658f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      af6594:	c3                   	ret
### +0x38 body
      aa701e:	48 8b 47 48          	mov    rax,QWORD PTR [rdi+0x48]
      aa7022:	c3                   	ret
### AP materializations
     1073333:	48 8d 05 ee 5e 7d 00 	lea    rax,[rip+0x7d5eee]        # 1849228 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5910>
     1074932:	48 8d 05 ef 48 7d 00 	lea    rax,[rip+0x7d48ef]        # 1849228 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x5910>

## rank 65: score=94 AP=0x18287c0 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xca5c00 ['compact', 'this-relative-pointer']
- +0x30=0xd98ff8 ['compact']
- +0x38=0xd88670 ['writes-rdi-output']
- +0x0: 0xda120e FDE=(14291470, 14291917)
- +0x8: 0xda13ce FDE=(14291918, 14291936)
- +0x10: 0xca5c00 FDE=(13261824, 13261829)
- +0x18: 0xda13e0 FDE=(14291936, 14291949)
- +0x20: 0x9d81d0 FDE=(10322384, 10322387)
- +0x28: 0xca5c00 FDE=(13261824, 13261829)
- +0x30: 0xd98ff8 FDE=(14258168, 14258186)
- +0x38: 0xd88670 FDE=(14190192, 14190200)
- +0x40: 0xd88670 FDE=(14190192, 14190200)
- +0x48: 0xda13ee FDE=(14291950, 14292064)
- +0x50: 0xda1460 FDE=(14292064, 14292071)
- +0x58: 0xda1468 FDE=(14292072, 14293191)
- +0x60: 0xda18c8 FDE=(14293192, 14293204)
- +0x68: 0xda18d4 FDE=(14293204, 14293269)
- +0x70: 0xda1916 FDE=(14293270, 14293795)
- +0x78: 0xda1b24 FDE=(14293796, 14295834)
### +0x28 body
      ca5c00:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ca5c04:	c3                   	ret
### +0x30 body
      d98ff8:	53                   	push   rbx
      d98ff9:	48 89 fb             	mov    rbx,rdi
      d98ffc:	48 83 c6 18          	add    rsi,0x18
      d99000:	e8 e3 4c dd ff       	call   b6dce8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbac88>
      d99005:	48 89 d8             	mov    rax,rbx
      d99008:	5b                   	pop    rbx
      d99009:	c3                   	ret
### +0x38 body
      d88670:	48 8b 87 90 00 00 00 	mov    rax,QWORD PTR [rdi+0x90]
      d88677:	c3                   	ret
### AP materializations
      d982f1:	48 8d 05 c8 04 a9 00 	lea    rax,[rip+0xa904c8]        # 18287c0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4df0>
      da122d:	48 8d 05 8c 75 a8 00 	lea    rax,[rip+0xa8758c]        # 18287c0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4df0>

## rank 66: score=94 AP=0x1828508 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xca5c00 ['compact', 'this-relative-pointer']
- +0x30=0xd98ff8 ['compact']
- +0x38=0xaae34e ['writes-rdi-output']
- +0x0: 0xd9f0f8 FDE=(14283000, 14283368)
- +0x8: 0xd9f268 FDE=(14283368, 14283386)
- +0x10: 0xca5c00 FDE=(13261824, 13261829)
- +0x18: 0xd9f27a FDE=(14283386, 14283399)
- +0x20: 0xbeb724 FDE=(12498724, 12498728)
- +0x28: 0xca5c00 FDE=(13261824, 13261829)
- +0x30: 0xd98ff8 FDE=(14258168, 14258186)
- +0x38: 0xaae34e FDE=(11199310, 11199318)
- +0x40: 0xaae34e FDE=(11199310, 11199318)
- +0x48: 0xd9f288 FDE=(14283400, 14283443)
- +0x50: 0xd9f2b4 FDE=(14283444, 14283451)
- +0x58: 0xd9f2bc FDE=(14283452, 14284779)
- +0x60: 0xd99618 FDE=(14259736, 14259748)
- +0x68: 0xd9f7ec FDE=(14284780, 14284792)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0xd9f7f8 FDE=(14284792, 14285740)
### +0x28 body
      ca5c00:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ca5c04:	c3                   	ret
### +0x30 body
      d98ff8:	53                   	push   rbx
      d98ff9:	48 89 fb             	mov    rbx,rdi
      d98ffc:	48 83 c6 18          	add    rsi,0x18
      d99000:	e8 e3 4c dd ff       	call   b6dce8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbac88>
      d99005:	48 89 d8             	mov    rax,rbx
      d99008:	5b                   	pop    rbx
      d99009:	c3                   	ret
### +0x38 body
      aae34e:	48 8b 87 a8 00 00 00 	mov    rax,QWORD PTR [rdi+0xa8]
      aae355:	c3                   	ret
### AP materializations
      d984f4:	48 8d 05 0d 00 a9 00 	lea    rax,[rip+0xa9000d]        # 1828508 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4b38>
      d9f117:	48 8d 05 ea 93 a8 00 	lea    rax,[rip+0xa893ea]        # 1828508 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4b38>

## rank 67: score=94 AP=0x1828048 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xca5c00 ['compact', 'this-relative-pointer']
- +0x30=0xd98ff8 ['compact']
- +0x38=0xcc03c4 ['writes-rdi-output']
- +0x0: 0xd98e8e FDE=(14257806, 14258128)
- +0x8: 0xd98fd0 FDE=(14258128, 14258146)
- +0x10: 0xca5c00 FDE=(13261824, 13261829)
- +0x18: 0xd98fe2 FDE=(14258146, 14258159)
- +0x20: 0xd98ff0 FDE=(14258160, 14258167)
- +0x28: 0xca5c00 FDE=(13261824, 13261829)
- +0x30: 0xd98ff8 FDE=(14258168, 14258186)
- +0x38: 0xcc03c4 FDE=(13370308, 13370316)
- +0x40: 0xcc03c4 FDE=(13370308, 13370316)
- +0x48: 0xd9900a FDE=(14258186, 14258193)
- +0x50: 0xd99012 FDE=(14258194, 14258201)
- +0x58: 0xd9901a FDE=(14258202, 14259735)
- +0x60: 0xd99618 FDE=(14259736, 14259748)
- +0x68: 0xd99624 FDE=(14259748, 14259755)
- +0x70: 0x9d81d0 FDE=(10322384, 10322387)
- +0x78: 0xd9962c FDE=(14259756, 14260821)
### +0x28 body
      ca5c00:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ca5c04:	c3                   	ret
### +0x30 body
      d98ff8:	53                   	push   rbx
      d98ff9:	48 89 fb             	mov    rbx,rdi
      d98ffc:	48 83 c6 18          	add    rsi,0x18
      d99000:	e8 e3 4c dd ff       	call   b6dce8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbac88>
      d99005:	48 89 d8             	mov    rax,rbx
      d99008:	5b                   	pop    rbx
      d99009:	c3                   	ret
### +0x38 body
      cc03c4:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
      cc03cb:	c3                   	ret
### AP materializations
      d981c2:	48 8d 05 7f fe a8 00 	lea    rax,[rip+0xa8fe7f]        # 1828048 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4678>
      d98ead:	48 8d 05 94 f1 a8 00 	lea    rax,[rip+0xa8f194]        # 1828048 <_ZTIN4asio2ip16bad_address_castE@@Base+0x4678>

## rank 68: score=94 AP=0x181ef98 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xc94fd2 ['compact', 'pointer-field']
- +0x30=0xcc03a4 ['compact']
- +0x38=0xcc03c4 ['writes-rdi-output']
- +0x0: 0xcc02a4 FDE=(13370020, 13370242)
- +0x8: 0xcc0382 FDE=(13370242, 13370260)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x9d7de0 FDE=(10321376, 10321377)
- +0x20: 0xcc0394 FDE=(13370260, 13370276)
- +0x28: 0xc94fd2 FDE=(13193170, 13193178)
- +0x30: 0xcc03a4 FDE=(13370276, 13370307)
- +0x38: 0xcc03c4 FDE=(13370308, 13370316)
- +0x40: 0xc82c70 FDE=(13118576, 13118584)
- +0x48: 0xcc03cc FDE=(13370316, 13370337)
- +0x50: 0xcc03e2 FDE=(13370338, 13370359)
- +0x58: 0xcc03f8 FDE=(13370360, 13370609)
- +0x60: 0x0 FDE=None
- +0x68: 0x0 FDE=None
- +0x70: 0xcbfe98 FDE=(13368984, 13369003)
- +0x78: 0xcbfeac FDE=(13369004, 13369022)
### +0x28 body
      c94fd2:	48 8b 87 98 00 00 00 	mov    rax,QWORD PTR [rdi+0x98]
      c94fd9:	c3                   	ret
### +0x30 body
      cc03a4:	48 89 f8             	mov    rax,rdi
      cc03a7:	48 8b 8e a8 00 00 00 	mov    rcx,QWORD PTR [rsi+0xa8]
      cc03ae:	0f 28 86 a0 00 00 00 	movaps xmm0,XMMWORD PTR [rsi+0xa0]
      cc03b5:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
      cc03b8:	48 85 c9             	test   rcx,rcx
      cc03bb:	74 05                	je     cc03c2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20d362>
      cc03bd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      cc03c2:	c3                   	ret
### +0x38 body
      cc03c4:	48 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [rdi+0xb0]
      cc03cb:	c3                   	ret
### AP materializations
      cb7a73:	48 8d 05 1e 75 b6 00 	lea    rax,[rip+0xb6751e]        # 181ef98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14c58>
      cc02a8:	48 8d 05 e9 ec b5 00 	lea    rax,[rip+0xb5ece9]        # 181ef98 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x14c58>

## rank 69: score=94 AP=0x181dc58 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0xca3a7e ['compact', 'delegated-pointer-getter']
- +0x30=0xca3aa0 ['compact']
- +0x38=0xca3ab2 ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0xca3a10 FDE=(13253136, 13253246)
- +0x18: 0x0 FDE=None
- +0x20: 0x0 FDE=None
- +0x28: 0xca3a7e FDE=(13253246, 13253280)
- +0x30: 0xca3aa0 FDE=(13253280, 13253298)
- +0x38: 0xca3ab2 FDE=(13253298, 13253565)
- +0x40: 0xca3bbe FDE=(13253566, 13253658)
- +0x48: 0xca3c1a FDE=(13253658, 13253759)
- +0x50: 0xca3c80 FDE=(13253760, 13253803)
- +0x58: 0x0 FDE=None
- +0x60: 0x0 FDE=None
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0xca3d3e FDE=(13253950, 13253983)
### +0x28 body
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
### +0x30 body
      ca3aa0:	53                   	push   rbx
      ca3aa1:	48 89 fb             	mov    rbx,rdi
      ca3aa4:	e8 d5 ff ff ff       	call   ca3a7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f0a1e>
      ca3aa9:	48 89 df             	mov    rdi,rbx
      ca3aac:	5b                   	pop    rbx
      ca3aad:	e9 6e a4 b4 00       	jmp    17edf20 <_ZdlPv@plt>
### +0x38 body
      ca3ab2:	41 57                	push   r15
      ca3ab4:	41 56                	push   r14
      ca3ab6:	41 54                	push   r12
      ca3ab8:	53                   	push   rbx
      ca3ab9:	48 83 ec 48          	sub    rsp,0x48
      ca3abd:	48 89 fb             	mov    rbx,rdi
      ca3ac0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ca3ac7:	00 00 
      ca3ac9:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      ca3ace:	48 83 7e 18 00       	cmp    QWORD PTR [rsi+0x18],0x0
      ca3ad3:	0f 84 b8 00 00 00    	je     ca3b91 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f0b31>
      ca3ad9:	49 89 d6             	mov    r14,rdx
      ca3adc:	49 89 f7             	mov    r15,rsi
      ca3adf:	4c 8b 66 10          	mov    r12,QWORD PTR [rsi+0x10]
      ca3ae3:	49 8d bc 24 d0 09 00 	lea    rdi,[r12+0x9d0]
      ca3aea:	00 
      ca3aeb:	41 ff 94 24 e8 09 00 	call   QWORD PTR [r12+0x9e8]
      ca3af2:	00 
      ca3af3:	49 69 8c 24 00 0a 00 	imul   rcx,QWORD PTR [r12+0xa00],0x3e8
      ca3afa:	00 e8 03 00 00 
      ca3aff:	4d 8b 7f 18          	mov    r15,QWORD PTR [r15+0x18]
      ca3b03:	49 bc 00 c0 b7 7d 12 	movabs r12,0x7127db7c000
      ca3b0a:	07 00 00 
      ca3b0d:	49 01 c4             	add    r12,rax
      ca3b10:	49 01 cc             	add    r12,rcx
      ca3b13:	4c 89 f7             	mov    rdi,r14
      ca3b16:	e8 1b 7d dd ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
      ca3b1b:	4d 8b 07             	mov    r8,QWORD PTR [r15]
      ca3b1e:	4c 89 ff             	mov    rdi,r15
      ca3b21:	48 89 c6             	mov    rsi,rax
      ca3b24:	4c 89 e1             	mov    rcx,r12
      ca3b27:	41 ff 50 30          	call   QWORD PTR [r8+0x30]
      ca3b2b:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      ca3b2f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      ca3b34:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
      ca3b38:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      ca3b3c:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
      ca3b3f:	0f 57 c9             	xorps  xmm1,xmm1
      ca3b42:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
      ca3b46:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      ca3b4b:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
      ca3b4f:	49 89 e6             	mov    r14,rsp
      ca3b52:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
      ca3b56:	0f 28 07             	movaps xmm0,XMMWORD PTR [rdi]
      ca3b59:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      ca3b5d:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
      ca3b60:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
      ca3b65:	e8 26 a3 b4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ca3b6a:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      ca3b6e:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
      ca3b72:	41 0f 28 06          	movaps xmm0,XMMWORD PTR [r14]
      ca3b76:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      ca3b79:	0f 57 c0             	xorps  xmm0,xmm0
      ca3b7c:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
      ca3b80:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      ca3b85:	4c 89 f7             	mov    rdi,r14
      ca3b88:	e8 03 a3 b4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ca3b8d:	b0 01                	mov    al,0x1
      ca3b8f:	eb 05                	jmp    ca3b96 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f0b36>
      ca3b91:	c6 03 00             	mov    BYTE PTR [rbx],0x0
      ca3b94:	31 c0                	xor    eax,eax
      ca3b96:	88 43 18             	mov    BYTE PTR [rbx+0x18],al
      ca3b99:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ca3ba0:	00 00 
      ca3ba2:	48 3b 44 24 40       	cmp    rax,QWORD PTR [rsp+0x40]
      ca3ba7:	75 0f                	jne    ca3bb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f0b58>
      ca3ba9:	48 89 d8             	mov    rax,rbx
      ca3bac:	48 83 c4 48          	add    rsp,0x48
      ca3bb0:	5b                   	pop    rbx
      ca3bb1:	41 5c                	pop    r12
      ca3bb3:	41 5e                	pop    r14
      ca3bb5:	41 5f                	pop    r15
      ca3bb7:	c3                   	ret
      ca3bb8:	e8 f3 be b4 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
      c93d6c:	48 8d 0d e5 9e b8 00 	lea    rcx,[rip+0xb89ee5]        # 181dc58 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x13918>

## rank 70: score=94 AP=0x181b498 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xc7bfce ['compact']
- +0x30=0xc7bfe0 ['compact', 'pointer-field']
- +0x38=0xa2ec70 ['writes-rdi-output']
- +0x0: 0xc7bea8 FDE=(13090472, 13090529)
- +0x8: 0xc7bee2 FDE=(13090530, 13090548)
- +0x10: 0xc7bef4 FDE=(13090548, 13090555)
- +0x18: 0xc7befc FDE=(13090556, 13090761)
- +0x20: 0xc7bfca FDE=(13090762, 13090766)
- +0x28: 0xc7bfce FDE=(13090766, 13090784)
- +0x30: 0xc7bfe0 FDE=(13090784, 13090793)
- +0x38: 0xa2ec70 FDE=(10677360, 10677364)
- +0x40: 0xc7bfea FDE=(13090794, 13090803)
- +0x48: 0xc7bff4 FDE=(13090804, 13090813)
- +0x50: 0xc7bffe FDE=(13090814, 13090869)
- +0x58: 0xc7c036 FDE=(13090870, 13090949)
- +0x60: 0xc7c086 FDE=(13090950, 13091117)
- +0x68: 0xc7c12e FDE=(13091118, 13091134)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
      c7bfce:	53                   	push   rbx
      c7bfcf:	48 89 fb             	mov    rbx,rdi
      c7bfd2:	48 83 c6 40          	add    rsi,0x40
      c7bfd6:	e8 65 1f b7 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      c7bfdb:	48 89 d8             	mov    rax,rbx
      c7bfde:	5b                   	pop    rbx
      c7bfdf:	c3                   	ret
### +0x30 body
      c7bfe0:	48 8b 47 6c          	mov    rax,QWORD PTR [rdi+0x6c]
      c7bfe4:	48 8b 57 74          	mov    rdx,QWORD PTR [rdi+0x74]
      c7bfe8:	c3                   	ret
### +0x38 body
      a2ec70:	8b 47 7c             	mov    eax,DWORD PTR [rdi+0x7c]
      a2ec73:	c3                   	ret
### AP materializations
      c70a50:	48 8d 05 41 aa ba 00 	lea    rax,[rip+0xbaaa41]        # 181b498 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11158>
      c7beac:	48 8d 05 e5 f5 b9 00 	lea    rax,[rip+0xb9f5e5]        # 181b498 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x11158>

## rank 71: score=93 AP=0x18994d8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x1680840 ['compact']
- +0x30=0x1123e48 ['compact', 'delegated-pointer-getter']
- +0x38=0xbf53f4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x1680818 FDE=(23595032, 23595054)
- +0x8: 0x168082e FDE=(23595054, 23595072)
- +0x10: 0x1123e34 FDE=(17972788, 17972798)
- +0x18: 0xbf4ec2 FDE=(12537538, 12537548)
- +0x20: 0x1123e3e FDE=(17972798, 17972808)
- +0x28: 0x1680840 FDE=(23595072, 23595085)
- +0x30: 0x1123e48 FDE=(17972808, 17972818)
- +0x38: 0xbf53f4 FDE=(12538868, 12538878)
- +0x40: 0xe02660 FDE=(14689888, 14689898)
- +0x48: 0xbf5442 FDE=(12538946, 12538956)
- +0x50: 0x168084e FDE=(23595086, 23595105)
- +0x58: 0x1680862 FDE=(23595106, 23595164)
- +0x60: 0x168089c FDE=(23595164, 23595222)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x16808d6 FDE=(23595222, 23595368)
- +0x78: 0x1680812 FDE=(23595026, 23595032)
### +0x28 body
     1680840:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
     1680844:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1680847:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     168084b:	ff e0                	jmp    rax
### +0x30 body
     1123e48:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
     1123e4c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1123e4f:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
      bf53f4:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
      bf53f8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bf53fb:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     1629bd3:	48 8d 05 fe f8 26 00 	lea    rax,[rip+0x26f8fe]        # 18994d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6418>
     1682842:	48 8d 05 8f 6c 21 00 	lea    rax,[rip+0x216c8f]        # 18994d8 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x6418>

## rank 72: score=93 AP=0x1886d68 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x15d8330 ['compact']
- +0x30=0xe8f23c ['compact', 'delegated-pointer-getter']
- +0x38=0xb7d29e ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15d809e FDE=(22904990, 22905038)
- +0x8: 0x15d80ce FDE=(22905038, 22905056)
- +0x10: 0x0 FDE=None
- +0x18: 0x0 FDE=None
- +0x20: 0x15d8300 FDE=(22905600, 22905648)
- +0x28: 0x15d8330 FDE=(22905648, 22905666)
- +0x30: 0xe8f23c FDE=(15266364, 15266374)
- +0x38: 0xb7d29e FDE=(12047006, 12047016)
- +0x40: 0x15d8342 FDE=(22905666, 22905792)
- +0x48: 0x15d83c0 FDE=(22905792, 22906013)
- +0x50: 0xb7d2ca FDE=(12047050, 12047060)
- +0x58: 0x15d849e FDE=(22906014, 22906222)
- +0x60: 0x15d856e FDE=(22906222, 22906337)
- +0x68: 0x15d85e2 FDE=(22906338, 22906497)
- +0x70: 0x15d8682 FDE=(22906498, 22906524)
- +0x78: 0xab5972 FDE=(11229554, 11229573)
### +0x28 body
     15d8330:	53                   	push   rbx
     15d8331:	48 89 fb             	mov    rbx,rdi
     15d8334:	e8 c7 ff ff ff       	call   15d8300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41d884>
     15d8339:	48 89 df             	mov    rdi,rbx
     15d833c:	5b                   	pop    rbx
     15d833d:	e9 de 5b 21 00       	jmp    17edf20 <_ZdlPv@plt>
### +0x30 body
      e8f23c:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      e8f240:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      e8f243:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
### +0x38 body
      b7d29e:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
      b7d2a2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      b7d2a5:	ff 60 18             	jmp    QWORD PTR [rax+0x18]
### AP materializations
     15d8044:	48 8d 05 1d ed 2a 00 	lea    rax,[rip+0x2aed1d]        # 1886d68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x43450>
     15d80a2:	48 8d 05 bf ec 2a 00 	lea    rax,[rip+0x2aecbf]        # 1886d68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x43450>

## rank 73: score=93 AP=0x1885920 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c520c FDE=(22827532, 22827559)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15ccb6d:	48 8d 05 ac 8d 2b 00 	lea    rax,[rip+0x2b8dac]        # 1885920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42008>
     15d0ab6:	48 8d 05 63 4e 2b 00 	lea    rax,[rip+0x2b4e63]        # 1885920 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42008>

## rank 74: score=93 AP=0x1885858 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c56da FDE=(22828762, 22828947)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15cb0c4:	48 8d 05 8d a7 2b 00 	lea    rax,[rip+0x2ba78d]        # 1885858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41f40>
     15d0978:	48 8d 05 d9 4e 2b 00 	lea    rax,[rip+0x2b4ed9]        # 1885858 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41f40>

## rank 75: score=93 AP=0x18850f8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c5794 FDE=(22828948, 22828989)
- +0x8: 0xa02220 FDE=(10494496, 10494498)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x0 FDE=None
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15c56a1:	48 8d 05 50 fa 2b 00 	lea    rax,[rip+0x2bfa50]        # 18850f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x417e0>
     15c5798:	48 8d 05 59 f9 2b 00 	lea    rax,[rip+0x2bf959]        # 18850f8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x417e0>

## rank 76: score=93 AP=0x1884f68 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c584c FDE=(22829132, 22829179)
- +0x8: 0xa02220 FDE=(10494496, 10494498)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x116672c FDE=(18245420, 18245439)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15c5805:	48 8d 05 5c f7 2b 00 	lea    rax,[rip+0x2bf75c]        # 1884f68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41650>
     15c5850:	48 8d 05 11 f7 2b 00 	lea    rax,[rip+0x2bf711]        # 1884f68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41650>

## rank 77: score=92 AP=0x185d0e8 offset_to_top=0 typeinfo=0x0 direct_refs=3
- +0x28=0xca4170 ['compact']
- +0x30=0x122ba16 ['compact', 'delegated-pointer-getter']
- +0x38=0x122ba2a ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x122b9ee FDE=(19053038, 19053058)
- +0x18: 0xca416c FDE=(13255020, 13255024)
- +0x20: 0x122ba02 FDE=(19053058, 19053078)
- +0x28: 0xca4170 FDE=(13255024, 13255028)
- +0x30: 0x122ba16 FDE=(19053078, 19053098)
- +0x38: 0x122ba2a FDE=(19053098, 19053102)
- +0x40: 0x0 FDE=None
- +0x48: 0x0 FDE=None
- +0x50: 0x122b984 FDE=(19052932, 19052947)
- +0x58: 0x122b994 FDE=(19052948, 19052966)
- +0x60: 0x122b9a6 FDE=(19052966, 19053037)
- +0x68: 0x0 FDE=None
- +0x70: 0xa50370 FDE=(10814320, 10814325)
- +0x78: 0x0 FDE=None
### +0x28 body
      ca4170:	8a 47 11             	mov    al,BYTE PTR [rdi+0x11]
      ca4173:	c3                   	ret
### +0x30 body
     122ba16:	c6 47 12 01          	mov    BYTE PTR [rdi+0x12],0x1
     122ba1a:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
     122ba1e:	48 85 ff             	test   rdi,rdi
     122ba21:	74 06                	je     122ba29 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70fad>
     122ba23:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     122ba26:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
     122ba29:	c3                   	ret
### +0x38 body
     122ba2a:	8a 47 12             	mov    al,BYTE PTR [rdi+0x12]
     122ba2d:	c3                   	ret
### AP materializations
     122ae36:	4c 8d 05 ab 22 63 00 	lea    r8,[rip+0x6322ab]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>
     122af2c:	48 8d 0d b5 21 63 00 	lea    rcx,[rip+0x6321b5]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>
     122b764:	48 8d 05 7d 19 63 00 	lea    rax,[rip+0x63197d]        # 185d0e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x197d0>

## rank 78: score=92 AP=0x184ea58 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x10d4eb2 []
- +0x30=0xc44ec4 ['compact', 'this-relative-pointer']
- +0x38=0x10d4edc ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0x10d4df6 FDE=(17649142, 17649280)
- +0x8: 0x10d4e80 FDE=(17649280, 17649298)
- +0x10: 0x9d7de0 FDE=(10321376, 10321377)
- +0x18: 0x10d4e92 FDE=(17649298, 17649314)
- +0x20: 0x10d4ea2 FDE=(17649314, 17649330)
- +0x28: 0x10d4eb2 FDE=(17649330, 17649371)
- +0x30: 0xc44ec4 FDE=(12865220, 12865228)
- +0x38: 0x10d4edc FDE=(17649372, 17649397)
- +0x40: 0x10d4ef6 FDE=(17649398, 17649441)
- +0x48: 0x10d4f22 FDE=(17649442, 17649488)
- +0x50: 0xbddc16 FDE=(12442646, 12442677)
- +0x58: 0x10d4f50 FDE=(17649488, 17649513)
- +0x60: 0xe8f874 FDE=(15267956, 15267964)
- +0x68: 0x10d4f6a FDE=(17649514, 17649521)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
     10d4eb2:	48 89 f8             	mov    rax,rdi
     10d4eb5:	48 8b 4e 48          	mov    rcx,QWORD PTR [rsi+0x48]
     10d4eb9:	48 85 c9             	test   rcx,rcx
     10d4ebc:	74 16                	je     10d4ed4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c2ea>
     10d4ebe:	48 89 08             	mov    QWORD PTR [rax],rcx
     10d4ec1:	48 8b 4e 50          	mov    rcx,QWORD PTR [rsi+0x50]
     10d4ec5:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
     10d4ec9:	48 85 c9             	test   rcx,rcx
     10d4ecc:	74 0c                	je     10d4eda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c2f0>
     10d4ece:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     10d4ed3:	c3                   	ret
     10d4ed4:	0f 57 c0             	xorps  xmm0,xmm0
     10d4ed7:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     10d4eda:	c3                   	ret
### +0x30 body
      c44ec4:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
      c44ecb:	c3                   	ret
### +0x38 body
     10d4edc:	48 89 f8             	mov    rax,rdi
     10d4edf:	48 8b 4e 38          	mov    rcx,QWORD PTR [rsi+0x38]
     10d4ee3:	0f 28 46 30          	movaps xmm0,XMMWORD PTR [rsi+0x30]
     10d4ee7:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
     10d4eea:	48 85 c9             	test   rcx,rcx
     10d4eed:	74 05                	je     10d4ef4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x29c30a>
     10d4eef:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
     10d4ef4:	c3                   	ret
### AP materializations
     10d0eab:	48 8d 0d a6 db 77 00 	lea    rcx,[rip+0x77dba6]        # 184ea58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb140>
     10d4dfa:	48 8d 05 57 9c 77 00 	lea    rax,[rip+0x779c57]        # 184ea58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0xb140>

## rank 79: score=92 AP=0x1824bc8 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0xd482d0 ['compact', 'pointer-field', 'scalar-looking']
- +0x30=0xd482de ['compact', 'pointer-field']
- +0x38=0xd482e6 ['writes-rdi-output']
- +0x0: 0xd4821e FDE=(13926942, 13927101)
- +0x8: 0xd482be FDE=(13927102, 13927120)
- +0x10: 0x13f961c FDE=(20944412, 20944423)
- +0x18: 0x13f9628 FDE=(20944424, 20944433)
- +0x20: 0x13f9632 FDE=(20944434, 20944581)
- +0x28: 0xd482d0 FDE=(13927120, 13927134)
- +0x30: 0xd482de FDE=(13927134, 13927142)
- +0x38: 0xd482e6 FDE=(13927142, 13927238)
- +0x40: 0xd48346 FDE=(13927238, 13927346)
- +0x48: 0xd483b2 FDE=(13927346, 13927425)
- +0x50: 0xd48402 FDE=(13927426, 13927519)
- +0x58: 0xd48460 FDE=(13927520, 13927528)
- +0x60: 0xd48468 FDE=(13927528, 13927888)
- +0x68: 0x0 FDE=None
- +0x70: 0x0 FDE=None
- +0x78: 0xd4865a FDE=(13928026, 13928088)
### +0x28 body
      d482d0:	48 8b 47 50          	mov    rax,QWORD PTR [rdi+0x50]
      d482d4:	48 8b 00             	mov    rax,QWORD PTR [rax]
      d482d7:	83 38 00             	cmp    DWORD PTR [rax],0x0
      d482da:	0f 94 c0             	sete   al
      d482dd:	c3                   	ret
### +0x30 body
      d482de:	48 8b 47 50          	mov    rax,QWORD PTR [rdi+0x50]
      d482e2:	8a 40 30             	mov    al,BYTE PTR [rax+0x30]
      d482e5:	c3                   	ret
### +0x38 body
      d482e6:	41 57                	push   r15
      d482e8:	41 56                	push   r14
      d482ea:	41 55                	push   r13
      d482ec:	41 54                	push   r12
      d482ee:	53                   	push   rbx
      d482ef:	89 f3                	mov    ebx,esi
      d482f1:	4c 8b 77 50          	mov    r14,QWORD PTR [rdi+0x50]
      d482f5:	45 31 e4             	xor    r12d,r12d
      d482f8:	6a 01                	push   0x1
      d482fa:	41 5d                	pop    r13
      d482fc:	45 31 ff             	xor    r15d,r15d
      d482ff:	4c 89 f7             	mov    rdi,r14
      d48302:	44 89 fe             	mov    esi,r15d
      d48305:	89 da                	mov    edx,ebx
      d48307:	e8 c4 02 00 00       	call   d485d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15656>
      d4830c:	84 c0                	test   al,al
      d4830e:	74 1e                	je     d4832e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x153b4>
      d48310:	4b 8b 7c fe 08       	mov    rdi,QWORD PTR [r14+r15*8+0x8]
      d48315:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      d48318:	89 de                	mov    esi,ebx
      d4831a:	ff 50 20             	call   QWORD PTR [rax+0x20]
      d4831d:	41 08 c4             	or     r12b,al
      d48320:	4d 89 ef             	mov    r15,r13
      d48323:	41 f6 c4 01          	test   r12b,0x1
      d48327:	41 b4 01             	mov    r12b,0x1
      d4832a:	74 d3                	je     d482ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15385>
      d4832c:	eb 0e                	jmp    d4833c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x153c2>
      d4832e:	4d 89 ef             	mov    r15,r13
      d48331:	41 f6 c4 01          	test   r12b,0x1
      d48335:	41 b4 01             	mov    r12b,0x1
      d48338:	74 c5                	je     d482ff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15385>
      d4833a:	31 c0                	xor    eax,eax
      d4833c:	5b                   	pop    rbx
      d4833d:	41 5c                	pop    r12
      d4833f:	41 5d                	pop    r13
      d48341:	41 5e                	pop    r14
      d48343:	41 5f                	pop    r15
      d48345:	c3                   	ret
### AP materializations
      d41c63:	48 8d 05 5e 2f ae 00 	lea    rax,[rip+0xae2f5e]        # 1824bc8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x11f8>
      d48229:	48 8d 05 98 c9 ad 00 	lea    rax,[rip+0xadc998]        # 1824bc8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x11f8>

## rank 80: score=90 AP=0x189a938 offset_to_top=0 typeinfo=0x0 direct_refs=2
- +0x28=0x169d1be ['pointer-field']
- +0x30=0x169d486 ['pointer-field']
- +0x38=0x169d79e ['writes-rdi-output']
- +0x0: 0x169cca6 FDE=(23710886, 23711014)
- +0x8: 0x169cd26 FDE=(23711014, 23711170)
- +0x10: 0x169cdc2 FDE=(23711170, 23711302)
- +0x18: 0x169ce46 FDE=(23711302, 23712036)
- +0x20: 0x169d124 FDE=(23712036, 23712190)
- +0x28: 0x169d1be FDE=(23712190, 23712901)
- +0x30: 0x169d486 FDE=(23712902, 23713694)
- +0x38: 0x169d79e FDE=(23713694, 23713948)
- +0x40: 0x169d89c FDE=(23713948, 23714178)
- +0x48: 0x169d982 FDE=(23714178, 23714359)
- +0x50: 0x169da38 FDE=(23714360, 23717792)
- +0x58: 0x169e7a0 FDE=(23717792, 23719397)
- +0x60: 0x169ede6 FDE=(23719398, 23719524)
- +0x68: 0x169ee64 FDE=(23719524, 23719542)
- +0x70: 0x0 FDE=None
- +0x78: 0x0 FDE=None
### +0x28 body
     169d1be:	41 57                	push   r15
     169d1c0:	41 56                	push   r14
     169d1c2:	53                   	push   rbx
     169d1c3:	48 81 ec 80 00 00 00 	sub    rsp,0x80
     169d1ca:	49 89 d7             	mov    r15,rdx
     169d1cd:	49 89 f6             	mov    r14,rsi
     169d1d0:	48 89 fb             	mov    rbx,rdi
     169d1d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     169d1da:	00 00 
     169d1dc:	48 89 44 24 78       	mov    QWORD PTR [rsp+0x78],rax
     169d1e1:	48 83 c7 0c          	add    rdi,0xc
     169d1e5:	48 89 7c 24 68       	mov    QWORD PTR [rsp+0x68],rdi
     169d1ea:	c6 44 24 70 01       	mov    BYTE PTR [rsp+0x70],0x1
     169d1ef:	e8 fc 0e 15 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     169d1f4:	80 7b 08 00          	cmp    BYTE PTR [rbx+0x8],0x0
     169d1f8:	74 0c                	je     169d206 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51372>
     169d1fa:	41 f6 06 01          	test   BYTE PTR [r14],0x1
     169d1fe:	74 77                	je     169d277 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x513e3>
     169d200:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
     169d204:	eb 74                	jmp    169d27a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x513e6>
     169d206:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     169d20a:	48 89 e7             	mov    rdi,rsp
     169d20d:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     169d211:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     169d215:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     169d218:	0f 57 c0             	xorps  xmm0,xmm0
     169d21b:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     169d21f:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     169d224:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     169d228:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     169d22d:	0f 28 0f             	movaps xmm1,XMMWORD PTR [rdi]
     169d230:	0f 29 4c 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm1
     169d235:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     169d238:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     169d23d:	4c 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],r15
     169d242:	e8 49 0c 15 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     169d247:	4c 8b b3 88 00 00 00 	mov    r14,QWORD PTR [rbx+0x88]
     169d24e:	48 8b 83 90 00 00 00 	mov    rax,QWORD PTR [rbx+0x90]
     169d255:	49 39 c6             	cmp    r14,rax
     169d258:	73 58                	jae    169d2b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5141e>
     169d25a:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     169d25f:	4c 89 f7             	mov    rdi,r14
     169d262:	e8 f7 7e 4b ff       	call   b5515e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa20fe>
     169d267:	49 83 c6 20          	add    r14,0x20
     169d26b:	4c 89 b3 88 00 00 00 	mov    QWORD PTR [rbx+0x88],r14
     169d272:	e9 72 01 00 00       	jmp    169d3e9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51555>
     169d277:	49 ff c6             	inc    r14
     169d27a:	f6 43 38 01          	test   BYTE PTR [rbx+0x38],0x1
     169d27e:	74 06                	je     169d286 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x513f2>
     169d280:	48 8b 5b 48          	mov    rbx,QWORD PTR [rbx+0x48]
     169d284:	eb 04                	jmp    169d28a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x513f6>
     169d286:	48 83 c3 39          	add    rbx,0x39
     169d28a:	48 8d 35 eb 4c db fe 	lea    rsi,[rip+0xfffffffffedb4ceb]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     169d291:	48 8d 0d 1d e6 cc fe 	lea    rcx,[rip+0xfffffffffecce61d]        # 36b8b5 <_ZTSSt12bad_any_cast@@Base-0x24913>
     169d298:	6a 02                	push   0x2
     169d29a:	5f                   	pop    rdi
     169d29b:	ba fa 00 00 00       	mov    edx,0xfa
     169d2a0:	4d 89 f0             	mov    r8,r14
     169d2a3:	49 89 d9             	mov    r9,rbx
     169d2a6:	31 c0                	xor    eax,eax
     169d2a8:	e8 25 96 13 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     169d2ad:	e9 48 01 00 00       	jmp    169d3fa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51566>
     169d2b2:	48 8b 8b 80 00 00 00 	mov    rcx,QWORD PTR [rbx+0x80]
     169d2b9:	49 29 ce             	sub    r14,rcx
     169d2bc:	49 c1 fe 05          	sar    r14,0x5
     169d2c0:	49 8d 56 01          	lea    rdx,[r14+0x1]
     169d2c4:	48 89 d6             	mov    rsi,rdx
     169d2c7:	48 c1 ee 3b          	shr    rsi,0x3b
     169d2cb:	0f 85 50 01 00 00    	jne    169d421 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5158d>
     169d2d1:	48 29 c8             	sub    rax,rcx
     169d2d4:	48 89 c7             	mov    rdi,rax
     169d2d7:	48 c1 ff 04          	sar    rdi,0x4
     169d2db:	48 39 d7             	cmp    rdi,rdx
     169d2de:	48 0f 46 fa          	cmovbe rdi,rdx
     169d2e2:	48 8d 8b 90 00 00 00 	lea    rcx,[rbx+0x90]
     169d2e9:	48 ba ff ff ff ff ff 	movabs rdx,0x7ffffffffffffff
     169d2f0:	ff ff 07 
     169d2f3:	48 be e0 ff ff ff ff 	movabs rsi,0x7fffffffffffffe0
     169d2fa:	ff ff 7f 
     169d2fd:	48 39 f0             	cmp    rax,rsi
### +0x30 body
     169d486:	55                   	push   rbp
     169d487:	41 57                	push   r15
     169d489:	41 56                	push   r14
     169d48b:	41 54                	push   r12
     169d48d:	53                   	push   rbx
     169d48e:	48 81 ec 90 00 00 00 	sub    rsp,0x90
     169d495:	44 89 c5             	mov    ebp,r8d
     169d498:	49 89 cf             	mov    r15,rcx
     169d49b:	49 89 d4             	mov    r12,rdx
     169d49e:	49 89 f6             	mov    r14,rsi
     169d4a1:	48 89 fb             	mov    rbx,rdi
     169d4a4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     169d4ab:	00 00 
     169d4ad:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
     169d4b4:	00 
     169d4b5:	48 83 c7 0c          	add    rdi,0xc
     169d4b9:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
     169d4be:	c6 84 24 80 00 00 00 	mov    BYTE PTR [rsp+0x80],0x1
     169d4c5:	01 
     169d4c6:	e8 25 0c 15 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     169d4cb:	80 7b 08 00          	cmp    BYTE PTR [rbx+0x8],0x0
     169d4cf:	74 13                	je     169d4e4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51650>
     169d4d1:	41 f6 06 01          	test   BYTE PTR [r14],0x1
     169d4d5:	0f 84 a0 00 00 00    	je     169d57b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x516e7>
     169d4db:	4d 8b 76 10          	mov    r14,QWORD PTR [r14+0x10]
     169d4df:	e9 9a 00 00 00       	jmp    169d57e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x516ea>
     169d4e4:	8a 83 e8 00 00 00    	mov    al,BYTE PTR [rbx+0xe8]
     169d4ea:	84 c0                	test   al,al
     169d4ec:	74 05                	je     169d4f3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5165f>
     169d4ee:	40 84 ed             	test   bpl,bpl
     169d4f1:	74 12                	je     169d505 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51671>
     169d4f3:	84 c0                	test   al,al
     169d4f5:	75 07                	jne    169d4fe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5166a>
     169d4f7:	c6 83 e8 00 00 00 01 	mov    BYTE PTR [rbx+0xe8],0x1
     169d4fe:	4c 89 a3 e0 00 00 00 	mov    QWORD PTR [rbx+0xe0],r12
     169d505:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     169d509:	48 89 e7             	mov    rdi,rsp
     169d50c:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
     169d510:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     169d514:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     169d517:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
     169d51c:	0f 57 c0             	xorps  xmm0,xmm0
     169d51f:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     169d523:	48 8b 47 10          	mov    rax,QWORD PTR [rdi+0x10]
     169d527:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
     169d52c:	0f 28 0f             	movaps xmm1,XMMWORD PTR [rdi]
     169d52f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
     169d534:	0f 29 4c 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm1
     169d539:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     169d53c:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12
     169d541:	4c 89 7c 24 40       	mov    QWORD PTR [rsp+0x40],r15
     169d546:	e8 45 09 15 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     169d54b:	4c 8b b3 a0 00 00 00 	mov    r14,QWORD PTR [rbx+0xa0]
     169d552:	48 8b 8b a8 00 00 00 	mov    rcx,QWORD PTR [rbx+0xa8]
     169d559:	49 39 ce             	cmp    r14,rcx
     169d55c:	73 58                	jae    169d5b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51722>
     169d55e:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
     169d563:	4c 89 f7             	mov    rdi,r14
     169d566:	e8 31 19 00 00       	call   169ee9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53008>
     169d56b:	49 83 c6 28          	add    r14,0x28
     169d56f:	4c 89 b3 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],r14
     169d576:	e9 7b 01 00 00       	jmp    169d6f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51862>
     169d57b:	49 ff c6             	inc    r14
     169d57e:	f6 43 38 01          	test   BYTE PTR [rbx+0x38],0x1
     169d582:	74 06                	je     169d58a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x516f6>
     169d584:	48 8b 5b 48          	mov    rbx,QWORD PTR [rbx+0x48]
     169d588:	eb 04                	jmp    169d58e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x516fa>
     169d58a:	48 83 c3 39          	add    rbx,0x39
     169d58e:	48 8d 35 e7 49 db fe 	lea    rsi,[rip+0xfffffffffedb49e7]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     169d595:	48 8d 0d 1f d6 cb fe 	lea    rcx,[rip+0xfffffffffecbd61f]        # 35abbb <_ZTSSt12bad_any_cast@@Base-0x3560d>
     169d59c:	6a 02                	push   0x2
     169d59e:	5f                   	pop    rdi
     169d59f:	ba 0a 01 00 00       	mov    edx,0x10a
     169d5a4:	4d 89 f0             	mov    r8,r14
     169d5a7:	49 89 d9             	mov    r9,rbx
     169d5aa:	31 c0                	xor    eax,eax
     169d5ac:	e8 21 93 13 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     169d5b1:	e9 51 01 00 00       	jmp    169d707 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51873>
     169d5b6:	48 bf 66 66 66 66 66 	movabs rdi,0x666666666666666
     169d5bd:	66 66 06 
### +0x38 body
     169d79e:	41 57                	push   r15
     169d7a0:	41 56                	push   r14
     169d7a2:	53                   	push   rbx
     169d7a3:	48 83 ec 20          	sub    rsp,0x20
     169d7a7:	49 89 d6             	mov    r14,rdx
     169d7aa:	49 89 f7             	mov    r15,rsi
     169d7ad:	48 89 fb             	mov    rbx,rdi
     169d7b0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     169d7b7:	00 00 
     169d7b9:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     169d7be:	48 83 c7 0c          	add    rdi,0xc
     169d7c2:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
     169d7c7:	c6 44 24 10 01       	mov    BYTE PTR [rsp+0x10],0x1
     169d7cc:	e8 1f 09 15 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>
     169d7d1:	80 7b 08 00          	cmp    BYTE PTR [rbx+0x8],0x0
     169d7d5:	74 0c                	je     169d7e3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5194f>
     169d7d7:	f6 43 38 01          	test   BYTE PTR [rbx+0x38],0x1
     169d7db:	74 4d                	je     169d82a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51996>
     169d7dd:	48 8b 5b 48          	mov    rbx,QWORD PTR [rbx+0x48]
     169d7e1:	eb 4b                	jmp    169d82e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5199a>
     169d7e3:	48 8b bb f0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xf0]
     169d7ea:	48 85 ff             	test   rdi,rdi
     169d7ed:	74 0c                	je     169d7fb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51967>
     169d7ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     169d7f2:	4c 89 fe             	mov    rsi,r15
     169d7f5:	4c 89 f2             	mov    rdx,r14
     169d7f8:	ff 50 30             	call   QWORD PTR [rax+0x30]
     169d7fb:	48 8b bb 00 01 00 00 	mov    rdi,QWORD PTR [rbx+0x100]
     169d802:	48 85 ff             	test   rdi,rdi
     169d805:	74 0c                	je     169d813 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5197f>
     169d807:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     169d80a:	4c 89 fe             	mov    rsi,r15
     169d80d:	4c 89 f2             	mov    rdx,r14
     169d810:	ff 50 20             	call   QWORD PTR [rax+0x20]
     169d813:	48 81 c3 b0 00 00 00 	add    rbx,0xb0
     169d81a:	48 89 df             	mov    rdi,rbx
     169d81d:	4c 89 fe             	mov    rsi,r15
     169d820:	4c 89 f2             	mov    rdx,r14
     169d823:	e8 30 87 b2 ff       	call   11c5f58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb4dc>
     169d828:	eb 24                	jmp    169d84e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x519ba>
     169d82a:	48 83 c3 39          	add    rbx,0x39
     169d82e:	48 8d 35 47 47 db fe 	lea    rsi,[rip+0xfffffffffedb4747]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
     169d835:	48 8d 0d a5 70 ca fe 	lea    rcx,[rip+0xfffffffffeca70a5]        # 3448e1 <_ZTSSt12bad_any_cast@@Base-0x4b8e7>
     169d83c:	6a 02                	push   0x2
     169d83e:	5f                   	pop    rdi
     169d83f:	ba 19 01 00 00       	mov    edx,0x119
     169d844:	49 89 d8             	mov    r8,rbx
     169d847:	31 c0                	xor    eax,eax
     169d849:	e8 84 90 13 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
     169d84e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     169d853:	e8 d8 e5 40 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     169d858:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     169d85f:	00 00 
     169d861:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     169d866:	75 2f                	jne    169d897 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a03>
     169d868:	48 83 c4 20          	add    rsp,0x20
     169d86c:	5b                   	pop    rbx
     169d86d:	41 5e                	pop    r14
     169d86f:	41 5f                	pop    r15
     169d871:	c3                   	ret
     169d872:	48 89 c3             	mov    rbx,rax
     169d875:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     169d87a:	e8 b1 e5 40 ff       	call   aabe30 <JNI_OnUnload@@Base+0x336fd>
     169d87f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     169d886:	00 00 
     169d888:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
     169d88d:	75 08                	jne    169d897 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x51a03>
     169d88f:	48 89 df             	mov    rdi,rbx
     169d892:	e8 39 24 3d ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     169d897:	e8 14 22 15 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
     169ca48:	48 8d 05 e9 de 1f 00 	lea    rax,[rip+0x1fdee9]        # 189a938 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x7878>
     169edea:	48 8d 05 47 bb 1f 00 	lea    rax,[rip+0x1fbb47]        # 189a938 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x7878>

## rank 81: score=90 AP=0x1897380 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x1662ef8 ['compact', 'pointer-field']
- +0x30=0x1662f20 ['compact']
- +0x38=0x1662f3e ['writes-rdi-output']
- +0x0: 0x9d7de0 FDE=(10321376, 10321377)
- +0x8: 0xa50370 FDE=(10814320, 10814325)
- +0x10: 0x1662da2 FDE=(23473570, 23473704)
- +0x18: 0x16647e6 FDE=(23480294, 23480383)
- +0x20: 0x1662e68 FDE=(23473768, 23473779)
- +0x28: 0x1662ef8 FDE=(23473912, 23473928)
- +0x30: 0x1662f20 FDE=(23473952, 23473982)
- +0x38: 0x1662f3e FDE=(23473982, 23474012)
- +0x40: 0x1662f5c FDE=(23474012, 23474028)
- +0x48: 0x1662f6c FDE=(23474028, 23474039)
- +0x50: 0x1662f78 FDE=(23474040, 23474051)
- +0x58: 0x1662f84 FDE=(23474052, 23474063)
- +0x60: 0x1663028 FDE=(23474216, 23474324)
- +0x68: 0x9d7de0 FDE=(10321376, 10321377)
- +0x70: 0x1663094 FDE=(23474324, 23474332)
- +0x78: 0x166309c FDE=(23474332, 23474371)
### +0x28 body
     1662ef8:	48 8b 47 40          	mov    rax,QWORD PTR [rdi+0x40]
     1662efc:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
     1662f03:	48 83 e0 fc          	and    rax,0xfffffffffffffffc
     1662f07:	c3                   	ret
### +0x30 body
     1662f20:	48 8b 4f 40          	mov    rcx,QWORD PTR [rdi+0x40]
     1662f24:	31 c0                	xor    eax,eax
     1662f26:	f6 41 11 02          	test   BYTE PTR [rcx+0x11],0x2
     1662f2a:	74 11                	je     1662f3d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170a9>
     1662f2c:	8b 89 d0 00 00 00    	mov    ecx,DWORD PTR [rcx+0xd0]
     1662f32:	8d 51 01             	lea    edx,[rcx+0x1]
     1662f35:	31 c0                	xor    eax,eax
     1662f37:	83 f9 03             	cmp    ecx,0x3
     1662f3a:	0f 42 c2             	cmovb  eax,edx
     1662f3d:	c3                   	ret
### +0x38 body
     1662f3e:	48 8b 4f 40          	mov    rcx,QWORD PTR [rdi+0x40]
     1662f42:	31 c0                	xor    eax,eax
     1662f44:	f6 41 11 20          	test   BYTE PTR [rcx+0x11],0x20
     1662f48:	74 11                	je     1662f5b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x170c7>
     1662f4a:	8b 89 d8 00 00 00    	mov    ecx,DWORD PTR [rcx+0xd8]
     1662f50:	8d 51 ff             	lea    edx,[rcx-0x1]
     1662f53:	31 c0                	xor    eax,eax
     1662f55:	83 fa 03             	cmp    edx,0x3
     1662f58:	0f 42 c1             	cmovb  eax,ecx
     1662f5b:	c3                   	ret
### AP materializations
      c1d791:	48 8d 05 e8 9b c7 00 	lea    rax,[rip+0xc79be8]        # 1897380 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0x42c0>

## rank 82: score=90 AP=0x181e080 offset_to_top=0 typeinfo=0x0 direct_refs=3
- +0x28=0xca8de2 ['compact', 'delegated-pointer-getter']
- +0x30=0xca8dec []
- +0x38=0xca8e3a ['writes-rdi-output', 'reads-rsi-this']
- +0x0: 0xca8d00 FDE=(13274368, 13274387)
- +0x8: 0xca8d14 FDE=(13274388, 13274406)
- +0x10: 0xca8d26 FDE=(13274406, 13274416)
- +0x18: 0xca8d30 FDE=(13274416, 13274594)
- +0x20: 0xa68320 FDE=(10912544, 10912554)
- +0x28: 0xca8de2 FDE=(13274594, 13274604)
- +0x30: 0xca8dec FDE=(13274604, 13274682)
- +0x38: 0xca8e3a FDE=(13274682, 13275046)
- +0x40: 0xca8fa6 FDE=(13275046, 13275167)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0x9d7de0 FDE=(10321376, 10321377)
- +0x60: 0xa50370 FDE=(10814320, 10814325)
- +0x68: 0xca9020 FDE=(13275168, 13275581)
- +0x70: 0xca91be FDE=(13275582, 13276481)
- +0x78: 0x0 FDE=None
### +0x28 body
      ca8de2:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
      ca8de6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ca8de9:	ff 60 10             	jmp    QWORD PTR [rax+0x10]
### +0x30 body
      ca8dec:	53                   	push   rbx
      ca8ded:	48 83 ec 10          	sub    rsp,0x10
      ca8df1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ca8df8:	00 00 
      ca8dfa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      ca8dff:	48 8b 77 18          	mov    rsi,QWORD PTR [rdi+0x18]
      ca8e03:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ca8e06:	48 89 e3             	mov    rbx,rsp
      ca8e09:	48 89 df             	mov    rdi,rbx
      ca8e0c:	ff 50 50             	call   QWORD PTR [rax+0x50]
      ca8e0f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      ca8e12:	48 85 ff             	test   rdi,rdi
      ca8e15:	0f 94 c3             	sete   bl
      ca8e18:	e8 cf d8 e0 ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
      ca8e1d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ca8e24:	00 00 
      ca8e26:	48 3b 44 24 08       	cmp    rax,QWORD PTR [rsp+0x8]
      ca8e2b:	75 08                	jne    ca8e35 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f5dd5>
      ca8e2d:	89 d8                	mov    eax,ebx
      ca8e2f:	48 83 c4 10          	add    rsp,0x10
      ca8e33:	5b                   	pop    rbx
      ca8e34:	c3                   	ret
      ca8e35:	e8 76 6c b4 00       	call   17efab0 <__stack_chk_fail@plt>
### +0x38 body
      ca8e3a:	41 57                	push   r15
      ca8e3c:	41 56                	push   r14
      ca8e3e:	41 54                	push   r12
      ca8e40:	53                   	push   rbx
      ca8e41:	48 81 ec e8 00 00 00 	sub    rsp,0xe8
      ca8e48:	49 89 f6             	mov    r14,rsi
      ca8e4b:	48 89 fb             	mov    rbx,rdi
      ca8e4e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ca8e55:	00 00 
      ca8e57:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      ca8e5e:	00 
      ca8e5f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      ca8e62:	48 89 f7             	mov    rdi,rsi
      ca8e65:	ff 50 28             	call   QWORD PTR [rax+0x28]
      ca8e68:	84 c0                	test   al,al
      ca8e6a:	0f 84 cd 00 00 00    	je     ca8f3d <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f5edd>
      ca8e70:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
      ca8e74:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ca8e77:	ff 50 40             	call   QWORD PTR [rax+0x40]
      ca8e7a:	49 89 c6             	mov    r14,rax
      ca8e7d:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
      ca8e82:	49 89 07             	mov    QWORD PTR [r15],rax
      ca8e85:	48 01 c2             	add    rdx,rax
      ca8e88:	49 89 57 08          	mov    QWORD PTR [r15+0x8],rdx
      ca8e8c:	41 c6 47 18 00       	mov    BYTE PTR [r15+0x18],0x0
      ca8e91:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
      ca8e96:	4c 89 e7             	mov    rdi,r12
      ca8e99:	e8 9e dc ff ff       	call   ca6b3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f3adc>
      ca8e9e:	41 8b 04 24          	mov    eax,DWORD PTR [r12]
      ca8ea2:	4c 01 f0             	add    rax,r14
      ca8ea5:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
      ca8ea9:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
      ca8eae:	e8 41 a4 9d 00       	call   16832f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37460>
      ca8eb3:	4c 8d 74 24 60       	lea    r14,[rsp+0x60]
      ca8eb8:	0f 57 c0             	xorps  xmm0,xmm0
      ca8ebb:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      ca8ebf:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      ca8ec4:	4c 89 ff             	mov    rdi,r15
      ca8ec7:	e8 66 ab 9d 00       	call   1683a32 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b9e>
      ca8ecc:	66 41 89 46 f8       	mov    WORD PTR [r14-0x8],ax
      ca8ed1:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
      ca8ed6:	4c 89 e7             	mov    rdi,r12
      ca8ed9:	4c 89 fe             	mov    rsi,r15
      ca8edc:	e8 f1 aa 9d 00       	call   16839d2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x37b3e>
      ca8ee1:	41 80 7c 24 10 00    	cmp    BYTE PTR [r12+0x10],0x0
      ca8ee7:	74 5d                	je     ca8f46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f5ee6>
      ca8ee9:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
      ca8eee:	48 8b 54 24 28       	mov    rdx,QWORD PTR [rsp+0x28]
      ca8ef3:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      ca8ef8:	e8 1d 3b df ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
      ca8efd:	4c 8d 7c 24 08       	lea    r15,[rsp+0x8]
      ca8f02:	4c 89 f7             	mov    rdi,r14
      ca8f05:	4c 89 fe             	mov    rsi,r15
      ca8f08:	e8 21 2b dd ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
      ca8f0d:	4c 89 ff             	mov    rdi,r15
      ca8f10:	e8 7b 4f b4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ca8f15:	0f b7 44 24 58       	movzx  eax,WORD PTR [rsp+0x58]
      ca8f1a:	66 89 03             	mov    WORD PTR [rbx],ax
      ca8f1d:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
      ca8f21:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      ca8f25:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
      ca8f29:	0f 11 43 08          	movups XMMWORD PTR [rbx+0x8],xmm0
      ca8f2d:	0f 57 c0             	xorps  xmm0,xmm0
      ca8f30:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
      ca8f34:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
      ca8f39:	b0 01                	mov    al,0x1
      ca8f3b:	eb 0e                	jmp    ca8f4b <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f5eeb>
      ca8f3d:	31 c0                	xor    eax,eax
      ca8f3f:	88 03                	mov    BYTE PTR [rbx],al
      ca8f41:	88 43 20             	mov    BYTE PTR [rbx+0x20],al
      ca8f44:	eb 10                	jmp    ca8f56 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f5ef6>
      ca8f46:	c6 03 00             	mov    BYTE PTR [rbx],0x0
      ca8f49:	31 c0                	xor    eax,eax
      ca8f4b:	88 43 20             	mov    BYTE PTR [rbx+0x20],al
      ca8f4e:	4c 89 f7             	mov    rdi,r14
      ca8f51:	e8 3a 4f b4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ca8f56:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ca8f5d:	00 00 
      ca8f5f:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
      ca8f66:	00 
      ca8f67:	75 38                	jne    ca8fa1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f5f41>
      ca8f69:	48 89 d8             	mov    rax,rbx
      ca8f6c:	48 81 c4 e8 00 00 00 	add    rsp,0xe8
      ca8f73:	5b                   	pop    rbx
      ca8f74:	41 5c                	pop    r12
      ca8f76:	41 5e                	pop    r14
      ca8f78:	41 5f                	pop    r15
      ca8f7a:	c3                   	ret
      ca8f7b:	48 89 c3             	mov    rbx,rax
      ca8f7e:	4c 89 f7             	mov    rdi,r14
      ca8f81:	e8 0a 4f b4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      ca8f86:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      ca8f8d:	00 00 
      ca8f8f:	48 3b 84 24 e0 00 00 	cmp    rax,QWORD PTR [rsp+0xe0]
      ca8f96:	00 
      ca8f97:	75 08                	jne    ca8fa1 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f5f41>
      ca8f99:	48 89 df             	mov    rdi,rbx
      ca8f9c:	e8 2f 6d dc ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      ca8fa1:	e8 0a 6b b4 00       	call   17efab0 <__stack_chk_fail@plt>
### AP materializations
      c99ce3:	48 8d 0d 96 43 b8 00 	lea    rcx,[rip+0xb84396]        # 181e080 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x13d40>
      ca6588:	48 8d 0d f1 7a b7 00 	lea    rcx,[rip+0xb77af1]        # 181e080 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x13d40>
      ca8d00:	48 8d 05 79 53 b7 00 	lea    rax,[rip+0xb75379]        # 181e080 <_ZTIN5boost10wrapexceptISt12length_errorEE@@Base+0x13d40>

## rank 83: score=90 AP=0x17fea00 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0xab4ef0 ['compact']
- +0x30=0xab4efa ['compact', 'pointer-field']
- +0x38=0xab4efa ['writes-rdi-output']
- +0x0: 0xab4cd6 FDE=(11226326, 11226354)
- +0x8: 0xab4cf2 FDE=(11226354, 11226372)
- +0x10: 0xab4d04 FDE=(11226372, 11226796)
- +0x18: 0xab4eac FDE=(11226796, 11226853)
- +0x20: 0xab4ee6 FDE=(11226854, 11226863)
- +0x28: 0xab4ef0 FDE=(11226864, 11226874)
- +0x30: 0xab4efa FDE=(11226874, 11226883)
- +0x38: 0xab4efa FDE=(11226874, 11226883)
- +0x40: 0xab4f04 FDE=(11226884, 11226920)
- +0x48: 0x0 FDE=None
- +0x50: 0x0 FDE=None
- +0x58: 0xab4caa FDE=(11226282, 11226297)
- +0x60: 0xab4cba FDE=(11226298, 11226316)
- +0x68: 0xab4ccc FDE=(11226316, 11226325)
- +0x70: 0x0 FDE=None
- +0x78: 0xa50370 FDE=(10814320, 10814325)
### +0x28 body
      ab4ef0:	b8 00 0b 00 00       	mov    eax,0xb00
      ab4ef5:	48 03 47 08          	add    rax,QWORD PTR [rdi+0x8]
      ab4ef9:	c3                   	ret
### +0x30 body
      ab4efa:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      ab4efe:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      ab4f02:	c3                   	ret
### +0x38 body
      ab4efa:	48 8b 47 08          	mov    rax,QWORD PTR [rdi+0x8]
      ab4efe:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
      ab4f02:	c3                   	ret
### AP materializations
      aa39ae:	48 8d 05 4b b0 d5 00 	lea    rax,[rip+0xd5b04b]        # 17fea00 <_ZTIN4asio22service_already_existsE@@Base+0x1e8>

## rank 84: score=89 AP=0x1886bb8 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c520c FDE=(22827532, 22827559)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15d6350:	48 8d 05 61 08 2b 00 	lea    rax,[rip+0x2b0861]        # 1886bb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x432a0>

## rank 85: score=89 AP=0x1886af0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c584c FDE=(22829132, 22829179)
- +0x8: 0x15c543e FDE=(22828094, 22828112)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x116672c FDE=(18245420, 18245439)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15d6dc8:	48 8d 05 21 fd 2a 00 	lea    rax,[rip+0x2afd21]        # 1886af0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x431d8>

## rank 86: score=89 AP=0x1886a28 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c56da FDE=(22828762, 22828947)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15d6222:	48 8d 05 ff 07 2b 00 	lea    rax,[rip+0x2b07ff]        # 1886a28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x43110>

## rank 87: score=89 AP=0x1886878 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c520c FDE=(22827532, 22827559)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15d4e63:	48 8d 05 0e 1a 2b 00 	lea    rax,[rip+0x2b1a0e]        # 1886878 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42f60>

## rank 88: score=89 AP=0x18867b0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c584c FDE=(22829132, 22829179)
- +0x8: 0x15c543e FDE=(22828094, 22828112)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x116672c FDE=(18245420, 18245439)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15d5a30:	48 8d 05 79 0d 2b 00 	lea    rax,[rip+0x2b0d79]        # 18867b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42e98>

## rank 89: score=89 AP=0x18866e8 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c56da FDE=(22828762, 22828947)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15d4d1a:	48 8d 05 c7 19 2b 00 	lea    rax,[rip+0x2b19c7]        # 18866e8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42dd0>

## rank 90: score=89 AP=0x1886460 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c5794 FDE=(22828948, 22828989)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15d1ed4 FDE=(22879956, 22880057)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15d0fb8:	48 8d 05 a1 54 2b 00 	lea    rax,[rip+0x2b54a1]        # 1886460 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42b48>

## rank 91: score=89 AP=0x1886368 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c584c FDE=(22829132, 22829179)
- +0x8: 0x15c543e FDE=(22828094, 22828112)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x116672c FDE=(18245420, 18245439)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15d2370:	48 8d 05 f1 3f 2b 00 	lea    rax,[rip+0x2b3ff1]        # 1886368 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42a50>

## rank 92: score=89 AP=0x1886038 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c520c FDE=(22827532, 22827559)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15ce750:	48 8d 05 e1 78 2b 00 	lea    rax,[rip+0x2b78e1]        # 1886038 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42720>

## rank 93: score=89 AP=0x1885f70 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c584c FDE=(22829132, 22829179)
- +0x8: 0x15c543e FDE=(22828094, 22828112)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x116672c FDE=(18245420, 18245439)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15cf83a:	48 8d 05 2f 67 2b 00 	lea    rax,[rip+0x2b672f]        # 1885f70 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42658>

## rank 94: score=89 AP=0x1885d38 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c56da FDE=(22828762, 22828947)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15cde31:	48 8d 05 00 7f 2b 00 	lea    rax,[rip+0x2b7f00]        # 1885d38 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42420>

## rank 95: score=89 AP=0x1885ba8 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15ccce8 FDE=(22858984, 22859009)
- +0x8: 0x15cd7f8 FDE=(22861816, 22861834)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x116672c FDE=(18245420, 18245439)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15ccac0:	48 8d 05 e1 90 2b 00 	lea    rax,[rip+0x2b90e1]        # 1885ba8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x42290>

## rank 96: score=89 AP=0x18855c8 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c520c FDE=(22827532, 22827559)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15c6f41:	48 8d 05 80 e6 2b 00 	lea    rax,[rip+0x2be680]        # 18855c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41cb0>

## rank 97: score=89 AP=0x1885500 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c584c FDE=(22829132, 22829179)
- +0x8: 0x15c543e FDE=(22828094, 22828112)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x116672c FDE=(18245420, 18245439)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15c7746:	48 8d 05 b3 dd 2b 00 	lea    rax,[rip+0x2bddb3]        # 1885500 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41be8>

## rank 98: score=89 AP=0x1885438 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0x15c51fa FDE=(22827514, 22827532)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c56da FDE=(22828762, 22828947)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15c6e16:	48 8d 05 1b e6 2b 00 	lea    rax,[rip+0x2be61b]        # 1885438 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41b20>

## rank 99: score=89 AP=0x1885030 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0xa02220 FDE=(10494496, 10494498)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c520c FDE=(22827532, 22827559)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15c58fc:	48 8d 05 2d f7 2b 00 	lea    rax,[rip+0x2bf72d]        # 1885030 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41718>

## rank 100: score=89 AP=0x1884ea0 offset_to_top=0 typeinfo=0x0 direct_refs=1
- +0x28=0x11a020c ['compact']
- +0x30=0x11666de ['compact', 'delegated-pointer-getter']
- +0x38=0x11666d4 ['writes-rdi-output', 'compact-thunk']
- +0x0: 0x15c56d4 FDE=(22828756, 22828761)
- +0x8: 0xa02220 FDE=(10494496, 10494498)
- +0x10: 0x1166622 FDE=(18245154, 18245164)
- +0x18: 0x1166636 FDE=(18245174, 18245184)
- +0x20: 0x116662c FDE=(18245164, 18245174)
- +0x28: 0x11a020c FDE=(18481676, 18481689)
- +0x30: 0x11666de FDE=(18245342, 18245352)
- +0x38: 0x11666d4 FDE=(18245332, 18245342)
- +0x40: 0x11666e8 FDE=(18245352, 18245362)
- +0x48: 0x11666f2 FDE=(18245362, 18245372)
- +0x50: 0x11666fc FDE=(18245372, 18245391)
- +0x58: 0x116671e FDE=(18245406, 18245419)
- +0x60: 0x1166710 FDE=(18245392, 18245405)
- +0x68: 0x11359de FDE=(18045406, 18045440)
- +0x70: 0x15c56da FDE=(22828762, 22828947)
- +0x78: 0x1166740 FDE=(18245440, 18245453)
### +0x28 body
     11a020c:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11a0210:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11a0213:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
     11a0217:	ff e0                	jmp    rax
### +0x30 body
     11666de:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666e2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666e5:	ff 60 30             	jmp    QWORD PTR [rax+0x30]
### +0x38 body
     11666d4:	48 8b 7f 40          	mov    rdi,QWORD PTR [rdi+0x40]
     11666d8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     11666db:	ff 60 38             	jmp    QWORD PTR [rax+0x38]
### AP materializations
     15c5623:	48 8d 05 76 f8 2b 00 	lea    rax,[rip+0x2bf876]        # 1884ea0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x41588>

## Known address-point sanity checks
- 0x184c738: header=(0, 0) first=0x10a8812 second=0x10a88e0
- 0x184c858: header=(-8, 0) first=0x10a969c second=0x10a96a6
- 0x185b8d0: header=(0, 0) first=0x9d7de0 second=0xa50370
- 0x185bf88: header=(0, 0) first=0x11f8264 second=0x1200966
## Old shifted windows
- 0x18228d8: header=None AP-16=13725208 AP-8=13725576
- 0x1821448: header=None AP-16=0 AP-8=13603616
- 0x1822988: header=None AP-16=13730996 AP-8=13717652
- 0x181f788: header=None AP-16=13388502 AP-8=13388540
- 0x1867b28: header=(0, 0) AP-16=0 AP-8=0
- 0x1870480: header=None AP-16=21126192 AP-8=18245362
- 0x187b208: header=None AP-16=12419064 AP-8=22076400
