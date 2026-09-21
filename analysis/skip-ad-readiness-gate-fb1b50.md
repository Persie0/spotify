# Skip Ad readiness gate fb1b50

Proven receiver AP: 0x183ba50; +0x140 relocation at 0x183bb90 -> 0xfb1b50.

## Method and adjacent helpers

/tmp/fb1b50/liborbit-jni-spotify.so:     file format elf64-x86-64


Disassembly of section .text:

0000000000fb1ac0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x178ed6>:
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
  fb1d1f:	4c                   	rex.WR

## direct refs/callers

## high/string refs from method neighborhood
