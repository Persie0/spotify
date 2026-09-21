# Skip Ad readiness discriminator provenance

Coordinate transform:
- adapter primary interface vptr 0x1841fc0 is installed at outer+0x18
- fd381a/fd38d6 receive this = outer+0x18
- adapter this+0x40 == outer+0x58
- adapter this+0x68 == outer+0x80
- therefore the +0x140 receiver is the pointer stored at outer+0x58

## Availability producer exact branch
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

## Copy/materializer fd4c34 field map
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
      fd4d26:	e8 d5 91 81 00       	call   17edf00 <_Znwm@plt>
      fd4d2b:	49 89 c6             	mov    r14,rax
      fd4d2e:	0f 57 c0             	xorps  xmm0,xmm0
      fd4d31:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fd4d35:	48 8d 05 6c 57 86 00 	lea    rax,[rip+0x86576c]        # 183a4a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc440>
      fd4d3c:	49 89 06             	mov    QWORD PTR [r14],rax
      fd4d3f:	4d 89 f4             	mov    r12,r14
      fd4d42:	49 83 c4 18          	add    r12,0x18
      fd4d46:	49 89 e5             	mov    r13,rsp
      fd4d49:	4c 89 ef             	mov    rdi,r13
      fd4d4c:	4c 89 fe             	mov    rsi,r15
      fd4d4f:	e8 30 0e f5 ff       	call   f25b84 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf9a>
      fd4d54:	4c 89 e7             	mov    rdi,r12
      fd4d57:	4c 89 ee             	mov    rsi,r13
      fd4d5a:	e8 bb 0d f5 ff       	call   f25b1a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xecf30>
      fd4d5f:	4c 89 ef             	mov    rdi,r13
      fd4d62:	e8 ab 05 f5 ff       	call   f25312 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xec728>
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

## Writes to new outer+0x58 in fd4c34 materializer
### 0xfd4cac: mov    QWORD PTR [rdx+0x58],rcx
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

### 0xfd4cd5: movups xmm0,XMMWORD PTR [r14+0x58]
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

