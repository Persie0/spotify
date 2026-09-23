# Restrictions callback package helper `17da794` v14

Focus: classify the helper called at `e950ef` with `rdi=rsp+0xbe0`, `rcx=e99c54`, `r9=0x20`. Static provenance only.

## `17da794` body window

```text
 17da694:	48 89 c3             	mov    rbx,rax
 17da697:	48 8b 7c 24 40       	mov    rdi,QWORD PTR [rsp+0x40]
 17da69c:	e8 e5 3d 2c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 17da6a1:	48 8b 7c 24 30       	mov    rdi,QWORD PTR [rsp+0x30]
 17da6a6:	e8 db 3d 2c ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
 17da6ab:	4c 89 f7             	mov    rdi,r14
 17da6ae:	e8 b1 24 2e ff       	call   abcb64 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x9b04>
 17da6b3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da6ba:	00 00
 17da6bc:	48 3b 44 24 60       	cmp    rax,QWORD PTR [rsp+0x60]
 17da6c1:	75 12                	jne    17da6d5 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x64f6>
 17da6c3:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
 17da6c8:	e8 33 3a 01 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>
 17da6cd:	48 89 df             	mov    rdi,rbx
 17da6d0:	e8 fb 55 29 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 17da6d5:	e8 d6 53 01 00       	call   17efab0 <__stack_chk_fail@plt>
 17da6da:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 17da6df:	0f 57 c0             	xorps  xmm0,xmm0
 17da6e2:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 17da6e5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
 17da6e8:	48 89 07             	mov    QWORD PTR [rdi],rax
 17da6eb:	48 8b 46 08          	mov    rax,QWORD PTR [rsi+0x8]
 17da6ef:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
 17da6f3:	48 8b 46 10          	mov    rax,QWORD PTR [rsi+0x10]
 17da6f7:	48 89 47 10          	mov    QWORD PTR [rdi+0x10],rax
 17da6fb:	0f 11 06             	movups XMMWORD PTR [rsi],xmm0
 17da6fe:	48 8b 46 18          	mov    rax,QWORD PTR [rsi+0x18]
 17da702:	0f 11 46 10          	movups XMMWORD PTR [rsi+0x10],xmm0
 17da706:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
 17da70a:	48 8b 46 20          	mov    rax,QWORD PTR [rsi+0x20]
 17da70e:	48 83 66 20 00       	and    QWORD PTR [rsi+0x20],0x0
 17da713:	48 89 47 20          	mov    QWORD PTR [rdi+0x20],rax
 17da717:	48 8b 46 28          	mov    rax,QWORD PTR [rsi+0x28]
 17da71b:	48 83 66 28 00       	and    QWORD PTR [rsi+0x28],0x0
 17da720:	48 89 47 28          	mov    QWORD PTR [rdi+0x28],rax
 17da724:	48 8b 46 30          	mov    rax,QWORD PTR [rsi+0x30]
 17da728:	48 83 66 30 00       	and    QWORD PTR [rsi+0x30],0x0
 17da72d:	48 89 47 30          	mov    QWORD PTR [rdi+0x30],rax
 17da731:	48 8b 46 38          	mov    rax,QWORD PTR [rsi+0x38]
 17da735:	48 89 47 38          	mov    QWORD PTR [rdi+0x38],rax
 17da739:	c3                   	ret
 17da73a:	41 56                	push   r14
 17da73c:	53                   	push   rbx
 17da73d:	50                   	push   rax
 17da73e:	49 89 f6             	mov    r14,rsi
 17da741:	48 89 fb             	mov    rbx,rdi
 17da744:	e8 ad 45 e1 ff       	call   15eecf6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43427a>
 17da749:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 17da74d:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 17da751:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
 17da755:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 17da759:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
 17da75d:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 17da761:	49 8b 7e 38          	mov    rdi,QWORD PTR [r14+0x38]
 17da765:	6a 08                	push   0x8
 17da767:	5e                   	pop    rsi
 17da768:	e8 d3 50 01 00       	call   17ef840 <_ZnamSt11align_val_t@plt>
 17da76d:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 17da771:	49 8b 56 38          	mov    rdx,QWORD PTR [r14+0x38]
 17da775:	48 89 53 38          	mov    QWORD PTR [rbx+0x38],rdx
 17da779:	49 8b 76 30          	mov    rsi,QWORD PTR [r14+0x30]
 17da77d:	48 89 c7             	mov    rdi,rax
 17da780:	ff 53 18             	call   QWORD PTR [rbx+0x18]
 17da783:	48 83 c4 08          	add    rsp,0x8
 17da787:	5b                   	pop    rbx
 17da788:	41 5e                	pop    r14
 17da78a:	c3                   	ret
 17da78b:	48 89 c7             	mov    rdi,rax
 17da78e:	e8 12 f3 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17da793:	cc                   	int3
 17da794:	41 57                	push   r15
 17da796:	41 56                	push   r14
 17da798:	53                   	push   rbx
 17da799:	4c 89 cb             	mov    rbx,r9
 17da79c:	4d 89 c6             	mov    r14,r8
 17da79f:	49 89 ff             	mov    r15,rdi
 17da7a2:	0f 57 c0             	xorps  xmm0,xmm0
 17da7a5:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0
 17da7aa:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0
 17da7ad:	48 89 77 18          	mov    QWORD PTR [rdi+0x18],rsi
 17da7b1:	48 89 57 20          	mov    QWORD PTR [rdi+0x20],rdx
 17da7b5:	48 89 4f 28          	mov    QWORD PTR [rdi+0x28],rcx
 17da7b9:	6a 08                	push   0x8
 17da7bb:	5e                   	pop    rsi
 17da7bc:	4c 89 cf             	mov    rdi,r9
 17da7bf:	e8 7c 50 01 00       	call   17ef840 <_ZnamSt11align_val_t@plt>
 17da7c4:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax
 17da7c8:	49 89 5f 38          	mov    QWORD PTR [r15+0x38],rbx
 17da7cc:	48 89 c7             	mov    rdi,rax
 17da7cf:	4c 89 f6             	mov    rsi,r14
 17da7d2:	48 89 da             	mov    rdx,rbx
 17da7d5:	41 ff 57 18          	call   QWORD PTR [r15+0x18]
 17da7d9:	5b                   	pop    rbx
 17da7da:	41 5e                	pop    r14
 17da7dc:	41 5f                	pop    r15
 17da7de:	c3                   	ret
 17da7df:	48 89 c7             	mov    rdi,rax
 17da7e2:	e8 be f2 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17da7e7:	cc                   	int3
 17da7e8:	53                   	push   rbx
 17da7e9:	48 89 fb             	mov    rbx,rdi
 17da7ec:	e8 11 00 00 00       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>
 17da7f1:	48 89 df             	mov    rdi,rbx
 17da7f4:	5b                   	pop    rbx
 17da7f5:	e9 82 4a e1 ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>
 17da7fa:	48 89 c7             	mov    rdi,rax
 17da7fd:	e8 a3 f2 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17da802:	53                   	push   rbx
 17da803:	48 89 fb             	mov    rbx,rdi
 17da806:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]
 17da80a:	48 85 ff             	test   rdi,rdi
 17da80d:	74 1d                	je     17da82c <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x664d>
 17da80f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]
 17da813:	48 85 c0             	test   rax,rax
 17da816:	74 06                	je     17da81e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x663f>
 17da818:	ff d0                	call   rax
 17da81a:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]
 17da81e:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0
 17da823:	6a 08                	push   0x8
 17da825:	5e                   	pop    rsi
 17da826:	5b                   	pop    rbx
 17da827:	e9 04 50 01 00       	jmp    17ef830 <_ZdaPvSt11align_val_t@plt>
 17da82c:	5b                   	pop    rbx
 17da82d:	c3                   	ret
 17da82e:	41 56                	push   r14
 17da830:	53                   	push   rbx
 17da831:	50                   	push   rax
 17da832:	48 89 fb             	mov    rbx,rdi
 17da835:	48 39 f7             	cmp    rdi,rsi
 17da838:	74 6c                	je     17da8a6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x66c7>
 17da83a:	49 89 f6             	mov    r14,rsi
 17da83d:	48 89 df             	mov    rdi,rbx
 17da840:	e8 bd ff ff ff       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>
 17da845:	48 89 df             	mov    rdi,rbx
 17da848:	e8 69 d8 ff ff       	call   17d80b6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3ed7>
 17da84d:	49 8b 06             	mov    rax,QWORD PTR [r14]
 17da850:	48 89 03             	mov    QWORD PTR [rbx],rax
 17da853:	49 8b 46 08          	mov    rax,QWORD PTR [r14+0x8]
 17da857:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
 17da85b:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]
 17da85f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax
 17da863:	0f 57 c0             	xorps  xmm0,xmm0
 17da866:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 17da86a:	49 8b 46 18          	mov    rax,QWORD PTR [r14+0x18]
 17da86e:	41 0f 11 46 10       	movups XMMWORD PTR [r14+0x10],xmm0
 17da873:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
 17da877:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
 17da87b:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
 17da880:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
 17da884:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
 17da888:	49 83 66 28 00       	and    QWORD PTR [r14+0x28],0x0
 17da88d:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
 17da891:	49 8b 46 30          	mov    rax,QWORD PTR [r14+0x30]
 17da895:	49 83 66 30 00       	and    QWORD PTR [r14+0x30],0x0
 17da89a:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax
 17da89e:	49 8b 46 38          	mov    rax,QWORD PTR [r14+0x38]
 17da8a2:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
 17da8a6:	48 89 d8             	mov    rax,rbx
 17da8a9:	48 83 c4 08          	add    rsp,0x8
 17da8ad:	5b                   	pop    rbx
 17da8ae:	41 5e                	pop    r14
 17da8b0:	c3                   	ret
 17da8b1:	48 89 c7             	mov    rdi,rax
 17da8b4:	e8 ec f1 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
 17da8b9:	cc                   	int3
 17da8ba:	53                   	push   rbx
 17da8bb:	48 83 ec 20          	sub    rsp,0x20
 17da8bf:	48 89 fb             	mov    rbx,rdi
 17da8c2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da8c9:	00 00
 17da8cb:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
 17da8d0:	66 0f 7f 04 24       	movdqa XMMWORD PTR [rsp],xmm0
 17da8d5:	66 48 0f 3a 16 c0 01 	pextrq rax,xmm0,0x1
 17da8dc:	48 85 c0             	test   rax,rax
 17da8df:	74 05                	je     17da8e6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6707>
 17da8e1:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]
 17da8e6:	48 89 e6             	mov    rsi,rsp
 17da8e9:	48 89 df             	mov    rdi,rbx
 17da8ec:	e8 6d 66 39 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>
 17da8f1:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 17da8f6:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da8fd:	00 00
 17da8ff:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 17da904:	75 33                	jne    17da939 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x675a>
 17da906:	e8 a7 3b 2c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 17da90b:	48 89 d8             	mov    rax,rbx
 17da90e:	48 83 c4 20          	add    rsp,0x20
 17da912:	5b                   	pop    rbx
 17da913:	c3                   	ret
 17da914:	48 89 c3             	mov    rbx,rax
 17da917:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
 17da91c:	e8 91 3b 2c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
 17da921:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da928:	00 00
 17da92a:	48 3b 44 24 18       	cmp    rax,QWORD PTR [rsp+0x18]
 17da92f:	75 08                	jne    17da939 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x675a>
 17da931:	48 89 df             	mov    rdi,rbx
 17da934:	e8 97 53 29 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
 17da939:	e8 72 51 01 00       	call   17efab0 <__stack_chk_fail@plt>
 17da93e:	55                   	push   rbp
 17da93f:	41 57                	push   r15
 17da941:	41 56                	push   r14
 17da943:	41 55                	push   r13
 17da945:	41 54                	push   r12
 17da947:	53                   	push   rbx
 17da948:	48 81 ec 98 00 00 00 	sub    rsp,0x98
 17da94f:	49 89 fc             	mov    r12,rdi
 17da952:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 17da959:	00 00
 17da95b:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
 17da962:	00
 17da963:	48 89 d5             	mov    rbp,rdx
 17da966:	48 29 f5             	sub    rbp,rsi
 17da969:	48 89 e8             	mov    rax,rbp
 17da96c:	48 c1 f8 04          	sar    rax,0x4
 17da970:	48 85 c0             	test   rax,rax
 17da973:	0f 8e 9a 02 00 00    	jle    17dac13 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a34>
 17da979:	49 89 f7             	mov    r15,rsi
 17da97c:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]
 17da981:	4d 8d 6c 24 10       	lea    r13,[r12+0x10]
 17da986:	49 8b 74 24 10       	mov    rsi,QWORD PTR [r12+0x10]
 17da98b:	48 89 f1             	mov    rcx,rsi
 17da98e:	4c 29 f1             	sub    rcx,r14
 17da991:	48 c1 f9 04          	sar    rcx,0x4
 17da995:	48 39 c1             	cmp    rcx,rax
 17da998:	0f 8d 36 01 00 00    	jge    17daad4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x68f5>
 17da99e:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
 17da9a2:	4c 89 f2             	mov    rdx,r14
 17da9a5:	48 29 fa             	sub    rdx,rdi
 17da9a8:	48 c1 fa 04          	sar    rdx,0x4
 17da9ac:	48 01 c2             	add    rdx,rax
 17da9af:	e8 ea eb 2d ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>
 17da9b4:	4c 89 f2             	mov    rdx,r14
 17da9b7:	4c 89 e3             	mov    rbx,r12
 17da9ba:	49 2b 14 24          	sub    rdx,QWORD PTR [r12]
 17da9be:	48 c1 fa 04          	sar    rdx,0x4
 17da9c2:	4c 8d 64 24 48       	lea    r12,[rsp+0x48]
 17da9c7:	4c 89 e7             	mov    rdi,r12
 17da9ca:	48 89 c6             	mov    rsi,rax
 17da9cd:	4c 89 e9             	mov    rcx,r13
 17da9d0:	e8 3b d9 39 ff       	call   b78310 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc52b0>
 17da9d5:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
 17da9da:	48 01 c5             	add    rbp,rax
 17da9dd:	31 c9                	xor    ecx,ecx
 17da9df:	49 8b 14 0f          	mov    rdx,QWORD PTR [r15+rcx*1]
 17da9e3:	48 89 14 08          	mov    QWORD PTR [rax+rcx*1],rdx
 17da9e7:	49 8b 54 0f 08       	mov    rdx,QWORD PTR [r15+rcx*1+0x8]
 17da9ec:	48 89 54 08 08       	mov    QWORD PTR [rax+rcx*1+0x8],rdx
 17da9f1:	48 85 d2             	test   rdx,rdx
 17da9f4:	74 05                	je     17da9fb <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x681c>
 17da9f6:	f0 48 ff 42 10       	lock inc QWORD PTR [rdx+0x10]
 17da9fb:	48 8d 14 08          	lea    rdx,[rax+rcx*1]
 17da9ff:	48 83 c1 10          	add    rcx,0x10
 17daa03:	48 83 c2 10          	add    rdx,0x10
 17daa07:	48 39 ea             	cmp    rdx,rbp
 17daa0a:	75 d3                	jne    17da9df <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6800>
 17daa0c:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp
 17daa11:	48 8b 44 24 50       	mov    rax,QWORD PTR [rsp+0x50]
 17daa16:	49 89 dc             	mov    r12,rbx
 17daa19:	48 8b 13             	mov    rdx,QWORD PTR [rbx]
 17daa1c:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
 17daa21:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax
 17daa26:	0f 10 44 24 28       	movups xmm0,XMMWORD PTR [rsp+0x28]
 17daa2b:	0f 11 04 24          	movups XMMWORD PTR [rsp],xmm0
 17daa2f:	4c 89 ef             	mov    rdi,r13
 17daa32:	4c 89 f6             	mov    rsi,r14
 17daa35:	e8 f9 d9 39 ff       	call   b78433 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc53d3>
 17daa3a:	49 89 c7             	mov    r15,rax
 17daa3d:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]
 17daa41:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]
 17daa46:	48 89 29             	mov    QWORD PTR [rcx],rbp
 17daa49:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]
 17daa4e:	48 89 2a             	mov    QWORD PTR [rdx],rbp
 17daa51:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13
 17daa56:	48 89 54 24 78       	mov    QWORD PTR [rsp+0x78],rdx
 17daa5b:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx
 17daa62:	00
 17daa63:	4c 39 f0             	cmp    rax,r14
 17daa66:	74 28                	je     17daa90 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x68b1>
 17daa68:	0f 57 c0             	xorps  xmm0,xmm0
 17daa6b:	49 8b 0e             	mov    rcx,QWORD PTR [r14]
 17daa6e:	48 89 4d 00          	mov    QWORD PTR [rbp+0x0],rcx
 17daa72:	49 8b 4e 08          	mov    rcx,QWORD PTR [r14+0x8]
 17daa76:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx
 17daa7a:	41 0f 11 06          	movups XMMWORD PTR [r14],xmm0
 17daa7e:	48 83 c5 10          	add    rbp,0x10
 17daa82:	49 83 c6 10          	add    r14,0x10
 17daa86:	49 39 c6             	cmp    r14,rax
 17daa89:	75 e0                	jne    17daa6b <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x688c>
 17daa8b:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp
 17daa90:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]
 17daa95:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1
 17daa99:	e8 68 62 e1 ff       	call   15f0d06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43628a>
 17daa9e:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
 17daaa3:	4d 89 3c 24          	mov    QWORD PTR [r12],r15
 17daaa7:	49 89 6c 24 08       	mov    QWORD PTR [r12+0x8],rbp
 17daaac:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]
 17daab1:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0
 17daab5:	49 8b 44 24 10       	mov    rax,QWORD PTR [r12+0x10]
 17daaba:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]
 17daabe:	49 89 4c 24 10       	mov    QWORD PTR [r12+0x10],rcx
 17daac3:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax
 17daac7:	0f 13 07             	movlps QWORD PTR [rdi],xmm0
 17daaca:	e8 21 d9 39 ff       	call   b783f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc5390>
 17daacf:	e9 3f 01 00 00       	jmp    17dac13 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a34>
 17daad4:	4c 89 f3             	mov    rbx,r14
 17daad7:	4c 29 f3             	sub    rbx,r14
 17daada:	48 89 d9             	mov    rcx,rbx
 17daadd:	48 c1 f9 04          	sar    rcx,0x4
 17daae1:	48 39 c1             	cmp    rcx,rax
 17daae4:	7d 64                	jge    17dab4a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x696b>
 17daae6:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx
 17daaeb:	4c 01 fb             	add    rbx,r15
 17daaee:	48 8d 44 24 70       	lea    rax,[rsp+0x70]
 17daaf3:	4c 89 30             	mov    QWORD PTR [rax],r14
 17daaf6:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]
 17daafb:	4c 89 31             	mov    QWORD PTR [rcx],r14
 17daafe:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13
 17dab03:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
 17dab08:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax
 17dab0d:	48 39 d3             	cmp    rbx,rdx
 17dab10:	48 89 54 24 20       	mov    QWORD PTR [rsp+0x20],rdx
 17dab15:	74 3c                	je     17dab53 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6974>
 17dab17:	48 89 d8             	mov    rax,rbx
 17dab1a:	4d 89 f5             	mov    r13,r14
 17dab1d:	48 8b 08             	mov    rcx,QWORD PTR [rax]
 17dab20:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx
 17dab24:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]
 17dab28:	49 89 4d 08          	mov    QWORD PTR [r13+0x8],rcx
 17dab2c:	48 85 c9             	test   rcx,rcx
```
## Filtered layout/store instructions in `17da794`

