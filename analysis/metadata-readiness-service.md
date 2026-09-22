# MetadataSetupImpl readiness service

Proven upstream:
- registry accessor b87f94 validates ID 0x55 and returns table[0x55] / +0x2a8
- provider descriptor AP 0x1825060 identifies ID 0x55 as MetadataSetupImpl
- readiness constructor caller e8c697 stores this service at rsp+0x90
- corrected ABI maps that value to argument 47, the input later installed into owner+0x428

## b87f94 exact accessor
  b87f8e:	c3                   	ret
  b87f8f:	e8 2b 20 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87f94:	53                   	push   rbx
  b87f95:	48 89 fb             	mov    rbx,rdi
  b87f98:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87f9c:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b87fa0:	6a 55                	push   0x55
  b87fa2:	5a                   	pop    rdx
  b87fa3:	e8 36 a3 fd ff       	call   b622de <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xaf27e>
  b87fa8:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  b87fab:	48 8b 80 a8 02 00 00 	mov    rax,QWORD PTR [rax+0x2a8]
  b87fb2:	48 85 c0             	test   rax,rax
  b87fb5:	74 02                	je     b87fb9 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd4f59>
  b87fb7:	5b                   	pop    rbx
  b87fb8:	c3                   	ret
  b87fb9:	e8 01 20 ef ff       	call   a79fbf <JNI_OnUnload@@Base+0x188c>
  b87fbe:	53                   	push   rbx
  b87fbf:	48 89 fb             	mov    rbx,rdi
  b87fc2:	48 8b 7f 08          	mov    rdi,QWORD PTR [rdi+0x8]
  b87fc6:	48 8b 73 10          	mov    rsi,QWORD PTR [rbx+0x10]
  b87fca:	6a 72                	push   0x72
  b87fcc:	5a                   	pop    rdx

## MetadataSetupImpl provider table
- +0x0: 0x9d7de0
- +0x8: 0xa50370
- +0x10: 0xd498b2
- +0x18: 0xd498b6
- +0x20: 0xd498c2
- +0x28: 0xd498ce
- +0x30: NO_RELOC
- +0x38: NO_RELOC

## Provider factory 0xd498ce
  d498cb:	5a                   	pop    rdx
  d498cc:	c3                   	ret
  d498cd:	cc                   	int3
  d498ce:	55                   	push   rbp
  d498cf:	41 57                	push   r15
  d498d1:	41 56                	push   r14
  d498d3:	41 55                	push   r13
  d498d5:	41 54                	push   r12
  d498d7:	53                   	push   rbx
  d498d8:	48 81 ec a8 01 00 00 	sub    rsp,0x1a8
  d498df:	48 89 d3             	mov    rbx,rdx
  d498e2:	48 89 bc 24 a0 00 00 	mov    QWORD PTR [rsp+0xa0],rdi
  d498e9:	00 
  d498ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  d498f1:	00 00 
  d498f3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
  d498fa:	00 
  d498fb:	48 89 cf             	mov    rdi,rcx
  d498fe:	e8 9d 99 e1 ff       	call   b632a0 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb0240>
  d49903:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  d49908:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  d4990c:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  d49911:	48 8b 43 60          	mov    rax,QWORD PTR [rbx+0x60]
  d49915:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  d4991a:	48 8b 83 80 00 00 00 	mov    rax,QWORD PTR [rbx+0x80]
  d49921:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d49925:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
  d4992c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4992f:	ff 50 10             	call   QWORD PTR [rax+0x10]
  d49932:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  d49939:	00 
  d4993a:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
  d4993d:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
  d49941:	6a 40                	push   0x40
  d49943:	5f                   	pop    rdi
  d49944:	e8 b7 45 aa 00       	call   17edf00 <_Znwm@plt>
  d49949:	41 8b 4e 48          	mov    ecx,DWORD PTR [r14+0x48]
  d4994d:	89 4c 24 44          	mov    DWORD PTR [rsp+0x44],ecx
  d49951:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  d49955:	48 8d 0d 44 b7 ad 00 	lea    rcx,[rip+0xadb744]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>
  d4995c:	48 89 08             	mov    QWORD PTR [rax],rcx
  d4995f:	48 8d 48 10          	lea    rcx,[rax+0x10]
  d49963:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
  d49968:	48 8d 48 18          	lea    rcx,[rax+0x18]
  d4996c:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
  d49971:	48 8d 48 20          	lea    rcx,[rax+0x20]
  d49975:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
  d4997a:	48 8d 48 28          	lea    rcx,[rax+0x28]
  d4997e:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
  d49983:	48 8d 48 30          	lea    rcx,[rax+0x30]
  d49987:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
  d4998c:	48 8d 48 38          	lea    rcx,[rax+0x38]
  d49990:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
  d49995:	0f 57 c0             	xorps  xmm0,xmm0
  d49998:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
  d4999c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  d499a0:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  d499a5:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
  d499a9:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d499ad:	48 8d 35 bc 5c 68 ff 	lea    rsi,[rip+0xffffffffff685cbc]        # 3cf670 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4c4>
  d499b4:	48 8d 0d d5 5c 68 ff 	lea    rcx,[rip+0xffffffffff685cd5]        # 3cf690 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4e4>
  d499bb:	6a 15                	push   0x15
  d499bd:	41 5e                	pop    r14
  d499bf:	6a 1d                	push   0x1d
  d499c1:	41 58                	pop    r8
  d499c3:	6a 01                	push   0x1
  d499c5:	5d                   	pop    rbp
  d499c6:	4c 89 f2             	mov    rdx,r14
  d499c9:	41 89 e9             	mov    r9d,ebp
  d499cc:	e8 8d db 89 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  d499d1:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d499d5:	48 8d 35 d4 5c 68 ff 	lea    rsi,[rip+0xffffffffff685cd4]        # 3cf6b0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x504>
  d499dc:	4c 8d 3d ed 5c 68 ff 	lea    r15,[rip+0xffffffffff685ced]        # 3cf6d0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x524>
  d499e3:	6a 1a                	push   0x1a
  d499e5:	41 58                	pop    r8
  d499e7:	4c 89 f2             	mov    rdx,r14
  d499ea:	4c 89 f9             	mov    rcx,r15
  d499ed:	41 89 e9             	mov    r9d,ebp
  d499f0:	e8 69 db 89 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  d499f5:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d499f9:	48 8d 35 f0 5c 68 ff 	lea    rsi,[rip+0xffffffffff685cf0]        # 3cf6f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x544>
  d49a00:	48 8d 0d 09 5d 68 ff 	lea    rcx,[rip+0xffffffffff685d09]        # 3cf710 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x564>
  d49a07:	6a 1c                	push   0x1c
  d49a09:	41 58                	pop    r8
  d49a0b:	4c 89 f2             	mov    rdx,r14
  d49a0e:	41 89 e9             	mov    r9d,ebp
  d49a11:	e8 48 db 89 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  d49a16:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49a1a:	48 8d 35 0f 5d 68 ff 	lea    rsi,[rip+0xffffffffff685d0f]        # 3cf730 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x584>
  d49a21:	48 8d 0d 28 5d 68 ff 	lea    rcx,[rip+0xffffffffff685d28]        # 3cf750 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x5a4>
  d49a28:	6a 27                	push   0x27
  d49a2a:	41 58                	pop    r8
  d49a2c:	4c 89 f2             	mov    rdx,r14
  d49a2f:	45 31 c9             	xor    r9d,r9d
  d49a32:	e8 27 db 89 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  d49a37:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49a3b:	4c 8d 2d 3e 5d 68 ff 	lea    r13,[rip+0xffffffffff685d3e]        # 3cf780 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x5d4>
  d49a42:	48 8d 0d 57 5d 68 ff 	lea    rcx,[rip+0xffffffffff685d57]        # 3cf7a0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x5f4>
  d49a49:	6a 29                	push   0x29
  d49a4b:	41 58                	pop    r8
  d49a4d:	4c 89 ee             	mov    rsi,r13
  d49a50:	4c 89 f2             	mov    rdx,r14
  d49a53:	45 31 c9             	xor    r9d,r9d
  d49a56:	e8 03 db 89 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  d49a5b:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49a5f:	48 8d 35 6a 5d 68 ff 	lea    rsi,[rip+0xffffffffff685d6a]        # 3cf7d0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x624>
  d49a66:	48 8d 0d 83 5d 68 ff 	lea    rcx,[rip+0xffffffffff685d83]        # 3cf7f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x644>
  d49a6d:	6a 28                	push   0x28
  d49a6f:	41 58                	pop    r8
  d49a71:	4c 89 f2             	mov    rdx,r14
  d49a74:	45 31 c9             	xor    r9d,r9d
  d49a77:	e8 e2 da 89 00       	call   15e755e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42cae2>
  d49a7c:	0f 10 83 d8 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xd8]
  d49a83:	48 8d bc 24 10 01 00 	lea    rdi,[rsp+0x110]
  d49a8a:	00 
  d49a8b:	e8 7f 7e ec ff       	call   c1190f <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15e8af>
  d49a90:	0f 10 83 d8 00 00 00 	movups xmm0,XMMWORD PTR [rbx+0xd8]
  d49a97:	48 8d bc 24 e0 00 00 	lea    rdi,[rsp+0xe0]
  d49a9e:	00 
  d49a9f:	e8 95 0f 00 00       	call   d4aa39 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17abf>
  d49aa4:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49aa8:	48 8d 35 01 5c 68 ff 	lea    rsi,[rip+0xffffffffff685c01]        # 3cf6b0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x504>
  d49aaf:	4c 89 f2             	mov    rdx,r14
  d49ab2:	4c 89 f9             	mov    rcx,r15
  d49ab5:	6a 1a                	push   0x1a
  d49ab7:	41 58                	pop    r8
  d49ab9:	41 89 e9             	mov    r9d,ebp
  d49abc:	e8 c9 d8 89 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  d49ac1:	89 c3                	mov    ebx,eax
  d49ac3:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49ac7:	48 8d 35 22 5c 68 ff 	lea    rsi,[rip+0xffffffffff685c22]        # 3cf6f0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x544>
  d49ace:	4c 89 f2             	mov    rdx,r14
  d49ad1:	48 8d 0d 38 5c 68 ff 	lea    rcx,[rip+0xffffffffff685c38]        # 3cf710 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x564>
  d49ad8:	6a 1c                	push   0x1c
  d49ada:	41 58                	pop    r8
  d49adc:	41 89 e9             	mov    r9d,ebp
  d49adf:	e8 a6 d8 89 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  d49ae4:	89 c5                	mov    ebp,eax
  d49ae6:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49aea:	48 8d 35 3f 5c 68 ff 	lea    rsi,[rip+0xffffffffff685c3f]        # 3cf730 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x584>
  d49af1:	4c 89 f2             	mov    rdx,r14
  d49af4:	48 8d 0d 55 5c 68 ff 	lea    rcx,[rip+0xffffffffff685c55]        # 3cf750 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x5a4>
  d49afb:	6a 27                	push   0x27
  d49afd:	41 58                	pop    r8
  d49aff:	45 31 c9             	xor    r9d,r9d
  d49b02:	e8 83 d8 89 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  d49b07:	41 89 c7             	mov    r15d,eax
  d49b0a:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49b0e:	4c 89 ee             	mov    rsi,r13
  d49b11:	4c 89 f2             	mov    rdx,r14
  d49b14:	48 8d 0d 85 5c 68 ff 	lea    rcx,[rip+0xffffffffff685c85]        # 3cf7a0 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x5f4>
  d49b1b:	6a 29                	push   0x29
  d49b1d:	41 58                	pop    r8
  d49b1f:	45 31 c9             	xor    r9d,r9d
  d49b22:	e8 63 d8 89 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  d49b27:	41 89 c5             	mov    r13d,eax
  d49b2a:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  d49b2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d49b32:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d49b35:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  d49b3a:	6a 28                	push   0x28
  d49b3c:	5f                   	pop    rdi
  d49b3d:	e8 be 43 aa 00       	call   17edf00 <_Znwm@plt>
  d49b42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  d49b47:	bf c0 02 00 00       	mov    edi,0x2c0
  d49b4c:	e8 af 43 aa 00       	call   17edf00 <_Znwm@plt>
  d49b51:	49 89 c6             	mov    r14,rax
  d49b54:	41 0f b6 c5          	movzx  eax,r13b
  d49b58:	c1 e0 18             	shl    eax,0x18
  d49b5b:	41 0f b6 cf          	movzx  ecx,r15b
  d49b5f:	c1 e1 10             	shl    ecx,0x10
  d49b62:	40 0f b6 d5          	movzx  edx,bpl
  d49b66:	c1 e2 08             	shl    edx,0x8
  d49b69:	0f b6 eb             	movzx  ebp,bl
  d49b6c:	09 d5                	or     ebp,edx
  d49b6e:	09 cd                	or     ebp,ecx
  d49b70:	09 c5                	or     ebp,eax
  d49b72:	48 8d 05 2f 8c b4 00 	lea    rax,[rip+0xb48c2f]        # 18927a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb480>
  d49b79:	49 89 06             	mov    QWORD PTR [r14],rax
  d49b7c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
  d49b81:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
  d49b85:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  d49b89:	41 89 6e 18          	mov    DWORD PTR [r14+0x18],ebp

