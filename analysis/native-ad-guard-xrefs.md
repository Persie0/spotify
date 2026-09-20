# Orbit ad skip guard trace

Known restriction builder: 0x10a6464..0x10a7f52
Known ad skip-next container: r14+0x14a0
Known ad skip guard in that builder: r14+0x470

## Plausible object +0x470 references

Non-stack/non-vtable references: 112; direct writes: 30

- 0xb75180 in 0xb7513c..0xb75723: rdi+0x470 :: mov    rax,QWORD PTR [rdi+0x470]
- 0xb75310 in 0xb7513c..0xb75723: rbx+0x470 :: mov    rcx,QWORD PTR [rbx+0x470]
- 0xcba8e9 in 0xcb7a20..0xcbc937: r15+0x470 WRITE :: mov    BYTE PTR [r15+0x470],dil
- 0xd6b96a in 0xd6aa99..0xd6f087: r15+0x470 :: movdqa XMMWORD PTR [r15+0x470],xmm0
- 0xd6da31 in 0xd6aa99..0xd6f087: rax+0x470 :: mov    rax,QWORD PTR [rax+0x470]
- 0xd6de8b in 0xd6aa99..0xd6f087: rdi+0x470 :: mov    rax,QWORD PTR [rdi+0x470]
- 0xd706bb in 0xd70640..0xd70744: r14+0x470 :: mov    r15,QWORD PTR [r14+0x470]
- 0xd71000 in 0xd70fde..0xd71310: rdi+0x470 :: mov    r14,QWORD PTR [rdi+0x470]
- 0xd71996 in 0xd71884..0xd723ed: rbx+0x470 :: mov    r12,QWORD PTR [rbx+0x470]
- 0xd736d7 in 0xd73652..0xd73887: r14+0x470 :: mov    rbp,QWORD PTR [r14+0x470]
- 0xd786eb in 0xd78540..0xd7994b: rdi+0x470 :: mov    rbx,QWORD PTR [rdi+0x470]
- 0xd79d95 in 0xd7994c..0xd7a534: r15+0x470 :: mov    r12,QWORD PTR [r15+0x470]
- 0xd7a5b3 in 0xd7a534..0xd7a630: rbx+0x470 :: mov    r14,QWORD PTR [rbx+0x470]
- 0xd7e66c in 0xd7e33e..0xd7eb7e: rbx+0x470 :: mov    rdi,QWORD PTR [rbx+0x470]
- 0xd7e678 in 0xd7e33e..0xd7eb7e: rbx+0x470 WRITE :: and    QWORD PTR [rbx+0x470],0x0
- 0xd7eeff in 0xd7eefa..0xd7ef42: rdi+0x470 :: mov    r15,QWORD PTR [rdi+0x470]
- 0xd81760 in 0xd8170c..0xd81808: r12+0x470 :: mov    r13,QWORD PTR [r12+0x470]
- 0xd81c16 in 0xd81b9a..0xd81d21: r14+0x470 :: mov    r12,QWORD PTR [r14+0x470]
- 0xd82072 in 0xd82046..0xd821e3: rsi+0x470 :: mov    r12,QWORD PTR [rsi+0x470]
- 0xd8b7c3 in 0xd8b73e..0xd8b973: r14+0x470 :: mov    rbp,QWORD PTR [r14+0x470]
- 0xdb6c0c in 0xdb6b30..0xdb6c4c: rbx+0x470 :: mov    ecx,DWORD PTR [rbx+0x470]
- 0xdbc9bc in 0xdbbdbc..0xdbcc85: r14+0x470 :: mov    rsi,QWORD PTR [r14+0x470]
- 0xdbca43 in 0xdbbdbc..0xdbcc85: r14+0x470 :: mov    rcx,QWORD PTR [r14+0x470]
- 0xe0c8c6 in 0xe0c8c6..0xe0c8d4: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0xe10685 in 0xe105b4..0xe107a9: r13+0x470 WRITE :: mov    BYTE PTR [r13+0x470],al
- 0xe11eae in 0xe11e8c..0xe12505: rsi+0x470 :: cmp    BYTE PTR [rsi+0x470],0x0
- 0xe12b20 in 0xe12b18..0xe12b51: rdi+0x470 WRITE :: mov    BYTE PTR [rdi+0x470],al
- 0xe12b26 in 0xe12b18..0xe12b51: rsi+0x470 :: cmp    BYTE PTR [rsi+0x470],al
- 0xe12b5b in 0xe12b52..0xe12b64: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],0x1
- 0xe14937 in 0xe1492e..0xe14940: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],0x1
- 0xe30980 in 0xe3097c..0xe309a0: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0xe649a9 in 0xe649a9..0xe649d3: rdi+0x470 :: mov    r8b,BYTE PTR [rdi+0x470]
- 0xe649b6 in 0xe649a9..0xe649d3: rsi+0x470 :: mov    dl,BYTE PTR [rsi+0x470]
- 0xe65cde in 0xe65cde..0xe65d03: rdi+0x470 :: mov    al,BYTE PTR [rdi+0x470]
- 0xe65ce4 in 0xe65cde..0xe65d03: rsi+0x470 :: cmp    al,BYTE PTR [rsi+0x470]
- 0xe65d08 in 0xe65d03..0xe65d94: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0xe65db0 in 0xe65db0..0xe65dcb: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0xe65dc2 in 0xe65db0..0xe65dcb: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],0x0
- 0xe65ea2 in 0xe65e9e..0xe65eb5: rdi+0x470 WRITE :: mov    BYTE PTR [rdi+0x470],al
- 0xe65ea8 in 0xe65e9e..0xe65eb5: rsi+0x470 :: cmp    BYTE PTR [rsi+0x470],al
- 0xe65fe5 in 0xe65f44..0xe66088: r15+0x470 WRITE :: mov    BYTE PTR [r15+0x470],bpl
- 0xe96505 in 0xe92f2c..0xe98f3b: r13+0x470 :: movaps xmm0,XMMWORD PTR [r13+0x470]
- 0xec7122 in 0xec7114..0xec716f: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0xecb738 in 0xecb734..0xecb758: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0xef3de0 in 0xef3d64..0xef3fd9: r13+0x470 :: cmp    BYTE PTR [r13+0x470],0x0
- 0xf09c39 in 0xf09ba2..0xf09d96: r15+0x470 :: cmp    BYTE PTR [r15+0x470],0x0
- 0xf09e70 in 0xf09d96..0xf0a6d7: r15+0x470 :: cmp    BYTE PTR [r15+0x470],0x0
- 0xf19878 in 0xf197e6..0xf198ea: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],al
- 0xf1b867 in 0xf1b834..0xf1b9d9: r14+0x470 :: cmp    BYTE PTR [r14+0x470],0x0
- 0xf1ba88 in 0xf1b9da..0xf1bd5c: rcx+0x470 WRITE :: mov    BYTE PTR [rcx+0x470],al
- 0xf1be59 in 0xf1bd5c..0xf1c0d6: rcx+0x470 WRITE :: mov    BYTE PTR [rcx+0x470],al
- 0xf1c19d in 0xf1c0d6..0xf1c69b: rcx+0x470 WRITE :: mov    BYTE PTR [rcx+0x470],al
- 0xf1c7b6 in 0xf1c75a..0xf1c925: r15+0x470 :: cmp    BYTE PTR [r15+0x470],0x0
- 0xf1efdf in 0xf1efa2..0xf1f1bb: r12+0x470 :: cmp    BYTE PTR [r12+0x470],0x0
- 0xf46126 in 0xf46036..0xf461e0: r14+0x470 :: cmp    BYTE PTR [r14+0x470],0x0
- 0xf46138 in 0xf46036..0xf461e0: r14+0x470 WRITE :: mov    BYTE PTR [r14+0x470],0x0
- 0xf4614d in 0xf46036..0xf461e0: r14+0x470 WRITE :: mov    BYTE PTR [r14+0x470],0x1
- 0x1040c1f in 0x10409b6..0x1040cd6: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],al
- 0x1040d10 in 0x1040cd6..0x1040ed3: rbx+0x470 :: mov    al,BYTE PTR [rbx+0x470]
- 0x1040d46 in 0x1040cd6..0x1040ed3: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],0x0
- 0x1040d77 in 0x1040cd6..0x1040ed3: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],0x1
- 0x1040d92 in 0x1040cd6..0x1040ed3: rbx+0x470 :: cmp    BYTE PTR [rbx+0x470],0x0
- 0x10431ce in 0x10431ac..0x10437c5: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0x1044cf8 in 0x1044792..0x10455e3: rdi+0x470 :: movups XMMWORD PTR [rdi+0x470],xmm0
- 0x105b4ea in 0x105b4cb..0x105b5df: rdx+0x470 :: cmp    BYTE PTR [rdx+0x470],0x0
- 0x105b794 in 0x105b772..0x105b92f: rcx+0x470 :: mov    al,BYTE PTR [rcx+0x470]
- 0x105baba in 0x105baba..0x105bad0: rsi+0x470 :: cmp    BYTE PTR [rsi+0x470],0x0
- 0x105c7ea in 0x105c7e6..0x105c81e: rdi+0x470 :: mov    al,BYTE PTR [rdi+0x470]
- 0x105c7f0 in 0x105c7e6..0x105c81e: rsi+0x470 :: cmp    al,BYTE PTR [rsi+0x470]
- 0x107beff in 0x107a02c..0x107e484: r15+0x470 WRITE :: mov    DWORD PTR [r15+0x470],ebx
- 0x108eb0b in 0x108eacc..0x108eb99: r14+0x470 :: cmp    BYTE PTR [r14+0x470],0x0
- 0x10a74a0 in 0x10a6464..0x10a7f52: r14+0x470 :: cmp    BYTE PTR [r14+0x470],0x0
- 0x10a9677 in 0x10a9668..0x10a969c: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0x10bfd22 in 0x10bfd22..0x10bfd35: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0x10f951c in 0x10f9518..0x10f9559: rsi+0x470 :: cmp    BYTE PTR [rsi+0x470],0x0
- 0x10f9551 in 0x10f9518..0x10f9559: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],al
- 0x10f95dd in 0x10f955a..0x10f972f: r15+0x470 :: cmp    BYTE PTR [r15+0x470],0x0
- 0x11cbeb0 in 0x11ca706..0x11cd602: r15+0x470 WRITE :: mov    QWORD PTR [r15+0x470],rbp
- 0x11cd49a in 0x11ca706..0x11cd602: rbx+0x470 :: mov    rdi,QWORD PTR [rbx+0x470]
- 0x11d4d2f in 0x11d4aba..0x11d4ea4: rbx+0x470 :: mov    rdi,QWORD PTR [rbx+0x470]
- 0x120f7c0 in 0x120f7a1..0x120f98f: rsi+0x470 :: cmp    BYTE PTR [rsi+0x470],0x0
- 0x122c079 in 0x122ba2e..0x122c594: r13+0x470 :: movdqu XMMWORD PTR [r13+0x470],xmm0
- 0x12374fa in 0x1235556..0x1239d28: rax+0x470 :: mov    rax,QWORD PTR [rax+0x470]
- 0x1237659 in 0x1235556..0x1239d28: rax+0x470 WRITE :: inc    QWORD PTR [rax+0x470]
- 0x123e6f7 in 0x123c81c..0x1240fd8: rax+0x470 :: cmp    QWORD PTR [rax+0x470],0x0
- 0x123e733 in 0x123c81c..0x1240fd8: rbx+0x470 WRITE :: and    QWORD PTR [rbx+0x470],0x0
- 0x123e774 in 0x123c81c..0x1240fd8: rbx+0x470 WRITE :: mov    QWORD PTR [rbx+0x470],rdx
- 0x12448fa in 0x1244558..0x1244ad3: rbx+0x470 WRITE :: mov    QWORD PTR [rbx+0x470],rax
- 0x133e9fc in 0x133e9da..0x133ea42: rbx+0x470 :: cmp    BYTE PTR [rbx+0x470],0x0
- 0x133ea1a in 0x133e9da..0x133ea42: rbx+0x470 WRITE :: mov    BYTE PTR [rbx+0x470],0x1
- 0x133ea63 in 0x133ea42..0x133eaed: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0x133fee7 in 0x133fd98..0x13404d1: r15+0x470 WRITE :: mov    BYTE PTR [r15+0x470],al
- 0x13697d8 in 0x13695b6..0x1369cef: rbx+0x470 :: mov    rsi,QWORD PTR [rbx+0x470]
- 0x136f269 in 0x136efea..0x136f65c: rbx+0x470 :: mov    rsi,QWORD PTR [rbx+0x470]
- 0x13b41da in 0x13b3b70..0x13b4ce3: r15+0x470 :: mov    r12d,DWORD PTR [r15+0x470]
- 0x13bbced in 0x13bbbc2..0x13bc0d5: rbx+0x470 WRITE :: and    DWORD PTR [rbx+0x470],0x0
- 0x13bc789 in 0x13bc76c..0x13bc805: r14+0x470 :: cmp    DWORD PTR [r14+0x470],0x0
- 0x13bd60a in 0x13bd354..0x13bd65d: r14+0x470 :: movups XMMWORD PTR [r14+0x470],xmm0
- 0x13bd682 in 0x13bd65e..0x13be0db: rdi+0x470 :: cmp    DWORD PTR [rdi+0x470],0x0
- 0x14430b6 in 0x1442fd2..0x1443e3e: r15+0x470 :: mov    rbx,QWORD PTR [r15+0x470]
- 0x146a2c0 in 0x146a282..0x146a6b3: r15+0x470 :: cmp    BYTE PTR [r15+0x470],0x0
- 0x146a3f5 in 0x146a282..0x146a6b3: r15+0x470 :: cmp    BYTE PTR [r15+0x470],0x0
- 0x146b660 in 0x146b635..0x146b6ae: rbx+0x470 :: cmp    BYTE PTR [rbx+0x470],0x0
- 0x14c4397 in 0x14c431d..0x14c5124: rdi+0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0x14c988c in 0x14c97b0..0x14c9945: r15+0x470 :: cmp    BYTE PTR [r15+0x470],0x0
- 0x152323c in 0x15229bc..0x1523550: r14+0x470 :: mov    rdi,QWORD PTR [r14+0x470]
- 0x152324a in 0x15229bc..0x1523550: rbx+0x470 WRITE :: mov    QWORD PTR [rbx+0x470],rax
- 0x1524704 in 0x15246f2..0x1524868: rdi+0x470 :: mov    ecx,DWORD PTR [rdi+0x470]
- 0x1597059 in 0x1596e2c..0x159755a: r15+0x470 :: mov    rcx,QWORD PTR [r15+0x470]
- 0x15970ba in 0x1596e2c..0x159755a: r15+0x470 :: mov    rcx,QWORD PTR [r15+0x470]
- 0x159774e in 0x159765c..0x1597999: r15+0x470 :: mov    rcx,QWORD PTR [r15+0x470]
- 0x15f2136 in 0x15f1cb0..0x15f2493: r14+0x470 WRITE :: mov    QWORD PTR [r14+0x470],r12

