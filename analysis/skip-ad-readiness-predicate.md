# Skip Ad readiness predicate fb1b50

Proven dispatch:
- available-signals fd381a loads receiver and calls vtable +0x140
- concrete receiver final AP = 0x183ba50
- 0x183ba50 + 0x140 -> 0xfb1b50
- adapter AP 0x1841fc0 also maps +0x140 -> 0xfb1b50

## Predicate body

/tmp/pred/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fb1b50 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178f66>:
  fb1b50:	41 57                	push   r15
  fb1b52:	41 56                	push   r14
  fb1b54:	41 55                	push   r13
  fb1b56:	41 54                	push   r12
  fb1b58:	53                   	push   rbx
  fb1b59:	48 83 ec 50          	sub    rsp,0x50
  fb1b5d:	49 89 cf             	mov    r15,rcx
  fb1b60:	49 89 d4             	mov    r12,rdx
  fb1b63:	49 89 f6             	mov    r14,rsi
  fb1b66:	48 89 fb             	mov    rbx,rdi
  fb1b69:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1b70:	00 00 
  fb1b72:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  fb1b77:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1b7a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb1b7f:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1b85:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
  fb1b8a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fb1b8f:	e8 f2 c8 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1b94:	4d 85 ed             	test   r13,r13
  fb1b97:	74 6d                	je     fb1c06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17901c>
  fb1b99:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1b9c:	48 89 e7             	mov    rdi,rsp
  fb1b9f:	4c 89 f6             	mov    rsi,r14
  fb1ba2:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1ba8:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
  fb1bac:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1baf:	48 8b 80 40 01 00 00 	mov    rax,QWORD PTR [rax+0x140]
  fb1bb6:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
  fb1bbb:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
  fb1bc0:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
  fb1bc3:	41 8b 4c 24 20       	mov    ecx,DWORD PTR [r12+0x20]
  fb1bc8:	89 4a 20             	mov    DWORD PTR [rdx+0x20],ecx
  fb1bcb:	41 0f 10 44 24 10    	movups xmm0,XMMWORD PTR [r12+0x10]
  fb1bd1:	0f 29 42 10          	movaps XMMWORD PTR [rdx+0x10],xmm0
  fb1bd5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fb1bda:	4c 89 f9             	mov    rcx,r15
  fb1bdd:	ff d0                	call   rax
  fb1bdf:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1be2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  fb1be7:	48 89 df             	mov    rdi,rbx
  fb1bea:	4c 89 f6             	mov    rsi,r14
  fb1bed:	31 d2                	xor    edx,edx
  fb1bef:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
  fb1bf5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  fb1bfa:	e8 87 c8 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1bff:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fb1c04:	eb 25                	jmp    fb1c2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179041>
  fb1c06:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1c09:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb1c0e:	4c 89 f6             	mov    rsi,r14
  fb1c11:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
  fb1c17:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  fb1c1c:	48 89 df             	mov    rdi,rbx
  fb1c1f:	4c 89 f6             	mov    rsi,r14
  fb1c22:	e8 63 ef ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
  fb1c27:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fb1c2b:	e8 56 c8 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1c30:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1c37:	00 00 
  fb1c39:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
  fb1c3e:	75 11                	jne    fb1c51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179067>
  fb1c40:	48 89 d8             	mov    rax,rbx
  fb1c43:	48 83 c4 50          	add    rsp,0x50
  fb1c47:	5b                   	pop    rbx
  fb1c48:	41 5c                	pop    r12
  fb1c4a:	41 5d                	pop    r13
  fb1c4c:	41 5e                	pop    r14
  fb1c4e:	41 5f                	pop    r15
  fb1c50:	c3                   	ret
  fb1c51:	e8 5a de 83 00       	call   17efab0 <__stack_chk_fail@plt>
  fb1c56:	48 89 c7             	mov    rdi,rax
  fb1c59:	e8 47 7e ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fb1c5e:	55                   	push   rbp
  fb1c5f:	41 57                	push   r15
  fb1c61:	41 56                	push   r14
  fb1c63:	41 55                	push   r13
  fb1c65:	41 54                	push   r12
  fb1c67:	53                   	push   rbx
  fb1c68:	48 81 ec 98 00 00 00 	sub    rsp,0x98
  fb1c6f:	49 89 f6             	mov    r14,rsi
  fb1c72:	48 89 fb             	mov    rbx,rdi
  fb1c75:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1c7c:	00 00 
  fb1c7e:	48                   	rex.W
  fb1c7f:	89                   	.byte 0x89

