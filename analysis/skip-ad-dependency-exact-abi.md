# Skip Ad execution dependency exact ABI ranking

Required same-object slots: +0x68 side effect; +0x98/+0xa0/+0xb8/+0xc0 sret-style with dependency in RSI.
The +0x68 return is discarded by the exact skip-ad branch.

## score=191 AP=0x188a7f0
- +0x68=0x15ed8da; score=31; ['incoming-extra=rsi', 'calls=12', 'stores=2']; FDE=(22993114, 22993362)
- +0x98=0x15ed9fa; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(22993402, 22993410)
- +0xa0=0x15eda02; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(22993410, 22993418)
- +0xb8=0x15eda34; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(22993460, 22993468)
- +0xc0=0x15eda3c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(22993468, 22993476)
### +0x68
     15ed8da:	41 57                	push   r15
     15ed8dc:	41 56                	push   r14
     15ed8de:	41 54                	push   r12
     15ed8e0:	53                   	push   rbx
     15ed8e1:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
     15ed8e8:	49 89 f6             	mov    r14,rsi
     15ed8eb:	48 89 fb             	mov    rbx,rdi
     15ed8ee:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15ed8f5:	00 00 
     15ed8f7:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
     15ed8fe:	00 
     15ed8ff:	48 81 c3 b0 02 00 00 	add    rbx,0x2b0
     15ed906:	49 89 e7             	mov    r15,rsp
     15ed909:	4c 89 ff             	mov    rdi,r15
     15ed90c:	48 89 de             	mov    rsi,rbx
     15ed90f:	e8 54 34 00 00       	call   15f0d68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4362ec>
     15ed914:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     15ed919:	4c 89 f6             	mov    rsi,r14
     15ed91c:	e8 8b 34 00 00       	call   15f0dac <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x436330>
     15ed921:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     15ed928:	00 
     15ed929:	4c 89 fe             	mov    rsi,r15
     15ed92c:	e8 bf 34 00 00       	call   15f0df0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x436374>
     15ed931:	48 83 a4 24 80 00 00 	and    QWORD PTR [rsp+0x80],0x0
     15ed938:	00 00 
     15ed93a:	6a 70                	push   0x70
     15ed93c:	5f                   	pop    rdi
     15ed93d:	e8 be 05 20 00       	call   17edf00 <_Znwm@plt>
     15ed942:	49 89 c6             	mov    r14,rax
     15ed945:	48 8d 05 34 d0 29 00 	lea    rax,[rip+0x29d034]        # 188a980 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x3658>
     15ed94c:	49 89 06             	mov    QWORD PTR [r14],rax
     15ed94f:	4c 89 f7             	mov    rdi,r14
     15ed952:	48 83 c7 10          	add    rdi,0x10
     15ed956:	4c 8d bc 24 90 00 00 	lea    r15,[rsp+0x90]
     15ed95d:	00 
     15ed95e:	4c 89 fe             	mov    rsi,r15
     15ed961:	e8 8a 34 00 00       	call   15f0df0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x436374>
     15ed966:	4c 8d 64 24 60       	lea    r12,[rsp+0x60]
     15ed96b:	4d 89 74 24 20       	mov    QWORD PTR [r12+0x20],r14
     15ed970:	4c 89 ff             	mov    rdi,r15
     15ed973:	e8 fa 75 7f ff       	call   de4f72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1ff8>
     15ed978:	48 89 df             	mov    rdi,rbx
     15ed97b:	4c 89 e6             	mov    rsi,r12
     15ed97e:	e8 97 34 00 00       	call   15f0e1a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x43639e>
     15ed983:	4c 89 e7             	mov    rdi,r12
     15ed986:	e8 df c5 48 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     15ed98b:	48 89 e7             	mov    rdi,rsp
     15ed98e:	e8 df 75 7f ff       	call   de4f72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1ff8>
     15ed993:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     15ed99a:	00 00 
     15ed99c:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
     15ed9a3:	00 
     15ed9a4:	75 0f                	jne    15ed9b5 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x432f39>
     15ed9a6:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
     15ed9ad:	5b                   	pop    rbx
     15ed9ae:	41 5c                	pop    r12
     15ed9b0:	41 5e                	pop    r14
     15ed9b2:	41 5f                	pop    r15
     15ed9b4:	c3                   	ret
     15ed9b5:	e8 f6 20 20 00       	call   17efab0 <__stack_chk_fail@plt>
     15ed9ba:	48 89 c3             	mov    rbx,rax
     15ed9bd:	48 8d bc 24 90 00 00 	lea    rdi,[rsp+0x90]
     15ed9c4:	00 
     15ed9c5:	e8 a8 75 7f ff       	call   de4f72 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xb1ff8>
     15ed9ca:	48 89 df             	mov    rdi,rbx
     15ed9cd:	e8 d3 c0 48 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
### +0x98 head
     15ed9fa:	40 88 b7 01 02 00 00 	mov    BYTE PTR [rdi+0x201],sil
     15eda01:	c3                   	ret
### +0xa0 head
     15eda02:	48 89 b7 08 02 00 00 	mov    QWORD PTR [rdi+0x208],rsi
     15eda09:	c3                   	ret
### +0xb8 head
     15eda34:	40 88 b7 02 02 00 00 	mov    BYTE PTR [rdi+0x202],sil
     15eda3b:	c3                   	ret
### +0xc0 head
     15eda3c:	48 89 b7 e0 01 00 00 	mov    QWORD PTR [rdi+0x1e0],rsi
     15eda43:	c3                   	ret

## score=180 AP=0x18ad120
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb1a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300712, 12300746)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb1a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb1ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb1af:	48 83 c0 02          	add    rax,0x2
      bbb1b3:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb1b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb1b9:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb1bc:	31 f6                	xor    esi,esi
      bbb1be:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb1c2:	40 0f 97 c6          	seta   sil
      bbb1c6:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb1c9:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=180 AP=0x18acff0
- +0x68=0xbbb84b; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302411, 12302475)
- +0x98=0xbbb82d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302381, 12302411)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb9a5; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302757, 12302783)
### +0x68
      bbb84b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb84e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb852:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb856:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb859:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb85e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb862:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb865:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb869:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb86d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb870:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb874:	48 83 c0 0c          	add    rax,0xc
      bbb878:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb87b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb87e:	44 0f af 04 90       	imul   r8d,DWORD PTR [rax+rdx*4]
      bbb883:	45 01 c8             	add    r8d,r9d
      bbb886:	44 89 04 88          	mov    DWORD PTR [rax+rcx*4],r8d
      bbb88a:	c3                   	ret
### +0x98 head
      bbb82d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb830:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb834:	48 83 c0 02          	add    rax,0x2
      bbb838:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb83b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb83e:	31 d2                	xor    edx,edx
      bbb840:	83 3c 88 00          	cmp    DWORD PTR [rax+rcx*4],0x0
      bbb844:	0f 94 c2             	sete   dl
      bbb847:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb84a:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb9a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9a8:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb9ac:	48 83 c0 02          	add    rax,0x2
      bbb9b0:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9b3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9b6:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb9ba:	48 d3 2c 90          	shr    QWORD PTR [rax+rdx*4],cl
      bbb9be:	c3                   	ret

## score=180 AP=0x18acf60
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb960; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302688, 12302730)
- +0xa0=0xbbb8a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302504, 12302535)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb757; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302167, 12302211)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb960:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb963:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb967:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb96b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb96e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb971:	48 83 c0 06          	add    rax,0x6
      bbb975:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb978:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb97b:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb97e:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb982:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbb985:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb989:	c3                   	ret
### +0xa0 head
      bbb8a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8af:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb8b3:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb8b6:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb8b9:	48 83 c0 06          	add    rax,0x6
      bbb8bd:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8c3:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb8c6:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb757:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb75a:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb75e:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb762:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb765:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb768:	48 83 c0 06          	add    rax,0x6
      bbb76c:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb76f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb772:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb775:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb779:	48 0f be 14 3a       	movsx  rdx,BYTE PTR [rdx+rdi*1]
      bbb77e:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb782:	c3                   	ret

## score=180 AP=0x18acec8
- +0x68=0xbbb9bf; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302783, 12302843)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbb9bf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9c2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb9c6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb9ca:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb9cd:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb9d0:	48 83 c0 06          	add    rax,0x6
      bbb9d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9da:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb9dd:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb9e1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9e4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb9e8:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb9ec:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9f3:	0f bf 14 88          	movsx  edx,WORD PTR [rax+rcx*4]
      bbb9f7:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb9fa:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=180 AP=0x18acea8
- +0x68=0xbbb783; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302211, 12302269)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=180 AP=0x18acde0
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb54e; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301646, 12301677)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb52d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301613, 12301646)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb54e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb551:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb555:	48 83 c0 02          	add    rax,0x2
      bbb559:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb55c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb55f:	31 d2                	xor    edx,edx
      bbb561:	48 83 3c 88 00       	cmp    QWORD PTR [rax+rcx*4],0x0
      bbb566:	0f 94 c2             	sete   dl
      bbb569:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb56c:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb52d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb530:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb534:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb538:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb53b:	48 8b 50 02          	mov    rdx,QWORD PTR [rax+0x2]
      bbb53f:	48 83 c0 0a          	add    rax,0xa
      bbb543:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb546:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb549:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb54d:	c3                   	ret

