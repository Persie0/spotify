# Skip Ad native vtable / owner map

Known method relocation slots:
- 0x1842030 -> 0xfd381a
- 0x18420e8 -> 0xfd38d6
- 0x185c048 -> 0x1204218

## Relocations around 0x1841f00..0x1842200
0000000001841f00  0000000000000008 R_X86_64_RELATIVE                         fb0d90
0000000001841f08  0000000000000008 R_X86_64_RELATIVE                         fb1fc0
0000000001841f10  0000000000000008 R_X86_64_RELATIVE                         fb2062
0000000001841f18  0000000000000008 R_X86_64_RELATIVE                         fb2104
0000000001841f20  0000000000000008 R_X86_64_RELATIVE                         fb2584
0000000001841f28  0000000000000008 R_X86_64_RELATIVE                         fb1de8
0000000001841f30  0000000000000008 R_X86_64_RELATIVE                         fb1ece
0000000001841f38  0000000000000008 R_X86_64_RELATIVE                         fb0c4e
0000000001841f40  0000000000000008 R_X86_64_RELATIVE                         fd37ea
0000000001841f48  0000000000000008 R_X86_64_RELATIVE                         fd37f4
0000000001841f50  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001841f58  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001841f60  0000000000000008 R_X86_64_RELATIVE                         fb290e
0000000001841f68  0000000000000008 R_X86_64_RELATIVE                         fb290e
0000000001841f70  0000000000000008 R_X86_64_RELATIVE                         b3d784
0000000001841f78  0000000000000008 R_X86_64_RELATIVE                         fd229e
0000000001841f80  0000000000000008 R_X86_64_RELATIVE                         f24bfe
0000000001841f98  0000000000000008 R_X86_64_RELATIVE                         fd380a
0000000001841fa0  0000000000000008 R_X86_64_RELATIVE                         fd3810
0000000001841fa8  0000000000000008 R_X86_64_RELATIVE                         fd23c2
0000000001841fc0  0000000000000008 R_X86_64_RELATIVE                         faff70
0000000001841fc8  0000000000000008 R_X86_64_RELATIVE                         fb0002
0000000001841fd0  0000000000000008 R_X86_64_RELATIVE                         fb00aa
0000000001841fd8  0000000000000008 R_X86_64_RELATIVE                         fb0152
0000000001841fe0  0000000000000008 R_X86_64_RELATIVE                         fb01ea
0000000001841fe8  0000000000000008 R_X86_64_RELATIVE                         fb0282
0000000001841ff0  0000000000000008 R_X86_64_RELATIVE                         fb0312
0000000001841ff8  0000000000000008 R_X86_64_RELATIVE                         fb03a4
0000000001842000  0000000000000008 R_X86_64_RELATIVE                         fb043c
0000000001842008  0000000000000008 R_X86_64_RELATIVE                         fb04e6
0000000001842010  0000000000000008 R_X86_64_RELATIVE                         fb05dc
0000000001842018  0000000000000008 R_X86_64_RELATIVE                         fb0674
0000000001842020  0000000000000008 R_X86_64_RELATIVE                         fb08b0
0000000001842028  0000000000000008 R_X86_64_RELATIVE                         fb0948
0000000001842030  0000000000000008 R_X86_64_RELATIVE                         fd381a
0000000001842038  0000000000000008 R_X86_64_RELATIVE                         fb0792
0000000001842040  0000000000000008 R_X86_64_RELATIVE                         fb0708
0000000001842048  0000000000000008 R_X86_64_RELATIVE                         fb0826
0000000001842050  0000000000000008 R_X86_64_RELATIVE                         fb0a84
0000000001842058  0000000000000008 R_X86_64_RELATIVE                         fb296a
0000000001842060  0000000000000008 R_X86_64_RELATIVE                         fb0c64
0000000001842068  0000000000000008 R_X86_64_RELATIVE                         fb0da6
0000000001842070  0000000000000008 R_X86_64_RELATIVE                         fb0ece
0000000001842078  0000000000000008 R_X86_64_RELATIVE                         fb0fc6
0000000001842080  0000000000000008 R_X86_64_RELATIVE                         fb10be
0000000001842088  0000000000000008 R_X86_64_RELATIVE                         fb11b6
0000000001842090  0000000000000008 R_X86_64_RELATIVE                         fb2a4c
0000000001842098  0000000000000008 R_X86_64_RELATIVE                         fb2b60
00000000018420a0  0000000000000008 R_X86_64_RELATIVE                         fb2b7a
00000000018420a8  0000000000000008 R_X86_64_RELATIVE                         fb2c84
00000000018420b0  0000000000000008 R_X86_64_RELATIVE                         fb2c9a
00000000018420b8  0000000000000008 R_X86_64_RELATIVE                         fb2dae
00000000018420c0  0000000000000008 R_X86_64_RELATIVE                         fb12ae
00000000018420c8  0000000000000008 R_X86_64_RELATIVE                         fb13c0
00000000018420d0  0000000000000008 R_X86_64_RELATIVE                         fb14a6
00000000018420d8  0000000000000008 R_X86_64_RELATIVE                         fb1598
00000000018420e0  0000000000000008 R_X86_64_RELATIVE                         fb16bc
00000000018420e8  0000000000000008 R_X86_64_RELATIVE                         fd38d6
00000000018420f0  0000000000000008 R_X86_64_RELATIVE                         fb1908
00000000018420f8  0000000000000008 R_X86_64_RELATIVE                         fb1a2c
0000000001842100  0000000000000008 R_X86_64_RELATIVE                         fb1b50
0000000001842108  0000000000000008 R_X86_64_RELATIVE                         fd39bc
0000000001842110  0000000000000008 R_X86_64_RELATIVE                         fb0d90
0000000001842118  0000000000000008 R_X86_64_RELATIVE                         fb1fc0
0000000001842120  0000000000000008 R_X86_64_RELATIVE                         fb2062
0000000001842128  0000000000000008 R_X86_64_RELATIVE                         fb2104
0000000001842130  0000000000000008 R_X86_64_RELATIVE                         fb2584
0000000001842138  0000000000000008 R_X86_64_RELATIVE                         fb1de8
0000000001842140  0000000000000008 R_X86_64_RELATIVE                         fb1ece
0000000001842148  0000000000000008 R_X86_64_RELATIVE                         fb0c4e
0000000001842150  0000000000000008 R_X86_64_RELATIVE                         fd47e6
0000000001842158  0000000000000008 R_X86_64_RELATIVE                         fd4828
0000000001842160  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001842168  0000000000000008 R_X86_64_RELATIVE                         9d7de0
0000000001842170  0000000000000008 R_X86_64_RELATIVE                         fb290e
0000000001842178  0000000000000008 R_X86_64_RELATIVE                         fb290e
0000000001842180  0000000000000008 R_X86_64_RELATIVE                         b3d784
0000000001842188  0000000000000008 R_X86_64_RELATIVE                         fd483a
0000000001842190  0000000000000008 R_X86_64_RELATIVE                         f24bfe
0000000001842198  0000000000000008 R_X86_64_RELATIVE                         fd4a92
00000000018421b0  0000000000000008 R_X86_64_RELATIVE                         fd4bde
00000000018421b8  0000000000000008 R_X86_64_RELATIVE                         fd4be8
00000000018421c0  0000000000000008 R_X86_64_RELATIVE                         fd4bf2
00000000018421d8  0000000000000008 R_X86_64_RELATIVE                         fd4da0
00000000018421e0  0000000000000008 R_X86_64_RELATIVE                         fd4dc2
00000000018421e8  0000000000000008 R_X86_64_RELATIVE                         fd4dd4
0000000001842200  0000000000000008 R_X86_64_RELATIVE                         faff70

## Relocations around 0x185bf00..0x185c180
000000000185bf00  0000000000000008 R_X86_64_RELATIVE                         11fd8d4
000000000185bf08  0000000000000008 R_X86_64_RELATIVE                         eca70c
000000000185bf10  0000000000000008 R_X86_64_RELATIVE                         11fdf84
000000000185bf18  0000000000000008 R_X86_64_RELATIVE                         11fe14c
000000000185bf20  0000000000000008 R_X86_64_RELATIVE                         11fe33c
000000000185bf28  0000000000000008 R_X86_64_RELATIVE                         eca962
000000000185bf30  0000000000000008 R_X86_64_RELATIVE                         eca970
000000000185bf38  0000000000000008 R_X86_64_RELATIVE                         dfc9c2
000000000185bf40  0000000000000008 R_X86_64_RELATIVE                         c578ae
000000000185bf48  0000000000000008 R_X86_64_RELATIVE                         eca97e
000000000185bf50  0000000000000008 R_X86_64_RELATIVE                         eca98e
000000000185bf58  0000000000000008 R_X86_64_RELATIVE                         eca99e
000000000185bf60  0000000000000008 R_X86_64_RELATIVE                         ecb650
000000000185bf68  0000000000000008 R_X86_64_RELATIVE                         11fea46
000000000185bf70  0000000000000008 R_X86_64_RELATIVE                         11fea4e
000000000185bf88  0000000000000008 R_X86_64_RELATIVE                         11f8264
000000000185bf90  0000000000000008 R_X86_64_RELATIVE                         1200966
000000000185bf98  0000000000000008 R_X86_64_RELATIVE                         1200978
000000000185bfa0  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000185bfa8  0000000000000008 R_X86_64_RELATIVE                         c4c5ea
000000000185bfb0  0000000000000008 R_X86_64_RELATIVE                         1200bfc
000000000185bfb8  0000000000000008 R_X86_64_RELATIVE                         11fffea
000000000185bfc0  0000000000000008 R_X86_64_RELATIVE                         1200c8e
000000000185bfc8  0000000000000008 R_X86_64_RELATIVE                         1200d88
000000000185bfd0  0000000000000008 R_X86_64_RELATIVE                         1200f1c
000000000185bfd8  0000000000000008 R_X86_64_RELATIVE                         12012e8
000000000185bfe0  0000000000000008 R_X86_64_RELATIVE                         1201506
000000000185bfe8  0000000000000008 R_X86_64_RELATIVE                         12017a0
000000000185bff0  0000000000000008 R_X86_64_RELATIVE                         12019c6
000000000185bff8  0000000000000008 R_X86_64_RELATIVE                         1201b3e
000000000185c000  0000000000000008 R_X86_64_RELATIVE                         1201c5e
000000000185c008  0000000000000008 R_X86_64_RELATIVE                         1201d66
000000000185c010  0000000000000008 R_X86_64_RELATIVE                         12022d8
000000000185c018  0000000000000008 R_X86_64_RELATIVE                         12026c2
000000000185c020  0000000000000008 R_X86_64_RELATIVE                         1202754
000000000185c028  0000000000000008 R_X86_64_RELATIVE                         12027e6
000000000185c030  0000000000000008 R_X86_64_RELATIVE                         1202878
000000000185c038  0000000000000008 R_X86_64_RELATIVE                         120290a
000000000185c040  0000000000000008 R_X86_64_RELATIVE                         1203fe6
000000000185c048  0000000000000008 R_X86_64_RELATIVE                         1204218
000000000185c050  0000000000000008 R_X86_64_RELATIVE                         1204ede
000000000185c058  0000000000000008 R_X86_64_RELATIVE                         120526a
000000000185c060  0000000000000008 R_X86_64_RELATIVE                         d1b7b0
000000000185c068  0000000000000008 R_X86_64_RELATIVE                         12053f0
000000000185c070  0000000000000008 R_X86_64_RELATIVE                         1205448
000000000185c078  0000000000000008 R_X86_64_RELATIVE                         12054b0
000000000185c080  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000185c088  0000000000000008 R_X86_64_RELATIVE                         9d81d0
000000000185c090  0000000000000008 R_X86_64_RELATIVE                         12054f0
000000000185c098  0000000000000008 R_X86_64_RELATIVE                         120555c
000000000185c0a0  0000000000000008 R_X86_64_RELATIVE                         348328
000000000185c0b0  0000000000000008 R_X86_64_RELATIVE                         3338a5
000000000185c0c0  0000000000000008 R_X86_64_RELATIVE                         38b13a
000000000185c0d0  0000000000000008 R_X86_64_RELATIVE                         3303ca
000000000185c0e0  0000000000000008 R_X86_64_RELATIVE                         36a878
000000000185c0f0  0000000000000008 R_X86_64_RELATIVE                         367de5
000000000185c100  0000000000000008 R_X86_64_RELATIVE                         37a9dd
000000000185c110  0000000000000008 R_X86_64_RELATIVE                         387686
000000000185c120  0000000000000008 R_X86_64_RELATIVE                         37431f
000000000185c130  0000000000000008 R_X86_64_RELATIVE                         371455
000000000185c140  0000000000000008 R_X86_64_RELATIVE                         36382a
000000000185c150  0000000000000008 R_X86_64_RELATIVE                         37e69b
000000000185c160  0000000000000008 R_X86_64_RELATIVE                         11d01be
000000000185c168  0000000000000008 R_X86_64_RELATIVE                         9d7de0
000000000185c178  0000000000000008 R_X86_64_RELATIVE                         3db0f7
000000000185c180  0000059000000001 R_X86_64_64            00000000017f9470 _ZTISt9exception + 0
000000000185c170  000008fa00000001 R_X86_64_64            00000000017fa1a0 _ZTVN10__cxxabiv120__si_class_type_infoE + 10