## Nearby family

/tmp/pred/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fb1908 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178d1e>:
  fb1908:	55                   	push   rbp
  fb1909:	41 57                	push   r15
  fb190b:	41 56                	push   r14
  fb190d:	41 55                	push   r13
  fb190f:	41 54                	push   r12
  fb1911:	53                   	push   rbx
  fb1912:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
  fb1919:	49 89 cf             	mov    r15,rcx
  fb191c:	49 89 d4             	mov    r12,rdx
  fb191f:	49 89 f6             	mov    r14,rsi
  fb1922:	48 89 fb             	mov    rbx,rdi
  fb1925:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb192c:	00 00 
  fb192e:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
  fb1935:	00 
  fb1936:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1939:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb193e:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1944:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
  fb1949:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fb194e:	e8 33 cb ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1953:	4d 85 ed             	test   r13,r13
  fb1956:	74 75                	je     fb19cd <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178de3>
  fb1958:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb195b:	48 89 e7             	mov    rdi,rsp
  fb195e:	4c 89 f6             	mov    rsi,r14
  fb1961:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1967:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
  fb196b:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  fb196f:	4c 89 e6             	mov    rsi,r12
  fb1972:	49 89 dc             	mov    r12,rbx
  fb1975:	48 8b 98 30 01 00 00 	mov    rbx,QWORD PTR [rax+0x130]
  fb197c:	48 8d 6c 24 20       	lea    rbp,[rsp+0x20]
  fb1981:	48 89 ef             	mov    rdi,rbp
  fb1984:	e8 b7 56 6b 00       	call   1667040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1ac>
  fb1989:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fb198e:	4c 89 ee             	mov    rsi,r13
  fb1991:	48 89 ea             	mov    rdx,rbp
  fb1994:	4c 89 f9             	mov    rcx,r15
  fb1997:	ff d3                	call   rbx
  fb1999:	4c 89 e3             	mov    rbx,r12
  fb199c:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb199f:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  fb19a4:	4c 89 e7             	mov    rdi,r12
  fb19a7:	4c 89 f6             	mov    rsi,r14
  fb19aa:	31 d2                	xor    edx,edx
  fb19ac:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
  fb19b2:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  fb19b7:	e8 ca ca ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb19bc:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb19c1:	e8 d4 56 6b 00       	call   166709a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b206>
  fb19c6:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fb19cb:	eb 25                	jmp    fb19f2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178e08>
  fb19cd:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb19d0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb19d5:	4c 89 f6             	mov    rsi,r14
  fb19d8:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
  fb19de:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  fb19e3:	48 89 df             	mov    rdi,rbx
  fb19e6:	4c 89 f6             	mov    rsi,r14
  fb19e9:	e8 9c f1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
  fb19ee:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fb19f2:	e8 8f ca ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb19f7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb19fe:	00 00 
  fb1a00:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
  fb1a07:	00 
  fb1a08:	75 15                	jne    fb1a1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178e35>
  fb1a0a:	48 89 d8             	mov    rax,rbx
  fb1a0d:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
  fb1a14:	5b                   	pop    rbx
  fb1a15:	41 5c                	pop    r12
  fb1a17:	41 5d                	pop    r13
  fb1a19:	41 5e                	pop    r14
  fb1a1b:	41 5f                	pop    r15
  fb1a1d:	5d                   	pop    rbp
  fb1a1e:	c3                   	ret
  fb1a1f:	e8 8c e0 83 00       	call   17efab0 <__stack_chk_fail@plt>
  fb1a24:	48 89 c7             	mov    rdi,rax
  fb1a27:	e8 79 80 ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fb1a2c:	55                   	push   rbp
  fb1a2d:	41 57                	push   r15
  fb1a2f:	41 56                	push   r14
  fb1a31:	41 55                	push   r13
  fb1a33:	41 54                	push   r12
  fb1a35:	53                   	push   rbx
  fb1a36:	48 81 ec f8 00 00 00 	sub    rsp,0xf8
  fb1a3d:	49 89 cf             	mov    r15,rcx
  fb1a40:	49 89 d4             	mov    r12,rdx
  fb1a43:	49 89 f6             	mov    r14,rsi
  fb1a46:	48 89 fb             	mov    rbx,rdi
  fb1a49:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1a50:	00 00 
  fb1a52:	48 89 84 24 f0 00 00 	mov    QWORD PTR [rsp+0xf0],rax
  fb1a59:	00 
  fb1a5a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1a5d:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb1a62:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1a68:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
  fb1a6d:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fb1a72:	e8 0f ca ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1a77:	4d 85 ed             	test   r13,r13
  fb1a7a:	74 75                	je     fb1af1 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178f07>
  fb1a7c:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1a7f:	48 89 e7             	mov    rdi,rsp
  fb1a82:	4c 89 f6             	mov    rsi,r14
  fb1a85:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1a8b:	4c 8b 2c 24          	mov    r13,QWORD PTR [rsp]
  fb1a8f:	49 8b 45 00          	mov    rax,QWORD PTR [r13+0x0]
  fb1a93:	4c 89 e6             	mov    rsi,r12
  fb1a96:	49 89 dc             	mov    r12,rbx
  fb1a99:	48 8b 98 38 01 00 00 	mov    rbx,QWORD PTR [rax+0x138]
  fb1aa0:	48 8d 6c 24 20       	lea    rbp,[rsp+0x20]
  fb1aa5:	48 89 ef             	mov    rdi,rbp
  fb1aa8:	e8 93 55 6b 00       	call   1667040 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b1ac>
  fb1aad:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fb1ab2:	4c 89 ee             	mov    rsi,r13
  fb1ab5:	48 89 ea             	mov    rdx,rbp
  fb1ab8:	4c 89 f9             	mov    rcx,r15
  fb1abb:	ff d3                	call   rbx
  fb1abd:	4c 89 e3             	mov    rbx,r12
  fb1ac0:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1ac3:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  fb1ac8:	4c 89 e7             	mov    rdi,r12
  fb1acb:	4c 89 f6             	mov    rsi,r14
  fb1ace:	31 d2                	xor    edx,edx
  fb1ad0:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
  fb1ad6:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  fb1adb:	e8 a6 c9 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1ae0:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb1ae5:	e8 b0 55 6b 00       	call   166709a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12system_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1b206>
  fb1aea:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fb1aef:	eb 25                	jmp    fb1b16 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178f2c>
  fb1af1:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1af4:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb1af9:	4c 89 f6             	mov    rsi,r14
  fb1afc:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
  fb1b02:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  fb1b07:	48 89 df             	mov    rdi,rbx
  fb1b0a:	4c 89 f6             	mov    rsi,r14
  fb1b0d:	e8 78 f0 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
  fb1b12:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fb1b16:	e8 6b c9 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1b1b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1b22:	00 00 
  fb1b24:	48 3b 84 24 f0 00 00 	cmp    rax,QWORD PTR [rsp+0xf0]
  fb1b2b:	00 
  fb1b2c:	75 15                	jne    fb1b43 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178f59>
  fb1b2e:	48 89 d8             	mov    rax,rbx
  fb1b31:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
  fb1b38:	5b                   	pop    rbx
  fb1b39:	41 5c                	pop    r12
  fb1b3b:	41 5d                	pop    r13
  fb1b3d:	41 5e                	pop    r14
  fb1b3f:	41 5f                	pop    r15
  fb1b41:	5d                   	pop    rbp
  fb1b42:	c3                   	ret
  fb1b43:	e8 68 df 83 00       	call   17efab0 <__stack_chk_fail@plt>
  fb1b48:	48 89 c7             	mov    rdi,rax
  fb1b4b:	e8 55 7f ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fb1b50:	41 57                	push   r15
  fb1b52:	41 56                	push   r14
  fb1b54:	41 55                	push   r13
  fb1b56:	41 54                	push   r12
  fb1b58:	53                   	push   rbx
  fb1b59:	48 83 ec 50          	sub    rsp,0x50
  fb1b5d:	49 89 cf             	mov    r15,rcx
  fb1b60:	49 89 d4             	mov    r12,rdx
  fb1b63:	49 89 f6             	mov    r14,rsi
  fb1b66:	48 89 fb             	mov    rbx,rdi
  fb1b69:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1b70:	00 00 
  fb1b72:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
  fb1b77:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1b7a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb1b7f:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1b85:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
  fb1b8a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
  fb1b8f:	e8 f2 c8 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1b94:	4d 85 ed             	test   r13,r13
  fb1b97:	74 6d                	je     fb1c06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17901c>
  fb1b99:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1b9c:	48 89 e7             	mov    rdi,rsp
  fb1b9f:	4c 89 f6             	mov    rsi,r14
  fb1ba2:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1ba8:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
  fb1bac:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1baf:	48 8b 80 40 01 00 00 	mov    rax,QWORD PTR [rax+0x140]
  fb1bb6:	41 0f 10 04 24       	movups xmm0,XMMWORD PTR [r12]
  fb1bbb:	48 8d 54 24 20       	lea    rdx,[rsp+0x20]
  fb1bc0:	0f 29 02             	movaps XMMWORD PTR [rdx],xmm0
  fb1bc3:	41 8b 4c 24 20       	mov    ecx,DWORD PTR [r12+0x20]
  fb1bc8:	89 4a 20             	mov    DWORD PTR [rdx+0x20],ecx
  fb1bcb:	41 0f 10 44 24 10    	movups xmm0,XMMWORD PTR [r12+0x10]
  fb1bd1:	0f 29 42 10          	movaps XMMWORD PTR [rdx+0x10],xmm0
  fb1bd5:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fb1bda:	4c 89 f9             	mov    rcx,r15
  fb1bdd:	ff d0                	call   rax
  fb1bdf:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1be2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  fb1be7:	48 89 df             	mov    rdi,rbx
  fb1bea:	4c 89 f6             	mov    rsi,r14
  fb1bed:	31 d2                	xor    edx,edx
  fb1bef:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
  fb1bf5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  fb1bfa:	e8 87 c8 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1bff:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fb1c04:	eb 25                	jmp    fb1c2b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179041>
  fb1c06:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1c09:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
  fb1c0e:	4c 89 f6             	mov    rsi,r14
  fb1c11:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
  fb1c17:	4c 8d 74 24 20       	lea    r14,[rsp+0x20]
  fb1c1c:	48 89 df             	mov    rdi,rbx
  fb1c1f:	4c 89 f6             	mov    rsi,r14
  fb1c22:	e8 63 ef ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
  fb1c27:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fb1c2b:	e8 56 c8 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1c30:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1c37:	00 00 
  fb1c39:	48 3b 44 24 48       	cmp    rax,QWORD PTR [rsp+0x48]
  fb1c3e:	75 11                	jne    fb1c51 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179067>
  fb1c40:	48 89 d8             	mov    rax,rbx
  fb1c43:	48 83 c4 50          	add    rsp,0x50
  fb1c47:	5b                   	pop    rbx
  fb1c48:	41 5c                	pop    r12
  fb1c4a:	41 5d                	pop    r13
  fb1c4c:	41 5e                	pop    r14
  fb1c4e:	41 5f                	pop    r15
  fb1c50:	c3                   	ret
  fb1c51:	e8 5a de 83 00       	call   17efab0 <__stack_chk_fail@plt>
  fb1c56:	48 89 c7             	mov    rdi,rax
  fb1c59:	e8 47 7e ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fb1c5e:	55                   	push   rbp
  fb1c5f:	41 57                	push   r15
  fb1c61:	41 56                	push   r14
  fb1c63:	41 55                	push   r13
  fb1c65:	41 54                	push   r12
  fb1c67:	53                   	push   rbx
  fb1c68:	48 81 ec 98 00 00 00 	sub    rsp,0x98
  fb1c6f:	49 89 f6             	mov    r14,rsi
  fb1c72:	48 89 fb             	mov    rbx,rdi
  fb1c75:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1c7c:	00 00 
  fb1c7e:	48 89 84 24 90 00 00 	mov    QWORD PTR [rsp+0x90],rax
  fb1c85:	00 
  fb1c86:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1c89:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fb1c8e:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
  fb1c94:	49 89 e7             	mov    r15,rsp
  fb1c97:	b9 49 01 00 00       	mov    ecx,0x149
  fb1c9c:	4c 89 ff             	mov    rdi,r15
  fb1c9f:	4c 89 f6             	mov    rsi,r14
  fb1ca2:	31 d2                	xor    edx,edx
  fb1ca4:	e8 f1 ed ff ff       	call   fb0a9a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177eb0>
  fb1ca9:	49 8b 07             	mov    rax,QWORD PTR [r15]
  fb1cac:	48 85 c0             	test   rax,rax
  fb1caf:	74 16                	je     fb1cc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1790dd>
  fb1cb1:	80 78 50 00          	cmp    BYTE PTR [rax+0x50],0x0
  fb1cb5:	74 10                	je     fb1cc7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1790dd>
  fb1cb7:	48 89 e6             	mov    rsi,rsp
  fb1cba:	48 89 df             	mov    rdi,rbx
  fb1cbd:	e8 f8 3d f6 ff       	call   f15aba <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdced0>
  fb1cc2:	e9 d7 00 00 00       	jmp    fb1d9e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1791b4>
  fb1cc7:	48 8d 7c 24 30       	lea    rdi,[rsp+0x30]
  fb1ccc:	e8 c7 34 f6 ff       	call   f15198 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdc5ae>
  fb1cd1:	48 8b 6c 24 30       	mov    rbp,QWORD PTR [rsp+0x30]
  fb1cd6:	4c 8b 74 24 38       	mov    r14,QWORD PTR [rsp+0x38]
  fb1cdb:	0f 28 44 24 30       	movaps xmm0,XMMWORD PTR [rsp+0x30]
  fb1ce0:	0f 29 44 24 20       	movaps XMMWORD PTR [rsp+0x20],xmm0
  fb1ce5:	4d 85 f6             	test   r14,r14
  fb1ce8:	74 05                	je     fb1cef <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179105>
  fb1cea:	f0 49 ff 46 10       	lock inc QWORD PTR [r14+0x10]
  fb1cef:	0f 28 44 24 10       	movaps xmm0,XMMWORD PTR [rsp+0x10]
  fb1cf4:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
  fb1cf9:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  fb1cfd:	0f 57 c0             	xorps  xmm0,xmm0
  fb1d00:	0f 29 44 24 10       	movaps XMMWORD PTR [rsp+0x10],xmm0
  fb1d05:	41 0f 29 47 10       	movaps XMMWORD PTR [r15+0x10],xmm0
  fb1d0a:	49 83 67 20 00       	and    QWORD PTR [r15+0x20],0x0
  fb1d0f:	4c 8d 64 24 40       	lea    r12,[rsp+0x40]
  fb1d14:	41 0f 29 04 24       	movaps XMMWORD PTR [r12],xmm0
  fb1d19:	49 83 64 24 10 00    	and    QWORD PTR [r12+0x10],0x0
  fb1d1f:	4c 8d 6c 24 20       	lea    r13,[rsp+0x20]
  fb1d24:	4c 89 ef             	mov    rdi,r13
  fb1d27:	4c 89 fe             	mov    rsi,r15
  fb1d2a:	31 d2                	xor    edx,edx
  fb1d2c:	e8 81 68 f7 ff       	call   f285b2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xef9c8>
  fb1d31:	4c 89 ff             	mov    rdi,r15
  fb1d34:	e8 15 1b f6 ff       	call   f1384e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xdac64>
  fb1d39:	4c 89 e7             	mov    rdi,r12
  fb1d3c:	e8 3b a2 e5 ff       	call   e0bf7c <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xd9002>
  fb1d41:	48 89 e6             	mov    rsi,rsp
  fb1d44:	4c 89 ef             	mov    rdi,r13
  fb1d47:	e8 3e a8 f8 ff       	call   f3c58a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1039a0>
  fb1d4c:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
  fb1d50:	e8 5d c7 ae ff       	call   a9e4b2 <JNI_OnUnload@@Base+0x25d7f>
  fb1d55:	31 c0                	xor    eax,eax
  fb1d57:	48 39 45 08          	cmp    QWORD PTR [rbp+0x8],rax
  fb1d5b:	75 28                	jne    fb1d85 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17919b>
  fb1d5d:	48 83 7d 00 fd       	cmp    QWORD PTR [rbp+0x0],0xfffffffffffffffd
  fb1d62:	77 21                	ja     fb1d85 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17919b>
  fb1d64:	48 8d 7d 08          	lea    rdi,[rbp+0x8]
  fb1d68:	0f 57 c0             	xorps  xmm0,xmm0
  fb1d6b:	4c 8d 7c 24 60       	lea    r15,[rsp+0x60]
  fb1d70:	41 0f 29 07          	movaps XMMWORD PTR [r15],xmm0
  fb1d74:	4c 89 fe             	mov    rsi,r15
  fb1d77:	e8 a0 7a b0 ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
  fb1d7c:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
  fb1d80:	e8 01 c7 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1d85:	48 89 2b             	mov    QWORD PTR [rbx],rbp
  fb1d88:	4c 89 73 08          	mov    QWORD PTR [rbx+0x8],r14
  fb1d8c:	4d 85 f6             	test   r14,r14
  fb1d8f:	74 05                	je     fb1d96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1791ac>
  fb1d91:	f0 49 ff 46 08       	lock inc QWORD PTR [r14+0x8]
  fb1d96:	4c 89 f7             	mov    rdi,r14
  fb1d99:	e8 e8 c6 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1d9e:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fb1da3:	e8 de c6 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1da8:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  fb1dad:	e8 d4 c6 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1db2:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1db9:	00 00 
  fb1dbb:	48 3b 84 24 90 00 00 	cmp    rax,QWORD PTR [rsp+0x90]
  fb1dc2:	00 
  fb1dc3:	75 15                	jne    fb1dda <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1791f0>
  fb1dc5:	48 89 d8             	mov    rax,rbx
  fb1dc8:	48 81 c4 98 00 00 00 	add    rsp,0x98
  fb1dcf:	5b                   	pop    rbx
  fb1dd0:	41 5c                	pop    r12
  fb1dd2:	41 5d                	pop    r13
  fb1dd4:	41 5e                	pop    r14
  fb1dd6:	41 5f                	pop    r15
  fb1dd8:	5d                   	pop    rbp
  fb1dd9:	c3                   	ret
  fb1dda:	e8 d1 dc 83 00       	call   17efab0 <__stack_chk_fail@plt>
  fb1ddf:	48 89 c7             	mov    rdi,rax
  fb1de2:	e8 be 7c ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fb1de7:	cc                   	int3
  fb1de8:	41 57                	push   r15
  fb1dea:	41 56                	push   r14
  fb1dec:	41 54                	push   r12
  fb1dee:	53                   	push   rbx
  fb1def:	48 83 ec 28          	sub    rsp,0x28
  fb1df3:	49 89 d7             	mov    r15,rdx
  fb1df6:	49 89 f6             	mov    r14,rsi
  fb1df9:	48 89 fb             	mov    rbx,rdi
  fb1dfc:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1e03:	00 00 
  fb1e05:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
  fb1e0a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1e0d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fb1e12:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1e18:	4c 8b 64 24 10       	mov    r12,QWORD PTR [rsp+0x10]
  fb1e1d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  fb1e22:	e8 5f c6 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1e27:	4d 85 e4             	test   r12,r12
  fb1e2a:	74 4b                	je     fb1e77 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17928d>
  fb1e2c:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1e2f:	48 89 e7             	mov    rdi,rsp
  fb1e32:	4c 89 f6             	mov    rsi,r14
  fb1e35:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1e3b:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
  fb1e3f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1e42:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fb1e47:	4c 89 fa             	mov    rdx,r15
  fb1e4a:	ff 90 78 01 00 00    	call   QWORD PTR [rax+0x178]
  fb1e50:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1e53:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
  fb1e58:	48 89 df             	mov    rdi,rbx
  fb1e5b:	4c 89 f6             	mov    rsi,r14
  fb1e5e:	31 d2                	xor    edx,edx
  fb1e60:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
  fb1e66:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
  fb1e6b:	e8 16 c6 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1e70:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
  fb1e75:	eb 25                	jmp    fb1e9c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1792b2>
  fb1e77:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1e7a:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
  fb1e7f:	4c 89 f6             	mov    rsi,r14
  fb1e82:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
  fb1e88:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
  fb1e8d:	48 89 df             	mov    rdi,rbx
  fb1e90:	4c 89 f6             	mov    rsi,r14
  fb1e93:	e8 f2 ec ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
  fb1e98:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fb1e9c:	e8 e5 c5 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1ea1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1ea8:	00 00 
  fb1eaa:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
  fb1eaf:	75 0f                	jne    fb1ec0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1792d6>
  fb1eb1:	48 89 d8             	mov    rax,rbx
  fb1eb4:	48 83 c4 28          	add    rsp,0x28
  fb1eb8:	5b                   	pop    rbx
  fb1eb9:	41 5c                	pop    r12
  fb1ebb:	41 5e                	pop    r14
  fb1ebd:	41 5f                	pop    r15
  fb1ebf:	c3                   	ret
  fb1ec0:	e8 eb db 83 00       	call   17efab0 <__stack_chk_fail@plt>
  fb1ec5:	48 89 c7             	mov    rdi,rax
  fb1ec8:	e8 d8 7b ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
  fb1ecd:	cc                   	int3
  fb1ece:	41 57                	push   r15
  fb1ed0:	41 56                	push   r14
  fb1ed2:	41 55                	push   r13
  fb1ed4:	41 54                	push   r12
  fb1ed6:	53                   	push   rbx
  fb1ed7:	48 83 ec 30          	sub    rsp,0x30
  fb1edb:	49 89 cf             	mov    r15,rcx
  fb1ede:	49 89 d4             	mov    r12,rdx
  fb1ee1:	49 89 f6             	mov    r14,rsi
  fb1ee4:	48 89 fb             	mov    rbx,rdi
  fb1ee7:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1eee:	00 00 
  fb1ef0:	48 89 44 24 28       	mov    QWORD PTR [rsp+0x28],rax
  fb1ef5:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1ef8:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  fb1efd:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1f03:	4c 8b 6c 24 18       	mov    r13,QWORD PTR [rsp+0x18]
  fb1f08:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  fb1f0d:	e8 74 c5 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1f12:	4d 85 ed             	test   r13,r13
  fb1f15:	74 51                	je     fb1f68 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17937e>
  fb1f17:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1f1a:	48 8d 7c 24 08       	lea    rdi,[rsp+0x8]
  fb1f1f:	4c 89 f6             	mov    rsi,r14
  fb1f22:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
  fb1f28:	48 8b 74 24 08       	mov    rsi,QWORD PTR [rsp+0x8]
  fb1f2d:	48 8b 06             	mov    rax,QWORD PTR [rsi]
  fb1f30:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  fb1f35:	4c 89 e2             	mov    rdx,r12
  fb1f38:	4c 89 f9             	mov    rcx,r15
  fb1f3b:	ff 90 80 01 00 00    	call   QWORD PTR [rax+0x180]
  fb1f41:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1f44:	48 8d 4c 24 18       	lea    rcx,[rsp+0x18]
  fb1f49:	48 89 df             	mov    rdi,rbx
  fb1f4c:	4c 89 f6             	mov    rsi,r14
  fb1f4f:	31 d2                	xor    edx,edx
  fb1f51:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
  fb1f57:	48 8b 7c 24 20       	mov    rdi,QWORD PTR [rsp+0x20]
  fb1f5c:	e8 25 c5 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1f61:	48 8b 7c 24 10       	mov    rdi,QWORD PTR [rsp+0x10]
  fb1f66:	eb 25                	jmp    fb1f8d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1793a3>
  fb1f68:	49 8b 06             	mov    rax,QWORD PTR [r14]
  fb1f6b:	48 8d 7c 24 18       	lea    rdi,[rsp+0x18]
  fb1f70:	4c 89 f6             	mov    rsi,r14
  fb1f73:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
  fb1f79:	4c 8d 74 24 18       	lea    r14,[rsp+0x18]
  fb1f7e:	48 89 df             	mov    rdi,rbx
  fb1f81:	4c 89 f6             	mov    rsi,r14
  fb1f84:	e8 01 ec ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
  fb1f89:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
  fb1f8d:	e8 f4 c4 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
  fb1f92:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
  fb1f99:	00 00 
  fb1f9b:	48 3b 44 24 28       	cmp    rax,QWORD PTR [rsp+0x28]
  fb1fa0:	75 11                	jne    fb1fb3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1793c9>
  fb1fa2:	48 89 d8             	mov    rax,rbx
  fb1fa5:	48 83 c4 30          	add    rsp,0x30
  fb1fa9:	5b                   	pop    rbx
  fb1faa:	41 5c                	pop    r12
  fb1fac:	41 5d                	pop    r13
  fb1fae:	41 5e                	pop    r14
  fb1fb0:	41 5f                	pop    r15
  fb1fb2:	c3                   	ret
  fb1fb3:	e8 f8 da 83 00       	call   17efab0 <__stack_chk_fail@plt>
  fb1fb8:	48 89 c7             	mov    rdi,rax
  fb1fbb:	e8 e5 7a ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## Direct callers / vtable refs