## Direct +0x470 writers

### 0xcba8e9 (0xcb7a20..0xcbc937) r15+0x470
      cba8b1:	48 8b bc 24 f0 01 00 	mov    rdi,QWORD PTR [rsp+0x1f0]
      cba8b8:	00 
      cba8b9:	49 89 bf 58 04 00 00 	mov    QWORD PTR [r15+0x458],rdi
      cba8c0:	48 8b bc 24 a0 0a 00 	mov    rdi,QWORD PTR [rsp+0xaa0]
      cba8c7:	00 
      cba8c8:	49 89 bf 60 04 00 00 	mov    QWORD PTR [r15+0x460],rdi
      cba8cf:	45 89 87 68 04 00 00 	mov    DWORD PTR [r15+0x468],r8d
      cba8d6:	8b bc 24 7c 01 00 00 	mov    edi,DWORD PTR [rsp+0x17c]
      cba8dd:	41 89 bf 6c 04 00 00 	mov    DWORD PTR [r15+0x46c],edi
      cba8e4:	40 8a 7c 24 1f       	mov    dil,BYTE PTR [rsp+0x1f]
      cba8e9:	41 88 bf 70 04 00 00 	mov    BYTE PTR [r15+0x470],dil
      cba8f0:	40 8a 7c 24 1e       	mov    dil,BYTE PTR [rsp+0x1e]
      cba8f5:	41 88 bf 71 04 00 00 	mov    BYTE PTR [r15+0x471],dil
      cba8fc:	40 8a 7c 24 1d       	mov    dil,BYTE PTR [rsp+0x1d]
      cba901:	41 88 bf 72 04 00 00 	mov    BYTE PTR [r15+0x472],dil
      cba908:	8b bc 24 38 02 00 00 	mov    edi,DWORD PTR [rsp+0x238]
      cba90f:	41 89 bf 73 04 00 00 	mov    DWORD PTR [r15+0x473],edi
      cba916:	40 8a bc 24 3c 02 00 	mov    dil,BYTE PTR [rsp+0x23c]
      cba91d:	00 
      cba91e:	41 88 bf 77 04 00 00 	mov    BYTE PTR [r15+0x477],dil
      cba925:	8b bc 24 78 01 00 00 	mov    edi,DWORD PTR [rsp+0x178]
      cba92c:	41 89 bf 78 04 00 00 	mov    DWORD PTR [r15+0x478],edi

### 0xd7e678 (0xd7e33e..0xd7eb7e) rbx+0x470
      d7e651:	74 0f                	je     d7e662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b6e8>
      d7e653:	49 8d 74 24 10       	lea    rsi,[r12+0x10]
      d7e658:	4c 89 f7             	mov    rdi,r14
      d7e65b:	e8 da 4b e9 ff       	call   c1323a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1601da>
      d7e660:	eb e8                	jmp    d7e64a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b6d0>
      d7e662:	48 83 bb 78 04 00 00 	cmp    QWORD PTR [rbx+0x478],0x0
      d7e669:	00 
      d7e66a:	74 3a                	je     d7e6a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b72c>
      d7e66c:	48 8b bb 70 04 00 00 	mov    rdi,QWORD PTR [rbx+0x470]
      d7e673:	e8 54 6e ff ff       	call   d754cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42552>
      d7e678:	48 83 a3 70 04 00 00 	and    QWORD PTR [rbx+0x470],0x0
      d7e67f:	00 
      d7e680:	48 8b 83 68 04 00 00 	mov    rax,QWORD PTR [rbx+0x468]
      d7e687:	48 85 c0             	test   rax,rax
      d7e68a:	74 12                	je     d7e69e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b724>
      d7e68c:	31 c9                	xor    ecx,ecx
      d7e68e:	49 8b 17             	mov    rdx,QWORD PTR [r15]
      d7e691:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
      d7e696:	48 ff c1             	inc    rcx
      d7e699:	48 39 c8             	cmp    rax,rcx
      d7e69c:	75 f0                	jne    d7e68e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4b714>
      d7e69e:	48 83 a3 78 04 00 00 	and    QWORD PTR [rbx+0x478],0x0

### 0xe10685 (0xe105b4..0xe107a9) r13+0x470
      e1065c:	41 89 c4             	mov    r12d,eax
      e1065f:	4c 89 34 24          	mov    QWORD PTR [rsp],r14
      e10663:	41 89 ee             	mov    r14d,ebp
      e10666:	48 8d 35 0f 19 64 ff 	lea    rsi,[rip+0xffffffffff64190f]        # 451f7c <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17b88>
      e1066d:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
      e10672:	e8 07 94 c6 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      e10677:	31 c0                	xor    eax,eax
      e10679:	4c 8d ac 24 b8 00 00 	lea    r13,[rsp+0xb8]
      e10680:	00 
      e10681:	41 88 45 00          	mov    BYTE PTR [r13+0x0],al
      e10685:	41 88 85 70 04 00 00 	mov    BYTE PTR [r13+0x470],al
      e1068c:	4c 8d 7c 24 40       	lea    r15,[rsp+0x40]
      e10691:	41 88 07             	mov    BYTE PTR [r15],al
      e10694:	41 88 47 70          	mov    BYTE PTR [r15+0x70],al
      e10698:	0f 57 c0             	xorps  xmm0,xmm0
      e1069b:	48 8d 6c 24 10       	lea    rbp,[rsp+0x10]
      e106a0:	0f 29 45 00          	movaps XMMWORD PTR [rbp+0x0],xmm0
      e106a4:	48 83 65 10 00       	and    QWORD PTR [rbp+0x10],0x0
      e106a9:	45 0f b6 c6          	movzx  r8d,r14b
      e106ad:	45 0f b6 cc          	movzx  r9d,r12b
      e106b1:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
      e106b6:	48 89 df             	mov    rdi,rbx

### 0xe12b20 (0xe12b18..0xe12b51) rdi+0x470
      e12b07:	48 89 fb             	mov    rbx,rdi
      e12b0a:	e8 6d 1d 69 00       	call   14a487c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2e9e00>
      e12b0f:	c6 83 e0 02 00 00 01 	mov    BYTE PTR [rbx+0x2e0],0x1
      e12b16:	5b                   	pop    rbx
      e12b17:	c3                   	ret
      e12b18:	41 56                	push   r14
      e12b1a:	53                   	push   rbx
      e12b1b:	50                   	push   rax
      e12b1c:	31 c0                	xor    eax,eax
      e12b1e:	88 07                	mov    BYTE PTR [rdi],al
      e12b20:	88 87 70 04 00 00    	mov    BYTE PTR [rdi+0x470],al
      e12b26:	38 86 70 04 00 00    	cmp    BYTE PTR [rsi+0x470],al
      e12b2c:	74 08                	je     e12b36 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbbc>
      e12b2e:	48 89 fb             	mov    rbx,rdi
      e12b31:	e8 f8 1d 00 00       	call   e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
      e12b36:	48 83 c4 08          	add    rsp,0x8
      e12b3a:	5b                   	pop    rbx
      e12b3b:	41 5e                	pop    r14
      e12b3d:	c3                   	ret
      e12b3e:	49 89 c6             	mov    r14,rax
      e12b41:	48 89 df             	mov    rdi,rbx
      e12b44:	e8 7d 9d ff ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>

### 0xe12b5b (0xe12b52..0xe12b64) rbx+0x470
      e12b3d:	c3                   	ret
      e12b3e:	49 89 c6             	mov    r14,rax
      e12b41:	48 89 df             	mov    rdi,rbx
      e12b44:	e8 7d 9d ff ff       	call   e0c8c6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd994c>
      e12b49:	4c 89 f7             	mov    rdi,r14
      e12b4c:	e8 7f d1 c5 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      e12b51:	cc                   	int3
      e12b52:	53                   	push   rbx
      e12b53:	48 89 fb             	mov    rbx,rdi
      e12b56:	e8 69 67 86 00       	call   16792c4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d430>
      e12b5b:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
      e12b62:	5b                   	pop    rbx
      e12b63:	c3                   	ret
      e12b64:	53                   	push   rbx
      e12b65:	48 b8 4a 92 24 49 92 	movabs rax,0x24924924924924a
      e12b6c:	24 49 02 
      e12b6f:	48 39 c7             	cmp    rdi,rax
      e12b72:	73 11                	jae    e12b85 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfc0b>
      e12b74:	48 89 fb             	mov    rbx,rdi
      e12b77:	48 6b ff 70          	imul   rdi,rdi,0x70
      e12b7b:	e8 80 b3 9d 00       	call   17edf00 <_Znwm@plt>
      e12b80:	48 89 da             	mov    rdx,rbx