## score=180 AP=0x18aca98
- +0x68=0xbbbb9f; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12303263, 12303327)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb904; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302596, 12302623)
- +0xb8=0xbbb597; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301719, 12301745)
- +0xc0=0xbbb440; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301376, 12301413)
### +0x68
      bbbb9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbba2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbba6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbbaa:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbbad:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbbbb2:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbbbb6:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbbbb9:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbbbbd:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbbbc1:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbbbc4:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbbbc8:	48 83 c0 14          	add    rax,0x14
      bbbbcc:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbcf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbd2:	4c 0f af 04 90       	imul   r8,QWORD PTR [rax+rdx*4]
      bbbbd7:	4d 01 c8             	add    r8,r9
      bbbbda:	4c 89 04 88          	mov    QWORD PTR [rax+rcx*4],r8
      bbbbde:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb904:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb907:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb90b:	48 83 c0 02          	add    rax,0x2
      bbb90f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb912:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb915:	48 8b 54 88 08       	mov    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb91a:	48 21 14 88          	and    QWORD PTR [rax+rcx*4],rdx
      bbb91e:	c3                   	ret
### +0xb8 head
      bbb597:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb59a:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb59e:	48 83 c0 02          	add    rax,0x2
      bbb5a2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb5a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5a8:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb5ac:	48 d3 04 90          	rol    QWORD PTR [rax+rdx*4],cl
      bbb5b0:	c3                   	ret
### +0xc0 head
      bbb440:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb443:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb447:	48 83 c0 02          	add    rax,0x2
      bbb44b:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb44e:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb451:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb454:	8b 74 88 04          	mov    esi,DWORD PTR [rax+rcx*4+0x4]
      bbb458:	8d 3c 32             	lea    edi,[rdx+rsi*1]
      bbb45b:	21 f2                	and    edx,esi
      bbb45d:	01 d2                	add    edx,edx
      bbb45f:	29 d7                	sub    edi,edx
      bbb461:	89 3c 88             	mov    DWORD PTR [rax+rcx*4],edi
      bbb464:	c3                   	ret

## score=180 AP=0x18ac920
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb1a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300712, 12300746)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb1a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb1ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb1af:	48 83 c0 02          	add    rax,0x2
      bbb1b3:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb1b6:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb1b9:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb1bc:	31 f6                	xor    esi,esi
      bbb1be:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb1c2:	40 0f 97 c6          	seta   sil
      bbb1c6:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb1c9:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=180 AP=0x18ac7f0
- +0x68=0xbbb84b; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302411, 12302475)
- +0x98=0xbbb82d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302381, 12302411)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb9a5; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302757, 12302783)
### +0x68
      bbb84b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb84e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb852:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb856:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb859:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb85e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb862:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb865:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb869:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb86d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb870:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb874:	48 83 c0 0c          	add    rax,0xc
      bbb878:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb87b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb87e:	44 0f af 04 90       	imul   r8d,DWORD PTR [rax+rdx*4]
      bbb883:	45 01 c8             	add    r8d,r9d
      bbb886:	44 89 04 88          	mov    DWORD PTR [rax+rcx*4],r8d
      bbb88a:	c3                   	ret
### +0x98 head
      bbb82d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb830:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb834:	48 83 c0 02          	add    rax,0x2
      bbb838:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb83b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb83e:	31 d2                	xor    edx,edx
      bbb840:	83 3c 88 00          	cmp    DWORD PTR [rax+rcx*4],0x0
      bbb844:	0f 94 c2             	sete   dl
      bbb847:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb84a:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb9a5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9a8:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb9ac:	48 83 c0 02          	add    rax,0x2
      bbb9b0:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9b3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9b6:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb9ba:	48 d3 2c 90          	shr    QWORD PTR [rax+rdx*4],cl
      bbb9be:	c3                   	ret

## score=180 AP=0x18ac760
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb960; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302688, 12302730)
- +0xa0=0xbbb8a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302504, 12302535)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb757; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302167, 12302211)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb960:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb963:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb967:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb96b:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb96e:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb971:	48 83 c0 06          	add    rax,0x6
      bbb975:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb978:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb97b:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb97e:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb982:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbb985:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb989:	c3                   	ret
### +0xa0 head
      bbb8a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8af:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb8b3:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb8b6:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb8b9:	48 83 c0 06          	add    rax,0x6
      bbb8bd:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8c3:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb8c6:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb757:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb75a:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb75e:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb762:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb765:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb768:	48 83 c0 06          	add    rax,0x6
      bbb76c:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb76f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb772:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb775:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb779:	48 0f be 14 3a       	movsx  rdx,BYTE PTR [rdx+rdi*1]
      bbb77e:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb782:	c3                   	ret

## score=180 AP=0x18ac6c8
- +0x68=0xbbb9bf; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302783, 12302843)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb9bf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9c2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb9c6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb9ca:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb9cd:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb9d0:	48 83 c0 06          	add    rax,0x6
      bbb9d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9da:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb9dd:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb9e1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9e4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb9e8:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb9ec:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9f3:	0f bf 14 88          	movsx  edx,WORD PTR [rax+rcx*4]
      bbb9f7:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb9fa:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=180 AP=0x18ac6a8
- +0x68=0xbbb783; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302211, 12302269)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=180 AP=0x18ac5e0
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb54e; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301646, 12301677)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb52d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301613, 12301646)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb54e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb551:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb555:	48 83 c0 02          	add    rax,0x2
      bbb559:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb55c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb55f:	31 d2                	xor    edx,edx
      bbb561:	48 83 3c 88 00       	cmp    QWORD PTR [rax+rcx*4],0x0
      bbb566:	0f 94 c2             	sete   dl
      bbb569:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb56c:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb52d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb530:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb534:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb538:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb53b:	48 8b 50 02          	mov    rdx,QWORD PTR [rax+0x2]
      bbb53f:	48 83 c0 0a          	add    rax,0xa
      bbb543:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb546:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb549:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb54d:	c3                   	ret

## score=180 AP=0x18ac298
- +0x68=0xbbbb9f; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12303263, 12303327)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb904; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302596, 12302623)
- +0xb8=0xbbb597; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301719, 12301745)
- +0xc0=0xbbbcab; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303531, 12303568)
### +0x68
      bbbb9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbba2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbba6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbbaa:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbbad:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbbbb2:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbbbb6:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbbbb9:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbbbbd:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbbbc1:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbbbc4:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbbbc8:	48 83 c0 14          	add    rax,0x14
      bbbbcc:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbcf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbd2:	4c 0f af 04 90       	imul   r8,QWORD PTR [rax+rdx*4]
      bbbbd7:	4d 01 c8             	add    r8,r9
      bbbbda:	4c 89 04 88          	mov    QWORD PTR [rax+rcx*4],r8
      bbbbde:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb904:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb907:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb90b:	48 83 c0 02          	add    rax,0x2
      bbb90f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb912:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb915:	48 8b 54 88 08       	mov    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb91a:	48 21 14 88          	and    QWORD PTR [rax+rcx*4],rdx
      bbb91e:	c3                   	ret
### +0xb8 head
      bbb597:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb59a:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb59e:	48 83 c0 02          	add    rax,0x2
      bbb5a2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb5a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5a8:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbb5ac:	48 d3 04 90          	rol    QWORD PTR [rax+rdx*4],cl
      bbb5b0:	c3                   	ret
### +0xc0 head
      bbbcab:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbcae:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbcb2:	48 83 c0 02          	add    rax,0x2
      bbbcb6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbcb9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbcbc:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbbcbf:	8b 74 88 04          	mov    esi,DWORD PTR [rax+rcx*4+0x4]
      bbbcc3:	8d 3c 16             	lea    edi,[rsi+rdx*1]
      bbbcc6:	21 d6                	and    esi,edx
      bbbcc8:	01 f6                	add    esi,esi
      bbbcca:	29 f7                	sub    edi,esi
      bbbccc:	89 3c 88             	mov    DWORD PTR [rax+rcx*4],edi
      bbbccf:	c3                   	ret

## score=180 AP=0x186c478
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb305; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301061, 12301095)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb82d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302381, 12302411)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb305:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb308:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb30c:	48 83 c0 02          	add    rax,0x2
      bbb310:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb313:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb316:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb319:	31 f6                	xor    esi,esi
      bbb31b:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb31f:	40 0f 93 c6          	setae  sil
      bbb323:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb326:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb82d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb830:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb834:	48 83 c0 02          	add    rax,0x2
      bbb838:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb83b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb83e:	31 d2                	xor    edx,edx
      bbb840:	83 3c 88 00          	cmp    DWORD PTR [rax+rcx*4],0x0
      bbb844:	0f 94 c2             	sete   dl
      bbb847:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb84a:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=180 AP=0x186c470
- +0x68=0xbbb9bf; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302783, 12302843)
- +0x98=0xbbb7d6; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302294, 12302337)
- +0xa0=0xbbb305; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301061, 12301095)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb82d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302381, 12302411)
### +0x68
      bbb9bf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9c2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb9c6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb9ca:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb9cd:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb9d0:	48 83 c0 06          	add    rax,0x6
      bbb9d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9da:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb9dd:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb9e1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9e4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb9e8:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb9ec:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9f3:	0f bf 14 88          	movsx  edx,WORD PTR [rax+rcx*4]
      bbb9f7:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb9fa:	c3                   	ret
### +0x98 head
      bbb7d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb7d9:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb7dd:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb7e1:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb7e4:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb7e7:	48 83 c0 06          	add    rax,0x6
      bbb7eb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb7ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7f1:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7f4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7f8:	48 8b 14 3a          	mov    rdx,QWORD PTR [rdx+rdi*1]
      bbb7fc:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb800:	c3                   	ret
