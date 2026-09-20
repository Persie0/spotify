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

## 0x17d9e02 implementation


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
 17d9e7e:	4d                   	rex.WRB
 17d9e7f:	29                   	.byte 0x29

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

