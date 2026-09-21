# Readiness secondary-interface ABI validation

Hard ABI requirement from fd384d:
- receiver is in rdi only
- call [vptr+0x140]
- immediately test eax
- therefore candidate +0x140 target must be valid as a this-only scalar-return method

## AP candidate 0x183ba50
- header[-0x10]=0x0 header[-0x8]=0x0
- +0x0: 0xfaff70 FDE=(16449392, 16449538)
- +0x8: 0xfb0002 FDE=(16449538, 16449705)
- +0x10: 0xfb00aa FDE=(16449706, 16449873)
- +0x20: 0xfb01ea FDE=(16450026, 16450178)
- +0x70: 0xfb09e0 FDE=(16452064, 16452228)
- +0x98: 0xfb296a FDE=(16460138, 16460363)
- +0x128: 0xfb17e0 FDE=(16455648, 16455943)
- +0x130: 0xfb1908 FDE=(16455944, 16456236)
- +0x138: 0xfb1a2c FDE=(16456236, 16456528)
- +0x140: 0xfb1b50 FDE=(16456528, 16456798)
- +0x148: 0xf4266e FDE=(16000622, 16004133)
### +0x140 target 0xfb1b50 body (FDE 0xfb1b50..0xfb1c5e)
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

## AP candidate 0x183bc38
- header[-0x10]=0xfffffffffffffff8 header[-0x8]=0x0
- +0x0: 0xf43bac FDE=(16006060, 16006069)
- +0x8: 0xf43bb6 FDE=(16006070, 16006079)
- +0x10: 0xf41aa6 FDE=(15997606, 15997620)
- +0x20: 0x0 FDE=None
- +0x70: 0xfb01ea FDE=(16450026, 16450178)
- +0x98: 0xfb04e6 FDE=(16450790, 16451035)
- +0x128: 0xfb2b60 FDE=(16460640, 16460665)
- +0x130: 0xfb2b7a FDE=(16460666, 16460688)
- +0x138: 0xfb2c84 FDE=(16460932, 16460954)
- +0x140: 0xfb2c9a FDE=(16460954, 16460979)
- +0x148: 0xfb2dae FDE=(16461230, 16461255)
### +0x140 target 0xfb2c9a body (FDE 0xfb2c9a..0xfb2cb3)
      fb2c9a:	53                   	push   rbx
      fb2c9b:	49 89 c8             	mov    r8,rcx
      fb2c9e:	48 89 d1             	mov    rcx,rdx
      fb2ca1:	48 89 fb             	mov    rbx,rdi
      fb2ca4:	ba f1 00 00 00       	mov    edx,0xf1
      fb2ca9:	e8 06 00 00 00       	call   fb2cb4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x17a0ca>
      fb2cae:	48 89 d8             	mov    rax,rbx
      fb2cb1:	5b                   	pop    rbx
      fb2cb2:	c3                   	ret

## AP candidate 0x183bc88
- header[-0x10]=0x0 header[-0x8]=0x0
- +0x0: 0xfaff70 FDE=(16449392, 16449538)
- +0x8: 0xfb0002 FDE=(16449538, 16449705)
- +0x10: 0xfb00aa FDE=(16449706, 16449873)
- +0x20: 0xfb01ea FDE=(16450026, 16450178)
- +0x70: 0xfb09e0 FDE=(16452064, 16452228)
- +0x98: 0xfb296a FDE=(16460138, 16460363)
- +0x128: 0xfb17e0 FDE=(16455648, 16455943)
- +0x130: 0xfb1908 FDE=(16455944, 16456236)
- +0x138: 0xfb1a2c FDE=(16456236, 16456528)
- +0x140: 0xfb1b50 FDE=(16456528, 16456798)
- +0x148: 0xfb1c5e FDE=(16456798, 16457191)
### +0x140 target 0xfb1b50 body (FDE 0xfb1b50..0xfb1c5e)
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

## AP candidate 0x183be70
- header[-0x10]=0xfffffffffffffff8 header[-0x8]=0x0
- +0x0: 0xf46a24 FDE=(16017956, 16017961)
- +0x8: 0xf46a2a FDE=(16017962, 16017971)
- +0x10: 0xf41aa6 FDE=(15997606, 15997620)
- +0x20: 0x0 FDE=None
- +0x70: 0xf46334 FDE=(16016180, 16016203)
- +0x98: 0xf462a4 FDE=(16016036, 16016051)
- +0x128: 0xf47f72 FDE=(16023410, 16023491)
- +0x130: 0xfb08b0 FDE=(16451760, 16451911)
- +0x138: 0xfb0948 FDE=(16451912, 16452063)
- +0x140: 0xfb09e0 FDE=(16452064, 16452228)
- +0x148: 0xf47fc4 FDE=(16023492, 16023513)
### +0x140 target 0xfb09e0 body (FDE 0xfb09e0..0xfb0a84)
      fb09e0:	41 56                	push   r14
      fb09e2:	53                   	push   rbx
      fb09e3:	48 83 ec 18          	sub    rsp,0x18
      fb09e7:	48 89 fb             	mov    rbx,rdi
      fb09ea:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb09f1:	00 00 
      fb09f3:	48 89 44 24 10       	mov    QWORD PTR [rsp+0x10],rax
      fb09f8:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb09fb:	49 89 e6             	mov    r14,rsp
      fb09fe:	4c 89 f7             	mov    rdi,r14
      fb0a01:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb0a07:	49 8b 36             	mov    rsi,QWORD PTR [r14]
      fb0a0a:	48 85 f6             	test   rsi,rsi
      fb0a0d:	74 15                	je     fb0a24 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177e3a>
      fb0a0f:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb0a12:	48 89 df             	mov    rdi,rbx
      fb0a15:	ff 50 70             	call   QWORD PTR [rax+0x70]
      fb0a18:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb0a1d:	e8 64 da ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb0a22:	eb 1b                	jmp    fb0a3f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177e55>
      fb0a24:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb0a29:	e8 58 da ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb0a2e:	0f 57 c0             	xorps  xmm0,xmm0
      fb0a31:	0f 11 43 10          	movups XMMWORD PTR [rbx+0x10],xmm0
      fb0a35:	0f 11 03             	movups XMMWORD PTR [rbx],xmm0
      fb0a38:	c7 43 20 00 00 80 3f 	mov    DWORD PTR [rbx+0x20],0x3f800000
      fb0a3f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb0a46:	00 00 
      fb0a48:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      fb0a4d:	75 30                	jne    fb0a7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177e95>
      fb0a4f:	48 89 d8             	mov    rax,rbx
      fb0a52:	48 83 c4 18          	add    rsp,0x18
      fb0a56:	5b                   	pop    rbx
      fb0a57:	41 5e                	pop    r14
      fb0a59:	c3                   	ret
      fb0a5a:	48 89 c3             	mov    rbx,rax
      fb0a5d:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb0a62:	e8 1f da ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb0a67:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb0a6e:	00 00 
      fb0a70:	48 3b 44 24 10       	cmp    rax,QWORD PTR [rsp+0x10]
      fb0a75:	75 08                	jne    fb0a7f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177e95>
      fb0a77:	48 89 df             	mov    rdi,rbx
      fb0a7a:	e8 51 f2 ab ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      fb0a7f:	e8 2c f0 83 00       	call   17efab0 <__stack_chk_fail@plt>

