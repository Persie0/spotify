# Service184 host r13 provider backslice

Target: ddac2b stores r13 into host+0x30. Host vptr is 0x1859058 and virtual +0x10 is 0x11a318c.

## Full constructor prefix dda4fa..ddac40

/tmp/s184r13/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000dda4fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7580>:
  dda4fa:	55                   	push   rbp
  dda4fb:	41 57                	push   r15
  dda4fd:	41 56                	push   r14
  dda4ff:	41 55                	push   r13
  dda501:	41 54                	push   r12
  dda503:	53                   	push   rbx
  dda504:	48 81 ec 98 02 00 00 	sub    rsp,0x298
  dda50b:	49 89 cc             	mov    r12,rcx
  dda50e:	49 89 d6             	mov    r14,rdx
  dda511:	48 89 fd             	mov    rbp,rdi
  dda514:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  dda51b:	00 00 
  dda51d:	48 89 84 24 90 02 00 	mov    QWORD PTR [rsp+0x290],rax
  dda524:	00 
  dda525:	48 89 cf             	mov    rdi,rcx
  dda528:	e8 1d 93 e7 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
  dda52d:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
  dda532:	4c 89 e7             	mov    rdi,r12
  dda535:	e8 28 b7 e6 ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
  dda53a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
  dda541:	00 
  dda542:	4c 89 e7             	mov    rdi,r12
  dda545:	e8 2a 8d d8 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
  dda54a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
  dda54f:	4c 89 e7             	mov    rdi,r12
  dda552:	e8 cf 71 e3 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
  dda557:	48 89 c3             	mov    rbx,rax
  dda55a:	4c 89 e7             	mov    rdi,r12
  dda55d:	e8 3e 8d d8 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
  dda562:	49 89 c7             	mov    r15,rax
  dda565:	4c 89 e7             	mov    rdi,r12
  dda568:	e8 e3 72 e3 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
  dda56d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
  dda572:	4c 89 e7             	mov    rdi,r12
  dda575:	e8 1a da da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
  dda57a:	49 89 c5             	mov    r13,rax
  dda57d:	4c 89 e7             	mov    rdi,r12
  dda580:	e8 cb 71 e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
  dda585:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  dda58a:	4c 89 e7             	mov    rdi,r12
  dda58d:	e8 68 72 e3 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
  dda592:	49 89 c4             	mov    r12,rax
  dda595:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
  dda599:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  dda59e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
  dda5a5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  dda5aa:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
  dda5ae:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
  dda5b5:	00 
  dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
  dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
  dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
  dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  dda5c8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  dda5cc:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
  dda5d1:	4c 89 ef             	mov    rdi,r13
  dda5d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5d7:	49 89 c5             	mov    r13,rax
  dda5da:	49 8b 07             	mov    rax,QWORD PTR [r15]
  dda5dd:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
  dda5e2:	4c 89 ff             	mov    rdi,r15
  dda5e5:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda5e8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
  dda5ec:	4c 8d 05 0d ff 5f ff 	lea    r8,[rip+0xffffffffff5fff0d]        # 3da500 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x50e5>
  dda5f3:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
  dda5fa:	00 
  dda5fb:	4c 89 ee             	mov    rsi,r13
  dda5fe:	48 89 c2             	mov    rdx,rax
  dda601:	e8 da 1b 00 00       	call   ddc1e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9266>
  dda606:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
  dda60a:	4c 89 e7             	mov    rdi,r12
  dda60d:	ff 50 28             	call   QWORD PTR [rax+0x28]
  dda610:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
  dda614:	6a 58                	push   0x58
  dda616:	5f                   	pop    rdi
  dda617:	e8 e4 38 a1 00       	call   17edf00 <_Znwm@plt>
  dda61c:	49 89 c6             	mov    r14,rax
  dda61f:	48 89 ac 24 c8 00 00 	mov    QWORD PTR [rsp+0xc8],rbp
  dda626:	00 
  dda627:	48 8d 05 0a 03 a5 00 	lea    rax,[rip+0xa5030a]        # 182a938 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6f68>
  dda62e:	48 8d 8c 24 60 01 00 	lea    rcx,[rsp+0x160]
  dda635:	00 
  dda636:	48 89 01             	mov    QWORD PTR [rcx],rax
  dda639:	48 89 59 08          	mov    QWORD PTR [rcx+0x8],rbx
  dda63d:	48 8b 44 24 10       	mov    rax,QWORD PTR [rsp+0x10]
  dda642:	48 89 41 10          	mov    QWORD PTR [rcx+0x10],rax
  dda646:	48 8b 84 24 e8 00 00 	mov    rax,QWORD PTR [rsp+0xe8]
  dda64d:	00 
  dda64e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  dda652:	48 83 a4 24 e8 00 00 	and    QWORD PTR [rsp+0xe8],0x0
  dda659:	00 00 
  dda65b:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
  dda65f:	41 c6 46 08 00       	mov    BYTE PTR [r14+0x8],0x0
  dda664:	48 8d 05 15 03 a5 00 	lea    rax,[rip+0xa50315]        # 182a980 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6fb0>
  dda66b:	49 89 06             	mov    QWORD PTR [r14],rax
  dda66e:	49 8d 46 10          	lea    rax,[r14+0x10]
  dda672:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  dda677:	49 8d 46 18          	lea    rax,[r14+0x18]
  dda67b:	48 89 84 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rax
  dda682:	00 
  dda683:	49 8d 46 20          	lea    rax,[r14+0x20]
  dda687:	48 89 84 24 88 00 00 	mov    QWORD PTR [rsp+0x88],rax
  dda68e:	00 
  dda68f:	49 8d 46 28          	lea    rax,[r14+0x28]
  dda693:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  dda69a:	00 
  dda69b:	49 8d 7e 30          	lea    rdi,[r14+0x30]
  dda69f:	66 0f ef c0          	pxor   xmm0,xmm0
  dda6a3:	f3 41 0f 7f 46 10    	movdqu XMMWORD PTR [r14+0x10],xmm0
  dda6a9:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
  dda6af:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi
  dda6b6:	00 
  dda6b7:	e8 3a f3 9f 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  dda6bc:	49 83 66 40 00       	and    QWORD PTR [r14+0x40],0x0
  dda6c1:	49 8d 46 40          	lea    rax,[r14+0x40]
  dda6c5:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax
  dda6cc:	00 
  dda6cd:	4c 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],r14
  dda6d4:	00 
  dda6d5:	49 83 c6 48          	add    r14,0x48
  dda6d9:	4c 89 f7             	mov    rdi,r14
  dda6dc:	e8 4e 4a d6 ff       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
  dda6e1:	4c 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r15
  dda6e8:	00 
  dda6e9:	4c 89 b4 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],r14
  dda6f0:	00 
  dda6f1:	4c 8b 7c 24 30       	mov    r15,QWORD PTR [rsp+0x30]
  dda6f6:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda6f9:	48 8d 35 c0 67 5f ff 	lea    rsi,[rip+0xffffffffff5f67c0]        # 3d0ec0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d14>
  dda700:	48 8d 0d dd 67 5f ff 	lea    rcx,[rip+0xffffffffff5f67dd]        # 3d0ee4 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d38>
  dda707:	6a 23                	push   0x23
  dda709:	41 5c                	pop    r12
  dda70b:	6a 0d                	push   0xd
  dda70d:	41 58                	pop    r8
  dda70f:	4c 89 e2             	mov    rdx,r12
  dda712:	45 31 c9             	xor    r9d,r9d
  dda715:	e8 44 ce 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda71a:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda71d:	48 8d 35 dc 67 5f ff 	lea    rsi,[rip+0xffffffffff5f67dc]        # 3d0f00 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d54>
  dda724:	48 8d 0d 05 68 5f ff 	lea    rcx,[rip+0xffffffffff5f6805]        # 3d0f30 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d84>
  dda72b:	6a 0f                	push   0xf
  dda72d:	41 58                	pop    r8
  dda72f:	4c 89 e2             	mov    rdx,r12
  dda732:	45 31 c9             	xor    r9d,r9d
  dda735:	e8 24 ce 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda73a:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda73d:	48 8d 35 fc 67 5f ff 	lea    rsi,[rip+0xffffffffff5f67fc]        # 3d0f40 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d94>
  dda744:	48 8d 0d 25 68 5f ff 	lea    rcx,[rip+0xffffffffff5f6825]        # 3d0f70 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1dc4>
  dda74b:	6a 13                	push   0x13
  dda74d:	41 58                	pop    r8
  dda74f:	4c 89 e2             	mov    rdx,r12
  dda752:	45 31 c9             	xor    r9d,r9d
  dda755:	e8 04 ce 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda75a:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda75d:	bb 80 51 01 00       	mov    ebx,0x15180
  dda762:	48 8d 35 27 68 5f ff 	lea    rsi,[rip+0xffffffffff5f6827]        # 3d0f90 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1de4>
  dda769:	48 8d 0d 50 68 5f ff 	lea    rcx,[rip+0xffffffffff5f6850]        # 3d0fc0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1e14>
  dda770:	6a 21                	push   0x21
  dda772:	41 58                	pop    r8
  dda774:	6a 1e                	push   0x1e
  dda776:	41 59                	pop    r9
  dda778:	4c 89 e2             	mov    rdx,r12
  dda77b:	53                   	push   rbx
  dda77c:	6a 00                	push   0x0
  dda77e:	e8 6f ce 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda783:	48 83 c4 10          	add    rsp,0x10
  dda787:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda78a:	48 8d 35 5f 68 5f ff 	lea    rsi,[rip+0xffffffffff5f685f]        # 3d0ff0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1e44>
  dda791:	48 8d 0d 88 68 5f ff 	lea    rcx,[rip+0xffffffffff5f6888]        # 3d1020 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1e74>
  dda798:	6a 1c                	push   0x1c
  dda79a:	41 58                	pop    r8
  dda79c:	4c 89 e2             	mov    rdx,r12
  dda79f:	41 b9 10 0e 00 00    	mov    r9d,0xe10
  dda7a5:	53                   	push   rbx
  dda7a6:	6a 00                	push   0x0
  dda7a8:	e8 45 ce 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda7ad:	48 83 c4 10          	add    rsp,0x10
  dda7b1:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda7b4:	48 8d 35 85 68 5f ff 	lea    rsi,[rip+0xffffffffff5f6885]        # 3d1040 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1e94>
  dda7bb:	48 8d 0d ae 68 5f ff 	lea    rcx,[rip+0xffffffffff5f68ae]        # 3d1070 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1ec4>
  dda7c2:	6a 27                	push   0x27
  dda7c4:	41 58                	pop    r8
  dda7c6:	4c 89 e2             	mov    rdx,r12
  dda7c9:	41 b9 2c 01 00 00    	mov    r9d,0x12c
  dda7cf:	68 10 0e 00 00       	push   0xe10
  dda7d4:	6a 00                	push   0x0
  dda7d6:	e8 17 ce 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda7db:	48 83 c4 10          	add    rsp,0x10
  dda7df:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda7e2:	48 8d 35 b7 68 5f ff 	lea    rsi,[rip+0xffffffffff5f68b7]        # 3d10a0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1ef4>
  dda7e9:	48 8d 0d e0 68 5f ff 	lea    rcx,[rip+0xffffffffff5f68e0]        # 3d10d0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f24>
  dda7f0:	6a 1f                	push   0x1f
  dda7f2:	41 58                	pop    r8
  dda7f4:	4c 89 e2             	mov    rdx,r12
  dda7f7:	45 31 c9             	xor    r9d,r9d
  dda7fa:	e8 5f cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda7ff:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda802:	48 8d 35 e7 68 5f ff 	lea    rsi,[rip+0xffffffffff5f68e7]        # 3d10f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f44>
  dda809:	48 8d 0d 10 69 5f ff 	lea    rcx,[rip+0xffffffffff5f6910]        # 3d1120 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f74>
  dda810:	6a 14                	push   0x14
  dda812:	41 58                	pop    r8
  dda814:	4c 89 e2             	mov    rdx,r12
  dda817:	45 31 c9             	xor    r9d,r9d
  dda81a:	e8 3f cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda81f:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda822:	48 8d 35 17 69 5f ff 	lea    rsi,[rip+0xffffffffff5f6917]        # 3d1140 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f94>
  dda829:	48 8d 0d 40 69 5f ff 	lea    rcx,[rip+0xffffffffff5f6940]        # 3d1170 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1fc4>
  dda830:	6a 15                	push   0x15
  dda832:	41 5d                	pop    r13
  dda834:	4c 89 e2             	mov    rdx,r12
  dda837:	4d 89 e8             	mov    r8,r13
  dda83a:	45 31 c9             	xor    r9d,r9d
  dda83d:	e8 1c cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda842:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda845:	48 8d 35 44 69 5f ff 	lea    rsi,[rip+0xffffffffff5f6944]        # 3d1190 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1fe4>
  dda84c:	48 8d 0d 6d 69 5f ff 	lea    rcx,[rip+0xffffffffff5f696d]        # 3d11c0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2014>
  dda853:	6a 1e                	push   0x1e
  dda855:	5d                   	pop    rbp
  dda856:	6a 01                	push   0x1
  dda858:	41 5e                	pop    r14
  dda85a:	4c 89 e2             	mov    rdx,r12
  dda85d:	49 89 e8             	mov    r8,rbp
  dda860:	45 89 f1             	mov    r9d,r14d
  dda863:	e8 f6 cc 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda868:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda86b:	48 8d 35 6e 69 5f ff 	lea    rsi,[rip+0xffffffffff5f696e]        # 3d11e0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2034>
  dda872:	48 8d 0d 97 69 5f ff 	lea    rcx,[rip+0xffffffffff5f6997]        # 3d1210 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2064>
  dda879:	4c 89 e2             	mov    rdx,r12
  dda87c:	6a 13                	push   0x13
  dda87e:	41 58                	pop    r8
  dda880:	45 89 f1             	mov    r9d,r14d
  dda883:	e8 d6 cc 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda888:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda88b:	48 8d 35 9e 69 5f ff 	lea    rsi,[rip+0xffffffffff5f699e]        # 3d1230 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2084>
  dda892:	48 8d 0d c7 69 5f ff 	lea    rcx,[rip+0xffffffffff5f69c7]        # 3d1260 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x20b4>
  dda899:	6a 18                	push   0x18
  dda89b:	41 58                	pop    r8
  dda89d:	4c 89 e2             	mov    rdx,r12
  dda8a0:	45 31 c9             	xor    r9d,r9d
  dda8a3:	e8 b6 cc 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda8a8:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda8ab:	bb e8 03 00 00       	mov    ebx,0x3e8
  dda8b0:	48 8d 35 c9 69 5f ff 	lea    rsi,[rip+0xffffffffff5f69c9]        # 3d1280 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x20d4>
  dda8b7:	48 8d 0d f2 69 5f ff 	lea    rcx,[rip+0xffffffffff5f69f2]        # 3d12b0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2104>
  dda8be:	4c 89 e2             	mov    rdx,r12
  dda8c1:	49 89 e8             	mov    r8,rbp
  dda8c4:	45 31 c9             	xor    r9d,r9d
  dda8c7:	53                   	push   rbx
  dda8c8:	6a 00                	push   0x0
  dda8ca:	e8 23 cd 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda8cf:	48 83 c4 10          	add    rsp,0x10
  dda8d3:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda8d6:	48 8d 35 f3 69 5f ff 	lea    rsi,[rip+0xffffffffff5f69f3]        # 3d12d0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2124>
  dda8dd:	48 8d 0d 1c 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6a1c]        # 3d1300 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2154>
  dda8e4:	4c 89 e2             	mov    rdx,r12
  dda8e7:	49 89 e8             	mov    r8,rbp
  dda8ea:	45 31 c9             	xor    r9d,r9d
  dda8ed:	53                   	push   rbx
  dda8ee:	6a 00                	push   0x0
  dda8f0:	e8 fd cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda8f5:	48 83 c4 10          	add    rsp,0x10
  dda8f9:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda8fc:	bb ff ff ff 7f       	mov    ebx,0x7fffffff
  dda901:	48 8d 35 18 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6a18]        # 3d1320 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2174>
  dda908:	48 8d 0d 41 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6a41]        # 3d1350 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x21a4>
  dda90f:	4c 89 e2             	mov    rdx,r12
  dda912:	4d 89 e8             	mov    r8,r13
  dda915:	41 b9 00 02 00 00    	mov    r9d,0x200
  dda91b:	53                   	push   rbx
  dda91c:	6a 00                	push   0x0
  dda91e:	e8 cf cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda923:	48 83 c4 10          	add    rsp,0x10
  dda927:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda92a:	48 8d 35 3f 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6a3f]        # 3d1370 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x21c4>
  dda931:	48 8d 0d 68 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6a68]        # 3d13a0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x21f4>
  dda938:	6a 1d                	push   0x1d
  dda93a:	41 58                	pop    r8
  dda93c:	6a 1f                	push   0x1f
  dda93e:	41 5d                	pop    r13
  dda940:	4c 89 e2             	mov    rdx,r12
  dda943:	45 89 e9             	mov    r9d,r13d
  dda946:	53                   	push   rbx
  dda947:	6a 00                	push   0x0
  dda949:	e8 a4 cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda94e:	48 83 c4 10          	add    rsp,0x10
  dda952:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda955:	48 8d 35 64 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6a64]        # 3d13c0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2214>
  dda95c:	48 8d 0d 8d 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6a8d]        # 3d13f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2244>
  dda963:	4c 89 e2             	mov    rdx,r12
  dda966:	49 89 e8             	mov    r8,rbp
  dda969:	41 b9 8d 51 01 00    	mov    r9d,0x1518d
  dda96f:	53                   	push   rbx
  dda970:	6a 00                	push   0x0
  dda972:	e8 7b cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda977:	48 83 c4 10          	add    rsp,0x10
  dda97b:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda97e:	48 8d 35 8b 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6a8b]        # 3d1410 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2264>
  dda985:	48 8d 0d b4 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6ab4]        # 3d1440 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2294>
  dda98c:	6a 20                	push   0x20
  dda98e:	41 58                	pop    r8
  dda990:	4c 89 e2             	mov    rdx,r12
  dda993:	45 89 e9             	mov    r9d,r13d
  dda996:	53                   	push   rbx
  dda997:	6a 00                	push   0x0
  dda999:	e8 54 cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda99e:	48 83 c4 10          	add    rsp,0x10
  dda9a2:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda9a5:	48 8d 35 c4 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6ac4]        # 3d1470 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x22c4>
  dda9ac:	48 8d 0d ed 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6aed]        # 3d14a0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x22f4>
  dda9b3:	4c 89 e2             	mov    rdx,r12
  dda9b6:	49 89 e8             	mov    r8,rbp
  dda9b9:	45 89 f1             	mov    r9d,r14d
  dda9bc:	e8 9d cb 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda9c1:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda9c4:	48 8d 35 f5 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6af5]        # 3d14c0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2314>
  dda9cb:	48 8d 0d 1e 6b 5f ff 	lea    rcx,[rip+0xffffffffff5f6b1e]        # 3d14f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2344>
  dda9d2:	4c 89 e2             	mov    rdx,r12
  dda9d5:	6a 21                	push   0x21
  dda9d7:	41 58                	pop    r8
  dda9d9:	45 31 c9             	xor    r9d,r9d
  dda9dc:	e8 7d cb 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda9e1:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  dda9e4:	48 8d 35 d5 64 5f ff 	lea    rsi,[rip+0xffffffffff5f64d5]        # 3d0ec0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d14>
  dda9eb:	4c 89 e2             	mov    rdx,r12
  dda9ee:	48 8d 0d ef 64 5f ff 	lea    rcx,[rip+0xffffffffff5f64ef]        # 3d0ee4 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d38>
  dda9f5:	6a 0d                	push   0xd
  dda9f7:	41 58                	pop    r8
  dda9f9:	45 31 c9             	xor    r9d,r9d
  dda9fc:	e8 89 c9 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa01:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
  ddaa05:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ddaa08:	48 8d 35 f1 64 5f ff 	lea    rsi,[rip+0xffffffffff5f64f1]        # 3d0f00 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d54>
  ddaa0f:	4c 89 e2             	mov    rdx,r12
  ddaa12:	48 8d 0d 17 65 5f ff 	lea    rcx,[rip+0xffffffffff5f6517]        # 3d0f30 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1d84>
  ddaa19:	6a 0f                	push   0xf
  ddaa1b:	41 58                	pop    r8
  ddaa1d:	45 31 c9             	xor    r9d,r9d
  ddaa20:	e8 65 c9 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa25:	88 44 24 0f          	mov    BYTE PTR [rsp+0xf],al
  ddaa29:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ddaa2c:	48 8d 35 0d 67 5f ff 	lea    rsi,[rip+0xffffffffff5f670d]        # 3d1140 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f94>
  ddaa33:	4c 89 e2             	mov    rdx,r12
  ddaa36:	48 8d 0d 33 67 5f ff 	lea    rcx,[rip+0xffffffffff5f6733]        # 3d1170 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1fc4>
  ddaa3d:	6a 15                	push   0x15
  ddaa3f:	41 58                	pop    r8
  ddaa41:	45 31 c9             	xor    r9d,r9d
  ddaa44:	e8 41 c9 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa49:	88 44 24 0e          	mov    BYTE PTR [rsp+0xe],al
  ddaa4d:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ddaa50:	48 8d 35 89 67 5f ff 	lea    rsi,[rip+0xffffffffff5f6789]        # 3d11e0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2034>
  ddaa57:	4c 89 e2             	mov    rdx,r12
  ddaa5a:	48 8d 0d af 67 5f ff 	lea    rcx,[rip+0xffffffffff5f67af]        # 3d1210 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2064>
  ddaa61:	6a 13                	push   0x13
  ddaa63:	41 58                	pop    r8
  ddaa65:	45 89 f1             	mov    r9d,r14d
  ddaa68:	e8 1d c9 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa6d:	88 44 24 0d          	mov    BYTE PTR [rsp+0xd],al
  ddaa71:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ddaa74:	48 8d 35 b5 67 5f ff 	lea    rsi,[rip+0xffffffffff5f67b5]        # 3d1230 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2084>
  ddaa7b:	4c 89 e2             	mov    rdx,r12
  ddaa7e:	48 8d 0d db 67 5f ff 	lea    rcx,[rip+0xffffffffff5f67db]        # 3d1260 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x20b4>
  ddaa85:	6a 18                	push   0x18
  ddaa87:	41 58                	pop    r8
  ddaa89:	45 31 c9             	xor    r9d,r9d
  ddaa8c:	e8 f9 c8 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa91:	88 44 24 0c          	mov    BYTE PTR [rsp+0xc],al
  ddaa95:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ddaa98:	48 8d 35 e1 67 5f ff 	lea    rsi,[rip+0xffffffffff5f67e1]        # 3d1280 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x20d4>
  ddaa9f:	4c 89 e2             	mov    rdx,r12
  ddaaa2:	48 8d 0d 07 68 5f ff 	lea    rcx,[rip+0xffffffffff5f6807]        # 3d12b0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2104>
  ddaaa9:	49 89 e8             	mov    r8,rbp
  ddaaac:	45 31 c9             	xor    r9d,r9d
  ddaaaf:	e8 76 c9 80 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  ddaab4:	89 84 24 94 00 00 00 	mov    DWORD PTR [rsp+0x94],eax
  ddaabb:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  ddaabe:	48 8d 35 0b 68 5f ff 	lea    rsi,[rip+0xffffffffff5f680b]        # 3d12d0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2124>
  ddaac5:	4c 89 e2             	mov    rdx,r12
  ddaac8:	48 8d 0d 31 68 5f ff 	lea    rcx,[rip+0xffffffffff5f6831]        # 3d1300 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2154>
  ddaacf:	49 89 e8             	mov    r8,rbp
  ddaad2:	45 31 c9             	xor    r9d,r9d
  ddaad5:	e8 50 c9 80 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  ddaada:	89 c3                	mov    ebx,eax
  ddaadc:	48 8b 74 24 40       	mov    rsi,QWORD PTR [rsp+0x40]
  ddaae1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  ddaae4:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]
  ddaaeb:	00 
  ddaaec:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddaaef:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  ddaaf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ddaaf7:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddaafa:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
  ddab01:	00 
  ddab02:	4c 8b 74 24 50       	mov    r14,QWORD PTR [rsp+0x50]
  ddab07:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  ddab0c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ddab0f:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddab12:	48 89 c5             	mov    rbp,rax
  ddab15:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
  ddab1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ddab1d:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddab20:	49 89 c7             	mov    r15,rax
  ddab23:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  ddab28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  ddab2b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  ddab2e:	49 89 c5             	mov    r13,rax
  ddab31:	49 8b 06             	mov    rax,QWORD PTR [r14]
  ddab34:	4c 89 f7             	mov    rdi,r14
  ddab37:	ff 50 48             	call   QWORD PTR [rax+0x48]
  ddab3a:	48 8d 0d 87 fe a4 00 	lea    rcx,[rip+0xa4fe87]        # 182a9c8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6ff8>
  ddab41:	4c 8d a4 24 30 02 00 	lea    r12,[rsp+0x230]
  ddab48:	00 
  ddab49:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
  ddab4d:	48 83 a4 24 20 02 00 	and    QWORD PTR [rsp+0x220],0x0
  ddab54:	00 00 
  ddab56:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
  ddab5b:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
  ddab60:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
  ddab65:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
  ddab6c:	00 
  ddab6d:	48 8d 05 f0 18 ca ff 	lea    rax,[rip+0xffffffffffca18f0]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  ddab74:	48 89 84 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rax
  ddab7b:	00 
  ddab7c:	48 8d 05 41 13 00 00 	lea    rax,[rip+0x1341]        # ddbec4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8f4a>
  ddab83:	48 89 84 24 f8 01 00 	mov    QWORD PTR [rsp+0x1f8],rax
  ddab8a:	00 
  ddab8b:	49 8b 06             	mov    rax,QWORD PTR [r14]
  ddab8e:	48 8d bc 24 b0 01 00 	lea    rdi,[rsp+0x1b0]
  ddab95:	00 
  ddab96:	4c 89 f6             	mov    rsi,r14
  ddab99:	ff 50 60             	call   QWORD PTR [rax+0x60]
  ddab9c:	48 8b 44 24 28       	mov    rax,QWORD PTR [rsp+0x28]
  ddaba1:	48 89 84 24 90 01 00 	mov    QWORD PTR [rsp+0x190],rax
  ddaba8:	00 
  ddaba9:	48 8d 05 b4 18 ca ff 	lea    rax,[rip+0xffffffffffca18b4]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
  ddabb0:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
  ddabb7:	00 
  ddabb8:	48 8d 05 4b 13 00 00 	lea    rax,[rip+0x134b]        # ddbf0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa8f90>
  ddabbf:	48 89 84 24 a8 01 00 	mov    QWORD PTR [rsp+0x1a8],rax
  ddabc6:	00 
  ddabc7:	bf 30 08 00 00       	mov    edi,0x830
  ddabcc:	e8 2f 33 a1 00       	call   17edf00 <_Znwm@plt>
  ddabd1:	49 89 c6             	mov    r14,rax
  ddabd4:	0f 28 84 24 f0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xf0]
  ddabdb:	00 
  ddabdc:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
  ddabe1:	0f 57 c0             	xorps  xmm0,xmm0
  ddabe4:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
  ddabeb:	00 
  ddabec:	48 8d bc 24 60 02 00 	lea    rdi,[rsp+0x260]
  ddabf3:	00 
  ddabf4:	48 8d b4 24 b0 01 00 	lea    rsi,[rsp+0x1b0]
  ddabfb:	00 
  ddabfc:	e8 a9 82 3c 00       	call   11a2eaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a2c0>
  ddac01:	48 8d 05 50 e4 a7 00 	lea    rax,[rip+0xa7e450]        # 1859058 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x15740>
  ddac08:	49 89 06             	mov    QWORD PTR [r14],rax
  ddac0b:	66 0f 6f 44 24 50    	movdqa xmm0,XMMWORD PTR [rsp+0x50]
  ddac11:	f3 41 0f 7f 46 08    	movdqu XMMWORD PTR [r14+0x8],xmm0
  ddac17:	48 8b 84 24 e0 00 00 	mov    rax,QWORD PTR [rsp+0xe0]
  ddac1e:	00 
  ddac1f:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
  ddac23:	49 89 6e 20          	mov    QWORD PTR [r14+0x20],rbp
  ddac27:	4d 89 7e 28          	mov    QWORD PTR [r14+0x28],r15
  ddac2b:	4d 89 6e 30          	mov    QWORD PTR [r14+0x30],r13
  ddac2f:	4d 8d 7e 40          	lea    r15,[r14+0x40]
  ddac33:	48 8b 84 24 50 02 00 	mov    rax,QWORD PTR [rsp+0x250]
  ddac3a:	00 
  ddac3b:	48 85 c0             	test   rax,rax
  ddac3e:	74 13                	je     ddac53 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa7cd9>