### 0xe14937 (0xe1492e..0xe14940) rbx+0x470
      e14913:	48 8d 7b 30          	lea    rdi,[rbx+0x30]
      e14917:	e8 14 24 c9 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
      e1491c:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
      e14920:	e8 6b 95 9d 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e14925:	48 89 df             	mov    rdi,rbx
      e14928:	5b                   	pop    rbx
      e14929:	e9 62 95 9d 00       	jmp    17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      e1492e:	53                   	push   rbx
      e1492f:	48 89 fb             	mov    rbx,rdi
      e14932:	e8 89 4b 86 00       	call   16794c0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d62c>
      e14937:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
      e1493e:	5b                   	pop    rbx
      e1493f:	c3                   	ret
      e14940:	50                   	push   rax
      e14941:	e8 bc 54 9c 00       	call   17d9e02 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5c23>
      e14946:	58                   	pop    rax
      e14947:	c3                   	ret
      e14948:	48 89 c7             	mov    rdi,rax
      e1494b:	e8 55 51 c6 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      e14950:	41 56                	push   r14
      e14952:	53                   	push   rbx
      e14953:	50                   	push   rax

### 0xe65dc2 (0xe65db0..0xe65dcb) rbx+0x470
      e65da1:	e8 e8 f8 ff ff       	call   e6568e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2caa4>
      e65da6:	c6 83 68 09 00 00 00 	mov    BYTE PTR [rbx+0x968],0x0
      e65dad:	5b                   	pop    rbx
      e65dae:	c3                   	ret
      e65daf:	cc                   	int3
      e65db0:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
      e65db7:	74 11                	je     e65dca <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d1e0>
      e65db9:	53                   	push   rbx
      e65dba:	48 89 fb             	mov    rbx,rdi
      e65dbd:	e8 a6 36 81 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
      e65dc2:	c6 83 70 04 00 00 00 	mov    BYTE PTR [rbx+0x470],0x0
      e65dc9:	5b                   	pop    rbx
      e65dca:	c3                   	ret
      e65dcb:	cc                   	int3
      e65dcc:	41 56                	push   r14
      e65dce:	53                   	push   rbx
      e65dcf:	50                   	push   rax
      e65dd0:	49 89 f6             	mov    r14,rsi
      e65dd3:	48 89 fb             	mov    rbx,rdi
      e65dd6:	e8 57 b9 95 00       	call   17c1732 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17589e>
      e65ddb:	41 8b 46 18          	mov    eax,DWORD PTR [r14+0x18]
      e65ddf:	89 43 18             	mov    DWORD PTR [rbx+0x18],eax

### 0xe65ea2 (0xe65e9e..0xe65eb5) rdi+0x470
      e65e80:	0f 11 8b 51 09 00 00 	movups XMMWORD PTR [rbx+0x951],xmm1
      e65e87:	0f 11 83 48 09 00 00 	movups XMMWORD PTR [rbx+0x948],xmm0
      e65e8e:	c6 83 68 09 00 00 01 	mov    BYTE PTR [rbx+0x968],0x1
      e65e95:	48 83 c4 08          	add    rsp,0x8
      e65e99:	5b                   	pop    rbx
      e65e9a:	41 5e                	pop    r14
      e65e9c:	c3                   	ret
      e65e9d:	cc                   	int3
      e65e9e:	31 c0                	xor    eax,eax
      e65ea0:	88 07                	mov    BYTE PTR [rdi],al
      e65ea2:	88 87 70 04 00 00    	mov    BYTE PTR [rdi+0x470],al
      e65ea8:	38 86 70 04 00 00    	cmp    BYTE PTR [rsi+0x470],al
      e65eae:	0f 85 9e cc fa ff    	jne    e12b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbd8>
      e65eb4:	c3                   	ret
      e65eb5:	cc                   	int3
      e65eb6:	41 56                	push   r14
      e65eb8:	53                   	push   rbx
      e65eb9:	50                   	push   rax
      e65eba:	48 89 fb             	mov    rbx,rdi
      e65ebd:	48 8d 05 b4 8d 9c 00 	lea    rax,[rip+0x9c8db4]        # 182ec78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc10>
      e65ec4:	48 89 07             	mov    QWORD PTR [rdi],rax
      e65ec7:	48 8b bf b0 00 00 00 	mov    rdi,QWORD PTR [rdi+0xb0]

### 0xe65fe5 (0xe65f44..0xe66088) r15+0x470
      e65fc0:	00 
      e65fc1:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
      e65fc5:	48 85 db             	test   rbx,rbx
      e65fc8:	74 05                	je     e65fcf <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d3e5>
      e65fca:	f0 48 ff 43 10       	lock inc QWORD PTR [rbx+0x10]
      e65fcf:	49 8b bf 80 00 00 00 	mov    rdi,QWORD PTR [r15+0x80]
      e65fd6:	e8 87 44 c1 ff       	call   a7a462 <JNI_OnUnload@@Base+0x1d2f>
      e65fdb:	31 ed                	xor    ebp,ebp
      e65fdd:	4c 8d 7c 24 30       	lea    r15,[rsp+0x30]
      e65fe2:	41 88 2f             	mov    BYTE PTR [r15],bpl
      e65fe5:	41 88 af 70 04 00 00 	mov    BYTE PTR [r15+0x470],bpl
      e65fec:	4c 8d 64 24 10       	lea    r12,[rsp+0x10]
      e65ff1:	41 88 2c 24          	mov    BYTE PTR [r12],bpl
      e65ff5:	41 88 6c 24 18       	mov    BYTE PTR [r12+0x18],bpl
      e65ffa:	6a 01                	push   0x1
      e65ffc:	5a                   	pop    rdx
      e65ffd:	4c 89 f7             	mov    rdi,r14
      e66000:	4c 89 fe             	mov    rsi,r15
      e66003:	4c 89 e1             	mov    rcx,r12
      e66006:	49 89 c0             	mov    r8,rax
      e66009:	e8 66 05 00 00       	call   e66574 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d98a>
      e6600e:	4c 89 e7             	mov    rdi,r12

### 0xf19878 (0xf197e6..0xf198ea) rbx+0x470
      f19855:	48 89 df             	mov    rdi,rbx
      f19858:	4c 89 f6             	mov    rsi,r14
      f1985b:	e8 f2 92 ef ff       	call   e12b52 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdfbd8>
      f19860:	4c 89 f7             	mov    rdi,r14
      f19863:	e8 00 fc 75 00       	call   1679468 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2d5d4>
      f19868:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      f1986d:	e8 0e bb fe ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      f19872:	eb 0a                	jmp    f1987e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0c94>
      f19874:	31 c0                	xor    eax,eax
      f19876:	88 03                	mov    BYTE PTR [rbx],al
      f19878:	88 83 70 04 00 00    	mov    BYTE PTR [rbx+0x470],al
      f1987e:	48 8d bc 24 70 05 00 	lea    rdi,[rsp+0x570]
      f19885:	00 
      f19886:	e8 f5 ba fe ff       	call   f05380 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcc796>
      f1988b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      f19892:	00 00 
      f19894:	48 3b 84 24 68 06 00 	cmp    rax,QWORD PTR [rsp+0x668]
      f1989b:	00 
      f1989c:	75 47                	jne    f198e5 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe0cfb>
      f1989e:	48 81 c4 70 06 00 00 	add    rsp,0x670
      f198a5:	5b                   	pop    rbx
      f198a6:	41 5e                	pop    r14

### 0xf1ba88 (0xf1b9da..0xf1bd5c) rcx+0x470
      f1ba63:	0f 29 84 24 d0 00 00 	movaps XMMWORD PTR [rsp+0xd0],xmm0
      f1ba6a:	00 
      f1ba6b:	41 80 bf 30 09 00 00 	cmp    BYTE PTR [r15+0x930],0x0
      f1ba72:	00 
      f1ba73:	74 59                	je     f1bace <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe2ee4>
      f1ba75:	49 81 c7 c0 04 00 00 	add    r15,0x4c0
      f1ba7c:	31 c0                	xor    eax,eax
      f1ba7e:	48 8d 8c 24 18 01 00 	lea    rcx,[rsp+0x118]
      f1ba85:	00 
      f1ba86:	88 01                	mov    BYTE PTR [rcx],al
      f1ba88:	88 81 70 04 00 00    	mov    BYTE PTR [rcx+0x470],al
      f1ba8e:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      f1ba95:	00 
      f1ba96:	48 89 de             	mov    rsi,rbx
      f1ba99:	4c 89 fa             	mov    rdx,r15
      f1ba9c:	e8 b9 0c 00 00       	call   f1c75a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3b70>
      f1baa1:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]
      f1baa8:	00 
      f1baa9:	4c 8d bc 24 80 00 00 	lea    r15,[rsp+0x80]
      f1bab0:	00 
      f1bab1:	4c 89 fe             	mov    rsi,r15
      f1bab4:	e8 43 12 00 00       	call   f1ccfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4112>

### 0xf1be59 (0xf1bd5c..0xf1c0d6) rcx+0x470
      f1be34:	0f 29 84 24 c0 00 00 	movaps XMMWORD PTR [rsp+0xc0],xmm0
      f1be3b:	00 
      f1be3c:	41 80 be 30 09 00 00 	cmp    BYTE PTR [r14+0x930],0x0
      f1be43:	00 
      f1be44:	74 53                	je     f1be99 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe32af>
      f1be46:	49 81 c6 c0 04 00 00 	add    r14,0x4c0
      f1be4d:	31 c0                	xor    eax,eax
      f1be4f:	48 8d 8c 24 28 01 00 	lea    rcx,[rsp+0x128]
      f1be56:	00 
      f1be57:	88 01                	mov    BYTE PTR [rcx],al
      f1be59:	88 81 70 04 00 00    	mov    BYTE PTR [rcx+0x470],al
      f1be5f:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
      f1be64:	48 89 de             	mov    rsi,rbx
      f1be67:	4c 89 f2             	mov    rdx,r14
      f1be6a:	e8 eb 08 00 00       	call   f1c75a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3b70>
      f1be6f:	48 8d bc 24 c0 00 00 	lea    rdi,[rsp+0xc0]
      f1be76:	00 
      f1be77:	4c 8d 74 24 70       	lea    r14,[rsp+0x70]
      f1be7c:	4c 89 f6             	mov    rsi,r14
      f1be7f:	e8 78 0e 00 00       	call   f1ccfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe4112>
      f1be84:	4c 89 f7             	mov    rdi,r14
      f1be87:	e8 22 f7 ff ff       	call   f1b5ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe29c4>