### +0xa0 head
      bbb305:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb308:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb30c:	48 83 c0 02          	add    rax,0x2
      bbb310:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb313:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb316:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb319:	31 f6                	xor    esi,esi
      bbb31b:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb31f:	40 0f 93 c6          	setae  sil
      bbb323:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb326:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb82d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb830:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb834:	48 83 c0 02          	add    rax,0x2
      bbb838:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb83b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb83e:	31 d2                	xor    edx,edx
      bbb840:	83 3c 88 00          	cmp    DWORD PTR [rax+rcx*4],0x0
      bbb844:	0f 94 c2             	sete   dl
      bbb847:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb84a:	c3                   	ret

## score=180 AP=0x186c3e0
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=180 AP=0x186c248
- +0x68=0xbbb783; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302211, 12302269)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbbb78; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303224, 12303258)
- +0xb8=0xbbbc62; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303458, 12303506)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbbb78:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb7b:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb7f:	48 83 c0 02          	add    rax,0x2
      bbbb83:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb86:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb89:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbbb8c:	31 f6                	xor    esi,esi
      bbbb8e:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbbb92:	40 0f 95 c6          	setne  sil
      bbbb96:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbbb99:	c3                   	ret
### +0xb8 head
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=180 AP=0x186c130
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbbb9f; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303263, 12303327)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbbb9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbba2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbba6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbbaa:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbbad:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbbbb2:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbbbb6:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbbbb9:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbbbbd:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbbbc1:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbbbc4:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbbbc8:	48 83 c0 14          	add    rax,0x14
      bbbbcc:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbcf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbd2:	4c 0f af 04 90       	imul   r8,QWORD PTR [rax+rdx*4]
      bbbbd7:	4d 01 c8             	add    r8,r9
      bbbbda:	4c 89 04 88          	mov    QWORD PTR [rax+rcx*4],r8
      bbbbde:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=180 AP=0x186c128
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbbb9f; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303263, 12303327)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbbb9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbba2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbba6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbbaa:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbbad:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbbbb2:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbbbb6:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbbbb9:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbbbbd:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbbbc1:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbbbc4:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbbbc8:	48 83 c0 14          	add    rax,0x14
      bbbbcc:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbcf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbd2:	4c 0f af 04 90       	imul   r8,QWORD PTR [rax+rdx*4]
      bbbbd7:	4d 01 c8             	add    r8,r9
      bbbbda:	4c 89 04 88          	mov    QWORD PTR [rax+rcx*4],r8
      bbbbde:	c3                   	ret

## score=180 AP=0x186bc78
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb305; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301061, 12301095)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb82d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302381, 12302411)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb305:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb308:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb30c:	48 83 c0 02          	add    rax,0x2
      bbb310:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb313:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb316:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb319:	31 f6                	xor    esi,esi
      bbb31b:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb31f:	40 0f 93 c6          	setae  sil
      bbb323:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb326:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb82d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb830:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb834:	48 83 c0 02          	add    rax,0x2
      bbb838:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb83b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb83e:	31 d2                	xor    edx,edx
      bbb840:	83 3c 88 00          	cmp    DWORD PTR [rax+rcx*4],0x0
      bbb844:	0f 94 c2             	sete   dl
      bbb847:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb84a:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=180 AP=0x186bc70
- +0x68=0xbbb9bf; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302783, 12302843)
- +0x98=0xbbb7d6; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302294, 12302337)
- +0xa0=0xbbb305; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301061, 12301095)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb82d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302381, 12302411)
### +0x68
      bbb9bf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9c2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb9c6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb9ca:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb9cd:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb9d0:	48 83 c0 06          	add    rax,0x6
      bbb9d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9da:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb9dd:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb9e1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9e4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb9e8:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb9ec:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9f3:	0f bf 14 88          	movsx  edx,WORD PTR [rax+rcx*4]
      bbb9f7:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb9fa:	c3                   	ret
### +0x98 head
      bbb7d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb7d9:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb7dd:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb7e1:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb7e4:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb7e7:	48 83 c0 06          	add    rax,0x6
      bbb7eb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb7ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7f1:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7f4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7f8:	48 8b 14 3a          	mov    rdx,QWORD PTR [rdx+rdi*1]
      bbb7fc:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb800:	c3                   	ret
### +0xa0 head
      bbb305:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb308:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb30c:	48 83 c0 02          	add    rax,0x2
      bbb310:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb313:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb316:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb319:	31 f6                	xor    esi,esi
      bbb31b:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb31f:	40 0f 93 c6          	setae  sil
      bbb323:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb326:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb82d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb830:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb834:	48 83 c0 02          	add    rax,0x2
      bbb838:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb83b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb83e:	31 d2                	xor    edx,edx
      bbb840:	83 3c 88 00          	cmp    DWORD PTR [rax+rcx*4],0x0
      bbb844:	0f 94 c2             	sete   dl
      bbb847:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb84a:	c3                   	ret

## score=180 AP=0x186bbe0
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=180 AP=0x186ba48
- +0x68=0xbbb783; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302211, 12302269)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbbb78; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303224, 12303258)
- +0xb8=0xbbbc62; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303458, 12303506)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbbb78:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb7b:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb7f:	48 83 c0 02          	add    rax,0x2
      bbbb83:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb86:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb89:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbbb8c:	31 f6                	xor    esi,esi
      bbbb8e:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbbb92:	40 0f 95 c6          	setne  sil
      bbbb96:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbbb99:	c3                   	ret
### +0xb8 head
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=180 AP=0x186b930
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbbb9f; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303263, 12303327)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbbb9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbba2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbba6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbbaa:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbbad:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbbbb2:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbbbb6:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbbbb9:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbbbbd:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbbbc1:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbbbc4:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbbbc8:	48 83 c0 14          	add    rax,0x14
      bbbbcc:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbcf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbd2:	4c 0f af 04 90       	imul   r8,QWORD PTR [rax+rdx*4]
      bbbbd7:	4d 01 c8             	add    r8,r9
      bbbbda:	4c 89 04 88          	mov    QWORD PTR [rax+rcx*4],r8
      bbbbde:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=180 AP=0x186b928
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbbb9f; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303263, 12303327)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbbb9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbba2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbba6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbbaa:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbbad:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbbbb2:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbbbb6:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbbbb9:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbbbbd:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbbbc1:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbbbc4:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbbbc8:	48 83 c0 14          	add    rax,0x14
      bbbbcc:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbcf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbd2:	4c 0f af 04 90       	imul   r8,QWORD PTR [rax+rdx*4]
      bbbbd7:	4d 01 c8             	add    r8,r9
      bbbbda:	4c 89 04 88          	mov    QWORD PTR [rax+rcx*4],r8
      bbbbde:	c3                   	ret

## score=180 AP=0x1811398
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbbc62; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303458, 12303506)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=180 AP=0x1811348
- +0x68=0xbbbb9f; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12303263, 12303327)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb8a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302504, 12302535)
- +0xb8=0xbbb9fb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302843, 12302907)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbbb9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbba2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbba6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbbaa:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbbad:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbbbb2:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbbbb6:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbbbb9:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbbbbd:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbbbc1:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbbbc4:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbbbc8:	48 83 c0 14          	add    rax,0x14
      bbbbcc:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbcf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbd2:	4c 0f af 04 90       	imul   r8,QWORD PTR [rax+rdx*4]
      bbbbd7:	4d 01 c8             	add    r8,r9
      bbbbda:	4c 89 04 88          	mov    QWORD PTR [rax+rcx*4],r8
      bbbbde:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb8a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8af:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb8b3:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb8b6:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb8b9:	48 83 c0 06          	add    rax,0x6
      bbb8bd:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8c3:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb8c6:	c3                   	ret
### +0xb8 head
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=180 AP=0x18111d8
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbba7f; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302975, 12303023)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbba7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba82:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba86:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba8a:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba8d:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbba90:	48 83 c0 06          	add    rax,0x6
      bbba94:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba97:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba9a:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbba9d:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbaa1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbaa4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbaa8:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbbaab:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbbaae:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=180 AP=0x18111c0
- +0x68=0xbbb9bf; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302783, 12302843)
- +0x98=0xbbba3b; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302907, 12302943)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb9bf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9c2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb9c6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb9ca:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb9cd:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb9d0:	48 83 c0 06          	add    rax,0x6
      bbb9d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9da:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb9dd:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb9e1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9e4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb9e8:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb9ec:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9f3:	0f bf 14 88          	movsx  edx,WORD PTR [rax+rcx*4]
      bbb9f7:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb9fa:	c3                   	ret
### +0x98 head
      bbba3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba3e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba42:	48 83 c0 02          	add    rax,0x2
      bbba46:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba49:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba4c:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbba50:	31 f6                	xor    esi,esi
      bbba52:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbba57:	40 0f 94 c6          	sete   sil
      bbba5b:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbba5e:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=180 AP=0x18110d8
- +0x68=0xbbb84b; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302411, 12302475)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb8a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302504, 12302535)
### +0x68
      bbb84b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb84e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb852:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb856:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb859:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb85e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb862:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb865:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb869:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb86d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb870:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb874:	48 83 c0 0c          	add    rax,0xc
      bbb878:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb87b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb87e:	44 0f af 04 90       	imul   r8d,DWORD PTR [rax+rdx*4]
      bbb883:	45 01 c8             	add    r8d,r9d
      bbb886:	44 89 04 88          	mov    DWORD PTR [rax+rcx*4],r8d
      bbb88a:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb8a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8af:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb8b3:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb8b6:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb8b9:	48 83 c0 06          	add    rax,0x6
      bbb8bd:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8c3:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb8c6:	c3                   	ret