## All r13 writes/definitions in constructor prefix
  dda57a:	49 89 c5             	mov    r13,rax
  dda5d7:	49 89 c5             	mov    r13,rax
  dda832:	41 5d                	pop    r13
  dda93e:	41 5d                	pop    r13
  ddab2e:	49 89 c5             	mov    r13,rax

## Calls immediately before each r13 definition
### r13 definition at 0xdda57a: mov    r13,rax
      dda532:	4c 89 e7             	mov    rdi,r12
      dda535:	e8 28 b7 e6 ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
      dda53a:	48 89 84 24 c0 00 00 	mov    QWORD PTR [rsp+0xc0],rax
      dda541:	00 
      dda542:	4c 89 e7             	mov    rdi,r12
      dda545:	e8 2a 8d d8 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
      dda54a:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      dda54f:	4c 89 e7             	mov    rdi,r12
      dda552:	e8 cf 71 e3 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
      dda557:	48 89 c3             	mov    rbx,rax
      dda55a:	4c 89 e7             	mov    rdi,r12
      dda55d:	e8 3e 8d d8 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
      dda562:	49 89 c7             	mov    r15,rax
      dda565:	4c 89 e7             	mov    rdi,r12
      dda568:	e8 e3 72 e3 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
      dda56d:	48 89 44 24 40       	mov    QWORD PTR [rsp+0x40],rax
      dda572:	4c 89 e7             	mov    rdi,r12
      dda575:	e8 1a da da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
      dda57a:	49 89 c5             	mov    r13,rax
      dda57d:	4c 89 e7             	mov    rdi,r12
      dda580:	e8 cb 71 e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
      dda585:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      dda58a:	4c 89 e7             	mov    rdi,r12
      dda58d:	e8 68 72 e3 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
      dda592:	49 89 c4             	mov    r12,rax
      dda595:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
      dda599:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      dda59e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
      dda5a5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      dda5aa:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
      dda5ae:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      dda5b5:	00 
      dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax

### r13 definition at 0xdda5d7: mov    r13,rax
      dda58a:	4c 89 e7             	mov    rdi,r12
      dda58d:	e8 68 72 e3 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
      dda592:	49 89 c4             	mov    r12,rax
      dda595:	49 8b 46 60          	mov    rax,QWORD PTR [r14+0x60]
      dda599:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
      dda59e:	49 8b 86 80 00 00 00 	mov    rax,QWORD PTR [r14+0x80]
      dda5a5:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
      dda5aa:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
      dda5ae:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
      dda5b5:	00 
      dda5b6:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
      dda5ba:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
      dda5bf:	49 8b 46 40          	mov    rax,QWORD PTR [r14+0x40]
      dda5c3:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
      dda5c8:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
      dda5cc:	4c 89 6c 24 78       	mov    QWORD PTR [rsp+0x78],r13
      dda5d1:	4c 89 ef             	mov    rdi,r13
      dda5d4:	ff 50 28             	call   QWORD PTR [rax+0x28]
      dda5d7:	49 89 c5             	mov    r13,rax
      dda5da:	49 8b 07             	mov    rax,QWORD PTR [r15]
      dda5dd:	4c 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],r15
      dda5e2:	4c 89 ff             	mov    rdi,r15
      dda5e5:	ff 50 28             	call   QWORD PTR [rax+0x28]
      dda5e8:	49 8b 4e 40          	mov    rcx,QWORD PTR [r14+0x40]
      dda5ec:	4c 8d 05 0d ff 5f ff 	lea    r8,[rip+0xffffffffff5fff0d]        # 3da500 <_ZTSN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x50e5>
      dda5f3:	48 8d bc 24 e8 00 00 	lea    rdi,[rsp+0xe8]
      dda5fa:	00 
      dda5fb:	4c 89 ee             	mov    rsi,r13
      dda5fe:	48 89 c2             	mov    rdx,rax
      dda601:	e8 da 1b 00 00       	call   ddc1e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9266>
      dda606:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
      dda60a:	4c 89 e7             	mov    rdi,r12
      dda60d:	ff 50 28             	call   QWORD PTR [rax+0x28]
      dda610:	4c 8b 78 10          	mov    r15,QWORD PTR [rax+0x10]
      dda614:	6a 58                	push   0x58
      dda616:	5f                   	pop    rdi