### 0xf1c19d (0xf1c0d6..0xf1c69b) rcx+0x470
      f1c177:	e8 ea dc 7a 00       	call   16c9e66 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7dfd2>
      f1c17c:	4c 89 ff             	mov    rdi,r15
      f1c17f:	e8 d1 78 fe ff       	call   f03a55 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xcae6b>
      f1c184:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
      f1c189:	48 89 c6             	mov    rsi,rax
      f1c18c:	e8 af 1d 8d 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
      f1c191:	31 c0                	xor    eax,eax
      f1c193:	48 8d 8c 24 a0 00 00 	lea    rcx,[rsp+0xa0]
      f1c19a:	00 
      f1c19b:	88 01                	mov    BYTE PTR [rcx],al
      f1c19d:	88 81 70 04 00 00    	mov    BYTE PTR [rcx+0x470],al
      f1c1a3:	48 8d bc 24 28 06 00 	lea    rdi,[rsp+0x628]
      f1c1aa:	00 
      f1c1ab:	48 89 de             	mov    rsi,rbx
      f1c1ae:	4c 89 fa             	mov    rdx,r15
      f1c1b1:	e8 a4 05 00 00       	call   f1c75a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe3b70>
      f1c1b6:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      f1c1ba:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
      f1c1c1:	00 
      f1c1c2:	48 8d 94 24 80 06 00 	lea    rdx,[rsp+0x680]
      f1c1c9:	00 
      f1c1ca:	48 8d 4c 24 08       	lea    rcx,[rsp+0x8]

### 0xf46138 (0xf46036..0xf461e0) r14+0x470
      f46117:	6a fe                	push   0xfffffffffffffffe
      f46119:	eb 41                	jmp    f4615c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d572>
      f4611b:	31 db                	xor    ebx,ebx
      f4611d:	e9 90 00 00 00       	jmp    f461b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5c8>
      f46122:	4d 8d 7e 28          	lea    r15,[r14+0x28]
      f46126:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
      f4612d:	00 
      f4612e:	74 10                	je     f46140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d556>
      f46130:	4c 89 ff             	mov    rdi,r15
      f46133:	e8 a8 00 00 00       	call   f461e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5f6>
      f46138:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x0
      f4613f:	00 
      f46140:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      f46145:	4c 89 ff             	mov    rdi,r15
      f46148:	e8 a9 00 00 00       	call   f461f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d60c>
      f4614d:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x1
      f46154:	01 
      f46155:	40 84 ed             	test   bpl,bpl
      f46158:	74 4e                	je     f461a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5be>
      f4615a:	6a ff                	push   0xffffffffffffffff
      f4615c:	58                   	pop    rax
      f4615d:	49 89 06             	mov    QWORD PTR [r14],rax

### 0xf4614d (0xf46036..0xf461e0) r14+0x470
      f46126:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
      f4612d:	00 
      f4612e:	74 10                	je     f46140 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d556>
      f46130:	4c 89 ff             	mov    rdi,r15
      f46133:	e8 a8 00 00 00       	call   f461e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5f6>
      f46138:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x0
      f4613f:	00 
      f46140:	48 8d 74 24 18       	lea    rsi,[rsp+0x18]
      f46145:	4c 89 ff             	mov    rdi,r15
      f46148:	e8 a9 00 00 00       	call   f461f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d60c>
      f4614d:	41 c6 86 70 04 00 00 	mov    BYTE PTR [r14+0x470],0x1
      f46154:	01 
      f46155:	40 84 ed             	test   bpl,bpl
      f46158:	74 4e                	je     f461a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5be>
      f4615a:	6a ff                	push   0xffffffffffffffff
      f4615c:	58                   	pop    rax
      f4615d:	49 89 06             	mov    QWORD PTR [r14],rax
      f46160:	eb 05                	jmp    f46167 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d57d>
      f46162:	40 84 ed             	test   bpl,bpl
      f46165:	74 41                	je     f461a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10d5be>
      f46167:	0f 57 c0             	xorps  xmm0,xmm0
      f4616a:	49 89 e7             	mov    r15,rsp

### 0x1040c1f (0x10409b6..0x1040cd6) rbx+0x470
     1040bf6:	e8 ed 9b 79 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1040bfb:	4c 89 f7             	mov    rdi,r14
     1040bfe:	4c 89 ee             	mov    rsi,r13
     1040c01:	e8 38 8e 79 00       	call   17d9a3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x585f>
     1040c06:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
     1040c0a:	e8 77 d8 a5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1040c0f:	4c 89 ff             	mov    rdi,r15
     1040c12:	e8 d1 9b 79 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     1040c17:	31 c0                	xor    eax,eax
     1040c19:	88 83 50 04 00 00    	mov    BYTE PTR [rbx+0x450],al
     1040c1f:	88 83 70 04 00 00    	mov    BYTE PTR [rbx+0x470],al
     1040c25:	0f 57 c0             	xorps  xmm0,xmm0
     1040c28:	0f 11 83 78 04 00 00 	movups XMMWORD PTR [rbx+0x478],xmm0
     1040c2f:	0f 11 83 88 04 00 00 	movups XMMWORD PTR [rbx+0x488],xmm0
     1040c36:	c7 83 98 04 00 00 00 	mov    DWORD PTR [rbx+0x498],0x3f800000
     1040c3d:	00 80 3f 
     1040c40:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1040c47:	00 00 
     1040c49:	48 3b 84 24 b0 00 00 	cmp    rax,QWORD PTR [rsp+0xb0]
     1040c50:	00 
     1040c51:	75 7e                	jne    1040cd1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2080e7>
     1040c53:	48 81 c4 b8 00 00 00 	add    rsp,0xb8

### 0x1040d46 (0x1040cd6..0x1040ed3) rbx+0x470
     1040d23:	4c 89 f7             	mov    rdi,r14
     1040d26:	4c 89 fe             	mov    rsi,r15
     1040d29:	e8 00 ad a3 ff       	call   a7ba2e <JNI_OnUnload@@Base+0x32fb>
     1040d2e:	41 8b 47 18          	mov    eax,DWORD PTR [r15+0x18]
     1040d32:	89 83 68 04 00 00    	mov    DWORD PTR [rbx+0x468],eax
     1040d38:	eb 44                	jmp    1040d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208194>
     1040d3a:	84 c0                	test   al,al
     1040d3c:	74 11                	je     1040d4f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208165>
     1040d3e:	4c 89 f7             	mov    rdi,r14
     1040d41:	e8 4a d1 7a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1040d46:	c6 83 70 04 00 00 00 	mov    BYTE PTR [rbx+0x470],0x0
     1040d4d:	eb 2f                	jmp    1040d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208194>
     1040d4f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1040d54:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1040d58:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     1040d5c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1040d60:	0f 57 c0             	xorps  xmm0,xmm0
     1040d63:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     1040d69:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1040d6d:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
     1040d71:	89 83 68 04 00 00    	mov    DWORD PTR [rbx+0x468],eax
     1040d77:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1

### 0x1040d77 (0x1040cd6..0x1040ed3) rbx+0x470
     1040d4d:	eb 2f                	jmp    1040d7e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208194>
     1040d4f:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
     1040d54:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
     1040d58:	0f 28 04 24          	movaps xmm0,XMMWORD PTR [rsp]
     1040d5c:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
     1040d60:	0f 57 c0             	xorps  xmm0,xmm0
     1040d63:	48 83 64 24 10 00    	and    QWORD PTR [rsp+0x10],0x0
     1040d69:	0f 29 04 24          	movaps XMMWORD PTR [rsp],xmm0
     1040d6d:	8b 44 24 18          	mov    eax,DWORD PTR [rsp+0x18]
     1040d71:	89 83 68 04 00 00    	mov    DWORD PTR [rbx+0x468],eax
     1040d77:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
     1040d7e:	48 89 e7             	mov    rdi,rsp
     1040d81:	e8 74 41 b1 ff       	call   b54efa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1e9a>
     1040d86:	48 8d bb 78 04 00 00 	lea    rdi,[rbx+0x478]
     1040d8d:	e8 b4 7c c6 ff       	call   ca8a46 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1f59e6>
     1040d92:	80 bb 70 04 00 00 00 	cmp    BYTE PTR [rbx+0x470],0x0
     1040d99:	0f 84 d2 00 00 00    	je     1040e71 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208287>
     1040d9f:	83 bb 68 04 00 00 00 	cmp    DWORD PTR [rbx+0x468],0x0
     1040da6:	74 4b                	je     1040df3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208209>
     1040da8:	8b 83 cc 01 00 00    	mov    eax,DWORD PTR [rbx+0x1cc]
     1040dae:	83 f8 02             	cmp    eax,0x2
     1040db1:	74 77                	je     1040e2a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x208240>

### 0x107beff (0x107a02c..0x107e484) r15+0x470
     107becd:	00 00 
     107becf:	66 41 0f 7f 87 30 04 	movdqa XMMWORD PTR [r15+0x430],xmm0
     107bed6:	00 00 
     107bed8:	41 89 9f 40 04 00 00 	mov    DWORD PTR [r15+0x440],ebx
     107bedf:	48 8d 05 12 5f 80 00 	lea    rax,[rip+0x805f12]        # 1881df8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e4e0>
     107bee6:	49 89 87 48 04 00 00 	mov    QWORD PTR [r15+0x448],rax
     107beed:	66 41 0f 7f 87 50 04 	movdqa XMMWORD PTR [r15+0x450],xmm0
     107bef4:	00 00 
     107bef6:	66 41 0f 7f 87 60 04 	movdqa XMMWORD PTR [r15+0x460],xmm0
     107befd:	00 00 
     107beff:	41 89 9f 70 04 00 00 	mov    DWORD PTR [r15+0x470],ebx
     107bf06:	49 83 a7 a0 04 00 00 	and    QWORD PTR [r15+0x4a0],0x0
     107bf0d:	00 
     107bf0e:	48 8d 05 b3 56 80 00 	lea    rax,[rip+0x8056b3]        # 18815c8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3dcb0>
     107bf15:	49 89 87 78 04 00 00 	mov    QWORD PTR [r15+0x478],rax
     107bf1c:	66 41 0f 7f 87 80 04 	movdqa XMMWORD PTR [r15+0x480],xmm0
     107bf23:	00 00 
     107bf25:	66 41 0f 7f 87 90 04 	movdqa XMMWORD PTR [r15+0x490],xmm0
     107bf2c:	00 00 
     107bf2e:	41 89 9f a0 04 00 00 	mov    DWORD PTR [r15+0x4a0],ebx
     107bf35:	48 8d 05 cc 60 80 00 	lea    rax,[rip+0x8060cc]        # 1882008 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x3e6f0>
     107bf3c:	49 89 87 a8 04 00 00 	mov    QWORD PTR [r15+0x4a8],rax

### 0x10f9551 (0x10f9518..0x10f9559) rbx+0x470
     10f9535:	48 89 d7             	mov    rdi,rdx
     10f9538:	89 ce                	mov    esi,ecx
     10f953a:	31 d2                	xor    edx,edx
     10f953c:	e8 85 04 58 00       	call   16799c6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2db32>
     10f9541:	48 89 df             	mov    rdi,rbx
     10f9544:	48 89 c6             	mov    rsi,rax
     10f9547:	5b                   	pop    rbx
     10f9548:	e9 e1 b3 d1 ff       	jmp    e1492e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xe19b4>
     10f954d:	31 c0                	xor    eax,eax
     10f954f:	88 03                	mov    BYTE PTR [rbx],al
     10f9551:	88 83 70 04 00 00    	mov    BYTE PTR [rbx+0x470],al
     10f9557:	5b                   	pop    rbx
     10f9558:	c3                   	ret
     10f9559:	cc                   	int3
     10f955a:	55                   	push   rbp
     10f955b:	41 57                	push   r15
     10f955d:	41 56                	push   r14
     10f955f:	41 55                	push   r13
     10f9561:	41 54                	push   r12
     10f9563:	53                   	push   rbx
     10f9564:	48 83 ec 28          	sub    rsp,0x28
     10f9568:	49 89 fe             	mov    r14,rdi

