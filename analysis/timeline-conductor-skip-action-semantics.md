# TimelineConductor skip action semantics

Proven path:
- TimelineConductor service AP 0x1867c98
- +0x28 returns [this+0xc8]
- +0xc8 dependency AP 0x1868200
- dependency +0x68 = 0x1371d90

## Static strings in +0x68
- 0x1371db1 -> VA 0x371518: 'smartSkipEmbeddedPodcastAd'
  raw[8]=b'smartSki'
  raw[16]=b'smartSkipEmbedde'
  raw[24]=b'smartSkipEmbeddedPodcast'
  raw[26]=b'smartSkipEmbeddedPodcastAd'
  raw[30]=b'smartSkipEmbeddedPodcastAd\x00con'
  raw[32]=b'smartSkipEmbeddedPodcastAd\x00condu'
  raw[40]=b'smartSkipEmbeddedPodcastAd\x00conductor\x00Res'
  raw[64]=b'smartSkipEmbeddedPodcastAd\x00conductor\x00Resume\x00MediaResolutionTTS\x00c'
- 0x1371f88 -> VA 0x34d976: 'smart-skip-embedded-podcast-ad'
  raw[8]=b'smart-sk'
  raw[16]=b'smart-skip-embed'
  raw[24]=b'smart-skip-embedded-podc'
  raw[26]=b'smart-skip-embedded-podcas'
  raw[30]=b'smart-skip-embedded-podcast-ad'
  raw[32]=b'smart-skip-embedded-podcast-ad\x00='
  raw[40]=b'smart-skip-embedded-podcast-ad\x00==> clip:'
  raw[64]=b'smart-skip-embedded-podcast-ad\x00==> clip: %p %s\x00Stuck advancement'

## Explicit decode 0x371518
- cstr: 'smartSkipEmbeddedPodcastAd'
- raw64: b'smartSkipEmbeddedPodcastAd\x00conductor\x00Resume\x00MediaResolutionTTS\x00c'

## Explicit decode 0x34d976
- cstr: 'smart-skip-embedded-podcast-ad'
- raw64: b'smart-skip-embedded-podcast-ad\x00==> clip: %p %s\x00Stuck advancement'

## +0x68 call graph with string-bearing callees
### call 0x1371dc2 -> 0x137c2cc FDE=(20431564, 20432409)
     1371da9:	48 89 84 24 a0 01 00 	mov    QWORD PTR [rsp+0x1a0],rax
     1371db0:	00 
     1371db1:	4c 8d 35 60 f7 ff fe 	lea    r14,[rip+0xfffffffffefff760]        # 371518 <_ZTSSt12bad_any_cast@@Base-0x1ecb0>
     1371db8:	6a 1a                	push   0x1a
     1371dba:	41 5f                	pop    r15
     1371dbc:	4c 89 f6             	mov    rsi,r14
     1371dbf:	4c 89 fa             	mov    rdx,r15
     1371dc2:	e8 05 a5 00 00       	call   137c2cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1850>
     1371dc7:	48 8d b3 b8 09 00 00 	lea    rsi,[rbx+0x9b8]
     1371dce:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1371dd3:	4c 89 f2             	mov    rdx,r14
     1371dd6:	4c 89 f9             	mov    rcx,r15
     1371dd9:	e8 b2 0f 01 00       	call   1382d90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c8314>
     1371dde:	48 8b b3 40 02 00 00 	mov    rsi,QWORD PTR [rbx+0x240]
     1371de5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1371de8:	4c 8d b4 24 88 00 00 	lea    r14,[rsp+0x88]
     1371def:	00 
     1371df0:	4c 89 f7             	mov    rdi,r14
     1371df3:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
- callee strings: ' -> ' | 'Conductor observer callbacks must not synchronously mutate the Conductor' | 'Conductor observer contract violation: %.*s: %.*s' | ': ' | 'observer_contract_violation'

### call 0x1371dd9 -> 0x1382d90 FDE=(20458896, 20458957)
     1371dbc:	4c 89 f6             	mov    rsi,r14
     1371dbf:	4c 89 fa             	mov    rdx,r15
     1371dc2:	e8 05 a5 00 00       	call   137c2cc <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c1850>
     1371dc7:	48 8d b3 b8 09 00 00 	lea    rsi,[rbx+0x9b8]
     1371dce:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     1371dd3:	4c 89 f2             	mov    rdx,r14
     1371dd6:	4c 89 f9             	mov    rcx,r15
     1371dd9:	e8 b2 0f 01 00       	call   1382d90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c8314>
     1371dde:	48 8b b3 40 02 00 00 	mov    rsi,QWORD PTR [rbx+0x240]
     1371de5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1371de8:	4c 8d b4 24 88 00 00 	lea    r14,[rsp+0x88]
     1371def:	00 
     1371df0:	4c 89 f7             	mov    rdi,r14
     1371df3:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     1371df9:	4d 8b 7e 10          	mov    r15,QWORD PTR [r14+0x10]
     1371dfd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1371e01:	e8 e0 1f 7c ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1371e06:	4d 85 ff             	test   r15,r15
     1371e09:	74 34                	je     1371e3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b73c3>

### call 0x1371e01 -> 0xb33de6 FDE=(11746790, 11746835)
     1371de5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     1371de8:	4c 8d b4 24 88 00 00 	lea    r14,[rsp+0x88]
     1371def:	00 
     1371df0:	4c 89 f7             	mov    rdi,r14
     1371df3:	ff 90 a8 00 00 00    	call   QWORD PTR [rax+0xa8]
     1371df9:	4d 8b 7e 10          	mov    r15,QWORD PTR [r14+0x10]
     1371dfd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1371e01:	e8 e0 1f 7c ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1371e06:	4d 85 ff             	test   r15,r15
     1371e09:	74 34                	je     1371e3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b73c3>
     1371e0b:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1371e10:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1371e15:	e8 fe 0f 01 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     1371e1a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1371e21:	00 00 
     1371e23:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
     1371e2a:	00 
     1371e2b:	0f 85 05 02 00 00    	jne    1372036 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b75ba>
     1371e31:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8

### call 0x1371e15 -> 0x1382e18 FDE=(20459032, 20459079)
     1371df9:	4d 8b 7e 10          	mov    r15,QWORD PTR [r14+0x10]
     1371dfd:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
     1371e01:	e8 e0 1f 7c ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     1371e06:	4d 85 ff             	test   r15,r15
     1371e09:	74 34                	je     1371e3f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b73c3>
     1371e0b:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1371e10:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1371e15:	e8 fe 0f 01 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     1371e1a:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1371e21:	00 00 
     1371e23:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
     1371e2a:	00 
     1371e2b:	0f 85 05 02 00 00    	jne    1372036 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b75ba>
     1371e31:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8
     1371e38:	5b                   	pop    rbx
     1371e39:	41 5e                	pop    r14
     1371e3b:	41 5f                	pop    r15
     1371e3d:	5d                   	pop    rbp
     1371e3e:	c3                   	ret

### call 0x1371e42 -> 0x1367944 FDE=(20347204, 20347227)
     1371e31:	48 81 c4 a8 01 00 00 	add    rsp,0x1a8
     1371e38:	5b                   	pop    rbx
     1371e39:	41 5e                	pop    r14
     1371e3b:	41 5f                	pop    r15
     1371e3d:	5d                   	pop    rbp
     1371e3e:	c3                   	ret
     1371e3f:	48 89 df             	mov    rdi,rbx
     1371e42:	e8 fd 5a ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1371e47:	49 89 c6             	mov    r14,rax
     1371e4a:	48 85 c0             	test   rax,rax
     1371e4d:	74 bc                	je     1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371e4f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e54:	4c 89 f6             	mov    rsi,r14
     1371e57:	e8 ce 1d 02 00       	call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
     1371e5c:	80 7c 24 48 00       	cmp    BYTE PTR [rsp+0x48],0x0
     1371e61:	74 5f                	je     1371ec2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7446>
     1371e63:	4c 89 f7             	mov    rdi,r14
     1371e66:	e8 73 15 02 00       	call   13933de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8962>
     1371e6b:	48 89 d1             	mov    rcx,rdx

### call 0x1371e57 -> 0x1393c2a FDE=(20528170, 20528203)
     1371e3f:	48 89 df             	mov    rdi,rbx
     1371e42:	e8 fd 5a ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1371e47:	49 89 c6             	mov    r14,rax
     1371e4a:	48 85 c0             	test   rax,rax
     1371e4d:	74 bc                	je     1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371e4f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e54:	4c 89 f6             	mov    rsi,r14
     1371e57:	e8 ce 1d 02 00       	call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
     1371e5c:	80 7c 24 48 00       	cmp    BYTE PTR [rsp+0x48],0x0
     1371e61:	74 5f                	je     1371ec2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7446>
     1371e63:	4c 89 f7             	mov    rdi,r14
     1371e66:	e8 73 15 02 00       	call   13933de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8962>
     1371e6b:	48 89 d1             	mov    rcx,rdx
     1371e6e:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
     1371e75:	48 99                	cqo
     1371e77:	48 f7 f9             	idiv   rcx
     1371e7a:	49 89 c6             	mov    r14,rax
     1371e7d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e82:	e8 af 99 70 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>

### call 0x1371e66 -> 0x13933de FDE=(20526046, 20526124)
     1371e4d:	74 bc                	je     1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371e4f:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e54:	4c 89 f6             	mov    rsi,r14
     1371e57:	e8 ce 1d 02 00       	call   1393c2a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d91ae>
     1371e5c:	80 7c 24 48 00       	cmp    BYTE PTR [rsp+0x48],0x0
     1371e61:	74 5f                	je     1371ec2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7446>
     1371e63:	4c 89 f7             	mov    rdi,r14
     1371e66:	e8 73 15 02 00       	call   13933de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8962>
     1371e6b:	48 89 d1             	mov    rcx,rdx
     1371e6e:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
     1371e75:	48 99                	cqo
     1371e77:	48 f7 f9             	idiv   rcx
     1371e7a:	49 89 c6             	mov    r14,rax
     1371e7d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e82:	e8 af 99 70 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1371e87:	4c 8d bc 24 88 00 00 	lea    r15,[rsp+0x88]
     1371e8e:	00 
     1371e8f:	4c 89 ff             	mov    rdi,r15
     1371e92:	48 89 c6             	mov    rsi,rax

### call 0x1371e82 -> 0xa7b836 FDE=(10991670, 10991695)
     1371e66:	e8 73 15 02 00       	call   13933de <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1d8962>
     1371e6b:	48 89 d1             	mov    rcx,rdx
     1371e6e:	48 69 c0 e8 03 00 00 	imul   rax,rax,0x3e8
     1371e75:	48 99                	cqo
     1371e77:	48 f7 f9             	idiv   rcx
     1371e7a:	49 89 c6             	mov    r14,rax
     1371e7d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e82:	e8 af 99 70 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1371e87:	4c 8d bc 24 88 00 00 	lea    r15,[rsp+0x88]
     1371e8e:	00 
     1371e8f:	4c 89 ff             	mov    rdi,r15
     1371e92:	48 89 c6             	mov    rsi,rax
     1371e95:	e8 8e 35 35 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1371e9a:	0f 57 c0             	xorps  xmm0,xmm0
     1371e9d:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1371ea2:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     1371ea5:	48 8b bb 08 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb08]
     1371eac:	4c 89 fe             	mov    rsi,r15
     1371eaf:	4c 89 f2             	mov    rdx,r14