## Allocations and AP materializations inside factory FDE neighborhood
### 0xd49944: call   17edf00 <_Znwm@plt>
  d49921:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d49925:	48 8b bb 98 00 00 00 	mov    rdi,QWORD PTR [rbx+0x98]
  d4992c:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4992f:	ff 50 10             	call   QWORD PTR [rax+0x10]
  d49932:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  d49939:	00 
  d4993a:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
  d4993d:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
  d49941:	6a 40                	push   0x40
  d49943:	5f                   	pop    rdi
  d49944:	e8 b7 45 aa 00       	call   17edf00 <_Znwm@plt>
  d49949:	41 8b 4e 48          	mov    ecx,DWORD PTR [r14+0x48]
  d4994d:	89 4c 24 44          	mov    DWORD PTR [rsp+0x44],ecx
  d49951:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  d49955:	48 8d 0d 44 b7 ad 00 	lea    rcx,[rip+0xadb744]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>
  d4995c:	48 89 08             	mov    QWORD PTR [rax],rcx
  d4995f:	48 8d 48 10          	lea    rcx,[rax+0x10]
  d49963:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
  d49968:	48 8d 48 18          	lea    rcx,[rax+0x18]
  d4996c:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
  d49971:	48 8d 48 20          	lea    rcx,[rax+0x20]
  d49975:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
  d4997a:	48 8d 48 28          	lea    rcx,[rax+0x28]
  d4997e:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
  d49983:	48 8d 48 30          	lea    rcx,[rax+0x30]
  d49987:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
  d4998c:	48 8d 48 38          	lea    rcx,[rax+0x38]
  d49990:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
  d49995:	0f 57 c0             	xorps  xmm0,xmm0
  d49998:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
  d4999c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  d499a0:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax

### 0xd49955: lea    rcx,[rip+0xadb744]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>
  d49932:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  d49939:	00 
  d4993a:	4c 8b 33             	mov    r14,QWORD PTR [rbx]
  d4993d:	4c 8b 63 30          	mov    r12,QWORD PTR [rbx+0x30]
  d49941:	6a 40                	push   0x40
  d49943:	5f                   	pop    rdi
  d49944:	e8 b7 45 aa 00       	call   17edf00 <_Znwm@plt>
  d49949:	41 8b 4e 48          	mov    ecx,DWORD PTR [r14+0x48]
  d4994d:	89 4c 24 44          	mov    DWORD PTR [rsp+0x44],ecx
  d49951:	c6 40 08 00          	mov    BYTE PTR [rax+0x8],0x0
  d49955:	48 8d 0d 44 b7 ad 00 	lea    rcx,[rip+0xadb744]        # 18250a0 <_ZTIN4asio2ip16bad_address_castE@@Base+0x16d0>
  d4995c:	48 89 08             	mov    QWORD PTR [rax],rcx
  d4995f:	48 8d 48 10          	lea    rcx,[rax+0x10]
  d49963:	48 89 4c 24 08       	mov    QWORD PTR [rsp+0x8],rcx
  d49968:	48 8d 48 18          	lea    rcx,[rax+0x18]
  d4996c:	48 89 4c 24 30       	mov    QWORD PTR [rsp+0x30],rcx
  d49971:	48 8d 48 20          	lea    rcx,[rax+0x20]
  d49975:	48 89 4c 24 68       	mov    QWORD PTR [rsp+0x68],rcx
  d4997a:	48 8d 48 28          	lea    rcx,[rax+0x28]
  d4997e:	48 89 4c 24 60       	mov    QWORD PTR [rsp+0x60],rcx
  d49983:	48 8d 48 30          	lea    rcx,[rax+0x30]
  d49987:	48 89 4c 24 58       	mov    QWORD PTR [rsp+0x58],rcx
  d4998c:	48 8d 48 38          	lea    rcx,[rax+0x38]
  d49990:	48 89 4c 24 50       	mov    QWORD PTR [rsp+0x50],rcx
  d49995:	0f 57 c0             	xorps  xmm0,xmm0
  d49998:	0f 11 40 30          	movups XMMWORD PTR [rax+0x30],xmm0
  d4999c:	0f 11 40 20          	movups XMMWORD PTR [rax+0x20],xmm0
  d499a0:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  d499a5:	0f 11 40 10          	movups XMMWORD PTR [rax+0x10],xmm0
  d499a9:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d499ad:	48 8d 35 bc 5c 68 ff 	lea    rsi,[rip+0xffffffffff685cbc]        # 3cf670 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4c4>
  d499b4:	48 8d 0d d5 5c 68 ff 	lea    rcx,[rip+0xffffffffff685cd5]        # 3cf690 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4e4>