## score=180 AP=0x1811058
- +0x68=0xbbb783; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302211, 12302269)
- +0x98=0xbbb7d6; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302294, 12302337)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret
### +0x98 head
      bbb7d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb7d9:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb7dd:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb7e1:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb7e4:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb7e7:	48 83 c0 06          	add    rax,0x6
      bbb7eb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb7ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7f1:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7f4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7f8:	48 8b 14 3a          	mov    rdx,QWORD PTR [rdx+rdi*1]
      bbb7fc:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb800:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=180 AP=0x1810ef0
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb56d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301677, 12301719)
- +0xb8=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret
### +0xb8 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=180 AP=0x1810d20
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb359; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301145, 12301189)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb359:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb35c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb360:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb364:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb367:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb36a:	48 83 c0 06          	add    rax,0x6
      bbb36e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb371:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb374:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb377:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb37b:	48 0f bf 14 3a       	movsx  rdx,WORD PTR [rdx+rdi*1]
      bbb380:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb384:	c3                   	ret

## score=180 AP=0x1810b98
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbbc62; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303458, 12303506)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=180 AP=0x1810b48
- +0x68=0xbbbb9f; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12303263, 12303327)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb8a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302504, 12302535)
- +0xb8=0xbbb9fb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302843, 12302907)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbbb9f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbba2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbba6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbbaa:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbbad:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbbbb2:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbbbb6:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbbbb9:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbbbbd:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbbbc1:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbbbc4:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbbbc8:	48 83 c0 14          	add    rax,0x14
      bbbbcc:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbbcf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbbd2:	4c 0f af 04 90       	imul   r8,QWORD PTR [rax+rdx*4]
      bbbbd7:	4d 01 c8             	add    r8,r9
      bbbbda:	4c 89 04 88          	mov    QWORD PTR [rax+rcx*4],r8
      bbbbde:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb8a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8af:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb8b3:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb8b6:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb8b9:	48 83 c0 06          	add    rax,0x6
      bbb8bd:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8c3:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb8c6:	c3                   	ret
### +0xb8 head
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=180 AP=0x18109d8
- +0x68=0xbbb9fb; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302843, 12302907)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbba7f; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302975, 12303023)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbba7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba82:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba86:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba8a:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba8d:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbba90:	48 83 c0 06          	add    rax,0x6
      bbba94:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba97:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba9a:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbba9d:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbaa1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbaa4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbaa8:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbbaab:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbbaae:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=180 AP=0x18109c0
- +0x68=0xbbb9bf; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302783, 12302843)
- +0x98=0xbbba3b; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302907, 12302943)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbb9bf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9c2:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb9c6:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb9ca:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb9cd:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb9d0:	48 83 c0 06          	add    rax,0x6
      bbb9d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb9d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9da:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb9dd:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb9e1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9e4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb9e8:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb9ec:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb9f0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb9f3:	0f bf 14 88          	movsx  edx,WORD PTR [rax+rcx*4]
      bbb9f7:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb9fa:	c3                   	ret
### +0x98 head
      bbba3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba3e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba42:	48 83 c0 02          	add    rax,0x2
      bbba46:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba49:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba4c:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbba50:	31 f6                	xor    esi,esi
      bbba52:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbba57:	40 0f 94 c6          	sete   sil
      bbba5b:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbba5e:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=180 AP=0x18108d8
- +0x68=0xbbb84b; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302411, 12302475)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb8a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302504, 12302535)
### +0x68
      bbb84b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb84e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb852:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb856:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb859:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb85e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb862:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb865:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb869:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb86d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb870:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb874:	48 83 c0 0c          	add    rax,0xc
      bbb878:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb87b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb87e:	44 0f af 04 90       	imul   r8d,DWORD PTR [rax+rdx*4]
      bbb883:	45 01 c8             	add    r8d,r9d
      bbb886:	44 89 04 88          	mov    DWORD PTR [rax+rcx*4],r8d
      bbb88a:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb8a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8af:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb8b3:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb8b6:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb8b9:	48 83 c0 06          	add    rax,0x6
      bbb8bd:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8c3:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb8c6:	c3                   	ret

## score=180 AP=0x1810858
- +0x68=0xbbb783; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12302211, 12302269)
- +0x98=0xbbb7d6; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302294, 12302337)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret
### +0x98 head
      bbb7d6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb7d9:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb7dd:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb7e1:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb7e4:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb7e7:	48 83 c0 06          	add    rax,0x6
      bbb7eb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb7ee:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7f1:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7f4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7f8:	48 8b 14 3a          	mov    rdx,QWORD PTR [rdx+rdi*1]
      bbb7fc:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb800:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=180 AP=0x18106f0
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb56d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301677, 12301719)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=180 AP=0x1810520
- +0x68=0xbbb2c5; score=20; ['incoming-extra=rsi', 'stores=5']; FDE=(12300997, 12301061)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb359; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301145, 12301189)
### +0x68
      bbb2c5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb2c8:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb2cc:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb2d0:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb2d3:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbb2d8:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb2dc:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb2df:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb2e3:	4c 8d 48 08          	lea    r9,[rax+0x8]
      bbb2e7:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbb2ea:	44 8b 48 08          	mov    r9d,DWORD PTR [rax+0x8]
      bbb2ee:	48 83 c0 0c          	add    rax,0xc
      bbb2f2:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb2f5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb2f8:	44 0f af 04 88       	imul   r8d,DWORD PTR [rax+rcx*4]
      bbb2fd:	45 01 c8             	add    r8d,r9d
      bbb300:	44 89 04 90          	mov    DWORD PTR [rax+rdx*4],r8d
      bbb304:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb359:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb35c:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb360:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb364:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb367:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb36a:	48 83 c0 06          	add    rax,0x6
      bbb36e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb371:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb374:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb377:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb37b:	48 0f bf 14 3a       	movsx  rdx,WORD PTR [rdx+rdi*1]
      bbb380:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb384:	c3                   	ret

## score=177 AP=0x18ad0a0
- +0x68=0xbbb704; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302084, 12302134)
- +0x98=0xbbb98a; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302730, 12302757)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb704:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb707:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb70b:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb70f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb712:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
      bbb716:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb71a:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb71d:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb721:	48 83 c0 08          	add    rax,0x8
      bbb725:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb728:	0f af 56 10          	imul   edx,DWORD PTR [rsi+0x10]
      bbb72c:	44 01 c2             	add    edx,r8d
      bbb72f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb732:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb735:	c3                   	ret
### +0x98 head
      bbb98a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb98d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb991:	48 83 c0 02          	add    rax,0x2
      bbb995:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb998:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb99b:	48 8b 56 18          	mov    rdx,QWORD PTR [rsi+0x18]
      bbb99f:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb9a2:	89 02                	mov    DWORD PTR [rdx],eax
      bbb9a4:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=177 AP=0x18ace20
- +0x68=0xbbba7f; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302975, 12303023)
- +0x98=0xbbb683; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301955, 12301999)
- +0xa0=0xbbb327; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301095, 12301120)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb385; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301189, 12301232)
### +0x68
      bbba7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba82:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba86:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba8a:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba8d:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbba90:	48 83 c0 06          	add    rax,0x6
      bbba94:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba97:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba9a:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbba9d:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbaa1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbaa4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbaa8:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbbaab:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbbaae:	c3                   	ret
### +0x98 head
      bbb683:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb686:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb68a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb68e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb691:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb694:	48 83 c0 06          	add    rax,0x6
      bbb698:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb69b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb69e:	0f b7 7c 88 04       	movzx  edi,WORD PTR [rax+rcx*4+0x4]
      bbb6a3:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb6a6:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb6aa:	66 89 3c 02          	mov    WORD PTR [rdx+rax*1],di
      bbb6ae:	c3                   	ret
### +0xa0 head
      bbb327:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb32a:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb32e:	48 83 c0 02          	add    rax,0x2
      bbb332:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb335:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb338:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb33c:	d3 2c 90             	shr    DWORD PTR [rax+rdx*4],cl
      bbb33f:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb385:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb388:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb38c:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb390:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb393:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb396:	48 83 c0 06          	add    rax,0x6
      bbb39a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb39d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb3a0:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb3a3:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb3a7:	0f b6 14 3a          	movzx  edx,BYTE PTR [rdx+rdi*1]
      bbb3ab:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb3af:	c3                   	ret

## score=177 AP=0x18acd88
- +0x68=0xbbb5b1; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301745, 12301795)
- +0x98=0xbbba3b; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302907, 12302943)
- +0xa0=0xbbb8a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302504, 12302535)
- +0xb8=0xbbb465; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301413, 12301449)
- +0xc0=0xbbb9fb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302843, 12302907)
### +0x68
      bbb5b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5b4:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5b8:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5bc:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5bf:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5c2:	48 83 c0 06          	add    rax,0x6
      bbb5c6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb5c9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5cc:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb5cf:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb5d3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5d6:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb5da:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb5de:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb5e2:	c3                   	ret
### +0x98 head
      bbba3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba3e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba42:	48 83 c0 02          	add    rax,0x2
      bbba46:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba49:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba4c:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbba50:	31 f6                	xor    esi,esi
      bbba52:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbba57:	40 0f 94 c6          	sete   sil
      bbba5b:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbba5e:	c3                   	ret
### +0xa0 head
      bbb8a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8af:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb8b3:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb8b6:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb8b9:	48 83 c0 06          	add    rax,0x6
      bbb8bd:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8c3:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb8c6:	c3                   	ret
### +0xb8 head
      bbb465:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb468:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb46c:	48 83 c0 02          	add    rax,0x2
      bbb470:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb473:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb476:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb47a:	31 f6                	xor    esi,esi
      bbb47c:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb481:	40 0f 9f c6          	setg   sil
      bbb485:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb488:	c3                   	ret
### +0xc0 head
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret

## score=177 AP=0x18acbd0
- +0x68=0xbbb5e3; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301795, 12301848)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5e6:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5ea:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5ee:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5f1:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5f4:	4c 8d 40 06          	lea    r8,[rax+0x6]
      bbb5f8:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb5fb:	4c 8b 40 06          	mov    r8,QWORD PTR [rax+0x6]
      bbb5ff:	48 83 c0 0e          	add    rax,0xe
      bbb603:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb606:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb609:	48 0f af c2          	imul   rax,rdx
      bbb60d:	4c 01 c0             	add    rax,r8
      bbb610:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb613:	48 89 04 8a          	mov    QWORD PTR [rdx+rcx*4],rax
      bbb617:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=177 AP=0x18acb18
- +0x68=0xbbbc62; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12303458, 12303506)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb6c9; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302025, 12302059)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb6c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb6cc:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb6d0:	48 83 c0 02          	add    rax,0x2
      bbb6d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb6d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb6da:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb6dd:	31 f6                	xor    esi,esi
      bbb6df:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb6e3:	40 0f 9c c6          	setl   sil
      bbb6e7:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb6ea:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=177 AP=0x18ac8a0
- +0x68=0xbbb704; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302084, 12302134)
- +0x98=0xbbb98a; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302730, 12302757)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb704:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb707:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb70b:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb70f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb712:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
      bbb716:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb71a:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb71d:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb721:	48 83 c0 08          	add    rax,0x8
      bbb725:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb728:	0f af 56 10          	imul   edx,DWORD PTR [rsi+0x10]
      bbb72c:	44 01 c2             	add    edx,r8d
      bbb72f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb732:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb735:	c3                   	ret
### +0x98 head
      bbb98a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb98d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb991:	48 83 c0 02          	add    rax,0x2
      bbb995:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb998:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb99b:	48 8b 56 18          	mov    rdx,QWORD PTR [rsi+0x18]
      bbb99f:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb9a2:	89 02                	mov    DWORD PTR [rdx],eax
      bbb9a4:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=177 AP=0x18ac620
- +0x68=0xbbba7f; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302975, 12303023)
- +0x98=0xbbb683; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301955, 12301999)
- +0xa0=0xbbb327; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301095, 12301120)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb385; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301189, 12301232)
### +0x68
      bbba7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba82:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba86:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba8a:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba8d:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbba90:	48 83 c0 06          	add    rax,0x6
      bbba94:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba97:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba9a:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbba9d:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbaa1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbaa4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbaa8:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbbaab:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbbaae:	c3                   	ret
### +0x98 head
      bbb683:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb686:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb68a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb68e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb691:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb694:	48 83 c0 06          	add    rax,0x6
      bbb698:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb69b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb69e:	0f b7 7c 88 04       	movzx  edi,WORD PTR [rax+rcx*4+0x4]
      bbb6a3:	8b 04 88             	mov    eax,DWORD PTR [rax+rcx*4]
      bbb6a6:	48 03 46 08          	add    rax,QWORD PTR [rsi+0x8]
      bbb6aa:	66 89 3c 02          	mov    WORD PTR [rdx+rax*1],di
      bbb6ae:	c3                   	ret
### +0xa0 head
      bbb327:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb32a:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb32e:	48 83 c0 02          	add    rax,0x2
      bbb332:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb335:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb338:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb33c:	d3 2c 90             	shr    DWORD PTR [rax+rdx*4],cl
      bbb33f:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb385:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb388:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb38c:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb390:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb393:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb396:	48 83 c0 06          	add    rax,0x6
      bbb39a:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb39d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb3a0:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb3a3:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb3a7:	0f b6 14 3a          	movzx  edx,BYTE PTR [rdx+rdi*1]
      bbb3ab:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb3af:	c3                   	ret

## score=177 AP=0x18ac588
- +0x68=0xbbb5b1; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301745, 12301795)
- +0x98=0xbbba3b; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302907, 12302943)
- +0xa0=0xbbb8a8; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302504, 12302535)
- +0xb8=0xbbb465; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301413, 12301449)
- +0xc0=0xbbb9fb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302843, 12302907)
### +0x68
      bbb5b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5b4:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5b8:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5bc:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5bf:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5c2:	48 83 c0 06          	add    rax,0x6
      bbb5c6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb5c9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5cc:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb5cf:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb5d3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5d6:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb5da:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb5de:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb5e2:	c3                   	ret
### +0x98 head
      bbba3b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba3e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba42:	48 83 c0 02          	add    rax,0x2
      bbba46:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba49:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba4c:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbba50:	31 f6                	xor    esi,esi
      bbba52:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbba57:	40 0f 94 c6          	sete   sil
      bbba5b:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbba5e:	c3                   	ret
### +0xa0 head
      bbb8a8:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ab:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8af:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb8b3:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb8b6:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb8b9:	48 83 c0 06          	add    rax,0x6
      bbb8bd:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8c0:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8c3:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb8c6:	c3                   	ret
### +0xb8 head
      bbb465:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb468:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb46c:	48 83 c0 02          	add    rax,0x2
      bbb470:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb473:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb476:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb47a:	31 f6                	xor    esi,esi
      bbb47c:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb481:	40 0f 9f c6          	setg   sil
      bbb485:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb488:	c3                   	ret
### +0xc0 head
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret

## score=177 AP=0x18ac3d0
- +0x68=0xbbb5e3; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301795, 12301848)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5e6:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5ea:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5ee:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5f1:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5f4:	4c 8d 40 06          	lea    r8,[rax+0x6]
      bbb5f8:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb5fb:	4c 8b 40 06          	mov    r8,QWORD PTR [rax+0x6]
      bbb5ff:	48 83 c0 0e          	add    rax,0xe
      bbb603:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb606:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb609:	48 0f af c2          	imul   rax,rdx
      bbb60d:	4c 01 c0             	add    rax,r8
      bbb610:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb613:	48 89 04 8a          	mov    QWORD PTR [rdx+rcx*4],rax
      bbb617:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=177 AP=0x18ac318
- +0x68=0xbbbc62; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12303458, 12303506)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb6c9; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302025, 12302059)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb6c9:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb6cc:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb6d0:	48 83 c0 02          	add    rax,0x2
      bbb6d4:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb6d7:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb6da:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb6dd:	31 f6                	xor    esi,esi
      bbb6df:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb6e3:	40 0f 9c c6          	setl   sil
      bbb6e7:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb6ea:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=177 AP=0x186c4f0
- +0x68=0xbbba7f; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302975, 12303023)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbba7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba82:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba86:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba8a:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba8d:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbba90:	48 83 c0 06          	add    rax,0x6
      bbba94:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba97:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba9a:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbba9d:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbaa1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbaa4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbaa8:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbbaab:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbbaae:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=177 AP=0x186c3a0
- +0x68=0xbbb5e3; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301795, 12301848)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb514; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301588, 12301613)
- +0xb8=0xbbbc03; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303363, 12303389)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5e6:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5ea:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5ee:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5f1:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5f4:	4c 8d 40 06          	lea    r8,[rax+0x6]
      bbb5f8:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb5fb:	4c 8b 40 06          	mov    r8,QWORD PTR [rax+0x6]
      bbb5ff:	48 83 c0 0e          	add    rax,0xe
      bbb603:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb606:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb609:	48 0f af c2          	imul   rax,rdx
      bbb60d:	4c 01 c0             	add    rax,r8
      bbb610:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb613:	48 89 04 8a          	mov    QWORD PTR [rdx+rcx*4],rax
      bbb617:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb514:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb517:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb51b:	48 83 c0 02          	add    rax,0x2
      bbb51f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb522:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb525:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb529:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb52c:	c3                   	ret
### +0xb8 head
      bbbc03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc06:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbbc0a:	48 83 c0 02          	add    rax,0x2
      bbbc0e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc11:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc14:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbbc18:	48 d3 3c 90          	sar    QWORD PTR [rax+rdx*4],cl
      bbbc1c:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=177 AP=0x186c390
- +0x68=0xbbb704; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302084, 12302134)
- +0x98=0xbbb8eb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302571, 12302596)
- +0xa0=0xbbb22b; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300843, 12300868)
- +0xb8=0xbbb9fb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302843, 12302907)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb704:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb707:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb70b:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb70f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb712:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
      bbb716:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb71a:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb71d:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb721:	48 83 c0 08          	add    rax,0x8
      bbb725:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb728:	0f af 56 10          	imul   edx,DWORD PTR [rsi+0x10]
      bbb72c:	44 01 c2             	add    edx,r8d
      bbb72f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb732:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb735:	c3                   	ret
### +0x98 head
      bbb8eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ee:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8f2:	48 83 c0 02          	add    rax,0x2
      bbb8f6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8f9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8fc:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb900:	09 14 88             	or     DWORD PTR [rax+rcx*4],edx
      bbb903:	c3                   	ret
### +0xa0 head
      bbb22b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb22e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb232:	48 83 c0 02          	add    rax,0x2
      bbb236:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb239:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb23c:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb240:	29 14 88             	sub    DWORD PTR [rax+rcx*4],edx
      bbb243:	c3                   	ret
### +0xb8 head
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=177 AP=0x186c298
- +0x68=0xbbbc62; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12303458, 12303506)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=177 AP=0x186bcf0
- +0x68=0xbbba7f; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302975, 12303023)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbba7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba82:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba86:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba8a:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba8d:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbba90:	48 83 c0 06          	add    rax,0x6
      bbba94:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba97:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba9a:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbba9d:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbaa1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbaa4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbaa8:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbbaab:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbbaae:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=177 AP=0x186bba0