### call 0x1371e95 -> 0x16c5428 FDE=(23876648, 23876671)
     1371e7a:	49 89 c6             	mov    r14,rax
     1371e7d:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371e82:	e8 af 99 70 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1371e87:	4c 8d bc 24 88 00 00 	lea    r15,[rsp+0x88]
     1371e8e:	00 
     1371e8f:	4c 89 ff             	mov    rdi,r15
     1371e92:	48 89 c6             	mov    rsi,rax
     1371e95:	e8 8e 35 35 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1371e9a:	0f 57 c0             	xorps  xmm0,xmm0
     1371e9d:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1371ea2:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     1371ea5:	48 8b bb 08 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb08]
     1371eac:	4c 89 fe             	mov    rsi,r15
     1371eaf:	4c 89 f2             	mov    rdx,r14
     1371eb2:	e8 93 fb 02 00       	call   13a1a4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6fce>
     1371eb7:	84 c0                	test   al,al
     1371eb9:	74 0f                	je     1371eca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b744e>
     1371ebb:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     1371ec0:	eb 31                	jmp    1371ef3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7477>

### call 0x1371eb2 -> 0x13a1a4a FDE=(20585034, 20585231)
     1371e95:	e8 8e 35 35 00       	call   16c5428 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x79594>
     1371e9a:	0f 57 c0             	xorps  xmm0,xmm0
     1371e9d:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
     1371ea2:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     1371ea5:	48 8b bb 08 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb08]
     1371eac:	4c 89 fe             	mov    rsi,r15
     1371eaf:	4c 89 f2             	mov    rdx,r14
     1371eb2:	e8 93 fb 02 00       	call   13a1a4a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e6fce>
     1371eb7:	84 c0                	test   al,al
     1371eb9:	74 0f                	je     1371eca <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b744e>
     1371ebb:	4c 8b 74 24 18       	mov    r14,QWORD PTR [rsp+0x18]
     1371ec0:	eb 31                	jmp    1371ef3 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7477>
     1371ec2:	40 b5 01             	mov    bpl,0x1
     1371ec5:	45 31 f6             	xor    r14d,r14d
     1371ec8:	eb 40                	jmp    1371f0a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b748e>
     1371eca:	0f 57 c0             	xorps  xmm0,xmm0
     1371ecd:	48 89 e1             	mov    rcx,rsp
     1371ed0:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     1371ed3:	48 8b bb 10 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb10]

### call 0x1371ee5 -> 0x13a392c FDE=(20592940, 20593137)
     1371eca:	0f 57 c0             	xorps  xmm0,xmm0
     1371ecd:	48 89 e1             	mov    rcx,rsp
     1371ed0:	0f 29 01             	movaps XMMWORD PTR [rcx],xmm0
     1371ed3:	48 8b bb 10 0b 00 00 	mov    rdi,QWORD PTR [rbx+0xb10]
     1371eda:	48 8d b4 24 88 00 00 	lea    rsi,[rsp+0x88]
     1371ee1:	00 
     1371ee2:	4c 89 f2             	mov    rdx,r14
     1371ee5:	e8 42 1a 03 00       	call   13a392c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1e8eb0>
     1371eea:	84 c0                	test   al,al
     1371eec:	74 09                	je     1371ef7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b747b>
     1371eee:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     1371ef3:	31 ed                	xor    ebp,ebp
     1371ef5:	eb 06                	jmp    1371efd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7481>
     1371ef7:	40 b5 01             	mov    bpl,0x1
     1371efa:	45 31 f6             	xor    r14d,r14d
     1371efd:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371f04:	00 
     1371f05:	e8 24 34 35 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1371f0a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]

### call 0x1371f05 -> 0x16c532e FDE=(23876398, 23876425)
     1371eee:	4c 8b 74 24 08       	mov    r14,QWORD PTR [rsp+0x8]
     1371ef3:	31 ed                	xor    ebp,ebp
     1371ef5:	eb 06                	jmp    1371efd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7481>
     1371ef7:	40 b5 01             	mov    bpl,0x1
     1371efa:	45 31 f6             	xor    r14d,r14d
     1371efd:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371f04:	00 
     1371f05:	e8 24 34 35 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1371f0a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371f0f:	e8 1c 4e 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1371f14:	40 84 ed             	test   bpl,bpl
     1371f17:	0f 85 ee fe ff ff    	jne    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371f1d:	6a 01                	push   0x1
     1371f1f:	41 58                	pop    r8
     1371f21:	48 89 df             	mov    rdi,rbx
     1371f24:	4c 89 f6             	mov    rsi,r14
     1371f27:	31 d2                	xor    edx,edx
     1371f29:	31 c9                	xor    ecx,ecx
     1371f2b:	e8 38 ac 00 00       	call   137cb68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c20ec>

### call 0x1371f0f -> 0xaa6d30 FDE=(11169072, 11169083)
     1371ef5:	eb 06                	jmp    1371efd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7481>
     1371ef7:	40 b5 01             	mov    bpl,0x1
     1371efa:	45 31 f6             	xor    r14d,r14d
     1371efd:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371f04:	00 
     1371f05:	e8 24 34 35 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1371f0a:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371f0f:	e8 1c 4e 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1371f14:	40 84 ed             	test   bpl,bpl
     1371f17:	0f 85 ee fe ff ff    	jne    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371f1d:	6a 01                	push   0x1
     1371f1f:	41 58                	pop    r8
     1371f21:	48 89 df             	mov    rdi,rbx
     1371f24:	4c 89 f6             	mov    rsi,r14
     1371f27:	31 d2                	xor    edx,edx
     1371f29:	31 c9                	xor    ecx,ecx
     1371f2b:	e8 38 ac 00 00       	call   137cb68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c20ec>
     1371f30:	4c 8b b3 d0 00 00 00 	mov    r14,QWORD PTR [rbx+0xd0]
     1371f37:	31 c0                	xor    eax,eax

### call 0x1371f2b -> 0x137cb68 FDE=(20433768, 20436289)
     1371f17:	0f 85 ee fe ff ff    	jne    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371f1d:	6a 01                	push   0x1
     1371f1f:	41 58                	pop    r8
     1371f21:	48 89 df             	mov    rdi,rbx
     1371f24:	4c 89 f6             	mov    rsi,r14
     1371f27:	31 d2                	xor    edx,edx
     1371f29:	31 c9                	xor    ecx,ecx
     1371f2b:	e8 38 ac 00 00       	call   137cb68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c20ec>
     1371f30:	4c 8b b3 d0 00 00 00 	mov    r14,QWORD PTR [rbx+0xd0]
     1371f37:	31 c0                	xor    eax,eax
     1371f39:	88 44 24 68          	mov    BYTE PTR [rsp+0x68],al
     1371f3d:	88 44 24 70          	mov    BYTE PTR [rsp+0x70],al
     1371f41:	88 44 24 78          	mov    BYTE PTR [rsp+0x78],al
     1371f45:	66 83 a4 24 80 00 00 	and    WORD PTR [rsp+0x80],0x0
     1371f4c:	00 00 
     1371f4e:	0f 57 c0             	xorps  xmm0,xmm0
     1371f51:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1371f56:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1371f5b:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
- callee strings: 'Seeking to position: %lldms' | 'Seeking by playing clip %s with start offset' | 'Seeking within current clip' | b'\xc3\xcc\xcc\xcc\xcc\xcc\xcc\xcc\xcc\xcc\xcc\xcc\xcc\xcc\xcc\xcc\x83\x7f\x08'

### call 0x1371f67 -> 0x1367944 FDE=(20347204, 20347227)
     1371f4c:	00 00 
     1371f4e:	0f 57 c0             	xorps  xmm0,xmm0
     1371f51:	0f 29 44 24 30       	movaps XMMWORD PTR [rsp+0x30],xmm0
     1371f56:	0f 29 44 24 40       	movaps XMMWORD PTR [rsp+0x40],xmm0
     1371f5b:	0f 29 44 24 50       	movaps XMMWORD PTR [rsp+0x50],xmm0
     1371f60:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     1371f64:	48 89 df             	mov    rdi,rbx
     1371f67:	e8 d8 59 ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1371f6c:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371f73:	00 
     1371f74:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1371f79:	48 89 c2             	mov    rdx,rax
     1371f7c:	e8 e1 06 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     1371f81:	48 81 c3 58 09 00 00 	add    rbx,0x958
     1371f88:	48 8d 15 e7 b9 fd fe 	lea    rdx,[rip+0xfffffffffefdb9e7]        # 34d976 <_ZTSSt12bad_any_cast@@Base-0x42852>
     1371f8f:	6a 1e                	push   0x1e
     1371f91:	59                   	pop    rcx
     1371f92:	4c 8d 84 24 88 00 00 	lea    r8,[rsp+0x88]
     1371f99:	00 

### call 0x1371f7c -> 0x1382662 FDE=(20457058, 20457656)
     1371f60:	88 44 24 60          	mov    BYTE PTR [rsp+0x60],al
     1371f64:	48 89 df             	mov    rdi,rbx
     1371f67:	e8 d8 59 ff ff       	call   1367944 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acec8>
     1371f6c:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371f73:	00 
     1371f74:	48 8d 74 24 30       	lea    rsi,[rsp+0x30]
     1371f79:	48 89 c2             	mov    rdx,rax
     1371f7c:	e8 e1 06 01 00       	call   1382662 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7be6>
     1371f81:	48 81 c3 58 09 00 00 	add    rbx,0x958
     1371f88:	48 8d 15 e7 b9 fd fe 	lea    rdx,[rip+0xfffffffffefdb9e7]        # 34d976 <_ZTSSt12bad_any_cast@@Base-0x42852>
     1371f8f:	6a 1e                	push   0x1e
     1371f91:	59                   	pop    rcx
     1371f92:	4c 8d 84 24 88 00 00 	lea    r8,[rsp+0x88]
     1371f99:	00 
     1371f9a:	4c 89 f7             	mov    rdi,r14
     1371f9d:	48 89 de             	mov    rsi,rbx
     1371fa0:	e8 55 06 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     1371fa5:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fac:	00 

### call 0x1371fa0 -> 0x13825fa FDE=(20456954, 20457057)
     1371f88:	48 8d 15 e7 b9 fd fe 	lea    rdx,[rip+0xfffffffffefdb9e7]        # 34d976 <_ZTSSt12bad_any_cast@@Base-0x42852>
     1371f8f:	6a 1e                	push   0x1e
     1371f91:	59                   	pop    rcx
     1371f92:	4c 8d 84 24 88 00 00 	lea    r8,[rsp+0x88]
     1371f99:	00 
     1371f9a:	4c 89 f7             	mov    rdi,r14
     1371f9d:	48 89 de             	mov    rsi,rbx
     1371fa0:	e8 55 06 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     1371fa5:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fac:	00 
     1371fad:	e8 aa 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fb2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371fb7:	e8 10 c8 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1371fbc:	e9 4a fe ff ff       	jmp    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371fc1:	eb 14                	jmp    1371fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b755b>
     1371fc3:	48 89 c3             	mov    rbx,rax
     1371fc6:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fcd:	00 
     1371fce:	e8 89 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>

### call 0x1371fad -> 0x136795c FDE=(20347228, 20347262)
     1371f92:	4c 8d 84 24 88 00 00 	lea    r8,[rsp+0x88]
     1371f99:	00 
     1371f9a:	4c 89 f7             	mov    rdi,r14
     1371f9d:	48 89 de             	mov    rsi,rbx
     1371fa0:	e8 55 06 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     1371fa5:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fac:	00 
     1371fad:	e8 aa 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fb2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371fb7:	e8 10 c8 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1371fbc:	e9 4a fe ff ff       	jmp    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371fc1:	eb 14                	jmp    1371fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b755b>
     1371fc3:	48 89 c3             	mov    rbx,rax
     1371fc6:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fcd:	00 
     1371fce:	e8 89 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fd3:	eb 26                	jmp    1371ffb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b757f>
     1371fd5:	eb 32                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1371fd7:	48 89 c3             	mov    rbx,rax