### r13 definition at 0xdda832: pop    r13
      dda7e9:	48 8d 0d e0 68 5f ff 	lea    rcx,[rip+0xffffffffff5f68e0]        # 3d10d0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f24>
      dda7f0:	6a 1f                	push   0x1f
      dda7f2:	41 58                	pop    r8
      dda7f4:	4c 89 e2             	mov    rdx,r12
      dda7f7:	45 31 c9             	xor    r9d,r9d
      dda7fa:	e8 5f cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      dda7ff:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      dda802:	48 8d 35 e7 68 5f ff 	lea    rsi,[rip+0xffffffffff5f68e7]        # 3d10f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f44>
      dda809:	48 8d 0d 10 69 5f ff 	lea    rcx,[rip+0xffffffffff5f6910]        # 3d1120 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f74>
      dda810:	6a 14                	push   0x14
      dda812:	41 58                	pop    r8
      dda814:	4c 89 e2             	mov    rdx,r12
      dda817:	45 31 c9             	xor    r9d,r9d
      dda81a:	e8 3f cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      dda81f:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      dda822:	48 8d 35 17 69 5f ff 	lea    rsi,[rip+0xffffffffff5f6917]        # 3d1140 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1f94>
      dda829:	48 8d 0d 40 69 5f ff 	lea    rcx,[rip+0xffffffffff5f6940]        # 3d1170 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1fc4>
      dda830:	6a 15                	push   0x15
      dda832:	41 5d                	pop    r13
      dda834:	4c 89 e2             	mov    rdx,r12
      dda837:	4d 89 e8             	mov    r8,r13
      dda83a:	45 31 c9             	xor    r9d,r9d
      dda83d:	e8 1c cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      dda842:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      dda845:	48 8d 35 44 69 5f ff 	lea    rsi,[rip+0xffffffffff5f6944]        # 3d1190 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x1fe4>
      dda84c:	48 8d 0d 6d 69 5f ff 	lea    rcx,[rip+0xffffffffff5f696d]        # 3d11c0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2014>
      dda853:	6a 1e                	push   0x1e
      dda855:	5d                   	pop    rbp
      dda856:	6a 01                	push   0x1
      dda858:	41 5e                	pop    r14
      dda85a:	4c 89 e2             	mov    rdx,r12
      dda85d:	49 89 e8             	mov    r8,rbp
      dda860:	45 89 f1             	mov    r9d,r14d
      dda863:	e8 f6 cc 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
      dda868:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      dda86b:	48 8d 35 6e 69 5f ff 	lea    rsi,[rip+0xffffffffff5f696e]        # 3d11e0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2034>