- +0x68=0xbbb5e3; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301795, 12301848)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb514; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301588, 12301613)
- +0xb8=0xbbbc03; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303363, 12303389)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5e6:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5ea:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5ee:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5f1:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5f4:	4c 8d 40 06          	lea    r8,[rax+0x6]
      bbb5f8:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb5fb:	4c 8b 40 06          	mov    r8,QWORD PTR [rax+0x6]
      bbb5ff:	48 83 c0 0e          	add    rax,0xe
      bbb603:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb606:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb609:	48 0f af c2          	imul   rax,rdx
      bbb60d:	4c 01 c0             	add    rax,r8
      bbb610:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb613:	48 89 04 8a          	mov    QWORD PTR [rdx+rcx*4],rax
      bbb617:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb514:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb517:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb51b:	48 83 c0 02          	add    rax,0x2
      bbb51f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb522:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb525:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb529:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb52c:	c3                   	ret
### +0xb8 head
      bbbc03:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc06:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbbc0a:	48 83 c0 02          	add    rax,0x2
      bbbc0e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc11:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc14:	8a 4c 90 08          	mov    cl,BYTE PTR [rax+rdx*4+0x8]
      bbbc18:	48 d3 3c 90          	sar    QWORD PTR [rax+rdx*4],cl
      bbbc1c:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=177 AP=0x186bb90
- +0x68=0xbbb704; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302084, 12302134)
- +0x98=0xbbb8eb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302571, 12302596)
- +0xa0=0xbbb22b; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300843, 12300868)
- +0xb8=0xbbb9fb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302843, 12302907)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbb704:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb707:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb70b:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb70f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb712:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
      bbb716:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb71a:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb71d:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb721:	48 83 c0 08          	add    rax,0x8
      bbb725:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb728:	0f af 56 10          	imul   edx,DWORD PTR [rsi+0x10]
      bbb72c:	44 01 c2             	add    edx,r8d
      bbb72f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb732:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb735:	c3                   	ret
### +0x98 head
      bbb8eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb8ee:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb8f2:	48 83 c0 02          	add    rax,0x2
      bbb8f6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb8f9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb8fc:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb900:	09 14 88             	or     DWORD PTR [rax+rcx*4],edx
      bbb903:	c3                   	ret
### +0xa0 head
      bbb22b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb22e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb232:	48 83 c0 02          	add    rax,0x2
      bbb236:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb239:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb23c:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb240:	29 14 88             	sub    DWORD PTR [rax+rcx*4],edx
      bbb243:	c3                   	ret
### +0xb8 head
      bbb9fb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb9fe:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba02:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba06:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba09:	48 0f bf 50 02       	movsx  rdx,WORD PTR [rax+0x2]
      bbba0e:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbba12:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbba15:	4c 8b 40 04          	mov    r8,QWORD PTR [rax+0x4]
      bbba19:	4c 8d 48 0c          	lea    r9,[rax+0xc]
      bbba1d:	4c 89 0f             	mov    QWORD PTR [rdi],r9
      bbba20:	4c 8b 48 0c          	mov    r9,QWORD PTR [rax+0xc]
      bbba24:	48 83 c0 14          	add    rax,0x14
      bbba28:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba2b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba2e:	4c 0f af 04 88       	imul   r8,QWORD PTR [rax+rcx*4]
      bbba33:	4d 01 c8             	add    r8,r9
      bbba36:	4c 89 04 90          	mov    QWORD PTR [rax+rdx*4],r8
      bbba3a:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=177 AP=0x186ba98
- +0x68=0xbbbc62; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12303458, 12303506)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=177 AP=0x1811228
- +0x68=0xbbba7f; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302975, 12303023)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbbb0d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303117, 12303161)
### +0x68
      bbba7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba82:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba86:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba8a:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba8d:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbba90:	48 83 c0 06          	add    rax,0x6
      bbba94:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba97:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba9a:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbba9d:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbaa1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbaa4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbaa8:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbbaab:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbbaae:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbbb0d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb10:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb14:	48 83 c0 02          	add    rax,0x2
      bbbb18:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb1b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb1e:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbbb22:	48 8b 74 88 08       	mov    rsi,QWORD PTR [rax+rcx*4+0x8]
      bbbb27:	48 8d 3c 16          	lea    rdi,[rsi+rdx*1]
      bbbb2b:	48 21 d6             	and    rsi,rdx
      bbbb2e:	48 01 f6             	add    rsi,rsi
      bbbb31:	48 29 f7             	sub    rdi,rsi
      bbbb34:	48 89 3c 88          	mov    QWORD PTR [rax+rcx*4],rdi
      bbbb38:	c3                   	ret

## score=177 AP=0x1811020
- +0x68=0xbbb704; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302084, 12302134)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb783; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302211, 12302269)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb7bd; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302269, 12302294)
### +0x68
      bbb704:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb707:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb70b:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb70f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb712:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
      bbb716:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb71a:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb71d:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb721:	48 83 c0 08          	add    rax,0x8
      bbb725:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb728:	0f af 56 10          	imul   edx,DWORD PTR [rsi+0x10]
      bbb72c:	44 01 c2             	add    edx,r8d
      bbb72f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb732:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb735:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb7bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb7c0:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb7c4:	48 83 c0 02          	add    rax,0x2
      bbb7c8:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb7cb:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7ce:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb7d2:	21 14 88             	and    DWORD PTR [rax+rcx*4],edx
      bbb7d5:	c3                   	ret

## score=177 AP=0x1810f68
- +0x68=0xbbb5e3; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301795, 12301848)
- +0x98=0xbbb618; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301848, 12301891)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5e6:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5ea:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5ee:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5f1:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5f4:	4c 8d 40 06          	lea    r8,[rax+0x6]
      bbb5f8:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb5fb:	4c 8b 40 06          	mov    r8,QWORD PTR [rax+0x6]
      bbb5ff:	48 83 c0 0e          	add    rax,0xe
      bbb603:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb606:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb609:	48 0f af c2          	imul   rax,rdx
      bbb60d:	4c 01 c0             	add    rax,r8
      bbb610:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb613:	48 89 04 8a          	mov    QWORD PTR [rdx+rcx*4],rax
      bbb617:	c3                   	ret
### +0x98 head
      bbb618:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb61b:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb61f:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb623:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb626:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb629:	48 83 c0 06          	add    rax,0x6
      bbb62d:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb630:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb633:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb636:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb63a:	48 63 14 3a          	movsxd rdx,DWORD PTR [rdx+rdi*1]
      bbb63e:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb642:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=177 AP=0x1810f58
- +0x68=0xbbb5b1; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301745, 12301795)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xc0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
### +0x68
      bbb5b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5b4:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5b8:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5bc:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5bf:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5c2:	48 83 c0 06          	add    rax,0x6
      bbb5c6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb5c9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5cc:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb5cf:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb5d3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5d6:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb5da:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb5de:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb5e2:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xc0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret

## score=177 AP=0x1810be8
- +0x68=0xbbbc62; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12303458, 12303506)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbbc62:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbc65:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbc69:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbbc6d:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbbc70:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbbc73:	48 83 c0 06          	add    rax,0x6
      bbbc77:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbc7a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc7d:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbbc80:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbc84:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbc87:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbc8b:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbbc8e:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbbc91:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=177 AP=0x1810a28
- +0x68=0xbbba7f; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302975, 12303023)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbbcd0; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303568, 12303612)
### +0x68
      bbba7f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbba82:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbba86:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbba8a:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbba8d:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbba90:	48 83 c0 06          	add    rax,0x6
      bbba94:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbba97:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbba9a:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbba9d:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbbaa1:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbaa4:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbbaa8:	8b 14 3a             	mov    edx,DWORD PTR [rdx+rdi*1]
      bbbaab:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbbaae:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbbcd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbcd3:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbcd7:	48 83 c0 02          	add    rax,0x2
      bbbcdb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbcde:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbce1:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbbce5:	48 8b 74 88 08       	mov    rsi,QWORD PTR [rax+rcx*4+0x8]
      bbbcea:	48 8d 3c 32          	lea    rdi,[rdx+rsi*1]
      bbbcee:	48 21 f2             	and    rdx,rsi
      bbbcf1:	48 01 d2             	add    rdx,rdx
      bbbcf4:	48 29 d7             	sub    rdi,rdx
      bbbcf7:	48 89 3c 88          	mov    QWORD PTR [rax+rcx*4],rdi
      bbbcfb:	c3                   	ret

## score=177 AP=0x1810820
- +0x68=0xbbb704; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12302084, 12302134)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb783; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302211, 12302269)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb7bd; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302269, 12302294)
### +0x68
      bbb704:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb707:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb70b:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb70f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb712:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
      bbb716:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb71a:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb71d:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb721:	48 83 c0 08          	add    rax,0x8
      bbb725:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb728:	0f af 56 10          	imul   edx,DWORD PTR [rsi+0x10]
      bbb72c:	44 01 c2             	add    edx,r8d
      bbb72f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb732:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb735:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb783:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb786:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb78a:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb78e:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb791:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb794:	48 83 c0 06          	add    rax,0x6
      bbb798:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb79b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb79e:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb7a1:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb7a5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7a8:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb7ac:	8a 14 3a             	mov    dl,BYTE PTR [rdx+rdi*1]
      bbb7af:	88 14 88             	mov    BYTE PTR [rax+rcx*4],dl
      bbb7b2:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7b5:	0f be 14 88          	movsx  edx,BYTE PTR [rax+rcx*4]
      bbb7b9:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb7bc:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb7bd:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb7c0:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb7c4:	48 83 c0 02          	add    rax,0x2
      bbb7c8:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb7cb:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb7ce:	8b 54 88 04          	mov    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb7d2:	21 14 88             	and    DWORD PTR [rax+rcx*4],edx
      bbb7d5:	c3                   	ret