### 0xd49b3d: call   17edf00 <_Znwm@plt>
  d49b1d:	41 58                	pop    r8
  d49b1f:	45 31 c9             	xor    r9d,r9d
  d49b22:	e8 63 d8 89 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  d49b27:	41 89 c5             	mov    r13d,eax
  d49b2a:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  d49b2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d49b32:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d49b35:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  d49b3a:	6a 28                	push   0x28
  d49b3c:	5f                   	pop    rdi
  d49b3d:	e8 be 43 aa 00       	call   17edf00 <_Znwm@plt>
  d49b42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  d49b47:	bf c0 02 00 00       	mov    edi,0x2c0
  d49b4c:	e8 af 43 aa 00       	call   17edf00 <_Znwm@plt>
  d49b51:	49 89 c6             	mov    r14,rax
  d49b54:	41 0f b6 c5          	movzx  eax,r13b
  d49b58:	c1 e0 18             	shl    eax,0x18
  d49b5b:	41 0f b6 cf          	movzx  ecx,r15b
  d49b5f:	c1 e1 10             	shl    ecx,0x10
  d49b62:	40 0f b6 d5          	movzx  edx,bpl
  d49b66:	c1 e2 08             	shl    edx,0x8
  d49b69:	0f b6 eb             	movzx  ebp,bl
  d49b6c:	09 d5                	or     ebp,edx
  d49b6e:	09 cd                	or     ebp,ecx
  d49b70:	09 c5                	or     ebp,eax
  d49b72:	48 8d 05 2f 8c b4 00 	lea    rax,[rip+0xb48c2f]        # 18927a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb480>
  d49b79:	49 89 06             	mov    QWORD PTR [r14],rax
  d49b7c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
  d49b81:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
  d49b85:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  d49b89:	41 89 6e 18          	mov    DWORD PTR [r14+0x18],ebp
  d49b8d:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0

### 0xd49b4c: call   17edf00 <_Znwm@plt>
  d49b27:	41 89 c5             	mov    r13d,eax
  d49b2a:	48 8b 7c 24 38       	mov    rdi,QWORD PTR [rsp+0x38]
  d49b2f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d49b32:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d49b35:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  d49b3a:	6a 28                	push   0x28
  d49b3c:	5f                   	pop    rdi
  d49b3d:	e8 be 43 aa 00       	call   17edf00 <_Znwm@plt>
  d49b42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  d49b47:	bf c0 02 00 00       	mov    edi,0x2c0
  d49b4c:	e8 af 43 aa 00       	call   17edf00 <_Znwm@plt>
  d49b51:	49 89 c6             	mov    r14,rax
  d49b54:	41 0f b6 c5          	movzx  eax,r13b
  d49b58:	c1 e0 18             	shl    eax,0x18
  d49b5b:	41 0f b6 cf          	movzx  ecx,r15b
  d49b5f:	c1 e1 10             	shl    ecx,0x10
  d49b62:	40 0f b6 d5          	movzx  edx,bpl
  d49b66:	c1 e2 08             	shl    edx,0x8
  d49b69:	0f b6 eb             	movzx  ebp,bl
  d49b6c:	09 d5                	or     ebp,edx
  d49b6e:	09 cd                	or     ebp,ecx
  d49b70:	09 c5                	or     ebp,eax
  d49b72:	48 8d 05 2f 8c b4 00 	lea    rax,[rip+0xb48c2f]        # 18927a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb480>
  d49b79:	49 89 06             	mov    QWORD PTR [r14],rax
  d49b7c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
  d49b81:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
  d49b85:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  d49b89:	41 89 6e 18          	mov    DWORD PTR [r14+0x18],ebp
  d49b8d:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
  d49b92:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  d49b99:	00 
  d49b9a:	c6 06 00             	mov    BYTE PTR [rsi],0x0

### 0xd49b72: lea    rax,[rip+0xb48c2f]        # 18927a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb480>
  d49b54:	41 0f b6 c5          	movzx  eax,r13b
  d49b58:	c1 e0 18             	shl    eax,0x18
  d49b5b:	41 0f b6 cf          	movzx  ecx,r15b
  d49b5f:	c1 e1 10             	shl    ecx,0x10
  d49b62:	40 0f b6 d5          	movzx  edx,bpl
  d49b66:	c1 e2 08             	shl    edx,0x8
  d49b69:	0f b6 eb             	movzx  ebp,bl
  d49b6c:	09 d5                	or     ebp,edx
  d49b6e:	09 cd                	or     ebp,ecx
  d49b70:	09 c5                	or     ebp,eax
  d49b72:	48 8d 05 2f 8c b4 00 	lea    rax,[rip+0xb48c2f]        # 18927a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb480>
  d49b79:	49 89 06             	mov    QWORD PTR [r14],rax
  d49b7c:	49 83 66 08 00       	and    QWORD PTR [r14+0x8],0x0
  d49b81:	48 8b 04 24          	mov    rax,QWORD PTR [rsp]
  d49b85:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  d49b89:	41 89 6e 18          	mov    DWORD PTR [r14+0x18],ebp
  d49b8d:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
  d49b92:	48 8d b4 24 b0 00 00 	lea    rsi,[rsp+0xb0]
  d49b99:	00 
  d49b9a:	c6 06 00             	mov    BYTE PTR [rsi],0x0
  d49b9d:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d49ba4:	00 
  d49ba5:	e8 32 be e1 ff       	call   b659dc <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb297c>
  d49baa:	0f 28 84 24 60 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x160]
  d49bb1:	00 
  d49bb2:	41 0f 11 46 28       	movups XMMWORD PTR [r14+0x28],xmm0
  d49bb7:	31 ff                	xor    edi,edi
  d49bb9:	e8 c8 48 d5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  d49bbe:	49 83 66 60 00       	and    QWORD PTR [r14+0x60],0x0
  d49bc3:	49 83 a6 90 00 00 00 	and    QWORD PTR [r14+0x90],0x0
  d49bca:	00 
  d49bcb:	49 83 a6 c0 00 00 00 	and    QWORD PTR [r14+0xc0],0x0

### 0xd49e52: call   17edf00 <_Znwm@plt>
  d49e2a:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  d49e2f:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  d49e32:	0f 57 c0             	xorps  xmm0,xmm0
  d49e35:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
  d49e3c:	00 
  d49e3d:	0f 29 84 24 70 01 00 	movaps XMMWORD PTR [rsp+0x170],xmm0
  d49e44:	00 
  d49e45:	0f 29 84 24 60 01 00 	movaps XMMWORD PTR [rsp+0x160],xmm0
  d49e4c:	00 
  d49e4d:	bf d0 00 00 00       	mov    edi,0xd0
  d49e52:	e8 a9 40 aa 00       	call   17edf00 <_Znwm@plt>
  d49e57:	48 89 c3             	mov    rbx,rax
  d49e5a:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
  d49e5e:	48 8d 05 1b 66 b4 00 	lea    rax,[rip+0xb4661b]        # 1890480 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9158>
  d49e65:	48 89 03             	mov    QWORD PTR [rbx],rax
  d49e68:	4c 8d 73 10          	lea    r14,[rbx+0x10]
  d49e6c:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
  d49e73:	00 
  d49e74:	4c 89 f7             	mov    rdi,r14
  d49e77:	e8 14 04 d3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d49e7c:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  d49e80:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d49e87:	00 
  d49e88:	e8 8b b2 8e 00       	call   1635118 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30286>
  d49e8d:	48 89 df             	mov    rdi,rbx
  d49e90:	48 83 c7 70          	add    rdi,0x70
  d49e94:	e8 f5 e3 dd ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  d49e99:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d49ea0:	00 
  d49ea1:	e8 26 49 d5 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
  d49ea6:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49eaa:	48 8d 35 bf 57 68 ff 	lea    rsi,[rip+0xffffffffff6857bf]        # 3cf670 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4c4>