## Constructor containing outer+0x58 store @0xefc701; FDE=(15700428, 15722027)
      efc485:	48 8d b4 24 e0 06 00 	lea    rsi,[rsp+0x6e0]
      efc48c:	00 
      efc48d:	48 8d 94 24 20 02 00 	lea    rdx,[rsp+0x220]
      efc494:	00 
      efc495:	e8 14 2e 0e 00       	call   fdf2ae <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1a66c4>
      efc49a:	49 8d 5d 20          	lea    rbx,[r13+0x20]
      efc49e:	48 8d bc 24 20 02 00 	lea    rdi,[rsp+0x220]
      efc4a5:	00 
      efc4a6:	e8 e5 19 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efc4ab:	48 8d bc 24 e0 06 00 	lea    rdi,[rsp+0x6e0]
      efc4b2:	00 
      efc4b3:	e8 d8 19 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efc4b8:	45 31 e4             	xor    r12d,r12d
      efc4bb:	45 88 a5 98 04 00 00 	mov    BYTE PTR [r13+0x498],r12b
      efc4c2:	45 88 a5 a0 04 00 00 	mov    BYTE PTR [r13+0x4a0],r12b
      efc4c9:	0f 28 84 24 e0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1e0]
      efc4d0:	00 
      efc4d1:	41 0f 11 85 a8 04 00 	movups XMMWORD PTR [r13+0x4a8],xmm0
      efc4d8:	00 
      efc4d9:	4c 89 ef             	mov    rdi,r13
      efc4dc:	48 81 c7 c0 04 00 00 	add    rdi,0x4c0
      efc4e3:	4c 8d b4 24 10 07 00 	lea    r14,[rsp+0x710]
      efc4ea:	00 
      efc4eb:	4c 89 f6             	mov    rsi,r14
      efc4ee:	e8 05 cd c8 ff       	call   b891f8 <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0xd6198>
      efc4f3:	45 88 a5 f0 04 00 00 	mov    BYTE PTR [r13+0x4f0],r12b
      efc4fa:	45 88 a5 40 05 00 00 	mov    BYTE PTR [r13+0x540],r12b
      efc501:	8a 84 24 00 01 00 00 	mov    al,BYTE PTR [rsp+0x100]
      efc508:	41 88 85 48 05 00 00 	mov    BYTE PTR [r13+0x548],al
      efc50f:	31 ff                	xor    edi,edi
      efc511:	e8 70 1f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc516:	4c 89 ff             	mov    rdi,r15
      efc519:	e8 68 1f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc51e:	4c 89 f7             	mov    rdi,r14
      efc521:	e8 44 da b7 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      efc526:	4c 8d b4 24 80 01 00 	lea    r14,[rsp+0x180]
      efc52d:	00 
      efc52e:	4c 89 f7             	mov    rdi,r14
      efc531:	48 89 de             	mov    rsi,rbx
      efc534:	4c 89 ea             	mov    rdx,r13
      efc537:	e8 c8 22 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efc53c:	31 ff                	xor    edi,edi
      efc53e:	e8 d9 1e ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efc543:	66 41 0f 6f 06       	movdqa xmm0,XMMWORD PTR [r14]
      efc548:	66 0f ef c9          	pxor   xmm1,xmm1
      efc54c:	66 41 0f 7f 0e       	movdqa XMMWORD PTR [r14],xmm1
      efc551:	4c 8b 6c 24 68       	mov    r13,QWORD PTR [rsp+0x68]
      efc556:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efc55a:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efc560:	e8 21 1f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc565:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      efc569:	e8 18 1f ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc56e:	48 8d 35 32 db 44 ff 	lea    rsi,[rip+0xffffffffff44db32]        # 34a0a7 <_ZTSSt12bad_any_cast@@Base-0x46121>
      efc575:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc57c:	00 
      efc57d:	e8 fc d4 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc582:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efc589:	00 
      efc58a:	48 8b bc 24 90 00 00 	mov    rdi,QWORD PTR [rsp+0x90]
      efc591:	00 
      efc592:	e8 f9 14 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efc597:	48 8b 9c 24 c0 00 00 	mov    rbx,QWORD PTR [rsp+0xc0]
      efc59e:	00 
      efc59f:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc5a6:	00 
      efc5a7:	e8 e4 18 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efc5ac:	48 8d 35 db e3 48 ff 	lea    rsi,[rip+0xffffffffff48e3db]        # 38a98e <_ZTSSt12bad_any_cast@@Base-0x583a>
      efc5b3:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc5ba:	00 
      efc5bb:	e8 be d4 b7 ff       	call   a79a7e <JNI_OnUnload@@Base+0x134b>
      efc5c0:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efc5c7:	00 
      efc5c8:	48 8b bc 24 e0 00 00 	mov    rdi,QWORD PTR [rsp+0xe0]
      efc5cf:	00 
      efc5d0:	e8 bb 14 f3 ff       	call   e2da90 <_ZN4asio6detail16service_registry6createINS0_23reactive_socket_serviceINS_2ip3udpEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xfab16>
      efc5d5:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc5dc:	00 
      efc5dd:	e8 ae 18 8f 00       	call   17ede90 <_ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED2Ev@plt>
      efc5e2:	48 83 3b 00          	cmp    QWORD PTR [rbx],0x0
      efc5e6:	74 36                	je     efc61e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3a34>
      efc5e8:	48 8d 15 e1 48 47 ff 	lea    rdx,[rip+0xffffffffff4748e1]        # 370ed0 <_ZTSSt12bad_any_cast@@Base-0x1f2f8>
      efc5ef:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc5f6:	00 
      efc5f7:	4c 89 ee             	mov    rsi,r13
      efc5fa:	48 89 d9             	mov    rcx,rbx
      efc5fd:	e8 e9 22 00 00       	call   efe8eb <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5d01>
      efc602:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efc609:	00 
      efc60a:	4c 89 ef             	mov    rdi,r13
      efc60d:	48 89 de             	mov    rsi,rbx
      efc610:	e8 07 d2 bb ff       	call   ab981c <_ZN4asio6detail16service_registry6createINS0_9schedulerENS_17execution_contextEEEPNS4_7serviceEPv@@Base+0x67bc>
      efc615:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efc619:	e8 68 1e ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc61e:	48 8b 5c 24 60       	mov    rbx,QWORD PTR [rsp+0x60]
      efc623:	80 bb b5 01 00 00 00 	cmp    BYTE PTR [rbx+0x1b5],0x0
      efc62a:	0f 84 3d 01 00 00    	je     efc76d <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3b83>
      efc630:	4c 8b 7b 10          	mov    r15,QWORD PTR [rbx+0x10]
      efc634:	bf 88 00 00 00       	mov    edi,0x88
      efc639:	e8 c2 18 8f 00       	call   17edf00 <_Znwm@plt>
      efc63e:	49 89 c6             	mov    r14,rax
      efc641:	66 0f ef c0          	pxor   xmm0,xmm0
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
      efc7b9:	48 85 c0             	test   rax,rax
      efc7bc:	74 05                	je     efc7c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3bd9>
      efc7be:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc7c3:	f3 41 0f 6f 45 00    	movdqu xmm0,XMMWORD PTR [r13+0x0]
      efc7c9:	49 8b 45 08          	mov    rax,QWORD PTR [r13+0x8]
      efc7cd:	48 85 c0             	test   rax,rax
      efc7d0:	74 05                	je     efc7d7 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3bed>
      efc7d2:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc7d7:	48 8d 05 ea 6d 94 00 	lea    rax,[rip+0x946dea]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      efc7de:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efc7e2:	66 0f ef c9          	pxor   xmm1,xmm1
      efc7e6:	f3 41 0f 7f 4f 28    	movdqu XMMWORD PTR [r15+0x28],xmm1
      efc7ec:	48 8d 05 35 df 93 00 	lea    rax,[rip+0x93df35]        # 183a728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc6c0>
      efc7f3:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efc7f7:	f3 41 0f 7f 47 38    	movdqu XMMWORD PTR [r15+0x38],xmm0
      efc7fd:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efc804:	48 85 ff             	test   rdi,rdi
      efc807:	74 05                	je     efc80e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3c24>
      efc809:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efc80e:	49 83 c6 18          	add    r14,0x18
      efc812:	48 8d 05 ff dc 93 00 	lea    rax,[rip+0x93dcff]        # 183a518 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc4b0>
      efc819:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efc81d:	48 8d 05 dc de 93 00 	lea    rax,[rip+0x93dedc]        # 183a700 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc698>
      efc824:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efc828:	e8 59 1c ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc82d:	48 8d 05 5c da 93 00 	lea    rax,[rip+0x93da5c]        # 183a290 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc228>
      efc834:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efc838:	48 8d 05 41 dc 93 00 	lea    rax,[rip+0x93dc41]        # 183a480 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xc418>
      efc83f:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efc843:	31 c0                	xor    eax,eax
      efc845:	41 88 47 48          	mov    BYTE PTR [r15+0x48],al
      efc849:	41 88 87 38 01 00 00 	mov    BYTE PTR [r15+0x138],al
      efc850:	66 0f 6f 84 24 90 00 	movdqa xmm0,XMMWORD PTR [rsp+0x90]
      efc857:	00 00 
      efc859:	f3 41 0f 7f 87 40 01 	movdqu XMMWORD PTR [r15+0x140],xmm0
      efc860:	00 00 
      efc862:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      efc869:	48 85 ff             	test   rdi,rdi
      efc86c:	74 05                	je     efc873 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3c89>
      efc86e:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      efc873:	31 c0                	xor    eax,eax
      efc875:	41 88 87 50 01 00 00 	mov    BYTE PTR [r15+0x150],al
      efc87c:	41 88 87 58 01 00 00 	mov    BYTE PTR [r15+0x158],al
      efc883:	41 88 87 60 01 00 00 	mov    BYTE PTR [r15+0x160],al
      efc88a:	e8 f7 1b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc88f:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]
      efc896:	00 
      efc897:	48 89 df             	mov    rdi,rbx
      efc89a:	4c 89 f6             	mov    rsi,r14
      efc89d:	4c 89 fa             	mov    rdx,r15
      efc8a0:	e8 5f 1f 00 00       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      efc8a5:	31 ff                	xor    edi,edi
      efc8a7:	e8 70 1b ba ff       	call   a9e41c <JNI_OnUnload@@Base+0x25ce9>
      efc8ac:	66 0f 6f 03          	movdqa xmm0,XMMWORD PTR [rbx]
      efc8b0:	66 0f ef c9          	pxor   xmm1,xmm1
      efc8b4:	66 0f 7f 0b          	movdqa XMMWORD PTR [rbx],xmm1
      efc8b8:	49 8b 7d 08          	mov    rdi,QWORD PTR [r13+0x8]
      efc8bc:	f3 41 0f 7f 45 00    	movdqu XMMWORD PTR [r13+0x0],xmm0
      efc8c2:	e8 bf 1b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc8c7:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
      efc8cb:	e8 b6 1b ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efc8d0:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efc8d5:	80 b8 b0 01 00 00 00 	cmp    BYTE PTR [rax+0x1b0],0x0
      efc8dc:	0f 84 52 01 00 00    	je     efca34 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc3e4a>
      efc8e2:	6a 60                	push   0x60
      efc8e4:	5f                   	pop    rdi
      efc8e5:	e8 16 16 8f 00       	call   17edf00 <_Znwm@plt>
      efc8ea:	49 89 c7             	mov    r15,rax
      efc8ed:	49 89 c6             	mov    r14,rax
      efc8f0:	66 0f ef c0          	pxor   xmm0,xmm0
      efc8f4:	f3 41 0f 7f 47 08    	movdqu XMMWORD PTR [r15+0x8],xmm0
      efc8fa:	48 8d 05 6f 9e 93 00 	lea    rax,[rip+0x939e6f]        # 1836770 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x8708>