## score=177 AP=0x1810768
- +0x68=0xbbb5e3; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301795, 12301848)
- +0x98=0xbbb618; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301848, 12301891)
- +0xa0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xb8=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb5e3:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5e6:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5ea:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5ee:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5f1:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5f4:	4c 8d 40 06          	lea    r8,[rax+0x6]
      bbb5f8:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb5fb:	4c 8b 40 06          	mov    r8,QWORD PTR [rax+0x6]
      bbb5ff:	48 83 c0 0e          	add    rax,0xe
      bbb603:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb606:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb609:	48 0f af c2          	imul   rax,rdx
      bbb60d:	4c 01 c0             	add    rax,r8
      bbb610:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb613:	48 89 04 8a          	mov    QWORD PTR [rdx+rcx*4],rax
      bbb617:	c3                   	ret
### +0x98 head
      bbb618:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb61b:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb61f:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb623:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb626:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb629:	48 83 c0 06          	add    rax,0x6
      bbb62d:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb630:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb633:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb636:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb63a:	48 63 14 3a          	movsxd rdx,DWORD PTR [rdx+rdi*1]
      bbb63e:	48 89 14 88          	mov    QWORD PTR [rax+rcx*4],rdx
      bbb642:	c3                   	ret
### +0xa0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xb8 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=177 AP=0x1810758
- +0x68=0xbbb5b1; score=17; ['incoming-extra=rsi', 'stores=4']; FDE=(12301745, 12301795)
- +0x98=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb5b1:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb5b4:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb5b8:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb5bc:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb5bf:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb5c2:	48 83 c0 06          	add    rax,0x6
      bbb5c6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb5c9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5cc:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb5cf:	83 24 88 00          	and    DWORD PTR [rax+rcx*4],0x0
      bbb5d3:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb5d6:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb5da:	0f b7 14 3a          	movzx  edx,WORD PTR [rdx+rdi*1]
      bbb5de:	66 89 14 88          	mov    WORD PTR [rax+rcx*4],dx
      bbb5e2:	c3                   	ret
### +0x98 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=176 AP=0x18acee8
- +0x68=0xbbb20a; score=16; ['stores=2']; FDE=(12300810, 12300843)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb56d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301677, 12301719)
### +0x68
      bbb20a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb20d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb211:	48 83 c0 02          	add    rax,0x2
      bbb215:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb218:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb21b:	48 8b 04 8e          	mov    rax,QWORD PTR [rsi+rcx*4]
      bbb21f:	48 99                	cqo
      bbb221:	48 f7 7c 8e 08       	idiv   QWORD PTR [rsi+rcx*4+0x8]
      bbb226:	48 89 04 8e          	mov    QWORD PTR [rsi+rcx*4],rax
      bbb22a:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret

## score=176 AP=0x18acda0
- +0x68=0xbbb88b; score=16; ['stores=2']; FDE=(12302475, 12302504)
- +0x98=0xbbb6eb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302059, 12302084)
- +0xa0=0xbbb465; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301413, 12301449)
- +0xb8=0xbbbcd0; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303568, 12303612)
- +0xc0=0xbbb41c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301340, 12301376)
### +0x68
      bbb88b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb88e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb892:	48 83 c0 02          	add    rax,0x2
      bbb896:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb899:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb89c:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb89f:	99                   	cdq
      bbb8a0:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb8a4:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb8a7:	c3                   	ret
### +0x98 head
      bbb6eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb6ee:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb6f2:	48 83 c0 02          	add    rax,0x2
      bbb6f6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb6f9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb6fc:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb700:	d3 0c 90             	ror    DWORD PTR [rax+rdx*4],cl
      bbb703:	c3                   	ret
### +0xa0 head
      bbb465:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb468:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb46c:	48 83 c0 02          	add    rax,0x2
      bbb470:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb473:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb476:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb47a:	31 f6                	xor    esi,esi
      bbb47c:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb481:	40 0f 9f c6          	setg   sil
      bbb485:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb488:	c3                   	ret
### +0xb8 head
      bbbcd0:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbcd3:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbcd7:	48 83 c0 02          	add    rax,0x2
      bbbcdb:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbcde:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbce1:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbbce5:	48 8b 74 88 08       	mov    rsi,QWORD PTR [rax+rcx*4+0x8]
      bbbcea:	48 8d 3c 32          	lea    rdi,[rdx+rsi*1]
      bbbcee:	48 21 f2             	and    rdx,rsi
      bbbcf1:	48 01 d2             	add    rdx,rdx
      bbbcf4:	48 29 d7             	sub    rdi,rdx
      bbbcf7:	48 89 3c 88          	mov    QWORD PTR [rax+rcx*4],rdi
      bbbcfb:	c3                   	ret
### +0xc0 head
      bbb41c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb41f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb423:	48 83 c0 02          	add    rax,0x2
      bbb427:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb42a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb42d:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb431:	31 f6                	xor    esi,esi
      bbb433:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb438:	40 0f 9c c6          	setl   sil
      bbb43c:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb43f:	c3                   	ret

## score=176 AP=0x18ac6e8
- +0x68=0xbbb20a; score=16; ['stores=2']; FDE=(12300810, 12300843)
- +0x98=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xc0=0xbbb56d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301677, 12301719)
### +0x68
      bbb20a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb20d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb211:	48 83 c0 02          	add    rax,0x2
      bbb215:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb218:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb21b:	48 8b 04 8e          	mov    rax,QWORD PTR [rsi+rcx*4]
      bbb21f:	48 99                	cqo
      bbb221:	48 f7 7c 8e 08       	idiv   QWORD PTR [rsi+rcx*4+0x8]
      bbb226:	48 89 04 8e          	mov    QWORD PTR [rsi+rcx*4],rax
      bbb22a:	c3                   	ret
### +0x98 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xc0 head
      bbb56d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb570:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb574:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb578:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb57b:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb57e:	48 83 c0 06          	add    rax,0x6
      bbb582:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb585:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb588:	8b 3c 88             	mov    edi,DWORD PTR [rax+rcx*4]
      bbb58b:	8b 44 88 04          	mov    eax,DWORD PTR [rax+rcx*4+0x4]
      bbb58f:	48 03 7e 08          	add    rdi,QWORD PTR [rsi+0x8]
      bbb593:	89 04 3a             	mov    DWORD PTR [rdx+rdi*1],eax
      bbb596:	c3                   	ret

## score=176 AP=0x18ac5a0
- +0x68=0xbbb88b; score=16; ['stores=2']; FDE=(12302475, 12302504)
- +0x98=0xbbb6eb; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302059, 12302084)
- +0xa0=0xbbb465; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301413, 12301449)
- +0xb8=0xbbbb0d; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12303117, 12303161)
- +0xc0=0xbbb41c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301340, 12301376)
### +0x68
      bbb88b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb88e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb892:	48 83 c0 02          	add    rax,0x2
      bbb896:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb899:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb89c:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb89f:	99                   	cdq
      bbb8a0:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb8a4:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb8a7:	c3                   	ret
### +0x98 head
      bbb6eb:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb6ee:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb6f2:	48 83 c0 02          	add    rax,0x2
      bbb6f6:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb6f9:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb6fc:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb700:	d3 0c 90             	ror    DWORD PTR [rax+rdx*4],cl
      bbb703:	c3                   	ret
### +0xa0 head
      bbb465:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb468:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb46c:	48 83 c0 02          	add    rax,0x2
      bbb470:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb473:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb476:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb47a:	31 f6                	xor    esi,esi
      bbb47c:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb481:	40 0f 9f c6          	setg   sil
      bbb485:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb488:	c3                   	ret
### +0xb8 head
      bbbb0d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbbb10:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbbb14:	48 83 c0 02          	add    rax,0x2
      bbbb18:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbbb1b:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbbb1e:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbbb22:	48 8b 74 88 08       	mov    rsi,QWORD PTR [rax+rcx*4+0x8]
      bbbb27:	48 8d 3c 16          	lea    rdi,[rsi+rdx*1]
      bbbb2b:	48 21 d6             	and    rsi,rdx
      bbbb2e:	48 01 f6             	add    rsi,rsi
      bbbb31:	48 29 f7             	sub    rdi,rsi
      bbbb34:	48 89 3c 88          	mov    QWORD PTR [rax+rcx*4],rdi
      bbbb38:	c3                   	ret
### +0xc0 head
      bbb41c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb41f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb423:	48 83 c0 02          	add    rax,0x2
      bbb427:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb42a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb42d:	48 8b 14 88          	mov    rdx,QWORD PTR [rax+rcx*4]
      bbb431:	31 f6                	xor    esi,esi
      bbb433:	48 3b 54 88 08       	cmp    rdx,QWORD PTR [rax+rcx*4+0x8]
      bbb438:	40 0f 9c c6          	setl   sil
      bbb43c:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb43f:	c3                   	ret

## score=176 AP=0x186c358
- +0x68=0xbbb20a; score=16; ['stores=2']; FDE=(12300810, 12300843)
- +0x98=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xa0=0xbbb704; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302084, 12302134)
- +0xb8=0xbbb643; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301891, 12301925)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb20a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb20d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb211:	48 83 c0 02          	add    rax,0x2
      bbb215:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb218:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb21b:	48 8b 04 8e          	mov    rax,QWORD PTR [rsi+rcx*4]
      bbb21f:	48 99                	cqo
      bbb221:	48 f7 7c 8e 08       	idiv   QWORD PTR [rsi+rcx*4+0x8]
      bbb226:	48 89 04 8e          	mov    QWORD PTR [rsi+rcx*4],rax
      bbb22a:	c3                   	ret