## AP candidate 0x183be98
- header[-0x10]=0x0 header[-0x8]=0x0
- +0x0: 0xefeb2e FDE=(15723310, 15723325)
- +0x8: 0xefeb3e FDE=(15723326, 15723344)
- +0x10: 0xefeb50 FDE=(15723344, 15723358)
- +0x20: 0xa50370 FDE=(10814320, 10814325)
- +0x70: 0xf462a4 FDE=(16016036, 16016051)
- +0x98: 0x0 FDE=None
- +0x128: 0xfb0708 FDE=(16451336, 16451474)
- +0x130: 0xf47fda FDE=(16023514, 16023518)
- +0x138: 0xfb0a84 FDE=(16452228, 16452250)
- +0x140: 0xfb296a FDE=(16460138, 16460363)
- +0x148: 0xf47fde FDE=(16023518, 16024959)
### +0x140 target 0xfb296a body (FDE 0xfb296a..0xfb2a4b)
      fb296a:	55                   	push   rbp
      fb296b:	41 57                	push   r15
      fb296d:	41 56                	push   r14
      fb296f:	53                   	push   rbx
      fb2970:	48 83 ec 28          	sub    rsp,0x28
      fb2974:	89 d5                	mov    ebp,edx
      fb2976:	49 89 f6             	mov    r14,rsi
      fb2979:	48 89 fb             	mov    rbx,rdi
      fb297c:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2983:	00 00 
      fb2985:	48 89 44 24 20       	mov    QWORD PTR [rsp+0x20],rax
      fb298a:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb298d:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb2992:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb2998:	4c 8b 7c 24 10       	mov    r15,QWORD PTR [rsp+0x10]
      fb299d:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29a2:	e8 df ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29a7:	4d 85 ff             	test   r15,r15
      fb29aa:	74 4a                	je     fb29f6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e0c>
      fb29ac:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29af:	48 89 e7             	mov    rdi,rsp
      fb29b2:	4c 89 f6             	mov    rsi,r14
      fb29b5:	ff 90 c0 01 00 00    	call   QWORD PTR [rax+0x1c0]
      fb29bb:	48 8b 34 24          	mov    rsi,QWORD PTR [rsp]
      fb29bf:	48 8b 06             	mov    rax,QWORD PTR [rsi]
      fb29c2:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29c7:	89 ea                	mov    edx,ebp
      fb29c9:	ff 90 98 00 00 00    	call   QWORD PTR [rax+0x98]
      fb29cf:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29d2:	48 8d 4c 24 10       	lea    rcx,[rsp+0x10]
      fb29d7:	48 89 df             	mov    rdi,rbx
      fb29da:	4c 89 f6             	mov    rsi,r14
      fb29dd:	31 d2                	xor    edx,edx
      fb29df:	ff 90 c8 01 00 00    	call   QWORD PTR [rax+0x1c8]
      fb29e5:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
      fb29ea:	e8 97 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb29ef:	48 8b 7c 24 08       	mov    rdi,QWORD PTR [rsp+0x8]
      fb29f4:	eb 25                	jmp    fb2a1b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e31>
      fb29f6:	49 8b 06             	mov    rax,QWORD PTR [r14]
      fb29f9:	48 8d 7c 24 10       	lea    rdi,[rsp+0x10]
      fb29fe:	4c 89 f6             	mov    rsi,r14
      fb2a01:	ff 90 d0 01 00 00    	call   QWORD PTR [rax+0x1d0]
      fb2a07:	4c 8d 74 24 10       	lea    r14,[rsp+0x10]
      fb2a0c:	48 89 df             	mov    rdi,rbx
      fb2a0f:	4c 89 f6             	mov    rsi,r14
      fb2a12:	e8 73 e1 ff ff       	call   fb0b8a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x177fa0>
      fb2a17:	49 8b 7e 08          	mov    rdi,QWORD PTR [r14+0x8]
      fb2a1b:	e8 66 ba ae ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fb2a20:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      fb2a27:	00 00 
      fb2a29:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      fb2a2e:	75 0e                	jne    fb2a3e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x179e54>
      fb2a30:	48 89 d8             	mov    rax,rbx
      fb2a33:	48 83 c4 28          	add    rsp,0x28
      fb2a37:	5b                   	pop    rbx
      fb2a38:	41 5e                	pop    r14
      fb2a3a:	41 5f                	pop    r15
      fb2a3c:	5d                   	pop    rbp
      fb2a3d:	c3                   	ret
      fb2a3e:	e8 6d d0 83 00       	call   17efab0 <__stack_chk_fail@plt>
      fb2a43:	48 89 c7             	mov    rdi,rax
      fb2a46:	e8 5a 70 ac ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>

## AP candidate 0x1836728
- header[-0x10]=0x0 header[-0x8]=0x0
- +0x0: 0xefeb5e FDE=(15723358, 15723377)
- +0x8: 0xefeb72 FDE=(15723378, 15723396)
- +0x10: 0xefeb84 FDE=(15723396, 15723556)
- +0x20: 0xad6470 FDE=(11363440, 11363449)
- +0x70: 0x0 FDE=None
- +0x98: 0x0 FDE=None
- +0x128: 0x0 FDE=None
- +0x130: 0x0 FDE=None
- +0x138: 0xf0239e FDE=(15737758, 15737777)
- +0x140: 0xf023b2 FDE=(15737778, 15737796)
- +0x148: 0xf023c4 FDE=(15737796, 15737848)
### +0x140 target 0xf023b2 body (FDE 0xf023b2..0xf023c4)
      f023b2:	53                   	push   rbx
      f023b3:	48 89 fb             	mov    rbx,rdi
      f023b6:	e8 e3 ff ff ff       	call   f0239e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc97b4>
      f023bb:	48 89 df             	mov    rdi,rbx
      f023be:	5b                   	pop    rbx
      f023bf:	e9 5c bb 8e 00       	jmp    17edf20 <_ZdlPv@plt>

## AP candidate 0x1841fc0
- header[-0x10]=0x0 header[-0x8]=0x0
- +0x0: 0xfaff70 FDE=(16449392, 16449538)
- +0x8: 0xfb0002 FDE=(16449538, 16449705)
- +0x10: 0xfb00aa FDE=(16449706, 16449873)
- +0x20: 0xfb01ea FDE=(16450026, 16450178)
- +0x70: 0xfd381a FDE=(16594970, 16595158)
- +0x98: 0xfb296a FDE=(16460138, 16460363)
- +0x128: 0xfd38d6 FDE=(16595158, 16595387)
- +0x130: 0xfb1908 FDE=(16455944, 16456236)
- +0x138: 0xfb1a2c FDE=(16456236, 16456528)
- +0x140: 0xfb1b50 FDE=(16456528, 16456798)
- +0x148: 0xfd39bc FDE=(16595388, 16599014)
### +0x140 target 0xfb1b50 body (FDE 0xfb1b50..0xfb1c5e)
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