### 0xd49e5e: lea    rax,[rip+0xb4661b]        # 1890480 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9158>
  d49e35:	0f 29 84 24 80 01 00 	movaps XMMWORD PTR [rsp+0x180],xmm0
  d49e3c:	00 
  d49e3d:	0f 29 84 24 70 01 00 	movaps XMMWORD PTR [rsp+0x170],xmm0
  d49e44:	00 
  d49e45:	0f 29 84 24 60 01 00 	movaps XMMWORD PTR [rsp+0x160],xmm0
  d49e4c:	00 
  d49e4d:	bf d0 00 00 00       	mov    edi,0xd0
  d49e52:	e8 a9 40 aa 00       	call   17edf00 <_Znwm@plt>
  d49e57:	48 89 c3             	mov    rbx,rax
  d49e5a:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
  d49e5e:	48 8d 05 1b 66 b4 00 	lea    rax,[rip+0xb4661b]        # 1890480 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9158>
  d49e65:	48 89 03             	mov    QWORD PTR [rbx],rax
  d49e68:	4c 8d 73 10          	lea    r14,[rbx+0x10]
  d49e6c:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
  d49e73:	00 
  d49e74:	4c 89 f7             	mov    rdi,r14
  d49e77:	e8 14 04 d3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d49e7c:	48 8d 7b 40          	lea    rdi,[rbx+0x40]
  d49e80:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d49e87:	00 
  d49e88:	e8 8b b2 8e 00       	call   1635118 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x30286>
  d49e8d:	48 89 df             	mov    rdi,rbx
  d49e90:	48 83 c7 70          	add    rdi,0x70
  d49e94:	e8 f5 e3 dd ff       	call   b2828e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x7522e>
  d49e99:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d49ea0:	00 
  d49ea1:	e8 26 49 d5 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
  d49ea6:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d49eaa:	48 8d 35 bf 57 68 ff 	lea    rsi,[rip+0xffffffffff6857bf]        # 3cf670 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4c4>
  d49eb1:	48 8d 0d d8 57 68 ff 	lea    rcx,[rip+0xffffffffff6857d8]        # 3cf690 <_ZN4asio9execution6detail18outstanding_work_tILi0EE7trackedE@@Base+0x4e4>
  d49eb8:	6a 15                	push   0x15
  d49eba:	41 5e                	pop    r14

### 0xd49f02: call   17edf00 <_Znwm@plt>
  d49ee4:	4c 89 f2             	mov    rdx,r14
  d49ee7:	45 31 c9             	xor    r9d,r9d
  d49eea:	e8 9b d4 89 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  d49eef:	41 89 c6             	mov    r14d,eax
  d49ef2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d49ef6:	4c 89 ef             	mov    rdi,r13
  d49ef9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d49efc:	49 89 c7             	mov    r15,rax
  d49eff:	6a 28                	push   0x28
  d49f01:	5f                   	pop    rdi
  d49f02:	e8 f9 3f aa 00       	call   17edf00 <_Znwm@plt>
  d49f07:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
  d49f0b:	48 8d 0d ae 82 b4 00 	lea    rcx,[rip+0xb482ae]        # 18921c0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xae98>
  d49f12:	48 89 08             	mov    QWORD PTR [rax],rcx
  d49f15:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  d49f19:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
  d49f1d:	40 88 68 18          	mov    BYTE PTR [rax+0x18],bpl
  d49f21:	44 88 70 19          	mov    BYTE PTR [rax+0x19],r14b
  d49f25:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
  d49f29:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
  d49f2e:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  d49f31:	48 89 01             	mov    QWORD PTR [rcx],rax
  d49f34:	48 85 ff             	test   rdi,rdi
  d49f37:	74 06                	je     d49f3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16fc5>
  d49f39:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d49f3c:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d49f3f:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d49f43:	4c 89 ef             	mov    rdi,r13
  d49f46:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
  d49f4b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d49f4e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  d49f51:	48 89 c7             	mov    rdi,rax

### 0xd49f0b: lea    rcx,[rip+0xb482ae]        # 18921c0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xae98>
  d49eea:	e8 9b d4 89 00       	call   15e738a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42c90e>
  d49eef:	41 89 c6             	mov    r14d,eax
  d49ef2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d49ef6:	4c 89 ef             	mov    rdi,r13
  d49ef9:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d49efc:	49 89 c7             	mov    r15,rax
  d49eff:	6a 28                	push   0x28
  d49f01:	5f                   	pop    rdi
  d49f02:	e8 f9 3f aa 00       	call   17edf00 <_Znwm@plt>
  d49f07:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
  d49f0b:	48 8d 0d ae 82 b4 00 	lea    rcx,[rip+0xb482ae]        # 18921c0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xae98>
  d49f12:	48 89 08             	mov    QWORD PTR [rax],rcx
  d49f15:	48 8b 0c 24          	mov    rcx,QWORD PTR [rsp]
  d49f19:	48 89 48 10          	mov    QWORD PTR [rax+0x10],rcx
  d49f1d:	40 88 68 18          	mov    BYTE PTR [rax+0x18],bpl
  d49f21:	44 88 70 19          	mov    BYTE PTR [rax+0x19],r14b
  d49f25:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
  d49f29:	48 8b 4c 24 30       	mov    rcx,QWORD PTR [rsp+0x30]
  d49f2e:	48 8b 39             	mov    rdi,QWORD PTR [rcx]
  d49f31:	48 89 01             	mov    QWORD PTR [rcx],rax
  d49f34:	48 85 ff             	test   rdi,rdi
  d49f37:	74 06                	je     d49f3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x16fc5>
  d49f39:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d49f3c:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d49f3f:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d49f43:	4c 89 ef             	mov    rdi,r13
  d49f46:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
  d49f4b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d49f4e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  d49f51:	48 89 c7             	mov    rdi,rax
  d49f54:	ff 51 50             	call   QWORD PTR [rcx+0x50]
  d49f57:	49 89 c6             	mov    r14,rax

### 0xd49f6a: call   17edf00 <_Znwm@plt>
  d49f46:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
  d49f4b:	ff 50 28             	call   QWORD PTR [rax+0x28]
  d49f4e:	48 8b 08             	mov    rcx,QWORD PTR [rax]
  d49f51:	48 89 c7             	mov    rdi,rax
  d49f54:	ff 51 50             	call   QWORD PTR [rcx+0x50]
  d49f57:	49 89 c6             	mov    r14,rax
  d49f5a:	4c 8b 23             	mov    r12,QWORD PTR [rbx]
  d49f5d:	48 8b 44 24 30       	mov    rax,QWORD PTR [rsp+0x30]
  d49f62:	4c 8b 38             	mov    r15,QWORD PTR [rax]
  d49f65:	bf b8 00 00 00       	mov    edi,0xb8
  d49f6a:	e8 91 3f aa 00       	call   17edf00 <_Znwm@plt>
  d49f6f:	48 89 c3             	mov    rbx,rax
  d49f72:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d49f79:	00 
  d49f7a:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
  d49f81:	00 
  d49f82:	e8 9f 42 ee ff       	call   c2e226 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b1c6>
  d49f87:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d49f8e:	00 
  d49f8f:	e8 62 b7 e1 ff       	call   b656f6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb2696>
  d49f94:	0f 28 84 24 40 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x140]
  d49f9b:	00 
  d49f9c:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  d49f9f:	31 ff                	xor    edi,edi
  d49fa1:	e8 e0 44 d5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  d49fa6:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  d49faa:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
  d49fae:	66 83 63 20 00       	and    WORD PTR [rbx+0x20],0x0
  d49fb3:	c7 43 24 2c 01 00 00 	mov    DWORD PTR [rbx+0x24],0x12c
  d49fba:	48 83 63 28 00       	and    QWORD PTR [rbx+0x28],0x0
  d49fbf:	c6 43 30 00          	mov    BYTE PTR [rbx+0x30],0x0
  d49fc3:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15