### r13 definition at 0xdda93e: pop    r13
      dda8f5:	48 83 c4 10          	add    rsp,0x10
      dda8f9:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      dda8fc:	bb ff ff ff 7f       	mov    ebx,0x7fffffff
      dda901:	48 8d 35 18 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6a18]        # 3d1320 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2174>
      dda908:	48 8d 0d 41 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6a41]        # 3d1350 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x21a4>
      dda90f:	4c 89 e2             	mov    rdx,r12
      dda912:	4d 89 e8             	mov    r8,r13
      dda915:	41 b9 00 02 00 00    	mov    r9d,0x200
      dda91b:	53                   	push   rbx
      dda91c:	6a 00                	push   0x0
      dda91e:	e8 cf cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
      dda923:	48 83 c4 10          	add    rsp,0x10
      dda927:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      dda92a:	48 8d 35 3f 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6a3f]        # 3d1370 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x21c4>
      dda931:	48 8d 0d 68 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6a68]        # 3d13a0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x21f4>
      dda938:	6a 1d                	push   0x1d
      dda93a:	41 58                	pop    r8
      dda93c:	6a 1f                	push   0x1f
      dda93e:	41 5d                	pop    r13
      dda940:	4c 89 e2             	mov    rdx,r12
      dda943:	45 89 e9             	mov    r9d,r13d
      dda946:	53                   	push   rbx
      dda947:	6a 00                	push   0x0
      dda949:	e8 a4 cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
      dda94e:	48 83 c4 10          	add    rsp,0x10
      dda952:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
      dda955:	48 8d 35 64 6a 5f ff 	lea    rsi,[rip+0xffffffffff5f6a64]        # 3d13c0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2214>
      dda95c:	48 8d 0d 8d 6a 5f ff 	lea    rcx,[rip+0xffffffffff5f6a8d]        # 3d13f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x2244>
      dda963:	4c 89 e2             	mov    rdx,r12
      dda966:	49 89 e8             	mov    r8,rbp
      dda969:	41 b9 8d 51 01 00    	mov    r9d,0x1518d
      dda96f:	53                   	push   rbx
      dda970:	6a 00                	push   0x0
      dda972:	e8 7b cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
      dda977:	48 83 c4 10          	add    rsp,0x10
      dda97b:	49 8b 3f             	mov    rdi,QWORD PTR [r15]