## r15 provenance before [outer+0x58] = r15 at 0xefc701

## All r15 definitions in relevant constructor FDE
- 0xef9260: mov    r15,QWORD PTR [rcx+0x60]
- 0xef9329: mov    r15,rax
- 0xef947e: mov    r15,QWORD PTR [rax+0x200]
- 0xef94c0: mov    r15,QWORD PTR [rax+0x200]
- 0xef958e: mov    r15,rax
- 0xef9949: mov    r15,rax
- 0xef9c71: lea    r15,[rsp+0x710]
- 0xef9d23: lea    r15,[rsp+0x710]
- 0xef9e2d: lea    r15,[rsp+0x710]
- 0xef9e7c: lea    r15,[rax+0x290]
- 0xefa3a0: mov    r15,rbx
- 0xefa456: mov    r15,QWORD PTR [rsp+0xc0]
- 0xefa97d: mov    r15,rax
- 0xefac28: mov    r15,rax
- 0xefb05f: mov    r15,QWORD PTR [rsp+0x1a8]
- 0xefb1d9: mov    r15,rax
- 0xefb5a0: lea    r15,[rsp+0xac0]
- 0xefb7a5: mov    r15,r14

## All adapter-vptr materializers and outer+0x58 assignments
### FDE 0xef91cc..0xefe62b
      ef91f7:	48 8d 47 18          	lea    rax,[rdi+0x18]
      ef91fb:	0f 11 47 18          	movups XMMWORD PTR [rdi+0x18],xmm0
      ef92cc:	4c 89 78 18          	mov    QWORD PTR [rax+0x18],r15
      ef92d0:	48 89 58 20          	mov    QWORD PTR [rax+0x20],rbx
      ef92e6:	0f b7 4f 20          	movzx  ecx,WORD PTR [rdi+0x20]
      ef935f:	49 8d 6f 20          	lea    rbp,[r15+0x20]
      ef938c:	49 89 5d 20          	mov    QWORD PTR [r13+0x20],rbx
      ef9394:	66 41 0f 7f 47 20    	movdqa XMMWORD PTR [r15+0x20],xmm0
      ef93ff:	49 89 6f 20          	mov    QWORD PTR [r15+0x20],rbp
      ef9435:	48 89 49 20          	mov    QWORD PTR [rcx+0x20],rcx
      ef97cd:	4c 89 74 24 20       	mov    QWORD PTR [rsp+0x20],r14
      ef97fb:	48 c7 44 24 18 0a 00 	mov    QWORD PTR [rsp+0x18],0xa
      ef99f6:	48 89 b4 24 80 00 00 	mov    QWORD PTR [rsp+0x80],rsi
      ef9ab3:	4c 89 64 24 20       	mov    QWORD PTR [rsp+0x20],r12
      ef9ace:	48 c7 44 24 18 0a 00 	mov    QWORD PTR [rsp+0x18],0xa
      ef9bea:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9bff:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9c21:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9c35:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9c48:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9c56:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9c64:	49 83 66 58 00       	and    QWORD PTR [r14+0x58],0x0
      ef9db0:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9dc5:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9de7:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9df2:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9e05:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9e10:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9ec0:	49 89 44 24 20       	mov    QWORD PTR [r12+0x20],rax
      ef9eda:	49 83 a4 24 80 00 00 	and    QWORD PTR [r12+0x80],0x0
      ef9fb2:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa003:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa04d:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa097:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa0e1:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa12b:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa175:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa1bf:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa206:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      efa210:	f3 41 0f 7f 45 20    	movdqu XMMWORD PTR [r13+0x20],xmm0
      efa246:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efa280:	f3 41 0f 7f 46 20    	movdqu XMMWORD PTR [r14+0x20],xmm0
      efa28d:	49 89 56 18          	mov    QWORD PTR [r14+0x18],rdx
      efa2b3:	f3 41 0f 7f 86 80 00 	movdqu XMMWORD PTR [r14+0x80],xmm0
      efa303:	4d 89 66 20          	mov    QWORD PTR [r14+0x20],r12
      efa33e:	49 89 45 18          	mov    QWORD PTR [r13+0x18],rax
      efa370:	48 89 45 18          	mov    QWORD PTR [rbp+0x18],rax
      efa3ae:	48 89 53 18          	mov    QWORD PTR [rbx+0x18],rdx
      efa3b2:	4c 89 63 20          	mov    QWORD PTR [rbx+0x20],r12
      efa425:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa47f:	48 89 50 18          	mov    QWORD PTR [rax+0x18],rdx
      efa4b5:	48 8b 43 18          	mov    rax,QWORD PTR [rbx+0x18]
      efa68b:	4d 8d 67 20          	lea    r12,[r15+0x20]
      efa991:	41 0f 11 47 20       	movups XMMWORD PTR [r15+0x20],xmm0
      efa99d:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efa9e7:	41 0f 11 87 80 00 00 	movups XMMWORD PTR [r15+0x80],xmm0
      efaa22:	49 89 5f 20          	mov    QWORD PTR [r15+0x20],rbx
      efaaa9:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efaaad:	49 89 7e 20          	mov    QWORD PTR [r14+0x20],rdi
      efaab8:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      efaabc:	49 83 66 20 00       	and    QWORD PTR [r14+0x20],0x0
      efaafa:	48 89 5d 18          	mov    QWORD PTR [rbp+0x18],rbx
      efaafe:	4c 89 7d 20          	mov    QWORD PTR [rbp+0x20],r15
      efab58:	0f 11 43 18          	movups XMMWORD PTR [rbx+0x18],xmm0
      efab83:	48 8b 4b 20          	mov    rcx,QWORD PTR [rbx+0x20]
      efaba8:	48 8b 7b 20          	mov    rdi,QWORD PTR [rbx+0x20]
      efabac:	48 89 43 18          	mov    QWORD PTR [rbx+0x18],rax
      efabb0:	48 89 5b 20          	mov    QWORD PTR [rbx+0x20],rbx
      efac46:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      efac65:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
      efacbc:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efaceb:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efad0f:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efad25:	49 89 6f 58          	mov    QWORD PTR [r15+0x58],rbp
      efadd1:	4d 8d 77 20          	lea    r14,[r15+0x20]
      efb04e:	f3 0f 7f 48 18       	movdqu XMMWORD PTR [rax+0x18],xmm1
      efb23b:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efb250:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb282:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
      efb28e:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb2a1:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efb2af:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb2c7:	49 89 4f 18          	mov    QWORD PTR [r15+0x18],rcx
      efb2d3:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb2e6:	49 89 47 18          	mov    QWORD PTR [r15+0x18],rax
      efb2f4:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb30e:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
      efb33f:	49 89 87 80 00 00 00 	mov    QWORD PTR [r15+0x80],rax
      efb593:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      efb640:	48 89 4c 24 20       	mov    QWORD PTR [rsp+0x20],rcx
      efb645:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
      efb7d2:	48 89 5e 20          	mov    QWORD PTR [rsi+0x20],rbx