### call 0x1371fb7 -> 0xa9e7cc FDE=(11134924, 11134946)
     1371f9a:	4c 89 f7             	mov    rdi,r14
     1371f9d:	48 89 de             	mov    rsi,rbx
     1371fa0:	e8 55 06 01 00       	call   13825fa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c7b7e>
     1371fa5:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fac:	00 
     1371fad:	e8 aa 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fb2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371fb7:	e8 10 c8 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1371fbc:	e9 4a fe ff ff       	jmp    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371fc1:	eb 14                	jmp    1371fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b755b>
     1371fc3:	48 89 c3             	mov    rbx,rax
     1371fc6:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fcd:	00 
     1371fce:	e8 89 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fd3:	eb 26                	jmp    1371ffb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b757f>
     1371fd5:	eb 32                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1371fd7:	48 89 c3             	mov    rbx,rax
     1371fda:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fe1:	00 

### call 0x1371fce -> 0x136795c FDE=(20347228, 20347262)
     1371fb2:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371fb7:	e8 10 c8 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1371fbc:	e9 4a fe ff ff       	jmp    1371e0b <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b738f>
     1371fc1:	eb 14                	jmp    1371fd7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b755b>
     1371fc3:	48 89 c3             	mov    rbx,rax
     1371fc6:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fcd:	00 
     1371fce:	e8 89 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fd3:	eb 26                	jmp    1371ffb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b757f>
     1371fd5:	eb 32                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1371fd7:	48 89 c3             	mov    rbx,rax
     1371fda:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fe1:	00 
     1371fe2:	e8 47 33 35 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1371fe7:	eb 03                	jmp    1371fec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7570>
     1371fe9:	48 89 c3             	mov    rbx,rax
     1371fec:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371ff1:	e8 3a 4d 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1371ff6:	eb 14                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>

### call 0x1371fe2 -> 0x16c532e FDE=(23876398, 23876425)
     1371fcd:	00 
     1371fce:	e8 89 59 ff ff       	call   136795c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1acee0>
     1371fd3:	eb 26                	jmp    1371ffb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b757f>
     1371fd5:	eb 32                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1371fd7:	48 89 c3             	mov    rbx,rax
     1371fda:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fe1:	00 
     1371fe2:	e8 47 33 35 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1371fe7:	eb 03                	jmp    1371fec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7570>
     1371fe9:	48 89 c3             	mov    rbx,rax
     1371fec:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371ff1:	e8 3a 4d 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1371ff6:	eb 14                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1371ff8:	48 89 c3             	mov    rbx,rax
     1371ffb:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1372000:	e8 c7 c7 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1372005:	eb 05                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1372007:	eb 00                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1372009:	48 89 c3             	mov    rbx,rax

### call 0x1371ff1 -> 0xaa6d30 FDE=(11169072, 11169083)
     1371fd7:	48 89 c3             	mov    rbx,rax
     1371fda:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1371fe1:	00 
     1371fe2:	e8 47 33 35 00       	call   16c532e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7949a>
     1371fe7:	eb 03                	jmp    1371fec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7570>
     1371fe9:	48 89 c3             	mov    rbx,rax
     1371fec:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371ff1:	e8 3a 4d 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1371ff6:	eb 14                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1371ff8:	48 89 c3             	mov    rbx,rax
     1371ffb:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1372000:	e8 c7 c7 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1372005:	eb 05                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1372007:	eb 00                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1372009:	48 89 c3             	mov    rbx,rax
     137200c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1372011:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1372016:	e8 fd 0d 01 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     137201b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### call 0x1372000 -> 0xa9e7cc FDE=(11134924, 11134946)
     1371fe7:	eb 03                	jmp    1371fec <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7570>
     1371fe9:	48 89 c3             	mov    rbx,rax
     1371fec:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1371ff1:	e8 3a 4d 73 ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     1371ff6:	eb 14                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1371ff8:	48 89 c3             	mov    rbx,rax
     1371ffb:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1372000:	e8 c7 c7 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1372005:	eb 05                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1372007:	eb 00                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1372009:	48 89 c3             	mov    rbx,rax
     137200c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1372011:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1372016:	e8 fd 0d 01 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     137201b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1372022:	00 00 
     1372024:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
     137202b:	00 
     137202c:	75 08                	jne    1372036 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b75ba>

### call 0x1372016 -> 0x1382e18 FDE=(20459032, 20459079)
     1371ffb:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
     1372000:	e8 c7 c7 72 ff       	call   a9e7cc <JNI_OnUnload@@Base+0x26099>
     1372005:	eb 05                	jmp    137200c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b7590>
     1372007:	eb 00                	jmp    1372009 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b758d>
     1372009:	48 89 c3             	mov    rbx,rax
     137200c:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
     1372011:	48 8b 74 24 28       	mov    rsi,QWORD PTR [rsp+0x28]
     1372016:	e8 fd 0d 01 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     137201b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1372022:	00 00 
     1372024:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
     137202b:	00 
     137202c:	75 08                	jne    1372036 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b75ba>
     137202e:	48 89 df             	mov    rdi,rbx
     1372031:	e8 9a dc 6f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1372036:	e8 75 da 47 00       	call   17efab0 <__stack_chk_fail@plt>
     137203b:	cc                   	int3
     137203c:	f2 0f 10 0d 2c d4 01 	movsd  xmm1,QWORD PTR [rip+0xffffffffff01d42c]        # 38f470 <_ZTSSt12bad_any_cast@@Base-0xd58>
     1372043:	ff 

### call 0x1372031 -> 0xa6fcd0 FDE=(10943696, 10943824)
     1372016:	e8 fd 0d 01 00       	call   1382e18 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1c839c>
     137201b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1372022:	00 00 
     1372024:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
     137202b:	00 
     137202c:	75 08                	jne    1372036 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b75ba>
     137202e:	48 89 df             	mov    rdi,rbx
     1372031:	e8 9a dc 6f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1372036:	e8 75 da 47 00       	call   17efab0 <__stack_chk_fail@plt>
     137203b:	cc                   	int3
     137203c:	f2 0f 10 0d 2c d4 01 	movsd  xmm1,QWORD PTR [rip+0xffffffffff01d42c]        # 38f470 <_ZTSSt12bad_any_cast@@Base-0xd58>
     1372043:	ff 
     1372044:	f2 0f 59 c1          	mulsd  xmm0,xmm1
     1372048:	f2 0f 10 15 f0 ce 01 	movsd  xmm2,QWORD PTR [rip+0xffffffffff01cef0]        # 38ef40 <_ZTSSt12bad_any_cast@@Base-0x1288>
     137204f:	ff 
     1372050:	f2 0f c2 d0 01       	cmpltsd xmm2,xmm0
     1372055:	66 0f 28 da          	movapd xmm3,xmm2
     1372059:	66 0f 55 d8          	andnpd xmm3,xmm0
     137205d:	66 0f 54 d1          	andpd  xmm2,xmm1
- callee strings: 'libunwind: %s - %s\n' | '_Unwind_Resume' | "_Unwind_Resume() can't return"

### call 0x1372036 -> 0x17efab0 FDE=None
     137201b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1372022:	00 00 
     1372024:	48 3b 84 24 a0 01 00 	cmp    rax,QWORD PTR [rsp+0x1a0]
     137202b:	00 
     137202c:	75 08                	jne    1372036 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b75ba>
     137202e:	48 89 df             	mov    rdi,rbx
     1372031:	e8 9a dc 6f ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     1372036:	e8 75 da 47 00       	call   17efab0 <__stack_chk_fail@plt>
     137203b:	cc                   	int3
     137203c:	f2 0f 10 0d 2c d4 01 	movsd  xmm1,QWORD PTR [rip+0xffffffffff01d42c]        # 38f470 <_ZTSSt12bad_any_cast@@Base-0xd58>
     1372043:	ff 
     1372044:	f2 0f 59 c1          	mulsd  xmm0,xmm1
     1372048:	f2 0f 10 15 f0 ce 01 	movsd  xmm2,QWORD PTR [rip+0xffffffffff01cef0]        # 38ef40 <_ZTSSt12bad_any_cast@@Base-0x1288>
     137204f:	ff 
     1372050:	f2 0f c2 d0 01       	cmpltsd xmm2,xmm0
     1372055:	66 0f 28 da          	movapd xmm3,xmm2
     1372059:	66 0f 55 d8          	andnpd xmm3,xmm0
     137205d:	66 0f 54 d1          	andpd  xmm2,xmm1
     1372061:	66 0f 56 d3          	orpd   xmm2,xmm3

## All direct callers of 0x1371d90
## Calls through virtual +0x68 in exact Skip Ad execution reports neighborhood
### 0x11fb62b FDE=(18855408, 18855557): call   QWORD PTR [rax+0x68]
     11fb5ef:	cc                   	int3
     11fb5f0:	41 57                	push   r15
     11fb5f2:	41 56                	push   r14
     11fb5f4:	53                   	push   rbx
     11fb5f5:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     11fb5fc:	48 89 d3             	mov    rbx,rdx
     11fb5ff:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb606:	00 00 
     11fb608:	48 89 84 24 b8 00 00 	mov    QWORD PTR [rsp+0xb8],rax
     11fb60f:	00 
     11fb610:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     11fb614:	49 89 e7             	mov    r15,rsp
     11fb617:	4c 89 ff             	mov    rdi,r15
     11fb61a:	e8 43 c4 46 00       	call   1667a62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbce>
     11fb61f:	49 8b 06             	mov    rax,QWORD PTR [r14]
     11fb622:	4c 89 f7             	mov    rdi,r14
     11fb625:	4c 89 fe             	mov    rsi,r15
     11fb628:	48 89 da             	mov    rdx,rbx
     11fb62b:	ff 50 68             	call   QWORD PTR [rax+0x68]
     11fb62e:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11fb633:	e8 a0 09 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fb638:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb63f:	00 00 
     11fb641:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     11fb648:	00 
     11fb649:	75 35                	jne    11fb680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40c04>
     11fb64b:	48 81 c4 c0 00 00 00 	add    rsp,0xc0
     11fb652:	5b                   	pop    rbx
     11fb653:	41 5e                	pop    r14
     11fb655:	41 5f                	pop    r15
     11fb657:	c3                   	ret
     11fb658:	48 89 c3             	mov    rbx,rax
     11fb65b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     11fb660:	e8 73 09 47 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fb665:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fb66c:	00 00 
     11fb66e:	48 3b 84 24 b8 00 00 	cmp    rax,QWORD PTR [rsp+0xb8]
     11fb675:	00 
     11fb676:	75 08                	jne    11fb680 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x40c04>
     11fb678:	48 89 df             	mov    rdi,rbx
     11fb67b:	e8 50 46 87 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
     11fb680:	e8 2b 44 5f 00       	call   17efab0 <__stack_chk_fail@plt>
     11fb685:	cc                   	int3
     11fb686:	41 57                	push   r15
     11fb688:	41 56                	push   r14
     11fb68a:	53                   	push   rbx
     11fb68b:	48 81 ec c0 00 00 00 	sub    rsp,0xc0
     11fb692:	48 89 d3             	mov    rbx,rdx

