# Fast service184 weak-node field writers

## +0xa0 stores in 0x1300000..0x1360000
2590366: 1301c5d:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
2594663: 1305b7e:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
2594673: 1305ba9:	48 8b 93 a0 00 00 00 	mov    rdx,QWORD PTR [rbx+0xa0]
2598065: 1308b51:	4c 89 ac 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r13
2598076: 1308b7e:	0f 10 84 24 a0 00 00 	movups xmm0,XMMWORD PTR [rsp+0xa0]
2598618: 13092d2:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
2599845: 130a404:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
2599955: 130a5a9:	88 87 a0 00 00 00    	mov    BYTE PTR [rdi+0xa0],al
2600038: 130a711:	4c 8b bc 24 a0 00 00 	mov    r15,QWORD PTR [rsp+0xa0]
2607206: 1310e6c:	0f 28 94 24 a0 00 00 	movaps xmm2,XMMWORD PTR [rsp+0xa0]
2607210: 1310e7c:	0f 29 8c 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm1
2614231: 1317692:	c6 86 a0 00 00 00 00 	mov    BYTE PTR [rsi+0xa0],0x0
2614306: 13177ae:	0f b6 8c 24 a0 00 00 	movzx  ecx,BYTE PTR [rsp+0xa0]
2614470: 13179c6:	41 88 af a0 00 00 00 	mov    BYTE PTR [r15+0xa0],bpl
2614928: 1317ff9:	0f b6 83 a0 00 00 00 	movzx  eax,BYTE PTR [rbx+0xa0]
2615085: 13181fa:	41 8a 8e a0 00 00 00 	mov    cl,BYTE PTR [r14+0xa0]
2615134: 1318288:	41 88 ac 24 a0 00 00 	mov    BYTE PTR [r12+0xa0],bpl
2615793: 1318bd7:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2616686: 13198d3:	41 0f 11 86 a0 00 00 	movups XMMWORD PTR [r14+0xa0],xmm0
2617186: 131a088:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2617213: 131a0e8:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2620769: 131d38a:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
2621387: 131dc8f:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
2621529: 131de8b:	48 8b b8 a0 00 00 00 	mov    rdi,QWORD PTR [rax+0xa0]
2622222: 131e835:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
2624468: 1320821:	8b b9 a0 00 00 00    	mov    edi,DWORD PTR [rcx+0xa0]
2626472: 13223d3:	66 0f 7f 84 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm0
2626993: 1322b80:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
2626996: 1322b8c:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
2629747: 1325103:	4c 8b b3 a0 00 00 00 	mov    r14,QWORD PTR [rbx+0xa0]
2629809: 13251fa:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2642098: 132fc9c:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
2644593: 1331eda:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
2645252: 133288d:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
2645681: 1332f72:	48 8b 83 a0 00 00 00 	mov    rax,QWORD PTR [rbx+0xa0]
2645701: 1332fc3:	48 8b 80 a0 00 00 00 	mov    rax,QWORD PTR [rax+0xa0]
2646144: 133373f:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
2646814: 1334246:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
2647298: 13349e9:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
2647803: 13350db:	41 0f 11 85 a0 00 00 	movups XMMWORD PTR [r13+0xa0],xmm0
2648883: 1335edc:	4d 8b bf a0 00 00 00 	mov    r15,QWORD PTR [r15+0xa0]
2649146: 133627f:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2650817: 133798a:	0f 11 87 a0 00 00 00 	movups XMMWORD PTR [rdi+0xa0],xmm0
2652050: 1338bf4:	48 8b 87 a0 00 00 00 	mov    rax,QWORD PTR [rdi+0xa0]
2652074: 1338c45:	48 8b 87 a0 00 00 00 	mov    rax,QWORD PTR [rdi+0xa0]
2652477: 13391c9:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
2652640: 13394b7:	49 89 87 a0 00 00 00 	mov    QWORD PTR [r15+0xa0],rax
2654067: 133a87c:	48 8b 8f a0 00 00 00 	mov    rcx,QWORD PTR [rdi+0xa0]
2654388: 133acee:	48 8b 9c 24 a0 00 00 	mov    rbx,QWORD PTR [rsp+0xa0]
2654427: 133ad93:	48 8b 9c 24 a0 00 00 	mov    rbx,QWORD PTR [rsp+0xa0]
2656527: 133cb5a:	4c 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r15
2657401: 133d7aa:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
2657405: 133d7b9:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
2657822: 133dd68:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
2658901: 133ece5:	8b 84 24 a0 00 00 00 	mov    eax,DWORD PTR [rsp+0xa0]
2659003: 133ee76:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
2659012: 133ee95:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
2659639: 133f7c4:	8b 94 24 a0 00 00 00 	mov    edx,DWORD PTR [rsp+0xa0]
2662321: 1341e19:	88 8e a0 00 00 00    	mov    BYTE PTR [rsi+0xa0],cl
2665688: 1344e05:	48 8b 8b a0 00 00 00 	mov    rcx,QWORD PTR [rbx+0xa0]
2665745: 1344ee5:	48 8b bf a0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xa0]
2665787: 1344f85:	49 8b 95 a0 00 00 00 	mov    rdx,QWORD PTR [r13+0xa0]
2665823: 134501d:	0f 10 82 a0 00 00 00 	movups xmm0,XMMWORD PTR [rdx+0xa0]
2665824: 1345024:	4c 89 a2 a0 00 00 00 	mov    QWORD PTR [rdx+0xa0],r12
2673208: 134b625:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
2673276: 134b72b:	41 88 86 a0 00 00 00 	mov    BYTE PTR [r14+0xa0],al
2674142: 134c3b3:	41 89 87 a0 00 00 00 	mov    DWORD PTR [r15+0xa0],eax
2677475: 134f345:	44 8b 8c 24 a0 00 00 	mov    r9d,DWORD PTR [rsp+0xa0]
2677585: 134f4da:	88 84 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],al
2677605: 134f531:	88 94 24 a0 00 00 00 	mov    BYTE PTR [rsp+0xa0],dl
2681690: 1352e4d:	66 0f 7f 84 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm0
2681796: 1352fe8:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
2681804: 1353008:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
2683061: 1354156:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2683913: 1354dce:	48 89 83 a0 00 00 00 	mov    QWORD PTR [rbx+0xa0],rax
2684334: 13553eb:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2686138: 1356dc3:	41 8b 87 a0 00 00 00 	mov    eax,DWORD PTR [r15+0xa0]
2686139: 1356dca:	89 83 a0 00 00 00    	mov    DWORD PTR [rbx+0xa0],eax
2686586: 1357422:	48 8b 86 a0 00 00 00 	mov    rax,QWORD PTR [rsi+0xa0]
2686587: 1357429:	48 89 87 a0 00 00 00 	mov    QWORD PTR [rdi+0xa0],rax
2686776: 1357719:	8b 86 a0 00 00 00    	mov    eax,DWORD PTR [rsi+0xa0]
2686777: 135771f:	89 87 a0 00 00 00    	mov    DWORD PTR [rdi+0xa0],eax
2687022: 1357a36:	8b 83 a0 00 00 00    	mov    eax,DWORD PTR [rbx+0xa0]
2687023: 1357a3c:	41 89 86 a0 00 00 00 	mov    DWORD PTR [r14+0xa0],eax
2687869: 13585d6:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2690279: 135a7be:	4c 89 a4 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],r12
2691489: 135bad7:	48 8b ac 24 a0 00 00 	mov    rbp,QWORD PTR [rsp+0xa0]
2692519: 135ca2c:	49 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [r12+0xa0]
2692729: 135cd71:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
2692949: 135d0c4:	f3 0f 7f 87 a0 00 00 	movdqu XMMWORD PTR [rdi+0xa0],xmm0
2692986: 135d16b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
2694152: 135e4b8:	66 41 0f 6f 87 a0 00 	movdqa xmm0,XMMWORD PTR [r15+0xa0]
2694205: 135e5b6:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
2694688: 135ed66:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
2694751: 135ee64:	c7 83 a0 00 00 00 00 	mov    DWORD PTR [rbx+0xa0],0x3f800000
2694768: 135eeab:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
2695029: 135f2a3:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
2695173: 135f4fd:	41 0f 29 8e a0 00 00 	movaps XMMWORD PTR [r14+0xa0],xmm1
2695765: 135ff37:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]

## +0xa8 stores in 0x1300000..0x1360000
2590930: 13024f2:	41 0f 11 86 a8 00 00 	movups XMMWORD PTR [r14+0xa8],xmm0
2592307: 1303922:	f3 0f 11 84 24 a8 00 	movss  DWORD PTR [rsp+0xa8],xmm0
2596149: 1306f65:	48 8b 94 24 a8 00 00 	mov    rdx,QWORD PTR [rsp+0xa8]
2596310: 13071bc:	48 8b 94 24 a8 00 00 	mov    rdx,QWORD PTR [rsp+0xa8]
2597072: 1307cf1:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2597112: 1307d89:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2598067: 1308b59:	48 89 ac 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbp
2611311: 1314b5b:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
2611339: 1314bca:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
2611354: 1314c05:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
2611357: 1314c0f:	4c 89 b4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r14
2611414: 1314cea:	4c 89 b4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r14
2611452: 1314d8d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
2613392: 1316a03:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
2613395: 1316a0e:	4c 89 b4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r14
2614310: 13177bb:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
2615126: 1318269:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2616651: 1319834:	4c 8b bb a8 00 00 00 	mov    r15,QWORD PTR [rbx+0xa8]
2616712: 1319942:	4c 8b bb a8 00 00 00 	mov    r15,QWORD PTR [rbx+0xa8]
2616750: 13199f8:	4c 8b ab a8 00 00 00 	mov    r13,QWORD PTR [rbx+0xa8]
2616784: 1319a94:	4c 8b ab a8 00 00 00 	mov    r13,QWORD PTR [rbx+0xa8]
2616826: 1319b51:	4c 8b bb a8 00 00 00 	mov    r15,QWORD PTR [rbx+0xa8]
2620771: 131d392:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
2621389: 131dc97:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
2622224: 131e83d:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
2623793: 131fda8:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
2623803: 131fdd2:	48 89 b8 a8 00 00 00 	mov    QWORD PTR [rax+0xa8],rdi
2624467: 132081a:	48 8b b1 a8 00 00 00 	mov    rsi,QWORD PTR [rcx+0xa8]
2626013: 1321d4e:	0f b6 8b a8 00 00 00 	movzx  ecx,BYTE PTR [rbx+0xa8]
2626795: 13228d3:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
2629748: 132510a:	4c 8b bb a8 00 00 00 	mov    r15,QWORD PTR [rbx+0xa8]
2629813: 132520a:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2630629: 1325d84:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
2630644: 1325dc4:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
2638293: 132cd77:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
2642104: 132fcbb:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
2644093: 133172f:	48 63 8b a8 00 00 00 	movsxd rcx,DWORD PTR [rbx+0xa8]
2644329: 1331a7d:	41 8b 86 a8 00 00 00 	mov    eax,DWORD PTR [r14+0xa8]
2644498: 1331d2b:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2645250: 1332885:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
2645674: 1332f59:	48 8b b8 a8 00 00 00 	mov    rdi,QWORD PTR [rax+0xa8]
2645891: 13332ee:	41 8b 84 24 a8 00 00 	mov    eax,DWORD PTR [r12+0xa8]
2646128: 13336ef:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
2646604: 1333ed9:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
2647310: 1334a1d:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
2651015: 1337c4f:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
2652642: 13394c3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
2653748: 133a40c:	48 8b 87 a8 00 00 00 	mov    rax,QWORD PTR [rdi+0xa8]
2654068: 133a883:	48 8b 87 a8 00 00 00 	mov    rax,QWORD PTR [rdi+0xa8]
2654214: 133aa52:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
2654260: 133ab0a:	4c 8b 84 24 a8 00 00 	mov    r8,QWORD PTR [rsp+0xa8]
2654311: 133abd5:	c6 83 a8 00 00 00 00 	mov    BYTE PTR [rbx+0xa8],0x0
2654324: 133ac0f:	c6 83 a8 00 00 00 01 	mov    BYTE PTR [rbx+0xa8],0x1
2654386: 133ace6:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
2654429: 133ad9b:	4c 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [rsp+0xa8]
2656991: 133d1f8:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
2657837: 133ddaf:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
2659029: 133eecc:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
2659423: 133f4c8:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
2659460: 133f554:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2661175: 1340d41:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
2662322: 1341e1f:	88 86 a8 00 00 00    	mov    BYTE PTR [rsi+0xa8],al
2665689: 1344e0c:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
2665735: 1344eb7:	4c 8b b7 a8 00 00 00 	mov    r14,QWORD PTR [rdi+0xa8]
2665797: 1344fb2:	49 8b 85 a8 00 00 00 	mov    rax,QWORD PTR [r13+0xa8]
2665825: 134502b:	4c 89 ba a8 00 00 00 	mov    QWORD PTR [rdx+0xa8],r15
2665882: 1345107:	48 89 98 a8 00 00 00 	mov    QWORD PTR [rax+0xa8],rbx
2665907: 1345169:	48 89 91 a8 00 00 00 	mov    QWORD PTR [rcx+0xa8],rdx
2668510: 13475fd:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
2671934: 134a4f8:	48 8b bf a8 00 00 00 	mov    rdi,QWORD PTR [rdi+0xa8]
2674264: 134c594:	41 89 8f a8 00 00 00 	mov    DWORD PTR [r15+0xa8],ecx
2676506: 134e5fd:	0f 11 83 a8 00 00 00 	movups XMMWORD PTR [rbx+0xa8],xmm0
2677586: 134f4e1:	88 84 24 a8 00 00 00 	mov    BYTE PTR [rsp+0xa8],al
2677608: 134f540:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2679006: 1350912:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
2679058: 13509d1:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
2681745: 1352f1d:	4c 89 a4 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r12
2682019: 1353372:	4c 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],r15
2683915: 1354dd8:	88 83 a8 00 00 00    	mov    BYTE PTR [rbx+0xa8],al
2685507: 13564db:	49 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [r12+0xa8]
2685509: 13564e3:	49 89 87 a8 00 00 00 	mov    QWORD PTR [r15+0xa8],rax
2685727: 13567fe:	41 0f 10 87 a8 00 00 	movups xmm0,XMMWORD PTR [r15+0xa8]
2685732: 1356815:	0f 11 83 a8 00 00 00 	movups XMMWORD PTR [rbx+0xa8],xmm0
2686053: 1356c7e:	49 8b 87 a8 00 00 00 	mov    rax,QWORD PTR [r15+0xa8]
2686054: 1356c85:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
2686415: 1357192:	49 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [r14+0xa8]
2686416: 1357199:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
2686593: 135744d:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
2686594: 1357454:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
2686778: 1357725:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
2686781: 1357734:	48 8b 86 a8 00 00 00 	mov    rax,QWORD PTR [rsi+0xa8]
2686782: 135773b:	48 89 87 a8 00 00 00 	mov    QWORD PTR [rdi+0xa8],rax
2686789: 1357766:	0f 11 86 a8 00 00 00 	movups XMMWORD PTR [rsi+0xa8],xmm0
2687087: 1357b33:	8b 83 a8 00 00 00    	mov    eax,DWORD PTR [rbx+0xa8]
2687088: 1357b39:	41 89 86 a8 00 00 00 	mov    DWORD PTR [r14+0xa8],eax
2687236: 1357d8e:	0f 10 83 a8 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xa8]
2687240: 1357da4:	41 0f 11 86 a8 00 00 	movups XMMWORD PTR [r14+0xa8],xmm0
2688077: 13588c3:	0f b6 b3 a8 00 00 00 	movzx  esi,BYTE PTR [rbx+0xa8]
2688236: 1358b14:	41 0f b6 b6 a8 00 00 	movzx  esi,BYTE PTR [r14+0xa8]
2689883: 135a2ce:	48 8b 83 a8 00 00 00 	mov    rax,QWORD PTR [rbx+0xa8]
2690440: 135aa3e:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2690947: 135b2a9:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
2692725: 135cd61:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
2692983: 135d15c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
2694209: 135e5c6:	49 89 84 24 a8 00 00 	mov    QWORD PTR [r12+0xa8],rax
2694243: 135e654:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
2694273: 135e6ce:	4d 8b b4 24 a8 00 00 	mov    r14,QWORD PTR [r12+0xa8]
2694692: 135ed73:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
2694705: 135edad:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
2694755: 135ee71:	48 89 83 a8 00 00 00 	mov    QWORD PTR [rbx+0xa8],rax
2695022: 135f288:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
2695732: 135feb5:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]

## Context around exact paired writer candidates
1310:  9d7f48:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7
13484:  9e2394:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
13564:  9e24c0:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1300005:  e65fb9:	41 0f 10 87 a8 00 00 	movups xmm0,XMMWORD PTR [r15+0xa8]
1301228:  e6725e:	41 8b 86 a8 00 00 00 	mov    eax,DWORD PTR [r14+0xa8]
1301229:  e67265:	89 85 a8 00 00 00    	mov    DWORD PTR [rbp+0xa8],eax
1304410:  e6a4cb:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1306918:  e6cc2c:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
1310806:  e70487:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
1310815:  e704aa:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
1311286:  e70ada:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
1311359:  e70bd5:	88 8f a0 00 00 00    	mov    BYTE PTR [rdi+0xa0],cl
1311858:  e713ff:	0f 11 83 a0 00 00 00 	movups XMMWORD PTR [rbx+0xa0],xmm0
1311972:  e715f6:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
1312100:  e717ee:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
1312962:  e72565:	0f 29 94 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm2
1312978:  e725a9:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
1312986:  e725c8:	0f 29 8c 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm1
1315240:  e74769:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1315242:  e74771:	48 89 94 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdx
1315716:  e74e2e:	48 89 9c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rbx
1316908:  e75f8e:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
1317448:  e767a4:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
1317712:  e76b5b:	f3 0f 11 84 24 a0 00 	movss  DWORD PTR [rsp+0xa0],xmm0
1317914:  e76e5a:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1321468:  e7a1c4:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
1323048:  e7b971:	48 8b 80 a8 00 00 00 	mov    rax,QWORD PTR [rax+0xa8]
1326250:  e7e5dd:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
1326252:  e7e5e5:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
1326297:  e7e68d:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
1326348:  e7e751:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
1328295:  e8021a:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1329585:  e814e2:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
1329711:  e816a2:	48 8b 84 24 a8 00 00 	mov    rax,QWORD PTR [rsp+0xa8]
1329790:  e817ae:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
1329793:  e817b9:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
1330457:  e821e6:	c7 84 24 a0 00 00 00 	mov    DWORD PTR [rsp+0xa0],0x3f800000
1330519:  e822b7:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
1330558:  e82343:	f3 0f 10 8c 24 a0 00 	movss  xmm1,DWORD PTR [rsp+0xa0]
1330605:  e823e7:	48 8b 8c 24 a8 00 00 	mov    rcx,QWORD PTR [rsp+0xa8]
1333722:  e84ff4:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1334657:  e85e04:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
1334932:  e8621c:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1337222:  e88506:	0f 11 87 a8 00 00 00 	movups XMMWORD PTR [rdi+0xa8],xmm0
1337393:  e887b1:	48 8b b4 24 a0 00 00 	mov    rsi,QWORD PTR [rsp+0xa0]
1337398:  e887c7:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
1340355:  e8afc8:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
1340442:  e8b12e:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
1341070:  e8bacb:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
1341078:  e8baeb:	66 0f 7f 8c 24 a0 00 	movdqa XMMWORD PTR [rsp+0xa0],xmm1
1342070:  e8c92c:	48 89 9c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rbx
1342165:  e8ca9b:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1342291:  e8cc6b:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
1342320:  e8cce9:	48 8b 84 24 a0 00 00 	mov    rax,QWORD PTR [rsp+0xa0]
1342444:  e8ceef:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
1342452:  e8cf17:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1343153:  e8d9ea:	48 8b 94 24 a0 00 00 	mov    rdx,QWORD PTR [rsp+0xa0]
1343316:  e8dc99:	49 8b be a0 00 00 00 	mov    rdi,QWORD PTR [r14+0xa0]
1343439:  e8dec5:	48 8b 88 a8 00 00 00 	mov    rcx,QWORD PTR [rax+0xa8]
1343440:  e8decc:	f3 0f 6f 80 a0 00 00 	movdqu xmm0,XMMWORD PTR [rax+0xa0]
1344410:  e8ed1a:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1345163:  e8f76e:	0f 11 86 a0 00 00 00 	movups XMMWORD PTR [rsi+0xa0],xmm0
1347847:  e92114:	66 41 0f 7f 84 24 a0 	movdqa XMMWORD PTR [r12+0xa0],xmm0
1348171:  e92684:	49 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [r12+0xa8]
1348703:  e92f3d:	48 89 8c 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rcx
1348954:  e93361:	41 88 ae a0 00 00 00 	mov    BYTE PTR [r14+0xa0],bpl
1349362:  e93a0b:	f3 0f 7f 83 a8 00 00 	movdqu XMMWORD PTR [rbx+0xa8],xmm0
1350652:  e94f10:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1351140:  e956fc:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
1351278:  e95940:	48 89 8c 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rcx
1351824:  e96270:	89 84 24 a8 00 00 00 	mov    DWORD PTR [rsp+0xa8],eax
1351862:  e96310:	89 9c 24 a0 00 00 00 	mov    DWORD PTR [rsp+0xa0],ebx
1351898:  e963aa:	0f 11 83 a0 00 00 00 	movups XMMWORD PTR [rbx+0xa0],xmm0
1352184:  e968a4:	8b 84 24 a8 00 00 00 	mov    eax,DWORD PTR [rsp+0xa8]
1352221:  e96943:	8b 94 24 a0 00 00 00 	mov    edx,DWORD PTR [rsp+0xa0]
1352266:  e96a20:	8b 94 24 a8 00 00 00 	mov    edx,DWORD PTR [rsp+0xa8]
1352788:  e972d9:	8b 84 24 a8 00 00 00 	mov    eax,DWORD PTR [rsp+0xa8]
1352877:  e97464:	48 89 bc 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rdi
1353681:  e981da:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
1353830:  e98441:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
1354138:  e989ab:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
1354291:  e98c38:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
1354622:  e99194:	48 8b bb a8 00 00 00 	mov    rdi,QWORD PTR [rbx+0xa8]
1355648:  e9a02a:	66 41 0f 7f 85 a0 00 	movdqa XMMWORD PTR [r13+0xa0],xmm0
1355947:  e9a4f4:	66 41 0f 7f 85 a0 00 	movdqa XMMWORD PTR [r13+0xa0],xmm0
1356061:  e9a6d7:	66 41 0f 7f 87 a0 00 	movdqa XMMWORD PTR [r15+0xa0],xmm0
1356148:  e9a839:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
1356547:  e9aed0:	41 89 86 a0 00 00 00 	mov    DWORD PTR [r14+0xa0],eax
1356548:  e9aed7:	f3 41 0f 7f 86 a8 00 	movdqu XMMWORD PTR [r14+0xa8],xmm0
1358740:  e9d157:	48 8b bc 24 a0 00 00 	mov    rdi,QWORD PTR [rsp+0xa0]
1359280:  e9da19:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
1359322:  e9daca:	49 89 84 24 a0 00 00 	mov    QWORD PTR [r12+0xa0],rax
2590348- 1301c18:	45 31 ed             	xor    r13d,r13d
2590349- 1301c1b:	4b 8b 34 2f          	mov    rsi,QWORD PTR [r15+r13*1]
2590350- 1301c1f:	48 89 df             	mov    rdi,rbx
2590351- 1301c22:	e8 cf 73 7d ff       	call   ad8ff6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25f96>
2590352- 1301c27:	49 83 c5 08          	add    r13,0x8
2590353- 1301c2b:	4d 39 ec             	cmp    r12,r13
2590354- 1301c2e:	75 eb                	jne    1301c1b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14719f>
2590355- 1301c30:	49 8b 76 48          	mov    rsi,QWORD PTR [r14+0x48]
2590356- 1301c34:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2590357- 1301c38:	48 8d bc 24 d8 08 00 	lea    rdi,[rsp+0x8d8]
2590358- 1301c3f:	00 
2590359- 1301c40:	e8 3b c4 4e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
2590360- 1301c45:	49 8b 76 50          	mov    rsi,QWORD PTR [r14+0x50]
2590361- 1301c49:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2590362- 1301c4d:	48 8d bc 24 f0 08 00 	lea    rdi,[rsp+0x8f0]
2590363- 1301c54:	00 
2590364- 1301c55:	e8 26 c4 4e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
2590365- 1301c5a:	0f 57 c0             	xorps  xmm0,xmm0
2590367- 1301c64:	00 
2590368- 1301c65:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
2590369- 1301c6c:	00 00 
2590370- 1301c6e:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
2590371- 1301c72:	48 89 ef             	mov    rdi,rbp
2590372- 1301c75:	ff 50 18             	call   QWORD PTR [rax+0x18]
2590373- 1301c78:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
2590374- 1301c7f:	00 
2590375- 1301c80:	48 89 c6             	mov    rsi,rax
2590376- 1301c83:	e8 90 46 f8 ff       	call   1286318 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcb89c>
2590377- 1301c88:	4c 8d bc 24 e0 00 00 	lea    r15,[rsp+0xe0]
2590378- 1301c8f:	00 
2590379- 1301c90:	4c 8d b4 24 d0 01 00 	lea    r14,[rsp+0x1d0]
2590380- 1301c97:	00 
2590381- 1301c98:	4c 8d a4 24 60 09 00 	lea    r12,[rsp+0x960]
2590382- 1301c9f:	00 
2590383- 1301ca0:	31 db                	xor    ebx,ebx
2590384- 1301ca2:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
2590385- 1301ca6:	48 89 ef             	mov    rdi,rbp
2590386- 1301ca9:	ff 50 18             	call   QWORD PTR [rax+0x18]
2590387- 1301cac:	48 39 c3             	cmp    rbx,rax
2590388- 1301caf:	0f 83 fc 04 00 00    	jae    13021b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147735>
2590389- 1301cb5:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]
2590390- 1301cb9:	48 89 ef             	mov    rdi,rbp
2590391- 1301cbc:	48 89 de             	mov    rsi,rbx
2590392- 1301cbf:	ff 50 20             	call   QWORD PTR [rax+0x20]
2590393- 1301cc2:	48 8d 0d c7 20 56 00 	lea    rcx,[rip+0x5620c7]        # 1863d90 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20478>
2590394- 1301cc9:	48 89 8c 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rcx
2590912- 13024b0:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
2590913- 13024b5:	48 89 c6             	mov    rsi,rax
2590914- 13024b8:	e8 83 ba 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2590915- 13024bd:	49 8b 06             	mov    rax,QWORD PTR [r14]
2590916- 13024c0:	4c 89 f7             	mov    rdi,r14
2590917- 13024c3:	ff 50 38             	call   QWORD PTR [rax+0x38]
2590918- 13024c6:	48 8d 7c 24 78       	lea    rdi,[rsp+0x78]
2590919- 13024cb:	48 89 c6             	mov    rsi,rax
2590920- 13024ce:	e8 6d ba 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2590921- 13024d3:	49 8b 06             	mov    rax,QWORD PTR [r14]
2590922- 13024d6:	4c 89 f7             	mov    rdi,r14
2590923- 13024d9:	ff 50 40             	call   QWORD PTR [rax+0x40]
2590924- 13024dc:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2590925- 13024e3:	00 
2590926- 13024e4:	48 89 c6             	mov    rsi,rax
2590927- 13024e7:	e8 54 ba 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2590928- 13024ec:	0f 57 c0             	xorps  xmm0,xmm0
2590929- 13024ef:	49 89 e6             	mov    r14,rsp
2590931- 13024f9:	00 
2590932- 13024fa:	49 83 a6 b8 00 00 00 	and    QWORD PTR [r14+0xb8],0x0
2590933- 1302501:	00 
2590934- 1302502:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
2590935- 1302505:	4c 89 f6             	mov    rsi,r14
2590936- 1302508:	e8 97 60 f2 ff       	call   12285a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6db28>
2590937- 130250d:	4c 89 f7             	mov    rdi,r14
2590938- 1302510:	e8 83 76 d8 ff       	call   1089b98 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x250fae>
2590939- 1302515:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2590940- 130251c:	00 00 
2590941- 130251e:	48 3b 84 24 c0 00 00 	cmp    rax,QWORD PTR [rsp+0xc0]
2590942- 1302525:	00 
2590943- 1302526:	75 0b                	jne    1302533 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147ab7>
2590944- 1302528:	48 81 c4 c8 00 00 00 	add    rsp,0xc8
2590945- 130252f:	5b                   	pop    rbx
2590946- 1302530:	41 5e                	pop    r14
2590947- 1302532:	c3                   	ret
2590948- 1302533:	e8 78 d5 4e 00       	call   17efab0 <__stack_chk_fail@plt>
2590949- 1302538:	48 89 c7             	mov    rdi,rax
2590950- 130253b:	e8 65 75 77 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
2590951- 1302540:	53                   	push   rbx
2590952- 1302541:	48 89 fb             	mov    rbx,rdi
2590953- 1302544:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2590954- 1302547:	48 89 f7             	mov    rdi,rsi
2590955- 130254a:	ff 50 10             	call   QWORD PTR [rax+0x10]
2590956- 130254d:	48 8b 0b             	mov    rcx,QWORD PTR [rbx]
2590957- 1302550:	89 01                	mov    DWORD PTR [rcx],eax
2590958- 1302552:	5b                   	pop    rbx
2592289- 13038dd:	a8 08                	test   al,0x8
2592290- 13038df:	74 14                	je     13038f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148e79>
2592291- 13038e1:	41 8b 4c 24 30       	mov    ecx,DWORD PTR [r12+0x30]
2592292- 13038e6:	89 8c 24 80 00 00 00 	mov    DWORD PTR [rsp+0x80],ecx
2592293- 13038ed:	c6 84 24 84 00 00 00 	mov    BYTE PTR [rsp+0x84],0x1
2592294- 13038f4:	01 
2592295- 13038f5:	48 8d ac 24 88 00 00 	lea    rbp,[rsp+0x88]
2592296- 13038fc:	00 
2592297- 13038fd:	a8 04                	test   al,0x4
2592298- 13038ff:	74 16                	je     1303917 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148e9b>
2592299- 1303901:	49 8b 74 24 28       	mov    rsi,QWORD PTR [r12+0x28]
2592300- 1303906:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2592301- 130390a:	48 89 ef             	mov    rdi,rbp
2592302- 130390d:	e8 28 ea 7f ff       	call   b0233a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4f2da>
2592303- 1303912:	41 8b 44 24 10       	mov    eax,DWORD PTR [r12+0x10]
2592304- 1303917:	a8 10                	test   al,0x10
2592305- 1303919:	74 18                	je     1303933 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148eb7>
2592306- 130391b:	f3 41 0f 10 44 24 34 	movss  xmm0,DWORD PTR [r12+0x34]
2592308- 1303929:	00 00 
2592309- 130392b:	c6 84 24 ac 00 00 00 	mov    BYTE PTR [rsp+0xac],0x1
2592310- 1303932:	01 
2592311- 1303933:	a8 20                	test   al,0x20
2592312- 1303935:	74 18                	je     130394f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148ed3>
2592313- 1303937:	f3 41 0f 10 44 24 38 	movss  xmm0,DWORD PTR [r12+0x38]
2592314- 130393e:	f3 0f 11 84 24 b0 00 	movss  DWORD PTR [rsp+0xb0],xmm0
2592315- 1303945:	00 00 
2592316- 1303947:	c6 84 24 b4 00 00 00 	mov    BYTE PTR [rsp+0xb4],0x1
2592317- 130394e:	01 
2592318- 130394f:	83 bc 24 48 02 00 00 	cmp    DWORD PTR [rsp+0x248],0x0
2592319- 1303956:	00 
2592320- 1303957:	74 74                	je     13039cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148f51>
2592321- 1303959:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
2592322- 130395e:	4c 89 ff             	mov    rdi,r15
2592323- 1303961:	e8 60 60 f1 ff       	call   12199c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5ef4a>
2592324- 1303966:	e9 fb 00 00 00       	jmp    1303a66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148fea>
2592325- 130396b:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
2592326- 130396f:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2592327- 1303974:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
2592328- 1303979:	0f 57 c0             	xorps  xmm0,xmm0
2592329- 130397c:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
2592330- 130397f:	48 8b 70 18          	mov    rsi,QWORD PTR [rax+0x18]
2592331- 1303983:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2592332- 1303987:	e8 f4 a6 4e 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
2592333- 130398c:	83 bc 24 48 02 00 00 	cmp    DWORD PTR [rsp+0x248],0x1
2592334- 1303993:	01 
2592335- 1303994:	75 1b                	jne    13039b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x148f35>
2594645- 1305b32:	59                   	pop    rcx
2594646- 1305b33:	e8 b6 6b a0 ff       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
2594647- 1305b38:	4c 89 e7             	mov    rdi,r12
2594648- 1305b3b:	48 89 ee             	mov    rsi,rbp
2594649- 1305b3e:	e8 e3 6b a0 ff       	call   d0c726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2596c6>
2594650- 1305b43:	48 89 ef             	mov    rdi,rbp
2594651- 1305b46:	e8 81 8c 79 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
2594652- 1305b4b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2594653- 1305b50:	e8 3b 83 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2594654- 1305b55:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
2594655- 1305b5a:	e8 31 83 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2594656- 1305b5f:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2594657- 1305b66:	00 
2594658- 1305b67:	e8 d8 1b 7f ff       	call   af7744 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x446e4>
2594659- 1305b6c:	49 83 c7 08          	add    r15,0x8
2594660- 1305b70:	49 39 df             	cmp    r15,rbx
2594661- 1305b73:	0f 85 e1 fe ff ff    	jne    1305a5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14afde>
2594662- 1305b79:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
2594664- 1305b85:	48 83 e0 fc          	and    rax,0xfffffffffffffffc
2594665- 1305b89:	48 8b 70 08          	mov    rsi,QWORD PTR [rax+0x8]
2594666- 1305b8d:	8b 38                	mov    edi,DWORD PTR [rax]
2594667- 1305b8f:	e8 8c 5c 77 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
2594668- 1305b94:	84 c0                	test   al,al
2594669- 1305b96:	75 57                	jne    1305bef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b173>
2594670- 1305b98:	48 8d 35 7a 7c 03 ff 	lea    rsi,[rip+0xffffffffff037c7a]        # 33d819 <_ZTSSt12bad_any_cast@@Base-0x529af>
2594671- 1305b9f:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
2594672- 1305ba4:	e8 d5 3e 77 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2594674- 1305bb0:	48 83 e2 fc          	and    rdx,0xfffffffffffffffc
2594675- 1305bb4:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2594676- 1305bbb:	00 
2594677- 1305bbc:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
2594678- 1305bc1:	31 c9                	xor    ecx,ecx
2594679- 1305bc3:	e8 26 6b a0 ff       	call   d0c6ee <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25968e>
2594680- 1305bc8:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
2594681- 1305bcf:	00 
2594682- 1305bd0:	4c 89 e7             	mov    rdi,r12
2594683- 1305bd3:	e8 4e 6b a0 ff       	call   d0c726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2596c6>
2594684- 1305bd8:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2594685- 1305bdf:	00 
2594686- 1305be0:	e8 e7 8b 79 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
2594687- 1305be5:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
2594688- 1305bea:	e8 a1 82 4e 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2594689- 1305bef:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2594690- 1305bf6:	00 00 
2594691- 1305bf8:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
2594692- 1305bff:	00 
2594693- 1305c00:	0f 85 e9 00 00 00    	jne    1305cef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b273>
2594694- 1305c06:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8
2594695- 1305c0d:	5b                   	pop    rbx
2594696- 1305c0e:	41 5c                	pop    r12
2594697- 1305c10:	41 5d                	pop    r13
2594698- 1305c12:	41 5e                	pop    r14
2594699- 1305c14:	41 5f                	pop    r15
2594700- 1305c16:	5d                   	pop    rbp
2594701- 1305c17:	c3                   	ret
2596131- 1306f21:	00 
2596132- 1306f22:	0f 57 c0             	xorps  xmm0,xmm0
2596133- 1306f25:	48 8d 94 24 c0 00 00 	lea    rdx,[rsp+0xc0]
2596134- 1306f2c:	00 
2596135- 1306f2d:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
2596136- 1306f30:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
2596137- 1306f35:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
2596138- 1306f3c:	00 
2596139- 1306f3d:	e8 c8 34 4d 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
2596140- 1306f42:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
2596141- 1306f49:	00 
2596142- 1306f4a:	4c 89 26             	mov    QWORD PTR [rsi],r12
2596143- 1306f4d:	48 8d 84 24 f0 00 00 	lea    rax,[rsp+0xf0]
2596144- 1306f54:	00 
2596145- 1306f55:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
2596146- 1306f59:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]
2596147- 1306f60:	00 
2596148- 1306f61:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
2596150- 1306f6c:	00 
2596151- 1306f6d:	48 8b 9c 24 b0 00 00 	mov    rbx,QWORD PTR [rsp+0xb0]
2596152- 1306f74:	00 
2596153- 1306f75:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
2596154- 1306f7a:	48 89 d9             	mov    rcx,rbx
2596155- 1306f7d:	e8 32 01 00 00       	call   13070b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c638>
2596156- 1306f82:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
2596157- 1306f87:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
2596158- 1306f8e:	00 
2596159- 1306f8f:	48 89 da             	mov    rdx,rbx
2596160- 1306f92:	48 89 d9             	mov    rcx,rbx
2596161- 1306f95:	e8 1a 01 00 00       	call   13070b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c638>
2596162- 1306f9a:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
2596163- 1306f9f:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
2596164- 1306fa4:	e8 13 5b 7b ff       	call   abcabc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a5c>
2596165- 1306fa9:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
2596166- 1306fae:	e8 d3 74 79 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2596167- 1306fb3:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
2596168- 1306fb8:	e8 c9 74 79 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2596169- 1306fbd:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
2596170- 1306fc4:	00 
2596171- 1306fc5:	e8 9a 5b 7b ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
2596172- 1306fca:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
2596173- 1306fd1:	00 
2596174- 1306fd2:	e8 8d 5b 7b ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
2596175- 1306fd7:	49 8b 7d 30          	mov    rdi,QWORD PTR [r13+0x30]
2596176- 1306fdb:	48 85 ff             	test   rdi,rdi
2596177- 1306fde:	74 40                	je     1307020 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c5a4>
2596292- 1307177:	00 
2596293- 1307178:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
2596294- 130717b:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
2596295- 1307180:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
2596296- 1307187:	00 
2596297- 1307188:	e8 7d 32 4d 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
2596298- 130718d:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
2596299- 1307194:	00 
2596300- 1307195:	4c 89 26             	mov    QWORD PTR [rsi],r12
2596301- 1307198:	48 8d 84 24 e4 00 00 	lea    rax,[rsp+0xe4]
2596302- 130719f:	00 
2596303- 13071a0:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
2596304- 13071a4:	48 8d 84 24 f0 00 00 	lea    rax,[rsp+0xf0]
2596305- 13071ab:	00 
2596306- 13071ac:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
2596307- 13071b0:	48 8d 84 24 e8 00 00 	lea    rax,[rsp+0xe8]
2596308- 13071b7:	00 
2596309- 13071b8:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
2596311- 13071c3:	00 
2596312- 13071c4:	48 8b 9c 24 b0 00 00 	mov    rbx,QWORD PTR [rsp+0xb0]
2596313- 13071cb:	00 
2596314- 13071cc:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
2596315- 13071d1:	48 89 d9             	mov    rcx,rbx
2596316- 13071d4:	e8 32 01 00 00       	call   130730b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c88f>
2596317- 13071d9:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
2596318- 13071de:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
2596319- 13071e5:	00 
2596320- 13071e6:	48 89 da             	mov    rdx,rbx
2596321- 13071e9:	48 89 d9             	mov    rcx,rbx
2596322- 13071ec:	e8 1a 01 00 00       	call   130730b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c88f>
2596323- 13071f1:	48 8d 7c 24 58       	lea    rdi,[rsp+0x58]
2596324- 13071f6:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
2596325- 13071fb:	e8 bc 58 7b ff       	call   abcabc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9a5c>
2596326- 1307200:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
2596327- 1307205:	e8 7c 72 79 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2596328- 130720a:	48 8b 7c 24 70       	mov    rdi,QWORD PTR [rsp+0x70]
2596329- 130720f:	e8 72 72 79 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2596330- 1307214:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
2596331- 130721b:	00 
2596332- 130721c:	e8 43 59 7b ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
2596333- 1307221:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
2596334- 1307228:	00 
2596335- 1307229:	e8 36 59 7b ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
2596336- 130722e:	49 8b 7d 30          	mov    rdi,QWORD PTR [r13+0x30]
2596337- 1307232:	48 85 ff             	test   rdi,rdi
2596338- 1307235:	74 40                	je     1307277 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14c7fb>
2597054- 1307cb4:	48 89 de             	mov    rsi,rbx
2597055- 1307cb7:	e8 4a 9a 92 ff       	call   c31706 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17e6a6>
2597056- 1307cbc:	84 c0                	test   al,al
2597057- 1307cbe:	0f 89 3e 01 00 00    	jns    1307e02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d386>
2597058- 1307cc4:	49 8b 47 08          	mov    rax,QWORD PTR [r15+0x8]
2597059- 1307cc8:	48 85 c0             	test   rax,rax
2597060- 1307ccb:	75 ce                	jne    1307c9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d21f>
2597061- 1307ccd:	e9 a8 00 00 00       	jmp    1307d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d2fe>
2597062- 1307cd2:	49 8b 07             	mov    rax,QWORD PTR [r15]
2597063- 1307cd5:	4d 89 fe             	mov    r14,r15
2597064- 1307cd8:	48 85 c0             	test   rax,rax
2597065- 1307cdb:	75 be                	jne    1307c9b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d21f>
2597066- 1307cdd:	e9 9c 00 00 00       	jmp    1307d7e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d302>
2597067- 1307ce2:	49 8d 5f 08          	lea    rbx,[r15+0x8]
2597068- 1307ce6:	6a 58                	push   0x58
2597069- 1307ce8:	5f                   	pop    rdi
2597070- 1307ce9:	e8 12 62 4e 00       	call   17edf00 <_Znwm@plt>
2597071- 1307cee:	49 89 c6             	mov    r14,rax
2597073- 1307cf8:	00 
2597074- 1307cf9:	4c 89 a4 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r12
2597075- 1307d00:	00 
2597076- 1307d01:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x0
2597077- 1307d08:	00 
2597078- 1307d09:	48 89 c7             	mov    rdi,rax
2597079- 1307d0c:	48 83 c7 20          	add    rdi,0x20
2597080- 1307d10:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
2597081- 1307d15:	e8 a4 01 00 00       	call   1307ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d442>
2597082- 1307d1a:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
2597083- 1307d1f:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x1
2597084- 1307d26:	01 
2597085- 1307d27:	0f 57 c0             	xorps  xmm0,xmm0
2597086- 1307d2a:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
2597087- 1307d2e:	4d 89 7e 10          	mov    QWORD PTR [r14+0x10],r15
2597088- 1307d32:	4c 89 33             	mov    QWORD PTR [rbx],r14
2597089- 1307d35:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
2597090- 1307d39:	48 8b 00             	mov    rax,QWORD PTR [rax]
2597091- 1307d3c:	48 85 c0             	test   rax,rax
2597092- 1307d3f:	74 07                	je     1307d48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d2cc>
2597093- 1307d41:	48 89 45 30          	mov    QWORD PTR [rbp+0x30],rax
2597094- 1307d45:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
2597095- 1307d48:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
2597096- 1307d4c:	4c 89 f6             	mov    rsi,r14
2597097- 1307d4f:	e8 ca 22 7a ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
2597098- 1307d54:	48 ff 45 40          	inc    QWORD PTR [rbp+0x40]
2597099- 1307d58:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
2597100- 1307d5f:	00 
2597101- 1307d60:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
2597102- 1307d63:	48 83 27 00          	and    QWORD PTR [rdi],0x0
2597103- 1307d67:	e8 26 3e 7f ff       	call   afbb92 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x48b32>
2597104- 1307d6c:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
2597105- 1307d71:	49 89 47 50          	mov    QWORD PTR [r15+0x50],rax
2597106- 1307d75:	e9 8c 00 00 00       	jmp    1307e06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d38a>
2597107- 1307d7a:	4d 8d 77 08          	lea    r14,[r15+0x8]
2597108- 1307d7e:	6a 58                	push   0x58
2597109- 1307d80:	5f                   	pop    rdi
2597110- 1307d81:	e8 7a 61 4e 00       	call   17edf00 <_Znwm@plt>
2597111- 1307d86:	48 89 c3             	mov    rbx,rax
2597113- 1307d90:	00 
2597114- 1307d91:	4c 89 a4 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],r12
2597115- 1307d98:	00 
2597116- 1307d99:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x0
2597117- 1307da0:	00 
2597118- 1307da1:	48 89 c7             	mov    rdi,rax
2597119- 1307da4:	48 83 c7 20          	add    rdi,0x20
2597120- 1307da8:	48 8d 74 24 70       	lea    rsi,[rsp+0x70]
2597121- 1307dad:	e8 0c 01 00 00       	call   1307ebe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d442>
2597122- 1307db2:	83 63 50 00          	and    DWORD PTR [rbx+0x50],0x0
2597123- 1307db6:	c6 84 24 b8 00 00 00 	mov    BYTE PTR [rsp+0xb8],0x1
2597124- 1307dbd:	01 
2597125- 1307dbe:	0f 57 c0             	xorps  xmm0,xmm0
2597126- 1307dc1:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
2597127- 1307dc4:	4c 89 7b 10          	mov    QWORD PTR [rbx+0x10],r15
2597128- 1307dc8:	49 89 1e             	mov    QWORD PTR [r14],rbx
2597129- 1307dcb:	48 8b 45 48          	mov    rax,QWORD PTR [rbp+0x48]
2597130- 1307dcf:	48 8b 00             	mov    rax,QWORD PTR [rax]
2597131- 1307dd2:	48 85 c0             	test   rax,rax
2597132- 1307dd5:	74 07                	je     1307dde <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14d362>
2597133- 1307dd7:	48 89 45 48          	mov    QWORD PTR [rbp+0x48],rax
2597134- 1307ddb:	49 8b 1e             	mov    rbx,QWORD PTR [r14]
2597135- 1307dde:	48 8b 7d 50          	mov    rdi,QWORD PTR [rbp+0x50]
2597136- 1307de2:	48 89 de             	mov    rsi,rbx
2597137- 1307de5:	e8 34 22 7a ff       	call   aaa01e <JNI_OnUnload@@Base+0x318eb>
2597138- 1307dea:	48 ff 45 58          	inc    QWORD PTR [rbp+0x58]
2597139- 1307dee:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
2597140- 1307df5:	00 
2598047- 1308b0a:	80 4f e8 04          	or     BYTE PTR [rdi-0x18],0x4
2598048- 1308b0e:	49 83 c6 30          	add    r14,0x30
2598049- 1308b12:	48 8b 57 e0          	mov    rdx,QWORD PTR [rdi-0x20]
2598050- 1308b16:	f6 c2 01             	test   dl,0x1
2598051- 1308b19:	0f 85 10 01 00 00    	jne    1308c2f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e1b3>
2598052- 1308b1f:	4c 89 f6             	mov    rsi,r14
2598053- 1308b22:	e8 6b cc 45 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
2598054- 1308b27:	4d 8b 6f 38          	mov    r13,QWORD PTR [r15+0x38]
2598055- 1308b2b:	49 8b 6f 40          	mov    rbp,QWORD PTR [r15+0x40]
2598056- 1308b2f:	4d 8d b7 b0 00 00 00 	lea    r14,[r15+0xb0]
2598057- 1308b36:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
2598058- 1308b3d:	00 
2598059- 1308b3e:	4c 89 f6             	mov    rsi,r14
2598060- 1308b41:	e8 5a 71 47 00       	call   177fca0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e0c>
2598061- 1308b46:	84 c0                	test   al,al
2598062- 1308b48:	74 61                	je     1308bab <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e12f>
2598063- 1308b4a:	4c 8d 63 18          	lea    r12,[rbx+0x18]
2598064- 1308b4e:	4c 29 ed             	sub    rbp,r13
2598066- 1308b58:	00 
2598068- 1308b60:	00 
2598069- 1308b61:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]
2598070- 1308b68:	00 
2598071- 1308b69:	4c 89 ef             	mov    rdi,r13
2598072- 1308b6c:	4c 89 f6             	mov    rsi,r14
2598073- 1308b6f:	e8 e2 d5 7a ff       	call   ab6156 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x30f6>
2598074- 1308b74:	41 0f 10 45 00       	movups xmm0,XMMWORD PTR [r13+0x0]
2598075- 1308b79:	0f 11 44 24 10       	movups XMMWORD PTR [rsp+0x10],xmm0
2598077- 1308b85:	00 
2598078- 1308b86:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
2598079- 1308b8a:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2598080- 1308b91:	00 
2598081- 1308b92:	4c 8d 8c 24 b0 00 00 	lea    r9,[rsp+0xb0]
2598082- 1308b99:	00 
2598083- 1308b9a:	4c 89 fe             	mov    rsi,r15
2598084- 1308b9d:	31 d2                	xor    edx,edx
2598085- 1308b9f:	31 c9                	xor    ecx,ecx
2598086- 1308ba1:	4d 89 e0             	mov    r8,r12
2598087- 1308ba4:	e8 6f b3 37 00       	call   1683f18 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38084>
2598088- 1308ba9:	eb 21                	jmp    1308bcc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e150>
2598089- 1308bab:	48 8d 35 3c 85 04 ff 	lea    rsi,[rip+0xffffffffff04853c]        # 3510ee <_ZTSSt12bad_any_cast@@Base-0x3f0da>
2598090- 1308bb2:	48 8d 0d c3 93 14 ff 	lea    rcx,[rip+0xffffffffff1493c3]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
2598091- 1308bb9:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2598092- 1308bc0:	00 
2598093- 1308bc1:	6a 0a                	push   0xa
2598094- 1308bc3:	5a                   	pop    rdx
2598095- 1308bc4:	45 31 c0             	xor    r8d,r8d
2598096- 1308bc7:	e8 70 10 85 ff       	call   b59c3c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa6bdc>
2598097- 1308bcc:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
2598098- 1308bd3:	00 
2598099- 1308bd4:	e8 13 db 7a ff       	call   ab66ec <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x368c>
2598100- 1308bd9:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
2598101- 1308be0:	00 
2598102- 1308be1:	e8 c4 65 7b ff       	call   abf1aa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc14a>
2598103- 1308be6:	c6 43 38 00          	mov    BYTE PTR [rbx+0x38],0x0
2598104- 1308bea:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
2598600- 130928a:	4d 39 f4             	cmp    r12,r14
2598601- 130928d:	74 38                	je     13092c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e84b>
2598602- 130928f:	4c 8d 6c 24 30       	lea    r13,[rsp+0x30]
2598603- 1309294:	4c 89 e7             	mov    rdi,r12
2598604- 1309297:	e8 e8 02 00 00       	call   1309584 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eb08>
2598605- 130929c:	4c 89 68 08          	mov    QWORD PTR [rax+0x8],r13
2598606- 13092a0:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
2598607- 13092a5:	48 89 08             	mov    QWORD PTR [rax],rcx
2598608- 13092a8:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax
2598609- 13092ac:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
2598610- 13092b1:	48 ff 44 24 40       	inc    QWORD PTR [rsp+0x40]
2598611- 13092b6:	49 81 c4 d0 02 00 00 	add    r12,0x2d0
2598612- 13092bd:	4d 39 f4             	cmp    r12,r14
2598613- 13092c0:	75 d2                	jne    1309294 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e818>
2598614- 13092c2:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
2598615- 13092c7:	0f 57 c0             	xorps  xmm0,xmm0
2598616- 13092ca:	0f 29 84 24 b0 00 00 	movaps XMMWORD PTR [rsp+0xb0],xmm0
2598617- 13092d1:	00 
2598619- 13092d9:	00 
2598620- 13092da:	c7 84 24 c0 00 00 00 	mov    DWORD PTR [rsp+0xc0],0x3f800000
2598621- 13092e1:	00 00 80 3f 
2598622- 13092e5:	49 39 dd             	cmp    r13,rbx
2598623- 13092e8:	74 25                	je     130930f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e893>
2598624- 13092ea:	4c 8d a4 24 a0 00 00 	lea    r12,[rsp+0xa0]
2598625- 13092f1:	00 
2598626- 13092f2:	48 8d 5c 24 30       	lea    rbx,[rsp+0x30]
2598627- 13092f7:	49 8d 75 28          	lea    rsi,[r13+0x28]
2598628- 13092fb:	4c 89 e7             	mov    rdi,r12
2598629- 13092fe:	4c 89 ea             	mov    rdx,r13
2598630- 1309301:	e8 fa 02 00 00       	call   1309600 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14eb84>
2598631- 1309306:	4d 8b 6d 08          	mov    r13,QWORD PTR [r13+0x8]
2598632- 130930a:	49 39 dd             	cmp    r13,rbx
2598633- 130930d:	75 e8                	jne    13092f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e87b>
2598634- 130930f:	89 6c 24 2c          	mov    DWORD PTR [rsp+0x2c],ebp
2598635- 1309313:	4d 8b 27             	mov    r12,QWORD PTR [r15]
2598636- 1309316:	4d 8b 6f 08          	mov    r13,QWORD PTR [r15+0x8]
2598637- 130931a:	4d 39 ec             	cmp    r12,r13
2598638- 130931d:	0f 84 9e 00 00 00    	je     13093c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e945>
2598639- 1309323:	48 8d 6c 24 30       	lea    rbp,[rsp+0x30]
2598640- 1309328:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
2598641- 130932f:	00 
2598642- 1309330:	48 8d 5c 24 2c       	lea    rbx,[rsp+0x2c]
2598643- 1309335:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
2598644- 130933a:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
2598645- 130933f:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
2598646- 1309344:	48 89 5c 24 68       	mov    QWORD PTR [rsp+0x68],rbx
2599827- 130a3bc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2599828- 130a3c3:	00 00 
2599829- 130a3c5:	48 3b 84 24 60 04 00 	cmp    rax,QWORD PTR [rsp+0x460]
2599830- 130a3cc:	00 
2599831- 130a3cd:	0f 85 a2 06 00 00    	jne    130aa75 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fff9>
2599832- 130a3d3:	0f 57 c0             	xorps  xmm0,xmm0
2599833- 130a3d6:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
2599834- 130a3da:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
2599835- 130a3df:	e9 b8 05 00 00       	jmp    130a99c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14ff20>
2599836- 130a3e4:	49 8b 37             	mov    rsi,QWORD PTR [r15]
2599837- 130a3e7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2599838- 130a3ea:	48 8d 5c 24 20       	lea    rbx,[rsp+0x20]
2599839- 130a3ef:	48 89 df             	mov    rdi,rbx
2599840- 130a3f2:	ff 50 48             	call   QWORD PTR [rax+0x48]
2599841- 130a3f5:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
2599842- 130a3f8:	48 85 ff             	test   rdi,rdi
2599843- 130a3fb:	0f 84 47 04 00 00    	je     130a848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fdcc>
2599844- 130a401:	0f 57 c0             	xorps  xmm0,xmm0
2599846- 130a40b:	00 
2599847- 130a40c:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
2599848- 130a413:	00 
2599849- 130a414:	c7 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],0x3f800000
2599850- 130a41b:	00 00 80 3f 
2599851- 130a41f:	4d 8b 3e             	mov    r15,QWORD PTR [r14]
2599852- 130a422:	49 8b 5e 08          	mov    rbx,QWORD PTR [r14+0x8]
2599853- 130a426:	49 39 df             	cmp    r15,rbx
2599854- 130a429:	74 33                	je     130a45e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f9e2>
2599855- 130a42b:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
2599856- 130a432:	00 
2599857- 130a433:	4d 85 ff             	test   r15,r15
2599858- 130a436:	74 15                	je     130a44d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f9d1>
2599859- 130a438:	41 83 bf 50 01 00 00 	cmp    DWORD PTR [r15+0x150],0x0
2599860- 130a43f:	00 
2599861- 130a440:	75 0b                	jne    130a44d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f9d1>
2599862- 130a442:	4c 89 e7             	mov    rdi,r12
2599863- 130a445:	4c 89 fe             	mov    rsi,r15
2599864- 130a448:	e8 23 34 91 ff       	call   c1d870 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a810>
2599865- 130a44d:	49 81 c7 58 01 00 00 	add    r15,0x158
2599866- 130a454:	49 39 df             	cmp    r15,rbx
2599867- 130a457:	75 da                	jne    130a433 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f9b7>
2599868- 130a459:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
2599869- 130a45e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2599870- 130a461:	ff 50 20             	call   QWORD PTR [rax+0x20]
2599871- 130a464:	4c 8d bc 24 70 02 00 	lea    r15,[rsp+0x270]
2599872- 130a46b:	00 
2599873- 130a46c:	4c 8d a4 24 90 00 00 	lea    r12,[rsp+0x90]
2599937- 130a562:	48 89 c6             	mov    rsi,rax
2599938- 130a565:	e8 fc f8 3b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
2599939- 130a56a:	0f 57 c0             	xorps  xmm0,xmm0
2599940- 130a56d:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
2599941- 130a574:	00 
2599942- 130a575:	0f 29 47 30          	movaps XMMWORD PTR [rdi+0x30],xmm0
2599943- 130a579:	0f 29 47 20          	movaps XMMWORD PTR [rdi+0x20],xmm0
2599944- 130a57d:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
2599945- 130a581:	48 83 67 40 00       	and    QWORD PTR [rdi+0x40],0x0
2599946- 130a586:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
2599947- 130a589:	48 b8 01 00 00 00 01 	movabs rax,0x100000001
2599948- 130a590:	00 00 00 
2599949- 130a593:	48 89 47 48          	mov    QWORD PTR [rdi+0x48],rax
2599950- 130a597:	31 c0                	xor    eax,eax
2599951- 130a599:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
2599952- 130a59c:	48 83 67 68 00       	and    QWORD PTR [rdi+0x68],0x0
2599953- 130a5a1:	0f 11 47 58          	movups XMMWORD PTR [rdi+0x58],xmm0
2599954- 130a5a5:	c6 47 70 01          	mov    BYTE PTR [rdi+0x70],0x1
2599956- 130a5af:	88 87 f0 00 00 00    	mov    BYTE PTR [rdi+0xf0],al
2599957- 130a5b5:	66 83 a7 00 01 00 00 	and    WORD PTR [rdi+0x100],0x0
2599958- 130a5bc:	00 
2599959- 130a5bd:	0f 11 47 78          	movups XMMWORD PTR [rdi+0x78],xmm0
2599960- 130a5c1:	0f 11 87 81 00 00 00 	movups XMMWORD PTR [rdi+0x81],xmm0
2599961- 130a5c8:	e8 ff ca 00 00       	call   13170cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15c650>
2599962- 130a5cd:	48 8d 35 84 07 6e 00 	lea    rsi,[rip+0x6e0784]        # 19ead58 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1990>
2599963- 130a5d4:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
2599964- 130a5db:	00 
2599965- 130a5dc:	48 89 df             	mov    rdi,rbx
2599966- 130a5df:	e8 6e 6d 9a ff       	call   cb1352 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1fe2f2>
2599967- 130a5e4:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
2599968- 130a5eb:	00 
2599969- 130a5ec:	48 8d b4 24 10 02 00 	lea    rsi,[rsp+0x210]
2599970- 130a5f3:	00 
2599971- 130a5f4:	48 8d 94 24 00 01 00 	lea    rdx,[rsp+0x100]
2599972- 130a5fb:	00 
2599973- 130a5fc:	48 89 d9             	mov    rcx,rbx
2599974- 130a5ff:	e8 f8 55 02 00       	call   132fbfc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175180>
2599975- 130a604:	48 89 eb             	mov    rbx,rbp
2599976- 130a607:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2599977- 130a60e:	00 
2599978- 130a60f:	e8 1a ad 3b 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2599979- 130a614:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]
2599980- 130a61b:	00 
2599981- 130a61c:	e8 71 a1 d6 ff       	call   1074792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bba8>
2599982- 130a621:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]
2599983- 130a628:	00 
2600020- 130a6bf:	e8 c2 3d 79 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2600021- 130a6c4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2600022- 130a6c9:	e8 1a 01 4d 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
2600023- 130a6ce:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
2600024- 130a6d3:	e8 64 22 f6 ff       	call   126c93c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1ec0>
2600025- 130a6d8:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
2600026- 130a6df:	00 
2600027- 130a6e0:	e8 8b a0 d6 ff       	call   1074770 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bb86>
2600028- 130a6e5:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
2600029- 130a6ea:	49 89 ed             	mov    r13,rbp
2600030- 130a6ed:	8b 6c 24 08          	mov    ebp,DWORD PTR [rsp+0x8]
2600031- 130a6f1:	e9 ab fc ff ff       	jmp    130a3a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14f925>
2600032- 130a6f6:	4c 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],r13
2600033- 130a6fb:	40 80 fd 01          	cmp    bpl,0x1
2600034- 130a6ff:	0f 84 bb 01 00 00    	je     130a8c0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fe44>
2600035- 130a705:	40 0f b6 c5          	movzx  eax,bpl
2600036- 130a709:	85 c0                	test   eax,eax
2600037- 130a70b:	0f 85 2f 02 00 00    	jne    130a940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fec4>
2600039- 130a718:	00 
2600040- 130a719:	4d 85 ff             	test   r15,r15
2600041- 130a71c:	0f 84 1e 02 00 00    	je     130a940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14fec4>
2600042- 130a722:	49 8d 46 10          	lea    rax,[r14+0x10]
2600043- 130a726:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
2600044- 130a72b:	4c 8d a4 24 10 02 00 	lea    r12,[rsp+0x210]
2600045- 130a732:	00 
2600046- 130a733:	4c 8d ac 24 70 02 00 	lea    r13,[rsp+0x270]
2600047- 130a73a:	00 
2600048- 130a73b:	48 8d ac 24 00 01 00 	lea    rbp,[rsp+0x100]
2600049- 130a742:	00 
2600050- 130a743:	49 8d 77 10          	lea    rsi,[r15+0x10]
2600051- 130a747:	4c 89 e7             	mov    rdi,r12
2600052- 130a74a:	e8 f1 37 4e 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2600053- 130a74f:	48 8b 84 24 20 02 00 	mov    rax,QWORD PTR [rsp+0x220]
2600054- 130a756:	00 
2600055- 130a757:	48 89 84 24 80 02 00 	mov    QWORD PTR [rsp+0x280],rax
2600056- 130a75e:	00 
2600057- 130a75f:	0f 28 84 24 10 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x210]
2600058- 130a766:	00 
2600059- 130a767:	0f 29 84 24 70 02 00 	movaps XMMWORD PTR [rsp+0x270],xmm0
2600060- 130a76e:	00 
2600061- 130a76f:	0f 57 c0             	xorps  xmm0,xmm0
2600062- 130a772:	0f 29 84 24 10 02 00 	movaps XMMWORD PTR [rsp+0x210],xmm0
2600063- 130a779:	00 
2600064- 130a77a:	48 83 a4 24 20 02 00 	and    QWORD PTR [rsp+0x220],0x0
2600065- 130a781:	00 00 
2600066- 130a783:	c7 84 24 c0 03 00 00 	mov    DWORD PTR [rsp+0x3c0],0x1
2607188- 1310e2a:	80 bc 24 c8 01 00 00 	cmp    BYTE PTR [rsp+0x1c8],0x0
2607189- 1310e31:	00 
2607190- 1310e32:	0f 94 c3             	sete   bl
2607191- 1310e35:	08 c3                	or     bl,al
2607192- 1310e37:	74 0f                	je     1310e48 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1563cc>
2607193- 1310e39:	c6 84 24 80 01 00 00 	mov    BYTE PTR [rsp+0x180],0x0
2607194- 1310e40:	00 
2607195- 1310e41:	31 c0                	xor    eax,eax
2607196- 1310e43:	e9 85 00 00 00       	jmp    1310ecd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x156451>
2607197- 1310e48:	48 8b 84 24 d0 00 00 	mov    rax,QWORD PTR [rsp+0xd0]
2607198- 1310e4f:	00 
2607199- 1310e50:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
2607200- 1310e57:	00 
2607201- 1310e58:	0f 57 c9             	xorps  xmm1,xmm1
2607202- 1310e5b:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
2607203- 1310e62:	00 00 
2607204- 1310e64:	0f 29 8c 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm1
2607205- 1310e6b:	00 
2607207- 1310e73:	00 
2607208- 1310e74:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
2607209- 1310e7b:	00 
2607211- 1310e83:	00 
2607212- 1310e84:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
2607213- 1310e8b:	00 00 
2607214- 1310e8d:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
2607215- 1310e94:	00 
2607216- 1310e95:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
2607217- 1310e9c:	00 
2607218- 1310e9d:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
2607219- 1310ea2:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
2607220- 1310ea9:	00 
2607221- 1310eaa:	0f 29 0f             	movaps XMMWORD PTR [rdi],xmm1
2607222- 1310ead:	48 89 8c 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rcx
2607223- 1310eb4:	00 
2607224- 1310eb5:	0f 11 94 24 98 01 00 	movups XMMWORD PTR [rsp+0x198],xmm2
2607225- 1310ebc:	00 
2607226- 1310ebd:	0f 11 4f 18          	movups XMMWORD PTR [rdi+0x18],xmm1
2607227- 1310ec1:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
2607228- 1310ec6:	e8 01 d9 78 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
2607229- 1310ecb:	b0 01                	mov    al,0x1
2607230- 1310ecd:	88 84 24 b0 01 00 00 	mov    BYTE PTR [rsp+0x1b0],al
2607231- 1310ed4:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
2607232- 1310edb:	00 
2607233- 1310edc:	e8 af cf 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2607234- 1310ee1:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
2607235- 1310ee8:	00 
2607236- 1310ee9:	e8 a2 cf 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2607237- 1310eee:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
2607238- 1310ef5:	00 
2611293- 1314b17:	74 53                	je     1314b6c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a0f0>
2611294- 1314b19:	4c 89 eb             	mov    rbx,r13
2611295- 1314b1c:	4c 39 6c 24 38       	cmp    QWORD PTR [rsp+0x38],r13
2611296- 1314b21:	4d 89 ee             	mov    r14,r13
2611297- 1314b24:	74 26                	je     1314b4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a0d0>
2611298- 1314b26:	4c 89 f7             	mov    rdi,r14
2611299- 1314b29:	e8 e2 af 7c ff       	call   adfb10 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cab0>
2611300- 1314b2e:	48 89 c3             	mov    rbx,rax
2611301- 1314b31:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
2611302- 1314b35:	48 8b 70 28          	mov    rsi,QWORD PTR [rax+0x28]
2611303- 1314b39:	4c 89 e2             	mov    rdx,r12
2611304- 1314b3c:	4c 89 f9             	mov    rcx,r15
2611305- 1314b3f:	e8 f6 db b3 ff       	call   e5273a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b50>
2611306- 1314b44:	84 c0                	test   al,al
2611307- 1314b46:	0f 84 88 00 00 00    	je     1314bd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a158>
2611308- 1314b4c:	49 83 3e 00          	cmp    QWORD PTR [r14],0x0
2611309- 1314b50:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
2611310- 1314b55:	0f 84 b4 00 00 00    	je     1314c0f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a193>
2611312- 1314b62:	00 
2611313- 1314b63:	48 83 c3 08          	add    rbx,0x8
2611314- 1314b67:	e9 88 00 00 00       	jmp    1314bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a178>
2611315- 1314b6c:	48 89 df             	mov    rdi,rbx
2611316- 1314b6f:	4c 89 f6             	mov    rsi,r14
2611317- 1314b72:	4c 89 e2             	mov    rdx,r12
2611318- 1314b75:	4c 89 f9             	mov    rcx,r15
2611319- 1314b78:	e8 bd db b3 ff       	call   e5273a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b50>
2611320- 1314b7d:	84 c0                	test   al,al
2611321- 1314b7f:	0f 84 f7 00 00 00    	je     1314c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a200>
2611322- 1314b85:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
2611323- 1314b8a:	4c 89 f7             	mov    rdi,r14
2611324- 1314b8d:	e8 50 9c 78 ff       	call   a9e7e2 <JNI_OnUnload@@Base+0x260af>
2611325- 1314b92:	48 89 c3             	mov    rbx,rax
2611326- 1314b95:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
2611327- 1314b9a:	48 39 c3             	cmp    rbx,rax
2611328- 1314b9d:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
2611329- 1314ba2:	74 1b                	je     1314bbf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a143>
2611330- 1314ba4:	48 8b 53 20          	mov    rdx,QWORD PTR [rbx+0x20]
2611331- 1314ba8:	48 8b 4b 28          	mov    rcx,QWORD PTR [rbx+0x28]
2611332- 1314bac:	4c 89 e7             	mov    rdi,r12
2611333- 1314baf:	4c 89 fe             	mov    rsi,r15
2611334- 1314bb2:	e8 83 db b3 ff       	call   e5273a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b50>
2611335- 1314bb7:	84 c0                	test   al,al
2611336- 1314bb9:	0f 84 07 01 00 00    	je     1314cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a24a>
2611337- 1314bbf:	49 83 7e 08 00       	cmp    QWORD PTR [r14+0x8],0x0
2611338- 1314bc4:	0f 84 1c 01 00 00    	je     1314ce6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a26a>
2611340- 1314bd1:	00 
2611341- 1314bd2:	eb 20                	jmp    1314bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a178>
2611342- 1314bd4:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
2611343- 1314bd9:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
2611344- 1314be0:	00 
2611345- 1314be1:	4c 89 e2             	mov    rdx,r12
2611346- 1314be4:	4c 89 f9             	mov    rcx,r15
2611347- 1314be7:	e8 34 61 d3 ff       	call   104ad20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x212136>
2611348- 1314bec:	48 89 c3             	mov    rbx,rax
2611349- 1314bef:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
2611350- 1314bf4:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
2611351- 1314bf7:	48 85 ff             	test   rdi,rdi
2611352- 1314bfa:	4c 8b 74 24 10       	mov    r14,QWORD PTR [rsp+0x10]
2611353- 1314bff:	0f 85 86 00 00 00    	jne    1314c8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a20f>
2611355- 1314c0c:	00 
2611356- 1314c0d:	eb 0b                	jmp    1314c1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a19e>
2611358- 1314c16:	00 
2611359- 1314c17:	4c 89 f3             	mov    rbx,r14
2611360- 1314c1a:	6a 30                	push   0x30
2611361- 1314c1c:	5f                   	pop    rdi
2611362- 1314c1d:	e8 de 92 4d 00       	call   17edf00 <_Znwm@plt>
2611363- 1314c22:	49 89 c7             	mov    r15,rax
2611364- 1314c25:	48 8b 54 24 10       	mov    rdx,QWORD PTR [rsp+0x10]
2611365- 1314c2a:	48 8d 42 20          	lea    rax,[rdx+0x20]
2611366- 1314c2e:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
2611367- 1314c33:	48 89 8c 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rcx
2611368- 1314c3a:	00 
2611369- 1314c3b:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
2611370- 1314c3e:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
2611371- 1314c43:	c6 84 24 e0 00 00 00 	mov    BYTE PTR [rsp+0xe0],0x1
2611372- 1314c4a:	01 
2611373- 1314c4b:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
2611374- 1314c50:	4c 89 f6             	mov    rsi,r14
2611375- 1314c53:	49 89 d6             	mov    r14,rdx
2611376- 1314c56:	48 89 da             	mov    rdx,rbx
2611377- 1314c59:	4c 89 f9             	mov    rcx,r15
2611378- 1314c5c:	e8 0b af 7c ff       	call   adfb6c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2cb0c>
2611379- 1314c61:	48 83 a4 24 d0 00 00 	and    QWORD PTR [rsp+0xd0],0x0
2611380- 1314c68:	00 00 
2611381- 1314c6a:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
2611382- 1314c71:	00 
2611383- 1314c72:	e8 53 56 76 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
2611384- 1314c77:	4c 89 ff             	mov    rdi,r15
2611385- 1314c7a:	eb 0f                	jmp    1314c8b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a20f>
2611396- 1314ca6:	49 89 c5             	mov    r13,rax
2611397- 1314ca9:	48 8d 44 24 78       	lea    rax,[rsp+0x78]
2611398- 1314cae:	49 39 c5             	cmp    r13,rax
2611399- 1314cb1:	74 44                	je     1314cf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a27b>
2611400- 1314cb3:	48 8d 84 24 98 00 00 	lea    rax,[rsp+0x98]
2611401- 1314cba:	00 
2611402- 1314cbb:	49 39 c6             	cmp    r14,rax
2611403- 1314cbe:	0f 85 a7 fd ff ff    	jne    1314a6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x159fef>
2611404- 1314cc4:	eb 31                	jmp    1314cf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a27b>
2611405- 1314cc6:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
2611406- 1314ccb:	48 8d b4 24 a8 00 00 	lea    rsi,[rsp+0xa8]
2611407- 1314cd2:	00 
2611408- 1314cd3:	4c 89 e2             	mov    rdx,r12
2611409- 1314cd6:	4c 89 f9             	mov    rcx,r15
2611410- 1314cd9:	e8 42 60 d3 ff       	call   104ad20 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x212136>
2611411- 1314cde:	48 89 c3             	mov    rbx,rax
2611412- 1314ce1:	e9 0e ff ff ff       	jmp    1314bf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a178>
2611413- 1314ce6:	49 8d 5e 08          	lea    rbx,[r14+0x8]
2611415- 1314cf1:	00 
2611416- 1314cf2:	e9 23 ff ff ff       	jmp    1314c1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a19e>
2611417- 1314cf7:	0f 57 c0             	xorps  xmm0,xmm0
2611418- 1314cfa:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
2611419- 1314cff:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
2611420- 1314d04:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
2611421- 1314d07:	48 8b 9c 24 b0 00 00 	mov    rbx,QWORD PTR [rsp+0xb0]
2611422- 1314d0e:	00 
2611423- 1314d0f:	4c 8b bc 24 b8 00 00 	mov    r15,QWORD PTR [rsp+0xb8]
2611424- 1314d16:	00 
2611425- 1314d17:	4c 39 fb             	cmp    rbx,r15
2611426- 1314d1a:	0f 84 88 00 00 00    	je     1314da8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a32c>
2611427- 1314d20:	4c 8d 64 24 38       	lea    r12,[rsp+0x38]
2611428- 1314d25:	41 bd ff ff ff ff    	mov    r13d,0xffffffff
2611429- 1314d2b:	48 8d 2d 1e fb 54 00 	lea    rbp,[rip+0x54fb1e]        # 1864850 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x20f38>
2611430- 1314d32:	4c 8d b4 24 a8 00 00 	lea    r14,[rsp+0xa8]
2611431- 1314d39:	00 
2611432- 1314d3a:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
2611433- 1314d3f:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
2611434- 1314d46:	00 
2611435- 1314d47:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
2611436- 1314d4c:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
2611437- 1314d53:	00 
2611438- 1314d54:	4c 89 a4 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],r12
2611439- 1314d5b:	00 
2611440- 1314d5c:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
2611441- 1314d61:	48 89 84 24 e8 00 00 	mov    QWORD PTR [rsp+0xe8],rax
2611442- 1314d68:	00 
2611443- 1314d69:	4c 89 a4 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],r12
2611444- 1314d70:	00 
2611445- 1314d71:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
2611446- 1314d78:	00 
2611447- 1314d79:	8b 43 10             	mov    eax,DWORD PTR [rbx+0x10]
2611448- 1314d7c:	4c 39 e8             	cmp    rax,r13
2611449- 1314d7f:	0f 84 84 00 00 00    	je     1314e09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a38d>
2611450- 1314d85:	48 8d 8c 24 d0 00 00 	lea    rcx,[rsp+0xd0]
2611451- 1314d8c:	00 
2611453- 1314d94:	00 
2611454- 1314d95:	4c 89 f7             	mov    rdi,r14
2611455- 1314d98:	48 89 de             	mov    rsi,rbx
2611456- 1314d9b:	ff 54 c5 00          	call   QWORD PTR [rbp+rax*8+0x0]
2611457- 1314d9f:	48 83 c3 18          	add    rbx,0x18
2611458- 1314da3:	4c 39 fb             	cmp    rbx,r15
2611459- 1314da6:	75 92                	jne    1314d3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a2be>
2611460- 1314da8:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
2611461- 1314dad:	e8 0e 98 7c ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
2611462- 1314db2:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
2611463- 1314db7:	e8 04 98 7c ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
2611464- 1314dbc:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
2611465- 1314dc3:	00 
2611466- 1314dc4:	e8 f7 97 7c ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
2611467- 1314dc9:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
2611468- 1314dd0:	00 
2611469- 1314dd1:	e8 26 a8 78 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
2611470- 1314dd6:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
2611471- 1314ddb:	e8 1c a8 78 ff       	call   a9f5fc <JNI_OnUnload@@Base+0x26ec9>
2611472- 1314de0:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2611473- 1314de7:	00 00 
2611474- 1314de9:	48 3b 84 24 00 01 00 	cmp    rax,QWORD PTR [rsp+0x100]
2611475- 1314df0:	00 
2611476- 1314df1:	0f 85 ff 00 00 00    	jne    1314ef6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15a47a>
2611477- 1314df7:	48 81 c4 08 01 00 00 	add    rsp,0x108
2611478- 1314dfe:	5b                   	pop    rbx
2611479- 1314dff:	41 5c                	pop    r12
2611480- 1314e01:	41 5d                	pop    r13
2613374- 13169bd:	00 
2613375- 13169be:	4c 89 3a             	mov    QWORD PTR [rdx],r15
2613376- 13169c1:	48 89 84 24 50 07 00 	mov    QWORD PTR [rsp+0x750],rax
2613377- 13169c8:	00 
2613378- 13169c9:	48 89 94 24 58 07 00 	mov    QWORD PTR [rsp+0x758],rdx
2613379- 13169d0:	00 
2613380- 13169d1:	48 89 8c 24 60 07 00 	mov    QWORD PTR [rsp+0x760],rcx
2613381- 13169d8:	00 
2613382- 13169d9:	c6 84 24 68 07 00 00 	mov    BYTE PTR [rsp+0x768],0x0
2613383- 13169e0:	00 
2613384- 13169e1:	4d 69 e6 d0 02 00 00 	imul   r12,r14,0x2d0
2613385- 13169e8:	41 bd d0 02 00 00    	mov    r13d,0x2d0
2613386- 13169ee:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
2613387- 13169f2:	4d 89 fe             	mov    r14,r15
2613388- 13169f5:	4c 89 f7             	mov    rdi,r14
2613389- 13169f8:	48 89 de             	mov    rsi,rbx
2613390- 13169fb:	e8 94 22 f0 ff       	call   1218c94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5e218>
2613391- 1316a00:	4c 01 eb             	add    rbx,r13
2613393- 1316a0a:	00 
2613394- 1316a0b:	4d 01 ee             	add    r14,r13
2613396- 1316a15:	00 
2613397- 1316a16:	49 81 c4 30 fd ff ff 	add    r12,0xfffffffffffffd30
2613398- 1316a1d:	75 d6                	jne    13169f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15bf79>
2613399- 1316a1f:	48 8d bc 24 50 07 00 	lea    rdi,[rsp+0x750]
2613400- 1316a26:	00 
2613401- 1316a27:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
2613402- 1316a2b:	e8 c2 33 f0 ff       	call   1219df2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5f376>
2613403- 1316a30:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
2613404- 1316a35:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
2613405- 1316a3a:	48 8d bc 24 f0 0d 00 	lea    rdi,[rsp+0xdf0]
2613406- 1316a41:	00 
2613407- 1316a42:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
2613408- 1316a46:	e8 d3 e1 f0 ff       	call   1224c1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6a1a2>
2613409- 1316a4b:	48 8d 9c 24 a0 14 00 	lea    rbx,[rsp+0x14a0]
2613410- 1316a52:	00 
2613411- 1316a53:	48 8d b4 24 10 0e 00 	lea    rsi,[rsp+0xe10]
2613412- 1316a5a:	00 
2613413- 1316a5b:	48 8d 54 24 70       	lea    rdx,[rsp+0x70]
2613414- 1316a60:	48 89 df             	mov    rdi,rbx
2613415- 1316a63:	e8 76 b9 fe ff       	call   13023de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x147962>
2613416- 1316a68:	48 8d bc 24 40 1b 00 	lea    rdi,[rsp+0x1b40]
2613417- 1316a6f:	00 
2613418- 1316a70:	48 8d 94 24 88 00 00 	lea    rdx,[rsp+0x88]
2613419- 1316a77:	00 
2613420- 1316a78:	48 89 de             	mov    rsi,rbx
2613421- 1316a7b:	31 c9                	xor    ecx,ecx
2613422- 1316a7d:	e8 a9 27 ff ff       	call   130922b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14e7af>
2613423- 1316a82:	48 8d bc 24 a0 14 00 	lea    rdi,[rsp+0x14a0]
2614213- 131764d:	41 57                	push   r15
2614214- 131764f:	41 56                	push   r14
2614215- 1317651:	53                   	push   rbx
2614216- 1317652:	48 81 ec 68 01 00 00 	sub    rsp,0x168
2614217- 1317659:	48 89 fb             	mov    rbx,rdi
2614218- 131765c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2614219- 1317663:	00 00 
2614220- 1317665:	48 89 84 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rax
2614221- 131766c:	00 
2614222- 131766d:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
2614223- 1317672:	4c 89 f7             	mov    rdi,r14
2614224- 1317675:	e8 dc 6d f8 ff       	call   129e456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe39da>
2614225- 131767a:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
2614226- 1317681:	00 
2614227- 1317682:	4c 89 f6             	mov    rsi,r14
2614228- 1317685:	e8 12 b1 8f ff       	call   c1279c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f73c>
2614229- 131768a:	48 8d b4 24 b8 00 00 	lea    rsi,[rsp+0xb8]
2614230- 1317691:	00 
2614232- 1317699:	48 89 df             	mov    rdi,rbx
2614233- 131769c:	e8 1c 02 00 00       	call   13178bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ce41>
2614234- 13176a1:	49 89 c6             	mov    r14,rax
2614235- 13176a4:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
2614236- 13176ab:	00 
2614237- 13176ac:	e8 b5 64 2a 00       	call   15bdb66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4030ea>
2614238- 13176b1:	4d 85 f6             	test   r14,r14
2614239- 13176b4:	74 08                	je     13176be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cc42>
2614240- 13176b6:	41 8b 2e             	mov    ebp,DWORD PTR [r14]
2614241- 13176b9:	e9 77 01 00 00       	jmp    1317835 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cdb9>
2614242- 13176be:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
2614243- 13176c2:	e8 1f ac 2a 00       	call   15c22e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786a>
2614244- 13176c7:	4c 8b 78 08          	mov    r15,QWORD PTR [rax+0x8]
2614245- 13176cb:	49 8b 77 68          	mov    rsi,QWORD PTR [r15+0x68]
2614246- 13176cf:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
2614247- 13176d6:	00 
2614248- 13176d7:	e8 10 8e 36 00       	call   16804ec <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x34658>
2614249- 13176dc:	4c 8b b4 24 b8 00 00 	mov    r14,QWORD PTR [rsp+0xb8]
2614250- 13176e3:	00 
2614251- 13176e4:	4d 85 f6             	test   r14,r14
2614252- 13176e7:	74 30                	je     1317719 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cc9d>
2614253- 13176e9:	49 8b 87 18 01 00 00 	mov    rax,QWORD PTR [r15+0x118]
2614254- 13176f0:	83 64 24 14 00       	and    DWORD PTR [rsp+0x14],0x0
2614255- 13176f5:	8b 4c 24 18          	mov    ecx,DWORD PTR [rsp+0x18]
2614256- 13176f9:	83 f9 01             	cmp    ecx,0x1
2614257- 13176fc:	74 32                	je     1317730 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ccb4>
2614258- 13176fe:	85 c9                	test   ecx,ecx
2614259- 1317700:	75 52                	jne    1317754 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ccd8>
2614288- 131776d:	e8 74 9b e1 ff       	call   11312e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f86fc>
2614289- 1317772:	e9 84 00 00 00       	jmp    13177fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd7f>
2614290- 1317777:	d1 e9                	shr    ecx,1
2614291- 1317779:	48 85 c9             	test   rcx,rcx
2614292- 131777c:	74 30                	je     13177ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd32>
2614293- 131777e:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2614294- 1317785:	00 
2614295- 1317786:	4c 8b 78 30          	mov    r15,QWORD PTR [rax+0x30]
2614296- 131778a:	e8 a7 40 76 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2614297- 131778f:	49 89 d0             	mov    r8,rdx
2614298- 1317792:	4d 8b 17             	mov    r10,QWORD PTR [r15]
2614299- 1317795:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2614300- 131779a:	4c 8d 4c 24 14       	lea    r9,[rsp+0x14]
2614301- 131779f:	4c 89 fe             	mov    rsi,r15
2614302- 13177a2:	4c 89 f2             	mov    rdx,r14
2614303- 13177a5:	48 89 c1             	mov    rcx,rax
2614304- 13177a8:	41 ff 52 60          	call   QWORD PTR [r10+0x60]
2614305- 13177ac:	eb 4d                	jmp    13177fb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd7f>
2614307- 13177b5:	00 
2614308- 13177b6:	f6 c1 01             	test   cl,0x1
2614309- 13177b9:	74 0a                	je     13177c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd49>
2614311- 13177c2:	00 
2614312- 13177c3:	eb 02                	jmp    13177c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cd4b>
2614313- 13177c5:	d1 e9                	shr    ecx,1
2614314- 13177c7:	48 85 c9             	test   rcx,rcx
2614315- 13177ca:	0f 84 92 00 00 00    	je     1317862 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cde6>
2614316- 13177d0:	4c 8d 84 24 a0 00 00 	lea    r8,[rsp+0xa0]
2614317- 13177d7:	00 
2614318- 13177d8:	45 0f b6 48 e0       	movzx  r9d,BYTE PTR [r8-0x20]
2614319- 13177dd:	48 8b 70 20          	mov    rsi,QWORD PTR [rax+0x20]
2614320- 13177e1:	48 8b 50 30          	mov    rdx,QWORD PTR [rax+0x30]
2614321- 13177e5:	48 8d 44 24 14       	lea    rax,[rsp+0x14]
2614322- 13177ea:	48 89 04 24          	mov    QWORD PTR [rsp],rax
2614323- 13177ee:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2614324- 13177f3:	4c 89 f1             	mov    rcx,r14
2614325- 13177f6:	e8 2b 8d 2b 00       	call   15d0526 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x415aaa>
2614326- 13177fb:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
2614327- 1317802:	00 
2614328- 1317803:	e8 7e 6c 78 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2614329- 1317808:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
2614330- 131780d:	31 ed                	xor    ebp,ebp
2614331- 131780f:	48 85 ff             	test   rdi,rdi
2614332- 1317812:	75 1c                	jne    1317830 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cdb4>
2614333- 1317814:	8b 4c 24 14          	mov    ecx,DWORD PTR [rsp+0x14]
2614334- 1317818:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
2614335- 131781d:	48 89 df             	mov    rdi,rbx
2614336- 1317820:	31 d2                	xor    edx,edx
2614337- 1317822:	e8 67 01 00 00       	call   131798e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf12>
2614338- 1317827:	8b 6c 24 14          	mov    ebp,DWORD PTR [rsp+0x14]
2614452- 131798d:	cc                   	int3
2614453- 131798e:	55                   	push   rbp
2614454- 131798f:	41 57                	push   r15
2614455- 1317991:	41 56                	push   r14
2614456- 1317993:	41 55                	push   r13
2614457- 1317995:	41 54                	push   r12
2614458- 1317997:	53                   	push   rbx
2614459- 1317998:	48 81 ec d8 00 00 00 	sub    rsp,0xd8
2614460- 131799f:	89 4c 24 04          	mov    DWORD PTR [rsp+0x4],ecx
2614461- 13179a3:	89 d5                	mov    ebp,edx
2614462- 13179a5:	49 89 fe             	mov    r14,rdi
2614463- 13179a8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2614464- 13179af:	00 00 
2614465- 13179b1:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
2614466- 13179b8:	00 
2614467- 13179b9:	4c 8d 7c 24 10       	lea    r15,[rsp+0x10]
2614468- 13179be:	4c 89 ff             	mov    rdi,r15
2614469- 13179c1:	e8 d6 ad 8f ff       	call   c1279c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f73c>
2614471- 13179cd:	4c 89 ff             	mov    rdi,r15
2614472- 13179d0:	e8 b9 04 00 00       	call   1317e8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d412>
2614473- 13179d5:	49 89 c7             	mov    r15,rax
2614474- 13179d8:	49 8b 5e 08          	mov    rbx,QWORD PTR [r14+0x8]
2614475- 13179dc:	48 85 db             	test   rbx,rbx
2614476- 13179df:	74 14                	je     13179f5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf79>
2614477- 13179e1:	f3 4c 0f b8 eb       	popcnt r13,rbx
2614478- 13179e6:	49 83 fd 01          	cmp    r13,0x1
2614479- 13179ea:	77 0b                	ja     13179f7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf7b>
2614480- 13179ec:	4c 8d 63 ff          	lea    r12,[rbx-0x1]
2614481- 13179f0:	4d 21 fc             	and    r12,r15
2614482- 13179f3:	eb 15                	jmp    1317a0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf8e>
2614483- 13179f5:	eb 78                	jmp    1317a6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cff3>
2614484- 13179f7:	4d 89 fc             	mov    r12,r15
2614485- 13179fa:	49 39 df             	cmp    r15,rbx
2614486- 13179fd:	72 0b                	jb     1317a0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cf8e>
2614487- 13179ff:	4c 89 f8             	mov    rax,r15
2614488- 1317a02:	31 d2                	xor    edx,edx
2614489- 1317a04:	48 f7 f3             	div    rbx
2614490- 1317a07:	49 89 d4             	mov    r12,rdx
2614491- 1317a0a:	49 8b 06             	mov    rax,QWORD PTR [r14]
2614492- 1317a0d:	4a 8b 04 e0          	mov    rax,QWORD PTR [rax+r12*8]
2614493- 1317a11:	48 85 c0             	test   rax,rax
2614494- 1317a14:	74 59                	je     1317a6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cff3>
2614495- 1317a16:	48 8b 28             	mov    rbp,QWORD PTR [rax]
2614496- 1317a19:	48 85 ed             	test   rbp,rbp
2614497- 1317a1c:	74 51                	je     1317a6f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15cff3>
2614498- 1317a1e:	48 8d 43 ff          	lea    rax,[rbx-0x1]
2614910- 1317fb8:	4c 01 f8             	add    rax,r15
2614911- 1317fbb:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
2614912- 1317fbe:	48 89 ca             	mov    rdx,rcx
2614913- 1317fc1:	48 c1 e2 06          	shl    rdx,0x6
2614914- 1317fc5:	48 01 c2             	add    rdx,rax
2614915- 1317fc8:	48 89 c8             	mov    rax,rcx
2614916- 1317fcb:	48 c1 e8 02          	shr    rax,0x2
2614917- 1317fcf:	48 01 d0             	add    rax,rdx
2614918- 1317fd2:	48 31 c8             	xor    rax,rcx
2614919- 1317fd5:	49 89 06             	mov    QWORD PTR [r14],rax
2614920- 1317fd8:	48 8d 73 70          	lea    rsi,[rbx+0x70]
2614921- 1317fdc:	4c 89 f7             	mov    rdi,r14
2614922- 1317fdf:	e8 00 47 94 ff       	call   c5c6e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a9684>
2614923- 1317fe4:	48 8d b3 88 00 00 00 	lea    rsi,[rbx+0x88]
2614924- 1317feb:	4c 89 f7             	mov    rdi,r14
2614925- 1317fee:	e8 f1 46 94 ff       	call   c5c6e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a9684>
2614926- 1317ff3:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
2614927- 1317ff6:	4c 01 f9             	add    rcx,r15
2614929- 1318000:	64 48 8b 14 25 28 00 	mov    rdx,QWORD PTR fs:0x28
2614930- 1318007:	00 00 
2614931- 1318009:	48 3b 54 24 10       	cmp    rdx,QWORD PTR [rsp+0x10]
2614932- 131800e:	75 64                	jne    1318074 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d5f8>
2614933- 1318010:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
2614934- 1318014:	4c 01 fe             	add    rsi,r15
2614935- 1318017:	4d 01 fc             	add    r12,r15
2614936- 131801a:	4c 89 e2             	mov    rdx,r12
2614937- 131801d:	48 c1 e2 06          	shl    rdx,0x6
2614938- 1318021:	48 01 f2             	add    rdx,rsi
2614939- 1318024:	4c 89 e6             	mov    rsi,r12
2614940- 1318027:	48 c1 ee 02          	shr    rsi,0x2
2614941- 131802b:	48 01 d6             	add    rsi,rdx
2614942- 131802e:	4c 31 e6             	xor    rsi,r12
2614943- 1318031:	48 89 f2             	mov    rdx,rsi
2614944- 1318034:	48 c1 e2 06          	shl    rdx,0x6
2614945- 1318038:	48 01 d1             	add    rcx,rdx
2614946- 131803b:	48 89 f2             	mov    rdx,rsi
2614947- 131803e:	48 c1 ea 02          	shr    rdx,0x2
2614948- 1318042:	48 01 ca             	add    rdx,rcx
2614949- 1318045:	48 31 f2             	xor    rdx,rsi
2614950- 1318048:	4c 01 fa             	add    rdx,r15
2614951- 131804b:	4c 01 f8             	add    rax,r15
2614952- 131804e:	48 89 d1             	mov    rcx,rdx
2614953- 1318051:	48 c1 e1 06          	shl    rcx,0x6
2614954- 1318055:	48 01 c1             	add    rcx,rax
2614955- 1318058:	48 89 d0             	mov    rax,rdx
2614956- 131805b:	48 c1 e8 02          	shr    rax,0x2
2615067- 13181c2:	4d 39 fc             	cmp    r12,r15
2615068- 13181c5:	75 c9                	jne    1318190 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d714>
2615069- 13181c7:	84 c0                	test   al,al
2615070- 13181c9:	74 2d                	je     13181f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d77c>
2615071- 13181cb:	41 8a 46 68          	mov    al,BYTE PTR [r14+0x68]
2615072- 13181cf:	3a 43 68             	cmp    al,BYTE PTR [rbx+0x68]
2615073- 13181d2:	75 24                	jne    13181f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d77c>
2615074- 13181d4:	49 8d 7e 70          	lea    rdi,[r14+0x70]
2615075- 13181d8:	48 8d 73 70          	lea    rsi,[rbx+0x70]
2615076- 13181dc:	e8 0d 75 78 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
2615077- 13181e1:	84 c0                	test   al,al
2615078- 13181e3:	74 13                	je     13181f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d77c>
2615079- 13181e5:	be 88 00 00 00       	mov    esi,0x88
2615080- 13181ea:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2615081- 13181ee:	48 01 de             	add    rsi,rbx
2615082- 13181f1:	e8 f8 74 78 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
2615083- 13181f6:	eb 02                	jmp    13181fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d77e>
2615084- 13181f8:	31 c0                	xor    eax,eax
2615086- 1318201:	3a 8b a0 00 00 00    	cmp    cl,BYTE PTR [rbx+0xa0]
2615087- 1318207:	0f 94 c1             	sete   cl
2615088- 131820a:	20 c1                	and    cl,al
2615089- 131820c:	89 c8                	mov    eax,ecx
2615090- 131820e:	48 83 c4 08          	add    rsp,0x8
2615091- 1318212:	5b                   	pop    rbx
2615092- 1318213:	41 5c                	pop    r12
2615093- 1318215:	41 5d                	pop    r13
2615094- 1318217:	41 5e                	pop    r14
2615095- 1318219:	41 5f                	pop    r15
2615096- 131821b:	5d                   	pop    rbp
2615097- 131821c:	c3                   	ret
2615098- 131821d:	cc                   	int3
2615099- 131821e:	53                   	push   rbx
2615100- 131821f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
2615101- 1318222:	48 83 27 00          	and    QWORD PTR [rdi],0x0
2615102- 1318226:	48 85 db             	test   rbx,rbx
2615103- 1318229:	74 18                	je     1318243 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d7c7>
2615104- 131822b:	80 7f 10 00          	cmp    BYTE PTR [rdi+0x10],0x0
2615105- 131822f:	74 09                	je     131823a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d7be>
2615106- 1318231:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
2615107- 1318235:	e8 2c 59 2a 00       	call   15bdb66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4030ea>
2615108- 131823a:	48 89 df             	mov    rdi,rbx
2615109- 131823d:	5b                   	pop    rbx
2615110- 131823e:	e9 dd 5c 4d 00       	jmp    17edf20 <_ZdlPv@plt>
2615111- 1318243:	5b                   	pop    rbx
2615112- 1318244:	c3                   	ret
2615113- 1318245:	cc                   	int3
2615114- 1318246:	55                   	push   rbp
2615115- 1318247:	41 57                	push   r15
2615116- 1318249:	41 56                	push   r14
2615117- 131824b:	41 54                	push   r12
2615118- 131824d:	53                   	push   rbx
2615119- 131824e:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
2615120- 1318255:	48 89 cb             	mov    rbx,rcx
2615121- 1318258:	89 d5                	mov    ebp,edx
2615122- 131825a:	49 89 f6             	mov    r14,rsi
2615123- 131825d:	49 89 ff             	mov    r15,rdi
2615124- 1318260:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2615125- 1318267:	00 00 
2615127- 1318270:	00 
2615128- 1318271:	48 83 c7 50          	add    rdi,0x50
2615129- 1318275:	e8 6c a0 2a 00       	call   15c22e6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40786a>
2615130- 131827a:	49 89 e4             	mov    r12,rsp
2615131- 131827d:	4c 89 e7             	mov    rdi,r12
2615132- 1318280:	4c 89 f6             	mov    rsi,r14
2615133- 1318283:	e8 14 a5 8f ff       	call   c1279c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15f73c>
2615135- 131828f:	00 
2615136- 1318290:	4c 89 ff             	mov    rdi,r15
2615137- 1318293:	4c 89 e6             	mov    rsi,r12
2615138- 1318296:	e8 22 f6 ff ff       	call   13178bd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ce41>
2615139- 131829b:	49 89 c6             	mov    r14,rax
2615140- 131829e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2615141- 13182a3:	e8 be 58 2a 00       	call   15bdb66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4030ea>
2615142- 13182a8:	4d 85 f6             	test   r14,r14
2615143- 13182ab:	74 05                	je     13182b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d836>
2615144- 13182ad:	41 8b 06             	mov    eax,DWORD PTR [r14]
2615145- 13182b0:	89 03                	mov    DWORD PTR [rbx],eax
2615146- 13182b2:	4d 85 f6             	test   r14,r14
2615147- 13182b5:	0f 95 c0             	setne  al
2615148- 13182b8:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
2615149- 13182bf:	00 00 
2615150- 13182c1:	48 3b 8c 24 a8 00 00 	cmp    rcx,QWORD PTR [rsp+0xa8]
2615151- 13182c8:	00 
2615152- 13182c9:	75 10                	jne    13182db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d85f>
2615153- 13182cb:	48 81 c4 b0 00 00 00 	add    rsp,0xb0
2615154- 13182d2:	5b                   	pop    rbx
2615155- 13182d3:	41 5c                	pop    r12
2615156- 13182d5:	41 5e                	pop    r14
2615157- 13182d7:	41 5f                	pop    r15
2615158- 13182d9:	5d                   	pop    rbp
2615159- 13182da:	c3                   	ret
2615160- 13182db:	e8 d0 77 4d 00       	call   17efab0 <__stack_chk_fail@plt>
2615161- 13182e0:	55                   	push   rbp
2615162- 13182e1:	41 57                	push   r15
2615775- 1318b9a:	48 89 df             	mov    rdi,rbx
2615776- 1318b9d:	e8 2e 71 75 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2615777- 1318ba2:	e8 09 6f 4d 00       	call   17efab0 <__stack_chk_fail@plt>
2615778- 1318ba7:	cc                   	int3
2615779- 1318ba8:	48 8b 87 18 02 00 00 	mov    rax,QWORD PTR [rdi+0x218]
2615780- 1318baf:	c3                   	ret
2615781- 1318bb0:	55                   	push   rbp
2615782- 1318bb1:	41 57                	push   r15
2615783- 1318bb3:	41 56                	push   r14
2615784- 1318bb5:	41 55                	push   r13
2615785- 1318bb7:	41 54                	push   r12
2615786- 1318bb9:	53                   	push   rbx
2615787- 1318bba:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
2615788- 1318bc1:	48 89 54 24 10       	mov    QWORD PTR [rsp+0x10],rdx
2615789- 1318bc6:	49 89 f6             	mov    r14,rsi
2615790- 1318bc9:	48 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],rdi
2615791- 1318bce:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2615792- 1318bd5:	00 00 
2615794- 1318bde:	00 
2615795- 1318bdf:	48 8b be d8 00 00 00 	mov    rdi,QWORD PTR [rsi+0xd8]
2615796- 1318be6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2615797- 1318be9:	ff 50 38             	call   QWORD PTR [rax+0x38]
2615798- 1318bec:	48 85 c0             	test   rax,rax
2615799- 1318bef:	75 0e                	jne    1318bff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e183>
2615800- 1318bf1:	41 80 be b0 01 00 00 	cmp    BYTE PTR [r14+0x1b0],0x0
2615801- 1318bf8:	00 
2615802- 1318bf9:	75 04                	jne    1318bff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e183>
2615803- 1318bfb:	31 c0                	xor    eax,eax
2615804- 1318bfd:	eb 6b                	jmp    1318c6a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15e1ee>
2615805- 1318bff:	49 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [r14+0xb8]
2615806- 1318c06:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
2615807- 1318c0b:	4d 8b a6 c0 00 00 00 	mov    r12,QWORD PTR [r14+0xc0]
2615808- 1318c12:	4d 8b ae d0 00 00 00 	mov    r13,QWORD PTR [r14+0xd0]
2615809- 1318c19:	49 8d ae 10 01 00 00 	lea    rbp,[r14+0x110]
2615810- 1318c20:	49 8b be c8 00 00 00 	mov    rdi,QWORD PTR [r14+0xc8]
2615811- 1318c27:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2615812- 1318c2a:	ff 50 10             	call   QWORD PTR [rax+0x10]
2615813- 1318c2d:	89 c3                	mov    ebx,eax
2615814- 1318c2f:	4d 8d be e0 00 00 00 	lea    r15,[r14+0xe0]
2615815- 1318c36:	49 8b be d8 00 00 00 	mov    rdi,QWORD PTR [r14+0xd8]
2615816- 1318c3d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2615817- 1318c40:	ff 50 38             	call   QWORD PTR [rax+0x38]
2615818- 1318c43:	44 0f b6 cb          	movzx  r9d,bl
2615819- 1318c47:	48 8d 5c 24 40       	lea    rbx,[rsp+0x40]
2615820- 1318c4c:	48 89 df             	mov    rdi,rbx
2615821- 1318c4f:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
2616633- 13197e9:	4c 89 f7             	mov    rdi,r14
2616634- 13197ec:	48 89 c6             	mov    rsi,rax
2616635- 13197ef:	e8 34 bc 3a 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
2616636- 13197f4:	41 8b 46 38          	mov    eax,DWORD PTR [r14+0x38]
2616637- 13197f8:	83 f8 64             	cmp    eax,0x64
2616638- 13197fb:	0f 84 7f 02 00 00    	je     1319a80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f004>
2616639- 1319801:	83 f8 3f             	cmp    eax,0x3f
2616640- 1319804:	0f 84 03 01 00 00    	je     131990d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ee91>
2616641- 131980a:	83 f8 60             	cmp    eax,0x60
2616642- 131980d:	0f 84 d1 01 00 00    	je     13199e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ef68>
2616643- 1319813:	83 f8 09             	cmp    eax,0x9
2616644- 1319816:	0f 85 00 03 00 00    	jne    1319b1c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f0a0>
2616645- 131981c:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
2616646- 1319820:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
2616647- 1319824:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2616648- 1319828:	e8 b3 ea ff ff       	call   13182e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d864>
2616649- 131982d:	49 89 c4             	mov    r12,rax
2616650- 1319830:	4c 8b 6b 38          	mov    r13,QWORD PTR [rbx+0x38]
2616652- 131983b:	bf 20 01 00 00       	mov    edi,0x120
2616653- 1319840:	e8 bb 46 4d 00       	call   17edf00 <_Znwm@plt>
2616654- 1319845:	49 89 c6             	mov    r14,rax
2616655- 1319848:	49 69 ef 40 42 0f 00 	imul   rbp,r15,0xf4240
2616656- 131984f:	48 8d 05 b2 bb 54 00 	lea    rax,[rip+0x54bbb2]        # 1865408 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21af0>
2616657- 1319856:	49 89 06             	mov    QWORD PTR [r14],rax
2616658- 1319859:	4d 8d 7e 08          	lea    r15,[r14+0x8]
2616659- 131985d:	48 8d b4 24 e8 01 00 	lea    rsi,[rsp+0x1e8]
2616660- 1319864:	00 
2616661- 1319865:	4c 89 ff             	mov    rdi,r15
2616662- 1319868:	e8 f9 05 3b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
2616663- 131986d:	49 89 6e 60          	mov    QWORD PTR [r14+0x60],rbp
2616664- 1319871:	4d 89 6e 68          	mov    QWORD PTR [r14+0x68],r13
2616665- 1319875:	4d 8d 6e 70          	lea    r13,[r14+0x70]
2616666- 1319879:	4c 89 ef             	mov    rdi,r13
2616667- 131987c:	e8 13 06 00 00       	call   1319e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f418>
2616668- 1319881:	4c 89 f5             	mov    rbp,r14
2616669- 1319884:	48 81 c5 08 01 00 00 	add    rbp,0x108
2616670- 131988b:	41 0f b6 14 24       	movzx  edx,BYTE PTR [r12]
2616671- 1319890:	f6 c2 01             	test   dl,0x1
2616672- 1319893:	0f 84 5a 03 00 00    	je     1319bf3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f177>
2616673- 1319899:	41 8b 54 24 08       	mov    edx,DWORD PTR [r12+0x8]
2616674- 131989e:	4d 8b 64 24 10       	mov    r12,QWORD PTR [r12+0x10]
2616675- 13198a3:	e9 50 03 00 00       	jmp    1319bf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f17c>
2616676- 13198a8:	bf f8 00 00 00       	mov    edi,0xf8
2616677- 13198ad:	e8 4e 46 4d 00       	call   17edf00 <_Znwm@plt>
2616678- 13198b2:	49 89 c6             	mov    r14,rax
2616679- 13198b5:	48 8d 05 94 b3 54 00 	lea    rax,[rip+0x54b394]        # 1864c50 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21338>
2616680- 13198bc:	49 89 06             	mov    QWORD PTR [r14],rax
2616681- 13198bf:	49 8d 7e 08          	lea    rdi,[r14+0x8]
2616682- 13198c3:	e8 cc 05 00 00       	call   1319e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f418>
2616683- 13198c8:	41 83 a6 d8 00 00 00 	and    DWORD PTR [r14+0xd8],0x0
2616684- 13198cf:	00 
2616685- 13198d0:	0f 57 c0             	xorps  xmm0,xmm0
2616687- 13198da:	00 
2616688- 13198db:	41 0f 11 86 b0 00 00 	movups XMMWORD PTR [r14+0xb0],xmm0
2616689- 13198e2:	00 
2616690- 13198e3:	41 0f 11 86 c0 00 00 	movups XMMWORD PTR [r14+0xc0],xmm0
2616691- 13198ea:	00 
2616692- 13198eb:	48 8b bb b0 00 00 00 	mov    rdi,QWORD PTR [rbx+0xb0]
2616693- 13198f2:	4c 89 b3 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],r14
2616694- 13198f9:	48 85 ff             	test   rdi,rdi
2616695- 13198fc:	0f 84 30 04 00 00    	je     1319d32 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f2b6>
2616696- 1319902:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2616697- 1319905:	ff 50 08             	call   QWORD PTR [rax+0x8]
2616698- 1319908:	e9 9b fe ff ff       	jmp    13197a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ed2c>
2616699- 131990d:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
2616700- 1319912:	4c 89 f7             	mov    rdi,r14
2616701- 1319915:	e8 34 ec 84 ff       	call   b6854e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54ee>
2616702- 131991a:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
2616703- 131991e:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
2616704- 1319922:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2616705- 1319926:	4c 89 f2             	mov    rdx,r14
2616706- 1319929:	e8 10 3d 90 ff       	call   c1d63e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a5de>
2616707- 131992e:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
2616708- 1319932:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
2616709- 1319936:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2616710- 131993a:	e8 a1 e9 ff ff       	call   13182e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d864>
2616711- 131993f:	49 89 c5             	mov    r13,rax
2616713- 1319949:	bf 88 02 00 00       	mov    edi,0x288
2616714- 131994e:	e8 ad 45 4d 00       	call   17edf00 <_Znwm@plt>
2616715- 1319953:	49 89 c6             	mov    r14,rax
2616716- 1319956:	48 8d 05 5b b2 54 00 	lea    rax,[rip+0x54b25b]        # 1864bb8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x212a0>
2616717- 131995d:	49 89 06             	mov    QWORD PTR [r14],rax
2616718- 1319960:	49 8d 7e 08          	lea    rdi,[r14+0x8]
2616719- 1319964:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
2616720- 1319969:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
2616721- 131996e:	e8 9f 80 90 ff       	call   c21a12 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e9b2>
2616722- 1319973:	4d 69 e7 40 42 0f 00 	imul   r12,r15,0xf4240
2616723- 131997a:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
2616724- 131997e:	49 8d be 60 01 00 00 	lea    rdi,[r14+0x160]
2616725- 1319985:	48 8d b4 24 e8 01 00 	lea    rsi,[rsp+0x1e8]
2616726- 131998c:	00 
2616727- 131998d:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
2616728- 1319992:	e8 cf 04 3b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
2616729- 1319997:	4d 89 a6 b8 01 00 00 	mov    QWORD PTR [r14+0x1b8],r12
2616730- 131999e:	49 8d ae c0 01 00 00 	lea    rbp,[r14+0x1c0]
2616731- 13199a5:	48 89 ef             	mov    rdi,rbp
2616732- 13199a8:	4c 89 fe             	mov    rsi,r15
2616733- 13199ab:	e8 90 45 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2616734- 13199b0:	4d 8d be d8 01 00 00 	lea    r15,[r14+0x1d8]
2616735- 13199b7:	4c 89 ff             	mov    rdi,r15
2616736- 13199ba:	e8 d5 04 00 00       	call   1319e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f418>
2616737- 13199bf:	4d 89 f4             	mov    r12,r14
2616738- 13199c2:	49 81 c4 70 02 00 00 	add    r12,0x270
2616739- 13199c9:	41 0f b6 55 00       	movzx  edx,BYTE PTR [r13+0x0]
2616740- 13199ce:	f6 c2 01             	test   dl,0x1
2616741- 13199d1:	0f 84 b2 02 00 00    	je     1319c89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f20d>
2616742- 13199d7:	41 8b 55 08          	mov    edx,DWORD PTR [r13+0x8]
2616743- 13199db:	4d 8b 6d 10          	mov    r13,QWORD PTR [r13+0x10]
2616744- 13199df:	e9 aa 02 00 00       	jmp    1319c8e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f212>
2616745- 13199e4:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
2616746- 13199e8:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
2616747- 13199ec:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2616748- 13199f0:	e8 eb e8 ff ff       	call   13182e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d864>
2616749- 13199f5:	49 89 c4             	mov    r12,rax
2616751- 13199ff:	bf 30 01 00 00       	mov    edi,0x130
2616752- 1319a04:	e8 f7 44 4d 00       	call   17edf00 <_Znwm@plt>
2616753- 1319a09:	49 89 c6             	mov    r14,rax
2616754- 1319a0c:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
2616755- 1319a10:	4d 69 ed 40 42 0f 00 	imul   r13,r13,0xf4240
2616756- 1319a17:	48 8d 05 9a b0 54 00 	lea    rax,[rip+0x54b09a]        # 1864ab8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x211a0>
2616757- 1319a1e:	49 89 06             	mov    QWORD PTR [r14],rax
2616758- 1319a21:	49 8d 7e 08          	lea    rdi,[r14+0x8]
2616759- 1319a25:	48 8d b4 24 e8 01 00 	lea    rsi,[rsp+0x1e8]
2616760- 1319a2c:	00 
2616761- 1319a2d:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
2616762- 1319a32:	e8 2f 04 3b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
2616763- 1319a37:	4d 89 6e 60          	mov    QWORD PTR [r14+0x60],r13
2616764- 1319a3b:	4d 8d 6e 68          	lea    r13,[r14+0x68]
2616765- 1319a3f:	4c 89 ef             	mov    rdi,r13
2616766- 1319a42:	4c 89 fe             	mov    rsi,r15
2616767- 1319a45:	e8 f6 44 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2616768- 1319a4a:	49 8d ae 80 00 00 00 	lea    rbp,[r14+0x80]
2616769- 1319a51:	48 89 ef             	mov    rdi,rbp
2616770- 1319a54:	e8 3b 04 00 00       	call   1319e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f418>
2616771- 1319a59:	4d 89 f7             	mov    r15,r14
2616772- 1319a5c:	49 81 c7 18 01 00 00 	add    r15,0x118
2616773- 1319a63:	41 0f b6 14 24       	movzx  edx,BYTE PTR [r12]
2616774- 1319a68:	f6 c2 01             	test   dl,0x1
2616775- 1319a6b:	0f 84 a7 01 00 00    	je     1319c18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f19c>
2616776- 1319a71:	41 8b 54 24 08       	mov    edx,DWORD PTR [r12+0x8]
2616777- 1319a76:	4d 8b 64 24 10       	mov    r12,QWORD PTR [r12+0x10]
2616778- 1319a7b:	e9 9d 01 00 00       	jmp    1319c1d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f1a1>
2616779- 1319a80:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
2616780- 1319a84:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
2616781- 1319a88:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2616782- 1319a8c:	e8 4f e8 ff ff       	call   13182e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d864>
2616783- 1319a91:	49 89 c4             	mov    r12,rax
2616785- 1319a9b:	bf 30 01 00 00       	mov    edi,0x130
2616786- 1319aa0:	e8 5b 44 4d 00       	call   17edf00 <_Znwm@plt>
2616787- 1319aa5:	49 89 c6             	mov    r14,rax
2616788- 1319aa8:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
2616789- 1319aac:	4d 69 ed 40 42 0f 00 	imul   r13,r13,0xf4240
2616790- 1319ab3:	48 8d 05 b6 b8 54 00 	lea    rax,[rip+0x54b8b6]        # 1865370 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21a58>
2616791- 1319aba:	49 89 06             	mov    QWORD PTR [r14],rax
2616792- 1319abd:	49 8d 7e 08          	lea    rdi,[r14+0x8]
2616793- 1319ac1:	48 8d b4 24 e8 01 00 	lea    rsi,[rsp+0x1e8]
2616794- 1319ac8:	00 
2616795- 1319ac9:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
2616796- 1319ace:	e8 93 03 3b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
2616797- 1319ad3:	4d 89 6e 60          	mov    QWORD PTR [r14+0x60],r13
2616798- 1319ad7:	4d 8d 6e 68          	lea    r13,[r14+0x68]
2616799- 1319adb:	4c 89 ef             	mov    rdi,r13
2616800- 1319ade:	4c 89 fe             	mov    rsi,r15
2616801- 1319ae1:	e8 5a 44 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2616802- 1319ae6:	49 8d ae 80 00 00 00 	lea    rbp,[r14+0x80]
2616803- 1319aed:	48 89 ef             	mov    rdi,rbp
2616804- 1319af0:	e8 9f 03 00 00       	call   1319e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f418>
2616805- 1319af5:	4d 89 f7             	mov    r15,r14
2616806- 1319af8:	49 81 c7 18 01 00 00 	add    r15,0x118
2616807- 1319aff:	41 0f b6 14 24       	movzx  edx,BYTE PTR [r12]
2616808- 1319b04:	f6 c2 01             	test   dl,0x1
2616809- 1319b07:	0f 84 30 01 00 00    	je     1319c3d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f1c1>
2616810- 1319b0d:	41 8b 54 24 08       	mov    edx,DWORD PTR [r12+0x8]
2616811- 1319b12:	4d 8b 64 24 10       	mov    r12,QWORD PTR [r12+0x10]
2616812- 1319b17:	e9 26 01 00 00       	jmp    1319c42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f1c6>
2616813- 1319b1c:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
2616814- 1319b21:	4c 89 f7             	mov    rdi,r14
2616815- 1319b24:	e8 8b 43 8f ff       	call   c0deb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ae54>
2616816- 1319b29:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
2616817- 1319b2d:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
2616818- 1319b31:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2616819- 1319b35:	4c 89 f2             	mov    rdx,r14
2616820- 1319b38:	e8 81 e2 8f ff       	call   c17dbe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x164d5e>
2616821- 1319b3d:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]
2616822- 1319b41:	48 8b 73 78          	mov    rsi,QWORD PTR [rbx+0x78]
2616823- 1319b45:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2616824- 1319b49:	e8 92 e7 ff ff       	call   13182e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15d864>
2616825- 1319b4e:	49 89 c5             	mov    r13,rax
2616827- 1319b58:	bf 00 03 00 00       	mov    edi,0x300
2616828- 1319b5d:	e8 9e 43 4d 00       	call   17edf00 <_Znwm@plt>
2616829- 1319b62:	49 89 c6             	mov    r14,rax
2616830- 1319b65:	48 8d 05 bc b1 54 00 	lea    rax,[rip+0x54b1bc]        # 1864d28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x21410>
2616831- 1319b6c:	49 89 06             	mov    QWORD PTR [r14],rax
2616832- 1319b6f:	49 8d 7e 08          	lea    rdi,[r14+0x8]
2616833- 1319b73:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
2616834- 1319b78:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
2616835- 1319b7d:	e8 bc 07 00 00       	call   131a33e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f8c2>
2616836- 1319b82:	4d 69 e7 40 42 0f 00 	imul   r12,r15,0xf4240
2616837- 1319b89:	4c 8d 7b 18          	lea    r15,[rbx+0x18]
2616838- 1319b8d:	49 8d be d8 01 00 00 	lea    rdi,[r14+0x1d8]
2616839- 1319b94:	48 8d b4 24 e8 01 00 	lea    rsi,[rsp+0x1e8]
2616840- 1319b9b:	00 
2616841- 1319b9c:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
2616842- 1319ba1:	e8 c0 02 3b 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
2616843- 1319ba6:	4d 89 a6 30 02 00 00 	mov    QWORD PTR [r14+0x230],r12
2616844- 1319bad:	49 8d ae 38 02 00 00 	lea    rbp,[r14+0x238]
2616845- 1319bb4:	48 89 ef             	mov    rdi,rbp
2616846- 1319bb7:	4c 89 fe             	mov    rsi,r15
2616847- 1319bba:	e8 81 43 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2616848- 1319bbf:	4d 8d be 50 02 00 00 	lea    r15,[r14+0x250]
2616849- 1319bc6:	4c 89 ff             	mov    rdi,r15
2616850- 1319bc9:	e8 c6 02 00 00       	call   1319e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f418>
2616851- 1319bce:	4d 89 f4             	mov    r12,r14
2616852- 1319bd1:	49 81 c4 e8 02 00 00 	add    r12,0x2e8
2616853- 1319bd8:	41 0f b6 55 00       	movzx  edx,BYTE PTR [r13+0x0]
2616854- 1319bdd:	f6 c2 01             	test   dl,0x1
2617168- 131a04d:	e8 dc b2 3a 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2617169- 131a052:	48 83 c3 08          	add    rbx,0x8
2617170- 131a056:	48 89 df             	mov    rdi,rbx
2617171- 131a059:	5b                   	pop    rbx
2617172- 131a05a:	e9 99 98 3b 00       	jmp    16d38f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x87a64>
2617173- 131a05f:	cc                   	int3
2617174- 131a060:	53                   	push   rbx
2617175- 131a061:	48 89 fb             	mov    rbx,rdi
2617176- 131a064:	e8 ab ff ff ff       	call   131a014 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f598>
2617177- 131a069:	48 89 df             	mov    rdi,rbx
2617178- 131a06c:	5b                   	pop    rbx
2617179- 131a06d:	e9 ae 3e 4d 00       	jmp    17edf20 <_ZdlPv@plt>
2617180- 131a072:	41 56                	push   r14
2617181- 131a074:	53                   	push   rbx
2617182- 131a075:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
2617183- 131a07c:	48 89 f3             	mov    rbx,rsi
2617184- 131a07f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2617185- 131a086:	00 00 
2617187- 131a08f:	00 
2617188- 131a090:	48 8d 77 08          	lea    rsi,[rdi+0x8]
2617189- 131a094:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
2617190- 131a099:	4c 89 f7             	mov    rdi,r14
2617191- 131a09c:	e8 d1 e5 84 ff       	call   b68672 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5612>
2617192- 131a0a1:	48 89 df             	mov    rdi,rbx
2617193- 131a0a4:	4c 89 f6             	mov    rsi,r14
2617194- 131a0a7:	e8 54 8b e8 ff       	call   11a2c00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a016>
2617195- 131a0ac:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2617196- 131a0b3:	00 00 
2617197- 131a0b5:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
2617198- 131a0bc:	00 
2617199- 131a0bd:	75 0d                	jne    131a0cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f650>
2617200- 131a0bf:	b0 01                	mov    al,0x1
2617201- 131a0c1:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
2617202- 131a0c8:	5b                   	pop    rbx
2617203- 131a0c9:	41 5e                	pop    r14
2617204- 131a0cb:	c3                   	ret
2617205- 131a0cc:	e8 df 59 4d 00       	call   17efab0 <__stack_chk_fail@plt>
2617206- 131a0d1:	cc                   	int3
2617207- 131a0d2:	41 56                	push   r14
2617208- 131a0d4:	53                   	push   rbx
2617209- 131a0d5:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
2617210- 131a0dc:	48 89 f3             	mov    rbx,rsi
2617211- 131a0df:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2617212- 131a0e6:	00 00 
2617214- 131a0ef:	00 
2617215- 131a0f0:	48 8d 77 08          	lea    rsi,[rdi+0x8]
2617216- 131a0f4:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
2617217- 131a0f9:	4c 89 f7             	mov    rdi,r14
2617218- 131a0fc:	e8 71 e5 84 ff       	call   b68672 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb5612>
2617219- 131a101:	48 89 df             	mov    rdi,rbx
2617220- 131a104:	4c 89 f6             	mov    rsi,r14
2617221- 131a107:	e8 74 8b e8 ff       	call   11a2c80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a096>
2617222- 131a10c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2617223- 131a113:	00 00 
2617224- 131a115:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
2617225- 131a11c:	00 
2617226- 131a11d:	75 0d                	jne    131a12c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f6b0>
2617227- 131a11f:	b0 01                	mov    al,0x1
2617228- 131a121:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
2617229- 131a128:	5b                   	pop    rbx
2617230- 131a129:	41 5e                	pop    r14
2617231- 131a12b:	c3                   	ret
2617232- 131a12c:	e8 7f 59 4d 00       	call   17efab0 <__stack_chk_fail@plt>
2617233- 131a131:	cc                   	int3
2617234- 131a132:	53                   	push   rbx
2617235- 131a133:	48 89 fb             	mov    rbx,rdi
2617236- 131a136:	48 81 c6 60 01 00 00 	add    rsi,0x160
2617237- 131a13d:	e8 e8 03 3b 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
2617238- 131a142:	48 89 d8             	mov    rax,rbx
2617239- 131a145:	5b                   	pop    rbx
2617240- 131a146:	c3                   	ret
2617241- 131a147:	cc                   	int3
2620751- 131d348:	48 8d 05 a9 24 12 ff 	lea    rax,[rip+0xffffffffff1224a9]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
2620752- 131d34f:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
2620753- 131d353:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
2620754- 131d357:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
2620755- 131d35b:	4c 89 ff             	mov    rdi,r15
2620756- 131d35e:	e8 d3 e4 75 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2620757- 131d363:	49 89 d0             	mov    r8,rdx
2620758- 131d366:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
2620759- 131d36a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
2620760- 131d36f:	6a 16                	push   0x16
2620761- 131d371:	5a                   	pop    rdx
2620762- 131d372:	4c 89 e6             	mov    rsi,r12
2620763- 131d375:	48 89 c1             	mov    rcx,rax
2620764- 131d378:	4d 89 e9             	mov    r9,r13
2620765- 131d37b:	41 ff 52 30          	call   QWORD PTR [r10+0x30]
2620766- 131d37f:	80 7c 24 40 01       	cmp    BYTE PTR [rsp+0x40],0x1
2620767- 131d384:	75 7b                	jne    131d401 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162985>
2620768- 131d386:	4c 8d 63 20          	lea    r12,[rbx+0x20]
2620770- 131d391:	00 
2620772- 131d399:	00 
2620773- 131d39a:	4c 89 e2             	mov    rdx,r12
2620774- 131d39d:	e8 b4 b1 84 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
2620775- 131d3a2:	84 c0                	test   al,al
2620776- 131d3a4:	74 5b                	je     131d401 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162985>
2620777- 131d3a6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2620778- 131d3ab:	4c 89 fe             	mov    rsi,r15
2620779- 131d3ae:	e8 8d 0b 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2620780- 131d3b3:	48 89 d8             	mov    rax,rbx
2620781- 131d3b6:	48 83 c0 18          	add    rax,0x18
2620782- 131d3ba:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
2620783- 131d3bf:	66 c7 46 18 16 00    	mov    WORD PTR [rsi+0x18],0x16
2620784- 131d3c5:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
2620785- 131d3ca:	48 89 02             	mov    QWORD PTR [rdx],rax
2620786- 131d3cd:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
2620787- 131d3d1:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
2620788- 131d3d6:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
2620789- 131d3da:	4c 89 f7             	mov    rdi,r14
2620790- 131d3dd:	e8 4c d6 ff ff       	call   131aa2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ffb2>
2620791- 131d3e2:	89 c5                	mov    ebp,eax
2620792- 131d3e4:	48 89 df             	mov    rdi,rbx
2620793- 131d3e7:	e8 9a 10 78 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2620794- 131d3ec:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2620795- 131d3f1:	e8 9a 0a 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2620796- 131d3f6:	31 db                	xor    ebx,ebx
2620797- 131d3f8:	40 84 ed             	test   bpl,bpl
2620798- 131d3fb:	4c 0f 44 e3          	cmove  r12,rbx
2620799- 131d3ff:	eb 03                	jmp    131d404 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x162988>
2621369- 131dc4d:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
2621370- 131dc51:	48 8d 05 a0 1b 12 ff 	lea    rax,[rip+0xffffffffff121ba0]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
2621371- 131dc58:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
2621372- 131dc5c:	48 89 45 20          	mov    QWORD PTR [rbp+0x20],rax
2621373- 131dc60:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
2621374- 131dc64:	4c 89 e7             	mov    rdi,r12
2621375- 131dc67:	e8 ca db 75 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2621376- 131dc6c:	49 89 d0             	mov    r8,rdx
2621377- 131dc6f:	4d 8b 55 00          	mov    r10,QWORD PTR [r13+0x0]
2621378- 131dc73:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
2621379- 131dc78:	6a 34                	push   0x34
2621380- 131dc7a:	5a                   	pop    rdx
2621381- 131dc7b:	4c 89 ee             	mov    rsi,r13
2621382- 131dc7e:	48 89 c1             	mov    rcx,rax
2621383- 131dc81:	49 89 e9             	mov    r9,rbp
2621384- 131dc84:	41 ff 52 30          	call   QWORD PTR [r10+0x30]
2621385- 131dc88:	80 7c 24 40 01       	cmp    BYTE PTR [rsp+0x40],0x1
2621386- 131dc8d:	75 77                	jne    131dd06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16328a>
2621388- 131dc96:	00 
2621390- 131dc9e:	00 
2621391- 131dc9f:	4c 89 f2             	mov    rdx,r14
2621392- 131dca2:	e8 af a8 84 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
2621393- 131dca7:	84 c0                	test   al,al
2621394- 131dca9:	74 5b                	je     131dd06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16328a>
2621395- 131dcab:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2621396- 131dcb0:	4c 89 e6             	mov    rsi,r12
2621397- 131dcb3:	e8 88 02 4d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2621398- 131dcb8:	48 89 d8             	mov    rax,rbx
2621399- 131dcbb:	48 83 c0 18          	add    rax,0x18
2621400- 131dcbf:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
2621401- 131dcc4:	66 c7 46 18 34 00    	mov    WORD PTR [rsi+0x18],0x34
2621402- 131dcca:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
2621403- 131dccf:	48 89 02             	mov    QWORD PTR [rdx],rax
2621404- 131dcd2:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
2621405- 131dcd6:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
2621406- 131dcdb:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
2621407- 131dcdf:	4c 89 ff             	mov    rdi,r15
2621408- 131dce2:	e8 47 cd ff ff       	call   131aa2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ffb2>
2621409- 131dce7:	89 c5                	mov    ebp,eax
2621410- 131dce9:	48 89 df             	mov    rdi,rbx
2621411- 131dcec:	e8 95 07 78 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2621412- 131dcf1:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2621413- 131dcf6:	e8 95 01 4d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2621414- 131dcfb:	31 db                	xor    ebx,ebx
2621415- 131dcfd:	40 84 ed             	test   bpl,bpl
2621416- 131dd00:	4c 0f 44 f3          	cmove  r14,rbx
2621417- 131dd04:	eb 03                	jmp    131dd09 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16328d>
2621511- 131de51:	cc                   	int3
2621512- 131de52:	48 8b 47 28          	mov    rax,QWORD PTR [rdi+0x28]
2621513- 131de56:	48 8b 40 28          	mov    rax,QWORD PTR [rax+0x28]
2621514- 131de5a:	48 83 e0 fc          	and    rax,0xfffffffffffffffc
2621515- 131de5e:	c3                   	ret
2621516- 131de5f:	cc                   	int3
2621517- 131de60:	53                   	push   rbx
2621518- 131de61:	48 83 ec 50          	sub    rsp,0x50
2621519- 131de65:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2621520- 131de6c:	00 00 
2621521- 131de6e:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2621522- 131de73:	48 8b 77 30          	mov    rsi,QWORD PTR [rdi+0x30]
2621523- 131de77:	48 85 f6             	test   rsi,rsi
2621524- 131de7a:	74 1c                	je     131de98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16341c>
2621525- 131de7c:	48 89 e3             	mov    rbx,rsp
2621526- 131de7f:	48 89 df             	mov    rdi,rbx
2621527- 131de82:	e8 fb f8 8f ff       	call   c1d782 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a722>
2621528- 131de87:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
2621530- 131de92:	48 83 e7 fc          	and    rdi,0xfffffffffffffffc
2621531- 131de96:	eb 04                	jmp    131de9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163420>
2621532- 131de98:	48 83 c7 38          	add    rdi,0x38
2621533- 131de9c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2621534- 131dea3:	00 00 
2621535- 131dea5:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
2621536- 131deaa:	75 09                	jne    131deb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163439>
2621537- 131deac:	48 89 f8             	mov    rax,rdi
2621538- 131deaf:	48 83 c4 50          	add    rsp,0x50
2621539- 131deb3:	5b                   	pop    rbx
2621540- 131deb4:	c3                   	ret
2621541- 131deb5:	e8 f6 1b 4d 00       	call   17efab0 <__stack_chk_fail@plt>
2621542- 131deba:	53                   	push   rbx
2621543- 131debb:	48 83 ec 50          	sub    rsp,0x50
2621544- 131debf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2621545- 131dec6:	00 00 
2621546- 131dec8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2621547- 131decd:	48 8b 77 30          	mov    rsi,QWORD PTR [rdi+0x30]
2621548- 131ded1:	48 85 f6             	test   rsi,rsi
2621549- 131ded4:	74 1b                	je     131def1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163475>
2621550- 131ded6:	48 89 e3             	mov    rbx,rsp
2621551- 131ded9:	48 89 df             	mov    rdi,rbx
2621552- 131dedc:	e8 a1 f8 8f ff       	call   c1d782 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16a722>
2621553- 131dee1:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
2621554- 131dee5:	80 b8 cc 00 00 00 00 	cmp    BYTE PTR [rax+0xcc],0x0
2621555- 131deec:	0f 95 c0             	setne  al
2621556- 131deef:	eb 02                	jmp    131def3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163477>
2621557- 131def1:	31 c0                	xor    eax,eax
2622204- 131e7ed:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
2622205- 131e7f1:	48 8d 05 00 10 12 ff 	lea    rax,[rip+0xffffffffff121000]        # 43f7f8 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x5404>
2622206- 131e7f8:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
2622207- 131e7fc:	49 89 45 20          	mov    QWORD PTR [r13+0x20],rax
2622208- 131e800:	4d 8b 24 24          	mov    r12,QWORD PTR [r12]
2622209- 131e804:	4c 89 ff             	mov    rdi,r15
2622210- 131e807:	e8 2a d0 75 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2622211- 131e80c:	49 89 d0             	mov    r8,rdx
2622212- 131e80f:	4d 8b 14 24          	mov    r10,QWORD PTR [r12]
2622213- 131e813:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
2622214- 131e818:	4c 89 e6             	mov    rsi,r12
2622215- 131e81b:	ba b3 00 00 00       	mov    edx,0xb3
2622216- 131e820:	48 89 c1             	mov    rcx,rax
2622217- 131e823:	4d 89 e9             	mov    r9,r13
2622218- 131e826:	41 ff 52 30          	call   QWORD PTR [r10+0x30]
2622219- 131e82a:	80 7c 24 40 01       	cmp    BYTE PTR [rsp+0x40],0x1
2622220- 131e82f:	75 7b                	jne    131e8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163e30>
2622221- 131e831:	4c 8d 63 20          	lea    r12,[rbx+0x20]
2622223- 131e83c:	00 
2622225- 131e844:	00 
2622226- 131e845:	4c 89 e2             	mov    rdx,r12
2622227- 131e848:	e8 09 9d 84 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
2622228- 131e84d:	84 c0                	test   al,al
2622229- 131e84f:	74 5b                	je     131e8ac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163e30>
2622230- 131e851:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2622231- 131e856:	4c 89 fe             	mov    rsi,r15
2622232- 131e859:	e8 e2 f6 4c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2622233- 131e85e:	48 89 d8             	mov    rax,rbx
2622234- 131e861:	48 83 c0 18          	add    rax,0x18
2622235- 131e865:	48 8d 74 24 20       	lea    rsi,[rsp+0x20]
2622236- 131e86a:	66 c7 46 18 b3 00    	mov    WORD PTR [rsi+0x18],0xb3
2622237- 131e870:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
2622238- 131e875:	48 89 02             	mov    QWORD PTR [rdx],rax
2622239- 131e878:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
2622240- 131e87c:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
2622241- 131e881:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
2622242- 131e885:	4c 89 f7             	mov    rdi,r14
2622243- 131e888:	e8 a1 c1 ff ff       	call   131aa2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ffb2>
2622244- 131e88d:	89 c5                	mov    ebp,eax
2622245- 131e88f:	48 89 df             	mov    rdi,rbx
2622246- 131e892:	e8 ef fb 77 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2622247- 131e897:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2622248- 131e89c:	e8 ef f5 4c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2622249- 131e8a1:	31 db                	xor    ebx,ebx
2622250- 131e8a3:	40 84 ed             	test   bpl,bpl
2622251- 131e8a6:	4c 0f 44 e3          	cmove  r12,rbx
2622252- 131e8aa:	eb 03                	jmp    131e8af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x163e33>
2623775- 131fd67:	00 
2623776- 131fd68:	4c 89 24 24          	mov    QWORD PTR [rsp],r12
2623777- 131fd6c:	49 8b 7e 50          	mov    rdi,QWORD PTR [r14+0x50]
2623778- 131fd70:	48 85 ff             	test   rdi,rdi
2623779- 131fd73:	48 8d 2d d6 d3 6a 00 	lea    rbp,[rip+0x6ad3d6]        # 19cd150 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x95d98>
2623780- 131fd7a:	48 0f 44 fd          	cmove  rdi,rbp
2623781- 131fd7e:	e8 1c d4 02 00       	call   134d19f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192723>
2623782- 131fd83:	84 c0                	test   al,al
2623783- 131fd85:	75 7a                	jne    131fe01 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165385>
2623784- 131fd87:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2623785- 131fd8a:	48 89 df             	mov    rdi,rbx
2623786- 131fd8d:	ff 50 60             	call   QWORD PTR [rax+0x60]
2623787- 131fd90:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2623788- 131fd97:	00 
2623789- 131fd98:	48 89 c6             	mov    rsi,rax
2623790- 131fd9b:	e8 a0 e1 4c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2623791- 131fda0:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
2623792- 131fda4:	80 48 10 40          	or     BYTE PTR [rax+0x10],0x40
2623794- 131fdaf:	48 85 ff             	test   rdi,rdi
2623795- 131fdb2:	75 25                	jne    131fdd9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16535d>
2623796- 131fdb4:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
2623797- 131fdb8:	48 8b 78 08          	mov    rdi,QWORD PTR [rax+0x8]
2623798- 131fdbc:	40 f6 c7 01          	test   dil,0x1
2623799- 131fdc0:	0f 85 1a 11 00 00    	jne    1320ee0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166464>
2623800- 131fdc6:	e8 2b d5 f9 ff       	call   12bd2f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10287a>
2623801- 131fdcb:	48 89 c7             	mov    rdi,rax
2623802- 131fdce:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
2623804- 131fdd9:	49 8b 4e 50          	mov    rcx,QWORD PTR [r14+0x50]
2623805- 131fddd:	48 85 c9             	test   rcx,rcx
2623806- 131fde0:	48 0f 44 cd          	cmove  rcx,rbp
2623807- 131fde4:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]
2623808- 131fdeb:	00 
2623809- 131fdec:	4c 89 ea             	mov    rdx,r13
2623810- 131fdef:	e8 16 fc ff ff       	call   131fa0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x164f8e>
2623811- 131fdf4:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2623812- 131fdfb:	00 
2623813- 131fdfc:	e8 8f e0 4c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2623814- 131fe01:	49 8b 7e 58          	mov    rdi,QWORD PTR [r14+0x58]
2623815- 131fe05:	48 85 ff             	test   rdi,rdi
2623816- 131fe08:	48 0f 44 fd          	cmove  rdi,rbp
2623817- 131fe0c:	e8 8e d3 02 00       	call   134d19f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x192723>
2623818- 131fe11:	84 c0                	test   al,al
2623819- 131fe13:	75 6d                	jne    131fe82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165406>
2623820- 131fe15:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2623821- 131fe18:	48 89 df             	mov    rdi,rbx
2623822- 131fe1b:	ff 50 48             	call   QWORD PTR [rax+0x48]
2623823- 131fe1e:	48 85 c0             	test   rax,rax
2623824- 131fe21:	74 5f                	je     131fe82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165406>
2623825- 131fe23:	49 89 c6             	mov    r14,rax
2623826- 131fe26:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
2623827- 131fe2a:	80 48 11 02          	or     BYTE PTR [rax+0x11],0x2
2623828- 131fe2e:	48 8b b8 c0 00 00 00 	mov    rdi,QWORD PTR [rax+0xc0]
2623829- 131fe35:	48 85 ff             	test   rdi,rdi
2623830- 131fe38:	75 25                	jne    131fe5f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1653e3>
2623831- 131fe3a:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
2624449- 13207c7:	0f 85 07 07 00 00    	jne    1320ed4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166458>
2624450- 13207cd:	e8 c0 4f 44 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
2624451- 13207d2:	41 80 be 90 00 00 00 	cmp    BYTE PTR [r14+0x90],0x0
2624452- 13207d9:	00 
2624453- 13207da:	74 17                	je     13207f3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165d77>
2624454- 13207dc:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
2624455- 13207e1:	8a 80 fc 01 00 00    	mov    al,BYTE PTR [rax+0x1fc]
2624456- 13207e7:	41 88 87 d9 00 00 00 	mov    BYTE PTR [r15+0xd9],al
2624457- 13207ee:	41 80 4f 12 20       	or     BYTE PTR [r15+0x12],0x20
2624458- 13207f3:	41 80 be 91 00 00 00 	cmp    BYTE PTR [r14+0x91],0x0
2624459- 13207fa:	00 
2624460- 13207fb:	0f 84 e2 04 00 00    	je     1320ce3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x166267>
2624461- 1320801:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
2624462- 1320806:	80 b9 fd 01 00 00 00 	cmp    BYTE PTR [rcx+0x1fd],0x0
2624463- 132080d:	b0 01                	mov    al,0x1
2624464- 132080f:	75 1b                	jne    132082c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165db0>
2624465- 1320811:	80 b9 b8 00 00 00 00 	cmp    BYTE PTR [rcx+0xb8],0x0
2624466- 1320818:	74 12                	je     132082c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165db0>
2624469- 1320827:	e8 f4 af 75 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
2624470- 132082c:	4d 8d 77 10          	lea    r14,[r15+0x10]
2624471- 1320830:	41 88 87 da 00 00 00 	mov    BYTE PTR [r15+0xda],al
2624472- 1320837:	b8 00 00 40 00       	mov    eax,0x400000
2624473- 132083c:	e9 97 04 00 00       	jmp    1320cd8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16625c>
2624474- 1320841:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2624475- 1320848:	00 
2624476- 1320849:	e8 9c aa 7d ff       	call   afb2ea <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4828a>
2624477- 132084e:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
2624478- 1320853:	4c 8b b4 24 40 01 00 	mov    r14,QWORD PTR [rsp+0x140]
2624479- 132085a:	00 
2624480- 132085b:	41 80 be 8b 00 00 00 	cmp    BYTE PTR [r14+0x8b],0x0
2624481- 1320862:	00 
2624482- 1320863:	74 51                	je     13208b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165e3a>
2624483- 1320865:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2624484- 1320868:	48 89 df             	mov    rdi,rbx
2624485- 132086b:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
2624486- 1320871:	48 85 c0             	test   rax,rax
2624487- 1320874:	74 40                	je     13208b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165e3a>
2624488- 1320876:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2624489- 1320879:	48 89 df             	mov    rdi,rbx
2624490- 132087c:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
2624491- 1320882:	48 8b 40 70          	mov    rax,QWORD PTR [rax+0x70]
2624492- 1320886:	f6 40 10 80          	test   BYTE PTR [rax+0x10],0x80
2624493- 132088a:	74 2a                	je     13208b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165e3a>
2624494- 132088c:	48 8b b0 80 00 00 00 	mov    rsi,QWORD PTR [rax+0x80]
2624495- 1320893:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2624496- 1320897:	74 1d                	je     13208b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x165e3a>
2625995- 1321d02:	6a 04                	push   0x4
2625996- 1321d04:	5e                   	pop    rsi
2625997- 1321d05:	e8 98 fa 8f ff       	call   c217a2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x16e742>
2625998- 1321d0a:	41 8b 56 38          	mov    edx,DWORD PTR [r14+0x38]
2625999- 1321d0e:	48 8b 7b 10          	mov    rdi,QWORD PTR [rbx+0x10]
2626000- 1321d12:	48 8b 73 18          	mov    rsi,QWORD PTR [rbx+0x18]
2626001- 1321d16:	e8 de ac 9e ff       	call   d0c9f9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x259999>
2626002- 1321d1b:	48 85 c0             	test   rax,rax
2626003- 1321d1e:	0f 84 a4 00 00 00    	je     1321dc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16734c>
2626004- 1321d24:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
2626005- 1321d28:	4d 85 ff             	test   r15,r15
2626006- 1321d2b:	0f 84 97 00 00 00    	je     1321dc8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16734c>
2626007- 1321d31:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
2626008- 1321d36:	48 83 c0 08          	add    rax,0x8
2626009- 1321d3a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2626010- 1321d3f:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
2626011- 1321d44:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
2626012- 1321d49:	41 0f b7 6f 10       	movzx  ebp,WORD PTR [r15+0x10]
2626014- 1321d55:	44 0f b7 ed          	movzx  r13d,bp
2626015- 1321d59:	4c 89 e7             	mov    rdi,r12
2626016- 1321d5c:	4c 89 f6             	mov    rsi,r14
2626017- 1321d5f:	44 89 ea             	mov    edx,r13d
2626018- 1321d62:	e8 26 88 ff ff       	call   131a58d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15fb11>
2626019- 1321d67:	48 89 df             	mov    rdi,rbx
2626020- 1321d6a:	4c 89 e6             	mov    rsi,r12
2626021- 1321d6d:	44 89 ea             	mov    edx,r13d
2626022- 1321d70:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
2626023- 1321d75:	e8 88 00 00 00       	call   1321e02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167386>
2626024- 1321d7a:	84 c0                	test   al,al
2626025- 1321d7c:	75 3a                	jne    1321db8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16733c>
2626026- 1321d7e:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
2626027- 1321d83:	48 8b 40 10          	mov    rax,QWORD PTR [rax+0x10]
2626028- 1321d87:	48 8b 18             	mov    rbx,QWORD PTR [rax]
2626029- 1321d8a:	4c 89 e7             	mov    rdi,r12
2626030- 1321d8d:	e8 a4 9a 75 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2626031- 1321d92:	48 89 d1             	mov    rcx,rdx
2626032- 1321d95:	48 89 df             	mov    rdi,rbx
2626033- 1321d98:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
2626034- 1321d9d:	44 89 ee             	mov    esi,r13d
2626035- 1321da0:	48 89 c2             	mov    rdx,rax
2626036- 1321da3:	e8 e6 99 35 00       	call   167b78e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8fa>
2626037- 1321da8:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
2626038- 1321dad:	48 8b 78 18          	mov    rdi,QWORD PTR [rax+0x18]
2626039- 1321db1:	89 ee                	mov    esi,ebp
2626040- 1321db3:	e8 02 d3 d5 ff       	call   107f0ba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2464d0>
2626041- 1321db8:	4c 89 e7             	mov    rdi,r12
2626454- 1322387:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
2626455- 132238b:	49 8b 1f             	mov    rbx,QWORD PTR [r15]
2626456- 132238e:	4d 8d 77 10          	lea    r14,[r15+0x10]
2626457- 1322392:	4c 89 f7             	mov    rdi,r14
2626458- 1322395:	e8 a4 5f 84 ff       	call   b6833e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb52de>
2626459- 132239a:	84 c0                	test   al,al
2626460- 132239c:	0f 85 3f 0a 00 00    	jne    1322de1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168365>
2626461- 13223a2:	66 0f ef c0          	pxor   xmm0,xmm0
2626462- 13223a6:	66 0f 7f 84 24 b0 00 	movdqa XMMWORD PTR [rsp+0xb0],xmm0
2626463- 13223ad:	00 00 
2626464- 13223af:	66 0f 7f 84 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm0
2626465- 13223b6:	00 00 
2626466- 13223b8:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
2626467- 13223bf:	00 00 
2626468- 13223c1:	66 0f 7f 84 24 f0 00 	movdqa XMMWORD PTR [rsp+0xf0],xmm0
2626469- 13223c8:	00 00 
2626470- 13223ca:	66 0f 7f 84 24 e0 00 	movdqa XMMWORD PTR [rsp+0xe0],xmm0
2626471- 13223d1:	00 00 
2626473- 13223da:	00 00 
2626474- 13223dc:	66 0f 7f 84 24 90 00 	movdqa XMMWORD PTR [rsp+0x90],xmm0
2626475- 13223e3:	00 00 
2626476- 13223e5:	48 83 a4 24 00 01 00 	and    QWORD PTR [rsp+0x100],0x0
2626477- 13223ec:	00 00 
2626478- 13223ee:	b8 00 00 80 3f       	mov    eax,0x3f800000
2626479- 13223f3:	89 84 24 b0 00 00 00 	mov    DWORD PTR [rsp+0xb0],eax
2626480- 13223fa:	f3 0f 7f 84 24 b8 00 	movdqu XMMWORD PTR [rsp+0xb8],xmm0
2626481- 1322401:	00 00 
2626482- 1322403:	f3 0f 7f 84 24 c8 00 	movdqu XMMWORD PTR [rsp+0xc8],xmm0
2626483- 132240a:	00 00 
2626484- 132240c:	89 84 24 d8 00 00 00 	mov    DWORD PTR [rsp+0xd8],eax
2626485- 1322413:	89 84 24 00 01 00 00 	mov    DWORD PTR [rsp+0x100],eax
2626486- 132241a:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
2626487- 1322420:	66 48 0f 7e c6       	movq   rsi,xmm0
2626488- 1322425:	48 85 f6             	test   rsi,rsi
2626489- 1322428:	0f 84 0e 09 00 00    	je     1322d3c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1682c0>
2626490- 132242e:	4c 89 74 24 10       	mov    QWORD PTR [rsp+0x10],r14
2626491- 1322433:	4c 8d 74 24 48       	lea    r14,[rsp+0x48]
2626492- 1322438:	4c 89 f7             	mov    rdi,r14
2626493- 132243b:	e8 3c 9d 35 00       	call   167c17c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x302e8>
2626494- 1322440:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
2626495- 1322444:	48 8d 4c 24 30       	lea    rcx,[rsp+0x30]
2626496- 1322449:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
2626497- 132244d:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
2626498- 1322451:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
2626499- 1322454:	4d 8b 6e 18          	mov    r13,QWORD PTR [r14+0x18]
2626500- 1322458:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
2626777- 1322887:	e8 74 b6 4c 00       	call   17edf00 <_Znwm@plt>
2626778- 132288c:	49 89 c4             	mov    r12,rax
2626779- 132288f:	48 89 84 24 f8 02 00 	mov    QWORD PTR [rsp+0x2f8],rax
2626780- 1322896:	00 
2626781- 1322897:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
2626782- 132289e:	00 
2626783- 132289f:	48 89 84 24 00 03 00 	mov    QWORD PTR [rsp+0x300],rax
2626784- 13228a6:	00 
2626785- 13228a7:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
2626786- 13228ac:	49 89 6c 24 08       	mov    QWORD PTR [r12+0x8],rbp
2626787- 13228b1:	0f 28 84 24 70 02 00 	movaps xmm0,XMMWORD PTR [rsp+0x270]
2626788- 13228b8:	00 
2626789- 13228b9:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
2626790- 13228bf:	4c 89 e7             	mov    rdi,r12
2626791- 13228c2:	48 83 c7 20          	add    rdi,0x20
2626792- 13228c6:	48 8d b4 24 80 02 00 	lea    rsi,[rsp+0x280]
2626793- 13228cd:	00 
2626794- 13228ce:	e8 59 13 00 00       	call   1323c2c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1691b0>
2626796- 13228da:	00 
2626797- 13228db:	48 ff c0             	inc    rax
2626798- 13228de:	78 07                	js     13228e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167e6b>
2626799- 13228e0:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
2626800- 13228e5:	eb 15                	jmp    13228fc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167e80>
2626801- 13228e7:	48 89 c1             	mov    rcx,rax
2626802- 13228ea:	48 d1 e9             	shr    rcx,1
2626803- 13228ed:	83 e0 01             	and    eax,0x1
2626804- 13228f0:	48 09 c8             	or     rax,rcx
2626805- 13228f3:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
2626806- 13228f8:	f3 0f 58 c0          	addss  xmm0,xmm0
2626807- 13228fc:	4c 89 f9             	mov    rcx,r15
2626808- 13228ff:	48 d1 e9             	shr    rcx,1
2626809- 1322902:	44 89 f8             	mov    eax,r15d
2626810- 1322905:	83 e0 01             	and    eax,0x1
2626811- 1322908:	48 09 c8             	or     rax,rcx
2626812- 132290b:	c6 84 24 08 03 00 00 	mov    BYTE PTR [rsp+0x308],0x1
2626813- 1322912:	01 
2626814- 1322913:	4d 85 ff             	test   r15,r15
2626815- 1322916:	78 07                	js     132291f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167ea3>
2626816- 1322918:	f3 49 0f 2a d7       	cvtsi2ss xmm2,r15
2626817- 132291d:	eb 09                	jmp    1322928 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167eac>
2626818- 132291f:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
2626819- 1322924:	f3 0f 58 d2          	addss  xmm2,xmm2
2626820- 1322928:	f3 0f 10 8c 24 b0 00 	movss  xmm1,DWORD PTR [rsp+0xb0]
2626821- 132292f:	00 00 
2626822- 1322931:	74 11                	je     1322944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x167ec8>
2626823- 1322933:	f3 0f 59 d1          	mulss  xmm2,xmm1
2626975- 1322b49:	49 85 c7             	test   r15,rax
2626976- 1322b4c:	75 74                	jne    1322bc2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168146>
2626977- 1322b4e:	48 21 c5             	and    rbp,rax
2626978- 1322b51:	eb 7f                	jmp    1322bd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168156>
2626979- 1322b53:	4c 39 fd             	cmp    rbp,r15
2626980- 1322b56:	72 0b                	jb     1322b63 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1680e7>
2626981- 1322b58:	48 89 e8             	mov    rax,rbp
2626982- 1322b5b:	31 d2                	xor    edx,edx
2626983- 1322b5d:	49 f7 f7             	div    r15
2626984- 1322b60:	48 89 d5             	mov    rbp,rdx
2626985- 1322b63:	48 8b 8c 24 90 00 00 	mov    rcx,QWORD PTR [rsp+0x90]
2626986- 1322b6a:	00 
2626987- 1322b6b:	48 8b 04 e9          	mov    rax,QWORD PTR [rcx+rbp*8]
2626988- 1322b6f:	48 85 c0             	test   rax,rax
2626989- 1322b72:	74 0c                	je     1322b80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168104>
2626990- 1322b74:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2626991- 1322b77:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
2626992- 1322b7b:	e9 ce 00 00 00       	jmp    1322c4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681d2>
2626994- 1322b87:	00 
2626995- 1322b88:	49 89 04 24          	mov    QWORD PTR [r12],rax
2626997- 1322b93:	00 
2626998- 1322b94:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
2626999- 1322b9b:	00 
2627000- 1322b9c:	48 89 04 e9          	mov    QWORD PTR [rcx+rbp*8],rax
2627001- 1322ba0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2627002- 1322ba4:	48 85 c0             	test   rax,rax
2627003- 1322ba7:	0f 84 a4 00 00 00    	je     1322c51 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681d5>
2627004- 1322bad:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
2627005- 1322bb1:	49 8d 4f ff          	lea    rcx,[r15-0x1]
2627006- 1322bb5:	49 85 cf             	test   r15,rcx
2627007- 1322bb8:	75 7b                	jne    1322c35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681b9>
2627008- 1322bba:	48 21 c8             	and    rax,rcx
2627009- 1322bbd:	e9 80 00 00 00       	jmp    1322c42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1681c6>
2627010- 1322bc2:	4c 39 fd             	cmp    rbp,r15
2627011- 1322bc5:	72 0b                	jb     1322bd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168156>
2627012- 1322bc7:	48 89 e8             	mov    rax,rbp
2627013- 1322bca:	31 d2                	xor    edx,edx
2627014- 1322bcc:	49 f7 f7             	div    r15
2627015- 1322bcf:	48 89 d5             	mov    rbp,rdx
2627016- 1322bd2:	48 8b 8c 24 b8 00 00 	mov    rcx,QWORD PTR [rsp+0xb8]
2627017- 1322bd9:	00 
2627018- 1322bda:	48 8b 04 e9          	mov    rax,QWORD PTR [rcx+rbp*8]
2627019- 1322bde:	48 85 c0             	test   rax,rax
2627020- 1322be1:	74 0c                	je     1322bef <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x168173>
2627021- 1322be3:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2627022- 1322be6:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
2627023- 1322bea:	e9 dc 00 00 00       	jmp    1322ccb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16824f>
2627024- 1322bef:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
2629729- 13250b4:	48 89 83 e0 00 00 00 	mov    QWORD PTR [rbx+0xe0],rax
2629730- 13250bb:	48 85 c9             	test   rcx,rcx
2629731- 13250be:	0f 84 90 00 00 00    	je     1325154 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6d8>
2629732- 13250c4:	48 8d 8c 24 d0 00 00 	lea    rcx,[rsp+0xd0]
2629733- 13250cb:	00 
2629734- 13250cc:	48 8d b3 e0 00 00 00 	lea    rsi,[rbx+0xe0]
2629735- 13250d3:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
2629736- 13250d7:	48 8d 57 ff          	lea    rdx,[rdi-0x1]
2629737- 13250db:	48 85 d7             	test   rdi,rdx
2629738- 13250de:	75 5a                	jne    132513a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6be>
2629739- 13250e0:	48 21 d0             	and    rax,rdx
2629740- 13250e3:	eb 62                	jmp    1325147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6cb>
2629741- 13250e5:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]
2629742- 13250ec:	80 bb f8 00 00 00 00 	cmp    BYTE PTR [rbx+0xf8],0x0
2629743- 13250f3:	74 0e                	je     1325103 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a687>
2629744- 13250f5:	e8 76 24 79 ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
2629745- 13250fa:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
2629746- 1325101:	eb 23                	jmp    1325126 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6aa>
2629749- 1325111:	e8 5a 24 79 ff       	call   ab7570 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x4510>
2629750- 1325116:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
2629751- 132511d:	4d 39 fe             	cmp    r14,r15
2629752- 1325120:	0f 84 cb 01 00 00    	je     13252f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a875>
2629753- 1325126:	48 81 c3 10 01 00 00 	add    rbx,0x110
2629754- 132512d:	48 89 df             	mov    rdi,rbx
2629755- 1325130:	e8 73 39 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
2629756- 1325135:	e9 b7 01 00 00       	jmp    13252f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a875>
2629757- 132513a:	48 39 f8             	cmp    rax,rdi
2629758- 132513d:	72 08                	jb     1325147 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a6cb>
2629759- 132513f:	31 d2                	xor    edx,edx
2629760- 1325141:	48 f7 f7             	div    rdi
2629761- 1325144:	48 89 d0             	mov    rax,rdx
2629762- 1325147:	49 8b 17             	mov    rdx,QWORD PTR [r15]
2629763- 132514a:	48 89 34 c2          	mov    QWORD PTR [rdx+rax*8],rsi
2629764- 132514e:	0f 57 c0             	xorps  xmm0,xmm0
2629765- 1325151:	0f 11 01             	movups XMMWORD PTR [rcx],xmm0
2629766- 1325154:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
2629767- 1325159:	4c 89 f6             	mov    rsi,r14
2629768- 132515c:	e8 4b 40 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
2629769- 1325161:	40 88 6c 24 70       	mov    BYTE PTR [rsp+0x70],bpl
2629770- 1325166:	48 89 5c 24 78       	mov    QWORD PTR [rsp+0x78],rbx
2629771- 132516b:	4c 8b bc 24 80 00 00 	mov    r15,QWORD PTR [rsp+0x80]
2629772- 1325172:	00 
2629773- 1325173:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
2629774- 132517a:	00 
2629775- 132517b:	49 39 c7             	cmp    r15,rax
2629776- 132517e:	0f 84 59 01 00 00    	je     13252dd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a861>
2629791- 13251b2:	48 f7 f9             	idiv   rcx
2629792- 13251b5:	49 89 c5             	mov    r13,rax
2629793- 13251b8:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
2629794- 13251bd:	4c 89 f6             	mov    rsi,r14
2629795- 13251c0:	e8 e7 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
2629796- 13251c5:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
2629797- 13251ca:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
2629798- 13251cf:	4c 89 f7             	mov    rdi,r14
2629799- 13251d2:	e8 27 d5 86 ff       	call   b926fe <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xdf69e>
2629800- 13251d7:	4c 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],r13
2629801- 13251dc:	40 88 6c 24 40       	mov    BYTE PTR [rsp+0x40],bpl
2629802- 13251e1:	48 89 5c 24 48       	mov    QWORD PTR [rsp+0x48],rbx
2629803- 13251e6:	48 83 a4 24 10 01 00 	and    QWORD PTR [rsp+0x110],0x0
2629804- 13251ed:	00 00 
2629805- 13251ef:	6a 48                	push   0x48
2629806- 13251f1:	5f                   	pop    rdi
2629807- 13251f2:	e8 09 8d 4c 00       	call   17edf00 <_Znwm@plt>
2629808- 13251f7:	48 89 c5             	mov    rbp,rax
2629810- 1325201:	00 
2629811- 1325202:	48 8d 84 24 bf 00 00 	lea    rax,[rsp+0xbf]
2629812- 1325209:	00 
2629814- 1325211:	00 
2629815- 1325212:	48 c7 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],0x1
2629816- 1325219:	00 01 00 00 00 
2629817- 132521e:	48 8d 05 33 09 54 00 	lea    rax,[rip+0x540933]        # 1865b58 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22240>
2629818- 1325225:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
2629819- 1325229:	4c 8d 6d 08          	lea    r13,[rbp+0x8]
2629820- 132522d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
2629821- 1325232:	4c 89 ef             	mov    rdi,r13
2629822- 1325235:	e8 72 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
2629823- 132523a:	48 89 ef             	mov    rdi,rbp
2629824- 132523d:	48 83 c7 18          	add    rdi,0x18
2629825- 1325241:	4c 89 f6             	mov    rsi,r14
2629826- 1325244:	e8 63 3f 85 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
2629827- 1325249:	48 8d 44 24 40       	lea    rax,[rsp+0x40]
2629828- 132524e:	0f 10 40 f0          	movups xmm0,XMMWORD PTR [rax-0x10]
2629829- 1325252:	0f 11 45 28          	movups XMMWORD PTR [rbp+0x28],xmm0
2629830- 1325256:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
2629831- 132525d:	00 
2629832- 132525e:	48 83 27 00          	and    QWORD PTR [rdi],0x0
2629833- 1325262:	0f 10 00             	movups xmm0,XMMWORD PTR [rax]
2629834- 1325265:	0f 11 45 38          	movups XMMWORD PTR [rbp+0x38],xmm0
2629835- 1325269:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]
2629836- 1325270:	00 
2629837- 1325271:	49 89 6e 20          	mov    QWORD PTR [r14+0x20],rbp
2629838- 1325275:	e8 50 50 75 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
2629839- 132527a:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2629840- 132527e:	48 8b 40 20          	mov    rax,QWORD PTR [rax+0x20]
2629841- 1325282:	48 8d 15 2b 10 01 ff 	lea    rdx,[rip+0xffffffffff01102b]        # 3362b4 <_ZTSSt12bad_any_cast@@Base-0x59f14>
2630611- 1325d41:	4c 89 ff             	mov    rdi,r15
2630612- 1325d44:	4c 89 f6             	mov    rsi,r14
2630613- 1325d47:	48 89 c2             	mov    rdx,rax
2630614- 1325d4a:	ff 51 50             	call   QWORD PTR [rcx+0x50]
2630615- 1325d4d:	41 89 c7             	mov    r15d,eax
2630616- 1325d50:	4c 89 f7             	mov    rdi,r14
2630617- 1325d53:	e8 d6 f5 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2630618- 1325d58:	48 8d bc 24 98 00 00 	lea    rdi,[rsp+0x98]
2630619- 1325d5f:	00 
2630620- 1325d60:	e8 c9 f5 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2630621- 1325d65:	48 89 ef             	mov    rdi,rbp
2630622- 1325d68:	e8 19 87 77 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2630623- 1325d6d:	45 08 fc             	or     r12b,r15b
2630624- 1325d70:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
2630625- 1325d75:	75 26                	jne    1325d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b321>
2630626- 1325d77:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
2630627- 1325d7c:	4c 89 ee             	mov    rsi,r13
2630628- 1325d7f:	e8 74 aa dd ff       	call   11007f8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2c7c0e>
2630630- 1325d8b:	48 2b 83 a0 00 00 00 	sub    rax,QWORD PTR [rbx+0xa0]
2630631- 1325d92:	48 c1 f8 04          	sar    rax,0x4
2630632- 1325d96:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
2630633- 1325d9b:	73 39                	jae    1325dd6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b35a>
2630634- 1325d9d:	49 83 c5 10          	add    r13,0x10
2630635- 1325da1:	4d 39 fd             	cmp    r13,r15
2630636- 1325da4:	0f 85 05 fe ff ff    	jne    1325baf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b133>
2630637- 1325daa:	eb 18                	jmp    1325dc4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b348>
2630638- 1325dac:	41 b4 01             	mov    r12b,0x1
2630639- 1325daf:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
2630640- 1325db3:	80 7b 20 00          	cmp    BYTE PTR [rbx+0x20],0x0
2630641- 1325db7:	4c 8b 7c 24 08       	mov    r15,QWORD PTR [rsp+0x8]
2630642- 1325dbc:	0f 85 04 ff ff ff    	jne    1325cc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b24a>
2630643- 1325dc2:	eb d9                	jmp    1325d9d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b321>
2630645- 1325dcb:	48 2b 83 a0 00 00 00 	sub    rax,QWORD PTR [rbx+0xa0]
2630646- 1325dd2:	48 c1 f8 04          	sar    rax,0x4
2630647- 1325dd6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
2630648- 1325ddb:	73 09                	jae    1325de6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b36a>
2630649- 1325ddd:	80 bb fa 00 00 00 00 	cmp    BYTE PTR [rbx+0xfa],0x0
2630650- 1325de4:	74 3b                	je     1325e21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b3a5>
2630651- 1325de6:	c6 83 f8 00 00 00 00 	mov    BYTE PTR [rbx+0xf8],0x0
2630652- 1325ded:	48 81 c3 10 01 00 00 	add    rbx,0x110
2630653- 1325df4:	48 89 df             	mov    rdi,rbx
2630654- 1325df7:	e8 ac 2c 80 ff       	call   b28aa8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x75a48>
2630655- 1325dfc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2630656- 1325e03:	00 00 
2630657- 1325e05:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
2630658- 1325e0c:	00 
2630659- 1325e0d:	75 73                	jne    1325e82 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b406>
2630660- 1325e0f:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
2630661- 1325e16:	5b                   	pop    rbx
2630662- 1325e17:	41 5c                	pop    r12
2630663- 1325e19:	41 5d                	pop    r13
2630664- 1325e1b:	41 5e                	pop    r14
2630665- 1325e1d:	41 5f                	pop    r15
2630666- 1325e1f:	5d                   	pop    rbp
2630667- 1325e20:	c3                   	ret
2630668- 1325e21:	c6 83 fa 00 00 00 01 	mov    BYTE PTR [rbx+0xfa],0x1
2630669- 1325e28:	48 89 df             	mov    rdi,rbx
2630670- 1325e2b:	31 f6                	xor    esi,esi
2630671- 1325e2d:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
2630672- 1325e32:	e8 f1 f0 ff ff       	call   1324f28 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16a4ac>
2638275- 132cd2d:	4c 8d 7b 20          	lea    r15,[rbx+0x20]
2638276- 132cd31:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
2638277- 132cd36:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
2638278- 132cd3d:	00 
2638279- 132cd3e:	4c 89 fa             	mov    rdx,r15
2638280- 132cd41:	e8 10 b8 83 ff       	call   b68556 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54f6>
2638281- 132cd46:	84 c0                	test   al,al
2638282- 132cd48:	74 60                	je     132cdaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17232e>
2638283- 132cd4a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
2638284- 132cd4f:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
2638285- 132cd54:	e8 e7 11 4c 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2638286- 132cd59:	48 89 d8             	mov    rax,rbx
2638287- 132cd5c:	48 83 c0 18          	add    rax,0x18
2638288- 132cd60:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
2638289- 132cd65:	66 c7 46 18 b7 00    	mov    WORD PTR [rsi+0x18],0xb7
2638290- 132cd6b:	48 8d 54 24 28       	lea    rdx,[rsp+0x28]
2638291- 132cd70:	48 89 02             	mov    QWORD PTR [rdx],rax
2638292- 132cd73:	48 89 5a 08          	mov    QWORD PTR [rdx+0x8],rbx
2638294- 132cd7e:	00 
2638295- 132cd7f:	48 89 42 10          	mov    QWORD PTR [rdx+0x10],rax
2638296- 132cd83:	4c 89 f7             	mov    rdi,r14
2638297- 132cd86:	e8 a3 dc fe ff       	call   131aa2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15ffb2>
2638298- 132cd8b:	89 c5                	mov    ebp,eax
2638299- 132cd8d:	48 89 df             	mov    rdi,rbx
2638300- 132cd90:	e8 f1 16 77 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2638301- 132cd95:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]
2638302- 132cd9a:	e8 f1 10 4c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2638303- 132cd9f:	31 db                	xor    ebx,ebx
2638304- 132cda1:	40 84 ed             	test   bpl,bpl
2638305- 132cda4:	4c 0f 44 fb          	cmove  r15,rbx
2638306- 132cda8:	eb 03                	jmp    132cdad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x172331>
2638307- 132cdaa:	45 31 ff             	xor    r15d,r15d
2638308- 132cdad:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2638309- 132cdb4:	00 
2638310- 132cdb5:	e8 d6 10 4c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2638311- 132cdba:	48 8d 7c 24 60       	lea    rdi,[rsp+0x60]
2638312- 132cdbf:	e8 20 1c 79 ff       	call   abe9e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb984>
2638313- 132cdc4:	48 89 df             	mov    rdi,rbx
2638314- 132cdc7:	e8 ba 16 77 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2638315- 132cdcc:	eb 25                	jmp    132cdf3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x172377>
2638316- 132cdce:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
2638317- 132cdd1:	48 85 ff             	test   rdi,rdi
2638318- 132cdd4:	74 11                	je     132cde7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17236b>
2638319- 132cdd6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2638320- 132cdd9:	ff 10                	call   QWORD PTR [rax]
2638321- 132cddb:	48 8d 0d 0e de 5e 00 	lea    rcx,[rip+0x5ede0e]        # 191abf0 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62000>
2642080- 132fc46:	00 
2642081- 132fc47:	0f 11 43 78          	movups XMMWORD PTR [rbx+0x78],xmm0
2642082- 132fc4b:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
2642083- 132fc4f:	48 89 43 78          	mov    QWORD PTR [rbx+0x78],rax
2642084- 132fc53:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
2642085- 132fc57:	48 89 83 80 00 00 00 	mov    QWORD PTR [rbx+0x80],rax
2642086- 132fc5e:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
2642087- 132fc62:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
2642088- 132fc69:	41 0f 11 47 18       	movups XMMWORD PTR [r15+0x18],xmm0
2642089- 132fc6e:	49 83 67 28 00       	and    QWORD PTR [r15+0x28],0x0
2642090- 132fc73:	0f 29 83 90 00 00 00 	movaps XMMWORD PTR [rbx+0x90],xmm0
2642091- 132fc7a:	48 83 a3 a0 00 00 00 	and    QWORD PTR [rbx+0xa0],0x0
2642092- 132fc81:	00 
2642093- 132fc82:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
2642094- 132fc86:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
2642095- 132fc8d:	49 8b 47 38          	mov    rax,QWORD PTR [r15+0x38]
2642096- 132fc91:	48 89 83 98 00 00 00 	mov    QWORD PTR [rbx+0x98],rax
2642097- 132fc98:	49 8b 47 40          	mov    rax,QWORD PTR [r15+0x40]
2642099- 132fca3:	49 83 67 40 00       	and    QWORD PTR [r15+0x40],0x0
2642100- 132fca8:	41 0f 29 47 30       	movaps XMMWORD PTR [r15+0x30],xmm0
2642101- 132fcad:	41 8a 47 50          	mov    al,BYTE PTR [r15+0x50]
2642102- 132fcb1:	88 83 b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],al
2642103- 132fcb7:	49 8b 47 48          	mov    rax,QWORD PTR [r15+0x48]
2642105- 132fcc2:	48 83 a3 c8 00 00 00 	and    QWORD PTR [rbx+0xc8],0x0
2642106- 132fcc9:	00 
2642107- 132fcca:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
2642108- 132fcd1:	49 8b 47 58          	mov    rax,QWORD PTR [r15+0x58]
2642109- 132fcd5:	48 89 83 b8 00 00 00 	mov    QWORD PTR [rbx+0xb8],rax
2642110- 132fcdc:	49 8b 47 60          	mov    rax,QWORD PTR [r15+0x60]
2642111- 132fce0:	48 89 83 c0 00 00 00 	mov    QWORD PTR [rbx+0xc0],rax
2642112- 132fce7:	49 8b 47 68          	mov    rax,QWORD PTR [r15+0x68]
2642113- 132fceb:	48 89 83 c8 00 00 00 	mov    QWORD PTR [rbx+0xc8],rax
2642114- 132fcf2:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
2642115- 132fcf7:	49 83 67 68 00       	and    QWORD PTR [r15+0x68],0x0
2642116- 132fcfc:	41 8a 47 70          	mov    al,BYTE PTR [r15+0x70]
2642117- 132fd00:	88 83 d0 00 00 00    	mov    BYTE PTR [rbx+0xd0],al
2642118- 132fd06:	49 8b 87 88 00 00 00 	mov    rax,QWORD PTR [r15+0x88]
2642119- 132fd0d:	48 89 83 e8 00 00 00 	mov    QWORD PTR [rbx+0xe8],rax
2642120- 132fd14:	41 0f 10 4f 78       	movups xmm1,XMMWORD PTR [r15+0x78]
2642121- 132fd19:	0f 11 8b d8 00 00 00 	movups XMMWORD PTR [rbx+0xd8],xmm1
2642122- 132fd20:	49 83 a7 88 00 00 00 	and    QWORD PTR [r15+0x88],0x0
2642123- 132fd27:	00 
2642124- 132fd28:	41 0f 11 47 78       	movups XMMWORD PTR [r15+0x78],xmm0
2642125- 132fd2d:	41 8a 87 90 00 00 00 	mov    al,BYTE PTR [r15+0x90]
2642126- 132fd34:	88 83 f0 00 00 00    	mov    BYTE PTR [rbx+0xf0],al
2642127- 132fd3a:	31 c0                	xor    eax,eax
2642128- 132fd3c:	88 83 00 01 00 00    	mov    BYTE PTR [rbx+0x100],al
2642129- 132fd42:	88 83 50 01 00 00    	mov    BYTE PTR [rbx+0x150],al
2642130- 132fd48:	41 38 87 f0 00 00 00 	cmp    BYTE PTR [r15+0xf0],al
2642131- 132fd4f:	74 13                	je     132fd64 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1752e8>
2642132- 132fd51:	48 8d bb 00 01 00 00 	lea    rdi,[rbx+0x100]
2644075- 13316f5:	48 8b 93 98 00 00 00 	mov    rdx,QWORD PTR [rbx+0x98]
2644076- 13316fc:	48 39 d1             	cmp    rcx,rdx
2644077- 13316ff:	74 2b                	je     133172c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176cb0>
2644078- 1331701:	4c 89 f0             	mov    rax,r14
2644079- 1331704:	48 63 31             	movsxd rsi,DWORD PTR [rcx]
2644080- 1331707:	48 c1 e0 06          	shl    rax,0x6
2644081- 133170b:	4c 89 f7             	mov    rdi,r14
2644082- 133170e:	48 c1 ef 02          	shr    rdi,0x2
2644083- 1331712:	4c 01 e0             	add    rax,r12
2644084- 1331715:	48 01 f8             	add    rax,rdi
2644085- 1331718:	48 01 f0             	add    rax,rsi
2644086- 133171b:	4c 31 f0             	xor    rax,r14
2644087- 133171e:	48 83 c1 04          	add    rcx,0x4
2644088- 1331722:	49 89 c6             	mov    r14,rax
2644089- 1331725:	48 39 d1             	cmp    rcx,rdx
2644090- 1331728:	75 da                	jne    1331704 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176c88>
2644091- 133172a:	eb 03                	jmp    133172f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176cb3>
2644092- 133172c:	4c 89 f0             	mov    rax,r14
2644094- 1331736:	48 89 c2             	mov    rdx,rax
2644095- 1331739:	48 c1 e2 06          	shl    rdx,0x6
2644096- 133173d:	48 89 c6             	mov    rsi,rax
2644097- 1331740:	48 c1 ee 02          	shr    rsi,0x2
2644098- 1331744:	48 01 ce             	add    rsi,rcx
2644099- 1331747:	4c 01 e2             	add    rdx,r12
2644100- 133174a:	48 01 f2             	add    rdx,rsi
2644101- 133174d:	48 31 c2             	xor    rdx,rax
2644102- 1331750:	48 63 83 ac 00 00 00 	movsxd rax,DWORD PTR [rbx+0xac]
2644103- 1331757:	4c 01 e0             	add    rax,r12
2644104- 133175a:	48 89 d1             	mov    rcx,rdx
2644105- 133175d:	48 c1 e1 06          	shl    rcx,0x6
2644106- 1331761:	48 01 c1             	add    rcx,rax
2644107- 1331764:	48 89 d0             	mov    rax,rdx
2644108- 1331767:	48 c1 e8 02          	shr    rax,0x2
2644109- 133176b:	48 01 c8             	add    rax,rcx
2644110- 133176e:	48 31 d0             	xor    rax,rdx
2644111- 1331771:	0f b6 8b b0 00 00 00 	movzx  ecx,BYTE PTR [rbx+0xb0]
2644112- 1331778:	4c 01 e1             	add    rcx,r12
2644113- 133177b:	48 89 c2             	mov    rdx,rax
2644114- 133177e:	48 c1 e2 06          	shl    rdx,0x6
2644115- 1331782:	48 01 ca             	add    rdx,rcx
2644116- 1331785:	48 89 c1             	mov    rcx,rax
2644117- 1331788:	48 c1 e9 02          	shr    rcx,0x2
2644118- 133178c:	48 01 d1             	add    rcx,rdx
2644119- 133178f:	48 31 c1             	xor    rcx,rax
2644120- 1331792:	0f b6 83 d0 00 00 00 	movzx  eax,BYTE PTR [rbx+0xd0]
2644121- 1331799:	4c 01 e0             	add    rax,r12
2644311- 1331a3f:	49 29 c8             	sub    r8,rcx
2644312- 1331a42:	4c 39 c0             	cmp    rax,r8
2644313- 1331a45:	0f 85 71 01 00 00    	jne    1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644314- 1331a4b:	48 39 fe             	cmp    rsi,rdi
2644315- 1331a4e:	74 19                	je     1331a69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176fed>
2644316- 1331a50:	48 39 d1             	cmp    rcx,rdx
2644317- 1331a53:	74 14                	je     1331a69 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176fed>
2644318- 1331a55:	8b 06                	mov    eax,DWORD PTR [rsi]
2644319- 1331a57:	3b 01                	cmp    eax,DWORD PTR [rcx]
2644320- 1331a59:	0f 85 5d 01 00 00    	jne    1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644321- 1331a5f:	48 83 c6 04          	add    rsi,0x4
2644322- 1331a63:	48 83 c1 04          	add    rcx,0x4
2644323- 1331a67:	eb e2                	jmp    1331a4b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176fcf>
2644324- 1331a69:	31 c0                	xor    eax,eax
2644325- 1331a6b:	48 39 fe             	cmp    rsi,rdi
2644326- 1331a6e:	0f 85 4a 01 00 00    	jne    1331bbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177142>
2644327- 1331a74:	48 39 d1             	cmp    rcx,rdx
2644328- 1331a77:	0f 85 41 01 00 00    	jne    1331bbe <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177142>
2644330- 1331a84:	3b 83 a8 00 00 00    	cmp    eax,DWORD PTR [rbx+0xa8]
2644331- 1331a8a:	0f 85 2c 01 00 00    	jne    1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644332- 1331a90:	41 8b 86 ac 00 00 00 	mov    eax,DWORD PTR [r14+0xac]
2644333- 1331a97:	3b 83 ac 00 00 00    	cmp    eax,DWORD PTR [rbx+0xac]
2644334- 1331a9d:	0f 85 19 01 00 00    	jne    1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644335- 1331aa3:	41 8a 86 b0 00 00 00 	mov    al,BYTE PTR [r14+0xb0]
2644336- 1331aaa:	3a 83 b0 00 00 00    	cmp    al,BYTE PTR [rbx+0xb0]
2644337- 1331ab0:	0f 85 06 01 00 00    	jne    1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644338- 1331ab6:	41 8a 86 d0 00 00 00 	mov    al,BYTE PTR [r14+0xd0]
2644339- 1331abd:	3a 83 d0 00 00 00    	cmp    al,BYTE PTR [rbx+0xd0]
2644340- 1331ac3:	0f 85 f3 00 00 00    	jne    1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644341- 1331ac9:	41 8a 86 f0 00 00 00 	mov    al,BYTE PTR [r14+0xf0]
2644342- 1331ad0:	3a 83 f0 00 00 00    	cmp    al,BYTE PTR [rbx+0xf0]
2644343- 1331ad6:	0f 85 e0 00 00 00    	jne    1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644344- 1331adc:	41 8a 86 61 01 00 00 	mov    al,BYTE PTR [r14+0x161]
2644345- 1331ae3:	3a 83 61 01 00 00    	cmp    al,BYTE PTR [rbx+0x161]
2644346- 1331ae9:	0f 85 cd 00 00 00    	jne    1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644347- 1331aef:	be d8 00 00 00       	mov    esi,0xd8
2644348- 1331af4:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2644349- 1331af8:	48 01 de             	add    rsi,rbx
2644350- 1331afb:	e8 ee db 76 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
2644351- 1331b00:	84 c0                	test   al,al
2644352- 1331b02:	0f 84 b4 00 00 00    	je     1331bbc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177140>
2644353- 1331b08:	4d 8b a6 b8 00 00 00 	mov    r12,QWORD PTR [r14+0xb8]
2644354- 1331b0f:	49 8b ae c0 00 00 00 	mov    rbp,QWORD PTR [r14+0xc0]
2644355- 1331b16:	4c 8b bb b8 00 00 00 	mov    r15,QWORD PTR [rbx+0xb8]
2644356- 1331b1d:	4c 8b ab c0 00 00 00 	mov    r13,QWORD PTR [rbx+0xc0]
2644357- 1331b24:	48 89 e8             	mov    rax,rbp
2644480- 1331cde:	49 8d 7e 48          	lea    rdi,[r14+0x48]
2644481- 1331ce2:	48 8d 9c 24 e0 00 00 	lea    rbx,[rsp+0xe0]
2644482- 1331ce9:	00 
2644483- 1331cea:	48 89 de             	mov    rsi,rbx
2644484- 1331ced:	e8 3c 9d 74 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
2644485- 1331cf2:	4c 89 f7             	mov    rdi,r14
2644486- 1331cf5:	e8 6a 47 ff ff       	call   1326464 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16b9e8>
2644487- 1331cfa:	48 89 df             	mov    rdi,rbx
2644488- 1331cfd:	e8 8e c1 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2644489- 1331d02:	48 8b 45 08          	mov    rax,QWORD PTR [rbp+0x8]
2644490- 1331d06:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2644491- 1331d0b:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
2644492- 1331d0f:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
2644493- 1331d14:	4c 8b 65 30          	mov    r12,QWORD PTR [rbp+0x30]
2644494- 1331d18:	f3 0f 6f 45 38       	movdqu xmm0,XMMWORD PTR [rbp+0x38]
2644495- 1331d1d:	66 0f 7f 44 24 20    	movdqa XMMWORD PTR [rsp+0x20],xmm0
2644496- 1331d23:	48 8b 5d 50          	mov    rbx,QWORD PTR [rbp+0x50]
2644497- 1331d27:	48 8b 45 70          	mov    rax,QWORD PTR [rbp+0x70]
2644499- 1331d32:	00 
2644500- 1331d33:	4c 8b 7d 78          	mov    r15,QWORD PTR [rbp+0x78]
2644501- 1331d37:	bf e0 02 00 00       	mov    edi,0x2e0
2644502- 1331d3c:	e8 bf c1 4b 00       	call   17edf00 <_Znwm@plt>
2644503- 1331d41:	48 89 c5             	mov    rbp,rax
2644504- 1331d44:	49 83 c5 58          	add    r13,0x58
2644505- 1331d48:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
2644506- 1331d4f:	00 
2644507- 1331d50:	4c 89 ee             	mov    rsi,r13
2644508- 1331d53:	e8 88 a2 9d ff       	call   d0bfe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x258f80>
2644509- 1331d58:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
2644510- 1331d5f:	00 
2644511- 1331d60:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
2644512- 1331d67:	00 
2644513- 1331d68:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
2644514- 1331d6f:	00 
2644515- 1331d70:	48 85 c0             	test   rax,rax
2644516- 1331d73:	74 05                	je     1331d7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1772fe>
2644517- 1331d75:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2644518- 1331d7a:	48 83 a4 24 f8 00 00 	and    QWORD PTR [rsp+0xf8],0x0
2644519- 1331d81:	00 00 
2644520- 1331d83:	4c 89 b4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r14
2644521- 1331d8a:	00 
2644522- 1331d8b:	48 8d 05 8e 49 53 00 	lea    rax,[rip+0x53498e]        # 1866720 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22e08>
2644523- 1331d92:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax
2644524- 1331d96:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
2644525- 1331d9a:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
2644526- 1331da1:	00 
2644575- 1331e91:	c7 41 20 00 00 80 3f 	mov    DWORD PTR [rcx+0x20],0x3f800000
2644576- 1331e98:	6a 01                	push   0x1
2644577- 1331e9a:	41 58                	pop    r8
2644578- 1331e9c:	4c 89 fe             	mov    rsi,r15
2644579- 1331e9f:	48 89 da             	mov    rdx,rbx
2644580- 1331ea2:	e8 f1 de 00 00       	call   133fd98 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18531c>
2644581- 1331ea7:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
2644582- 1331eae:	00 
2644583- 1331eaf:	e8 74 cf d4 ff       	call   107ee28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x24623e>
2644584- 1331eb4:	48 8d 85 18 02 00 00 	lea    rax,[rbp+0x218]
2644585- 1331ebb:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
2644586- 1331ec0:	48 83 a5 18 02 00 00 	and    QWORD PTR [rbp+0x218],0x0
2644587- 1331ec7:	00 
2644588- 1331ec8:	48 8d bd 20 02 00 00 	lea    rdi,[rbp+0x220]
2644589- 1331ecf:	6a 01                	push   0x1
2644590- 1331ed1:	59                   	pop    rcx
2644591- 1331ed2:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
2644592- 1331ed9:	00 
2644594- 1331ee1:	00 
2644595- 1331ee2:	48 89 de             	mov    rsi,rbx
2644596- 1331ee5:	89 ca                	mov    edx,ecx
2644597- 1331ee7:	41 89 c8             	mov    r8d,ecx
2644598- 1331eea:	4c 8b 4c 24 40       	mov    r9,QWORD PTR [rsp+0x40]
2644599- 1331eef:	e8 90 9f f9 ff       	call   12cbe84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x111408>
2644600- 1331ef4:	83 a5 30 02 00 00 00 	and    DWORD PTR [rbp+0x230],0x0
2644601- 1331efb:	66 83 a5 34 02 00 00 	and    WORD PTR [rbp+0x234],0x0
2644602- 1331f02:	00 
2644603- 1331f03:	4c 8b bd 38 01 00 00 	mov    r15,QWORD PTR [rbp+0x138]
2644604- 1331f0a:	48 8b 9d 40 01 00 00 	mov    rbx,QWORD PTR [rbp+0x140]
2644605- 1331f11:	4c 29 fb             	sub    rbx,r15
2644606- 1331f14:	0f 84 a7 00 00 00    	je     1331fc1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177545>
2644607- 1331f1a:	4c 89 74 24 38       	mov    QWORD PTR [rsp+0x38],r14
2644608- 1331f1f:	48 89 6c 24 20       	mov    QWORD PTR [rsp+0x20],rbp
2644609- 1331f24:	4c 8d 25 1e 5f 01 ff 	lea    r12,[rip+0xffffffffff015f1e]        # 347e49 <_ZTSSt12bad_any_cast@@Base-0x4837f>
2644610- 1331f2b:	4c 8d 2d 68 98 04 ff 	lea    r13,[rip+0xffffffffff049868]        # 37b79a <_ZTSSt12bad_any_cast@@Base-0x14a2e>
2644611- 1331f32:	48 8d 2d 2c ac ff fe 	lea    rbp,[rip+0xfffffffffeffac2c]        # 32cb65 <_ZTSSt12bad_any_cast@@Base-0x63663>
2644612- 1331f39:	4c 8d 35 4b 26 03 ff 	lea    r14,[rip+0xffffffffff03264b]        # 36458b <_ZTSSt12bad_any_cast@@Base-0x2bc3d>
2644613- 1331f40:	4c 89 ff             	mov    rdi,r15
2644614- 1331f43:	4c 89 e6             	mov    rsi,r12
2644615- 1331f46:	e8 04 99 74 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
2644616- 1331f4b:	84 c0                	test   al,al
2644617- 1331f4d:	75 44                	jne    1331f93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177517>
2644618- 1331f4f:	4c 89 ff             	mov    rdi,r15
2644619- 1331f52:	4c 89 ee             	mov    rsi,r13
2644620- 1331f55:	e8 f5 98 74 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
2644621- 1331f5a:	84 c0                	test   al,al
2645232- 133283a:	48 89 0f             	mov    QWORD PTR [rdi],rcx
2645233- 133283d:	e8 d4 bc 77 ff       	call   aae516 <JNI_OnUnload@@Base+0x35de3>
2645234- 1332842:	48 8d bc 24 90 01 00 	lea    rdi,[rsp+0x190]
2645235- 1332849:	00 
2645236- 133284a:	e8 8f b7 84 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
2645237- 133284f:	4c 8d bc 24 c0 01 00 	lea    r15,[rsp+0x1c0]
2645238- 1332856:	00 
2645239- 1332857:	4c 89 ff             	mov    rdi,r15
2645240- 133285a:	e8 7f b7 84 ff       	call   b7dfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xcaf7e>
2645241- 133285f:	66 0f ef c0          	pxor   xmm0,xmm0
2645242- 1332863:	66 41 0f 7f 07       	movdqa XMMWORD PTR [r15],xmm0
2645243- 1332868:	49 83 67 10 00       	and    QWORD PTR [r15+0x10],0x0
2645244- 133286d:	48 8d bc 24 58 01 00 	lea    rdi,[rsp+0x158]
2645245- 1332874:	00 
2645246- 1332875:	48 8d 8c 24 40 01 00 	lea    rcx,[rsp+0x140]
2645247- 133287c:	00 
2645248- 133287d:	4c 8d 84 24 c0 01 00 	lea    r8,[rsp+0x1c0]
2645249- 1332884:	00 
2645251- 133288c:	00 
2645253- 1332894:	00 
2645254- 1332895:	e8 6c 9c 00 00       	call   133c506 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181a8a>
2645255- 133289a:	4c 8d bc 24 58 01 00 	lea    r15,[rsp+0x158]
2645256- 13328a1:	00 
2645257- 13328a2:	49 8b 37             	mov    rsi,QWORD PTR [r15]
2645258- 13328a5:	49 83 27 00          	and    QWORD PTR [r15],0x0
2645259- 13328a9:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
2645260- 13328ae:	e8 c9 53 00 00       	call   1337c7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d200>
2645261- 13328b3:	4c 89 ff             	mov    rdi,r15
2645262- 13328b6:	e8 3d 54 00 00       	call   1337cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d27c>
2645263- 13328bb:	48 8d bc 24 c0 01 00 	lea    rdi,[rsp+0x1c0]
2645264- 13328c2:	00 
2645265- 13328c3:	e8 60 8e 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
2645266- 13328c8:	4c 8d bc 24 40 01 00 	lea    r15,[rsp+0x140]
2645267- 13328cf:	00 
2645268- 13328d0:	4c 89 ff             	mov    rdi,r15
2645269- 13328d3:	e8 50 8e 74 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
2645270- 13328d8:	4c 8b a5 18 02 00 00 	mov    r12,QWORD PTR [rbp+0x218]
2645271- 13328df:	49 89 2f             	mov    QWORD PTR [r15],rbp
2645272- 13328e2:	48 8d 35 a8 a7 76 ff 	lea    rsi,[rip+0xffffffffff76a7a8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
2645273- 13328e9:	48 8d 0d f6 22 01 00 	lea    rcx,[rip+0x122f6]        # 1344be6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a16a>
2645274- 13328f0:	4c 8d bc 24 f0 01 00 	lea    r15,[rsp+0x1f0]
2645275- 13328f7:	00 
2645276- 13328f8:	4c 8d 84 24 40 01 00 	lea    r8,[rsp+0x140]
2645277- 13328ff:	00 
2645278- 1332900:	6a 08                	push   0x8
2645279- 1332902:	41 59                	pop    r9
2645280- 1332904:	4c 89 ff             	mov    rdi,r15
2645656- 1332f11:	40 88 6b 70          	mov    BYTE PTR [rbx+0x70],bpl
2645657- 1332f15:	0f 28 8c 24 60 01 00 	movaps xmm1,XMMWORD PTR [rsp+0x160]
2645658- 1332f1c:	00 
2645659- 1332f1d:	0f 11 4b 78          	movups XMMWORD PTR [rbx+0x78],xmm1
2645660- 1332f21:	48 8b 84 24 70 01 00 	mov    rax,QWORD PTR [rsp+0x170]
2645661- 1332f28:	00 
2645662- 1332f29:	48 89 83 88 00 00 00 	mov    QWORD PTR [rbx+0x88],rax
2645663- 1332f30:	66 0f 7f 84 24 60 01 	movdqa XMMWORD PTR [rsp+0x160],xmm0
2645664- 1332f37:	00 00 
2645665- 1332f39:	48 83 a4 24 70 01 00 	and    QWORD PTR [rsp+0x170],0x0
2645666- 1332f40:	00 00 
2645667- 1332f42:	4d 8d 66 30          	lea    r12,[r14+0x30]
2645668- 1332f46:	4c 89 e7             	mov    rdi,r12
2645669- 1332f49:	48 89 de             	mov    rsi,rbx
2645670- 1332f4c:	e8 d5 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
2645671- 1332f51:	48 85 c0             	test   rax,rax
2645672- 1332f54:	74 4d                	je     1332fa3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178527>
2645673- 1332f56:	48 89 c3             	mov    rbx,rax
2645675- 1332f60:	48 85 ff             	test   rdi,rdi
2645676- 1332f63:	74 37                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
2645677- 1332f65:	e8 d6 b1 4b 00       	call   17ee140 <_ZNSt6__ndk119__shared_weak_count4lockEv@plt>
2645678- 1332f6a:	48 85 c0             	test   rax,rax
2645679- 1332f6d:	74 2d                	je     1332f9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178520>
2645680- 1332f6f:	48 89 c7             	mov    rdi,rax
2645682- 1332f79:	48 85 c0             	test   rax,rax
2645683- 1332f7c:	74 20                	je     1332f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178522>
2645684- 1332f7e:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
2645685- 1332f85:	00 
2645686- 1332f86:	48 89 bc 24 98 02 00 	mov    QWORD PTR [rsp+0x298],rdi
2645687- 1332f8d:	00 
2645688- 1332f8e:	e9 b2 00 00 00       	jmp    1333045 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1785c9>
2645689- 1332f93:	49 83 26 00          	and    QWORD PTR [r14],0x0
2645690- 1332f97:	e9 7a 14 00 00       	jmp    1334416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17999a>
2645691- 1332f9c:	31 ff                	xor    edi,edi
2645692- 1332f9e:	e8 e3 b4 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2645693- 1332fa3:	49 8d 6e 58          	lea    rbp,[r14+0x58]
2645694- 1332fa7:	48 8d b4 24 10 04 00 	lea    rsi,[rsp+0x410]
2645695- 1332fae:	00 
2645696- 1332faf:	48 89 ef             	mov    rdi,rbp
2645697- 1332fb2:	e8 6f 1d 00 00       	call   1334d26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a2aa>
2645698- 1332fb7:	48 85 c0             	test   rax,rax
2645699- 1332fba:	0f 84 2e 05 00 00    	je     13334ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178a72>
2645700- 1332fc0:	49 89 c5             	mov    r13,rax
2645702- 1332fca:	48 8b 50 10          	mov    rdx,QWORD PTR [rax+0x10]
2645703- 1332fce:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
2645704- 1332fd3:	4c 89 eb             	mov    rbx,r13
2645705- 1332fd6:	48 83 c3 10          	add    rbx,0x10
2645706- 1332fda:	48 8d 8c 24 e0 02 00 	lea    rcx,[rsp+0x2e0]
2645707- 1332fe1:	00 
2645708- 1332fe2:	48 89 11             	mov    QWORD PTR [rcx],rdx
2645709- 1332fe5:	48 8d bc 24 a0 03 00 	lea    rdi,[rsp+0x3a0]
2645710- 1332fec:	00 
2645711- 1332fed:	4c 89 f6             	mov    rsi,r14
2645712- 1332ff0:	48 89 da             	mov    rdx,rbx
2645713- 1332ff3:	e8 f2 1d 00 00       	call   1334dea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a36e>
2645714- 1332ff8:	48 8b bc 24 e0 02 00 	mov    rdi,QWORD PTR [rsp+0x2e0]
2645715- 1332fff:	00 
2645716- 1333000:	48 85 ff             	test   rdi,rdi
2645717- 1333003:	74 06                	je     133300b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17858f>
2645718- 1333005:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2645719- 1333008:	ff 50 08             	call   QWORD PTR [rax+0x8]
2645720- 133300b:	4c 89 e7             	mov    rdi,r12
2645721- 133300e:	48 89 de             	mov    rsi,rbx
2645722- 1333011:	e8 b8 1f 00 00       	call   1334fce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a552>
2645723- 1333016:	0f 28 84 24 a0 03 00 	movaps xmm0,XMMWORD PTR [rsp+0x3a0]
2645724- 133301d:	00 
2645725- 133301e:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
2645726- 1333023:	48 89 c7             	mov    rdi,rax
2645727- 1333026:	e8 df 68 7f ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>
2645728- 133302b:	48 89 ef             	mov    rdi,rbp
2645729- 133302e:	4c 89 ee             	mov    rsi,r13
2645873- 133329a:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
2645874- 133329f:	48 89 83 18 01 00 00 	mov    QWORD PTR [rbx+0x118],rax
2645875- 13332a6:	0f 28 44 24 50       	movaps xmm0,XMMWORD PTR [rsp+0x50]
2645876- 13332ab:	0f 29 83 20 01 00 00 	movaps XMMWORD PTR [rbx+0x120],xmm0
2645877- 13332b2:	48 8b 84 24 a8 01 00 	mov    rax,QWORD PTR [rsp+0x1a8]
2645878- 13332b9:	00 
2645879- 13332ba:	66 0f 6f 84 24 a0 01 	movdqa xmm0,XMMWORD PTR [rsp+0x1a0]
2645880- 13332c1:	00 00 
2645881- 13332c3:	66 0f 7f 83 30 01 00 	movdqa XMMWORD PTR [rbx+0x130],xmm0
2645882- 13332ca:	00 
2645883- 13332cb:	48 85 c0             	test   rax,rax
2645884- 13332ce:	74 05                	je     13332d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178859>
2645885- 13332d0:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2645886- 13332d5:	48 8d bb 40 01 00 00 	lea    rdi,[rbx+0x140]
2645887- 13332dc:	48 89 bc 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rdi
2645888- 13332e3:	00 
2645889- 13332e4:	48 8b 74 24 48       	mov    rsi,QWORD PTR [rsp+0x48]
2645890- 13332e9:	e8 28 c7 f4 ff       	call   127fa16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc4f9a>
2645892- 13332f5:	00 
2645893- 13332f6:	89 83 50 02 00 00    	mov    DWORD PTR [rbx+0x250],eax
2645894- 13332fc:	48 8d bb 58 02 00 00 	lea    rdi,[rbx+0x258]
2645895- 1333303:	49 8d b4 24 b8 00 00 	lea    rsi,[r12+0xb8]
2645896- 133330a:	00 
2645897- 133330b:	48 89 bc 24 18 01 00 	mov    QWORD PTR [rsp+0x118],rdi
2645898- 1333312:	00 
2645899- 1333313:	e8 bc c9 f4 ff       	call   127fcd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5258>
2645900- 1333318:	49 83 ef 80          	sub    r15,0xffffffffffffff80
2645901- 133331c:	41 8b 84 24 ac 00 00 	mov    eax,DWORD PTR [r12+0xac]
2645902- 1333323:	00 
2645903- 1333324:	89 83 70 02 00 00    	mov    DWORD PTR [rbx+0x270],eax
2645904- 133332a:	48 8d 83 78 02 00 00 	lea    rax,[rbx+0x278]
2645905- 1333331:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
2645906- 1333338:	00 
2645907- 1333339:	66 0f ef c0          	pxor   xmm0,xmm0
2645908- 133333d:	f3 0f 7f 83 78 02 00 	movdqu XMMWORD PTR [rbx+0x278],xmm0
2645909- 1333344:	00 
2645910- 1333345:	f3 0f 7f 83 88 02 00 	movdqu XMMWORD PTR [rbx+0x288],xmm0
2645911- 133334c:	00 
2645912- 133334d:	c7 83 98 02 00 00 00 	mov    DWORD PTR [rbx+0x298],0x3f800000
2645913- 1333354:	00 80 3f 
2645914- 1333357:	48 8d bb a0 02 00 00 	lea    rdi,[rbx+0x2a0]
2645915- 133335e:	48 89 bc 24 10 01 00 	mov    QWORD PTR [rsp+0x110],rdi
2645916- 1333365:	00 
2645917- 1333366:	4c 89 fe             	mov    rsi,r15
2645918- 1333369:	e8 22 6f 74 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
2645919- 133336e:	66 0f 6f 84 24 f0 00 	movdqa xmm0,XMMWORD PTR [rsp+0xf0]
2646110- 1333696:	41 8a 84 24 61 01 00 	mov    al,BYTE PTR [r12+0x161]
2646111- 133369d:	00 
2646112- 133369e:	88 83 54 04 00 00    	mov    BYTE PTR [rbx+0x454],al
2646113- 13336a4:	66 83 a3 55 04 00 00 	and    WORD PTR [rbx+0x455],0x0
2646114- 13336ab:	00 
2646115- 13336ac:	48 8d bb 58 04 00 00 	lea    rdi,[rbx+0x458]
2646116- 13336b3:	48 89 bc 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rdi
2646117- 13336ba:	00 
2646118- 13336bb:	e8 36 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646119- 13336c0:	48 8d bb 68 04 00 00 	lea    rdi,[rbx+0x468]
2646120- 13336c7:	48 89 bc 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdi
2646121- 13336ce:	00 
2646122- 13336cf:	e8 22 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646123- 13336d4:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]
2646124- 13336db:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
2646125- 13336e2:	00 
2646126- 13336e3:	e8 0e 63 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646127- 13336e8:	48 8d bb 88 04 00 00 	lea    rdi,[rbx+0x488]
2646129- 13336f6:	00 
2646130- 13336f7:	e8 fa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646131- 13336fc:	48 8d bb 98 04 00 00 	lea    rdi,[rbx+0x498]
2646132- 1333703:	48 89 bc 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rdi
2646133- 133370a:	00 
2646134- 133370b:	e8 e6 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646135- 1333710:	48 8d bb a8 04 00 00 	lea    rdi,[rbx+0x4a8]
2646136- 1333717:	48 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdi
2646137- 133371e:	00 
2646138- 133371f:	e8 d2 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646139- 1333724:	48 8d bb b8 04 00 00 	lea    rdi,[rbx+0x4b8]
2646140- 133372b:	48 89 bc 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rdi
2646141- 1333732:	00 
2646142- 1333733:	e8 be 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646143- 1333738:	48 8d bb c8 04 00 00 	lea    rdi,[rbx+0x4c8]
2646145- 1333746:	00 
2646146- 1333747:	e8 aa 62 4a 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2646147- 133374c:	48 83 a3 d8 04 00 00 	and    QWORD PTR [rbx+0x4d8],0x0
2646148- 1333753:	00 
2646149- 1333754:	48 83 a3 e8 04 00 00 	and    QWORD PTR [rbx+0x4e8],0x0
2646150- 133375b:	00 
2646151- 133375c:	48 83 a3 f8 04 00 00 	and    QWORD PTR [rbx+0x4f8],0x0
2646152- 1333763:	00 
2646153- 1333764:	48 83 a3 08 05 00 00 	and    QWORD PTR [rbx+0x508],0x0
2646154- 133376b:	00 
2646155- 133376c:	31 c0                	xor    eax,eax
2646156- 133376e:	88 83 18 05 00 00    	mov    BYTE PTR [rbx+0x518],al
2646157- 1333774:	88 83 38 05 00 00    	mov    BYTE PTR [rbx+0x538],al
2646158- 133377a:	88 83 40 05 00 00    	mov    BYTE PTR [rbx+0x540],al
2646159- 1333780:	88 83 60 05 00 00    	mov    BYTE PTR [rbx+0x560],al
2646160- 1333786:	0f 57 c0             	xorps  xmm0,xmm0
2646161- 1333789:	0f 11 83 68 05 00 00 	movups XMMWORD PTR [rbx+0x568],xmm0
2646162- 1333790:	0f 11 83 78 05 00 00 	movups XMMWORD PTR [rbx+0x578],xmm0
2646163- 1333797:	0f 11 83 88 05 00 00 	movups XMMWORD PTR [rbx+0x588],xmm0
2646164- 133379e:	c7 83 98 05 00 00 00 	mov    DWORD PTR [rbx+0x598],0x3f800000
2646165- 13337a5:	00 80 3f 
2646166- 13337a8:	66 0f 6f 84 24 50 01 	movdqa xmm0,XMMWORD PTR [rsp+0x150]
2646167- 13337af:	00 00 
2646168- 13337b1:	66 0f 7f 83 a0 05 00 	movdqa XMMWORD PTR [rbx+0x5a0],xmm0
2646169- 13337b8:	00 
2646170- 13337b9:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
2646171- 13337c0:	48 85 c0             	test   rax,rax
2646172- 13337c3:	74 05                	je     13337ca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d4e>
2646586- 1333e97:	49 89 5d 00          	mov    QWORD PTR [r13+0x0],rbx
2646587- 1333e9b:	48 8d 0d 9e 3e 00 00 	lea    rcx,[rip+0x3e9e]        # 1337d40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d2c4>
2646588- 1333ea2:	4c 8d bc 24 f0 04 00 	lea    r15,[rsp+0x4f0]
2646589- 1333ea9:	00 
2646590- 1333eaa:	4c 8d 84 24 40 02 00 	lea    r8,[rsp+0x240]
2646591- 1333eb1:	00 
2646592- 1333eb2:	4c 89 ff             	mov    rdi,r15
2646593- 1333eb5:	48 89 ee             	mov    rsi,rbp
2646594- 1333eb8:	31 d2                	xor    edx,edx
2646595- 1333eba:	6a 08                	push   0x8
2646596- 1333ebc:	41 59                	pop    r9
2646597- 1333ebe:	e8 d1 68 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
2646598- 1333ec3:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
2646599- 1333eca:	00 
2646600- 1333ecb:	4c 89 e7             	mov    rdi,r12
2646601- 1333ece:	4c 89 f6             	mov    rsi,r14
2646602- 1333ed1:	4c 89 fa             	mov    rdx,r15
2646603- 1333ed4:	e8 15 c8 b9 ff       	call   ed06ee <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97b04>
2646605- 1333ee0:	00 
2646606- 1333ee1:	4c 89 e6             	mov    rsi,r12
2646607- 1333ee4:	e8 09 5d 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
2646608- 1333ee9:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
2646609- 1333eee:	e8 93 a5 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2646610- 1333ef3:	4c 89 ff             	mov    rdi,r15
2646611- 1333ef6:	e8 ed 68 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
2646612- 1333efb:	48 8d 15 6e 8c 0a ff 	lea    rdx,[rip+0xffffffffff0a8c6e]        # 3dcb70 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25bf>
2646613- 1333f02:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
2646614- 1333f07:	4c 89 ef             	mov    rdi,r13
2646615- 1333f0a:	4c 8b 74 24 60       	mov    r14,QWORD PTR [rsp+0x60]
2646616- 1333f0f:	4c 89 f6             	mov    rsi,r14
2646617- 1333f12:	e8 14 5f 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
2646618- 1333f17:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
2646619- 1333f1b:	48 8d 15 66 8c 0a ff 	lea    rdx,[rip+0xffffffffff0a8c66]        # 3dcb88 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25d7>
2646620- 1333f22:	4c 89 ef             	mov    rdi,r13
2646621- 1333f25:	4c 89 f6             	mov    rsi,r14
2646622- 1333f28:	e8 fe 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
2646623- 1333f2d:	41 b4 01             	mov    r12b,0x1
2646624- 1333f30:	41 b7 01             	mov    r15b,0x1
2646625- 1333f33:	84 c0                	test   al,al
2646626- 1333f35:	75 15                	jne    1333f4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1794d0>
2646627- 1333f37:	48 8d 15 62 8c 0a ff 	lea    rdx,[rip+0xffffffffff0a8c62]        # 3dcba0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x25ef>
2646628- 1333f3e:	4c 89 ef             	mov    rdi,r13
2646629- 1333f41:	4c 89 f6             	mov    rsi,r14
2646630- 1333f44:	e8 e2 5e 2a 00       	call   15d9e2b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x41f3af>
2646631- 1333f49:	41 89 c7             	mov    r15d,eax
2646632- 1333f4c:	48 8d 15 bd 8b 0a ff 	lea    rdx,[rip+0xffffffffff0a8bbd]        # 3dcb10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x255f>
2646796- 1334206:	00 
2646797- 1334207:	49 89 18             	mov    QWORD PTR [r8],rbx
2646798- 133420a:	48 8d 35 80 8e 76 ff 	lea    rsi,[rip+0xffffffffff768e80]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
2646799- 1334211:	48 8d 0d 6e 3e 00 00 	lea    rcx,[rip+0x3e6e]        # 1338086 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d60a>
2646800- 1334218:	4c 8d b4 24 f0 04 00 	lea    r14,[rsp+0x4f0]
2646801- 133421f:	00 
2646802- 1334220:	6a 08                	push   0x8
2646803- 1334222:	41 59                	pop    r9
2646804- 1334224:	4c 89 f7             	mov    rdi,r14
2646805- 1334227:	31 d2                	xor    edx,edx
2646806- 1334229:	e8 66 65 4a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
2646807- 133422e:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]
2646808- 1334232:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2646809- 1334235:	4c 8d a4 24 f0 01 00 	lea    r12,[rsp+0x1f0]
2646810- 133423c:	00 
2646811- 133423d:	4c 89 e7             	mov    rdi,r12
2646812- 1334240:	4c 89 f2             	mov    rdx,r14
2646813- 1334243:	ff 50 10             	call   QWORD PTR [rax+0x10]
2646815- 133424d:	00 
2646816- 133424e:	4c 89 e6             	mov    rsi,r12
2646817- 1334251:	e8 9c 59 4a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
2646818- 1334256:	49 8b 7c 24 08       	mov    rdi,QWORD PTR [r12+0x8]
2646819- 133425b:	e8 26 a2 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2646820- 1334260:	4c 89 f7             	mov    rdi,r14
2646821- 1334263:	e8 80 65 4a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
2646822- 1334268:	80 7c 24 78 00       	cmp    BYTE PTR [rsp+0x78],0x0
2646823- 133426d:	74 3f                	je     13342ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179832>
2646824- 133426f:	4c 8b 74 24 70       	mov    r14,QWORD PTR [rsp+0x70]
2646825- 1334274:	49 8b 36             	mov    rsi,QWORD PTR [r14]
2646826- 1334277:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
2646827- 133427e:	00 
2646828- 133427f:	e8 da d0 00 00       	call   134135e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1868e2>
2646829- 1334284:	48 8d b4 24 f0 04 00 	lea    rsi,[rsp+0x4f0]
2646830- 133428b:	00 
2646831- 133428c:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
2646832- 1334293:	00 
2646833- 1334294:	e8 3d 44 fa ff       	call   12d86d6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x11dc5a>
2646834- 1334299:	48 8d bc 24 f0 04 00 	lea    rdi,[rsp+0x4f0]
2646835- 13342a0:	00 
2646836- 13342a1:	e8 e4 1a d6 ff       	call   1095d8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x25d1a0>
2646837- 13342a6:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
2646838- 13342a9:	e8 70 d2 00 00       	call   134151e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x186aa2>
2646839- 13342ae:	45 84 ff             	test   r15b,r15b
2646840- 13342b1:	74 10                	je     13342c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179847>
2646841- 13342b3:	48 8b 84 24 30 01 00 	mov    rax,QWORD PTR [rsp+0x130]
2646842- 13342ba:	00 
2647280- 1334991:	e8 74 59 fe ff       	call   131a30a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x15f88e>
2647281- 1334996:	66 0f ef c0          	pxor   xmm0,xmm0
2647282- 133499a:	66 0f 7f 84 24 d0 00 	movdqa XMMWORD PTR [rsp+0xd0],xmm0
2647283- 13349a1:	00 00 
2647284- 13349a3:	48 8b bb a8 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5a8]
2647285- 13349aa:	e8 d7 9a 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2647286- 13349af:	48 89 df             	mov    rdi,rbx
2647287- 13349b2:	48 81 c7 78 05 00 00 	add    rdi,0x578
2647288- 13349b9:	e8 a8 dc 7a ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
2647289- 13349be:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
2647290- 13349c3:	e8 ea 40 00 00       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
2647291- 13349c8:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]
2647292- 13349cf:	00 
2647293- 13349d0:	e8 dd 40 00 00       	call   1338ab2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e036>
2647294- 13349d5:	48 8b 7c 24 48       	mov    rdi,QWORD PTR [rsp+0x48]
2647295- 13349da:	e8 a5 77 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
2647296- 13349df:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
2647297- 13349e4:	e8 9b 77 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
2647299- 13349f0:	00 
2647300- 13349f1:	e8 de 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2647301- 13349f6:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
2647302- 13349fd:	00 
2647303- 13349fe:	e8 d1 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2647304- 1334a03:	48 8b bc 24 98 00 00 	mov    rdi,QWORD PTR [rsp+0x98]
2647305- 1334a0a:	00 
2647306- 1334a0b:	e8 c4 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2647307- 1334a10:	48 8b bc 24 80 00 00 	mov    rdi,QWORD PTR [rsp+0x80]
2647308- 1334a17:	00 
2647309- 1334a18:	e8 b7 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2647311- 1334a24:	00 
2647312- 1334a25:	e8 aa 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2647313- 1334a2a:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]
2647314- 1334a31:	00 
2647315- 1334a32:	e8 9d 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2647316- 1334a37:	48 8b bc 24 b8 00 00 	mov    rdi,QWORD PTR [rsp+0xb8]
2647317- 1334a3e:	00 
2647318- 1334a3f:	e8 90 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2647319- 1334a44:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
2647320- 1334a4b:	00 
2647321- 1334a4c:	e8 83 51 4a 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>
2647322- 1334a51:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
2647323- 1334a58:	00 
2647324- 1334a59:	e8 d0 08 39 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2647325- 1334a5e:	48 8b bb c0 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c0]
2647326- 1334a65:	e8 1c 9a 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2647327- 1334a6a:	48 8b bb b0 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3b0]
2647328- 1334a71:	e8 10 9a 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2647329- 1334a76:	48 8b bb a0 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3a0]
2647330- 1334a7d:	e8 04 9a 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2647331- 1334a82:	48 8b bc 24 c0 00 00 	mov    rdi,QWORD PTR [rsp+0xc0]
2647332- 1334a89:	00 
2647333- 1334a8a:	e8 69 32 00 00       	call   1337cf8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d27c>
2647334- 1334a8f:	48 8b bb 88 03 00 00 	mov    rdi,QWORD PTR [rbx+0x388]
2647335- 1334a96:	e8 eb 99 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2647336- 1334a9b:	48 8b 3c 24          	mov    rdi,QWORD PTR [rsp]
2647337- 1334a9f:	e8 1e 14 8f ff       	call   c25ec2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x172e62>
2647338- 1334aa4:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
2647785- 1335091:	4d 8b 6d 00          	mov    r13,QWORD PTR [r13+0x0]
2647786- 1335095:	4d 85 ed             	test   r13,r13
2647787- 1335098:	75 b5                	jne    133504f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a5d3>
2647788- 133509a:	4c 8d 73 10          	lea    r14,[rbx+0x10]
2647789- 133509e:	bf b0 00 00 00       	mov    edi,0xb0
2647790- 13350a3:	e8 58 8e 4b 00       	call   17edf00 <_Znwm@plt>
2647791- 13350a8:	49 89 c5             	mov    r13,rax
2647792- 13350ab:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2647793- 13350b0:	48 83 20 00          	and    QWORD PTR [rax],0x0
2647794- 13350b4:	4c 89 74 24 08       	mov    QWORD PTR [rsp+0x8],r14
2647795- 13350b9:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
2647796- 13350be:	c6 44 24 28 00       	mov    BYTE PTR [rsp+0x28],0x0
2647797- 13350c3:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
2647798- 13350c8:	49 89 45 08          	mov    QWORD PTR [r13+0x8],rax
2647799- 13350cc:	49 8d 7d 10          	lea    rdi,[r13+0x10]
2647800- 13350d0:	4c 89 e6             	mov    rsi,r12
2647801- 13350d3:	e8 b4 06 00 00       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
2647802- 13350d8:	0f 57 c0             	xorps  xmm0,xmm0
2647804- 13350e2:	00 
2647805- 13350e3:	c6 44 24 28 01       	mov    BYTE PTR [rsp+0x28],0x1
2647806- 13350e8:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
2647807- 13350ec:	48 ff c0             	inc    rax
2647808- 13350ef:	78 07                	js     13350f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a67c>
2647809- 13350f1:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
2647810- 13350f6:	eb 15                	jmp    133510d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a691>
2647811- 13350f8:	48 89 c1             	mov    rcx,rax
2647812- 13350fb:	48 d1 e9             	shr    rcx,1
2647813- 13350fe:	83 e0 01             	and    eax,0x1
2647814- 1335101:	48 09 c8             	or     rax,rcx
2647815- 1335104:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
2647816- 1335109:	f3 0f 58 c0          	addss  xmm0,xmm0
2647817- 133510d:	48 89 e9             	mov    rcx,rbp
2647818- 1335110:	48 d1 e9             	shr    rcx,1
2647819- 1335113:	89 e8                	mov    eax,ebp
2647820- 1335115:	83 e0 01             	and    eax,0x1
2647821- 1335118:	48 09 c8             	or     rax,rcx
2647822- 133511b:	48 85 ed             	test   rbp,rbp
2647823- 133511e:	78 07                	js     1335127 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a6ab>
2647824- 1335120:	f3 48 0f 2a d5       	cvtsi2ss xmm2,rbp
2647825- 1335125:	eb 09                	jmp    1335130 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a6b4>
2647826- 1335127:	f3 48 0f 2a d0       	cvtsi2ss xmm2,rax
2647827- 133512c:	f3 0f 58 d2          	addss  xmm2,xmm2
2647828- 1335130:	f3 0f 10 4b 20       	movss  xmm1,DWORD PTR [rbx+0x20]
2647829- 1335135:	74 0d                	je     1335144 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a6c8>
2647830- 1335137:	f3 0f 59 d1          	mulss  xmm2,xmm1
2647831- 133513b:	0f 2e c2             	ucomiss xmm0,xmm2
2648865- 1335e88:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
2648866- 1335e8f:	00 
2648867- 1335e90:	48 83 27 00          	and    QWORD PTR [rdi],0x0
2648868- 1335e94:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
2648869- 1335e99:	48 ff 43 70          	inc    QWORD PTR [rbx+0x70]
2648870- 1335e9d:	e8 5e f8 ff ff       	call   1335700 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ac84>
2648871- 1335ea2:	4c 8b 6c 24 50       	mov    r13,QWORD PTR [rsp+0x50]
2648872- 1335ea7:	49 8d bf a0 00 00 00 	lea    rdi,[r15+0xa0]
2648873- 1335eae:	4c 8d 64 24 50       	lea    r12,[rsp+0x50]
2648874- 1335eb3:	49 83 24 24 00       	and    QWORD PTR [r12],0x0
2648875- 1335eb8:	4c 89 ee             	mov    rsi,r13
2648876- 1335ebb:	e8 54 e9 d3 ff       	call   1074814 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bc2a>
2648877- 1335ec0:	4c 89 e7             	mov    rdi,r12
2648878- 1335ec3:	e8 44 e9 d3 ff       	call   107480c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23bc22>
2648879- 1335ec8:	48 8d b3 80 00 00 00 	lea    rsi,[rbx+0x80]
2648880- 1335ecf:	4c 8d 6c 24 40       	lea    r13,[rsp+0x40]
2648881- 1335ed4:	4c 89 ef             	mov    rdi,r13
2648882- 1335ed7:	e8 0c 20 83 ff       	call   b67ee8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4e88>
2648884- 1335ee3:	4c 8b 73 28          	mov    r14,QWORD PTR [rbx+0x28]
2648885- 1335ee7:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
2648886- 1335eeb:	4c 8d 64 24 58       	lea    r12,[rsp+0x58]
2648887- 1335ef0:	4c 89 e7             	mov    rdi,r12
2648888- 1335ef3:	4c 89 ee             	mov    rsi,r13
2648889- 1335ef6:	e8 b1 32 84 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
2648890- 1335efb:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
2648891- 1335f00:	48 89 ee             	mov    rsi,rbp
2648892- 1335f03:	e8 84 f8 ff ff       	call   133578c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ad10>
2648893- 1335f08:	48 8d 05 09 bd 11 ff 	lea    rax,[rip+0xffffffffff11bd09]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
2648894- 1335f0f:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
2648895- 1335f14:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
2648896- 1335f19:	48 83 64 24 38 00    	and    QWORD PTR [rsp+0x38],0x0
2648897- 1335f1f:	48 8d bc 24 f8 00 00 	lea    rdi,[rsp+0xf8]
2648898- 1335f26:	00 
2648899- 1335f27:	48 8d 74 24 50       	lea    rsi,[rsp+0x50]
2648900- 1335f2c:	e8 6b 01 00 00       	call   133609c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b620>
2648901- 1335f31:	48 83 a4 24 a0 01 00 	and    QWORD PTR [rsp+0x1a0],0x0
2648902- 1335f38:	00 00 
2648903- 1335f3a:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
2648904- 1335f41:	00 00 
2648905- 1335f43:	bf a8 00 00 00       	mov    edi,0xa8
2648906- 1335f48:	e8 b3 7f 4b 00       	call   17edf00 <_Znwm@plt>
2648907- 1335f4d:	48 89 c3             	mov    rbx,rax
2648908- 1335f50:	48 8d b4 24 f8 00 00 	lea    rsi,[rsp+0xf8]
2648909- 1335f57:	00 
2648910- 1335f58:	48 89 c7             	mov    rdi,rax
2648911- 1335f5b:	e8 3c 01 00 00       	call   133609c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b620>
2649128- 133624a:	53                   	push   rbx
2649129- 133624b:	48 89 fb             	mov    rbx,rdi
2649130- 133624e:	e8 79 ff ff ff       	call   13361cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b750>
2649131- 1336253:	48 89 df             	mov    rdi,rbx
2649132- 1336256:	5b                   	pop    rbx
2649133- 1336257:	e9 c4 7c 4b 00       	jmp    17edf20 <_ZdlPv@plt>
2649134- 133625c:	55                   	push   rbp
2649135- 133625d:	41 57                	push   r15
2649136- 133625f:	41 56                	push   r14
2649137- 1336261:	41 55                	push   r13
2649138- 1336263:	41 54                	push   r12
2649139- 1336265:	53                   	push   rbx
2649140- 1336266:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
2649141- 133626d:	49 89 d6             	mov    r14,rdx
2649142- 1336270:	49 89 f7             	mov    r15,rsi
2649143- 1336273:	48 89 fd             	mov    rbp,rdi
2649144- 1336276:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2649145- 133627d:	00 00 
2649147- 1336286:	00 
2649148- 1336287:	80 ba 50 01 00 00 00 	cmp    BYTE PTR [rdx+0x150],0x0
2649149- 133628e:	0f 84 c1 00 00 00    	je     1336355 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b8d9>
2649150- 1336294:	48 89 2c 24          	mov    QWORD PTR [rsp],rbp
2649151- 1336298:	4d 8b a7 d8 00 00 00 	mov    r12,QWORD PTR [r15+0xd8]
2649152- 133629f:	4c 89 74 24 60       	mov    QWORD PTR [rsp+0x60],r14
2649153- 13362a4:	49 8b 5c 24 40       	mov    rbx,QWORD PTR [r12+0x40]
2649154- 13362a9:	48 85 db             	test   rbx,rbx
2649155- 13362ac:	74 52                	je     1336300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b884>
2649156- 13362ae:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]
2649157- 13362b5:	00 
2649158- 13362b6:	48 8d 6c 24 60       	lea    rbp,[rsp+0x60]
2649159- 13362bb:	48 8d b3 00 02 00 00 	lea    rsi,[rbx+0x200]
2649160- 13362c2:	4c 89 ef             	mov    rdi,r13
2649161- 13362c5:	e8 66 50 77 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
2649162- 13362ca:	48 8b 94 24 80 00 00 	mov    rdx,QWORD PTR [rsp+0x80]
2649163- 13362d1:	00 
2649164- 13362d2:	48 85 d2             	test   rdx,rdx
2649165- 13362d5:	74 14                	je     13362eb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b86f>
2649166- 13362d7:	48 8d 73 10          	lea    rsi,[rbx+0x10]
2649167- 13362db:	48 89 ef             	mov    rdi,rbp
2649168- 13362de:	e8 35 04 00 00       	call   1336718 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bc9c>
2649169- 13362e3:	84 c0                	test   al,al
2649170- 13362e5:	0f 85 c3 00 00 00    	jne    13363ae <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b932>
2649171- 13362eb:	48 8b bc 24 88 00 00 	mov    rdi,QWORD PTR [rsp+0x88]
2649172- 13362f2:	00 
2649173- 13362f3:	e8 8e 81 76 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2649174- 13362f8:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
2650799- 1337941:	5b                   	pop    rbx
2650800- 1337942:	e9 47 5c f7 ff       	jmp    12ad58e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xf2b12>
2650801- 1337947:	48 89 c7             	mov    rdi,rax
2650802- 133794a:	e8 56 21 74 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
2650803- 133794f:	cc                   	int3
2650804- 1337950:	48 8d 05 51 e5 52 00 	lea    rax,[rip+0x52e551]        # 1865ea8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22590>
2650805- 1337957:	48 89 07             	mov    QWORD PTR [rdi],rax
2650806- 133795a:	48 83 67 60 00       	and    QWORD PTR [rdi+0x60],0x0
2650807- 133795f:	48 83 67 70 00       	and    QWORD PTR [rdi+0x70],0x0
2650808- 1337964:	48 83 a7 80 00 00 00 	and    QWORD PTR [rdi+0x80],0x0
2650809- 133796b:	00 
2650810- 133796c:	0f 57 c0             	xorps  xmm0,xmm0
2650811- 133796f:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
2650812- 1337973:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
2650813- 1337977:	0f 11 47 28          	movups XMMWORD PTR [rdi+0x28],xmm0
2650814- 133797b:	0f 11 47 38          	movups XMMWORD PTR [rdi+0x38],xmm0
2650815- 133797f:	0f 11 47 48          	movups XMMWORD PTR [rdi+0x48],xmm0
2650816- 1337983:	0f 11 87 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm0
2650818- 1337991:	c6 87 b0 00 00 00 01 	mov    BYTE PTR [rdi+0xb0],0x1
2650819- 1337998:	48 81 c7 b8 00 00 00 	add    rdi,0xb8
2650820- 133799f:	e9 ea 08 7f ff       	jmp    b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
2650821- 13379a4:	55                   	push   rbp
2650822- 13379a5:	41 57                	push   r15
2650823- 13379a7:	41 56                	push   r14
2650824- 13379a9:	41 55                	push   r13
2650825- 13379ab:	41 54                	push   r12
2650826- 13379ad:	53                   	push   rbx
2650827- 13379ae:	48 83 ec 18          	sub    rsp,0x18
2650828- 13379b2:	45 89 ce             	mov    r14d,r9d
2650829- 13379b5:	45 89 c5             	mov    r13d,r8d
2650830- 13379b8:	89 cd                	mov    ebp,ecx
2650831- 13379ba:	49 89 d7             	mov    r15,rdx
2650832- 13379bd:	49 89 f4             	mov    r12,rsi
2650833- 13379c0:	48 89 fb             	mov    rbx,rdi
2650834- 13379c3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2650835- 13379ca:	00 00 
2650836- 13379cc:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2650837- 13379d1:	0f 57 c0             	xorps  xmm0,xmm0
2650838- 13379d4:	0f 11 47 10          	movups XMMWORD PTR [rdi+0x10],xmm0
2650839- 13379d8:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
2650840- 13379db:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
2650841- 13379e2:	48 8d 3d 57 51 0a ff 	lea    rdi,[rip+0xffffffffff0a5157]        # 3dcb40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x258f>
2650842- 13379e9:	e8 48 3e 74 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2650843- 13379ee:	48 89 d1             	mov    rcx,rdx
2650844- 13379f1:	4c 89 e7             	mov    rdi,r12
2650845- 13379f4:	4c 89 fe             	mov    rsi,r15
2650997- 1337c0c:	80 f1 01             	xor    cl,0x1
2650998- 1337c0f:	88 8b e0 05 00 00    	mov    BYTE PTR [rbx+0x5e0],cl
2650999- 1337c15:	84 c0                	test   al,al
2651000- 1337c17:	74 4c                	je     1337c65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d1e9>
2651001- 1337c19:	48 8b bb 30 01 00 00 	mov    rdi,QWORD PTR [rbx+0x130]
2651002- 1337c20:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2651003- 1337c23:	ff 50 30             	call   QWORD PTR [rax+0x30]
2651004- 1337c26:	84 c0                	test   al,al
2651005- 1337c28:	74 4a                	je     1337c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d1f8>
2651006- 1337c2a:	4c 8d b3 30 01 00 00 	lea    r14,[rbx+0x130]
2651007- 1337c31:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
2651008- 1337c34:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2651009- 1337c37:	ff 50 28             	call   QWORD PTR [rax+0x28]
2651010- 1337c3a:	a8 02                	test   al,0x2
2651011- 1337c3c:	75 36                	jne    1337c74 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d1f8>
2651012- 1337c3e:	48 8b bb c8 03 00 00 	mov    rdi,QWORD PTR [rbx+0x3c8]
2651013- 1337c45:	48 81 c3 d8 03 00 00 	add    rbx,0x3d8
2651014- 1337c4c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2651016- 1337c56:	4c 89 f6             	mov    rsi,r14
2651017- 1337c59:	48 89 da             	mov    rdx,rbx
2651018- 1337c5c:	48 83 c4 08          	add    rsp,0x8
2651019- 1337c60:	5b                   	pop    rbx
2651020- 1337c61:	41 5e                	pop    r14
2651021- 1337c63:	ff e0                	jmp    rax
2651022- 1337c65:	48 89 df             	mov    rdi,rbx
2651023- 1337c68:	48 83 c4 08          	add    rsp,0x8
2651024- 1337c6c:	5b                   	pop    rbx
2651025- 1337c6d:	41 5e                	pop    r14
2651026- 1337c6f:	e9 28 06 00 00       	jmp    133829c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d820>
2651027- 1337c74:	48 83 c4 08          	add    rsp,0x8
2651028- 1337c78:	5b                   	pop    rbx
2651029- 1337c79:	41 5e                	pop    r14
2651030- 1337c7b:	c3                   	ret
2651031- 1337c7c:	53                   	push   rbx
2651032- 1337c7d:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
2651033- 1337c80:	48 89 37             	mov    QWORD PTR [rdi],rsi
2651034- 1337c83:	48 85 db             	test   rbx,rbx
2651035- 1337c86:	74 65                	je     1337ced <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d271>
2651036- 1337c88:	48 89 df             	mov    rdi,rbx
2651037- 1337c8b:	e8 02 4b 00 00       	call   133c792 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181d16>
2651038- 1337c90:	48 8b bb 00 01 00 00 	mov    rdi,QWORD PTR [rbx+0x100]
2651039- 1337c97:	e8 16 68 76 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
2651040- 1337c9c:	48 8d bb e8 00 00 00 	lea    rdi,[rbx+0xe8]
2651041- 1337ca3:	e8 d4 74 83 ff       	call   b6f17c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbc11c>
2651042- 1337ca8:	48 8d bb 90 00 00 00 	lea    rdi,[rbx+0x90]
2651043- 1337caf:	e8 b2 21 4a 00       	call   17d9e66 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c87>
2652032- 1338bc9:	49 89 c6             	mov    r14,rax
2652033- 1338bcc:	75 ec                	jne    1338bba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e13e>
2652034- 1338bce:	4c 89 7b 08          	mov    QWORD PTR [rbx+0x8],r15
2652035- 1338bd2:	5b                   	pop    rbx
2652036- 1338bd3:	41 5e                	pop    r14
2652037- 1338bd5:	41 5f                	pop    r15
2652038- 1338bd7:	c3                   	ret
2652039- 1338bd8:	53                   	push   rbx
2652040- 1338bd9:	48 89 fb             	mov    rbx,rdi
2652041- 1338bdc:	e8 01 ff ff ff       	call   1338ae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e066>
2652042- 1338be1:	48 89 df             	mov    rdi,rbx
2652043- 1338be4:	5b                   	pop    rbx
2652044- 1338be5:	e9 36 53 4b 00       	jmp    17edf20 <_ZdlPv@plt>
2652045- 1338bea:	41 56                	push   r14
2652046- 1338bec:	53                   	push   rbx
2652047- 1338bed:	50                   	push   rax
2652048- 1338bee:	48 63 1e             	movsxd rbx,DWORD PTR [rsi]
2652049- 1338bf1:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
2652051- 1338bfb:	48 2b 87 98 00 00 00 	sub    rax,QWORD PTR [rdi+0x98]
2652052- 1338c02:	6a 18                	push   0x18
2652053- 1338c04:	41 58                	pop    r8
2652054- 1338c06:	48 99                	cqo
2652055- 1338c08:	49 f7 f8             	idiv   r8
2652056- 1338c0b:	48 39 d8             	cmp    rax,rbx
2652057- 1338c0e:	48 0f 42 d8          	cmovb  rbx,rax
2652058- 1338c12:	4c 63 76 04          	movsxd r14,DWORD PTR [rsi+0x4]
2652059- 1338c16:	48 29 d8             	sub    rax,rbx
2652060- 1338c19:	4c 39 f0             	cmp    rax,r14
2652061- 1338c1c:	4c 0f 42 f0          	cmovb  r14,rax
2652062- 1338c20:	ff 51 20             	call   QWORD PTR [rcx+0x20]
2652063- 1338c23:	48 29 da             	sub    rdx,rbx
2652064- 1338c26:	49 83 fe ff          	cmp    r14,0xffffffffffffffff
2652065- 1338c2a:	49 0f 45 d6          	cmovne rdx,r14
2652066- 1338c2e:	48 6b cb 18          	imul   rcx,rbx,0x18
2652067- 1338c32:	48 01 c8             	add    rax,rcx
2652068- 1338c35:	48 83 c4 08          	add    rsp,0x8
2652069- 1338c39:	5b                   	pop    rbx
2652070- 1338c3a:	41 5e                	pop    r14
2652071- 1338c3c:	c3                   	ret
2652072- 1338c3d:	cc                   	int3
2652073- 1338c3e:	48 8b 8f 98 00 00 00 	mov    rcx,QWORD PTR [rdi+0x98]
2652075- 1338c4c:	48 29 c8             	sub    rax,rcx
2652076- 1338c4f:	6a 18                	push   0x18
2652077- 1338c51:	5e                   	pop    rsi
2652078- 1338c52:	48 99                	cqo
2652079- 1338c54:	48 f7 fe             	idiv   rsi
2652080- 1338c57:	48 89 c2             	mov    rdx,rax
2652081- 1338c5a:	48 89 c8             	mov    rax,rcx
2652082- 1338c5d:	c3                   	ret
2652083- 1338c5e:	53                   	push   rbx
2652084- 1338c5f:	48 89 fb             	mov    rbx,rdi
2652085- 1338c62:	48 83 c7 20          	add    rdi,0x20
2652086- 1338c66:	e8 19 35 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
2652087- 1338c6b:	48 89 df             	mov    rdi,rbx
2652088- 1338c6e:	5b                   	pop    rbx
2652089- 1338c6f:	e9 10 35 ff ff       	jmp    132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
2652090- 1338c74:	53                   	push   rbx
2652091- 1338c75:	48 89 fb             	mov    rbx,rdi
2652092- 1338c78:	48 81 c7 98 00 00 00 	add    rdi,0x98
2652093- 1338c7f:	e8 1e ff ff ff       	call   1338ba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e126>
2652094- 1338c84:	48 83 a3 90 00 00 00 	and    QWORD PTR [rbx+0x90],0x0
2652095- 1338c8b:	00 
2652096- 1338c8c:	5b                   	pop    rbx
2652097- 1338c8d:	c3                   	ret
2652098- 1338c8e:	41 56                	push   r14
2652099- 1338c90:	53                   	push   rbx
2652100- 1338c91:	48 83 ec 28          	sub    rsp,0x28
2652101- 1338c95:	49 89 fe             	mov    r14,rdi
2652102- 1338c98:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2652459- 1339184:	4c 89 ff             	mov    rdi,r15
2652460- 1339187:	e8 2d 25 74 ff       	call   a7b6b9 <JNI_OnUnload@@Base+0x2f86>
2652461- 133918c:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
2652462- 1339193:	00 
2652463- 1339194:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
2652464- 1339198:	48 89 41 f8          	mov    QWORD PTR [rcx-0x8],rax
2652465- 133919c:	48 6b d2 18          	imul   rdx,rdx,0x18
2652466- 13391a0:	48 01 c2             	add    rdx,rax
2652467- 13391a3:	48 89 11             	mov    QWORD PTR [rcx],rdx
2652468- 13391a6:	48 8d 94 24 08 02 00 	lea    rdx,[rsp+0x208]
2652469- 13391ad:	00 
2652470- 13391ae:	48 89 02             	mov    QWORD PTR [rdx],rax
2652471- 13391b1:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
2652472- 13391b8:	00 
2652473- 13391b9:	48 89 94 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rdx
2652474- 13391c0:	00 
2652475- 13391c1:	48 8d 8c 24 20 02 00 	lea    rcx,[rsp+0x220]
2652476- 13391c8:	00 
2652478- 13391d0:	00 
2652479- 13391d1:	49 6b cf 18          	imul   rcx,r15,0x18
2652480- 13391d5:	31 ff                	xor    edi,edi
2652481- 13391d7:	48 8d 15 02 d7 52 00 	lea    rdx,[rip+0x52d702]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
2652482- 13391de:	48 89 fe             	mov    rsi,rdi
2652483- 13391e1:	48 89 14 38          	mov    QWORD PTR [rax+rdi*1],rdx
2652484- 13391e5:	49 8b 7c 3e 08       	mov    rdi,QWORD PTR [r14+rdi*1+0x8]
2652485- 13391ea:	48 89 7c 30 08       	mov    QWORD PTR [rax+rsi*1+0x8],rdi
2652486- 13391ef:	49 8b 7c 36 10       	mov    rdi,QWORD PTR [r14+rsi*1+0x10]
2652487- 13391f4:	48 89 7c 30 10       	mov    QWORD PTR [rax+rsi*1+0x10],rdi
2652488- 13391f9:	48 85 ff             	test   rdi,rdi
2652489- 13391fc:	74 05                	je     1339203 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e787>
2652490- 13391fe:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
2652491- 1339203:	48 8d 7e 18          	lea    rdi,[rsi+0x18]
2652492- 1339207:	48 39 f9             	cmp    rcx,rdi
2652493- 133920a:	75 d2                	jne    13391de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e762>
2652494- 133920c:	4c 8d 34 30          	lea    r14,[rax+rsi*1]
2652495- 1339210:	49 83 c6 18          	add    r14,0x18
2652496- 1339214:	4c 89 b4 24 20 02 00 	mov    QWORD PTR [rsp+0x220],r14
2652497- 133921b:	00 
2652498- 133921c:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2652499- 1339223:	00 
2652500- 1339224:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
2652501- 1339228:	e8 6d 07 00 00       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
2652502- 133922d:	4c 89 74 24 78       	mov    QWORD PTR [rsp+0x78],r14
2652503- 1339232:	48 8d bc 24 d8 01 00 	lea    rdi,[rsp+0x1d8]
2652504- 1339239:	00 
2652505- 133923a:	c6 47 08 01          	mov    BYTE PTR [rdi+0x8],0x1
2652622- 1339455:	4d 89 6f 40          	mov    QWORD PTR [r15+0x40],r13
2652623- 1339459:	49 89 7f 48          	mov    QWORD PTR [r15+0x48],rdi
2652624- 133945d:	41 0f 11 47 50       	movups XMMWORD PTR [r15+0x50],xmm0
2652625- 1339462:	45 88 5f 60          	mov    BYTE PTR [r15+0x60],r11b
2652626- 1339466:	48 8d 8b d8 04 00 00 	lea    rcx,[rbx+0x4d8]
2652627- 133946d:	49 89 4f 68          	mov    QWORD PTR [r15+0x68],rcx
2652628- 1339471:	48 8d 8b f8 04 00 00 	lea    rcx,[rbx+0x4f8]
2652629- 1339478:	49 89 4f 70          	mov    QWORD PTR [r15+0x70],rcx
2652630- 133947c:	4d 89 57 78          	mov    QWORD PTR [r15+0x78],r10
2652631- 1339480:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
2652632- 1339487:	48 8d 84 24 20 02 00 	lea    rax,[rsp+0x220]
2652633- 133948e:	00 
2652634- 133948f:	49 89 87 88 00 00 00 	mov    QWORD PTR [r15+0x88],rax
2652635- 1339496:	48 8d 83 98 00 00 00 	lea    rax,[rbx+0x98]
2652636- 133949d:	49 89 87 90 00 00 00 	mov    QWORD PTR [r15+0x90],rax
2652637- 13394a4:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
2652638- 13394a9:	49 89 87 98 00 00 00 	mov    QWORD PTR [r15+0x98],rax
2652639- 13394b0:	48 8d 83 78 05 00 00 	lea    rax,[rbx+0x578]
2652641- 13394be:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
2652643- 13394ca:	f2 41 0f 10 47 e8    	movsd  xmm0,QWORD PTR [r15-0x18]
2652644- 13394d0:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
2652645- 13394d5:	41 0f 10 47 f0       	movups xmm0,XMMWORD PTR [r15-0x10]
2652646- 13394da:	0f 11 84 24 0c 02 00 	movups XMMWORD PTR [rsp+0x20c],xmm0
2652647- 13394e1:	00 
2652648- 13394e2:	f2 41 0f 10 07       	movsd  xmm0,QWORD PTR [r15]
2652649- 13394e7:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
2652650- 13394ec:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2652651- 13394ef:	ff 90 e8 00 00 00    	call   QWORD PTR [rax+0xe8]
2652652- 13394f5:	48 85 c0             	test   rax,rax
2652653- 13394f8:	74 06                	je     1339500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea84>
2652654- 13394fa:	44 8a 68 5b          	mov    r13b,BYTE PTR [rax+0x5b]
2652655- 13394fe:	eb 03                	jmp    1339503 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ea87>
2652656- 1339500:	45 31 ed             	xor    r13d,r13d
2652657- 1339503:	44 8a bc 24 d0 00 00 	mov    r15b,BYTE PTR [rsp+0xd0]
2652658- 133950a:	00 
2652659- 133950b:	48 8b ac 24 c8 00 00 	mov    rbp,QWORD PTR [rsp+0xc8]
2652660- 1339512:	00 
2652661- 1339513:	4c 8b a4 24 d8 00 00 	mov    r12,QWORD PTR [rsp+0xd8]
2652662- 133951a:	00 
2652663- 133951b:	48 8b b4 24 e0 00 00 	mov    rsi,QWORD PTR [rsp+0xe0]
2652664- 1339522:	00 
2652665- 1339523:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2652666- 1339526:	0f 10 84 24 b8 00 00 	movups xmm0,XMMWORD PTR [rsp+0xb8]
2652667- 133952d:	00 
2652668- 133952e:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
2652669- 1339533:	4c 8d b4 24 d8 01 00 	lea    r14,[rsp+0x1d8]
2652670- 133953a:	00 
2653730- 133a3e1:	5b                   	pop    rbx
2653731- 133a3e2:	c3                   	ret
2653732- 133a3e3:	48 8b bb c0 05 00 00 	mov    rdi,QWORD PTR [rbx+0x5c0]
2653733- 133a3ea:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2653734- 133a3ed:	5b                   	pop    rbx
2653735- 133a3ee:	ff 60 20             	jmp    QWORD PTR [rax+0x20]
2653736- 133a3f1:	cc                   	int3
2653737- 133a3f2:	53                   	push   rbx
2653738- 133a3f3:	48 89 fb             	mov    rbx,rdi
2653739- 133a3f6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2653740- 133a3f9:	ff 50 50             	call   QWORD PTR [rax+0x50]
2653741- 133a3fc:	89 c1                	mov    ecx,eax
2653742- 133a3fe:	31 c0                	xor    eax,eax
2653743- 133a400:	84 c9                	test   cl,cl
2653744- 133a402:	75 06                	jne    133a40a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f98e>
2653745- 133a404:	8b 83 30 06 00 00    	mov    eax,DWORD PTR [rbx+0x630]
2653746- 133a40a:	5b                   	pop    rbx
2653747- 133a40b:	c3                   	ret
2653749- 133a413:	48 2b 87 a0 00 00 00 	sub    rax,QWORD PTR [rdi+0xa0]
2653750- 133a41a:	6a 18                	push   0x18
2653751- 133a41c:	59                   	pop    rcx
2653752- 133a41d:	48 99                	cqo
2653753- 133a41f:	48 f7 f9             	idiv   rcx
2653754- 133a422:	c3                   	ret
2653755- 133a423:	cc                   	int3
2653756- 133a424:	55                   	push   rbp
2653757- 133a425:	41 57                	push   r15
2653758- 133a427:	41 56                	push   r14
2653759- 133a429:	41 55                	push   r13
2653760- 133a42b:	41 54                	push   r12
2653761- 133a42d:	53                   	push   rbx
2653762- 133a42e:	48 83 ec 38          	sub    rsp,0x38
2653763- 133a432:	48 89 fb             	mov    rbx,rdi
2653764- 133a435:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2653765- 133a43c:	00 00 
2653766- 133a43e:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
2653767- 133a443:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2653768- 133a446:	49 89 e6             	mov    r14,rsp
2653769- 133a449:	4c 89 f7             	mov    rdi,r14
2653770- 133a44c:	48 89 de             	mov    rsi,rbx
2653771- 133a44f:	ff 50 48             	call   QWORD PTR [rax+0x48]
2653772- 133a452:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
2653773- 133a455:	48 85 ff             	test   rdi,rdi
2653774- 133a458:	0f 84 d3 00 00 00    	je     133a531 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17fab5>
2653775- 133a45e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2653776- 133a461:	ff 50 20             	call   QWORD PTR [rax+0x20]
2654049- 133a838:	75 08                	jne    133a842 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17fdc6>
2654050- 133a83a:	48 89 df             	mov    rdi,rbx
2654051- 133a83d:	e8 8e 54 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2654052- 133a842:	e8 69 52 4b 00       	call   17efab0 <__stack_chk_fail@plt>
2654053- 133a847:	cc                   	int3
2654054- 133a848:	53                   	push   rbx
2654055- 133a849:	48 89 fb             	mov    rbx,rdi
2654056- 133a84c:	48 8b bf c0 05 00 00 	mov    rdi,QWORD PTR [rdi+0x5c0]
2654057- 133a853:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2654058- 133a856:	ff 50 50             	call   QWORD PTR [rax+0x50]
2654059- 133a859:	48 8b bb 80 03 00 00 	mov    rdi,QWORD PTR [rbx+0x380]
2654060- 133a860:	e8 89 42 00 00       	call   133eaee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184072>
2654061- 133a865:	48 8b bb 90 03 00 00 	mov    rdi,QWORD PTR [rbx+0x390]
2654062- 133a86c:	5b                   	pop    rbx
2654063- 133a86d:	e9 ce 20 00 00       	jmp    133c940 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x181ec4>
2654064- 133a872:	48 83 c7 08          	add    rdi,0x8
2654065- 133a876:	e9 6f e3 ff ff       	jmp    1338bea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e16e>
2654066- 133a87b:	cc                   	int3
2654069- 133a88a:	48 29 c8             	sub    rax,rcx
2654070- 133a88d:	6a 18                	push   0x18
2654071- 133a88f:	5e                   	pop    rsi
2654072- 133a890:	48 99                	cqo
2654073- 133a892:	48 f7 fe             	idiv   rsi
2654074- 133a895:	48 89 c2             	mov    rdx,rax
2654075- 133a898:	48 89 c8             	mov    rax,rcx
2654076- 133a89b:	c3                   	ret
2654077- 133a89c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
2654078- 133a8a0:	e9 3f f7 ff ff       	jmp    1339fe4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f568>
2654079- 133a8a5:	cc                   	int3
2654080- 133a8a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
2654081- 133a8aa:	e9 09 f9 ff ff       	jmp    133a1b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f73c>
2654082- 133a8af:	cc                   	int3
2654083- 133a8b0:	e9 35 e3 ff ff       	jmp    1338bea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e16e>
2654084- 133a8b5:	cc                   	int3
2654085- 133a8b6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
2654086- 133a8ba:	e9 ff fa ff ff       	jmp    133a3be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f942>
2654087- 133a8bf:	cc                   	int3
2654088- 133a8c0:	41 57                	push   r15
2654089- 133a8c2:	41 56                	push   r14
2654090- 133a8c4:	53                   	push   rbx
2654091- 133a8c5:	48 83 ec 50          	sub    rsp,0x50
2654092- 133a8c9:	48 89 f3             	mov    rbx,rsi
2654093- 133a8cc:	49 89 fe             	mov    r14,rdi
2654094- 133a8cf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2654095- 133a8d6:	00 00 
2654096- 133a8d8:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2654196- 133aa0a:	48 89 fb             	mov    rbx,rdi
2654197- 133aa0d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2654198- 133aa14:	00 00 
2654199- 133aa16:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2654200- 133aa1b:	31 c0                	xor    eax,eax
2654201- 133aa1d:	88 07                	mov    BYTE PTR [rdi],al
2654202- 133aa1f:	48 83 67 08 00       	and    QWORD PTR [rdi+0x8],0x0
2654203- 133aa24:	49 89 cd             	mov    r13,rcx
2654204- 133aa27:	48 83 67 18 00       	and    QWORD PTR [rdi+0x18],0x0
2654205- 133aa2c:	48 83 67 28 00       	and    QWORD PTR [rdi+0x28],0x0
2654206- 133aa31:	48 89 f7             	mov    rdi,rsi
2654207- 133aa34:	48 83 63 38 00       	and    QWORD PTR [rbx+0x38],0x0
2654208- 133aa39:	48 83 63 48 00       	and    QWORD PTR [rbx+0x48],0x0
2654209- 133aa3e:	48 83 63 58 00       	and    QWORD PTR [rbx+0x58],0x0
2654210- 133aa43:	44 8a b4 24 90 00 00 	mov    r14b,BYTE PTR [rsp+0x90]
2654211- 133aa4a:	00 
2654212- 133aa4b:	4c 8d 53 28          	lea    r10,[rbx+0x28]
2654213- 133aa4f:	88 43 68             	mov    BYTE PTR [rbx+0x68],al
2654215- 133aa58:	48 83 ec 08          	sub    rsp,0x8
2654216- 133aa5c:	45 0f b6 ce          	movzx  r9d,r14b
2654217- 133aa60:	48 89 74 24 10       	mov    QWORD PTR [rsp+0x10],rsi
2654218- 133aa65:	48 89 54 24 18       	mov    QWORD PTR [rsp+0x18],rdx
2654219- 133aa6a:	48 89 d6             	mov    rsi,rdx
2654220- 133aa6d:	48 89 ca             	mov    rdx,rcx
2654221- 133aa70:	4c 89 c1             	mov    rcx,r8
2654222- 133aa73:	4d 89 e0             	mov    r8,r12
2654223- 133aa76:	44 89 4c 24 24       	mov    DWORD PTR [rsp+0x24],r9d
2654224- 133aa7b:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]
2654225- 133aa82:	41 52                	push   r10
2654226- 133aa84:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
2654227- 133aa8b:	e8 35 02 00 00       	call   133acc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180249>
2654228- 133aa90:	48 83 c4 20          	add    rsp,0x20
2654229- 133aa94:	88 03                	mov    BYTE PTR [rbx],al
2654230- 133aa96:	41 b7 01             	mov    r15b,0x1
2654231- 133aa99:	84 c0                	test   al,al
2654232- 133aa9b:	0f 84 80 00 00 00    	je     133ab21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1800a5>
2654233- 133aaa1:	4d 85 ed             	test   r13,r13
2654234- 133aaa4:	74 74                	je     133ab1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18009e>
2654235- 133aaa6:	48 8d 43 08          	lea    rax,[rbx+0x8]
2654236- 133aaaa:	45 84 f6             	test   r14b,r14b
2654237- 133aaad:	74 4b                	je     133aafa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18007e>
2654238- 133aaaf:	4c 8d 4c 24 30       	lea    r9,[rsp+0x30]
2654239- 133aab4:	49 83 21 00          	and    QWORD PTR [r9],0x0
2654240- 133aab8:	49 83 61 10 00       	and    QWORD PTR [r9+0x10],0x0
2654241- 133aabd:	48 83 ec 08          	sub    rsp,0x8
2654242- 133aac1:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
2654243- 133aac6:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
2654244- 133aacb:	4c 89 ea             	mov    rdx,r13
2654245- 133aace:	31 c9                	xor    ecx,ecx
2654246- 133aad0:	45 31 c0             	xor    r8d,r8d
2654247- 133aad3:	ff b4 24 a8 00 00 00 	push   QWORD PTR [rsp+0xa8]
2654248- 133aada:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
2654249- 133aae1:	50                   	push   rax
2654250- 133aae2:	e8 a8 03 00 00       	call   133ae8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180413>
2654251- 133aae7:	48 83 c4 20          	add    rsp,0x20
2654252- 133aaeb:	41 89 c7             	mov    r15d,eax
2654253- 133aaee:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
2654254- 133aaf3:	e8 8c 16 ff ff       	call   132c184 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x171708>
2654255- 133aaf8:	eb 20                	jmp    133ab1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18009e>
2654256- 133aafa:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
2654257- 133aaff:	48 8b 74 24 10       	mov    rsi,QWORD PTR [rsp+0x10]
2654258- 133ab04:	4c 89 ea             	mov    rdx,r13
2654259- 133ab07:	48 89 c1             	mov    rcx,rax
2654261- 133ab11:	00 
2654262- 133ab12:	e8 eb 08 00 00       	call   133b402 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180986>
2654263- 133ab17:	41 89 c7             	mov    r15d,eax
2654264- 133ab1a:	44 88 3b             	mov    BYTE PTR [rbx],r15b
2654265- 133ab1d:	41 80 f7 01          	xor    r15b,0x1
2654266- 133ab21:	45 84 ff             	test   r15b,r15b
2654267- 133ab24:	0f 85 32 01 00 00    	jne    133ac5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801e0>
2654268- 133ab2a:	80 bc 24 98 00 00 00 	cmp    BYTE PTR [rsp+0x98],0x0
2654269- 133ab31:	00 
2654270- 133ab32:	0f 84 24 01 00 00    	je     133ac5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801e0>
2654271- 133ab38:	4d 85 e4             	test   r12,r12
2654272- 133ab3b:	0f 84 1b 01 00 00    	je     133ac5c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801e0>
2654273- 133ab41:	4c 89 6c 24 28       	mov    QWORD PTR [rsp+0x28],r13
2654274- 133ab46:	0f 57 c0             	xorps  xmm0,xmm0
2654275- 133ab49:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
2654276- 133ab4e:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
2654277- 133ab51:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
2654278- 133ab56:	4c 89 e6             	mov    rsi,r12
2654279- 133ab59:	e8 96 b1 fc ff       	call   1305cf4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x14b278>
2654280- 133ab5e:	48 8d 43 68          	lea    rax,[rbx+0x68]
2654281- 133ab62:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
2654282- 133ab67:	4d 6b fc 38          	imul   r15,r12,0x38
2654283- 133ab6b:	4c 8d 2d 6f f8 0f ff 	lea    r13,[rip+0xffffffffff0ff86f]        # 43a3e1 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5fe30>
2654284- 133ab72:	4c 8d 74 24 30       	lea    r14,[rsp+0x30]
2654285- 133ab77:	48 89 ef             	mov    rdi,rbp
2654286- 133ab7a:	4c 89 ee             	mov    rsi,r13
2654287- 133ab7d:	e8 cd 0c 74 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
2654288- 133ab82:	84 c0                	test   al,al
2654293- 133ab91:	48 83 c5 38          	add    rbp,0x38
2654294- 133ab95:	49 83 c7 c8          	add    r15,0xffffffffffffffc8
2654295- 133ab99:	75 dc                	jne    133ab77 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1800fb>
2654296- 133ab9b:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
2654297- 133aba0:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
2654298- 133aba5:	48 29 c8             	sub    rax,rcx
2654299- 133aba8:	6a 38                	push   0x38
2654300- 133abaa:	41 5e                	pop    r14
2654301- 133abac:	48 99                	cqo
2654302- 133abae:	49 f7 fe             	idiv   r14
2654303- 133abb1:	4c 39 e0             	cmp    rax,r12
2654304- 133abb4:	4c 8b 7c 24 28       	mov    r15,QWORD PTR [rsp+0x28]
2654305- 133abb9:	0f 83 93 00 00 00    	jae    133ac52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1801d6>
2654306- 133abbf:	80 bb a8 00 00 00 00 	cmp    BYTE PTR [rbx+0xa8],0x0
2654307- 133abc6:	74 28                	je     133abf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180174>
2654308- 133abc8:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
2654309- 133abcd:	4c 89 e7             	mov    rdi,r12
2654310- 133abd0:	e8 89 e0 ff ff       	call   1338c5e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17e1e2>
2654312- 133abdc:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
2654313- 133abe1:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
2654314- 133abe6:	48 29 c8             	sub    rax,rcx
2654315- 133abe9:	48 99                	cqo
2654316- 133abeb:	49 f7 fe             	idiv   r14
2654317- 133abee:	eb 05                	jmp    133abf5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180179>
2654318- 133abf0:	4c 8b 64 24 20       	mov    r12,QWORD PTR [rsp+0x20]
2654319- 133abf5:	0f 57 c0             	xorps  xmm0,xmm0
2654320- 133abf8:	41 0f 11 44 24 30    	movups XMMWORD PTR [r12+0x30],xmm0
2654321- 133abfe:	41 0f 11 44 24 20    	movups XMMWORD PTR [r12+0x20],xmm0
2654322- 133ac04:	41 0f 11 44 24 10    	movups XMMWORD PTR [r12+0x10],xmm0
2654323- 133ac0a:	41 0f 11 04 24       	movups XMMWORD PTR [r12],xmm0
2654325- 133ac16:	48 83 ec 08          	sub    rsp,0x8
2654326- 133ac1a:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
2654327- 133ac1f:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]
2654328- 133ac24:	4c 89 fa             	mov    rdx,r15
2654329- 133ac27:	49 89 c0             	mov    r8,rax
2654330- 133ac2a:	44 8b 4c 24 24       	mov    r9d,DWORD PTR [rsp+0x24]
2654331- 133ac2f:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]
2654332- 133ac36:	41 54                	push   r12
2654333- 133ac38:	ff b4 24 b8 00 00 00 	push   QWORD PTR [rsp+0xb8]
2654334- 133ac3f:	e8 81 00 00 00       	call   133acc5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180249>
2654335- 133ac44:	48 83 c4 20          	add    rsp,0x20
2654336- 133ac48:	80 3b 00             	cmp    BYTE PTR [rbx],0x0
2654337- 133ac4b:	0f 95 c1             	setne  cl
2654338- 133ac4e:	20 c8                	and    al,cl
2654339- 133ac50:	88 03                	mov    BYTE PTR [rbx],al
2654340- 133ac52:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
2654341- 133ac57:	e8 66 b2 8e ff       	call   c25ec2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x172e62>
2654342- 133ac5c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2654343- 133ac63:	00 00 
2654344- 133ac65:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
2654345- 133ac6a:	75 54                	jne    133acc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180244>
2654346- 133ac6c:	48 83 c4 58          	add    rsp,0x58
2654347- 133ac70:	5b                   	pop    rbx
2654348- 133ac71:	41 5c                	pop    r12
2654349- 133ac73:	41 5d                	pop    r13
2654350- 133ac75:	41 5e                	pop    r14
2654351- 133ac77:	41 5f                	pop    r15
2654352- 133ac79:	5d                   	pop    rbp
2654368- 133acaf:	00 00 
2654369- 133acb1:	48 3b 44 24 50       	cmp    rax,QWORD PTR [rsp+0x50]
2654370- 133acb6:	75 08                	jne    133acc0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x180244>
2654371- 133acb8:	4c 89 f7             	mov    rdi,r14
2654372- 133acbb:	e8 10 50 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2654373- 133acc0:	e8 eb 4d 4b 00       	call   17efab0 <__stack_chk_fail@plt>
2654374- 133acc5:	55                   	push   rbp
2654375- 133acc6:	41 57                	push   r15
2654376- 133acc8:	41 56                	push   r14
2654377- 133acca:	41 55                	push   r13
2654378- 133accc:	41 54                	push   r12
2654379- 133acce:	53                   	push   rbx
2654380- 133accf:	48 83 ec 68          	sub    rsp,0x68
2654381- 133acd3:	49 89 d7             	mov    r15,rdx
2654382- 133acd6:	48 89 f5             	mov    rbp,rsi
2654383- 133acd9:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi
2654384- 133acde:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
2654385- 133ace5:	00 
2654387- 133aced:	00 
2654389- 133acf5:	00 
2654390- 133acf6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2654391- 133acfd:	00 00 
2654392- 133acff:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
2654393- 133ad04:	0f 57 c0             	xorps  xmm0,xmm0
2654394- 133ad07:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
2654395- 133ad0c:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
2654396- 133ad11:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
2654397- 133ad16:	41 0f b6 c1          	movzx  eax,r9b
2654398- 133ad1a:	89 44 24 04          	mov    DWORD PTR [rsp+0x4],eax
2654399- 133ad1e:	4d 85 c0             	test   r8,r8
2654400- 133ad21:	0f 84 c2 00 00 00    	je     133ade9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18036d>
2654401- 133ad27:	49 89 cc             	mov    r12,rcx
2654402- 133ad2a:	48 89 6c 24 10       	mov    QWORD PTR [rsp+0x10],rbp
2654403- 133ad2f:	4c 89 7c 24 18       	mov    QWORD PTR [rsp+0x18],r15
2654404- 133ad34:	4c 8d 7c 24 38       	lea    r15,[rsp+0x38]
2654405- 133ad39:	49 6b e8 38          	imul   rbp,r8,0x38
2654406- 133ad3d:	4c 8d 2d dc 02 6b 00 	lea    r13,[rip+0x6b02dc]        # 19eb020 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1c58>
2654407- 133ad44:	48 8d 5c 24 50       	lea    rbx,[rsp+0x50]
2654408- 133ad49:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
2654409- 133ad4e:	4c 89 e7             	mov    rdi,r12
2654410- 133ad51:	e8 e0 0a 74 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2654411- 133ad56:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2654412- 133ad5b:	48 89 54 24 58       	mov    QWORD PTR [rsp+0x58],rdx
2654413- 133ad60:	4c 89 ef             	mov    rdi,r13
2654414- 133ad63:	48 89 de             	mov    rsi,rbx
2654415- 133ad66:	e8 9d b3 ec ff       	call   1206108 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b68c>
2654416- 133ad6b:	84 c0                	test   al,al
2654417- 133ad6d:	4c 89 f7             	mov    rdi,r14
2654418- 133ad70:	49 0f 45 ff          	cmovne rdi,r15
2654419- 133ad74:	4c 89 e6             	mov    rsi,r12
2654420- 133ad77:	e8 94 c4 f8 ff       	call   12c7210 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c794>
2654421- 133ad7c:	49 83 c4 38          	add    r12,0x38
2654422- 133ad80:	48 83 c5 c8          	add    rbp,0xffffffffffffffc8
2654423- 133ad84:	75 c8                	jne    133ad4e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1802d2>
2654424- 133ad86:	48 8b 4c 24 20       	mov    rcx,QWORD PTR [rsp+0x20]
2654425- 133ad8b:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
2654426- 133ad90:	48 39 c1             	cmp    rcx,rax
2654428- 133ad9a:	00 
2654430- 133ada2:	00 
2654431- 133ada3:	4c 8b 7c 24 18       	mov    r15,QWORD PTR [rsp+0x18]
2654432- 133ada8:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
2654433- 133adaf:	00 
2654434- 133adb0:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
2654435- 133adb5:	74 32                	je     133ade9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18036d>
2654436- 133adb7:	48 29 c8             	sub    rax,rcx
2654437- 133adba:	48 99                	cqo
2654438- 133adbc:	6a 38                	push   0x38
2654439- 133adbe:	5e                   	pop    rsi
2654440- 133adbf:	48 f7 fe             	idiv   rsi
2654441- 133adc2:	48 83 ec 08          	sub    rsp,0x8
2654442- 133adc6:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
2654443- 133adcb:	31 f6                	xor    esi,esi
2654444- 133adcd:	31 d2                	xor    edx,edx
2654445- 133adcf:	49 89 c0             	mov    r8,rax
2654446- 133add2:	44 8b 4c 24 0c       	mov    r9d,DWORD PTR [rsp+0xc]
2654447- 133add7:	41 55                	push   r13
2654448- 133add9:	41 56                	push   r14
2654449- 133addb:	53                   	push   rbx
2654450- 133addc:	e8 5d 16 00 00       	call   133c43e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1819c2>
2654451- 133ade1:	48 83 c4 20          	add    rsp,0x20
2654452- 133ade5:	84 c0                	test   al,al
2654453- 133ade7:	74 4b                	je     133ae34 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1803b8>
2654454- 133ade9:	48 8b 4c 24 38       	mov    rcx,QWORD PTR [rsp+0x38]
2654455- 133adee:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
2654456- 133adf3:	48 39 c1             	cmp    rcx,rax
2654457- 133adf6:	74 38                	je     133ae30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1803b4>
2656509- 133cb10:	48 8d 74 24 48       	lea    rsi,[rsp+0x48]
2656510- 133cb15:	e8 92 c6 83 ff       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>
2656511- 133cb1a:	48 83 a4 24 a0 00 00 	and    QWORD PTR [rsp+0xa0],0x0
2656512- 133cb21:	00 00 
2656513- 133cb23:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
2656514- 133cb28:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
2656515- 133cb2f:	00 00 
2656516- 133cb31:	6a 18                	push   0x18
2656517- 133cb33:	5f                   	pop    rdi
2656518- 133cb34:	e8 c7 13 4b 00       	call   17edf00 <_Znwm@plt>
2656519- 133cb39:	49 89 c7             	mov    r15,rax
2656520- 133cb3c:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
2656521- 133cb41:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
2656522- 133cb46:	48 89 c7             	mov    rdi,rax
2656523- 133cb49:	4c 89 e6             	mov    rsi,r12
2656524- 133cb4c:	e8 67 b4 82 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
2656525- 133cb51:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
2656526- 133cb56:	49 89 47 10          	mov    QWORD PTR [r15+0x10],rax
2656528- 133cb61:	00 
2656529- 133cb62:	48 8d 05 d1 b7 8e ff 	lea    rax,[rip+0xffffffffff8eb7d1]        # c2833a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1752da>
2656530- 133cb69:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
2656531- 133cb70:	00 
2656532- 133cb71:	48 8d 05 a6 07 00 00 	lea    rax,[rip+0x7a6]        # 133d31e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1828a2>
2656533- 133cb78:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
2656534- 133cb7f:	00 
2656535- 133cb80:	49 8b 7d 00          	mov    rdi,QWORD PTR [r13+0x0]
2656536- 133cb84:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2656537- 133cb87:	ff 50 50             	call   QWORD PTR [rax+0x50]
2656538- 133cb8a:	49 89 c7             	mov    r15,rax
2656539- 133cb8d:	48 89 c7             	mov    rdi,rax
2656540- 133cb90:	48 81 c7 d0 09 00 00 	add    rdi,0x9d0
2656541- 133cb97:	ff 90 e8 09 00 00    	call   QWORD PTR [rax+0x9e8]
2656542- 133cb9d:	49 69 8f 00 0a 00 00 	imul   rcx,QWORD PTR [r15+0xa00],0x3e8
2656543- 133cba4:	e8 03 00 00 
2656544- 133cba8:	48 01 c1             	add    rcx,rax
2656545- 133cbab:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx
2656546- 133cbb2:	00 
2656547- 133cbb3:	48 8b 84 24 88 00 00 	mov    rax,QWORD PTR [rsp+0x88]
2656548- 133cbba:	00 
2656549- 133cbbb:	48 8b 58 18          	mov    rbx,QWORD PTR [rax+0x18]
2656550- 133cbbf:	48 85 db             	test   rbx,rbx
2656551- 133cbc2:	0f 84 28 01 00 00    	je     133ccf0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182274>
2656552- 133cbc8:	4c 8d bc 24 c0 00 00 	lea    r15,[rsp+0xc0]
2656553- 133cbcf:	00 
2656554- 133cbd0:	4c 8b 73 18          	mov    r14,QWORD PTR [rbx+0x18]
2656555- 133cbd4:	4c 8b 63 20          	mov    r12,QWORD PTR [rbx+0x20]
2656973- 133d1b2:	e9 be fe ff ff       	jmp    133d075 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1825f9>
2656974- 133d1b7:	eb 00                	jmp    133d1b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18273d>
2656975- 133d1b9:	48 89 c3             	mov    rbx,rax
2656976- 133d1bc:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2656977- 133d1c1:	e8 ca 0c 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2656978- 133d1c6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2656979- 133d1cd:	00 00 
2656980- 133d1cf:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
2656981- 133d1d4:	75 08                	jne    133d1de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182762>
2656982- 133d1d6:	48 89 df             	mov    rdi,rbx
2656983- 133d1d9:	e8 f2 2a 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2656984- 133d1de:	e8 cd 28 4b 00       	call   17efab0 <__stack_chk_fail@plt>
2656985- 133d1e3:	cc                   	int3
2656986- 133d1e4:	53                   	push   rbx
2656987- 133d1e5:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
2656988- 133d1ec:	48 89 f8             	mov    rax,rdi
2656989- 133d1ef:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
2656990- 133d1f6:	00 00 
2656992- 133d1ff:	00 
2656993- 133d200:	66 89 b4 24 a4 00 00 	mov    WORD PTR [rsp+0xa4],si
2656994- 133d207:	00 
2656995- 133d208:	c1 ee 10             	shr    esi,0x10
2656996- 133d20b:	40 88 b4 24 a6 00 00 	mov    BYTE PTR [rsp+0xa6],sil
2656997- 133d212:	00 
2656998- 133d213:	0f 57 c0             	xorps  xmm0,xmm0
2656999- 133d216:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]
2657000- 133d21d:	00 
2657001- 133d21e:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
2657002- 133d221:	48 83 62 10 00       	and    QWORD PTR [rdx+0x10],0x0
2657003- 133d226:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
2657004- 133d22b:	48 89 c6             	mov    rsi,rax
2657005- 133d22e:	e8 d7 d1 49 00       	call   17da40a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x622b>
2657006- 133d233:	48 8d 84 24 a4 00 00 	lea    rax,[rsp+0xa4]
2657007- 133d23a:	00 
2657008- 133d23b:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
2657009- 133d240:	48 89 06             	mov    QWORD PTR [rsi],rax
2657010- 133d243:	48 8b 54 24 68       	mov    rdx,QWORD PTR [rsp+0x68]
2657011- 133d248:	48 8b 5c 24 70       	mov    rbx,QWORD PTR [rsp+0x70]
2657012- 133d24d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
2657013- 133d252:	48 89 d9             	mov    rcx,rbx
2657014- 133d255:	e8 38 01 00 00       	call   133d392 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182916>
2657015- 133d25a:	48 89 e7             	mov    rdi,rsp
2657016- 133d25d:	48 8d 74 24 60       	lea    rsi,[rsp+0x60]
2657017- 133d262:	48 89 da             	mov    rdx,rbx
2657018- 133d265:	48 89 d9             	mov    rcx,rbx
2657019- 133d268:	e8 25 01 00 00       	call   133d392 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182916>
2657383- 133d76f:	49 f7 f5             	div    r13
2657384- 133d772:	48 89 d0             	mov    rax,rdx
2657385- 133d775:	48 39 e8             	cmp    rax,rbp
2657386- 133d778:	75 08                	jne    133d782 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182d06>
2657387- 133d77a:	48 8b 1b             	mov    rbx,QWORD PTR [rbx]
2657388- 133d77d:	48 85 db             	test   rbx,rbx
2657389- 133d780:	75 b6                	jne    133d738 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182cbc>
2657390- 133d782:	4c 8b 3c 24          	mov    r15,QWORD PTR [rsp]
2657391- 133d786:	6a 38                	push   0x38
2657392- 133d788:	5f                   	pop    rdi
2657393- 133d789:	e8 72 07 4b 00       	call   17edf00 <_Znwm@plt>
2657394- 133d78e:	48 83 20 00          	and    QWORD PTR [rax],0x0
2657395- 133d792:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
2657396- 133d799:	00 
2657397- 133d79a:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
2657398- 133d79e:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
2657399- 133d7a5:	00 
2657400- 133d7a6:	48 89 48 20          	mov    QWORD PTR [rax+0x20],rcx
2657402- 133d7b1:	00 
2657403- 133d7b2:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
2657404- 133d7b6:	0f 57 c0             	xorps  xmm0,xmm0
2657406- 133d7c0:	00 
2657407- 133d7c1:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
2657408- 133d7c8:	00 00 
2657409- 133d7ca:	0f b7 8c 24 b8 00 00 	movzx  ecx,WORD PTR [rsp+0xb8]
2657410- 133d7d1:	00 
2657411- 133d7d2:	66 89 48 28          	mov    WORD PTR [rax+0x28],cx
2657412- 133d7d6:	48 83 60 30 00       	and    QWORD PTR [rax+0x30],0x0
2657413- 133d7db:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
2657414- 133d7e0:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
2657415- 133d7e7:	00 
2657416- 133d7e8:	c6 84 24 d8 00 00 00 	mov    BYTE PTR [rsp+0xd8],0x1
2657417- 133d7ef:	01 
2657418- 133d7f0:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
2657419- 133d7f4:	48 ff c0             	inc    rax
2657420- 133d7f7:	78 07                	js     133d800 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182d84>
2657421- 133d7f9:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
2657422- 133d7fe:	eb 15                	jmp    133d815 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x182d99>
2657423- 133d800:	48 89 c1             	mov    rcx,rax
2657424- 133d803:	48 d1 e9             	shr    rcx,1
2657425- 133d806:	83 e0 01             	and    eax,0x1
2657426- 133d809:	48 09 c8             	or     rax,rcx
2657427- 133d80c:	f3 48 0f 2a c0       	cvtsi2ss xmm0,rax
2657428- 133d811:	f3 0f 58 c0          	addss  xmm0,xmm0
2657429- 133d815:	4c 89 e9             	mov    rcx,r13
2657430- 133d818:	48 d1 e9             	shr    rcx,1
2657431- 133d81b:	44 89 e8             	mov    eax,r13d
2657432- 133d81e:	83 e0 01             	and    eax,0x1
2657433- 133d821:	48 09 c8             	or     rax,rcx
2657804- 133dd35:	eb 03                	jmp    133dd3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1832be>
2657805- 133dd37:	48 89 c3             	mov    rbx,rax
2657806- 133dd3a:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
2657807- 133dd41:	00 
2657808- 133dd42:	e8 49 01 4b 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2657809- 133dd47:	eb 03                	jmp    133dd4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1832d0>
2657810- 133dd49:	48 89 c3             	mov    rbx,rax
2657811- 133dd4c:	48 89 df             	mov    rdi,rbx
2657812- 133dd4f:	e8 51 bd 73 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
2657813- 133dd54:	55                   	push   rbp
2657814- 133dd55:	41 57                	push   r15
2657815- 133dd57:	41 56                	push   r14
2657816- 133dd59:	41 55                	push   r13
2657817- 133dd5b:	41 54                	push   r12
2657818- 133dd5d:	53                   	push   rbx
2657819- 133dd5e:	48 83 ec 68          	sub    rsp,0x68
2657820- 133dd62:	49 89 cf             	mov    r15,rcx
2657821- 133dd65:	48 89 fb             	mov    rbx,rdi
2657823- 133dd6f:	00 
2657824- 133dd70:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28
2657825- 133dd77:	00 00 
2657826- 133dd79:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
2657827- 133dd7e:	48 8d 0d 3b 87 52 00 	lea    rcx,[rip+0x52873b]        # 18664c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22ba8>
2657828- 133dd85:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
2657829- 133dd8a:	48 89 74 24 28       	mov    QWORD PTR [rsp+0x28],rsi
2657830- 133dd8f:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
2657831- 133dd94:	48 8d 05 2d d3 6a 00 	lea    rax,[rip+0x6ad32d]        # 19eb0c8 <_ZN4asio6detail30execution_context_service_baseINS0_23reactive_socket_serviceINS_2ip3udpEEEE2idE@@Base+0x1d00>
2657832- 133dd9b:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
2657833- 133dda0:	83 fa 17             	cmp    edx,0x17
2657834- 133dda3:	0f 87 08 05 00 00    	ja     133e2b1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183835>
2657835- 133dda9:	4d 89 cc             	mov    r12,r9
2657836- 133ddac:	49 89 f6             	mov    r14,rsi
2657838- 133ddb6:	00 
2657839- 133ddb7:	89 d0                	mov    eax,edx
2657840- 133ddb9:	48 8d 0d fc a0 05 ff 	lea    rcx,[rip+0xffffffffff05a0fc]        # 397ebc <_ZTSN10__cxxabiv121__vmi_class_type_infoE@@Base+0x4a9d>
2657841- 133ddc0:	48 63 04 81          	movsxd rax,DWORD PTR [rcx+rax*4]
2657842- 133ddc4:	48 01 c8             	add    rax,rcx
2657843- 133ddc7:	ff e0                	jmp    rax
2657844- 133ddc9:	48 89 e0             	mov    rax,rsp
2657845- 133ddcc:	48 83 20 00          	and    QWORD PTR [rax],0x0
2657846- 133ddd0:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
2657847- 133ddd5:	48 89 06             	mov    QWORD PTR [rsi],rax
2657848- 133ddd8:	48 8d 05 85 e6 73 ff 	lea    rax,[rip+0xffffffffff73e685]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
2657849- 133dddf:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
2657850- 133dde3:	48 8d 05 5a 06 00 00 	lea    rax,[rip+0x65a]        # 133e444 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1839c8>
2657851- 133ddea:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
2657852- 133ddee:	49 8b 06             	mov    rax,QWORD PTR [r14]
2657853- 133ddf1:	4c 89 f7             	mov    rdi,r14
2657854- 133ddf4:	ff 50 10             	call   QWORD PTR [rax+0x10]
2657855- 133ddf7:	e9 5b 01 00 00       	jmp    133df57 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1834db>
2657856- 133ddfc:	0f 57 c0             	xorps  xmm0,xmm0
2657857- 133ddff:	48 89 e0             	mov    rax,rsp
2657858- 133de02:	0f 29 00             	movaps XMMWORD PTR [rax],xmm0
2657859- 133de05:	48 8d 74 24 40       	lea    rsi,[rsp+0x40]
2657860- 133de0a:	48 89 06             	mov    QWORD PTR [rsi],rax
2657861- 133de0d:	48 8d 05 50 e6 73 ff 	lea    rax,[rip+0xffffffffff73e650]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
2657862- 133de14:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
2657863- 133de18:	48 8d 05 b1 06 00 00 	lea    rax,[rip+0x6b1]        # 133e4d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183a54>
2657864- 133de1f:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
2657865- 133de23:	49 8b 06             	mov    rax,QWORD PTR [r14]
2658883- 133ec9c:	48 89 5c 24 08       	mov    QWORD PTR [rsp+0x8],rbx
2658884- 133eca1:	0f 57 c0             	xorps  xmm0,xmm0
2658885- 133eca4:	0f 29 44 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm0
2658886- 133eca9:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
2658887- 133ecad:	49 8b 7c 24 50       	mov    rdi,QWORD PTR [r12+0x50]
2658888- 133ecb2:	4c 89 ee             	mov    rsi,r13
2658889- 133ecb5:	31 d2                	xor    edx,edx
2658890- 133ecb7:	4c 89 f1             	mov    rcx,r14
2658891- 133ecba:	e8 89 f4 2f 00       	call   163e148 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x392b6>
2658892- 133ecbf:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
2658893- 133ecc4:	48 85 c0             	test   rax,rax
2658894- 133ecc7:	0f 84 dd 00 00 00    	je     133edaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18432e>
2658895- 133eccd:	80 78 38 00          	cmp    BYTE PTR [rax+0x38],0x0
2658896- 133ecd1:	0f 84 d3 00 00 00    	je     133edaa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18432e>
2658897- 133ecd7:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
2658898- 133ecdc:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2658899- 133ecdf:	4c 89 ff             	mov    rdi,r15
2658900- 133ece2:	ff 50 18             	call   QWORD PTR [rax+0x18]
2658902- 133ecec:	ff c8                	dec    eax
2658903- 133ecee:	83 f8 fe             	cmp    eax,0xfffffffe
2658904- 133ecf1:	4d 89 fe             	mov    r14,r15
2658905- 133ecf4:	41 0f 92 c7          	setb   r15b
2658906- 133ecf8:	44 22 bc 24 ac 00 00 	and    r15b,BYTE PTR [rsp+0xac]
2658907- 133ecff:	00 
2658908- 133ed00:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
2658909- 133ed07:	00 
2658910- 133ed08:	e8 1b ca 73 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
2658911- 133ed0d:	4d 8b 64 24 58       	mov    r12,QWORD PTR [r12+0x58]
2658912- 133ed12:	48 8b 74 24 60       	mov    rsi,QWORD PTR [rsp+0x60]
2658913- 133ed17:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2658914- 133ed1a:	48 89 ef             	mov    rdi,rbp
2658915- 133ed1d:	31 d2                	xor    edx,edx
2658916- 133ed1f:	ff 50 18             	call   QWORD PTR [rax+0x18]
2658917- 133ed22:	48 89 ef             	mov    rdi,rbp
2658918- 133ed25:	e8 0c cb 73 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2658919- 133ed2a:	49 89 d0             	mov    r8,rdx
2658920- 133ed2d:	4d 8b 0c 24          	mov    r9,QWORD PTR [r12]
2658921- 133ed31:	4c 89 f3             	mov    rbx,r14
2658922- 133ed34:	4c 89 f7             	mov    rdi,r14
2658923- 133ed37:	4c 89 e6             	mov    rsi,r12
2658924- 133ed3a:	6a 0a                	push   0xa
2658925- 133ed3c:	5a                   	pop    rdx
2658926- 133ed3d:	48 89 c1             	mov    rcx,rax
2658927- 133ed40:	41 ff 51 28          	call   QWORD PTR [r9+0x28]
2658928- 133ed44:	49 89 ec             	mov    r12,rbp
2658929- 133ed47:	48 89 ef             	mov    rdi,rbp
2658985- 133ee25:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
2658986- 133ee29:	48 8d 4c 24 7f       	lea    rcx,[rsp+0x7f]
2658987- 133ee2e:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
2658988- 133ee32:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
2658989- 133ee39:	00 
2658990- 133ee3a:	49 89 06             	mov    QWORD PTR [r14],rax
2658991- 133ee3d:	48 8d 05 ca 34 82 ff 	lea    rax,[rip+0xffffffffff8234ca]        # b6230e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf2ae>
2658992- 133ee44:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
2658993- 133ee48:	48 8d 05 ed 06 00 00 	lea    rax,[rip+0x6ed]        # 133f53c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184ac0>
2658994- 133ee4f:	e9 3f 02 00 00       	jmp    133f093 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184617>
2658995- 133ee54:	49 39 dd             	cmp    r13,rbx
2658996- 133ee57:	0f 84 85 00 00 00    	je     133eee2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184466>
2658997- 133ee5d:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
2658998- 133ee64:	00 
2658999- 133ee65:	41 bc 09 04 00 00    	mov    r12d,0x409
2659000- 133ee6b:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
2659001- 133ee72:	00 
2659002- 133ee73:	0f 57 c0             	xorps  xmm0,xmm0
2659004- 133ee7d:	00 
2659005- 133ee7e:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
2659006- 133ee82:	48 8b 78 50          	mov    rdi,QWORD PTR [rax+0x50]
2659007- 133ee86:	4c 89 ee             	mov    rsi,r13
2659008- 133ee89:	31 d2                	xor    edx,edx
2659009- 133ee8b:	4c 89 f1             	mov    rcx,r14
2659010- 133ee8e:	e8 b5 f2 2f 00       	call   163e148 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x392b6>
2659011- 133ee93:	89 c5                	mov    ebp,eax
2659013- 133ee9c:	00 
2659014- 133ee9d:	48 85 ff             	test   rdi,rdi
2659015- 133eea0:	74 0f                	je     133eeb1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184435>
2659016- 133eea2:	80 7f 38 00          	cmp    BYTE PTR [rdi+0x38],0x0
2659017- 133eea6:	75 24                	jne    133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
2659018- 133eea8:	e8 33 21 9d ff       	call   d10fe0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25df80>
2659019- 133eead:	84 c0                	test   al,al
2659020- 133eeaf:	75 1b                	jne    133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
2659021- 133eeb1:	83 fd 0a             	cmp    ebp,0xa
2659022- 133eeb4:	77 16                	ja     133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
2659023- 133eeb6:	41 0f a3 ec          	bt     r12d,ebp
2659024- 133eeba:	73 10                	jae    133eecc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184450>
2659025- 133eebc:	4c 89 ff             	mov    rdi,r15
2659026- 133eebf:	4c 89 ee             	mov    rsi,r13
2659027- 133eec2:	e8 73 43 8d ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
2659028- 133eec7:	c6 44 24 7f 00       	mov    BYTE PTR [rsp+0x7f],0x0
2659030- 133eed3:	00 
2659031- 133eed4:	e8 ad f5 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2659032- 133eed9:	49 83 c5 58          	add    r13,0x58
2659033- 133eedd:	49 39 dd             	cmp    r13,rbx
2659034- 133eee0:	75 91                	jne    133ee73 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1843f7>
2659035- 133eee2:	4c 8b 24 24          	mov    r12,QWORD PTR [rsp]
2659036- 133eee6:	49 83 bc 24 80 00 00 	cmp    QWORD PTR [r12+0x80],0x0
2659037- 133eeed:	00 00 
2659038- 133eeef:	0f 84 5e 02 00 00    	je     133f153 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1846d7>
2659039- 133eef5:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
2659040- 133eefa:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2659041- 133eefd:	4c 8d b4 24 a0 00 00 	lea    r14,[rsp+0xa0]
2659042- 133ef04:	00 
2659043- 133ef05:	4c 89 f7             	mov    rdi,r14
2659044- 133ef08:	ff 50 18             	call   QWORD PTR [rax+0x18]
2659045- 133ef0b:	41 8b 06             	mov    eax,DWORD PTR [r14]
2659046- 133ef0e:	ff c8                	dec    eax
2659047- 133ef10:	83 f8 fe             	cmp    eax,0xfffffffe
2659048- 133ef13:	0f 92 c0             	setb   al
2659049- 133ef16:	41 22 46 0c          	and    al,BYTE PTR [r14+0xc]
2659050- 133ef1a:	88 44 24 08          	mov    BYTE PTR [rsp+0x8],al
2659051- 133ef1e:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
2659052- 133ef25:	00 
2659053- 133ef26:	e8 fd c7 73 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
2659054- 133ef2b:	4d 8b 7c 24 30       	mov    r15,QWORD PTR [r12+0x30]
2659055- 133ef30:	49 8b 44 24 38       	mov    rax,QWORD PTR [r12+0x38]
2659056- 133ef35:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
2659057- 133ef3a:	49 39 c7             	cmp    r15,rax
2659405- 133f492:	eb 04                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
2659406- 133f494:	eb 0c                	jmp    133f4a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a26>
2659407- 133f496:	eb 00                	jmp    133f498 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a1c>
2659408- 133f498:	48 89 c3             	mov    rbx,rax
2659409- 133f49b:	eb 68                	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
2659410- 133f49d:	48 89 c3             	mov    rbx,rax
2659411- 133f4a0:	eb 6d                	jmp    133f50f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a93>
2659412- 133f4a2:	48 89 c3             	mov    rbx,rax
2659413- 133f4a5:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
2659414- 133f4ac:	00 
2659415- 133f4ad:	e8 74 16 76 ff       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>
2659416- 133f4b2:	eb 51                	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
2659417- 133f4b4:	48 89 c3             	mov    rbx,rax
2659418- 133f4b7:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
2659419- 133f4bc:	e8 cf e9 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2659420- 133f4c1:	eb 12                	jmp    133f4d5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a59>
2659421- 133f4c3:	eb 0d                	jmp    133f4d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a56>
2659422- 133f4c5:	48 89 c3             	mov    rbx,rax
2659424- 133f4cf:	00 
2659425- 133f4d0:	eb 08                	jmp    133f4da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a5e>
2659426- 133f4d2:	48 89 c3             	mov    rbx,rax
2659427- 133f4d5:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
2659428- 133f4da:	e8 a7 ef 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2659429- 133f4df:	eb 24                	jmp    133f505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a89>
2659430- 133f4e1:	48 89 c3             	mov    rbx,rax
2659431- 133f4e4:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
2659432- 133f4e9:	e8 a2 e9 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2659433- 133f4ee:	48 8d bc 24 a8 00 00 	lea    rdi,[rsp+0xa8]
2659434- 133f4f5:	00 
2659435- 133f4f6:	eb 08                	jmp    133f500 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184a84>
2659436- 133f4f8:	48 89 c3             	mov    rbx,rax
2659437- 133f4fb:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
2659438- 133f500:	e8 8b e9 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2659439- 133f505:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
2659440- 133f50a:	e8 2d 8d 82 ff       	call   b6823c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb51dc>
2659441- 133f50f:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
2659442- 133f516:	00 
2659443- 133f517:	e8 f0 3e 8d ff       	call   c1340c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1603ac>
2659444- 133f51c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2659445- 133f523:	00 00 
2659446- 133f525:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
2659447- 133f52c:	00 
2659448- 133f52d:	75 08                	jne    133f537 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184abb>
2659449- 133f52f:	48 89 df             	mov    rdi,rbx
2659450- 133f532:	e8 99 07 73 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2659451- 133f537:	e8 74 05 4b 00       	call   17efab0 <__stack_chk_fail@plt>
2659452- 133f53c:	55                   	push   rbp
2659453- 133f53d:	41 57                	push   r15
2659454- 133f53f:	41 56                	push   r14
2659455- 133f541:	41 54                	push   r12
2659456- 133f543:	53                   	push   rbx
2659457- 133f544:	48 81 ec b0 00 00 00 	sub    rsp,0xb0
2659458- 133f54b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2659459- 133f552:	00 00 
2659461- 133f55b:	00 
2659462- 133f55c:	4c 8b 3f             	mov    r15,QWORD PTR [rdi]
2659463- 133f55f:	48 8b 1a             	mov    rbx,QWORD PTR [rdx]
2659464- 133f562:	80 7b 38 00          	cmp    BYTE PTR [rbx+0x38],0x0
2659465- 133f566:	0f 84 cd 00 00 00    	je     133f639 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184bbd>
2659466- 133f56c:	4d 8b 27             	mov    r12,QWORD PTR [r15]
2659467- 133f56f:	49 8b 74 24 60       	mov    rsi,QWORD PTR [r12+0x60]
2659468- 133f574:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2659469- 133f577:	4c 8d 74 24 50       	lea    r14,[rsp+0x50]
2659470- 133f57c:	4c 89 f7             	mov    rdi,r14
2659471- 133f57f:	ff 50 18             	call   QWORD PTR [rax+0x18]
2659472- 133f582:	41 8b 06             	mov    eax,DWORD PTR [r14]
2659473- 133f585:	ff c8                	dec    eax
2659474- 133f587:	83 f8 fe             	cmp    eax,0xfffffffe
2659475- 133f58a:	40 0f 92 c5          	setb   bpl
2659476- 133f58e:	41 22 6e 0c          	and    bpl,BYTE PTR [r14+0xc]
2659477- 133f592:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
2659478- 133f597:	e8 8c c1 73 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
2659479- 133f59c:	4d 8b 74 24 58       	mov    r14,QWORD PTR [r12+0x58]
2659480- 133f5a1:	48 8b 03             	mov    rax,QWORD PTR [rbx]
2659481- 133f5a4:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
2659482- 133f5a9:	48 89 de             	mov    rsi,rbx
2659483- 133f5ac:	31 d2                	xor    edx,edx
2659484- 133f5ae:	ff 50 18             	call   QWORD PTR [rax+0x18]
2659485- 133f5b1:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
2659486- 133f5b6:	e8 7b c2 73 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2659487- 133f5bb:	49 89 d0             	mov    r8,rdx
2659488- 133f5be:	4d 8b 0e             	mov    r9,QWORD PTR [r14]
2659621- 133f789:	41 57                	push   r15
2659622- 133f78b:	41 56                	push   r14
2659623- 133f78d:	41 55                	push   r13
2659624- 133f78f:	41 54                	push   r12
2659625- 133f791:	53                   	push   rbx
2659626- 133f792:	48 81 ec c8 00 00 00 	sub    rsp,0xc8
2659627- 133f799:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2659628- 133f7a0:	00 00 
2659629- 133f7a2:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
2659630- 133f7a9:	00 
2659631- 133f7aa:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2659632- 133f7ad:	48 89 04 24          	mov    QWORD PTR [rsp],rax
2659633- 133f7b1:	4c 8b 20             	mov    r12,QWORD PTR [rax]
2659634- 133f7b4:	48 8b 32             	mov    rsi,QWORD PTR [rdx]
2659635- 133f7b7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
2659636- 133f7ba:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
2659637- 133f7bf:	31 d2                	xor    edx,edx
2659638- 133f7c1:	ff 50 10             	call   QWORD PTR [rax+0x10]
2659640- 133f7cb:	49 8b 7c 24 68       	mov    rdi,QWORD PTR [r12+0x68]
2659641- 133f7d0:	49 8b 74 24 70       	mov    rsi,QWORD PTR [r12+0x70]
2659642- 133f7d5:	e8 1f d2 9c ff       	call   d0c9f9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x259999>
2659643- 133f7da:	48 85 c0             	test   rax,rax
2659644- 133f7dd:	0f 84 db 00 00 00    	je     133f8be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184e42>
2659645- 133f7e3:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
2659646- 133f7e7:	4d 85 ff             	test   r15,r15
2659647- 133f7ea:	0f 84 ce 00 00 00    	je     133f8be <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x184e42>
2659648- 133f7f0:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
2659649- 133f7f5:	41 0f b7 6f 10       	movzx  ebp,WORD PTR [r15+0x10]
2659650- 133f7fa:	4c 89 e3             	mov    rbx,r12
2659651- 133f7fd:	4d 8b 6c 24 58       	mov    r13,QWORD PTR [r12+0x58]
2659652- 133f802:	4c 89 f7             	mov    rdi,r14
2659653- 133f805:	48 8d 74 24 68       	lea    rsi,[rsp+0x68]
2659654- 133f80a:	e8 1b ad 38 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
2659655- 133f80f:	4c 89 f7             	mov    rdi,r14
2659656- 133f812:	e8 1f c0 73 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2659657- 133f817:	49 89 d0             	mov    r8,rdx
2659658- 133f81a:	4d 8b 4d 00          	mov    r9,QWORD PTR [r13+0x0]
2659659- 133f81e:	0f b7 ed             	movzx  ebp,bp
2659660- 133f821:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2659661- 133f826:	4c 89 ee             	mov    rsi,r13
2659662- 133f829:	89 ea                	mov    edx,ebp
2659663- 133f82b:	48 89 c1             	mov    rcx,rax
2659664- 133f82e:	41 ff 51 28          	call   QWORD PTR [r9+0x28]
2659665- 133f832:	4c 89 f7             	mov    rdi,r14
2659666- 133f835:	e8 56 e6 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2659667- 133f83a:	80 7c 24 20 04       	cmp    BYTE PTR [rsp+0x20],0x4
2661157- 1340cf5:	89 ca                	mov    edx,ecx
2661158- 1340cf7:	4c 89 c1             	mov    rcx,r8
2661159- 1340cfa:	e8 29 21 d3 ff       	call   1072e28 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a23e>
2661160- 1340cff:	48 8d 05 32 54 52 00 	lea    rax,[rip+0x525432]        # 1866138 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22820>
2661161- 1340d06:	48 89 03             	mov    QWORD PTR [rbx],rax
2661162- 1340d09:	c6 43 28 00          	mov    BYTE PTR [rbx+0x28],0x0
2661163- 1340d0d:	4c 8d 73 30          	lea    r14,[rbx+0x30]
2661164- 1340d11:	48 83 63 40 00       	and    QWORD PTR [rbx+0x40],0x0
2661165- 1340d16:	0f 57 c0             	xorps  xmm0,xmm0
2661166- 1340d19:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
2661167- 1340d1d:	4c 89 63 48          	mov    QWORD PTR [rbx+0x48],r12
2661168- 1340d21:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
2661169- 1340d25:	4c 89 fe             	mov    rsi,r15
2661170- 1340d28:	e8 13 d2 4a 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2661171- 1340d2d:	31 c0                	xor    eax,eax
2661172- 1340d2f:	88 83 88 00 00 00    	mov    BYTE PTR [rbx+0x88],al
2661173- 1340d35:	88 83 8c 00 00 00    	mov    BYTE PTR [rbx+0x8c],al
2661174- 1340d3b:	88 83 90 00 00 00    	mov    BYTE PTR [rbx+0x90],al
2661176- 1340d47:	48 89 df             	mov    rdi,rbx
2661177- 1340d4a:	48 83 c4 08          	add    rsp,0x8
2661178- 1340d4e:	5b                   	pop    rbx
2661179- 1340d4f:	41 5c                	pop    r12
2661180- 1340d51:	41 5e                	pop    r14
2661181- 1340d53:	41 5f                	pop    r15
2661182- 1340d55:	e9 78 f7 ff ff       	jmp    13404d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x185a56>
2661183- 1340d5a:	49 89 c7             	mov    r15,rax
2661184- 1340d5d:	4c 89 f7             	mov    rdi,r14
2661185- 1340d60:	e8 9f 1e d3 ff       	call   1072c04 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a01a>
2661186- 1340d65:	48 89 df             	mov    rdi,rbx
2661187- 1340d68:	e8 b1 1e d3 ff       	call   1072c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a034>
2661188- 1340d6d:	4c 89 ff             	mov    rdi,r15
2661189- 1340d70:	e8 5b ef 72 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2661190- 1340d75:	cc                   	int3
2661191- 1340d76:	53                   	push   rbx
2661192- 1340d77:	48 89 fb             	mov    rbx,rdi
2661193- 1340d7a:	48 8d 05 d7 53 52 00 	lea    rax,[rip+0x5253d7]        # 1866158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22840>
2661194- 1340d81:	48 89 07             	mov    QWORD PTR [rdi],rax
2661195- 1340d84:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
2661196- 1340d88:	e8 f9 d6 75 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2661197- 1340d8d:	48 89 df             	mov    rdi,rbx
2661198- 1340d90:	5b                   	pop    rbx
2661199- 1340d91:	e9 88 1e d3 ff       	jmp    1072c1e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23a034>
2661200- 1340d96:	53                   	push   rbx
2661201- 1340d97:	48 89 fb             	mov    rbx,rdi
2661202- 1340d9a:	e8 d7 ff ff ff       	call   1340d76 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1862fa>
2661203- 1340d9f:	48 89 df             	mov    rdi,rbx
2662303- 1341dca:	c6 84 24 a8 01 00 00 	mov    BYTE PTR [rsp+0x1a8],0x1
2662304- 1341dd1:	01 
2662305- 1341dd2:	41 83 7c 24 38 01    	cmp    DWORD PTR [r12+0x38],0x1
2662306- 1341dd8:	75 0f                	jne    1341de9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18736d>
2662307- 1341dda:	49 8b 44 24 30       	mov    rax,QWORD PTR [r12+0x30]
2662308- 1341ddf:	f6 40 10 04          	test   BYTE PTR [rax+0x10],0x4
2662309- 1341de3:	0f 85 a1 00 00 00    	jne    1341e8a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18740e>
2662310- 1341de9:	31 c0                	xor    eax,eax
2662311- 1341deb:	31 d2                	xor    edx,edx
2662312- 1341ded:	48 8d b4 24 30 01 00 	lea    rsi,[rsp+0x130]
2662313- 1341df4:	00 
2662314- 1341df5:	88 96 80 00 00 00    	mov    BYTE PTR [rsi+0x80],dl
2662315- 1341dfb:	0f 28 84 24 e0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1e0]
2662316- 1341e02:	00 
2662317- 1341e03:	0f 11 86 81 00 00 00 	movups XMMWORD PTR [rsi+0x81],xmm0
2662318- 1341e0a:	0f 10 84 24 ef 01 00 	movups xmm0,XMMWORD PTR [rsp+0x1ef]
2662319- 1341e11:	00 
2662320- 1341e12:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
2662323- 1341e25:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2662324- 1341e2a:	e8 6f 01 00 00       	call   1341f9e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187522>
2662325- 1341e2f:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
2662326- 1341e36:	00 
2662327- 1341e37:	e8 e4 da d9 ff       	call   10df920 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a6d36>
2662328- 1341e3c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
2662329- 1341e43:	00 
2662330- 1341e44:	e8 e5 34 38 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2662331- 1341e49:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
2662332- 1341e4e:	48 89 df             	mov    rdi,rbx
2662333- 1341e51:	4c 89 f6             	mov    rsi,r14
2662334- 1341e54:	e8 57 01 00 00       	call   1341fb0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x187534>
2662335- 1341e59:	4c 89 f7             	mov    rdi,r14
2662336- 1341e5c:	e8 83 53 f8 ff       	call   12c71e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10c768>
2662337- 1341e61:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2662338- 1341e68:	00 00 
2662339- 1341e6a:	48 3b 84 24 00 02 00 	cmp    rax,QWORD PTR [rsp+0x200]
2662340- 1341e71:	00 
2662341- 1341e72:	0f 85 c6 00 00 00    	jne    1341f3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1874c2>
2662342- 1341e78:	48 81 c4 08 02 00 00 	add    rsp,0x208
2662343- 1341e7f:	5b                   	pop    rbx
2662344- 1341e80:	41 5c                	pop    r12
2662345- 1341e82:	41 5d                	pop    r13
2662346- 1341e84:	41 5e                	pop    r14
2662347- 1341e86:	41 5f                	pop    r15
2662348- 1341e88:	5d                   	pop    rbp
2662349- 1341e89:	c3                   	ret
2662350- 1341e8a:	48 8b 48 28          	mov    rcx,QWORD PTR [rax+0x28]
2665670- 1344dc6:	e8 77 9d 8e ff       	call   c2eb42 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17bae2>
2665671- 1344dcb:	48 8d b3 d0 02 00 00 	lea    rsi,[rbx+0x2d0]
2665672- 1344dd2:	4c 8d 7c 24 20       	lea    r15,[rsp+0x20]
2665673- 1344dd7:	4c 89 ff             	mov    rdi,r15
2665674- 1344dda:	e8 51 65 76 ff       	call   aab330 <JNI_OnUnload@@Base+0x32bfd>
2665675- 1344ddf:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
2665676- 1344de2:	4d 85 ff             	test   r15,r15
2665677- 1344de5:	74 13                	je     1344dfa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a37e>
2665678- 1344de7:	49 8b 07             	mov    rax,QWORD PTR [r15]
2665679- 1344dea:	48 8d 15 07 5e 5d 00 	lea    rdx,[rip+0x5d5e07]        # 191abf8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62008>
2665680- 1344df1:	6a 05                	push   0x5
2665681- 1344df3:	5e                   	pop    rsi
2665682- 1344df4:	4c 89 ff             	mov    rdi,r15
2665683- 1344df7:	ff 50 10             	call   QWORD PTR [rax+0x10]
2665684- 1344dfa:	48 83 7b 68 00       	cmp    QWORD PTR [rbx+0x68],0x0
2665685- 1344dff:	6a 18                	push   0x18
2665686- 1344e01:	41 58                	pop    r8
2665687- 1344e03:	74 66                	je     1344e6b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a3ef>
2665690- 1344e13:	48 29 c8             	sub    rax,rcx
2665691- 1344e16:	48 99                	cqo
2665692- 1344e18:	4c 89 c5             	mov    rbp,r8
2665693- 1344e1b:	49 f7 f8             	idiv   r8
2665694- 1344e1e:	48 8d 54 24 48       	lea    rdx,[rsp+0x48]
2665695- 1344e23:	4c 89 32             	mov    QWORD PTR [rdx],r14
2665696- 1344e26:	48 8d 35 83 1a 52 00 	lea    rsi,[rip+0x521a83]        # 18668b0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22f98>
2665697- 1344e2d:	4c 8d b4 24 88 00 00 	lea    r14,[rsp+0x88]
2665698- 1344e34:	00 
2665699- 1344e35:	49 89 36             	mov    QWORD PTR [r14],rsi
2665700- 1344e38:	49 89 4e 08          	mov    QWORD PTR [r14+0x8],rcx
2665701- 1344e3c:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
2665702- 1344e40:	49 89 56 18          	mov    QWORD PTR [r14+0x18],rdx
2665703- 1344e44:	4c 8d 6c 24 68       	lea    r13,[rsp+0x68]
2665704- 1344e49:	4c 89 ef             	mov    rdi,r13
2665705- 1344e4c:	89 c6                	mov    esi,eax
2665706- 1344e4e:	e8 7f 36 49 00       	call   17d84d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x42f3>
2665707- 1344e53:	4c 89 ef             	mov    rdi,r13
2665708- 1344e56:	4c 89 f6             	mov    rsi,r14
2665709- 1344e59:	e8 16 37 49 00       	call   17d8574 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x4395>
2665710- 1344e5e:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
2665711- 1344e63:	e8 c0 68 73 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
2665712- 1344e68:	49 89 e8             	mov    r8,rbp
2665713- 1344e6b:	4d 85 ff             	test   r15,r15
2665714- 1344e6e:	74 19                	je     1344e89 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a40d>
2665715- 1344e70:	49 8b 07             	mov    rax,QWORD PTR [r15]
2665716- 1344e73:	48 8d 15 7e 5d 5d 00 	lea    rdx,[rip+0x5d5d7e]        # 191abf8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62008>
2665717- 1344e7a:	6a 05                	push   0x5
2665718- 1344e7c:	5e                   	pop    rsi
2665719- 1344e7d:	4c 89 ff             	mov    rdi,r15
2665720- 1344e80:	4d 89 c6             	mov    r14,r8
2665721- 1344e83:	ff 50 20             	call   QWORD PTR [rax+0x20]
2665722- 1344e86:	4d 89 f0             	mov    r8,r14
2665723- 1344e89:	48 89 5c 24 18       	mov    QWORD PTR [rsp+0x18],rbx
2665724- 1344e8e:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
2665725- 1344e93:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
2665726- 1344e98:	4d 89 ef             	mov    r15,r13
2665727- 1344e9b:	49 29 ef             	sub    r15,rbp
2665728- 1344e9e:	4c 89 f8             	mov    rax,r15
2665729- 1344ea1:	48 99                	cqo
2665730- 1344ea3:	49 f7 f8             	idiv   r8
2665731- 1344ea6:	4d 85 ff             	test   r15,r15
2665732- 1344ea9:	0f 8e 20 03 00 00    	jle    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
2665733- 1344eaf:	48 89 c1             	mov    rcx,rax
2665734- 1344eb2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
2665736- 1344ebe:	4c 8d 8f b0 00 00 00 	lea    r9,[rdi+0xb0]
2665737- 1344ec5:	48 8b b7 b0 00 00 00 	mov    rsi,QWORD PTR [rdi+0xb0]
2665738- 1344ecc:	48 89 f0             	mov    rax,rsi
2665739- 1344ecf:	4c 29 f0             	sub    rax,r14
2665740- 1344ed2:	48 99                	cqo
2665741- 1344ed4:	49 f7 f8             	idiv   r8
2665742- 1344ed7:	48 39 c8             	cmp    rax,rcx
2665743- 1344eda:	0f 8d 81 01 00 00    	jge    1345061 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a5e5>
2665744- 1344ee0:	4c 89 4c 24 10       	mov    QWORD PTR [rsp+0x10],r9
2665746- 1344eec:	4c 89 f0             	mov    rax,r14
2665747- 1344eef:	48 29 f8             	sub    rax,rdi
2665748- 1344ef2:	48 99                	cqo
2665749- 1344ef4:	49 f7 f8             	idiv   r8
2665750- 1344ef7:	48 01 c1             	add    rcx,rax
2665751- 1344efa:	48 89 ca             	mov    rdx,rcx
2665752- 1344efd:	4c 89 c3             	mov    rbx,r8
2665753- 1344f00:	e8 71 65 73 ff       	call   a7b476 <JNI_OnUnload@@Base+0x2d43>
2665754- 1344f05:	48 89 c6             	mov    rsi,rax
2665755- 1344f08:	4c 89 f0             	mov    rax,r14
2665756- 1344f0b:	49 2b 04 24          	sub    rax,QWORD PTR [r12]
2665757- 1344f0f:	48 99                	cqo
2665758- 1344f11:	48 f7 fb             	idiv   rbx
2665759- 1344f14:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2665760- 1344f1b:	00 
2665761- 1344f1c:	48 89 c2             	mov    rdx,rax
2665762- 1344f1f:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]
2665763- 1344f24:	e8 93 65 73 ff       	call   a7b4bc <JNI_OnUnload@@Base+0x2d89>
2665764- 1344f29:	48 8b 84 24 98 00 00 	mov    rax,QWORD PTR [rsp+0x98]
2665765- 1344f30:	00 
2665766- 1344f31:	49 01 c7             	add    r15,rax
2665767- 1344f34:	48 83 c5 08          	add    rbp,0x8
2665768- 1344f38:	31 c9                	xor    ecx,ecx
2665769- 1344f3a:	48 8d 1d 9f 19 52 00 	lea    rbx,[rip+0x52199f]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
2665770- 1344f41:	0f 57 c0             	xorps  xmm0,xmm0
2665771- 1344f44:	48 8d 14 08          	lea    rdx,[rax+rcx*1]
2665772- 1344f48:	48 83 c2 18          	add    rdx,0x18
2665773- 1344f4c:	48 89 5a e8          	mov    QWORD PTR [rdx-0x18],rbx
2665774- 1344f50:	48 8b 74 0d 00       	mov    rsi,QWORD PTR [rbp+rcx*1+0x0]
2665775- 1344f55:	48 89 72 f0          	mov    QWORD PTR [rdx-0x10],rsi
2665776- 1344f59:	48 8b 74 0d 08       	mov    rsi,QWORD PTR [rbp+rcx*1+0x8]
2665777- 1344f5e:	48 89 72 f8          	mov    QWORD PTR [rdx-0x8],rsi
2665778- 1344f62:	0f 11 44 0d 00       	movups XMMWORD PTR [rbp+rcx*1+0x0],xmm0
2665779- 1344f67:	48 83 c1 18          	add    rcx,0x18
2665780- 1344f6b:	4c 39 fa             	cmp    rdx,r15
2665781- 1344f6e:	75 d4                	jne    1344f44 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a4c8>
2665782- 1344f70:	4c 89 bc 24 98 00 00 	mov    QWORD PTR [rsp+0x98],r15
2665783- 1344f77:	00 
2665784- 1344f78:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
2665785- 1344f7f:	00 
2665786- 1344f80:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
2665788- 1344f8c:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2665789- 1344f91:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2665790- 1344f96:	0f 10 44 24 48       	movups xmm0,XMMWORD PTR [rsp+0x48]
2665791- 1344f9b:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
2665792- 1344f9f:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
2665793- 1344fa4:	48 89 ef             	mov    rdi,rbp
2665794- 1344fa7:	4c 89 f6             	mov    rsi,r14
2665795- 1344faa:	e8 d1 4c ff ff       	call   1339c80 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f204>
2665796- 1344faf:	49 89 c4             	mov    r12,rax
2665798- 1344fb9:	48 8d 4c 24 60       	lea    rcx,[rsp+0x60]
2665799- 1344fbe:	4c 89 39             	mov    QWORD PTR [rcx],r15
2665800- 1344fc1:	48 8d 54 24 58       	lea    rdx,[rsp+0x58]
2665801- 1344fc6:	4c 89 3a             	mov    QWORD PTR [rdx],r15
2665802- 1344fc9:	48 89 6c 24 68       	mov    QWORD PTR [rsp+0x68],rbp
2665803- 1344fce:	48 89 54 24 70       	mov    QWORD PTR [rsp+0x70],rdx
2665804- 1344fd3:	48 89 4c 24 78       	mov    QWORD PTR [rsp+0x78],rcx
2665805- 1344fd8:	4c 39 f0             	cmp    rax,r14
2665806- 1344fdb:	74 2d                	je     134500a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a58e>
2665807- 1344fdd:	0f 57 c0             	xorps  xmm0,xmm0
2665808- 1344fe0:	49 89 1f             	mov    QWORD PTR [r15],rbx
2665809- 1344fe3:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
2665810- 1344fe7:	49 89 4f 08          	mov    QWORD PTR [r15+0x8],rcx
2665811- 1344feb:	49 8b 4e 10          	mov    rcx,QWORD PTR [r14+0x10]
2665812- 1344fef:	49 89 4f 10          	mov    QWORD PTR [r15+0x10],rcx
2665813- 1344ff3:	41 0f 11 46 08       	movups XMMWORD PTR [r14+0x8],xmm0
2665814- 1344ff8:	49 83 c6 18          	add    r14,0x18
2665815- 1344ffc:	49 83 c7 18          	add    r15,0x18
2665816- 1345000:	49 39 c6             	cmp    r14,rax
2665817- 1345003:	75 db                	jne    1344fe0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a564>
2665818- 1345005:	4c 89 7c 24 60       	mov    QWORD PTR [rsp+0x60],r15
2665819- 134500a:	48 8d 7c 24 68       	lea    rdi,[rsp+0x68]
2665820- 134500f:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
2665821- 1345013:	e8 82 49 ff ff       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
2665822- 1345018:	48 8b 54 24 18       	mov    rdx,QWORD PTR [rsp+0x18]
2665826- 1345032:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2665827- 1345039:	00 
2665828- 134503a:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
2665829- 134503e:	48 8b 82 b0 00 00 00 	mov    rax,QWORD PTR [rdx+0xb0]
2665830- 1345045:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
2665831- 1345049:	48 89 8a b0 00 00 00 	mov    QWORD PTR [rdx+0xb0],rcx
2665832- 1345050:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
2665833- 1345054:	0f 13 07             	movlps QWORD PTR [rdi],xmm0
2665834- 1345057:	e8 e4 4b ff ff       	call   1339c40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17f1c4>
2665835- 134505c:	e9 6e 01 00 00       	jmp    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
2665836- 1345061:	4d 89 f4             	mov    r12,r14
2665837- 1345064:	4d 29 f4             	sub    r12,r14
2665838- 1345067:	4c 89 e0             	mov    rax,r12
2665839- 134506a:	48 99                	cqo
2665840- 134506c:	49 f7 f8             	idiv   r8
2665841- 134506f:	48 39 c8             	cmp    rax,rcx
2665842- 1345072:	7d 71                	jge    13450e5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a669>
2665843- 1345074:	49 8d 14 2c          	lea    rdx,[r12+rbp*1]
2665844- 1345078:	48 8d 44 24 68       	lea    rax,[rsp+0x68]
2665845- 134507d:	4c 89 30             	mov    QWORD PTR [rax],r14
2665846- 1345080:	48 8d 4c 24 48       	lea    rcx,[rsp+0x48]
2665847- 1345085:	4c 89 31             	mov    QWORD PTR [rcx],r14
2665848- 1345088:	4c 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],r9
2665849- 134508f:	00 
2665850- 1345090:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
2665851- 1345097:	00 
2665852- 1345098:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
2665853- 134509f:	00 
2665864- 13450c5:	48 8b 51 10          	mov    rdx,QWORD PTR [rcx+0x10]
2665865- 13450c9:	48 89 53 10          	mov    QWORD PTR [rbx+0x10],rdx
2665866- 13450cd:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
2665867- 13450d1:	48 83 c1 18          	add    rcx,0x18
2665868- 13450d5:	48 83 c3 18          	add    rbx,0x18
2665869- 13450d9:	4c 39 e9             	cmp    rcx,r13
2665870- 13450dc:	75 dc                	jne    13450ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a63e>
2665871- 13450de:	48 89 5c 24 68       	mov    QWORD PTR [rsp+0x68],rbx
2665872- 13450e3:	eb 0c                	jmp    13450f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a675>
2665873- 13450e5:	49 8d 04 2f          	lea    rax,[r15+rbp*1]
2665874- 13450e9:	4c 89 f3             	mov    rbx,r14
2665875- 13450ec:	eb 2e                	jmp    134511c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a6a0>
2665876- 13450ee:	4c 89 f3             	mov    rbx,r14
2665877- 13450f1:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
2665878- 13450f8:	00 
2665879- 13450f9:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
2665880- 13450fd:	e8 98 48 ff ff       	call   133999a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17ef1e>
2665881- 1345102:	48 8b 44 24 18       	mov    rax,QWORD PTR [rsp+0x18]
2665883- 134510e:	4d 85 e4             	test   r12,r12
2665884- 1345111:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
2665885- 1345116:	0f 8e b3 00 00 00    	jle    13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
2665886- 134511c:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2665887- 1345121:	4b 8d 04 3e          	lea    rax,[r14+r15*1]
2665888- 1345125:	48 89 d9             	mov    rcx,rbx
2665889- 1345128:	4c 29 f9             	sub    rcx,r15
2665890- 134512b:	48 89 da             	mov    rdx,rbx
2665891- 134512e:	4c 39 f1             	cmp    rcx,r14
2665892- 1345131:	73 31                	jae    1345164 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a6e8>
2665893- 1345133:	48 8d 35 a6 17 52 00 	lea    rsi,[rip+0x5217a6]        # 18668e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x22fc8>
2665894- 134513a:	0f 57 c0             	xorps  xmm0,xmm0
2665895- 134513d:	48 89 da             	mov    rdx,rbx
2665896- 1345140:	48 89 32             	mov    QWORD PTR [rdx],rsi
2665897- 1345143:	48 8b 79 08          	mov    rdi,QWORD PTR [rcx+0x8]
2665898- 1345147:	48 89 7a 08          	mov    QWORD PTR [rdx+0x8],rdi
2665899- 134514b:	48 8b 79 10          	mov    rdi,QWORD PTR [rcx+0x10]
2665900- 134514f:	48 89 7a 10          	mov    QWORD PTR [rdx+0x10],rdi
2665901- 1345153:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
2665902- 1345157:	48 83 c1 18          	add    rcx,0x18
2665903- 134515b:	48 83 c2 18          	add    rdx,0x18
2665904- 134515f:	4c 39 f1             	cmp    rcx,r14
2665905- 1345162:	72 dc                	jb     1345140 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a6c4>
2665906- 1345164:	48 8b 4c 24 18       	mov    rcx,QWORD PTR [rsp+0x18]
2665908- 1345170:	48 39 c3             	cmp    rbx,rax
2665909- 1345173:	74 33                	je     13451a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a72c>
2665910- 1345175:	49 89 df             	mov    r15,rbx
2665911- 1345178:	49 83 c7 f0          	add    r15,0xfffffffffffffff0
2665912- 134517c:	48 01 eb             	add    rbx,rbp
2665913- 134517f:	49 89 dc             	mov    r12,rbx
2665914- 1345182:	4d 29 ec             	sub    r12,r13
2665915- 1345185:	49 83 c4 f0          	add    r12,0xfffffffffffffff0
2665916- 1345189:	4d 01 f5             	add    r13,r14
2665917- 134518c:	49 29 dd             	sub    r13,rbx
2665918- 134518f:	4c 89 ff             	mov    rdi,r15
2665919- 1345192:	4c 89 e6             	mov    rsi,r12
2665920- 1345195:	e8 82 46 77 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
2665921- 134519a:	49 83 c7 e8          	add    r15,0xffffffffffffffe8
2665922- 134519e:	49 83 c4 e8          	add    r12,0xffffffffffffffe8
2665923- 13451a2:	49 83 c5 18          	add    r13,0x18
2665924- 13451a6:	75 e7                	jne    134518f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a713>
2665925- 13451a8:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
2665926- 13451ad:	48 39 eb             	cmp    rbx,rbp
2665927- 13451b0:	74 1d                	je     13451cf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a753>
2665928- 13451b2:	49 83 c6 08          	add    r14,0x8
2665929- 13451b6:	48 8d 75 08          	lea    rsi,[rbp+0x8]
2665930- 13451ba:	4c 89 f7             	mov    rdi,r14
2665931- 13451bd:	e8 5a 46 77 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
2665932- 13451c2:	48 83 c5 18          	add    rbp,0x18
2665933- 13451c6:	49 83 c6 18          	add    r14,0x18
2665934- 13451ca:	48 39 dd             	cmp    rbp,rbx
2665935- 13451cd:	75 e7                	jne    13451b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18a73a>
2668492- 13475b3:	48 8b 84 24 78 02 00 	mov    rax,QWORD PTR [rsp+0x278]
2668493- 13475ba:	00 
2668494- 13475bb:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]
2668495- 13475bf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2668496- 13475c2:	ff 50 48             	call   QWORD PTR [rax+0x48]
2668497- 13475c5:	48 83 a4 24 98 00 00 	and    QWORD PTR [rsp+0x98],0x0
2668498- 13475cc:	00 00 
2668499- 13475ce:	48 8d 0d 0b 00 54 00 	lea    rcx,[rip+0x54000b]        # 18875e0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x2b8>
2668500- 13475d5:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
2668501- 13475dc:	00 
2668502- 13475dd:	0f 57 c0             	xorps  xmm0,xmm0
2668503- 13475e0:	41 0f 11 47 08       	movups XMMWORD PTR [r15+0x8],xmm0
2668504- 13475e5:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
2668505- 13475ec:	00 
2668506- 13475ed:	48 89 c6             	mov    rsi,rax
2668507- 13475f0:	e8 33 83 43 00       	call   177f928 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133a94>
2668508- 13475f5:	84 c0                	test   al,al
2668509- 13475f7:	0f 84 9e 02 00 00    	je     134789b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18ce1f>
2668511- 1347604:	00 
2668512- 1347605:	e8 96 6e 4a 00       	call   17ee4a0 <_ZNSt6__ndk16chrono12system_clock11from_time_tEl@plt>
2668513- 134760a:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
2668514- 134760f:	48 8d 9c 24 e8 00 00 	lea    rbx,[rsp+0xe8]
2668515- 1347616:	00 
2668516- 1347617:	48 89 df             	mov    rdi,rbx
2668517- 134761a:	48 8d b4 24 f8 01 00 	lea    rsi,[rsp+0x1f8]
2668518- 1347621:	00 
2668519- 1347622:	48 8d 94 24 a0 01 00 	lea    rdx,[rsp+0x1a0]
2668520- 1347629:	00 
2668521- 134762a:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
2668522- 134762f:	e8 a4 1f 00 00       	call   13495d8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18eb5c>
2668523- 1347634:	48 89 df             	mov    rdi,rbx
2668524- 1347637:	e8 cc 1f 00 00       	call   1349608 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18eb8c>
2668525- 134763c:	49 89 c4             	mov    r12,rax
2668526- 134763f:	4d 8b 7e 08          	mov    r15,QWORD PTR [r14+0x8]
2668527- 1347643:	4d 85 ff             	test   r15,r15
2668528- 1347646:	0f 84 8e 00 00 00    	je     13476da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18cc5e>
2668529- 134764c:	f3 49 0f b8 df       	popcnt rbx,r15
2668530- 1347651:	48 83 fb 01          	cmp    rbx,0x1
2668531- 1347655:	77 09                	ja     1347660 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18cbe4>
2668532- 1347657:	49 8d 6f ff          	lea    rbp,[r15-0x1]
2668533- 134765b:	4c 21 e5             	and    rbp,r12
2668534- 134765e:	eb 13                	jmp    1347673 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18cbf7>
2668535- 1347660:	4c 89 e5             	mov    rbp,r12
2668536- 1347663:	4d 39 fc             	cmp    r12,r15
2668537- 1347666:	72 0b                	jb     1347673 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18cbf7>
2668538- 1347668:	4c 89 e0             	mov    rax,r12
2671916- 134a4c1:	48 89 c7             	mov    rdi,rax
2671917- 134a4c4:	e8 dc f5 72 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
2671918- 134a4c9:	50                   	push   rax
2671919- 134a4ca:	e8 0f 1b 80 ff       	call   b4bfde <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x98f7e>
2671920- 134a4cf:	48 8d 48 28          	lea    rcx,[rax+0x28]
2671921- 134a4d3:	48 85 c0             	test   rax,rax
2671922- 134a4d6:	48 0f 45 c1          	cmovne rax,rcx
2671923- 134a4da:	59                   	pop    rcx
2671924- 134a4db:	c3                   	ret
2671925- 134a4dc:	41 57                	push   r15
2671926- 134a4de:	41 56                	push   r14
2671927- 134a4e0:	53                   	push   rbx
2671928- 134a4e1:	48 83 ec 20          	sub    rsp,0x20
2671929- 134a4e5:	89 f3                	mov    ebx,esi
2671930- 134a4e7:	49 89 fe             	mov    r14,rdi
2671931- 134a4ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2671932- 134a4f1:	00 00 
2671933- 134a4f3:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2671935- 134a4ff:	49 8b b6 b0 00 00 00 	mov    rsi,QWORD PTR [r14+0xb0]
2671936- 134a506:	48 8d 15 98 6a 03 ff 	lea    rdx,[rip+0xffffffffff036a98]        # 380fa5 <_ZTSSt12bad_any_cast@@Base-0xf223>
2671937- 134a50d:	6a 0e                	push   0xe
2671938- 134a50f:	59                   	pop    rcx
2671939- 134a510:	e8 e3 fc ff ff       	call   134a1f8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f77c>
2671940- 134a515:	48 85 c0             	test   rax,rax
2671941- 134a518:	74 1a                	je     134a534 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18fab8>
2671942- 134a51a:	49 89 c7             	mov    r15,rax
2671943- 134a51d:	48 8d 35 d9 8f ff fe 	lea    rsi,[rip+0xfffffffffeff8fd9]        # 3434fd <_ZTSSt12bad_any_cast@@Base-0x4cccb>
2671944- 134a524:	48 89 c7             	mov    rdi,rax
2671945- 134a527:	e8 23 13 73 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
2671946- 134a52c:	84 c0                	test   al,al
2671947- 134a52e:	74 5c                	je     134a58c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18fb10>
2671948- 134a530:	6a 01                	push   0x1
2671949- 134a532:	eb 6d                	jmp    134a5a1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18fb25>
2671950- 134a534:	48 8d 35 44 06 03 ff 	lea    rsi,[rip+0xffffffffff030644]        # 37ab7f <_ZTSSt12bad_any_cast@@Base-0x15649>
2671951- 134a53b:	48 89 e7             	mov    rdi,rsp
2671952- 134a53e:	e8 3b f5 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2671953- 134a543:	49 83 c6 20          	add    r14,0x20
2671954- 134a547:	49 89 e7             	mov    r15,rsp
2671955- 134a54a:	4c 89 f7             	mov    rdi,r14
2671956- 134a54d:	4c 89 fe             	mov    rsi,r15
2671957- 134a550:	e8 74 ff ff ff       	call   134a4c9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18fa4d>
2671958- 134a555:	49 89 c6             	mov    r14,rax
2671959- 134a558:	4c 89 ff             	mov    rdi,r15
2671960- 134a55b:	e8 30 39 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2671961- 134a560:	4d 85 f6             	test   r14,r14
2671962- 134a563:	74 54                	je     134a5b9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18fb3d>
2673190- 134b5da:	48 81 ec 38 01 00 00 	sub    rsp,0x138
2673191- 134b5e1:	48 89 d3             	mov    rbx,rdx
2673192- 134b5e4:	49 89 f7             	mov    r15,rsi
2673193- 134b5e7:	49 89 fe             	mov    r14,rdi
2673194- 134b5ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2673195- 134b5f1:	00 00 
2673196- 134b5f3:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
2673197- 134b5fa:	00 
2673198- 134b5fb:	48 89 4c 24 48       	mov    QWORD PTR [rsp+0x48],rcx
2673199- 134b600:	4c 89 44 24 40       	mov    QWORD PTR [rsp+0x40],r8
2673200- 134b605:	83 a4 24 b8 00 00 00 	and    DWORD PTR [rsp+0xb8],0x0
2673201- 134b60c:	00 
2673202- 134b60d:	4c 89 4c 24 38       	mov    QWORD PTR [rsp+0x38],r9
2673203- 134b612:	0f 57 c0             	xorps  xmm0,xmm0
2673204- 134b615:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
2673205- 134b61c:	00 
2673206- 134b61d:	0f 29 84 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm0
2673207- 134b624:	00 
2673209- 134b62c:	00 
2673210- 134b62d:	8a 42 29             	mov    al,BYTE PTR [rdx+0x29]
2673211- 134b630:	0a 42 2e             	or     al,BYTE PTR [rdx+0x2e]
2673212- 134b633:	74 7e                	je     134b6b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190c37>
2673213- 134b635:	49 8d 77 18          	lea    rsi,[r15+0x18]
2673214- 134b639:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
2673215- 134b63d:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
2673216- 134b644:	00 
2673217- 134b645:	ff 50 10             	call   QWORD PTR [rax+0x10]
2673218- 134b648:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
2673219- 134b64f:	00 
2673220- 134b650:	4c 8d a4 24 d8 00 00 	lea    r12,[rsp+0xd8]
2673221- 134b657:	00 
2673222- 134b658:	4c 89 e6             	mov    rsi,r12
2673223- 134b65b:	e8 fc dc 37 00       	call   16c935c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7d4c8>
2673224- 134b660:	4c 89 e7             	mov    rdi,r12
2673225- 134b663:	e8 c6 9c 37 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2673226- 134b668:	80 7b 29 00          	cmp    BYTE PTR [rbx+0x29],0x0
2673227- 134b66c:	74 45                	je     134b6b3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190c37>
2673228- 134b66e:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
2673229- 134b675:	00 
2673230- 134b676:	48 8d b4 24 80 00 00 	lea    rsi,[rsp+0x80]
2673231- 134b67d:	00 
2673232- 134b67e:	e8 a7 ee 37 00       	call   16ca52a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7e696>
2673233- 134b683:	41 80 4e 10 01       	or     BYTE PTR [r14+0x10],0x1
2673234- 134b688:	49 8d 7e 60          	lea    rdi,[r14+0x60]
2673235- 134b68c:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
2673236- 134b690:	f6 c2 01             	test   dl,0x1
2673258- 134b6e6:	49 8d 7f 30          	lea    rdi,[r15+0x30]
2673259- 134b6ea:	49 8b 47 30          	mov    rax,QWORD PTR [r15+0x30]
2673260- 134b6ee:	ff 50 10             	call   QWORD PTR [rax+0x10]
2673261- 134b6f1:	41 89 86 88 00 00 00 	mov    DWORD PTR [r14+0x88],eax
2673262- 134b6f8:	41 80 4e 10 20       	or     BYTE PTR [r14+0x10],0x20
2673263- 134b6fd:	80 7b 3a 00          	cmp    BYTE PTR [rbx+0x3a],0x0
2673264- 134b701:	74 41                	je     134b744 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190cc8>
2673265- 134b703:	49 8d 77 18          	lea    rsi,[r15+0x18]
2673266- 134b707:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
2673267- 134b70b:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
2673268- 134b712:	00 
2673269- 134b713:	ff 50 10             	call   QWORD PTR [rax+0x10]
2673270- 134b716:	48 8b bc 24 90 01 00 	mov    rdi,QWORD PTR [rsp+0x190]
2673271- 134b71d:	00 
2673272- 134b71e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2673273- 134b721:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
2673274- 134b728:	00 
2673275- 134b729:	ff 10                	call   QWORD PTR [rax]
2673277- 134b732:	41 80 4e 12 02       	or     BYTE PTR [r14+0x12],0x2
2673278- 134b737:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
2673279- 134b73e:	00 
2673280- 134b73f:	e8 ea 9b 37 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2673281- 134b744:	4c 8b a4 24 78 01 00 	mov    r12,QWORD PTR [rsp+0x178]
2673282- 134b74b:	00 
2673283- 134b74c:	80 7b 2e 00          	cmp    BYTE PTR [rbx+0x2e],0x0
2673284- 134b750:	74 24                	je     134b776 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190cfa>
2673285- 134b752:	48 8b b4 24 80 01 00 	mov    rsi,QWORD PTR [rsp+0x180]
2673286- 134b759:	00 
2673287- 134b75a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
2673288- 134b761:	00 
2673289- 134b762:	4c 89 e2             	mov    rdx,r12
2673290- 134b765:	e8 a3 31 29 00       	call   15de90d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x423e91>
2673291- 134b76a:	41 88 86 9a 00 00 00 	mov    BYTE PTR [r14+0x9a],al
2673292- 134b771:	41 80 4e 11 40       	or     BYTE PTR [r14+0x11],0x40
2673293- 134b776:	80 7b 2f 00          	cmp    BYTE PTR [rbx+0x2f],0x0
2673294- 134b77a:	74 51                	je     134b7cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190d51>
2673295- 134b77c:	49 8b 07             	mov    rax,QWORD PTR [r15]
2673296- 134b77f:	4c 89 ff             	mov    rdi,r15
2673297- 134b782:	ff 50 20             	call   QWORD PTR [rax+0x20]
2673298- 134b785:	84 c0                	test   al,al
2673299- 134b787:	74 36                	je     134b7bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x190d43>
2673300- 134b789:	49 8d 77 18          	lea    rsi,[r15+0x18]
2673301- 134b78d:	49 8b 47 18          	mov    rax,QWORD PTR [r15+0x18]
2673302- 134b791:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
2673303- 134b798:	00 
2673304- 134b799:	ff 50 10             	call   QWORD PTR [rax+0x10]
2674124- 134c36d:	e8 20 94 41 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
2674125- 134c372:	80 7b 2a 00          	cmp    BYTE PTR [rbx+0x2a],0x0
2674126- 134c376:	74 2b                	je     134c3a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191927>
2674127- 134c378:	49 8d 7c 24 20       	lea    rdi,[r12+0x20]
2674128- 134c37d:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
2674129- 134c382:	ff 50 10             	call   QWORD PTR [rax+0x10]
2674130- 134c385:	41 80 4f 10 04       	or     BYTE PTR [r15+0x10],0x4
2674131- 134c38a:	49 8d 7f 70          	lea    rdi,[r15+0x70]
2674132- 134c38e:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
2674133- 134c392:	f6 c2 01             	test   dl,0x1
2674134- 134c395:	0f 85 e5 02 00 00    	jne    134c680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191c04>
2674135- 134c39b:	48 89 c6             	mov    rsi,rax
2674136- 134c39e:	e8 ef 93 41 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
2674137- 134c3a3:	80 7b 2b 00          	cmp    BYTE PTR [rbx+0x2b],0x0
2674138- 134c3a7:	74 16                	je     134c3bf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191943>
2674139- 134c3a9:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2674140- 134c3ad:	4c 89 e7             	mov    rdi,r12
2674141- 134c3b0:	ff 50 20             	call   QWORD PTR [rax+0x20]
2674143- 134c3ba:	41 80 4f 11 01       	or     BYTE PTR [r15+0x11],0x1
2674144- 134c3bf:	80 7b 2c 00          	cmp    BYTE PTR [rbx+0x2c],0x0
2674145- 134c3c3:	74 28                	je     134c3ed <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191971>
2674146- 134c3c5:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2674147- 134c3c9:	4c 89 e7             	mov    rdi,r12
2674148- 134c3cc:	ff 50 28             	call   QWORD PTR [rax+0x28]
2674149- 134c3cf:	41 80 4f 10 08       	or     BYTE PTR [r15+0x10],0x8
2674150- 134c3d4:	49 8d 7f 78          	lea    rdi,[r15+0x78]
2674151- 134c3d8:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
2674152- 134c3dc:	f6 c2 01             	test   dl,0x1
2674153- 134c3df:	0f 85 a7 02 00 00    	jne    134c68c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191c10>
2674154- 134c3e5:	48 89 c6             	mov    rsi,rax
2674155- 134c3e8:	e8 a5 93 41 00       	call   1765792 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1198fe>
2674156- 134c3ed:	80 7b 2d 00          	cmp    BYTE PTR [rbx+0x2d],0x0
2674157- 134c3f1:	74 3f                	je     134c432 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1919b6>
2674158- 134c3f3:	49 8d 74 24 28       	lea    rsi,[r12+0x28]
2674159- 134c3f8:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
2674160- 134c3fd:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2674161- 134c402:	ff 50 10             	call   QWORD PTR [rax+0x10]
2674162- 134c405:	41 80 4f 10 10       	or     BYTE PTR [r15+0x10],0x10
2674163- 134c40a:	49 8d bf 80 00 00 00 	lea    rdi,[r15+0x80]
2674164- 134c411:	49 8b 57 08          	mov    rdx,QWORD PTR [r15+0x8]
2674165- 134c415:	f6 c2 01             	test   dl,0x1
2674166- 134c418:	0f 85 7a 02 00 00    	jne    134c698 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191c1c>
2674167- 134c41e:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
2674168- 134c423:	e8 be 93 41 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
2674169- 134c428:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2674170- 134c42d:	e8 5e 1a 4a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2674246- 134c55d:	f6 c2 01             	test   dl,0x1
2674247- 134c560:	0f 85 4a 01 00 00    	jne    134c6b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191c34>
2674248- 134c566:	e8 e7 97 7b ff       	call   b05d52 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x52cf2>
2674249- 134c56b:	80 7b 32 00          	cmp    BYTE PTR [rbx+0x32],0x0
2674250- 134c56f:	74 2f                	je     134c5a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b24>
2674251- 134c571:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2674252- 134c575:	4c 89 e7             	mov    rdi,r12
2674253- 134c578:	ff 50 30             	call   QWORD PTR [rax+0x30]
2674254- 134c57b:	85 c0                	test   eax,eax
2674255- 134c57d:	74 21                	je     134c5a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b24>
2674256- 134c57f:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2674257- 134c583:	4c 89 e7             	mov    rdi,r12
2674258- 134c586:	ff 50 30             	call   QWORD PTR [rax+0x30]
2674259- 134c589:	ff c8                	dec    eax
2674260- 134c58b:	83 f8 03             	cmp    eax,0x3
2674261- 134c58e:	6a ff                	push   0xffffffffffffffff
2674262- 134c590:	59                   	pop    rcx
2674263- 134c591:	0f 42 c8             	cmovb  ecx,eax
2674265- 134c59b:	41 80 4f 11 04       	or     BYTE PTR [r15+0x11],0x4
2674266- 134c5a0:	80 7b 33 00          	cmp    BYTE PTR [rbx+0x33],0x0
2674267- 134c5a4:	74 3b                	je     134c5e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b65>
2674268- 134c5a6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2674269- 134c5aa:	4c 89 e7             	mov    rdi,r12
2674270- 134c5ad:	ff 50 70             	call   QWORD PTR [rax+0x70]
2674271- 134c5b0:	85 c0                	test   eax,eax
2674272- 134c5b2:	7e 2d                	jle    134c5e1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b65>
2674273- 134c5b4:	4d 8d 6f 18          	lea    r13,[r15+0x18]
2674274- 134c5b8:	31 ed                	xor    ebp,ebp
2674275- 134c5ba:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2674276- 134c5be:	4c 89 e7             	mov    rdi,r12
2674277- 134c5c1:	89 ee                	mov    esi,ebp
2674278- 134c5c3:	ff 50 78             	call   QWORD PTR [rax+0x78]
2674279- 134c5c6:	4c 89 ef             	mov    rdi,r13
2674280- 134c5c9:	48 89 c6             	mov    rsi,rax
2674281- 134c5cc:	e8 7e e3 79 ff       	call   aea94f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x378ef>
2674282- 134c5d1:	ff c5                	inc    ebp
2674283- 134c5d3:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2674284- 134c5d7:	4c 89 e7             	mov    rdi,r12
2674285- 134c5da:	ff 50 70             	call   QWORD PTR [rax+0x70]
2674286- 134c5dd:	39 c5                	cmp    ebp,eax
2674287- 134c5df:	7c d9                	jl     134c5ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b3e>
2674288- 134c5e1:	80 7b 34 00          	cmp    BYTE PTR [rbx+0x34],0x0
2674289- 134c5e5:	74 2b                	je     134c612 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x191b96>
2674290- 134c5e7:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2674291- 134c5eb:	4c 89 e7             	mov    rdi,r12
2674292- 134c5ee:	ff 50 40             	call   QWORD PTR [rax+0x40]
2676488- 134e5a7:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
2676489- 134e5ac:	0f 57 c9             	xorps  xmm1,xmm1
2676490- 134e5af:	41 0f 29 0e          	movaps XMMWORD PTR [r14],xmm1
2676491- 134e5b3:	41 0f 10 46 18       	movups xmm0,XMMWORD PTR [r14+0x18]
2676492- 134e5b8:	0f 11 45 18          	movups XMMWORD PTR [rbp+0x18],xmm0
2676493- 134e5bc:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
2676494- 134e5c0:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
2676495- 134e5c6:	48 89 45 28          	mov    QWORD PTR [rbp+0x28],rax
2676496- 134e5ca:	41 0f 11 0c 24       	movups XMMWORD PTR [r12],xmm1
2676497- 134e5cf:	41 8a 46 30          	mov    al,BYTE PTR [r14+0x30]
2676498- 134e5d3:	88 45 30             	mov    BYTE PTR [rbp+0x30],al
2676499- 134e5d6:	48 89 ee             	mov    rsi,rbp
2676500- 134e5d9:	e8 c2 00 d7 ff       	call   10be6a0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285ab6>
2676501- 134e5de:	0f 57 c0             	xorps  xmm0,xmm0
2676502- 134e5e1:	0f 11 83 e8 00 00 00 	movups XMMWORD PTR [rbx+0xe8],xmm0
2676503- 134e5e8:	0f 11 83 d8 00 00 00 	movups XMMWORD PTR [rbx+0xd8],xmm0
2676504- 134e5ef:	0f 11 83 c8 00 00 00 	movups XMMWORD PTR [rbx+0xc8],xmm0
2676505- 134e5f6:	0f 11 83 b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm0
2676507- 134e604:	c7 83 f8 00 00 00 01 	mov    DWORD PTR [rbx+0xf8],0x1
2676508- 134e60b:	00 00 00 
2676509- 134e60e:	48 89 ef             	mov    rdi,rbp
2676510- 134e611:	e8 a0 d2 90 ff       	call   c5b8b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8856>
2676511- 134e616:	4c 89 ef             	mov    rdi,r13
2676512- 134e619:	e8 68 00 d7 ff       	call   10be686 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285a9c>
2676513- 134e61e:	4c 89 f7             	mov    rdi,r14
2676514- 134e621:	e8 90 d2 90 ff       	call   c5b8b6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a8856>
2676515- 134e626:	4c 89 ff             	mov    rdi,r15
2676516- 134e629:	e8 58 00 d7 ff       	call   10be686 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x285a9c>
2676517- 134e62e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2676518- 134e635:	00 00 
2676519- 134e637:	48 3b 84 24 40 01 00 	cmp    rax,QWORD PTR [rsp+0x140]
2676520- 134e63e:	00 
2676521- 134e63f:	75 6e                	jne    134e6af <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193c33>
2676522- 134e641:	48 81 c4 48 01 00 00 	add    rsp,0x148
2676523- 134e648:	5b                   	pop    rbx
2676524- 134e649:	41 5c                	pop    r12
2676525- 134e64b:	41 5d                	pop    r13
2676526- 134e64d:	41 5e                	pop    r14
2676527- 134e64f:	41 5f                	pop    r15
2676528- 134e651:	5d                   	pop    rbp
2676529- 134e652:	c3                   	ret
2676530- 134e653:	48 89 c3             	mov    rbx,rax
2676531- 134e656:	4c 89 e7             	mov    rdi,r12
2676532- 134e659:	e8 8a cf 72 ff       	call   a7b5e8 <JNI_OnUnload@@Base+0x2eb5>
2676533- 134e65e:	eb 03                	jmp    134e663 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x193be7>
2676534- 134e660:	48 89 c3             	mov    rbx,rax
2677457- 134f2f8:	41 89 c4             	mov    r12d,eax
2677458- 134f2fb:	48 8b 9c 24 b0 00 00 	mov    rbx,QWORD PTR [rsp+0xb0]
2677459- 134f302:	00 
2677460- 134f303:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
2677461- 134f308:	4c 89 ef             	mov    rdi,r13
2677462- 134f30b:	e8 1e 60 37 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
2677463- 134f310:	49 8d 7f 50          	lea    rdi,[r15+0x50]
2677464- 134f314:	49 8d 77 58          	lea    rsi,[r15+0x58]
2677465- 134f318:	49 89 5d 00          	mov    QWORD PTR [r13+0x0],rbx
2677466- 134f31c:	4d 89 7d 08          	mov    QWORD PTR [r13+0x8],r15
2677467- 134f320:	49 83 c7 28          	add    r15,0x28
2677468- 134f324:	48 8d 05 19 e9 78 ff 	lea    rax,[rip+0xffffffffff78e919]        # addc44 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2abe4>
2677469- 134f32b:	49 89 45 10          	mov    QWORD PTR [r13+0x10],rax
2677470- 134f32f:	48 8d 05 a6 38 31 00 	lea    rax,[rip+0x3138a6]        # 1662bdc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16d48>
2677471- 134f336:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
2677472- 134f33a:	41 0f b6 cc          	movzx  ecx,r12b
2677473- 134f33e:	44 0f b6 c5          	movzx  r8d,bpl
2677474- 134f342:	4c 89 fa             	mov    rdx,r15
2677476- 134f34c:	00 
2677477- 134f34d:	41 55                	push   r13
2677478- 134f34f:	ff b4 24 b0 00 00 00 	push   QWORD PTR [rsp+0xb0]
2677479- 134f356:	e8 9c 38 31 00       	call   1662bf7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16d63>
2677480- 134f35b:	59                   	pop    rcx
2677481- 134f35c:	5a                   	pop    rdx
2677482- 134f35d:	41 89 c7             	mov    r15d,eax
2677483- 134f360:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2677484- 134f365:	e8 0e fa a7 ff       	call   dced78 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9bdfe>
2677485- 134f36a:	41 8a 46 18          	mov    al,BYTE PTR [r14+0x18]
2677486- 134f36e:	41 0a 46 19          	or     al,BYTE PTR [r14+0x19]
2677487- 134f372:	48 8b 14 24          	mov    rdx,QWORD PTR [rsp]
2677488- 134f376:	74 17                	je     134f38f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194913>
2677489- 134f378:	42 8d 0c fd 00 00 00 	lea    ecx,[r15*8+0x0]
2677490- 134f37f:	00 
2677491- 134f380:	b8 00 01 00 00       	mov    eax,0x100
2677492- 134f385:	48 d3 e8             	shr    rax,cl
2677493- 134f388:	88 42 18             	mov    BYTE PTR [rdx+0x18],al
2677494- 134f38b:	80 4a 10 01          	or     BYTE PTR [rdx+0x10],0x1
2677495- 134f38f:	41 80 7e 1a 00       	cmp    BYTE PTR [r14+0x1a],0x0
2677496- 134f394:	74 08                	je     134f39e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194922>
2677497- 134f396:	44 89 7a 1c          	mov    DWORD PTR [rdx+0x1c],r15d
2677498- 134f39a:	80 4a 10 02          	or     BYTE PTR [rdx+0x10],0x2
2677499- 134f39e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2677500- 134f3a5:	00 00 
2677501- 134f3a7:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
2677502- 134f3ac:	75 43                	jne    134f3f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194975>
2677503- 134f3ae:	48 83 c4 68          	add    rsp,0x68
2677567- 134f48f:	49 0f 44 ce          	cmove  rcx,r14
2677568- 134f493:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
2677569- 134f498:	48 63 4c 24 68       	movsxd rcx,DWORD PTR [rsp+0x68]
2677570- 134f49d:	48 85 c9             	test   rcx,rcx
2677571- 134f4a0:	0f 84 eb 01 00 00    	je     134f691 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194c15>
2677572- 134f4a6:	48 8d 43 20          	lea    rax,[rbx+0x20]
2677573- 134f4aa:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
2677574- 134f4af:	48 8d 43 30          	lea    rax,[rbx+0x30]
2677575- 134f4b3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2677576- 134f4b8:	48 c1 e1 03          	shl    rcx,0x3
2677577- 134f4bc:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]
2677578- 134f4c3:	00 
2677579- 134f4c4:	45 31 ff             	xor    r15d,r15d
2677580- 134f4c7:	45 31 ed             	xor    r13d,r13d
2677581- 134f4ca:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
2677582- 134f4cf:	48 8b 44 24 20       	mov    rax,QWORD PTR [rsp+0x20]
2677583- 134f4d4:	4a 8b 2c 38          	mov    rbp,QWORD PTR [rax+r15*1]
2677584- 134f4d8:	31 c0                	xor    eax,eax
2677587- 134f4e8:	88 84 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],al
2677588- 134f4ef:	0f 57 c0             	xorps  xmm0,xmm0
2677589- 134f4f2:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
2677590- 134f4f9:	00 
2677591- 134f4fa:	0f 11 84 24 89 00 00 	movups XMMWORD PTR [rsp+0x89],xmm0
2677592- 134f501:	00 
2677593- 134f502:	48 8b 75 18          	mov    rsi,QWORD PTR [rbp+0x18]
2677594- 134f506:	48 83 e6 fc          	and    rsi,0xfffffffffffffffc
2677595- 134f50a:	4d 89 f4             	mov    r12,r14
2677596- 134f50d:	4c 89 f7             	mov    rdi,r14
2677597- 134f510:	e8 6b eb 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
2677598- 134f515:	4c 63 75 48          	movsxd r14,DWORD PTR [rbp+0x48]
2677599- 134f519:	4c 89 b4 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],r14
2677600- 134f520:	00 
2677601- 134f521:	8b 7d 40             	mov    edi,DWORD PTR [rbp+0x40]
2677602- 134f524:	e8 61 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
2677603- 134f529:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
2677604- 134f530:	00 
2677606- 134f538:	8b 7d 44             	mov    edi,DWORD PTR [rbp+0x44]
2677607- 134f53b:	e8 4a 02 00 00       	call   134f78a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194d0e>
2677609- 134f547:	00 
2677610- 134f548:	88 94 24 b0 00 00 00 	mov    BYTE PTR [rsp+0xb0],dl
2677611- 134f54f:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
2677612- 134f553:	48 8b 68 28          	mov    rbp,QWORD PTR [rax+0x28]
2677613- 134f557:	48 8b 70 30          	mov    rsi,QWORD PTR [rax+0x30]
2677614- 134f55b:	48 39 f5             	cmp    rbp,rsi
2677615- 134f55e:	73 58                	jae    134f5b8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x194b3c>
2677616- 134f560:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]
2677617- 134f567:	00 
2677618- 134f568:	48 89 45 10          	mov    QWORD PTR [rbp+0x10],rax
2677619- 134f56c:	0f 28 84 24 80 00 00 	movaps xmm0,XMMWORD PTR [rsp+0x80]
2677620- 134f573:	00 
2677621- 134f574:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
2677622- 134f578:	48 83 a4 24 90 00 00 	and    QWORD PTR [rsp+0x90],0x0
2677623- 134f57f:	00 00 
2677624- 134f581:	0f 57 c0             	xorps  xmm0,xmm0
2677625- 134f584:	0f 29 84 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm0
2677626- 134f58b:	00 
2677627- 134f58c:	48 8d 8c 24 98 00 00 	lea    rcx,[rsp+0x98]
2677628- 134f593:	00 
2677629- 134f594:	48 8b 41 20          	mov    rax,QWORD PTR [rcx+0x20]
2677630- 134f598:	48 89 45 38          	mov    QWORD PTR [rbp+0x38],rax
2677631- 134f59c:	0f 10 01             	movups xmm0,XMMWORD PTR [rcx]
2677632- 134f59f:	0f 10 49 10          	movups xmm1,XMMWORD PTR [rcx+0x10]
2677633- 134f5a3:	0f 11 4d 28          	movups XMMWORD PTR [rbp+0x28],xmm1
2677634- 134f5a7:	0f 11 45 18          	movups XMMWORD PTR [rbp+0x18],xmm0
2677635- 134f5ab:	48 83 c5 40          	add    rbp,0x40
2677636- 134f5af:	48 8b 1c 24          	mov    rbx,QWORD PTR [rsp]
2678988- 13508c7:	4c 89 f6             	mov    rsi,r14
2678989- 13508ca:	e8 93 87 b5 ff       	call   ea9062 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x70478>
2678990- 13508cf:	49 83 c6 18          	add    r14,0x18
2678991- 13508d3:	4d 39 ee             	cmp    r14,r13
2678992- 13508d6:	75 ec                	jne    13508c4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195e48>
2678993- 13508d8:	66 0f 6f 44 24 20    	movdqa xmm0,XMMWORD PTR [rsp+0x20]
2678994- 13508de:	66 48 0f 7e c0       	movq   rax,xmm0
2678995- 13508e3:	48 85 c0             	test   rax,rax
2678996- 13508e6:	0f 84 9d 00 00 00    	je     1350989 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195f0d>
2678997- 13508ec:	0f b7 4d 00          	movzx  ecx,WORD PTR [rbp+0x0]
2678998- 13508f0:	48 8b 30             	mov    rsi,QWORD PTR [rax]
2678999- 13508f3:	48 8b 50 08          	mov    rdx,QWORD PTR [rax+0x8]
2679000- 13508f7:	4c 8d b4 24 98 00 00 	lea    r14,[rsp+0x98]
2679001- 13508fe:	00 
2679002- 13508ff:	4c 89 f7             	mov    rdi,r14
2679003- 1350902:	e8 53 ba 32 00       	call   167c35a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x304c6>
2679004- 1350907:	49 83 7e 30 00       	cmp    QWORD PTR [r14+0x30],0x0
2679005- 135090c:	0f 84 ed 01 00 00    	je     1350aff <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196083>
2679007- 1350919:	00 
2679008- 135091a:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]
2679009- 1350921:	00 
2679010- 1350922:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
2679011- 1350926:	0f 10 84 24 98 00 00 	movups xmm0,XMMWORD PTR [rsp+0x98]
2679012- 135092d:	00 
2679013- 135092e:	41 0f 29 06          	movaps XMMWORD PTR [r14],xmm0
2679014- 1350932:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
2679015- 1350939:	00 
2679016- 135093a:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
2679017- 1350941:	00 
2679018- 1350942:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2679019- 1350947:	4c 39 ac 24 d0 00 00 	cmp    QWORD PTR [rsp+0xd0],r13
2679020- 135094e:	00 
2679021- 135094f:	74 0a                	je     135095b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195edf>
2679022- 1350951:	48 8b 8c 24 e0 00 00 	mov    rcx,QWORD PTR [rsp+0xe0]
2679023- 1350958:	00 
2679024- 1350959:	eb 1b                	jmp    1350976 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195efa>
2679025- 135095b:	b0 01                	mov    al,0x1
2679026- 135095d:	4c 3b ac 24 d8 00 00 	cmp    r13,QWORD PTR [rsp+0xd8]
2679027- 1350964:	00 
2679028- 1350965:	74 5c                	je     13509c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195f47>
2679029- 1350967:	48 8b 8c 24 e0 00 00 	mov    rcx,QWORD PTR [rsp+0xe0]
2679030- 135096e:	00 
2679031- 135096f:	48 3b 4c 24 10       	cmp    rcx,QWORD PTR [rsp+0x10]
2679032- 1350974:	74 4d                	je     13509c3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195f47>
2679033- 1350976:	80 b9 91 00 00 00 00 	cmp    BYTE PTR [rcx+0x91],0x0
2679034- 135097d:	75 42                	jne    13509c1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195f45>
2679040- 1350993:	0f 84 95 01 00 00    	je     1350b2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1960b2>
2679041- 1350999:	48 83 c3 20          	add    rbx,0x20
2679042- 135099d:	48 89 df             	mov    rdi,rbx
2679043- 13509a0:	e8 91 ae 72 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
2679044- 13509a5:	48 89 d1             	mov    rcx,rdx
2679045- 13509a8:	6a 01                	push   0x1
2679046- 13509aa:	5e                   	pop    rsi
2679047- 13509ab:	4c 89 f7             	mov    rdi,r14
2679048- 13509ae:	48 89 c2             	mov    rdx,rax
2679049- 13509b1:	45 31 c0             	xor    r8d,r8d
2679050- 13509b4:	45 31 c9             	xor    r9d,r9d
2679051- 13509b7:	e8 4a b1 31 00       	call   166bb06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1fc72>
2679052- 13509bc:	e9 6d 01 00 00       	jmp    1350b2e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1960b2>
2679053- 13509c1:	31 c0                	xor    eax,eax
2679054- 13509c3:	45 85 e4             	test   r12d,r12d
2679055- 13509c6:	0f 94 c1             	sete   cl
2679056- 13509c9:	20 c1                	and    cl,al
2679057- 13509cb:	88 8d 98 00 00 00    	mov    BYTE PTR [rbp+0x98],cl
2679059- 13509d8:	00 
2679060- 13509d9:	48 8d 8c 24 80 00 00 	lea    rcx,[rsp+0x80]
2679061- 13509e0:	00 
2679062- 13509e1:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
2679063- 13509e5:	f3 0f 6f 84 24 98 00 	movdqu xmm0,XMMWORD PTR [rsp+0x98]
2679064- 13509ec:	00 00 
2679065- 13509ee:	66 0f 7f 01          	movdqa XMMWORD PTR [rcx],xmm0
2679066- 13509f2:	48 89 6c 24 08       	mov    QWORD PTR [rsp+0x8],rbp
2679067- 13509f7:	48 8d 85 a0 00 00 00 	lea    rax,[rbp+0xa0]
2679068- 13509fe:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
2679069- 1350a03:	31 ed                	xor    ebp,ebp
2679070- 1350a05:	4c 8d a4 24 d0 00 00 	lea    r12,[rsp+0xd0]
2679071- 1350a0c:	00 
2679072- 1350a0d:	4c 39 ac 24 80 00 00 	cmp    QWORD PTR [rsp+0x80],r13
2679073- 1350a14:	00 
2679074- 1350a15:	74 0a                	je     1350a21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195fa5>
2679075- 1350a17:	4c 8b b4 24 90 00 00 	mov    r14,QWORD PTR [rsp+0x90]
2679076- 1350a1e:	00 
2679077- 1350a1f:	eb 21                	jmp    1350a42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x195fc6>
2679078- 1350a21:	4c 3b ac 24 88 00 00 	cmp    r13,QWORD PTR [rsp+0x88]
2679079- 1350a28:	00 
2679080- 1350a29:	0f 84 b3 00 00 00    	je     1350ae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196066>
2679081- 1350a2f:	4c 8b b4 24 90 00 00 	mov    r14,QWORD PTR [rsp+0x90]
2679082- 1350a36:	00 
2679083- 1350a37:	4c 3b 74 24 10       	cmp    r14,QWORD PTR [rsp+0x10]
2679084- 1350a3c:	0f 84 a0 00 00 00    	je     1350ae2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x196066>
2679085- 1350a42:	4d 8d 7e 30          	lea    r15,[r14+0x30]
2679086- 1350a46:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
2681672- 1352e0a:	48 89 08             	mov    QWORD PTR [rax],rcx
2681673- 1352e0d:	48 8b 94 24 d0 00 00 	mov    rdx,QWORD PTR [rsp+0xd0]
2681674- 1352e14:	00 
2681675- 1352e15:	48 89 50 08          	mov    QWORD PTR [rax+0x8],rdx
2681676- 1352e19:	48 85 d2             	test   rdx,rdx
2681677- 1352e1c:	74 1a                	je     1352e38 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1983bc>
2681678- 1352e1e:	48 8d 94 24 c8 00 00 	lea    rdx,[rsp+0xc8]
2681679- 1352e25:	00 
2681680- 1352e26:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
2681681- 1352e2a:	48 89 52 f8          	mov    QWORD PTR [rdx-0x8],rdx
2681682- 1352e2e:	66 0f ef c0          	pxor   xmm0,xmm0
2681683- 1352e32:	f3 0f 7f 02          	movdqu XMMWORD PTR [rdx],xmm0
2681684- 1352e36:	eb 08                	jmp    1352e40 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1983c4>
2681685- 1352e38:	48 89 84 24 78 01 00 	mov    QWORD PTR [rsp+0x178],rax
2681686- 1352e3f:	00 
2681687- 1352e40:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
2681688- 1352e47:	00 00 
2681689- 1352e49:	66 0f ef c0          	pxor   xmm0,xmm0
2681691- 1352e54:	00 00 
2681692- 1352e56:	48 8d 84 24 a0 00 00 	lea    rax,[rsp+0xa0]
2681693- 1352e5d:	00 
2681694- 1352e5e:	48 89 84 24 20 01 00 	mov    QWORD PTR [rsp+0x120],rax
2681695- 1352e65:	00 
2681696- 1352e66:	c6 84 24 28 01 00 00 	mov    BYTE PTR [rsp+0x128],0x0
2681697- 1352e6d:	00 
2681698- 1352e6e:	6a 02                	push   0x2
2681699- 1352e70:	5f                   	pop    rdi
2681700- 1352e71:	e8 6d 34 79 ff       	call   ae62e3 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x33283>
2681701- 1352e76:	49 89 c7             	mov    r15,rax
2681702- 1352e79:	48 8d 84 24 b0 00 00 	lea    rax,[rsp+0xb0]
2681703- 1352e80:	00 
2681704- 1352e81:	4c 89 78 f0          	mov    QWORD PTR [rax-0x10],r15
2681705- 1352e85:	4c 89 78 f8          	mov    QWORD PTR [rax-0x8],r15
2681706- 1352e89:	48 c1 e2 05          	shl    rdx,0x5
2681707- 1352e8d:	4c 01 fa             	add    rdx,r15
2681708- 1352e90:	48 89 10             	mov    QWORD PTR [rax],rdx
2681709- 1352e93:	48 8d 8c 24 18 01 00 	lea    rcx,[rsp+0x118]
2681710- 1352e9a:	00 
2681711- 1352e9b:	4c 89 39             	mov    QWORD PTR [rcx],r15
2681712- 1352e9e:	48 8d 94 24 10 01 00 	lea    rdx,[rsp+0x110]
2681713- 1352ea5:	00 
2681714- 1352ea6:	4c 89 3a             	mov    QWORD PTR [rdx],r15
2681715- 1352ea9:	48 89 84 24 30 01 00 	mov    QWORD PTR [rsp+0x130],rax
2681716- 1352eb0:	00 
2681717- 1352eb1:	48 89 94 24 38 01 00 	mov    QWORD PTR [rsp+0x138],rdx
2681718- 1352eb8:	00 
2681727- 1352ed7:	49 89 04 24          	mov    QWORD PTR [r12],rax
2681728- 1352edb:	49 83 c4 08          	add    r12,0x8
2681729- 1352edf:	4b 8d 34 2e          	lea    rsi,[r14+r13*1]
2681730- 1352ee3:	4c 89 e7             	mov    rdi,r12
2681731- 1352ee6:	e8 b9 06 00 00       	call   13535a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b28>
2681732- 1352eeb:	49 83 c5 20          	add    r13,0x20
2681733- 1352eef:	4c 8b a4 24 18 01 00 	mov    r12,QWORD PTR [rsp+0x118]
2681734- 1352ef6:	00 
2681735- 1352ef7:	49 83 c4 20          	add    r12,0x20
2681736- 1352efb:	4c 89 a4 24 18 01 00 	mov    QWORD PTR [rsp+0x118],r12
2681737- 1352f02:	00 
2681738- 1352f03:	49 83 fd 40          	cmp    r13,0x40
2681739- 1352f07:	75 c6                	jne    1352ecf <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198453>
2681740- 1352f09:	40 b5 01             	mov    bpl,0x1
2681741- 1352f0c:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
2681742- 1352f13:	00 
2681743- 1352f14:	40 88 6f 18          	mov    BYTE PTR [rdi+0x18],bpl
2681744- 1352f18:	e8 c3 06 00 00       	call   13535e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b64>
2681746- 1352f24:	00 
2681747- 1352f25:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
2681748- 1352f2c:	00 
2681749- 1352f2d:	40 88 6f 08          	mov    BYTE PTR [rdi+0x8],bpl
2681750- 1352f31:	e8 e0 06 00 00       	call   1353616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b9a>
2681751- 1352f36:	6a 40                	push   0x40
2681752- 1352f38:	41 5e                	pop    r14
2681753- 1352f3a:	4a 8b bc 34 40 01 00 	mov    rdi,QWORD PTR [rsp+r14*1+0x140]
2681754- 1352f41:	00 
2681755- 1352f42:	e8 73 b6 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
2681756- 1352f47:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
2681757- 1352f4b:	75 ed                	jne    1352f3a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1984be>
2681758- 1352f4d:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
2681759- 1352f52:	48 8b 00             	mov    rax,QWORD PTR [rax]
2681760- 1352f55:	48 85 c0             	test   rax,rax
2681761- 1352f58:	48 8b 6c 24 70       	mov    rbp,QWORD PTR [rsp+0x70]
2681762- 1352f5d:	74 3a                	je     1352f99 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19851d>
2681763- 1352f5f:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
2681764- 1352f66:	00 
2681765- 1352f67:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
2681766- 1352f6b:	66 0f ef c0          	pxor   xmm0,xmm0
2681767- 1352f6f:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
2681768- 1352f73:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
2681769- 1352f77:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
2681770- 1352f7e:	00 
2681771- 1352f7f:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
2681772- 1352f86:	00 
2681773- 1352f87:	e8 96 06 00 00       	call   1353622 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ba6>
2681778- 1352f9e:	48 8b 00             	mov    rax,QWORD PTR [rax]
2681779- 1352fa1:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
2681780- 1352fa8:	00 
2681781- 1352fa9:	48 89 41 f0          	mov    QWORD PTR [rcx-0x10],rax
2681782- 1352fad:	66 0f ef c0          	pxor   xmm0,xmm0
2681783- 1352fb1:	f3 0f 7f 01          	movdqu XMMWORD PTR [rcx],xmm0
2681784- 1352fb5:	48 89 49 f8          	mov    QWORD PTR [rcx-0x8],rcx
2681785- 1352fb9:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
2681786- 1352fc0:	00 
2681787- 1352fc1:	48 8d b4 24 50 01 00 	lea    rsi,[rsp+0x150]
2681788- 1352fc8:	00 
2681789- 1352fc9:	e8 54 06 00 00       	call   1353622 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198ba6>
2681790- 1352fce:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
2681791- 1352fd5:	00 
2681792- 1352fd6:	e8 e5 b5 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
2681793- 1352fdb:	bf e8 08 00 00       	mov    edi,0x8e8
2681794- 1352fe0:	e8 1b af 49 00       	call   17edf00 <_Znwm@plt>
2681795- 1352fe5:	49 89 c6             	mov    r14,rax
2681797- 1352fef:	00 
2681798- 1352ff0:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
2681799- 1352ff5:	0f 29 84 24 30 01 00 	movaps XMMWORD PTR [rsp+0x130],xmm0
2681800- 1352ffc:	00 
2681801- 1352ffd:	4c 8b ac 24 b0 00 00 	mov    r13,QWORD PTR [rsp+0xb0]
2681802- 1353004:	00 
2681803- 1353005:	0f 57 c0             	xorps  xmm0,xmm0
2681805- 135300f:	00 
2681806- 1353010:	48 83 a4 24 b0 00 00 	and    QWORD PTR [rsp+0xb0],0x0
2681807- 1353017:	00 00 
2681808- 1353019:	48 8d 05 a8 44 51 00 	lea    rax,[rip+0x5144a8]        # 18674c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23bb0>
2681809- 1353020:	49 89 06             	mov    QWORD PTR [r14],rax
2681810- 1353023:	48 8d 05 26 45 51 00 	lea    rax,[rip+0x514526]        # 1867550 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x23c38>
2681811- 135302a:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
2681812- 135302e:	49 8d 46 10          	lea    rax,[r14+0x10]
2681813- 1353032:	48 8d 0d 47 49 51 00 	lea    rcx,[rip+0x514947]        # 1867980 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24068>
2681814- 1353039:	49 89 4e 10          	mov    QWORD PTR [r14+0x10],rcx
2681815- 135303d:	48 8b bc 24 00 01 00 	mov    rdi,QWORD PTR [rsp+0x100]
2681816- 1353044:	00 
2681817- 1353045:	49 89 7e 18          	mov    QWORD PTR [r14+0x18],rdi
2681818- 1353049:	48 8b 8c 24 08 01 00 	mov    rcx,QWORD PTR [rsp+0x108]
2681819- 1353050:	00 
2681820- 1353051:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx
2681821- 1353055:	48 85 c9             	test   rcx,rcx
2681822- 1353058:	74 05                	je     135305f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1985e3>
2681823- 135305a:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
2681824- 135305f:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
2681825- 1353064:	4c 89 f1             	mov    rcx,r14
2681826- 1353067:	48 83 c1 40          	add    rcx,0x40
2681827- 135306b:	41 0f 11 46 40       	movups XMMWORD PTR [r14+0x40],xmm0
2681828- 1353070:	49 89 4e 38          	mov    QWORD PTR [r14+0x38],rcx
2681829- 1353074:	49 83 66 50 00       	and    QWORD PTR [r14+0x50],0x0
2681830- 1353079:	4c 8d bc 24 50 01 00 	lea    r15,[rsp+0x150]
2681831- 1353080:	00 
2681832- 1353081:	49 89 07             	mov    QWORD PTR [r15],rax
2682001- 1353335:	e8 4c b1 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2682002- 135333a:	4c 89 f7             	mov    rdi,r14
2682003- 135333d:	e8 de ab 49 00       	call   17edf20 <_ZdlPv@plt>
2682004- 1353342:	eb 03                	jmp    1353347 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988cb>
2682005- 1353344:	48 89 c5             	mov    rbp,rax
2682006- 1353347:	48 8b bc 24 58 01 00 	mov    rdi,QWORD PTR [rsp+0x158]
2682007- 135334e:	00 
2682008- 135334f:	e8 32 b1 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2682009- 1353354:	eb 6f                	jmp    13533c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198949>
2682010- 1353356:	eb 05                	jmp    135335d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1988e1>
2682011- 1353358:	48 89 c5             	mov    rbp,rax
2682012- 135335b:	eb 75                	jmp    13533d2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198956>
2682013- 135335d:	48 89 c5             	mov    rbp,rax
2682014- 1353360:	eb 63                	jmp    13533c5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198949>
2682015- 1353362:	48 89 c5             	mov    rbp,rax
2682016- 1353365:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]
2682017- 135336c:	00 
2682018- 135336d:	e8 6e 02 00 00       	call   13535e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b64>
2682020- 1353379:	00 
2682021- 135337a:	48 8d bc 24 20 01 00 	lea    rdi,[rsp+0x120]
2682022- 1353381:	00 
2682023- 1353382:	e8 8f 02 00 00       	call   1353616 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x198b9a>
2682024- 1353387:	6a 40                	push   0x40
2682025- 1353389:	41 5e                	pop    r14
2682026- 135338b:	4a 8b bc 34 40 01 00 	mov    rdi,QWORD PTR [rsp+r14*1+0x140]
2682027- 1353392:	00 
2682028- 1353393:	e8 22 b2 78 ff       	call   ade5ba <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b55a>
2682029- 1353398:	49 83 c6 e0          	add    r14,0xffffffffffffffe0
2682030- 135339c:	75 ed                	jne    135338b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19890f>
2682031- 135339e:	48 8b bc 24 c8 00 00 	mov    rdi,QWORD PTR [rsp+0xc8]
2682032- 13533a5:	00 
2682033- 13533a6:	e8 15 b2 78 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
2682034- 13533ab:	48 8b bc 24 e8 00 00 	mov    rdi,QWORD PTR [rsp+0xe8]
2682035- 13533b2:	00 
2682036- 13533b3:	e8 ce b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2682037- 13533b8:	48 8b bc 24 f8 00 00 	mov    rdi,QWORD PTR [rsp+0xf8]
2682038- 13533bf:	00 
2682039- 13533c0:	e8 c1 b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2682040- 13533c5:	48 8b bc 24 08 01 00 	mov    rdi,QWORD PTR [rsp+0x108]
2682041- 13533cc:	00 
2682042- 13533cd:	e8 b4 b0 74 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2682043- 13533d2:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
2682044- 13533d7:	e8 4c 6a 72 ff       	call   a79e28 <JNI_OnUnload@@Base+0x16f5>
2682045- 13533dc:	48 8b 7c 24 68       	mov    rdi,QWORD PTR [rsp+0x68]
2682046- 13533e1:	e8 5c 1c dd ff       	call   1125042 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2ec458>
2682047- 13533e6:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
2683043- 135411c:	00 00 
2683044- 135411e:	48 3b 84 24 c8 00 00 	cmp    rax,QWORD PTR [rsp+0xc8]
2683045- 1354125:	00 
2683046- 1354126:	75 08                	jne    1354130 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1996b4>
2683047- 1354128:	48 89 df             	mov    rdi,rbx
2683048- 135412b:	e8 a0 bb 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2683049- 1354130:	e8 7b b9 49 00       	call   17efab0 <__stack_chk_fail@plt>
2683050- 1354135:	cc                   	int3
2683051- 1354136:	41 57                	push   r15
2683052- 1354138:	41 56                	push   r14
2683053- 135413a:	41 54                	push   r12
2683054- 135413c:	53                   	push   rbx
2683055- 135413d:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
2683056- 1354144:	4c 89 cb             	mov    rbx,r9
2683057- 1354147:	4d 89 c6             	mov    r14,r8
2683058- 135414a:	49 89 ff             	mov    r15,rdi
2683059- 135414d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2683060- 1354154:	00 00 
2683062- 135415d:	00 
2683063- 135415e:	4c 8d 64 24 20       	lea    r12,[rsp+0x20]
2683064- 1354163:	4c 89 e7             	mov    rdi,r12
2683065- 1354166:	48 89 d6             	mov    rsi,rdx
2683066- 1354169:	4c 89 c2             	mov    rdx,r8
2683067- 135416c:	e8 85 00 00 00       	call   13541f6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19977a>
2683068- 1354171:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
2683069- 1354175:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
2683070- 135417a:	48 89 01             	mov    QWORD PTR [rcx],rax
2683071- 135417d:	c6 41 08 01          	mov    BYTE PTR [rcx+0x8],0x1
2683072- 1354181:	41 0f 10 46 10       	movups xmm0,XMMWORD PTR [r14+0x10]
2683073- 1354186:	49 89 e0             	mov    r8,rsp
2683074- 1354189:	41 0f 29 00          	movaps XMMWORD PTR [r8],xmm0
2683075- 135418d:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
2683076- 1354191:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2683077- 1354194:	4c 89 e6             	mov    rsi,r12
2683078- 1354197:	48 89 da             	mov    rdx,rbx
2683079- 135419a:	ff 50 38             	call   QWORD PTR [rax+0x38]
2683080- 135419d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2683081- 13541a2:	e8 fd 01 00 00       	call   13543a4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199928>
2683082- 13541a7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2683083- 13541ae:	00 00 
2683084- 13541b0:	48 3b 84 24 a0 00 00 	cmp    rax,QWORD PTR [rsp+0xa0]
2683085- 13541b7:	00 
2683086- 13541b8:	75 37                	jne    13541f1 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x199775>
2683087- 13541ba:	48 81 c4 a8 00 00 00 	add    rsp,0xa8
2683088- 13541c1:	5b                   	pop    rbx
2683089- 13541c2:	41 5c                	pop    r12
2683895- 1354d84:	00 
2683896- 1354d85:	0f 94 43 01          	sete   BYTE PTR [rbx+0x1]
2683897- 1354d89:	48 8d 7b 08          	lea    rdi,[rbx+0x8]
2683898- 1354d8d:	48 8d 74 24 10       	lea    rsi,[rsp+0x10]
2683899- 1354d92:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
2683900- 1354d96:	e8 a5 91 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2683901- 1354d9b:	4c 8d 63 20          	lea    r12,[rbx+0x20]
2683902- 1354d9f:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
2683903- 1354da4:	4c 89 e7             	mov    rdi,r12
2683904- 1354da7:	48 89 ee             	mov    rsi,rbp
2683905- 1354daa:	4c 89 ea             	mov    rdx,r13
2683906- 1354dad:	e8 56 01 00 00       	call   1354f08 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a48c>
2683907- 1354db2:	41 8a 47 08          	mov    al,BYTE PTR [r15+0x8]
2683908- 1354db6:	88 83 98 00 00 00    	mov    BYTE PTR [rbx+0x98],al
2683909- 1354dbc:	49 8b 07             	mov    rax,QWORD PTR [r15]
2683910- 1354dbf:	48 89 83 90 00 00 00 	mov    QWORD PTR [rbx+0x90],rax
2683911- 1354dc6:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
2683912- 1354dcb:	48 8b 01             	mov    rax,QWORD PTR [rcx]
2683914- 1354dd5:	8a 41 08             	mov    al,BYTE PTR [rcx+0x8]
2683916- 1354dde:	41 80 7e 04 00       	cmp    BYTE PTR [r14+0x4],0x0
2683917- 1354de3:	0f 95 c0             	setne  al
2683918- 1354de6:	41 83 3e 00          	cmp    DWORD PTR [r14],0x0
2683919- 1354dea:	0f 94 c1             	sete   cl
2683920- 1354ded:	20 c1                	and    cl,al
2683921- 1354def:	88 8b b0 00 00 00    	mov    BYTE PTR [rbx+0xb0],cl
2683922- 1354df5:	48 81 c3 b8 00 00 00 	add    rbx,0xb8
2683923- 1354dfc:	48 8d 35 79 d1 0f ff 	lea    rsi,[rip+0xffffffffff0fd179]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
2683924- 1354e03:	48 89 df             	mov    rdi,rbx
2683925- 1354e06:	e8 73 4c 72 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2683926- 1354e0b:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
2683927- 1354e10:	e8 7b 90 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2683928- 1354e15:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
2683929- 1354e1a:	e8 1d 52 ed ff       	call   122a03c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5c0>
2683930- 1354e1f:	48 8d bc 24 c8 02 00 	lea    rdi,[rsp+0x2c8]
2683931- 1354e26:	00 
2683932- 1354e27:	e8 a0 99 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
2683933- 1354e2c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2683934- 1354e33:	00 00 
2683935- 1354e35:	48 3b 84 24 10 03 00 	cmp    rax,QWORD PTR [rsp+0x310]
2683936- 1354e3c:	00 
2683937- 1354e3d:	75 76                	jne    1354eb5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a439>
2683938- 1354e3f:	48 81 c4 18 03 00 00 	add    rsp,0x318
2683939- 1354e46:	5b                   	pop    rbx
2683940- 1354e47:	41 5c                	pop    r12
2683941- 1354e49:	41 5d                	pop    r13
2683942- 1354e4b:	41 5e                	pop    r14
2683943- 1354e4d:	41 5f                	pop    r15
2684316- 13553b7:	00 
2684317- 13553b8:	75 08                	jne    13553c2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a946>
2684318- 13553ba:	48 89 df             	mov    rdi,rbx
2684319- 13553bd:	e8 0e a9 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2684320- 13553c2:	e8 e9 a6 49 00       	call   17efab0 <__stack_chk_fail@plt>
2684321- 13553c7:	cc                   	int3
2684322- 13553c8:	e9 17 0e 00 00       	jmp    13561e4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b768>
2684323- 13553cd:	cc                   	int3
2684324- 13553ce:	55                   	push   rbp
2684325- 13553cf:	41 57                	push   r15
2684326- 13553d1:	41 56                	push   r14
2684327- 13553d3:	41 55                	push   r13
2684328- 13553d5:	41 54                	push   r12
2684329- 13553d7:	53                   	push   rbx
2684330- 13553d8:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
2684331- 13553df:	48 89 fb             	mov    rbx,rdi
2684332- 13553e2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2684333- 13553e9:	00 00 
2684335- 13553f2:	00 
2684336- 13553f3:	48 89 d6             	mov    rsi,rdx
2684337- 13553f6:	e8 97 0f 00 00       	call   1356392 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19b916>
2684338- 13553fb:	48 85 c0             	test   rax,rax
2684339- 13553fe:	0f 84 05 01 00 00    	je     1355509 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aa8d>
2684340- 1355404:	49 89 c6             	mov    r14,rax
2684341- 1355407:	80 bb e0 08 00 00 00 	cmp    BYTE PTR [rbx+0x8e0],0x0
2684342- 135540e:	c6 83 e0 08 00 00 01 	mov    BYTE PTR [rbx+0x8e0],0x1
2684343- 1355415:	75 2d                	jne    1355444 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a9c8>
2684344- 1355417:	4c 8b 63 58          	mov    r12,QWORD PTR [rbx+0x58]
2684345- 135541b:	4c 8b 6b 60          	mov    r13,QWORD PTR [rbx+0x60]
2684346- 135541f:	4d 39 ec             	cmp    r12,r13
2684347- 1355422:	74 20                	je     1355444 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a9c8>
2684348- 1355424:	4c 8d bb 80 00 00 00 	lea    r15,[rbx+0x80]
2684349- 135542b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
2684350- 135542f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2684351- 1355432:	4c 89 fe             	mov    rsi,r15
2684352- 1355435:	4c 89 f2             	mov    rdx,r14
2684353- 1355438:	ff 50 10             	call   QWORD PTR [rax+0x10]
2684354- 135543b:	49 83 c4 20          	add    r12,0x20
2684355- 135543f:	4d 39 ec             	cmp    r12,r13
2684356- 1355442:	75 e7                	jne    135542b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19a9af>
2684357- 1355444:	80 bb d8 08 00 00 00 	cmp    BYTE PTR [rbx+0x8d8],0x0
2684358- 135544b:	0f 84 b8 00 00 00    	je     1355509 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19aa8d>
2684359- 1355451:	48 8d bb f8 03 00 00 	lea    rdi,[rbx+0x3f8]
2684360- 1355458:	48 89 3c 24          	mov    QWORD PTR [rsp],rdi
2684361- 135545c:	4c 89 f6             	mov    rsi,r14
2684362- 135545f:	e8 de 2e 00 00       	call   1358342 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d8c6>
2685489- 1356490:	41 89 47 48          	mov    DWORD PTR [r15+0x48],eax
2685490- 1356494:	4d 8d 77 50          	lea    r14,[r15+0x50]
2685491- 1356498:	49 8d 74 24 50       	lea    rsi,[r12+0x50]
2685492- 135649d:	4c 89 f7             	mov    rdi,r14
2685493- 13564a0:	e8 9b 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2685494- 13564a5:	4d 8d 6f 68          	lea    r13,[r15+0x68]
2685495- 13564a9:	49 8d 74 24 68       	lea    rsi,[r12+0x68]
2685496- 13564ae:	4c 89 ef             	mov    rdi,r13
2685497- 13564b1:	e8 8a 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2685498- 13564b6:	41 0f 10 84 24 80 00 	movups xmm0,XMMWORD PTR [r12+0x80]
2685499- 13564bd:	00 00 
2685500- 13564bf:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
2685501- 13564c6:	00 
2685502- 13564c7:	be 90 00 00 00       	mov    esi,0x90
2685503- 13564cc:	49 8d 2c 37          	lea    rbp,[r15+rsi*1]
2685504- 13564d0:	4c 01 e6             	add    rsi,r12
2685505- 13564d3:	48 89 ef             	mov    rdi,rbp
2685506- 13564d6:	e8 65 7a 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2685508- 13564e2:	00 
2685510- 13564ea:	be b0 00 00 00       	mov    esi,0xb0
2685511- 13564ef:	49 8d 3c 37          	lea    rdi,[r15+rsi*1]
2685512- 13564f3:	4c 01 e6             	add    rsi,r12
2685513- 13564f6:	e8 6b 62 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
2685514- 13564fb:	41 0f 10 84 24 d0 00 	movups xmm0,XMMWORD PTR [r12+0xd0]
2685515- 1356502:	00 00 
2685516- 1356504:	41 0f 10 8c 24 d9 00 	movups xmm1,XMMWORD PTR [r12+0xd9]
2685517- 135650b:	00 00 
2685518- 135650d:	41 0f 11 8f d9 00 00 	movups XMMWORD PTR [r15+0xd9],xmm1
2685519- 1356514:	00 
2685520- 1356515:	41 0f 11 87 d0 00 00 	movups XMMWORD PTR [r15+0xd0],xmm0
2685521- 135651c:	00 
2685522- 135651d:	49 8b 84 24 f0 00 00 	mov    rax,QWORD PTR [r12+0xf0]
2685523- 1356524:	00 
2685524- 1356525:	49 89 87 f0 00 00 00 	mov    QWORD PTR [r15+0xf0],rax
2685525- 135652c:	49 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [r12+0xf8]
2685526- 1356533:	00 
2685527- 1356534:	49 89 87 f8 00 00 00 	mov    QWORD PTR [r15+0xf8],rax
2685528- 135653b:	48 85 c0             	test   rax,rax
2685529- 135653e:	74 05                	je     1356545 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bac9>
2685530- 1356540:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2685531- 1356545:	48 83 c4 08          	add    rsp,0x8
2685532- 1356549:	5b                   	pop    rbx
2685533- 135654a:	41 5c                	pop    r12
2685534- 135654c:	41 5d                	pop    r13
2685535- 135654e:	41 5e                	pop    r14
2685536- 1356550:	41 5f                	pop    r15
2685537- 1356552:	5d                   	pop    rbp
2685709- 13567b4:	49 89 f7             	mov    r15,rsi
2685710- 13567b7:	48 89 fb             	mov    rbx,rdi
2685711- 13567ba:	e8 91 5e d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
2685712- 13567bf:	4c 8d 73 48          	lea    r14,[rbx+0x48]
2685713- 13567c3:	49 8d 77 48          	lea    rsi,[r15+0x48]
2685714- 13567c7:	4c 89 f7             	mov    rdi,r14
2685715- 13567ca:	e8 71 77 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2685716- 13567cf:	41 0f 10 47 60       	movups xmm0,XMMWORD PTR [r15+0x60]
2685717- 13567d4:	41 0f 10 4f 70       	movups xmm1,XMMWORD PTR [r15+0x70]
2685718- 13567d9:	41 0f 10 57 79       	movups xmm2,XMMWORD PTR [r15+0x79]
2685719- 13567de:	0f 11 53 79          	movups XMMWORD PTR [rbx+0x79],xmm2
2685720- 13567e2:	0f 11 4b 70          	movups XMMWORD PTR [rbx+0x70],xmm1
2685721- 13567e6:	0f 11 43 60          	movups XMMWORD PTR [rbx+0x60],xmm0
2685722- 13567ea:	be 90 00 00 00       	mov    esi,0x90
2685723- 13567ef:	4c 8d 24 33          	lea    r12,[rbx+rsi*1]
2685724- 13567f3:	4c 01 fe             	add    rsi,r15
2685725- 13567f6:	4c 89 e7             	mov    rdi,r12
2685726- 13567f9:	e8 ac f3 ee ff       	call   1245baa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b12e>
2685728- 1356805:	00 
2685729- 1356806:	41 0f 10 8f b8 00 00 	movups xmm1,XMMWORD PTR [r15+0xb8]
2685730- 135680d:	00 
2685731- 135680e:	0f 11 8b b8 00 00 00 	movups XMMWORD PTR [rbx+0xb8],xmm1
2685733- 135681c:	be c8 00 00 00       	mov    esi,0xc8
2685734- 1356821:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
2685735- 1356825:	4c 01 fe             	add    rsi,r15
2685736- 1356828:	e8 55 00 00 00       	call   1356882 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19be06>
2685737- 135682d:	41 8a 87 30 01 00 00 	mov    al,BYTE PTR [r15+0x130]
2685738- 1356834:	88 83 30 01 00 00    	mov    BYTE PTR [rbx+0x130],al
2685739- 135683a:	49 8b 87 28 01 00 00 	mov    rax,QWORD PTR [r15+0x128]
2685740- 1356841:	48 89 83 28 01 00 00 	mov    QWORD PTR [rbx+0x128],rax
2685741- 1356848:	48 83 c4 08          	add    rsp,0x8
2685742- 135684c:	5b                   	pop    rbx
2685743- 135684d:	41 5c                	pop    r12
2685744- 135684f:	41 5e                	pop    r14
2685745- 1356851:	41 5f                	pop    r15
2685746- 1356853:	c3                   	ret
2685747- 1356854:	49 89 c7             	mov    r15,rax
2685748- 1356857:	4c 89 e7             	mov    rdi,r12
2685749- 135685a:	e8 bb dc ec ff       	call   122451a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69a9e>
2685750- 135685f:	eb 03                	jmp    1356864 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bde8>
2685751- 1356861:	49 89 c7             	mov    r15,rax
2685752- 1356864:	4c 89 f7             	mov    rdi,r14
2685753- 1356867:	e8 24 76 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2685754- 135686c:	eb 03                	jmp    1356871 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bdf5>
2685755- 135686e:	49 89 c7             	mov    r15,rax
2685756- 1356871:	48 89 df             	mov    rdi,rbx
2685757- 1356874:	e8 53 7f 74 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
2685758- 1356879:	4c 89 ff             	mov    rdi,r15
2685759- 135687c:	e8 4f 94 71 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
2685760- 1356881:	cc                   	int3
2686035- 1356c38:	48 39 c8             	cmp    rax,rcx
2686036- 1356c3b:	74 1d                	je     1356c5a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1de>
2686037- 1356c3d:	49 8d 57 48          	lea    rdx,[r15+0x48]
2686038- 1356c41:	48 8d 0d e8 5f 50 00 	lea    rcx,[rip+0x505fe8]        # 185cc30 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19318>
2686039- 1356c48:	48 8d 7c 24 0f       	lea    rdi,[rsp+0xf]
2686040- 1356c4d:	4c 89 f6             	mov    rsi,r14
2686041- 1356c50:	ff 14 c1             	call   QWORD PTR [rcx+rax*8]
2686042- 1356c53:	41 8b 47 60          	mov    eax,DWORD PTR [r15+0x60]
2686043- 1356c57:	89 43 60             	mov    DWORD PTR [rbx+0x60],eax
2686044- 1356c5a:	4c 8d 63 68          	lea    r12,[rbx+0x68]
2686045- 1356c5e:	49 8d 77 68          	lea    rsi,[r15+0x68]
2686046- 1356c62:	4c 89 e7             	mov    rdi,r12
2686047- 1356c65:	e8 fc 5a 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
2686048- 1356c6a:	be 88 00 00 00       	mov    esi,0x88
2686049- 1356c6f:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
2686050- 1356c73:	4c 01 fe             	add    rsi,r15
2686051- 1356c76:	4c 89 ef             	mov    rdi,r13
2686052- 1356c79:	e8 e8 5a 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
2686055- 1356c8c:	be b0 00 00 00       	mov    esi,0xb0
2686056- 1356c91:	48 8d 2c 33          	lea    rbp,[rbx+rsi*1]
2686057- 1356c95:	4c 01 fe             	add    rsi,r15
2686058- 1356c98:	48 89 ef             	mov    rdi,rbp
2686059- 1356c9b:	e8 c6 5a 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
2686060- 1356ca0:	49 8b 87 d0 00 00 00 	mov    rax,QWORD PTR [r15+0xd0]
2686061- 1356ca7:	49 8b 8f d5 00 00 00 	mov    rcx,QWORD PTR [r15+0xd5]
2686062- 1356cae:	48 89 8b d5 00 00 00 	mov    QWORD PTR [rbx+0xd5],rcx
2686063- 1356cb5:	48 89 83 d0 00 00 00 	mov    QWORD PTR [rbx+0xd0],rax
2686064- 1356cbc:	be e0 00 00 00       	mov    esi,0xe0
2686065- 1356cc1:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
2686066- 1356cc5:	4c 01 fe             	add    rsi,r15
2686067- 1356cc8:	e8 dd ee ee ff       	call   1245baa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b12e>
2686068- 1356ccd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2686069- 1356cd4:	00 00 
2686070- 1356cd6:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
2686071- 1356cdb:	0f 85 87 00 00 00    	jne    1356d68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c2ec>
2686072- 1356ce1:	b8 f8 00 00 00       	mov    eax,0xf8
2686073- 1356ce6:	48 01 c3             	add    rbx,rax
2686074- 1356ce9:	49 01 c7             	add    r15,rax
2686075- 1356cec:	41 0f b7 47 20       	movzx  eax,WORD PTR [r15+0x20]
2686076- 1356cf1:	66 89 43 20          	mov    WORD PTR [rbx+0x20],ax
2686077- 1356cf5:	41 0f 10 07          	movups xmm0,XMMWORD PTR [r15]
2686078- 1356cf9:	41 0f 10 4f 10       	movups xmm1,XMMWORD PTR [r15+0x10]
2686079- 1356cfe:	0f 11 4b 10          	movups XMMWORD PTR [rbx+0x10],xmm1
2686080- 1356d02:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
2686081- 1356d05:	48 83 c4 18          	add    rsp,0x18
2686082- 1356d09:	5b                   	pop    rbx
2686120- 1356d77:	49 89 f7             	mov    r15,rsi
2686121- 1356d7a:	48 89 fb             	mov    rbx,rdi
2686122- 1356d7d:	e8 ce 58 d3 ff       	call   108c650 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x253a66>
2686123- 1356d82:	4c 8d 73 48          	lea    r14,[rbx+0x48]
2686124- 1356d86:	49 8d 77 48          	lea    rsi,[r15+0x48]
2686125- 1356d8a:	4c 89 f7             	mov    rdi,r14
2686126- 1356d8d:	e8 d4 59 77 ff       	call   acc766 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x19706>
2686127- 1356d92:	4c 8d 63 68          	lea    r12,[rbx+0x68]
2686128- 1356d96:	49 8d 77 68          	lea    rsi,[r15+0x68]
2686129- 1356d9a:	4c 89 e7             	mov    rdi,r12
2686130- 1356d9d:	e8 9e 71 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2686131- 1356da2:	41 8a 87 80 00 00 00 	mov    al,BYTE PTR [r15+0x80]
2686132- 1356da9:	88 83 80 00 00 00    	mov    BYTE PTR [rbx+0x80],al
2686133- 1356daf:	be 88 00 00 00       	mov    esi,0x88
2686134- 1356db4:	4c 8d 2c 33          	lea    r13,[rbx+rsi*1]
2686135- 1356db8:	4c 01 fe             	add    rsi,r15
2686136- 1356dbb:	4c 89 ef             	mov    rdi,r13
2686137- 1356dbe:	e8 7d 71 49 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
2686140- 1356dd0:	be a8 00 00 00       	mov    esi,0xa8
2686141- 1356dd5:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
2686142- 1356dd9:	4c 01 fe             	add    rsi,r15
2686143- 1356ddc:	e8 c9 ed ee ff       	call   1245baa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8b12e>
2686144- 1356de1:	41 8a 87 e0 00 00 00 	mov    al,BYTE PTR [r15+0xe0]
2686145- 1356de8:	88 83 e0 00 00 00    	mov    BYTE PTR [rbx+0xe0],al
2686146- 1356dee:	41 0f 10 87 c0 00 00 	movups xmm0,XMMWORD PTR [r15+0xc0]
2686147- 1356df5:	00 
2686148- 1356df6:	41 0f 10 8f d0 00 00 	movups xmm1,XMMWORD PTR [r15+0xd0]
2686149- 1356dfd:	00 
2686150- 1356dfe:	0f 11 8b d0 00 00 00 	movups XMMWORD PTR [rbx+0xd0],xmm1
2686151- 1356e05:	0f 11 83 c0 00 00 00 	movups XMMWORD PTR [rbx+0xc0],xmm0
2686152- 1356e0c:	5b                   	pop    rbx
2686153- 1356e0d:	41 5c                	pop    r12
2686154- 1356e0f:	41 5d                	pop    r13
2686155- 1356e11:	41 5e                	pop    r14
2686156- 1356e13:	41 5f                	pop    r15
2686157- 1356e15:	c3                   	ret
2686158- 1356e16:	49 89 c7             	mov    r15,rax
2686159- 1356e19:	4c 89 ef             	mov    rdi,r13
2686160- 1356e1c:	e8 6f 70 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2686161- 1356e21:	eb 03                	jmp    1356e26 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c3aa>
2686162- 1356e23:	49 89 c7             	mov    r15,rax
2686163- 1356e26:	4c 89 e7             	mov    rdi,r12
2686164- 1356e29:	e8 62 70 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2686165- 1356e2e:	eb 03                	jmp    1356e33 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c3b7>
2686166- 1356e30:	49 89 c7             	mov    r15,rax
2686167- 1356e33:	4c 89 f7             	mov    rdi,r14
2686397- 1357144:	48 83 c7 30          	add    rdi,0x30
2686398- 1357148:	48 83 c6 30          	add    rsi,0x30
2686399- 135714c:	e8 dd 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
2686400- 1357151:	41 8b 46 48          	mov    eax,DWORD PTR [r14+0x48]
2686401- 1357155:	89 43 48             	mov    DWORD PTR [rbx+0x48],eax
2686402- 1357158:	48 8d 7b 50          	lea    rdi,[rbx+0x50]
2686403- 135715c:	49 8d 76 50          	lea    rsi,[r14+0x50]
2686404- 1357160:	e8 c9 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
2686405- 1357165:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
2686406- 1357169:	49 8d 76 68          	lea    rsi,[r14+0x68]
2686407- 135716d:	e8 bc 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
2686408- 1357172:	41 0f 10 86 80 00 00 	movups xmm0,XMMWORD PTR [r14+0x80]
2686409- 1357179:	00 
2686410- 135717a:	0f 11 83 80 00 00 00 	movups XMMWORD PTR [rbx+0x80],xmm0
2686411- 1357181:	be 90 00 00 00       	mov    esi,0x90
2686412- 1357186:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
2686413- 135718a:	4c 01 f6             	add    rsi,r14
2686414- 135718d:	e8 9c 48 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
2686417- 13571a0:	be b0 00 00 00       	mov    esi,0xb0
2686418- 13571a5:	48 8d 3c 33          	lea    rdi,[rbx+rsi*1]
2686419- 13571a9:	4c 01 f6             	add    rsi,r14
2686420- 13571ac:	e8 b3 e5 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
2686421- 13571b1:	41 0f 10 86 d0 00 00 	movups xmm0,XMMWORD PTR [r14+0xd0]
2686422- 13571b8:	00 
2686423- 13571b9:	41 0f 10 8e d9 00 00 	movups xmm1,XMMWORD PTR [r14+0xd9]
2686424- 13571c0:	00 
2686425- 13571c1:	0f 11 83 d0 00 00 00 	movups XMMWORD PTR [rbx+0xd0],xmm0
2686426- 13571c8:	0f 11 8b d9 00 00 00 	movups XMMWORD PTR [rbx+0xd9],xmm1
2686427- 13571cf:	b8 f0 00 00 00       	mov    eax,0xf0
2686428- 13571d4:	48 8d 3c 03          	lea    rdi,[rbx+rax*1]
2686429- 13571d8:	49 01 c6             	add    r14,rax
2686430- 13571db:	4c 89 f6             	mov    rsi,r14
2686431- 13571de:	e8 39 26 76 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
2686432- 13571e3:	48 89 d8             	mov    rax,rbx
2686433- 13571e6:	48 83 c4 08          	add    rsp,0x8
2686434- 13571ea:	5b                   	pop    rbx
2686435- 13571eb:	41 5e                	pop    r14
2686436- 13571ed:	c3                   	ret
2686437- 13571ee:	41 56                	push   r14
2686438- 13571f0:	53                   	push   rbx
2686439- 13571f1:	48 83 ec 18          	sub    rsp,0x18
2686440- 13571f5:	49 89 f6             	mov    r14,rsi
2686441- 13571f8:	48 89 fb             	mov    rbx,rdi
2686442- 13571fb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2686443- 1357202:	00 00 
2686444- 1357204:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2686568- 13573d3:	48 83 66 40 00       	and    QWORD PTR [rsi+0x40],0x0
2686569- 13573d8:	0f 11 46 30          	movups XMMWORD PTR [rsi+0x30],xmm0
2686570- 13573dc:	8b 46 48             	mov    eax,DWORD PTR [rsi+0x48]
2686571- 13573df:	89 47 48             	mov    DWORD PTR [rdi+0x48],eax
2686572- 13573e2:	48 8b 46 60          	mov    rax,QWORD PTR [rsi+0x60]
2686573- 13573e6:	48 89 47 60          	mov    QWORD PTR [rdi+0x60],rax
2686574- 13573ea:	0f 10 4e 50          	movups xmm1,XMMWORD PTR [rsi+0x50]
2686575- 13573ee:	0f 11 4f 50          	movups XMMWORD PTR [rdi+0x50],xmm1
2686576- 13573f2:	0f 11 46 50          	movups XMMWORD PTR [rsi+0x50],xmm0
2686577- 13573f6:	48 83 66 60 00       	and    QWORD PTR [rsi+0x60],0x0
2686578- 13573fb:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
2686579- 13573ff:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
2686580- 1357403:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
2686581- 1357407:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
2686582- 135740b:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
2686583- 135740f:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
2686584- 1357414:	0f 10 8e 80 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x80]
2686585- 135741b:	0f 11 8f 80 00 00 00 	movups XMMWORD PTR [rdi+0x80],xmm1
2686588- 1357430:	0f 10 8e 90 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x90]
2686589- 1357437:	0f 11 8f 90 00 00 00 	movups XMMWORD PTR [rdi+0x90],xmm1
2686590- 135743e:	48 83 a6 a0 00 00 00 	and    QWORD PTR [rsi+0xa0],0x0
2686591- 1357445:	00 
2686592- 1357446:	0f 11 86 90 00 00 00 	movups XMMWORD PTR [rsi+0x90],xmm0
2686595- 135745b:	31 c0                	xor    eax,eax
2686596- 135745d:	88 87 b0 00 00 00    	mov    BYTE PTR [rdi+0xb0],al
2686597- 1357463:	88 87 c8 00 00 00    	mov    BYTE PTR [rdi+0xc8],al
2686598- 1357469:	38 86 c8 00 00 00    	cmp    BYTE PTR [rsi+0xc8],al
2686599- 135746f:	74 32                	je     13574a3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ca27>
2686600- 1357471:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
2686601- 1357478:	48 8b 8e c0 00 00 00 	mov    rcx,QWORD PTR [rsi+0xc0]
2686602- 135747f:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
2686603- 1357483:	0f 10 8e b0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xb0]
2686604- 135748a:	0f 11 08             	movups XMMWORD PTR [rax],xmm1
2686605- 135748d:	0f 11 86 b0 00 00 00 	movups XMMWORD PTR [rsi+0xb0],xmm0
2686606- 1357494:	48 83 a6 c0 00 00 00 	and    QWORD PTR [rsi+0xc0],0x0
2686607- 135749b:	00 
2686608- 135749c:	c6 87 c8 00 00 00 01 	mov    BYTE PTR [rdi+0xc8],0x1
2686609- 13574a3:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
2686610- 13574aa:	0f 10 96 d9 00 00 00 	movups xmm2,XMMWORD PTR [rsi+0xd9]
2686611- 13574b1:	0f 11 97 d9 00 00 00 	movups XMMWORD PTR [rdi+0xd9],xmm2
2686612- 13574b8:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
2686613- 13574bf:	48 8b 86 f0 00 00 00 	mov    rax,QWORD PTR [rsi+0xf0]
2686614- 13574c6:	48 89 87 f0 00 00 00 	mov    QWORD PTR [rdi+0xf0],rax
2686615- 13574cd:	48 8b 86 f8 00 00 00 	mov    rax,QWORD PTR [rsi+0xf8]
2686616- 13574d4:	48 89 87 f8 00 00 00 	mov    QWORD PTR [rdi+0xf8],rax
2686617- 13574db:	0f 11 86 f0 00 00 00 	movups XMMWORD PTR [rsi+0xf0],xmm0
2686618- 13574e2:	c3                   	ret
2686619- 13574e3:	cc                   	int3
2686620- 13574e4:	31 c0                	xor    eax,eax
2686621- 13574e6:	88 07                	mov    BYTE PTR [rdi],al
2686622- 13574e8:	88 87 90 00 00 00    	mov    BYTE PTR [rdi+0x90],al
2686758- 13576bc:	0f 11 46 48          	movups XMMWORD PTR [rsi+0x48],xmm0
2686759- 13576c0:	48 83 66 58 00       	and    QWORD PTR [rsi+0x58],0x0
2686760- 13576c5:	c6 47 60 01          	mov    BYTE PTR [rdi+0x60],0x1
2686761- 13576c9:	48 8b 46 78          	mov    rax,QWORD PTR [rsi+0x78]
2686762- 13576cd:	48 89 47 78          	mov    QWORD PTR [rdi+0x78],rax
2686763- 13576d1:	0f 10 4e 68          	movups xmm1,XMMWORD PTR [rsi+0x68]
2686764- 13576d5:	0f 11 4f 68          	movups XMMWORD PTR [rdi+0x68],xmm1
2686765- 13576d9:	0f 11 46 68          	movups XMMWORD PTR [rsi+0x68],xmm0
2686766- 13576dd:	48 83 66 78 00       	and    QWORD PTR [rsi+0x78],0x0
2686767- 13576e2:	8a 86 80 00 00 00    	mov    al,BYTE PTR [rsi+0x80]
2686768- 13576e8:	88 87 80 00 00 00    	mov    BYTE PTR [rdi+0x80],al
2686769- 13576ee:	48 8b 86 98 00 00 00 	mov    rax,QWORD PTR [rsi+0x98]
2686770- 13576f5:	48 89 87 98 00 00 00 	mov    QWORD PTR [rdi+0x98],rax
2686771- 13576fc:	0f 10 8e 88 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0x88]
2686772- 1357703:	0f 11 8f 88 00 00 00 	movups XMMWORD PTR [rdi+0x88],xmm1
2686773- 135770a:	48 83 a6 98 00 00 00 	and    QWORD PTR [rsi+0x98],0x0
2686774- 1357711:	00 
2686775- 1357712:	0f 11 86 88 00 00 00 	movups XMMWORD PTR [rsi+0x88],xmm0
2686779- 135772c:	48 83 a7 b8 00 00 00 	and    QWORD PTR [rdi+0xb8],0x0
2686780- 1357733:	00 
2686783- 1357742:	48 8b 86 b0 00 00 00 	mov    rax,QWORD PTR [rsi+0xb0]
2686784- 1357749:	48 89 87 b0 00 00 00 	mov    QWORD PTR [rdi+0xb0],rax
2686785- 1357750:	48 8b 86 b8 00 00 00 	mov    rax,QWORD PTR [rsi+0xb8]
2686786- 1357757:	48 89 87 b8 00 00 00 	mov    QWORD PTR [rdi+0xb8],rax
2686787- 135775e:	48 83 a6 b8 00 00 00 	and    QWORD PTR [rsi+0xb8],0x0
2686788- 1357765:	00 
2686790- 135776d:	8a 86 e0 00 00 00    	mov    al,BYTE PTR [rsi+0xe0]
2686791- 1357773:	88 87 e0 00 00 00    	mov    BYTE PTR [rdi+0xe0],al
2686792- 1357779:	0f 10 86 c0 00 00 00 	movups xmm0,XMMWORD PTR [rsi+0xc0]
2686793- 1357780:	0f 10 8e d0 00 00 00 	movups xmm1,XMMWORD PTR [rsi+0xd0]
2686794- 1357787:	0f 11 8f d0 00 00 00 	movups XMMWORD PTR [rdi+0xd0],xmm1
2686795- 135778e:	0f 11 87 c0 00 00 00 	movups XMMWORD PTR [rdi+0xc0],xmm0
2686796- 1357795:	c3                   	ret
2686797- 1357796:	80 bf 90 00 00 00 00 	cmp    BYTE PTR [rdi+0x90],0x0
2686798- 135779d:	74 11                	je     13577b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cd34>
2686799- 135779f:	53                   	push   rbx
2686800- 13577a0:	48 89 fb             	mov    rbx,rdi
2686801- 13577a3:	e8 aa ee ff ff       	call   1356652 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbd6>
2686802- 13577a8:	c6 83 90 00 00 00 00 	mov    BYTE PTR [rbx+0x90],0x0
2686803- 13577af:	5b                   	pop    rbx
2686804- 13577b0:	c3                   	ret
2686805- 13577b1:	cc                   	int3
2686806- 13577b2:	41 56                	push   r14
2686807- 13577b4:	53                   	push   rbx
2686808- 13577b5:	50                   	push   rax
2686809- 13577b6:	48 89 d3             	mov    rbx,rdx
2686810- 13577b9:	4c 8b 37             	mov    r14,QWORD PTR [rdi]
2686811- 13577bc:	41 83 7e 68 00       	cmp    DWORD PTR [r14+0x68],0x0
2686812- 13577c1:	74 14                	je     13577d7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19cd5b>
2686813- 13577c3:	4c 89 f7             	mov    rdi,r14
2686814- 13577c6:	e8 a1 ee ff ff       	call   135666c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19bbf0>
2686815- 13577cb:	8b 03                	mov    eax,DWORD PTR [rbx]
2686816- 13577cd:	41 89 06             	mov    DWORD PTR [r14],eax
2686817- 13577d0:	41 83 66 68 00       	and    DWORD PTR [r14+0x68],0x0
2687004- 13579e9:	41 5e                	pop    r14
2687005- 13579eb:	e9 66 07 00 00       	jmp    1358156 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d6da>
2687006- 13579f0:	49 89 f6             	mov    r14,rsi
2687007- 13579f3:	48 89 f7             	mov    rdi,rsi
2687008- 13579f6:	48 89 de             	mov    rsi,rbx
2687009- 13579f9:	e8 9e e1 eb ff       	call   1215b9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b120>
2687010- 13579fe:	49 8d 7e 48          	lea    rdi,[r14+0x48]
2687011- 1357a02:	48 8d 73 48          	lea    rsi,[rbx+0x48]
2687012- 1357a06:	e8 59 dd 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
2687013- 1357a0b:	49 8d 7e 68          	lea    rdi,[r14+0x68]
2687014- 1357a0f:	48 8d 73 68          	lea    rsi,[rbx+0x68]
2687015- 1357a13:	e8 16 40 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
2687016- 1357a18:	8a 83 80 00 00 00    	mov    al,BYTE PTR [rbx+0x80]
2687017- 1357a1e:	41 88 86 80 00 00 00 	mov    BYTE PTR [r14+0x80],al
2687018- 1357a25:	be 88 00 00 00       	mov    esi,0x88
2687019- 1357a2a:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2687020- 1357a2e:	48 01 de             	add    rsi,rbx
2687021- 1357a31:	e8 f8 3f 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
2687024- 1357a43:	be a8 00 00 00       	mov    esi,0xa8
2687025- 1357a48:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2687026- 1357a4c:	48 01 de             	add    rsi,rbx
2687027- 1357a4f:	e8 cc 03 00 00       	call   1357e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d3a4>
2687028- 1357a54:	8a 83 e0 00 00 00    	mov    al,BYTE PTR [rbx+0xe0]
2687029- 1357a5a:	41 88 86 e0 00 00 00 	mov    BYTE PTR [r14+0xe0],al
2687030- 1357a61:	0f 10 83 c0 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xc0]
2687031- 1357a68:	0f 10 8b d0 00 00 00 	movups xmm1,XMMWORD PTR [rbx+0xd0]
2687032- 1357a6f:	41 0f 11 8e d0 00 00 	movups XMMWORD PTR [r14+0xd0],xmm1
2687033- 1357a76:	00 
2687034- 1357a77:	41 0f 11 86 c0 00 00 	movups XMMWORD PTR [r14+0xc0],xmm0
2687035- 1357a7e:	00 
2687036- 1357a7f:	48 83 c4 08          	add    rsp,0x8
2687037- 1357a83:	5b                   	pop    rbx
2687038- 1357a84:	41 5e                	pop    r14
2687039- 1357a86:	c3                   	ret
2687040- 1357a87:	cc                   	int3
2687041- 1357a88:	41 56                	push   r14
2687042- 1357a8a:	53                   	push   rbx
2687043- 1357a8b:	48 83 ec 18          	sub    rsp,0x18
2687044- 1357a8f:	48 89 d3             	mov    rbx,rdx
2687045- 1357a92:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2687046- 1357a99:	00 00 
2687047- 1357a9b:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
2687048- 1357aa0:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
2687049- 1357aa3:	83 bf 90 02 00 00 01 	cmp    DWORD PTR [rdi+0x290],0x1
2687050- 1357aaa:	75 3e                	jne    1357aea <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d06e>
2687051- 1357aac:	49 89 f6             	mov    r14,rsi
2687069- 1357aea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2687070- 1357af1:	00 00 
2687071- 1357af3:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
2687072- 1357af8:	0f 85 c9 00 00 00    	jne    1357bc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d14b>
2687073- 1357afe:	48 89 de             	mov    rsi,rbx
2687074- 1357b01:	48 83 c4 18          	add    rsp,0x18
2687075- 1357b05:	5b                   	pop    rbx
2687076- 1357b06:	41 5e                	pop    r14
2687077- 1357b08:	e9 6b 05 00 00       	jmp    1358078 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d5fc>
2687078- 1357b0d:	48 89 f7             	mov    rdi,rsi
2687079- 1357b10:	e8 4f cb ec ff       	call   1224664 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x69be8>
2687080- 1357b15:	49 8d 7e 68          	lea    rdi,[r14+0x68]
2687081- 1357b19:	48 8d 73 68          	lea    rsi,[rbx+0x68]
2687082- 1357b1d:	e8 42 dc 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
2687083- 1357b22:	be 88 00 00 00       	mov    esi,0x88
2687084- 1357b27:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2687085- 1357b2b:	48 01 de             	add    rsi,rbx
2687086- 1357b2e:	e8 31 dc 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
2687089- 1357b40:	8a 83 ac 00 00 00    	mov    al,BYTE PTR [rbx+0xac]
2687090- 1357b46:	41 88 86 ac 00 00 00 	mov    BYTE PTR [r14+0xac],al
2687091- 1357b4d:	be b0 00 00 00       	mov    esi,0xb0
2687092- 1357b52:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2687093- 1357b56:	48 01 de             	add    rsi,rbx
2687094- 1357b59:	e8 06 dc 77 ff       	call   ad5764 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x22704>
2687095- 1357b5e:	48 8b 83 d0 00 00 00 	mov    rax,QWORD PTR [rbx+0xd0]
2687096- 1357b65:	48 8b 8b d5 00 00 00 	mov    rcx,QWORD PTR [rbx+0xd5]
2687097- 1357b6c:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
2687098- 1357b73:	49 89 8e d5 00 00 00 	mov    QWORD PTR [r14+0xd5],rcx
2687099- 1357b7a:	be e0 00 00 00       	mov    esi,0xe0
2687100- 1357b7f:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2687101- 1357b83:	48 01 de             	add    rsi,rbx
2687102- 1357b86:	e8 95 02 00 00       	call   1357e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d3a4>
2687103- 1357b8b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2687104- 1357b92:	00 00 
2687105- 1357b94:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
2687106- 1357b99:	75 2c                	jne    1357bc7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d14b>
2687107- 1357b9b:	b8 f8 00 00 00       	mov    eax,0xf8
2687108- 1357ba0:	49 01 c6             	add    r14,rax
2687109- 1357ba3:	48 01 c3             	add    rbx,rax
2687110- 1357ba6:	0f b7 43 20          	movzx  eax,WORD PTR [rbx+0x20]
2687111- 1357baa:	66 41 89 46 20       	mov    WORD PTR [r14+0x20],ax
2687112- 1357baf:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
2687113- 1357bb2:	0f 10 4b 10          	movups xmm1,XMMWORD PTR [rbx+0x10]
2687114- 1357bb6:	41 0f 11 4e 10       	movups XMMWORD PTR [r14+0x10],xmm1
2687115- 1357bbb:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
2687116- 1357bbf:	48 83 c4 18          	add    rsp,0x18
2687218- 1357d41:	0f 85 99 00 00 00    	jne    1357de0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d364>
2687219- 1357d47:	49 89 f6             	mov    r14,rsi
2687220- 1357d4a:	48 89 f7             	mov    rdi,rsi
2687221- 1357d4d:	48 89 de             	mov    rsi,rbx
2687222- 1357d50:	e8 47 de eb ff       	call   1215b9c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5b120>
2687223- 1357d55:	49 8d 7e 48          	lea    rdi,[r14+0x48]
2687224- 1357d59:	48 8d 73 48          	lea    rsi,[rbx+0x48]
2687225- 1357d5d:	e8 cc 3c 72 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
2687226- 1357d62:	0f 10 43 60          	movups xmm0,XMMWORD PTR [rbx+0x60]
2687227- 1357d66:	0f 10 4b 70          	movups xmm1,XMMWORD PTR [rbx+0x70]
2687228- 1357d6a:	0f 10 53 79          	movups xmm2,XMMWORD PTR [rbx+0x79]
2687229- 1357d6e:	41 0f 11 56 79       	movups XMMWORD PTR [r14+0x79],xmm2
2687230- 1357d73:	41 0f 11 4e 70       	movups XMMWORD PTR [r14+0x70],xmm1
2687231- 1357d78:	41 0f 11 46 60       	movups XMMWORD PTR [r14+0x60],xmm0
2687232- 1357d7d:	be 90 00 00 00       	mov    esi,0x90
2687233- 1357d82:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2687234- 1357d86:	48 01 de             	add    rsi,rbx
2687235- 1357d89:	e8 92 00 00 00       	call   1357e20 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d3a4>
2687237- 1357d95:	0f 10 8b b1 00 00 00 	movups xmm1,XMMWORD PTR [rbx+0xb1]
2687238- 1357d9c:	41 0f 11 8e b1 00 00 	movups XMMWORD PTR [r14+0xb1],xmm1
2687239- 1357da3:	00 
2687241- 1357dab:	00 
2687242- 1357dac:	be c8 00 00 00       	mov    esi,0xc8
2687243- 1357db1:	49 8d 3c 36          	lea    rdi,[r14+rsi*1]
2687244- 1357db5:	48 01 de             	add    rsi,rbx
2687245- 1357db8:	e8 9b 00 00 00       	call   1357e58 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d3dc>
2687246- 1357dbd:	48 8b 83 28 01 00 00 	mov    rax,QWORD PTR [rbx+0x128]
2687247- 1357dc4:	49 89 86 28 01 00 00 	mov    QWORD PTR [r14+0x128],rax
2687248- 1357dcb:	8a 83 30 01 00 00    	mov    al,BYTE PTR [rbx+0x130]
2687249- 1357dd1:	41 88 86 30 01 00 00 	mov    BYTE PTR [r14+0x130],al
2687250- 1357dd8:	48 83 c4 08          	add    rsp,0x8
2687251- 1357ddc:	5b                   	pop    rbx
2687252- 1357ddd:	41 5e                	pop    r14
2687253- 1357ddf:	c3                   	ret
2687254- 1357de0:	48 89 de             	mov    rsi,rbx
2687255- 1357de3:	48 83 c4 08          	add    rsp,0x8
2687256- 1357de7:	5b                   	pop    rbx
2687257- 1357de8:	41 5e                	pop    r14
2687258- 1357dea:	e9 01 00 00 00       	jmp    1357df0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19d374>
2687259- 1357def:	cc                   	int3
2687260- 1357df0:	41 56                	push   r14
2687261- 1357df2:	53                   	push   rbx
2687262- 1357df3:	50                   	push   rax
2687263- 1357df4:	48 89 f3             	mov    rbx,rsi
2687264- 1357df7:	49 89 fe             	mov    r14,rdi
2687265- 1357dfa:	e8 57 c6 ec ff       	call   1224456 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x699da>
2687266- 1357dff:	4c 89 f7             	mov    rdi,r14
2687267- 1357e02:	48 89 de             	mov    rsi,rbx
2687268- 1357e05:	e8 40 22 ed ff       	call   122a04a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6f5ce>
2687851- 13585a6:	48 09 c3             	or     rbx,rax
2687852- 13585a9:	48 89 d8             	mov    rax,rbx
2687853- 13585ac:	48 83 c4 20          	add    rsp,0x20
2687854- 13585b0:	5b                   	pop    rbx
2687855- 13585b1:	41 5e                	pop    r14
2687856- 13585b3:	41 5f                	pop    r15
2687857- 13585b5:	c3                   	ret
2687858- 13585b6:	e8 f5 74 49 00       	call   17efab0 <__stack_chk_fail@plt>
2687859- 13585bb:	cc                   	int3
2687860- 13585bc:	55                   	push   rbp
2687861- 13585bd:	41 57                	push   r15
2687862- 13585bf:	41 56                	push   r14
2687863- 13585c1:	41 55                	push   r13
2687864- 13585c3:	41 54                	push   r12
2687865- 13585c5:	53                   	push   rbx
2687866- 13585c6:	48 81 ec a8 00 00 00 	sub    rsp,0xa8
2687867- 13585cd:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2687868- 13585d4:	00 00 
2687870- 13585dd:	00 
2687871- 13585de:	80 bf d9 04 00 00 00 	cmp    BYTE PTR [rdi+0x4d9],0x0
2687872- 13585e5:	0f 85 8d 00 00 00    	jne    1358678 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dbfc>
2687873- 13585eb:	44 89 c3             	mov    ebx,r8d
2687874- 13585ee:	49 89 f5             	mov    r13,rsi
2687875- 13585f1:	49 89 fc             	mov    r12,rdi
2687876- 13585f4:	48 89 14 24          	mov    QWORD PTR [rsp],rdx
2687877- 13585f8:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
2687878- 13585fd:	c6 87 d9 04 00 00 01 	mov    BYTE PTR [rdi+0x4d9],0x1
2687879- 1358604:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
2687880- 1358609:	4c 89 e6             	mov    rsi,r12
2687881- 135860c:	e8 c9 fe ff ff       	call   13584da <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19da5e>
2687882- 1358611:	4c 89 e7             	mov    rdi,r12
2687883- 1358614:	e8 f1 fe ff ff       	call   135850a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19da8e>
2687884- 1358619:	48 89 c1             	mov    rcx,rax
2687885- 135861c:	48 c1 e9 20          	shr    rcx,0x20
2687886- 1358620:	0f 45 d8             	cmovne ebx,eax
2687887- 1358623:	4d 8b 75 00          	mov    r14,QWORD PTR [r13+0x0]
2687888- 1358627:	4d 8b 7d 08          	mov    r15,QWORD PTR [r13+0x8]
2687889- 135862b:	4d 39 fe             	cmp    r14,r15
2687890- 135862e:	74 3e                	je     135866e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19dbf2>
2687891- 1358630:	4d 8d ac 24 20 03 00 	lea    r13,[r12+0x320]
2687892- 1358637:	00 
2687893- 1358638:	49 8d ac 24 98 02 00 	lea    rbp,[r12+0x298]
2687894- 135863f:	00 
2687895- 1358640:	49 8b 3e             	mov    rdi,QWORD PTR [r14]
2687896- 1358643:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2687897- 1358646:	48 8b 40 48          	mov    rax,QWORD PTR [rax+0x48]
2688059- 135887b:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
2688060- 1358880:	48 89 06             	mov    QWORD PTR [rsi],rax
2688061- 1358883:	48 89 56 08          	mov    QWORD PTR [rsi+0x8],rdx
2688062- 1358887:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
2688063- 135888b:	48 8d 94 24 d0 01 00 	lea    rdx,[rsp+0x1d0]
2688064- 1358892:	00 
2688065- 1358893:	4c 89 e7             	mov    rdi,r12
2688066- 1358896:	ff 50 18             	call   QWORD PTR [rax+0x18]
2688067- 1358899:	48 8d bc 24 d8 00 00 	lea    rdi,[rsp+0xd8]
2688068- 13588a0:	00 
2688069- 13588a1:	e8 ea 55 49 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
2688070- 13588a6:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
2688071- 13588ad:	00 
2688072- 13588ae:	e8 eb 2a 2d 00       	call   162b39e <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2650c>
2688073- 13588b3:	48 8d bc 24 c8 00 00 	lea    rdi,[rsp+0xc8]
2688074- 13588ba:	00 
2688075- 13588bb:	48 89 de             	mov    rsi,rbx
2688076- 13588be:	e8 db 0b 00 00       	call   135949e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ea22>
2688078- 13588ca:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2688079- 13588cf:	e8 cc 0d 00 00       	call   13596a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ec24>
2688080- 13588d4:	4c 8d 6c 24 38       	lea    r13,[rsp+0x38]
2688081- 13588d9:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
2688082- 13588de:	4c 89 ef             	mov    rdi,r13
2688083- 13588e1:	e8 d4 0d 00 00       	call   13596ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ec3e>
2688084- 13588e6:	4c 8d 6c 24 68       	lea    r13,[rsp+0x68]
2688085- 13588eb:	48 8d ab 90 00 00 00 	lea    rbp,[rbx+0x90]
2688086- 13588f2:	4c 89 ef             	mov    rdi,r13
2688087- 13588f5:	48 89 ee             	mov    rsi,rbp
2688088- 13588f8:	e8 f7 0d 00 00       	call   13596f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ec78>
2688089- 13588fd:	4c 8d ac 24 98 00 00 	lea    r13,[rsp+0x98]
2688090- 1358904:	00 
2688091- 1358905:	4c 89 ef             	mov    rdi,r13
2688092- 1358908:	48 89 ee             	mov    rsi,rbp
2688093- 135890b:	e8 22 0e 00 00       	call   1359732 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ecb6>
2688094- 1358910:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2688095- 1358915:	48 8d 74 24 38       	lea    rsi,[rsp+0x38]
2688096- 135891a:	6a 03                	push   0x3
2688097- 135891c:	5a                   	pop    rdx
2688098- 135891d:	e8 64 0b 7f ff       	call   b49486 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96426>
2688099- 1358922:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
2688100- 1358929:	00 
2688101- 135892a:	48 8d 8c 24 c8 00 00 	lea    rcx,[rsp+0xc8]
2688102- 1358931:	00 
2688103- 1358932:	4c 8d 44 24 20       	lea    r8,[rsp+0x20]
2688104- 1358937:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
2688105- 135893b:	4c 89 fa             	mov    rdx,r15
2688218- 1358ad7:	41 57                	push   r15
2688219- 1358ad9:	41 56                	push   r14
2688220- 1358adb:	41 55                	push   r13
2688221- 1358add:	41 54                	push   r12
2688222- 1358adf:	53                   	push   rbx
2688223- 1358ae0:	48 81 ec 48 06 00 00 	sub    rsp,0x648
2688224- 1358ae7:	4d 89 c6             	mov    r14,r8
2688225- 1358aea:	49 89 cc             	mov    r12,rcx
2688226- 1358aed:	49 89 d5             	mov    r13,rdx
2688227- 1358af0:	49 89 ff             	mov    r15,rdi
2688228- 1358af3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2688229- 1358afa:	00 00 
2688230- 1358afc:	48 89 84 24 40 06 00 	mov    QWORD PTR [rsp+0x640],rax
2688231- 1358b03:	00 
2688232- 1358b04:	48 8d bc 24 38 05 00 	lea    rdi,[rsp+0x538]
2688233- 1358b0b:	00 
2688234- 1358b0c:	4c 89 c6             	mov    rsi,r8
2688235- 1358b0f:	e8 8a 09 00 00       	call   135949e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ea22>
2688237- 1358b1b:	00 
2688238- 1358b1c:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
2688239- 1358b21:	e8 7a 0b 00 00       	call   13596a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ec24>
2688240- 1358b26:	48 8d 9c 24 a8 04 00 	lea    rbx,[rsp+0x4a8]
2688241- 1358b2d:	00 
2688242- 1358b2e:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
2688243- 1358b33:	48 89 df             	mov    rdi,rbx
2688244- 1358b36:	e8 7f 0b 00 00       	call   13596ba <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ec3e>
2688245- 1358b3b:	48 8d 9c 24 d8 04 00 	lea    rbx,[rsp+0x4d8]
2688246- 1358b42:	00 
2688247- 1358b43:	49 8d ae 90 00 00 00 	lea    rbp,[r14+0x90]
2688248- 1358b4a:	48 89 df             	mov    rdi,rbx
2688249- 1358b4d:	48 89 ee             	mov    rsi,rbp
2688250- 1358b50:	e8 9f 0b 00 00       	call   13596f4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ec78>
2688251- 1358b55:	48 8d 9c 24 08 05 00 	lea    rbx,[rsp+0x508]
2688252- 1358b5c:	00 
2688253- 1358b5d:	48 89 df             	mov    rdi,rbx
2688254- 1358b60:	48 89 ee             	mov    rsi,rbp
2688255- 1358b63:	e8 ca 0b 00 00       	call   1359732 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19ecb6>
2688256- 1358b68:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
2688257- 1358b6d:	48 8d b4 24 a8 04 00 	lea    rsi,[rsp+0x4a8]
2688258- 1358b74:	00 
2688259- 1358b75:	6a 03                	push   0x3
2688260- 1358b77:	5a                   	pop    rdx
2688261- 1358b78:	e8 09 09 7f ff       	call   b49486 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96426>
2688262- 1358b7d:	48 8d 7c 24 38       	lea    rdi,[rsp+0x38]
2688263- 1358b82:	48 8d 8c 24 38 05 00 	lea    rcx,[rsp+0x538]
2688264- 1358b89:	00 
2689865- 135a272:	0f 11 45 00          	movups XMMWORD PTR [rbp+0x0],xmm0
2689866- 135a276:	49 8d be a8 00 00 00 	lea    rdi,[r14+0xa8]
2689867- 135a27d:	48 8d 73 30          	lea    rsi,[rbx+0x30]
2689868- 135a281:	e8 fa 3d 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
2689869- 135a286:	8b 43 48             	mov    eax,DWORD PTR [rbx+0x48]
2689870- 135a289:	41 89 86 c0 00 00 00 	mov    DWORD PTR [r14+0xc0],eax
2689871- 135a290:	48 8d 73 50          	lea    rsi,[rbx+0x50]
2689872- 135a294:	4c 89 ef             	mov    rdi,r13
2689873- 135a297:	e8 e4 3d 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
2689874- 135a29c:	49 8d be e0 00 00 00 	lea    rdi,[r14+0xe0]
2689875- 135a2a3:	48 8d 73 68          	lea    rsi,[rbx+0x68]
2689876- 135a2a7:	e8 d4 3d 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
2689877- 135a2ac:	0f 10 83 80 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0x80]
2689878- 135a2b3:	41 0f 11 86 f8 00 00 	movups XMMWORD PTR [r14+0xf8],xmm0
2689879- 135a2ba:	00 
2689880- 135a2bb:	49 8d be 08 01 00 00 	lea    rdi,[r14+0x108]
2689881- 135a2c2:	48 8d b3 90 00 00 00 	lea    rsi,[rbx+0x90]
2689882- 135a2c9:	e8 b2 3d 49 00       	call   17ee080 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_@plt>
2689884- 135a2d5:	49 89 86 20 01 00 00 	mov    QWORD PTR [r14+0x120],rax
2689885- 135a2dc:	49 8d be 28 01 00 00 	lea    rdi,[r14+0x128]
2689886- 135a2e3:	48 8d b3 b0 00 00 00 	lea    rsi,[rbx+0xb0]
2689887- 135a2ea:	e8 6b b1 77 ff       	call   ad545a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x223fa>
2689888- 135a2ef:	0f 10 83 d0 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xd0]
2689889- 135a2f6:	0f 10 8b d9 00 00 00 	movups xmm1,XMMWORD PTR [rbx+0xd9]
2689890- 135a2fd:	41 0f 11 8e 51 01 00 	movups XMMWORD PTR [r14+0x151],xmm1
2689891- 135a304:	00 
2689892- 135a305:	41 0f 11 86 48 01 00 	movups XMMWORD PTR [r14+0x148],xmm0
2689893- 135a30c:	00 
2689894- 135a30d:	49 81 c6 68 01 00 00 	add    r14,0x168
2689895- 135a314:	0f 10 83 f0 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xf0]
2689896- 135a31b:	4c 89 f7             	mov    rdi,r14
2689897- 135a31e:	e8 13 48 78 ff       	call   adeb36 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2bad6>
2689898- 135a323:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
2689899- 135a32a:	00 00 
2689900- 135a32c:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
2689901- 135a331:	75 0f                	jne    135a342 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19f8c6>
2689902- 135a333:	48 83 c4 68          	add    rsp,0x68
2689903- 135a337:	5b                   	pop    rbx
2689904- 135a338:	41 5c                	pop    r12
2689905- 135a33a:	41 5d                	pop    r13
2689906- 135a33c:	41 5e                	pop    r14
2689907- 135a33e:	41 5f                	pop    r15
2689908- 135a340:	5d                   	pop    rbp
2689909- 135a341:	c3                   	ret
2689910- 135a342:	e8 69 57 49 00       	call   17efab0 <__stack_chk_fail@plt>
2689911- 135a347:	cc                   	int3
2690261- 135a774:	48 89 84 24 10 0d 00 	mov    QWORD PTR [rsp+0xd10],rax
2690262- 135a77b:	00 
2690263- 135a77c:	48 89 cf             	mov    rdi,rcx
2690264- 135a77f:	e8 fa b7 82 ff       	call   b85f7e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd2f1e>
2690265- 135a784:	49 89 c6             	mov    r14,rax
2690266- 135a787:	48 89 df             	mov    rdi,rbx
2690267- 135a78a:	e8 11 8b 80 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
2690268- 135a78f:	49 8b 4c 24 20       	mov    rcx,QWORD PTR [r12+0x20]
2690269- 135a794:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
2690270- 135a799:	4d 8b 7c 24 68       	mov    r15,QWORD PTR [r12+0x68]
2690271- 135a79e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
2690272- 135a7a1:	48 89 c7             	mov    rdi,rax
2690273- 135a7a4:	ff 51 28             	call   QWORD PTR [rcx+0x28]
2690274- 135a7a7:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
2690275- 135a7ac:	4d 8b 6c 24 30       	mov    r13,QWORD PTR [r12+0x30]
2690276- 135a7b1:	49 8b 44 24 40       	mov    rax,QWORD PTR [r12+0x40]
2690277- 135a7b6:	48 89 84 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rax
2690278- 135a7bd:	00 
2690280- 135a7c5:	00 
2690281- 135a7c6:	49 8b 84 24 80 00 00 	mov    rax,QWORD PTR [r12+0x80]
2690282- 135a7cd:	00 
2690283- 135a7ce:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
2690284- 135a7d3:	bf e0 00 00 00       	mov    edi,0xe0
2690285- 135a7d8:	e8 23 37 49 00       	call   17edf00 <_Znwm@plt>
2690286- 135a7dd:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
2690287- 135a7e1:	48 8d 0d 40 d3 50 00 	lea    rcx,[rip+0x50d340]        # 1867b28 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24210>
2690288- 135a7e8:	48 89 08             	mov    QWORD PTR [rax],rcx
2690289- 135a7eb:	66 0f ef c0          	pxor   xmm0,xmm0
2690290- 135a7ef:	66 0f 7f 40 10       	movdqa XMMWORD PTR [rax+0x10],xmm0
2690291- 135a7f4:	66 c7 40 20 00 01    	mov    WORD PTR [rax+0x20],0x100
2690292- 135a7fa:	48 8d 48 28          	lea    rcx,[rax+0x28]
2690293- 135a7fe:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
2690294- 135a803:	48 8d 48 50          	lea    rcx,[rax+0x50]
2690295- 135a807:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
2690296- 135a80e:	00 
2690297- 135a80f:	48 83 a0 90 00 00 00 	and    QWORD PTR [rax+0x90],0x0
2690298- 135a816:	00 
2690299- 135a817:	48 83 a0 c0 00 00 00 	and    QWORD PTR [rax+0xc0],0x0
2690300- 135a81e:	00 
2690301- 135a81f:	48 8d a8 d0 00 00 00 	lea    rbp,[rax+0xd0]
2690302- 135a826:	48 83 a0 d0 00 00 00 	and    QWORD PTR [rax+0xd0],0x0
2690303- 135a82d:	00 
2690304- 135a82e:	f3 0f 7f 40 28       	movdqu XMMWORD PTR [rax+0x28],xmm0
2690305- 135a833:	f3 0f 7f 40 38       	movdqu XMMWORD PTR [rax+0x38],xmm0
2690306- 135a838:	f3 0f 7f 40 48       	movdqu XMMWORD PTR [rax+0x48],xmm0
2690307- 135a83d:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
2690422- 135aa02:	49 8b 06             	mov    rax,QWORD PTR [r14]
2690423- 135aa05:	4c 89 f7             	mov    rdi,r14
2690424- 135aa08:	ff 50 28             	call   QWORD PTR [rax+0x28]
2690425- 135aa0b:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
2690426- 135aa12:	00 
2690427- 135aa13:	49 8b 06             	mov    rax,QWORD PTR [r14]
2690428- 135aa16:	4c 89 f7             	mov    rdi,r14
2690429- 135aa19:	ff 50 28             	call   QWORD PTR [rax+0x28]
2690430- 135aa1c:	49 89 c7             	mov    r15,rax
2690431- 135aa1f:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
2690432- 135aa24:	48 8b 00             	mov    rax,QWORD PTR [rax]
2690433- 135aa27:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
2690434- 135aa2c:	49 8b 06             	mov    rax,QWORD PTR [r14]
2690435- 135aa2f:	4c 89 f7             	mov    rdi,r14
2690436- 135aa32:	ff 50 28             	call   QWORD PTR [rax+0x28]
2690437- 135aa35:	49 8b 06             	mov    rax,QWORD PTR [r14]
2690438- 135aa38:	4c 89 f7             	mov    rdi,r14
2690439- 135aa3b:	ff 50 28             	call   QWORD PTR [rax+0x28]
2690441- 135aa45:	00 
2690442- 135aa46:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
2690443- 135aa4b:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
2690444- 135aa4e:	48 8d 35 9b b0 0d ff 	lea    rsi,[rip+0xffffffffff0db09b]        # 435af0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b53f>
2690445- 135aa55:	48 8d 0d b4 b0 0d ff 	lea    rcx,[rip+0xffffffffff0db0b4]        # 435b10 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b55f>
2690446- 135aa5c:	6a 10                	push   0x10
2690447- 135aa5e:	41 5e                	pop    r14
2690448- 135aa60:	6a 29                	push   0x29
2690449- 135aa62:	41 58                	pop    r8
2690450- 135aa64:	4c 89 f2             	mov    rdx,r14
2690451- 135aa67:	45 31 c9             	xor    r9d,r9d
2690452- 135aa6a:	e8 ef ca 28 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
2690453- 135aa6f:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
2690454- 135aa72:	48 8d 35 a7 b1 0d ff 	lea    rsi,[rip+0xffffffffff0db1a7]        # 435c20 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b66f>
2690455- 135aa79:	48 8d 0d c0 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db1c0]        # 435c40 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b68f>
2690456- 135aa80:	6a 1a                	push   0x1a
2690457- 135aa82:	41 58                	pop    r8
2690458- 135aa84:	4c 89 f2             	mov    rdx,r14
2690459- 135aa87:	45 31 c9             	xor    r9d,r9d
2690460- 135aa8a:	68 80 96 98 00       	push   0x989680
2690461- 135aa8f:	6a 00                	push   0x0
2690462- 135aa91:	e8 5c cb 28 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
2690463- 135aa96:	48 83 c4 10          	add    rsp,0x10
2690464- 135aa9a:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
2690465- 135aa9d:	48 8d 35 bc b1 0d ff 	lea    rsi,[rip+0xffffffffff0db1bc]        # 435c60 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6af>
2690466- 135aaa4:	48 8d 0d d5 b1 0d ff 	lea    rcx,[rip+0xffffffffff0db1d5]        # 435c80 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5b6cf>
2690467- 135aaab:	6a 1b                	push   0x1b
2690468- 135aaad:	41 58                	pop    r8
2690929- 135b263:	48 85 c0             	test   rax,rax
2690930- 135b266:	74 05                	je     135b26d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a07f1>
2690931- 135b268:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2690932- 135b26d:	48 8b 84 24 08 01 00 	mov    rax,QWORD PTR [rsp+0x108]
2690933- 135b274:	00 
2690934- 135b275:	0f 28 84 24 00 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x100]
2690935- 135b27c:	00 
2690936- 135b27d:	0f 29 84 24 90 02 00 	movaps XMMWORD PTR [rsp+0x290],xmm0
2690937- 135b284:	00 
2690938- 135b285:	48 85 c0             	test   rax,rax
2690939- 135b288:	74 05                	je     135b28f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0813>
2690940- 135b28a:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2690941- 135b28f:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
2690942- 135b294:	48 89 84 24 a0 02 00 	mov    QWORD PTR [rsp+0x2a0],rax
2690943- 135b29b:	00 
2690944- 135b29c:	48 8b 44 24 58       	mov    rax,QWORD PTR [rsp+0x58]
2690945- 135b2a1:	48 89 84 24 a8 02 00 	mov    QWORD PTR [rsp+0x2a8],rax
2690946- 135b2a8:	00 
2690948- 135b2b0:	00 
2690949- 135b2b1:	48 8b 41 48          	mov    rax,QWORD PTR [rcx+0x48]
2690950- 135b2b5:	66 0f 6f 41 40       	movdqa xmm0,XMMWORD PTR [rcx+0x40]
2690951- 135b2ba:	66 0f 7f 84 24 b0 02 	movdqa XMMWORD PTR [rsp+0x2b0],xmm0
2690952- 135b2c1:	00 00 
2690953- 135b2c3:	48 85 c0             	test   rax,rax
2690954- 135b2c6:	74 05                	je     135b2cd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a0851>
2690955- 135b2c8:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2690956- 135b2cd:	4c 8d bc 24 c0 02 00 	lea    r15,[rsp+0x2c0]
2690957- 135b2d4:	00 
2690958- 135b2d5:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
2690959- 135b2dc:	00 
2690960- 135b2dd:	4c 89 ff             	mov    rdi,r15
2690961- 135b2e0:	e8 c3 16 10 00       	call   145c9a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2a1f2c>
2690962- 135b2e5:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
2690963- 135b2ea:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
2690964- 135b2ee:	48 8b 44 24 68       	mov    rax,QWORD PTR [rsp+0x68]
2690965- 135b2f3:	49 89 47 38          	mov    QWORD PTR [r15+0x38],rax
2690966- 135b2f7:	49 89 6f 40          	mov    QWORD PTR [r15+0x40],rbp
2690967- 135b2fb:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
2690968- 135b300:	49 89 47 48          	mov    QWORD PTR [r15+0x48],rax
2690969- 135b304:	48 83 a4 24 b0 01 00 	and    QWORD PTR [rsp+0x1b0],0x0
2690970- 135b30b:	00 00 
2690971- 135b30d:	bf f0 00 00 00       	mov    edi,0xf0
2690972- 135b312:	e8 e9 2b 49 00       	call   17edf00 <_Znwm@plt>
2690973- 135b317:	49 89 c5             	mov    r13,rax
2690974- 135b31a:	48 8d 05 87 93 51 00 	lea    rax,[rip+0x519387]        # 18746a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x30d90>
2690975- 135b321:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
2691471- 135ba8c:	0f b6 d2             	movzx  edx,dl
2691472- 135ba8f:	4c 89 ff             	mov    rdi,r15
2691473- 135ba92:	4c 89 ee             	mov    rsi,r13
2691474- 135ba95:	48 89 c3             	mov    rbx,rax
2691475- 135ba98:	e8 af c1 16 00       	call   14c7c4c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30d1d0>
2691476- 135ba9d:	48 8d bc 24 30 02 00 	lea    rdi,[rsp+0x230]
2691477- 135baa4:	00 
2691478- 135baa5:	e8 c0 e4 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
2691479- 135baaa:	31 ff                	xor    edi,edi
2691480- 135baac:	e8 6b 29 74 ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
2691481- 135bab1:	48 8d bc 24 a8 01 00 	lea    rdi,[rsp+0x1a8]
2691482- 135bab8:	00 
2691483- 135bab9:	e8 6a fc 71 ff       	call   a7b728 <JNI_OnUnload@@Base+0x2ff5>
2691484- 135babe:	48 8d 35 82 4f 00 ff 	lea    rsi,[rip+0xffffffffff004f82]        # 360a47 <_ZTSSt12bad_any_cast@@Base-0x2f781>
2691485- 135bac5:	48 8d bc 24 18 02 00 	lea    rdi,[rsp+0x218]
2691486- 135bacc:	00 
2691487- 135bacd:	48 89 5c 24 10       	mov    QWORD PTR [rsp+0x10],rbx
2691488- 135bad2:	e8 a7 df 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2691490- 135bade:	00 
2691491- 135badf:	4c 89 b4 24 90 01 00 	mov    QWORD PTR [rsp+0x190],r14
2691492- 135bae6:	00 
2691493- 135bae7:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
2691494- 135baeb:	41 0f 28 46 30       	movaps xmm0,XMMWORD PTR [r14+0x30]
2691495- 135baf0:	0f 11 84 24 98 01 00 	movups XMMWORD PTR [rsp+0x198],xmm0
2691496- 135baf7:	00 
2691497- 135baf8:	48 85 c0             	test   rax,rax
2691498- 135bafb:	74 05                	je     135bb02 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a1086>
2691499- 135bafd:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2691500- 135bb02:	4c 89 bc 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],r15
2691501- 135bb09:	00 
2691502- 135bb0a:	48 89 9c 24 b0 01 00 	mov    QWORD PTR [rsp+0x1b0],rbx
2691503- 135bb11:	00 
2691504- 135bb12:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
2691505- 135bb17:	4c 8b ac 24 f0 00 00 	mov    r13,QWORD PTR [rsp+0xf0]
2691506- 135bb1e:	00 
2691507- 135bb1f:	48 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [rsp+0xf8]
2691508- 135bb26:	00 
2691509- 135bb27:	4c 89 ac 24 b8 01 00 	mov    QWORD PTR [rsp+0x1b8],r13
2691510- 135bb2e:	00 
2691511- 135bb2f:	48 89 84 24 c0 01 00 	mov    QWORD PTR [rsp+0x1c0],rax
2691512- 135bb36:	00 
2691513- 135bb37:	48 85 c0             	test   rax,rax
2691514- 135bb3a:	74 05                	je     135bb41 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a10c5>
2691515- 135bb3c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2691516- 135bb41:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
2691517- 135bb46:	48 89 84 24 c8 01 00 	mov    QWORD PTR [rsp+0x1c8],rax
2692501- 135c9d6:	00 
2692502- 135c9d7:	4c 89 ff             	mov    rdi,r15
2692503- 135c9da:	e8 dd 8f d1 ff       	call   10759bc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x23cdd2>
2692504- 135c9df:	48 89 84 24 70 01 00 	mov    QWORD PTR [rsp+0x170],rax
2692505- 135c9e6:	00 
2692506- 135c9e7:	41 8a 44 24 11       	mov    al,BYTE PTR [r12+0x11]
2692507- 135c9ec:	88 84 24 30 02 00 00 	mov    BYTE PTR [rsp+0x230],al
2692508- 135c9f3:	41 8a 44 24 14       	mov    al,BYTE PTR [r12+0x14]
2692509- 135c9f8:	88 84 24 31 02 00 00 	mov    BYTE PTR [rsp+0x231],al
2692510- 135c9ff:	41 8a 84 24 9a 00 00 	mov    al,BYTE PTR [r12+0x9a]
2692511- 135ca06:	00 
2692512- 135ca07:	88 84 24 32 02 00 00 	mov    BYTE PTR [rsp+0x232],al
2692513- 135ca0e:	41 8a 84 24 9b 00 00 	mov    al,BYTE PTR [r12+0x9b]
2692514- 135ca15:	00 
2692515- 135ca16:	88 84 24 33 02 00 00 	mov    BYTE PTR [rsp+0x233],al
2692516- 135ca1d:	41 8a 84 24 9c 00 00 	mov    al,BYTE PTR [r12+0x9c]
2692517- 135ca24:	00 
2692518- 135ca25:	88 84 24 34 02 00 00 	mov    BYTE PTR [rsp+0x234],al
2692520- 135ca33:	00 
2692521- 135ca34:	48 89 84 24 38 02 00 	mov    QWORD PTR [rsp+0x238],rax
2692522- 135ca3b:	00 
2692523- 135ca3c:	41 0f 10 44 24 20    	movups xmm0,XMMWORD PTR [r12+0x20]
2692524- 135ca42:	0f 11 84 24 40 02 00 	movups XMMWORD PTR [rsp+0x240],xmm0
2692525- 135ca49:	00 
2692526- 135ca4a:	41 0f 10 44 24 30    	movups xmm0,XMMWORD PTR [r12+0x30]
2692527- 135ca50:	0f 11 84 24 50 02 00 	movups XMMWORD PTR [rsp+0x250],xmm0
2692528- 135ca57:	00 
2692529- 135ca58:	41 0f 10 44 24 40    	movups xmm0,XMMWORD PTR [r12+0x40]
2692530- 135ca5e:	0f 11 84 24 60 02 00 	movups XMMWORD PTR [rsp+0x260],xmm0
2692531- 135ca65:	00 
2692532- 135ca66:	41 0f 10 44 24 50    	movups xmm0,XMMWORD PTR [r12+0x50]
2692533- 135ca6c:	0f 11 84 24 70 02 00 	movups XMMWORD PTR [rsp+0x270],xmm0
2692534- 135ca73:	00 
2692535- 135ca74:	4c 8b 7d 20          	mov    r15,QWORD PTR [rbp+0x20]
2692536- 135ca78:	49 8b 45 18          	mov    rax,QWORD PTR [r13+0x18]
2692537- 135ca7c:	41 0f 10 45 10       	movups xmm0,XMMWORD PTR [r13+0x10]
2692538- 135ca81:	0f 29 84 24 20 02 00 	movaps XMMWORD PTR [rsp+0x220],xmm0
2692539- 135ca88:	00 
2692540- 135ca89:	48 85 c0             	test   rax,rax
2692541- 135ca8c:	74 05                	je     135ca93 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a2017>
2692542- 135ca8e:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2692543- 135ca93:	4c 8b 65 40          	mov    r12,QWORD PTR [rbp+0x40]
2692544- 135ca97:	4c 8b 6d 30          	mov    r13,QWORD PTR [rbp+0x30]
2692545- 135ca9b:	48 8b 7d 38          	mov    rdi,QWORD PTR [rbp+0x38]
2692546- 135ca9f:	48 8b 85 90 00 00 00 	mov    rax,QWORD PTR [rbp+0x90]
2692547- 135caa6:	48 89 84 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rax
2692707- 135cd19:	0f 11 94 24 e8 00 00 	movups XMMWORD PTR [rsp+0xe8],xmm2
2692708- 135cd20:	00 
2692709- 135cd21:	0f 11 8c 24 d8 00 00 	movups XMMWORD PTR [rsp+0xd8],xmm1
2692710- 135cd28:	00 
2692711- 135cd29:	0f 11 84 24 c8 00 00 	movups XMMWORD PTR [rsp+0xc8],xmm0
2692712- 135cd30:	00 
2692713- 135cd31:	4c 89 84 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r8
2692714- 135cd38:	00 
2692715- 135cd39:	48 89 8c 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rcx
2692716- 135cd40:	00 
2692717- 135cd41:	48 89 94 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rdx
2692718- 135cd48:	00 
2692719- 135cd49:	48 8b 8c 24 78 01 00 	mov    rcx,QWORD PTR [rsp+0x178]
2692720- 135cd50:	00 
2692721- 135cd51:	48 89 8c 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rcx
2692722- 135cd58:	00 
2692723- 135cd59:	48 8b 8c 24 28 01 00 	mov    rcx,QWORD PTR [rsp+0x128]
2692724- 135cd60:	00 
2692726- 135cd68:	00 
2692727- 135cd69:	48 8b 8c 24 18 01 00 	mov    rcx,QWORD PTR [rsp+0x118]
2692728- 135cd70:	00 
2692730- 135cd78:	00 
2692731- 135cd79:	48 8b 8c 24 30 01 00 	mov    rcx,QWORD PTR [rsp+0x130]
2692732- 135cd80:	00 
2692733- 135cd81:	48 89 8c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rcx
2692734- 135cd88:	00 
2692735- 135cd89:	48 8d 8c 24 e8 01 00 	lea    rcx,[rsp+0x1e8]
2692736- 135cd90:	00 
2692737- 135cd91:	48 89 8c 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rcx
2692738- 135cd98:	00 
2692739- 135cd99:	48 8d 8c 24 00 02 00 	lea    rcx,[rsp+0x200]
2692740- 135cda0:	00 
2692741- 135cda1:	48 89 8c 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rcx
2692742- 135cda8:	00 
2692743- 135cda9:	48 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rsi
2692744- 135cdb0:	00 
2692745- 135cdb1:	4c 89 64 24 78       	mov    QWORD PTR [rsp+0x78],r12
2692746- 135cdb6:	4c 89 7c 24 70       	mov    QWORD PTR [rsp+0x70],r15
2692747- 135cdbb:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
2692748- 135cdc0:	48 8b 84 24 38 01 00 	mov    rax,QWORD PTR [rsp+0x138]
2692749- 135cdc7:	00 
2692750- 135cdc8:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
2692751- 135cdcd:	48 8b 84 24 80 01 00 	mov    rax,QWORD PTR [rsp+0x180]
2692752- 135cdd4:	00 
2692753- 135cdd5:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
2692754- 135cdda:	48 8b 84 24 20 01 00 	mov    rax,QWORD PTR [rsp+0x120]
2692755- 135cde1:	00 
2692756- 135cde2:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2692757- 135cde7:	48 8b 84 24 90 01 00 	mov    rax,QWORD PTR [rsp+0x190]
2692931- 135d07f:	00 
2692932- 135d080:	31 c0                	xor    eax,eax
2692933- 135d082:	88 47 08             	mov    BYTE PTR [rdi+0x8],al
2692934- 135d085:	4c 8d 05 0c ac 50 00 	lea    r8,[rip+0x50ac0c]        # 1867c98 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24380>
2692935- 135d08c:	4c 89 07             	mov    QWORD PTR [rdi],r8
2692936- 135d08f:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
2692937- 135d094:	88 47 18             	mov    BYTE PTR [rdi+0x18],al
2692938- 135d097:	88 47 50             	mov    BYTE PTR [rdi+0x50],al
2692939- 135d09a:	88 47 68             	mov    BYTE PTR [rdi+0x68],al
2692940- 135d09d:	83 67 78 00          	and    DWORD PTR [rdi+0x78],0x0
2692941- 135d0a1:	66 0f ef c0          	pxor   xmm0,xmm0
2692942- 135d0a5:	f3 0f 7f 47 20       	movdqu XMMWORD PTR [rdi+0x20],xmm0
2692943- 135d0aa:	f3 0f 7f 47 30       	movdqu XMMWORD PTR [rdi+0x30],xmm0
2692944- 135d0af:	f3 0f 7f 47 3d       	movdqu XMMWORD PTR [rdi+0x3d],xmm0
2692945- 135d0b4:	f3 0f 7f 87 80 00 00 	movdqu XMMWORD PTR [rdi+0x80],xmm0
2692946- 135d0bb:	00 
2692947- 135d0bc:	f3 0f 7f 87 90 00 00 	movdqu XMMWORD PTR [rdi+0x90],xmm0
2692948- 135d0c3:	00 
2692950- 135d0cb:	00 
2692951- 135d0cc:	f3 0f 7f 87 b0 00 00 	movdqu XMMWORD PTR [rdi+0xb0],xmm0
2692952- 135d0d3:	00 
2692953- 135d0d4:	f3 0f 7f 87 c0 00 00 	movdqu XMMWORD PTR [rdi+0xc0],xmm0
2692954- 135d0db:	00 
2692955- 135d0dc:	f3 0f 7f 87 d0 00 00 	movdqu XMMWORD PTR [rdi+0xd0],xmm0
2692956- 135d0e3:	00 
2692957- 135d0e4:	f3 0f 7f 87 e0 00 00 	movdqu XMMWORD PTR [rdi+0xe0],xmm0
2692958- 135d0eb:	00 
2692959- 135d0ec:	38 06                	cmp    BYTE PTR [rsi],al
2692960- 135d0ee:	0f 84 1d 30 00 00    	je     1360111 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a5695>
2692961- 135d0f4:	48 89 f5             	mov    rbp,rsi
2692962- 135d0f7:	48 89 4c 24 70       	mov    QWORD PTR [rsp+0x70],rcx
2692963- 135d0fc:	48 89 54 24 30       	mov    QWORD PTR [rsp+0x30],rdx
2692964- 135d101:	48 8b 8c 24 88 10 00 	mov    rcx,QWORD PTR [rsp+0x1088]
2692965- 135d108:	00 
2692966- 135d109:	4c 8d 6f 10          	lea    r13,[rdi+0x10]
2692967- 135d10d:	48 8d 47 20          	lea    rax,[rdi+0x20]
2692968- 135d111:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
2692969- 135d118:	00 
2692970- 135d119:	48 8d 87 80 00 00 00 	lea    rax,[rdi+0x80]
2692971- 135d120:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax
2692972- 135d127:	00 
2692973- 135d128:	48 8d 87 88 00 00 00 	lea    rax,[rdi+0x88]
2692974- 135d12f:	48 89 84 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],rax
2692975- 135d136:	00 
2692976- 135d137:	48 8d 87 a0 00 00 00 	lea    rax,[rdi+0xa0]
2692977- 135d13e:	48 89 84 24 00 01 00 	mov    QWORD PTR [rsp+0x100],rax
2692978- 135d145:	00 
2692979- 135d146:	48 8d 87 a8 00 00 00 	lea    rax,[rdi+0xa8]
2692980- 135d14d:	48 89 84 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rax
2692981- 135d154:	00 
2692982- 135d155:	48 8d 87 b0 00 00 00 	lea    rax,[rdi+0xb0]
2692984- 135d163:	00 
2692985- 135d164:	48 8d 87 b8 00 00 00 	lea    rax,[rdi+0xb8]
2692987- 135d172:	00 
2692988- 135d173:	48 8d 87 c0 00 00 00 	lea    rax,[rdi+0xc0]
2692989- 135d17a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
2692990- 135d181:	00 
2692991- 135d182:	48 8d 87 c8 00 00 00 	lea    rax,[rdi+0xc8]
2692992- 135d189:	48 89 44 24 60       	mov    QWORD PTR [rsp+0x60],rax
2692993- 135d18e:	48 89 7c 24 78       	mov    QWORD PTR [rsp+0x78],rdi
2692994- 135d193:	48 8d 87 d8 00 00 00 	lea    rax,[rdi+0xd8]
2692995- 135d19a:	48 89 84 24 f8 00 00 	mov    QWORD PTR [rsp+0xf8],rax
2692996- 135d1a1:	00 
2692997- 135d1a2:	4c 8b 31             	mov    r14,QWORD PTR [rcx]
2692998- 135d1a5:	48 8d 35 19 92 fd fe 	lea    rsi,[rip+0xfffffffffefd9219]        # 3363c5 <_ZTSSt12bad_any_cast@@Base-0x59e03>
2692999- 135d1ac:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
2693000- 135d1b3:	00 
2693001- 135d1b4:	4c 89 ff             	mov    rdi,r15
2693002- 135d1b7:	4c 89 ac 24 08 01 00 	mov    QWORD PTR [rsp+0x108],r13
2693003- 135d1be:	00 
2693004- 135d1bf:	e8 ba c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2693005- 135d1c4:	4c 8d a4 24 e8 0a 00 	lea    r12,[rsp+0xae8]
2693006- 135d1cb:	00 
2693007- 135d1cc:	48 8d 35 7b 35 00 ff 	lea    rsi,[rip+0xffffffffff00357b]        # 36074e <_ZTSSt12bad_any_cast@@Base-0x2fa7a>
2693008- 135d1d3:	4c 89 e7             	mov    rdi,r12
2693009- 135d1d6:	e8 a3 c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2693010- 135d1db:	4c 8d a4 24 00 0b 00 	lea    r12,[rsp+0xb00]
2693011- 135d1e2:	00 
2693012- 135d1e3:	48 8d 35 e8 2d fe fe 	lea    rsi,[rip+0xfffffffffefe2de8]        # 33ffd2 <_ZTSSt12bad_any_cast@@Base-0x501f6>
2693013- 135d1ea:	4c 89 e7             	mov    rdi,r12
2693014- 135d1ed:	e8 8c c8 71 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
2694134- 135e46a:	00 
2694135- 135e46b:	48 c7 84 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],0x1
2694136- 135e472:	00 01 00 00 00 
2694137- 135e477:	48 8d 05 2a 9b 50 00 	lea    rax,[rip+0x509b2a]        # 1867fa8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x24690>
2694138- 135e47e:	48 89 03             	mov    QWORD PTR [rbx],rax
2694139- 135e481:	48 8b 84 24 d0 03 00 	mov    rax,QWORD PTR [rsp+0x3d0]
2694140- 135e488:	00 
2694141- 135e489:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
2694142- 135e48d:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
2694143- 135e491:	4c 89 fe             	mov    rsi,r15
2694144- 135e494:	e8 4d eb 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
2694145- 135e499:	4c 8d bc 24 a0 04 00 	lea    r15,[rsp+0x4a0]
2694146- 135e4a0:	00 
2694147- 135e4a1:	48 89 df             	mov    rdi,rbx
2694148- 135e4a4:	48 81 c7 e0 00 00 00 	add    rdi,0xe0
2694149- 135e4ab:	ba a0 00 00 00       	mov    edx,0xa0
2694150- 135e4b0:	4c 89 fe             	mov    rsi,r15
2694151- 135e4b3:	e8 18 16 49 00       	call   17efad0 <memcpy@plt>
2694153- 135e4bf:	00 00 
2694154- 135e4c1:	f3 0f 7f 83 80 01 00 	movdqu XMMWORD PTR [rbx+0x180],xmm0
2694155- 135e4c8:	00 
2694156- 135e4c9:	49 8b 87 b0 00 00 00 	mov    rax,QWORD PTR [r15+0xb0]
2694157- 135e4d0:	48 89 83 90 01 00 00 	mov    QWORD PTR [rbx+0x190],rax
2694158- 135e4d7:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0
2694159- 135e4dc:	66 0f ef c0          	pxor   xmm0,xmm0
2694160- 135e4e0:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0
2694161- 135e4e5:	41 0f 10 8f b8 00 00 	movups xmm1,XMMWORD PTR [r15+0xb8]
2694162- 135e4ec:	00 
2694163- 135e4ed:	0f 11 8b 98 01 00 00 	movups XMMWORD PTR [rbx+0x198],xmm1
2694164- 135e4f4:	f3 41 0f 7f 87 b8 00 	movdqu XMMWORD PTR [r15+0xb8],xmm0
2694165- 135e4fb:	00 00 
2694166- 135e4fd:	49 8b 87 c8 00 00 00 	mov    rax,QWORD PTR [r15+0xc8]
2694167- 135e504:	48 89 83 a8 01 00 00 	mov    QWORD PTR [rbx+0x1a8],rax
2694168- 135e50b:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
2694169- 135e512:	00 
2694170- 135e513:	48 83 27 00          	and    QWORD PTR [rdi],0x0
2694171- 135e517:	48 89 9c 24 90 05 00 	mov    QWORD PTR [rsp+0x590],rbx
2694172- 135e51e:	00 
2694173- 135e51f:	e8 a6 bd 71 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
2694174- 135e524:	48 8d bc 24 d0 03 00 	lea    rdi,[rsp+0x3d0]
2694175- 135e52b:	00 
2694176- 135e52c:	e8 a1 27 00 00       	call   1360cd2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6256>
2694177- 135e531:	bf 10 02 00 00       	mov    edi,0x210
2694178- 135e536:	e8 c5 f9 48 00       	call   17edf00 <_Znwm@plt>
2694179- 135e53b:	49 89 c4             	mov    r12,rax
2694180- 135e53e:	48 8b 84 24 f8 10 00 	mov    rax,QWORD PTR [rsp+0x10f8]
2694187- 135e55e:	49 89 04 24          	mov    QWORD PTR [r12],rax
2694188- 135e562:	66 0f ef c0          	pxor   xmm0,xmm0
2694189- 135e566:	f3 41 0f 7f 44 24 08 	movdqu XMMWORD PTR [r12+0x8],xmm0
2694190- 135e56d:	49 8d 7c 24 18       	lea    rdi,[r12+0x18]
2694191- 135e572:	e8 35 aa cf ff       	call   1058fac <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2203c2>
2694192- 135e577:	66 0f ef c0          	pxor   xmm0,xmm0
2694193- 135e57b:	66 41 0f 7f 44 24 50 	movdqa XMMWORD PTR [r12+0x50],xmm0
2694194- 135e582:	66 41 0f 7f 44 24 40 	movdqa XMMWORD PTR [r12+0x40],xmm0
2694195- 135e589:	f3 41 0f 7f 44 24 28 	movdqu XMMWORD PTR [r12+0x28],xmm0
2694196- 135e590:	41 83 64 24 38 00    	and    DWORD PTR [r12+0x38],0x0
2694197- 135e596:	41 c7 44 24 60 00 00 	mov    DWORD PTR [r12+0x60],0x3f800000
2694198- 135e59d:	80 3f 
2694199- 135e59f:	31 db                	xor    ebx,ebx
2694200- 135e5a1:	41 88 5c 24 68       	mov    BYTE PTR [r12+0x68],bl
2694201- 135e5a6:	41 88 9c 24 98 00 00 	mov    BYTE PTR [r12+0x98],bl
2694202- 135e5ad:	00 
2694203- 135e5ae:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
2694204- 135e5b5:	00 
2694206- 135e5bd:	00 
2694207- 135e5be:	48 8b 84 24 90 10 00 	mov    rax,QWORD PTR [rsp+0x1090]
2694208- 135e5c5:	00 
2694210- 135e5cd:	00 
2694211- 135e5ce:	4d 8d bc 24 d0 00 00 	lea    r15,[r12+0xd0]
2694212- 135e5d5:	00 
2694213- 135e5d6:	66 41 0f 7f 84 24 b0 	movdqa XMMWORD PTR [r12+0xb0],xmm0
2694214- 135e5dd:	00 00 00 
2694215- 135e5e0:	f3 41 0f 7f 84 24 b9 	movdqu XMMWORD PTR [r12+0xb9],xmm0
2694216- 135e5e7:	00 00 00 
2694217- 135e5ea:	4c 89 ff             	mov    rdi,r15
2694218- 135e5ed:	e8 04 b4 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2694219- 135e5f2:	49 8d ac 24 e0 00 00 	lea    rbp,[r12+0xe0]
2694220- 135e5f9:	00 
2694221- 135e5fa:	48 89 ef             	mov    rdi,rbp
2694222- 135e5fd:	e8 f4 b3 47 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
2694223- 135e602:	4d 8d ac 24 f0 00 00 	lea    r13,[r12+0xf0]
2694224- 135e609:	00 
2694225- 135e60a:	48 8d b4 24 60 0f 00 	lea    rsi,[rsp+0xf60]
2694226- 135e611:	00 
2694227- 135e612:	4c 89 ef             	mov    rdi,r13
2694228- 135e615:	e8 d6 98 77 ff       	call   ad7ef0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x24e90>
2694229- 135e61a:	49 83 a4 24 20 01 00 	and    QWORD PTR [r12+0x120],0x0
2694230- 135e621:	00 00 
2694231- 135e623:	49 83 a4 24 30 01 00 	and    QWORD PTR [r12+0x130],0x0
2694232- 135e62a:	00 00 
2694233- 135e62c:	41 88 9c 24 40 01 00 	mov    BYTE PTR [r12+0x140],bl
2694234- 135e633:	00 
2694235- 135e634:	41 88 9c 24 d0 01 00 	mov    BYTE PTR [r12+0x1d0],bl
2694236- 135e63b:	00 
2694237- 135e63c:	41 88 9c 24 d8 01 00 	mov    BYTE PTR [r12+0x1d8],bl
2694238- 135e643:	00 
2694239- 135e644:	41 88 9c 24 f8 01 00 	mov    BYTE PTR [r12+0x1f8],bl
2694240- 135e64b:	00 
2694241- 135e64c:	41 88 9c 24 00 02 00 	mov    BYTE PTR [r12+0x200],bl
2694242- 135e653:	00 
2694244- 135e65b:	00 
2694245- 135e65c:	4c 8d 84 24 20 03 00 	lea    r8,[rsp+0x320]
2694246- 135e663:	00 
2694247- 135e664:	4d 89 20             	mov    QWORD PTR [r8],r12
2694248- 135e667:	48 8d 35 23 ea 73 ff 	lea    rsi,[rip+0xffffffffff73ea23]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
2694249- 135e66e:	48 8d 0d ed b3 02 00 	lea    rcx,[rip+0x2b3ed]        # 1389a62 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cefe6>
2694250- 135e675:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
2694251- 135e67c:	00 
2694252- 135e67d:	6a 08                	push   0x8
2694253- 135e67f:	41 59                	pop    r9
2694254- 135e681:	48 89 df             	mov    rdi,rbx
2694255- 135e684:	31 d2                	xor    edx,edx
2694256- 135e686:	e8 09 c1 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
2694257- 135e68b:	49 8b 36             	mov    rsi,QWORD PTR [r14]
2694258- 135e68e:	48 8d 15 1b f3 07 ff 	lea    rdx,[rip+0xffffffffff07f31b]        # 3dd9b0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x33ff>
2694259- 135e695:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
2694260- 135e69c:	00 
2694261- 135e69d:	48 89 d9             	mov    rcx,rbx
2694262- 135e6a0:	e8 3b 2c 46 00       	call   17c12e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17544c>
2694263- 135e6a5:	48 8d 9c 24 40 0e 00 	lea    rbx,[rsp+0xe40]
2694264- 135e6ac:	00 
2694265- 135e6ad:	4c 89 ff             	mov    rdi,r15
2694266- 135e6b0:	48 89 de             	mov    rsi,rbx
2694267- 135e6b3:	e8 3a b5 47 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
2694268- 135e6b8:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
2694269- 135e6bc:	e8 c5 fd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2694270- 135e6c1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
2694271- 135e6c8:	00 
2694272- 135e6c9:	e8 1a c1 47 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
2694274- 135e6d5:	00 
2694275- 135e6d6:	4c 8d 84 24 20 03 00 	lea    r8,[rsp+0x320]
2694276- 135e6dd:	00 
2694277- 135e6de:	4d 89 20             	mov    QWORD PTR [r8],r12
2694278- 135e6e1:	48 8d 35 a9 e9 73 ff 	lea    rsi,[rip+0xffffffffff73e9a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
2694279- 135e6e8:	48 8d 0d 1f b4 02 00 	lea    rcx,[rip+0x2b41f]        # 1389b0e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1cf092>
2694280- 135e6ef:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
2694281- 135e6f6:	00 
2694282- 135e6f7:	6a 08                	push   0x8
2694283- 135e6f9:	41 59                	pop    r9
2694284- 135e6fb:	48 89 df             	mov    rdi,rbx
2694285- 135e6fe:	31 d2                	xor    edx,edx
2694286- 135e700:	e8 8f c0 47 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
2694287- 135e705:	49 8b 36             	mov    rsi,QWORD PTR [r14]
2694288- 135e708:	48 8d 15 b1 f2 07 ff 	lea    rdx,[rip+0xffffffffff07f2b1]        # 3dd9c0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x340f>
2694289- 135e70f:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
2694290- 135e716:	00 
2694291- 135e717:	48 89 d9             	mov    rcx,rbx
2694292- 135e71a:	e8 c1 2b 46 00       	call   17c12e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17544c>
2694293- 135e71f:	48 8d 9c 24 40 0e 00 	lea    rbx,[rsp+0xe40]
2694294- 135e726:	00 
2694295- 135e727:	48 89 ef             	mov    rdi,rbp
2694296- 135e72a:	48 89 de             	mov    rsi,rbx
2694297- 135e72d:	e8 c0 b4 47 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
2694298- 135e732:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
2694299- 135e736:	e8 4b fd 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2694300- 135e73b:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
2694301- 135e742:	00 
2694670- 135ed1e:	00 
2694671- 135ed1f:	48 8d 73 10          	lea    rsi,[rbx+0x10]
2694672- 135ed23:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
2694673- 135ed27:	4c 89 ef             	mov    rdi,r13
2694674- 135ed2a:	e8 01 2e 04 00       	call   13a1b30 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e70b4>
2694675- 135ed2f:	66 0f ef c0          	pxor   xmm0,xmm0
2694676- 135ed33:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
2694677- 135ed38:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
2694678- 135ed3d:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
2694679- 135ed42:	48 89 d8             	mov    rax,rbx
2694680- 135ed45:	48 83 c0 68          	add    rax,0x68
2694681- 135ed49:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
2694682- 135ed4d:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
2694683- 135ed51:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
2694684- 135ed58:	00 
2694685- 135ed59:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
2694686- 135ed5e:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
2694687- 135ed65:	00 
2694689- 135ed6d:	00 80 3f 
2694690- 135ed70:	6a 64                	push   0x64
2694691- 135ed72:	58                   	pop    rax
2694693- 135ed7a:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
2694694- 135ed81:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
2694695- 135ed88:	00 
2694696- 135ed89:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
2694697- 135ed90:	00 
2694698- 135ed91:	4c 89 ef             	mov    rdi,r13
2694699- 135ed94:	e8 d1 b1 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
2694700- 135ed99:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
2694701- 135eda0:	00 
2694702- 135eda1:	66 0f ef c0          	pxor   xmm0,xmm0
2694703- 135eda5:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
2694704- 135edac:	00 
2694706- 135edb4:	00 
2694707- 135edb5:	48 8b 38             	mov    rdi,QWORD PTR [rax]
2694708- 135edb8:	48 89 18             	mov    QWORD PTR [rax],rbx
2694709- 135edbb:	48 85 ff             	test   rdi,rdi
2694710- 135edbe:	74 06                	je     135edc6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a434a>
2694711- 135edc0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2694712- 135edc3:	ff 50 08             	call   QWORD PTR [rax+0x8]
2694713- 135edc6:	48 8b bc 24 b8 10 00 	mov    rdi,QWORD PTR [rsp+0x10b8]
2694714- 135edcd:	00 
2694715- 135edce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2694716- 135edd1:	ff 50 28             	call   QWORD PTR [rax+0x28]
2694717- 135edd4:	49 89 c6             	mov    r14,rax
2694718- 135edd7:	bf 10 01 00 00       	mov    edi,0x110
2694719- 135eddc:	e8 1f f1 48 00       	call   17edf00 <_Znwm@plt>
2694720- 135ede1:	48 89 c3             	mov    rbx,rax
2694721- 135ede4:	48 8d 05 cd b2 50 00 	lea    rax,[rip+0x50b2cd]        # 186a0b8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x267a0>
2694722- 135edeb:	48 89 03             	mov    QWORD PTR [rbx],rax
2694723- 135edee:	48 8d 05 63 b3 50 00 	lea    rax,[rip+0x50b363]        # 186a158 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x26840>
2694724- 135edf5:	48 89 84 24 d0 0a 00 	mov    QWORD PTR [rsp+0xad0],rax
2694725- 135edfc:	00 
2694726- 135edfd:	48 8b 84 24 00 11 00 	mov    rax,QWORD PTR [rsp+0x1100]
2694727- 135ee04:	00 
2694728- 135ee05:	48 89 84 24 d8 0a 00 	mov    QWORD PTR [rsp+0xad8],rax
2694729- 135ee0c:	00 
2694730- 135ee0d:	4c 89 b4 24 e0 0a 00 	mov    QWORD PTR [rsp+0xae0],r14
2694731- 135ee14:	00 
2694732- 135ee15:	4c 89 ac 24 f0 0a 00 	mov    QWORD PTR [rsp+0xaf0],r13
2694733- 135ee1c:	00 
2694734- 135ee1d:	48 8d 73 10          	lea    rsi,[rbx+0x10]
2694735- 135ee21:	48 89 73 30          	mov    QWORD PTR [rbx+0x30],rsi
2694736- 135ee25:	4c 89 ef             	mov    rdi,r13
2694737- 135ee28:	e8 39 4d 04 00       	call   13a3b66 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e90ea>
2694738- 135ee2d:	66 0f ef c0          	pxor   xmm0,xmm0
2694739- 135ee31:	66 0f 7f 43 50       	movdqa XMMWORD PTR [rbx+0x50],xmm0
2694740- 135ee36:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0
2694741- 135ee3b:	66 0f 7f 43 40       	movdqa XMMWORD PTR [rbx+0x40],xmm0
2694742- 135ee40:	48 89 d8             	mov    rax,rbx
2694743- 135ee43:	48 83 c0 68          	add    rax,0x68
2694744- 135ee47:	48 89 43 68          	mov    QWORD PTR [rbx+0x68],rax
2694745- 135ee4b:	48 89 43 70          	mov    QWORD PTR [rbx+0x70],rax
2694746- 135ee4f:	48 83 a3 98 00 00 00 	and    QWORD PTR [rbx+0x98],0x0
2694747- 135ee56:	00 
2694748- 135ee57:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0
2694749- 135ee5c:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0
2694750- 135ee63:	00 
2694752- 135ee6b:	00 80 3f 
2694753- 135ee6e:	6a 64                	push   0x64
2694754- 135ee70:	58                   	pop    rax
2694756- 135ee78:	48 89 83 b0 00 00 00 	mov    QWORD PTR [rbx+0xb0],rax
2694757- 135ee7f:	48 83 a3 b8 00 00 00 	and    QWORD PTR [rbx+0xb8],0x0
2694758- 135ee86:	00 
2694759- 135ee87:	48 83 a3 e0 00 00 00 	and    QWORD PTR [rbx+0xe0],0x0
2694760- 135ee8e:	00 
2694761- 135ee8f:	4c 89 ef             	mov    rdi,r13
2694762- 135ee92:	e8 d3 b0 71 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
2694763- 135ee97:	48 83 a3 00 01 00 00 	and    QWORD PTR [rbx+0x100],0x0
2694764- 135ee9e:	00 
2694765- 135ee9f:	66 0f ef c0          	pxor   xmm0,xmm0
2694766- 135eea3:	66 0f 7f 83 f0 00 00 	movdqa XMMWORD PTR [rbx+0xf0],xmm0
2694767- 135eeaa:	00 
2694769- 135eeb2:	00 
2694770- 135eeb3:	48 8b 38             	mov    rdi,QWORD PTR [rax]
2694771- 135eeb6:	48 89 18             	mov    QWORD PTR [rax],rbx
2694772- 135eeb9:	48 85 ff             	test   rdi,rdi
2694773- 135eebc:	74 06                	je     135eec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4448>
2694774- 135eebe:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2694775- 135eec1:	ff 50 08             	call   QWORD PTR [rax+0x8]
2694776- 135eec4:	8a 45 01             	mov    al,BYTE PTR [rbp+0x1]
2694777- 135eec7:	88 84 24 20 03 00 00 	mov    BYTE PTR [rsp+0x320],al
2694778- 135eece:	8a 45 02             	mov    al,BYTE PTR [rbp+0x2]
2694779- 135eed1:	88 84 24 21 03 00 00 	mov    BYTE PTR [rsp+0x321],al
2694780- 135eed8:	8a 45 03             	mov    al,BYTE PTR [rbp+0x3]
2694781- 135eedb:	88 84 24 22 03 00 00 	mov    BYTE PTR [rsp+0x322],al
2694782- 135eee2:	0f 10 45 10          	movups xmm0,XMMWORD PTR [rbp+0x10]
2694783- 135eee6:	0f 11 84 24 28 03 00 	movups XMMWORD PTR [rsp+0x328],xmm0
2694784- 135eeed:	00 
2694785- 135eeee:	0f 10 45 20          	movups xmm0,XMMWORD PTR [rbp+0x20]
2694786- 135eef2:	0f 11 84 24 38 03 00 	movups XMMWORD PTR [rsp+0x338],xmm0
2694787- 135eef9:	00 
2694788- 135eefa:	48 8b 45 30          	mov    rax,QWORD PTR [rbp+0x30]
2694789- 135eefe:	48 89 84 24 48 03 00 	mov    QWORD PTR [rsp+0x348],rax
2694790- 135ef05:	00 
2694791- 135ef06:	48 8b 84 24 88 10 00 	mov    rax,QWORD PTR [rsp+0x1088]
2694792- 135ef0d:	00 
2694793- 135ef0e:	48 8b 38             	mov    rdi,QWORD PTR [rax]
2694794- 135ef11:	e8 c6 05 96 ff       	call   cbf4dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x20c47c>
2694795- 135ef16:	88 84 24 50 03 00 00 	mov    BYTE PTR [rsp+0x350],al
2694796- 135ef1d:	48 b8 fa 00 00 00 fa 	movabs rax,0xfa000000fa
2695004- 135f244:	00 
2695005- 135f245:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
2695006- 135f24a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2695007- 135f24d:	ff 50 38             	call   QWORD PTR [rax+0x38]
2695008- 135f250:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
2695009- 135f257:	00 
2695010- 135f258:	48 89 c6             	mov    rsi,rax
2695011- 135f25b:	e8 30 b0 71 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
2695012- 135f260:	4c 89 74 24 40       	mov    QWORD PTR [rsp+0x40],r14
2695013- 135f265:	48 89 5c 24 38       	mov    QWORD PTR [rsp+0x38],rbx
2695014- 135f26a:	48 8b 84 24 c8 00 00 	mov    rax,QWORD PTR [rsp+0xc8]
2695015- 135f271:	00 
2695016- 135f272:	48 8b 18             	mov    rbx,QWORD PTR [rax]
2695017- 135f275:	48 8b bc 24 08 11 00 	mov    rdi,QWORD PTR [rsp+0x1108]
2695018- 135f27c:	00 
2695019- 135f27d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
2695020- 135f280:	ff 50 28             	call   QWORD PTR [rax+0x28]
2695021- 135f283:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
2695023- 135f28f:	00 
2695024- 135f290:	48 8b 28             	mov    rbp,QWORD PTR [rax]
2695025- 135f293:	48 8b 84 24 c0 00 00 	mov    rax,QWORD PTR [rsp+0xc0]
2695026- 135f29a:	00 
2695027- 135f29b:	48 8b 00             	mov    rax,QWORD PTR [rax]
2695028- 135f29e:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
2695030- 135f2aa:	00 
2695031- 135f2ab:	48 8b 00             	mov    rax,QWORD PTR [rax]
2695032- 135f2ae:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
2695033- 135f2b3:	bf d0 0b 00 00       	mov    edi,0xbd0
2695034- 135f2b8:	e8 43 ec 48 00       	call   17edf00 <_Znwm@plt>
2695035- 135f2bd:	49 89 c6             	mov    r14,rax
2695036- 135f2c0:	48 8b 84 24 78 10 00 	mov    rax,QWORD PTR [rsp+0x1078]
2695037- 135f2c7:	00 
2695038- 135f2c8:	f3 0f 6f 00          	movdqu xmm0,XMMWORD PTR [rax]
2695039- 135f2cc:	66 0f 7f 44 24 10    	movdqa XMMWORD PTR [rsp+0x10],xmm0
2695040- 135f2d2:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]
2695041- 135f2d6:	48 85 c0             	test   rax,rax
2695042- 135f2d9:	74 05                	je     135f2e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4864>
2695043- 135f2db:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
2695044- 135f2e0:	48 89 5c 24 30       	mov    QWORD PTR [rsp+0x30],rbx
2695045- 135f2e5:	48 8d bc 24 40 0e 00 	lea    rdi,[rsp+0xe40]
2695046- 135f2ec:	00 
2695047- 135f2ed:	48 8b b4 24 f8 10 00 	mov    rsi,QWORD PTR [rsp+0x10f8]
2695048- 135f2f4:	00 
2695049- 135f2f5:	e8 ec dc 74 ff       	call   aacfe6 <JNI_OnUnload@@Base+0x348b3>
2695050- 135f2fa:	48 8d bc 24 b0 0d 00 	lea    rdi,[rsp+0xdb0]
2695051- 135f301:	00 
2695052- 135f302:	48 8d b4 24 50 08 00 	lea    rsi,[rsp+0x850]
2695053- 135f309:	00 
2695054- 135f30a:	e8 fd 1b 00 00       	call   1360f0c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a6490>
2695055- 135f30f:	48 83 a4 24 30 0e 00 	and    QWORD PTR [rsp+0xe30],0x0
2695056- 135f316:	00 00 
2695057- 135f318:	6a 70                	push   0x70
2695155- 135f4bc:	6a 61                	push   0x61
2695156- 135f4be:	59                   	pop    rcx
2695157- 135f4bf:	48 8d 84 24 20 03 00 	lea    rax,[rsp+0x320]
2695158- 135f4c6:	00 
2695159- 135f4c7:	48 89 df             	mov    rdi,rbx
2695160- 135f4ca:	48 89 c6             	mov    rsi,rax
2695161- 135f4cd:	f3 a4                	rep movs BYTE PTR es:[rdi],BYTE PTR ds:[rsi]
2695162- 135f4cf:	0f 10 40 68          	movups xmm0,XMMWORD PTR [rax+0x68]
2695163- 135f4d3:	41 0f 11 86 88 00 00 	movups XMMWORD PTR [r14+0x88],xmm0
2695164- 135f4da:	00 
2695165- 135f4db:	48 8b 40 78          	mov    rax,QWORD PTR [rax+0x78]
2695166- 135f4df:	49 89 86 98 00 00 00 	mov    QWORD PTR [r14+0x98],rax
2695167- 135f4e6:	0f 57 c0             	xorps  xmm0,xmm0
2695168- 135f4e9:	48 8d 84 24 88 03 00 	lea    rax,[rsp+0x388]
2695169- 135f4f0:	00 
2695170- 135f4f1:	48 83 60 10 00       	and    QWORD PTR [rax+0x10],0x0
2695171- 135f4f6:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
2695172- 135f4f9:	0f 10 4d e8          	movups xmm1,XMMWORD PTR [rbp-0x18]
2695174- 135f504:	00 
2695175- 135f505:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
2695176- 135f509:	49 89 86 b0 00 00 00 	mov    QWORD PTR [r14+0xb0],rax
2695177- 135f510:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0
2695178- 135f515:	41 0f 11 45 00       	movups XMMWORD PTR [r13+0x0],xmm0
2695179- 135f51a:	f3 0f 6f 45 00       	movdqu xmm0,XMMWORD PTR [rbp+0x0]
2695180- 135f51f:	f3 41 0f 7f 86 b8 00 	movdqu XMMWORD PTR [r14+0xb8],xmm0
2695181- 135f526:	00 00 
2695182- 135f528:	48 8b 84 24 98 10 00 	mov    rax,QWORD PTR [rsp+0x1098]
2695183- 135f52f:	00 
2695184- 135f530:	49 89 86 c8 00 00 00 	mov    QWORD PTR [r14+0xc8],rax
2695185- 135f537:	48 8b 84 24 70 10 00 	mov    rax,QWORD PTR [rsp+0x1070]
2695186- 135f53e:	00 
2695187- 135f53f:	49 89 86 d0 00 00 00 	mov    QWORD PTR [r14+0xd0],rax
2695188- 135f546:	48 8b 44 24 38       	mov    rax,QWORD PTR [rsp+0x38]
2695189- 135f54b:	49 89 86 d8 00 00 00 	mov    QWORD PTR [r14+0xd8],rax
2695190- 135f552:	48 8b 44 24 40       	mov    rax,QWORD PTR [rsp+0x40]
2695191- 135f557:	49 89 86 e0 00 00 00 	mov    QWORD PTR [r14+0xe0],rax
2695192- 135f55e:	49 8d be f0 00 00 00 	lea    rdi,[r14+0xf0]
2695193- 135f565:	48 8d b4 24 40 0e 00 	lea    rsi,[rsp+0xe40]
2695194- 135f56c:	00 
2695195- 135f56d:	48 89 7c 24 38       	mov    QWORD PTR [rsp+0x38],rdi
2695196- 135f572:	e8 27 fa 96 ff       	call   ccef9e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x21bf3e>
2695197- 135f577:	4d 8d ae b0 01 00 00 	lea    r13,[r14+0x1b0]
2695198- 135f57e:	48 8b 84 24 30 0e 00 	mov    rax,QWORD PTR [rsp+0xe30]
2695199- 135f585:	00 
2695200- 135f586:	48 85 c0             	test   rax,rax
2695201- 135f589:	74 1e                	je     135f5a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a4b2d>
2695714- 135fe71:	00 
2695715- 135fe72:	6a 0c                	push   0xc
2695716- 135fe74:	59                   	pop    rcx
2695717- 135fe75:	4c 8d 84 24 58 01 00 	lea    r8,[rsp+0x158]
2695718- 135fe7c:	00 
2695719- 135fe7d:	48 89 c2             	mov    rdx,rax
2695720- 135fe80:	41 ff 91 c0 00 00 00 	call   QWORD PTR [r9+0xc0]
2695721- 135fe87:	48 8d 9c 24 d0 0a 00 	lea    rbx,[rsp+0xad0]
2695722- 135fe8e:	00 
2695723- 135fe8f:	48 8b bc 24 10 01 00 	mov    rdi,QWORD PTR [rsp+0x110]
2695724- 135fe96:	00 
2695725- 135fe97:	48 89 de             	mov    rsi,rbx
2695726- 135fe9a:	e8 7d 99 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
2695727- 135fe9f:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
2695728- 135fea3:	e8 de e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2695729- 135fea8:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
2695730- 135feaf:	00 
2695731- 135feb0:	e8 0b e7 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
2695733- 135febc:	00 
2695734- 135febd:	48 8b 18             	mov    rbx,QWORD PTR [rax]
2695735- 135fec0:	4d 8b 36             	mov    r14,QWORD PTR [r14]
2695736- 135fec3:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
2695737- 135feca:	48 8d 35 a0 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e4a0]        # 3de371 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3dc0>
2695738- 135fed1:	48 8d bc 24 d0 0a 00 	lea    rdi,[rsp+0xad0]
2695739- 135fed8:	00 
2695740- 135fed9:	6a 01                	push   0x1
2695741- 135fedb:	5a                   	pop    rdx
2695742- 135fedc:	e8 4b 9b d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
2695743- 135fee1:	49 8b 06             	mov    rax,QWORD PTR [r14]
2695744- 135fee4:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
2695745- 135feeb:	00 
2695746- 135feec:	6a 07                	push   0x7
2695747- 135feee:	59                   	pop    rcx
2695748- 135feef:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]
2695749- 135fef6:	00 
2695750- 135fef7:	4c 89 f6             	mov    rsi,r14
2695751- 135fefa:	48 89 da             	mov    rdx,rbx
2695752- 135fefd:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
2695753- 135ff03:	48 81 c3 f8 00 00 00 	add    rbx,0xf8
2695754- 135ff0a:	4c 8d b4 24 60 0f 00 	lea    r14,[rsp+0xf60]
2695755- 135ff11:	00 
2695756- 135ff12:	48 89 df             	mov    rdi,rbx
2695757- 135ff15:	4c 89 f6             	mov    rsi,r14
2695758- 135ff18:	e8 ff 98 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
2695759- 135ff1d:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
2695760- 135ff21:	e8 60 e5 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
2695761- 135ff26:	4c 8d bc 24 d0 0a 00 	lea    r15,[rsp+0xad0]
2695762- 135ff2d:	00 
2695763- 135ff2e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
2695764- 135ff32:	e8 89 e6 77 ff       	call   ade5c0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2b560>
2695766- 135ff3e:	00 
2695767- 135ff3f:	48 8b 18             	mov    rbx,QWORD PTR [rax]
2695768- 135ff42:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
2695769- 135ff47:	4c 8b 30             	mov    r14,QWORD PTR [rax]
2695770- 135ff4a:	4c 89 b3 f0 00 00 00 	mov    QWORD PTR [rbx+0xf0],r14
2695771- 135ff51:	48 8d 35 48 e4 07 ff 	lea    rsi,[rip+0xffffffffff07e448]        # 3de3a0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x3def>
2695772- 135ff58:	6a 01                	push   0x1
2695773- 135ff5a:	5a                   	pop    rdx
2695774- 135ff5b:	4c 89 ff             	mov    rdi,r15
2695775- 135ff5e:	e8 c9 9a d4 ff       	call   10a9a2c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270e42>
2695776- 135ff63:	49 8b 06             	mov    rax,QWORD PTR [r14]
2695777- 135ff66:	48 8d bc 24 60 0f 00 	lea    rdi,[rsp+0xf60]
2695778- 135ff6d:	00 
2695779- 135ff6e:	6a 08                	push   0x8
2695780- 135ff70:	59                   	pop    rcx
2695781- 135ff71:	4c 8d 84 24 d0 0a 00 	lea    r8,[rsp+0xad0]
2695782- 135ff78:	00 
2695783- 135ff79:	4c 89 f6             	mov    rsi,r14
2695784- 135ff7c:	48 89 da             	mov    rdx,rbx
2695785- 135ff7f:	ff 90 c0 00 00 00    	call   QWORD PTR [rax+0xc0]
2695786- 135ff85:	48 81 c3 f8 00 00 00 	add    rbx,0xf8
2695787- 135ff8c:	4c 8d b4 24 60 0f 00 	lea    r14,[rsp+0xf60]
2695788- 135ff93:	00 
2695789- 135ff94:	48 89 df             	mov    rdi,rbx
2695790- 135ff97:	4c 89 f6             	mov    rsi,r14
2695791- 135ff9a:	e8 7d 98 75 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
2695792- 135ff9f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
2695793- 135ffa3:	e8 de e4 73 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