## Construction window f419b4
      f419b4:	41 57                	push   r15
      f419b6:	41 56                	push   r14
      f419b8:	41 54                	push   r12
      f419ba:	53                   	push   rbx
      f419bb:	50                   	push   rax
      f419bc:	48 89 f3             	mov    rbx,rsi
      f419bf:	49 89 fe             	mov    r14,rdi
      f419c2:	66 48 0f 3a 16 c7 01 	pextrq rdi,xmm0,0x1
      f419c9:	48 85 ff             	test   rdi,rdi
      f419cc:	74 05                	je     f419d3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108de9>
      f419ce:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      f419d3:	48 8d 05 ee 1b 90 00 	lea    rax,[rip+0x901bee]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      f419da:	49 89 06             	mov    QWORD PTR [r14],rax
      f419dd:	0f 57 c9             	xorps  xmm1,xmm1
      f419e0:	41 0f 29 4e 10       	movaps XMMWORD PTR [r14+0x10],xmm1
      f419e5:	48 8d 05 74 a2 8f 00 	lea    rax,[rip+0x8fa274]        # 183bc60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbf8>
      f419ec:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      f419f0:	66 41 0f 7f 46 20    	movdqa XMMWORD PTR [r14+0x20],xmm0
      f419f6:	48 85 ff             	test   rdi,rdi
      f419f9:	74 05                	je     f41a00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108e16>
      f419fb:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      f41a00:	4d 8d 7e 08          	lea    r15,[r14+0x8]
      f41a04:	48 8d 05 7d a2 8f 00 	lea    rax,[rip+0x8fa27d]        # 183bc88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc20>
      f41a0b:	49 89 06             	mov    QWORD PTR [r14],rax
      f41a0e:	48 8d 05 63 a2 8f 00 	lea    rax,[rip+0x8fa263]        # 183bc78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc10>
      f41a15:	41 bc f8 01 00 00    	mov    r12d,0x1f8
      f41a1b:	4c 01 e0             	add    rax,r12
      f41a1e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      f41a22:	e8 5f ca b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f41a27:	48 8d 05 22 a0 8f 00 	lea    rax,[rip+0x8fa022]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f41a2e:	49 89 06             	mov    QWORD PTR [r14],rax
      f41a31:	48 8d 05 08 a0 8f 00 	lea    rax,[rip+0x8fa008]        # 183ba40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9d8>
      f41a38:	4c 01 e0             	add    rax,r12
      f41a3b:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      f41a3f:	41 c6 46 30 00       	mov    BYTE PTR [r14+0x30],0x0
      f41a44:	49 83 c6 40          	add    r14,0x40
      f41a48:	4c 89 f7             	mov    rdi,r14
      f41a4b:	48 89 de             	mov    rsi,rbx
      f41a4e:	e8 3d 88 b3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      f41a53:	48 83 c4 08          	add    rsp,0x8
      f41a57:	5b                   	pop    rbx
      f41a58:	41 5c                	pop    r12
      f41a5a:	41 5e                	pop    r14
      f41a5c:	41 5f                	pop    r15
      f41a5e:	c3                   	ret
      f41a5f:	48 89 c3             	mov    rbx,rax

## Direct materializations of candidate APs
### 0xef96a6: lea    rcx,[rip+0x9427eb]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      ef9682:	c6 84 24 00 02 00 00 	mov    BYTE PTR [rsp+0x200],0x0
      ef9689:	00 
      ef968a:	31 c0                	xor    eax,eax
      ef968c:	88 84 24 10 02 00 00 	mov    BYTE PTR [rsp+0x210],al
      ef9693:	bf 20 0c 00 00       	mov    edi,0xc20
      ef9698:	e8 63 48 8f 00       	call   17edf00 <_Znwm@plt>
      ef969d:	66 0f ef c0          	pxor   xmm0,xmm0
      ef96a1:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef96a6:	48 8d 0d eb 27 94 00 	lea    rcx,[rip+0x9427eb]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      ef96ad:	48 89 08             	mov    QWORD PTR [rax],rcx
      ef96b0:	48 8b 8c 24 b0 00 00 	mov    rcx,QWORD PTR [rsp+0xb0]
      ef96b7:	00 
      ef96b8:	48 85 c9             	test   rcx,rcx
      ef96bb:	74 1c                	je     ef96d9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0aef>
      ef96bd:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ef96c2:	4c 89 a4 24 18 07 00 	mov    QWORD PTR [rsp+0x718],r12
      ef96c9:	00 
      ef96ca:	48 89 8c 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rcx
      ef96d1:	00 
      ef96d2:	f0 48 ff 41 08       	lock inc QWORD PTR [rcx+0x8]
      ef96d7:	eb 11                	jmp    ef96ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0b00>
      ef96d9:	4c 89 a4 24 18 07 00 	mov    QWORD PTR [rsp+0x718],r12
      ef96e0:	00 

### 0xef9955: lea    rax,[rip+0x94253c]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      ef9935:	00 
      ef9936:	31 c0                	xor    eax,eax
      ef9938:	88 84 24 10 02 00 00 	mov    BYTE PTR [rsp+0x210],al
      ef993f:	bf 20 0c 00 00       	mov    edi,0xc20
      ef9944:	e8 b7 45 8f 00       	call   17edf00 <_Znwm@plt>
      ef9949:	49 89 c7             	mov    r15,rax
      ef994c:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9950:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef9955:	48 8d 05 3c 25 94 00 	lea    rax,[rip+0x94253c]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      ef995c:	49 89 07             	mov    QWORD PTR [r15],rax
      ef995f:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      ef9966:	00 
      ef9967:	48 85 c0             	test   rax,rax
      ef996a:	74 24                	je     ef9990 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0da6>
      ef996c:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef9971:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
      ef9978:	00 
      ef9979:	48 89 8c 24 18 07 00 	mov    QWORD PTR [rsp+0x718],rcx
      ef9980:	00 
      ef9981:	48 89 84 24 20 07 00 	mov    QWORD PTR [rsp+0x720],rax
      ef9988:	00 
      ef9989:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef998e:	eb 19                	jmp    ef99a9 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc0dbf>

### 0xef9cd1: lea    rax,[rip+0x9421c0]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      ef9cad:	e8 d4 47 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9cb2:	49 8b 7f 08          	mov    rdi,QWORD PTR [r15+0x8]
      ef9cb6:	e8 cb 47 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      ef9cbb:	bf 90 00 00 00       	mov    edi,0x90
      ef9cc0:	e8 3b 42 8f 00       	call   17edf00 <_Znwm@plt>
      ef9cc5:	48 89 c3             	mov    rbx,rax
      ef9cc8:	66 0f ef c0          	pxor   xmm0,xmm0
      ef9ccc:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      ef9cd1:	48 8d 05 c0 21 94 00 	lea    rax,[rip+0x9421c0]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      ef9cd8:	48 89 03             	mov    QWORD PTR [rbx],rax
      ef9cdb:	49 89 de             	mov    r14,rbx
      ef9cde:	49 83 c6 20          	add    r14,0x20
      ef9ce2:	0f 28 84 24 c0 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x1c0]
      ef9ce9:	00 
      ef9cea:	48 8b 84 24 c8 01 00 	mov    rax,QWORD PTR [rsp+0x1c8]
      ef9cf1:	00 
      ef9cf2:	48 85 c0             	test   rax,rax
      ef9cf5:	74 05                	je     ef9cfc <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc1112>
      ef9cf7:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      ef9cfc:	48 8d b4 24 b0 06 00 	lea    rsi,[rsp+0x6b0]
      ef9d03:	00 
      ef9d04:	4c 89 f7             	mov    rdi,r14
      ef9d07:	0f 29 44 24 70       	movaps XMMWORD PTR [rsp+0x70],xmm0