1660123-  fb1b2e:	48 89 d8             	mov    rax,rbx
1660124-  fb1b31:	48 81 c4 f8 00 00 00 	add    rsp,0xf8
1660125-  fb1b38:	5b                   	pop    rbx
1660126-  fb1b39:	41 5c                	pop    r12
1660127-  fb1b3b:	41 5d                	pop    r13
1660128-  fb1b3d:	41 5e                	pop    r14
1660129-  fb1b3f:	41 5f                	pop    r15
1660130-  fb1b41:	5d                   	pop    rbp
1660131-  fb1b42:	c3                   	ret
1660132-  fb1b43:	e8 68 df 83 00       	call   17efab0 <__stack_chk_fail@plt>
1660133-  fb1b48:	48 89 c7             	mov    rdi,rax
1660134-  fb1b4b:	e8 55 7f ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
1660135:  fb1b50:	41 57                	push   r15
1660136-  fb1b52:	41 56                	push   r14
1660137-  fb1b54:	41 55                	push   r13
1660138-  fb1b56:	41 54                	push   r12
1660139-  fb1b58:	53                   	push   rbx
1660140-  fb1b59:	48 83 ec 50          	sub    rsp,0x50
1660141-  fb1b5d:	49 89 cf             	mov    r15,rcx
1660142-  fb1b60:	49 89 d4             	mov    r12,rdx
1660143-  fb1b63:	49 89 f6             	mov    r14,rsi
1660144-  fb1b66:	48 89 fb             	mov    rbx,rdi
1660145-  fb1b69:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
1660146-  fb1b70:	00 00 
1660147-  fb1b72:	48 89 44 24 48       	mov    QWORD PTR [rsp+0x48],rax
1660148-  fb1b77:	48 8b 06             	mov    rax,QWORD PTR [rsi]
1660149-  fb1b7a:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
1660150-  fb1b7f:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
1660151-  fb1b85:	4c 8b 6c 24 20       	mov    r13,QWORD PTR [rsp+0x20]
1660152-  fb1b8a:	48 8b 7c 24 28       	mov    rdi,QWORD PTR [rsp+0x28]
1660153-  fb1b8f:	e8 f2 c8 ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
1660154-  fb1b94:	4d 85 ed             	test   r13,r13
1660155-  fb1b97:	74 6d                	je     fb1c06 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17901c>