### 0xd4a09d: lea    rcx,[rip+0xadb054]        # 18250f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1728>
  d4a075:	49 83 27 00          	and    QWORD PTR [r15],0x0
  d4a079:	4c 8b 64 24 68       	mov    r12,QWORD PTR [rsp+0x68]
  d4a07e:	4c 89 e7             	mov    rdi,r12
  d4a081:	48 89 de             	mov    rsi,rbx
  d4a084:	e8 63 0a 00 00       	call   d4aaec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17b72>
  d4a089:	4c 89 ff             	mov    rdi,r15
  d4a08c:	e8 b1 0a 00 00       	call   d4ab42 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bc8>
  d4a091:	4d 8b 3c 24          	mov    r15,QWORD PTR [r12]
  d4a095:	48 8b 5c 24 08       	mov    rbx,QWORD PTR [rsp+0x8]
  d4a09a:	48 8b 03             	mov    rax,QWORD PTR [rbx]
  d4a09d:	48 8d 0d 54 b0 ad 00 	lea    rcx,[rip+0xadb054]        # 18250f8 <_ZTIN4asio2ip16bad_address_castE@@Base+0x1728>
  d4a0a4:	49 89 0e             	mov    QWORD PTR [r14],rcx
  d4a0a7:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
  d4a0ab:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  d4a0af:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  d4a0b2:	48 83 c7 40          	add    rdi,0x40
  d4a0b6:	4c 89 f6             	mov    rsi,r14
  d4a0b9:	e8 d6 98 db ff       	call   b03994 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x50934>
  d4a0be:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a0c5:	00 
  d4a0c6:	e8 9f fe d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a0cb:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
  d4a0ce:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  d4a0d3:	6a 70                	push   0x70
  d4a0d5:	5f                   	pop    rdi
  d4a0d6:	e8 25 3e aa 00       	call   17edf00 <_Znwm@plt>
  d4a0db:	48 89 c3             	mov    rbx,rax
  d4a0de:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a0e5:	00 
  d4a0e6:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  d4a0ed:	00 
  d4a0ee:	e8 33 41 ee ff       	call   c2e226 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b1c6>

### 0xd4a0d6: call   17edf00 <_Znwm@plt>
  d4a0b2:	48 83 c7 40          	add    rdi,0x40
  d4a0b6:	4c 89 f6             	mov    rsi,r14
  d4a0b9:	e8 d6 98 db ff       	call   b03994 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x50934>
  d4a0be:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a0c5:	00 
  d4a0c6:	e8 9f fe d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a0cb:	0f 10 03             	movups xmm0,XMMWORD PTR [rbx]
  d4a0ce:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  d4a0d3:	6a 70                	push   0x70
  d4a0d5:	5f                   	pop    rdi
  d4a0d6:	e8 25 3e aa 00       	call   17edf00 <_Znwm@plt>
  d4a0db:	48 89 c3             	mov    rbx,rax
  d4a0de:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a0e5:	00 
  d4a0e6:	48 8d b4 24 10 01 00 	lea    rsi,[rsp+0x110]
  d4a0ed:	00 
  d4a0ee:	e8 33 41 ee ff       	call   c2e226 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x17b1c6>
  d4a0f3:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  d4a0f8:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
  d4a0fb:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
  d4a0ff:	48 89 7c 24 10       	mov    QWORD PTR [rsp+0x10],rdi
  d4a104:	e8 83 0b 00 00       	call   d4ac8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17d12>
  d4a109:	4c 8b 64 24 70       	mov    r12,QWORD PTR [rsp+0x70]
  d4a10e:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
  d4a112:	48 8d 7b 20          	lea    rdi,[rbx+0x20]
  d4a116:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
  d4a11d:	00 
  d4a11e:	48 89 7c 24 28       	mov    QWORD PTR [rsp+0x28],rdi
  d4a123:	e8 7e 83 d9 ff       	call   ae24a6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f446>
  d4a128:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
  d4a12d:	4c 89 6b 40          	mov    QWORD PTR [rbx+0x40],r13
  d4a131:	4c 89 7b 48          	mov    QWORD PTR [rbx+0x48],r15

### 0xd4a271: call   17edf00 <_Znwm@plt>
  d4a24a:	00 
  d4a24b:	49 83 26 00          	and    QWORD PTR [r14],0x0
  d4a24f:	48 8b 7c 24 60       	mov    rdi,QWORD PTR [rsp+0x60]
  d4a254:	48 89 de             	mov    rsi,rbx
  d4a257:	e8 ee 08 00 00       	call   d4ab4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bd0>
  d4a25c:	4c 89 f7             	mov    rdi,r14
  d4a25f:	e8 18 09 00 00       	call   d4ab7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c02>
  d4a264:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  d4a269:	4c 8b 38             	mov    r15,QWORD PTR [rax]
  d4a26c:	bf 90 00 00 00       	mov    edi,0x90
  d4a271:	e8 8a 3c aa 00       	call   17edf00 <_Znwm@plt>
  d4a276:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
  d4a27b:	48 89 c3             	mov    rbx,rax
  d4a27e:	48 8d 05 1b 7e b4 00 	lea    rax,[rip+0xb47e1b]        # 18920a0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xad78>
  d4a285:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a288:	4c 8d 73 08          	lea    r14,[rbx+0x8]
  d4a28c:	4c 89 f7             	mov    rdi,r14
  d4a28f:	e8 fa de a8 00       	call   17d818e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3faf>
  d4a294:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15
  d4a298:	c6 43 48 00          	mov    BYTE PTR [rbx+0x48],0x0
  d4a29c:	48 83 63 4c 00       	and    QWORD PTR [rbx+0x4c],0x0
  d4a2a1:	0f 57 c0             	xorps  xmm0,xmm0
  d4a2a4:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
  d4a2a8:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
  d4a2ac:	c7 43 78 00 00 80 3f 	mov    DWORD PTR [rbx+0x78],0x3f800000
  d4a2b3:	4c 8d bb 80 00 00 00 	lea    r15,[rbx+0x80]
  d4a2ba:	4c 89 ff             	mov    rdi,r15
  d4a2bd:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
  d4a2c1:	e8 fc 73 a7 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
  d4a2c6:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  d4a2ca:	48 8d 0d 17 7e b4 00 	lea    rcx,[rip+0xb47e17]        # 18920e8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xadc0>
  d4a2d1:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx

### 0xd4a27e: lea    rax,[rip+0xb47e1b]        # 18920a0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xad78>
  d4a254:	48 89 de             	mov    rsi,rbx
  d4a257:	e8 ee 08 00 00       	call   d4ab4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17bd0>
  d4a25c:	4c 89 f7             	mov    rdi,r14
  d4a25f:	e8 18 09 00 00       	call   d4ab7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c02>
  d4a264:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  d4a269:	4c 8b 38             	mov    r15,QWORD PTR [rax]
  d4a26c:	bf 90 00 00 00       	mov    edi,0x90
  d4a271:	e8 8a 3c aa 00       	call   17edf00 <_Znwm@plt>
  d4a276:	4c 8b 6c 24 38       	mov    r13,QWORD PTR [rsp+0x38]
  d4a27b:	48 89 c3             	mov    rbx,rax
  d4a27e:	48 8d 05 1b 7e b4 00 	lea    rax,[rip+0xb47e1b]        # 18920a0 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xad78>
  d4a285:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a288:	4c 8d 73 08          	lea    r14,[rbx+0x8]
  d4a28c:	4c 89 f7             	mov    rdi,r14
  d4a28f:	e8 fa de a8 00       	call   17d818e <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x3faf>
  d4a294:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15
  d4a298:	c6 43 48 00          	mov    BYTE PTR [rbx+0x48],0x0
  d4a29c:	48 83 63 4c 00       	and    QWORD PTR [rbx+0x4c],0x0
  d4a2a1:	0f 57 c0             	xorps  xmm0,xmm0
  d4a2a4:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
  d4a2a8:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
  d4a2ac:	c7 43 78 00 00 80 3f 	mov    DWORD PTR [rbx+0x78],0x3f800000
  d4a2b3:	4c 8d bb 80 00 00 00 	lea    r15,[rbx+0x80]
  d4a2ba:	4c 89 ff             	mov    rdi,r15
  d4a2bd:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
  d4a2c1:	e8 fc 73 a7 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
  d4a2c6:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  d4a2ca:	48 8d 0d 17 7e b4 00 	lea    rcx,[rip+0xb47e17]        # 18920e8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xadc0>
  d4a2d1:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx
  d4a2d8:	00 
  d4a2d9:	48 89 9c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rbx
  d4a2e0:	00 