### 0xefac34: lea    rax,[rip+0x94125d]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efac0e:	e8 73 38 ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efac13:	48 8b 44 24 60       	mov    rax,QWORD PTR [rsp+0x60]
      efac18:	8a 98 d1 01 00 00    	mov    bl,BYTE PTR [rax+0x1d1]
      efac1e:	bf 90 0c 00 00       	mov    edi,0xc90
      efac23:	e8 d8 32 8f 00       	call   17edf00 <_Znwm@plt>
      efac28:	49 89 c7             	mov    r15,rax
      efac2b:	66 0f ef c0          	pxor   xmm0,xmm0
      efac2f:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efac34:	48 8d 05 5d 12 94 00 	lea    rax,[rip+0x94125d]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efac3b:	49 89 07             	mov    QWORD PTR [r15],rax
      efac3e:	6a 20                	push   0x20
      efac40:	5f                   	pop    rdi
      efac41:	e8 ba 32 8f 00       	call   17edf00 <_Znwm@plt>
      efac46:	48 8b b4 24 80 00 00 	mov    rsi,QWORD PTR [rsp+0x80]
      efac4d:	00 
      efac4e:	49 89 c5             	mov    r13,rax
      efac51:	66 0f ef c0          	pxor   xmm0,xmm0
      efac55:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efac5a:	48 8d 05 cf 28 90 00 	lea    rax,[rip+0x9028cf]        # 17fd530 <_ZNSt6__ndk119__shared_weak_countD2Ev@@Base+0xe25750>
      efac61:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efac65:	49 89 6d 18          	mov    QWORD PTR [r13+0x18],rbp
      efac69:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efac70:	00 

### 0xefb4e0: lea    rax,[rip+0x9409b1]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efb4c1:	00 
      efb4c2:	c6 84 24 e9 01 00 00 	mov    BYTE PTR [rsp+0x1e9],0x0
      efb4c9:	00 
      efb4ca:	bf 20 0c 00 00       	mov    edi,0xc20
      efb4cf:	e8 2c 2a 8f 00       	call   17edf00 <_Znwm@plt>
      efb4d4:	49 89 c6             	mov    r14,rax
      efb4d7:	66 0f ef c0          	pxor   xmm0,xmm0
      efb4db:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efb4e0:	48 8d 05 b1 09 94 00 	lea    rax,[rip+0x9409b1]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efb4e7:	49 89 06             	mov    QWORD PTR [r14],rax
      efb4ea:	66 0f 6f 8c 24 70 01 	movdqa xmm1,XMMWORD PTR [rsp+0x170]
      efb4f1:	00 00 
      efb4f3:	66 0f 7f 8c 24 c0 00 	movdqa XMMWORD PTR [rsp+0xc0],xmm1
      efb4fa:	00 00 
      efb4fc:	66 0f 7f 84 24 70 01 	movdqa XMMWORD PTR [rsp+0x170],xmm0
      efb503:	00 00 
      efb505:	48 8b 84 24 b0 00 00 	mov    rax,QWORD PTR [rsp+0xb0]
      efb50c:	00 
      efb50d:	48 85 c0             	test   rax,rax
      efb510:	74 24                	je     efb536 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc294c>
      efb512:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efb517:	48 8b 8c 24 a0 00 00 	mov    rcx,QWORD PTR [rsp+0xa0]
      efb51e:	00 

### 0xefb73a: lea    rbx,[rip+0x940757]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efb718:	48 8b bc 24 78 01 00 	mov    rdi,QWORD PTR [rsp+0x178]
      efb71f:	00 
      efb720:	e8 61 2d ba ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      efb725:	48 8d bc 24 c0 0a 00 	lea    rdi,[rsp+0xac0]
      efb72c:	00 
      efb72d:	48 8d b4 24 b0 06 00 	lea    rsi,[rsp+0x6b0]
      efb734:	00 
      efb735:	e8 56 eb b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efb73a:	48 8d 1d 57 07 94 00 	lea    rbx,[rip+0x940757]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efb741:	bf 90 00 00 00       	mov    edi,0x90
      efb746:	e8 b5 27 8f 00       	call   17edf00 <_Znwm@plt>
      efb74b:	49 89 c6             	mov    r14,rax
      efb74e:	66 0f ef c0          	pxor   xmm0,xmm0
      efb752:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efb757:	48 89 18             	mov    QWORD PTR [rax],rbx
      efb75a:	0f 28 84 24 90 01 00 	movaps xmm0,XMMWORD PTR [rsp+0x190]
      efb761:	00 
      efb762:	0f 29 84 24 a0 00 00 	movaps XMMWORD PTR [rsp+0xa0],xmm0
      efb769:	00 
      efb76a:	48 8b 84 24 98 01 00 	mov    rax,QWORD PTR [rsp+0x198]
      efb771:	00 
      efb772:	48 85 c0             	test   rax,rax
      efb775:	74 05                	je     efb77c <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc2b92>

### 0xefb7ac: lea    rax,[rip+0x93af75]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efb791:	48 83 a4 24 30 07 00 	and    QWORD PTR [rsp+0x730],0x0
      efb798:	00 00 
      efb79a:	6a 40                	push   0x40
      efb79c:	5f                   	pop    rdi
      efb79d:	e8 5e 27 8f 00       	call   17edf00 <_Znwm@plt>
      efb7a2:	48 89 c3             	mov    rbx,rax
      efb7a5:	4d 89 f7             	mov    r15,r14
      efb7a8:	49 83 c7 20          	add    r15,0x20
      efb7ac:	48 8d 05 75 af 93 00 	lea    rax,[rip+0x93af75]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efb7b3:	48 89 03             	mov    QWORD PTR [rbx],rax
      efb7b6:	48 89 df             	mov    rdi,rbx
      efb7b9:	48 83 c7 10          	add    rdi,0x10
      efb7bd:	48 8d b4 24 40 02 00 	lea    rsi,[rsp+0x240]
      efb7c4:	00 
      efb7c5:	e8 de 30 00 00       	call   efe8a8 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5cbe>
      efb7ca:	48 8d b4 24 10 07 00 	lea    rsi,[rsp+0x710]
      efb7d1:	00 
      efb7d2:	48 89 5e 20          	mov    QWORD PTR [rsi+0x20],rbx
      efb7d6:	4c 89 ff             	mov    rdi,r15
      efb7d9:	0f 28 84 24 a0 00 00 	movaps xmm0,XMMWORD PTR [rsp+0xa0]
      efb7e0:	00 
      efb7e1:	e8 ce 61 04 00       	call   f419b4 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108dca>
      efb7e6:	48 8d 9c 24 10 07 00 	lea    rbx,[rsp+0x710]

### 0xefc26a: lea    rax,[rip+0x93fc27]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efc242:	4c 8b b5 30 03 00 00 	mov    r14,QWORD PTR [rbp+0x330]
      efc249:	48 8b 9d 48 01 00 00 	mov    rbx,QWORD PTR [rbp+0x148]
      efc250:	bf 50 05 00 00       	mov    edi,0x550
      efc255:	e8 a6 1c 8f 00       	call   17edf00 <_Znwm@plt>
      efc25a:	49 89 c5             	mov    r13,rax
      efc25d:	48 8d 75 20          	lea    rsi,[rbp+0x20]
      efc261:	66 0f ef c0          	pxor   xmm0,xmm0
      efc265:	f3 0f 7f 40 08       	movdqu XMMWORD PTR [rax+0x8],xmm0
      efc26a:	48 8d 05 27 fc 93 00 	lea    rax,[rip+0x93fc27]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efc271:	49 89 45 00          	mov    QWORD PTR [r13+0x0],rax
      efc275:	48 8d bc 24 10 07 00 	lea    rdi,[rsp+0x710]
      efc27c:	00 
      efc27d:	e8 0e e0 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efc282:	0f 28 85 f0 02 00 00 	movaps xmm0,XMMWORD PTR [rbp+0x2f0]
      efc289:	0f 29 84 24 f0 00 00 	movaps XMMWORD PTR [rsp+0xf0],xmm0
      efc290:	00 
      efc291:	48 8b 85 f8 02 00 00 	mov    rax,QWORD PTR [rbp+0x2f8]
      efc298:	48 85 c0             	test   rax,rax
      efc29b:	74 05                	je     efc2a2 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc36b8>
      efc29d:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      efc2a2:	6a 20                	push   0x20
      efc2a4:	5f                   	pop    rdi
      efc2a5:	e8 56 1c 8f 00       	call   17edf00 <_Znwm@plt>