| addr | instruction |
|---:|---|
| `0x17da7a5` | `17da7a5:	48 83 67 10 00       	and    QWORD PTR [rdi+0x10],0x0` |
| `0x17da7aa` | `17da7aa:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0x17da7ad` | `17da7ad:	48 89 77 18          	mov    QWORD PTR [rdi+0x18],rsi` |
| `0x17da7b1` | `17da7b1:	48 89 57 20          	mov    QWORD PTR [rdi+0x20],rdx` |
| `0x17da7b5` | `17da7b5:	48 89 4f 28          	mov    QWORD PTR [rdi+0x28],rcx` |
| `0x17da7bf` | `17da7bf:	e8 7c 50 01 00       	call   17ef840 <_ZnamSt11align_val_t@plt>` |
| `0x17da7c4` | `17da7c4:	49 89 47 30          	mov    QWORD PTR [r15+0x30],rax` |
| `0x17da7c8` | `17da7c8:	49 89 5f 38          	mov    QWORD PTR [r15+0x38],rbx` |
| `0x17da7d5` | `17da7d5:	41 ff 57 18          	call   QWORD PTR [r15+0x18]` |
| `0x17da7de` | `17da7de:	c3                   	ret` |
| `0x17da7e2` | `17da7e2:	e8 be f2 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x17da7ec` | `17da7ec:	e8 11 00 00 00       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>` |
| `0x17da7f5` | `17da7f5:	e9 82 4a e1 ff       	jmp    15ef27c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x434800>` |
| `0x17da7fd` | `17da7fd:	e8 a3 f2 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x17da806` | `17da806:	48 8b 7f 30          	mov    rdi,QWORD PTR [rdi+0x30]` |
| `0x17da80f` | `17da80f:	48 8b 43 20          	mov    rax,QWORD PTR [rbx+0x20]` |
| `0x17da818` | `17da818:	ff d0                	call   rax` |
| `0x17da81a` | `17da81a:	48 8b 7b 30          	mov    rdi,QWORD PTR [rbx+0x30]` |
| `0x17da81e` | `17da81e:	48 83 63 30 00       	and    QWORD PTR [rbx+0x30],0x0` |
| `0x17da827` | `17da827:	e9 04 50 01 00       	jmp    17ef830 <_ZdaPvSt11align_val_t@plt>` |
| `0x17da82d` | `17da82d:	c3                   	ret` |
| `0x17da840` | `17da840:	e8 bd ff ff ff       	call   17da802 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6623>` |
| `0x17da848` | `17da848:	e8 69 d8 ff ff       	call   17d80b6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3ed7>` |
| `0x17da850` | `17da850:	48 89 03             	mov    QWORD PTR [rbx],rax` |
| `0x17da857` | `17da857:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax` |
| `0x17da85f` | `17da85f:	48 89 43 10          	mov    QWORD PTR [rbx+0x10],rax` |
| `0x17da873` | `17da873:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax` |
| `0x17da880` | `17da880:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax` |
| `0x17da88d` | `17da88d:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax` |
| `0x17da89a` | `17da89a:	48 89 43 30          	mov    QWORD PTR [rbx+0x30],rax` |
| `0x17da8a2` | `17da8a2:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax` |
| `0x17da8b0` | `17da8b0:	c3                   	ret` |
| `0x17da8b4` | `17da8b4:	e8 ec f1 29 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>` |
| `0x17da8cb` | `17da8cb:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax` |
| `0x17da8e1` | `17da8e1:	f0 48 ff 40 10       	lock inc QWORD PTR [rax+0x10]` |
| `0x17da8ec` | `17da8ec:	e8 6d 66 39 ff       	call   b70f5e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xbdefe>` |
| `0x17da906` | `17da906:	e8 a7 3b 2c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0x17da913` | `17da913:	c3                   	ret` |
| `0x17da91c` | `17da91c:	e8 91 3b 2c ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>` |
| `0x17da934` | `17da934:	e8 97 53 29 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>` |
| `0x17da939` | `17da939:	e8 72 51 01 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x17da95b` | `17da95b:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax` |
| `0x17da981` | `17da981:	4d 8d 6c 24 10       	lea    r13,[r12+0x10]` |
| `0x17da9af` | `17da9af:	e8 ea eb 2d ff       	call   ab959e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x653e>` |
| `0x17da9c2` | `17da9c2:	4c 8d 64 24 48       	lea    r12,[rsp+0x48]` |
| `0x17da9d0` | `17da9d0:	e8 3b d9 39 ff       	call   b78310 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc52b0>` |
| `0x17da9e3` | `17da9e3:	48 89 14 08          	mov    QWORD PTR [rax+rcx*1],rdx` |
| `0x17da9ec` | `17da9ec:	48 89 54 08 08       	mov    QWORD PTR [rax+rcx*1+0x8],rdx` |
| `0x17da9fb` | `17da9fb:	48 8d 14 08          	lea    rdx,[rax+rcx*1]` |
| `0x17daa0c` | `17daa0c:	48 89 6c 24 58       	mov    QWORD PTR [rsp+0x58],rbp` |
| `0x17daa19` | `17daa19:	48 8b 13             	mov    rdx,QWORD PTR [rbx]` |
| `0x17daa1c` | `17daa1c:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax` |
| `0x17daa21` | `17daa21:	48 89 44 24 30       	mov    QWORD PTR [rsp+0x30],rax` |
| `0x17daa35` | `17daa35:	e8 f9 d9 39 ff       	call   b78433 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc53d3>` |
| `0x17daa3d` | `17daa3d:	48 8b 43 08          	mov    rax,QWORD PTR [rbx+0x8]` |
| `0x17daa41` | `17daa41:	48 8d 4c 24 40       	lea    rcx,[rsp+0x40]` |
| `0x17daa46` | `17daa46:	48 89 29             	mov    QWORD PTR [rcx],rbp` |
| `0x17daa49` | `17daa49:	48 8d 54 24 38       	lea    rdx,[rsp+0x38]` |
| `0x17daa4e` | `17daa4e:	48 89 2a             	mov    QWORD PTR [rdx],rbp` |
| `0x17daa51` | `17daa51:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13` |
| `0x17daa56` | `17daa56:	48 89 54 24 78       	mov    QWORD PTR [rsp+0x78],rdx` |
| `0x17daa5b` | `17daa5b:	48 89 8c 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rcx` |
| `0x17daa6e` | `17daa6e:	48 89 4d 00          	mov    QWORD PTR [rbp+0x0],rcx` |
| `0x17daa76` | `17daa76:	48 89 4d 08          	mov    QWORD PTR [rbp+0x8],rcx` |
| `0x17daa8b` | `17daa8b:	48 89 6c 24 40       	mov    QWORD PTR [rsp+0x40],rbp` |
| `0x17daa90` | `17daa90:	48 8d 7c 24 70       	lea    rdi,[rsp+0x70]` |
| `0x17daa95` | `17daa95:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1` |
| `0x17daa99` | `17daa99:	e8 68 62 e1 ff       	call   15f0d06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43628a>` |
| `0x17daaa3` | `17daaa3:	4d 89 3c 24          	mov    QWORD PTR [r12],r15` |
| `0x17daaa7` | `17daaa7:	49 89 6c 24 08       	mov    QWORD PTR [r12+0x8],rbp` |
| `0x17daaac` | `17daaac:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]` |
| `0x17daab1` | `17daab1:	0f 11 47 08          	movups XMMWORD PTR [rdi+0x8],xmm0` |
| `0x17daaba` | `17daaba:	48 8b 4f 18          	mov    rcx,QWORD PTR [rdi+0x18]` |
| `0x17daabe` | `17daabe:	49 89 4c 24 10       	mov    QWORD PTR [r12+0x10],rcx` |
| `0x17daac3` | `17daac3:	48 89 47 18          	mov    QWORD PTR [rdi+0x18],rax` |
| `0x17daac7` | `17daac7:	0f 13 07             	movlps QWORD PTR [rdi],xmm0` |
| `0x17daaca` | `17daaca:	e8 21 d9 39 ff       	call   b783f0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc5390>` |
| `0x17daacf` | `17daacf:	e9 3f 01 00 00       	jmp    17dac13 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a34>` |
| `0x17daae6` | `17daae6:	48 89 4c 24 18       	mov    QWORD PTR [rsp+0x18],rcx` |
| `0x17daaee` | `17daaee:	48 8d 44 24 70       	lea    rax,[rsp+0x70]` |
| `0x17daaf3` | `17daaf3:	4c 89 30             	mov    QWORD PTR [rax],r14` |
| `0x17daaf6` | `17daaf6:	48 8d 4c 24 28       	lea    rcx,[rsp+0x28]` |
| `0x17daafb` | `17daafb:	4c 89 31             	mov    QWORD PTR [rcx],r14` |
| `0x17daafe` | `17daafe:	4c 89 6c 24 48       	mov    QWORD PTR [rsp+0x48],r13` |
| `0x17dab03` | `17dab03:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx` |
| `0x17dab08` | `17dab08:	48 89 44 24 58       	mov    QWORD PTR [rsp+0x58],rax` |
| `0x17dab10` | `17dab10:	48 89 54 24 20       	mov    QWORD PTR [rsp+0x20],rdx` |
| `0x17dab1d` | `17dab1d:	48 8b 08             	mov    rcx,QWORD PTR [rax]` |
| `0x17dab20` | `17dab20:	49 89 4d 00          	mov    QWORD PTR [r13+0x0],rcx` |
| `0x17dab24` | `17dab24:	48 8b 48 08          	mov    rcx,QWORD PTR [rax+0x8]` |
| `0x17dab28` | `17dab28:	49 89 4d 08          	mov    QWORD PTR [r13+0x8],rcx` |
| `0x17dab31` | `17dab31:	f0 48 ff 41 10       	lock inc QWORD PTR [rcx+0x10]` |
| `0x17dab43` | `17dab43:	4c 89 6c 24 70       	mov    QWORD PTR [rsp+0x70],r13` |
| `0x17dab48` | `17dab48:	eb 0c                	jmp    17dab56 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6977>` |
| `0x17dab4a` | `17dab4a:	49 8d 1c 2f          	lea    rbx,[r15+rbp*1]` |
| `0x17dab51` | `17dab51:	eb 27                	jmp    17dab7a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x699b>` |
| `0x17dab56` | `17dab56:	48 8d 7c 24 48       	lea    rdi,[rsp+0x48]` |
| `0x17dab5b` | `17dab5b:	c6 47 18 01          	mov    BYTE PTR [rdi+0x18],0x1` |
| `0x17dab5f` | `17dab5f:	e8 a2 61 e1 ff       	call   15f0d06 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43628a>` |
| `0x17dab64` | `17dab64:	4d 89 6c 24 08       	mov    QWORD PTR [r12+0x8],r13` |
| `0x17dab7a` | `17dab7a:	49 8d 04 2e          	lea    rax,[r14+rbp*1]` |
| `0x17dab92` | `17dab92:	48 8b 37             	mov    rsi,QWORD PTR [rdi]` |
| `0x17dab95` | `17dab95:	48 89 31             	mov    QWORD PTR [rcx],rsi` |
| `0x17dab98` | `17dab98:	48 8b 77 08          	mov    rsi,QWORD PTR [rdi+0x8]` |
| `0x17dab9c` | `17dab9c:	48 89 71 08          	mov    QWORD PTR [rcx+0x8],rsi` |
| `0x17daba0` | `17daba0:	0f 11 07             	movups XMMWORD PTR [rdi],xmm0` |
| `0x17dabb0` | `17dabb0:	4c 89 64 24 18       	mov    QWORD PTR [rsp+0x18],r12` |
| `0x17dabb5` | `17dabb5:	49 89 4c 24 08       	mov    QWORD PTR [r12+0x8],rcx` |
| `0x17dabc6` | `17dabc6:	4d 8d 24 16          	lea    r12,[r14+rdx*1]` |
| `0x17dabdd` | `17dabdd:	e8 f4 d7 2f ff       	call   ad83d6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x25376>` |
| `0x17dac01` | `17dac01:	e8 04 ed 34 ff       	call   b2990a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x768aa>` |
| `0x17dac3a` | `17dac3a:	c3                   	ret` |
| `0x17dac3b` | `17dac3b:	e8 70 4e 01 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0x17dac40` | `17dac40:	e9 01 00 00 00       	jmp    17dac46 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a67>` |
| `0x17dac53` | `17dac53:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0x17dac5e` | `17dac5e:	e8 fd 44 01 00       	call   17ef160 <clock_gettime@plt>` |
| `0x17dac69` | `17dac69:	eb 0d                	jmp    17dac78 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6a99>` |

## Visible call-site windows mentioning `17da794`