## Code references into 0x1841f00..0x1842200
  efc645:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
  efc64a:	48 8d 05 6f e1 93 00 	lea    rax,[rip+0x93e16f]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  efc651:	49 89 06             	mov    QWORD PTR [r14],rax
  efc654:	0f 10 83 48 03 00 00 	movups xmm0,XMMWORD PTR [rbx+0x348]
  efc65b:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
  efc662:	00 
  efc663:	48 8b 83 50 03 00 00 	mov    rax,QWORD PTR [rbx+0x350]
  efc66a:	48 85 c0             	test   rax,rax
  efc66d:	74 05                	je     efc674 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a8a>
  efc66f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efc674:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
  efc67a:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
  efc67e:	48 85 c0             	test   rax,rax
  efc681:	74 05                	je     efc688 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a9e>
  efc683:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
  efc688:	49 8d 5e 18          	lea    rbx,[r14+0x18]
  efc68c:	48 8d 05 35 6f 94 00 	lea    rax,[rip+0x946f35]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
  efc693:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efc697:	66 0f ef c9          	pxor   xmm1,xmm1
  efc69b:	f3 41 0f 7f 4e 28    	movdqu XMMWORD PTR [r14+0x28],xmm1
  efc6a1:	48 8d 05 30 5b 94 00 	lea    rax,[rip+0x945b30]        # 18421d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14170>
  efc6a8:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efc6ac:	f3 41 0f 7f 46 38    	movdqu XMMWORD PTR [r14+0x38],xmm0
  efc6b2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  efc6b9:	48 85 ff             	test   rdi,rdi
  efc6bc:	74 05                	je     efc6c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3ad9>
  efc6be:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
  efc6c3:	48 8d 05 36 5b 94 00 	lea    rax,[rip+0x945b36]        # 1842200 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14198>
  efc6ca:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efc6ce:	48 8d 05 13 5d 94 00 	lea    rax,[rip+0x945d13]        # 18423e8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14380>
  efc6d5:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efc6d9:	e8 a8 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc6de:	48 8d 05 db 58 94 00 	lea    rax,[rip+0x9458db]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
  efc6e5:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  efc6e9:	48 8d 05 c0 5a 94 00 	lea    rax,[rip+0x945ac0]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
  efc6f0:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
  efc6f4:	0f 28 84 24 90 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x90]
  efc6fb:	00 
  efc6fc:	41 0f 11 46 48       	movups XMMWORD PTR [r14+0x48],xmm0
  efc701:	4d 89 7e 58          	mov    QWORD PTR [r14+0x58],r15
  efc705:	4c 89 f7             	mov    rdi,r14
  efc708:	48 83 c7 60          	add    rdi,0x60
  efc70c:	e8 e5 d2 8d 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  efc711:	31 c0                	xor    eax,eax
  efc713:	41 88 46 70          	mov    BYTE PTR [r14+0x70],al
  efc717:	41 88 86 80 00 00 00 	mov    BYTE PTR [r14+0x80],al
  efc71e:	31 ff                	xor    edi,edi
  efc720:	e8 61 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc725:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]
  efc72c:	00 
  efc72d:	4c 89 ff             	mov    rdi,r15
  efc730:	48 89 de             	mov    rsi,rbx
  efc733:	4c 89 f2             	mov    rdx,r14
  efc736:	e8 c9 20 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  efc73b:	31 ff                	xor    edi,edi
  efc73d:	e8 da 1c ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  efc742:	66 41 0f 6f 07       	movdqa xmm0,XMMWORD PTR [r15]
  efc747:	66 0f ef c9          	pxor   xmm1,xmm1
  efc74b:	66 41 0f 7f 0f       	movdqa XMMWORD PTR [r15],xmm1
  efc750:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  efc754:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
  efc75a:	e8 27 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc75f:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  efc763:	e8 1e 1d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  efc768:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
  efc76d:	80 bb b2 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b2],0x0
  efc774:	0f 84 56 01 00 00    	je     efc8d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3ce6>
  efc77a:	bf 68 01 00 00       	mov    edi,0x168
  efc77f:	e8 7c 17 8f 00       	call   17edf00 <_Znwm@plt>
  efc784:	49 89 c6             	mov    r14,rax
  efc787:	49 89 c7             	mov    r15,rax
  efc78a:	66 0f ef c0          	pxor   xmm0,xmm0
  efc78e:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
  efc794:	48 8d 05 25 e0 93 00 	lea    rax,[rip+0x93e025]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  efc79b:	49 89 06             	mov    QWORD PTR [r14],rax
  efc79e:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
  efc7a3:	0f 28 80 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rax+0x2f0]
  efc7aa:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
  efc7b1:	00 
  efc7b2:	48 8b 80 f8 02 00 00 	mov    rax,QWORD PTR [rax+0x2f8]
--
  fd47a7:	48 89 c3             	mov    rbx,rax
  fd47aa:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
  fd47b1:	00 
  fd47b2:	e8 cf 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd47b7:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  fd47be:	00 
  fd47bf:	e8 24 60 80 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
  fd47c4:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
  fd47cb:	00 
  fd47cc:	e8 e1 9c ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd47d1:	eb 03                	jmp    fd47d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbec>
  fd47d3:	48 89 c3             	mov    rbx,rax
  fd47d6:	48 89 df             	mov    rdi,rbx
  fd47d9:	e8 c7 52 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd47de:	48 89 c7             	mov    rdi,rax
  fd47e1:	e8 bf 52 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd47e6:	41 56                	push   r14
  fd47e8:	53                   	push   rbx
  fd47e9:	50                   	push   rax
  fd47ea:	48 89 fb             	mov    rbx,rdi
  fd47ed:	48 8d 05 cc d7 86 00 	lea    rax,[rip+0x86d7cc]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
  fd47f4:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd47f7:	4c 8d 77 08          	lea    r14,[rdi+0x8]
  fd47fb:	48 8d 05 ae d9 86 00 	lea    rax,[rip+0x86d9ae]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
  fd4802:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  fd4806:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
  fd480a:	e8 77 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd480f:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
  fd4813:	e8 6e 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4818:	4c 89 f7             	mov    rdi,r14
  fd481b:	48 83 c4 08          	add    rsp,0x8
  fd481f:	5b                   	pop    rbx
  fd4820:	41 5e                	pop    r14
  fd4822:	e9 79 05 00 00       	jmp    fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
  fd4827:	cc                   	int3
  fd4828:	53                   	push   rbx
  fd4829:	48 89 fb             	mov    rbx,rdi
  fd482c:	e8 b5 ff ff ff       	call   fd47e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbfc>
  fd4831:	48 89 df             	mov    rdi,rbx
  fd4834:	5b                   	pop    rbx
  fd4835:	e9 e6 96 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd483a:	55                   	push   rbp
  fd483b:	41 57                	push   r15
  fd483d:	41 56                	push   r14
  fd483f:	41 55                	push   r13
  fd4841:	41 54                	push   r12
  fd4843:	53                   	push   rbx
  fd4844:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
  fd484b:	49 89 cd             	mov    r13,rcx
  fd484e:	89 d5                	mov    ebp,edx
  fd4850:	48 89 fb             	mov    rbx,rdi
  fd4853:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd485a:	00 00 
  fd485c:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
  fd4863:	00 
  fd4864:	48 83 c6 10          	add    rsi,0x10
  fd4868:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  fd486d:	e8 e8 75 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd4872:	66 0f ef c0          	pxor   xmm0,xmm0
  fd4876:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  fd487b:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
  fd4880:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
  fd4885:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
  fd488a:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
  fd488f:	4c 89 e7             	mov    rdi,r12
  fd4892:	4c 89 fe             	mov    rsi,r15
  fd4895:	4c 89 f2             	mov    rdx,r14
  fd4898:	e8 bd 07 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd489d:	40 0f b6 d5          	movzx  edx,bpl
--
  fd4c2c:	48 83 c4 08          	add    rsp,0x8
  fd4c30:	5b                   	pop    rbx
  fd4c31:	41 5e                	pop    r14
  fd4c33:	c3                   	ret
  fd4c34:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
  fd4c38:	bf 88 00 00 00       	mov    edi,0x88
  fd4c3d:	e8 be 92 81 00       	call   17edf00 <_Znwm@plt>
  fd4c42:	48 89 c2             	mov    rdx,rax
  fd4c45:	0f 57 c0             	xorps  xmm0,xmm0
  fd4c48:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4c4c:	48 8d 0d 6d 5b 86 00 	lea    rcx,[rip+0x865b6d]        # 183a7c0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc758>
  fd4c53:	48 89 08             	mov    QWORD PTR [rax],rcx
  fd4c56:	0f 11 40 28          	movups XMMWORD PTR [rax+0x28],xmm0
  fd4c5a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
  fd4c5e:	48 89 48 38          	mov    QWORD PTR [rax+0x38],rcx
  fd4c62:	49 8b 4e 28          	mov    rcx,QWORD PTR [r14+0x28]
  fd4c66:	48 89 48 40          	mov    QWORD PTR [rax+0x40],rcx
  fd4c6a:	48 85 c9             	test   rcx,rcx
  fd4c6d:	74 05                	je     fd4c74 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c08a>
  fd4c6f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4c74:	48 8d 0d 45 d3 86 00 	lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
  fd4c7b:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
  fd4c7f:	48 8d 0d 2a d5 86 00 	lea    rcx,[rip+0x86d52a]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
  fd4c86:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
  fd4c8a:	49 8b 4e 30          	mov    rcx,QWORD PTR [r14+0x30]
  fd4c8e:	48 89 4a 48          	mov    QWORD PTR [rdx+0x48],rcx
  fd4c92:	49 8b 4e 38          	mov    rcx,QWORD PTR [r14+0x38]
  fd4c96:	48 89 4a 50          	mov    QWORD PTR [rdx+0x50],rcx
  fd4c9a:	48 85 c9             	test   rcx,rcx
  fd4c9d:	74 05                	je     fd4ca4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0ba>
  fd4c9f:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4ca4:	48 83 c0 18          	add    rax,0x18
  fd4ca8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  fd4cac:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
  fd4cb0:	49 8b 4e 48          	mov    rcx,QWORD PTR [r14+0x48]
  fd4cb4:	48 89 4a 60          	mov    QWORD PTR [rdx+0x60],rcx
  fd4cb8:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
  fd4cbc:	48 89 4a 68          	mov    QWORD PTR [rdx+0x68],rcx
  fd4cc0:	48 85 c9             	test   rcx,rcx
  fd4cc3:	74 05                	je     fd4cca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c0e0>
  fd4cc5:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd4cca:	49 8b 4e 68          	mov    rcx,QWORD PTR [r14+0x68]
  fd4cce:	48 89 8a 80 00 00 00 	mov    QWORD PTR [rdx+0x80],rcx
  fd4cd5:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]
  fd4cda:	0f 11 42 70          	movups XMMWORD PTR [rdx+0x70],xmm0
  fd4cde:	48 89 df             	mov    rdi,rbx
  fd4ce1:	48 89 c6             	mov    rsi,rax
  fd4ce4:	e8 1b 9b f2 ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
  fd4ce9:	31 ff                	xor    edi,edi
  fd4ceb:	48 83 c4 08          	add    rsp,0x8
  fd4cef:	5b                   	pop    rbx
  fd4cf0:	41 5e                	pop    r14
  fd4cf2:	e9 25 97 ac ff       	jmp    a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4cf7:	48 89 c7             	mov    rdi,rax
  fd4cfa:	e8 a6 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4cff:	cc                   	int3
  fd4d00:	41 57                	push   r15
  fd4d02:	41 56                	push   r14
  fd4d04:	41 55                	push   r13
  fd4d06:	41 54                	push   r12
  fd4d08:	53                   	push   rbx
  fd4d09:	48 83 ec 40          	sub    rsp,0x40
  fd4d0d:	49 89 f7             	mov    r15,rsi
  fd4d10:	48 89 fb             	mov    rbx,rdi
  fd4d13:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4d1a:	00 00 
  fd4d1c:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  fd4d21:	bf 80 00 00 00       	mov    edi,0x80
--
  fd4d67:	4c 89 23             	mov    QWORD PTR [rbx],r12
  fd4d6a:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  fd4d6e:	31 ff                	xor    edi,edi
  fd4d70:	e8 a7 96 ac ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
  fd4d75:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4d7c:	00 00 
  fd4d7e:	48 3b 44 24 38       	cmp    rax,QWORD PTR [rsp+0x38]
  fd4d83:	75 0e                	jne    fd4d93 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1a9>
  fd4d85:	48 83 c4 40          	add    rsp,0x40
  fd4d89:	5b                   	pop    rbx
  fd4d8a:	41 5c                	pop    r12
  fd4d8c:	41 5d                	pop    r13
  fd4d8e:	41 5e                	pop    r14
  fd4d90:	41 5f                	pop    r15
  fd4d92:	c3                   	ret
  fd4d93:	e8 18 ad 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd4d98:	48 89 c7             	mov    rdi,rax
  fd4d9b:	e8 05 4d aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd4da0:	53                   	push   rbx
  fd4da1:	48 89 fb             	mov    rbx,rdi
  fd4da4:	48 8d 05 2d d4 86 00 	lea    rax,[rip+0x86d42d]        # 18421d8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14170>
  fd4dab:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd4dae:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
  fd4db2:	e8 cf 96 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd4db7:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  fd4dbb:	5b                   	pop    rbx
  fd4dbc:	e9 f1 96 ac ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd4dc1:	cc                   	int3
  fd4dc2:	53                   	push   rbx
  fd4dc3:	48 89 fb             	mov    rbx,rdi
  fd4dc6:	e8 d5 ff ff ff       	call   fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
  fd4dcb:	48 89 df             	mov    rdi,rbx
  fd4dce:	5b                   	pop    rbx
  fd4dcf:	e9 4c 91 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd4dd4:	53                   	push   rbx
  fd4dd5:	48 89 fb             	mov    rbx,rdi
  fd4dd8:	e8 05 00 00 00       	call   fd4de2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1f8>
  fd4ddd:	48 89 d8             	mov    rax,rbx
  fd4de0:	5b                   	pop    rbx
  fd4de1:	c3                   	ret
  fd4de2:	55                   	push   rbp
  fd4de3:	41 57                	push   r15
  fd4de5:	41 56                	push   r14
  fd4de7:	41 55                	push   r13
  fd4de9:	41 54                	push   r12
  fd4deb:	53                   	push   rbx
  fd4dec:	48 83 ec 68          	sub    rsp,0x68
  fd4df0:	48 89 fb             	mov    rbx,rdi
  fd4df3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd4dfa:	00 00 
  fd4dfc:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
  fd4e01:	48 83 c6 08          	add    rsi,0x8
  fd4e05:	48 89 e7             	mov    rdi,rsp
  fd4e08:	e8 4d 70 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd4e0d:	bf 80 00 00 00       	mov    edi,0x80
  fd4e12:	e8 e9 90 81 00       	call   17edf00 <_Znwm@plt>
  fd4e17:	49 89 c6             	mov    r14,rax
  fd4e1a:	0f 57 c0             	xorps  xmm0,xmm0
  fd4e1d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
  fd4e21:	48 8d 05 80 56 86 00 	lea    rax,[rip+0x865680]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
  fd4e28:	49 89 06             	mov    QWORD PTR [r14],rax
  fd4e2b:	4d 89 f7             	mov    r15,r14
  fd4e2e:	49 83 c7 18          	add    r15,0x18
  fd4e32:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
  fd4e37:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  fd4e3c:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0

## Code references into 0x185bf00..0x185c180
 11f40e8:	48 8d ab b8 4a 00 00 	lea    rbp,[rbx+0x4ab8]
 11f40ef:	66 0f ef c0          	pxor   xmm0,xmm0
 11f40f3:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
 11f40f8:	48 8d 05 81 79 66 00 	lea    rax,[rip+0x667981]        # 185ba80 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18168>
 11f40ff:	49 89 07             	mov    QWORD PTR [r15],rax
 11f4102:	41 8a 84 24 88 00 00 	mov    al,BYTE PTR [r12+0x88]
 11f4109:	00 
 11f410a:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
 11f410e:	41 8a 84 24 89 00 00 	mov    al,BYTE PTR [r12+0x89]
 11f4115:	00 
 11f4116:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
 11f411d:	48 8d bc 24 50 05 00 	lea    rdi,[rsp+0x550]
 11f4124:	00 
 11f4125:	48 8d b4 24 20 05 00 	lea    rsi,[rsp+0x520]
 11f412c:	00 
 11f412d:	e8 34 1a 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f4132:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
 11f4139:	00 
 11f413a:	48 89 ee             	mov    rsi,rbp
 11f413d:	e8 fe 9d 5f 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 11f4142:	48 8d 05 3f 7e 66 00 	lea    rax,[rip+0x667e3f]        # 185bf88 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18670>
 11f4149:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
 11f414d:	48 8b 84 24 50 06 00 	mov    rax,QWORD PTR [rsp+0x650]
 11f4154:	00 
 11f4155:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
 11f4159:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
 11f415e:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
 11f4162:	48 8d 83 88 5d 00 00 	lea    rax,[rbx+0x5d88]
 11f4169:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 11f416d:	48 8b 44 24 48       	mov    rax,QWORD PTR [rsp+0x48]
 11f4172:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
 11f4176:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
 11f417d:	00 
 11f417e:	49 89 47 40          	mov    QWORD PTR [r15+0x40],rax
 11f4182:	4d 89 77 48          	mov    QWORD PTR [r15+0x48],r14
 11f4186:	48 8d 83 f0 19 00 00 	lea    rax,[rbx+0x19f0]
 11f418d:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
 11f4191:	48 8b 84 24 18 01 00 	mov    rax,QWORD PTR [rsp+0x118]
 11f4198:	00 
 11f4199:	49 89 47 58          	mov    QWORD PTR [r15+0x58],rax
 11f419d:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
 11f41a1:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
 11f41a6:	49 89 47 68          	mov    QWORD PTR [r15+0x68],rax
 11f41aa:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
 11f41af:	49 89 47 70          	mov    QWORD PTR [r15+0x70],rax
 11f41b3:	48 8b 84 24 40 06 00 	mov    rax,QWORD PTR [rsp+0x640]
 11f41ba:	00 
 11f41bb:	49 89 47 78          	mov    QWORD PTR [r15+0x78],rax
 11f41bf:	49 8d 6f 18          	lea    rbp,[r15+0x18]
 11f41c3:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
 11f41c8:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
 11f41cf:	48 8b 84 24 60 06 00 	mov    rax,QWORD PTR [rsp+0x660]
 11f41d6:	00 
 11f41d7:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
 11f41de:	4d 8d a7 90 00 00 00 	lea    r12,[r15+0x90]
 11f41e5:	48 8d b4 24 50 05 00 	lea    rsi,[rsp+0x550]
 11f41ec:	00 
 11f41ed:	4c 89 e7             	mov    rdi,r12
 11f41f0:	e8 71 19 00 00       	call   11f5b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3b0ea>
 11f41f5:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
 11f41fa:	49 89 87 b0 00 00 00 	mov    QWORD PTR [r15+0xb0],rax
 11f4201:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
 11f4206:	49 89 87 b8 00 00 00 	mov    QWORD PTR [r15+0xb8],rax
 11f420d:	48 8b 84 24 c0 01 00 	mov    rax,QWORD PTR [rsp+0x1c0]
 11f4214:	00 
 11f4215:	49 89 87 d0 00 00 00 	mov    QWORD PTR [r15+0xd0],rax