### +0x98 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xa0 head
      bbb704:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb707:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb70b:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb70f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb712:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
      bbb716:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb71a:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb71d:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb721:	48 83 c0 08          	add    rax,0x8
      bbb725:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb728:	0f af 56 10          	imul   edx,DWORD PTR [rsi+0x10]
      bbb72c:	44 01 c2             	add    edx,r8d
      bbb72f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb732:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb735:	c3                   	ret
### +0xb8 head
      bbb643:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb646:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb64a:	48 83 c0 02          	add    rax,0x2
      bbb64e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb651:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb654:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb657:	31 f6                	xor    esi,esi
      bbb659:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb65d:	40 0f 96 c6          	setbe  sil
      bbb661:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb664:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=176 AP=0x186c1d8
- +0x68=0xbbb88b; score=16; ['stores=2']; FDE=(12302475, 12302504)
- +0x98=0xbbb244; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300868, 12300902)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
### +0x68
      bbb88b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb88e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb892:	48 83 c0 02          	add    rax,0x2
      bbb896:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb899:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb89c:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb89f:	99                   	cdq
      bbb8a0:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb8a4:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb8a7:	c3                   	ret
### +0x98 head
      bbb244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb247:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb24b:	48 83 c0 02          	add    rax,0x2
      bbb24f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb252:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb255:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb258:	31 f6                	xor    esi,esi
      bbb25a:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb25e:	40 0f 94 c6          	sete   sil
      bbb262:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb265:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret

## score=176 AP=0x186bb58
- +0x68=0xbbb20a; score=16; ['stores=2']; FDE=(12300810, 12300843)
- +0x98=0xbbb0f4; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300532, 12300556)
- +0xa0=0xbbb704; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12302084, 12302134)
- +0xb8=0xbbb643; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12301891, 12301925)
- +0xc0=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
### +0x68
      bbb20a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb20d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb211:	48 83 c0 02          	add    rax,0x2
      bbb215:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb218:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb21b:	48 8b 04 8e          	mov    rax,QWORD PTR [rsi+rcx*4]
      bbb21f:	48 99                	cqo
      bbb221:	48 f7 7c 8e 08       	idiv   QWORD PTR [rsi+rcx*4+0x8]
      bbb226:	48 89 04 8e          	mov    QWORD PTR [rsi+rcx*4],rax
      bbb22a:	c3                   	ret
### +0x98 head
      bbb0f4:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb0f7:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb0fb:	48 83 c0 02          	add    rax,0x2
      bbb0ff:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb102:	8b 46 10             	mov    eax,DWORD PTR [rsi+0x10]
      bbb105:	48 8b 16             	mov    rdx,QWORD PTR [rsi]
      bbb108:	31 04 8a             	xor    DWORD PTR [rdx+rcx*4],eax
      bbb10b:	c3                   	ret
### +0xa0 head
      bbb704:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb707:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb70b:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb70f:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb712:	0f b7 50 02          	movzx  edx,WORD PTR [rax+0x2]
      bbb716:	4c 8d 40 04          	lea    r8,[rax+0x4]
      bbb71a:	4c 89 07             	mov    QWORD PTR [rdi],r8
      bbb71d:	44 8b 40 04          	mov    r8d,DWORD PTR [rax+0x4]
      bbb721:	48 83 c0 08          	add    rax,0x8
      bbb725:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb728:	0f af 56 10          	imul   edx,DWORD PTR [rsi+0x10]
      bbb72c:	44 01 c2             	add    edx,r8d
      bbb72f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb732:	89 14 88             	mov    DWORD PTR [rax+rcx*4],edx
      bbb735:	c3                   	ret
### +0xb8 head
      bbb643:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb646:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb64a:	48 83 c0 02          	add    rax,0x2
      bbb64e:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb651:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb654:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb657:	31 f6                	xor    esi,esi
      bbb659:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb65d:	40 0f 96 c6          	setbe  sil
      bbb661:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb664:	c3                   	ret
### +0xc0 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret

## score=176 AP=0x186b9d8
- +0x68=0xbbb88b; score=16; ['stores=2']; FDE=(12302475, 12302504)
- +0x98=0xbbb244; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300868, 12300902)
- +0xa0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
- +0xb8=0xbbb121; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300577, 12300608)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb88b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb88e:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb892:	48 83 c0 02          	add    rax,0x2
      bbb896:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb899:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb89c:	8b 04 8e             	mov    eax,DWORD PTR [rsi+rcx*4]
      bbb89f:	99                   	cdq
      bbb8a0:	f7 7c 8e 04          	idiv   DWORD PTR [rsi+rcx*4+0x4]
      bbb8a4:	89 04 8e             	mov    DWORD PTR [rsi+rcx*4],eax
      bbb8a7:	c3                   	ret
### +0x98 head
      bbb244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb247:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb24b:	48 83 c0 02          	add    rax,0x2
      bbb24f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb252:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb255:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb258:	31 f6                	xor    esi,esi
      bbb25a:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb25e:	40 0f 94 c6          	sete   sil
      bbb262:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb265:	c3                   	ret
### +0xa0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret
### +0xb8 head
      bbb121:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb124:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb128:	48 8d 50 02          	lea    rdx,[rax+0x2]
      bbb12c:	48 89 17             	mov    QWORD PTR [rdi],rdx
      bbb12f:	8b 50 02             	mov    edx,DWORD PTR [rax+0x2]
      bbb132:	48 83 c0 06          	add    rax,0x6
      bbb136:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb139:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb13c:	01 14 88             	add    DWORD PTR [rax+rcx*4],edx
      bbb13f:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=176 AP=0x1810ca8
- +0x68=0xbbb20a; score=16; ['stores=2']; FDE=(12300810, 12300843)
- +0x98=0xbbb244; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300868, 12300902)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb288; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300936, 12300961)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb20a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb20d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb211:	48 83 c0 02          	add    rax,0x2
      bbb215:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb218:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb21b:	48 8b 04 8e          	mov    rax,QWORD PTR [rsi+rcx*4]
      bbb21f:	48 99                	cqo
      bbb221:	48 f7 7c 8e 08       	idiv   QWORD PTR [rsi+rcx*4+0x8]
      bbb226:	48 89 04 8e          	mov    QWORD PTR [rsi+rcx*4],rax
      bbb22a:	c3                   	ret
### +0x98 head
      bbb244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb247:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb24b:	48 83 c0 02          	add    rax,0x2
      bbb24f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb252:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb255:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb258:	31 f6                	xor    esi,esi
      bbb25a:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb25e:	40 0f 94 c6          	sete   sil
      bbb262:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb265:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb288:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb28b:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb28f:	48 83 c0 02          	add    rax,0x2
      bbb293:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb296:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb299:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb29d:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb2a0:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## score=176 AP=0x18104a8
- +0x68=0xbbb20a; score=16; ['stores=2']; FDE=(12300810, 12300843)
- +0x98=0xbbb244; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300868, 12300902)
- +0xa0=0xbbb10c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300556, 12300577)
- +0xb8=0xbbb288; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300936, 12300961)
- +0xc0=0xbbb16c; score=40; ['incoming-rsi-this', 'writes-rdi-out']; FDE=(12300652, 12300676)
### +0x68
      bbb20a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb20d:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb211:	48 83 c0 02          	add    rax,0x2
      bbb215:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb218:	48 8b 36             	mov    rsi,QWORD PTR [rsi]
      bbb21b:	48 8b 04 8e          	mov    rax,QWORD PTR [rsi+rcx*4]
      bbb21f:	48 99                	cqo
      bbb221:	48 f7 7c 8e 08       	idiv   QWORD PTR [rsi+rcx*4+0x8]
      bbb226:	48 89 04 8e          	mov    QWORD PTR [rsi+rcx*4],rax
      bbb22a:	c3                   	ret
### +0x98 head
      bbb244:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb247:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb24b:	48 83 c0 02          	add    rax,0x2
      bbb24f:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb252:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb255:	8b 14 88             	mov    edx,DWORD PTR [rax+rcx*4]
      bbb258:	31 f6                	xor    esi,esi
      bbb25a:	3b 54 88 04          	cmp    edx,DWORD PTR [rax+rcx*4+0x4]
      bbb25e:	40 0f 94 c6          	sete   sil
      bbb262:	89 34 88             	mov    DWORD PTR [rax+rcx*4],esi
      bbb265:	c3                   	ret
### +0xa0 head
      bbb10c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb10f:	48 0f bf 08          	movsx  rcx,WORD PTR [rax]
      bbb113:	48 83 c0 02          	add    rax,0x2
      bbb117:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb11a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb11d:	f7 14 88             	not    DWORD PTR [rax+rcx*4]
      bbb120:	c3                   	ret
### +0xb8 head
      bbb288:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb28b:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb28f:	48 83 c0 02          	add    rax,0x2
      bbb293:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb296:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb299:	8a 4c 90 04          	mov    cl,BYTE PTR [rax+rdx*4+0x4]
      bbb29d:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb2a0:	c3                   	ret
### +0xc0 head
      bbb16c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
      bbb16f:	48 0f bf 10          	movsx  rdx,WORD PTR [rax]
      bbb173:	48 83 c0 02          	add    rax,0x2
      bbb177:	48 89 07             	mov    QWORD PTR [rdi],rax
      bbb17a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      bbb17d:	8a 4e 10             	mov    cl,BYTE PTR [rsi+0x10]
      bbb180:	d3 04 90             	rol    DWORD PTR [rax+rdx*4],cl
      bbb183:	c3                   	ret

## Top materialization contexts