### 0xd4a2ca: lea    rcx,[rip+0xb47e17]        # 18920e8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xadc0>
  d4a29c:	48 83 63 4c 00       	and    QWORD PTR [rbx+0x4c],0x0
  d4a2a1:	0f 57 c0             	xorps  xmm0,xmm0
  d4a2a4:	0f 11 43 58          	movups XMMWORD PTR [rbx+0x58],xmm0
  d4a2a8:	0f 11 43 68          	movups XMMWORD PTR [rbx+0x68],xmm0
  d4a2ac:	c7 43 78 00 00 80 3f 	mov    DWORD PTR [rbx+0x78],0x3f800000
  d4a2b3:	4c 8d bb 80 00 00 00 	lea    r15,[rbx+0x80]
  d4a2ba:	4c 89 ff             	mov    rdi,r15
  d4a2bd:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
  d4a2c1:	e8 fc 73 a7 00       	call   17c16c2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17582e>
  d4a2c6:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  d4a2ca:	48 8d 0d 17 7e b4 00 	lea    rcx,[rip+0xb47e17]        # 18920e8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xadc0>
  d4a2d1:	48 89 8c 24 60 01 00 	mov    QWORD PTR [rsp+0x160],rcx
  d4a2d8:	00 
  d4a2d9:	48 89 9c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rbx
  d4a2e0:	00 
  d4a2e1:	48 89 ac 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rbp
  d4a2e8:	00 
  d4a2e9:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  d4a2ec:	48 89 ee             	mov    rsi,rbp
  d4a2ef:	e8 ac 38 8f 00       	call   163dba0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38d0e>
  d4a2f4:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]
  d4a2fb:	00 
  d4a2fc:	4c 89 e7             	mov    rdi,r12
  d4a2ff:	e8 66 fc d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a304:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  d4a308:	48 8d 0d 21 7e b4 00 	lea    rcx,[rip+0xb47e21]        # 1892130 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xae08>
  d4a30f:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
  d4a313:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
  d4a318:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
  d4a31d:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  d4a320:	4c 89 e6             	mov    rsi,r12
  d4a323:	e8 f2 39 8f 00       	call   163dd1a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38e88>

### 0xd4a308: lea    rcx,[rip+0xb47e21]        # 1892130 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xae08>
  d4a2e1:	48 89 ac 24 80 01 00 	mov    QWORD PTR [rsp+0x180],rbp
  d4a2e8:	00 
  d4a2e9:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  d4a2ec:	48 89 ee             	mov    rsi,rbp
  d4a2ef:	e8 ac 38 8f 00       	call   163dba0 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38d0e>
  d4a2f4:	4c 8d a4 24 60 01 00 	lea    r12,[rsp+0x160]
  d4a2fb:	00 
  d4a2fc:	4c 89 e7             	mov    rdi,r12
  d4a2ff:	e8 66 fc d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a304:	48 8b 43 40          	mov    rax,QWORD PTR [rbx+0x40]
  d4a308:	48 8d 0d 21 7e b4 00 	lea    rcx,[rip+0xb47e21]        # 1892130 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xae08>
  d4a30f:	49 89 0c 24          	mov    QWORD PTR [r12],rcx
  d4a313:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
  d4a318:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
  d4a31d:	48 8b 38             	mov    rdi,QWORD PTR [rax]
  d4a320:	4c 89 e6             	mov    rsi,r12
  d4a323:	e8 f2 39 8f 00       	call   163dd1a <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x38e88>
  d4a328:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a32f:	00 
  d4a330:	e8 35 fc d2 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
  d4a335:	4c 8b 7c 24 58       	mov    r15,QWORD PTR [rsp+0x58]
  d4a33a:	49 8b 3f             	mov    rdi,QWORD PTR [r15]
  d4a33d:	49 89 1f             	mov    QWORD PTR [r15],rbx
  d4a340:	48 85 ff             	test   rdi,rdi
  d4a343:	4c 8b 64 24 50       	mov    r12,QWORD PTR [rsp+0x50]
  d4a348:	74 06                	je     d4a350 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x173d6>
  d4a34a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a34d:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a350:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
  d4a355:	4c 8b 30             	mov    r14,QWORD PTR [rax]
  d4a358:	0f 57 c0             	xorps  xmm0,xmm0
  d4a35b:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]

### 0xd4a3b8: call   17edf00 <_Znwm@plt>
  d4a38e:	48 8b b4 24 a8 00 00 	mov    rsi,QWORD PTR [rsp+0xa8]
  d4a395:	00 
  d4a396:	e8 0c df d5 ff       	call   aa82a7 <JNI_OnUnload@@Base+0x2fb74>
  d4a39b:	48 8d bc 24 60 01 00 	lea    rdi,[rsp+0x160]
  d4a3a2:	00 
  d4a3a3:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
  d4a3aa:	00 
  d4a3ab:	e8 90 3b aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d4a3b0:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
  d4a3b3:	bf e0 00 00 00       	mov    edi,0xe0
  d4a3b8:	e8 43 3b aa 00       	call   17edf00 <_Znwm@plt>
  d4a3bd:	48 89 c3             	mov    rbx,rax
  d4a3c0:	4c 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r15
  d4a3c7:	00 
  d4a3c8:	48 8d 05 89 5f b4 00 	lea    rax,[rip+0xb45f89]        # 1890358 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9030>
  d4a3cf:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a3d2:	48 8d 05 cf 5f b4 00 	lea    rax,[rip+0xb45fcf]        # 18903a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9080>
  d4a3d9:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  d4a3dd:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  d4a3e1:	4c 8d 73 18          	lea    r14,[rbx+0x18]
  d4a3e5:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d4a3ec:	00 
  d4a3ed:	4c 89 f7             	mov    rdi,r14
  d4a3f0:	e8 4b 3b aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d4a3f5:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
  d4a3f9:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
  d4a400:	00 
  d4a401:	4c 89 ff             	mov    rdi,r15
  d4a404:	e8 87 fe d2 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d4a409:	48 8d 53 08          	lea    rdx,[rbx+0x8]
  d4a40d:	8b 44 24 44          	mov    eax,DWORD PTR [rsp+0x44]
  d4a411:	89 43 60             	mov    DWORD PTR [rbx+0x60],eax

### 0xd4a3c8: lea    rax,[rip+0xb45f89]        # 1890358 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9030>
  d4a3a2:	00 
  d4a3a3:	48 8d b4 24 40 01 00 	lea    rsi,[rsp+0x140]
  d4a3aa:	00 
  d4a3ab:	e8 90 3b aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d4a3b0:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
  d4a3b3:	bf e0 00 00 00       	mov    edi,0xe0
  d4a3b8:	e8 43 3b aa 00       	call   17edf00 <_Znwm@plt>
  d4a3bd:	48 89 c3             	mov    rbx,rax
  d4a3c0:	4c 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r15
  d4a3c7:	00 
  d4a3c8:	48 8d 05 89 5f b4 00 	lea    rax,[rip+0xb45f89]        # 1890358 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9030>
  d4a3cf:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a3d2:	48 8d 05 cf 5f b4 00 	lea    rax,[rip+0xb45fcf]        # 18903a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9080>
  d4a3d9:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  d4a3dd:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  d4a3e1:	4c 8d 73 18          	lea    r14,[rbx+0x18]
  d4a3e5:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d4a3ec:	00 
  d4a3ed:	4c 89 f7             	mov    rdi,r14
  d4a3f0:	e8 4b 3b aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d4a3f5:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
  d4a3f9:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
  d4a400:	00 
  d4a401:	4c 89 ff             	mov    rdi,r15
  d4a404:	e8 87 fe d2 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d4a409:	48 8d 53 08          	lea    rdx,[rbx+0x8]
  d4a40d:	8b 44 24 44          	mov    eax,DWORD PTR [rsp+0x44]
  d4a411:	89 43 60             	mov    DWORD PTR [rbx+0x60],eax
  d4a414:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  d4a418:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  d4a41f:	00 
  d4a420:	e8 2f 0f fc ff       	call   d0b354 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2582f4>