--
 11f7f98:	41 54                	push   r12
 11f7f9a:	53                   	push   rbx
 11f7f9b:	48 83 ec 60          	sub    rsp,0x60
 11f7f9f:	49 89 ff             	mov    r15,rdi
 11f7fa2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11f7fa9:	00 00 
 11f7fab:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 11f7fb0:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 11f7fb4:	4c 8b a0 00 4b 00 00 	mov    r12,QWORD PTR [rax+0x4b00]
 11f7fbb:	4c 8b a8 d0 0e 00 00 	mov    r13,QWORD PTR [rax+0xed0]
 11f7fc2:	bf 40 02 00 00       	mov    edi,0x240
 11f7fc7:	e8 34 5f 5f 00       	call   17edf00 <_Znwm@plt>
 11f7fcc:	48 89 c3             	mov    rbx,rax
 11f7fcf:	0f 57 c0             	xorps  xmm0,xmm0
 11f7fd2:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 11f7fd6:	48 8d 05 2b 3c 66 00 	lea    rax,[rip+0x663c2b]        # 185bc08 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x182f0>
 11f7fdd:	48 89 03             	mov    QWORD PTR [rbx],rax
 11f7fe0:	4c 8d 73 18          	lea    r14,[rbx+0x18]
 11f7fe4:	4c 89 f7             	mov    rdi,r14
 11f7fe7:	e8 5e 32 08 00       	call   127b24a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc07ce>
 11f7fec:	48 8d 05 cd 41 66 00 	lea    rax,[rip+0x6641cd]        # 185c1c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x188a8>
 11f7ff3:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 11f7ff7:	4c 89 63 38          	mov    QWORD PTR [rbx+0x38],r12
 11f7ffb:	4c 89 6b 40          	mov    QWORD PTR [rbx+0x40],r13
 11f7fff:	6a 48                	push   0x48
 11f8001:	5f                   	pop    rdi
 11f8002:	e8 f9 5e 5f 00       	call   17edf00 <_Znwm@plt>
 11f8007:	0f 57 c0             	xorps  xmm0,xmm0
 11f800a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
 11f800e:	48 8d 0d c3 42 66 00 	lea    rcx,[rip+0x6642c3]        # 185c2d8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x189c0>
 11f8015:	48 89 08             	mov    QWORD PTR [rax],rcx
 11f8018:	48 8d 48 18          	lea    rcx,[rax+0x18]
 11f801c:	48 8d 50 20          	lea    rdx,[rax+0x20]
 11f8020:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
 11f8024:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
 11f8028:	48 89 c2             	mov    rdx,rax
 11f802b:	48 83 c2 38          	add    rdx,0x38
 11f802f:	0f 11 40 38          	movups XMMWORD PTR [rax+0x38],xmm0
 11f8033:	48 89 50 30          	mov    QWORD PTR [rax+0x30],rdx
 11f8037:	48 89 4b 48          	mov    QWORD PTR [rbx+0x48],rcx
 11f803b:	48 89 43 50          	mov    QWORD PTR [rbx+0x50],rax
 11f803f:	49 89 e0             	mov    r8,rsp
 11f8042:	4d 89 30             	mov    QWORD PTR [r8],r14
 11f8045:	48 8d 35 45 50 8a ff 	lea    rsi,[rip+0xffffffffff8a5045]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
 11f804c:	48 8d 0d 25 fc 00 00 	lea    rcx,[rip+0xfc25]        # 1207c78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4d1fc>
 11f8053:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
 11f8058:	6a 08                	push   0x8
 11f805a:	41 59                	pop    r9
 11f805c:	4c 89 ef             	mov    rdi,r13
 11f805f:	31 d2                	xor    edx,edx
 11f8061:	e8 2e 27 5e 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
 11f8066:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
 11f806a:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 11f806f:	4c 89 e6             	mov    rsi,r12
 11f8072:	4c 89 ea             	mov    rdx,r13
 11f8075:	ff 90 08 01 00 00    	call   QWORD PTR [rax+0x108]
 11f807b:	48 8d 7b 58          	lea    rdi,[rbx+0x58]
 11f807f:	4c 8d 64 24 48       	lea    r12,[rsp+0x48]
 11f8084:	4c 89 e6             	mov    rsi,r12
 11f8087:	e8 b2 19 5e 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
 11f808c:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
 11f8091:	e8 f0 63 8a ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 11f8096:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 11f809b:	e8 48 27 5e 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
 11f80a0:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
 11f80a4:	e8 27 d2 c8 ff       	call   e852d0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c6e6>
--
 11fdd08:	41 89 84 24 80 00 00 	mov    DWORD PTR [r12+0x80],eax
 11fdd0f:	00 
 11fdd10:	81 c9 00 00 02 00    	or     ecx,0x20000
 11fdd16:	41 89 4c 24 10       	mov    DWORD PTR [r12+0x10],ecx
 11fdd1b:	80 bc 24 b0 02 00 00 	cmp    BYTE PTR [rsp+0x2b0],0x0
 11fdd22:	00 
 11fdd23:	74 60                	je     11fdd85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43309>
 11fdd25:	8b bc 24 a8 02 00 00 	mov    edi,DWORD PTR [rsp+0x2a8]
 11fdd2c:	e8 17 0d 8b ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
 11fdd31:	48 8d b4 24 a0 02 00 	lea    rsi,[rsp+0x2a0]
 11fdd38:	00 
 11fdd39:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
 11fdd3e:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 11fdd43:	48 89 07             	mov    QWORD PTR [rdi],rax
 11fdd46:	8b 46 08             	mov    eax,DWORD PTR [rsi+0x8]
 11fdd49:	b9 ff ff ff ff       	mov    ecx,0xffffffff
 11fdd4e:	48 39 c8             	cmp    rax,rcx
 11fdd51:	6a ff                	push   0xffffffffffffffff
 11fdd53:	59                   	pop    rcx
 11fdd54:	48 0f 45 c8          	cmovne rcx,rax
 11fdd58:	48 8d 05 09 e2 65 00 	lea    rax,[rip+0x65e209]        # 185bf68 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18650>
 11fdd5f:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
 11fdd62:	41 80 4c 24 10 20    	or     BYTE PTR [r12+0x10],0x20
 11fdd68:	4c 89 e7             	mov    rdi,r12
 11fdd6b:	48 83 c7 40          	add    rdi,0x40
 11fdd6f:	49 8b 54 24 08       	mov    rdx,QWORD PTR [r12+0x8]
 11fdd74:	f6 c2 01             	test   dl,0x1
 11fdd77:	0f 85 2c 01 00 00    	jne    11fdea9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4342d>
 11fdd7d:	48 89 c6             	mov    rsi,rax
 11fdd80:	e8 cd 7f 90 ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
 11fdd85:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
 11fdd8c:	00 
 11fdd8d:	e8 82 0c 00 00       	call   11fea14 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43f98>
 11fdd92:	4c 8d a4 24 a8 01 00 	lea    r12,[rsp+0x1a8]
 11fdd99:	00 
 11fdd9a:	4c 89 e7             	mov    rdi,r12
 11fdd9d:	e8 1c 4d 4b 00       	call   16b2abe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66c2a>
 11fdda2:	49 8b 7f 18          	mov    rdi,QWORD PTR [r15+0x18]
 11fdda6:	31 c0                	xor    eax,eax
 11fdda8:	41 88 04 24          	mov    BYTE PTR [r12],al
 11fddac:	41 88 44 24 18       	mov    BYTE PTR [r12+0x18],al
 11fddb1:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
 11fddb8:	00 
 11fddb9:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
 11fddbe:	48 8d b4 24 38 01 00 	lea    rsi,[rsp+0x138]
 11fddc5:	00 
 11fddc6:	48 8d 94 24 a8 01 00 	lea    rdx,[rsp+0x1a8]
 11fddcd:	00 
 11fddce:	e8 4f 70 42 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
 11fddd3:	48 8d bc 24 00 02 00 	lea    rdi,[rsp+0x200]
 11fddda:	00 
 11fdddb:	e8 8a c1 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
 11fdde0:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
 11fdde7:	00 
 11fdde8:	e8 43 8f 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
 11fdded:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
 11fddf1:	4c 8d 64 24 28       	lea    r12,[rsp+0x28]
 11fddf6:	4c 89 e7             	mov    rdi,r12
 11fddf9:	4c 89 f6             	mov    rsi,r14
 11fddfc:	e8 55 a0 46 00       	call   1667e56 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bfc2>
 11fde01:	49 8b 07             	mov    rax,QWORD PTR [r15]
 11fde04:	4c 89 ff             	mov    rdi,r15
 11fde07:	4c 89 e6             	mov    rsi,r12
 11fde0a:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
 11fde0f:	ff 90 b0 00 00 00    	call   QWORD PTR [rax+0xb0]
 11fde15:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
--
 11ff60d:	41 bd aa 00 00 00    	mov    r13d,0xaa
 11ff613:	4c 8d 64 24 08       	lea    r12,[rsp+0x8]
 11ff618:	49 8b 8e e8 1f 00 00 	mov    rcx,QWORD PTR [r14+0x1fe8]
 11ff61f:	49 8b 86 00 20 00 00 	mov    rax,QWORD PTR [r14+0x2000]
 11ff626:	31 d2                	xor    edx,edx
 11ff628:	49 f7 f5             	div    r13
 11ff62b:	4c 8b 2c c1          	mov    r13,QWORD PTR [rcx+rax*8]
 11ff62f:	48 6b ea 18          	imul   rbp,rdx,0x18
 11ff633:	c6 44 24 08 00       	mov    BYTE PTR [rsp+0x8],0x0
 11ff638:	83 4c 24 18 ff       	or     DWORD PTR [rsp+0x18],0xffffffff
 11ff63d:	4c 89 e7             	mov    rdi,r12
 11ff640:	e8 47 8f ff ff       	call   11f858c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3db10>
 11ff645:	41 8b 44 2d 10       	mov    eax,DWORD PTR [r13+rbp*1+0x10]
 11ff64a:	b9 ff ff ff ff       	mov    ecx,0xffffffff
 11ff64f:	48 39 c8             	cmp    rax,rcx
 11ff652:	74 22                	je     11ff676 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44bfa>
 11ff654:	49 01 ed             	add    r13,rbp
 11ff657:	48 8d 7c 24 07       	lea    rdi,[rsp+0x7]
 11ff65c:	4c 89 e6             	mov    rsi,r12
 11ff65f:	4c 89 ea             	mov    rdx,r13
 11ff662:	48 8d 0d f7 ca 65 00 	lea    rcx,[rip+0x65caf7]        # 185c160 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18848>
 11ff669:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
 11ff66c:	41 8b 45 10          	mov    eax,DWORD PTR [r13+0x10]
 11ff670:	89 44 24 18          	mov    DWORD PTR [rsp+0x18],eax
 11ff674:	eb 04                	jmp    11ff67a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44bfe>
 11ff676:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
 11ff67a:	85 c0                	test   eax,eax
 11ff67c:	41 bd aa 00 00 00    	mov    r13d,0xaa
 11ff682:	74 0a                	je     11ff68e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44c12>
 11ff684:	4c 89 f7             	mov    rdi,r14
 11ff687:	e8 fa fe ff ff       	call   11ff586 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44b0a>
 11ff68c:	eb 0d                	jmp    11ff69b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44c1f>
 11ff68e:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
 11ff693:	4c 89 f7             	mov    rdi,r14
 11ff696:	e8 bb 00 00 00       	call   11ff756 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44cda>
 11ff69b:	48 89 df             	mov    rdi,rbx
 11ff69e:	e8 9b 8c 96 ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
 11ff6a3:	84 c0                	test   al,al
 11ff6a5:	75 5d                	jne    11ff704 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44c88>
 11ff6a7:	49 8b 8e e8 1f 00 00 	mov    rcx,QWORD PTR [r14+0x1fe8]
 11ff6ae:	49 8b 86 00 20 00 00 	mov    rax,QWORD PTR [r14+0x2000]
 11ff6b5:	31 d2                	xor    edx,edx
 11ff6b7:	49 f7 f5             	div    r13
 11ff6ba:	48 6b fa 18          	imul   rdi,rdx,0x18
 11ff6be:	48 03 3c c1          	add    rdi,QWORD PTR [rcx+rax*8]
 11ff6c2:	e8 c5 8e ff ff       	call   11f858c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3db10>
 11ff6c7:	f3 41 0f 6f 86 00 20 	movdqu xmm0,XMMWORD PTR [r14+0x2000]
 11ff6ce:	00 00 
 11ff6d0:	66 0f d4 05 78 e7 18 	paddq  xmm0,XMMWORD PTR [rip+0xffffffffff18e778]        # 38de50 <_ZTSSt12bad_any_cast@@Base-0x2378>
 11ff6d7:	ff 
 11ff6d8:	f3 41 0f 7f 86 00 20 	movdqu XMMWORD PTR [r14+0x2000],xmm0
 11ff6df:	00 00 
 11ff6e1:	4c 89 ff             	mov    rdi,r15
 11ff6e4:	6a 01                	push   0x1
 11ff6e6:	5e                   	pop    rsi
 11ff6e7:	e8 0a 05 00 00       	call   11ffbf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4517a>
 11ff6ec:	4c 89 e7             	mov    rdi,r12
 11ff6ef:	e8 98 8e ff ff       	call   11f858c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3db10>
 11ff6f4:	49 83 be 08 20 00 00 	cmp    QWORD PTR [r14+0x2008],0x0
 11ff6fb:	00 
 11ff6fc:	0f 85 16 ff ff ff    	jne    11ff618 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44b9c>
 11ff702:	eb 0a                	jmp    11ff70e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x44c92>
 11ff704:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
 11ff709:	e8 7e 8e ff ff       	call   11f858c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3db10>
 11ff70e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 11ff715:	00 00 