### 0x11fd04a FDE=(18861914, 18862325): call   QWORD PTR [rax+0x68]
     11fd001:	48 83 61 20 00       	and    QWORD PTR [rcx+0x20],0x0
     11fd006:	48 8d 74 24 28       	lea    rsi,[rsp+0x28]
     11fd00b:	e8 12 7e 42 00       	call   1624e22 <_ZN4asio6detail16service_registry6createINS0_16resolver_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ff90>
     11fd010:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11fd017:	00 
     11fd018:	e8 4d cf 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11fd01d:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11fd022:	e8 09 9d 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11fd027:	4d 8b 7f 08          	mov    r15,QWORD PTR [r15+0x8]
     11fd02b:	4c 8d a4 24 98 00 00 	lea    r12,[rsp+0x98]
     11fd032:	00 
     11fd033:	4c 89 e7             	mov    rdi,r12
     11fd036:	4c 89 f6             	mov    rsi,r14
     11fd039:	e8 04 aa 46 00       	call   1667a42 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbae>
     11fd03e:	49 8b 07             	mov    rax,QWORD PTR [r15]
     11fd041:	4c 89 ff             	mov    rdi,r15
     11fd044:	4c 89 e6             	mov    rsi,r12
     11fd047:	48 89 da             	mov    rdx,rbx
     11fd04a:	ff 50 68             	call   QWORD PTR [rax+0x68]
     11fd04d:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     11fd054:	00 
     11fd055:	e8 7e ef 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fd05a:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     11fd05f:	e8 aa 2f 45 00       	call   165000e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x417a>
     11fd064:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     11fd06b:	00 00 
     11fd06d:	48 3b 84 24 80 01 00 	cmp    rax,QWORD PTR [rsp+0x180]
     11fd074:	00 
     11fd075:	75 79                	jne    11fd0f0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x42674>
     11fd077:	48 81 c4 88 01 00 00 	add    rsp,0x188
     11fd07e:	5b                   	pop    rbx
     11fd07f:	41 5c                	pop    r12
     11fd081:	41 5e                	pop    r14
     11fd083:	41 5f                	pop    r15
     11fd085:	c3                   	ret
     11fd086:	48 89 c3             	mov    rbx,rax
     11fd089:	48 8d bc 24 b0 00 00 	lea    rdi,[rsp+0xb0]
     11fd090:	00 
     11fd091:	e8 42 ef 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     11fd096:	eb 33                	jmp    11fd0cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4264f>
     11fd098:	48 89 c3             	mov    rbx,rax
     11fd09b:	48 8d bc 24 50 01 00 	lea    rdi,[rsp+0x150]
     11fd0a2:	00 
     11fd0a3:	e8 c2 ce 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     11fd0a8:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     11fd0ad:	e8 7e 9c 8a ff       	call   aa6d30 <JNI_OnUnload@@Base+0x2e5fd>
     11fd0b2:	eb 17                	jmp    11fd0cb <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4264f>
     11fd0b4:	48 89 c3             	mov    rbx,rax

### 0x1202079 FDE=(18881894, 18883288): call   QWORD PTR [rax+0x68]
     1202034:	74 19                	je     120204f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x475d3>
     1202036:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     120203d:	00 
     120203e:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1202042:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     1202049:	00 
     120204a:	e8 83 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     120204f:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     1202056:	00 
     1202057:	e8 8a 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     120205c:	45 84 e4             	test   r12b,r12b
     120205f:	74 4c                	je     12020ad <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47631>
     1202061:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     1202065:	49 8d 8f e0 00 00 00 	lea    rcx,[r15+0xe0]
     120206c:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     120206f:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     1202076:	00 
     1202077:	89 da                	mov    edx,ebx
     1202079:	ff 50 68             	call   QWORD PTR [rax+0x68]
     120207c:	48 83 bc 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],0x0
     1202083:	00 00 
     1202085:	74 19                	je     12020a0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x47624>
     1202087:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     120208e:	00 
     120208f:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     1202093:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]
     120209a:	00 
     120209b:	e8 32 79 94 ff       	call   b499d2 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x96972>
     12020a0:	48 8b bc 24 a8 00 00 	mov    rdi,QWORD PTR [rsp+0xa8]
     12020a7:	00 
     12020a8:	e8 39 1d 93 ff       	call   b33de6 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x80d86>
     12020ad:	41 80 be c4 00 00 00 	cmp    BYTE PTR [r14+0xc4],0x0
     12020b4:	00 
     12020b5:	74 4f                	je     1202106 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4768a>
     12020b7:	49 8b 77 20          	mov    rsi,QWORD PTR [r15+0x20]
     12020bb:	f3 41 0f 10 86 c0 00 	movss  xmm0,DWORD PTR [r14+0xc0]
     12020c2:	00 00 
     12020c4:	48 8b 06             	mov    rax,QWORD PTR [rsi]
     12020c7:	48 8d bc 24 a0 00 00 	lea    rdi,[rsp+0xa0]
     12020ce:	00 
     12020cf:	ff 90 80 00 00 00    	call   QWORD PTR [rax+0x80]
     12020d5:	48 83 bc 24 b0 00 00 	cmp    QWORD PTR [rsp+0xb0],0x0
     12020dc:	00 00 
     12020de:	74 19                	je     12020f9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4767d>
     12020e0:	48 8d 94 24 a8 00 00 	lea    rdx,[rsp+0xa8]
     12020e7:	00 
     12020e8:	48 8b 72 f8          	mov    rsi,QWORD PTR [rdx-0x8]
     12020ec:	48 8d bc 24 88 00 00 	lea    rdi,[rsp+0x88]

### 0x120338e FDE=(18884874, 18890725): call   QWORD PTR [rax+0x68]
     1203345:	48 8b 84 24 68 02 00 	mov    rax,QWORD PTR [rsp+0x268]
     120334c:	00 
     120334d:	48 89 46 28          	mov    QWORD PTR [rsi+0x28],rax
     1203351:	0f 11 84 24 58 02 00 	movups XMMWORD PTR [rsp+0x258],xmm0
     1203358:	00 
     1203359:	48 83 a4 24 68 02 00 	and    QWORD PTR [rsp+0x268],0x0
     1203360:	00 00 
     1203362:	0f 28 8c 24 70 02 00 	movaps xmm1,XMMWORD PTR [rsp+0x270]
     1203369:	00 
     120336a:	0f 29 4e 30          	movaps XMMWORD PTR [rsi+0x30],xmm1
     120336e:	48 8b 84 24 80 02 00 	mov    rax,QWORD PTR [rsp+0x280]
     1203375:	00 
     1203376:	48 89 46 40          	mov    QWORD PTR [rsi+0x40],rax
     120337a:	0f 29 84 24 70 02 00 	movaps XMMWORD PTR [rsp+0x270],xmm0
     1203381:	00 
     1203382:	48 83 a4 24 80 02 00 	and    QWORD PTR [rsp+0x280],0x0
     1203389:	00 00 
     120338b:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     120338e:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1203391:	48 8d bc 24 80 00 00 	lea    rdi,[rsp+0x80]
     1203398:	00 
     1203399:	e8 ca 3a 00 00       	call   1206e68 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c3ec>
     120339e:	48 8d bc 24 40 02 00 	lea    rdi,[rsp+0x240]
     12033a5:	00 
     12033a6:	e8 dd 3a 00 00       	call   1206e88 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4c40c>
     12033ab:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     12033b2:	00 
     12033b3:	48 8d b4 24 90 02 00 	lea    rsi,[rsp+0x290]
     12033ba:	00 
     12033bb:	e8 d6 d3 ff ff       	call   1200796 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45d1a>
     12033c0:	48 8b 5c 24 20       	mov    rbx,QWORD PTR [rsp+0x20]
     12033c5:	48 89 df             	mov    rdi,rbx
     12033c8:	e8 47 d3 ff ff       	call   1200714 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x45c98>
     12033cd:	48 8b 9b a0 00 00 00 	mov    rbx,QWORD PTR [rbx+0xa0]
     12033d4:	f6 84 24 60 03 00 00 	test   BYTE PTR [rsp+0x360],0x2
     12033db:	02 
     12033dc:	0f 85 c7 00 00 00    	jne    12034a9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x48a2d>
     12033e2:	48 8b 84 24 80 03 00 	mov    rax,QWORD PTR [rsp+0x380]
     12033e9:	00 
     12033ea:	48 85 c0             	test   rax,rax
     12033ed:	4c 8d 35 1c fc 79 00 	lea    r14,[rip+0x79fc1c]        # 19a3010 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x6bc58>
     12033f4:	4c 0f 45 f0          	cmovne r14,rax
     12033f8:	49 8d 7e 18          	lea    rdi,[r14+0x18]
     12033fc:	e8 c7 87 54 00       	call   174bbc8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xffd34>
     1203401:	49 83 c6 28          	add    r14,0x28
     1203405:	48 8d 3d b0 0c 18 ff 	lea    rdi,[rip+0xffffffffff180cb0]        # 3840bc <_ZTSSt12bad_any_cast@@Base-0xc10c>
     120340c:	e8 7b f6 e8 ff       	call   1092a8c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x259ea2>
     1203411:	4c 89 f7             	mov    rdi,r14

### 0x12044f2 FDE=(18891288, 18894558): call   QWORD PTR [rax+0x68]
     12044a8:	48 89 de             	mov    rsi,rbx
     12044ab:	e8 6c 53 8b ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
     12044b0:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     12044b4:	e8 cd 9f 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     12044b9:	48 8d bc 24 50 09 00 	lea    rdi,[rsp+0x950]
     12044c0:	00 
     12044c1:	e8 3a 5e ff ff       	call   11fa300 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x3f884>
     12044c6:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]
     12044cd:	00 
     12044ce:	e8 75 23 00 00       	call   1206848 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bdcc>
     12044d3:	e9 be fe ff ff       	jmp    1204396 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4991a>
     12044d8:	48 8d 35 ab 2b 14 ff 	lea    rsi,[rip+0xffffffffff142bab]        # 34708a <_ZTSSt12bad_any_cast@@Base-0x4913e>
     12044df:	48 89 df             	mov    rdi,rbx
     12044e2:	e8 68 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     12044e7:	84 c0                	test   al,al
     12044e9:	74 4b                	je     1204536 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49aba>
     12044eb:	48 8b 7d 08          	mov    rdi,QWORD PTR [rbp+0x8]
     12044ef:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12044f2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12044f5:	e8 cd 63 46 00       	call   166a8c7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1ea33>
     12044fa:	48 8d 84 24 f8 04 00 	lea    rax,[rsp+0x4f8]
     1204501:	00 
     1204502:	83 60 e8 00          	and    DWORD PTR [rax-0x18],0x0
     1204506:	48 8d 0d 43 e9 77 00 	lea    rcx,[rip+0x77e943]        # 1982e50 <_ZN5boost6system6detail18generic_cat_holderIvE8instanceE@@Base+0x4ba98>
     120450d:	48 89 48 f0          	mov    QWORD PTR [rax-0x10],rcx
     1204511:	0f 57 c0             	xorps  xmm0,xmm0
     1204514:	0f 11 00             	movups XMMWORD PTR [rax],xmm0
     1204517:	48 89 40 f8          	mov    QWORD PTR [rax-0x8],rax
     120451b:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1204520:	48 8b 78 20          	mov    rdi,QWORD PTR [rax+0x20]
     1204524:	48 8d b4 24 e0 04 00 	lea    rsi,[rsp+0x4e0]
     120452b:	00 
     120452c:	e8 5f 98 8b ff       	call   abdd90 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xad30>
     1204531:	e9 53 fe ff ff       	jmp    1204389 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4990d>
     1204536:	48 8d 35 01 84 13 ff 	lea    rsi,[rip+0xffffffffff138401]        # 33c93e <_ZTSSt12bad_any_cast@@Base-0x5388a>
     120453d:	48 89 df             	mov    rdi,rbx
     1204540:	e8 0a 73 87 ff       	call   a7b84f <JNI_OnUnload@@Base+0x311c>
     1204545:	84 c0                	test   al,al
     1204547:	74 7e                	je     12045c7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x49b4b>
     1204549:	49 89 de             	mov    r14,rbx
     120454c:	48 8d 7b 18          	lea    rdi,[rbx+0x18]
     1204550:	e8 e1 72 87 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     1204555:	48 8d 9c 24 c0 04 00 	lea    rbx,[rsp+0x4c0]
     120455c:	00 
     120455d:	48 89 df             	mov    rdi,rbx
     1204560:	48 89 c6             	mov    rsi,rax
     1204563:	e8 fd 22 00 00       	call   1206865 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4bde9>
     1204568:	48 8d bc 24 e0 04 00 	lea    rdi,[rsp+0x4e0]