### FDE 0xfd47e6..0xfd4827
      fd47ed:	48 8d 05 cc d7 86 00 	lea    rax,[rip+0x86d7cc]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>

### FDE 0xfd4c04..0xfd4cff
      fd4c5a:	49 8b 4e 20          	mov    rcx,QWORD PTR [r14+0x20]
      fd4c74:	48 8d 0d 45 d3 86 00 	lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
      fd4c7b:	48 89 4a 18          	mov    QWORD PTR [rdx+0x18],rcx
      fd4c86:	48 89 4a 20          	mov    QWORD PTR [rdx+0x20],rcx
      fd4cac:	48 89 4a 58          	mov    QWORD PTR [rdx+0x58],rcx
      fd4cce:	48 89 8a 80 00 00 00 	mov    QWORD PTR [rdx+0x80],rcx
      fd4cd5:	41 0f 10 46 58       	movups xmm0,XMMWORD PTR [r14+0x58]

## Receiver-source helper calls around constructor
## If outer+0x58 is copied from a source field, direct source-field reads
### outer+0x58 store 0xef9c64: and    QWORD PTR [r14+0x58],0x0
      ef9c3c:	e8 45 48 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9c41:	48 8d 05 e0 3e 94 00 	lea    rax,[rip+0x943ee0]        # 183db28 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xfac0>
      ef9c48:	49 89 46 18          	mov    QWORD PTR [r14+0x18],rax
      ef9c4c:	48 8d 05 c5 3e 94 00 	lea    rax,[rip+0x943ec5]        # 183db18 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xfab0>
      ef9c53:	4c 01 e0             	add    rax,r12
      ef9c56:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      ef9c5a:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9c5e:	f3 41 0f 7f 46 48    	movdqu XMMWORD PTR [r14+0x48],xmm0
      ef9c64:	49 83 66 58 00       	and    QWORD PTR [r14+0x58],0x0
      ef9c69:	4c 89 ff             	mov    rdi,r15
      ef9c6c:	e8 15 48 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9c71:	4c 8d bc 24 10 07 00 	lea    r15,[rsp+0x710]