### r13 definition at 0xddab2e: mov    r13,rax
      ddaaec:	ff 50 28             	call   QWORD PTR [rax+0x28]
      ddaaef:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      ddaaf4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ddaaf7:	ff 50 28             	call   QWORD PTR [rax+0x28]
      ddaafa:	48 89 84 24 e0 00 00 	mov    QWORD PTR [rsp+0xe0],rax
      ddab01:	00 
      ddab02:	4c 8b 74 24 50       	mov    r14,QWORD PTR [rsp+0x50]
      ddab07:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
      ddab0c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ddab0f:	ff 50 28             	call   QWORD PTR [rax+0x28]
      ddab12:	48 89 c5             	mov    rbp,rax
      ddab15:	48 8b 7c 24 78       	mov    rdi,QWORD PTR [rsp+0x78]
      ddab1a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ddab1d:	ff 50 28             	call   QWORD PTR [rax+0x28]
      ddab20:	49 89 c7             	mov    r15,rax
      ddab23:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
      ddab28:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      ddab2b:	ff 50 28             	call   QWORD PTR [rax+0x28]
      ddab2e:	49 89 c5             	mov    r13,rax
      ddab31:	49 8b 06             	mov    rax,QWORD PTR [r14]
      ddab34:	4c 89 f7             	mov    rdi,r14
      ddab37:	ff 50 48             	call   QWORD PTR [rax+0x48]
      ddab3a:	48 8d 0d 87 fe a4 00 	lea    rcx,[rip+0xa4fe87]        # 182a9c8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x6ff8>
      ddab41:	4c 8d a4 24 30 02 00 	lea    r12,[rsp+0x230]
      ddab48:	00 
      ddab49:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
      ddab4d:	48 83 a4 24 20 02 00 	and    QWORD PTR [rsp+0x220],0x0
      ddab54:	00 00 
      ddab56:	49 89 44 24 08       	mov    QWORD PTR [r12+0x8],rax
      ddab5b:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
      ddab60:	48 8b 44 24 70       	mov    rax,QWORD PTR [rsp+0x70]
      ddab65:	48 89 84 24 e0 01 00 	mov    QWORD PTR [rsp+0x1e0],rax
      ddab6c:	00 
      ddab6d:	48 8d 05 f0 18 ca ff 	lea    rax,[rip+0xffffffffffca18f0]        # a7c464 <JNI_OnUnload@@Base+0x3d31>
      ddab74:	48 89 84 24 f0 01 00 	mov    QWORD PTR [rsp+0x1f0],rax
      ddab7b:	00 