### 0xd4a3d2: lea    rax,[rip+0xb45fcf]        # 18903a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9080>
  d4a3aa:	00 
  d4a3ab:	e8 90 3b aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d4a3b0:	4d 8b 3f             	mov    r15,QWORD PTR [r15]
  d4a3b3:	bf e0 00 00 00       	mov    edi,0xe0
  d4a3b8:	e8 43 3b aa 00       	call   17edf00 <_Znwm@plt>
  d4a3bd:	48 89 c3             	mov    rbx,rax
  d4a3c0:	4c 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r15
  d4a3c7:	00 
  d4a3c8:	48 8d 05 89 5f b4 00 	lea    rax,[rip+0xb45f89]        # 1890358 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9030>
  d4a3cf:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a3d2:	48 8d 05 cf 5f b4 00 	lea    rax,[rip+0xb45fcf]        # 18903a8 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0x9080>
  d4a3d9:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  d4a3dd:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  d4a3e1:	4c 8d 73 18          	lea    r14,[rbx+0x18]
  d4a3e5:	48 8d b4 24 60 01 00 	lea    rsi,[rsp+0x160]
  d4a3ec:	00 
  d4a3ed:	4c 89 f7             	mov    rdi,r14
  d4a3f0:	e8 4b 3b aa 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
  d4a3f5:	4c 8d 7b 30          	lea    r15,[rbx+0x30]
  d4a3f9:	48 8d b4 24 e0 00 00 	lea    rsi,[rsp+0xe0]
  d4a400:	00 
  d4a401:	4c 89 ff             	mov    rdi,r15
  d4a404:	e8 87 fe d2 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
  d4a409:	48 8d 53 08          	lea    rdx,[rbx+0x8]
  d4a40d:	8b 44 24 44          	mov    eax,DWORD PTR [rsp+0x44]
  d4a411:	89 43 60             	mov    DWORD PTR [rbx+0x60],eax
  d4a414:	48 8d 7b 68          	lea    rdi,[rbx+0x68]
  d4a418:	48 8d b4 24 d8 00 00 	lea    rsi,[rsp+0xd8]
  d4a41f:	00 
  d4a420:	e8 2f 0f fc ff       	call   d0b354 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2582f4>
  d4a425:	48 8d 7b 78          	lea    rdi,[rbx+0x78]
  d4a429:	4c 8b 34 24          	mov    r14,QWORD PTR [rsp]

### 0xd4a4b9: call   17edf00 <_Znwm@plt>
  d4a490:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a497:	00 
  d4a498:	e8 f3 39 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d4a49d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
  d4a4a4:	00 
  d4a4a5:	e8 e6 39 aa 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
  d4a4aa:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d4a4ae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a4b1:	ff 50 10             	call   QWORD PTR [rax+0x10]
  d4a4b4:	bf 68 01 00 00       	mov    edi,0x168
  d4a4b9:	e8 42 3a aa 00       	call   17edf00 <_Znwm@plt>
  d4a4be:	48 89 c3             	mov    rbx,rax
  d4a4c1:	ba 68 01 00 00       	mov    edx,0x168
  d4a4c6:	48 89 c7             	mov    rdi,rax
  d4a4c9:	31 f6                	xor    esi,esi
  d4a4cb:	e8 c0 46 aa 00       	call   17eeb90 <memset@plt>
  d4a4d0:	48 8d 05 39 84 b4 00 	lea    rax,[rip+0xb48439]        # 1892910 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb5e8>
  d4a4d7:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a4da:	48 89 df             	mov    rdi,rbx
  d4a4dd:	48 83 c7 08          	add    rdi,0x8
  d4a4e1:	e8 2c fb ec ff       	call   c1a012 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x166fb2>
  d4a4e6:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
  d4a4ed:	00 00 
  d4a4ef:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
  d4a4f6:	00 
  d4a4f7:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a4fa:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d4a4fe:	6a 09                	push   0x9
  d4a500:	5e                   	pop    rsi
  d4a501:	4c 89 ef             	mov    rdi,r13
  d4a504:	ff 50 48             	call   QWORD PTR [rax+0x48]
  d4a507:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]

### 0xd4a4d0: lea    rax,[rip+0xb48439]        # 1892910 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb5e8>
  d4a4aa:	49 8b 3c 24          	mov    rdi,QWORD PTR [r12]
  d4a4ae:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a4b1:	ff 50 10             	call   QWORD PTR [rax+0x10]
  d4a4b4:	bf 68 01 00 00       	mov    edi,0x168
  d4a4b9:	e8 42 3a aa 00       	call   17edf00 <_Znwm@plt>
  d4a4be:	48 89 c3             	mov    rbx,rax
  d4a4c1:	ba 68 01 00 00       	mov    edx,0x168
  d4a4c6:	48 89 c7             	mov    rdi,rax
  d4a4c9:	31 f6                	xor    esi,esi
  d4a4cb:	e8 c0 46 aa 00       	call   17eeb90 <memset@plt>
  d4a4d0:	48 8d 05 39 84 b4 00 	lea    rax,[rip+0xb48439]        # 1892910 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb5e8>
  d4a4d7:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a4da:	48 89 df             	mov    rdi,rbx
  d4a4dd:	48 83 c7 08          	add    rdi,0x8
  d4a4e1:	e8 2c fb ec ff       	call   c1a012 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x166fb2>
  d4a4e6:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
  d4a4ed:	00 00 
  d4a4ef:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
  d4a4f6:	00 
  d4a4f7:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a4fa:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d4a4fe:	6a 09                	push   0x9
  d4a500:	5e                   	pop    rsi
  d4a501:	4c 89 ef             	mov    rdi,r13
  d4a504:	ff 50 48             	call   QWORD PTR [rax+0x48]
  d4a507:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  d4a50e:	00 
  d4a50f:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a516:	00 00 
  d4a518:	48 85 ff             	test   rdi,rdi
  d4a51b:	74 06                	je     d4a523 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175a9>
  d4a51d:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xd4a535: call   17edf00 <_Znwm@plt>
  d4a50f:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a516:	00 00 
  d4a518:	48 85 ff             	test   rdi,rdi
  d4a51b:	74 06                	je     d4a523 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x175a9>
  d4a51d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a520:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a523:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a52a:	00 
  d4a52b:	e8 54 06 00 00       	call   d4ab84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c0a>
  d4a530:	bf 60 01 00 00       	mov    edi,0x160
  d4a535:	e8 c6 39 aa 00       	call   17edf00 <_Znwm@plt>
  d4a53a:	48 89 c3             	mov    rbx,rax
  d4a53d:	ba 60 01 00 00       	mov    edx,0x160
  d4a542:	48 89 c7             	mov    rdi,rax
  d4a545:	31 f6                	xor    esi,esi
  d4a547:	e8 44 46 aa 00       	call   17eeb90 <memset@plt>
  d4a54c:	48 8d 05 e5 83 b4 00 	lea    rax,[rip+0xb483e5]        # 1892938 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb610>
  d4a553:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a556:	48 89 df             	mov    rdi,rbx
  d4a559:	48 83 c7 08          	add    rdi,0x8
  d4a55d:	e8 ec df e1 ff       	call   b6854e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54ee>
  d4a562:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
  d4a569:	00 00 
  d4a56b:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
  d4a572:	00 
  d4a573:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a576:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d4a57a:	6a 0c                	push   0xc
  d4a57c:	5e                   	pop    rsi
  d4a57d:	4c 89 ef             	mov    rdi,r13
  d4a580:	ff 50 48             	call   QWORD PTR [rax+0x48]
  d4a583:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]

### 0xd4a54c: lea    rax,[rip+0xb483e5]        # 1892938 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb610>
  d4a523:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a52a:	00 
  d4a52b:	e8 54 06 00 00       	call   d4ab84 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c0a>
  d4a530:	bf 60 01 00 00       	mov    edi,0x160
  d4a535:	e8 c6 39 aa 00       	call   17edf00 <_Znwm@plt>
  d4a53a:	48 89 c3             	mov    rbx,rax
  d4a53d:	ba 60 01 00 00       	mov    edx,0x160
  d4a542:	48 89 c7             	mov    rdi,rax
  d4a545:	31 f6                	xor    esi,esi
  d4a547:	e8 44 46 aa 00       	call   17eeb90 <memset@plt>
  d4a54c:	48 8d 05 e5 83 b4 00 	lea    rax,[rip+0xb483e5]        # 1892938 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb610>
  d4a553:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a556:	48 89 df             	mov    rdi,rbx
  d4a559:	48 83 c7 08          	add    rdi,0x8
  d4a55d:	e8 ec df e1 ff       	call   b6854e <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xb54ee>
  d4a562:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
  d4a569:	00 00 
  d4a56b:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
  d4a572:	00 
  d4a573:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a576:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d4a57a:	6a 0c                	push   0xc
  d4a57c:	5e                   	pop    rsi
  d4a57d:	4c 89 ef             	mov    rdi,r13
  d4a580:	ff 50 48             	call   QWORD PTR [rax+0x48]
  d4a583:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  d4a58a:	00 
  d4a58b:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a592:	00 00 
  d4a594:	48 85 ff             	test   rdi,rdi
  d4a597:	74 06                	je     d4a59f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17625>
  d4a599:	48 8b 07             	mov    rax,QWORD PTR [rdi]