### 0xefc6de: lea    rax,[rip+0x9458db]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
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

### 0xefe661: lea    rax,[rip+0x93d830]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efe63f:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efe646:	00 00 
      efe648:	48 89 44 24 50       	mov    QWORD PTR [rsp+0x50],rax
      efe64d:	bf 10 01 00 00       	mov    edi,0x110
      efe652:	e8 a9 f8 8e 00       	call   17edf00 <_Znwm@plt>
      efe657:	48 89 c3             	mov    rbx,rax
      efe65a:	0f 57 c0             	xorps  xmm0,xmm0
      efe65d:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      efe661:	48 8d 05 30 d8 93 00 	lea    rax,[rip+0x93d830]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efe668:	48 89 03             	mov    QWORD PTR [rbx],rax
      efe66b:	48 8d 7c 24 20       	lea    rdi,[rsp+0x20]
      efe670:	4c 89 fe             	mov    rsi,r15
      efe673:	e8 18 bc b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efe678:	4c 8d 7b 28          	lea    r15,[rbx+0x28]
      efe67c:	0f 57 c0             	xorps  xmm0,xmm0
      efe67f:	0f 11 43 30          	movups XMMWORD PTR [rbx+0x30],xmm0
      efe683:	0f 11 43 40          	movups XMMWORD PTR [rbx+0x40],xmm0
      efe687:	48 8d 05 8a f2 93 00 	lea    rax,[rip+0x93f28a]        # 183d918 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf8b0>
      efe68e:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      efe692:	48 8d 05 6f f2 93 00 	lea    rax,[rip+0x93f26f]        # 183d908 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf8a0>
      efe699:	41 bc f8 01 00 00    	mov    r12d,0x1f8
      efe69f:	4c 01 e0             	add    rax,r12
      efe6a2:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax

### 0xefeb2e: lea    rax,[rip+0x93d363]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efeb14:	e8 e7 ff ff ff       	call   efeb00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5f16>
      efeb19:	48 89 df             	mov    rdi,rbx
      efeb1c:	5b                   	pop    rbx
      efeb1d:	e9 fe f3 8e 00       	jmp    17edf20 <_ZdlPv@plt>
      efeb22:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      efeb26:	48 83 c7 20          	add    rdi,0x20
      efeb2a:	ff 60 08             	jmp    QWORD PTR [rax+0x8]
      efeb2d:	cc                   	int3
      efeb2e:	48 8d 05 63 d3 93 00 	lea    rax,[rip+0x93d363]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      efeb35:	48 89 07             	mov    QWORD PTR [rdi],rax
      efeb38:	e9 d3 f4 8e 00       	jmp    17ee010 <_ZNSt6__ndk119__shared_weak_countD2Ev@plt>
      efeb3d:	cc                   	int3
      efeb3e:	53                   	push   rbx
      efeb3f:	48 89 fb             	mov    rbx,rdi
      efeb42:	e8 e7 ff ff ff       	call   efeb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5f44>
      efeb47:	48 89 df             	mov    rdi,rbx
      efeb4a:	5b                   	pop    rbx
      efeb4b:	e9 d0 f3 8e 00       	jmp    17edf20 <_ZdlPv@plt>
      efeb50:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      efeb54:	48 83 c7 20          	add    rdi,0x20
      efeb58:	ff a0 90 01 00 00    	jmp    QWORD PTR [rax+0x190]
      efeb5e:	48 8d 05 c3 7b 93 00 	lea    rax,[rip+0x937bc3]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efeb65:	48 89 07             	mov    QWORD PTR [rdi],rax

### 0xefeb5e: lea    rax,[rip+0x937bc3]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efeb3f:	48 89 fb             	mov    rbx,rdi
      efeb42:	e8 e7 ff ff ff       	call   efeb2e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5f44>
      efeb47:	48 89 df             	mov    rdi,rbx
      efeb4a:	5b                   	pop    rbx
      efeb4b:	e9 d0 f3 8e 00       	jmp    17edf20 <_ZdlPv@plt>
      efeb50:	48 8b 47 20          	mov    rax,QWORD PTR [rdi+0x20]
      efeb54:	48 83 c7 20          	add    rdi,0x20
      efeb58:	ff a0 90 01 00 00    	jmp    QWORD PTR [rax+0x190]
      efeb5e:	48 8d 05 c3 7b 93 00 	lea    rax,[rip+0x937bc3]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efeb65:	48 89 07             	mov    QWORD PTR [rdi],rax
      efeb68:	48 83 c7 10          	add    rdi,0x10
      efeb6c:	e9 f9 b3 b7 ff       	jmp    a79f6a <JNI_OnUnload@@Base+0x1837>
      efeb71:	cc                   	int3
      efeb72:	53                   	push   rbx
      efeb73:	48 89 fb             	mov    rbx,rdi
      efeb76:	e8 e3 ff ff ff       	call   efeb5e <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5f74>
      efeb7b:	48 89 df             	mov    rdi,rbx
      efeb7e:	5b                   	pop    rbx
      efeb7f:	e9 9c f3 8e 00       	jmp    17edf20 <_ZdlPv@plt>
      efeb84:	41 56                	push   r14
      efeb86:	53                   	push   rbx
      efeb87:	48 83 ec 28          	sub    rsp,0x28
      efeb8b:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28

### 0xefebbf: lea    rax,[rip+0x937b62]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efeb9f:	5f                   	pop    rdi
      efeba0:	e8 5b f3 8e 00       	call   17edf00 <_Znwm@plt>
      efeba5:	48 89 c3             	mov    rbx,rax
      efeba8:	48 89 04 24          	mov    QWORD PTR [rsp],rax
      efebac:	48 8d 44 24 1f       	lea    rax,[rsp+0x1f]
      efebb1:	48 89 44 24 08       	mov    QWORD PTR [rsp+0x8],rax
      efebb6:	48 c7 44 24 10 01 00 	mov    QWORD PTR [rsp+0x10],0x1
      efebbd:	00 00 
      efebbf:	48 8d 05 62 7b 93 00 	lea    rax,[rip+0x937b62]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efebc6:	48 89 03             	mov    QWORD PTR [rbx],rax
      efebc9:	48 8d 7b 10          	lea    rdi,[rbx+0x10]
      efebcd:	4c 89 f6             	mov    rsi,r14
      efebd0:	e8 bb b6 b7 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efebd5:	48 89 e7             	mov    rdi,rsp
      efebd8:	48 83 27 00          	and    QWORD PTR [rdi],0x0
      efebdc:	e8 e9 b6 b7 ff       	call   a7a2ca <JNI_OnUnload@@Base+0x1b97>
      efebe1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efebe8:	00 00 
      efebea:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      efebef:	75 2e                	jne    efec1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6035>
      efebf1:	48 89 d8             	mov    rax,rbx
      efebf4:	48 83 c4 28          	add    rsp,0x28
      efebf8:	5b                   	pop    rbx