### 0x11cbeb0 (0x11ca706..0x11cd602) r15+0x470
     11cbe7a:	49 8d 87 58 04 00 00 	lea    rax,[r15+0x458]
     11cbe81:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
     11cbe86:	49 8d 87 60 04 00 00 	lea    rax,[r15+0x460]
     11cbe8d:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
     11cbe94:	00 
     11cbe95:	4d 89 af 60 04 00 00 	mov    QWORD PTR [r15+0x460],r13
     11cbe9c:	4d 8d b7 68 04 00 00 	lea    r14,[r15+0x468]
     11cbea3:	49 83 a7 68 04 00 00 	and    QWORD PTR [r15+0x468],0x0
     11cbeaa:	00 
     11cbeab:	48 8b 6c 24 10       	mov    rbp,QWORD PTR [rsp+0x10]
     11cbeb0:	49 89 af 70 04 00 00 	mov    QWORD PTR [r15+0x470],rbp
     11cbeb7:	6a 20                	push   0x20
     11cbeb9:	5f                   	pop    rdi
     11cbeba:	e8 41 20 62 00       	call   17edf00 <_Znwm@plt>
     11cbebf:	49 89 c5             	mov    r13,rax
     11cbec2:	0f 57 c0             	xorps  xmm0,xmm0
     11cbec5:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
     11cbec9:	48 8d 05 00 4a 63 00 	lea    rax,[rip+0x634a00]        # 18008d0 <_ZTIN4asio22service_already_existsE@@Base+0x20b8>
     11cbed0:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
     11cbed4:	4c 89 e8             	mov    rax,r13
     11cbed7:	48 83 c0 18          	add    rax,0x18
     11cbedb:	4d 89 7d 18          	mov    QWORD PTR [r13+0x18],r15

### 0x1237659 (0x1235556..0x1239d28) rax+0x470
     1237634:	31 d2                	xor    edx,edx
     1237636:	48 f7 f5             	div    rbp
     1237639:	48 89 d0             	mov    rax,rdx
     123763c:	48 c1 e0 03          	shl    rax,0x3
     1237640:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
     1237645:	48 03 01             	add    rax,QWORD PTR [rcx]
     1237648:	4c 89 28             	mov    QWORD PTR [rax],r13
     123764b:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
     1237652:	00 00 
     1237654:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1237659:	48 ff 80 70 04 00 00 	inc    QWORD PTR [rax+0x470]
     1237660:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
     1237667:	00 
     1237668:	e8 35 3d 00 00       	call   123b3a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80926>
     123766d:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
     1237670:	4d 85 ff             	test   r15,r15
     1237673:	0f 85 6e fd ff ff    	jne    12373e7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7c96b>
     1237679:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     123767e:	48 8d b9 80 04 00 00 	lea    rdi,[rcx+0x480]
     1237685:	0f 57 c0             	xorps  xmm0,xmm0
     1237688:	0f 11 81 90 04 00 00 	movups XMMWORD PTR [rcx+0x490],xmm0
     123768f:	0f 11 81 80 04 00 00 	movups XMMWORD PTR [rcx+0x480],xmm0

### 0x123e733 (0x123c81c..0x1240fd8) rbx+0x470
     123e714:	00 
     123e715:	48 8b 83 60 04 00 00 	mov    rax,QWORD PTR [rbx+0x460]
     123e71c:	48 85 c0             	test   rax,rax
     123e71f:	74 12                	je     123e733 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83cb7>
     123e721:	31 c9                	xor    ecx,ecx
     123e723:	49 8b 16             	mov    rdx,QWORD PTR [r14]
     123e726:	48 83 24 ca 00       	and    QWORD PTR [rdx+rcx*8],0x0
     123e72b:	48 ff c1             	inc    rcx
     123e72e:	48 39 c8             	cmp    rax,rcx
     123e731:	75 f0                	jne    123e723 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83ca7>
     123e733:	48 83 a3 70 04 00 00 	and    QWORD PTR [rbx+0x470],0x0
     123e73a:	00 
     123e73b:	48 8b b4 24 10 02 00 	mov    rsi,QWORD PTR [rsp+0x210]
     123e742:	00 
     123e743:	48 83 a4 24 10 02 00 	and    QWORD PTR [rsp+0x210],0x0
     123e74a:	00 00 
     123e74c:	4c 89 f7             	mov    rdi,r14
     123e74f:	e8 42 10 86 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     123e754:	48 8b 8c 24 18 02 00 	mov    rcx,QWORD PTR [rsp+0x218]
     123e75b:	00 
     123e75c:	48 89 8b 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rcx
     123e763:	48 83 a4 24 18 02 00 	and    QWORD PTR [rsp+0x218],0x0

### 0x123e774 (0x123c81c..0x1240fd8) rbx+0x470
     123e74a:	00 00 
     123e74c:	4c 89 f7             	mov    rdi,r14
     123e74f:	e8 42 10 86 ff       	call   a9f796 <JNI_OnUnload@@Base+0x27063>
     123e754:	48 8b 8c 24 18 02 00 	mov    rcx,QWORD PTR [rsp+0x218]
     123e75b:	00 
     123e75c:	48 89 8b 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rcx
     123e763:	48 83 a4 24 18 02 00 	and    QWORD PTR [rsp+0x218],0x0
     123e76a:	00 00 
     123e76c:	48 8b 94 24 28 02 00 	mov    rdx,QWORD PTR [rsp+0x228]
     123e773:	00 
     123e774:	48 89 93 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rdx
     123e77b:	f3 0f 10 84 24 30 02 	movss  xmm0,DWORD PTR [rsp+0x230]
     123e782:	00 00 
     123e784:	f3 0f 11 83 78 04 00 	movss  DWORD PTR [rbx+0x478],xmm0
     123e78b:	00 
     123e78c:	48 8b 84 24 20 02 00 	mov    rax,QWORD PTR [rsp+0x220]
     123e793:	00 
     123e794:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     123e79b:	48 85 d2             	test   rdx,rdx
     123e79e:	74 3b                	je     123e7db <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x83d5f>
     123e7a0:	48 81 c3 68 04 00 00 	add    rbx,0x468
     123e7a7:	48 8b 40 08          	mov    rax,QWORD PTR [rax+0x8]

### 0x12448fa (0x1244558..0x1244ad3) rbx+0x470
     12448c0:	e8 79 05 00 00       	call   1244e3e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8a3c2>
     12448c5:	48 8d bb b8 02 00 00 	lea    rdi,[rbx+0x2b8]
     12448cc:	48 89 c6             	mov    rsi,rax
     12448cf:	e8 94 6f ff ff       	call   123b868 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x80dec>
     12448d4:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]
     12448d9:	8a 81 28 02 00 00    	mov    al,BYTE PTR [rcx+0x228]
     12448df:	88 83 68 04 00 00    	mov    BYTE PTR [rbx+0x468],al
     12448e5:	48 8b 81 20 02 00 00 	mov    rax,QWORD PTR [rcx+0x220]
     12448ec:	48 89 83 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rax
     12448f3:	49 8b 87 20 02 00 00 	mov    rax,QWORD PTR [r15+0x220]
     12448fa:	48 89 83 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rax
     1244901:	41 8a 87 28 02 00 00 	mov    al,BYTE PTR [r15+0x228]
     1244908:	88 83 78 04 00 00    	mov    BYTE PTR [rbx+0x478],al
     124490e:	48 8d 7c 24 50       	lea    rdi,[rsp+0x50]
     1244913:	e8 78 95 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1244918:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
     124491d:	e8 6e 95 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1244922:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     1244929:	00 
     124492a:	e8 61 95 5a 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124492f:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     1244936:	00 

### 0x133ea1a (0x133e9da..0x133ea42) rbx+0x470
     133e9e5:	48 89 fb             	mov    rbx,rdi
     133e9e8:	e8 b5 fe ff ff       	call   133e8a2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183e26>
     133e9ed:	48 8d bb 50 04 00 00 	lea    rdi,[rbx+0x450]
     133e9f4:	4c 89 fe             	mov    rsi,r15
     133e9f7:	e8 da 99 79 ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>
     133e9fc:	80 bb 70 04 00 00 00 	cmp    BYTE PTR [rbx+0x470],0x0
     133ea03:	4c 89 b3 60 04 00 00 	mov    QWORD PTR [rbx+0x460],r14
     133ea0a:	48 8d 05 e7 c1 5d 00 	lea    rax,[rip+0x5dc1e7]        # 191abf8 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x62008>
     133ea11:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     133ea18:	75 07                	jne    133ea21 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183fa5>
     133ea1a:	c6 83 70 04 00 00 01 	mov    BYTE PTR [rbx+0x470],0x1
     133ea21:	8a 83 e0 03 00 00    	mov    al,BYTE PTR [rbx+0x3e0]
     133ea27:	0a 83 e1 03 00 00    	or     al,BYTE PTR [rbx+0x3e1]
     133ea2d:	75 06                	jne    133ea35 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x183fb9>
     133ea2f:	5b                   	pop    rbx
     133ea30:	41 5e                	pop    r14
     133ea32:	41 5f                	pop    r15
     133ea34:	c3                   	ret
     133ea35:	48 89 df             	mov    rdi,rbx
     133ea38:	5b                   	pop    rbx
     133ea39:	41 5e                	pop    r14
     133ea3b:	41 5f                	pop    r15

### 0x133fee7 (0x133fd98..0x13404d1) r15+0x470
     133febd:	00 00 
     133febf:	f3 41 0f 7f 87 d0 03 	movdqu XMMWORD PTR [r15+0x3d0],xmm0
     133fec6:	00 00 
     133fec8:	66 41 83 a7 e0 03 00 	and    WORD PTR [r15+0x3e0],0x0
     133fecf:	00 00 
     133fed1:	4c 89 ef             	mov    rdi,r13
     133fed4:	e8 e5 83 80 ff       	call   b482be <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9525e>
     133fed9:	49 8d bf 40 04 00 00 	lea    rdi,[r15+0x440]
     133fee0:	e8 45 58 82 ff       	call   b6572a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb26ca>
     133fee5:	31 c0                	xor    eax,eax
     133fee7:	41 88 87 70 04 00 00 	mov    BYTE PTR [r15+0x470],al
     133feee:	41 88 87 78 04 00 00 	mov    BYTE PTR [r15+0x478],al
     133fef5:	66 0f ef c0          	pxor   xmm0,xmm0
     133fef9:	f3 41 0f 7f 87 50 04 	movdqu XMMWORD PTR [r15+0x450],xmm0
     133ff00:	00 00 
     133ff02:	41 88 87 60 04 00 00 	mov    BYTE PTR [r15+0x460],al
     133ff09:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
     133ff0e:	4d 89 7d 00          	mov    QWORD PTR [r13+0x0],r15
     133ff12:	6a 20                	push   0x20
     133ff14:	5f                   	pop    rdi
     133ff15:	e8 e6 df 4a 00       	call   17edf00 <_Znwm@plt>
     133ff1a:	48 89 c3             	mov    rbx,rax