### 0x1209ef2 FDE=(18914656, 18915188): call   QWORD PTR [rax+0x68]
     1209ea8:	48 8d 05 31 27 65 00 	lea    rax,[rip+0x652731]        # 185c5e0 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x18cc8>
     1209eaf:	48 8d 8c 24 80 01 00 	lea    rcx,[rsp+0x180]
     1209eb6:	00 
     1209eb7:	48 89 01             	mov    QWORD PTR [rcx],rax
     1209eba:	0f 11 41 08          	movups XMMWORD PTR [rcx+0x8],xmm0
     1209ebe:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
     1209ec2:	48 8b 44 24 08       	mov    rax,QWORD PTR [rsp+0x8]
     1209ec7:	4c 8b 68 20          	mov    r13,QWORD PTR [rax+0x20]
     1209ecb:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     1209ed2:	00 
     1209ed3:	4c 89 e6             	mov    rsi,r12
     1209ed6:	e8 87 db 45 00       	call   1667a62 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1bbce>
     1209edb:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
     1209edf:	48 8d b4 24 b8 01 00 	lea    rsi,[rsp+0x1b8]
     1209ee6:	00 
     1209ee7:	48 8d 94 24 80 01 00 	lea    rdx,[rsp+0x180]
     1209eee:	00 
     1209eef:	4c 89 ef             	mov    rdi,r13
     1209ef2:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1209ef5:	48 8d bc 24 d0 01 00 	lea    rdi,[rsp+0x1d0]
     1209efc:	00 
     1209efd:	e8 d6 20 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     1209f02:	48 8d bc 24 80 01 00 	lea    rdi,[rsp+0x180]
     1209f09:	00 
     1209f0a:	e8 5b 00 87 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
     1209f0f:	31 ff                	xor    edi,edi
     1209f11:	e8 9c 45 89 ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
     1209f16:	41 0f 10 06          	movups xmm0,XMMWORD PTR [r14]
     1209f1a:	0f 57 c9             	xorps  xmm1,xmm1
     1209f1d:	41 0f 11 0e          	movups XMMWORD PTR [r14],xmm1
     1209f21:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
     1209f24:	31 ff                	xor    edi,edi
     1209f26:	e8 5b 45 89 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     1209f2b:	48 8d 7c 24 28       	lea    rdi,[rsp+0x28]
     1209f30:	e8 a3 20 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     1209f35:	4c 89 ff             	mov    rdi,r15
     1209f38:	e8 9b 20 46 00       	call   166bfd8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x20144>
     1209f3d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     1209f44:	00 00 
     1209f46:	48 3b 84 24 70 02 00 	cmp    rax,QWORD PTR [rsp+0x270]
     1209f4d:	00 
     1209f4e:	75 15                	jne    1209f65 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x4f4e9>
     1209f50:	48 89 d8             	mov    rax,rbx
     1209f53:	48 81 c4 78 02 00 00 	add    rsp,0x278
     1209f5a:	5b                   	pop    rbx
     1209f5b:	41 5c                	pop    r12
     1209f5d:	41 5d                	pop    r13
     1209f5f:	41 5e                	pop    r14

### 0x12186f1 FDE=(18974394, 18974573): call   QWORD PTR [rax+0x68]
     12186ae:	48 89 c3             	mov    rbx,rax
     12186b1:	48 89 df             	mov    rdi,rbx
     12186b4:	e8 ec 13 86 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     12186b9:	cc                   	int3
     12186ba:	41 56                	push   r14
     12186bc:	53                   	push   rbx
     12186bd:	48 83 ec 28          	sub    rsp,0x28
     12186c1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     12186c8:	00 00 
     12186ca:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
     12186cf:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12186d2:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
     12186d7:	ff 80 04 11 00 00    	inc    DWORD PTR [rax+0x1104]
     12186dd:	0f ba e6 1b          	bt     esi,0x1b
     12186e1:	73 5b                	jae    121873e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dcc2>
     12186e3:	4c 8b 77 08          	mov    r14,QWORD PTR [rdi+0x8]
     12186e7:	49 8b be 50 09 00 00 	mov    rdi,QWORD PTR [r14+0x950]
     12186ee:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12186f1:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12186f4:	48 89 c3             	mov    rbx,rax
     12186f7:	8b 78 04             	mov    edi,DWORD PTR [rax+0x4]
     12186fa:	e8 49 63 89 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     12186ff:	48 8d 44 24 17       	lea    rax,[rsp+0x17]
     1218704:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
     1218709:	48 89 07             	mov    QWORD PTR [rdi],rax
     121870c:	8b 43 04             	mov    eax,DWORD PTR [rbx+0x4]
     121870f:	b9 ff ff ff ff       	mov    ecx,0xffffffff
     1218714:	48 39 c8             	cmp    rax,rcx
     1218717:	6a ff                	push   0xffffffffffffffff
     1218719:	59                   	pop    rcx
     121871a:	48 0f 45 c8          	cmovne rcx,rax
     121871e:	48 8d 05 fb 45 64 00 	lea    rax,[rip+0x6445fb]        # 185cd20 <_ZTIN5boost10wrapexceptINS_16bad_lexical_castEEE@@Base+0x19408>
     1218725:	48 89 de             	mov    rsi,rbx
     1218728:	ff 14 c8             	call   QWORD PTR [rax+rcx*8]
     121872b:	49 8b be 70 09 00 00 	mov    rdi,QWORD PTR [r14+0x970]
     1218732:	48 8b 0f             	mov    rcx,QWORD PTR [rdi]
     1218735:	0f b6 f0             	movzx  esi,al
     1218738:	ff 91 d0 00 00 00    	call   QWORD PTR [rcx+0xd0]
     121873e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     1218743:	e8 26 00 00 00       	call   121876e <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dcf2>
     1218748:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     121874f:	00 00 
     1218751:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
     1218756:	75 08                	jne    1218760 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x5dce4>
     1218758:	48 83 c4 28          	add    rsp,0x28
     121875c:	5b                   	pop    rbx
     121875d:	41 5e                	pop    r14
     121875f:	c3                   	ret

### 0x1220d09 FDE=(19006804, 19014400): call   QWORD PTR [rax+0x68]
     1220ccd:	84 c0                	test   al,al
     1220ccf:	79 03                	jns    1220cd4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x66258>
     1220cd1:	4d 89 fc             	mov    r12,r15
     1220cd4:	4c 8d b4 24 80 13 00 	lea    r14,[rsp+0x1380]
     1220cdb:	00 
     1220cdc:	4c 89 f7             	mov    rdi,r14
     1220cdf:	e8 ac d1 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1220ce4:	4d 39 fc             	cmp    r12,r15
     1220ce7:	74 0e                	je     1220cf7 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6627b>
     1220ce9:	41 83 bc 24 f4 02 00 	cmp    DWORD PTR [r12+0x2f4],0x3
     1220cf0:	00 03 
     1220cf2:	0f 94 c3             	sete   bl
     1220cf5:	eb 02                	jmp    1220cf9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6627d>
     1220cf7:	31 db                	xor    ebx,ebx
     1220cf9:	4c 8b 64 24 08       	mov    r12,QWORD PTR [rsp+0x8]
     1220cfe:	49 8b bc 24 50 09 00 	mov    rdi,QWORD PTR [r12+0x950]
     1220d05:	00 
     1220d06:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1220d09:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1220d0c:	49 89 c7             	mov    r15,rax
     1220d0f:	41 8a 84 24 86 06 00 	mov    al,BYTE PTR [r12+0x686]
     1220d16:	00 
     1220d17:	48 8d 8c 24 30 23 00 	lea    rcx,[rsp+0x2330]
     1220d1e:	00 
     1220d1f:	88 01                	mov    BYTE PTR [rcx],al
     1220d21:	48 8d 84 24 30 13 00 	lea    rax,[rsp+0x1330]
     1220d28:	00 
     1220d29:	88 18                	mov    BYTE PTR [rax],bl
     1220d2b:	48 8d 94 24 d0 10 00 	lea    rdx,[rsp+0x10d0]
     1220d32:	00 
     1220d33:	48 89 0a             	mov    QWORD PTR [rdx],rcx
     1220d36:	48 89 8c 24 88 13 00 	mov    QWORD PTR [rsp+0x1388],rcx
     1220d3d:	00 
     1220d3e:	48 89 94 24 90 13 00 	mov    QWORD PTR [rsp+0x1390],rdx
     1220d45:	00 
     1220d46:	48 89 84 24 98 13 00 	mov    QWORD PTR [rsp+0x1398],rax
     1220d4d:	00 
     1220d4e:	48 89 94 24 80 13 00 	mov    QWORD PTR [rsp+0x1380],rdx
     1220d55:	00 
     1220d56:	48 89 94 24 a0 13 00 	mov    QWORD PTR [rsp+0x13a0],rdx
     1220d5d:	00 
     1220d5e:	41 8b 7f 04          	mov    edi,DWORD PTR [r15+0x4]
     1220d62:	e8 e1 dc 88 ff       	call   aaea48 <JNI_OnUnload@@Base+0x36315>
     1220d67:	48 8d bc 24 80 23 00 	lea    rdi,[rsp+0x2380]
     1220d6e:	00 
     1220d6f:	4c 89 37             	mov    QWORD PTR [rdi],r14
     1220d72:	41 8b 47 04          	mov    eax,DWORD PTR [r15+0x4]
     1220d76:	b9 ff ff ff ff       	mov    ecx,0xffffffff