--
 120058a:	48 8d bc 24 78 01 00 	lea    rdi,[rsp+0x178]
 1200591:	00 
 1200592:	e8 8d 03 00 00       	call   1200924 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45ea8>
 1200597:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 120059e:	00 00 
 12005a0:	48 3b 84 24 e0 0e 00 	cmp    rax,QWORD PTR [rsp+0xee0]
 12005a7:	00 
 12005a8:	0f 85 61 01 00 00    	jne    120070f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c93>
 12005ae:	48 81 c4 e8 0e 00 00 	add    rsp,0xee8
 12005b5:	5b                   	pop    rbx
 12005b6:	41 5c                	pop    r12
 12005b8:	41 5d                	pop    r13
 12005ba:	41 5e                	pop    r14
 12005bc:	41 5f                	pop    r15
 12005be:	5d                   	pop    rbp
 12005bf:	c3                   	ret
 12005c0:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
 12005c5:	48 8d b4 24 78 01 00 	lea    rsi,[rsp+0x178]
 12005cc:	00 
 12005cd:	e8 2e a2 46 00       	call   166a800 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e96c>
 12005d2:	48 8d 05 bf bb 65 00 	lea    rax,[rip+0x65bbbf]        # 185c198 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18880>
 12005d9:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]
 12005e0:	00 
 12005e1:	48 89 47 f8          	mov    QWORD PTR [rdi-0x8],rax
 12005e5:	48 8d 74 24 58       	lea    rsi,[rsp+0x58]
 12005ea:	e8 0f 96 e4 ff       	call   1049bfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211014>
 12005ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 12005f6:	00 00 
 12005f8:	48 3b 84 24 e0 0e 00 	cmp    rax,QWORD PTR [rsp+0xee0]
 12005ff:	00 
 1200600:	0f 85 09 01 00 00    	jne    120070f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c93>
 1200606:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 120060d:	00 
 120060e:	e8 2f 01 00 00       	call   1200742 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45cc6>
 1200613:	48 89 c3             	mov    rbx,rax
 1200616:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
 120061d:	00 
 120061e:	e8 53 01 00 00       	call   1200776 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45cfa>
 1200623:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
 1200628:	eb 24                	jmp    120064e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45bd2>
 120062a:	eb 17                	jmp    1200643 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45bc7>
 120062c:	eb 6a                	jmp    1200698 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c1c>
 120062e:	48 89 c3             	mov    rbx,rax
 1200631:	48 8b bc 24 90 01 00 	mov    rdi,QWORD PTR [rsp+0x190]
 1200638:	00 
 1200639:	e8 60 e1 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 120063e:	e9 b1 00 00 00       	jmp    12006f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c78>
 1200643:	48 89 c3             	mov    rbx,rax
 1200646:	48 8b bc 24 38 01 00 	mov    rdi,QWORD PTR [rsp+0x138]
 120064d:	00 
 120064e:	e8 4b e1 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1200653:	eb 46                	jmp    120069b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c1f>
 1200655:	48 89 c3             	mov    rbx,rax
 1200658:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
 120065f:	00 
 1200660:	e8 99 02 00 00       	call   12008fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45e82>
 1200665:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
 120066c:	00 
 120066d:	e8 c4 29 4b 00       	call   16b3036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a2>
 1200672:	eb 27                	jmp    120069b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c1f>
 1200674:	48 89 c3             	mov    rbx,rax
 1200677:	48 8b bc 24 90 01 00 	mov    rdi,QWORD PTR [rsp+0x190]
 120067e:	00 
 120067f:	e8 1a e1 89 ff       	call   a9e79e <JNI_OnUnload@@Base+0x2606b>
 1200684:	eb 03                	jmp    1200689 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c0d>
 1200686:	48 89 c3             	mov    rbx,rax
--
 1200718:	48 8b bf 70 20 00 00 	mov    rdi,QWORD PTR [rdi+0x2070]
 120071f:	e8 14 74 2c 00       	call   14c7b38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d0bc>
 1200724:	48 8d bb a0 11 00 00 	lea    rdi,[rbx+0x11a0]
 120072b:	e8 b2 7c ff ff       	call   11f83e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d966>
 1200730:	80 bb c0 11 00 00 00 	cmp    BYTE PTR [rbx+0x11c0],0x0
 1200737:	74 07                	je     1200740 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45cc4>
 1200739:	c6 83 c0 11 00 00 00 	mov    BYTE PTR [rbx+0x11c0],0x0
 1200740:	5b                   	pop    rbx
 1200741:	c3                   	ret
 1200742:	41 56                	push   r14
 1200744:	53                   	push   rbx
 1200745:	50                   	push   rax
 1200746:	48 89 fb             	mov    rbx,rdi
 1200749:	6a 30                	push   0x30
 120074b:	5f                   	pop    rdi
 120074c:	e8 5f d7 5e 00       	call   17edeb0 <__cxa_allocate_exception@plt>
 1200751:	49 89 c6             	mov    r14,rax
 1200754:	48 89 c7             	mov    rdi,rax
 1200757:	48 89 de             	mov    rsi,rbx
 120075a:	e8 ef 01 00 00       	call   120094e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45ed2>
 120075f:	48 8d 35 0a ba 65 00 	lea    rsi,[rip+0x65ba0a]        # 185c170 <_ZTVN10__cxxabiv120__si_class_type_infoE@@Base+0x61fd0>
 1200766:	48 8d 15 09 00 00 00 	lea    rdx,[rip+0x9]        # 1200776 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45cfa>
 120076d:	4c 89 f7             	mov    rdi,r14
 1200770:	e8 6b d7 5e 00       	call   17edee0 <__cxa_throw@plt>
 1200775:	cc                   	int3
 1200776:	53                   	push   rbx
 1200777:	48 89 fb             	mov    rbx,rdi
 120077a:	48 8d 05 17 ba 65 00 	lea    rax,[rip+0x65ba17]        # 185c198 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18880>
 1200781:	48 89 07             	mov    QWORD PTR [rdi],rax
 1200784:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
 1200788:	e8 e9 df 89 ff       	call   a9e776 <JNI_OnUnload@@Base+0x26043>
 120078d:	48 89 df             	mov    rdi,rbx
 1200790:	5b                   	pop    rbx
 1200791:	e9 9a d7 5e 00       	jmp    17edf30 <_ZNSt9exceptionD2Ev@plt>
 1200796:	55                   	push   rbp
 1200797:	41 57                	push   r15
 1200799:	41 56                	push   r14
 120079b:	53                   	push   rbx
 120079c:	50                   	push   rax
 120079d:	49 89 f6             	mov    r14,rsi
 12007a0:	48 89 fb             	mov    rbx,rdi
 12007a3:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
 12007a8:	48 8d 05 b9 07 6a 00 	lea    rax,[rip+0x6a07b9]        # 18a0f68 <_ZZN4asio9execution12any_executorIJNS0_12context_as_tIRNS_17execution_contextEEENS0_6detail8blocking7never_tILi0EEENS0_11prefer_onlyINS7_10possibly_tILi0EEEEENSA_INS6_16outstanding_work9tracked_tILi0EEEEENSA_INSE_11untracked_tILi0EEEEENSA_INS6_12relationship6fork_tILi0EEEEENSA_INSL_14continuation_tILi0EEEEEEE14prop_fns_tableINS_10io_context19basic_executor_typeINSt6__ndk19allocatorIvEELm0EEEEEPKNS6_17any_executor_base8prop_fnsISS_EEvE3fns@@Base+0xdea8>
 12007af:	48 89 07             	mov    QWORD PTR [rdi],rax
 12007b2:	48 8b 76 08          	mov    rsi,QWORD PTR [rsi+0x8]
 12007b6:	40 f6 c6 01          	test   sil,0x1
 12007ba:	74 11                	je     12007cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45d51>
 12007bc:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
 12007c0:	48 83 e6 fe          	and    rsi,0xfffffffffffffffe
 12007c4:	48 83 c6 08          	add    rsi,0x8
 12007c8:	e8 33 dd 54 00       	call   174e500 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10266c>
 12007cd:	41 8b 46 10          	mov    eax,DWORD PTR [r14+0x10]
 12007d1:	89 43 10             	mov    DWORD PTR [rbx+0x10],eax
 12007d4:	83 63 14 00          	and    DWORD PTR [rbx+0x14],0x0
 12007d8:	49 8b 7e 18          	mov    rdi,QWORD PTR [r14+0x18]
 12007dc:	45 31 ff             	xor    r15d,r15d
 12007df:	31 f6                	xor    esi,esi
 12007e1:	e8 20 a5 8a ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
 12007e6:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 12007ea:	49 8b 7e 20          	mov    rdi,QWORD PTR [r14+0x20]
 12007ee:	31 f6                	xor    esi,esi
 12007f0:	e8 11 a5 8a ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
 12007f5:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 12007f9:	49 8b 7e 28          	mov    rdi,QWORD PTR [r14+0x28]
 12007fd:	31 f6                	xor    esi,esi
 12007ff:	e8 02 a5 8a ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
 1200804:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 1200808:	49 8b 7e 30          	mov    rdi,QWORD PTR [r14+0x30]
 120080c:	31 f6                	xor    esi,esi
 120080e:	e8 f3 a4 8a ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
 1200813:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 1200817:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 120081b:	31 f6                	xor    esi,esi
--
 1200910:	31 d2                	xor    edx,edx
 1200912:	ff d0                	call   rax
 1200914:	48 83 63 10 00       	and    QWORD PTR [rbx+0x10],0x0
 1200919:	5b                   	pop    rbx
 120091a:	c3                   	ret
 120091b:	48 89 c7             	mov    rdi,rax
 120091e:	e8 82 91 87 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 1200923:	cc                   	int3
 1200924:	80 bf 88 00 00 00 00 	cmp    BYTE PTR [rdi+0x88],0x0
 120092b:	74 05                	je     1200932 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45eb6>
 120092d:	e9 04 27 4b 00       	jmp    16b3036 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x671a2>
 1200932:	48 8b 7f 18          	mov    rdi,QWORD PTR [rdi+0x18]
 1200936:	e9 3b de 89 ff       	jmp    a9e776 <JNI_OnUnload@@Base+0x26043>
 120093b:	cc                   	int3
 120093c:	53                   	push   rbx
 120093d:	48 89 fb             	mov    rbx,rdi
 1200940:	e8 31 fe ff ff       	call   1200776 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45cfa>
 1200945:	48 89 df             	mov    rdi,rbx
 1200948:	5b                   	pop    rbx
 1200949:	e9 d2 d5 5e 00       	jmp    17edf20 <_ZdlPv@plt>
 120094e:	48 8d 05 43 b8 65 00 	lea    rax,[rip+0x65b843]        # 185c198 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18880>
 1200955:	48 89 07             	mov    QWORD PTR [rdi],rax
 1200958:	48 83 c7 08          	add    rdi,0x8
 120095c:	48 83 c6 08          	add    rsi,0x8
 1200960:	e9 99 92 e4 ff       	jmp    1049bfe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x211014>
 1200965:	cc                   	int3
 1200966:	53                   	push   rbx
 1200967:	48 89 fb             	mov    rbx,rdi
 120096a:	e8 f5 78 ff ff       	call   11f8264 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3d7e8>
 120096f:	48 89 df             	mov    rdi,rbx
 1200972:	5b                   	pop    rbx
 1200973:	e9 a8 d5 5e 00       	jmp    17edf20 <_ZdlPv@plt>
 1200978:	55                   	push   rbp
 1200979:	41 57                	push   r15
 120097b:	41 56                	push   r14
 120097d:	41 55                	push   r13
 120097f:	41 54                	push   r12
 1200981:	53                   	push   rbx
 1200982:	48 81 ec 88 01 00 00 	sub    rsp,0x188
 1200989:	49 89 d6             	mov    r14,rdx
 120098c:	49 89 f5             	mov    r13,rsi
 120098f:	49 89 fc             	mov    r12,rdi
 1200992:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1200999:	00 00 
 120099b:	48 89 84 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rax
 12009a2:	00 
 12009a3:	4c 8b 7f 30          	mov    r15,QWORD PTR [rdi+0x30]
 12009a7:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 12009ac:	e8 26 33 28 00       	call   1483cd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c925b>
 12009b1:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
 12009b6:	4c 89 ee             	mov    rsi,r13
 12009b9:	e8 82 d5 5e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12009be:	49 8b b5 98 00 00 00 	mov    rsi,QWORD PTR [r13+0x98]
 12009c5:	49 3b b5 a0 00 00 00 	cmp    rsi,QWORD PTR [r13+0xa0]
 12009cc:	74 0c                	je     12009da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45f5e>
 12009ce:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 12009d3:	e8 68 d5 5e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
 12009d8:	eb 11                	jmp    12009eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45f6f>
 12009da:	48 8d 35 9b 15 25 ff 	lea    rsi,[rip+0xffffffffff25159b]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
 12009e1:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
 12009e6:	e8 93 90 87 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
 12009eb:	49 8b b5 80 00 00 00 	mov    rsi,QWORD PTR [r13+0x80]
 12009f2:	49 3b b5 88 00 00 00 	cmp    rsi,QWORD PTR [r13+0x88]
 12009f9:	74 0c                	je     1200a07 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45f8b>
 12009fb:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
 1200a00:	e8 3b d5 5e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
--
 120581b:	e8 70 86 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1205820:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 1205825:	e8 66 86 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 120582a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1205831:	00 00 
 1205833:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 1205838:	0f 85 ea 00 00 00    	jne    1205928 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4aeac>
 120583e:	48 83 c4 58          	add    rsp,0x58
 1205842:	5b                   	pop    rbx
 1205843:	41 5c                	pop    r12
 1205845:	41 5d                	pop    r13
 1205847:	41 5e                	pop    r14
 1205849:	41 5f                	pop    r15
 120584b:	5d                   	pop    rbp
 120584c:	c3                   	ret
 120584d:	48 8d 3d fc 46 7e 00 	lea    rdi,[rip+0x7e46fc]        # 19e9f50 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xb88>
 1205854:	e8 17 89 5e 00       	call   17ee170 <__cxa_guard_acquire@plt>
 1205859:	85 c0                	test   eax,eax
 120585b:	0f 84 b1 fe ff ff    	je     1205712 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ac96>
 1205861:	48 8d 3d c0 46 7e 00 	lea    rdi,[rip+0x7e46c0]        # 19e9f28 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xb60>
 1205868:	48 8d 35 31 68 65 00 	lea    rsi,[rip+0x656831]        # 185c0a0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18788>
 120586f:	6a 0c                	push   0xc
 1205871:	5a                   	pop    rdx
 1205872:	e8 3b 08 00 00       	call   12060b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b636>
 1205877:	48 8d 3d ae e7 b3 ff 	lea    rdi,[rip+0xffffffffffb3e7ae]        # d4402c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x110b2>
 120587e:	48 8d 35 a3 46 7e 00 	lea    rsi,[rip+0x7e46a3]        # 19e9f28 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xb60>
 1205885:	48 8d 15 74 e7 5e 00 	lea    rdx,[rip+0x5ee774]        # 17f4000 <pthread_rwlock_wrlock@plt+0x3240>
 120588c:	e8 cf 85 5e 00       	call   17ede60 <__cxa_atexit@plt>
 1205891:	48 8d 3d b8 46 7e 00 	lea    rdi,[rip+0x7e46b8]        # 19e9f50 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xb88>
 1205898:	e8 e3 88 5e 00       	call   17ee180 <__cxa_guard_release@plt>
 120589d:	e9 70 fe ff ff       	jmp    1205712 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ac96>
 12058a2:	49 89 c5             	mov    r13,rax
 12058a5:	48 8d 3d a4 46 7e 00 	lea    rdi,[rip+0x7e46a4]        # 19e9f50 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0xb88>
 12058ac:	e8 4f 8f 5e 00       	call   17ee800 <__cxa_guard_abort@plt>
 12058b1:	eb 4b                	jmp    12058fe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ae82>
 12058b3:	49 89 c5             	mov    r13,rax
 12058b6:	4c 89 e7             	mov    rdi,r12
 12058b9:	e8 d2 85 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12058be:	eb 03                	jmp    12058c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ae47>
 12058c0:	49 89 c5             	mov    r13,rax
 12058c3:	4c 89 ff             	mov    rdi,r15
 12058c6:	e8 c5 85 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12058cb:	eb 03                	jmp    12058d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ae54>
 12058cd:	49 89 c5             	mov    r13,rax
 12058d0:	48 89 ef             	mov    rdi,rbp
 12058d3:	e8 b8 85 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12058d8:	eb 03                	jmp    12058dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ae61>
 12058da:	49 89 c5             	mov    r13,rax
 12058dd:	4c 89 f7             	mov    rdi,r14
 12058e0:	e8 ab 85 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12058e5:	eb 03                	jmp    12058ea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4ae6e>
 12058e7:	49 89 c5             	mov    r13,rax
 12058ea:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
 12058ef:	e8 9c 85 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12058f4:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 12058f9:	e8 92 85 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 12058fe:	48 89 df             	mov    rdi,rbx
 1205901:	e8 8a 85 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1205906:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
 120590b:	e8 80 85 5e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
 1205910:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 1205917:	00 00 
 1205919:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
 120591e:	75 08                	jne    1205928 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4aeac>
 1205920:	4c 89 ef             	mov    rdi,r13
 1205923:	e8 a8 a3 86 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>