### 0x13bbced (0x13bbbc2..0x13bc0d5) rbx+0x470
     13bbcaa:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
     13bbcae:	48 89 83 30 04 00 00 	mov    QWORD PTR [rbx+0x430],rax
     13bbcb5:	40 88 ab 38 04 00 00 	mov    BYTE PTR [rbx+0x438],bpl
     13bbcbc:	40 88 ab 40 04 00 00 	mov    BYTE PTR [rbx+0x440],bpl
     13bbcc3:	40 88 ab 48 04 00 00 	mov    BYTE PTR [rbx+0x448],bpl
     13bbcca:	40 88 ab 50 04 00 00 	mov    BYTE PTR [rbx+0x450],bpl
     13bbcd1:	40 88 ab 58 04 00 00 	mov    BYTE PTR [rbx+0x458],bpl
     13bbcd8:	40 88 ab 60 04 00 00 	mov    BYTE PTR [rbx+0x460],bpl
     13bbcdf:	83 a3 68 04 00 00 00 	and    DWORD PTR [rbx+0x468],0x0
     13bbce6:	40 88 ab 6c 04 00 00 	mov    BYTE PTR [rbx+0x46c],bpl
     13bbced:	83 a3 70 04 00 00 00 	and    DWORD PTR [rbx+0x470],0x0
     13bbcf4:	48 8d 05 cd bd 57 00 	lea    rax,[rip+0x57bdcd]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13bbcfb:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     13bbd02:	40 88 ab b8 04 00 00 	mov    BYTE PTR [rbx+0x4b8],bpl
     13bbd09:	0f 57 c0             	xorps  xmm0,xmm0
     13bbd0c:	0f 11 83 c0 04 00 00 	movups XMMWORD PTR [rbx+0x4c0],xmm0
     13bbd13:	0f 11 83 d0 04 00 00 	movups XMMWORD PTR [rbx+0x4d0],xmm0
     13bbd1a:	48 83 a3 e0 04 00 00 	and    QWORD PTR [rbx+0x4e0],0x0
     13bbd21:	00 
     13bbd22:	40 88 ab 88 04 00 00 	mov    BYTE PTR [rbx+0x488],bpl
     13bbd29:	48 83 a3 80 04 00 00 	and    QWORD PTR [rbx+0x480],0x0
     13bbd30:	00 

### 0x152324a (0x15229bc..0x1523550) rbx+0x470
     1523219:	31 f6                	xor    esi,esi
     152321b:	e8 e6 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523220:	48 89 83 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rax
     1523227:	49 8b be 68 04 00 00 	mov    rdi,QWORD PTR [r14+0x468]
     152322e:	31 f6                	xor    esi,esi
     1523230:	e8 d1 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523235:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     152323c:	49 8b be 70 04 00 00 	mov    rdi,QWORD PTR [r14+0x470]
     1523243:	31 f6                	xor    esi,esi
     1523245:	e8 bc 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152324a:	48 89 83 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rax
     1523251:	49 8b be 78 04 00 00 	mov    rdi,QWORD PTR [r14+0x478]
     1523258:	31 f6                	xor    esi,esi
     152325a:	e8 a7 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152325f:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     1523266:	49 8b be 80 04 00 00 	mov    rdi,QWORD PTR [r14+0x480]
     152326d:	31 f6                	xor    esi,esi
     152326f:	e8 92 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523274:	48 89 83 80 04 00 00 	mov    QWORD PTR [rbx+0x480],rax
     152327b:	49 8b be 88 04 00 00 	mov    rdi,QWORD PTR [r14+0x488]
     1523282:	31 f6                	xor    esi,esi
     1523284:	e8 7d 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>

### 0x15f2136 (0x15f1cb0..0x15f2493) r14+0x470
     15f2108:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
     15f210d:	49 8d be 40 04 00 00 	lea    rdi,[r14+0x440]
     15f2114:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     15f2119:	e8 9a 5e 57 ff       	call   b67fb8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb4f58>
     15f211e:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     15f2121:	48 89 df             	mov    rdi,rbx
     15f2124:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15f2127:	49 8d be 68 04 00 00 	lea    rdi,[r14+0x468]
     15f212e:	48 89 c6             	mov    rsi,rax
     15f2131:	e8 62 68 56 ff       	call   b58998 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5938>
     15f2136:	4d 89 a6 70 04 00 00 	mov    QWORD PTR [r14+0x470],r12
     15f213d:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     15f2140:	48 89 df             	mov    rdi,rbx
     15f2143:	ff 50 28             	call   QWORD PTR [rax+0x28]
     15f2146:	49 8d be 78 04 00 00 	lea    rdi,[r14+0x478]
     15f214d:	48 89 c6             	mov    rsi,rax
     15f2150:	e8 43 68 56 ff       	call   b58998 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa5938>
     15f2155:	49 8d 86 88 04 00 00 	lea    rax,[r14+0x488]
     15f215c:	66 0f ef c0          	pxor   xmm0,xmm0
     15f2160:	f3 41 0f 7f 86 88 04 	movdqu XMMWORD PTR [r14+0x488],xmm0
     15f2167:	00 00 
     15f2169:	49 89 86 80 04 00 00 	mov    QWORD PTR [r14+0x480],rax

## Strong same-object candidates

### 0xcb7a20..0xcbc937 base=r15
Offsets: 0x438, 0x470

- 0xcba836: +0x438 :: movdqu XMMWORD PTR [r15+0x438],xmm0
- 0xcba8e9: +0x470 WRITE :: mov    BYTE PTR [r15+0x470],dil

Context around +0x470 @ 0xcba8e9:
      cba8b9:	49 89 bf 58 04 00 00 	mov    QWORD PTR [r15+0x458],rdi
      cba8c0:	48 8b bc 24 a0 0a 00 	mov    rdi,QWORD PTR [rsp+0xaa0]
      cba8c7:	00 
      cba8c8:	49 89 bf 60 04 00 00 	mov    QWORD PTR [r15+0x460],rdi
      cba8cf:	45 89 87 68 04 00 00 	mov    DWORD PTR [r15+0x468],r8d
      cba8d6:	8b bc 24 7c 01 00 00 	mov    edi,DWORD PTR [rsp+0x17c]
      cba8dd:	41 89 bf 6c 04 00 00 	mov    DWORD PTR [r15+0x46c],edi
      cba8e4:	40 8a 7c 24 1f       	mov    dil,BYTE PTR [rsp+0x1f]
      cba8e9:	41 88 bf 70 04 00 00 	mov    BYTE PTR [r15+0x470],dil
      cba8f0:	40 8a 7c 24 1e       	mov    dil,BYTE PTR [rsp+0x1e]
      cba8f5:	41 88 bf 71 04 00 00 	mov    BYTE PTR [r15+0x471],dil
      cba8fc:	40 8a 7c 24 1d       	mov    dil,BYTE PTR [rsp+0x1d]
      cba901:	41 88 bf 72 04 00 00 	mov    BYTE PTR [r15+0x472],dil
      cba908:	8b bc 24 38 02 00 00 	mov    edi,DWORD PTR [rsp+0x238]
      cba90f:	41 89 bf 73 04 00 00 	mov    DWORD PTR [r15+0x473],edi
      cba916:	40 8a bc 24 3c 02 00 	mov    dil,BYTE PTR [rsp+0x23c]
      cba91d:	00 
      cba91e:	41 88 bf 77 04 00 00 	mov    BYTE PTR [r15+0x477],dil

### 0xdbbdbc..0xdbcc85 base=r14
Offsets: 0x438, 0x470

- 0xdbbfb1: +0x438 :: mov    rax,QWORD PTR [r14+0x438]
- 0xdbc9bc: +0x470 :: mov    rsi,QWORD PTR [r14+0x470]
- 0xdbca43: +0x470 :: mov    rcx,QWORD PTR [r14+0x470]

Context around +0x470 @ 0xdbc9bc:
      dbc99e:	31 c0                	xor    eax,eax
      dbc9a0:	e8 2d 9f a1 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>
      dbc9a5:	48 89 df             	mov    rdi,rbx
      dbc9a8:	e8 1f 1e ce ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
      dbc9ad:	4c 8b 6c 24 08       	mov    r13,QWORD PTR [rsp+0x8]
      dbc9b2:	41 80 be 81 01 00 00 	cmp    BYTE PTR [r14+0x181],0x0
      dbc9b9:	00 
      dbc9ba:	74 26                	je     dbc9e2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89a68>
      dbc9bc:	49 8b b6 70 04 00 00 	mov    rsi,QWORD PTR [r14+0x470]
      dbc9c3:	48 8d 9c 24 90 00 00 	lea    rbx,[rsp+0x90]
      dbc9ca:	00 
      dbc9cb:	48 8b 3b             	mov    rdi,QWORD PTR [rbx]
      dbc9ce:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      dbc9d1:	ff 90 20 01 00 00    	call   QWORD PTR [rax+0x120]
      dbc9d7:	48 89 df             	mov    rdi,rbx
      dbc9da:	48 89 de             	mov    rsi,rbx
      dbc9dd:	e8 3a ce cf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      dbc9e2:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]

Context around +0x470 @ 0xdbca43:
      dbca25:	48 89 df             	mov    rdi,rbx
      dbca28:	4c 89 fe             	mov    rsi,r15
      dbca2b:	e8 ec cd cf ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      dbca30:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      dbca34:	e8 4d 1a ce ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      dbca39:	41 80 be 81 01 00 00 	cmp    BYTE PTR [r14+0x181],0x0
      dbca40:	00 
      dbca41:	75 5d                	jne    dbcaa0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x89b26>
      dbca43:	49 8b 8e 70 04 00 00 	mov    rcx,QWORD PTR [r14+0x470]
      dbca4a:	48 8d 05 c7 51 69 ff 	lea    rax,[rip+0xffffffffff6951c7]        # 451c18 <_ZTSNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x17824>
      dbca51:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
      dbca58:	00 
      dbca59:	48 89 06             	mov    QWORD PTR [rsi],rax
      dbca5c:	48 89 46 08          	mov    QWORD PTR [rsi+0x8],rax
      dbca60:	48 83 66 10 00       	and    QWORD PTR [rsi+0x10],0x0
      dbca65:	49 8d be 60 04 00 00 	lea    rdi,[r14+0x460]
      dbca6c:	4c 8d bc 24 d0 01 00 	lea    r15,[rsp+0x1d0]
      dbca73:	00 

### 0xe92f2c..0xe98f3b base=r13
Offsets: 0x470, 0x598

- 0xe94762: +0x598 :: mov    rcx,QWORD PTR [r13+0x598]
- 0xe961a4: +0x598 :: mov    rax,QWORD PTR [r13+0x598]
- 0xe96505: +0x470 :: movaps xmm0,XMMWORD PTR [r13+0x470]

Context around +0x470 @ 0xe96505:
      e964e0:	48 89 08             	mov    QWORD PTR [rax],rcx
      e964e3:	48 8b 0d b6 b5 a1 00 	mov    rcx,QWORD PTR [rip+0xa1b5b6]        # 18b1aa0 <_ZNSt6__ndk16chrono12system_clock3nowEv@@Base+0xeaf970>
      e964ea:	48 89 48 08          	mov    QWORD PTR [rax+0x8],rcx
      e964ee:	48 89 40 20          	mov    QWORD PTR [rax+0x20],rax
      e964f2:	48 8b 84 24 f8 01 00 	mov    rax,QWORD PTR [rsp+0x1f8]
      e964f9:	00 
      e964fa:	f0 48 ff 00          	lock inc QWORD PTR [rax]
      e964fe:	4d 8b a5 28 04 00 00 	mov    r12,QWORD PTR [r13+0x428]
      e96505:	41 0f 28 85 70 04 00 	movaps xmm0,XMMWORD PTR [r13+0x470]
      e9650c:	00 
      e9650d:	0f 29 84 24 a0 01 00 	movaps XMMWORD PTR [rsp+0x1a0],xmm0
      e96514:	00 
      e96515:	49 8b 9d 78 04 00 00 	mov    rbx,QWORD PTR [r13+0x478]
      e9651c:	48 85 db             	test   rbx,rbx
      e9651f:	74 05                	je     e96526 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5d93c>
      e96521:	f0 48 ff 43 08       	lock inc QWORD PTR [rbx+0x8]
      e96526:	4d 8b bd 90 05 00 00 	mov    r15,QWORD PTR [r13+0x590]
      e9652d:	80 bc 24 e8 00 00 00 	cmp    BYTE PTR [rsp+0xe8],0x0