| addr | instruction |
|---:|---|
| `0xa73ec9` | `a73ec9:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa73ecc` | `a73ecc:	48 8d 35 50 83 8f ff 	lea    rsi,[rip+0xffffffffff8f8350]        # 36c223 <_ZTSSt12bad_any_cast@@Base-0x23fa5>` |
| `0xa73ed3` | `a73ed3:	48 89 df             	mov    rdi,rbx` |
| `0xa73ed6` | `a73ed6:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xa73ed9` | `a73ed9:	49 89 c6             	mov    r14,rax` |
| `0xa73edc` | `a73edc:	48 89 9c 24 10 02 00 	mov    QWORD PTR [rsp+0x210],rbx` |
| `0xa73ee3` | `a73ee3:	00` |
| `0xa73ee4` | `a73ee4:	48 89 84 24 18 02 00 	mov    QWORD PTR [rsp+0x218],rax` |
| `0xa73eeb` | `a73eeb:	00` |
| `0xa73eec` | `a73eec:	48 89 df             	mov    rdi,rbx` |
| `0xa73eef` | `a73eef:	e8 f4 0c d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa73ef4` | `a73ef4:	4d 85 f6             	test   r14,r14` |
| `0xa73ef7` | `a73ef7:	0f 84 77 01 00 00    	je     a74074 <JNI_OnLoad@@Base+0x7fc>` |
| `0xa73efd` | `a73efd:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa73f00` | `a73f00:	48 89 df             	mov    rdi,rbx` |
| `0xa73f03` | `a73f03:	4c 89 f6             	mov    rsi,r14` |
| `0xa73f06` | `a73f06:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]` |
| `0xa73f0c` | `a73f0c:	48 89 05 f5 f4 f6 00 	mov    QWORD PTR [rip+0xf6f4f5],rax        # 19e3408 <__cxa_new_handler@@Base+0x2c98>` |
| `0xa73f13` | `a73f13:	48 89 df             	mov    rdi,rbx` |
| `0xa73f16` | `a73f16:	e8 cd 0c d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa73f1b` | `a73f1b:	48 8b 35 e6 f4 f6 00 	mov    rsi,QWORD PTR [rip+0xf6f4e6]        # 19e3408 <__cxa_new_handler@@Base+0x2c98>` |
| `0xa73f22` | `a73f22:	48 85 f6             	test   rsi,rsi` |
| `0xa73f25` | `a73f25:	0f 84 49 01 00 00    	je     a74074 <JNI_OnLoad@@Base+0x7fc>` |
| `0xa73f2b` | `a73f2b:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa73f2e` | `a73f2e:	48 8d 15 ca b4 90 ff 	lea    rdx,[rip+0xffffffffff90b4ca]        # 37f3ff <_ZTSSt12bad_any_cast@@Base-0x10dc9>` |
| `0xa73f35` | `a73f35:	48 8d 0d 0f 51 8f ff 	lea    rcx,[rip+0xffffffffff8f510f]        # 36904b <_ZTSSt12bad_any_cast@@Base-0x2717d>` |
| `0xa73f3c` | `a73f3c:	48 89 df             	mov    rdi,rbx` |
| `0xa73f3f` | `a73f3f:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]` |
| `0xa73f45` | `a73f45:	48 89 05 c4 f4 f6 00 	mov    QWORD PTR [rip+0xf6f4c4],rax        # 19e3410 <__cxa_new_handler@@Base+0x2ca0>` |
| `0xa73f4c` | `a73f4c:	48 8b 35 b5 f4 f6 00 	mov    rsi,QWORD PTR [rip+0xf6f4b5]        # 19e3408 <__cxa_new_handler@@Base+0x2c98>` |
| `0xa73f53` | `a73f53:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa73f56` | `a73f56:	48 8d 15 88 2a 8b ff 	lea    rdx,[rip+0xffffffffff8b2a88]        # 3269e5 <_ZTSSt12bad_any_cast@@Base-0x697e3>` |
| `0xa73f5d` | `a73f5d:	48 8d 0d 10 84 90 ff 	lea    rcx,[rip+0xffffffffff908410]        # 37c374 <_ZTSSt12bad_any_cast@@Base-0x13e54>` |
| `0xa73f64` | `a73f64:	48 89 df             	mov    rdi,rbx` |
| `0xa73f67` | `a73f67:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]` |
| `0xa73f6d` | `a73f6d:	48 89 05 a4 f4 f6 00 	mov    QWORD PTR [rip+0xf6f4a4],rax        # 19e3418 <__cxa_new_handler@@Base+0x2ca8>` |
| `0xa73f74` | `a73f74:	48 89 df             	mov    rdi,rbx` |
| `0xa73f77` | `a73f77:	e8 6c 0c d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa73f7c` | `a73f7c:	48 83 3d 8c f4 f6 00 	cmp    QWORD PTR [rip+0xf6f48c],0x0        # 19e3410 <__cxa_new_handler@@Base+0x2ca0>` |
| `0xa73f83` | `a73f83:	00` |
| `0xa73f84` | `a73f84:	0f 84 ea 00 00 00    	je     a74074 <JNI_OnLoad@@Base+0x7fc>` |
| `0xa73f8a` | `a73f8a:	48 83 3d 86 f4 f6 00 	cmp    QWORD PTR [rip+0xf6f486],0x0        # 19e3418 <__cxa_new_handler@@Base+0x2ca8>` |
| `0xa73f91` | `a73f91:	00` |
| `0xa73f92` | `a73f92:	0f 84 dc 00 00 00    	je     a74074 <JNI_OnLoad@@Base+0x7fc>` |
| `0xa73f98` | `a73f98:	4c 8d 35 f2 90 02 00 	lea    r14,[rip+0x290f2]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xa73f9f` | `a73f9f:	48 8d 0d 68 be 02 00 	lea    rcx,[rip+0x2be68]        # a9fe0e <JNI_OnUnload@@Base+0x276db>` |
| `0xa73fa6` | `a73fa6:	4c 8d a4 24 d0 01 00 	lea    r12,[rsp+0x1d0]` |
| `0xa73fad` | `a73fad:	00` |
| `0xa73fae` | `a73fae:	4c 8d 44 24 78       	lea    r8,[rsp+0x78]` |
| `0xa73fb3` | `a73fb3:	6a 01                	push   0x1` |
| `0xa73fb5` | `a73fb5:	41 5f                	pop    r15` |
| `0xa73fb7` | `a73fb7:	4c 89 e7             	mov    rdi,r12` |
| `0xa73fba` | `a73fba:	4c 89 f6             	mov    rsi,r14` |
| `0xa73fbd` | `a73fbd:	31 d2                	xor    edx,edx` |
| `0xa73fbf` | `a73fbf:	4d 89 f9             	mov    r9,r15` |
| `0xa73fc2` | `a73fc2:	e8 cd 67 d6 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa73fc7` | `a73fc7:	4c 8d ac 24 80 01 00 	lea    r13,[rsp+0x180]` |
| `0xa73fce` | `a73fce:	00` |
| `0xa73fcf` | `a73fcf:	4c 89 ef             	mov    rdi,r13` |
| `0xa73fd2` | `a73fd2:	4c 89 e6             	mov    rsi,r12` |
| `0xa73fd5` | `a73fd5:	e8 60 67 d6 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa73fda` | `a73fda:	48 8d 35 ff e2 f7 00 	lea    rsi,[rip+0xf7e2ff]        # 19f22e0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x39f>` |
| `0xa73fe1` | `a73fe1:	48 8d ac 24 60 01 00 	lea    rbp,[rsp+0x160]` |
| `0xa73fe8` | `a73fe8:	00` |
| `0xa73fe9` | `a73fe9:	48 89 ef             	mov    rdi,rbp` |
| `0xa73fec` | `a73fec:	4c 89 ea             	mov    rdx,r13` |
| `0xa73fef` | `a73fef:	e8 d6 5f d6 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa73ff4` | `a73ff4:	4c 89 ef             	mov    rdi,r13` |
| `0xa73ff7` | `a73ff7:	e8 ec 67 d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa73ffc` | `a73ffc:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]` |
| `0xa74000` | `a74000:	e8 81 a4 02 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa74005` | `a74005:	4c 89 e7             	mov    rdi,r12` |
| `0xa74008` | `a74008:	e8 db 67 d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa7400d` | `a7400d:	48 8d 0d 80 bf 02 00 	lea    rcx,[rip+0x2bf80]        # a9ff94 <JNI_OnUnload@@Base+0x27861>` |
| `0xa74014` | `a74014:	4c 8d a4 24 d0 01 00 	lea    r12,[rsp+0x1d0]` |
| `0xa7401b` | `a7401b:	00` |
| `0xa7401c` | `a7401c:	4c 8d 44 24 60       	lea    r8,[rsp+0x60]` |
| `0xa74021` | `a74021:	4c 89 e7             	mov    rdi,r12` |
| `0xa74024` | `a74024:	4c 89 f6             	mov    rsi,r14` |
| `0xa74027` | `a74027:	31 d2                	xor    edx,edx` |
| `0xa74029` | `a74029:	4d 89 f9             	mov    r9,r15` |
| `0xa7402c` | `a7402c:	e8 63 67 d6 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa74031` | `a74031:	4c 8d b4 24 80 01 00 	lea    r14,[rsp+0x180]` |
| `0xa74038` | `a74038:	00` |
| `0xa74039` | `a74039:	4c 89 f7             	mov    rdi,r14` |
| `0xa7403c` | `a7403c:	4c 89 e6             	mov    rsi,r12` |
| `0xa7403f` | `a7403f:	e8 f6 66 d6 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa74044` | `a74044:	48 8d 35 ed e2 f7 00 	lea    rsi,[rip+0xf7e2ed]        # 19f2338 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x3f7>` |
| `0xa7404b` | `a7404b:	4c 8d 7c 24 78       	lea    r15,[rsp+0x78]` |
| `0xa74050` | `a74050:	4c 89 ff             	mov    rdi,r15` |
| `0xa74053` | `a74053:	4c 89 f2             	mov    rdx,r14` |
| `0xa74056` | `a74056:	e8 6f 5f d6 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa7405b` | `a7405b:	4c 89 f7             	mov    rdi,r14` |
| `0xa7405e` | `a7405e:	e8 85 67 d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa74063` | `a74063:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xa74067` | `a74067:	e8 1a a4 02 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa7406c` | `a7406c:	4c 89 e7             	mov    rdi,r12` |
| `0xa7406f` | `a7406f:	e8 74 67 d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa74074` | `a74074:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]` |
| `0xa7407b` | `a7407b:	00` |
| `0xa7407c` | `a7407c:	e8 45 1c d6 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa74081` | `a74081:	4c 8b 35 78 a3 f8 00 	mov    r14,QWORD PTR [rip+0xf8a378]        # 19fe400 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0xc4bf>` |
| `0xa74088` | `a74088:	48 8d 35 b7 ea 90 ff 	lea    rsi,[rip+0xffffffffff90eab7]        # 382b46 <_ZTSSt12bad_any_cast@@Base-0xd682>` |
| `0xa7408f` | `a7408f:	4c 8d bc 24 80 01 00 	lea    r15,[rsp+0x180]` |
| `0xa74096` | `a74096:	00` |
| `0xa74097` | `a74097:	4c 89 ff             	mov    rdi,r15` |
| `0xa7409a` | `a7409a:	e8 df 59 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa7409f` | `a7409f:	4c 8d a4 24 d0 01 00 	lea    r12,[rsp+0x1d0]` |
| `0xa740a6` | `a740a6:	00` |
| `0xa740a7` | `a740a7:	4c 89 e7             	mov    rdi,r12` |
| `0xa740aa` | `a740aa:	48 89 de             	mov    rsi,rbx` |
| `0xa740ad` | `a740ad:	4c 89 f2             	mov    rdx,r14` |
| `0xa740b0` | `a740b0:	4c 89 f9             	mov    rcx,r15` |
| `0xa740b3` | `a740b3:	e8 c7 04 d6 00       	call   17d457f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3a0>` |
| `0xa740b8` | `a740b8:	4c 89 ff             	mov    rdi,r15` |
| `0xa740bb` | `a740bb:	e8 d0 9d d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa740c0` | `a740c0:	48 89 df             	mov    rdi,rbx` |
| `0xa740c3` | `a740c3:	e8 20 0b d6 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa740c8` | `a740c8:	4d 8b 74 24 08       	mov    r14,QWORD PTR [r12+0x8]` |
| `0xa76bd1` | `a76bd1:	e8 f0 f0 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa76bd6` | `a76bd6:	48 8d bc 24 18 01 00 	lea    rdi,[rsp+0x118]` |
| `0xa76bdd` | `a76bdd:	00` |
| `0xa76bde` | `a76bde:	e8 e3 f0 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa76be3` | `a76be3:	48 8d bc 24 28 01 00 	lea    rdi,[rsp+0x128]` |
| `0xa76bea` | `a76bea:	00` |
| `0xa76beb` | `a76beb:	e8 d6 f0 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa76bf0` | `a76bf0:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]` |
| `0xa76bf7` | `a76bf7:	00` |
| `0xa76bf8` | `a76bf8:	e8 93 72 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa76bfd` | `a76bfd:	48 8d bc 24 10 02 00 	lea    rdi,[rsp+0x210]` |
| `0xa76c04` | `a76c04:	00` |
| `0xa76c05` | `a76c05:	e8 86 72 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa76c0a` | `a76c0a:	48 8d bc 24 38 01 00 	lea    rdi,[rsp+0x138]` |
| `0xa76c11` | `a76c11:	00` |
| `0xa76c12` | `a76c12:	e8 af f0 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa76c17` | `a76c17:	48 8d bc 24 48 01 00 	lea    rdi,[rsp+0x148]` |
| `0xa76c1e` | `a76c1e:	00` |
| `0xa76c1f` | `a76c1f:	e8 a2 f0 d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa76c24` | `a76c24:	48 8d 35 f6 87 8f ff 	lea    rsi,[rip+0xffffffffff8f87f6]        # 36f421 <_ZTSSt12bad_any_cast@@Base-0x20da7>` |
| `0xa76c2b` | `a76c2b:	4c 8d bc 24 80 01 00 	lea    r15,[rsp+0x180]` |
| `0xa76c32` | `a76c32:	00` |
| `0xa76c33` | `a76c33:	4c 89 ff             	mov    rdi,r15` |
| `0xa76c36` | `a76c36:	e8 43 2e 00 00       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xa76c3b` | `a76c3b:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa76c42` | `a76c42:	00` |
| `0xa76c43` | `a76c43:	4c 89 e7             	mov    rdi,r12` |
| `0xa76c46` | `a76c46:	48 89 de             	mov    rsi,rbx` |
| `0xa76c49` | `a76c49:	4c 89 fa             	mov    rdx,r15` |
| `0xa76c4c` | `a76c4c:	e8 22 d8 d5 00       	call   17d4473 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x294>` |
| `0xa76c51` | `a76c51:	4c 89 ff             	mov    rdi,r15` |
| `0xa76c54` | `a76c54:	e8 37 72 d7 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xa76c59` | `a76c59:	48 89 df             	mov    rdi,rbx` |
| `0xa76c5c` | `a76c5c:	e8 87 df d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa76c61` | `a76c61:	49 8b 74 24 08       	mov    rsi,QWORD PTR [r12+0x8]` |
| `0xa76c66` | `a76c66:	48 8d 3d b3 c7 f6 00 	lea    rdi,[rip+0xf6c7b3]        # 19e3420 <__cxa_new_handler@@Base+0x2cb0>` |
| `0xa76c6d` | `a76c6d:	e8 b0 e6 d5 00       	call   17d5322 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1143>` |
| `0xa76c72` | `a76c72:	48 8b 35 a7 c7 f6 00 	mov    rsi,QWORD PTR [rip+0xf6c7a7]        # 19e3420 <__cxa_new_handler@@Base+0x2cb0>` |
| `0xa76c79` | `a76c79:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xa76c7c` | `a76c7c:	48 8d 15 85 27 91 ff 	lea    rdx,[rip+0xffffffffff912785]        # 389408 <_ZTSSt12bad_any_cast@@Base-0x6dc0>` |
| `0xa76c83` | `a76c83:	48 8d 0d 3d e6 8e ff 	lea    rcx,[rip+0xffffffffff8ee63d]        # 3652c7 <_ZTSSt12bad_any_cast@@Base-0x2af01>` |
| `0xa76c8a` | `a76c8a:	48 89 df             	mov    rdi,rbx` |
| `0xa76c8d` | `a76c8d:	ff 90 88 03 00 00    	call   QWORD PTR [rax+0x388]` |
| `0xa76c93` | `a76c93:	48 89 05 9e c7 f6 00 	mov    QWORD PTR [rip+0xf6c79e],rax        # 19e3438 <__cxa_new_handler@@Base+0x2cc8>` |
| `0xa76c9a` | `a76c9a:	48 89 df             	mov    rdi,rbx` |
| `0xa76c9d` | `a76c9d:	e8 46 df d5 00       	call   17d4be8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0xa09>` |
| `0xa76ca2` | `a76ca2:	48 8d 35 e8 63 02 00 	lea    rsi,[rip+0x263e8]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xa76ca9` | `a76ca9:	48 8d 0d 3a 94 02 00 	lea    rcx,[rip+0x2943a]        # aa00ea <JNI_OnUnload@@Base+0x279b7>` |
| `0xa76cb0` | `a76cb0:	4c 8d bc 24 d0 01 00 	lea    r15,[rsp+0x1d0]` |
| `0xa76cb7` | `a76cb7:	00` |
| `0xa76cb8` | `a76cb8:	4c 8d 44 24 78       	lea    r8,[rsp+0x78]` |
| `0xa76cbd` | `a76cbd:	6a 01                	push   0x1` |
| `0xa76cbf` | `a76cbf:	41 59                	pop    r9` |
| `0xa76cc1` | `a76cc1:	4c 89 ff             	mov    rdi,r15` |
| `0xa76cc4` | `a76cc4:	31 d2                	xor    edx,edx` |
| `0xa76cc6` | `a76cc6:	e8 c9 3a d6 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa76ccb` | `a76ccb:	4c 8d a4 24 80 01 00 	lea    r12,[rsp+0x180]` |
| `0xa76cd2` | `a76cd2:	00` |
| `0xa76cd3` | `a76cd3:	4c 89 e7             	mov    rdi,r12` |
| `0xa76cd6` | `a76cd6:	4c 89 fe             	mov    rsi,r15` |
| `0xa76cd9` | `a76cd9:	e8 5c 3a d6 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa76cde` | `a76cde:	48 8d 35 2b 7c f7 00 	lea    rsi,[rip+0xf77c2b]        # 19ee910 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0x40>` |
| `0xa76ce5` | `a76ce5:	4c 8d ac 24 10 02 00 	lea    r13,[rsp+0x210]` |
| `0xa76cec` | `a76cec:	00` |
| `0xa76ced` | `a76ced:	4c 89 ef             	mov    rdi,r13` |
| `0xa76cf0` | `a76cf0:	4c 89 e2             	mov    rdx,r12` |
| `0xa76cf3` | `a76cf3:	e8 d2 32 d6 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa76cf8` | `a76cf8:	4c 89 e7             	mov    rdi,r12` |
| `0xa76cfb` | `a76cfb:	e8 e8 3a d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa76d00` | `a76d00:	48 8d 3d 21 c7 f6 00 	lea    rdi,[rip+0xf6c721]        # 19e3428 <__cxa_new_handler@@Base+0x2cb8>` |
| `0xa76d07` | `a76d07:	4c 89 ee             	mov    rsi,r13` |
| `0xa76d0a` | `a76d0a:	e8 9f 2d d6 00       	call   17d9aae <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x58cf>` |
| `0xa76d0f` | `a76d0f:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa76d13` | `a76d13:	e8 6e 77 02 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa76d18` | `a76d18:	4c 89 ff             	mov    rdi,r15` |
| `0xa76d1b` | `a76d1b:	e8 c8 3a d6 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa76d20` | `a76d20:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]` |
| `0xa76d27` | `a76d27:	00` |
| `0xa76d28` | `a76d28:	e8 99 ef d5 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xa76d2d` | `a76d2d:	6a 08                	push   0x8` |
| `0xa76d2f` | `a76d2f:	5f                   	pop    rdi` |
| `0xa76d30` | `a76d30:	e8 cb 71 d7 00       	call   17edf00 <_Znwm@plt>` |
| `0xa76d35` | `a76d35:	48 8d 0d 84 04 e0 00 	lea    rcx,[rip+0xe00484]        # 18771c0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x338a8>` |
| `0xa76d3c` | `a76d3c:	48 89 08             	mov    QWORD PTR [rax],rcx` |
| `0xa76d3f` | `a76d3f:	48 83 3d a9 87 f7 00 	cmp    QWORD PTR [rip+0xf787a9],0x0        # 19ef4f0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc20>` |
| `0xa76d46` | `a76d46:	00` |
| `0xa76d47` | `a76d47:	0f 85 d1 14 00 00    	jne    a7821e <JNI_OnLoad@@Base+0x49a6>` |
| `0xa76d4d` | `a76d4d:	48 89 05 9c 87 f7 00 	mov    QWORD PTR [rip+0xf7879c],rax        # 19ef4f0 <_ZN5boost6detail12core_typeid_IvE3ti_E@@Base+0xc20>` |
| `0xa76d54` | `a76d54:	48 8d 35 1c 34 8e ff 	lea    rsi,[rip+0xffffffffff8e341c]        # 35a177 <_ZTSSt12bad_any_cast@@Base-0x36051>` |
| `0xa76d5b` | `a76d5b:	48 8d 15 fe 09 e0 00 	lea    rdx,[rip+0xe009fe]        # 1877760 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x33e48>` |
| `0xa76d62` | `a76d62:	48 8d 0d 3f 0a e0 00 	lea    rcx,[rip+0xe00a3f]        # 18777a8 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x33e90>` |
| `0xa76d69` | `a76d69:	48 89 df             	mov    rdi,rbx` |
| `0xa76d6c` | `a76d6c:	e8 1e f1 d5 00       	call   17d5e8f <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1cb0>` |
| `0xa9b48e` | `a9b48e:	0f 29 54 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm2` |
| `0xa9b493` | `a9b493:	0f 29 5c 24 60       	movaps XMMWORD PTR [rsp+0x60],xmm3` |
| `0xa9b498` | `a9b498:	0f 29 64 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm4` |
| `0xa9b49d` | `a9b49d:	0f 29 ac 24 80 00 00 	movaps XMMWORD PTR [rsp+0x80],xmm5` |
| `0xa9b4a4` | `a9b4a4:	00` |
| `0xa9b4a5` | `a9b4a5:	0f 29 b4 24 90 00 00 	movaps XMMWORD PTR [rsp+0x90],xmm6` |
| `0xa9b4ac` | `a9b4ac:	00` |
| `0xa9b4ad` | `a9b4ad:	0f 29 bc 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm7` |
| `0xa9b4b4` | `a9b4b4:	00` |
| `0xa9b4b5` | `a9b4b5:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa9b4bc` | `a9b4bc:	00 00` |
| `0xa9b4be` | `a9b4be:	48 89 84 24 d0 00 00 	mov    QWORD PTR [rsp+0xd0],rax` |
| `0xa9b4c5` | `a9b4c5:	00` |
| `0xa9b4c6` | `a9b4c6:	48 8d 8c 24 b0 00 00 	lea    rcx,[rsp+0xb0]` |
| `0xa9b4cd` | `a9b4cd:	00` |
| `0xa9b4ce` | `a9b4ce:	4c 89 51 10          	mov    QWORD PTR [rcx+0x10],r10` |
| `0xa9b4d2` | `a9b4d2:	48 8d 84 24 e0 00 00 	lea    rax,[rsp+0xe0]` |
| `0xa9b4d9` | `a9b4d9:	00` |
| `0xa9b4da` | `a9b4da:	48 89 41 08          	mov    QWORD PTR [rcx+0x8],rax` |
| `0xa9b4de` | `a9b4de:	48 b8 18 00 00 00 30 	movabs rax,0x3000000018` |
| `0xa9b4e5` | `a9b4e5:	00 00 00` |
| `0xa9b4e8` | `a9b4e8:	48 89 01             	mov    QWORD PTR [rcx],rax` |
| `0xa9b4eb` | `a9b4eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]` |
| `0xa9b4ee` | `a9b4ee:	ff 90 b0 03 00 00    	call   QWORD PTR [rax+0x3b0]` |
| `0xa9b4f4` | `a9b4f4:	64 48 8b 0c 25 28 00 	mov    rcx,QWORD PTR fs:0x28` |
| `0xa9b4fb` | `a9b4fb:	00 00` |
| `0xa9b4fd` | `a9b4fd:	48 3b 8c 24 d0 00 00 	cmp    rcx,QWORD PTR [rsp+0xd0]` |
| `0xa9b504` | `a9b504:	00` |
| `0xa9b505` | `a9b505:	75 08                	jne    a9b50f <JNI_OnUnload@@Base+0x22ddc>` |
| `0xa9b507` | `a9b507:	48 81 c4 d8 00 00 00 	add    rsp,0xd8` |
| `0xa9b50e` | `a9b50e:	c3                   	ret` |
| `0xa9b50f` | `a9b50f:	e8 9c 45 d5 00       	call   17efab0 <__stack_chk_fail@plt>` |
| `0xa9b514` | `a9b514:	55                   	push   rbp` |
| `0xa9b515` | `a9b515:	41 57                	push   r15` |
| `0xa9b517` | `a9b517:	41 56                	push   r14` |
| `0xa9b519` | `a9b519:	41 55                	push   r13` |
| `0xa9b51b` | `a9b51b:	41 54                	push   r12` |
| `0xa9b51d` | `a9b51d:	53                   	push   rbx` |
| `0xa9b51e` | `a9b51e:	48 81 ec a8 01 00 00 	sub    rsp,0x1a8` |
| `0xa9b525` | `a9b525:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa9b52c` | `a9b52c:	00 00` |
| `0xa9b52e` | `a9b52e:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax` |
| `0xa9b535` | `a9b535:	00` |
| `0xa9b536` | `a9b536:	48 8d 1d 54 1b 00 00 	lea    rbx,[rip+0x1b54]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xa9b53d` | `a9b53d:	48 8d 0d 52 1b 00 00 	lea    rcx,[rip+0x1b52]        # a9d096 <JNI_OnUnload@@Base+0x24963>` |
| `0xa9b544` | `a9b544:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9b54b` | `a9b54b:	00` |
| `0xa9b54c` | `a9b54c:	4c 8d 84 24 30 01 00 	lea    r8,[rsp+0x130]` |
| `0xa9b553` | `a9b553:	00` |
| `0xa9b554` | `a9b554:	6a 01                	push   0x1` |
| `0xa9b556` | `a9b556:	41 5e                	pop    r14` |
| `0xa9b558` | `a9b558:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b55b` | `a9b55b:	48 89 de             	mov    rsi,rbx` |
| `0xa9b55e` | `a9b55e:	31 d2                	xor    edx,edx` |
| `0xa9b560` | `a9b560:	4d 89 f1             	mov    r9,r14` |
| `0xa9b563` | `a9b563:	e8 2c f2 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9b568` | `a9b568:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9b56f` | `a9b56f:	00` |
| `0xa9b570` | `a9b570:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b573` | `a9b573:	4c 89 fe             	mov    rsi,r15` |
| `0xa9b576` | `a9b576:	e8 bf f1 d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9b57b` | `a9b57b:	48 8d 35 ae 96 f5 00 	lea    rsi,[rip+0xf596ae]        # 19f4c30 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2cef>` |
| `0xa9b582` | `a9b582:	4c 8d ac 24 f0 00 00 	lea    r13,[rsp+0xf0]` |
| `0xa9b589` | `a9b589:	00` |
| `0xa9b58a` | `a9b58a:	4c 89 ef             	mov    rdi,r13` |
| `0xa9b58d` | `a9b58d:	4c 89 e2             	mov    rdx,r12` |
| `0xa9b590` | `a9b590:	e8 35 ea d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9b595` | `a9b595:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b598` | `a9b598:	e8 4b f2 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b59d` | `a9b59d:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9b5a1` | `a9b5a1:	e8 e0 2e 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b5a6` | `a9b5a6:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b5a9` | `a9b5a9:	e8 3a f2 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b5ae` | `a9b5ae:	48 8d 0d 11 1c 00 00 	lea    rcx,[rip+0x1c11]        # a9d1c6 <JNI_OnUnload@@Base+0x24a93>` |
| `0xa9b5b5` | `a9b5b5:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]` |
| `0xa9b5bc` | `a9b5bc:	00` |
| `0xa9b5bd` | `a9b5bd:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]` |
| `0xa9b5c4` | `a9b5c4:	00` |
| `0xa9b5c5` | `a9b5c5:	48 89 de             	mov    rsi,rbx` |
| `0xa9b5c8` | `a9b5c8:	31 d2                	xor    edx,edx` |
| `0xa9b5ca` | `a9b5ca:	4d 89 f1             	mov    r9,r14` |
| `0xa9b5cd` | `a9b5cd:	e8 c2 f1 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9b5d2` | `a9b5d2:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]` |
| `0xa9b5d9` | `a9b5d9:	00` |
| `0xa9b5da` | `a9b5da:	e8 17 e4 d3 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0xa9b5df` | `a9b5df:	48 8d 3d c2 95 f5 00 	lea    rdi,[rip+0xf595c2]        # 19f4ba8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2c67>` |
| `0xa9b5e6` | `a9b5e6:	e8 05 2b d5 00       	call   17ee0f0 <_ZNSt6__ndk15mutex4lockEv@plt>` |
| `0xa9b5eb` | `a9b5eb:	48 8d 3d 96 96 f5 00 	lea    rdi,[rip+0xf59696]        # 19f4c88 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2d47>` |
| `0xa9b5f2` | `a9b5f2:	e8 47 e9 d3 00       	call   17d9f3e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5d5f>` |
| `0xa9b5f7` | `a9b5f7:	89 c3                	mov    ebx,eax` |
| `0xa9b5f9` | `a9b5f9:	4c 8d b4 24 60 01 00 	lea    r14,[rsp+0x160]` |
| `0xa9b600` | `a9b600:	00` |
| `0xa9b601` | `a9b601:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]` |
| `0xa9b608` | `a9b608:	00` |
| `0xa9b609` | `a9b609:	4c 89 f7             	mov    rdi,r14` |
| `0xa9b60c` | `a9b60c:	e8 29 f1 d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9b611` | `a9b611:	48 8d 35 70 96 f5 00 	lea    rsi,[rip+0xf59670]        # 19f4c88 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2d47>` |
| `0xa9b618` | `a9b618:	4c 8d bc 24 30 01 00 	lea    r15,[rsp+0x130]` |
| `0xa9b61f` | `a9b61f:	00` |
| `0xa9b620` | `a9b620:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b623` | `a9b623:	4c 89 f2             	mov    rdx,r14` |
| `0xa9b626` | `a9b626:	e8 9f e9 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9b62b` | `a9b62b:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]` |
| `0xa9b632` | `a9b632:	00` |
| `0xa9b633` | `a9b633:	4c 89 fe             	mov    rsi,r15` |
| `0xa9b636` | `a9b636:	e8 73 e4 d3 00       	call   17d9aae <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x58cf>` |
| `0xa9b63b` | `a9b63b:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]` |
| `0xa9b63f` | `a9b63f:	e8 42 2e 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b644` | `a9b644:	4c 89 f7             	mov    rdi,r14` |
| `0xa9b647` | `a9b647:	e8 9c f1 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b64c` | `a9b64c:	48 8d 3d 55 95 f5 00 	lea    rdi,[rip+0xf59555]        # 19f4ba8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2c67>` |
| `0xa9b653` | `a9b653:	e8 a8 2a d5 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>` |
| `0xa9b658` | `a9b658:	84 db                	test   bl,bl` |
| `0xa9b65a` | `a9b65a:	0f 84 34 02 00 00    	je     a9b894 <JNI_OnUnload@@Base+0x23161>` |
| `0xa9b660` | `a9b660:	66 0f ef c0          	pxor   xmm0,xmm0` |
| `0xa9b664` | `a9b664:	66 0f 7f 84 24 50 01 	movdqa XMMWORD PTR [rsp+0x150],xmm0` |
| `0xa9b66b` | `a9b66b:	00 00` |
| `0xa9b66d` | `a9b66d:	66 0f 7f 84 24 40 01 	movdqa XMMWORD PTR [rsp+0x140],xmm0` |
| `0xa9b674` | `a9b674:	00 00` |
| `0xa9b807` | `a9b807:	00` |
| `0xa9b808` | `a9b808:	e8 05 4b 43 00       	call   ed0312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x97728>` |
| `0xa9b80d` | `a9b80d:	48 89 c3             	mov    rbx,rax` |
| `0xa9b810` | `a9b810:	49 89 d6             	mov    r14,rdx` |
| `0xa9b813` | `a9b813:	4c 39 6c 24 08       	cmp    QWORD PTR [rsp+0x8],r13` |
| `0xa9b818` | `a9b818:	74 27                	je     a9b841 <JNI_OnUnload@@Base+0x2310e>` |
| `0xa9b81a` | `a9b81a:	66 0f 6f 4c 24 10    	movdqa xmm1,XMMWORD PTR [rsp+0x10]` |
| `0xa9b820` | `a9b820:	66 0f 70 c1 ee       	pshufd xmm0,xmm1,0xee` |
| `0xa9b825` | `a9b825:	66 0f d4 c1          	paddq  xmm0,xmm1` |
| `0xa9b829` | `a9b829:	66 48 0f 7e c0       	movq   rax,xmm0` |
| `0xa9b82e` | `a9b82e:	44 0f b6 e0          	movzx  r12d,al` |
| `0xa9b832` | `a9b832:	48 c1 e8 08          	shr    rax,0x8` |
| `0xa9b836` | `a9b836:	41 c1 e4 04          	shl    r12d,0x4` |
| `0xa9b83a` | `a9b83a:	4d 03 64 c5 00       	add    r12,QWORD PTR [r13+rax*8+0x0]` |
| `0xa9b83f` | `a9b83f:	eb 03                	jmp    a9b844 <JNI_OnUnload@@Base+0x23111>` |
| `0xa9b841` | `a9b841:	45 31 e4             	xor    r12d,r12d` |
| `0xa9b844` | `a9b844:	4d 39 e6             	cmp    r14,r12` |
| `0xa9b847` | `a9b847:	74 31                	je     a9b87a <JNI_OnUnload@@Base+0x23147>` |
| `0xa9b849` | `a9b849:	4c 8d 3d 38 94 f5 00 	lea    r15,[rip+0xf59438]        # 19f4c88 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2d47>` |
| `0xa9b850` | `a9b850:	49 8b 36             	mov    rsi,QWORD PTR [r14]` |
| `0xa9b853` | `a9b853:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b856` | `a9b856:	e8 01 4a c0 00       	call   16a025c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x543c8>` |
| `0xa9b85b` | `a9b85b:	49 83 c6 10          	add    r14,0x10` |
| `0xa9b85f` | `a9b85f:	4c 89 f0             	mov    rax,r14` |
| `0xa9b862` | `a9b862:	48 2b 03             	sub    rax,QWORD PTR [rbx]` |
| `0xa9b865` | `a9b865:	48 3d 00 10 00 00    	cmp    rax,0x1000` |
| `0xa9b86b` | `a9b86b:	75 08                	jne    a9b875 <JNI_OnUnload@@Base+0x23142>` |
| `0xa9b86d` | `a9b86d:	4c 8b 73 08          	mov    r14,QWORD PTR [rbx+0x8]` |
| `0xa9b871` | `a9b871:	48 83 c3 08          	add    rbx,0x8` |
| `0xa9b875` | `a9b875:	4d 39 e6             	cmp    r14,r12` |
| `0xa9b878` | `a9b878:	75 d6                	jne    a9b850 <JNI_OnUnload@@Base+0x2311d>` |
| `0xa9b87a` | `a9b87a:	48 8d bc 24 00 01 00 	lea    rdi,[rsp+0x100]` |
| `0xa9b881` | `a9b881:	00` |
| `0xa9b882` | `a9b882:	e8 af 40 c0 00       	call   169f936 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x53aa2>` |
| `0xa9b887` | `a9b887:	48 8d bc 24 30 01 00 	lea    rdi,[rsp+0x130]` |
| `0xa9b88e` | `a9b88e:	00` |
| `0xa9b88f` | `a9b88f:	e8 9e 3f c0 00       	call   169f832 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5399e>` |
| `0xa9b894` | `a9b894:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]` |
| `0xa9b89b` | `a9b89b:	00` |
| `0xa9b89c` | `a9b89c:	e8 e5 2b 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b8a1` | `a9b8a1:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]` |
| `0xa9b8a8` | `a9b8a8:	00` |
| `0xa9b8a9` | `a9b8a9:	e8 3a ef d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b8ae` | `a9b8ae:	48 8d 1d dc 17 00 00 	lea    rbx,[rip+0x17dc]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xa9b8b5` | `a9b8b5:	48 8d 0d 4c 1b 00 00 	lea    rcx,[rip+0x1b4c]        # a9d408 <JNI_OnUnload@@Base+0x24cd5>` |
| `0xa9b8bc` | `a9b8bc:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9b8c3` | `a9b8c3:	00` |
| `0xa9b8c4` | `a9b8c4:	4c 8d 84 24 00 01 00 	lea    r8,[rsp+0x100]` |
| `0xa9b8cb` | `a9b8cb:	00` |
| `0xa9b8cc` | `a9b8cc:	6a 01                	push   0x1` |
| `0xa9b8ce` | `a9b8ce:	41 5e                	pop    r14` |
| `0xa9b8d0` | `a9b8d0:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b8d3` | `a9b8d3:	48 89 de             	mov    rsi,rbx` |
| `0xa9b8d6` | `a9b8d6:	31 d2                	xor    edx,edx` |
| `0xa9b8d8` | `a9b8d8:	4d 89 f1             	mov    r9,r14` |
| `0xa9b8db` | `a9b8db:	e8 b4 ee d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9b8e0` | `a9b8e0:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9b8e7` | `a9b8e7:	00` |
| `0xa9b8e8` | `a9b8e8:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b8eb` | `a9b8eb:	4c 89 fe             	mov    rsi,r15` |
| `0xa9b8ee` | `a9b8ee:	e8 47 ee d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9b8f3` | `a9b8f3:	48 8d 35 e6 93 f5 00 	lea    rsi,[rip+0xf593e6]        # 19f4ce0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2d9f>` |
| `0xa9b8fa` | `a9b8fa:	4c 8d ac 24 30 01 00 	lea    r13,[rsp+0x130]` |
| `0xa9b901` | `a9b901:	00` |
| `0xa9b902` | `a9b902:	4c 89 ef             	mov    rdi,r13` |
| `0xa9b905` | `a9b905:	4c 89 e2             	mov    rdx,r12` |
| `0xa9b908` | `a9b908:	e8 bd e6 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9b90d` | `a9b90d:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b910` | `a9b910:	e8 d3 ee d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b915` | `a9b915:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9b919` | `a9b919:	e8 68 2b 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b91e` | `a9b91e:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b921` | `a9b921:	e8 c2 ee d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b926` | `a9b926:	48 8d 0d b5 1b 00 00 	lea    rcx,[rip+0x1bb5]        # a9d4e2 <JNI_OnUnload@@Base+0x24daf>` |
| `0xa9b92d` | `a9b92d:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9b934` | `a9b934:	00` |
| `0xa9b935` | `a9b935:	4c 8d 84 24 90 00 00 	lea    r8,[rsp+0x90]` |
| `0xa9b93c` | `a9b93c:	00` |
| `0xa9b93d` | `a9b93d:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b940` | `a9b940:	48 89 de             	mov    rsi,rbx` |
| `0xa9b943` | `a9b943:	31 d2                	xor    edx,edx` |
| `0xa9b945` | `a9b945:	4d 89 f1             	mov    r9,r14` |
| `0xa9b948` | `a9b948:	e8 47 ee d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9b94d` | `a9b94d:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9b954` | `a9b954:	00` |
| `0xa9b955` | `a9b955:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b958` | `a9b958:	4c 89 fe             	mov    rsi,r15` |
| `0xa9b95b` | `a9b95b:	e8 da ed d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9b960` | `a9b960:	48 8d 35 d1 93 f5 00 	lea    rsi,[rip+0xf593d1]        # 19f4d38 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2df7>` |
| `0xa9b967` | `a9b967:	4c 8d ac 24 00 01 00 	lea    r13,[rsp+0x100]` |
| `0xa9b96e` | `a9b96e:	00` |
| `0xa9b96f` | `a9b96f:	4c 89 ef             	mov    rdi,r13` |
| `0xa9b972` | `a9b972:	4c 89 e2             	mov    rdx,r12` |
| `0xa9b975` | `a9b975:	e8 50 e6 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9b97a` | `a9b97a:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b97d` | `a9b97d:	e8 66 ee d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b982` | `a9b982:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9b986` | `a9b986:	e8 fb 2a 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b98b` | `a9b98b:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b98e` | `a9b98e:	e8 55 ee d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b993` | `a9b993:	48 8d 0d 78 1c 00 00 	lea    rcx,[rip+0x1c78]        # a9d612 <JNI_OnUnload@@Base+0x24edf>` |
| `0xa9b99a` | `a9b99a:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9b9a1` | `a9b9a1:	00` |
| `0xa9b9a2` | `a9b9a2:	4c 8d 84 24 80 00 00 	lea    r8,[rsp+0x80]` |
| `0xa9b9a9` | `a9b9a9:	00` |
| `0xa9b9aa` | `a9b9aa:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b9ad` | `a9b9ad:	48 89 de             	mov    rsi,rbx` |
| `0xa9b9b0` | `a9b9b0:	31 d2                	xor    edx,edx` |
| `0xa9b9b2` | `a9b9b2:	4d 89 f1             	mov    r9,r14` |
| `0xa9b9b5` | `a9b9b5:	e8 da ed d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9b9ba` | `a9b9ba:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9b9c1` | `a9b9c1:	00` |
| `0xa9b9c2` | `a9b9c2:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b9c5` | `a9b9c5:	4c 89 fe             	mov    rsi,r15` |
| `0xa9b9c8` | `a9b9c8:	e8 6d ed d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9b9cd` | `a9b9cd:	48 8d 35 bc 93 f5 00 	lea    rsi,[rip+0xf593bc]        # 19f4d90 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2e4f>` |
| `0xa9b9d4` | `a9b9d4:	4c 8d ac 24 90 00 00 	lea    r13,[rsp+0x90]` |
| `0xa9b9db` | `a9b9db:	00` |
| `0xa9b9dc` | `a9b9dc:	4c 89 ef             	mov    rdi,r13` |
| `0xa9b9df` | `a9b9df:	4c 89 e2             	mov    rdx,r12` |
| `0xa9b9e2` | `a9b9e2:	e8 e3 e5 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9b9e7` | `a9b9e7:	4c 89 e7             	mov    rdi,r12` |
| `0xa9b9ea` | `a9b9ea:	e8 f9 ed d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9b9ef` | `a9b9ef:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9b9f3` | `a9b9f3:	e8 8e 2a 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9b9f8` | `a9b9f8:	4c 89 ff             	mov    rdi,r15` |
| `0xa9b9fb` | `a9b9fb:	e8 e8 ed d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9ba00` | `a9ba00:	48 8d 0d 9d 1d 00 00 	lea    rcx,[rip+0x1d9d]        # a9d7a4 <JNI_OnUnload@@Base+0x25071>` |
| `0xa9ba07` | `a9ba07:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9ba0e` | `a9ba0e:	00` |
| `0xa9ba0f` | `a9ba0f:	4c 8d 44 24 70       	lea    r8,[rsp+0x70]` |
| `0xa9ba14` | `a9ba14:	4c 89 ff             	mov    rdi,r15` |
| `0xa9ba17` | `a9ba17:	48 89 de             	mov    rsi,rbx` |
| `0xa9ba1a` | `a9ba1a:	31 d2                	xor    edx,edx` |
| `0xa9ba1c` | `a9ba1c:	4d 89 f1             	mov    r9,r14` |
| `0xa9ba1f` | `a9ba1f:	e8 70 ed d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9ba24` | `a9ba24:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9ba2b` | `a9ba2b:	00` |
| `0xa9ba2c` | `a9ba2c:	4c 89 e7             	mov    rdi,r12` |
| `0xa9ba2f` | `a9ba2f:	4c 89 fe             	mov    rsi,r15` |
| `0xa9ba32` | `a9ba32:	e8 03 ed d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9ba37` | `a9ba37:	48 8d 35 aa 93 f5 00 	lea    rsi,[rip+0xf593aa]        # 19f4de8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2ea7>` |
| `0xa9ba3e` | `a9ba3e:	4c 8d ac 24 80 00 00 	lea    r13,[rsp+0x80]` |
| `0xa9ba45` | `a9ba45:	00` |
| `0xa9ba46` | `a9ba46:	4c 89 ef             	mov    rdi,r13` |
| `0xa9ba49` | `a9ba49:	4c 89 e2             	mov    rdx,r12` |
| `0xa9ba4c` | `a9ba4c:	e8 79 e5 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9ba51` | `a9ba51:	4c 89 e7             	mov    rdi,r12` |
| `0xa9ba54` | `a9ba54:	e8 8f ed d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9ba59` | `a9ba59:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9ba5d` | `a9ba5d:	e8 24 2a 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9ba62` | `a9ba62:	4c 89 ff             	mov    rdi,r15` |
| `0xa9ba65` | `a9ba65:	e8 7e ed d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9ba6a` | `a9ba6a:	48 8d 0d 0d 1e 00 00 	lea    rcx,[rip+0x1e0d]        # a9d87e <JNI_OnUnload@@Base+0x2514b>` |
| `0xa9ba71` | `a9ba71:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9ba78` | `a9ba78:	00` |
| `0xa9ba79` | `a9ba79:	4c 8d 44 24 60       	lea    r8,[rsp+0x60]` |
| `0xa9ba7e` | `a9ba7e:	4c 89 ff             	mov    rdi,r15` |
| `0xa9ba81` | `a9ba81:	48 89 de             	mov    rsi,rbx` |
| `0xa9ba84` | `a9ba84:	31 d2                	xor    edx,edx` |
| `0xa9ba86` | `a9ba86:	4d 89 f1             	mov    r9,r14` |
| `0xa9ba89` | `a9ba89:	e8 06 ed d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9ba8e` | `a9ba8e:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9ba95` | `a9ba95:	00` |
| `0xa9ba96` | `a9ba96:	4c 89 e7             	mov    rdi,r12` |
| `0xa9ba99` | `a9ba99:	4c 89 fe             	mov    rsi,r15` |
| `0xa9ba9c` | `a9ba9c:	e8 99 ec d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9baa1` | `a9baa1:	48 8d 35 98 93 f5 00 	lea    rsi,[rip+0xf59398]        # 19f4e40 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2eff>` |
| `0xa9baa8` | `a9baa8:	4c 8d 6c 24 70       	lea    r13,[rsp+0x70]` |
| `0xa9baad` | `a9baad:	4c 89 ef             	mov    rdi,r13` |
| `0xa9bab0` | `a9bab0:	4c 89 e2             	mov    rdx,r12` |
| `0xa9bab3` | `a9bab3:	e8 12 e5 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9bab8` | `a9bab8:	4c 89 e7             	mov    rdi,r12` |
| `0xa9babb` | `a9babb:	e8 28 ed d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9bac0` | `a9bac0:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9bac4` | `a9bac4:	e8 bd 29 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9bac9` | `a9bac9:	4c 89 ff             	mov    rdi,r15` |
| `0xa9bacc` | `a9bacc:	e8 17 ed d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9bad1` | `a9bad1:	48 8d 0d 34 20 00 00 	lea    rcx,[rip+0x2034]        # a9db0c <JNI_OnUnload@@Base+0x253d9>` |
| `0xa9bad8` | `a9bad8:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9badf` | `a9badf:	00` |
| `0xa9bae0` | `a9bae0:	4c 8d 44 24 50       	lea    r8,[rsp+0x50]` |
| `0xa9bae5` | `a9bae5:	4c 89 ff             	mov    rdi,r15` |
| `0xa9bae8` | `a9bae8:	48 89 de             	mov    rsi,rbx` |
| `0xa9baeb` | `a9baeb:	31 d2                	xor    edx,edx` |
| `0xa9baed` | `a9baed:	4d 89 f1             	mov    r9,r14` |
| `0xa9baf0` | `a9baf0:	e8 9f ec d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9baf5` | `a9baf5:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9bafc` | `a9bafc:	00` |
| `0xa9bafd` | `a9bafd:	4c 89 e7             	mov    rdi,r12` |
| `0xa9bb00` | `a9bb00:	4c 89 fe             	mov    rsi,r15` |
| `0xa9bb03` | `a9bb03:	e8 32 ec d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9bb08` | `a9bb08:	48 8d 35 89 93 f5 00 	lea    rsi,[rip+0xf59389]        # 19f4e98 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2f57>` |
| `0xa9bb0f` | `a9bb0f:	4c 8d 6c 24 60       	lea    r13,[rsp+0x60]` |
| `0xa9bb14` | `a9bb14:	4c 89 ef             	mov    rdi,r13` |
| `0xa9bb17` | `a9bb17:	4c 89 e2             	mov    rdx,r12` |
| `0xa9bb1a` | `a9bb1a:	e8 ab e4 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9bb1f` | `a9bb1f:	4c 89 e7             	mov    rdi,r12` |
| `0xa9bb22` | `a9bb22:	e8 c1 ec d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9bb27` | `a9bb27:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9bb2b` | `a9bb2b:	e8 56 29 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9bb30` | `a9bb30:	4c 89 ff             	mov    rdi,r15` |
| `0xa9bb33` | `a9bb33:	e8 b0 ec d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9bb38` | `a9bb38:	48 8d 0d c9 21 00 00 	lea    rcx,[rip+0x21c9]        # a9dd08 <JNI_OnUnload@@Base+0x255d5>` |
| `0xa9bb3f` | `a9bb3f:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9bb46` | `a9bb46:	00` |
| `0xa9bb47` | `a9bb47:	4c 8d 44 24 40       	lea    r8,[rsp+0x40]` |
| `0xa9bb4c` | `a9bb4c:	4c 89 ff             	mov    rdi,r15` |
| `0xa9bb4f` | `a9bb4f:	48 89 de             	mov    rsi,rbx` |
| `0xa9bb52` | `a9bb52:	31 d2                	xor    edx,edx` |
| `0xa9bb54` | `a9bb54:	4d 89 f1             	mov    r9,r14` |
| `0xa9bb57` | `a9bb57:	e8 38 ec d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9bb5c` | `a9bb5c:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]` |
| `0xa9bb63` | `a9bb63:	00` |
| `0xa9bb64` | `a9bb64:	4c 89 e7             	mov    rdi,r12` |
| `0xa9bb67` | `a9bb67:	4c 89 fe             	mov    rsi,r15` |
| `0xa9bb6a` | `a9bb6a:	e8 cb eb d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9bb6f` | `a9bb6f:	48 8d 35 7a 93 f5 00 	lea    rsi,[rip+0xf5937a]        # 19f4ef0 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2faf>` |
| `0xa9bb76` | `a9bb76:	4c 8d 6c 24 50       	lea    r13,[rsp+0x50]` |
| `0xa9bb7b` | `a9bb7b:	4c 89 ef             	mov    rdi,r13` |
| `0xa9bb7e` | `a9bb7e:	4c 89 e2             	mov    rdx,r12` |
| `0xa9bb81` | `a9bb81:	e8 44 e4 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9bb86` | `a9bb86:	4c 89 e7             	mov    rdi,r12` |
| `0xa9bb89` | `a9bb89:	e8 5a ec d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9bb8e` | `a9bb8e:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xa9bb92` | `a9bb92:	e8 ef 28 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9bb97` | `a9bb97:	4c 89 ff             	mov    rdi,r15` |
| `0xa9bb9a` | `a9bb9a:	e8 49 ec d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9bb9f` | `a9bb9f:	48 8d 0d 3a 24 00 00 	lea    rcx,[rip+0x243a]        # a9dfe0 <JNI_OnUnload@@Base+0x258ad>` |
| `0xa9bba6` | `a9bba6:	4c 8d bc 24 b0 00 00 	lea    r15,[rsp+0xb0]` |
| `0xa9bbad` | `a9bbad:	00` |
| `0xa9bbae` | `a9bbae:	4c 8d 44 24 3f       	lea    r8,[rsp+0x3f]` |
| `0xa9bbb3` | `a9bbb3:	4c 89 ff             	mov    rdi,r15` |
| `0xa9bbb6` | `a9bbb6:	48 89 de             	mov    rsi,rbx` |
| `0xa9bbb9` | `a9bbb9:	31 d2                	xor    edx,edx` |
| `0xa9bbbb` | `a9bbbb:	4d 89 f1             	mov    r9,r14` |
| `0xa9bbbe` | `a9bbbe:	e8 d1 eb d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xa9bbc3` | `a9bbc3:	48 8d 9c 24 60 01 00 	lea    rbx,[rsp+0x160]` |
| `0xa9bbca` | `a9bbca:	00` |
| `0xa9bbcb` | `a9bbcb:	48 89 df             	mov    rdi,rbx` |
| `0xa9bbce` | `a9bbce:	4c 89 fe             	mov    rsi,r15` |
| `0xa9bbd1` | `a9bbd1:	e8 64 eb d3 00       	call   17da73a <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x655b>` |
| `0xa9bbd6` | `a9bbd6:	48 8d 35 6b 93 f5 00 	lea    rsi,[rip+0xf5936b]        # 19f4f48 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x3007>` |
| `0xa9bbdd` | `a9bbdd:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xa9bbe2` | `a9bbe2:	4c 89 f7             	mov    rdi,r14` |
| `0xa9bbe5` | `a9bbe5:	48 89 da             	mov    rdx,rbx` |
| `0xa9bbe8` | `a9bbe8:	e8 dd e3 d3 00       	call   17d9fca <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5deb>` |
| `0xa9bbed` | `a9bbed:	48 89 df             	mov    rdi,rbx` |
| `0xa9bbf0` | `a9bbf0:	e8 f3 eb d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9bbf5` | `a9bbf5:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xa9bbf9` | `a9bbf9:	e8 88 28 00 00       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xa9bbfe` | `a9bbfe:	4c 89 ff             	mov    rdi,r15` |
| `0xa9bc01` | `a9bc01:	e8 e2 eb d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xa9bc06` | `a9bc06:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28` |
| `0xa9bc0d` | `a9bc0d:	00 00` |
| `0xa9bc0f` | `a9bc0f:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]` |
| `0xa9bc16` | `a9bc16:	00` |
| `0xa9bc17` | `a9bc17:	75 5d                	jne    a9bc76 <JNI_OnUnload@@Base+0x23543>` |
| `0xa9bc19` | `a9bc19:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8` |
| `0xa9bc20` | `a9bc20:	5b                   	pop    rbx` |
| `0xa9bc21` | `a9bc21:	41 5c                	pop    r12` |
| `0xa9bc23` | `a9bc23:	41 5d                	pop    r13` |
| `0xa9bc25` | `a9bc25:	41 5e                	pop    r14` |
| `0xa9bc27` | `a9bc27:	41 5f                	pop    r15` |
| `0xa9bc29` | `a9bc29:	5d                   	pop    rbp` |
| `0xa9bc2a` | `a9bc2a:	c3                   	ret` |
| `0xa9bc2b` | `a9bc2b:	eb 50                	jmp    a9bc7d <JNI_OnUnload@@Base+0x2354a>` |
| `0xa9bc2d` | `a9bc2d:	48 89 c3             	mov    rbx,rax` |
| `0xa9bc30` | `a9bc30:	48 8d 3d 71 8f f5 00 	lea    rdi,[rip+0xf58f71]        # 19f4ba8 <_ZN4asio6detail30execution_context_service_baseINS0_13epoll_reactorEE2idE@@Base+0x2c67>` |
| `0xa9bc37` | `a9bc37:	e8 c4 24 d5 00       	call   17ee100 <_ZNSt6__ndk15mutex6unlockEv@plt>` |
| `0xa9bc3c` | `a9bc3c:	eb 03                	jmp    a9bc41 <JNI_OnUnload@@Base+0x2350e>` |
| `0xa9bc3e` | `a9bc3e:	48 89 c3             	mov    rbx,rax` |
| `0xa9bc41` | `a9bc41:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]` |
| `0xa9bc48` | `a9bc48:	00` |
| `0xaa07e7` | `aa07e7:	4c 89 e7             	mov    rdi,r12` |
| `0xaa07ea` | `aa07ea:	48 83 c7 40          	add    rdi,0x40` |
| `0xaa07ee` | `aa07ee:	48 8d b4 24 f0 00 00 	lea    rsi,[rsp+0xf0]` |
| `0xaa07f5` | `aa07f5:	00` |
| `0xaa07f6` | `aa07f6:	e8 b1 89 0d 00       	call   b791ac <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xc614c>` |
| `0xaa07fb` | `aa07fb:	4c 89 6b 40          	mov    QWORD PTR [rbx+0x40],r13` |
| `0xaa07ff` | `aa07ff:	4c 89 63 48          	mov    QWORD PTR [rbx+0x48],r12` |
| `0xaa0803` | `aa0803:	31 ff                	xor    edi,edi` |
| `0xaa0805` | `aa0805:	e8 12 dc ff ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>` |
| `0xaa080a` | `aa080a:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]` |
| `0xaa0811` | `aa0811:	00` |
| `0xaa0812` | `aa0812:	e8 0f 03 00 00       	call   aa0b26 <JNI_OnUnload@@Base+0x283f3>` |
| `0xaa0817` | `aa0817:	48 8b 73 40          	mov    rsi,QWORD PTR [rbx+0x40]` |
| `0xaa081b` | `aa081b:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]` |
| `0xaa0822` | `aa0822:	00` |
| `0xaa0823` | `aa0823:	e8 41 aa 0a 00       	call   b4b269 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x98209>` |
| `0xaa0828` | `aa0828:	48 8b 74 24 18       	mov    rsi,QWORD PTR [rsp+0x18]` |
| `0xaa082d` | `aa082d:	48 83 c6 40          	add    rsi,0x40` |
| `0xaa0831` | `aa0831:	48 8d 7b 50          	lea    rdi,[rbx+0x50]` |
| `0xaa0835` | `aa0835:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xaa0838` | `aa0838:	4c 8d b4 24 b0 00 00 	lea    r14,[rsp+0xb0]` |
| `0xaa083f` | `aa083f:	00` |
| `0xaa0840` | `aa0840:	4c 89 f2             	mov    rdx,r14` |
| `0xaa0843` | `aa0843:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xaa0846` | `aa0846:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xaa084a` | `aa084a:	e8 37 dc ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa084f` | `aa084f:	4c 8b 7b 38          	mov    r15,QWORD PTR [rbx+0x38]` |
| `0xaa0853` | `aa0853:	49 8b 7f 78          	mov    rdi,QWORD PTR [r15+0x78]` |
| `0xaa0857` | `aa0857:	e8 a6 2d a1 00       	call   14b3602 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8b86>` |
| `0xaa085c` | `aa085c:	4c 8b 6c 24 10       	mov    r13,QWORD PTR [rsp+0x10]` |
| `0xaa0861` | `aa0861:	4d 8b b7 80 00 00 00 	mov    r14,QWORD PTR [r15+0x80]` |
| `0xaa0868` | `aa0868:	4d 8d 66 10          	lea    r12,[r14+0x10]` |
| `0xaa086c` | `aa086c:	4c 89 e7             	mov    rdi,r12` |
| `0xaa086f` | `aa086f:	e8 b0 2b d2 00       	call   17c3424 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177590>` |
| `0xaa0874` | `aa0874:	4c 89 e7             	mov    rdi,r12` |
| `0xaa0877` | `aa0877:	e8 7a 36 d2 00       	call   17c3ef6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178062>` |
| `0xaa087c` | `aa087c:	49 83 c6 30          	add    r14,0x30` |
| `0xaa0880` | `aa0880:	4c 89 f7             	mov    rdi,r14` |
| `0xaa0883` | `aa0883:	e8 d2 7d 00 00       	call   aa865a <JNI_OnUnload@@Base+0x2ff27>` |
| `0xaa0888` | `aa0888:	49 8b 7f 78          	mov    rdi,QWORD PTR [r15+0x78]` |
| `0xaa088c` | `aa088c:	e8 dd 19 a1 00       	call   14b226e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f77f2>` |
| `0xaa0891` | `aa0891:	0f b6 f0             	movzx  esi,al` |
| `0xaa0894` | `aa0894:	4c 89 ff             	mov    rdi,r15` |
| `0xaa0897` | `aa0897:	e8 16 1a a1 00       	call   14b22b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f7836>` |
| `0xaa089c` | `aa089c:	4d 8b 67 10          	mov    r12,QWORD PTR [r15+0x10]` |
| `0xaa08a0` | `aa08a0:	4c 8d 44 24 70       	lea    r8,[rsp+0x70]` |
| `0xaa08a5` | `aa08a5:	4d 89 38             	mov    QWORD PTR [r8],r15` |
| `0xaa08a8` | `aa08a8:	48 8d 35 e2 c7 ff ff 	lea    rsi,[rip+0xffffffffffffc7e2]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xaa08af` | `aa08af:	48 8d 0d a0 1a a1 00 	lea    rcx,[rip+0xa11aa0]        # 14b2356 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f78da>` |
| `0xaa08b6` | `aa08b6:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]` |
| `0xaa08bd` | `aa08bd:	00` |
| `0xaa08be` | `aa08be:	6a 08                	push   0x8` |
| `0xaa08c0` | `aa08c0:	41 59                	pop    r9` |
| `0xaa08c2` | `aa08c2:	4c 89 f7             	mov    rdi,r14` |
| `0xaa08c5` | `aa08c5:	31 d2                	xor    edx,edx` |
| `0xaa08c7` | `aa08c7:	e8 c8 9e d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xaa08cc` | `aa08cc:	49 8b 34 24          	mov    rsi,QWORD PTR [r12]` |
| `0xaa08d0` | `aa08d0:	48 8d 15 09 b3 92 ff 	lea    rdx,[rip+0xffffffffff92b309]        # 3cbbe0 <_ZTSN5boost9exceptionE@@Base+0x2c5c2>` |
| `0xaa08d7` | `aa08d7:	48 8d bc 24 d0 00 00 	lea    rdi,[rsp+0xd0]` |
| `0xaa08de` | `aa08de:	00` |
| `0xaa08df` | `aa08df:	4c 89 f1             	mov    rcx,r14` |
| `0xaa08e2` | `aa08e2:	e8 f9 09 d2 00       	call   17c12e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17544c>` |
| `0xaa08e7` | `aa08e7:	49 81 c7 b0 00 00 00 	add    r15,0xb0` |
| `0xaa08ee` | `aa08ee:	4c 8d b4 24 d0 00 00 	lea    r14,[rsp+0xd0]` |
| `0xaa08f5` | `aa08f5:	00` |
| `0xaa08f6` | `aa08f6:	4c 89 ff             	mov    rdi,r15` |
| `0xaa08f9` | `aa08f9:	4c 89 f6             	mov    rsi,r14` |
| `0xaa08fc` | `aa08fc:	e8 f1 92 d3 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0xaa0901` | `aa0901:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xaa0905` | `aa0905:	e8 7c db ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa090a` | `aa090a:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]` |
| `0xaa0911` | `aa0911:	00` |
| `0xaa0912` | `aa0912:	e8 d1 9e d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xaa0917` | `aa0917:	e8 64 02 00 00       	call   aa0b80 <JNI_OnUnload@@Base+0x2844d>` |
| `0xaa091c` | `aa091c:	4c 8d b4 24 f0 00 00 	lea    r14,[rsp+0xf0]` |
| `0xaa0923` | `aa0923:	00` |
| `0xaa0924` | `aa0924:	4c 89 f7             	mov    rdi,r14` |
| `0xaa0927` | `aa0927:	48 89 c6             	mov    rsi,rax` |
| `0xaa092a` | `aa092a:	4c 89 ea             	mov    rdx,r13` |
| `0xaa092d` | `aa092d:	48 89 d9             	mov    rcx,rbx` |
| `0xaa0930` | `aa0930:	e8 a1 6d d2 00       	call   17c76d6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b842>` |
| `0xaa0935` | `aa0935:	4d 8b 76 08          	mov    r14,QWORD PTR [r14+0x8]` |
| `0xaa0939` | `aa0939:	4d 85 f6             	test   r14,r14` |
| `0xaa093c` | `aa093c:	74 04                	je     aa0942 <JNI_OnUnload@@Base+0x2820f>` |
| `0xaa093e` | `aa093e:	31 db                	xor    ebx,ebx` |
| `0xaa0940` | `aa0940:	eb 0d                	jmp    aa094f <JNI_OnUnload@@Base+0x2821c>` |
| `0xaa0942` | `aa0942:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]` |
| `0xaa0949` | `aa0949:	00` |
| `0xaa094a` | `aa094a:	e8 77 53 d3 00       	call   17d5cc6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x1ae7>` |
| `0xaa094f` | `aa094f:	0f 57 c0             	xorps  xmm0,xmm0` |
| `0xaa0952` | `aa0952:	48 8d bc 24 f0 00 00 	lea    rdi,[rsp+0xf0]` |
| `0xaa0959` | `aa0959:	00` |
| `0xaa095a` | `aa095a:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0` |
| `0xaa0d73` | `aa0d73:	4c 89 fe             	mov    rsi,r15` |
| `0xaa0d76` | `aa0d76:	e8 4f 02 03 00       	call   ad0fca <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1df6a>` |
| `0xaa0d7b` | `aa0d7b:	48 8b 78 30          	mov    rdi,QWORD PTR [rax+0x30]` |
| `0xaa0d7f` | `aa0d7f:	8b 70 40             	mov    esi,DWORD PTR [rax+0x40]` |
| `0xaa0d82` | `aa0d82:	48 89 7c 24 08       	mov    QWORD PTR [rsp+0x8],rdi` |
| `0xaa0d87` | `aa0d87:	e8 3c ff 02 00       	call   ad0cc8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1dc68>` |
| `0xaa0d8c` | `aa0d8c:	4c 89 e7             	mov    rdi,r12` |
| `0xaa0d8f` | `aa0d8f:	4c 89 fe             	mov    rsi,r15` |
| `0xaa0d92` | `aa0d92:	e8 5f 02 03 00       	call   ad0ff6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x1df96>` |
| `0xaa0d97` | `aa0d97:	49 89 c7             	mov    r15,rax` |
| `0xaa0d9a` | `aa0d9a:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]` |
| `0xaa0d9e` | `aa0d9e:	48 89 ef             	mov    rdi,rbp` |
| `0xaa0da1` | `aa0da1:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0xaa0da4` | `aa0da4:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax` |
| `0xaa0da9` | `aa0da9:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]` |
| `0xaa0dad` | `aa0dad:	48 89 ef             	mov    rdi,rbp` |
| `0xaa0db0` | `aa0db0:	be a5 00 00 00       	mov    esi,0xa5` |
| `0xaa0db5` | `aa0db5:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xaa0db8` | `aa0db8:	48 85 c0             	test   rax,rax` |
| `0xaa0dbb` | `aa0dbb:	0f 84 b9 02 00 00    	je     aa107a <JNI_OnUnload@@Base+0x28947>` |
| `0xaa0dc1` | `aa0dc1:	48 8b 08             	mov    rcx,QWORD PTR [rax]` |
| `0xaa0dc4` | `aa0dc4:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]` |
| `0xaa0dc9` | `aa0dc9:	48 89 c6             	mov    rsi,rax` |
| `0xaa0dcc` | `aa0dcc:	ff 51 30             	call   QWORD PTR [rcx+0x30]` |
| `0xaa0dcf` | `aa0dcf:	4c 8b 6c 24 28       	mov    r13,QWORD PTR [rsp+0x28]` |
| `0xaa0dd4` | `aa0dd4:	48 8b 45 00          	mov    rax,QWORD PTR [rbp+0x0]` |
| `0xaa0dd8` | `aa0dd8:	6a 0c                	push   0xc` |
| `0xaa0dda` | `aa0dda:	5e                   	pop    rsi` |
| `0xaa0ddb` | `aa0ddb:	48 89 ef             	mov    rdi,rbp` |
| `0xaa0dde` | `aa0dde:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xaa0de1` | `aa0de1:	48 85 c0             	test   rax,rax` |
| `0xaa0de4` | `aa0de4:	0f 84 95 02 00 00    	je     aa107f <JNI_OnUnload@@Base+0x2894c>` |
| `0xaa0dea` | `aa0dea:	48 8b 08             	mov    rcx,QWORD PTR [rax]` |
| `0xaa0ded` | `aa0ded:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]` |
| `0xaa0df2` | `aa0df2:	48 89 c6             	mov    rsi,rax` |
| `0xaa0df5` | `aa0df5:	ff 51 30             	call   QWORD PTR [rcx+0x30]` |
| `0xaa0df8` | `aa0df8:	4c 8b 64 24 18       	mov    r12,QWORD PTR [rsp+0x18]` |
| `0xaa0dfd` | `aa0dfd:	48 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rbp` |
| `0xaa0e04` | `aa0e04:	00` |
| `0xaa0e05` | `aa0e05:	48 8d 05 58 b6 fd ff 	lea    rax,[rip+0xfffffffffffdb658]        # a7c464 <JNI_OnUnload@@Base+0x3d31>` |
| `0xaa0e0c` | `aa0e0c:	48 89 84 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rax` |
| `0xaa0e13` | `aa0e13:	00` |
| `0xaa0e14` | `aa0e14:	48 8d 05 75 03 00 00 	lea    rax,[rip+0x375]        # aa1190 <JNI_OnUnload@@Base+0x28a5d>` |
| `0xaa0e1b` | `aa0e1b:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax` |
| `0xaa0e22` | `aa0e22:	00` |
| `0xaa0e23` | `aa0e23:	48 8b 5b 38          	mov    rbx,QWORD PTR [rbx+0x38]` |
| `0xaa0e27` | `aa0e27:	4c 8d 44 24 38       	lea    r8,[rsp+0x38]` |
| `0xaa0e2c` | `aa0e2c:	49 89 18             	mov    QWORD PTR [r8],rbx` |
| `0xaa0e2f` | `aa0e2f:	48 8d 35 5b c2 ff ff 	lea    rsi,[rip+0xffffffffffffc25b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xaa0e36` | `aa0e36:	48 8d 0d 19 1c a1 00 	lea    rcx,[rip+0xa11c19]        # 14b2a56 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f7fda>` |
| `0xaa0e3d` | `aa0e3d:	48 8d 6c 24 40       	lea    rbp,[rsp+0x40]` |
| `0xaa0e42` | `aa0e42:	6a 08                	push   0x8` |
| `0xaa0e44` | `aa0e44:	41 59                	pop    r9` |
| `0xaa0e46` | `aa0e46:	48 89 ef             	mov    rdi,rbp` |
| `0xaa0e49` | `aa0e49:	31 d2                	xor    edx,edx` |
| `0xaa0e4b` | `aa0e4b:	e8 44 99 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xaa0e50` | `aa0e50:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]` |
| `0xaa0e57` | `aa0e57:	00` |
| `0xaa0e58` | `aa0e58:	4c 89 f7             	mov    rdi,r14` |
| `0xaa0e5b` | `aa0e5b:	4c 89 ee             	mov    rsi,r13` |
| `0xaa0e5e` | `aa0e5e:	48 89 ea             	mov    rdx,rbp` |
| `0xaa0e61` | `aa0e61:	e8 8c bc a8 00       	call   152caf2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x372076>` |
| `0xaa0e66` | `aa0e66:	48 8d bb a0 00 00 00 	lea    rdi,[rbx+0xa0]` |
| `0xaa0e6d` | `aa0e6d:	4c 89 f6             	mov    rsi,r14` |
| `0xaa0e70` | `aa0e70:	e8 7d 8d d3 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0xaa0e75` | `aa0e75:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xaa0e79` | `aa0e79:	e8 08 d6 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa0e7e` | `aa0e7e:	48 89 ef             	mov    rdi,rbp` |
| `0xaa0e81` | `aa0e81:	e8 62 99 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xaa0e86` | `aa0e86:	48 8d 35 a1 a3 8c ff 	lea    rsi,[rip+0xffffffffff8ca3a1]        # 36b22e <_ZTSSt12bad_any_cast@@Base-0x24f9a>` |
| `0xaa0e8d` | `aa0e8d:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xaa0e92` | `aa0e92:	e8 e7 8b fd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xaa0e97` | `aa0e97:	48 8d 94 24 80 00 00 	lea    rdx,[rsp+0x80]` |
| `0xaa0e9e` | `aa0e9e:	00` |
| `0xaa0e9f` | `aa0e9f:	c6 02 00             	mov    BYTE PTR [rdx],0x0` |
| `0xaa0ea2` | `aa0ea2:	49 8b 3f             	mov    rdi,QWORD PTR [r15]` |
| `0xaa0ea5` | `aa0ea5:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xaa0eaa` | `aa0eaa:	4c 89 f6             	mov    rsi,r14` |
| `0xaa0ead` | `aa0ead:	e8 ac c8 0e 00       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>` |
| `0xaa0eb2` | `aa0eb2:	89 c5                	mov    ebp,eax` |
| `0xaa0eb4` | `aa0eb4:	4c 89 f7             	mov    rdi,r14` |
| `0xaa0eb7` | `aa0eb7:	e8 d4 cf d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xaa0ebc` | `aa0ebc:	40 84 ed             	test   bpl,bpl` |
| `0xaa0ebf` | `aa0ebf:	74 14                	je     aa0ed5 <JNI_OnUnload@@Base+0x287a2>` |
| `0xaa0ec1` | `aa0ec1:	49 8b 04 24          	mov    rax,QWORD PTR [r12]` |
| `0xaa0ec5` | `aa0ec5:	4c 89 e7             	mov    rdi,r12` |
| `0xaa0ec8` | `aa0ec8:	ff 50 10             	call   QWORD PTR [rax+0x10]` |
| `0xaa0ecb` | `aa0ecb:	89 c5                	mov    ebp,eax` |
| `0xaa0ecd` | `aa0ecd:	83 e5 04             	and    ebp,0x4` |
| `0xaa0ed0` | `aa0ed0:	c1 ed 02             	shr    ebp,0x2` |
| `0xaa0ed3` | `aa0ed3:	eb 02                	jmp    aa0ed7 <JNI_OnUnload@@Base+0x287a4>` |
| `0xaa0ed5` | `aa0ed5:	31 ed                	xor    ebp,ebp` |
| `0xaa0ed7` | `aa0ed7:	48 8b 43 10          	mov    rax,QWORD PTR [rbx+0x10]` |
| `0xaa0edb` | `aa0edb:	4c 8b 73 70          	mov    r14,QWORD PTR [rbx+0x70]` |
| `0xaa0edf` | `aa0edf:	48 8b 4c 24 08       	mov    rcx,QWORD PTR [rsp+0x8]` |
| `0xaa0ee4` | `aa0ee4:	49 89 4e 18          	mov    QWORD PTR [r14+0x18],rcx` |
| `0xaa0ee8` | `aa0ee8:	48 8b 4c 24 10       	mov    rcx,QWORD PTR [rsp+0x10]` |
| `0xaa0eed` | `aa0eed:	49 89 4e 20          	mov    QWORD PTR [r14+0x20],rcx` |
| `0xaa0ef1` | `aa0ef1:	4d 89 6e 28          	mov    QWORD PTR [r14+0x28],r13` |
| `0xaa0ef5` | `aa0ef5:	49 89 46 30          	mov    QWORD PTR [r14+0x30],rax` |
| `0xaa0ef9` | `aa0ef9:	4d 89 7e 38          	mov    QWORD PTR [r14+0x38],r15` |
| `0xaa0efd` | `aa0efd:	49 8d 7e 40          	lea    rdi,[r14+0x40]` |
| `0xaa0f01` | `aa0f01:	48 8d b4 24 90 00 00 	lea    rsi,[rsp+0x90]` |
| `0xaa0f08` | `aa0f08:	00` |
| `0xaa0f09` | `aa0f09:	e8 d6 e5 0b 00       	call   b5f4e4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xac484>` |
| `0xaa0f0e` | `aa0f0e:	41 c6 46 60 01       	mov    BYTE PTR [r14+0x60],0x1` |
| `0xaa0f13` | `aa0f13:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]` |
| `0xaa0f17` | `aa0f17:	4c 8d 44 24 38       	lea    r8,[rsp+0x38]` |
| `0xaa0f1c` | `aa0f1c:	49 89 18             	mov    QWORD PTR [r8],rbx` |
| `0xaa0f1f` | `aa0f1f:	48 8d 35 6b c1 ff ff 	lea    rsi,[rip+0xffffffffffffc16b]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xaa0f26` | `aa0f26:	48 8d 0d ed 1b a1 00 	lea    rcx,[rip+0xa11bed]        # 14b2b1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f809e>` |
| `0xaa0f2d` | `aa0f2d:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xaa0f32` | `aa0f32:	6a 08                	push   0x8` |
| `0xaa0f34` | `aa0f34:	41 59                	pop    r9` |
| `0xaa0f36` | `aa0f36:	4c 89 f7             	mov    rdi,r14` |
| `0xaa0f39` | `aa0f39:	31 d2                	xor    edx,edx` |
| `0xaa0f3b` | `aa0f3b:	e8 54 98 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xaa0f40` | `aa0f40:	49 8b 37             	mov    rsi,QWORD PTR [r15]` |
| `0xaa0f43` | `aa0f43:	48 8d 15 96 ac 92 ff 	lea    rdx,[rip+0xffffffffff92ac96]        # 3cbbe0 <_ZTSN5boost9exceptionE@@Base+0x2c5c2>` |
| `0xaa0f4a` | `aa0f4a:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]` |
| `0xaa0f51` | `aa0f51:	00` |
| `0xaa0f52` | `aa0f52:	4c 89 f1             	mov    rcx,r14` |
| `0xaa0f55` | `aa0f55:	e8 86 03 d2 00       	call   17c12e0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17544c>` |
| `0xaa0f5a` | `aa0f5a:	48 8d bb b0 00 00 00 	lea    rdi,[rbx+0xb0]` |
| `0xaa0f61` | `aa0f61:	4c 8d b4 24 80 00 00 	lea    r14,[rsp+0x80]` |
| `0xaa0f68` | `aa0f68:	00` |
| `0xaa0f69` | `aa0f69:	4c 89 f6             	mov    rsi,r14` |
| `0xaa0f6c` | `aa0f6c:	e8 81 8c d3 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0xaa0f71` | `aa0f71:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xaa0f75` | `aa0f75:	e8 0c d5 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa0f7a` | `aa0f7a:	48 8d 7c 24 40       	lea    rdi,[rsp+0x40]` |
| `0xaa0f7f` | `aa0f7f:	e8 64 98 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xaa0f84` | `aa0f84:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]` |
| `0xaa0f8b` | `aa0f8b:	e8 72 26 a1 00       	call   14b3602 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8b86>` |
| `0xaa0f90` | `aa0f90:	48 8b bb 80 00 00 00 	mov    rdi,QWORD PTR [rbx+0x80]` |
| `0xaa0f97` | `aa0f97:	e8 1a 19 a1 00       	call   14b28b6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f7e3a>` |
| `0xaa0f9c` | `aa0f9c:	0f b6 f0             	movzx  esi,al` |
| `0xaa0f9f` | `aa0f9f:	48 89 df             	mov    rdi,rbx` |
| `0xaa0fa2` | `aa0fa2:	e8 fb 1b a1 00       	call   14b2ba2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x2f8126>` |
| `0xaa0fa7` | `aa0fa7:	48 8b 43 70          	mov    rax,QWORD PTR [rbx+0x70]` |
| `0xaa0fab` | `aa0fab:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]` |
| `0xaa0faf` | `aa0faf:	45 31 e4             	xor    r12d,r12d` |
| `0xaa0fb2` | `aa0fb2:	4c 8d 74 24 40       	lea    r14,[rsp+0x40]` |
| `0xaa0fb7` | `aa0fb7:	45 88 26             	mov    BYTE PTR [r14],r12b` |
| `0xaa0fba` | `aa0fba:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0xaa0fbd` | `aa0fbd:	48 8d 35 0c 6c 99 ff 	lea    rsi,[rip+0xffffffffff996c0c]        # 437bd0 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5d61f>` |
| `0xaa0fc4` | `aa0fc4:	4c 89 f2             	mov    rdx,r14` |
| `0xaa0fc7` | `aa0fc7:	e8 92 c7 0e 00       	call   b8d75e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xda6fe>` |
| `0xaa0fcc` | `aa0fcc:	41 89 c7             	mov    r15d,eax` |
| `0xaa0fcf` | `aa0fcf:	48 8b 43 70          	mov    rax,QWORD PTR [rbx+0x70]` |
| `0xaa0fd3` | `aa0fd3:	48 8b 40 38          	mov    rax,QWORD PTR [rax+0x38]` |
| `0xaa0fd7` | `aa0fd7:	45 88 26             	mov    BYTE PTR [r14],r12b` |
| `0xaa0fda` | `aa0fda:	48 8b 38             	mov    rdi,QWORD PTR [rax]` |
| `0xaa0fdd` | `aa0fdd:	48 8d 35 04 6c 99 ff 	lea    rsi,[rip+0xffffffffff996c04]        # 437be8 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5d637>` |
| `0xaa487d` | `aa487d:	48 83 bc 24 00 02 00 	cmp    QWORD PTR [rsp+0x200],0x0` |
| `0xaa4884` | `aa4884:	00 00` |
| `0xaa4886` | `aa4886:	0f 84 d9 01 00 00    	je     aa4a65 <JNI_OnUnload@@Base+0x2c332>` |
| `0xaa488c` | `aa488c:	49 89 ec             	mov    r12,rbp` |
| `0xaa488f` | `aa488f:	49 c1 ec 28          	shr    r12,0x28` |
| `0xaa4893` | `aa4893:	41 80 e4 01          	and    r12b,0x1` |
| `0xaa4897` | `aa4897:	48 c1 ed 20          	shr    rbp,0x20` |
| `0xaa489b` | `aa489b:	40 80 e5 01          	and    bpl,0x1` |
| `0xaa489f` | `aa489f:	4c 8d b4 24 10 08 00 	lea    r14,[rsp+0x810]` |
| `0xaa48a6` | `aa48a6:	00` |
| `0xaa48a7` | `aa48a7:	4c 89 f7             	mov    rdi,r14` |
| `0xaa48aa` | `aa48aa:	e8 47 51 d3 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0xaa48af` | `aa48af:	48 8d 7b 48          	lea    rdi,[rbx+0x48]` |
| `0xaa48b3` | `aa48b3:	48 89 bc 24 b0 00 00 	mov    QWORD PTR [rsp+0xb0],rdi` |
| `0xaa48ba` | `aa48ba:	00` |
| `0xaa48bb` | `aa48bb:	4c 89 f6             	mov    rsi,r14` |
| `0xaa48be` | `aa48be:	e8 2f 53 d3 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0xaa48c3` | `aa48c3:	4c 89 f7             	mov    rdi,r14` |
| `0xaa48c6` | `aa48c6:	e8 09 53 d3 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0xaa48cb` | `aa48cb:	4c 8d b4 24 10 08 00 	lea    r14,[rsp+0x810]` |
| `0xaa48d2` | `aa48d2:	00` |
| `0xaa48d3` | `aa48d3:	4c 89 f7             	mov    rdi,r14` |
| `0xaa48d6` | `aa48d6:	e8 1b 51 d3 00       	call   17d99f6 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5817>` |
| `0xaa48db` | `aa48db:	4c 8d 7b 58          	lea    r15,[rbx+0x58]` |
| `0xaa48df` | `aa48df:	4c 89 ff             	mov    rdi,r15` |
| `0xaa48e2` | `aa48e2:	4c 89 f6             	mov    rsi,r14` |
| `0xaa48e5` | `aa48e5:	e8 08 53 d3 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0xaa48ea` | `aa48ea:	4c 89 f7             	mov    rdi,r14` |
| `0xaa48ed` | `aa48ed:	e8 e2 52 d3 00       	call   17d9bd4 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x59f5>` |
| `0xaa48f2` | `aa48f2:	40 88 6b 69          	mov    BYTE PTR [rbx+0x69],bpl` |
| `0xaa48f6` | `aa48f6:	44 88 63 6a          	mov    BYTE PTR [rbx+0x6a],r12b` |
| `0xaa48fa` | `aa48fa:	4c 8b 6c 24 78       	mov    r13,QWORD PTR [rsp+0x78]` |
| `0xaa48ff` | `aa48ff:	66 0f 6f 84 24 00 02 	movdqa xmm0,XMMWORD PTR [rsp+0x200]` |
| `0xaa4906` | `aa4906:	00 00` |
| `0xaa4908` | `aa4908:	0f 57 c9             	xorps  xmm1,xmm1` |
| `0xaa490b` | `aa490b:	0f 29 8c 24 00 02 00 	movaps XMMWORD PTR [rsp+0x200],xmm1` |
| `0xaa4912` | `aa4912:	00` |
| `0xaa4913` | `aa4913:	48 8b 7b 40          	mov    rdi,QWORD PTR [rbx+0x40]` |
| `0xaa4917` | `aa4917:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0` |
| `0xaa491c` | `aa491c:	e8 65 9b ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa4921` | `aa4921:	8a 43 69             	mov    al,BYTE PTR [rbx+0x69]` |
| `0xaa4924` | `aa4924:	0a 43 6a             	or     al,BYTE PTR [rbx+0x6a]` |
| `0xaa4927` | `aa4927:	0f 84 38 01 00 00    	je     aa4a65 <JNI_OnUnload@@Base+0x2c332>` |
| `0xaa492d` | `aa492d:	4c 8d 84 24 90 02 00 	lea    r8,[rsp+0x290]` |
| `0xaa4934` | `aa4934:	00` |
| `0xaa4935` | `aa4935:	49 89 18             	mov    QWORD PTR [r8],rbx` |
| `0xaa4938` | `aa4938:	4c 8b 73 38          	mov    r14,QWORD PTR [rbx+0x38]` |
| `0xaa493c` | `aa493c:	48 8d 35 4e 87 ff ff 	lea    rsi,[rip+0xffffffffffff874e]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xaa4943` | `aa4943:	48 8d 0d cc a3 a6 00 	lea    rcx,[rip+0xa6a3cc]        # 150ed16 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x35429a>` |
| `0xaa494a` | `aa494a:	4c 8d ac 24 10 08 00 	lea    r13,[rsp+0x810]` |
| `0xaa4951` | `aa4951:	00` |
| `0xaa4952` | `aa4952:	6a 08                	push   0x8` |
| `0xaa4954` | `aa4954:	41 59                	pop    r9` |
| `0xaa4956` | `aa4956:	4c 89 ef             	mov    rdi,r13` |
| `0xaa4959` | `aa4959:	31 d2                	xor    edx,edx` |
| `0xaa495b` | `aa495b:	e8 34 5e d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xaa4960` | `aa4960:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xaa4963` | `aa4963:	48 8d bc 24 70 21 00 	lea    rdi,[rsp+0x2170]` |
| `0xaa496a` | `aa496a:	00` |
| `0xaa496b` | `aa496b:	4c 89 f6             	mov    rsi,r14` |
| `0xaa496e` | `aa496e:	4c 89 ea             	mov    rdx,r13` |
| `0xaa4971` | `aa4971:	ff 50 40             	call   QWORD PTR [rax+0x40]` |
| `0xaa4974` | `aa4974:	4c 8d b4 24 70 21 00 	lea    r14,[rsp+0x2170]` |
| `0xaa497b` | `aa497b:	00` |
| `0xaa497c` | `aa497c:	4c 89 ff             	mov    rdi,r15` |
| `0xaa497f` | `aa497f:	4c 89 f6             	mov    rsi,r14` |
| `0xaa4982` | `aa4982:	e8 6b 52 d3 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0xaa4987` | `aa4987:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xaa498b` | `aa498b:	e8 f6 9a ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa4990` | `aa4990:	4c 8d b4 24 10 08 00 	lea    r14,[rsp+0x810]` |
| `0xaa4997` | `aa4997:	00` |
| `0xaa4998` | `aa4998:	4c 89 f7             	mov    rdi,r14` |
| `0xaa499b` | `aa499b:	e8 48 5e d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xaa49a0` | `aa49a0:	45 31 ff             	xor    r15d,r15d` |
| `0xaa49a3` | `aa49a3:	4c 8d 25 8a 48 99 ff 	lea    r12,[rip+0xffffffffff99488a]        # 439234 <_ZN4asio9execution6detail14relationship_tILi0EE4forkE@@Base+0x5ec83>` |
| `0xaa49aa` | `aa49aa:	43 8b 2c 27          	mov    ebp,DWORD PTR [r15+r12*1]` |
| `0xaa49ae` | `aa49ae:	48 8b 73 38          	mov    rsi,QWORD PTR [rbx+0x38]` |
| `0xaa49b2` | `aa49b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xaa49b5` | `aa49b5:	4c 89 f7             	mov    rdi,r14` |
| `0xaa49b8` | `aa49b8:	89 ea                	mov    edx,ebp` |
| `0xaa49ba` | `aa49ba:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0xaa49bd` | `aa49bd:	80 bc 24 30 08 00 00 	cmp    BYTE PTR [rsp+0x830],0x0` |
| `0xaa49c4` | `aa49c4:	00` |
| `0xaa49c5` | `aa49c5:	74 12                	je     aa49d9 <JNI_OnUnload@@Base+0x2c2a6>` |
| `0xaa49c7` | `aa49c7:	48 8b bc 24 90 02 00 	mov    rdi,QWORD PTR [rsp+0x290]` |
| `0xaa49ce` | `aa49ce:	00` |
| `0xaa49cf` | `aa49cf:	89 ee                	mov    esi,ebp` |
| `0xaa49d1` | `aa49d1:	4c 89 f2             	mov    rdx,r14` |
| `0xaa49d4` | `aa49d4:	e8 f5 a5 a6 00       	call   150efce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x354552>` |
| `0xaa49d9` | `aa49d9:	4c 89 f7             	mov    rdi,r14` |
| `0xaa49dc` | `aa49dc:	e8 9f 43 3d 00       	call   e78d80 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40196>` |
| `0xaa49e1` | `aa49e1:	49 83 c7 04          	add    r15,0x4` |
| `0xaa49e5` | `aa49e5:	49 83 ff 0c          	cmp    r15,0xc` |
| `0xaa49e9` | `aa49e9:	75 bf                	jne    aa49aa <JNI_OnUnload@@Base+0x2c277>` |
| `0xaa49eb` | `aa49eb:	4c 8b 73 38          	mov    r14,QWORD PTR [rbx+0x38]` |
| `0xaa49ef` | `aa49ef:	4c 8d 84 24 70 02 00 	lea    r8,[rsp+0x270]` |
| `0xaa49f6` | `aa49f6:	00` |
| `0xaa49f7` | `aa49f7:	49 89 18             	mov    QWORD PTR [r8],rbx` |
| `0xaa49fa` | `aa49fa:	48 8d 35 90 86 ff ff 	lea    rsi,[rip+0xffffffffffff8690]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xaa4a01` | `aa4a01:	48 8d 0d 16 a3 a6 00 	lea    rcx,[rip+0xa6a316]        # 150ed1e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3542a2>` |
| `0xaa4a08` | `aa4a08:	4c 8d bc 24 10 08 00 	lea    r15,[rsp+0x810]` |
| `0xaa4a0f` | `aa4a0f:	00` |
| `0xaa4a10` | `aa4a10:	6a 08                	push   0x8` |
| `0xaa4a12` | `aa4a12:	41 59                	pop    r9` |
| `0xaa4a14` | `aa4a14:	4c 89 ff             	mov    rdi,r15` |
| `0xaa4a17` | `aa4a17:	31 d2                	xor    edx,edx` |
| `0xaa4a19` | `aa4a19:	e8 76 5d d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xaa4a1e` | `aa4a1e:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xaa4a21` | `aa4a21:	48 8d bc 24 70 21 00 	lea    rdi,[rsp+0x2170]` |
| `0xaa4a28` | `aa4a28:	00` |
| `0xaa4a29` | `aa4a29:	4c 89 f6             	mov    rsi,r14` |
| `0xaa4a2c` | `aa4a2c:	4c 89 fa             	mov    rdx,r15` |
| `0xaa4a2f` | `aa4a2f:	ff 50 48             	call   QWORD PTR [rax+0x48]` |
| `0xaa4a32` | `aa4a32:	4c 8b 6c 24 78       	mov    r13,QWORD PTR [rsp+0x78]` |
| `0xaa4a37` | `aa4a37:	4c 8d b4 24 70 21 00 	lea    r14,[rsp+0x2170]` |
| `0xaa4a3e` | `aa4a3e:	00` |
| `0xaa4a3f` | `aa4a3f:	48 8b bc 24 b0 00 00 	mov    rdi,QWORD PTR [rsp+0xb0]` |
| `0xaa4a46` | `aa4a46:	00` |
| `0xaa4a47` | `aa4a47:	4c 89 f6             	mov    rsi,r14` |
| `0xaa4a4a` | `aa4a4a:	e8 a3 51 d3 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0xaa4a4f` | `aa4a4f:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]` |
| `0xaa4a53` | `aa4a53:	e8 2e 9a ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa4a58` | `aa4a58:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]` |
| `0xaa4a5f` | `aa4a5f:	00` |
| `0xaa4a60` | `aa4a60:	e8 83 5d d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xaa4a65` | `aa4a65:	48 8b bc 24 08 02 00 	mov    rdi,QWORD PTR [rsp+0x208]` |
| `0xaa4a6c` | `aa4a6c:	00` |
| `0xaa4a6d` | `aa4a6d:	e8 14 9a ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa4a72` | `aa4a72:	48 8d 9c 24 10 08 00 	lea    rbx,[rsp+0x810]` |
| `0xaa4a79` | `aa4a79:	00` |
| `0xaa4a7a` | `aa4a7a:	48 8d b4 24 30 02 00 	lea    rsi,[rsp+0x230]` |
| `0xaa4a81` | `aa4a81:	00` |
| `0xaa4a82` | `aa4a82:	48 89 df             	mov    rdi,rbx` |
| `0xaa4a85` | `aa4a85:	e8 2a b4 c2 00       	call   16cfeb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x84020>` |
| `0xaa4a8a` | `aa4a8a:	48 8b bc 24 f0 00 00 	mov    rdi,QWORD PTR [rsp+0xf0]` |
| `0xaa4a91` | `aa4a91:	00` |
| `0xaa4a92` | `aa4a92:	48 89 de             	mov    rsi,rbx` |
| `0xaa4a95` | `aa4a95:	e8 82 4d 01 00       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>` |
| `0xaa4a9a` | `aa4a9a:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]` |
| `0xaa4a9e` | `aa4a9e:	e8 e3 99 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa4aa3` | `aa4aa3:	66 0f ef c0          	pxor   xmm0,xmm0` |
| `0xaa4aa7` | `aa4aa7:	48 8b 84 24 90 00 00 	mov    rax,QWORD PTR [rsp+0x90]` |
| `0xaa4aae` | `aa4aae:	00` |
| `0xaa4aaf` | `aa4aaf:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0` |
| `0xaa4ea7` | `aa4ea7:	e8 26 1a d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xaa4eac` | `aa4eac:	48 8b 75 00          	mov    rsi,QWORD PTR [rbp+0x0]` |
| `0xaa4eb0` | `aa4eb0:	48 8b 06             	mov    rax,QWORD PTR [rsi]` |
| `0xaa4eb3` | `aa4eb3:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]` |
| `0xaa4eba` | `aa4eba:	00` |
| `0xaa4ebb` | `aa4ebb:	ff 50 20             	call   QWORD PTR [rax+0x20]` |
| `0xaa4ebe` | `aa4ebe:	80 bc 24 28 08 00 00 	cmp    BYTE PTR [rsp+0x828],0x0` |
| `0xaa4ec5` | `aa4ec5:	00` |
| `0xaa4ec6` | `aa4ec6:	74 75                	je     aa4f3d <JNI_OnUnload@@Base+0x2c80a>` |
| `0xaa4ec8` | `aa4ec8:	f6 84 24 10 08 00 00 	test   BYTE PTR [rsp+0x810],0x1` |
| `0xaa4ecf` | `aa4ecf:	01` |
| `0xaa4ed0` | `aa4ed0:	74 48                	je     aa4f1a <JNI_OnUnload@@Base+0x2c7e7>` |
| `0xaa4ed2` | `aa4ed2:	4c 8b 84 24 20 08 00 	mov    r8,QWORD PTR [rsp+0x820]` |
| `0xaa4ed9` | `aa4ed9:	00` |
| `0xaa4eda` | `aa4eda:	eb 46                	jmp    aa4f22 <JNI_OnUnload@@Base+0x2c7ef>` |
| `0xaa4edc` | `aa4edc:	48 8d 35 52 de 8c ff 	lea    rsi,[rip+0xffffffffff8cde52]        # 372d35 <_ZTSSt12bad_any_cast@@Base-0x1d493>` |
| `0xaa4ee3` | `aa4ee3:	48 8d 0d 80 c7 89 ff 	lea    rcx,[rip+0xffffffffff89c780]        # 34166a <_ZTSSt12bad_any_cast@@Base-0x4eb5e>` |
| `0xaa4eea` | `aa4eea:	6a 04                	push   0x4` |
| `0xaa4eec` | `aa4eec:	5f                   	pop    rdi` |
| `0xaa4eed` | `aa4eed:	6a 43                	push   0x43` |
| `0xaa4eef` | `aa4eef:	5a                   	pop    rdx` |
| `0xaa4ef0` | `aa4ef0:	31 c0                	xor    eax,eax` |
| `0xaa4ef2` | `aa4ef2:	e8 db 19 d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xaa4ef7` | `aa4ef7:	e9 60 01 00 00       	jmp    aa505c <JNI_OnUnload@@Base+0x2c929>` |
| `0xaa4efc` | `aa4efc:	66 0f ef c0          	pxor   xmm0,xmm0` |
| `0xaa4f00` | `aa4f00:	48 8b 84 24 f8 00 00 	mov    rax,QWORD PTR [rsp+0xf8]` |
| `0xaa4f07` | `aa4f07:	00` |
| `0xaa4f08` | `aa4f08:	f3 0f 7f 00          	movdqu XMMWORD PTR [rax],xmm0` |
| `0xaa4f0c` | `aa4f0c:	4d 85 ed             	test   r13,r13` |
| `0xaa4f0f` | `aa4f0f:	0f 85 fc 0e 00 00    	jne    aa5e11 <JNI_OnUnload@@Base+0x2d6de>` |
| `0xaa4f15` | `aa4f15:	e9 01 0f 00 00       	jmp    aa5e1b <JNI_OnUnload@@Base+0x2d6e8>` |
| `0xaa4f1a` | `aa4f1a:	4c 8d 84 24 11 08 00 	lea    r8,[rsp+0x811]` |
| `0xaa4f21` | `aa4f21:	00` |
| `0xaa4f22` | `aa4f22:	48 8d 35 0c de 8c ff 	lea    rsi,[rip+0xffffffffff8cde0c]        # 372d35 <_ZTSSt12bad_any_cast@@Base-0x1d493>` |
| `0xaa4f29` | `aa4f29:	48 8d 0d 54 c7 89 ff 	lea    rcx,[rip+0xffffffffff89c754]        # 341684 <_ZTSSt12bad_any_cast@@Base-0x4eb44>` |
| `0xaa4f30` | `aa4f30:	6a 04                	push   0x4` |
| `0xaa4f32` | `aa4f32:	5f                   	pop    rdi` |
| `0xaa4f33` | `aa4f33:	6a 4b                	push   0x4b` |
| `0xaa4f35` | `aa4f35:	5a                   	pop    rdx` |
| `0xaa4f36` | `aa4f36:	31 c0                	xor    eax,eax` |
| `0xaa4f38` | `aa4f38:	e8 95 19 d3 00       	call   17d68d2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x26f3>` |
| `0xaa4f3d` | `aa4f3d:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]` |
| `0xaa4f44` | `aa4f44:	00` |
| `0xaa4f45` | `aa4f45:	e8 e6 1d 00 00       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>` |
| `0xaa4f4a` | `aa4f4a:	48 8b 5d 00          	mov    rbx,QWORD PTR [rbp+0x0]` |
| `0xaa4f4e` | `aa4f4e:	48 8d 35 3c 81 ff ff 	lea    rsi,[rip+0xffffffffffff813c]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xaa4f55` | `aa4f55:	48 8d 0d d2 6c 01 00 	lea    rcx,[rip+0x16cd2]        # abbc2e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bce>` |
| `0xaa4f5c` | `aa4f5c:	4c 8d b4 24 10 08 00 	lea    r14,[rsp+0x810]` |
| `0xaa4f63` | `aa4f63:	00` |
| `0xaa4f64` | `aa4f64:	4c 8d 84 24 70 02 00 	lea    r8,[rsp+0x270]` |
| `0xaa4f6b` | `aa4f6b:	00` |
| `0xaa4f6c` | `aa4f6c:	6a 01                	push   0x1` |
| `0xaa4f6e` | `aa4f6e:	41 59                	pop    r9` |
| `0xaa4f70` | `aa4f70:	4c 89 f7             	mov    rdi,r14` |
| `0xaa4f73` | `aa4f73:	31 d2                	xor    edx,edx` |
| `0xaa4f75` | `aa4f75:	e8 1a 58 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xaa4f7a` | `aa4f7a:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xaa4f7d` | `aa4f7d:	48 8d bc 24 70 21 00 	lea    rdi,[rsp+0x2170]` |
| `0xaa4f84` | `aa4f84:	00` |
| `0xaa4f85` | `aa4f85:	48 89 de             	mov    rsi,rbx` |
| `0xaa4f88` | `aa4f88:	4c 89 f2             	mov    rdx,r14` |
| `0xaa4f8b` | `aa4f8b:	ff 50 28             	call   QWORD PTR [rax+0x28]` |
| `0xaa4f8e` | `aa4f8e:	48 8d 9d 20 02 00 00 	lea    rbx,[rbp+0x220]` |
| `0xaa4f95` | `aa4f95:	48 8d b4 24 70 21 00 	lea    rsi,[rsp+0x2170]` |
| `0xaa4f9c` | `aa4f9c:	00` |
| `0xaa4f9d` | `aa4f9d:	48 89 df             	mov    rdi,rbx` |
| `0xaa4fa0` | `aa4fa0:	e8 b5 6c 01 00       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>` |
| `0xaa4fa5` | `aa4fa5:	4c 8d ac 24 70 21 00 	lea    r13,[rsp+0x2170]` |
| `0xaa4fac` | `aa4fac:	00` |
| `0xaa4fad` | `aa4fad:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xaa4fb1` | `aa4fb1:	e8 d0 94 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa4fb6` | `aa4fb6:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]` |
| `0xaa4fbd` | `aa4fbd:	00` |
| `0xaa4fbe` | `aa4fbe:	e8 25 58 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xaa4fc3` | `aa4fc3:	4c 8b 75 00          	mov    r14,QWORD PTR [rbp+0x0]` |
| `0xaa4fc7` | `aa4fc7:	48 8d 35 5a 95 89 ff 	lea    rsi,[rip+0xffffffffff89955a]        # 33e528 <_ZTSSt12bad_any_cast@@Base-0x51ca0>` |
| `0xaa4fce` | `aa4fce:	4c 89 ef             	mov    rdi,r13` |
| `0xaa4fd1` | `aa4fd1:	e8 a8 4a fd ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>` |
| `0xaa4fd6` | `aa4fd6:	4c 8d 84 24 a8 02 00 	lea    r8,[rsp+0x2a8]` |
| `0xaa4fdd` | `aa4fdd:	00` |
| `0xaa4fde` | `aa4fde:	49 89 28             	mov    QWORD PTR [r8],rbp` |
| `0xaa4fe1` | `aa4fe1:	48 8d 35 a9 80 ff ff 	lea    rsi,[rip+0xffffffffffff80a9]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xaa4fe8` | `aa4fe8:	48 8d 0d 35 6d 01 00 	lea    rcx,[rip+0x16d35]        # abbd24 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8cc4>` |
| `0xaa4fef` | `aa4fef:	4c 8d ac 24 10 08 00 	lea    r13,[rsp+0x810]` |
| `0xaa4ff6` | `aa4ff6:	00` |
| `0xaa4ff7` | `aa4ff7:	6a 08                	push   0x8` |
| `0xaa4ff9` | `aa4ff9:	41 59                	pop    r9` |
| `0xaa4ffb` | `aa4ffb:	4c 89 ef             	mov    rdi,r13` |
| `0xaa4ffe` | `aa4ffe:	31 d2                	xor    edx,edx` |
| `0xaa5000` | `aa5000:	e8 8f 57 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xaa5005` | `aa5005:	49 8b 06             	mov    rax,QWORD PTR [r14]` |
| `0xaa5008` | `aa5008:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]` |
| `0xaa500f` | `aa500f:	00` |
| `0xaa5010` | `aa5010:	48 8d 94 24 70 21 00 	lea    rdx,[rsp+0x2170]` |
| `0xaa5017` | `aa5017:	00` |
| `0xaa5018` | `aa5018:	6a 01                	push   0x1` |
| `0xaa501a` | `aa501a:	41 58                	pop    r8` |
| `0xaa501c` | `aa501c:	4c 89 f6             	mov    rsi,r14` |
| `0xaa501f` | `aa501f:	4c 89 e9             	mov    rcx,r13` |
| `0xaa5022` | `aa5022:	ff 50 18             	call   QWORD PTR [rax+0x18]` |
| `0xaa5025` | `aa5025:	48 8d b4 24 70 02 00 	lea    rsi,[rsp+0x270]` |
| `0xaa502c` | `aa502c:	00` |
| `0xaa502d` | `aa502d:	48 89 df             	mov    rdi,rbx` |
| `0xaa5030` | `aa5030:	e8 25 6c 01 00       	call   abbc5a <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bfa>` |
| `0xaa5035` | `aa5035:	48 8b bc 24 78 02 00 	mov    rdi,QWORD PTR [rsp+0x278]` |
| `0xaa503c` | `aa503c:	00` |
| `0xaa503d` | `aa503d:	e8 44 94 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa5042` | `aa5042:	48 8d bc 24 10 08 00 	lea    rdi,[rsp+0x810]` |
| `0xaa5049` | `aa5049:	00` |
| `0xaa504a` | `aa504a:	e8 99 57 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xaa504f` | `aa504f:	48 8d bc 24 70 21 00 	lea    rdi,[rsp+0x2170]` |
| `0xaa5056` | `aa5056:	00` |
| `0xaa5057` | `aa5057:	e8 34 8e d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xaa505c` | `aa505c:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]` |
| `0xaa5063` | `aa5063:	00 00` |
| `0xaa5065` | `aa5065:	66 48 0f 7e c3       	movq   rbx,xmm0` |
| `0xaa506a` | `aa506a:	48 8d bc 24 70 21 00 	lea    rdi,[rsp+0x2170]` |
| `0xaa5071` | `aa5071:	00` |
| `0xaa5072` | `aa5072:	48 89 de             	mov    rsi,rbx` |
| `0xaa5075` | `aa5075:	e8 2c 48 b4 00       	call   15e98a6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42ee2a>` |
| `0xaa507a` | `aa507a:	bf 18 01 00 00       	mov    edi,0x118` |
| `0xaa507f` | `aa507f:	e8 7c 8e d4 00       	call   17edf00 <_Znwm@plt>` |
| `0xaa5084` | `aa5084:	48 89 c5             	mov    rbp,rax` |
| `0xaa5087` | `aa5087:	0f 57 c9             	xorps  xmm1,xmm1` |
| `0xaa508a` | `aa508a:	0f 11 48 08          	movups XMMWORD PTR [rax+0x8],xmm1` |
| `0xaa508e` | `aa508e:	48 8d 05 33 9c d5 00 	lea    rax,[rip+0xd59c33]        # 17fecc8 <_ZTIN4asio22service_already_existsE@@Base+0x4b0>` |
| `0xaa5095` | `aa5095:	48 89 45 00          	mov    QWORD PTR [rbp+0x0],rax` |
| `0xaa5267` | `aa5267:	49 8b 46 10          	mov    rax,QWORD PTR [r14+0x10]` |
| `0xaa526b` | `aa526b:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax` |
| `0xaa526f` | `aa526f:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]` |
| `0xaa5274` | `aa5274:	49 83 66 10 00       	and    QWORD PTR [r14+0x10],0x0` |
| `0xaa5279` | `aa5279:	f3 0f 7f 43 38       	movdqu XMMWORD PTR [rbx+0x38],xmm0` |
| `0xaa527e` | `aa527e:	48 83 63 60 00       	and    QWORD PTR [rbx+0x60],0x0` |
| `0xaa5283` | `aa5283:	4c 8d ac 24 70 21 00 	lea    r13,[rsp+0x2170]` |
| `0xaa528a` | `aa528a:	00` |
| `0xaa528b` | `aa528b:	49 83 65 10 00       	and    QWORD PTR [r13+0x10],0x0` |
| `0xaa5290` | `aa5290:	66 0f ef c0          	pxor   xmm0,xmm0` |
| `0xaa5294` | `aa5294:	f3 0f 7f 43 50       	movdqu XMMWORD PTR [rbx+0x50],xmm0` |
| `0xaa5299` | `aa5299:	83 a3 b4 00 00 00 00 	and    DWORD PTR [rbx+0xb4],0x0` |
| `0xaa52a0` | `aa52a0:	66 41 0f 7f 06       	movdqa XMMWORD PTR [r14],xmm0` |
| `0xaa52a5` | `aa52a5:	66 41 0f 7f 45 00    	movdqa XMMWORD PTR [r13+0x0],xmm0` |
| `0xaa52ab` | `aa52ab:	48 8d bb b8 00 00 00 	lea    rdi,[rbx+0xb8]` |
| `0xaa52b2` | `aa52b2:	f3 0f 7f 43 68       	movdqu XMMWORD PTR [rbx+0x68],xmm0` |
| `0xaa52b7` | `aa52b7:	f3 0f 7f 43 78       	movdqu XMMWORD PTR [rbx+0x78],xmm0` |
| `0xaa52bc` | `aa52bc:	f3 0f 7f 83 88 00 00 	movdqu XMMWORD PTR [rbx+0x88],xmm0` |
| `0xaa52c3` | `aa52c3:	00` |
| `0xaa52c4` | `aa52c4:	f3 0f 7f 83 98 00 00 	movdqu XMMWORD PTR [rbx+0x98],xmm0` |
| `0xaa52cb` | `aa52cb:	00` |
| `0xaa52cc` | `aa52cc:	f3 0f 7f 83 a1 00 00 	movdqu XMMWORD PTR [rbx+0xa1],xmm0` |
| `0xaa52d3` | `aa52d3:	00` |
| `0xaa52d4` | `aa52d4:	e8 e9 c3 d1 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>` |
| `0xaa52d9` | `aa52d9:	48 8d bb c8 00 00 00 	lea    rdi,[rbx+0xc8]` |
| `0xaa52e0` | `aa52e0:	e8 39 69 01 00       	call   abbc1e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x8bbe>` |
| `0xaa52e5` | `aa52e5:	48 89 df             	mov    rdi,rbx` |
| `0xaa52e8` | `aa52e8:	48 81 c7 20 01 00 00 	add    rdi,0x120` |
| `0xaa52ef` | `aa52ef:	e8 0e 7f 01 00       	call   abd202 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xa1a2>` |
| `0xaa52f4` | `aa52f4:	4c 89 ef             	mov    rdi,r13` |
| `0xaa52f7` | `aa52f7:	e8 94 8b d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xaa52fc` | `aa52fc:	4c 89 f7             	mov    rdi,r14` |
| `0xaa52ff` | `aa52ff:	e8 8c 8b d4 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>` |
| `0xaa5304` | `aa5304:	31 ff                	xor    edi,edi` |
| `0xaa5306` | `aa5306:	e8 7b 91 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa530b` | `aa530b:	31 ff                	xor    edi,edi` |
| `0xaa530d` | `aa530d:	e8 0a 91 ff ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>` |
| `0xaa5312` | `aa5312:	4d 89 67 40          	mov    QWORD PTR [r15+0x40],r12` |
| `0xaa5316` | `aa5316:	49 8b 7f 48          	mov    rdi,QWORD PTR [r15+0x48]` |
| `0xaa531a` | `aa531a:	49 89 5f 48          	mov    QWORD PTR [r15+0x48],rbx` |
| `0xaa531e` | `aa531e:	e8 63 91 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa5323` | `aa5323:	31 ff                	xor    edi,edi` |
| `0xaa5325` | `aa5325:	e8 5c 91 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa532a` | `aa532a:	49 8b 5f 40          	mov    rbx,QWORD PTR [r15+0x40]` |
| `0xaa532e` | `aa532e:	4c 8d 84 24 a8 02 00 	lea    r8,[rsp+0x2a8]` |
| `0xaa5335` | `aa5335:	00` |
| `0xaa5336` | `aa5336:	4d 89 38             	mov    QWORD PTR [r8],r15` |
| `0xaa5339` | `aa5339:	48 8d 35 51 7d ff ff 	lea    rsi,[rip+0xffffffffffff7d51]        # a9d091 <JNI_OnUnload@@Base+0x2495e>` |
| `0xaa5340` | `aa5340:	48 8d 0d 07 1e 01 00 	lea    rcx,[rip+0x11e07]        # ab714e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x40ee>` |
| `0xaa5347` | `aa5347:	4c 8d b4 24 10 08 00 	lea    r14,[rsp+0x810]` |
| `0xaa534e` | `aa534e:	00` |
| `0xaa534f` | `aa534f:	6a 08                	push   0x8` |
| `0xaa5351` | `aa5351:	41 59                	pop    r9` |
| `0xaa5353` | `aa5353:	4c 89 f7             	mov    rdi,r14` |
| `0xaa5356` | `aa5356:	31 d2                	xor    edx,edx` |
| `0xaa5358` | `aa5358:	e8 37 54 d3 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>` |
| `0xaa535d` | `aa535d:	48 8b 03             	mov    rax,QWORD PTR [rbx]` |
| `0xaa5360` | `aa5360:	4c 8d ac 24 70 21 00 	lea    r13,[rsp+0x2170]` |
| `0xaa5367` | `aa5367:	00` |
| `0xaa5368` | `aa5368:	4c 89 ef             	mov    rdi,r13` |
| `0xaa536b` | `aa536b:	48 89 de             	mov    rsi,rbx` |
| `0xaa536e` | `aa536e:	4c 89 f2             	mov    rdx,r14` |
| `0xaa5371` | `aa5371:	ff 50 30             	call   QWORD PTR [rax+0x30]` |
| `0xaa5374` | `aa5374:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]` |
| `0xaa537b` | `aa537b:	00` |
| `0xaa537c` | `aa537c:	4c 89 ee             	mov    rsi,r13` |
| `0xaa537f` | `aa537f:	e8 6e 48 d3 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>` |
| `0xaa5384` | `aa5384:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]` |
| `0xaa5388` | `aa5388:	e8 f9 90 ff ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>` |
| `0xaa538d` | `aa538d:	4c 89 f7             	mov    rdi,r14` |
| `0xaa5390` | `aa5390:	e8 53 54 d3 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>` |
| `0xaa5395` | `aa5395:	4d 8b 67 10          	mov    r12,QWORD PTR [r15+0x10]` |
| `0xaa5399` | `aa5399:	4d 8b 6f 20          	mov    r13,QWORD PTR [r15+0x20]` |
| `0xaa539d` | `aa539d:	49 8b 6f 40          	mov    rbp,QWORD PTR [r15+0x40]` |
| `0xaa53a1` | `aa53a1:	6a 50                	push   0x50` |
| `0xaa53a3` | `aa53a3:	5f                   	pop    rdi` |
| `0xaa53a4` | `aa53a4:	e8 57 8b d4 00       	call   17edf00 <_Znwm@plt>` |
| ... | truncated 59878 more |

## Relocations targeting callback helper neighborhood

| entry | target | relocation |
|---:|---:|---|
| `0x18ae4f8` | `0x17dac40` | `00000000018ae4f8  0000000000000008 R_X86_64_RELATIVE                         17dac40` |

## Current v14 interpretation target

If the helper stores `rcx` into the destination object, this report should expose the callback-code-pointer offset inside the package. If it only delegates to another helper, the callee and destination field offsets should be visible in the filtered instruction table.