## Direct references to likely nearby vtable address points
### 1841fc0
1461775:  efc6de:	48 8d 05 db 58 94 00 	lea    rax,[rip+0x9458db]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
1698082:  fd47ed:	48 8d 05 cc d7 86 00 	lea    rax,[rip+0x86d7cc]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
1698396:  fd4c74:	48 8d 0d 45 d3 86 00 	lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>

## Method bodies adjacent to fd381a/fd38d6

/tmp/savt/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fd3300 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a716>:
  fd3300:	65 10 00             	adc    BYTE PTR gs:[rax],al
  fd3303:	0f 28 45 00          	movaps xmm0,XMMWORD PTR [rbp+0x0]
  fd3307:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  fd330c:	0f 57 c0             	xorps  xmm0,xmm0
  fd330f:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0
  fd3313:	48 39 c8             	cmp    rax,rcx
  fd3316:	74 0f                	je     fd3327 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a73d>
  fd3318:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fd331d:	4c 89 fe             	mov    rsi,r15
  fd3320:	e8 93 fb b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  fd3325:	eb 2f                	jmp    fd3356 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a76c>
  fd3327:	49 8b 4c 24 40       	mov    rcx,QWORD PTR [r12+0x40]
  fd332c:	48 85 c9             	test   rcx,rcx
  fd332f:	74 0a                	je     fd333b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a751>
  fd3331:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd3336:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd333b:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  fd3340:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
  fd3345:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  fd334a:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  fd334f:	31 ff                	xor    edi,edi
  fd3351:	e8 30 b1 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3356:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  fd335b:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
  fd3360:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  fd3365:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
  fd3369:	4c 89 6b 30          	mov    QWORD PTR [rbx+0x30],r13
  fd336d:	0f 57 c0             	xorps  xmm0,xmm0
  fd3370:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  fd3373:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  fd3378:	e8 ff 8b e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd337d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  fd3384:	00 
  fd3385:	e8 f2 8b e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd338a:	0f b6 54 24 0c       	movzx  edx,BYTE PTR [rsp+0xc]
  fd338f:	4c 89 f7             	mov    rdi,r14
  fd3392:	48 89 de             	mov    rsi,rbx
  fd3395:	e8 3e 28 f5 ff       	call   f25bd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecfee>
  fd339a:	48 89 df             	mov    rdi,rbx
  fd339d:	e8 70 1f f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd33a2:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  fd33a7:	e8 da b0 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd33ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd33b3:	00 00 
  fd33b5:	48 3b 84 24 d0 00 00 	cmp    rax,QWORD PTR [rsp+0xd0]
  fd33bc:	00 
  fd33bd:	75 12                	jne    fd33d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a7e7>
  fd33bf:	48 81 c4 d8 00 00 00 	add    rsp,0xd8
  fd33c6:	5b                   	pop    rbx
  fd33c7:	41 5c                	pop    r12
  fd33c9:	41 5d                	pop    r13
  fd33cb:	41 5e                	pop    r14
  fd33cd:	41 5f                	pop    r15
  fd33cf:	5d                   	pop    rbp
  fd33d0:	c3                   	ret
  fd33d1:	e8 da c6 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd33d6:	48 89 c3             	mov    rbx,rax
  fd33d9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  fd33de:	e8 a3 b0 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd33e3:	48 89 df             	mov    rdi,rbx
  fd33e6:	e8 ba 66 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd33eb:	cc                   	int3
  fd33ec:	53                   	push   rbx
  fd33ed:	48 89 fb             	mov    rbx,rdi
  fd33f0:	48 8d 05 91 e9 86 00 	lea    rax,[rip+0x86e991]        # 1841d88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13d20>
  fd33f7:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd33fa:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
  fd33fe:	e8 83 b0 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3403:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  fd3407:	5b                   	pop    rbx
  fd3408:	e9 a5 b0 ac ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd340d:	cc                   	int3
  fd340e:	53                   	push   rbx
  fd340f:	48 89 fb             	mov    rbx,rdi
  fd3412:	e8 d5 ff ff ff       	call   fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd3417:	48 89 df             	mov    rdi,rbx
  fd341a:	5b                   	pop    rbx
  fd341b:	e9 00 ab 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd3420:	55                   	push   rbp
  fd3421:	41 57                	push   r15
  fd3423:	41 56                	push   r14
  fd3425:	41 55                	push   r13
  fd3427:	41 54                	push   r12
  fd3429:	53                   	push   rbx
  fd342a:	48 81 ec e8 0c 00 00 	sub    rsp,0xce8
  fd3431:	4d 89 c6             	mov    r14,r8
  fd3434:	49 89 cf             	mov    r15,rcx
  fd3437:	49 89 d4             	mov    r12,rdx
  fd343a:	48 89 fb             	mov    rbx,rdi
  fd343d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3444:	00 00 
  fd3446:	48 89 84 24 e0 0c 00 	mov    QWORD PTR [rsp+0xce0],rax
  fd344d:	00 
  fd344e:	48 83 c6 08          	add    rsi,0x8
  fd3452:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fd3457:	e8 fe 89 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd345c:	0f 57 c0             	xorps  xmm0,xmm0
  fd345f:	48 89 e2             	mov    rdx,rsp
  fd3462:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
  fd3465:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
  fd346a:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
  fd346f:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
  fd3474:	4c 89 ef             	mov    rdi,r13
  fd3477:	e8 de 1b f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd347c:	49 8b 45 10          	mov    rax,QWORD PTR [r13+0x10]
  fd3480:	4c 8b 68 20          	mov    r13,QWORD PTR [rax+0x20]
  fd3484:	4d 85 ed             	test   r13,r13
  fd3487:	74 64                	je     fd34ed <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a903>
  fd3489:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  fd348d:	48 8b a8 a0 00 00 00 	mov    rbp,QWORD PTR [rax+0xa0]
  fd3494:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  fd349b:	00 
  fd349c:	4c 89 e6             	mov    rsi,r12
  fd349f:	e8 4c 3e 69 00       	call   16672f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b45c>
  fd34a4:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
  fd34a9:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
  fd34b0:	00 
  fd34b1:	4c 89 ee             	mov    rsi,r13
  fd34b4:	4c 89 f9             	mov    rcx,r15
  fd34b7:	4d 89 f0             	mov    r8,r14
  fd34ba:	ff d5                	call   rbp
  fd34bc:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  fd34c1:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  fd34c6:	4c 8d 74 24 78       	lea    r14,[rsp+0x78]
  fd34cb:	31 d2                	xor    edx,edx
  fd34cd:	4c 89 f1             	mov    rcx,r14
  fd34d0:	e8 c7 ef ff ff       	call   fd249c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1998b2>
  fd34d5:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fd34d9:	e8 a8 af ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd34de:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  fd34e5:	00 
  fd34e6:	e8 df 3d 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  fd34eb:	eb 0f                	jmp    fd34fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a912>
  fd34ed:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  fd34f2:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  fd34f7:	e8 9e fc ff ff       	call   fd319a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a5b0>
  fd34fc:	4c 8d 74 24 68       	lea    r14,[rsp+0x68]
  fd3501:	48 89 df             	mov    rdi,rbx
  fd3504:	4c 89 f6             	mov    rsi,r14
  fd3507:	e8 ae 25 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fd350c:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fd3510:	e8 71 af ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3515:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  fd351a:	e8 f3 1d f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd351f:	48 89 e7             	mov    rdi,rsp
  fd3522:	e8 55 8a e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd3527:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fd352c:	e8 55 af ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3531:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3538:	00 00 
  fd353a:	48 3b 84 24 e0 0c 00 	cmp    rax,QWORD PTR [rsp+0xce0]
  fd3541:	00 
  fd3542:	75 12                	jne    fd3556 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a96c>
  fd3544:	48 81 c4 e8 0c 00 00 	add    rsp,0xce8
  fd354b:	5b                   	pop    rbx
  fd354c:	41 5c                	pop    r12
  fd354e:	41 5d                	pop    r13
  fd3550:	41 5e                	pop    r14
  fd3552:	41 5f                	pop    r15
  fd3554:	5d                   	pop    rbp
  fd3555:	c3                   	ret
  fd3556:	e8 55 c5 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd355b:	eb 00                	jmp    fd355d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a973>
  fd355d:	48 89 c7             	mov    rdi,rax
  fd3560:	e8 40 65 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd3565:	cc                   	int3
  fd3566:	55                   	push   rbp
  fd3567:	41 57                	push   r15
  fd3569:	41 56                	push   r14
  fd356b:	41 55                	push   r13
  fd356d:	41 54                	push   r12
  fd356f:	53                   	push   rbx
  fd3570:	48 81 ec c8 0c 00 00 	sub    rsp,0xcc8
  fd3577:	89 d5                	mov    ebp,edx
  fd3579:	49 89 f7             	mov    r15,rsi
  fd357c:	49 89 fe             	mov    r14,rdi
  fd357f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3586:	00 00 
  fd3588:	48 89 84 24 c0 0c 00 	mov    QWORD PTR [rsp+0xcc0],rax
  fd358f:	00 
  fd3590:	48 8d 77 10          	lea    rsi,[rdi+0x10]
  fd3594:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
  fd3599:	48 89 df             	mov    rdi,rbx
  fd359c:	e8 8f 7d ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  fd35a1:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
  fd35a4:	48 85 db             	test   rbx,rbx
  fd35a7:	0f 84 d3 01 00 00    	je     fd3780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab96>
  fd35ad:	40 84 ed             	test   bpl,bpl
  fd35b0:	74 23                	je     fd35d5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a9eb>
  fd35b2:	0f 57 c0             	xorps  xmm0,xmm0
  fd35b5:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
  fd35ba:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  fd35bf:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
  fd35c3:	4c 89 e6             	mov    rsi,r12
  fd35c6:	e8 51 62 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd35cb:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
  fd35d0:	e8 b1 ae ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd35d5:	49 8d 76 20          	lea    rsi,[r14+0x20]
  fd35d9:	31 c0                	xor    eax,eax
  fd35db:	88 44 24 40          	mov    BYTE PTR [rsp+0x40],al
  fd35df:	88 44 24 58          	mov    BYTE PTR [rsp+0x58],al
  fd35e3:	45 8a 67 18          	mov    r12b,BYTE PTR [r15+0x18]
  fd35e7:	45 84 e4             	test   r12b,r12b
  fd35ea:	74 23                	je     fd360f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aa25>
  fd35ec:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
  fd35f0:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  fd35f5:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
  fd35f9:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
  fd35fe:	0f 57 c0             	xorps  xmm0,xmm0
  fd3601:	41 0f 11 07          	movups XMMWORD PTR [r15],xmm0
  fd3605:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
  fd360a:	c6 44 24 58 01       	mov    BYTE PTR [rsp+0x58],0x1
  fd360f:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fd3614:	e8 d7 3c 69 00       	call   16672f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b45c>
  fd3619:	45 84 e4             	test   r12b,r12b
  fd361c:	74 12                	je     fd3630 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aa46>
  fd361e:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
  fd3625:	00 
  fd3626:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  fd362b:	e8 30 4b b7 ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
  fd3630:	49 8b b6 e8 0d 00 00 	mov    rsi,QWORD PTR [r14+0xde8]
  fd3637:	48 83 c6 08          	add    rsi,0x8
  fd363b:	49 8d 8e 78 0c 00 00 	lea    rcx,[r14+0xc78]
  fd3642:	4d 8d 86 c8 0c 00 00 	lea    r8,[r14+0xcc8]
  fd3649:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
  fd364e:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
  fd3653:	4c 89 ff             	mov    rdi,r15
  fd3656:	4c 89 e2             	mov    rdx,r12
  fd3659:	e8 c2 fd ff ff       	call   fd3420 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a836>
  fd365e:	4c 89 e7             	mov    rdi,r12
  fd3661:	e8 64 3c 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  fd3666:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fd366b:	4c 89 fe             	mov    rsi,r15
  fd366e:	e8 c5 ef ff ff       	call   fd2638 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199a4e>
  fd3673:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd3677:	e8 0a ae ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd367c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  fd3681:	e8 aa 36 ad ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  fd3686:	41 0f 10 46 10       	movups xmm0,XMMWORD PTR [r14+0x10]
  fd368b:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  fd368f:	4d 8b 76 18          	mov    r14,QWORD PTR [r14+0x18]
  fd3693:	4d 85 f6             	test   r14,r14
  fd3696:	74 05                	je     fd369d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aab3>
  fd3698:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd369d:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
  fd36a2:	4d 85 ff             	test   r15,r15
  fd36a5:	74 75                	je     fd371c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab32>
  fd36a7:	6a 28                	push   0x28
  fd36a9:	5f                   	pop    rdi
  fd36aa:	e8 51 a8 81 00       	call   17edf00 <_Znwm@plt>
  fd36af:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  fd36b3:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
  fd36b7:	4d 85 f6             	test   r14,r14
  fd36ba:	74 05                	je     fd36c1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aad7>
  fd36bc:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd36c1:	40 88 68 20          	mov    BYTE PTR [rax+0x20],bpl
  fd36c5:	48 8d 0d 0a 45 f5 ff 	lea    rcx,[rip+0xfffffffffff5450a]        # f27bd6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xeefec>
  fd36cc:	48 89 08             	mov    QWORD PTR [rax],rcx
  fd36cf:	48 8d 0d e2 c1 b6 ff 	lea    rcx,[rip+0xffffffffffb6c1e2]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
  fd36d6:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  fd36da:	4c 89 ff             	mov    rdi,r15
  fd36dd:	48 89 c6             	mov    rsi,rax
  fd36e0:	e8 df 60 ef ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
  fd36e5:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fd36ea:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
  fd36ee:	0f 57 c0             	xorps  xmm0,xmm0
  fd36f1:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  fd36f4:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
  fd36f9:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
  fd36fe:	4c 89 ee             	mov    rsi,r13
  fd3701:	e8 16 61 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd3706:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd370a:	e8 77 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd370f:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
  fd3713:	76 11                	jbe    fd3726 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab3c>
  fd3715:	31 c0                	xor    eax,eax
  fd3717:	45 31 ff             	xor    r15d,r15d
  fd371a:	eb 1c                	jmp    fd3738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab4e>
  fd371c:	0f 57 c0             	xorps  xmm0,xmm0
  fd371f:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
  fd3724:	eb 2b                	jmp    fd3751 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab67>
  fd3726:	4d 85 e4             	test   r12,r12
  fd3729:	74 0b                	je     fd3736 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab4c>
  fd372b:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
  fd3731:	4c 89 e0             	mov    rax,r12
  fd3734:	eb 02                	jmp    fd3738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab4e>
  fd3736:	31 c0                	xor    eax,eax
  fd3738:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
  fd373d:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  fd3742:	31 ff                	xor    edi,edi
  fd3744:	e8 3d ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3749:	4c 89 e7             	mov    rdi,r12
  fd374c:	e8 35 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3751:	48 83 c3 18          	add    rbx,0x18
  fd3755:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
  fd375a:	48 89 df             	mov    rdi,rbx
  fd375d:	4c 89 fe             	mov    rsi,r15
  fd3760:	e8 b7 60 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd3765:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd3769:	e8 18 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd376e:	4c 89 f7             	mov    rdi,r14
  fd3771:	e8 3c ad ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd3776:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fd377b:	e8 06 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3780:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  fd3785:	e8 fc ac ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd378a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3791:	00 00 
  fd3793:	48 3b 84 24 c0 0c 00 	cmp    rax,QWORD PTR [rsp+0xcc0]
  fd379a:	00 
  fd379b:	75 12                	jne    fd37af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19abc5>
  fd379d:	48 81 c4 c8 0c 00 00 	add    rsp,0xcc8
  fd37a4:	5b                   	pop    rbx
  fd37a5:	41 5c                	pop    r12
  fd37a7:	41 5d                	pop    r13
  fd37a9:	41 5e                	pop    r14
  fd37ab:	41 5f                	pop    r15
  fd37ad:	5d                   	pop    rbp
  fd37ae:	c3                   	ret
  fd37af:	e8 fc c2 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd37b4:	48 89 c7             	mov    rdi,rax
  fd37b7:	e8 e9 62 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd37bc:	48 89 c3             	mov    rbx,rax
  fd37bf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fd37c4:	e8 01 3b 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  fd37c9:	eb 03                	jmp    fd37ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19abe4>
  fd37cb:	48 89 c3             	mov    rbx,rax
  fd37ce:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  fd37d3:	e8 58 35 ad ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  fd37d8:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  fd37dd:	e8 a4 ac ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd37e2:	48 89 df             	mov    rdi,rbx
  fd37e5:	e8 bb 62 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd37ea:	48 83 c7 08          	add    rdi,0x8
  fd37ee:	e9 f9 fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd37f3:	cc                   	int3
  fd37f4:	53                   	push   rbx
  fd37f5:	48 89 fb             	mov    rbx,rdi
  fd37f8:	48 83 c7 08          	add    rdi,0x8
  fd37fc:	e8 eb fb ff ff       	call   fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd3801:	48 89 df             	mov    rdi,rbx
  fd3804:	5b                   	pop    rbx
  fd3805:	e9 16 a7 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd380a:	e9 dd fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd380f:	cc                   	int3
  fd3810:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd3814:	e9 db ff ff ff       	jmp    fd37f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac0a>
  fd3819:	cc                   	int3
  fd381a:	41 56                	push   r14
  fd381c:	53                   	push   rbx
  fd381d:	48 83 ec 28          	sub    rsp,0x28
  fd3821:	49 89 f6             	mov    r14,rsi
  fd3824:	48 89 fb             	mov    rbx,rdi
  fd3827:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd382e:	00 00 
  fd3830:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  fd3835:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
  fd3839:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd383c:	ff 50 70             	call   QWORD PTR [rax+0x70]
  fd383f:	41 80 7e 68 00       	cmp    BYTE PTR [r14+0x68],0x0
  fd3844:	74 3c                	je     fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
  fd3846:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  fd384a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd384d:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd3853:	85 c0                	test   eax,eax
  fd3855:	75 2b                	jne    fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
  fd3857:	48 8d 35 2c 38 37 ff 	lea    rsi,[rip+0xffffffffff37382c]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd385e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd3863:	6a 07                	push   0x7
  fd3865:	5a                   	pop    rdx
  fd3866:	e8 af 91 ac ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
  fd386b:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
  fd3870:	48 89 df             	mov    rdi,rbx
  fd3873:	e8 b4 01 d5 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fd3878:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd387d:	e8 0e a6 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fd3882:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3889:	00 00 
  fd388b:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fd3890:	75 3f                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
  fd3892:	48 89 d8             	mov    rax,rbx
  fd3895:	48 83 c4 28          	add    rsp,0x28
  fd3899:	5b                   	pop    rbx
  fd389a:	41 5e                	pop    r14
  fd389c:	c3                   	ret
  fd389d:	49 89 c6             	mov    r14,rax
  fd38a0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd38a5:	e8 e6 a5 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fd38aa:	eb 05                	jmp    fd38b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc7>
  fd38ac:	eb 00                	jmp    fd38ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc4>
  fd38ae:	49 89 c6             	mov    r14,rax
  fd38b1:	48 89 df             	mov    rdi,rbx
  fd38b4:	e8 ad ed b0 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  fd38b9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38c0:	00 00 
  fd38c2:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fd38c7:	75 08                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
  fd38c9:	4c 89 f7             	mov    rdi,r14
  fd38cc:	e8 ff c3 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  fd38d1:	e8 da c1 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd38d6:	41 57                	push   r15
  fd38d8:	41 56                	push   r14
  fd38da:	41 55                	push   r13
  fd38dc:	41 54                	push   r12
  fd38de:	53                   	push   rbx
  fd38df:	48 83 ec 20          	sub    rsp,0x20
  fd38e3:	49 89 ce             	mov    r14,rcx
  fd38e6:	49 89 d7             	mov    r15,rdx
  fd38e9:	49 89 f4             	mov    r12,rsi
  fd38ec:	48 89 fb             	mov    rbx,rdi
  fd38ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38f6:	00 00 
  fd38f8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  fd38fd:	48 89 d7             	mov    rdi,rdx
  fd3900:	e8 31 7f aa ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
  fd3905:	48 89 d1             	mov    rcx,rdx
  fd3908:	48 8d 3d 7b 37 37 ff 	lea    rdi,[rip+0xffffffffff37377b]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd390f:	6a 07                	push   0x7
  fd3911:	5e                   	pop    rsi
  fd3912:	48 89 c2             	mov    rdx,rax
  fd3915:	e8 66 7f aa ff       	call   a7b880 <JNI_OnUnload@@Base+0x314d>
  fd391a:	84 c0                	test   al,al
  fd391c:	74 12                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd391e:	49 8b 7c 24 40       	mov    rdi,QWORD PTR [r12+0x40]
  fd3923:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd3926:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd392c:	85 c0                	test   eax,eax
  fd392e:	74 4f                	je     fd397f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad95>
  fd3930:	49 83 c4 08          	add    r12,0x8
  fd3934:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
  fd3939:	4c 89 ef             	mov    rdi,r13
  fd393c:	4c 89 e6             	mov    rsi,r12
  fd393f:	4c 89 fa             	mov    rdx,r15
  fd3942:	4c 89 f1             	mov    rcx,r14
  fd3945:	e8 8a 30 00 00       	call   fd69d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ddea>
  fd394a:	48 89 df             	mov    rdi,rbx
  fd394d:	4c 89 ee             	mov    rsi,r13
  fd3950:	e8 7f 2c 00 00       	call   fd65d4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d9ea>
  fd3955:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd3959:	e8 28 ab ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd395e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3965:	00 00 
  fd3967:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
  fd396c:	75 48                	jne    fd39b6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19adcc>
  fd396e:	48 89 d8             	mov    rax,rbx
  fd3971:	48 83 c4 20          	add    rsp,0x20
  fd3975:	5b                   	pop    rbx
  fd3976:	41 5c                	pop    r12
  fd3978:	41 5d                	pop    r13
  fd397a:	41 5e                	pop    r14
  fd397c:	41 5f                	pop    r15
  fd397e:	c3                   	ret
  fd397f:	41 80 7c 24 68 00    	cmp    BYTE PTR [r12+0x68],0x0
  fd3985:	74 a9                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3987:	41 80 7e 60 00       	cmp    BYTE PTR [r14+0x60],0x0
  fd398c:	74 a2                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd398e:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
  fd3992:	49 3b 44 24 58       	cmp    rax,QWORD PTR [r12+0x58]
  fd3997:	7e 97                	jle    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3999:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
  fd399e:	48 39 f0             	cmp    rax,rsi
  fd39a1:	7d 8d                	jge    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39a3:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
  fd39a8:	48 ff c6             	inc    rsi
  fd39ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd39ae:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fd39b1:	e9 7a ff ff ff       	jmp    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39b6:	e8 f5 c0 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd39bb:	cc                   	int3
  fd39bc:	55                   	push   rbp
  fd39bd:	41 57                	push   r15
  fd39bf:	41 56                	push   r14
  fd39c1:	41 55                	push   r13
  fd39c3:	41 54                	push   r12
  fd39c5:	53                   	push   rbx
  fd39c6:	48 81 ec 58 01 00 00 	sub    rsp,0x158
  fd39cd:	49 89 f4             	mov    r12,rsi
  fd39d0:	49 89 ff             	mov    r15,rdi
  fd39d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd39da:	00 00 
  fd39dc:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  fd39e3:	00 
  fd39e4:	48 8d 5e 10          	lea    rbx,[rsi+0x10]
  fd39e8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  fd39ef:	00 
  fd39f0:	48 89 de             	mov    rsi,rbx
  fd39f3:	e8 62 84 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd39f8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  fd39ff:	00 
  fd3a00:	48 89 de             	mov    rsi,rbx
  fd3a03:	e8 52 84 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd3a08:	66 0f ef c0          	pxor   xmm0,xmm0
  fd3a0c:	48 8d 94 24 e0 00 00 	lea    rdx,[rsp+0xe0]
  fd3a13:	00 
  fd3a14:	66 0f 7f 02          	movdqa XMMWORD PTR [rdx],xmm0
  fd3a18:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
  fd3a1d:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
  fd3a24:	00 
  fd3a25:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  fd3a2c:	00 
  fd3a2d:	48 89 df             	mov    rdi,rbx
  fd3a30:	e8 25 16 f5 ff       	call   f2505a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec470>
  fd3a35:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]
  fd3a39:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
  fd3a3d:	48 85 f6             	test   rsi,rsi
  fd3a40:	74 3e                	je     fd3a80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ae96>
  fd3a42:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd3a45:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
  fd3a4c:	00 
  fd3a4d:	ff 90 48 01 00 00    	call   QWORD PTR [rax+0x148]
  fd3a53:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  fd3a5a:	00 
  fd3a5b:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  fd3a62:	00 
  fd3a63:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
  fd3a6a:	00 
  fd3a6b:	31 d2                	xor    edx,edx
  fd3a6d:	48 89 d9             	mov    rcx,rbx
  fd3a70:	e8 43 14 00 00       	call   fd4eb8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c2ce>
  fd3a75:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  fd3a79:	e8 08 aa ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3a7e:	eb 15                	jmp    fd3a95 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aeab>
  fd3a80:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  fd3a87:	00 
  fd3a88:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  fd3a8f:	00 
  fd3a90:	e8 6b 12 00 00       	call   fd4d00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c116>
  fd3a95:	48 8d 5c 24 70       	lea    rbx,[rsp+0x70]
  fd3a9a:	4c 8d b4 24 00 01 00 	lea    r14,[rsp+0x100]
  fd3aa1:	00 
  fd3aa2:	48 89 df             	mov    rdi,rbx
  fd3aa5:	4c 89 f6             	mov    rsi,r14
  fd3aa8:	e8 0d 20 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fd3aad:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fd3ab1:	e8 d0 a9 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3ab6:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  fd3abd:	00 
  fd3abe:	e8 4f 18 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd3ac3:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  fd3aca:	00 
  fd3acb:	e8 ac 84 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd3ad0:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  fd3ad7:	00 
  fd3ad8:	e8 a9 a9 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3add:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
  fd3ae4:	00 
  fd3ae5:	4c 89 f7             	mov    rdi,r14
  fd3ae8:	48 89 de             	mov    rsi,rbx
  fd3aeb:	e8 64 15 00 00       	call   fd5054 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c46a>
  fd3af0:	49 8b 2e             	mov    rbp,QWORD PTR [r14]
  fd3af3:	48 85 ed             	test   rbp,rbp
  fd3af6:	74 47                	je     fd3b3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19af55>
  fd3af8:	80 7d 50 00          	cmp    BYTE PTR [rbp+0x50],0x0
  fd3afc:	74 41                	je     fd3b3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19af55>
  fd3afe:	48 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbp
  fd3b05:	00 
  fd3b06:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  fd3b0d:	00 
  fd3b0e:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
  fd3b12:	4c 89 b4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r14
  fd3b19:	00 
  fd3b1a:	66 0f ef c0          	pxor   xmm0,xmm0
  fd3b1e:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0
  fd3b22:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
  fd3b29:	00 
  fd3b2a:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
  fd3b2e:	48 89 de             	mov    rsi,rbx
  fd3b31:	e8 e6 5c ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd3b36:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  fd3b3a:	e9 58 02 00 00       	jmp    fd3d97 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b1ad>
  fd3b3f:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
  fd3b46:	00 
  fd3b47:	e8 e0 4d f6 ff       	call   f3892c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xffd42>
  fd3b4c:	4c 89 64 24 38       	mov    QWORD PTR [rsp+0x38],r12
  fd3b51:	48 8b ac 24 00 01 00 	mov    rbp,QWORD PTR [rsp+0x100]
  fd3b58:	00 
  fd3b59:	4c 8b b4 24 08 01 00 	mov    r14,QWORD PTR [rsp+0x108]
  fd3b60:	00 
  fd3b61:	48 89 ac 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rbp
  fd3b68:	00 
  fd3b69:	4c 89 b4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r14
  fd3b70:	00 
  fd3b71:	4d 85 f6             	test   r14,r14
  fd3b74:	74 05                	je     fd3b7b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19af91>
  fd3b76:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd3b7b:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
  fd3b82:	00 00 
  fd3b84:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
  fd3b8b:	00 
  fd3b8c:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
  fd3b90:	66 0f ef c9          	pxor   xmm1,xmm1
  fd3b94:	66 0f 7f 8c 24 90 00 	movdqa XMMWORD PTR [rsp+0x90],xmm1
  fd3b9b:	00 00 
  fd3b9d:	66 0f 7f 4b 10       	movdqa XMMWORD PTR [rbx+0x10],xmm1
  fd3ba2:	48 83 63 20 00       	and    QWORD PTR [rbx+0x20],0x0
  fd3ba7:	4c 8d ac 24 e0 00 00 	lea    r13,[rsp+0xe0]
  fd3bae:	00 
  fd3baf:	66 0f ef c0          	pxor   xmm0,xmm0
  fd3bb3:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
  fd3bb9:	66 41 0f 7f 4d 00    	movdqa XMMWORD PTR [r13+0x0],xmm1
  fd3bbf:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
  fd3bc4:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  fd3bcb:	00 
  fd3bcc:	48 89 de             	mov    rsi,rbx
  fd3bcf:	31 d2                	xor    edx,edx
  fd3bd1:	e8 9a 2f fd ff       	call   fa6b70 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16df86>
  fd3bd6:	48 89 df             	mov    rdi,rbx
  fd3bd9:	e8 70 fc f3 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
  fd3bde:	4c 89 ef             	mov    rdi,r13
  fd3be1:	e8 96 83 e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd3be6:	4d 85 f6             	test   r14,r14
  fd3be9:	74 0a                	je     fd3bf5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b00b>
  fd3beb:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd3bf0:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd3bf5:	48 8b 9c 24 80 00 00 	mov    rbx,QWORD PTR [rsp+0x80]
  fd3bfc:	00 
  fd3bfd:	4d 89 f5             	mov    r13,r14
  fd3c00:	48 85 db             	test   rbx,rbx
  fd3c03:	0f 84 bc 00 00 00    	je     fd3cc5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b0db>
  fd3c09:	4d 89 fc             	mov    r12,r15
  fd3c0c:	6a 20                	push   0x20
  fd3c0e:	5f                   	pop    rdi
  fd3c0f:	e8 ec a2 81 00       	call   17edf00 <_Znwm@plt>
  fd3c14:	49 89 ef             	mov    r15,rbp
  fd3c17:	48 89 68 10          	mov    QWORD PTR [rax+0x10],rbp
  fd3c1b:	4c 89 f5             	mov    rbp,r14
  fd3c1e:	4c 89 70 18          	mov    QWORD PTR [rax+0x18],r14
  fd3c22:	48 8d 0d fd 58 fd ff 	lea    rcx,[rip+0xfffffffffffd58fd]        # fa9526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17093c>
  fd3c29:	48 89 08             	mov    QWORD PTR [rax],rcx
  fd3c2c:	48 8d 0d 85 bc b6 ff 	lea    rcx,[rip+0xffffffffffb6bc85]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
  fd3c33:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
  fd3c37:	48 89 df             	mov    rdi,rbx
  fd3c3a:	48 89 c6             	mov    rsi,rax
  fd3c3d:	e8 82 5b ef ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
  fd3c42:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
  fd3c49:	00 
  fd3c4a:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
  fd3c4d:	48 8b 5f 08          	mov    rbx,QWORD PTR [rdi+0x8]
  fd3c51:	66 0f ef c0          	pxor   xmm0,xmm0
  fd3c55:	66 0f 7f 07          	movdqa XMMWORD PTR [rdi],xmm0
  fd3c59:	4c 8d ac 24 c0 00 00 	lea    r13,[rsp+0xc0]
  fd3c60:	00 
  fd3c61:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0
  fd3c67:	4c 89 ee             	mov    rsi,r13
  fd3c6a:	e8 ad 5b ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd3c6f:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd3c73:	e8 0e a8 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3c78:	49 83 3e fd          	cmp    QWORD PTR [r14],0xfffffffffffffffd
  fd3c7c:	76 07                	jbe    fd3c85 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b09b>
  fd3c7e:	31 c0                	xor    eax,eax
  fd3c80:	45 31 f6             	xor    r14d,r14d
  fd3c83:	eb 11                	jmp    fd3c96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b0ac>
  fd3c85:	48 85 db             	test   rbx,rbx
  fd3c88:	74 0a                	je     fd3c94 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b0aa>
  fd3c8a:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
  fd3c8f:	48 89 d8             	mov    rax,rbx
  fd3c92:	eb 02                	jmp    fd3c96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b0ac>
  fd3c94:	31 c0                	xor    eax,eax
  fd3c96:	66 48 0f 6e c0       	movq   xmm0,rax
  fd3c9b:	66 49 0f 6e ce       	movq   xmm1,r14
  fd3ca0:	66 0f 6c c8          	punpcklqdq xmm1,xmm0
  fd3ca4:	66 0f 7f 4c 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm1
  fd3caa:	45 31 ed             	xor    r13d,r13d
  fd3cad:	31 ff                	xor    edi,edi
  fd3caf:	e8 d2 a7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3cb4:	48 89 df             	mov    rdi,rbx
  fd3cb7:	e8 ca a7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3cbc:	49 89 ee             	mov    r14,rbp
  fd3cbf:	4c 89 fd             	mov    rbp,r15
  fd3cc2:	4d 89 e7             	mov    r15,r12
  fd3cc5:	4c 89 ef             	mov    rdi,r13
  fd3cc8:	e8 e5 a7 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd3ccd:	48 8d 9c 24 c0 00 00 	lea    rbx,[rsp+0xc0]
  fd3cd4:	00 
  fd3cd5:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  fd3cdc:	00 
  fd3cdd:	48 89 df             	mov    rdi,rbx
  fd3ce0:	e8 4b 76 ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  fd3ce5:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
  fd3ce8:	48 85 ff             	test   rdi,rdi
  fd3ceb:	74 1c                	je     fd3d09 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b11f>
  fd3ced:	48 83 c7 08          	add    rdi,0x8
  fd3cf1:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  fd3cf7:	e8 3a ae b0 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
  fd3cfc:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  fd3d03:	00 
  fd3d04:	e8 c7 0c d5 ff       	call   d249d0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x271970>
  fd3d09:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
  fd3d10:	00 
  fd3d11:	e8 70 a7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3d16:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
  fd3d1c:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
  fd3d23:	e8 5e a7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3d28:	4c 89 f7             	mov    rdi,r14
  fd3d2b:	e8 82 a7 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd3d30:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
  fd3d37:	00 
  fd3d38:	e8 75 a7 ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd3d3d:	48 83 7d 08 00       	cmp    QWORD PTR [rbp+0x8],0x0
  fd3d42:	4c 8b 64 24 38       	mov    r12,QWORD PTR [rsp+0x38]
  fd3d47:	75 2c                	jne    fd3d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b18b>
  fd3d49:	48 83 7d 00 fd       	cmp    QWORD PTR [rbp+0x0],0xfffffffffffffffd
  fd3d4e:	77 25                	ja     fd3d75 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b18b>
  fd3d50:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
  fd3d54:	66 0f ef c0          	pxor   xmm0,xmm0
  fd3d58:	48 8d 9c 24 10 01 00 	lea    rbx,[rsp+0x110]
  fd3d5f:	00 
  fd3d60:	66 0f 7f 03          	movdqa XMMWORD PTR [rbx],xmm0
  fd3d64:	48 89 de             	mov    rsi,rbx
  fd3d67:	e8 b0 5a ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd3d6c:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
  fd3d70:	e8 11 a7 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3d75:	48 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbp
  fd3d7c:	00 
  fd3d7d:	4c                   	rex.WR
  fd3d7e:	89                   	.byte 0x89
  fd3d7f:	b4                   	.byte 0xb4