### 0xefec28: lea    rcx,[rip+0x937af9]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efec07:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
      efec0e:	00 00 
      efec10:	48 3b 44 24 20       	cmp    rax,QWORD PTR [rsp+0x20]
      efec15:	75 08                	jne    efec1f <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc6035>
      efec17:	48 89 df             	mov    rdi,rbx
      efec1a:	e8 b1 10 b7 ff       	call   a6fcd0 <__emutls_get_address@@Base+0xa90>
      efec1f:	e8 8c 0e 8f 00       	call   17efab0 <__stack_chk_fail@plt>
      efec24:	48 8d 47 10          	lea    rax,[rdi+0x10]
      efec28:	48 8d 0d f9 7a 93 00 	lea    rcx,[rip+0x937af9]        # 1836728 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x86c0>
      efec2f:	48 89 0e             	mov    QWORD PTR [rsi],rcx
      efec32:	48 8d 7e 10          	lea    rdi,[rsi+0x10]
      efec36:	48 89 c6             	mov    rsi,rax
      efec39:	e9 52 b6 b7 ff       	jmp    a7a290 <JNI_OnUnload@@Base+0x1b5d>
      efec3e:	55                   	push   rbp
      efec3f:	41 57                	push   r15
      efec41:	41 56                	push   r14
      efec43:	41 55                	push   r13
      efec45:	41 54                	push   r12
      efec47:	53                   	push   rbx
      efec48:	48 81 ec 38 08 00 00 	sub    rsp,0x838
      efec4f:	4d 89 c7             	mov    r15,r8
      efec52:	49 89 cc             	mov    r12,rcx
      efec55:	49 89 f6             	mov    r14,rsi

### 0xf41a04: lea    rax,[rip+0x8fa27d]        # 183bc88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc20>
      f419e0:	41 0f 29 4e 10       	movaps XMMWORD PTR [r14+0x10],xmm1
      f419e5:	48 8d 05 74 a2 8f 00 	lea    rax,[rip+0x8fa274]        # 183bc60 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbf8>
      f419ec:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      f419f0:	66 41 0f 7f 46 20    	movdqa XMMWORD PTR [r14+0x20],xmm0
      f419f6:	48 85 ff             	test   rdi,rdi
      f419f9:	74 05                	je     f41a00 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108e16>
      f419fb:	f0 48 ff 47 08       	lock inc QWORD PTR [rdi+0x8]
      f41a00:	4d 8d 7e 08          	lea    r15,[r14+0x8]
      f41a04:	48 8d 05 7d a2 8f 00 	lea    rax,[rip+0x8fa27d]        # 183bc88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc20>
      f41a0b:	49 89 06             	mov    QWORD PTR [r14],rax
      f41a0e:	48 8d 05 63 a2 8f 00 	lea    rax,[rip+0x8fa263]        # 183bc78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc10>
      f41a15:	41 bc f8 01 00 00    	mov    r12d,0x1f8
      f41a1b:	4c 01 e0             	add    rax,r12
      f41a1e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      f41a22:	e8 5f ca b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f41a27:	48 8d 05 22 a0 8f 00 	lea    rax,[rip+0x8fa022]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f41a2e:	49 89 06             	mov    QWORD PTR [r14],rax
      f41a31:	48 8d 05 08 a0 8f 00 	lea    rax,[rip+0x8fa008]        # 183ba40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9d8>
      f41a38:	4c 01 e0             	add    rax,r12
      f41a3b:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      f41a3f:	41 c6 46 30 00       	mov    BYTE PTR [r14+0x30],0x0
      f41a44:	49 83 c6 40          	add    r14,0x40
      f41a48:	4c 89 f7             	mov    rdi,r14

### 0xf41a27: lea    rax,[rip+0x8fa022]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f41a00:	4d 8d 7e 08          	lea    r15,[r14+0x8]
      f41a04:	48 8d 05 7d a2 8f 00 	lea    rax,[rip+0x8fa27d]        # 183bc88 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc20>
      f41a0b:	49 89 06             	mov    QWORD PTR [r14],rax
      f41a0e:	48 8d 05 63 a2 8f 00 	lea    rax,[rip+0x8fa263]        # 183bc78 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdc10>
      f41a15:	41 bc f8 01 00 00    	mov    r12d,0x1f8
      f41a1b:	4c 01 e0             	add    rax,r12
      f41a1e:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      f41a22:	e8 5f ca b5 ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      f41a27:	48 8d 05 22 a0 8f 00 	lea    rax,[rip+0x8fa022]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f41a2e:	49 89 06             	mov    QWORD PTR [r14],rax
      f41a31:	48 8d 05 08 a0 8f 00 	lea    rax,[rip+0x8fa008]        # 183ba40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9d8>
      f41a38:	4c 01 e0             	add    rax,r12
      f41a3b:	49 89 46 08          	mov    QWORD PTR [r14+0x8],rax
      f41a3f:	41 c6 46 30 00       	mov    BYTE PTR [r14+0x30],0x0
      f41a44:	49 83 c6 40          	add    r14,0x40
      f41a48:	4c 89 f7             	mov    rdi,r14
      f41a4b:	48 89 de             	mov    rsi,rbx
      f41a4e:	e8 3d 88 b3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      f41a53:	48 83 c4 08          	add    rsp,0x8
      f41a57:	5b                   	pop    rbx
      f41a58:	41 5c                	pop    r12
      f41a5a:	41 5e                	pop    r14
      f41a5c:	41 5f                	pop    r15

### 0xf4358b: lea    rax,[rip+0x8f84be]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f43577:	41 5e                	pop    r14
      f43579:	41 5f                	pop    r15
      f4357b:	5d                   	pop    rbp
      f4357c:	c3                   	ret
      f4357d:	e8 2e c5 8a 00       	call   17efab0 <__stack_chk_fail@plt>
      f43582:	48 89 c7             	mov    rdi,rax
      f43585:	e8 1b 65 b3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      f4358a:	53                   	push   rbx
      f4358b:	48 8d 05 be 84 8f 00 	lea    rax,[rip+0x8f84be]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f43592:	48 89 07             	mov    QWORD PTR [rdi],rax
      f43595:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      f43599:	48 8d 05 98 86 8f 00 	lea    rax,[rip+0x8f8698]        # 183bc38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbd0>
      f435a0:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      f435a4:	48 83 c7 40          	add    rdi,0x40
      f435a8:	e8 bd 69 b3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f435ad:	48 89 df             	mov    rdi,rbx
      f435b0:	5b                   	pop    rbx
      f435b1:	e9 bc e4 ff ff       	jmp    f41a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108e88>
      f435b6:	53                   	push   rbx
      f435b7:	48 89 fb             	mov    rbx,rdi
      f435ba:	e8 cb ff ff ff       	call   f4358a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a9a0>
      f435bf:	48 89 df             	mov    rdi,rbx
      f435c2:	5b                   	pop    rbx