### 0x1222480 FDE=(19014422, 19016141): call   QWORD PTR [rax+0x68]
     1222432:	84 c0                	test   al,al
     1222434:	74 26                	je     122245c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x679e0>
     1222436:	48 8d b3 c0 0b 00 00 	lea    rsi,[rbx+0xbc0]
     122243d:	49 8d 7e 30          	lea    rdi,[r14+0x30]
     1222441:	e8 a8 d2 87 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     1222446:	41 8b 4e 48          	mov    ecx,DWORD PTR [r14+0x48]
     122244a:	3b 8b d8 0b 00 00    	cmp    ecx,DWORD PTR [rbx+0xbd8]
     1222450:	89 c5                	mov    ebp,eax
     1222452:	0f 95 c0             	setne  al
     1222455:	40 80 f5 01          	xor    bpl,0x1
     1222459:	40 08 c5             	or     bpl,al
     122245c:	44 89 bb b8 0b 00 00 	mov    DWORD PTR [rbx+0xbb8],r15d
     1222463:	4d 8d 7e 30          	lea    r15,[r14+0x30]
     1222467:	48 8d bb c0 0b 00 00 	lea    rdi,[rbx+0xbc0]
     122246e:	4c 89 fe             	mov    rsi,r15
     1222471:	e8 5a 0c 00 00       	call   12230d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68654>
     1222476:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     122247d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1222480:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1222483:	41 b4 01             	mov    r12b,0x1
     1222486:	83 78 04 04          	cmp    DWORD PTR [rax+0x4],0x4
     122248a:	74 28                	je     12224b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a38>
     122248c:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     1222493:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1222496:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1222499:	83 78 04 03          	cmp    DWORD PTR [rax+0x4],0x3
     122249d:	74 15                	je     12224b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a38>
     122249f:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12224a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12224a9:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12224ac:	83 78 04 02          	cmp    DWORD PTR [rax+0x4],0x2
     12224b0:	41 0f 94 c4          	sete   r12b
     12224b4:	40 84 ed             	test   bpl,bpl
     12224b7:	74 4c                	je     1222505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a89>
     12224b9:	80 bb 86 06 00 00 00 	cmp    BYTE PTR [rbx+0x686],0x0
     12224c0:	0f 95 c0             	setne  al
     12224c3:	41 f6 d4             	not    r12b
     12224c6:	41 84 c4             	test   r12b,al
     12224c9:	75 3a                	jne    1222505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a89>
     12224cb:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12224d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12224d5:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12224d8:	41 8b 0e             	mov    ecx,DWORD PTR [r14]
     12224db:	31 f6                	xor    esi,esi
     12224dd:	83 f9 03             	cmp    ecx,0x3
     12224e0:	0f 42 f1             	cmovb  esi,ecx
     12224e3:	48 89 c7             	mov    rdi,rax
     12224e6:	e8 31 0b 00 00       	call   122301c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685a0>

### 0x1222496 FDE=(19014422, 19016141): call   QWORD PTR [rax+0x68]
     122244a:	3b 8b d8 0b 00 00    	cmp    ecx,DWORD PTR [rbx+0xbd8]
     1222450:	89 c5                	mov    ebp,eax
     1222452:	0f 95 c0             	setne  al
     1222455:	40 80 f5 01          	xor    bpl,0x1
     1222459:	40 08 c5             	or     bpl,al
     122245c:	44 89 bb b8 0b 00 00 	mov    DWORD PTR [rbx+0xbb8],r15d
     1222463:	4d 8d 7e 30          	lea    r15,[r14+0x30]
     1222467:	48 8d bb c0 0b 00 00 	lea    rdi,[rbx+0xbc0]
     122246e:	4c 89 fe             	mov    rsi,r15
     1222471:	e8 5a 0c 00 00       	call   12230d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68654>
     1222476:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     122247d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1222480:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1222483:	41 b4 01             	mov    r12b,0x1
     1222486:	83 78 04 04          	cmp    DWORD PTR [rax+0x4],0x4
     122248a:	74 28                	je     12224b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a38>
     122248c:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     1222493:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1222496:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1222499:	83 78 04 03          	cmp    DWORD PTR [rax+0x4],0x3
     122249d:	74 15                	je     12224b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a38>
     122249f:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12224a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12224a9:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12224ac:	83 78 04 02          	cmp    DWORD PTR [rax+0x4],0x2
     12224b0:	41 0f 94 c4          	sete   r12b
     12224b4:	40 84 ed             	test   bpl,bpl
     12224b7:	74 4c                	je     1222505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a89>
     12224b9:	80 bb 86 06 00 00 00 	cmp    BYTE PTR [rbx+0x686],0x0
     12224c0:	0f 95 c0             	setne  al
     12224c3:	41 f6 d4             	not    r12b
     12224c6:	41 84 c4             	test   r12b,al
     12224c9:	75 3a                	jne    1222505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a89>
     12224cb:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12224d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12224d5:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12224d8:	41 8b 0e             	mov    ecx,DWORD PTR [r14]
     12224db:	31 f6                	xor    esi,esi
     12224dd:	83 f9 03             	cmp    ecx,0x3
     12224e0:	0f 42 f1             	cmovb  esi,ecx
     12224e3:	48 89 c7             	mov    rdi,rax
     12224e6:	e8 31 0b 00 00       	call   122301c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685a0>
     12224eb:	80 bc 24 d8 01 00 00 	cmp    BYTE PTR [rsp+0x1d8],0x0
     12224f2:	00 
     12224f3:	75 08                	jne    12224fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a81>
     12224f5:	c6 84 24 d8 01 00 00 	mov    BYTE PTR [rsp+0x1d8],0x1
     12224fc:	01 
     12224fd:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax

### 0x12224a9 FDE=(19014422, 19016141): call   QWORD PTR [rax+0x68]
     122245c:	44 89 bb b8 0b 00 00 	mov    DWORD PTR [rbx+0xbb8],r15d
     1222463:	4d 8d 7e 30          	lea    r15,[r14+0x30]
     1222467:	48 8d bb c0 0b 00 00 	lea    rdi,[rbx+0xbc0]
     122246e:	4c 89 fe             	mov    rsi,r15
     1222471:	e8 5a 0c 00 00       	call   12230d0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68654>
     1222476:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     122247d:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1222480:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1222483:	41 b4 01             	mov    r12b,0x1
     1222486:	83 78 04 04          	cmp    DWORD PTR [rax+0x4],0x4
     122248a:	74 28                	je     12224b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a38>
     122248c:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     1222493:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1222496:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1222499:	83 78 04 03          	cmp    DWORD PTR [rax+0x4],0x3
     122249d:	74 15                	je     12224b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a38>
     122249f:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12224a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12224a9:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12224ac:	83 78 04 02          	cmp    DWORD PTR [rax+0x4],0x2
     12224b0:	41 0f 94 c4          	sete   r12b
     12224b4:	40 84 ed             	test   bpl,bpl
     12224b7:	74 4c                	je     1222505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a89>
     12224b9:	80 bb 86 06 00 00 00 	cmp    BYTE PTR [rbx+0x686],0x0
     12224c0:	0f 95 c0             	setne  al
     12224c3:	41 f6 d4             	not    r12b
     12224c6:	41 84 c4             	test   r12b,al
     12224c9:	75 3a                	jne    1222505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a89>
     12224cb:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12224d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12224d5:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12224d8:	41 8b 0e             	mov    ecx,DWORD PTR [r14]
     12224db:	31 f6                	xor    esi,esi
     12224dd:	83 f9 03             	cmp    ecx,0x3
     12224e0:	0f 42 f1             	cmovb  esi,ecx
     12224e3:	48 89 c7             	mov    rdi,rax
     12224e6:	e8 31 0b 00 00       	call   122301c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685a0>
     12224eb:	80 bc 24 d8 01 00 00 	cmp    BYTE PTR [rsp+0x1d8],0x0
     12224f2:	00 
     12224f3:	75 08                	jne    12224fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a81>
     12224f5:	c6 84 24 d8 01 00 00 	mov    BYTE PTR [rsp+0x1d8],0x1
     12224fc:	01 
     12224fd:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
     1222504:	00 
     1222505:	41 80 7e 50 00       	cmp    BYTE PTR [r14+0x50],0x0
     122250a:	0f 84 de 00 00 00    	je     12225ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67b72>
     1222510:	80 bb 58 11 00 00 00 	cmp    BYTE PTR [rbx+0x1158],0x0
     1222517:	0f 84 d1 00 00 00    	je     12225ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67b72>

### 0x12224d5 FDE=(19014422, 19016141): call   QWORD PTR [rax+0x68]
     1222493:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1222496:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1222499:	83 78 04 03          	cmp    DWORD PTR [rax+0x4],0x3
     122249d:	74 15                	je     12224b4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a38>
     122249f:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12224a6:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12224a9:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12224ac:	83 78 04 02          	cmp    DWORD PTR [rax+0x4],0x2
     12224b0:	41 0f 94 c4          	sete   r12b
     12224b4:	40 84 ed             	test   bpl,bpl
     12224b7:	74 4c                	je     1222505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a89>
     12224b9:	80 bb 86 06 00 00 00 	cmp    BYTE PTR [rbx+0x686],0x0
     12224c0:	0f 95 c0             	setne  al
     12224c3:	41 f6 d4             	not    r12b
     12224c6:	41 84 c4             	test   r12b,al
     12224c9:	75 3a                	jne    1222505 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a89>
     12224cb:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12224d2:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12224d5:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12224d8:	41 8b 0e             	mov    ecx,DWORD PTR [r14]
     12224db:	31 f6                	xor    esi,esi
     12224dd:	83 f9 03             	cmp    ecx,0x3
     12224e0:	0f 42 f1             	cmovb  esi,ecx
     12224e3:	48 89 c7             	mov    rdi,rax
     12224e6:	e8 31 0b 00 00       	call   122301c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685a0>
     12224eb:	80 bc 24 d8 01 00 00 	cmp    BYTE PTR [rsp+0x1d8],0x0
     12224f2:	00 
     12224f3:	75 08                	jne    12224fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67a81>
     12224f5:	c6 84 24 d8 01 00 00 	mov    BYTE PTR [rsp+0x1d8],0x1
     12224fc:	01 
     12224fd:	48 89 84 24 d0 01 00 	mov    QWORD PTR [rsp+0x1d0],rax
     1222504:	00 
     1222505:	41 80 7e 50 00       	cmp    BYTE PTR [r14+0x50],0x0
     122250a:	0f 84 de 00 00 00    	je     12225ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67b72>
     1222510:	80 bb 58 11 00 00 00 	cmp    BYTE PTR [rbx+0x1158],0x0
     1222517:	0f 84 d1 00 00 00    	je     12225ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67b72>
     122251d:	48 8d b3 28 11 00 00 	lea    rsi,[rbx+0x1128]
     1222524:	4c 89 ff             	mov    rdi,r15
     1222527:	e8 c2 d1 87 ff       	call   a9f6ee <JNI_OnUnload@@Base+0x26fbb>
     122252c:	84 c0                	test   al,al
     122252e:	0f 84 ba 00 00 00    	je     12225ee <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67b72>
     1222534:	41 8b 46 48          	mov    eax,DWORD PTR [r14+0x48]
     1222538:	31 ed                	xor    ebp,ebp
     122253a:	83 f8 03             	cmp    eax,0x3
     122253d:	0f 42 e8             	cmovb  ebp,eax
     1222540:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
     1222547:	00 
     1222548:	4c 89 fe             	mov    rsi,r15