## Direct callers of fd33xx..fd39xx local family
  fd1de9:	48 89 ac 24 40 0e 00 	mov    QWORD PTR [rsp+0xe40],rbp
  fd1df0:	00 
  fd1df1:	4c 89 b4 24 48 0e 00 	mov    QWORD PTR [rsp+0xe48],r14
  fd1df8:	00 
  fd1df9:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd1dfe:	e9 ec 01 00 00       	jmp    fd1fef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199405>
  fd1e03:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
  fd1e0a:	00 
  fd1e0b:	e8 1e 35 6f 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
  fd1e10:	49 83 c6 08          	add    r14,0x8
  fd1e14:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
  fd1e19:	4c 89 f6             	mov    rsi,r14
  fd1e1c:	4c 89 ea             	mov    rdx,r13
  fd1e1f:	4c 89 e1             	mov    rcx,r12
  fd1e22:	4d 89 f8             	mov    r8,r15
  fd1e25:	e8 f6 15 00 00       	call   fd3420 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a836>
  fd1e2a:	48 89 df             	mov    rdi,rbx
  fd1e2d:	e8 66 33 f4 ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>
  fd1e32:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
  fd1e35:	4c 89 64 24 68       	mov    QWORD PTR [rsp+0x68],r12
  fd1e3a:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]
  fd1e3e:	4c 89 74 24 70       	mov    QWORD PTR [rsp+0x70],r14
  fd1e43:	4d 85 f6             	test   r14,r14
  fd1e46:	74 14                	je     fd1e5c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199272>
  fd1e48:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd1e4d:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd1e52:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd1e57:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd1e5c:	4c 8b 7c 24 50       	mov    r15,QWORD PTR [rsp+0x50]
  fd1e61:	4d 85 ff             	test   r15,r15
  fd1e64:	74 6a                	je     fd1ed0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1992e6>
  fd1e66:	6a 20                	push   0x20
  fd1e68:	5f                   	pop    rdi
  fd1e69:	e8 92 c0 81 00       	call   17edf00 <_Znwm@plt>
  fd1e6e:	4c 89 60 10          	mov    QWORD PTR [rax+0x10],r12
  fd1e72:	4c 89 70 18          	mov    QWORD PTR [rax+0x18],r14
  fd1e76:	48 8d 0d 13 73 f5 ff 	lea    rcx,[rip+0xfffffffffff57313]        # f29190 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf05a6>
  fd1e7d:	48 89 08             	mov    QWORD PTR [rax],rcx
  fd1e80:	48 8d 0d 31 da b6 ff 	lea    rcx,[rip+0xffffffffffb6da31]        # b3f8b8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c858>
  fd1e87:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