### 0x10a6464..0x10a7f52 base=r14
Offsets: 0x438, 0x470, 0x598

- 0x10a67ca: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a6ba8: +0x598 :: mov    r15b,BYTE PTR [r14+0x598]
- 0x10a6dc2: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a703a: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a731c: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a73a4: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a7492: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0
- 0x10a74a0: +0x470 :: cmp    BYTE PTR [r14+0x470],0x0
- 0x10a7582: +0x438 :: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a75d0: +0x438 :: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a761e: +0x438 :: mov    rdi,QWORD PTR [r14+0x438]
- 0x10a7ae7: +0x598 :: cmp    BYTE PTR [r14+0x598],0x0

Context around +0x470 @ 0x10a74a0:
     10a747f:	00 
     10a7480:	e8 0b 66 d8 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
     10a7485:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a748c:	00 
     10a748d:	e8 fe 69 74 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     10a7492:	41 80 be 98 05 00 00 	cmp    BYTE PTR [r14+0x598],0x0
     10a7499:	00 
     10a749a:	0f 84 cc 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74a0:	41 80 be 70 04 00 00 	cmp    BYTE PTR [r14+0x470],0x0
     10a74a7:	00 
     10a74a8:	0f 84 be 01 00 00    	je     10a766c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26ea82>
     10a74ae:	48 8d 35 90 68 2c ff 	lea    rsi,[rip+0xffffffffff2c6890]        # 36dd45 <_ZTSSt12bad_any_cast@@Base-0x22483>
     10a74b5:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     10a74bc:	00 
     10a74bd:	e8 bc 25 9d ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
     10a74c2:	49 8d be a0 14 00 00 	lea    rdi,[r14+0x14a0]
     10a74c9:	48 8d b4 24 40 04 00 	lea    rsi,[rsp+0x440]
     10a74d0:	00 

### 0x10a9668..0x10a969c base=rdi
Offsets: 0x438, 0x470, 0x598

- 0x10a966e: +0x598 :: cmp    BYTE PTR [rdi+0x598],0x0
- 0x10a9677: +0x470 :: cmp    BYTE PTR [rdi+0x470],0x0
- 0x10a9680: +0x438 :: mov    rax,QWORD PTR [rdi+0x438]

Context around +0x470 @ 0x10a9677:
     10a965e:	41 5e                	pop    r14
     10a9660:	41 5f                	pop    r15
     10a9662:	c3                   	ret
     10a9663:	e8 48 64 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret

### 0x122ba2e..0x122c594 base=r13
Offsets: 0x438, 0x470

- 0x122c072: +0x438 WRITE :: mov    DWORD PTR [r13+0x438],ebp
- 0x122c079: +0x470 :: movdqu XMMWORD PTR [r13+0x470],xmm0

Context around +0x470 @ 0x122c079:
     122c04f:	48 b8 00 00 00 00 00 	movabs rax,0x3f80000000000000
     122c056:	00 80 3f 
     122c059:	49 89 85 0c 04 00 00 	mov    QWORD PTR [r13+0x40c],rax
     122c060:	f3 41 0f 7f 85 18 04 	movdqu XMMWORD PTR [r13+0x418],xmm0
     122c067:	00 00 
     122c069:	f3 41 0f 7f 85 28 04 	movdqu XMMWORD PTR [r13+0x428],xmm0
     122c070:	00 00 
     122c072:	41 89 ad 38 04 00 00 	mov    DWORD PTR [r13+0x438],ebp
     122c079:	f3 41 0f 7f 85 70 04 	movdqu XMMWORD PTR [r13+0x470],xmm0
     122c080:	00 00 
     122c082:	f3 41 0f 7f 85 80 04 	movdqu XMMWORD PTR [r13+0x480],xmm0
     122c089:	00 00 
     122c08b:	41 89 ad 90 04 00 00 	mov    DWORD PTR [r13+0x490],ebp
     122c092:	f3 41 0f 7f 85 a8 04 	movdqu XMMWORD PTR [r13+0x4a8],xmm0
     122c099:	00 00 
     122c09b:	f3 41 0f 7f 85 98 04 	movdqu XMMWORD PTR [r13+0x498],xmm0
     122c0a2:	00 00 
     122c0a4:	41 89 ad b8 04 00 00 	mov    DWORD PTR [r13+0x4b8],ebp

### 0x13bbbc2..0x13bc0d5 base=rbx
Offsets: 0x438, 0x470, 0x598

- 0x13bbcb5: +0x438 WRITE :: mov    BYTE PTR [rbx+0x438],bpl
- 0x13bbced: +0x470 WRITE :: and    DWORD PTR [rbx+0x470],0x0
- 0x13bbdfe: +0x598 WRITE :: mov    BYTE PTR [rbx+0x598],0x1

Context around +0x470 @ 0x13bbced:
     13bbcb5:	40 88 ab 38 04 00 00 	mov    BYTE PTR [rbx+0x438],bpl
     13bbcbc:	40 88 ab 40 04 00 00 	mov    BYTE PTR [rbx+0x440],bpl
     13bbcc3:	40 88 ab 48 04 00 00 	mov    BYTE PTR [rbx+0x448],bpl
     13bbcca:	40 88 ab 50 04 00 00 	mov    BYTE PTR [rbx+0x450],bpl
     13bbcd1:	40 88 ab 58 04 00 00 	mov    BYTE PTR [rbx+0x458],bpl
     13bbcd8:	40 88 ab 60 04 00 00 	mov    BYTE PTR [rbx+0x460],bpl
     13bbcdf:	83 a3 68 04 00 00 00 	and    DWORD PTR [rbx+0x468],0x0
     13bbce6:	40 88 ab 6c 04 00 00 	mov    BYTE PTR [rbx+0x46c],bpl
     13bbced:	83 a3 70 04 00 00 00 	and    DWORD PTR [rbx+0x470],0x0
     13bbcf4:	48 8d 05 cd bd 57 00 	lea    rax,[rip+0x57bdcd]        # 1937ac8 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x710>
     13bbcfb:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     13bbd02:	40 88 ab b8 04 00 00 	mov    BYTE PTR [rbx+0x4b8],bpl
     13bbd09:	0f 57 c0             	xorps  xmm0,xmm0
     13bbd0c:	0f 11 83 c0 04 00 00 	movups XMMWORD PTR [rbx+0x4c0],xmm0
     13bbd13:	0f 11 83 d0 04 00 00 	movups XMMWORD PTR [rbx+0x4d0],xmm0
     13bbd1a:	48 83 a3 e0 04 00 00 	and    QWORD PTR [rbx+0x4e0],0x0
     13bbd21:	00 
     13bbd22:	40 88 ab 88 04 00 00 	mov    BYTE PTR [rbx+0x488],bpl

### 0x15229bc..0x1523550 base=r14
Offsets: 0x438, 0x470

- 0x15231a9: +0x438 :: mov    rdi,QWORD PTR [r14+0x438]
- 0x152323c: +0x470 :: mov    rdi,QWORD PTR [r14+0x470]

Context around +0x470 @ 0x152323c:
     1523212:	49 8b be 60 04 00 00 	mov    rdi,QWORD PTR [r14+0x460]
     1523219:	31 f6                	xor    esi,esi
     152321b:	e8 e6 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523220:	48 89 83 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rax
     1523227:	49 8b be 68 04 00 00 	mov    rdi,QWORD PTR [r14+0x468]
     152322e:	31 f6                	xor    esi,esi
     1523230:	e8 d1 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523235:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     152323c:	49 8b be 70 04 00 00 	mov    rdi,QWORD PTR [r14+0x470]
     1523243:	31 f6                	xor    esi,esi
     1523245:	e8 bc 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152324a:	48 89 83 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rax
     1523251:	49 8b be 78 04 00 00 	mov    rdi,QWORD PTR [r14+0x478]
     1523258:	31 f6                	xor    esi,esi
     152325a:	e8 a7 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152325f:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     1523266:	49 8b be 80 04 00 00 	mov    rdi,QWORD PTR [r14+0x480]
     152326d:	31 f6                	xor    esi,esi

### 0x15229bc..0x1523550 base=rbx
Offsets: 0x438, 0x470

- 0x15231b7: +0x438 WRITE :: mov    QWORD PTR [rbx+0x438],rax
- 0x152324a: +0x470 WRITE :: mov    QWORD PTR [rbx+0x470],rax

Context around +0x470 @ 0x152324a:
     1523220:	48 89 83 60 04 00 00 	mov    QWORD PTR [rbx+0x460],rax
     1523227:	49 8b be 68 04 00 00 	mov    rdi,QWORD PTR [r14+0x468]
     152322e:	31 f6                	xor    esi,esi
     1523230:	e8 d1 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523235:	48 89 83 68 04 00 00 	mov    QWORD PTR [rbx+0x468],rax
     152323c:	49 8b be 70 04 00 00 	mov    rdi,QWORD PTR [r14+0x470]
     1523243:	31 f6                	xor    esi,esi
     1523245:	e8 bc 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152324a:	48 89 83 70 04 00 00 	mov    QWORD PTR [rbx+0x470],rax
     1523251:	49 8b be 78 04 00 00 	mov    rdi,QWORD PTR [r14+0x478]
     1523258:	31 f6                	xor    esi,esi
     152325a:	e8 a7 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     152325f:	48 89 83 78 04 00 00 	mov    QWORD PTR [rbx+0x478],rax
     1523266:	49 8b be 80 04 00 00 	mov    rdi,QWORD PTR [r14+0x480]
     152326d:	31 f6                	xor    esi,esi
     152326f:	e8 92 7a 58 ff       	call   aaad06 <JNI_OnUnload@@Base+0x325d3>
     1523274:	48 89 83 80 04 00 00 	mov    QWORD PTR [rbx+0x480],rax
     152327b:	49 8b be 88 04 00 00 	mov    rdi,QWORD PTR [r14+0x488]

## Direct callers/jumpers of 0x10a6464

### 0x10a645f from 0x10a645c..0x10a6464
     10a6428:	48 8d 87 a0 03 00 00 	lea    rax,[rdi+0x3a0]
     10a642f:	0f 11 87 a0 03 00 00 	movups XMMWORD PTR [rdi+0x3a0],xmm0
     10a6436:	48 89 87 98 03 00 00 	mov    QWORD PTR [rdi+0x398],rax
     10a643d:	48 8d 87 b8 03 00 00 	lea    rax,[rdi+0x3b8]
     10a6444:	0f 11 87 b8 03 00 00 	movups XMMWORD PTR [rdi+0x3b8],xmm0
     10a644b:	48 89 87 b0 03 00 00 	mov    QWORD PTR [rdi+0x3b0],rax
     10a6452:	c3                   	ret
     10a6453:	cc                   	int3
     10a6454:	48 8b 3f             	mov    rdi,QWORD PTR [rdi]
     10a6457:	e9 00 00 00 00       	jmp    10a645c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d872>
     10a645c:	6a 01                	push   0x1
     10a645e:	5e                   	pop    rsi
     10a645f:	e9 00 00 00 00       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a6464:	55                   	push   rbp
     10a6465:	41 57                	push   r15
     10a6467:	41 56                	push   r14
     10a6469:	41 55                	push   r13
     10a646b:	41 54                	push   r12
     10a646d:	53                   	push   rbx
     10a646e:	48 81 ec 38 08 00 00 	sub    rsp,0x838
     10a6475:	89 f5                	mov    ebp,esi
     10a6477:	49 89 fe             	mov    r14,rdi
     10a647a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a6481:	00 00 
     10a6483:	48 89 84 24 30 08 00 	mov    QWORD PTR [rsp+0x830],rax