### 0x12225af FDE=(19014422, 19016141): call   QWORD PTR [rax+0x68]
     122255e:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     1222565:	00 
     1222566:	0f 29 07             	movaps XMMWORD PTR [rdi],xmm0
     1222569:	0f 29 47 10          	movaps XMMWORD PTR [rdi+0x10],xmm0
     122256d:	c7 47 20 00 00 80 3f 	mov    DWORD PTR [rdi+0x20],0x3f800000
     1222574:	e8 b3 0b 00 00       	call   122312c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x686b0>
     1222579:	48 8d bc 24 68 03 00 	lea    rdi,[rsp+0x368]
     1222580:	00 
     1222581:	e8 0a b9 5c 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     1222586:	80 bb 86 06 00 00 00 	cmp    BYTE PTR [rbx+0x686],0x0
     122258d:	74 3f                	je     12225ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67b52>
     122258f:	48 8b b3 68 11 00 00 	mov    rsi,QWORD PTR [rbx+0x1168]
     1222596:	8b bb 60 11 00 00    	mov    edi,DWORD PTR [rbx+0x1160]
     122259c:	e8 7f 92 85 ff       	call   a7b820 <JNI_OnUnload@@Base+0x30ed>
     12225a1:	84 c0                	test   al,al
     12225a3:	75 29                	jne    12225ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67b52>
     12225a5:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12225ac:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12225af:	ff 50 68             	call   QWORD PTR [rax+0x68]
     12225b2:	83 78 04 00          	cmp    DWORD PTR [rax+0x4],0x0
     12225b6:	74 16                	je     12225ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67b52>
     12225b8:	48 8d b3 60 11 00 00 	lea    rsi,[rbx+0x1160]
     12225bf:	48 8d bc 24 a0 02 00 	lea    rdi,[rsp+0x2a0]
     12225c6:	00 
     12225c7:	e8 fc 0d 00 00       	call   12233c8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6894c>
     12225cc:	89 28                	mov    DWORD PTR [rax],ebp
     12225ce:	48 8d bc 24 e0 01 00 	lea    rdi,[rsp+0x1e0]
     12225d5:	00 
     12225d6:	4c 8d bc 24 a0 02 00 	lea    r15,[rsp+0x2a0]
     12225dd:	00 
     12225de:	4c 89 fe             	mov    rsi,r15
     12225e1:	e8 6e 10 00 00       	call   1223654 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68bd8>
     12225e6:	4c 89 ff             	mov    rdi,r15
     12225e9:	e8 78 00 8c ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     12225ee:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     12225f5:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12225f8:	ff 50 40             	call   QWORD PTR [rax+0x40]
     12225fb:	49 89 c4             	mov    r12,rax
     12225fe:	4c 8d 7b 08          	lea    r15,[rbx+0x8]
     1222602:	4c 89 ff             	mov    rdi,r15
     1222605:	e8 82 57 00 00       	call   1227d8c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6d310>
     122260a:	31 c9                	xor    ecx,ecx
     122260c:	85 c0                	test   eax,eax
     122260e:	0f 95 c1             	setne  cl
     1222611:	41 80 7c 4e 09 00    	cmp    BYTE PTR [r14+rcx*2+0x9],0x0
     1222617:	74 2c                	je     1222645 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67bc9>
     1222619:	41 80 7c 4e 08 00    	cmp    BYTE PTR [r14+rcx*2+0x8],0x0
     122261f:	74 24                	je     1222645 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x67bc9>

### 0x1225a44 FDE=(19026704, 19029630): call   QWORD PTR [rax+0x68]
     12259ee:	0f 11 84 24 a9 09 00 	movups XMMWORD PTR [rsp+0x9a9],xmm0
     12259f5:	00 
     12259f6:	b0 01                	mov    al,0x1
     12259f8:	88 84 24 b9 09 00 00 	mov    BYTE PTR [rsp+0x9b9],al
     12259ff:	41 8b 4c 24 04       	mov    ecx,DWORD PTR [r12+0x4]
     1225a04:	83 f9 03             	cmp    ecx,0x3
     1225a07:	44 0f 42 f9          	cmovb  r15d,ecx
     1225a0b:	44 89 bc 24 bc 09 00 	mov    DWORD PTR [rsp+0x9bc],r15d
     1225a12:	00 
     1225a13:	88 84 24 c0 09 00 00 	mov    BYTE PTR [rsp+0x9c0],al
     1225a1a:	49 8b 4c 24 18       	mov    rcx,QWORD PTR [r12+0x18]
     1225a1f:	41 8a 54 24 20       	mov    dl,BYTE PTR [r12+0x20]
     1225a24:	48 89 8c 24 c8 09 00 	mov    QWORD PTR [rsp+0x9c8],rcx
     1225a2b:	00 
     1225a2c:	88 94 24 d0 09 00 00 	mov    BYTE PTR [rsp+0x9d0],dl
     1225a33:	88 84 24 d8 09 00 00 	mov    BYTE PTR [rsp+0x9d8],al
     1225a3a:	48 8b bb 50 09 00 00 	mov    rdi,QWORD PTR [rbx+0x950]
     1225a41:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1225a44:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1225a47:	80 bb 86 06 00 00 00 	cmp    BYTE PTR [rbx+0x686],0x0
     1225a4e:	0f 95 c2             	setne  dl
     1225a51:	8b 78 04             	mov    edi,DWORD PTR [rax+0x4]
     1225a54:	85 ff                	test   edi,edi
     1225a56:	0f 95 c1             	setne  cl
     1225a59:	20 d1                	and    cl,dl
     1225a5b:	0f b6 f1             	movzx  esi,cl
     1225a5e:	83 ff 04             	cmp    edi,0x4
     1225a61:	75 17                	jne    1225a7a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6affe>
     1225a63:	80 bb b0 08 00 00 03 	cmp    BYTE PTR [rbx+0x8b0],0x3
     1225a6a:	0f 94 c2             	sete   dl
     1225a6d:	08 d1                	or     cl,dl
     1225a6f:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     1225a74:	74 0d                	je     1225a83 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b007>
     1225a76:	01 f6                	add    esi,esi
     1225a78:	eb 15                	jmp    1225a8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b013>
     1225a7a:	01 f6                	add    esi,esi
     1225a7c:	4c 8b 7c 24 20       	mov    r15,QWORD PTR [rsp+0x20]
     1225a81:	eb 0c                	jmp    1225a8f <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x6b013>
     1225a83:	41 8b 0c 24          	mov    ecx,DWORD PTR [r12]
     1225a87:	31 f6                	xor    esi,esi
     1225a89:	83 f9 03             	cmp    ecx,0x3
     1225a8c:	0f 42 f1             	cmovb  esi,ecx
     1225a8f:	48 89 c7             	mov    rdi,rax
     1225a92:	e8 85 d5 ff ff       	call   122301c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x685a0>
     1225a97:	40 80 f5 01          	xor    bpl,0x1
     1225a9b:	44 08 ed             	or     bpl,r13b
     1225a9e:	48 89 84 24 e0 09 00 	mov    QWORD PTR [rsp+0x9e0],rax
     1225aa5:	00 

### 0x122e5fa FDE=(19063258, 19073670): call   QWORD PTR [rax+0x68]
     122e5b8:	74 70                	je     122e62a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73bae>
     122e5ba:	4c 8d 84 24 e0 01 00 	lea    r8,[rsp+0x1e0]
     122e5c1:	00 
     122e5c2:	49 89 28             	mov    QWORD PTR [r8],rbp
     122e5c5:	48 8d 35 c5 ea 86 ff 	lea    rsi,[rip+0xffffffffff86eac5]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     122e5cc:	48 8d 0d c9 91 01 00 	lea    rcx,[rip+0x191c9]        # 124779c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cd20>
     122e5d3:	4c 8d b4 24 70 02 00 	lea    r14,[rsp+0x270]
     122e5da:	00 
     122e5db:	6a 08                	push   0x8
     122e5dd:	41 59                	pop    r9
     122e5df:	4c 89 f7             	mov    rdi,r14
     122e5e2:	31 d2                	xor    edx,edx
     122e5e4:	e8 ab c1 5a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     122e5e9:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     122e5ec:	48 8d bc 24 40 04 00 	lea    rdi,[rsp+0x440]
     122e5f3:	00 
     122e5f4:	48 89 de             	mov    rsi,rbx
     122e5f7:	4c 89 f2             	mov    rdx,r14
     122e5fa:	ff 50 68             	call   QWORD PTR [rax+0x68]
     122e5fd:	48 8d bd b0 09 00 00 	lea    rdi,[rbp+0x9b0]
     122e604:	48 8d 9c 24 40 04 00 	lea    rbx,[rsp+0x440]
     122e60b:	00 
     122e60c:	48 89 de             	mov    rsi,rbx
     122e60f:	e8 de b5 5a 00       	call   17d9bf2 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x5a13>
     122e614:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     122e618:	e8 69 fe 86 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
     122e61d:	48 8d bc 24 70 02 00 	lea    rdi,[rsp+0x270]
     122e624:	00 
     122e625:	e8 be c1 5a 00       	call   17da7e8 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x6609>
     122e62a:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     122e62e:	4c 89 e7             	mov    rdi,r12
     122e631:	ff 90 b8 02 00 00    	call   QWORD PTR [rax+0x2b8]
     122e637:	84 c0                	test   al,al
     122e639:	74 77                	je     122e6b2 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x73c36>
     122e63b:	48 8b 9d 50 08 00 00 	mov    rbx,QWORD PTR [rbp+0x850]
     122e642:	4c 8d 84 24 e0 01 00 	lea    r8,[rsp+0x1e0]
     122e649:	00 
     122e64a:	49 89 28             	mov    QWORD PTR [r8],rbp
     122e64d:	48 8d 35 3d ea 86 ff 	lea    rsi,[rip+0xffffffffff86ea3d]        # a9d091 <JNI_OnUnload@@Base+0x2495e>
     122e654:	48 8d 0d 73 91 01 00 	lea    rcx,[rip+0x19173]        # 12477ce <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cd52>
     122e65b:	4c 8d b4 24 70 02 00 	lea    r14,[rsp+0x270]
     122e662:	00 
     122e663:	6a 08                	push   0x8
     122e665:	41 59                	pop    r9
     122e667:	4c 89 f7             	mov    rdi,r14
     122e66a:	31 d2                	xor    edx,edx
     122e66c:	e8 23 c1 5a 00       	call   17da794 <Java_com_spotify_scannables_scannables_tagreader_SPTTagReader_decodeWaveformTag@@Base+0x65b5>
     122e671:	48 8b 03             	mov    rax,QWORD PTR [rbx]

### 0x122f744 FDE=(19063258, 19073670): call   QWORD PTR [rax+0x68]
     122f6f6:	74 22                	je     122f71a <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x74c9e>
     122f6f8:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     122f6ff:	e8 82 13 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     122f704:	48 89 c3             	mov    rbx,rax
     122f707:	48 8b bd 90 07 00 00 	mov    rdi,QWORD PTR [rbp+0x790]
     122f70e:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     122f711:	ff 50 48             	call   QWORD PTR [rax+0x48]
     122f714:	89 83 d4 03 00 00    	mov    DWORD PTR [rbx+0x3d4],eax
     122f71a:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     122f71e:	4c 89 e7             	mov    rdi,r12
     122f721:	ff 90 d8 02 00 00    	call   QWORD PTR [rax+0x2d8]
     122f727:	84 c0                	test   al,al
     122f729:	74 26                	je     122f751 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x74cd5>
     122f72b:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     122f732:	e8 4f 13 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     122f737:	48 89 c3             	mov    rbx,rax
     122f73a:	48 8b bd 90 07 00 00 	mov    rdi,QWORD PTR [rbp+0x790]
     122f741:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     122f744:	ff 50 68             	call   QWORD PTR [rax+0x68]
     122f747:	48 8b 00             	mov    rax,QWORD PTR [rax]
     122f74a:	48 89 83 00 0f 00 00 	mov    QWORD PTR [rbx+0xf00],rax
     122f751:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     122f755:	4c 89 e7             	mov    rdi,r12
     122f758:	ff 90 e8 02 00 00    	call   QWORD PTR [rax+0x2e8]
     122f75e:	84 c0                	test   al,al
     122f760:	74 4e                	je     122f7b0 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x74d34>
     122f762:	48 8d bd 98 08 00 00 	lea    rdi,[rbp+0x898]
     122f769:	e8 18 13 00 00       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     122f76e:	48 89 c3             	mov    rbx,rax
     122f771:	48 8b bd 90 07 00 00 	mov    rdi,QWORD PTR [rbp+0x790]
     122f778:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     122f77b:	ff 50 70             	call   QWORD PTR [rax+0x70]
     122f77e:	48 8d bc 24 b8 01 00 	lea    rdi,[rsp+0x1b8]
     122f785:	00 
     122f786:	48 89 c6             	mov    rsi,rax
     122f789:	e8 1a 20 00 00       	call   12317a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76d2c>
     122f78e:	48 81 c3 08 0f 00 00 	add    rbx,0xf08
     122f795:	4c 8d b4 24 b8 01 00 	lea    r14,[rsp+0x1b8]
     122f79c:	00 
     122f79d:	48 89 df             	mov    rdi,rbx
     122f7a0:	4c 89 f6             	mov    rsi,r14
     122f7a3:	e8 e4 3f ff ff       	call   122378c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68d10>
     122f7a8:	4c 89 f7             	mov    rdi,r14
     122f7ab:	e8 b6 2e 8b ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     122f7b0:	49 8b 04 24          	mov    rax,QWORD PTR [r12]
     122f7b4:	4c 89 e7             	mov    rdi,r12
     122f7b7:	ff 90 08 03 00 00    	call   QWORD PTR [rax+0x308]
     122f7bd:	84 c0                	test   al,al