--
  fd2250:	e8 5b d8 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd2255:	eb 00                	jmp    fd2257 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19966d>
  fd2257:	48 89 c7             	mov    rdi,rax
  fd225a:	e8 46 78 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd225f:	cc                   	int3
  fd2260:	53                   	push   rbx
  fd2261:	48 8d 05 10 f9 86 00 	lea    rax,[rip+0x86f910]        # 1841b78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13b10>
  fd2268:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd226b:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
  fd226f:	48 8d 05 ea fa 86 00 	lea    rax,[rip+0x86faea]        # 1841d60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13cf8>
  fd2276:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
  fd227a:	48 8b 7f 38          	mov    rdi,QWORD PTR [rdi+0x38]
  fd227e:	e8 03 c2 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd2283:	48 89 df             	mov    rdi,rbx
  fd2286:	5b                   	pop    rbx
  fd2287:	e9 60 11 00 00       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd228c:	53                   	push   rbx
  fd228d:	48 89 fb             	mov    rbx,rdi
  fd2290:	e8 cb ff ff ff       	call   fd2260 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199676>
  fd2295:	48 89 df             	mov    rdi,rbx
  fd2298:	5b                   	pop    rbx
  fd2299:	e9 82 bc 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd229e:	55                   	push   rbp
  fd229f:	41 57                	push   r15
  fd22a1:	41 56                	push   r14
  fd22a3:	41 55                	push   r13
  fd22a5:	41 54                	push   r12
  fd22a7:	53                   	push   rbx
  fd22a8:	48 81 ec 98 00 00 00 	sub    rsp,0x98
  fd22af:	49 89 cd             	mov    r13,rcx
  fd22b2:	89 d5                	mov    ebp,edx
  fd22b4:	48 89 fb             	mov    rbx,rdi
  fd22b7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd22be:	00 00 
  fd22c0:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  fd22c7:	00 
  fd22c8:	48 83 c6 10          	add    rsi,0x10
  fd22cc:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
  fd22d1:	e8 84 9b cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd22d6:	0f 57 c0             	xorps  xmm0,xmm0
--
  fd32e9:	48 89 df             	mov    rdi,rbx
  fd32ec:	e8 8b 8c e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd32f1:	49 8b 47 10          	mov    rax,QWORD PTR [r15+0x10]
  fd32f5:	49 8b 4c 24 38       	mov    rcx,QWORD PTR [r12+0x38]
  fd32fa:	4c 8b 6d 10          	mov    r13,QWORD PTR [rbp+0x10]
  fd32fe:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
  fd3303:	0f 28 45 00          	movaps xmm0,XMMWORD PTR [rbp+0x0]
  fd3307:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  fd330c:	0f 57 c0             	xorps  xmm0,xmm0
  fd330f:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0
  fd3313:	48 39 c8             	cmp    rax,rcx
  fd3316:	74 0f                	je     fd3327 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a73d>
  fd3318:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fd331d:	4c 89 fe             	mov    rsi,r15
  fd3320:	e8 93 fb b1 ff       	call   af2eb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x3fe58>
  fd3325:	eb 2f                	jmp    fd3356 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a76c>
  fd3327:	49 8b 4c 24 40       	mov    rcx,QWORD PTR [r12+0x40]
  fd332c:	48 85 c9             	test   rcx,rcx
  fd332f:	74 0a                	je     fd333b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a751>
  fd3331:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd3336:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
  fd333b:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  fd3340:	48 89 4c 24 28       	mov    QWORD PTR [rsp+0x28],rcx
  fd3345:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  fd334a:	48 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],rcx
  fd334f:	31 ff                	xor    edi,edi
  fd3351:	e8 30 b1 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3356:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  fd335b:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
  fd3360:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  fd3365:	0f 11 43 20          	movups XMMWORD PTR [rbx+0x20],xmm0
  fd3369:	4c 89 6b 30          	mov    QWORD PTR [rbx+0x30],r13
  fd336d:	0f 57 c0             	xorps  xmm0,xmm0
  fd3370:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
  fd3373:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
  fd3378:	e8 ff 8b e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd337d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  fd3384:	00 
  fd3385:	e8 f2 8b e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd338a:	0f b6 54 24 0c       	movzx  edx,BYTE PTR [rsp+0xc]
--
  fd33e3:	48 89 df             	mov    rdi,rbx
  fd33e6:	e8 ba 66 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd33eb:	cc                   	int3
  fd33ec:	53                   	push   rbx
  fd33ed:	48 89 fb             	mov    rbx,rdi
  fd33f0:	48 8d 05 91 e9 86 00 	lea    rax,[rip+0x86e991]        # 1841d88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13d20>
  fd33f7:	48 89 07             	mov    QWORD PTR [rdi],rax
  fd33fa:	48 8b 7f 20          	mov    rdi,QWORD PTR [rdi+0x20]
  fd33fe:	e8 83 b0 ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3403:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
  fd3407:	5b                   	pop    rbx
  fd3408:	e9 a5 b0 ac ff       	jmp    a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd340d:	cc                   	int3
  fd340e:	53                   	push   rbx
  fd340f:	48 89 fb             	mov    rbx,rdi
  fd3412:	e8 d5 ff ff ff       	call   fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd3417:	48 89 df             	mov    rdi,rbx
  fd341a:	5b                   	pop    rbx
  fd341b:	e9 00 ab 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd3420:	55                   	push   rbp
  fd3421:	41 57                	push   r15
  fd3423:	41 56                	push   r14
  fd3425:	41 55                	push   r13
  fd3427:	41 54                	push   r12
  fd3429:	53                   	push   rbx
  fd342a:	48 81 ec e8 0c 00 00 	sub    rsp,0xce8
  fd3431:	4d 89 c6             	mov    r14,r8
  fd3434:	49 89 cf             	mov    r15,rcx
  fd3437:	49 89 d4             	mov    r12,rdx
  fd343a:	48 89 fb             	mov    rbx,rdi
  fd343d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3444:	00 00 
  fd3446:	48 89 84 24 e0 0c 00 	mov    QWORD PTR [rsp+0xce0],rax
  fd344d:	00 
  fd344e:	48 83 c6 08          	add    rsi,0x8
  fd3452:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fd3457:	e8 fe 89 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd345c:	0f 57 c0             	xorps  xmm0,xmm0
  fd345f:	48 89 e2             	mov    rdx,rsp
  fd3462:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