### 0x10a8d97 from 0x10a8aae..0x10a8da4
     10a8d68:	49 8d b6 98 03 00 00 	lea    rsi,[r14+0x398]
     10a8d6f:	e8 20 a1 d8 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     10a8d74:	48 8d bb 40 14 00 00 	lea    rdi,[rbx+0x1440]
     10a8d7b:	49 81 c6 b0 03 00 00 	add    r14,0x3b0
     10a8d82:	4c 89 f6             	mov    rsi,r14
     10a8d85:	e8 0a a1 d8 ff       	call   e32e94 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfff1a>
     10a8d8a:	6a 01                	push   0x1
     10a8d8c:	5e                   	pop    rsi
     10a8d8d:	48 89 df             	mov    rdi,rbx
     10a8d90:	48 83 c4 08          	add    rsp,0x8
     10a8d94:	5b                   	pop    rbx
     10a8d95:	41 5e                	pop    r14
     10a8d97:	e9 c8 d6 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a8d9c:	48 89 c7             	mov    rdi,rax
     10a8d9f:	e8 01 0d 9d ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a8da4:	48 8d 87 90 10 00 00 	lea    rax,[rdi+0x1090]
     10a8dab:	c3                   	ret
     10a8dac:	48 8d 87 58 14 00 00 	lea    rax,[rdi+0x1458]
     10a8db3:	c3                   	ret
     10a8db4:	41 57                	push   r15
     10a8db6:	41 56                	push   r14
     10a8db8:	53                   	push   rbx
     10a8db9:	48 83 ec 50          	sub    rsp,0x50
     10a8dbd:	49 89 d7             	mov    r15,rdx
     10a8dc0:	49 89 f6             	mov    r14,rsi

### 0x10a9696 from 0x10a9668..0x10a969c
     10a9668:	80 7e 38 06          	cmp    BYTE PTR [rsi+0x38],0x6
     10a966c:	75 2d                	jne    10a969b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270ab1>
     10a966e:	80 bf 98 05 00 00 00 	cmp    BYTE PTR [rdi+0x598],0x0
     10a9675:	74 1c                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9677:	80 bf 70 04 00 00 00 	cmp    BYTE PTR [rdi+0x470],0x0
     10a967e:	74 13                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a9680:	48 8b 87 38 04 00 00 	mov    rax,QWORD PTR [rdi+0x438]
     10a9687:	48 85 c0             	test   rax,rax
     10a968a:	74 07                	je     10a9693 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270aa9>
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
     10a96b9:	cc                   	int3
     10a96ba:	41 56                	push   r14
     10a96bc:	53                   	push   rbx

### 0x10a9fb1 from 0x10a9f9e..0x10a9fbe
     10a9f8e:	41 5e                	pop    r14
     10a9f90:	c3                   	ret
     10a9f91:	e8 1a 5b 74 00       	call   17efab0 <__stack_chk_fail@plt>
     10a9f96:	48 89 c7             	mov    rdi,rax
     10a9f99:	e8 07 fb 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9f9e:	53                   	push   rbx
     10a9f9f:	48 8b 1f             	mov    rbx,QWORD PTR [rdi]
     10a9fa2:	48 8d 7b 38          	lea    rdi,[rbx+0x38]
     10a9fa6:	e8 13 00 00 00       	call   10a9fbe <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2713d4>
     10a9fab:	48 89 df             	mov    rdi,rbx
     10a9fae:	31 f6                	xor    esi,esi
     10a9fb0:	5b                   	pop    rbx
     10a9fb1:	e9 ae c4 ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a9fb6:	48 89 c7             	mov    rdi,rax
     10a9fb9:	e8 e7 fa 9c ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     10a9fbe:	55                   	push   rbp
     10a9fbf:	41 57                	push   r15
     10a9fc1:	41 56                	push   r14
     10a9fc3:	41 55                	push   r13
     10a9fc5:	41 54                	push   r12
     10a9fc7:	53                   	push   rbx
     10a9fc8:	50                   	push   rax
     10a9fc9:	49 89 f6             	mov    r14,rsi
     10a9fcc:	48 89 fb             	mov    rbx,rdi
     10a9fcf:	e8 ca ff fd ff       	call   1089f9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2513b4>

## Direct callers/jumpers of 0x10a9668

### 0x10a96b4 from 0x10a96b0..0x10a96b9
     10a968c:	c6 80 b8 01 00 00 01 	mov    BYTE PTR [rax+0x1b8],0x1
     10a9693:	6a 01                	push   0x1
     10a9695:	5e                   	pop    rsi
     10a9696:	e9 c9 cd ff ff       	jmp    10a6464 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26d87a>
     10a969b:	c3                   	ret
     10a969c:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96a0:	e9 6d f1 ff ff       	jmp    10a8812 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fc28>
     10a96a5:	cc                   	int3
     10a96a6:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96aa:	e9 31 f2 ff ff       	jmp    10a88e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x26fcf6>
     10a96af:	cc                   	int3
     10a96b0:	48 83 c7 f8          	add    rdi,0xfffffffffffffff8
     10a96b4:	e9 af ff ff ff       	jmp    10a9668 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x270a7e>
     10a96b9:	cc                   	int3
     10a96ba:	41 56                	push   r14
     10a96bc:	53                   	push   rbx
     10a96bd:	48 83 ec 28          	sub    rsp,0x28
     10a96c1:	48 89 fb             	mov    rbx,rdi
     10a96c4:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     10a96cb:	00 00 
     10a96cd:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     10a96d2:	4c 8d 74 24 08       	lea    r14,[rsp+0x8]
     10a96d7:	4c 89 f7             	mov    rdi,r14
     10a96da:	e8 a5 00 aa ff       	call   b49784 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96724>
     10a96df:	49 8b 06             	mov    rax,QWORD PTR [r14]

## Printable strings in strong same-object functions

### 0xcb7a20..0xcbc937
- core-audio-track-player-feature
- driver_buffer_target_duration
- max_prebuffer_duration_setting_when_stuttering
- decompress_loop_wall_clock_budget_ms
- Oboe
- AVFoundation
- AudioUnit2Renderer
- CoreAudioRenderer
- Pipewire
- PulseAudio
- Unspecified
- audio_driver_name
- audio_renderer_buffer_request_size_ms
- api_renderer
- com/spotify/playbacknative/AudioDriver
- sUsingOboe
- Could not find class AudioDriver
- Could not find field sUsingOboe
- Audio Driver Thread
- core-audio-effects
- echo_high_pass_cutoff_hz
- delay_high_pass_cutoff_hz
- reverb_high_pass_cutoff_hz
- echo_equal_power_mix
- delay_equal_power_mix
- reverb_equal_power_mix
- reverb_output_gain_pct
- noise_effect_gain_pct
- jogwheel_buffer_size_ms
- stop_processing_at_end_of_stream
- Always
- MediaPlayerOnly
- Never
- core-audio-track-player
- send_wasapi_audio_driver_info
- wasapi_sync_app_session_volume_to_spt_volume_slider
- wasapi_endpoint_volume_control
- send_wasapi_audio_driver_format_error
- wasapi_thread_characteristics
- ProAudio
- None
- Audio
- Playback
- wasapi_thread_priority
- Critical
- Normal
- High
- audio_driver_with_audio_renderer_processing_interval
- pulse_audio_tlength
- pulse_audio_minreq
- oboe_callback_buffer_size_ms
- oboe_legacy_close_delay_ms
- oboe_underrun_check_mode
- ControlScheduler
- DataCallback
- ignore_underruns_after_track_end_for_ms
- audio_driver_pause_fade_time_ms
- audio_driver_flush_fade_time_ms
- use_driver_on_process_callback
- audio_mixer_use_audio_thread_processing
- media_player_log_boombox_timeline_contents
- strict_timeline_event_ordering
- cache_resolved_timepoints
- serialize_position_observer
- what_read_data_is_allowed_to_do_while_renderer_shuts_down
- Everything
- Nothing
- ReadSnapshot
- HandleRebuffering
- MixAudio
- core-bitrate
- net_fortune_use_playback_stats
- bitrate_downgrade
- DownloadBitrate
- AudioBufferSize
- bitrate_downgrade_target_bitrate
- bitrate_downgrade_non_lossless
- darkload_dowgrading
- send_midtrack_downgrade_event
- consecutive_low_buffer_count
- critical_buffer_threshold_for_bitrate_downgrade
- min_buffer_for_buffer_monitoring_to_start
- buffer_moving_average_window_size
- max_buffer_depletion_rate
- bitrate_downshift_advice_wait_for_key
- bitrate_downshift_prediction
- downshift_wait_for_initial_buffering_completed
- downshift_detailed_logs
- handle_track_deferred_close_after_stream_resumption
- track_deferred_close_after_stream_resumption_max_threshold
- rcheck_fail_on_stream_reporting_pending_event_errors
- audio.normalize_v2
- audio.loudness.environment

### 0xdbbdbc..0xdbcc85
- .spotify.com
- .spotify.net
- traffic.megaphone.fm
- Accept-Encoding
- Cache-Control
- no-cache, no-store
- https://
- x-playback-id
- x-segment-timestamp-ms
- Requesting whole file
- \nbytes
- Range
- Requesting data (%d -> %d)
- unknown

### 0xe92f2c..0xe98f3b
- audio
- mixed
- video
- \naudio
- \nvideo
- \nmixed
- core-player
- enable_queue_expiration
- queue_expiration_time_in_seconds
- enable_global_play_history
- enable_music_video_with_mft_improvements
- pick_and_shuffle_timecap
- enable_pick_and_shuffle_dynamic_cap
- pick_and_shuffle_dynamic_cap_pre_banked
- enable_pick_and_shuffle_remote_cap_parameters
- enable_player_timekeeper_logging
- enable_pick_and_shuffle_common_capping
- Enabled
- Disabled
- ReportingOnly
- md_generic
- enable_smart_skip_ad_detection
- enable_smart_skip_content_markers
- audio_passthrough_identification_mode
- All
- Off
- Segments
- TrackInfoBasicMetadataCache_prune
- unknown
- md_basic
- automix_mode_for_user_playlists
- RadioAirbag
- None
- enable_reshuffle_signal
- stop_episodes_playback_on_error
- new_shuffle_session_behavior
- disable_context_repeat_on_context_change
- disable_repeat_on_context_change_for_search_tracks
- enable_keeping_playback_session_on_transfer
- enable_standalone_seek_capping
- enable_do_not_publish_trackless_intermediate_states
- time_keeper_span_duration_threshold_microseconds
- Default
- Regular
- Airbag
- _wall_time_provider: 
- _timer: 

### 0x10a6464..0x10a7f52
- mft_disallow
- mft_plus_disallow
- no_prev_track
- not_playing_context
- already_paused
- not_paused
- show
- autoplay
- episode
- ad_disallow
- narration
- automix
- audiobook_capping
- not_supported_by_content_type
- local-list
- spotify:search
- spotify:search:
- local_list
- already_set
- restrictions_handler
- switch-to-video
- unknown
- disallowed_by_account_manager
- disallowed_by_user_setting

### 0x10a9668..0x10a969c

### 0x122ba2e..0x122c594

### 0x13bbbc2..0x13bc0d5
- AudioDecompressorProcess

### 0x15229bc..0x1523550