### 0xd4a5b1: call   17edf00 <_Znwm@plt>
  d4a58b:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a592:	00 00 
  d4a594:	48 85 ff             	test   rdi,rdi
  d4a597:	74 06                	je     d4a59f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17625>
  d4a599:	48 8b 07             	mov    rax,QWORD PTR [rdi]
  d4a59c:	ff 50 08             	call   QWORD PTR [rax+0x8]
  d4a59f:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a5a6:	00 
  d4a5a7:	e8 fa 05 00 00       	call   d4aba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c2c>
  d4a5ac:	bf d8 01 00 00       	mov    edi,0x1d8
  d4a5b1:	e8 4a 39 aa 00       	call   17edf00 <_Znwm@plt>
  d4a5b6:	48 89 c3             	mov    rbx,rax
  d4a5b9:	ba d8 01 00 00       	mov    edx,0x1d8
  d4a5be:	48 89 c7             	mov    rdi,rax
  d4a5c1:	31 f6                	xor    esi,esi
  d4a5c3:	e8 c8 45 aa 00       	call   17eeb90 <memset@plt>
  d4a5c8:	48 8d 05 91 83 b4 00 	lea    rax,[rip+0xb48391]        # 1892960 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb638>
  d4a5cf:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a5d2:	48 89 df             	mov    rdi,rbx
  d4a5d5:	48 83 c7 08          	add    rdi,0x8
  d4a5d9:	e8 d6 38 ec ff       	call   c0deb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ae54>
  d4a5de:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
  d4a5e5:	00 00 
  d4a5e7:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
  d4a5ee:	00 
  d4a5ef:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a5f2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d4a5f6:	6a 0a                	push   0xa
  d4a5f8:	5e                   	pop    rsi
  d4a5f9:	4c 89 ef             	mov    rdi,r13
  d4a5fc:	ff 50 48             	call   QWORD PTR [rax+0x48]
  d4a5ff:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]

### 0xd4a5c8: lea    rax,[rip+0xb48391]        # 1892960 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb638>
  d4a59f:	48 8d bc 24 40 01 00 	lea    rdi,[rsp+0x140]
  d4a5a6:	00 
  d4a5a7:	e8 fa 05 00 00       	call   d4aba6 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17c2c>
  d4a5ac:	bf d8 01 00 00       	mov    edi,0x1d8
  d4a5b1:	e8 4a 39 aa 00       	call   17edf00 <_Znwm@plt>
  d4a5b6:	48 89 c3             	mov    rbx,rax
  d4a5b9:	ba d8 01 00 00       	mov    edx,0x1d8
  d4a5be:	48 89 c7             	mov    rdi,rax
  d4a5c1:	31 f6                	xor    esi,esi
  d4a5c3:	e8 c8 45 aa 00       	call   17eeb90 <memset@plt>
  d4a5c8:	48 8d 05 91 83 b4 00 	lea    rax,[rip+0xb48391]        # 1892960 <_ZTINSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE@@Base+0xb638>
  d4a5cf:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a5d2:	48 89 df             	mov    rdi,rbx
  d4a5d5:	48 83 c7 08          	add    rdi,0x8
  d4a5d9:	e8 d6 38 ec ff       	call   c0deb4 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x15ae54>
  d4a5de:	48 83 a4 24 40 01 00 	and    QWORD PTR [rsp+0x140],0x0
  d4a5e5:	00 00 
  d4a5e7:	48 8d 94 24 60 01 00 	lea    rdx,[rsp+0x160]
  d4a5ee:	00 
  d4a5ef:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a5f2:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  d4a5f6:	6a 0a                	push   0xa
  d4a5f8:	5e                   	pop    rsi
  d4a5f9:	4c 89 ef             	mov    rdi,r13
  d4a5fc:	ff 50 48             	call   QWORD PTR [rax+0x48]
  d4a5ff:	48 8b bc 24 60 01 00 	mov    rdi,QWORD PTR [rsp+0x160]
  d4a606:	00 
  d4a607:	48 83 a4 24 60 01 00 	and    QWORD PTR [rsp+0x160],0x0
  d4a60e:	00 00 
  d4a610:	48 85 ff             	test   rdi,rdi
  d4a613:	74 06                	je     d4a61b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x176a1>
  d4a615:	48 8b 07             	mov    rax,QWORD PTR [rdi]

## Candidate returned-object stores
  d498f3:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
  d49903:	48 89 44 24 38       	mov    QWORD PTR [rsp+0x38],rax
  d4990c:	48 89 44 24 70       	mov    QWORD PTR [rsp+0x70],rax
  d49915:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  d49921:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d49932:	48 89 84 24 a8 00 00 	mov    QWORD PTR [rsp+0xa8],rax
  d499a0:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  d49b35:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  d49b42:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  d49b79:	49 89 06             	mov    QWORD PTR [r14],rax
  d49b85:	49 89 46 10          	mov    QWORD PTR [r14+0x10],rax
  d49c17:	48 89 9c 24 98 00 00 	mov    QWORD PTR [rsp+0x98],rbx
  d49c1f:	4c 89 ac 24 90 00 00 	mov    QWORD PTR [rsp+0x90],r13
  d49db2:	4c 89 36             	mov    QWORD PTR [rsi],r14
  d49dbf:	48 89 46 10          	mov    QWORD PTR [rsi+0x10],rax
  d49dc8:	48 89 46 18          	mov    QWORD PTR [rsi+0x18],rax
  d49e26:	48 89 41 20          	mov    QWORD PTR [rcx+0x20],rax
  d49e5a:	4c 89 70 08          	mov    QWORD PTR [rax+0x8],r14
  d49e65:	48 89 03             	mov    QWORD PTR [rbx],rax
  d49f07:	48 89 58 08          	mov    QWORD PTR [rax+0x8],rbx
  d49f25:	4c 89 78 20          	mov    QWORD PTR [rax+0x20],r15
  d49f31:	48 89 01             	mov    QWORD PTR [rcx],rax
  d49fa6:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  d49faa:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
  d49fc3:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15
  d49fdf:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
  d4a059:	48 89 43 38          	mov    QWORD PTR [rbx+0x38],rax
  d4a0a7:	4d 89 7e 08          	mov    QWORD PTR [r14+0x8],r15
  d4a0ab:	4d 89 76 20          	mov    QWORD PTR [r14+0x20],r14
  d4a10e:	4c 89 63 18          	mov    QWORD PTR [rbx+0x18],r12
  d4a12d:	4c 89 6b 40          	mov    QWORD PTR [rbx+0x40],r13
  d4a131:	4c 89 7b 48          	mov    QWORD PTR [rbx+0x48],r15
  d4a158:	48 89 18             	mov    QWORD PTR [rax],rbx
  d4a1c3:	48 89 18             	mov    QWORD PTR [rax],rbx
  d4a285:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a294:	4c 89 7b 40          	mov    QWORD PTR [rbx+0x40],r15
  d4a2d9:	48 89 9c 24 68 01 00 	mov    QWORD PTR [rsp+0x168],rbx
  d4a313:	49 89 5c 24 08       	mov    QWORD PTR [r12+0x8],rbx
  d4a318:	4d 89 64 24 20       	mov    QWORD PTR [r12+0x20],r12
  d4a33d:	49 89 1f             	mov    QWORD PTR [r15],rbx
  d4a3c0:	4c 89 bc 24 d8 00 00 	mov    QWORD PTR [rsp+0xd8],r15
  d4a3cf:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a3d9:	48 89 43 08          	mov    QWORD PTR [rbx+0x8],rax
  d4a3dd:	4c 89 73 10          	mov    QWORD PTR [rbx+0x10],r14
  d4a474:	49 89 1c 24          	mov    QWORD PTR [r12],rbx
  d4a4d7:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a4f7:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a553:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a573:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a5cf:	48 89 03             	mov    QWORD PTR [rbx],rax
  d4a5ef:	48 89 1a             	mov    QWORD PTR [rdx],rbx
  d4a64f:	48 89 01             	mov    QWORD PTR [rcx],rax
  d4a67e:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a6b5:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a6ec:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a728:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a736:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a744:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a752:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a765:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a77a:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a790:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a7a3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a7e6:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a7fc:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a835:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a846:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a854:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a862:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a870:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a886:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a894:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a8a2:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a8b0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a8c0:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a949:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a94f:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a955:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a95b:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a961:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a9a3:	48 89 04 24          	mov    QWORD PTR [rsp],rax
  d4a9b4:	48 89 04 24          	mov    QWORD PTR [rsp],rax