--
  fd34b1:	4c 89 ee             	mov    rsi,r13
  fd34b4:	4c 89 f9             	mov    rcx,r15
  fd34b7:	4d 89 f0             	mov    r8,r14
  fd34ba:	ff d5                	call   rbp
  fd34bc:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  fd34c1:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  fd34c6:	4c 8d 74 24 78       	lea    r14,[rsp+0x78]
  fd34cb:	31 d2                	xor    edx,edx
  fd34cd:	4c 89 f1             	mov    rcx,r14
  fd34d0:	e8 c7 ef ff ff       	call   fd249c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1998b2>
  fd34d5:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fd34d9:	e8 a8 af ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd34de:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
  fd34e5:	00 
  fd34e6:	e8 df 3d 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  fd34eb:	eb 0f                	jmp    fd34fc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a912>
  fd34ed:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
  fd34f2:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
  fd34f7:	e8 9e fc ff ff       	call   fd319a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a5b0>
  fd34fc:	4c 8d 74 24 68       	lea    r14,[rsp+0x68]
  fd3501:	48 89 df             	mov    rdi,rbx
  fd3504:	4c 89 f6             	mov    rsi,r14
  fd3507:	e8 ae 25 f4 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fd350c:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fd3510:	e8 71 af ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3515:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  fd351a:	e8 f3 1d f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
  fd351f:	48 89 e7             	mov    rdi,rsp
  fd3522:	e8 55 8a e3 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fd3527:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fd352c:	e8 55 af ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3531:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3538:	00 00 
  fd353a:	48 3b 84 24 e0 0c 00 	cmp    rax,QWORD PTR [rsp+0xce0]
  fd3541:	00 
  fd3542:	75 12                	jne    fd3556 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a96c>
  fd3544:	48 81 c4 e8 0c 00 00 	add    rsp,0xce8
  fd354b:	5b                   	pop    rbx
  fd354c:	41 5c                	pop    r12
  fd354e:	41 5d                	pop    r13
  fd3550:	41 5e                	pop    r14
  fd3552:	41 5f                	pop    r15
  fd3554:	5d                   	pop    rbp
  fd3555:	c3                   	ret
  fd3556:	e8 55 c5 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd355b:	eb 00                	jmp    fd355d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a973>
  fd355d:	48 89 c7             	mov    rdi,rax
  fd3560:	e8 40 65 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd3565:	cc                   	int3
  fd3566:	55                   	push   rbp
  fd3567:	41 57                	push   r15
  fd3569:	41 56                	push   r14
  fd356b:	41 55                	push   r13
  fd356d:	41 54                	push   r12
  fd356f:	53                   	push   rbx
  fd3570:	48 81 ec c8 0c 00 00 	sub    rsp,0xcc8
  fd3577:	89 d5                	mov    ebp,edx
  fd3579:	49 89 f7             	mov    r15,rsi
  fd357c:	49 89 fe             	mov    r14,rdi
  fd357f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3586:	00 00 
  fd3588:	48 89 84 24 c0 0c 00 	mov    QWORD PTR [rsp+0xcc0],rax
  fd358f:	00 
  fd3590:	48 8d 77 10          	lea    rsi,[rdi+0x10]
  fd3594:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
  fd3599:	48 89 df             	mov    rdi,rbx
  fd359c:	e8 8f 7d ad ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
  fd35a1:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
  fd35a4:	48 85 db             	test   rbx,rbx
  fd35a7:	0f 84 d3 01 00 00    	je     fd3780 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab96>
--
  fd3614:	e8 d7 3c 69 00       	call   16672f0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b45c>
  fd3619:	45 84 e4             	test   r12b,r12b
  fd361c:	74 12                	je     fd3630 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aa46>
  fd361e:	48 8d bc 24 a0 05 00 	lea    rdi,[rsp+0x5a0]
  fd3625:	00 
  fd3626:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
  fd362b:	e8 30 4b b7 ff       	call   b48160 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x95100>
  fd3630:	49 8b b6 e8 0d 00 00 	mov    rsi,QWORD PTR [r14+0xde8]
  fd3637:	48 83 c6 08          	add    rsi,0x8
  fd363b:	49 8d 8e 78 0c 00 00 	lea    rcx,[r14+0xc78]
  fd3642:	4d 8d 86 c8 0c 00 00 	lea    r8,[r14+0xcc8]
  fd3649:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
  fd364e:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
  fd3653:	4c 89 ff             	mov    rdi,r15
  fd3656:	4c 89 e2             	mov    rdx,r12
  fd3659:	e8 c2 fd ff ff       	call   fd3420 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a836>
  fd365e:	4c 89 e7             	mov    rdi,r12
  fd3661:	e8 64 3c 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  fd3666:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fd366b:	4c 89 fe             	mov    rsi,r15
  fd366e:	e8 c5 ef ff ff       	call   fd2638 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199a4e>
  fd3673:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd3677:	e8 0a ae ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd367c:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  fd3681:	e8 aa 36 ad ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  fd3686:	41 0f 10 46 10       	movups xmm0,XMMWORD PTR [r14+0x10]
  fd368b:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
  fd368f:	4d 8b 76 18          	mov    r14,QWORD PTR [r14+0x18]
  fd3693:	4d 85 f6             	test   r14,r14
  fd3696:	74 05                	je     fd369d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aab3>
  fd3698:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fd369d:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
  fd36a2:	4d 85 ff             	test   r15,r15
  fd36a5:	74 75                	je     fd371c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab32>
  fd36a7:	6a 28                	push   0x28
  fd36a9:	5f                   	pop    rdi
  fd36aa:	e8 51 a8 81 00       	call   17edf00 <_Znwm@plt>
  fd36af:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
  fd36b3:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
  fd36b7:	4d 85 f6             	test   r14,r14
--
  fd36e0:	e8 df 60 ef ff       	call   ec97c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x90bda>
  fd36e5:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fd36ea:	4c 8b 67 08          	mov    r12,QWORD PTR [rdi+0x8]
  fd36ee:	0f 57 c0             	xorps  xmm0,xmm0
  fd36f1:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
  fd36f4:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]
  fd36f9:	41 0f 29 45 00       	movaps XMMWORD PTR [r13+0x0],xmm0
  fd36fe:	4c 89 ee             	mov    rsi,r13
  fd3701:	e8 16 61 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd3706:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fd370a:	e8 77 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd370f:	49 83 3f fd          	cmp    QWORD PTR [r15],0xfffffffffffffffd
  fd3713:	76 11                	jbe    fd3726 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab3c>
  fd3715:	31 c0                	xor    eax,eax
  fd3717:	45 31 ff             	xor    r15d,r15d
  fd371a:	eb 1c                	jmp    fd3738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab4e>
  fd371c:	0f 57 c0             	xorps  xmm0,xmm0
  fd371f:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
  fd3724:	eb 2b                	jmp    fd3751 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab67>
  fd3726:	4d 85 e4             	test   r12,r12
  fd3729:	74 0b                	je     fd3736 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab4c>
  fd372b:	f0 49 ff 44 24 08    	lock inc QWORD PTR [r12+0x8]
  fd3731:	4c 89 e0             	mov    rax,r12
  fd3734:	eb 02                	jmp    fd3738 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ab4e>
  fd3736:	31 c0                	xor    eax,eax
  fd3738:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
  fd373d:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
  fd3742:	31 ff                	xor    edi,edi
  fd3744:	e8 3d ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3749:	4c 89 e7             	mov    rdi,r12
  fd374c:	e8 35 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3751:	48 83 c3 18          	add    rbx,0x18
  fd3755:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
  fd375a:	48 89 df             	mov    rdi,rbx
  fd375d:	4c 89 fe             	mov    rsi,r15
  fd3760:	e8 b7 60 ae ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fd3765:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fd3769:	e8 18 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd376e:	4c 89 f7             	mov    rdi,r14
  fd3771:	e8 3c ad ac ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fd3776:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fd377b:	e8 06 ad ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd3780:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  fd3785:	e8 fc ac ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd378a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3791:	00 00 
  fd3793:	48 3b 84 24 c0 0c 00 	cmp    rax,QWORD PTR [rsp+0xcc0]
  fd379a:	00 
  fd379b:	75 12                	jne    fd37af <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19abc5>
  fd379d:	48 81 c4 c8 0c 00 00 	add    rsp,0xcc8
  fd37a4:	5b                   	pop    rbx
  fd37a5:	41 5c                	pop    r12
  fd37a7:	41 5d                	pop    r13
  fd37a9:	41 5e                	pop    r14
  fd37ab:	41 5f                	pop    r15
  fd37ad:	5d                   	pop    rbp
  fd37ae:	c3                   	ret
  fd37af:	e8 fc c2 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd37b4:	48 89 c7             	mov    rdi,rax
  fd37b7:	e8 e9 62 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd37bc:	48 89 c3             	mov    rbx,rax
  fd37bf:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
  fd37c4:	e8 01 3b 69 00       	call   16672ca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b436>
  fd37c9:	eb 03                	jmp    fd37ce <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19abe4>
  fd37cb:	48 89 c3             	mov    rbx,rax
  fd37ce:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
  fd37d3:	e8 58 35 ad ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
  fd37d8:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  fd37dd:	e8 a4 ac ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fd37e2:	48 89 df             	mov    rdi,rbx
  fd37e5:	e8 bb 62 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fd37ea:	48 83 c7 08          	add    rdi,0x8
  fd37ee:	e9 f9 fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd37f3:	cc                   	int3
  fd37f4:	53                   	push   rbx
  fd37f5:	48 89 fb             	mov    rbx,rdi
  fd37f8:	48 83 c7 08          	add    rdi,0x8
  fd37fc:	e8 eb fb ff ff       	call   fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd3801:	48 89 df             	mov    rdi,rbx
  fd3804:	5b                   	pop    rbx
  fd3805:	e9 16 a7 81 00       	jmp    17edf20 <_ZdlPv@plt>
  fd380a:	e9 dd fb ff ff       	jmp    fd33ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a802>
  fd380f:	cc                   	int3
  fd3810:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
  fd3814:	e9 db ff ff ff       	jmp    fd37f4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac0a>
  fd3819:	cc                   	int3
  fd381a:	41 56                	push   r14
  fd381c:	53                   	push   rbx
  fd381d:	48 83 ec 28          	sub    rsp,0x28
  fd3821:	49 89 f6             	mov    r14,rsi
  fd3824:	48 89 fb             	mov    rbx,rdi
  fd3827:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd382e:	00 00 
  fd3830:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  fd3835:	48 8b 76 20          	mov    rsi,QWORD PTR [rsi+0x20]
  fd3839:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fd383c:	ff 50 70             	call   QWORD PTR [rax+0x70]
  fd383f:	41 80 7e 68 00       	cmp    BYTE PTR [r14+0x68],0x0
  fd3844:	74 3c                	je     fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
  fd3846:	49 8b 7e 40          	mov    rdi,QWORD PTR [r14+0x40]
  fd384a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd384d:	ff 90 40 01 00 00    	call   QWORD PTR [rax+0x140]
  fd3853:	85 c0                	test   eax,eax
  fd3855:	75 2b                	jne    fd3882 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ac98>
  fd3857:	48 8d 35 2c 38 37 ff 	lea    rsi,[rip+0xffffffffff37382c]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
  fd385e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd3863:	6a 07                	push   0x7
  fd3865:	5a                   	pop    rdx
  fd3866:	e8 af 91 ac ff       	call   a9ca1a <JNI_OnUnload@@Base+0x242e7>
--
  fd3873:	e8 b4 01 d5 ff       	call   d23a2c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2709cc>
  fd3878:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd387d:	e8 0e a6 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fd3882:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd3889:	00 00 
  fd388b:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fd3890:	75 3f                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
  fd3892:	48 89 d8             	mov    rax,rbx
  fd3895:	48 83 c4 28          	add    rsp,0x28
  fd3899:	5b                   	pop    rbx
  fd389a:	41 5e                	pop    r14
  fd389c:	c3                   	ret
  fd389d:	49 89 c6             	mov    r14,rax
  fd38a0:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fd38a5:	e8 e6 a5 81 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  fd38aa:	eb 05                	jmp    fd38b1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc7>
  fd38ac:	eb 00                	jmp    fd38ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19acc4>
  fd38ae:	49 89 c6             	mov    r14,rax
  fd38b1:	48 89 df             	mov    rdi,rbx
  fd38b4:	e8 ad ed b0 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
  fd38b9:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38c0:	00 00 
  fd38c2:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fd38c7:	75 08                	jne    fd38d1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ace7>
  fd38c9:	4c 89 f7             	mov    rdi,r14
  fd38cc:	e8 ff c3 a9 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
  fd38d1:	e8 da c1 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd38d6:	41 57                	push   r15
  fd38d8:	41 56                	push   r14
  fd38da:	41 55                	push   r13
  fd38dc:	41 54                	push   r12
  fd38de:	53                   	push   rbx
  fd38df:	48 83 ec 20          	sub    rsp,0x20
  fd38e3:	49 89 ce             	mov    r14,rcx
  fd38e6:	49 89 d7             	mov    r15,rdx
  fd38e9:	49 89 f4             	mov    r12,rsi
  fd38ec:	48 89 fb             	mov    rbx,rdi
  fd38ef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd38f6:	00 00 
  fd38f8:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  fd38fd:	48 89 d7             	mov    rdi,rdx
--
  fd397e:	c3                   	ret
  fd397f:	41 80 7c 24 68 00    	cmp    BYTE PTR [r12+0x68],0x0
  fd3985:	74 a9                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3987:	41 80 7e 60 00       	cmp    BYTE PTR [r14+0x60],0x0
  fd398c:	74 a2                	je     fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd398e:	49 8b 46 58          	mov    rax,QWORD PTR [r14+0x58]
  fd3992:	49 3b 44 24 58       	cmp    rax,QWORD PTR [r12+0x58]
  fd3997:	7e 97                	jle    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd3999:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
  fd399e:	48 39 f0             	cmp    rax,rsi
  fd39a1:	7d 8d                	jge    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39a3:	49 8b 7c 24 30       	mov    rdi,QWORD PTR [r12+0x30]
  fd39a8:	48 ff c6             	inc    rsi
  fd39ab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  fd39ae:	ff 50 20             	call   QWORD PTR [rax+0x20]
  fd39b1:	e9 7a ff ff ff       	jmp    fd3930 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ad46>
  fd39b6:	e8 f5 c0 81 00       	call   17efab0 <__stack_chk_fail@plt>
  fd39bb:	cc                   	int3
  fd39bc:	55                   	push   rbp
  fd39bd:	41 57                	push   r15
  fd39bf:	41 56                	push   r14
  fd39c1:	41 55                	push   r13
  fd39c3:	41 54                	push   r12
  fd39c5:	53                   	push   rbx
  fd39c6:	48 81 ec 58 01 00 00 	sub    rsp,0x158
  fd39cd:	49 89 f4             	mov    r12,rsi
  fd39d0:	49 89 ff             	mov    r15,rdi
  fd39d3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fd39da:	00 00 
  fd39dc:	48 89 84 24 50 01 00 	mov    QWORD PTR [rsp+0x150],rax
  fd39e3:	00 
  fd39e4:	48 8d 5e 10          	lea    rbx,[rsi+0x10]
  fd39e8:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
  fd39ef:	00 
  fd39f0:	48 89 de             	mov    rsi,rbx
  fd39f3:	e8 62 84 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
  fd39f8:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  fd39ff:	00 
  fd3a00:	48 89 de             	mov    rsi,rbx
  fd3a03:	e8 52 84 cb ff       	call   c8be5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1d8dfa>