### outer+0x58 store 0xefad25: mov    QWORD PTR [r15+0x58],rbp
      efacff:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
      efad03:	e8 7e 37 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efad08:	48 8d 05 41 64 94 00 	lea    rax,[rip+0x946441]        # 1841150 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x130e8>
      efad0f:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efad13:	48 8d 05 26 64 94 00 	lea    rax,[rip+0x946426]        # 1841140 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x130d8>
      efad1a:	4c 01 f0             	add    rax,r14
      efad1d:	49 89 47 28          	mov    QWORD PTR [r15+0x28],rax
      efad21:	41 88 5f 50          	mov    BYTE PTR [r15+0x50],bl
      efad25:	49 89 6f 58          	mov    QWORD PTR [r15+0x58],rbp
      efad29:	4d 89 6f 60          	mov    QWORD PTR [r15+0x60],r13
      efad2d:	f0 49 ff 45 08       	lock inc QWORD PTR [r13+0x8]
      efad32:	4d 89 67 68          	mov    QWORD PTR [r15+0x68],r12

### outer+0x58 store 0xefb30e: movups XMMWORD PTR [r15+0x58],xmm0
      efb2ea:	48 8d 05 b7 55 94 00 	lea    rax,[rip+0x9455b7]        # 18408a8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x12840>
      efb2f1:	48 01 d8             	add    rax,rbx
      efb2f4:	49 89 47 20          	mov    QWORD PTR [r15+0x20],rax
      efb2f8:	0f 28 84 24 c0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xc0]
      efb2ff:	00 
      efb300:	41 0f 11 47 48       	movups XMMWORD PTR [r15+0x48],xmm0
      efb305:	49 83 c6 18          	add    r14,0x18
      efb309:	0f 28 44 24 70       	movaps xmm0,XMMWORD PTR [rsp+0x70]
      efb30e:	41 0f 11 47 58       	movups XMMWORD PTR [r15+0x58],xmm0
      efb313:	48 8b bc 24 d0 00 00 	mov    rdi,QWORD PTR [rsp+0xd0]
      efb31a:	00 
      efb31b:	48 85 ff             	test   rdi,rdi

### outer+0x58 store 0xfd4cac: mov    QWORD PTR [rdx+0x58],rcx
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