### 0xf43599: lea    rax,[rip+0x8f8698]        # 183bc38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbd0>
      f4357c:	c3                   	ret
      f4357d:	e8 2e c5 8a 00       	call   17efab0 <__stack_chk_fail@plt>
      f43582:	48 89 c7             	mov    rdi,rax
      f43585:	e8 1b 65 b3 ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      f4358a:	53                   	push   rbx
      f4358b:	48 8d 05 be 84 8f 00 	lea    rax,[rip+0x8f84be]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f43592:	48 89 07             	mov    QWORD PTR [rdi],rax
      f43595:	48 8d 5f 08          	lea    rbx,[rdi+0x8]
      f43599:	48 8d 05 98 86 8f 00 	lea    rax,[rip+0x8f8698]        # 183bc38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbd0>
      f435a0:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      f435a4:	48 83 c7 40          	add    rdi,0x40
      f435a8:	e8 bd 69 b3 ff       	call   a79f6a <JNI_OnUnload@@Base+0x1837>
      f435ad:	48 89 df             	mov    rdi,rbx
      f435b0:	5b                   	pop    rbx
      f435b1:	e9 bc e4 ff ff       	jmp    f41a72 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x108e88>
      f435b6:	53                   	push   rbx
      f435b7:	48 89 fb             	mov    rbx,rdi
      f435ba:	e8 cb ff ff ff       	call   f4358a <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10a9a0>
      f435bf:	48 89 df             	mov    rdi,rbx
      f435c2:	5b                   	pop    rbx
      f435c3:	e9 58 a9 8a 00       	jmp    17edf20 <_ZdlPv@plt>
      f435c8:	55                   	push   rbp
      f435c9:	41 57                	push   r15

### 0xf44932: lea    rax,[rip+0x8f755f]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f44917:	41 5f                	pop    r15
      f44919:	c3                   	ret
      f4491a:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      f4491e:	bf 90 00 00 00       	mov    edi,0x90
      f44923:	e8 d8 95 8a 00       	call   17edf00 <_Znwm@plt>
      f44928:	49 89 c6             	mov    r14,rax
      f4492b:	0f 57 c0             	xorps  xmm0,xmm0
      f4492e:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f44932:	48 8d 05 5f 75 8f 00 	lea    rax,[rip+0x8f755f]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f44939:	49 89 06             	mov    QWORD PTR [r14],rax
      f4493c:	41 0f 29 46 30       	movaps XMMWORD PTR [r14+0x30],xmm0
      f44941:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      f44945:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      f44949:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      f4494d:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      f44951:	48 85 c0             	test   rax,rax
      f44954:	74 05                	je     f4495b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bd71>
      f44956:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f4495b:	4d 8d 66 28          	lea    r12,[r14+0x28]
      f4495f:	48 8d 05 ea 70 8f 00 	lea    rax,[rip+0x8f70ea]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f44966:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      f4496a:	48 8d 05 c7 72 8f 00 	lea    rax,[rip+0x8f72c7]        # 183bc38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbd0>
      f44971:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax

### 0xf4495f: lea    rax,[rip+0x8f70ea]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f44941:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      f44945:	49 89 46 40          	mov    QWORD PTR [r14+0x40],rax
      f44949:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      f4494d:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      f44951:	48 85 c0             	test   rax,rax
      f44954:	74 05                	je     f4495b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bd71>
      f44956:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f4495b:	4d 8d 66 28          	lea    r12,[r14+0x28]
      f4495f:	48 8d 05 ea 70 8f 00 	lea    rax,[rip+0x8f70ea]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f44966:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      f4496a:	48 8d 05 c7 72 8f 00 	lea    rax,[rip+0x8f72c7]        # 183bc38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbd0>
      f44971:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      f44975:	41 8a 47 30          	mov    al,BYTE PTR [r15+0x30]
      f44979:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
      f4497d:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      f44981:	49 83 c7 40          	add    r15,0x40
      f44985:	4c 89 fe             	mov    rsi,r15
      f44988:	e8 03 59 b3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      f4498d:	4c 89 f6             	mov    rsi,r14
      f44990:	48 83 c6 20          	add    rsi,0x20
      f44994:	48 89 df             	mov    rdi,rbx
      f44997:	4c 89 f2             	mov    rdx,r14
      f4499a:	e8 65 9e fb ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>

### 0xf4496a: lea    rax,[rip+0x8f72c7]        # 183bc38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbd0>
      f44949:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      f4494d:	49 89 46 48          	mov    QWORD PTR [r14+0x48],rax
      f44951:	48 85 c0             	test   rax,rax
      f44954:	74 05                	je     f4495b <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x10bd71>
      f44956:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f4495b:	4d 8d 66 28          	lea    r12,[r14+0x28]
      f4495f:	48 8d 05 ea 70 8f 00 	lea    rax,[rip+0x8f70ea]        # 183ba50 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xd9e8>
      f44966:	49 89 46 20          	mov    QWORD PTR [r14+0x20],rax
      f4496a:	48 8d 05 c7 72 8f 00 	lea    rax,[rip+0x8f72c7]        # 183bc38 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xdbd0>
      f44971:	49 89 46 28          	mov    QWORD PTR [r14+0x28],rax
      f44975:	41 8a 47 30          	mov    al,BYTE PTR [r15+0x30]
      f44979:	41 88 46 50          	mov    BYTE PTR [r14+0x50],al
      f4497d:	49 8d 7e 60          	lea    rdi,[r14+0x60]
      f44981:	49 83 c7 40          	add    r15,0x40
      f44985:	4c 89 fe             	mov    rsi,r15
      f44988:	e8 03 59 b3 ff       	call   a7a290 <JNI_OnUnload@@Base+0x1b5d>
      f4498d:	4c 89 f6             	mov    rsi,r14
      f44990:	48 83 c6 20          	add    rsi,0x20
      f44994:	48 89 df             	mov    rdi,rbx
      f44997:	4c 89 f2             	mov    rdx,r14
      f4499a:	e8 65 9e fb ff       	call   efe804 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0xc5c1a>
      f4499f:	31 ff                	xor    edi,edi
      f449a1:	48 83 c4 08          	add    rsp,0x8

### 0xf4e7ac: lea    rax,[rip+0x8ed6e5]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f4e792:	5d                   	pop    rbp
      f4e793:	c3                   	ret
      f4e794:	4c 8b 7e 10          	mov    r15,QWORD PTR [rsi+0x10]
      f4e798:	bf 20 0c 00 00       	mov    edi,0xc20
      f4e79d:	e8 5e f7 89 00       	call   17edf00 <_Znwm@plt>
      f4e7a2:	48 89 c3             	mov    rbx,rax
      f4e7a5:	0f 57 c0             	xorps  xmm0,xmm0
      f4e7a8:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f4e7ac:	48 8d 05 e5 d6 8e 00 	lea    rax,[rip+0x8ed6e5]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f4e7b3:	48 89 03             	mov    QWORD PTR [rbx],rax
      f4e7b6:	48 8d 05 0b 4e 8f 00 	lea    rax,[rip+0x8f4e0b]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      f4e7bd:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f4e7c1:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
      f4e7c5:	48 8d 05 84 d9 8e 00 	lea    rax,[rip+0x8ed984]        # 183c150 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xe0e8>
      f4e7cc:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      f4e7d0:	49 8b 47 20          	mov    rax,QWORD PTR [r15+0x20]
      f4e7d4:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f4e7d8:	49 8b 47 28          	mov    rax,QWORD PTR [r15+0x28]
      f4e7dc:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f4e7e0:	48 85 c0             	test   rax,rax
      f4e7e3:	74 05                	je     f4e7ea <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x115c00>
      f4e7e5:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f4e7ea:	48 8d 05 4f d7 8e 00 	lea    rax,[rip+0x8ed74f]        # 183bf40 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xded8>