### 0x123c371 FDE=(19120160, 19122008): call   QWORD PTR [rax+0x68]
     123c332:	83 bc 24 b8 01 00 00 	cmp    DWORD PTR [rsp+0x1b8],0x4
     123c339:	04 
     123c33a:	0f 85 99 01 00 00    	jne    123c4d9 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x81a5d>
     123c340:	48 8b 5c 24 10       	mov    rbx,QWORD PTR [rsp+0x10]
     123c345:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     123c348:	48 89 df             	mov    rdi,rbx
     123c34b:	ff 50 58             	call   QWORD PTR [rax+0x58]
     123c34e:	8a 08                	mov    cl,BYTE PTR [rax]
     123c350:	88 4c 24 0b          	mov    BYTE PTR [rsp+0xb],cl
     123c354:	8a 40 01             	mov    al,BYTE PTR [rax+0x1]
     123c357:	88 44 24 0a          	mov    BYTE PTR [rsp+0xa],al
     123c35b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     123c35e:	48 89 df             	mov    rdi,rbx
     123c361:	ff 50 48             	call   QWORD PTR [rax+0x48]
     123c364:	44 8a 20             	mov    r12b,BYTE PTR [rax]
     123c367:	44 8a 68 01          	mov    r13b,BYTE PTR [rax+0x1]
     123c36b:	48 8b 03             	mov    rax,QWORD PTR [rbx]
     123c36e:	48 89 df             	mov    rdi,rbx
     123c371:	ff 50 68             	call   QWORD PTR [rax+0x68]
     123c374:	8a 18                	mov    bl,BYTE PTR [rax]
     123c376:	40 8a 68 01          	mov    bpl,BYTE PTR [rax+0x1]
     123c37a:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]
     123c381:	00 
     123c382:	48 8b 74 24 20       	mov    rsi,QWORD PTR [rsp+0x20]
     123c387:	e8 b4 1b 5b 00       	call   17edf40 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEC2ERKS5_@plt>
     123c38c:	44 8b 7c 24 0c       	mov    r15d,DWORD PTR [rsp+0xc]
     123c391:	45 84 ff             	test   r15b,r15b
     123c394:	0f b6 44 24 0b       	movzx  eax,BYTE PTR [rsp+0xb]
     123c399:	0f b6 4c 24 0a       	movzx  ecx,BYTE PTR [rsp+0xa]
     123c39e:	0f 44 c8             	cmove  ecx,eax
     123c3a1:	41 0f b6 c4          	movzx  eax,r12b
     123c3a5:	41 0f b6 d5          	movzx  edx,r13b
     123c3a9:	0f 44 d0             	cmove  edx,eax
     123c3ac:	0f b6 c3             	movzx  eax,bl
     123c3af:	40 0f b6 f5          	movzx  esi,bpl
     123c3b3:	0f 44 f0             	cmove  esi,eax
     123c3b6:	40 38 f2             	cmp    dl,sil
     123c3b9:	0f 47 f2             	cmova  esi,edx
     123c3bc:	40 38 f1             	cmp    cl,sil
     123c3bf:	0f 47 f1             	cmova  esi,ecx
     123c3c2:	40 0f b6 d6          	movzx  edx,sil
     123c3c6:	6a 0a                	push   0xa
     123c3c8:	5e                   	pop    rsi
     123c3c9:	48 8d 8c 24 b8 00 00 	lea    rcx,[rsp+0xb8]
     123c3d0:	00 
     123c3d1:	4c 89 f7             	mov    rdi,r14
     123c3d4:	e8 db c7 00 00       	call   1248bb4 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8e138>
     123c3d9:	48 8d bc 24 b8 00 00 	lea    rdi,[rsp+0xb8]

### 0x1247582 FDE=(19166354, 19167132): call   QWORD PTR [rax+0x68]
     124753a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     124753d:	ff 50 48             	call   QWORD PTR [rax+0x48]
     1247540:	41 89 84 24 d4 03 00 	mov    DWORD PTR [r12+0x3d4],eax
     1247547:	00 
     1247548:	81 cd 00 00 00 02    	or     ebp,0x2000000
     124754e:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     1247552:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1247555:	ff 90 d8 02 00 00    	call   QWORD PTR [rax+0x2d8]
     124755b:	84 c0                	test   al,al
     124755d:	74 37                	je     1247596 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb1a>
     124755f:	44 89 f0             	mov    eax,r14d
     1247562:	25 00 00 00 08       	and    eax,0x8000000
     1247567:	74 2d                	je     1247596 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb1a>
     1247569:	48 8d bb 98 08 00 00 	lea    rdi,[rbx+0x898]
     1247570:	e8 11 95 fe ff       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     1247575:	49 89 c4             	mov    r12,rax
     1247578:	48 8b bb 90 07 00 00 	mov    rdi,QWORD PTR [rbx+0x790]
     124757f:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     1247582:	ff 50 68             	call   QWORD PTR [rax+0x68]
     1247585:	48 8b 00             	mov    rax,QWORD PTR [rax]
     1247588:	49 89 84 24 00 0f 00 	mov    QWORD PTR [r12+0xf00],rax
     124758f:	00 
     1247590:	81 cd 00 00 00 08    	or     ebp,0x8000000
     1247596:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
     124759a:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     124759d:	ff 90 e8 02 00 00    	call   QWORD PTR [rax+0x2e8]
     12475a3:	84 c0                	test   al,al
     12475a5:	74 56                	je     12475fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb81>
     12475a7:	44 89 f0             	mov    eax,r14d
     12475aa:	25 00 00 00 10       	and    eax,0x10000000
     12475af:	74 4c                	je     12475fd <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x8cb81>
     12475b1:	48 8d bb 98 08 00 00 	lea    rdi,[rbx+0x898]
     12475b8:	e8 c9 94 fe ff       	call   1230a86 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x7600a>
     12475bd:	49 89 c4             	mov    r12,rax
     12475c0:	48 8b bb 90 07 00 00 	mov    rdi,QWORD PTR [rbx+0x790]
     12475c7:	48 8b 07             	mov    rax,QWORD PTR [rdi]
     12475ca:	ff 50 70             	call   QWORD PTR [rax+0x70]
     12475cd:	4c 8d 6c 24 08       	lea    r13,[rsp+0x8]
     12475d2:	4c 89 ef             	mov    rdi,r13
     12475d5:	48 89 c6             	mov    rsi,rax
     12475d8:	e8 cb a1 fe ff       	call   12317a8 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x76d2c>
     12475dd:	49 81 c4 08 0f 00 00 	add    r12,0xf08
     12475e4:	4c 89 e7             	mov    rdi,r12
     12475e7:	4c 89 ee             	mov    rsi,r13
     12475ea:	e8 9d c1 fd ff       	call   122378c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x68d10>
     12475ef:	4c 89 ef             	mov    rdi,r13
     12475f2:	e8 6f b0 89 ff       	call   ae2666 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x2f606>
     12475f7:	81 cd 00 00 00 10    	or     ebp,0x10000000

### 0x124f3e6 FDE=(19198788, 19199039): call   QWORD PTR [rbx+0x68]
     124f398:	41 80 4e 10 01       	or     BYTE PTR [r14+0x10],0x1
     124f39d:	49 8b 56 08          	mov    rdx,QWORD PTR [r14+0x8]
     124f3a1:	49 83 c6 18          	add    r14,0x18
     124f3a5:	f6 c2 01             	test   dl,0x1
     124f3a8:	75 63                	jne    124f40d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x94991>
     124f3aa:	48 8d 74 24 08       	lea    rsi,[rsp+0x8]
     124f3af:	4c 89 f7             	mov    rdi,r14
     124f3b2:	e8 2f 64 51 00       	call   17657e6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x119952>
     124f3b7:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     124f3bc:	e8 cf ea 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124f3c1:	48 8b b3 88 00 00 00 	mov    rsi,QWORD PTR [rbx+0x88]
     124f3c8:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     124f3cd:	e8 f2 08 53 00       	call   177fcc4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x133e30>
     124f3d2:	4c 8d 73 50          	lea    r14,[rbx+0x50]
     124f3d6:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     124f3db:	e8 56 c4 82 ff       	call   a7b836 <JNI_OnUnload@@Base+0x3103>
     124f3e0:	4c 89 f7             	mov    rdi,r14
     124f3e3:	48 89 c6             	mov    rsi,rax
     124f3e6:	ff 53 68             	call   QWORD PTR [rbx+0x68]
     124f3e9:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     124f3ee:	e8 9d ea 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124f3f3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     124f3fa:	00 00 
     124f3fc:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
     124f401:	75 13                	jne    124f416 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9499a>
     124f403:	48 83 c4 50          	add    rsp,0x50
     124f407:	5b                   	pop    rbx
     124f408:	41 5e                	pop    r14
     124f40a:	41 5f                	pop    r15
     124f40c:	c3                   	ret
     124f40d:	48 83 e2 fe          	and    rdx,0xfffffffffffffffe
     124f411:	48 8b 12             	mov    rdx,QWORD PTR [rdx]
     124f414:	eb 94                	jmp    124f3aa <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x9492e>
     124f416:	e8 95 06 5a 00       	call   17efab0 <__stack_chk_fail@plt>
     124f41b:	48 89 c3             	mov    rbx,rax
     124f41e:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
     124f423:	eb 08                	jmp    124f42d <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x949b1>
     124f425:	48 89 c3             	mov    rbx,rax
     124f428:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
     124f42d:	e8 5e ea 59 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
     124f432:	eb 03                	jmp    124f437 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3tcpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x949bb>
     124f434:	48 89 c3             	mov    rbx,rax
     124f437:	48 89 df             	mov    rdi,rbx
     124f43a:	e8 66 a6 82 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
     124f43f:	cc                   	int3
     124f440:	0f 18 0d 21 5b 6c 00 	prefetcht0 BYTE PTR [rip+0x6c5b21]        # 1914f68 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5c378>
     124f447:	48 8d 05 1a 5b 6c 00 	lea    rax,[rip+0x6c5b1a]        # 1914f68 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5c378>
     124f44e:	48 8b 0d 1b 5b 6c 00 	mov    rcx,QWORD PTR [rip+0x6c5b1b]        # 1914f70 <_ZZN4asio5error17get_misc_categoryEvE8instance@@Base+0x5c380>