## Direct callees in constructor prefix
  dda528:	e8 1d 93 e7 ff       	call   c5384a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1a07ea>
  dda535:	e8 28 b7 e6 ff       	call   c45c62 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x192c02>
  dda545:	e8 2a 8d d8 ff       	call   b63274 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0214>
  dda552:	e8 cf 71 e3 ff       	call   c11726 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6c6>
  dda55d:	e8 3e 8d d8 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
  dda568:	e8 e3 72 e3 ff       	call   c11850 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e7f0>
  dda575:	e8 1a da da ff       	call   b87f94 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f34>
  dda580:	e8 cb 71 e3 ff       	call   c11750 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e6f0>
  dda58d:	e8 68 72 e3 ff       	call   c117fa <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e79a>
  dda601:	e8 da 1b 00 00       	call   ddc1e0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xa9266>
  dda617:	e8 e4 38 a1 00       	call   17edf00 <_Znwm@plt>
  dda6b7:	e8 3a f3 9f 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>
  dda6dc:	e8 4e 4a d6 ff       	call   b3f12f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8c0cf>
  dda715:	e8 44 ce 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda735:	e8 24 ce 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda755:	e8 04 ce 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda77e:	e8 6f ce 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda7a8:	e8 45 ce 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda7d6:	e8 17 ce 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda7fa:	e8 5f cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda81a:	e8 3f cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda83d:	e8 1c cd 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda863:	e8 f6 cc 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda883:	e8 d6 cc 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda8a3:	e8 b6 cc 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda8ca:	e8 23 cd 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda8f0:	e8 fd cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda91e:	e8 cf cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda949:	e8 a4 cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda972:	e8 7b cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda999:	e8 54 cc 80 00       	call   15e75f2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cb76>
  dda9bc:	e8 9d cb 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda9dc:	e8 7d cb 80 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  dda9fc:	e8 89 c9 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa20:	e8 65 c9 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa44:	e8 41 c9 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa68:	e8 1d c9 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaa8c:	e8 f9 c8 80 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  ddaaaf:	e8 76 c9 80 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  ddaad5:	e8 50 c9 80 00       	call   15e742a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c9ae>
  ddabcc:	e8 2f 33 a1 00       	call   17edf00 <_Znwm@plt>
  ddabfc:	e8 a9 82 3c 00       	call   11a2eaa <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x36a2c0>