### 0xf7dd6e: lea    rax,[rip+0x8be123]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f7dd54:	5d                   	pop    rbp
      f7dd55:	c3                   	ret
      f7dd56:	48 8b 6e 10          	mov    rbp,QWORD PTR [rsi+0x10]
      f7dd5a:	bf 10 01 00 00       	mov    edi,0x110
      f7dd5f:	e8 9c 01 87 00       	call   17edf00 <_Znwm@plt>
      f7dd64:	48 89 c3             	mov    rbx,rax
      f7dd67:	0f 57 c0             	xorps  xmm0,xmm0
      f7dd6a:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f7dd6e:	48 8d 05 23 e1 8b 00 	lea    rax,[rip+0x8be123]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f7dd75:	48 89 03             	mov    QWORD PTR [rbx],rax
      f7dd78:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
      f7dd7c:	48 8b 45 20          	mov    rax,QWORD PTR [rbp+0x20]
      f7dd80:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f7dd84:	48 8b 45 28          	mov    rax,QWORD PTR [rbp+0x28]
      f7dd88:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f7dd8c:	48 85 c0             	test   rax,rax
      f7dd8f:	74 05                	je     f7dd96 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1451ac>
      f7dd91:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f7dd96:	48 8d 05 43 f9 8b 00 	lea    rax,[rip+0x8bf943]        # 183d6e0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf678>
      f7dd9d:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f7dda1:	48 8d 05 20 fb 8b 00 	lea    rax,[rip+0x8bfb20]        # 183d8c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xf860>
      f7dda8:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      f7ddac:	48 8d 7b 50          	lea    rdi,[rbx+0x50]

### 0xf8c285: lea    rax,[rip+0x8afc0c]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f8c26b:	5d                   	pop    rbp
      f8c26c:	c3                   	ret
      f8c26d:	4c 8b 76 10          	mov    r14,QWORD PTR [rsi+0x10]
      f8c271:	bf 50 05 00 00       	mov    edi,0x550
      f8c276:	e8 85 1c 86 00       	call   17edf00 <_Znwm@plt>
      f8c27b:	48 89 c3             	mov    rbx,rax
      f8c27e:	0f 57 c0             	xorps  xmm0,xmm0
      f8c281:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      f8c285:	48 8d 05 0c fc 8a 00 	lea    rax,[rip+0x8afc0c]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      f8c28c:	48 89 03             	mov    QWORD PTR [rbx],rax
      f8c28f:	48 8d 05 32 73 8b 00 	lea    rax,[rip+0x8b7332]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      f8c296:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      f8c29a:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
      f8c29e:	48 8d 05 63 23 8b 00 	lea    rax,[rip+0x8b2363]        # 183e608 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x105a0>
      f8c2a5:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      f8c2a9:	49 8b 46 20          	mov    rax,QWORD PTR [r14+0x20]
      f8c2ad:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      f8c2b1:	49 8b 46 28          	mov    rax,QWORD PTR [r14+0x28]
      f8c2b5:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      f8c2b9:	48 85 c0             	test   rax,rax
      f8c2bc:	74 05                	je     f8c2c3 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x1536d9>
      f8c2be:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      f8c2c3:	48 8d 05 26 21 8b 00 	lea    rax,[rip+0x8b2126]        # 183e3f0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x10388>

### 0xfc7cc1: lea    rax,[rip+0x8741d0]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      fc7c9f:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fc7ca4:	e9 3d 03 00 00       	jmp    fc7fe6 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f3fc>
      fc7ca9:	4c 8b 66 10          	mov    r12,QWORD PTR [rsi+0x10]
      fc7cad:	bf 90 0c 00 00       	mov    edi,0xc90
      fc7cb2:	e8 49 62 82 00       	call   17edf00 <_Znwm@plt>
      fc7cb7:	48 89 c3             	mov    rbx,rax
      fc7cba:	0f 57 c0             	xorps  xmm0,xmm0
      fc7cbd:	0f 11 40 08          	movups XMMWORD PTR [rax+0x8],xmm0
      fc7cc1:	48 8d 05 d0 41 87 00 	lea    rax,[rip+0x8741d0]        # 183be98 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0xde30>
      fc7cc8:	48 89 03             	mov    QWORD PTR [rbx],rax
      fc7ccb:	48 8d 05 f6 b8 87 00 	lea    rax,[rip+0x87b8f6]        # 18435c8 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x15560>
      fc7cd2:	48 89 43 20          	mov    QWORD PTR [rbx+0x20],rax
      fc7cd6:	0f 29 43 30          	movaps XMMWORD PTR [rbx+0x30],xmm0
      fc7cda:	48 8d 05 5f 97 87 00 	lea    rax,[rip+0x87975f]        # 1841440 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x133d8>
      fc7ce1:	48 89 43 28          	mov    QWORD PTR [rbx+0x28],rax
      fc7ce5:	49 8b 44 24 20       	mov    rax,QWORD PTR [r12+0x20]
      fc7cea:	48 89 43 40          	mov    QWORD PTR [rbx+0x40],rax
      fc7cee:	49 8b 44 24 28       	mov    rax,QWORD PTR [r12+0x28]
      fc7cf3:	48 89 43 48          	mov    QWORD PTR [rbx+0x48],rax
      fc7cf7:	48 85 c0             	test   rax,rax
      fc7cfa:	74 05                	je     fc7d01 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x18f117>
      fc7cfc:	f0 48 ff 40 08       	lock inc QWORD PTR [rax+0x8]
      fc7d01:	48 8d 05 48 94 87 00 	lea    rax,[rip+0x879448]        # 1841150 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x130e8>

### 0xfd47ed: lea    rax,[rip+0x86d7cc]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
      fd47d6:	48 89 df             	mov    rdi,rbx
      fd47d9:	e8 c7 52 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fd47de:	48 89 c7             	mov    rdi,rax
      fd47e1:	e8 bf 52 aa ff       	call   a79aa5 <JNI_OnUnload@@Base+0x1372>
      fd47e6:	41 56                	push   r14
      fd47e8:	53                   	push   rbx
      fd47e9:	50                   	push   rax
      fd47ea:	48 89 fb             	mov    rbx,rdi
      fd47ed:	48 8d 05 cc d7 86 00 	lea    rax,[rip+0x86d7cc]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
      fd47f4:	48 89 07             	mov    QWORD PTR [rdi],rax
      fd47f7:	4c 8d 77 08          	lea    r14,[rdi+0x8]
      fd47fb:	48 8d 05 ae d9 86 00 	lea    rax,[rip+0x86d9ae]        # 18421b0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x14148>
      fd4802:	48 89 47 08          	mov    QWORD PTR [rdi+0x8],rax
      fd4806:	48 8b 7f 50          	mov    rdi,QWORD PTR [rdi+0x50]
      fd480a:	e8 77 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd480f:	48 8b 7b 38          	mov    rdi,QWORD PTR [rbx+0x38]
      fd4813:	e8 6e 9c ac ff       	call   a9e486 <JNI_OnUnload@@Base+0x25d53>
      fd4818:	4c 89 f7             	mov    rdi,r14
      fd481b:	48 83 c4 08          	add    rsp,0x8
      fd481f:	5b                   	pop    rbx
      fd4820:	41 5e                	pop    r14
      fd4822:	e9 79 05 00 00       	jmp    fd4da0 <_ZN4asio6detail16service_registry6createINS0_22deadline_timer_serviceINS0_18chrono_time_traitsINSt6__ndk16chrono12steady_clockENS_11wait_traitsIS7_EEEEEENS_10io_contextEEEPNS_17execution_context7serviceEPv@@Base+0x19c1b6>
      fd4827:	cc                   	int3

### 0xfd4c74: lea    rcx,[rip+0x86d345]        # 1841fc0 <_ZTIN5boost10wrapexceptINS_17bad_function_callEEE@@Base+0x13f58>
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

